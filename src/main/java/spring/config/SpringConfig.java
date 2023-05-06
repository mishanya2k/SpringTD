package spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.Archer;
import spring.Playground;
import spring.Tower;
import spring.interfaces.ITower;

import java.util.Arrays;
import java.util.List;

@Configuration
public class SpringConfig {
    //playground
    @Bean
    Playground playground(){
        return new Playground(listOfTowers());
    }
    @Bean
    List<ITower>listOfTowers(){
        return Arrays.asList(tower1(),tower2(),tower3(),tower4());
    }
    @Bean
    Tower tower1(){
        return new Tower(1,archer1());
    }
    @Bean
    Tower tower2(){
        return new Tower(1,archer2());
    }
    @Bean
    Tower tower3(){
        return new Tower(1,archer3());
    }
    @Bean
    Tower tower4(){
        return new Tower(1,archer4());
    }

    @Bean
    Archer archer1(){
        return new Archer(1);
    }

    @Bean
    Archer archer2(){
        return new Archer(2);
    }

    @Bean
    Archer archer3(){
        return new Archer(3);
    }

    @Bean
    Archer archer4(){
        return new Archer(1);
    }

}
