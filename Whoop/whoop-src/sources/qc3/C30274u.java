package qc3;

import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.LocalTime;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;
import uc3.InterfaceC34764b;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: qc3.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C30274u implements InterfaceC30267q0, InterfaceC34764b {

    /* JADX INFO: renamed from: a */
    public Integer f123822a;

    /* JADX INFO: renamed from: b */
    public Integer f123823b;

    /* JADX INFO: renamed from: c */
    public EnumC30237f f123824c;

    /* JADX INFO: renamed from: d */
    public Integer f123825d;

    /* JADX INFO: renamed from: e */
    public Integer f123826e;

    /* JADX INFO: renamed from: f */
    public Integer f123827f;

    public /* synthetic */ C30274u() {
        this(null, null, null, null, null, null);
    }

    @Override // uc3.InterfaceC34764b
    /* JADX INFO: renamed from: a */
    public final Object mo92535a() {
        return new C30274u(this.f123822a, this.f123823b, this.f123824c, this.f123825d, this.f123826e, this.f123827f);
    }

    @Override // qc3.InterfaceC30267q0
    /* JADX INFO: renamed from: c */
    public final Integer mo92522c() {
        return this.f123827f;
    }

    @Override // qc3.InterfaceC30267q0
    /* JADX INFO: renamed from: d */
    public final Integer mo92523d() {
        return this.f123823b;
    }

    /* JADX INFO: renamed from: e */
    public final LocalTime m92537e() {
        int iIntValue;
        int iIntValue2;
        Integer num = this.f123822a;
        if (num != null) {
            iIntValue = num.intValue();
            Integer num2 = this.f123823b;
            if (num2 != null && ((iIntValue + 11) % 12) + 1 != (iIntValue2 = num2.intValue())) {
                throw new IllegalArgumentException(AbstractC2875y.m8294g(iIntValue, iIntValue2, "Inconsistent hour and hour-of-am-pm: hour is ", ", but hour-of-am-pm is ").toString());
            }
            EnumC30237f enumC30237f = this.f123824c;
            if (enumC30237f != null) {
                if ((enumC30237f == EnumC30237f.f123778w) != (iIntValue >= 12)) {
                    throw new IllegalArgumentException(("Inconsistent hour and the AM/PM marker: hour is " + iIntValue + ", but the AM/PM marker is " + enumC30237f).toString());
                }
            }
        } else {
            Integer num3 = this.f123823b;
            Integer numValueOf = null;
            if (num3 != null) {
                int iIntValue3 = num3.intValue();
                EnumC30237f enumC30237f2 = this.f123824c;
                if (enumC30237f2 != null) {
                    if (iIntValue3 == 12) {
                        iIntValue3 = 0;
                    }
                    numValueOf = Integer.valueOf(iIntValue3 + (enumC30237f2 != EnumC30237f.f123778w ? 0 : 12));
                }
            }
            if (numValueOf == null) {
                throw new DateTimeFormatException("Incomplete time: missing hour");
            }
            iIntValue = numValueOf.intValue();
        }
        Integer num4 = this.f123825d;
        AbstractC30257l1.m92518a(num4, "minute");
        int iIntValue4 = num4.intValue();
        Integer num5 = this.f123826e;
        int iIntValue5 = num5 != null ? num5.intValue() : 0;
        Integer num6 = this.f123827f;
        return new LocalTime(iIntValue, iIntValue4, iIntValue5, num6 != null ? num6.intValue() : 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C30274u)) {
            return false;
        }
        C30274u c30274u = (C30274u) obj;
        return AbstractC22676k.m65745e(this.f123822a, c30274u.f123822a) && AbstractC22676k.m65745e(this.f123823b, c30274u.f123823b) && this.f123824c == c30274u.f123824c && AbstractC22676k.m65745e(this.f123825d, c30274u.f123825d) && AbstractC22676k.m65745e(this.f123826e, c30274u.f123826e) && AbstractC22676k.m65745e(this.f123827f, c30274u.f123827f);
    }

    @Override // qc3.InterfaceC30267q0
    /* JADX INFO: renamed from: g */
    public final Integer mo92524g() {
        return this.f123826e;
    }

    @Override // qc3.InterfaceC30267q0
    /* JADX INFO: renamed from: h */
    public final void mo92525h(Integer num) {
        this.f123826e = num;
    }

    public final int hashCode() {
        Integer num = this.f123822a;
        int iIntValue = (num != null ? num.intValue() : 0) * 31;
        Integer num2 = this.f123823b;
        int iIntValue2 = ((num2 != null ? num2.intValue() : 0) * 31) + iIntValue;
        EnumC30237f enumC30237f = this.f123824c;
        int iHashCode = ((enumC30237f != null ? enumC30237f.hashCode() : 0) * 31) + iIntValue2;
        Integer num3 = this.f123825d;
        int iIntValue3 = ((num3 != null ? num3.intValue() : 0) * 31) + iHashCode;
        Integer num4 = this.f123826e;
        int iIntValue4 = ((num4 != null ? num4.intValue() : 0) * 31) + iIntValue3;
        Integer num5 = this.f123827f;
        return iIntValue4 + (num5 != null ? num5.intValue() : 0);
    }

    @Override // qc3.InterfaceC30267q0
    /* JADX INFO: renamed from: j */
    public final EnumC30237f mo92526j() {
        return this.f123824c;
    }

    @Override // qc3.InterfaceC30267q0
    /* JADX INFO: renamed from: k */
    public final void mo92527k(Integer num) {
        this.f123823b = num;
    }

    @Override // qc3.InterfaceC30267q0
    /* JADX INFO: renamed from: l */
    public final void mo92528l(Integer num) {
        this.f123827f = num;
    }

    @Override // qc3.InterfaceC30267q0
    /* JADX INFO: renamed from: n */
    public final Integer mo92529n() {
        return this.f123825d;
    }

    @Override // qc3.InterfaceC30267q0
    /* JADX INFO: renamed from: o */
    public final void mo92530o(Integer num) {
        this.f123825d = num;
    }

    @Override // qc3.InterfaceC30267q0
    /* JADX INFO: renamed from: t */
    public final void mo92532t(EnumC30237f enumC30237f) {
        this.f123824c = enumC30237f;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    public final String toString() {
        String strM125895n0;
        StringBuilder sb4 = new StringBuilder();
        Object obj = this.f123822a;
        if (obj == null) {
            obj = "??";
        }
        sb4.append(obj);
        sb4.append(':');
        Object obj2 = this.f123825d;
        if (obj2 == null) {
            obj2 = "??";
        }
        sb4.append(obj2);
        sb4.append(':');
        Integer num = this.f123826e;
        sb4.append(num != null ? num : "??");
        sb4.append('.');
        Integer num2 = this.f123827f;
        if (num2 != null) {
            String strValueOf = String.valueOf(num2.intValue());
            strM125895n0 = AbstractC39414r.m125895n0(9 - strValueOf.length(), strValueOf);
            if (strM125895n0 == null) {
                strM125895n0 = "???";
            }
        } else {
            strM125895n0 = "???";
        }
        sb4.append(strM125895n0);
        return sb4.toString();
    }

    @Override // qc3.InterfaceC30267q0
    /* JADX INFO: renamed from: u */
    public final void mo92533u(Integer num) {
        this.f123822a = num;
    }

    @Override // qc3.InterfaceC30267q0
    /* JADX INFO: renamed from: v */
    public final Integer mo92534v() {
        return this.f123822a;
    }

    public C30274u(Integer num, Integer num2, EnumC30237f enumC30237f, Integer num3, Integer num4, Integer num5) {
        this.f123822a = num;
        this.f123823b = num2;
        this.f123824c = enumC30237f;
        this.f123825d = num3;
        this.f123826e = num4;
        this.f123827f = num5;
    }
}
