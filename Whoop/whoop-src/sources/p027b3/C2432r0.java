package p027b3;

import androidx.compose.p018ui.node.Owner;
import androidx.compose.p018ui.platform.AndroidComposeView;
import androidx.compose.runtime.Composer;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import gb.C15664y;
import l83.C23454a0;
import p077d0.C11350f1;
import p114eb.C12982q;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: b3.r0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2432r0 extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9526w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f9527x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f9528y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f9529z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2432r0(Owner owner, InterfaceC2355b3 interfaceC2355b3, InterfaceC4351m interfaceC4351m, int i13) {
        super(2);
        this.f9526w = 1;
        this.f9528y = owner;
        this.f9529z = interfaceC2355b3;
        this.f9527x = interfaceC4351m;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9526w) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue();
                C28655q c28655q = (C28655q) composer;
                if (c28655q.m87135U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC2453v1.m7433a((AndroidComposeView) this.f9528y, (C2368e1) this.f9529z, (InterfaceC4351m) this.f9527x, c28655q, 0);
                } else {
                    c28655q.m87138X();
                }
                break;
            case 1:
                ((Number) obj2).intValue();
                AbstractC2453v1.m7433a((Owner) this.f9528y, (InterfaceC2355b3) this.f9529z, (InterfaceC4351m) this.f9527x, (Composer) obj, AbstractC28683x.m87244L(1));
                break;
            default:
                float fFloatValue = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                AbstractC3006f0.m8732z((InterfaceC2994c0) this.f9528y, null, null, new C15664y(fFloatValue, (C11350f1) this.f9529z, (C12982q) this.f9527x, null), 3);
                break;
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2432r0(Object obj, Object obj2, Object obj3, int i13) {
        super(2);
        this.f9526w = i13;
        this.f9528y = obj;
        this.f9529z = obj2;
        this.f9527x = obj3;
    }
}
