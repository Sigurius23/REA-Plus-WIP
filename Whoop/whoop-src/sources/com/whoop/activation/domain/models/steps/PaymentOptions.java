package com.whoop.activation.domain.models.steps;

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
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import r70.C31049a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000298BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eBc\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b$\u0010%JZ\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001eJ\u0010\u0010)\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b2\u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010\"R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b5\u0010\"R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b7\u0010%¨\u0006:"}, m65681d2 = {"Lcom/whoop/activation/domain/models/steps/PaymentOptions;", "", "", "title", "existingLabel", "alternateLabel", "", "Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;", "textEntries", "Lcom/whoop/activation/domain/models/steps/AcceptedPaymentType;", "acceptedPaymentTypes", "Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages;", "errorMessages", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$activation_release", "(Lcom/whoop/activation/domain/models/steps/PaymentOptions;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "component6", "()Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages;)Lcom/whoop/activation/domain/models/steps/PaymentOptions;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getExistingLabel", "getAlternateLabel", "Ljava/util/List;", "getTextEntries", "getAcceptedPaymentTypes", "Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages;", "getErrorMessages", "Companion", "$serializer", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PaymentOptions {
    private static final InterfaceC23462h[] $childSerializers;
    private final List<AcceptedPaymentType> acceptedPaymentTypes;
    private final String alternateLabel;
    private final PaymentErrorMessages errorMessages;
    private final String existingLabel;
    private final List<ActivationFlowTextEntry> textEntries;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/activation/domain/models/steps/PaymentOptions$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/activation/domain/models/steps/PaymentOptions;", "serializer", "()Lwc3/c;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PaymentOptions$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, AbstractC30060g.m92087G(enumC23463i, new C31049a(27)), AbstractC30060g.m92087G(enumC23463i, new C31049a(28)), null};
    }

    public /* synthetic */ PaymentOptions(int i13, String str, String str2, String str3, List list, List list2, PaymentErrorMessages paymentErrorMessages, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, PaymentOptions$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.existingLabel = str2;
        this.alternateLabel = str3;
        this.textEntries = list;
        this.acceptedPaymentTypes = list2;
        this.errorMessages = paymentErrorMessages;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(ActivationFlowTextEntry$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(AcceptedPaymentType$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaymentOptions copy$default(PaymentOptions paymentOptions, String str, String str2, String str3, List list, List list2, PaymentErrorMessages paymentErrorMessages, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = paymentOptions.title;
        }
        if ((i13 & 2) != 0) {
            str2 = paymentOptions.existingLabel;
        }
        if ((i13 & 4) != 0) {
            str3 = paymentOptions.alternateLabel;
        }
        if ((i13 & 8) != 0) {
            list = paymentOptions.textEntries;
        }
        if ((i13 & 16) != 0) {
            list2 = paymentOptions.acceptedPaymentTypes;
        }
        if ((i13 & 32) != 0) {
            paymentErrorMessages = paymentOptions.errorMessages;
        }
        List list3 = list2;
        PaymentErrorMessages paymentErrorMessages2 = paymentErrorMessages;
        return paymentOptions.copy(str, str2, str3, list, list3, paymentErrorMessages2);
    }

    public static final /* synthetic */ void write$Self$activation_release(PaymentOptions self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.existingLabel);
        output.encodeStringElement(serialDesc, 2, self.alternateLabel);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.textEntries);
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.acceptedPaymentTypes);
        output.encodeSerializableElement(serialDesc, 5, PaymentErrorMessages$$serializer.INSTANCE, self.errorMessages);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getExistingLabel() {
        return this.existingLabel;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAlternateLabel() {
        return this.alternateLabel;
    }

    public final List<ActivationFlowTextEntry> component4() {
        return this.textEntries;
    }

    public final List<AcceptedPaymentType> component5() {
        return this.acceptedPaymentTypes;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final PaymentErrorMessages getErrorMessages() {
        return this.errorMessages;
    }

    public final PaymentOptions copy(String title, String existingLabel, String alternateLabel, List<ActivationFlowTextEntry> textEntries, List<AcceptedPaymentType> acceptedPaymentTypes, PaymentErrorMessages errorMessages) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(alternateLabel, "alternateLabel");
        AbstractC22676k.m65750j(textEntries, "textEntries");
        AbstractC22676k.m65750j(acceptedPaymentTypes, "acceptedPaymentTypes");
        AbstractC22676k.m65750j(errorMessages, "errorMessages");
        return new PaymentOptions(title, existingLabel, alternateLabel, textEntries, acceptedPaymentTypes, errorMessages);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentOptions)) {
            return false;
        }
        PaymentOptions paymentOptions = (PaymentOptions) other;
        return AbstractC22676k.m65745e(this.title, paymentOptions.title) && AbstractC22676k.m65745e(this.existingLabel, paymentOptions.existingLabel) && AbstractC22676k.m65745e(this.alternateLabel, paymentOptions.alternateLabel) && AbstractC22676k.m65745e(this.textEntries, paymentOptions.textEntries) && AbstractC22676k.m65745e(this.acceptedPaymentTypes, paymentOptions.acceptedPaymentTypes) && AbstractC22676k.m65745e(this.errorMessages, paymentOptions.errorMessages);
    }

    public final List<AcceptedPaymentType> getAcceptedPaymentTypes() {
        return this.acceptedPaymentTypes;
    }

    public final String getAlternateLabel() {
        return this.alternateLabel;
    }

    public final PaymentErrorMessages getErrorMessages() {
        return this.errorMessages;
    }

    public final String getExistingLabel() {
        return this.existingLabel;
    }

    public final List<ActivationFlowTextEntry> getTextEntries() {
        return this.textEntries;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.existingLabel;
        return this.errorMessages.hashCode() + AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11266d.m30450d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.alternateLabel), 31, this.textEntries), 31, this.acceptedPaymentTypes);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.existingLabel;
        String str3 = this.alternateLabel;
        List<ActivationFlowTextEntry> list = this.textEntries;
        List<AcceptedPaymentType> list2 = this.acceptedPaymentTypes;
        PaymentErrorMessages paymentErrorMessages = this.errorMessages;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("PaymentOptions(title=", str, ", existingLabel=", str2, ", alternateLabel=");
        AbstractC36095b.m114694v(str3, ", textEntries=", ", acceptedPaymentTypes=", sbM32001t, list);
        sbM32001t.append(list2);
        sbM32001t.append(", errorMessages=");
        sbM32001t.append(paymentErrorMessages);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public PaymentOptions(String title, String str, String alternateLabel, List<ActivationFlowTextEntry> textEntries, List<AcceptedPaymentType> acceptedPaymentTypes, PaymentErrorMessages errorMessages) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(alternateLabel, "alternateLabel");
        AbstractC22676k.m65750j(textEntries, "textEntries");
        AbstractC22676k.m65750j(acceptedPaymentTypes, "acceptedPaymentTypes");
        AbstractC22676k.m65750j(errorMessages, "errorMessages");
        this.title = title;
        this.existingLabel = str;
        this.alternateLabel = alternateLabel;
        this.textEntries = textEntries;
        this.acceptedPaymentTypes = acceptedPaymentTypes;
        this.errorMessages = errorMessages;
    }
}
