package g40;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.uicore.elements.AddressFieldConfiguration;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g40.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C15382l extends AbstractC15387m {
    public static final Parcelable.Creator<C15382l> CREATOR = new C15365i(2);

    /* JADX INFO: renamed from: w */
    public final AddressFieldConfiguration f57821w;

    /* JADX INFO: renamed from: x */
    public final AddressFieldConfiguration f57822x;

    /* JADX INFO: renamed from: y */
    public final AddressFieldConfiguration f57823y;

    public C15382l(AddressFieldConfiguration phoneNumberConfig, AddressFieldConfiguration nameConfig, AddressFieldConfiguration emailConfig) {
        AbstractC22676k.m65750j(phoneNumberConfig, "phoneNumberConfig");
        AbstractC22676k.m65750j(nameConfig, "nameConfig");
        AbstractC22676k.m65750j(emailConfig, "emailConfig");
        this.f57821w = phoneNumberConfig;
        this.f57822x = nameConfig;
        this.f57823y = emailConfig;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15382l)) {
            return false;
        }
        C15382l c15382l = (C15382l) obj;
        return this.f57821w == c15382l.f57821w && this.f57822x == c15382l.f57822x && this.f57823y == c15382l.f57823y;
    }

    public final int hashCode() {
        return this.f57823y.hashCode() + ((this.f57822x.hashCode() + (this.f57821w.hashCode() * 31)) * 31);
    }

    @Override // g40.AbstractC15387m
    /* JADX INFO: renamed from: k */
    public final AddressFieldConfiguration mo43581k() {
        return this.f57823y;
    }

    @Override // g40.AbstractC15387m
    /* JADX INFO: renamed from: s */
    public final AddressFieldConfiguration mo43582s() {
        return this.f57822x;
    }

    public final String toString() {
        return "NoAutocomplete(phoneNumberConfig=" + this.f57821w + ", nameConfig=" + this.f57822x + ", emailConfig=" + this.f57823y + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f57821w.name());
        dest.writeString(this.f57822x.name());
        dest.writeString(this.f57823y.name());
    }

    @Override // g40.AbstractC15387m
    /* JADX INFO: renamed from: x */
    public final AddressFieldConfiguration mo43583x() {
        return this.f57821w;
    }

    public /* synthetic */ C15382l(AddressFieldConfiguration addressFieldConfiguration, AddressFieldConfiguration addressFieldConfiguration2, int i13) {
        this((i13 & 1) != 0 ? AddressFieldConfiguration.HIDDEN : addressFieldConfiguration, (i13 & 2) != 0 ? AddressFieldConfiguration.HIDDEN : addressFieldConfiguration2, AddressFieldConfiguration.HIDDEN);
    }
}
