package sj;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: sj.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C32556g extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f134881w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C32561l f134882x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C32556g(C32561l c32561l, int i13, int i14) {
        super(2);
        this.f134881w = i14;
        this.f134882x = c32561l;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f134881w;
        Composer composer = (Composer) obj;
        ((Number) obj2).intValue();
        switch (i13) {
            case 0:
                this.f134882x.m101581a(composer, AbstractC28683x.m87244L(9));
                break;
            case 1:
                this.f134882x.m101583c(composer, AbstractC28683x.m87244L(9));
                break;
            default:
                this.f134882x.m101587g(composer, AbstractC28683x.m87244L(9));
                break;
        }
        return C23454a0.f92919a;
    }
}
