package m30;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p098dt.AbstractC12350b;
import p266jz.C22060h;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m30.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C24992h implements Parcelable {
    public static final Parcelable.Creator<C24992h> CREATOR = new C22060h(29);

    /* JADX INFO: renamed from: E */
    public final HashMap f97798E;

    /* JADX INFO: renamed from: F */
    public final String f97799F;

    /* JADX INFO: renamed from: w */
    public final C24991g f97800w;

    /* JADX INFO: renamed from: x */
    public final C24989e f97801x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC24993i f97802y;

    /* JADX INFO: renamed from: z */
    public final AbstractMap f97803z;

    public C24992h() {
        this.f97803z = new EnumMap(EnumC24994j.class);
        this.f97798E = new HashMap();
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC24986b m73318b(EnumC24994j enumC24994j) {
        return (InterfaceC24986b) this.f97803z.get(enumC24994j);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24992h)) {
            return false;
        }
        C24992h c24992h = (C24992h) obj;
        return AbstractC22676k.m65745e(this.f97800w, c24992h.f97800w) && AbstractC22676k.m65745e(this.f97799F, c24992h.f97799F) && AbstractC22676k.m65745e(this.f97801x, c24992h.f97801x) && AbstractC22676k.m65745e(this.f97802y, c24992h.f97802y) && AbstractC22676k.m65745e(this.f97803z, c24992h.f97803z) && AbstractC22676k.m65745e(this.f97798E, c24992h.f97798E);
    }

    public final int hashCode() {
        return Objects.hash(Arrays.copyOf(new Object[]{this.f97800w, this.f97799F, this.f97801x, this.f97802y, this.f97803z, this.f97798E}, 6));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeString(this.f97799F);
        parcel.writeParcelable(this.f97800w, 0);
        parcel.writeParcelable(this.f97801x, 0);
        parcel.writeParcelable((C24990f) this.f97802y, 0);
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f97803z.entrySet()) {
            bundle.putParcelable(((EnumC24994j) entry.getKey()).name(), (C24988d) entry.getValue());
        }
        parcel.writeBundle(bundle);
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry2 : this.f97798E.entrySet()) {
            bundle2.putParcelable((String) entry2.getKey(), (C24988d) entry2.getValue());
        }
        parcel.writeBundle(bundle2);
    }

    public C24992h(Parcel parcel) {
        this.f97799F = parcel.readString();
        this.f97800w = (C24991g) parcel.readParcelable(C24991g.class.getClassLoader());
        this.f97801x = (C24989e) parcel.readParcelable(C24989e.class.getClassLoader());
        this.f97802y = (InterfaceC24993i) parcel.readParcelable(C24990f.class.getClassLoader());
        this.f97803z = new HashMap();
        Bundle bundle = parcel.readBundle(C24992h.class.getClassLoader());
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                InterfaceC24986b interfaceC24986b = (InterfaceC24986b) AbstractC12350b.m34600u(bundle, InterfaceC24986b.class, str);
                if (interfaceC24986b != null) {
                    this.f97803z.put(EnumC24994j.valueOf(str), interfaceC24986b);
                }
            }
        }
        this.f97798E = new HashMap();
        Bundle bundle2 = parcel.readBundle(C24992h.class.getClassLoader());
        if (bundle2 != null) {
            for (String str2 : bundle2.keySet()) {
                InterfaceC24986b interfaceC24986b2 = (InterfaceC24986b) AbstractC12350b.m34600u(bundle2, InterfaceC24986b.class, str2);
                if (interfaceC24986b2 != null) {
                    this.f97798E.put(str2, interfaceC24986b2);
                }
            }
        }
    }
}
