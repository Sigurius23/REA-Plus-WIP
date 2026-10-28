package sr1;

import hc3.AbstractC17176i;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: sr1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Lsr1/a;", "", "<init>", "()V", "c", "b", "a", "Lsr1/a$a;", "Lsr1/a$b;", "Lsr1/a$c;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32909a {

    /* JADX INFO: renamed from: sr1.a$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lsr1/a$a;", "Lsr1/a;", "<init>", "()V", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32909a {

        /* JADX INFO: renamed from: a */
        public static final a f137131a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: sr1.a$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u001b"}, m65681d2 = {"Lsr1/a$b;", "Lsr1/a;", "", "min", "max", "value", "", "unit", "<init>", "(DDDLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "b", "()D", "c", "d", "Ljava/lang/String;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC32909a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final double min;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final double max;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final double value;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String unit;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(double d3, double d14, double d15, String unit) {
            super(null);
            AbstractC22676k.m65750j(unit, "unit");
            this.min = d3;
            this.max = d14;
            this.value = d15;
            this.unit = unit;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final double getMax() {
            return this.max;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final double getMin() {
            return this.min;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getUnit() {
            return this.unit;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final double getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return Double.compare(this.min, bVar.min) == 0 && Double.compare(this.max, bVar.max) == 0 && Double.compare(this.value, bVar.value) == 0 && AbstractC22676k.m65745e(this.unit, bVar.unit);
        }

        public int hashCode() {
            return this.unit.hashCode() + AbstractC17176i.m48499a(AbstractC17176i.m48499a(Double.hashCode(this.min) * 31, 31, this.max), 31, this.value);
        }

        public String toString() {
            double d3 = this.min;
            double d14 = this.max;
            double d15 = this.value;
            String str = this.unit;
            StringBuilder sbM8306s = AbstractC2875y.m8306s("Magnitude(min=", d3, ", max=");
            sbM8306s.append(d14);
            AbstractC31061c.m95622B(sbM8306s, ", value=", d15, ", unit=");
            return AbstractC25012a.m73376i(str, ")", sbM8306s);
        }
    }

    /* JADX INFO: renamed from: sr1.a$c */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lsr1/a$c;", "Lsr1/a;", "", "time", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC32909a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String time;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String time) {
            super(null);
            AbstractC22676k.m65750j(time, "time");
            this.time = time;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getTime() {
            return this.time;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && AbstractC22676k.m65745e(this.time, ((c) other).time);
        }

        public int hashCode() {
            return this.time.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("TimePicker(time=", this.time, ")");
        }
    }

    public /* synthetic */ AbstractC32909a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC32909a() {
    }
}
