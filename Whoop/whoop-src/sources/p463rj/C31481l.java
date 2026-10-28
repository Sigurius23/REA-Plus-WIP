package p463rj;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p525uj.C35031i;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: rj.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C31481l extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Modifier f129715E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ String f129716w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f129717x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ AbstractC22680m f129718y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C35031i f129719z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C31481l(String str, boolean z4, InterfaceC4339a interfaceC4339a, C35031i c35031i, Modifier modifier, int i13) {
        super(2);
        this.f129716w = str;
        this.f129717x = z4;
        this.f129718y = (AbstractC22680m) interfaceC4339a;
        this.f129719z = c35031i;
        this.f129715E = modifier;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [c93.a, kotlin.jvm.internal.m] */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iM87244L = AbstractC28683x.m87244L(1);
        AbstractC31484o.m96951c(this.f129716w, this.f129717x, this.f129718y, this.f129719z, this.f129715E, (Composer) obj, iM87244L);
        return C23454a0.f92919a;
    }
}
