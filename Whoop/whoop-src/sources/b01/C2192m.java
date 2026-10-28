package b01;

import androidx.health.platform.client.proto.C1533u;
import c41.AbstractC3991b;
import c41.AbstractC4133v1;
import c41.AbstractC4157y4;
import c93.InterfaceC4339a;
import com.whoop.design.showcase.gallery.view.fragment.AtomicGalleryFragment;
import com.whoop.profile.view.ProfileScreenKt;
import com.whoop.profile.view.edit.EditProfileScreenKt;
import db0.AbstractC11887c;
import eg2.AbstractC13176i;
import eg2.AbstractC13177j;
import ep1.AbstractC13422q;
import g11.AbstractC15219c;
import l83.C23454a0;
import p268k0.AbstractC22086a;
import p390p1.InterfaceC28601c1;
import p635y2.InterfaceC39147y;
import p701ce2.Function1;
import p704dk2.AbstractC12123j;
import p706eo0.AbstractC13376g;
import p715kotlin.KotlinNothingValueException;

/* JADX INFO: renamed from: b01.m */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C2192m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f8701w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28601c1 f8702x;

    public /* synthetic */ C2192m(int i13, InterfaceC28601c1 interfaceC28601c1) {
        this.f8701w = i13;
        this.f8702x = interfaceC28601c1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f8701w) {
            case 0:
                return AbstractC2195p.m6938x(this.f8702x);
            case 1:
                InterfaceC39147y interfaceC39147y = (InterfaceC39147y) this.f8702x.getValue();
                if (interfaceC39147y != null) {
                    return interfaceC39147y;
                }
                AbstractC22086a.m63161d("Required value was null.");
                throw new KotlinNothingValueException();
            case 2:
                InterfaceC28601c1 interfaceC28601c1 = this.f8702x;
                if (((Boolean) interfaceC28601c1.getValue()).booleanValue()) {
                    interfaceC28601c1.setValue(Boolean.FALSE);
                } else {
                    interfaceC28601c1.setValue(Boolean.TRUE);
                }
                return C23454a0.f92919a;
            case 3:
                this.f8702x.setValue(Boolean.FALSE);
                return C23454a0.f92919a;
            case 4:
                this.f8702x.setValue(Boolean.TRUE);
                return C23454a0.f92919a;
            case 5:
                this.f8702x.setValue(Boolean.FALSE);
                return C23454a0.f92919a;
            case 6:
                return AbstractC3991b.m12068g(this.f8702x);
            case 7:
                return AbstractC4133v1.m12766H(this.f8702x);
            case 8:
                return AbstractC4133v1.m12772N(this.f8702x);
            case 9:
                return Float.valueOf(AbstractC4157y4.m12966r(this.f8702x));
            case 10:
                return AtomicGalleryFragment.m21140V0(this.f8702x);
            case 11:
                return AtomicGalleryFragment.m21142W0(this.f8702x);
            case 12:
                return AtomicGalleryFragment.m21144X0(this.f8702x);
            case 13:
                return AtomicGalleryFragment.m21146Y0(this.f8702x);
            case 14:
                return AtomicGalleryFragment.m21148Z0(this.f8702x);
            case 15:
                return Function1.m14103u(this.f8702x);
            case 16:
                return ProfileScreenKt.ProfileOverflowMenu$lambda$3$0$0(this.f8702x);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return ProfileScreenKt.ProfileOverflowMenu$lambda$3$1$0$0(this.f8702x);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return EditProfileScreenKt.EditProfileScreen$lambda$23$0(this.f8702x);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return EditProfileScreenKt.EditProfileScreen$lambda$24$0(this.f8702x);
            case 20:
                return EditProfileScreenKt.EditProfileScreen$lambda$21$3$0(this.f8702x);
            case 21:
                return EditProfileScreenKt.EditProfileScreen$lambda$22$0$0(this.f8702x);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC11887c.m31869D(this.f8702x);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC12123j.m33534H(this.f8702x);
            case 24:
                return AbstractC13176i.m36959Q(this.f8702x);
            case 25:
                return AbstractC13177j.m37004L(this.f8702x);
            case 26:
                return AbstractC13376g.m37683E(this.f8702x);
            case 27:
                return AbstractC13422q.m38022J(this.f8702x);
            case 28:
                return AbstractC13422q.m38023K(this.f8702x);
            default:
                return AbstractC15219c.m43242I(this.f8702x);
        }
    }
}
