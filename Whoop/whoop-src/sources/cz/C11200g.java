package cz;

import android.os.Parcel;
import android.os.Parcelable;
import c13.AbstractC3855a;
import d13.AbstractC11478a;
import p023ay.C2125b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: cz.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C11200g implements Parcelable {
    public static final Parcelable.Creator<C11200g> CREATOR = new C2125b(15);

    /* JADX INFO: renamed from: w */
    public final EnumC11202h f35922w;

    /* JADX INFO: renamed from: x */
    public final C11190b f35923x;

    /* JADX INFO: renamed from: y */
    public final Integer f35924y;

    public C11200g(EnumC11202h integrationType, C11190b configuration, Integer num) {
        AbstractC22676k.m65750j(integrationType, "integrationType");
        AbstractC22676k.m65750j(configuration, "configuration");
        this.f35922w = integrationType;
        this.f35923x = configuration;
        this.f35924y = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11200g)) {
            return false;
        }
        C11200g c11200g = (C11200g) obj;
        return this.f35922w == c11200g.f35922w && AbstractC22676k.m65745e(this.f35923x, c11200g.f35923x) && AbstractC22676k.m65745e(this.f35924y, c11200g.f35924y);
    }

    public final int hashCode() {
        int iHashCode = (this.f35923x.hashCode() + (this.f35922w.hashCode() * 31)) * 31;
        Integer num = this.f35924y;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Args(integrationType=");
        sb4.append(this.f35922w);
        sb4.append(", configuration=");
        sb4.append(this.f35923x);
        sb4.append(", statusBarColor=");
        return AbstractC11478a.m30859k(sb4, this.f35924y, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f35922w.name());
        this.f35923x.writeToParcel(dest, i13);
        Integer num = this.f35924y;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num);
        }
    }
}
