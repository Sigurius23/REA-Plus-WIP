package p686zn;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import androidx.health.platform.client.proto.C1533u;
import p309lo.AbstractC24567y;
import p309lo.C24561s;
import sa.C32316b;
import sa.C32322h;

/* JADX INFO: renamed from: zn.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C40902f {

    /* JADX INFO: renamed from: h */
    public static final byte[] f176247h = {0, 7, 8, 15};

    /* JADX INFO: renamed from: i */
    public static final byte[] f176248i = {0, 119, -120, -1};

    /* JADX INFO: renamed from: j */
    public static final byte[] f176249j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: a */
    public final Paint f176250a;

    /* JADX INFO: renamed from: b */
    public final Paint f176251b;

    /* JADX INFO: renamed from: c */
    public final Canvas f176252c;

    /* JADX INFO: renamed from: d */
    public final C32316b f176253d;

    /* JADX INFO: renamed from: e */
    public final C40897a f176254e;

    /* JADX INFO: renamed from: f */
    public final C32322h f176255f;

    /* JADX INFO: renamed from: g */
    public Bitmap f176256g;

    public C40902f(int i13, int i14) {
        Paint paint = new Paint();
        this.f176250a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f176251b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f176252c = new Canvas();
        this.f176253d = new C32316b(719, 575, 0, 719, 0, 575);
        this.f176254e = new C40897a(0, new int[]{0, -1, -16777216, -8421505}, m132555b(), m132556c());
        this.f176255f = new C32322h(i13, i14, 1);
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m132554a(int i13, int i14, C24561s c24561s) {
        byte[] bArr = new byte[i13];
        for (int i15 = 0; i15 < i13; i15++) {
            bArr[i15] = (byte) c24561s.m71632i(i14);
        }
        return bArr;
    }

    /* JADX INFO: renamed from: b */
    public static int[] m132555b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i13 = 1; i13 < 16; i13++) {
            if (i13 < 8) {
                iArr[i13] = m132557d(255, (i13 & 1) != 0 ? 255 : 0, (i13 & 2) != 0 ? 255 : 0, (i13 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i13] = m132557d(255, (i13 & 1) != 0 ? 127 : 0, (i13 & 2) != 0 ? 127 : 0, (i13 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: c */
    public static int[] m132556c() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i13 = 0; i13 < 256; i13++) {
            if (i13 < 8) {
                iArr[i13] = m132557d(63, (i13 & 1) != 0 ? 255 : 0, (i13 & 2) != 0 ? 255 : 0, (i13 & 4) == 0 ? 0 : 255);
            } else {
                int i14 = i13 & 136;
                if (i14 == 0) {
                    iArr[i13] = m132557d(255, ((i13 & 1) != 0 ? 85 : 0) + ((i13 & 16) != 0 ? 170 : 0), ((i13 & 2) != 0 ? 85 : 0) + ((i13 & 32) != 0 ? 170 : 0), ((i13 & 4) == 0 ? 0 : 85) + ((i13 & 64) == 0 ? 0 : 170));
                } else if (i14 == 8) {
                    iArr[i13] = m132557d(127, ((i13 & 1) != 0 ? 85 : 0) + ((i13 & 16) != 0 ? 170 : 0), ((i13 & 2) != 0 ? 85 : 0) + ((i13 & 32) != 0 ? 170 : 0), ((i13 & 4) == 0 ? 0 : 85) + ((i13 & 64) == 0 ? 0 : 170));
                } else if (i14 == 128) {
                    iArr[i13] = m132557d(255, ((i13 & 1) != 0 ? 43 : 0) + 127 + ((i13 & 16) != 0 ? 85 : 0), ((i13 & 2) != 0 ? 43 : 0) + 127 + ((i13 & 32) != 0 ? 85 : 0), ((i13 & 4) == 0 ? 0 : 43) + 127 + ((i13 & 64) == 0 ? 0 : 85));
                } else if (i14 == 136) {
                    iArr[i13] = m132557d(255, ((i13 & 1) != 0 ? 43 : 0) + ((i13 & 16) != 0 ? 85 : 0), ((i13 & 2) != 0 ? 43 : 0) + ((i13 & 32) != 0 ? 85 : 0), ((i13 & 4) == 0 ? 0 : 43) + ((i13 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: d */
    public static int m132557d(int i13, int i14, int i15, int i16) {
        return (i13 << 24) | (i14 << 16) | (i15 << 8) | i16;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:119:0x0205 A[LOOP:3: B:87:0x0158->B:119:0x0205, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:133:0x0201 A[SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public static void m132558e(byte[] bArr, int[] iArr, int i13, int i14, int i15, Paint paint, Canvas canvas) {
        byte[] bArr2;
        char c3;
        char c7;
        int iM71632i;
        int iM71632i2;
        boolean z4;
        int iM71632i3;
        int iM71632i4;
        int iM71632i5;
        int i16;
        int i17;
        boolean z13;
        int iM71632i6;
        C24561s c24561s = new C24561s(bArr, bArr.length, 0, (byte) 0);
        int i18 = i14;
        int i19 = i15;
        byte[] bArrM132554a = null;
        byte[] bArrM132554a2 = null;
        byte[] bArrM132554a3 = null;
        while (c24561s.m71625b() != 0) {
            int i24 = 8;
            int iM71632i7 = c24561s.m71632i(8);
            if (iM71632i7 != 240) {
                int i25 = 3;
                int i26 = 2;
                int i27 = 4;
                switch (iM71632i7) {
                    case 16:
                        if (i13 == 3) {
                            bArr2 = bArrM132554a == null ? f176248i : bArrM132554a;
                        } else if (i13 == 2) {
                            bArr2 = bArrM132554a3 == null ? f176247h : bArrM132554a3;
                        } else {
                            bArr2 = null;
                        }
                        boolean z14 = false;
                        while (true) {
                            int iM71632i8 = c24561s.m71632i(2);
                            if (iM71632i8 != 0) {
                                iM71632i = iM71632i8;
                                iM71632i2 = 1;
                            } else {
                                if (c24561s.m71631h()) {
                                    int iM71632i9 = c24561s.m71632i(3) + 3;
                                    iM71632i = c24561s.m71632i(2);
                                    iM71632i2 = iM71632i9;
                                } else {
                                    if (c24561s.m71631h()) {
                                        iM71632i2 = 1;
                                        c3 = '\b';
                                        c7 = 4;
                                    } else {
                                        int iM71632i10 = c24561s.m71632i(2);
                                        if (iM71632i10 == 0) {
                                            c3 = '\b';
                                            c7 = 4;
                                            z14 = true;
                                        } else if (iM71632i10 == 1) {
                                            c3 = '\b';
                                            c7 = 4;
                                            iM71632i2 = 2;
                                        } else if (iM71632i10 == 2) {
                                            c3 = '\b';
                                            c7 = 4;
                                            iM71632i2 = c24561s.m71632i(4) + 12;
                                            iM71632i = c24561s.m71632i(2);
                                            z14 = z14;
                                        } else if (iM71632i10 != 3) {
                                            z14 = z14;
                                            c3 = '\b';
                                            c7 = 4;
                                        } else {
                                            c3 = '\b';
                                            int iM71632i11 = c24561s.m71632i(8) + 29;
                                            iM71632i = c24561s.m71632i(2);
                                            z14 = z14;
                                            iM71632i2 = iM71632i11;
                                            c7 = 4;
                                        }
                                        iM71632i = 0;
                                        iM71632i2 = 0;
                                    }
                                    iM71632i = 0;
                                }
                                if (iM71632i2 == 0 && paint != null) {
                                    if (bArr2 != 0) {
                                        iM71632i = bArr2[iM71632i];
                                    }
                                    paint.setColor(iArr[iM71632i]);
                                    canvas.drawRect(i18, i19, i18 + iM71632i2, i19 + 1, paint);
                                }
                                i18 += iM71632i2;
                                if (z14) {
                                    c24561s.m71626c();
                                } else {
                                    paint = paint;
                                    z14 = z14;
                                }
                            }
                            c3 = '\b';
                            c7 = 4;
                            if (iM71632i2 == 0) {
                            }
                            i18 += iM71632i2;
                            if (z14) {
                                c24561s.m71626c();
                            } else {
                                paint = paint;
                                z14 = z14;
                            }
                            break;
                        }
                        break;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        byte[] bArr3 = i13 == 3 ? bArrM132554a2 == null ? f176249j : bArrM132554a2 : null;
                        boolean z15 = false;
                        while (true) {
                            int iM71632i12 = c24561s.m71632i(i27);
                            if (iM71632i12 != 0) {
                                z4 = z15;
                                iM71632i5 = iM71632i12;
                                iM71632i3 = 1;
                            } else if (c24561s.m71631h()) {
                                if (c24561s.m71631h()) {
                                    int iM71632i13 = c24561s.m71632i(i26);
                                    if (iM71632i13 == 0) {
                                        z4 = z15;
                                        iM71632i3 = 1;
                                    } else if (iM71632i13 != 1) {
                                        if (iM71632i13 == i26) {
                                            iM71632i3 = c24561s.m71632i(i27) + 9;
                                            iM71632i4 = c24561s.m71632i(i27);
                                        } else if (iM71632i13 != i25) {
                                            z4 = z15;
                                            iM71632i3 = 0;
                                        } else {
                                            iM71632i3 = c24561s.m71632i(i24) + 25;
                                            iM71632i4 = c24561s.m71632i(i27);
                                        }
                                        iM71632i5 = iM71632i4;
                                    } else {
                                        z4 = z15;
                                        iM71632i3 = i26;
                                    }
                                    iM71632i5 = 0;
                                } else {
                                    iM71632i3 = c24561s.m71632i(i26) + 4;
                                    iM71632i5 = c24561s.m71632i(i27);
                                }
                                z4 = z15;
                            } else {
                                int iM71632i14 = c24561s.m71632i(i25);
                                if (iM71632i14 != 0) {
                                    iM71632i3 = iM71632i14 + 2;
                                    z4 = z15;
                                } else {
                                    z4 = true;
                                    iM71632i3 = 0;
                                }
                                iM71632i5 = 0;
                            }
                            if (iM71632i3 == 0 || paint == 0) {
                                i16 = i25;
                                i17 = i26;
                            } else {
                                if (bArr3 != 0) {
                                    iM71632i5 = bArr3[iM71632i5];
                                }
                                paint.setColor(iArr[iM71632i5]);
                                i16 = i25;
                                i17 = 2;
                                canvas.drawRect(i18, i19, i18 + iM71632i3, i19 + 1, paint);
                            }
                            i18 += iM71632i3;
                            if (z4) {
                                c24561s.m71626c();
                            } else {
                                z15 = z4;
                                i25 = i16;
                                i26 = i17;
                                i27 = 4;
                                i24 = 8;
                            }
                            break;
                        }
                        break;
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        boolean z16 = false;
                        while (true) {
                            int iM71632i15 = c24561s.m71632i(8);
                            if (iM71632i15 != 0) {
                                z13 = z16;
                                iM71632i6 = 1;
                            } else if (c24561s.m71631h()) {
                                z13 = z16;
                                iM71632i6 = c24561s.m71632i(7);
                                iM71632i15 = c24561s.m71632i(8);
                            } else {
                                int iM71632i16 = c24561s.m71632i(7);
                                if (iM71632i16 != 0) {
                                    z13 = z16;
                                    iM71632i6 = iM71632i16;
                                    iM71632i15 = 0;
                                } else {
                                    z13 = true;
                                    iM71632i15 = 0;
                                    iM71632i6 = 0;
                                }
                            }
                            if (iM71632i6 != 0 && paint != 0) {
                                paint.setColor(iArr[iM71632i15]);
                                canvas.drawRect(i18, i19, i18 + iM71632i6, i19 + 1, paint);
                            }
                            i18 += iM71632i6;
                            if (!z13) {
                                z16 = z13;
                            }
                            break;
                        }
                        break;
                    default:
                        switch (iM71632i7) {
                            case 32:
                                bArrM132554a3 = m132554a(4, 4, c24561s);
                                break;
                            case 33:
                                bArrM132554a = m132554a(4, 8, c24561s);
                                break;
                            case 34:
                                bArrM132554a2 = m132554a(16, 8, c24561s);
                                break;
                        }
                        break;
                }
            } else {
                i19 += 2;
                i18 = i14;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static C40897a m132559f(C24561s c24561s, int i13) {
        int[] iArr;
        int iM71632i;
        int i14;
        int iM71632i2;
        int iM71632i3;
        int iM71632i4;
        int i15 = 8;
        int iM71632i5 = c24561s.m71632i(8);
        c24561s.m71643t(8);
        int i16 = 2;
        int i17 = i13 - 2;
        int i18 = 0;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] iArrM132555b = m132555b();
        int[] iArrM132556c = m132556c();
        while (i17 > 0) {
            int iM71632i6 = c24561s.m71632i(i15);
            int iM71632i7 = c24561s.m71632i(i15);
            if ((iM71632i7 & 128) != 0) {
                iArr = iArr2;
            } else {
                iArr = (iM71632i7 & 64) != 0 ? iArrM132555b : iArrM132556c;
            }
            if ((iM71632i7 & 1) != 0) {
                iM71632i3 = c24561s.m71632i(i15);
                iM71632i4 = c24561s.m71632i(i15);
                iM71632i = c24561s.m71632i(i15);
                iM71632i2 = c24561s.m71632i(i15);
                i14 = i17 - 6;
            } else {
                int iM71632i8 = c24561s.m71632i(6) << i16;
                int iM71632i9 = c24561s.m71632i(4) << 4;
                iM71632i = c24561s.m71632i(4) << 4;
                i14 = i17 - 4;
                iM71632i2 = c24561s.m71632i(i16) << 6;
                iM71632i3 = iM71632i8;
                iM71632i4 = iM71632i9;
            }
            if (iM71632i3 == 0) {
                iM71632i4 = i18;
                iM71632i = iM71632i4;
                iM71632i2 = 255;
            }
            double d3 = iM71632i3;
            double d14 = iM71632i4 - 128;
            double d15 = iM71632i - 128;
            iArr[iM71632i6] = m132557d((byte) (255 - (iM71632i2 & 255)), AbstractC24567y.m71677h((int) ((1.402d * d14) + d3), 0, 255), AbstractC24567y.m71677h((int) ((d3 - (0.34414d * d15)) - (d14 * 0.71414d)), 0, 255), AbstractC24567y.m71677h((int) ((d15 * 1.772d) + d3), 0, 255));
            i17 = i14;
            i18 = 0;
            iM71632i5 = iM71632i5;
            iArrM132556c = iArrM132556c;
            i15 = 8;
            i16 = 2;
        }
        return new C40897a(iM71632i5, iArr2, iArrM132555b, iArrM132556c);
    }

    /* JADX INFO: renamed from: g */
    public static C40898b m132560g(C24561s c24561s) {
        byte[] bArr;
        int iM71632i = c24561s.m71632i(16);
        c24561s.m71643t(4);
        int iM71632i2 = c24561s.m71632i(2);
        boolean zM71631h = c24561s.m71631h();
        c24561s.m71643t(1);
        byte[] bArr2 = AbstractC24567y.f95880f;
        if (iM71632i2 != 1) {
            if (iM71632i2 == 0) {
                int iM71632i3 = c24561s.m71632i(16);
                int iM71632i4 = c24561s.m71632i(16);
                if (iM71632i3 > 0) {
                    bArr2 = new byte[iM71632i3];
                    c24561s.m71635l(iM71632i3, bArr2);
                }
                if (iM71632i4 > 0) {
                    bArr = new byte[iM71632i4];
                    c24561s.m71635l(iM71632i4, bArr);
                }
            }
            return new C40898b(iM71632i, zM71631h, bArr2, bArr);
        }
        c24561s.m71643t(c24561s.m71632i(8) * 16);
        bArr = bArr2;
        return new C40898b(iM71632i, zM71631h, bArr2, bArr);
    }
}
