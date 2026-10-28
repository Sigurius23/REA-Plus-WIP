package y71;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import yb0.AbstractC39384g;
import yb0.AbstractC39388k;
import yc2.AbstractC39436c;
import yw1.AbstractC39822i;
import z51.AbstractC40097h;
import z80.AbstractC40180a;
import zi1.AbstractC40676f0;
import zi1.AbstractC40687q;
import zr1.AbstractC41069c;

/* JADX INFO: renamed from: y71.e */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C39272e implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f168927w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f168928x;

    public /* synthetic */ C39272e(InterfaceC4339a interfaceC4339a, int i13) {
        this.f168927w = i13;
        this.f168928x = interfaceC4339a;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f168927w) {
            case 0:
                return AbstractC39273f.m125130h(this.f168928x);
            case 1:
                return AbstractC39276i.m125146l(this.f168928x);
            case 2:
                return AbstractC39384g.m125612P(this.f168928x);
            case 3:
                return AbstractC39388k.m125741p1(this.f168928x);
            case 4:
                return AbstractC39388k.m125692Z(this.f168928x);
            case 5:
                return AbstractC39436c.m125990x(this.f168928x);
            case 6:
                return AbstractC39436c.m125955E(this.f168928x);
            case 7:
                return AbstractC39436c.m125963M(this.f168928x);
            case 8:
                return AbstractC39822i.m127685J(this.f168928x);
            case 9:
                return AbstractC39822i.m127686K(this.f168928x);
            case 10:
                return AbstractC39822i.m127712u(this.f168928x);
            case 11:
                return AbstractC40097h.m128557G(this.f168928x);
            case 12:
                return AbstractC40097h.m128589u(this.f168928x);
            case 13:
                return AbstractC40097h.m128554D(this.f168928x);
            case 14:
                return AbstractC40097h.m128558H(this.f168928x);
            case 15:
                return AbstractC40097h.m128559I(this.f168928x);
            case 16:
                return AbstractC40097h.m128586r(this.f168928x);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC40097h.m128592x(this.f168928x);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC40180a.m128907o(this.f168928x);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC40180a.m128912t(this.f168928x);
            case 20:
                return AbstractC40687q.m132108k(this.f168928x);
            case 21:
                return AbstractC40676f0.m132045f(this.f168928x);
            default:
                return AbstractC41069c.m133354v(this.f168928x);
        }
    }
}
