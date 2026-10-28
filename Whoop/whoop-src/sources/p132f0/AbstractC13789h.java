package p132f0;

import android.view.KeyEvent;
import androidx.compose.foundation.AbstractC1092a;
import androidx.room.C1832u;
import bc3.AbstractC3006f0;
import bc3.C2996c2;
import c93.InterfaceC4339a;
import j93.InterfaceC21493z;
import java.util.concurrent.CancellationException;
import p002a0.AbstractC0058w;
import p002a0.C0035k0;
import p005a3.AbstractC0201g;
import p005a3.AbstractC0233o;
import p005a3.InterfaceC0200f2;
import p005a3.InterfaceC0216j2;
import p005a3.InterfaceC0225m;
import p005a3.InterfaceC0229n;
import p005a3.InterfaceC0240p2;
import p005a3.InterfaceC0263w1;
import p180h0.C16418l2;
import p209i3.AbstractC18029k;
import p209i3.AbstractC18041w;
import p209i3.C18017a;
import p209i3.C18027i;
import p209i3.C18030l;
import p209i3.InterfaceC18044z;
import p238j0.C21080f;
import p238j0.C21081g;
import p238j0.C21084j;
import p238j0.C21085k;
import p238j0.C21086l;
import p238j0.InterfaceC21083i;
import p477s2.AbstractC32072d;
import p477s2.AbstractC32073e;
import p477s2.InterfaceC32074f;
import p512u2.C34462h0;
import p512u2.C34465k;
import p512u2.EnumC34466l;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22659b0;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: f0.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC13789h extends AbstractC0233o implements InterfaceC0200f2, InterfaceC32074f, InterfaceC0216j2, InterfaceC0240p2, InterfaceC0225m, InterfaceC0263w1 {

    /* JADX INFO: renamed from: j0 */
    public static final C13771b f49195j0 = new C13771b();

    /* JADX INFO: renamed from: Q */
    public InterfaceC21083i f49196Q;

    /* JADX INFO: renamed from: R */
    public InterfaceC13832v0 f49197R;

    /* JADX INFO: renamed from: S */
    public boolean f49198S;

    /* JADX INFO: renamed from: T */
    public String f49199T;

    /* JADX INFO: renamed from: U */
    public C18027i f49200U;

    /* JADX INFO: renamed from: V */
    public boolean f49201V;

    /* JADX INFO: renamed from: W */
    public InterfaceC4339a f49202W;

    /* JADX INFO: renamed from: X */
    public final C13793i0 f49203X;

    /* JADX INFO: renamed from: Y */
    public InterfaceC13832v0 f49204Y;

    /* JADX INFO: renamed from: Z */
    public C34462h0 f49205Z;

    /* JADX INFO: renamed from: a0 */
    public InterfaceC0229n f49206a0;

    /* JADX INFO: renamed from: b0 */
    public C21086l f49207b0;

    /* JADX INFO: renamed from: c0 */
    public C21080f f49208c0;

    /* JADX INFO: renamed from: d0 */
    public final C0035k0 f49209d0;

    /* JADX INFO: renamed from: e0 */
    public long f49210e0;

    /* JADX INFO: renamed from: f0 */
    public InterfaceC21083i f49211f0;

    /* JADX INFO: renamed from: g0 */
    public boolean f49212g0;

    /* JADX INFO: renamed from: h0 */
    public C2996c2 f49213h0;

    /* JADX INFO: renamed from: i0 */
    public final C13771b f49214i0;

    public AbstractC13789h(InterfaceC21083i interfaceC21083i, InterfaceC13832v0 interfaceC13832v0, boolean z4, boolean z13, String str, C18027i c18027i, InterfaceC4339a interfaceC4339a) {
        this.f49196Q = interfaceC21083i;
        this.f49197R = interfaceC13832v0;
        this.f49198S = z4;
        this.f49199T = str;
        this.f49200U = c18027i;
        this.f49201V = z13;
        this.f49202W = interfaceC4339a;
        this.f49203X = new C13793i0(interfaceC21083i, 0, new C1832u(1, this, AbstractC13789h.class, "onFocusChange", "onFocusChange(Z)V", 0, 10));
        C0035k0 c0035k0 = AbstractC0058w.f176a;
        this.f49209d0 = new C0035k0();
        this.f49210e0 = 0L;
        InterfaceC21083i interfaceC21083i2 = this.f49196Q;
        this.f49211f0 = interfaceC21083i2;
        this.f49212g0 = interfaceC21083i2 == null;
        this.f49214i0 = f49195j0;
    }

    @Override // p005a3.InterfaceC0263w1
    /* JADX INFO: renamed from: C */
    public final void mo796C() {
        if (this.f49198S) {
            AbstractC0201g.m512l(this, new C13768a(this, 0));
        }
    }

    @Override // p005a3.InterfaceC0216j2
    /* JADX INFO: renamed from: H0 */
    public final boolean mo542H0() {
        return true;
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: M0 */
    public final boolean mo3462M0() {
        return false;
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: P0 */
    public final void mo285P0() {
        mo796C();
        if (!this.f49212g0) {
            m39153f1();
        }
        if (this.f49201V) {
            m665X0(this.f49203X);
        }
    }

    @Override // p477s2.InterfaceC32074f
    /* JADX INFO: renamed from: Q */
    public final boolean mo39148Q(KeyEvent keyEvent) {
        return false;
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: Q0 */
    public final void mo286Q0() {
        m39151d1();
        if (this.f49211f0 == null) {
            this.f49196Q = null;
        }
        InterfaceC0229n interfaceC0229n = this.f49206a0;
        if (interfaceC0229n != null) {
            m666Y0(interfaceC0229n);
        }
        this.f49206a0 = null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0081 A[RETURN] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p477s2.InterfaceC32074f
    /* JADX INFO: renamed from: Z */
    public final boolean mo39149Z(KeyEvent keyEvent) {
        boolean z4;
        m39153f1();
        long jM99714D = AbstractC32073e.m99714D(keyEvent);
        boolean z13 = this.f49201V;
        InterfaceC30057d interfaceC30057d = null;
        C0035k0 c0035k0 = this.f49209d0;
        if (z13 && AbstractC32072d.m99701j(AbstractC32073e.m99720L(keyEvent), 2) && AbstractC1092a.m3364i(keyEvent)) {
            if (c0035k0.m78b(jM99714D)) {
                z4 = false;
            } else {
                C21086l c21086l = new C21086l(this.f49210e0);
                c0035k0.m84h(jM99714D, c21086l);
                if (this.f49196Q != null) {
                    AbstractC3006f0.m8732z(m7158L0(), null, null, new C13783f(this, c21086l, interfaceC30057d, 1), 3);
                }
                z4 = true;
            }
            if (mo39133h1(keyEvent) || z4) {
                return true;
            }
            return false;
        }
        if (this.f49201V && AbstractC32072d.m99701j(AbstractC32073e.m99720L(keyEvent), 1) && AbstractC1092a.m3364i(keyEvent)) {
            C21086l c21086l2 = (C21086l) c0035k0.m83g(jM99714D);
            if (c21086l2 != null) {
                if (this.f49196Q != null) {
                    AbstractC3006f0.m8732z(m7158L0(), null, null, new C13783f(this, c21086l2, interfaceC30057d, 2), 3);
                }
                mo39134i1(keyEvent);
            }
            if (c21086l2 != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a1 */
    public void mo39130a1(InterfaceC18044z interfaceC18044z) {
    }

    @Override // p005a3.InterfaceC0200f2
    /* JADX INFO: renamed from: b0 */
    public void mo465b0() {
        C21080f c21080f;
        InterfaceC21083i interfaceC21083i = this.f49196Q;
        if (interfaceC21083i != null && (c21080f = this.f49208c0) != null) {
            ((C21084j) interfaceC21083i).m58922b(new C21081g(c21080f));
        }
        this.f49208c0 = null;
        C34462h0 c34462h0 = this.f49205Z;
        if (c34462h0 != null) {
            c34462h0.mo465b0();
        }
    }

    /* JADX INFO: renamed from: b1 */
    public abstract C34462h0 mo39131b1();

    /* JADX INFO: renamed from: c1 */
    public final boolean m39150c1() {
        C22659b0 c22659b0 = new C22659b0();
        AbstractC0201g.m518r(this, C16418l2.f63090P, new C13828u(c22659b0, 0));
        return c22659b0.f89329w || AbstractC13835x.m39192a(this);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0070 A[LOOP:0: B:13:0x0031->B:23:0x0070, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x0073 A[EDGE_INSN: B:27:0x0073->B:24:0x0073 BREAK  A[LOOP:0: B:13:0x0031->B:23:0x0070], SYNTHETIC] */
    /* JADX INFO: renamed from: d1 */
    public final void m39151d1() {
        InterfaceC21083i interfaceC21083i = this.f49196Q;
        C0035k0 c0035k0 = this.f49209d0;
        if (interfaceC21083i != null) {
            C21086l c21086l = this.f49207b0;
            if (c21086l != null) {
                ((C21084j) interfaceC21083i).m58922b(new C21085k(c21086l));
            }
            C21080f c21080f = this.f49208c0;
            if (c21080f != null) {
                ((C21084j) interfaceC21083i).m58922b(new C21081g(c21080f));
            }
            Object[] objArr = c0035k0.f101c;
            long[] jArr = c0035k0.f99a;
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
                            if ((255 & j7) < 128) {
                                ((C21084j) interfaceC21083i).m58922b(new C21085k((C21086l) objArr[(i13 << 3) + i15]));
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
        }
        this.f49207b0 = null;
        this.f49208c0 = null;
        c0035k0.m77a();
    }

    /* JADX INFO: renamed from: e1 */
    public final void m39152e1() {
        InterfaceC21083i interfaceC21083i = this.f49196Q;
        if (interfaceC21083i != null) {
            C2996c2 c2996c2 = this.f49213h0;
            InterfaceC30057d interfaceC30057d = null;
            if (c2996c2 == null || !c2996c2.isActive()) {
                C21086l c21086l = this.f49207b0;
                if (c21086l != null) {
                    AbstractC3006f0.m8732z(m7158L0(), null, null, new C13780e(c21086l, interfaceC21083i, interfaceC30057d, 0), 3);
                }
            } else {
                C2996c2 c2996c3 = this.f49213h0;
                if (c2996c3 != null) {
                    c2996c3.cancel((CancellationException) null);
                }
            }
            this.f49207b0 = null;
        }
    }

    @Override // p005a3.InterfaceC0240p2
    /* JADX INFO: renamed from: f */
    public final Object mo276f() {
        return this.f49214i0;
    }

    /* JADX INFO: renamed from: f1 */
    public final void m39153f1() {
        if (this.f49206a0 != null) {
            return;
        }
        InterfaceC13832v0 interfaceC13832v0 = this.f49198S ? this.f49204Y : this.f49197R;
        if (interfaceC13832v0 != null) {
            if (this.f49196Q == null) {
                this.f49196Q = new C21084j();
            }
            this.f49203X.m39159c1(this.f49196Q);
            InterfaceC21083i interfaceC21083i = this.f49196Q;
            AbstractC22676k.m65747g(interfaceC21083i);
            InterfaceC0229n interfaceC0229nMo3461a = interfaceC13832v0.mo3461a(interfaceC21083i);
            m665X0(interfaceC0229nMo3461a);
            this.f49206a0 = interfaceC0229nMo3461a;
        }
    }

    /* JADX INFO: renamed from: g1 */
    public void mo39132g1() {
    }

    /* JADX INFO: renamed from: h1 */
    public abstract boolean mo39133h1(KeyEvent keyEvent);

    /* JADX INFO: renamed from: i1 */
    public abstract void mo39134i1(KeyEvent keyEvent);

    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX INFO: renamed from: j1 */
    public final void m39154j1(InterfaceC21083i interfaceC21083i, InterfaceC13832v0 interfaceC13832v0, boolean z4, boolean z13, String str, C18027i c18027i, InterfaceC4339a interfaceC4339a) {
        boolean z14;
        boolean z15;
        InterfaceC0229n interfaceC0229n;
        if (AbstractC22676k.m65745e(this.f49211f0, interfaceC21083i)) {
            z14 = false;
        } else {
            m39151d1();
            this.f49211f0 = interfaceC21083i;
            this.f49196Q = interfaceC21083i;
            z14 = true;
        }
        if (!AbstractC22676k.m65745e(this.f49197R, interfaceC13832v0)) {
            this.f49197R = interfaceC13832v0;
            z14 = true;
        }
        if (this.f49198S != z4) {
            this.f49198S = z4;
            if (z4) {
                mo796C();
            }
            z14 = true;
        }
        boolean z16 = this.f49201V;
        C13793i0 c13793i0 = this.f49203X;
        if (z16 != z13) {
            if (z13) {
                m665X0(c13793i0);
            } else {
                m666Y0(c13793i0);
                m39151d1();
            }
            AbstractC0201g.m510j(this);
            this.f49201V = z13;
        }
        if (!AbstractC22676k.m65745e(this.f49199T, str)) {
            this.f49199T = str;
            AbstractC0201g.m510j(this);
        }
        if (!AbstractC22676k.m65745e(this.f49200U, c18027i)) {
            this.f49200U = c18027i;
            AbstractC0201g.m510j(this);
        }
        this.f49202W = interfaceC4339a;
        boolean z17 = this.f49212g0;
        InterfaceC21083i interfaceC21083i2 = this.f49211f0;
        if (z17 != (interfaceC21083i2 == null)) {
            boolean z18 = interfaceC21083i2 == null;
            this.f49212g0 = z18;
            z15 = (z18 || this.f49206a0 != null) ? z14 : true;
        }
        if (z15 && ((interfaceC0229n = this.f49206a0) != null || !this.f49212g0)) {
            if (interfaceC0229n != null) {
                m666Y0(interfaceC0229n);
            }
            this.f49206a0 = null;
            m39153f1();
        }
        c13793i0.m39159c1(this.f49196Q);
    }

    @Override // p005a3.InterfaceC0216j2
    /* JADX INFO: renamed from: n */
    public final void mo471n(InterfaceC18044z interfaceC18044z) {
        C18027i c18027i = this.f49200U;
        if (c18027i != null) {
            AbstractC18041w.m51810i(interfaceC18044z, c18027i.f69949a);
        }
        String str = this.f49199T;
        C13768a c13768a = new C13768a(this, 1);
        InterfaceC21493z[] interfaceC21493zArr = AbstractC18041w.f70062a;
        ((C18030l) interfaceC18044z).m51772e(AbstractC18029k.f69955b, new C18017a(str, c13768a));
        if (this.f49201V) {
            this.f49203X.mo471n(interfaceC18044z);
        } else {
            AbstractC18041w.m51802a(interfaceC18044z);
        }
        mo39130a1(interfaceC18044z);
    }

    @Override // p005a3.InterfaceC0200f2
    /* JADX INFO: renamed from: r0 */
    public void mo473r0(C34465k c34465k, EnumC34466l enumC34466l, long j7) {
        C34462h0 c34462h0Mo39131b1;
        long j13 = ((j7 >> 33) << 32) | (((j7 << 32) >> 33) & 4294967295L);
        this.f49210e0 = (((long) Float.floatToRawIntBits((int) (j13 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j13 & 4294967295L))) & 4294967295L);
        m39153f1();
        if (this.f49201V && enumC34466l == EnumC34466l.f144807x) {
            int i13 = c34465k.f144805f;
            InterfaceC30057d interfaceC30057d = null;
            if (i13 == 4) {
                AbstractC3006f0.m8732z(m7158L0(), null, null, new C13786g(this, interfaceC30057d, 0), 3);
            } else if (i13 == 5) {
                AbstractC3006f0.m8732z(m7158L0(), null, null, new C13786g(this, interfaceC30057d, 1), 3);
            }
        }
        if (this.f49205Z == null && (c34462h0Mo39131b1 = mo39131b1()) != null) {
            m665X0(c34462h0Mo39131b1);
            this.f49205Z = c34462h0Mo39131b1;
        }
        C34462h0 c34462h0 = this.f49205Z;
        if (c34462h0 != null) {
            c34462h0.mo473r0(c34465k, enumC34466l, j7);
        }
    }
}
