package mo;

import com.google.android.exoplayer2.ParserException;
import ed3.C13117a;
import java.util.ArrayList;
import p309lo.AbstractC24543a;
import p309lo.C24558p;

/* JADX INFO: renamed from: mo.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C25720a {

    /* JADX INFO: renamed from: a */
    public final ArrayList f101319a;

    /* JADX INFO: renamed from: b */
    public final int f101320b;

    /* JADX INFO: renamed from: c */
    public final int f101321c;

    /* JADX INFO: renamed from: d */
    public final int f101322d;

    /* JADX INFO: renamed from: e */
    public final float f101323e;

    /* JADX INFO: renamed from: f */
    public final String f101324f;

    public C25720a(ArrayList arrayList, int i13, int i14, int i15, float f13, String str) {
        this.f101319a = arrayList;
        this.f101320b = i13;
        this.f101321c = i14;
        this.f101322d = i15;
        this.f101323e = f13;
        this.f101324f = str;
    }

    /* JADX INFO: renamed from: a */
    public static C25720a m75837a(C13117a c13117a) throws ParserException {
        float f13;
        String str;
        int i13;
        int i14;
        byte[] bArr = AbstractC24543a.f95797a;
        try {
            c13117a.m36690L(4);
            int iM36715y = (c13117a.m36715y() & 3) + 1;
            if (iM36715y == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iM36715y2 = c13117a.m36715y() & 31;
            for (int i15 = 0; i15 < iM36715y2; i15++) {
                int iM36682D = c13117a.m36682D();
                int i16 = c13117a.f45382b;
                c13117a.m36690L(iM36682D);
                byte[] bArr2 = c13117a.f45381a;
                byte[] bArr3 = new byte[iM36682D + 4];
                System.arraycopy(bArr, 0, bArr3, 0, 4);
                System.arraycopy(bArr2, i16, bArr3, 4, iM36682D);
                arrayList.add(bArr3);
            }
            int iM36715y3 = c13117a.m36715y();
            for (int i17 = 0; i17 < iM36715y3; i17++) {
                int iM36682D2 = c13117a.m36682D();
                int i18 = c13117a.f45382b;
                c13117a.m36690L(iM36682D2);
                byte[] bArr4 = c13117a.f45381a;
                byte[] bArr5 = new byte[iM36682D2 + 4];
                System.arraycopy(bArr, 0, bArr5, 0, 4);
                System.arraycopy(bArr4, i18, bArr5, 4, iM36682D2);
                arrayList.add(bArr5);
            }
            if (iM36715y2 > 0) {
                C24558p c24558pM71590z = AbstractC24543a.m71590z((byte[]) arrayList.get(0), iM36715y, ((byte[]) arrayList.get(0)).length);
                int i19 = c24558pM71590z.f95842e;
                int i24 = c24558pM71590z.f95843f;
                f13 = c24558pM71590z.f95844g;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(c24558pM71590z.f95838a), Integer.valueOf(c24558pM71590z.f95839b), Integer.valueOf(c24558pM71590z.f95840c));
                i13 = i19;
                i14 = i24;
            } else {
                f13 = 1.0f;
                str = null;
                i13 = -1;
                i14 = -1;
            }
            return new C25720a(arrayList, iM36715y, i13, i14, f13, str);
        } catch (ArrayIndexOutOfBoundsException e5) {
            throw ParserException.m15562a(e5, "Error parsing AVC config");
        }
    }
}
