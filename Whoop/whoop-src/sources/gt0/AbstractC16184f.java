package gt0;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: gt0.f */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\t\n\u000b\f\r\u000e\u000f\b\u0010\u0011B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0001\t\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, m65681d2 = {"Lgt0/f;", "", "", "errorMessage", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "c", "b", "e", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "g", "d", "Lgt0/f$a;", "Lgt0/f$b;", "Lgt0/f$c;", "Lgt0/f$d;", "Lgt0/f$e;", "Lgt0/f$f;", "Lgt0/f$g;", "Lgt0/f$h;", "Lgt0/f$i;", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC16184f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String errorMessage;

    /* JADX INFO: renamed from: gt0.f$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lgt0/f$a;", "Lgt0/f;", "<init>", "()V", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC16184f {

        /* JADX INFO: renamed from: b */
        public static final a f61469b = new a();

        private a() {
            super("DFU error", null);
        }
    }

    /* JADX INFO: renamed from: gt0.f$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lgt0/f$b;", "Lgt0/f;", "<init>", "()V", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC16184f {

        /* JADX INFO: renamed from: b */
        public static final b f61470b = new b();

        private b() {
            super("Firmware files not found", null);
        }
    }

    /* JADX INFO: renamed from: gt0.f$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lgt0/f$c;", "Lgt0/f;", "<init>", "()V", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC16184f {

        /* JADX INFO: renamed from: b */
        public static final c f61471b = new c();

        private c() {
            super("Firmware files transfer Failed", null);
        }
    }

    /* JADX INFO: renamed from: gt0.f$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lgt0/f$d;", "Lgt0/f;", "<init>", "()V", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC16184f {

        /* JADX INFO: renamed from: b */
        public static final d f61472b = new d();

        private d() {
            super("Maximum retry reached", null);
        }
    }

    /* JADX INFO: renamed from: gt0.f$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lgt0/f$e;", "Lgt0/f;", "<init>", "()V", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC16184f {

        /* JADX INFO: renamed from: b */
        public static final e f61473b = new e();

        private e() {
            super("Process Firmware Command failed", null);
        }
    }

    /* JADX INFO: renamed from: gt0.f$f */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lgt0/f$f;", "Lgt0/f;", "<init>", "()V", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC16184f {

        /* JADX INFO: renamed from: b */
        public static final f f61474b = new f();

        private f() {
            super("Start Firmware Load Command Failed", null);
        }
    }

    /* JADX INFO: renamed from: gt0.f$g */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lgt0/f$g;", "Lgt0/f;", "<init>", "()V", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC16184f {

        /* JADX INFO: renamed from: b */
        public static final g f61475b = new g();

        private g() {
            super("Unknown", null);
        }
    }

    /* JADX INFO: renamed from: gt0.f$h */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lgt0/f$h;", "Lgt0/f;", "<init>", "()V", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC16184f {

        /* JADX INFO: renamed from: b */
        public static final h f61476b = new h();

        private h() {
            super("Verify Firmware command failed", null);
        }
    }

    /* JADX INFO: renamed from: gt0.f$i */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lgt0/f$i;", "Lgt0/f;", "<init>", "()V", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC16184f {

        /* JADX INFO: renamed from: b */
        public static final i f61477b = new i();

        private i() {
            super("Whoop device not found", null);
        }
    }

    public /* synthetic */ AbstractC16184f(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* JADX INFO: renamed from: toString, reason: from getter */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    private AbstractC16184f(String str) {
        this.errorMessage = str;
    }
}
