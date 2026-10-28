package p581we;

import e93.AbstractC12889b;
import i93.C18282h;
import m83.AbstractC25260n;
import p280kf.C22425a;
import tg.AbstractC33774f;
import va3.AbstractC35846d;

/* JADX INFO: renamed from: we.h0 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC37190h0 {

    /* JADX INFO: renamed from: a */
    public static final C22425a f159020a;

    static {
        char[] cArr = AbstractC33774f.f141356a;
        byte[] bArr = new byte[32];
        C18282h c18282hM36268d0 = AbstractC12889b.m36268d0(2, AbstractC12889b.m36278i0(0, 64));
        int i13 = c18282hM36268d0.f71133w;
        int i14 = c18282hM36268d0.f71134x;
        int i15 = c18282hM36268d0.f71135y;
        if ((i15 > 0 && i13 <= i14) || (i15 < 0 && i14 <= i13)) {
            int i16 = 0;
            while (true) {
                int i17 = i16 + 1;
                bArr[i16] = (byte) (AbstractC35846d.m113780e("FFFFFFFF00000000FFFFFFFFFFFFFFFFBCE6FAADA7179E84F3B9CAC2FC63254F".charAt(i13 + 1)) | (AbstractC35846d.m113780e("FFFFFFFF00000000FFFFFFFFFFFFFFFFBCE6FAADA7179E84F3B9CAC2FC63254F".charAt(i13)) << 4));
                if (i13 == i14) {
                    break;
                }
                i13 += i15;
                i16 = i17;
            }
        }
        f159020a = new C22425a(AbstractC25260n.m74030F0(new byte[]{0}, bArr));
    }
}
