package io.getstream.chat.android.p226ui.feature.messages.list.options.message;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import c93.InterfaceC4339a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.service.network.model.UserState;
import ge3.AbstractC15751g;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.Reaction;
import io.getstream.chat.android.models.SyncStatus;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.ChatUI;
import io.getstream.chat.android.p226ui.common.state.messages.MessageAction;
import io.getstream.chat.android.p226ui.common.state.messages.list.MessagePosition;
import io.getstream.chat.android.p226ui.databinding.StreamUiDialogMessageOptionsBinding;
import io.getstream.chat.android.p226ui.feature.messages.list.DefaultShowAvatarPredicate;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListView;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListViewStyle;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.BaseMessageItemViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemPayloadDiff;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewHolderFactory;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.attachment.AttachmentFactoryManager;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.DecoratorProvider;
import io.getstream.chat.android.p226ui.feature.messages.list.background.MessageBackgroundFactory;
import io.getstream.chat.android.p226ui.feature.messages.list.background.MessageBackgroundFactoryImpl;
import io.getstream.chat.android.p226ui.feature.messages.list.options.message.internal.MessageOptionsDecoratorProvider;
import io.getstream.chat.android.p226ui.feature.messages.list.options.message.internal.MessageOptionsView;
import io.getstream.chat.android.p226ui.feature.messages.list.reactions.edit.internal.EditReactionsView;
import io.getstream.chat.android.p226ui.feature.messages.list.reactions.user.internal.UserReactionsView;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.widgets.FullScreenDialogFragment;
import io.getstream.chat.android.p226ui.widgets.internal.TouchInterceptingFrameLayout;
import java.util.List;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import t83.InterfaceC33616a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 Z2\u00020\u0001:\u0005[\\]^ZB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0003J\u0015\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\u000eH\u0002¢\u0006\u0004\b \u0010\u0003J\u000f\u0010!\u001a\u00020\u000eH\u0002¢\u0006\u0004\b!\u0010\u0003J\u000f\u0010\"\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\"\u0010\u0003J\u000f\u0010#\u001a\u00020\u000eH\u0002¢\u0006\u0004\b#\u0010\u0003J\u000f\u0010$\u001a\u00020\u000eH\u0002¢\u0006\u0004\b$\u0010\u0003J\u000f\u0010%\u001a\u00020\u000eH\u0002¢\u0006\u0004\b%\u0010\u0003J\u000f\u0010&\u001a\u00020\u000eH\u0002¢\u0006\u0004\b&\u0010\u0003J0\u0010,\u001a\u00020\u000e*\u00020'2\u0006\u0010)\u001a\u00020(2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u000e0*H\u0082\b¢\u0006\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00105\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00108\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010:\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010<R\u001c\u0010?\u001a\b\u0012\u0004\u0012\u00020>0=8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010AR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010BR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010CR\u001e\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010E0D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u001b\u0010M\u001a\u00020H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u001b\u0010R\u001a\u00020N8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010J\u001a\u0004\bP\u0010QR\u001e\u0010U\u001a\n\u0012\u0006\b\u0001\u0012\u00020T0S8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010Y\u001a\u00020.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bW\u0010X¨\u0006_"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;", "Lio/getstream/chat/android/ui/widgets/FullScreenDialogFragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "Ll83/a0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "onDestroy", "Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$ReactionClickListener;", "reactionClickListener", "setReactionClickListener", "(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$ReactionClickListener;)V", "Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$UserReactionClickListener;", "userReactionClickListener", "setUserReactionClickListener", "(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$UserReactionClickListener;)V", "Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$MessageOptionClickListener;", "messageOptionClickListener", "setMessageOptionClickListener", "(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$MessageOptionClickListener;)V", "onStart", "setupDialog", "setupDismissibleArea", "setupEditReactionsView", "setupMessageView", "setupUserReactionsView", "setupMessageOptions", "anchorReactionsViewToMessageView", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;", "Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsDecoratorProvider;", "messageOptionsDecoratorProvider", "Lkotlin/Function1;", "block", "withDecoratorProvider", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsDecoratorProvider;Lkotlin/jvm/functions/Function1;)V", "Lio/getstream/chat/android/ui/databinding/StreamUiDialogMessageOptionsBinding;", "_binding", "Lio/getstream/chat/android/ui/databinding/StreamUiDialogMessageOptionsBinding;", "Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$OptionsDialogType;", "optionsDialogType", "Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$OptionsDialogType;", "Lio/getstream/chat/android/models/Message;", "message", "Lio/getstream/chat/android/models/Message;", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;", "style", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;", "messageListItemViewHolderFactory", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;", "Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsDecoratorProvider;", "", "Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;", "messageOptionItems", "Ljava/util/List;", "Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$ReactionClickListener;", "Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$UserReactionClickListener;", "Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$MessageOptionClickListener;", "Lkotlin/Function0;", "Lio/getstream/chat/android/models/User;", "getCurrentUser", "Lc93/a;", "", "optionsOffset$delegate", "Ll83/h;", "getOptionsOffset", "()I", "optionsOffset", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;", "messageItem$delegate", "getMessageItem", "()Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;", "messageItem", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;", "viewHolder", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;", "getBinding", "()Lio/getstream/chat/android/ui/databinding/StreamUiDialogMessageOptionsBinding;", "binding", "Companion", "ReactionClickListener", "UserReactionClickListener", "MessageOptionClickListener", "OptionsDialogType", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageOptionsDialogFragment extends FullScreenDialogFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final String TAG = "MessageOptionsDialogFragment";
    private StreamUiDialogMessageOptionsBinding _binding;
    private InterfaceC4339a getCurrentUser = MessageOptionsDialogFragment$getCurrentUser$1.INSTANCE;
    private Message message;

    /* JADX INFO: renamed from: messageItem$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h messageItem;
    private MessageListItemViewHolderFactory messageListItemViewHolderFactory;
    private MessageOptionClickListener messageOptionClickListener;
    private List<MessageOptionItem> messageOptionItems;
    private MessageOptionsDecoratorProvider messageOptionsDecoratorProvider;
    private OptionsDialogType optionsDialogType;

    /* JADX INFO: renamed from: optionsOffset$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h optionsOffset;
    private ReactionClickListener reactionClickListener;
    private MessageListViewStyle style;
    private UserReactionClickListener userReactionClickListener;
    private BaseMessageItemViewHolder<? extends MessageListItem> viewHolder;

    @Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J`\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$Companion;", "", "<init>", "()V", "TAG", "", "newInstance", "Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;", "context", "Landroid/content/Context;", "message", "Lio/getstream/chat/android/models/Message;", "messageOptionItems", "", "Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;", "optionsDialogType", "Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$OptionsDialogType;", "style", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;", "messageBackgroundFactory", "Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactory;", "attachmentFactoryManager", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;", "messageListItemViewHolderFactory", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;", "showAvatarPredicate", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ShowAvatarPredicate;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static MessageOptionsDialogFragment newInstance$default(Companion companion, Context context, Message message, List list, OptionsDialogType optionsDialogType, MessageListViewStyle messageListViewStyle, MessageBackgroundFactory messageBackgroundFactory, AttachmentFactoryManager attachmentFactoryManager, MessageListItemViewHolderFactory messageListItemViewHolderFactory, MessageListView.ShowAvatarPredicate showAvatarPredicate, int i13, Object obj) {
            MessageListItemViewHolderFactory messageListItemViewHolderFactory2;
            OptionsDialogType optionsDialogType2 = (i13 & 8) != 0 ? OptionsDialogType.MESSAGE_OPTIONS : optionsDialogType;
            MessageListViewStyle messageListViewStyleCreateDefault = (i13 & 16) != 0 ? MessageListViewStyle.INSTANCE.createDefault(context) : messageListViewStyle;
            MessageBackgroundFactory messageBackgroundFactoryImpl = (i13 & 32) != 0 ? new MessageBackgroundFactoryImpl(messageListViewStyleCreateDefault.getItemStyle()) : messageBackgroundFactory;
            AttachmentFactoryManager attachmentFactoryManager2 = (i13 & 64) != 0 ? ChatUI.getAttachmentFactoryManager() : attachmentFactoryManager;
            if ((i13 & 128) != 0) {
                MessageListItemViewHolderFactory messageListItemViewHolderFactory3 = new MessageListItemViewHolderFactory();
                messageListItemViewHolderFactory3.m55427xe9ea4c35(attachmentFactoryManager2);
                messageListItemViewHolderFactory3.m55430x76a35cc8(messageListViewStyleCreateDefault.getItemStyle());
                messageListItemViewHolderFactory3.m55429xf46d3450(messageListViewStyleCreateDefault.getGiphyViewHolderStyle());
                messageListItemViewHolderFactory3.m55428xffb4c134(messageListViewStyleCreateDefault.getAudioRecordPlayerViewStyle());
                messageListItemViewHolderFactory3.m55431x90bc9829(messageListViewStyleCreateDefault.getReplyMessageStyle());
                messageListItemViewHolderFactory3.setDecoratorProvider$stream_chat_android_ui_components_release(new MessageOptionsDialogFragment$Companion$newInstance$1$1());
                messageListItemViewHolderFactory2 = messageListItemViewHolderFactory3;
            } else {
                messageListItemViewHolderFactory2 = messageListItemViewHolderFactory;
            }
            return companion.newInstance(context, message, list, optionsDialogType2, messageListViewStyleCreateDefault, messageBackgroundFactoryImpl, attachmentFactoryManager2, messageListItemViewHolderFactory2, (i13 & 256) != 0 ? new DefaultShowAvatarPredicate() : showAvatarPredicate);
        }

        public final MessageOptionsDialogFragment newInstance(Context context, Message message, List<MessageOptionItem> messageOptionItems, OptionsDialogType optionsDialogType, MessageListViewStyle style, MessageBackgroundFactory messageBackgroundFactory, AttachmentFactoryManager attachmentFactoryManager, MessageListItemViewHolderFactory messageListItemViewHolderFactory, MessageListView.ShowAvatarPredicate showAvatarPredicate) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(message, "message");
            AbstractC22676k.m65750j(messageOptionItems, "messageOptionItems");
            AbstractC22676k.m65750j(optionsDialogType, "optionsDialogType");
            AbstractC22676k.m65750j(style, "style");
            AbstractC22676k.m65750j(messageBackgroundFactory, "messageBackgroundFactory");
            AbstractC22676k.m65750j(attachmentFactoryManager, "attachmentFactoryManager");
            AbstractC22676k.m65750j(messageListItemViewHolderFactory, "messageListItemViewHolderFactory");
            AbstractC22676k.m65750j(showAvatarPredicate, "showAvatarPredicate");
            MessageOptionsDialogFragment messageOptionsDialogFragment = new MessageOptionsDialogFragment();
            messageOptionsDialogFragment.message = message;
            messageOptionsDialogFragment.optionsDialogType = optionsDialogType;
            messageOptionsDialogFragment.style = style;
            messageOptionsDialogFragment.messageListItemViewHolderFactory = messageListItemViewHolderFactory;
            messageOptionsDialogFragment.messageOptionsDecoratorProvider = new MessageOptionsDecoratorProvider(style.getItemStyle(), style.getReplyMessageStyle(), messageBackgroundFactory, showAvatarPredicate);
            messageOptionsDialogFragment.messageOptionItems = messageOptionItems;
            return messageOptionsDialogFragment;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$MessageOptionClickListener;", "", "Lio/getstream/chat/android/ui/common/state/messages/MessageAction;", "messageAction", "Ll83/a0;", "onMessageOptionClick", "(Lio/getstream/chat/android/ui/common/state/messages/MessageAction;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface MessageOptionClickListener {
        void onMessageOptionClick(MessageAction messageAction);
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$OptionsDialogType;", "", "<init>", "(Ljava/lang/String;I)V", "MESSAGE_OPTIONS", "REACTION_OPTIONS", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public enum OptionsDialogType {
        MESSAGE_OPTIONS,
        REACTION_OPTIONS;

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$ReactionClickListener;", "", "Lio/getstream/chat/android/models/Message;", "message", "", "reactionType", "Ll83/a0;", "onReactionClick", "(Lio/getstream/chat/android/models/Message;Ljava/lang/String;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface ReactionClickListener {
        void onReactionClick(Message message, String reactionType);
    }

    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$UserReactionClickListener;", "", "Lio/getstream/chat/android/models/Message;", "message", "Lio/getstream/chat/android/models/User;", UserState.Sources.USER, "Lio/getstream/chat/android/models/Reaction;", "reaction", "Ll83/a0;", "onUserReactionClick", "(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Reaction;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface UserReactionClickListener {
        void onUserReactionClick(Message message, User user, Reaction reaction);
    }

    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionsDialogType.values().length];
            try {
                iArr[OptionsDialogType.MESSAGE_OPTIONS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionsDialogType.REACTION_OPTIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MessageOptionsDialogFragment() {
        final int i13 = 0;
        this.optionsOffset = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.ui.feature.messages.list.options.message.c

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ MessageOptionsDialogFragment f74790x;

            {
                this.f74790x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return Integer.valueOf(MessageOptionsDialogFragment.optionsOffset_delegate$lambda$0(this.f74790x));
                    default:
                        return MessageOptionsDialogFragment.messageItem_delegate$lambda$1(this.f74790x);
                }
            }
        });
        final int i14 = 1;
        this.messageItem = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.ui.feature.messages.list.options.message.c

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ MessageOptionsDialogFragment f74790x;

            {
                this.f74790x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return Integer.valueOf(MessageOptionsDialogFragment.optionsOffset_delegate$lambda$0(this.f74790x));
                    default:
                        return MessageOptionsDialogFragment.messageItem_delegate$lambda$1(this.f74790x);
                }
            }
        });
    }

    private final void anchorReactionsViewToMessageView() {
        final Context contextRequireContext = requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        final int dimension = ContextKt.getDimension(contextRequireContext, C19469R.dimen.stream_ui_edit_reactions_horizontal_offset);
        BaseMessageItemViewHolder<? extends MessageListItem> baseMessageItemViewHolder = this.viewHolder;
        if (baseMessageItemViewHolder == null) {
            AbstractC22676k.m65757q("viewHolder");
            throw null;
        }
        View viewMessageContainerView = baseMessageItemViewHolder.messageContainerView();
        if (viewMessageContainerView != null) {
            viewMessageContainerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.options.message.b
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i24) {
                    MessageOptionsDialogFragment.anchorReactionsViewToMessageView$lambda$19(this.f74786w, dimension, contextRequireContext, view, i13, i14, i15, i16, i17, i18, i19, i24);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void anchorReactionsViewToMessageView$lambda$19(MessageOptionsDialogFragment messageOptionsDialogFragment, int i13, Context context, View view, int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25) {
        StreamUiDialogMessageOptionsBinding streamUiDialogMessageOptionsBinding = messageOptionsDialogFragment._binding;
        AbstractC22676k.m65747g(streamUiDialogMessageOptionsBinding);
        int left = (i16 + i13) - streamUiDialogMessageOptionsBinding.editReactionsView.getLeft();
        int left2 = (i14 + i13) - streamUiDialogMessageOptionsBinding.editReactionsView.getLeft();
        boolean zIsRtlLayout = ContextKt.isRtlLayout(context);
        EditReactionsView editReactionsView = streamUiDialogMessageOptionsBinding.editReactionsView;
        if ((messageOptionsDialogFragment.getMessageItem().isMine() && !zIsRtlLayout) || ((!messageOptionsDialogFragment.getMessageItem().isMine() || !zIsRtlLayout) && (messageOptionsDialogFragment.getMessageItem().isMine() || zIsRtlLayout))) {
            left = left2;
        }
        editReactionsView.positionBubbleTail$stream_chat_android_ui_components_release(left);
    }

    private final StreamUiDialogMessageOptionsBinding getBinding() {
        StreamUiDialogMessageOptionsBinding streamUiDialogMessageOptionsBinding = this._binding;
        AbstractC22676k.m65747g(streamUiDialogMessageOptionsBinding);
        return streamUiDialogMessageOptionsBinding;
    }

    private final MessageListItem.MessageItem getMessageItem() {
        return (MessageListItem.MessageItem) this.messageItem.getValue();
    }

    private final int getOptionsOffset() {
        return ((Number) this.optionsOffset.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MessageListItem.MessageItem messageItem_delegate$lambda$1(MessageOptionsDialogFragment messageOptionsDialogFragment) {
        Message message = messageOptionsDialogFragment.message;
        String id4 = null;
        if (message == null) {
            AbstractC22676k.m65757q("message");
            throw null;
        }
        MessagePosition messagePosition = MessagePosition.BOTTOM;
        if (message == null) {
            AbstractC22676k.m65757q("message");
            throw null;
        }
        String id5 = message.getUser().getId();
        User currentUser = ChatUI.getCurrentUserProvider().getCurrentUser();
        if (currentUser != null) {
            id4 = currentUser.getId();
        }
        return new MessageListItem.MessageItem(message, messagePosition, AbstractC22676k.m65745e(id5, id4), null, false, false, false, false, false, 504, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int optionsOffset_delegate$lambda$0(MessageOptionsDialogFragment messageOptionsDialogFragment) {
        Context contextRequireContext = messageOptionsDialogFragment.requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        return ContextKt.getDimension(contextRequireContext, C19469R.dimen.stream_ui_spacing_medium);
    }

    private final void setupDialog() {
        setupDismissibleArea();
        setupEditReactionsView();
        setupMessageView();
        anchorReactionsViewToMessageView();
        OptionsDialogType optionsDialogType = this.optionsDialogType;
        if (optionsDialogType == null) {
            AbstractC22676k.m65757q("optionsDialogType");
            throw null;
        }
        int i13 = WhenMappings.$EnumSwitchMapping$0[optionsDialogType.ordinal()];
        if (i13 == 1) {
            setupMessageOptions();
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            setupUserReactionsView();
        }
    }

    private final void setupDismissibleArea() {
        StreamUiDialogMessageOptionsBinding streamUiDialogMessageOptionsBinding = this._binding;
        AbstractC22676k.m65747g(streamUiDialogMessageOptionsBinding);
        streamUiDialogMessageOptionsBinding.containerView.setOnClickListener(new ViewOnClickListenerC19872a(this, 1));
        StreamUiDialogMessageOptionsBinding streamUiDialogMessageOptionsBinding2 = this._binding;
        AbstractC22676k.m65747g(streamUiDialogMessageOptionsBinding2);
        streamUiDialogMessageOptionsBinding2.messageContainer.setOnClickListener(new ViewOnClickListenerC19872a(this, 2));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0061  */
    private final void setupEditReactionsView() {
        StreamUiDialogMessageOptionsBinding streamUiDialogMessageOptionsBinding = this._binding;
        AbstractC22676k.m65747g(streamUiDialogMessageOptionsBinding);
        EditReactionsView editReactionsView = streamUiDialogMessageOptionsBinding.editReactionsView;
        MessageListViewStyle messageListViewStyle = this.style;
        if (messageListViewStyle == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        editReactionsView.applyStyle$stream_chat_android_ui_components_release(messageListViewStyle.getItemStyle().getEditReactionsViewStyle());
        Message message = this.message;
        if (message == null) {
            AbstractC22676k.m65757q("message");
            throw null;
        }
        boolean z4 = message.getSyncStatus() == SyncStatus.COMPLETED;
        MessageListViewStyle messageListViewStyle2 = this.style;
        if (messageListViewStyle2 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        if (messageListViewStyle2.getReactionsEnabled()) {
            if (!z4) {
                MessageListViewStyle messageListViewStyle3 = this.style;
                if (messageListViewStyle3 == null) {
                    AbstractC22676k.m65757q("style");
                    throw null;
                }
                if (!messageListViewStyle3.getShowReactionsForUnsentMessages()) {
                    editReactionsView.setVisibility(8);
                }
            }
            Message message2 = this.message;
            if (message2 == null) {
                AbstractC22676k.m65757q("message");
                throw null;
            }
            editReactionsView.setMessage(message2, getMessageItem().isMine());
            editReactionsView.setReactionClickListener(new C19875d(this));
        } else {
            editReactionsView.setVisibility(8);
        }
        ViewGroup.LayoutParams layoutParams = editReactionsView.getLayoutParams();
        AbstractC22676k.m65748h(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        MessageListViewStyle messageListViewStyle4 = this.style;
        if (messageListViewStyle4 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        int optionsOverlayEditReactionsMarginTop = messageListViewStyle4.getOptionsOverlayEditReactionsMarginTop();
        MessageListViewStyle messageListViewStyle5 = this.style;
        if (messageListViewStyle5 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        int optionsOverlayEditReactionsMarginBottom = messageListViewStyle5.getOptionsOverlayEditReactionsMarginBottom();
        MessageListViewStyle messageListViewStyle6 = this.style;
        if (messageListViewStyle6 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        int optionsOverlayEditReactionsMarginStart = messageListViewStyle6.getOptionsOverlayEditReactionsMarginStart();
        MessageListViewStyle messageListViewStyle7 = this.style;
        if (messageListViewStyle7 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        int optionsOverlayEditReactionsMarginEnd = messageListViewStyle7.getOptionsOverlayEditReactionsMarginEnd();
        marginLayoutParams.setMarginStart(optionsOverlayEditReactionsMarginStart);
        marginLayoutParams.topMargin = optionsOverlayEditReactionsMarginTop;
        marginLayoutParams.setMarginEnd(optionsOverlayEditReactionsMarginEnd);
        marginLayoutParams.bottomMargin = optionsOverlayEditReactionsMarginBottom;
        LinearLayout.LayoutParams layoutParams2 = marginLayoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) marginLayoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.gravity = getMessageItem().isMine() ? 8388613 : 8388611;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupEditReactionsView$lambda$6$lambda$5(MessageOptionsDialogFragment messageOptionsDialogFragment, String it) {
        AbstractC22676k.m65750j(it, "it");
        ReactionClickListener reactionClickListener = messageOptionsDialogFragment.reactionClickListener;
        if (reactionClickListener != null) {
            Message message = messageOptionsDialogFragment.message;
            if (message == null) {
                AbstractC22676k.m65757q("message");
                throw null;
            }
            reactionClickListener.onReactionClick(message, it);
        }
        messageOptionsDialogFragment.dismiss();
    }

    private final void setupMessageOptions() {
        StreamUiDialogMessageOptionsBinding streamUiDialogMessageOptionsBinding = this._binding;
        AbstractC22676k.m65747g(streamUiDialogMessageOptionsBinding);
        MessageOptionsView messageOptionsView = streamUiDialogMessageOptionsBinding.messageOptionsView;
        AbstractC22676k.m65747g(messageOptionsView);
        messageOptionsView.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = messageOptionsView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = getMessageItem().isMine() ? 8388613 : 8388611;
        messageOptionsView.setLayoutParams(layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = messageOptionsView.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
        if (getMessageItem().isMine()) {
            MessageListViewStyle messageListViewStyle = this.style;
            if (messageListViewStyle == null) {
                AbstractC22676k.m65757q("style");
                throw null;
            }
            marginLayoutParams.setMarginEnd(messageListViewStyle.getItemStyle().getMessageEndMargin() + getOptionsOffset());
        } else {
            MessageListViewStyle messageListViewStyle2 = this.style;
            if (messageListViewStyle2 == null) {
                AbstractC22676k.m65757q("style");
                throw null;
            }
            marginLayoutParams.setMarginStart(messageListViewStyle2.getItemStyle().getMessageStartMargin() + getOptionsOffset());
        }
        messageOptionsView.setLayoutParams(marginLayoutParams);
        List<MessageOptionItem> list = this.messageOptionItems;
        if (list == null) {
            AbstractC22676k.m65757q("messageOptionItems");
            throw null;
        }
        MessageListViewStyle messageListViewStyle3 = this.style;
        if (messageListViewStyle3 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        messageOptionsView.setMessageOptions(list, messageListViewStyle3);
        messageOptionsView.setMessageActionClickListener(new C19875d(this));
        ViewGroup.LayoutParams layoutParams4 = messageOptionsView.getLayoutParams();
        AbstractC22676k.m65748h(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4;
        MessageListViewStyle messageListViewStyle4 = this.style;
        if (messageListViewStyle4 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        int optionsOverlayMessageOptionsMarginTop = messageListViewStyle4.getOptionsOverlayMessageOptionsMarginTop();
        MessageListViewStyle messageListViewStyle5 = this.style;
        if (messageListViewStyle5 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        int optionsOverlayMessageOptionsMarginBottom = messageListViewStyle5.getOptionsOverlayMessageOptionsMarginBottom();
        MessageListViewStyle messageListViewStyle6 = this.style;
        if (messageListViewStyle6 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        int optionsOverlayMessageOptionsMarginStart = messageListViewStyle6.getOptionsOverlayMessageOptionsMarginStart();
        MessageListViewStyle messageListViewStyle7 = this.style;
        if (messageListViewStyle7 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        int optionsOverlayMessageOptionsMarginEnd = messageListViewStyle7.getOptionsOverlayMessageOptionsMarginEnd();
        marginLayoutParams2.setMarginStart(optionsOverlayMessageOptionsMarginStart);
        marginLayoutParams2.topMargin = optionsOverlayMessageOptionsMarginTop;
        marginLayoutParams2.setMarginEnd(optionsOverlayMessageOptionsMarginEnd);
        marginLayoutParams2.bottomMargin = optionsOverlayMessageOptionsMarginBottom;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupMessageOptions$lambda$17$lambda$16(MessageOptionsDialogFragment messageOptionsDialogFragment, MessageAction messageAction) {
        AbstractC22676k.m65750j(messageAction, "messageAction");
        MessageOptionClickListener messageOptionClickListener = messageOptionsDialogFragment.messageOptionClickListener;
        if (messageOptionClickListener != null) {
            messageOptionClickListener.onMessageOptionClick(messageAction);
        }
        messageOptionsDialogFragment.dismiss();
    }

    private final void setupMessageView() {
        MessageListItemViewHolderFactory messageListItemViewHolderFactory = this.messageListItemViewHolderFactory;
        if (messageListItemViewHolderFactory == null) {
            AbstractC22676k.m65757q("messageListItemViewHolderFactory");
            throw null;
        }
        MessageOptionsDecoratorProvider messageOptionsDecoratorProvider = this.messageOptionsDecoratorProvider;
        if (messageOptionsDecoratorProvider == null) {
            AbstractC22676k.m65757q("messageOptionsDecoratorProvider");
            throw null;
        }
        DecoratorProvider decoratorProvider$stream_chat_android_ui_components_release = messageListItemViewHolderFactory.getDecoratorProvider$stream_chat_android_ui_components_release();
        messageListItemViewHolderFactory.setDecoratorProvider$stream_chat_android_ui_components_release(messageOptionsDecoratorProvider);
        try {
            StreamUiDialogMessageOptionsBinding streamUiDialogMessageOptionsBinding = this._binding;
            AbstractC22676k.m65747g(streamUiDialogMessageOptionsBinding);
            TouchInterceptingFrameLayout messageContainer = streamUiDialogMessageOptionsBinding.messageContainer;
            AbstractC22676k.m65749i(messageContainer, "messageContainer");
            BaseMessageItemViewHolder<? extends MessageListItem> baseMessageItemViewHolderCreateViewHolder = messageListItemViewHolderFactory.createViewHolder(messageContainer, messageListItemViewHolderFactory.getItemViewType(getMessageItem()));
            baseMessageItemViewHolderCreateViewHolder.itemView.setOnClickListener(new ViewOnClickListenerC19872a(this, 0));
            StreamUiDialogMessageOptionsBinding streamUiDialogMessageOptionsBinding2 = this._binding;
            AbstractC22676k.m65747g(streamUiDialogMessageOptionsBinding2);
            streamUiDialogMessageOptionsBinding2.messageContainer.addView(baseMessageItemViewHolderCreateViewHolder.itemView, new FrameLayout.LayoutParams(-1, -2));
            MessageListItem.MessageItem messageItem = getMessageItem();
            MessageListItemPayloadDiff.INSTANCE.getClass();
            baseMessageItemViewHolderCreateViewHolder.bindListItem$stream_chat_android_ui_components_release(messageItem, MessageListItemPayloadDiff.FULL);
            this.viewHolder = baseMessageItemViewHolderCreateViewHolder;
        } finally {
            messageListItemViewHolderFactory.setDecoratorProvider$stream_chat_android_ui_components_release(decoratorProvider$stream_chat_android_ui_components_release);
        }
    }

    private final void setupUserReactionsView() {
        StreamUiDialogMessageOptionsBinding streamUiDialogMessageOptionsBinding = this._binding;
        AbstractC22676k.m65747g(streamUiDialogMessageOptionsBinding);
        UserReactionsView userReactionsView = streamUiDialogMessageOptionsBinding.userReactionsView;
        AbstractC22676k.m65747g(userReactionsView);
        userReactionsView.setVisibility(0);
        MessageListViewStyle messageListViewStyle = this.style;
        if (messageListViewStyle == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        userReactionsView.configure$stream_chat_android_ui_components_release(messageListViewStyle);
        User currentUser = ChatUI.getCurrentUserProvider().getCurrentUser();
        if (currentUser != null) {
            Message message = this.message;
            if (message == null) {
                AbstractC22676k.m65757q("message");
                throw null;
            }
            userReactionsView.setMessage(message, currentUser);
        }
        userReactionsView.m55647xa633a074(new C19875d(this));
        ViewGroup.LayoutParams layoutParams = userReactionsView.getLayoutParams();
        AbstractC22676k.m65748h(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        MessageListViewStyle messageListViewStyle2 = this.style;
        if (messageListViewStyle2 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        int optionsOverlayUserReactionsMarginTop = messageListViewStyle2.getOptionsOverlayUserReactionsMarginTop();
        MessageListViewStyle messageListViewStyle3 = this.style;
        if (messageListViewStyle3 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        int optionsOverlayUserReactionsMarginBottom = messageListViewStyle3.getOptionsOverlayUserReactionsMarginBottom();
        MessageListViewStyle messageListViewStyle4 = this.style;
        if (messageListViewStyle4 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        int optionsOverlayUserReactionsMarginStart = messageListViewStyle4.getOptionsOverlayUserReactionsMarginStart();
        MessageListViewStyle messageListViewStyle5 = this.style;
        if (messageListViewStyle5 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        int optionsOverlayUserReactionsMarginEnd = messageListViewStyle5.getOptionsOverlayUserReactionsMarginEnd();
        marginLayoutParams.setMarginStart(optionsOverlayUserReactionsMarginStart);
        marginLayoutParams.topMargin = optionsOverlayUserReactionsMarginTop;
        marginLayoutParams.setMarginEnd(optionsOverlayUserReactionsMarginEnd);
        marginLayoutParams.bottomMargin = optionsOverlayUserReactionsMarginBottom;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupUserReactionsView$lambda$13$lambda$12(MessageOptionsDialogFragment messageOptionsDialogFragment, User user, Reaction reaction) {
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(reaction, "reaction");
        UserReactionClickListener userReactionClickListener = messageOptionsDialogFragment.userReactionClickListener;
        if (userReactionClickListener != null) {
            Message message = messageOptionsDialogFragment.message;
            if (message == null) {
                AbstractC22676k.m65757q("message");
                throw null;
            }
            userReactionClickListener.onUserReactionClick(message, user, reaction);
            messageOptionsDialogFragment.dismiss();
        }
    }

    private final void withDecoratorProvider(MessageListItemViewHolderFactory messageListItemViewHolderFactory, MessageOptionsDecoratorProvider messageOptionsDecoratorProvider, Function1 function1) {
        DecoratorProvider decoratorProvider$stream_chat_android_ui_components_release = messageListItemViewHolderFactory.getDecoratorProvider$stream_chat_android_ui_components_release();
        messageListItemViewHolderFactory.setDecoratorProvider$stream_chat_android_ui_components_release(messageOptionsDecoratorProvider);
        try {
            function1.invoke(messageListItemViewHolderFactory);
        } finally {
            messageListItemViewHolderFactory.setDecoratorProvider$stream_chat_android_ui_components_release(decoratorProvider$stream_chat_android_ui_components_release);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        StreamUiDialogMessageOptionsBinding streamUiDialogMessageOptionsBindingInflate = StreamUiDialogMessageOptionsBinding.inflate(inflater, container, false);
        this._binding = streamUiDialogMessageOptionsBindingInflate;
        ScrollView root = streamUiDialogMessageOptionsBindingInflate.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onDestroy() {
        super.onDestroy();
        this.reactionClickListener = null;
        this.userReactionClickListener = null;
        this.messageOptionClickListener = null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }

    @Override // io.getstream.chat.android.p226ui.widgets.FullScreenDialogFragment, androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        MessageListViewStyle messageListViewStyle = this.style;
        if (messageListViewStyle != null) {
            window.setBackgroundDrawable(new ColorDrawable(messageListViewStyle.getOptionsOverlayDimColor()));
        } else {
            AbstractC22676k.m65757q("style");
            throw null;
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        boolean z4 = (this.optionsDialogType == null || this.message == null || this.style == null || this.messageListItemViewHolderFactory == null || this.messageOptionItems == null) ? false : true;
        if (savedInstanceState == null && z4) {
            setupDialog();
        } else {
            dismiss();
        }
    }

    public final void setMessageOptionClickListener(MessageOptionClickListener messageOptionClickListener) {
        AbstractC22676k.m65750j(messageOptionClickListener, "messageOptionClickListener");
        this.messageOptionClickListener = messageOptionClickListener;
    }

    public final void setReactionClickListener(ReactionClickListener reactionClickListener) {
        AbstractC22676k.m65750j(reactionClickListener, "reactionClickListener");
        this.reactionClickListener = reactionClickListener;
    }

    public final void setUserReactionClickListener(UserReactionClickListener userReactionClickListener) {
        AbstractC22676k.m65750j(userReactionClickListener, "userReactionClickListener");
        this.userReactionClickListener = userReactionClickListener;
    }
}
