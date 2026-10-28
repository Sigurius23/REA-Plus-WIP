package na3;

import db3.EnumC11891c;
import io.sentry.internal.debugmeta.C20378c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import m83.C25239c0;
import m83.C25241d0;
import m83.C25262p;
import m83.C25263q;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: na3.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C26528o {

    /* JADX INFO: renamed from: a */
    public final String f105461a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f105462b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public C23465k f105463c = new C23465k("V", null);

    public C26528o(C20378c c20378c, String str, String str2) {
        this.f105461a = str2;
    }

    /* JADX INFO: renamed from: a */
    public final void m78601a(String type, C26517d... c26517dArr) {
        C26530q c26530q;
        AbstractC22676k.m65750j(type, "type");
        if (c26517dArr.length == 0) {
            c26530q = null;
        } else {
            C25263q c25263q = new C25263q(new C25262p(c26517dArr, 0), 1);
            int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(c25263q, 10));
            if (iM73988W < 16) {
                iM73988W = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
            Iterator it = c25263q.iterator();
            while (true) {
                C25241d0 c25241d0 = (C25241d0) it;
                if (!c25241d0.f99123x.hasNext()) {
                    break;
                }
                C25239c0 c25239c0 = (C25239c0) c25241d0.next();
                linkedHashMap.put(Integer.valueOf(c25239c0.f99117a), (C26517d) c25239c0.f99118b);
            }
            c26530q = new C26530q(linkedHashMap);
        }
        this.f105462b.add(new C23465k(type, c26530q));
    }

    /* JADX INFO: renamed from: b */
    public final void m78602b(EnumC11891c type) {
        AbstractC22676k.m65750j(type, "type");
        String strM31931c = type.m31931c();
        AbstractC22676k.m65749i(strM31931c, "getDesc(...)");
        this.f105463c = new C23465k(strM31931c, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m78603c(String type, C26517d... c26517dArr) {
        AbstractC22676k.m65750j(type, "type");
        C25263q c25263q = new C25263q(new C25262p(c26517dArr, 0), 1);
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(c25263q, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        Iterator it = c25263q.iterator();
        while (true) {
            C25241d0 c25241d0 = (C25241d0) it;
            if (!c25241d0.f99123x.hasNext()) {
                this.f105463c = new C23465k(type, new C26530q(linkedHashMap));
                return;
            } else {
                C25239c0 c25239c0 = (C25239c0) c25241d0.next();
                linkedHashMap.put(Integer.valueOf(c25239c0.f99117a), (C26517d) c25239c0.f99118b);
            }
        }
    }
}
