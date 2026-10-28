package com.whoop.weightlifting.data.domain;

import c93.InterfaceC4339a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.weightlifting.data.domain.WorkoutGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import jp1.C21864p;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import lu2.C24753c;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wb3.AbstractC37056f;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000256B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÂ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u0012\u0004\b'\u0010(R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u001aR!\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u000fR\u0011\u00100\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b/\u0010!R\u0011\u00101\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0011\u00104\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b3\u0010!¨\u00067"}, m65681d2 = {"Lcom/whoop/weightlifting/data/domain/WorkoutGroup;", "", "", "Lcom/whoop/weightlifting/data/domain/WorkoutExercise;", "_exercises", "Ljava/util/UUID;", "id", "<init>", "(Ljava/util/List;Ljava/util/UUID;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/UUID;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/util/List;", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weightlifting_release", "(Lcom/whoop/weightlifting/data/domain/WorkoutGroup;Lzc3/c;Lyc3/g;)V", "write$Self", "component2", "()Ljava/util/UUID;", "copy", "(Ljava/util/List;Ljava/util/UUID;)Lcom/whoop/weightlifting/data/domain/WorkoutGroup;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "get_exercises$annotations", "()V", "Ljava/util/UUID;", "getId", "exercises$delegate", "Ll83/h;", "getExercises", "exercises", "getNumSetsPerExercise", "numSetsPerExercise", "isSuperset", "()Z", "getTotalSets", "totalSets", "Companion", "$serializer", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WorkoutGroup {
    private final List<WorkoutExercise> _exercises;

    /* JADX INFO: renamed from: exercises$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h exercises;
    private final UUID id;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C21864p(24)), null};

    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\r\u001a\u00020\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000f¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/weightlifting/data/domain/WorkoutGroup$Companion;", "", "<init>", "()V", "", "Lcom/whoop/weightlifting/data/domain/WorkoutSet;", "sets", "Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;", "exercise", "Ljava/util/UUID;", "exerciseId", "groupId", "Lcom/whoop/weightlifting/data/domain/WorkoutGroup;", "withSingleExercise", "(Ljava/util/List;Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;Ljava/util/UUID;Ljava/util/UUID;)Lcom/whoop/weightlifting/data/domain/WorkoutGroup;", "Lwc3/c;", "serializer", "()Lwc3/c;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ WorkoutGroup withSingleExercise$default(Companion companion, List list, WeightliftingExercise weightliftingExercise, UUID uuid, UUID uuid2, int i13, Object obj) {
            if ((i13 & 4) != 0) {
                uuid = UUID.randomUUID();
                AbstractC22676k.m65749i(uuid, "randomUUID(...)");
            }
            if ((i13 & 8) != 0) {
                uuid2 = UUID.randomUUID();
                AbstractC22676k.m65749i(uuid2, "randomUUID(...)");
            }
            return companion.withSingleExercise(list, weightliftingExercise, uuid, uuid2);
        }

        public final InterfaceC37138c serializer() {
            return WorkoutGroup$$serializer.INSTANCE;
        }

        public final WorkoutGroup withSingleExercise(List<WorkoutSet> sets, WeightliftingExercise exercise, UUID exerciseId, UUID groupId) {
            AbstractC22676k.m65750j(sets, "sets");
            AbstractC22676k.m65750j(exercise, "exercise");
            AbstractC22676k.m65750j(exerciseId, "exerciseId");
            AbstractC22676k.m65750j(groupId, "groupId");
            return new WorkoutGroup(AbstractC37056f.m118958J(new WorkoutExercise(sets, exercise, exerciseId)), groupId);
        }

        private Companion() {
        }
    }

    public /* synthetic */ WorkoutGroup(int i13, List list, UUID uuid, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, WorkoutGroup$$serializer.INSTANCE.getDescriptor());
        }
        this._exercises = list;
        if ((i13 & 2) == 0) {
            UUID uuidRandomUUID = UUID.randomUUID();
            AbstractC22676k.m65749i(uuidRandomUUID, "randomUUID(...)");
            this.id = uuidRandomUUID;
        } else {
            this.id = uuid;
        }
        final int i14 = 0;
        this.exercises = AbstractC30060g.m92088H(new InterfaceC4339a() { // from class: ju2.a
            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return WorkoutGroup._init_$lambda$0(this);
                    default:
                        return WorkoutGroup.exercises_delegate$lambda$0(this);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(WorkoutExercise$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List _init_$lambda$0(WorkoutGroup workoutGroup) {
        Integer num;
        Iterator<T> it = workoutGroup._exercises.iterator();
        if (it.hasNext()) {
            Integer numValueOf = Integer.valueOf(((WorkoutExercise) it.next()).getSets().size());
            while (it.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(((WorkoutExercise) it.next()).getSets().size());
                if (numValueOf.compareTo(numValueOf2) > 0) {
                    numValueOf = numValueOf2;
                }
            }
            num = numValueOf;
        } else {
            num = null;
        }
        int iIntValue = num != null ? num.intValue() : 0;
        List<WorkoutExercise> list = workoutGroup._exercises;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it3 = list.iterator();
            while (it3.hasNext()) {
                if (((WorkoutExercise) it3.next()).getSets().size() != iIntValue) {
                    List<WorkoutExercise> list2 = workoutGroup._exercises;
                    ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
                    for (WorkoutExercise workoutExercise : list2) {
                        arrayList.add(WorkoutExercise.copy$default(workoutExercise, AbstractC25265s.m74156w1(workoutExercise.getSets(), iIntValue), null, null, 6, null));
                    }
                    return arrayList;
                }
            }
        }
        return workoutGroup._exercises;
    }

    private final List<WorkoutExercise> component1() {
        return this._exercises;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WorkoutGroup copy$default(WorkoutGroup workoutGroup, List list, UUID uuid, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = workoutGroup._exercises;
        }
        if ((i13 & 2) != 0) {
            uuid = workoutGroup.id;
        }
        return workoutGroup.copy(list, uuid);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List exercises_delegate$lambda$0(WorkoutGroup workoutGroup) {
        Integer num;
        Iterator<T> it = workoutGroup._exercises.iterator();
        if (it.hasNext()) {
            Integer numValueOf = Integer.valueOf(((WorkoutExercise) it.next()).getSets().size());
            while (it.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(((WorkoutExercise) it.next()).getSets().size());
                if (numValueOf.compareTo(numValueOf2) > 0) {
                    numValueOf = numValueOf2;
                }
            }
            num = numValueOf;
        } else {
            num = null;
        }
        int iIntValue = num != null ? num.intValue() : 0;
        List<WorkoutExercise> list = workoutGroup._exercises;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it3 = list.iterator();
            while (it3.hasNext()) {
                if (((WorkoutExercise) it3.next()).getSets().size() != iIntValue) {
                    List<WorkoutExercise> list2 = workoutGroup._exercises;
                    ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
                    for (WorkoutExercise workoutExercise : list2) {
                        arrayList.add(WorkoutExercise.copy$default(workoutExercise, AbstractC25265s.m74156w1(workoutExercise.getSets(), iIntValue), null, null, 6, null));
                    }
                    return arrayList;
                }
            }
        }
        return workoutGroup._exercises;
    }

    @InterfaceC37143h("exercises")
    private static /* synthetic */ void get_exercises$annotations() {
    }

    public static final /* synthetic */ void write$Self$weightlifting_release(WorkoutGroup self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) $childSerializers[0].getValue(), self._exercises);
        if (!output.shouldEncodeElementDefault(serialDesc, 1)) {
            UUID uuid = self.id;
            UUID uuidRandomUUID = UUID.randomUUID();
            AbstractC22676k.m65749i(uuidRandomUUID, "randomUUID(...)");
            if (AbstractC22676k.m65745e(uuid, uuidRandomUUID)) {
                return;
            }
        }
        output.encodeSerializableElement(serialDesc, 1, C24753c.f96791a, self.id);
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final UUID getId() {
        return this.id;
    }

    public final WorkoutGroup copy(List<WorkoutExercise> _exercises, UUID id4) {
        AbstractC22676k.m65750j(_exercises, "_exercises");
        AbstractC22676k.m65750j(id4, "id");
        return new WorkoutGroup(_exercises, id4);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorkoutGroup)) {
            return false;
        }
        WorkoutGroup workoutGroup = (WorkoutGroup) other;
        return AbstractC22676k.m65745e(this._exercises, workoutGroup._exercises) && AbstractC22676k.m65745e(this.id, workoutGroup.id);
    }

    public final List<WorkoutExercise> getExercises() {
        return (List) this.exercises.getValue();
    }

    public final UUID getId() {
        return this.id;
    }

    public final int getNumSetsPerExercise() {
        List<WorkoutSet> sets;
        WorkoutExercise workoutExercise = (WorkoutExercise) AbstractC25265s.m74100H0(getExercises());
        if (workoutExercise == null || (sets = workoutExercise.getSets()) == null) {
            return 0;
        }
        return sets.size();
    }

    public final int getTotalSets() {
        Iterator<T> it = getExercises().iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((WorkoutExercise) it.next()).getSets().size();
        }
        return size;
    }

    public int hashCode() {
        return this.id.hashCode() + (this._exercises.hashCode() * 31);
    }

    public final boolean isSuperset() {
        return getExercises().size() > 1;
    }

    public String toString() {
        return "WorkoutGroup(_exercises=" + this._exercises + ", id=" + this.id + ")";
    }

    public WorkoutGroup(List<WorkoutExercise> _exercises, UUID id4) {
        AbstractC22676k.m65750j(_exercises, "_exercises");
        AbstractC22676k.m65750j(id4, "id");
        this._exercises = _exercises;
        this.id = id4;
        final int i13 = 1;
        this.exercises = AbstractC30060g.m92088H(new InterfaceC4339a() { // from class: ju2.a
            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return WorkoutGroup._init_$lambda$0(this);
                    default:
                        return WorkoutGroup.exercises_delegate$lambda$0(this);
                }
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ WorkoutGroup(List list, UUID uuid, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 2) != 0) {
            uuid = UUID.randomUUID();
            AbstractC22676k.m65749i(uuid, "randomUUID(...)");
        }
        this(list, uuid);
    }
}
