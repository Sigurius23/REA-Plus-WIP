package p50;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.C33169c0;

/* JADX INFO: renamed from: p50.c */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0017"}, m65681d2 = {"Lp50/c;", "", "Lsz0/c0;", "label", "value", "unit", "<init>", "(Lsz0/c0;Lsz0/c0;Lsz0/c0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsz0/c0;", "()Lsz0/c0;", "b", "c", "access_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C28851c {

    /* JADX INFO: renamed from: d */
    public static final int f116771d = C33169c0.f138321k;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C33169c0 label;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C33169c0 value;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C33169c0 unit;

    public C28851c(C33169c0 label, C33169c0 value, C33169c0 unit) {
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(value, "value");
        AbstractC22676k.m65750j(unit, "unit");
        this.label = label;
        this.value = value;
        this.unit = unit;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C33169c0 getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C33169c0 getUnit() {
        return this.unit;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C33169c0 getValue() {
        return this.value;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C28851c)) {
            return false;
        }
        C28851c c28851c = (C28851c) other;
        return AbstractC22676k.m65745e(this.label, c28851c.label) && AbstractC22676k.m65745e(this.value, c28851c.value) && AbstractC22676k.m65745e(this.unit, c28851c.unit);
    }

    public int hashCode() {
        return this.unit.hashCode() + ((this.value.hashCode() + (this.label.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "LabSummaryRowViewState(label=" + this.label + ", value=" + this.value + ", unit=" + this.unit + ")";
    }
}
