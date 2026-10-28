package mm1;

import ad3.C0764g;
import androidx.health.platform.client.proto.C1533u;
import com.whoop.universalcheckout.features.checkout.domain.models.items.CheckoutFooterModel;
import com.whoop.universalcheckout.features.checkout.domain.models.items.CheckoutInfoModel;
import com.whoop.universalcheckout.features.checkout.domain.models.items.OrderDetailsModel;
import com.whoop.universalcheckout.features.checkout.domain.models.items.PaymentMethodMenuTileModel;
import com.whoop.universalcheckout.features.checkout.domain.models.items.PaymentMethodTileModel;
import com.whoop.universalcheckout.features.checkout.domain.models.items.PreviewTileModel;
import com.whoop.universalcheckout.features.checkout.domain.models.items.PromoCodeInputModel;
import com.whoop.universalcheckout.features.receipt.domain.models.items.ReceiptHeaderModel;
import com.whoop.universalcheckout.features.receipt.domain.models.items.ReimbursementTileModel;
import eq0.AbstractC13559z0;
import hn1.AbstractC17518d;
import java.util.List;
import jb1.C21536b;
import jn1.AbstractC21803b;
import mn1.AbstractC25717h;
import mn2.AbstractC25718a;
import mo1.C25746a;
import mq0.C25880e;
import mq1.C25887b;
import ms1.C25929a;
import mu0.C25953e;
import mu2.C25961f;
import mw0.C25982j;
import mw2.C25987a;
import mx1.AbstractC26010p;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;
import p716lb1.C23749z0;

/* JADX INFO: renamed from: mm1.h */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C25694h implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f101191w;

    public /* synthetic */ C25694h(int i13) {
        this.f101191w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f101191w) {
            case 0:
                return AbstractC25695i.m75687l(obj);
            case 1:
                return AbstractC25695i.m75683h(obj);
            case 2:
                return AbstractC25717h.m75779o((AbstractC21803b) obj);
            case 3:
                return AbstractC25717h.m75780p((AbstractC17518d) obj);
            case 4:
                return AbstractC25717h.m75759A((AbstractC17518d) obj);
            case 5:
                return AbstractC25717h.m75783s((AbstractC17518d) obj);
            case 6:
                return AbstractC25718a.m75813p((C21536b) obj);
            case 7:
                return AbstractC25718a.m75796F((ReimbursementTileModel) obj);
            case 8:
                return AbstractC25718a.m75797G((PromoCodeInputModel) obj);
            case 9:
                return AbstractC25718a.m75815r((PaymentMethodMenuTileModel) obj);
            case 10:
                return AbstractC25718a.m75816s((PreviewTileModel) obj);
            case 11:
                return AbstractC25718a.m75821x((C21536b) obj);
            case 12:
                return AbstractC25718a.m75814q((C23749z0) obj);
            case 13:
                return AbstractC25718a.m75822y((C23749z0) obj);
            case 14:
                return AbstractC25718a.m75823z((OrderDetailsModel) obj);
            case 15:
                return AbstractC25718a.m75791A((CheckoutInfoModel) obj);
            case 16:
                return AbstractC25718a.m75792B((PreviewTileModel) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC25718a.m75793C((PaymentMethodTileModel) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC25718a.m75794D((CheckoutFooterModel) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC25718a.m75795E((ReceiptHeaderModel) obj);
            case 20:
                return C25746a.m75956c((C21536b) obj);
            case 21:
                return C25880e.m76493K((AbstractC13559z0) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return C25887b.m76538b((C21536b) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return C25929a.m76700g((C0764g) obj);
            case 24:
                return C25953e.m76809H((InterfaceC33687a) obj);
            case 25:
                return C25961f.m76905b1((List) obj);
            case 26:
                return C25961f.m76908c1((List) obj);
            case 27:
                return C25982j.m77071b((C21536b) obj);
            case 28:
                return C25987a.m77087c((C21536b) obj);
            default:
                return AbstractC26010p.m77284g(obj);
        }
    }
}
