package sj;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: sj.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C32559j extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C32561l f134891w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f134892x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f134893y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32559j(C32561l c32561l, int i13, int i14, int i15) {
        super(2);
        this.f134891w = c32561l;
        this.f134892x = i13;
        this.f134893y = i15;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iM87244L = AbstractC28683x.m87244L(65);
        int i13 = this.f134893y;
        this.f134891w.m101585e(this.f134892x, iM87244L, (Composer) obj, i13);
        return C23454a0.f92919a;
    }
}
