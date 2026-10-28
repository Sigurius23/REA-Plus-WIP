package p127ev;

import android.os.Parcel;
import android.os.Parcelable;
import com.mapbox.maps.ImageHolder;
import p000.AbstractC30802r;
import p126eq.C13433b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ev.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C13662c extends AbstractC13664e {
    public static final Parcelable.Creator<C13662c> CREATOR = new C13433b(1);

    /* JADX INFO: renamed from: E */
    public final float f48418E;

    /* JADX INFO: renamed from: w */
    public final ImageHolder f48419w;

    /* JADX INFO: renamed from: x */
    public final ImageHolder f48420x;

    /* JADX INFO: renamed from: y */
    public final ImageHolder f48421y;

    /* JADX INFO: renamed from: z */
    public final String f48422z;

    public C13662c(ImageHolder imageHolder, ImageHolder imageHolder2, ImageHolder imageHolder3, String str, float f13) {
        this.f48419w = imageHolder;
        this.f48420x = imageHolder2;
        this.f48421y = imageHolder3;
        this.f48422z = str;
        this.f48418E = f13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13662c)) {
            return false;
        }
        C13662c c13662c = (C13662c) obj;
        return AbstractC22676k.m65745e(this.f48419w, c13662c.f48419w) && AbstractC22676k.m65745e(this.f48420x, c13662c.f48420x) && AbstractC22676k.m65745e(this.f48421y, c13662c.f48421y) && AbstractC22676k.m65745e(this.f48422z, c13662c.f48422z) && Float.compare(this.f48418E, c13662c.f48418E) == 0;
    }

    public final int hashCode() {
        ImageHolder imageHolder = this.f48419w;
        int iHashCode = (imageHolder == null ? 0 : imageHolder.hashCode()) * 31;
        ImageHolder imageHolder2 = this.f48420x;
        int iHashCode2 = (iHashCode + (imageHolder2 == null ? 0 : imageHolder2.hashCode())) * 31;
        ImageHolder imageHolder3 = this.f48421y;
        int iHashCode3 = (iHashCode2 + (imageHolder3 == null ? 0 : imageHolder3.hashCode())) * 31;
        String str = this.f48422z;
        return Float.hashCode(this.f48418E) + ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("LocationPuck2D(topImage=");
        sb4.append(this.f48419w);
        sb4.append(", bearingImage=");
        sb4.append(this.f48420x);
        sb4.append(", shadowImage=");
        sb4.append(this.f48421y);
        sb4.append(", scaleExpression=");
        sb4.append(this.f48422z);
        sb4.append(", opacity=");
        return AbstractC30802r.m94763l(sb4, this.f48418E, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i13) {
        AbstractC22676k.m65750j(out, "out");
        ImageHolder imageHolder = this.f48419w;
        if (imageHolder == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            imageHolder.writeToParcel(out, i13);
        }
        ImageHolder imageHolder2 = this.f48420x;
        if (imageHolder2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            imageHolder2.writeToParcel(out, i13);
        }
        ImageHolder imageHolder3 = this.f48421y;
        if (imageHolder3 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            imageHolder3.writeToParcel(out, i13);
        }
        out.writeString(this.f48422z);
        out.writeFloat(this.f48418E);
    }

    public /* synthetic */ C13662c(ImageHolder imageHolder, ImageHolder imageHolder2, ImageHolder imageHolder3, String str, int i13) {
        this(imageHolder, imageHolder2, imageHolder3, (i13 & 8) != 0 ? null : str, 1.0f);
    }
}
