package com.whoop.weightlifting.data.dto;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.weightlifting.data.domain.WorkoutSet;
import java.util.UUID;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import lu2.C24753c;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J<\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001cJ\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010\u001cR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00101\u0012\u0004\b3\u00100\u001a\u0004\b2\u0010\u001eR \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00104\u0012\u0004\b6\u00100\u001a\u0004\b5\u0010 R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00107\u0012\u0004\b9\u00100\u001a\u0004\b8\u0010\"¨\u0006<"}, m65681d2 = {"Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;", "", "", "numberOfReps", "timeInSeconds", "", "weight", "Ljava/util/UUID;", "id", "<init>", "(ILjava/lang/Integer;FLjava/util/UUID;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/lang/Integer;FLjava/util/UUID;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weightlifting_release", "(Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/weightlifting/data/domain/WorkoutSet;", "toWorkoutTemplateSet", "()Lcom/whoop/weightlifting/data/domain/WorkoutSet;", "component1", "()I", "component2", "()Ljava/lang/Integer;", "component3", "()F", "component4", "()Ljava/util/UUID;", "copy", "(ILjava/lang/Integer;FLjava/util/UUID;)Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getNumberOfReps", "getNumberOfReps$annotations", "()V", "Ljava/lang/Integer;", "getTimeInSeconds", "getTimeInSeconds$annotations", "F", "getWeight", "getWeight$annotations", "Ljava/util/UUID;", "getId", "getId$annotations", "Companion", "$serializer", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WorkoutTemplateSetDto {

    @SerializedName("weightlifting_workout_set_id")
    private final UUID id;

    @SerializedName("number_of_reps")
    private final int numberOfReps;

    @SerializedName("time_in_seconds")
    private final Integer timeInSeconds;

    @SerializedName("weight")
    private final float weight;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;", "serializer", "()Lwc3/c;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return WorkoutTemplateSetDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WorkoutTemplateSetDto(int i13, int i14, Integer num, float f13, UUID uuid, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, WorkoutTemplateSetDto$$serializer.INSTANCE.getDescriptor());
        }
        this.numberOfReps = i14;
        this.timeInSeconds = num;
        this.weight = f13;
        this.id = uuid;
    }

    public static /* synthetic */ WorkoutTemplateSetDto copy$default(WorkoutTemplateSetDto workoutTemplateSetDto, int i13, Integer num, float f13, UUID uuid, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = workoutTemplateSetDto.numberOfReps;
        }
        if ((i14 & 2) != 0) {
            num = workoutTemplateSetDto.timeInSeconds;
        }
        if ((i14 & 4) != 0) {
            f13 = workoutTemplateSetDto.weight;
        }
        if ((i14 & 8) != 0) {
            uuid = workoutTemplateSetDto.id;
        }
        return workoutTemplateSetDto.copy(i13, num, f13, uuid);
    }

    @InterfaceC37143h("weightlifting_workout_set_id")
    @InterfaceC37144i(with = C24753c.class)
    public static /* synthetic */ void getId$annotations() {
    }

    @InterfaceC37143h("number_of_reps")
    public static /* synthetic */ void getNumberOfReps$annotations() {
    }

    @InterfaceC37143h("time_in_seconds")
    public static /* synthetic */ void getTimeInSeconds$annotations() {
    }

    @InterfaceC37143h("weight")
    public static /* synthetic */ void getWeight$annotations() {
    }

    public static final /* synthetic */ void write$Self$weightlifting_release(WorkoutTemplateSetDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeIntElement(serialDesc, 0, self.numberOfReps);
        output.encodeNullableSerializableElement(serialDesc, 1, IntSerializer.INSTANCE, self.timeInSeconds);
        output.encodeFloatElement(serialDesc, 2, self.weight);
        output.encodeNullableSerializableElement(serialDesc, 3, C24753c.f96791a, self.id);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getNumberOfReps() {
        return this.numberOfReps;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getTimeInSeconds() {
        return this.timeInSeconds;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getWeight() {
        return this.weight;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final UUID getId() {
        return this.id;
    }

    public final WorkoutTemplateSetDto copy(int numberOfReps, Integer timeInSeconds, float weight, UUID id4) {
        return new WorkoutTemplateSetDto(numberOfReps, timeInSeconds, weight, id4);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorkoutTemplateSetDto)) {
            return false;
        }
        WorkoutTemplateSetDto workoutTemplateSetDto = (WorkoutTemplateSetDto) other;
        return this.numberOfReps == workoutTemplateSetDto.numberOfReps && AbstractC22676k.m65745e(this.timeInSeconds, workoutTemplateSetDto.timeInSeconds) && Float.compare(this.weight, workoutTemplateSetDto.weight) == 0 && AbstractC22676k.m65745e(this.id, workoutTemplateSetDto.id);
    }

    public final UUID getId() {
        return this.id;
    }

    public final int getNumberOfReps() {
        return this.numberOfReps;
    }

    public final Integer getTimeInSeconds() {
        return this.timeInSeconds;
    }

    public final float getWeight() {
        return this.weight;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.numberOfReps) * 31;
        Integer num = this.timeInSeconds;
        int iM30447a = AbstractC11266d.m30447a(this.weight, (iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31);
        UUID uuid = this.id;
        return iM30447a + (uuid != null ? uuid.hashCode() : 0);
    }

    public String toString() {
        return "WorkoutTemplateSetDto(numberOfReps=" + this.numberOfReps + ", timeInSeconds=" + this.timeInSeconds + ", weight=" + this.weight + ", id=" + this.id + ")";
    }

    public final WorkoutSet toWorkoutTemplateSet() {
        int i13 = this.numberOfReps;
        Integer num = this.timeInSeconds;
        float f13 = this.weight;
        UUID uuidRandomUUID = this.id;
        if (uuidRandomUUID == null) {
            uuidRandomUUID = UUID.randomUUID();
        }
        AbstractC22676k.m65747g(uuidRandomUUID);
        return new WorkoutSet(i13, num, f13, uuidRandomUUID);
    }

    public WorkoutTemplateSetDto(int i13, Integer num, float f13, UUID uuid) {
        this.numberOfReps = i13;
        this.timeInSeconds = num;
        this.weight = f13;
        this.id = uuid;
    }
}
