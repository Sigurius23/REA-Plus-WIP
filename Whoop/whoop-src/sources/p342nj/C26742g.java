package p342nj;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import l83.C23454a0;
import l83.InterfaceC23459e;
import p108e4.AbstractC12667a;
import p390p1.AbstractC28683x;
import p635y2.AbstractC39125q1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: nj.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C26742g extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC23459e f106355E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f106356w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f106357x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f106358y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f106359z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C26742g(Modifier modifier, InterfaceC23459e interfaceC23459e, int i13, int i14, int i15) {
        super(2);
        this.f106356w = i15;
        this.f106357x = modifier;
        this.f106355E = interfaceC23459e;
        this.f106358y = i13;
        this.f106359z = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f106356w;
        Composer composer = (Composer) obj;
        ((Number) obj2).intValue();
        switch (i13) {
            case 0:
                AbstractC12667a.m35451c(this.f106357x, (InterfaceC4339a) this.f106355E, composer, AbstractC28683x.m87244L(this.f106358y | 1), this.f106359z);
                break;
            default:
                AbstractC39125q1.m124656b(this.f106357x, (InterfaceC4351m) this.f106355E, composer, AbstractC28683x.m87244L(this.f106358y | 1), this.f106359z);
                break;
        }
        return C23454a0.f92919a;
    }
}
