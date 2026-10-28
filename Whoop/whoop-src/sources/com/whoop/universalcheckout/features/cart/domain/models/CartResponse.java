package com.whoop.universalcheckout.features.cart.domain.models;

import bo2.C3509a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000245B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bBS\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJL\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b/\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u0010 R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b2\u0010\u001b¨\u00066"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;", "", "", "title", "", "Lcom/whoop/universalcheckout/features/cart/domain/models/CartSection;", "sections", "cartId", "checkoutFooter", "analyticsSubtotalValue", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/universalcheckout/features/cart/domain/models/CartSection;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/universalcheckout/features/cart/domain/models/CartSection;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$universal_checkout_release", "(Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "()Lcom/whoop/universalcheckout/features/cart/domain/models/CartSection;", "component5", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/universalcheckout/features/cart/domain/models/CartSection;Ljava/lang/String;)Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getSections", "getCartId", "Lcom/whoop/universalcheckout/features/cart/domain/models/CartSection;", "getCheckoutFooter", "getAnalyticsSubtotalValue", "Companion", "$serializer", "a", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CartResponse {
    private final String analyticsSubtotalValue;
    private final String cartId;
    private final CartSection checkoutFooter;
    private final List<CartSection> sections;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C3509a(0)), null, null, null};

    /* JADX INFO: renamed from: com.whoop.universalcheckout.features.cart.domain.models.CartResponse$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;", "serializer", "()Lwc3/c;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CartResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CartResponse(int i13, String str, List list, String str2, CartSection cartSection, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (29 != (i13 & 29)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 29, CartResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        if ((i13 & 2) == 0) {
            this.sections = C25271y.f99162w;
        } else {
            this.sections = list;
        }
        this.cartId = str2;
        this.checkoutFooter = cartSection;
        this.analyticsSubtotalValue = str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(CartSection$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CartResponse copy$default(CartResponse cartResponse, String str, List list, String str2, CartSection cartSection, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = cartResponse.title;
        }
        if ((i13 & 2) != 0) {
            list = cartResponse.sections;
        }
        if ((i13 & 4) != 0) {
            str2 = cartResponse.cartId;
        }
        if ((i13 & 8) != 0) {
            cartSection = cartResponse.checkoutFooter;
        }
        if ((i13 & 16) != 0) {
            str3 = cartResponse.analyticsSubtotalValue;
        }
        String str4 = str3;
        String str5 = str2;
        return cartResponse.copy(str, list, str5, cartSection, str4);
    }

    public static final /* synthetic */ void write$Self$universal_checkout_release(CartResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.sections, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.sections);
        }
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.cartId);
        output.encodeNullableSerializableElement(serialDesc, 3, CartSection$$serializer.INSTANCE, self.checkoutFooter);
        output.encodeStringElement(serialDesc, 4, self.analyticsSubtotalValue);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<CartSection> component2() {
        return this.sections;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCartId() {
        return this.cartId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final CartSection getCheckoutFooter() {
        return this.checkoutFooter;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAnalyticsSubtotalValue() {
        return this.analyticsSubtotalValue;
    }

    public final CartResponse copy(String title, List<CartSection> sections, String cartId, CartSection checkoutFooter, String analyticsSubtotalValue) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(sections, "sections");
        AbstractC22676k.m65750j(analyticsSubtotalValue, "analyticsSubtotalValue");
        return new CartResponse(title, sections, cartId, checkoutFooter, analyticsSubtotalValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartResponse)) {
            return false;
        }
        CartResponse cartResponse = (CartResponse) other;
        return AbstractC22676k.m65745e(this.title, cartResponse.title) && AbstractC22676k.m65745e(this.sections, cartResponse.sections) && AbstractC22676k.m65745e(this.cartId, cartResponse.cartId) && AbstractC22676k.m65745e(this.checkoutFooter, cartResponse.checkoutFooter) && AbstractC22676k.m65745e(this.analyticsSubtotalValue, cartResponse.analyticsSubtotalValue);
    }

    public final String getAnalyticsSubtotalValue() {
        return this.analyticsSubtotalValue;
    }

    public final String getCartId() {
        return this.cartId;
    }

    public final CartSection getCheckoutFooter() {
        return this.checkoutFooter;
    }

    public final List<CartSection> getSections() {
        return this.sections;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.title.hashCode() * 31, 31, this.sections);
        String str = this.cartId;
        int iHashCode = (iM31983b + (str == null ? 0 : str.hashCode())) * 31;
        CartSection cartSection = this.checkoutFooter;
        return this.analyticsSubtotalValue.hashCode() + ((iHashCode + (cartSection != null ? cartSection.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.title;
        List<CartSection> list = this.sections;
        String str2 = this.cartId;
        CartSection cartSection = this.checkoutFooter;
        String str3 = this.analyticsSubtotalValue;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("CartResponse(title=", str, ", sections=", ", cartId=", list);
        sbM94766o.append(str2);
        sbM94766o.append(", checkoutFooter=");
        sbM94766o.append(cartSection);
        sbM94766o.append(", analyticsSubtotalValue=");
        return AbstractC25012a.m73376i(str3, ")", sbM94766o);
    }

    public CartResponse(String title, List<CartSection> sections, String str, CartSection cartSection, String analyticsSubtotalValue) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(sections, "sections");
        AbstractC22676k.m65750j(analyticsSubtotalValue, "analyticsSubtotalValue");
        this.title = title;
        this.sections = sections;
        this.cartId = str;
        this.checkoutFooter = cartSection;
        this.analyticsSubtotalValue = analyticsSubtotalValue;
    }

    public /* synthetic */ CartResponse(String str, List list, String str2, CartSection cartSection, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? C25271y.f99162w : list, str2, cartSection, str3);
    }
}
