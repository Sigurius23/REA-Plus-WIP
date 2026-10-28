package lg3;

import com.squareup.wire.AbstractC5583n;
import g73.C15553a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import ng3.AbstractC26696i;
import ng3.C26691d;
import ng3.EnumC26688a;
import ng3.EnumC26694g;
import ng3.InterfaceC26700m;
import p026b2.C2298d;
import p031b9.AbstractC2875y;
import p078d1.C11457j;

/* JADX INFO: renamed from: lg3.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C24053o {

    /* JADX INFO: renamed from: f */
    public static final C15553a f95055f = new C15553a(20);

    /* JADX INFO: renamed from: g */
    public static final C2298d f95056g;

    /* JADX INFO: renamed from: a */
    public C24053o f95057a;

    /* JADX INFO: renamed from: b */
    public final C24053o f95058b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f95059c;

    /* JADX INFO: renamed from: d */
    public final boolean f95060d;

    /* JADX INFO: renamed from: e */
    public int f95061e;

    static {
        HashMap map = new HashMap();
        map.put('G', EnumC26688a.ERA);
        map.put('y', EnumC26688a.YEAR_OF_ERA);
        map.put('u', EnumC26688a.YEAR);
        int i13 = AbstractC26696i.f106191a;
        C26691d c26691d = EnumC26694g.f106186x;
        map.put('Q', c26691d);
        map.put('q', c26691d);
        EnumC26688a enumC26688a = EnumC26688a.MONTH_OF_YEAR;
        map.put('M', enumC26688a);
        map.put('L', enumC26688a);
        map.put('D', EnumC26688a.DAY_OF_YEAR);
        map.put('d', EnumC26688a.DAY_OF_MONTH);
        map.put('F', EnumC26688a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        EnumC26688a enumC26688a2 = EnumC26688a.DAY_OF_WEEK;
        map.put('E', enumC26688a2);
        map.put('c', enumC26688a2);
        map.put('e', enumC26688a2);
        map.put('a', EnumC26688a.AMPM_OF_DAY);
        map.put('H', EnumC26688a.HOUR_OF_DAY);
        map.put('k', EnumC26688a.CLOCK_HOUR_OF_DAY);
        map.put('K', EnumC26688a.HOUR_OF_AMPM);
        map.put('h', EnumC26688a.CLOCK_HOUR_OF_AMPM);
        map.put('m', EnumC26688a.MINUTE_OF_HOUR);
        map.put('s', EnumC26688a.SECOND_OF_MINUTE);
        EnumC26688a enumC26688a3 = EnumC26688a.NANO_OF_SECOND;
        map.put('S', enumC26688a3);
        map.put('A', EnumC26688a.MILLI_OF_DAY);
        map.put('n', enumC26688a3);
        map.put('N', EnumC26688a.NANO_OF_DAY);
        f95056g = new C2298d(17);
    }

    public C24053o() {
        this.f95057a = this;
        this.f95059c = new ArrayList();
        this.f95061e = -1;
        this.f95058b = null;
        this.f95060d = false;
    }

    /* JADX INFO: renamed from: a */
    public final void m70952a(C24040b c24040b) {
        AbstractC5583n.m16762V(c24040b, "formatter");
        C24043e c24043e = c24040b.f95020a;
        if (c24043e.f95028x) {
            c24043e = new C24043e(c24043e.f95027w, false);
        }
        m70953b(c24043e);
    }

    /* JADX INFO: renamed from: b */
    public final int m70953b(InterfaceC24044f interfaceC24044f) {
        AbstractC5583n.m16762V(interfaceC24044f, "pp");
        C24053o c24053o = this.f95057a;
        c24053o.getClass();
        c24053o.f95059c.add(interfaceC24044f);
        C24053o c24053o2 = this.f95057a;
        c24053o2.f95061e = -1;
        return c24053o2.f95059c.size() - 1;
    }

    /* JADX INFO: renamed from: c */
    public final void m70954c(char c3) {
        m70953b(new C24042d(c3));
    }

    /* JADX INFO: renamed from: d */
    public final void m70955d(String str) {
        if (str.length() > 0) {
            if (str.length() == 1) {
                m70953b(new C24042d(str.charAt(0)));
            } else {
                m70953b(new C24050l(str));
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m70956e(InterfaceC26700m interfaceC26700m, HashMap map) {
        AbstractC5583n.m16762V(interfaceC26700m, "field");
        m70953b(new C24051m(interfaceC26700m, new C24041c(new C11457j(Collections.singletonMap(EnumC24061w.f95083w, new LinkedHashMap(map))))));
    }

    /* JADX INFO: renamed from: f */
    public final void m70957f(C24047i c24047i) {
        int i13;
        C24053o c24053o = this.f95057a;
        int i14 = c24053o.f95061e;
        if (i14 < 0 || !(c24053o.f95059c.get(i14) instanceof C24047i)) {
            this.f95057a.f95061e = m70953b(c24047i);
            return;
        }
        C24053o c24053o2 = this.f95057a;
        int i15 = c24053o2.f95061e;
        C24047i c24047i2 = (C24047i) c24053o2.f95059c.get(i15);
        int i16 = c24047i.f95037x;
        int i17 = c24047i.f95038y;
        if (i16 == i17 && (i13 = c24047i.f95039z) == 4) {
            c24047i2 = new C24047i(c24047i2.f95036w, c24047i2.f95037x, c24047i2.f95038y, c24047i2.f95039z, c24047i2.f95035E + i17);
            if (c24047i.f95035E != -1) {
                c24047i = new C24047i(c24047i.f95036w, i16, i17, i13, -1);
            }
            m70953b(c24047i);
            this.f95057a.f95061e = i15;
        } else {
            if (c24047i2.f95035E != -1) {
                c24047i2 = new C24047i(c24047i2.f95036w, c24047i2.f95037x, c24047i2.f95038y, c24047i2.f95039z, -1);
            }
            this.f95057a.f95061e = m70953b(c24047i);
        }
        this.f95057a.f95059c.set(i15, c24047i2);
    }

    /* JADX INFO: renamed from: g */
    public final void m70958g(InterfaceC26700m interfaceC26700m, int i13) {
        AbstractC5583n.m16762V(interfaceC26700m, "field");
        if (i13 < 1 || i13 > 19) {
            throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "The width must be from 1 to 19 inclusive but was "));
        }
        m70957f(new C24047i(interfaceC26700m, i13, i13, 4));
    }

    /* JADX INFO: renamed from: h */
    public final void m70959h(InterfaceC26700m interfaceC26700m, int i13, int i14, int i15) {
        if (i13 == i14 && i15 == 4) {
            m70958g(interfaceC26700m, i14);
            return;
        }
        AbstractC5583n.m16762V(interfaceC26700m, "field");
        if (i15 == 0) {
            throw new NullPointerException(AbstractC2875y.m8299l("signStyle", " must not be null"));
        }
        if (i13 < 1 || i13 > 19) {
            throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "The minimum width must be from 1 to 19 inclusive but was "));
        }
        if (i14 < 1 || i14 > 19) {
            throw new IllegalArgumentException(AbstractC2875y.m8295h(i14, "The maximum width must be from 1 to 19 inclusive but was "));
        }
        if (i14 < i13) {
            throw new IllegalArgumentException(AbstractC2875y.m8294g(i14, i13, "The maximum width must exceed or equal the minimum width but ", " < "));
        }
        m70957f(new C24047i(interfaceC26700m, i13, i14, i15));
    }

    /* JADX INFO: renamed from: i */
    public final void m70960i() {
        C24053o c24053o = this.f95057a;
        if (c24053o.f95058b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (c24053o.f95059c.size() <= 0) {
            this.f95057a = this.f95057a.f95058b;
            return;
        }
        C24053o c24053o2 = this.f95057a;
        C24043e c24043e = new C24043e(c24053o2.f95060d, c24053o2.f95059c);
        this.f95057a = this.f95057a.f95058b;
        m70953b(c24043e);
    }

    /* JADX INFO: renamed from: j */
    public final void m70961j() {
        C24053o c24053o = this.f95057a;
        c24053o.f95061e = -1;
        this.f95057a = new C24053o(c24053o);
    }

    /* JADX INFO: renamed from: k */
    public final C24040b m70962k() {
        Locale locale = Locale.getDefault();
        AbstractC5583n.m16762V(locale, "locale");
        while (this.f95057a.f95058b != null) {
            m70960i();
        }
        return new C24040b(new C24043e(false, this.f95059c), locale, C24058t.f95077a, EnumC24059u.f95079x, null);
    }

    /* JADX INFO: renamed from: l */
    public final C24040b m70963l(EnumC24059u enumC24059u) {
        C24040b c24040bM70962k = m70962k();
        EnumC24059u enumC24059u2 = c24040bM70962k.f95023d;
        return enumC24059u2 == null ? false : enumC24059u2.equals(enumC24059u) ? c24040bM70962k : new C24040b(c24040bM70962k.f95020a, c24040bM70962k.f95021b, c24040bM70962k.f95022c, enumC24059u, c24040bM70962k.f95024e);
    }

    public C24053o(C24053o c24053o) {
        this.f95057a = this;
        this.f95059c = new ArrayList();
        this.f95061e = -1;
        this.f95058b = c24053o;
        this.f95060d = true;
    }
}
