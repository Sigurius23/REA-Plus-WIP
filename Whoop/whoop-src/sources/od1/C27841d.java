package od1;

import bh3.InterfaceC3260g;
import com.whoop.service.network.model.Sport;
import com.whoop.service.network.model.cycles.Workout;
import pg3.C29218v0;

/* JADX INFO: renamed from: od1.d */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C27841d implements InterfaceC3260g {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f112146w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C27843f f112147x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Workout f112148y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Sport f112149z;

    public /* synthetic */ C27841d(C27843f c27843f, Workout workout, Sport sport, int i13) {
        this.f112146w = i13;
        this.f112147x = c27843f;
        this.f112148y = workout;
        this.f112149z = sport;
    }

    @Override // bh3.InterfaceC3260g
    /* JADX INFO: renamed from: b */
    public final Object mo1678b(Object obj) {
        switch (this.f112146w) {
            case 0:
                return this.f112147x.m83939f(this.f112148y, this.f112149z, (C29218v0) obj);
            default:
                return this.f112147x.m83938e(this.f112148y, this.f112149z, (C29218v0) obj);
        }
    }
}
