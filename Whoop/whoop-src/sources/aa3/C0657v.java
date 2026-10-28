package aa3;

import java.util.ArrayList;

/* JADX INFO: renamed from: aa3.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C0657v extends AbstractC0638m0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f2287a;

    public C0657v(ArrayList arrayList) {
        this.f2287a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0657v) && this.f2287a.equals(((C0657v) obj).f2287a);
    }

    public final int hashCode() {
        return this.f2287a.hashCode();
    }

    public final String toString() {
        return "ArrayValue(" + this.f2287a + ')';
    }
}
