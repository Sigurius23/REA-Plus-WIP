package p218ic;

import java.util.HashSet;
import java.util.UUID;
import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ic.n0 */
/* JADX INFO: loaded from: classes.dex */
public final class C18373n0 {

    /* JADX INFO: renamed from: a */
    public final UUID f71520a;

    /* JADX INFO: renamed from: b */
    public final EnumC18371m0 f71521b;

    /* JADX INFO: renamed from: c */
    public final HashSet f71522c;

    /* JADX INFO: renamed from: d */
    public final C18358g f71523d;

    /* JADX INFO: renamed from: e */
    public final C18358g f71524e;

    /* JADX INFO: renamed from: f */
    public final int f71525f;

    /* JADX INFO: renamed from: g */
    public final int f71526g;

    /* JADX INFO: renamed from: h */
    public final C18354e f71527h;

    /* JADX INFO: renamed from: i */
    public final long f71528i;

    /* JADX INFO: renamed from: j */
    public final C18369l0 f71529j;

    /* JADX INFO: renamed from: k */
    public final long f71530k;

    /* JADX INFO: renamed from: l */
    public final int f71531l;

    public C18373n0(UUID uuid, EnumC18371m0 enumC18371m0, HashSet hashSet, C18358g outputData, C18358g progress, int i13, int i14, C18354e c18354e, long j7, C18369l0 c18369l0, long j13, int i15) {
        AbstractC22676k.m65750j(outputData, "outputData");
        AbstractC22676k.m65750j(progress, "progress");
        this.f71520a = uuid;
        this.f71521b = enumC18371m0;
        this.f71522c = hashSet;
        this.f71523d = outputData;
        this.f71524e = progress;
        this.f71525f = i13;
        this.f71526g = i14;
        this.f71527h = c18354e;
        this.f71528i = j7;
        this.f71529j = c18369l0;
        this.f71530k = j13;
        this.f71531l = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C18373n0.class.equals(obj.getClass())) {
            return false;
        }
        C18373n0 c18373n0 = (C18373n0) obj;
        if (this.f71525f == c18373n0.f71525f && this.f71526g == c18373n0.f71526g && this.f71520a.equals(c18373n0.f71520a) && this.f71521b == c18373n0.f71521b && AbstractC22676k.m65745e(this.f71523d, c18373n0.f71523d) && this.f71527h.equals(c18373n0.f71527h) && this.f71528i == c18373n0.f71528i && AbstractC22676k.m65745e(this.f71529j, c18373n0.f71529j) && this.f71530k == c18373n0.f71530k && this.f71531l == c18373n0.f71531l && this.f71522c.equals(c18373n0.f71522c)) {
            return AbstractC22676k.m65745e(this.f71524e, c18373n0.f71524e);
        }
        return false;
    }

    public final int hashCode() {
        int iM30451e = AbstractC11266d.m30451e((this.f71527h.hashCode() + ((((((this.f71524e.hashCode() + ((this.f71522c.hashCode() + ((this.f71523d.hashCode() + ((this.f71521b.hashCode() + (this.f71520a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f71525f) * 31) + this.f71526g) * 31)) * 31, this.f71528i, 31);
        C18369l0 c18369l0 = this.f71529j;
        return Integer.hashCode(this.f71531l) + AbstractC11266d.m30451e((iM30451e + (c18369l0 != null ? c18369l0.hashCode() : 0)) * 31, this.f71530k, 31);
    }

    public final String toString() {
        return "WorkInfo{id='" + this.f71520a + "', state=" + this.f71521b + ", outputData=" + this.f71523d + ", tags=" + this.f71522c + ", progress=" + this.f71524e + ", runAttemptCount=" + this.f71525f + ", generation=" + this.f71526g + ", constraints=" + this.f71527h + ", initialDelayMillis=" + this.f71528i + ", periodicityInfo=" + this.f71529j + ", nextScheduleTimeMillis=" + this.f71530k + "}, stopReason=" + this.f71531l;
    }
}
