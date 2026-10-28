package p102dy;

import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.lifecycle.AbstractC1637w1;
import do0.C12229c;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import l83.C23454a0;
import p024b0.C2178b;
import p298l8.C23421d;
import p505ts.AbstractC34132o;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import uz.C35401o;
import uz.C35404r;
import uz.C35405s;
import uz.InterfaceC35406t;
import y00.C38797c3;

/* JADX INFO: renamed from: dy.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C12441j extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E */
    public static final C23421d f42379E;

    /* JADX INFO: renamed from: w */
    public final C38797c3 f42380w;

    /* JADX INFO: renamed from: x */
    public final C35401o f42381x;

    /* JADX INFO: renamed from: y */
    public final C13096w1 f42382y;

    /* JADX INFO: renamed from: z */
    public final C13096w1 f42383z;

    static {
        C2178b c2178b = new C2178b(2);
        c2178b.m6855a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C12441j.class), new C12229c(11));
        f42379E = c2178b.m6857c();
    }

    public C12441j(C38797c3 passiveCaptchaParams, C35401o c35401o) {
        AbstractC22676k.m65750j(passiveCaptchaParams, "passiveCaptchaParams");
        this.f42380w = passiveCaptchaParams;
        this.f42381x = c35401o;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(1, 0, null, 6);
        this.f42382y = c13096w1M36592b;
        this.f42383z = c13096w1M36592b;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x008f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Object m34996g(AbstractActivityC1340r0 abstractActivityC1340r0, AbstractC32269c abstractC32269c) {
        C12440i c12440i;
        C12441j c12441j;
        if (abstractC32269c instanceof C12440i) {
            c12440i = (C12440i) abstractC32269c;
            int i13 = c12440i.f42378z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c12440i.f42378z = i13 - Integer.MIN_VALUE;
            } else {
                c12440i = new C12440i(this, abstractC32269c);
            }
        } else {
            c12440i = new C12440i(this, abstractC32269c);
        }
        Object objM112319a = c12440i.f42376x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c12440i.f42378z;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM112319a);
            C38797c3 c38797c3 = this.f42380w;
            String str = c38797c3.f166973w;
            String str2 = c38797c3.f166974x;
            c12440i.f42375w = this;
            c12440i.f42378z = 1;
            objM112319a = this.f42381x.m112319a(abstractActivityC1340r0, str, str2, c12440i);
            if (objM112319a != enumC31071a) {
                c12441j = this;
            }
            return enumC31071a;
        }
        if (i14 != 1) {
            if (i14 == 2) {
                AbstractC34132o.m107864I(objM112319a);
                return c23454a0;
            }
            if (i14 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM112319a);
            return c23454a0;
        }
        c12441j = c12440i.f42375w;
        AbstractC34132o.m107864I(objM112319a);
        InterfaceC35406t interfaceC35406t = (InterfaceC35406t) objM112319a;
        if (interfaceC35406t instanceof C35404r) {
            C13096w1 c13096w1 = c12441j.f42382y;
            C12435d c12435d = new C12435d(((C35404r) interfaceC35406t).f150842a);
            c12440i.f42375w = null;
            c12440i.f42378z = 2;
            if (c13096w1.emit(c12435d, c12440i) == enumC31071a) {
                return enumC31071a;
            }
            return c23454a0;
        }
        if (!(interfaceC35406t instanceof C35405s)) {
            throw new NoWhenBranchMatchedException();
        }
        C13096w1 c13096w2 = c12441j.f42382y;
        C12436e c12436e = new C12436e(((C35405s) interfaceC35406t).f150843a);
        c12440i.f42375w = null;
        c12440i.f42378z = 3;
        if (c13096w2.emit(c12436e, c12440i) == enumC31071a) {
            return enumC31071a;
        }
        return c23454a0;
    }
}
