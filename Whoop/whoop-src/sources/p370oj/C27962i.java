package p370oj;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.amplitude.android.engagement.C4861a;
import com.amplitude.android.engagement.types.Nudge;
import l83.C23454a0;
import p026b2.C2320z;
import p390p1.C28655q;
import p390p1.InterfaceC28601c1;
import p602x1.AbstractC37817c;
import p715kotlin.jvm.internal.AbstractC22680m;
import x43.AbstractC37978j;

/* JADX INFO: renamed from: oj.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C27962i extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C4861a f112768E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ InterfaceC28601c1 f112769F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ InterfaceC4339a f112770G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Nudge f112771w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f112772x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C2320z f112773y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f112774z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27962i(Nudge nudge, boolean z4, C2320z c2320z, int i13, C4861a c4861a, InterfaceC28601c1 interfaceC28601c1, InterfaceC4339a interfaceC4339a) {
        super(2);
        this.f112771w = nudge;
        this.f112772x = z4;
        this.f112773y = c2320z;
        this.f112774z = i13;
        this.f112768E = c4861a;
        this.f112769F = interfaceC28601c1;
        this.f112770G = interfaceC4339a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 11) == 2) {
            C28655q c28655q = (C28655q) composer;
            if (c28655q.m87121F()) {
                c28655q.m87138X();
            } else {
                AbstractC37978j.m121650k(AbstractC37817c.m121341b(528284736, composer, new C27961h(this.f112771w, this.f112772x, this.f112773y, this.f112774z, this.f112768E, this.f112769F, this.f112770G)), composer, 6);
            }
        } else {
            AbstractC37978j.m121650k(AbstractC37817c.m121341b(528284736, composer, new C27961h(this.f112771w, this.f112772x, this.f112773y, this.f112774z, this.f112768E, this.f112769F, this.f112770G)), composer, 6);
        }
        return C23454a0.f92919a;
    }
}
