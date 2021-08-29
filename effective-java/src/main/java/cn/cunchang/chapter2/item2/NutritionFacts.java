package cn.cunchang.chapter2.item2;

import lombok.Data;

/**
 * @author cunchang
 * @date 2020/9/30 下午6:36
 */
@Data
public class NutritionFacts {

    // required
    private final int servingSize;
    private final int servings;

    // optional
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbo;

    public static class Builder {

        private final int servingSize;
        private final int servings;

        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbo = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val) {
            calories = val;
            return this;
        }

        public Builder fat(int val) {
            fat = val;
            return this;
        }

        public Builder sodium(int val) {
            sodium = val;
            return this;
        }

        public Builder carbo(int val) {
            carbo = val;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

    public NutritionFacts(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbo = builder.carbo;
    }


}