package jt2;

import ih0.AbstractC18489d0;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: jt2.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0019\u001a\u0004\b\u001a\u0010\u000f¨\u0006\u001b"}, m65681d2 = {"Ljt2/a;", "", "", "activityType", "", "isSelected", "", "daysPerWeek", "<init>", "(Ljava/lang/String;ZI)V", "a", "(Ljava/lang/String;ZI)Ljt2/a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "b", "Z", "e", "()Z", "I", "d", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21939a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String activityType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isSelected;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int daysPerWeek;

    public C21939a(String activityType, boolean z4, int i13) {
        AbstractC22676k.m65750j(activityType, "activityType");
        this.activityType = activityType;
        this.isSelected = z4;
        this.daysPerWeek = i13;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C21939a m62523b(C21939a c21939a, String str, boolean z4, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = c21939a.activityType;
        }
        if ((i14 & 2) != 0) {
            z4 = c21939a.isSelected;
        }
        if ((i14 & 4) != 0) {
            i13 = c21939a.daysPerWeek;
        }
        return c21939a.m62524a(str, z4, i13);
    }

    /* JADX INFO: renamed from: a */
    public final C21939a m62524a(String activityType, boolean isSelected, int daysPerWeek) {
        AbstractC22676k.m65750j(activityType, "activityType");
        return new C21939a(activityType, isSelected, daysPerWeek);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getActivityType() {
        return this.activityType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getDaysPerWeek() {
        return this.daysPerWeek;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21939a)) {
            return false;
        }
        C21939a c21939a = (C21939a) other;
        return AbstractC22676k.m65745e(this.activityType, c21939a.activityType) && this.isSelected == c21939a.isSelected && this.daysPerWeek == c21939a.daysPerWeek;
    }

    public int hashCode() {
        return Integer.hashCode(this.daysPerWeek) + AbstractC2875y.m8289b(this.activityType.hashCode() * 31, 31, this.isSelected);
    }

    public String toString() {
        String str = this.activityType;
        boolean z4 = this.isSelected;
        return AbstractC18489d0.m53371l(AbstractC25012a.m73379l("ActivityItem(activityType=", str, ", isSelected=", ", daysPerWeek=", z4), this.daysPerWeek, ")");
    }
}
