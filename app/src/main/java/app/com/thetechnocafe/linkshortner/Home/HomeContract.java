package app.com.thetechnocafe.linkshortner.Home;

import java.util.List;

import app.com.thetechnocafe.linkshortner.BaseMVP;
import app.com.thetechnocafe.linkshortner.Models.UrlListModels.ShortLink;

/**
 * Created by gurleensethi on 01/03/17.
 */

public class HomeContract {
    public interface View extends BaseMVP.View {
        void requestNewToken(String token, String accountName);

        void onShortLinksReceived(List<ShortLink> shortLinks);

        void setTotalClicks(int count);

        void setTotalShortenedLinks(int count);

        void onLinkShortened(String shortUrl, String longUrl);

        void onLinkShortenError();

        void startRefreshing();

        void stopRefreshing();
    }

    public interface Presenter extends BaseMVP.Presenter<HomeContract.View> {
        void saveNewToken(String token);

        void signOut();

        void shortenUrl(String longUrl);

        void reloadLinks();
    }
}
