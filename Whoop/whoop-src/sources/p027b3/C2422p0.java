package p027b3;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.health.platform.client.proto.C1533u;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import c93.InterfaceC4339a;
import hc3.AbstractC17182o;
import kc3.C22365e;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: b3.p0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2422p0 extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: E */
    public static final C2422p0 f9478E;

    /* JADX INFO: renamed from: F */
    public static final C2422p0 f9479F;

    /* JADX INFO: renamed from: G */
    public static final C2422p0 f9480G;

    /* JADX INFO: renamed from: H */
    public static final C2422p0 f9481H;

    /* JADX INFO: renamed from: I */
    public static final C2422p0 f9482I;

    /* JADX INFO: renamed from: J */
    public static final C2422p0 f9483J;

    /* JADX INFO: renamed from: K */
    public static final C2422p0 f9484K;

    /* JADX INFO: renamed from: L */
    public static final C2422p0 f9485L;

    /* JADX INFO: renamed from: M */
    public static final C2422p0 f9486M;

    /* JADX INFO: renamed from: N */
    public static final C2422p0 f9487N;

    /* JADX INFO: renamed from: O */
    public static final C2422p0 f9488O;

    /* JADX INFO: renamed from: P */
    public static final C2422p0 f9489P;

    /* JADX INFO: renamed from: Q */
    public static final C2422p0 f9490Q;

    /* JADX INFO: renamed from: R */
    public static final C2422p0 f9491R;

    /* JADX INFO: renamed from: S */
    public static final C2422p0 f9492S;

    /* JADX INFO: renamed from: T */
    public static final C2422p0 f9493T;

    /* JADX INFO: renamed from: U */
    public static final C2422p0 f9494U;

    /* JADX INFO: renamed from: V */
    public static final C2422p0 f9495V;

    /* JADX INFO: renamed from: W */
    public static final C2422p0 f9496W;

    /* JADX INFO: renamed from: X */
    public static final C2422p0 f9497X;

    /* JADX INFO: renamed from: Y */
    public static final C2422p0 f9498Y;

    /* JADX INFO: renamed from: Z */
    public static final C2422p0 f9499Z;

    /* JADX INFO: renamed from: a0 */
    public static final C2422p0 f9500a0;

    /* JADX INFO: renamed from: b0 */
    public static final C2422p0 f9501b0;

    /* JADX INFO: renamed from: c0 */
    public static final C2422p0 f9502c0;

    /* JADX INFO: renamed from: d0 */
    public static final C2422p0 f9503d0;

    /* JADX INFO: renamed from: e0 */
    public static final C2422p0 f9504e0;

    /* JADX INFO: renamed from: x */
    public static final C2422p0 f9505x;

    /* JADX INFO: renamed from: y */
    public static final C2422p0 f9506y;

    /* JADX INFO: renamed from: z */
    public static final C2422p0 f9507z;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9508w;

    static {
        int i13 = 0;
        f9505x = new C2422p0(i13, 0);
        f9506y = new C2422p0(i13, 1);
        f9507z = new C2422p0(i13, 2);
        f9478E = new C2422p0(i13, 3);
        f9479F = new C2422p0(i13, 4);
        f9480G = new C2422p0(i13, 5);
        f9481H = new C2422p0(i13, 6);
        f9482I = new C2422p0(i13, 7);
        f9483J = new C2422p0(i13, 8);
        f9484K = new C2422p0(i13, 9);
        f9485L = new C2422p0(i13, 10);
        f9486M = new C2422p0(i13, 11);
        f9487N = new C2422p0(i13, 12);
        f9488O = new C2422p0(i13, 13);
        f9489P = new C2422p0(i13, 14);
        f9490Q = new C2422p0(i13, 15);
        f9491R = new C2422p0(i13, 16);
        f9492S = new C2422p0(i13, 17);
        f9493T = new C2422p0(i13, 18);
        f9494U = new C2422p0(i13, 19);
        f9495V = new C2422p0(i13, 20);
        f9496W = new C2422p0(i13, 21);
        f9497X = new C2422p0(i13, 22);
        f9498Y = new C2422p0(i13, 23);
        f9499Z = new C2422p0(i13, 24);
        f9500a0 = new C2422p0(i13, 25);
        f9501b0 = new C2422p0(i13, 26);
        f9502c0 = new C2422p0(i13, 27);
        f9503d0 = new C2422p0(i13, 28);
        f9504e0 = new C2422p0(i13, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2422p0(int i13, int i14) {
        super(i13);
        this.f9508w = i14;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        Choreographer choreographer;
        switch (this.f9508w) {
            case 0:
                AndroidCompositionLocals_androidKt.m3596b("LocalConfiguration");
                throw null;
            case 1:
                AndroidCompositionLocals_androidKt.m3596b("LocalContext");
                throw null;
            case 2:
                AndroidCompositionLocals_androidKt.m3596b("LocalImageVectorCache");
                throw null;
            case 3:
                AndroidCompositionLocals_androidKt.m3596b("LocalResourceIdCache");
                throw null;
            case 4:
                AndroidCompositionLocals_androidKt.m3596b("LocalView");
                throw null;
            case 5:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    C22365e c22365e = AbstractC3050q0.f12077a;
                    choreographer = (Choreographer) AbstractC3006f0.m8699E(AbstractC17182o.f65999a, new C2471z0(0));
                }
                C2353b1 c2353b1 = new C2353b1(choreographer, Handler.createAsync(Looper.getMainLooper()));
                return c2353b1.plus(c2353b1.f9301J);
            case 6:
            case 7:
                return null;
            case 8:
                AbstractC2453v1.m7434b("LocalAutofillManager");
                throw null;
            case 9:
                AbstractC2453v1.m7434b("LocalAutofillTree");
                throw null;
            case 10:
                AbstractC2453v1.m7434b("LocalClipboard");
                throw null;
            case 11:
                AbstractC2453v1.m7434b("LocalClipboardManager");
                throw null;
            case 12:
                return Boolean.TRUE;
            case 13:
                AbstractC2453v1.m7434b("LocalDensity");
                throw null;
            case 14:
                AbstractC2453v1.m7434b("LocalFocusManager");
                throw null;
            case 15:
                AbstractC2453v1.m7434b("LocalFontFamilyResolver");
                throw null;
            case 16:
                AbstractC2453v1.m7434b("LocalFontLoader");
                throw null;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                AbstractC2453v1.m7434b("LocalGraphicsContext");
                throw null;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                AbstractC2453v1.m7434b("LocalHapticFeedback");
                throw null;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                AbstractC2453v1.m7434b("LocalInputManager");
                throw null;
            case 20:
                AbstractC2453v1.m7434b("LocalLayoutDirection");
                throw null;
            case 21:
                return null;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return Boolean.FALSE;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case 24:
                return null;
            case 25:
                AbstractC2453v1.m7434b("LocalTextToolbar");
                throw null;
            case 26:
                AbstractC2453v1.m7434b("LocalUriHandler");
                throw null;
            case 27:
                AbstractC2453v1.m7434b("LocalViewConfiguration");
                throw null;
            case 28:
                AbstractC2453v1.m7434b("LocalWindowInfo");
                throw null;
            default:
                return Boolean.FALSE;
        }
    }
}
