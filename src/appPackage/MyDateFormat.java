package appPackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.text.MaskFormatter;

/**
*
*/
@SuppressWarnings("serial")
public class MyDateFormat extends MaskFormatter
{
    private final SimpleDateFormat formato;

    /**
     *
     * @throws ParseException
     */
    public MyDateFormat() throws ParseException
    {
        super ("####-##-##");
        this.formato = new SimpleDateFormat("yyyy-MM-dd");
    }


    @Override
    public Object stringToValue(String text) throws ParseException
    {
        return formato.parseObject(text);
    }

    @Override
    public String valueToString(Object value) throws ParseException
    {
        if (value instanceof Date) {
            return formato.format((Date)value);
        }
        return formato.format(new Date());
    }
}
