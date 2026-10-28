package p499t9;

import androidx.media3.common.ParserException;
import java.util.Collections;
import java.util.List;
import p077d0.C11387o2;
import p408q.C29662f;
import p607x8.AbstractC38047b;
import p607x8.C38059n;
import p641y8.AbstractC39319n;
import p641y8.C39312g;
import p641y8.C39313h;
import p641y8.C39315j;
import p690zr.AbstractC41023g0;

/* JADX INFO: renamed from: t9.y */
/* JADX INFO: loaded from: classes5.dex */
public final class C33656y {

    /* JADX INFO: renamed from: a */
    public final List f140460a;

    /* JADX INFO: renamed from: b */
    public final int f140461b;

    /* JADX INFO: renamed from: c */
    public final int f140462c;

    /* JADX INFO: renamed from: d */
    public final int f140463d;

    /* JADX INFO: renamed from: e */
    public final int f140464e;

    /* JADX INFO: renamed from: f */
    public final int f140465f;

    /* JADX INFO: renamed from: g */
    public final int f140466g;

    /* JADX INFO: renamed from: h */
    public final int f140467h;

    /* JADX INFO: renamed from: i */
    public final int f140468i;

    /* JADX INFO: renamed from: j */
    public final float f140469j;

    /* JADX INFO: renamed from: k */
    public final int f140470k;

    /* JADX INFO: renamed from: l */
    public final String f140471l;

    /* JADX INFO: renamed from: m */
    public final C29662f f140472m;

    public C33656y(List list, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i24, float f13, int i25, String str, C29662f c29662f) {
        this.f140460a = list;
        this.f140461b = i13;
        this.f140462c = i14;
        this.f140463d = i15;
        this.f140464e = i16;
        this.f140465f = i17;
        this.f140466g = i18;
        this.f140467h = i19;
        this.f140468i = i24;
        this.f140469j = f13;
        this.f140470k = i25;
        this.f140471l = str;
        this.f140472m = c29662f;
    }

    /* JADX INFO: renamed from: a */
    public static C33656y m106297a(C38059n c38059n, boolean z4, C29662f c29662f) throws ParserException {
        boolean z13;
        C11387o2 c11387o2M125281h;
        int i13 = 4;
        try {
            if (z4) {
                c38059n.m121847G(4);
            } else {
                c38059n.m121847G(21);
            }
            int iM121867t = c38059n.m121867t() & 3;
            int iM121867t2 = c38059n.m121867t();
            int i14 = c38059n.f163018b;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            while (true) {
                z13 = true;
                if (i16 >= iM121867t2) {
                    break;
                }
                c38059n.m121847G(1);
                int iM121873z = c38059n.m121873z();
                for (int i18 = 0; i18 < iM121873z; i18++) {
                    int iM121873z2 = c38059n.m121873z();
                    i17 += iM121873z2 + 4;
                    c38059n.m121847G(iM121873z2);
                }
                i16++;
            }
            c38059n.m121846F(i14);
            byte[] bArr = new byte[i17];
            C29662f c29662f2 = c29662f;
            int i19 = -1;
            int i24 = -1;
            int i25 = -1;
            int i26 = -1;
            int i27 = -1;
            int i28 = -1;
            int i29 = -1;
            int i34 = -1;
            float f13 = 1.0f;
            String strM121828a = null;
            int i35 = 0;
            int i36 = 0;
            while (i35 < iM121867t2) {
                int iM121867t3 = c38059n.m121867t() & 63;
                int iM121873z3 = c38059n.m121873z();
                int i37 = i15;
                C29662f c29662fM125283j = c29662f2;
                while (i37 < iM121873z3) {
                    boolean z14 = z13;
                    int iM121873z4 = c38059n.m121873z();
                    int i38 = iM121867t;
                    System.arraycopy(AbstractC39319n.f169167a, i15, bArr, i36, i13);
                    int i39 = i36 + 4;
                    System.arraycopy(c38059n.f163017a, c38059n.f163018b, bArr, i39, iM121873z4);
                    if (iM121867t3 == 32 && i37 == 0) {
                        c29662fM125283j = AbstractC39319n.m125283j(bArr, i39, i39 + iM121873z4);
                    } else {
                        if (iM121867t3 == 33 && i37 == 0) {
                            C39315j c39315jM125282i = AbstractC39319n.m125282i(bArr, i39, i39 + iM121873z4, c29662fM125283j);
                            i19 = c39315jM125282i.f169132a + 1;
                            i24 = c39315jM125282i.f169134c + 8;
                            i25 = c39315jM125282i.f169135d + 8;
                            int i44 = c39315jM125282i.f169140i;
                            int i45 = c39315jM125282i.f169141j;
                            i26 = i44;
                            int i46 = c39315jM125282i.f169142k;
                            float f14 = c39315jM125282i.f169138g;
                            int i47 = c39315jM125282i.f169139h;
                            C39313h c39313h = c39315jM125282i.f169133b;
                            if (c39313h != null) {
                                strM121828a = AbstractC38047b.m121828a(c39313h.f169121a, c39313h.f169122b, c39313h.f169123c, c39313h.f169124d, c39313h.f169125e, c39313h.f169126f);
                            }
                            i34 = i47;
                            f13 = f14;
                            i28 = i46;
                            i27 = i45;
                        } else if (iM121867t3 == 39 && i37 == 0 && (c11387o2M125281h = AbstractC39319n.m125281h(bArr, i39, i39 + iM121873z4)) != null && c29662fM125283j != null) {
                            i15 = 0;
                            i29 = c11387o2M125281h.f36515x == ((C39312g) ((AbstractC41023g0) c29662fM125283j.f121230x).get(0)).f169120b ? 4 : 5;
                        }
                        i15 = 0;
                    }
                    i36 = i39 + iM121873z4;
                    c38059n.m121847G(iM121873z4);
                    i37++;
                    z13 = z14;
                    iM121867t = i38;
                    i13 = 4;
                }
                i35++;
                c29662f2 = c29662fM125283j;
                i13 = 4;
            }
            return new C33656y(i17 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iM121867t + 1, i19, i24, i25, i26, i27, i28, i29, f13, i34, strM121828a, c29662f2);
        } catch (ArrayIndexOutOfBoundsException e5) {
            throw ParserException.m5049a(e5, "Error parsing".concat(z4 ? "L-HEVC config" : "HEVC config"));
        }
    }
}
