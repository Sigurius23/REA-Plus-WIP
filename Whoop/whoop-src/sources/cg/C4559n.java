package cg;

import bp0.C3526n;
import c93.InterfaceC4339a;
import com.iterable.iterableapi.C5305b;
import l83.C23454a0;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: cg.n */
/* JADX INFO: loaded from: classes.dex */
public final class C4559n {
    /* JADX INFO: renamed from: a */
    public static C4560o m14242a(C4559n c4559n, String value) {
        final C4561p encoding = AbstractC4565t.f18380c;
        c4559n.getClass();
        AbstractC22676k.m65750j(value, "value");
        AbstractC22676k.m65750j(encoding, "encoding");
        try {
            final C4555j c4555j = new C4555j();
            final C5305b c5305b = new C5305b(value);
            c5305b.m16412b(new String[]{"://"}, new C4556k(c4555j, 0));
            c5305b.m16413c(new String[]{"/", "?", "#"}, new C4556k(c4555j, 1));
            final int i13 = 0;
            InterfaceC4339a interfaceC4339a = new InterfaceC4339a() { // from class: cg.l
                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    switch (i13) {
                        case 0:
                            C3526n c3526n = new C3526n(2, c4555j, encoding);
                            c5305b.m16413c(new String[]{"?", "#"}, c3526n);
                            break;
                        default:
                            C4558m c4558m = new C4558m(c4555j, encoding, 0);
                            c5305b.m16413c(new String[]{"#"}, c4558m);
                            break;
                    }
                    return C23454a0.f92919a;
                }
            };
            if (AbstractC39421y.m125924I(c5305b.f21637c, 0, 1, value, "/", false)) {
                interfaceC4339a.invoke();
            }
            final int i14 = 1;
            InterfaceC4339a interfaceC4339a2 = new InterfaceC4339a() { // from class: cg.l
                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    switch (i14) {
                        case 0:
                            C3526n c3526n = new C3526n(2, c4555j, encoding);
                            c5305b.m16413c(new String[]{"?", "#"}, c3526n);
                            break;
                        default:
                            C4558m c4558m = new C4558m(c4555j, encoding, 0);
                            c5305b.m16413c(new String[]{"#"}, c4558m);
                            break;
                    }
                    return C23454a0.f92919a;
                }
            };
            if (AbstractC39421y.m125924I(c5305b.f21637c, 0, 1, value, "?", false)) {
                interfaceC4339a2.invoke();
            }
            if (AbstractC39421y.m125924I(c5305b.f21637c, 0, 1, value, "#", false)) {
                c5305b.f21637c = 1 + c5305b.f21637c;
                c5305b.m16413c(new String[0], new C4558m(c4555j, encoding, 1));
            }
            return c4555j.m14239b();
        } catch (IllegalArgumentException e5) {
            throw new IllegalArgumentException(AbstractC11895b.m31996o("Cannot parse \"", value, "\" as a URL"), e5);
        }
    }
}
