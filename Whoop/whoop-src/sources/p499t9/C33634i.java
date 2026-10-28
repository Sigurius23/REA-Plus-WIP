package p499t9;

import java.util.Arrays;
import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: t9.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C33634i implements InterfaceC33627e0 {

    /* JADX INFO: renamed from: a */
    public final int f140385a;

    /* JADX INFO: renamed from: b */
    public final int[] f140386b;

    /* JADX INFO: renamed from: c */
    public final long[] f140387c;

    /* JADX INFO: renamed from: d */
    public final long[] f140388d;

    /* JADX INFO: renamed from: e */
    public final long[] f140389e;

    /* JADX INFO: renamed from: f */
    public final long f140390f;

    public C33634i(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f140386b = iArr;
        this.f140387c = jArr;
        this.f140388d = jArr2;
        this.f140389e = jArr3;
        int length = iArr.length;
        this.f140385a = length;
        if (length > 0) {
            this.f140390f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f140390f = 0L;
        }
    }

    @Override // p499t9.InterfaceC33627e0
    /* JADX INFO: renamed from: c */
    public final C33625d0 mo8456c(long j7) {
        long[] jArr = this.f140389e;
        int iM121911d = AbstractC38065t.m121911d(jArr, j7, true);
        long j13 = jArr[iM121911d];
        long[] jArr2 = this.f140387c;
        C33629f0 c33629f0 = new C33629f0(j13, jArr2[iM121911d]);
        if (j13 >= j7 || iM121911d == this.f140385a - 1) {
            return new C33625d0(c33629f0, c33629f0);
        }
        int i13 = iM121911d + 1;
        return new C33625d0(c33629f0, new C33629f0(jArr[i13], jArr2[i13]));
    }

    @Override // p499t9.InterfaceC33627e0
    /* JADX INFO: renamed from: e */
    public final boolean mo8509e() {
        return true;
    }

    @Override // p499t9.InterfaceC33627e0
    /* JADX INFO: renamed from: f */
    public final long mo8510f() {
        return this.f140390f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f140385a + ", sizes=" + Arrays.toString(this.f140386b) + ", offsets=" + Arrays.toString(this.f140387c) + ", timeUs=" + Arrays.toString(this.f140389e) + ", durationsUs=" + Arrays.toString(this.f140388d) + ")";
    }
}
