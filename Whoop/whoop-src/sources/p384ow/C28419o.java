package p384ow;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ow.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C28419o extends AbstractC28420p implements Iterable {

    /* JADX INFO: renamed from: w */
    public final ArrayList f114641w = new ArrayList();

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C28419o) && ((C28419o) obj).f114641w.equals(this.f114641w);
        }
        return true;
    }

    public final int hashCode() {
        return this.f114641w.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f114641w.iterator();
    }
}
