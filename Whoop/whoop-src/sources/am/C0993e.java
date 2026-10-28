package am;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import o73.C27648a;
import p390p1.AbstractC28683x;
import p602x1.C37816b;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: am.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C0993e extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ EnumC0989a f3735E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ float f3736F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ EnumC0995g f3737G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ C37816b f3738H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Modifier f3739w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ EnumC0996h f3740x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ EnumC0995g f3741y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ float f3742z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0993e(Modifier modifier, EnumC0996h enumC0996h, EnumC0995g enumC0995g, float f13, EnumC0989a enumC0989a, float f14, EnumC0995g enumC0995g2, C37816b c37816b, int i13) {
        super(2);
        this.f3739w = modifier;
        this.f3740x = enumC0996h;
        this.f3741y = enumC0995g;
        this.f3742z = f13;
        this.f3735E = enumC0989a;
        this.f3736F = f14;
        this.f3737G = enumC0995g2;
        this.f3738H = c37816b;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iM87244L = AbstractC28683x.m87244L(12782983);
        C27648a.m83578b(this.f3739w, this.f3740x, this.f3741y, this.f3742z, this.f3735E, this.f3736F, this.f3737G, this.f3738H, (Composer) obj, iM87244L);
        return C23454a0.f92919a;
    }
}
