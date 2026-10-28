package y83;

import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import va3.AbstractC35846d;
import yb3.AbstractC39397a;

/* JADX INFO: renamed from: y83.c */
/* JADX INFO: loaded from: classes3.dex */
public class C39347c {

    /* JADX INFO: renamed from: f */
    public static final C39345a f169348f;

    /* JADX INFO: renamed from: g */
    public static final byte[] f169349g;

    /* JADX INFO: renamed from: h */
    public static final C39347c f169350h;

    /* JADX INFO: renamed from: a */
    public final boolean f169351a;

    /* JADX INFO: renamed from: b */
    public final boolean f169352b;

    /* JADX INFO: renamed from: c */
    public final int f169353c;

    /* JADX INFO: renamed from: d */
    public final EnumC39346b f169354d;

    /* JADX INFO: renamed from: e */
    public final int f169355e;

    static {
        EnumC39346b enumC39346b = EnumC39346b.f169344w;
        f169348f = new C39345a(false, false, -1, enumC39346b);
        f169349g = new byte[]{13, 10};
        f169350h = new C39347c(true, false, -1, enumC39346b);
        new C39347c(false, true, 76, enumC39346b);
        new C39347c(false, true, 64, enumC39346b);
    }

    public C39347c(boolean z4, boolean z13, int i13, EnumC39346b enumC39346b) {
        this.f169351a = z4;
        this.f169352b = z13;
        this.f169353c = i13;
        this.f169354d = enumC39346b;
        if (z4 && z13) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f169355e = i13 / 4;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m125469a(C39347c c39347c, CharSequence source, int i13, int i14) {
        byte[] bytes;
        int i15;
        int i16;
        int i17;
        boolean z4;
        int[] iArr;
        int i18;
        int i19 = (i14 & 2) != 0 ? 0 : i13;
        int length = source.length();
        c39347c.getClass();
        EnumC39346b enumC39346b = c39347c.f169354d;
        boolean z13 = c39347c.f169352b;
        AbstractC22676k.m65750j(source, "source");
        if (source instanceof String) {
            String str = (String) source;
            AbstractC30060g.m92124n(i19, length, str.length());
            String strSubstring = str.substring(i19, length);
            AbstractC22676k.m65749i(strSubstring, "substring(...)");
            bytes = strSubstring.getBytes(AbstractC39397a.f169550e);
            AbstractC22676k.m65749i(bytes, "getBytes(...)");
        } else {
            AbstractC30060g.m92124n(i19, length, source.length());
            byte[] bArr = new byte[length - i19];
            int i24 = 0;
            while (i19 < length) {
                char cCharAt = source.charAt(i19);
                if (cCharAt <= 255) {
                    bArr[i24] = (byte) cCharAt;
                    i24++;
                } else {
                    bArr[i24] = 63;
                    i24++;
                }
                i19++;
            }
            bytes = bArr;
        }
        int length2 = bytes.length;
        AbstractC30060g.m92124n(0, length2, bytes.length);
        int i25 = 8;
        int i26 = -2;
        if (length2 == 0) {
            i16 = 0;
        } else {
            if (length2 == 1) {
                throw new IllegalArgumentException(AbstractC2875y.m8295h(length2, "Input should have at least 2 symbols for Base64 decoding, startIndex: 0, endIndex: "));
            }
            if (z13) {
                i15 = length2;
                for (int i27 = 0; i27 < length2; i27++) {
                    int i28 = AbstractC39348d.f169357b[bytes[i27] & 255];
                    if (i28 < 0) {
                        if (i28 == -2) {
                            i15 -= length2 - i27;
                            break;
                        }
                        i15--;
                    }
                }
            } else if (bytes[length2 - 1] == 61) {
                i15 = length2 - 1;
                if (bytes[length2 - 2] == 61) {
                    i15 = length2 - 2;
                }
            } else {
                i15 = length2;
            }
            i16 = (int) ((((long) i15) * ((long) 6)) / ((long) 8));
        }
        byte[] bArr2 = new byte[i16];
        int[] iArr2 = c39347c.f169351a ? AbstractC39348d.f169359d : AbstractC39348d.f169357b;
        int i29 = -8;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        int i37 = -8;
        while (true) {
            int i38 = i25;
            if (i34 >= length2) {
                i17 = i26;
                z4 = false;
                break;
            }
            if (i37 != i29 || (i18 = i34 + 3) >= length2) {
                iArr = iArr2;
            } else {
                iArr = iArr2;
                int i39 = i34 + 4;
                int i44 = (iArr[bytes[i34 + 2] & 255] << 6) | (iArr2[bytes[i34] & 255] << 18) | (iArr[bytes[i34 + 1] & 255] << 12) | iArr[bytes[i18] & 255];
                if (i44 >= 0) {
                    bArr2[i36] = (byte) (i44 >> 16);
                    int i45 = i36 + 2;
                    bArr2[i36 + 1] = (byte) (i44 >> 8);
                    i36 += 3;
                    bArr2[i45] = (byte) i44;
                    i25 = i38;
                    i34 = i39;
                    iArr2 = iArr;
                }
                i26 = -2;
                i29 = -8;
            }
            int i46 = bytes[i34] & 255;
            int i47 = iArr[i46];
            if (i47 >= 0) {
                i34++;
                i35 = (i35 << 6) | i47;
                int i48 = i37 + 6;
                if (i48 >= 0) {
                    bArr2[i36] = (byte) (i35 >>> i48);
                    i35 &= (1 << i48) - 1;
                    i37 -= 2;
                    i36++;
                } else {
                    i37 = i48;
                }
                iArr2 = iArr;
                i25 = 8;
            } else {
                if (i47 == -2) {
                    if (i37 == -8) {
                        throw new IllegalArgumentException(AbstractC2875y.m8295h(i34, "Redundant pad character at index "));
                    }
                    if (i37 != -6) {
                        if (i37 == -4) {
                            if (enumC39346b == EnumC39346b.f169345x) {
                                throw new IllegalArgumentException(AbstractC2875y.m8295h(i34, "The padding option is set to ABSENT, but the input has a pad character at index "));
                            }
                            int i49 = i34 + 1;
                            if (z13) {
                                while (i49 < length2) {
                                    if (AbstractC39348d.f169357b[bytes[i49] & 255] != -1) {
                                        break;
                                    }
                                    i49++;
                                }
                            }
                            if (i49 == length2 || bytes[i49] != 61) {
                                throw new IllegalArgumentException(AbstractC2875y.m8295h(i49, "Missing one pad character at index "));
                            }
                            i34 = i49 + 1;
                        } else if (i37 != -2) {
                            throw new IllegalStateException("Unreachable");
                        }
                        z4 = true;
                        i17 = -2;
                        break;
                    }
                    if (enumC39346b == EnumC39346b.f169345x) {
                        throw new IllegalArgumentException(AbstractC2875y.m8295h(i34, "The padding option is set to ABSENT, but the input has a pad character at index "));
                    }
                    i34++;
                    z4 = true;
                    i17 = -2;
                    break;
                }
                if (!z13) {
                    StringBuilder sb4 = new StringBuilder("Invalid symbol '");
                    sb4.append((char) i46);
                    sb4.append("'(");
                    AbstractC35846d.m113779c(i38);
                    String string = Integer.toString(i46, i38);
                    AbstractC22676k.m65749i(string, "toString(...)");
                    sb4.append(string);
                    sb4.append(") at index ");
                    sb4.append(i34);
                    throw new IllegalArgumentException(sb4.toString());
                }
                i34++;
                i25 = i38;
                iArr2 = iArr;
            }
            i26 = -2;
            i29 = -8;
        }
        if (i37 == i17) {
            throw new IllegalArgumentException("The last unit of input does not have enough bits");
        }
        if (i37 != -8 && !z4 && enumC39346b == EnumC39346b.f169344w) {
            throw new IllegalArgumentException("The padding option is set to PRESENT, but the input is not properly padded");
        }
        if (i35 != 0) {
            throw new IllegalArgumentException("The pad bits must be zeros");
        }
        if (z13) {
            while (i34 < length2) {
                if (AbstractC39348d.f169357b[bytes[i34] & 255] != -1) {
                    break;
                }
                i34++;
            }
        }
        if (i34 >= length2) {
            if (i36 == i16) {
                return bArr2;
            }
            throw new IllegalStateException("Check failed.");
        }
        int i54 = bytes[i34] & 255;
        StringBuilder sb5 = new StringBuilder("Symbol '");
        sb5.append((char) i54);
        sb5.append("'(");
        AbstractC35846d.m113779c(8);
        String string2 = Integer.toString(i54, 8);
        AbstractC22676k.m65749i(string2, "toString(...)");
        sb5.append(string2);
        sb5.append(") at index ");
        throw new IllegalArgumentException(AbstractC18489d0.m53371l(sb5, i34 - 1, " is prohibited after the pad character"));
    }

    /* JADX INFO: renamed from: b */
    public static String m125470b(C39347c c39347c, byte[] bArr) {
        int i13;
        EnumC39346b enumC39346b = c39347c.f169354d;
        int length = bArr.length;
        AbstractC30060g.m92124n(0, length, bArr.length);
        int iM125471c = c39347c.m125471c(length);
        byte[] bArr2 = new byte[iM125471c];
        AbstractC30060g.m92124n(0, length, bArr.length);
        int iM125471c2 = c39347c.m125471c(length);
        if (iM125471c < 0) {
            throw new IndexOutOfBoundsException(AbstractC2875y.m8295h(iM125471c, "destination offset: 0, destination size: "));
        }
        if (iM125471c2 < 0 || iM125471c2 > iM125471c) {
            throw new IndexOutOfBoundsException(AbstractC2875y.m8294g(iM125471c, iM125471c2, "The destination array does not have enough capacity, destination offset: 0, destination size: ", ", capacity needed: "));
        }
        byte[] bArr3 = c39347c.f169351a ? AbstractC39348d.f169358c : AbstractC39348d.f169356a;
        int i14 = c39347c.f169352b ? c39347c.f169355e : Integer.MAX_VALUE;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            i13 = i15 + 2;
            if (i13 >= length) {
                break;
            }
            int iMin = Math.min((length - i15) / 3, i14);
            for (int i17 = 0; i17 < iMin; i17++) {
                int i18 = bArr[i15] & 255;
                int i19 = i15 + 2;
                int i24 = bArr[i15 + 1] & 255;
                i15 += 3;
                int i25 = (i24 << 8) | (i18 << 16) | (bArr[i19] & 255);
                bArr2[i16] = bArr3[i25 >>> 18];
                bArr2[i16 + 1] = bArr3[(i25 >>> 12) & 63];
                int i26 = i16 + 3;
                bArr2[i16 + 2] = bArr3[(i25 >>> 6) & 63];
                i16 += 4;
                bArr2[i26] = bArr3[i25 & 63];
            }
            if (iMin == i14 && i15 != length) {
                int i27 = i16 + 1;
                byte[] bArr4 = f169349g;
                bArr2[i16] = bArr4[0];
                i16 += 2;
                bArr2[i27] = bArr4[1];
            }
        }
        int i28 = length - i15;
        if (i28 == 1) {
            int i29 = i15 + 1;
            int i34 = (bArr[i15] & 255) << 4;
            bArr2[i16] = bArr3[i34 >>> 6];
            int i35 = i16 + 2;
            bArr2[i16 + 1] = bArr3[i34 & 63];
            if (enumC39346b == EnumC39346b.f169344w || enumC39346b == EnumC39346b.f169346y) {
                bArr2[i35] = 61;
                bArr2[i16 + 3] = 61;
            }
            i15 = i29;
        } else if (i28 == 2) {
            int i36 = ((bArr[i15 + 1] & 255) << 2) | ((bArr[i15] & 255) << 10);
            bArr2[i16] = bArr3[i36 >>> 12];
            int i37 = i16 + 2;
            bArr2[i16 + 1] = bArr3[(i36 >>> 6) & 63];
            int i38 = i16 + 3;
            bArr2[i37] = bArr3[i36 & 63];
            if (enumC39346b == EnumC39346b.f169344w || enumC39346b == EnumC39346b.f169346y) {
                bArr2[i38] = 61;
            }
            i15 = i13;
        }
        if (i15 == length) {
            return new String(bArr2, AbstractC39397a.f169550e);
        }
        throw new IllegalStateException("Check failed.");
    }

    /* JADX INFO: renamed from: c */
    public final int m125471c(int i13) {
        int i14 = i13 / 3;
        int i15 = i13 % 3;
        int i16 = 4;
        int iM30449c = i14 * 4;
        if (i15 != 0) {
            EnumC39346b enumC39346b = EnumC39346b.f169344w;
            EnumC39346b enumC39346b2 = this.f169354d;
            if (enumC39346b2 != enumC39346b && enumC39346b2 != EnumC39346b.f169346y) {
                i16 = i15 + 1;
            }
            iM30449c += i16;
        }
        if (iM30449c < 0) {
            throw new IllegalArgumentException("Input is too big");
        }
        if (this.f169352b) {
            iM30449c = AbstractC11266d.m30449c(iM30449c - 1, this.f169353c, 2, iM30449c);
        }
        if (iM30449c >= 0) {
            return iM30449c;
        }
        throw new IllegalArgumentException("Input is too big");
    }
}
