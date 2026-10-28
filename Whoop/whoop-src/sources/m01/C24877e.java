package m01;

import c93.InterfaceC4339a;
import java.util.List;
import l83.C23454a0;
import l83.C23465k;
import p270k2.InterfaceC22131e;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p636y3.C39178j;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: m01.e */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C24877e implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f97458w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ List f97459x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ List f97460y;

    public /* synthetic */ C24877e(int i13, List list, List list2) {
        this.f97458w = i13;
        this.f97459x = list;
        this.f97460y = list2;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f97458w) {
            case 0:
                return AbstractC24879g.m72955f(this.f97459x, this.f97460y, (InterfaceC22131e) obj);
            default:
                AbstractC39101i1 abstractC39101i1 = (AbstractC39101i1) obj;
                List list = this.f97459x;
                if (list != null) {
                    int size = list.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        C23465k c23465k = (C23465k) list.get(i13);
                        AbstractC39101i1.m124623k(abstractC39101i1, (AbstractC39104j1) c23465k.f92937w, ((C39178j) c23465k.f92938x).f168416a);
                    }
                }
                List list2 = this.f97460y;
                if (list2 != null) {
                    int size2 = list2.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        C23465k c23465k2 = (C23465k) list2.get(i14);
                        AbstractC39104j1 abstractC39104j1 = (AbstractC39104j1) c23465k2.f92937w;
                        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) c23465k2.f92938x;
                        AbstractC39101i1.m124623k(abstractC39101i1, abstractC39104j1, interfaceC4339a != null ? ((C39178j) interfaceC4339a.invoke()).f168416a : 0L);
                    }
                }
                return C23454a0.f92919a;
        }
    }
}
