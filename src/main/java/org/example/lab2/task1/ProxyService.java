package org.example.lab2.task1;

class ProxyService {
    public static void main(String[] args) {
        YouTubeVideoDownloader nativeDownloader = new YouTubeVideoDownloader(new ThirdPartyYouTubeApiClient());
        YouTubeVideoDownloader smartDownloader = new YouTubeVideoDownloader(new CacheProxyYouTubeApiClient());
        call(nativeDownloader);
        call(smartDownloader);
    }

    private static void call(YouTubeVideoDownloader downloader) {
        // User behavior in our app:
        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dancesvideoo");
        // Users might visit the same page quite often.
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("someothervid");
    }
}