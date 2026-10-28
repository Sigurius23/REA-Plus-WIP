package sa;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.health.platform.client.proto.C1533u;
import java.util.ArrayList;
import java.util.List;
import p309lo.C24561s;
import p576w8.C36932b;
import p607x8.AbstractC38046a;
import p607x8.AbstractC38065t;
import p607x8.C38059n;
import p607x8.InterfaceC38049d;
import p690zr.AbstractC41023g0;
import p690zr.C41017e0;
import p690zr.C41060w0;
import qa.C30096a;
import qa.C30106k;
import qa.InterfaceC30107l;

/* JADX INFO: renamed from: sa.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C32323i implements InterfaceC30107l {

    /* JADX INFO: renamed from: H */
    public static final byte[] f133763H = {0, 7, 8, 15};

    /* JADX INFO: renamed from: I */
    public static final byte[] f133764I = {0, 119, -120, -1};

    /* JADX INFO: renamed from: J */
    public static final byte[] f133765J = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: E */
    public final C32315a f133766E;

    /* JADX INFO: renamed from: F */
    public final C32322h f133767F;

    /* JADX INFO: renamed from: G */
    public Bitmap f133768G;

    /* JADX INFO: renamed from: w */
    public final Paint f133769w;

    /* JADX INFO: renamed from: x */
    public final Paint f133770x;

    /* JADX INFO: renamed from: y */
    public final Canvas f133771y;

    /* JADX INFO: renamed from: z */
    public final C32316b f133772z;

    public C32323i(List list) {
        C38059n c38059n = new C38059n((byte[]) list.get(0));
        int iM121873z = c38059n.m121873z();
        int iM121873z2 = c38059n.m121873z();
        Paint paint = new Paint();
        this.f133769w = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f133770x = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f133771y = new Canvas();
        this.f133772z = new C32316b(719, 575, 0, 719, 0, 575);
        this.f133766E = new C32315a(0, new int[]{0, -1, -16777216, -8421505}, m100582b(), m100583c());
        this.f133767F = new C32322h(iM121873z, iM121873z2, 0);
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m100581a(int i13, int i14, C24561s c24561s) {
        byte[] bArr = new byte[i13];
        for (int i15 = 0; i15 < i13; i15++) {
            bArr[i15] = (byte) c24561s.m71632i(i14);
        }
        return bArr;
    }

    /* JADX INFO: renamed from: b */
    public static int[] m100582b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i13 = 1; i13 < 16; i13++) {
            if (i13 < 8) {
                iArr[i13] = m100584d(255, (i13 & 1) != 0 ? 255 : 0, (i13 & 2) != 0 ? 255 : 0, (i13 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i13] = m100584d(255, (i13 & 1) != 0 ? 127 : 0, (i13 & 2) != 0 ? 127 : 0, (i13 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: c */
    public static int[] m100583c() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i13 = 0; i13 < 256; i13++) {
            if (i13 < 8) {
                iArr[i13] = m100584d(63, (i13 & 1) != 0 ? 255 : 0, (i13 & 2) != 0 ? 255 : 0, (i13 & 4) == 0 ? 0 : 255);
            } else {
                int i14 = i13 & 136;
                if (i14 == 0) {
                    iArr[i13] = m100584d(255, ((i13 & 1) != 0 ? 85 : 0) + ((i13 & 16) != 0 ? 170 : 0), ((i13 & 2) != 0 ? 85 : 0) + ((i13 & 32) != 0 ? 170 : 0), ((i13 & 4) == 0 ? 0 : 85) + ((i13 & 64) == 0 ? 0 : 170));
                } else if (i14 == 8) {
                    iArr[i13] = m100584d(127, ((i13 & 1) != 0 ? 85 : 0) + ((i13 & 16) != 0 ? 170 : 0), ((i13 & 2) != 0 ? 85 : 0) + ((i13 & 32) != 0 ? 170 : 0), ((i13 & 4) == 0 ? 0 : 85) + ((i13 & 64) == 0 ? 0 : 170));
                } else if (i14 == 128) {
                    iArr[i13] = m100584d(255, ((i13 & 1) != 0 ? 43 : 0) + 127 + ((i13 & 16) != 0 ? 85 : 0), ((i13 & 2) != 0 ? 43 : 0) + 127 + ((i13 & 32) != 0 ? 85 : 0), ((i13 & 4) == 0 ? 0 : 43) + 127 + ((i13 & 64) == 0 ? 0 : 85));
                } else if (i14 == 136) {
                    iArr[i13] = m100584d(255, ((i13 & 1) != 0 ? 43 : 0) + ((i13 & 16) != 0 ? 85 : 0), ((i13 & 2) != 0 ? 43 : 0) + ((i13 & 32) != 0 ? 85 : 0), ((i13 & 4) == 0 ? 0 : 43) + ((i13 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: d */
    public static int m100584d(int i13, int i14, int i15, int i16) {
        return (i13 << 24) | (i14 << 16) | (i15 << 8) | i16;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:119:0x0205 A[LOOP:3: B:87:0x0158->B:119:0x0205, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:133:0x0201 A[SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public static void m100585e(byte[] bArr, int[] iArr, int i13, int i14, int i15, Paint paint, Canvas canvas) {
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
        C24561s c24561s = new C24561s(bArr, bArr.length, 5, (byte) 0);
        int i18 = i14;
        int i19 = i15;
        byte[] bArrM100581a = null;
        byte[] bArrM100581a2 = null;
        byte[] bArrM100581a3 = null;
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
                            bArr2 = bArrM100581a == null ? f133764I : bArrM100581a;
                        } else if (i13 == 2) {
                            bArr2 = bArrM100581a3 == null ? f133763H : bArrM100581a3;
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
                        byte[] bArr3 = i13 == 3 ? bArrM100581a2 == null ? f133765J : bArrM100581a2 : null;
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
                                bArrM100581a3 = m100581a(4, 4, c24561s);
                                break;
                            case 33:
                                bArrM100581a = m100581a(4, 8, c24561s);
                                break;
                            case 34:
                                bArrM100581a2 = m100581a(16, 8, c24561s);
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
    public static C32315a m100586f(C24561s c24561s, int i13) {
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
        int[] iArrM100582b = m100582b();
        int[] iArrM100583c = m100583c();
        while (i17 > 0) {
            int iM71632i6 = c24561s.m71632i(i15);
            int iM71632i7 = c24561s.m71632i(i15);
            if ((iM71632i7 & 128) != 0) {
                iArr = iArr2;
            } else {
                iArr = (iM71632i7 & 64) != 0 ? iArrM100582b : iArrM100583c;
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
            iArr[iM71632i6] = m100584d((byte) (255 - (iM71632i2 & 255)), AbstractC38065t.m121914g((int) ((1.402d * d14) + d3), 0, 255), AbstractC38065t.m121914g((int) ((d3 - (0.34414d * d15)) - (d14 * 0.71414d)), 0, 255), AbstractC38065t.m121914g((int) ((d15 * 1.772d) + d3), 0, 255));
            i17 = i14;
            i18 = 0;
            iM71632i5 = iM71632i5;
            iArrM100583c = iArrM100583c;
            i15 = 8;
            i16 = 2;
        }
        return new C32315a(iM71632i5, iArr2, iArrM100582b, iArrM100583c);
    }

    /* JADX INFO: renamed from: g */
    public static C32317c m100587g(C24561s c24561s) {
        byte[] bArr;
        int iM71632i = c24561s.m71632i(16);
        c24561s.m71643t(4);
        int iM71632i2 = c24561s.m71632i(2);
        boolean zM71631h = c24561s.m71631h();
        c24561s.m71643t(1);
        byte[] bArr2 = AbstractC38065t.f163033c;
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
            return new C32317c(iM71632i, zM71631h, bArr2, bArr);
        }
        c24561s.m71643t(c24561s.m71632i(8) * 16);
        bArr = bArr2;
        return new C32317c(iM71632i, zM71631h, bArr2, bArr);
    }

    @Override // qa.InterfaceC30107l
    /* JADX INFO: renamed from: c0 */
    public final int mo91110c0() {
        return 2;
    }

    @Override // qa.InterfaceC30107l
    /* JADX INFO: renamed from: k */
    public final void mo91120k(byte[] bArr, int i13, int i14, C30106k c30106k, InterfaceC38049d interfaceC38049d) {
        C32322h c32322h;
        boolean z4;
        C30096a c30096a;
        char c3;
        char c7;
        char c14;
        int i15;
        int i16;
        C32320f c32320f;
        int i17;
        int i18;
        C32320f c32320f2;
        int iM71632i;
        int iM71632i2;
        int iM71632i3;
        int iM71632i4;
        int i19 = 0;
        C24561s c24561s = new C24561s(bArr, i13 + i14, 5, (byte) 0);
        c24561s.m71640q(i13);
        while (true) {
            int iM71625b = c24561s.m71625b();
            c32322h = this.f133767F;
            z4 = true;
            if (iM71625b >= 48 && c24561s.m71632i(8) == 15) {
                int iM71632i5 = c24561s.m71632i(8);
                int iM71632i6 = c24561s.m71632i(16);
                int iM71632i7 = c24561s.m71632i(16);
                int iM71629f = c24561s.m71629f() + iM71632i7;
                if (iM71632i7 * 8 > c24561s.m71625b()) {
                    AbstractC38046a.m121826u("DvbParser", "Data field length exceeds limit");
                    c24561s.m71643t(c24561s.m71625b());
                } else {
                    switch (iM71632i5) {
                        case 16:
                            if (iM71632i6 == c32322h.f133754a) {
                                C32318d c32318d = (C32318d) c32322h.f133762i;
                                c24561s.m71632i(8);
                                int iM71632i8 = c24561s.m71632i(4);
                                int iM71632i9 = c24561s.m71632i(2);
                                c24561s.m71643t(2);
                                int i24 = iM71632i7 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i24 > 0) {
                                    int iM71632i10 = c24561s.m71632i(8);
                                    c24561s.m71643t(8);
                                    i24 -= 6;
                                    sparseArray.put(iM71632i10, new C32319e(c24561s.m71632i(16), c24561s.m71632i(16)));
                                }
                                C32318d c32318d2 = new C32318d(iM71632i8, iM71632i9, sparseArray);
                                if (iM71632i9 != 0) {
                                    c32322h.f133762i = c32318d2;
                                    c32322h.f133756c.clear();
                                    c32322h.f133757d.clear();
                                    c32322h.f133758e.clear();
                                } else if (c32318d != null && c32318d.f133737a != iM71632i8) {
                                    c32322h.f133762i = c32318d2;
                                }
                            }
                            break;
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            C32318d c32318d3 = (C32318d) c32322h.f133762i;
                            SparseArray sparseArray2 = c32322h.f133756c;
                            if (iM71632i6 == c32322h.f133754a && c32318d3 != null) {
                                int iM71632i11 = c24561s.m71632i(8);
                                c24561s.m71643t(4);
                                boolean zM71631h = c24561s.m71631h();
                                c24561s.m71643t(3);
                                int iM71632i12 = c24561s.m71632i(16);
                                int iM71632i13 = c24561s.m71632i(16);
                                c24561s.m71632i(3);
                                int iM71632i14 = c24561s.m71632i(3);
                                c24561s.m71643t(2);
                                int iM71632i15 = c24561s.m71632i(8);
                                int iM71632i16 = c24561s.m71632i(8);
                                int iM71632i17 = c24561s.m71632i(4);
                                int iM71632i18 = c24561s.m71632i(2);
                                c24561s.m71643t(2);
                                int i25 = iM71632i7 - 10;
                                SparseArray sparseArray3 = new SparseArray();
                                while (i25 > 0) {
                                    int iM71632i19 = c24561s.m71632i(16);
                                    int iM71632i20 = c24561s.m71632i(2);
                                    c24561s.m71632i(2);
                                    int iM71632i21 = c24561s.m71632i(12);
                                    c24561s.m71643t(4);
                                    int iM71632i22 = c24561s.m71632i(12);
                                    int i26 = i25 - 6;
                                    if (iM71632i20 == 1 || iM71632i20 == 2) {
                                        c24561s.m71632i(8);
                                        c24561s.m71632i(8);
                                        i25 -= 8;
                                    } else {
                                        i25 = i26;
                                    }
                                    sparseArray3.put(iM71632i19, new C32321g(iM71632i21, iM71632i22));
                                }
                                C32320f c32320f3 = new C32320f(iM71632i11, zM71631h, iM71632i12, iM71632i13, iM71632i14, iM71632i15, iM71632i16, iM71632i17, iM71632i18, sparseArray3);
                                if (c32318d3.f133738b == 0 && (c32320f2 = (C32320f) sparseArray2.get(iM71632i11)) != null) {
                                    SparseArray sparseArray4 = c32320f2.f133751j;
                                    for (int i27 = 0; i27 < sparseArray4.size(); i27++) {
                                        c32320f3.f133751j.put(sparseArray4.keyAt(i27), (C32321g) sparseArray4.valueAt(i27));
                                    }
                                }
                                sparseArray2.put(c32320f3.f133742a, c32320f3);
                            }
                            break;
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            if (iM71632i6 == c32322h.f133754a) {
                                C32315a c32315aM100586f = m100586f(c24561s, iM71632i7);
                                c32322h.f133757d.put(c32315aM100586f.f133723a, c32315aM100586f);
                            } else if (iM71632i6 == c32322h.f133755b) {
                                C32315a c32315aM100586f2 = m100586f(c24561s, iM71632i7);
                                c32322h.f133759f.put(c32315aM100586f2.f133723a, c32315aM100586f2);
                            }
                            break;
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            if (iM71632i6 == c32322h.f133754a) {
                                C32317c c32317cM100587g = m100587g(c24561s);
                                c32322h.f133758e.put(c32317cM100587g.f133733a, c32317cM100587g);
                            } else if (iM71632i6 == c32322h.f133755b) {
                                C32317c c32317cM100587g2 = m100587g(c24561s);
                                c32322h.f133760g.put(c32317cM100587g2.f133733a, c32317cM100587g2);
                            }
                            break;
                        case 20:
                            if (iM71632i6 == c32322h.f133754a) {
                                c24561s.m71643t(4);
                                boolean zM71631h2 = c24561s.m71631h();
                                c24561s.m71643t(3);
                                int iM71632i23 = c24561s.m71632i(16);
                                int iM71632i24 = c24561s.m71632i(16);
                                if (zM71631h2) {
                                    iM71632i = c24561s.m71632i(16);
                                    iM71632i3 = c24561s.m71632i(16);
                                    iM71632i2 = c24561s.m71632i(16);
                                    iM71632i4 = c24561s.m71632i(16);
                                } else {
                                    iM71632i = i19;
                                    iM71632i2 = iM71632i;
                                    iM71632i3 = iM71632i23;
                                    iM71632i4 = iM71632i24;
                                }
                                c32322h.f133761h = new C32316b(iM71632i23, iM71632i24, iM71632i, iM71632i3, iM71632i2, iM71632i4);
                            }
                            break;
                    }
                    c24561s.m71644u(iM71629f - c24561s.m71629f());
                }
                i19 = 0;
            }
        }
        C32318d c32318d4 = (C32318d) c32322h.f133762i;
        if (c32318d4 == null) {
            C41017e0 c41017e0 = AbstractC41023g0.f176998x;
            c30096a = new C30096a(C41060w0.f177067E, -9223372036854775807L, -9223372036854775807L);
        } else {
            C32316b c32316b = (C32316b) c32322h.f133761h;
            if (c32316b == null) {
                c32316b = this.f133772z;
            }
            Bitmap bitmap = this.f133768G;
            Canvas canvas = this.f133771y;
            if (bitmap == null || c32316b.f133727a + 1 != bitmap.getWidth() || c32316b.f133728b + 1 != this.f133768G.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c32316b.f133727a + 1, c32316b.f133728b + 1, Bitmap.Config.ARGB_8888);
                this.f133768G = bitmapCreateBitmap;
                canvas.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray5 = c32318d4.f133739c;
            int i28 = 0;
            while (i28 < sparseArray5.size()) {
                canvas.save();
                C32319e c32319e = (C32319e) sparseArray5.valueAt(i28);
                C32320f c32320f4 = (C32320f) c32322h.f133756c.get(sparseArray5.keyAt(i28));
                int i29 = c32319e.f133740a + c32316b.f133729c;
                int i34 = c32319e.f133741b + c32316b.f133731e;
                int i35 = c32320f4.f133744c;
                int i36 = c32320f4.f133747f;
                int i37 = c32320f4.f133745d;
                boolean z13 = z4;
                int i38 = i29 + i35;
                int i39 = i34 + i37;
                SparseArray sparseArray6 = sparseArray5;
                canvas.clipRect(i29, i34, Math.min(i38, c32316b.f133730d), Math.min(i39, c32316b.f133732f));
                C32315a c32315a = (C32315a) c32322h.f133757d.get(i36);
                if (c32315a == null && (c32315a = (C32315a) c32322h.f133759f.get(i36)) == null) {
                    c32315a = this.f133766E;
                }
                SparseArray sparseArray7 = c32320f4.f133751j;
                int i44 = i28;
                int i45 = 0;
                while (i45 < sparseArray7.size()) {
                    int iKeyAt = sparseArray7.keyAt(i45);
                    SparseArray sparseArray8 = sparseArray7;
                    C32321g c32321g = (C32321g) sparseArray7.valueAt(i45);
                    int i46 = i34;
                    C32317c c32317c = (C32317c) c32322h.f133758e.get(iKeyAt);
                    if (c32317c == null) {
                        c32317c = (C32317c) c32322h.f133760g.get(iKeyAt);
                    }
                    C32317c c32317c2 = c32317c;
                    if (c32317c2 != null) {
                        Paint paint = c32317c2.f133734b ? null : this.f133769w;
                        int i47 = i29;
                        int i48 = c32320f4.f133746e;
                        int i49 = i47 + c32321g.f133752a;
                        int i54 = i46 + c32321g.f133753b;
                        int i55 = i37;
                        Paint paint2 = paint;
                        i17 = i47;
                        i16 = i46;
                        C32320f c32320f5 = c32320f4;
                        int[] iArr = i48 == 3 ? c32315a.f133726d : i48 == 2 ? c32315a.f133725c : c32315a.f133724b;
                        c32320f = c32320f5;
                        i18 = i55;
                        m100585e(c32317c2.f133735c, iArr, i48, i49, i54, paint2, canvas);
                        m100585e(c32317c2.f133736d, iArr, i48, i49, i54 + 1, paint2, canvas);
                    } else {
                        i16 = i46;
                        c32320f = c32320f4;
                        i17 = i29;
                        i18 = i37;
                    }
                    i45++;
                    i35 = i35;
                    i34 = i16;
                    c32320f4 = c32320f;
                    i29 = i17;
                    arrayList = arrayList;
                    sparseArray7 = sparseArray8;
                    c32316b = c32316b;
                    c32322h = c32322h;
                    i37 = i18;
                }
                C32316b c32316b2 = c32316b;
                ArrayList arrayList2 = arrayList;
                C32322h c32322h2 = c32322h;
                int i56 = i34;
                C32320f c32320f6 = c32320f4;
                int i57 = i29;
                int i58 = i35;
                int i59 = i37;
                if (c32320f6.f133743b) {
                    int i64 = c32320f6.f133746e;
                    if (i64 == 3) {
                        i15 = c32315a.f133726d[c32320f6.f133748g];
                        c14 = 2;
                    } else {
                        c14 = 2;
                        i15 = i64 == 2 ? c32315a.f133725c[c32320f6.f133749h] : c32315a.f133724b[c32320f6.f133750i];
                    }
                    Paint paint3 = this.f133770x;
                    paint3.setColor(i15);
                    c3 = c14;
                    c7 = 3;
                    canvas.drawRect(i57, i56, i38, i39, paint3);
                } else {
                    c3 = 2;
                    c7 = 3;
                }
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.f133768G, i57, i56, i58, i59);
                float f13 = c32316b2.f133727a;
                float f14 = c32316b2.f133728b;
                arrayList2.add(new C36932b(null, null, null, bitmapCreateBitmap2, i56 / f14, 0, 0, i57 / f13, 0, Integer.MIN_VALUE, -3.4028235E38f, i58 / f13, i59 / f14, false, -16777216, Integer.MIN_VALUE, 0.0f));
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i28 = i44 + 1;
                z4 = z13;
                c32316b = c32316b2;
                arrayList = arrayList2;
                c32322h = c32322h2;
                sparseArray5 = sparseArray6;
            }
            c30096a = new C30096a(arrayList, -9223372036854775807L, -9223372036854775807L);
        }
        interfaceC38049d.accept(c30096a);
    }

    @Override // qa.InterfaceC30107l
    public final void reset() {
        C32322h c32322h = this.f133767F;
        c32322h.f133756c.clear();
        c32322h.f133757d.clear();
        c32322h.f133758e.clear();
        c32322h.f133759f.clear();
        c32322h.f133760g.clear();
        c32322h.f133761h = null;
        c32322h.f133762i = null;
    }
}
