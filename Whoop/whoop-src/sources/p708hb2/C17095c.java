package p708hb2;

import a13.EnumC0147e;
import androidx.constraintlayout.widget.C1153p;
import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.AbstractC1640x1;
import b30.C2544i5;
import bc3.AbstractC3006f0;
import bc3.InterfaceC3027k1;
import com.stripe.android.paymentsheet.addresselement.AddressElementActivity;
import com.whoop.advancedlabs.multiconsentscreen.view.MultiConsentFragment;
import com.whoop.advancedlabs.typeformwebview.view.AdvancedLabsTypeformWebviewFragment;
import com.whoop.design.showcase.shared.view.DesignShowcaseView;
import com.whoop.editactivities.view.EditActivitiesDrawerFragment;
import com.whoop.p069ui.teams.TeamsShowInviteActivity;
import com.whoop.settings.debug.AiChatTalkTextCardDebugFragment;
import e93.AbstractC12889b;
import ef0.AbstractC13142a;
import ef0.C13144c;
import fd0.AbstractC14397a;
import fd0.C14398b;
import ff0.AbstractC14424a;
import ge1.InterfaceC15733b;
import gf.C15769j;
import h20.C16670i0;
import i20.C17937e;
import i20.C17954j1;
import i20.C17982v0;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.api2.MoshiChatApi;
import io.getstream.chat.android.client.api2.model.response.QueryChannelsResponse;
import io.getstream.chat.android.client.events.ChatEvent;
import io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao_Impl;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao_Impl;
import io.getstream.chat.android.client.internal.state.plugin.factory.C19288x3c221bbd;
import io.getstream.chat.android.client.internal.state.plugin.factory.StreamStatePluginFactory;
import io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelEventHandlerImpl;
import io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.TypingEventPruner;
import io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.ChannelStateImpl;
import io.getstream.chat.android.client.notifications.ChatNotificationsImpl;
import io.getstream.chat.android.models.ChannelData;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.MessageReminder;
import io.getstream.chat.android.models.Option;
import io.getstream.chat.android.models.querysort.QuerySorter;
import io.getstream.chat.android.p226ui.common.state.messages.poll.PollResultsViewState;
import io.getstream.chat.android.p226ui.common.state.threads.ThreadListState;
import io.getstream.chat.android.p226ui.databinding.StreamUiMessageReplyViewBinding;
import io.getstream.chat.android.p226ui.feature.channels.ChannelListActivity;
import io.getstream.chat.android.p226ui.feature.channels.ChannelListFragment;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.media.internal.MediaAttachmentFragment;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.MessageReplyView;
import io.getstream.chat.android.p226ui.feature.messages.list.internal.poll.AllPollOptionsDialogFragment;
import io.getstream.chat.android.p226ui.feature.messages.list.internal.poll.PollResultsDialogFragment;
import io.getstream.chat.android.p226ui.feature.threads.list.ThreadListView;
import io.getstream.chat.android.p226ui.viewmodel.mentions.MentionListViewModel;
import io.getstream.chat.android.p226ui.viewmodel.threads.ThreadListViewModelBinding;
import java.util.Date;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import p114eb.AbstractC12958g1;
import p114eb.C12953f;
import p114eb.C12974m;
import p114eb.C12987s0;
import p193hf.C17231h;
import p500tb.InterfaceC33687a;
import p602x1.C37816b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import rq0.C31665f1;
import wb3.AbstractC37056f;
import y31.C39192a;

/* JADX INFO: renamed from: hb2.c */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C17095c implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f65680w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f65681x;

    public /* synthetic */ C17095c(Object obj, int i13) {
        this.f65680w = i13;
        this.f65681x = obj;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f65680w) {
            case 0:
                return AiChatTalkTextCardDebugFragment.m25365E((AiChatTalkTextCardDebugFragment) this.f65681x, (C39192a) obj);
            case 1:
                return DesignShowcaseView.m21258r((DesignShowcaseView) this.f65681x, obj);
            case 2:
                return EditActivitiesDrawerFragment.m21345O((EditActivitiesDrawerFragment) this.f65681x, (InterfaceC15733b) obj);
            case 3:
                C17231h c17231h = (C17231h) this.f65681x;
                Map.Entry entry = (Map.Entry) obj;
                AbstractC22676k.m65750j(entry, "<destruct>");
                return new C15769j(c17231h.f66218x.invoke(entry.getKey()), c17231h.f66220z.invoke(entry.getValue()));
            case 4:
                return TeamsShowInviteActivity.m27384S((TeamsShowInviteActivity) this.f65681x, (C31665f1) obj);
            case 5:
                AddressElementActivity addressElementActivity = (AddressElementActivity) this.f65681x;
                C12987s0 NavHost = (C12987s0) obj;
                AbstractC22676k.m65750j(NavHost, "$this$NavHost");
                AbstractC12889b.m36290t(NavHost, "InputAddress", null, null, null, null, null, new C37816b(new C17937e(addressElementActivity, 0), true, 538748256), 254);
                C12974m c12974m = new C12974m();
                c12974m.m36462b(AbstractC12958g1.f44770o);
                AbstractC12889b.m36290t(NavHost, "Autocomplete?country={country}", AbstractC37056f.m118958J(new C12953f("country", c12974m.f44811a.m36452a())), null, null, null, null, new C37816b(new C17937e(addressElementActivity, 1), true, 501268297), 252);
                return C23454a0.f92919a;
            case 6:
                C17982v0 c17982v0 = (C17982v0) this.f65681x;
                String it = (String) obj;
                AbstractC22676k.m65750j(it, "it");
                AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(c17982v0), null, null, new C16670i0(c17982v0, it, (InterfaceC30057d) null, 9), 3);
                return C23454a0.f92919a;
            case 7:
                C17954j1 c17954j1 = (C17954j1) this.f65681x;
                AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(c17954j1), null, null, new C2544i5(c17954j1, ((Boolean) obj).booleanValue(), (InterfaceC30057d) null, 2), 3);
                return C23454a0.f92919a;
            case 8:
                return MultiConsentFragment.m17500O((C14398b) this.f65681x, (AbstractC14397a) obj);
            case 9:
                return AdvancedLabsTypeformWebviewFragment.m17676V((AdvancedLabsTypeformWebviewFragment) this.f65681x, (AbstractC14424a) obj);
            case 10:
                return AdvancedLabsTypeformWebviewFragment.m17677W((C13144c) this.f65681x, (AbstractC13142a) obj);
            case 11:
                return Boolean.valueOf(ChatClient.subscribeFor$lambda$46((String[]) this.f65681x, (ChatEvent) obj));
            case 12:
                return Boolean.valueOf(ChatClient.subscribeForSingle$lambda$52((Class) this.f65681x, (ChatEvent) obj));
            case 13:
                return Boolean.valueOf(ChatClient.subscribeFor$lambda$49((Class[]) this.f65681x, (ChatEvent) obj));
            case 14:
                return MoshiChatApi.queryChannels$lambda$82$lambda$81((MoshiChatApi) this.f65681x, (QueryChannelsResponse) obj);
            case 15:
                return ChannelConfigDao_Impl.m54690b((ChannelConfigDao_Impl) this.f65681x, (InterfaceC33687a) obj);
            case 16:
                return MessageDao_Impl.m54701D((MessageDao_Impl) this.f65681x, (InterfaceC33687a) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return StreamStatePluginFactory.createStatePlugin$lambda$3((C19288x3c221bbd) this.f65681x, (InterfaceC3027k1) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return ChannelEventHandlerImpl.updateReminder$lambda$4((MessageReminder) this.f65681x, (Message) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                TypingEventPruner.addTypingEvent$lambda$0((TypingEventPruner) this.f65681x, (String) obj);
                return C23454a0.f92919a;
            case 20:
                return ChannelStateImpl.deleteChannel$lambda$149((Date) this.f65681x, (ChannelData) obj);
            case 21:
                return ChannelStateImpl.m54837z((ChannelStateImpl) this.f65681x, (List) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ChatNotificationsImpl.permissionManager$lambda$1((ChatNotificationsImpl) this.f65681x, (EnumC0147e) obj);
                return C23454a0.f92919a;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ChannelListActivity.createChannelListFragment$lambda$0((ChannelListActivity) this.f65681x, (ChannelListFragment.Builder) obj);
                return C23454a0.f92919a;
            case 24:
                MediaAttachmentFragment.requestPermissions$lambda$4((MediaAttachmentFragment) this.f65681x, (Map) obj);
                return C23454a0.f92919a;
            case 25:
                MessageReplyView.setAvatarPosition$lambda$4$lambda$1((StreamUiMessageReplyViewBinding) this.f65681x, (C1153p) obj);
                return C23454a0.f92919a;
            case 26:
                AllPollOptionsDialogFragment.setupDialog$lambda$1((AllPollOptionsDialogFragment) this.f65681x, (Option) obj);
                return C23454a0.f92919a;
            case 27:
                PollResultsDialogFragment.observeState$lambda$4((PollResultsDialogFragment) this.f65681x, (PollResultsViewState) obj);
                return C23454a0.f92919a;
            case 28:
                return MentionListViewModel._init_$lambda$0((QuerySorter) this.f65681x, (AbstractC1637w1) obj);
            default:
                ThreadListViewModelBinding.bindView$lambda$0((ThreadListView) this.f65681x, (ThreadListState) obj);
                return C23454a0.f92919a;
        }
    }
}
