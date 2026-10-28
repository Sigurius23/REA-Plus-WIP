package j02;

import com.whoop.domain.model.WhoopUri;
import ih0.AbstractC18489d0;
import java.util.List;
import java.util.Locale;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: j02.g0 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u0004*\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lj02/g0;", "", "<init>", "()V", "", "raw", "a", "(Ljava/lang/String;)Ljava/lang/String;", "Lj02/g0$a;", "d", "(Ljava/lang/String;)Lj02/g0$a;", "", "b", "(Lj02/g0$a;)Z", "e", "(Lj02/g0$a;)Ljava/lang/String;", "Lcom/whoop/domain/model/WhoopUri;", "whoopUri", "c", "(Lcom/whoop/domain/model/WhoopUri;)Lcom/whoop/domain/model/WhoopUri;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21143g0 {

    /* JADX INFO: renamed from: j02.g0$a */
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lj02/g0$a;", "", "", "base", "", "actions", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/util/List;", "()Ljava/util/List;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String base;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<String> actions;

        public a(String base, List<String> actions) {
            AbstractC22676k.m65750j(base, "base");
            AbstractC22676k.m65750j(actions, "actions");
            this.base = base;
            this.actions = actions;
        }

        /* JADX INFO: renamed from: a */
        public final List<String> m58992a() {
            return this.actions;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getBase() {
            return this.base;
        }
    }

    /* JADX INFO: renamed from: a */
    private final String m58987a(String raw) {
        a aVarM58989d = m58989d(raw);
        if (aVarM58989d != null) {
            if (!m58988b(aVarM58989d)) {
                aVarM58989d = null;
            }
            if (aVarM58989d != null) {
                return m58990e(aVarM58989d);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    private final boolean m58988b(a aVar) {
        return aVar.m58992a().size() == 3 && AbstractC39421y.m125921F(aVar.m58992a().get(0), "ViewSettings", true) && AbstractC39421y.m125921F(aVar.m58992a().get(1), "Integrations", true);
    }

    /* JADX INFO: renamed from: d */
    private final a m58989d(String raw) {
        int iM125887f0;
        int iM125888g0 = AbstractC39414r.m125888g0(raw, "://", 0, false, 6);
        if (iM125888g0 < 0 || (iM125887f0 = AbstractC39414r.m125887f0(raw, '/', iM125888g0 + 3, false, 4)) < 0) {
            return null;
        }
        String strSubstring = raw.substring(iM125887f0);
        AbstractC22676k.m65749i(strSubstring, "substring(...)");
        String strM125870P0 = AbstractC39414r.m125870P0(AbstractC39414r.m125862H0(strSubstring, '?'), '/');
        String strSubstring2 = raw.substring(0, iM125887f0);
        AbstractC22676k.m65749i(strSubstring2, "substring(...)");
        return new a(strSubstring2, AbstractC39414r.m125906y0(AbstractC39421y.m125926K(strM125870P0, "%7C", "|", true), new String[]{"|"}, 6));
    }

    /* JADX INFO: renamed from: e */
    private final String m58990e(a aVar) {
        String base = aVar.getBase();
        String str = aVar.m58992a().get(2);
        Locale locale = Locale.US;
        return AbstractC18489d0.m53370k(base, "/integrations?integrationId=", AbstractC31061c.m95641q(locale, "US", str, locale, "toLowerCase(...)"));
    }

    /* JADX INFO: renamed from: c */
    public final WhoopUri m58991c(WhoopUri whoopUri) {
        AbstractC22676k.m65750j(whoopUri, "whoopUri");
        String strM58987a = m58987a(whoopUri.toString());
        return strM58987a == null ? whoopUri : whoopUri.parse(strM58987a);
    }
}
