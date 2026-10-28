package p635y2;

import android.os.Handler;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.AndroidComposeView;
import androidx.fragment.app.RunnableC1319m;
import c93.InterfaceC4351m;
import java.util.List;
import p000.AbstractC11266d;
import p002a0.AbstractC0015d1;
import p002a0.AbstractC0018e1;
import p002a0.C0057v0;
import p002a0.C0059w0;
import p005a3.AbstractC0242q0;
import p005a3.C0187c1;
import p005a3.C0203g1;
import p005a3.C0230n0;
import p005a3.C0244q2;
import p005a3.EnumC0214j0;
import p005a3.InterfaceC0272z1;
import p027b3.AbstractC2465x3;
import p043c4.C3974q;
import p320m5.C25067k;
import p390p1.AbstractC28667t;
import p390p1.AbstractC28683x;
import p390p1.C28641m1;
import p390p1.C28655q;
import p390p1.C28679w;
import p390p1.EnumC28645n1;
import p390p1.InterfaceC28623i;
import p446r1.C30848b;
import p446r1.C30849c;
import p537ux.C35331f0;
import p602x1.C37816b;
import p602x1.C37822h;
import p603x2.AbstractC37831a;
import p652yl.C39615a;
import p668z1.AbstractC39957f;
import p668z1.AbstractC39963l;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import se.AbstractC32410a;

/* JADX INFO: renamed from: y2.n0 */
/* JADX INFO: loaded from: classes.dex */
public final class C39115n0 implements InterfaceC28623i {

    /* JADX INFO: renamed from: E */
    public int f168228E;

    /* JADX INFO: renamed from: F */
    public final C0057v0 f168229F;

    /* JADX INFO: renamed from: G */
    public final C0057v0 f168230G;

    /* JADX INFO: renamed from: H */
    public final C39097h0 f168231H;

    /* JADX INFO: renamed from: I */
    public final C39088e0 f168232I;

    /* JADX INFO: renamed from: J */
    public final C0057v0 f168233J;

    /* JADX INFO: renamed from: K */
    public final C39143w1 f168234K;

    /* JADX INFO: renamed from: L */
    public final C0057v0 f168235L;

    /* JADX INFO: renamed from: M */
    public final C30849c f168236M;

    /* JADX INFO: renamed from: N */
    public int f168237N;

    /* JADX INFO: renamed from: O */
    public int f168238O;

    /* JADX INFO: renamed from: P */
    public final String f168239P;

    /* JADX INFO: renamed from: w */
    public final C0230n0 f168240w;

    /* JADX INFO: renamed from: x */
    public AbstractC28667t f168241x;

    /* JADX INFO: renamed from: y */
    public InterfaceC39146x1 f168242y;

    /* JADX INFO: renamed from: z */
    public int f168243z;

    public C39115n0(C0230n0 c0230n0, InterfaceC39146x1 interfaceC39146x1) {
        this.f168240w = c0230n0;
        this.f168242y = interfaceC39146x1;
        long[] jArr = AbstractC0015d1.f36a;
        this.f168229F = new C0057v0();
        this.f168230G = new C0057v0();
        this.f168231H = new C39097h0(this);
        this.f168232I = new C39088e0(this);
        this.f168233J = new C0057v0();
        this.f168234K = new C39143w1();
        this.f168235L = new C0057v0();
        this.f168236M = new C30849c(new Object[16]);
        this.f168239P = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    /* JADX INFO: renamed from: b */
    public static void m124641b(C39091f0 c39091f0) {
        C0059w0 c0059w0;
        C28641m1 c28641m1 = c39091f0.f168167f;
        if (c28641m1 != null) {
            c28641m1.f115844h.set(EnumC28645n1.f115856x);
            C37822h c37822h = c28641m1.f115846j;
            if (c37822h.f161971d.m143h()) {
                c0059w0 = c37822h.f161971d;
                C0059w0 c0059w1 = AbstractC0018e1.f44a;
                c37822h.f161971d = new C0059w0();
                c37822h.f161970c.m94890g();
            } else {
                c0059w0 = null;
            }
            c37822h.m121351b();
            C28679w c28679w = c28641m1.f115837a;
            c28679w.f115999Q = null;
            if (c0059w0 != null) {
                c28679w.f116003U.f161978k = c0059w0;
                c28679w.f116005W = 2;
            }
            c39091f0.f168167f = null;
            C28679w c28679w2 = c39091f0.f168164c;
            if (c28679w2 != null) {
                c28679w2.dispose();
            }
            c39091f0.f168164c = null;
        }
    }

    @Override // p390p1.InterfaceC28623i
    /* JADX INFO: renamed from: a */
    public final void mo608a() {
        m124644g(true);
    }

    /* JADX INFO: renamed from: c */
    public final void m124642c(int i13) {
        boolean z4;
        boolean z13 = false;
        this.f168237N = 0;
        List listM639r = this.f168240w.m639r();
        C30848b c30848b = (C30848b) listM639r;
        int i14 = (c30848b.f127226w.f127229y - this.f168238O) - 1;
        if (i13 <= i14) {
            this.f168234K.clear();
            if (i13 <= i14) {
                int i15 = i13;
                while (true) {
                    Object objM129g = this.f168229F.m129g((C0230n0) c30848b.get(i15));
                    AbstractC22676k.m65747g(objM129g);
                    this.f168234K.f168293w.m111a(((C39091f0) objM129g).f168162a);
                    if (i15 == i14) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
            this.f168242y.mo30740b(this.f168234K);
            AbstractC39957f abstractC39957fM126587c = C39615a.m126587c();
            Function1 function1Mo128133e = abstractC39957fM126587c != null ? abstractC39957fM126587c.mo128133e() : null;
            AbstractC39957f abstractC39957fM126589e = C39615a.m126589e(abstractC39957fM126587c);
            z4 = false;
            while (i14 >= i13) {
                try {
                    C0230n0 c0230n0 = (C0230n0) ((C30848b) listM639r).get(i14);
                    Object objM129g2 = this.f168229F.m129g(c0230n0);
                    AbstractC22676k.m65747g(objM129g2);
                    C39091f0 c39091f0 = (C39091f0) objM129g2;
                    Object obj = c39091f0.f168162a;
                    if (this.f168234K.f168293w.m113c(obj)) {
                        this.f168237N++;
                        if (((Boolean) c39091f0.f168168g.getValue()).booleanValue()) {
                            C0203g1 c0203g1M652z = c0230n0.m652z();
                            EnumC0214j0 enumC0214j0 = EnumC0214j0.f715y;
                            c0203g1M652z.f659L = enumC0214j0;
                            C0187c1 c0187c1M650y = c0230n0.m650y();
                            if (c0187c1M650y != null) {
                                c0187c1M650y.f592J = enumC0214j0;
                            }
                            m124645h(c39091f0, false);
                            if (c39091f0.f168169h) {
                                z4 = true;
                            }
                        }
                    } else {
                        C0230n0 c0230n1 = this.f168240w;
                        c0230n1.f768P = true;
                        this.f168229F.m133k(c0230n0);
                        C28679w c28679w = c39091f0.f168164c;
                        if (c28679w != null) {
                            c28679w.dispose();
                        }
                        this.f168240w.m638q0(i14, 1);
                        c0230n1.f768P = false;
                    }
                    this.f168230G.m133k(obj);
                    i14--;
                } catch (Throwable th3) {
                    C39615a.m126591g(abstractC39957fM126587c, abstractC39957fM126589e, function1Mo128133e);
                    throw th3;
                }
            }
            C39615a.m126591g(abstractC39957fM126587c, abstractC39957fM126589e, function1Mo128133e);
        } else {
            z4 = false;
        }
        if (z4) {
            synchronized (AbstractC39963l.f172462c) {
                C0059w0 c0059w0 = AbstractC39963l.f172469j.f172413h;
                if (c0059w0 != null && c0059w0.m143h()) {
                    z13 = true;
                }
            }
            if (z13) {
                AbstractC39963l.m128161a();
            }
        }
        m124643d();
    }

    /* JADX INFO: renamed from: d */
    public final void m124643d() {
        int i13 = ((C30848b) this.f168240w.m639r()).f127226w.f127229y;
        C0057v0 c0057v0 = this.f168229F;
        if (c0057v0.f174e != i13) {
            AbstractC37831a.m121373a("Inconsistency between the count of nodes tracked by the state (" + c0057v0.f174e + ") and the children count on the SubcomposeLayout (" + i13 + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i13 - this.f168237N) - this.f168238O < 0) {
            StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "Incorrect state. Total children ", ". Reusable children ");
            sbM30466t.append(this.f168237N);
            sbM30466t.append(". Precomposed children ");
            sbM30466t.append(this.f168238O);
            AbstractC37831a.m121373a(sbM30466t.toString());
        }
        C0057v0 c0057v1 = this.f168233J;
        if (c0057v1.f174e == this.f168238O) {
            return;
        }
        AbstractC37831a.m121373a("Incorrect state. Precomposed children " + this.f168238O + ". Map size " + c0057v1.f174e);
    }

    @Override // p390p1.InterfaceC28623i
    /* JADX INFO: renamed from: e */
    public final void mo615e() {
        m124644g(false);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x004f A[LOOP:0: B:5:0x0014->B:17:0x004f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0052 A[EDGE_INSN: B:21:0x0052->B:18:0x0052 BREAK  A[LOOP:0: B:5:0x0014->B:17:0x004f], SYNTHETIC] */
    @Override // p390p1.InterfaceC28623i
    /* JADX INFO: renamed from: f */
    public final void mo617f() {
        C28679w c28679w;
        C0230n0 c0230n0 = this.f168240w;
        c0230n0.f768P = true;
        C0057v0 c0057v0 = this.f168229F;
        Object[] objArr = c0057v0.f172c;
        long[] jArr = c0057v0.f170a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j7 = jArr[i13];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i13 != length) {
                        break;
                        break;
                    }
                    i13++;
                } else {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((255 & j7) < 128 && (c28679w = ((C39091f0) objArr[(i13 << 3) + i15]).f168164c) != null) {
                            c28679w.dispose();
                        }
                        j7 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    } else if (i13 != length) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
        }
        c0230n0.m636p0();
        c0230n0.f768P = false;
        c0057v0.m123a();
        this.f168230G.m123a();
        this.f168238O = 0;
        this.f168237N = 0;
        this.f168233J.m123a();
        m124643d();
    }

    /* JADX INFO: renamed from: g */
    public final void m124644g(boolean z4) {
        this.f168238O = 0;
        this.f168233J.m123a();
        List listM639r = this.f168240w.m639r();
        int i13 = ((C30848b) listM639r).f127226w.f127229y;
        if (this.f168237N != i13) {
            this.f168237N = i13;
            AbstractC39957f abstractC39957fM126587c = C39615a.m126587c();
            Function1 function1Mo128133e = abstractC39957fM126587c != null ? abstractC39957fM126587c.mo128133e() : null;
            AbstractC39957f abstractC39957fM126589e = C39615a.m126589e(abstractC39957fM126587c);
            for (int i14 = 0; i14 < i13; i14++) {
                try {
                    C0230n0 c0230n0 = (C0230n0) ((C30848b) listM639r).get(i14);
                    C39091f0 c39091f0 = (C39091f0) this.f168229F.m129g(c0230n0);
                    if (c39091f0 != null && ((Boolean) c39091f0.f168168g.getValue()).booleanValue()) {
                        C0203g1 c0203g1M652z = c0230n0.m652z();
                        EnumC0214j0 enumC0214j0 = EnumC0214j0.f715y;
                        c0203g1M652z.f659L = enumC0214j0;
                        C0187c1 c0187c1M650y = c0230n0.m650y();
                        if (c0187c1M650y != null) {
                            c0187c1M650y.f592J = enumC0214j0;
                        }
                        m124645h(c39091f0, z4);
                        c39091f0.f168162a = AbstractC39125q1.f168266a;
                    }
                } catch (Throwable th3) {
                    C39615a.m126591g(abstractC39957fM126587c, abstractC39957fM126589e, function1Mo128133e);
                    throw th3;
                }
            }
            C39615a.m126591g(abstractC39957fM126587c, abstractC39957fM126589e, function1Mo128133e);
            this.f168230G.m123a();
        }
        m124643d();
    }

    /* JADX INFO: renamed from: h */
    public final void m124645h(C39091f0 c39091f0, boolean z4) {
        C28679w c28679w;
        if (z4 || !c39091f0.f168169h) {
            c39091f0.f168168g = AbstractC28683x.m87272z(Boolean.FALSE);
        } else {
            c39091f0.f168168g.setValue(Boolean.FALSE);
        }
        if (c39091f0.f168167f != null) {
            m124641b(c39091f0);
            return;
        }
        if (z4) {
            C28679w c28679w2 = c39091f0.f168164c;
            if (c28679w2 != null) {
                c28679w2.m87218l();
                return;
            }
            return;
        }
        InterfaceC0272z1 outOfFrameExecutor = AbstractC0242q0.m750a(this.f168240w).getOutOfFrameExecutor();
        if (outOfFrameExecutor == null) {
            if (c39091f0.f168169h || (c28679w = c39091f0.f168164c) == null) {
                return;
            }
            c28679w.m87218l();
            return;
        }
        C25067k c25067k = new C25067k(c39091f0, 16);
        Handler handler = ((AndroidComposeView) outOfFrameExecutor).getHandler();
        if (handler == null) {
            throw new IllegalArgumentException("schedule is called when outOfFrameExecutor is not available (view is detached)");
        }
        handler.postAtFrontOfQueue(new RunnableC1319m(c25067k, 5));
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00c9 A[Catch: all -> 0x00c4, TryCatch #1 {all -> 0x00c4, blocks: (B:60:0x00ad, B:63:0x00b9, B:74:0x00e2, B:76:0x00f2, B:79:0x0106, B:81:0x010a, B:87:0x0142, B:82:0x0117, B:83:0x0122, B:85:0x0126, B:86:0x013f, B:77:0x00f5, B:72:0x00c9, B:73:0x00d5, B:90:0x014c, B:91:0x0156), top: B:96:0x00ad }] */
    /* JADX WARN: Code duplicated, block: B:73:0x00d5 A[Catch: all -> 0x00c4, TryCatch #1 {all -> 0x00c4, blocks: (B:60:0x00ad, B:63:0x00b9, B:74:0x00e2, B:76:0x00f2, B:79:0x0106, B:81:0x010a, B:87:0x0142, B:82:0x0117, B:83:0x0122, B:85:0x0126, B:86:0x013f, B:77:0x00f5, B:72:0x00c9, B:73:0x00d5, B:90:0x014c, B:91:0x0156), top: B:96:0x00ad }] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: i */
    public final void m124646i(C0230n0 c0230n0, Object obj, boolean z4, InterfaceC4351m interfaceC4351m) {
        boolean z13;
        C0057v0 c0057v0 = this.f168229F;
        Object objM129g = c0057v0.m129g(c0230n0);
        Object obj2 = objM129g;
        if (objM129g == null) {
            C37816b c37816b = AbstractC39099i.f168193a;
            C39091f0 c39091f0 = new C39091f0();
            c39091f0.f168162a = obj;
            c39091f0.f168163b = c37816b;
            c39091f0.f168164c = null;
            c39091f0.f168168g = AbstractC28683x.m87272z(Boolean.TRUE);
            c0057v0.m135m(c0230n0, c39091f0);
            obj2 = c39091f0;
        }
        C39091f0 c39091f1 = (C39091f0) obj2;
        boolean z14 = c39091f1.f168163b != interfaceC4351m;
        int i13 = 10;
        if (c39091f1.f168167f != null) {
            if (z14) {
                m124641b(c39091f1);
            } else {
                if (z4) {
                    return;
                }
                C28641m1 c28641m1 = c39091f1.f168167f;
                if (c28641m1 != null) {
                    AbstractC39957f abstractC39957fM126587c = C39615a.m126587c();
                    Function1 function1Mo128133e = abstractC39957fM126587c != null ? abstractC39957fM126587c.mo128133e() : null;
                    AbstractC39957f abstractC39957fM126589e = C39615a.m126589e(abstractC39957fM126587c);
                    try {
                        C0230n0 c0230n1 = this.f168240w;
                        c0230n1.f768P = true;
                        while (!c28641m1.m87083c()) {
                            c28641m1.m87086f(new C35331f0(i13));
                        }
                        c28641m1.m87081a();
                        c39091f1.f168167f = null;
                        c0230n1.f768P = false;
                        C39615a.m126591g(abstractC39957fM126587c, abstractC39957fM126589e, function1Mo128133e);
                    } catch (Throwable th3) {
                        C39615a.m126591g(abstractC39957fM126587c, abstractC39957fM126589e, function1Mo128133e);
                        throw th3;
                    }
                }
            }
        }
        C28679w c28679w = c39091f1.f168164c;
        if (c28679w != null) {
            synchronized (c28679w.f116010z) {
                z13 = c28679w.f115996N.f174e > 0;
            }
        } else {
            z13 = true;
        }
        if (z14 || z13 || c39091f1.f168165d) {
            c39091f1.f168163b = interfaceC4351m;
            if (c39091f1.f168167f != null) {
                AbstractC37831a.m121373a("new subcompose call while paused composition is still active");
            }
            AbstractC39957f abstractC39957fM126587c2 = C39615a.m126587c();
            Function1 function1Mo128133e2 = abstractC39957fM126587c2 != null ? abstractC39957fM126587c2.mo128133e() : null;
            AbstractC39957f abstractC39957fM126589e2 = C39615a.m126589e(abstractC39957fM126587c2);
            try {
                C0230n0 c0230n2 = this.f168240w;
                c0230n2.f768P = true;
                C28679w c28679w2 = c39091f1.f168164c;
                AbstractC28667t abstractC28667t = this.f168241x;
                if (abstractC28667t == null) {
                    AbstractC37831a.m121375c("parent composition reference not set");
                    throw new KotlinNothingValueException();
                }
                if (c28679w2 != null) {
                    if (c28679w2.f116005W == 3) {
                        if (z4) {
                            ViewGroup.LayoutParams layoutParams = AbstractC2465x3.f9615a;
                            c28679w2 = AbstractC32410a.m101034i(new C0244q2(c0230n0), abstractC28667t);
                        } else {
                            ViewGroup.LayoutParams layoutParams2 = AbstractC2465x3.f9615a;
                            c28679w2 = new C28679w(abstractC28667t, new C0244q2(c0230n0));
                        }
                    }
                } else if (z4) {
                    ViewGroup.LayoutParams layoutParams3 = AbstractC2465x3.f9615a;
                    c28679w2 = AbstractC32410a.m101034i(new C0244q2(c0230n0), abstractC28667t);
                } else {
                    ViewGroup.LayoutParams layoutParams4 = AbstractC2465x3.f9615a;
                    c28679w2 = new C28679w(abstractC28667t, new C0244q2(c0230n0));
                }
                c39091f1.f168164c = c28679w2;
                InterfaceC4351m c37816b2 = c39091f1.f168163b;
                if (AbstractC0242q0.m750a(this.f168240w).getOutOfFrameExecutor() != null) {
                    c39091f1.f168169h = false;
                } else {
                    c39091f1.f168169h = true;
                    c37816b2 = new C37816b(new C3974q(i13, c39091f1, c37816b2), true, 1524156494);
                }
                if (z4) {
                    if (c39091f1.f168166e) {
                        c28679w2.m87215i();
                        c28679w2.m87222p();
                        c39091f1.f168167f = c28679w2.m87217k(true, c37816b2);
                    } else {
                        c39091f1.f168167f = c28679w2.m87217k(c28679w2.m87215i(), c37816b2);
                    }
                } else if (c39091f1.f168166e) {
                    c28679w2.m87215i();
                    c28679w2.m87222p();
                    C28655q c28655q = c28679w2.f116004V;
                    c28655q.f115931z = 100;
                    c28655q.f115930y = true;
                    c28679w2.f116006X = c37816b2;
                    c28679w2.f116007w.mo87090a(c28679w2, c37816b2);
                    c28655q.m87181v();
                } else {
                    c28679w2.m87206A(c37816b2);
                }
                c39091f1.f168166e = false;
                c0230n2.f768P = false;
                C39615a.m126591g(abstractC39957fM126587c2, abstractC39957fM126589e2, function1Mo128133e2);
                c39091f1.f168165d = false;
            } catch (Throwable th4) {
                C39615a.m126591g(abstractC39957fM126587c2, abstractC39957fM126589e2, function1Mo128133e2);
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final C0230n0 m124647j(Object obj) {
        C0057v0 c0057v0;
        int i13;
        if (this.f168237N == 0) {
            return null;
        }
        C0230n0 c0230n0 = this.f168240w;
        C30848b c30848b = (C30848b) c0230n0.m639r();
        int i14 = c30848b.f127226w.f127229y - this.f168238O;
        int i15 = i14 - this.f168237N;
        int i16 = i14 - 1;
        int i17 = i16;
        while (true) {
            c0057v0 = this.f168229F;
            if (i17 < i15) {
                i13 = -1;
                break;
            }
            Object objM129g = c0057v0.m129g((C0230n0) c30848b.get(i17));
            AbstractC22676k.m65747g(objM129g);
            if (AbstractC22676k.m65745e(((C39091f0) objM129g).f168162a, obj)) {
                i13 = i17;
                break;
            }
            i17--;
        }
        if (i13 == -1) {
            while (true) {
                if (i16 < i15) {
                    i17 = i16;
                    break;
                }
                Object objM129g2 = c0057v0.m129g((C0230n0) c30848b.get(i16));
                AbstractC22676k.m65747g(objM129g2);
                C39091f0 c39091f0 = (C39091f0) objM129g2;
                Object obj2 = c39091f0.f168162a;
                if (obj2 == AbstractC39125q1.f168266a || this.f168242y.mo30745n(obj, obj2)) {
                    c39091f0.f168162a = obj;
                    i17 = i16;
                    i13 = i17;
                    break;
                }
                i16--;
            }
        }
        if (i13 == -1) {
            return null;
        }
        if (i17 != i15) {
            c0230n0.f768P = true;
            c0230n0.m624i0(i17, i15, 1);
            c0230n0.f768P = false;
        }
        this.f168237N--;
        C0230n0 c0230n1 = (C0230n0) c30848b.get(i15);
        Object objM129g3 = c0057v0.m129g(c0230n1);
        AbstractC22676k.m65747g(objM129g3);
        C39091f0 c39091f1 = (C39091f0) objM129g3;
        c39091f1.f168168g = AbstractC28683x.m87272z(Boolean.TRUE);
        c39091f1.f168166e = true;
        c39091f1.f168165d = true;
        return c0230n1;
    }
}
