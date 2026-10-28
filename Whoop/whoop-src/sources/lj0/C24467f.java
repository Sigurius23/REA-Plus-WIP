package lj0;

import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: lj0.f */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\r¨\u0006\u0016"}, m65681d2 = {"Llj0/f;", "", "", "invalidPacketCount", "imuStreamDataPacketCount", "<init>", "(II)V", "a", "(II)Llj0/f;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "d", "b", "c", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24467f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int invalidPacketCount;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int imuStreamDataPacketCount;

    public C24467f(int i13, int i14) {
        this.invalidPacketCount = i13;
        this.imuStreamDataPacketCount = i14;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C24467f m71198b(C24467f c24467f, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = c24467f.invalidPacketCount;
        }
        if ((i15 & 2) != 0) {
            i14 = c24467f.imuStreamDataPacketCount;
        }
        return c24467f.m71199a(i13, i14);
    }

    /* JADX INFO: renamed from: a */
    public final C24467f m71199a(int invalidPacketCount, int imuStreamDataPacketCount) {
        return new C24467f(invalidPacketCount, imuStreamDataPacketCount);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getImuStreamDataPacketCount() {
        return this.imuStreamDataPacketCount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getInvalidPacketCount() {
        return this.invalidPacketCount;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24467f)) {
            return false;
        }
        C24467f c24467f = (C24467f) other;
        return this.invalidPacketCount == c24467f.invalidPacketCount && this.imuStreamDataPacketCount == c24467f.imuStreamDataPacketCount;
    }

    public int hashCode() {
        return Integer.hashCode(this.imuStreamDataPacketCount) + (Integer.hashCode(this.invalidPacketCount) * 31);
    }

    public String toString() {
        return AbstractC25012a.m73372e(this.invalidPacketCount, this.imuStreamDataPacketCount, "PacketCounts(invalidPacketCount=", ", imuStreamDataPacketCount=", ")");
    }

    public /* synthetic */ C24467f(int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? 0 : i13, (i15 & 2) != 0 ? 0 : i14);
    }
}
