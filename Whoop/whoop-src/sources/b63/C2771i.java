package b63;

import i63.AbstractC18159b;
import i63.C18163d;
import i63.InterfaceC18165e;
import java.util.List;
import m83.C25271y;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: b63.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C2771i implements InterfaceC18165e {

    /* JADX INFO: renamed from: w */
    public static final C2771i f10908w = new C2771i();

    @Override // i63.InterfaceC18165e
    /* JADX INFO: renamed from: a */
    public final boolean mo7833a(C18163d c18163d) {
        if (c18163d.m52163f(AbstractC18159b.f70468a)) {
            return true;
        }
        if (!((List) c18163d.f70499c).isEmpty()) {
            c18163d = new C18163d(c18163d.f70477d, c18163d.f70478e, C25271y.f99162w);
        }
        String string = c18163d.toString();
        return AbstractC39421y.m125930O(string, "application/", false) && AbstractC39421y.m125920E(string, "+json", false);
    }
}
