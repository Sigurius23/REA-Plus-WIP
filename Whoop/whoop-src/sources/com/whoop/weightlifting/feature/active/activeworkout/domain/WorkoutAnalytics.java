package com.whoop.weightlifting.feature.active.activeworkout.domain;

import androidx.annotation.Keep;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import java.util.Set;
import java.util.UUID;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import lu2.C24753c;
import m83.C25235a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import no2.C26995a;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p127ev.AbstractC13673n;
import p319m4.AbstractC25012a;
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
@Keep
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0002EFB\u0081\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012B\u0083\u0001\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0011\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b$\u0010 J\u008a\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0010\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u0018J\u001a\u0010,\u001a\u00020\n2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-J'\u00106\u001a\u0002032\u0006\u0010.\u001a\u00020\u00002\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0001¢\u0006\u0004\b4\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00107\u001a\u0004\b9\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b:\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b;\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b<\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b=\u0010\u0018R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b>\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010?\u001a\u0004\b@\u0010 R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010A\u001a\u0004\bB\u0010\"R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000f\u0010A\u001a\u0004\bC\u0010\"R\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010?\u001a\u0004\b\u0010\u0010 ¨\u0006G"}, m65681d2 = {"Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;", "", "", "numExercisesAddedDuringWorkout", "numExercisesRemovedDuringWorkout", "numSetsAddedDuringWorkout", "numSetsRemovedDuringWorkout", "numDragAndDrops", "numTimesPlayButtonClicked", "numSetsCancelled", "", "changedTemplate", "", "Ljava/util/UUID;", "setIdsRepsEditedDuringWorkout", "setIdsWeightEditedDuringWorkout", "isQuickStart", "<init>", "(IIIIIIIZLjava/util/Set;Ljava/util/Set;Z)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIIIIIIIZLjava/util/Set;Ljava/util/Set;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()I", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "()Z", "component9", "()Ljava/util/Set;", "component10", "component11", "copy", "(IIIIIIIZLjava/util/Set;Ljava/util/Set;Z)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weightlifting_release", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;Lzc3/c;Lyc3/g;)V", "write$Self", "I", "getNumExercisesAddedDuringWorkout", "getNumExercisesRemovedDuringWorkout", "getNumSetsAddedDuringWorkout", "getNumSetsRemovedDuringWorkout", "getNumDragAndDrops", "getNumTimesPlayButtonClicked", "getNumSetsCancelled", "Z", "getChangedTemplate", "Ljava/util/Set;", "getSetIdsRepsEditedDuringWorkout", "getSetIdsWeightEditedDuringWorkout", "Companion", "$serializer", "a", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WorkoutAnalytics {
    private static final InterfaceC23462h[] $childSerializers;
    private final boolean changedTemplate;
    private final boolean isQuickStart;
    private final int numDragAndDrops;
    private final int numExercisesAddedDuringWorkout;
    private final int numExercisesRemovedDuringWorkout;
    private final int numSetsAddedDuringWorkout;
    private final int numSetsCancelled;
    private final int numSetsRemovedDuringWorkout;
    private final int numTimesPlayButtonClicked;
    private final Set<UUID> setIdsRepsEditedDuringWorkout;
    private final Set<UUID> setIdsWeightEditedDuringWorkout;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.weightlifting.feature.active.activeworkout.domain.WorkoutAnalytics$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;", "serializer", "()Lwc3/c;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return WorkoutAnalytics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C26995a(28)), AbstractC30060g.m92087G(enumC23463i, new C26995a(29)), null};
    }

    public WorkoutAnalytics() {
        this(0, 0, 0, 0, 0, 0, 0, false, (Set) null, (Set) null, false, 2047, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new LinkedHashSetSerializer(C24753c.f96791a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new LinkedHashSetSerializer(C24753c.f96791a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WorkoutAnalytics copy$default(WorkoutAnalytics workoutAnalytics, int i13, int i14, int i15, int i16, int i17, int i18, int i19, boolean z4, Set set, Set set2, boolean z13, int i24, Object obj) {
        if ((i24 & 1) != 0) {
            i13 = workoutAnalytics.numExercisesAddedDuringWorkout;
        }
        if ((i24 & 2) != 0) {
            i14 = workoutAnalytics.numExercisesRemovedDuringWorkout;
        }
        if ((i24 & 4) != 0) {
            i15 = workoutAnalytics.numSetsAddedDuringWorkout;
        }
        if ((i24 & 8) != 0) {
            i16 = workoutAnalytics.numSetsRemovedDuringWorkout;
        }
        if ((i24 & 16) != 0) {
            i17 = workoutAnalytics.numDragAndDrops;
        }
        if ((i24 & 32) != 0) {
            i18 = workoutAnalytics.numTimesPlayButtonClicked;
        }
        if ((i24 & 64) != 0) {
            i19 = workoutAnalytics.numSetsCancelled;
        }
        if ((i24 & 128) != 0) {
            z4 = workoutAnalytics.changedTemplate;
        }
        if ((i24 & 256) != 0) {
            set = workoutAnalytics.setIdsRepsEditedDuringWorkout;
        }
        if ((i24 & 512) != 0) {
            set2 = workoutAnalytics.setIdsWeightEditedDuringWorkout;
        }
        if ((i24 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            z13 = workoutAnalytics.isQuickStart;
        }
        Set set3 = set2;
        boolean z14 = z13;
        boolean z15 = z4;
        Set set4 = set;
        int i25 = i18;
        int i26 = i19;
        int i27 = i17;
        int i28 = i15;
        return workoutAnalytics.copy(i13, i14, i28, i16, i27, i25, i26, z15, set4, set3, z14);
    }

    public static final /* synthetic */ void write$Self$weightlifting_release(WorkoutAnalytics self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.numExercisesAddedDuringWorkout != 0) {
            output.encodeIntElement(serialDesc, 0, self.numExercisesAddedDuringWorkout);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.numExercisesRemovedDuringWorkout != 0) {
            output.encodeIntElement(serialDesc, 1, self.numExercisesRemovedDuringWorkout);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.numSetsAddedDuringWorkout != 0) {
            output.encodeIntElement(serialDesc, 2, self.numSetsAddedDuringWorkout);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.numSetsRemovedDuringWorkout != 0) {
            output.encodeIntElement(serialDesc, 3, self.numSetsRemovedDuringWorkout);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.numDragAndDrops != 0) {
            output.encodeIntElement(serialDesc, 4, self.numDragAndDrops);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.numTimesPlayButtonClicked != 0) {
            output.encodeIntElement(serialDesc, 5, self.numTimesPlayButtonClicked);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.numSetsCancelled != 0) {
            output.encodeIntElement(serialDesc, 6, self.numSetsCancelled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.changedTemplate) {
            output.encodeBooleanElement(serialDesc, 7, self.changedTemplate);
        }
        boolean zShouldEncodeElementDefault = output.shouldEncodeElementDefault(serialDesc, 8);
        C25235a0 c25235a0 = C25235a0.f99113w;
        if (zShouldEncodeElementDefault || !AbstractC22676k.m65745e(self.setIdsRepsEditedDuringWorkout, c25235a0)) {
            output.encodeSerializableElement(serialDesc, 8, (InterfaceC37145j) interfaceC23462hArr[8].getValue(), self.setIdsRepsEditedDuringWorkout);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || !AbstractC22676k.m65745e(self.setIdsWeightEditedDuringWorkout, c25235a0)) {
            output.encodeSerializableElement(serialDesc, 9, (InterfaceC37145j) interfaceC23462hArr[9].getValue(), self.setIdsWeightEditedDuringWorkout);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.isQuickStart) {
            output.encodeBooleanElement(serialDesc, 10, self.isQuickStart);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getNumExercisesAddedDuringWorkout() {
        return this.numExercisesAddedDuringWorkout;
    }

    public final Set<UUID> component10() {
        return this.setIdsWeightEditedDuringWorkout;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getIsQuickStart() {
        return this.isQuickStart;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getNumExercisesRemovedDuringWorkout() {
        return this.numExercisesRemovedDuringWorkout;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getNumSetsAddedDuringWorkout() {
        return this.numSetsAddedDuringWorkout;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getNumSetsRemovedDuringWorkout() {
        return this.numSetsRemovedDuringWorkout;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getNumDragAndDrops() {
        return this.numDragAndDrops;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getNumTimesPlayButtonClicked() {
        return this.numTimesPlayButtonClicked;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getNumSetsCancelled() {
        return this.numSetsCancelled;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getChangedTemplate() {
        return this.changedTemplate;
    }

    public final Set<UUID> component9() {
        return this.setIdsRepsEditedDuringWorkout;
    }

    public final WorkoutAnalytics copy(int numExercisesAddedDuringWorkout, int numExercisesRemovedDuringWorkout, int numSetsAddedDuringWorkout, int numSetsRemovedDuringWorkout, int numDragAndDrops, int numTimesPlayButtonClicked, int numSetsCancelled, boolean changedTemplate, Set<UUID> setIdsRepsEditedDuringWorkout, Set<UUID> setIdsWeightEditedDuringWorkout, boolean isQuickStart) {
        AbstractC22676k.m65750j(setIdsRepsEditedDuringWorkout, "setIdsRepsEditedDuringWorkout");
        AbstractC22676k.m65750j(setIdsWeightEditedDuringWorkout, "setIdsWeightEditedDuringWorkout");
        return new WorkoutAnalytics(numExercisesAddedDuringWorkout, numExercisesRemovedDuringWorkout, numSetsAddedDuringWorkout, numSetsRemovedDuringWorkout, numDragAndDrops, numTimesPlayButtonClicked, numSetsCancelled, changedTemplate, setIdsRepsEditedDuringWorkout, setIdsWeightEditedDuringWorkout, isQuickStart);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorkoutAnalytics)) {
            return false;
        }
        WorkoutAnalytics workoutAnalytics = (WorkoutAnalytics) other;
        return this.numExercisesAddedDuringWorkout == workoutAnalytics.numExercisesAddedDuringWorkout && this.numExercisesRemovedDuringWorkout == workoutAnalytics.numExercisesRemovedDuringWorkout && this.numSetsAddedDuringWorkout == workoutAnalytics.numSetsAddedDuringWorkout && this.numSetsRemovedDuringWorkout == workoutAnalytics.numSetsRemovedDuringWorkout && this.numDragAndDrops == workoutAnalytics.numDragAndDrops && this.numTimesPlayButtonClicked == workoutAnalytics.numTimesPlayButtonClicked && this.numSetsCancelled == workoutAnalytics.numSetsCancelled && this.changedTemplate == workoutAnalytics.changedTemplate && AbstractC22676k.m65745e(this.setIdsRepsEditedDuringWorkout, workoutAnalytics.setIdsRepsEditedDuringWorkout) && AbstractC22676k.m65745e(this.setIdsWeightEditedDuringWorkout, workoutAnalytics.setIdsWeightEditedDuringWorkout) && this.isQuickStart == workoutAnalytics.isQuickStart;
    }

    public final boolean getChangedTemplate() {
        return this.changedTemplate;
    }

    public final int getNumDragAndDrops() {
        return this.numDragAndDrops;
    }

    public final int getNumExercisesAddedDuringWorkout() {
        return this.numExercisesAddedDuringWorkout;
    }

    public final int getNumExercisesRemovedDuringWorkout() {
        return this.numExercisesRemovedDuringWorkout;
    }

    public final int getNumSetsAddedDuringWorkout() {
        return this.numSetsAddedDuringWorkout;
    }

    public final int getNumSetsCancelled() {
        return this.numSetsCancelled;
    }

    public final int getNumSetsRemovedDuringWorkout() {
        return this.numSetsRemovedDuringWorkout;
    }

    public final int getNumTimesPlayButtonClicked() {
        return this.numTimesPlayButtonClicked;
    }

    public final Set<UUID> getSetIdsRepsEditedDuringWorkout() {
        return this.setIdsRepsEditedDuringWorkout;
    }

    public final Set<UUID> getSetIdsWeightEditedDuringWorkout() {
        return this.setIdsWeightEditedDuringWorkout;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isQuickStart) + AbstractC25012a.m73368a(this.setIdsWeightEditedDuringWorkout, AbstractC25012a.m73368a(this.setIdsRepsEditedDuringWorkout, AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.numSetsCancelled, AbstractC11266d.m30448b(this.numTimesPlayButtonClicked, AbstractC11266d.m30448b(this.numDragAndDrops, AbstractC11266d.m30448b(this.numSetsRemovedDuringWorkout, AbstractC11266d.m30448b(this.numSetsAddedDuringWorkout, AbstractC11266d.m30448b(this.numExercisesRemovedDuringWorkout, Integer.hashCode(this.numExercisesAddedDuringWorkout) * 31, 31), 31), 31), 31), 31), 31), 31, this.changedTemplate), 31), 31);
    }

    public final boolean isQuickStart() {
        return this.isQuickStart;
    }

    public String toString() {
        int i13 = this.numExercisesAddedDuringWorkout;
        int i14 = this.numExercisesRemovedDuringWorkout;
        int i15 = this.numSetsAddedDuringWorkout;
        int i16 = this.numSetsRemovedDuringWorkout;
        int i17 = this.numDragAndDrops;
        int i18 = this.numTimesPlayButtonClicked;
        int i19 = this.numSetsCancelled;
        boolean z4 = this.changedTemplate;
        Set<UUID> set = this.setIdsRepsEditedDuringWorkout;
        Set<UUID> set2 = this.setIdsWeightEditedDuringWorkout;
        boolean z13 = this.isQuickStart;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "WorkoutAnalytics(numExercisesAddedDuringWorkout=", ", numExercisesRemovedDuringWorkout=", ", numSetsAddedDuringWorkout=");
        AbstractC30802r.m94773v(sbM30465s, i15, ", numSetsRemovedDuringWorkout=", i16, ", numDragAndDrops=");
        AbstractC30802r.m94773v(sbM30465s, i17, ", numTimesPlayButtonClicked=", i18, ", numSetsCancelled=");
        AbstractC13673n.m38573t(i19, ", changedTemplate=", ", setIdsRepsEditedDuringWorkout=", sbM30465s, z4);
        sbM30465s.append(set);
        sbM30465s.append(", setIdsWeightEditedDuringWorkout=");
        sbM30465s.append(set2);
        sbM30465s.append(", isQuickStart=");
        return AbstractC18489d0.m53372m(sbM30465s, z13, ")");
    }

    public /* synthetic */ WorkoutAnalytics(int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i24, boolean z4, Set set, Set set2, boolean z13, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.numExercisesAddedDuringWorkout = 0;
        } else {
            this.numExercisesAddedDuringWorkout = i14;
        }
        if ((i13 & 2) == 0) {
            this.numExercisesRemovedDuringWorkout = 0;
        } else {
            this.numExercisesRemovedDuringWorkout = i15;
        }
        if ((i13 & 4) == 0) {
            this.numSetsAddedDuringWorkout = 0;
        } else {
            this.numSetsAddedDuringWorkout = i16;
        }
        if ((i13 & 8) == 0) {
            this.numSetsRemovedDuringWorkout = 0;
        } else {
            this.numSetsRemovedDuringWorkout = i17;
        }
        if ((i13 & 16) == 0) {
            this.numDragAndDrops = 0;
        } else {
            this.numDragAndDrops = i18;
        }
        if ((i13 & 32) == 0) {
            this.numTimesPlayButtonClicked = 0;
        } else {
            this.numTimesPlayButtonClicked = i19;
        }
        if ((i13 & 64) == 0) {
            this.numSetsCancelled = 0;
        } else {
            this.numSetsCancelled = i24;
        }
        if ((i13 & 128) == 0) {
            this.changedTemplate = false;
        } else {
            this.changedTemplate = z4;
        }
        int i25 = i13 & 256;
        C25235a0 c25235a0 = C25235a0.f99113w;
        if (i25 == 0) {
            this.setIdsRepsEditedDuringWorkout = c25235a0;
        } else {
            this.setIdsRepsEditedDuringWorkout = set;
        }
        if ((i13 & 512) == 0) {
            this.setIdsWeightEditedDuringWorkout = c25235a0;
        } else {
            this.setIdsWeightEditedDuringWorkout = set2;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
            this.isQuickStart = false;
        } else {
            this.isQuickStart = z13;
        }
    }

    public WorkoutAnalytics(int i13, int i14, int i15, int i16, int i17, int i18, int i19, boolean z4, Set<UUID> setIdsRepsEditedDuringWorkout, Set<UUID> setIdsWeightEditedDuringWorkout, boolean z13) {
        AbstractC22676k.m65750j(setIdsRepsEditedDuringWorkout, "setIdsRepsEditedDuringWorkout");
        AbstractC22676k.m65750j(setIdsWeightEditedDuringWorkout, "setIdsWeightEditedDuringWorkout");
        this.numExercisesAddedDuringWorkout = i13;
        this.numExercisesRemovedDuringWorkout = i14;
        this.numSetsAddedDuringWorkout = i15;
        this.numSetsRemovedDuringWorkout = i16;
        this.numDragAndDrops = i17;
        this.numTimesPlayButtonClicked = i18;
        this.numSetsCancelled = i19;
        this.changedTemplate = z4;
        this.setIdsRepsEditedDuringWorkout = setIdsRepsEditedDuringWorkout;
        this.setIdsWeightEditedDuringWorkout = setIdsWeightEditedDuringWorkout;
        this.isQuickStart = z13;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ WorkoutAnalytics(int i13, int i14, int i15, int i16, int i17, int i18, int i19, boolean z4, Set set, Set set2, boolean z13, int i24, DefaultConstructorMarker defaultConstructorMarker) {
        i13 = (i24 & 1) != 0 ? 0 : i13;
        i14 = (i24 & 2) != 0 ? 0 : i14;
        i15 = (i24 & 4) != 0 ? 0 : i15;
        i16 = (i24 & 8) != 0 ? 0 : i16;
        i17 = (i24 & 16) != 0 ? 0 : i17;
        i18 = (i24 & 32) != 0 ? 0 : i18;
        i19 = (i24 & 64) != 0 ? 0 : i19;
        z4 = (i24 & 128) != 0 ? false : z4;
        int i25 = i24 & 256;
        C25235a0 c25235a0 = C25235a0.f99113w;
        this(i13, i14, i15, i16, i17, i18, i19, z4, i25 != 0 ? c25235a0 : set, (i24 & 512) != 0 ? c25235a0 : set2, (i24 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? false : z13);
    }
}
