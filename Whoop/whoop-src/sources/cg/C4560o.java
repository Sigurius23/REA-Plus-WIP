package cg;

import androidx.room.AbstractC1772c1;
import bg.AbstractC3210e;
import bg.C3208c;
import bg.C3209d;
import bg.C3216k;
import bg.C3217l;
import java.util.Objects;
import p031b9.AbstractC2875y;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import tg.C33770b;
import tg.C33775g;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: cg.o */
/* JADX INFO: loaded from: classes.dex */
public final class C4560o {

    /* JADX INFO: renamed from: i */
    public static final C4559n f18367i = new C4559n();

    /* JADX INFO: renamed from: a */
    public final C3217l f18368a;

    /* JADX INFO: renamed from: b */
    public final AbstractC3210e f18369b;

    /* JADX INFO: renamed from: c */
    public final int f18370c;

    /* JADX INFO: renamed from: d */
    public final C4569x f18371d;

    /* JADX INFO: renamed from: e */
    public final C4554i f18372e;

    /* JADX INFO: renamed from: f */
    public final C4570y f18373f;

    /* JADX INFO: renamed from: g */
    public final C33770b f18374g;

    /* JADX INFO: renamed from: h */
    public final String f18375h;

    public C4560o(C3217l c3217l, AbstractC3210e abstractC3210e, int i13, C4569x c4569x, C4554i c4554i, C4570y c4570y, C33770b c33770b) {
        String string;
        this.f18368a = c3217l;
        this.f18369b = abstractC3210e;
        this.f18370c = i13;
        this.f18371d = c4569x;
        this.f18372e = c4554i;
        this.f18373f = c4570y;
        this.f18374g = c33770b;
        Objects.toString(abstractC3210e);
        int i14 = c3217l.f12587b;
        if (1 > i13 || i13 >= 65536) {
            throw new IllegalArgumentException(AbstractC2875y.m8296i(i13, "Given port ", " is not in required range [1, 65535]").toString());
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(c3217l.f12586a);
        sb4.append("://");
        sb4.append(c4570y);
        AbstractC22676k.m65750j(abstractC3210e, "<this>");
        if (abstractC3210e instanceof C3209d) {
            AbstractC1772c1 abstractC1772c1 = ((C3209d) abstractC3210e).f12566a;
            if (abstractC1772c1 instanceof C3216k) {
                string = "[" + C33775g.f141357g.mo106776a(((C3216k) abstractC1772c1).toString()) + ']';
            } else {
                string = abstractC1772c1.toString();
            }
        } else {
            if (!(abstractC3210e instanceof C3208c)) {
                throw new NoWhenBranchMatchedException();
            }
            string = ((C3208c) abstractC3210e).f12565a;
        }
        sb4.append(string);
        if (i13 != c3217l.f12587b) {
            sb4.append(":");
            sb4.append(i13);
        }
        int length = sb4.length();
        sb4.append(c4569x);
        sb4.append(c4554i);
        if (c33770b != null) {
            sb4.append('#');
            sb4.append(c33770b.f141349b);
        }
        String string2 = sb4.toString();
        String strSubstring = string2.substring(length);
        AbstractC22676k.m65749i(strSubstring, "substring(...)");
        if (!AbstractC39421y.m125930O(strSubstring, "/", false)) {
            "/".concat(strSubstring);
        }
        this.f18375h = string2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4560o.class != obj.getClass()) {
            return false;
        }
        C4560o c4560o = (C4560o) obj;
        return AbstractC22676k.m65745e(this.f18368a, c4560o.f18368a) && AbstractC22676k.m65745e(this.f18369b, c4560o.f18369b) && this.f18370c == c4560o.f18370c && AbstractC22676k.m65745e(this.f18371d, c4560o.f18371d) && AbstractC22676k.m65745e(this.f18372e, c4560o.f18372e) && AbstractC22676k.m65745e(this.f18373f, c4560o.f18373f) && AbstractC22676k.m65745e(this.f18374g, c4560o.f18374g);
    }

    public final int hashCode() {
        int iHashCode = (this.f18373f.hashCode() + ((this.f18372e.hashCode() + ((this.f18371d.hashCode() + ((((this.f18369b.hashCode() + (this.f18368a.hashCode() * 31)) * 31) + this.f18370c) * 31)) * 31)) * 31)) * 31;
        C33770b c33770b = this.f18374g;
        return iHashCode + (c33770b != null ? c33770b.hashCode() : 0);
    }

    public final String toString() {
        return this.f18375h;
    }
}
