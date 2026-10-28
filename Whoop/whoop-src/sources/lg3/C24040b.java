package lg3;

import com.squareup.wire.AbstractC5583n;
import ih0.AbstractC18489d0;
import java.io.IOException;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Locale;
import jg3.AbstractC21688o;
import kg3.AbstractC22465d;
import kg3.C22466e;
import ng3.AbstractC26696i;
import ng3.EnumC26688a;
import ng3.EnumC26694g;
import ng3.InterfaceC26704q;
import org.threeten.p379bp.DateTimeException;
import org.threeten.p379bp.format.DateTimeParseException;
import p012ab.C0682h0;
import p048ce.AbstractC4482w;

/* JADX INFO: renamed from: lg3.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C24040b {

    /* JADX INFO: renamed from: f */
    public static final C24040b f95016f;

    /* JADX INFO: renamed from: g */
    public static final C24040b f95017g;

    /* JADX INFO: renamed from: h */
    public static final C24040b f95018h;

    /* JADX INFO: renamed from: i */
    public static final C24040b f95019i;

    /* JADX INFO: renamed from: a */
    public final C24043e f95020a;

    /* JADX INFO: renamed from: b */
    public final Locale f95021b;

    /* JADX INFO: renamed from: c */
    public final C24058t f95022c;

    /* JADX INFO: renamed from: d */
    public final EnumC24059u f95023d;

    /* JADX INFO: renamed from: e */
    public final AbstractC22465d f95024e;

    static {
        C24053o c24053o = new C24053o();
        EnumC26688a enumC26688a = EnumC26688a.YEAR;
        c24053o.m70959h(enumC26688a, 4, 10, 5);
        c24053o.m70954c('-');
        EnumC26688a enumC26688a2 = EnumC26688a.MONTH_OF_YEAR;
        c24053o.m70958g(enumC26688a2, 2);
        c24053o.m70954c('-');
        EnumC26688a enumC26688a3 = EnumC26688a.DAY_OF_MONTH;
        c24053o.m70958g(enumC26688a3, 2);
        EnumC24059u enumC24059u = EnumC24059u.f95078w;
        C24040b c24040bM70963l = c24053o.m70963l(enumC24059u);
        C22466e c22466e = C22466e.f88015w;
        C24040b c24040bM70945d = c24040bM70963l.m70945d();
        f95016f = c24040bM70945d;
        C24053o c24053o2 = new C24053o();
        EnumC24049k enumC24049k = EnumC24049k.f95045x;
        c24053o2.m70953b(enumC24049k);
        c24053o2.m70952a(c24040bM70945d);
        C24048j c24048j = C24048j.f95041z;
        c24053o2.m70953b(c24048j);
        c24053o2.m70963l(enumC24059u).m70945d();
        C24053o c24053o3 = new C24053o();
        c24053o3.m70953b(enumC24049k);
        c24053o3.m70952a(c24040bM70945d);
        c24053o3.m70961j();
        c24053o3.m70953b(c24048j);
        c24053o3.m70963l(enumC24059u).m70945d();
        C24053o c24053o4 = new C24053o();
        EnumC26688a enumC26688a4 = EnumC26688a.HOUR_OF_DAY;
        c24053o4.m70958g(enumC26688a4, 2);
        c24053o4.m70954c(':');
        EnumC26688a enumC26688a5 = EnumC26688a.MINUTE_OF_HOUR;
        c24053o4.m70958g(enumC26688a5, 2);
        c24053o4.m70961j();
        c24053o4.m70954c(':');
        EnumC26688a enumC26688a6 = EnumC26688a.SECOND_OF_MINUTE;
        c24053o4.m70958g(enumC26688a6, 2);
        c24053o4.m70961j();
        c24053o4.m70953b(new C24045g(EnumC26688a.NANO_OF_SECOND));
        C24040b c24040bM70963l2 = c24053o4.m70963l(enumC24059u);
        C24053o c24053o5 = new C24053o();
        c24053o5.m70953b(enumC24049k);
        c24053o5.m70952a(c24040bM70963l2);
        c24053o5.m70953b(c24048j);
        c24053o5.m70963l(enumC24059u);
        C24053o c24053o6 = new C24053o();
        c24053o6.m70953b(enumC24049k);
        c24053o6.m70952a(c24040bM70963l2);
        c24053o6.m70961j();
        c24053o6.m70953b(c24048j);
        c24053o6.m70963l(enumC24059u);
        C24053o c24053o7 = new C24053o();
        c24053o7.m70953b(enumC24049k);
        c24053o7.m70952a(c24040bM70945d);
        c24053o7.m70954c('T');
        c24053o7.m70952a(c24040bM70963l2);
        C24040b c24040bM70945d2 = c24053o7.m70963l(enumC24059u).m70945d();
        f95017g = c24040bM70945d2;
        C24053o c24053o8 = new C24053o();
        c24053o8.m70953b(enumC24049k);
        c24053o8.m70952a(c24040bM70945d2);
        c24053o8.m70953b(c24048j);
        C24040b c24040bM70945d3 = c24053o8.m70963l(enumC24059u).m70945d();
        f95018h = c24040bM70945d3;
        C24053o c24053o9 = new C24053o();
        c24053o9.m70952a(c24040bM70945d3);
        c24053o9.m70961j();
        c24053o9.m70954c('[');
        EnumC24049k enumC24049k2 = EnumC24049k.f95044w;
        c24053o9.m70953b(enumC24049k2);
        int i13 = 1;
        c24053o9.m70953b(new C24046h(i13));
        c24053o9.m70954c(']');
        c24053o9.m70963l(enumC24059u).m70945d();
        C24053o c24053o10 = new C24053o();
        c24053o10.m70952a(c24040bM70945d2);
        c24053o10.m70961j();
        c24053o10.m70953b(c24048j);
        c24053o10.m70961j();
        c24053o10.m70954c('[');
        c24053o10.m70953b(enumC24049k2);
        c24053o10.m70953b(new C24046h(i13));
        c24053o10.m70954c(']');
        c24053o10.m70963l(enumC24059u).m70945d();
        C24053o c24053o11 = new C24053o();
        c24053o11.m70953b(enumC24049k);
        c24053o11.m70959h(enumC26688a, 4, 10, 5);
        c24053o11.m70954c('-');
        c24053o11.m70958g(EnumC26688a.DAY_OF_YEAR, 3);
        c24053o11.m70961j();
        c24053o11.m70953b(c24048j);
        c24053o11.m70963l(enumC24059u).m70945d();
        C24053o c24053o12 = new C24053o();
        c24053o12.m70953b(enumC24049k);
        int i14 = AbstractC26696i.f106191a;
        c24053o12.m70959h(EnumC26694g.f106188z, 4, 10, 5);
        c24053o12.m70955d("-W");
        c24053o12.m70958g(EnumC26694g.f106187y, 2);
        c24053o12.m70954c('-');
        EnumC26688a enumC26688a7 = EnumC26688a.DAY_OF_WEEK;
        c24053o12.m70958g(enumC26688a7, 1);
        c24053o12.m70961j();
        c24053o12.m70953b(c24048j);
        c24053o12.m70963l(enumC24059u).m70945d();
        C24053o c24053o13 = new C24053o();
        c24053o13.m70953b(enumC24049k);
        c24053o13.m70953b(new C24046h(0));
        f95019i = c24053o13.m70963l(enumC24059u);
        C24053o c24053o14 = new C24053o();
        c24053o14.m70953b(enumC24049k);
        c24053o14.m70958g(enumC26688a, 4);
        c24053o14.m70958g(enumC26688a2, 2);
        c24053o14.m70958g(enumC26688a3, 2);
        c24053o14.m70961j();
        c24053o14.m70953b(new C24048j("Z", "+HHMMss"));
        c24053o14.m70963l(enumC24059u).m70945d();
        HashMap map = new HashMap();
        map.put(1L, "Mon");
        map.put(2L, "Tue");
        map.put(3L, "Wed");
        map.put(4L, "Thu");
        map.put(5L, "Fri");
        map.put(6L, "Sat");
        map.put(7L, "Sun");
        HashMap map2 = new HashMap();
        map2.put(1L, "Jan");
        map2.put(2L, "Feb");
        map2.put(3L, "Mar");
        map2.put(4L, "Apr");
        map2.put(5L, "May");
        map2.put(6L, "Jun");
        map2.put(7L, "Jul");
        map2.put(8L, "Aug");
        map2.put(9L, "Sep");
        map2.put(10L, "Oct");
        map2.put(11L, "Nov");
        map2.put(12L, "Dec");
        C24053o c24053o15 = new C24053o();
        c24053o15.m70953b(enumC24049k);
        c24053o15.m70953b(EnumC24049k.f95046y);
        c24053o15.m70961j();
        c24053o15.m70956e(enumC26688a7, map);
        c24053o15.m70955d(", ");
        c24053o15.m70960i();
        c24053o15.m70959h(enumC26688a3, 1, 2, 4);
        c24053o15.m70954c(' ');
        c24053o15.m70956e(enumC26688a2, map2);
        c24053o15.m70954c(' ');
        c24053o15.m70958g(enumC26688a, 4);
        c24053o15.m70954c(' ');
        c24053o15.m70958g(enumC26688a4, 2);
        c24053o15.m70954c(':');
        c24053o15.m70958g(enumC26688a5, 2);
        c24053o15.m70961j();
        c24053o15.m70954c(':');
        c24053o15.m70958g(enumC26688a6, 2);
        c24053o15.m70960i();
        c24053o15.m70954c(' ');
        c24053o15.m70953b(new C24048j("GMT", "+HHMM"));
        c24053o15.m70963l(EnumC24059u.f95079x).m70945d();
    }

    public C24040b(C24043e c24043e, Locale locale, C24058t c24058t, EnumC24059u enumC24059u, AbstractC22465d abstractC22465d) {
        AbstractC5583n.m16762V(c24043e, "printerParser");
        this.f95020a = c24043e;
        AbstractC5583n.m16762V(locale, "locale");
        this.f95021b = locale;
        AbstractC5583n.m16762V(c24058t, "decimalStyle");
        this.f95022c = c24058t;
        AbstractC5583n.m16762V(enumC24059u, "resolverStyle");
        this.f95023d = enumC24059u;
        this.f95024e = abstractC22465d;
    }

    /* JADX INFO: renamed from: a */
    public final String m70942a(AbstractC4482w abstractC4482w) {
        StringBuilder sb4 = new StringBuilder(32);
        C24043e c24043e = this.f95020a;
        AbstractC5583n.m16762V(abstractC4482w, "temporal");
        try {
            c24043e.mo70947b(new C0682h0(abstractC4482w, this), sb4);
            return sb4.toString();
        } catch (IOException e5) {
            throw new DateTimeException(e5.getMessage(), e5);
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m70943b(CharSequence charSequence, InterfaceC26704q interfaceC26704q) {
        String string;
        AbstractC5583n.m16762V(charSequence, "text");
        AbstractC5583n.m16762V(interfaceC26704q, "type");
        try {
            C24039a c24039aM70944c = m70944c(charSequence);
            c24039aM70944c.m70939v0(this.f95023d);
            return interfaceC26704q.mo43799l(c24039aM70944c);
        } catch (DateTimeParseException e5) {
            throw e5;
        } catch (RuntimeException e13) {
            if (charSequence.length() > 64) {
                string = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                string = charSequence.toString();
            }
            StringBuilder sbM53375p = AbstractC18489d0.m53375p("Text '", string, "' could not be parsed: ");
            sbM53375p.append(e13.getMessage());
            DateTimeParseException dateTimeParseException = new DateTimeParseException(sbM53375p.toString(), e13);
            charSequence.toString();
            throw dateTimeParseException;
        }
    }

    /* JADX INFO: renamed from: c */
    public final C24039a m70944c(CharSequence charSequence) {
        C24054p c24054pM70969c;
        String string;
        ParsePosition parsePosition = new ParsePosition(0);
        AbstractC5583n.m16762V(charSequence, "text");
        C24055q c24055q = new C24055q(this);
        int iMo70946a = this.f95020a.mo70946a(c24055q, charSequence, parsePosition.getIndex());
        if (iMo70946a < 0) {
            parsePosition.setErrorIndex(~iMo70946a);
            c24054pM70969c = null;
        } else {
            parsePosition.setIndex(iMo70946a);
            c24054pM70969c = c24055q.m70969c();
        }
        if (c24054pM70969c != null && parsePosition.getErrorIndex() < 0 && parsePosition.getIndex() >= charSequence.length()) {
            C24039a c24039a = new C24039a();
            c24039a.f95010F.putAll(c24054pM70969c.f95063G);
            C24055q c24055q2 = c24054pM70969c.f95066J;
            c24055q2.m70969c().getClass();
            AbstractC22465d abstractC22465d = (AbstractC22465d) c24055q2.f95071e;
            if (abstractC22465d == null) {
                abstractC22465d = C22466e.f88015w;
            }
            c24039a.f95011G = abstractC22465d;
            AbstractC21688o abstractC21688o = c24054pM70969c.f95062F;
            if (abstractC21688o != null) {
                c24039a.f95012H = abstractC21688o;
            } else {
                c24039a.f95012H = null;
            }
            c24039a.f95015K = c24054pM70969c.f95065I;
            return c24039a;
        }
        if (charSequence.length() > 64) {
            string = charSequence.subSequence(0, 64).toString() + "...";
        } else {
            string = charSequence.toString();
        }
        if (parsePosition.getErrorIndex() >= 0) {
            StringBuilder sbM53375p = AbstractC18489d0.m53375p("Text '", string, "' could not be parsed at index ");
            sbM53375p.append(parsePosition.getErrorIndex());
            String string2 = sbM53375p.toString();
            parsePosition.getErrorIndex();
            throw new DateTimeParseException(string2, charSequence);
        }
        StringBuilder sbM53375p2 = AbstractC18489d0.m53375p("Text '", string, "' could not be parsed, unparsed text found at index ");
        sbM53375p2.append(parsePosition.getIndex());
        String string3 = sbM53375p2.toString();
        parsePosition.getIndex();
        throw new DateTimeParseException(string3, charSequence);
    }

    /* JADX INFO: renamed from: d */
    public final C24040b m70945d() {
        C22466e c22466e = C22466e.f88015w;
        AbstractC22465d abstractC22465d = this.f95024e;
        if (abstractC22465d == null ? false : abstractC22465d.equals(c22466e)) {
            return this;
        }
        return new C24040b(this.f95020a, this.f95021b, this.f95022c, this.f95023d, c22466e);
    }

    public final String toString() {
        String string = this.f95020a.toString();
        return string.startsWith("[") ? string : string.substring(1, string.length() - 1);
    }
}
