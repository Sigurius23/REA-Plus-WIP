package p370oj;

import androidx.compose.runtime.Composer;
import l83.C23454a0;
import p291l0.InterfaceC23013y;
import p390p1.C28655q;
import p602x1.C37816b;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: oj.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C27963j extends AbstractC22680m implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C37816b f112775w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f112776x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27963j(C37816b c37816b, int i13) {
        super(3);
        this.f112775w = c37816b;
        this.f112776x = i13;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC23013y Card = (InterfaceC23013y) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC22676k.m65750j(Card, "$this$Card");
        if ((iIntValue & 81) == 16) {
            C28655q c28655q = (C28655q) composer;
            if (c28655q.m87121F()) {
                c28655q.m87138X();
            } else {
                this.f112775w.invoke(composer, Integer.valueOf(this.f112776x & 14));
            }
        } else {
            this.f112775w.invoke(composer, Integer.valueOf(this.f112776x & 14));
        }
        return C23454a0.f92919a;
    }
}
