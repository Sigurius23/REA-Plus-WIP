package io.getstream.android.video.generated.models;

import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m65681d2 = {"Lio/getstream/android/video/generated/models/CallIngressResponse;", "", "rtmp", "Lio/getstream/android/video/generated/models/RTMPIngress;", "srt", "Lio/getstream/android/video/generated/models/SRTIngress;", "whip", "Lio/getstream/android/video/generated/models/WHIPIngress;", "(Lio/getstream/android/video/generated/models/RTMPIngress;Lio/getstream/android/video/generated/models/SRTIngress;Lio/getstream/android/video/generated/models/WHIPIngress;)V", "getRtmp", "()Lio/getstream/android/video/generated/models/RTMPIngress;", "getSrt", "()Lio/getstream/android/video/generated/models/SRTIngress;", "getWhip", "()Lio/getstream/android/video/generated/models/WHIPIngress;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class CallIngressResponse {
    private final RTMPIngress rtmp;
    private final SRTIngress srt;
    private final WHIPIngress whip;

    public CallIngressResponse(@InterfaceC30731q(name = "rtmp") RTMPIngress rtmp, @InterfaceC30731q(name = "srt") SRTIngress srt, @InterfaceC30731q(name = "whip") WHIPIngress whip) {
        AbstractC22676k.m65750j(rtmp, "rtmp");
        AbstractC22676k.m65750j(srt, "srt");
        AbstractC22676k.m65750j(whip, "whip");
        this.rtmp = rtmp;
        this.srt = srt;
        this.whip = whip;
    }

    public static /* synthetic */ CallIngressResponse copy$default(CallIngressResponse callIngressResponse, RTMPIngress rTMPIngress, SRTIngress sRTIngress, WHIPIngress wHIPIngress, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            rTMPIngress = callIngressResponse.rtmp;
        }
        if ((i13 & 2) != 0) {
            sRTIngress = callIngressResponse.srt;
        }
        if ((i13 & 4) != 0) {
            wHIPIngress = callIngressResponse.whip;
        }
        return callIngressResponse.copy(rTMPIngress, sRTIngress, wHIPIngress);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final RTMPIngress getRtmp() {
        return this.rtmp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SRTIngress getSrt() {
        return this.srt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final WHIPIngress getWhip() {
        return this.whip;
    }

    public final CallIngressResponse copy(@InterfaceC30731q(name = "rtmp") RTMPIngress rtmp, @InterfaceC30731q(name = "srt") SRTIngress srt, @InterfaceC30731q(name = "whip") WHIPIngress whip) {
        AbstractC22676k.m65750j(rtmp, "rtmp");
        AbstractC22676k.m65750j(srt, "srt");
        AbstractC22676k.m65750j(whip, "whip");
        return new CallIngressResponse(rtmp, srt, whip);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallIngressResponse)) {
            return false;
        }
        CallIngressResponse callIngressResponse = (CallIngressResponse) other;
        return AbstractC22676k.m65745e(this.rtmp, callIngressResponse.rtmp) && AbstractC22676k.m65745e(this.srt, callIngressResponse.srt) && AbstractC22676k.m65745e(this.whip, callIngressResponse.whip);
    }

    public final RTMPIngress getRtmp() {
        return this.rtmp;
    }

    public final SRTIngress getSrt() {
        return this.srt;
    }

    public final WHIPIngress getWhip() {
        return this.whip;
    }

    public int hashCode() {
        return this.whip.hashCode() + ((this.srt.hashCode() + (this.rtmp.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "CallIngressResponse(rtmp=" + this.rtmp + ", srt=" + this.srt + ", whip=" + this.whip + ")";
    }
}
