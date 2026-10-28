package p401pj;

import bc3.InterfaceC2994c0;
import com.amplitude.android.engagement.types.TooltipFormFactor;
import p005a3.C0271z0;
import p328mj.C25609p;
import p390p1.C28624i0;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: pj.e0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C29266e0 extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ long f118431E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f118432F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f118433G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ InterfaceC28601c1 f118434H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C25609p f118435w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC2994c0 f118436x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f118437y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ TooltipFormFactor f118438z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29266e0(int i13, int i14, long j7, InterfaceC2994c0 interfaceC2994c0, TooltipFormFactor tooltipFormFactor, String str, C25609p c25609p, InterfaceC28601c1 interfaceC28601c1) {
        super(1);
        this.f118435w = c25609p;
        this.f118436x = interfaceC2994c0;
        this.f118437y = str;
        this.f118438z = tooltipFormFactor;
        this.f118431E = j7;
        this.f118432F = i13;
        this.f118433G = i14;
        this.f118434H = interfaceC28601c1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C28624i0 DisposableEffect = (C28624i0) obj;
        AbstractC22676k.m65750j(DisposableEffect, "$this$DisposableEffect");
        int i13 = this.f118433G;
        InterfaceC28601c1 interfaceC28601c1 = this.f118434H;
        int i14 = this.f118432F;
        long j7 = this.f118431E;
        InterfaceC2994c0 interfaceC2994c0 = this.f118436x;
        TooltipFormFactor tooltipFormFactor = this.f118438z;
        String str = this.f118437y;
        C25609p c25609p = this.f118435w;
        C29264d0 c29264d0 = new C29264d0(i14, i13, j7, interfaceC2994c0, tooltipFormFactor, str, c25609p, interfaceC28601c1);
        c25609p.f100471k.add(c29264d0);
        return new C29289w(new C0271z0(c25609p, c29264d0), 1);
    }
}
