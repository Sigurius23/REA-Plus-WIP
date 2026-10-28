package f41;

import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: f41.r */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Lf41/r;", "", "", "id", "", "selectedNumber", "", "isAvoid", "isToggled", "<init>", "(Ljava/lang/String;IZZ)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "c", "Z", "()Z", "d", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C14080r {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int selectedNumber;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isAvoid;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isToggled;

    public C14080r(String id4, int i13, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(id4, "id");
        this.id = id4;
        this.selectedNumber = i13;
        this.isAvoid = z4;
        this.isToggled = z13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getSelectedNumber() {
        return this.selectedNumber;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsAvoid() {
        return this.isAvoid;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsToggled() {
        return this.isToggled;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14080r)) {
            return false;
        }
        C14080r c14080r = (C14080r) other;
        return AbstractC22676k.m65745e(this.id, c14080r.id) && this.selectedNumber == c14080r.selectedNumber && this.isAvoid == c14080r.isAvoid && this.isToggled == c14080r.isToggled;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isToggled) + AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.selectedNumber, this.id.hashCode() * 31, 31), 31, this.isAvoid);
    }

    public String toString() {
        String str = this.id;
        int i13 = this.selectedNumber;
        return AbstractC36095b.m114682j(AbstractC11266d.m30467u(i13, "SelectedBehaviorCallback(id=", str, ", selectedNumber=", ", isAvoid="), this.isAvoid, ", isToggled=", this.isToggled, ")");
    }
}
