package kw1;

import c93.InterfaceC4339a;
import com.whoop.membership.extensions.domain.models.ProgressContent;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: kw1.u */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C22870u implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f90135w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f90136x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f90137y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ ProgressContent f90138z;

    public /* synthetic */ C22870u(Function1 function1, boolean z4, ProgressContent progressContent) {
        this.f90136x = function1;
        this.f90137y = z4;
        this.f90138z = progressContent;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f90135w) {
            case 0:
                return AbstractC22871v.m66451h(this.f90137y, this.f90136x, this.f90138z);
            default:
                return AbstractC22871v.m66452i(this.f90136x, this.f90137y, this.f90138z);
        }
    }

    public /* synthetic */ C22870u(boolean z4, Function1 function1, ProgressContent progressContent) {
        this.f90137y = z4;
        this.f90136x = function1;
        this.f90138z = progressContent;
    }
}
