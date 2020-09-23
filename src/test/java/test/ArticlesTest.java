package test;

import api.features.articles.Articles;
import api.features.login.Login;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArticlesTest {

    @Test
    public void AT01_testArticleCount(){
        Articles articles = new Articles();
        Assert.assertEquals(articles.getArticleCount(),1,"Article count is not matching");
    }

    @Test
    public void AT02_testArticlesOnFeed(){
        Login login = new Login("newuser6@newuser.com","testpassword");
        String token = login.login();
        Articles afterLogin = new Articles(token);
        Assert.assertEquals(afterLogin.getArticleCountOnFeed(),1,"Count not matching");
    }
}
