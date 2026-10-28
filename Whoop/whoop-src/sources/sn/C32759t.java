package sn;

import te0.AbstractC33745d;

/* JADX INFO: renamed from: sn.t */
/* JADX INFO: loaded from: classes6.dex */
public class C32759t {

    /* JADX INFO: renamed from: a */
    public final Object f136238a;

    /* JADX INFO: renamed from: b */
    public final int f136239b;

    /* JADX INFO: renamed from: c */
    public final int f136240c;

    /* JADX INFO: renamed from: d */
    public final long f136241d;

    /* JADX INFO: renamed from: e */
    public final int f136242e;

    public C32759t(C32759t c32759t) {
        this.f136238a = c32759t.f136238a;
        this.f136239b = c32759t.f136239b;
        this.f136240c = c32759t.f136240c;
        this.f136241d = c32759t.f136241d;
        this.f136242e = c32759t.f136242e;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m102753a() {
        return this.f136239b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32759t)) {
            return false;
        }
        C32759t c32759t = (C32759t) obj;
        return this.f136238a.equals(c32759t.f136238a) && this.f136239b == c32759t.f136239b && this.f136240c == c32759t.f136240c && this.f136241d == c32759t.f136241d && this.f136242e == c32759t.f136242e;
    }

    public final int hashCode() {
        return ((((((AbstractC33745d.m106644c(527, 31, this.f136238a) + this.f136239b) * 31) + this.f136240c) * 31) + ((int) this.f136241d)) * 31) + this.f136242e;
    }

    public C32759t(int i13, int i14, int i15, long j7, Object obj) {
        this.f136238a = obj;
        this.f136239b = i13;
        this.f136240c = i14;
        this.f136241d = j7;
        this.f136242e = i15;
    }
}
