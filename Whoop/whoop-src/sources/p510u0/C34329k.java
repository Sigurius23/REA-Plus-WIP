package p510u0;

import l83.C23454a0;
import p077d0.C11335b2;
import p294l3.C23277r0;
import p668z1.C39967p;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: u0.k */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C34329k implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f144150w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C34352r1 f144151x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f144152y;

    public /* synthetic */ C34329k(C34352r1 c34352r1, Function1 function1, int i13) {
        this.f144150w = i13;
        this.f144151x = c34352r1;
        this.f144152y = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f144150w) {
            case 0:
                C23277r0 c23277r0 = (C23277r0) obj;
                C34352r1 c34352r1 = this.f144151x;
                if (c34352r1 != null) {
                    c34352r1.f144301a.setValue(c23277r0);
                }
                Function1 function1 = this.f144152y;
                if (function1 != null) {
                    function1.invoke(c23277r0);
                }
                return C23454a0.f92919a;
            default:
                C34352r1 c34352r2 = this.f144151x;
                C39967p c39967p = c34352r2.f144303c;
                Function1 function2 = this.f144152y;
                c39967p.add(function2);
                return new C11335b2(6, c34352r2, function2);
        }
    }
}
