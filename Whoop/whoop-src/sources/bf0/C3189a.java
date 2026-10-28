package bf0;

import androidx.health.platform.client.proto.C1533u;
import bg0.AbstractC3225g;
import bu1.AbstractC3636b;
import bv2.AbstractC3676c;
import by1.AbstractC3699f;
import c31.AbstractC3924h;
import c41.AbstractC4001c2;
import c41.AbstractC4012e;
import c41.AbstractC4128u3;
import c93.InterfaceC4339a;
import cd0.AbstractC4436b;
import ci0.AbstractC4729d;
import ck1.AbstractC4783f;
import ck1.AbstractC4786i;
import com.whoop.bot.settings.CoachSettingsScreenKt;
import com.whoop.profile.view.ProfileHeaderKt;
import com.whoop.profile.view.ProfileScreenContentKt;
import com.whoop.profile.view.ProfileScreenKt;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: bf0.a */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C3189a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f12504w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f12505x;

    public /* synthetic */ C3189a(Function1 function1, int i13) {
        this.f12504w = i13;
        this.f12505x = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f12504w) {
            case 0:
                return AbstractC3190b.m9184j(this.f12505x);
            case 1:
                return AbstractC3190b.m9185k(this.f12505x);
            case 2:
                return AbstractC3194f.m9194h(this.f12505x);
            case 3:
                return AbstractC3225g.m9303o(this.f12505x);
            case 4:
                return AbstractC3636b.m11195j(this.f12505x);
            case 5:
                return AbstractC3676c.m11380p(this.f12505x);
            case 6:
                return AbstractC3676c.m11381q(this.f12505x);
            case 7:
                return AbstractC3676c.m11382r(this.f12505x);
            case 8:
                return AbstractC3699f.m11510d(this.f12505x);
            case 9:
                return AbstractC3924h.m11920f(this.f12505x);
            case 10:
                return AbstractC4012e.m12170g(this.f12505x);
            case 11:
                return AbstractC4001c2.m12140n(this.f12505x);
            case 12:
                return AbstractC4128u3.m12752q(this.f12505x);
            case 13:
                return AbstractC4436b.m13883k(this.f12505x);
            case 14:
                return AbstractC4436b.m13879g(this.f12505x);
            case 15:
                return p701ce2.Function1.m14102t(this.f12505x);
            case 16:
                return p701ce2.Function1.m14096n(this.f12505x);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return p701ce2.Function1.m14097o(this.f12505x);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC4729d.m14808z(this.f12505x);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC4729d.m14777A(this.f12505x);
            case 20:
                return AbstractC4729d.m14799q(this.f12505x);
            case 21:
                return AbstractC4783f.m15062j(this.f12505x);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC4786i.m15078H(this.f12505x);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC4786i.m15100t(this.f12505x);
            case 24:
                return CoachSettingsScreenKt.ErrorState$lambda$1$0(this.f12505x);
            case 25:
                return CoachSettingsScreenKt.ErrorState$lambda$2$0(this.f12505x);
            case 26:
                return ProfileHeaderKt.ProfileHeader$lambda$2$1$1$1$1$0$0(this.f12505x);
            case 27:
                return ProfileScreenContentKt.ProfileContentArea$lambda$3$0(this.f12505x);
            case 28:
                return ProfileScreenKt.EntitlementLogo$lambda$0$0(this.f12505x);
            default:
                return ProfileScreenKt.SettingsIcon$lambda$0$0(this.f12505x);
        }
    }
}
