package p370oj;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p602x1.C37816b;
import p715kotlin.jvm.internal.AbstractC22680m;
import x43.AbstractC37978j;

/* JADX INFO: renamed from: oj.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C27964k extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C37816b f112777w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f112778x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27964k(C37816b c37816b, int i13) {
        super(2);
        this.f112777w = c37816b;
        this.f112778x = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iM87244L = AbstractC28683x.m87244L(this.f112778x | 1);
        AbstractC37978j.m121650k(this.f112777w, (Composer) obj, iM87244L);
        return C23454a0.f92919a;
    }
}
