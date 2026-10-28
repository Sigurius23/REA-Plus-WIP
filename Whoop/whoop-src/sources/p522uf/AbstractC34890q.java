package p522uf;

import java.util.LinkedHashMap;
import m83.AbstractC25247g0;
import nf.C26647a;
import nf.InterfaceC26651e;
import p499t9.C33623c0;
import p508ty.C34249c;
import p521ue.C34856b;

/* JADX INFO: renamed from: uf.q */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC34890q {

    /* JADX INFO: renamed from: a */
    public static final C34889p f146936a;

    static {
        C34889p c34889p = C34889p.f146932d;
        C33623c0 c33623c0 = new C33623c0();
        InterfaceC26651e[] interfaceC26651eArr = {C26647a.f105935a};
        C34249c c34249c = new C34249c(interfaceC26651eArr, 7);
        int iM73988W = AbstractC25247g0.m73988W(1);
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        InterfaceC26651e interfaceC26651e = interfaceC26651eArr[0];
        linkedHashMap.put(new C34856b(interfaceC26651e.mo79292c()), interfaceC26651e);
        f146936a = new C34889p(c34249c, linkedHashMap, c33623c0);
    }
}
