package cn.cunchang.chapter2.item1;

import cn.cunchang.chapter2.item1.spi.Driver;
import cn.cunchang.chapter2.item1.spi.DriverManager;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.math.BigInteger;
import java.util.*;

/**
 * 静态工厂方法对比构造器的优势
 *
 * @author cunchang
 * @date 2020/9/29 下午7:58
 */
@Slf4j
public class StaticFactoryAdvantageTest {

    /**
     * 有名称，见名知意
     */
    @Test
    public void test_1_NameMeansMeaning() {
        Random random = new Random();
        BigInteger bigInteger = BigInteger.probablePrime(2, random);
        log.info("probablePrime:{}", bigInteger);
    }

    /**
     * 创建实例受控制的对象
     */
    @Test
    public void test_2_InstanceControlled() {
        // 1、缓存实例
        Boolean bool1 = Boolean.valueOf(true);
        Boolean bool2 = Boolean.valueOf(true);
        log.info("{}",bool1==bool2);
        Boolean bool3 = new Boolean(true);
        Boolean bool4 = new Boolean(true);
        log.info("{}",bool3==bool4);
        // 2、不可变实例
        // 无法通过set方法或者直接访问属性，修改实例内的数据
        GenderEnum male = GenderEnum.MALE;
//        male.setName("女");
//        GenderEnum.MALE.name = "女";
    }

    /**
     * 可以返回原返回类型的任何子类型的对象
     */
    @Test
    public void test_3_InterfaceBasedFramework() {
        List<String> unsafeList = new ArrayList<>();
        List<String> safeList = Collections.synchronizedList(unsafeList);
    }

    /**
     * 所返回的对象的类可以随着每次调用而发生变化，这取 决于静态工厂方法的参数值
     */
    @Test
    public void test_4_DynamicReturnObject() {
        // RegularEnumSet
        EnumSet<SmallEnum> regularEnumSet = EnumSet.allOf(SmallEnum.class);
        log.info("regularEnumSet:{}", regularEnumSet.getClass());
        // JumboEnumSet
        EnumSet<BigEnum> jumboEnumSet = EnumSet.allOf(BigEnum.class);
        log.info("jumboEnumSet:{}", jumboEnumSet.getClass());
    }

    /**
     * 方法返回的对象所属的类，在编写包含该静态工厂方 法的类时可以不存在
     */
    @Test
    public void test_5_SPI() {
        // 依赖spi-core和spi-boy/spi-gril(至少一个实现,否则会报错)
        Driver driver = DriverManager.getDriver();
        driver.getConnection();
    }


}
