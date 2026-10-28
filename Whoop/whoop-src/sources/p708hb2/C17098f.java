package p708hb2;

import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;
import com.whoop.advancedlabs.biomarkersummary.view.BiomarkerSummaryFragment;
import com.whoop.advancedlabs.multiconsentscreen.view.MultiConsentFragment;
import com.whoop.advancedlabs.typeformwebview.view.AdvancedLabsTypeformWebviewFragment;
import com.whoop.advancedlabs.view.AdvancedLabsFragment;
import com.whoop.advancedlabsjoin.feature.updatetests.view.UpdateTestsFragment;
import com.whoop.design.models.items.heightpicker.HeightPickerModel;
import com.whoop.domain.model.UnitSystem;
import com.whoop.editactivities.view.EditActivitiesDrawerFragment;
import com.whoop.education.FeatureEducationDebugFragment;
import com.whoop.gifting.feature.gifted.view.GiftedFragment;
import com.whoop.hormonalinsights.postpartum.view.PostPartumFragment;
import com.whoop.integrations.view.IntegrationsFragment;
import com.whoop.settings.debug.QnaFormDebugFragment;
import com.whoop.settings.email.EditEmailFragment;
import com.whoop.settings.gifthub.GiftHubFragment;
import com.whoop.videocall.view.VideoCallFragment;
import com.whoop.whooplabs.feature.WhoopLabsFragment;
import ge2.C15744i;
import hr2.AbstractC17586f;
import hr2.C17582b;
import i20.AbstractC17960l1;
import io.getstream.chat.android.client.api2.MoshiChatApi;
import io.getstream.chat.android.client.api2.mapping.DomainMapping;
import io.getstream.chat.android.client.api2.model.response.PushPreferencesResponse;
import io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelEventHandlerImpl;
import io.getstream.chat.android.models.TypingEvent;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.poll.CreatePollDialogFragment;
import io.getstream.chat.android.p226ui.feature.messages.list.reactions.view.internal.ViewReactionsView;
import io2.AbstractC20773m0;
import io2.C20777o0;
import j50.AbstractC21331c;
import j50.C21332d;
import j81.AbstractC21422f;
import j81.C21425i;
import java.util.Map;
import jp2.AbstractC21873d;
import jp2.C21874e;
import k03.C22098c;
import k83.InterfaceC22297a;
import kc1.AbstractC22350a;
import kc2.C22356f;
import l83.C23454a0;
import l83.C23465k;
import p239j1.C21194l;
import p390p1.AbstractC28683x;
import p709he2.AbstractC17217c;

/* JADX INFO: renamed from: hb2.f */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C17098f implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f65687w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f65688x;

    public /* synthetic */ C17098f(Object obj, int i13) {
        this.f65687w = i13;
        this.f65688x = obj;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f65687w) {
            case 0:
                return QnaFormDebugFragment.m25368A((QnaFormDebugFragment) this.f65688x, (Composer) obj, ((Integer) obj2).intValue());
            case 1:
                return EditActivitiesDrawerFragment.m21343M((EditActivitiesDrawerFragment) this.f65688x, (Composer) obj, ((Integer) obj2).intValue());
            case 2:
                return AbstractC17217c.m48675k((C15744i) this.f65688x, (Composer) obj, ((Integer) obj2).intValue());
            case 3:
                return AbstractC17586f.m50078e((C17582b) this.f65688x, (Composer) obj, ((Integer) obj2).intValue());
            case 4:
                ((Integer) obj2).getClass();
                AbstractC17960l1.m51581h((InterfaceC22297a) this.f65688x, (Composer) obj, AbstractC28683x.m87244L(1));
                return C23454a0.f92919a;
            case 5:
                return BiomarkerSummaryFragment.m17314P((BiomarkerSummaryFragment) this.f65688x, (Composer) obj, ((Integer) obj2).intValue());
            case 6:
                return EditEmailFragment.m25372A((EditEmailFragment) this.f65688x, (Composer) obj, ((Integer) obj2).intValue());
            case 7:
                return MultiConsentFragment.m17496K((MultiConsentFragment) this.f65688x, (Composer) obj, ((Integer) obj2).intValue());
            case 8:
                return FeatureEducationDebugFragment.m21347B((FeatureEducationDebugFragment) this.f65688x, (Composer) obj, ((Integer) obj2).intValue());
            case 9:
                return AdvancedLabsTypeformWebviewFragment.m17674T((AdvancedLabsTypeformWebviewFragment) this.f65688x, (Composer) obj, ((Integer) obj2).intValue());
            case 10:
                return UpdateTestsFragment.m17721D((UpdateTestsFragment) this.f65688x, (Composer) obj, ((Integer) obj2).intValue());
            case 11:
                return GiftedFragment.m21453D((GiftedFragment) this.f65688x, (Composer) obj, ((Integer) obj2).intValue());
            case 12:
                return MoshiChatApi.parseUserPushPreferencesResponse$lambda$126((MoshiChatApi) this.f65688x, (DomainMapping) obj, (PushPreferencesResponse) obj2);
            case 13:
                ChannelEventHandlerImpl.typingEventPruner$lambda$1((ChannelEventHandlerImpl) this.f65688x, (Map) obj, (TypingEvent) obj2);
                return C23454a0.f92919a;
            case 14:
                CreatePollDialogFragment.optionsAdapter_delegate$lambda$3$lambda$2((CreatePollDialogFragment) this.f65688x, ((Integer) obj).intValue(), (String) obj2);
                return C23454a0.f92919a;
            case 15:
                return Integer.valueOf(ViewReactionsView.createReactionItems$lambda$4((ViewReactionsView) this.f65688x, (C23465k) obj, (C23465k) obj2));
            case 16:
                return AbstractC20773m0.m57199A((C20777o0) this.f65688x, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                C21194l c21194l = (C21194l) this.f65688x;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                c21194l.f80760e.m87023y(fFloatValue);
                return C23454a0.f92919a;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC21331c.m59869i((C21332d) this.f65688x, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC21422f.m60273q((C21425i) this.f65688x, (Composer) obj, ((Integer) obj2).intValue());
            case 20:
                return PostPartumFragment.m22109J((PostPartumFragment) this.f65688x, (Composer) obj, ((Integer) obj2).intValue());
            case 21:
                return AbstractC21873d.m62024n((C21874e) this.f65688x, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return IntegrationsFragment.m22259S((IntegrationsFragment) this.f65688x, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return VideoCallFragment.m27834E((VideoCallFragment) this.f65688x, (Composer) obj, ((Integer) obj2).intValue());
            case 24:
                return WhoopLabsFragment.m28550S((WhoopLabsFragment) this.f65688x, (Composer) obj, ((Integer) obj2).intValue());
            case 25:
                return C22098c.m63251B((C22098c) this.f65688x, (Composer) obj, ((Integer) obj2).intValue());
            case 26:
                return GiftHubFragment.m25382I((GiftHubFragment) this.f65688x, (Composer) obj, ((Integer) obj2).intValue());
            case 27:
                return AbstractC22350a.m64239h((HeightPickerModel) this.f65688x, ((Integer) obj).intValue(), (UnitSystem) obj2);
            case 28:
                return C22356f.m64255E((C22356f) this.f65688x, (Composer) obj, ((Integer) obj2).intValue());
            default:
                return AdvancedLabsFragment.m17689E((AdvancedLabsFragment) this.f65688x, (Composer) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ C17098f(InterfaceC22297a interfaceC22297a, int i13) {
        this.f65687w = 4;
        this.f65688x = interfaceC22297a;
    }
}
