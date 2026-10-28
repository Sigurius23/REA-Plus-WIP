package p132f0;

import bc3.AbstractC3006f0;
import l83.C23454a0;
import p005a3.InterfaceC0200f2;
import p026b2.AbstractC2316v;
import p238j0.C21080f;
import p238j0.C21081g;
import p238j0.C21084j;
import p238j0.InterfaceC21083i;
import p505ts.AbstractC34132o;
import p512u2.C34465k;
import p512u2.EnumC34466l;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: f0.q0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13817q0 extends AbstractC2316v implements InterfaceC0200f2 {

    /* JADX INFO: renamed from: O */
    public InterfaceC21083i f49300O;

    /* JADX INFO: renamed from: P */
    public C21080f f49301P;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: X0 */
    public static final Object m39179X0(C13817q0 c13817q0, AbstractC32269c abstractC32269c) {
        C13808n0 c13808n0;
        C21080f c21080f;
        if (abstractC32269c instanceof C13808n0) {
            c13808n0 = (C13808n0) abstractC32269c;
            int i13 = c13808n0.f49271z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c13808n0.f49271z = i13 - Integer.MIN_VALUE;
            } else {
                c13808n0 = new C13808n0(c13817q0, abstractC32269c);
            }
        } else {
            c13808n0 = new C13808n0(c13817q0, abstractC32269c);
        }
        Object obj = c13808n0.f49269x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c13808n0.f49271z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (c13817q0.f49301P == null) {
                C21080f c21080f2 = new C21080f();
                InterfaceC21083i interfaceC21083i = c13817q0.f49300O;
                c13808n0.f49268w = c21080f2;
                c13808n0.f49271z = 1;
                if (((C21084j) interfaceC21083i).m58921a(c21080f2, c13808n0) == enumC31071a) {
                    return enumC31071a;
                }
                c21080f = c21080f2;
            }
            return C23454a0.f92919a;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c21080f = c13808n0.f49268w;
        AbstractC34132o.m107864I(obj);
        c13817q0.f49301P = c21080f;
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: Y0 */
    public static final Object m39180Y0(C13817q0 c13817q0, AbstractC32269c abstractC32269c) {
        C13811o0 c13811o0;
        if (abstractC32269c instanceof C13811o0) {
            c13811o0 = (C13811o0) abstractC32269c;
            int i13 = c13811o0.f49280y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c13811o0.f49280y = i13 - Integer.MIN_VALUE;
            } else {
                c13811o0 = new C13811o0(c13817q0, abstractC32269c);
            }
        } else {
            c13811o0 = new C13811o0(c13817q0, abstractC32269c);
        }
        Object obj = c13811o0.f49278w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c13811o0.f49280y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C21080f c21080f = c13817q0.f49301P;
            if (c21080f != null) {
                C21081g c21081g = new C21081g(c21080f);
                InterfaceC21083i interfaceC21083i = c13817q0.f49300O;
                c13811o0.f49280y = 1;
                if (((C21084j) interfaceC21083i).m58921a(c21081g, c13811o0) == enumC31071a) {
                    return enumC31071a;
                }
            }
            return C23454a0.f92919a;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(obj);
        c13817q0.f49301P = null;
        return C23454a0.f92919a;
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: Q0 */
    public final void mo286Q0() {
        m39181Z0();
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m39181Z0() {
        C21080f c21080f = this.f49301P;
        if (c21080f != null) {
            ((C21084j) this.f49300O).m58922b(new C21081g(c21080f));
            this.f49301P = null;
        }
    }

    @Override // p005a3.InterfaceC0200f2
    /* JADX INFO: renamed from: b0 */
    public final void mo465b0() {
        m39181Z0();
    }

    @Override // p005a3.InterfaceC0200f2
    /* JADX INFO: renamed from: r0 */
    public final void mo473r0(C34465k c34465k, EnumC34466l enumC34466l, long j7) {
        if (enumC34466l == EnumC34466l.f144807x) {
            int i13 = c34465k.f144805f;
            InterfaceC30057d interfaceC30057d = null;
            if (i13 == 4) {
                AbstractC3006f0.m8732z(m7158L0(), null, null, new C13814p0(this, interfaceC30057d, 0), 3);
            } else if (i13 == 5) {
                AbstractC3006f0.m8732z(m7158L0(), null, null, new C13814p0(this, interfaceC30057d, 1), 3);
            }
        }
    }
}
