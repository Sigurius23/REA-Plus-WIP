package fu2;

import com.whoop.weightlifting.data.domain.WorkoutGroup;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import m83.C25235a0;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: fu2.c */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJP\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b \u0010\u000fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010\u000f¨\u0006#"}, m65681d2 = {"Lfu2/c;", "", "", "Lcom/whoop/weightlifting/data/domain/WorkoutGroup;", "groups", "", "Ljava/util/UUID;", "idsOfExercisesBeingEdited", "manuallyEditedSetIds", "completedSetIds", "<init>", "(Ljava/util/List;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;)V", "a", "()Ljava/util/List;", "b", "()Ljava/util/Set;", "c", "(Ljava/util/List;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;)Lfu2/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "f", "Ljava/util/Set;", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "d", "e", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C14788c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<WorkoutGroup> groups;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Set<UUID> idsOfExercisesBeingEdited;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Set<UUID> manuallyEditedSetIds;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Set<UUID> completedSetIds;

    public C14788c(List<WorkoutGroup> groups, Set<UUID> idsOfExercisesBeingEdited, Set<UUID> manuallyEditedSetIds, Set<UUID> completedSetIds) {
        AbstractC22676k.m65750j(groups, "groups");
        AbstractC22676k.m65750j(idsOfExercisesBeingEdited, "idsOfExercisesBeingEdited");
        AbstractC22676k.m65750j(manuallyEditedSetIds, "manuallyEditedSetIds");
        AbstractC22676k.m65750j(completedSetIds, "completedSetIds");
        this.groups = groups;
        this.idsOfExercisesBeingEdited = idsOfExercisesBeingEdited;
        this.manuallyEditedSetIds = manuallyEditedSetIds;
        this.completedSetIds = completedSetIds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C14788c m42465d(C14788c c14788c, List list, Set set, Set set2, Set set3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = c14788c.groups;
        }
        if ((i13 & 2) != 0) {
            set = c14788c.idsOfExercisesBeingEdited;
        }
        if ((i13 & 4) != 0) {
            set2 = c14788c.manuallyEditedSetIds;
        }
        if ((i13 & 8) != 0) {
            set3 = c14788c.completedSetIds;
        }
        return c14788c.m42468c(list, set, set2, set3);
    }

    /* JADX INFO: renamed from: a */
    public final List<WorkoutGroup> m42466a() {
        return this.groups;
    }

    /* JADX INFO: renamed from: b */
    public final Set<UUID> m42467b() {
        return this.idsOfExercisesBeingEdited;
    }

    /* JADX INFO: renamed from: c */
    public final C14788c m42468c(List<WorkoutGroup> groups, Set<UUID> idsOfExercisesBeingEdited, Set<UUID> manuallyEditedSetIds, Set<UUID> completedSetIds) {
        AbstractC22676k.m65750j(groups, "groups");
        AbstractC22676k.m65750j(idsOfExercisesBeingEdited, "idsOfExercisesBeingEdited");
        AbstractC22676k.m65750j(manuallyEditedSetIds, "manuallyEditedSetIds");
        AbstractC22676k.m65750j(completedSetIds, "completedSetIds");
        return new C14788c(groups, idsOfExercisesBeingEdited, manuallyEditedSetIds, completedSetIds);
    }

    /* JADX INFO: renamed from: e */
    public final Set<UUID> m42469e() {
        return this.completedSetIds;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14788c)) {
            return false;
        }
        C14788c c14788c = (C14788c) other;
        return AbstractC22676k.m65745e(this.groups, c14788c.groups) && AbstractC22676k.m65745e(this.idsOfExercisesBeingEdited, c14788c.idsOfExercisesBeingEdited) && AbstractC22676k.m65745e(this.manuallyEditedSetIds, c14788c.manuallyEditedSetIds) && AbstractC22676k.m65745e(this.completedSetIds, c14788c.completedSetIds);
    }

    /* JADX INFO: renamed from: f */
    public final List<WorkoutGroup> m42470f() {
        return this.groups;
    }

    /* JADX INFO: renamed from: g */
    public final Set<UUID> m42471g() {
        return this.idsOfExercisesBeingEdited;
    }

    /* JADX INFO: renamed from: h */
    public final Set<UUID> m42472h() {
        return this.manuallyEditedSetIds;
    }

    public int hashCode() {
        return this.completedSetIds.hashCode() + AbstractC25012a.m73368a(this.manuallyEditedSetIds, AbstractC25012a.m73368a(this.idsOfExercisesBeingEdited, this.groups.hashCode() * 31, 31), 31);
    }

    public String toString() {
        return "EditableWorkoutGroups(groups=" + this.groups + ", idsOfExercisesBeingEdited=" + this.idsOfExercisesBeingEdited + ", manuallyEditedSetIds=" + this.manuallyEditedSetIds + ", completedSetIds=" + this.completedSetIds + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C14788c(List list, Set set, Set set2, Set set3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        int i14 = i13 & 2;
        C25235a0 c25235a0 = C25235a0.f99113w;
        this(list, i14 != 0 ? c25235a0 : set, (i13 & 4) != 0 ? c25235a0 : set2, (i13 & 8) != 0 ? c25235a0 : set3);
    }
}
