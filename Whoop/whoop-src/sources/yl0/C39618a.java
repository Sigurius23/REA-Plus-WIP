package yl0;

import hc3.AbstractC17176i;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p716lb1.AbstractC23727v2;

/* JADX INFO: renamed from: yl0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0019\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, m65681d2 = {"Lyl0/a;", "", "", "min", "max", "", "decimalPlaces", "", "unit", "<init>", "(DDILjava/lang/String;)V", "value", "", "a", "(D)Z", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "D", "d", "()D", "b", "c", "I", "Ljava/lang/String;", "e", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C39618a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final double min;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final double max;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int decimalPlaces;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String unit;

    public C39618a(double d3, double d14, int i13, String unit) {
        AbstractC22676k.m65750j(unit, "unit");
        this.min = d3;
        this.max = d14;
        this.decimalPlaces = i13;
        this.unit = unit;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m126595a(double value) {
        return value <= this.max && this.min <= value && AbstractC23727v2.m69582b(value, this.decimalPlaces);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getDecimalPlaces() {
        return this.decimalPlaces;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final double getMax() {
        return this.max;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final double getMin() {
        return this.min;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getUnit() {
        return this.unit;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C39618a)) {
            return false;
        }
        C39618a c39618a = (C39618a) other;
        return Double.compare(this.min, c39618a.min) == 0 && Double.compare(this.max, c39618a.max) == 0 && this.decimalPlaces == c39618a.decimalPlaces && AbstractC22676k.m65745e(this.unit, c39618a.unit);
    }

    public int hashCode() {
        return this.unit.hashCode() + AbstractC11266d.m30448b(this.decimalPlaces, AbstractC17176i.m48499a(Double.hashCode(this.min) * 31, 31, this.max), 31);
    }

    public String toString() {
        double d3 = this.min;
        double d14 = this.max;
        int i13 = this.decimalPlaces;
        String str = this.unit;
        StringBuilder sbM8306s = AbstractC2875y.m8306s("JournalEntryMagnitudeConfig(min=", d3, ", max=");
        sbM8306s.append(d14);
        sbM8306s.append(", decimalPlaces=");
        sbM8306s.append(i13);
        return AbstractC2875y.m8304q(sbM8306s, ", unit=", str, ")");
    }

    public /* synthetic */ C39618a(double d3, double d14, int i13, String str, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(d3, d14, (i14 & 4) != 0 ? 0 : i13, (i14 & 8) != 0 ? "" : str);
    }
}
