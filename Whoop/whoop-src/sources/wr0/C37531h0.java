package wr0;

import p390p1.InterfaceC28593a1;
import p636y3.C39180l;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: wr0.h0 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C37531h0 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f160501w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28593a1 f160502x;

    public /* synthetic */ C37531h0(InterfaceC28593a1 interfaceC28593a1, int i13) {
        this.f160501w = i13;
        this.f160502x = interfaceC28593a1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f160501w) {
            case 0:
                return AbstractC37535j0.m120387q(this.f160502x, (C39180l) obj);
            case 1:
                return AbstractC37535j0.m120389s(this.f160502x, (C39180l) obj);
            case 2:
                return AbstractC37557u0.m120479A(this.f160502x, ((Integer) obj).intValue());
            default:
                return AbstractC37557u0.m120483E(this.f160502x, ((Integer) obj).intValue());
        }
    }
}
