package com.whoop.nativestore.home.domain.model;

import com.whoop.design.models.items.CountrySelectorModel;
import com.whoop.design.models.items.CountrySelectorModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import rx0.C31901f;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;<BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBS\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b%\u0010&JN\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u001eJ\u0010\u0010*\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b3\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b5\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b7\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00108\u001a\u0004\b9\u0010&¨\u0006="}, m65681d2 = {"Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;", "", "", "navigationBarText", "", "Lcom/whoop/nativestore/home/domain/model/NativeStoreSection;", "sections", "Lcom/whoop/nativestore/home/domain/model/CartIndicator;", "cart", "Lcom/whoop/design/models/items/CountrySelectorModel;", "countrySelector", "Lcom/whoop/nativestore/home/domain/model/CheckoutFooter;", "checkoutFooter", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/nativestore/home/domain/model/CartIndicator;Lcom/whoop/design/models/items/CountrySelectorModel;Lcom/whoop/nativestore/home/domain/model/CheckoutFooter;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lcom/whoop/nativestore/home/domain/model/CartIndicator;Lcom/whoop/design/models/items/CountrySelectorModel;Lcom/whoop/nativestore/home/domain/model/CheckoutFooter;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$native_store_release", "(Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/whoop/nativestore/home/domain/model/CartIndicator;", "component4", "()Lcom/whoop/design/models/items/CountrySelectorModel;", "component5", "()Lcom/whoop/nativestore/home/domain/model/CheckoutFooter;", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/nativestore/home/domain/model/CartIndicator;Lcom/whoop/design/models/items/CountrySelectorModel;Lcom/whoop/nativestore/home/domain/model/CheckoutFooter;)Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNavigationBarText", "Ljava/util/List;", "getSections", "Lcom/whoop/nativestore/home/domain/model/CartIndicator;", "getCart", "Lcom/whoop/design/models/items/CountrySelectorModel;", "getCountrySelector", "Lcom/whoop/nativestore/home/domain/model/CheckoutFooter;", "getCheckoutFooter", "Companion", "$serializer", "a", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class NativeStoreResponse {
    private final CartIndicator cart;
    private final CheckoutFooter checkoutFooter;
    private final CountrySelectorModel countrySelector;
    private final String navigationBarText;
    private final List<NativeStoreSection> sections;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C31901f(8)), null, null, null};

    /* JADX INFO: renamed from: com.whoop.nativestore.home.domain.model.NativeStoreResponse$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;", "serializer", "()Lwc3/c;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return NativeStoreResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public NativeStoreResponse() {
        this((String) null, (List) null, (CartIndicator) null, (CountrySelectorModel) null, (CheckoutFooter) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(NativeStoreSection$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NativeStoreResponse copy$default(NativeStoreResponse nativeStoreResponse, String str, List list, CartIndicator cartIndicator, CountrySelectorModel countrySelectorModel, CheckoutFooter checkoutFooter, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = nativeStoreResponse.navigationBarText;
        }
        if ((i13 & 2) != 0) {
            list = nativeStoreResponse.sections;
        }
        if ((i13 & 4) != 0) {
            cartIndicator = nativeStoreResponse.cart;
        }
        if ((i13 & 8) != 0) {
            countrySelectorModel = nativeStoreResponse.countrySelector;
        }
        if ((i13 & 16) != 0) {
            checkoutFooter = nativeStoreResponse.checkoutFooter;
        }
        CheckoutFooter checkoutFooter2 = checkoutFooter;
        CartIndicator cartIndicator2 = cartIndicator;
        return nativeStoreResponse.copy(str, list, cartIndicator2, countrySelectorModel, checkoutFooter2);
    }

    public static final /* synthetic */ void write$Self$native_store_release(NativeStoreResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.navigationBarText, "")) {
            output.encodeStringElement(serialDesc, 0, self.navigationBarText);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.sections, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.sections);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.cart != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, CartIndicator$$serializer.INSTANCE, self.cart);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.countrySelector != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, CountrySelectorModel$$serializer.INSTANCE, self.countrySelector);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.checkoutFooter == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, CheckoutFooter$$serializer.INSTANCE, self.checkoutFooter);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNavigationBarText() {
        return this.navigationBarText;
    }

    public final List<NativeStoreSection> component2() {
        return this.sections;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CartIndicator getCart() {
        return this.cart;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final CountrySelectorModel getCountrySelector() {
        return this.countrySelector;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final CheckoutFooter getCheckoutFooter() {
        return this.checkoutFooter;
    }

    public final NativeStoreResponse copy(String navigationBarText, List<NativeStoreSection> sections, CartIndicator cart, CountrySelectorModel countrySelector, CheckoutFooter checkoutFooter) {
        AbstractC22676k.m65750j(navigationBarText, "navigationBarText");
        AbstractC22676k.m65750j(sections, "sections");
        return new NativeStoreResponse(navigationBarText, sections, cart, countrySelector, checkoutFooter);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NativeStoreResponse)) {
            return false;
        }
        NativeStoreResponse nativeStoreResponse = (NativeStoreResponse) other;
        return AbstractC22676k.m65745e(this.navigationBarText, nativeStoreResponse.navigationBarText) && AbstractC22676k.m65745e(this.sections, nativeStoreResponse.sections) && AbstractC22676k.m65745e(this.cart, nativeStoreResponse.cart) && AbstractC22676k.m65745e(this.countrySelector, nativeStoreResponse.countrySelector) && AbstractC22676k.m65745e(this.checkoutFooter, nativeStoreResponse.checkoutFooter);
    }

    public final CartIndicator getCart() {
        return this.cart;
    }

    public final CheckoutFooter getCheckoutFooter() {
        return this.checkoutFooter;
    }

    public final CountrySelectorModel getCountrySelector() {
        return this.countrySelector;
    }

    public final String getNavigationBarText() {
        return this.navigationBarText;
    }

    public final List<NativeStoreSection> getSections() {
        return this.sections;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.navigationBarText.hashCode() * 31, 31, this.sections);
        CartIndicator cartIndicator = this.cart;
        int iHashCode = (iM31983b + (cartIndicator == null ? 0 : cartIndicator.hashCode())) * 31;
        CountrySelectorModel countrySelectorModel = this.countrySelector;
        int iHashCode2 = (iHashCode + (countrySelectorModel == null ? 0 : countrySelectorModel.hashCode())) * 31;
        CheckoutFooter checkoutFooter = this.checkoutFooter;
        return iHashCode2 + (checkoutFooter != null ? checkoutFooter.hashCode() : 0);
    }

    public String toString() {
        String str = this.navigationBarText;
        List<NativeStoreSection> list = this.sections;
        CartIndicator cartIndicator = this.cart;
        CountrySelectorModel countrySelectorModel = this.countrySelector;
        CheckoutFooter checkoutFooter = this.checkoutFooter;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("NativeStoreResponse(navigationBarText=", str, ", sections=", ", cart=", list);
        sbM94766o.append(cartIndicator);
        sbM94766o.append(", countrySelector=");
        sbM94766o.append(countrySelectorModel);
        sbM94766o.append(", checkoutFooter=");
        sbM94766o.append(checkoutFooter);
        sbM94766o.append(")");
        return sbM94766o.toString();
    }

    public /* synthetic */ NativeStoreResponse(int i13, String str, List list, CartIndicator cartIndicator, CountrySelectorModel countrySelectorModel, CheckoutFooter checkoutFooter, SerializationConstructorMarker serializationConstructorMarker) {
        this.navigationBarText = (i13 & 1) == 0 ? "" : str;
        if ((i13 & 2) == 0) {
            this.sections = C25271y.f99162w;
        } else {
            this.sections = list;
        }
        if ((i13 & 4) == 0) {
            this.cart = null;
        } else {
            this.cart = cartIndicator;
        }
        if ((i13 & 8) == 0) {
            this.countrySelector = null;
        } else {
            this.countrySelector = countrySelectorModel;
        }
        if ((i13 & 16) == 0) {
            this.checkoutFooter = null;
        } else {
            this.checkoutFooter = checkoutFooter;
        }
    }

    public NativeStoreResponse(String navigationBarText, List<NativeStoreSection> sections, CartIndicator cartIndicator, CountrySelectorModel countrySelectorModel, CheckoutFooter checkoutFooter) {
        AbstractC22676k.m65750j(navigationBarText, "navigationBarText");
        AbstractC22676k.m65750j(sections, "sections");
        this.navigationBarText = navigationBarText;
        this.sections = sections;
        this.cart = cartIndicator;
        this.countrySelector = countrySelectorModel;
        this.checkoutFooter = checkoutFooter;
    }

    public /* synthetic */ NativeStoreResponse(String str, List list, CartIndicator cartIndicator, CountrySelectorModel countrySelectorModel, CheckoutFooter checkoutFooter, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? C25271y.f99162w : list, (i13 & 4) != 0 ? null : cartIndicator, (i13 & 8) != 0 ? null : countrySelectorModel, (i13 & 16) != 0 ? null : checkoutFooter);
    }
}
