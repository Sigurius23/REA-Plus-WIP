package p524ui;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import java.util.Map;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p426qi.C30387i;
import p635y2.InterfaceC39105k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: ui.j */
/* JADX INFO: loaded from: classes.dex */
public final class C34982j extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C34998z f148019E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ InterfaceC39105k f148020F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Map f148021G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ int f148022H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ int f148023I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ int f148024J;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f148025w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C30387i f148026x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC4339a f148027y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Modifier f148028z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C34982j(C30387i c30387i, InterfaceC4339a interfaceC4339a, Modifier modifier, C34998z c34998z, InterfaceC39105k interfaceC39105k, Map map, int i13, int i14, int i15, int i16) {
        super(2);
        this.f148025w = i16;
        this.f148026x = c30387i;
        this.f148027y = interfaceC4339a;
        this.f148028z = modifier;
        this.f148019E = c34998z;
        this.f148020F = interfaceC39105k;
        this.f148021G = map;
        this.f148022H = i13;
        this.f148023I = i14;
        this.f148024J = i15;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f148025w) {
            case 0:
                ((Number) obj2).intValue();
                AbstractC29125c.m88528f(this.f148026x, this.f148027y, this.f148028z, this.f148019E, this.f148020F, this.f148021G, (Composer) obj, AbstractC28683x.m87244L(this.f148022H | 1), AbstractC28683x.m87244L(this.f148023I), this.f148024J);
                break;
            default:
                ((Number) obj2).intValue();
                AbstractC29125c.m88528f(this.f148026x, this.f148027y, this.f148028z, this.f148019E, this.f148020F, this.f148021G, (Composer) obj, AbstractC28683x.m87244L(this.f148022H | 1), AbstractC28683x.m87244L(this.f148023I), this.f148024J);
                break;
        }
        return C23454a0.f92919a;
    }
}
