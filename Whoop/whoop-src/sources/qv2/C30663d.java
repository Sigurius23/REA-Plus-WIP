package qv2;

import com.whoop.weightlifting.data.dto.WorkoutLibraryModel;
import dw2.C12419a;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import m83.C25271y;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import rv2.EnumC31848f;

/* JADX INFO: renamed from: qv2.d */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015Jz\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b+\u00101R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b-\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b&\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b8\u0010:R\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b3\u00105\u001a\u0004\b/\u00107¨\u0006;"}, m65681d2 = {"Lqv2/d;", "", "Lqv2/b;", "currentDialogType", "", "selectedWorkoutKey", "Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;", "workoutLibraryResult", "", "Ldw2/a;", "pendingWorkouts", "Lqv2/f;", "menuLoadingState", "Lqv2/a;", "shareableWorkoutLink", "", "isExerciseDetailsV2ExperimentEnabled", "Lrv2/f;", "selectedWorkoutLibraryTab", "navigateToEmptyWorkout", "<init>", "(Lqv2/b;Ljava/lang/Long;Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;Ljava/util/List;Lqv2/f;Lqv2/a;ZLrv2/f;Z)V", "a", "(Lqv2/b;Ljava/lang/Long;Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;Ljava/util/List;Lqv2/f;Lqv2/a;ZLrv2/f;Z)Lqv2/d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lqv2/b;", "c", "()Lqv2/b;", "b", "Ljava/lang/Long;", "g", "()Ljava/lang/Long;", "Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;", "j", "()Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;", "d", "Ljava/util/List;", "f", "()Ljava/util/List;", "e", "Lqv2/f;", "()Lqv2/f;", "Lqv2/a;", "i", "()Lqv2/a;", "Z", "k", "()Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lrv2/f;", "()Lrv2/f;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C30663d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC30661b currentDialogType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Long selectedWorkoutKey;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final WorkoutLibraryModel workoutLibraryResult;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<C12419a> pendingWorkouts;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC30665f menuLoadingState;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C30660a shareableWorkoutLink;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean isExerciseDetailsV2ExperimentEnabled;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final EnumC31848f selectedWorkoutLibraryTab;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean navigateToEmptyWorkout;

    public C30663d(InterfaceC30661b currentDialogType, Long l7, WorkoutLibraryModel workoutLibraryModel, List<C12419a> pendingWorkouts, EnumC30665f enumC30665f, C30660a c30660a, boolean z4, EnumC31848f enumC31848f, boolean z13) {
        AbstractC22676k.m65750j(currentDialogType, "currentDialogType");
        AbstractC22676k.m65750j(pendingWorkouts, "pendingWorkouts");
        this.currentDialogType = currentDialogType;
        this.selectedWorkoutKey = l7;
        this.workoutLibraryResult = workoutLibraryModel;
        this.pendingWorkouts = pendingWorkouts;
        this.menuLoadingState = enumC30665f;
        this.shareableWorkoutLink = c30660a;
        this.isExerciseDetailsV2ExperimentEnabled = z4;
        this.selectedWorkoutLibraryTab = enumC31848f;
        this.navigateToEmptyWorkout = z13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C30663d m94231b(C30663d c30663d, InterfaceC30661b interfaceC30661b, Long l7, WorkoutLibraryModel workoutLibraryModel, List list, EnumC30665f enumC30665f, C30660a c30660a, boolean z4, EnumC31848f enumC31848f, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            interfaceC30661b = c30663d.currentDialogType;
        }
        if ((i13 & 2) != 0) {
            l7 = c30663d.selectedWorkoutKey;
        }
        if ((i13 & 4) != 0) {
            workoutLibraryModel = c30663d.workoutLibraryResult;
        }
        if ((i13 & 8) != 0) {
            list = c30663d.pendingWorkouts;
        }
        if ((i13 & 16) != 0) {
            enumC30665f = c30663d.menuLoadingState;
        }
        if ((i13 & 32) != 0) {
            c30660a = c30663d.shareableWorkoutLink;
        }
        if ((i13 & 64) != 0) {
            z4 = c30663d.isExerciseDetailsV2ExperimentEnabled;
        }
        if ((i13 & 128) != 0) {
            enumC31848f = c30663d.selectedWorkoutLibraryTab;
        }
        if ((i13 & 256) != 0) {
            z13 = c30663d.navigateToEmptyWorkout;
        }
        EnumC31848f enumC31848f2 = enumC31848f;
        boolean z14 = z13;
        C30660a c30660a2 = c30660a;
        boolean z15 = z4;
        EnumC30665f enumC30665f2 = enumC30665f;
        WorkoutLibraryModel workoutLibraryModel2 = workoutLibraryModel;
        return c30663d.m94232a(interfaceC30661b, l7, workoutLibraryModel2, list, enumC30665f2, c30660a2, z15, enumC31848f2, z14);
    }

    /* JADX INFO: renamed from: a */
    public final C30663d m94232a(InterfaceC30661b currentDialogType, Long selectedWorkoutKey, WorkoutLibraryModel workoutLibraryResult, List<C12419a> pendingWorkouts, EnumC30665f menuLoadingState, C30660a shareableWorkoutLink, boolean isExerciseDetailsV2ExperimentEnabled, EnumC31848f selectedWorkoutLibraryTab, boolean navigateToEmptyWorkout) {
        AbstractC22676k.m65750j(currentDialogType, "currentDialogType");
        AbstractC22676k.m65750j(pendingWorkouts, "pendingWorkouts");
        return new C30663d(currentDialogType, selectedWorkoutKey, workoutLibraryResult, pendingWorkouts, menuLoadingState, shareableWorkoutLink, isExerciseDetailsV2ExperimentEnabled, selectedWorkoutLibraryTab, navigateToEmptyWorkout);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC30661b getCurrentDialogType() {
        return this.currentDialogType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final EnumC30665f getMenuLoadingState() {
        return this.menuLoadingState;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getNavigateToEmptyWorkout() {
        return this.navigateToEmptyWorkout;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C30663d)) {
            return false;
        }
        C30663d c30663d = (C30663d) other;
        return AbstractC22676k.m65745e(this.currentDialogType, c30663d.currentDialogType) && AbstractC22676k.m65745e(this.selectedWorkoutKey, c30663d.selectedWorkoutKey) && AbstractC22676k.m65745e(this.workoutLibraryResult, c30663d.workoutLibraryResult) && AbstractC22676k.m65745e(this.pendingWorkouts, c30663d.pendingWorkouts) && this.menuLoadingState == c30663d.menuLoadingState && AbstractC22676k.m65745e(this.shareableWorkoutLink, c30663d.shareableWorkoutLink) && this.isExerciseDetailsV2ExperimentEnabled == c30663d.isExerciseDetailsV2ExperimentEnabled && this.selectedWorkoutLibraryTab == c30663d.selectedWorkoutLibraryTab && this.navigateToEmptyWorkout == c30663d.navigateToEmptyWorkout;
    }

    /* JADX INFO: renamed from: f */
    public final List<C12419a> m94236f() {
        return this.pendingWorkouts;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Long getSelectedWorkoutKey() {
        return this.selectedWorkoutKey;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final EnumC31848f getSelectedWorkoutLibraryTab() {
        return this.selectedWorkoutLibraryTab;
    }

    public int hashCode() {
        int iHashCode = this.currentDialogType.hashCode() * 31;
        Long l7 = this.selectedWorkoutKey;
        int iHashCode2 = (iHashCode + (l7 == null ? 0 : l7.hashCode())) * 31;
        WorkoutLibraryModel workoutLibraryModel = this.workoutLibraryResult;
        int iM31983b = AbstractC11895b.m31983b((iHashCode2 + (workoutLibraryModel == null ? 0 : workoutLibraryModel.hashCode())) * 31, 31, this.pendingWorkouts);
        EnumC30665f enumC30665f = this.menuLoadingState;
        int iHashCode3 = (iM31983b + (enumC30665f == null ? 0 : enumC30665f.hashCode())) * 31;
        C30660a c30660a = this.shareableWorkoutLink;
        int iM8289b = AbstractC2875y.m8289b((iHashCode3 + (c30660a == null ? 0 : c30660a.hashCode())) * 31, 31, this.isExerciseDetailsV2ExperimentEnabled);
        EnumC31848f enumC31848f = this.selectedWorkoutLibraryTab;
        return Boolean.hashCode(this.navigateToEmptyWorkout) + ((iM8289b + (enumC31848f != null ? enumC31848f.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final C30660a getShareableWorkoutLink() {
        return this.shareableWorkoutLink;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final WorkoutLibraryModel getWorkoutLibraryResult() {
        return this.workoutLibraryResult;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIsExerciseDetailsV2ExperimentEnabled() {
        return this.isExerciseDetailsV2ExperimentEnabled;
    }

    public String toString() {
        InterfaceC30661b interfaceC30661b = this.currentDialogType;
        Long l7 = this.selectedWorkoutKey;
        WorkoutLibraryModel workoutLibraryModel = this.workoutLibraryResult;
        List<C12419a> list = this.pendingWorkouts;
        EnumC30665f enumC30665f = this.menuLoadingState;
        C30660a c30660a = this.shareableWorkoutLink;
        boolean z4 = this.isExerciseDetailsV2ExperimentEnabled;
        EnumC31848f enumC31848f = this.selectedWorkoutLibraryTab;
        boolean z13 = this.navigateToEmptyWorkout;
        StringBuilder sb4 = new StringBuilder("WorkoutLibraryDomainState(currentDialogType=");
        sb4.append(interfaceC30661b);
        sb4.append(", selectedWorkoutKey=");
        sb4.append(l7);
        sb4.append(", workoutLibraryResult=");
        sb4.append(workoutLibraryModel);
        sb4.append(", pendingWorkouts=");
        sb4.append(list);
        sb4.append(", menuLoadingState=");
        sb4.append(enumC30665f);
        sb4.append(", shareableWorkoutLink=");
        sb4.append(c30660a);
        sb4.append(", isExerciseDetailsV2ExperimentEnabled=");
        sb4.append(z4);
        sb4.append(", selectedWorkoutLibraryTab=");
        sb4.append(enumC31848f);
        sb4.append(", navigateToEmptyWorkout=");
        return AbstractC18489d0.m53372m(sb4, z13, ")");
    }

    public /* synthetic */ C30663d(InterfaceC30661b interfaceC30661b, Long l7, WorkoutLibraryModel workoutLibraryModel, List list, EnumC30665f enumC30665f, C30660a c30660a, boolean z4, EnumC31848f enumC31848f, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? InterfaceC30661b.g.f126114a : interfaceC30661b, (i13 & 2) != 0 ? null : l7, (i13 & 4) != 0 ? null : workoutLibraryModel, (i13 & 8) != 0 ? C25271y.f99162w : list, (i13 & 16) != 0 ? null : enumC30665f, (i13 & 32) != 0 ? null : c30660a, (i13 & 64) != 0 ? false : z4, (i13 & 128) != 0 ? null : enumC31848f, (i13 & 256) != 0 ? false : z13);
    }
}
