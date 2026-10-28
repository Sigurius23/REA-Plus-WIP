package d21;

import com.whoop.domain.model.UnitSystem;
import i93.C18284j;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d21.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b\u001b\u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b\u001e\u0010\u0010R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b#\u0010\u0010R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\"\u001a\u0004\b\u0017\u0010\u0010¨\u0006$"}, m65681d2 = {"Ld21/g;", "", "Lcom/whoop/domain/model/UnitSystem;", "unitSystem", "", "heightInCentimeters", "Li93/j;", "feetRange", "centimetersRange", "", "feetLabel", "inchesLabel", "centimetersLabel", "<init>", "(Lcom/whoop/domain/model/UnitSystem;ILi93/j;Li93/j;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/domain/model/UnitSystem;", "g", "()Lcom/whoop/domain/model/UnitSystem;", "b", "I", "e", "c", "Li93/j;", "d", "()Li93/j;", "Ljava/lang/String;", "f", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C11509g {

    /* JADX INFO: renamed from: h */
    public static final int f37027h = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final UnitSystem unitSystem;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int heightInCentimeters;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C18284j feetRange;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C18284j centimetersRange;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String feetLabel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String inchesLabel;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String centimetersLabel;

    public C11509g(UnitSystem unitSystem, int i13, C18284j feetRange, C18284j centimetersRange, String feetLabel, String inchesLabel, String centimetersLabel) {
        AbstractC22676k.m65750j(unitSystem, "unitSystem");
        AbstractC22676k.m65750j(feetRange, "feetRange");
        AbstractC22676k.m65750j(centimetersRange, "centimetersRange");
        AbstractC22676k.m65750j(feetLabel, "feetLabel");
        AbstractC22676k.m65750j(inchesLabel, "inchesLabel");
        AbstractC22676k.m65750j(centimetersLabel, "centimetersLabel");
        this.unitSystem = unitSystem;
        this.heightInCentimeters = i13;
        this.feetRange = feetRange;
        this.centimetersRange = centimetersRange;
        this.feetLabel = feetLabel;
        this.inchesLabel = inchesLabel;
        this.centimetersLabel = centimetersLabel;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCentimetersLabel() {
        return this.centimetersLabel;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C18284j getCentimetersRange() {
        return this.centimetersRange;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFeetLabel() {
        return this.feetLabel;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C18284j getFeetRange() {
        return this.feetRange;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getHeightInCentimeters() {
        return this.heightInCentimeters;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C11509g)) {
            return false;
        }
        C11509g c11509g = (C11509g) other;
        return this.unitSystem == c11509g.unitSystem && this.heightInCentimeters == c11509g.heightInCentimeters && AbstractC22676k.m65745e(this.feetRange, c11509g.feetRange) && AbstractC22676k.m65745e(this.centimetersRange, c11509g.centimetersRange) && AbstractC22676k.m65745e(this.feetLabel, c11509g.feetLabel) && AbstractC22676k.m65745e(this.inchesLabel, c11509g.inchesLabel) && AbstractC22676k.m65745e(this.centimetersLabel, c11509g.centimetersLabel);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getInchesLabel() {
        return this.inchesLabel;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final UnitSystem getUnitSystem() {
        return this.unitSystem;
    }

    public int hashCode() {
        return this.centimetersLabel.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d((this.centimetersRange.hashCode() + ((this.feetRange.hashCode() + AbstractC11266d.m30448b(this.heightInCentimeters, this.unitSystem.hashCode() * 31, 31)) * 31)) * 31, 31, this.feetLabel), 31, this.inchesLabel);
    }

    public String toString() {
        UnitSystem unitSystem = this.unitSystem;
        int i13 = this.heightInCentimeters;
        C18284j c18284j = this.feetRange;
        C18284j c18284j2 = this.centimetersRange;
        String str = this.feetLabel;
        String str2 = this.inchesLabel;
        String str3 = this.centimetersLabel;
        StringBuilder sb4 = new StringBuilder("WhoopHeightPickerState(unitSystem=");
        sb4.append(unitSystem);
        sb4.append(", heightInCentimeters=");
        sb4.append(i13);
        sb4.append(", feetRange=");
        sb4.append(c18284j);
        sb4.append(", centimetersRange=");
        sb4.append(c18284j2);
        sb4.append(", feetLabel=");
        AbstractC11266d.m30444B(sb4, str, ", inchesLabel=", str2, ", centimetersLabel=");
        return AbstractC25012a.m73376i(str3, ")", sb4);
    }
}
