package io.getstream.chat.android.client.api2;

import android.widget.TextView;
import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;
import io.getstream.chat.android.client.api2.mapping.DomainMapping;
import io.getstream.chat.android.client.api2.model.dto.AttachmentDto;
import io.getstream.chat.android.client.api2.model.response.DevicesResponse;
import io.getstream.chat.android.client.api2.model.response.MessageResponse;
import io.getstream.chat.android.client.api2.model.response.PollResponse;
import io.getstream.chat.android.client.api2.model.response.QueryDraftMessagesResponse;
import io.getstream.chat.android.client.api2.model.response.QueryRemindersResponse;
import io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelEventHandlerImpl;
import io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.ChannelStateImpl;
import io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.ChannelStateLegacyImpl;
import io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.MessagesPaginationState;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.ChatUI;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem;
import io.getstream.chat.android.p226ui.viewmodel.messages.MessageListViewModel;
import j11.C21198a;
import j11.C21199b;
import j11.C21200c;
import java.util.List;
import java.util.Map;
import jp2.C21870a;
import js2.C21923a;
import jx2.AbstractC22042f;
import k03.C22096a;
import l83.C23454a0;

/* JADX INFO: renamed from: io.getstream.chat.android.client.api2.d */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C19054d implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73745w;

    public /* synthetic */ C19054d(int i13) {
        this.f73745w = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f73745w) {
            case 0:
                return MoshiChatApi.deleteReaction$lambda$28((DomainMapping) obj, (MessageResponse) obj2);
            case 1:
                return MoshiChatApi.queryReminders$lambda$120((DomainMapping) obj, (QueryRemindersResponse) obj2);
            case 2:
                return MoshiChatApi.updatePoll$lambda$116((DomainMapping) obj, (PollResponse) obj2);
            case 3:
                return MoshiChatApi.m54588a((DomainMapping) obj, (DevicesResponse) obj2);
            case 4:
                return MoshiChatApi.sendMessage$lambda$6((DomainMapping) obj, (MessageResponse) obj2);
            case 5:
                return MoshiChatApi.m54582U((DomainMapping) obj, (QueryDraftMessagesResponse) obj2);
            case 6:
                return MoshiChatApi.og$lambda$73((DomainMapping) obj, (AttachmentDto) obj2);
            case 7:
                return ChannelEventHandlerImpl.updateMessageWithReaction$lambda$6((Message) obj, (Message) obj2);
            case 8:
                return ChannelStateImpl.messagesState$lambda$7(((Boolean) obj).booleanValue(), (List) obj2);
            case 9:
                return ChannelStateImpl.m54816e((List) obj, (Map) obj2);
            case 10:
                return ChannelStateImpl.read$lambda$11((Map) obj, (User) obj2);
            case 11:
                return ChannelStateImpl.members$lambda$14((List) obj, (Map) obj2);
            case 12:
                return ChannelStateImpl.localOnlyMessagesInRange$lambda$1((List) obj, (MessagesPaginationState) obj2);
            case 13:
                return ChannelStateLegacyImpl.m54848k((Map) obj, (Map) obj2);
            case 14:
                return ChannelStateLegacyImpl.m54858u((Map) obj, (Map) obj2);
            case 15:
                return ChannelStateLegacyImpl.messagesState$lambda$10(((Boolean) obj).booleanValue(), (List) obj2);
            case 16:
                return ChannelStateLegacyImpl.m54855r((Map) obj, (Map) obj2);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return ChannelStateLegacyImpl.read$lambda$31((Map) obj, (User) obj2);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                ChatUI.messageTextTransformer_delegate$lambda$2$lambda$1((TextView) obj, (MessageListItem.MessageItem) obj2);
                return C23454a0.f92919a;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return Boolean.valueOf(MessageListViewModel.targetMessage$lambda$3((Message) obj, (Message) obj2));
            case 20:
                return C21198a.m59430c((Composer) obj, ((Integer) obj2).intValue());
            case 21:
                return C21199b.m59433c((Composer) obj, ((Integer) obj2).intValue());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return C21200c.m59439h((Composer) obj, ((Integer) obj2).intValue());
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return C21200c.m59440i((Composer) obj, ((Integer) obj2).intValue());
            case 24:
                return C21200c.m59438g((Composer) obj, ((Integer) obj2).intValue());
            case 25:
                return C21870a.m61998c((Composer) obj, ((Integer) obj2).intValue());
            case 26:
                return C21923a.m62410c((Composer) obj, ((Integer) obj2).intValue());
            case 27:
                return AbstractC22042f.m63044Y((String) obj, (String) obj2);
            case 28:
                return C22096a.m63248f((Composer) obj, ((Integer) obj2).intValue());
            default:
                return C22096a.m63247e((Composer) obj, ((Integer) obj2).intValue());
        }
    }
}
