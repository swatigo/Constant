package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        System.out.print("hello");
        return ok(index.render("Your new application is ready."));


    }

}
