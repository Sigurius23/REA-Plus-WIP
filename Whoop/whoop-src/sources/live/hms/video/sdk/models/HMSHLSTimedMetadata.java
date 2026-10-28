package live.hms.video.sdk.models;

import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSHLSTimedMetadata;", "", "payload", "", AttachmentExtensionsKt.EXTRA_DURATION, "", "<init>", "(Ljava/lang/String;J)V", "getPayload", "()Ljava/lang/String;", "getDuration", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HMSHLSTimedMetadata {
    private final long duration;
    private final String payload;

    public HMSHLSTimedMetadata(String payload, long j7) {
        AbstractC22676k.m65750j(payload, "payload");
        this.payload = payload;
        this.duration = j7;
    }

    public static /* synthetic */ HMSHLSTimedMetadata copy$default(HMSHLSTimedMetadata hMSHLSTimedMetadata, String str, long j7, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = hMSHLSTimedMetadata.payload;
        }
        if ((i13 & 2) != 0) {
            j7 = hMSHLSTimedMetadata.duration;
        }
        return hMSHLSTimedMetadata.copy(str, j7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPayload() {
        return this.payload;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    public final HMSHLSTimedMetadata copy(String payload, long duration) {
        AbstractC22676k.m65750j(payload, "payload");
        return new HMSHLSTimedMetadata(payload, duration);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMSHLSTimedMetadata)) {
            return false;
        }
        HMSHLSTimedMetadata hMSHLSTimedMetadata = (HMSHLSTimedMetadata) other;
        return AbstractC22676k.m65745e(this.payload, hMSHLSTimedMetadata.payload) && this.duration == hMSHLSTimedMetadata.duration;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final String getPayload() {
        return this.payload;
    }

    public int hashCode() {
        return Long.hashCode(this.duration) + (this.payload.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("HMSHLSTimedMetadata(payload=");
        sb4.append(this.payload);
        sb4.append(", duration=");
        return AbstractC2875y.m8302o(sb4, this.duration, ')');
    }
}
