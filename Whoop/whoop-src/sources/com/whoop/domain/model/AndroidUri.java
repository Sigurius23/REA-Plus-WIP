package com.whoop.domain.model;

import android.net.Uri;
import java.util.List;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0015\u001a\u00020\tH\u0016J\u0010\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\tH\u0016J\n\u0010\u0018\u001a\u00020\tH\u0096\u0080\u0004J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020 HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000b¨\u0006!"}, m65681d2 = {"Lcom/whoop/domain/model/AndroidUri;", "Lcom/whoop/domain/model/WhoopUri;", "uri", "Landroid/net/Uri;", "<init>", "(Landroid/net/Uri;)V", "getUri", "()Landroid/net/Uri;", "host", "", "getHost", "()Ljava/lang/String;", "scheme", "getScheme", "pathSegments", "", "getPathSegments", "()Ljava/util/List;", "query", "getQuery", "getQueryParameter", "key", "parse", "deepLinkString", "toString", "component1", "copy", "equals", "", "other", "", "hashCode", "", "essentials_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class AndroidUri implements WhoopUri {
    private final String host;
    private final List<String> pathSegments;
    private final String query;
    private final String scheme;
    private final Uri uri;

    public AndroidUri(Uri uri) {
        AbstractC22676k.m65750j(uri, "uri");
        this.uri = uri;
        this.host = uri.getHost();
        this.scheme = uri.getScheme();
        List<String> pathSegments = uri.getPathSegments();
        this.pathSegments = pathSegments == null ? C25271y.f99162w : pathSegments;
        this.query = uri.getQuery();
    }

    public static /* synthetic */ AndroidUri copy$default(AndroidUri androidUri, Uri uri, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            uri = androidUri.uri;
        }
        return androidUri.copy(uri);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Uri getUri() {
        return this.uri;
    }

    public final AndroidUri copy(Uri uri) {
        AbstractC22676k.m65750j(uri, "uri");
        return new AndroidUri(uri);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AndroidUri) && AbstractC22676k.m65745e(this.uri, ((AndroidUri) other).uri);
    }

    @Override // com.whoop.domain.model.WhoopUri
    public String getHost() {
        return this.host;
    }

    @Override // com.whoop.domain.model.WhoopUri
    public List<String> getPathSegments() {
        return this.pathSegments;
    }

    @Override // com.whoop.domain.model.WhoopUri
    public String getQuery() {
        return this.query;
    }

    @Override // com.whoop.domain.model.WhoopUri
    public String getQueryParameter(String key) {
        AbstractC22676k.m65750j(key, "key");
        return this.uri.getQueryParameter(key);
    }

    @Override // com.whoop.domain.model.WhoopUri
    public String getScheme() {
        return this.scheme;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public int hashCode() {
        return this.uri.hashCode();
    }

    public String toString() {
        String string = this.uri.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }

    @Override // com.whoop.domain.model.WhoopUriParser
    public AndroidUri parse(String deepLinkString) {
        AbstractC22676k.m65750j(deepLinkString, "deepLinkString");
        Uri uri = Uri.parse(deepLinkString);
        AbstractC22676k.m65749i(uri, "parse(...)");
        return new AndroidUri(uri);
    }
}
