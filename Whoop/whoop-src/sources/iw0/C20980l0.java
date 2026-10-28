package iw0;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: iw0.l0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001b\u0010\u001e¨\u0006 "}, m65681d2 = {"Liw0/l0;", "", "Liw0/d0;", "exerciseSummary", "Liw0/e0;", "exerciseSummaryCarousel", "Lcom/whoop/design/util/TextResource;", "titleDisplay", "viewAllLabelDisplay", "<init>", "(Liw0/d0;Liw0/e0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liw0/d0;", "()Liw0/d0;", "b", "Liw0/e0;", "()Liw0/e0;", "c", "Lcom/whoop/design/util/TextResource;", "getTitleDisplay", "()Lcom/whoop/design/util/TextResource;", "d", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C20980l0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C20964d0 exerciseSummary;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C20966e0 exerciseSummaryCarousel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource titleDisplay;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource viewAllLabelDisplay;

    public C20980l0(C20964d0 exerciseSummary, C20966e0 exerciseSummaryCarousel, TextResource titleDisplay, TextResource viewAllLabelDisplay) {
        AbstractC22676k.m65750j(exerciseSummary, "exerciseSummary");
        AbstractC22676k.m65750j(exerciseSummaryCarousel, "exerciseSummaryCarousel");
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(viewAllLabelDisplay, "viewAllLabelDisplay");
        this.exerciseSummary = exerciseSummary;
        this.exerciseSummaryCarousel = exerciseSummaryCarousel;
        this.titleDisplay = titleDisplay;
        this.viewAllLabelDisplay = viewAllLabelDisplay;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C20964d0 getExerciseSummary() {
        return this.exerciseSummary;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C20966e0 getExerciseSummaryCarousel() {
        return this.exerciseSummaryCarousel;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getViewAllLabelDisplay() {
        return this.viewAllLabelDisplay;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C20980l0)) {
            return false;
        }
        C20980l0 c20980l0 = (C20980l0) other;
        return AbstractC22676k.m65745e(this.exerciseSummary, c20980l0.exerciseSummary) && AbstractC22676k.m65745e(this.exerciseSummaryCarousel, c20980l0.exerciseSummaryCarousel) && AbstractC22676k.m65745e(this.titleDisplay, c20980l0.titleDisplay) && AbstractC22676k.m65745e(this.viewAllLabelDisplay, c20980l0.viewAllLabelDisplay);
    }

    public int hashCode() {
        return this.viewAllLabelDisplay.hashCode() + AbstractC31061c.m95625a((this.exerciseSummaryCarousel.hashCode() + (this.exerciseSummary.hashCode() * 31)) * 31, this.titleDisplay, 31);
    }

    public String toString() {
        C20964d0 c20964d0 = this.exerciseSummary;
        C20966e0 c20966e0 = this.exerciseSummaryCarousel;
        TextResource textResource = this.titleDisplay;
        TextResource textResource2 = this.viewAllLabelDisplay;
        StringBuilder sb4 = new StringBuilder("WeightliftingExercises(exerciseSummary=");
        sb4.append(c20964d0);
        sb4.append(", exerciseSummaryCarousel=");
        sb4.append(c20966e0);
        sb4.append(", titleDisplay=");
        return AbstractC33745d.m106655n(sb4, textResource, ", viewAllLabelDisplay=", textResource2, ")");
    }
}
