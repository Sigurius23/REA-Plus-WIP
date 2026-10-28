package s41;

import com.whoop.domain.model.UnitSystem;
import i93.C18284j;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: s41.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b\u001a\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010!\u001a\u0004\b\u001d\u0010\u000fR\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010!\u001a\u0004\b\u0016\u0010\u000f¨\u0006\""}, m65681d2 = {"Ls41/d;", "", "Lcom/whoop/domain/model/UnitSystem;", "unitSystem", "", "weightInPounds", "Li93/j;", "poundsRange", "kilogramsRange", "", "poundsLabel", "kilogramsLabel", "<init>", "(Lcom/whoop/domain/model/UnitSystem;ILi93/j;Li93/j;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/domain/model/UnitSystem;", "e", "()Lcom/whoop/domain/model/UnitSystem;", "b", "I", "f", "c", "Li93/j;", "d", "()Li93/j;", "Ljava/lang/String;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32196d {

    /* JADX INFO: renamed from: g */
    public static final int f133326g = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final UnitSystem unitSystem;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int weightInPounds;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C18284j poundsRange;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C18284j kilogramsRange;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String poundsLabel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String kilogramsLabel;

    public C32196d(UnitSystem unitSystem, int i13, C18284j poundsRange, C18284j kilogramsRange, String poundsLabel, String kilogramsLabel) {
        AbstractC22676k.m65750j(unitSystem, "unitSystem");
        AbstractC22676k.m65750j(poundsRange, "poundsRange");
        AbstractC22676k.m65750j(kilogramsRange, "kilogramsRange");
        AbstractC22676k.m65750j(poundsLabel, "poundsLabel");
        AbstractC22676k.m65750j(kilogramsLabel, "kilogramsLabel");
        this.unitSystem = unitSystem;
        this.weightInPounds = i13;
        this.poundsRange = poundsRange;
        this.kilogramsRange = kilogramsRange;
        this.poundsLabel = poundsLabel;
        this.kilogramsLabel = kilogramsLabel;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getKilogramsLabel() {
        return this.kilogramsLabel;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C18284j getKilogramsRange() {
        return this.kilogramsRange;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPoundsLabel() {
        return this.poundsLabel;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C18284j getPoundsRange() {
        return this.poundsRange;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final UnitSystem getUnitSystem() {
        return this.unitSystem;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32196d)) {
            return false;
        }
        C32196d c32196d = (C32196d) other;
        return this.unitSystem == c32196d.unitSystem && this.weightInPounds == c32196d.weightInPounds && AbstractC22676k.m65745e(this.poundsRange, c32196d.poundsRange) && AbstractC22676k.m65745e(this.kilogramsRange, c32196d.kilogramsRange) && AbstractC22676k.m65745e(this.poundsLabel, c32196d.poundsLabel) && AbstractC22676k.m65745e(this.kilogramsLabel, c32196d.kilogramsLabel);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getWeightInPounds() {
        return this.weightInPounds;
    }

    public int hashCode() {
        return this.kilogramsLabel.hashCode() + AbstractC11266d.m30450d((this.kilogramsRange.hashCode() + ((this.poundsRange.hashCode() + AbstractC11266d.m30448b(this.weightInPounds, this.unitSystem.hashCode() * 31, 31)) * 31)) * 31, 31, this.poundsLabel);
    }

    public String toString() {
        UnitSystem unitSystem = this.unitSystem;
        int i13 = this.weightInPounds;
        C18284j c18284j = this.poundsRange;
        C18284j c18284j2 = this.kilogramsRange;
        String str = this.poundsLabel;
        String str2 = this.kilogramsLabel;
        StringBuilder sb4 = new StringBuilder("WhoopWeightPickerState(unitSystem=");
        sb4.append(unitSystem);
        sb4.append(", weightInPounds=");
        sb4.append(i13);
        sb4.append(", poundsRange=");
        sb4.append(c18284j);
        sb4.append(", kilogramsRange=");
        sb4.append(c18284j2);
        sb4.append(", poundsLabel=");
        return AbstractC11266d.m30464r(sb4, str, ", kilogramsLabel=", str2, ")");
    }
}
