package p012ab;

import aa3.C0656u0;
import af3.C0849y;
import bf3.C3205d;
import java.util.ArrayList;
import java.util.List;
import p000.AbstractC11266d;
import p047c9.C4320k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import ze3.C40597a;

/* JADX INFO: renamed from: ab.l0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0690l0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2490a;

    /* JADX INFO: renamed from: b */
    public final Object f2491b;

    /* JADX INFO: renamed from: c */
    public int f2492c;

    /* JADX INFO: renamed from: d */
    public int f2493d;

    /* JADX INFO: renamed from: e */
    public int f2494e;

    /* JADX INFO: renamed from: f */
    public Object f2495f;

    public C0690l0(List list) {
        this.f2490a = 2;
        this.f2495f = new C3205d("", null);
        this.f2494e = 0;
        this.f2491b = list;
        this.f2492c = 0;
        this.f2493d = 0;
        if (list.isEmpty()) {
            return;
        }
        m1731a(0, 0);
        C3205d c3205d = (C3205d) list.get(0);
        this.f2495f = c3205d;
        this.f2494e = c3205d.f12559a.length();
    }

    /* JADX INFO: renamed from: a */
    public void m1731a(int i13, int i14) {
        List list = (List) this.f2491b;
        if (i13 < 0 || i13 >= list.size()) {
            StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "Line index ", " out of range, number of lines: ");
            sbM30466t.append(list.size());
            throw new IllegalArgumentException(sbM30466t.toString());
        }
        C3205d c3205d = (C3205d) list.get(i13);
        if (i14 < 0 || i14 > c3205d.f12559a.length()) {
            StringBuilder sbM30466t2 = AbstractC11266d.m30466t(i14, "Index ", " out of range, line length: ");
            sbM30466t2.append(c3205d.f12559a.length());
            throw new IllegalArgumentException(sbM30466t2.toString());
        }
    }

    /* JADX INFO: renamed from: b */
    public int m1732b(char c3) {
        int i13 = 0;
        while (true) {
            char cM1742l = m1742l();
            if (cM1742l == 0) {
                return -1;
            }
            if (cM1742l == c3) {
                return i13;
            }
            i13++;
            m1739i();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m1733c() {
        switch (this.f2490a) {
            case 0:
                int i13 = this.f2494e;
                this.f2494e = i13 == Integer.MIN_VALUE ? this.f2492c : i13 + this.f2493d;
                this.f2495f = ((String) this.f2491b) + this.f2494e;
                break;
            default:
                int i14 = this.f2494e;
                int i15 = i14 == Integer.MIN_VALUE ? this.f2492c : i14 + this.f2493d;
                this.f2494e = i15;
                String str = (String) this.f2491b;
                this.f2495f = AbstractC31061c.m95634j(AbstractC30007c.m91832b(11, str), i15, str);
                break;
        }
    }

    /* JADX INFO: renamed from: d */
    public C0656u0 m1734d(C4320k c4320k, C4320k c4320k2) {
        List list = (List) this.f2491b;
        int i13 = c4320k.f17541x;
        int i14 = c4320k.f17542y;
        int i15 = c4320k2.f17541x;
        int i16 = c4320k2.f17542y;
        if (i13 == i15) {
            C3205d c3205d = (C3205d) list.get(i13);
            CharSequence charSequenceSubSequence = c3205d.f12559a.subSequence(i14, i16);
            C0849y c0849y = c3205d.f12560b;
            C3205d c3205d2 = new C3205d(charSequenceSubSequence, c0849y != null ? new C0849y(c0849y.f3049a, c0849y.f3050b + i14, charSequenceSubSequence.length()) : null);
            C0656u0 c0656u0 = new C0656u0(2);
            c0656u0.f2286a.add(c3205d2);
            return c0656u0;
        }
        C0656u0 c0656u1 = new C0656u0(2);
        ArrayList arrayList = c0656u1.f2286a;
        C3205d c3205d3 = (C3205d) list.get(i13);
        arrayList.add(c3205d3.m9253a(i14, c3205d3.f12559a.length()));
        while (true) {
            i13++;
            if (i13 >= i15) {
                arrayList.add(((C3205d) list.get(i15)).m9253a(0, i16));
                return c0656u1;
            }
            arrayList.add((C3205d) list.get(i13));
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m1735e() {
        return this.f2493d < this.f2494e || this.f2492c < ((List) this.f2491b).size() - 1;
    }

    /* JADX INFO: renamed from: f */
    public int m1736f(C40597a c40597a) {
        int i13 = 0;
        while (c40597a.f174945a.get(m1742l())) {
            i13++;
            m1739i();
        }
        return i13;
    }

    /* JADX INFO: renamed from: g */
    public int m1737g(char c3) {
        int i13 = 0;
        while (m1742l() == c3) {
            i13++;
            m1739i();
        }
        return i13;
    }

    /* JADX INFO: renamed from: h */
    public void m1738h() {
        switch (this.f2490a) {
            case 0:
                if (this.f2494e == Integer.MIN_VALUE) {
                    throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
                }
                return;
            default:
                if (this.f2494e == Integer.MIN_VALUE) {
                    throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
                }
                return;
        }
    }

    /* JADX INFO: renamed from: i */
    public void m1739i() {
        List list = (List) this.f2491b;
        int i13 = this.f2493d + 1;
        this.f2493d = i13;
        if (i13 > this.f2494e) {
            int i14 = this.f2492c + 1;
            this.f2492c = i14;
            if (i14 < list.size()) {
                C3205d c3205d = (C3205d) list.get(this.f2492c);
                this.f2495f = c3205d;
                this.f2494e = c3205d.f12559a.length();
            } else {
                this.f2495f = new C3205d("", null);
                this.f2494e = "".length();
            }
            this.f2493d = 0;
        }
    }

    /* JADX INFO: renamed from: j */
    public boolean m1740j(char c3) {
        if (m1742l() != c3) {
            return false;
        }
        m1739i();
        return true;
    }

    /* JADX INFO: renamed from: k */
    public boolean m1741k(String str) {
        int i13 = this.f2493d;
        if (i13 < this.f2494e && str.length() + i13 <= this.f2494e) {
            for (int i14 = 0; i14 < str.length(); i14++) {
                if (((C3205d) this.f2495f).f12559a.charAt(this.f2493d + i14) == str.charAt(i14)) {
                }
            }
            this.f2493d = str.length() + this.f2493d;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public char m1742l() {
        int i13 = this.f2493d;
        if (i13 < this.f2494e) {
            return ((C3205d) this.f2495f).f12559a.charAt(i13);
        }
        return this.f2492c < ((List) this.f2491b).size() + (-1) ? '\n' : (char) 0;
    }

    /* JADX INFO: renamed from: m */
    public C4320k m1743m() {
        return new C4320k(this.f2492c, this.f2493d, 12);
    }

    /* JADX INFO: renamed from: n */
    public void m1744n(C4320k c4320k) {
        int i13 = c4320k.f17541x;
        int i14 = c4320k.f17542y;
        m1731a(i13, i14);
        this.f2492c = i13;
        this.f2493d = i14;
        C3205d c3205d = (C3205d) ((List) this.f2491b).get(i13);
        this.f2495f = c3205d;
        this.f2494e = c3205d.f12559a.length();
    }

    /* JADX INFO: renamed from: o */
    public int m1745o() {
        int i13 = 0;
        while (true) {
            char cM1742l = m1742l();
            if (cM1742l != ' ') {
                switch (cM1742l) {
                    case '\t':
                    case '\n':
                    case 11:
                    case '\f':
                    case '\r':
                        break;
                    default:
                        return i13;
                }
            }
            i13++;
            m1739i();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0690l0(int i13, int i14, int i15, byte b) {
        this(Integer.MIN_VALUE, i13, i14, 0);
        this.f2490a = i15;
        switch (i15) {
            case 1:
                this(Integer.MIN_VALUE, i13, i14, 1);
                break;
            default:
                break;
        }
    }

    public C0690l0(int i13, int i14, int i15, int i16) {
        String string;
        String strM95635k;
        this.f2490a = i16;
        switch (i16) {
            case 1:
                if (i13 != Integer.MIN_VALUE) {
                    StringBuilder sb4 = new StringBuilder(12);
                    sb4.append(i13);
                    sb4.append("/");
                    string = sb4.toString();
                } else {
                    string = "";
                }
                this.f2491b = string;
                this.f2492c = i14;
                this.f2493d = i15;
                this.f2494e = Integer.MIN_VALUE;
                this.f2495f = "";
                break;
            default:
                if (i13 == Integer.MIN_VALUE) {
                    strM95635k = "";
                } else {
                    strM95635k = AbstractC31061c.m95635k(i13, "/");
                }
                this.f2491b = strM95635k;
                this.f2492c = i14;
                this.f2493d = i15;
                this.f2494e = Integer.MIN_VALUE;
                this.f2495f = "";
                break;
        }
    }
}
