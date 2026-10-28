package um0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import mm0.C25683b;
import ne3.C26622k;
import ne3.C26624l;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: um0.h */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u0001H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lum0/d;", "Lmm0/b;", "d", "(Lum0/d;)Lmm0/b;", "Lum0/c;", "e", "(Lmm0/b;)Lum0/c;", "", "Lum0/f;", "f", "(Lmm0/b;)Ljava/util/List;", "cache_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35082h {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C25683b m110934d(C35078d c35078d) {
        String uri = c35078d.getEntry().getUri();
        C26622k c26622k = C26624l.f105882z;
        C26624l c26624lM79242c = C26622k.m79242c(-1234567890, c35078d.getEntry().getData());
        long lastUpdated = c35078d.getEntry().getLastUpdated();
        List<C35080f> listM110925b = c35078d.m110925b();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM110925b, 10));
        Iterator<T> it = listM110925b.iterator();
        while (it.hasNext()) {
            arrayList.add(((C35080f) it.next()).getScope());
        }
        return new C25683b(uri, c26624lM79242c, lastUpdated, AbstractC25265s.m74103I1(arrayList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C35077c m110935e(C25683b c25683b) {
        return new C35077c(c25683b.getUri(), c25683b.getData().mo79264r(), c25683b.getLastUpdated());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final List<C35080f> m110936f(C25683b c25683b) {
        Set<String> setM75629c = c25683b.m75629c();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(setM75629c, 10));
        Iterator<T> it = setM75629c.iterator();
        while (it.hasNext()) {
            arrayList.add(new C35080f(0L, c25683b.getUri(), (String) it.next(), 1, null));
        }
        return arrayList;
    }
}
