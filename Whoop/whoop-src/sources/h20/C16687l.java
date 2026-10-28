package h20;

import com.whoop.android.R;
import ih0.AbstractC18489d0;
import java.util.Set;
import m83.AbstractC25260n;
import m83.C25271y;
import p031b9.AbstractC2875y;
import p479s4.AbstractC32128i;
import p499t9.C33623c0;
import p547v8.AbstractC35785b;
import p696zy.C41212d;
import p696zy.InterfaceC41211c;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.C38915o4;
import y00.C38931q2;
import y00.C38940r2;
import y00.C38995x3;
import y00.C39013z3;
import y00.EnumC38853i;
import y00.InterfaceC38949s2;

/* JADX INFO: renamed from: h20.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C16687l {

    /* JADX INFO: renamed from: a */
    public final InterfaceC41211c f64177a;

    /* JADX INFO: renamed from: b */
    public final C38915o4 f64178b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC16728r4 f64179c;

    /* JADX INFO: renamed from: d */
    public final boolean f64180d;

    /* JADX INFO: renamed from: e */
    public final boolean f64181e;

    public C16687l(InterfaceC41211c interfaceC41211c, C38915o4 c38915o4, InterfaceC16728r4 interfaceC16728r4, boolean z4, boolean z13) {
        this.f64177a = interfaceC41211c;
        this.f64178b = c38915o4;
        this.f64179c = interfaceC16728r4;
        this.f64180d = z4;
        this.f64181e = z13;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX INFO: renamed from: a */
    public final String m47243a() {
        EnumC38853i enumC38853i;
        EnumC38853i enumC38853iM106236i;
        InterfaceC16728r4 interfaceC16728r4 = this.f64179c;
        if (interfaceC16728r4 instanceof C16698m4) {
            C39013z3 c39013z3 = ((C16698m4) interfaceC16728r4).f64222a;
            String str = c39013z3.f167917L;
            if (str != null) {
                EnumC38853i.f167238M.getClass();
                enumC38853iM106236i = C33623c0.m106236i(str);
                if (enumC38853iM106236i == null) {
                    enumC38853iM106236i = c39013z3.f167918w;
                }
            } else {
                enumC38853iM106236i = c39013z3.f167918w;
            }
            return enumC38853iM106236i.f167261x;
        }
        if (interfaceC16728r4 instanceof C16704n4) {
            InterfaceC38949s2 interfaceC38949s2 = ((C16704n4) interfaceC16728r4).f64231a;
            C38940r2 c38940r2 = interfaceC38949s2 instanceof C38940r2 ? (C38940r2) interfaceC38949s2 : null;
            if (c38940r2 != null && (enumC38853i = c38940r2.f167625E) != null) {
                return enumC38853i.f167261x;
            }
        } else if (!(interfaceC16728r4 instanceof C16716p4) && !(interfaceC16728r4 instanceof C16710o4) && !(interfaceC16728r4 instanceof C16722q4)) {
            throw new NoWhenBranchMatchedException();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m47244b() {
        Set set;
        InterfaceC16728r4 interfaceC16728r4 = this.f64179c;
        if (interfaceC16728r4 instanceof C16698m4) {
            C38995x3 c38995x3 = ((C16698m4) interfaceC16728r4).f64222a.f167916K;
            return this.f64180d && (c38995x3 != null && (set = c38995x3.f167842w) != null && set.size() > 1);
        }
        if ((interfaceC16728r4 instanceof C16710o4) || (interfaceC16728r4 instanceof C16716p4) || (interfaceC16728r4 instanceof C16704n4) || AbstractC22676k.m65745e(interfaceC16728r4, C16722q4.f64264a)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC41211c m47245c() {
        InterfaceC16728r4 interfaceC16728r4 = this.f64179c;
        boolean z4 = interfaceC16728r4 instanceof C16698m4;
        C25271y c25271y = C25271y.f99162w;
        if (z4) {
            return AbstractC32128i.m100064s(R.string.stripe_card_ending_in, new Object[]{m47243a(), ((C16698m4) interfaceC16728r4).f64222a.f167913H}, c25271y);
        }
        if (interfaceC16728r4 instanceof C16710o4) {
            return AbstractC32128i.m100064s(R.string.stripe_bank_account_ending_in, new Object[]{((C16710o4) interfaceC16728r4).f64241a.f167066E}, c25271y);
        }
        if (interfaceC16728r4 instanceof C16716p4) {
            return AbstractC32128i.m100064s(R.string.stripe_bank_account_ending_in, new Object[]{((C16716p4) interfaceC16728r4).f64254a.f167395E}, c25271y);
        }
        if (!(interfaceC16728r4 instanceof C16704n4)) {
            if (interfaceC16728r4 instanceof C16722q4) {
                return new C41212d("", AbstractC25260n.m74049W0(new Object[0]));
            }
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC38949s2 interfaceC38949s2 = ((C16704n4) interfaceC16728r4).f64231a;
        if (interfaceC38949s2 instanceof C38931q2) {
            return AbstractC32128i.m100064s(R.string.stripe_bank_account_ending_in, new Object[]{((C38931q2) interfaceC38949s2).f167600x}, c25271y);
        }
        if (interfaceC38949s2 instanceof C38940r2) {
            return AbstractC32128i.m100064s(R.string.stripe_card_ending_in, new Object[]{m47243a(), ((C38940r2) interfaceC38949s2).f167630z}, c25271y);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m47246d(boolean z4) {
        InterfaceC16728r4 interfaceC16728r4 = this.f64179c;
        if (interfaceC16728r4 instanceof C16698m4) {
            if (z4) {
                return true;
            }
            C39013z3 c39013z3 = ((C16698m4) interfaceC16728r4).f64222a;
            Integer num = c39013z3.f167921z;
            Integer num2 = c39013z3.f167910E;
            if ((num == null || num2 == null || AbstractC35785b.m113386I(num.intValue(), num2.intValue())) && m47244b()) {
                return true;
            }
        } else if (!(interfaceC16728r4 instanceof C16710o4) && !(interfaceC16728r4 instanceof C16716p4) && !(interfaceC16728r4 instanceof C16704n4) && !interfaceC16728r4.equals(C16722q4.f64264a)) {
            throw new NoWhenBranchMatchedException();
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16687l)) {
            return false;
        }
        C16687l c16687l = (C16687l) obj;
        return AbstractC22676k.m65745e(this.f64177a, c16687l.f64177a) && AbstractC22676k.m65745e(this.f64178b, c16687l.f64178b) && AbstractC22676k.m65745e(this.f64179c, c16687l.f64179c) && this.f64180d == c16687l.f64180d && this.f64181e == c16687l.f64181e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f64181e) + AbstractC2875y.m8289b((this.f64179c.hashCode() + ((this.f64178b.hashCode() + (this.f64177a.hashCode() * 31)) * 31)) * 31, 31, this.f64180d);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("DisplayableSavedPaymentMethod(displayName=");
        sb4.append(this.f64177a);
        sb4.append(", paymentMethod=");
        sb4.append(this.f64178b);
        sb4.append(", savedPaymentMethod=");
        sb4.append(this.f64179c);
        sb4.append(", isCbcEligible=");
        sb4.append(this.f64180d);
        sb4.append(", shouldShowDefaultBadge=");
        return AbstractC18489d0.m53372m(sb4, this.f64181e, ")");
    }
}
