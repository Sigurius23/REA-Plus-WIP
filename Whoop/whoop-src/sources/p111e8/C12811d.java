package p111e8;

import android.os.Parcelable;
import androidx.health.platform.client.proto.AbstractC1433a;
import androidx.health.platform.client.proto.C1486k2;
import p096dq.C12280x;
import p575w7.AbstractC36868a;

/* JADX INFO: renamed from: e8.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C12811d extends AbstractC36868a {
    public static final Parcelable.Creator<C12811d> CREATOR = new C12280x(26);

    /* JADX INFO: renamed from: x */
    public final C1486k2 f43846x;

    public C12811d(C1486k2 c1486k2) {
        this.f43846x = c1486k2;
    }

    @Override // p575w7.AbstractC36868a
    /* JADX INFO: renamed from: b */
    public final AbstractC1433a mo4557b() {
        return this.f43846x;
    }
}
