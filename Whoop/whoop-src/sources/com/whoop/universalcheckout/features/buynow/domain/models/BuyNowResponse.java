package com.whoop.universalcheckout.features.buynow.domain.models;

import com.whoop.navigation.C9598e;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import nh3.AbstractC26725a;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import tb0.C33691b;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002@ABS\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBg\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001fJ\u0012\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001fJ\u0012\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b(\u0010)Jh\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u001fJ\u0010\u0010-\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u001fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b6\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b8\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b9\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\b;\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b<\u0010\u001fR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\b>\u0010)¨\u0006B"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;", "", "", "title", "", "Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;", "sections", "checkoutFooter", "analyticsSubtotalValue", "Lcom/whoop/navigation/e;", "checkoutDestination", "paymentMethodId", "Lcom/whoop/navigation/models/GenericInteraction;", "genericInteraction", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$universal_checkout_release", "(Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;", "component4", "component5", "()Lcom/whoop/navigation/e;", "component6", "component7", "()Lcom/whoop/navigation/models/GenericInteraction;", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getSections", "Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;", "getCheckoutFooter", "getAnalyticsSubtotalValue", "Lcom/whoop/navigation/e;", "getCheckoutDestination", "getPaymentMethodId", "Lcom/whoop/navigation/models/GenericInteraction;", "getGenericInteraction", "Companion", "$serializer", "a", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class BuyNowResponse {
    private static final InterfaceC23462h[] $childSerializers;
    private final String analyticsSubtotalValue;
    private final C9598e checkoutDestination;
    private final BuyNowSection checkoutFooter;
    private final GenericInteraction genericInteraction;
    private final String paymentMethodId;
    private final List<BuyNowSection> sections;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.universalcheckout.features.buynow.domain.models.BuyNowResponse$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;", "serializer", "()Lwc3/c;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return BuyNowResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C33691b(19)), null, null, AbstractC30060g.m92087G(enumC23463i, new C33691b(20)), null, null};
    }

    public /* synthetic */ BuyNowResponse(int i13, String str, List list, BuyNowSection buyNowSection, String str2, C9598e c9598e, String str3, GenericInteraction genericInteraction, SerializationConstructorMarker serializationConstructorMarker) {
        if (125 != (i13 & 125)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 125, BuyNowResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        if ((i13 & 2) == 0) {
            this.sections = C25271y.f99162w;
        } else {
            this.sections = list;
        }
        this.checkoutFooter = buyNowSection;
        this.analyticsSubtotalValue = str2;
        this.checkoutDestination = c9598e;
        this.paymentMethodId = str3;
        this.genericInteraction = genericInteraction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(BuyNowSection$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BuyNowResponse copy$default(BuyNowResponse buyNowResponse, String str, List list, BuyNowSection buyNowSection, String str2, C9598e c9598e, String str3, GenericInteraction genericInteraction, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = buyNowResponse.title;
        }
        if ((i13 & 2) != 0) {
            list = buyNowResponse.sections;
        }
        if ((i13 & 4) != 0) {
            buyNowSection = buyNowResponse.checkoutFooter;
        }
        if ((i13 & 8) != 0) {
            str2 = buyNowResponse.analyticsSubtotalValue;
        }
        if ((i13 & 16) != 0) {
            c9598e = buyNowResponse.checkoutDestination;
        }
        if ((i13 & 32) != 0) {
            str3 = buyNowResponse.paymentMethodId;
        }
        if ((i13 & 64) != 0) {
            genericInteraction = buyNowResponse.genericInteraction;
        }
        String str4 = str3;
        GenericInteraction genericInteraction2 = genericInteraction;
        C9598e c9598e2 = c9598e;
        BuyNowSection buyNowSection2 = buyNowSection;
        return buyNowResponse.copy(str, list, buyNowSection2, str2, c9598e2, str4, genericInteraction2);
    }

    public static final /* synthetic */ void write$Self$universal_checkout_release(BuyNowResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.title);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.sections, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.sections);
        }
        output.encodeNullableSerializableElement(serialDesc, 2, BuyNowSection$$serializer.INSTANCE, self.checkoutFooter);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.analyticsSubtotalValue);
        output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.checkoutDestination);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.paymentMethodId);
        output.encodeNullableSerializableElement(serialDesc, 6, GenericInteraction$$serializer.INSTANCE, self.genericInteraction);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<BuyNowSection> component2() {
        return this.sections;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BuyNowSection getCheckoutFooter() {
        return this.checkoutFooter;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAnalyticsSubtotalValue() {
        return this.analyticsSubtotalValue;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final C9598e getCheckoutDestination() {
        return this.checkoutDestination;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final GenericInteraction getGenericInteraction() {
        return this.genericInteraction;
    }

    public final BuyNowResponse copy(String title, List<BuyNowSection> sections, BuyNowSection checkoutFooter, String analyticsSubtotalValue, C9598e checkoutDestination, String paymentMethodId, GenericInteraction genericInteraction) {
        AbstractC22676k.m65750j(sections, "sections");
        return new BuyNowResponse(title, sections, checkoutFooter, analyticsSubtotalValue, checkoutDestination, paymentMethodId, genericInteraction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BuyNowResponse)) {
            return false;
        }
        BuyNowResponse buyNowResponse = (BuyNowResponse) other;
        return AbstractC22676k.m65745e(this.title, buyNowResponse.title) && AbstractC22676k.m65745e(this.sections, buyNowResponse.sections) && AbstractC22676k.m65745e(this.checkoutFooter, buyNowResponse.checkoutFooter) && AbstractC22676k.m65745e(this.analyticsSubtotalValue, buyNowResponse.analyticsSubtotalValue) && AbstractC22676k.m65745e(this.checkoutDestination, buyNowResponse.checkoutDestination) && AbstractC22676k.m65745e(this.paymentMethodId, buyNowResponse.paymentMethodId) && AbstractC22676k.m65745e(this.genericInteraction, buyNowResponse.genericInteraction);
    }

    public final String getAnalyticsSubtotalValue() {
        return this.analyticsSubtotalValue;
    }

    public final C9598e getCheckoutDestination() {
        return this.checkoutDestination;
    }

    public final BuyNowSection getCheckoutFooter() {
        return this.checkoutFooter;
    }

    public final GenericInteraction getGenericInteraction() {
        return this.genericInteraction;
    }

    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    public final List<BuyNowSection> getSections() {
        return this.sections;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iM31983b = AbstractC11895b.m31983b((str == null ? 0 : str.hashCode()) * 31, 31, this.sections);
        BuyNowSection buyNowSection = this.checkoutFooter;
        int iHashCode = (iM31983b + (buyNowSection == null ? 0 : buyNowSection.hashCode())) * 31;
        String str2 = this.analyticsSubtotalValue;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        C9598e c9598e = this.checkoutDestination;
        int iHashCode3 = (iHashCode2 + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        String str3 = this.paymentMethodId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        GenericInteraction genericInteraction = this.genericInteraction;
        return iHashCode4 + (genericInteraction != null ? genericInteraction.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        List<BuyNowSection> list = this.sections;
        BuyNowSection buyNowSection = this.checkoutFooter;
        String str2 = this.analyticsSubtotalValue;
        C9598e c9598e = this.checkoutDestination;
        String str3 = this.paymentMethodId;
        GenericInteraction genericInteraction = this.genericInteraction;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("BuyNowResponse(title=", str, ", sections=", ", checkoutFooter=", list);
        sbM94766o.append(buyNowSection);
        sbM94766o.append(", analyticsSubtotalValue=");
        sbM94766o.append(str2);
        sbM94766o.append(", checkoutDestination=");
        sbM94766o.append(c9598e);
        sbM94766o.append(", paymentMethodId=");
        sbM94766o.append(str3);
        sbM94766o.append(", genericInteraction=");
        return AbstractC26725a.m79506j(sbM94766o, genericInteraction, ")");
    }

    public BuyNowResponse(String str, List<BuyNowSection> sections, BuyNowSection buyNowSection, String str2, C9598e c9598e, String str3, GenericInteraction genericInteraction) {
        AbstractC22676k.m65750j(sections, "sections");
        this.title = str;
        this.sections = sections;
        this.checkoutFooter = buyNowSection;
        this.analyticsSubtotalValue = str2;
        this.checkoutDestination = c9598e;
        this.paymentMethodId = str3;
        this.genericInteraction = genericInteraction;
    }

    public /* synthetic */ BuyNowResponse(String str, List list, BuyNowSection buyNowSection, String str2, C9598e c9598e, String str3, GenericInteraction genericInteraction, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? C25271y.f99162w : list, buyNowSection, str2, c9598e, str3, genericInteraction);
    }
}
