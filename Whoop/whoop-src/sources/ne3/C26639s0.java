package ne3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;
import m83.AbstractC25265s;
import oe3.AbstractC27883c;
import oe3.C27886f;
import oe3.C27889i;
import p249jc.C21567b;
import p333n4.C26250f;
import p497t7.InterfaceC33561b;
import p547v8.AbstractC35785b;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: ne3.s0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C26639s0 extends AbstractC26632p {

    /* JADX INFO: renamed from: F */
    public static final C26611e0 f105908F;

    /* JADX INFO: renamed from: E */
    public final LinkedHashMap f105909E;

    /* JADX INFO: renamed from: y */
    public final C26611e0 f105910y;

    /* JADX INFO: renamed from: z */
    public final AbstractC26632p f105911z;

    static {
        String str = C26611e0.f105848x;
        f105908F = C21567b.m60606o("/", false);
    }

    public C26639s0(C26611e0 c26611e0, AbstractC26632p fileSystem, LinkedHashMap linkedHashMap) {
        AbstractC22676k.m65750j(fileSystem, "fileSystem");
        this.f105910y = c26611e0;
        this.f105911z = fileSystem;
        this.f105909E = linkedHashMap;
    }

    @Override // ne3.AbstractC26632p
    /* JADX INFO: renamed from: J */
    public final List mo79147J(C26611e0 c26611e0) throws IOException {
        C26611e0 c26611e1 = f105908F;
        c26611e1.getClass();
        C27889i c27889i = (C27889i) this.f105909E.get(AbstractC27883c.m84155b(c26611e1, c26611e0, true));
        if (c27889i != null) {
            return AbstractC25265s.m74093D1(c27889i.f112464q);
        }
        throw new IOException("not a directory: " + c26611e0);
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0117  */
    /* JADX WARN: Code duplicated, block: B:66:0x0125  */
    /* JADX WARN: Code duplicated, block: B:68:0x0129  */
    /* JADX WARN: Code duplicated, block: B:69:0x0134  */
    @Override // ne3.AbstractC26632p
    /* JADX INFO: renamed from: a0 */
    public final C26250f mo79148a0(C26611e0 path) throws Throwable {
        Long lValueOf;
        long j7;
        Long l7;
        Long lValueOf2;
        Long l12;
        Integer num;
        Long l13;
        Long lValueOf3;
        Throwable th3;
        Throwable th4;
        C27889i c27889iM113394Q;
        AbstractC22676k.m65750j(path, "path");
        C26611e0 c26611e0 = f105908F;
        c26611e0.getClass();
        C27889i c27889i = (C27889i) this.f105909E.get(AbstractC27883c.m84155b(c26611e0, path, true));
        if (c27889i == null) {
            return null;
        }
        long j13 = c27889i.f112455h;
        if (j13 != -1) {
            C26646z c26646zMo79150b0 = this.f105911z.mo79150b0(this.f105910y);
            try {
                C26621j0 c26621j0M79158c = AbstractC26604b.m79158c(c26646zMo79150b0.m79289i(j13));
                try {
                    c27889iM113394Q = AbstractC35785b.m113394Q(c26621j0M79158c, c27889i);
                    AbstractC22676k.m65747g(c27889iM113394Q);
                    try {
                        c26621j0M79158c.close();
                        th4 = null;
                    } catch (Throwable th5) {
                        th4 = th5;
                    }
                } catch (Throwable th6) {
                    try {
                        c26621j0M79158c.close();
                    } catch (Throwable th7) {
                        AbstractC29125c.m88530g(th6, th7);
                    }
                    th4 = th6;
                    c27889iM113394Q = null;
                }
                if (th4 != null) {
                    throw th4;
                }
                try {
                    c26646zMo79150b0.close();
                    th = null;
                } catch (Throwable th8) {
                    th = th8;
                }
                th3 = th;
                c27889i = c27889iM113394Q;
            } catch (Throwable th9) {
                th3 = th9;
                if (c26646zMo79150b0 != null) {
                    try {
                        c26646zMo79150b0.close();
                    } catch (Throwable th10) {
                        AbstractC29125c.m88530g(th3, th10);
                    }
                }
                c27889i = null;
            }
            if (th3 != null) {
                throw th3;
            }
        }
        boolean z4 = c27889i.f112449b;
        boolean z13 = !z4;
        Long lValueOf4 = z4 ? null : Long.valueOf(c27889i.f112453f);
        Long l14 = c27889i.f112460m;
        if (l14 != null) {
            lValueOf = Long.valueOf((l14.longValue() / ((long) InterfaceC33561b.INVALID_OWNERSHIP)) - 11644473600000L);
        } else {
            Integer num2 = c27889i.f112463p;
            lValueOf = num2 != null ? Long.valueOf(((long) num2.intValue()) * 1000) : null;
        }
        Long l15 = c27889i.f112458k;
        if (l15 != null) {
            j7 = 11644473600000L;
            lValueOf2 = Long.valueOf((l15.longValue() / ((long) InterfaceC33561b.INVALID_OWNERSHIP)) - 11644473600000L);
        } else {
            j7 = 11644473600000L;
            Integer num3 = c27889i.f112461n;
            if (num3 == null) {
                int i13 = c27889i.f112457j;
                if (i13 != -1) {
                    int i14 = c27889i.f112456i;
                    if (i13 != -1) {
                        int i15 = (i13 >> 11) & 31;
                        int i16 = (i13 >> 5) & 63;
                        int i17 = (i13 & 31) << 1;
                        GregorianCalendar gregorianCalendar = new GregorianCalendar();
                        gregorianCalendar.set(14, 0);
                        gregorianCalendar.set(((i14 >> 9) & 127) + 1980, ((i14 >> 5) & 15) - 1, i14 & 31, i15, i16, i17);
                        lValueOf2 = Long.valueOf(gregorianCalendar.getTime().getTime());
                    }
                    l12 = c27889i.f112459l;
                    if (l12 == null) {
                        num = c27889i.f112462o;
                        if (num != null) {
                            lValueOf3 = Long.valueOf(((long) num.intValue()) * 1000);
                        } else {
                            l13 = null;
                        }
                        return new C26250f(z13, z4, null, lValueOf4, lValueOf, l7, l13);
                    }
                    lValueOf3 = Long.valueOf((l12.longValue() / ((long) InterfaceC33561b.INVALID_OWNERSHIP)) - j7);
                    l13 = lValueOf3;
                    return new C26250f(z13, z4, null, lValueOf4, lValueOf, l7, l13);
                }
                l7 = null;
                l12 = c27889i.f112459l;
                if (l12 == null) {
                    num = c27889i.f112462o;
                    if (num != null) {
                        lValueOf3 = Long.valueOf(((long) num.intValue()) * 1000);
                    } else {
                        l13 = null;
                    }
                    return new C26250f(z13, z4, null, lValueOf4, lValueOf, l7, l13);
                }
                lValueOf3 = Long.valueOf((l12.longValue() / ((long) InterfaceC33561b.INVALID_OWNERSHIP)) - j7);
                l13 = lValueOf3;
                return new C26250f(z13, z4, null, lValueOf4, lValueOf, l7, l13);
            }
            lValueOf2 = Long.valueOf(((long) num3.intValue()) * 1000);
        }
        l7 = lValueOf2;
        l12 = c27889i.f112459l;
        if (l12 == null) {
            num = c27889i.f112462o;
            if (num != null) {
                lValueOf3 = Long.valueOf(((long) num.intValue()) * 1000);
            } else {
                l13 = null;
            }
            return new C26250f(z13, z4, null, lValueOf4, lValueOf, l7, l13);
        }
        lValueOf3 = Long.valueOf((l12.longValue() / ((long) InterfaceC33561b.INVALID_OWNERSHIP)) - j7);
        l13 = lValueOf3;
        return new C26250f(z13, z4, null, lValueOf4, lValueOf, l7, l13);
    }

    @Override // ne3.AbstractC26632p
    /* JADX INFO: renamed from: b */
    public final InterfaceC26629n0 mo79149b(C26611e0 file) throws IOException {
        AbstractC22676k.m65750j(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // ne3.AbstractC26632p
    /* JADX INFO: renamed from: b0 */
    public final C26646z mo79150b0(C26611e0 file) {
        AbstractC22676k.m65750j(file, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // ne3.AbstractC26632p
    /* JADX INFO: renamed from: h */
    public final void mo79151h(C26611e0 source, C26611e0 target) throws IOException {
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // ne3.AbstractC26632p
    /* JADX INFO: renamed from: k */
    public final void mo79152k(C26611e0 dir) throws IOException {
        AbstractC22676k.m65750j(dir, "dir");
        throw new IOException("zip file systems are read-only");
    }

    @Override // ne3.AbstractC26632p
    /* JADX INFO: renamed from: m */
    public final void mo79153m(C26611e0 path) throws IOException {
        AbstractC22676k.m65750j(path, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // ne3.AbstractC26632p
    /* JADX INFO: renamed from: o0 */
    public final C26646z mo79154o0(C26611e0 file) throws IOException {
        AbstractC22676k.m65750j(file, "file");
        throw new IOException("zip entries are not writable");
    }

    @Override // ne3.AbstractC26632p
    /* JADX INFO: renamed from: p0 */
    public final InterfaceC26629n0 mo37080p0(C26611e0 file, boolean z4) throws IOException {
        AbstractC22676k.m65750j(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // ne3.AbstractC26632p
    /* JADX INFO: renamed from: x0 */
    public final InterfaceC26633p0 mo79155x0(C26611e0 file) throws Throwable {
        Throwable th3;
        C26621j0 c26621j0M79158c;
        AbstractC22676k.m65750j(file, "file");
        C26611e0 c26611e0 = f105908F;
        c26611e0.getClass();
        C27889i c27889i = (C27889i) this.f105909E.get(AbstractC27883c.m84155b(c26611e0, file, true));
        if (c27889i == null) {
            throw new FileNotFoundException("no such file: " + file);
        }
        long j7 = c27889i.f112453f;
        C26646z c26646zMo79150b0 = this.f105911z.mo79150b0(this.f105910y);
        try {
            c26621j0M79158c = AbstractC26604b.m79158c(c26646zMo79150b0.m79289i(c27889i.f112455h));
            try {
                c26646zMo79150b0.close();
                th3 = null;
            } catch (Throwable th4) {
                th3 = th4;
            }
        } catch (Throwable th5) {
            if (c26646zMo79150b0 != null) {
                try {
                    c26646zMo79150b0.close();
                } catch (Throwable th6) {
                    AbstractC29125c.m88530g(th5, th6);
                }
            }
            th3 = th5;
            c26621j0M79158c = null;
        }
        if (th3 != null) {
            throw th3;
        }
        AbstractC22676k.m65750j(c26621j0M79158c, "<this>");
        AbstractC35785b.m113394Q(c26621j0M79158c, null);
        if (c27889i.f112454g == 0) {
            return new C27886f(c26621j0M79158c, j7, true);
        }
        return new C27886f(new C26644x(AbstractC26604b.m79158c(new C27886f(c26621j0M79158c, c27889i.f112452e, true)), new Inflater(true)), j7, false);
    }
}
