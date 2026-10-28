package a12;

import i63.AbstractC18157a;
import io.getstream.chat.android.client.api.QueryParams;
import io.ktor.http.URLDecodeException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: a12.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u00062\u0006\u0010\u0005\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010\t\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u001d\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"", "path", "La12/a;", "e", "(Ljava/lang/String;)La12/a;", QueryParams.URL, "Ll83/k;", "c", "(Ljava/lang/String;)Ll83/k;", "query", "", "d", "(Ljava/lang/String;)Ljava/util/Map;", "", "plusIsSpace", "a", "(Ljava/lang/String;Z)Ljava/lang/String;", "network_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC0142b {
    /* JADX INFO: renamed from: a */
    private static final String m356a(String str, boolean z4) {
        try {
            return AbstractC18157a.m52155e(0, 0, 11, str, z4);
        } catch (URLDecodeException unused) {
            return str;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m357b(String str, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = false;
        }
        return m356a(str, z4);
    }

    /* JADX INFO: renamed from: c */
    private static final C23465k m358c(String str) {
        List listM125906y0 = AbstractC39414r.m125906y0(str, new String[]{"?"}, 2);
        return new C23465k((String) listM125906y0.get(0), (String) (1 < listM125906y0.size() ? listM125906y0.get(1) : ""));
    }

    /* JADX INFO: renamed from: d */
    private static final Map<String, String> m359d(String str) {
        List<String> listM125906y0 = AbstractC39414r.m125906y0(str, new String[]{"&"}, 6);
        ArrayList arrayList = new ArrayList();
        for (String str2 : listM125906y0) {
            C23465k c23465k = null;
            if (str2.length() != 0) {
                List listM125906y1 = AbstractC39414r.m125906y0(str2, new String[]{"="}, 2);
                String strM357b = m357b((String) listM125906y1.get(0), false, 1, null);
                String strM356a = m356a((String) (1 < listM125906y1.size() ? listM125906y1.get(1) : ""), true);
                if (strM357b.length() > 0) {
                    c23465k = new C23465k(strM357b, strM356a);
                }
            }
            if (c23465k != null) {
                arrayList.add(c23465k);
            }
        }
        return AbstractC25247g0.m74000i0(arrayList);
    }

    /* JADX INFO: renamed from: e */
    public static final C0141a m360e(String path) {
        AbstractC22676k.m65750j(path, "path");
        C23465k c23465kM358c = m358c(path);
        return new C0141a(path, (String) c23465kM358c.f92937w, m359d((String) c23465kM358c.f92938x));
    }
}
