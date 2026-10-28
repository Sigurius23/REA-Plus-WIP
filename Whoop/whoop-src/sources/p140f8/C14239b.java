package p140f8;

import android.os.Parcelable;
import androidx.health.platform.client.proto.AbstractC1433a;
import androidx.health.platform.client.proto.C1516q2;
import p126eq.C13433b;
import p575w7.AbstractC36868a;

/* JADX INFO: renamed from: f8.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C14239b extends AbstractC36868a {
    public static final Parcelable.Creator<C14239b> CREATOR = new C13433b(5);

    /* JADX INFO: renamed from: x */
    public final C1516q2 f52004x;

    public C14239b(C1516q2 c1516q2) {
        this.f52004x = c1516q2;
    }

    @Override // p575w7.AbstractC36868a
    /* JADX INFO: renamed from: b */
    public final AbstractC1433a mo4557b() {
        return this.f52004x;
    }
}
