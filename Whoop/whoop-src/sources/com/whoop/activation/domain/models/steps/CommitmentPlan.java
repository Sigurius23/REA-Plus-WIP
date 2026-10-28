package com.whoop.activation.domain.models.steps;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import qv1.C30654e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ8\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b-\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001f¨\u00062"}, m65681d2 = {"Lcom/whoop/activation/domain/models/steps/CommitmentPlan;", "", "Lcom/whoop/activation/domain/models/steps/CommitmentType;", "commitmentType", "", "payload", "promoCode", "Lcom/whoop/activation/domain/models/steps/OrderDetails;", "orderDetails", "<init>", "(Lcom/whoop/activation/domain/models/steps/CommitmentType;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/activation/domain/models/steps/OrderDetails;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/activation/domain/models/steps/CommitmentType;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/activation/domain/models/steps/OrderDetails;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$activation_release", "(Lcom/whoop/activation/domain/models/steps/CommitmentPlan;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/activation/domain/models/steps/CommitmentType;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/whoop/activation/domain/models/steps/OrderDetails;", "copy", "(Lcom/whoop/activation/domain/models/steps/CommitmentType;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/activation/domain/models/steps/OrderDetails;)Lcom/whoop/activation/domain/models/steps/CommitmentPlan;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/activation/domain/models/steps/CommitmentType;", "getCommitmentType", "Ljava/lang/String;", "getPayload", "getPromoCode", "Lcom/whoop/activation/domain/models/steps/OrderDetails;", "getOrderDetails", "Companion", "$serializer", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CommitmentPlan {
    private final CommitmentType commitmentType;
    private final OrderDetails orderDetails;
    private final String payload;
    private final String promoCode;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C30654e(23)), null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/activation/domain/models/steps/CommitmentPlan$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/activation/domain/models/steps/CommitmentPlan;", "serializer", "()Lwc3/c;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CommitmentPlan$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CommitmentPlan(int i13, CommitmentType commitmentType, String str, String str2, OrderDetails orderDetails, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, CommitmentPlan$$serializer.INSTANCE.getDescriptor());
        }
        this.commitmentType = commitmentType;
        this.payload = str;
        this.promoCode = str2;
        this.orderDetails = orderDetails;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.activation.domain.models.steps.CommitmentType", CommitmentType.values());
    }

    public static /* synthetic */ CommitmentPlan copy$default(CommitmentPlan commitmentPlan, CommitmentType commitmentType, String str, String str2, OrderDetails orderDetails, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            commitmentType = commitmentPlan.commitmentType;
        }
        if ((i13 & 2) != 0) {
            str = commitmentPlan.payload;
        }
        if ((i13 & 4) != 0) {
            str2 = commitmentPlan.promoCode;
        }
        if ((i13 & 8) != 0) {
            orderDetails = commitmentPlan.orderDetails;
        }
        return commitmentPlan.copy(commitmentType, str, str2, orderDetails);
    }

    public static final /* synthetic */ void write$Self$activation_release(CommitmentPlan self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) $childSerializers[0].getValue(), self.commitmentType);
        output.encodeStringElement(serialDesc, 1, self.payload);
        output.encodeStringElement(serialDesc, 2, self.promoCode);
        output.encodeSerializableElement(serialDesc, 3, OrderDetails$$serializer.INSTANCE, self.orderDetails);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CommitmentType getCommitmentType() {
        return this.commitmentType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPayload() {
        return this.payload;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPromoCode() {
        return this.promoCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final OrderDetails getOrderDetails() {
        return this.orderDetails;
    }

    public final CommitmentPlan copy(CommitmentType commitmentType, String payload, String promoCode, OrderDetails orderDetails) {
        AbstractC22676k.m65750j(commitmentType, "commitmentType");
        AbstractC22676k.m65750j(payload, "payload");
        AbstractC22676k.m65750j(promoCode, "promoCode");
        AbstractC22676k.m65750j(orderDetails, "orderDetails");
        return new CommitmentPlan(commitmentType, payload, promoCode, orderDetails);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommitmentPlan)) {
            return false;
        }
        CommitmentPlan commitmentPlan = (CommitmentPlan) other;
        return this.commitmentType == commitmentPlan.commitmentType && AbstractC22676k.m65745e(this.payload, commitmentPlan.payload) && AbstractC22676k.m65745e(this.promoCode, commitmentPlan.promoCode) && AbstractC22676k.m65745e(this.orderDetails, commitmentPlan.orderDetails);
    }

    public final CommitmentType getCommitmentType() {
        return this.commitmentType;
    }

    public final OrderDetails getOrderDetails() {
        return this.orderDetails;
    }

    public final String getPayload() {
        return this.payload;
    }

    public final String getPromoCode() {
        return this.promoCode;
    }

    public int hashCode() {
        return this.orderDetails.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.commitmentType.hashCode() * 31, 31, this.payload), 31, this.promoCode);
    }

    public String toString() {
        return "CommitmentPlan(commitmentType=" + this.commitmentType + ", payload=" + this.payload + ", promoCode=" + this.promoCode + ", orderDetails=" + this.orderDetails + ")";
    }

    public CommitmentPlan(CommitmentType commitmentType, String payload, String promoCode, OrderDetails orderDetails) {
        AbstractC22676k.m65750j(commitmentType, "commitmentType");
        AbstractC22676k.m65750j(payload, "payload");
        AbstractC22676k.m65750j(promoCode, "promoCode");
        AbstractC22676k.m65750j(orderDetails, "orderDetails");
        this.commitmentType = commitmentType;
        this.payload = payload;
        this.promoCode = promoCode;
        this.orderDetails = orderDetails;
    }
}
