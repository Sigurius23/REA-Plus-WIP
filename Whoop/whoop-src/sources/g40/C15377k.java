package g40;

import android.os.Parcel;
import android.os.Parcelable;
import c93.InterfaceC4339a;
import com.stripe.android.uicore.elements.AddressFieldConfiguration;
import e40.InterfaceC12689c;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g40.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C15377k extends AbstractC15387m implements InterfaceC12689c {
    public static final Parcelable.Creator<C15377k> CREATOR = new C15365i(1);

    /* JADX INFO: renamed from: E */
    public final AddressFieldConfiguration f57806E;

    /* JADX INFO: renamed from: F */
    public final InterfaceC4339a f57807F;

    /* JADX INFO: renamed from: w */
    public final String f57808w;

    /* JADX INFO: renamed from: x */
    public final Set f57809x;

    /* JADX INFO: renamed from: y */
    public final AddressFieldConfiguration f57810y;

    /* JADX INFO: renamed from: z */
    public final AddressFieldConfiguration f57811z;

    public C15377k(String str, Set set, AddressFieldConfiguration phoneNumberConfig, AddressFieldConfiguration nameConfig, AddressFieldConfiguration emailConfig, InterfaceC4339a onNavigation) {
        AbstractC22676k.m65750j(phoneNumberConfig, "phoneNumberConfig");
        AbstractC22676k.m65750j(nameConfig, "nameConfig");
        AbstractC22676k.m65750j(emailConfig, "emailConfig");
        AbstractC22676k.m65750j(onNavigation, "onNavigation");
        this.f57808w = str;
        this.f57809x = set;
        this.f57810y = phoneNumberConfig;
        this.f57811z = nameConfig;
        this.f57806E = emailConfig;
        this.f57807F = onNavigation;
    }

    @Override // e40.InterfaceC12689c
    /* JADX INFO: renamed from: b */
    public final String mo35498b() {
        return this.f57808w;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15377k)) {
            return false;
        }
        C15377k c15377k = (C15377k) obj;
        return AbstractC22676k.m65745e(this.f57808w, c15377k.f57808w) && AbstractC22676k.m65745e(this.f57809x, c15377k.f57809x) && this.f57810y == c15377k.f57810y && this.f57811z == c15377k.f57811z && this.f57806E == c15377k.f57806E && AbstractC22676k.m65745e(this.f57807F, c15377k.f57807F);
    }

    @Override // e40.InterfaceC12689c
    /* JADX INFO: renamed from: f */
    public final boolean mo35499f(String str, boolean z4) {
        return AbstractC22674j.m65709Q(this, str, z4);
    }

    @Override // e40.InterfaceC12689c
    /* JADX INFO: renamed from: h */
    public final InterfaceC4339a mo35500h() {
        return this.f57807F;
    }

    public final int hashCode() {
        String str = this.f57808w;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Set set = this.f57809x;
        return this.f57807F.hashCode() + ((this.f57806E.hashCode() + ((this.f57811z.hashCode() + ((this.f57810y.hashCode() + ((iHashCode + (set != null ? set.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // e40.InterfaceC12689c
    /* JADX INFO: renamed from: i */
    public final Set mo35501i() {
        return this.f57809x;
    }

    @Override // g40.AbstractC15387m
    /* JADX INFO: renamed from: k */
    public final AddressFieldConfiguration mo43581k() {
        return this.f57806E;
    }

    @Override // g40.AbstractC15387m
    /* JADX INFO: renamed from: s */
    public final AddressFieldConfiguration mo43582s() {
        return this.f57811z;
    }

    public final String toString() {
        return "AutocompleteExpanded(googleApiKey=" + this.f57808w + ", autocompleteCountries=" + this.f57809x + ", phoneNumberConfig=" + this.f57810y + ", nameConfig=" + this.f57811z + ", emailConfig=" + this.f57806E + ", onNavigation=" + this.f57807F + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f57808w);
        Set set = this.f57809x;
        if (set == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(set.size());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                dest.writeString((String) it.next());
            }
        }
        dest.writeString(this.f57810y.name());
        dest.writeString(this.f57811z.name());
        dest.writeString(this.f57806E.name());
        dest.writeSerializable((Serializable) this.f57807F);
    }

    @Override // g40.AbstractC15387m
    /* JADX INFO: renamed from: x */
    public final AddressFieldConfiguration mo43583x() {
        return this.f57810y;
    }
}
