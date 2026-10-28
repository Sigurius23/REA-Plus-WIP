package com.whoop.universalcheckout.features.checkout.domain.models;

import ad3.C0771n;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.universalcheckout.features.checkout.domain.models.items.CheckoutFooterModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p719m22.C24958m;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 H2\u00020\u0001:\u0002IHBS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011Bs\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010!J\u001e\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010!Jj\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010!J\u0010\u0010/\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010!R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b8\u0010#R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b:\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\b<\u0010'R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b=\u0010!R%\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010>\u001a\u0004\b?\u0010*R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u00105\u001a\u0004\b@\u0010!R\"\u0010B\u001a\u0004\u0018\u00010A8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bB\u0010C\u0012\u0004\bF\u0010G\u001a\u0004\bD\u0010E¨\u0006J"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;", "", "", "title", "", "Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutSectionModel;", "sections", "Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetConfiguration;", "paymentSheetConfiguration", "Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;", "paymentSheetIntentConfiguration", "stripePublishableKey", "", "Lkotlinx/serialization/json/JsonElement;", "analyticsPayload", "cartId", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetConfiguration;Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetConfiguration;Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$universal_checkout_release", "(Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetConfiguration;", "component4", "()Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;", "component5", "component6", "()Ljava/util/Map;", "component7", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetConfiguration;Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getSections", "Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetConfiguration;", "getPaymentSheetConfiguration", "Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;", "getPaymentSheetIntentConfiguration", "getStripePublishableKey", "Ljava/util/Map;", "getAnalyticsPayload", "getCartId", "Lcom/whoop/navigation/e;", "postCheckoutNavigation", "Lcom/whoop/navigation/e;", "getPostCheckoutNavigation", "()Lcom/whoop/navigation/e;", "getPostCheckoutNavigation$annotations", "()V", "Companion", "$serializer", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class UniversalCheckoutResponse {
    private static final InterfaceC23462h[] $childSerializers;
    private final Map<String, JsonElement> analyticsPayload;
    private final String cartId;
    private final PaymentSheetConfiguration paymentSheetConfiguration;
    private final PaymentSheetIntentConfiguration paymentSheetIntentConfiguration;
    private final C9598e postCheckoutNavigation;
    private final List<UniversalCheckoutSectionModel> sections;
    private final String stripePublishableKey;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;", "serializer", "()Lwc3/c;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return UniversalCheckoutResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C24958m(26)), null, null, null, AbstractC30060g.m92087G(enumC23463i, new C24958m(27)), null};
    }

    public /* synthetic */ UniversalCheckoutResponse(int i13, String str, List list, PaymentSheetConfiguration paymentSheetConfiguration, PaymentSheetIntentConfiguration paymentSheetIntentConfiguration, String str2, Map map, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, UniversalCheckoutResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.sections = list;
        this.paymentSheetConfiguration = paymentSheetConfiguration;
        this.paymentSheetIntentConfiguration = paymentSheetIntentConfiguration;
        this.stripePublishableKey = str2;
        this.analyticsPayload = map;
        this.cartId = str3;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC25265s.m74141p0(arrayList, ((UniversalCheckoutSectionModel) it.next()).getItems());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof CheckoutFooterModel) {
                arrayList2.add(obj);
            }
        }
        CheckoutFooterModel checkoutFooterModel = (CheckoutFooterModel) AbstractC25265s.m74100H0(arrayList2);
        this.postCheckoutNavigation = checkoutFooterModel != null ? checkoutFooterModel.getPostCheckoutNavigation() : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(UniversalCheckoutSectionModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new LinkedHashMapSerializer(StringSerializer.INSTANCE, C0771n.f2806a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UniversalCheckoutResponse copy$default(UniversalCheckoutResponse universalCheckoutResponse, String str, List list, PaymentSheetConfiguration paymentSheetConfiguration, PaymentSheetIntentConfiguration paymentSheetIntentConfiguration, String str2, Map map, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = universalCheckoutResponse.title;
        }
        if ((i13 & 2) != 0) {
            list = universalCheckoutResponse.sections;
        }
        if ((i13 & 4) != 0) {
            paymentSheetConfiguration = universalCheckoutResponse.paymentSheetConfiguration;
        }
        if ((i13 & 8) != 0) {
            paymentSheetIntentConfiguration = universalCheckoutResponse.paymentSheetIntentConfiguration;
        }
        if ((i13 & 16) != 0) {
            str2 = universalCheckoutResponse.stripePublishableKey;
        }
        if ((i13 & 32) != 0) {
            map = universalCheckoutResponse.analyticsPayload;
        }
        if ((i13 & 64) != 0) {
            str3 = universalCheckoutResponse.cartId;
        }
        Map map2 = map;
        String str4 = str3;
        String str5 = str2;
        PaymentSheetConfiguration paymentSheetConfiguration2 = paymentSheetConfiguration;
        return universalCheckoutResponse.copy(str, list, paymentSheetConfiguration2, paymentSheetIntentConfiguration, str5, map2, str4);
    }

    public static /* synthetic */ void getPostCheckoutNavigation$annotations() {
    }

    public static final /* synthetic */ void write$Self$universal_checkout_release(UniversalCheckoutResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.sections);
        output.encodeSerializableElement(serialDesc, 2, PaymentSheetConfiguration$$serializer.INSTANCE, self.paymentSheetConfiguration);
        output.encodeSerializableElement(serialDesc, 3, PaymentSheetIntentConfiguration$$serializer.INSTANCE, self.paymentSheetIntentConfiguration);
        output.encodeStringElement(serialDesc, 4, self.stripePublishableKey);
        output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.analyticsPayload);
        output.encodeStringElement(serialDesc, 6, self.cartId);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<UniversalCheckoutSectionModel> component2() {
        return this.sections;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PaymentSheetConfiguration getPaymentSheetConfiguration() {
        return this.paymentSheetConfiguration;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final PaymentSheetIntentConfiguration getPaymentSheetIntentConfiguration() {
        return this.paymentSheetIntentConfiguration;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStripePublishableKey() {
        return this.stripePublishableKey;
    }

    public final Map<String, JsonElement> component6() {
        return this.analyticsPayload;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCartId() {
        return this.cartId;
    }

    public final UniversalCheckoutResponse copy(String title, List<UniversalCheckoutSectionModel> sections, PaymentSheetConfiguration paymentSheetConfiguration, PaymentSheetIntentConfiguration paymentSheetIntentConfiguration, String stripePublishableKey, Map<String, ? extends JsonElement> analyticsPayload, String cartId) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(sections, "sections");
        AbstractC22676k.m65750j(paymentSheetConfiguration, "paymentSheetConfiguration");
        AbstractC22676k.m65750j(paymentSheetIntentConfiguration, "paymentSheetIntentConfiguration");
        AbstractC22676k.m65750j(stripePublishableKey, "stripePublishableKey");
        AbstractC22676k.m65750j(cartId, "cartId");
        return new UniversalCheckoutResponse(title, sections, paymentSheetConfiguration, paymentSheetIntentConfiguration, stripePublishableKey, analyticsPayload, cartId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UniversalCheckoutResponse)) {
            return false;
        }
        UniversalCheckoutResponse universalCheckoutResponse = (UniversalCheckoutResponse) other;
        return AbstractC22676k.m65745e(this.title, universalCheckoutResponse.title) && AbstractC22676k.m65745e(this.sections, universalCheckoutResponse.sections) && AbstractC22676k.m65745e(this.paymentSheetConfiguration, universalCheckoutResponse.paymentSheetConfiguration) && AbstractC22676k.m65745e(this.paymentSheetIntentConfiguration, universalCheckoutResponse.paymentSheetIntentConfiguration) && AbstractC22676k.m65745e(this.stripePublishableKey, universalCheckoutResponse.stripePublishableKey) && AbstractC22676k.m65745e(this.analyticsPayload, universalCheckoutResponse.analyticsPayload) && AbstractC22676k.m65745e(this.cartId, universalCheckoutResponse.cartId);
    }

    public final Map<String, JsonElement> getAnalyticsPayload() {
        return this.analyticsPayload;
    }

    public final String getCartId() {
        return this.cartId;
    }

    public final PaymentSheetConfiguration getPaymentSheetConfiguration() {
        return this.paymentSheetConfiguration;
    }

    public final PaymentSheetIntentConfiguration getPaymentSheetIntentConfiguration() {
        return this.paymentSheetIntentConfiguration;
    }

    public final C9598e getPostCheckoutNavigation() {
        return this.postCheckoutNavigation;
    }

    public final List<UniversalCheckoutSectionModel> getSections() {
        return this.sections;
    }

    public final String getStripePublishableKey() {
        return this.stripePublishableKey;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d((this.paymentSheetIntentConfiguration.hashCode() + ((this.paymentSheetConfiguration.hashCode() + AbstractC11895b.m31983b(this.title.hashCode() * 31, 31, this.sections)) * 31)) * 31, 31, this.stripePublishableKey);
        Map<String, JsonElement> map = this.analyticsPayload;
        return this.cartId.hashCode() + ((iM30450d + (map == null ? 0 : map.hashCode())) * 31);
    }

    public String toString() {
        String str = this.title;
        List<UniversalCheckoutSectionModel> list = this.sections;
        PaymentSheetConfiguration paymentSheetConfiguration = this.paymentSheetConfiguration;
        PaymentSheetIntentConfiguration paymentSheetIntentConfiguration = this.paymentSheetIntentConfiguration;
        String str2 = this.stripePublishableKey;
        Map<String, JsonElement> map = this.analyticsPayload;
        String str3 = this.cartId;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("UniversalCheckoutResponse(title=", str, ", sections=", ", paymentSheetConfiguration=", list);
        sbM94766o.append(paymentSheetConfiguration);
        sbM94766o.append(", paymentSheetIntentConfiguration=");
        sbM94766o.append(paymentSheetIntentConfiguration);
        sbM94766o.append(", stripePublishableKey=");
        AbstractC36095b.m114695w(sbM94766o, str2, ", analyticsPayload=", map, ", cartId=");
        return AbstractC25012a.m73376i(str3, ")", sbM94766o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UniversalCheckoutResponse(String title, List<UniversalCheckoutSectionModel> sections, PaymentSheetConfiguration paymentSheetConfiguration, PaymentSheetIntentConfiguration paymentSheetIntentConfiguration, String stripePublishableKey, Map<String, ? extends JsonElement> map, String cartId) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(sections, "sections");
        AbstractC22676k.m65750j(paymentSheetConfiguration, "paymentSheetConfiguration");
        AbstractC22676k.m65750j(paymentSheetIntentConfiguration, "paymentSheetIntentConfiguration");
        AbstractC22676k.m65750j(stripePublishableKey, "stripePublishableKey");
        AbstractC22676k.m65750j(cartId, "cartId");
        this.title = title;
        this.sections = sections;
        this.paymentSheetConfiguration = paymentSheetConfiguration;
        this.paymentSheetIntentConfiguration = paymentSheetIntentConfiguration;
        this.stripePublishableKey = stripePublishableKey;
        this.analyticsPayload = map;
        this.cartId = cartId;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = sections.iterator();
        while (it.hasNext()) {
            AbstractC25265s.m74141p0(arrayList, ((UniversalCheckoutSectionModel) it.next()).getItems());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof CheckoutFooterModel) {
                arrayList2.add(obj);
            }
        }
        CheckoutFooterModel checkoutFooterModel = (CheckoutFooterModel) AbstractC25265s.m74100H0(arrayList2);
        this.postCheckoutNavigation = checkoutFooterModel != null ? checkoutFooterModel.getPostCheckoutNavigation() : null;
    }
}
