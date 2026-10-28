package p140f8;

import android.os.Parcelable;
import androidx.health.platform.client.proto.AbstractC1433a;
import androidx.health.platform.client.proto.C1511p2;
import p126eq.C13433b;
import p575w7.AbstractC36868a;

/* JADX INFO: renamed from: f8.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C14238a extends AbstractC36868a {
    public static final Parcelable.Creator<C14238a> CREATOR = new C13433b(4);

    /* JADX INFO: renamed from: x */
    public final C1511p2 f52003x;

    public C14238a(C1511p2 c1511p2) {
        this.f52003x = c1511p2;
    }

    @Override // p575w7.AbstractC36868a
    /* JADX INFO: renamed from: b */
    public final AbstractC1433a mo4557b() {
        return this.f52003x;
    }
}
