package p499t9;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;
import p199ho.C17527h;
import p576w8.C36931a;
import p576w8.C36932b;
import p607x8.AbstractC38065t;
import p607x8.C38059n;
import p607x8.InterfaceC38049d;
import qa.C30096a;
import qa.C30106k;
import qa.InterfaceC30107l;
import va3.AbstractC35849g;
import za.AbstractC40219g;

/* JADX INFO: renamed from: t9.z */
/* JADX INFO: loaded from: classes5.dex */
public final class C33657z implements InterfaceC30107l {

    /* JADX INFO: renamed from: w */
    public final C38059n f140473w;

    public C33657z(int i13) {
        switch (i13) {
            case 1:
                this.f140473w = new C38059n();
                break;
            default:
                this.f140473w = new C38059n(10);
                break;
        }
    }

    @Override // qa.InterfaceC30107l
    /* JADX INFO: renamed from: c0 */
    public int mo91110c0() {
        return 2;
    }

    @Override // qa.InterfaceC30107l
    /* JADX INFO: renamed from: k */
    public void mo91120k(byte[] bArr, int i13, int i14, C30106k c30106k, InterfaceC38049d interfaceC38049d) {
        C36932b c36932bM118550a;
        C38059n c38059n = this.f140473w;
        c38059n.m121844D(i13 + i14, bArr);
        c38059n.m121846F(i13);
        ArrayList arrayList = new ArrayList();
        while (c38059n.m121848a() > 0) {
            AbstractC35849g.m113803e(c38059n.m121848a() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int iM121854g = c38059n.m121854g();
            if (c38059n.m121854g() == 1987343459) {
                int i15 = iM121854g - 8;
                CharSequence charSequenceM129107f = null;
                C36931a c36931aM49766a = null;
                while (i15 > 0) {
                    AbstractC35849g.m113803e(i15 >= 8, "Incomplete vtt cue box header found.");
                    int iM121854g2 = c38059n.m121854g();
                    int iM121854g3 = c38059n.m121854g();
                    int i16 = iM121854g2 - 8;
                    byte[] bArr2 = c38059n.f163017a;
                    int i17 = c38059n.f163018b;
                    int i18 = AbstractC38065t.f163031a;
                    String str = new String(bArr2, i17, i16, StandardCharsets.UTF_8);
                    c38059n.m121847G(i16);
                    i15 = (i15 - 8) - i16;
                    if (iM121854g3 == 1937011815) {
                        C17527h c17527h = new C17527h();
                        AbstractC40219g.m129106e(str, c17527h);
                        c36931aM49766a = c17527h.m49766a();
                    } else if (iM121854g3 == 1885436268) {
                        charSequenceM129107f = AbstractC40219g.m129107f(null, str.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequenceM129107f == null) {
                    charSequenceM129107f = "";
                }
                if (c36931aM49766a != null) {
                    c36931aM49766a.f158009a = charSequenceM129107f;
                    c36932bM118550a = c36931aM49766a.m118550a();
                } else {
                    Pattern pattern = AbstractC40219g.f173674a;
                    C17527h c17527h2 = new C17527h();
                    c17527h2.f67793c = charSequenceM129107f;
                    c36932bM118550a = c17527h2.m49766a().m118550a();
                }
                arrayList.add(c36932bM118550a);
            } else {
                c38059n.m121847G(iM121854g - 8);
            }
        }
        interfaceC38049d.accept(new C30096a(arrayList, -9223372036854775807L, -9223372036854775807L));
    }
}
