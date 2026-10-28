package hy0;

import coil.compose.AsyncImagePainter$State$Success;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: hy0.m */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C17767m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f69092w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28601c1 f69093x;

    public /* synthetic */ C17767m(int i13, InterfaceC28601c1 interfaceC28601c1) {
        this.f69092w = i13;
        this.f69093x = interfaceC28601c1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f69092w) {
            case 0:
                return AbstractC17770n.m51031x(this.f69093x, (AsyncImagePainter$State$Success) obj);
            default:
                return AbstractC17781q1.m51088p(this.f69093x, ((Float) obj).floatValue());
        }
    }
}
