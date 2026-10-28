package aq1;

import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import androidx.health.platform.client.proto.C1533u;
import b01.AbstractC2195p;
import b30.C2598p3;
import c41.AbstractC4133v1;
import c51.AbstractC4226c;
import com.whoop.profile.domain.models.Gender;
import com.whoop.profile.domain.models.PhysiologicalBaseline;
import com.whoop.profile.presentation.edit.EditProfileViewState;
import com.whoop.profile.view.ProfileScreenKt;
import com.whoop.profile.view.edit.CountrySelectionContentKt;
import com.whoop.profile.view.edit.EditProfileBottomSheetKt;
import com.whoop.settings.AbstractC10104h;
import d61.InterfaceC11732a;
import db0.AbstractC11887c;
import dn0.AbstractC12216p;
import do0.AbstractC12228b;
import e61.AbstractC12766i;
import e81.AbstractC12836k;
import eg2.AbstractC13177j;
import ep1.AbstractC13408c;
import ep1.AbstractC13428w;
import kd0.C22383c;
import l83.C23454a0;
import p236j.C21062a;
import p390p1.InterfaceC28601c1;
import p635y2.InterfaceC39147y;
import p636y3.C39174f;
import p636y3.C39180l;
import p700bd1.C3104v;
import p705ea2.AbstractC42783n;
import p715kotlin.jvm.functions.Function1;
import w81.EnumC36946d;

/* JADX INFO: renamed from: aq1.d */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C1910d implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f7551w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28601c1 f7552x;

    public /* synthetic */ C1910d(int i13, InterfaceC28601c1 interfaceC28601c1) {
        this.f7551w = i13;
        this.f7552x = interfaceC28601c1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f7551w) {
            case 0:
                return AbstractC1912f.m5864t(this.f7552x, (String) obj);
            case 1:
                return AbstractC2195p.m6937w(this.f7552x, (String) obj);
            case 2:
                this.f7552x.setValue((InterfaceC39147y) obj);
                return C23454a0.f92919a;
            case 3:
                this.f7552x.setValue(new C39174f(((int) (((C39180l) obj).f168422a & 4294967295L)) / Resources.getSystem().getDisplayMetrics().density));
                return C23454a0.f92919a;
            case 4:
                C2598p3 c2598p3 = (C2598p3) this.f7552x.getValue();
                if (c2598p3 != null) {
                    c2598p3.f10109d.invoke();
                }
                return C23454a0.f92919a;
            case 5:
                if (((Float) obj).floatValue() == 0.0f) {
                    this.f7552x.setValue(Boolean.TRUE);
                }
                return C23454a0.f92919a;
            case 6:
                return C3104v.m8915f(this.f7552x, ((Boolean) obj).booleanValue());
            case 7:
                return AbstractC4133v1.m12770L(this.f7552x, ((Boolean) obj).booleanValue());
            case 8:
                return AbstractC4226c.m13101k(this.f7552x, ((Double) obj).doubleValue());
            case 9:
                return AbstractC4226c.m13102l(this.f7552x, ((Double) obj).doubleValue());
            case 10:
                return AbstractC4226c.m13104n(this.f7552x, ((Double) obj).doubleValue());
            case 11:
                return ProfileScreenKt.ProfileScreen$lambda$17$0$0$0(this.f7552x, ((Float) obj).floatValue());
            case 12:
                return CountrySelectionContentKt.CountrySelectionContent$lambda$7$0$0(this.f7552x, obj);
            case 13:
                return EditProfileBottomSheetKt.EditProfileBottomSheet$lambda$25$0$2$1$0(this.f7552x, (PhysiologicalBaseline) obj);
            case 14:
                return EditProfileBottomSheetKt.EditProfileBottomSheet$lambda$25$0$2$3$0(this.f7552x, (EditProfileViewState.Country) obj);
            case 15:
                return EditProfileBottomSheetKt.EditProfileBottomSheet$lambda$25$0$2$6$0(this.f7552x, (EditProfileViewState.State) obj);
            case 16:
                return EditProfileBottomSheetKt.EditProfileBottomSheet$lambda$25$0$2$7$0(this.f7552x, ((Boolean) obj).booleanValue());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return EditProfileBottomSheetKt.EditProfileBottomSheet$lambda$25$0$2$8$0(this.f7552x, (Uri) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return EditProfileBottomSheetKt.EditProfileBottomSheet$lambda$25$0$2$9$0(this.f7552x, (Rect) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return EditProfileBottomSheetKt.EditProfileBottomSheet$lambda$25$0$2$0$0(this.f7552x, (Gender) obj);
            case 20:
                return AbstractC11887c.m31876K(this.f7552x, (C22383c.b) obj);
            case 21:
                return AbstractC12216p.m33889P(this.f7552x, (EnumC36946d) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC12228b.m33985r(this.f7552x, (String) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC12766i.m35755k(this.f7552x, (InterfaceC11732a) obj);
            case 24:
                return AbstractC12836k.m35970C(this.f7552x, (Integer) obj);
            case 25:
                return AbstractC10104h.m25408o(this.f7552x, obj);
            case 26:
                return AbstractC42783n.m36350n(this.f7552x, obj);
            case 27:
                return AbstractC13177j.m37043z(this.f7552x, (C21062a) obj);
            case 28:
                return AbstractC13408c.m37900n(this.f7552x, ((Boolean) obj).booleanValue());
            default:
                return AbstractC13428w.m38127q(this.f7552x, ((Integer) obj).intValue());
        }
    }
}
