package y00;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Iterator;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.f7 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38831f7 implements Parcelable {
    public static final Parcelable.Creator<C38831f7> CREATOR = new C38821e7(0);

    /* JADX INFO: renamed from: w */
    public final String f167145w;

    /* JADX INFO: renamed from: x */
    public final PublicKey f167146x;

    /* JADX INFO: renamed from: y */
    public final ArrayList f167147y;

    /* JADX INFO: renamed from: z */
    public final String f167148z;

    public C38831f7(String directoryServerId, PublicKey directoryServerPublicKey, ArrayList arrayList, String str) {
        AbstractC22676k.m65750j(directoryServerId, "directoryServerId");
        AbstractC22676k.m65750j(directoryServerPublicKey, "directoryServerPublicKey");
        this.f167145w = directoryServerId;
        this.f167146x = directoryServerPublicKey;
        this.f167147y = arrayList;
        this.f167148z = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38831f7)) {
            return false;
        }
        C38831f7 c38831f7 = (C38831f7) obj;
        return AbstractC22676k.m65745e(this.f167145w, c38831f7.f167145w) && AbstractC22676k.m65745e(this.f167146x, c38831f7.f167146x) && this.f167147y.equals(c38831f7.f167147y) && AbstractC22676k.m65745e(this.f167148z, c38831f7.f167148z);
    }

    public final int hashCode() {
        int iHashCode = (this.f167147y.hashCode() + ((this.f167146x.hashCode() + (this.f167145w.hashCode() * 31)) * 31)) * 31;
        String str = this.f167148z;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "DirectoryServerEncryption(directoryServerId=" + this.f167145w + ", directoryServerPublicKey=" + this.f167146x + ", rootCerts=" + this.f167147y + ", keyId=" + this.f167148z + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167145w);
        dest.writeSerializable(this.f167146x);
        ArrayList arrayList = this.f167147y;
        dest.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            dest.writeSerializable((Serializable) it.next());
        }
        dest.writeString(this.f167148z);
    }
}
