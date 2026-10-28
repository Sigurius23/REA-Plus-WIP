package com.whoop.design.models.items;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ>\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b,\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010\u001e¨\u00061"}, m65681d2 = {"Lcom/whoop/design/models/items/StepperBarModel;", "", "", "type", "", "discreteStepTotal", "discreteFilledTotal", "", "continuousProgress", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/StepperBarModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "component4", "()Ljava/lang/Float;", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;)Lcom/whoop/design/models/items/StepperBarModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "Ljava/lang/Integer;", "getDiscreteStepTotal", "getDiscreteFilledTotal", "Ljava/lang/Float;", "getContinuousProgress", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class StepperBarModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Float continuousProgress;
    private final Integer discreteFilledTotal;
    private final Integer discreteStepTotal;
    private final String type;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/StepperBarModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/StepperBarModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return StepperBarModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ StepperBarModel(int i13, String str, Integer num, Integer num2, Float f13, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, StepperBarModel$$serializer.INSTANCE.getDescriptor());
        }
        this.type = str;
        this.discreteStepTotal = num;
        this.discreteFilledTotal = num2;
        this.continuousProgress = f13;
    }

    public static /* synthetic */ StepperBarModel copy$default(StepperBarModel stepperBarModel, String str, Integer num, Integer num2, Float f13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = stepperBarModel.type;
        }
        if ((i13 & 2) != 0) {
            num = stepperBarModel.discreteStepTotal;
        }
        if ((i13 & 4) != 0) {
            num2 = stepperBarModel.discreteFilledTotal;
        }
        if ((i13 & 8) != 0) {
            f13 = stepperBarModel.continuousProgress;
        }
        return stepperBarModel.copy(str, num, num2, f13);
    }

    public static final /* synthetic */ void write$Self$design_models_release(StepperBarModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.type);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, intSerializer, self.discreteStepTotal);
        output.encodeNullableSerializableElement(serialDesc, 2, intSerializer, self.discreteFilledTotal);
        output.encodeNullableSerializableElement(serialDesc, 3, FloatSerializer.INSTANCE, self.continuousProgress);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getDiscreteStepTotal() {
        return this.discreteStepTotal;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getDiscreteFilledTotal() {
        return this.discreteFilledTotal;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Float getContinuousProgress() {
        return this.continuousProgress;
    }

    public final StepperBarModel copy(String type, Integer discreteStepTotal, Integer discreteFilledTotal, Float continuousProgress) {
        AbstractC22676k.m65750j(type, "type");
        return new StepperBarModel(type, discreteStepTotal, discreteFilledTotal, continuousProgress);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StepperBarModel)) {
            return false;
        }
        StepperBarModel stepperBarModel = (StepperBarModel) other;
        return AbstractC22676k.m65745e(this.type, stepperBarModel.type) && AbstractC22676k.m65745e(this.discreteStepTotal, stepperBarModel.discreteStepTotal) && AbstractC22676k.m65745e(this.discreteFilledTotal, stepperBarModel.discreteFilledTotal) && AbstractC22676k.m65745e(this.continuousProgress, stepperBarModel.continuousProgress);
    }

    public final Float getContinuousProgress() {
        return this.continuousProgress;
    }

    public final Integer getDiscreteFilledTotal() {
        return this.discreteFilledTotal;
    }

    public final Integer getDiscreteStepTotal() {
        return this.discreteStepTotal;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        Integer num = this.discreteStepTotal;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.discreteFilledTotal;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Float f13 = this.continuousProgress;
        return iHashCode3 + (f13 != null ? f13.hashCode() : 0);
    }

    public String toString() {
        return "StepperBarModel(type=" + this.type + ", discreteStepTotal=" + this.discreteStepTotal + ", discreteFilledTotal=" + this.discreteFilledTotal + ", continuousProgress=" + this.continuousProgress + ")";
    }

    public StepperBarModel(String type, Integer num, Integer num2, Float f13) {
        AbstractC22676k.m65750j(type, "type");
        this.type = type;
        this.discreteStepTotal = num;
        this.discreteFilledTotal = num2;
        this.continuousProgress = f13;
    }
}
