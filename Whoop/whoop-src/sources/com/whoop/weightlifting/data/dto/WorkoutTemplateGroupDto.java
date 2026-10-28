package com.whoop.weightlifting.data.dto;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.weightlifting.data.domain.WorkoutGroup;
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
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ,\u0010\u001e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u001bR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010-\u0012\u0004\b/\u0010,\u001a\u0004\b.\u0010\u001d¨\u00062"}, m65681d2 = {"Lcom/whoop/weightlifting/data/dto/WorkoutTemplateGroupDto;", "", "", "Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;", "workoutExercises", "Ljava/util/UUID;", "id", "<init>", "(Ljava/util/List;Ljava/util/UUID;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/UUID;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weightlifting_release", "(Lcom/whoop/weightlifting/data/dto/WorkoutTemplateGroupDto;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/weightlifting/data/domain/WorkoutGroup;", "toWorkoutGroup", "()Lcom/whoop/weightlifting/data/domain/WorkoutGroup;", "component1", "()Ljava/util/List;", "component2", "()Ljava/util/UUID;", "copy", "(Ljava/util/List;Ljava/util/UUID;)Lcom/whoop/weightlifting/data/dto/WorkoutTemplateGroupDto;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getWorkoutExercises", "getWorkoutExercises$annotations", "()V", "Ljava/util/UUID;", "getId", "getId$annotations", "Companion", "$serializer", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WorkoutTemplateGroupDto {

    @SerializedName("group_id")
    private final UUID id;

    @SerializedName("workout_exercises")
    private final List<WorkoutTemplateExerciseDto> workoutExercises;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C22837a(15)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weightlifting/data/dto/WorkoutTemplateGroupDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weightlifting/data/dto/WorkoutTemplateGroupDto;", "serializer", "()Lwc3/c;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return WorkoutTemplateGroupDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WorkoutTemplateGroupDto(int i13, List list, UUID uuid, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, WorkoutTemplateGroupDto$$serializer.INSTANCE.getDescriptor());
        }
        this.workoutExercises = list;
        this.id = uuid;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(WorkoutTemplateExerciseDto$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WorkoutTemplateGroupDto copy$default(WorkoutTemplateGroupDto workoutTemplateGroupDto, List list, UUID uuid, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = workoutTemplateGroupDto.workoutExercises;
        }
        if ((i13 & 2) != 0) {
            uuid = workoutTemplateGroupDto.id;
        }
        return workoutTemplateGroupDto.copy(list, uuid);
    }

    @InterfaceC37143h("group_id")
    @InterfaceC37144i(with = C24753c.class)
    public static /* synthetic */ void getId$annotations() {
    }

    @InterfaceC37143h("workout_exercises")
    public static /* synthetic */ void getWorkoutExercises$annotations() {
    }

    public static final /* synthetic */ void write$Self$weightlifting_release(WorkoutTemplateGroupDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) $childSerializers[0].getValue(), self.workoutExercises);
        output.encodeNullableSerializableElement(serialDesc, 1, C24753c.f96791a, self.id);
    }

    public final List<WorkoutTemplateExerciseDto> component1() {
        return this.workoutExercises;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final UUID getId() {
        return this.id;
    }

    public final WorkoutTemplateGroupDto copy(List<WorkoutTemplateExerciseDto> workoutExercises, UUID id4) {
        AbstractC22676k.m65750j(workoutExercises, "workoutExercises");
        return new WorkoutTemplateGroupDto(workoutExercises, id4);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorkoutTemplateGroupDto)) {
            return false;
        }
        WorkoutTemplateGroupDto workoutTemplateGroupDto = (WorkoutTemplateGroupDto) other;
        return AbstractC22676k.m65745e(this.workoutExercises, workoutTemplateGroupDto.workoutExercises) && AbstractC22676k.m65745e(this.id, workoutTemplateGroupDto.id);
    }

    public final UUID getId() {
        return this.id;
    }

    public final List<WorkoutTemplateExerciseDto> getWorkoutExercises() {
        return this.workoutExercises;
    }

    public int hashCode() {
        int iHashCode = this.workoutExercises.hashCode() * 31;
        UUID uuid = this.id;
        return iHashCode + (uuid == null ? 0 : uuid.hashCode());
    }

    public String toString() {
        return "WorkoutTemplateGroupDto(workoutExercises=" + this.workoutExercises + ", id=" + this.id + ")";
    }

    public final WorkoutGroup toWorkoutGroup() {
        List<WorkoutTemplateExerciseDto> list = this.workoutExercises;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((WorkoutTemplateExerciseDto) it.next()).toWorkoutExercise());
        }
        UUID uuidRandomUUID = this.id;
        if (uuidRandomUUID == null) {
            uuidRandomUUID = UUID.randomUUID();
        }
        AbstractC22676k.m65747g(uuidRandomUUID);
        return new WorkoutGroup(arrayList, uuidRandomUUID);
    }

    public WorkoutTemplateGroupDto(List<WorkoutTemplateExerciseDto> workoutExercises, UUID uuid) {
        AbstractC22676k.m65750j(workoutExercises, "workoutExercises");
        this.workoutExercises = workoutExercises;
        this.id = uuid;
    }
}
