package p005a3;

import androidx.compose.p018ui.node.NodeCoordinator;
import androidx.compose.p018ui.node.Owner;
import androidx.compose.p018ui.platform.AndroidComposeView;
import com.google.crypto.tink.internal.C5101l0;
import l83.C23454a0;
import p002a0.C0057v0;
import p002a0.C0059w0;
import p241j3.C21265b;
import p446r1.C30849c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: a3.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0197f extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: E */
    public static final C0197f f636E;

    /* JADX INFO: renamed from: F */
    public static final C0197f f637F;

    /* JADX INFO: renamed from: G */
    public static final C0197f f638G;

    /* JADX INFO: renamed from: H */
    public static final C0197f f639H;

    /* JADX INFO: renamed from: I */
    public static final C0197f f640I;

    /* JADX INFO: renamed from: J */
    public static final C0197f f641J;

    /* JADX INFO: renamed from: K */
    public static final C0197f f642K;

    /* JADX INFO: renamed from: L */
    public static final C0197f f643L;

    /* JADX INFO: renamed from: M */
    public static final C0197f f644M;

    /* JADX INFO: renamed from: x */
    public static final C0197f f645x;

    /* JADX INFO: renamed from: y */
    public static final C0197f f646y;

    /* JADX INFO: renamed from: z */
    public static final C0197f f647z;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f648w;

    static {
        int i13 = 1;
        f645x = new C0197f(i13, 0);
        f646y = new C0197f(i13, 1);
        f647z = new C0197f(i13, 2);
        f636E = new C0197f(i13, 3);
        f637F = new C0197f(i13, 4);
        f638G = new C0197f(i13, 5);
        f639H = new C0197f(i13, 6);
        f640I = new C0197f(i13, 7);
        f641J = new C0197f(i13, 8);
        f642K = new C0197f(i13, 9);
        f643L = new C0197f(i13, 10);
        f644M = new C0197f(i13, 11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0197f(int i13, int i14) {
        super(i13);
        this.f648w = i14;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x016b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0166 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0168 A[LOOP:0: B:84:0x0131->B:94:0x0168, LOOP_END] */
    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f648w) {
            case 0:
                ((C0189d) obj).m463Z0();
                break;
            case 1:
                C0196e2 c0196e2 = (C0196e2) obj;
                if (c0196e2.mo432U()) {
                    AbstractC0262w0 abstractC0262w0 = c0196e2.f635x;
                    if (!abstractC0262w0.f898K) {
                        Function1 function1Mo778c = c0196e2.f634w.mo778c();
                        C0057v0 c0057v0 = abstractC0262w0.f901N;
                        if (function1Mo778c != null) {
                            abstractC0262w0.m783G0(c0196e2, 9223372034707292159L, 0L);
                            abstractC0262w0.f894G = function1Mo778c;
                        } else if (c0057v0 != null) {
                            Object[] objArr = c0057v0.f172c;
                            long[] jArr = c0057v0.f170a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i13 = 0;
                                while (true) {
                                    long j7 = jArr[i13];
                                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i14 = 8 - ((~(i13 - length)) >>> 31);
                                        for (int i15 = 0; i15 < i14; i15++) {
                                            if ((255 & j7) < 128) {
                                                abstractC0262w0.m793T0((C0059w0) objArr[(i13 << 3) + i15]);
                                            }
                                            j7 >>= 8;
                                        }
                                        if (i14 == 8) {
                                            if (i13 != length) {
                                                i13++;
                                            }
                                        }
                                    } else if (i13 != length) {
                                        i13++;
                                    }
                                }
                            }
                            c0057v0.m123a();
                        }
                    }
                }
                break;
            case 2:
                InterfaceC0180a2 interfaceC0180a2 = ((NodeCoordinator) obj).f4878i0;
                if (interfaceC0180a2 != null) {
                    interfaceC0180a2.invalidate();
                }
                break;
            case 3:
                NodeCoordinator nodeCoordinator = (NodeCoordinator) obj;
                if (nodeCoordinator.mo432U() && nodeCoordinator.m3513G1(true)) {
                    C0230n0 c0230n0 = nodeCoordinator.f4858O;
                    C0246r0 c0246r0M643t = c0230n0.m643t();
                    if (c0246r0M643t.f850l > 0) {
                        if (c0246r0M643t.f849k || c0246r0M643t.f848j) {
                            c0230n0.m645u0(false);
                        }
                        c0246r0M643t.f854p.m525H0();
                    }
                    c0230n0.m628k0();
                    Owner ownerM750a = AbstractC0242q0.m750a(c0230n0);
                    C21265b rectManager = ownerM750a.getRectManager();
                    if (nodeCoordinator == ((NodeCoordinator) c0230n0.f783e0.f741e)) {
                        rectManager.m59673g(c0230n0, false);
                        rectManager.m59671e(c0230n0);
                    } else {
                        rectManager.m59672f(c0230n0);
                    }
                    if (c0230n0.f792n0 > 0) {
                        AndroidComposeView androidComposeView = (AndroidComposeView) ownerM750a;
                        C5101l0 c5101l0 = androidComposeView.f4961r0.f629e;
                        c5101l0.getClass();
                        if (c0230n0.f792n0 > 0) {
                            ((C30849c) c5101l0.f21443x).m94885b(c0230n0);
                            c0230n0.f791m0 = true;
                        }
                        androidComposeView.m3577I(null);
                    }
                }
                break;
            case 4:
                C0266x1 c0266x1 = (C0266x1) obj;
                if (c0266x1.mo432U()) {
                    c0266x1.f910w.mo796C();
                }
                break;
            case 5:
                C0230n0 c0230n1 = (C0230n0) obj;
                if (c0230n1.m605X()) {
                    c0230n1.m645u0(false);
                }
                break;
            case 6:
                C0230n0 c0230n2 = (C0230n0) obj;
                if (c0230n2.m605X()) {
                    c0230n2.m645u0(false);
                }
                break;
            case 7:
                C0230n0 c0230n3 = (C0230n0) obj;
                if (c0230n3.m605X()) {
                    c0230n3.m642s0(false);
                }
                break;
            case 8:
                C0230n0 c0230n4 = (C0230n0) obj;
                if (c0230n4.m605X()) {
                    c0230n4.m642s0(false);
                }
                break;
            case 9:
                C0230n0 c0230n5 = (C0230n0) obj;
                if (c0230n5.m605X()) {
                    C0230n0.m574t0(c0230n5, false, 7);
                }
                break;
            case 10:
                C0230n0 c0230n6 = (C0230n0) obj;
                if (c0230n6.m605X()) {
                    C0230n0.m575v0(c0230n6, false, 7);
                }
                break;
            default:
                C0230n0 c0230n7 = (C0230n0) obj;
                if (c0230n7.m605X()) {
                    c0230n7.m603V();
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
