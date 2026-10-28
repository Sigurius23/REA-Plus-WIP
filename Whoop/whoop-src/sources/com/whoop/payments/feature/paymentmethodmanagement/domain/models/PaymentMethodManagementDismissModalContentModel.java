package com.whoop.payments.feature.paymentmethodmanagement.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ8\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b,\u0010\u001c¨\u00060"}, m65681d2 = {"Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementDismissModalContentModel;", "", "", "id", "title", "Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementButtonModel;", "primaryButton", "secondaryButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementButtonModel;Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementButtonModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementButtonModel;Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementButtonModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$payments_release", "(Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementDismissModalContentModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementButtonModel;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementButtonModel;Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementButtonModel;)Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementDismissModalContentModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getTitle", "Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementButtonModel;", "getPrimaryButton", "getSecondaryButton", "Companion", "$serializer", "a", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PaymentMethodManagementDismissModalContentModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String id;
    private final PaymentMethodManagementButtonModel primaryButton;
    private final PaymentMethodManagementButtonModel secondaryButton;
    private final String title;

    /* JADX INFO: renamed from: com.whoop.payments.feature.paymentmethodmanagement.domain.models.PaymentMethodManagementDismissModalContentModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementDismissModalContentModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementDismissModalContentModel;", "serializer", "()Lwc3/c;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PaymentMethodManagementDismissModalContentModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PaymentMethodManagementDismissModalContentModel(int i13, String str, String str2, PaymentMethodManagementButtonModel paymentMethodManagementButtonModel, PaymentMethodManagementButtonModel paymentMethodManagementButtonModel2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, PaymentMethodManagementDismissModalContentModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.title = str2;
        this.primaryButton = paymentMethodManagementButtonModel;
        this.secondaryButton = paymentMethodManagementButtonModel2;
    }

    public static /* synthetic */ PaymentMethodManagementDismissModalContentModel copy$default(PaymentMethodManagementDismissModalContentModel paymentMethodManagementDismissModalContentModel, String str, String str2, PaymentMethodManagementButtonModel paymentMethodManagementButtonModel, PaymentMethodManagementButtonModel paymentMethodManagementButtonModel2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = paymentMethodManagementDismissModalContentModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = paymentMethodManagementDismissModalContentModel.title;
        }
        if ((i13 & 4) != 0) {
            paymentMethodManagementButtonModel = paymentMethodManagementDismissModalContentModel.primaryButton;
        }
        if ((i13 & 8) != 0) {
            paymentMethodManagementButtonModel2 = paymentMethodManagementDismissModalContentModel.secondaryButton;
        }
        return paymentMethodManagementDismissModalContentModel.copy(str, str2, paymentMethodManagementButtonModel, paymentMethodManagementButtonModel2);
    }

    public static final /* synthetic */ void write$Self$payments_release(PaymentMethodManagementDismissModalContentModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.title);
        PaymentMethodManagementButtonModel$$serializer paymentMethodManagementButtonModel$$serializer = PaymentMethodManagementButtonModel$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 2, paymentMethodManagementButtonModel$$serializer, self.primaryButton);
        output.encodeSerializableElement(serialDesc, 3, paymentMethodManagementButtonModel$$serializer, self.secondaryButton);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PaymentMethodManagementButtonModel getPrimaryButton() {
        return this.primaryButton;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final PaymentMethodManagementButtonModel getSecondaryButton() {
        return this.secondaryButton;
    }

    public final PaymentMethodManagementDismissModalContentModel copy(String id4, String title, PaymentMethodManagementButtonModel primaryButton, PaymentMethodManagementButtonModel secondaryButton) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(primaryButton, "primaryButton");
        AbstractC22676k.m65750j(secondaryButton, "secondaryButton");
        return new PaymentMethodManagementDismissModalContentModel(id4, title, primaryButton, secondaryButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentMethodManagementDismissModalContentModel)) {
            return false;
        }
        PaymentMethodManagementDismissModalContentModel paymentMethodManagementDismissModalContentModel = (PaymentMethodManagementDismissModalContentModel) other;
        return AbstractC22676k.m65745e(this.id, paymentMethodManagementDismissModalContentModel.id) && AbstractC22676k.m65745e(this.title, paymentMethodManagementDismissModalContentModel.title) && AbstractC22676k.m65745e(this.primaryButton, paymentMethodManagementDismissModalContentModel.primaryButton) && AbstractC22676k.m65745e(this.secondaryButton, paymentMethodManagementDismissModalContentModel.secondaryButton);
    }

    public final String getId() {
        return this.id;
    }

    public final PaymentMethodManagementButtonModel getPrimaryButton() {
        return this.primaryButton;
    }

    public final PaymentMethodManagementButtonModel getSecondaryButton() {
        return this.secondaryButton;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.secondaryButton.hashCode() + ((this.primaryButton.hashCode() + AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.title)) * 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        PaymentMethodManagementButtonModel paymentMethodManagementButtonModel = this.primaryButton;
        PaymentMethodManagementButtonModel paymentMethodManagementButtonModel2 = this.secondaryButton;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("PaymentMethodManagementDismissModalContentModel(id=", str, ", title=", str2, ", primaryButton=");
        sbM32001t.append(paymentMethodManagementButtonModel);
        sbM32001t.append(", secondaryButton=");
        sbM32001t.append(paymentMethodManagementButtonModel2);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public PaymentMethodManagementDismissModalContentModel(String id4, String title, PaymentMethodManagementButtonModel primaryButton, PaymentMethodManagementButtonModel secondaryButton) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(primaryButton, "primaryButton");
        AbstractC22676k.m65750j(secondaryButton, "secondaryButton");
        this.id = id4;
        this.title = title;
        this.primaryButton = primaryButton;
        this.secondaryButton = secondaryButton;
    }
}
