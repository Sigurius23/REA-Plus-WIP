package cp0;

import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: cp0.s1 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lcp0/s1;", "", "", "currentHeroProgress", "currentTargetHeight", "Lcp0/u1;", "sheetState", "", "isEducationTypeDayZero", "<init>", "(FFLcp0/u1;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "F", "()F", "b", "c", "Lcp0/u1;", "()Lcp0/u1;", "d", "Z", "()Z", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C10997s1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float currentHeroProgress;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float currentTargetHeight;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC11003u1 sheetState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isEducationTypeDayZero;

    public C10997s1(float f13, float f14, EnumC11003u1 sheetState, boolean z4) {
        AbstractC22676k.m65750j(sheetState, "sheetState");
        this.currentHeroProgress = f13;
        this.currentTargetHeight = f14;
        this.sheetState = sheetState;
        this.isEducationTypeDayZero = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getCurrentHeroProgress() {
        return this.currentHeroProgress;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getCurrentTargetHeight() {
        return this.currentTargetHeight;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC11003u1 getSheetState() {
        return this.sheetState;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsEducationTypeDayZero() {
        return this.isEducationTypeDayZero;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C10997s1)) {
            return false;
        }
        C10997s1 c10997s1 = (C10997s1) other;
        return Float.compare(this.currentHeroProgress, c10997s1.currentHeroProgress) == 0 && Float.compare(this.currentTargetHeight, c10997s1.currentTargetHeight) == 0 && this.sheetState == c10997s1.sheetState && this.isEducationTypeDayZero == c10997s1.isEducationTypeDayZero;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isEducationTypeDayZero) + ((this.sheetState.hashCode() + AbstractC11266d.m30447a(this.currentTargetHeight, Float.hashCode(this.currentHeroProgress) * 31, 31)) * 31);
    }

    public String toString() {
        float f13 = this.currentHeroProgress;
        float f14 = this.currentTargetHeight;
        EnumC11003u1 enumC11003u1 = this.sheetState;
        boolean z4 = this.isEducationTypeDayZero;
        StringBuilder sbM8307t = AbstractC2875y.m8307t("MorphDragState(currentHeroProgress=", f13, ", currentTargetHeight=", f14, ", sheetState=");
        sbM8307t.append(enumC11003u1);
        sbM8307t.append(", isEducationTypeDayZero=");
        sbM8307t.append(z4);
        sbM8307t.append(")");
        return sbM8307t.toString();
    }
}
