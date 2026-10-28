package v00;

import android.os.Parcel;
import android.os.Parcelable;
import com.whoop.android.R;
import d13.AbstractC11478a;
import h20.EnumC16743u1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p537ux.InterfaceC35322b;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;
import y00.EnumC38863j;

/* JADX INFO: renamed from: v00.k0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C35475k0 implements InterfaceC35322b {
    public static final Parcelable.Creator<C35475k0> CREATOR = new C35467g0(2);

    /* JADX INFO: renamed from: w */
    public final List f151016w;

    public C35475k0(List allowedCardFundingTypes) {
        AbstractC22676k.m65750j(allowedCardFundingTypes, "allowedCardFundingTypes");
        this.f151016w = allowedCardFundingTypes;
    }

    @Override // p537ux.InterfaceC35322b
    /* JADX INFO: renamed from: A */
    public final Integer mo112182A() {
        List list = this.f151016w;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((EnumC16743u1) it.next()).m47263b());
        }
        Set setM74103I1 = AbstractC25265s.m74103I1(arrayList);
        boolean zContains = setM74103I1.contains(EnumC38863j.Credit);
        boolean zContains2 = setM74103I1.contains(EnumC38863j.Debit);
        boolean zContains3 = setM74103I1.contains(EnumC38863j.Prepaid);
        if (zContains && zContains2 && zContains3) {
            return null;
        }
        if (zContains && zContains2) {
            return Integer.valueOf(R.string.stripe_card_funding_only_debit_credit);
        }
        if (zContains && zContains3) {
            return Integer.valueOf(R.string.stripe_card_funding_only_credit_prepaid);
        }
        if (zContains2 && zContains3) {
            return Integer.valueOf(R.string.stripe_card_funding_only_debit_prepaid);
        }
        if (zContains) {
            return Integer.valueOf(R.string.stripe_card_funding_only_credit);
        }
        if (zContains2) {
            return Integer.valueOf(R.string.stripe_card_funding_only_debit);
        }
        if (zContains3) {
            return Integer.valueOf(R.string.stripe_card_funding_only_prepaid);
        }
        return null;
    }

    @Override // p537ux.InterfaceC35322b
    /* JADX INFO: renamed from: F */
    public final boolean mo112183F(EnumC38863j cardFunding) {
        AbstractC22676k.m65750j(cardFunding, "cardFunding");
        List list = this.f151016w;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((EnumC16743u1) it.next()).m47263b() == cardFunding) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35475k0) && AbstractC22676k.m65745e(this.f151016w, ((C35475k0) obj).f151016w);
    }

    public final int hashCode() {
        return this.f151016w.hashCode();
    }

    public final String toString() {
        return AbstractC33745d.m106654m("PaymentSheetCardFundingFilter(allowedCardFundingTypes=", ")", this.f151016w);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        Iterator itM30863o = AbstractC11478a.m30863o(this.f151016w, dest);
        while (itM30863o.hasNext()) {
            dest.writeParcelable((Parcelable) itM30863o.next(), i13);
        }
    }
}
