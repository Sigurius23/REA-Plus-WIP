package p668z1;

import d93.InterfaceC11820a;
import java.util.ArrayList;
import java.util.Iterator;
import m83.AbstractC25260n;
import m83.AbstractC25267u;
import p002a0.C0032j0;
import p684zk.C40798w;
import p715kotlin.jvm.internal.AbstractC22676k;
import v63.AbstractC35745c;

/* JADX INFO: renamed from: z1.j */
/* JADX INFO: loaded from: classes.dex */
public final class C39961j implements Iterable, InterfaceC11820a {

    /* JADX INFO: renamed from: E */
    public static final C39961j f172454E = new C39961j(0, 0, 0, null);

    /* JADX INFO: renamed from: w */
    public final long f172455w;

    /* JADX INFO: renamed from: x */
    public final long f172456x;

    /* JADX INFO: renamed from: y */
    public final long f172457y;

    /* JADX INFO: renamed from: z */
    public final long[] f172458z;

    public C39961j(long j7, long j13, long j14, long[] jArr) {
        this.f172455w = j7;
        this.f172456x = j13;
        this.f172457y = j14;
        this.f172458z = jArr;
    }

    /* JADX INFO: renamed from: a */
    public final C39961j m128156a(C39961j c39961j) {
        C39961j c39961jM128157c;
        long[] jArr;
        C39961j c39961j2 = f172454E;
        if (c39961j == c39961j2) {
            return this;
        }
        if (this == c39961j2) {
            return c39961j2;
        }
        long j7 = c39961j.f172457y;
        long j13 = c39961j.f172457y;
        long[] jArr2 = c39961j.f172458z;
        long j14 = c39961j.f172456x;
        long j15 = c39961j.f172455w;
        long j16 = this.f172457y;
        if (j7 == j16 && jArr2 == (jArr = this.f172458z)) {
            return new C39961j(this.f172455w & (~j15), this.f172456x & (~j14), j16, jArr);
        }
        if (jArr2 != null) {
            c39961jM128157c = this;
            for (long j17 : jArr2) {
                c39961jM128157c = c39961jM128157c.m128157c(j17);
            }
        } else {
            c39961jM128157c = this;
        }
        long j18 = 0;
        if (j14 != 0) {
            int i13 = 0;
            while (i13 < 64) {
                if (((1 << i13) & j14) != j18) {
                    c39961jM128157c = c39961jM128157c.m128157c(((long) i13) + j13);
                }
                i13++;
                j18 = j18;
            }
        }
        long j19 = j18;
        if (j15 != j19) {
            for (int i14 = 0; i14 < 64; i14++) {
                if (((1 << i14) & j15) != j19) {
                    c39961jM128157c = c39961jM128157c.m128157c(((long) i14) + j13 + ((long) 64));
                }
            }
        }
        return c39961jM128157c;
    }

    /* JADX INFO: renamed from: c */
    public final C39961j m128157c(long j7) {
        long[] jArr;
        int iM128189c;
        long[] jArr2;
        long j13 = j7 - this.f172457y;
        long j14 = 0;
        if (AbstractC22676k.m65752l(j13, j14) >= 0 && AbstractC22676k.m65752l(j13, 64) < 0) {
            long j15 = 1 << ((int) j13);
            long j16 = this.f172456x;
            if ((j16 & j15) != 0) {
                return new C39961j(this.f172455w, j16 & (~j15), this.f172457y, this.f172458z);
            }
        } else if (AbstractC22676k.m65752l(j13, 64) >= 0 && AbstractC22676k.m65752l(j13, 128) < 0) {
            long j17 = 1 << (((int) j13) - 64);
            long j18 = this.f172455w;
            if ((j18 & j17) != 0) {
                return new C39961j(j18 & (~j17), this.f172456x, this.f172457y, this.f172458z);
            }
        } else if (AbstractC22676k.m65752l(j13, j14) < 0 && (jArr = this.f172458z) != null && (iM128189c = AbstractC39968q.m128189c(jArr, j7)) >= 0) {
            int length = jArr.length;
            int i13 = length - 1;
            if (i13 == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i13];
                if (iM128189c > 0) {
                    AbstractC25260n.m74066g0(jArr, jArr3, 0, 0, iM128189c);
                }
                if (iM128189c < i13) {
                    AbstractC25260n.m74066g0(jArr, jArr3, iM128189c, iM128189c + 1, length);
                }
                jArr2 = jArr3;
            }
            return new C39961j(this.f172455w, this.f172456x, this.f172457y, jArr2);
        }
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m128158d(long j7) {
        long[] jArr;
        long j13 = j7 - this.f172457y;
        long j14 = 0;
        if (AbstractC22676k.m65752l(j13, j14) >= 0 && AbstractC22676k.m65752l(j13, 64) < 0) {
            return ((1 << ((int) j13)) & this.f172456x) != 0;
        }
        if (AbstractC22676k.m65752l(j13, 64) < 0 || AbstractC22676k.m65752l(j13, 128) >= 0) {
            return AbstractC22676k.m65752l(j13, j14) <= 0 && (jArr = this.f172458z) != null && AbstractC39968q.m128189c(jArr, j7) >= 0;
        }
        return ((1 << (((int) j13) - 64)) & this.f172455w) != 0;
    }

    /* JADX INFO: renamed from: e */
    public final C39961j m128159e(C39961j c39961j) {
        C39961j c39961jM128160g;
        C39961j c39961jM128160g2;
        long[] jArr;
        C39961j c39961j2 = f172454E;
        if (c39961j == c39961j2) {
            return this;
        }
        if (this == c39961j2) {
            return c39961j;
        }
        long j7 = c39961j.f172457y;
        long j13 = c39961j.f172457y;
        long[] jArr2 = c39961j.f172458z;
        long j14 = c39961j.f172456x;
        long j15 = c39961j.f172455w;
        long j16 = this.f172457y;
        long j17 = this.f172456x;
        long j18 = this.f172455w;
        if (j7 == j16 && jArr2 == (jArr = this.f172458z)) {
            return new C39961j(j18 | j15, j17 | j14, j16, jArr);
        }
        int i13 = 0;
        long[] jArr3 = this.f172458z;
        if (jArr3 != null) {
            if (jArr2 != null) {
                c39961jM128160g = this;
                for (long j19 : jArr2) {
                    c39961jM128160g = c39961jM128160g.m128160g(j19);
                }
            } else {
                c39961jM128160g = this;
            }
            if (j14 != 0) {
                for (int i14 = 0; i14 < 64; i14++) {
                    if (((1 << i14) & j14) != 0) {
                        c39961jM128160g = c39961jM128160g.m128160g(((long) i14) + j13);
                    }
                }
            }
            if (j15 != 0) {
                while (i13 < 64) {
                    if (((1 << i13) & j15) != 0) {
                        c39961jM128160g = c39961jM128160g.m128160g(((long) i13) + j13 + ((long) 64));
                    }
                    i13++;
                }
            }
            return c39961jM128160g;
        }
        if (jArr3 != null) {
            c39961jM128160g2 = c39961j;
            for (long j24 : jArr3) {
                c39961jM128160g2 = c39961jM128160g2.m128160g(j24);
            }
        } else {
            c39961jM128160g2 = c39961j;
        }
        long j25 = this.f172457y;
        if (j17 != 0) {
            for (int i15 = 0; i15 < 64; i15++) {
                if (((1 << i15) & j17) != 0) {
                    c39961jM128160g2 = c39961jM128160g2.m128160g(((long) i15) + j25);
                }
            }
        }
        if (j18 != 0) {
            while (i13 < 64) {
                if (((1 << i13) & j18) != 0) {
                    c39961jM128160g2 = c39961jM128160g2.m128160g(((long) i13) + j25 + ((long) 64));
                }
                i13++;
            }
        }
        return c39961jM128160g2;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x010e  */
    /* JADX INFO: renamed from: g */
    public final C39961j m128160g(long j7) {
        long[] jArr;
        long j13;
        long[] jArr2;
        long[] jArr3;
        long j14 = this.f172457y;
        long j15 = j7 - j14;
        long j16 = 0;
        int iM65752l = AbstractC22676k.m65752l(j15, j16);
        long j17 = this.f172456x;
        int i13 = 64;
        long j18 = 0;
        if (iM65752l < 0 || AbstractC22676k.m65752l(j15, 64) >= 0) {
            long j19 = 64;
            int iM65752l2 = AbstractC22676k.m65752l(j15, j19);
            long j24 = this.f172455w;
            if (iM65752l2 < 0 || AbstractC22676k.m65752l(j15, 128) >= 0) {
                long j25 = 128;
                int iM65752l3 = AbstractC22676k.m65752l(j15, j25);
                long[] jArr4 = this.f172458z;
                if (iM65752l3 < 0) {
                    if (jArr4 == null) {
                        return new C39961j(this.f172455w, this.f172456x, this.f172457y, new long[]{j7});
                    }
                    int iM128189c = AbstractC39968q.m128189c(jArr4, j7);
                    if (iM128189c < 0) {
                        int i14 = -(iM128189c + 1);
                        int length = jArr4.length;
                        long[] jArr5 = new long[length + 1];
                        AbstractC25260n.m74066g0(jArr4, jArr5, 0, 0, i14);
                        AbstractC25260n.m74066g0(jArr4, jArr5, i14 + 1, i14, length);
                        jArr5[i14] = j7;
                        return new C39961j(this.f172455w, this.f172456x, this.f172457y, jArr5);
                    }
                } else if (!m128158d(j7)) {
                    long j26 = 1;
                    long j27 = ((j7 + j26) / j19) * j19;
                    if (AbstractC22676k.m65752l(j27, j16) < 0) {
                        j27 = (Long.MAX_VALUE - j25) + j26;
                    }
                    long j28 = j14;
                    long j29 = j24;
                    C40798w c40798w = null;
                    while (true) {
                        if (AbstractC22676k.m65752l(j28, j27) >= 0) {
                            jArr = jArr4;
                            j13 = j28;
                            j18 = j17;
                            break;
                        }
                        if (j17 != 0) {
                            if (c40798w == null) {
                                c40798w = new C40798w(jArr4);
                            }
                            int i15 = 0;
                            while (i15 < i13) {
                                if ((j17 & (1 << i15)) != 0) {
                                    ((C0032j0) c40798w.f175951a).m76a(((long) i15) + j28);
                                }
                                i15++;
                                jArr4 = jArr4;
                                i13 = 64;
                            }
                        }
                        long[] jArr6 = jArr4;
                        if (j29 == 0) {
                            j13 = j27;
                            jArr = jArr6;
                            break;
                        }
                        j28 += j19;
                        jArr4 = jArr6;
                        j17 = j29;
                        i13 = 64;
                        j29 = 0;
                    }
                    if (c40798w == null) {
                        jArr2 = jArr;
                    } else {
                        C0032j0 c0032j0 = (C0032j0) c40798w.f175951a;
                        int i16 = c0032j0.f95b;
                        if (i16 == 0) {
                            jArr3 = null;
                        } else {
                            long[] jArr7 = new long[i16];
                            long[] jArr8 = c0032j0.f94a;
                            for (int i17 = 0; i17 < i16; i17++) {
                                jArr7[i17] = jArr8[i17];
                            }
                            jArr3 = jArr7;
                        }
                        if (jArr3 == null) {
                            jArr2 = jArr;
                        } else {
                            jArr2 = jArr3;
                        }
                    }
                    return new C39961j(j29, j18, j13, jArr2).m128160g(j7);
                }
            } else {
                long j34 = 1 << (((int) j15) - 64);
                if ((j24 & j34) == 0) {
                    return new C39961j(j24 | j34, this.f172456x, this.f172457y, this.f172458z);
                }
            }
        } else {
            long j35 = 1 << ((int) j15);
            if ((j17 & j35) == 0) {
                return new C39961j(this.f172455w, j17 | j35, this.f172457y, this.f172458z);
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return AbstractC35745c.m113247i(new C39960i(this, null));
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        sb4.append(super.toString());
        sb4.append(" [");
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append((CharSequence) "");
        int size = arrayList.size();
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            Object obj = arrayList.get(i14);
            i13++;
            if (i13 > 1) {
                sb5.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb5.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb5.append(((Character) obj).charValue());
            } else {
                sb5.append((CharSequence) obj.toString());
            }
        }
        sb5.append((CharSequence) "");
        sb4.append(sb5.toString());
        sb4.append(']');
        return sb4.toString();
    }
}
