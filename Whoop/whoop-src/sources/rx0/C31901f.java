package rx0;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.stripe.android.view.BecsDebitBsbEditText;
import com.stripe.android.view.CardNumberEditText;
import com.stripe.android.view.CvcEditText;
import com.stripe.android.view.ExpiryDateEditText;
import com.stripe.android.view.PaymentAuthWebView;
import com.whoop.nativestore.home.domain.model.CartIndicator;
import com.whoop.nativestore.home.domain.model.CheckoutFooter;
import com.whoop.nativestore.home.domain.model.NativeStoreResponse;
import com.whoop.nativestore.home.domain.model.NativeStoreSection;
import com.whoop.nativestore.home.domain.model.ShopBannerCarouselModel;
import com.whoop.nativestore.home.domain.model.ShopBannerModel;
import com.whoop.nativestore.home.domain.model.ShopCategoryModel;
import com.whoop.nativestore.home.domain.model.ShopProductCarouselModel;
import com.whoop.nativestore.home.domain.model.ShopProductModel;
import com.whoop.nativestore.home.domain.model.ShopProductTagType;
import com.whoop.nativestore.home.domain.model.ShopSectionHeaderModel;
import com.whoop.payments.domain.models.PaymentMethodExpirationStatus;
import com.whoop.payments.domain.models.PaymentsResponse;
import com.whoop.profile.domain.models.Gender;
import com.whoop.profile.domain.models.PhysiologicalBaseline;
import com.whoop.profile.domain.models.ProfileResponse;
import com.whoop.profile.domain.models.ProfileSectionModel;
import j93.InterfaceC21493z;
import l83.C23454a0;
import p733ry2.AbstractC31912a;
import p733ry2.AbstractC31916e;
import p733ry2.Function1;
import ry0.AbstractC31907b;

/* JADX INFO: renamed from: rx0.f */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C31901f implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f132411w;

    public /* synthetic */ C31901f(int i13) {
        this.f132411w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        int i13 = this.f132411w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        switch (i13) {
            case 0:
                return AbstractC31902g.m99171j();
            case 1:
                return AbstractC31902g.m99175n();
            case 2:
                return AbstractC31907b.m99197g();
            case 3:
                return AbstractC31912a.m99276e();
            case 4:
                return Function1.m99289k();
            case 5:
                return AbstractC31916e.m99312L();
            case 6:
                return CartIndicator._childSerializers$_anonymous_();
            case 7:
                return CheckoutFooter._childSerializers$_anonymous_();
            case 8:
                return NativeStoreResponse._childSerializers$_anonymous_();
            case 9:
                return NativeStoreSection._childSerializers$_anonymous_();
            case 10:
                return ShopBannerCarouselModel._childSerializers$_anonymous_();
            case 11:
                return ShopBannerModel._childSerializers$_anonymous_();
            case 12:
                return ShopCategoryModel._childSerializers$_anonymous_();
            case 13:
                return ShopProductCarouselModel._childSerializers$_anonymous_();
            case 14:
                return ShopProductCarouselModel._childSerializers$_anonymous_$0();
            case 15:
                return ShopProductModel._childSerializers$_anonymous_();
            case 16:
                return ShopProductModel._childSerializers$_anonymous_$0();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return ShopProductTagType._init_$_anonymous_();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return ShopSectionHeaderModel._childSerializers$_anonymous_();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return PaymentMethodExpirationStatus._init_$_anonymous_();
            case 20:
                return PaymentsResponse._childSerializers$_anonymous_();
            case 21:
                int i14 = BecsDebitBsbEditText.f22466b0;
                return c23454a0;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                int i15 = CardNumberEditText.f22507p0;
                return c23454a0;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                int i16 = CvcEditText.f22536a0;
                return c23454a0;
            case 24:
                InterfaceC21493z[] interfaceC21493zArr = ExpiryDateEditText.f22539d0;
                return c23454a0;
            case 25:
                int i17 = PaymentAuthWebView.f22549x;
                return c23454a0;
            case 26:
                return Gender._init_$_anonymous_();
            case 27:
                return PhysiologicalBaseline._init_$_anonymous_();
            case 28:
                return ProfileResponse._childSerializers$_anonymous_();
            default:
                return ProfileSectionModel._childSerializers$_anonymous_();
        }
    }
}
