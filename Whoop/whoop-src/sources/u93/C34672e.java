package u93;

import jb3.C21561u;
import mb3.C25389f;
import p390p1.C28633k1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28650o2;
import p412q3.C29891y;
import p668z1.InterfaceC39965n;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: u93.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C34672e implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f146044w = 1;

    public C34672e() {
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object objInvoke;
        switch (this.f146044w) {
            case 0:
                ((C25389f) obj).getClass();
                return null;
            default:
                InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) obj;
                if (!(interfaceC28601c1 instanceof InterfaceC39965n)) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                InterfaceC39965n interfaceC39965n = (InterfaceC39965n) interfaceC28601c1;
                if (interfaceC39965n.getValue() != null) {
                    Object value = interfaceC39965n.getValue();
                    AbstractC22676k.m65747g(value);
                    objInvoke = ((Function1) C29891y.f122124d.f115463y).invoke(value);
                } else {
                    objInvoke = null;
                }
                InterfaceC28650o2 interfaceC28650o2Mo87021h = interfaceC39965n.mo87021h();
                AbstractC22676k.m65748h(interfaceC28650o2Mo87021h, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver?>");
                return new C28633k1(objInvoke, interfaceC28650o2Mo87021h);
        }
    }

    public C34672e(C21561u c21561u) {
    }
}
