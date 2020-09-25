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
        afterLogin.setLimit(10);
        afterLogin.fetchResponse();
        Assert.assertEquals(afterLogin.getArticleCountOnFeed(), 1, afterLogin.responseString());
    }
}
