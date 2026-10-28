package com.whoop.weightlifting.data.dto;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.weightlifting.data.domain.WeightliftingExercise;
import com.whoop.weightlifting.data.domain.WorkoutExercise;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import ku2.C22837a;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import lu2.C24753c;
import m83.AbstractC25267u;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J6\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010\u001dR&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00101\u0012\u0004\b3\u00100\u001a\u0004\b2\u0010\u001fR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00104\u0012\u0004\b6\u00100\u001a\u0004\b5\u0010!¨\u00069"}, m65681d2 = {"Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;", "", "Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;", "exerciseDetails", "", "Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;", "sets", "Ljava/util/UUID;", "id", "<init>", "(Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;Ljava/util/List;Ljava/util/UUID;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;Ljava/util/List;Ljava/util/UUID;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weightlifting_release", "(Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/weightlifting/data/domain/WorkoutExercise;", "toWorkoutExercise", "()Lcom/whoop/weightlifting/data/domain/WorkoutExercise;", "component1", "()Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;", "component2", "()Ljava/util/List;", "component3", "()Ljava/util/UUID;", "copy", "(Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;Ljava/util/List;Ljava/util/UUID;)Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;", "getExerciseDetails", "getExerciseDetails$annotations", "()V", "Ljava/util/List;", "getSets", "getSets$annotations", "Ljava/util/UUID;", "getId", "getId$annotations", "Companion", "$serializer", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WorkoutTemplateExerciseDto {

    @SerializedName("exercise_details")
    private final WeightliftingExerciseDto exerciseDetails;

    @SerializedName("workout_exercise_id")
    private final UUID id;

    @SerializedName("sets")
    private final List<WorkoutTemplateSetDto> sets;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C22837a(14)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;", "serializer", "()Lwc3/c;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return WorkoutTemplateExerciseDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WorkoutTemplateExerciseDto(int i13, WeightliftingExerciseDto weightliftingExerciseDto, List list, UUID uuid, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, WorkoutTemplateExerciseDto$$serializer.INSTANCE.getDescriptor());
        }
        this.exerciseDetails = weightliftingExerciseDto;
        this.sets = list;
        this.id = uuid;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(WorkoutTemplateSetDto$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WorkoutTemplateExerciseDto copy$default(WorkoutTemplateExerciseDto workoutTemplateExerciseDto, WeightliftingExerciseDto weightliftingExerciseDto, List list, UUID uuid, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            weightliftingExerciseDto = workoutTemplateExerciseDto.exerciseDetails;
        }
        if ((i13 & 2) != 0) {
            list = workoutTemplateExerciseDto.sets;
        }
        if ((i13 & 4) != 0) {
            uuid = workoutTemplateExerciseDto.id;
        }
        return workoutTemplateExerciseDto.copy(weightliftingExerciseDto, list, uuid);
    }

    @InterfaceC37143h("exercise_details")
    public static /* synthetic */ void getExerciseDetails$annotations() {
    }

    @InterfaceC37143h("workout_exercise_id")
    @InterfaceC37144i(with = C24753c.class)
    public static /* synthetic */ void getId$annotations() {
    }

    @InterfaceC37143h("sets")
    public static /* synthetic */ void getSets$annotations() {
    }

    public static final /* synthetic */ void write$Self$weightlifting_release(WorkoutTemplateExerciseDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, WeightliftingExerciseDto$$serializer.INSTANCE, self.exerciseDetails);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.sets);
        output.encodeNullableSerializableElement(serialDesc, 2, C24753c.f96791a, self.id);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final WeightliftingExerciseDto getExerciseDetails() {
        return this.exerciseDetails;
    }

    public final List<WorkoutTemplateSetDto> component2() {
        return this.sets;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final UUID getId() {
        return this.id;
    }

    public final WorkoutTemplateExerciseDto copy(WeightliftingExerciseDto exerciseDetails, List<WorkoutTemplateSetDto> sets, UUID id4) {
        AbstractC22676k.m65750j(exerciseDetails, "exerciseDetails");
        AbstractC22676k.m65750j(sets, "sets");
        return new WorkoutTemplateExerciseDto(exerciseDetails, sets, id4);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorkoutTemplateExerciseDto)) {
            return false;
        }
        WorkoutTemplateExerciseDto workoutTemplateExerciseDto = (WorkoutTemplateExerciseDto) other;
        return AbstractC22676k.m65745e(this.exerciseDetails, workoutTemplateExerciseDto.exerciseDetails) && AbstractC22676k.m65745e(this.sets, workoutTemplateExerciseDto.sets) && AbstractC22676k.m65745e(this.id, workoutTemplateExerciseDto.id);
    }

    public final WeightliftingExerciseDto getExerciseDetails() {
        return this.exerciseDetails;
    }

    public final UUID getId() {
        return this.id;
    }

    public final List<WorkoutTemplateSetDto> getSets() {
        return this.sets;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.exerciseDetails.hashCode() * 31, 31, this.sets);
        UUID uuid = this.id;
        return iM31983b + (uuid == null ? 0 : uuid.hashCode());
    }

    public String toString() {
        return "WorkoutTemplateExerciseDto(exerciseDetails=" + this.exerciseDetails + ", sets=" + this.sets + ", id=" + this.id + ")";
    }

    public final WorkoutExercise toWorkoutExercise() {
        List<WorkoutTemplateSetDto> list = this.sets;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((WorkoutTemplateSetDto) it.next()).toWorkoutTemplateSet());
        }
        WeightliftingExercise weightliftingExercise = this.exerciseDetails.toWeightliftingExercise();
        UUID uuidRandomUUID = this.id;
        if (uuidRandomUUID == null) {
            uuidRandomUUID = UUID.randomUUID();
        }
        AbstractC22676k.m65747g(uuidRandomUUID);
        return new WorkoutExercise(arrayList, weightliftingExercise, uuidRandomUUID);
    }

    public WorkoutTemplateExerciseDto(WeightliftingExerciseDto exerciseDetails, List<WorkoutTemplateSetDto> sets, UUID uuid) {
        AbstractC22676k.m65750j(exerciseDetails, "exerciseDetails");
        AbstractC22676k.m65750j(sets, "sets");
        this.exerciseDetails = exerciseDetails;
        this.sets = sets;
        this.id = uuid;
    }
}
