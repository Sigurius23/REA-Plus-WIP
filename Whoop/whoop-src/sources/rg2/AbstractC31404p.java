package rg2;

import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: rg2.p */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Lrg2/p;", "", "<init>", "()V", "b", "a", "c", "Lrg2/p$a;", "Lrg2/p$b;", "Lrg2/p$c;", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31404p {

    /* JADX INFO: renamed from: rg2.p$a */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lrg2/p$a;", "Lrg2/p;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC31404p {

        /* JADX INFO: renamed from: a */
        public static final a f129250a = new a();

        private a() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return 1142226890;
        }

        public String toString() {
            return "Calibrating";
        }
    }

    /* JADX INFO: renamed from: rg2.p$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, m65681d2 = {"Lrg2/p$b;", "Lrg2/p;", "", "heartRate", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC31404p {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int heartRate;

        public b(int i13) {
            super(null);
            this.heartRate = i13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getHeartRate() {
            return this.heartRate;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && this.heartRate == ((b) other).heartRate;
        }

        public int hashCode() {
            return Integer.hashCode(this.heartRate);
        }

        public String toString() {
            return AbstractC2875y.m8296i(this.heartRate, "Connected(heartRate=", ")");
        }
    }

    public /* synthetic */ AbstractC31404p(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC31404p() {
    }

    /* JADX INFO: renamed from: rg2.p$c */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lrg2/p$c;", "Lrg2/p;", "Lgz0/m0;", "icon", "Lrg2/t;", "statusMessage", "<init>", "(Lgz0/m0;Lrg2/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgz0/m0;", "()Lgz0/m0;", "b", "Lrg2/t;", "()Lrg2/t;", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC31404p {

        /* JADX INFO: renamed from: c */
        public static final int f129252c = TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC16313m0 icon;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C31408t statusMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(EnumC16313m0 icon, C31408t c31408t) {
            super(null);
            AbstractC22676k.m65750j(icon, "icon");
            this.icon = icon;
            this.statusMessage = c31408t;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC16313m0 getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C31408t getStatusMessage() {
            return this.statusMessage;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return this.icon == cVar.icon && AbstractC22676k.m65745e(this.statusMessage, cVar.statusMessage);
        }

        public int hashCode() {
            int iHashCode = this.icon.hashCode() * 31;
            C31408t c31408t = this.statusMessage;
            return iHashCode + (c31408t == null ? 0 : c31408t.hashCode());
        }

        public String toString() {
            return "Inactive(icon=" + this.icon + ", statusMessage=" + this.statusMessage + ")";
        }

        public /* synthetic */ c(EnumC16313m0 enumC16313m0, C31408t c31408t, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? EnumC16313m0.TINY_HEART_RATE : enumC16313m0, (i13 & 2) != 0 ? null : c31408t);
        }
    }
}
