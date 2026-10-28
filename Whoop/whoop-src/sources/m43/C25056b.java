package m43;

import a30.C0332w0;
import i43.C18087b;
import io.getstream.video.android.model.StreamCallId;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m43.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C25056b {

    /* JADX INFO: renamed from: a */
    public final StreamCallId f98184a;

    /* JADX INFO: renamed from: b */
    public final Integer f98185b;

    /* JADX INFO: renamed from: c */
    public final C0332w0 f98186c;

    /* JADX INFO: renamed from: d */
    public final C18087b f98187d;

    /* JADX INFO: renamed from: e */
    public final boolean f98188e;

    /* JADX INFO: renamed from: f */
    public final Long f98189f;

    public C25056b(StreamCallId streamCallId, Integer num, C0332w0 c0332w0, C18087b c18087b, boolean z4, Long l7) {
        this.f98184a = streamCallId;
        this.f98185b = num;
        this.f98186c = c0332w0;
        this.f98187d = c18087b;
        this.f98188e = z4;
        this.f98189f = l7;
    }

    /* JADX INFO: renamed from: a */
    public static C25056b m73534a(C25056b c25056b, StreamCallId streamCallId, Integer num, C0332w0 c0332w0, C18087b c18087b, boolean z4, Long l7, int i13) {
        if ((i13 & 1) != 0) {
            streamCallId = c25056b.f98184a;
        }
        StreamCallId streamCallId2 = streamCallId;
        if ((i13 & 2) != 0) {
            num = c25056b.f98185b;
        }
        Integer num2 = num;
        if ((i13 & 4) != 0) {
            c0332w0 = c25056b.f98186c;
        }
        C0332w0 c0332w1 = c0332w0;
        if ((i13 & 8) != 0) {
            c18087b = c25056b.f98187d;
        }
        C18087b c18087b2 = c18087b;
        if ((i13 & 16) != 0) {
            z4 = c25056b.f98188e;
        }
        boolean z13 = z4;
        if ((i13 & 32) != 0) {
            l7 = c25056b.f98189f;
        }
        c25056b.getClass();
        return new C25056b(streamCallId2, num2, c0332w1, c18087b2, z13, l7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25056b)) {
            return false;
        }
        C25056b c25056b = (C25056b) obj;
        return AbstractC22676k.m65745e(this.f98184a, c25056b.f98184a) && AbstractC22676k.m65745e(this.f98185b, c25056b.f98185b) && AbstractC22676k.m65745e(this.f98186c, c25056b.f98186c) && AbstractC22676k.m65745e(this.f98187d, c25056b.f98187d) && this.f98188e == c25056b.f98188e && AbstractC22676k.m65745e(this.f98189f, c25056b.f98189f);
    }

    public final int hashCode() {
        StreamCallId streamCallId = this.f98184a;
        int iHashCode = (streamCallId == null ? 0 : streamCallId.hashCode()) * 31;
        Integer num = this.f98185b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        C0332w0 c0332w0 = this.f98186c;
        int iHashCode3 = (iHashCode2 + (c0332w0 == null ? 0 : c0332w0.hashCode())) * 31;
        C18087b c18087b = this.f98187d;
        int iM8289b = AbstractC2875y.m8289b((iHashCode3 + (c18087b == null ? 0 : c18087b.hashCode())) * 31, 31, this.f98188e);
        Long l7 = this.f98189f;
        return iM8289b + (l7 != null ? l7.hashCode() : 0);
    }

    public final String toString() {
        return "ServiceStateSnapshot(currentCallId=" + this.f98184a + ", notificationId=" + this.f98185b + ", soundPlayer=" + this.f98186c + ", toggleCameraBroadcastReceiver=" + this.f98187d + ", isReceiverRegistered=" + this.f98188e + ", startTimeElapsedRealtime=" + this.f98189f + ")";
    }
}
