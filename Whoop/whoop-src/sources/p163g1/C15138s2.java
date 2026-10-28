package p163g1;

import c93.InterfaceC4351m;
import java.util.Iterator;
import m83.AbstractC25260n;
import p043c4.InterfaceC3964i0;
import p636y3.C39175g;
import p636y3.C39179k;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.internal.AbstractC22676k;
import xb3.InterfaceC38174i;

/* JADX INFO: renamed from: g1.s2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15138s2 implements InterfaceC3964i0 {

    /* JADX INFO: renamed from: w */
    public final long f56750w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC39171c f56751x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC4351m f56752y;

    public C15138s2(long j7, InterfaceC39171c interfaceC39171c, InterfaceC4351m interfaceC4351m) {
        this.f56750w = j7;
        this.f56751x = interfaceC39171c;
        this.f56752y = interfaceC4351m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15138s2)) {
            return false;
        }
        C15138s2 c15138s2 = (C15138s2) obj;
        return this.f56750w == c15138s2.f56750w && AbstractC22676k.m65745e(this.f56751x, c15138s2.f56751x) && AbstractC22676k.m65745e(this.f56752y, c15138s2.f56752y);
    }

    public final int hashCode() {
        return this.f56752y.hashCode() + ((this.f56751x.hashCode() + (Long.hashCode(this.f56750w) * 31)) * 31);
    }

    @Override // p043c4.InterfaceC3964i0
    /* JADX INFO: renamed from: i */
    public final long mo11994i(C39179k c39179k, long j7, EnumC39181m enumC39181m, long j13) {
        InterfaceC38174i interfaceC38174iM74050X;
        Object obj;
        Object next;
        float f13 = AbstractC15099o3.f56553b;
        InterfaceC39171c interfaceC39171c = this.f56751x;
        int iMo724F = interfaceC39171c.mo724F(f13);
        long j14 = this.f56750w;
        int iMo724F2 = interfaceC39171c.mo724F(Float.intBitsToFloat((int) (j14 >> 32)));
        EnumC39181m enumC39181m2 = EnumC39181m.f168423w;
        int i13 = iMo724F2 * (enumC39181m == enumC39181m2 ? 1 : -1);
        int iMo724F3 = interfaceC39171c.mo724F(Float.intBitsToFloat((int) (j14 & 4294967295L)));
        int i14 = c39179k.f168418a;
        int i15 = c39179k.f168420c;
        int i16 = i14 + i13;
        int i17 = (int) (j13 >> 32);
        int iIntValue = (i15 - i17) + i13;
        int i18 = (int) (j7 >> 32);
        int i19 = i18 - i17;
        if (enumC39181m == enumC39181m2) {
            Integer numValueOf = Integer.valueOf(i16);
            Integer numValueOf2 = Integer.valueOf(iIntValue);
            if (c39179k.f168418a < 0) {
                i19 = 0;
            }
            interfaceC38174iM74050X = AbstractC25260n.m74050X(new Integer[]{numValueOf, numValueOf2, Integer.valueOf(i19)});
        } else {
            Integer numValueOf3 = Integer.valueOf(iIntValue);
            Integer numValueOf4 = Integer.valueOf(i16);
            if (i15 <= i18) {
                i19 = 0;
            }
            interfaceC38174iM74050X = AbstractC25260n.m74050X(new Integer[]{numValueOf3, numValueOf4, Integer.valueOf(i19)});
        }
        Iterator it = interfaceC38174iM74050X.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int iIntValue2 = ((Number) next).intValue();
            if (iIntValue2 >= 0 && iIntValue2 + i17 <= i18) {
                break;
            }
        }
        Integer num = (Integer) next;
        if (num != null) {
            iIntValue = num.intValue();
        }
        int iMax = Math.max(c39179k.f168421d + iMo724F3, iMo724F);
        int i24 = c39179k.f168419b;
        int i25 = (int) (j13 & 4294967295L);
        int iIntValue3 = (i24 - i25) + iMo724F3;
        int i26 = (i24 - (i25 / 2)) + iMo724F3;
        int i27 = (int) (j7 & 4294967295L);
        for (Object obj2 : AbstractC25260n.m74050X(new Integer[]{Integer.valueOf(iMax), Integer.valueOf(iIntValue3), Integer.valueOf(i26), Integer.valueOf((i27 - i25) - iMo724F)})) {
            int iIntValue4 = ((Number) obj2).intValue();
            if (iIntValue4 >= iMo724F && iIntValue4 + i25 <= i27 - iMo724F) {
                obj = obj2;
                break;
            }
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            iIntValue3 = num2.intValue();
        }
        this.f56752y.invoke(c39179k, new C39179k(iIntValue, iIntValue3, i17 + iIntValue, i25 + iIntValue3));
        return (((long) iIntValue) << 32) | (((long) iIntValue3) & 4294967295L);
    }

    public final String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) C39175g.m124784a(this.f56750w)) + ", density=" + this.f56751x + ", onPositionCalculated=" + this.f56752y + ')';
    }
}
