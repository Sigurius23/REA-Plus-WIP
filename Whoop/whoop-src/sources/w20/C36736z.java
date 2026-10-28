package w20;

import com.whoop.android.R;
import g40.C15411q3;
import h02.C16587n0;
import m83.C25271y;
import p077d0.C11387o2;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.EnumC38853i;

/* JADX INFO: renamed from: w20.z */
/* JADX INFO: loaded from: classes6.dex */
public final class C36736z {

    /* JADX INFO: renamed from: a */
    public final String f157240a;

    /* JADX INFO: renamed from: b */
    public final EnumC38853i f157241b;

    /* JADX INFO: renamed from: c */
    public final boolean f157242c;

    /* JADX INFO: renamed from: d */
    public final int f157243d;

    /* JADX INFO: renamed from: e */
    public final C15411q3 f157244e;

    public C36736z(String cvc, EnumC38853i cardBrand) {
        AbstractC22676k.m65750j(cvc, "cvc");
        AbstractC22676k.m65750j(cardBrand, "cardBrand");
        this.f157240a = cvc;
        this.f157241b = cardBrand;
        this.f157242c = new C11387o2(10).m30620j(cardBrand, C25271y.f99162w, cvc, cardBrand.m124353b()).isValid();
        this.f157243d = cardBrand == EnumC38853i.AmericanExpress ? R.string.stripe_cvc_amex_hint : R.string.stripe_cvc_number_hint;
        this.f157244e = new C15411q3(cardBrand.f167263z, false, (C16587n0) null, 10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36736z)) {
            return false;
        }
        C36736z c36736z = (C36736z) obj;
        return AbstractC22676k.m65745e(this.f157240a, c36736z.f157240a) && this.f157241b == c36736z.f157241b;
    }

    public final int hashCode() {
        return this.f157241b.hashCode() + (this.f157240a.hashCode() * 31);
    }

    public final String toString() {
        return "CvcState(cvc=" + this.f157240a + ", cardBrand=" + this.f157241b + ")";
    }
}
