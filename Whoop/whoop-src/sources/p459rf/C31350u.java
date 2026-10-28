package p459rf;

import ae3.AbstractC0800h;
import androidx.room.C1832u;
import bg.AbstractC3210e;
import bg.C3217l;
import cg.C4552g;
import cg.C4560o;
import cg.C4566u;
import cg.C4567v;
import cg.C4569x;
import cg.C4570y;
import fe3.AbstractC14421e;
import hg3.AbstractC17269i;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import m83.AbstractC25265s;
import m83.C25271y;
import ne3.AbstractC26602a;
import ne3.C26616h;
import ne3.C26622k;
import ne3.C26624l;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29140r;
import pf.C29139q;
import pf.InterfaceC29142t;
import tg.C33770b;
import tg.C33775g;
import tg.InterfaceC33773e;
import ud3.C34802b1;
import ud3.C34807d0;
import ud3.C34810e0;
import ud3.C34827m;
import ud3.C34830n0;
import ud3.C34832o0;
import ud3.C34850x0;
import ud3.InterfaceC34803c;
import wb3.AbstractC37056f;
import yb3.AbstractC39397a;

/* JADX INFO: renamed from: rf.u */
/* JADX INFO: loaded from: classes6.dex */
public final class C31350u implements InterfaceC34803c {

    /* JADX INFO: renamed from: b */
    public final InterfaceC29142t f128993b;

    public C31350u(InterfaceC29142t selector) {
        AbstractC22676k.m65750j(selector, "selector");
        this.f128993b = selector;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00e4  */
    @Override // ud3.InterfaceC34803c
    /* JADX INFO: renamed from: a */
    public final C34832o0 mo31437a(C34802b1 c34802b1, C34850x0 c34850x0) {
        String str;
        List<C34827m> list;
        String lowerCase;
        C34832o0 c34832o0 = c34850x0.f146789w;
        if (c34832o0.f146714c.m109863a("Proxy-Authorization") == null) {
            C34810e0 c34810e0 = c34832o0.f146712a;
            C3217l c3217l = C3217l.f12583c;
            ArrayList arrayList = new ArrayList();
            C4566u c4566u = C4566u.f18382w;
            C33775g c33775g = C33775g.f141359i;
            AbstractC17269i.m48914s(arrayList, c4566u, new C1832u(1, c33775g, InterfaceC33773e.class, "encodableFromDecoded", "encodableFromDecoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;", 0, 6));
            AbstractC17269i.m48914s(arrayList, C4567v.f18383w, new C1832u(1, c33775g, InterfaceC33773e.class, "encodableFromEncoded", "encodableFromEncoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;", 0, 7));
            C4552g c4552g = new C4552g();
            C33770b c33770b = C33770b.f141347f;
            C3217l c3217l2 = new C3217l(c34810e0.f146562a, c34810e0.f146566e);
            AbstractC3210e abstractC3210eM118967V = AbstractC37056f.m118967V(c34810e0.f146565d);
            int i13 = c34810e0.f146566e;
            List listM74093D1 = AbstractC25265s.m74093D1(arrayList);
            AbstractC29140r abstractC29140rMo711q = this.f128993b.mo711q(new C4560o(c3217l2, abstractC3210eM118967V, i13, new C4569x(listM74093D1, false), c4552g.m14233b(), new C4570y(c33770b, c33770b), null));
            C4570y c4570y = abstractC29140rMo711q instanceof C29139q ? ((C29139q) abstractC29140rMo711q).f117932a.f18373f : null;
            if (c4570y != null) {
                C34807d0 c34807d0 = c34850x0.f146777F;
                int i14 = c34850x0.f146792z;
                if (i14 != 401) {
                    if (i14 != 407) {
                        list = C25271y.f99162w;
                    } else {
                        str = "Proxy-Authenticate";
                    }
                    for (C34827m c34827m : list) {
                        lowerCase = c34827m.f146675a.toLowerCase(Locale.ROOT);
                        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
                        if (!lowerCase.equals("okhttp-preemptive") || c34827m.f146675a.equals("Basic")) {
                            C34830n0 c34830n0M109907b = c34832o0.m109907b();
                            String username = c4570y.f18389a.f141348a;
                            String password = c4570y.f18390b.f141348a;
                            Charset charset = AbstractC39397a.f169550e;
                            AbstractC22676k.m65750j(username, "username");
                            AbstractC22676k.m65750j(password, "password");
                            AbstractC22676k.m65750j(charset, "charset");
                            String str2 = username + ':' + password;
                            C26622k c26622k = C26624l.f105882z;
                            AbstractC22676k.m65750j(str2, "<this>");
                            byte[] bytes = str2.getBytes(charset);
                            AbstractC22676k.m65749i(bytes, "getBytes(...)");
                            new C26624l(bytes);
                            c34830n0M109907b.m109902c("Proxy-Authorization", "Basic ".concat(AbstractC26602a.m79146b(bytes)));
                            return new C34832o0(c34830n0M109907b);
                        }
                    }
                } else {
                    str = "WWW-Authenticate";
                }
                String str3 = str;
                C26624l c26624l = AbstractC0800h.f2949a;
                ArrayList arrayList2 = new ArrayList();
                int size = c34807d0.size();
                for (int i15 = 0; i15 < size; i15++) {
                    if (str3.equalsIgnoreCase(c34807d0.m109864c(i15))) {
                        C26616h c26616h = new C26616h();
                        c26616h.m79232u1(c34807d0.m109867g(i15));
                        try {
                            AbstractC0800h.m1934b(c26616h, arrayList2);
                        } catch (EOFException e5) {
                            AbstractC14421e abstractC14421e = AbstractC14421e.f52594a;
                            AbstractC14421e.f52594a.mo41121j("Unable to parse challenge", 5, e5);
                        }
                    }
                }
                list = arrayList2;
                while (r0.hasNext()) {
                    lowerCase = c34827m.f146675a.toLowerCase(Locale.ROOT);
                    AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
                    if (!lowerCase.equals("okhttp-preemptive")) {
                    }
                    C34830n0 c34830n0M109907b2 = c34832o0.m109907b();
                    String username2 = c4570y.f18389a.f141348a;
                    String password2 = c4570y.f18390b.f141348a;
                    Charset charset2 = AbstractC39397a.f169550e;
                    AbstractC22676k.m65750j(username2, "username");
                    AbstractC22676k.m65750j(password2, "password");
                    AbstractC22676k.m65750j(charset2, "charset");
                    String str4 = username2 + ':' + password2;
                    C26622k c26622k2 = C26624l.f105882z;
                    AbstractC22676k.m65750j(str4, "<this>");
                    byte[] bytes2 = str4.getBytes(charset2);
                    AbstractC22676k.m65749i(bytes2, "getBytes(...)");
                    new C26624l(bytes2);
                    c34830n0M109907b2.m109902c("Proxy-Authorization", "Basic ".concat(AbstractC26602a.m79146b(bytes2)));
                    return new C34832o0(c34830n0M109907b2);
                }
            }
        }
        return null;
    }
}
