package p037bu;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: bu.b */
/* JADX INFO: loaded from: classes.dex */
public final class C3631b {

    /* JADX INFO: renamed from: a */
    public final String f14784a;

    /* JADX INFO: renamed from: b */
    public final C3632c f14785b;

    public C3631b(Set set, C3632c c3632c) {
        this.f14784a = m11150b(set);
        this.f14785b = c3632c;
    }

    /* JADX INFO: renamed from: b */
    public static String m11150b(Set set) {
        StringBuilder sb4 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C3630a c3630a = (C3630a) it.next();
            sb4.append(c3630a.f14782a);
            sb4.append('/');
            sb4.append(c3630a.f14783b);
            if (it.hasNext()) {
                sb4.append(' ');
            }
        }
        return sb4.toString();
    }

    /* JADX INFO: renamed from: a */
    public final String m11151a() {
        Set setUnmodifiableSet;
        Set setUnmodifiableSet2;
        String str = this.f14784a;
        C3632c c3632c = this.f14785b;
        synchronized (((HashSet) c3632c.f14788w)) {
            setUnmodifiableSet = Collections.unmodifiableSet((HashSet) c3632c.f14788w);
        }
        if (setUnmodifiableSet.isEmpty()) {
            return str;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str);
        sb4.append(' ');
        synchronized (((HashSet) c3632c.f14788w)) {
            setUnmodifiableSet2 = Collections.unmodifiableSet((HashSet) c3632c.f14788w);
        }
        sb4.append(m11150b(setUnmodifiableSet2));
        return sb4.toString();
    }
}
