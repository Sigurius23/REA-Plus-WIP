package i63;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import m83.C25271y;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: i63.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C18163d extends AbstractC18171j {

    /* JADX INFO: renamed from: f */
    public static final C18163d f70476f = new C18163d("*", "*", C25271y.f99162w);

    /* JADX INFO: renamed from: d */
    public final String f70477d;

    /* JADX INFO: renamed from: e */
    public final String f70478e;

    public C18163d(String str, String str2, String str3, List list) {
        super(str3, list);
        this.f70477d = str;
        this.f70478e = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18163d)) {
            return false;
        }
        C18163d c18163d = (C18163d) obj;
        return AbstractC39421y.m125921F(this.f70477d, c18163d.f70477d, true) && AbstractC39421y.m125921F(this.f70478e, c18163d.f70478e, true) && AbstractC22676k.m65745e((List) this.f70499c, (List) c18163d.f70499c);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m52163f(C18163d pattern) {
        boolean zM125921F;
        AbstractC22676k.m65750j(pattern, "pattern");
        String str = pattern.f70478e;
        String str2 = pattern.f70477d;
        if (!AbstractC22676k.m65745e(str2, "*") && !AbstractC39421y.m125921F(str2, this.f70477d, true)) {
            return false;
        }
        if (!AbstractC22676k.m65745e(str, "*") && !AbstractC39421y.m125921F(str, this.f70478e, true)) {
            return false;
        }
        for (C18170i c18170i : (List) pattern.f70499c) {
            String str3 = c18170i.f70495a;
            String str4 = c18170i.f70496b;
            if (!AbstractC22676k.m65745e(str3, "*")) {
                String strM52169b = m52169b(str3);
                zM125921F = AbstractC22676k.m65745e(str4, "*") ? strM52169b != null : AbstractC39421y.m125921F(strM52169b, str4, true);
            } else if (!AbstractC22676k.m65745e(str4, "*")) {
                List list = (List) this.f70499c;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (AbstractC39421y.m125921F(((C18170i) it.next()).f70496b, str4, true)) {
                            }
                        }
                    }
                }
            }
            if (!zM125921F) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        if (yb3.AbstractC39421y.m125921F(r1.f70496b, r7, true) != false) goto L23;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final i63.C18163d m52164g(java.lang.String r7) {
        /*
            r6 = this;
            java.util.Collection r0 = r6.f70499c
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            java.lang.String r2 = "charset"
            if (r1 == 0) goto L59
            r3 = 1
            if (r1 == r3) goto L41
            r1 = r0
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r4 = r1 instanceof java.util.Collection
            if (r4 == 0) goto L20
            r4 = r1
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L20
            goto L59
        L20:
            java.util.Iterator r1 = r1.iterator()
        L24:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L59
            java.lang.Object r4 = r1.next()
            i63.i r4 = (i63.C18170i) r4
            java.lang.String r5 = r4.f70495a
            boolean r5 = yb3.AbstractC39421y.m125921F(r5, r2, r3)
            if (r5 == 0) goto L24
            java.lang.String r4 = r4.f70496b
            boolean r4 = yb3.AbstractC39421y.m125921F(r4, r7, r3)
            if (r4 == 0) goto L24
            goto L58
        L41:
            r1 = 0
            java.lang.Object r1 = r0.get(r1)
            i63.i r1 = (i63.C18170i) r1
            java.lang.String r4 = r1.f70495a
            boolean r4 = yb3.AbstractC39421y.m125921F(r4, r2, r3)
            if (r4 == 0) goto L59
            java.lang.String r1 = r1.f70496b
            boolean r1 = yb3.AbstractC39421y.m125921F(r1, r7, r3)
            if (r1 == 0) goto L59
        L58:
            return r6
        L59:
            i63.d r1 = new i63.d
            java.io.Serializable r3 = r6.f70498b
            java.lang.String r3 = (java.lang.String) r3
            java.util.Collection r0 = (java.util.Collection) r0
            i63.i r4 = new i63.i
            r4.<init>(r2, r7)
            java.util.ArrayList r7 = m83.AbstractC25265s.m74128f1(r4, r0)
            java.lang.String r0 = r6.f70477d
            java.lang.String r2 = r6.f70478e
            r1.<init>(r0, r2, r3, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i63.C18163d.m52164g(java.lang.String):i63.d");
    }

    public final int hashCode() {
        Locale locale = Locale.ROOT;
        String lowerCase = this.f70477d.toLowerCase(locale);
        AbstractC22676k.m65749i(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        int iHashCode = lowerCase.hashCode();
        String lowerCase2 = this.f70478e.toLowerCase(locale);
        AbstractC22676k.m65749i(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return (((List) this.f70499c).hashCode() * 31) + lowerCase2.hashCode() + (iHashCode * 31) + iHashCode;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C18163d(String contentType, String contentSubtype, List parameters) {
        this(contentType, contentSubtype, contentType + '/' + contentSubtype, parameters);
        AbstractC22676k.m65750j(contentType, "contentType");
        AbstractC22676k.m65750j(contentSubtype, "contentSubtype");
        AbstractC22676k.m65750j(parameters, "parameters");
    }
}
