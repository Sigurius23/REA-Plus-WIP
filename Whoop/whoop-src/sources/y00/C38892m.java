package y00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.C25235a0;
import m83.C25272z;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p319m4.AbstractC25012a;
import p499t9.C33623c0;
import p499t9.C33647p;
import p555vl.AbstractC36095b;
import p695zx.C41185g;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: y00.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C38892m implements InterfaceC38822e8, Parcelable {
    public static final Parcelable.Creator<C38892m> CREATOR = new C38873k(1);

    /* JADX INFO: renamed from: E */
    public final int f167416E;

    /* JADX INFO: renamed from: F */
    public final int f167417F;

    /* JADX INFO: renamed from: G */
    public final String f167418G;

    /* JADX INFO: renamed from: H */
    public final String f167419H;

    /* JADX INFO: renamed from: I */
    public final C38793c f167420I;

    /* JADX INFO: renamed from: J */
    public final String f167421J;

    /* JADX INFO: renamed from: K */
    public final C38787b3 f167422K;

    /* JADX INFO: renamed from: L */
    public final Map f167423L;

    /* JADX INFO: renamed from: w */
    public final Set f167424w;

    /* JADX INFO: renamed from: x */
    public final EnumC38853i f167425x;

    /* JADX INFO: renamed from: y */
    public final Set f167426y;

    /* JADX INFO: renamed from: z */
    public final String f167427z;

    /* JADX WARN: Illegal instructions before constructor call */
    public C38892m(String number, int i13, int i14, String str, C38793c c38793c) {
        EnumC38853i enumC38853iM106235h;
        AbstractC22676k.m65750j(number, "number");
        if (AbstractC39414r.m125890i0(number)) {
            enumC38853iM106235h = EnumC38853i.Unknown;
        } else {
            C33623c0 c33623c0 = EnumC38853i.f167238M;
            C41185g c41185g = new C41185g(number);
            c33623c0.getClass();
            enumC38853iM106235h = C33623c0.m106235h(c41185g.f177696d);
        }
        EnumC38853i enumC38853i = enumC38853iM106235h;
        this(enumC38853i, C25235a0.f99113w, number, i13, i14, str, c38793c, null, 512);
    }

    @Override // y00.InterfaceC38822e8
    /* JADX INFO: renamed from: c0 */
    public final Map mo124325c0() {
        C33647p c33647p = EnumC38832f8.f167151x;
        C23465k c23465k = new C23465k("number", this.f167427z);
        C23465k c23465k2 = new C23465k("exp_month", Integer.valueOf(this.f167416E));
        C23465k c23465k3 = new C23465k("exp_year", Integer.valueOf(this.f167417F));
        C23465k c23465k4 = new C23465k("cvc", this.f167418G);
        C23465k c23465k5 = new C23465k("name", this.f167419H);
        C23465k c23465k6 = new C23465k("currency", this.f167421J);
        C38793c c38793c = this.f167420I;
        C25272z c25272z = C25272z.f99163w;
        Map mapM73995d0 = c25272z;
        for (C23465k c23465k7 : AbstractC37056f.m118959K(c23465k, c23465k2, c23465k3, c23465k4, c23465k5, c23465k6, new C23465k("address_line1", c38793c != null ? c38793c.f166962y : null), new C23465k("address_line2", c38793c != null ? c38793c.f166963z : null), new C23465k("address_city", c38793c != null ? c38793c.f166960w : null), new C23465k("address_state", c38793c != null ? c38793c.f166959F : null), new C23465k("address_zip", c38793c != null ? c38793c.f166958E : null), new C23465k("address_country", c38793c != null ? c38793c.f166961x : null), new C23465k("metadata", this.f167423L))) {
            String str = (String) c23465k7.f92937w;
            Object obj = c23465k7.f92938x;
            Map mapM114689q = obj != null ? AbstractC36095b.m114689q(obj, str) : null;
            if (mapM114689q == null) {
                mapM114689q = c25272z;
            }
            mapM73995d0 = AbstractC25247g0.m73995d0(mapM73995d0, mapM114689q);
        }
        return AbstractC36095b.m114689q(mapM73995d0, "card");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38892m)) {
            return false;
        }
        C38892m c38892m = (C38892m) obj;
        return this.f167425x == c38892m.f167425x && AbstractC22676k.m65745e(this.f167426y, c38892m.f167426y) && AbstractC22676k.m65745e(this.f167427z, c38892m.f167427z) && this.f167416E == c38892m.f167416E && this.f167417F == c38892m.f167417F && AbstractC22676k.m65745e(this.f167418G, c38892m.f167418G) && AbstractC22676k.m65745e(this.f167419H, c38892m.f167419H) && AbstractC22676k.m65745e(this.f167420I, c38892m.f167420I) && AbstractC22676k.m65745e(this.f167421J, c38892m.f167421J) && AbstractC22676k.m65745e(this.f167422K, c38892m.f167422K) && AbstractC22676k.m65745e(this.f167423L, c38892m.f167423L);
    }

    public final int hashCode() {
        int iM30450d = (((AbstractC11266d.m30450d(AbstractC25012a.m73368a(this.f167426y, this.f167425x.hashCode() * 31, 31), 31, this.f167427z) + this.f167416E) * 31) + this.f167417F) * 31;
        String str = this.f167418G;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f167419H;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        C38793c c38793c = this.f167420I;
        int iHashCode3 = (iHashCode2 + (c38793c == null ? 0 : c38793c.hashCode())) * 31;
        String str3 = this.f167421J;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        C38787b3 c38787b3 = this.f167422K;
        int iHashCode5 = (iHashCode4 + (c38787b3 == null ? 0 : c38787b3.f166943w.hashCode())) * 31;
        Map map = this.f167423L;
        return iHashCode5 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("CardParams(brand=");
        sb4.append(this.f167425x);
        sb4.append(", loggingTokens=");
        sb4.append(this.f167426y);
        sb4.append(", number=");
        AbstractC11266d.m30470x(this.f167416E, this.f167427z, ", expMonth=", ", expYear=", sb4);
        AbstractC11895b.m31979B(this.f167417F, ", cvc=", this.f167418G, ", name=", sb4);
        sb4.append(this.f167419H);
        sb4.append(", address=");
        sb4.append(this.f167420I);
        sb4.append(", currency=");
        sb4.append(this.f167421J);
        sb4.append(", networks=");
        sb4.append(this.f167422K);
        sb4.append(", metadata=");
        return AbstractC13673n.m38565l(sb4, this.f167423L, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167425x.name());
        Set set = this.f167426y;
        dest.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            dest.writeString((String) it.next());
        }
        dest.writeString(this.f167427z);
        dest.writeInt(this.f167416E);
        dest.writeInt(this.f167417F);
        dest.writeString(this.f167418G);
        dest.writeString(this.f167419H);
        C38793c c38793c = this.f167420I;
        if (c38793c == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38793c.writeToParcel(dest, i13);
        }
        dest.writeString(this.f167421J);
        C38787b3 c38787b3 = this.f167422K;
        if (c38787b3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38787b3.writeToParcel(dest, i13);
        }
        Map map = this.f167423L;
        if (map == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            dest.writeString((String) entry.getKey());
            dest.writeString((String) entry.getValue());
        }
    }

    public /* synthetic */ C38892m(EnumC38853i enumC38853i, Set set, String str, int i13, int i14, String str2, C38793c c38793c, C38787b3 c38787b3, int i15) {
        this(enumC38853i, set, str, i13, i14, str2, null, c38793c, null, (i15 & 512) != 0 ? null : c38787b3, null);
    }

    public C38892m(EnumC38853i brand, Set set, String number, int i13, int i14, String str, String str2, C38793c c38793c, String str3, C38787b3 c38787b3, Map map) {
        AbstractC22676k.m65750j(brand, "brand");
        AbstractC22676k.m65750j(number, "number");
        C33647p c33647p = EnumC38832f8.f167151x;
        C33647p c33647p2 = EnumC38832f8.f167151x;
        this.f167424w = set;
        this.f167425x = brand;
        this.f167426y = set;
        this.f167427z = number;
        this.f167416E = i13;
        this.f167417F = i14;
        this.f167418G = str;
        this.f167419H = str2;
        this.f167420I = c38793c;
        this.f167421J = str3;
        this.f167422K = c38787b3;
        this.f167423L = map;
    }
}
