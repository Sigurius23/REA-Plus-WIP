package w91;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.design.models.items.UpsellCardFeaturesModel;
import com.whoop.design.models.items.UpsellCardSmallModel;
import com.whoop.design.models.items.VowCtaModel;
import com.whoop.design.models.items.VowCtaText;
import com.whoop.design.models.items.WaitlistBiomarkerListCtaModel;
import com.whoop.design.models.items.WaitlistBiomarkerListPreviewModel;
import com.whoop.design.models.items.WheelContent;
import com.whoop.design.models.items.WhoopCoachVowModel;
import com.whoop.design.models.items.ZoneBarModel;
import com.whoop.design.models.items.ZoneBarZone;
import com.whoop.design.models.items.keyinfotile.KeyInfoTileModel;
import com.whoop.shepherd.feature.notificationhistory.domain.models.PageHeaderResponse;
import com.whoop.shepherd.feature.notificationhistory.domain.models.ShepherdClearHistoryDialogResponse;
import com.whoop.shepherd.feature.notificationhistory.domain.models.ShepherdPaginatedHistoryRecordSectionResponse;
import com.whoop.shepherd.feature.notificationhistory.domain.models.ShepherdPaginatedHistoryResponse;
import p579wc.AbstractC37103l1;
import p579wc.AbstractC37104m;
import wh2.C37300a;

/* JADX INFO: renamed from: w91.l */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C36965l implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f158133w;

    public /* synthetic */ C36965l(int i13) {
        this.f158133w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f158133w) {
            case 0:
                return UpsellCardFeaturesModel._childSerializers$_anonymous_();
            case 1:
                return UpsellCardSmallModel._childSerializers$_anonymous_();
            case 2:
                return VowCtaModel._childSerializers$_anonymous_();
            case 3:
                return VowCtaText._childSerializers$_anonymous_();
            case 4:
                return WaitlistBiomarkerListCtaModel._childSerializers$_anonymous_();
            case 5:
                return WaitlistBiomarkerListPreviewModel._childSerializers$_anonymous_();
            case 6:
                return WheelContent._childSerializers$_anonymous_();
            case 7:
                return WheelContent._childSerializers$_anonymous_$0();
            case 8:
                return WhoopCoachVowModel._childSerializers$_anonymous_();
            case 9:
                return ZoneBarModel._childSerializers$_anonymous_();
            case 10:
                return ZoneBarZone._childSerializers$_anonymous_();
            case 11:
                return KeyInfoTileModel._childSerializers$_anonymous_();
            case 12:
                return "retrieving container credentials";
            case 13:
                return "failed to obtain credentials from container metadata service";
            case 14:
                return "Attempting to load credentials from env vars " + AbstractC37104m.f158726a + '/' + AbstractC37104m.f158727b + '/' + AbstractC37104m.f158728c;
            case 15:
                return "Attempting credential expiration extension due to a credential service availability issue. A refresh of these credentials will be attempted again in 15 minutes.";
            case 16:
                return "Received 404 from IMDS when loading profile information. Hint: This instance may not have an IAM role associated.";
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return "token refresh failed";
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return "Attempting to load token from file using legacy format";
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return "retrieving assumed credentials";
            case 20:
                return "sts refused to grant assumed role credentials";
            case 21:
                return "retrieving assumed credentials via web identity";
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return "sts refused to grant assumed role credentials from web identity";
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return "Attempting to load credentials from system properties " + AbstractC37103l1.f158722a + '/' + AbstractC37103l1.f158723b + '/' + AbstractC37103l1.f158724c;
            case 24:
                return PageHeaderResponse._childSerializers$_anonymous_();
            case 25:
                return ShepherdClearHistoryDialogResponse._childSerializers$_anonymous_();
            case 26:
                return ShepherdPaginatedHistoryRecordSectionResponse._childSerializers$_anonymous_();
            case 27:
                return ShepherdPaginatedHistoryResponse._childSerializers$_anonymous_();
            case 28:
                return C37300a.m119445c();
            default:
                return Long.valueOf(C37300a.m119446d());
        }
    }
}
