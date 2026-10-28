package io.getstream.chat.android.p226ui.feature.messages.list.adapter;

import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.Option;
import io.getstream.chat.android.models.Poll;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.common.state.messages.list.GiphyAction;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListView;
import io.getstream.chat.android.p226ui.utils.ListenerDelegate;
import j93.InterfaceC21493z;
import no.nordicsemi.android.dfu.DfuBaseService;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.C22686q;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bi\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0091\u0001BÁ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020%\u0012\u0006\u0010&\u001a\u00020'\u0012\u0006\u0010(\u001a\u00020)¢\u0006\u0004\b*\u0010+R+\u0010\u0002\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u00038V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R+\u0010\u0004\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u00058V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b7\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R+\u0010\u0006\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u00078V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b<\u00102\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R+\u0010\b\u001a\u00020\t2\u0006\u0010,\u001a\u00020\t8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bA\u00102\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001b\u0010\n\u001a\u00020\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bD\u00102\u001a\u0004\bB\u0010CR+\u0010\f\u001a\u00020\r2\u0006\u0010,\u001a\u00020\r8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bI\u00102\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR+\u0010\u000e\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\u000f8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bN\u00102\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR+\u0010\u0010\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u00118V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bS\u00102\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR+\u0010\u0012\u001a\u00020\u00132\u0006\u0010,\u001a\u00020\u00138V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bX\u00102\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR+\u0010\u0014\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u00158V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b]\u00102\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R+\u0010\u0016\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u00178V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bb\u00102\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR+\u0010\u0018\u001a\u00020\u00192\u0006\u0010,\u001a\u00020\u00198V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bg\u00102\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR+\u0010h\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u001b8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bm\u00102\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR+\u0010\u001c\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u001d8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\br\u00102\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR+\u0010\u001e\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u001f8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bw\u00102\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR+\u0010 \u001a\u00020!2\u0006\u0010,\u001a\u00020!8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b|\u00102\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R-\u0010\"\u001a\u00020#2\u0006\u0010,\u001a\u00020#8V@VX\u0096\u008e\u0002¢\u0006\u0014\n\u0005\b\u0081\u0001\u00102\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R0\u0010$\u001a\u00020%2\u0006\u0010,\u001a\u00020%8V@VX\u0096\u008e\u0002¢\u0006\u0017\n\u0005\b\u0086\u0001\u00102\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R0\u0010&\u001a\u00020'2\u0006\u0010,\u001a\u00020'8V@VX\u0096\u008e\u0002¢\u0006\u0017\n\u0005\b\u008b\u0001\u00102\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0006\b\u0089\u0001\u0010\u008a\u0001R0\u0010(\u001a\u00020)2\u0006\u0010,\u001a\u00020)8V@VX\u0096\u008e\u0002¢\u0006\u0017\n\u0005\b\u0090\u0001\u00102\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001¨\u0006\u0092\u0001"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;", "messageClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageClickListener;", "messageLongClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageLongClickListener;", "messageRetryListener", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageRetryListener;", "threadClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnThreadClickListener;", "translatedLabelClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnTranslatedLabelClickListener;", "attachmentClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentClickListener;", "attachmentDownloadClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentDownloadClickListener;", "reactionViewClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnReactionViewClickListener;", "userClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUserClickListener;", "mentionClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMentionClickListener;", "giphySendListener", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnGiphySendListener;", "linkClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnLinkClickListener;", "onUnreadLabelReachedListener", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUnreadLabelReachedListener;", "onPollOptionClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollOptionClickListener;", "onShowAllPollOptionClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnShowAllPollOptionClickListener;", "onPollCloseClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollCloseClickListener;", "onViewPollResultClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollResultClickListener;", "onSuggestPollOptionClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnSuggestPollOptionClickListener;", "onAddPollCommentClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAddPollCommentClickListener;", "onViewPollCommentsClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollCommentsClickListener;", "<init>", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageLongClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageRetryListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnThreadClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnTranslatedLabelClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentDownloadClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnReactionViewClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUserClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMentionClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnGiphySendListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnLinkClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUnreadLabelReachedListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollOptionClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnShowAllPollOptionClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollCloseClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollResultClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnSuggestPollOptionClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAddPollCommentClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollCommentsClickListener;)V", "<set-?>", "getMessageClickListener", "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageClickListener;", "setMessageClickListener", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageClickListener;)V", "messageClickListener$delegate", "Lio/getstream/chat/android/ui/utils/ListenerDelegate;", "getMessageLongClickListener", "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageLongClickListener;", "setMessageLongClickListener", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageLongClickListener;)V", "messageLongClickListener$delegate", "getMessageRetryListener", "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageRetryListener;", "setMessageRetryListener", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageRetryListener;)V", "messageRetryListener$delegate", "getThreadClickListener", "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnThreadClickListener;", "setThreadClickListener", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnThreadClickListener;)V", "threadClickListener$delegate", "getTranslatedLabelClickListener", "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnTranslatedLabelClickListener;", "translatedLabelClickListener$delegate", "getAttachmentClickListener", "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentClickListener;", "setAttachmentClickListener", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentClickListener;)V", "attachmentClickListener$delegate", "getAttachmentDownloadClickListener", "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentDownloadClickListener;", "setAttachmentDownloadClickListener", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentDownloadClickListener;)V", "attachmentDownloadClickListener$delegate", "getReactionViewClickListener", "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnReactionViewClickListener;", "setReactionViewClickListener", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnReactionViewClickListener;)V", "reactionViewClickListener$delegate", "getUserClickListener", "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUserClickListener;", "setUserClickListener", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUserClickListener;)V", "userClickListener$delegate", "getMentionClickListener", "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMentionClickListener;", "setMentionClickListener", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMentionClickListener;)V", "mentionClickListener$delegate", "getGiphySendListener", "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnGiphySendListener;", "setGiphySendListener", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnGiphySendListener;)V", "giphySendListener$delegate", "getLinkClickListener", "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnLinkClickListener;", "setLinkClickListener", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnLinkClickListener;)V", "linkClickListener$delegate", "unreadLabelReachedListener", "getUnreadLabelReachedListener", "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUnreadLabelReachedListener;", "setUnreadLabelReachedListener", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUnreadLabelReachedListener;)V", "unreadLabelReachedListener$delegate", "getOnPollOptionClickListener", "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollOptionClickListener;", "setOnPollOptionClickListener", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollOptionClickListener;)V", "onPollOptionClickListener$delegate", "getOnShowAllPollOptionClickListener", "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnShowAllPollOptionClickListener;", "setOnShowAllPollOptionClickListener", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnShowAllPollOptionClickListener;)V", "onShowAllPollOptionClickListener$delegate", "getOnPollCloseClickListener", "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollCloseClickListener;", "setOnPollCloseClickListener", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollCloseClickListener;)V", "onPollCloseClickListener$delegate", "getOnViewPollResultClickListener", "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollResultClickListener;", "setOnViewPollResultClickListener", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollResultClickListener;)V", "onViewPollResultClickListener$delegate", "getOnSuggestPollOptionClickListener", "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnSuggestPollOptionClickListener;", "setOnSuggestPollOptionClickListener", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnSuggestPollOptionClickListener;)V", "onSuggestPollOptionClickListener$delegate", "getOnAddPollCommentClickListener", "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAddPollCommentClickListener;", "setOnAddPollCommentClickListener", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAddPollCommentClickListener;)V", "onAddPollCommentClickListener$delegate", "getOnViewPollCommentsClickListener", "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollCommentsClickListener;", "setOnViewPollCommentsClickListener", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollCommentsClickListener;)V", "onViewPollCommentsClickListener$delegate", "EmptyFunctions", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageListListenersImpl implements MessageListListeners {
    static final /* synthetic */ InterfaceC21493z[] $$delegatedProperties;

    /* JADX INFO: renamed from: attachmentClickListener$delegate, reason: from kotlin metadata */
    private final ListenerDelegate attachmentClickListener;

    /* JADX INFO: renamed from: attachmentDownloadClickListener$delegate, reason: from kotlin metadata */
    private final ListenerDelegate attachmentDownloadClickListener;

    /* JADX INFO: renamed from: giphySendListener$delegate, reason: from kotlin metadata */
    private final ListenerDelegate giphySendListener;

    /* JADX INFO: renamed from: linkClickListener$delegate, reason: from kotlin metadata */
    private final ListenerDelegate linkClickListener;

    /* JADX INFO: renamed from: mentionClickListener$delegate, reason: from kotlin metadata */
    private final ListenerDelegate mentionClickListener;

    /* JADX INFO: renamed from: messageClickListener$delegate, reason: from kotlin metadata */
    private final ListenerDelegate messageClickListener;

    /* JADX INFO: renamed from: messageLongClickListener$delegate, reason: from kotlin metadata */
    private final ListenerDelegate messageLongClickListener;

    /* JADX INFO: renamed from: messageRetryListener$delegate, reason: from kotlin metadata */
    private final ListenerDelegate messageRetryListener;

    /* JADX INFO: renamed from: onAddPollCommentClickListener$delegate, reason: from kotlin metadata */
    private final ListenerDelegate onAddPollCommentClickListener;

    /* JADX INFO: renamed from: onPollCloseClickListener$delegate, reason: from kotlin metadata */
    private final ListenerDelegate onPollCloseClickListener;

    /* JADX INFO: renamed from: onPollOptionClickListener$delegate, reason: from kotlin metadata */
    private final ListenerDelegate onPollOptionClickListener;

    /* JADX INFO: renamed from: onShowAllPollOptionClickListener$delegate, reason: from kotlin metadata */
    private final ListenerDelegate onShowAllPollOptionClickListener;

    /* JADX INFO: renamed from: onSuggestPollOptionClickListener$delegate, reason: from kotlin metadata */
    private final ListenerDelegate onSuggestPollOptionClickListener;

    /* JADX INFO: renamed from: onViewPollCommentsClickListener$delegate, reason: from kotlin metadata */
    private final ListenerDelegate onViewPollCommentsClickListener;

    /* JADX INFO: renamed from: onViewPollResultClickListener$delegate, reason: from kotlin metadata */
    private final ListenerDelegate onViewPollResultClickListener;

    /* JADX INFO: renamed from: reactionViewClickListener$delegate, reason: from kotlin metadata */
    private final ListenerDelegate reactionViewClickListener;

    /* JADX INFO: renamed from: threadClickListener$delegate, reason: from kotlin metadata */
    private final ListenerDelegate threadClickListener;

    /* JADX INFO: renamed from: translatedLabelClickListener$delegate, reason: from kotlin metadata */
    private final ListenerDelegate translatedLabelClickListener;

    /* JADX INFO: renamed from: unreadLabelReachedListener$delegate, reason: from kotlin metadata */
    private final ListenerDelegate unreadLabelReachedListener;

    /* JADX INFO: renamed from: userClickListener$delegate, reason: from kotlin metadata */
    private final ListenerDelegate userClickListener;

    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR)\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$EmptyFunctions;", "", "<init>", "()V", "Lkotlin/Function1;", "", "ONE_PARAM", "Lkotlin/jvm/functions/Function1;", "getONE_PARAM", "()Lkotlin/jvm/functions/Function1;", "Lkotlin/Function2;", "TWO_PARAM", "Lc93/m;", "getTWO_PARAM", "()Lc93/m;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class EmptyFunctions {
        public static final EmptyFunctions INSTANCE = new EmptyFunctions();
        private static final Function1 ONE_PARAM = new C19814w(0);
        private static final InterfaceC4351m TWO_PARAM = new C19815x();

        private EmptyFunctions() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean ONE_PARAM$lambda$0(Object obj) {
            AbstractC22676k.m65750j(obj, "<unused var>");
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean TWO_PARAM$lambda$1(Object obj, Object obj2) {
            AbstractC22676k.m65750j(obj, "<unused var>");
            AbstractC22676k.m65750j(obj2, "<unused var>");
            return false;
        }

        public final Function1 getONE_PARAM() {
            return ONE_PARAM;
        }

        public final InterfaceC4351m getTWO_PARAM() {
            return TWO_PARAM;
        }
    }

    static {
        C22686q c22686q = new C22686q(MessageListListenersImpl.class, "messageClickListener", "getMessageClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageClickListener;", 0);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        $$delegatedProperties = new InterfaceC21493z[]{c22673i0.mutableProperty1(c22686q), AbstractC11895b.m31990i(MessageListListenersImpl.class, "messageLongClickListener", "getMessageLongClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageLongClickListener;", 0, c22673i0), AbstractC11895b.m31990i(MessageListListenersImpl.class, "messageRetryListener", "getMessageRetryListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageRetryListener;", 0, c22673i0), AbstractC11895b.m31990i(MessageListListenersImpl.class, "threadClickListener", "getThreadClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnThreadClickListener;", 0, c22673i0), AbstractC31061c.m95632h(MessageListListenersImpl.class, "translatedLabelClickListener", "getTranslatedLabelClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnTranslatedLabelClickListener;", 0, c22673i0), AbstractC11895b.m31990i(MessageListListenersImpl.class, "attachmentClickListener", "getAttachmentClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentClickListener;", 0, c22673i0), AbstractC11895b.m31990i(MessageListListenersImpl.class, "attachmentDownloadClickListener", "getAttachmentDownloadClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentDownloadClickListener;", 0, c22673i0), AbstractC11895b.m31990i(MessageListListenersImpl.class, "reactionViewClickListener", "getReactionViewClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnReactionViewClickListener;", 0, c22673i0), AbstractC11895b.m31990i(MessageListListenersImpl.class, "userClickListener", "getUserClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUserClickListener;", 0, c22673i0), AbstractC11895b.m31990i(MessageListListenersImpl.class, "mentionClickListener", "getMentionClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMentionClickListener;", 0, c22673i0), AbstractC11895b.m31990i(MessageListListenersImpl.class, "giphySendListener", "getGiphySendListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnGiphySendListener;", 0, c22673i0), AbstractC11895b.m31990i(MessageListListenersImpl.class, "linkClickListener", "getLinkClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnLinkClickListener;", 0, c22673i0), AbstractC11895b.m31990i(MessageListListenersImpl.class, "unreadLabelReachedListener", "getUnreadLabelReachedListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUnreadLabelReachedListener;", 0, c22673i0), AbstractC11895b.m31990i(MessageListListenersImpl.class, "onPollOptionClickListener", "getOnPollOptionClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollOptionClickListener;", 0, c22673i0), AbstractC11895b.m31990i(MessageListListenersImpl.class, "onShowAllPollOptionClickListener", "getOnShowAllPollOptionClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnShowAllPollOptionClickListener;", 0, c22673i0), AbstractC11895b.m31990i(MessageListListenersImpl.class, "onPollCloseClickListener", "getOnPollCloseClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollCloseClickListener;", 0, c22673i0), AbstractC11895b.m31990i(MessageListListenersImpl.class, "onViewPollResultClickListener", "getOnViewPollResultClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollResultClickListener;", 0, c22673i0), AbstractC11895b.m31990i(MessageListListenersImpl.class, "onSuggestPollOptionClickListener", "getOnSuggestPollOptionClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnSuggestPollOptionClickListener;", 0, c22673i0), AbstractC11895b.m31990i(MessageListListenersImpl.class, "onAddPollCommentClickListener", "getOnAddPollCommentClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAddPollCommentClickListener;", 0, c22673i0), AbstractC11895b.m31990i(MessageListListenersImpl.class, "onViewPollCommentsClickListener", "getOnViewPollCommentsClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollCommentsClickListener;", 0, c22673i0)};
    }

    public MessageListListenersImpl(MessageListView.OnMessageClickListener messageClickListener, MessageListView.OnMessageLongClickListener messageLongClickListener, MessageListView.OnMessageRetryListener messageRetryListener, MessageListView.OnThreadClickListener threadClickListener, MessageListView.OnTranslatedLabelClickListener translatedLabelClickListener, MessageListView.OnAttachmentClickListener attachmentClickListener, MessageListView.OnAttachmentDownloadClickListener attachmentDownloadClickListener, MessageListView.OnReactionViewClickListener reactionViewClickListener, MessageListView.OnUserClickListener userClickListener, MessageListView.OnMentionClickListener mentionClickListener, MessageListView.OnGiphySendListener giphySendListener, MessageListView.OnLinkClickListener linkClickListener, MessageListView.OnUnreadLabelReachedListener onUnreadLabelReachedListener, MessageListView.OnPollOptionClickListener onPollOptionClickListener, MessageListView.OnShowAllPollOptionClickListener onShowAllPollOptionClickListener, MessageListView.OnPollCloseClickListener onPollCloseClickListener, MessageListView.OnViewPollResultClickListener onViewPollResultClickListener, MessageListView.OnSuggestPollOptionClickListener onSuggestPollOptionClickListener, MessageListView.OnAddPollCommentClickListener onAddPollCommentClickListener, MessageListView.OnViewPollCommentsClickListener onViewPollCommentsClickListener) {
        AbstractC22676k.m65750j(messageClickListener, "messageClickListener");
        AbstractC22676k.m65750j(messageLongClickListener, "messageLongClickListener");
        AbstractC22676k.m65750j(messageRetryListener, "messageRetryListener");
        AbstractC22676k.m65750j(threadClickListener, "threadClickListener");
        AbstractC22676k.m65750j(translatedLabelClickListener, "translatedLabelClickListener");
        AbstractC22676k.m65750j(attachmentClickListener, "attachmentClickListener");
        AbstractC22676k.m65750j(attachmentDownloadClickListener, "attachmentDownloadClickListener");
        AbstractC22676k.m65750j(reactionViewClickListener, "reactionViewClickListener");
        AbstractC22676k.m65750j(userClickListener, "userClickListener");
        AbstractC22676k.m65750j(mentionClickListener, "mentionClickListener");
        AbstractC22676k.m65750j(giphySendListener, "giphySendListener");
        AbstractC22676k.m65750j(linkClickListener, "linkClickListener");
        AbstractC22676k.m65750j(onUnreadLabelReachedListener, "onUnreadLabelReachedListener");
        AbstractC22676k.m65750j(onPollOptionClickListener, "onPollOptionClickListener");
        AbstractC22676k.m65750j(onShowAllPollOptionClickListener, "onShowAllPollOptionClickListener");
        AbstractC22676k.m65750j(onPollCloseClickListener, "onPollCloseClickListener");
        AbstractC22676k.m65750j(onViewPollResultClickListener, "onViewPollResultClickListener");
        AbstractC22676k.m65750j(onSuggestPollOptionClickListener, "onSuggestPollOptionClickListener");
        AbstractC22676k.m65750j(onAddPollCommentClickListener, "onAddPollCommentClickListener");
        AbstractC22676k.m65750j(onViewPollCommentsClickListener, "onViewPollCommentsClickListener");
        this.messageClickListener = new ListenerDelegate(messageClickListener, new C19814w(1));
        this.messageLongClickListener = new ListenerDelegate(messageLongClickListener, new C19814w(12));
        this.messageRetryListener = new ListenerDelegate(messageRetryListener, new C19814w(13));
        this.threadClickListener = new ListenerDelegate(threadClickListener, new C19814w(14));
        this.translatedLabelClickListener = new ListenerDelegate(translatedLabelClickListener, new C19814w(15));
        this.attachmentClickListener = new ListenerDelegate(attachmentClickListener, new C19814w(16));
        this.attachmentDownloadClickListener = new ListenerDelegate(attachmentDownloadClickListener, new C19814w(17));
        this.reactionViewClickListener = new ListenerDelegate(reactionViewClickListener, new C19814w(18));
        this.userClickListener = new ListenerDelegate(userClickListener, new C19814w(19));
        this.mentionClickListener = new ListenerDelegate(mentionClickListener, new C19814w(20));
        this.giphySendListener = new ListenerDelegate(giphySendListener, new C19814w(2));
        this.linkClickListener = new ListenerDelegate(linkClickListener, new C19814w(3));
        this.unreadLabelReachedListener = new ListenerDelegate(onUnreadLabelReachedListener, new C19814w(4));
        this.onPollOptionClickListener = new ListenerDelegate(onPollOptionClickListener, new C19814w(5));
        this.onShowAllPollOptionClickListener = new ListenerDelegate(onShowAllPollOptionClickListener, new C19814w(6));
        this.onPollCloseClickListener = new ListenerDelegate(onPollCloseClickListener, new C19814w(7));
        this.onViewPollResultClickListener = new ListenerDelegate(onViewPollResultClickListener, new C19814w(8));
        this.onSuggestPollOptionClickListener = new ListenerDelegate(onSuggestPollOptionClickListener, new C19814w(9));
        this.onAddPollCommentClickListener = new ListenerDelegate(onAddPollCommentClickListener, new C19814w(10));
        this.onViewPollCommentsClickListener = new ListenerDelegate(onViewPollCommentsClickListener, new C19814w(11));
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ C19748f m55432A(InterfaceC4339a interfaceC4339a) {
        return (C19748f) onShowAllPollOptionClickListener_delegate$lambda$30(interfaceC4339a);
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ C19754l m55436E(InterfaceC4339a interfaceC4339a) {
        return (C19754l) userClickListener_delegate$lambda$18(interfaceC4339a);
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ C19750h m55437F(InterfaceC4339a interfaceC4339a) {
        return (C19750h) threadClickListener_delegate$lambda$8(interfaceC4339a);
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ C19752j m55440I(InterfaceC4339a interfaceC4339a) {
        return (C19752j) reactionViewClickListener_delegate$lambda$16(interfaceC4339a);
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ C19763u m55441J(InterfaceC4339a interfaceC4339a) {
        return (C19763u) giphySendListener_delegate$lambda$22(interfaceC4339a);
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ C19756n m55444M(InterfaceC4339a interfaceC4339a) {
        return (C19756n) unreadLabelReachedListener_delegate$lambda$26(interfaceC4339a);
    }

    private static final void _init_$lambda$0() {
    }

    private static final MessageListView.OnAttachmentClickListener attachmentClickListener_delegate$lambda$12(final InterfaceC4339a realListener) {
        AbstractC22676k.m65750j(realListener, "realListener");
        return new MessageListView.OnAttachmentClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.d
            @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnAttachmentClickListener
            public final boolean onAttachmentClick(Message message, Attachment attachment) {
                return MessageListListenersImpl.attachmentClickListener_delegate$lambda$12$lambda$11(realListener, message, attachment);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean attachmentClickListener_delegate$lambda$12$lambda$11(InterfaceC4339a interfaceC4339a, Message message, Attachment attachment) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(attachment, "attachment");
        return ((MessageListView.OnAttachmentClickListener) interfaceC4339a.invoke()).onAttachmentClick(message, attachment);
    }

    private static final MessageListView.OnAttachmentDownloadClickListener attachmentDownloadClickListener_delegate$lambda$14(final InterfaceC4339a realListener) {
        AbstractC22676k.m65750j(realListener, "realListener");
        return new MessageListView.OnAttachmentDownloadClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.g
            @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnAttachmentDownloadClickListener
            public final boolean onAttachmentDownloadClick(Attachment attachment) {
                return MessageListListenersImpl.attachmentDownloadClickListener_delegate$lambda$14$lambda$13(realListener, attachment);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean attachmentDownloadClickListener_delegate$lambda$14$lambda$13(InterfaceC4339a interfaceC4339a, Attachment attachment) {
        AbstractC22676k.m65750j(attachment, "attachment");
        return ((MessageListView.OnAttachmentDownloadClickListener) interfaceC4339a.invoke()).onAttachmentDownloadClick(attachment);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C19758p m55447c(InterfaceC4339a interfaceC4339a) {
        return (C19758p) onPollCloseClickListener_delegate$lambda$32(interfaceC4339a);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C19745c m55448d(InterfaceC4339a interfaceC4339a) {
        return (C19745c) translatedLabelClickListener_delegate$lambda$10(interfaceC4339a);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ C19759q m55449e(InterfaceC4339a interfaceC4339a) {
        return (C19759q) onPollOptionClickListener_delegate$lambda$28(interfaceC4339a);
    }

    private static final MessageListView.OnGiphySendListener giphySendListener_delegate$lambda$22(final InterfaceC4339a realListener) {
        AbstractC22676k.m65750j(realListener, "realListener");
        return new MessageListView.OnGiphySendListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.u
            @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnGiphySendListener
            public final boolean onGiphySend(GiphyAction giphyAction) {
                return MessageListListenersImpl.giphySendListener_delegate$lambda$22$lambda$21(realListener, giphyAction);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean giphySendListener_delegate$lambda$22$lambda$21(InterfaceC4339a interfaceC4339a, GiphyAction action) {
        AbstractC22676k.m65750j(action, "action");
        return ((MessageListView.OnGiphySendListener) interfaceC4339a.invoke()).onGiphySend(action);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ C19761s m55453i(InterfaceC4339a interfaceC4339a) {
        return (C19761s) messageRetryListener_delegate$lambda$6(interfaceC4339a);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ C19749g m55456l(InterfaceC4339a interfaceC4339a) {
        return (C19749g) attachmentDownloadClickListener_delegate$lambda$14(interfaceC4339a);
    }

    private static final MessageListView.OnLinkClickListener linkClickListener_delegate$lambda$24(final InterfaceC4339a realListener) {
        AbstractC22676k.m65750j(realListener, "realListener");
        return new MessageListView.OnLinkClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.v
            @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnLinkClickListener
            public final boolean onLinkClick(String str) {
                return MessageListListenersImpl.linkClickListener_delegate$lambda$24$lambda$23(realListener, str);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean linkClickListener_delegate$lambda$24$lambda$23(InterfaceC4339a interfaceC4339a, String url) {
        AbstractC22676k.m65750j(url, "url");
        return ((MessageListView.OnLinkClickListener) interfaceC4339a.invoke()).onLinkClick(url);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ C19751i m55457m(InterfaceC4339a interfaceC4339a) {
        return (C19751i) onAddPollCommentClickListener_delegate$lambda$38(interfaceC4339a);
    }

    private static final MessageListView.OnMentionClickListener mentionClickListener_delegate$lambda$20(final InterfaceC4339a realListener) {
        AbstractC22676k.m65750j(realListener, "realListener");
        return new MessageListView.OnMentionClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.t
            @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnMentionClickListener
            public final boolean onMentionClick(User user) {
                return MessageListListenersImpl.mentionClickListener_delegate$lambda$20$lambda$19(realListener, user);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean mentionClickListener_delegate$lambda$20$lambda$19(InterfaceC4339a interfaceC4339a, User user) {
        AbstractC22676k.m65750j(user, "user");
        return ((MessageListView.OnMentionClickListener) interfaceC4339a.invoke()).onMentionClick(user);
    }

    private static final MessageListView.OnMessageClickListener messageClickListener_delegate$lambda$2(final InterfaceC4339a realListener) {
        AbstractC22676k.m65750j(realListener, "realListener");
        return new MessageListView.OnMessageClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.e
            @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnMessageClickListener
            public final boolean onMessageClick(Message message) {
                return MessageListListenersImpl.messageClickListener_delegate$lambda$2$lambda$1(realListener, message);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean messageClickListener_delegate$lambda$2$lambda$1(InterfaceC4339a interfaceC4339a, Message message) {
        AbstractC22676k.m65750j(message, "message");
        return ((MessageListView.OnMessageClickListener) interfaceC4339a.invoke()).onMessageClick(message);
    }

    private static final MessageListView.OnMessageLongClickListener messageLongClickListener_delegate$lambda$4(final InterfaceC4339a realListener) {
        AbstractC22676k.m65750j(realListener, "realListener");
        return new MessageListView.OnMessageLongClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.m
            @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnMessageLongClickListener
            public final boolean onMessageLongClick(Message message) {
                return MessageListListenersImpl.messageLongClickListener_delegate$lambda$4$lambda$3(realListener, message);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean messageLongClickListener_delegate$lambda$4$lambda$3(InterfaceC4339a interfaceC4339a, Message message) {
        AbstractC22676k.m65750j(message, "message");
        return ((MessageListView.OnMessageLongClickListener) interfaceC4339a.invoke()).onMessageLongClick(message);
    }

    private static final MessageListView.OnMessageRetryListener messageRetryListener_delegate$lambda$6(final InterfaceC4339a realListener) {
        AbstractC22676k.m65750j(realListener, "realListener");
        return new MessageListView.OnMessageRetryListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.s
            @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnMessageRetryListener
            public final boolean onRetryMessage(Message message) {
                return MessageListListenersImpl.messageRetryListener_delegate$lambda$6$lambda$5(realListener, message);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean messageRetryListener_delegate$lambda$6$lambda$5(InterfaceC4339a interfaceC4339a, Message message) {
        AbstractC22676k.m65750j(message, "message");
        return ((MessageListView.OnMessageRetryListener) interfaceC4339a.invoke()).onRetryMessage(message);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ C19753k m55458n(InterfaceC4339a interfaceC4339a) {
        return (C19753k) onViewPollResultClickListener_delegate$lambda$34(interfaceC4339a);
    }

    private static final MessageListView.OnAddPollCommentClickListener onAddPollCommentClickListener_delegate$lambda$38(final InterfaceC4339a realListener) {
        AbstractC22676k.m65750j(realListener, "realListener");
        return new MessageListView.OnAddPollCommentClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.i
            @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnAddPollCommentClickListener
            public final boolean onAddPollCommentClick(Message message, Poll poll) {
                return MessageListListenersImpl.onAddPollCommentClickListener_delegate$lambda$38$lambda$37(realListener, message, poll);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onAddPollCommentClickListener_delegate$lambda$38$lambda$37(InterfaceC4339a interfaceC4339a, Message message, Poll poll) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(poll, "poll");
        return ((MessageListView.OnAddPollCommentClickListener) interfaceC4339a.invoke()).onAddPollCommentClick(message, poll);
    }

    private static final MessageListView.OnPollCloseClickListener onPollCloseClickListener_delegate$lambda$32(final InterfaceC4339a realListener) {
        AbstractC22676k.m65750j(realListener, "realListener");
        return new MessageListView.OnPollCloseClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.p
            @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnPollCloseClickListener
            public final boolean onPollCloseClick(Poll poll) {
                return MessageListListenersImpl.onPollCloseClickListener_delegate$lambda$32$lambda$31(realListener, poll);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onPollCloseClickListener_delegate$lambda$32$lambda$31(InterfaceC4339a interfaceC4339a, Poll poll) {
        AbstractC22676k.m65750j(poll, "poll");
        return ((MessageListView.OnPollCloseClickListener) interfaceC4339a.invoke()).onPollCloseClick(poll);
    }

    private static final MessageListView.OnPollOptionClickListener onPollOptionClickListener_delegate$lambda$28(final InterfaceC4339a realListener) {
        AbstractC22676k.m65750j(realListener, "realListener");
        return new MessageListView.OnPollOptionClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.q
            @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnPollOptionClickListener
            public final boolean onPollOptionClick(Message message, Poll poll, Option option) {
                return MessageListListenersImpl.onPollOptionClickListener_delegate$lambda$28$lambda$27(realListener, message, poll, option);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onPollOptionClickListener_delegate$lambda$28$lambda$27(InterfaceC4339a interfaceC4339a, Message message, Poll poll, Option option) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(poll, "poll");
        AbstractC22676k.m65750j(option, "option");
        return ((MessageListView.OnPollOptionClickListener) interfaceC4339a.invoke()).onPollOptionClick(message, poll, option);
    }

    private static final MessageListView.OnShowAllPollOptionClickListener onShowAllPollOptionClickListener_delegate$lambda$30(final InterfaceC4339a realListener) {
        AbstractC22676k.m65750j(realListener, "realListener");
        return new MessageListView.OnShowAllPollOptionClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.f
            @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnShowAllPollOptionClickListener
            public final boolean onShowAllPollOptionClick(Message message, Poll poll) {
                return MessageListListenersImpl.onShowAllPollOptionClickListener_delegate$lambda$30$lambda$29(realListener, message, poll);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onShowAllPollOptionClickListener_delegate$lambda$30$lambda$29(InterfaceC4339a interfaceC4339a, Message message, Poll poll) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(poll, "poll");
        return ((MessageListView.OnShowAllPollOptionClickListener) interfaceC4339a.invoke()).onShowAllPollOptionClick(message, poll);
    }

    private static final MessageListView.OnSuggestPollOptionClickListener onSuggestPollOptionClickListener_delegate$lambda$36(final InterfaceC4339a realListener) {
        AbstractC22676k.m65750j(realListener, "realListener");
        return new MessageListView.OnSuggestPollOptionClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.r
            @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnSuggestPollOptionClickListener
            public final boolean onSuggestPollOptionClick(Poll poll) {
                return MessageListListenersImpl.onSuggestPollOptionClickListener_delegate$lambda$36$lambda$35(realListener, poll);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onSuggestPollOptionClickListener_delegate$lambda$36$lambda$35(InterfaceC4339a interfaceC4339a, Poll poll) {
        AbstractC22676k.m65750j(poll, "poll");
        return ((MessageListView.OnSuggestPollOptionClickListener) interfaceC4339a.invoke()).onSuggestPollOptionClick(poll);
    }

    private static final MessageListView.OnViewPollCommentsClickListener onViewPollCommentsClickListener_delegate$lambda$40(final InterfaceC4339a realListener) {
        AbstractC22676k.m65750j(realListener, "realListener");
        return new MessageListView.OnViewPollCommentsClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.b
            @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnViewPollCommentsClickListener
            public final boolean onViewPollCommentsClick(Message message, Poll poll) {
                return MessageListListenersImpl.onViewPollCommentsClickListener_delegate$lambda$40$lambda$39(realListener, message, poll);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onViewPollCommentsClickListener_delegate$lambda$40$lambda$39(InterfaceC4339a interfaceC4339a, Message message, Poll poll) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(poll, "poll");
        return ((MessageListView.OnViewPollCommentsClickListener) interfaceC4339a.invoke()).onViewPollCommentsClick(message, poll);
    }

    private static final MessageListView.OnViewPollResultClickListener onViewPollResultClickListener_delegate$lambda$34(final InterfaceC4339a realListener) {
        AbstractC22676k.m65750j(realListener, "realListener");
        return new MessageListView.OnViewPollResultClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.k
            @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnViewPollResultClickListener
            public final boolean onViewPollResultClick(Poll poll) {
                return MessageListListenersImpl.onViewPollResultClickListener_delegate$lambda$34$lambda$33(realListener, poll);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onViewPollResultClickListener_delegate$lambda$34$lambda$33(InterfaceC4339a interfaceC4339a, Poll poll) {
        AbstractC22676k.m65750j(poll, "poll");
        return ((MessageListView.OnViewPollResultClickListener) interfaceC4339a.invoke()).onViewPollResultClick(poll);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ C19746d m55460p(InterfaceC4339a interfaceC4339a) {
        return (C19746d) attachmentClickListener_delegate$lambda$12(interfaceC4339a);
    }

    private static final MessageListView.OnReactionViewClickListener reactionViewClickListener_delegate$lambda$16(final InterfaceC4339a realListener) {
        AbstractC22676k.m65750j(realListener, "realListener");
        return new MessageListView.OnReactionViewClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.j
            @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnReactionViewClickListener
            public final boolean onReactionViewClick(Message message) {
                return MessageListListenersImpl.reactionViewClickListener_delegate$lambda$16$lambda$15(realListener, message);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean reactionViewClickListener_delegate$lambda$16$lambda$15(InterfaceC4339a interfaceC4339a, Message message) {
        AbstractC22676k.m65750j(message, "message");
        return ((MessageListView.OnReactionViewClickListener) interfaceC4339a.invoke()).onReactionViewClick(message);
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ C19760r m55463s(InterfaceC4339a interfaceC4339a) {
        return (C19760r) onSuggestPollOptionClickListener_delegate$lambda$36(interfaceC4339a);
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ C19764v m55464t(InterfaceC4339a interfaceC4339a) {
        return (C19764v) linkClickListener_delegate$lambda$24(interfaceC4339a);
    }

    private static final MessageListView.OnThreadClickListener threadClickListener_delegate$lambda$8(final InterfaceC4339a realListener) {
        AbstractC22676k.m65750j(realListener, "realListener");
        return new MessageListView.OnThreadClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.h
            @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnThreadClickListener
            public final boolean onThreadClick(Message message) {
                return MessageListListenersImpl.threadClickListener_delegate$lambda$8$lambda$7(realListener, message);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean threadClickListener_delegate$lambda$8$lambda$7(InterfaceC4339a interfaceC4339a, Message message) {
        AbstractC22676k.m65750j(message, "message");
        return ((MessageListView.OnThreadClickListener) interfaceC4339a.invoke()).onThreadClick(message);
    }

    private static final MessageListView.OnTranslatedLabelClickListener translatedLabelClickListener_delegate$lambda$10(final InterfaceC4339a realListener) {
        AbstractC22676k.m65750j(realListener, "realListener");
        return new MessageListView.OnTranslatedLabelClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.c
            @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnTranslatedLabelClickListener
            public final boolean onTranslatedLabelClick(Message message) {
                return MessageListListenersImpl.translatedLabelClickListener_delegate$lambda$10$lambda$9(realListener, message);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean translatedLabelClickListener_delegate$lambda$10$lambda$9(InterfaceC4339a interfaceC4339a, Message message) {
        AbstractC22676k.m65750j(message, "message");
        return ((MessageListView.OnTranslatedLabelClickListener) interfaceC4339a.invoke()).onTranslatedLabelClick(message);
    }

    private static final MessageListView.OnUnreadLabelReachedListener unreadLabelReachedListener_delegate$lambda$26(final InterfaceC4339a realListener) {
        AbstractC22676k.m65750j(realListener, "realListener");
        return new MessageListView.OnUnreadLabelReachedListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.n
            @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnUnreadLabelReachedListener
            public final void onUnreadLabelReached() {
                InterfaceC21493z[] interfaceC21493zArr = MessageListListenersImpl.$$delegatedProperties;
                ((MessageListView.OnUnreadLabelReachedListener) realListener.invoke()).onUnreadLabelReached();
            }
        };
    }

    private static final MessageListView.OnUserClickListener userClickListener_delegate$lambda$18(final InterfaceC4339a realListener) {
        AbstractC22676k.m65750j(realListener, "realListener");
        return new MessageListView.OnUserClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.l
            @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnUserClickListener
            public final boolean onUserClick(User user) {
                return MessageListListenersImpl.userClickListener_delegate$lambda$18$lambda$17(realListener, user);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean userClickListener_delegate$lambda$18$lambda$17(InterfaceC4339a interfaceC4339a, User user) {
        AbstractC22676k.m65750j(user, "user");
        return ((MessageListView.OnUserClickListener) interfaceC4339a.invoke()).onUserClick(user);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ C19747e m55466v(InterfaceC4339a interfaceC4339a) {
        return (C19747e) messageClickListener_delegate$lambda$2(interfaceC4339a);
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ C19755m m55468x(InterfaceC4339a interfaceC4339a) {
        return (C19755m) messageLongClickListener_delegate$lambda$4(interfaceC4339a);
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ C19762t m55469y(InterfaceC4339a interfaceC4339a) {
        return (C19762t) mentionClickListener_delegate$lambda$20(interfaceC4339a);
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ C19744b m55470z(InterfaceC4339a interfaceC4339a) {
        return (C19744b) onViewPollCommentsClickListener_delegate$lambda$40(interfaceC4339a);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListListeners
    public final MessageListView.OnAttachmentClickListener getAttachmentClickListener() {
        return (MessageListView.OnAttachmentClickListener) this.attachmentClickListener.getValue(this, $$delegatedProperties[5]);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListListeners
    public final MessageListView.OnAttachmentDownloadClickListener getAttachmentDownloadClickListener() {
        return (MessageListView.OnAttachmentDownloadClickListener) this.attachmentDownloadClickListener.getValue(this, $$delegatedProperties[6]);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListListeners
    public final MessageListView.OnGiphySendListener getGiphySendListener() {
        return (MessageListView.OnGiphySendListener) this.giphySendListener.getValue(this, $$delegatedProperties[10]);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListListeners
    public final MessageListView.OnLinkClickListener getLinkClickListener() {
        return (MessageListView.OnLinkClickListener) this.linkClickListener.getValue(this, $$delegatedProperties[11]);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListListeners
    public final MessageListView.OnMentionClickListener getMentionClickListener() {
        return (MessageListView.OnMentionClickListener) this.mentionClickListener.getValue(this, $$delegatedProperties[9]);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListListeners
    public final MessageListView.OnMessageClickListener getMessageClickListener() {
        return (MessageListView.OnMessageClickListener) this.messageClickListener.getValue(this, $$delegatedProperties[0]);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListListeners
    public final MessageListView.OnMessageLongClickListener getMessageLongClickListener() {
        return (MessageListView.OnMessageLongClickListener) this.messageLongClickListener.getValue(this, $$delegatedProperties[1]);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListListeners
    public final MessageListView.OnMessageRetryListener getMessageRetryListener() {
        return (MessageListView.OnMessageRetryListener) this.messageRetryListener.getValue(this, $$delegatedProperties[2]);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListListeners
    public final MessageListView.OnAddPollCommentClickListener getOnAddPollCommentClickListener() {
        return (MessageListView.OnAddPollCommentClickListener) this.onAddPollCommentClickListener.getValue(this, $$delegatedProperties[18]);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListListeners
    public final MessageListView.OnPollCloseClickListener getOnPollCloseClickListener() {
        return (MessageListView.OnPollCloseClickListener) this.onPollCloseClickListener.getValue(this, $$delegatedProperties[15]);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListListeners
    public final MessageListView.OnPollOptionClickListener getOnPollOptionClickListener() {
        return (MessageListView.OnPollOptionClickListener) this.onPollOptionClickListener.getValue(this, $$delegatedProperties[13]);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListListeners
    public final MessageListView.OnShowAllPollOptionClickListener getOnShowAllPollOptionClickListener() {
        return (MessageListView.OnShowAllPollOptionClickListener) this.onShowAllPollOptionClickListener.getValue(this, $$delegatedProperties[14]);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListListeners
    public final MessageListView.OnSuggestPollOptionClickListener getOnSuggestPollOptionClickListener() {
        return (MessageListView.OnSuggestPollOptionClickListener) this.onSuggestPollOptionClickListener.getValue(this, $$delegatedProperties[17]);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListListeners
    public final MessageListView.OnViewPollCommentsClickListener getOnViewPollCommentsClickListener() {
        return (MessageListView.OnViewPollCommentsClickListener) this.onViewPollCommentsClickListener.getValue(this, $$delegatedProperties[19]);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListListeners
    public final MessageListView.OnViewPollResultClickListener getOnViewPollResultClickListener() {
        return (MessageListView.OnViewPollResultClickListener) this.onViewPollResultClickListener.getValue(this, $$delegatedProperties[16]);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListListeners
    public final MessageListView.OnReactionViewClickListener getReactionViewClickListener() {
        return (MessageListView.OnReactionViewClickListener) this.reactionViewClickListener.getValue(this, $$delegatedProperties[7]);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListListeners
    public final MessageListView.OnThreadClickListener getThreadClickListener() {
        return (MessageListView.OnThreadClickListener) this.threadClickListener.getValue(this, $$delegatedProperties[3]);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListListeners
    public final MessageListView.OnTranslatedLabelClickListener getTranslatedLabelClickListener() {
        return (MessageListView.OnTranslatedLabelClickListener) this.translatedLabelClickListener.getValue(this, $$delegatedProperties[4]);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListListeners
    public final MessageListView.OnUnreadLabelReachedListener getUnreadLabelReachedListener() {
        return (MessageListView.OnUnreadLabelReachedListener) this.unreadLabelReachedListener.getValue(this, $$delegatedProperties[12]);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListListeners
    public final MessageListView.OnUserClickListener getUserClickListener() {
        return (MessageListView.OnUserClickListener) this.userClickListener.getValue(this, $$delegatedProperties[8]);
    }

    public final void setAttachmentClickListener(MessageListView.OnAttachmentClickListener onAttachmentClickListener) {
        AbstractC22676k.m65750j(onAttachmentClickListener, "<set-?>");
        this.attachmentClickListener.setValue(this, $$delegatedProperties[5], onAttachmentClickListener);
    }

    public final void setAttachmentDownloadClickListener(MessageListView.OnAttachmentDownloadClickListener onAttachmentDownloadClickListener) {
        AbstractC22676k.m65750j(onAttachmentDownloadClickListener, "<set-?>");
        this.attachmentDownloadClickListener.setValue(this, $$delegatedProperties[6], onAttachmentDownloadClickListener);
    }

    public final void setGiphySendListener(MessageListView.OnGiphySendListener onGiphySendListener) {
        AbstractC22676k.m65750j(onGiphySendListener, "<set-?>");
        this.giphySendListener.setValue(this, $$delegatedProperties[10], onGiphySendListener);
    }

    public final void setLinkClickListener(MessageListView.OnLinkClickListener onLinkClickListener) {
        AbstractC22676k.m65750j(onLinkClickListener, "<set-?>");
        this.linkClickListener.setValue(this, $$delegatedProperties[11], onLinkClickListener);
    }

    public final void setMentionClickListener(MessageListView.OnMentionClickListener onMentionClickListener) {
        AbstractC22676k.m65750j(onMentionClickListener, "<set-?>");
        this.mentionClickListener.setValue(this, $$delegatedProperties[9], onMentionClickListener);
    }

    public final void setMessageClickListener(MessageListView.OnMessageClickListener onMessageClickListener) {
        AbstractC22676k.m65750j(onMessageClickListener, "<set-?>");
        this.messageClickListener.setValue(this, $$delegatedProperties[0], onMessageClickListener);
    }

    public final void setMessageLongClickListener(MessageListView.OnMessageLongClickListener onMessageLongClickListener) {
        AbstractC22676k.m65750j(onMessageLongClickListener, "<set-?>");
        this.messageLongClickListener.setValue(this, $$delegatedProperties[1], onMessageLongClickListener);
    }

    public final void setMessageRetryListener(MessageListView.OnMessageRetryListener onMessageRetryListener) {
        AbstractC22676k.m65750j(onMessageRetryListener, "<set-?>");
        this.messageRetryListener.setValue(this, $$delegatedProperties[2], onMessageRetryListener);
    }

    public final void setOnAddPollCommentClickListener(MessageListView.OnAddPollCommentClickListener onAddPollCommentClickListener) {
        AbstractC22676k.m65750j(onAddPollCommentClickListener, "<set-?>");
        this.onAddPollCommentClickListener.setValue(this, $$delegatedProperties[18], onAddPollCommentClickListener);
    }

    public final void setOnPollCloseClickListener(MessageListView.OnPollCloseClickListener onPollCloseClickListener) {
        AbstractC22676k.m65750j(onPollCloseClickListener, "<set-?>");
        this.onPollCloseClickListener.setValue(this, $$delegatedProperties[15], onPollCloseClickListener);
    }

    public final void setOnPollOptionClickListener(MessageListView.OnPollOptionClickListener onPollOptionClickListener) {
        AbstractC22676k.m65750j(onPollOptionClickListener, "<set-?>");
        this.onPollOptionClickListener.setValue(this, $$delegatedProperties[13], onPollOptionClickListener);
    }

    public final void setOnShowAllPollOptionClickListener(MessageListView.OnShowAllPollOptionClickListener onShowAllPollOptionClickListener) {
        AbstractC22676k.m65750j(onShowAllPollOptionClickListener, "<set-?>");
        this.onShowAllPollOptionClickListener.setValue(this, $$delegatedProperties[14], onShowAllPollOptionClickListener);
    }

    public final void setOnSuggestPollOptionClickListener(MessageListView.OnSuggestPollOptionClickListener onSuggestPollOptionClickListener) {
        AbstractC22676k.m65750j(onSuggestPollOptionClickListener, "<set-?>");
        this.onSuggestPollOptionClickListener.setValue(this, $$delegatedProperties[17], onSuggestPollOptionClickListener);
    }

    public final void setOnViewPollCommentsClickListener(MessageListView.OnViewPollCommentsClickListener onViewPollCommentsClickListener) {
        AbstractC22676k.m65750j(onViewPollCommentsClickListener, "<set-?>");
        this.onViewPollCommentsClickListener.setValue(this, $$delegatedProperties[19], onViewPollCommentsClickListener);
    }

    public final void setOnViewPollResultClickListener(MessageListView.OnViewPollResultClickListener onViewPollResultClickListener) {
        AbstractC22676k.m65750j(onViewPollResultClickListener, "<set-?>");
        this.onViewPollResultClickListener.setValue(this, $$delegatedProperties[16], onViewPollResultClickListener);
    }

    public final void setReactionViewClickListener(MessageListView.OnReactionViewClickListener onReactionViewClickListener) {
        AbstractC22676k.m65750j(onReactionViewClickListener, "<set-?>");
        this.reactionViewClickListener.setValue(this, $$delegatedProperties[7], onReactionViewClickListener);
    }

    public final void setThreadClickListener(MessageListView.OnThreadClickListener onThreadClickListener) {
        AbstractC22676k.m65750j(onThreadClickListener, "<set-?>");
        this.threadClickListener.setValue(this, $$delegatedProperties[3], onThreadClickListener);
    }

    public final void setUnreadLabelReachedListener(MessageListView.OnUnreadLabelReachedListener onUnreadLabelReachedListener) {
        AbstractC22676k.m65750j(onUnreadLabelReachedListener, "<set-?>");
        this.unreadLabelReachedListener.setValue(this, $$delegatedProperties[12], onUnreadLabelReachedListener);
    }

    public final void setUserClickListener(MessageListView.OnUserClickListener onUserClickListener) {
        AbstractC22676k.m65750j(onUserClickListener, "<set-?>");
        this.userClickListener.setValue(this, $$delegatedProperties[8], onUserClickListener);
    }

    public /* synthetic */ MessageListListenersImpl(MessageListView.OnMessageClickListener onMessageClickListener, MessageListView.OnMessageLongClickListener onMessageLongClickListener, MessageListView.OnMessageRetryListener onMessageRetryListener, MessageListView.OnThreadClickListener onThreadClickListener, MessageListView.OnTranslatedLabelClickListener onTranslatedLabelClickListener, MessageListView.OnAttachmentClickListener onAttachmentClickListener, MessageListView.OnAttachmentDownloadClickListener onAttachmentDownloadClickListener, MessageListView.OnReactionViewClickListener onReactionViewClickListener, MessageListView.OnUserClickListener onUserClickListener, MessageListView.OnMentionClickListener onMentionClickListener, MessageListView.OnGiphySendListener onGiphySendListener, MessageListView.OnLinkClickListener onLinkClickListener, MessageListView.OnUnreadLabelReachedListener onUnreadLabelReachedListener, MessageListView.OnPollOptionClickListener onPollOptionClickListener, MessageListView.OnShowAllPollOptionClickListener onShowAllPollOptionClickListener, MessageListView.OnPollCloseClickListener onPollCloseClickListener, MessageListView.OnViewPollResultClickListener onViewPollResultClickListener, MessageListView.OnSuggestPollOptionClickListener onSuggestPollOptionClickListener, MessageListView.OnAddPollCommentClickListener onAddPollCommentClickListener, MessageListView.OnViewPollCommentsClickListener onViewPollCommentsClickListener, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C19736xbf595233(EmptyFunctions.INSTANCE.getONE_PARAM()) : onMessageClickListener, (i13 & 2) != 0 ? new C19737xd7e5de97(EmptyFunctions.INSTANCE.getONE_PARAM()) : onMessageLongClickListener, (i13 & 4) != 0 ? new C19738xadafc753(EmptyFunctions.INSTANCE.getONE_PARAM()) : onMessageRetryListener, (i13 & 8) != 0 ? new C19740x8a00a0ec(EmptyFunctions.INSTANCE.getONE_PARAM()) : onThreadClickListener, (i13 & 16) != 0 ? new C19741x3b6daf9c(EmptyFunctions.INSTANCE.getONE_PARAM()) : onTranslatedLabelClickListener, (i13 & 32) != 0 ? new C19731xc893b9b3(EmptyFunctions.INSTANCE.getTWO_PARAM()) : onAttachmentClickListener, (i13 & 64) != 0 ? new C19732xcc1f8d0b(EmptyFunctions.INSTANCE.getONE_PARAM()) : onAttachmentDownloadClickListener, (i13 & 128) != 0 ? new C19739x1a57c388(EmptyFunctions.INSTANCE.getONE_PARAM()) : onReactionViewClickListener, (i13 & 256) != 0 ? new C19742xfd00ac8b(EmptyFunctions.INSTANCE.getONE_PARAM()) : onUserClickListener, (i13 & 512) != 0 ? new C19735x9ed951f0(EmptyFunctions.INSTANCE.getONE_PARAM()) : onMentionClickListener, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? new C19733x258b3515(EmptyFunctions.INSTANCE.getONE_PARAM()) : onGiphySendListener, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? new C19734xbf4c247c(EmptyFunctions.INSTANCE.getONE_PARAM()) : onLinkClickListener, (i13 & 4096) != 0 ? new C19757o() : onUnreadLabelReachedListener, onPollOptionClickListener, onShowAllPollOptionClickListener, onPollCloseClickListener, onViewPollResultClickListener, onSuggestPollOptionClickListener, onAddPollCommentClickListener, onViewPollCommentsClickListener);
    }
}
