import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.staticFileLocation;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");

       get("/", (request,response)->{
           Map<String, Object> model = new HashMap<>();
           return new ModelAndView(model, "index.hbs");
       }, new HandlebarsTemplateEngine());

       get("/heroes", (request,response)-> {
           Map<String, Object> model = new HashMap<>();
           String name = request.queryParams("name");
           String age = request.queryParams("age");
           String weakness = request.queryParams("weakness");
           String strength = request.queryParams("strength");

           model.put("name",name);
           model.put("age",age);
           model.put("weakness",weakness);
           model.put("strength",strength);
           return new ModelAndView(model,"squad.hbs");
       },new HandlebarsTemplateEngine());
    }
}
