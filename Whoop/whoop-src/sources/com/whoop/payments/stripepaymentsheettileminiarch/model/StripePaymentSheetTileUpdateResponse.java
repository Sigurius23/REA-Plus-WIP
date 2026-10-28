package com.whoop.payments.stripepaymentsheettileminiarch.model;

import com.whoop.navigation.C9598e;
import com.whoop.payments.stripebottomsheettile.model.PaymentMethodMenuTileModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$%B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0015¨\u0006&"}, m65681d2 = {"Lcom/whoop/payments/stripepaymentsheettileminiarch/model/StripePaymentSheetTileUpdateResponse;", "", "Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;", "paymentMethodTile", "<init>", "(Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$payments_release", "(Lcom/whoop/payments/stripepaymentsheettileminiarch/model/StripePaymentSheetTileUpdateResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;", "copy", "(Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;)Lcom/whoop/payments/stripepaymentsheettileminiarch/model/StripePaymentSheetTileUpdateResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;", "getPaymentMethodTile", "Companion", "$serializer", "a", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class StripePaymentSheetTileUpdateResponse {
    private final PaymentMethodMenuTileModel paymentMethodTile;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d;

    /* JADX INFO: renamed from: com.whoop.payments.stripepaymentsheettileminiarch.model.StripePaymentSheetTileUpdateResponse$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/payments/stripepaymentsheettileminiarch/model/StripePaymentSheetTileUpdateResponse$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/payments/stripepaymentsheettileminiarch/model/StripePaymentSheetTileUpdateResponse;", "serializer", "()Lwc3/c;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return StripePaymentSheetTileUpdateResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ StripePaymentSheetTileUpdateResponse(int i13, PaymentMethodMenuTileModel paymentMethodMenuTileModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, StripePaymentSheetTileUpdateResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.paymentMethodTile = paymentMethodMenuTileModel;
    }

    public static /* synthetic */ StripePaymentSheetTileUpdateResponse copy$default(StripePaymentSheetTileUpdateResponse stripePaymentSheetTileUpdateResponse, PaymentMethodMenuTileModel paymentMethodMenuTileModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            paymentMethodMenuTileModel = stripePaymentSheetTileUpdateResponse.paymentMethodTile;
        }
        return stripePaymentSheetTileUpdateResponse.copy(paymentMethodMenuTileModel);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PaymentMethodMenuTileModel getPaymentMethodTile() {
        return this.paymentMethodTile;
    }

    public final StripePaymentSheetTileUpdateResponse copy(PaymentMethodMenuTileModel paymentMethodTile) {
        AbstractC22676k.m65750j(paymentMethodTile, "paymentMethodTile");
        return new StripePaymentSheetTileUpdateResponse(paymentMethodTile);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof StripePaymentSheetTileUpdateResponse) && AbstractC22676k.m65745e(this.paymentMethodTile, ((StripePaymentSheetTileUpdateResponse) other).paymentMethodTile);
    }

    public final PaymentMethodMenuTileModel getPaymentMethodTile() {
        return this.paymentMethodTile;
    }

    public int hashCode() {
        return this.paymentMethodTile.hashCode();
    }

    public String toString() {
        return "StripePaymentSheetTileUpdateResponse(paymentMethodTile=" + this.paymentMethodTile + ")";
    }

    public StripePaymentSheetTileUpdateResponse(PaymentMethodMenuTileModel paymentMethodTile) {
        AbstractC22676k.m65750j(paymentMethodTile, "paymentMethodTile");
        this.paymentMethodTile = paymentMethodTile;
    }
}
