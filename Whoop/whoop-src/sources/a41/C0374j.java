package a41;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import cp0.AbstractC10971k;
import h31.AbstractC16826s;
import i31.AbstractC18053h;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import pq2.AbstractC29484a;
import se.AbstractC32411b;
import se.AbstractC32416g;
import se.AbstractC32417h;

/* JADX INFO: renamed from: a41.j */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C0374j implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f1275w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f1276x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC4339a f1277y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f1278z;

    public /* synthetic */ C0374j(boolean z4, InterfaceC4339a interfaceC4339a, int i13, int i14) {
        this.f1275w = i14;
        this.f1276x = z4;
        this.f1277y = interfaceC4339a;
        this.f1278z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (this.f1275w) {
            case 0:
                int iIntValue = num.intValue();
                return AbstractC0376l.m1023p(this.f1276x, this.f1277y, this.f1278z, composer, iIntValue);
            case 1:
                num.intValue();
                AbstractC32411b.m101083a(this.f1276x, this.f1277y, composer, AbstractC28683x.m87244L(this.f1278z | 1));
                return C23454a0.f92919a;
            case 2:
                int iIntValue2 = num.intValue();
                return AbstractC10971k.m29231m(this.f1276x, this.f1277y, this.f1278z, composer, iIntValue2);
            case 3:
                int iIntValue3 = num.intValue();
                return AbstractC16826s.m47411g(this.f1276x, this.f1277y, this.f1278z, composer, iIntValue3);
            case 4:
                int iIntValue4 = num.intValue();
                return AbstractC18053h.m51859h(this.f1276x, this.f1277y, this.f1278z, composer, iIntValue4);
            case 5:
                num.intValue();
                AbstractC32416g.m101152i(this.f1276x, this.f1277y, composer, AbstractC28683x.m87244L(this.f1278z | 1));
                return C23454a0.f92919a;
            case 6:
                int iIntValue5 = num.intValue();
                return AbstractC29484a.m90058i(this.f1276x, this.f1277y, this.f1278z, composer, iIntValue5);
            case 7:
                num.intValue();
                AbstractC32417h.m101201j(this.f1276x, this.f1277y, composer, AbstractC28683x.m87244L(this.f1278z | 1));
                return C23454a0.f92919a;
            default:
                num.intValue();
                AbstractC32417h.m101193b(this.f1276x, this.f1277y, composer, AbstractC28683x.m87244L(this.f1278z | 1));
                return C23454a0.f92919a;
        }
    }
}
