package jt2;

import com.whoop.weeklyplan.customizeplan.domain.api.TargetGoalType;
import hc3.AbstractC17176i;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: jt2.r */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Ljt2/r;", "", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "targetGoalType", "", "sliderFillValue", "savedSliderValue", "<init>", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;DD)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "c", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "b", "D", "()D", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21956r {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TargetGoalType targetGoalType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final double sliderFillValue;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final double savedSliderValue;

    public C21956r(TargetGoalType targetGoalType, double d3, double d14) {
        AbstractC22676k.m65750j(targetGoalType, "targetGoalType");
        this.targetGoalType = targetGoalType;
        this.sliderFillValue = d3;
        this.savedSliderValue = d14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getSavedSliderValue() {
        return this.savedSliderValue;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getSliderFillValue() {
        return this.sliderFillValue;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TargetGoalType getTargetGoalType() {
        return this.targetGoalType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21956r)) {
            return false;
        }
        C21956r c21956r = (C21956r) other;
        return this.targetGoalType == c21956r.targetGoalType && Double.compare(this.sliderFillValue, c21956r.sliderFillValue) == 0 && Double.compare(this.savedSliderValue, c21956r.savedSliderValue) == 0;
    }

    public int hashCode() {
        return Double.hashCode(this.savedSliderValue) + AbstractC17176i.m48499a(this.targetGoalType.hashCode() * 31, 31, this.sliderFillValue);
    }

    public String toString() {
        return "SliderValue(targetGoalType=" + this.targetGoalType + ", sliderFillValue=" + this.sliderFillValue + ", savedSliderValue=" + this.savedSliderValue + ")";
    }
}
