package live.hms.video.whiteboard;

import io.getstream.chat.android.client.api.QueryParams;
import live.hms.video.sdk.models.HMSPeer;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003JI\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, m65681d2 = {"Llive/hms/video/whiteboard/HMSWhiteboard;", "", "id", "", "title", "owner", "Llive/hms/video/sdk/models/HMSPeer;", "isOwner", "", QueryParams.URL, "state", "Llive/hms/video/whiteboard/State;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/HMSPeer;ZLjava/lang/String;Llive/hms/video/whiteboard/State;)V", "getId", "()Ljava/lang/String;", "getTitle", "getOwner", "()Llive/hms/video/sdk/models/HMSPeer;", "()Z", "getUrl", "getState", "()Llive/hms/video/whiteboard/State;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HMSWhiteboard {
    private final String id;
    private final boolean isOwner;
    private final HMSPeer owner;
    private final State state;
    private final String title;
    private final String url;

    public HMSWhiteboard(String id4, String str, HMSPeer hMSPeer, boolean z4, String url, State state) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(url, "url");
        AbstractC22676k.m65750j(state, "state");
        this.id = id4;
        this.title = str;
        this.owner = hMSPeer;
        this.isOwner = z4;
        this.url = url;
        this.state = state;
    }

    public static /* synthetic */ HMSWhiteboard copy$default(HMSWhiteboard hMSWhiteboard, String str, String str2, HMSPeer hMSPeer, boolean z4, String str3, State state, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = hMSWhiteboard.id;
        }
        if ((i13 & 2) != 0) {
            str2 = hMSWhiteboard.title;
        }
        if ((i13 & 4) != 0) {
            hMSPeer = hMSWhiteboard.owner;
        }
        if ((i13 & 8) != 0) {
            z4 = hMSWhiteboard.isOwner;
        }
        if ((i13 & 16) != 0) {
            str3 = hMSWhiteboard.url;
        }
        if ((i13 & 32) != 0) {
            state = hMSWhiteboard.state;
        }
        String str4 = str3;
        State state2 = state;
        return hMSWhiteboard.copy(str, str2, hMSPeer, z4, str4, state2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final HMSPeer getOwner() {
        return this.owner;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsOwner() {
        return this.isOwner;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final State getState() {
        return this.state;
    }

    public final HMSWhiteboard copy(String id4, String title, HMSPeer owner, boolean isOwner, String url, State state) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(url, "url");
        AbstractC22676k.m65750j(state, "state");
        return new HMSWhiteboard(id4, title, owner, isOwner, url, state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMSWhiteboard)) {
            return false;
        }
        HMSWhiteboard hMSWhiteboard = (HMSWhiteboard) other;
        return AbstractC22676k.m65745e(this.id, hMSWhiteboard.id) && AbstractC22676k.m65745e(this.title, hMSWhiteboard.title) && AbstractC22676k.m65745e(this.owner, hMSWhiteboard.owner) && this.isOwner == hMSWhiteboard.isOwner && AbstractC22676k.m65745e(this.url, hMSWhiteboard.url) && this.state == hMSWhiteboard.state;
    }

    public final String getId() {
        return this.id;
    }

    public final HMSPeer getOwner() {
        return this.owner;
    }

    public final State getState() {
        return this.state;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        HMSPeer hMSPeer = this.owner;
        return this.state.hashCode() + AbstractC11266d.m30450d(AbstractC2875y.m8289b((iHashCode2 + (hMSPeer != null ? hMSPeer.hashCode() : 0)) * 31, 31, this.isOwner), 31, this.url);
    }

    public final boolean isOwner() {
        return this.isOwner;
    }

    public String toString() {
        return "HMSWhiteboard(id=" + this.id + ", title=" + this.title + ", owner=" + this.owner + ", isOwner=" + this.isOwner + ", url=" + this.url + ", state=" + this.state + ')';
    }

    public /* synthetic */ HMSWhiteboard(String str, String str2, HMSPeer hMSPeer, boolean z4, String str3, State state, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : hMSPeer, z4, str3, (i13 & 32) != 0 ? State.Stopped : state);
    }
}
