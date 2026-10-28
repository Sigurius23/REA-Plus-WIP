package h20;

import android.os.Parcel;
import android.os.Parcelable;
import h02.C16587n0;
import java.util.Iterator;
import java.util.Set;
import l83.C23470p;
import p031b9.AbstractC2875y;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import sz.C33122b0;
import sz.EnumC33120a0;

/* JADX INFO: renamed from: h20.l1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16689l1 implements Parcelable {
    public static final Parcelable.Creator<C16689l1> CREATOR = new C16699n(17);

    /* JADX INFO: renamed from: E */
    public final boolean f64186E;

    /* JADX INFO: renamed from: F */
    public final Set f64187F;

    /* JADX INFO: renamed from: G */
    public final C23470p f64188G;

    /* JADX INFO: renamed from: w */
    public final EnumC16683k1 f64189w;

    /* JADX INFO: renamed from: x */
    public final EnumC16683k1 f64190x;

    /* JADX INFO: renamed from: y */
    public final EnumC16683k1 f64191y;

    /* JADX INFO: renamed from: z */
    public final EnumC16677j1 f64192z;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C16689l1(EnumC16677j1 enumC16677j1, Set set) {
        EnumC16683k1 enumC16683k1 = EnumC16683k1.f64150x;
        this(enumC16683k1, enumC16683k1, enumC16683k1, enumC16677j1, false, set);
    }

    /* JADX INFO: renamed from: b */
    public final Set m47249b() {
        return (Set) this.f64188G.getValue();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16689l1)) {
            return false;
        }
        C16689l1 c16689l1 = (C16689l1) obj;
        return this.f64189w == c16689l1.f64189w && this.f64190x == c16689l1.f64190x && this.f64191y == c16689l1.f64191y && this.f64192z == c16689l1.f64192z && this.f64186E == c16689l1.f64186E && AbstractC22676k.m65745e(this.f64187F, c16689l1.f64187F);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m47250f() {
        return this.f64191y == EnumC16683k1.f64151y;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m47251h() {
        return this.f64189w == EnumC16683k1.f64151y;
    }

    public final int hashCode() {
        return this.f64187F.hashCode() + AbstractC2875y.m8289b((this.f64192z.hashCode() + ((this.f64191y.hashCode() + ((this.f64190x.hashCode() + (this.f64189w.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.f64186E);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m47252i() {
        return this.f64190x == EnumC16683k1.f64151y;
    }

    /* JADX INFO: renamed from: k */
    public final C33122b0 m47253k() {
        EnumC33120a0 enumC33120a0;
        EnumC16677j1 enumC16677j1 = this.f64192z;
        int iOrdinal = enumC16677j1.ordinal();
        boolean z4 = true;
        if (iOrdinal == 0 || iOrdinal == 1) {
            enumC33120a0 = EnumC33120a0.f138159w;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            enumC33120a0 = EnumC33120a0.f138160x;
        }
        if (enumC16677j1 != EnumC16677j1.f64133y && !m47252i()) {
            z4 = false;
        }
        return new C33122b0(z4, enumC33120a0, m47252i());
    }

    public final String toString() {
        return "BillingDetailsCollectionConfiguration(name=" + this.f64189w + ", phone=" + this.f64190x + ", email=" + this.f64191y + ", address=" + this.f64192z + ", attachDefaultsToPaymentMethod=" + this.f64186E + ", allowedCountries=" + this.f64187F + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f64189w.name());
        dest.writeString(this.f64190x.name());
        dest.writeString(this.f64191y.name());
        dest.writeString(this.f64192z.name());
        dest.writeInt(this.f64186E ? 1 : 0);
        Set set = this.f64187F;
        dest.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            dest.writeString((String) it.next());
        }
    }

    public C16689l1(EnumC16683k1 name, EnumC16683k1 phone, EnumC16683k1 email, EnumC16677j1 address, boolean z4, Set allowedCountries) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(phone, "phone");
        AbstractC22676k.m65750j(email, "email");
        AbstractC22676k.m65750j(address, "address");
        AbstractC22676k.m65750j(allowedCountries, "allowedCountries");
        this.f64189w = name;
        this.f64190x = phone;
        this.f64191y = email;
        this.f64192z = address;
        this.f64186E = z4;
        this.f64187F = allowedCountries;
        this.f64188G = AbstractC30060g.m92088H(new C16587n0(this, 2));
    }
}
