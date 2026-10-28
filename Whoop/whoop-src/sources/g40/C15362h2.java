package g40;

import p000.AbstractC11266d;
import p294l3.C23254g;
import p412q3.C29869e0;
import p412q3.C29883q;
import p412q3.InterfaceC29873g0;
import p715kotlin.jvm.internal.AbstractC22676k;
import r41.AbstractC30924h;
import x30.C37886f;

/* JADX INFO: renamed from: g40.h2 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C15362h2 implements InterfaceC29873g0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57736a;

    public /* synthetic */ C15362h2(int i13) {
        this.f57736a = i13;
    }

    @Override // p412q3.InterfaceC29873g0
    /* JADX INFO: renamed from: a */
    public final C29869e0 mo43546a(C23254g text) {
        switch (this.f57736a) {
            case 0:
                AbstractC22676k.m65750j(text, "text");
                return new C29869e0(new C23254g(6, AbstractC11266d.m30461o("+", text.f92135x), null), new C15383l0(3));
            case 1:
                return new C29869e0(text, C29883q.f122109a);
            case 2:
                return AbstractC30924h.m95094t(text);
            case 3:
                AbstractC22676k.m65750j(text, "text");
                StringBuilder sb4 = new StringBuilder();
                String str = text.f92135x;
                int i13 = 0;
                int i14 = 0;
                while (i13 < str.length()) {
                    int i15 = i14 + 1;
                    sb4.append(str.charAt(i13));
                    if (i14 == 2) {
                        sb4.append(" - ");
                    }
                    i13++;
                    i14 = i15;
                }
                String string = sb4.toString();
                AbstractC22676k.m65749i(string, "toString(...)");
                return new C29869e0(new C23254g(6, string, null), new C37886f(1));
            default:
                AbstractC22676k.m65750j(text, "text");
                StringBuilder sb5 = new StringBuilder();
                String str2 = text.f92135x;
                int i16 = 0;
                int i17 = 0;
                while (i16 < str2.length()) {
                    int i18 = i17 + 1;
                    sb5.append(str2.charAt(i16));
                    if (i17 % 4 == 3 && i17 < 33) {
                        sb5.append(" ");
                    }
                    i16++;
                    i17 = i18;
                }
                String string2 = sb5.toString();
                AbstractC22676k.m65749i(string2, "toString(...)");
                return new C29869e0(new C23254g(6, string2, null), new C37886f(5));
        }
    }
}
