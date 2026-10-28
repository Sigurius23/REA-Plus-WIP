package o71;

import com.whoop.domain.model.UnitSystem;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: o71.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0019R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u0012\u0010\rR\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u0017\u0010\r¨\u0006\u001e"}, m65681d2 = {"Lo71/e;", "", "", "height", "weight", "Lcom/whoop/domain/model/UnitSystem;", "unit", "<init>", "(IILcom/whoop/domain/model/UnitSystem;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getHeight", "b", "getWeight", "c", "Lcom/whoop/domain/model/UnitSystem;", "()Lcom/whoop/domain/model/UnitSystem;", "d", "heightInSelectedUnit", "e", "weightInSelectedUnit", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C27635e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int height;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int weight;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final UnitSystem unit;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int heightInSelectedUnit;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int weightInSelectedUnit;

    public C27635e(int i13, int i14, UnitSystem unit) {
        AbstractC22676k.m65750j(unit, "unit");
        this.height = i13;
        this.weight = i14;
        this.unit = unit;
        this.heightInSelectedUnit = AbstractC27637g.m83446c(i13, getUnit());
        this.weightInSelectedUnit = AbstractC27637g.m83447d(i14, getUnit());
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getHeightInSelectedUnit() {
        return this.heightInSelectedUnit;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public UnitSystem getUnit() {
        return this.unit;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getWeightInSelectedUnit() {
        return this.weightInSelectedUnit;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C27635e)) {
            return false;
        }
        C27635e c27635e = (C27635e) other;
        return this.height == c27635e.height && this.weight == c27635e.weight && this.unit == c27635e.unit;
    }

    public int hashCode() {
        return this.unit.hashCode() + AbstractC11266d.m30448b(this.weight, Integer.hashCode(this.height) * 31, 31);
    }

    public String toString() {
        int i13 = this.height;
        int i14 = this.weight;
        UnitSystem unitSystem = this.unit;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "UpdateHeightWeight(height=", ", weight=", ", unit=");
        sbM30465s.append(unitSystem);
        sbM30465s.append(")");
        return sbM30465s.toString();
    }
}
