package q30;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.C29831p;
import r30.C30897b;
import r30.C30900e;

/* JADX INFO: renamed from: q30.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C29927r extends AbstractC29931t {
    public static final Parcelable.Creator<C29927r> CREATOR = new C29831p(21);

    /* JADX INFO: renamed from: w */
    public final C30897b f122227w;

    /* JADX INFO: renamed from: x */
    public final C30900e f122228x;

    /* JADX INFO: renamed from: y */
    public final C29919n f122229y;

    public C29927r(C30897b creqData, C30900e cresData, C29919n creqExecutorConfig) {
        AbstractC22676k.m65750j(creqData, "creqData");
        AbstractC22676k.m65750j(cresData, "cresData");
        AbstractC22676k.m65750j(creqExecutorConfig, "creqExecutorConfig");
        this.f122227w = creqData;
        this.f122228x = cresData;
        this.f122229y = creqExecutorConfig;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29927r)) {
            return false;
        }
        C29927r c29927r = (C29927r) obj;
        return AbstractC22676k.m65745e(this.f122227w, c29927r.f122227w) && AbstractC22676k.m65745e(this.f122228x, c29927r.f122228x) && AbstractC22676k.m65745e(this.f122229y, c29927r.f122229y);
    }

    public final int hashCode() {
        return this.f122229y.hashCode() + ((this.f122228x.hashCode() + (this.f122227w.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Success(creqData=" + this.f122227w + ", cresData=" + this.f122228x + ", creqExecutorConfig=" + this.f122229y + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        this.f122227w.writeToParcel(dest, i13);
        this.f122228x.writeToParcel(dest, i13);
        this.f122229y.writeToParcel(dest, i13);
    }
}
