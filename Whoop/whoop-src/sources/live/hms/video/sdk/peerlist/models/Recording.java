package live.hms.video.sdk.peerlist.models;

import com.google.gson.annotations.SerializedName;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m65681d2 = {"Llive/hms/video/sdk/peerlist/models/Recording;", "", "sfu", "Llive/hms/video/sdk/peerlist/models/Sfu;", "browser", "Llive/hms/video/sdk/peerlist/models/Browser;", "hls", "Llive/hms/video/sdk/peerlist/models/Hls;", "<init>", "(Llive/hms/video/sdk/peerlist/models/Sfu;Llive/hms/video/sdk/peerlist/models/Browser;Llive/hms/video/sdk/peerlist/models/Hls;)V", "getSfu", "()Llive/hms/video/sdk/peerlist/models/Sfu;", "getBrowser", "()Llive/hms/video/sdk/peerlist/models/Browser;", "getHls", "()Llive/hms/video/sdk/peerlist/models/Hls;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class Recording {

    @SerializedName("browser")
    private final Browser browser;

    @SerializedName("hls")
    private final Hls hls;

    @SerializedName("sfu")
    private final Sfu sfu;

    public Recording(Sfu sfu, Browser browser, Hls hls) {
        this.sfu = sfu;
        this.browser = browser;
        this.hls = hls;
    }

    public static /* synthetic */ Recording copy$default(Recording recording, Sfu sfu, Browser browser, Hls hls, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            sfu = recording.sfu;
        }
        if ((i13 & 2) != 0) {
            browser = recording.browser;
        }
        if ((i13 & 4) != 0) {
            hls = recording.hls;
        }
        return recording.copy(sfu, browser, hls);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Sfu getSfu() {
        return this.sfu;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Browser getBrowser() {
        return this.browser;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Hls getHls() {
        return this.hls;
    }

    public final Recording copy(Sfu sfu, Browser browser, Hls hls) {
        return new Recording(sfu, browser, hls);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Recording)) {
            return false;
        }
        Recording recording = (Recording) other;
        return AbstractC22676k.m65745e(this.sfu, recording.sfu) && AbstractC22676k.m65745e(this.browser, recording.browser) && AbstractC22676k.m65745e(this.hls, recording.hls);
    }

    public final Browser getBrowser() {
        return this.browser;
    }

    public final Hls getHls() {
        return this.hls;
    }

    public final Sfu getSfu() {
        return this.sfu;
    }

    public int hashCode() {
        Sfu sfu = this.sfu;
        int iHashCode = (sfu == null ? 0 : sfu.hashCode()) * 31;
        Browser browser = this.browser;
        int iHashCode2 = (iHashCode + (browser == null ? 0 : browser.hashCode())) * 31;
        Hls hls = this.hls;
        return iHashCode2 + (hls != null ? hls.hashCode() : 0);
    }

    public String toString() {
        return "Recording(sfu=" + this.sfu + ", browser=" + this.browser + ", hls=" + this.hls + ')';
    }
}
