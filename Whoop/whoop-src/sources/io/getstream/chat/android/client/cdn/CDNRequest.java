package io.getstream.chat.android.client.cdn;

import io.getstream.chat.android.client.api.QueryParams;
import java.util.Map;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m65681d2 = {"Lio/getstream/chat/android/client/cdn/CDNRequest;", "", QueryParams.URL, "", "headers", "", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getUrl", "()Ljava/lang/String;", "getHeaders", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class CDNRequest {
    private final Map<String, String> headers;
    private final String url;

    public CDNRequest(String url, Map<String, String> map) {
        AbstractC22676k.m65750j(url, "url");
        this.url = url;
        this.headers = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CDNRequest copy$default(CDNRequest cDNRequest, String str, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = cDNRequest.url;
        }
        if ((i13 & 2) != 0) {
            map = cDNRequest.headers;
        }
        return cDNRequest.copy(str, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final Map<String, String> component2() {
        return this.headers;
    }

    public final CDNRequest copy(String url, Map<String, String> headers) {
        AbstractC22676k.m65750j(url, "url");
        return new CDNRequest(url, headers);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CDNRequest)) {
            return false;
        }
        CDNRequest cDNRequest = (CDNRequest) other;
        return AbstractC22676k.m65745e(this.url, cDNRequest.url) && AbstractC22676k.m65745e(this.headers, cDNRequest.headers);
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        int iHashCode = this.url.hashCode() * 31;
        Map<String, String> map = this.headers;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        return AbstractC36095b.m114680h("CDNRequest(url=", this.url, ", headers=", ")", this.headers);
    }

    public /* synthetic */ CDNRequest(String str, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : map);
    }
}
