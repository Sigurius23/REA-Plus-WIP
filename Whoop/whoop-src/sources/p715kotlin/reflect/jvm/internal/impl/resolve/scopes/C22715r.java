package p715kotlin.reflect.jvm.internal.impl.resolve.scopes;

import c93.InterfaceC4339a;
import jb3.C21548h;
import m83.C25271y;
import wb3.AbstractC37056f;
import ya3.AbstractC39373p;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C22715r implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f89380w;

    /* JADX INFO: renamed from: x */
    public final C22716s f89381x;

    public /* synthetic */ C22715r(C22716s c22716s, int i13) {
        this.f89380w = i13;
        this.f89381x = c22716s;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f89380w) {
            case 0:
                C21548h c21548h = this.f89381x.f89383b;
                return AbstractC37056f.m118959K(AbstractC39373p.m125574h(c21548h), AbstractC39373p.m125575i(c21548h));
            default:
                C22716s c22716s = this.f89381x;
                return c22716s.f89384c ? AbstractC37056f.m118960L(AbstractC39373p.m125573g(c22716s.f89383b)) : C25271y.f99162w;
        }
    }
}
