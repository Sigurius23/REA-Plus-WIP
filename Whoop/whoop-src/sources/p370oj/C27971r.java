package p370oj;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p035bp.AbstractC3511b;
import p390p1.AbstractC28683x;
import p715kotlin.jvm.internal.AbstractC22680m;
import se.AbstractC32411b;

/* JADX INFO: renamed from: oj.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C27971r extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f112801w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f112802x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Modifier f112803y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f112804z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C27971r(String str, Modifier modifier, int i13, int i14) {
        super(2);
        this.f112801w = i14;
        this.f112802x = str;
        this.f112803y = modifier;
        this.f112804z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f112801w;
        Composer composer = (Composer) obj;
        ((Number) obj2).intValue();
        switch (i13) {
            case 0:
                AbstractC3511b.m10374c(this.f112802x, this.f112803y, composer, AbstractC28683x.m87244L(this.f112804z | 1));
                break;
            default:
                AbstractC32411b.m101109u(this.f112802x, this.f112803y, composer, AbstractC28683x.m87244L(this.f112804z | 1));
                break;
        }
        return C23454a0.f92919a;
    }
}
