package dh2;

import c13.AbstractC3855a;
import eh2.EnumC13196a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: dh2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m65681d2 = {"Ldh2/c;", "", "<init>", "()V", "d", "c", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "e", "f", "a", "b", "g", "Ldh2/c$a;", "Ldh2/c$b;", "Ldh2/c$c;", "Ldh2/c$d;", "Ldh2/c$e;", "Ldh2/c$f;", "Ldh2/c$g;", "Ldh2/c$h;", "stealth-mode_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC12050c {

    /* JADX INFO: renamed from: dh2.c$a */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Ldh2/c$a;", "Ldh2/c;", "", "isStealthModeEnabled", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "stealth-mode_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC12050c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isStealthModeEnabled;

        public a(boolean z4) {
            super(null);
            this.isStealthModeEnabled = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getIsStealthModeEnabled() {
            return this.isStealthModeEnabled;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && this.isStealthModeEnabled == ((a) other).isStealthModeEnabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isStealthModeEnabled);
        }

        public String toString() {
            return AbstractC3855a.m11827k("Display(isStealthModeEnabled=", ")", this.isStealthModeEnabled);
        }
    }

    /* JADX INFO: renamed from: dh2.c$b */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Ldh2/c$b;", "Ldh2/c;", "", "isStealthModeEnabled", "", "Ldh2/a;", "hiddenMetrics", "<init>", "(ZLjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "Ljava/util/List;", "()Ljava/util/List;", "stealth-mode_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC12050c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isStealthModeEnabled;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<C12048a> hiddenMetrics;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z4, List<C12048a> hiddenMetrics) {
            super(null);
            AbstractC22676k.m65750j(hiddenMetrics, "hiddenMetrics");
            this.isStealthModeEnabled = z4;
            this.hiddenMetrics = hiddenMetrics;
        }

        /* JADX INFO: renamed from: a */
        public final List<C12048a> m33199a() {
            return this.hiddenMetrics;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsStealthModeEnabled() {
            return this.isStealthModeEnabled;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return this.isStealthModeEnabled == bVar.isStealthModeEnabled && AbstractC22676k.m65745e(this.hiddenMetrics, bVar.hiddenMetrics);
        }

        public int hashCode() {
            return this.hiddenMetrics.hashCode() + (Boolean.hashCode(this.isStealthModeEnabled) * 31);
        }

        public String toString() {
            return "DisplayHiddenMetrics(isStealthModeEnabled=" + this.isStealthModeEnabled + ", hiddenMetrics=" + this.hiddenMetrics + ")";
        }
    }

    /* JADX INFO: renamed from: dh2.c$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldh2/c$c;", "Ldh2/c;", "<init>", "()V", "stealth-mode_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC12050c {

        /* JADX INFO: renamed from: a */
        public static final c f39899a = new c();

        private c() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: dh2.c$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldh2/c$d;", "Ldh2/c;", "<init>", "()V", "stealth-mode_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC12050c {

        /* JADX INFO: renamed from: a */
        public static final d f39900a = new d();

        private d() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: dh2.c$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldh2/c$e;", "Ldh2/c;", "<init>", "()V", "stealth-mode_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC12050c {

        /* JADX INFO: renamed from: a */
        public static final e f39901a = new e();

        private e() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: dh2.c$f */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Ldh2/c$f;", "Ldh2/c;", "", "isStealthModeEnabled", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "stealth-mode_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC12050c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isStealthModeEnabled;

        public f(boolean z4) {
            super(null);
            this.isStealthModeEnabled = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getIsStealthModeEnabled() {
            return this.isStealthModeEnabled;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof f) && this.isStealthModeEnabled == ((f) other).isStealthModeEnabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isStealthModeEnabled);
        }

        public String toString() {
            return AbstractC3855a.m11827k("Saved(isStealthModeEnabled=", ")", this.isStealthModeEnabled);
        }
    }

    /* JADX INFO: renamed from: dh2.c$g */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Ldh2/c$g;", "Ldh2/c;", "Leh2/a;", "metricType", "", "isHiddenMetricEnabled", "<init>", "(Leh2/a;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Leh2/a;", "()Leh2/a;", "b", "Z", "()Z", "stealth-mode_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g extends AbstractC12050c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC13196a metricType;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean isHiddenMetricEnabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(EnumC13196a metricType, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(metricType, "metricType");
            this.metricType = metricType;
            this.isHiddenMetricEnabled = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC13196a getMetricType() {
            return this.metricType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsHiddenMetricEnabled() {
            return this.isHiddenMetricEnabled;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof g)) {
                return false;
            }
            g gVar = (g) other;
            return this.metricType == gVar.metricType && this.isHiddenMetricEnabled == gVar.isHiddenMetricEnabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isHiddenMetricEnabled) + (this.metricType.hashCode() * 31);
        }

        public String toString() {
            return "SuccessUpdateHiddenMetric(metricType=" + this.metricType + ", isHiddenMetricEnabled=" + this.isHiddenMetricEnabled + ")";
        }
    }

    /* JADX INFO: renamed from: dh2.c$h */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldh2/c$h;", "Ldh2/c;", "<init>", "()V", "stealth-mode_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC12050c {

        /* JADX INFO: renamed from: a */
        public static final h f39905a = new h();

        private h() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC12050c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC12050c() {
    }
}
