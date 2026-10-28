package p93;

import java.util.List;
import kb3.C22342k;
import m83.C25271y;
import p097ds.AbstractC12313p;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22706i;
import r93.InterfaceC31117e;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: p93.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C29026e extends AbstractC22706i {
    public C29026e(C22342k c22342k, C29024c c29024c) {
        super(c22342k, c29024c);
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22706i
    public final List computeDeclaredFunctions() {
        InterfaceC31117e containingClass = getContainingClass();
        AbstractC22676k.m65748h(containingClass, "null cannot be cast to non-null type org.jetbrains.kotlin.builtins.functions.FunctionClassDescriptor");
        AbstractC29032k abstractC29032k = ((C29024c) containingClass).f117491G;
        if (AbstractC22676k.m65745e(abstractC29032k, C29028g.f117498c)) {
            return AbstractC37056f.m118958J(AbstractC12313p.m34308z((C29024c) getContainingClass(), false));
        }
        return AbstractC22676k.m65745e(abstractC29032k, C29031j.f117501c) ? AbstractC37056f.m118958J(AbstractC12313p.m34308z((C29024c) getContainingClass(), true)) : C25271y.f99162w;
    }
}
