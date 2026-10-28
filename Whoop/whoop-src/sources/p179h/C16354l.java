package p179h;

import android.content.Context;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p133f1.C13968p1;
import p457rc.AbstractC31224g;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: h.l */
/* JADX INFO: loaded from: classes.dex */
public final class C16354l extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f62873w = 1;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ boolean f62874x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f62875y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16354l(Context context, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f62875y = context;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f62873w) {
            case 0:
                return new C16354l((C16353k) this.f62875y, this.f62874x, interfaceC30057d);
            default:
                C16354l c16354l = new C16354l((Context) this.f62875y, interfaceC30057d);
                c16354l.f62874x = ((Boolean) obj).booleanValue();
                return c16354l;
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f62873w) {
            case 0:
                C16354l c16354l = (C16354l) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a0 = C23454a0.f92919a;
                c16354l.invokeSuspend(c23454a0);
                return c23454a0;
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                C16354l c16354l2 = (C16354l) create(bool, (InterfaceC30057d) obj2);
                C23454a0 c23454a1 = C23454a0.f92919a;
                c16354l2.invokeSuspend(c23454a1);
                return c23454a1;
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        C13968p1 c13968p1;
        int i13 = this.f62873w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj2 = this.f62875y;
        switch (i13) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C16353k c16353k = (C16353k) obj2;
                boolean z4 = this.f62874x;
                if (!z4 && !c16353k.f62872g && c16353k.m43010g() && (c13968p1 = c16353k.f62871f) != null) {
                    c13968p1.m39750d();
                }
                c16353k.m43013j(z4);
                break;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                AbstractC31224g.m96165a((Context) obj2, RescheduleReceiver.class, this.f62874x);
                break;
        }
        return c23454a0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16354l(C16353k c16353k, boolean z4, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f62875y = c16353k;
        this.f62874x = z4;
    }
}
