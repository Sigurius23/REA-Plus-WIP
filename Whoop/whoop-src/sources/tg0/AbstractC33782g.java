package tg0;

import java.util.Iterator;
import java.util.List;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import xg0.C38271c;

/* JADX INFO: renamed from: tg0.g */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"", "Lxg0/c;", "existingModels", "", "incomingFileSizes", "Ltg0/f;", "a", "(Ljava/util/List;Ljava/util/List;)Ltg0/f;", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33782g {
    /* JADX INFO: renamed from: a */
    public static final C33781f m106848a(List<C38271c> existingModels, List<Long> incomingFileSizes) {
        AbstractC22676k.m65750j(existingModels, "existingModels");
        AbstractC22676k.m65750j(incomingFileSizes, "incomingFileSizes");
        int size = 5 - existingModels.size();
        int iMin = Math.min(incomingFileSizes.size(), size);
        AbstractC33780e.b bVar = incomingFileSizes.size() > size ? AbstractC33780e.b.f141439a : null;
        Iterator<T> it = existingModels.iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            jLongValue += ((C38271c) it.next()).getFileSizeBytes();
        }
        Iterator it3 = AbstractC25265s.m74156w1(incomingFileSizes, iMin).iterator();
        int i13 = 0;
        while (it3.hasNext()) {
            jLongValue += ((Number) it3.next()).longValue();
            if (jLongValue > 52428800) {
                break;
            }
            i13++;
        }
        AbstractC33780e.a aVar = i13 < iMin ? AbstractC33780e.a.f141438a : null;
        if (aVar != null) {
            return new C33781f(i13, aVar);
        }
        return bVar != null ? new C33781f(iMin, bVar) : new C33781f(incomingFileSizes.size(), null);
    }
}
