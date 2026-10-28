package io.getstream.chat.android.p226ui.feature.messages.list.internal;

import android.view.View;
import androidx.fragment.app.AbstractC1329o1;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y;
import androidx.recyclerview.widget.AbstractC1692i1;
import androidx.recyclerview.widget.AbstractC1717o2;
import androidx.recyclerview.widget.AbstractC1740u1;
import androidx.recyclerview.widget.AbstractC1760z1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b23.InterfaceC2344j;
import b30.ViewOnClickListenerC2558k3;
import f93.C14289a;
import f93.InterfaceC14292d;
import hn.C17508p;
import io.getstream.chat.android.client.utils.message.MessageUtils;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListView;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.BaseMessageItemViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.internal.MessageListItemAdapter;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.IntKt;
import j93.InterfaceC21493z;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import p000.AbstractC11266d;
import p009a8.RunnableC0533c;
import p031b9.AbstractC2875y;
import p031b9.RunnableC2833g0;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.C22686q;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wb3.AbstractC37056f;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\b\u0000\u0018\u0000 [2\u00020\u0001:\u0002\\[B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010 \u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0006H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b)\u0010*J/\u0010,\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u0006H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0006H\u0002¢\u0006\u0004\b.\u0010%J\u0013\u00100\u001a\u00020\u0006*\u00020/H\u0002¢\u0006\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00103R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00104R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00105R\u001b\u0010;\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R+\u0010B\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u00068@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010%\"\u0004\b@\u0010AR+\u0010F\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u00068@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bC\u0010>\u001a\u0004\bD\u0010%\"\u0004\bE\u0010AR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010GR\"\u0010H\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bH\u00104\u001a\u0004\bI\u0010%\"\u0004\bJ\u0010AR\u0016\u0010\u0018\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u00104R\u0016\u0010K\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR$\u0010+\u001a\u00020\u00062\u0006\u0010M\u001a\u00020\u00068\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b+\u00104\"\u0004\bN\u0010AR\u0014\u0010R\u001a\u00020O8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0014\u0010V\u001a\u00020S8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020/0W8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bX\u0010Y¨\u0006]"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;", "", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;", "scrollButtonView", "", "disableScrollWhenShowingDialog", "Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper$MessageReadListener;", "callback", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;ZLio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper$MessageReadListener;)V", "Lio/getstream/chat/android/models/Message;", "message", "Ll83/a0;", "scrollToMessage$stream_chat_android_ui_components_release", "(Lio/getstream/chat/android/models/Message;)V", "scrollToMessage", "scrollToBottom$stream_chat_android_ui_components_release", "()V", "scrollToBottom", "isThreadStart", "hasNewMessages", "isInitialList", "endOfNewMessagesReached", "onMessageListChanged$stream_chat_android_ui_components_release", "(ZZZZ)V", "onMessageListChanged", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnScrollToBottomHandler;", "onScrollToBottomHandler", "setScrollToBottomHandler$stream_chat_android_ui_components_release", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnScrollToBottomHandler;)V", "setScrollToBottomHandler", "", "calculateBottomOffset", "()I", "shouldScrollToBottomBeVisible", "()Z", "stopScrollIfPopupShown", "(Landroidx/recyclerview/widget/RecyclerView;)V", "areNewestMessagesLoaded", "shouldKeepScrollPosition", "(ZZ)Z", "isAtBottom", "shouldScrollToBottom", "(ZZZZ)Z", "isLastMessageMine", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;", "isValid", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;)Z", "Landroidx/recyclerview/widget/RecyclerView;", "Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;", "Z", "Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper$MessageReadListener;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "<set-?>", "alwaysScrollToBottom$delegate", "Lf93/d;", "getAlwaysScrollToBottom$stream_chat_android_ui_components_release", "setAlwaysScrollToBottom$stream_chat_android_ui_components_release", "(Z)V", "alwaysScrollToBottom", "scrollToBottomButtonEnabled$delegate", "getScrollToBottomButtonEnabled$stream_chat_android_ui_components_release", "setScrollToBottomButtonEnabled$stream_chat_android_ui_components_release", "scrollToBottomButtonEnabled", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnScrollToBottomHandler;", "unreadCountEnabled", "getUnreadCountEnabled$stream_chat_android_ui_components_release", "setUnreadCountEnabled$stream_chat_android_ui_components_release", "bottomOffset", "I", "value", "setAtBottom", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getLayoutManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "layoutManager", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemAdapter;", "getAdapter", "()Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemAdapter;", "adapter", "", "getCurrentList", "()Ljava/util/List;", "currentList", "Companion", "MessageReadListener", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageListScrollHelper {
    static final /* synthetic */ InterfaceC21493z[] $$delegatedProperties;
    private static final Companion Companion;
    private static final long HIGHLIGHT_MESSAGE_DELAY = 100;
    private static final int SCROLL_BUTTON_VISIBILITY_THRESHOLD = 8;

    /* JADX INFO: renamed from: alwaysScrollToBottom$delegate, reason: from kotlin metadata */
    private final InterfaceC14292d alwaysScrollToBottom;
    private int bottomOffset;
    private final MessageReadListener callback;
    private final boolean disableScrollWhenShowingDialog;
    private boolean endOfNewMessagesReached;
    private boolean isAtBottom;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private MessageListView.OnScrollToBottomHandler onScrollToBottomHandler;
    private final RecyclerView recyclerView;
    private final ScrollButtonView scrollButtonView;

    /* JADX INFO: renamed from: scrollToBottomButtonEnabled$delegate, reason: from kotlin metadata */
    private final InterfaceC14292d scrollToBottomButtonEnabled;
    private boolean unreadCountEnabled;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper$Companion;", "", "<init>", "()V", "HIGHLIGHT_MESSAGE_DELAY", "", "SCROLL_BUTTON_VISIBILITY_THRESHOLD", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bà\u0080\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper$MessageReadListener;", "", "Ll83/a0;", "onLastMessageRead", "()V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface MessageReadListener {
        void onLastMessageRead();
    }

    static {
        C22686q c22686q = new C22686q(MessageListScrollHelper.class, "alwaysScrollToBottom", "getAlwaysScrollToBottom$stream_chat_android_ui_components_release()Z", 0);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        $$delegatedProperties = new InterfaceC21493z[]{c22673i0.mutableProperty1(c22686q), AbstractC11895b.m31990i(MessageListScrollHelper.class, "scrollToBottomButtonEnabled", "getScrollToBottomButtonEnabled$stream_chat_android_ui_components_release()Z", 0, c22673i0)};
        Companion = new Companion();
    }

    public MessageListScrollHelper(RecyclerView recyclerView, ScrollButtonView scrollButtonView, boolean z4, MessageReadListener callback) {
        AbstractC22676k.m65750j(recyclerView, "recyclerView");
        AbstractC22676k.m65750j(scrollButtonView, "scrollButtonView");
        AbstractC22676k.m65750j(callback, "callback");
        this.recyclerView = recyclerView;
        this.scrollButtonView = scrollButtonView;
        this.disableScrollWhenShowingDialog = z4;
        this.callback = callback;
        this.logger = AbstractC1772c1.m5382S(this, "MessageListScrollHelper");
        this.alwaysScrollToBottom = new C14289a(0);
        this.scrollToBottomButtonEnabled = new C14289a(0);
        this.onScrollToBottomHandler = new C17508p(this, 9);
        this.unreadCountEnabled = true;
        this.endOfNewMessagesReached = true;
        scrollButtonView.setOnClickListener(new ViewOnClickListenerC2558k3(this, 20));
        recyclerView.addOnScrollListener(new AbstractC1760z1() { // from class: io.getstream.chat.android.ui.feature.messages.list.internal.MessageListScrollHelper.2
            @Override // androidx.recyclerview.widget.AbstractC1760z1
            public final void onScrollStateChanged(RecyclerView recyclerView2, int newState) {
                AbstractC22676k.m65750j(recyclerView2, "recyclerView");
                C2345k logger = MessageListScrollHelper.this.getLogger();
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                EnumC2341g enumC2341g = EnumC2341g.DEBUG;
                String str = logger.f9273a;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    logger.f9274b.log(enumC2341g, str, AbstractC2875y.m8295h(newState, "[onScrollStateChanged] newState: "), null);
                }
                if (MessageListScrollHelper.this.disableScrollWhenShowingDialog) {
                    MessageListScrollHelper.this.stopScrollIfPopupShown(recyclerView2);
                }
            }

            @Override // androidx.recyclerview.widget.AbstractC1760z1
            public final void onScrolled(RecyclerView recyclerView2, int dx3, int dy3) {
                AbstractC22676k.m65750j(recyclerView2, "recyclerView");
                C2345k logger = MessageListScrollHelper.this.getLogger();
                MessageListScrollHelper messageListScrollHelper = MessageListScrollHelper.this;
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                EnumC2341g enumC2341g = EnumC2341g.DEBUG;
                String str = logger.f9273a;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    logger.f9274b.log(enumC2341g, str, "[onScrolled] scrollToBottomButtonEnabled: " + messageListScrollHelper.m55611xc17e6bb3() + ", currentList.size: " + messageListScrollHelper.getCurrentList().size(), null);
                }
                if (!MessageListScrollHelper.this.m55611xc17e6bb3() || MessageListScrollHelper.this.getCurrentList().isEmpty()) {
                    return;
                }
                boolean zShouldScrollToBottomBeVisible = MessageListScrollHelper.this.shouldScrollToBottomBeVisible();
                C2345k logger2 = MessageListScrollHelper.this.getLogger();
                InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
                String str2 = logger2.f9273a;
                EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
                if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                    logger2.f9274b.log(enumC2341g2, str2, AbstractC11266d.m30462p("[onScrolled] shouldScrollToBottomBeVisible: ", zShouldScrollToBottomBeVisible), null);
                }
                MessageListScrollHelper.this.scrollButtonView.setVisibility(zShouldScrollToBottomBeVisible ? 0 : 8);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static void m55608c(MessageListScrollHelper messageListScrollHelper, View view) {
        messageListScrollHelper.onScrollToBottomHandler.onScrollToBottom();
    }

    private final int calculateBottomOffset() {
        int iNextIndex;
        int iFindLastVisibleItemPosition = getLayoutManager().findLastVisibleItemPosition();
        List<MessageListItem> currentList = getCurrentList();
        ListIterator<MessageListItem> listIterator = currentList.listIterator(currentList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            if (isValid(listIterator.previous())) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        String str = logger.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC2875y.m8294g(iFindLastVisibleItemPosition, iNextIndex, "[calculateBottomOffset] lastVisibleItemPosition: ", ", lastPotentiallyVisibleItemPosition: "), null);
        }
        return iNextIndex - iFindLastVisibleItemPosition;
    }

    private final MessageListItemAdapter getAdapter() {
        AbstractC1692i1 adapter = this.recyclerView.getAdapter();
        AbstractC22676k.m65748h(adapter, "null cannot be cast to non-null type io.getstream.chat.android.ui.feature.messages.list.adapter.internal.MessageListItemAdapter");
        return (MessageListItemAdapter) adapter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<MessageListItem> getCurrentList() {
        List currentList = getAdapter().getCurrentList();
        AbstractC22676k.m65749i(currentList, "getCurrentList(...)");
        return currentList;
    }

    private final LinearLayoutManager getLayoutManager() {
        AbstractC1740u1 layoutManager = this.recyclerView.getLayoutManager();
        AbstractC22676k.m65748h(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        return (LinearLayoutManager) layoutManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    private final boolean isLastMessageMine() {
        MessageListItem messageListItem = (MessageListItem) AbstractC25265s.m74114R0(getCurrentList());
        if (messageListItem == null) {
            return false;
        }
        if (!(messageListItem instanceof MessageListItem.MessageItem)) {
            messageListItem = null;
        }
        MessageListItem.MessageItem messageItem = (MessageListItem.MessageItem) messageListItem;
        if (messageItem != null) {
            return messageItem.isMine();
        }
        return false;
    }

    private final boolean isValid(MessageListItem messageListItem) {
        if (messageListItem instanceof MessageListItem.MessageItem) {
            MessageListItem.MessageItem messageItem = (MessageListItem.MessageItem) messageListItem;
            if (!messageItem.isTheirs() || !MessageUtils.isDeleted(messageItem.getMessage())) {
                return true;
            }
        }
        return messageListItem instanceof MessageListItem.ThreadSeparatorItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onScrollToBottomHandler$lambda$0(MessageListScrollHelper messageListScrollHelper) {
        messageListScrollHelper.recyclerView.scrollToPosition(AbstractC37056f.m118951C(messageListScrollHelper.getCurrentList()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scrollToMessage$lambda$12(MessageListScrollHelper messageListScrollHelper, Message message) {
        Iterator<MessageListItem> it = messageListScrollHelper.getCurrentList().iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            MessageListItem next = it.next();
            if ((next instanceof MessageListItem.MessageItem) && AbstractC22676k.m65745e(((MessageListItem.MessageItem) next).getMessage().getId(), message.getId())) {
                break;
            } else {
                i13++;
            }
        }
        Integer numValueOf = Integer.valueOf(i13);
        if (i13 < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            if (message.getPinned()) {
                messageListScrollHelper.getLayoutManager().scrollToPositionWithOffset(iIntValue, IntKt.dpToPx(8));
            } else {
                RecyclerView recyclerView = messageListScrollHelper.recyclerView;
                messageListScrollHelper.getLayoutManager().scrollToPositionWithOffset(iIntValue, recyclerView.getHeight() / 3);
                recyclerView.post(new RunnableC2833g0(recyclerView, iIntValue, 2));
            }
            if (iIntValue > 8) {
                messageListScrollHelper.scrollButtonView.setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scrollToMessage$lambda$12$lambda$11$lambda$10$lambda$9(RecyclerView recyclerView, int i13) {
        AbstractC1717o2 abstractC1717o2FindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i13);
        if (abstractC1717o2FindViewHolderForAdapterPosition != null) {
            if (!(abstractC1717o2FindViewHolderForAdapterPosition instanceof BaseMessageItemViewHolder)) {
                abstractC1717o2FindViewHolderForAdapterPosition = null;
            }
            BaseMessageItemViewHolder baseMessageItemViewHolder = (BaseMessageItemViewHolder) abstractC1717o2FindViewHolderForAdapterPosition;
            if (baseMessageItemViewHolder != null) {
                baseMessageItemViewHolder.m55426xb1d0af1f();
            }
        }
    }

    private final void setAtBottom(boolean z4) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30462p("[setIsAtBottom] value: ", z4), null);
        }
        if (z4 && !this.isAtBottom) {
            this.callback.onLastMessageRead();
        }
        this.isAtBottom = z4;
    }

    private final boolean shouldKeepScrollPosition(boolean areNewestMessagesLoaded, boolean hasNewMessages) {
        return (areNewestMessagesLoaded && m55611xc17e6bb3() && hasNewMessages && !getAdapter().getCurrentList().isEmpty()) ? false : true;
    }

    private final boolean shouldScrollToBottom(boolean isInitialList, boolean endOfNewMessagesReached, boolean hasNewMessages, boolean isAtBottom) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            InterfaceC2344j interfaceC2344j = logger.f9274b;
            boolean zIsLastMessageMine = isLastMessageMine();
            boolean zM55610x589f2945 = m55610x589f2945();
            StringBuilder sbM32002u = AbstractC11895b.m32002u("[shouldScrollToBottom] hasNewMessages: ", ", endOfNewMessagesReached: ", ", isInitialList: ", hasNewMessages, endOfNewMessagesReached);
            AbstractC38963t7.m124392v(sbM32002u, isInitialList, ", isLastMessageMine: ", zIsLastMessageMine, ", isAtBottom: ");
            sbM32002u.append(isAtBottom);
            sbM32002u.append(", alwaysScrollToBottom: ");
            sbM32002u.append(zM55610x589f2945);
            interfaceC2344j.log(enumC2341g, str, sbM32002u.toString(), null);
        }
        if (hasNewMessages && endOfNewMessagesReached) {
            return isInitialList || isLastMessageMine() || isAtBottom || m55610x589f2945();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldScrollToBottomBeVisible() {
        this.bottomOffset = calculateBottomOffset();
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[shouldScrollToBottomBeVisible] bottomOffset: " + this.bottomOffset + ", endOfNewMessagesReached: " + this.endOfNewMessagesReached, null);
        }
        setAtBottom(this.bottomOffset <= 0 && this.endOfNewMessagesReached);
        if (getAdapter().getDisplayCount() != 0) {
            if (this.endOfNewMessagesReached) {
                boolean z4 = this.isAtBottom;
                boolean z13 = this.bottomOffset > 8;
                if (!z4 || z13) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopScrollIfPopupShown(RecyclerView recyclerView) {
        AbstractC1329o1 fragmentManager = ContextKt.getFragmentManager(recyclerView.getContext());
        if (fragmentManager == null) {
            return;
        }
        List listM4059f = fragmentManager.f5717c.m4059f();
        AbstractC22676k.m65749i(listM4059f, "getFragments(...)");
        List list = listM4059f;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((AbstractComponentCallbacksC1320m0) it.next()) instanceof DialogInterfaceOnCancelListenerC1361y) {
                recyclerView.stopScroll();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: getAlwaysScrollToBottom$stream_chat_android_ui_components_release */
    public final boolean m55610x589f2945() {
        return ((Boolean) this.alwaysScrollToBottom.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    /* JADX INFO: renamed from: getScrollToBottomButtonEnabled$stream_chat_android_ui_components_release */
    public final boolean m55611xc17e6bb3() {
        return ((Boolean) this.scrollToBottomButtonEnabled.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    /* JADX INFO: renamed from: getUnreadCountEnabled$stream_chat_android_ui_components_release, reason: from getter */
    public final boolean getUnreadCountEnabled() {
        return this.unreadCountEnabled;
    }

    public final void onMessageListChanged$stream_chat_android_ui_components_release(boolean isThreadStart, boolean hasNewMessages, boolean isInitialList, boolean endOfNewMessagesReached) {
        boolean z4 = this.isAtBottom;
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            InterfaceC2344j interfaceC2344j = logger.f9274b;
            StringBuilder sbM32002u = AbstractC11895b.m32002u("[onMessageListChanged] isInitialList: ", ", hasNewMessages: ", ", endOfNewMessagesReached: ", isInitialList, hasNewMessages);
            sbM32002u.append(endOfNewMessagesReached);
            sbM32002u.append(", isAtBottom: ");
            sbM32002u.append(z4);
            interfaceC2344j.log(enumC2341g, str, sbM32002u.toString(), null);
        }
        this.endOfNewMessagesReached = endOfNewMessagesReached;
        this.scrollButtonView.setVisibility(shouldScrollToBottomBeVisible() ? 0 : 8);
        if (isThreadStart || !shouldKeepScrollPosition(endOfNewMessagesReached, hasNewMessages)) {
            if (isThreadStart) {
                getLayoutManager().scrollToPosition(AbstractC37056f.m118951C(getCurrentList()));
                return;
            }
            boolean zShouldScrollToBottom = shouldScrollToBottom(isInitialList, endOfNewMessagesReached, hasNewMessages, z4);
            C2345k logger2 = getLogger();
            InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
            String str2 = logger2.f9273a;
            EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
            if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                logger2.f9274b.log(enumC2341g2, str2, AbstractC11266d.m30462p("[onMessageListChanged] shouldScrollToBottom: ", zShouldScrollToBottom), null);
            }
            if (zShouldScrollToBottom) {
                getLayoutManager().scrollToPosition(AbstractC37056f.m118951C(getCurrentList()));
                this.callback.onLastMessageRead();
            }
        }
    }

    public final void scrollToBottom$stream_chat_android_ui_components_release() {
        this.recyclerView.scrollToPosition(AbstractC37056f.m118951C(getCurrentList()));
    }

    public final void scrollToMessage$stream_chat_android_ui_components_release(Message message) {
        AbstractC22676k.m65750j(message, "message");
        this.recyclerView.postDelayed(new RunnableC0533c(25, this, message), 100L);
    }

    /* JADX INFO: renamed from: setAlwaysScrollToBottom$stream_chat_android_ui_components_release */
    public final void m55612xfd98c951(boolean z4) {
        this.alwaysScrollToBottom.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: setScrollToBottomButtonEnabled$stream_chat_android_ui_components_release */
    public final void m55613xdcfee627(boolean z4) {
        this.scrollToBottomButtonEnabled.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: setScrollToBottomHandler$stream_chat_android_ui_components_release */
    public final void m55614x75f1e042(MessageListView.OnScrollToBottomHandler onScrollToBottomHandler) {
        AbstractC22676k.m65750j(onScrollToBottomHandler, "onScrollToBottomHandler");
        this.onScrollToBottomHandler = onScrollToBottomHandler;
    }

    public final void setUnreadCountEnabled$stream_chat_android_ui_components_release(boolean z4) {
        this.unreadCountEnabled = z4;
    }
}
