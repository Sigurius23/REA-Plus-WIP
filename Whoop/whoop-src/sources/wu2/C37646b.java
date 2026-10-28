package wu2;

import com.whoop.design.util.TextResource;
import com.whoop.weightlifting.data.domain.WorkoutTemplate;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Set;
import java.util.UUID;
import m83.C25235a0;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: wu2.b */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b \b\u0087\b\u0018\u0000  2\u00020\u0001:\u0001\u001eBo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013Jz\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b)\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b#\u0010*\u001a\u0004\b+\u0010\u0017R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b,\u0010\u0017R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b+\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b.\u00100\u001a\u0004\b3\u00102R\u0017\u00106\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b4\u00100\u001a\u0004\b5\u00102R\u0011\u00107\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b4\u00102¨\u00068"}, m65681d2 = {"Lwu2/b;", "", "Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;", "workoutTemplate", "", "Ljava/util/UUID;", "idsOfExercisesBeingEdited", "Lwu2/a;", "currentDialogType", "lastSavedWorkoutTemplate", "", "sharedWorkoutId", "linkedActivityId", "Lcom/whoop/design/util/TextResource;", "subtitle", "", "isFromWhoopCoach", "isCopyFlow", "<init>", "(Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;Ljava/util/Set;Lwu2/a;Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZ)V", "b", "(Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;Ljava/util/Set;Lwu2/a;Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZ)Lwu2/b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;", "k", "()Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;", "Ljava/util/Set;", "e", "()Ljava/util/Set;", "c", "Lwu2/a;", "d", "()Lwu2/a;", "f", "Ljava/lang/String;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "g", "Lcom/whoop/design/util/TextResource;", "i", "()Lcom/whoop/design/util/TextResource;", "Z", "m", "()Z", "l", "j", "n", "isSharedWorkout", "unsavedChanges", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C37646b {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: l */
    public static final int f161268l = 8;

    /* JADX INFO: renamed from: m */
    private static final C37646b f161269m = new C37646b(WorkoutTemplate.INSTANCE.getEmpty(), C25235a0.f99113w, InterfaceC37645a.h.f161260a, null, null, null, null, false, false, 464, null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final WorkoutTemplate workoutTemplate;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Set<UUID> idsOfExercisesBeingEdited;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC37645a currentDialogType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final WorkoutTemplate lastSavedWorkoutTemplate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String sharedWorkoutId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String linkedActivityId;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean isFromWhoopCoach;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean isCopyFlow;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean isSharedWorkout;

    /* JADX INFO: renamed from: wu2.b$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lwu2/b$a;", "", "<init>", "()V", "Lwu2/b;", "initial", "Lwu2/b;", "a", "()Lwu2/b;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C37646b m120996a() {
            return C37646b.f161269m;
        }

        private Companion() {
        }
    }

    public C37646b(WorkoutTemplate workoutTemplate, Set<UUID> idsOfExercisesBeingEdited, InterfaceC37645a interfaceC37645a, WorkoutTemplate workoutTemplate2, String str, String str2, TextResource textResource, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(workoutTemplate, "workoutTemplate");
        AbstractC22676k.m65750j(idsOfExercisesBeingEdited, "idsOfExercisesBeingEdited");
        this.workoutTemplate = workoutTemplate;
        this.idsOfExercisesBeingEdited = idsOfExercisesBeingEdited;
        this.currentDialogType = interfaceC37645a;
        this.lastSavedWorkoutTemplate = workoutTemplate2;
        this.sharedWorkoutId = str;
        this.linkedActivityId = str2;
        this.subtitle = textResource;
        this.isFromWhoopCoach = z4;
        this.isCopyFlow = z13;
        this.isSharedWorkout = str != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C37646b m120983c(C37646b c37646b, WorkoutTemplate workoutTemplate, Set set, InterfaceC37645a interfaceC37645a, WorkoutTemplate workoutTemplate2, String str, String str2, TextResource textResource, boolean z4, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            workoutTemplate = c37646b.workoutTemplate;
        }
        if ((i13 & 2) != 0) {
            set = c37646b.idsOfExercisesBeingEdited;
        }
        if ((i13 & 4) != 0) {
            interfaceC37645a = c37646b.currentDialogType;
        }
        if ((i13 & 8) != 0) {
            workoutTemplate2 = c37646b.lastSavedWorkoutTemplate;
        }
        if ((i13 & 16) != 0) {
            str = c37646b.sharedWorkoutId;
        }
        if ((i13 & 32) != 0) {
            str2 = c37646b.linkedActivityId;
        }
        if ((i13 & 64) != 0) {
            textResource = c37646b.subtitle;
        }
        if ((i13 & 128) != 0) {
            z4 = c37646b.isFromWhoopCoach;
        }
        if ((i13 & 256) != 0) {
            z13 = c37646b.isCopyFlow;
        }
        boolean z14 = z4;
        boolean z15 = z13;
        String str3 = str2;
        TextResource textResource2 = textResource;
        String str4 = str;
        InterfaceC37645a interfaceC37645a2 = interfaceC37645a;
        return c37646b.m120984b(workoutTemplate, set, interfaceC37645a2, workoutTemplate2, str4, str3, textResource2, z14, z15);
    }

    /* JADX INFO: renamed from: b */
    public final C37646b m120984b(WorkoutTemplate workoutTemplate, Set<UUID> idsOfExercisesBeingEdited, InterfaceC37645a currentDialogType, WorkoutTemplate lastSavedWorkoutTemplate, String sharedWorkoutId, String linkedActivityId, TextResource subtitle, boolean isFromWhoopCoach, boolean isCopyFlow) {
        AbstractC22676k.m65750j(workoutTemplate, "workoutTemplate");
        AbstractC22676k.m65750j(idsOfExercisesBeingEdited, "idsOfExercisesBeingEdited");
        return new C37646b(workoutTemplate, idsOfExercisesBeingEdited, currentDialogType, lastSavedWorkoutTemplate, sharedWorkoutId, linkedActivityId, subtitle, isFromWhoopCoach, isCopyFlow);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC37645a getCurrentDialogType() {
        return this.currentDialogType;
    }

    /* JADX INFO: renamed from: e */
    public final Set<UUID> m120986e() {
        return this.idsOfExercisesBeingEdited;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C37646b)) {
            return false;
        }
        C37646b c37646b = (C37646b) other;
        return AbstractC22676k.m65745e(this.workoutTemplate, c37646b.workoutTemplate) && AbstractC22676k.m65745e(this.idsOfExercisesBeingEdited, c37646b.idsOfExercisesBeingEdited) && AbstractC22676k.m65745e(this.currentDialogType, c37646b.currentDialogType) && AbstractC22676k.m65745e(this.lastSavedWorkoutTemplate, c37646b.lastSavedWorkoutTemplate) && AbstractC22676k.m65745e(this.sharedWorkoutId, c37646b.sharedWorkoutId) && AbstractC22676k.m65745e(this.linkedActivityId, c37646b.linkedActivityId) && AbstractC22676k.m65745e(this.subtitle, c37646b.subtitle) && this.isFromWhoopCoach == c37646b.isFromWhoopCoach && this.isCopyFlow == c37646b.isCopyFlow;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final WorkoutTemplate getLastSavedWorkoutTemplate() {
        return this.lastSavedWorkoutTemplate;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getLinkedActivityId() {
        return this.linkedActivityId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getSharedWorkoutId() {
        return this.sharedWorkoutId;
    }

    public int hashCode() {
        int iM73368a = AbstractC25012a.m73368a(this.idsOfExercisesBeingEdited, this.workoutTemplate.hashCode() * 31, 31);
        InterfaceC37645a interfaceC37645a = this.currentDialogType;
        int iHashCode = (iM73368a + (interfaceC37645a == null ? 0 : interfaceC37645a.hashCode())) * 31;
        WorkoutTemplate workoutTemplate = this.lastSavedWorkoutTemplate;
        int iHashCode2 = (iHashCode + (workoutTemplate == null ? 0 : workoutTemplate.hashCode())) * 31;
        String str = this.sharedWorkoutId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.linkedActivityId;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        TextResource textResource = this.subtitle;
        return Boolean.hashCode(this.isCopyFlow) + AbstractC2875y.m8289b((iHashCode4 + (textResource != null ? textResource.hashCode() : 0)) * 31, 31, this.isFromWhoopCoach);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m120991j() {
        WorkoutTemplate workoutTemplate = this.lastSavedWorkoutTemplate;
        return workoutTemplate == null || !this.workoutTemplate.hasSameContentAs(workoutTemplate);
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final WorkoutTemplate getWorkoutTemplate() {
        return this.workoutTemplate;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getIsCopyFlow() {
        return this.isCopyFlow;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getIsFromWhoopCoach() {
        return this.isFromWhoopCoach;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getIsSharedWorkout() {
        return this.isSharedWorkout;
    }

    public String toString() {
        WorkoutTemplate workoutTemplate = this.workoutTemplate;
        Set<UUID> set = this.idsOfExercisesBeingEdited;
        InterfaceC37645a interfaceC37645a = this.currentDialogType;
        WorkoutTemplate workoutTemplate2 = this.lastSavedWorkoutTemplate;
        String str = this.sharedWorkoutId;
        String str2 = this.linkedActivityId;
        TextResource textResource = this.subtitle;
        boolean z4 = this.isFromWhoopCoach;
        boolean z13 = this.isCopyFlow;
        StringBuilder sb4 = new StringBuilder("EditWorkoutDomainState(workoutTemplate=");
        sb4.append(workoutTemplate);
        sb4.append(", idsOfExercisesBeingEdited=");
        sb4.append(set);
        sb4.append(", currentDialogType=");
        sb4.append(interfaceC37645a);
        sb4.append(", lastSavedWorkoutTemplate=");
        sb4.append(workoutTemplate2);
        sb4.append(", sharedWorkoutId=");
        AbstractC11266d.m30444B(sb4, str, ", linkedActivityId=", str2, ", subtitle=");
        AbstractC33745d.m106664w(textResource, ", isFromWhoopCoach=", ", isCopyFlow=", sb4, z4);
        return AbstractC18489d0.m53372m(sb4, z13, ")");
    }

    public /* synthetic */ C37646b(WorkoutTemplate workoutTemplate, Set set, InterfaceC37645a interfaceC37645a, WorkoutTemplate workoutTemplate2, String str, String str2, TextResource textResource, boolean z4, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(workoutTemplate, (i13 & 2) != 0 ? C25235a0.f99113w : set, (i13 & 4) != 0 ? null : interfaceC37645a, (i13 & 8) != 0 ? null : workoutTemplate2, (i13 & 16) != 0 ? null : str, (i13 & 32) != 0 ? null : str2, (i13 & 64) == 0 ? textResource : null, (i13 & 128) != 0 ? false : z4, (i13 & 256) != 0 ? false : z13);
    }
}
