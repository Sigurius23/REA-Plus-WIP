package com.whoop.navigation;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import j02.C21137d0;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000289B=\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bBS\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b \u0010\u001dJP\u0010!\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u001bR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010.\u0012\u0004\b0\u0010-\u001a\u0004\b/\u0010\u001dR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010.\u0012\u0004\b2\u0010-\u001a\u0004\b1\u0010\u001dR\"\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010.\u0012\u0004\b4\u0010-\u001a\u0004\b3\u0010\u001dR\"\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010.\u0012\u0004\b6\u0010-\u001a\u0004\b5\u0010\u001d¨\u0006:"}, m65681d2 = {"Lcom/whoop/navigation/UniversalCheckoutPayload;", "", "", "Lcom/whoop/navigation/CartItem;", "cartItems", "", "storeDomain", "promoCode", "country", "source", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$navigation_release", "(Lcom/whoop/navigation/UniversalCheckoutPayload;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/navigation/UniversalCheckoutPayload;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getCartItems", "getCartItems$annotations", "()V", "Ljava/lang/String;", "getStoreDomain", "getStoreDomain$annotations", "getPromoCode", "getPromoCode$annotations", "getCountry", "getCountry$annotations", "getSource", "getSource$annotations", "Companion", "$serializer", "a", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class UniversalCheckoutPayload {
    private final List<CartItem> cartItems;
    private final String country;
    private final String promoCode;
    private final String source;
    private final String storeDomain;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C21137d0(28)), null, null, null, null};

    /* JADX INFO: renamed from: com.whoop.navigation.UniversalCheckoutPayload$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/navigation/UniversalCheckoutPayload$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/navigation/UniversalCheckoutPayload;", "serializer", "()Lwc3/c;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return UniversalCheckoutPayload$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ UniversalCheckoutPayload(int i13, List list, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, UniversalCheckoutPayload$$serializer.INSTANCE.getDescriptor());
        }
        this.cartItems = list;
        this.storeDomain = str;
        this.promoCode = str2;
        this.country = str3;
        this.source = str4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(CartItem$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UniversalCheckoutPayload copy$default(UniversalCheckoutPayload universalCheckoutPayload, List list, String str, String str2, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = universalCheckoutPayload.cartItems;
        }
        if ((i13 & 2) != 0) {
            str = universalCheckoutPayload.storeDomain;
        }
        if ((i13 & 4) != 0) {
            str2 = universalCheckoutPayload.promoCode;
        }
        if ((i13 & 8) != 0) {
            str3 = universalCheckoutPayload.country;
        }
        if ((i13 & 16) != 0) {
            str4 = universalCheckoutPayload.source;
        }
        String str5 = str4;
        String str6 = str2;
        return universalCheckoutPayload.copy(list, str, str6, str3, str5);
    }

    @InterfaceC37143h("cart_items")
    public static /* synthetic */ void getCartItems$annotations() {
    }

    @InterfaceC37143h("country")
    public static /* synthetic */ void getCountry$annotations() {
    }

    @InterfaceC37143h("promo_code")
    public static /* synthetic */ void getPromoCode$annotations() {
    }

    @InterfaceC37143h("source")
    public static /* synthetic */ void getSource$annotations() {
    }

    @InterfaceC37143h("store_domain")
    public static /* synthetic */ void getStoreDomain$annotations() {
    }

    public static final /* synthetic */ void write$Self$navigation_release(UniversalCheckoutPayload self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) $childSerializers[0].getValue(), self.cartItems);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.storeDomain);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.promoCode);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.country);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.source);
    }

    public final List<CartItem> component1() {
        return this.cartItems;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStoreDomain() {
        return this.storeDomain;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPromoCode() {
        return this.promoCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final UniversalCheckoutPayload copy(List<CartItem> cartItems, String storeDomain, String promoCode, String country, String source) {
        AbstractC22676k.m65750j(cartItems, "cartItems");
        return new UniversalCheckoutPayload(cartItems, storeDomain, promoCode, country, source);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UniversalCheckoutPayload)) {
            return false;
        }
        UniversalCheckoutPayload universalCheckoutPayload = (UniversalCheckoutPayload) other;
        return AbstractC22676k.m65745e(this.cartItems, universalCheckoutPayload.cartItems) && AbstractC22676k.m65745e(this.storeDomain, universalCheckoutPayload.storeDomain) && AbstractC22676k.m65745e(this.promoCode, universalCheckoutPayload.promoCode) && AbstractC22676k.m65745e(this.country, universalCheckoutPayload.country) && AbstractC22676k.m65745e(this.source, universalCheckoutPayload.source);
    }

    public final List<CartItem> getCartItems() {
        return this.cartItems;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getPromoCode() {
        return this.promoCode;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getStoreDomain() {
        return this.storeDomain;
    }

    public int hashCode() {
        int iHashCode = this.cartItems.hashCode() * 31;
        String str = this.storeDomain;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.promoCode;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.country;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.source;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        List<CartItem> list = this.cartItems;
        String str = this.storeDomain;
        String str2 = this.promoCode;
        String str3 = this.country;
        String str4 = this.source;
        StringBuilder sbM79507k = AbstractC26725a.m79507k("UniversalCheckoutPayload(cartItems=", ", storeDomain=", str, ", promoCode=", list);
        AbstractC11266d.m30444B(sbM79507k, str2, ", country=", str3, ", source=");
        return AbstractC25012a.m73376i(str4, ")", sbM79507k);
    }

    public UniversalCheckoutPayload(List<CartItem> cartItems, String str, String str2, String str3, String str4) {
        AbstractC22676k.m65750j(cartItems, "cartItems");
        this.cartItems = cartItems;
        this.storeDomain = str;
        this.promoCode = str2;
        this.country = str3;
        this.source = str4;
    }
}
