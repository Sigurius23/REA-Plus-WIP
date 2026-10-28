package p181h2;

import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22674j;

/* JADX INFO: renamed from: h2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C16618c {

    /* JADX INFO: renamed from: e */
    public static final C16618c f63938e = new C16618c(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: a */
    public final float f63939a;

    /* JADX INFO: renamed from: b */
    public final float f63940b;

    /* JADX INFO: renamed from: c */
    public final float f63941c;

    /* JADX INFO: renamed from: d */
    public final float f63942d;

    public C16618c(float f13, float f14, float f15, float f16) {
        this.f63939a = f13;
        this.f63940b = f14;
        this.f63941c = f15;
        this.f63942d = f16;
    }

    /* JADX INFO: renamed from: b */
    public static C16618c m47195b(C16618c c16618c, float f13, float f14, float f15, int i13) {
        if ((i13 & 1) != 0) {
            f13 = c16618c.f63939a;
        }
        float f16 = c16618c.f63940b;
        if ((i13 & 4) != 0) {
            f14 = c16618c.f63941c;
        }
        if ((i13 & 8) != 0) {
            f15 = c16618c.f63942d;
        }
        c16618c.getClass();
        return new C16618c(f13, f16, f14, f15);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m47196a(long j7) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L));
        return (fIntBitsToFloat >= this.f63939a) & (fIntBitsToFloat < this.f63941c) & (fIntBitsToFloat2 >= this.f63940b) & (fIntBitsToFloat2 < this.f63942d);
    }

    /* JADX INFO: renamed from: c */
    public final long m47197c() {
        return (((long) Float.floatToRawIntBits(this.f63941c)) << 32) | (((long) Float.floatToRawIntBits(this.f63942d)) & 4294967295L);
    }

    /* JADX INFO: renamed from: d */
    public final long m47198d() {
        float f13 = this.f63941c;
        float f14 = this.f63939a;
        float f15 = ((f13 - f14) / 2.0f) + f14;
        float f16 = this.f63942d;
        float f17 = this.f63940b;
        return (((long) Float.floatToRawIntBits(((f16 - f17) / 2.0f) + f17)) & 4294967295L) | (Float.floatToRawIntBits(f15) << 32);
    }

    /* JADX INFO: renamed from: e */
    public final long m47199e() {
        float f13 = this.f63941c - this.f63939a;
        return (((long) Float.floatToRawIntBits(this.f63942d - this.f63940b)) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16618c)) {
            return false;
        }
        C16618c c16618c = (C16618c) obj;
        return Float.compare(this.f63939a, c16618c.f63939a) == 0 && Float.compare(this.f63940b, c16618c.f63940b) == 0 && Float.compare(this.f63941c, c16618c.f63941c) == 0 && Float.compare(this.f63942d, c16618c.f63942d) == 0;
    }

    /* JADX INFO: renamed from: f */
    public final long m47200f() {
        return (((long) Float.floatToRawIntBits(this.f63939a)) << 32) | (((long) Float.floatToRawIntBits(this.f63940b)) & 4294967295L);
    }

    /* JADX INFO: renamed from: g */
    public final long m47201g() {
        return (((long) Float.floatToRawIntBits(this.f63941c)) << 32) | (((long) Float.floatToRawIntBits(this.f63940b)) & 4294967295L);
    }

    /* JADX INFO: renamed from: h */
    public final C16618c m47202h(C16618c c16618c) {
        return new C16618c(Math.max(this.f63939a, c16618c.f63939a), Math.max(this.f63940b, c16618c.f63940b), Math.min(this.f63941c, c16618c.f63941c), Math.min(this.f63942d, c16618c.f63942d));
    }

    public final int hashCode() {
        return Float.hashCode(this.f63942d) + AbstractC11266d.m30447a(this.f63941c, AbstractC11266d.m30447a(this.f63940b, Float.hashCode(this.f63939a) * 31, 31), 31);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m47203i() {
        return (this.f63939a >= this.f63941c) | (this.f63940b >= this.f63942d);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m47204j(C16618c c16618c) {
        return (this.f63939a < c16618c.f63941c) & (c16618c.f63939a < this.f63941c) & (this.f63940b < c16618c.f63942d) & (c16618c.f63940b < this.f63942d);
    }

    /* JADX INFO: renamed from: k */
    public final C16618c m47205k(float f13, float f14) {
        return new C16618c(this.f63939a + f13, this.f63940b + f14, this.f63941c + f13, this.f63942d + f14);
    }

    /* JADX INFO: renamed from: l */
    public final C16618c m47206l(long j7) {
        int i13 = (int) (j7 >> 32);
        int i14 = (int) (j7 & 4294967295L);
        return new C16618c(Float.intBitsToFloat(i13) + this.f63939a, Float.intBitsToFloat(i14) + this.f63940b, Float.intBitsToFloat(i13) + this.f63941c, Float.intBitsToFloat(i14) + this.f63942d);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + AbstractC22674j.m65711S(this.f63939a) + ", " + AbstractC22674j.m65711S(this.f63940b) + ", " + AbstractC22674j.m65711S(this.f63941c) + ", " + AbstractC22674j.m65711S(this.f63942d) + ')';
    }
}
