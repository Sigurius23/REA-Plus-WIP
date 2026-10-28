package q12;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.design.models.modal.AnyModal;
import java.util.List;
import l83.C23454a0;
import nl0.C26809k;
import nl0.EnumC26811m;
import p164g2.InterfaceC15250v;
import p181h2.C16617b;
import p294l3.C23277r0;
import p390p1.InterfaceC28601c1;
import p635y2.InterfaceC39147y;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33231x0;
import p740ux0.Function0;
import qm1.AbstractC30483e;
import qq2.AbstractC30553b;
import r41.AbstractC30924h;
import r51.AbstractC30937e;
import r90.AbstractC31099f;
import rq2.AbstractC31718c0;
import rx0.AbstractC31902g;
import st1.AbstractC32993n;
import t11.AbstractC33305e;
import u11.AbstractC34443i;
import u71.AbstractC34573g;
import uu2.AbstractC35272w;
import v01.AbstractC35501c;
import v41.EnumC35690s;
import v80.AbstractC35794b;
import v81.AbstractC35798c;
import vo1.AbstractC36245t;
import w81.EnumC36946d;
import wi0.AbstractC37313e;
import wo1.AbstractC37471t;
import wq2.AbstractC37513b;
import wz0.AbstractC37777d;

/* JADX INFO: renamed from: q12.c */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C29802c implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f121843w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28601c1 f121844x;

    public /* synthetic */ C29802c(int i13, InterfaceC28601c1 interfaceC28601c1) {
        this.f121843w = i13;
        this.f121844x = interfaceC28601c1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f121843w) {
            case 0:
                return AbstractC29803d.m91317s(this.f121844x, (EnumC26811m) obj);
            case 1:
                return AbstractC29803d.m91318t(this.f121844x, (C26809k) obj);
            case 2:
                return AbstractC30483e.m93301C(this.f121844x, (InterfaceC39147y) obj);
            case 3:
                return AbstractC30553b.m93697j(this.f121844x, (String) obj);
            case 4:
                return AbstractC30924h.m95093s(this.f121844x, (InterfaceC15250v) obj);
            case 5:
                return AbstractC30937e.m95157k(this.f121844x, obj);
            case 6:
                return AbstractC31099f.m95790m(this.f121844x, (String) obj);
            case 7:
                return AbstractC31718c0.m98410q(this.f121844x, (C23277r0) obj);
            case 8:
                return AbstractC31902g.m99176o(this.f121844x, (String) obj);
            case 9:
                return p733ry2.Function1.m99290l(this.f121844x, (String) obj);
            case 10:
                return AbstractC32993n.m104213s(this.f121844x, (String) obj);
            case 11:
                return AbstractC33231x0.m105426k(this.f121844x, (InterfaceC39147y) obj);
            case 12:
                return AbstractC33305e.m105618F(this.f121844x, (InterfaceC15250v) obj);
            case 13:
                List list = (List) obj;
                InterfaceC28601c1 interfaceC28601c1 = this.f121844x;
                if (interfaceC28601c1 != null) {
                    interfaceC28601c1.setValue(list);
                }
                return C23454a0.f92919a;
            case 14:
                ((Function1) this.f121844x.getValue()).invoke((C16617b) obj);
                return C23454a0.f92919a;
            case 15:
                return AbstractC34443i.m108853f0(this.f121844x, (InterfaceC39147y) obj);
            case 16:
                return AbstractC34573g.m109341x(this.f121844x, obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC35272w.m111921y(this.f121844x, (AnyModal) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return Function0.m112214g(this.f121844x, (String) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC35501c.m112603y(this.f121844x, (String) obj);
            case 20:
                return AbstractC35501c.m112604z(this.f121844x, (String) obj);
            case 21:
                return AbstractC35794b.m113471p(this.f121844x, (InterfaceC15250v) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC35798c.m113512p(this.f121844x, (EnumC36946d) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC36245t.m115592t(this.f121844x, (String) obj);
            case 24:
                return AbstractC37313e.m119530z(this.f121844x, ((Boolean) obj).booleanValue());
            case 25:
                return AbstractC37313e.m119526v(this.f121844x, (String) obj);
            case 26:
                return AbstractC37471t.m120141s(this.f121844x, (EnumC36946d) obj);
            case 27:
                return AbstractC37513b.m120287n(this.f121844x, (String) obj);
            case 28:
                return AbstractC37777d.m121186G(this.f121844x, (EnumC35690s) obj);
            default:
                C23277r0 it = (C23277r0) obj;
                AbstractC22676k.m65750j(it, "it");
                this.f121844x.setValue(it);
                return C23454a0.f92919a;
        }
    }
}
