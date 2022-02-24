package t1;

/**
 * Project name(项目名称)：Spring使用AspectJ_xml
 * Package(包名): t1
 * Interface(接口名): OrderDao
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/2/24
 * Time(创建时间)： 14:23
 * Version(版本): 1.0
 * Description(描述)： 无
 */
public interface OrderDao
{
    /**
     * Add.
     */
    public void add();

    /**
     * Delete.
     */
    public void delete();

    /**
     * Modify integer.
     *
     * @return the integer
     */
    public Integer modify();

    /**
     * Get.
     */
    public void get();
}
