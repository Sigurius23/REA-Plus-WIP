package p623xr;

import java.util.Set;

/* JADX INFO: renamed from: xr.h */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC38612h extends AbstractC38608d implements Set {

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ int f166117y = 0;

    /* JADX INFO: renamed from: x */
    public transient C38613i f166118x;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return set.size() == 0 && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }
}
