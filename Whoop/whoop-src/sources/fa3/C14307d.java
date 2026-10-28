package fa3;

import cb3.AbstractC4393e;
import io.sentry.config.AbstractC20301a;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import o93.AbstractC27736h;
import p000.C31931s;
import p477s2.AbstractC32073e;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31107a1;
import r93.InterfaceC31111c;
import r93.InterfaceC31162w;
import u93.AbstractC34711x0;
import u93.C34697q0;

/* JADX INFO: renamed from: fa3.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C14307d implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f52245w;

    /* JADX INFO: renamed from: x */
    public static final C14307d f52242x = new C14307d(0);

    /* JADX INFO: renamed from: y */
    public static final C14307d f52243y = new C14307d(1);

    /* JADX INFO: renamed from: z */
    public static final C14307d f52244z = new C14307d(2);

    /* JADX INFO: renamed from: E */
    public static final C14307d f52238E = new C14307d(3);

    /* JADX INFO: renamed from: F */
    public static final C14307d f52239F = new C14307d(4);

    /* JADX INFO: renamed from: G */
    public static final C14307d f52240G = new C14307d(5);

    /* JADX INFO: renamed from: H */
    public static final C14307d f52241H = new C14307d(6);

    public /* synthetic */ C14307d(int i13) {
        this.f52245w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC31111c interfaceC31111cM13804b;
        String strM56348p;
        boolean z4 = false;
        switch (this.f52245w) {
            case 0:
                InterfaceC31111c it = (InterfaceC31111c) obj;
                int i13 = AbstractC14309e.f52250l;
                AbstractC22676k.m65750j(it, "it");
                return Boolean.valueOf(AbstractC25265s.m74155w0(AbstractC14314g0.f52266f, AbstractC20301a.m56348p(it)));
            case 1:
                InterfaceC31111c it3 = (InterfaceC31111c) obj;
                int i14 = AbstractC14309e.f52250l;
                AbstractC22676k.m65750j(it3, "it");
                if ((it3 instanceof InterfaceC31162w) && AbstractC25265s.m74155w0(AbstractC14314g0.f52266f, AbstractC20301a.m56348p(it3))) {
                    z4 = true;
                }
                return Boolean.valueOf(z4);
            case 2:
                InterfaceC31111c it4 = (InterfaceC31111c) obj;
                AbstractC22676k.m65750j(it4, "it");
                return Boolean.valueOf(AbstractC32073e.m99721M(it4));
            case 3:
                return ((AbstractC34711x0) ((InterfaceC31107a1) obj)).getType();
            case 4:
                InterfaceC31111c it5 = (InterfaceC31111c) obj;
                AbstractC22676k.m65750j(it5, "it");
                return Boolean.valueOf(AbstractC32073e.m99721M(AbstractC4393e.m13813k(it5)));
            case 5:
                InterfaceC31111c it6 = (InterfaceC31111c) obj;
                AbstractC22676k.m65750j(it6, "it");
                int i15 = AbstractC14305c.f52232l;
                C34697q0 c34697q0 = (C34697q0) it6;
                if (AbstractC27736h.m83799A(c34697q0) && AbstractC4393e.m13804b(c34697q0, new C31931s(c34697q0, 4)) != null) {
                    z4 = true;
                }
                return Boolean.valueOf(z4);
            default:
                InterfaceC31111c it7 = (InterfaceC31111c) obj;
                AbstractC22676k.m65750j(it7, "it");
                if (AbstractC27736h.m83799A(it7)) {
                    int i16 = AbstractC14309e.f52250l;
                    EnumC14308d0 enumC14308d0 = null;
                    if (AbstractC14314g0.f52265e.contains(it7.getName()) && (interfaceC31111cM13804b = AbstractC4393e.m13804b(it7, f52243y)) != null && (strM56348p = AbstractC20301a.m56348p(interfaceC31111cM13804b)) != null) {
                        if (AbstractC14314g0.f52262b.contains(strM56348p)) {
                            enumC14308d0 = EnumC14308d0.f52246w;
                        } else {
                            enumC14308d0 = ((EnumC14312f0) AbstractC25247g0.m73986U(strM56348p, AbstractC14314g0.f52264d)) == EnumC14312f0.f52257x ? EnumC14308d0.f52248y : EnumC14308d0.f52247x;
                        }
                    }
                    if (enumC14308d0 != null) {
                        z4 = true;
                    }
                }
                return Boolean.valueOf(z4);
        }
    }
}
