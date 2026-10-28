package io.getstream.chat.android.p226ui.viewmodel.messages;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.AbstractC1640x1;
import androidx.lifecycle.C1627t0;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c13.AbstractC3855a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ch.C4588i;
import com.whoop.service.network.model.UserState;
import d13.AbstractC11478a;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13060l1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fc3.AbstractC14371b;
import hc3.AbstractC17176i;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.api.state.ChatClientExtensions;
import io.getstream.chat.android.client.api.state.Event;
import io.getstream.chat.android.client.api2.C19054d;
import io.getstream.chat.android.client.errors.ChatErrorKt;
import io.getstream.chat.android.client.internal.offline.repository.domain.queryChannels.internal.C19223a;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.Option;
import io.getstream.chat.android.models.Poll;
import io.getstream.chat.android.models.Reaction;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.common.feature.messages.list.DateSeparatorHandler;
import io.getstream.chat.android.p226ui.common.feature.messages.list.MessageListController;
import io.getstream.chat.android.p226ui.common.feature.messages.list.MessagePositionHandler;
import io.getstream.chat.android.p226ui.common.state.messages.MessageMode;
import io.getstream.chat.android.p226ui.common.state.messages.list.GiphyAction;
import io.getstream.chat.android.p226ui.common.state.messages.list.MessageFocused;
import io.getstream.chat.android.p226ui.common.state.messages.list.MessageFooterVisibility;
import io.getstream.chat.android.p226ui.common.state.messages.list.MessageItemState;
import io.getstream.chat.android.p226ui.common.state.messages.list.MessageListItemState;
import io.getstream.chat.android.p226ui.common.state.messages.list.MessageListState;
import io.getstream.chat.android.p226ui.common.utils.extensions.C19616a;
import io.getstream.chat.android.p226ui.model.MessageListItemWrapper;
import io.getstream.chat.android.p226ui.utils.extensions.MessageListStateKt;
import java.util.Iterator;
import java.util.Map;
import jh3.AbstractC21702c;
import l83.C23454a0;
import l83.C23465k;
import l83.InterfaceC23462h;
import m83.C25272z;
import n23.AbstractC26202e;
import n23.AbstractC26205h;
import n23.C26203f;
import n23.C26204g;
import o23.AbstractC27476f;
import o23.InterfaceC27474d;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p319m4.AbstractC25012a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import te0.AbstractC33745d;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002~\u007fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001f\u0010\u001dJ\u0015\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020\n2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0015\u0010*\u001a\u00020\n2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\n¢\u0006\u0004\b,\u0010\u0018J\u000f\u0010-\u001a\u00020\nH\u0014¢\u0006\u0004\b-\u0010\u0018J\u0017\u0010/\u001a\u00020\n2\u0006\u0010\t\u001a\u00020.H\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\nH\u0002¢\u0006\u0004\b1\u0010\u0018J#\u00103\u001a\u00020\n2\b\u00102\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\nH\u0002¢\u0006\u0004\b5\u0010\u0018J\u0017\u00107\u001a\u00020\n2\u0006\u00106\u001a\u00020\u000fH\u0002¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\n2\u0006\u00109\u001a\u00020\u000fH\u0002¢\u0006\u0004\b:\u00108J1\u0010>\u001a\u00020\n2\u0006\u00109\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020\r2\b\u0010<\u001a\u0004\u0018\u00010\r2\u0006\u0010=\u001a\u00020(H\u0002¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\nH\u0002¢\u0006\u0004\b@\u0010\u0018J\u0015\u0010C\u001a\u0004\u0018\u00010B*\u00020AH\u0002¢\u0006\u0004\bC\u0010DR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010E\u001a\u0004\bF\u0010GR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010HR\u001b\u0010N\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001f\u0010Q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010P0O8\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u001d\u0010W\u001a\b\u0012\u0004\u0012\u00020V0U8\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR#\u0010\\\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0[0U8\u0006¢\u0006\f\n\u0004\b\\\u0010X\u001a\u0004\b]\u0010ZR\u001d\u0010^\u001a\b\u0012\u0004\u0012\u00020(0U8\u0006¢\u0006\f\n\u0004\b^\u0010X\u001a\u0004\b_\u0010ZR\u001d\u0010`\u001a\b\u0012\u0004\u0012\u00020$0U8\u0006¢\u0006\f\n\u0004\b`\u0010X\u001a\u0004\ba\u0010ZR\u001a\u0010c\u001a\b\u0012\u0004\u0012\u00020A0b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u001d\u0010e\u001a\b\u0012\u0004\u0012\u00020A0U8\u0006¢\u0006\f\n\u0004\be\u0010X\u001a\u0004\bf\u0010ZR\u001d\u0010h\u001a\b\u0012\u0004\u0012\u00020g0U8\u0006¢\u0006\f\n\u0004\bh\u0010X\u001a\u0004\bi\u0010ZR\u001d\u0010j\u001a\b\u0012\u0004\u0012\u00020(0U8\u0006¢\u0006\f\n\u0004\bj\u0010X\u001a\u0004\bk\u0010ZR\u001d\u0010l\u001a\b\u0012\u0004\u0012\u00020\u000f0U8\u0006¢\u0006\f\n\u0004\bl\u0010X\u001a\u0004\bm\u0010ZR#\u0010p\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020o0n0U8\u0006¢\u0006\f\n\u0004\bp\u0010X\u001a\u0004\bq\u0010ZR\u001f\u0010s\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010r0U8\u0006¢\u0006\f\n\u0004\bs\u0010X\u001a\u0004\bt\u0010ZR\u001d\u0010u\u001a\b\u0012\u0004\u0012\u00020\u00120U8\u0006¢\u0006\f\n\u0004\bu\u0010X\u001a\u0004\bv\u0010ZR\u001d\u0010w\u001a\b\u0012\u0004\u0012\u00020(0U8\u0006¢\u0006\f\n\u0004\bw\u0010X\u001a\u0004\bx\u0010ZR\u001d\u0010y\u001a\b\u0012\u0004\u0012\u00020(0U8\u0006¢\u0006\f\n\u0004\by\u0010X\u001a\u0004\bz\u0010ZR\u001d\u0010|\u001a\b\u0012\u0004\u0012\u00020{0U8\u0006¢\u0006\f\n\u0004\b|\u0010X\u001a\u0004\b}\u0010Z¨\u0006\u0080\u0001"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;", "Landroidx/lifecycle/w1;", "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;", "messageListController", "Lio/getstream/chat/android/client/ChatClient;", "chatClient", "<init>", "(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/client/ChatClient;)V", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "onEvent", "(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;)V", "", "messageId", "Lio/getstream/chat/android/models/Message;", "getMessageById", "(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;", "", "messageLimit", "Lkotlin/Function0;", "scrollToBottom", "(ILc93/a;)V", "scrollToFirstUnreadMessage", "()V", "hideUnreadSeparator", "Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;", "dateSeparatorHandler", "setDateSeparatorHandler", "(Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;)V", "threadDateSeparatorHandler", "setThreadDateSeparatorHandler", "Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;", "messagePositionHandler", "setMessagePositionHandler", "(Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;)V", "Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;", "messageFooterVisibility", "setMessageFooterVisibility", "(Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;)V", "", "showSystemMessages", "setAreSystemMessagesVisible", "(Z)V", "pauseAudioRecordingAttachments", "onCleared", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$GiphyActionSelected;", "onGiphyActionSelected", "(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$GiphyActionSelected;)V", "onEndRegionReached", "baseMessageId", "onBottomEndRegionReached", "(Ljava/lang/String;I)V", "onBackButtonPressed", "parentMessage", "onThreadModeEntered", "(Lio/getstream/chat/android/models/Message;)V", "message", "onOpenThread", "reactionType", "emojiCode", "skipPush", "onMessageReaction", "(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Z)V", "onNormalModeEntered", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$State;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$State$Result;", "asResultOrNull", "(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$State;)Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$State$Result;", "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;", "getMessageListController$stream_chat_android_ui_components_release", "()Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;", "Lio/getstream/chat/android/client/ChatClient;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "Lec3/f2;", "Lio/getstream/chat/android/client/channel/state/ChannelState;", "channelState", "Lec3/f2;", "getChannelState", "()Lec3/f2;", "Landroidx/lifecycle/p0;", "Lio/getstream/chat/android/models/Channel;", "channel", "Landroidx/lifecycle/p0;", "getChannel", "()Landroidx/lifecycle/p0;", "", "ownCapabilities", "getOwnCapabilities", "showSystemMessagesState", "getShowSystemMessagesState", "messageFooterVisibilityState", "getMessageFooterVisibilityState", "Landroidx/lifecycle/t0;", "stateMerger", "Landroidx/lifecycle/t0;", "state", "getState", "Lio/getstream/chat/android/ui/common/state/messages/MessageMode;", "mode", "getMode", "loadMoreLiveData", "getLoadMoreLiveData", "targetMessage", "getTargetMessage", "Lio/getstream/chat/android/client/api/state/Event;", "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;", "errorEvents", "getErrorEvents", "Lio/getstream/chat/android/models/User;", UserState.Sources.USER, "getUser", "unreadCount", "getUnreadCount", "insideSearch", "getInsideSearch", "shouldRequestMessagesAtBottom", "getShouldRequestMessagesAtBottom", "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;", "unreadLabel", "getUnreadLabel", "State", "Event", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageListViewModel extends AbstractC1637w1 {
    private final AbstractC1615p0 channel;
    private final InterfaceC13037f2 channelState;
    private final ChatClient chatClient;
    private final AbstractC1615p0 errorEvents;
    private final AbstractC1615p0 insideSearch;
    private final AbstractC1615p0 loadMoreLiveData;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final AbstractC1615p0 messageFooterVisibilityState;
    private final MessageListController messageListController;
    private final AbstractC1615p0 mode;
    private final AbstractC1615p0 ownCapabilities;
    private final AbstractC1615p0 shouldRequestMessagesAtBottom;
    private final AbstractC1615p0 showSystemMessagesState;
    private final AbstractC1615p0 state;
    private final C1627t0 stateMerger;
    private final AbstractC1615p0 targetMessage;
    private final AbstractC1615p0 unreadCount;
    private final AbstractC1615p0 unreadLabel;
    private final AbstractC1615p0 user;

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.viewmodel.messages.MessageListViewModel$1 */
    /* JADX INFO: loaded from: classes3.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.viewmodel.messages.MessageListViewModel$1", m100430f = "MessageListViewModel.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C199271 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        public C199271(InterfaceC30057d<? super C199271> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C23454a0 invokeSuspend$lambda$1(MessageListViewModel messageListViewModel, State state) {
            messageListViewModel.stateMerger.setValue(state);
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return MessageListViewModel.this.new C199271(interfaceC30057d);
        }

        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C199271 c199271 = (C199271) create(interfaceC2994c0, interfaceC30057d);
            C23454a0 c23454a0 = C23454a0.f92919a;
            c199271.invokeSuspend(c23454a0);
            return c23454a0;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            final C13015a0 c13015a0 = new C13015a0(new MessageListViewModel$1$listState$2(2, null), AbstractC13091v.m36608r(new C13060l1(MessageListViewModel.this.getMessageListController().getListState(), MessageListViewModel.this.getMessageListController().getMode(), new MessageListViewModel$1$listState$1(3, null), 1), 5L));
            final MessageListViewModel messageListViewModel = MessageListViewModel.this;
            MessageListViewModel.this.stateMerger.m5035b(AbstractC1613o1.m5012b(new InterfaceC13058l() { // from class: io.getstream.chat.android.ui.viewmodel.messages.MessageListViewModel$1$invokeSuspend$$inlined$map$1

                /* JADX INFO: renamed from: io.getstream.chat.android.ui.viewmodel.messages.MessageListViewModel$1$invokeSuspend$$inlined$map$1$2 */
                @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
                public static final class C199282<T> implements InterfaceC13062m {
                    final /* synthetic */ InterfaceC13062m $this_unsafeFlow;
                    final /* synthetic */ MessageListViewModel this$0;

                    /* JADX INFO: renamed from: io.getstream.chat.android.ui.viewmodel.messages.MessageListViewModel$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.viewmodel.messages.MessageListViewModel$1$invokeSuspend$$inlined$map$1$2", m100430f = "MessageListViewModel.kt", m100431l = {50}, m100432m = "emit")
                    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
                    public static final class AnonymousClass1 extends AbstractC32269c {
                        int I$0;
                        Object L$0;
                        Object L$1;
                        Object L$2;
                        Object L$3;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(InterfaceC30057d interfaceC30057d) {
                            super(interfaceC30057d);
                        }

                        @Override // s83.AbstractC32267a
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return C199282.this.emit(null, this);
                        }
                    }

                    public C199282(InterfaceC13062m interfaceC13062m, MessageListViewModel messageListViewModel) {
                        this.$this_unsafeFlow = interfaceC13062m;
                        this.this$0 = messageListViewModel;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // ec3.InterfaceC13062m
                    public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                        AnonymousClass1 anonymousClass1;
                        Object result;
                        MessageListViewModel.State.Result resultAsResultOrNull;
                        MessageListItemWrapper messageListItem;
                        if (interfaceC30057d instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) interfaceC30057d;
                            int i13 = anonymousClass1.label;
                            if ((i13 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i13 - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(interfaceC30057d);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC30057d);
                        }
                        Object obj2 = anonymousClass1.result;
                        EnumC31071a enumC31071a = EnumC31071a.f128113w;
                        int i14 = anonymousClass1.label;
                        if (i14 == 0) {
                            AbstractC34132o.m107864I(obj2);
                            InterfaceC13062m interfaceC13062m = this.$this_unsafeFlow;
                            C23465k c23465k = (C23465k) obj;
                            if (((MessageListState) c23465k.f92937w).isLoading()) {
                                result = MessageListViewModel.State.Loading.INSTANCE;
                            } else {
                                MessageListState messageListState = (MessageListState) c23465k.f92937w;
                                boolean z4 = c23465k.f92938x instanceof MessageMode.MessageThread;
                                MessageListViewModel.State state = (MessageListViewModel.State) this.this$0.stateMerger.getValue();
                                result = new MessageListViewModel.State.Result(MessageListStateKt.toMessageListItemWrapper(messageListState, z4, (state == null || (resultAsResultOrNull = this.this$0.asResultOrNull(state)) == null || (messageListItem = resultAsResultOrNull.getMessageListItem()) == null) ? null : messageListItem.getNewMessageState$stream_chat_android_ui_components_release()));
                            }
                            anonymousClass1.L$0 = null;
                            anonymousClass1.L$1 = null;
                            anonymousClass1.L$2 = null;
                            anonymousClass1.L$3 = null;
                            anonymousClass1.I$0 = 0;
                            anonymousClass1.label = 1;
                            if (interfaceC13062m.emit(result, anonymousClass1) == enumC31071a) {
                                return enumC31071a;
                            }
                        } else {
                            if (i14 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC34132o.m107864I(obj2);
                        }
                        return C23454a0.f92919a;
                    }
                }

                @Override // ec3.InterfaceC13058l
                public final Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                    Object objCollect = c13015a0.collect(new C199282(interfaceC13062m, messageListViewModel), interfaceC30057d);
                    return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
                }
            }, null, 3), new MessageListViewModel$sam$androidx_lifecycle_Observer$0(new C19943g(MessageListViewModel.this, 0)));
            return C23454a0.f92919a;
        }

        @Override // c93.InterfaceC4351m
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2994c0) obj, (InterfaceC30057d<? super C23454a0>) obj2);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(m65680d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:#\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001#'()*+,-./0123456789:;<=>?@ABCDEFGHI¨\u0006J"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;", "", "<init>", "()V", "BackButtonPressed", "EndRegionReached", "BottomEndRegionReached", "LastMessageRead", "ThreadModeEntered", "OpenThread", "ToggleOriginalText", "DeleteMessage", "FlagMessage", "PinMessage", "UnpinMessage", "MarkAsUnreadMessage", "GiphyActionSelected", "RetryMessage", "MessageReaction", "MuteUser", "UnmuteUser", "BanUser", "UnbanUser", "ShadowBanUser", "RemoveShadowBanFromUser", "FlagUser", "UnflagUser", "ReplyMessage", "ReplyAttachment", "DownloadAttachment", "ShowMessage", "RemoveAttachment", "HideUnreadLabel", "BlockUser", "UnblockUser", "PollOptionUpdated", "PollClosed", "PollOptionSuggested", "PollAnswerCast", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$BackButtonPressed;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$BanUser;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$BlockUser;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$BottomEndRegionReached;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$DeleteMessage;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$DownloadAttachment;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$EndRegionReached;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$FlagMessage;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$FlagUser;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$GiphyActionSelected;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$HideUnreadLabel;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$LastMessageRead;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$MarkAsUnreadMessage;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$MessageReaction;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$MuteUser;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$OpenThread;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PinMessage;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollAnswerCast;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollClosed;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollOptionSuggested;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollOptionUpdated;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$RemoveAttachment;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$RemoveShadowBanFromUser;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ReplyAttachment;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ReplyMessage;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$RetryMessage;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ShadowBanUser;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ShowMessage;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ThreadModeEntered;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ToggleOriginalText;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$UnbanUser;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$UnblockUser;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$UnflagUser;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$UnmuteUser;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$UnpinMessage;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static abstract class Event {

        @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$BackButtonPressed;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class BackButtonPressed extends Event {
            public static final BackButtonPressed INSTANCE = new BackButtonPressed();

            private BackButtonPressed() {
            }

            public final boolean equals(Object other) {
                return this == other || (other instanceof BackButtonPressed);
            }

            public final int hashCode() {
                return 16179289;
            }

            public final String toString() {
                return "BackButtonPressed";
            }
        }

        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$BlockUser;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;", "userId", "", "<init>", "(Ljava/lang/String;)V", "getUserId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class BlockUser extends Event {
            private final String userId;

            public BlockUser(String userId) {
                AbstractC22676k.m65750j(userId, "userId");
                this.userId = userId;
            }

            public static /* synthetic */ BlockUser copy$default(BlockUser blockUser, String str, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = blockUser.userId;
                }
                return blockUser.copy(str);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getUserId() {
                return this.userId;
            }

            public final BlockUser copy(String userId) {
                AbstractC22676k.m65750j(userId, "userId");
                return new BlockUser(userId);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof BlockUser) && AbstractC22676k.m65745e(this.userId, ((BlockUser) other).userId);
            }

            public final String getUserId() {
                return this.userId;
            }

            public final int hashCode() {
                return this.userId.hashCode();
            }

            public final String toString() {
                return AbstractC11895b.m31996o("BlockUser(userId=", this.userId, ")");
            }
        }

        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$BottomEndRegionReached;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;", "messageId", "", "<init>", "(Ljava/lang/String;)V", "getMessageId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class BottomEndRegionReached extends Event {
            private final String messageId;

            public BottomEndRegionReached(String str) {
                this.messageId = str;
            }

            public static BottomEndRegionReached copy$default(BottomEndRegionReached bottomEndRegionReached, String str, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = bottomEndRegionReached.messageId;
                }
                bottomEndRegionReached.getClass();
                return new BottomEndRegionReached(str);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getMessageId() {
                return this.messageId;
            }

            public final BottomEndRegionReached copy(String messageId) {
                return new BottomEndRegionReached(messageId);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof BottomEndRegionReached) && AbstractC22676k.m65745e(this.messageId, ((BottomEndRegionReached) other).messageId);
            }

            public final String getMessageId() {
                return this.messageId;
            }

            public final int hashCode() {
                String str = this.messageId;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return AbstractC11895b.m31996o("BottomEndRegionReached(messageId=", this.messageId, ")");
            }
        }

        @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ&\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R#\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\t¨\u0006\u0019"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$DownloadAttachment;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;", "Lkotlin/Function0;", "Lo23/d;", "Ll83/a0;", "downloadAttachmentCall", "<init>", "(Lc93/a;)V", "component1", "()Lc93/a;", "copy", "(Lc93/a;)Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$DownloadAttachment;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lc93/a;", "getDownloadAttachmentCall", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class DownloadAttachment extends Event {
            private final InterfaceC4339a downloadAttachmentCall;

            public DownloadAttachment(InterfaceC4339a downloadAttachmentCall) {
                AbstractC22676k.m65750j(downloadAttachmentCall, "downloadAttachmentCall");
                this.downloadAttachmentCall = downloadAttachmentCall;
            }

            public static /* synthetic */ DownloadAttachment copy$default(DownloadAttachment downloadAttachment, InterfaceC4339a interfaceC4339a, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    interfaceC4339a = downloadAttachment.downloadAttachmentCall;
                }
                return downloadAttachment.copy(interfaceC4339a);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final InterfaceC4339a getDownloadAttachmentCall() {
                return this.downloadAttachmentCall;
            }

            public final DownloadAttachment copy(InterfaceC4339a downloadAttachmentCall) {
                AbstractC22676k.m65750j(downloadAttachmentCall, "downloadAttachmentCall");
                return new DownloadAttachment(downloadAttachmentCall);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DownloadAttachment) && AbstractC22676k.m65745e(this.downloadAttachmentCall, ((DownloadAttachment) other).downloadAttachmentCall);
            }

            public final InterfaceC4339a getDownloadAttachmentCall() {
                return this.downloadAttachmentCall;
            }

            public final int hashCode() {
                return this.downloadAttachmentCall.hashCode();
            }

            public final String toString() {
                return AbstractC33745d.m106653l("DownloadAttachment(downloadAttachmentCall=", ")", this.downloadAttachmentCall);
            }
        }

        @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$EndRegionReached;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class EndRegionReached extends Event {
            public static final EndRegionReached INSTANCE = new EndRegionReached();

            private EndRegionReached() {
            }

            public final boolean equals(Object other) {
                return this == other || (other instanceof EndRegionReached);
            }

            public final int hashCode() {
                return -1385284813;
            }

            public final String toString() {
                return "EndRegionReached";
            }
        }

        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$GiphyActionSelected;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;", "action", "Lio/getstream/chat/android/ui/common/state/messages/list/GiphyAction;", "<init>", "(Lio/getstream/chat/android/ui/common/state/messages/list/GiphyAction;)V", "getAction", "()Lio/getstream/chat/android/ui/common/state/messages/list/GiphyAction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class GiphyActionSelected extends Event {
            private final GiphyAction action;

            public GiphyActionSelected(GiphyAction action) {
                AbstractC22676k.m65750j(action, "action");
                this.action = action;
            }

            public static /* synthetic */ GiphyActionSelected copy$default(GiphyActionSelected giphyActionSelected, GiphyAction giphyAction, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    giphyAction = giphyActionSelected.action;
                }
                return giphyActionSelected.copy(giphyAction);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final GiphyAction getAction() {
                return this.action;
            }

            public final GiphyActionSelected copy(GiphyAction action) {
                AbstractC22676k.m65750j(action, "action");
                return new GiphyActionSelected(action);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof GiphyActionSelected) && AbstractC22676k.m65745e(this.action, ((GiphyActionSelected) other).action);
            }

            public final GiphyAction getAction() {
                return this.action;
            }

            public final int hashCode() {
                return this.action.hashCode();
            }

            public final String toString() {
                return "GiphyActionSelected(action=" + this.action + ")";
            }
        }

        @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$HideUnreadLabel;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;", "navigateToFirstUnreadMessage", "", "<init>", "(Z)V", "getNavigateToFirstUnreadMessage", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class HideUnreadLabel extends Event {
            private final boolean navigateToFirstUnreadMessage;

            public HideUnreadLabel(boolean z4) {
                this.navigateToFirstUnreadMessage = z4;
            }

            public static HideUnreadLabel copy$default(HideUnreadLabel hideUnreadLabel, boolean z4, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    z4 = hideUnreadLabel.navigateToFirstUnreadMessage;
                }
                hideUnreadLabel.getClass();
                return new HideUnreadLabel(z4);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final boolean getNavigateToFirstUnreadMessage() {
                return this.navigateToFirstUnreadMessage;
            }

            public final HideUnreadLabel copy(boolean navigateToFirstUnreadMessage) {
                return new HideUnreadLabel(navigateToFirstUnreadMessage);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof HideUnreadLabel) && this.navigateToFirstUnreadMessage == ((HideUnreadLabel) other).navigateToFirstUnreadMessage;
            }

            public final boolean getNavigateToFirstUnreadMessage() {
                return this.navigateToFirstUnreadMessage;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.navigateToFirstUnreadMessage);
            }

            public final String toString() {
                return AbstractC3855a.m11827k("HideUnreadLabel(navigateToFirstUnreadMessage=", ")", this.navigateToFirstUnreadMessage);
            }
        }

        @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$LastMessageRead;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class LastMessageRead extends Event {
            public static final LastMessageRead INSTANCE = new LastMessageRead();

            private LastMessageRead() {
            }

            public final boolean equals(Object other) {
                return this == other || (other instanceof LastMessageRead);
            }

            public final int hashCode() {
                return -1076555977;
            }

            public final String toString() {
                return "LastMessageRead";
            }
        }

        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$MarkAsUnreadMessage;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;", "message", "Lio/getstream/chat/android/models/Message;", "<init>", "(Lio/getstream/chat/android/models/Message;)V", "getMessage", "()Lio/getstream/chat/android/models/Message;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class MarkAsUnreadMessage extends Event {
            private final Message message;

            public MarkAsUnreadMessage(Message message) {
                AbstractC22676k.m65750j(message, "message");
                this.message = message;
            }

            public static /* synthetic */ MarkAsUnreadMessage copy$default(MarkAsUnreadMessage markAsUnreadMessage, Message message, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    message = markAsUnreadMessage.message;
                }
                return markAsUnreadMessage.copy(message);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Message getMessage() {
                return this.message;
            }

            public final MarkAsUnreadMessage copy(Message message) {
                AbstractC22676k.m65750j(message, "message");
                return new MarkAsUnreadMessage(message);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof MarkAsUnreadMessage) && AbstractC22676k.m65745e(this.message, ((MarkAsUnreadMessage) other).message);
            }

            public final Message getMessage() {
                return this.message;
            }

            public final int hashCode() {
                return this.message.hashCode();
            }

            public final String toString() {
                return AbstractC17176i.m48501c(this.message, "MarkAsUnreadMessage(message=", ")");
            }
        }

        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$MuteUser;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "<init>", "(Lio/getstream/chat/android/models/User;)V", "getUser", "()Lio/getstream/chat/android/models/User;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class MuteUser extends Event {
            private final User user;

            public MuteUser(User user) {
                AbstractC22676k.m65750j(user, "user");
                this.user = user;
            }

            public static /* synthetic */ MuteUser copy$default(MuteUser muteUser, User user, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    user = muteUser.user;
                }
                return muteUser.copy(user);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final User getUser() {
                return this.user;
            }

            public final MuteUser copy(User user) {
                AbstractC22676k.m65750j(user, "user");
                return new MuteUser(user);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof MuteUser) && AbstractC22676k.m65745e(this.user, ((MuteUser) other).user);
            }

            public final User getUser() {
                return this.user;
            }

            public final int hashCode() {
                return this.user.hashCode();
            }

            public final String toString() {
                return "MuteUser(user=" + this.user + ")";
            }
        }

        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$OpenThread;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;", "message", "Lio/getstream/chat/android/models/Message;", "<init>", "(Lio/getstream/chat/android/models/Message;)V", "getMessage", "()Lio/getstream/chat/android/models/Message;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class OpenThread extends Event {
            private final Message message;

            public OpenThread(Message message) {
                AbstractC22676k.m65750j(message, "message");
                this.message = message;
            }

            public static /* synthetic */ OpenThread copy$default(OpenThread openThread, Message message, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    message = openThread.message;
                }
                return openThread.copy(message);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Message getMessage() {
                return this.message;
            }

            public final OpenThread copy(Message message) {
                AbstractC22676k.m65750j(message, "message");
                return new OpenThread(message);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OpenThread) && AbstractC22676k.m65745e(this.message, ((OpenThread) other).message);
            }

            public final Message getMessage() {
                return this.message;
            }

            public final int hashCode() {
                return this.message.hashCode();
            }

            public final String toString() {
                return AbstractC17176i.m48501c(this.message, "OpenThread(message=", ")");
            }
        }

        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PinMessage;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;", "message", "Lio/getstream/chat/android/models/Message;", "<init>", "(Lio/getstream/chat/android/models/Message;)V", "getMessage", "()Lio/getstream/chat/android/models/Message;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class PinMessage extends Event {
            private final Message message;

            public PinMessage(Message message) {
                AbstractC22676k.m65750j(message, "message");
                this.message = message;
            }

            public static /* synthetic */ PinMessage copy$default(PinMessage pinMessage, Message message, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    message = pinMessage.message;
                }
                return pinMessage.copy(message);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Message getMessage() {
                return this.message;
            }

            public final PinMessage copy(Message message) {
                AbstractC22676k.m65750j(message, "message");
                return new PinMessage(message);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PinMessage) && AbstractC22676k.m65745e(this.message, ((PinMessage) other).message);
            }

            public final Message getMessage() {
                return this.message;
            }

            public final int hashCode() {
                return this.message.hashCode();
            }

            public final String toString() {
                return AbstractC17176i.m48501c(this.message, "PinMessage(message=", ")");
            }
        }

        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollAnswerCast;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;", "messageId", "", "pollId", "answer", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMessageId", "()Ljava/lang/String;", "getPollId", "getAnswer", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class PollAnswerCast extends Event {
            private final String answer;
            private final String messageId;
            private final String pollId;

            public PollAnswerCast(String messageId, String pollId, String answer) {
                AbstractC22676k.m65750j(messageId, "messageId");
                AbstractC22676k.m65750j(pollId, "pollId");
                AbstractC22676k.m65750j(answer, "answer");
                this.messageId = messageId;
                this.pollId = pollId;
                this.answer = answer;
            }

            public static /* synthetic */ PollAnswerCast copy$default(PollAnswerCast pollAnswerCast, String str, String str2, String str3, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = pollAnswerCast.messageId;
                }
                if ((i13 & 2) != 0) {
                    str2 = pollAnswerCast.pollId;
                }
                if ((i13 & 4) != 0) {
                    str3 = pollAnswerCast.answer;
                }
                return pollAnswerCast.copy(str, str2, str3);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getMessageId() {
                return this.messageId;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getPollId() {
                return this.pollId;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final String getAnswer() {
                return this.answer;
            }

            public final PollAnswerCast copy(String messageId, String pollId, String answer) {
                AbstractC22676k.m65750j(messageId, "messageId");
                AbstractC22676k.m65750j(pollId, "pollId");
                AbstractC22676k.m65750j(answer, "answer");
                return new PollAnswerCast(messageId, pollId, answer);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PollAnswerCast)) {
                    return false;
                }
                PollAnswerCast pollAnswerCast = (PollAnswerCast) other;
                return AbstractC22676k.m65745e(this.messageId, pollAnswerCast.messageId) && AbstractC22676k.m65745e(this.pollId, pollAnswerCast.pollId) && AbstractC22676k.m65745e(this.answer, pollAnswerCast.answer);
            }

            public final String getAnswer() {
                return this.answer;
            }

            public final String getMessageId() {
                return this.messageId;
            }

            public final String getPollId() {
                return this.pollId;
            }

            public final int hashCode() {
                return this.answer.hashCode() + AbstractC11266d.m30450d(this.messageId.hashCode() * 31, 31, this.pollId);
            }

            public final String toString() {
                return AbstractC25012a.m73376i(this.answer, ")", AbstractC11895b.m32001t("PollAnswerCast(messageId=", this.messageId, ", pollId=", this.pollId, ", answer="));
            }
        }

        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollClosed;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;", "poll", "Lio/getstream/chat/android/models/Poll;", "<init>", "(Lio/getstream/chat/android/models/Poll;)V", "getPoll", "()Lio/getstream/chat/android/models/Poll;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class PollClosed extends Event {
            private final Poll poll;

            public PollClosed(Poll poll) {
                AbstractC22676k.m65750j(poll, "poll");
                this.poll = poll;
            }

            public static /* synthetic */ PollClosed copy$default(PollClosed pollClosed, Poll poll, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    poll = pollClosed.poll;
                }
                return pollClosed.copy(poll);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Poll getPoll() {
                return this.poll;
            }

            public final PollClosed copy(Poll poll) {
                AbstractC22676k.m65750j(poll, "poll");
                return new PollClosed(poll);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PollClosed) && AbstractC22676k.m65745e(this.poll, ((PollClosed) other).poll);
            }

            public final Poll getPoll() {
                return this.poll;
            }

            public final int hashCode() {
                return this.poll.hashCode();
            }

            public final String toString() {
                return "PollClosed(poll=" + this.poll + ")";
            }
        }

        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollOptionSuggested;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;", "pollId", "", "option", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPollId", "()Ljava/lang/String;", "getOption", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class PollOptionSuggested extends Event {
            private final String option;
            private final String pollId;

            public PollOptionSuggested(String pollId, String option) {
                AbstractC22676k.m65750j(pollId, "pollId");
                AbstractC22676k.m65750j(option, "option");
                this.pollId = pollId;
                this.option = option;
            }

            public static /* synthetic */ PollOptionSuggested copy$default(PollOptionSuggested pollOptionSuggested, String str, String str2, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = pollOptionSuggested.pollId;
                }
                if ((i13 & 2) != 0) {
                    str2 = pollOptionSuggested.option;
                }
                return pollOptionSuggested.copy(str, str2);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getPollId() {
                return this.pollId;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getOption() {
                return this.option;
            }

            public final PollOptionSuggested copy(String pollId, String option) {
                AbstractC22676k.m65750j(pollId, "pollId");
                AbstractC22676k.m65750j(option, "option");
                return new PollOptionSuggested(pollId, option);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PollOptionSuggested)) {
                    return false;
                }
                PollOptionSuggested pollOptionSuggested = (PollOptionSuggested) other;
                return AbstractC22676k.m65745e(this.pollId, pollOptionSuggested.pollId) && AbstractC22676k.m65745e(this.option, pollOptionSuggested.option);
            }

            public final String getOption() {
                return this.option;
            }

            public final String getPollId() {
                return this.pollId;
            }

            public final int hashCode() {
                return this.option.hashCode() + (this.pollId.hashCode() * 31);
            }

            public final String toString() {
                return AbstractC2875y.m8300m("PollOptionSuggested(pollId=", this.pollId, ", option=", this.option, ")");
            }
        }

        @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollOptionUpdated;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;", "message", "Lio/getstream/chat/android/models/Message;", "poll", "Lio/getstream/chat/android/models/Poll;", "option", "Lio/getstream/chat/android/models/Option;", "<init>", "(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Option;)V", "getMessage", "()Lio/getstream/chat/android/models/Message;", "getPoll", "()Lio/getstream/chat/android/models/Poll;", "getOption", "()Lio/getstream/chat/android/models/Option;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class PollOptionUpdated extends Event {
            private final Message message;
            private final Option option;
            private final Poll poll;

            public PollOptionUpdated(Message message, Poll poll, Option option) {
                AbstractC22676k.m65750j(message, "message");
                AbstractC22676k.m65750j(poll, "poll");
                AbstractC22676k.m65750j(option, "option");
                this.message = message;
                this.poll = poll;
                this.option = option;
            }

            public static /* synthetic */ PollOptionUpdated copy$default(PollOptionUpdated pollOptionUpdated, Message message, Poll poll, Option option, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    message = pollOptionUpdated.message;
                }
                if ((i13 & 2) != 0) {
                    poll = pollOptionUpdated.poll;
                }
                if ((i13 & 4) != 0) {
                    option = pollOptionUpdated.option;
                }
                return pollOptionUpdated.copy(message, poll, option);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Message getMessage() {
                return this.message;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Poll getPoll() {
                return this.poll;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final Option getOption() {
                return this.option;
            }

            public final PollOptionUpdated copy(Message message, Poll poll, Option option) {
                AbstractC22676k.m65750j(message, "message");
                AbstractC22676k.m65750j(poll, "poll");
                AbstractC22676k.m65750j(option, "option");
                return new PollOptionUpdated(message, poll, option);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PollOptionUpdated)) {
                    return false;
                }
                PollOptionUpdated pollOptionUpdated = (PollOptionUpdated) other;
                return AbstractC22676k.m65745e(this.message, pollOptionUpdated.message) && AbstractC22676k.m65745e(this.poll, pollOptionUpdated.poll) && AbstractC22676k.m65745e(this.option, pollOptionUpdated.option);
            }

            public final Message getMessage() {
                return this.message;
            }

            public final Option getOption() {
                return this.option;
            }

            public final Poll getPoll() {
                return this.poll;
            }

            public final int hashCode() {
                return this.option.hashCode() + ((this.poll.hashCode() + (this.message.hashCode() * 31)) * 31);
            }

            public final String toString() {
                return "PollOptionUpdated(message=" + this.message + ", poll=" + this.poll + ", option=" + this.option + ")";
            }
        }

        @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$RemoveAttachment;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;", "messageId", "", "attachment", "Lio/getstream/chat/android/models/Attachment;", "<init>", "(Ljava/lang/String;Lio/getstream/chat/android/models/Attachment;)V", "getMessageId", "()Ljava/lang/String;", "getAttachment", "()Lio/getstream/chat/android/models/Attachment;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class RemoveAttachment extends Event {
            private final Attachment attachment;
            private final String messageId;

            public RemoveAttachment(String messageId, Attachment attachment) {
                AbstractC22676k.m65750j(messageId, "messageId");
                AbstractC22676k.m65750j(attachment, "attachment");
                this.messageId = messageId;
                this.attachment = attachment;
            }

            public static /* synthetic */ RemoveAttachment copy$default(RemoveAttachment removeAttachment, String str, Attachment attachment, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = removeAttachment.messageId;
                }
                if ((i13 & 2) != 0) {
                    attachment = removeAttachment.attachment;
                }
                return removeAttachment.copy(str, attachment);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getMessageId() {
                return this.messageId;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Attachment getAttachment() {
                return this.attachment;
            }

            public final RemoveAttachment copy(String messageId, Attachment attachment) {
                AbstractC22676k.m65750j(messageId, "messageId");
                AbstractC22676k.m65750j(attachment, "attachment");
                return new RemoveAttachment(messageId, attachment);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RemoveAttachment)) {
                    return false;
                }
                RemoveAttachment removeAttachment = (RemoveAttachment) other;
                return AbstractC22676k.m65745e(this.messageId, removeAttachment.messageId) && AbstractC22676k.m65745e(this.attachment, removeAttachment.attachment);
            }

            public final Attachment getAttachment() {
                return this.attachment;
            }

            public final String getMessageId() {
                return this.messageId;
            }

            public final int hashCode() {
                return this.attachment.hashCode() + (this.messageId.hashCode() * 31);
            }

            public final String toString() {
                return "RemoveAttachment(messageId=" + this.messageId + ", attachment=" + this.attachment + ")";
            }
        }

        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$RemoveShadowBanFromUser;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "<init>", "(Lio/getstream/chat/android/models/User;)V", "getUser", "()Lio/getstream/chat/android/models/User;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class RemoveShadowBanFromUser extends Event {
            private final User user;

            public RemoveShadowBanFromUser(User user) {
                AbstractC22676k.m65750j(user, "user");
                this.user = user;
            }

            public static /* synthetic */ RemoveShadowBanFromUser copy$default(RemoveShadowBanFromUser removeShadowBanFromUser, User user, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    user = removeShadowBanFromUser.user;
                }
                return removeShadowBanFromUser.copy(user);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final User getUser() {
                return this.user;
            }

            public final RemoveShadowBanFromUser copy(User user) {
                AbstractC22676k.m65750j(user, "user");
                return new RemoveShadowBanFromUser(user);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof RemoveShadowBanFromUser) && AbstractC22676k.m65745e(this.user, ((RemoveShadowBanFromUser) other).user);
            }

            public final User getUser() {
                return this.user;
            }

            public final int hashCode() {
                return this.user.hashCode();
            }

            public final String toString() {
                return "RemoveShadowBanFromUser(user=" + this.user + ")";
            }
        }

        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ReplyAttachment;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;", "cid", "", "repliedMessageId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCid", "()Ljava/lang/String;", "getRepliedMessageId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class ReplyAttachment extends Event {
            private final String cid;
            private final String repliedMessageId;

            public ReplyAttachment(String cid, String repliedMessageId) {
                AbstractC22676k.m65750j(cid, "cid");
                AbstractC22676k.m65750j(repliedMessageId, "repliedMessageId");
                this.cid = cid;
                this.repliedMessageId = repliedMessageId;
            }

            public static /* synthetic */ ReplyAttachment copy$default(ReplyAttachment replyAttachment, String str, String str2, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = replyAttachment.cid;
                }
                if ((i13 & 2) != 0) {
                    str2 = replyAttachment.repliedMessageId;
                }
                return replyAttachment.copy(str, str2);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getCid() {
                return this.cid;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getRepliedMessageId() {
                return this.repliedMessageId;
            }

            public final ReplyAttachment copy(String cid, String repliedMessageId) {
                AbstractC22676k.m65750j(cid, "cid");
                AbstractC22676k.m65750j(repliedMessageId, "repliedMessageId");
                return new ReplyAttachment(cid, repliedMessageId);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ReplyAttachment)) {
                    return false;
                }
                ReplyAttachment replyAttachment = (ReplyAttachment) other;
                return AbstractC22676k.m65745e(this.cid, replyAttachment.cid) && AbstractC22676k.m65745e(this.repliedMessageId, replyAttachment.repliedMessageId);
            }

            public final String getCid() {
                return this.cid;
            }

            public final String getRepliedMessageId() {
                return this.repliedMessageId;
            }

            public final int hashCode() {
                return this.repliedMessageId.hashCode() + (this.cid.hashCode() * 31);
            }

            public final String toString() {
                return AbstractC2875y.m8300m("ReplyAttachment(cid=", this.cid, ", repliedMessageId=", this.repliedMessageId, ")");
            }
        }

        @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ReplyMessage;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;", "cid", "", "repliedMessage", "Lio/getstream/chat/android/models/Message;", "<init>", "(Ljava/lang/String;Lio/getstream/chat/android/models/Message;)V", "getCid", "()Ljava/lang/String;", "getRepliedMessage", "()Lio/getstream/chat/android/models/Message;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class ReplyMessage extends Event {
            private final String cid;
            private final Message repliedMessage;

            public ReplyMessage(String cid, Message repliedMessage) {
                AbstractC22676k.m65750j(cid, "cid");
                AbstractC22676k.m65750j(repliedMessage, "repliedMessage");
                this.cid = cid;
                this.repliedMessage = repliedMessage;
            }

            public static /* synthetic */ ReplyMessage copy$default(ReplyMessage replyMessage, String str, Message message, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = replyMessage.cid;
                }
                if ((i13 & 2) != 0) {
                    message = replyMessage.repliedMessage;
                }
                return replyMessage.copy(str, message);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getCid() {
                return this.cid;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Message getRepliedMessage() {
                return this.repliedMessage;
            }

            public final ReplyMessage copy(String cid, Message repliedMessage) {
                AbstractC22676k.m65750j(cid, "cid");
                AbstractC22676k.m65750j(repliedMessage, "repliedMessage");
                return new ReplyMessage(cid, repliedMessage);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ReplyMessage)) {
                    return false;
                }
                ReplyMessage replyMessage = (ReplyMessage) other;
                return AbstractC22676k.m65745e(this.cid, replyMessage.cid) && AbstractC22676k.m65745e(this.repliedMessage, replyMessage.repliedMessage);
            }

            public final String getCid() {
                return this.cid;
            }

            public final Message getRepliedMessage() {
                return this.repliedMessage;
            }

            public final int hashCode() {
                return this.repliedMessage.hashCode() + (this.cid.hashCode() * 31);
            }

            public final String toString() {
                return "ReplyMessage(cid=" + this.cid + ", repliedMessage=" + this.repliedMessage + ")";
            }
        }

        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$RetryMessage;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;", "message", "Lio/getstream/chat/android/models/Message;", "<init>", "(Lio/getstream/chat/android/models/Message;)V", "getMessage", "()Lio/getstream/chat/android/models/Message;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class RetryMessage extends Event {
            private final Message message;

            public RetryMessage(Message message) {
                AbstractC22676k.m65750j(message, "message");
                this.message = message;
            }

            public static /* synthetic */ RetryMessage copy$default(RetryMessage retryMessage, Message message, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    message = retryMessage.message;
                }
                return retryMessage.copy(message);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Message getMessage() {
                return this.message;
            }

            public final RetryMessage copy(Message message) {
                AbstractC22676k.m65750j(message, "message");
                return new RetryMessage(message);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof RetryMessage) && AbstractC22676k.m65745e(this.message, ((RetryMessage) other).message);
            }

            public final Message getMessage() {
                return this.message;
            }

            public final int hashCode() {
                return this.message.hashCode();
            }

            public final String toString() {
                return AbstractC17176i.m48501c(this.message, "RetryMessage(message=", ")");
            }
        }

        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ShowMessage;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;", "messageId", "", "parentMessageId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getMessageId", "()Ljava/lang/String;", "getParentMessageId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class ShowMessage extends Event {
            private final String messageId;
            private final String parentMessageId;

            public ShowMessage(String messageId, String str) {
                AbstractC22676k.m65750j(messageId, "messageId");
                this.messageId = messageId;
                this.parentMessageId = str;
            }

            public static /* synthetic */ ShowMessage copy$default(ShowMessage showMessage, String str, String str2, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = showMessage.messageId;
                }
                if ((i13 & 2) != 0) {
                    str2 = showMessage.parentMessageId;
                }
                return showMessage.copy(str, str2);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getMessageId() {
                return this.messageId;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getParentMessageId() {
                return this.parentMessageId;
            }

            public final ShowMessage copy(String messageId, String parentMessageId) {
                AbstractC22676k.m65750j(messageId, "messageId");
                return new ShowMessage(messageId, parentMessageId);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ShowMessage)) {
                    return false;
                }
                ShowMessage showMessage = (ShowMessage) other;
                return AbstractC22676k.m65745e(this.messageId, showMessage.messageId) && AbstractC22676k.m65745e(this.parentMessageId, showMessage.parentMessageId);
            }

            public final String getMessageId() {
                return this.messageId;
            }

            public final String getParentMessageId() {
                return this.parentMessageId;
            }

            public final int hashCode() {
                int iHashCode = this.messageId.hashCode() * 31;
                String str = this.parentMessageId;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                return AbstractC2875y.m8300m("ShowMessage(messageId=", this.messageId, ", parentMessageId=", this.parentMessageId, ")");
            }
        }

        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ThreadModeEntered;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;", "parentMessage", "Lio/getstream/chat/android/models/Message;", "<init>", "(Lio/getstream/chat/android/models/Message;)V", "getParentMessage", "()Lio/getstream/chat/android/models/Message;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class ThreadModeEntered extends Event {
            private final Message parentMessage;

            public ThreadModeEntered(Message parentMessage) {
                AbstractC22676k.m65750j(parentMessage, "parentMessage");
                this.parentMessage = parentMessage;
            }

            public static /* synthetic */ ThreadModeEntered copy$default(ThreadModeEntered threadModeEntered, Message message, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    message = threadModeEntered.parentMessage;
                }
                return threadModeEntered.copy(message);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Message getParentMessage() {
                return this.parentMessage;
            }

            public final ThreadModeEntered copy(Message parentMessage) {
                AbstractC22676k.m65750j(parentMessage, "parentMessage");
                return new ThreadModeEntered(parentMessage);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ThreadModeEntered) && AbstractC22676k.m65745e(this.parentMessage, ((ThreadModeEntered) other).parentMessage);
            }

            public final Message getParentMessage() {
                return this.parentMessage;
            }

            public final int hashCode() {
                return this.parentMessage.hashCode();
            }

            public final String toString() {
                return AbstractC17176i.m48501c(this.parentMessage, "ThreadModeEntered(parentMessage=", ")");
            }
        }

        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ToggleOriginalText;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;", "message", "Lio/getstream/chat/android/models/Message;", "<init>", "(Lio/getstream/chat/android/models/Message;)V", "getMessage", "()Lio/getstream/chat/android/models/Message;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class ToggleOriginalText extends Event {
            private final Message message;

            public ToggleOriginalText(Message message) {
                AbstractC22676k.m65750j(message, "message");
                this.message = message;
            }

            public static /* synthetic */ ToggleOriginalText copy$default(ToggleOriginalText toggleOriginalText, Message message, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    message = toggleOriginalText.message;
                }
                return toggleOriginalText.copy(message);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Message getMessage() {
                return this.message;
            }

            public final ToggleOriginalText copy(Message message) {
                AbstractC22676k.m65750j(message, "message");
                return new ToggleOriginalText(message);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ToggleOriginalText) && AbstractC22676k.m65745e(this.message, ((ToggleOriginalText) other).message);
            }

            public final Message getMessage() {
                return this.message;
            }

            public final int hashCode() {
                return this.message.hashCode();
            }

            public final String toString() {
                return AbstractC17176i.m48501c(this.message, "ToggleOriginalText(message=", ")");
            }
        }

        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$UnbanUser;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "<init>", "(Lio/getstream/chat/android/models/User;)V", "getUser", "()Lio/getstream/chat/android/models/User;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class UnbanUser extends Event {
            private final User user;

            public UnbanUser(User user) {
                AbstractC22676k.m65750j(user, "user");
                this.user = user;
            }

            public static /* synthetic */ UnbanUser copy$default(UnbanUser unbanUser, User user, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    user = unbanUser.user;
                }
                return unbanUser.copy(user);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final User getUser() {
                return this.user;
            }

            public final UnbanUser copy(User user) {
                AbstractC22676k.m65750j(user, "user");
                return new UnbanUser(user);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UnbanUser) && AbstractC22676k.m65745e(this.user, ((UnbanUser) other).user);
            }

            public final User getUser() {
                return this.user;
            }

            public final int hashCode() {
                return this.user.hashCode();
            }

            public final String toString() {
                return "UnbanUser(user=" + this.user + ")";
            }
        }

        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$UnblockUser;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;", "userId", "", "<init>", "(Ljava/lang/String;)V", "getUserId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class UnblockUser extends Event {
            private final String userId;

            public UnblockUser(String userId) {
                AbstractC22676k.m65750j(userId, "userId");
                this.userId = userId;
            }

            public static /* synthetic */ UnblockUser copy$default(UnblockUser unblockUser, String str, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = unblockUser.userId;
                }
                return unblockUser.copy(str);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getUserId() {
                return this.userId;
            }

            public final UnblockUser copy(String userId) {
                AbstractC22676k.m65750j(userId, "userId");
                return new UnblockUser(userId);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UnblockUser) && AbstractC22676k.m65745e(this.userId, ((UnblockUser) other).userId);
            }

            public final String getUserId() {
                return this.userId;
            }

            public final int hashCode() {
                return this.userId.hashCode();
            }

            public final String toString() {
                return AbstractC11895b.m31996o("UnblockUser(userId=", this.userId, ")");
            }
        }

        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$UnflagUser;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;", "userId", "", "<init>", "(Ljava/lang/String;)V", "getUserId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class UnflagUser extends Event {
            private final String userId;

            public UnflagUser(String userId) {
                AbstractC22676k.m65750j(userId, "userId");
                this.userId = userId;
            }

            public static /* synthetic */ UnflagUser copy$default(UnflagUser unflagUser, String str, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = unflagUser.userId;
                }
                return unflagUser.copy(str);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getUserId() {
                return this.userId;
            }

            public final UnflagUser copy(String userId) {
                AbstractC22676k.m65750j(userId, "userId");
                return new UnflagUser(userId);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UnflagUser) && AbstractC22676k.m65745e(this.userId, ((UnflagUser) other).userId);
            }

            public final String getUserId() {
                return this.userId;
            }

            public final int hashCode() {
                return this.userId.hashCode();
            }

            public final String toString() {
                return AbstractC11895b.m31996o("UnflagUser(userId=", this.userId, ")");
            }
        }

        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$UnmuteUser;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "<init>", "(Lio/getstream/chat/android/models/User;)V", "getUser", "()Lio/getstream/chat/android/models/User;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class UnmuteUser extends Event {
            private final User user;

            public UnmuteUser(User user) {
                AbstractC22676k.m65750j(user, "user");
                this.user = user;
            }

            public static /* synthetic */ UnmuteUser copy$default(UnmuteUser unmuteUser, User user, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    user = unmuteUser.user;
                }
                return unmuteUser.copy(user);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final User getUser() {
                return this.user;
            }

            public final UnmuteUser copy(User user) {
                AbstractC22676k.m65750j(user, "user");
                return new UnmuteUser(user);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UnmuteUser) && AbstractC22676k.m65745e(this.user, ((UnmuteUser) other).user);
            }

            public final User getUser() {
                return this.user;
            }

            public final int hashCode() {
                return this.user.hashCode();
            }

            public final String toString() {
                return "UnmuteUser(user=" + this.user + ")";
            }
        }

        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$UnpinMessage;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;", "message", "Lio/getstream/chat/android/models/Message;", "<init>", "(Lio/getstream/chat/android/models/Message;)V", "getMessage", "()Lio/getstream/chat/android/models/Message;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class UnpinMessage extends Event {
            private final Message message;

            public UnpinMessage(Message message) {
                AbstractC22676k.m65750j(message, "message");
                this.message = message;
            }

            public static /* synthetic */ UnpinMessage copy$default(UnpinMessage unpinMessage, Message message, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    message = unpinMessage.message;
                }
                return unpinMessage.copy(message);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Message getMessage() {
                return this.message;
            }

            public final UnpinMessage copy(Message message) {
                AbstractC22676k.m65750j(message, "message");
                return new UnpinMessage(message);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UnpinMessage) && AbstractC22676k.m65745e(this.message, ((UnpinMessage) other).message);
            }

            public final Message getMessage() {
                return this.message;
            }

            public final int hashCode() {
                return this.message.hashCode();
            }

            public final String toString() {
                return AbstractC17176i.m48501c(this.message, "UnpinMessage(message=", ")");
            }
        }

        private Event() {
        }

        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$DeleteMessage;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;", "message", "Lio/getstream/chat/android/models/Message;", "hard", "", "<init>", "(Lio/getstream/chat/android/models/Message;Z)V", "getMessage", "()Lio/getstream/chat/android/models/Message;", "getHard", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class DeleteMessage extends Event {
            private final boolean hard;
            private final Message message;

            public DeleteMessage(Message message, boolean z4) {
                AbstractC22676k.m65750j(message, "message");
                this.message = message;
                this.hard = z4;
            }

            public static /* synthetic */ DeleteMessage copy$default(DeleteMessage deleteMessage, Message message, boolean z4, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    message = deleteMessage.message;
                }
                if ((i13 & 2) != 0) {
                    z4 = deleteMessage.hard;
                }
                return deleteMessage.copy(message, z4);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Message getMessage() {
                return this.message;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final boolean getHard() {
                return this.hard;
            }

            public final DeleteMessage copy(Message message, boolean hard) {
                AbstractC22676k.m65750j(message, "message");
                return new DeleteMessage(message, hard);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DeleteMessage)) {
                    return false;
                }
                DeleteMessage deleteMessage = (DeleteMessage) other;
                return AbstractC22676k.m65745e(this.message, deleteMessage.message) && this.hard == deleteMessage.hard;
            }

            public final boolean getHard() {
                return this.hard;
            }

            public final Message getMessage() {
                return this.message;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.hard) + (this.message.hashCode() * 31);
            }

            public final String toString() {
                return "DeleteMessage(message=" + this.message + ", hard=" + this.hard + ")";
            }

            public /* synthetic */ DeleteMessage(Message message, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
                this(message, (i13 & 2) != 0 ? false : z4);
            }
        }

        public Event(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ0\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$BanUser;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "reason", "", "timeout", "", "<init>", "(Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/Integer;)V", "getUser", "()Lio/getstream/chat/android/models/User;", "getReason", "()Ljava/lang/String;", "getTimeout", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/Integer;)Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$BanUser;", "equals", "", "other", "", "hashCode", "toString", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class BanUser extends Event {
            private final String reason;
            private final Integer timeout;
            private final User user;

            public BanUser(User user, String str, Integer num) {
                AbstractC22676k.m65750j(user, "user");
                this.user = user;
                this.reason = str;
                this.timeout = num;
            }

            public static /* synthetic */ BanUser copy$default(BanUser banUser, User user, String str, Integer num, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    user = banUser.user;
                }
                if ((i13 & 2) != 0) {
                    str = banUser.reason;
                }
                if ((i13 & 4) != 0) {
                    num = banUser.timeout;
                }
                return banUser.copy(user, str, num);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final User getUser() {
                return this.user;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getReason() {
                return this.reason;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final Integer getTimeout() {
                return this.timeout;
            }

            public final BanUser copy(User user, String reason, Integer timeout) {
                AbstractC22676k.m65750j(user, "user");
                return new BanUser(user, reason, timeout);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BanUser)) {
                    return false;
                }
                BanUser banUser = (BanUser) other;
                return AbstractC22676k.m65745e(this.user, banUser.user) && AbstractC22676k.m65745e(this.reason, banUser.reason) && AbstractC22676k.m65745e(this.timeout, banUser.timeout);
            }

            public final String getReason() {
                return this.reason;
            }

            public final Integer getTimeout() {
                return this.timeout;
            }

            public final User getUser() {
                return this.user;
            }

            public final int hashCode() {
                int iHashCode = this.user.hashCode() * 31;
                String str = this.reason;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                Integer num = this.timeout;
                return iHashCode2 + (num != null ? num.hashCode() : 0);
            }

            public final String toString() {
                User user = this.user;
                String str = this.reason;
                Integer num = this.timeout;
                StringBuilder sb4 = new StringBuilder("BanUser(user=");
                sb4.append(user);
                sb4.append(", reason=");
                sb4.append(str);
                sb4.append(", timeout=");
                return AbstractC11478a.m30859k(sb4, num, ")");
            }

            public /* synthetic */ BanUser(User user, String str, Integer num, int i13, DefaultConstructorMarker defaultConstructorMarker) {
                this(user, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : num);
            }
        }

        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J5\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$FlagUser;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;", "userId", "", "reason", "customData", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getUserId", "()Ljava/lang/String;", "getReason", "getCustomData", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class FlagUser extends Event {
            private final Map<String, String> customData;
            private final String reason;
            private final String userId;

            public FlagUser(String userId, String str, Map<String, String> customData) {
                AbstractC22676k.m65750j(userId, "userId");
                AbstractC22676k.m65750j(customData, "customData");
                this.userId = userId;
                this.reason = str;
                this.customData = customData;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ FlagUser copy$default(FlagUser flagUser, String str, String str2, Map map, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = flagUser.userId;
                }
                if ((i13 & 2) != 0) {
                    str2 = flagUser.reason;
                }
                if ((i13 & 4) != 0) {
                    map = flagUser.customData;
                }
                return flagUser.copy(str, str2, map);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getUserId() {
                return this.userId;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getReason() {
                return this.reason;
            }

            public final Map<String, String> component3() {
                return this.customData;
            }

            public final FlagUser copy(String userId, String reason, Map<String, String> customData) {
                AbstractC22676k.m65750j(userId, "userId");
                AbstractC22676k.m65750j(customData, "customData");
                return new FlagUser(userId, reason, customData);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FlagUser)) {
                    return false;
                }
                FlagUser flagUser = (FlagUser) other;
                return AbstractC22676k.m65745e(this.userId, flagUser.userId) && AbstractC22676k.m65745e(this.reason, flagUser.reason) && AbstractC22676k.m65745e(this.customData, flagUser.customData);
            }

            public final Map<String, String> getCustomData() {
                return this.customData;
            }

            public final String getReason() {
                return this.reason;
            }

            public final String getUserId() {
                return this.userId;
            }

            public final int hashCode() {
                int iHashCode = this.userId.hashCode() * 31;
                String str = this.reason;
                return this.customData.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
            }

            public final String toString() {
                String str = this.userId;
                String str2 = this.reason;
                return AbstractC13673n.m38565l(AbstractC11895b.m32001t("FlagUser(userId=", str, ", reason=", str2, ", customData="), this.customData, ")");
            }

            public /* synthetic */ FlagUser(String str, String str2, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? C25272z.f99163w : map);
            }
        }

        @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ0\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ShadowBanUser;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "reason", "", "timeout", "", "<init>", "(Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/Integer;)V", "getUser", "()Lio/getstream/chat/android/models/User;", "getReason", "()Ljava/lang/String;", "getTimeout", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/Integer;)Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ShadowBanUser;", "equals", "", "other", "", "hashCode", "toString", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class ShadowBanUser extends Event {
            private final String reason;
            private final Integer timeout;
            private final User user;

            public ShadowBanUser(User user, String str, Integer num) {
                AbstractC22676k.m65750j(user, "user");
                this.user = user;
                this.reason = str;
                this.timeout = num;
            }

            public static /* synthetic */ ShadowBanUser copy$default(ShadowBanUser shadowBanUser, User user, String str, Integer num, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    user = shadowBanUser.user;
                }
                if ((i13 & 2) != 0) {
                    str = shadowBanUser.reason;
                }
                if ((i13 & 4) != 0) {
                    num = shadowBanUser.timeout;
                }
                return shadowBanUser.copy(user, str, num);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final User getUser() {
                return this.user;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getReason() {
                return this.reason;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final Integer getTimeout() {
                return this.timeout;
            }

            public final ShadowBanUser copy(User user, String reason, Integer timeout) {
                AbstractC22676k.m65750j(user, "user");
                return new ShadowBanUser(user, reason, timeout);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ShadowBanUser)) {
                    return false;
                }
                ShadowBanUser shadowBanUser = (ShadowBanUser) other;
                return AbstractC22676k.m65745e(this.user, shadowBanUser.user) && AbstractC22676k.m65745e(this.reason, shadowBanUser.reason) && AbstractC22676k.m65745e(this.timeout, shadowBanUser.timeout);
            }

            public final String getReason() {
                return this.reason;
            }

            public final Integer getTimeout() {
                return this.timeout;
            }

            public final User getUser() {
                return this.user;
            }

            public final int hashCode() {
                int iHashCode = this.user.hashCode() * 31;
                String str = this.reason;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                Integer num = this.timeout;
                return iHashCode2 + (num != null ? num.hashCode() : 0);
            }

            public final String toString() {
                User user = this.user;
                String str = this.reason;
                Integer num = this.timeout;
                StringBuilder sb4 = new StringBuilder("ShadowBanUser(user=");
                sb4.append(user);
                sb4.append(", reason=");
                sb4.append(str);
                sb4.append(", timeout=");
                return AbstractC11478a.m30859k(sb4, num, ")");
            }

            public /* synthetic */ ShadowBanUser(User user, String str, Integer num, int i13, DefaultConstructorMarker defaultConstructorMarker) {
                this(user, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : num);
            }
        }

        @Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u001a\b\u0002\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\"\u0010\u0015\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u000b0\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JX\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00062\u001a\b\u0002\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u000b0\bHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0012J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0012R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0014R)\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u000b0\b8\u0006¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b)\u0010\u0016¨\u0006*"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$FlagMessage;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;", "Lio/getstream/chat/android/models/Message;", "message", "", "reason", "", "customData", "Lkotlin/Function1;", "Ln23/h;", "Lio/getstream/chat/android/models/Flag;", "Ll83/a0;", "resultHandler", "<init>", "(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V", "component1", "()Lio/getstream/chat/android/models/Message;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/Map;", "component4", "()Lkotlin/jvm/functions/Function1;", "copy", "(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$FlagMessage;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lio/getstream/chat/android/models/Message;", "getMessage", "Ljava/lang/String;", "getReason", "Ljava/util/Map;", "getCustomData", "Lkotlin/jvm/functions/Function1;", "getResultHandler", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class FlagMessage extends Event {
            private final Map<String, String> customData;
            private final Message message;
            private final String reason;
            private final Function1 resultHandler;

            public FlagMessage(Message message, String str, Map<String, String> customData, Function1 resultHandler) {
                AbstractC22676k.m65750j(message, "message");
                AbstractC22676k.m65750j(customData, "customData");
                AbstractC22676k.m65750j(resultHandler, "resultHandler");
                this.message = message;
                this.reason = str;
                this.customData = customData;
                this.resultHandler = resultHandler;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final C23454a0 _init_$lambda$0(AbstractC26205h it) {
                AbstractC22676k.m65750j(it, "it");
                return C23454a0.f92919a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ FlagMessage copy$default(FlagMessage flagMessage, Message message, String str, Map map, Function1 function1, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    message = flagMessage.message;
                }
                if ((i13 & 2) != 0) {
                    str = flagMessage.reason;
                }
                if ((i13 & 4) != 0) {
                    map = flagMessage.customData;
                }
                if ((i13 & 8) != 0) {
                    function1 = flagMessage.resultHandler;
                }
                return flagMessage.copy(message, str, map, function1);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Message getMessage() {
                return this.message;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getReason() {
                return this.reason;
            }

            public final Map<String, String> component3() {
                return this.customData;
            }

            /* JADX INFO: renamed from: component4, reason: from getter */
            public final Function1 getResultHandler() {
                return this.resultHandler;
            }

            public final FlagMessage copy(Message message, String reason, Map<String, String> customData, Function1 resultHandler) {
                AbstractC22676k.m65750j(message, "message");
                AbstractC22676k.m65750j(customData, "customData");
                AbstractC22676k.m65750j(resultHandler, "resultHandler");
                return new FlagMessage(message, reason, customData, resultHandler);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FlagMessage)) {
                    return false;
                }
                FlagMessage flagMessage = (FlagMessage) other;
                return AbstractC22676k.m65745e(this.message, flagMessage.message) && AbstractC22676k.m65745e(this.reason, flagMessage.reason) && AbstractC22676k.m65745e(this.customData, flagMessage.customData) && AbstractC22676k.m65745e(this.resultHandler, flagMessage.resultHandler);
            }

            public final Map<String, String> getCustomData() {
                return this.customData;
            }

            public final Message getMessage() {
                return this.message;
            }

            public final String getReason() {
                return this.reason;
            }

            public final Function1 getResultHandler() {
                return this.resultHandler;
            }

            public final int hashCode() {
                int iHashCode = this.message.hashCode() * 31;
                String str = this.reason;
                return this.resultHandler.hashCode() + AbstractC3855a.m11821e(this.customData, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
            }

            public final String toString() {
                return "FlagMessage(message=" + this.message + ", reason=" + this.reason + ", customData=" + this.customData + ", resultHandler=" + this.resultHandler + ")";
            }

            public /* synthetic */ FlagMessage(Message message, String str, Map map, Function1 function1, int i13, DefaultConstructorMarker defaultConstructorMarker) {
                this(message, str, map, (i13 & 8) != 0 ? new C19616a(28) : function1);
            }
        }

        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$MessageReaction;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;", "message", "Lio/getstream/chat/android/models/Message;", "reactionType", "", "emojiCode", "skipPush", "", "<init>", "(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Z)V", "getMessage", "()Lio/getstream/chat/android/models/Message;", "getReactionType", "()Ljava/lang/String;", "getEmojiCode", "getSkipPush", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class MessageReaction extends Event {
            private final String emojiCode;
            private final Message message;
            private final String reactionType;
            private final boolean skipPush;

            public MessageReaction(Message message, String reactionType, String str, boolean z4) {
                AbstractC22676k.m65750j(message, "message");
                AbstractC22676k.m65750j(reactionType, "reactionType");
                this.message = message;
                this.reactionType = reactionType;
                this.emojiCode = str;
                this.skipPush = z4;
            }

            public static /* synthetic */ MessageReaction copy$default(MessageReaction messageReaction, Message message, String str, String str2, boolean z4, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    message = messageReaction.message;
                }
                if ((i13 & 2) != 0) {
                    str = messageReaction.reactionType;
                }
                if ((i13 & 4) != 0) {
                    str2 = messageReaction.emojiCode;
                }
                if ((i13 & 8) != 0) {
                    z4 = messageReaction.skipPush;
                }
                return messageReaction.copy(message, str, str2, z4);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Message getMessage() {
                return this.message;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getReactionType() {
                return this.reactionType;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final String getEmojiCode() {
                return this.emojiCode;
            }

            /* JADX INFO: renamed from: component4, reason: from getter */
            public final boolean getSkipPush() {
                return this.skipPush;
            }

            public final MessageReaction copy(Message message, String reactionType, String emojiCode, boolean skipPush) {
                AbstractC22676k.m65750j(message, "message");
                AbstractC22676k.m65750j(reactionType, "reactionType");
                return new MessageReaction(message, reactionType, emojiCode, skipPush);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof MessageReaction)) {
                    return false;
                }
                MessageReaction messageReaction = (MessageReaction) other;
                return AbstractC22676k.m65745e(this.message, messageReaction.message) && AbstractC22676k.m65745e(this.reactionType, messageReaction.reactionType) && AbstractC22676k.m65745e(this.emojiCode, messageReaction.emojiCode) && this.skipPush == messageReaction.skipPush;
            }

            public final String getEmojiCode() {
                return this.emojiCode;
            }

            public final Message getMessage() {
                return this.message;
            }

            public final String getReactionType() {
                return this.reactionType;
            }

            public final boolean getSkipPush() {
                return this.skipPush;
            }

            public final int hashCode() {
                int iM30450d = AbstractC11266d.m30450d(this.message.hashCode() * 31, 31, this.reactionType);
                String str = this.emojiCode;
                return Boolean.hashCode(this.skipPush) + ((iM30450d + (str == null ? 0 : str.hashCode())) * 31);
            }

            public final String toString() {
                Message message = this.message;
                String str = this.reactionType;
                String str2 = this.emojiCode;
                boolean z4 = this.skipPush;
                StringBuilder sb4 = new StringBuilder("MessageReaction(message=");
                sb4.append(message);
                sb4.append(", reactionType=");
                sb4.append(str);
                sb4.append(", emojiCode=");
                return AbstractC21702c.m61137h(sb4, str2, ", skipPush=", z4, ")");
            }

            public /* synthetic */ MessageReaction(Message message, String str, String str2, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
                this(message, str, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? false : z4);
            }
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$State;", "", "<init>", "()V", "Loading", "Result", "NavigateUp", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$State$Loading;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$State$NavigateUp;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$State$Result;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static abstract class State {

        @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$State$Loading;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$State;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class Loading extends State {
            public static final Loading INSTANCE = new Loading();

            private Loading() {
            }

            public final boolean equals(Object other) {
                return this == other || (other instanceof Loading);
            }

            public final int hashCode() {
                return 1148034467;
            }

            public final String toString() {
                return "Loading";
            }
        }

        @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$State$NavigateUp;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$State;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class NavigateUp extends State {
            public static final NavigateUp INSTANCE = new NavigateUp();

            private NavigateUp() {
            }

            public final boolean equals(Object other) {
                return this == other || (other instanceof NavigateUp);
            }

            public final int hashCode() {
                return 1724812837;
            }

            public final String toString() {
                return "NavigateUp";
            }
        }

        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$State$Result;", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$State;", "messageListItem", "Lio/getstream/chat/android/ui/model/MessageListItemWrapper;", "<init>", "(Lio/getstream/chat/android/ui/model/MessageListItemWrapper;)V", "getMessageListItem", "()Lio/getstream/chat/android/ui/model/MessageListItemWrapper;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class Result extends State {
            private final MessageListItemWrapper messageListItem;

            public Result(MessageListItemWrapper messageListItem) {
                AbstractC22676k.m65750j(messageListItem, "messageListItem");
                this.messageListItem = messageListItem;
            }

            public static /* synthetic */ Result copy$default(Result result, MessageListItemWrapper messageListItemWrapper, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    messageListItemWrapper = result.messageListItem;
                }
                return result.copy(messageListItemWrapper);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final MessageListItemWrapper getMessageListItem() {
                return this.messageListItem;
            }

            public final Result copy(MessageListItemWrapper messageListItem) {
                AbstractC22676k.m65750j(messageListItem, "messageListItem");
                return new Result(messageListItem);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Result) && AbstractC22676k.m65745e(this.messageListItem, ((Result) other).messageListItem);
            }

            public final MessageListItemWrapper getMessageListItem() {
                return this.messageListItem;
            }

            public final int hashCode() {
                return this.messageListItem.hashCode();
            }

            public final String toString() {
                return "Result(messageListItem=" + this.messageListItem + ")";
            }
        }

        private State() {
        }

        public State(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.viewmodel.messages.MessageListViewModel$onOpenThread$1 */
    /* JADX INFO: loaded from: classes3.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.viewmodel.messages.MessageListViewModel$onOpenThread$1", m100430f = "MessageListViewModel.kt", m100431l = {451}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C199291 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ Message $message;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C199291(Message message, InterfaceC30057d<? super C199291> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$message = message;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return MessageListViewModel.this.new C199291(this.$message, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C199291) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                MessageListController messageListController = MessageListViewModel.this.getMessageListController();
                Message message = this.$message;
                this.label = 1;
                if (messageListController.openRelatedThread(message, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.viewmodel.messages.MessageListViewModel$onThreadModeEntered$1 */
    /* JADX INFO: loaded from: classes3.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.viewmodel.messages.MessageListViewModel$onThreadModeEntered$1", m100430f = "MessageListViewModel.kt", m100431l = {440}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C199301 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ Message $parentMessage;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C199301(Message message, InterfaceC30057d<? super C199301> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$parentMessage = message;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return MessageListViewModel.this.new C199301(this.$parentMessage, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C199301) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                MessageListController messageListController = MessageListViewModel.this.getMessageListController();
                Message message = this.$parentMessage;
                this.label = 1;
                if (MessageListController.enterThreadMode$default(messageListController, message, 0, this, 2, null) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    public /* synthetic */ MessageListViewModel(MessageListController messageListController, ChatClient chatClient, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(messageListController, (i13 & 2) != 0 ? ChatClient.INSTANCE.instance() : chatClient);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final State.Result asResultOrNull(State state) {
        if (state instanceof State.Result) {
            return (State.Result) state;
        }
        return null;
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    private final void onBackButtonPressed() {
        MessageMode messageMode = (MessageMode) this.mode.getValue();
        if (messageMode != null) {
            if ((messageMode instanceof MessageMode.Normal) || this.messageListController.getIsStartedForThread()) {
                this.stateMerger.postValue(State.NavigateUp.INSTANCE);
            } else if (messageMode instanceof MessageMode.MessageThread) {
                onNormalModeEntered();
            }
        }
    }

    private final void onBottomEndRegionReached(String baseMessageId, int messageLimit) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), AbstractC25012a.m73374g(messageLimit, "[onBottomEndRegionReached] baseMessageId: ", baseMessageId, ", messageLimit: "), null);
        }
        if (baseMessageId != null) {
            this.messageListController.loadNewerMessages(baseMessageId, messageLimit);
            return;
        }
        C2345k logger2 = getLogger();
        InterfaceC2339e interfaceC2339eM7232c2 = logger2.m7232c();
        EnumC2341g enumC2341g2 = EnumC2341g.ERROR;
        if (interfaceC2339eM7232c2.isLoggable(enumC2341g2, logger2.m7231b())) {
            logger2.m7230a().log(enumC2341g2, logger2.m7231b(), "[onBottomEndRegionReached] there's no base message to request more message at bottom of limit", null);
        }
    }

    public static /* synthetic */ void onBottomEndRegionReached$default(MessageListViewModel messageListViewModel, String str, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i13 = messageListViewModel.messageListController.getMessageLimit();
        }
        messageListViewModel.onBottomEndRegionReached(str, i13);
    }

    private final void onEndRegionReached() {
        MessageListController.loadOlderMessages$default(this.messageListController, 0, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 onEvent$lambda$11(MessageListViewModel messageListViewModel, AbstractC26202e streamError) {
        AbstractC22676k.m65750j(streamError, "streamError");
        C2345k logger = messageListViewModel.getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "Attachment download error: " + streamError.mo77807a() + ". Cause: " + ChatErrorKt.extractCause(streamError), null);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 onEvent$lambda$13(MessageListViewModel messageListViewModel, Event event, AbstractC26205h result) {
        AbstractC22676k.m65750j(result, "result");
        if (result instanceof C26204g) {
            messageListViewModel.onEvent(new Event.ReplyMessage(((Event.ReplyAttachment) event).getCid(), (Message) ((C26204g) result).m77814e()));
        } else {
            if (!(result instanceof C26203f)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC26202e abstractC26202eM77813e = ((C26203f) result).m77813e();
            C2345k logger = messageListViewModel.getLogger();
            InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
            EnumC2341g enumC2341g = EnumC2341g.ERROR;
            if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
                logger.m7230a().log(enumC2341g, logger.m7231b(), "Could not load message to reply: " + abstractC26202eM77813e.mo77807a() + ". Cause: " + ChatErrorKt.extractCause(abstractC26202eM77813e), null);
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 onEvent$lambda$7(Event event, AbstractC26205h result) {
        AbstractC22676k.m65750j(result, "result");
        ((Event.FlagMessage) event).getResultHandler().invoke(result);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 onEvent$lambda$9(MessageListViewModel messageListViewModel, AbstractC26202e streamError) {
        AbstractC22676k.m65750j(streamError, "streamError");
        C2345k logger = messageListViewModel.getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "Could not reply message: " + streamError.mo77807a() + ". Cause: " + ChatErrorKt.extractCause(streamError), null);
        }
        return C23454a0.f92919a;
    }

    private final void onGiphyActionSelected(Event.GiphyActionSelected event) {
        this.messageListController.performGiphyAction(event.getAction());
    }

    private final void onMessageReaction(Message message, String reactionType, String emojiCode, boolean skipPush) {
        this.messageListController.reactToMessage(new Reaction(message.getId(), reactionType, 1, null, null, null, null, null, null, null, null, false, false, emojiCode, 8184, null), message, skipPush);
    }

    private final void onNormalModeEntered() {
        this.messageListController.enterNormalMode();
    }

    private final void onOpenThread(Message message) {
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new C199291(message, null), 3);
    }

    private final void onThreadModeEntered(Message parentMessage) {
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new C199301(parentMessage, null), 3);
    }

    public static /* synthetic */ void scrollToBottom$default(MessageListViewModel messageListViewModel, int i13, InterfaceC4339a interfaceC4339a, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = messageListViewModel.messageListController.getMessageLimit();
        }
        messageListViewModel.scrollToBottom(i13, interfaceC4339a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean targetMessage$lambda$3(Message old, Message message) {
        AbstractC22676k.m65750j(old, "old");
        AbstractC22676k.m65750j(message, "new");
        return AbstractC22676k.m65745e(old.getId(), message.getId());
    }

    public final AbstractC1615p0 getChannel() {
        return this.channel;
    }

    public final InterfaceC13037f2 getChannelState() {
        return this.channelState;
    }

    public final AbstractC1615p0 getErrorEvents() {
        return this.errorEvents;
    }

    public final AbstractC1615p0 getInsideSearch() {
        return this.insideSearch;
    }

    public final AbstractC1615p0 getLoadMoreLiveData() {
        return this.loadMoreLiveData;
    }

    public final Message getMessageById(String messageId) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return this.messageListController.getMessageFromListStateById(messageId);
    }

    public final AbstractC1615p0 getMessageFooterVisibilityState() {
        return this.messageFooterVisibilityState;
    }

    /* JADX INFO: renamed from: getMessageListController$stream_chat_android_ui_components_release, reason: from getter */
    public final MessageListController getMessageListController() {
        return this.messageListController;
    }

    public final AbstractC1615p0 getMode() {
        return this.mode;
    }

    public final AbstractC1615p0 getOwnCapabilities() {
        return this.ownCapabilities;
    }

    public final AbstractC1615p0 getShouldRequestMessagesAtBottom() {
        return this.shouldRequestMessagesAtBottom;
    }

    public final AbstractC1615p0 getShowSystemMessagesState() {
        return this.showSystemMessagesState;
    }

    public final AbstractC1615p0 getState() {
        return this.state;
    }

    public final AbstractC1615p0 getTargetMessage() {
        return this.targetMessage;
    }

    public final AbstractC1615p0 getUnreadCount() {
        return this.unreadCount;
    }

    public final AbstractC1615p0 getUnreadLabel() {
        return this.unreadLabel;
    }

    public final AbstractC1615p0 getUser() {
        return this.user;
    }

    public final void hideUnreadSeparator() {
        this.messageListController.hideUnreadSeparator();
    }

    @Override // androidx.lifecycle.AbstractC1637w1
    public final void onCleared() {
        this.messageListController.onCleared();
        super.onCleared();
    }

    public final void onEvent(Event event) {
        AbstractC22676k.m65750j(event, "event");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "[onEvent] event: " + event, null);
        }
        if (event instanceof Event.EndRegionReached) {
            onEndRegionReached();
            return;
        }
        if (event instanceof Event.BottomEndRegionReached) {
            onBottomEndRegionReached$default(this, ((Event.BottomEndRegionReached) event).getMessageId(), 0, 2, null);
            return;
        }
        if (event instanceof Event.LastMessageRead) {
            this.messageListController.markLastMessageRead();
            return;
        }
        if (event instanceof Event.ThreadModeEntered) {
            onThreadModeEntered(((Event.ThreadModeEntered) event).getParentMessage());
            return;
        }
        if (event instanceof Event.OpenThread) {
            onOpenThread(((Event.OpenThread) event).getMessage());
            return;
        }
        if (event instanceof Event.ToggleOriginalText) {
            this.messageListController.toggleOriginalText(((Event.ToggleOriginalText) event).getMessage().getId());
            return;
        }
        if (event instanceof Event.BackButtonPressed) {
            onBackButtonPressed();
            return;
        }
        if (event instanceof Event.MarkAsUnreadMessage) {
            MessageListController.markUnread$default(this.messageListController, ((Event.MarkAsUnreadMessage) event).getMessage(), null, 2, null);
            return;
        }
        if (event instanceof Event.DeleteMessage) {
            Event.DeleteMessage deleteMessage = (Event.DeleteMessage) event;
            this.messageListController.deleteMessage(deleteMessage.getMessage(), deleteMessage.getHard());
            return;
        }
        if (event instanceof Event.PinMessage) {
            MessageListController.pinMessage$default(this.messageListController, ((Event.PinMessage) event).getMessage(), null, 2, null);
            return;
        }
        if (event instanceof Event.UnpinMessage) {
            this.messageListController.unpinMessage(((Event.UnpinMessage) event).getMessage());
            return;
        }
        if (event instanceof Event.GiphyActionSelected) {
            this.messageListController.performGiphyAction(((Event.GiphyActionSelected) event).getAction());
            return;
        }
        if (event instanceof Event.RetryMessage) {
            this.messageListController.resendMessage(((Event.RetryMessage) event).getMessage());
            return;
        }
        if (event instanceof Event.MessageReaction) {
            Event.MessageReaction messageReaction = (Event.MessageReaction) event;
            onMessageReaction(messageReaction.getMessage(), messageReaction.getReactionType(), messageReaction.getEmojiCode(), messageReaction.getSkipPush());
            return;
        }
        if (event instanceof Event.MuteUser) {
            this.messageListController.muteUser(((Event.MuteUser) event).getUser());
            return;
        }
        if (event instanceof Event.UnmuteUser) {
            this.messageListController.unmuteUser(((Event.UnmuteUser) event).getUser());
            return;
        }
        if (event instanceof Event.UnbanUser) {
            this.messageListController.unbanUser(((Event.UnbanUser) event).getUser().getId());
            return;
        }
        if (event instanceof Event.ShadowBanUser) {
            MessageListController.shadowBanUser$default(this.messageListController, ((Event.ShadowBanUser) event).getUser().getId(), null, null, 6, null);
            return;
        }
        if (event instanceof Event.RemoveShadowBanFromUser) {
            this.messageListController.removeShadowBanFromUser(((Event.RemoveShadowBanFromUser) event).getUser().getId());
            return;
        }
        if (event instanceof Event.FlagUser) {
            Event.FlagUser flagUser = (Event.FlagUser) event;
            this.messageListController.flagUser(flagUser.getUserId(), flagUser.getReason(), flagUser.getCustomData());
            return;
        }
        if (event instanceof Event.UnflagUser) {
            this.messageListController.unflagUser(((Event.UnflagUser) event).getUserId());
            return;
        }
        if (event instanceof Event.RemoveAttachment) {
            Event.RemoveAttachment removeAttachment = (Event.RemoveAttachment) event;
            this.messageListController.removeAttachment(removeAttachment.getMessageId(), removeAttachment.getAttachment());
            return;
        }
        if (event instanceof Event.FlagMessage) {
            Event.FlagMessage flagMessage = (Event.FlagMessage) event;
            this.messageListController.flagMessage(flagMessage.getMessage(), flagMessage.getReason(), flagMessage.getCustomData(), new C19942f(event, 0));
            return;
        }
        if (event instanceof Event.BanUser) {
            Event.BanUser banUser = (Event.BanUser) event;
            this.messageListController.banUser(banUser.getUser().getId(), banUser.getReason(), banUser.getTimeout());
            return;
        }
        if (event instanceof Event.ReplyMessage) {
            Event.ReplyMessage replyMessage = (Event.ReplyMessage) event;
            AbstractC27476f.m82906d(ChatClientExtensions.setMessageForReply(this.chatClient, replyMessage.getCid(), replyMessage.getRepliedMessage()), new C19943g(this, 1));
            return;
        }
        if (event instanceof Event.DownloadAttachment) {
            AbstractC27476f.m82906d((InterfaceC27474d) ((Event.DownloadAttachment) event).getDownloadAttachmentCall().invoke(), new C19943g(this, 2));
            return;
        }
        if (event instanceof Event.ShowMessage) {
            Event.ShowMessage showMessage = (Event.ShowMessage) event;
            this.messageListController.scrollToMessage(showMessage.getMessageId(), showMessage.getParentMessageId());
            return;
        }
        if (event instanceof Event.ReplyAttachment) {
            this.messageListController.loadMessageById(((Event.ReplyAttachment) event).getRepliedMessageId(), new C19223a(21, this, event));
            return;
        }
        if (event instanceof Event.HideUnreadLabel) {
            boolean navigateToFirstUnreadMessage = ((Event.HideUnreadLabel) event).getNavigateToFirstUnreadMessage();
            if (navigateToFirstUnreadMessage) {
                this.messageListController.scrollToFirstUnreadMessage();
                return;
            } else {
                if (navigateToFirstUnreadMessage) {
                    throw new NoWhenBranchMatchedException();
                }
                this.messageListController.disableUnreadLabelButton();
                return;
            }
        }
        if (event instanceof Event.BlockUser) {
            this.messageListController.blockUser(((Event.BlockUser) event).getUserId());
            return;
        }
        if (event instanceof Event.UnblockUser) {
            this.messageListController.unblockUser(((Event.UnblockUser) event).getUserId());
            return;
        }
        if (event instanceof Event.PollOptionUpdated) {
            Event.PollOptionUpdated pollOptionUpdated = (Event.PollOptionUpdated) event;
            this.messageListController.updatePollOption(pollOptionUpdated.getMessage(), pollOptionUpdated.getPoll(), pollOptionUpdated.getOption());
            return;
        }
        if (event instanceof Event.PollClosed) {
            this.messageListController.closePoll(((Event.PollClosed) event).getPoll());
            return;
        }
        if (event instanceof Event.PollOptionSuggested) {
            Event.PollOptionSuggested pollOptionSuggested = (Event.PollOptionSuggested) event;
            this.messageListController.addPollOption(pollOptionSuggested.getPollId(), pollOptionSuggested.getOption());
        } else {
            if (!(event instanceof Event.PollAnswerCast)) {
                throw new NoWhenBranchMatchedException();
            }
            Event.PollAnswerCast pollAnswerCast = (Event.PollAnswerCast) event;
            this.messageListController.castAnswer(pollAnswerCast.getMessageId(), pollAnswerCast.getPollId(), pollAnswerCast.getAnswer());
        }
    }

    public final void pauseAudioRecordingAttachments() {
        this.messageListController.pauseAudioRecordingAttachments();
    }

    public final void scrollToBottom(int messageLimit, InterfaceC4339a scrollToBottom) {
        AbstractC22676k.m65750j(scrollToBottom, "scrollToBottom");
        this.messageListController.scrollToBottom(messageLimit, scrollToBottom);
    }

    public final void scrollToFirstUnreadMessage() {
        this.messageListController.scrollToFirstUnreadMessage();
    }

    public final void setAreSystemMessagesVisible(boolean showSystemMessages) {
        this.messageListController.setSystemMessageVisibility(showSystemMessages);
    }

    public final void setDateSeparatorHandler(DateSeparatorHandler dateSeparatorHandler) {
        this.messageListController.setDateSeparatorHandler(dateSeparatorHandler);
    }

    public final void setMessageFooterVisibility(MessageFooterVisibility messageFooterVisibility) {
        AbstractC22676k.m65750j(messageFooterVisibility, "messageFooterVisibility");
        this.messageListController.setMessageFooterVisibility(messageFooterVisibility);
    }

    public final void setMessagePositionHandler(MessagePositionHandler messagePositionHandler) {
        AbstractC22676k.m65750j(messagePositionHandler, "messagePositionHandler");
        this.messageListController.setMessagePositionHandler(messagePositionHandler);
    }

    public final void setThreadDateSeparatorHandler(DateSeparatorHandler threadDateSeparatorHandler) {
        this.messageListController.setThreadDateSeparatorHandler(threadDateSeparatorHandler);
    }

    public MessageListViewModel(MessageListController messageListController, ChatClient chatClient) {
        AbstractC22676k.m65750j(messageListController, "messageListController");
        AbstractC22676k.m65750j(chatClient, "chatClient");
        this.messageListController = messageListController;
        this.chatClient = chatClient;
        this.logger = AbstractC1772c1.m5382S(this, "Chat:MessageListVM");
        this.channelState = messageListController.getChannelState();
        this.channel = AbstractC1613o1.m5012b(messageListController.getChannel(), null, 3);
        this.ownCapabilities = AbstractC1613o1.m5012b(messageListController.getOwnCapabilities(), null, 3);
        this.showSystemMessagesState = AbstractC1613o1.m5012b(messageListController.getShowSystemMessagesState(), null, 3);
        this.messageFooterVisibilityState = AbstractC1613o1.m5012b(messageListController.getMessageFooterVisibilityState(), null, 3);
        C1627t0 c1627t0 = new C1627t0();
        this.stateMerger = c1627t0;
        this.state = c1627t0;
        this.mode = AbstractC1613o1.m5012b(messageListController.getMode(), null, 3);
        final InterfaceC13037f2 messageListState = messageListController.getMessageListState();
        this.loadMoreLiveData = AbstractC1613o1.m5012b(new InterfaceC13058l() { // from class: io.getstream.chat.android.ui.viewmodel.messages.MessageListViewModel$special$$inlined$map$1

            /* JADX INFO: renamed from: io.getstream.chat.android.ui.viewmodel.messages.MessageListViewModel$special$$inlined$map$1$2 */
            @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
            public static final class C199332<T> implements InterfaceC13062m {
                final /* synthetic */ InterfaceC13062m $this_unsafeFlow;

                /* JADX INFO: renamed from: io.getstream.chat.android.ui.viewmodel.messages.MessageListViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.viewmodel.messages.MessageListViewModel$special$$inlined$map$1$2", m100430f = "MessageListViewModel.kt", m100431l = {50}, m100432m = "emit")
                @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
                public static final class AnonymousClass1 extends AbstractC32269c {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C199332.this.emit(null, this);
                    }
                }

                public C199332(InterfaceC13062m interfaceC13062m) {
                    this.$this_unsafeFlow = interfaceC13062m;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC30057d instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC30057d;
                        int i13 = anonymousClass1.label;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i13 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC30057d);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC30057d);
                    }
                    Object obj2 = anonymousClass1.result;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = anonymousClass1.label;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.$this_unsafeFlow;
                        Boolean boolValueOf = Boolean.valueOf(((MessageListState) obj).isLoadingOlderMessages());
                        anonymousClass1.L$0 = null;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.L$2 = null;
                        anonymousClass1.L$3 = null;
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC13062m.emit(boolValueOf, anonymousClass1) == enumC31071a) {
                            return enumC31071a;
                        }
                    } else {
                        if (i14 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj2);
                    }
                    return C23454a0.f92919a;
                }
            }

            @Override // ec3.InterfaceC13058l
            public final Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = messageListState.collect(new C199332(interfaceC13062m), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }, null, 3);
        final InterfaceC13037f2 listState = messageListController.getListState();
        this.targetMessage = AbstractC1613o1.m5012b(AbstractC13091v.m36609s(new C19054d(19), new InterfaceC13058l() { // from class: io.getstream.chat.android.ui.viewmodel.messages.MessageListViewModel$special$$inlined$map$2

            /* JADX INFO: renamed from: io.getstream.chat.android.ui.viewmodel.messages.MessageListViewModel$special$$inlined$map$2$2 */
            @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
            public static final class C199342<T> implements InterfaceC13062m {
                final /* synthetic */ InterfaceC13062m $this_unsafeFlow;

                /* JADX INFO: renamed from: io.getstream.chat.android.ui.viewmodel.messages.MessageListViewModel$special$$inlined$map$2$2$1, reason: invalid class name */
                @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.viewmodel.messages.MessageListViewModel$special$$inlined$map$2$2", m100430f = "MessageListViewModel.kt", m100431l = {50}, m100432m = "emit")
                @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
                public static final class AnonymousClass1 extends AbstractC32269c {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C199342.this.emit(null, this);
                    }
                }

                public C199342(InterfaceC13062m interfaceC13062m) {
                    this.$this_unsafeFlow = interfaceC13062m;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    AnonymousClass1 anonymousClass1;
                    T next;
                    Message message;
                    if (interfaceC30057d instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC30057d;
                        int i13 = anonymousClass1.label;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i13 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC30057d);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC30057d);
                    }
                    Object obj2 = anonymousClass1.result;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = anonymousClass1.label;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.$this_unsafeFlow;
                        Iterator<T> it = ((MessageListState) obj).getMessageItems().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = (T) null;
                                break;
                            }
                            next = it.next();
                            MessageItemState messageItemState = (MessageListItemState) next;
                            if ((messageItemState instanceof MessageItemState) && AbstractC22676k.m65745e(messageItemState.getFocusState(), MessageFocused.INSTANCE)) {
                                break;
                            }
                        }
                        MessageItemState messageItemState2 = next instanceof MessageItemState ? next : null;
                        if (messageItemState2 == null || (message = messageItemState2.getMessage()) == null) {
                            message = new Message(null, null, null, null, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, null, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, false, -1, 65535, null);
                        }
                        anonymousClass1.L$0 = null;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.L$2 = null;
                        anonymousClass1.L$3 = null;
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC13062m.emit(message, anonymousClass1) == enumC31071a) {
                            return enumC31071a;
                        }
                    } else {
                        if (i14 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj2);
                    }
                    return C23454a0.f92919a;
                }
            }

            @Override // ec3.InterfaceC13058l
            public final Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = listState.collect(new C199342(interfaceC13062m), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }), null, 3);
        int i13 = 2;
        final C4588i c4588i = new C4588i(messageListController.getErrorEvents(), i13);
        this.errorEvents = AbstractC1613o1.m5012b(new InterfaceC13058l() { // from class: io.getstream.chat.android.ui.viewmodel.messages.MessageListViewModel$special$$inlined$map$3

            /* JADX INFO: renamed from: io.getstream.chat.android.ui.viewmodel.messages.MessageListViewModel$special$$inlined$map$3$2 */
            @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
            public static final class C199352<T> implements InterfaceC13062m {
                final /* synthetic */ InterfaceC13062m $this_unsafeFlow;

                /* JADX INFO: renamed from: io.getstream.chat.android.ui.viewmodel.messages.MessageListViewModel$special$$inlined$map$3$2$1, reason: invalid class name */
                @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.viewmodel.messages.MessageListViewModel$special$$inlined$map$3$2", m100430f = "MessageListViewModel.kt", m100431l = {50}, m100432m = "emit")
                @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
                public static final class AnonymousClass1 extends AbstractC32269c {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C199352.this.emit(null, this);
                    }
                }

                public C199352(InterfaceC13062m interfaceC13062m) {
                    this.$this_unsafeFlow = interfaceC13062m;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC30057d instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC30057d;
                        int i13 = anonymousClass1.label;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i13 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC30057d);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC30057d);
                    }
                    Object obj2 = anonymousClass1.result;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = anonymousClass1.label;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.$this_unsafeFlow;
                        Event event = new Event((MessageListController.ErrorEvent) obj);
                        anonymousClass1.L$0 = null;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.L$2 = null;
                        anonymousClass1.L$3 = null;
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC13062m.emit(event, anonymousClass1) == enumC31071a) {
                            return enumC31071a;
                        }
                    } else {
                        if (i14 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj2);
                    }
                    return C23454a0.f92919a;
                }
            }

            @Override // ec3.InterfaceC13058l
            public final Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = c4588i.collect(new C199352(interfaceC13062m), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }, null, 3);
        this.user = AbstractC1613o1.m5012b(messageListController.getUser(), null, 3);
        this.unreadCount = AbstractC1613o1.m5012b(messageListController.getUnreadCount(), null, 3);
        this.insideSearch = AbstractC1613o1.m5012b(messageListController.getIsInsideSearch(), null, 3);
        final InterfaceC13058l[] interfaceC13058lArr = {messageListController.getIsInsideSearch(), messageListController.getMode()};
        this.shouldRequestMessagesAtBottom = AbstractC1613o1.m5012b(new InterfaceC13058l() { // from class: io.getstream.chat.android.ui.viewmodel.messages.MessageListViewModel$special$$inlined$combine$1

            /* JADX INFO: renamed from: io.getstream.chat.android.ui.viewmodel.messages.MessageListViewModel$special$$inlined$combine$1$3 */
            @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.viewmodel.messages.MessageListViewModel$special$$inlined$combine$1$3", m100430f = "MessageListViewModel.kt", m100431l = {234}, m100432m = "invokeSuspend")
            @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m65681d2 = {"R", "T", "Lec3/m;", "", "it", "Ll83/a0;", "<anonymous>", "(Lec3/m;Lkotlin/Array;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
            public static final class C199323 extends AbstractC32275i implements Function3 {
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;
                final /* synthetic */ MessageListViewModel this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C199323(InterfaceC30057d interfaceC30057d, MessageListViewModel messageListViewModel) {
                    super(3, interfaceC30057d);
                    this.this$0 = messageListViewModel;
                }

                @Override // p715kotlin.jvm.functions.Function3
                public final Object invoke(InterfaceC13062m interfaceC13062m, Object[] objArr, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                    C199323 c199323 = new C199323(interfaceC30057d, this.this$0);
                    c199323.L$0 = interfaceC13062m;
                    c199323.L$1 = objArr;
                    return c199323.invokeSuspend(C23454a0.f92919a);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i13 = this.label;
                    if (i13 == 0) {
                        AbstractC34132o.m107864I(obj);
                        InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.L$0;
                        Object[] objArr = (Object[]) this.L$1;
                        boolean z4 = false;
                        Object obj2 = objArr[0];
                        AbstractC22676k.m65748h(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                        Object obj3 = objArr[1];
                        AbstractC22676k.m65748h(obj3, "null cannot be cast to non-null type io.getstream.chat.android.ui.common.state.messages.MessageMode");
                        boolean z13 = ((MessageMode) obj3) instanceof MessageMode.MessageThread;
                        if (zBooleanValue || (z13 && this.this$0.getMessageListController().getThreadLoadOrderOlderToNewer())) {
                            z4 = true;
                        }
                        Boolean boolValueOf = Boolean.valueOf(z4);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 1;
                        if (interfaceC13062m.emit(boolValueOf, this) == enumC31071a) {
                            return enumC31071a;
                        }
                    } else {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                    }
                    return C23454a0.f92919a;
                }
            }

            @Override // ec3.InterfaceC13058l
            public final Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                final InterfaceC13058l[] interfaceC13058lArr2 = interfaceC13058lArr;
                Object objM41038a = AbstractC14371b.m41038a(new InterfaceC4339a() { // from class: io.getstream.chat.android.ui.viewmodel.messages.MessageListViewModel$special$$inlined$combine$1.2
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        return new Object[interfaceC13058lArr2.length];
                    }

                    @Override // c93.InterfaceC4339a
                    public final Object[] invoke() {
                        return new Object[interfaceC13058lArr2.length];
                    }
                }, interfaceC13062m, new C199323(null, this), interfaceC30057d, interfaceC13058lArr2);
                return objM41038a == EnumC31071a.f128113w ? objM41038a : C23454a0.f92919a;
            }
        }, null, 3);
        this.unreadLabel = AbstractC1613o1.m5012b(new C4588i(messageListController.getUnreadLabelState(), i13), null, 3);
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new C199271(null), 3);
    }
}
