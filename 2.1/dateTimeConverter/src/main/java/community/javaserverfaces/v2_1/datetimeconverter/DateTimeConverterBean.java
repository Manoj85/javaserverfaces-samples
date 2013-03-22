package community.javaserverfaces.v2_1.datetimeconverter;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * The DateTimeConverterBean.
 */
@ManagedBean
@RequestScoped
public class DateTimeConverterBean {

    private Date date = new Date();

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
