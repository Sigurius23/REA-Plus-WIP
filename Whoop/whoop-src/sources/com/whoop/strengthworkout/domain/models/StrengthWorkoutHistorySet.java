package com.whoop.strengthworkout.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ@\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010\u001e¨\u00061"}, m65681d2 = {"Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutHistorySet;", "", "", "numberOfReps", "timeInSeconds", "", "weight", "", "during", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$strength_workout_release", "(Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutHistorySet;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/Integer;", "component2", "component3", "()Ljava/lang/Float;", "component4", "()Ljava/lang/String;", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;)Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutHistorySet;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getNumberOfReps", "getTimeInSeconds", "Ljava/lang/Float;", "getWeight", "Ljava/lang/String;", "getDuring", "Companion", "$serializer", "strength-workout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class StrengthWorkoutHistorySet {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String during;
    private final Integer numberOfReps;
    private final Integer timeInSeconds;
    private final Float weight;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutHistorySet$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutHistorySet;", "serializer", "()Lwc3/c;", "strength-workout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return StrengthWorkoutHistorySet$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ StrengthWorkoutHistorySet(int i13, Integer num, Integer num2, Float f13, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, StrengthWorkoutHistorySet$$serializer.INSTANCE.getDescriptor());
        }
        this.numberOfReps = num;
        this.timeInSeconds = num2;
        this.weight = f13;
        this.during = str;
    }

    public static /* synthetic */ StrengthWorkoutHistorySet copy$default(StrengthWorkoutHistorySet strengthWorkoutHistorySet, Integer num, Integer num2, Float f13, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            num = strengthWorkoutHistorySet.numberOfReps;
        }
        if ((i13 & 2) != 0) {
            num2 = strengthWorkoutHistorySet.timeInSeconds;
        }
        if ((i13 & 4) != 0) {
            f13 = strengthWorkoutHistorySet.weight;
        }
        if ((i13 & 8) != 0) {
            str = strengthWorkoutHistorySet.during;
        }
        return strengthWorkoutHistorySet.copy(num, num2, f13, str);
    }

    public static final /* synthetic */ void write$Self$strength_workout_release(StrengthWorkoutHistorySet self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, intSerializer, self.numberOfReps);
        output.encodeNullableSerializableElement(serialDesc, 1, intSerializer, self.timeInSeconds);
        output.encodeNullableSerializableElement(serialDesc, 2, FloatSerializer.INSTANCE, self.weight);
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.during);
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

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDuring() {
        return this.during;
    }

    public final StrengthWorkoutHistorySet copy(Integer numberOfReps, Integer timeInSeconds, Float weight, String during) {
        return new StrengthWorkoutHistorySet(numberOfReps, timeInSeconds, weight, during);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StrengthWorkoutHistorySet)) {
            return false;
        }
        StrengthWorkoutHistorySet strengthWorkoutHistorySet = (StrengthWorkoutHistorySet) other;
        return AbstractC22676k.m65745e(this.numberOfReps, strengthWorkoutHistorySet.numberOfReps) && AbstractC22676k.m65745e(this.timeInSeconds, strengthWorkoutHistorySet.timeInSeconds) && AbstractC22676k.m65745e(this.weight, strengthWorkoutHistorySet.weight) && AbstractC22676k.m65745e(this.during, strengthWorkoutHistorySet.during);
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

    public int hashCode() {
        Integer num = this.numberOfReps;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.timeInSeconds;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Float f13 = this.weight;
        int iHashCode3 = (iHashCode2 + (f13 == null ? 0 : f13.hashCode())) * 31;
        String str = this.during;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.numberOfReps;
        Integer num2 = this.timeInSeconds;
        Float f13 = this.weight;
        String str = this.during;
        StringBuilder sbM114684l = AbstractC36095b.m114684l("StrengthWorkoutHistorySet(numberOfReps=", num, ", timeInSeconds=", num2, ", weight=");
        sbM114684l.append(f13);
        sbM114684l.append(", during=");
        sbM114684l.append(str);
        sbM114684l.append(")");
        return sbM114684l.toString();
    }

    public StrengthWorkoutHistorySet(Integer num, Integer num2, Float f13, String str) {
        this.numberOfReps = num;
        this.timeInSeconds = num2;
        this.weight = f13;
        this.during = str;
    }
}
