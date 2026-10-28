package io.getstream.chat.android.p226ui.common.utils;

import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.api.QueryParams;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/utils/GiphyInfo;", "", QueryParams.URL, "", "width", "", "height", "<init>", "(Ljava/lang/String;II)V", "getUrl", "()Ljava/lang/String;", "getWidth", "()I", "getHeight", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class GiphyInfo {
    public static final int $stable = 0;
    private final int height;
    private final String url;
    private final int width;

    public GiphyInfo(String url, int i13, int i14) {
        AbstractC22676k.m65750j(url, "url");
        this.url = url;
        this.width = i13;
        this.height = i14;
    }

    public static /* synthetic */ GiphyInfo copy$default(GiphyInfo giphyInfo, String str, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = giphyInfo.url;
        }
        if ((i15 & 2) != 0) {
            i13 = giphyInfo.width;
        }
        if ((i15 & 4) != 0) {
            i14 = giphyInfo.height;
        }
        return giphyInfo.copy(str, i13, i14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    public final GiphyInfo copy(String url, int width, int height) {
        AbstractC22676k.m65750j(url, "url");
        return new GiphyInfo(url, width, height);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GiphyInfo)) {
            return false;
        }
        GiphyInfo giphyInfo = (GiphyInfo) other;
        return AbstractC22676k.m65745e(this.url, giphyInfo.url) && this.width == giphyInfo.width && this.height == giphyInfo.height;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int hashCode() {
        return Integer.hashCode(this.height) + AbstractC11266d.m30448b(this.width, this.url.hashCode() * 31, 31);
    }

    public final String toString() {
        String str = this.url;
        int i13 = this.width;
        return AbstractC18489d0.m53371l(AbstractC11266d.m30467u(i13, "GiphyInfo(url=", str, ", width=", ", height="), this.height, ")");
    }
}
