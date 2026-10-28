package g40;

import com.whoop.android.R;
import java.util.List;
import l83.C23465k;
import p550vd.AbstractC35903f;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: g40.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C15407q extends AbstractC35903f {

    /* JADX INFO: renamed from: a */
    public final int f57872a;

    /* JADX INFO: renamed from: b */
    public final List f57873b;

    public C15407q() {
        List listM118959K = AbstractC37056f.m118959K(new C23465k("AL", "Alabama"), new C23465k("AK", "Alaska"), new C23465k("AS", "American Samoa"), new C23465k("AZ", "Arizona"), new C23465k("AR", "Arkansas"), new C23465k("AA", "Armed Forces (AA)"), new C23465k("AE", "Armed Forces (AE)"), new C23465k("AP", "Armed Forces (AP)"), new C23465k("CA", "California"), new C23465k("CO", "Colorado"), new C23465k("CT", "Connecticut"), new C23465k("DE", "Delaware"), new C23465k("DC", "District of Columbia"), new C23465k("FL", "Florida"), new C23465k("GA", "Georgia"), new C23465k("GU", "Guam"), new C23465k("HI", "Hawaii"), new C23465k("ID", "Idaho"), new C23465k("IL", "Illinois"), new C23465k("IN", "Indiana"), new C23465k("IA", "Iowa"), new C23465k("KS", "Kansas"), new C23465k("KY", "Kentucky"), new C23465k("LA", "Louisiana"), new C23465k("ME", "Maine"), new C23465k("MH", "Marshal Islands"), new C23465k("MD", "Maryland"), new C23465k("MA", "Massachusetts"), new C23465k("MI", "Michigan"), new C23465k("FM", "Micronesia"), new C23465k("MN", "Minnesota"), new C23465k("MS", "Mississippi"), new C23465k("MO", "Missouri"), new C23465k("MT", "Montana"), new C23465k("NE", "Nebraska"), new C23465k("NV", "Nevada"), new C23465k("NH", "New Hampshire"), new C23465k("NJ", "New Jersey"), new C23465k("NM", "New Mexico"), new C23465k("NY", "New York"), new C23465k("NC", "North Carolina"), new C23465k("ND", "North Dakota"), new C23465k("MP", "Northern Mariana Islands"), new C23465k("OH", "Ohio"), new C23465k("OK", "Oklahoma"), new C23465k("OR", "Oregon"), new C23465k("PW", "Palau"), new C23465k("PA", "Pennsylvania"), new C23465k("PR", "Puerto Rico"), new C23465k("RI", "Rhode Island"), new C23465k("SC", "South Carolina"), new C23465k("SD", "South Dakota"), new C23465k("TN", "Tennessee"), new C23465k("TX", "Texas"), new C23465k("UT", "Utah"), new C23465k("VT", "Vermont"), new C23465k("VI", "Virgin Islands"), new C23465k("VA", "Virginia"), new C23465k("WA", "Washington"), new C23465k("WV", "West Virginia"), new C23465k("WI", "Wisconsin"), new C23465k("WY", "Wyoming"));
        this.f57872a = R.string.stripe_address_label_state;
        this.f57873b = listM118959K;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15407q)) {
            return false;
        }
        C15407q c15407q = (C15407q) obj;
        return this.f57872a == c15407q.f57872a && AbstractC22676k.m65745e(this.f57873b, c15407q.f57873b);
    }

    public final int hashCode() {
        return this.f57873b.hashCode() + (Integer.hashCode(this.f57872a) * 31);
    }

    @Override // p550vd.AbstractC35903f
    /* JADX INFO: renamed from: r */
    public final List mo43597r() {
        return this.f57873b;
    }

    @Override // p550vd.AbstractC35903f
    /* JADX INFO: renamed from: t */
    public final int mo43598t() {
        return this.f57872a;
    }

    public final String toString() {
        return "US(label=" + this.f57872a + ", administrativeAreas=" + this.f57873b + ")";
    }
}
