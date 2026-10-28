package androidx.compose.p018ui.node;

import al.AbstractC0954a;
import android.os.Build;
import android.view.ViewParent;
import androidx.compose.p018ui.platform.AndroidComposeView;
import c93.InterfaceC4339a;
import ge3.AbstractC15751g;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;
import m83.AbstractC25260n;
import no.nordicsemi.android.dfu.DfuBaseService;
import p002a0.AbstractC0065z0;
import p002a0.C0032j0;
import p002a0.C0039m0;
import p002a0.C0047q0;
import p005a3.AbstractC0201g;
import p005a3.AbstractC0232n2;
import p005a3.AbstractC0233o;
import p005a3.AbstractC0242q0;
import p005a3.AbstractC0247r1;
import p005a3.AbstractC0262w0;
import p005a3.AbstractC0265x0;
import p005a3.C0193e;
import p005a3.C0197f;
import p005a3.C0222l0;
import p005a3.C0223l1;
import p005a3.C0224l2;
import p005a3.C0230n0;
import p005a3.C0231n1;
import p005a3.C0235o1;
import p005a3.C0237p;
import p005a3.C0238p0;
import p005a3.C0239p1;
import p005a3.C0243q1;
import p005a3.C0258v;
import p005a3.C0270z;
import p005a3.InterfaceC0178a0;
import p005a3.InterfaceC0180a2;
import p005a3.InterfaceC0184b2;
import p005a3.InterfaceC0192d2;
import p005a3.InterfaceC0200f2;
import p005a3.InterfaceC0245r;
import p026b2.AbstractC2316v;
import p027b3.C2374f2;
import p031b9.AbstractC2875y;
import p097ds.AbstractC12313p;
import p097ds.AbstractC12314q;
import p108e4.AbstractC12667a;
import p181h2.C16616a;
import p181h2.C16617b;
import p181h2.C16618c;
import p181h2.C16619d;
import p208i2.AbstractC17888h0;
import p208i2.AbstractC17904p0;
import p208i2.AbstractC17918w0;
import p208i2.C17881e1;
import p208i2.C17891j;
import p208i2.C17896l0;
import p208i2.C17898m0;
import p208i2.C17900n0;
import p208i2.C17902o0;
import p208i2.C17919x;
import p208i2.C17920x0;
import p208i2.InterfaceC17883f0;
import p208i2.InterfaceC17910s0;
import p208i2.InterfaceC17915v;
import p270k2.C22128b;
import p293l2.C23226c;
import p293l2.InterfaceC23228e;
import p446r1.C30849c;
import p512u2.AbstractC34454d0;
import p512u2.InterfaceC34457f;
import p549vb.AbstractC35862g;
import p581we.C37199o;
import p603x2.AbstractC37831a;
import p635y2.AbstractC39071a;
import p635y2.AbstractC39125q1;
import p635y2.C39121p0;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39147y;
import p636y3.C39178j;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p652yl.C39615a;
import p668z1.AbstractC39957f;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import ug.AbstractC34924m;
import v63.AbstractC35744b;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes.dex */
public abstract class NodeCoordinator extends AbstractC0262w0 implements InterfaceC39124q0, InterfaceC39147y, InterfaceC0184b2 {

    /* JADX INFO: renamed from: k0 */
    public static final C17920x0 f4853k0;

    /* JADX INFO: renamed from: l0 */
    public static final C0270z f4854l0;

    /* JADX INFO: renamed from: m0 */
    public static final float[] f4855m0;

    /* JADX INFO: renamed from: n0 */
    public static final C0193e f4856n0;

    /* JADX INFO: renamed from: o0 */
    public static final C0193e f4857o0;

    /* JADX INFO: renamed from: O */
    public final C0230n0 f4858O;

    /* JADX INFO: renamed from: P */
    public NodeCoordinator f4859P;

    /* JADX INFO: renamed from: Q */
    public NodeCoordinator f4860Q;

    /* JADX INFO: renamed from: R */
    public boolean f4861R;

    /* JADX INFO: renamed from: S */
    public boolean f4862S;

    /* JADX INFO: renamed from: T */
    public Function1 f4863T;

    /* JADX INFO: renamed from: U */
    public InterfaceC39171c f4864U;

    /* JADX INFO: renamed from: V */
    public EnumC39181m f4865V;

    /* JADX INFO: renamed from: X */
    public InterfaceC39130s0 f4867X;

    /* JADX INFO: renamed from: Y */
    public C0039m0 f4868Y;

    /* JADX INFO: renamed from: a0 */
    public float f4870a0;

    /* JADX INFO: renamed from: b0 */
    public C16616a f4871b0;

    /* JADX INFO: renamed from: c0 */
    public C0270z f4872c0;

    /* JADX INFO: renamed from: d0 */
    public C23226c f4873d0;

    /* JADX INFO: renamed from: e0 */
    public InterfaceC17915v f4874e0;

    /* JADX INFO: renamed from: f0 */
    public C0231n1 f4875f0;

    /* JADX INFO: renamed from: h0 */
    public boolean f4877h0;

    /* JADX INFO: renamed from: i0 */
    public InterfaceC0180a2 f4878i0;

    /* JADX INFO: renamed from: j0 */
    public C23226c f4879j0;

    /* JADX INFO: renamed from: W */
    public float f4866W = 0.8f;

    /* JADX INFO: renamed from: Z */
    public long f4869Z = 0;

    /* JADX INFO: renamed from: g0 */
    public final C0235o1 f4876g0 = new C0235o1(this, 1);

    static {
        C17920x0 c17920x0 = new C17920x0();
        c17920x0.f69660x = 1.0f;
        c17920x0.f69661y = 1.0f;
        c17920x0.f69662z = 1.0f;
        long j7 = AbstractC17888h0.f69583a;
        c17920x0.f69643H = j7;
        c17920x0.f69644I = j7;
        c17920x0.f69648M = 8.0f;
        c17920x0.f69649N = C17881e1.f69566b;
        c17920x0.f69650O = AbstractC17918w0.f69621a;
        c17920x0.f69652Q = 0;
        c17920x0.f69653R = 9205357640488583168L;
        c17920x0.f69654S = AbstractC35862g.m113838a();
        c17920x0.f69655T = EnumC39181m.f168423w;
        c17920x0.f69657V = 3;
        f4853k0 = c17920x0;
        f4854l0 = new C0270z();
        f4855m0 = C17896l0.m51471a();
        f4856n0 = new C0193e(1);
        f4857o0 = new C0193e(2);
    }

    public NodeCoordinator(C0230n0 c0230n0) {
        this.f4858O = c0230n0;
        this.f4864U = c0230n0.f776X;
        this.f4865V = c0230n0.f777Y;
    }

    /* JADX INFO: renamed from: A1 */
    public static NodeCoordinator m3506A1(InterfaceC39147y interfaceC39147y) {
        NodeCoordinator nodeCoordinator;
        C39121p0 c39121p0 = interfaceC39147y instanceof C39121p0 ? (C39121p0) interfaceC39147y : null;
        if (c39121p0 != null && (nodeCoordinator = c39121p0.f168257w.f904O) != null) {
            return nodeCoordinator;
        }
        AbstractC22676k.m65748h(interfaceC39147y, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (NodeCoordinator) interfaceC39147y;
    }

    /* JADX INFO: renamed from: B1 */
    public final long m3507B1(long j7) {
        InterfaceC0180a2 interfaceC0180a2 = this.f4878i0;
        if (interfaceC0180a2 != null) {
            j7 = ((C2374f2) interfaceC0180a2).m7309d(j7, false);
        }
        long j13 = this.f4869Z;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32)) + ((int) (j13 >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j7 & 4294967295L)) + ((int) (j13 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX INFO: renamed from: C1 */
    public final C16618c m3508C1() {
        if (mo3533g1().f9141N) {
            InterfaceC39147y interfaceC39147yM124662h = AbstractC39125q1.m124662h(this);
            C16616a c16616a = this.f4871b0;
            if (c16616a == null) {
                c16616a = new C16616a();
                this.f4871b0 = c16616a;
            }
            long jM3520X0 = m3520X0(m3531f1());
            int i13 = (int) (jM3520X0 >> 32);
            c16616a.f63933a = -Float.intBitsToFloat(i13);
            int i14 = (int) (jM3520X0 & 4294967295L);
            c16616a.f63934b = -Float.intBitsToFloat(i14);
            c16616a.f63935c = Float.intBitsToFloat(i13) + mo452j0();
            c16616a.f63936d = Float.intBitsToFloat(i14) + mo451g0();
            NodeCoordinator nodeCoordinator = this;
            while (nodeCoordinator != interfaceC39147yM124662h) {
                nodeCoordinator.m3554x1(c16616a, false, true);
                if (!c16616a.m47184b()) {
                    nodeCoordinator = nodeCoordinator.f4860Q;
                    AbstractC22676k.m65747g(nodeCoordinator);
                }
            }
            return new C16618c(c16616a.f63933a, c16616a.f63934b, c16616a.f63935c, c16616a.f63936d);
        }
        return C16618c.f63938e;
    }

    /* JADX INFO: renamed from: D1 */
    public final void m3509D1(NodeCoordinator nodeCoordinator, float[] fArr) {
        float[] fArrM7306a;
        if (AbstractC22676k.m65745e(nodeCoordinator, this)) {
            return;
        }
        NodeCoordinator nodeCoordinator2 = this.f4860Q;
        AbstractC22676k.m65747g(nodeCoordinator2);
        nodeCoordinator2.m3509D1(nodeCoordinator, fArr);
        if (!C39178j.m124792b(this.f4869Z, 0L)) {
            float[] fArr2 = f4855m0;
            C17896l0.m51474d(fArr2);
            long j7 = this.f4869Z;
            C17896l0.m51477g(fArr2, -((int) (j7 >> 32)), -((int) (j7 & 4294967295L)));
            C17896l0.m51476f(fArr, fArr2);
        }
        InterfaceC0180a2 interfaceC0180a2 = this.f4878i0;
        if (interfaceC0180a2 == null || (fArrM7306a = ((C2374f2) interfaceC0180a2).m7306a()) == null) {
            return;
        }
        C17896l0.m51476f(fArr, fArrM7306a);
    }

    @Override // p635y2.InterfaceC39147y
    /* JADX INFO: renamed from: E */
    public final long mo3510E(long j7) {
        long jMo3523Z = mo3523Z(j7);
        AndroidComposeView androidComposeView = (AndroidComposeView) AbstractC0242q0.m750a(this.f4858O);
        androidComposeView.m3574F();
        return C17896l0.m51472b(jMo3523Z, androidComposeView.f4965v0);
    }

    /* JADX INFO: renamed from: E1 */
    public final void m3511E1(NodeCoordinator nodeCoordinator, float[] fArr) {
        NodeCoordinator nodeCoordinator2 = this;
        while (!nodeCoordinator2.equals(nodeCoordinator)) {
            InterfaceC0180a2 interfaceC0180a2 = nodeCoordinator2.f4878i0;
            if (interfaceC0180a2 != null) {
                C17896l0.m51476f(fArr, ((C2374f2) interfaceC0180a2).m7307b());
            }
            long j7 = nodeCoordinator2.f4869Z;
            if (!C39178j.m124792b(j7, 0L)) {
                float[] fArr2 = f4855m0;
                C17896l0.m51474d(fArr2);
                C17896l0.m51477g(fArr2, (int) (j7 >> 32), (int) (j7 & 4294967295L));
                C17896l0.m51476f(fArr, fArr2);
            }
            nodeCoordinator2 = nodeCoordinator2.f4860Q;
            AbstractC22676k.m65747g(nodeCoordinator2);
        }
    }

    /* JADX INFO: renamed from: F1 */
    public final void m3512F1(Function1 function1, boolean z4) {
        Owner owner;
        C30849c c30849c;
        Reference referencePoll;
        if (function1 != null && this.f4879j0 != null) {
            AbstractC37831a.m121373a("layerBlock can't be provided when explicitLayer is provided");
        }
        C0230n0 c0230n0 = this.f4858O;
        boolean z13 = (!z4 && this.f4863T == function1 && AbstractC22676k.m65745e(this.f4864U, c0230n0.f776X) && this.f4865V == c0230n0.f777Y) ? false : true;
        this.f4864U = c0230n0.f776X;
        this.f4865V = c0230n0.f777Y;
        boolean zM605X = c0230n0.m605X();
        C0235o1 c0235o1 = this.f4876g0;
        if (zM605X && function1 != null) {
            this.f4863T = function1;
            if (this.f4878i0 != null) {
                if (z13 && m3513G1(true)) {
                    c0230n0.m628k0();
                    AbstractC0242q0.m750a(c0230n0).getRectManager().m59672f(c0230n0);
                    return;
                }
                return;
            }
            Owner ownerM750a = AbstractC0242q0.m750a(c0230n0);
            C0231n1 c0231n1 = this.f4875f0;
            if (c0231n1 == null) {
                C0231n1 c0231n2 = new C0231n1(0, this, new C0235o1(this, 0));
                this.f4875f0 = c0231n2;
                c0231n1 = c0231n2;
            }
            InterfaceC0180a2 interfaceC0180a2M3584g = ((AndroidComposeView) ownerM750a).m3584g(c0231n1, c0235o1, null);
            C2374f2 c2374f2 = (C2374f2) interfaceC0180a2M3584g;
            c2374f2.m7311f(this.f168213y);
            c2374f2.m7310e(this.f4869Z);
            this.f4878i0 = interfaceC0180a2M3584g;
            m3513G1(true);
            c0230n0.f786h0 = true;
            c0235o1.invoke();
            return;
        }
        this.f4863T = null;
        InterfaceC0180a2 interfaceC0180a2 = this.f4878i0;
        if (interfaceC0180a2 != null) {
            C2374f2 c2374f3 = (C2374f2) interfaceC0180a2;
            AndroidComposeView androidComposeView = c2374f3.f9379y;
            if (!AbstractC17918w0.m51534v(c2374f3.m7307b())) {
                c0230n0.m628k0();
            }
            c2374f3.f9380z = null;
            c2374f3.f9360E = null;
            c2374f3.f9362G = true;
            if (c2374f3.f9365J) {
                c2374f3.f9365J = false;
                androidComposeView.m3594z(c2374f3, false);
            }
            InterfaceC17883f0 interfaceC17883f0 = c2374f3.f9378x;
            if (interfaceC17883f0 != null) {
                interfaceC17883f0.mo51441b(c2374f3.f9377w);
                C37199o c37199o = androidComposeView.f4929U0;
                do {
                    ReferenceQueue referenceQueue = (ReferenceQueue) c37199o.f159041x;
                    c30849c = (C30849c) c37199o.f159040w;
                    referencePoll = referenceQueue.poll();
                    if (referencePoll != null) {
                        c30849c.m94893k(referencePoll);
                    }
                } while (referencePoll != null);
                c30849c.m94885b(new WeakReference(c2374f3, (ReferenceQueue) c37199o.f159041x));
                androidComposeView.f4937a0.remove(c2374f3);
            }
            c0230n0.f786h0 = true;
            c0235o1.invoke();
            if (mo3533g1().f9141N && c0230n0.m606Y() && (owner = c0230n0.f765M) != null) {
                ((AndroidComposeView) owner).m3570B(c0230n0);
            }
        }
        this.f4878i0 = null;
        this.f4877h0 = false;
    }

    /* JADX INFO: renamed from: G1 */
    public final boolean m3513G1(boolean z4) {
        boolean z13;
        Owner owner;
        InterfaceC4339a interfaceC4339a;
        int i13;
        InterfaceC4339a interfaceC4339a2;
        if (this.f4879j0 != null) {
            return false;
        }
        InterfaceC0180a2 interfaceC0180a2 = this.f4878i0;
        if (interfaceC0180a2 == null) {
            if (this.f4863T == null) {
                return false;
            }
            AbstractC37831a.m121374b("null layer with a non-null layerBlock");
            return false;
        }
        Function1 function1 = this.f4863T;
        if (function1 == null) {
            throw AbstractC2875y.m8310w("updateLayerParameters requires a non-null layerBlock");
        }
        C17920x0 c17920x0 = f4853k0;
        c17920x0.m51560p(1.0f);
        c17920x0.m51561r(1.0f);
        c17920x0.m51551a(1.0f);
        c17920x0.m51549C(0.0f);
        c17920x0.m51550E(0.0f);
        c17920x0.m51562s(0.0f);
        long j7 = AbstractC17888h0.f69583a;
        c17920x0.m51552b(j7);
        c17920x0.m51564v(j7);
        c17920x0.m51557k(0.0f);
        c17920x0.m51558n(0.0f);
        c17920x0.m51559o(0.0f);
        c17920x0.m51553c(8.0f);
        long j13 = C17881e1.f69566b;
        c17920x0.m51565y(j13);
        c17920x0.m51563t(AbstractC17918w0.f69621a);
        c17920x0.m51554e(false);
        c17920x0.m51556g(null);
        if (c17920x0.f69657V != 3) {
            c17920x0.f69659w |= 524288;
            c17920x0.f69657V = 3;
        }
        c17920x0.m51555f(0);
        c17920x0.f69653R = 9205357640488583168L;
        c17920x0.f69658W = null;
        c17920x0.f69659w = 0;
        C0230n0 c0230n0 = this.f4858O;
        c17920x0.f69654S = c0230n0.f776X;
        c17920x0.f69655T = c0230n0.f777Y;
        c17920x0.f69653R = AbstractC35744b.m113239l(this.f168213y);
        AbstractC0242q0.m750a(c0230n0).getSnapshotObserver().m457a(this, C0197f.f636E, new C0222l0(function1, 1));
        C0270z c0270z = this.f4872c0;
        if (c0270z == null) {
            c0270z = new C0270z();
            this.f4872c0 = c0270z;
        }
        C0270z c0270z2 = f4854l0;
        c0270z2.getClass();
        c0270z2.f922a = c0270z.f922a;
        c0270z2.f923b = c0270z.f923b;
        c0270z2.f924c = c0270z.f924c;
        c0270z2.f925d = c0270z.f925d;
        c0270z2.f926e = c0270z.f926e;
        c0270z2.f927f = c0270z.f927f;
        c0270z2.f928g = c0270z.f928g;
        c0270z2.f929h = c0270z.f929h;
        c0270z2.f930i = c0270z.f930i;
        float f13 = c17920x0.f69660x;
        c0270z.f922a = f13;
        c0270z.f923b = c17920x0.f69661y;
        c0270z.f924c = c17920x0.f69640E;
        c0270z.f925d = c17920x0.f69641F;
        c0270z.f926e = c17920x0.f69645J;
        c0270z.f927f = c17920x0.f69646K;
        c0270z.f928g = c17920x0.f69647L;
        c0270z.f929h = c17920x0.f69648M;
        long j14 = c17920x0.f69649N;
        c0270z.f930i = j14;
        C2374f2 c2374f2 = (C2374f2) interfaceC0180a2;
        AndroidComposeView androidComposeView = c2374f2.f9379y;
        int i14 = c17920x0.f69659w | c2374f2.f9369N;
        c2374f2.f9367L = c17920x0.f69655T;
        c2374f2.f9366K = c17920x0.f69654S;
        int i15 = i14 & 4096;
        if (i15 != 0) {
            c2374f2.f9370O = j14;
        }
        if ((i14 & 1) != 0) {
            InterfaceC23228e interfaceC23228e = c2374f2.f9377w.f91965a;
            if (interfaceC23228e.mo67254z() != f13) {
                interfaceC23228e.mo67245q(f13);
            }
        }
        if ((i14 & 2) != 0) {
            C23226c c23226c = c2374f2.f9377w;
            float f14 = c17920x0.f69661y;
            InterfaceC23228e interfaceC23228e2 = c23226c.f91965a;
            if (interfaceC23228e2.mo67228O() != f14) {
                interfaceC23228e2.mo67219F(f14);
            }
        }
        if ((i14 & 4) != 0) {
            c2374f2.f9377w.m67212e(c17920x0.f69662z);
        }
        if ((i14 & 8) != 0) {
            C23226c c23226c2 = c2374f2.f9377w;
            float f15 = c17920x0.f69640E;
            InterfaceC23228e interfaceC23228e3 = c23226c2.f91965a;
            if (interfaceC23228e3.mo67223J() != f15) {
                interfaceC23228e3.mo67226M(f15);
            }
        }
        if ((i14 & 16) != 0) {
            C23226c c23226c3 = c2374f2.f9377w;
            float f16 = c17920x0.f69641F;
            InterfaceC23228e interfaceC23228e4 = c23226c3.f91965a;
            if (interfaceC23228e4.mo67222I() != f16) {
                interfaceC23228e4.mo67231c(f16);
            }
        }
        if ((i14 & 32) != 0) {
            C23226c c23226c4 = c2374f2.f9377w;
            float f17 = c17920x0.f69642G;
            InterfaceC23228e interfaceC23228e5 = c23226c4.f91965a;
            if (interfaceC23228e5.mo67227N() != f17) {
                interfaceC23228e5.mo67215B(f17);
                c23226c4.f91971g = true;
                c23226c4.m67208a();
            }
            if (c17920x0.f69642G > 0.0f && !c2374f2.f9375T && (interfaceC4339a2 = c2374f2.f9360E) != null) {
                interfaceC4339a2.invoke();
            }
        }
        if ((i14 & 64) != 0) {
            C23226c c23226c5 = c2374f2.f9377w;
            long j15 = c17920x0.f69643H;
            InterfaceC23228e interfaceC23228e6 = c23226c5.f91965a;
            if (!C17919x.m51542d(j15, interfaceC23228e6.mo67240l())) {
                interfaceC23228e6.mo67243o(j15);
            }
        }
        if ((i14 & 128) != 0) {
            C23226c c23226c6 = c2374f2.f9377w;
            long j16 = c17920x0.f69644I;
            InterfaceC23228e interfaceC23228e7 = c23226c6.f91965a;
            if (!C17919x.m51542d(j16, interfaceC23228e7.mo67242n())) {
                interfaceC23228e7.mo67248t(j16);
            }
        }
        if ((i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            C23226c c23226c7 = c2374f2.f9377w;
            float f18 = c17920x0.f69647L;
            InterfaceC23228e interfaceC23228e8 = c23226c7.f91965a;
            if (interfaceC23228e8.mo67239k() != f18) {
                interfaceC23228e8.mo67216C(f18);
            }
        }
        if ((i14 & 256) != 0) {
            C23226c c23226c8 = c2374f2.f9377w;
            float f19 = c17920x0.f69645J;
            InterfaceC23228e interfaceC23228e9 = c23226c8.f91965a;
            if (interfaceC23228e9.mo67224K() != f19) {
                interfaceC23228e9.mo67251w(f19);
            }
        }
        if ((i14 & 512) != 0) {
            C23226c c23226c9 = c2374f2.f9377w;
            float f24 = c17920x0.f69646K;
            InterfaceC23228e interfaceC23228e10 = c23226c9.f91965a;
            if (interfaceC23228e10.mo67237i() != f24) {
                interfaceC23228e10.mo67253y(f24);
            }
        }
        if ((i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            C23226c c23226c10 = c2374f2.f9377w;
            float f25 = c17920x0.f69648M;
            InterfaceC23228e interfaceC23228e11 = c23226c10.f91965a;
            if (interfaceC23228e11.mo67246r() != f25) {
                interfaceC23228e11.mo67250v(f25);
            }
        }
        if (i15 != 0) {
            if (C17881e1.m51436a(c2374f2.f9370O, j13)) {
                C23226c c23226c11 = c2374f2.f9377w;
                if (!C16617b.m47187c(c23226c11.f91986v, 9205357640488583168L)) {
                    c23226c11.f91986v = 9205357640488583168L;
                    c23226c11.f91965a.mo67220G(9205357640488583168L);
                }
            } else {
                C23226c c23226c12 = c2374f2.f9377w;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(C17881e1.m51438c(c2374f2.f9370O) * ((int) (c2374f2.f9361F & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(C17881e1.m51437b(c2374f2.f9370O) * ((int) (c2374f2.f9361F >> 32)))) << 32);
                if (!C16617b.m47187c(c23226c12.f91986v, jFloatToRawIntBits)) {
                    c23226c12.f91986v = jFloatToRawIntBits;
                    c23226c12.f91965a.mo67220G(jFloatToRawIntBits);
                }
            }
        }
        if ((i14 & DfuBaseService.ERROR_CONNECTION_MASK) != 0) {
            C23226c c23226c13 = c2374f2.f9377w;
            boolean z14 = c17920x0.f69651P;
            if (c23226c13.f91987w != z14) {
                c23226c13.f91987w = z14;
                c23226c13.f91971g = true;
                c23226c13.m67208a();
            }
        }
        if ((131072 & i14) != 0) {
            C23226c c23226c14 = c2374f2.f9377w;
            AbstractC0954a abstractC0954a = c17920x0.f69656U;
            InterfaceC23228e interfaceC23228e12 = c23226c14.f91965a;
            if (!AbstractC22676k.m65745e(interfaceC23228e12.mo67230b(), abstractC0954a)) {
                interfaceC23228e12.mo67241m(abstractC0954a);
            }
        }
        if ((262144 & i14) != 0) {
            InterfaceC23228e interfaceC23228e13 = c2374f2.f9377w.f91965a;
            if (!AbstractC22676k.m65745e(interfaceC23228e13.mo67236h(), null)) {
                interfaceC23228e13.mo67244p();
            }
        }
        if ((i14 & 524288) != 0) {
            C23226c c23226c15 = c2374f2.f9377w;
            int i16 = c17920x0.f69657V;
            InterfaceC23228e interfaceC23228e14 = c23226c15.f91965a;
            if (interfaceC23228e14.mo67252x() != i16) {
                interfaceC23228e14.mo67232d(i16);
            }
        }
        if ((32768 & i14) != 0) {
            C23226c c23226c16 = c2374f2.f9377w;
            int i17 = c17920x0.f69652Q;
            if (i17 == 0) {
                i13 = 0;
            } else if (i17 == 1) {
                i13 = 1;
            } else {
                i13 = 2;
                if (i17 != 2) {
                    throw new IllegalStateException("Not supported composition strategy");
                }
            }
            InterfaceC23228e interfaceC23228e15 = c23226c16.f91965a;
            if (interfaceC23228e15.mo67235g() != i13) {
                interfaceC23228e15.mo67225L(i13);
            }
        }
        if ((i14 & 7963) != 0) {
            c2374f2.f9372Q = true;
            c2374f2.f9373R = true;
        }
        if (AbstractC22676k.m65745e(c2374f2.f9371P, c17920x0.f69658W)) {
            z13 = false;
        } else {
            AbstractC17904p0 abstractC17904p0 = c17920x0.f69658W;
            c2374f2.f9371P = abstractC17904p0;
            if (abstractC17904p0 != null) {
                C23226c c23226c17 = c2374f2.f9377w;
                if (abstractC17904p0 instanceof C17900n0) {
                    C16618c c16618c = ((C17900n0) abstractC17904p0).f69601a;
                    float f26 = c16618c.f63939a;
                    float f27 = c16618c.f63940b;
                    c23226c17.m67213f((((long) Float.floatToRawIntBits(f26)) << 32) | (((long) Float.floatToRawIntBits(f27)) & 4294967295L), (((long) Float.floatToRawIntBits(c16618c.f63941c - f26)) << 32) | (((long) Float.floatToRawIntBits(c16618c.f63942d - f27)) & 4294967295L), 0.0f);
                } else if (abstractC17904p0 instanceof C17898m0) {
                    InterfaceC17910s0 interfaceC17910s0 = ((C17898m0) abstractC17904p0).f69599a;
                    c23226c17.f91975k = null;
                    c23226c17.f91973i = 9205357640488583168L;
                    c23226c17.f91972h = 0L;
                    c23226c17.f91974j = 0.0f;
                    c23226c17.f91971g = true;
                    c23226c17.f91978n = false;
                    c23226c17.f91976l = interfaceC17910s0;
                    c23226c17.m67208a();
                } else {
                    if (!(abstractC17904p0 instanceof C17902o0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    C17902o0 c17902o0 = (C17902o0) abstractC17904p0;
                    C17891j c17891j = c17902o0.f69603b;
                    if (c17891j != null) {
                        c23226c17.f91975k = null;
                        c23226c17.f91973i = 9205357640488583168L;
                        c23226c17.f91972h = 0L;
                        c23226c17.f91974j = 0.0f;
                        c23226c17.f91971g = true;
                        c23226c17.f91978n = false;
                        c23226c17.f91976l = c17891j;
                        c23226c17.m67208a();
                    } else {
                        C16619d c16619d = c17902o0.f69602a;
                        c23226c17.m67213f((((long) Float.floatToRawIntBits(c16619d.f63944b)) & 4294967295L) | (((long) Float.floatToRawIntBits(c16619d.f63943a)) << 32), (((long) Float.floatToRawIntBits(c16619d.m47208b())) << 32) | (((long) Float.floatToRawIntBits(c16619d.m47207a())) & 4294967295L), Float.intBitsToFloat((int) (c16619d.f63950h >> 32)));
                    }
                }
                if ((abstractC17904p0 instanceof C17898m0) && Build.VERSION.SDK_INT < 33 && (interfaceC4339a = c2374f2.f9360E) != null) {
                    interfaceC4339a.invoke();
                }
            }
            z13 = true;
        }
        c2374f2.f9369N = c17920x0.f69659w;
        if (i14 != 0 || z13) {
            ViewParent parent = androidComposeView.getParent();
            if (parent != null) {
                parent.onDescendantInvalidated(androidComposeView, androidComposeView);
            }
            if (androidComposeView.f4898F) {
                androidComposeView.m3583P(0.0f);
            }
        }
        boolean z15 = this.f4862S;
        this.f4862S = c17920x0.f69651P;
        this.f4866W = c17920x0.f69662z;
        boolean z16 = c0270z2.f922a == c0270z.f922a && c0270z2.f923b == c0270z.f923b && c0270z2.f924c == c0270z.f924c && c0270z2.f925d == c0270z.f925d && c0270z2.f926e == c0270z.f926e && c0270z2.f927f == c0270z.f927f && c0270z2.f928g == c0270z.f928g && c0270z2.f929h == c0270z.f929h && C17881e1.m51436a(c0270z2.f930i, c0270z.f930i);
        boolean z17 = !z16;
        if (z4 && ((!z16 || z15 != this.f4862S) && (owner = c0230n0.f765M) != null)) {
            ((AndroidComposeView) owner).m3570B(c0230n0);
        }
        return z17;
    }

    /* JADX INFO: renamed from: H1 */
    public final boolean m3514H1(long j7) {
        if ((((9187343241974906880L ^ (j7 & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        InterfaceC0180a2 interfaceC0180a2 = this.f4878i0;
        if (interfaceC0180a2 != null && this.f4862S) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L));
            C23226c c23226c = ((C2374f2) interfaceC0180a2).f9377w;
            if (!(c23226c.f91987w ? AbstractC12667a.m35434E(c23226c.m67211d(), fIntBitsToFloat, fIntBitsToFloat2) : true)) {
                return false;
            }
        }
        return true;
    }

    @Override // p005a3.AbstractC0262w0
    /* JADX INFO: renamed from: I0 */
    public final AbstractC0262w0 mo785I0() {
        return this.f4859P;
    }

    @Override // p005a3.AbstractC0262w0
    /* JADX INFO: renamed from: L0 */
    public final InterfaceC39147y mo786L0() {
        return this;
    }

    @Override // p005a3.AbstractC0262w0
    /* JADX INFO: renamed from: M0 */
    public final boolean mo787M0() {
        return this.f4867X != null;
    }

    @Override // p635y2.InterfaceC39147y
    /* JADX INFO: renamed from: N */
    public final void mo3515N(float[] fArr) {
        Owner ownerM750a = AbstractC0242q0.m750a(this.f4858O);
        NodeCoordinator nodeCoordinatorM3506A1 = m3506A1(AbstractC39125q1.m124662h(this));
        m3511E1(nodeCoordinatorM3506A1, fArr);
        if (ownerM750a instanceof InterfaceC34457f) {
            ((AndroidComposeView) ((InterfaceC34457f) ownerM750a)).m3590u(fArr);
            return;
        }
        long jMo3516S = nodeCoordinatorM3506A1.mo3516S(0L);
        if ((9223372034707292159L & jMo3516S) != 9205357640488583168L) {
            C17896l0.m51477g(fArr, Float.intBitsToFloat((int) (jMo3516S >> 32)), Float.intBitsToFloat((int) (jMo3516S & 4294967295L)));
        }
    }

    @Override // p005a3.AbstractC0262w0
    /* JADX INFO: renamed from: N0 */
    public final C0230n0 mo788N0() {
        return this.f4858O;
    }

    @Override // p005a3.AbstractC0262w0
    /* JADX INFO: renamed from: O0 */
    public final InterfaceC39130s0 mo789O0() {
        InterfaceC39130s0 interfaceC39130s0 = this.f4867X;
        if (interfaceC39130s0 != null) {
            return interfaceC39130s0;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    @Override // p005a3.AbstractC0262w0
    /* JADX INFO: renamed from: P0 */
    public final AbstractC0262w0 mo790P0() {
        return this.f4860Q;
    }

    @Override // p005a3.AbstractC0262w0
    /* JADX INFO: renamed from: Q0 */
    public final long mo791Q0() {
        return this.f4869Z;
    }

    @Override // p635y2.InterfaceC39147y
    /* JADX INFO: renamed from: S */
    public final long mo3516S(long j7) {
        if (!mo3533g1().f9141N) {
            AbstractC37831a.m121374b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((AndroidComposeView) AbstractC0242q0.m750a(this.f4858O)).m3591v(mo3523Z(j7));
    }

    @Override // p005a3.InterfaceC0184b2
    /* JADX INFO: renamed from: U */
    public final boolean mo432U() {
        return (this.f4878i0 == null || this.f4861R || !this.f4858O.m605X()) ? false : true;
    }

    @Override // p005a3.AbstractC0262w0
    /* JADX INFO: renamed from: U0 */
    public final void mo794U0() {
        C23226c c23226c = this.f4879j0;
        if (c23226c != null) {
            mo455p0(this.f4869Z, this.f4870a0, c23226c);
        } else {
            mo453o0(this.f4869Z, this.f4870a0, this.f4863T);
        }
    }

    @Override // p635y2.InterfaceC39147y
    /* JADX INFO: renamed from: V */
    public final InterfaceC39147y mo3517V() {
        if (!mo3533g1().f9141N) {
            AbstractC37831a.m121374b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        m3546q1();
        return ((NodeCoordinator) this.f4858O.f783e0.f741e).f4860Q;
    }

    /* JADX INFO: renamed from: V0 */
    public final void m3518V0(NodeCoordinator nodeCoordinator, C16616a c16616a, boolean z4) {
        if (nodeCoordinator == this) {
            return;
        }
        NodeCoordinator nodeCoordinator2 = this.f4860Q;
        if (nodeCoordinator2 != null) {
            nodeCoordinator2.m3518V0(nodeCoordinator, c16616a, z4);
        }
        long j7 = this.f4869Z;
        float f13 = (int) (j7 >> 32);
        c16616a.f63933a -= f13;
        c16616a.f63935c -= f13;
        float f14 = (int) (j7 & 4294967295L);
        c16616a.f63934b -= f14;
        c16616a.f63936d -= f14;
        InterfaceC0180a2 interfaceC0180a2 = this.f4878i0;
        if (interfaceC0180a2 != null) {
            ((C2374f2) interfaceC0180a2).m7308c(c16616a, true);
            if (this.f4862S && z4) {
                long j13 = this.f168213y;
                c16616a.m47183a(0.0f, 0.0f, (int) (j13 >> 32), (int) (j13 & 4294967295L));
            }
        }
    }

    /* JADX INFO: renamed from: W0 */
    public final long m3519W0(NodeCoordinator nodeCoordinator, long j7) {
        if (nodeCoordinator == this) {
            return j7;
        }
        NodeCoordinator nodeCoordinator2 = this.f4860Q;
        return (nodeCoordinator2 == null || AbstractC22676k.m65745e(nodeCoordinator, nodeCoordinator2)) ? m3529d1(j7) : m3529d1(nodeCoordinator2.m3519W0(nodeCoordinator, j7));
    }

    /* JADX INFO: renamed from: X0 */
    public final long m3520X0(long j7) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32)) - mo452j0();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L)) - mo451g0();
        float fMax = Math.max(0.0f, fIntBitsToFloat / 2.0f);
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat2 / 2.0f))) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
    }

    @Override // p635y2.InterfaceC39147y
    /* JADX INFO: renamed from: Y */
    public final void mo3521Y(InterfaceC39147y interfaceC39147y, float[] fArr) {
        NodeCoordinator nodeCoordinatorM3506A1 = m3506A1(interfaceC39147y);
        nodeCoordinatorM3506A1.m3546q1();
        NodeCoordinator nodeCoordinatorM3528c1 = m3528c1(nodeCoordinatorM3506A1);
        C17896l0.m51474d(fArr);
        nodeCoordinatorM3506A1.m3511E1(nodeCoordinatorM3528c1, fArr);
        m3509D1(nodeCoordinatorM3528c1, fArr);
    }

    /* JADX INFO: renamed from: Y0 */
    public final float m3522Y0(long j7, long j13) {
        if (mo452j0() >= Float.intBitsToFloat((int) (j13 >> 32)) && mo451g0() >= Float.intBitsToFloat((int) (j13 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jM3520X0 = m3520X0(j13);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM3520X0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM3520X0 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j7 >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat3 < 0.0f ? -fIntBitsToFloat3 : fIntBitsToFloat3 - mo452j0());
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j7 & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat4 < 0.0f ? -fIntBitsToFloat4 : fIntBitsToFloat4 - mo451g0()))) & 4294967295L) | (((long) Float.floatToRawIntBits(fMax)) << 32);
        if (fIntBitsToFloat > 0.0f || fIntBitsToFloat2 > 0.0f) {
            int i13 = (int) (jFloatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i13) <= fIntBitsToFloat) {
                int i14 = (int) (jFloatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i14) <= fIntBitsToFloat2) {
                    float fIntBitsToFloat5 = Float.intBitsToFloat(i13);
                    float fIntBitsToFloat6 = Float.intBitsToFloat(i14);
                    return (fIntBitsToFloat6 * fIntBitsToFloat6) + (fIntBitsToFloat5 * fIntBitsToFloat5);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    @Override // p635y2.InterfaceC39147y
    /* JADX INFO: renamed from: Z */
    public final long mo3523Z(long j7) {
        if (!mo3533g1().f9141N) {
            AbstractC37831a.m121374b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        m3546q1();
        for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.f4860Q) {
            j7 = nodeCoordinator.m3507B1(j7);
        }
        return j7;
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m3524Z0(InterfaceC17915v interfaceC17915v, C23226c c23226c) {
        InterfaceC0180a2 interfaceC0180a2 = this.f4878i0;
        if (interfaceC0180a2 == null) {
            long j7 = this.f4869Z;
            float f13 = (int) (j7 >> 32);
            float f14 = (int) (j7 & 4294967295L);
            interfaceC17915v.mo51416f(f13, f14);
            m3525a1(interfaceC17915v, c23226c);
            interfaceC17915v.mo51416f(-f13, -f14);
            return;
        }
        C2374f2 c2374f2 = (C2374f2) interfaceC0180a2;
        C22128b c22128b = c2374f2.f9368M;
        c2374f2.m7312g();
        c2374f2.f9375T = c2374f2.f9377w.f91965a.mo67227N() > 0.0f;
        C0237p c0237p = c22128b.f85852x;
        c0237p.m685P(interfaceC17915v);
        c0237p.f813y = c23226c;
        AbstractC15751g.m44467t(c22128b, c2374f2.f9377w);
    }

    /* JADX INFO: renamed from: a1 */
    public final void m3525a1(InterfaceC17915v interfaceC17915v, C23226c c23226c) {
        InterfaceC17915v interfaceC17915v2;
        C23226c c23226c2;
        AbstractC2316v abstractC2316vM3534h1 = m3534h1(4);
        if (abstractC2316vM3534h1 == null) {
            mo3552v1(interfaceC17915v, c23226c);
            return;
        }
        C0230n0 c0230n0 = this.f4858O;
        c0230n0.getClass();
        C0238p0 sharedDrawScope = AbstractC0242q0.m750a(c0230n0).getSharedDrawScope();
        long jM113239l = AbstractC35744b.m113239l(this.f168213y);
        sharedDrawScope.getClass();
        C30849c c30849c = null;
        while (abstractC2316vM3534h1 != null) {
            if (abstractC2316vM3534h1 instanceof InterfaceC0245r) {
                interfaceC17915v2 = interfaceC17915v;
                c23226c2 = c23226c;
                sharedDrawScope.m730b(interfaceC17915v2, jM113239l, this, (InterfaceC0245r) abstractC2316vM3534h1, c23226c2);
            } else {
                interfaceC17915v2 = interfaceC17915v;
                c23226c2 = c23226c;
                if ((abstractC2316vM3534h1.f9144y & 4) != 0 && (abstractC2316vM3534h1 instanceof AbstractC0233o)) {
                    int i13 = 0;
                    for (AbstractC2316v abstractC2316v = ((AbstractC0233o) abstractC2316vM3534h1).f804P; abstractC2316v != null; abstractC2316v = abstractC2316v.f9133F) {
                        if ((abstractC2316v.f9144y & 4) != 0) {
                            i13++;
                            if (i13 == 1) {
                                abstractC2316vM3534h1 = abstractC2316v;
                            } else {
                                if (c30849c == null) {
                                    c30849c = new C30849c(new AbstractC2316v[16]);
                                }
                                if (abstractC2316vM3534h1 != null) {
                                    c30849c.m94885b(abstractC2316vM3534h1);
                                    abstractC2316vM3534h1 = null;
                                }
                                c30849c.m94885b(abstractC2316v);
                            }
                        }
                    }
                    if (i13 == 1) {
                    }
                }
                interfaceC17915v = interfaceC17915v2;
                c23226c = c23226c2;
            }
            abstractC2316vM3534h1 = AbstractC0201g.m504d(c30849c);
            interfaceC17915v = interfaceC17915v2;
            c23226c = c23226c2;
        }
    }

    /* JADX INFO: renamed from: b1 */
    public abstract void mo3526b1();

    @Override // p635y2.InterfaceC39147y
    /* JADX INFO: renamed from: c */
    public final InterfaceC39147y mo3527c() {
        if (!mo3533g1().f9141N) {
            AbstractC37831a.m121374b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        m3546q1();
        return this.f4860Q;
    }

    /* JADX INFO: renamed from: c1 */
    public final NodeCoordinator m3528c1(NodeCoordinator nodeCoordinator) {
        C0230n0 c0230n0M588G = nodeCoordinator.f4858O;
        C0230n0 c0230n0 = this.f4858O;
        if (c0230n0M588G == c0230n0) {
            AbstractC2316v abstractC2316vMo3533g1 = nodeCoordinator.mo3533g1();
            AbstractC2316v abstractC2316vMo3533g2 = mo3533g1();
            if (!abstractC2316vMo3533g2.f9142w.f9141N) {
                AbstractC37831a.m121374b("visitLocalAncestors called on an unattached node");
            }
            for (AbstractC2316v abstractC2316v = abstractC2316vMo3533g2.f9142w.f9132E; abstractC2316v != null; abstractC2316v = abstractC2316v.f9132E) {
                if ((abstractC2316v.f9144y & 2) != 0 && abstractC2316v == abstractC2316vMo3533g1) {
                    return nodeCoordinator;
                }
            }
            return this;
        }
        while (c0230n0M588G.f767O > c0230n0.f767O) {
            c0230n0M588G = c0230n0M588G.m588G();
            AbstractC22676k.m65747g(c0230n0M588G);
        }
        C0230n0 c0230n0M588G2 = c0230n0;
        while (c0230n0M588G2.f767O > c0230n0M588G.f767O) {
            c0230n0M588G2 = c0230n0M588G2.m588G();
            AbstractC22676k.m65747g(c0230n0M588G2);
        }
        while (c0230n0M588G != c0230n0M588G2) {
            c0230n0M588G = c0230n0M588G.m588G();
            c0230n0M588G2 = c0230n0M588G2.m588G();
            if (c0230n0M588G == null || c0230n0M588G2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (c0230n0M588G2 != c0230n0) {
            if (c0230n0M588G != nodeCoordinator.f4858O) {
                return (C1134a) c0230n0M588G.f783e0.f740d;
            }
            return nodeCoordinator;
        }
        return this;
    }

    /* JADX INFO: renamed from: d1 */
    public final long m3529d1(long j7) {
        long j13 = this.f4869Z;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j7 & 4294967295L)) - ((int) (j13 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j7 >> 32)) - ((int) (j13 >> 32)))) << 32);
        InterfaceC0180a2 interfaceC0180a2 = this.f4878i0;
        return interfaceC0180a2 != null ? ((C2374f2) interfaceC0180a2).m7309d(jFloatToRawIntBits, true) : jFloatToRawIntBits;
    }

    /* JADX INFO: renamed from: e1 */
    public abstract AbstractC0265x0 mo3530e1();

    /* JADX INFO: renamed from: f1 */
    public final long m3531f1() {
        return this.f4864U.mo722D0(this.f4858O.f778Z.getMinimumTouchTargetSize());
    }

    @Override // p635y2.InterfaceC39147y
    /* JADX INFO: renamed from: g */
    public final boolean mo3532g() {
        return mo3533g1().f9141N;
    }

    /* JADX INFO: renamed from: g1 */
    public abstract AbstractC2316v mo3533g1();

    @Override // p636y3.InterfaceC39171c
    public final float getDensity() {
        return this.f4858O.f776X.getDensity();
    }

    @Override // p635y2.InterfaceC39126r
    public final EnumC39181m getLayoutDirection() {
        return this.f4858O.f777Y;
    }

    /* JADX INFO: renamed from: h1 */
    public final AbstractC2316v m3534h1(int i13) {
        boolean zM769g = AbstractC0247r1.m769g(i13);
        AbstractC2316v abstractC2316vMo3533g1 = mo3533g1();
        if (!zM769g && (abstractC2316vMo3533g1 = abstractC2316vMo3533g1.f9132E) == null) {
            return null;
        }
        for (AbstractC2316v abstractC2316vM3535i1 = m3535i1(zM769g); abstractC2316vM3535i1 != null && (abstractC2316vM3535i1.f9145z & i13) != 0; abstractC2316vM3535i1 = abstractC2316vM3535i1.f9133F) {
            if ((abstractC2316vM3535i1.f9144y & i13) != 0) {
                return abstractC2316vM3535i1;
            }
            if (abstractC2316vM3535i1 == abstractC2316vMo3533g1) {
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i1 */
    public final AbstractC2316v m3535i1(boolean z4) {
        AbstractC2316v abstractC2316vMo3533g1;
        C0223l1 c0223l1 = this.f4858O.f783e0;
        if (((NodeCoordinator) c0223l1.f741e) == this) {
            return (AbstractC2316v) c0223l1.f743g;
        }
        if (!z4) {
            NodeCoordinator nodeCoordinator = this.f4860Q;
            if (nodeCoordinator != null) {
                return nodeCoordinator.mo3533g1();
            }
            return null;
        }
        NodeCoordinator nodeCoordinator2 = this.f4860Q;
        if (nodeCoordinator2 == null || (abstractC2316vMo3533g1 = nodeCoordinator2.mo3533g1()) == null) {
            return null;
        }
        return abstractC2316vMo3533g1.f9133F;
    }

    /* JADX INFO: renamed from: j1 */
    public final void m3536j1(AbstractC2316v abstractC2316v, C0193e c0193e, long j7, C0258v c0258v, int i13, boolean z4) {
        if (abstractC2316v == null) {
            mo3540m1(c0193e, j7, c0258v, i13, z4);
            return;
        }
        int i14 = c0258v.f883y;
        C0047q0 c0047q0 = c0258v.f881w;
        c0258v.m775c(i14 + 1, c0047q0.f137b);
        c0258v.f883y++;
        c0047q0.m98a(abstractC2316v);
        c0258v.f882x.m76a(AbstractC12314q.m34322b(-1.0f, z4, false));
        m3536j1(AbstractC0201g.m503c(abstractC2316v, c0193e.m476b()), c0193e, j7, c0258v, i13, z4);
        c0258v.f883y = i14;
    }

    @Override // p635y2.InterfaceC39147y
    /* JADX INFO: renamed from: k */
    public final long mo3537k(InterfaceC39147y interfaceC39147y, long j7) {
        return m3545p1(interfaceC39147y, j7);
    }

    /* JADX INFO: renamed from: k1 */
    public final void m3538k1(AbstractC2316v abstractC2316v, C0193e c0193e, long j7, C0258v c0258v, int i13, boolean z4, float f13) {
        if (abstractC2316v == null) {
            mo3540m1(c0193e, j7, c0258v, i13, z4);
            return;
        }
        int i14 = c0258v.f883y;
        C0047q0 c0047q0 = c0258v.f881w;
        c0258v.m775c(i14 + 1, c0047q0.f137b);
        c0258v.f883y++;
        c0047q0.m98a(abstractC2316v);
        c0258v.f882x.m76a(AbstractC12314q.m34322b(f13, z4, false));
        m3551u1(AbstractC0201g.m503c(abstractC2316v, c0193e.m476b()), c0193e, j7, c0258v, i13, z4, f13, true);
        c0258v.f883y = i14;
    }

    /* JADX INFO: renamed from: l1 */
    public final void m3539l1(C0193e c0193e, long j7, C0258v c0258v, int i13, boolean z4) {
        boolean z13;
        boolean z14;
        AbstractC2316v abstractC2316vM3534h1 = m3534h1(c0193e.m476b());
        if (!m3514H1(j7)) {
            if (AbstractC34454d0.m108915f(i13, 1)) {
                float fM3522Y0 = m3522Y0(j7, m3531f1());
                if ((Float.floatToRawIntBits(fM3522Y0) & Integer.MAX_VALUE) < 2139095040) {
                    if (c0258v.f883y != AbstractC37056f.m118951C(c0258v)) {
                        if (AbstractC12313p.m34306x(c0258v.m774a(), AbstractC12314q.m34322b(fM3522Y0, false, false)) <= 0) {
                            return;
                        }
                    }
                    m3538k1(abstractC2316vM3534h1, c0193e, j7, c0258v, i13, false, fM3522Y0);
                    return;
                }
                return;
            }
            return;
        }
        if (abstractC2316vM3534h1 == null) {
            mo3540m1(c0193e, j7, c0258v, i13, z4);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L));
        if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < mo452j0() && fIntBitsToFloat2 < mo451g0()) {
            m3536j1(abstractC2316vM3534h1, c0193e, j7, c0258v, i13, z4);
            return;
        }
        float fM3522Y1 = !AbstractC34454d0.m108915f(i13, 1) ? Float.POSITIVE_INFINITY : m3522Y0(j7, m3531f1());
        if ((Float.floatToRawIntBits(fM3522Y1) & Integer.MAX_VALUE) < 2139095040) {
            if (c0258v.f883y != AbstractC37056f.m118951C(c0258v)) {
                z13 = z4;
                if (AbstractC12313p.m34306x(c0258v.m774a(), AbstractC12314q.m34322b(fM3522Y1, z13, false)) > 0) {
                }
                m3551u1(abstractC2316vM3534h1, c0193e, j7, c0258v, i13, z13, fM3522Y1, z14);
            }
            z13 = z4;
            z14 = true;
            m3551u1(abstractC2316vM3534h1, c0193e, j7, c0258v, i13, z13, fM3522Y1, z14);
        }
        z13 = z4;
        z14 = false;
        m3551u1(abstractC2316vM3534h1, c0193e, j7, c0258v, i13, z13, fM3522Y1, z14);
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: m0 */
    public final float getFontScale() {
        return this.f4858O.f776X.getFontScale();
    }

    /* JADX INFO: renamed from: m1 */
    public void mo3540m1(C0193e c0193e, long j7, C0258v c0258v, int i13, boolean z4) {
        NodeCoordinator nodeCoordinator = this.f4859P;
        if (nodeCoordinator != null) {
            nodeCoordinator.m3539l1(c0193e, nodeCoordinator.m3529d1(j7), c0258v, i13, z4);
        }
    }

    @Override // p635y2.InterfaceC39147y
    /* JADX INFO: renamed from: n */
    public final long mo3541n() {
        return this.f168213y;
    }

    /* JADX INFO: renamed from: n1 */
    public final void m3542n1() {
        InterfaceC0180a2 interfaceC0180a2 = this.f4878i0;
        if (interfaceC0180a2 != null) {
            interfaceC0180a2.invalidate();
            return;
        }
        NodeCoordinator nodeCoordinator = this.f4860Q;
        if (nodeCoordinator != null) {
            nodeCoordinator.m3542n1();
        }
    }

    @Override // p635y2.InterfaceC39147y
    /* JADX INFO: renamed from: o */
    public final long mo3543o(long j7) {
        if (!mo3533g1().f9141N) {
            AbstractC37831a.m121374b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        InterfaceC39147y interfaceC39147yM124662h = AbstractC39125q1.m124662h(this);
        AndroidComposeView androidComposeView = (AndroidComposeView) AbstractC0242q0.m750a(this.f4858O);
        androidComposeView.m3574F();
        return m3545p1(interfaceC39147yM124662h, C16617b.m47191g(C17896l0.m51472b(j7, androidComposeView.f4967w0), interfaceC39147yM124662h.mo3523Z(0L)));
    }

    /* JADX INFO: renamed from: o1 */
    public final boolean m3544o1() {
        if (this.f4878i0 != null && this.f4866W <= 0.0f) {
            return true;
        }
        NodeCoordinator nodeCoordinator = this.f4860Q;
        if (nodeCoordinator != null) {
            return nodeCoordinator.m3544o1();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Override // p635y2.AbstractC39104j1, p635y2.InterfaceC39124q0
    /* JADX INFO: renamed from: p */
    public final Object mo454p() {
        C0230n0 c0230n0 = this.f4858O;
        if (!c0230n0.f783e0.m560j(64)) {
            return null;
        }
        mo3533g1();
        Object objMo461Y = null;
        for (AbstractC2316v abstractC2316v = (C0224l2) c0230n0.f783e0.f742f; abstractC2316v != null; abstractC2316v = abstractC2316v.f9132E) {
            if ((abstractC2316v.f9144y & 64) != 0) {
                ?? M504d = abstractC2316v;
                ?? c30849c = 0;
                while (M504d != 0) {
                    if (M504d instanceof InterfaceC0192d2) {
                        objMo461Y = ((InterfaceC0192d2) M504d).mo461Y(c0230n0.f776X, objMo461Y);
                    } else if ((M504d.f9144y & 64) != 0 && (M504d instanceof AbstractC0233o)) {
                        AbstractC2316v abstractC2316v2 = ((AbstractC0233o) M504d).f804P;
                        int i13 = 0;
                        M504d = M504d;
                        c30849c = c30849c;
                        while (abstractC2316v2 != null) {
                            if ((abstractC2316v2.f9144y & 64) != 0) {
                                i13++;
                                if (i13 == 1) {
                                    c30849c = c30849c;
                                    M504d = abstractC2316v2;
                                } else {
                                    if (c30849c == 0) {
                                        c30849c = new C30849c(new AbstractC2316v[16]);
                                    }
                                    if (M504d != 0) {
                                        c30849c.m94885b(M504d);
                                        M504d = 0;
                                    }
                                    c30849c.m94885b(abstractC2316v2);
                                }
                            }
                            abstractC2316v2 = abstractC2316v2.f9133F;
                            M504d = M504d;
                            c30849c = c30849c;
                        }
                        if (i13 == 1) {
                        }
                    }
                    M504d = AbstractC0201g.m504d(c30849c);
                }
            }
        }
        return objMo461Y;
    }

    @Override // p635y2.AbstractC39104j1
    /* JADX INFO: renamed from: p0 */
    public abstract void mo455p0(long j7, float f13, C23226c c23226c);

    /* JADX INFO: renamed from: p1 */
    public final long m3545p1(InterfaceC39147y interfaceC39147y, long j7) {
        if (interfaceC39147y instanceof C39121p0) {
            C39121p0 c39121p0 = (C39121p0) interfaceC39147y;
            c39121p0.f168257w.f904O.m3546q1();
            return c39121p0.m124653b(this, j7 ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        NodeCoordinator nodeCoordinatorM3506A1 = m3506A1(interfaceC39147y);
        nodeCoordinatorM3506A1.m3546q1();
        NodeCoordinator nodeCoordinatorM3528c1 = m3528c1(nodeCoordinatorM3506A1);
        while (nodeCoordinatorM3506A1 != nodeCoordinatorM3528c1) {
            j7 = nodeCoordinatorM3506A1.m3507B1(j7);
            nodeCoordinatorM3506A1 = nodeCoordinatorM3506A1.f4860Q;
            AbstractC22676k.m65747g(nodeCoordinatorM3506A1);
        }
        return m3519W0(nodeCoordinatorM3528c1, j7);
    }

    /* JADX INFO: renamed from: q1 */
    public final void m3546q1() {
        this.f4858O.m643t().m754b();
    }

    @Override // p635y2.InterfaceC39147y
    /* JADX INFO: renamed from: r */
    public final C16618c mo3547r(InterfaceC39147y interfaceC39147y, boolean z4) {
        if (!mo3533g1().f9141N) {
            AbstractC37831a.m121374b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!interfaceC39147y.mo3532g()) {
            AbstractC37831a.m121374b("LayoutCoordinates " + interfaceC39147y + " is not attached!");
        }
        NodeCoordinator nodeCoordinatorM3506A1 = m3506A1(interfaceC39147y);
        nodeCoordinatorM3506A1.m3546q1();
        NodeCoordinator nodeCoordinatorM3528c1 = m3528c1(nodeCoordinatorM3506A1);
        C16616a c16616a = this.f4871b0;
        if (c16616a == null) {
            c16616a = new C16616a();
            this.f4871b0 = c16616a;
        }
        c16616a.f63933a = 0.0f;
        c16616a.f63934b = 0.0f;
        c16616a.f63935c = (int) (interfaceC39147y.mo3541n() >> 32);
        c16616a.f63936d = (int) (interfaceC39147y.mo3541n() & 4294967295L);
        while (nodeCoordinatorM3506A1 != nodeCoordinatorM3528c1) {
            nodeCoordinatorM3506A1.m3554x1(c16616a, z4, false);
            if (c16616a.m47184b()) {
                return C16618c.f63938e;
            }
            nodeCoordinatorM3506A1 = nodeCoordinatorM3506A1.f4860Q;
            AbstractC22676k.m65747g(nodeCoordinatorM3506A1);
        }
        m3518V0(nodeCoordinatorM3528c1, c16616a, z4);
        return new C16618c(c16616a.f63933a, c16616a.f63934b, c16616a.f63935c, c16616a.f63936d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r7v7, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX INFO: renamed from: r1 */
    public final void m3548r1() {
        AbstractC2316v abstractC2316vMo3533g1;
        boolean zM769g = AbstractC0247r1.m769g(128);
        AbstractC2316v abstractC2316vM3535i1 = m3535i1(zM769g);
        if (abstractC2316vM3535i1 == null || (abstractC2316vM3535i1.f9142w.f9145z & 128) == 0) {
            return;
        }
        AbstractC39957f abstractC39957fM126587c = C39615a.m126587c();
        Function1 function1Mo128133e = abstractC39957fM126587c != null ? abstractC39957fM126587c.mo128133e() : null;
        AbstractC39957f abstractC39957fM126589e = C39615a.m126589e(abstractC39957fM126587c);
        try {
            if (!zM769g) {
                abstractC2316vMo3533g1 = mo3533g1().f9132E;
                if (abstractC2316vMo3533g1 == null) {
                }
                C39615a.m126591g(abstractC39957fM126587c, abstractC39957fM126589e, function1Mo128133e);
            }
            abstractC2316vMo3533g1 = mo3533g1();
            for (AbstractC2316v abstractC2316vM3535i2 = m3535i1(zM769g); abstractC2316vM3535i2 != null && (abstractC2316vM3535i2.f9145z & 128) != 0; abstractC2316vM3535i2 = abstractC2316vM3535i2.f9133F) {
                if ((abstractC2316vM3535i2.f9144y & 128) != 0) {
                    ?? M504d = abstractC2316vM3535i2;
                    ?? c30849c = 0;
                    while (M504d != 0) {
                        if (M504d instanceof InterfaceC0178a0) {
                            ((InterfaceC0178a0) M504d).mo423g(this.f168213y);
                        } else if ((M504d.f9144y & 128) != 0 && (M504d instanceof AbstractC0233o)) {
                            AbstractC2316v abstractC2316v = ((AbstractC0233o) M504d).f804P;
                            int i13 = 0;
                            M504d = M504d;
                            c30849c = c30849c;
                            while (abstractC2316v != null) {
                                if ((abstractC2316v.f9144y & 128) != 0) {
                                    i13++;
                                    if (i13 == 1) {
                                        c30849c = c30849c;
                                        M504d = abstractC2316v;
                                    } else {
                                        if (c30849c == 0) {
                                            c30849c = new C30849c(new AbstractC2316v[16]);
                                        }
                                        if (M504d != 0) {
                                            c30849c.m94885b(M504d);
                                            M504d = 0;
                                        }
                                        c30849c.m94885b(abstractC2316v);
                                    }
                                }
                                abstractC2316v = abstractC2316v.f9133F;
                                M504d = M504d;
                                c30849c = c30849c;
                            }
                            if (i13 == 1) {
                            }
                        }
                        M504d = AbstractC0201g.m504d(c30849c);
                    }
                }
                if (abstractC2316vM3535i2 == abstractC2316vMo3533g1) {
                    break;
                }
            }
            C39615a.m126591g(abstractC39957fM126587c, abstractC39957fM126589e, function1Mo128133e);
        } catch (Throwable th3) {
            C39615a.m126591g(abstractC39957fM126587c, abstractC39957fM126589e, function1Mo128133e);
            throw th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX INFO: renamed from: s1 */
    public final void m3549s1() {
        boolean zM769g = AbstractC0247r1.m769g(128);
        AbstractC2316v abstractC2316vMo3533g1 = mo3533g1();
        if (!zM769g && (abstractC2316vMo3533g1 = abstractC2316vMo3533g1.f9132E) == null) {
            return;
        }
        for (AbstractC2316v abstractC2316vM3535i1 = m3535i1(zM769g); abstractC2316vM3535i1 != null && (abstractC2316vM3535i1.f9145z & 128) != 0; abstractC2316vM3535i1 = abstractC2316vM3535i1.f9133F) {
            if ((abstractC2316vM3535i1.f9144y & 128) != 0) {
                ?? M504d = abstractC2316vM3535i1;
                ?? c30849c = 0;
                while (M504d != 0) {
                    if (M504d instanceof InterfaceC0178a0) {
                        ((InterfaceC0178a0) M504d).mo422N(this);
                    } else if ((M504d.f9144y & 128) != 0 && (M504d instanceof AbstractC0233o)) {
                        AbstractC2316v abstractC2316v = ((AbstractC0233o) M504d).f804P;
                        int i13 = 0;
                        M504d = M504d;
                        c30849c = c30849c;
                        while (abstractC2316v != null) {
                            if ((abstractC2316v.f9144y & 128) != 0) {
                                i13++;
                                if (i13 == 1) {
                                    c30849c = c30849c;
                                    M504d = abstractC2316v;
                                } else {
                                    if (c30849c == 0) {
                                        c30849c = new C30849c(new AbstractC2316v[16]);
                                    }
                                    if (M504d != 0) {
                                        c30849c.m94885b(M504d);
                                        M504d = 0;
                                    }
                                    c30849c.m94885b(abstractC2316v);
                                }
                            }
                            abstractC2316v = abstractC2316v.f9133F;
                            M504d = M504d;
                            c30849c = c30849c;
                        }
                        if (i13 == 1) {
                        }
                    }
                    M504d = AbstractC0201g.m504d(c30849c);
                }
            }
            if (abstractC2316vM3535i1 == abstractC2316vMo3533g1) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: t1 */
    public final void m3550t1() {
        this.f4861R = true;
        this.f4876g0.invoke();
        m3556y1();
        if (C39178j.m124792b(this.f4869Z, 0L)) {
            return;
        }
        this.f4858O.m628k0();
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0178 A[PHI: r2
      0x0178: PHI (r2v4 ??) = (r2v1 ??), (r2v1 ??), (r2v6 ??) binds: [B:38:0x0144, B:40:0x0148, B:54:0x0172] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v3, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v4, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX INFO: renamed from: u1 */
    public final void m3551u1(AbstractC2316v abstractC2316v, C0193e c0193e, long j7, C0258v c0258v, int i13, boolean z4, float f13, boolean z13) {
        ?? M504d;
        boolean z14;
        int i14;
        if (abstractC2316v == null) {
            mo3540m1(c0193e, j7, c0258v, i13, z4);
            return;
        }
        int i15 = i13;
        if (AbstractC34454d0.m108915f(i15, 3) || AbstractC34454d0.m108915f(i15, 4)) {
            ?? r10 = abstractC2316v;
            ?? c30849c = 0;
            while (r10 != 0) {
                if (r10 instanceof InterfaceC0200f2) {
                    long jMo500S = ((InterfaceC0200f2) r10).mo500S();
                    int i16 = (int) (j7 >> 32);
                    float fIntBitsToFloat = Float.intBitsToFloat(i16);
                    C0230n0 c0230n0 = this.f4858O;
                    if (fIntBitsToFloat < (-AbstractC0232n2.m654a(jMo500S, c0230n0.f777Y))) {
                        break;
                    }
                    if (Float.intBitsToFloat(i16) >= AbstractC0232n2.m655b(jMo500S, c0230n0.f777Y) + mo452j0()) {
                        break;
                    }
                    int i17 = (int) (j7 & 4294967295L);
                    if (Float.intBitsToFloat(i17) < (-AbstractC0232n2.m657d(jMo500S))) {
                        break;
                    }
                    if (Float.intBitsToFloat(i17) >= AbstractC0232n2.m656c(jMo500S) + mo451g0()) {
                        break;
                    }
                    C0239p1 c0239p1 = new C0239p1(this, abstractC2316v, c0193e, j7, c0258v, i15, z4, f13, z13);
                    C0032j0 c0032j0 = c0258v.f882x;
                    C0047q0 c0047q0 = c0258v.f881w;
                    if (c0258v.f883y == AbstractC37056f.m118951C(c0258v)) {
                        int i18 = c0258v.f883y;
                        c0258v.m775c(i18 + 1, c0047q0.f137b);
                        c0258v.f883y++;
                        c0047q0.m98a(abstractC2316v);
                        c0032j0.m76a(AbstractC12314q.m34322b(0.0f, z4, true));
                        c0239p1.invoke();
                        c0258v.f883y = i18;
                        return;
                    }
                    long jM774a = c0258v.m774a();
                    int i19 = c0258v.f883y;
                    if (!AbstractC12313p.m34259K(jM774a)) {
                        if (AbstractC12313p.m34256H(jM774a) > 0.0f) {
                            int i24 = c0258v.f883y;
                            c0258v.m775c(i24 + 1, c0047q0.f137b);
                            c0258v.f883y++;
                            c0047q0.m98a(abstractC2316v);
                            c0032j0.m76a(AbstractC12314q.m34322b(0.0f, z4, true));
                            c0239p1.invoke();
                            c0258v.f883y = i24;
                            return;
                        }
                        return;
                    }
                    int iM118951C = AbstractC37056f.m118951C(c0258v);
                    c0258v.f883y = iM118951C;
                    c0258v.m775c(iM118951C + 1, c0047q0.f137b);
                    c0258v.f883y++;
                    c0047q0.m98a(abstractC2316v);
                    c0032j0.m76a(AbstractC12314q.m34322b(0.0f, z4, true));
                    c0239p1.invoke();
                    c0258v.f883y = iM118951C;
                    if (AbstractC12313p.m34256H(c0258v.m774a()) < 0.0f) {
                        c0258v.m775c(i19 + 1, c0258v.f883y + 1);
                    }
                    c0258v.f883y = i19;
                    return;
                }
                if ((r10.f9144y & 16) == 0 || !(r10 instanceof AbstractC0233o)) {
                    M504d = r10;
                    c30849c = c30849c;
                    M504d = AbstractC0201g.m504d(c30849c);
                } else {
                    AbstractC2316v abstractC2316v2 = ((AbstractC0233o) r10).f804P;
                    int i25 = 0;
                    while (abstractC2316v2 != null) {
                        if ((abstractC2316v2.f9144y & 16) != 0) {
                            i25++;
                            if (i25 == 1) {
                                M504d = r10;
                                c30849c = c30849c;
                                c30849c = c30849c;
                                M504d = abstractC2316v2;
                            } else {
                                if (c30849c == 0) {
                                    c30849c = new C30849c(new AbstractC2316v[16]);
                                }
                                if (M504d != 0) {
                                    c30849c.m94885b(M504d);
                                    M504d = 0;
                                }
                                c30849c.m94885b(abstractC2316v2);
                            }
                        } else {
                            M504d = r10;
                            c30849c = c30849c;
                        }
                        abstractC2316v2 = abstractC2316v2.f9133F;
                        M504d = M504d;
                        c30849c = c30849c;
                    }
                    if (i25 == 1) {
                        M504d = r10;
                        c30849c = c30849c;
                    } else {
                        M504d = r10;
                        c30849c = c30849c;
                        M504d = AbstractC0201g.m504d(c30849c);
                    }
                }
                i15 = i13;
                r10 = M504d;
                c30849c = c30849c;
            }
        }
        if (z13) {
            m3538k1(abstractC2316v, c0193e, j7, c0258v, i13, z4, f13);
            return;
        }
        switch (c0193e.f623w) {
            case 1:
                ?? M504d2 = abstractC2316v;
                ?? c30849c2 = 0;
                while (true) {
                    int i26 = 0;
                    if (M504d2 == 0) {
                        z14 = false;
                    } else {
                        if (M504d2 instanceof InterfaceC0200f2) {
                            ((InterfaceC0200f2) M504d2).mo472r();
                        } else if ((M504d2.f9144y & 16) != 0 && (M504d2 instanceof AbstractC0233o)) {
                            AbstractC2316v abstractC2316v3 = ((AbstractC0233o) M504d2).f804P;
                            M504d2 = M504d2;
                            c30849c2 = c30849c2;
                            while (abstractC2316v3 != null) {
                                if ((abstractC2316v3.f9144y & 16) != 0) {
                                    i26++;
                                    if (i26 == 1) {
                                        c30849c2 = c30849c2;
                                        M504d2 = abstractC2316v3;
                                    } else {
                                        if (c30849c2 == 0) {
                                            c30849c2 = new C30849c(new AbstractC2316v[16]);
                                        }
                                        if (M504d2 != 0) {
                                            c30849c2.m94885b(M504d2);
                                            M504d2 = 0;
                                        }
                                        c30849c2.m94885b(abstractC2316v3);
                                    }
                                }
                                abstractC2316v3 = abstractC2316v3.f9133F;
                                M504d2 = M504d2;
                                c30849c2 = c30849c2;
                            }
                            if (i26 == 1) {
                            }
                        }
                        M504d2 = AbstractC0201g.m504d(c30849c2);
                    }
                    break;
                }
                break;
            default:
                z14 = false;
                break;
        }
        if (!z14) {
            m3551u1(AbstractC0201g.m503c(abstractC2316v, c0193e.m476b()), c0193e, j7, c0258v, i13, z4, f13, false);
            return;
        }
        C0243q1 c0243q1 = new C0243q1(this, abstractC2316v, c0193e, j7, c0258v, i13, z4, f13);
        C0032j0 c0032j1 = c0258v.f882x;
        C0047q0 c0047q1 = c0258v.f881w;
        if (c0258v.f883y != AbstractC37056f.m118951C(c0258v)) {
            long jM774a2 = c0258v.m774a();
            int i27 = c0258v.f883y;
            int iM118951C2 = AbstractC37056f.m118951C(c0258v);
            c0258v.f883y = iM118951C2;
            c0258v.m775c(iM118951C2 + 1, c0047q1.f137b);
            c0258v.f883y++;
            c0047q1.m98a(abstractC2316v);
            c0032j1.m76a(AbstractC12314q.m34322b(f13, z4, false));
            c0243q1.invoke();
            c0258v.f883y = iM118951C2;
            long jM774a3 = c0258v.m774a();
            if (c0258v.f883y + 1 >= AbstractC37056f.m118951C(c0258v) || AbstractC12313p.m34306x(jM774a2, jM774a3) <= 0) {
                c0258v.m775c(c0258v.f883y + 1, c0047q1.f137b);
            } else {
                c0258v.m775c(i27 + 1, AbstractC12313p.m34259K(jM774a3) ? c0258v.f883y + 2 : c0258v.f883y + 1);
            }
            c0258v.f883y = i27;
            return;
        }
        int i28 = c0258v.f883y;
        int i29 = i28 + 1;
        c0258v.m775c(i29, c0047q1.f137b);
        c0258v.f883y++;
        c0047q1.m98a(abstractC2316v);
        c0032j1.m76a(AbstractC12314q.m34322b(f13, z4, false));
        c0243q1.invoke();
        c0258v.f883y = i28;
        if (i29 == AbstractC37056f.m118951C(c0258v) || AbstractC12313p.m34259K(c0258v.m774a())) {
            int i34 = c0258v.f883y;
            int i35 = i34 + 1;
            c0047q1.m107j(i35);
            if (i35 < 0 || i35 >= (i14 = c0032j1.f95b)) {
                AbstractC34924m.m110135Q("Index must be between 0 and size");
                throw null;
            }
            long[] jArr = c0032j1.f94a;
            long j13 = jArr[i35];
            if (i35 != i14 - 1) {
                AbstractC25260n.m74066g0(jArr, jArr, i35, i34 + 2, i14);
            }
            c0032j1.f95b--;
        }
    }

    /* JADX INFO: renamed from: v1 */
    public abstract void mo3552v1(InterfaceC17915v interfaceC17915v, C23226c c23226c);

    /* JADX INFO: renamed from: w1 */
    public final void m3553w1(long j7, float f13, Function1 function1, C23226c c23226c) {
        C0230n0 c0230n0 = this.f4858O;
        if (c23226c != null) {
            if (function1 != null) {
                AbstractC37831a.m121373a("both ways to create layers shouldn't be used together");
            }
            if (this.f4879j0 != c23226c) {
                this.f4879j0 = null;
                m3512F1(null, false);
                this.f4879j0 = c23226c;
            }
            if (this.f4878i0 == null) {
                Owner ownerM750a = AbstractC0242q0.m750a(c0230n0);
                C0231n1 c0231n1 = this.f4875f0;
                if (c0231n1 == null) {
                    C0231n1 c0231n2 = new C0231n1(0, this, new C0235o1(this, 0));
                    this.f4875f0 = c0231n2;
                    c0231n1 = c0231n2;
                }
                C0235o1 c0235o1 = this.f4876g0;
                InterfaceC0180a2 interfaceC0180a2M3584g = ((AndroidComposeView) ownerM750a).m3584g(c0231n1, c0235o1, c23226c);
                C2374f2 c2374f2 = (C2374f2) interfaceC0180a2M3584g;
                c2374f2.m7311f(this.f168213y);
                c2374f2.m7310e(j7);
                this.f4878i0 = interfaceC0180a2M3584g;
                c0230n0.f786h0 = true;
                c0235o1.invoke();
            }
        } else {
            if (this.f4879j0 != null) {
                this.f4879j0 = null;
                m3512F1(null, false);
            }
            m3512F1(function1, false);
        }
        if (!C39178j.m124792b(this.f4869Z, j7)) {
            ((AndroidComposeView) AbstractC0242q0.m750a(c0230n0)).m3583P(-4.0f);
            this.f4869Z = j7;
            c0230n0.m643t().f854p.m525H0();
            InterfaceC0180a2 interfaceC0180a2 = this.f4878i0;
            if (interfaceC0180a2 != null) {
                ((C2374f2) interfaceC0180a2).m7310e(j7);
            } else {
                NodeCoordinator nodeCoordinator = this.f4860Q;
                if (nodeCoordinator != null) {
                    nodeCoordinator.m3542n1();
                }
            }
            c0230n0.m628k0();
            AbstractC0262w0.m780S0(this);
            Owner owner = c0230n0.f765M;
            if (owner != null) {
                ((AndroidComposeView) owner).m3570B(c0230n0);
            }
        }
        this.f4870a0 = f13;
        if (!this.f898K) {
            m784H0(mo789O0());
        }
        if (this == ((NodeCoordinator) c0230n0.f783e0.f741e)) {
            AbstractC0242q0.m750a(c0230n0).getRectManager().m59673g(c0230n0, !c0230n0.m652z().f658K);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m3554x1(C16616a c16616a, boolean z4, boolean z13) {
        InterfaceC0180a2 interfaceC0180a2 = this.f4878i0;
        if (interfaceC0180a2 != null) {
            if (this.f4862S) {
                if (z13) {
                    long jM3531f1 = m3531f1();
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jM3531f1 >> 32)) / 2.0f;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM3531f1 & 4294967295L)) / 2.0f;
                    long j7 = this.f168213y;
                    c16616a.m47183a(-fIntBitsToFloat, -fIntBitsToFloat2, ((int) (j7 >> 32)) + fIntBitsToFloat, ((int) (j7 & 4294967295L)) + fIntBitsToFloat2);
                } else if (z4) {
                    long j13 = this.f168213y;
                    c16616a.m47183a(0.0f, 0.0f, (int) (j13 >> 32), (int) (j13 & 4294967295L));
                }
                if (c16616a.m47184b()) {
                    return;
                }
            }
            ((C2374f2) interfaceC0180a2).m7308c(c16616a, false);
        }
        long j14 = this.f4869Z;
        float f13 = (int) (j14 >> 32);
        c16616a.f63933a += f13;
        c16616a.f63935c += f13;
        float f14 = (int) (j14 & 4294967295L);
        c16616a.f63934b += f14;
        c16616a.f63936d += f14;
    }

    @Override // p635y2.InterfaceC39147y
    /* JADX INFO: renamed from: y */
    public final long mo3555y(long j7) {
        if (!mo3533g1().f9141N) {
            AbstractC37831a.m121374b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return m3545p1(AbstractC39125q1.m124662h(this), ((AndroidComposeView) AbstractC0242q0.m750a(this.f4858O)).m3578K(j7));
    }

    /* JADX INFO: renamed from: y1 */
    public final void m3556y1() {
        if (this.f4878i0 != null) {
            if (this.f4879j0 != null) {
                this.f4879j0 = null;
            }
            m3512F1(null, false);
            this.f4858O.m645u0(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [r1.c] */
    /* JADX INFO: renamed from: z1 */
    public final void m3557z1(InterfaceC39130s0 interfaceC39130s0) {
        NodeCoordinator nodeCoordinator;
        InterfaceC39130s0 interfaceC39130s1 = this.f4867X;
        if (interfaceC39130s0 != interfaceC39130s1) {
            this.f4867X = interfaceC39130s0;
            C0230n0 c0230n0 = this.f4858O;
            int i13 = 0;
            if (interfaceC39130s1 == null || interfaceC39130s0.getWidth() != interfaceC39130s1.getWidth() || interfaceC39130s0.getHeight() != interfaceC39130s1.getHeight()) {
                int width = interfaceC39130s0.getWidth();
                int height = interfaceC39130s0.getHeight();
                InterfaceC0180a2 interfaceC0180a2 = this.f4878i0;
                if (interfaceC0180a2 != null) {
                    ((C2374f2) interfaceC0180a2).m7311f((((long) width) << 32) | (((long) height) & 4294967295L));
                } else if (c0230n0.m606Y() && (nodeCoordinator = this.f4860Q) != null) {
                    nodeCoordinator.m3542n1();
                }
                m124635r0((((long) height) & 4294967295L) | (((long) width) << 32));
                if (this.f4863T != null) {
                    m3513G1(false);
                }
                boolean zM769g = AbstractC0247r1.m769g(4);
                AbstractC2316v abstractC2316vMo3533g1 = mo3533g1();
                if (zM769g || (abstractC2316vMo3533g1 = abstractC2316vMo3533g1.f9132E) != null) {
                    for (AbstractC2316v abstractC2316vM3535i1 = m3535i1(zM769g); abstractC2316vM3535i1 != null && (abstractC2316vM3535i1.f9145z & 4) != 0; abstractC2316vM3535i1 = abstractC2316vM3535i1.f9133F) {
                        if ((abstractC2316vM3535i1.f9144y & 4) != 0) {
                            ?? M504d = abstractC2316vM3535i1;
                            ?? c30849c = 0;
                            while (M504d != 0) {
                                if (M504d instanceof InterfaceC0245r) {
                                    ((InterfaceC0245r) M504d).mo467c0();
                                } else if ((M504d.f9144y & 4) != 0 && (M504d instanceof AbstractC0233o)) {
                                    AbstractC2316v abstractC2316v = ((AbstractC0233o) M504d).f804P;
                                    int i14 = 0;
                                    M504d = M504d;
                                    c30849c = c30849c;
                                    while (abstractC2316v != null) {
                                        if ((abstractC2316v.f9144y & 4) != 0) {
                                            i14++;
                                            if (i14 == 1) {
                                                c30849c = c30849c;
                                                M504d = abstractC2316v;
                                            } else {
                                                if (c30849c == 0) {
                                                    c30849c = new C30849c(new AbstractC2316v[16]);
                                                }
                                                if (M504d != 0) {
                                                    c30849c.m94885b(M504d);
                                                    M504d = 0;
                                                }
                                                c30849c.m94885b(abstractC2316v);
                                            }
                                        }
                                        abstractC2316v = abstractC2316v.f9133F;
                                        M504d = M504d;
                                        c30849c = c30849c;
                                    }
                                    if (i14 == 1) {
                                    }
                                }
                                M504d = AbstractC0201g.m504d(c30849c);
                            }
                        }
                        if (abstractC2316vM3535i1 == abstractC2316vMo3533g1) {
                            break;
                        }
                    }
                }
                Owner owner = c0230n0.f765M;
                if (owner != null) {
                    ((AndroidComposeView) owner).m3570B(c0230n0);
                }
            }
            C0039m0 c0039m0 = this.f4868Y;
            if ((c0039m0 == null || c0039m0.f118e == 0) && interfaceC39130s0.mo776a().isEmpty()) {
                return;
            }
            C0039m0 c0039m1 = this.f4868Y;
            Map mapMo776a = interfaceC39130s0.mo776a();
            if (c0039m1 != null && c0039m1.f118e == mapMo776a.size()) {
                Object[] objArr = c0039m1.f115b;
                int[] iArr = c0039m1.f116c;
                long[] jArr = c0039m1.f114a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i15 = 0;
                loop0: while (true) {
                    long j7 = jArr[i15];
                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i16 = 8 - ((~(i15 - length)) >>> 31);
                        for (int i17 = i13; i17 < i16; i17++) {
                            if ((255 & j7) < 128) {
                                int i18 = (i15 << 3) + i17;
                                Object obj = objArr[i18];
                                int i19 = iArr[i18];
                                Integer num = (Integer) mapMo776a.get((AbstractC39071a) obj);
                                if (num == null || num.intValue() != i19) {
                                    break loop0;
                                }
                            }
                            j7 >>= 8;
                        }
                        if (i16 != 8) {
                            return;
                        }
                    }
                    if (i15 == length) {
                        return;
                    }
                    i15++;
                    i13 = 0;
                }
            }
            c0230n0.m643t().f854p.f672Y.m419g();
            C0039m0 c0039m2 = this.f4868Y;
            if (c0039m2 == null) {
                C0039m0 c0039m3 = AbstractC0065z0.f204a;
                c0039m2 = new C0039m0();
                this.f4868Y = c0039m2;
            }
            c0039m2.m88a();
            for (Map.Entry entry : interfaceC39130s0.mo776a().entrySet()) {
                c0039m2.m95h(entry.getKey(), ((Number) entry.getValue()).intValue());
            }
        }
    }
}
