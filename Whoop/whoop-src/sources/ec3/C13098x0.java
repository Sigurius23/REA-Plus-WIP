package ec3;

import kotlinx.coroutines.flow.internal.AbortFlowException;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: ec3.x0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13098x0 implements InterfaceC13062m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f45263w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C22669g0 f45264x;

    public /* synthetic */ C13098x0(C22669g0 c22669g0, int i13) {
        this.f45263w = i13;
        this.f45264x = c22669g0;
    }

    @Override // ec3.InterfaceC13062m
    public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f45263w) {
            case 0:
                this.f45264x.f89336w = obj;
                throw new AbortFlowException(this);
            default:
                this.f45264x.f89336w = obj;
                throw new AbortFlowException(this);
        }
    }
}
