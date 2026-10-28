package va3;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: va3.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C35848f {

    /* JADX INFO: renamed from: e */
    public static final C35850h f152615e = C35850h.m113816g("<root>");

    /* JADX INFO: renamed from: a */
    public final String f152616a;

    /* JADX INFO: renamed from: b */
    public transient C35847e f152617b;

    /* JADX INFO: renamed from: c */
    public transient C35848f f152618c;

    /* JADX INFO: renamed from: d */
    public transient C35850h f152619d;

    static {
        AbstractC22676k.m65749i(Pattern.compile("\\."), "compile(...)");
    }

    public C35848f(String fqName, C35847e c35847e) {
        AbstractC22676k.m65750j(fqName, "fqName");
        this.f152616a = fqName;
        this.f152617b = c35847e;
    }

    /* JADX INFO: renamed from: f */
    public static final List m113790f(C35848f c35848f) {
        if (c35848f.m113793c()) {
            return new ArrayList();
        }
        List listM113790f = m113790f(c35848f.m113795e());
        listM113790f.add(c35848f.m113796g());
        return listM113790f;
    }

    /* JADX INFO: renamed from: a */
    public final C35848f m113791a(C35850h name) {
        String strM113817b;
        AbstractC22676k.m65750j(name, "name");
        if (m113793c()) {
            strM113817b = name.m113817b();
        } else {
            strM113817b = this.f152616a + '.' + name.m113817b();
        }
        AbstractC22676k.m65747g(strM113817b);
        return new C35848f(strM113817b, this, name);
    }

    /* JADX INFO: renamed from: b */
    public final void m113792b() {
        String str = this.f152616a;
        int length = str.length() - 1;
        boolean z4 = false;
        while (true) {
            if (length < 0) {
                length = -1;
                break;
            }
            char cCharAt = str.charAt(length);
            if (cCharAt == '.' && !z4) {
                break;
            }
            if (cCharAt == '`') {
                z4 = !z4;
            } else if (cCharAt == '\\') {
                length--;
            }
            length--;
        }
        if (length < 0) {
            this.f152619d = C35850h.m113813d(str);
            this.f152618c = C35847e.f152612c.f152613a;
            return;
        }
        String strSubstring = str.substring(length + 1);
        AbstractC22676k.m65749i(strSubstring, "substring(...)");
        this.f152619d = C35850h.m113813d(strSubstring);
        String strSubstring2 = str.substring(0, length);
        AbstractC22676k.m65749i(strSubstring2, "substring(...)");
        this.f152618c = new C35848f(strSubstring2);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m113793c() {
        return this.f152616a.length() == 0;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m113794d() {
        return this.f152617b != null || AbstractC39414r.m125887f0(this.f152616a, '<', 0, false, 6) < 0;
    }

    /* JADX INFO: renamed from: e */
    public final C35848f m113795e() {
        C35848f c35848f = this.f152618c;
        if (c35848f != null) {
            return c35848f;
        }
        if (m113793c()) {
            throw new IllegalStateException("root");
        }
        m113792b();
        C35848f c35848f2 = this.f152618c;
        AbstractC22676k.m65747g(c35848f2);
        return c35848f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C35848f) {
            return AbstractC22676k.m65745e(this.f152616a, ((C35848f) obj).f152616a);
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final C35850h m113796g() {
        C35850h c35850h = this.f152619d;
        if (c35850h != null) {
            return c35850h;
        }
        if (m113793c()) {
            throw new IllegalStateException("root");
        }
        m113792b();
        C35850h c35850h2 = this.f152619d;
        AbstractC22676k.m65747g(c35850h2);
        return c35850h2;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m113797h(C35850h segment) {
        AbstractC22676k.m65750j(segment, "segment");
        if (!m113793c()) {
            String str = this.f152616a;
            int iM125887f0 = AbstractC39414r.m125887f0(str, '.', 0, false, 6);
            if (iM125887f0 == -1) {
                iM125887f0 = str.length();
            }
            int i13 = iM125887f0;
            String strM113817b = segment.m113817b();
            AbstractC22676k.m65749i(strM113817b, "asString(...)");
            if (i13 == strM113817b.length() && AbstractC39421y.m125924I(0, 0, i13, this.f152616a, strM113817b, false)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f152616a.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final C35847e m113798i() {
        C35847e c35847e = this.f152617b;
        if (c35847e != null) {
            return c35847e;
        }
        C35847e c35847e2 = new C35847e(this);
        this.f152617b = c35847e2;
        return c35847e2;
    }

    public final String toString() {
        if (!m113793c()) {
            return this.f152616a;
        }
        String strM113817b = f152615e.m113817b();
        AbstractC22676k.m65749i(strM113817b, "asString(...)");
        return strM113817b;
    }

    public C35848f(String str) {
        this.f152616a = str;
    }

    public C35848f(String str, C35848f c35848f, C35850h c35850h) {
        this.f152616a = str;
        this.f152618c = c35848f;
        this.f152619d = c35850h;
    }
}
