package p044c5;

import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: c5.b */
/* JADX INFO: loaded from: classes.dex */
public final class C4210b {

    /* JADX INFO: renamed from: a */
    public String f17075a;

    /* JADX INFO: renamed from: b */
    public String f17076b;

    /* JADX INFO: renamed from: c */
    public List f17077c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4210b)) {
            return false;
        }
        C4210b c4210b = (C4210b) obj;
        return Objects.equals(this.f17075a, c4210b.f17075a) && Objects.equals(this.f17076b, c4210b.f17076b) && Objects.equals(this.f17077c, c4210b.f17077c);
    }

    public final int hashCode() {
        return Objects.hash(this.f17075a, this.f17076b, this.f17077c);
    }
}
