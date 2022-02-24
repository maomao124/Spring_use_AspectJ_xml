package t1;

/**
 * Project name(项目名称)：Spring使用AspectJ_xml
 * Package(包名): t1
 * Class(类名): OrderDaoImpl
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/2/24
 * Time(创建时间)： 14:23
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class OrderDaoImpl implements OrderDao
{
    @Override
    public void add()
    {
        System.out.println("正在执行 OrderDao 中的 add() 方法");
    }

    @Override
    public void delete()
    {
        System.out.println("正在执行 OrderDao 中的 delete() 方法");
    }

    @Override
    public Integer modify()
    {
        System.out.println("正在执行 OrderDao 中的 modify() 方法");
        return 1;
    }

    @Override
    public void get()
    {
        //异常
        int a = 1 / 0;
        System.out.println("正在执行 OrderDao 中的 get() 方法");
    }
}
