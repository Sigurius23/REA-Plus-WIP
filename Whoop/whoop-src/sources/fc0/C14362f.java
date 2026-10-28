package fc0;

import androidx.health.platform.client.proto.C1533u;
import fz2.AbstractC14892a;
import h90.AbstractC17024b;
import m81.AbstractC25230e;
import n71.AbstractC26427h;
import no0.AbstractC26978v0;
import p390p1.InterfaceC28593a1;
import p635y2.InterfaceC39147y;
import p636y3.C39180l;
import p715kotlin.jvm.functions.Function1;
import p748zc1.AbstractC40285b9;
import p748zc1.AbstractC40312e3;
import p748zc1.AbstractC40416n8;
import q31.AbstractC29946d;
import qk2.AbstractC30446b;
import rs2.AbstractC31795a;
import zi0.AbstractC40662a;

/* JADX INFO: renamed from: fc0.f */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C14362f implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f52430w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28593a1 f52431x;

    public /* synthetic */ C14362f(InterfaceC28593a1 interfaceC28593a1, int i13) {
        this.f52430w = i13;
        this.f52431x = interfaceC28593a1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f52430w) {
            case 0:
                return AbstractC14363g.m40993m(this.f52431x, (InterfaceC39147y) obj);
            case 1:
                return AbstractC14892a.m42992o(this.f52431x, (C39180l) obj);
            case 2:
                return AbstractC17024b.m48031o(this.f52431x, ((Integer) obj).intValue());
            case 3:
                return AbstractC17024b.m48032p(this.f52431x, ((Integer) obj).intValue());
            case 4:
                return AbstractC25230e.m73964t(this.f52431x, ((Integer) obj).intValue());
            case 5:
                return AbstractC26427h.m78195h(this.f52431x, (C39180l) obj);
            case 6:
                return AbstractC26978v0.m80830n(this.f52431x, (InterfaceC39147y) obj);
            case 7:
                return AbstractC29946d.m91601l(this.f52431x, ((Integer) obj).intValue());
            case 8:
                return AbstractC29946d.m91603n(this.f52431x, ((Integer) obj).intValue());
            case 9:
                return AbstractC30446b.m93163t(this.f52431x, (C39180l) obj);
            case 10:
                return AbstractC31795a.m98751v(this.f52431x, (InterfaceC39147y) obj);
            case 11:
                return AbstractC40312e3.m129634i(this.f52431x, ((Integer) obj).intValue());
            case 12:
                return AbstractC40312e3.m129635j(this.f52431x, ((Integer) obj).intValue());
            case 13:
                return AbstractC40416n8.m130460l(this.f52431x, ((Integer) obj).intValue());
            case 14:
                return AbstractC40416n8.m130462n(this.f52431x, ((Integer) obj).intValue());
            case 15:
                return AbstractC40285b9.m129399i(this.f52431x, ((Integer) obj).intValue());
            case 16:
                return AbstractC40285b9.m129400j(this.f52431x, ((Integer) obj).intValue());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC40662a.m131952H(this.f52431x, (C39180l) obj);
            default:
                return AbstractC40662a.m131946B(this.f52431x, ((Integer) obj).intValue());
        }
    }
}
