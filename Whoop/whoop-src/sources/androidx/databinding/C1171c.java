package androidx.databinding;

import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.databinding.c */
/* JADX INFO: loaded from: classes5.dex */
public class C1171c implements Cloneable {

    /* JADX INFO: renamed from: E */
    public final AbstractC1169b f5320E;

    /* JADX INFO: renamed from: w */
    public ArrayList f5321w = new ArrayList();

    /* JADX INFO: renamed from: x */
    public long f5322x = 0;

    /* JADX INFO: renamed from: y */
    public long[] f5323y;

    /* JADX INFO: renamed from: z */
    public int f5324z;

    public C1171c(AbstractC1169b abstractC1169b) {
        this.f5320E = abstractC1169b;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m3720a(Object obj) {
        try {
            if (obj == null) {
                throw new IllegalArgumentException("callback cannot be null");
            }
            int iLastIndexOf = this.f5321w.lastIndexOf(obj);
            if (iLastIndexOf < 0 || m3721b(iLastIndexOf)) {
                this.f5321w.add(obj);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m3721b(int i13) {
        int i14;
        if (i13 < 64) {
            return ((1 << i13) & this.f5322x) != 0;
        }
        long[] jArr = this.f5323y;
        if (jArr != null && (i14 = (i13 / 64) - 1) < jArr.length) {
            return ((1 << (i13 % 64)) & jArr[i14]) != 0;
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m3722c(AbstractC1167a abstractC1167a, int i13) throws Throwable {
        try {
            try {
                this.f5324z++;
                int size = this.f5321w.size();
                long[] jArr = this.f5323y;
                int length = jArr == null ? -1 : jArr.length - 1;
                m3724e(abstractC1167a, i13, length);
                m3723d(abstractC1167a, i13, (length + 2) * 64, size, 0L);
                int i14 = this.f5324z - 1;
                this.f5324z = i14;
                if (i14 == 0) {
                    long[] jArr2 = this.f5323y;
                    if (jArr2 != null) {
                        for (int length2 = jArr2.length - 1; length2 >= 0; length2--) {
                            long j7 = this.f5323y[length2];
                            if (j7 != 0) {
                                m3726g((length2 + 1) * 64, j7);
                                this.f5323y[length2] = 0;
                            }
                        }
                    }
                    long j13 = this.f5322x;
                    if (j13 != 0) {
                        m3726g(0, j13);
                        this.f5322x = 0L;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final Object clone() {
        C1171c c1171c;
        CloneNotSupportedException e5;
        synchronized (this) {
            try {
                c1171c = (C1171c) super.clone();
                try {
                    c1171c.f5322x = 0L;
                    c1171c.f5323y = null;
                    c1171c.f5324z = 0;
                    c1171c.f5321w = new ArrayList();
                    int size = this.f5321w.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        if (!m3721b(i13)) {
                            c1171c.f5321w.add(this.f5321w.get(i13));
                        }
                    }
                } catch (CloneNotSupportedException e13) {
                    e5 = e13;
                    e5.printStackTrace();
                }
            } catch (CloneNotSupportedException e14) {
                c1171c = null;
                e5 = e14;
            }
        }
        return c1171c;
    }

    /* JADX INFO: renamed from: d */
    public final void m3723d(AbstractC1167a abstractC1167a, int i13, int i14, int i15, long j7) {
        long j13 = 1;
        while (i14 < i15) {
            if ((j7 & j13) == 0) {
                this.f5320E.mo3719a(this.f5321w.get(i14), abstractC1167a, i13);
            }
            j13 <<= 1;
            i14++;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m3724e(AbstractC1167a abstractC1167a, int i13, int i14) {
        if (i14 < 0) {
            m3723d(abstractC1167a, i13, 0, Math.min(64, this.f5321w.size()), this.f5322x);
            return;
        }
        long j7 = this.f5323y[i14];
        int i15 = (i14 + 1) * 64;
        int iMin = Math.min(this.f5321w.size(), i15 + 64);
        m3724e(abstractC1167a, i13, i14 - 1);
        m3723d(abstractC1167a, i13, i15, iMin, j7);
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m3725f(Object obj) {
        try {
            if (this.f5324z == 0) {
                this.f5321w.remove(obj);
            } else {
                int iLastIndexOf = this.f5321w.lastIndexOf(obj);
                if (iLastIndexOf >= 0) {
                    m3727h(iLastIndexOf);
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m3726g(int i13, long j7) {
        long j13 = Long.MIN_VALUE;
        for (int i14 = i13 + 63; i14 >= i13; i14--) {
            if ((j7 & j13) != 0) {
                this.f5321w.remove(i14);
            }
            j13 >>>= 1;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m3727h(int i13) {
        if (i13 < 64) {
            this.f5322x = (1 << i13) | this.f5322x;
            return;
        }
        int i14 = (i13 / 64) - 1;
        long[] jArr = this.f5323y;
        if (jArr == null) {
            this.f5323y = new long[this.f5321w.size() / 64];
        } else if (jArr.length <= i14) {
            long[] jArr2 = new long[this.f5321w.size() / 64];
            long[] jArr3 = this.f5323y;
            System.arraycopy(jArr3, 0, jArr2, 0, jArr3.length);
            this.f5323y = jArr2;
        }
        long j7 = 1 << (i13 % 64);
        long[] jArr4 = this.f5323y;
        jArr4[i14] = j7 | jArr4[i14];
    }
}
