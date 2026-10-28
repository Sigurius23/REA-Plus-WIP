package p140f8;

import android.os.Parcelable;
import androidx.health.platform.client.proto.AbstractC1433a;
import androidx.health.platform.client.proto.C1521r2;
import androidx.health.platform.client.proto.C1526s2;
import androidx.health.platform.client.proto.InterfaceC1544w0;
import p126eq.C13433b;
import p575w7.AbstractC36868a;

/* JADX INFO: renamed from: f8.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C14240c extends AbstractC36868a {
    public static final Parcelable.Creator<C14240c> CREATOR = new C13433b(6);

    /* JADX INFO: renamed from: x */
    public final InterfaceC1544w0 f52005x;

    public C14240c(InterfaceC1544w0 interfaceC1544w0) {
        this.f52005x = interfaceC1544w0;
    }

    @Override // p575w7.AbstractC36868a
    /* JADX INFO: renamed from: b */
    public final AbstractC1433a mo4557b() {
        C1521r2 c1521r2M4817r = C1526s2.m4817r();
        c1521r2M4817r.m4815c();
        C1526s2.m4816p((C1526s2) c1521r2M4817r.f6114x, this.f52005x);
        return (C1526s2) c1521r2M4817r.m4813a();
    }
}
