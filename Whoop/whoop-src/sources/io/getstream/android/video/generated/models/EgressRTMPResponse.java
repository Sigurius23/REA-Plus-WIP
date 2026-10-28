package io.getstream.android.video.generated.models;

import c13.AbstractC3855a;
import jg3.C21682i;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ<\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001f\u0010\u000b¨\u0006 "}, m65681d2 = {"Lio/getstream/android/video/generated/models/EgressRTMPResponse;", "", "", "name", "Ljg3/i;", "startedAt", "streamKey", "streamUrl", "<init>", "(Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljg3/i;", "component3", "component4", "copy", "(Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/String;)Lio/getstream/android/video/generated/models/EgressRTMPResponse;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "Ljg3/i;", "getStartedAt", "getStreamKey", "getStreamUrl", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class EgressRTMPResponse {
    private final String name;
    private final C21682i startedAt;
    private final String streamKey;
    private final String streamUrl;

    public EgressRTMPResponse(@InterfaceC30731q(name = "name") String name, @InterfaceC30731q(name = "started_at") C21682i startedAt, @InterfaceC30731q(name = "stream_key") String str, @InterfaceC30731q(name = "stream_url") String str2) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(startedAt, "startedAt");
        this.name = name;
        this.startedAt = startedAt;
        this.streamKey = str;
        this.streamUrl = str2;
    }

    public static /* synthetic */ EgressRTMPResponse copy$default(EgressRTMPResponse egressRTMPResponse, String str, C21682i c21682i, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = egressRTMPResponse.name;
        }
        if ((i13 & 2) != 0) {
            c21682i = egressRTMPResponse.startedAt;
        }
        if ((i13 & 4) != 0) {
            str2 = egressRTMPResponse.streamKey;
        }
        if ((i13 & 8) != 0) {
            str3 = egressRTMPResponse.streamUrl;
        }
        return egressRTMPResponse.copy(str, c21682i, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final C21682i getStartedAt() {
        return this.startedAt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStreamKey() {
        return this.streamKey;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStreamUrl() {
        return this.streamUrl;
    }

    public final EgressRTMPResponse copy(@InterfaceC30731q(name = "name") String name, @InterfaceC30731q(name = "started_at") C21682i startedAt, @InterfaceC30731q(name = "stream_key") String streamKey, @InterfaceC30731q(name = "stream_url") String streamUrl) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(startedAt, "startedAt");
        return new EgressRTMPResponse(name, startedAt, streamKey, streamUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EgressRTMPResponse)) {
            return false;
        }
        EgressRTMPResponse egressRTMPResponse = (EgressRTMPResponse) other;
        return AbstractC22676k.m65745e(this.name, egressRTMPResponse.name) && AbstractC22676k.m65745e(this.startedAt, egressRTMPResponse.startedAt) && AbstractC22676k.m65745e(this.streamKey, egressRTMPResponse.streamKey) && AbstractC22676k.m65745e(this.streamUrl, egressRTMPResponse.streamUrl);
    }

    public final String getName() {
        return this.name;
    }

    public final C21682i getStartedAt() {
        return this.startedAt;
    }

    public final String getStreamKey() {
        return this.streamKey;
    }

    public final String getStreamUrl() {
        return this.streamUrl;
    }

    public int hashCode() {
        int iM11822f = AbstractC3855a.m11822f(this.startedAt, this.name.hashCode() * 31, 31);
        String str = this.streamKey;
        int iHashCode = (iM11822f + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.streamUrl;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.name;
        C21682i c21682i = this.startedAt;
        return AbstractC11266d.m30464r(AbstractC30802r.m94767p("EgressRTMPResponse(name=", c21682i, str, ", startedAt=", ", streamKey="), this.streamKey, ", streamUrl=", this.streamUrl, ")");
    }

    public /* synthetic */ EgressRTMPResponse(String str, C21682i c21682i, String str2, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, c21682i, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? null : str3);
    }
}
