package cj0;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import ck1.AbstractC4787j;
import ck1.AbstractC4790m;
import com.whoop.archv2.model.template.SingleItemTemplate;
import com.whoop.archv2.model.template.TemplateBackgroundTheme;
import com.whoop.archv2.model.template.UnknownTemplate;
import com.whoop.archv2.model.template.VerticalAlignment;
import com.whoop.bot.settings.CoachSettingsFragment;
import com.whoop.core.details.network.model.CardModel;
import com.whoop.core.details.network.model.CoreDetailsModel;
import com.whoop.p057ai.chat.domain.formwidget.SubmitFormAnswersRequest;
import com.whoop.p057ai.chat.domain.formwidget.UpdateFormRequest;
import com.whoop.training.data.network.request.hrsettings.CustomHrZonesRequest;
import com.whoop.universalcheckout.features.cart.domain.models.items.CartItemModel;
import com.whoop.universalcheckout.features.cart.domain.models.items.EmptyCartContentModel;
import l83.C23454a0;

/* JADX INFO: renamed from: cj0.f */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C4744f implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f19453w;

    public /* synthetic */ C4744f(int i13) {
        this.f19453w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f19453w) {
            case 0:
                return SingleItemTemplate._childSerializers$_anonymous_();
            case 1:
                return SingleItemTemplate._childSerializers$_anonymous_$0();
            case 2:
                return SingleItemTemplate._childSerializers$_anonymous_$1();
            case 3:
                return SingleItemTemplate._childSerializers$_anonymous_$2();
            case 4:
                return TemplateBackgroundTheme._init_$_anonymous_();
            case 5:
                return UnknownTemplate._init_$_anonymous_();
            case 6:
                return VerticalAlignment._init_$_anonymous_();
            case 7:
                return AbstractC4787j.m15114h();
            case 8:
                return AbstractC4790m.m15131j();
            case 9:
                return CustomHrZonesRequest._childSerializers$_anonymous_();
            case 10:
                return CartItemModel._childSerializers$_anonymous_();
            case 11:
                return EmptyCartContentModel._childSerializers$_anonymous_();
            case 12:
                return SubmitFormAnswersRequest._childSerializers$_anonymous_();
            case 13:
                return UpdateFormRequest._childSerializers$_anonymous_();
            case 14:
                return C23454a0.f92919a;
            case 15:
                return C23454a0.f92919a;
            case 16:
                return C23454a0.f92919a;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return CoachSettingsFragment.analyticsHelper_delegate$lambda$0();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return C23454a0.f92919a;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return C23454a0.f92919a;
            case 20:
                return C23454a0.f92919a;
            case 21:
                return C23454a0.f92919a;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return C23454a0.f92919a;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return C23454a0.f92919a;
            case 24:
                return C23454a0.f92919a;
            case 25:
                return C23454a0.f92919a;
            case 26:
                return CardModel._childSerializers$_anonymous_();
            case 27:
                return CoreDetailsModel._childSerializers$_anonymous_();
            case 28:
                return CoreDetailsModel._childSerializers$_anonymous_$0();
            default:
                return CoreDetailsModel._childSerializers$_anonymous_$1();
        }
    }
}
