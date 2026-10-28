package p012ab;

import java.util.Arrays;
import p031b9.C2822c1;
import p309lo.AbstractC24543a;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: ab.y */
/* JADX INFO: loaded from: classes5.dex */
public final class C0704y {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2662a;

    /* JADX INFO: renamed from: b */
    public int f2663b;

    /* JADX INFO: renamed from: c */
    public boolean f2664c;

    /* JADX INFO: renamed from: d */
    public boolean f2665d;

    /* JADX INFO: renamed from: e */
    public Object f2666e;

    /* JADX INFO: renamed from: f */
    public int f2667f;

    public C0704y(int i13, int i14) {
        this.f2662a = i14;
        switch (i14) {
            case 1:
                this.f2663b = i13;
                byte[] bArr = new byte[131];
                this.f2666e = bArr;
                bArr[2] = 1;
                break;
            default:
                this.f2663b = i13;
                byte[] bArr2 = new byte[131];
                this.f2666e = bArr2;
                bArr2[2] = 1;
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m1756a(byte[] bArr, int i13, int i14) {
        switch (this.f2662a) {
            case 0:
                if (this.f2664c) {
                    int i15 = i14 - i13;
                    byte[] bArr2 = (byte[]) this.f2666e;
                    int length = bArr2.length;
                    int i16 = this.f2667f;
                    if (length < i16 + i15) {
                        this.f2666e = Arrays.copyOf(bArr2, (i16 + i15) * 2);
                    }
                    System.arraycopy(bArr, i13, (byte[]) this.f2666e, this.f2667f, i15);
                    this.f2667f += i15;
                    break;
                }
                break;
            default:
                if (this.f2664c) {
                    int i17 = i14 - i13;
                    byte[] bArr3 = (byte[]) this.f2666e;
                    int length2 = bArr3.length;
                    int i18 = this.f2667f;
                    if (length2 < i18 + i17) {
                        this.f2666e = Arrays.copyOf(bArr3, (i18 + i17) * 2);
                    }
                    System.arraycopy(bArr, i13, (byte[]) this.f2666e, this.f2667f, i17);
                    this.f2667f += i17;
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m1757b(int i13) {
        switch (this.f2662a) {
            case 0:
                if (!this.f2664c) {
                    return false;
                }
                this.f2667f -= i13;
                this.f2664c = false;
                this.f2665d = true;
                return true;
            default:
                if (!this.f2664c) {
                    return false;
                }
                this.f2667f -= i13;
                this.f2664c = false;
                this.f2665d = true;
                return true;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m1758c(int i13) {
        this.f2664c |= i13 > 0;
        this.f2663b += i13;
    }

    /* JADX INFO: renamed from: d */
    public void m1759d() {
        switch (this.f2662a) {
            case 0:
                this.f2664c = false;
                this.f2665d = false;
                break;
            default:
                this.f2664c = false;
                this.f2665d = false;
                break;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m1760e(int i13) {
        switch (this.f2662a) {
            case 0:
                AbstractC35849g.m113807i(!this.f2664c);
                boolean z4 = i13 == this.f2663b;
                this.f2664c = z4;
                if (z4) {
                    this.f2667f = 3;
                    this.f2665d = false;
                }
                break;
            default:
                AbstractC24543a.m71573i(!this.f2664c);
                boolean z13 = i13 == this.f2663b;
                this.f2664c = z13;
                if (z13) {
                    this.f2667f = 3;
                    this.f2665d = false;
                }
                break;
        }
    }

    public C0704y(C2822c1 c2822c1) {
        this.f2662a = 2;
        this.f2666e = c2822c1;
    }
}
