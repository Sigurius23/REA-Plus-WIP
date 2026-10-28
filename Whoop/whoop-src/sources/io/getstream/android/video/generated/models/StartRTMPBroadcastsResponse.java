package io.getstream.android.video.generated.models;

import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartRTMPBroadcastsResponse;", "", AttachmentExtensionsKt.EXTRA_DURATION, "", "(Ljava/lang/String;)V", "getDuration", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class StartRTMPBroadcastsResponse {
    private final String duration;

    public StartRTMPBroadcastsResponse(@InterfaceC30731q(name = AttachmentExtensionsKt.EXTRA_DURATION) String duration) {
        AbstractC22676k.m65750j(duration, "duration");
        this.duration = duration;
    }

    public static /* synthetic */ StartRTMPBroadcastsResponse copy$default(StartRTMPBroadcastsResponse startRTMPBroadcastsResponse, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = startRTMPBroadcastsResponse.duration;
        }
        return startRTMPBroadcastsResponse.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDuration() {
        return this.duration;
    }

    public final StartRTMPBroadcastsResponse copy(@InterfaceC30731q(name = AttachmentExtensionsKt.EXTRA_DURATION) String duration) {
        AbstractC22676k.m65750j(duration, "duration");
        return new StartRTMPBroadcastsResponse(duration);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof StartRTMPBroadcastsResponse) && AbstractC22676k.m65745e(this.duration, ((StartRTMPBroadcastsResponse) other).duration);
    }

    public final String getDuration() {
        return this.duration;
    }

    public int hashCode() {
        return this.duration.hashCode();
    }

    public String toString() {
        return AbstractC11895b.m31996o("StartRTMPBroadcastsResponse(duration=", this.duration, ")");
    }
}
