package com.whoop.weightlifting.data.domain;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import java.util.UUID;
import jp1.C21864p;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import lu2.C24753c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ4\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001e¨\u00062"}, m65681d2 = {"Lcom/whoop/weightlifting/data/domain/WorkoutExercise;", "", "", "Lcom/whoop/weightlifting/data/domain/WorkoutSet;", "sets", "Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;", "exercise", "Ljava/util/UUID;", "id", "<init>", "(Ljava/util/List;Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;Ljava/util/UUID;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;Ljava/util/UUID;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weightlifting_release", "(Lcom/whoop/weightlifting/data/domain/WorkoutExercise;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;", "component3", "()Ljava/util/UUID;", "copy", "(Ljava/util/List;Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;Ljava/util/UUID;)Lcom/whoop/weightlifting/data/domain/WorkoutExercise;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getSets", "Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;", "getExercise", "Ljava/util/UUID;", "getId", "Companion", "$serializer", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WorkoutExercise {
    private final WeightliftingExercise exercise;
    private final UUID id;
    private final List<WorkoutSet> sets;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C21864p(23)), null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weightlifting/data/domain/WorkoutExercise$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weightlifting/data/domain/WorkoutExercise;", "serializer", "()Lwc3/c;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return WorkoutExercise$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WorkoutExercise(int i13, List list, WeightliftingExercise weightliftingExercise, UUID uuid, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, WorkoutExercise$$serializer.INSTANCE.getDescriptor());
        }
        this.sets = list;
        this.exercise = weightliftingExercise;
        if ((i13 & 4) != 0) {
            this.id = uuid;
            return;
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        AbstractC22676k.m65749i(uuidRandomUUID, "randomUUID(...)");
        this.id = uuidRandomUUID;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(WorkoutSet$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WorkoutExercise copy$default(WorkoutExercise workoutExercise, List list, WeightliftingExercise weightliftingExercise, UUID uuid, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = workoutExercise.sets;
        }
        if ((i13 & 2) != 0) {
            weightliftingExercise = workoutExercise.exercise;
        }
        if ((i13 & 4) != 0) {
            uuid = workoutExercise.id;
        }
        return workoutExercise.copy(list, weightliftingExercise, uuid);
    }

    public static final /* synthetic */ void write$Self$weightlifting_release(WorkoutExercise self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) $childSerializers[0].getValue(), self.sets);
        output.encodeSerializableElement(serialDesc, 1, WeightliftingExercise$$serializer.INSTANCE, self.exercise);
        if (!output.shouldEncodeElementDefault(serialDesc, 2)) {
            UUID uuid = self.id;
            UUID uuidRandomUUID = UUID.randomUUID();
            AbstractC22676k.m65749i(uuidRandomUUID, "randomUUID(...)");
            if (AbstractC22676k.m65745e(uuid, uuidRandomUUID)) {
                return;
            }
        }
        output.encodeSerializableElement(serialDesc, 2, C24753c.f96791a, self.id);
    }

    public final List<WorkoutSet> component1() {
        return this.sets;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final WeightliftingExercise getExercise() {
        return this.exercise;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final UUID getId() {
        return this.id;
    }

    public final WorkoutExercise copy(List<WorkoutSet> sets, WeightliftingExercise exercise, UUID id4) {
        AbstractC22676k.m65750j(sets, "sets");
        AbstractC22676k.m65750j(exercise, "exercise");
        AbstractC22676k.m65750j(id4, "id");
        return new WorkoutExercise(sets, exercise, id4);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorkoutExercise)) {
            return false;
        }
        WorkoutExercise workoutExercise = (WorkoutExercise) other;
        return AbstractC22676k.m65745e(this.sets, workoutExercise.sets) && AbstractC22676k.m65745e(this.exercise, workoutExercise.exercise) && AbstractC22676k.m65745e(this.id, workoutExercise.id);
    }

    public final WeightliftingExercise getExercise() {
        return this.exercise;
    }

    public final UUID getId() {
        return this.id;
    }

    public final List<WorkoutSet> getSets() {
        return this.sets;
    }

    public int hashCode() {
        return this.id.hashCode() + ((this.exercise.hashCode() + (this.sets.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "WorkoutExercise(sets=" + this.sets + ", exercise=" + this.exercise + ", id=" + this.id + ")";
    }

    public WorkoutExercise(List<WorkoutSet> sets, WeightliftingExercise exercise, UUID id4) {
        AbstractC22676k.m65750j(sets, "sets");
        AbstractC22676k.m65750j(exercise, "exercise");
        AbstractC22676k.m65750j(id4, "id");
        this.sets = sets;
        this.exercise = exercise;
        this.id = id4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ WorkoutExercise(List list, WeightliftingExercise weightliftingExercise, UUID uuid, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 4) != 0) {
            uuid = UUID.randomUUID();
            AbstractC22676k.m65749i(uuid, "randomUUID(...)");
        }
        this(list, weightliftingExercise, uuid);
    }
}
