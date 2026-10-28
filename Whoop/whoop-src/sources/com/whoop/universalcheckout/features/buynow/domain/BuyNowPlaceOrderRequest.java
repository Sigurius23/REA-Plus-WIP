package com.whoop.universalcheckout.features.buynow.domain;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
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
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J:\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b(\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b)\u0010\u0018¨\u0006-"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowPlaceOrderRequest;", "", "", "cartId", "paymentMethodId", "idempotencyKey", "session", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$universal_checkout_release", "(Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowPlaceOrderRequest;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowPlaceOrderRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCartId", "getPaymentMethodId", "getIdempotencyKey", "getSession", "Companion", "$serializer", "a", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class BuyNowPlaceOrderRequest {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String cartId;
    private final String idempotencyKey;
    private final String paymentMethodId;
    private final String session;

    /* JADX INFO: renamed from: com.whoop.universalcheckout.features.buynow.domain.BuyNowPlaceOrderRequest$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowPlaceOrderRequest$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowPlaceOrderRequest;", "serializer", "()Lwc3/c;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return BuyNowPlaceOrderRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ BuyNowPlaceOrderRequest(int i13, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, BuyNowPlaceOrderRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.cartId = str;
        this.paymentMethodId = str2;
        this.idempotencyKey = str3;
        this.session = str4;
    }

    public static /* synthetic */ BuyNowPlaceOrderRequest copy$default(BuyNowPlaceOrderRequest buyNowPlaceOrderRequest, String str, String str2, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = buyNowPlaceOrderRequest.cartId;
        }
        if ((i13 & 2) != 0) {
            str2 = buyNowPlaceOrderRequest.paymentMethodId;
        }
        if ((i13 & 4) != 0) {
            str3 = buyNowPlaceOrderRequest.idempotencyKey;
        }
        if ((i13 & 8) != 0) {
            str4 = buyNowPlaceOrderRequest.session;
        }
        return buyNowPlaceOrderRequest.copy(str, str2, str3, str4);
    }

    public static final /* synthetic */ void write$Self$universal_checkout_release(BuyNowPlaceOrderRequest self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.cartId);
        output.encodeStringElement(serialDesc, 1, self.paymentMethodId);
        output.encodeStringElement(serialDesc, 2, self.idempotencyKey);
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.session);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCartId() {
        return this.cartId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIdempotencyKey() {
        return this.idempotencyKey;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSession() {
        return this.session;
    }

    public final BuyNowPlaceOrderRequest copy(String cartId, String paymentMethodId, String idempotencyKey, String session) {
        AbstractC22676k.m65750j(cartId, "cartId");
        AbstractC22676k.m65750j(paymentMethodId, "paymentMethodId");
        AbstractC22676k.m65750j(idempotencyKey, "idempotencyKey");
        return new BuyNowPlaceOrderRequest(cartId, paymentMethodId, idempotencyKey, session);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BuyNowPlaceOrderRequest)) {
            return false;
        }
        BuyNowPlaceOrderRequest buyNowPlaceOrderRequest = (BuyNowPlaceOrderRequest) other;
        return AbstractC22676k.m65745e(this.cartId, buyNowPlaceOrderRequest.cartId) && AbstractC22676k.m65745e(this.paymentMethodId, buyNowPlaceOrderRequest.paymentMethodId) && AbstractC22676k.m65745e(this.idempotencyKey, buyNowPlaceOrderRequest.idempotencyKey) && AbstractC22676k.m65745e(this.session, buyNowPlaceOrderRequest.session);
    }

    public final String getCartId() {
        return this.cartId;
    }

    public final String getIdempotencyKey() {
        return this.idempotencyKey;
    }

    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    public final String getSession() {
        return this.session;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.cartId.hashCode() * 31, 31, this.paymentMethodId), 31, this.idempotencyKey);
        String str = this.session;
        return iM30450d + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.cartId;
        String str2 = this.paymentMethodId;
        return AbstractC11266d.m30464r(AbstractC11895b.m32001t("BuyNowPlaceOrderRequest(cartId=", str, ", paymentMethodId=", str2, ", idempotencyKey="), this.idempotencyKey, ", session=", this.session, ")");
    }

    public BuyNowPlaceOrderRequest(String cartId, String paymentMethodId, String idempotencyKey, String str) {
        AbstractC22676k.m65750j(cartId, "cartId");
        AbstractC22676k.m65750j(paymentMethodId, "paymentMethodId");
        AbstractC22676k.m65750j(idempotencyKey, "idempotencyKey");
        this.cartId = cartId;
        this.paymentMethodId = paymentMethodId;
        this.idempotencyKey = idempotencyKey;
        this.session = str;
    }
}
