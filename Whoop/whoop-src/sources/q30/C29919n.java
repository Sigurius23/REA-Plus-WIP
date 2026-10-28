package q30;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import o30.InterfaceC27506d;
import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.C29831p;
import r30.C30897b;

/* JADX INFO: renamed from: q30.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C29919n implements Serializable, Parcelable {
    public static final Parcelable.Creator<C29919n> CREATOR = new C29831p(17);

    /* JADX INFO: renamed from: E */
    public final C29917m f122210E;

    /* JADX INFO: renamed from: w */
    public final InterfaceC27506d f122211w;

    /* JADX INFO: renamed from: x */
    public final String f122212x;

    /* JADX INFO: renamed from: y */
    public final C30897b f122213y;

    /* JADX INFO: renamed from: z */
    public final String f122214z;

    public C29919n(InterfaceC27506d messageTransformer, String sdkReferenceId, C30897b creqData, String acsUrl, C29917m keys) {
        AbstractC22676k.m65750j(messageTransformer, "messageTransformer");
        AbstractC22676k.m65750j(sdkReferenceId, "sdkReferenceId");
        AbstractC22676k.m65750j(creqData, "creqData");
        AbstractC22676k.m65750j(acsUrl, "acsUrl");
        AbstractC22676k.m65750j(keys, "keys");
        this.f122211w = messageTransformer;
        this.f122212x = sdkReferenceId;
        this.f122213y = creqData;
        this.f122214z = acsUrl;
        this.f122210E = keys;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29919n)) {
            return false;
        }
        C29919n c29919n = (C29919n) obj;
        return AbstractC22676k.m65745e(this.f122211w, c29919n.f122211w) && AbstractC22676k.m65745e(this.f122212x, c29919n.f122212x) && AbstractC22676k.m65745e(this.f122213y, c29919n.f122213y) && AbstractC22676k.m65745e(this.f122214z, c29919n.f122214z) && AbstractC22676k.m65745e(this.f122210E, c29919n.f122210E);
    }

    public final int hashCode() {
        return this.f122210E.hashCode() + AbstractC11266d.m30450d((this.f122213y.hashCode() + AbstractC11266d.m30450d(this.f122211w.hashCode() * 31, 31, this.f122212x)) * 31, 31, this.f122214z);
    }

    public final String toString() {
        return "Config(messageTransformer=" + this.f122211w + ", sdkReferenceId=" + this.f122212x + ", creqData=" + this.f122213y + ", acsUrl=" + this.f122214z + ", keys=" + this.f122210E + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeSerializable(this.f122211w);
        dest.writeString(this.f122212x);
        this.f122213y.writeToParcel(dest, i13);
        dest.writeString(this.f122214z);
        this.f122210E.writeToParcel(dest, i13);
    }
}
