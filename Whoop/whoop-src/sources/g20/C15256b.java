package g20;

import android.os.Parcel;
import android.os.Parcelable;
import p126eq.C13433b;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.InterfaceC38802c8;

/* JADX INFO: renamed from: g20.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C15256b extends AbstractC15258d {
    public static final Parcelable.Creator<C15256b> CREATOR = new C13433b(12);

    /* JADX INFO: renamed from: w */
    public final InterfaceC38802c8 f57287w;

    public C15256b(InterfaceC38802c8 intent) {
        AbstractC22676k.m65750j(intent, "intent");
        this.f57287w = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15256b) && AbstractC22676k.m65745e(this.f57287w, ((C15256b) obj).f57287w);
    }

    public final int hashCode() {
        return this.f57287w.hashCode();
    }

    public final String toString() {
        return "Completed(intent=" + this.f57287w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f57287w, i13);
    }
}
