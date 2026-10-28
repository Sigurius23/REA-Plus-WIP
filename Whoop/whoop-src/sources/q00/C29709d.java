package q00;

import com.whoop.android.R;
import f20.EnumC14023b;
import m83.C25271y;
import p479s4.AbstractC32128i;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: q00.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C29709d extends AbstractC29713f {

    /* JADX INFO: renamed from: c */
    public final EnumC14023b f121484c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29709d(EnumC14023b financialConnectionsAvailability) {
        super("Bank", AbstractC32128i.m100064s(R.string.stripe_payment_method_bank, new Object[0], C25271y.f99162w));
        AbstractC22676k.m65750j(financialConnectionsAvailability, "financialConnectionsAvailability");
        this.f121484c = financialConnectionsAvailability;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29709d) && this.f121484c == ((C29709d) obj).f121484c;
    }

    public final int hashCode() {
        return this.f121484c.hashCode();
    }

    public final String toString() {
        return "Bank(financialConnectionsAvailability=" + this.f121484c + ")";
    }
}
