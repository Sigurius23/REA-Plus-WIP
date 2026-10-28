package io.getstream.chat.android.client.internal.state.plugin.state.channel.internal;

import androidx.health.platform.client.proto.C1533u;
import bc3.InterfaceC3027k1;
import fi.C14499e;
import io.getstream.chat.android.client.channel.state.ChannelState;
import io.getstream.chat.android.client.events.ChatEvent;
import io.getstream.chat.android.client.internal.state.sync.internal.SyncManager;
import io.getstream.chat.android.client.notifications.handler.ChatNotificationHandler;
import io.getstream.chat.android.client.persistence.p225db.dao.MessageReceiptDao_Impl;
import io.getstream.chat.android.client.plugins.requests.ApiRequestsDumper;
import io.getstream.chat.android.client.utils.observable.ChatEventsObservable;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.ChannelData;
import io.getstream.chat.android.models.ChannelUserRead;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.common.feature.channel.attachments.ChannelAttachmentsViewController;
import io.getstream.chat.android.p226ui.common.feature.channel.info.ChannelInfoViewController;
import io.getstream.chat.android.p226ui.common.feature.messages.composer.MessageComposerController;
import io.getstream.chat.android.p226ui.common.feature.messages.list.MessageListController;
import io.getstream.chat.android.p226ui.common.feature.threads.ThreadListController;
import io.getstream.chat.android.p226ui.common.images.internal.CoilStreamImageLoader;
import io.getstream.chat.android.p226ui.common.state.channel.info.ChannelInfoViewState;
import io.getstream.chat.android.p226ui.common.utils.extensions.ChannelKt;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import l83.C23465k;
import n23.AbstractC26205h;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.c */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C19336c implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73907w;

    public /* synthetic */ C19336c(int i13) {
        this.f73907w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        switch (this.f73907w) {
            case 0:
                return ChannelStateLegacyImpl.members$lambda$35((Collection) obj);
            case 1:
                return Boolean.valueOf(ChannelStateLegacyImpl.messagesTransformation$lambda$15$lambda$12((Message) obj));
            case 2:
                return ChannelStateLegacyImpl.sortedMessages$lambda$22((Map) obj);
            case 3:
                return ChannelStateLegacyImpl.sortedPinnedMessages$lambda$24((Map) obj);
            case 4:
                return ChannelStateLegacyImpl.messageCount$lambda$2((ChannelData) obj);
            case 5:
                return ChannelStateLegacyImpl.watchers$lambda$27((List) obj);
            case 6:
                return ChannelStateLegacyImpl.reads$lambda$29((Map) obj);
            case 7:
                return Integer.valueOf(ChannelStateLegacyImpl.unreadCount$lambda$32((ChannelUserRead) obj));
            case 8:
                return SyncManager.updateActiveChannels$lambda$69((ChannelState) obj);
            case 9:
                return ChatNotificationHandler.m54876d((User) obj);
            case 10:
                MessageReceiptDao_Impl.deleteAll$lambda$3("DELETE FROM message_receipt", (InterfaceC33687a) obj);
                return C23454a0.f92919a;
            case 11:
                return ApiRequestsDumper.m54911a((Map.Entry) obj);
            case 12:
                ChatEventsObservable.subscribe$lambda$0((ChatEvent) obj);
                return Boolean.TRUE;
            case 13:
                ChatEventsObservable.subscribeSingle$lambda$2((ChatEvent) obj);
                return Boolean.TRUE;
            case 14:
                ChannelAttachmentsViewController._init_$lambda$0((Attachment) obj);
                return Boolean.TRUE;
            case 15:
                ChannelInfoViewController.removeMember$lambda$35((Channel) obj);
                return C23454a0.f92919a;
            case 16:
                ChannelInfoViewController._init_$lambda$0((ChannelInfoViewState.Content.Option) obj);
                return Boolean.TRUE;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return ChannelInfoViewController.expandMembers$lambda$13((ChannelInfoViewState.Content) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return ChannelInfoViewController.collapseMembers$lambda$15((ChannelInfoViewState.Content) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return MessageComposerController._init_$lambda$12((C23465k) obj);
            case 20:
                MessageComposerController.createPoll$lambda$37((AbstractC26205h) obj);
                return C23454a0.f92919a;
            case 21:
                MessageListController.flagMessage$lambda$92((AbstractC26205h) obj);
                return C23454a0.f92919a;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                MessageListController.loadMessageById$lambda$68((AbstractC26205h) obj);
                return C23454a0.f92919a;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                MessageListController.markUnread$lambda$95((AbstractC26205h) obj);
                return C23454a0.f92919a;
            case 24:
                return ThreadListController.m55066a((InterfaceC3027k1) obj);
            case 25:
                CoilStreamImageLoader.loadDisposables$lambda$15((C14499e) obj);
                return C23454a0.f92919a;
            case 26:
                return ChannelKt.m55085e((User) obj);
            case 27:
                return Boolean.valueOf(ChannelKt.getPreviewMessage$lambda$0((Message) obj));
            case 28:
                return Boolean.valueOf(ChannelKt.getPreviewMessage$lambda$1((Message) obj));
            default:
                return Boolean.valueOf(ChannelKt.getPreviewMessage$lambda$3((Message) obj));
        }
    }
}
