package com.whoop.universalcheckout.features.cart.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
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
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ0\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001aJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u001a¨\u0006+"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/cart/domain/models/UpdateCartQuantityRequest;", "", "", "cartId", "lineItemId", "", "quantity", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$universal_checkout_release", "(Lcom/whoop/universalcheckout/features/cart/domain/models/UpdateCartQuantityRequest;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;I)Lcom/whoop/universalcheckout/features/cart/domain/models/UpdateCartQuantityRequest;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCartId", "getLineItemId", "I", "getQuantity", "Companion", "$serializer", "a", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class UpdateCartQuantityRequest {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String cartId;
    private final String lineItemId;
    private final int quantity;

    /* JADX INFO: renamed from: com.whoop.universalcheckout.features.cart.domain.models.UpdateCartQuantityRequest$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/cart/domain/models/UpdateCartQuantityRequest$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/universalcheckout/features/cart/domain/models/UpdateCartQuantityRequest;", "serializer", "()Lwc3/c;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return UpdateCartQuantityRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ UpdateCartQuantityRequest(int i13, String str, String str2, int i14, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, UpdateCartQuantityRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.cartId = str;
        this.lineItemId = str2;
        this.quantity = i14;
    }

    public static /* synthetic */ UpdateCartQuantityRequest copy$default(UpdateCartQuantityRequest updateCartQuantityRequest, String str, String str2, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = updateCartQuantityRequest.cartId;
        }
        if ((i14 & 2) != 0) {
            str2 = updateCartQuantityRequest.lineItemId;
        }
        if ((i14 & 4) != 0) {
            i13 = updateCartQuantityRequest.quantity;
        }
        return updateCartQuantityRequest.copy(str, str2, i13);
    }

    public static final /* synthetic */ void write$Self$universal_checkout_release(UpdateCartQuantityRequest self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.cartId);
        output.encodeStringElement(serialDesc, 1, self.lineItemId);
        output.encodeIntElement(serialDesc, 2, self.quantity);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCartId() {
        return this.cartId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLineItemId() {
        return this.lineItemId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    public final UpdateCartQuantityRequest copy(String cartId, String lineItemId, int quantity) {
        AbstractC22676k.m65750j(lineItemId, "lineItemId");
        return new UpdateCartQuantityRequest(cartId, lineItemId, quantity);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateCartQuantityRequest)) {
            return false;
        }
        UpdateCartQuantityRequest updateCartQuantityRequest = (UpdateCartQuantityRequest) other;
        return AbstractC22676k.m65745e(this.cartId, updateCartQuantityRequest.cartId) && AbstractC22676k.m65745e(this.lineItemId, updateCartQuantityRequest.lineItemId) && this.quantity == updateCartQuantityRequest.quantity;
    }

    public final String getCartId() {
        return this.cartId;
    }

    public final String getLineItemId() {
        return this.lineItemId;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public int hashCode() {
        String str = this.cartId;
        return Integer.hashCode(this.quantity) + AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.lineItemId);
    }

    public String toString() {
        String str = this.cartId;
        String str2 = this.lineItemId;
        return AbstractC18489d0.m53371l(AbstractC11895b.m32001t("UpdateCartQuantityRequest(cartId=", str, ", lineItemId=", str2, ", quantity="), this.quantity, ")");
    }

    public UpdateCartQuantityRequest(String str, String lineItemId, int i13) {
        AbstractC22676k.m65750j(lineItemId, "lineItemId");
        this.cartId = str;
        this.lineItemId = lineItemId;
        this.quantity = i13;
    }
}
