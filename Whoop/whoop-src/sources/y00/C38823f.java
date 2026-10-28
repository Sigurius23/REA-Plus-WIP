package y00;

import android.os.Parcel;
import android.os.Parcelable;
import ih0.AbstractC18489d0;
import java.math.BigDecimal;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p565vy.InterfaceC36562b;
import p597wx.C37677f;
import p695zx.C41185g;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;
import yb3.AbstractC39420x;

/* JADX INFO: renamed from: y00.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C38823f implements InterfaceC36562b {
    public static final Parcelable.Creator<C38823f> CREATOR = new C37677f(28);

    /* JADX INFO: renamed from: w */
    public final String f167077w;

    /* JADX INFO: renamed from: x */
    public final String f167078x;

    /* JADX INFO: renamed from: y */
    public final boolean f167079y;

    public C38823f(String low, String high, boolean z4) {
        AbstractC22676k.m65750j(low, "low");
        AbstractC22676k.m65750j(high, "high");
        this.f167077w = low;
        this.f167078x = high;
        this.f167079y = z4;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m124344b(C41185g cardNumber) {
        AbstractC22676k.m65750j(cardNumber, "cardNumber");
        String str = cardNumber.f177696d;
        AbstractC22676k.m65750j(str, "<this>");
        BigDecimal bigDecimal = null;
        try {
            if (AbstractC39420x.m125912v(str)) {
                bigDecimal = new BigDecimal(str);
            }
        } catch (NumberFormatException unused) {
        }
        if (bigDecimal == null) {
            return false;
        }
        int length = str.length();
        String str2 = this.f167077w;
        boolean z4 = length >= str2.length() ? new BigDecimal(AbstractC39414r.m125866L0(str2.length(), str)).compareTo(new BigDecimal(str2)) >= 0 : bigDecimal.compareTo(new BigDecimal(AbstractC39414r.m125866L0(str.length(), str2))) >= 0;
        int length2 = str.length();
        String str3 = this.f167078x;
        return z4 && (length2 >= str3.length() ? new BigDecimal(AbstractC39414r.m125866L0(str3.length(), str)).compareTo(new BigDecimal(str3)) <= 0 : bigDecimal.compareTo(new BigDecimal(AbstractC39414r.m125866L0(str.length(), str3))) <= 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38823f)) {
            return false;
        }
        C38823f c38823f = (C38823f) obj;
        return AbstractC22676k.m65745e(this.f167077w, c38823f.f167077w) && AbstractC22676k.m65745e(this.f167078x, c38823f.f167078x) && this.f167079y == c38823f.f167079y;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f167079y) + AbstractC11266d.m30450d(this.f167077w.hashCode() * 31, 31, this.f167078x);
    }

    public final String toString() {
        return AbstractC18489d0.m53372m(AbstractC11895b.m32001t("BinRange(low=", this.f167077w, ", high=", this.f167078x, ", isStatic="), this.f167079y, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167077w);
        dest.writeString(this.f167078x);
        dest.writeInt(this.f167079y ? 1 : 0);
    }
}
