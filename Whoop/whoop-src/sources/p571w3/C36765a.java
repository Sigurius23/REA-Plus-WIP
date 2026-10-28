package p571w3;

/* JADX INFO: renamed from: w3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C36765a {

    /* JADX INFO: renamed from: a */
    public final float f157332a;

    public final boolean equals(Object obj) {
        if (obj instanceof C36765a) {
            return Float.compare(this.f157332a, ((C36765a) obj).f157332a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f157332a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.f157332a + ')';
    }
}
