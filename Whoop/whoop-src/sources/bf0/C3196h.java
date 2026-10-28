package bf0;

import androidx.health.platform.client.proto.C1533u;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import com.whoop.design.showcase.gallery.view.fragment.AtomicGalleryFragment;
import com.whoop.profile.view.ProfileBottomSheetKt;
import dw1.AbstractC12416d;
import dw1.AbstractC12418f;
import kl2.AbstractC22567b;
import l83.C23454a0;
import ln1.AbstractC24539q;
import mf0.AbstractC25506e;
import o72.AbstractC27647h;
import p163g1.C15179w3;
import p163g1.C15199y3;
import p163g1.EnumC15209z3;
import p707gt1.AbstractC16200n;
import p709he2.Function1;
import pj2.AbstractC29310i;
import pp2.AbstractC29441e;
import qu2.AbstractC30640h;
import uu2.AbstractC35261l;
import ve0.AbstractC35927e;
import wo1.AbstractC37458l;
import xh0.AbstractC38307c;

/* JADX INFO: renamed from: bf0.h */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C3196h implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f12521w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC2994c0 f12522x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C15199y3 f12523y;

    public /* synthetic */ C3196h(InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, int i13) {
        this.f12521w = i13;
        this.f12522x = interfaceC2994c0;
        this.f12523y = c15199y3;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f12521w) {
            case 0:
                return AbstractC3199k.m9202E(this.f12522x, this.f12523y);
            case 1:
                return AtomicGalleryFragment.m21126O0(this.f12522x, this.f12523y);
            case 2:
                return ProfileBottomSheetKt.ProfileBottomSheet$lambda$2$0$0(this.f12522x, this.f12523y);
            case 3:
                return ProfileBottomSheetKt.ProfileBottomSheet$lambda$0$0(this.f12522x, this.f12523y);
            case 4:
                return AbstractC12416d.m34940m(this.f12522x, this.f12523y);
            case 5:
                return AbstractC12418f.m34961m(this.f12522x, this.f12523y);
            case 6:
                C15199y3 c15199y3 = this.f12523y;
                if (((Boolean) c15199y3.f57060b.f55767d.invoke(EnumC15209z3.f57107x)).booleanValue()) {
                    AbstractC3006f0.m8732z(this.f12522x, null, null, new C15179w3(c15199y3, null, 2), 3);
                }
                return Boolean.TRUE;
            case 7:
                C15199y3 c15199y4 = this.f12523y;
                if (((Boolean) c15199y4.f57060b.f55767d.invoke(EnumC15209z3.f57108y)).booleanValue()) {
                    AbstractC3006f0.m8732z(this.f12522x, null, null, new C15179w3(c15199y4, null, 3), 3);
                }
                return Boolean.TRUE;
            case 8:
                C15199y3 c15199y5 = this.f12523y;
                if (((Boolean) c15199y5.f57060b.f55767d.invoke(EnumC15209z3.f57106w)).booleanValue()) {
                    AbstractC3006f0.m8732z(this.f12522x, null, null, new C15179w3(c15199y5, null, 0), 3);
                }
                return C23454a0.f92919a;
            case 9:
                C15199y3 c15199y6 = this.f12523y;
                if (((Boolean) c15199y6.f57060b.f55767d.invoke(EnumC15209z3.f57106w)).booleanValue()) {
                    AbstractC3006f0.m8732z(this.f12522x, null, null, new C15179w3(c15199y6, null, 1), 3);
                }
                return Boolean.TRUE;
            case 10:
                return AbstractC16200n.m45815F(this.f12522x, this.f12523y);
            case 11:
                return Function1.m48695I(this.f12522x, this.f12523y);
            case 12:
                return Function1.m48699M(this.f12522x, this.f12523y);
            case 13:
                return AbstractC22567b.m65322m(this.f12522x, this.f12523y);
            case 14:
                return AbstractC22567b.m65327r(this.f12522x, this.f12523y);
            case 15:
                return AbstractC24539q.m71493D(this.f12522x, this.f12523y);
            case 16:
                return AbstractC25506e.m74928S(this.f12522x, this.f12523y);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC25506e.m74937a0(this.f12522x, this.f12523y);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC27647h.m83495F(this.f12522x, this.f12523y);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return p725ot1.Function1.m85807S(this.f12522x, this.f12523y);
            case 20:
                return p725ot1.Function1.m85803O(this.f12522x, this.f12523y);
            case 21:
                return AbstractC29310i.m89055m0(this.f12522x, this.f12523y);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC29441e.m89836k(this.f12522x, this.f12523y);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC30640h.m94061C0(this.f12522x, this.f12523y);
            case 24:
                return AbstractC35261l.m111772Q(this.f12522x, this.f12523y);
            case 25:
                return AbstractC35927e.m114141g0(this.f12522x, this.f12523y);
            case 26:
                return AbstractC37458l.m120010h(this.f12522x, this.f12523y);
            default:
                return AbstractC38307c.m122730w(this.f12522x, this.f12523y);
        }
    }

    public /* synthetic */ C3196h(C15199y3 c15199y3, InterfaceC2994c0 interfaceC2994c0, int i13) {
        this.f12521w = i13;
        this.f12523y = c15199y3;
        this.f12522x = interfaceC2994c0;
    }
}
