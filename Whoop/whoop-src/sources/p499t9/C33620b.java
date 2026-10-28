package p499t9;

import androidx.media3.common.ParserException;
import java.util.ArrayList;
import p607x8.AbstractC38047b;
import p607x8.C38059n;
import p641y8.AbstractC39319n;
import p641y8.C39318m;

/* JADX INFO: renamed from: t9.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C33620b {

    /* JADX INFO: renamed from: a */
    public final ArrayList f140330a;

    /* JADX INFO: renamed from: b */
    public final int f140331b;

    /* JADX INFO: renamed from: c */
    public final int f140332c;

    /* JADX INFO: renamed from: d */
    public final int f140333d;

    /* JADX INFO: renamed from: e */
    public final int f140334e;

    /* JADX INFO: renamed from: f */
    public final int f140335f;

    /* JADX INFO: renamed from: g */
    public final int f140336g;

    /* JADX INFO: renamed from: h */
    public final int f140337h;

    /* JADX INFO: renamed from: i */
    public final int f140338i;

    /* JADX INFO: renamed from: j */
    public final int f140339j;

    /* JADX INFO: renamed from: k */
    public final float f140340k;

    /* JADX INFO: renamed from: l */
    public final String f140341l;

    public C33620b(ArrayList arrayList, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25, float f13, String str) {
        this.f140330a = arrayList;
        this.f140331b = i13;
        this.f140332c = i14;
        this.f140333d = i15;
        this.f140334e = i16;
        this.f140335f = i17;
        this.f140336g = i18;
        this.f140337h = i19;
        this.f140338i = i24;
        this.f140339j = i25;
        this.f140340k = f13;
        this.f140341l = str;
    }

    /* JADX INFO: renamed from: a */
    public static C33620b m106232a(C38059n c38059n) throws ParserException {
        String str;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        float f13;
        int i19;
        int i24;
        try {
            c38059n.m121847G(4);
            int iM121867t = (c38059n.m121867t() & 3) + 1;
            if (iM121867t == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iM121867t2 = c38059n.m121867t() & 31;
            for (int i25 = 0; i25 < iM121867t2; i25++) {
                int iM121873z = c38059n.m121873z();
                int i26 = c38059n.f163018b;
                c38059n.m121847G(iM121873z);
                byte[] bArr = c38059n.f163017a;
                byte[] bArr2 = new byte[iM121873z + 4];
                System.arraycopy(AbstractC38047b.f162977a, 0, bArr2, 0, 4);
                System.arraycopy(bArr, i26, bArr2, 4, iM121873z);
                arrayList.add(bArr2);
            }
            int iM121867t3 = c38059n.m121867t();
            for (int i27 = 0; i27 < iM121867t3; i27++) {
                int iM121873z2 = c38059n.m121873z();
                int i28 = c38059n.f163018b;
                c38059n.m121847G(iM121873z2);
                byte[] bArr3 = c38059n.f163017a;
                byte[] bArr4 = new byte[iM121873z2 + 4];
                System.arraycopy(AbstractC38047b.f162977a, 0, bArr4, 0, 4);
                System.arraycopy(bArr3, i28, bArr4, 4, iM121873z2);
                arrayList.add(bArr4);
            }
            if (iM121867t2 > 0) {
                C39318m c39318mM125284k = AbstractC39319n.m125284k((byte[]) arrayList.get(0), 4, ((byte[]) arrayList.get(0)).length);
                int i29 = c39318mM125284k.f169152e;
                int i34 = c39318mM125284k.f169153f;
                int i35 = c39318mM125284k.f169155h + 8;
                int i36 = c39318mM125284k.f169156i + 8;
                int i37 = c39318mM125284k.f169163p;
                int i38 = c39318mM125284k.f169164q;
                int i39 = c39318mM125284k.f169165r;
                int i44 = c39318mM125284k.f169166s;
                float f14 = c39318mM125284k.f169154g;
                int i45 = c39318mM125284k.f169148a;
                int i46 = c39318mM125284k.f169149b;
                int i47 = c39318mM125284k.f169150c;
                byte[] bArr5 = AbstractC38047b.f162977a;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i45), Integer.valueOf(i46), Integer.valueOf(i47));
                i16 = i38;
                i17 = i39;
                i18 = i44;
                f13 = f14;
                i14 = i34;
                i15 = i35;
                i19 = i36;
                i24 = i37;
                i13 = i29;
            } else {
                str = null;
                i13 = -1;
                i14 = -1;
                i15 = -1;
                i16 = -1;
                i17 = -1;
                i18 = 16;
                f13 = 1.0f;
                i19 = -1;
                i24 = -1;
            }
            return new C33620b(arrayList, iM121867t, i13, i14, i15, i19, i24, i16, i17, i18, f13, str);
        } catch (ArrayIndexOutOfBoundsException e5) {
            throw ParserException.m5049a(e5, "Error parsing AVC config");
        }
    }
}
