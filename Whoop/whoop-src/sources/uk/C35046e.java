package uk;

import al.C0960g;
import al.InterfaceC0955b;
import android.graphics.Bitmap;
import android.util.Log;
import com.google.crypto.tink.internal.C5101l0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import no.nordicsemi.android.dfu.DfuBaseService;

/* JADX INFO: renamed from: uk.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C35046e implements InterfaceC35042a {

    /* JADX INFO: renamed from: a */
    public int[] f148517a;

    /* JADX INFO: renamed from: c */
    public final C5101l0 f148519c;

    /* JADX INFO: renamed from: d */
    public ByteBuffer f148520d;

    /* JADX INFO: renamed from: e */
    public byte[] f148521e;

    /* JADX INFO: renamed from: f */
    public short[] f148522f;

    /* JADX INFO: renamed from: g */
    public byte[] f148523g;

    /* JADX INFO: renamed from: h */
    public byte[] f148524h;

    /* JADX INFO: renamed from: i */
    public byte[] f148525i;

    /* JADX INFO: renamed from: j */
    public final int[] f148526j;

    /* JADX INFO: renamed from: k */
    public int f148527k;

    /* JADX INFO: renamed from: l */
    public C35044c f148528l;

    /* JADX INFO: renamed from: m */
    public Bitmap f148529m;

    /* JADX INFO: renamed from: n */
    public final boolean f148530n;

    /* JADX INFO: renamed from: o */
    public int f148531o;

    /* JADX INFO: renamed from: p */
    public final int f148532p;

    /* JADX INFO: renamed from: q */
    public final int f148533q;

    /* JADX INFO: renamed from: r */
    public final int f148534r;

    /* JADX INFO: renamed from: s */
    public Boolean f148535s;

    /* JADX INFO: renamed from: b */
    public final int[] f148518b = new int[256];

    /* JADX INFO: renamed from: t */
    public Bitmap.Config f148536t = Bitmap.Config.ARGB_8888;

    public C35046e(C5101l0 c5101l0, C35044c c35044c, ByteBuffer byteBuffer, int i13) {
        this.f148519c = c5101l0;
        this.f148528l = new C35044c();
        synchronized (this) {
            try {
                if (i13 <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i13);
                }
                int iHighestOneBit = Integer.highestOneBit(i13);
                this.f148531o = 0;
                this.f148528l = c35044c;
                this.f148527k = -1;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f148520d = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                this.f148520d.order(ByteOrder.LITTLE_ENDIAN);
                this.f148530n = false;
                Iterator it = c35044c.f148506e.iterator();
                while (it.hasNext()) {
                    if (((C35043b) it.next()).f148497g == 3) {
                        this.f148530n = true;
                        break;
                    }
                }
                this.f148532p = iHighestOneBit;
                int i14 = c35044c.f148507f;
                this.f148534r = i14 / iHighestOneBit;
                int i15 = c35044c.f148508g;
                this.f148533q = i15 / iHighestOneBit;
                this.f148525i = (byte[]) ((C0960g) this.f148519c.f21444y).m2444c(i14 * i15, byte[].class);
                this.f148526j = (int[]) ((C0960g) this.f148519c.f21444y).m2444c(this.f148534r * this.f148533q, int[].class);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m110776a() {
        this.f148527k = (this.f148527k + 1) % this.f148528l.f148504c;
    }

    /* JADX INFO: renamed from: b */
    public final Bitmap m110777b() {
        Boolean bool = this.f148535s;
        Bitmap bitmapMo2432e = ((InterfaceC0955b) this.f148519c.f21443x).mo2432e(this.f148534r, this.f148533q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f148536t);
        bitmapMo2432e.setHasAlpha(true);
        return bitmapMo2432e;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized Bitmap m110778c() {
        try {
            if (this.f148528l.f148504c <= 0 || this.f148527k < 0) {
                if (Log.isLoggable("e", 3)) {
                    Log.d("e", "Unable to decode frame, frameCount=" + this.f148528l.f148504c + ", framePointer=" + this.f148527k);
                }
                this.f148531o = 1;
            }
            int i13 = this.f148531o;
            if (i13 != 1 && i13 != 2) {
                this.f148531o = 0;
                if (this.f148521e == null) {
                    this.f148521e = (byte[]) ((C0960g) this.f148519c.f21444y).m2444c(255, byte[].class);
                }
                C35043b c35043b = (C35043b) this.f148528l.f148506e.get(this.f148527k);
                int i14 = this.f148527k - 1;
                C35043b c35043b2 = i14 >= 0 ? (C35043b) this.f148528l.f148506e.get(i14) : null;
                int[] iArr = c35043b.f148501k;
                if (iArr == null) {
                    iArr = this.f148528l.f148502a;
                }
                this.f148517a = iArr;
                if (iArr == null) {
                    if (Log.isLoggable("e", 3)) {
                        Log.d("e", "No valid color table found for frame #" + this.f148527k);
                    }
                    this.f148531o = 1;
                    return null;
                }
                if (c35043b.f148496f) {
                    System.arraycopy(iArr, 0, this.f148518b, 0, iArr.length);
                    int[] iArr2 = this.f148518b;
                    this.f148517a = iArr2;
                    iArr2[c35043b.f148498h] = 0;
                    if (c35043b.f148497g == 2 && this.f148527k == 0) {
                        this.f148535s = Boolean.TRUE;
                    }
                }
                return m110780e(c35043b, c35043b2);
            }
            if (Log.isLoggable("e", 3)) {
                Log.d("e", "Unable to decode frame, status=" + this.f148531o);
            }
            return null;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m110779d(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f148536t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:94:0x01d7 A[PHI: r5
      0x01d7: PHI (r5v44 int) = (r5v38 int), (r5v46 int), (r5v46 int) binds: [B:89:0x01c3, B:91:0x01ce, B:92:0x01d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v31, types: [short] */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX INFO: renamed from: e */
    public final Bitmap m110780e(C35043b c35043b, C35043b c35043b2) {
        byte b;
        int i13;
        int i14;
        int i15;
        int[] iArr;
        int i16;
        int i17;
        short s13;
        int i18;
        Bitmap bitmap;
        int i19;
        C5101l0 c5101l0 = this.f148519c;
        byte b6 = 0;
        int[] iArr2 = this.f148526j;
        if (c35043b2 == null) {
            Bitmap bitmap2 = this.f148529m;
            if (bitmap2 != null) {
                ((InterfaceC0955b) c5101l0.f21443x).mo2433h(bitmap2);
            }
            this.f148529m = null;
            Arrays.fill(iArr2, 0);
        }
        if (c35043b2 != null && c35043b2.f148497g == 3 && this.f148529m == null) {
            Arrays.fill(iArr2, 0);
        }
        if (c35043b2 != null && (i18 = c35043b2.f148497g) > 0) {
            if (i18 == 2) {
                if (c35043b.f148496f) {
                    i19 = 0;
                } else {
                    C35044c c35044c = this.f148528l;
                    i19 = c35044c.f148512k;
                    if (c35043b.f148501k != null && c35044c.f148511j == c35043b.f148498h) {
                        i19 = 0;
                    }
                }
                int i24 = c35043b2.f148494d;
                int i25 = this.f148532p;
                int i26 = i24 / i25;
                int i27 = c35043b2.f148492b / i25;
                int i28 = c35043b2.f148493c / i25;
                int i29 = c35043b2.f148491a / i25;
                int i34 = this.f148534r;
                int i35 = (i27 * i34) + i29;
                int i36 = (i26 * i34) + i35;
                while (i35 < i36) {
                    int i37 = i35 + i28;
                    for (int i38 = i35; i38 < i37; i38++) {
                        iArr2[i38] = i19;
                    }
                    i35 += this.f148534r;
                }
            } else if (i18 == 3 && (bitmap = this.f148529m) != null) {
                int i39 = this.f148533q;
                int i44 = this.f148534r;
                bitmap.getPixels(iArr2, 0, i44, 0, 0, i44, i39);
            }
        }
        this.f148520d.position(c35043b.f148500j);
        int i45 = c35043b.f148493c * c35043b.f148494d;
        byte[] bArr = this.f148525i;
        if (bArr == null || bArr.length < i45) {
            this.f148525i = (byte[]) ((C0960g) c5101l0.f21444y).m2444c(i45, byte[].class);
        }
        byte[] bArr2 = this.f148525i;
        if (this.f148522f == null) {
            this.f148522f = new short[4096];
        }
        short[] sArr = this.f148522f;
        if (this.f148523g == null) {
            this.f148523g = new byte[4096];
        }
        byte[] bArr3 = this.f148523g;
        if (this.f148524h == null) {
            this.f148524h = new byte[DfuBaseService.ERROR_FILE_NOT_FOUND];
        }
        byte[] bArr4 = this.f148524h;
        int i46 = this.f148520d.get() & 255;
        int i47 = 1;
        int i48 = 1 << i46;
        int i49 = i48 + 1;
        int i54 = i48 + 2;
        int i55 = i46 + 1;
        int i56 = (1 << i55) - 1;
        int i57 = 0;
        while (i57 < i48) {
            sArr[i57] = 0;
            bArr3[i57] = (byte) i57;
            i57++;
            i47 = i47;
        }
        int i58 = i47;
        byte[] bArr5 = this.f148521e;
        int i59 = 0;
        int i64 = 0;
        int i65 = 0;
        int i66 = 0;
        int i67 = 0;
        int i68 = 0;
        int i69 = 0;
        int i74 = 0;
        int i75 = i55;
        int i76 = i54;
        int i77 = i56;
        int i78 = -1;
        while (true) {
            if (i59 >= i45) {
                iArr2 = iArr2;
                b = b6;
                break;
            }
            if (i64 == 0) {
                i17 = -1;
                int i79 = this.f148520d.get() & 255;
                if (i79 > 0) {
                    ByteBuffer byteBuffer = this.f148520d;
                    byteBuffer.get(this.f148521e, 0, Math.min(i79, byteBuffer.remaining()));
                }
                if (i79 <= 0) {
                    this.f148531o = 3;
                    b = 0;
                    break;
                }
                i64 = i79;
                i65 = 0;
            } else {
                sArr = sArr;
                iArr2 = iArr2;
                i17 = -1;
            }
            i67 += (bArr5[i65] & 255) << i66;
            i65++;
            i64--;
            i66 += 8;
            i76 = i76;
            int i83 = i75;
            i78 = i78;
            i69 = i69;
            while (true) {
                i66 = i66;
                if (i66 < i83) {
                    i75 = i83;
                    b6 = 0;
                    break;
                }
                int i84 = i67 & i77;
                i67 >>= i83;
                i66 -= i83;
                if (i84 == i48) {
                    i83 = i55;
                    i76 = i54;
                    i77 = i56;
                    i66 = i66;
                    i78 = i17;
                } else {
                    if (i84 == i49) {
                        i75 = i83;
                        b6 = 0;
                        break;
                    }
                    int i85 = i83;
                    if (i78 == i17) {
                        bArr2[i68] = bArr3[i84];
                        i68++;
                        i59++;
                        i78 = i84;
                        i69 = i78;
                        i83 = i85;
                    } else {
                        if (i84 >= i76) {
                            bArr4[i74] = (byte) i69;
                            i74++;
                            s13 = i78;
                        } else {
                            s13 = i84;
                        }
                        while (s13 >= i48) {
                            bArr4[i74] = bArr3[s13];
                            i74++;
                            s13 = sArr[s13];
                        }
                        i69 = bArr3[s13] & 255;
                        byte b8 = (byte) i69;
                        bArr2[i68] = b8;
                        while (true) {
                            i68++;
                            i59++;
                            if (i74 <= 0) {
                                break;
                            }
                            i74--;
                            bArr2[i68] = bArr4[i74];
                        }
                        if (i76 < 4096) {
                            sArr[i76] = (short) i78;
                            bArr3[i76] = b8;
                            i76++;
                            if ((i76 & i77) != 0 || i76 >= 4096) {
                                i83 = i85;
                            } else {
                                i83 = i85 + 1;
                                i77 += i76;
                            }
                        } else {
                            i83 = i85;
                        }
                        i78 = i84;
                    }
                    i17 = -1;
                }
            }
        }
        Arrays.fill(bArr2, i68, i45, b);
        if (c35043b.f148495e || this.f148532p != i58) {
            int i86 = c35043b.f148494d;
            int i87 = this.f148532p;
            int i88 = i86 / i87;
            int i89 = c35043b.f148492b / i87;
            int i94 = c35043b.f148493c / i87;
            int i95 = c35043b.f148491a / i87;
            boolean z4 = this.f148527k == 0;
            byte[] bArr6 = this.f148525i;
            int[] iArr3 = this.f148517a;
            Boolean bool = this.f148535s;
            int i96 = 8;
            int i97 = 0;
            int i98 = 1;
            int i99 = 0;
            while (i99 < i88) {
                if (c35043b.f148495e) {
                    if (i97 >= i88) {
                        i98++;
                        if (i98 == 2) {
                            i97 = 4;
                        } else if (i98 == 3) {
                            i96 = 4;
                            i97 = 2;
                        } else if (i98 == 4) {
                            i97 = 1;
                            i96 = 2;
                        }
                    }
                    i13 = i97 + i96;
                } else {
                    i13 = i97;
                    i97 = i99;
                }
                int i100 = i97 + i89;
                int i101 = i88;
                boolean z13 = i87 == 1;
                if (i100 < this.f148533q) {
                    int i102 = this.f148534r;
                    int i103 = i100 * i102;
                    int i104 = i103 + i95;
                    int i105 = i104 + i94;
                    int i106 = i103 + i102;
                    if (i106 < i105) {
                        i105 = i106;
                    }
                    i14 = i87;
                    int i107 = i99 * i87 * c35043b.f148493c;
                    int[] iArr4 = this.f148526j;
                    if (z13) {
                        int i108 = i104;
                        while (i108 < i105) {
                            int i109 = i108;
                            int i110 = iArr3[bArr6[i107] & 255];
                            if (i110 != 0) {
                                iArr4[i109] = i110;
                            } else if (z4 && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i107 += i14;
                            i108 = i109 + 1;
                        }
                    } else {
                        int i111 = ((i105 - i104) * i14) + i107;
                        int i112 = i104;
                        while (i112 < i105) {
                            int i113 = i105;
                            int i114 = c35043b.f148493c;
                            int i115 = i112;
                            int i116 = i107;
                            int i117 = 0;
                            int i118 = 0;
                            int i119 = 0;
                            int i120 = 0;
                            int i121 = 0;
                            while (true) {
                                if (i116 >= this.f148532p + i107) {
                                    i15 = i94;
                                    break;
                                }
                                byte[] bArr7 = this.f148525i;
                                i15 = i94;
                                if (i116 >= bArr7.length || i116 >= i111) {
                                    break;
                                }
                                int i122 = this.f148517a[bArr7[i116] & 255];
                                if (i122 != 0) {
                                    i117 += (i122 >> 24) & 255;
                                    i118 += (i122 >> 16) & 255;
                                    i119 += (i122 >> 8) & 255;
                                    i120 += i122 & 255;
                                    i121++;
                                }
                                i116++;
                                i94 = i15;
                            }
                            int i123 = i107 + i114;
                            int i124 = i123;
                            while (i124 < this.f148532p + i123) {
                                byte[] bArr8 = this.f148525i;
                                int i125 = i123;
                                if (i124 >= bArr8.length || i124 >= i111) {
                                    break;
                                }
                                int i126 = this.f148517a[bArr8[i124] & 255];
                                if (i126 != 0) {
                                    i117 += (i126 >> 24) & 255;
                                    i118 += (i126 >> 16) & 255;
                                    i119 += (i126 >> 8) & 255;
                                    i120 += i126 & 255;
                                    i121++;
                                }
                                i124++;
                                i123 = i125;
                            }
                            int i127 = i121 == 0 ? 0 : ((i117 / i121) << 24) | ((i118 / i121) << 16) | ((i119 / i121) << 8) | (i120 / i121);
                            if (i127 != 0) {
                                iArr4[i115] = i127;
                            } else if (z4 && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i107 += i14;
                            i112 = i115 + 1;
                            i105 = i113;
                            i94 = i15;
                        }
                    }
                    i99++;
                    i97 = i13;
                    i88 = i101;
                    i89 = i89;
                    i87 = i14;
                    i94 = i94;
                } else {
                    i14 = i87;
                }
                i99++;
                i97 = i13;
                i88 = i101;
                i89 = i89;
                i87 = i14;
                i94 = i94;
            }
            if (this.f148535s == null) {
                this.f148535s = Boolean.valueOf(bool == null ? false : bool.booleanValue());
            }
        } else {
            int i128 = c35043b.f148494d;
            int i129 = c35043b.f148492b;
            int i130 = c35043b.f148493c;
            int i131 = c35043b.f148491a;
            byte b14 = this.f148527k == 0 ? (byte) 1 : b;
            byte[] bArr9 = this.f148525i;
            int[] iArr5 = this.f148517a;
            byte b15 = -1;
            for (int i132 = b; i132 < i128; i132++) {
                int i133 = this.f148534r;
                int i134 = (i132 + i129) * i133;
                int i135 = i134 + i131;
                int i136 = i135 + i130;
                int i137 = i134 + i133;
                if (i137 < i136) {
                    i136 = i137;
                }
                int i138 = c35043b.f148493c * i132;
                while (i135 < i136) {
                    byte b16 = bArr9[i138];
                    int i139 = b16 & 255;
                    if (i139 != b15) {
                        int i140 = iArr5[i139];
                        if (i140 != 0) {
                            this.f148526j[i135] = i140;
                        } else {
                            b15 = b16;
                        }
                    }
                    i138++;
                    i135++;
                }
            }
            Boolean bool2 = this.f148535s;
            this.f148535s = Boolean.valueOf((bool2 != null && bool2.booleanValue()) || !(this.f148535s != null || b14 == 0 || b15 == -1));
        }
        if (this.f148530n && ((i16 = c35043b.f148497g) == 0 || i16 == 1)) {
            if (this.f148529m == null) {
                this.f148529m = m110777b();
            }
            Bitmap bitmap3 = this.f148529m;
            int i141 = this.f148533q;
            int i142 = this.f148534r;
            iArr = iArr2;
            bitmap3.setPixels(iArr, 0, i142, 0, 0, i142, i141);
        } else {
            iArr = iArr2;
        }
        Bitmap bitmapM110777b = m110777b();
        int i143 = this.f148533q;
        int i144 = this.f148534r;
        bitmapM110777b.setPixels(iArr, 0, i144, 0, 0, i144, i143);
        return bitmapM110777b;
    }
}
