package ye3;

import af3.C0823a0;
import af3.C0834j;
import java.util.regex.Pattern;
import p012ab.C0690l0;
import pg3.C29205p;
import xe3.C38248k;

/* JADX INFO: renamed from: ye3.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C39483c implements InterfaceC39487g {

    /* JADX INFO: renamed from: a */
    public static final Pattern f169873a = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");

    @Override // ye3.InterfaceC39487g
    /* JADX INFO: renamed from: a */
    public final C29205p mo126141a(C38248k c38248k) {
        C0690l0 c0690l0 = c38248k.f163997e;
        c0690l0.m1739i();
        char cM1742l = c0690l0.m1742l();
        if (cM1742l == '\n') {
            c0690l0.m1739i();
            return new C29205p(new C0834j(), c0690l0.m1743m(), false, 15);
        }
        if (!f169873a.matcher(String.valueOf(cM1742l)).matches()) {
            return new C29205p(new C0823a0("\\"), c0690l0.m1743m(), false, 15);
        }
        c0690l0.m1739i();
        return new C29205p(new C0823a0(String.valueOf(cM1742l)), c0690l0.m1743m(), false, 15);
    }
}
