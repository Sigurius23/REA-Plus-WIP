package androidx.glance.appwidget.protobuf;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import kotlinx.serialization.SerializationException;
import m83.C25258m;
import p200hs.AbstractC17595g;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.l */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1400l {

    /* JADX INFO: renamed from: a */
    public int f5933a;

    /* JADX INFO: renamed from: b */
    public Object f5934b;

    public AbstractC1400l(int i13) {
        switch (i13) {
            case 2:
                this.f5934b = new long[8];
                this.f5933a = -1;
                break;
            default:
                this.f5934b = new C25258m();
                break;
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m4424g(int i13) {
        return (-(i13 & 1)) ^ (i13 >>> 1);
    }

    /* JADX INFO: renamed from: h */
    public static long m4425h(long j7) {
        return (-(j7 & 1)) ^ (j7 >>> 1);
    }

    /* JADX INFO: renamed from: A */
    public abstract long mo4356A();

    /* JADX INFO: renamed from: B */
    public abstract int mo4357B();

    /* JADX INFO: renamed from: C */
    public abstract long mo4358C();

    /* JADX INFO: renamed from: D */
    public abstract int mo4359D();

    /* JADX INFO: renamed from: E */
    public abstract long mo4360E();

    /* JADX INFO: renamed from: F */
    public abstract String mo4361F();

    /* JADX INFO: renamed from: G */
    public abstract String mo4362G();

    /* JADX INFO: renamed from: H */
    public abstract int mo4363H();

    /* JADX INFO: renamed from: I */
    public abstract int mo4364I();

    /* JADX INFO: renamed from: J */
    public abstract long mo4365J();

    /* JADX INFO: renamed from: d */
    public ByteBuffer m4426d(int i13, byte[] bArr) {
        int[] iArrMo4427f = mo4427f(AbstractC17595g.m50111e(bArr), i13);
        int[] iArr = (int[]) iArrMo4427f.clone();
        AbstractC17595g.m50110d(iArr);
        for (int i14 = 0; i14 < iArrMo4427f.length; i14++) {
            iArrMo4427f[i14] = iArrMo4427f[i14] + iArr[i14];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrMo4427f, 0, 16);
        return byteBufferOrder;
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo4372e(int i13);

    /* JADX INFO: renamed from: f */
    public abstract int[] mo4427f(int[] iArr, int i13);

    /* JADX INFO: renamed from: i */
    public long m4428i() {
        int i13 = this.f5933a;
        if (i13 == -1) {
            return 19500L;
        }
        return ((long[]) this.f5934b)[i13];
    }

    /* JADX INFO: renamed from: j */
    public abstract int mo4373j();

    /* JADX INFO: renamed from: k */
    public abstract boolean mo4374k();

    /* JADX INFO: renamed from: l */
    public abstract int mo4429l();

    /* JADX INFO: renamed from: m */
    public abstract void mo4375m(int i13);

    /* JADX INFO: renamed from: n */
    public long m4430n() {
        int i13 = this.f5933a;
        if (i13 < 0) {
            throw new SerializationException("No tag in stack for requested element");
        }
        long[] jArr = (long[]) this.f5934b;
        this.f5933a = i13 - 1;
        return jArr[i13];
    }

    /* JADX INFO: renamed from: o */
    public long m4431o() {
        int i13 = this.f5933a;
        if (i13 == -1) {
            return 19500L;
        }
        long[] jArr = (long[]) this.f5934b;
        this.f5933a = i13 - 1;
        return jArr[i13];
    }

    /* JADX INFO: renamed from: p */
    public void m4432p(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        if (bArr.length != mo4429l()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + mo4429l());
        }
        int iRemaining = byteBuffer2.remaining();
        int i13 = iRemaining / 64;
        int i14 = i13 + 1;
        for (int i15 = 0; i15 < i14; i15++) {
            ByteBuffer byteBufferM4426d = m4426d(this.f5933a + i15, bArr);
            if (i15 == i13) {
                AbstractC22674j.m65712T(byteBuffer, byteBuffer2, byteBufferM4426d, iRemaining % 64);
            } else {
                AbstractC22674j.m65712T(byteBuffer, byteBuffer2, byteBufferM4426d, 64);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public abstract int mo4376q(int i13);

    /* JADX INFO: renamed from: r */
    public void m4433r(long j7) {
        if (j7 == 19500) {
            return;
        }
        int i13 = this.f5933a + 1;
        this.f5933a = i13;
        long[] jArr = (long[]) this.f5934b;
        if (i13 >= jArr.length) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length * 2);
            AbstractC22676k.m65749i(jArrCopyOf, "copyOf(...)");
            this.f5934b = jArrCopyOf;
        }
        ((long[]) this.f5934b)[i13] = j7;
    }

    /* JADX INFO: renamed from: s */
    public abstract boolean mo4377s();

    /* JADX INFO: renamed from: t */
    public abstract C1388h mo4378t();

    /* JADX INFO: renamed from: u */
    public abstract double mo4379u();

    /* JADX INFO: renamed from: v */
    public abstract int mo4380v();

    /* JADX INFO: renamed from: w */
    public abstract int mo4381w();

    /* JADX INFO: renamed from: x */
    public abstract long mo4382x();

    /* JADX INFO: renamed from: y */
    public abstract float mo4383y();

    /* JADX INFO: renamed from: z */
    public abstract int mo4384z();
}
