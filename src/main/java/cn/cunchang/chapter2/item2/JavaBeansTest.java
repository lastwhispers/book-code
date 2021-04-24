package cn.cunchang.chapter2.item2;

import lombok.Data;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author cunchang
 * @date 2020/9/30 下午6:36
 */
@Slf4j
public class JavaBeansTest {

    // JavaBeans Pattern - allows inconsistency, mandates mutability
    @Data
    @ToString
    public class NutritionFacts {
        // Parameters initialized to default values (if any)
        private int servingSize  = -1; // Required; no default value
        private int servings     = -1;  //     "     "      "      "
        private int calories     = 0;
        private int fat          = 0;
        private int sodium       = 0;
        private int carbohydrate = 0;

        public NutritionFacts() { }
    }

    @Test
    public void testJavaBeans(){
        NutritionFacts nutritionFacts = new NutritionFacts();
        nutritionFacts.setServingSize(240);
        nutritionFacts.setServings(8);
        nutritionFacts.setCalories(100);
        nutritionFacts.setSodium(35);
        nutritionFacts.setCarbohydrate(27);
        log.info("{}",nutritionFacts);
    }
}
