package mo;

import com.google.android.exoplayer2.ParserException;
import ed3.C13117a;
import java.util.Collections;
import java.util.List;
import p309lo.AbstractC24543a;
import p309lo.C24556n;

/* JADX INFO: renamed from: mo.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C25726g {

    /* JADX INFO: renamed from: a */
    public final List f101355a;

    /* JADX INFO: renamed from: b */
    public final int f101356b;

    /* JADX INFO: renamed from: c */
    public final float f101357c;

    /* JADX INFO: renamed from: d */
    public final String f101358d;

    public C25726g(List list, int i13, float f13, String str) {
        this.f101355a = list;
        this.f101356b = i13;
        this.f101357c = f13;
        this.f101358d = str;
    }

    /* JADX INFO: renamed from: a */
    public static C25726g m75847a(C13117a c13117a) throws ParserException {
        boolean z4;
        try {
            c13117a.m36690L(21);
            int iM36715y = c13117a.m36715y() & 3;
            int iM36715y2 = c13117a.m36715y();
            int i13 = c13117a.f45382b;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            while (true) {
                z4 = true;
                if (i15 >= iM36715y2) {
                    break;
                }
                c13117a.m36690L(1);
                int iM36682D = c13117a.m36682D();
                for (int i17 = 0; i17 < iM36682D; i17++) {
                    int iM36682D2 = c13117a.m36682D();
                    i16 += iM36682D2 + 4;
                    c13117a.m36690L(iM36682D2);
                }
                i15++;
            }
            c13117a.m36689K(i13);
            byte[] bArr = new byte[i16];
            float f13 = 1.0f;
            String strM71568d = null;
            int i18 = 0;
            int i19 = 0;
            while (i18 < iM36715y2) {
                int iM36715y3 = c13117a.m36715y() & 127;
                int iM36682D3 = c13117a.m36682D();
                int i24 = i14;
                while (i24 < iM36682D3) {
                    int iM36682D4 = c13117a.m36682D();
                    boolean z13 = z4;
                    System.arraycopy(AbstractC24543a.f95799c, i14, bArr, i19, 4);
                    int i25 = i19 + 4;
                    System.arraycopy(c13117a.f45381a, c13117a.f45382b, bArr, i25, iM36682D4);
                    if (iM36715y3 == 33 && i24 == 0) {
                        C24556n c24556nM71589y = AbstractC24543a.m71589y(bArr, i25, i25 + iM36682D4);
                        float f14 = c24556nM71589y.f95835g;
                        strM71568d = AbstractC24543a.m71568d(c24556nM71589y.f95829a, c24556nM71589y.f95830b, c24556nM71589y.f95831c, c24556nM71589y.f95832d, c24556nM71589y.f95833e, c24556nM71589y.f95834f);
                        f13 = f14;
                    }
                    i19 = i25 + iM36682D4;
                    c13117a.m36690L(iM36682D4);
                    i24++;
                    z4 = z13;
                    iM36715y = iM36715y;
                    i14 = 0;
                }
                i18++;
                i14 = 0;
            }
            return new C25726g(i16 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iM36715y + 1, f13, strM71568d);
        } catch (ArrayIndexOutOfBoundsException e5) {
            throw ParserException.m15562a(e5, "Error parsing HEVC config");
        }
    }
}
