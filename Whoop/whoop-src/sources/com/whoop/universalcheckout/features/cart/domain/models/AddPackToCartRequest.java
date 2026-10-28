package com.whoop.universalcheckout.features.cart.domain.models;

import bf2.C3201a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
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
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBI\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J@\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b,\u0010\u0019¨\u00060"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/cart/domain/models/AddPackToCartRequest;", "", "", "cartId", "packSku", "", "childItemSkus", "storeDomain", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$universal_checkout_release", "(Lcom/whoop/universalcheckout/features/cart/domain/models/AddPackToCartRequest;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/whoop/universalcheckout/features/cart/domain/models/AddPackToCartRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCartId", "getPackSku", "Ljava/util/List;", "getChildItemSkus", "getStoreDomain", "Companion", "$serializer", "a", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AddPackToCartRequest {
    private final String cartId;
    private final List<String> childItemSkus;
    private final String packSku;
    private final String storeDomain;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C3201a(28)), null};

    /* JADX INFO: renamed from: com.whoop.universalcheckout.features.cart.domain.models.AddPackToCartRequest$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/cart/domain/models/AddPackToCartRequest$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/universalcheckout/features/cart/domain/models/AddPackToCartRequest;", "serializer", "()Lwc3/c;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AddPackToCartRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ AddPackToCartRequest(int i13, String str, String str2, List list, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, AddPackToCartRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.cartId = str;
        this.packSku = str2;
        this.childItemSkus = list;
        this.storeDomain = str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddPackToCartRequest copy$default(AddPackToCartRequest addPackToCartRequest, String str, String str2, List list, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = addPackToCartRequest.cartId;
        }
        if ((i13 & 2) != 0) {
            str2 = addPackToCartRequest.packSku;
        }
        if ((i13 & 4) != 0) {
            list = addPackToCartRequest.childItemSkus;
        }
        if ((i13 & 8) != 0) {
            str3 = addPackToCartRequest.storeDomain;
        }
        return addPackToCartRequest.copy(str, str2, list, str3);
    }

    public static final /* synthetic */ void write$Self$universal_checkout_release(AddPackToCartRequest self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.cartId);
        output.encodeStringElement(serialDesc, 1, self.packSku);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.childItemSkus);
        output.encodeStringElement(serialDesc, 3, self.storeDomain);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCartId() {
        return this.cartId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPackSku() {
        return this.packSku;
    }

    public final List<String> component3() {
        return this.childItemSkus;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStoreDomain() {
        return this.storeDomain;
    }

    public final AddPackToCartRequest copy(String cartId, String packSku, List<String> childItemSkus, String storeDomain) {
        AbstractC22676k.m65750j(packSku, "packSku");
        AbstractC22676k.m65750j(childItemSkus, "childItemSkus");
        AbstractC22676k.m65750j(storeDomain, "storeDomain");
        return new AddPackToCartRequest(cartId, packSku, childItemSkus, storeDomain);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddPackToCartRequest)) {
            return false;
        }
        AddPackToCartRequest addPackToCartRequest = (AddPackToCartRequest) other;
        return AbstractC22676k.m65745e(this.cartId, addPackToCartRequest.cartId) && AbstractC22676k.m65745e(this.packSku, addPackToCartRequest.packSku) && AbstractC22676k.m65745e(this.childItemSkus, addPackToCartRequest.childItemSkus) && AbstractC22676k.m65745e(this.storeDomain, addPackToCartRequest.storeDomain);
    }

    public final String getCartId() {
        return this.cartId;
    }

    public final List<String> getChildItemSkus() {
        return this.childItemSkus;
    }

    public final String getPackSku() {
        return this.packSku;
    }

    public final String getStoreDomain() {
        return this.storeDomain;
    }

    public int hashCode() {
        String str = this.cartId;
        return this.storeDomain.hashCode() + AbstractC11895b.m31983b(AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.packSku), 31, this.childItemSkus);
    }

    public String toString() {
        String str = this.cartId;
        String str2 = this.packSku;
        return AbstractC38963t7.m124377g(", storeDomain=", this.storeDomain, ")", AbstractC11895b.m32001t("AddPackToCartRequest(cartId=", str, ", packSku=", str2, ", childItemSkus="), this.childItemSkus);
    }

    public AddPackToCartRequest(String str, String packSku, List<String> childItemSkus, String storeDomain) {
        AbstractC22676k.m65750j(packSku, "packSku");
        AbstractC22676k.m65750j(childItemSkus, "childItemSkus");
        AbstractC22676k.m65750j(storeDomain, "storeDomain");
        this.cartId = str;
        this.packSku = packSku;
        this.childItemSkus = childItemSkus;
        this.storeDomain = storeDomain;
    }
}
