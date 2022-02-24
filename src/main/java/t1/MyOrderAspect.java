package t1;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Project name(项目名称)：Spring使用AspectJ_xml
 * Package(包名): t1
 * Class(类名): MyOrderAspect
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/2/24
 * Time(创建时间)： 14:24
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class MyOrderAspect
{
    public void before()
    {
        System.out.println("前置增强……");
    }

    public void after()
    {
        System.out.println("最终增强……");
    }

    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable
    {
        System.out.println("环绕增强---前……");
        proceedingJoinPoint.proceed();
        System.out.println("环绕增强---后……");
    }

    public void afterThrow(Throwable exception)
    {
        System.out.println("异常增强…… 异常信息为：" + exception.getMessage());
    }

    public void afterReturning(Object returnValue)
    {
        System.out.println("后置返回增强…… 方法返回值为：" + returnValue);
    }
}
