package p180h0;

import c93.InterfaceC4352n;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: h0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C16390g extends AbstractC32275i implements InterfaceC4352n {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ InterfaceC16356a f63022w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ InterfaceC16397h1 f63023x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f63024y;

    @Override // c93.InterfaceC4352n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        C16390g c16390g = new C16390g(4, (InterfaceC30057d) obj4);
        c16390g.f63022w = (InterfaceC16356a) obj;
        c16390g.f63023x = (InterfaceC16397h1) obj2;
        c16390g.f63024y = obj3;
        C23454a0 c23454a0 = C23454a0.f92919a;
        c16390g.invokeSuspend(c23454a0);
        return c23454a0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        AbstractC34132o.m107864I(obj);
        InterfaceC16356a interfaceC16356a = this.f63022w;
        float fM46650e = ((C16475x) this.f63023x).m46650e(this.f63024y);
        if (!Float.isNaN(fM46650e)) {
            ((C16430o) interfaceC16356a).m46600b(fM46650e, 0.0f);
        }
        return C23454a0.f92919a;
    }
}
