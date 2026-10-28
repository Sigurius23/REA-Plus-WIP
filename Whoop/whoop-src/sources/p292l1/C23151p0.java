package p292l1;

import android.content.Context;
import androidx.compose.animation.AbstractC1089a;
import com.whoop.data.local.room.dao.persistent.C6494e;
import kk1.C22541b;
import kx1.C22881b;
import l83.C23454a0;
import p040c0.AbstractC3788w0;
import p040c0.C3756l0;
import p040c0.C3775r1;
import p040c0.C3789x;
import p040c0.InterfaceC3770q;
import p077d0.C11362i1;
import p390p1.InterfaceC28601c1;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import w81.AbstractC36945c;

/* JADX INFO: renamed from: l1.p0 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C23151p0 implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f91557E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f91558F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f91559w = 2;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f91560x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f91561y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f91562z;

    public /* synthetic */ C23151p0(int i13, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, Function1 function1, Function1 function2) {
        this.f91560x = i13;
        this.f91561y = interfaceC28601c1;
        this.f91562z = interfaceC28601c2;
        this.f91557E = function1;
        this.f91558F = function2;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f91559w) {
            case 0:
                C11362i1 c11362i1 = (C11362i1) this.f91561y;
                C11362i1 c11362i2 = (C11362i1) this.f91562z;
                C11362i1 c11362i3 = (C11362i1) this.f91557E;
                C11362i1 c11362i4 = (C11362i1) this.f91558F;
                int i13 = ((C23122k1) ((C3789x) ((InterfaceC3770q) obj)).mo11595b()).f91354a;
                int i14 = this.f91560x;
                C3756l0 c3756l0M3345c = i13 == 1 ? AbstractC1089a.m3345c(AbstractC3788w0.m11587o(c11362i1, new C22881b(10)).m11562a(AbstractC3788w0.m11577e(c11362i2, 2)), AbstractC3788w0.m11578f(c11362i3, 2).m11563a(AbstractC3788w0.m11591s(c11362i1, new C6494e(i14, 21)))) : AbstractC1089a.m3345c(AbstractC3788w0.m11587o(c11362i1, new C6494e(i14, 21)).m11562a(AbstractC3788w0.m11577e(c11362i2, 2)), AbstractC3788w0.m11591s(c11362i1, new C22881b(10)).m11563a(AbstractC3788w0.m11578f(c11362i3, 2)));
                c3756l0M3345c.f15352d = new C3775r1(true, new C22541b(c11362i4, 8));
                return c3756l0M3345c;
            case 1:
                AbstractC39104j1 abstractC39104j1 = (AbstractC39104j1) this.f91561y;
                AbstractC39104j1 abstractC39104j2 = (AbstractC39104j1) this.f91562z;
                AbstractC39104j1 abstractC39104j3 = (AbstractC39104j1) this.f91557E;
                AbstractC39104j1 abstractC39104j4 = (AbstractC39104j1) this.f91558F;
                AbstractC39101i1 layout = (AbstractC39101i1) obj;
                AbstractC22676k.m65750j(layout, "$this$layout");
                int i15 = abstractC39104j1.f168212x;
                int i16 = this.f91560x;
                AbstractC39101i1.m124624n(abstractC39104j1, 0, (i16 - i15) / 2, layout);
                int i17 = abstractC39104j1.f168211w;
                AbstractC39101i1.m124624n(abstractC39104j2, i17, (i16 - abstractC39104j2.f168212x) / 2, layout);
                AbstractC39101i1.m124624n(abstractC39104j3, i17 + abstractC39104j2.f168211w, (i16 - abstractC39104j3.f168212x) / 2, layout);
                if (abstractC39104j4 != null) {
                    AbstractC39101i1.m124624n(abstractC39104j4, abstractC39104j1.f168211w, i16, layout);
                }
                return C23454a0.f92919a;
            default:
                return AbstractC36945c.m118624m(this.f91560x, (InterfaceC28601c1) this.f91561y, (InterfaceC28601c1) this.f91562z, (Function1) this.f91557E, (Function1) this.f91558F, (Context) obj);
        }
    }

    public /* synthetic */ C23151p0(C11362i1 c11362i1, C11362i1 c11362i2, C11362i1 c11362i3, int i13, C11362i1 c11362i4) {
        this.f91561y = c11362i1;
        this.f91562z = c11362i2;
        this.f91557E = c11362i3;
        this.f91560x = i13;
        this.f91558F = c11362i4;
    }

    public /* synthetic */ C23151p0(AbstractC39104j1 abstractC39104j1, int i13, AbstractC39104j1 abstractC39104j2, AbstractC39104j1 abstractC39104j3, AbstractC39104j1 abstractC39104j4) {
        this.f91561y = abstractC39104j1;
        this.f91560x = i13;
        this.f91562z = abstractC39104j2;
        this.f91557E = abstractC39104j3;
        this.f91558F = abstractC39104j4;
    }
}
