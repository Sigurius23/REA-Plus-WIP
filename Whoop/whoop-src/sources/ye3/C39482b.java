package ye3;

import aa3.C0656u0;
import af3.C0823a0;
import af3.C0840p;
import java.util.regex.Pattern;
import p000.AbstractC11266d;
import p012ab.C0690l0;
import p047c9.C4320k;
import pg3.C29205p;
import xe3.C38248k;

/* JADX INFO: renamed from: ye3.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C39482b implements InterfaceC39487g {

    /* JADX INFO: renamed from: a */
    public static final Pattern f169871a = Pattern.compile("^[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*$");

    /* JADX INFO: renamed from: b */
    public static final Pattern f169872b = Pattern.compile("^([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)$");

    @Override // ye3.InterfaceC39487g
    /* JADX INFO: renamed from: a */
    public final C29205p mo126141a(C38248k c38248k) {
        String strM30461o;
        C0690l0 c0690l0 = c38248k.f163997e;
        c0690l0.m1739i();
        C4320k c4320kM1743m = c0690l0.m1743m();
        if (c0690l0.m1732b('>') > 0) {
            C0656u0 c0656u0M1734d = c0690l0.m1734d(c4320kM1743m, c0690l0.m1743m());
            String strM1644m = c0656u0M1734d.m1644m();
            c0690l0.m1739i();
            if (f169871a.matcher(strM1644m).matches()) {
                strM30461o = strM1644m;
            } else {
                strM30461o = f169872b.matcher(strM1644m).matches() ? AbstractC11266d.m30461o("mailto:", strM1644m) : null;
            }
            if (strM30461o != null) {
                C0840p c0840p = new C0840p(strM30461o, null);
                C0823a0 c0823a0 = new C0823a0(strM1644m);
                c0823a0.m2058h(c0656u0M1734d.m1646o());
                c0840p.m2055c(c0823a0);
                return new C29205p(c0840p, c0690l0.m1743m(), false, 15);
            }
        }
        return null;
    }
}
