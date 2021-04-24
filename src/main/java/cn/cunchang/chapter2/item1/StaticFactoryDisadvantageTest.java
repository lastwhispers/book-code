package cn.cunchang.chapter2.item1;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.time.Instant;

/**
 * 静态工厂方法对比构造器的缺点
 *
 * @author cunchang
 * @date 2020/9/29 下午7:58
 */
@Slf4j
public class StaticFactoryDisadvantageTest {

    /**
     * 类如果不含公有的或者受保护的构造器，就不能被子类化
     */
    @Test
    public void test_1_() {

    }

    /**
     * 在API文档中，它们没有像构造器那样在API文档中明确标识出来
     *  遵守标准的命名习惯，可以弥补这一劣势
     */
    @Test
    public void test_2_JavaDocNotSupport() throws IOException {
        // from一一类型转换方法，它只有单个参数，返回该类型的一个相对应的实例，
        Instant instant = Instant.now();
        Date date = Date.from(instant);

        // of一一聚合方法，带有多个参数，返回该类型的一个实例，把它们合并起来
        EnumSet<GenderEnum> genderEnumSet = EnumSet.of(GenderEnum.MALE, GenderEnum.FEMALE);

        // valueOf一一比 from 和 of 更烦琐的 一种替代方法
        Integer num1 = Integer.valueOf("127");

        // instance 或者 getInstance一一返回的实例是通过方法的(如有)参数来描述的，但是不能说与参数具有同样的值
        StackWalker stackWalker = StackWalker.getInstance(StackWalker.Option.RETAIN_CLASS_REFERENCE);

        // create 或者 newInstance一一象 instance 或者 getInstance 一样，
        // 但 create或者 newInstance 能够确保每次调用都返回一个新的实例
        Integer[] obj = (Integer[]) Array.newInstance(Integer.class, 10);

        // getType———— 像 getInstance一样，但是在工厂方法处于不同的类中的时候使用，
        // Type 表示工厂方法所返回的对象类型，
        Path path = null;
        FileStore fileStore = Files.getFileStore(path);

        // newType————象 newInstance 一样，但是在工厂方法处于不同的类中的时候使用
        // Type 表示工厂方法所返回的对象类型
        BufferedReader bufferedReader = Files.newBufferedReader(path);

        // type———— getType 和 newType 的简版
        Enumeration<String> e  = null;
        ArrayList<String> arrayList = Collections.list(e);
    }

    public static void main(String[] args) {
        Object obj = Array.newInstance(Integer.class, 10);
        log.info("{}",obj instanceof Integer[]);
    }
}
