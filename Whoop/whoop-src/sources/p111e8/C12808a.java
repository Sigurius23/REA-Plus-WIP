package p111e8;

import android.os.Parcelable;
import androidx.health.platform.client.proto.AbstractC1433a;
import androidx.health.platform.client.proto.C1451d2;
import androidx.health.platform.client.proto.C1456e2;
import java.util.List;
import p096dq.C12280x;
import p575w7.AbstractC36868a;

/* JADX INFO: renamed from: e8.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C12808a extends AbstractC36868a {
    public static final Parcelable.Creator<C12808a> CREATOR = new C12280x(23);

    /* JADX INFO: renamed from: x */
    public final Object f43842x;

    /* JADX INFO: renamed from: y */
    public final Object f43843y;

    public C12808a(List list, List list2) {
        this.f43842x = list;
        this.f43843y = list2;
    }

    @Override // p575w7.AbstractC36868a
    /* JADX INFO: renamed from: b */
    public final AbstractC1433a mo4557b() {
        C1451d2 c1451d2M4598t = C1456e2.m4598t();
        Iterable iterable = (Iterable) this.f43842x;
        c1451d2M4598t.m4815c();
        C1456e2.m4596p((C1456e2) c1451d2M4598t.f6114x, iterable);
        Iterable iterable2 = (Iterable) this.f43843y;
        c1451d2M4598t.m4815c();
        C1456e2.m4597q((C1456e2) c1451d2M4598t.f6114x, iterable2);
        return (C1456e2) c1451d2M4598t.m4813a();
    }
}
