package p717lq2;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import l83.C23454a0;
import lw1.AbstractC24772h;
import mf0.AbstractC25506e;
import mi2.AbstractC25586i;
import mi2.AbstractC25593p;
import mx1.AbstractC26007m;
import no0.AbstractC26958l0;
import nr2.AbstractC27079a;
import ny0.AbstractC27237a;
import ny0.AbstractC27262k;
import ny0.AbstractC27283u0;
import o01.AbstractC27346b;
import os0.AbstractC28307c;
import p719m22.AbstractC24949d;
import p719m22.AbstractC42789u;
import p725ot1.Function1;

/* JADX INFO: renamed from: lq2.k */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C24679k implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f96514w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f96515x;

    public /* synthetic */ C24679k(InterfaceC4339a interfaceC4339a, int i13) {
        this.f96514w = i13;
        this.f96515x = interfaceC4339a;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f96514w) {
            case 0:
                return AbstractC24680l.m72095F(this.f96515x);
            case 1:
                return AbstractC24686r.m72249w0(this.f96515x);
            case 2:
                return AbstractC24686r.m72247v0(this.f96515x);
            case 3:
                return Function0.m72261h(this.f96515x);
            case 4:
                return Function0.m72263j(this.f96515x);
            case 5:
                return AbstractC24772h.m72581l(this.f96515x);
            case 6:
                return AbstractC24949d.m73136y(this.f96515x);
            case 7:
                return AbstractC42789u.m73289z(this.f96515x);
            case 8:
                this.f96515x.invoke();
                return C23454a0.f92919a;
            case 9:
                return AbstractC25506e.m74957k0(this.f96515x);
            case 10:
                return AbstractC25586i.m75242A(this.f96515x);
            case 11:
                return AbstractC25593p.m75322i(this.f96515x);
            case 12:
                return AbstractC26007m.m77222N(this.f96515x);
            case 13:
                return AbstractC26007m.m77230V(this.f96515x);
            case 14:
                return AbstractC26958l0.m80605M(this.f96515x);
            case 15:
                return AbstractC27079a.m81449g(this.f96515x);
            case 16:
                return AbstractC27237a.m82075e(this.f96515x);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC27262k.m82194f(this.f96515x);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC27283u0.m82319r(this.f96515x);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC27283u0.m82320s(this.f96515x);
            case 20:
                return AbstractC27283u0.m82321t(this.f96515x);
            case 21:
                return AbstractC27283u0.m82315n(this.f96515x);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC27283u0.m82316o(this.f96515x);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC27283u0.m82312k(this.f96515x);
            case 24:
                this.f96515x.invoke();
                return C23454a0.f92919a;
            case 25:
                return AbstractC27346b.m82503k(this.f96515x);
            case 26:
                return AbstractC28307c.m85760g(this.f96515x);
            case 27:
                return AbstractC28307c.m85761h(this.f96515x);
            case 28:
                return Function1.m85838y(this.f96515x);
            default:
                return Function1.m85811W(this.f96515x);
        }
    }
}
