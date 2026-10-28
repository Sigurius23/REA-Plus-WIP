package jt2;

import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: jt2.b */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ8\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001c\u001a\u0004\b\u001a\u0010\u0010¨\u0006\u001d"}, m65681d2 = {"Ljt2/b;", "", "", "id", "", "isAvoid", "isSelected", "", "daysPerWeek", "<init>", "(Ljava/lang/String;ZZI)V", "a", "(Ljava/lang/String;ZZI)Ljt2/b;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "d", "b", "Z", "e", "()Z", "c", "f", "I", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21940b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isAvoid;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isSelected;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int daysPerWeek;

    public C21940b(String id4, boolean z4, boolean z13, int i13) {
        AbstractC22676k.m65750j(id4, "id");
        this.id = id4;
        this.isAvoid = z4;
        this.isSelected = z13;
        this.daysPerWeek = i13;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C21940b m62528b(C21940b c21940b, String str, boolean z4, boolean z13, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = c21940b.id;
        }
        if ((i14 & 2) != 0) {
            z4 = c21940b.isAvoid;
        }
        if ((i14 & 4) != 0) {
            z13 = c21940b.isSelected;
        }
        if ((i14 & 8) != 0) {
            i13 = c21940b.daysPerWeek;
        }
        return c21940b.m62529a(str, z4, z13, i13);
    }

    /* JADX INFO: renamed from: a */
    public final C21940b m62529a(String id4, boolean isAvoid, boolean isSelected, int daysPerWeek) {
        AbstractC22676k.m65750j(id4, "id");
        return new C21940b(id4, isAvoid, isSelected, daysPerWeek);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getDaysPerWeek() {
        return this.daysPerWeek;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsAvoid() {
        return this.isAvoid;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21940b)) {
            return false;
        }
        C21940b c21940b = (C21940b) other;
        return AbstractC22676k.m65745e(this.id, c21940b.id) && this.isAvoid == c21940b.isAvoid && this.isSelected == c21940b.isSelected && this.daysPerWeek == c21940b.daysPerWeek;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public int hashCode() {
        return Integer.hashCode(this.daysPerWeek) + AbstractC2875y.m8289b(AbstractC2875y.m8289b(this.id.hashCode() * 31, 31, this.isAvoid), 31, this.isSelected);
    }

    public String toString() {
        String str = this.id;
        boolean z4 = this.isAvoid;
        boolean z13 = this.isSelected;
        int i13 = this.daysPerWeek;
        StringBuilder sbM73379l = AbstractC25012a.m73379l("BehaviorItem(id=", str, ", isAvoid=", ", isSelected=", z4);
        sbM73379l.append(z13);
        sbM73379l.append(", daysPerWeek=");
        sbM73379l.append(i13);
        sbM73379l.append(")");
        return sbM73379l.toString();
    }
}
