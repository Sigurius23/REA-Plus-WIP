package hu;

import ai.C0904j;
import com.google.android.material.datepicker.C5020n;
import com.google.zxing.WriterException;
import gu.C16207a;
import gu.C16208b;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import p000.AbstractC11266d;
import p047c9.C4320k;
import p108e4.AbstractC12682p;
import p156fu.C14774a;
import p156fu.C14775b;
import p230iu.C20934b;
import p230iu.EnumC20933a;
import p261ju.AbstractC21958b;
import p261ju.C21957a;
import p319m4.AbstractC25012a;

/* JADX INFO: renamed from: hu.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C17639a {
    /* JADX WARN: Code duplicated, block: B:393:0x0783  */
    /* JADX WARN: Code duplicated, block: B:398:0x0790  */
    /* JADX WARN: Code duplicated, block: B:431:0x0806  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16, types: [fu.a] */
    /* JADX WARN: Type inference failed for: r1v23, types: [fu.a] */
    /* JADX WARN: Type inference failed for: r1v58 */
    /* JADX WARN: Type inference failed for: r1v80 */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v79, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v80 */
    /* JADX WARN: Type inference failed for: r7v82, types: [boolean] */
    /* JADX INFO: renamed from: a */
    public static C14775b m50258a(String str) throws WriterException {
        char c3;
        EnumC20933a enumC20933a;
        EnumC20933a enumC20933a2;
        int i13;
        ?? r10;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z4;
        boolean z13;
        boolean z14;
        boolean z15;
        char c7;
        int i18;
        C16208b c16208b;
        C16208b c16208b2;
        int i19;
        char c14;
        C16208b c16208b3;
        int[] iArr = AbstractC21958b.f84909a;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        int i24 = 0;
        boolean z16 = false;
        boolean z17 = false;
        while (true) {
            int length = str.length();
            c3 = 1;
            enumC20933a = EnumC20933a.BYTE;
            if (i24 < length) {
                char cCharAt = str.charAt(i24);
                if (cCharAt >= '0' && cCharAt <= '9') {
                    z17 = true;
                } else if ((cCharAt < '`' ? iArr[cCharAt] : -1) != -1) {
                    z16 = true;
                }
                i24++;
            } else {
                if (z16) {
                    enumC20933a2 = EnumC20933a.ALPHANUMERIC;
                    break;
                }
                if (z17) {
                    enumC20933a2 = EnumC20933a.NUMERIC;
                    break;
                }
            }
            enumC20933a2 = enumC20933a;
            break;
        }
        int[] iArr2 = enumC20933a2.f78935w;
        C14774a c14774a = new C14774a();
        c14774a.m42384b(enumC20933a2.f78936x, 4);
        C14774a c14774a2 = new C14774a();
        int iOrdinal = enumC20933a2.ordinal();
        int i25 = 0;
        int i26 = 8;
        char c15 = '\n';
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                int length2 = str.length();
                int i27 = 0;
                while (i27 < length2) {
                    char cCharAt2 = str.charAt(i27);
                    int i28 = cCharAt2 < '`' ? iArr[cCharAt2] : -1;
                    if (i28 == -1) {
                        throw new WriterException();
                    }
                    int i29 = i26;
                    int i34 = i27 + 1;
                    if (i34 < length2) {
                        char cCharAt3 = str.charAt(i34);
                        int i35 = cCharAt3 < '`' ? iArr[cCharAt3] : -1;
                        if (i35 == -1) {
                            throw new WriterException();
                        }
                        c14774a2.m42384b((i28 * 45) + i35, 11);
                        i27 += 2;
                    } else {
                        c14774a2.m42384b(i28, 6);
                        i27 = i34;
                    }
                    i26 = i29;
                }
            } else if (iOrdinal == 4) {
                try {
                    for (byte b : str.getBytes("ISO-8859-1")) {
                        c14774a2.m42384b(b, 8);
                    }
                } catch (UnsupportedEncodingException e5) {
                    throw new WriterException(e5);
                }
            } else {
                if (iOrdinal != 6) {
                    throw new WriterException("Invalid mode: ".concat(String.valueOf(enumC20933a2)));
                }
                try {
                    byte[] bytes = str.getBytes("Shift_JIS");
                    if (bytes.length % 2 != 0) {
                        throw new WriterException("Kanji byte size not even");
                    }
                    int length3 = bytes.length - 1;
                    for (int i36 = 0; i36 < length3; i36 += 2) {
                        int i37 = ((bytes[i36] & 255) << 8) | (bytes[i36 + 1] & 255);
                        int i38 = (i37 < 33088 || i37 > 40956) ? (i37 < 57408 || i37 > 60351) ? -1 : i37 - 49472 : i37 - 33088;
                        if (i38 == -1) {
                            throw new WriterException("Invalid byte sequence");
                        }
                        c14774a2.m42384b(((i38 >> 8) * 192) + (i38 & 255), 13);
                    }
                } catch (UnsupportedEncodingException e13) {
                    throw new WriterException(e13);
                }
            }
            i13 = i26;
        } else {
            i13 = 8;
            int length4 = str.length();
            int i39 = 0;
            while (i39 < length4) {
                int iCharAt = str.charAt(i39) - '0';
                int i44 = i39 + 2;
                if (i44 < length4) {
                    c14774a2.m42384b(((str.charAt(i39 + 1) - '0') * 10) + (iCharAt * 100) + (str.charAt(i44) - '0'), 10);
                    i39 += 3;
                } else {
                    i39++;
                    if (i39 < length4) {
                        c14774a2.m42384b((iCharAt * 10) + (str.charAt(i39) - '0'), 7);
                        i39 = i44;
                    } else {
                        c14774a2.m42384b(iCharAt, 4);
                    }
                }
            }
        }
        C20934b c20934b = C20934b.f78937d[0];
        int i45 = c14774a.f54788x;
        int i46 = c20934b.f78938a;
        int i47 = iArr2[i46 <= 9 ? (char) 0 : i46 <= 26 ? c3 : (char) 2] + i45 + c14774a2.f54788x;
        int i48 = c3;
        while (i48 <= 40) {
            C20934b[] c20934bArr = C20934b.f78937d;
            if (i48 <= 0 || i48 > 40) {
                throw new IllegalArgumentException();
            }
            C20934b c20934b2 = C20934b.f78937d[i48 - 1];
            char c16 = c15;
            int i49 = c20934b2.f78940c;
            C0904j c0904j = c20934b2.f78939b[AbstractC12682p.m35485e(c3)];
            int i54 = c0904j.f3301w;
            C4320k[] c4320kArr = (C4320k[]) c0904j.f3302x;
            int length5 = c4320kArr.length;
            int i55 = i25;
            int i56 = i55;
            while (i55 < length5) {
                i56 += c4320kArr[i55].f17541x;
                i55++;
            }
            if (i49 - (i56 * i54) >= (i47 + 7) / 8) {
                int i57 = c14774a.f54788x;
                int i58 = c20934b2.f78938a;
                int i59 = iArr2[i58 <= 9 ? i25 : i58 <= 26 ? c3 : 2] + i57 + c14774a2.f54788x;
                int i64 = c3;
                while (i64 <= 40) {
                    C20934b[] c20934bArr2 = C20934b.f78937d;
                    if (i64 <= 0 || i64 > 40) {
                        throw new IllegalArgumentException();
                    }
                    C20934b c20934b3 = C20934b.f78937d[i64 - 1];
                    int i65 = c20934b3.f78940c;
                    int i66 = c20934b3.f78938a;
                    C0904j[] c0904jArr = c20934b3.f78939b;
                    C0904j c0904j2 = c0904jArr[AbstractC12682p.m35485e(c3)];
                    int i67 = c0904j2.f3301w;
                    C4320k[] c4320kArr2 = (C4320k[]) c0904j2.f3302x;
                    int length6 = c4320kArr2.length;
                    int i68 = i25;
                    int i69 = i68;
                    while (i68 < length6) {
                        int i74 = i68;
                        i69 += c4320kArr2[i74].f17541x;
                        i68 = i74 + 1;
                    }
                    if (i65 - (i69 * i67) >= (i59 + 7) / 8) {
                        int i75 = c20934b3.f78940c;
                        ?? c14774a3 = new C14774a();
                        int i76 = c14774a.f54788x;
                        c14774a3.m42385c(i76);
                        for (int i77 = i25; i77 < i76; i77++) {
                            c14774a3.m42383a(c14774a.m42386d(i77));
                        }
                        int iM42387e = enumC20933a2 == enumC20933a ? c14774a2.m42387e() : str.length();
                        int i78 = iArr2[i66 <= 9 ? i25 : i66 <= 26 ? c3 : 2];
                        int i79 = c3 << i78;
                        if (iM42387e >= i79) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(iM42387e);
                            sb4.append(" is bigger than ");
                            sb4.append(i79 - 1);
                            throw new WriterException(sb4.toString());
                        }
                        c14774a3.m42384b(iM42387e, i78);
                        int i83 = c14774a2.f54788x;
                        c14774a3.m42385c(c14774a3.f54788x + i83);
                        for (int i84 = i25; i84 < i83; i84++) {
                            c14774a3.m42383a(c14774a2.m42386d(i84));
                        }
                        C0904j c0904j3 = c0904jArr[AbstractC12682p.m35485e(c3)];
                        int i85 = c0904j3.f3301w;
                        C4320k[] c4320kArr3 = (C4320k[]) c0904j3.f3302x;
                        int length7 = c4320kArr3.length;
                        int i86 = i25;
                        int i87 = i86;
                        while (i86 < length7) {
                            i87 += c4320kArr3[i86].f17541x;
                            i86++;
                        }
                        int i88 = i75 - (i87 * i85);
                        int i89 = i88 << 3;
                        if (c14774a3.f54788x > i89) {
                            throw new WriterException("data bits cannot fit in the QR Code" + c14774a3.f54788x + " > " + i89);
                        }
                        for (int i94 = i25; i94 < 4 && c14774a3.f54788x < i89; i94++) {
                            c14774a3.m42383a(i25);
                        }
                        ?? r14 = i25;
                        int i95 = c14774a3.f54788x & 7;
                        if (i95 > 0) {
                            for (int i96 = i13; i95 < i96; i96 = 8) {
                                c14774a3.m42383a(r14);
                                i95++;
                                r14 = 0;
                            }
                        }
                        int iM42387e2 = i88 - c14774a3.m42387e();
                        for (int i97 = 0; i97 < iM42387e2; i97++) {
                            c14774a3.m42384b((i97 & 1) == 0 ? 236 : 17, 8);
                        }
                        if (c14774a3.f54788x != i89) {
                            throw new WriterException("Bits size does not equal capacity");
                        }
                        int i98 = 0;
                        for (C4320k c4320k : c4320kArr3) {
                            i98 += c4320k.f17541x;
                        }
                        if (c14774a3.m42387e() != i88) {
                            throw new WriterException("Number of bits and data bytes does not match");
                        }
                        ArrayList arrayList = new ArrayList(i98);
                        int i99 = 0;
                        int i100 = 0;
                        int iMax = 0;
                        int iMax2 = 0;
                        while (i99 < i98) {
                            int i101 = c3;
                            int[] iArr3 = new int[i101];
                            int[] iArr4 = new int[i101];
                            if (i99 >= i98) {
                                r10 = c14774a3;
                                throw new WriterException("Block ID too large");
                            }
                            int i102 = i75 % i98;
                            int i103 = i98 - i102;
                            int i104 = i75 / i98;
                            int i105 = i88 / i98;
                            int i106 = i105 + 1;
                            int i107 = i104 - i105;
                            int i108 = i66;
                            int i109 = (i104 + 1) - i106;
                            if (i107 != i109) {
                                r10 = c14774a3;
                                throw new WriterException("EC bytes mismatch");
                            }
                            if (i98 != i103 + i102) {
                                r10 = c14774a3;
                                throw new WriterException("RS blocks mismatch");
                            }
                            if (i75 != ((i106 + i109) * i102) + ((i105 + i107) * i103)) {
                                r10 = c14774a3;
                                throw new WriterException("Total bytes mismatch");
                            }
                            if (i99 < i103) {
                                c7 = 0;
                                iArr3[0] = i105;
                                iArr4[0] = i107;
                            } else {
                                c7 = 0;
                                iArr3[0] = i106;
                                iArr4[0] = i109;
                            }
                            int i110 = iArr3[c7];
                            byte[] bArr = new byte[i110];
                            int i111 = i100 << 3;
                            int i112 = 0;
                            while (i112 < i110) {
                                int i113 = i99;
                                int i114 = i98;
                                int[] iArr5 = iArr3;
                                int i115 = 0;
                                for (int i116 = 0; i116 < 8; i116++) {
                                    if (r10.m42386d(i111)) {
                                        i115 |= 1 << (7 - i116);
                                    }
                                    i111++;
                                }
                                bArr[i112] = (byte) i115;
                                i112++;
                                i99 = i113;
                                i98 = i114;
                                iArr3 = iArr5;
                            }
                            int i117 = i99;
                            int i118 = i98;
                            int[] iArr6 = iArr3;
                            int i119 = iArr4[0];
                            int i120 = i110 + i119;
                            int[] iArr7 = new int[i120];
                            for (int i121 = 0; i121 < i110; i121++) {
                                iArr7[i121] = bArr[i121] & 255;
                            }
                            C16207a c16207a = C16207a.f61548g;
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(new C16208b(c16207a, new int[]{1}));
                            if (i119 == 0) {
                                throw new IllegalArgumentException("No error correction bytes");
                            }
                            int i122 = i120 - i119;
                            if (i122 <= 0) {
                                throw new IllegalArgumentException("No data bytes provided");
                            }
                            ?? r28 = r10;
                            if (i119 >= arrayList2.size()) {
                                C16208b c16208b4 = (C16208b) AbstractC25012a.m73371d(arrayList2, 1);
                                int size = arrayList2.size();
                                while (size <= i119) {
                                    int i123 = size;
                                    C20934b c20934b4 = c20934b3;
                                    int[] iArr8 = {1, c16207a.f61549a[(size - 1) + c16207a.f61554f]};
                                    if (iArr8[0] == 0) {
                                        i19 = i75;
                                        int i124 = 1;
                                        while (i124 < 2 && iArr8[i124] == 0) {
                                            i124++;
                                        }
                                        if (i124 == 2) {
                                            c14 = 0;
                                            iArr8 = new int[]{0};
                                        } else {
                                            c14 = 0;
                                            int i125 = 2 - i124;
                                            int[] iArr9 = new int[i125];
                                            System.arraycopy(iArr8, i124, iArr9, 0, i125);
                                            iArr8 = iArr9;
                                        }
                                    } else {
                                        i19 = i75;
                                        c14 = 0;
                                    }
                                    C16208b c16208b5 = c16208b4;
                                    C16207a c16207a2 = c16208b5.f61555a;
                                    if (!c16207a2.equals(c16207a)) {
                                        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                                    }
                                    if (c16208b5.m45882c() || iArr8[c14] == 0) {
                                        c16208b3 = c16207a2.f61551c;
                                    } else {
                                        int[] iArr10 = c16208b5.f61556b;
                                        int length8 = iArr10.length;
                                        int length9 = iArr8.length;
                                        int[] iArr11 = new int[(length8 + length9) - 1];
                                        int[] iArr12 = iArr8;
                                        int i126 = 0;
                                        while (i126 < length8) {
                                            int i127 = length8;
                                            int i128 = iArr10[i126];
                                            int i129 = i126;
                                            int i130 = 0;
                                            while (i130 < length9) {
                                                int i131 = i129 + i130;
                                                iArr11[i131] = iArr11[i131] ^ c16207a2.m45879a(i128, iArr12[i130]);
                                                i130++;
                                                length9 = length9;
                                            }
                                            i126 = i129 + 1;
                                            length8 = i127;
                                        }
                                        c16208b3 = new C16208b(c16207a2, iArr11);
                                    }
                                    arrayList2.add(c16208b3);
                                    size = i123 + 1;
                                    c16208b4 = c16208b3;
                                    c20934b3 = c20934b4;
                                    i75 = i19;
                                    i88 = i88;
                                    i100 = i100;
                                }
                            }
                            int i132 = i75;
                            int i133 = i88;
                            C20934b c20934b5 = c20934b3;
                            int i134 = i100;
                            C16208b c16208b6 = (C16208b) arrayList2.get(i119);
                            int[] iArr13 = new int[i122];
                            System.arraycopy(iArr7, 0, iArr13, 0, i122);
                            if (i122 == 0) {
                                throw new IllegalArgumentException();
                            }
                            if (i122 > 1 && iArr13[0] == 0) {
                                int i135 = 1;
                                while (i135 < i122 && iArr13[i135] == 0) {
                                    i135++;
                                }
                                if (i135 == i122) {
                                    iArr13 = new int[]{0};
                                } else {
                                    int i136 = i122 - i135;
                                    int[] iArr14 = new int[i136];
                                    System.arraycopy(iArr13, i135, iArr14, 0, i136);
                                    iArr13 = iArr14;
                                }
                            }
                            if (i119 < 0) {
                                throw new IllegalArgumentException();
                            }
                            int length10 = iArr13.length;
                            int[] iArr15 = new int[length10 + i119];
                            int i137 = 0;
                            while (i137 < length10) {
                                iArr15[i137] = c16207a.m45879a(iArr13[i137], 1);
                                i137++;
                                iArr13 = iArr13;
                            }
                            C16208b c16208b7 = new C16208b(c16207a, iArr15);
                            C16207a c16207a3 = c16208b6.f61555a;
                            int[] iArr16 = c16208b6.f61556b;
                            boolean zEquals = c16207a.equals(c16207a3);
                            C16208b c16208b8 = c16207a.f61551c;
                            if (!zEquals) {
                                throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                            }
                            if (c16208b6.m45882c()) {
                                throw new IllegalArgumentException("Divide by 0");
                            }
                            int i138 = iArr16[(iArr16.length - 1) - c16208b6.m45881b()];
                            if (i138 == 0) {
                                throw new ArithmeticException();
                            }
                            int i139 = c16207a.f61549a[(c16207a.f61552d - c16207a.f61550b[i138]) - 1];
                            C16208b c16208bM45880a = c16208b8;
                            while (true) {
                                i18 = i122;
                                if (c16208b7.m45881b() < c16208b6.m45881b() || c16208b7.m45882c()) {
                                    break;
                                }
                                int iM45881b = c16208b7.m45881b() - c16208b6.m45881b();
                                int iM45881b2 = c16208b7.m45881b();
                                int[] iArr17 = c16208b7.f61556b;
                                C16208b c16208b9 = c16208b8;
                                int iM45879a = c16207a.m45879a(iArr17[(iArr17.length - 1) - iM45881b2], i139);
                                C16207a c16207a4 = c16208b6.f61555a;
                                if (iM45881b < 0) {
                                    throw new IllegalArgumentException();
                                }
                                if (iM45879a == 0) {
                                    c16208b = c16207a4.f61551c;
                                } else {
                                    int length11 = iArr16.length;
                                    int[] iArr18 = new int[length11 + iM45881b];
                                    int i140 = 0;
                                    while (i140 < length11) {
                                        int i141 = i140;
                                        iArr18[i141] = c16207a4.m45879a(iArr16[i141], iM45879a);
                                        i140 = i141 + 1;
                                    }
                                    c16208b = new C16208b(c16207a4, iArr18);
                                }
                                if (iM45881b < 0) {
                                    throw new IllegalArgumentException();
                                }
                                if (iM45879a == 0) {
                                    c16208b2 = c16208b9;
                                } else {
                                    int[] iArr19 = new int[iM45881b + 1];
                                    iArr19[0] = iM45879a;
                                    c16208b2 = new C16208b(c16207a, iArr19);
                                }
                                c16208bM45880a = c16208bM45880a.m45880a(c16208b2);
                                c16208b7 = c16208b7.m45880a(c16208b);
                                i122 = i18;
                                c16208b8 = c16208b9;
                                c16208b6 = c16208b6;
                                i139 = i139;
                            }
                            int[] iArr20 = new C16208b[]{c16208bM45880a, c16208b7}[1].f61556b;
                            int length12 = i119 - iArr20.length;
                            for (int i142 = 0; i142 < length12; i142++) {
                                iArr7[i18 + i142] = 0;
                            }
                            System.arraycopy(iArr20, 0, iArr7, i18 + length12, iArr20.length);
                            byte[] bArr2 = new byte[i119];
                            for (int i143 = 0; i143 < i119; i143++) {
                                bArr2[i143] = (byte) iArr7[i110 + i143];
                            }
                            arrayList.add(new C21957a(bArr, bArr2));
                            iMax = Math.max(iMax, i110);
                            iMax2 = Math.max(iMax2, i119);
                            i100 = i134 + iArr6[0];
                            i99 = i117 + 1;
                            i98 = i118;
                            c20934b3 = c20934b5;
                            i66 = i108;
                            r10 = r28;
                            i75 = i132;
                            i88 = i133;
                            c3 = 1;
                        }
                        r10 = c14774a3;
                        int i144 = i75;
                        C20934b c20934b6 = c20934b3;
                        int i145 = i66;
                        if (i88 != i100) {
                            throw new WriterException("Data bytes does not match offset");
                        }
                        C14774a c14774a4 = new C14774a();
                        for (int i146 = 0; i146 < iMax; i146++) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                byte[] bArr3 = ((C21957a) it.next()).f84907a;
                                if (i146 < bArr3.length) {
                                    c14774a4.m42384b(bArr3[i146], 8);
                                }
                            }
                        }
                        for (int i147 = 0; i147 < iMax2; i147++) {
                            Iterator it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                byte[] bArr4 = ((C21957a) it3.next()).f84908b;
                                if (i147 < bArr4.length) {
                                    c14774a4.m42384b(bArr4[i147], 8);
                                }
                            }
                        }
                        if (i144 != c14774a4.m42387e()) {
                            StringBuilder sbM30466t = AbstractC11266d.m30466t(i144, "Interleaving error: ", " and ");
                            sbM30466t.append(c14774a4.m42387e());
                            sbM30466t.append(" differ.");
                            throw new WriterException(sbM30466t.toString());
                        }
                        int i148 = (i145 * 4) + 17;
                        C5020n c5020n = new C5020n(i148, i148);
                        int i149 = c5020n.f20932y;
                        int i150 = Integer.MAX_VALUE;
                        int i151 = 0;
                        int i152 = -1;
                        while (true) {
                            i14 = c5020n.f20931x;
                            if (i151 >= 8) {
                                break;
                            }
                            C20934b c20934b7 = c20934b6;
                            AbstractC21958b.m62681b(c14774a4, 1, c20934b7, i151, c5020n);
                            int iM62680a = AbstractC21958b.m62680a(c5020n, false) + AbstractC21958b.m62680a(c5020n, true);
                            byte[][] bArr5 = (byte[][]) c5020n.f20933z;
                            int i153 = 0;
                            for (int i154 = 0; i154 < i149 - 1; i154++) {
                                byte[] bArr6 = bArr5[i154];
                                int i155 = 0;
                                while (i155 < i14 - 1) {
                                    byte b6 = bArr6[i155];
                                    int i156 = i155 + 1;
                                    if (b6 == bArr6[i156]) {
                                        byte[] bArr7 = bArr5[i154 + 1];
                                        if (b6 == bArr7[i155] && b6 == bArr7[i156]) {
                                            i153++;
                                        }
                                    }
                                    i155 = i156;
                                }
                            }
                            int i157 = (i153 * 3) + iM62680a;
                            int i158 = 0;
                            int i159 = 0;
                            while (i158 < i149) {
                                int i160 = i159;
                                int i161 = 0;
                                while (i161 < i14) {
                                    byte[] bArr8 = bArr5[i158];
                                    int i162 = i161 + 6;
                                    if (i162 < i14) {
                                        i15 = i151;
                                        byte b8 = 1;
                                        if (bArr8[i161] == 1 && bArr8[i161 + 1] == 0 && bArr8[i161 + 2] == 1 && bArr8[i161 + 3] == 1 && bArr8[i161 + 4] == 1 && bArr8[i161 + 5] == 0 && bArr8[i162] == 1) {
                                            int iMax3 = Math.max(i161 - 4, 0);
                                            int iMin = Math.min(i161, bArr8.length);
                                            while (true) {
                                                if (iMax3 >= iMin) {
                                                    i16 = i161;
                                                    z14 = true;
                                                    break;
                                                }
                                                i16 = i161;
                                                if (bArr8[iMax3] == b8) {
                                                    z14 = false;
                                                    break;
                                                }
                                                iMax3++;
                                                i161 = i16;
                                                b8 = 1;
                                            }
                                            if (z14) {
                                                i160++;
                                            } else {
                                                int iMax4 = Math.max(i16 + 7, 0);
                                                int iMin2 = Math.min(i16 + 11, bArr8.length);
                                                while (true) {
                                                    if (iMax4 >= iMin2) {
                                                        z15 = true;
                                                        break;
                                                    }
                                                    if (bArr8[iMax4] == 1) {
                                                        z15 = false;
                                                        break;
                                                    }
                                                    iMax4++;
                                                }
                                                if (z15) {
                                                    i160++;
                                                }
                                            }
                                        }
                                        i17 = i158 + 6;
                                        if (i17 < i149) {
                                            byte b14 = 1;
                                            if (bArr5[i158][i16] != 1 && bArr5[i158 + 1][i16] == 0 && bArr5[i158 + 2][i16] == 1 && bArr5[i158 + 3][i16] == 1 && bArr5[i158 + 4][i16] == 1 && bArr5[i158 + 5][i16] == 0 && bArr5[i17][i16] == 1) {
                                                int iMax5 = Math.max(i158 - 4, 0);
                                                int iMin3 = Math.min(i158, bArr5.length);
                                                while (true) {
                                                    if (iMax5 >= iMin3) {
                                                        z4 = true;
                                                        break;
                                                    }
                                                    if (bArr5[iMax5][i16] == b14) {
                                                        z4 = false;
                                                        break;
                                                    }
                                                    iMax5++;
                                                    b14 = 1;
                                                }
                                                if (!z4) {
                                                    int iMax6 = Math.max(i158 + 7, 0);
                                                    int iMin4 = Math.min(i158 + 11, bArr5.length);
                                                    while (true) {
                                                        if (iMax6 >= iMin4) {
                                                            z13 = true;
                                                            break;
                                                        }
                                                        if (bArr5[iMax6][i16] == 1) {
                                                            z13 = false;
                                                            break;
                                                        }
                                                        iMax6++;
                                                    }
                                                    if (z13) {
                                                    }
                                                }
                                                i160++;
                                            }
                                        }
                                        i161 = i16 + 1;
                                        i151 = i15;
                                    } else {
                                        i15 = i151;
                                    }
                                    i16 = i161;
                                    i17 = i158 + 6;
                                    if (i17 < i149) {
                                        byte b15 = 1;
                                        if (bArr5[i158][i16] != 1) {
                                        }
                                    }
                                    i161 = i16 + 1;
                                    i151 = i15;
                                }
                                i158++;
                                i159 = i160;
                            }
                            int i163 = i151;
                            int i164 = (i159 * 40) + i157;
                            int i165 = 0;
                            int i166 = 0;
                            while (i165 < i149) {
                                byte[] bArr9 = bArr5[i165];
                                int i167 = i166;
                                for (int i168 = 0; i168 < i14; i168++) {
                                    if (bArr9[i168] == 1) {
                                        i167++;
                                    }
                                }
                                i165++;
                                i166 = i167;
                            }
                            int i169 = i14 * i149;
                            int iAbs = (((Math.abs((i166 << 1) - i169) * 10) / i169) * 10) + i164;
                            if (iAbs < i150) {
                                i150 = iAbs;
                                i152 = i163;
                            }
                            i151 = i163 + 1;
                            c20934b6 = c20934b7;
                        }
                        int i170 = 0;
                        AbstractC21958b.m62681b(c14774a4, 1, c20934b6, i152, c5020n);
                        int i171 = i14 + 8;
                        int i172 = i149 + 8;
                        int iMax7 = Math.max(512, i171);
                        int iMax8 = Math.max(512, i172);
                        int iMin5 = Math.min(iMax7 / i171, iMax8 / i172);
                        int i173 = (iMax7 - (i14 * iMin5)) / 2;
                        C14775b c14775b = new C14775b(iMax7, iMax8);
                        int i174 = (iMax8 - (i149 * iMin5)) / 2;
                        int i175 = 0;
                        while (i175 < i149) {
                            int i176 = i173;
                            int i177 = i170;
                            while (i177 < i14) {
                                if (c5020n.m15742j(i177, i175) == 1) {
                                    if (i174 < 0 || i176 < 0) {
                                        throw new IllegalArgumentException("Left and top must be nonnegative");
                                    }
                                    if (iMin5 <= 0 || iMin5 <= 0) {
                                        throw new IllegalArgumentException("Height and width must be at least 1");
                                    }
                                    int i178 = i176 + iMin5;
                                    int i179 = i174 + iMin5;
                                    if (i179 > c14775b.f54790x || i178 > c14775b.f54789w) {
                                        throw new IllegalArgumentException("The region must fit inside the matrix");
                                    }
                                    for (int i180 = i174; i180 < i179; i180++) {
                                        int i181 = c14775b.f54791y * i180;
                                        for (int i182 = i176; i182 < i178; i182++) {
                                            int i183 = (i182 / 32) + i181;
                                            int[] iArr21 = c14775b.f54792z;
                                            iArr21[i183] = iArr21[i183] | (1 << (i182 & 31));
                                        }
                                    }
                                }
                                i177++;
                                i176 += iMin5;
                            }
                            i175++;
                            i174 += iMin5;
                            i170 = 0;
                        }
                        return c14775b;
                    }
                    i64++;
                    i25 = 0;
                    i13 = 8;
                }
                throw new WriterException("Data too big");
            }
            i48++;
            c15 = c16;
            i25 = 0;
            i13 = 8;
        }
        throw new WriterException("Data too big");
    }
}
