import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");

       get("/", (request,response)->{
           Map<String, Object> model = new HashMap<>();
           return new ModelAndView(model, "index.hbs");
       }, new HandlebarsTemplateEngine());

       post("/heroes", (request,response)-> {
           Map<String, Object> model = new HashMap<>();
           String name = request.queryParams("name");
           int age = Integer.parseInt(request.queryParams("age"));
           String weakness = request.queryParams("weakness");
           String strength = request.queryParams("strength");
           Hero newHero = new Hero(name,age,weakness,strength);

           model.put("name",newHero.name);
           model.put("age",newHero.age);
           model.put("weakness",newHero.weakness);
           model.put("strength",newHero.strength);
           return new ModelAndView(model,"squad.hbs");
       },new HandlebarsTemplateEngine());
    }
}
