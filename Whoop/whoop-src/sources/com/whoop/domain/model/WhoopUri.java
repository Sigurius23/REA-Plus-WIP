package com.whoop.domain.model;

import android.net.Uri;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\bf\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000f\u001a\u00020\u0003H&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005¨\u0006\u0011À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/domain/model/WhoopUri;", "Lcom/whoop/domain/model/WhoopUriParser;", "scheme", "", "getScheme", "()Ljava/lang/String;", "host", "getHost", "pathSegments", "", "getPathSegments", "()Ljava/util/List;", "query", "getQuery", "getQueryParameter", "key", "Companion", "essentials_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface WhoopUri extends WhoopUriParser {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u000e\u0010\u0004\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\t¨\u0006\n"}, m65681d2 = {"Lcom/whoop/domain/model/WhoopUri$Companion;", "", "<init>", "()V", "parse", "Lcom/whoop/domain/model/AndroidUri;", "uriString", "Landroid/net/Uri;", "Lcom/whoop/domain/model/WhoopUri;", "", "essentials_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final AndroidUri parse(Uri uriString) {
            if (uriString != null) {
                return new AndroidUri(uriString);
            }
            return null;
        }

        public final WhoopUri parse(String uriString) {
            AbstractC22676k.m65750j(uriString, "uriString");
            return new AndroidUri(Uri.parse(uriString));
        }
    }

    String getHost();

    List<String> getPathSegments();

    String getQuery();

    String getQueryParameter(String key);

    String getScheme();
}
