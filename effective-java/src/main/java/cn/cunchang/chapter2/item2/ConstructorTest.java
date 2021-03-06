package cn.cunchang.chapter2.item2;

/**
 * @author cunchang
 * @date 2020/9/30 下午6:36
 */
public class ConstructorTest {

    // Telescoping constructor pattern - does not scale well!
    public class NutritionFacts {
        private final int servingSize;  // (mL)            required
        private final int servings;     // (per container) required
        private final int calories;     //                 optional
        private final int fat;          // (g)             optional
        private final int sodium;       // (mg)            optional
        private final int carbohydrate; // (g)             optional

        public NutritionFacts(int servingSize, int servings) {
            this(servingSize, servings, 0);
        }

        public NutritionFacts(int servingSize, int servings,
                              int calories) {
            this(servingSize, servings, calories, 0);
        }

        public NutritionFacts(int servingSize, int servings,
                              int calories, int fat) {
            this(servingSize, servings, calories, fat, 0);
        }

        public NutritionFacts(int servingSize, int servings,
                              int calories, int fat, int sodium) {
            this(servingSize, servings, calories, fat, sodium, 0);
        }

        public NutritionFacts(int servingSize, int servings,
                              int calories, int fat, int sodium, int carbohydrate) {
            this.servingSize  = servingSize;
            this.servings     = servings;
            this.calories     = calories;
            this.fat          = fat;
            this.sodium       = sodium;
            this.carbohydrate = carbohydrate;
        }
    }


}
