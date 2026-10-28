package p180h0;

import dc3.C11923h;
import l83.C23454a0;
import p003a1.C0107f;
import p005a3.AbstractC0233o;
import p005a3.InterfaceC0200f2;
import p238j0.C21075a;
import p238j0.C21076b;
import p238j0.C21077c;
import p238j0.C21084j;
import p238j0.InterfaceC21083i;
import p505ts.AbstractC34132o;
import p512u2.AbstractC34452c0;
import p512u2.C34462h0;
import p512u2.C34465k;
import p512u2.EnumC34466l;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: h0.f1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16387f1 extends AbstractC0233o implements InterfaceC0200f2 {

    /* JADX INFO: renamed from: Q */
    public EnumC16377d2 f63006Q;

    /* JADX INFO: renamed from: R */
    public Function1 f63007R;

    /* JADX INFO: renamed from: S */
    public boolean f63008S;

    /* JADX INFO: renamed from: T */
    public InterfaceC21083i f63009T;

    /* JADX INFO: renamed from: U */
    public C11923h f63010U;

    /* JADX INFO: renamed from: V */
    public C21076b f63011V;

    /* JADX INFO: renamed from: W */
    public boolean f63012W;

    /* JADX INFO: renamed from: X */
    public long f63013X = 0;

    /* JADX INFO: renamed from: Y */
    public C34462h0 f63014Y;

    public AbstractC16387f1(Function1 function1, boolean z4, InterfaceC21083i interfaceC21083i, EnumC16377d2 enumC16377d2) {
        this.f63006Q = enumC16377d2;
        this.f63007R = function1;
        this.f63008S = z4;
        this.f63009T = interfaceC21083i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a1 */
    public static final Object m46577a1(AbstractC16387f1 abstractC16387f1, AbstractC32269c abstractC32269c) {
        C16364b1 c16364b1;
        if (abstractC32269c instanceof C16364b1) {
            c16364b1 = (C16364b1) abstractC32269c;
            int i13 = c16364b1.f62907y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c16364b1.f62907y = i13 - Integer.MIN_VALUE;
            } else {
                c16364b1 = new C16364b1(abstractC16387f1, abstractC32269c);
            }
        } else {
            c16364b1 = new C16364b1(abstractC16387f1, abstractC32269c);
        }
        Object obj = c16364b1.f62905w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c16364b1.f62907y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C21076b c21076b = abstractC16387f1.f63011V;
            if (c21076b != null) {
                InterfaceC21083i interfaceC21083i = abstractC16387f1.f63009T;
                if (interfaceC21083i != null) {
                    C21075a c21075a = new C21075a(c21076b);
                    c16364b1.f62907y = 1;
                    if (((C21084j) interfaceC21083i).m58921a(c21075a, c16364b1) == enumC31071a) {
                        return enumC31071a;
                    }
                }
            }
            abstractC16387f1.mo46583g1(0L);
            return C23454a0.f92919a;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(obj);
        abstractC16387f1.f63011V = null;
        abstractC16387f1.mo46583g1(0L);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b1 */
    public static final Object m46578b1(AbstractC16387f1 abstractC16387f1, C16401i0 c16401i0, AbstractC32269c abstractC32269c) {
        C16370c1 c16370c1;
        InterfaceC21083i interfaceC21083i;
        C21076b c21076b;
        C16401i0 c16401i1;
        C21076b c21076b2;
        if (abstractC32269c instanceof C16370c1) {
            c16370c1 = (C16370c1) abstractC32269c;
            int i13 = c16370c1.f62928E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c16370c1.f62928E = i13 - Integer.MIN_VALUE;
            } else {
                c16370c1 = new C16370c1(abstractC16387f1, abstractC32269c);
            }
        } else {
            c16370c1 = new C16370c1(abstractC16387f1, abstractC32269c);
        }
        Object obj = c16370c1.f62931y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c16370c1.f62928E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C21076b c21076b3 = abstractC16387f1.f63011V;
            if (c21076b3 != null && (interfaceC21083i = abstractC16387f1.f63009T) != null) {
                C21075a c21075a = new C21075a(c21076b3);
                c16370c1.f62929w = c16401i0;
                c16370c1.f62928E = 1;
                if (((C21084j) interfaceC21083i).m58921a(c21075a, c16370c1) != enumC31071a) {
                }
                return enumC31071a;
            }
            abstractC16387f1.f63011V = c21076b;
            abstractC16387f1.mo46582f1(c16401i0.m46591a());
            return C23454a0.f92919a;
        }
        if (i14 == 1) {
            c16401i0 = c16370c1.f62929w;
            AbstractC34132o.m107864I(obj);
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c21076b2 = c16370c1.f62930x;
            c16401i1 = c16370c1.f62929w;
            AbstractC34132o.m107864I(obj);
        }
        c21076b = c21076b2;
        c16401i0 = c16401i1;
        abstractC16387f1.f63011V = c21076b;
        abstractC16387f1.mo46582f1(c16401i0.m46591a());
        return C23454a0.f92919a;
        c21076b = new C21076b();
        InterfaceC21083i interfaceC21083i2 = abstractC16387f1.f63009T;
        if (interfaceC21083i2 != null) {
            c16370c1.f62929w = c16401i0;
            c16370c1.f62930x = c21076b;
            c16370c1.f62928E = 2;
            if (((C21084j) interfaceC21083i2).m58921a(c21076b, c16370c1) != enumC31071a) {
                c16401i1 = c16401i0;
                c21076b2 = c21076b;
                c21076b = c21076b2;
                c16401i0 = c16401i1;
            }
            return enumC31071a;
        }
        abstractC16387f1.f63011V = c21076b;
        abstractC16387f1.mo46582f1(c16401i0.m46591a());
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c1 */
    public static final Object m46579c1(AbstractC16387f1 abstractC16387f1, C16406j0 c16406j0, AbstractC32269c abstractC32269c) {
        C16376d1 c16376d1;
        if (abstractC32269c instanceof C16376d1) {
            c16376d1 = (C16376d1) abstractC32269c;
            int i13 = c16376d1.f62970z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c16376d1.f62970z = i13 - Integer.MIN_VALUE;
            } else {
                c16376d1 = new C16376d1(abstractC16387f1, abstractC32269c);
            }
        } else {
            c16376d1 = new C16376d1(abstractC16387f1, abstractC32269c);
        }
        Object obj = c16376d1.f62968x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c16376d1.f62970z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C21076b c21076b = abstractC16387f1.f63011V;
            if (c21076b != null) {
                InterfaceC21083i interfaceC21083i = abstractC16387f1.f63009T;
                if (interfaceC21083i != null) {
                    C21077c c21077c = new C21077c(c21076b);
                    c16376d1.f62967w = c16406j0;
                    c16376d1.f62970z = 1;
                    if (((C21084j) interfaceC21083i).m58921a(c21077c, c16376d1) == enumC31071a) {
                        return enumC31071a;
                    }
                }
            }
            abstractC16387f1.mo46583g1(c16406j0.m46593a());
            return C23454a0.f92919a;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c16406j0 = c16376d1.f62967w;
        AbstractC34132o.m107864I(obj);
        abstractC16387f1.f63011V = null;
        abstractC16387f1.mo46583g1(c16406j0.m46593a());
        return C23454a0.f92919a;
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: Q0 */
    public final void mo286Q0() {
        this.f63012W = false;
        m46580d1();
        this.f63013X = 0L;
    }

    @Override // p005a3.InterfaceC0200f2
    /* JADX INFO: renamed from: b0 */
    public final void mo465b0() {
        C34462h0 c34462h0 = this.f63014Y;
        if (c34462h0 != null) {
            c34462h0.mo465b0();
        }
    }

    /* JADX INFO: renamed from: d1 */
    public final void m46580d1() {
        C21076b c21076b = this.f63011V;
        if (c21076b != null) {
            InterfaceC21083i interfaceC21083i = this.f63009T;
            if (interfaceC21083i != null) {
                ((C21084j) interfaceC21083i).m58922b(new C21075a(c21076b));
            }
            this.f63011V = null;
        }
    }

    /* JADX INFO: renamed from: e1 */
    public abstract Object mo46581e1(C16382e1 c16382e1, C16382e1 c16382e2);

    /* JADX INFO: renamed from: f1 */
    public abstract void mo46582f1(long j7);

    /* JADX INFO: renamed from: g1 */
    public abstract void mo46583g1(long j7);

    /* JADX INFO: renamed from: h1 */
    public abstract boolean mo46584h1();

    /* JADX INFO: renamed from: i1 */
    public final void m46585i1(Function1 function1, boolean z4, InterfaceC21083i interfaceC21083i, EnumC16377d2 enumC16377d2, boolean z13) {
        C34462h0 c34462h0;
        this.f63007R = function1;
        boolean z14 = true;
        if (this.f63008S != z4) {
            this.f63008S = z4;
            if (!z4) {
                m46580d1();
                C34462h0 c34462h1 = this.f63014Y;
                if (c34462h1 != null) {
                    m666Y0(c34462h1);
                }
                this.f63014Y = null;
            }
            z13 = true;
        }
        if (!AbstractC22676k.m65745e(this.f63009T, interfaceC21083i)) {
            m46580d1();
            this.f63009T = interfaceC21083i;
        }
        if (this.f63006Q != enumC16377d2) {
            this.f63006Q = enumC16377d2;
        } else {
            z14 = z13;
        }
        if (!z14 || (c34462h0 = this.f63014Y) == null) {
            return;
        }
        c34462h0.m108936Z0();
    }

    @Override // p005a3.InterfaceC0200f2
    /* JADX INFO: renamed from: r0 */
    public void mo473r0(C34465k c34465k, EnumC34466l enumC34466l, long j7) {
        if (this.f63008S && this.f63014Y == null) {
            C34462h0 c34462h0M108902a = AbstractC34452c0.m108902a(new C0107f(this, 4));
            m665X0(c34462h0M108902a);
            this.f63014Y = c34462h0M108902a;
        }
        C34462h0 c34462h0 = this.f63014Y;
        if (c34462h0 != null) {
            c34462h0.mo473r0(c34465k, enumC34466l, j7);
        }
    }
}
