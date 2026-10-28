package xj1;

import c41.C4141w2;
import com.whoop.healthmonitor.domain.models.ComposableHealthMonitorResponse;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.File;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import yg2.AbstractC39529d;

/* JADX INFO: renamed from: xj1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, m65681d2 = {"Lxj1/b;", "", "<init>", "()V", "b", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "g", "a", "e", "f", "d", "c", "Lxj1/b$a;", "Lxj1/b$b;", "Lxj1/b$c;", "Lxj1/b$d;", "Lxj1/b$e;", "Lxj1/b$f;", "Lxj1/b$g;", "Lxj1/b$h;", "Lxj1/b$i;", "health-monitor_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC38398b {

    /* JADX INFO: renamed from: xj1.b$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lxj1/b$a;", "Lxj1/b;", "<init>", "()V", "health-monitor_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC38398b {

        /* JADX INFO: renamed from: a */
        public static final a f164316a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: xj1.b$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lxj1/b$b;", "Lxj1/b;", "<init>", "()V", "health-monitor_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC38398b {

        /* JADX INFO: renamed from: a */
        public static final b f164317a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: xj1.b$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lxj1/b$c;", "Lxj1/b;", "<init>", "()V", "health-monitor_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC38398b {

        /* JADX INFO: renamed from: a */
        public static final c f164318a = new c();

        private c() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: xj1.b$d */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lxj1/b$d;", "Lxj1/b;", "", "message", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "health-monitor_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC38398b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String message;

        public d(String str) {
            super(null);
            this.message = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && AbstractC22676k.m65745e(this.message, ((d) other).message);
        }

        public int hashCode() {
            String str = this.message;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("HealthReportError(message=", this.message, ")");
        }

        public /* synthetic */ d(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : str);
        }
    }

    /* JADX INFO: renamed from: xj1.b$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lxj1/b$e;", "Lxj1/b;", "<init>", "()V", "health-monitor_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC38398b {

        /* JADX INFO: renamed from: a */
        public static final e f164320a = new e();

        private e() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: xj1.b$f */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lxj1/b$f;", "Lxj1/b;", "Ljava/io/File;", "file", "<init>", "(Ljava/io/File;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/io/File;", "()Ljava/io/File;", "health-monitor_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC38398b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final File file;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(File file) {
            super(null);
            AbstractC22676k.m65750j(file, "file");
            this.file = file;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final File getFile() {
            return this.file;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof f) && AbstractC22676k.m65745e(this.file, ((f) other).file);
        }

        public int hashCode() {
            return this.file.hashCode();
        }

        public String toString() {
            return "HealthReportSuccess(file=" + this.file + ")";
        }
    }

    /* JADX INFO: renamed from: xj1.b$g */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m65681d2 = {"Lxj1/b$g;", "Lxj1/b;", "Lyg2/d;", "initialHr", "<init>", "(Lyg2/d;)V", "a", "Lyg2/d;", "()Lyg2/d;", "health-monitor_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC38398b {

        /* JADX INFO: renamed from: b */
        public static final int f164322b = AbstractC39529d.f169988a;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AbstractC39529d initialHr;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(AbstractC39529d initialHr) {
            super(null);
            AbstractC22676k.m65750j(initialHr, "initialHr");
            this.initialHr = initialHr;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AbstractC39529d getInitialHr() {
            return this.initialHr;
        }
    }

    /* JADX INFO: renamed from: xj1.b$h */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lxj1/b$h;", "Lxj1/b;", "Lc41/w2;", "tileState", "<init>", "(Lc41/w2;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lc41/w2;", "()Lc41/w2;", "health-monitor_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h extends AbstractC38398b {

        /* JADX INFO: renamed from: b */
        public static final int f164324b = C4141w2.f16853o;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C4141w2 tileState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(C4141w2 tileState) {
            super(null);
            AbstractC22676k.m65750j(tileState, "tileState");
            this.tileState = tileState;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C4141w2 getTileState() {
            return this.tileState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof h) && AbstractC22676k.m65745e(this.tileState, ((h) other).tileState);
        }

        public int hashCode() {
            return this.tileState.hashCode();
        }

        public String toString() {
            return "KeyMetricTilePressed(tileState=" + this.tileState + ")";
        }
    }

    /* JADX INFO: renamed from: xj1.b$i */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lxj1/b$i;", "Lxj1/b;", "Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;", "response", "<init>", "(Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;", "()Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;", "health-monitor_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i extends AbstractC38398b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final ComposableHealthMonitorResponse response;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComposableHealthMonitorResponse response) {
            super(null);
            AbstractC22676k.m65750j(response, "response");
            this.response = response;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ComposableHealthMonitorResponse getResponse() {
            return this.response;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof i) && AbstractC22676k.m65745e(this.response, ((i) other).response);
        }

        public int hashCode() {
            return this.response.hashCode();
        }

        public String toString() {
            return "Result(response=" + this.response + ")";
        }
    }

    public /* synthetic */ AbstractC38398b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC38398b() {
    }
}
