package d30;

import h20.C16687l;
import h20.C16776z4;
import l83.C23454a0;
import p479s4.AbstractC32128i;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import u00.C34378f;
import v00.C35459c0;

/* JADX INFO: renamed from: d30.g */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C11532g implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f37158w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C16776z4 f37159x;

    public /* synthetic */ C11532g(C16776z4 c16776z4, int i13) {
        this.f37158w = i13;
        this.f37159x = c16776z4;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [ec3.f2, java.lang.Object] */
    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C34378f c34378fM112534R;
        switch (this.f37158w) {
            case 0:
                C16687l it = (C16687l) obj;
                AbstractC22676k.m65750j(it, "it");
                this.f37159x.m47285f(it);
                return C23454a0.f92919a;
            default:
                String str = (String) obj;
                C35459c0 c35459c0 = (C35459c0) this.f37159x.f64482a.getValue();
                InterfaceC41211c interfaceC41211cM100061p = null;
                if (c35459c0 != null) {
                    if (str != null && (c34378fM112534R = c35459c0.m112534R(str)) != null) {
                        interfaceC41211cM100061p = c34378fM112534R.f144469c;
                    }
                    interfaceC41211cM100061p = AbstractC32128i.m100061p(interfaceC41211cM100061p);
                }
                return AbstractC32128i.m100061p(interfaceC41211cM100061p);
        }
    }
}
