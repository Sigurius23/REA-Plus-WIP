package com.whoop.navigation;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import j00.C21118u;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000245B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nBG\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J@\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010\u001bJ\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0019R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010+\u0012\u0004\b-\u0010*\u001a\u0004\b,\u0010\u001bR&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010.\u0012\u0004\b0\u0010*\u001a\u0004\b/\u0010\u001dR\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010'\u0012\u0004\b2\u0010*\u001a\u0004\b1\u0010\u0019¨\u00066"}, m65681d2 = {"Lcom/whoop/navigation/CartItem;", "", "", "sku", "", "quantity", "", "childItems", "engravingParams", "<init>", "(Ljava/lang/String;ILjava/util/List;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ILjava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$navigation_release", "(Lcom/whoop/navigation/CartItem;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "()Ljava/util/List;", "component4", "copy", "(Ljava/lang/String;ILjava/util/List;Ljava/lang/String;)Lcom/whoop/navigation/CartItem;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSku", "getSku$annotations", "()V", "I", "getQuantity", "getQuantity$annotations", "Ljava/util/List;", "getChildItems", "getChildItems$annotations", "getEngravingParams", "getEngravingParams$annotations", "Companion", "$serializer", "a", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CartItem {
    private final List<String> childItems;
    private final String engravingParams;
    private final int quantity;
    private final String sku;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C21118u(8)), null};

    /* JADX INFO: renamed from: com.whoop.navigation.CartItem$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/navigation/CartItem$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/navigation/CartItem;", "serializer", "()Lwc3/c;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CartItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CartItem(int i13, String str, int i14, List list, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, CartItem$$serializer.INSTANCE.getDescriptor());
        }
        this.sku = str;
        this.quantity = i14;
        this.childItems = list;
        this.engravingParams = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CartItem copy$default(CartItem cartItem, String str, int i13, List list, String str2, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = cartItem.sku;
        }
        if ((i14 & 2) != 0) {
            i13 = cartItem.quantity;
        }
        if ((i14 & 4) != 0) {
            list = cartItem.childItems;
        }
        if ((i14 & 8) != 0) {
            str2 = cartItem.engravingParams;
        }
        return cartItem.copy(str, i13, list, str2);
    }

    @InterfaceC37143h("child_items")
    public static /* synthetic */ void getChildItems$annotations() {
    }

    @InterfaceC37143h("engraving_params")
    public static /* synthetic */ void getEngravingParams$annotations() {
    }

    @InterfaceC37143h("quantity")
    public static /* synthetic */ void getQuantity$annotations() {
    }

    @InterfaceC37143h("sku")
    public static /* synthetic */ void getSku$annotations() {
    }

    public static final /* synthetic */ void write$Self$navigation_release(CartItem self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.sku);
        output.encodeIntElement(serialDesc, 1, self.quantity);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.childItems);
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.engravingParams);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSku() {
        return this.sku;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    public final List<String> component3() {
        return this.childItems;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEngravingParams() {
        return this.engravingParams;
    }

    public final CartItem copy(String sku, int quantity, List<String> childItems, String engravingParams) {
        AbstractC22676k.m65750j(sku, "sku");
        AbstractC22676k.m65750j(childItems, "childItems");
        return new CartItem(sku, quantity, childItems, engravingParams);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartItem)) {
            return false;
        }
        CartItem cartItem = (CartItem) other;
        return AbstractC22676k.m65745e(this.sku, cartItem.sku) && this.quantity == cartItem.quantity && AbstractC22676k.m65745e(this.childItems, cartItem.childItems) && AbstractC22676k.m65745e(this.engravingParams, cartItem.engravingParams);
    }

    public final List<String> getChildItems() {
        return this.childItems;
    }

    public final String getEngravingParams() {
        return this.engravingParams;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public final String getSku() {
        return this.sku;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(AbstractC11266d.m30448b(this.quantity, this.sku.hashCode() * 31, 31), 31, this.childItems);
        String str = this.engravingParams;
        return iM31983b + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.sku;
        int i13 = this.quantity;
        return AbstractC38963t7.m124377g(", engravingParams=", this.engravingParams, ")", AbstractC11266d.m30467u(i13, "CartItem(sku=", str, ", quantity=", ", childItems="), this.childItems);
    }

    public CartItem(String sku, int i13, List<String> childItems, String str) {
        AbstractC22676k.m65750j(sku, "sku");
        AbstractC22676k.m65750j(childItems, "childItems");
        this.sku = sku;
        this.quantity = i13;
        this.childItems = childItems;
        this.engravingParams = str;
    }
}
