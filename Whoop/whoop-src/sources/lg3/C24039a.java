package lg3;

import com.squareup.wire.AbstractC5583n;
import hc3.AbstractC17176i;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import jg3.AbstractC21688o;
import jg3.C21676c;
import jg3.C21677d;
import jg3.C21678e;
import jg3.C21679f;
import jg3.C21684k;
import jg3.C21686m;
import jg3.C21689p;
import jg3.C21691r;
import jg3.EnumC21674a;
import jg3.EnumC21680g;
import kg3.AbstractC22462a;
import kg3.AbstractC22463b;
import kg3.AbstractC22464c;
import kg3.AbstractC22465d;
import kg3.C22466e;
import ng3.AbstractC26703p;
import ng3.EnumC26688a;
import ng3.EnumC26689b;
import ng3.InterfaceC26697j;
import ng3.InterfaceC26698k;
import ng3.InterfaceC26700m;
import ng3.InterfaceC26704q;
import org.threeten.p379bp.DateTimeException;
import p047c9.C4320k;
import p048ce.AbstractC4482w;

/* JADX INFO: renamed from: lg3.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C24039a extends AbstractC4482w implements Cloneable {

    /* JADX INFO: renamed from: F */
    public final HashMap f95010F = new HashMap();

    /* JADX INFO: renamed from: G */
    public AbstractC22465d f95011G;

    /* JADX INFO: renamed from: H */
    public AbstractC21688o f95012H;

    /* JADX INFO: renamed from: I */
    public AbstractC22462a f95013I;

    /* JADX INFO: renamed from: J */
    public C21679f f95014J;

    /* JADX INFO: renamed from: K */
    public C21684k f95015K;

    @Override // ng3.InterfaceC26698k
    /* JADX INFO: renamed from: a */
    public final boolean mo60986a(InterfaceC26700m interfaceC26700m) {
        if (interfaceC26700m == null) {
            return false;
        }
        if (this.f95010F.containsKey(interfaceC26700m)) {
            return true;
        }
        AbstractC22462a abstractC22462a = this.f95013I;
        if (abstractC22462a != null && abstractC22462a.mo60986a(interfaceC26700m)) {
            return true;
        }
        C21679f c21679f = this.f95014J;
        return c21679f != null && c21679f.mo60986a(interfaceC26700m);
    }

    @Override // p048ce.AbstractC4482w, ng3.InterfaceC26698k
    /* JADX INFO: renamed from: g */
    public final Object mo14019g(InterfaceC26704q interfaceC26704q) {
        if (interfaceC26704q == AbstractC26703p.f106194a) {
            return this.f95012H;
        }
        if (interfaceC26704q == AbstractC26703p.f106195b) {
            return this.f95011G;
        }
        if (interfaceC26704q == AbstractC26703p.f106199f) {
            AbstractC22462a abstractC22462a = this.f95013I;
            if (abstractC22462a != null) {
                return C21677d.m61002q0(abstractC22462a);
            }
            return null;
        }
        if (interfaceC26704q == AbstractC26703p.f106200g) {
            return this.f95014J;
        }
        if (interfaceC26704q == AbstractC26703p.f106197d || interfaceC26704q == AbstractC26703p.f106198e) {
            return interfaceC26704q.mo43799l(this);
        }
        if (interfaceC26704q == AbstractC26703p.f106196c) {
            return null;
        }
        return interfaceC26704q.mo43799l(this);
    }

    @Override // ng3.InterfaceC26698k
    /* JADX INFO: renamed from: h */
    public final long mo60987h(InterfaceC26700m interfaceC26700m) {
        AbstractC5583n.m16762V(interfaceC26700m, "field");
        Long l7 = (Long) this.f95010F.get(interfaceC26700m);
        if (l7 != null) {
            return l7.longValue();
        }
        AbstractC22462a abstractC22462a = this.f95013I;
        if (abstractC22462a != null && abstractC22462a.mo60986a(interfaceC26700m)) {
            return ((C21677d) this.f95013I).mo60987h(interfaceC26700m);
        }
        C21679f c21679f = this.f95014J;
        if (c21679f == null || !c21679f.mo60986a(interfaceC26700m)) {
            throw new DateTimeException(AbstractC17176i.m48504f("Field not found: ", interfaceC26700m));
        }
        return this.f95014J.mo60987h(interfaceC26700m);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m70932o0(long j7, InterfaceC26700m interfaceC26700m) {
        AbstractC5583n.m16762V(interfaceC26700m, "field");
        HashMap map = this.f95010F;
        Long l7 = (Long) map.get(interfaceC26700m);
        if (l7 == null || l7.longValue() == j7) {
            map.put(interfaceC26700m, Long.valueOf(j7));
            return;
        }
        throw new DateTimeException("Conflict found: " + interfaceC26700m + " " + l7 + " differs from " + interfaceC26700m + " " + j7 + ": " + this);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m70933p0(C21677d c21677d) {
        if (c21677d != null) {
            this.f95013I = c21677d;
            HashMap map = this.f95010F;
            for (InterfaceC26700m interfaceC26700m : map.keySet()) {
                if ((interfaceC26700m instanceof EnumC26688a) && ((EnumC26688a) interfaceC26700m).isDateBased()) {
                    try {
                        long jMo60987h = c21677d.mo60987h(interfaceC26700m);
                        Long l7 = (Long) map.get(interfaceC26700m);
                        if (jMo60987h != l7.longValue()) {
                            throw new DateTimeException("Conflict found: Field " + interfaceC26700m + " " + jMo60987h + " differs from " + interfaceC26700m + " " + l7 + " derived from " + c21677d);
                        }
                    } catch (DateTimeException unused) {
                        continue;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final void m70934q0(InterfaceC26698k interfaceC26698k) {
        Iterator it = this.f95010F.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            InterfaceC26700m interfaceC26700m = (InterfaceC26700m) entry.getKey();
            long jLongValue = ((Long) entry.getValue()).longValue();
            if (interfaceC26698k.mo60986a(interfaceC26700m)) {
                try {
                    long jMo60987h = interfaceC26698k.mo60987h(interfaceC26700m);
                    if (jMo60987h != jLongValue) {
                        throw new DateTimeException("Cross check failed: " + interfaceC26700m + " " + jMo60987h + " vs " + interfaceC26700m + " " + jLongValue);
                    }
                    it.remove();
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0321  */
    /* JADX WARN: Code duplicated, block: B:108:0x032a  */
    /* JADX WARN: Code duplicated, block: B:110:0x033c  */
    /* JADX WARN: Code duplicated, block: B:111:0x0354  */
    /* JADX WARN: Code duplicated, block: B:112:0x036a  */
    /* JADX WARN: Code duplicated, block: B:114:0x0372  */
    /* JADX WARN: Code duplicated, block: B:116:0x037a  */
    /* JADX WARN: Code duplicated, block: B:118:0x038c  */
    /* JADX WARN: Code duplicated, block: B:119:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:121:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:127:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:129:0x0400  */
    /* JADX WARN: Code duplicated, block: B:131:0x0412  */
    /* JADX WARN: Code duplicated, block: B:132:0x043b  */
    /* JADX WARN: Code duplicated, block: B:134:0x0475  */
    /* JADX WARN: Code duplicated, block: B:139:0x0483  */
    /* JADX INFO: renamed from: r0 */
    public final void m70935r0(EnumC24059u enumC24059u) {
        C21677d c21677dM61014x0;
        EnumC26688a enumC26688a;
        EnumC26688a enumC26688a2;
        EnumC26688a enumC26688a3;
        EnumC26688a enumC26688a4;
        int iM79420a;
        C21677d c21677dMo60996j;
        int iM79420a2;
        int iM79420a3;
        C21677d c21677dMo60996j2;
        boolean z4 = this.f95011G instanceof C22466e;
        HashMap map = this.f95010F;
        if (!z4) {
            EnumC26688a enumC26688a5 = EnumC26688a.EPOCH_DAY;
            if (map.containsKey(enumC26688a5)) {
                m70933p0(C21677d.m61004u0(((Long) map.remove(enumC26688a5)).longValue()));
                return;
            }
            return;
        }
        C22466e c22466e = C22466e.f88015w;
        EnumC26688a enumC26688a6 = EnumC26688a.EPOCH_DAY;
        if (map.containsKey(enumC26688a6)) {
            c21677dM61014x0 = C21677d.m61004u0(((Long) map.remove(enumC26688a6)).longValue());
        } else {
            EnumC26688a enumC26688a7 = EnumC26688a.PROLEPTIC_MONTH;
            Long l7 = (Long) map.remove(enumC26688a7);
            EnumC24059u enumC24059u2 = EnumC24059u.f95080y;
            boolean z13 = true;
            if (l7 != null) {
                if (enumC24059u != enumC24059u2) {
                    enumC26688a7.m79394f(l7.longValue());
                }
                AbstractC22465d.m64907b(map, EnumC26688a.MONTH_OF_YEAR, AbstractC5583n.m16743B(12, l7.longValue()) + 1);
                AbstractC22465d.m64907b(map, EnumC26688a.YEAR, AbstractC5583n.m16742A(l7.longValue(), 12L));
            }
            EnumC26688a enumC26688a8 = EnumC26688a.YEAR_OF_ERA;
            Long l12 = (Long) map.remove(enumC26688a8);
            EnumC24059u enumC24059u3 = EnumC24059u.f95078w;
            if (l12 != null) {
                if (enumC24059u != enumC24059u2) {
                    enumC26688a8.m79394f(l12.longValue());
                }
                Long l13 = (Long) map.remove(EnumC26688a.ERA);
                if (l13 == null) {
                    EnumC26688a enumC26688a9 = EnumC26688a.YEAR;
                    Long l14 = (Long) map.get(enumC26688a9);
                    if (enumC24059u != enumC24059u3) {
                        AbstractC22465d.m64907b(map, enumC26688a9, (l14 == null || l14.longValue() > 0) ? l12.longValue() : AbstractC5583n.m16768a0(1L, l12.longValue()));
                    } else if (l14 != null) {
                        long jLongValue = l14.longValue();
                        long jLongValue2 = l12.longValue();
                        if (jLongValue <= 0) {
                            jLongValue2 = AbstractC5583n.m16768a0(1L, jLongValue2);
                        }
                        AbstractC22465d.m64907b(map, enumC26688a9, jLongValue2);
                    } else {
                        map.put(enumC26688a8, l12);
                    }
                } else if (l13.longValue() == 1) {
                    AbstractC22465d.m64907b(map, EnumC26688a.YEAR, l12.longValue());
                } else {
                    if (l13.longValue() != 0) {
                        throw new DateTimeException("Invalid value for era: " + l13);
                    }
                    AbstractC22465d.m64907b(map, EnumC26688a.YEAR, AbstractC5583n.m16768a0(1L, l12.longValue()));
                }
            } else {
                EnumC26688a enumC26688a10 = EnumC26688a.ERA;
                if (map.containsKey(enumC26688a10)) {
                    enumC26688a10.m79394f(((Long) map.get(enumC26688a10)).longValue());
                }
            }
            EnumC26688a enumC26688a11 = EnumC26688a.YEAR;
            if (map.containsKey(enumC26688a11)) {
                EnumC26688a enumC26688a12 = EnumC26688a.MONTH_OF_YEAR;
                if (map.containsKey(enumC26688a12)) {
                    EnumC26688a enumC26688a13 = EnumC26688a.DAY_OF_MONTH;
                    if (map.containsKey(enumC26688a13)) {
                        int iM79420a4 = enumC26688a11.f106174x.m79420a(((Long) map.remove(enumC26688a11)).longValue(), enumC26688a11);
                        int iM16770b0 = AbstractC5583n.m16770b0(((Long) map.remove(enumC26688a12)).longValue());
                        int iM16770b1 = AbstractC5583n.m16770b0(((Long) map.remove(enumC26688a13)).longValue());
                        if (enumC24059u == enumC24059u2) {
                            c21677dM61014x0 = C21677d.m61003t0(iM79420a4, 1, 1).m61015y0(AbstractC5583n.m16766Z(iM16770b0)).m61014x0(AbstractC5583n.m16766Z(iM16770b1));
                        } else if (enumC24059u == EnumC24059u.f95079x) {
                            enumC26688a13.m79394f(iM16770b1);
                            if (iM16770b0 == 4 || iM16770b0 == 6 || iM16770b0 == 9 || iM16770b0 == 11) {
                                iM16770b1 = Math.min(iM16770b1, 30);
                            } else if (iM16770b0 == 2) {
                                EnumC21680g enumC21680g = EnumC21680g.f83255w;
                                long j7 = iM79420a4;
                                int i13 = C21686m.f83271G;
                                if ((3 & j7) != 0 || (j7 % 100 == 0 && j7 % 400 != 0)) {
                                    z13 = false;
                                }
                                iM16770b1 = Math.min(iM16770b1, enumC21680g.m61050m(z13));
                            }
                            c21677dM61014x0 = C21677d.m61003t0(iM79420a4, iM16770b0, iM16770b1);
                        } else {
                            c21677dM61014x0 = C21677d.m61003t0(iM79420a4, iM16770b0, iM16770b1);
                        }
                    } else {
                        EnumC26688a enumC26688a14 = EnumC26688a.ALIGNED_WEEK_OF_MONTH;
                        if (map.containsKey(enumC26688a14)) {
                            EnumC26688a enumC26688a15 = EnumC26688a.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                            if (map.containsKey(enumC26688a15)) {
                                int iM79420a5 = enumC26688a11.f106174x.m79420a(((Long) map.remove(enumC26688a11)).longValue(), enumC26688a11);
                                if (enumC24059u == enumC24059u2) {
                                    c21677dM61014x0 = C21677d.m61003t0(iM79420a5, 1, 1).m61015y0(AbstractC5583n.m16768a0(((Long) map.remove(enumC26688a12)).longValue(), 1L)).m61016z0(AbstractC5583n.m16768a0(((Long) map.remove(enumC26688a14)).longValue(), 1L)).m61014x0(AbstractC5583n.m16768a0(((Long) map.remove(enumC26688a15)).longValue(), 1L));
                                } else {
                                    int iM79420a6 = enumC26688a12.f106174x.m79420a(((Long) map.remove(enumC26688a12)).longValue(), enumC26688a12);
                                    c21677dMo60996j2 = C21677d.m61003t0(iM79420a5, iM79420a6, 1).m61014x0((enumC26688a15.f106174x.m79420a(((Long) map.remove(enumC26688a15)).longValue(), enumC26688a15) - 1) + ((enumC26688a14.f106174x.m79420a(((Long) map.remove(enumC26688a14)).longValue(), enumC26688a14) - 1) * 7));
                                    if (enumC24059u == enumC24059u3 && c21677dMo60996j2.mo14018f(enumC26688a12) != iM79420a6) {
                                        throw new DateTimeException("Strict mode rejected date parsed to a different month");
                                    }
                                    c21677dM61014x0 = c21677dMo60996j2;
                                }
                            } else {
                                EnumC26688a enumC26688a16 = EnumC26688a.DAY_OF_WEEK;
                                if (map.containsKey(enumC26688a16)) {
                                    int iM79420a7 = enumC26688a11.f106174x.m79420a(((Long) map.remove(enumC26688a11)).longValue(), enumC26688a11);
                                    if (enumC24059u == enumC24059u2) {
                                        c21677dM61014x0 = C21677d.m61003t0(iM79420a7, 1, 1).m61015y0(AbstractC5583n.m16768a0(((Long) map.remove(enumC26688a12)).longValue(), 1L)).m61016z0(AbstractC5583n.m16768a0(((Long) map.remove(enumC26688a14)).longValue(), 1L)).m61014x0(AbstractC5583n.m16768a0(((Long) map.remove(enumC26688a16)).longValue(), 1L));
                                    } else {
                                        int iM79420a8 = enumC26688a12.f106174x.m79420a(((Long) map.remove(enumC26688a12)).longValue(), enumC26688a12);
                                        c21677dMo60996j2 = C21677d.m61003t0(iM79420a7, iM79420a8, 1).m61016z0(enumC26688a14.f106174x.m79420a(((Long) map.remove(enumC26688a14)).longValue(), enumC26688a14) - 1).mo60996j(new C4320k(0, EnumC21674a.m60985l(enumC26688a16.f106174x.m79420a(((Long) map.remove(enumC26688a16)).longValue(), enumC26688a16))));
                                        if (enumC24059u == enumC24059u3 && c21677dMo60996j2.mo14018f(enumC26688a12) != iM79420a8) {
                                            throw new DateTimeException("Strict mode rejected date parsed to a different month");
                                        }
                                        c21677dM61014x0 = c21677dMo60996j2;
                                    }
                                } else {
                                    enumC26688a = EnumC26688a.DAY_OF_YEAR;
                                    if (map.containsKey(enumC26688a)) {
                                        iM79420a3 = enumC26688a11.f106174x.m79420a(((Long) map.remove(enumC26688a11)).longValue(), enumC26688a11);
                                        if (enumC24059u == enumC24059u2) {
                                            c21677dM61014x0 = C21677d.m61005v0(iM79420a3, 1).m61014x0(AbstractC5583n.m16768a0(((Long) map.remove(enumC26688a)).longValue(), 1L));
                                        } else {
                                            c21677dM61014x0 = C21677d.m61005v0(iM79420a3, enumC26688a.f106174x.m79420a(((Long) map.remove(enumC26688a)).longValue(), enumC26688a));
                                        }
                                    } else {
                                        enumC26688a2 = EnumC26688a.ALIGNED_WEEK_OF_YEAR;
                                        if (map.containsKey(enumC26688a2)) {
                                            enumC26688a3 = EnumC26688a.ALIGNED_DAY_OF_WEEK_IN_YEAR;
                                            if (map.containsKey(enumC26688a3)) {
                                                iM79420a2 = enumC26688a11.f106174x.m79420a(((Long) map.remove(enumC26688a11)).longValue(), enumC26688a11);
                                                if (enumC24059u == enumC24059u2) {
                                                    c21677dM61014x0 = C21677d.m61003t0(iM79420a2, 1, 1).m61016z0(AbstractC5583n.m16768a0(((Long) map.remove(enumC26688a2)).longValue(), 1L)).m61014x0(AbstractC5583n.m16768a0(((Long) map.remove(enumC26688a3)).longValue(), 1L));
                                                } else {
                                                    c21677dMo60996j = C21677d.m61003t0(iM79420a2, 1, 1).m61014x0((enumC26688a3.f106174x.m79420a(((Long) map.remove(enumC26688a3)).longValue(), enumC26688a3) - 1) + ((enumC26688a2.f106174x.m79420a(((Long) map.remove(enumC26688a2)).longValue(), enumC26688a2) - 1) * 7));
                                                    if (enumC24059u == enumC24059u3 && c21677dMo60996j.mo14018f(enumC26688a11) != iM79420a2) {
                                                        throw new DateTimeException("Strict mode rejected date parsed to a different year");
                                                    }
                                                    c21677dM61014x0 = c21677dMo60996j;
                                                }
                                            } else {
                                                enumC26688a4 = EnumC26688a.DAY_OF_WEEK;
                                                if (map.containsKey(enumC26688a4)) {
                                                    iM79420a = enumC26688a11.f106174x.m79420a(((Long) map.remove(enumC26688a11)).longValue(), enumC26688a11);
                                                    if (enumC24059u == enumC24059u2) {
                                                        c21677dM61014x0 = C21677d.m61003t0(iM79420a, 1, 1).m61016z0(AbstractC5583n.m16768a0(((Long) map.remove(enumC26688a2)).longValue(), 1L)).m61014x0(AbstractC5583n.m16768a0(((Long) map.remove(enumC26688a4)).longValue(), 1L));
                                                    } else {
                                                        c21677dMo60996j = C21677d.m61003t0(iM79420a, 1, 1).m61016z0(enumC26688a2.f106174x.m79420a(((Long) map.remove(enumC26688a2)).longValue(), enumC26688a2) - 1).mo60996j(new C4320k(0, EnumC21674a.m60985l(enumC26688a4.f106174x.m79420a(((Long) map.remove(enumC26688a4)).longValue(), enumC26688a4))));
                                                        if (enumC24059u == enumC24059u3 && c21677dMo60996j.mo14018f(enumC26688a11) != iM79420a) {
                                                            throw new DateTimeException("Strict mode rejected date parsed to a different month");
                                                        }
                                                        c21677dM61014x0 = c21677dMo60996j;
                                                    }
                                                } else {
                                                    c21677dM61014x0 = null;
                                                }
                                            }
                                        } else {
                                            c21677dM61014x0 = null;
                                        }
                                    }
                                }
                            }
                        } else {
                            enumC26688a = EnumC26688a.DAY_OF_YEAR;
                            if (map.containsKey(enumC26688a)) {
                                iM79420a3 = enumC26688a11.f106174x.m79420a(((Long) map.remove(enumC26688a11)).longValue(), enumC26688a11);
                                if (enumC24059u == enumC24059u2) {
                                    c21677dM61014x0 = C21677d.m61005v0(iM79420a3, 1).m61014x0(AbstractC5583n.m16768a0(((Long) map.remove(enumC26688a)).longValue(), 1L));
                                } else {
                                    c21677dM61014x0 = C21677d.m61005v0(iM79420a3, enumC26688a.f106174x.m79420a(((Long) map.remove(enumC26688a)).longValue(), enumC26688a));
                                }
                            } else {
                                enumC26688a2 = EnumC26688a.ALIGNED_WEEK_OF_YEAR;
                                if (map.containsKey(enumC26688a2)) {
                                    enumC26688a3 = EnumC26688a.ALIGNED_DAY_OF_WEEK_IN_YEAR;
                                    if (map.containsKey(enumC26688a3)) {
                                        iM79420a2 = enumC26688a11.f106174x.m79420a(((Long) map.remove(enumC26688a11)).longValue(), enumC26688a11);
                                        if (enumC24059u == enumC24059u2) {
                                            c21677dM61014x0 = C21677d.m61003t0(iM79420a2, 1, 1).m61016z0(AbstractC5583n.m16768a0(((Long) map.remove(enumC26688a2)).longValue(), 1L)).m61014x0(AbstractC5583n.m16768a0(((Long) map.remove(enumC26688a3)).longValue(), 1L));
                                        } else {
                                            c21677dMo60996j = C21677d.m61003t0(iM79420a2, 1, 1).m61014x0((enumC26688a3.f106174x.m79420a(((Long) map.remove(enumC26688a3)).longValue(), enumC26688a3) - 1) + ((enumC26688a2.f106174x.m79420a(((Long) map.remove(enumC26688a2)).longValue(), enumC26688a2) - 1) * 7));
                                            if (enumC24059u == enumC24059u3) {
                                                throw new DateTimeException("Strict mode rejected date parsed to a different year");
                                            }
                                            c21677dM61014x0 = c21677dMo60996j;
                                        }
                                    } else {
                                        enumC26688a4 = EnumC26688a.DAY_OF_WEEK;
                                        if (map.containsKey(enumC26688a4)) {
                                            iM79420a = enumC26688a11.f106174x.m79420a(((Long) map.remove(enumC26688a11)).longValue(), enumC26688a11);
                                            if (enumC24059u == enumC24059u2) {
                                                c21677dM61014x0 = C21677d.m61003t0(iM79420a, 1, 1).m61016z0(AbstractC5583n.m16768a0(((Long) map.remove(enumC26688a2)).longValue(), 1L)).m61014x0(AbstractC5583n.m16768a0(((Long) map.remove(enumC26688a4)).longValue(), 1L));
                                            } else {
                                                c21677dMo60996j = C21677d.m61003t0(iM79420a, 1, 1).m61016z0(enumC26688a2.f106174x.m79420a(((Long) map.remove(enumC26688a2)).longValue(), enumC26688a2) - 1).mo60996j(new C4320k(0, EnumC21674a.m60985l(enumC26688a4.f106174x.m79420a(((Long) map.remove(enumC26688a4)).longValue(), enumC26688a4))));
                                                if (enumC24059u == enumC24059u3) {
                                                    throw new DateTimeException("Strict mode rejected date parsed to a different month");
                                                }
                                                c21677dM61014x0 = c21677dMo60996j;
                                            }
                                        } else {
                                            c21677dM61014x0 = null;
                                        }
                                    }
                                } else {
                                    c21677dM61014x0 = null;
                                }
                            }
                        }
                    }
                } else {
                    enumC26688a = EnumC26688a.DAY_OF_YEAR;
                    if (map.containsKey(enumC26688a)) {
                        iM79420a3 = enumC26688a11.f106174x.m79420a(((Long) map.remove(enumC26688a11)).longValue(), enumC26688a11);
                        if (enumC24059u == enumC24059u2) {
                            c21677dM61014x0 = C21677d.m61005v0(iM79420a3, 1).m61014x0(AbstractC5583n.m16768a0(((Long) map.remove(enumC26688a)).longValue(), 1L));
                        } else {
                            c21677dM61014x0 = C21677d.m61005v0(iM79420a3, enumC26688a.f106174x.m79420a(((Long) map.remove(enumC26688a)).longValue(), enumC26688a));
                        }
                    } else {
                        enumC26688a2 = EnumC26688a.ALIGNED_WEEK_OF_YEAR;
                        if (map.containsKey(enumC26688a2)) {
                            enumC26688a3 = EnumC26688a.ALIGNED_DAY_OF_WEEK_IN_YEAR;
                            if (map.containsKey(enumC26688a3)) {
                                iM79420a2 = enumC26688a11.f106174x.m79420a(((Long) map.remove(enumC26688a11)).longValue(), enumC26688a11);
                                if (enumC24059u == enumC24059u2) {
                                    c21677dM61014x0 = C21677d.m61003t0(iM79420a2, 1, 1).m61016z0(AbstractC5583n.m16768a0(((Long) map.remove(enumC26688a2)).longValue(), 1L)).m61014x0(AbstractC5583n.m16768a0(((Long) map.remove(enumC26688a3)).longValue(), 1L));
                                } else {
                                    c21677dMo60996j = C21677d.m61003t0(iM79420a2, 1, 1).m61014x0((enumC26688a3.f106174x.m79420a(((Long) map.remove(enumC26688a3)).longValue(), enumC26688a3) - 1) + ((enumC26688a2.f106174x.m79420a(((Long) map.remove(enumC26688a2)).longValue(), enumC26688a2) - 1) * 7));
                                    if (enumC24059u == enumC24059u3) {
                                        throw new DateTimeException("Strict mode rejected date parsed to a different year");
                                    }
                                    c21677dM61014x0 = c21677dMo60996j;
                                }
                            } else {
                                enumC26688a4 = EnumC26688a.DAY_OF_WEEK;
                                if (map.containsKey(enumC26688a4)) {
                                    iM79420a = enumC26688a11.f106174x.m79420a(((Long) map.remove(enumC26688a11)).longValue(), enumC26688a11);
                                    if (enumC24059u == enumC24059u2) {
                                        c21677dM61014x0 = C21677d.m61003t0(iM79420a, 1, 1).m61016z0(AbstractC5583n.m16768a0(((Long) map.remove(enumC26688a2)).longValue(), 1L)).m61014x0(AbstractC5583n.m16768a0(((Long) map.remove(enumC26688a4)).longValue(), 1L));
                                    } else {
                                        c21677dMo60996j = C21677d.m61003t0(iM79420a, 1, 1).m61016z0(enumC26688a2.f106174x.m79420a(((Long) map.remove(enumC26688a2)).longValue(), enumC26688a2) - 1).mo60996j(new C4320k(0, EnumC21674a.m60985l(enumC26688a4.f106174x.m79420a(((Long) map.remove(enumC26688a4)).longValue(), enumC26688a4))));
                                        if (enumC24059u == enumC24059u3) {
                                            throw new DateTimeException("Strict mode rejected date parsed to a different month");
                                        }
                                        c21677dM61014x0 = c21677dMo60996j;
                                    }
                                } else {
                                    c21677dM61014x0 = null;
                                }
                            }
                        } else {
                            c21677dM61014x0 = null;
                        }
                    }
                }
            } else {
                c21677dM61014x0 = null;
            }
        }
        m70933p0(c21677dM61014x0);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m70936s0() {
        EnumC26688a enumC26688a = EnumC26688a.INSTANT_SECONDS;
        HashMap map = this.f95010F;
        if (map.containsKey(enumC26688a)) {
            AbstractC21688o abstractC21688o = this.f95012H;
            if (abstractC21688o != null) {
                m70937t0(abstractC21688o);
                return;
            }
            Long l7 = (Long) map.get(EnumC26688a.OFFSET_SECONDS);
            if (l7 != null) {
                m70937t0(C21689p.m61076r(l7.intValue()));
            }
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final void m70937t0(AbstractC21688o abstractC21688o) {
        EnumC26688a enumC26688a = EnumC26688a.INSTANT_SECONDS;
        C21676c c21676cM60990o0 = C21676c.m60990o0(0, ((Long) this.f95010F.remove(enumC26688a)).longValue());
        ((C22466e) this.f95011G).getClass();
        AbstractC5583n.m16762V(c21676cM60990o0, "instant");
        AbstractC5583n.m16762V(abstractC21688o, "zone");
        C21678e c21678e = C21691r.m61081o0(c21676cM60990o0.f83235F, c21676cM60990o0.f83236G, abstractC21688o).f83287F;
        if (this.f95013I == null) {
            this.f95013I = c21678e.f83246F;
        } else {
            m70941x0(enumC26688a, c21678e.f83246F);
        }
        m70932o0(c21678e.f83247G.m61037D0(), EnumC26688a.SECOND_OF_DAY);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder(128);
        sb4.append("DateTimeBuilder[");
        HashMap map = this.f95010F;
        if (map.size() > 0) {
            sb4.append("fields=");
            sb4.append(map);
        }
        sb4.append(", ");
        sb4.append(this.f95011G);
        sb4.append(", ");
        sb4.append(this.f95012H);
        sb4.append(", ");
        sb4.append(this.f95013I);
        sb4.append(", ");
        sb4.append(this.f95014J);
        sb4.append(']');
        return sb4.toString();
    }

    /* JADX INFO: renamed from: u0 */
    public final void m70938u0(EnumC24059u enumC24059u) {
        EnumC26688a enumC26688a = EnumC26688a.CLOCK_HOUR_OF_DAY;
        HashMap map = this.f95010F;
        boolean zContainsKey = map.containsKey(enumC26688a);
        EnumC24059u enumC24059u2 = EnumC24059u.f95079x;
        EnumC24059u enumC24059u3 = EnumC24059u.f95080y;
        if (zContainsKey) {
            long jLongValue = ((Long) map.remove(enumC26688a)).longValue();
            if (enumC24059u != enumC24059u3 && (enumC24059u != enumC24059u2 || jLongValue != 0)) {
                enumC26688a.m79394f(jLongValue);
            }
            EnumC26688a enumC26688a2 = EnumC26688a.HOUR_OF_DAY;
            if (jLongValue == 24) {
                jLongValue = 0;
            }
            m70932o0(jLongValue, enumC26688a2);
        }
        EnumC26688a enumC26688a3 = EnumC26688a.CLOCK_HOUR_OF_AMPM;
        if (map.containsKey(enumC26688a3)) {
            long jLongValue2 = ((Long) map.remove(enumC26688a3)).longValue();
            if (enumC24059u != enumC24059u3 && (enumC24059u != enumC24059u2 || jLongValue2 != 0)) {
                enumC26688a3.m79394f(jLongValue2);
            }
            m70932o0(jLongValue2 != 12 ? jLongValue2 : 0L, EnumC26688a.HOUR_OF_AMPM);
        }
        if (enumC24059u != enumC24059u3) {
            EnumC26688a enumC26688a4 = EnumC26688a.AMPM_OF_DAY;
            if (map.containsKey(enumC26688a4)) {
                enumC26688a4.m79394f(((Long) map.get(enumC26688a4)).longValue());
            }
            EnumC26688a enumC26688a5 = EnumC26688a.HOUR_OF_AMPM;
            if (map.containsKey(enumC26688a5)) {
                enumC26688a5.m79394f(((Long) map.get(enumC26688a5)).longValue());
            }
        }
        EnumC26688a enumC26688a6 = EnumC26688a.AMPM_OF_DAY;
        if (map.containsKey(enumC26688a6)) {
            EnumC26688a enumC26688a7 = EnumC26688a.HOUR_OF_AMPM;
            if (map.containsKey(enumC26688a7)) {
                m70932o0((((Long) map.remove(enumC26688a6)).longValue() * 12) + ((Long) map.remove(enumC26688a7)).longValue(), EnumC26688a.HOUR_OF_DAY);
            }
        }
        EnumC26688a enumC26688a8 = EnumC26688a.NANO_OF_DAY;
        if (map.containsKey(enumC26688a8)) {
            long jLongValue3 = ((Long) map.remove(enumC26688a8)).longValue();
            if (enumC24059u != enumC24059u3) {
                enumC26688a8.m79394f(jLongValue3);
            }
            m70932o0(jLongValue3 / 1000000000, EnumC26688a.SECOND_OF_DAY);
            m70932o0(jLongValue3 % 1000000000, EnumC26688a.NANO_OF_SECOND);
        }
        EnumC26688a enumC26688a9 = EnumC26688a.MICRO_OF_DAY;
        if (map.containsKey(enumC26688a9)) {
            long jLongValue4 = ((Long) map.remove(enumC26688a9)).longValue();
            if (enumC24059u != enumC24059u3) {
                enumC26688a9.m79394f(jLongValue4);
            }
            m70932o0(jLongValue4 / 1000000, EnumC26688a.SECOND_OF_DAY);
            m70932o0(jLongValue4 % 1000000, EnumC26688a.MICRO_OF_SECOND);
        }
        EnumC26688a enumC26688a10 = EnumC26688a.MILLI_OF_DAY;
        if (map.containsKey(enumC26688a10)) {
            long jLongValue5 = ((Long) map.remove(enumC26688a10)).longValue();
            if (enumC24059u != enumC24059u3) {
                enumC26688a10.m79394f(jLongValue5);
            }
            m70932o0(jLongValue5 / 1000, EnumC26688a.SECOND_OF_DAY);
            m70932o0(jLongValue5 % 1000, EnumC26688a.MILLI_OF_SECOND);
        }
        EnumC26688a enumC26688a11 = EnumC26688a.SECOND_OF_DAY;
        if (map.containsKey(enumC26688a11)) {
            long jLongValue6 = ((Long) map.remove(enumC26688a11)).longValue();
            if (enumC24059u != enumC24059u3) {
                enumC26688a11.m79394f(jLongValue6);
            }
            m70932o0(jLongValue6 / 3600, EnumC26688a.HOUR_OF_DAY);
            m70932o0((jLongValue6 / 60) % 60, EnumC26688a.MINUTE_OF_HOUR);
            m70932o0(jLongValue6 % 60, EnumC26688a.SECOND_OF_MINUTE);
        }
        EnumC26688a enumC26688a12 = EnumC26688a.MINUTE_OF_DAY;
        if (map.containsKey(enumC26688a12)) {
            long jLongValue7 = ((Long) map.remove(enumC26688a12)).longValue();
            if (enumC24059u != enumC24059u3) {
                enumC26688a12.m79394f(jLongValue7);
            }
            m70932o0(jLongValue7 / 60, EnumC26688a.HOUR_OF_DAY);
            m70932o0(jLongValue7 % 60, EnumC26688a.MINUTE_OF_HOUR);
        }
        if (enumC24059u != enumC24059u3) {
            EnumC26688a enumC26688a13 = EnumC26688a.MILLI_OF_SECOND;
            if (map.containsKey(enumC26688a13)) {
                enumC26688a13.m79394f(((Long) map.get(enumC26688a13)).longValue());
            }
            EnumC26688a enumC26688a14 = EnumC26688a.MICRO_OF_SECOND;
            if (map.containsKey(enumC26688a14)) {
                enumC26688a14.m79394f(((Long) map.get(enumC26688a14)).longValue());
            }
        }
        EnumC26688a enumC26688a15 = EnumC26688a.MILLI_OF_SECOND;
        if (map.containsKey(enumC26688a15)) {
            EnumC26688a enumC26688a16 = EnumC26688a.MICRO_OF_SECOND;
            if (map.containsKey(enumC26688a16)) {
                m70932o0((((Long) map.get(enumC26688a16)).longValue() % 1000) + (((Long) map.remove(enumC26688a15)).longValue() * 1000), enumC26688a16);
            }
        }
        EnumC26688a enumC26688a17 = EnumC26688a.MICRO_OF_SECOND;
        if (map.containsKey(enumC26688a17)) {
            EnumC26688a enumC26688a18 = EnumC26688a.NANO_OF_SECOND;
            if (map.containsKey(enumC26688a18)) {
                m70932o0(((Long) map.get(enumC26688a18)).longValue() / 1000, enumC26688a17);
                map.remove(enumC26688a17);
            }
        }
        if (map.containsKey(enumC26688a15)) {
            EnumC26688a enumC26688a19 = EnumC26688a.NANO_OF_SECOND;
            if (map.containsKey(enumC26688a19)) {
                m70932o0(((Long) map.get(enumC26688a19)).longValue() / 1000000, enumC26688a15);
                map.remove(enumC26688a15);
            }
        }
        if (map.containsKey(enumC26688a17)) {
            m70932o0(((Long) map.remove(enumC26688a17)).longValue() * 1000, EnumC26688a.NANO_OF_SECOND);
        } else if (map.containsKey(enumC26688a15)) {
            m70932o0(((Long) map.remove(enumC26688a15)).longValue() * 1000000, EnumC26688a.NANO_OF_SECOND);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m70939v0(EnumC24059u enumC24059u) {
        HashMap map;
        C21684k c21684k;
        InterfaceC26697j interfaceC26697j;
        C21679f c21679f;
        Object obj;
        EnumC26688a enumC26688a;
        C21679f c21679f2;
        InterfaceC26700m interfaceC26700m;
        m70936s0();
        m70935r0(enumC24059u);
        m70938u0(enumC24059u);
        int i13 = 0;
        loop0: while (true) {
            map = this.f95010F;
            if (i13 >= 100) {
                break;
            }
            Iterator it = map.entrySet().iterator();
            do {
                if (!it.hasNext()) {
                    break loop0;
                }
                interfaceC26700m = (InterfaceC26700m) ((Map.Entry) it.next()).getKey();
                InterfaceC26698k interfaceC26698kMo79392d = interfaceC26700m.mo79392d(map, enumC24059u);
                if (interfaceC26698kMo79392d != null) {
                    if (interfaceC26698kMo79392d instanceof AbstractC22464c) {
                        AbstractC22464c abstractC22464c = (AbstractC22464c) interfaceC26698kMo79392d;
                        AbstractC21688o abstractC21688o = this.f95012H;
                        if (abstractC21688o == null) {
                            this.f95012H = ((C21691r) abstractC22464c).f83289H;
                        } else if (!abstractC21688o.equals(((C21691r) abstractC22464c).f83289H)) {
                            throw new DateTimeException("ChronoZonedDateTime must use the effective parsed zone: " + this.f95012H);
                        }
                        interfaceC26698kMo79392d = ((C21691r) abstractC22464c).f83287F;
                    }
                    if (interfaceC26698kMo79392d instanceof AbstractC22462a) {
                        m70941x0(interfaceC26700m, (AbstractC22462a) interfaceC26698kMo79392d);
                        break;
                    }
                    if (interfaceC26698kMo79392d instanceof C21679f) {
                        m70940w0(interfaceC26700m, (C21679f) interfaceC26698kMo79392d);
                        break;
                    } else {
                        if (!(interfaceC26698kMo79392d instanceof AbstractC22463b)) {
                            throw new DateTimeException("Unknown type: ".concat(interfaceC26698kMo79392d.getClass().getName()));
                        }
                        C21678e c21678e = (C21678e) ((AbstractC22463b) interfaceC26698kMo79392d);
                        m70941x0(interfaceC26700m, c21678e.f83246F);
                        m70940w0(interfaceC26700m, c21678e.f83247G);
                        break;
                    }
                }
            } while (map.containsKey(interfaceC26700m));
            i13++;
        }
        if (i13 == 100) {
            throw new DateTimeException("Badly written field");
        }
        if (i13 > 0) {
            m70936s0();
            m70935r0(enumC24059u);
            m70938u0(enumC24059u);
        }
        EnumC26688a enumC26688a2 = EnumC26688a.HOUR_OF_DAY;
        Long l7 = (Long) map.get(enumC26688a2);
        EnumC26688a enumC26688a3 = EnumC26688a.MINUTE_OF_HOUR;
        Long l12 = (Long) map.get(enumC26688a3);
        EnumC26688a enumC26688a4 = EnumC26688a.SECOND_OF_MINUTE;
        Long l13 = (Long) map.get(enumC26688a4);
        EnumC26688a enumC26688a5 = EnumC26688a.NANO_OF_SECOND;
        Long l14 = (Long) map.get(enumC26688a5);
        if (l7 != null && ((l12 != null || (l13 == null && l14 == null)) && (l12 == null || l13 != null || l14 == null))) {
            if (enumC24059u != EnumC24059u.f95080y) {
                if (enumC24059u == EnumC24059u.f95079x && l7.longValue() == 24 && ((l12 == null || l12.longValue() == 0) && ((l13 == null || l13.longValue() == 0) && (l14 == null || l14.longValue() == 0)))) {
                    this.f95015K = new C21684k(1);
                    l7 = 0L;
                }
                int iM79420a = enumC26688a2.f106174x.m79420a(l7.longValue(), enumC26688a2);
                if (l12 != null) {
                    int iM79420a2 = enumC26688a3.f106174x.m79420a(l12.longValue(), enumC26688a3);
                    if (l13 != null) {
                        int iM79420a3 = enumC26688a4.f106174x.m79420a(l13.longValue(), enumC26688a4);
                        if (l14 != null) {
                            this.f95014J = C21679f.m61032t0(iM79420a, iM79420a2, iM79420a3, enumC26688a5.f106174x.m79420a(l14.longValue(), enumC26688a5));
                            enumC26688a = enumC26688a2;
                        } else {
                            C21679f c21679f3 = C21679f.f83248J;
                            enumC26688a = enumC26688a2;
                            enumC26688a.m79394f(iM79420a);
                            if ((iM79420a2 | iM79420a3) == 0) {
                                c21679f2 = C21679f.f83250L[iM79420a];
                            } else {
                                enumC26688a3.m79394f(iM79420a2);
                                enumC26688a4.m79394f(iM79420a3);
                                c21679f2 = new C21679f(iM79420a, iM79420a2, iM79420a3, 0);
                            }
                            this.f95014J = c21679f2;
                        }
                    } else {
                        enumC26688a = enumC26688a2;
                        if (l14 == null) {
                            this.f95014J = C21679f.m61031s0(iM79420a, iM79420a2);
                        }
                    }
                } else {
                    enumC26688a = enumC26688a2;
                    if (l13 == null && l14 == null) {
                        this.f95014J = C21679f.m61031s0(iM79420a, 0);
                    }
                }
                obj = enumC26688a;
            } else {
                obj = enumC26688a2;
                long jLongValue = l7.longValue();
                if (l12 == null) {
                    int iM16770b0 = AbstractC5583n.m16770b0(AbstractC5583n.m16742A(jLongValue, 24L));
                    this.f95014J = C21679f.m61031s0(AbstractC5583n.m16743B(24, jLongValue), 0);
                    this.f95015K = iM16770b0 == 0 ? C21684k.f83267x : new C21684k(iM16770b0);
                } else if (l13 != null) {
                    if (l14 == null) {
                        l14 = 0L;
                    }
                    long jM16763W = AbstractC5583n.m16763W(AbstractC5583n.m16763W(AbstractC5583n.m16763W(AbstractC5583n.m16765Y(jLongValue, 3600000000000L), AbstractC5583n.m16765Y(l12.longValue(), 60000000000L)), AbstractC5583n.m16765Y(l13.longValue(), 1000000000L)), l14.longValue());
                    int iM16742A = (int) AbstractC5583n.m16742A(jM16763W, 86400000000000L);
                    this.f95014J = C21679f.m61033u0(((jM16763W % 86400000000000L) + 86400000000000L) % 86400000000000L);
                    this.f95015K = iM16742A == 0 ? C21684k.f83267x : new C21684k(iM16742A);
                } else {
                    long jM16763W2 = AbstractC5583n.m16763W(AbstractC5583n.m16765Y(jLongValue, 3600L), AbstractC5583n.m16765Y(l12.longValue(), 60L));
                    int iM16742A2 = (int) AbstractC5583n.m16742A(jM16763W2, 86400L);
                    this.f95014J = C21679f.m61034v0(((jM16763W2 % 86400) + 86400) % 86400);
                    this.f95015K = iM16742A2 == 0 ? C21684k.f83267x : new C21684k(iM16742A2);
                }
            }
            map.remove(obj);
            map.remove(enumC26688a3);
            map.remove(enumC26688a4);
            map.remove(enumC26688a5);
        }
        if (map.size() > 0) {
            InterfaceC26698k interfaceC26698k = this.f95013I;
            if (interfaceC26698k != null && (c21679f = this.f95014J) != null) {
                m70934q0(C21678e.m61018t0((C21677d) interfaceC26698k, c21679f));
            } else if (interfaceC26698k != null) {
                m70934q0(interfaceC26698k);
            } else {
                InterfaceC26698k interfaceC26698k2 = this.f95014J;
                if (interfaceC26698k2 != null) {
                    m70934q0(interfaceC26698k2);
                }
            }
        }
        C21684k c21684k2 = this.f95015K;
        if (c21684k2 != null && c21684k2 != (c21684k = C21684k.f83267x) && (interfaceC26697j = this.f95013I) != null && this.f95014J != null) {
            InterfaceC26697j interfaceC26697jMo60994c = (C21677d) interfaceC26697j;
            c21684k2.getClass();
            int i14 = c21684k2.f83268w;
            if (i14 != 0) {
                interfaceC26697jMo60994c = interfaceC26697jMo60994c.mo60994c(i14, EnumC26689b.DAYS);
            }
            this.f95013I = (C21677d) interfaceC26697jMo60994c;
            this.f95015K = c21684k;
        }
        if (this.f95014J == null && (map.containsKey(EnumC26688a.INSTANT_SECONDS) || map.containsKey(EnumC26688a.SECOND_OF_DAY) || map.containsKey(enumC26688a4))) {
            if (map.containsKey(enumC26688a5)) {
                long jLongValue2 = ((Long) map.get(enumC26688a5)).longValue();
                map.put(EnumC26688a.MICRO_OF_SECOND, Long.valueOf(jLongValue2 / 1000));
                map.put(EnumC26688a.MILLI_OF_SECOND, Long.valueOf(jLongValue2 / 1000000));
            } else {
                map.put(enumC26688a5, 0L);
                map.put(EnumC26688a.MICRO_OF_SECOND, 0L);
                map.put(EnumC26688a.MILLI_OF_SECOND, 0L);
            }
        }
        if (this.f95013I == null || this.f95014J == null) {
            return;
        }
        Long l15 = (Long) map.get(EnumC26688a.OFFSET_SECONDS);
        if (l15 != null) {
            C21689p c21689pM61076r = C21689p.m61076r(l15.intValue());
            AbstractC22462a abstractC22462a = this.f95013I;
            C21679f c21679f4 = this.f95014J;
            C21677d c21677d = (C21677d) abstractC22462a;
            c21677d.getClass();
            C21691r c21691rM61082p0 = C21691r.m61082p0(C21678e.m61018t0(c21677d, c21679f4), c21689pM61076r, null);
            EnumC26688a enumC26688a6 = EnumC26688a.INSTANT_SECONDS;
            map.put(enumC26688a6, Long.valueOf(c21691rM61082p0.mo60987h(enumC26688a6)));
            return;
        }
        if (this.f95012H != null) {
            AbstractC22462a abstractC22462a2 = this.f95013I;
            C21679f c21679f5 = this.f95014J;
            C21677d c21677d2 = (C21677d) abstractC22462a2;
            c21677d2.getClass();
            C21691r c21691rM61082p1 = C21691r.m61082p0(C21678e.m61018t0(c21677d2, c21679f5), this.f95012H, null);
            EnumC26688a enumC26688a7 = EnumC26688a.INSTANT_SECONDS;
            map.put(enumC26688a7, Long.valueOf(c21691rM61082p1.mo60987h(enumC26688a7)));
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final void m70940w0(InterfaceC26700m interfaceC26700m, C21679f c21679f) {
        long jM61036C0 = c21679f.m61036C0();
        Long l7 = (Long) this.f95010F.put(EnumC26688a.NANO_OF_DAY, Long.valueOf(jM61036C0));
        if (l7 == null || l7.longValue() == jM61036C0) {
            return;
        }
        throw new DateTimeException("Conflict found: " + C21679f.m61033u0(l7.longValue()) + " differs from " + c21679f + " while resolving  " + interfaceC26700m);
    }

    /* JADX INFO: renamed from: x0 */
    public final void m70941x0(InterfaceC26700m interfaceC26700m, AbstractC22462a abstractC22462a) {
        AbstractC22465d abstractC22465d = this.f95011G;
        ((C21677d) abstractC22462a).getClass();
        if (!abstractC22465d.equals(C22466e.f88015w)) {
            throw new DateTimeException("ChronoLocalDate must use the effective parsed chronology: " + this.f95011G);
        }
        long epochDay = abstractC22462a.toEpochDay();
        Long l7 = (Long) this.f95010F.put(EnumC26688a.EPOCH_DAY, Long.valueOf(epochDay));
        if (l7 == null || l7.longValue() == epochDay) {
            return;
        }
        throw new DateTimeException("Conflict found: " + C21677d.m61004u0(l7.longValue()) + " differs from " + C21677d.m61004u0(epochDay) + " while resolving  " + interfaceC26700m);
    }
}
