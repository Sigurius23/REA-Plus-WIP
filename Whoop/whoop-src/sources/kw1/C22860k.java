package kw1;

import c93.InterfaceC4339a;
import com.whoop.membership.extensions.domain.models.ProgressContent;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: kw1.k */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C22860k implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f90120w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ProgressContent f90121x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f90122y;

    public /* synthetic */ C22860k(ProgressContent progressContent, Function1 function1, int i13) {
        this.f90120w = i13;
        this.f90121x = progressContent;
        this.f90122y = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f90120w) {
            case 0:
                return AbstractC22862m.m66397g(this.f90122y, this.f90121x);
            case 1:
                return AbstractC22862m.m66398h(this.f90121x, this.f90122y);
            case 2:
                return AbstractC22863n.m66406g(this.f90122y, this.f90121x);
            case 3:
                return AbstractC22863n.m66407h(this.f90121x, this.f90122y);
            case 4:
                return AbstractC22867r.m66416g(this.f90122y, this.f90121x);
            case 5:
                return AbstractC22867r.m66417h(this.f90121x, this.f90122y);
            default:
                return AbstractC22871v.m66453j(this.f90121x, this.f90122y);
        }
    }

    public /* synthetic */ C22860k(Function1 function1, ProgressContent progressContent, int i13) {
        this.f90120w = i13;
        this.f90122y = function1;
        this.f90121x = progressContent;
    }
}
