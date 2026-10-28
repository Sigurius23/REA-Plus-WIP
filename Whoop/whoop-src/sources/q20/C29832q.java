package q20;

import android.os.Parcel;
import android.os.Parcelable;
import ih0.AbstractC18489d0;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.C38793c;

/* JADX INFO: renamed from: q20.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C29832q implements Parcelable {
    public static final Parcelable.Creator<C29832q> CREATOR = new C29831p(1);

    /* JADX INFO: renamed from: E */
    public final boolean f121935E;

    /* JADX INFO: renamed from: w */
    public final String f121936w;

    /* JADX INFO: renamed from: x */
    public final String f121937x;

    /* JADX INFO: renamed from: y */
    public final String f121938y;

    /* JADX INFO: renamed from: z */
    public final C38793c f121939z;

    public C29832q(String name, String str, String str2, C38793c c38793c, boolean z4) {
        AbstractC22676k.m65750j(name, "name");
        this.f121936w = name;
        this.f121937x = str;
        this.f121938y = str2;
        this.f121939z = c38793c;
        this.f121935E = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29832q)) {
            return false;
        }
        C29832q c29832q = (C29832q) obj;
        return AbstractC22676k.m65745e(this.f121936w, c29832q.f121936w) && AbstractC22676k.m65745e(this.f121937x, c29832q.f121937x) && AbstractC22676k.m65745e(this.f121938y, c29832q.f121938y) && AbstractC22676k.m65745e(this.f121939z, c29832q.f121939z) && this.f121935E == c29832q.f121935E;
    }

    public final int hashCode() {
        int iHashCode = this.f121936w.hashCode() * 31;
        String str = this.f121937x;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f121938y;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C38793c c38793c = this.f121939z;
        return Boolean.hashCode(this.f121935E) + ((iHashCode3 + (c38793c != null ? c38793c.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("Input(name=", this.f121936w, ", email=", this.f121937x, ", phone=");
        sbM32001t.append(this.f121938y);
        sbM32001t.append(", address=");
        sbM32001t.append(this.f121939z);
        sbM32001t.append(", saveForFutureUse=");
        return AbstractC18489d0.m53372m(sbM32001t, this.f121935E, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f121936w);
        dest.writeString(this.f121937x);
        dest.writeString(this.f121938y);
        dest.writeParcelable(this.f121939z, i13);
        dest.writeInt(this.f121935E ? 1 : 0);
    }
}
