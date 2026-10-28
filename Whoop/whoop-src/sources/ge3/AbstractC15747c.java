package ge3;

import android.util.Log;
import ce3.AbstractC4506g;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import m83.AbstractC25247g0;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.C34826l0;
import yb3.AbstractC39414r;
import yd3.C39473d;

/* JADX INFO: renamed from: ge3.c */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15747c {

    /* JADX INFO: renamed from: a */
    public static final CopyOnWriteArraySet f59409a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b */
    public static final Map f59410b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r10 = C34826l0.class.getPackage();
        String name = r10 != null ? r10.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(C34826l0.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(AbstractC4506g.class.getName(), "okhttp.Http2");
        linkedHashMap.put(C39473d.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f59410b = AbstractC25247g0.m74001j0(linkedHashMap);
    }

    /* JADX INFO: renamed from: a */
    public static void m44417a(int i13, String str, String str2, Throwable th3) {
        int iMin;
        String strM125866L0 = (String) f59410b.get(str);
        if (strM125866L0 == null) {
            strM125866L0 = AbstractC39414r.m125866L0(23, str);
        }
        if (Log.isLoggable(strM125866L0, i13)) {
            if (th3 != null) {
                str2 = str2 + '\n' + Log.getStackTraceString(th3);
            }
            int length = str2.length();
            int i14 = 0;
            while (i14 < length) {
                int iM125887f0 = AbstractC39414r.m125887f0(str2, '\n', i14, false, 4);
                if (iM125887f0 == -1) {
                    iM125887f0 = length;
                }
                while (true) {
                    iMin = Math.min(iM125887f0, i14 + 4000);
                    String strSubstring = str2.substring(i14, iMin);
                    AbstractC22676k.m65749i(strSubstring, "substring(...)");
                    Log.println(i13, strM125866L0, strSubstring);
                    if (iMin >= iM125887f0) {
                        break;
                    } else {
                        i14 = iMin;
                    }
                }
                i14 = iMin + 1;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m44418b(String str, String str2) {
        Level level;
        Logger logger = Logger.getLogger(str);
        if (f59409a.add(logger)) {
            logger.setUseParentHandlers(false);
            if (Log.isLoggable(str2, 3)) {
                level = Level.FINE;
            } else {
                level = Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING;
            }
            logger.setLevel(level);
            logger.addHandler(C15748d.f59411a);
        }
    }
}
