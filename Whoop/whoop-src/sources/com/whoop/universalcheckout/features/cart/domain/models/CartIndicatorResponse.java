package com.whoop.universalcheckout.features.cart.domain.models;

import bf2.C3201a;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0016J\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0018¨\u0006*"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/cart/domain/models/CartIndicatorResponse;", "", "", "cartIndicatorQuantity", "Lcom/whoop/navigation/e;", "destination", "<init>", "(ILcom/whoop/navigation/e;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$universal_checkout_release", "(Lcom/whoop/universalcheckout/features/cart/domain/models/CartIndicatorResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()I", "component2", "()Lcom/whoop/navigation/e;", "copy", "(ILcom/whoop/navigation/e;)Lcom/whoop/universalcheckout/features/cart/domain/models/CartIndicatorResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getCartIndicatorQuantity", "Lcom/whoop/navigation/e;", "getDestination", "Companion", "$serializer", "a", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CartIndicatorResponse {
    private final int cartIndicatorQuantity;
    private final C9598e destination;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C3201a(29))};

    /* JADX INFO: renamed from: com.whoop.universalcheckout.features.cart.domain.models.CartIndicatorResponse$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/cart/domain/models/CartIndicatorResponse$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/universalcheckout/features/cart/domain/models/CartIndicatorResponse;", "serializer", "()Lwc3/c;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CartIndicatorResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CartIndicatorResponse(int i13, int i14, C9598e c9598e, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i13 & 2)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 2, CartIndicatorResponse$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.cartIndicatorQuantity = 0;
        } else {
            this.cartIndicatorQuantity = i14;
        }
        this.destination = c9598e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ CartIndicatorResponse copy$default(CartIndicatorResponse cartIndicatorResponse, int i13, C9598e c9598e, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = cartIndicatorResponse.cartIndicatorQuantity;
        }
        if ((i14 & 2) != 0) {
            c9598e = cartIndicatorResponse.destination;
        }
        return cartIndicatorResponse.copy(i13, c9598e);
    }

    public static final /* synthetic */ void write$Self$universal_checkout_release(CartIndicatorResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.cartIndicatorQuantity != 0) {
            output.encodeIntElement(serialDesc, 0, self.cartIndicatorQuantity);
        }
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.destination);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCartIndicatorQuantity() {
        return this.cartIndicatorQuantity;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    public final CartIndicatorResponse copy(int cartIndicatorQuantity, C9598e destination) {
        AbstractC22676k.m65750j(destination, "destination");
        return new CartIndicatorResponse(cartIndicatorQuantity, destination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartIndicatorResponse)) {
            return false;
        }
        CartIndicatorResponse cartIndicatorResponse = (CartIndicatorResponse) other;
        return this.cartIndicatorQuantity == cartIndicatorResponse.cartIndicatorQuantity && AbstractC22676k.m65745e(this.destination, cartIndicatorResponse.destination);
    }

    public final int getCartIndicatorQuantity() {
        return this.cartIndicatorQuantity;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public int hashCode() {
        return this.destination.hashCode() + (Integer.hashCode(this.cartIndicatorQuantity) * 31);
    }

    public String toString() {
        return "CartIndicatorResponse(cartIndicatorQuantity=" + this.cartIndicatorQuantity + ", destination=" + this.destination + ")";
    }

    public CartIndicatorResponse(int i13, C9598e destination) {
        AbstractC22676k.m65750j(destination, "destination");
        this.cartIndicatorQuantity = i13;
        this.destination = destination;
    }

    public /* synthetic */ CartIndicatorResponse(int i13, C9598e c9598e, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 0 : i13, c9598e);
    }
}
