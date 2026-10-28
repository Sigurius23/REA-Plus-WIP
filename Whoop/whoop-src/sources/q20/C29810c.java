package q20;

import android.os.Parcel;
import android.os.Parcelable;
import p031b9.AbstractC2875y;
import p499t9.C33623c0;
import p715kotlin.jvm.internal.AbstractC22676k;
import pn.C29367a;
import y00.EnumC38828f4;

/* JADX INFO: renamed from: q20.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C29810c implements Parcelable {
    public static final Parcelable.Creator<C29810c> CREATOR = new C29367a(23);

    /* JADX INFO: renamed from: w */
    public final String f121866w;

    /* JADX INFO: renamed from: x */
    public final String f121867x;

    public C29810c(String identifier, String displayText) {
        AbstractC22676k.m65750j(identifier, "identifier");
        AbstractC22676k.m65750j(displayText, "displayText");
        this.f121866w = identifier;
        this.f121867x = displayText;
    }

    /* JADX INFO: renamed from: b */
    public final C29810c m91320b(String code) {
        AbstractC22676k.m65750j(code, "code");
        if (!AbstractC22676k.m65745e(this.f121866w, "link_instant_debits")) {
            return null;
        }
        C33623c0 c33623c0 = EnumC38828f4.f167088G;
        if (code.equals("link")) {
            return this;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29810c)) {
            return false;
        }
        C29810c c29810c = (C29810c) obj;
        return AbstractC22676k.m65745e(this.f121866w, c29810c.f121866w) && AbstractC22676k.m65745e(this.f121867x, c29810c.f121867x);
    }

    public final int hashCode() {
        return this.f121867x.hashCode() + (this.f121866w.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC2875y.m8300m("PaymentMethodIncentive(identifier=", this.f121866w, ", displayText=", this.f121867x, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f121866w);
        dest.writeString(this.f121867x);
    }
}
