package jg3;

import com.mapbox.maps.MapboxMap;
import com.squareup.wire.AbstractC5583n;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import ng3.AbstractC26703p;
import ng3.C26706s;
import ng3.EnumC26688a;
import ng3.EnumC26689b;
import ng3.InterfaceC26697j;
import ng3.InterfaceC26699l;
import ng3.InterfaceC26700m;
import ng3.InterfaceC26704q;
import ng3.InterfaceC26705r;
import p048ce.AbstractC4482w;

/* JADX INFO: renamed from: jg3.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C21683j extends AbstractC4482w implements InterfaceC26697j, InterfaceC26699l, Comparable, Serializable {

    /* JADX INFO: renamed from: H */
    public static final /* synthetic */ int f83264H = 0;

    /* JADX INFO: renamed from: F */
    public final C21679f f83265F;

    /* JADX INFO: renamed from: G */
    public final C21689p f83266G;

    static {
        C21679f c21679f = C21679f.f83248J;
        C21689p c21689p = C21689p.f83280H;
        c21679f.getClass();
        new C21683j(c21679f, c21689p);
        C21679f c21679f2 = C21679f.f83249K;
        C21689p c21689p2 = C21689p.f83279G;
        c21679f2.getClass();
        new C21683j(c21679f2, c21689p2);
    }

    public C21683j(C21679f c21679f, C21689p c21689p) {
        AbstractC5583n.m16762V(c21679f, "time");
        this.f83265F = c21679f;
        AbstractC5583n.m16762V(c21689p, MapboxMap.QFE_OFFSET);
        this.f83266G = c21689p;
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C21685l(this, (byte) 66);
    }

    @Override // ng3.InterfaceC26698k
    /* JADX INFO: renamed from: a */
    public final boolean mo60986a(InterfaceC26700m interfaceC26700m) {
        if (interfaceC26700m instanceof EnumC26688a) {
            return ((EnumC26688a) interfaceC26700m).m79395g() || interfaceC26700m == EnumC26688a.OFFSET_SECONDS;
        }
        return interfaceC26700m != null && interfaceC26700m.mo79390b(this);
    }

    @Override // ng3.InterfaceC26697j
    /* JADX INFO: renamed from: b */
    public final InterfaceC26697j mo60993b(long j7, InterfaceC26700m interfaceC26700m) {
        if (!(interfaceC26700m instanceof EnumC26688a)) {
            return (C21683j) interfaceC26700m.mo79391c(this, j7);
        }
        EnumC26688a enumC26688a = EnumC26688a.OFFSET_SECONDS;
        C21679f c21679f = this.f83265F;
        if (interfaceC26700m != enumC26688a) {
            return m61058p0(c21679f.mo60993b(j7, interfaceC26700m), this.f83266G);
        }
        EnumC26688a enumC26688a2 = (EnumC26688a) interfaceC26700m;
        return m61058p0(c21679f, C21689p.m61076r(enumC26688a2.f106174x.m79420a(j7, enumC26688a2)));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int iM16791q;
        C21683j c21683j = (C21683j) obj;
        C21689p c21689p = c21683j.f83266G;
        C21679f c21679f = c21683j.f83265F;
        C21689p c21689p2 = this.f83266G;
        boolean zEquals = c21689p2.equals(c21689p);
        C21679f c21679f2 = this.f83265F;
        return (zEquals || (iM16791q = AbstractC5583n.m16791q(c21679f2.m61036C0() - (((long) c21689p2.f83282x) * 1000000000), c21679f.m61036C0() - (((long) c21683j.f83266G.f83282x) * 1000000000))) == 0) ? c21679f2.compareTo(c21679f) : iM16791q;
    }

    @Override // p048ce.AbstractC4482w, ng3.InterfaceC26698k
    /* JADX INFO: renamed from: d */
    public final C26706s mo14017d(InterfaceC26700m interfaceC26700m) {
        if (interfaceC26700m instanceof EnumC26688a) {
            return interfaceC26700m == EnumC26688a.OFFSET_SECONDS ? ((EnumC26688a) interfaceC26700m).f106174x : this.f83265F.mo14017d(interfaceC26700m);
        }
        return interfaceC26700m.mo79389a(this);
    }

    @Override // ng3.InterfaceC26699l
    /* JADX INFO: renamed from: e */
    public final InterfaceC26697j mo13612e(InterfaceC26697j interfaceC26697j) {
        return interfaceC26697j.mo60993b(this.f83265F.m61036C0(), EnumC26688a.NANO_OF_DAY).mo60993b(this.f83266G.f83282x, EnumC26688a.OFFSET_SECONDS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C21683j) {
            C21683j c21683j = (C21683j) obj;
            if (this.f83265F.equals(c21683j.f83265F) && this.f83266G.equals(c21683j.f83266G)) {
                return true;
            }
        }
        return false;
    }

    @Override // p048ce.AbstractC4482w, ng3.InterfaceC26698k
    /* JADX INFO: renamed from: g */
    public final Object mo14019g(InterfaceC26704q interfaceC26704q) {
        if (interfaceC26704q == AbstractC26703p.f106196c) {
            return EnumC26689b.NANOS;
        }
        if (interfaceC26704q == AbstractC26703p.f106198e || interfaceC26704q == AbstractC26703p.f106197d) {
            return this.f83266G;
        }
        if (interfaceC26704q == AbstractC26703p.f106200g) {
            return this.f83265F;
        }
        if (interfaceC26704q == AbstractC26703p.f106195b || interfaceC26704q == AbstractC26703p.f106199f || interfaceC26704q == AbstractC26703p.f106194a) {
            return null;
        }
        return super.mo14019g(interfaceC26704q);
    }

    @Override // ng3.InterfaceC26698k
    /* JADX INFO: renamed from: h */
    public final long mo60987h(InterfaceC26700m interfaceC26700m) {
        if (interfaceC26700m instanceof EnumC26688a) {
            return interfaceC26700m == EnumC26688a.OFFSET_SECONDS ? this.f83266G.f83282x : this.f83265F.mo60987h(interfaceC26700m);
        }
        return interfaceC26700m.mo79393e(this);
    }

    public final int hashCode() {
        return this.f83265F.hashCode() ^ this.f83266G.f83282x;
    }

    @Override // ng3.InterfaceC26697j
    /* JADX INFO: renamed from: i */
    public final InterfaceC26697j mo60995i(long j7, InterfaceC26705r interfaceC26705r) {
        return j7 == Long.MIN_VALUE ? mo60994c(Long.MAX_VALUE, interfaceC26705r).mo60994c(1L, interfaceC26705r) : mo60994c(-j7, interfaceC26705r);
    }

    @Override // ng3.InterfaceC26697j
    /* JADX INFO: renamed from: j */
    public final InterfaceC26697j mo60996j(C21677d c21677d) {
        return (C21683j) c21677d.mo13612e(this);
    }

    @Override // ng3.InterfaceC26697j
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public final C21683j mo60994c(long j7, InterfaceC26705r interfaceC26705r) {
        return interfaceC26705r instanceof EnumC26689b ? m61058p0(this.f83265F.mo60994c(j7, interfaceC26705r), this.f83266G) : (C21683j) interfaceC26705r.mo79396a(this, j7);
    }

    /* JADX INFO: renamed from: p0 */
    public final C21683j m61058p0(C21679f c21679f, C21689p c21689p) {
        return (this.f83265F == c21679f && this.f83266G.equals(c21689p)) ? this : new C21683j(c21679f, c21689p);
    }

    public final String toString() {
        return this.f83265F.toString() + this.f83266G.f83283y;
    }
}
