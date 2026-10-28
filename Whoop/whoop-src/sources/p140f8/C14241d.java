package p140f8;

import android.os.Parcelable;
import androidx.health.platform.client.proto.AbstractC1433a;
import androidx.health.platform.client.proto.C1531t2;
import p126eq.C13433b;
import p575w7.AbstractC36868a;

/* JADX INFO: renamed from: f8.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C14241d extends AbstractC36868a {
    public static final Parcelable.Creator<C14241d> CREATOR = new C13433b(7);

    /* JADX INFO: renamed from: x */
    public final C1531t2 f52006x;

    public C14241d(C1531t2 c1531t2) {
        this.f52006x = c1531t2;
    }

    @Override // p575w7.AbstractC36868a
    /* JADX INFO: renamed from: b */
    public final AbstractC1433a mo4557b() {
        return this.f52006x;
    }
}
