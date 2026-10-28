package p111e8;

import android.os.Parcelable;
import androidx.health.platform.client.proto.AbstractC1433a;
import androidx.health.platform.client.proto.C1466g2;
import p096dq.C12280x;
import p575w7.AbstractC36868a;

/* JADX INFO: renamed from: e8.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C12809b extends AbstractC36868a {
    public static final Parcelable.Creator<C12809b> CREATOR = new C12280x(24);

    /* JADX INFO: renamed from: x */
    public final C1466g2 f43844x;

    public C12809b(C1466g2 c1466g2) {
        this.f43844x = c1466g2;
    }

    @Override // p575w7.AbstractC36868a
    /* JADX INFO: renamed from: b */
    public final AbstractC1433a mo4557b() {
        return this.f43844x;
    }
}
