package fa0;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import cz.C11216o;
import cz.C11224s;
import cz.C11236y;
import fe0.AbstractC14415e;
import fy2.AbstractC14879a;
import fz2.AbstractC14892a;
import gh0.AbstractC15847b;
import l83.C23454a0;
import p163g1.C15118q2;
import p163g1.EnumC15128r2;
import p707gt1.AbstractC16189c;
import p707gt1.AbstractC16198l;
import p707gt1.AbstractC16200n;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: fa0.a */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C14294a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f52195w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f52196x;

    public /* synthetic */ C14294a(Function1 function1) {
        this.f52195w = 19;
        EnumC15128r2 enumC15128r2 = EnumC15128r2.f56690w;
        this.f52196x = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f52195w) {
            case 0:
                return AbstractC14296c.m40844G(this.f52196x);
            case 1:
                return AbstractC14296c.m40862Y(this.f52196x);
            case 2:
                return AbstractC14296c.m40863Z(this.f52196x);
            case 3:
                return AbstractC14296c.m40867b0(this.f52196x);
            case 4:
                return AbstractC14296c.m40869c0(this.f52196x);
            case 5:
                return AbstractC14296c.m40856S(this.f52196x);
            case 6:
                return AbstractC14296c.m40857T(this.f52196x);
            case 7:
                return AbstractC14296c.m40858U(this.f52196x);
            case 8:
                return AbstractC14296c.m40859V(this.f52196x);
            case 9:
                return AbstractC14296c.m40877g0(this.f52196x);
            case 10:
                return AbstractC14415e.m41075P(this.f52196x);
            case 11:
                return AbstractC14415e.m41081V(this.f52196x);
            case 12:
                return AbstractC14415e.m41082W(this.f52196x);
            case 13:
                return AbstractC14415e.m41071L(this.f52196x);
            case 14:
                return AbstractC14879a.m42930l(this.f52196x);
            case 15:
                return AbstractC14879a.m42939u(this.f52196x);
            case 16:
                return AbstractC14892a.m42985h(this.f52196x);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC14892a.m42986i(this.f52196x);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC14892a.m42991n(this.f52196x);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new C15118q2(EnumC15128r2.f56690w, this.f52196x);
            case 20:
                return AbstractC15847b.m44697n(this.f52196x);
            case 21:
                return AbstractC15847b.m44698o(this.f52196x);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC16189c.m45759g(this.f52196x);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC16198l.m45807x(this.f52196x);
            case 24:
                return AbstractC16200n.m45840v(this.f52196x);
            case 25:
                return AbstractC16200n.m45842x(this.f52196x);
            case 26:
                this.f52196x.invoke(C11236y.f36048a);
                return C23454a0.f92919a;
            case 27:
                this.f52196x.invoke(C11224s.f36026a);
                return C23454a0.f92919a;
            case 28:
                this.f52196x.invoke(C11216o.f35975a);
                return C23454a0.f92919a;
            default:
                this.f52196x.invoke(C11236y.f36048a);
                return C23454a0.f92919a;
        }
    }

    public /* synthetic */ C14294a(Function1 function1, int i13) {
        this.f52195w = i13;
        this.f52196x = function1;
    }
}
