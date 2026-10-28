package p111e8;

import android.os.Parcelable;
import androidx.health.platform.client.proto.AbstractC1433a;
import androidx.health.platform.client.proto.C1476i2;
import p096dq.C12280x;
import p575w7.AbstractC36868a;

/* JADX INFO: renamed from: e8.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C12810c extends AbstractC36868a {
    public static final Parcelable.Creator<C12810c> CREATOR = new C12280x(25);

    /* JADX INFO: renamed from: x */
    public final C1476i2 f43845x;

    public C12810c(C1476i2 c1476i2) {
        this.f43845x = c1476i2;
    }

    @Override // p575w7.AbstractC36868a
    /* JADX INFO: renamed from: b */
    public final AbstractC1433a mo4557b() {
        return this.f43845x;
    }
}
