package zx0;

import com.mapbox.common.HttpHeaders;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import tu1.C34188a;

/* JADX INFO: renamed from: zx0.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m65681d2 = {"Lzx0/b;", "", "<init>", "()V", "b", "a", "Lzx0/b$a;", "Lzx0/b$b;", "deep-dive_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC41204b {

    /* JADX INFO: renamed from: zx0.b$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lzx0/b$a;", "Lzx0/b;", "Ltu1/a;", "state", "<init>", "(Ltu1/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ltu1/a;", "()Ltu1/a;", "deep-dive_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC41204b {

        /* JADX INFO: renamed from: b */
        public static final int f177779b = C34188a.f143397d;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C34188a state;

        public a(C34188a c34188a) {
            super(null);
            this.state = c34188a;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C34188a getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.state, ((a) other).state);
        }

        public int hashCode() {
            C34188a c34188a = this.state;
            if (c34188a == null) {
                return 0;
            }
            return c34188a.hashCode();
        }

        public String toString() {
            return "BottomSheetClicked(state=" + this.state + ")";
        }
    }

    /* JADX INFO: renamed from: zx0.b$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0017\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0018\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lzx0/b$b;", "Lzx0/b;", "", "pillar", HttpHeaders.DATE, "Lzx0/c;", "domainState", "", "manualRefresh", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lzx0/c;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "c", "Lzx0/c;", "()Lzx0/c;", "Z", "()Z", "deep-dive_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC41204b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String pillar;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String date;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C41205c domainState;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean manualRefresh;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String pillar, String str, C41205c c41205c, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(pillar, "pillar");
            this.pillar = pillar;
            this.date = str;
            this.domainState = c41205c;
            this.manualRefresh = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C41205c getDomainState() {
            return this.domainState;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getManualRefresh() {
            return this.manualRefresh;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getPillar() {
            return this.pillar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.pillar, bVar.pillar) && AbstractC22676k.m65745e(this.date, bVar.date) && AbstractC22676k.m65745e(this.domainState, bVar.domainState) && this.manualRefresh == bVar.manualRefresh;
        }

        public int hashCode() {
            int iHashCode = this.pillar.hashCode() * 31;
            String str = this.date;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            C41205c c41205c = this.domainState;
            return Boolean.hashCode(this.manualRefresh) + ((iHashCode2 + (c41205c != null ? c41205c.hashCode() : 0)) * 31);
        }

        public String toString() {
            String str = this.pillar;
            String str2 = this.date;
            C41205c c41205c = this.domainState;
            boolean z4 = this.manualRefresh;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("Refresh(pillar=", str, ", date=", str2, ", domainState=");
            sbM32001t.append(c41205c);
            sbM32001t.append(", manualRefresh=");
            sbM32001t.append(z4);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }

        public /* synthetic */ b(String str, String str2, C41205c c41205c, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i13 & 4) != 0 ? null : c41205c, (i13 & 8) != 0 ? false : z4);
        }
    }

    public /* synthetic */ AbstractC41204b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC41204b() {
    }
}
