package br.com.application.s7ven.JsoupOrg;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class JsoupLogin {
    final String URL_LOGIN = "https://portal.fepi.br/Corpore.Net/Login.aspx?autoload=false";

    Connection.Response initial = Jsoup
            .connect(URL_LOGIN)
            .method(Connection.Method.GET).execute();

    Connection.Response login = Jsoup
            .connect(URL_LOGIN)
            .data("User","017293")
            .data("Pass","24032003")
            .cookies(initial.cookies())
            .method(Connection.Method.POST)
            .execute();

    Document page = Jsoup
            .connect("ANY_PAGE_INSIDE_THE_SITE")
            .cookies(login.cookies())
            .get();

    public JsoupLogin() throws IOException {
    }
}
