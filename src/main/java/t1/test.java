package t1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Project name(项目名称)：Spring使用AspectJ_xml
 * Package(包名): t1
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/2/24
 * Time(创建时间)： 14:37
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        OrderDao orderDao = context.getBean("orderDao", OrderDao.class);
        orderDao.add();
        orderDao.delete();
        orderDao.modify();
        orderDao.get();
    }
}
