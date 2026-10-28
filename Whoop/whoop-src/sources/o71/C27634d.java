package o71;

import com.whoop.domain.model.UnitSystem;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: o71.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0011\u0010\f¨\u0006\u0019"}, m65681d2 = {"Lo71/d;", "", "", "height", "Lcom/whoop/domain/model/UnitSystem;", "unit", "<init>", "(ILcom/whoop/domain/model/UnitSystem;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getHeight", "b", "Lcom/whoop/domain/model/UnitSystem;", "()Lcom/whoop/domain/model/UnitSystem;", "c", "heightInSelectedUnit", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C27634d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int height;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final UnitSystem unit;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int heightInSelectedUnit;

    public C27634d(int i13, UnitSystem unit) {
        AbstractC22676k.m65750j(unit, "unit");
        this.height = i13;
        this.unit = unit;
        this.heightInSelectedUnit = AbstractC27637g.m83446c(i13, getUnit());
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getHeightInSelectedUnit() {
        return this.heightInSelectedUnit;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public UnitSystem getUnit() {
        return this.unit;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C27634d)) {
            return false;
        }
        C27634d c27634d = (C27634d) other;
        return this.height == c27634d.height && this.unit == c27634d.unit;
    }

    public int hashCode() {
        return this.unit.hashCode() + (Integer.hashCode(this.height) * 31);
    }

    public String toString() {
        return "UpdateHeight(height=" + this.height + ", unit=" + this.unit + ")";
    }
}
