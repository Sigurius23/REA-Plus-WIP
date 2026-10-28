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

/* JADX INFO: renamed from: g40.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C15371j extends AbstractC15387m implements InterfaceC12689c {
    public static final Parcelable.Creator<C15371j> CREATOR = new C15365i(0);

    /* JADX INFO: renamed from: E */
    public final AddressFieldConfiguration f57775E;

    /* JADX INFO: renamed from: F */
    public final InterfaceC4339a f57776F;

    /* JADX INFO: renamed from: w */
    public final String f57777w;

    /* JADX INFO: renamed from: x */
    public final Set f57778x;

    /* JADX INFO: renamed from: y */
    public final AddressFieldConfiguration f57779y;

    /* JADX INFO: renamed from: z */
    public final AddressFieldConfiguration f57780z;

    public C15371j(String str, Set set, AddressFieldConfiguration phoneNumberConfig, AddressFieldConfiguration nameConfig, AddressFieldConfiguration emailConfig, InterfaceC4339a onNavigation) {
        AbstractC22676k.m65750j(phoneNumberConfig, "phoneNumberConfig");
        AbstractC22676k.m65750j(nameConfig, "nameConfig");
        AbstractC22676k.m65750j(emailConfig, "emailConfig");
        AbstractC22676k.m65750j(onNavigation, "onNavigation");
        this.f57777w = str;
        this.f57778x = set;
        this.f57779y = phoneNumberConfig;
        this.f57780z = nameConfig;
        this.f57775E = emailConfig;
        this.f57776F = onNavigation;
    }

    @Override // e40.InterfaceC12689c
    /* JADX INFO: renamed from: b */
    public final String mo35498b() {
        return this.f57777w;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15371j)) {
            return false;
        }
        C15371j c15371j = (C15371j) obj;
        return AbstractC22676k.m65745e(this.f57777w, c15371j.f57777w) && AbstractC22676k.m65745e(this.f57778x, c15371j.f57778x) && this.f57779y == c15371j.f57779y && this.f57780z == c15371j.f57780z && this.f57775E == c15371j.f57775E && AbstractC22676k.m65745e(this.f57776F, c15371j.f57776F);
    }

    @Override // e40.InterfaceC12689c
    /* JADX INFO: renamed from: f */
    public final boolean mo35499f(String str, boolean z4) {
        return AbstractC22674j.m65709Q(this, str, z4);
    }

    @Override // e40.InterfaceC12689c
    /* JADX INFO: renamed from: h */
    public final InterfaceC4339a mo35500h() {
        return this.f57776F;
    }

    public final int hashCode() {
        String str = this.f57777w;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Set set = this.f57778x;
        return this.f57776F.hashCode() + ((this.f57775E.hashCode() + ((this.f57780z.hashCode() + ((this.f57779y.hashCode() + ((iHashCode + (set != null ? set.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // e40.InterfaceC12689c
    /* JADX INFO: renamed from: i */
    public final Set mo35501i() {
        return this.f57778x;
    }

    @Override // g40.AbstractC15387m
    /* JADX INFO: renamed from: k */
    public final AddressFieldConfiguration mo43581k() {
        return this.f57775E;
    }

    @Override // g40.AbstractC15387m
    /* JADX INFO: renamed from: s */
    public final AddressFieldConfiguration mo43582s() {
        return this.f57780z;
    }

    public final String toString() {
        return "AutocompleteCondensed(googleApiKey=" + this.f57777w + ", autocompleteCountries=" + this.f57778x + ", phoneNumberConfig=" + this.f57779y + ", nameConfig=" + this.f57780z + ", emailConfig=" + this.f57775E + ", onNavigation=" + this.f57776F + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f57777w);
        Set set = this.f57778x;
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
        dest.writeString(this.f57779y.name());
        dest.writeString(this.f57780z.name());
        dest.writeString(this.f57775E.name());
        dest.writeSerializable((Serializable) this.f57776F);
    }

    @Override // g40.AbstractC15387m
    /* JADX INFO: renamed from: x */
    public final AddressFieldConfiguration mo43583x() {
        return this.f57779y;
    }
}
