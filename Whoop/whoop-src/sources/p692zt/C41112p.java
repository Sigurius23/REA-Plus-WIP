package p692zt;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import p002a0.C0022g;
import p087db.C11856j0;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;
import z10.C39988k;
import zd3.C40580x;

/* JADX INFO: renamed from: zt.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C41112p extends AbstractC36219a {
    public static final Parcelable.Creator<C41112p> CREATOR = new C39988k(5);

    /* JADX INFO: renamed from: w */
    public final Bundle f177218w;

    /* JADX INFO: renamed from: x */
    public C0022g f177219x;

    /* JADX INFO: renamed from: y */
    public C11856j0 f177220y;

    public C41112p(Bundle bundle) {
        this.f177218w = bundle;
    }

    /* JADX INFO: renamed from: b */
    public final String m133445b() {
        return this.f177218w.getString("collapse_key");
    }

    /* JADX INFO: renamed from: f */
    public final Map m133446f() {
        if (this.f177219x == null) {
            C0022g c0022g = new C0022g(0);
            Bundle bundle = this.f177218w;
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        c0022g.put(str, str2);
                    }
                }
            }
            this.f177219x = c0022g;
        }
        return this.f177219x;
    }

    /* JADX INFO: renamed from: h */
    public final C11856j0 m133447h() {
        if (this.f177220y == null) {
            Bundle bundle = this.f177218w;
            if (C40580x.m131566n(bundle)) {
                this.f177220y = new C11856j0(new C40580x(bundle));
            }
        }
        return this.f177220y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115324e(parcel, 2, this.f177218w);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
