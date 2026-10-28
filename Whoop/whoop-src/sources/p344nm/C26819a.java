package p344nm;

import ih0.AbstractC18489d0;
import io.getstream.chat.android.p226ui.common.utils.AttachmentConstants;
import p497t7.InterfaceC33561b;

/* JADX INFO: renamed from: nm.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C26819a {

    /* JADX INFO: renamed from: f */
    public static final C26819a f106972f = new C26819a(AttachmentConstants.MAX_SIZE_BEFORE_DOWNLOAD_WARNING_IN_BYTES, 200, InterfaceC33561b.INVALID_OWNERSHIP, 81920, 604800000);

    /* JADX INFO: renamed from: a */
    public final long f106973a;

    /* JADX INFO: renamed from: b */
    public final int f106974b;

    /* JADX INFO: renamed from: c */
    public final int f106975c;

    /* JADX INFO: renamed from: d */
    public final long f106976d;

    /* JADX INFO: renamed from: e */
    public final int f106977e;

    public C26819a(long j7, int i13, int i14, int i15, long j13) {
        this.f106973a = j7;
        this.f106974b = i13;
        this.f106975c = i14;
        this.f106976d = j13;
        this.f106977e = i15;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C26819a) {
            C26819a c26819a = (C26819a) obj;
            if (this.f106973a == c26819a.f106973a && this.f106974b == c26819a.f106974b && this.f106975c == c26819a.f106975c && this.f106976d == c26819a.f106976d && this.f106977e == c26819a.f106977e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j7 = this.f106973a;
        int i13 = (((((((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003) ^ this.f106974b) * 1000003) ^ this.f106975c) * 1000003;
        long j13 = this.f106976d;
        return ((i13 ^ ((int) ((j13 >>> 32) ^ j13))) * 1000003) ^ this.f106977e;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb4.append(this.f106973a);
        sb4.append(", loadBatchSize=");
        sb4.append(this.f106974b);
        sb4.append(", criticalSectionEnterTimeoutMs=");
        sb4.append(this.f106975c);
        sb4.append(", eventCleanUpAge=");
        sb4.append(this.f106976d);
        sb4.append(", maxBlobByteSizePerRow=");
        return AbstractC18489d0.m53371l(sb4, this.f106977e, "}");
    }
}
