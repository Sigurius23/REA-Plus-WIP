package iw0;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j71.C21395c;
import k71.C22257n;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import vz0.C36613b;

/* JADX INFO: renamed from: iw0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b#\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b!\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b)\u0010+\u001a\u0004\b\u001f\u0010\u0015R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b#\u0010,\u001a\u0004\b\u001b\u0010-¨\u0006."}, m65681d2 = {"Liw0/e;", "Lm91/u;", "Liw0/j;", "detailsSegmentControlsState", "Lj71/c;", "exerciseGraphState", "hrZoneGraphState", "Liw0/l0;", "weightliftingExercises", "Lk71/n;", "heartRateZoneContainer", "", "currentExerciseCard", "Lvz0/b;", "additionalInfoTextState", "<init>", "(Liw0/j;Lj71/c;Lj71/c;Liw0/l0;Lk71/n;ILvz0/b;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liw0/j;", "c", "()Liw0/j;", "b", "Lj71/c;", "e", "()Lj71/c;", "g", "d", "Liw0/l0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Liw0/l0;", "Lk71/n;", "f", "()Lk71/n;", "I", "Lvz0/b;", "()Lvz0/b;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C20965e implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C20975j detailsSegmentControlsState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C21395c exerciseGraphState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C21395c hrZoneGraphState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C20980l0 weightliftingExercises;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C22257n heartRateZoneContainer;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int currentExerciseCard;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C36613b additionalInfoTextState;

    public C20965e(C20975j detailsSegmentControlsState, C21395c exerciseGraphState, C21395c hrZoneGraphState, C20980l0 weightliftingExercises, C22257n heartRateZoneContainer, int i13, C36613b c36613b) {
        AbstractC22676k.m65750j(detailsSegmentControlsState, "detailsSegmentControlsState");
        AbstractC22676k.m65750j(exerciseGraphState, "exerciseGraphState");
        AbstractC22676k.m65750j(hrZoneGraphState, "hrZoneGraphState");
        AbstractC22676k.m65750j(weightliftingExercises, "weightliftingExercises");
        AbstractC22676k.m65750j(heartRateZoneContainer, "heartRateZoneContainer");
        this.detailsSegmentControlsState = detailsSegmentControlsState;
        this.exerciseGraphState = exerciseGraphState;
        this.hrZoneGraphState = hrZoneGraphState;
        this.weightliftingExercises = weightliftingExercises;
        this.heartRateZoneContainer = heartRateZoneContainer;
        this.currentExerciseCard = i13;
        this.additionalInfoTextState = c36613b;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C36613b getAdditionalInfoTextState() {
        return this.additionalInfoTextState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getCurrentExerciseCard() {
        return this.currentExerciseCard;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C20975j getDetailsSegmentControlsState() {
        return this.detailsSegmentControlsState;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C21395c getExerciseGraphState() {
        return this.exerciseGraphState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C20965e)) {
            return false;
        }
        C20965e c20965e = (C20965e) other;
        return AbstractC22676k.m65745e(this.detailsSegmentControlsState, c20965e.detailsSegmentControlsState) && AbstractC22676k.m65745e(this.exerciseGraphState, c20965e.exerciseGraphState) && AbstractC22676k.m65745e(this.hrZoneGraphState, c20965e.hrZoneGraphState) && AbstractC22676k.m65745e(this.weightliftingExercises, c20965e.weightliftingExercises) && AbstractC22676k.m65745e(this.heartRateZoneContainer, c20965e.heartRateZoneContainer) && this.currentExerciseCard == c20965e.currentExerciseCard && AbstractC22676k.m65745e(this.additionalInfoTextState, c20965e.additionalInfoTextState);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C22257n getHeartRateZoneContainer() {
        return this.heartRateZoneContainer;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C21395c getHrZoneGraphState() {
        return this.hrZoneGraphState;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C20980l0 getWeightliftingExercises() {
        return this.weightliftingExercises;
    }

    public int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.currentExerciseCard, (this.heartRateZoneContainer.hashCode() + ((this.weightliftingExercises.hashCode() + ((this.hrZoneGraphState.hashCode() + ((this.exerciseGraphState.hashCode() + (this.detailsSegmentControlsState.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31);
        C36613b c36613b = this.additionalInfoTextState;
        return iM30448b + (c36613b == null ? 0 : c36613b.hashCode());
    }

    public String toString() {
        return "DetailsGraphWithExercisesSegmentState(detailsSegmentControlsState=" + this.detailsSegmentControlsState + ", exerciseGraphState=" + this.exerciseGraphState + ", hrZoneGraphState=" + this.hrZoneGraphState + ", weightliftingExercises=" + this.weightliftingExercises + ", heartRateZoneContainer=" + this.heartRateZoneContainer + ", currentExerciseCard=" + this.currentExerciseCard + ", additionalInfoTextState=" + this.additionalInfoTextState + ")";
    }
}
