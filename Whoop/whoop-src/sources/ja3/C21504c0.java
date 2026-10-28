package ja3;

import java.util.Collection;
import java.util.Set;
import l83.C23454a0;
import p484s9.AbstractC32281f;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o;
import r93.InterfaceC31117e;

/* JADX INFO: renamed from: ja3.c0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C21504c0 extends AbstractC32281f {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ InterfaceC31117e f82478w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Set f82479x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f82480y;

    public C21504c0(InterfaceC31117e interfaceC31117e, Set set, Function1 function1) {
        this.f82478w = interfaceC31117e;
        this.f82479x = set;
        this.f82480y = function1;
    }

    @Override // p484s9.AbstractC32281f
    /* JADX INFO: renamed from: q */
    public final boolean mo13801q(Object obj) {
        InterfaceC31117e current = (InterfaceC31117e) obj;
        AbstractC22676k.m65750j(current, "current");
        if (current == this.f82478w) {
            return true;
        }
        InterfaceC22712o interfaceC22712oMo60494V = current.mo60494V();
        AbstractC22676k.m65749i(interfaceC22712oMo60494V, "getStaticScope(...)");
        if (!(interfaceC22712oMo60494V instanceof AbstractC21508e0)) {
            return true;
        }
        this.f82479x.addAll((Collection) this.f82480y.invoke(interfaceC22712oMo60494V));
        return false;
    }

    @Override // p484s9.AbstractC32281f
    /* JADX INFO: renamed from: y */
    public final /* bridge */ /* synthetic */ Object mo13802y() {
        return C23454a0.f92919a;
    }
}
