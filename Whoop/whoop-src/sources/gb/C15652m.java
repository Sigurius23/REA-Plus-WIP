package gb;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import java.util.List;
import java.util.Set;
import l83.C23454a0;
import p114eb.C12982q;
import p390p1.InterfaceC28601c1;
import p505ts.AbstractC34132o;
import p668z1.C39967p;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: gb.m */
/* JADX INFO: loaded from: classes.dex */
public final class C15652m extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ InterfaceC28601c1 f58746w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C15656q f58747x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C39967p f58748y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15652m(InterfaceC28601c1 interfaceC28601c1, C15656q c15656q, C39967p c39967p, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f58746w = interfaceC28601c1;
        this.f58747x = c15656q;
        this.f58748y = c39967p;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        return new C15652m(this.f58746w, this.f58747x, this.f58748y, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        C15652m c15652m = (C15652m) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
        C23454a0 c23454a0 = C23454a0.f92919a;
        c15652m.invokeSuspend(c23454a0);
        return c23454a0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        AbstractC34132o.m107864I(obj);
        for (C12982q c12982q : (Set) this.f58746w.getValue()) {
            C15656q c15656q = this.f58747x;
            if (!((List) c15656q.m36435b().f44870e.f45200w.getValue()).contains(c12982q) && !this.f58748y.contains(c12982q)) {
                c15656q.m36435b().m36492b(c12982q);
            }
        }
        return C23454a0.f92919a;
    }
}
