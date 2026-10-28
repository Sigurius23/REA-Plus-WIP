package p163g1;

import androidx.compose.runtime.Composer;
import p040c0.AbstractC3760m1;
import p077d0.AbstractC11348f;
import p208i2.C17919x;
import p271k3.EnumC22167a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.InterfaceC28670t2;
import p715kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: g1.r1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15127r1 implements InterfaceC14948a1 {

    /* JADX INFO: renamed from: a */
    public final long f56679a;

    /* JADX INFO: renamed from: b */
    public final long f56680b;

    /* JADX INFO: renamed from: c */
    public final long f56681c;

    /* JADX INFO: renamed from: d */
    public final long f56682d;

    /* JADX INFO: renamed from: e */
    public final long f56683e;

    /* JADX INFO: renamed from: f */
    public final long f56684f;

    /* JADX INFO: renamed from: g */
    public final long f56685g;

    /* JADX INFO: renamed from: h */
    public final long f56686h;

    /* JADX INFO: renamed from: i */
    public final long f56687i;

    /* JADX INFO: renamed from: j */
    public final long f56688j;

    /* JADX INFO: renamed from: k */
    public final long f56689k;

    public C15127r1(long j7, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j24, long j25, long j26) {
        this.f56679a = j7;
        this.f56680b = j13;
        this.f56681c = j14;
        this.f56682d = j15;
        this.f56683e = j16;
        this.f56684f = j17;
        this.f56685g = j18;
        this.f56686h = j19;
        this.f56687i = j24;
        this.f56688j = j25;
        this.f56689k = j26;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC28670t2 m43180a(boolean z4, EnumC22167a enumC22167a, Composer composer) {
        long j7;
        InterfaceC28670t2 interfaceC28670t2M87238F;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-1568341342);
        if (z4) {
            int iOrdinal = enumC22167a.ordinal();
            if (iOrdinal == 0) {
                j7 = this.f56686h;
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                j7 = this.f56686h;
            } else {
                j7 = this.f56687i;
            }
        } else {
            int iOrdinal2 = enumC22167a.ordinal();
            if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                j7 = this.f56688j;
            } else {
                if (iOrdinal2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                j7 = this.f56689k;
            }
        }
        if (z4) {
            c28655q.m87150e0(-1801872468);
            interfaceC28670t2M87238F = AbstractC3760m1.m11569a(j7, AbstractC11348f.m30574v(enumC22167a == EnumC22167a.f85978x ? 100 : 50, 0, null, 6), null, c28655q, 0, 12);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(-1801691924);
            interfaceC28670t2M87238F = AbstractC28683x.m87238F(new C17919x(j7), c28655q);
            c28655q.m87173q(false);
        }
        c28655q.m87173q(false);
        return interfaceC28670t2M87238F;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC28670t2 m43181b(boolean z4, EnumC22167a enumC22167a, Composer composer) {
        long j7;
        InterfaceC28670t2 interfaceC28670t2M87238F;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(840901029);
        if (z4) {
            int iOrdinal = enumC22167a.ordinal();
            if (iOrdinal == 0) {
                j7 = this.f56681c;
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                j7 = this.f56681c;
            } else {
                j7 = this.f56682d;
            }
        } else {
            int iOrdinal2 = enumC22167a.ordinal();
            if (iOrdinal2 == 0) {
                j7 = this.f56683e;
            } else if (iOrdinal2 == 1) {
                j7 = this.f56684f;
            } else {
                if (iOrdinal2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                j7 = this.f56685g;
            }
        }
        if (z4) {
            c28655q.m87150e0(-1260861623);
            interfaceC28670t2M87238F = AbstractC3760m1.m11569a(j7, AbstractC11348f.m30574v(enumC22167a == EnumC22167a.f85978x ? 100 : 50, 0, null, 6), null, c28655q, 0, 12);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(-1260681079);
            interfaceC28670t2M87238F = AbstractC28683x.m87238F(new C17919x(j7), c28655q);
            c28655q.m87173q(false);
        }
        c28655q.m87173q(false);
        return interfaceC28670t2M87238F;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC28670t2 m43182c(EnumC22167a enumC22167a, Composer composer) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(544656267);
        EnumC22167a enumC22167a2 = EnumC22167a.f85978x;
        InterfaceC28670t2 interfaceC28670t2M11569a = AbstractC3760m1.m11569a(enumC22167a == enumC22167a2 ? this.f56680b : this.f56679a, AbstractC11348f.m30574v(enumC22167a == enumC22167a2 ? 100 : 50, 0, null, 6), null, c28655q, 0, 12);
        c28655q.m87173q(false);
        return interfaceC28670t2M11569a;
    }
}
