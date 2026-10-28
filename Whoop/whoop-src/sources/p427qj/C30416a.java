package p427qj;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.amplitude.android.engagement.types.ButtonBlock;
import com.amplitude.android.engagement.types.ButtonType;
import l83.C23454a0;
import l83.InterfaceC23459e;
import p390p1.AbstractC28683x;
import p525uj.AbstractC35027e;
import p525uj.AbstractC35033k;
import p525uj.C35035m;
import p602x1.C37816b;
import p715kotlin.jvm.internal.AbstractC22680m;
import se.AbstractC32410a;
import sj.C32555f;

/* JADX INFO: renamed from: qj.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C30416a extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f124830w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f124831x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f124832y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC23459e f124833z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C30416a(Object obj, boolean z4, InterfaceC23459e interfaceC23459e, int i13, int i14) {
        super(2);
        this.f124830w = i14;
        this.f124832y = obj;
        this.f124831x = z4;
        this.f124833z = interfaceC23459e;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f124830w;
        Composer composer = (Composer) obj;
        ((Number) obj2).intValue();
        switch (i13) {
            case 0:
                AbstractC32410a.m101024d((ButtonBlock) this.f124832y, this.f124831x, (C32555f) this.f124833z, composer, AbstractC28683x.m87244L(9));
                break;
            case 1:
                AbstractC35027e.m110696a((ButtonType) this.f124832y, this.f124831x, (C37816b) this.f124833z, composer, AbstractC28683x.m87244L(385));
                break;
            default:
                AbstractC35033k.m110709a((C35035m) this.f124832y, this.f124831x, (C37816b) this.f124833z, composer, AbstractC28683x.m87244L(385));
                break;
        }
        return C23454a0.f92919a;
    }
}
