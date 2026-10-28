package pl0;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.design.models.items.SingleSelectModel;
import com.whoop.universalcheckout.features.AbstractC10635a;
import com.whoop.universalcheckout.features.UniversalCheckoutDestination;
import iq1.InterfaceC20850c;
import mp1.AbstractC25868a;
import mt2.AbstractC25946g;
import np1.AbstractC27030h;
import nt2.AbstractC27131a;
import p114eb.C12970k1;
import p114eb.C12982q;
import p114eb.C12999y0;
import p715kotlin.jvm.functions.Function1;
import p720m91.InterfaceC25312u;
import pp1.AbstractC29436i;
import pp2.AbstractC29450n;
import pq1.AbstractC29482f;
import pq2.AbstractC29484a;
import pt2.AbstractC29527i;
import pt2.AbstractC29530l;
import yn1.AbstractC39672a;

/* JADX INFO: renamed from: pl0.b */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C29344b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f118906w;

    public /* synthetic */ C29344b(int i13) {
        this.f118906w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f118906w) {
            case 0:
                return AbstractC29345c.m89343A((SingleSelectModel) obj);
            case 1:
                return UniversalCheckoutDestination.C10630b.m27491c((C12982q) obj);
            case 2:
                return UniversalCheckoutDestination.C10631c.m27498e((C12982q) obj);
            case 3:
                return UniversalCheckoutDestination.C10631c.m27499h((C12999y0) obj);
            case 4:
                return UniversalCheckoutDestination.C10631c.m27500i((C12970k1) obj);
            case 5:
                return UniversalCheckoutDestination.C10632d.m27507d((C12982q) obj);
            case 6:
                return UniversalCheckoutDestination.C10633e.m27515c((C12982q) obj);
            case 7:
                return AbstractC10635a.m27564y((C12982q) obj);
            case 8:
                return AbstractC29436i.m89772h0((AbstractC27030h) obj);
            case 9:
                return AbstractC29436i.m89790q0(obj);
            case 10:
                return AbstractC29436i.m89774i0(obj);
            case 11:
                return AbstractC29436i.m89729K0((AbstractC39672a) obj);
            case 12:
                return AbstractC29436i.m89748U((AbstractC25868a) obj);
            case 13:
                return AbstractC29436i.m89776j0((AbstractC39672a) obj);
            case 14:
                return AbstractC29436i.m89755Y((AbstractC27030h) obj);
            case 15:
                return AbstractC29436i.m89762c0((AbstractC27030h) obj);
            case 16:
                return AbstractC29436i.m89764d0((AbstractC39672a) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC29436i.m89788p0((AbstractC27030h) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC29450n.m89903q(obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC29482f.m90046l((InterfaceC20850c) obj);
            case 20:
                return AbstractC29482f.m90042h(obj);
            case 21:
                return AbstractC29484a.m90066q((String) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC29527i.m90231C((AbstractC27131a) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC29527i.m90250V((InterfaceC25312u) obj);
            case 24:
                return AbstractC29527i.m90252X((InterfaceC25312u) obj);
            case 25:
                return AbstractC29527i.m90232D((AbstractC25946g) obj);
            case 26:
                return AbstractC29527i.m90235G((AbstractC27131a) obj);
            case 27:
                return AbstractC29527i.m90236H((AbstractC25946g) obj);
            case 28:
                return AbstractC29530l.m90306K((InterfaceC25312u) obj);
            default:
                return AbstractC29530l.m90308M((InterfaceC25312u) obj);
        }
    }
}
