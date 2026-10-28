package xj1;

import c41.C4141w2;
import java.io.File;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import yg2.AbstractC39529d;

/* JADX INFO: renamed from: xj1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m65681d2 = {"Lxj1/a;", "", "<init>", "()V", "f", "e", "d", "a", "c", "b", "Lxj1/a$a;", "Lxj1/a$b;", "Lxj1/a$c;", "Lxj1/a$d;", "Lxj1/a$e;", "Lxj1/a$f;", "health-monitor_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC38397a {

    /* JADX INFO: renamed from: xj1.a$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lxj1/a$a;", "Lxj1/a;", "<init>", "()V", "health-monitor_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC38397a {

        /* JADX INFO: renamed from: a */
        public static final a f164308a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: xj1.a$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lxj1/a$b;", "Lxj1/a;", "Ljava/io/File;", "file", "<init>", "(Ljava/io/File;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/io/File;", "()Ljava/io/File;", "health-monitor_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC38397a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final File file;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(File file) {
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
            return (other instanceof b) && AbstractC22676k.m65745e(this.file, ((b) other).file);
        }

        public int hashCode() {
            return this.file.hashCode();
        }

        public String toString() {
            return "DeleteHealthReport(file=" + this.file + ")";
        }
    }

    /* JADX INFO: renamed from: xj1.a$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lxj1/a$c;", "Lxj1/a;", "<init>", "()V", "health-monitor_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC38397a {

        /* JADX INFO: renamed from: a */
        public static final c f164310a = new c();

        private c() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: xj1.a$d */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m65681d2 = {"Lxj1/a$d;", "Lxj1/a;", "Lyg2/d;", "initialHr", "<init>", "(Lyg2/d;)V", "a", "Lyg2/d;", "()Lyg2/d;", "health-monitor_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC38397a {

        /* JADX INFO: renamed from: b */
        public static final int f164311b = AbstractC39529d.f169988a;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AbstractC39529d initialHr;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractC39529d initialHr) {
            super(null);
            AbstractC22676k.m65750j(initialHr, "initialHr");
            this.initialHr = initialHr;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AbstractC39529d getInitialHr() {
            return this.initialHr;
        }
    }

    /* JADX INFO: renamed from: xj1.a$e */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lxj1/a$e;", "Lxj1/a;", "Lc41/w2;", "tileState", "<init>", "(Lc41/w2;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lc41/w2;", "()Lc41/w2;", "health-monitor_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC38397a {

        /* JADX INFO: renamed from: b */
        public static final int f164313b = C4141w2.f16853o;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C4141w2 tileState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C4141w2 tileState) {
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
            return (other instanceof e) && AbstractC22676k.m65745e(this.tileState, ((e) other).tileState);
        }

        public int hashCode() {
            return this.tileState.hashCode();
        }

        public String toString() {
            return "KeyMetricTilePressed(tileState=" + this.tileState + ")";
        }
    }

    /* JADX INFO: renamed from: xj1.a$f */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lxj1/a$f;", "Lxj1/a;", "<init>", "()V", "health-monitor_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC38397a {

        /* JADX INFO: renamed from: a */
        public static final f f164315a = new f();

        private f() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC38397a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC38397a() {
    }
}
