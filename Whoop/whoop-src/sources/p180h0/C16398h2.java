package p180h0;

import androidx.compose.foundation.gestures.GestureCancellationException;
import l83.C23454a0;
import mc3.C25437c;
import p505ts.AbstractC34132o;
import p636y3.InterfaceC39171c;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: h0.h2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16398h2 implements InterfaceC39171c {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ InterfaceC39171c f63038w;

    /* JADX INFO: renamed from: x */
    public boolean f63039x;

    /* JADX INFO: renamed from: y */
    public boolean f63040y;

    /* JADX INFO: renamed from: z */
    public final C25437c f63041z = new C25437c(false);

    public C16398h2(InterfaceC39171c interfaceC39171c) {
        this.f63038w = interfaceC39171c;
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: D0 */
    public final long mo722D0(long j7) {
        return this.f63038w.mo722D0(j7);
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: F */
    public final int mo724F(float f13) {
        return this.f63038w.mo724F(f13);
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: K */
    public final float mo726K(long j7) {
        return this.f63038w.mo726K(j7);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m46586a(AbstractC32269c abstractC32269c) {
        C16383e2 c16383e2;
        if (abstractC32269c instanceof C16383e2) {
            c16383e2 = (C16383e2) abstractC32269c;
            int i13 = c16383e2.f62991y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c16383e2.f62991y = i13 - Integer.MIN_VALUE;
            } else {
                c16383e2 = new C16383e2(this, abstractC32269c);
            }
        } else {
            c16383e2 = new C16383e2(this, abstractC32269c);
        }
        Object objM46590f = c16383e2.f62989w;
        Object obj = EnumC31071a.f128113w;
        int i14 = c16383e2.f62991y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM46590f);
            c16383e2.f62991y = 1;
            objM46590f = m46590f(c16383e2);
            if (objM46590f == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM46590f);
        }
        if (((Boolean) objM46590f).booleanValue()) {
            return C23454a0.f92919a;
        }
        throw new GestureCancellationException("The press gesture was canceled.");
    }

    /* JADX INFO: renamed from: b */
    public final void m46587b() {
        this.f63040y = true;
        C25437c c25437c = this.f63041z;
        if (c25437c.mo68213h()) {
            c25437c.mo68214i(null);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m46588c() {
        this.f63039x = true;
        C25437c c25437c = this.f63041z;
        if (c25437c.mo68213h()) {
            c25437c.mo68214i(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m46589e(AbstractC32269c abstractC32269c) {
        C16388f2 c16388f2;
        if (abstractC32269c instanceof C16388f2) {
            c16388f2 = (C16388f2) abstractC32269c;
            int i13 = c16388f2.f63017y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c16388f2.f63017y = i13 - Integer.MIN_VALUE;
            } else {
                c16388f2 = new C16388f2(this, abstractC32269c);
            }
        } else {
            c16388f2 = new C16388f2(this, abstractC32269c);
        }
        Object obj = c16388f2.f63015w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c16388f2.f63017y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            c16388f2.f63017y = 1;
            if (this.f63041z.mo68211b(c16388f2) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        this.f63039x = false;
        this.f63040y = false;
        return C23454a0.f92919a;
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: e0 */
    public final float mo733e0(int i13) {
        return this.f63038w.mo733e0(i13);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m46590f(AbstractC32269c abstractC32269c) {
        C16393g2 c16393g2;
        if (abstractC32269c instanceof C16393g2) {
            c16393g2 = (C16393g2) abstractC32269c;
            int i13 = c16393g2.f63028y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c16393g2.f63028y = i13 - Integer.MIN_VALUE;
            } else {
                c16393g2 = new C16393g2(this, abstractC32269c);
            }
        } else {
            c16393g2 = new C16393g2(this, abstractC32269c);
        }
        Object obj = c16393g2.f63026w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c16393g2.f63028y;
        C25437c c25437c = this.f63041z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (!this.f63039x && !this.f63040y) {
                c16393g2.f63028y = 1;
                if (c25437c.mo68211b(c16393g2) == enumC31071a) {
                    return enumC31071a;
                }
            }
            return Boolean.valueOf(this.f63039x);
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(obj);
        c25437c.mo68214i(null);
        return Boolean.valueOf(this.f63039x);
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: f0 */
    public final float mo734f0(float f13) {
        return this.f63038w.mo734f0(f13);
    }

    @Override // p636y3.InterfaceC39171c
    public final float getDensity() {
        return this.f63038w.getDensity();
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: h */
    public final long mo735h(float f13) {
        return this.f63038w.mo735h(f13);
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: i */
    public final long mo736i(long j7) {
        return this.f63038w.mo736i(j7);
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: l */
    public final float mo738l(long j7) {
        return this.f63038w.mo738l(j7);
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: m0 */
    public final float getFontScale() {
        return this.f63038w.getFontScale();
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: q */
    public final long mo742q(float f13) {
        return this.f63038w.mo742q(f13);
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: q0 */
    public final float mo743q0(float f13) {
        return this.f63038w.mo743q0(f13);
    }
}
