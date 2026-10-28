package am2;

import cm2.EnumC4821i;
import hv1.AbstractC17674d;
import hv1.EnumC17678h;
import java.time.LocalDateTime;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: am2.q */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, m65681d2 = {"Lam2/q;", "", "a", "g", "f", "e", "b", "c", "d", "Lam2/q$a;", "Lam2/q$b;", "Lam2/q$c;", "Lam2/q$d;", "Lam2/q$e;", "Lam2/q$f;", "Lam2/q$g;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC1038q {

    /* JADX INFO: renamed from: am2.q$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lam2/q$a;", "Lam2/q;", "Ljava/time/LocalDateTime;", "newDate", "<init>", "(Ljava/time/LocalDateTime;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/LocalDateTime;", "()Ljava/time/LocalDateTime;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC1038q {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final LocalDateTime newDate;

        public a(LocalDateTime newDate) {
            AbstractC22676k.m65750j(newDate, "newDate");
            this.newDate = newDate;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LocalDateTime getNewDate() {
            return this.newDate;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.newDate, ((a) other).newDate);
        }

        public int hashCode() {
            return this.newDate.hashCode();
        }

        public String toString() {
            return "DateChanged(newDate=" + this.newDate + ")";
        }
    }

    /* JADX INFO: renamed from: am2.q$b */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\t¨\u0006\u0017"}, m65681d2 = {"Lam2/q$b;", "Lam2/q;", "Lcm2/i;", "measurementId", "", "id", "<init>", "(Lcm2/i;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcm2/i;", "b", "()Lcm2/i;", "Ljava/lang/String;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC1038q {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC4821i measurementId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String id;

        public b(EnumC4821i measurementId, String id4) {
            AbstractC22676k.m65750j(measurementId, "measurementId");
            AbstractC22676k.m65750j(id4, "id");
            this.measurementId = measurementId;
            this.id = id4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnumC4821i getMeasurementId() {
            return this.measurementId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return this.measurementId == bVar.measurementId && AbstractC22676k.m65745e(this.id, bVar.id);
        }

        public int hashCode() {
            return this.id.hashCode() + (this.measurementId.hashCode() * 31);
        }

        public String toString() {
            return "DeleteClicked(measurementId=" + this.measurementId + ", id=" + this.id + ")";
        }
    }

    /* JADX INFO: renamed from: am2.q$c */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lam2/q$c;", "Lam2/q;", "Lcm2/i;", "measurementId", "Lhv1/d;", "measurement", "<init>", "(Lcm2/i;Lhv1/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcm2/i;", "b", "()Lcm2/i;", "Lhv1/d;", "()Lhv1/d;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC1038q {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC4821i measurementId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final AbstractC17674d measurement;

        public c(EnumC4821i measurementId, AbstractC17674d measurement) {
            AbstractC22676k.m65750j(measurementId, "measurementId");
            AbstractC22676k.m65750j(measurement, "measurement");
            this.measurementId = measurementId;
            this.measurement = measurement;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AbstractC17674d getMeasurement() {
            return this.measurement;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnumC4821i getMeasurementId() {
            return this.measurementId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return this.measurementId == cVar.measurementId && AbstractC22676k.m65745e(this.measurement, cVar.measurement);
        }

        public int hashCode() {
            return this.measurement.hashCode() + (this.measurementId.hashCode() * 31);
        }

        public String toString() {
            return "EditClicked(measurementId=" + this.measurementId + ", measurement=" + this.measurement + ")";
        }
    }

    /* JADX INFO: renamed from: am2.q$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lam2/q$d;", "Lam2/q;", "<init>", "()V", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC1038q {

        /* JADX INFO: renamed from: a */
        public static final d f4000a = new d();

        private d() {
        }
    }

    /* JADX INFO: renamed from: am2.q$e */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lam2/q$e;", "Lam2/q;", "Lcm2/i;", "measurementId", "Lhv1/d;", "measurement", "<init>", "(Lcm2/i;Lhv1/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcm2/i;", "b", "()Lcm2/i;", "Lhv1/d;", "()Lhv1/d;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e implements InterfaceC1038q {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC4821i measurementId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final AbstractC17674d measurement;

        public e(EnumC4821i measurementId, AbstractC17674d measurement) {
            AbstractC22676k.m65750j(measurementId, "measurementId");
            AbstractC22676k.m65750j(measurement, "measurement");
            this.measurementId = measurementId;
            this.measurement = measurement;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AbstractC17674d getMeasurement() {
            return this.measurement;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnumC4821i getMeasurementId() {
            return this.measurementId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return this.measurementId == eVar.measurementId && AbstractC22676k.m65745e(this.measurement, eVar.measurement);
        }

        public int hashCode() {
            return this.measurement.hashCode() + (this.measurementId.hashCode() * 31);
        }

        public String toString() {
            return "SaveClicked(measurementId=" + this.measurementId + ", measurement=" + this.measurement + ")";
        }
    }

    /* JADX INFO: renamed from: am2.q$f */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lam2/q$f;", "Lam2/q;", "Lhv1/h;", "newSource", "<init>", "(Lhv1/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhv1/h;", "()Lhv1/h;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f implements InterfaceC1038q {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC17678h newSource;

        public f(EnumC17678h newSource) {
            AbstractC22676k.m65750j(newSource, "newSource");
            this.newSource = newSource;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC17678h getNewSource() {
            return this.newSource;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof f) && this.newSource == ((f) other).newSource;
        }

        public int hashCode() {
            return this.newSource.hashCode();
        }

        public String toString() {
            return "SourceChanged(newSource=" + this.newSource + ")";
        }
    }

    /* JADX INFO: renamed from: am2.q$g */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, m65681d2 = {"Lam2/q$g;", "Lam2/q;", "", "newValue", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g implements InterfaceC1038q {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int newValue;

        public g(int i13) {
            this.newValue = i13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getNewValue() {
            return this.newValue;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof g) && this.newValue == ((g) other).newValue;
        }

        public int hashCode() {
            return Integer.hashCode(this.newValue);
        }

        public String toString() {
            return AbstractC2875y.m8296i(this.newValue, "Vo2MaxValueChanged(newValue=", ")");
        }
    }
}
