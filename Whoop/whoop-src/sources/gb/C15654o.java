package gb;

import androidx.lifecycle.EnumC1632v;
import androidx.lifecycle.InterfaceC1577e0;
import androidx.lifecycle.InterfaceC1585g0;
import java.util.List;
import p077d0.C11335b2;
import p114eb.C12982q;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: gb.o */
/* JADX INFO: loaded from: classes5.dex */
public final class C15654o extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C12982q f58752w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f58753x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ List f58754y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15654o(C12982q c12982q, List list, boolean z4) {
        super(1);
        this.f58752w = c12982q;
        this.f58753x = z4;
        this.f58754y = list;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        final C12982q c12982q = this.f58752w;
        final List list = this.f58754y;
        final boolean z4 = this.f58753x;
        InterfaceC1577e0 interfaceC1577e0 = new InterfaceC1577e0() { // from class: gb.n
            @Override // androidx.lifecycle.InterfaceC1577e0
            /* JADX INFO: renamed from: h */
            public final void mo4080h(InterfaceC1585g0 interfaceC1585g0, EnumC1632v enumC1632v) {
                boolean z13 = z4;
                List list2 = list;
                C12982q c12982q2 = c12982q;
                if (z13 && !list2.contains(c12982q2)) {
                    list2.add(c12982q2);
                }
                if (enumC1632v == EnumC1632v.ON_START && !list2.contains(c12982q2)) {
                    list2.add(c12982q2);
                }
                if (enumC1632v == EnumC1632v.ON_STOP) {
                    list2.remove(c12982q2);
                }
            }
        };
        c12982q.f44837H.mo4986a(interfaceC1577e0);
        return new C11335b2(1, c12982q, interfaceC1577e0);
    }
}
