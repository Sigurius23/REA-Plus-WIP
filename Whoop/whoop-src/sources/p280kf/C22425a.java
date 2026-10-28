package p280kf;

import java.math.BigInteger;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: kf.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C22425a extends Number implements Comparable {

    /* JADX INFO: renamed from: w */
    public final BigInteger f87749w;

    public C22425a(BigInteger bigInteger) {
        this.f87749w = bigInteger;
        AbstractC22676k.m65749i(bigInteger.toString(), "toString(...)");
    }

    @Override // java.lang.Number
    public final byte byteValue() {
        return this.f87749w.byteValue();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C22425a other = (C22425a) obj;
        AbstractC22676k.m65750j(other, "other");
        return this.f87749w.compareTo(other.f87749w);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return this.f87749w.doubleValue();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C22425a) {
            return AbstractC22676k.m65745e(this.f87749w, ((C22425a) obj).f87749w);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return this.f87749w.floatValue();
    }

    public final int hashCode() {
        return this.f87749w.hashCode() + 17;
    }

    @Override // java.lang.Number
    public final int intValue() {
        return this.f87749w.intValue();
    }

    @Override // java.lang.Number
    public final long longValue() {
        return this.f87749w.longValue();
    }

    @Override // java.lang.Number
    public final short shortValue() {
        return this.f87749w.shortValue();
    }

    public final String toString() {
        String string = this.f87749w.toString(10);
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22425a(byte[] bytes) {
        this(new BigInteger(bytes));
        AbstractC22676k.m65750j(bytes, "bytes");
    }
}
