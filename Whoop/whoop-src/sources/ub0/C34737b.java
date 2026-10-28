package ub0;

import java.util.Set;
import m83.C25235a0;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ub0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b\u000b\u0010\fJL\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0010R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\"\u001a\u0004\b \u0010#¨\u0006$"}, m65681d2 = {"Lub0/b;", "", "", "biomarkerId", "", "included", "", "value", "unit", "", "calculatedBiomarkerDependencies", "<init>", "(Ljava/lang/String;ZLjava/lang/Double;Ljava/lang/String;Ljava/util/Set;)V", "a", "(Ljava/lang/String;ZLjava/lang/Double;Ljava/lang/String;Ljava/util/Set;)Lub0/b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "b", "Z", "e", "()Z", "Ljava/lang/Double;", "g", "()Ljava/lang/Double;", "d", "f", "Ljava/util/Set;", "()Ljava/util/Set;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C34737b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String biomarkerId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean included;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Double value;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String unit;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Set<String> calculatedBiomarkerDependencies;

    public C34737b(String biomarkerId, boolean z4, Double d3, String str, Set<String> calculatedBiomarkerDependencies) {
        AbstractC22676k.m65750j(biomarkerId, "biomarkerId");
        AbstractC22676k.m65750j(calculatedBiomarkerDependencies, "calculatedBiomarkerDependencies");
        this.biomarkerId = biomarkerId;
        this.included = z4;
        this.value = d3;
        this.unit = str;
        this.calculatedBiomarkerDependencies = calculatedBiomarkerDependencies;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C34737b m109681b(C34737b c34737b, String str, boolean z4, Double d3, String str2, Set set, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c34737b.biomarkerId;
        }
        if ((i13 & 2) != 0) {
            z4 = c34737b.included;
        }
        if ((i13 & 4) != 0) {
            d3 = c34737b.value;
        }
        if ((i13 & 8) != 0) {
            str2 = c34737b.unit;
        }
        if ((i13 & 16) != 0) {
            set = c34737b.calculatedBiomarkerDependencies;
        }
        Set set2 = set;
        Double d14 = d3;
        return c34737b.m109682a(str, z4, d14, str2, set2);
    }

    /* JADX INFO: renamed from: a */
    public final C34737b m109682a(String biomarkerId, boolean included, Double value, String unit, Set<String> calculatedBiomarkerDependencies) {
        AbstractC22676k.m65750j(biomarkerId, "biomarkerId");
        AbstractC22676k.m65750j(calculatedBiomarkerDependencies, "calculatedBiomarkerDependencies");
        return new C34737b(biomarkerId, included, value, unit, calculatedBiomarkerDependencies);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getBiomarkerId() {
        return this.biomarkerId;
    }

    /* JADX INFO: renamed from: d */
    public final Set<String> m109684d() {
        return this.calculatedBiomarkerDependencies;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIncluded() {
        return this.included;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C34737b)) {
            return false;
        }
        C34737b c34737b = (C34737b) other;
        return AbstractC22676k.m65745e(this.biomarkerId, c34737b.biomarkerId) && this.included == c34737b.included && AbstractC22676k.m65745e(this.value, c34737b.value) && AbstractC22676k.m65745e(this.unit, c34737b.unit) && AbstractC22676k.m65745e(this.calculatedBiomarkerDependencies, c34737b.calculatedBiomarkerDependencies);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getUnit() {
        return this.unit;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Double getValue() {
        return this.value;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(this.biomarkerId.hashCode() * 31, 31, this.included);
        Double d3 = this.value;
        int iHashCode = (iM8289b + (d3 == null ? 0 : d3.hashCode())) * 31;
        String str = this.unit;
        return this.calculatedBiomarkerDependencies.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.biomarkerId;
        boolean z4 = this.included;
        Double d3 = this.value;
        String str2 = this.unit;
        Set<String> set = this.calculatedBiomarkerDependencies;
        StringBuilder sbM73379l = AbstractC25012a.m73379l("BiomarkerUpdateData(biomarkerId=", str, ", included=", ", value=", z4);
        sbM73379l.append(d3);
        sbM73379l.append(", unit=");
        sbM73379l.append(str2);
        sbM73379l.append(", calculatedBiomarkerDependencies=");
        sbM73379l.append(set);
        sbM73379l.append(")");
        return sbM73379l.toString();
    }

    public /* synthetic */ C34737b(String str, boolean z4, Double d3, String str2, Set set, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z4, d3, str2, (i13 & 16) != 0 ? C25235a0.f99113w : set);
    }
}
