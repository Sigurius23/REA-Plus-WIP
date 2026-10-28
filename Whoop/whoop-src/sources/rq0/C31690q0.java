package rq0;

import com.whoop.domain.model.teams.TeamUserListing;
import p217ib.AbstractC18317n;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: rq0.q0 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C31690q0 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f131214w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C31696t0 f131215x;

    public /* synthetic */ C31690q0(C31696t0 c31696t0, int i13) {
        this.f131214w = i13;
        this.f131215x = c31696t0;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f131214w) {
            case 0:
                return C31696t0.m98263y0(this.f131215x, (AbstractC18317n) obj);
            case 1:
                return C31696t0.m98255q0(this.f131215x, (C31674i1) obj);
            default:
                return C31696t0.m98258t0(this.f131215x, (TeamUserListing) obj);
        }
    }
}
