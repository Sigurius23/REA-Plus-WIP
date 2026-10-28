package c32;

import c31.C3929m;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.payments.stripebottomsheettile.model.DefaultBillingAddress;
import com.whoop.payments.stripebottomsheettile.model.DefaultBillingDetails;
import com.whoop.payments.stripebottomsheettile.model.PaymentMethodMenuTileModel;
import com.whoop.payments.stripebottomsheettile.model.PaymentSheetMetadata;
import com.whoop.payments.stripebottomsheettile.model.StripeBottomSheetTileModel;
import g32.C15301a;
import g32.C15302b;
import g32.C15303c;
import g32.C15305e;
import g32.C15306f;
import g32.C15312l;
import g32.C15313m;
import gz0.AbstractC16315n0;
import gz0.EnumC16313m0;
import h20.EnumC16738t2;
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
import p000.AbstractC11266d;
import p208i2.C17919x;
import p31.AbstractC28805p;
import p31.C28801l;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23749z0;
import p720m91.InterfaceC25312u;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import y71.AbstractC39279l;
import y71.C39274g;
import y71.C39282o;

/* JADX INFO: renamed from: c32.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;", "", "screenName", "Lg32/l;", "d", "(Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;Ljava/lang/String;)Lg32/l;", "payments_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3933a {

    /* JADX INFO: renamed from: c32.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f16060w = new a();

        /* JADX INFO: renamed from: a */
        public final long m11980a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite50();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m11980a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: c32.a$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f16061w = new b();

        /* JADX INFO: renamed from: a */
        public final long m11981a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite50();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m11981a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: c32.a$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f16062w = new c();

        /* JADX INFO: renamed from: a */
        public final long m11982a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite50();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m11982a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: c32.a$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f16063w;

        public d(Function1 function1) {
            this.f16063w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f16063w.invoke((PaymentMethodMenuTileModel) it);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final C15312l m11976d(StripeBottomSheetTileModel stripeBottomSheetTileModel, String screenName) {
        AbstractC28805p state;
        EnumC16738t2 enumC16738t2;
        C15302b c15302b;
        AbstractC22676k.m65750j(stripeBottomSheetTileModel, "<this>");
        AbstractC22676k.m65750j(screenName, "screenName");
        C21535a c21535aM60554d = AbstractC21537c.m60554d(new C3929m(2));
        if (stripeBottomSheetTileModel.getHeader() != null) {
            InterfaceC25312u interfaceC25312uM60544l = c21535aM60554d.m60544l(stripeBottomSheetTileModel.getHeader());
            C28801l c28801l = interfaceC25312uM60544l instanceof C28801l ? (C28801l) interfaceC25312uM60544l : null;
            if (c28801l == null || (state = c28801l.getState()) == null) {
                throw new IllegalStateException("HeaderModel could not be reduced to HomeSectionHeaderState");
            }
        } else {
            state = null;
        }
        InterfaceC25312u interfaceC25312uM60544l2 = c21535aM60554d.m60544l(stripeBottomSheetTileModel.getPaymentMethodTile());
        C39282o c39282o = interfaceC25312uM60544l2 instanceof C39282o ? (C39282o) interfaceC25312uM60544l2 : null;
        if (c39282o == null) {
            throw new IllegalStateException("PaymentMethodMenuTileModel could not be reduced to MenuItemState");
        }
        PaymentSheetMetadata paymentSheetMetadata = stripeBottomSheetTileModel.getPaymentSheetMetadata();
        DefaultBillingDetails defaultBillingDetails = paymentSheetMetadata.getDefaultBillingDetails();
        List<String> acceptedPaymentMethods = stripeBottomSheetTileModel.getAcceptedPaymentMethods();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(acceptedPaymentMethods, 10));
        Iterator<T> it = acceptedPaymentMethods.iterator();
        while (it.hasNext()) {
            arrayList.add(new AbstractC22403o.c((String) it.next(), 0, 0, 0, 14, null));
        }
        String stripePublishableKey = paymentSheetMetadata.getStripePublishableKey();
        String currencyCode = paymentSheetMetadata.getSetupIntentConfiguration().getCurrencyCode();
        String upperCase = paymentSheetMetadata.getSetupIntentConfiguration().getFutureUse().toUpperCase(Locale.ROOT);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        if (upperCase.equals("ON_SESSION")) {
            enumC16738t2 = EnumC16738t2.f64291w;
        } else {
            if (!upperCase.equals("OFF_SESSION")) {
                throw new IllegalArgumentException(AbstractC11266d.m30461o("Unknown setupFutureUse value: ", paymentSheetMetadata.getSetupIntentConfiguration().getFutureUse()));
            }
            enumC16738t2 = EnumC16738t2.f64292x;
        }
        C15306f c15306f = new C15306f(currencyCode, enumC16738t2, paymentSheetMetadata.getPaymentMethodConfigurationId(), null, false, paymentSheetMetadata.getPaymentSheetConfiguration().getPaymentMethodTypes(), 24, null);
        C15303c c15303c = new C15303c(paymentSheetMetadata.getPaymentSheetConfiguration().getCustomer().getId(), paymentSheetMetadata.getPaymentSheetConfiguration().getCustomer().getCustomerSessionClientSecret());
        if (defaultBillingDetails != null) {
            DefaultBillingAddress address = defaultBillingDetails.getAddress();
            c15302b = new C15302b(address != null ? new C15301a(address.getCity(), address.getCountry(), address.getLine1(), address.getLine2(), address.getPostalCode(), address.getState()) : null, defaultBillingDetails.getEmail(), null, null);
        } else {
            c15302b = null;
        }
        return new C15312l(state, c39282o, arrayList, new C15313m(stripePublishableKey, c15306f, new C15305e("WHOOP", c15303c, c15302b, null, paymentSheetMetadata.getSetupIntentConfiguration().getCtaText()), screenName), paymentSheetMetadata.getAutoPopUp());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m11977e(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C3929m(3));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m11978f(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        addModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(PaymentMethodMenuTileModel.class), new d(new C3929m(4)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C39282o m11979g(PaymentMethodMenuTileModel model) {
        String rightIcon;
        AbstractC22676k.m65750j(model, "model");
        String paymentMethodImageUrl = model.getPaymentMethodImageUrl();
        if (paymentMethodImageUrl != null && paymentMethodImageUrl.length() != 0) {
            TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getTitle());
            AbstractC22403o.c cVar = new AbstractC22403o.c(model.getPaymentMethodImageUrl(), 0, 0, 0, 14, null);
            int i13 = C17919x.f69638o;
            InterfaceC39332e interfaceC39332eM125324b = p745y81.Function1.m125324b(C17919x.f69637n);
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(model.getSuffixTitle());
            Integer numM46376a = AbstractC16315n0.m46376a(model.getRightIcon());
            return new C39282o(null, textResourceM21278l, null, false, false, new AbstractC39279l.c(null, null, cVar, interfaceC39332eM125324b, numM46376a != null ? new AbstractC22403o.a(numM46376a.intValue()) : null, p745y81.Function1.m125323a(a.f16060w), null, null, textResourceM21278l2, null, null, false, 3779, null), false, null, null, null, false, null, null, null, null, 32733, null);
        }
        C39282o.Companion companion = C39282o.INSTANCE;
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(model.getTitle());
        String leftIcon = model.getLeftIcon();
        C39274g c39274g = leftIcon != null ? new C39274g(AbstractC16315n0.m46380e(leftIcon, EnumC16313m0.CREDIT_CARD), null, 2, null) : null;
        InterfaceC39332e interfaceC39332eM125323a = p745y81.Function1.m125323a(b.f16061w);
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l(model.getSuffixTitle());
        String suffixTitle = model.getSuffixTitle();
        boolean z4 = (suffixTitle == null || suffixTitle.length() == 0) && ((rightIcon = model.getRightIcon()) == null || rightIcon.length() == 0);
        Integer numM46376a2 = AbstractC16315n0.m46376a(model.getRightIcon());
        return C39282o.Companion.m125229d(companion, textResourceM21278l3, null, null, null, null, c39274g, interfaceC39332eM125323a, numM46376a2 != null ? new C39274g(numM46376a2.intValue(), null, 2, null) : null, p745y81.Function1.m125323a(c.f16062w), null, null, textResourceM21278l4, null, null, false, false, null, z4, null, null, null, false, null, 8255006, null);
    }
}
