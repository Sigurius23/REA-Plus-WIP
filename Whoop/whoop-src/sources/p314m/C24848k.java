package p314m;

import android.os.Bundle;
import e93.AbstractC12889b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import l83.C23465k;
import m83.AbstractC25265s;
import p399pb.C29047d;
import p399pb.InterfaceC29046c;

/* JADX INFO: renamed from: m.k */
/* JADX INFO: loaded from: classes.dex */
public final class C24848k implements InterfaceC29046c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f97339a;

    /* JADX INFO: renamed from: b */
    public final Object f97340b;

    public C24848k(C29047d c29047d) {
        this.f97339a = 1;
        this.f97340b = new LinkedHashSet();
        c29047d.m88293c("androidx.savedstate.Restarter", this);
    }

    @Override // p399pb.InterfaceC29046c
    /* JADX INFO: renamed from: a */
    public final Bundle mo4129a() {
        switch (this.f97339a) {
            case 0:
                Bundle bundle = new Bundle();
                ((AbstractActivityC24852m) this.f97340b).getDelegate().getClass();
                return bundle;
            default:
                Bundle bundleM36273g = AbstractC12889b.m36273g((C23465k[]) Arrays.copyOf(new C23465k[0], 0));
                List listM74093D1 = AbstractC25265s.m74093D1((LinkedHashSet) this.f97340b);
                bundleM36273g.putStringArrayList("classes_to_restore", listM74093D1 instanceof ArrayList ? (ArrayList) listM74093D1 : new ArrayList<>(listM74093D1));
                return bundleM36273g;
        }
    }

    public C24848k(AbstractActivityC24852m abstractActivityC24852m) {
        this.f97339a = 0;
        this.f97340b = abstractActivityC24852m;
    }
}
