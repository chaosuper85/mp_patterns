package com.chao.mppatterns.ActiveObject.A123b.searcher;

public class SearcherFactory {

    public static Searcher createSearcher() {
        return new SearcherImpl();
    }
}
