package xk0;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: xk0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\t\n\u0006\u000b\f\r\u000e\u000fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\b\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, m65681d2 = {"Lxk0/d;", "", "", "analyticsString", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "f", "b", "e", "c", "g", "d", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lxk0/d$a;", "Lxk0/d$b;", "Lxk0/d$c;", "Lxk0/d$d;", "Lxk0/d$e;", "Lxk0/d$f;", "Lxk0/d$g;", "Lxk0/d$h;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC38426d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String analyticsString;

    /* JADX INFO: renamed from: xk0.d$a */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Lxk0/d$a;", "Lxk0/d;", "", "statusCode", "<init>", "(I)V", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC38426d {
        public a(int i13) {
            super(AbstractC2875y.m8295h(i13, "client_error_"), null);
        }
    }

    /* JADX INFO: renamed from: xk0.d$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lxk0/d$b;", "Lxk0/d;", "<init>", "()V", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC38426d {

        /* JADX INFO: renamed from: b */
        public static final b f164571b = new b();

        private b() {
            super("no_connection", null);
        }
    }

    /* JADX INFO: renamed from: xk0.d$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lxk0/d$c;", "Lxk0/d;", "<init>", "()V", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC38426d {

        /* JADX INFO: renamed from: b */
        public static final c f164572b = new c();

        private c() {
            super("parsing_error", null);
        }
    }

    /* JADX INFO: renamed from: xk0.d$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lxk0/d$d;", "Lxk0/d;", "<init>", "()V", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC38426d {

        /* JADX INFO: renamed from: b */
        public static final d f164573b = new d();

        private d() {
            super("rate_limit", null);
        }
    }

    /* JADX INFO: renamed from: xk0.d$e */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Lxk0/d$e;", "Lxk0/d;", "", "statusCode", "<init>", "(I)V", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC38426d {
        public e(int i13) {
            super(AbstractC2875y.m8295h(i13, "server_error_"), null);
        }
    }

    /* JADX INFO: renamed from: xk0.d$f */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lxk0/d$f;", "Lxk0/d;", "<init>", "()V", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC38426d {

        /* JADX INFO: renamed from: b */
        public static final f f164574b = new f();

        private f() {
            super("timeout", null);
        }
    }

    /* JADX INFO: renamed from: xk0.d$g */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lxk0/d$g;", "Lxk0/d;", "<init>", "()V", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC38426d {

        /* JADX INFO: renamed from: b */
        public static final g f164575b = new g();

        private g() {
            super("unauthorized", null);
        }
    }

    /* JADX INFO: renamed from: xk0.d$h */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lxk0/d$h;", "Lxk0/d;", "<init>", "()V", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC38426d {

        /* JADX INFO: renamed from: b */
        public static final h f164576b = new h();

        private h() {
            super("unknown", null);
        }
    }

    public /* synthetic */ AbstractC38426d(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAnalyticsString() {
        return this.analyticsString;
    }

    private AbstractC38426d(String str) {
        this.analyticsString = str;
    }
}
