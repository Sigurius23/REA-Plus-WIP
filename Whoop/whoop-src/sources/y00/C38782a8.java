package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.a8 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38782a8 extends AbstractC38792b8 {
    public static final Parcelable.Creator<C38782a8> CREATOR = new C38821e7(17);

    /* JADX INFO: renamed from: w */
    public final C38882k8 f166930w;

    public C38782a8(C38882k8 weChat) {
        AbstractC22676k.m65750j(weChat, "weChat");
        this.f166930w = weChat;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C38782a8) && AbstractC22676k.m65745e(this.f166930w, ((C38782a8) obj).f166930w);
    }

    public final int hashCode() {
        return this.f166930w.hashCode();
    }

    public final String toString() {
        return "WeChatPayRedirect(weChat=" + this.f166930w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        this.f166930w.writeToParcel(dest, i13);
    }
}
