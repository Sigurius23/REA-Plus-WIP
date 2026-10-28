package p401pj;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import com.amplitude.android.engagement.types.TooltipFormFactor;
import l83.C23454a0;
import p328mj.C25609p;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: pj.d0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C29264d0 extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ long f118422E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f118423F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f118424G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ InterfaceC28601c1 f118425H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ InterfaceC2994c0 f118426w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C25609p f118427x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f118428y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ TooltipFormFactor f118429z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29264d0(int i13, int i14, long j7, InterfaceC2994c0 interfaceC2994c0, TooltipFormFactor tooltipFormFactor, String str, C25609p c25609p, InterfaceC28601c1 interfaceC28601c1) {
        super(0);
        this.f118426w = interfaceC2994c0;
        this.f118427x = c25609p;
        this.f118428y = str;
        this.f118429z = tooltipFormFactor;
        this.f118422E = j7;
        this.f118423F = i13;
        this.f118424G = i14;
        this.f118425H = interfaceC28601c1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        AbstractC3006f0.m8732z(this.f118426w, null, null, new C29262c0(this.f118427x, this.f118428y, this.f118429z, this.f118422E, this.f118423F, this.f118424G, this.f118425H, null, 1), 3);
        return C23454a0.f92919a;
    }
}
