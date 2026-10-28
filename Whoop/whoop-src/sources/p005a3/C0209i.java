package p005a3;

import androidx.compose.p018ui.Modifier;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p026b2.AbstractC2316v;
import p027b3.InterfaceC2395j3;
import p390p1.InterfaceC28689z;
import p635y2.InterfaceC39127r0;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: a3.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0209i extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public static final C0209i f695E;

    /* JADX INFO: renamed from: F */
    public static final C0209i f696F;

    /* JADX INFO: renamed from: G */
    public static final C0209i f697G;

    /* JADX INFO: renamed from: H */
    public static final C0209i f698H;

    /* JADX INFO: renamed from: x */
    public static final C0209i f699x;

    /* JADX INFO: renamed from: y */
    public static final C0209i f700y;

    /* JADX INFO: renamed from: z */
    public static final C0209i f701z;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f702w;

    static {
        int i13 = 2;
        f699x = new C0209i(i13, 0);
        f700y = new C0209i(i13, 1);
        f701z = new C0209i(i13, 2);
        f695E = new C0209i(i13, 3);
        f696F = new C0209i(i13, 4);
        f697G = new C0209i(i13, 5);
        f698H = new C0209i(i13, 6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0209i(int i13, int i14) {
        super(i13);
        this.f702w = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f702w) {
            case 0:
                ((Number) obj2).intValue();
                ((InterfaceC0221l) obj).getClass();
                break;
            case 1:
                ((C0230n0) ((InterfaceC0221l) obj)).m578A0((InterfaceC39171c) obj2);
                break;
            case 2:
                EnumC39181m enumC39181m = (EnumC39181m) obj2;
                C0230n0 c0230n0 = (C0230n0) ((InterfaceC0221l) obj);
                if (c0230n0.f777Y != enumC39181m) {
                    c0230n0.f777Y = enumC39181m;
                    c0230n0.m600R();
                    C0230n0 c0230n0M588G = c0230n0.m588G();
                    if (c0230n0M588G != null) {
                        c0230n0M588G.m598P();
                    }
                    c0230n0.m599Q();
                    for (AbstractC2316v abstractC2316v = (AbstractC2316v) c0230n0.f783e0.f743g; abstractC2316v != null; abstractC2316v = abstractC2316v.f9133F) {
                        abstractC2316v.mo569t();
                    }
                }
                break;
            case 3:
                ((C0230n0) ((InterfaceC0221l) obj)).m584D0((InterfaceC39127r0) obj2);
                break;
            case 4:
                ((C0230n0) ((InterfaceC0221l) obj)).m586E0((Modifier) obj2);
                break;
            case 5:
                ((C0230n0) ((InterfaceC0221l) obj)).m653z0((InterfaceC28689z) obj2);
                break;
            default:
                ((C0230n0) ((InterfaceC0221l) obj)).m587F0((InterfaceC2395j3) obj2);
                break;
        }
        return C23454a0.f92919a;
    }
}
