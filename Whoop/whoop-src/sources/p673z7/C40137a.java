package p673z7;

import aws.smithy.kotlin.runtime.serde.DeserializationException;
import c93.InterfaceC4339a;
import com.squareup.wire.AbstractC5583n;
import com.whoop.data.remote.domain.dto.DateTimeRange;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import i93.C18277c;
import iz0.C21045d;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import live.hms.video.factories.MediaConstraintsFactory;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import p000.AbstractC11266d;
import p095dp.AbstractC12240d;
import p097ds.C12320w;
import p100dw.C12396a;
import p100dw.C12399d;
import p251jg.AbstractC21651d;
import p251jg.C21650c;
import p251jg.C21654g;
import p251jg.C21655h;
import p251jg.C21656i;
import p251jg.C21657j;
import p251jg.C21658k;
import p251jg.C21659l;
import p251jg.C21660m;
import p251jg.C21661n;
import p251jg.C21662o;
import p251jg.C21663p;
import p251jg.C21665r;
import p251jg.EnumC21664q;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.AbstractC35846d;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: z7.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C40137a {

    /* JADX INFO: renamed from: a */
    public int f173192a;

    /* JADX INFO: renamed from: b */
    public Object f173193b;

    /* JADX INFO: renamed from: c */
    public Object f173194c;

    /* JADX INFO: renamed from: d */
    public Object f173195d;

    public C40137a(int i13) {
        switch (i13) {
            case 3:
                C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(Float.valueOf(0.0f));
                this.f173193b = c13045h2M36593c;
                this.f173195d = AbstractC13091v.m36598h(c13045h2M36593c);
                break;
            default:
                C12399d c12399d = new C12399d(1.0d, -1);
                C12396a c12396a = C12396a.f41986w;
                this.f173193b = c12399d;
                this.f173194c = c12396a;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0080 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:18:0x0081  */
    /* JADX WARN: Code duplicated, block: B:20:0x0085  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0081 -> B:19:0x0083). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public static final java.lang.Object m128681a(p673z7.C40137a r11, float r12, float r13, s83.AbstractC32269c r14) {
        /*
            r11.getClass()
            boolean r0 = r14 instanceof n53.C26321f
            if (r0 == 0) goto L16
            r0 = r14
            n53.f r0 = (n53.C26321f) r0
            int r1 = r0.f104642I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f104642I = r1
            goto L1b
        L16:
            n53.f r0 = new n53.f
            r0.<init>(r11, r14)
        L1b:
            java.lang.Object r14 = r0.f104640G
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f104642I
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            int r11 = r0.f104638E
            long r12 = r0.f104639F
            int r2 = r0.f104646z
            float r4 = r0.f104645y
            float r5 = r0.f104644x
            z7.a r6 = r0.f104643w
            p505ts.AbstractC34132o.m107864I(r14)
            r14 = r2
            r9 = r12
            r13 = r4
            r12 = r5
            r4 = r9
            goto L83
        L3b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L43:
            p505ts.AbstractC34132o.m107864I(r14)
            r4 = 200(0xc8, double:9.9E-322)
            r14 = 50
            long r6 = (long) r14
            long r4 = r4 / r6
            r2 = 2
            long r6 = (long) r2
            long r4 = r4 / r6
            r2 = 0
        L50:
            int r6 = r11.f173192a
            int r6 = r6 + r3
            r11.f173192a = r6
            float r6 = (float) r2
            float r7 = r13 - r12
            float r7 = r7 * r6
            float r6 = (float) r14
            float r7 = r7 / r6
            float r7 = r7 + r12
            java.lang.Object r6 = r11.f173193b
            ec3.h2 r6 = (ec3.C13045h2) r6
            java.lang.Float r8 = new java.lang.Float
            r8.<init>(r7)
            r6.getClass()
            r7 = 0
            r6.m36571k(r7, r8)
            r0.f104643w = r11
            r0.f104644x = r12
            r0.f104645y = r13
            r0.f104646z = r14
            r0.f104639F = r4
            r0.f104638E = r2
            r0.f104642I = r3
            java.lang.Object r6 = bc3.AbstractC3034m0.m8782b(r4, r0)
            if (r6 != r1) goto L81
            return r1
        L81:
            r6 = r11
            r11 = r2
        L83:
            if (r11 == r14) goto L89
            int r2 = r11 + 1
            r11 = r6
            goto L50
        L89:
            l83.a0 r11 = l83.C23454a0.f92919a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p673z7.C40137a.m128681a(z7.a, float, float, s83.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: e */
    public static void m128682e(C40137a c40137a, String str, int i13, int i14) {
        if ((i14 & 2) != 0) {
            i13 = c40137a.f173192a;
        }
        throw new DeserializationException(AbstractC11266d.m30456j(i13, "Unexpected JSON token at offset ", "; ", str), null);
    }

    /* JADX INFO: renamed from: b */
    public void m128683b(char c3) {
        byte[] bArr = (byte[]) this.f173193b;
        int i13 = this.f173192a;
        char c7 = (char) bArr[i13];
        if (c7 == c3) {
            this.f173192a = i13 + 1;
            return;
        }
        m128682e(this, ("Unexpected char `" + c7 + "` expected `" + c3 + '`').toString(), i13, 4);
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public void m128684c() {
        m128683b(']');
        C21665r c21665r = (C21665r) this.f173195d;
        EnumC21664q enumC21664q = (EnumC21664q) AbstractC12240d.m34064b0(c21665r.f83185a);
        boolean z4 = enumC21664q == EnumC21664q.f83182x || enumC21664q == EnumC21664q.f83183y;
        int i13 = this.f173192a - 1;
        if (z4) {
            c21665r.f83186b.add(new C21650c(2));
        } else {
            m128682e(this, "Unexpected close `]` encountered", i13, 4);
            throw null;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m128685d() {
        m128683b('}');
        C21665r c21665r = (C21665r) this.f173195d;
        EnumC21664q enumC21664q = (EnumC21664q) AbstractC12240d.m34064b0(c21665r.f83185a);
        boolean z4 = enumC21664q == EnumC21664q.f83184z || enumC21664q == EnumC21664q.f83178E;
        int i13 = this.f173192a - 1;
        if (z4) {
            c21665r.f83186b.add(new C21650c(3));
        } else {
            m128682e(this, "Unexpected close `}` encountered", i13, 4);
            throw null;
        }
    }

    /* JADX INFO: renamed from: f */
    public Long m128686f() {
        Long l7 = (Long) this.f173195d;
        if (l7 == null) {
            return null;
        }
        long jLongValue = l7.longValue();
        long jLongValue2 = ((Number) ((InterfaceC4339a) this.f173194c).invoke()).longValue();
        double d3 = jLongValue;
        C12399d c12399d = (C12399d) this.f173193b;
        int i13 = c12399d.f41994b;
        double dPow = (((i13 == -1 ? 0.0d : Math.pow(2.0d, i13) * c12399d.f41993a) * 1000) + d3) - jLongValue2;
        if (dPow <= 0.0d) {
            return null;
        }
        return Long.valueOf((long) Math.ceil(dPow / 1000.0d));
    }

    /* JADX INFO: renamed from: g */
    public Character m128687g() {
        while (true) {
            Character chM128692l = m128692l();
            if (chM128692l == null || !AbstractC35846d.m113784i(chM128692l.charValue())) {
                break;
            }
            this.f173192a++;
        }
        return m128692l();
    }

    /* JADX INFO: renamed from: h */
    public char m128688h() {
        char cM128693m = m128693m();
        this.f173192a++;
        return cM128693m;
    }

    /* JADX INFO: renamed from: i */
    public AbstractC5583n m128689i() {
        AbstractC5583n abstractC5583nM128691k = m128691k();
        this.f173194c = null;
        C21665r c21665r = (C21665r) this.f173195d;
        List list = c21665r.f83186b;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(c21665r.f83185a);
        }
        list.clear();
        return abstractC5583nM128691k;
    }

    /* JADX INFO: renamed from: j */
    public void m128690j(Throwable th3) {
        ((C12320w) this.f173193b).m34248k(th3);
    }

    /* JADX INFO: renamed from: k */
    public AbstractC5583n m128691k() {
        AbstractC5583n abstractC5583nM128698r;
        AbstractC5583n abstractC5583n = (AbstractC5583n) this.f173194c;
        if (abstractC5583n != null) {
            return abstractC5583n;
        }
        try {
            int iOrdinal = ((EnumC21664q) AbstractC12240d.m34064b0(((C21665r) this.f173195d).f83185a)).ordinal();
            if (iOrdinal == 0) {
                abstractC5583nM128698r = m128698r();
            } else if (iOrdinal == 1) {
                abstractC5583nM128698r = m128700t();
            } else if (iOrdinal == 2) {
                abstractC5583nM128698r = m128701u();
            } else if (iOrdinal == 3) {
                abstractC5583nM128698r = m128703w();
            } else if (iOrdinal == 4) {
                abstractC5583nM128698r = m128704x();
            } else {
                if (iOrdinal != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                abstractC5583nM128698r = m128702v();
            }
            this.f173194c = abstractC5583nM128698r;
            return abstractC5583nM128698r;
        } catch (DeserializationException e5) {
            throw e5;
        } catch (Exception e13) {
            throw new DeserializationException(e13);
        }
    }

    /* JADX INFO: renamed from: l */
    public Character m128692l() {
        Byte bM74082w0 = AbstractC25260n.m74082w0(this.f173192a, (byte[]) this.f173193b);
        if (bM74082w0 != null) {
            return Character.valueOf((char) bM74082w0.byteValue());
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public char m128693m() {
        Character chM128692l = m128692l();
        if (chM128692l != null) {
            return chM128692l.charValue();
        }
        throw new IllegalStateException("Unexpected EOF");
    }

    /* JADX INFO: renamed from: n */
    public void m128694n(StringBuilder sb4) {
        while (AbstractC25265s.m74155w0(AbstractC21651d.f83163a, m128692l())) {
            sb4.append(m128688h());
        }
    }

    /* JADX INFO: renamed from: o */
    public void m128695o(String str, AbstractC5583n abstractC5583n) {
        for (int i13 = 0; i13 < str.length(); i13++) {
            m128683b(str.charAt(i13));
        }
    }

    /* JADX INFO: renamed from: p */
    public C21660m m128696p() {
        char cM128693m = m128693m();
        if (cM128693m != '\"') {
            m128705y(Character.valueOf(cM128693m), "\"");
            throw null;
        }
        String strM128697q = m128697q();
        C21665r c21665r = (C21665r) this.f173195d;
        c21665r.f83186b.add(new C21650c(4));
        return new C21660m(strM128697q);
    }

    /* JADX INFO: renamed from: q */
    public String m128697q() {
        byte[] bArr = (byte[]) this.f173193b;
        m128683b('\"');
        int i13 = this.f173192a;
        char cM128693m = m128693m();
        boolean z4 = false;
        while (cM128693m != '\"') {
            if (cM128693m == '\\') {
                m128688h();
                char cM128688h = m128688h();
                if (cM128688h != '\"' && cM128688h != '/' && cM128688h != '\\' && cM128688h != 'b' && cM128688h != 'f' && cM128688h != 'n' && cM128688h != 'r' && cM128688h != 't') {
                    if (cM128688h != 'u') {
                        m128682e(this, "Invalid escape character: `" + cM128688h + '`', this.f173192a - 1, 4);
                        throw null;
                    }
                    int i14 = this.f173192a;
                    int i15 = i14 + 4;
                    if (i15 >= bArr.length) {
                        m128682e(this, "Unexpected EOF reading escaped unicode string", i14, 4);
                        throw null;
                    }
                    this.f173192a = i15;
                }
                z4 = true;
            } else {
                Set set = AbstractC21651d.f83163a;
                if (cM128693m >= 0 && cM128693m < ' ') {
                    m128682e(this, "Unexpected control character: `" + cM128693m + '`', 0, 6);
                    throw null;
                }
                this.f173192a++;
            }
            cM128693m = m128693m();
        }
        String strM125918C = AbstractC39421y.m125918C(i13, this.f173192a, 4, bArr);
        m128683b('\"');
        if (!z4) {
            return strM125918C;
        }
        try {
            return AbstractC21651d.m60922a(strM125918C);
        } catch (Exception e5) {
            String message = e5.getMessage();
            if (message == null) {
                message = "Invalid escaped string";
            }
            m128682e(this, message, i13 - 1, 4);
            throw null;
        }
    }

    /* JADX INFO: renamed from: r */
    public AbstractC5583n m128698r() {
        C21665r c21665r = (C21665r) this.f173195d;
        Character chM128687g = m128687g();
        if (chM128687g != null && chM128687g.charValue() == '{') {
            m128683b('{');
            c21665r.f83186b.add(new C21045d(28));
            return C21655h.f83169c;
        }
        if (chM128687g != null && chM128687g.charValue() == '[') {
            m128683b('[');
            c21665r.f83186b.add(new C21045d(27));
            return C21654g.f83168c;
        }
        if (chM128687g != null && chM128687g.charValue() == '\"') {
            return new C21663p(m128697q());
        }
        if ((chM128687g != null && chM128687g.charValue() == 't') || ((chM128687g != null && chM128687g.charValue() == 'f') || (chM128687g != null && chM128687g.charValue() == 'n'))) {
            char cM128693m = m128693m();
            if (cM128693m == 'f') {
                C21656i c21656i = new C21656i(false);
                m128695o(MediaConstraintsFactory.kValueFalse, c21656i);
                return c21656i;
            }
            if (cM128693m == 'n') {
                C21661n c21661n = C21661n.f83175c;
                m128695o("null", c21661n);
                return c21661n;
            }
            if (cM128693m == 't') {
                C21656i c21656i2 = new C21656i(true);
                m128695o(MediaConstraintsFactory.kValueTrue, c21656i2);
                return c21656i2;
            }
            m128682e(this, "Unable to handle keyword starting with '" + cM128693m + '\'', 0, 6);
            throw null;
        }
        if (chM128687g == null || chM128687g.charValue() != '-') {
            C18277c c18277c = new C18277c('0', '9');
            if (chM128687g == null || !c18277c.m52652e(chM128687g.charValue())) {
                if (chM128687g == null) {
                    return C21658k.f83172c;
                }
                m128705y(chM128687g, "{", "[", "\"", "null", MediaConstraintsFactory.kValueTrue, MediaConstraintsFactory.kValueFalse, "<number>");
                throw null;
            }
        }
        StringBuilder sb4 = new StringBuilder();
        Character chM128692l = m128692l();
        if (chM128692l != null && chM128692l.charValue() == '-') {
            sb4.append(m128688h());
        }
        m128694n(sb4);
        Character chM128692l2 = m128692l();
        if (chM128692l2 != null && chM128692l2.charValue() == '.') {
            sb4.append(m128688h());
            m128694n(sb4);
        }
        if (AbstractC25265s.m74155w0(AbstractC21651d.f83164b, m128692l())) {
            sb4.append(m128688h());
            if (AbstractC25265s.m74155w0(AbstractC21651d.f83165c, m128692l())) {
                sb4.append(m128688h());
            }
            m128694n(sb4);
        }
        String string = sb4.toString();
        boolean z4 = string.length() > 0;
        int i13 = this.f173192a;
        if (z4) {
            return new C21662o(string);
        }
        m128682e(this, ("Invalid number, expected `-` || 0..9, found `" + m128692l() + '`').toString(), i13, 4);
        throw null;
    }

    /* JADX INFO: renamed from: s */
    public void m128699s() {
        C21665r c21665r = (C21665r) this.f173195d;
        int size = c21665r.f83185a.size();
        m128689i();
        while (c21665r.f83185a.size() > size) {
            m128689i();
        }
    }

    /* JADX INFO: renamed from: t */
    public AbstractC5583n m128700t() {
        Character chM128687g = m128687g();
        if (chM128687g != null && chM128687g.charValue() == ']') {
            m128684c();
            return C21657j.f83171c;
        }
        C21665r c21665r = (C21665r) this.f173195d;
        c21665r.f83186b.add(new C21045d(29));
        return m128698r();
    }

    /* JADX INFO: renamed from: u */
    public AbstractC5583n m128701u() {
        Character chM128687g = m128687g();
        if (chM128687g != null && chM128687g.charValue() == ']') {
            m128684c();
            return C21657j.f83171c;
        }
        if (chM128687g == null || chM128687g.charValue() != ',') {
            m128705y(chM128687g, ",", "]");
            throw null;
        }
        m128683b(DateTimeRange.lowerUpperDelimiter);
        return m128698r();
    }

    /* JADX INFO: renamed from: v */
    public AbstractC5583n m128702v() {
        Character chM128687g = m128687g();
        if (chM128687g == null || chM128687g.charValue() != ':') {
            m128705y(chM128687g, ":");
            throw null;
        }
        m128683b(':');
        C21665r c21665r = (C21665r) this.f173195d;
        c21665r.f83186b.add(new C21650c(1));
        return m128698r();
    }

    /* JADX INFO: renamed from: w */
    public AbstractC5583n m128703w() {
        Character chM128687g = m128687g();
        if (chM128687g != null && chM128687g.charValue() == '}') {
            m128685d();
            return C21659l.f83173c;
        }
        if (chM128687g != null && chM128687g.charValue() == '\"') {
            return m128696p();
        }
        m128705y(chM128687g, "\"", "}");
        throw null;
    }

    /* JADX INFO: renamed from: x */
    public AbstractC5583n m128704x() {
        Character chM128687g = m128687g();
        if (chM128687g != null && chM128687g.charValue() == '}') {
            m128685d();
            return C21659l.f83173c;
        }
        if (chM128687g == null || chM128687g.charValue() != ',') {
            m128705y(chM128687g, ",", "}");
            throw null;
        }
        m128683b(DateTimeRange.lowerUpperDelimiter);
        m128687g();
        return m128696p();
    }

    /* JADX INFO: renamed from: y */
    public void m128705y(Character ch4, String... strArr) {
        String str = strArr.length > 1 ? " one of" : "";
        m128682e(this, "found `" + ch4 + "`, expected" + str + ' ' + AbstractC25260n.m74028D0(strArr, ", ", null, null, new C21650c(0), 30), 0, 6);
        throw null;
    }

    public C40137a(byte[] data) {
        AbstractC22676k.m65750j(data, "data");
        this.f173193b = data;
        this.f173195d = new C21665r();
    }
}
