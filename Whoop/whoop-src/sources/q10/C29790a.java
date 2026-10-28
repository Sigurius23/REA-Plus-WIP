package q10;

import android.os.Parcel;
import android.os.Parcelable;
import e10.InterfaceC12555l;
import h20.C16661g3;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;
import pn.C29367a;

/* JADX INFO: renamed from: q10.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C29790a implements InterfaceC12555l {
    public static final Parcelable.Creator<C29790a> CREATOR = new C29367a(22);

    /* JADX INFO: renamed from: w */
    public final C16661g3 f121804w;

    /* JADX INFO: renamed from: x */
    public final String f121805x;

    /* JADX INFO: renamed from: y */
    public final String f121806y;

    public C29790a(C16661g3 shopPayConfiguration, String customerSessionClientSecret, String merchantDisplayName) {
        AbstractC22676k.m65750j(shopPayConfiguration, "shopPayConfiguration");
        AbstractC22676k.m65750j(customerSessionClientSecret, "customerSessionClientSecret");
        AbstractC22676k.m65750j(merchantDisplayName, "merchantDisplayName");
        this.f121804w = shopPayConfiguration;
        this.f121805x = customerSessionClientSecret;
        this.f121806y = merchantDisplayName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29790a)) {
            return false;
        }
        C29790a c29790a = (C29790a) obj;
        return AbstractC22676k.m65745e(this.f121804w, c29790a.f121804w) && AbstractC22676k.m65745e(this.f121805x, c29790a.f121805x) && AbstractC22676k.m65745e(this.f121806y, c29790a.f121806y);
    }

    public final int hashCode() {
        return this.f121806y.hashCode() + AbstractC11266d.m30450d(this.f121804w.hashCode() * 31, 31, this.f121805x);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("ShopPayConfirmationOption(shopPayConfiguration=");
        sb4.append(this.f121804w);
        sb4.append(", customerSessionClientSecret=");
        sb4.append(this.f121805x);
        sb4.append(", merchantDisplayName=");
        return AbstractC25012a.m73376i(this.f121806y, ")", sb4);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        this.f121804w.writeToParcel(dest, i13);
        dest.writeString(this.f121805x);
        dest.writeString(this.f121806y);
    }
}
