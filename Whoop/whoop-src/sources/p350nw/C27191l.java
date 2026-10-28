package p350nw;

import gw.C16250a;
import java.net.URI;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Objects;
import p628xw.C38672b;

/* JADX INFO: renamed from: nw.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C27191l extends AbstractC27183d {

    /* JADX INFO: renamed from: O */
    public final C38672b f108846O;

    public C27191l(C38672b c38672b, C27188i c27188i, LinkedHashSet linkedHashSet, C16250a c16250a, String str, URI uri, C38672b c38672b2, C38672b c38672b3, LinkedList linkedList, Date date, Date date2, Date date3, C27186g c27186g) {
        super(C27187h.f108834z, c27188i, linkedHashSet, c16250a, str, uri, c38672b2, c38672b3, linkedList, date, date2, date3, c27186g);
        Objects.requireNonNull(c38672b, "The key value must not be null");
        this.f108846O = c38672b;
    }

    @Override // p350nw.AbstractC27183d
    /* JADX INFO: renamed from: b */
    public final boolean mo81766b() {
        return true;
    }

    @Override // p350nw.AbstractC27183d
    /* JADX INFO: renamed from: d */
    public final HashMap mo81767d() {
        HashMap mapMo81767d = super.mo81767d();
        mapMo81767d.put("k", this.f108846O.f166476w);
        return mapMo81767d;
    }

    @Override // p350nw.AbstractC27183d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C27191l) && super.equals(obj)) {
            return Objects.equals(this.f108846O, ((C27191l) obj).f108846O);
        }
        return false;
    }

    @Override // p350nw.AbstractC27183d
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.f108846O);
    }
}
