package com.whoop.strengthworkout.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.IntSerializer;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001aJJ\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001aJ\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b.\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b1\u0010\u001a¨\u00064"}, m65681d2 = {"Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;", "", "", "weightliftingWorkoutSetId", "", "numberOfReps", "timeInSeconds", "", "weight", "during", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$strength_workout_release", "(Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "component4", "()Ljava/lang/Float;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;)Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getWeightliftingWorkoutSetId", "Ljava/lang/Integer;", "getNumberOfReps", "getTimeInSeconds", "Ljava/lang/Float;", "getWeight", "getDuring", "Companion", "$serializer", "strength-workout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class StrengthWorkoutSaveSet {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String during;
    private final Integer numberOfReps;
    private final Integer timeInSeconds;
    private final Float weight;
    private final String weightliftingWorkoutSetId;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;", "serializer", "()Lwc3/c;", "strength-workout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return StrengthWorkoutSaveSet$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ StrengthWorkoutSaveSet(int i13, String str, Integer num, Integer num2, Float f13, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, StrengthWorkoutSaveSet$$serializer.INSTANCE.getDescriptor());
        }
        this.weightliftingWorkoutSetId = str;
        this.numberOfReps = num;
        this.timeInSeconds = num2;
        this.weight = f13;
        this.during = str2;
    }

    public static /* synthetic */ StrengthWorkoutSaveSet copy$default(StrengthWorkoutSaveSet strengthWorkoutSaveSet, String str, Integer num, Integer num2, Float f13, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = strengthWorkoutSaveSet.weightliftingWorkoutSetId;
        }
        if ((i13 & 2) != 0) {
            num = strengthWorkoutSaveSet.numberOfReps;
        }
        if ((i13 & 4) != 0) {
            num2 = strengthWorkoutSaveSet.timeInSeconds;
        }
        if ((i13 & 8) != 0) {
            f13 = strengthWorkoutSaveSet.weight;
        }
        if ((i13 & 16) != 0) {
            str2 = strengthWorkoutSaveSet.during;
        }
        String str3 = str2;
        Integer num3 = num2;
        return strengthWorkoutSaveSet.copy(str, num, num3, f13, str3);
    }

    public static final /* synthetic */ void write$Self$strength_workout_release(StrengthWorkoutSaveSet self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.weightliftingWorkoutSetId);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, intSerializer, self.numberOfReps);
        output.encodeNullableSerializableElement(serialDesc, 2, intSerializer, self.timeInSeconds);
        output.encodeNullableSerializableElement(serialDesc, 3, FloatSerializer.INSTANCE, self.weight);
        output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.during);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getWeightliftingWorkoutSetId() {
        return this.weightliftingWorkoutSetId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getNumberOfReps() {
        return this.numberOfReps;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getTimeInSeconds() {
        return this.timeInSeconds;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Float getWeight() {
        return this.weight;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDuring() {
        return this.during;
    }

    public final StrengthWorkoutSaveSet copy(String weightliftingWorkoutSetId, Integer numberOfReps, Integer timeInSeconds, Float weight, String during) {
        AbstractC22676k.m65750j(weightliftingWorkoutSetId, "weightliftingWorkoutSetId");
        return new StrengthWorkoutSaveSet(weightliftingWorkoutSetId, numberOfReps, timeInSeconds, weight, during);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StrengthWorkoutSaveSet)) {
            return false;
        }
        StrengthWorkoutSaveSet strengthWorkoutSaveSet = (StrengthWorkoutSaveSet) other;
        return AbstractC22676k.m65745e(this.weightliftingWorkoutSetId, strengthWorkoutSaveSet.weightliftingWorkoutSetId) && AbstractC22676k.m65745e(this.numberOfReps, strengthWorkoutSaveSet.numberOfReps) && AbstractC22676k.m65745e(this.timeInSeconds, strengthWorkoutSaveSet.timeInSeconds) && AbstractC22676k.m65745e(this.weight, strengthWorkoutSaveSet.weight) && AbstractC22676k.m65745e(this.during, strengthWorkoutSaveSet.during);
    }

    public final String getDuring() {
        return this.during;
    }

    public final Integer getNumberOfReps() {
        return this.numberOfReps;
    }

    public final Integer getTimeInSeconds() {
        return this.timeInSeconds;
    }

    public final Float getWeight() {
        return this.weight;
    }

    public final String getWeightliftingWorkoutSetId() {
        return this.weightliftingWorkoutSetId;
    }

    public int hashCode() {
        int iHashCode = this.weightliftingWorkoutSetId.hashCode() * 31;
        Integer num = this.numberOfReps;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.timeInSeconds;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Float f13 = this.weight;
        int iHashCode4 = (iHashCode3 + (f13 == null ? 0 : f13.hashCode())) * 31;
        String str = this.during;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.weightliftingWorkoutSetId;
        Integer num = this.numberOfReps;
        Integer num2 = this.timeInSeconds;
        Float f13 = this.weight;
        String str2 = this.during;
        StringBuilder sb4 = new StringBuilder("StrengthWorkoutSaveSet(weightliftingWorkoutSetId=");
        sb4.append(str);
        sb4.append(", numberOfReps=");
        sb4.append(num);
        sb4.append(", timeInSeconds=");
        sb4.append(num2);
        sb4.append(", weight=");
        sb4.append(f13);
        sb4.append(", during=");
        return AbstractC25012a.m73376i(str2, ")", sb4);
    }

    public StrengthWorkoutSaveSet(String weightliftingWorkoutSetId, Integer num, Integer num2, Float f13, String str) {
        AbstractC22676k.m65750j(weightliftingWorkoutSetId, "weightliftingWorkoutSetId");
        this.weightliftingWorkoutSetId = weightliftingWorkoutSetId;
        this.numberOfReps = num;
        this.timeInSeconds = num2;
        this.weight = f13;
        this.during = str;
    }
}
