package Focus;

import java.awt.Component;
import java.awt.Container;
import java.awt.FocusTraversalPolicy;

public class FocusTraversal extends FocusTraversalPolicy {

	private final Component m_Components[];

	public FocusTraversal(Component components[]) {
		m_Components = components;
	}

	private int indexCycle(int index, int delta) {

		int size = m_Components.length;
		int next = (index + delta + size) % size;
		return next;
	}

	private Component cycle(Component currentComponent, int position) {

		int index = -1;
		loop: for (int i = 0; i < m_Components.length; i++) {
			Component component = m_Components[i];
			for (Component c = currentComponent; c != null; c = c.getParent()) {
				if (component == c) {
					index = i;
					break loop;
				}
			}
		}

		int initialIndex = index;

		while (true) {

			int newIndex = indexCycle(index, position);
			if (newIndex == initialIndex) {
				break;
			}
			index = newIndex;

			Component component = m_Components[newIndex];
			if (component.isEnabled() && component.isVisible() && component.isFocusable()) {
				return component;
			}
		}
		return currentComponent;
	}

	@Override
	public Component getComponentAfter(Container container, Component component) {
		return cycle(component, 1);
	}

	@Override
	public Component getComponentBefore(Container container, Component component) {
		return cycle(component, -1);
	}

	@Override
	public Component getFirstComponent(Container container) {
		return m_Components[0];
	}

	@Override
	public Component getLastComponent(Container container) {
		return m_Components[m_Components.length - 1];
	}

	@Override
	public Component getDefaultComponent(Container container) {
		return getFirstComponent(container);
	}
}