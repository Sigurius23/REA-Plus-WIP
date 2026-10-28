package com.whoop.universalcheckout.features.checkout.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJF\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00052\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b-\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b.\u0010\u001a¨\u00061"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/checkout/domain/models/ProcessCheckoutRequestBody;", "", "", "cartId", "paymentMethodId", "", "setupFutureUsage", "idempotencyKey", "session", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$universal_checkout_release", "(Lcom/whoop/universalcheckout/features/checkout/domain/models/ProcessCheckoutRequestBody;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Boolean;", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/universalcheckout/features/checkout/domain/models/ProcessCheckoutRequestBody;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCartId", "getPaymentMethodId", "Ljava/lang/Boolean;", "getSetupFutureUsage", "getIdempotencyKey", "getSession", "Companion", "$serializer", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ProcessCheckoutRequestBody {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String cartId;
    private final String idempotencyKey;
    private final String paymentMethodId;
    private final String session;
    private final Boolean setupFutureUsage;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/checkout/domain/models/ProcessCheckoutRequestBody$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/universalcheckout/features/checkout/domain/models/ProcessCheckoutRequestBody;", "serializer", "()Lwc3/c;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ProcessCheckoutRequestBody$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ProcessCheckoutRequestBody(int i13, String str, String str2, Boolean bool, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, ProcessCheckoutRequestBody$$serializer.INSTANCE.getDescriptor());
        }
        this.cartId = str;
        this.paymentMethodId = str2;
        this.setupFutureUsage = bool;
        this.idempotencyKey = str3;
        if ((i13 & 16) == 0) {
            this.session = null;
        } else {
            this.session = str4;
        }
    }

    public static /* synthetic */ ProcessCheckoutRequestBody copy$default(ProcessCheckoutRequestBody processCheckoutRequestBody, String str, String str2, Boolean bool, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = processCheckoutRequestBody.cartId;
        }
        if ((i13 & 2) != 0) {
            str2 = processCheckoutRequestBody.paymentMethodId;
        }
        if ((i13 & 4) != 0) {
            bool = processCheckoutRequestBody.setupFutureUsage;
        }
        if ((i13 & 8) != 0) {
            str3 = processCheckoutRequestBody.idempotencyKey;
        }
        if ((i13 & 16) != 0) {
            str4 = processCheckoutRequestBody.session;
        }
        String str5 = str4;
        Boolean bool2 = bool;
        return processCheckoutRequestBody.copy(str, str2, bool2, str3, str5);
    }

    public static final /* synthetic */ void write$Self$universal_checkout_release(ProcessCheckoutRequestBody self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.cartId);
        output.encodeStringElement(serialDesc, 1, self.paymentMethodId);
        output.encodeNullableSerializableElement(serialDesc, 2, BooleanSerializer.INSTANCE, self.setupFutureUsage);
        output.encodeStringElement(serialDesc, 3, self.idempotencyKey);
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.session == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.session);
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
    public final Boolean getSetupFutureUsage() {
        return this.setupFutureUsage;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIdempotencyKey() {
        return this.idempotencyKey;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSession() {
        return this.session;
    }

    public final ProcessCheckoutRequestBody copy(String cartId, String paymentMethodId, Boolean setupFutureUsage, String idempotencyKey, String session) {
        AbstractC22676k.m65750j(cartId, "cartId");
        AbstractC22676k.m65750j(paymentMethodId, "paymentMethodId");
        AbstractC22676k.m65750j(idempotencyKey, "idempotencyKey");
        return new ProcessCheckoutRequestBody(cartId, paymentMethodId, setupFutureUsage, idempotencyKey, session);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProcessCheckoutRequestBody)) {
            return false;
        }
        ProcessCheckoutRequestBody processCheckoutRequestBody = (ProcessCheckoutRequestBody) other;
        return AbstractC22676k.m65745e(this.cartId, processCheckoutRequestBody.cartId) && AbstractC22676k.m65745e(this.paymentMethodId, processCheckoutRequestBody.paymentMethodId) && AbstractC22676k.m65745e(this.setupFutureUsage, processCheckoutRequestBody.setupFutureUsage) && AbstractC22676k.m65745e(this.idempotencyKey, processCheckoutRequestBody.idempotencyKey) && AbstractC22676k.m65745e(this.session, processCheckoutRequestBody.session);
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

    public final Boolean getSetupFutureUsage() {
        return this.setupFutureUsage;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.cartId.hashCode() * 31, 31, this.paymentMethodId);
        Boolean bool = this.setupFutureUsage;
        int iM30450d2 = AbstractC11266d.m30450d((iM30450d + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.idempotencyKey);
        String str = this.session;
        return iM30450d2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.cartId;
        String str2 = this.paymentMethodId;
        Boolean bool = this.setupFutureUsage;
        String str3 = this.idempotencyKey;
        String str4 = this.session;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ProcessCheckoutRequestBody(cartId=", str, ", paymentMethodId=", str2, ", setupFutureUsage=");
        AbstractC13673n.m38576w(bool, ", idempotencyKey=", str3, ", session=", sbM32001t);
        return AbstractC25012a.m73376i(str4, ")", sbM32001t);
    }

    public ProcessCheckoutRequestBody(String cartId, String paymentMethodId, Boolean bool, String idempotencyKey, String str) {
        AbstractC22676k.m65750j(cartId, "cartId");
        AbstractC22676k.m65750j(paymentMethodId, "paymentMethodId");
        AbstractC22676k.m65750j(idempotencyKey, "idempotencyKey");
        this.cartId = cartId;
        this.paymentMethodId = paymentMethodId;
        this.setupFutureUsage = bool;
        this.idempotencyKey = idempotencyKey;
        this.session = str;
    }

    public /* synthetic */ ProcessCheckoutRequestBody(String str, String str2, Boolean bool, String str3, String str4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, bool, str3, (i13 & 16) != 0 ? null : str4);
    }
}
