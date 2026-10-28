package uu2;

import com.whoop.weightlifting.data.domain.WeightliftingExercise;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: uu2.k0 */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b\u001d\u0010 R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b$\u0010&\u001a\u0004\b!\u0010'R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u001f\u0010(\u001a\u0004\b\u0019\u0010)¨\u0006*"}, m65681d2 = {"Luu2/k0;", "", "Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;", "exercise", "Luu2/i0;", "titleAndDescription", "equipment", "muscleGroup", "", "showMedia", "Lm91/u;", "mediaCardState", "Luu2/a;", "customExerciseItems", "<init>", "(Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;Luu2/i0;Luu2/i0;Luu2/i0;ZLm91/u;Luu2/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;", "c", "()Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;", "b", "Luu2/i0;", "g", "()Luu2/i0;", "d", "e", "Z", "f", "()Z", "Lm91/u;", "()Lm91/u;", "Luu2/a;", "()Luu2/a;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35260k0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final WeightliftingExercise exercise;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C35256i0 titleAndDescription;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C35256i0 equipment;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C35256i0 muscleGroup;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean showMedia;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC25312u mediaCardState;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C35239a customExerciseItems;

    public C35260k0(WeightliftingExercise exercise, C35256i0 titleAndDescription, C35256i0 equipment, C35256i0 muscleGroup, boolean z4, InterfaceC25312u interfaceC25312u, C35239a c35239a) {
        AbstractC22676k.m65750j(exercise, "exercise");
        AbstractC22676k.m65750j(titleAndDescription, "titleAndDescription");
        AbstractC22676k.m65750j(equipment, "equipment");
        AbstractC22676k.m65750j(muscleGroup, "muscleGroup");
        this.exercise = exercise;
        this.titleAndDescription = titleAndDescription;
        this.equipment = equipment;
        this.muscleGroup = muscleGroup;
        this.showMedia = z4;
        this.mediaCardState = interfaceC25312u;
        this.customExerciseItems = c35239a;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C35239a getCustomExerciseItems() {
        return this.customExerciseItems;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C35256i0 getEquipment() {
        return this.equipment;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final WeightliftingExercise getExercise() {
        return this.exercise;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC25312u getMediaCardState() {
        return this.mediaCardState;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C35256i0 getMuscleGroup() {
        return this.muscleGroup;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35260k0)) {
            return false;
        }
        C35260k0 c35260k0 = (C35260k0) other;
        return AbstractC22676k.m65745e(this.exercise, c35260k0.exercise) && AbstractC22676k.m65745e(this.titleAndDescription, c35260k0.titleAndDescription) && AbstractC22676k.m65745e(this.equipment, c35260k0.equipment) && AbstractC22676k.m65745e(this.muscleGroup, c35260k0.muscleGroup) && this.showMedia == c35260k0.showMedia && AbstractC22676k.m65745e(this.mediaCardState, c35260k0.mediaCardState) && AbstractC22676k.m65745e(this.customExerciseItems, c35260k0.customExerciseItems);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getShowMedia() {
        return this.showMedia;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C35256i0 getTitleAndDescription() {
        return this.titleAndDescription;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b((this.muscleGroup.hashCode() + ((this.equipment.hashCode() + ((this.titleAndDescription.hashCode() + (this.exercise.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.showMedia);
        InterfaceC25312u interfaceC25312u = this.mediaCardState;
        int iHashCode = (iM8289b + (interfaceC25312u == null ? 0 : interfaceC25312u.hashCode())) * 31;
        C35239a c35239a = this.customExerciseItems;
        return iHashCode + (c35239a != null ? c35239a.hashCode() : 0);
    }

    public String toString() {
        return "ScreenContent(exercise=" + this.exercise + ", titleAndDescription=" + this.titleAndDescription + ", equipment=" + this.equipment + ", muscleGroup=" + this.muscleGroup + ", showMedia=" + this.showMedia + ", mediaCardState=" + this.mediaCardState + ", customExerciseItems=" + this.customExerciseItems + ")";
    }
}
