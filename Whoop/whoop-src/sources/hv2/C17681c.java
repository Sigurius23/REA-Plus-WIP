package hv2;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: hv2.c */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C17681c implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f68579w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f68580x;

    public /* synthetic */ C17681c(Function1 function1, int i13) {
        this.f68579w = i13;
        this.f68580x = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f68579w) {
            case 0:
                return AbstractC17687i.m50531x0(this.f68580x);
            default:
                return AbstractC17687i.m50460G0(this.f68580x);
        }
    }
}
