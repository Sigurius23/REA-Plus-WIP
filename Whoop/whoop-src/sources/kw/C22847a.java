package kw;

import ih0.AbstractC18489d0;

/* JADX INFO: renamed from: kw.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C22847a {

    /* JADX INFO: renamed from: c */
    public static final C22847a f90076c = new C22847a(3, 4);

    /* JADX INFO: renamed from: d */
    public static final C22847a f90077d = new C22847a(1, 2);

    /* JADX INFO: renamed from: a */
    public final int f90078a;

    /* JADX INFO: renamed from: b */
    public final int f90079b;

    public C22847a(int i13, int i14) {
        this.f90078a = i13;
        this.f90079b = i14;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("CipherMode [forEncryption=");
        sb4.append(this.f90078a);
        sb4.append(", forDecryption=");
        return AbstractC18489d0.m53371l(sb4, this.f90079b, "]");
    }
}
