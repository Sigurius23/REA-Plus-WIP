package p463rj;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p525uj.C35031i;
import p602x1.C37816b;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: rj.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C31483n extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C37816b f129722E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f129723F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ boolean f129724w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC22680m f129725x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C35031i f129726y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Modifier f129727z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C31483n(boolean z4, InterfaceC4339a interfaceC4339a, C35031i c35031i, Modifier modifier, C37816b c37816b, int i13) {
        super(2);
        this.f129724w = z4;
        this.f129725x = (AbstractC22680m) interfaceC4339a;
        this.f129726y = c35031i;
        this.f129727z = modifier;
        this.f129722E = c37816b;
        this.f129723F = i13;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [c93.a, kotlin.jvm.internal.m] */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AbstractC31484o.m96954f(this.f129724w, this.f129725x, this.f129726y, this.f129727z, this.f129722E, (Composer) obj, AbstractC28683x.m87244L(this.f129723F | 1));
        return C23454a0.f92919a;
    }
}
