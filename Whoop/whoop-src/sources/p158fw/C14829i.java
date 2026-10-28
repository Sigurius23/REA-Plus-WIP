package p158fw;

import ae3.C0801i;
import e10.C12554k0;
import io.getstream.chat.android.client.p224di.ChatModule$baseClientBuilder$1$1;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l83.C23465k;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import ne3.AbstractC26604b;
import ne3.C26616h;
import ne3.C26617h0;
import p000.AbstractC11266d;
import p002a0.C0030i1;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.AbstractC34846v0;
import ud3.C34807d0;
import ud3.C34818h0;
import ud3.C34832o0;
import ud3.C34850x0;
import ud3.InterfaceC34813f0;
import ud3.InterfaceC34816g0;
import wb3.AbstractC37056f;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: fw.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C14829i implements InterfaceC34816g0 {

    /* JADX INFO: renamed from: w */
    public final ChatModule$baseClientBuilder$1$1 f55093w;

    /* JADX INFO: renamed from: x */
    public final C12554k0 f55094x;

    public C14829i(ChatModule$baseClientBuilder$1$1 chatModule$baseClientBuilder$1$1) {
        C14828h c14828h = new C14828h();
        this.f55093w = chatModule$baseClientBuilder$1$1;
        this.f55094x = new C12554k0(c14828h, 16);
    }

    @Override // ud3.InterfaceC34816g0
    public final C34850x0 intercept(InterfaceC34813f0 chain) {
        String str;
        Object next;
        Iterable iterableM118958J;
        C34818h0 contentType;
        String str2;
        Charset charsetM109889a;
        AbstractC22676k.m65750j(chain, "chain");
        C0801i c0801i = (C0801i) chain;
        C34832o0 request = c0801i.f2955e;
        C12554k0 c12554k0 = this.f55094x;
        c12554k0.getClass();
        AbstractC22676k.m65750j(request, "request");
        AbstractC34846v0 abstractC34846v0 = request.f146715d;
        C14828h c14828h = (C14828h) c12554k0.f42881x;
        List<AbstractC14827g> list = (List) c14828h.f55090c;
        ArrayList arrayList = new ArrayList();
        for (AbstractC14827g abstractC14827g : list) {
            if (AbstractC22676k.m65745e(abstractC14827g, C14822b.f55082b)) {
                iterableM118958J = AbstractC37056f.m118958J("curl");
            } else if (AbstractC22676k.m65745e(abstractC14827g, C14826f.f55086b)) {
                iterableM118958J = AbstractC37056f.m118958J(String.format("\"%1$s\"", Arrays.copyOf(new Object[]{request.f146712a.f146570i}, 1)));
            } else if (AbstractC22676k.m65745e(abstractC14827g, C14823c.f55083b)) {
                iterableM118958J = ((C14830j) c14828h.f55091d).f55096a;
            } else if (AbstractC22676k.m65745e(abstractC14827g, C14821a.f55081b)) {
                if (abstractC34846v0 != null) {
                    try {
                        C26616h c26616h = new C26616h();
                        C34818h0 contentType2 = abstractC34846v0.getContentType();
                        Charset charsetDefaultCharset = Charset.defaultCharset();
                        if (contentType2 == null || (charsetM109889a = contentType2.m109889a(charsetDefaultCharset)) == null) {
                            AbstractC22676k.m65749i(charsetDefaultCharset, "default");
                        } else {
                            charsetDefaultCharset = charsetM109889a;
                        }
                        long j7 = c14828h.f55088a;
                        if (j7 > 0) {
                            C26617h0 c26617h0M79157b = AbstractC26604b.m79157b(new C14832l(c26616h, j7));
                            abstractC34846v0.writeTo(c26617h0M79157b);
                            c26617h0M79157b.flush();
                        } else {
                            abstractC34846v0.writeTo(c26616h);
                        }
                        str2 = String.format("-d '%1$s'", Arrays.copyOf(new Object[]{c26616h.mo79183H0(charsetDefaultCharset)}, 1));
                    } catch (IOException e5) {
                        str2 = "Error while reading body: " + e5;
                    }
                    iterableM118958J = AbstractC37056f.m118958J(str2);
                } else {
                    iterableM118958J = C25271y.f99162w;
                }
            } else if (AbstractC22676k.m65745e(abstractC14827g, C14825e.f55085b)) {
                String str3 = request.f146713b;
                Locale locale = Locale.getDefault();
                AbstractC22676k.m65749i(locale, "getDefault()");
                String upperCase = str3.toUpperCase(locale);
                AbstractC22676k.m65749i(upperCase, "this as java.lang.String).toUpperCase(locale)");
                iterableM118958J = AbstractC37056f.m118958J(String.format("-X %1$s", Arrays.copyOf(new Object[]{upperCase}, 1)));
            } else {
                if (!AbstractC22676k.m65745e(abstractC14827g, C14824d.f55084b)) {
                    throw new NoWhenBranchMatchedException();
                }
                C34807d0 c34807d0 = request.f146714c;
                ArrayList<C14831k> arrayList2 = new ArrayList(AbstractC25267u.m74163i0(c34807d0, 10));
                Iterator it = c34807d0.iterator();
                while (true) {
                    C0030i1 c0030i1 = (C0030i1) it;
                    if (!c0030i1.hasNext()) {
                        break;
                    }
                    C23465k c23465k = (C23465k) c0030i1.next();
                    arrayList2.add(new C14831k((String) c23465k.f92937w, (String) c23465k.f92938x));
                }
                ArrayList<C14831k> arrayList3 = new ArrayList();
                for (C14831k c14831k : arrayList2) {
                    Iterator it3 = c14828h.f55089b.iterator();
                    if (it3.hasNext()) {
                        throw AbstractC11266d.m30454h(it3);
                    }
                    if (c14831k != null) {
                        arrayList3.add(c14831k);
                    }
                }
                Iterator it4 = arrayList3.iterator();
                do {
                    str = null;
                    if (!it4.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it4.next();
                } while (!AbstractC39421y.m125921F(((C14831k) next).f55097a, "Content-Type", false));
                C14831k c14831k2 = (C14831k) next;
                if (abstractC34846v0 != null && (contentType = abstractC34846v0.getContentType()) != null) {
                    str = contentType.f146591a;
                }
                if (c14831k2 == null && str != null) {
                    arrayList3 = AbstractC25265s.m74129g1(arrayList3, AbstractC37056f.m118958J(new C14831k("Content-Type", str)));
                }
                ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(arrayList3, 10));
                for (C14831k c14831k3 : arrayList3) {
                    arrayList4.add(String.format("-H \"%1$s:%2$s\"", Arrays.copyOf(new Object[]{c14831k3.f55097a, c14831k3.f55098b}, 2)));
                }
                iterableM118958J = arrayList4;
            }
            AbstractC25265s.m74141p0(arrayList, iterableM118958J);
        }
        this.f55093w.log(AbstractC25265s.m74110N0(arrayList, (String) c14828h.f55092e, null, null, null, 62));
        return c0801i.m1939b(request);
    }
}
