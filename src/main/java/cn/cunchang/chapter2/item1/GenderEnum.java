package cn.cunchang.chapter2.item1;

/**
 * 不可变型的枚举类
 * @author cunchang
 */
public enum GenderEnum {
    // 此处的枚举值必须调用对应的构造器来创建
    MALE("男"),
    FEMALE("女"),

    ;

    // 或者，使用下面两个语句代替上面语句
    // public static final Gender MALE = new Gender("男");
    // public static final Gender FEMALE = new Gender("女");

    public final String name;

    /**
     * 枚举类的构造器只能使用private修饰，以使其不可变
     * @param name
     */
    private GenderEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }


}
