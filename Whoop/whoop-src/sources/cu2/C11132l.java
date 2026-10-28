package cu2;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.data.remote.domain.response.journal.CurrentProgressPercentage;
import com.whoop.data.remote.domain.response.journal.CurrentProgressSteps;
import com.whoop.data.remote.domain.response.journal.TextDisplayOption;
import com.whoop.design.models.items.emoji.EmojiModel;
import com.whoop.design.models.items.emoji.EmojiSize;
import com.whoop.design.models.items.shopmediacard.ShopMediaCardModel;
import com.whoop.payments.stripebottomsheettile.model.PaymentMethodMenuTileModel;
import com.whoop.payments.stripebottomsheettile.model.PaymentSheetConfiguration;
import com.whoop.payments.stripebottomsheettile.model.StripeBottomSheetTileModel;
import com.whoop.weightlifting.AbstractC10757a;
import com.whoop.whooplabs.data.remote.domain.dto.LegalDocumentCompletedDto;
import com.whoop.whooplabs.data.remote.domain.dto.ScreeningResponse;
import com.whoop.whooplabs.data.remote.domain.dto.ScreeningSubmissionDto;
import d11.AbstractC11471f;
import d40.AbstractC11673r;
import d40.C11671p;
import d41.AbstractC11679e;
import d62.AbstractC11737c;
import d62.AbstractC11741g;
import p390p1.C28674u2;

/* JADX INFO: renamed from: cu2.l */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C11132l implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f35533w;

    public /* synthetic */ C11132l(int i13) {
        this.f35533w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f35533w) {
            case 0:
                return AbstractC10757a.m28172t();
            case 1:
                return CurrentProgressPercentage._childSerializers$_anonymous_();
            case 2:
                return CurrentProgressSteps._childSerializers$_anonymous_();
            case 3:
                return CurrentProgressSteps._childSerializers$_anonymous_$0();
            case 4:
                return TextDisplayOption._childSerializers$_anonymous_();
            case 5:
                return LegalDocumentCompletedDto._childSerializers$_anonymous_();
            case 6:
                return ScreeningResponse._childSerializers$_anonymous_();
            case 7:
                return ScreeningSubmissionDto._childSerializers$_anonymous_();
            case 8:
                return "Couldn't find an instance of InitializationDataSource. Are you instantiating CustomerSheet unconditionally in your app?";
            case 9:
                return AbstractC11471f.m30787l();
            case 10:
                return PaymentMethodMenuTileModel._childSerializers$_anonymous_();
            case 11:
                return PaymentMethodMenuTileModel._childSerializers$_anonymous_$0();
            case 12:
                return PaymentSheetConfiguration._childSerializers$_anonymous_();
            case 13:
                return StripeBottomSheetTileModel._childSerializers$_anonymous_();
            case 14:
                return C11671p.f37681b;
            case 15:
                return C11671p.f37682c;
            case 16:
                return C11671p.f37683d;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return C11671p.f37686g;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return C11671p.f37689j;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                C28674u2 c28674u2 = AbstractC11673r.f37711c;
                return Boolean.FALSE;
            case 20:
                return C11671p.f37688i;
            case 21:
                return C11671p.f37687h;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC11679e.m31125r();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC11737c.m31382r();
            case 24:
                return AbstractC11741g.m31424u();
            case 25:
                return EmojiModel._childSerializers$_anonymous_();
            case 26:
                return EmojiSize._init_$_anonymous_();
            case 27:
                return ShopMediaCardModel._childSerializers$_anonymous_();
            case 28:
                return ShopMediaCardModel._childSerializers$_anonymous_$0();
            default:
                return ShopMediaCardModel._childSerializers$_anonymous_$1();
        }
    }
}
