package p294l3;

import c93.InterfaceC4351m;
import p634y1.C39029b;
import p634y1.InterfaceC39037j;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: l3.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class C23263k0 implements InterfaceC39037j {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ InterfaceC4351m f92158w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f92159x;

    public C23263k0(InterfaceC4351m interfaceC4351m, Function1 function1) {
        this.f92158w = interfaceC4351m;
        this.f92159x = function1;
    }

    @Override // p634y1.InterfaceC39037j
    /* JADX INFO: renamed from: a */
    public final Object mo67322a(C39029b c39029b, Object obj) {
        return this.f92158w.invoke(c39029b, obj);
    }

    @Override // p634y1.InterfaceC39037j
    /* JADX INFO: renamed from: c */
    public final Object mo67323c(Object obj) {
        return this.f92159x.invoke(obj);
    }
}
