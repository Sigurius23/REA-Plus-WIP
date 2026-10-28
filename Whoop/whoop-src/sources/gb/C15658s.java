package gb;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p098dt.AbstractC12350b;
import p390p1.AbstractC28683x;
import p602x1.C37816b;
import p634y1.InterfaceC39030c;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: gb.s */
/* JADX INFO: loaded from: classes.dex */
public final class C15658s extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ InterfaceC39030c f58761w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C37816b f58762x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f58763y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15658s(InterfaceC39030c interfaceC39030c, C37816b c37816b, int i13) {
        super(2);
        this.f58761w = interfaceC39030c;
        this.f58762x = c37816b;
        this.f58763y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iM87244L = AbstractC28683x.m87244L(this.f58763y | 1);
        AbstractC12350b.m34584e(this.f58761w, this.f58762x, (Composer) obj, iM87244L);
        return C23454a0.f92919a;
    }
}
