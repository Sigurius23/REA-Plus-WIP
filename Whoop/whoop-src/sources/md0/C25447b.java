package md0;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.advancedlabs.domain.models.AppointmentSummaryModel;
import com.whoop.advancedlabs.domain.models.ClinicalReportCardHeaderModel;
import com.whoop.advancedlabs.domain.models.ClinicalReportCtaTileModel;
import com.whoop.advancedlabs.feature.galleri.models.HorizontalImagePagerModel;
import com.whoop.clinicianintheloop.domain.models.AppointmentButtonModel;
import com.whoop.clinicianintheloop.domain.models.AppointmentConfirmationCardModel;
import com.whoop.clinicianintheloop.domain.models.AppointmentSummaryFieldModel;
import com.whoop.clinicianintheloop.domain.models.AppointmentTimeInfoModel;
import com.whoop.clinicianintheloop.domain.models.ClinicianHeaderModel;
import com.whoop.clinicianintheloop.domain.models.ExpandableClinicianNoteModel;
import com.whoop.clinicianintheloop.domain.models.SchedulingOverviewCardModel;
import com.whoop.clinicianintheloop.domain.models.VisitDetailItemModel;
import com.whoop.communityhighlights.domain.models.ArchMiniCommunityHighlightsModel;
import com.whoop.communityhighlights.domain.models.HighlightCardModel;
import com.whoop.design.models.items.amoeba.WhoopAgeAmoeba;
import java.util.List;
import java.util.Map;
import jb1.C21536b;
import mf1.C25509a;
import mo0.AbstractC25739b;
import mr0.AbstractC25910a;
import mu0.C25953e;
import nb1.AbstractC26537a;
import nm1.AbstractC26843h;
import p329n0.C26068u;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23749z0;
import p720m91.C25308q;

/* JADX INFO: renamed from: md0.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C25447b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f99645w;

    public /* synthetic */ C25447b(int i13) {
        this.f99645w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f99645w) {
            case 0:
                return AbstractC25448c.m74750t0((HorizontalImagePagerModel) obj);
            case 1:
                return AbstractC25448c.m74754v0((C25308q) obj);
            case 2:
                return AbstractC25448c.m74758x0((C23749z0) obj);
            case 3:
                return AbstractC25448c.m74744q0((C23749z0) obj);
            case 4:
                return AbstractC25448c.m74698N((AppointmentSummaryModel) obj);
            case 5:
                return AbstractC25448c.m74700P((ClinicalReportCardHeaderModel) obj);
            case 6:
                return AbstractC25448c.m74701Q((ClinicalReportCtaTileModel) obj);
            case 7:
                return C25509a.m74997c((Map.Entry) obj);
            case 8:
                return AbstractC25739b.m75898l((C21536b) obj);
            case 9:
                return AbstractC25739b.m75907u((AppointmentButtonModel) obj);
            case 10:
                return AbstractC25739b.m75908v((C25308q) obj);
            case 11:
                return AbstractC25739b.m75899m((C23749z0) obj);
            case 12:
                return AbstractC25739b.m75900n((ClinicianHeaderModel) obj);
            case 13:
                return AbstractC25739b.m75901o((AppointmentTimeInfoModel) obj);
            case 14:
                return AbstractC25739b.m75902p((AppointmentSummaryFieldModel) obj);
            case 15:
                return AbstractC25739b.m75903q((AppointmentConfirmationCardModel) obj);
            case 16:
                return AbstractC25739b.m75904r((SchedulingOverviewCardModel) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC25739b.m75905s((VisitDetailItemModel) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC25739b.m75906t((ExpandableClinicianNoteModel) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC25910a.m76625f((C21536b) obj);
            case 20:
                return AbstractC25910a.m76629j((C25308q) obj);
            case 21:
                return AbstractC25910a.m76626g((C23749z0) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC25910a.m76627h((HighlightCardModel) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC25910a.m76628i((ArchMiniCommunityHighlightsModel) obj);
            case 24:
                return C25953e.m76805D((InterfaceC33687a) obj);
            case 25:
                List list = (List) obj;
                return new C26068u(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            case 26:
                return AbstractC26537a.m78632d((C23749z0) obj);
            case 27:
                return AbstractC26537a.m78633e((WhoopAgeAmoeba) obj);
            case 28:
                AbstractC22676k.m65750j((String) obj, "<unused var>");
                return Boolean.TRUE;
            default:
                return AbstractC26843h.m80108h(obj);
        }
    }
}
