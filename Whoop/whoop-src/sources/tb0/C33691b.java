package tb0;

import android.os.StatFs;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.advancedlabs.domain.models.SearchableBiomarkersListModel;
import com.whoop.advancedlabs.domain.models.SpecializedPanelUpsellTileModel;
import com.whoop.advancedlabs.domain.models.TestResultBottomSheet;
import com.whoop.advancedlabs.domain.models.TestResultBottomSheetItem;
import com.whoop.advancedlabs.domain.models.TestResultsResponse;
import com.whoop.advancedlabs.domain.models.UpdateBiomarkersRequest;
import com.whoop.advancedlabs.domain.models.UpdateBiomarkersResponse;
import com.whoop.advancedlabs.domain.models.WhatsIncludedCardModel;
import com.whoop.aiinsights.domain.models.AiInsightsContentItemModel;
import com.whoop.aiinsights.domain.models.AiInsightsResponse;
import com.whoop.aiinsights.domain.models.PrimaryButton;
import com.whoop.aiinsights.domain.models.SecondaryButton;
import com.whoop.coacheverywhere.domain.models.ProactiveLoadStyle;
import com.whoop.membership.reactivationmodal.domain.models.ReactivationModalCtaModel;
import com.whoop.membership.reactivationmodal.domain.models.ReactivationModalModel;
import com.whoop.startactivity.selectactivity.SelectActivityPickerModel;
import com.whoop.universalcheckout.features.buynow.domain.models.BuyNowResponse;
import com.whoop.universalcheckout.features.buynow.domain.models.BuyNowSection;
import com.whoop.universalcheckout.features.shippingmethod.domain.models.ShippingMethodModels;
import e93.AbstractC12889b;
import io.getstream.chat.android.p226ui.common.utils.AttachmentConstants;
import java.io.File;
import java.util.Calendar;
import ne3.AbstractC26632p;
import ne3.C26603a0;
import ne3.C26611e0;
import tg2.AbstractC33790d;
import th.C33810h;
import ty1.AbstractC34264i;

/* JADX INFO: renamed from: tb0.b */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C33691b implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f140748w;

    public /* synthetic */ C33691b(int i13) {
        this.f140748w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f140748w) {
            case 0:
                return SearchableBiomarkersListModel._childSerializers$_anonymous_$0();
            case 1:
                return SpecializedPanelUpsellTileModel._childSerializers$_anonymous_();
            case 2:
                return SpecializedPanelUpsellTileModel._childSerializers$_anonymous_$0();
            case 3:
                return TestResultBottomSheet._childSerializers$_anonymous_();
            case 4:
                return TestResultBottomSheetItem._childSerializers$_anonymous_();
            case 5:
                return TestResultBottomSheetItem._childSerializers$_anonymous_$0();
            case 6:
                return TestResultBottomSheetItem._childSerializers$_anonymous_$1();
            case 7:
                return TestResultsResponse._childSerializers$_anonymous_();
            case 8:
                return UpdateBiomarkersRequest._childSerializers$_anonymous_();
            case 9:
                return UpdateBiomarkersResponse._childSerializers$_anonymous_();
            case 10:
                return WhatsIncludedCardModel._childSerializers$_anonymous_();
            case 11:
                return "request failed with non-retryable error";
            case 12:
                return Boolean.valueOf(AbstractC33790d.m106863j());
            case 13:
                return SelectActivityPickerModel._childSerializers$_anonymous_();
            case 14:
                C26603a0 c26603a0 = AbstractC26632p.f105900w;
                C26611e0 c26611e0M79176e = AbstractC26632p.f105901x.m79176e("coil3_disk_cache");
                long jM36286p = AttachmentConstants.MAX_SIZE_BEFORE_DOWNLOAD_WARNING_IN_BYTES;
                try {
                    File file = c26611e0M79176e.toFile();
                    file.mkdir();
                    StatFs statFs = new StatFs(file.getAbsolutePath());
                    jM36286p = AbstractC12889b.m36286p((long) (0.02d * statFs.getBlockSizeLong() * statFs.getBlockCountLong()), AttachmentConstants.MAX_SIZE_BEFORE_DOWNLOAD_WARNING_IN_BYTES, 262144000L);
                    break;
                } catch (Exception unused) {
                }
                return new C33810h(jM36286p, c26603a0, c26611e0M79176e);
            case 15:
                return AiInsightsContentItemModel._childSerializers$_anonymous_();
            case 16:
                return AiInsightsResponse._childSerializers$_anonymous_();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return PrimaryButton._childSerializers$_anonymous_();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return SecondaryButton._childSerializers$_anonymous_();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return BuyNowResponse._childSerializers$_anonymous_();
            case 20:
                return BuyNowResponse._childSerializers$_anonymous_$0();
            case 21:
                return BuyNowSection._childSerializers$_anonymous_();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return ProactiveLoadStyle._childSerializers$_anonymous_();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return ProactiveLoadStyle._childSerializers$_anonymous_$0();
            case 24:
                return ShippingMethodModels._childSerializers$_anonymous_();
            case 25:
                return ShippingMethodModels._childSerializers$_anonymous_$0();
            case 26:
                return ReactivationModalCtaModel._childSerializers$_anonymous_();
            case 27:
                return ReactivationModalModel._childSerializers$_anonymous_();
            case 28:
                return Long.valueOf(Calendar.getInstance().getTimeInMillis());
            default:
                return AbstractC34264i.m108344U();
        }
    }
}
