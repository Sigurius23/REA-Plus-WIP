package d30;

import b30.C2550j3;
import com.whoop.android.R;
import h20.C16687l;
import java.util.List;
import l83.C23470p;
import p031b9.AbstractC2875y;
import p078d1.C11456i;
import p479s4.AbstractC32128i;
import p555vl.AbstractC36095b;
import p696zy.C41210b;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: d30.x */
/* JADX INFO: loaded from: classes6.dex */
public final class C11570x {

    /* JADX INFO: renamed from: a */
    public final List f37343a;

    /* JADX INFO: renamed from: b */
    public final C16687l f37344b;

    /* JADX INFO: renamed from: c */
    public final boolean f37345c;

    /* JADX INFO: renamed from: d */
    public final boolean f37346d;

    /* JADX INFO: renamed from: e */
    public final C23470p f37347e;

    public C11570x(List paymentMethods, C16687l c16687l, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(paymentMethods, "paymentMethods");
        this.f37343a = paymentMethods;
        this.f37344b = c16687l;
        this.f37345c = z4;
        this.f37346d = z13;
        this.f37347e = AbstractC30060g.m92088H(new C11456i(this, 4));
    }

    /* JADX INFO: renamed from: a */
    public final C41210b m30999a() {
        boolean z4 = this.f37345c;
        C23470p c23470p = this.f37347e;
        if (z4) {
            return AbstractC32128i.m100054h(((Boolean) c23470p.getValue()).booleanValue() ? R.string.stripe_paymentsheet_manage_cards : R.string.stripe_paymentsheet_manage_payment_methods);
        }
        return AbstractC32128i.m100054h(((Boolean) c23470p.getValue()).booleanValue() ? R.string.stripe_paymentsheet_select_card : R.string.stripe_paymentsheet_select_payment_method);
    }

    /* JADX INFO: renamed from: b */
    public final C2550j3 m31000b(C11535h c11535h) {
        return new C2550j3(!c11535h.f37184a, this.f37346d, this.f37345c, new C11456i(c11535h, 3));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11570x)) {
            return false;
        }
        C11570x c11570x = (C11570x) obj;
        return AbstractC22676k.m65745e(this.f37343a, c11570x.f37343a) && AbstractC22676k.m65745e(this.f37344b, c11570x.f37344b) && this.f37345c == c11570x.f37345c && this.f37346d == c11570x.f37346d;
    }

    public final int hashCode() {
        int iHashCode = this.f37343a.hashCode() * 31;
        C16687l c16687l = this.f37344b;
        return Boolean.hashCode(this.f37346d) + AbstractC2875y.m8289b((iHashCode + (c16687l == null ? 0 : c16687l.hashCode())) * 31, 31, this.f37345c);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("State(paymentMethods=");
        sb4.append(this.f37343a);
        sb4.append(", currentSelection=");
        sb4.append(this.f37344b);
        sb4.append(", isEditing=");
        return AbstractC36095b.m114682j(sb4, this.f37345c, ", canEdit=", this.f37346d, ")");
    }
}
