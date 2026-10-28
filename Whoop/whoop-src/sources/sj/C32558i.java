package sj;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: sj.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C32558i extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f134886E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f134887w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C32561l f134888x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Modifier f134889y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f134890z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C32558i(C32561l c32561l, Modifier modifier, int i13, int i14, int i15) {
        super(2);
        this.f134887w = i15;
        this.f134888x = c32561l;
        this.f134889y = modifier;
        this.f134890z = i13;
        this.f134886E = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f134887w;
        Composer composer = (Composer) obj;
        ((Number) obj2).intValue();
        switch (i13) {
            case 0:
                this.f134888x.m101584d(this.f134889y, AbstractC28683x.m87244L(this.f134890z | 1), composer, this.f134886E);
                break;
            default:
                this.f134888x.m101586f(this.f134889y, AbstractC28683x.m87244L(this.f134890z | 1), composer, this.f134886E);
                break;
        }
        return C23454a0.f92919a;
    }
}
