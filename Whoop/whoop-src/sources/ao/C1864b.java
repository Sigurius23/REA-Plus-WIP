package ao;

import android.graphics.Bitmap;
import androidx.health.platform.client.proto.C1533u;
import ed3.C13117a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;
import p012ab.C0679g;
import p309lo.AbstractC24567y;
import p621xn.AbstractC38467d;
import p621xn.C38465b;
import p621xn.InterfaceC38468e;

/* JADX INFO: renamed from: ao.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C1864b extends AbstractC38467d {

    /* JADX INFO: renamed from: m */
    public final C13117a f7373m = new C13117a();

    /* JADX INFO: renamed from: n */
    public final C13117a f7374n = new C13117a();

    /* JADX INFO: renamed from: o */
    public final C1863a f7375o = new C1863a(0);

    /* JADX INFO: renamed from: p */
    public Inflater f7376p;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x0080  */
    @Override // p621xn.AbstractC38467d
    /* JADX INFO: renamed from: f */
    public final InterfaceC38468e mo5527f(int i13, boolean z4, byte[] bArr) {
        char c3;
        int[] iArr;
        C38465b c38465b;
        int i14;
        int i15;
        int iM36715y;
        int i16;
        int i17;
        int iM36679A;
        C13117a c13117a = this.f7373m;
        c13117a.m36687I(i13, bArr);
        char c7 = 255;
        if (c13117a.m36692a() > 0 && (c13117a.f45381a[c13117a.f45382b] & 255) == 120) {
            if (this.f7376p == null) {
                this.f7376p = new Inflater();
            }
            Inflater inflater = this.f7376p;
            C13117a c13117a2 = this.f7374n;
            if (AbstractC24567y.m71692w(c13117a, c13117a2, inflater)) {
                c13117a.m36687I(c13117a2.f45383c, c13117a2.f45381a);
            }
        }
        C1863a c1863a = this.f7375o;
        int i18 = 0;
        c1863a.f7366c = 0;
        int[] iArr2 = c1863a.f7364a;
        C13117a c13117a3 = (C13117a) c1863a.f7372i;
        c1863a.f7367d = 0;
        c1863a.f7368e = 0;
        c1863a.f7369f = 0;
        c1863a.f7370g = 0;
        c1863a.f7371h = 0;
        c13117a3.m36686H(0);
        c1863a.f7365b = false;
        ArrayList arrayList = new ArrayList();
        while (c13117a.m36692a() >= 3) {
            int i19 = c13117a.f45383c;
            int iM36715y2 = c13117a.m36715y();
            int iM36682D = c13117a.m36682D();
            int i24 = c13117a.f45382b + iM36682D;
            if (i24 > i19) {
                c13117a.m36689K(i19);
                c3 = c7;
                i14 = i18;
                iArr = iArr2;
                c38465b = null;
            } else {
                char c14 = 128;
                if (iM36715y2 != 128) {
                    switch (iM36715y2) {
                        case 20:
                            if (iM36682D % 5 == 2) {
                                c13117a.m36690L(2);
                                Arrays.fill(iArr2, i18);
                                int i25 = iM36682D / 5;
                                int i26 = i18;
                                while (i26 < i25) {
                                    int iM36715y3 = c13117a.m36715y();
                                    char c15 = c14;
                                    double dM36715y = c13117a.m36715y();
                                    double dM36715y2 = c13117a.m36715y() - 128;
                                    int[] iArr3 = iArr2;
                                    double dM36715y3 = c13117a.m36715y() - 128;
                                    iArr3[iM36715y3] = (AbstractC24567y.m71677h((int) ((1.402d * dM36715y2) + dM36715y), 0, 255) << 16) | (c13117a.m36715y() << 24) | (AbstractC24567y.m71677h((int) ((dM36715y - (0.34414d * dM36715y3)) - (dM36715y2 * 0.71414d)), 0, 255) << 8) | AbstractC24567y.m71677h((int) ((dM36715y3 * 1.772d) + dM36715y), 0, 255);
                                    i26++;
                                    c14 = c15;
                                    c7 = 255;
                                    iArr2 = iArr3;
                                }
                                c3 = c7;
                                iArr = iArr2;
                                c1863a.f7365b = true;
                            } else {
                                c3 = c7;
                                iArr = iArr2;
                            }
                            break;
                        case 21:
                            if (iM36682D >= 4) {
                                c13117a.m36690L(3);
                                int i27 = iM36682D - 4;
                                if (((128 & c13117a.m36715y()) != 0 ? 1 : i18) == 0) {
                                    i16 = c13117a3.f45382b;
                                    i17 = c13117a3.f45383c;
                                    if (i16 < i17 && i27 > 0) {
                                        int iMin = Math.min(i27, i17 - i16);
                                        c13117a.m36697g(c13117a3.f45381a, i16, iMin);
                                        c13117a3.m36689K(i16 + iMin);
                                    }
                                } else if (i27 >= 7 && (iM36679A = c13117a.m36679A()) >= 4) {
                                    c1863a.f7370g = c13117a.m36682D();
                                    c1863a.f7371h = c13117a.m36682D();
                                    c13117a3.m36686H(iM36679A - 4);
                                    i27 = iM36682D - 11;
                                    i16 = c13117a3.f45382b;
                                    i17 = c13117a3.f45383c;
                                    if (i16 < i17) {
                                        int iMin2 = Math.min(i27, i17 - i16);
                                        c13117a.m36697g(c13117a3.f45381a, i16, iMin2);
                                        c13117a3.m36689K(i16 + iMin2);
                                    }
                                }
                            }
                            c3 = c7;
                            iArr = iArr2;
                            break;
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            if (iM36682D >= 19) {
                                c1863a.f7366c = c13117a.m36682D();
                                c1863a.f7367d = c13117a.m36682D();
                                c13117a.m36690L(11);
                                c1863a.f7368e = c13117a.m36682D();
                                c1863a.f7369f = c13117a.m36682D();
                            }
                            c3 = c7;
                            iArr = iArr2;
                            break;
                        default:
                            c3 = c7;
                            iArr = iArr2;
                            break;
                    }
                    i14 = 0;
                    c38465b = null;
                } else {
                    c3 = c7;
                    iArr = iArr2;
                    if (c1863a.f7366c == 0 || c1863a.f7367d == 0 || c1863a.f7370g == 0 || c1863a.f7371h == 0 || (i15 = c13117a3.f45383c) == 0 || c13117a3.f45382b != i15 || !c1863a.f7365b) {
                        c38465b = null;
                    } else {
                        c13117a3.m36689K(0);
                        int i28 = c1863a.f7370g * c1863a.f7371h;
                        int[] iArr4 = new int[i28];
                        int i29 = 0;
                        while (i29 < i28) {
                            int iM36715y4 = c13117a3.m36715y();
                            if (iM36715y4 != 0) {
                                iM36715y = i29 + 1;
                                iArr4[i29] = iArr[iM36715y4];
                            } else {
                                int iM36715y5 = c13117a3.m36715y();
                                if (iM36715y5 != 0) {
                                    iM36715y = ((iM36715y5 & 64) == 0 ? iM36715y5 & 63 : ((iM36715y5 & 63) << 8) | c13117a3.m36715y()) + i29;
                                    Arrays.fill(iArr4, i29, iM36715y, (iM36715y5 & 128) == 0 ? 0 : iArr[c13117a3.m36715y()]);
                                }
                            }
                            i29 = iM36715y;
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr4, c1863a.f7370g, c1863a.f7371h, Bitmap.Config.ARGB_8888);
                        float f13 = c1863a.f7368e;
                        float f14 = c1863a.f7366c;
                        float f15 = f13 / f14;
                        float f16 = c1863a.f7369f;
                        float f17 = c1863a.f7367d;
                        c38465b = new C38465b(null, null, null, bitmapCreateBitmap, f16 / f17, 0, 0, f15, 0, Integer.MIN_VALUE, -3.4028235E38f, c1863a.f7370g / f14, c1863a.f7371h / f17, false, -16777216, Integer.MIN_VALUE, 0.0f);
                    }
                    i14 = 0;
                    c1863a.f7366c = 0;
                    c1863a.f7367d = 0;
                    c1863a.f7368e = 0;
                    c1863a.f7369f = 0;
                    c1863a.f7370g = 0;
                    c1863a.f7371h = 0;
                    c13117a3.m36686H(0);
                    c1863a.f7365b = false;
                }
                c13117a.m36689K(i24);
            }
            if (c38465b != null) {
                arrayList.add(c38465b);
            }
            i18 = i14;
            c7 = c3;
            iArr2 = iArr;
        }
        return new C0679g(Collections.unmodifiableList(arrayList), 1);
    }
}
