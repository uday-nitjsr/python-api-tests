package test;

import api.features.articles.Articles;
import api.features.users.login.Login;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ArticlesTest {
    Login login;
    String token;
    Articles afterLogin;

    @BeforeClass
    public void Login(){
        login = new Login("newuser6@newuser.com", "testpassword");
        token = login.login();
        afterLogin = new Articles(token);
    }

    @Test
    public void AT02_testArticlesOnFeed() {
        afterLogin.fetchResponse();
        Assert.assertEquals(afterLogin.getArticleCountOnFeed(), 1, "Count not matching");
    }

    @Test
    public void AT03_testArticleOnFeedWithCustomLimit() {
        Login login = new Login("newuser6@newuser.com", "testpassword");
        String token = login.login();
        Articles afterLogin = new Articles(token);
        afterLogin.setLimit(10);
        afterLogin.fetchResponse();
        
        System.out.println(afterLogin.responseString());
        Assert.assertEquals(afterLogin.getArticleCountOnFeed(), 1, afterLogin.responseString());
    }

    @Test
    public void AT04_testArticleOnFeedWithIncorrectLimit(){
        Login login = new Login("newuser6@newuser.com", "testpassword");
        String token = login.login();
        Articles afterLogin2 = new Articles(token);
        afterLogin2.setLimit(0);
        afterLogin2.setOffset(10);
        afterLogin2.fetchResponse();

        System.out.println(afterLogin2.responseString());
        Assert.assertEquals(afterLogin2.getArticleCountOnFeed(), 1, afterLogin2.responseString());
    }
}
