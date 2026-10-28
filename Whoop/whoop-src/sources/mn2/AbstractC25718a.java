package mn2;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.universalcheckout.features.checkout.domain.models.items.CheckoutDetailModel;
import com.whoop.universalcheckout.features.checkout.domain.models.items.CheckoutFooterModel;
import com.whoop.universalcheckout.features.checkout.domain.models.items.CheckoutInfoModel;
import com.whoop.universalcheckout.features.checkout.domain.models.items.CheckoutTotalModel;
import com.whoop.universalcheckout.features.checkout.domain.models.items.OrderDetailsModel;
import com.whoop.universalcheckout.features.checkout.domain.models.items.OrderDetailsSummaryCtaModel;
import com.whoop.universalcheckout.features.checkout.domain.models.items.OrderDetailsSummaryModel;
import com.whoop.universalcheckout.features.checkout.domain.models.items.OrderItemDetailsModel;
import com.whoop.universalcheckout.features.checkout.domain.models.items.PaymentMethodMenuTileModel;
import com.whoop.universalcheckout.features.checkout.domain.models.items.PaymentMethodTileModel;
import com.whoop.universalcheckout.features.checkout.domain.models.items.PreviewTileContent;
import com.whoop.universalcheckout.features.checkout.domain.models.items.PreviewTileModel;
import com.whoop.universalcheckout.features.checkout.domain.models.items.PromoCodeInputModel;
import com.whoop.universalcheckout.features.checkout.domain.models.items.PromoCodeTagModel;
import com.whoop.universalcheckout.features.receipt.domain.models.items.ReceiptHeaderModel;
import com.whoop.universalcheckout.features.receipt.domain.models.items.ReimbursementTileModel;
import gz0.AbstractC16315n0;
import gz0.EnumC16313m0;
import hp2.C17556c;
import hp2.C17560g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io2.AbstractC20775n0;
import io2.C20748a;
import io2.C20751b0;
import io2.C20755d0;
import io2.C20762h;
import io2.C20768k;
import io2.C20772m;
import io2.C20777o0;
import io2.C20779p0;
import io2.C20783t;
import io2.C20784u;
import io2.C20786w;
import io2.EnumC20750b;
import io2.EnumC20785v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import kd1.AbstractC22403o;
import l83.C23454a0;
import m83.AbstractC25267u;
import mm1.C25694h;
import p208i2.C17919x;
import p31.AbstractC28805p;
import p31.C28801l;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p716lb1.C23749z0;
import p720m91.InterfaceC25312u;
import p745y81.C39336i;
import y71.AbstractC39279l;
import y71.C39274g;
import y71.C39282o;

/* JADX INFO: renamed from: mn2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u001a\u0010\u0017\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PreviewTileModel;", "Lio2/d0;", "v", "(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PreviewTileModel;)Lio2/d0;", "Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeTagModel;", "Lio2/p0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeTagModel;)Lio2/p0;", "Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutInfoModel;", "Lio2/k;", "u", "(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutInfoModel;)Lio2/k;", "Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutFooterModel;", "Lio2/h;", "t", "(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutFooterModel;)Lio2/h;", "Ljb1/a;", "a", "Ljb1/a;", "nestedDesignItemReducer", "b", "o", "()Ljb1/a;", "universalCheckoutDesignItemReducer", "universal-checkout_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25718a {

    /* JADX INFO: renamed from: a */
    private static final C21535a f101305a = AbstractC21537c.m60554d(new C25694h(6));

    /* JADX INFO: renamed from: b */
    private static final C21535a f101306b = AbstractC21537c.m60554d(new C25694h(11));

    /* JADX INFO: renamed from: mn2.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f101307w = new a();

        /* JADX INFO: renamed from: a */
        public final long m75824a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite50();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m75824a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: mn2.a$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f101308w = new b();

        /* JADX INFO: renamed from: a */
        public final long m75825a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite50();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m75825a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: mn2.a$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f101309w;

        public c(Function1 function1) {
            this.f101309w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f101309w.invoke((PaymentMethodMenuTileModel) it);
        }
    }

    /* JADX INFO: renamed from: mn2.a$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f101310w;

        public d(Function1 function1) {
            this.f101310w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f101310w.invoke((PreviewTileModel) it);
        }
    }

    /* JADX INFO: renamed from: mn2.a$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f101311w;

        public e(Function1 function1) {
            this.f101311w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f101311w.invoke((OrderDetailsModel) it);
        }
    }

    /* JADX INFO: renamed from: mn2.a$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f101312w;

        public f(Function1 function1) {
            this.f101312w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f101312w.invoke((CheckoutInfoModel) it);
        }
    }

    /* JADX INFO: renamed from: mn2.a$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f101313w;

        public g(Function1 function1) {
            this.f101313w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f101313w.invoke((PreviewTileModel) it);
        }
    }

    /* JADX INFO: renamed from: mn2.a$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f101314w;

        public h(Function1 function1) {
            this.f101314w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f101314w.invoke((PaymentMethodTileModel) it);
        }
    }

    /* JADX INFO: renamed from: mn2.a$i */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f101315w;

        public i(Function1 function1) {
            this.f101315w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f101315w.invoke((CheckoutFooterModel) it);
        }
    }

    /* JADX INFO: renamed from: mn2.a$j */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f101316w;

        public j(Function1 function1) {
            this.f101316w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f101316w.invoke((ReceiptHeaderModel) it);
        }
    }

    /* JADX INFO: renamed from: mn2.a$k */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f101317w;

        public k(Function1 function1) {
            this.f101317w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f101317w.invoke((ReimbursementTileModel) it);
        }
    }

    /* JADX INFO: renamed from: mn2.a$l */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f101318w;

        public l(Function1 function1) {
            this.f101318w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f101318w.invoke((PromoCodeInputModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C20768k m75791A(CheckoutInfoModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m75818u(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C20755d0 m75792B(PreviewTileModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m75819v(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C20751b0 m75793C(PaymentMethodTileModel model) {
        AbstractC22676k.m65750j(model, "model");
        C21535a c21535a = f101305a;
        InterfaceC25312u interfaceC25312uM60541h = c21535a.m60541h(model.getHeader());
        AbstractC22676k.m65748h(interfaceC25312uM60541h, "null cannot be cast to non-null type com.whoop.design.atomic.molecule.sectionheader.HomeSectionHeaderItemState");
        AbstractC28805p state = ((C28801l) interfaceC25312uM60541h).getState();
        InterfaceC25312u interfaceC25312uM60541h2 = c21535a.m60541h(model.getPaymentMethodTile());
        AbstractC22676k.m65748h(interfaceC25312uM60541h2, "null cannot be cast to non-null type com.whoop.design.atomic.organism.menuitem.MenuItemState");
        C39282o c39282o = (C39282o) interfaceC25312uM60541h2;
        C39282o c39282o2 = null;
        if (model.getTruemedPaymentMenuItem() != null) {
            InterfaceC25312u interfaceC25312uM60541h3 = c21535a.m60541h(model.getTruemedPaymentMenuItem());
            if (interfaceC25312uM60541h3 instanceof C39282o) {
                c39282o2 = (C39282o) interfaceC25312uM60541h3;
            }
        }
        C39282o c39282o3 = c39282o2;
        List<String> acceptedPaymentMethods = model.getAcceptedPaymentMethods();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(acceptedPaymentMethods, 10));
        Iterator<T> it = acceptedPaymentMethods.iterator();
        while (it.hasNext()) {
            arrayList.add(new AbstractC22403o.c((String) it.next(), 0, 0, 0, 14, null));
        }
        return new C20751b0(state, c39282o, c39282o3, arrayList, "", "", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C20762h m75794D(CheckoutFooterModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m75817t(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C17556c m75795E(ReceiptHeaderModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C17556c(new AbstractC22403o.c(model.getImageUrl(), 0, 0, 0, 14, null), AbstractC8693b.m21278l(model.getImageSubtitle()), AbstractC8693b.m21278l(model.getTitle()), AbstractC8693b.m21278l(model.getSubtitle()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C17560g m75796F(ReimbursementTileModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C17560g(AbstractC8693b.m21278l(model.getTitle()), AbstractC8693b.m21278l(model.getSubtitle()), C39282o.Companion.m125229d(C39282o.INSTANCE, AbstractC8693b.m21278l(model.getTile().getTitle()), null, null, AbstractC8693b.m21278l(model.getTile().getSupportText()), null, null, null, new C39274g(AbstractC16315n0.m46380e(model.getTile().getIcon(), EnumC16313m0.COPY), null, 2, null), null, null, null, null, null, null, false, false, null, false, null, null, null, false, null, 8388470, null), model.getTile().getTextToCopy());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C20777o0 m75797G(PromoCodeInputModel model) {
        AbstractC22676k.m65750j(model, "model");
        TextResource title = model.getTitle();
        TextResource placeholder = model.getPlaceholder();
        if (placeholder == null && (placeholder = model.getExpandedTitle()) == null) {
            placeholder = AbstractC8693b.m21267a();
        }
        TextResource textResource = placeholder;
        TextResource textDisplay = model.getCta().getTextDisplay();
        AbstractC20775n0.c cVar = model.getPromoCodeApplied() ? AbstractC20775n0.c.f78017a : null;
        List<PromoCodeTagModel> promoCodeTags = model.getPromoCodeTags();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(promoCodeTags, 10));
        Iterator<T> it = promoCodeTags.iterator();
        while (it.hasNext()) {
            arrayList.add(m75820w((PromoCodeTagModel) it.next()));
        }
        return new C20777o0(title, textResource, textDisplay, cVar, arrayList, false, "");
    }

    /* JADX INFO: renamed from: o */
    public static final C21535a m75812o() {
        return f101306b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m75813p(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C25694h(12));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m75814q(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        C25694h c25694h = new C25694h(9);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(PaymentMethodMenuTileModel.class), new c(c25694h));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(PreviewTileModel.class), new d(new C25694h(10)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C39282o m75815r(PaymentMethodMenuTileModel model) {
        AbstractC22676k.m65750j(model, "model");
        String paymentMethodImageUrl = model.getPaymentMethodImageUrl();
        if (paymentMethodImageUrl != null && paymentMethodImageUrl.length() != 0) {
            TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getTitle());
            AbstractC22403o.c cVar = new AbstractC22403o.c(model.getPaymentMethodImageUrl(), 0, 0, 0, 14, null);
            int i13 = C17919x.f69638o;
            return new C39282o(null, textResourceM21278l, null, false, false, new AbstractC39279l.c(null, null, cVar, p745y81.Function1.m125324b(C17919x.f69637n), null, null, null, null, AbstractC8693b.m21278l(model.getSuffixTitle()), null, null, false, 3827, null), false, null, null, null, false, null, null, null, null, 32733, null);
        }
        C39282o.Companion companion = C39282o.INSTANCE;
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(model.getTitle());
        String leftIcon = model.getLeftIcon();
        C39274g c39274g = leftIcon != null ? new C39274g(AbstractC16315n0.m46380e(leftIcon, EnumC16313m0.CREDIT_CARD), null, 2, null) : null;
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(model.getSuffixTitle());
        String suffixTitle = model.getSuffixTitle();
        return C39282o.Companion.m125229d(companion, textResourceM21278l2, null, null, null, null, c39274g, null, null, null, null, null, textResourceM21278l3, null, null, false, false, null, suffixTitle == null || suffixTitle.length() == 0, null, null, null, false, null, 8255454, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C39282o m75816s(PreviewTileModel model) {
        AbstractC22676k.m65750j(model, "model");
        PreviewTileContent previewTileContent = model.getPreviewTileContent();
        return new C39282o(null, AbstractC8693b.m21278l(previewTileContent.getPreviewText()), null, false, false, new AbstractC39279l.b(null, null, new C39274g(AbstractC16315n0.m46381f(previewTileContent.getStartIcon(), null, 1, null), null, 2, null), p745y81.Function1.m125323a(a.f101307w), previewTileContent.getEndIcon() != null ? new C39274g(AbstractC16315n0.m46381f(previewTileContent.getEndIcon(), null, 1, null), null, 2, null) : null, p745y81.Function1.m125323a(b.f101308w), null, null, null, null, null, false, 4035, null), false, null, null, null, false, null, null, null, null, 32733, null);
    }

    /* JADX INFO: renamed from: t */
    public static final C20762h m75817t(CheckoutFooterModel checkoutFooterModel) {
        AbstractC22676k.m65750j(checkoutFooterModel, "<this>");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(checkoutFooterModel.getDisclaimer());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(checkoutFooterModel.getCtaText());
        String checkoutPath = checkoutFooterModel.getCheckoutPath();
        String cartId = checkoutFooterModel.getCartId();
        boolean zIsEnabled = checkoutFooterModel.isEnabled();
        Boolean skipStripeCheckout = checkoutFooterModel.getSkipStripeCheckout();
        return new C20762h(textResourceM21278l, textResourceM21278l2, checkoutPath, cartId, zIsEnabled, skipStripeCheckout != null ? skipStripeCheckout.booleanValue() : false);
    }

    /* JADX INFO: renamed from: u */
    public static final C20768k m75818u(CheckoutInfoModel checkoutInfoModel) {
        EnumC20750b enumC20750b;
        AbstractC22676k.m65750j(checkoutInfoModel, "<this>");
        List<CheckoutDetailModel> details = checkoutInfoModel.getDetails();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(details, 10));
        Iterator<T> it = details.iterator();
        while (true) {
            String upperCase = null;
            if (!it.hasNext()) {
                break;
            }
            CheckoutDetailModel checkoutDetailModel = (CheckoutDetailModel) it.next();
            TextResource textResourceM21278l = AbstractC8693b.m21278l(checkoutDetailModel.getTitle());
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(checkoutDetailModel.getValue());
            String style = checkoutDetailModel.getStyle();
            if (style != null) {
                upperCase = style.toUpperCase(Locale.ROOT);
                AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            }
            if (AbstractC22676k.m65745e(upperCase, "REGULAR")) {
                enumC20750b = EnumC20750b.REGULAR;
            } else {
                enumC20750b = AbstractC22676k.m65745e(upperCase, "HIGHLIGHT_GREEN") ? EnumC20750b.HIGHLIGHT_GREEN : EnumC20750b.REGULAR;
            }
            arrayList.add(new C20748a(textResourceM21278l, textResourceM21278l2, enumC20750b));
        }
        CheckoutTotalModel total = checkoutInfoModel.getTotal();
        return new C20768k(arrayList, total != null ? new C20772m(AbstractC8693b.m21278l(total.getTitle()), AbstractC8693b.m21278l(total.getValue())) : null);
    }

    /* JADX INFO: renamed from: v */
    public static final C20755d0 m75819v(PreviewTileModel previewTileModel) {
        AbstractC22676k.m65750j(previewTileModel, "<this>");
        C21535a c21535a = f101305a;
        InterfaceC25312u interfaceC25312uM60541h = c21535a.m60541h(previewTileModel.getHeader());
        C28801l c28801l = interfaceC25312uM60541h instanceof C28801l ? (C28801l) interfaceC25312uM60541h : null;
        AbstractC28805p state = c28801l != null ? c28801l.getState() : null;
        InterfaceC25312u interfaceC25312uM60541h2 = c21535a.m60541h(previewTileModel);
        return new C20755d0(state, interfaceC25312uM60541h2 instanceof C39282o ? (C39282o) interfaceC25312uM60541h2 : null, previewTileModel.getPreviewTileContent().getDestination(), null, 8, null);
    }

    /* JADX INFO: renamed from: w */
    public static final C20779p0 m75820w(PromoCodeTagModel promoCodeTagModel) {
        AbstractC22676k.m65750j(promoCodeTagModel, "<this>");
        String id4 = promoCodeTagModel.getId();
        TextResource title = promoCodeTagModel.getTitle();
        String icon = promoCodeTagModel.getIcon();
        return new C20779p0(id4, title, icon != null ? AbstractC16315n0.m46377b(icon) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m75821x(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C25694h(13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m75822y(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        C25694h c25694h = new C25694h(14);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(OrderDetailsModel.class), new e(c25694h));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(CheckoutInfoModel.class), new f(new C25694h(15)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(PreviewTileModel.class), new g(new C25694h(16)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(PaymentMethodTileModel.class), new h(new C25694h(17)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(CheckoutFooterModel.class), new i(new C25694h(18)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ReceiptHeaderModel.class), new j(new C25694h(19)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ReimbursementTileModel.class), new k(new C25694h(7)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(PromoCodeInputModel.class), new l(new C25694h(8)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C20784u m75823z(OrderDetailsModel model) {
        C20783t c20783t;
        String textDisplay;
        ArrayList arrayList;
        Iterator it;
        EnumC20785v enumC20785v;
        AbstractC22676k.m65750j(model, "model");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getTitle());
        TextResource textResourceM21271e = AbstractC8693b.m21271e(AbstractC8693b.m21278l(model.getCollapsedTitle()), AbstractC8693b.m21278l(model.getTitle()));
        List<OrderItemDetailsModel> items = model.getItems();
        int i13 = 10;
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(items, 10));
        Iterator it3 = items.iterator();
        while (it3.hasNext()) {
            OrderItemDetailsModel orderItemDetailsModel = (OrderItemDetailsModel) it3.next();
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(orderItemDetailsModel.getTitle());
            TextResource textResourceM21278l3 = AbstractC8693b.m21278l(orderItemDetailsModel.getSubtitle());
            AbstractC22403o.c cVar = new AbstractC22403o.c(orderItemDetailsModel.getImage(), 0, 0, 0, 14, null);
            List<String> stackedImages = orderItemDetailsModel.getStackedImages();
            if (stackedImages != null) {
                List<String> list = stackedImages;
                ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(list, i13));
                Iterator<T> it4 = list.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(new AbstractC22403o.c((String) it4.next(), 0, 0, 0, 14, null));
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            TextResource textResourceM21278l4 = AbstractC8693b.m21278l(orderItemDetailsModel.getPrice());
            TextResource textResourceM21278l5 = orderItemDetailsModel.getStrikethroughPrice() != null ? AbstractC8693b.m21278l(orderItemDetailsModel.getStrikethroughPrice()) : null;
            TextResource textResourceM21278l6 = AbstractC8693b.m21278l(orderItemDetailsModel.getQuantity());
            String style = orderItemDetailsModel.getStyle();
            EnumC20785v enumC20785v2 = EnumC20785v.TRANSPARENT;
            EnumC20785v[] enumC20785vArrValues = EnumC20785v.values();
            int length = enumC20785vArrValues.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    it = it3;
                    enumC20785v = null;
                    break;
                }
                EnumC20785v enumC20785v3 = enumC20785vArrValues[i14];
                it = it3;
                if (AbstractC22676k.m65745e(enumC20785v3.name(), style)) {
                    enumC20785v = enumC20785v3;
                    break;
                }
                i14++;
                it3 = it;
            }
            arrayList2.add(new C20786w(textResourceM21278l2, textResourceM21278l3, cVar, arrayList, textResourceM21278l4, textResourceM21278l5, textResourceM21278l6, enumC20785v == null ? enumC20785v2 : enumC20785v));
            it3 = it;
            i13 = 10;
        }
        CheckoutInfoModel checkoutInfo = model.getCheckoutInfo();
        C20768k c20768kM75818u = checkoutInfo != null ? m75818u(checkoutInfo) : null;
        OrderDetailsSummaryModel summary = model.getSummary();
        if (summary != null) {
            TextResource textResourceM21278l7 = AbstractC8693b.m21278l(summary.getTitle());
            String body = summary.getBody();
            TextResource textResourceM21278l8 = body != null ? AbstractC8693b.m21278l(body) : null;
            OrderDetailsSummaryCtaModel cta = summary.getCta();
            TextResource textResourceM21278l9 = (cta == null || (textDisplay = cta.getTextDisplay()) == null) ? null : AbstractC8693b.m21278l(textDisplay);
            OrderDetailsSummaryCtaModel cta2 = summary.getCta();
            c20783t = new C20783t(textResourceM21278l7, textResourceM21278l8, textResourceM21278l9, cta2 != null ? cta2.getDestination() : null);
        } else {
            c20783t = null;
        }
        return new C20784u(textResourceM21278l, textResourceM21271e, arrayList2, c20768kM75818u, c20783t, true);
    }
}
