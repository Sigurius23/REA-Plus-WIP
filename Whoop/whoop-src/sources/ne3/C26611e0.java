package ne3;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import oe3.AbstractC27883c;
import p249jc.C21567b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ne3.e0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C26611e0 implements Comparable {

    /* JADX INFO: renamed from: x */
    public static final String f105848x;

    /* JADX INFO: renamed from: w */
    public final C26624l f105849w;

    static {
        String separator = File.separator;
        AbstractC22676k.m65749i(separator, "separator");
        f105848x = separator;
    }

    public C26611e0(C26624l bytes) {
        AbstractC22676k.m65750j(bytes, "bytes");
        this.f105849w = bytes;
    }

    /* JADX INFO: renamed from: a */
    public final ArrayList m79172a() {
        ArrayList arrayList = new ArrayList();
        int iM84154a = AbstractC27883c.m84154a(this);
        C26624l c26624l = this.f105849w;
        if (iM84154a == -1) {
            iM84154a = 0;
        } else if (iM84154a < c26624l.mo79253d() && c26624l.mo79257i(iM84154a) == 92) {
            iM84154a++;
        }
        int iMo79253d = c26624l.mo79253d();
        int i13 = iM84154a;
        while (iM84154a < iMo79253d) {
            if (c26624l.mo79257i(iM84154a) == 47 || c26624l.mo79257i(iM84154a) == 92) {
                arrayList.add(c26624l.mo79262o(i13, iM84154a));
                i13 = iM84154a + 1;
            }
            iM84154a++;
        }
        if (i13 < c26624l.mo79253d()) {
            arrayList.add(c26624l.mo79262o(i13, c26624l.mo79253d()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final String m79173b() {
        C26624l c26624l = AbstractC27883c.f112429a;
        C26624l c26624lM79249p = this.f105849w;
        int iM79248k = C26624l.m79248k(c26624lM79249p, c26624l);
        if (iM79248k == -1) {
            iM79248k = C26624l.m79248k(c26624lM79249p, AbstractC27883c.f112430b);
        }
        if (iM79248k != -1) {
            c26624lM79249p = C26624l.m79249p(c26624lM79249p, iM79248k + 1, 0, 2);
        } else if (m79178g() != null && c26624lM79249p.mo79253d() == 2) {
            c26624lM79249p = C26624l.f105881E;
        }
        return c26624lM79249p.m79265s();
    }

    /* JADX INFO: renamed from: c */
    public final C26611e0 m79174c() {
        C26624l c26624l = AbstractC27883c.f112432d;
        C26624l c26624l2 = this.f105849w;
        if (AbstractC22676k.m65745e(c26624l2, c26624l)) {
            return null;
        }
        C26624l c26624l3 = AbstractC27883c.f112429a;
        if (AbstractC22676k.m65745e(c26624l2, c26624l3)) {
            return null;
        }
        C26624l prefix = AbstractC27883c.f112430b;
        if (AbstractC22676k.m65745e(c26624l2, prefix)) {
            return null;
        }
        C26624l suffix = AbstractC27883c.f112433e;
        c26624l2.getClass();
        AbstractC22676k.m65750j(suffix, "suffix");
        int iMo79253d = c26624l2.mo79253d();
        byte[] bArr = suffix.f105883w;
        if (c26624l2.mo79260m(iMo79253d - bArr.length, bArr.length, suffix) && (c26624l2.mo79253d() == 2 || c26624l2.mo79260m(c26624l2.mo79253d() - 3, 1, c26624l3) || c26624l2.mo79260m(c26624l2.mo79253d() - 3, 1, prefix))) {
            return null;
        }
        int iM79248k = C26624l.m79248k(c26624l2, c26624l3);
        if (iM79248k == -1) {
            iM79248k = C26624l.m79248k(c26624l2, prefix);
        }
        if (iM79248k == 2 && m79178g() != null) {
            if (c26624l2.mo79253d() == 3) {
                return null;
            }
            return new C26611e0(C26624l.m79249p(c26624l2, 0, 3, 1));
        }
        if (iM79248k == 1) {
            AbstractC22676k.m65750j(prefix, "prefix");
            if (c26624l2.mo79260m(0, prefix.mo79253d(), prefix)) {
                return null;
            }
        }
        if (iM79248k != -1 || m79178g() == null) {
            if (iM79248k == -1) {
                return new C26611e0(c26624l);
            }
            return iM79248k == 0 ? new C26611e0(C26624l.m79249p(c26624l2, 0, 1, 1)) : new C26611e0(C26624l.m79249p(c26624l2, 0, iM79248k, 1));
        }
        if (c26624l2.mo79253d() == 2) {
            return null;
        }
        return new C26611e0(C26624l.m79249p(c26624l2, 0, 2, 1));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C26611e0 other = (C26611e0) obj;
        AbstractC22676k.m65750j(other, "other");
        return this.f105849w.compareTo(other.f105849w);
    }

    /* JADX INFO: renamed from: d */
    public final C26611e0 m79175d(C26611e0 other) {
        AbstractC22676k.m65750j(other, "other");
        C26624l c26624l = other.f105849w;
        int iM84154a = AbstractC27883c.m84154a(this);
        C26624l c26624l2 = this.f105849w;
        C26611e0 c26611e0 = iM84154a == -1 ? null : new C26611e0(c26624l2.mo79262o(0, iM84154a));
        int iM84154a2 = AbstractC27883c.m84154a(other);
        if (!AbstractC22676k.m65745e(c26611e0, iM84154a2 != -1 ? new C26611e0(c26624l.mo79262o(0, iM84154a2)) : null)) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + other).toString());
        }
        ArrayList arrayListM79172a = m79172a();
        ArrayList arrayListM79172a2 = other.m79172a();
        int iMin = Math.min(arrayListM79172a.size(), arrayListM79172a2.size());
        int i13 = 0;
        while (i13 < iMin && AbstractC22676k.m65745e(arrayListM79172a.get(i13), arrayListM79172a2.get(i13))) {
            i13++;
        }
        if (i13 == iMin && c26624l2.mo79253d() == c26624l.mo79253d()) {
            return C21567b.m60606o(".", false);
        }
        if (arrayListM79172a2.subList(i13, arrayListM79172a2.size()).indexOf(AbstractC27883c.f112433e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + other).toString());
        }
        if (AbstractC22676k.m65745e(c26624l, AbstractC27883c.f112432d)) {
            return this;
        }
        C26616h c26616h = new C26616h();
        C26624l c26624lM84156c = AbstractC27883c.m84156c(other);
        if (c26624lM84156c == null && (c26624lM84156c = AbstractC27883c.m84156c(this)) == null) {
            c26624lM84156c = AbstractC27883c.m84159f(f105848x);
        }
        int size = arrayListM79172a2.size();
        for (int i14 = i13; i14 < size; i14++) {
            c26616h.m79217l1(AbstractC27883c.f112433e);
            c26616h.m79217l1(c26624lM84156c);
        }
        int size2 = arrayListM79172a.size();
        while (i13 < size2) {
            c26616h.m79217l1((C26624l) arrayListM79172a.get(i13));
            c26616h.m79217l1(c26624lM84156c);
            i13++;
        }
        return AbstractC27883c.m84157d(c26616h, false);
    }

    /* JADX INFO: renamed from: e */
    public final C26611e0 m79176e(String child) {
        AbstractC22676k.m65750j(child, "child");
        C26616h c26616h = new C26616h();
        c26616h.m79232u1(child);
        return AbstractC27883c.m84155b(this, AbstractC27883c.m84157d(c26616h, false), false);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C26611e0) && AbstractC22676k.m65745e(((C26611e0) obj).f105849w, this.f105849w);
    }

    /* JADX INFO: renamed from: f */
    public final Path m79177f() {
        Path path = Paths.get(this.f105849w.m79265s(), new String[0]);
        AbstractC22676k.m65749i(path, "get(...)");
        return path;
    }

    /* JADX INFO: renamed from: g */
    public final Character m79178g() {
        C26624l c26624l = AbstractC27883c.f112429a;
        C26624l c26624l2 = this.f105849w;
        if (C26624l.m79247g(c26624l2, c26624l) != -1 || c26624l2.mo79253d() < 2 || c26624l2.mo79257i(1) != 58) {
            return null;
        }
        char cMo79257i = (char) c26624l2.mo79257i(0);
        if (('a' > cMo79257i || cMo79257i >= '{') && ('A' > cMo79257i || cMo79257i >= '[')) {
            return null;
        }
        return Character.valueOf(cMo79257i);
    }

    public final int hashCode() {
        return this.f105849w.hashCode();
    }

    public final File toFile() {
        return new File(this.f105849w.m79265s());
    }

    public final String toString() {
        return this.f105849w.m79265s();
    }
}
