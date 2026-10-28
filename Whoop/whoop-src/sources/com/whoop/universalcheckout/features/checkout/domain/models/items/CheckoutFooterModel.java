package com.whoop.universalcheckout.features.checkout.domain.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no2.C26995a;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import te0.AbstractC33745d;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB_\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b%\u0010&JZ\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u001dJ\u0010\u0010*\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020\u00072\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b3\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b4\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b\b\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b7\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b9\u0010&¨\u0006<"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutFooterModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "disclaimer", "ctaText", "checkoutPath", "cartId", "", "isEnabled", "skipStripeCheckout", "Lcom/whoop/navigation/e;", "postCheckoutNavigation", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Lcom/whoop/navigation/e;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$universal_checkout_release", "(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutFooterModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Z", "component6", "()Ljava/lang/Boolean;", "component7", "()Lcom/whoop/navigation/e;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Lcom/whoop/navigation/e;)Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutFooterModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDisclaimer", "getCtaText", "getCheckoutPath", "getCartId", "Z", "Ljava/lang/Boolean;", "getSkipStripeCheckout", "Lcom/whoop/navigation/e;", "getPostCheckoutNavigation", "Companion", "$serializer", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CheckoutFooterModel implements DesignSystemModel {
    private final String cartId;
    private final String checkoutPath;
    private final String ctaText;
    private final String disclaimer;
    private final boolean isEnabled;
    private final C9598e postCheckoutNavigation;
    private final Boolean skipStripeCheckout;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C26995a(0))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutFooterModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutFooterModel;", "serializer", "()Lwc3/c;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CheckoutFooterModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CheckoutFooterModel(int i13, String str, String str2, String str3, String str4, boolean z4, Boolean bool, C9598e c9598e, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, CheckoutFooterModel$$serializer.INSTANCE.getDescriptor());
        }
        this.disclaimer = str;
        this.ctaText = str2;
        this.checkoutPath = str3;
        this.cartId = str4;
        this.isEnabled = z4;
        this.skipStripeCheckout = bool;
        this.postCheckoutNavigation = c9598e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ CheckoutFooterModel copy$default(CheckoutFooterModel checkoutFooterModel, String str, String str2, String str3, String str4, boolean z4, Boolean bool, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = checkoutFooterModel.disclaimer;
        }
        if ((i13 & 2) != 0) {
            str2 = checkoutFooterModel.ctaText;
        }
        if ((i13 & 4) != 0) {
            str3 = checkoutFooterModel.checkoutPath;
        }
        if ((i13 & 8) != 0) {
            str4 = checkoutFooterModel.cartId;
        }
        if ((i13 & 16) != 0) {
            z4 = checkoutFooterModel.isEnabled;
        }
        if ((i13 & 32) != 0) {
            bool = checkoutFooterModel.skipStripeCheckout;
        }
        if ((i13 & 64) != 0) {
            c9598e = checkoutFooterModel.postCheckoutNavigation;
        }
        Boolean bool2 = bool;
        C9598e c9598e2 = c9598e;
        boolean z13 = z4;
        String str5 = str3;
        return checkoutFooterModel.copy(str, str2, str5, str4, z13, bool2, c9598e2);
    }

    public static final /* synthetic */ void write$Self$universal_checkout_release(CheckoutFooterModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.disclaimer);
        output.encodeStringElement(serialDesc, 1, self.ctaText);
        output.encodeStringElement(serialDesc, 2, self.checkoutPath);
        output.encodeStringElement(serialDesc, 3, self.cartId);
        output.encodeBooleanElement(serialDesc, 4, self.isEnabled);
        output.encodeNullableSerializableElement(serialDesc, 5, BooleanSerializer.INSTANCE, self.skipStripeCheckout);
        output.encodeNullableSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.postCheckoutNavigation);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDisclaimer() {
        return this.disclaimer;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCtaText() {
        return this.ctaText;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCheckoutPath() {
        return this.checkoutPath;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCartId() {
        return this.cartId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getSkipStripeCheckout() {
        return this.skipStripeCheckout;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final C9598e getPostCheckoutNavigation() {
        return this.postCheckoutNavigation;
    }

    public final CheckoutFooterModel copy(String disclaimer, String ctaText, String checkoutPath, String cartId, boolean isEnabled, Boolean skipStripeCheckout, C9598e postCheckoutNavigation) {
        AbstractC22676k.m65750j(disclaimer, "disclaimer");
        AbstractC22676k.m65750j(ctaText, "ctaText");
        AbstractC22676k.m65750j(checkoutPath, "checkoutPath");
        AbstractC22676k.m65750j(cartId, "cartId");
        return new CheckoutFooterModel(disclaimer, ctaText, checkoutPath, cartId, isEnabled, skipStripeCheckout, postCheckoutNavigation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckoutFooterModel)) {
            return false;
        }
        CheckoutFooterModel checkoutFooterModel = (CheckoutFooterModel) other;
        return AbstractC22676k.m65745e(this.disclaimer, checkoutFooterModel.disclaimer) && AbstractC22676k.m65745e(this.ctaText, checkoutFooterModel.ctaText) && AbstractC22676k.m65745e(this.checkoutPath, checkoutFooterModel.checkoutPath) && AbstractC22676k.m65745e(this.cartId, checkoutFooterModel.cartId) && this.isEnabled == checkoutFooterModel.isEnabled && AbstractC22676k.m65745e(this.skipStripeCheckout, checkoutFooterModel.skipStripeCheckout) && AbstractC22676k.m65745e(this.postCheckoutNavigation, checkoutFooterModel.postCheckoutNavigation);
    }

    public final String getCartId() {
        return this.cartId;
    }

    public final String getCheckoutPath() {
        return this.checkoutPath;
    }

    public final String getCtaText() {
        return this.ctaText;
    }

    public final String getDisclaimer() {
        return this.disclaimer;
    }

    public final C9598e getPostCheckoutNavigation() {
        return this.postCheckoutNavigation;
    }

    public final Boolean getSkipStripeCheckout() {
        return this.skipStripeCheckout;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.disclaimer.hashCode() * 31, 31, this.ctaText), 31, this.checkoutPath), 31, this.cartId), 31, this.isEnabled);
        Boolean bool = this.skipStripeCheckout;
        int iHashCode = (iM8289b + (bool == null ? 0 : bool.hashCode())) * 31;
        C9598e c9598e = this.postCheckoutNavigation;
        return iHashCode + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public String toString() {
        String str = this.disclaimer;
        String str2 = this.ctaText;
        String str3 = this.checkoutPath;
        String str4 = this.cartId;
        boolean z4 = this.isEnabled;
        Boolean bool = this.skipStripeCheckout;
        C9598e c9598e = this.postCheckoutNavigation;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("CheckoutFooterModel(disclaimer=", str, ", ctaText=", str2, ", checkoutPath=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", cartId=", str4, ", isEnabled=");
        sbM32001t.append(z4);
        sbM32001t.append(", skipStripeCheckout=");
        sbM32001t.append(bool);
        sbM32001t.append(", postCheckoutNavigation=");
        return AbstractC33745d.m106656o(sbM32001t, c9598e, ")");
    }

    public CheckoutFooterModel(String disclaimer, String ctaText, String checkoutPath, String cartId, boolean z4, Boolean bool, C9598e c9598e) {
        AbstractC22676k.m65750j(disclaimer, "disclaimer");
        AbstractC22676k.m65750j(ctaText, "ctaText");
        AbstractC22676k.m65750j(checkoutPath, "checkoutPath");
        AbstractC22676k.m65750j(cartId, "cartId");
        this.disclaimer = disclaimer;
        this.ctaText = ctaText;
        this.checkoutPath = checkoutPath;
        this.cartId = cartId;
        this.isEnabled = z4;
        this.skipStripeCheckout = bool;
        this.postCheckoutNavigation = c9598e;
    }
}
