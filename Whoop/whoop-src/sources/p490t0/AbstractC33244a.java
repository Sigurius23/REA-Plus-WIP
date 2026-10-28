package p490t0;

import p031b9.AbstractC2875y;
import p181h2.C16620e;
import p208i2.AbstractC17904p0;
import p208i2.InterfaceC17869a1;
import p268k0.AbstractC22086a;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;

/* JADX INFO: renamed from: t0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC33244a implements InterfaceC17869a1 {

    /* JADX INFO: renamed from: a */
    private final InterfaceC33245b f138643a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC33245b f138644b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC33245b f138645c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC33245b f138646d;

    public AbstractC33244a(InterfaceC33245b interfaceC33245b, InterfaceC33245b interfaceC33245b2, InterfaceC33245b interfaceC33245b3, InterfaceC33245b interfaceC33245b4) {
        this.f138643a = interfaceC33245b;
        this.f138644b = interfaceC33245b2;
        this.f138645c = interfaceC33245b3;
        this.f138646d = interfaceC33245b4;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ AbstractC33244a m105477d(AbstractC33244a abstractC33244a, InterfaceC33245b interfaceC33245b, InterfaceC33245b interfaceC33245b2, InterfaceC33245b interfaceC33245b3, InterfaceC33245b interfaceC33245b4, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i13 & 1) != 0) {
            interfaceC33245b = abstractC33244a.f138643a;
        }
        if ((i13 & 2) != 0) {
            interfaceC33245b2 = abstractC33244a.f138644b;
        }
        if ((i13 & 4) != 0) {
            interfaceC33245b3 = abstractC33244a.f138645c;
        }
        if ((i13 & 8) != 0) {
            interfaceC33245b4 = abstractC33244a.f138646d;
        }
        return abstractC33244a.mo64096c(interfaceC33245b, interfaceC33245b2, interfaceC33245b3, interfaceC33245b4);
    }

    @Override // p208i2.InterfaceC17869a1
    /* JADX INFO: renamed from: a */
    public final AbstractC17904p0 mo39171a(long j7, EnumC39181m enumC39181m, InterfaceC39171c interfaceC39171c) {
        float fMo105483a = this.f138643a.mo105483a(j7, interfaceC39171c);
        float fMo105483a2 = this.f138644b.mo105483a(j7, interfaceC39171c);
        float fMo105483a3 = this.f138645c.mo105483a(j7, interfaceC39171c);
        float fMo105483a4 = this.f138646d.mo105483a(j7, interfaceC39171c);
        float fM47212d = C16620e.m47212d(j7);
        float f13 = fMo105483a + fMo105483a4;
        if (f13 > fM47212d) {
            float f14 = fM47212d / f13;
            fMo105483a *= f14;
            fMo105483a4 *= f14;
        }
        float f15 = fMo105483a2 + fMo105483a3;
        if (f15 > fM47212d) {
            float f16 = fM47212d / f15;
            fMo105483a2 *= f16;
            fMo105483a3 *= f16;
        }
        if (fMo105483a < 0.0f || fMo105483a2 < 0.0f || fMo105483a3 < 0.0f || fMo105483a4 < 0.0f) {
            StringBuilder sbM8307t = AbstractC2875y.m8307t("Corner size in Px can't be negative(topStart = ", fMo105483a, ", topEnd = ", fMo105483a2, ", bottomEnd = ");
            sbM8307t.append(fMo105483a3);
            sbM8307t.append(", bottomStart = ");
            sbM8307t.append(fMo105483a4);
            sbM8307t.append(")!");
            AbstractC22086a.m63158a(sbM8307t.toString());
        }
        return mo64097e(j7, fMo105483a, fMo105483a2, fMo105483a3, fMo105483a4, enumC39181m);
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC33244a m105478b(InterfaceC33245b interfaceC33245b) {
        return mo64096c(interfaceC33245b, interfaceC33245b, interfaceC33245b, interfaceC33245b);
    }

    /* JADX INFO: renamed from: c */
    public abstract AbstractC33244a mo64096c(InterfaceC33245b interfaceC33245b, InterfaceC33245b interfaceC33245b2, InterfaceC33245b interfaceC33245b3, InterfaceC33245b interfaceC33245b4);

    /* JADX INFO: renamed from: e */
    public abstract AbstractC17904p0 mo64097e(long j7, float f13, float f14, float f15, float f16, EnumC39181m enumC39181m);

    /* JADX INFO: renamed from: f */
    public final InterfaceC33245b m105479f() {
        return this.f138645c;
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC33245b m105480g() {
        return this.f138646d;
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC33245b m105481h() {
        return this.f138644b;
    }

    /* JADX INFO: renamed from: i */
    public final InterfaceC33245b m105482i() {
        return this.f138643a;
    }
}
