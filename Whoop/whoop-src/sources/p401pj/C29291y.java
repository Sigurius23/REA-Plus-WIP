package p401pj;

import bc3.InterfaceC2994c0;
import com.amplitude.android.engagement.types.Nudge;
import com.amplitude.android.engagement.types.NudgeStep;
import p005a3.C0271z0;
import p328mj.C25609p;
import p390p1.C28624i0;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: pj.y */
/* JADX INFO: loaded from: classes6.dex */
public final class C29291y extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ String f118536E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ InterfaceC28601c1 f118537F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C25609p f118538w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Nudge f118539x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ NudgeStep f118540y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC2994c0 f118541z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29291y(InterfaceC2994c0 interfaceC2994c0, Nudge nudge, NudgeStep nudgeStep, String str, C25609p c25609p, InterfaceC28601c1 interfaceC28601c1) {
        super(1);
        this.f118538w = c25609p;
        this.f118539x = nudge;
        this.f118540y = nudgeStep;
        this.f118541z = interfaceC2994c0;
        this.f118536E = str;
        this.f118537F = interfaceC28601c1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C28624i0 DisposableEffect = (C28624i0) obj;
        AbstractC22676k.m65750j(DisposableEffect, "$this$DisposableEffect");
        String str = this.f118536E;
        InterfaceC28601c1 interfaceC28601c1 = this.f118537F;
        InterfaceC2994c0 interfaceC2994c0 = this.f118541z;
        Nudge nudge = this.f118539x;
        NudgeStep nudgeStep = this.f118540y;
        C25609p c25609p = this.f118538w;
        C29290x c29290x = new C29290x(interfaceC2994c0, nudge, nudgeStep, str, c25609p, interfaceC28601c1);
        c25609p.f100471k.add(c29290x);
        return new C29289w(new C0271z0(c25609p, c29290x), 0);
    }
}
