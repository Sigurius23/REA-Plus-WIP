package u22;

import com.whoop.payments.feature.paymentmethodmanagement.domain.models.PaymentMethodManagementModels;
import com.whoop.payments.feature.paymentmethodmanagement.domain.models.PaymentMethodManagementSectionModel;
import com.whoop.payments.stripebottomsheettile.model.PaymentSheetMetadata;
import com.whoop.payments.stripebottomsheettile.model.StripeBottomSheetTileModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25265s;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: u22.f */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;", "", "b", "(Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;)Z", "payments_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34491f {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final boolean m109024b(PaymentMethodManagementModels paymentMethodManagementModels) {
        PaymentSheetMetadata paymentSheetMetadata;
        List<PaymentMethodManagementSectionModel> sections = paymentMethodManagementModels.getSections();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = sections.iterator();
        while (it.hasNext()) {
            AbstractC25265s.m74141p0(arrayList, ((PaymentMethodManagementSectionModel) it.next()).getItems());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof StripeBottomSheetTileModel) {
                arrayList2.add(obj);
            }
        }
        StripeBottomSheetTileModel stripeBottomSheetTileModel = (StripeBottomSheetTileModel) AbstractC25265s.m74100H0(arrayList2);
        if (stripeBottomSheetTileModel == null || (paymentSheetMetadata = stripeBottomSheetTileModel.getPaymentSheetMetadata()) == null) {
            return false;
        }
        return paymentSheetMetadata.getAutoPopUp();
    }
}
