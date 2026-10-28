package a31;

import androidx.health.platform.client.proto.C1533u;
import b01.AbstractC2195p;
import bb2.AbstractC2926b;
import bs2.AbstractC3613f;
import c41.AbstractC4097q0;
import c41.AbstractC4134v2;
import c93.InterfaceC4339a;
import ck1.AbstractC4790m;
import com.whoop.bot.settings.CoachSettingsScreenKt;
import com.whoop.design.showcase.gallery.view.fragment.AtomicGalleryFragment;
import com.whoop.profile.view.ProfileHeaderKt;
import com.whoop.profile.view.edit.EditProfileAvatarSectionKt;
import com.whoop.profile.view.edit.avatar.PhotoSourceActionSheetKt;
import d11.AbstractC11471f;
import d41.AbstractC11679e;
import d42.AbstractC11686b;
import d42.AbstractC11687c;
import d42.AbstractC11688d;
import d42.AbstractC11694j;
import d42.AbstractC11696l;
import l83.C23454a0;

/* JADX INFO: renamed from: a31.e */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C0343e implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f1210w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f1211x;

    public /* synthetic */ C0343e(InterfaceC4339a interfaceC4339a, int i13) {
        this.f1210w = i13;
        this.f1211x = interfaceC4339a;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f1210w) {
            case 0:
                return AbstractC0344f.m880i(this.f1211x);
            case 1:
                return AbstractC2195p.m6912N(this.f1211x);
            case 2:
                this.f1211x.invoke();
                return Boolean.TRUE;
            case 3:
                this.f1211x.invoke();
                return C23454a0.f92919a;
            case 4:
                InterfaceC4339a interfaceC4339a = this.f1211x;
                if (interfaceC4339a != null) {
                    interfaceC4339a.invoke();
                }
                return C23454a0.f92919a;
            case 5:
                return AbstractC2926b.m8535e(this.f1211x);
            case 6:
                return AbstractC3613f.m10971j(this.f1211x);
            case 7:
                return AbstractC4097q0.m12603r(this.f1211x);
            case 8:
                return AbstractC4134v2.m12814o(this.f1211x);
            case 9:
                return AtomicGalleryFragment.m21102C0(this.f1211x);
            case 10:
                return AbstractC4790m.m15132k(this.f1211x);
            case 11:
                return CoachSettingsScreenKt.CoachSettingsRow$lambda$1$0(this.f1211x);
            case 12:
                return CoachSettingsScreenKt.Footer_rAjV9yQ$lambda$0$0$0$0(this.f1211x);
            case 13:
                return ProfileHeaderKt.ProfileHeader$lambda$2$1$1$0$0$0(this.f1211x);
            case 14:
                return EditProfileAvatarSectionKt.EditProfileAvatarSection$lambda$2$0$1$0(this.f1211x);
            case 15:
                return PhotoSourceActionSheetKt.PhotoActionButton$lambda$0$0(this.f1211x);
            case 16:
                return AbstractC11471f.m30792q(this.f1211x);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC11679e.m31126s(this.f1211x);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC11686b.m31164e(this.f1211x);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC11687c.m31171e(this.f1211x);
            case 20:
                return AbstractC11687c.m31172f(this.f1211x);
            case 21:
                return AbstractC11688d.m31177d(this.f1211x);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC11694j.m31207u(this.f1211x);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC11694j.m31210x(this.f1211x);
            case 24:
                return AbstractC11694j.m31211y(this.f1211x);
            case 25:
                return AbstractC11694j.m31212z(this.f1211x);
            case 26:
                return AbstractC11694j.m31179A(this.f1211x);
            case 27:
                return AbstractC11694j.m31202p(this.f1211x);
            case 28:
                return AbstractC11696l.m31221i(this.f1211x);
            default:
                return AbstractC11696l.m31222j(this.f1211x);
        }
    }
}
