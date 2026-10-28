package androidx.glance.appwidget.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;
import p097ds.AbstractC12314q;
import p108e4.AbstractC12667a;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.l1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1402l1 extends AbstractC12667a {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f5936f;

    public /* synthetic */ C1402l1(int i13) {
        this.f5936f = i13;
    }

    /* JADX INFO: renamed from: U */
    public static int m4436U(long j7, byte[] bArr, int i13, int i14) {
        if (i14 == 0) {
            AbstractC12667a abstractC12667a = AbstractC1408n1.f5948a;
            if (i13 > -12) {
                return -1;
            }
            return i13;
        }
        if (i14 == 1) {
            return AbstractC1408n1.m4488c(i13, AbstractC1399k1.m4414g(j7, bArr));
        }
        if (i14 == 2) {
            return AbstractC1408n1.m4489d(i13, AbstractC1399k1.m4414g(j7, bArr), AbstractC1399k1.m4414g(j7 + 1, bArr));
        }
        throw new AssertionError();
    }

    /* JADX WARN: Code duplicated, block: B:128:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x007d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x008a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0090  */
    /* JADX WARN: Code duplicated, block: B:45:0x009a  */
    /* JADX WARN: Code duplicated, block: B:46:0x009d  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ed  */
    @Override // p108e4.AbstractC12667a
    /* JADX INFO: renamed from: J */
    public final int mo4437J(byte[] bArr, int i13, int i14) {
        int i15;
        int i16;
        long j7;
        long j13;
        byte bM4414g;
        long j14;
        byte bM4414g2;
        long j15;
        int i17 = i13;
        switch (this.f5936f) {
            case 0:
                break;
            default:
                if ((i17 | i14 | (bArr.length - i14)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i17), Integer.valueOf(i14)));
                }
                long j16 = i17;
                int i18 = (int) (((long) i14) - j16);
                long j17 = 1;
                if (i18 < 16) {
                    i15 = 0;
                } else {
                    int i19 = 8 - (((int) j16) & 7);
                    long j18 = j16;
                    i15 = 0;
                    while (true) {
                        if (i15 < i19) {
                            long j19 = j18 + 1;
                            if (AbstractC1399k1.m4414g(j18, bArr) >= 0) {
                                i15++;
                                j18 = j19;
                            }
                        } else {
                            while (true) {
                                int i24 = i15 + 8;
                                if (i24 <= i18) {
                                    if ((AbstractC1399k1.f5928c.m4388h(AbstractC1399k1.f5931f + j18, bArr) & (-9187201950435737472L)) == 0) {
                                        j18 += 8;
                                        i15 = i24;
                                    }
                                }
                            }
                            while (true) {
                                if (i15 < i18) {
                                    long j24 = j18 + 1;
                                    if (AbstractC1399k1.m4414g(j18, bArr) >= 0) {
                                        i15++;
                                        j18 = j24;
                                    }
                                } else {
                                    i15 = i18;
                                }
                            }
                        }
                    }
                }
                int i25 = i18 - i15;
                long j25 = j16 + ((long) i15);
                while (true) {
                    byte bM4414g3 = 0;
                    while (i25 > 0) {
                        long j26 = j25 + j17;
                        bM4414g3 = AbstractC1399k1.m4414g(j25, bArr);
                        if (bM4414g3 >= 0) {
                            i25--;
                            j25 = j26;
                        } else {
                            j25 = j26;
                            if (i25 == 0) {
                                return 0;
                            }
                            i16 = i25 - 1;
                            if (bM4414g3 < -32) {
                                if (i16 == 0) {
                                    return bM4414g3;
                                }
                                i25 -= 2;
                                if (bM4414g3 >= -62) {
                                    j15 = j25 + j17;
                                    if (AbstractC1399k1.m4414g(j25, bArr) > -65) {
                                        j7 = j17;
                                        j25 = j15;
                                        j17 = j7;
                                    }
                                }
                            } else if (bM4414g3 < -16) {
                                j7 = j17;
                                if (i16 < 3) {
                                    return m4436U(j25, bArr, bM4414g3, i16);
                                }
                                i25 -= 4;
                                j13 = j25 + j7;
                                bM4414g = AbstractC1399k1.m4414g(j25, bArr);
                                if (bM4414g <= -65) {
                                    if ((((bM4414g + 112) + (bM4414g3 << 28)) >> 30) == 0) {
                                        j14 = 2 + j25;
                                        if (AbstractC1399k1.m4414g(j13, bArr) <= -65) {
                                            j25 += 3;
                                            if (AbstractC1399k1.m4414g(j14, bArr) > -65) {
                                                j17 = j7;
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (i16 < 2) {
                                    return m4436U(j25, bArr, bM4414g3, i16);
                                }
                                i25 -= 3;
                                j7 = j17;
                                long j27 = j25 + j7;
                                bM4414g2 = AbstractC1399k1.m4414g(j25, bArr);
                                if (bM4414g2 > -65 && ((bM4414g3 != -32 || bM4414g2 >= -96) && (bM4414g3 != -19 || bM4414g2 < -96))) {
                                    j25 += 2;
                                    if (AbstractC1399k1.m4414g(j27, bArr) <= -65) {
                                        j17 = j7;
                                    }
                                }
                            }
                        }
                    }
                    if (i25 == 0) {
                        return 0;
                    }
                    i16 = i25 - 1;
                    if (bM4414g3 < -32) {
                        if (i16 == 0) {
                            return bM4414g3;
                        }
                        i25 -= 2;
                        if (bM4414g3 >= -62) {
                            j15 = j25 + j17;
                            if (AbstractC1399k1.m4414g(j25, bArr) > -65) {
                                j7 = j17;
                                j25 = j15;
                                j17 = j7;
                            }
                        }
                    } else if (bM4414g3 < -16) {
                        j7 = j17;
                        if (i16 < 3) {
                            return m4436U(j25, bArr, bM4414g3, i16);
                        }
                        i25 -= 4;
                        j13 = j25 + j7;
                        bM4414g = AbstractC1399k1.m4414g(j25, bArr);
                        if (bM4414g <= -65) {
                            if ((((bM4414g + 112) + (bM4414g3 << 28)) >> 30) == 0) {
                                j14 = 2 + j25;
                                if (AbstractC1399k1.m4414g(j13, bArr) <= -65) {
                                    j25 += 3;
                                    if (AbstractC1399k1.m4414g(j14, bArr) > -65) {
                                        j17 = j7;
                                    }
                                }
                            }
                        }
                    } else {
                        if (i16 < 2) {
                            return m4436U(j25, bArr, bM4414g3, i16);
                        }
                        i25 -= 3;
                        j7 = j17;
                        long j28 = j25 + j7;
                        bM4414g2 = AbstractC1399k1.m4414g(j25, bArr);
                        if (bM4414g2 > -65) {
                        }
                    }
                }
                return -1;
        }
        while (i17 < i14 && bArr[i17] >= 0) {
            i17++;
        }
        if (i17 < i14) {
            while (i17 < i14) {
                int i26 = i17 + 1;
                byte b = bArr[i17];
                if (b < 0) {
                    if (b < -32) {
                        if (i26 >= i14) {
                            return b;
                        }
                        if (b >= -62) {
                            i17 += 2;
                            if (bArr[i26] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b < -16) {
                        if (i26 >= i14 - 1) {
                            return AbstractC1408n1.m4486a(bArr, i26, i14);
                        }
                        int i27 = i17 + 2;
                        byte b6 = bArr[i26];
                        if (b6 <= -65 && ((b != -32 || b6 >= -96) && (b != -19 || b6 < -96))) {
                            i17 += 3;
                            if (bArr[i27] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (i26 >= i14 - 2) {
                        return AbstractC1408n1.m4486a(bArr, i26, i14);
                    }
                    int i28 = i17 + 2;
                    byte b8 = bArr[i26];
                    if (b8 <= -65) {
                        if ((((b8 + 112) + (b << 28)) >> 30) == 0) {
                            int i29 = i17 + 3;
                            if (bArr[i28] <= -65) {
                                i17 += 4;
                                if (bArr[i29] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
                i17 = i26;
            }
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x004a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:26:0x005b A[LOOP:2: B:23:0x0055->B:26:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x006d  */
    /* JADX WARN: Code duplicated, block: B:44:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:81:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x008e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x006b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x012d A[SYNTHETIC] */
    @Override // p108e4.AbstractC12667a
    /* JADX INFO: renamed from: u */
    public final String mo4438u(byte[] bArr, int i13, int i14) throws InvalidProtocolBufferException {
        int i15;
        byte b;
        int i16;
        byte b6;
        byte b8;
        byte b14;
        switch (this.f5936f) {
            case 0:
                if ((i13 | i14 | ((bArr.length - i13) - i14)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i13), Integer.valueOf(i14)));
                }
                int i17 = i13 + i14;
                char[] cArr = new char[i14];
                int i18 = 0;
                while (i13 < i17) {
                    byte b15 = bArr[i13];
                    if (b15 < 0) {
                        while (i13 < i17) {
                            i15 = i13 + 1;
                            b = bArr[i13];
                            if (b < 0) {
                                i16 = i18 + 1;
                                cArr[i18] = (char) b;
                                while (i15 < i17) {
                                    b6 = bArr[i15];
                                    if (b6 >= 0) {
                                        i15++;
                                        cArr[i16] = (char) b6;
                                        i16++;
                                    } else {
                                        i18 = i16;
                                        i13 = i15;
                                    }
                                }
                                i18 = i16;
                                i13 = i15;
                            } else if (b < -32) {
                                if (i15 < i17) {
                                    throw InvalidProtocolBufferException.m4262b();
                                }
                                i13 += 2;
                                byte b16 = bArr[i15];
                                int i19 = i18 + 1;
                                if (b >= -62 || AbstractC12314q.m34310B(b16)) {
                                    throw InvalidProtocolBufferException.m4262b();
                                }
                                cArr[i18] = (char) ((b16 & 63) | ((b & 31) << 6));
                                i18 = i19;
                            } else {
                                if (b >= -16) {
                                    if (i15 < i17 - 2) {
                                        throw InvalidProtocolBufferException.m4262b();
                                    }
                                    b14 = bArr[i15];
                                    int i24 = i13 + 3;
                                    byte b17 = bArr[i13 + 2];
                                    i13 += 4;
                                    byte b18 = bArr[i24];
                                    int i25 = i18 + 1;
                                    if (!AbstractC12314q.m34310B(b14)) {
                                        if ((((b14 + 112) + (b << 28)) >> 30) != 0 && !AbstractC12314q.m34310B(b17) && !AbstractC12314q.m34310B(b18)) {
                                            int i26 = ((b14 & 63) << 12) | ((b & 7) << 18) | ((b17 & 63) << 6) | (b18 & 63);
                                            cArr[i18] = (char) ((i26 >>> 10) + 55232);
                                            cArr[i25] = (char) ((i26 & 1023) + 56320);
                                            i18 += 2;
                                        }
                                    }
                                    throw InvalidProtocolBufferException.m4262b();
                                }
                                if (i15 < i17 - 1) {
                                    throw InvalidProtocolBufferException.m4262b();
                                }
                                int i27 = i13 + 2;
                                b8 = bArr[i15];
                                i13 += 3;
                                byte b19 = bArr[i27];
                                int i28 = i18 + 1;
                                if (!AbstractC12314q.m34310B(b8) || ((b == -32 && b8 < -96) || ((b == -19 && b8 >= -96) || AbstractC12314q.m34310B(b19)))) {
                                    throw InvalidProtocolBufferException.m4262b();
                                }
                                cArr[i18] = (char) (((b8 & 63) << 6) | ((b & 15) << 12) | (b19 & 63));
                                i18 = i28;
                            }
                        }
                        return new String(cArr, 0, i18);
                    }
                    i13++;
                    cArr[i18] = (char) b15;
                    i18++;
                }
                while (i13 < i17) {
                    i15 = i13 + 1;
                    b = bArr[i13];
                    if (b < 0) {
                        if (b < -32) {
                            if (i15 < i17) {
                                throw InvalidProtocolBufferException.m4262b();
                            }
                            i13 += 2;
                            byte b110 = bArr[i15];
                            int i110 = i18 + 1;
                            if (b >= -62) {
                            }
                            throw InvalidProtocolBufferException.m4262b();
                        }
                        if (b >= -16) {
                            if (i15 < i17 - 1) {
                                throw InvalidProtocolBufferException.m4262b();
                            }
                            int i29 = i13 + 2;
                            b8 = bArr[i15];
                            i13 += 3;
                            byte b111 = bArr[i29];
                            int i210 = i18 + 1;
                            if (AbstractC12314q.m34310B(b8)) {
                            }
                            throw InvalidProtocolBufferException.m4262b();
                        }
                        if (i15 < i17 - 2) {
                            throw InvalidProtocolBufferException.m4262b();
                        }
                        b14 = bArr[i15];
                        int i211 = i13 + 3;
                        byte b112 = bArr[i13 + 2];
                        i13 += 4;
                        byte b113 = bArr[i211];
                        int i212 = i18 + 1;
                        if (!AbstractC12314q.m34310B(b14)) {
                            if ((((b14 + 112) + (b << 28)) >> 30) != 0) {
                            }
                        }
                        throw InvalidProtocolBufferException.m4262b();
                    }
                    i16 = i18 + 1;
                    cArr[i18] = (char) b;
                    while (i15 < i17) {
                        b6 = bArr[i15];
                        if (b6 >= 0) {
                            i15++;
                            cArr[i16] = (char) b6;
                            i16++;
                        } else {
                            i18 = i16;
                            i13 = i15;
                        }
                    }
                    i18 = i16;
                    i13 = i15;
                }
                return new String(cArr, 0, i18);
            default:
                Charset charset = AbstractC1383f0.f5887a;
                String str = new String(bArr, i13, i14, charset);
                if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i13, i14 + i13))) {
                    throw InvalidProtocolBufferException.m4262b();
                }
                return str;
        }
    }

    @Override // p108e4.AbstractC12667a
    /* JADX INFO: renamed from: v */
    public final int mo4439v(String str, byte[] bArr, int i13, int i14) {
        int i15;
        int i16;
        char cCharAt;
        long j7;
        char c3;
        long j13;
        long j14;
        char c7;
        int i17;
        char cCharAt2;
        switch (this.f5936f) {
            case 0:
                int length = str.length();
                int i18 = i14 + i13;
                int i19 = 0;
                while (i19 < length && (i16 = i19 + i13) < i18 && (cCharAt = str.charAt(i19)) < 128) {
                    bArr[i16] = (byte) cCharAt;
                    i19++;
                }
                if (i19 == length) {
                    return i13 + length;
                }
                int i24 = i13 + i19;
                while (i19 < length) {
                    char cCharAt3 = str.charAt(i19);
                    if (cCharAt3 < 128 && i24 < i18) {
                        bArr[i24] = (byte) cCharAt3;
                        i24++;
                    } else if (cCharAt3 < 2048 && i24 <= i18 - 2) {
                        int i25 = i24 + 1;
                        bArr[i24] = (byte) ((cCharAt3 >>> 6) | 960);
                        i24 += 2;
                        bArr[i25] = (byte) ((cCharAt3 & '?') | 128);
                    } else {
                        if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || i24 > i18 - 3) {
                            if (i24 > i18 - 4) {
                                if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i15 = i19 + 1) == str.length() || !Character.isSurrogatePair(cCharAt3, str.charAt(i15)))) {
                                    throw new C1405m1(i19, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt3 + " at index " + i24);
                            }
                            int i26 = i19 + 1;
                            if (i26 != str.length()) {
                                char cCharAt4 = str.charAt(i26);
                                if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                    int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                    bArr[i24] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i24 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i27 = i24 + 3;
                                    bArr[i24 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i24 += 4;
                                    bArr[i27] = (byte) ((codePoint & 63) | 128);
                                    i19 = i26;
                                } else {
                                    i19 = i26;
                                }
                            }
                            throw new C1405m1(i19 - 1, length);
                        }
                        bArr[i24] = (byte) ((cCharAt3 >>> '\f') | 480);
                        int i28 = i24 + 2;
                        bArr[i24 + 1] = (byte) (((cCharAt3 >>> 6) & 63) | 128);
                        i24 += 3;
                        bArr[i28] = (byte) ((cCharAt3 & '?') | 128);
                    }
                    i19++;
                }
                return i24;
            default:
                long j15 = i13;
                long j16 = ((long) i14) + j15;
                int length2 = str.length();
                if (length2 > i14 || bArr.length - i14 < i13) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i13 + i14));
                }
                int i29 = 0;
                while (true) {
                    j7 = 1;
                    c3 = 128;
                    if (i29 < length2 && (cCharAt2 = str.charAt(i29)) < 128) {
                        AbstractC1399k1.m4418k(bArr, j15, (byte) cCharAt2);
                        i29++;
                        j15 = 1 + j15;
                    }
                }
                if (i29 == length2) {
                    return (int) j15;
                }
                while (i29 < length2) {
                    char cCharAt5 = str.charAt(i29);
                    if (cCharAt5 < c3 && j15 < j16) {
                        AbstractC1399k1.m4418k(bArr, j15, (byte) cCharAt5);
                        c7 = c3;
                        j13 = j7;
                        j14 = j15 + j7;
                    } else if (cCharAt5 >= 2048 || j15 > j16 - 2) {
                        j13 = j7;
                        if ((cCharAt5 >= 55296 && 57343 >= cCharAt5) || j15 > j16 - 3) {
                            long j17 = j15;
                            if (j17 > j16 - 4) {
                                if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i17 = i29 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i17)))) {
                                    throw new C1405m1(i29, length2);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt5 + " at index " + j17);
                            }
                            int i34 = i29 + 1;
                            if (i34 != length2) {
                                char cCharAt6 = str.charAt(i34);
                                if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                    int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                    AbstractC1399k1.m4418k(bArr, j17, (byte) ((codePoint2 >>> 18) | 240));
                                    c7 = 128;
                                    AbstractC1399k1.m4418k(bArr, j17 + j13, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                    AbstractC1399k1.m4418k(bArr, j17 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                    AbstractC1399k1.m4418k(bArr, j17 + 3, (byte) ((codePoint2 & 63) | 128));
                                    j14 = j17 + 4;
                                    i29 = i34;
                                } else {
                                    i29 = i34;
                                }
                            }
                            throw new C1405m1(i29 - 1, length2);
                        }
                        AbstractC1399k1.m4418k(bArr, j15, (byte) ((cCharAt5 >>> '\f') | 480));
                        long j18 = j15;
                        AbstractC1399k1.m4418k(bArr, j15 + j13, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                        j14 = j18 + 3;
                        AbstractC1399k1.m4418k(bArr, j18 + 2, (byte) ((cCharAt5 & '?') | 128));
                        c7 = 128;
                    } else {
                        j13 = j7;
                        AbstractC1399k1.m4418k(bArr, j15, (byte) ((cCharAt5 >>> 6) | 960));
                        AbstractC1399k1.m4418k(bArr, j15 + j13, (byte) ((cCharAt5 & '?') | c3));
                        j14 = j15 + 2;
                        c7 = c3;
                    }
                    i29++;
                    c3 = c7;
                    j15 = j14;
                    j7 = j13;
                }
                return (int) j15;
        }
    }
}
