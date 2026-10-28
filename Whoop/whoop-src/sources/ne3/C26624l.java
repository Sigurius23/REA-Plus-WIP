package ne3;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import m83.AbstractC25260n;
import oe3.AbstractC27882b;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import y00.AbstractC38963t7;
import yb3.AbstractC39397a;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: ne3.l */
/* JADX INFO: loaded from: classes5.dex */
public class C26624l implements Serializable, Comparable {

    /* JADX INFO: renamed from: w */
    public final byte[] f105883w;

    /* JADX INFO: renamed from: x */
    public transient int f105884x;

    /* JADX INFO: renamed from: y */
    public transient String f105885y;

    /* JADX INFO: renamed from: z */
    public static final C26622k f105882z = new C26622k();

    /* JADX INFO: renamed from: E */
    public static final C26624l f105881E = new C26624l(new byte[0]);

    public C26624l(byte[] data) {
        AbstractC22676k.m65750j(data, "data");
        this.f105883w = data;
    }

    /* JADX INFO: renamed from: g */
    public static int m79247g(C26624l c26624l, C26624l other) {
        c26624l.getClass();
        AbstractC22676k.m65750j(other, "other");
        return c26624l.mo79255f(0, other.mo79256h());
    }

    /* JADX INFO: renamed from: k */
    public static int m79248k(C26624l c26624l, C26624l other) {
        c26624l.getClass();
        AbstractC22676k.m65750j(other, "other");
        return c26624l.mo79258j(other.mo79256h());
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ C26624l m79249p(C26624l c26624l, int i13, int i14, int i15) {
        if ((i15 & 1) != 0) {
            i13 = 0;
        }
        if ((i15 & 2) != 0) {
            i14 = -1234567890;
        }
        return c26624l.mo79262o(i13, i14);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C26624l other) {
        AbstractC22676k.m65750j(other, "other");
        int iMo79253d = mo79253d();
        int iMo79253d2 = other.mo79253d();
        int iMin = Math.min(iMo79253d, iMo79253d2);
        for (int i13 = 0; i13 < iMin; i13++) {
            int iMo79257i = mo79257i(i13) & 255;
            int iMo79257i2 = other.mo79257i(i13) & 255;
            if (iMo79257i != iMo79257i2) {
                return iMo79257i < iMo79257i2 ? -1 : 1;
            }
        }
        if (iMo79253d == iMo79253d2) {
            return 0;
        }
        return iMo79253d < iMo79253d2 ? -1 : 1;
    }

    /* JADX INFO: renamed from: b */
    public void mo79251b(int i13, int i14, int i15, byte[] target) {
        AbstractC22676k.m65750j(target, "target");
        AbstractC25260n.m74060c0(i14, i13, i15 + i13, this.f105883w, target);
    }

    /* JADX INFO: renamed from: c */
    public C26624l mo79252c(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f105883w, 0, mo79253d());
        byte[] bArrDigest = messageDigest.digest();
        AbstractC22676k.m65747g(bArrDigest);
        return new C26624l(bArrDigest);
    }

    /* JADX INFO: renamed from: d */
    public int mo79253d() {
        return this.f105883w.length;
    }

    /* JADX INFO: renamed from: e */
    public String mo79254e() {
        byte[] bArr = this.f105883w;
        char[] cArr = new char[bArr.length * 2];
        int i13 = 0;
        for (byte b : bArr) {
            int i14 = i13 + 1;
            char[] cArr2 = AbstractC27882b.f112427a;
            cArr[i13] = cArr2[(b >> 4) & 15];
            i13 += 2;
            cArr[i14] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C26624l) {
            C26624l c26624l = (C26624l) obj;
            int iMo79253d = c26624l.mo79253d();
            byte[] bArr = this.f105883w;
            if (iMo79253d == bArr.length && c26624l.mo79259l(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public int mo79255f(int i13, byte[] other) {
        AbstractC22676k.m65750j(other, "other");
        byte[] bArr = this.f105883w;
        int length = bArr.length - other.length;
        int iMax = Math.max(i13, 0);
        if (iMax > length) {
            return -1;
        }
        while (!AbstractC26604b.m79156a(iMax, 0, other.length, bArr, other)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    /* JADX INFO: renamed from: h */
    public byte[] mo79256h() {
        return this.f105883w;
    }

    public int hashCode() {
        int i13 = this.f105884x;
        if (i13 != 0) {
            return i13;
        }
        int iHashCode = Arrays.hashCode(this.f105883w);
        this.f105884x = iHashCode;
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public byte mo79257i(int i13) {
        return this.f105883w[i13];
    }

    /* JADX INFO: renamed from: j */
    public int mo79258j(byte[] other) {
        AbstractC22676k.m65750j(other, "other");
        int iMo79253d = mo79253d();
        byte[] bArr = this.f105883w;
        for (int iMin = Math.min(iMo79253d, bArr.length - other.length); -1 < iMin; iMin--) {
            if (AbstractC26604b.m79156a(iMin, 0, other.length, bArr, other)) {
                return iMin;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: l */
    public boolean mo79259l(int i13, int i14, int i15, byte[] other) {
        AbstractC22676k.m65750j(other, "other");
        if (i13 < 0) {
            return false;
        }
        byte[] bArr = this.f105883w;
        return i13 <= bArr.length - i15 && i14 >= 0 && i14 <= other.length - i15 && AbstractC26604b.m79156a(i13, i14, i15, bArr, other);
    }

    /* JADX INFO: renamed from: m */
    public boolean mo79260m(int i13, int i14, C26624l other) {
        AbstractC22676k.m65750j(other, "other");
        return other.mo79259l(0, i13, i14, this.f105883w);
    }

    /* JADX INFO: renamed from: n */
    public String mo79261n(Charset charset) {
        AbstractC22676k.m65750j(charset, "charset");
        return new String(this.f105883w, charset);
    }

    /* JADX INFO: renamed from: o */
    public C26624l mo79262o(int i13, int i14) {
        if (i14 == -1234567890) {
            i14 = mo79253d();
        }
        if (i13 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f105883w;
        if (i14 > bArr.length) {
            throw new IllegalArgumentException(AbstractC11895b.m31999r(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        if (i14 - i13 >= 0) {
            return (i13 == 0 && i14 == bArr.length) ? this : new C26624l(AbstractC25260n.m74070k0(bArr, i13, i14));
        }
        throw new IllegalArgumentException("endIndex < beginIndex");
    }

    /* JADX INFO: renamed from: q */
    public C26624l mo79263q() {
        int i13 = 0;
        while (true) {
            byte[] bArr = this.f105883w;
            if (i13 >= bArr.length) {
                return this;
            }
            byte b = bArr[i13];
            if (b >= 65 && b <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                AbstractC22676k.m65749i(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i13] = (byte) (b + 32);
                for (int i14 = i13 + 1; i14 < bArrCopyOf.length; i14++) {
                    byte b6 = bArrCopyOf[i14];
                    if (b6 >= 65 && b6 <= 90) {
                        bArrCopyOf[i14] = (byte) (b6 + 32);
                    }
                }
                return new C26624l(bArrCopyOf);
            }
            i13++;
        }
    }

    /* JADX INFO: renamed from: r */
    public byte[] mo79264r() {
        byte[] bArr = this.f105883w;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        AbstractC22676k.m65749i(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    /* JADX INFO: renamed from: s */
    public final String m79265s() {
        String str = this.f105885y;
        if (str != null) {
            return str;
        }
        byte[] bArrMo79256h = mo79256h();
        AbstractC22676k.m65750j(bArrMo79256h, "<this>");
        String str2 = new String(bArrMo79256h, AbstractC39397a.f169546a);
        this.f105885y = str2;
        return str2;
    }

    /* JADX INFO: renamed from: t */
    public void mo79266t(C26616h c26616h, int i13) {
        c26616h.m134463write(this.f105883w, 0, i13);
    }

    /* JADX WARN: Code duplicated, block: B:179:0x01b6 A[EDGE_INSN: B:179:0x01b6->B:180:0x01b7 BREAK  A[LOOP:0: B:7:0x000e->B:241:0x000e]] */
    public String toString() {
        byte b;
        int i13;
        byte[] bArr = this.f105883w;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        loop0: while (i14 < length) {
            byte b6 = bArr[i14];
            if (b6 < 0) {
                if ((b6 >> 5) != -2) {
                    if ((b6 >> 4) != -2) {
                        if ((b6 >> 3) != -2) {
                            if (i16 == 64) {
                                break;
                            }
                            i15 = -1;
                            break;
                        }
                        int i17 = i14 + 3;
                        if (length > i17) {
                            byte b8 = bArr[i14 + 1];
                            if ((b8 & 192) != 128) {
                                if (i16 == 64) {
                                    break;
                                }
                                i15 = -1;
                                break;
                            }
                            byte b14 = bArr[i14 + 2];
                            if ((b14 & 192) != 128) {
                                if (i16 == 64) {
                                    break;
                                }
                                i15 = -1;
                                break;
                            }
                            byte b15 = bArr[i17];
                            if ((b15 & 192) != 128) {
                                if (i16 == 64) {
                                    break;
                                }
                                i15 = -1;
                                break;
                            }
                            int i18 = (((b15 ^ 3678080) ^ (b14 << 6)) ^ (b8 << 12)) ^ (b6 << 18);
                            if (i18 <= 1114111) {
                                if (55296 <= i18 && i18 < 57344) {
                                    if (i16 == 64) {
                                        break;
                                    }
                                    i15 = -1;
                                    break;
                                }
                                if (i18 >= 65536) {
                                    i13 = i16 + 1;
                                    if (i16 == 64) {
                                        break;
                                    }
                                    if ((i18 != 10 && i18 != 13 && ((i18 >= 0 && i18 < 32) || (127 <= i18 && i18 < 160))) || i18 == 65533) {
                                        i15 = -1;
                                        break;
                                    }
                                    i15 += i18 < 65536 ? 1 : 2;
                                    i14 += 4;
                                    i16 = i13;
                                } else {
                                    if (i16 == 64) {
                                        break;
                                    }
                                    i15 = -1;
                                    break;
                                }
                            } else {
                                if (i16 == 64) {
                                    break;
                                }
                                i15 = -1;
                                break;
                            }
                        } else {
                            if (i16 == 64) {
                                break;
                            }
                            i15 = -1;
                            break;
                        }
                    } else {
                        int i19 = i14 + 2;
                        if (length > i19) {
                            byte b16 = bArr[i14 + 1];
                            if ((b16 & 192) != 128) {
                                if (i16 == 64) {
                                    break;
                                }
                                i15 = -1;
                                break;
                            }
                            byte b17 = bArr[i19];
                            if ((b17 & 192) != 128) {
                                if (i16 == 64) {
                                    break;
                                }
                                i15 = -1;
                                break;
                            }
                            int i24 = ((b17 ^ (-123008)) ^ (b16 << 6)) ^ (b6 << 12);
                            if (i24 >= 2048) {
                                if (55296 <= i24 && i24 < 57344) {
                                    if (i16 == 64) {
                                        break;
                                    }
                                    i15 = -1;
                                    break;
                                }
                                i13 = i16 + 1;
                                if (i16 == 64) {
                                    break;
                                }
                                if ((i24 != 10 && i24 != 13 && ((i24 >= 0 && i24 < 32) || (127 <= i24 && i24 < 160))) || i24 == 65533) {
                                    i15 = -1;
                                    break;
                                }
                                i15 += i24 < 65536 ? 1 : 2;
                                i14 += 3;
                                i16 = i13;
                            } else {
                                if (i16 == 64) {
                                    break;
                                }
                                i15 = -1;
                                break;
                            }
                        } else {
                            if (i16 == 64) {
                                break;
                            }
                            i15 = -1;
                            break;
                        }
                    }
                } else {
                    int i25 = i14 + 1;
                    if (length > i25) {
                        byte b18 = bArr[i25];
                        if ((b18 & 192) != 128) {
                            if (i16 == 64) {
                                break;
                            }
                            i15 = -1;
                            break;
                        }
                        int i26 = (b18 ^ 3968) ^ (b6 << 6);
                        if (i26 >= 128) {
                            i13 = i16 + 1;
                            if (i16 == 64) {
                                break;
                            }
                            if ((i26 != 10 && i26 != 13 && ((i26 >= 0 && i26 < 32) || (127 <= i26 && i26 < 160))) || i26 == 65533) {
                                i15 = -1;
                                break;
                            }
                            i15 += i26 < 65536 ? 1 : 2;
                            i14 += 2;
                            i16 = i13;
                        } else {
                            if (i16 == 64) {
                                break;
                            }
                            i15 = -1;
                            break;
                        }
                    } else {
                        if (i16 == 64) {
                            break;
                        }
                        i15 = -1;
                        break;
                    }
                }
            } else {
                int i27 = i16 + 1;
                if (i16 == 64) {
                    break;
                }
                if ((b6 == 10 || b6 == 13 || ((b6 < 0 || b6 >= 32) && (127 > b6 || b6 >= 160))) && b6 != 65533) {
                    i15 += b6 < 65536 ? 1 : 2;
                    i14++;
                    while (true) {
                        i16 = i27;
                        if (i14 < length && (b = bArr[i14]) >= 0) {
                            i14++;
                            i27 = i16 + 1;
                            if (i16 == 64) {
                                break loop0;
                            }
                            if ((b == 10 || b == 13 || ((b < 0 || b >= 32) && (127 > b || b >= 160))) && b != 65533) {
                                i15 += b < 65536 ? 1 : 2;
                            }
                        }
                    }
                }
                i15 = -1;
                break;
            }
        }
        if (i15 != -1) {
            String strM79265s = m79265s();
            String strSubstring = strM79265s.substring(0, i15);
            AbstractC22676k.m65749i(strSubstring, "substring(...)");
            String strM125926K = AbstractC39421y.m125926K(AbstractC39421y.m125926K(AbstractC39421y.m125926K(strSubstring, "\\", "\\\\", false), "\n", "\\n", false), "\r", "\\r", false);
            return i15 < strM79265s.length() ? AbstractC38963t7.m124376f(bArr.length, " text=", strM125926K, "…]", new StringBuilder("[size=")) : AbstractC31061c.m95633i(']', "[text=", strM125926K);
        }
        if (bArr.length <= 64) {
            return "[hex=" + mo79254e() + ']';
        }
        StringBuilder sb4 = new StringBuilder("[size=");
        sb4.append(bArr.length);
        sb4.append(" hex=");
        if (64 > bArr.length) {
            throw new IllegalArgumentException(AbstractC11895b.m31999r(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        sb4.append((64 == bArr.length ? this : new C26624l(AbstractC25260n.m74070k0(bArr, 0, 64))).mo79254e());
        sb4.append("…]");
        return sb4.toString();
    }
}
