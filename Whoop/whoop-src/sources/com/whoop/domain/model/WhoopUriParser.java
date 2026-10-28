package com.whoop.domain.model;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/domain/model/WhoopUriParser;", "", "parse", "Lcom/whoop/domain/model/WhoopUri;", "deepLinkString", "", "Companion", "essentials_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface WhoopUriParser {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0006R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m65681d2 = {"Lcom/whoop/domain/model/WhoopUriParser$Companion;", "", "<init>", "()V", "parser", "Lcom/whoop/domain/model/WhoopUri;", "Lcom/whoop/domain/model/WhoopUriParser;", "essentials_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final WhoopUri parser = WhoopUri.INSTANCE.parse("https://example.com");

        private Companion() {
        }

        public final WhoopUriParser parser() {
            return parser;
        }
    }

    WhoopUri parse(String deepLinkString);
}
