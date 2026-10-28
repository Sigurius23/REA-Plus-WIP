package yh1;

import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: yh1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0012B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u0019"}, m65681d2 = {"Lyh1/b;", "", "", "value", "", "unit", "accuracy", "<init>", "(DLjava/lang/String;D)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "c", "()D", "b", "Ljava/lang/String;", "d", "gps-tracking_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C39541b {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final double value;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String unit;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final double accuracy;

    /* JADX INFO: renamed from: yh1.b$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lyh1/b$a;", "", "<init>", "()V", "", "value", "", "unit", "accuracy", "Lyh1/b;", "a", "(DLjava/lang/String;D)Lyh1/b;", "gps-tracking_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ C39541b m126317b(Companion companion, double d3, String str, double d14, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                str = "m/s";
            }
            return companion.m126318a(d3, str, d14);
        }

        /* JADX INFO: renamed from: a */
        public final C39541b m126318a(double value, String unit, double accuracy) {
            AbstractC22676k.m65750j(unit, "unit");
            if (value < 0.0d || Math.abs(value) > Double.MAX_VALUE || Math.abs(accuracy) > Double.MAX_VALUE) {
                return null;
            }
            return new C39541b(value, unit, accuracy);
        }

        private Companion() {
        }
    }

    public C39541b(double d3, String unit, double d14) {
        AbstractC22676k.m65750j(unit, "unit");
        this.value = d3;
        this.unit = unit;
        this.accuracy = d14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getAccuracy() {
        return this.accuracy;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getUnit() {
        return this.unit;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final double getValue() {
        return this.value;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C39541b)) {
            return false;
        }
        C39541b c39541b = (C39541b) other;
        return Double.compare(this.value, c39541b.value) == 0 && AbstractC22676k.m65745e(this.unit, c39541b.unit) && Double.compare(this.accuracy, c39541b.accuracy) == 0;
    }

    public int hashCode() {
        return Double.hashCode(this.accuracy) + AbstractC11266d.m30450d(Double.hashCode(this.value) * 31, 31, this.unit);
    }

    public String toString() {
        return "SpeedData(value=" + this.value + ", unit=" + this.unit + ", accuracy=" + this.accuracy + ")";
    }
}
