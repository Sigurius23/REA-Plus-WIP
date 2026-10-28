package ht2;

import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ht2.g */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\f¨\u0006\u0016"}, m65681d2 = {"Lht2/g;", "", "", "percentString", "percentSubtitle", "", "percentValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "I", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17635g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String percentString;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String percentSubtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int percentValue;

    public C17635g(String percentString, String percentSubtitle, int i13) {
        AbstractC22676k.m65750j(percentString, "percentString");
        AbstractC22676k.m65750j(percentSubtitle, "percentSubtitle");
        this.percentString = percentString;
        this.percentSubtitle = percentSubtitle;
        this.percentValue = i13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getPercentString() {
        return this.percentString;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPercentSubtitle() {
        return this.percentSubtitle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getPercentValue() {
        return this.percentValue;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17635g)) {
            return false;
        }
        C17635g c17635g = (C17635g) other;
        return AbstractC22676k.m65745e(this.percentString, c17635g.percentString) && AbstractC22676k.m65745e(this.percentSubtitle, c17635g.percentSubtitle) && this.percentValue == c17635g.percentValue;
    }

    public int hashCode() {
        return Integer.hashCode(this.percentValue) + AbstractC11266d.m30450d(this.percentString.hashCode() * 31, 31, this.percentSubtitle);
    }

    public String toString() {
        String str = this.percentString;
        String str2 = this.percentSubtitle;
        return AbstractC18489d0.m53371l(AbstractC11895b.m32001t("WeeklyPlanProgressBarModel(percentString=", str, ", percentSubtitle=", str2, ", percentValue="), this.percentValue, ")");
    }
}
