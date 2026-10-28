package g40;

import com.whoop.android.R;
import java.util.List;
import l83.C23465k;
import p550vd.AbstractC35903f;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: g40.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C15402p extends AbstractC35903f {

    /* JADX INFO: renamed from: a */
    public final int f57860a;

    /* JADX INFO: renamed from: b */
    public final List f57861b;

    public C15402p() {
        List listM118959K = AbstractC37056f.m118959K(new C23465k("AB", "Alberta"), new C23465k("BC", "British Columbia"), new C23465k("MB", "Manitoba"), new C23465k("NB", "New Brunswick"), new C23465k("NL", "Newfoundland and Labrador"), new C23465k("NT", "Northwest Territories"), new C23465k("NS", "Nova Scotia"), new C23465k("NU", "Nunavut"), new C23465k("ON", "Ontario"), new C23465k("PE", "Prince Edward Island"), new C23465k("QC", "Quebec"), new C23465k("SK", "Saskatchewan"), new C23465k("YT", "Yukon"));
        this.f57860a = R.string.stripe_address_label_province;
        this.f57861b = listM118959K;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15402p)) {
            return false;
        }
        C15402p c15402p = (C15402p) obj;
        return this.f57860a == c15402p.f57860a && AbstractC22676k.m65745e(this.f57861b, c15402p.f57861b);
    }

    public final int hashCode() {
        return this.f57861b.hashCode() + (Integer.hashCode(this.f57860a) * 31);
    }

    @Override // p550vd.AbstractC35903f
    /* JADX INFO: renamed from: r */
    public final List mo43597r() {
        return this.f57861b;
    }

    @Override // p550vd.AbstractC35903f
    /* JADX INFO: renamed from: t */
    public final int mo43598t() {
        return this.f57860a;
    }

    public final String toString() {
        return "Canada(label=" + this.f57860a + ", administrativeAreas=" + this.f57861b + ")";
    }
}
