package com.whoop.weightlifting.data.dto;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.UUID;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import lu2.C24753c;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0002BABU\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010Bi\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b)\u0010(J\u0012\u0010*\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b*\u0010(Jn\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b-\u0010(J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00101\u001a\u00020\t2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u001fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00103\u001a\u0004\b5\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b7\u0010\"R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00108\u0012\u0004\b:\u0010;\u001a\u0004\b9\u0010$R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010<\u001a\u0004\b\n\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010=\u001a\u0004\b>\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\b?\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010=\u001a\u0004\b@\u0010(¨\u0006C"}, m65681d2 = {"Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;", "", "", "number_of_reps", "time_in_seconds", "", "weight", "Ljava/util/UUID;", "weightlifting_workout_set_id", "", "is_exercise_trackable", "", "during", "strap_location", "strap_location_laterality", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/util/UUID;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/util/UUID;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weightlifting_release", "(Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/Integer;", "component2", "component3", "()Ljava/lang/Float;", "component4", "()Ljava/util/UUID;", "component5", "()Z", "component6", "()Ljava/lang/String;", "component7", "component8", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/util/UUID;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getNumber_of_reps", "getTime_in_seconds", "Ljava/lang/Float;", "getWeight", "Ljava/util/UUID;", "getWeightlifting_workout_set_id", "getWeightlifting_workout_set_id$annotations", "()V", "Z", "Ljava/lang/String;", "getDuring", "getStrap_location", "getStrap_location_laterality", "Companion", "$serializer", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WeightliftingWorkoutSetDto {
    private final String during;
    private final boolean is_exercise_trackable;
    private final Integer number_of_reps;
    private final String strap_location;
    private final String strap_location_laterality;
    private final Integer time_in_seconds;
    private final Float weight;
    private final UUID weightlifting_workout_set_id;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;", "serializer", "()Lwc3/c;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return WeightliftingWorkoutSetDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WeightliftingWorkoutSetDto(int i13, Integer num, Integer num2, Float f13, UUID uuid, boolean z4, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i13 & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 255, WeightliftingWorkoutSetDto$$serializer.INSTANCE.getDescriptor());
        }
        this.number_of_reps = num;
        this.time_in_seconds = num2;
        this.weight = f13;
        this.weightlifting_workout_set_id = uuid;
        this.is_exercise_trackable = z4;
        this.during = str;
        this.strap_location = str2;
        this.strap_location_laterality = str3;
    }

    public static /* synthetic */ WeightliftingWorkoutSetDto copy$default(WeightliftingWorkoutSetDto weightliftingWorkoutSetDto, Integer num, Integer num2, Float f13, UUID uuid, boolean z4, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            num = weightliftingWorkoutSetDto.number_of_reps;
        }
        if ((i13 & 2) != 0) {
            num2 = weightliftingWorkoutSetDto.time_in_seconds;
        }
        if ((i13 & 4) != 0) {
            f13 = weightliftingWorkoutSetDto.weight;
        }
        if ((i13 & 8) != 0) {
            uuid = weightliftingWorkoutSetDto.weightlifting_workout_set_id;
        }
        if ((i13 & 16) != 0) {
            z4 = weightliftingWorkoutSetDto.is_exercise_trackable;
        }
        if ((i13 & 32) != 0) {
            str = weightliftingWorkoutSetDto.during;
        }
        if ((i13 & 64) != 0) {
            str2 = weightliftingWorkoutSetDto.strap_location;
        }
        if ((i13 & 128) != 0) {
            str3 = weightliftingWorkoutSetDto.strap_location_laterality;
        }
        String str4 = str2;
        String str5 = str3;
        boolean z13 = z4;
        String str6 = str;
        return weightliftingWorkoutSetDto.copy(num, num2, f13, uuid, z13, str6, str4, str5);
    }

    @InterfaceC37144i(with = C24753c.class)
    public static /* synthetic */ void getWeightlifting_workout_set_id$annotations() {
    }

    public static final /* synthetic */ void write$Self$weightlifting_release(WeightliftingWorkoutSetDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, intSerializer, self.number_of_reps);
        output.encodeNullableSerializableElement(serialDesc, 1, intSerializer, self.time_in_seconds);
        output.encodeNullableSerializableElement(serialDesc, 2, FloatSerializer.INSTANCE, self.weight);
        output.encodeNullableSerializableElement(serialDesc, 3, C24753c.f96791a, self.weightlifting_workout_set_id);
        output.encodeBooleanElement(serialDesc, 4, self.is_exercise_trackable);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.during);
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.strap_location);
        output.encodeNullableSerializableElement(serialDesc, 7, stringSerializer, self.strap_location_laterality);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getNumber_of_reps() {
        return this.number_of_reps;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getTime_in_seconds() {
        return this.time_in_seconds;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Float getWeight() {
        return this.weight;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final UUID getWeightlifting_workout_set_id() {
        return this.weightlifting_workout_set_id;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIs_exercise_trackable() {
        return this.is_exercise_trackable;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDuring() {
        return this.during;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getStrap_location() {
        return this.strap_location;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getStrap_location_laterality() {
        return this.strap_location_laterality;
    }

    public final WeightliftingWorkoutSetDto copy(Integer number_of_reps, Integer time_in_seconds, Float weight, UUID weightlifting_workout_set_id, boolean is_exercise_trackable, String during, String strap_location, String strap_location_laterality) {
        return new WeightliftingWorkoutSetDto(number_of_reps, time_in_seconds, weight, weightlifting_workout_set_id, is_exercise_trackable, during, strap_location, strap_location_laterality);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeightliftingWorkoutSetDto)) {
            return false;
        }
        WeightliftingWorkoutSetDto weightliftingWorkoutSetDto = (WeightliftingWorkoutSetDto) other;
        return AbstractC22676k.m65745e(this.number_of_reps, weightliftingWorkoutSetDto.number_of_reps) && AbstractC22676k.m65745e(this.time_in_seconds, weightliftingWorkoutSetDto.time_in_seconds) && AbstractC22676k.m65745e(this.weight, weightliftingWorkoutSetDto.weight) && AbstractC22676k.m65745e(this.weightlifting_workout_set_id, weightliftingWorkoutSetDto.weightlifting_workout_set_id) && this.is_exercise_trackable == weightliftingWorkoutSetDto.is_exercise_trackable && AbstractC22676k.m65745e(this.during, weightliftingWorkoutSetDto.during) && AbstractC22676k.m65745e(this.strap_location, weightliftingWorkoutSetDto.strap_location) && AbstractC22676k.m65745e(this.strap_location_laterality, weightliftingWorkoutSetDto.strap_location_laterality);
    }

    public final String getDuring() {
        return this.during;
    }

    public final Integer getNumber_of_reps() {
        return this.number_of_reps;
    }

    public final String getStrap_location() {
        return this.strap_location;
    }

    public final String getStrap_location_laterality() {
        return this.strap_location_laterality;
    }

    public final Integer getTime_in_seconds() {
        return this.time_in_seconds;
    }

    public final Float getWeight() {
        return this.weight;
    }

    public final UUID getWeightlifting_workout_set_id() {
        return this.weightlifting_workout_set_id;
    }

    public int hashCode() {
        Integer num = this.number_of_reps;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.time_in_seconds;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Float f13 = this.weight;
        int iHashCode3 = (iHashCode2 + (f13 == null ? 0 : f13.hashCode())) * 31;
        UUID uuid = this.weightlifting_workout_set_id;
        int iM8289b = AbstractC2875y.m8289b((iHashCode3 + (uuid == null ? 0 : uuid.hashCode())) * 31, 31, this.is_exercise_trackable);
        String str = this.during;
        int iHashCode4 = (iM8289b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.strap_location;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.strap_location_laterality;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean is_exercise_trackable() {
        return this.is_exercise_trackable;
    }

    public String toString() {
        Integer num = this.number_of_reps;
        Integer num2 = this.time_in_seconds;
        Float f13 = this.weight;
        UUID uuid = this.weightlifting_workout_set_id;
        boolean z4 = this.is_exercise_trackable;
        String str = this.during;
        String str2 = this.strap_location;
        String str3 = this.strap_location_laterality;
        StringBuilder sbM114684l = AbstractC36095b.m114684l("WeightliftingWorkoutSetDto(number_of_reps=", num, ", time_in_seconds=", num2, ", weight=");
        sbM114684l.append(f13);
        sbM114684l.append(", weightlifting_workout_set_id=");
        sbM114684l.append(uuid);
        sbM114684l.append(", is_exercise_trackable=");
        AbstractC38963t7.m124391u(sbM114684l, z4, ", during=", str, ", strap_location=");
        return AbstractC11266d.m30464r(sbM114684l, str2, ", strap_location_laterality=", str3, ")");
    }

    public WeightliftingWorkoutSetDto(Integer num, Integer num2, Float f13, UUID uuid, boolean z4, String str, String str2, String str3) {
        this.number_of_reps = num;
        this.time_in_seconds = num2;
        this.weight = f13;
        this.weightlifting_workout_set_id = uuid;
        this.is_exercise_trackable = z4;
        this.during = str;
        this.strap_location = str2;
        this.strap_location_laterality = str3;
    }
}
