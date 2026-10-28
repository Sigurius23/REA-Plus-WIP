package f31;

import ih0.AbstractC18489d0;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: f31.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, m65681d2 = {"Lf31/a;", "", "", "isSelected", "isFirst", "isLast", "<init>", "(ZZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "c", "()Z", "b", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C14044a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isSelected;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isFirst;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isLast;

    public C14044a(boolean z4, boolean z13, boolean z14) {
        this.isSelected = z4;
        this.isFirst = z13;
        this.isLast = z14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getIsFirst() {
        return this.isFirst;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsLast() {
        return this.isLast;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14044a)) {
            return false;
        }
        C14044a c14044a = (C14044a) other;
        return this.isSelected == c14044a.isSelected && this.isFirst == c14044a.isFirst && this.isLast == c14044a.isLast;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isLast) + AbstractC2875y.m8289b(Boolean.hashCode(this.isSelected) * 31, 31, this.isFirst);
    }

    public String toString() {
        boolean z4 = this.isSelected;
        boolean z13 = this.isFirst;
        return AbstractC18489d0.m53372m(AbstractC11895b.m32002u("RadioButtonState(isSelected=", ", isFirst=", ", isLast=", z4, z13), this.isLast, ")");
    }
}
