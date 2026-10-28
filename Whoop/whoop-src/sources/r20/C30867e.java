package r20;

import b30.C2482b;
import com.whoop.android.R;
import java.util.List;
import m83.AbstractC25265s;
import p040c0.InterfaceC3770q;
import p479s4.AbstractC32128i;
import p499t9.C33623c0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import se.AbstractC32410a;
import u00.C34378f;
import y00.EnumC38828f4;
import yi0.AbstractC39566d;

/* JADX INFO: renamed from: r20.e */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C30867e implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f127272w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f127273x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f127274y;

    public /* synthetic */ C30867e(int i13, boolean z4, boolean z13) {
        this.f127272w = i13;
        this.f127273x = z4;
        this.f127274y = z13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        int i13 = this.f127272w;
        boolean z4 = this.f127274y;
        boolean z13 = this.f127273x;
        switch (i13) {
            case 0:
                C2482b state = (C2482b) obj;
                AbstractC22676k.m65750j(state, "state");
                if (z13 || z4) {
                    return null;
                }
                C34378f c34378f = (C34378f) AbstractC25265s.m74146r1(state.f9664b);
                str = c34378f != null ? c34378f.f144467a : null;
                C33623c0 c33623c0 = EnumC38828f4.f167088G;
                return AbstractC22676k.m65745e(str, "card") ? AbstractC32128i.m100054h(R.string.stripe_title_add_a_card) : AbstractC32128i.m100054h(R.string.stripe_paymentsheet_choose_payment_method);
            case 1:
                C2482b state2 = (C2482b) obj;
                AbstractC22676k.m65750j(state2, "state");
                List list = state2.f9664b;
                if (z13 || AbstractC32410a.m101007P(list)) {
                    return null;
                }
                if (z4) {
                    return AbstractC32128i.m100054h(R.string.stripe_paymentsheet_add_payment_method_title);
                }
                C34378f c34378f2 = (C34378f) AbstractC25265s.m74146r1(list);
                str = c34378f2 != null ? c34378f2.f144467a : null;
                C33623c0 c33623c1 = EnumC38828f4.f167088G;
                return AbstractC22676k.m65745e(str, "card") ? AbstractC32128i.m100054h(R.string.stripe_title_add_a_card) : AbstractC32128i.m100054h(R.string.stripe_paymentsheet_choose_payment_method);
            case 2:
                return Integer.valueOf(AbstractC39566d.m126332C(z13, z4, ((Integer) obj).intValue()));
            case 3:
                return Integer.valueOf(AbstractC39566d.m126333D(z13, z4, ((Integer) obj).intValue()));
            case 4:
                return AbstractC39566d.m126356r(z13, z4, (InterfaceC3770q) obj);
            default:
                return AbstractC39566d.m126359u(z13, z4, (InterfaceC3770q) obj);
        }
    }
}
