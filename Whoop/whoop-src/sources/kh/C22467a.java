package kh;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C1337q1;
import java.util.Map;
import m83.C25272z;
import p000.AbstractC30802r;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: kh.a */
/* JADX INFO: loaded from: classes.dex */
public final class C22467a implements Parcelable {

    @Deprecated
    public static final Parcelable.Creator<C22467a> CREATOR = new C1337q1(6);

    /* JADX INFO: renamed from: w */
    public final String f88016w;

    /* JADX INFO: renamed from: x */
    public final Map f88017x;

    public C22467a(String str, Map map) {
        this.f88016w = str;
        this.f88017x = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22467a)) {
            return false;
        }
        C22467a c22467a = (C22467a) obj;
        return AbstractC22676k.m65745e(this.f88016w, c22467a.f88016w) && AbstractC22676k.m65745e(this.f88017x, c22467a.f88017x);
    }

    public final int hashCode() {
        return this.f88017x.hashCode() + (this.f88016w.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Key(key=");
        sb4.append(this.f88016w);
        sb4.append(", extras=");
        return AbstractC30802r.m94764m(sb4, this.f88017x, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeString(this.f88016w);
        Map map = this.f88017x;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }

    public /* synthetic */ C22467a(String str) {
        this(str, C25272z.f99163w);
    }
}
