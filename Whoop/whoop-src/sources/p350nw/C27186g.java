package p350nw;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/* JADX INFO: renamed from: nw.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C27186g implements Serializable {

    /* JADX INFO: renamed from: w */
    public final Date f108829w;

    /* JADX INFO: renamed from: x */
    public final C27185f f108830x;

    public C27186g(Date date, C27185f c27185f) {
        this.f108829w = date;
        this.f108830x = c27185f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27186g)) {
            return false;
        }
        C27186g c27186g = (C27186g) obj;
        return Objects.equals(this.f108829w, c27186g.f108829w) && Objects.equals(this.f108830x, c27186g.f108830x);
    }

    public final int hashCode() {
        return Objects.hash(this.f108829w, this.f108830x);
    }
}
