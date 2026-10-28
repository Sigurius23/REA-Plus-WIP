package p028b4;

import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.viewinterop.AbstractC1137a;
import androidx.lifecycle.InterfaceC1585g0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p005a3.C0230n0;
import p399pb.InterfaceC29049f;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: b4.o */
/* JADX INFO: loaded from: classes5.dex */
public final class C2704o extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public static final C2704o f10647E;

    /* JADX INFO: renamed from: F */
    public static final C2704o f10648F;

    /* JADX INFO: renamed from: G */
    public static final C2704o f10649G;

    /* JADX INFO: renamed from: H */
    public static final C2704o f10650H;

    /* JADX INFO: renamed from: I */
    public static final C2704o f10651I;

    /* JADX INFO: renamed from: J */
    public static final C2704o f10652J;

    /* JADX INFO: renamed from: K */
    public static final C2704o f10653K;

    /* JADX INFO: renamed from: x */
    public static final C2704o f10654x;

    /* JADX INFO: renamed from: y */
    public static final C2704o f10655y;

    /* JADX INFO: renamed from: z */
    public static final C2704o f10656z;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f10657w;

    static {
        int i13 = 2;
        f10654x = new C2704o(i13, 0);
        f10655y = new C2704o(i13, 1);
        f10656z = new C2704o(i13, 2);
        f10647E = new C2704o(i13, 3);
        f10648F = new C2704o(i13, 4);
        f10649G = new C2704o(i13, 5);
        f10650H = new C2704o(i13, 6);
        f10651I = new C2704o(i13, 7);
        f10652J = new C2704o(i13, 8);
        f10653K = new C2704o(i13, 9);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2704o(int i13, int i14) {
        super(i13);
        this.f10657w = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13;
        switch (this.f10657w) {
            case 0:
                AbstractC1137a.m3603c((C0230n0) obj).setResetBlock((Function1) obj2);
                return C23454a0.f92919a;
            case 1:
                AbstractC1137a.m3603c((C0230n0) obj).setUpdateBlock((Function1) obj2);
                return C23454a0.f92919a;
            case 2:
                AbstractC1137a.m3603c((C0230n0) obj).setReleaseBlock((Function1) obj2);
                return C23454a0.f92919a;
            case 3:
                AbstractC1137a.m3603c((C0230n0) obj).setUpdateBlock((Function1) obj2);
                return C23454a0.f92919a;
            case 4:
                AbstractC1137a.m3603c((C0230n0) obj).setReleaseBlock((Function1) obj2);
                return C23454a0.f92919a;
            case 5:
                AbstractC1137a.m3603c((C0230n0) obj).setModifier((Modifier) obj2);
                return C23454a0.f92919a;
            case 6:
                AbstractC1137a.m3603c((C0230n0) obj).setDensity((InterfaceC39171c) obj2);
                return C23454a0.f92919a;
            case 7:
                AbstractC1137a.m3603c((C0230n0) obj).setLifecycleOwner((InterfaceC1585g0) obj2);
                return C23454a0.f92919a;
            case 8:
                AbstractC1137a.m3603c((C0230n0) obj).setSavedStateRegistryOwner((InterfaceC29049f) obj2);
                return C23454a0.f92919a;
            default:
                C2711v c2711vM3603c = AbstractC1137a.m3603c((C0230n0) obj);
                int iOrdinal = ((EnumC39181m) obj2).ordinal();
                if (iOrdinal != 0) {
                    i13 = 1;
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    i13 = 0;
                }
                c2711vM3603c.setLayoutDirection(i13);
                return C23454a0.f92919a;
        }
    }
}
