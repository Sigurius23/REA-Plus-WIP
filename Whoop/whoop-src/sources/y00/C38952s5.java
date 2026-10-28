package y00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import l83.C23465k;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: y00.s5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38952s5 extends AbstractC38970u5 {
    public static final Parcelable.Creator<C38952s5> CREATOR = new C38943r5(0);

    /* JADX INFO: renamed from: x */
    public final String f167665x;

    /* JADX INFO: renamed from: y */
    public final EnumC38910o f167666y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38952s5(String appId, EnumC38910o enumC38910o) {
        super(EnumC38828f4.f167106Y);
        AbstractC22676k.m65750j(appId, "appId");
        this.f167665x = appId;
        this.f167666y = enumC38910o;
    }

    @Override // y00.AbstractC38970u5
    /* JADX INFO: renamed from: b */
    public final List mo124356b() {
        C23465k c23465k = new C23465k("client", "android");
        C23465k c23465k2 = new C23465k("app_id", this.f167665x);
        EnumC38910o enumC38910o = this.f167666y;
        return AbstractC37056f.m118959K(c23465k, c23465k2, new C23465k("setup_future_usage", enumC38910o != null ? enumC38910o.f167492w : null));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38952s5)) {
            return false;
        }
        C38952s5 c38952s5 = (C38952s5) obj;
        return AbstractC22676k.m65745e(this.f167665x, c38952s5.f167665x) && this.f167666y == c38952s5.f167666y;
    }

    public final int hashCode() {
        int iHashCode = this.f167665x.hashCode() * 31;
        EnumC38910o enumC38910o = this.f167666y;
        return iHashCode + (enumC38910o == null ? 0 : enumC38910o.hashCode());
    }

    public final String toString() {
        return "WeChatPay(appId=" + this.f167665x + ", setupFutureUsage=" + this.f167666y + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167665x);
        EnumC38910o enumC38910o = this.f167666y;
        if (enumC38910o == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumC38910o.name());
        }
    }
}
