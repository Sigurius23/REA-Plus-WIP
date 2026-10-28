package com.whoop.gifting.feature.gifting.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ4\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b*\u0010\u001a¨\u0006-"}, m65681d2 = {"Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/gifting/feature/gifting/domain/models/NumericStepperModel;", "numericStepper", "", "description", "id", "<init>", "(Lcom/whoop/gifting/feature/gifting/domain/models/NumericStepperModel;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/gifting/feature/gifting/domain/models/NumericStepperModel;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$gifting_release", "(Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/gifting/feature/gifting/domain/models/NumericStepperModel;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/whoop/gifting/feature/gifting/domain/models/NumericStepperModel;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/gifting/feature/gifting/domain/models/NumericStepperModel;", "getNumericStepper", "Ljava/lang/String;", "getDescription", "getId", "Companion", "$serializer", "gifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class QuantitySelectorModel implements DesignSystemModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String description;
    private final String id;
    private final NumericStepperModel numericStepper;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;", "serializer", "()Lwc3/c;", "gifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return QuantitySelectorModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ QuantitySelectorModel(int i13, NumericStepperModel numericStepperModel, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, QuantitySelectorModel$$serializer.INSTANCE.getDescriptor());
        }
        this.numericStepper = numericStepperModel;
        this.description = str;
        this.id = str2;
    }

    public static /* synthetic */ QuantitySelectorModel copy$default(QuantitySelectorModel quantitySelectorModel, NumericStepperModel numericStepperModel, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            numericStepperModel = quantitySelectorModel.numericStepper;
        }
        if ((i13 & 2) != 0) {
            str = quantitySelectorModel.description;
        }
        if ((i13 & 4) != 0) {
            str2 = quantitySelectorModel.id;
        }
        return quantitySelectorModel.copy(numericStepperModel, str, str2);
    }

    public static final /* synthetic */ void write$Self$gifting_release(QuantitySelectorModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeNullableSerializableElement(serialDesc, 0, NumericStepperModel$$serializer.INSTANCE, self.numericStepper);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.description);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.id);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final NumericStepperModel getNumericStepper() {
        return this.numericStepper;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final QuantitySelectorModel copy(NumericStepperModel numericStepper, String description, String id4) {
        return new QuantitySelectorModel(numericStepper, description, id4);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuantitySelectorModel)) {
            return false;
        }
        QuantitySelectorModel quantitySelectorModel = (QuantitySelectorModel) other;
        return AbstractC22676k.m65745e(this.numericStepper, quantitySelectorModel.numericStepper) && AbstractC22676k.m65745e(this.description, quantitySelectorModel.description) && AbstractC22676k.m65745e(this.id, quantitySelectorModel.id);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.id;
    }

    public final NumericStepperModel getNumericStepper() {
        return this.numericStepper;
    }

    public int hashCode() {
        NumericStepperModel numericStepperModel = this.numericStepper;
        int iHashCode = (numericStepperModel == null ? 0 : numericStepperModel.hashCode()) * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.id;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        NumericStepperModel numericStepperModel = this.numericStepper;
        String str = this.description;
        String str2 = this.id;
        StringBuilder sb4 = new StringBuilder("QuantitySelectorModel(numericStepper=");
        sb4.append(numericStepperModel);
        sb4.append(", description=");
        sb4.append(str);
        sb4.append(", id=");
        return AbstractC25012a.m73376i(str2, ")", sb4);
    }

    public QuantitySelectorModel(NumericStepperModel numericStepperModel, String str, String str2) {
        this.numericStepper = numericStepperModel;
        this.description = str;
        this.id = str2;
    }
}
