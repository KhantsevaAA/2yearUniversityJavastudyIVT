package org.example.lab2.task1;

import java.util.Map;

public interface YouTubeApiClient {
    Map<String, Video> popularVideos(); //отображение или говоря словарь, где каждый элемент представляет пару "ключ-значение".

    Video getVideo(String videoId);
}