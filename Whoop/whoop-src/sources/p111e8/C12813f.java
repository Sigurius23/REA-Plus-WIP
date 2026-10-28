package p111e8;

import android.os.Parcelable;
import androidx.health.platform.client.proto.AbstractC1433a;
import androidx.health.platform.client.proto.C1501n2;
import androidx.health.platform.client.proto.C1506o2;
import java.util.List;
import p096dq.C12280x;
import p575w7.AbstractC36868a;

/* JADX INFO: renamed from: e8.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C12813f extends AbstractC36868a {
    public static final Parcelable.Creator<C12813f> CREATOR = new C12280x(28);

    /* JADX INFO: renamed from: x */
    public final Object f43852x;

    public C12813f(List list) {
        this.f43852x = list;
    }

    @Override // p575w7.AbstractC36868a
    /* JADX INFO: renamed from: b */
    public final AbstractC1433a mo4557b() {
        C1501n2 c1501n2M4786r = C1506o2.m4786r();
        Iterable iterable = (Iterable) this.f43852x;
        c1501n2M4786r.m4815c();
        C1506o2.m4785p((C1506o2) c1501n2M4786r.f6114x, iterable);
        return (C1506o2) c1501n2M4786r.m4813a();
    }
}
