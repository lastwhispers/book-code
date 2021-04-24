package cn.cunchang.chapter2.item2;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author cunchang
 * @date 2020/9/30 下午5:45
 */
@Slf4j
public class BuilderTest {

    @Test
    public void main() {
        NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8)
                .calories(100).sodium(35).carbo(27).build();
        System.out.println("The nutritionfacts of cocaCola \nServing Size: " + cocaCola.getServingSize() + " ml");
        System.out.println("Servings: " + cocaCola.getServings() + " per container");
        System.out.println("Calories: " + cocaCola.getCalories());
        System.out.println("Fat: " + cocaCola.getFat() + " g");
        System.out.println("Sodium: " + cocaCola.getSodium() + " mg");
        System.out.println("Carbo: " + cocaCola.getCarbo() + " g");
    }

}
