package sc2;

import p715kotlin.jvm.functions.Function1;
import p73.InterfaceC28961b;

/* JADX INFO: renamed from: sc2.u */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C32382u implements InterfaceC28961b {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f134086w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f134087x;

    public /* synthetic */ C32382u(Function1 function1, int i13) {
        this.f134086w = i13;
        this.f134087x = function1;
    }

    @Override // p73.InterfaceC28961b
    public final void accept(Object obj) {
        switch (this.f134086w) {
            case 0:
                C32380s.e.m100915j((C32381t) this.f134087x, obj);
                break;
            case 1:
                C32380s.m100852T0((C32381t) this.f134087x, obj);
                break;
            default:
                C32380s.m100856V0((C32381t) this.f134087x, obj);
                break;
        }
    }
}
