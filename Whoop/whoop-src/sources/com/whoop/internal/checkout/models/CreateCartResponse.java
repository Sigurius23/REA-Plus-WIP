package com.whoop.internal.checkout.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u001c\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0018¨\u0006&"}, m65681d2 = {"Lcom/whoop/internal/checkout/models/CreateCartResponse;", "", "Lcom/whoop/internal/checkout/models/PaymentPayload;", "paymentPayload", "<init>", "(Lcom/whoop/internal/checkout/models/PaymentPayload;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/internal/checkout/models/PaymentPayload;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$internal_tooling_release", "(Lcom/whoop/internal/checkout/models/CreateCartResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "", "getActualCartId", "()Ljava/lang/String;", "component1", "()Lcom/whoop/internal/checkout/models/PaymentPayload;", "copy", "(Lcom/whoop/internal/checkout/models/PaymentPayload;)Lcom/whoop/internal/checkout/models/CreateCartResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/internal/checkout/models/PaymentPayload;", "getPaymentPayload", "Companion", "$serializer", "internal-tooling_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CreateCartResponse {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final PaymentPayload paymentPayload;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/internal/checkout/models/CreateCartResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/internal/checkout/models/CreateCartResponse;", "serializer", "()Lwc3/c;", "internal-tooling_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CreateCartResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CreateCartResponse() {
        this((PaymentPayload) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ CreateCartResponse copy$default(CreateCartResponse createCartResponse, PaymentPayload paymentPayload, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            paymentPayload = createCartResponse.paymentPayload;
        }
        return createCartResponse.copy(paymentPayload);
    }

    public static final /* synthetic */ void write$Self$internal_tooling_release(CreateCartResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (!output.shouldEncodeElementDefault(serialDesc, 0) && self.paymentPayload == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 0, PaymentPayload$$serializer.INSTANCE, self.paymentPayload);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PaymentPayload getPaymentPayload() {
        return this.paymentPayload;
    }

    public final CreateCartResponse copy(PaymentPayload paymentPayload) {
        return new CreateCartResponse(paymentPayload);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CreateCartResponse) && AbstractC22676k.m65745e(this.paymentPayload, ((CreateCartResponse) other).paymentPayload);
    }

    public final String getActualCartId() {
        PaymentPayload paymentPayload = this.paymentPayload;
        if (paymentPayload != null) {
            return paymentPayload.getCartId();
        }
        return null;
    }

    public final PaymentPayload getPaymentPayload() {
        return this.paymentPayload;
    }

    public int hashCode() {
        PaymentPayload paymentPayload = this.paymentPayload;
        if (paymentPayload == null) {
            return 0;
        }
        return paymentPayload.hashCode();
    }

    public String toString() {
        return "CreateCartResponse(paymentPayload=" + this.paymentPayload + ")";
    }

    public /* synthetic */ CreateCartResponse(int i13, PaymentPayload paymentPayload, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.paymentPayload = null;
        } else {
            this.paymentPayload = paymentPayload;
        }
    }

    public CreateCartResponse(PaymentPayload paymentPayload) {
        this.paymentPayload = paymentPayload;
    }

    public /* synthetic */ CreateCartResponse(PaymentPayload paymentPayload, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : paymentPayload);
    }
}
