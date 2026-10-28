package androidx.datastore.preferences.protobuf;

import bd3.AbstractC3118e;
import com.google.crypto.tink.shaded.protobuf.C5143h;
import com.google.crypto.tink.shaded.protobuf.C5149j;
import io.sentry.internal.debugmeta.C20378c;
import java.util.List;
import m83.C25258m;
import p184h5.C16866d1;
import p184h5.C16905q1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1230l {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f5421w;

    /* JADX INFO: renamed from: x */
    public int f5422x;

    /* JADX INFO: renamed from: y */
    public Object f5423y;

    public /* synthetic */ AbstractC1230l(int i13, byte b) {
        this.f5421w = i13;
    }

    /* JADX INFO: renamed from: b */
    public static int m3866b(int i13) {
        return (-(i13 & 1)) ^ (i13 >>> 1);
    }

    /* JADX INFO: renamed from: c */
    public static long m3867c(long j7) {
        return (-(j7 & 1)) ^ (j7 >>> 1);
    }

    /* JADX INFO: renamed from: f */
    public static C5149j m3868f(byte[] bArr, int i13, int i14, boolean z4) {
        C5149j c5149j = new C5149j(bArr, i13, i14, z4);
        try {
            c5149j.mo3838l(i14);
            return c5149j;
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    /* JADX INFO: renamed from: A */
    public abstract long mo3820A();

    /* JADX INFO: renamed from: B */
    public abstract String mo3821B();

    /* JADX INFO: renamed from: C */
    public abstract String mo3822C();

    /* JADX INFO: renamed from: D */
    public abstract int mo3823D();

    /* JADX INFO: renamed from: E */
    public abstract int mo3824E();

    /* JADX INFO: renamed from: F */
    public abstract long mo3825F();

    /* JADX INFO: renamed from: G */
    public void m3869G(char[] array) {
        AbstractC22676k.m65750j(array, "array");
        synchronized (this) {
            int i13 = this.f5422x;
            if (array.length + i13 < AbstractC3118e.f12241a) {
                this.f5422x = i13 + array.length;
                ((C25258m) this.f5423y).addLast(array);
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public abstract boolean mo3826H(int i13);

    /* JADX INFO: renamed from: I */
    public void m3870I() {
        boolean zMo3826H;
        do {
            int iMo3823D = mo3823D();
            if (iMo3823D == 0) {
                return;
            }
            int i13 = this.f5422x;
            if (i13 >= 100) {
                throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f5422x = i13 + 1;
            zMo3826H = mo3826H(iMo3823D);
            this.f5422x--;
        } while (zMo3826H);
    }

    /* JADX INFO: renamed from: J */
    public char[] m3871J(int i13) {
        char[] cArr;
        synchronized (this) {
            C25258m c25258m = (C25258m) this.f5423y;
            cArr = null;
            char[] cArr2 = (char[]) (c25258m.isEmpty() ? null : c25258m.removeLast());
            if (cArr2 != null) {
                this.f5422x -= cArr2.length;
                cArr = cArr2;
            }
        }
        return cArr == null ? new char[i13] : cArr;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo3834a(int i13);

    /* JADX INFO: renamed from: d */
    public abstract int mo3835d();

    /* JADX INFO: renamed from: e */
    public abstract boolean mo3836e();

    /* JADX INFO: renamed from: g */
    public void mo3872g(C16866d1 c16866d1) {
    }

    /* JADX INFO: renamed from: h */
    public void mo3873h() {
    }

    /* JADX INFO: renamed from: i */
    public abstract C16905q1 mo3874i(C16905q1 c16905q1, List list);

    /* JADX INFO: renamed from: j */
    public abstract C20378c mo3875j(C16866d1 c16866d1, C20378c c20378c);

    /* JADX INFO: renamed from: k */
    public abstract void mo3837k(int i13);

    /* JADX INFO: renamed from: l */
    public abstract int mo3838l(int i13);

    /* JADX INFO: renamed from: m */
    public abstract boolean mo3839m();

    /* JADX INFO: renamed from: n */
    public abstract C1218h mo3840n();

    /* JADX INFO: renamed from: p */
    public abstract C5143h mo3876p();

    /* JADX INFO: renamed from: q */
    public abstract double mo3841q();

    /* JADX INFO: renamed from: r */
    public abstract int mo3842r();

    /* JADX INFO: renamed from: s */
    public abstract int mo3843s();

    /* JADX INFO: renamed from: t */
    public abstract long mo3844t();

    public String toString() {
        switch (this.f5421w) {
            case 4:
                return String.format("%s(0x%04x)", (String) this.f5423y, Integer.valueOf(this.f5422x));
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public abstract float mo3845u();

    /* JADX INFO: renamed from: v */
    public abstract int mo3846v();

    /* JADX INFO: renamed from: w */
    public abstract long mo3847w();

    /* JADX INFO: renamed from: x */
    public abstract int mo3848x();

    /* JADX INFO: renamed from: y */
    public abstract long mo3849y();

    /* JADX INFO: renamed from: z */
    public abstract int mo3850z();

    public AbstractC1230l() {
        this.f5421w = 1;
        this.f5423y = new C25258m();
    }

    public AbstractC1230l(String str, int i13) {
        this.f5421w = 4;
        this.f5423y = str;
        this.f5422x = i13;
    }

    public AbstractC1230l(int i13) {
        this.f5421w = 3;
        this.f5422x = i13;
    }
}
