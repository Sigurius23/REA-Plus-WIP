package jw1;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.membership.extensions.domain.models.ExtensionsV2LandingOption;
import com.whoop.membership.extensions.domain.models.NativeOrderDetails;
import com.whoop.membership.extensions.domain.models.NativeOrderPaymentOption;
import com.whoop.membership.extensions.domain.models.NativeOrderPromoCode;
import com.whoop.membership.extensions.domain.models.NativeOrderResponse;
import com.whoop.membership.extensions.domain.models.OrderOption;
import com.whoop.membership.extensions.domain.models.ProgressContent;
import com.whoop.membership.extensions.domain.models.ReactivationUpsellSegment;
import com.whoop.membership.extensions.domain.models.SectionItems;
import com.whoop.membership.extensions.domain.models.StepPrefetchContent;
import com.whoop.payments.domain.models.Card;
import ew1.C13722a;
import fw1.C14834a;
import fw1.C14838e;
import fw1.C14839f;
import fw1.C14840g;
import fw1.InterfaceC14836c;
import iw1.AbstractC20998d;
import iw1.AbstractC21005k;
import iw1.InterfaceC20996b;
import iw1.InterfaceC21000f;
import iw1.InterfaceC21003i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kx1.AbstractC22882c;
import lw1.C24773i;
import lw1.C24774j;
import lw1.C24775k;
import m83.AbstractC25260n;
import m83.AbstractC25267u;
import or2.AbstractC28188o1;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: jw1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Ljw1/a;", "", "Lew1/a;", "analytics", "<init>", "(Lew1/a;)V", "", "Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;", "list", "Llw1/i;", "a", "(Ljava/util/List;)Ljava/util/List;", "Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;", "promoCode", "Llw1/k;", "c", "(Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;)Llw1/k;", "Lcom/whoop/membership/extensions/domain/models/NativeOrderPaymentOption;", "paymentOptions", "Lcom/whoop/payments/domain/models/Card;", "card", "Llw1/j;", "b", "(Lcom/whoop/membership/extensions/domain/models/NativeOrderPaymentOption;Lcom/whoop/payments/domain/models/Card;)Llw1/j;", "Lfw1/c;", "domainResult", "Liw1/i;", "d", "(Lfw1/c;)Liw1/i;", "Lew1/a;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21993a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C13722a analytics;

    public C21993a(C13722a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    private final List<C24773i> m62843a(List<ExtensionsV2LandingOption> list) {
        List<ExtensionsV2LandingOption> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        for (ExtensionsV2LandingOption extensionsV2LandingOption : list2) {
            arrayList.add(new C24773i(extensionsV2LandingOption.getTitle(), extensionsV2LandingOption.getPrice(), extensionsV2LandingOption.getPriceSubtitle(), extensionsV2LandingOption.getSelected(), extensionsV2LandingOption.getDisclaimer(), extensionsV2LandingOption.getTrackingLabel(), extensionsV2LandingOption.getStrikethroughPrice(), extensionsV2LandingOption.getCtaTitle(), extensionsV2LandingOption.getSecondaryCtaTitle(), extensionsV2LandingOption.getCheckout(), extensionsV2LandingOption.getAction(), extensionsV2LandingOption.getTag()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    private final C24774j m62844b(NativeOrderPaymentOption paymentOptions, Card card) {
        TextResource textResourceM21278l = AbstractC8693b.m21278l(paymentOptions.getTitle());
        String existingLabel = paymentOptions.getExistingLabel();
        return new C24774j(textResourceM21278l, AbstractC25260n.m74077r0(new TextResource[]{existingLabel != null ? AbstractC8693b.m21278l(existingLabel) : null, AbstractC8693b.m21278l(paymentOptions.getAlternateLabel())}), !card.isEmpty() ? 1 : 0, card);
    }

    /* JADX INFO: renamed from: c */
    private final C24775k m62845c(NativeOrderPromoCode promoCode) {
        boolean enabled = promoCode.getEnabled();
        boolean zM85314d = AbstractC28188o1.m85314d(promoCode.getStatusText());
        TextResource textResourceM21278l = AbstractC8693b.m21278l(promoCode.getExpandedInputTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(promoCode.getInputTitle());
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(promoCode.getApplyCtaText());
        String promoCode2 = promoCode.getPromoCode();
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l(promoCode.getStatusText());
        String status = promoCode.getStatus();
        EnumC39333f enumC39333f = (!AbstractC22676k.m65745e(status, "error") && AbstractC22676k.m65745e(status, "success")) ? EnumC39333f.ACCENT_ACTION : EnumC39333f.ACCENT_ALERT;
        return new C24775k(enabled, zM85314d, textResourceM21278l, textResourceM21278l2, textResourceM21278l3, promoCode2, textResourceM21278l4, enumC39333f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public final InterfaceC21003i m62846d(InterfaceC14836c domainResult) {
        ProgressContent genericErrorProgressContent;
        ProgressContent genericErrorProgressContent2;
        ProgressContent loadingProgressContent;
        NativeOrderPromoCode promoCode;
        Object next;
        NativeOrderPromoCode promoCode2;
        NativeOrderPromoCode promoCode3;
        AbstractC22676k.m65750j(domainResult, "domainResult");
        if (domainResult instanceof C14840g) {
            C14840g c14840g = (C14840g) domainResult;
            if (c14840g.getIsLoading()) {
                return AbstractC21005k.b.f79488a;
            }
            if (c14840g.getIsError()) {
                return AbstractC21005k.a.f79487a;
            }
            if (!domainResult.mo42630b() || c14840g.getReactivationUpsellLandingResponse() == null) {
                return AbstractC21005k.a.f79487a;
            }
            List<SectionItems> sections = c14840g.getReactivationUpsellLandingResponse().getSegments().get(c14840g.getCurrentSelectionIndex()).getSections();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(sections, 10));
            Iterator<T> it = sections.iterator();
            while (it.hasNext()) {
                arrayList.add(new AbstractC21005k.c(AbstractC22882c.m66488i().m60540g(((SectionItems) it.next()).getItems())));
            }
            TextResource textResourceM21278l = AbstractC8693b.m21278l(c14840g.getReactivationUpsellLandingResponse().getNavigationBarText());
            String trackingLabel = c14840g.getReactivationUpsellLandingResponse().getTrackingLabel();
            String trackingValue = c14840g.getReactivationUpsellLandingResponse().getTrackingValue();
            int currentSelectionIndex = c14840g.getCurrentSelectionIndex();
            List<ReactivationUpsellSegment> segments = c14840g.getReactivationUpsellLandingResponse().getSegments();
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(segments, 10));
            Iterator<T> it3 = segments.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((ReactivationUpsellSegment) it3.next()).getControlTitle());
            }
            return new AbstractC21005k.d(textResourceM21278l, trackingLabel, trackingValue, currentSelectionIndex, arrayList2, arrayList);
        }
        if (domainResult instanceof C14838e) {
            C14838e c14838e = (C14838e) domainResult;
            if (c14838e.getIsLoading() && !c14838e.getKeepContentWhileLoading()) {
                return AbstractC20998d.b.f79402a;
            }
            if (c14838e.getIsError()) {
                return AbstractC20998d.a.f79401a;
            }
            return c14838e.getExtensionsV2LandingResponse() != null ? new AbstractC20998d.c(AbstractC8693b.m21278l(c14838e.getExtensionsV2LandingResponse().getHeader()), AbstractC8693b.m21278l(c14838e.getExtensionsV2LandingResponse().getTitle()), AbstractC8693b.m21278l(c14838e.getExtensionsV2LandingResponse().getSubtitle()), m62843a(c14838e.getExtensionsV2LandingResponse().getOptions())) : AbstractC20998d.b.f79402a;
        }
        Object promoCode4 = null;
        if (!(domainResult instanceof C14834a)) {
            if (!(domainResult instanceof C14839f)) {
                throw new NoWhenBranchMatchedException();
            }
            C14839f c14839f = (C14839f) domainResult;
            if (c14839f.getIsLoading()) {
                ProgressContent placeOrderResponse = c14839f.getPlaceOrderResponse();
                if (placeOrderResponse == null) {
                    StepPrefetchContent stepPrefetchContent = c14839f.getStepPrefetchContent();
                    loadingProgressContent = stepPrefetchContent != null ? stepPrefetchContent.getLoadingProgressContent() : null;
                } else {
                    loadingProgressContent = placeOrderResponse;
                }
                return new InterfaceC21000f.b(loadingProgressContent, "", c14839f.getPromoCode(), c14839f.getCard(), c14839f.m42700f(), c14839f.getPath(), c14839f.getPayloadV2());
            }
            if (c14839f.getIsError()) {
                ProgressContent placeOrderResponse2 = c14839f.getPlaceOrderResponse();
                if (placeOrderResponse2 == null) {
                    StepPrefetchContent stepPrefetchContent2 = c14839f.getStepPrefetchContent();
                    genericErrorProgressContent2 = stepPrefetchContent2 != null ? stepPrefetchContent2.getGenericErrorProgressContent() : null;
                } else {
                    genericErrorProgressContent2 = placeOrderResponse2;
                }
                return new InterfaceC21000f.a(genericErrorProgressContent2, "", c14839f.getPromoCode(), c14839f.getCard(), c14839f.m42700f(), c14839f.getPath(), c14839f.getPayloadV2(), false, 128, null);
            }
            if (domainResult.mo42630b()) {
                return new InterfaceC21000f.c(c14839f.getPlaceOrderResponse(), "", c14839f.getPromoCode(), c14839f.getCard(), c14839f.m42700f(), c14839f.getPath(), c14839f.getPayloadV2());
            }
            ProgressContent placeOrderResponse3 = c14839f.getPlaceOrderResponse();
            if (placeOrderResponse3 == null) {
                StepPrefetchContent stepPrefetchContent3 = c14839f.getStepPrefetchContent();
                genericErrorProgressContent = stepPrefetchContent3 != null ? stepPrefetchContent3.getGenericErrorProgressContent() : null;
            } else {
                genericErrorProgressContent = placeOrderResponse3;
            }
            return new InterfaceC21000f.a(genericErrorProgressContent, "", c14839f.getPromoCode(), null, c14839f.m42700f(), c14839f.getPath(), c14839f.getPayloadV2(), false, 136, null);
        }
        C14834a c14834a = (C14834a) domainResult;
        if (c14834a.getIsLoading()) {
            StepPrefetchContent stepPrefetchContent4 = c14834a.getStepPrefetchContent();
            ProgressContent loadingProgressContent2 = stepPrefetchContent4 != null ? stepPrefetchContent4.getLoadingProgressContent() : null;
            NativeOrderResponse nativeOrderResponse = c14834a.getNativeOrderResponse();
            if (nativeOrderResponse != null && (promoCode3 = nativeOrderResponse.getPromoCode()) != null) {
                promoCode4 = promoCode3.getPromoCode();
            }
            return new InterfaceC20996b.b(loadingProgressContent2, promoCode4, c14834a.getPayload(), c14834a.getPath(), null);
        }
        if (c14834a.getIsError()) {
            this.analytics.m38891r(c14834a.getPayload());
            StepPrefetchContent stepPrefetchContent5 = c14834a.getStepPrefetchContent();
            ProgressContent genericErrorProgressContent3 = stepPrefetchContent5 != null ? stepPrefetchContent5.getGenericErrorProgressContent() : null;
            NativeOrderResponse nativeOrderResponse2 = c14834a.getNativeOrderResponse();
            if (nativeOrderResponse2 != null && (promoCode2 = nativeOrderResponse2.getPromoCode()) != null) {
                promoCode4 = promoCode2.getPromoCode();
            }
            return new InterfaceC20996b.a(genericErrorProgressContent3, promoCode4, c14834a.getPayload(), c14834a.getPath(), c14834a.getPayloadV2());
        }
        if (!domainResult.mo42630b() || c14834a.getNativeOrderResponse() == null) {
            this.analytics.m38891r(c14834a.getPayload());
            StepPrefetchContent stepPrefetchContent6 = c14834a.getStepPrefetchContent();
            ProgressContent genericErrorProgressContent4 = stepPrefetchContent6 != null ? stepPrefetchContent6.getGenericErrorProgressContent() : null;
            NativeOrderResponse nativeOrderResponse3 = c14834a.getNativeOrderResponse();
            if (nativeOrderResponse3 != null && (promoCode = nativeOrderResponse3.getPromoCode()) != null) {
                promoCode4 = promoCode.getPromoCode();
            }
            return new InterfaceC20996b.a(genericErrorProgressContent4, promoCode4, c14834a.getPayload(), c14834a.getPath(), c14834a.getPayloadV2());
        }
        this.analytics.m38892s(c14834a.getPayload());
        if (c14834a.getPayloadV2() != null) {
            this.analytics.m38893t();
        }
        String title = c14834a.getNativeOrderResponse().getTitle();
        C24774j c24774jM62844b = m62844b(c14834a.getNativeOrderResponse().getPaymentOptions(), c14834a.getCard());
        NativeOrderDetails orderDetails = c14834a.getNativeOrderResponse().getOrderDetails();
        List<OrderOption> orderOptions = c14834a.getNativeOrderResponse().getOrderOptions();
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(orderOptions, 10));
        for (OrderOption orderOption : orderOptions) {
            Iterator<T> it4 = c14834a.m42634g().iterator();
            do {
                if (!it4.hasNext()) {
                    next = null;
                    break;
                }
                next = it4.next();
            } while (!AbstractC22676k.m65745e(((OrderOption) next).getParameter(), orderOption.getParameter()));
            OrderOption orderOption2 = (OrderOption) next;
            if (orderOption2 != null) {
                orderOption = orderOption2;
            }
            arrayList3.add(orderOption);
        }
        C24775k c24775kM62845c = c14834a.getNativeOrderResponse().getPromoCode() != null ? m62845c(c14834a.getNativeOrderResponse().getPromoCode()) : null;
        NativeOrderPromoCode promoCode5 = c14834a.getNativeOrderResponse().getPromoCode();
        return new InterfaceC20996b.c(title, c24774jM62844b, orderDetails, arrayList3, c24775kM62845c, promoCode5 != null ? promoCode5.getPromoCode() : null, c14834a.getNativeOrderResponse().getCheckoutCtaTitle(), c14834a.getNativeOrderResponse().getSecurityFooter(), c14834a.getNativeOrderResponse().getDisclaimerFooterMarkdown(), c14834a.getNativeOrderResponse().getPayload(), c14834a.getNativeOrderResponse().getCheckoutStep(), c14834a.getPath(), c14834a.getPayloadV2(), c14834a.m42637j());
    }
}
