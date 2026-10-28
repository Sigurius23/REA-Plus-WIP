package p440qw;

/* JADX INFO: renamed from: qw.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C30674i extends Number {

    /* JADX INFO: renamed from: w */
    public final String f126218w;

    public C30674i(String str) {
        this.f126218w = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f126218w);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C30674i) {
            return this.f126218w.equals(((C30674i) obj).f126218w);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f126218w);
    }

    public final int hashCode() {
        return this.f126218w.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f126218w;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return AbstractC30672g.m94273i(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f126218w;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return AbstractC30672g.m94273i(str).longValue();
        }
    }

    public final String toString() {
        return this.f126218w;
    }
}
