package v01;

import c93.InterfaceC4339a;
import com.whoop.analytics.AnalyticEventModel;
import ny0.C27256h;
import p715kotlin.jvm.functions.Function1;
import w01.AbstractC36682g;

/* JADX INFO: renamed from: v01.j */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C35508j implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f151116w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C27256h f151117x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ AnalyticEventModel f151118y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f151119z;

    public /* synthetic */ C35508j(C27256h c27256h, AnalyticEventModel analyticEventModel, Function1 function1, int i13) {
        this.f151116w = i13;
        this.f151117x = c27256h;
        this.f151118y = analyticEventModel;
        this.f151119z = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f151116w) {
            case 0:
                return AbstractC35510l.m112635K(this.f151117x, this.f151118y, this.f151119z);
            default:
                return AbstractC36682g.m117727O(this.f151117x, this.f151118y, this.f151119z);
        }
    }
}
