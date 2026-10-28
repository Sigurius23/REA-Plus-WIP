package com.whoop.gifting.feature.gifting.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0016J\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u0016¨\u0006)"}, m65681d2 = {"Lcom/whoop/gifting/feature/gifting/domain/models/NumericStepperModel;", "", "", "minimumStepperValue", "maximumStepperValue", "startingStepperValue", "<init>", "(III)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$gifting_release", "(Lcom/whoop/gifting/feature/gifting/domain/models/NumericStepperModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()I", "component2", "component3", "copy", "(III)Lcom/whoop/gifting/feature/gifting/domain/models/NumericStepperModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getMinimumStepperValue", "getMaximumStepperValue", "getStartingStepperValue", "Companion", "$serializer", "gifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class NumericStepperModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int maximumStepperValue;
    private final int minimumStepperValue;
    private final int startingStepperValue;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/gifting/feature/gifting/domain/models/NumericStepperModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/gifting/feature/gifting/domain/models/NumericStepperModel;", "serializer", "()Lwc3/c;", "gifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return NumericStepperModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public NumericStepperModel(int i13, int i14, int i15) {
        this.minimumStepperValue = i13;
        this.maximumStepperValue = i14;
        this.startingStepperValue = i15;
    }

    public static /* synthetic */ NumericStepperModel copy$default(NumericStepperModel numericStepperModel, int i13, int i14, int i15, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i13 = numericStepperModel.minimumStepperValue;
        }
        if ((i16 & 2) != 0) {
            i14 = numericStepperModel.maximumStepperValue;
        }
        if ((i16 & 4) != 0) {
            i15 = numericStepperModel.startingStepperValue;
        }
        return numericStepperModel.copy(i13, i14, i15);
    }

    public static final /* synthetic */ void write$Self$gifting_release(NumericStepperModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeIntElement(serialDesc, 0, self.minimumStepperValue);
        output.encodeIntElement(serialDesc, 1, self.maximumStepperValue);
        output.encodeIntElement(serialDesc, 2, self.startingStepperValue);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMinimumStepperValue() {
        return this.minimumStepperValue;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMaximumStepperValue() {
        return this.maximumStepperValue;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getStartingStepperValue() {
        return this.startingStepperValue;
    }

    public final NumericStepperModel copy(int minimumStepperValue, int maximumStepperValue, int startingStepperValue) {
        return new NumericStepperModel(minimumStepperValue, maximumStepperValue, startingStepperValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NumericStepperModel)) {
            return false;
        }
        NumericStepperModel numericStepperModel = (NumericStepperModel) other;
        return this.minimumStepperValue == numericStepperModel.minimumStepperValue && this.maximumStepperValue == numericStepperModel.maximumStepperValue && this.startingStepperValue == numericStepperModel.startingStepperValue;
    }

    public final int getMaximumStepperValue() {
        return this.maximumStepperValue;
    }

    public final int getMinimumStepperValue() {
        return this.minimumStepperValue;
    }

    public final int getStartingStepperValue() {
        return this.startingStepperValue;
    }

    public int hashCode() {
        return Integer.hashCode(this.startingStepperValue) + AbstractC11266d.m30448b(this.maximumStepperValue, Integer.hashCode(this.minimumStepperValue) * 31, 31);
    }

    public String toString() {
        int i13 = this.minimumStepperValue;
        int i14 = this.maximumStepperValue;
        return AbstractC18489d0.m53371l(AbstractC11266d.m30465s(i13, i14, "NumericStepperModel(minimumStepperValue=", ", maximumStepperValue=", ", startingStepperValue="), this.startingStepperValue, ")");
    }

    public /* synthetic */ NumericStepperModel(int i13, int i14, int i15, int i16, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, NumericStepperModel$$serializer.INSTANCE.getDescriptor());
        }
        this.minimumStepperValue = i14;
        this.maximumStepperValue = i15;
        this.startingStepperValue = i16;
    }
}
