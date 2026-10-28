package p442qy;

import android.os.Parcel;
import android.os.Parcelable;
import io.getstream.chat.android.client.api.QueryParams;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: qy.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C30764c implements Parcelable {
    public static final Parcelable.Creator<C30764c> CREATOR = new C30763b(0);

    /* JADX INFO: renamed from: w */
    public final String f126691w;

    /* JADX INFO: renamed from: x */
    public final String f126692x;

    /* JADX INFO: renamed from: y */
    public final String f126693y;

    /* JADX INFO: renamed from: z */
    public final String f126694z;

    public C30764c(String name, String str, String str2, String str3) {
        AbstractC22676k.m65750j(name, "name");
        this.f126691w = name;
        this.f126692x = str;
        this.f126693y = str2;
        this.f126694z = str3;
    }

    /* JADX INFO: renamed from: b */
    public final Map m94510b() {
        return AbstractC25247g0.m73990Y(new C23465k("name", this.f126691w), new C23465k("version", this.f126692x), new C23465k(QueryParams.URL, this.f126693y), new C23465k("partner_id", this.f126694z));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30764c)) {
            return false;
        }
        C30764c c30764c = (C30764c) obj;
        return AbstractC22676k.m65745e(this.f126691w, c30764c.f126691w) && AbstractC22676k.m65745e(this.f126692x, c30764c.f126692x) && AbstractC22676k.m65745e(this.f126693y, c30764c.f126693y) && AbstractC22676k.m65745e(this.f126694z, c30764c.f126694z);
    }

    public final int hashCode() {
        int iHashCode = this.f126691w.hashCode() * 31;
        String str = this.f126692x;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f126693y;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f126694z;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return AbstractC11266d.m30464r(AbstractC11895b.m32001t("AppInfo(name=", this.f126691w, ", version=", this.f126692x, ", url="), this.f126693y, ", partnerId=", this.f126694z, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f126691w);
        dest.writeString(this.f126692x);
        dest.writeString(this.f126693y);
        dest.writeString(this.f126694z);
    }
}
