package com.whoop.universalcheckout.features.buynow.domain.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J:\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b-\u0010\u0019¨\u00061"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowCheckoutInfoModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "totalLabel", "totalAmount", "Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowCheckoutInfoCtaModel;", "cta", "disclaimerText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowCheckoutInfoCtaModel;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowCheckoutInfoCtaModel;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$universal_checkout_release", "(Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowCheckoutInfoModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowCheckoutInfoCtaModel;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowCheckoutInfoCtaModel;Ljava/lang/String;)Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowCheckoutInfoModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTotalLabel", "getTotalAmount", "Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowCheckoutInfoCtaModel;", "getCta", "getDisclaimerText", "Companion", "$serializer", "a", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class BuyNowCheckoutInfoModel implements DesignSystemModel {
    private final BuyNowCheckoutInfoCtaModel cta;
    private final String disclaimerText;
    private final String totalAmount;
    private final String totalLabel;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d;

    /* JADX INFO: renamed from: com.whoop.universalcheckout.features.buynow.domain.models.items.BuyNowCheckoutInfoModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowCheckoutInfoModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowCheckoutInfoModel;", "serializer", "()Lwc3/c;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return BuyNowCheckoutInfoModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BuyNowCheckoutInfoModel() {
        this((String) null, (String) null, (BuyNowCheckoutInfoCtaModel) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BuyNowCheckoutInfoModel copy$default(BuyNowCheckoutInfoModel buyNowCheckoutInfoModel, String str, String str2, BuyNowCheckoutInfoCtaModel buyNowCheckoutInfoCtaModel, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = buyNowCheckoutInfoModel.totalLabel;
        }
        if ((i13 & 2) != 0) {
            str2 = buyNowCheckoutInfoModel.totalAmount;
        }
        if ((i13 & 4) != 0) {
            buyNowCheckoutInfoCtaModel = buyNowCheckoutInfoModel.cta;
        }
        if ((i13 & 8) != 0) {
            str3 = buyNowCheckoutInfoModel.disclaimerText;
        }
        return buyNowCheckoutInfoModel.copy(str, str2, buyNowCheckoutInfoCtaModel, str3);
    }

    public static final /* synthetic */ void write$Self$universal_checkout_release(BuyNowCheckoutInfoModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.totalLabel, "")) {
            output.encodeStringElement(serialDesc, 0, self.totalLabel);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.totalAmount, "")) {
            output.encodeStringElement(serialDesc, 1, self.totalAmount);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.cta != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, BuyNowCheckoutInfoCtaModel$$serializer.INSTANCE, self.cta);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && AbstractC22676k.m65745e(self.disclaimerText, "")) {
            return;
        }
        output.encodeStringElement(serialDesc, 3, self.disclaimerText);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTotalLabel() {
        return this.totalLabel;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTotalAmount() {
        return this.totalAmount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BuyNowCheckoutInfoCtaModel getCta() {
        return this.cta;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDisclaimerText() {
        return this.disclaimerText;
    }

    public final BuyNowCheckoutInfoModel copy(String totalLabel, String totalAmount, BuyNowCheckoutInfoCtaModel cta, String disclaimerText) {
        AbstractC22676k.m65750j(totalLabel, "totalLabel");
        AbstractC22676k.m65750j(totalAmount, "totalAmount");
        AbstractC22676k.m65750j(disclaimerText, "disclaimerText");
        return new BuyNowCheckoutInfoModel(totalLabel, totalAmount, cta, disclaimerText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BuyNowCheckoutInfoModel)) {
            return false;
        }
        BuyNowCheckoutInfoModel buyNowCheckoutInfoModel = (BuyNowCheckoutInfoModel) other;
        return AbstractC22676k.m65745e(this.totalLabel, buyNowCheckoutInfoModel.totalLabel) && AbstractC22676k.m65745e(this.totalAmount, buyNowCheckoutInfoModel.totalAmount) && AbstractC22676k.m65745e(this.cta, buyNowCheckoutInfoModel.cta) && AbstractC22676k.m65745e(this.disclaimerText, buyNowCheckoutInfoModel.disclaimerText);
    }

    public final BuyNowCheckoutInfoCtaModel getCta() {
        return this.cta;
    }

    public final String getDisclaimerText() {
        return this.disclaimerText;
    }

    public final String getTotalAmount() {
        return this.totalAmount;
    }

    public final String getTotalLabel() {
        return this.totalLabel;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.totalLabel.hashCode() * 31, 31, this.totalAmount);
        BuyNowCheckoutInfoCtaModel buyNowCheckoutInfoCtaModel = this.cta;
        return this.disclaimerText.hashCode() + ((iM30450d + (buyNowCheckoutInfoCtaModel == null ? 0 : buyNowCheckoutInfoCtaModel.hashCode())) * 31);
    }

    public String toString() {
        String str = this.totalLabel;
        String str2 = this.totalAmount;
        BuyNowCheckoutInfoCtaModel buyNowCheckoutInfoCtaModel = this.cta;
        String str3 = this.disclaimerText;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("BuyNowCheckoutInfoModel(totalLabel=", str, ", totalAmount=", str2, ", cta=");
        sbM32001t.append(buyNowCheckoutInfoCtaModel);
        sbM32001t.append(", disclaimerText=");
        sbM32001t.append(str3);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ BuyNowCheckoutInfoModel(int i13, String str, String str2, BuyNowCheckoutInfoCtaModel buyNowCheckoutInfoCtaModel, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.totalLabel = "";
        } else {
            this.totalLabel = str;
        }
        if ((i13 & 2) == 0) {
            this.totalAmount = "";
        } else {
            this.totalAmount = str2;
        }
        if ((i13 & 4) == 0) {
            this.cta = null;
        } else {
            this.cta = buyNowCheckoutInfoCtaModel;
        }
        if ((i13 & 8) == 0) {
            this.disclaimerText = "";
        } else {
            this.disclaimerText = str3;
        }
    }

    public BuyNowCheckoutInfoModel(String totalLabel, String totalAmount, BuyNowCheckoutInfoCtaModel buyNowCheckoutInfoCtaModel, String disclaimerText) {
        AbstractC22676k.m65750j(totalLabel, "totalLabel");
        AbstractC22676k.m65750j(totalAmount, "totalAmount");
        AbstractC22676k.m65750j(disclaimerText, "disclaimerText");
        this.totalLabel = totalLabel;
        this.totalAmount = totalAmount;
        this.cta = buyNowCheckoutInfoCtaModel;
        this.disclaimerText = disclaimerText;
    }

    public /* synthetic */ BuyNowCheckoutInfoModel(String str, String str2, BuyNowCheckoutInfoCtaModel buyNowCheckoutInfoCtaModel, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? null : buyNowCheckoutInfoCtaModel, (i13 & 8) != 0 ? "" : str3);
    }
}
