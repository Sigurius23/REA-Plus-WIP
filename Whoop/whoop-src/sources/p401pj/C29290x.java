package p401pj;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import com.amplitude.android.engagement.C4861a;
import com.amplitude.android.engagement.types.Nudge;
import com.amplitude.android.engagement.types.NudgeStep;
import l83.C23454a0;
import p328mj.C25609p;
import p33.C28820m;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.internal.AbstractC22680m;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: pj.x */
/* JADX INFO: loaded from: classes6.dex */
public final class C29290x extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C25609p f118530E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ InterfaceC28601c1 f118531F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Nudge f118532w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ NudgeStep f118533x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC2994c0 f118534y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ String f118535z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29290x(InterfaceC2994c0 interfaceC2994c0, Nudge nudge, NudgeStep nudgeStep, String str, C25609p c25609p, InterfaceC28601c1 interfaceC28601c1) {
        super(0);
        this.f118532w = nudge;
        this.f118533x = nudgeStep;
        this.f118534y = interfaceC2994c0;
        this.f118535z = str;
        this.f118530E = c25609p;
        this.f118531F = interfaceC28601c1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        C4861a.f20259o.m16031I("Repositioning Nudge " + this.f118532w.getVariantId() + " for step: " + this.f118533x.getTitle());
        AbstractC3006f0.m8732z(this.f118534y, null, null, new C28820m(this.f118535z, this.f118530E, this.f118531F, (InterfaceC30057d) null, 3), 3);
        return C23454a0.f92919a;
    }
}
