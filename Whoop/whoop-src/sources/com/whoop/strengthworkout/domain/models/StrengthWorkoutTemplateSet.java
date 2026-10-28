package com.whoop.strengthworkout.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ4\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u001a¨\u0006-"}, m65681d2 = {"Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateSet;", "", "", "numberOfReps", "timeInSeconds", "", "weight", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$strength_workout_release", "(Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateSet;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/Integer;", "component2", "component3", "()Ljava/lang/Float;", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;)Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateSet;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getNumberOfReps", "getTimeInSeconds", "Ljava/lang/Float;", "getWeight", "Companion", "$serializer", "strength-workout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class StrengthWorkoutTemplateSet {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Integer numberOfReps;
    private final Integer timeInSeconds;
    private final Float weight;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateSet$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateSet;", "serializer", "()Lwc3/c;", "strength-workout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return StrengthWorkoutTemplateSet$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ StrengthWorkoutTemplateSet(int i13, Integer num, Integer num2, Float f13, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, StrengthWorkoutTemplateSet$$serializer.INSTANCE.getDescriptor());
        }
        this.numberOfReps = num;
        this.timeInSeconds = num2;
        this.weight = f13;
    }

    public static /* synthetic */ StrengthWorkoutTemplateSet copy$default(StrengthWorkoutTemplateSet strengthWorkoutTemplateSet, Integer num, Integer num2, Float f13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            num = strengthWorkoutTemplateSet.numberOfReps;
        }
        if ((i13 & 2) != 0) {
            num2 = strengthWorkoutTemplateSet.timeInSeconds;
        }
        if ((i13 & 4) != 0) {
            f13 = strengthWorkoutTemplateSet.weight;
        }
        return strengthWorkoutTemplateSet.copy(num, num2, f13);
    }

    public static final /* synthetic */ void write$Self$strength_workout_release(StrengthWorkoutTemplateSet self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, intSerializer, self.numberOfReps);
        output.encodeNullableSerializableElement(serialDesc, 1, intSerializer, self.timeInSeconds);
        output.encodeNullableSerializableElement(serialDesc, 2, FloatSerializer.INSTANCE, self.weight);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getNumberOfReps() {
        return this.numberOfReps;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getTimeInSeconds() {
        return this.timeInSeconds;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Float getWeight() {
        return this.weight;
    }

    public final StrengthWorkoutTemplateSet copy(Integer numberOfReps, Integer timeInSeconds, Float weight) {
        return new StrengthWorkoutTemplateSet(numberOfReps, timeInSeconds, weight);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StrengthWorkoutTemplateSet)) {
            return false;
        }
        StrengthWorkoutTemplateSet strengthWorkoutTemplateSet = (StrengthWorkoutTemplateSet) other;
        return AbstractC22676k.m65745e(this.numberOfReps, strengthWorkoutTemplateSet.numberOfReps) && AbstractC22676k.m65745e(this.timeInSeconds, strengthWorkoutTemplateSet.timeInSeconds) && AbstractC22676k.m65745e(this.weight, strengthWorkoutTemplateSet.weight);
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

    public int hashCode() {
        Integer num = this.numberOfReps;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.timeInSeconds;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Float f13 = this.weight;
        return iHashCode2 + (f13 != null ? f13.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.numberOfReps;
        Integer num2 = this.timeInSeconds;
        Float f13 = this.weight;
        StringBuilder sbM114684l = AbstractC36095b.m114684l("StrengthWorkoutTemplateSet(numberOfReps=", num, ", timeInSeconds=", num2, ", weight=");
        sbM114684l.append(f13);
        sbM114684l.append(")");
        return sbM114684l.toString();
    }

    public StrengthWorkoutTemplateSet(Integer num, Integer num2, Float f13) {
        this.numberOfReps = num;
        this.timeInSeconds = num2;
        this.weight = f13;
    }
}
