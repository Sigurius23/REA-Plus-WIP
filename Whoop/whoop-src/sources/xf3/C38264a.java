package xf3;

import c93.InterfaceC4339a;
import j93.InterfaceC21461d;
import p715kotlin.jvm.internal.AbstractC22680m;
import vf3.InterfaceC35951a;

/* JADX INFO: renamed from: xf3.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C38264a extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C38266c f164051w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC35951a f164052x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC21461d f164053y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC4339a f164054z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38264a(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC21461d interfaceC21461d, InterfaceC4339a interfaceC4339a) {
        super(0);
        this.f164051w = c38266c;
        this.f164052x = interfaceC35951a;
        this.f164053y = interfaceC21461d;
        this.f164054z = interfaceC4339a;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        InterfaceC21461d interfaceC21461d = this.f164053y;
        return this.f164051w.m122605d(this.f164054z, interfaceC21461d, this.f164052x);
    }
}
