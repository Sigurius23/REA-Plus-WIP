package com.whoop.payments.feature.paymentmethodmanagement.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006*"}, m65681d2 = {"Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementNavigationBarModel;", "", "", "title", "Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementLeftButtonModel;", "leftButton", "<init>", "(Ljava/lang/String;Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementLeftButtonModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementLeftButtonModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$payments_release", "(Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementNavigationBarModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementLeftButtonModel;", "copy", "(Ljava/lang/String;Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementLeftButtonModel;)Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementNavigationBarModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementLeftButtonModel;", "getLeftButton", "Companion", "$serializer", "a", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PaymentMethodManagementNavigationBarModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final PaymentMethodManagementLeftButtonModel leftButton;
    private final String title;

    /* JADX INFO: renamed from: com.whoop.payments.feature.paymentmethodmanagement.domain.models.PaymentMethodManagementNavigationBarModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementNavigationBarModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementNavigationBarModel;", "serializer", "()Lwc3/c;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PaymentMethodManagementNavigationBarModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentMethodManagementNavigationBarModel() {
        this((String) null, (PaymentMethodManagementLeftButtonModel) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ PaymentMethodManagementNavigationBarModel copy$default(PaymentMethodManagementNavigationBarModel paymentMethodManagementNavigationBarModel, String str, PaymentMethodManagementLeftButtonModel paymentMethodManagementLeftButtonModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = paymentMethodManagementNavigationBarModel.title;
        }
        if ((i13 & 2) != 0) {
            paymentMethodManagementLeftButtonModel = paymentMethodManagementNavigationBarModel.leftButton;
        }
        return paymentMethodManagementNavigationBarModel.copy(str, paymentMethodManagementLeftButtonModel);
    }

    public static final /* synthetic */ void write$Self$payments_release(PaymentMethodManagementNavigationBarModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.title != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.title);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.leftButton == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, PaymentMethodManagementLeftButtonModel$$serializer.INSTANCE, self.leftButton);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PaymentMethodManagementLeftButtonModel getLeftButton() {
        return this.leftButton;
    }

    public final PaymentMethodManagementNavigationBarModel copy(String title, PaymentMethodManagementLeftButtonModel leftButton) {
        return new PaymentMethodManagementNavigationBarModel(title, leftButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentMethodManagementNavigationBarModel)) {
            return false;
        }
        PaymentMethodManagementNavigationBarModel paymentMethodManagementNavigationBarModel = (PaymentMethodManagementNavigationBarModel) other;
        return AbstractC22676k.m65745e(this.title, paymentMethodManagementNavigationBarModel.title) && AbstractC22676k.m65745e(this.leftButton, paymentMethodManagementNavigationBarModel.leftButton);
    }

    public final PaymentMethodManagementLeftButtonModel getLeftButton() {
        return this.leftButton;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        PaymentMethodManagementLeftButtonModel paymentMethodManagementLeftButtonModel = this.leftButton;
        return iHashCode + (paymentMethodManagementLeftButtonModel != null ? paymentMethodManagementLeftButtonModel.hashCode() : 0);
    }

    public String toString() {
        return "PaymentMethodManagementNavigationBarModel(title=" + this.title + ", leftButton=" + this.leftButton + ")";
    }

    public /* synthetic */ PaymentMethodManagementNavigationBarModel(int i13, String str, PaymentMethodManagementLeftButtonModel paymentMethodManagementLeftButtonModel, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        if ((i13 & 2) == 0) {
            this.leftButton = null;
        } else {
            this.leftButton = paymentMethodManagementLeftButtonModel;
        }
    }

    public PaymentMethodManagementNavigationBarModel(String str, PaymentMethodManagementLeftButtonModel paymentMethodManagementLeftButtonModel) {
        this.title = str;
        this.leftButton = paymentMethodManagementLeftButtonModel;
    }

    public /* synthetic */ PaymentMethodManagementNavigationBarModel(String str, PaymentMethodManagementLeftButtonModel paymentMethodManagementLeftButtonModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : paymentMethodManagementLeftButtonModel);
    }
}
