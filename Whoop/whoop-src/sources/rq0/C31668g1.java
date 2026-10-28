package rq0;

import com.whoop.domain.model.teams.LeadersEntry;
import com.whoop.p069ui.ScoreContext;
import hq0.C17561a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: rq0.g1 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C31668g1 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f130999w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C31671h1 f131000x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ ScoreContext f131001y;

    public /* synthetic */ C31668g1(C31671h1 c31671h1, ScoreContext scoreContext, int i13) {
        this.f130999w = i13;
        this.f131000x = c31671h1;
        this.f131001y = scoreContext;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f130999w) {
            case 0:
                return C31671h1.m98013r0(this.f131000x, this.f131001y, (LeadersEntry) obj);
            default:
                return C31671h1.m98006R(this.f131000x, this.f131001y, (C17561a) obj);
        }
    }
}
