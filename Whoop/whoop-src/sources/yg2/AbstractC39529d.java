package yg2;

import com.whoop.hrZones.network.ZoneID;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: yg2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m65681d2 = {"Lyg2/d;", "", "<init>", "()V", "d", "c", "e", "b", "a", "Lyg2/d$a;", "Lyg2/d$b;", "Lyg2/d$c;", "Lyg2/d$d;", "Lyg2/d$e;", "connectivity-common-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39529d {

    /* JADX INFO: renamed from: a */
    public static final int f169988a = 0;

    /* JADX INFO: renamed from: yg2.d$a */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lyg2/d$a;", "Lyg2/d;", "", "heartRate", "Lcom/whoop/hrZones/network/ZoneID;", "zoneID", "<init>", "(ILcom/whoop/hrZones/network/ZoneID;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "I", "a", "c", "Lcom/whoop/hrZones/network/ZoneID;", "()Lcom/whoop/hrZones/network/ZoneID;", "connectivity-common-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC39529d {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int heartRate;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final ZoneID zoneID;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i13, ZoneID zoneID) {
            super(null);
            AbstractC22676k.m65750j(zoneID, "zoneID");
            this.heartRate = i13;
            this.zoneID = zoneID;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getHeartRate() {
            return this.heartRate;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ZoneID getZoneID() {
            return this.zoneID;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.heartRate == aVar.heartRate && this.zoneID == aVar.zoneID;
        }

        public int hashCode() {
            return this.zoneID.hashCode() + (Integer.hashCode(this.heartRate) * 31);
        }

        public String toString() {
            return "Active(heartRate=" + this.heartRate + ", zoneID=" + this.zoneID + ")";
        }
    }

    /* JADX INFO: renamed from: yg2.d$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lyg2/d$b;", "Lyg2/d;", "<init>", "()V", "connectivity-common-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC39529d {

        /* JADX INFO: renamed from: b */
        public static final b f169991b = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: yg2.d$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lyg2/d$c;", "Lyg2/d;", "<init>", "()V", "connectivity-common-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC39529d {

        /* JADX INFO: renamed from: b */
        public static final c f169992b = new c();

        private c() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: yg2.d$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lyg2/d$d;", "Lyg2/d;", "<init>", "()V", "connectivity-common-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC39529d {

        /* JADX INFO: renamed from: b */
        public static final d f169993b = new d();

        private d() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: yg2.d$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lyg2/d$e;", "Lyg2/d;", "<init>", "()V", "connectivity-common-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC39529d {

        /* JADX INFO: renamed from: b */
        public static final e f169994b = new e();

        private e() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC39529d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC39529d() {
    }
}
