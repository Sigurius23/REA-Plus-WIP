package io.getstream.android.video.generated.models;

import p088dc.AbstractC11895b;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/android/video/generated/models/RejectCallRequest;", "", "reason", "", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class RejectCallRequest {
    private final String reason;

    /* JADX WARN: Multi-variable type inference failed */
    public RejectCallRequest() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ RejectCallRequest copy$default(RejectCallRequest rejectCallRequest, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = rejectCallRequest.reason;
        }
        return rejectCallRequest.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    public final RejectCallRequest copy(@InterfaceC30731q(name = "reason") String reason) {
        return new RejectCallRequest(reason);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RejectCallRequest) && AbstractC22676k.m65745e(this.reason, ((RejectCallRequest) other).reason);
    }

    public final String getReason() {
        return this.reason;
    }

    public int hashCode() {
        String str = this.reason;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return AbstractC11895b.m31996o("RejectCallRequest(reason=", this.reason, ")");
    }

    public RejectCallRequest(@InterfaceC30731q(name = "reason") String str) {
        this.reason = str;
    }

    public /* synthetic */ RejectCallRequest(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str);
    }
}
