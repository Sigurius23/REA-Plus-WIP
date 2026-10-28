package cm2;

import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: cm2.w */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m65681d2 = {"Lcm2/w;", "", "<init>", "()V", "d", "c", "b", "a", "Lcm2/w$a;", "Lcm2/w$b;", "Lcm2/w$c;", "Lcm2/w$d;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4835w {

    /* JADX INFO: renamed from: cm2.w$a */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001b"}, m65681d2 = {"Lcm2/w$a;", "Lcm2/w;", "Lcm2/d;", "direction", "", "startDate", "endDate", "trendName", "<init>", "(Lcm2/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcm2/d;", "()Lcm2/d;", "b", "Ljava/lang/String;", "c", "d", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC4835w {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC4816d direction;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String startDate;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String endDate;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String trendName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(EnumC4816d direction, String startDate, String endDate, String trendName) {
            super(null);
            AbstractC22676k.m65750j(direction, "direction");
            AbstractC22676k.m65750j(startDate, "startDate");
            AbstractC22676k.m65750j(endDate, "endDate");
            AbstractC22676k.m65750j(trendName, "trendName");
            this.direction = direction;
            this.startDate = startDate;
            this.endDate = endDate;
            this.trendName = trendName;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC4816d getDirection() {
            return this.direction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getEndDate() {
            return this.endDate;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getStartDate() {
            return this.startDate;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getTrendName() {
            return this.trendName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.direction == aVar.direction && AbstractC22676k.m65745e(this.startDate, aVar.startDate) && AbstractC22676k.m65745e(this.endDate, aVar.endDate) && AbstractC22676k.m65745e(this.trendName, aVar.trendName);
        }

        public int hashCode() {
            return this.trendName.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.direction.hashCode() * 31, 31, this.startDate), 31, this.endDate);
        }

        public String toString() {
            EnumC4816d enumC4816d = this.direction;
            String str = this.startDate;
            String str2 = this.endDate;
            String str3 = this.trendName;
            StringBuilder sb4 = new StringBuilder("DateNavigation(direction=");
            sb4.append(enumC4816d);
            sb4.append(", startDate=");
            sb4.append(str);
            sb4.append(", endDate=");
            return AbstractC11266d.m30464r(sb4, str2, ", trendName=", str3, ")");
        }
    }

    /* JADX INFO: renamed from: cm2.w$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcm2/w$b;", "Lcm2/w;", "Lcm2/i;", "measurementType", "<init>", "(Lcm2/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcm2/i;", "()Lcm2/i;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC4835w {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC4821i measurementType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(EnumC4821i measurementType) {
            super(null);
            AbstractC22676k.m65750j(measurementType, "measurementType");
            this.measurementType = measurementType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC4821i getMeasurementType() {
            return this.measurementType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && this.measurementType == ((b) other).measurementType;
        }

        public int hashCode() {
            return this.measurementType.hashCode();
        }

        public String toString() {
            return "OpenedAddManualMeasurement(measurementType=" + this.measurementType + ")";
        }
    }

    /* JADX INFO: renamed from: cm2.w$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcm2/w$c;", "Lcm2/w;", "<init>", "()V", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC4835w {

        /* JADX INFO: renamed from: a */
        public static final c f19917a = new c();

        private c() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: cm2.w$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcm2/w$d;", "Lcm2/w;", "<init>", "()V", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC4835w {

        /* JADX INFO: renamed from: a */
        public static final d f19918a = new d();

        private d() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC4835w(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC4835w() {
    }
}
