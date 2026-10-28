package f30;

import b10.C2225c;
import b10.C2273z0;
import bc3.AbstractC3034m0;
import bc3.AbstractC3076z;
import bc3.C2996c2;
import c93.InterfaceC4339a;
import com.stripe.android.model.StripeIntent$Status;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import k83.InterfaceC22297a;
import l83.C23454a0;
import l83.C23467m;
import l83.C23468n;
import m83.C25271y;
import p505ts.AbstractC34132o;
import p537ux.C35363y;
import p664yy.C39857f;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import y00.C38887l3;

/* JADX INFO: renamed from: f30.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C14042e {

    /* JADX INFO: renamed from: a */
    public final C2273z0 f50107a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC22297a f50108b;

    /* JADX INFO: renamed from: c */
    public final C14043f f50109c;

    /* JADX INFO: renamed from: d */
    public final AbstractC3076z f50110d;

    /* JADX INFO: renamed from: e */
    public C2996c2 f50111e;

    /* JADX INFO: renamed from: f */
    public final C13045h2 f50112f;

    /* JADX INFO: renamed from: g */
    public final C13045h2 f50113g;

    public C14042e(C2273z0 c2273z0, C2225c paymentConfigProvider, C14043f c14043f, AbstractC3076z dispatcher) {
        AbstractC22676k.m65750j(paymentConfigProvider, "paymentConfigProvider");
        AbstractC22676k.m65750j(dispatcher, "dispatcher");
        this.f50107a = c2273z0;
        this.f50108b = paymentConfigProvider;
        this.f50109c = c14043f;
        this.f50110d = dispatcher;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(null);
        this.f50112f = c13045h2M36593c;
        this.f50113g = c13045h2M36593c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Enum m39956a(AbstractC32269c abstractC32269c) {
        C14040c c14040c;
        Object objM7071Q;
        if (abstractC32269c instanceof C14040c) {
            c14040c = (C14040c) abstractC32269c;
            int i13 = c14040c.f50101y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c14040c.f50101y = i13 - Integer.MIN_VALUE;
            } else {
                c14040c = new C14040c(this, abstractC32269c);
            }
        } else {
            c14040c = new C14040c(this, abstractC32269c);
        }
        Object obj = c14040c.f50099w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c14040c.f50101y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            final C35363y c35363y = (C35363y) this.f50108b.get();
            String str = this.f50109c.f50114a;
            final int i15 = 0;
            final int i16 = 1;
            C39857f c39857f = new C39857f(new InterfaceC4339a() { // from class: f30.a
                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    switch (i15) {
                        case 0:
                            return c35363y.f150633w;
                        default:
                            return c35363y.f150634x;
                    }
                }
            }, new InterfaceC4339a() { // from class: f30.a
                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    switch (i16) {
                        case 0:
                            return c35363y.f150633w;
                        default:
                            return c35363y.f150634x;
                    }
                }
            });
            c14040c.f50101y = 1;
            objM7071Q = this.f50107a.m7071Q(str, c39857f, C25271y.f99162w, c14040c);
            if (objM7071Q == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            objM7071Q = ((C23468n) obj).f92940w;
        }
        if (objM7071Q instanceof C23467m) {
            objM7071Q = null;
        }
        C38887l3 c38887l3 = (C38887l3) objM7071Q;
        if (c38887l3 != null) {
            return c38887l3.f167382Q;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x009a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m39957b(AbstractC32269c abstractC32269c) {
        C14041d c14041d;
        C13045h2 c13045h2;
        C14042e c14042e;
        C14042e c14042e2;
        if (abstractC32269c instanceof C14041d) {
            c14041d = (C14041d) abstractC32269c;
            int i13 = c14041d.f50102E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c14041d.f50102E = i13 - Integer.MIN_VALUE;
            } else {
                c14041d = new C14041d(this, abstractC32269c);
            }
        } else {
            c14041d = new C14041d(this, abstractC32269c);
        }
        Object objM39956a = c14041d.f50105y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c14041d.f50102E;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM39956a);
            StripeIntent$Status stripeIntent$Status = (StripeIntent$Status) this.f50113g.getValue();
            switch (stripeIntent$Status == null ? -1 : AbstractC14039b.f50098a[stripeIntent$Status.ordinal()]) {
                case -1:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    c14041d.f50103w = this;
                    c13045h2 = this.f50112f;
                    c14041d.f50104x = c13045h2;
                    c14041d.f50102E = 1;
                    objM39956a = m39956a(c14041d);
                    if (objM39956a != enumC31071a) {
                        c14042e = this;
                        break;
                    }
                    return enumC31071a;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                case 2:
                    return c23454a0;
            }
        }
        if (i14 == 1) {
            c13045h2 = c14041d.f50104x;
            c14042e = c14041d.f50103w;
            AbstractC34132o.m107864I(objM39956a);
        } else {
            if (i14 != 2) {
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM39956a);
                return c23454a0;
            }
            c14042e2 = c14041d.f50103w;
            AbstractC34132o.m107864I(objM39956a);
        }
        c14041d.f50103w = null;
        c14041d.f50102E = 3;
        if (c14042e2.m39957b(c14041d) != enumC31071a) {
            return enumC31071a;
        }
        return c23454a0;
        c13045h2.m36570j(objM39956a);
        Duration.Companion companion = Duration.INSTANCE;
        long duration = DurationKt.toDuration(1, DurationUnit.SECONDS);
        c14041d.f50103w = c14042e;
        c14041d.f50104x = null;
        c14041d.f50102E = 2;
        if (AbstractC3034m0.m8783c(duration, c14041d) != enumC31071a) {
            c14042e2 = c14042e;
            c14041d.f50103w = null;
            c14041d.f50102E = 3;
            if (c14042e2.m39957b(c14041d) != enumC31071a) {
                return c23454a0;
            }
        }
        return enumC31071a;
    }
}
