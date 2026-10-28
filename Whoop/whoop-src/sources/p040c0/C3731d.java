package p040c0;

import p077d0.C11384o;
import p077d0.C11392q;
import p208i2.AbstractC17918w0;
import p208i2.C17881e1;
import p208i2.C17919x;
import p240j2.C21223d;
import p636y3.C39180l;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: c0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C3731d extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: E */
    public static final C3731d f15252E;

    /* JADX INFO: renamed from: F */
    public static final C3731d f15253F;

    /* JADX INFO: renamed from: G */
    public static final C3731d f15254G;

    /* JADX INFO: renamed from: H */
    public static final C3731d f15255H;

    /* JADX INFO: renamed from: I */
    public static final C3731d f15256I;

    /* JADX INFO: renamed from: J */
    public static final C3731d f15257J;

    /* JADX INFO: renamed from: K */
    public static final C3731d f15258K;

    /* JADX INFO: renamed from: x */
    public static final C3731d f15259x;

    /* JADX INFO: renamed from: y */
    public static final C3731d f15260y;

    /* JADX INFO: renamed from: z */
    public static final C3731d f15261z;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f15262w;

    static {
        int i13 = 1;
        f15259x = new C3731d(i13, 0);
        f15260y = new C3731d(i13, 1);
        f15261z = new C3731d(i13, 2);
        f15252E = new C3731d(i13, 3);
        f15253F = new C3731d(i13, 4);
        f15254G = new C3731d(i13, 5);
        f15255H = new C3731d(i13, 6);
        f15256I = new C3731d(i13, 7);
        f15257J = new C3731d(i13, 8);
        f15258K = new C3731d(i13, 9);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3731d(int i13, int i14) {
        super(i13);
        this.f15262w = i14;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15262w) {
            case 0:
                return obj;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 2:
                long jM51540b = C17919x.m51540b(((C17919x) obj).f69639a, C21223d.f81042x);
                return new C11392q(C17919x.m51543e(jM51540b), C17919x.m51547i(jM51540b), C17919x.m51546h(jM51540b), C17919x.m51544f(jM51540b));
            case 3:
                return obj;
            case 4:
                long j7 = ((C17881e1) obj).f69568a;
                return new C11384o(C17881e1.m51437b(j7), C17881e1.m51438c(j7));
            case 5:
                C11384o c11384o = (C11384o) obj;
                return new C17881e1(AbstractC17918w0.m51524l(c11384o.f36504a, c11384o.f36505b));
            case 6:
                ((Number) obj).intValue();
                return 0;
            case 7:
                ((Number) obj).intValue();
                return 0;
            case 8:
                return Integer.valueOf((-((Number) obj).intValue()) / 2);
            case 9:
                return Integer.valueOf((-((Number) obj).intValue()) / 2);
            case 10:
                return new C39180l((((long) 0) << 32) | (4294967295L & ((long) ((int) (((C39180l) obj).f168422a & 4294967295L)))));
            default:
                return new C39180l((((long) 0) << 32) | (4294967295L & ((long) ((int) (((C39180l) obj).f168422a & 4294967295L)))));
        }
    }
}
