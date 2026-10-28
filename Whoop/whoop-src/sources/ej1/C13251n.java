package ej1;

import androidx.compose.p018ui.Modifier;
import androidx.health.platform.client.proto.C1533u;
import bk2.InterfaceC3355b;
import bo0.AbstractC3503a;
import bp1.AbstractC3535b;
import com.whoop.design.models.items.CardButtonModel;
import com.whoop.design.models.items.ShippingProgressBarModel;
import com.whoop.universalcheckout.features.cart.domain.models.items.CartItemModel;
import com.whoop.universalcheckout.features.cart.domain.models.items.EmptyCartContentModel;
import com.whoop.universalcheckout.features.checkout.domain.models.items.CheckoutInfoModel;
import cp1.AbstractC11022i;
import ek2.AbstractC13304a;
import ek2.AbstractC13305b;
import ek2.AbstractC13306c;
import eo2.AbstractC13382b;
import eo2.AbstractC13384d;
import ep1.AbstractC13407b;
import java.time.LocalDate;
import jb1.C21536b;
import p208i2.InterfaceC17886g0;
import p706eo0.AbstractC13376g;
import p715kotlin.jvm.functions.Function1;
import p716lb1.C23749z0;
import p720m91.C25308q;
import tn0.InterfaceC33957a;

/* JADX INFO: renamed from: ej1.n */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C13251n implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f45890w;

    public /* synthetic */ C13251n(int i13) {
        this.f45890w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f45890w) {
            case 0:
                return AbstractC13252o.m37251n((Modifier) obj);
            case 1:
                return AbstractC13254q.m37259e(obj);
            case 2:
                return AbstractC13255r.m37265c((C25308q) obj);
            case 3:
                return AbstractC13257t.m37273h(((Boolean) obj).booleanValue());
            case 4:
                return AbstractC13259v.m37291i(obj);
            case 5:
                return AbstractC13259v.m37295m((InterfaceC17886g0) obj);
            case 6:
                return AbstractC13261x.m37309g(obj);
            case 7:
                return AbstractC13261x.m37314l(obj);
            case 8:
                return AbstractC13231b0.m37150d(obj);
            case 9:
                return AbstractC13245i0.m37213f((Modifier) obj);
            case 10:
                return AbstractC13304a.m37370i(((Integer) obj).intValue());
            case 11:
                return AbstractC13304a.m37371j((LocalDate) obj);
            case 12:
                return AbstractC13305b.m37388i(((Boolean) obj).booleanValue());
            case 13:
                return AbstractC13306c.m37402j(((Boolean) obj).booleanValue());
            case 14:
                return AbstractC13306c.m37403k((InterfaceC3355b) obj);
            case 15:
                return AbstractC13376g.m37692N((AbstractC3503a) obj);
            case 16:
                return AbstractC13376g.m37679A((InterfaceC33957a) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return Integer.valueOf(AbstractC13376g.m37685G(((Integer) obj).intValue()));
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return Integer.valueOf(AbstractC13376g.m37686H(((Integer) obj).intValue()));
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC13376g.m37694P((InterfaceC33957a) obj);
            case 20:
                return AbstractC13382b.m37753h((C21536b) obj);
            case 21:
                return AbstractC13382b.m37754i((C23749z0) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC13382b.m37755j((CartItemModel) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC13382b.m37756k((EmptyCartContentModel) obj);
            case 24:
                return AbstractC13382b.m37757l((CheckoutInfoModel) obj);
            case 25:
                return AbstractC13382b.m37758m((CardButtonModel) obj);
            case 26:
                return AbstractC13382b.m37759n((ShippingProgressBarModel) obj);
            case 27:
                return AbstractC13384d.m37781b((C25308q) obj);
            case 28:
                return AbstractC13407b.m37880i((AbstractC11022i) obj);
            default:
                return AbstractC13407b.m37881j((AbstractC3535b) obj);
        }
    }
}
