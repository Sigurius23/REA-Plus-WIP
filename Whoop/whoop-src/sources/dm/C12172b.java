package dm;

import d13.AbstractC11478a;

/* JADX INFO: renamed from: dm.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C12172b {

    /* JADX INFO: renamed from: a */
    public final Integer f40477a;

    public C12172b(Integer num) {
        this.f40477a = num;
    }

    /* JADX INFO: renamed from: a */
    public static C12172b m33678a(Integer num) {
        return new C12172b(num);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12172b)) {
            return false;
        }
        Integer num = ((C12172b) obj).f40477a;
        Integer num2 = this.f40477a;
        if (num2 == null) {
            return num == null;
        }
        return num2.equals(num);
    }

    public final int hashCode() {
        Integer num = this.f40477a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return AbstractC11478a.m30859k(new StringBuilder("ProductData{productId="), this.f40477a, "}");
    }
}
