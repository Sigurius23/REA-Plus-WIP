package dl0;

import a12.C0141a;
import com.whoop.metrics.domain.models.MetricPostType;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import jy1.C22047a;
import l83.C23465k;
import l83.C23467m;
import m83.AbstractC25265s;
import p000.AbstractC11266d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import t83.InterfaceC33616a;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;
import yb3.C39412p;

/* JADX INFO: renamed from: dl0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001:\u0002\u001b\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\fJ!\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00060\u001e2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\"R\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\"¨\u0006%"}, m65681d2 = {"Ldl0/e;", "", "<init>", "()V", "La12/a;", "parsed", "", "a", "(La12/a;)Ljava/lang/String;", "s", "", "e", "(Ljava/lang/String;)Z", "basePath", "Ljy1/a;", "g", "(Ljava/lang/String;)Ljy1/a;", "Ldl0/e$b;", "reason", "f", "(Ljava/lang/String;Ldl0/e$b;)Ljy1/a;", "path", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;)Ljava/lang/String;", "Ldl0/e$a;", "formType", "formKey", "b", "(Ldl0/e$b;Ldl0/e$a;Ljava/lang/String;)Ljy1/a;", "d", "Ll83/k;", "c", "(La12/a;)Ll83/k;", "Lyb3/p;", "Lyb3/p;", "uuidPattern", "numericIdPattern", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12166e {

    /* JADX INFO: renamed from: a */
    public static final C12166e f40463a = new C12166e();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final C39412p uuidPattern = new C39412p("[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}");

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final C39412p numericIdPattern = new C39412p("[0-9]{3,}");

    /* JADX INFO: renamed from: d */
    public static final int f40466d = 8;

    /* JADX INFO: renamed from: dl0.e$a */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m65681d2 = {"Ldl0/e$a;", "", "", "raw", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getRaw", "()Ljava/lang/String;", "STATIC", "AGENT", "UNKNOWN", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public enum a {
        STATIC("STATIC"),
        AGENT("AGENT"),
        UNKNOWN("unknown");

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
        private final String raw;

        a(String str) {
            this.raw = str;
        }

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }

        public final String getRaw() {
            return this.raw;
        }
    }

    /* JADX INFO: renamed from: dl0.e$b */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m65681d2 = {"Ldl0/e$b;", "", "", "raw", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getRaw", "()Ljava/lang/String;", "DECODE", "NETWORK", "SERVER", "PARSE", "BAD_REQUEST", "UNSUPPORTED", "UNKNOWN", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public enum b {
        DECODE("decode"),
        NETWORK("network"),
        SERVER("server"),
        PARSE("parse"),
        BAD_REQUEST("bad_request"),
        UNSUPPORTED("unsupported"),
        UNKNOWN("unknown");

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
        private final String raw;

        b(String str) {
            this.raw = str;
        }

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }

        public final String getRaw() {
            return this.raw;
        }
    }

    private C12166e() {
    }

    /* JADX INFO: renamed from: a */
    private final String m33640a(C0141a parsed) {
        String str = parsed.m354b().get("formKey");
        if (str != null) {
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        String strM125860F0 = AbstractC39414r.m125860F0('/', AbstractC39414r.m125872R0(parsed.getBasePath(), '/'), "");
        if (strM125860F0.length() == 0 || strM125860F0.equals("form")) {
            return null;
        }
        return strM125860F0;
    }

    /* JADX INFO: renamed from: e */
    private final boolean m33641e(String s13) {
        Object objM107888l;
        try {
            objM107888l = UUID.fromString(s13);
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        return !(objM107888l instanceof C23467m);
    }

    /* JADX INFO: renamed from: b */
    public final C22047a m33642b(b reason, a formType, String formKey) {
        AbstractC22676k.m65750j(reason, "reason");
        AbstractC22676k.m65750j(formType, "formType");
        AbstractC22676k.m65750j(formKey, "formKey");
        return new C22047a(0, "whoop.ai.form.load_failed", null, AbstractC37056f.m118959K("platform:android", AbstractC11266d.m30461o("reason:", reason.getRaw()), AbstractC11266d.m30461o("form_type:", formType.getRaw()), "form_key:".concat(formKey)), MetricPostType.COUNT, 5, null);
    }

    /* JADX INFO: renamed from: c */
    public final C23465k m33643c(C0141a parsed) {
        AbstractC22676k.m65750j(parsed, "parsed");
        String strM33640a = m33640a(parsed);
        if (strM33640a == null) {
            return new C23465k(a.UNKNOWN, "unknown");
        }
        return m33641e(strM33640a) ? new C23465k(a.AGENT, "redacted") : new C23465k(a.STATIC, strM33640a);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m33644d(String basePath) {
        AbstractC22676k.m65750j(basePath, "basePath");
        int iM125888g0 = AbstractC39414r.m125888g0(basePath, "v1/form", 0, false, 6);
        if (iM125888g0 >= 0) {
            String strSubstring = basePath.substring(iM125888g0 + 7);
            AbstractC22676k.m65749i(strSubstring, "substring(...)");
            if (strSubstring.length() == 0 || AbstractC39421y.m125930O(strSubstring, "/", false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final C22047a m33645f(String basePath, b reason) {
        AbstractC22676k.m65750j(basePath, "basePath");
        AbstractC22676k.m65750j(reason, "reason");
        return new C22047a(0, "whoop.ai.mini_arc.failure", null, AbstractC37056f.m118959K("platform:android", AbstractC11266d.m30461o("path:", m33647h(basePath)), AbstractC11266d.m30461o("reason:", reason.getRaw())), MetricPostType.COUNT, 5, null);
    }

    /* JADX INFO: renamed from: g */
    public final C22047a m33646g(String basePath) {
        AbstractC22676k.m65750j(basePath, "basePath");
        return new C22047a(0, "whoop.ai.mini_arc.success", null, AbstractC37056f.m118959K("platform:android", AbstractC11266d.m30461o("path:", m33647h(basePath))), MetricPostType.COUNT, 5, null);
    }

    /* JADX INFO: renamed from: h */
    public final String m33647h(String path) {
        AbstractC22676k.m65750j(path, "path");
        List listM125905x0 = AbstractC39414r.m125905x0(numericIdPattern.m125852f(uuidPattern.m125852f(AbstractC39414r.m125862H0(AbstractC39414r.m125862H0(path, '?'), '#'), "uuid"), "123"), new char[]{'/'}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM125905x0) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        return AbstractC25265s.m74110N0(arrayList, "/", null, null, null, 62);
    }
}
