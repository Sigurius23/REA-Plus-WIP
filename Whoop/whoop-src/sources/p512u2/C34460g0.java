package p512u2;

import androidx.compose.p018ui.input.pointer.CancelTimeoutCancellationException;
import androidx.compose.p018ui.input.pointer.PointerEventTimeoutCancellationException;
import bc3.AbstractC3006f0;
import bc3.C2996c2;
import bc3.C3033m;
import c93.InterfaceC4351m;
import ge3.AbstractC15751g;
import java.util.concurrent.CancellationException;
import p005a3.AbstractC0201g;
import p027b3.InterfaceC2395j3;
import p028b4.C2698i;
import p180h0.C16394g3;
import p505ts.AbstractC34132o;
import p636y3.InterfaceC39171c;
import q83.C30064k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32267a;

/* JADX INFO: renamed from: u2.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C34460g0 implements InterfaceC34449b, InterfaceC39171c, InterfaceC30057d {

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C34462h0 f144774F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C34462h0 f144775w;

    /* JADX INFO: renamed from: x */
    public final C3033m f144776x;

    /* JADX INFO: renamed from: y */
    public C3033m f144777y;

    /* JADX INFO: renamed from: z */
    public EnumC34466l f144778z = EnumC34466l.f144807x;

    /* JADX INFO: renamed from: E */
    public final C30064k f144773E = C30064k.f122676w;

    public C34460g0(C34462h0 c34462h0, C3033m c3033m) {
        this.f144774F = c34462h0;
        this.f144775w = c34462h0;
        this.f144776x = c3033m;
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: D0 */
    public final long mo722D0(long j7) {
        return this.f144775w.mo722D0(j7);
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: F */
    public final int mo724F(float f13) {
        return this.f144775w.mo724F(f13);
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: K */
    public final float mo726K(long j7) {
        return this.f144775w.mo726K(j7);
    }

    /* JADX INFO: renamed from: a */
    public final Object m108928a(EnumC34466l enumC34466l, InterfaceC30057d interfaceC30057d) {
        C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(interfaceC30057d));
        c3033m.m8774s();
        this.f144778z = enumC34466l;
        this.f144777y = c3033m;
        Object objM8773r = c3033m.m8773r();
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objM8773r;
    }

    /* JADX INFO: renamed from: b */
    public final long m108929b() {
        C34462h0 c34462h0 = this.f144774F;
        c34462h0.getClass();
        long jMo722D0 = c34462h0.mo722D0(AbstractC0201g.m516p(c34462h0).f778Z.getMinimumTouchTargetSize());
        long j7 = c34462h0.f144789Y;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jMo722D0 >> 32)) - ((int) (j7 >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jMo722D0 & 4294967295L)) - ((int) (j7 & 4294967295L))) / 2.0f)) & 4294967295L);
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: e0 */
    public final float mo733e0(int i13) {
        return this.f144775w.mo733e0(i13);
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC2395j3 m108930f() {
        C34462h0 c34462h0 = this.f144774F;
        c34462h0.getClass();
        return AbstractC0201g.m516p(c34462h0).f778Z;
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: f0 */
    public final float mo734f0(float f13) {
        return f13 / this.f144775w.getDensity();
    }

    @Override // q83.InterfaceC30057d
    public final InterfaceC30063j getContext() {
        return this.f144773E;
    }

    @Override // p636y3.InterfaceC39171c
    public final float getDensity() {
        return this.f144775w.getDensity();
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: h */
    public final long mo735h(float f13) {
        return this.f144775w.mo735h(f13);
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: i */
    public final long mo736i(long j7) {
        return this.f144775w.mo736i(j7);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    public final Object m108931k(long j7, InterfaceC4351m interfaceC4351m, AbstractC32267a abstractC32267a) throws Throwable {
        C34456e0 c34456e0;
        C2996c2 c2996c2M8732z;
        Throwable th3;
        C3033m c3033m;
        if (abstractC32267a instanceof C34456e0) {
            c34456e0 = (C34456e0) abstractC32267a;
            int i13 = c34456e0.f144763z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c34456e0.f144763z = i13 - Integer.MIN_VALUE;
            } else {
                c34456e0 = new C34456e0(this, abstractC32267a);
            }
        } else {
            c34456e0 = new C34456e0(this, abstractC32267a);
        }
        Object objInvoke = c34456e0.f144761x;
        Object obj = EnumC31071a.f128113w;
        int i14 = c34456e0.f144763z;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2996c2M8732z = c34456e0.f144760w;
            try {
                AbstractC34132o.m107864I(objInvoke);
                c2996c2M8732z.cancel((CancellationException) CancelTimeoutCancellationException.f4834w);
                return objInvoke;
            } catch (Throwable th4) {
                th3 = th4;
                c2996c2M8732z.cancel((CancellationException) CancelTimeoutCancellationException.f4834w);
                throw th3;
            }
        }
        AbstractC34132o.m107864I(objInvoke);
        if (j7 <= 0 && (c3033m = this.f144777y) != null) {
            c3033m.resumeWith(AbstractC34132o.m107888l(new PointerEventTimeoutCancellationException(j7)));
        }
        c2996c2M8732z = AbstractC3006f0.m8732z(this.f144774F.m7158L0(), null, null, new C2698i(j7, this, (InterfaceC30057d) null, 6), 3);
        try {
            c34456e0.f144760w = c2996c2M8732z;
            c34456e0.f144763z = 1;
            objInvoke = interfaceC4351m.invoke(this, c34456e0);
            if (objInvoke == obj) {
                return obj;
            }
            c2996c2M8732z.cancel((CancellationException) CancelTimeoutCancellationException.f4834w);
            return objInvoke;
        } catch (Throwable th5) {
            th3 = th5;
            c2996c2M8732z.cancel((CancellationException) CancelTimeoutCancellationException.f4834w);
            throw th3;
        }
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: l */
    public final float mo738l(long j7) {
        return this.f144775w.mo738l(j7);
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: m0 */
    public final float getFontScale() {
        return this.f144775w.getFontScale();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: o */
    public final Object m108932o(long j7, C16394g3 c16394g3, AbstractC32267a abstractC32267a) throws Throwable {
        C34458f0 c34458f0;
        if (abstractC32267a instanceof C34458f0) {
            c34458f0 = (C34458f0) abstractC32267a;
            int i13 = c34458f0.f144766y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c34458f0.f144766y = i13 - Integer.MIN_VALUE;
            } else {
                c34458f0 = new C34458f0(this, abstractC32267a);
            }
        } else {
            c34458f0 = new C34458f0(this, abstractC32267a);
        }
        Object obj = c34458f0.f144764w;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c34458f0.f144766y;
        try {
            if (i14 != 0) {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            c34458f0.f144766y = 1;
            Object objM108931k = m108931k(j7, c16394g3, c34458f0);
            return objM108931k == obj2 ? obj2 : objM108931k;
        } catch (PointerEventTimeoutCancellationException unused) {
            return null;
        }
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: q */
    public final long mo742q(float f13) {
        return this.f144775w.mo742q(f13);
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: q0 */
    public final float mo743q0(float f13) {
        return this.f144775w.getDensity() * f13;
    }

    @Override // q83.InterfaceC30057d
    public final void resumeWith(Object obj) {
        C34462h0 c34462h0 = this.f144774F;
        synchronized (c34462h0.f144786V) {
            c34462h0.f144785U.m94893k(this);
        }
        this.f144776x.resumeWith(obj);
    }
}
