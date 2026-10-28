package com.whoop.weightlifting.data.domain;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import jp1.C21864p;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p555vl.AbstractC36095b;
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
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002=>B=\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fBS\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0000¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b(\u0010%JN\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b+\u0010%J\u0010\u0010,\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u0010.\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\"R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b4\u0010%R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u0010'R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b7\u0010%R\u0017\u0010<\u001a\b\u0012\u0004\u0012\u000209088F¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006?"}, m65681d2 = {"Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;", "", "", "parentTemplateKey", "workoutTemplateKey", "", "name", "", "Lcom/whoop/weightlifting/data/domain/WorkoutGroup;", "groups", "source", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "withNormalizedIds", "()Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weightlifting_release", "(Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;Lzc3/c;Lyc3/g;)V", "write$Self", "other", "", "hasSameContentAs", "(Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;)Z", "component1", "()Ljava/lang/Long;", "component2", "component3", "()Ljava/lang/String;", "component4", "()Ljava/util/List;", "component5", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;", "toString", "hashCode", "()I", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "getParentTemplateKey", "getWorkoutTemplateKey", "Ljava/lang/String;", "getName", "Ljava/util/List;", "getGroups", "getSource", "", "Ljava/util/UUID;", "getAllExerciseIds", "()Ljava/util/Set;", "allExerciseIds", "Companion", "$serializer", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WorkoutTemplate {
    private static final UUID idForNormalization;
    private final List<WorkoutGroup> groups;
    private final String name;
    private final Long parentTemplateKey;
    private final String source;
    private final Long workoutTemplateKey;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C21864p(25)), null};
    private static final WorkoutTemplate empty = new WorkoutTemplate((Long) null, (Long) null, "", C25271y.f99162w, (String) null, 16, (DefaultConstructorMarker) null);

    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/weightlifting/data/domain/WorkoutTemplate$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;", "serializer", "()Lwc3/c;", "empty", "Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;", "getEmpty", "()Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;", "Ljava/util/UUID;", "idForNormalization", "Ljava/util/UUID;", "getIdForNormalization", "()Ljava/util/UUID;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final WorkoutTemplate getEmpty() {
            return WorkoutTemplate.empty;
        }

        public final UUID getIdForNormalization() {
            return WorkoutTemplate.idForNormalization;
        }

        public final InterfaceC37138c serializer() {
            return WorkoutTemplate$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        UUID uuidRandomUUID = UUID.randomUUID();
        AbstractC22676k.m65749i(uuidRandomUUID, "randomUUID(...)");
        idForNormalization = uuidRandomUUID;
    }

    public /* synthetic */ WorkoutTemplate(int i13, Long l7, Long l12, String str, List list, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, WorkoutTemplate$$serializer.INSTANCE.getDescriptor());
        }
        this.parentTemplateKey = l7;
        this.workoutTemplateKey = l12;
        this.name = str;
        this.groups = list;
        if ((i13 & 16) == 0) {
            this.source = null;
        } else {
            this.source = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(WorkoutGroup$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WorkoutTemplate copy$default(WorkoutTemplate workoutTemplate, Long l7, Long l12, String str, List list, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            l7 = workoutTemplate.parentTemplateKey;
        }
        if ((i13 & 2) != 0) {
            l12 = workoutTemplate.workoutTemplateKey;
        }
        if ((i13 & 4) != 0) {
            str = workoutTemplate.name;
        }
        if ((i13 & 8) != 0) {
            list = workoutTemplate.groups;
        }
        if ((i13 & 16) != 0) {
            str2 = workoutTemplate.source;
        }
        String str3 = str2;
        String str4 = str;
        return workoutTemplate.copy(l7, l12, str4, list, str3);
    }

    private final WorkoutTemplate withNormalizedIds() {
        String str = this.name;
        List<WorkoutGroup> list = this.groups;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (WorkoutGroup workoutGroup : list) {
            List<WorkoutExercise> exercises = workoutGroup.getExercises();
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(exercises, 10));
            for (WorkoutExercise workoutExercise : exercises) {
                List<WorkoutSet> sets = workoutExercise.getSets();
                ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(sets, 10));
                Iterator<T> it = sets.iterator();
                while (it.hasNext()) {
                    arrayList3.add(WorkoutSet.copy$default((WorkoutSet) it.next(), null, null, null, idForNormalization, 7, null));
                }
                arrayList2.add(WorkoutExercise.copy$default(workoutExercise, arrayList3, null, idForNormalization, 2, null));
            }
            arrayList.add(workoutGroup.copy(arrayList2, idForNormalization));
        }
        return copy$default(this, null, null, str, arrayList, null, 19, null);
    }

    public static final /* synthetic */ void write$Self$weightlifting_release(WorkoutTemplate self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, longSerializer, self.parentTemplateKey);
        output.encodeNullableSerializableElement(serialDesc, 1, longSerializer, self.workoutTemplateKey);
        output.encodeStringElement(serialDesc, 2, self.name);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.groups);
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.source == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.source);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getParentTemplateKey() {
        return this.parentTemplateKey;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getWorkoutTemplateKey() {
        return this.workoutTemplateKey;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final List<WorkoutGroup> component4() {
        return this.groups;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final WorkoutTemplate copy(Long parentTemplateKey, Long workoutTemplateKey, String name, List<WorkoutGroup> groups, String source) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(groups, "groups");
        return new WorkoutTemplate(parentTemplateKey, workoutTemplateKey, name, groups, source);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorkoutTemplate)) {
            return false;
        }
        WorkoutTemplate workoutTemplate = (WorkoutTemplate) other;
        return AbstractC22676k.m65745e(this.parentTemplateKey, workoutTemplate.parentTemplateKey) && AbstractC22676k.m65745e(this.workoutTemplateKey, workoutTemplate.workoutTemplateKey) && AbstractC22676k.m65745e(this.name, workoutTemplate.name) && AbstractC22676k.m65745e(this.groups, workoutTemplate.groups) && AbstractC22676k.m65745e(this.source, workoutTemplate.source);
    }

    public final Set<UUID> getAllExerciseIds() {
        List<WorkoutGroup> list = this.groups;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            List<WorkoutExercise> exercises = ((WorkoutGroup) it.next()).getExercises();
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(exercises, 10));
            Iterator<T> it3 = exercises.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((WorkoutExercise) it3.next()).getId());
            }
            arrayList.add(arrayList2);
        }
        return AbstractC25265s.m74103I1(AbstractC25267u.m74164j0(arrayList));
    }

    public final List<WorkoutGroup> getGroups() {
        return this.groups;
    }

    public final String getName() {
        return this.name;
    }

    public final Long getParentTemplateKey() {
        return this.parentTemplateKey;
    }

    public final String getSource() {
        return this.source;
    }

    public final Long getWorkoutTemplateKey() {
        return this.workoutTemplateKey;
    }

    public final boolean hasSameContentAs(WorkoutTemplate other) {
        AbstractC22676k.m65750j(other, "other");
        return AbstractC22676k.m65745e(withNormalizedIds(), other.withNormalizedIds());
    }

    public int hashCode() {
        Long l7 = this.parentTemplateKey;
        int iHashCode = (l7 == null ? 0 : l7.hashCode()) * 31;
        Long l12 = this.workoutTemplateKey;
        int iM31983b = AbstractC11895b.m31983b(AbstractC11266d.m30450d((iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31, 31, this.name), 31, this.groups);
        String str = this.source;
        return iM31983b + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        Long l7 = this.parentTemplateKey;
        Long l12 = this.workoutTemplateKey;
        String str = this.name;
        List<WorkoutGroup> list = this.groups;
        String str2 = this.source;
        StringBuilder sb4 = new StringBuilder("WorkoutTemplate(parentTemplateKey=");
        sb4.append(l7);
        sb4.append(", workoutTemplateKey=");
        sb4.append(l12);
        sb4.append(", name=");
        AbstractC36095b.m114694v(str, ", groups=", ", source=", sb4, list);
        return AbstractC25012a.m73376i(str2, ")", sb4);
    }

    public WorkoutTemplate(Long l7, Long l12, String name, List<WorkoutGroup> groups, String str) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(groups, "groups");
        this.parentTemplateKey = l7;
        this.workoutTemplateKey = l12;
        this.name = name;
        this.groups = groups;
        this.source = str;
    }

    public /* synthetic */ WorkoutTemplate(Long l7, Long l12, String str, List list, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(l7, l12, str, list, (i13 & 16) != 0 ? null : str2);
    }
}
