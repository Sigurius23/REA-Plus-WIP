package p490t0;

/* JADX INFO: renamed from: t0.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC33253j {

    /* JADX INFO: renamed from: a */
    public static final C33252i f138651a = m105486b(50);

    /* JADX INFO: renamed from: a */
    public static final C33252i m105485a(float f13) {
        C33251h c33251h = new C33251h(f13);
        return new C33252i(c33251h, c33251h, c33251h, c33251h);
    }

    /* JADX INFO: renamed from: b */
    public static final C33252i m105486b(int i13) {
        C33250g c33250gM105484a = AbstractC33247d.m105484a(i13);
        return new C33252i(c33250gM105484a, c33250gM105484a, c33250gM105484a, c33250gM105484a);
    }

    /* JADX INFO: renamed from: c */
    public static final C33252i m105487c(int i13, int i14, int i15, int i16) {
        return new C33252i(AbstractC33247d.m105484a(i13), AbstractC33247d.m105484a(i14), AbstractC33247d.m105484a(i15), AbstractC33247d.m105484a(i16));
    }

    /* JADX INFO: renamed from: e */
    public static final C33252i m105489e(float f13) {
        C33248e c33248e = new C33248e(f13);
        return new C33252i(c33248e, c33248e, c33248e, c33248e);
    }

    /* JADX INFO: renamed from: f */
    public static final C33252i m105490f(float f13, float f14, float f15, float f16) {
        return new C33252i(new C33248e(f13), new C33248e(f14), new C33248e(f15), new C33248e(f16));
    }

    /* JADX INFO: renamed from: g */
    public static C33252i m105491g(float f13, float f14, float f15, float f16, int i13) {
        if ((i13 & 1) != 0) {
            f13 = 0;
        }
        if ((i13 & 2) != 0) {
            f14 = 0;
        }
        if ((i13 & 4) != 0) {
            f15 = 0;
        }
        if ((i13 & 8) != 0) {
            f16 = 0;
        }
        return m105490f(f13, f14, f15, f16);
    }
}
