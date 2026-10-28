package p040c0;

import androidx.compose.animation.AbstractC1089a;
import p077d0.AbstractC11348f;
import p636y3.C39180l;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: c0.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C3728c extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: E */
    public static final C3728c f15231E;

    /* JADX INFO: renamed from: F */
    public static final C3728c f15232F;

    /* JADX INFO: renamed from: G */
    public static final C3728c f15233G;

    /* JADX INFO: renamed from: H */
    public static final C3728c f15234H;

    /* JADX INFO: renamed from: I */
    public static final C3728c f15235I;

    /* JADX INFO: renamed from: J */
    public static final C3728c f15236J;

    /* JADX INFO: renamed from: K */
    public static final C3728c f15237K;

    /* JADX INFO: renamed from: L */
    public static final C3728c f15238L;

    /* JADX INFO: renamed from: x */
    public static final C3728c f15239x;

    /* JADX INFO: renamed from: y */
    public static final C3728c f15240y;

    /* JADX INFO: renamed from: z */
    public static final C3728c f15241z;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f15242w;

    static {
        int i13 = 1;
        f15239x = new C3728c(i13, 0);
        f15240y = new C3728c(i13, 1);
        f15241z = new C3728c(i13, 2);
        f15231E = new C3728c(i13, 3);
        f15232F = new C3728c(i13, 4);
        f15233G = new C3728c(i13, 5);
        f15234H = new C3728c(i13, 6);
        f15235I = new C3728c(i13, 7);
        f15236J = new C3728c(i13, 8);
        f15237K = new C3728c(i13, 9);
        f15238L = new C3728c(i13, 10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3728c(int i13, int i14) {
        super(i13);
        this.f15242w = i14;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15242w) {
            case 0:
                return AbstractC1089a.m3345c(AbstractC3788w0.m11577e(AbstractC11348f.m30574v(220, 90, null, 4), 2).m11562a(AbstractC3788w0.m11579g(AbstractC11348f.m30574v(220, 90, null, 4), 0.92f, 4)), AbstractC3788w0.m11578f(AbstractC11348f.m30574v(90, 0, null, 6), 2));
            case 1:
                return Integer.valueOf(((Number) obj).intValue());
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 3:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return bool2;
            case 4:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return bool3;
            case 5:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                return bool4;
            case 6:
                return AbstractC11348f.m30573u(0.0f, 0.0f, 7, null);
            case 7:
                long j7 = ((C39180l) obj).f168422a;
                long j13 = 0;
                return new C39180l((j13 & 4294967295L) | (j13 << 32));
            case 8:
                long j14 = ((C39180l) obj).f168422a;
                long j15 = 0;
                return new C39180l((j15 & 4294967295L) | (j15 << 32));
            case 9:
                return Integer.valueOf((-((Number) obj).intValue()) / 2);
            default:
                return AbstractC3788w0.f15445c;
        }
    }
}
