package q01;

import com.whoop.domain.model.UnitSystem;
import i93.C18284j;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: q01.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b\u001a\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b \u0010\u000fR\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010!\u001a\u0004\b\u0016\u0010\u000f¨\u0006\""}, m65681d2 = {"Lq01/b;", "", "Lcom/whoop/domain/model/UnitSystem;", "unitSystem", "", "circumferenceInCentimeters", "Li93/j;", "inchesRange", "centimetersRange", "", "inchesLabel", "centimetersLabel", "<init>", "(Lcom/whoop/domain/model/UnitSystem;ILi93/j;Li93/j;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/domain/model/UnitSystem;", "f", "()Lcom/whoop/domain/model/UnitSystem;", "b", "I", "c", "Li93/j;", "e", "()Li93/j;", "d", "Ljava/lang/String;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C29746b {

    /* JADX INFO: renamed from: g */
    public static final int f121668g = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final UnitSystem unitSystem;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int circumferenceInCentimeters;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C18284j inchesRange;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C18284j centimetersRange;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String inchesLabel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String centimetersLabel;

    public C29746b(UnitSystem unitSystem, int i13, C18284j inchesRange, C18284j centimetersRange, String inchesLabel, String centimetersLabel) {
        AbstractC22676k.m65750j(unitSystem, "unitSystem");
        AbstractC22676k.m65750j(inchesRange, "inchesRange");
        AbstractC22676k.m65750j(centimetersRange, "centimetersRange");
        AbstractC22676k.m65750j(inchesLabel, "inchesLabel");
        AbstractC22676k.m65750j(centimetersLabel, "centimetersLabel");
        this.unitSystem = unitSystem;
        this.circumferenceInCentimeters = i13;
        this.inchesRange = inchesRange;
        this.centimetersRange = centimetersRange;
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
    public final int getCircumferenceInCentimeters() {
        return this.circumferenceInCentimeters;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getInchesLabel() {
        return this.inchesLabel;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C18284j getInchesRange() {
        return this.inchesRange;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C29746b)) {
            return false;
        }
        C29746b c29746b = (C29746b) other;
        return this.unitSystem == c29746b.unitSystem && this.circumferenceInCentimeters == c29746b.circumferenceInCentimeters && AbstractC22676k.m65745e(this.inchesRange, c29746b.inchesRange) && AbstractC22676k.m65745e(this.centimetersRange, c29746b.centimetersRange) && AbstractC22676k.m65745e(this.inchesLabel, c29746b.inchesLabel) && AbstractC22676k.m65745e(this.centimetersLabel, c29746b.centimetersLabel);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final UnitSystem getUnitSystem() {
        return this.unitSystem;
    }

    public int hashCode() {
        return this.centimetersLabel.hashCode() + AbstractC11266d.m30450d((this.centimetersRange.hashCode() + ((this.inchesRange.hashCode() + AbstractC11266d.m30448b(this.circumferenceInCentimeters, this.unitSystem.hashCode() * 31, 31)) * 31)) * 31, 31, this.inchesLabel);
    }

    public String toString() {
        UnitSystem unitSystem = this.unitSystem;
        int i13 = this.circumferenceInCentimeters;
        C18284j c18284j = this.inchesRange;
        C18284j c18284j2 = this.centimetersRange;
        String str = this.inchesLabel;
        String str2 = this.centimetersLabel;
        StringBuilder sb4 = new StringBuilder("WhoopCircumferencePickerState(unitSystem=");
        sb4.append(unitSystem);
        sb4.append(", circumferenceInCentimeters=");
        sb4.append(i13);
        sb4.append(", inchesRange=");
        sb4.append(c18284j);
        sb4.append(", centimetersRange=");
        sb4.append(c18284j2);
        sb4.append(", inchesLabel=");
        return AbstractC11266d.m30464r(sb4, str, ", centimetersLabel=", str2, ")");
    }
}
