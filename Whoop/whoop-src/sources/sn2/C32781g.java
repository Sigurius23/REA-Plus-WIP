package sn2;

import ad3.AbstractC0757c;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.DesignSystemModelKt;
import com.whoop.design.models.modal.DecodedGenericInteraction;
import com.whoop.design.models.modal.GenericInteractionDecoderKt;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.CheckoutWithCartPayload;
import com.whoop.navigation.CheckoutWithCartScreenModel;
import com.whoop.navigation.NavigationScreenModel;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.universalcheckout.features.buynow.domain.models.BuyNowResponse;
import com.whoop.universalcheckout.features.buynow.domain.models.BuyNowSection;
import com.whoop.universalcheckout.features.buynow.domain.models.items.BuyNowCheckoutInfoModel;
import com.whoop.universalcheckout.features.buynow.domain.models.items.BuyNowItemModel;
import com.whoop.universalcheckout.features.checkout.domain.models.items.CheckoutFooterModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import mn2.EnumC25719b;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: sn2.g */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lsn2/g;", "", "Lad3/c;", "json", "<init>", "(Lad3/c;)V", "Lcom/whoop/navigation/models/GenericInteraction;", "interaction", "Lsn2/f;", "c", "(Lcom/whoop/navigation/models/GenericInteraction;)Lsn2/f;", "Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;", "response", "d", "(Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;)Lsn2/f;", "", "field", "Lsn2/f$b;", "a", "(Ljava/lang/String;)Lsn2/f$b;", "b", "Lad3/c;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32781g {

    /* JADX INFO: renamed from: b */
    private static final a f136445b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final int f136446c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC0757c json;

    /* JADX INFO: renamed from: sn2.g$a */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lsn2/g$a;", "", "<init>", "()V", "", "GET_METHOD", "Ljava/lang/String;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C32781g(AbstractC0757c json) {
        AbstractC22676k.m65750j(json, "json");
        this.json = json;
    }

    /* JADX INFO: renamed from: a */
    private final InterfaceC32780f.b m102825a(String field) {
        return new InterfaceC32780f.b(AbstractC11266d.m30461o("sheet response is missing ", field));
    }

    /* JADX INFO: renamed from: c */
    private final InterfaceC32780f m102826c(GenericInteraction interaction) {
        C9598e navigation;
        DecodedGenericInteraction decodedGenericInteraction = GenericInteractionDecoderKt.toDecodedGenericInteraction(interaction, this.json);
        if (decodedGenericInteraction == null || (navigation = decodedGenericInteraction.getNavigation()) == null) {
            return new InterfaceC32780f.b("navigation could not be decoded");
        }
        if (!AbstractC22676k.m65745e(navigation.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9321h1.f27641w)) {
            return new InterfaceC32780f.b("unexpected navigation target " + navigation.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String());
        }
        NavigationScreenModel parameters = navigation.getParameters();
        CheckoutWithCartScreenModel checkoutWithCartScreenModel = parameters instanceof CheckoutWithCartScreenModel ? (CheckoutWithCartScreenModel) parameters : null;
        if (checkoutWithCartScreenModel == null) {
            return new InterfaceC32780f.b("CHECKOUT_WITH_CART without checkout parameters");
        }
        CheckoutWithCartPayload payload = checkoutWithCartScreenModel.getPayload();
        String cartId = payload != null ? payload.getCartId() : null;
        if (cartId == null || AbstractC39414r.m125890i0(cartId)) {
            return new InterfaceC32780f.b("CHECKOUT_WITH_CART without a cart id");
        }
        if (!AbstractC22676k.m65745e(checkoutWithCartScreenModel.getSource(), EnumC25719b.BUY_NOW_WITH_CART.getValue())) {
            return new InterfaceC32780f.b(AbstractC11266d.m30461o("CHECKOUT_WITH_CART with source ", checkoutWithCartScreenModel.getSource()));
        }
        String method = checkoutWithCartScreenModel.getMethod();
        return (method == null || AbstractC39414r.m125890i0(method) || AbstractC39421y.m125921F(checkoutWithCartScreenModel.getMethod(), "GET", true)) ? new InterfaceC32780f.a(navigation, cartId) : new InterfaceC32780f.b(AbstractC11266d.m30461o("CHECKOUT_WITH_CART with method ", checkoutWithCartScreenModel.getMethod()));
    }

    /* JADX INFO: renamed from: d */
    private final InterfaceC32780f m102827d(BuyNowResponse response) {
        String title = response.getTitle();
        if (title == null) {
            return m102825a("title");
        }
        List<BuyNowSection> sections = response.getSections();
        if (sections.isEmpty()) {
            return m102825a("sections");
        }
        List<BuyNowSection> list = sections;
        BuyNowSection checkoutFooter = response.getCheckoutFooter();
        if (checkoutFooter == null) {
            return m102825a("checkout_footer");
        }
        String analyticsSubtotalValue = response.getAnalyticsSubtotalValue();
        if (analyticsSubtotalValue == null) {
            return m102825a("analytics_subtotal_value");
        }
        C9598e checkoutDestination = response.getCheckoutDestination();
        if (checkoutDestination == null) {
            return m102825a("checkout_destination");
        }
        String paymentMethodId = response.getPaymentMethodId();
        if (paymentMethodId == null) {
            return m102825a("payment_method_id");
        }
        C32783i c32783i = new C32783i(title, list, checkoutFooter, analyticsSubtotalValue, checkoutDestination, paymentMethodId);
        List<BuyNowSection> listM102841e = c32783i.m102841e();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listM102841e.iterator();
        while (it.hasNext()) {
            AbstractC25265s.m74141p0(arrayList, ((BuyNowSection) it.next()).getItems());
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(DesignSystemModelKt.unwrap((DesignSystemModel) it3.next()));
        }
        if (!arrayList2.isEmpty()) {
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                if (((DesignSystemModel) it4.next()) instanceof BuyNowItemModel) {
                    if (!arrayList2.isEmpty()) {
                        Iterator it5 = arrayList2.iterator();
                        while (it5.hasNext()) {
                            if (((DesignSystemModel) it5.next()) instanceof BuyNowCheckoutInfoModel) {
                                List<DesignSystemModel> items = c32783i.getCheckoutFooter().getItems();
                                if (!(items instanceof Collection) || !items.isEmpty()) {
                                    Iterator<T> it6 = items.iterator();
                                    while (it6.hasNext()) {
                                        if (DesignSystemModelKt.unwrap((DesignSystemModel) it6.next()) instanceof CheckoutFooterModel) {
                                            return new InterfaceC32780f.c(c32783i);
                                        }
                                    }
                                }
                                return m102825a("a CHECKOUT_FOOTER");
                            }
                        }
                    }
                    return m102825a("a BUY_NOW_CHECKOUT_INFO");
                }
            }
        }
        return m102825a("a BUY_NOW_ITEM");
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC32780f m102828b(BuyNowResponse response) {
        AbstractC22676k.m65750j(response, "response");
        GenericInteraction genericInteraction = response.getGenericInteraction();
        return (genericInteraction != null ? genericInteraction.getNavigation() : null) != null ? m102826c(genericInteraction) : m102827d(response);
    }
}
