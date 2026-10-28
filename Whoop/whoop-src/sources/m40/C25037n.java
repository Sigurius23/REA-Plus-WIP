package m40;

import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4352n;
import com.stripe.android.uicore.image.StripeImageState$Success;
import l83.C23454a0;
import p026b2.InterfaceC2302h;
import p040c0.InterfaceC3764o;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17921y;
import p291l0.InterfaceC23004v;
import p390p1.C28655q;
import p635y2.InterfaceC39105k;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: m40.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C25037n implements InterfaceC4352n {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC2302h f98081E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ InterfaceC39105k f98082F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ AbstractC17921y f98083G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Function3 f98084w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC23004v f98085x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function3 f98086y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Modifier f98087z;

    public C25037n(Function3 function3, InterfaceC23004v interfaceC23004v, Function3 function4, Modifier modifier, InterfaceC2302h interfaceC2302h, InterfaceC39105k interfaceC39105k, AbstractC17921y abstractC17921y) {
        this.f98084w = function3;
        this.f98085x = interfaceC23004v;
        this.f98086y = function4;
        this.f98087z = modifier;
        this.f98081E = interfaceC2302h;
        this.f98082F = interfaceC39105k;
        this.f98083G = abstractC17921y;
    }

    @Override // c93.InterfaceC4352n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        InterfaceC3764o AnimatedContent = (InterfaceC3764o) obj;
        AbstractC25048y it = (AbstractC25048y) obj2;
        Composer composer = (Composer) obj3;
        ((Number) obj4).intValue();
        AbstractC22676k.m65750j(AnimatedContent, "$this$AnimatedContent");
        AbstractC22676k.m65750j(it, "it");
        boolean zEquals = it.equals(C25047x.f98137a);
        InterfaceC23004v interfaceC23004v = this.f98085x;
        if (zEquals) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(-1892457249);
            this.f98084w.invoke(interfaceC23004v, c28655q, 0);
            c28655q.m87173q(false);
        } else if (it.equals(C25047x.f98138b)) {
            C28655q c28655q2 = (C28655q) composer;
            c28655q2.m87150e0(-1892455903);
            this.f98086y.invoke(interfaceC23004v, c28655q2, 0);
            c28655q2.m87173q(false);
        } else {
            if (!(it instanceof StripeImageState$Success)) {
                throw AbstractC11895b.m32003v(-1892457968, (C28655q) composer, false);
            }
            C28655q c28655q3 = (C28655q) composer;
            c28655q3.m87150e0(1463465790);
            AbstractC29125c.m88522c(((StripeImageState$Success) it).getPainter(), null, AbstractC1136a.m3599a(this.f98087z, "StripeImageFromUrl"), this.f98081E, this.f98082F, 0.0f, this.f98083G, c28655q3, 0, 32);
            c28655q3.m87173q(false);
        }
        return C23454a0.f92919a;
    }
}
