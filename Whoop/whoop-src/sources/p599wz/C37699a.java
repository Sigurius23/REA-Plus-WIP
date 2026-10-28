package p599wz;

import java.util.ArrayList;

/* JADX INFO: renamed from: wz.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C37699a {

    /* JADX INFO: renamed from: a */
    public final ArrayList f161554a;

    public C37699a(ArrayList arrayList) {
        this.f161554a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C37699a) && this.f161554a.equals(((C37699a) obj).f161554a);
    }

    public final int hashCode() {
        return this.f161554a.hashCode();
    }

    public final String toString() {
        return "ConsumerState(paymentDetails=" + this.f161554a + ")";
    }
}
