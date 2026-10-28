package io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.internal;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.C1153p;
import androidx.constraintlayout.widget.ConstraintLayout;
import c93.InterfaceC4339a;
import com.google.android.material.card.MaterialCardView;
import io.getstream.chat.android.client.utils.message.MessageUtils;
import io.getstream.chat.android.models.SyncStatus;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.ChatUI;
import io.getstream.chat.android.p226ui.common.helper.DateFormatter;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListItemStyle;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListViewStyle;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal.FootnoteView;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.Decorator;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl.CustomAttachmentsViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl.FileAttachmentsViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl.GiphyAttachmentViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl.GiphyViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl.LinkAttachmentsViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl.MediaAttachmentsViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl.MessageDeletedViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl.MessagePlainTextViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl.PollViewHolder;
import io.getstream.chat.android.p226ui.font.TextStyleKt;
import io.getstream.chat.android.p226ui.utils.extensions.ConstraintLayoutKt;
import io.getstream.chat.android.p226ui.utils.extensions.MessageItemKt;
import io.getstream.chat.android.p226ui.utils.extensions.MessageKt;
import io.getstream.chat.android.p226ui.utils.extensions.TextViewKt;
import java.util.Date;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001f\u0010\u001cJ'\u0010$\u001a\u00020\u00182\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u001f\u0010&\u001a\u00020\u00182\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b(\u0010\u001eJ\u001f\u0010)\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b)\u0010\u001eJ\u001f\u0010*\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b*\u0010\u001eJ\u001f\u0010+\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b+\u0010\u001eJ\u0017\u0010,\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\u00020\u00182\u0006\u0010/\u001a\u00020.2\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b0\u00101J\u001f\u00103\u001a\u00020\u00182\u0006\u0010/\u001a\u0002022\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b3\u00104J\u001f\u00106\u001a\u00020\u00182\u0006\u0010/\u001a\u0002052\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b6\u00107J\u001f\u00109\u001a\u00020\u00182\u0006\u0010/\u001a\u0002082\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b9\u0010:J\u001f\u0010<\u001a\u00020\u00182\u0006\u0010/\u001a\u00020;2\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b<\u0010=J\u001f\u0010?\u001a\u00020\u00182\u0006\u0010/\u001a\u00020>2\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b?\u0010@J\u001f\u0010B\u001a\u00020\u00182\u0006\u0010/\u001a\u00020A2\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\bB\u0010CJ\u001f\u0010E\u001a\u00020\u00182\u0006\u0010/\u001a\u00020D2\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\bE\u0010FJ\u001f\u0010H\u001a\u00020\u00182\u0006\u0010/\u001a\u00020G2\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\bH\u0010IR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010JR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010KR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010KR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010LR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010MR\u001a\u0010O\u001a\u00020N8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0014\u0010U\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bS\u0010T¨\u0006V"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/FootnoteDecorator;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/BaseDecorator;", "Lio/getstream/chat/android/ui/common/helper/DateFormatter;", "dateFormatter", "Lkotlin/Function0;", "", "isDirectMessage", "isThreadEnabled", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;", "listViewStyle", "Lkotlin/Function1;", "", "getLanguageDisplayName", "<init>", "(Lio/getstream/chat/android/ui/common/helper/DateFormatter;Lc93/a;Lc93/a;Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;Lkotlin/jvm/functions/Function1;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;", "footnoteView", "Landroidx/constraintlayout/widget/ConstraintLayout;", "root", "Landroid/view/View;", "threadGuideline", "anchorView", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;", "data", "Ll83/a0;", "setupFootnote", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Landroid/view/View;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "setupSimpleFootnoteWithRootConstraints", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "setupSimpleFootnote", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "setupThreadFootnote", "Landroid/widget/TextView;", "textView", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;", "style", "setupMessageFooterLabel", "(Landroid/widget/TextView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;)V", "showOnlyVisibleToYou", "(Landroid/widget/TextView;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;)V", "setupMessageFooterTime", "setupMessageFooterTranslatedLabel", "setupMessageFooterStatusIndicator", "setupMessageFooterReadCounter", "shouldHideReadRelatedInfo", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)Z", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;", "viewHolder", "decorateCustomAttachmentsMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;", "decorateGiphyAttachmentMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;", "decorateFileAttachmentsMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MediaAttachmentsViewHolder;", "decorateMediaAttachmentsMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MediaAttachmentsViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;", "decoratePlainTextMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;", "decoratePollMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;", "decorateGiphyMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;", "decorateLinkAttachmentsMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessageDeletedViewHolder;", "decorateDeletedMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessageDeletedViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/common/helper/DateFormatter;", "Lc93/a;", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;", "Lkotlin/jvm/functions/Function1;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator$Type;", "type", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator$Type;", "getType", "()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator$Type;", "getItemStyle", "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;", "itemStyle", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class FootnoteDecorator extends BaseDecorator {
    private final DateFormatter dateFormatter;
    private final Function1 getLanguageDisplayName;
    private final InterfaceC4339a isDirectMessage;
    private final InterfaceC4339a isThreadEnabled;
    private final MessageListViewStyle listViewStyle;
    private final Decorator.Type type;

    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SyncStatus.values().length];
            try {
                iArr[SyncStatus.IN_PROGRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SyncStatus.SYNC_NEEDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SyncStatus.AWAITING_ATTACHMENTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SyncStatus.COMPLETED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FootnoteDecorator(DateFormatter dateFormatter, InterfaceC4339a isDirectMessage, InterfaceC4339a isThreadEnabled, MessageListViewStyle listViewStyle, Function1 getLanguageDisplayName) {
        AbstractC22676k.m65750j(dateFormatter, "dateFormatter");
        AbstractC22676k.m65750j(isDirectMessage, "isDirectMessage");
        AbstractC22676k.m65750j(isThreadEnabled, "isThreadEnabled");
        AbstractC22676k.m65750j(listViewStyle, "listViewStyle");
        AbstractC22676k.m65750j(getLanguageDisplayName, "getLanguageDisplayName");
        this.dateFormatter = dateFormatter;
        this.isDirectMessage = isDirectMessage;
        this.isThreadEnabled = isThreadEnabled;
        this.listViewStyle = listViewStyle;
        this.getLanguageDisplayName = getLanguageDisplayName;
        this.type = Decorator.Type.BuiltIn.FOOTNOTE;
    }

    private final MessageListItemStyle getItemStyle() {
        return this.listViewStyle.getItemStyle();
    }

    private final void setupFootnote(FootnoteView footnoteView, ConstraintLayout root, View threadGuideline, View anchorView, MessageListItem.MessageItem data) {
        boolean z4 = MessageUtils.belongsToThread(data.getMessage()) && !data.isThreadMode();
        if (z4) {
            setupThreadFootnote(footnoteView, root, threadGuideline, data);
        } else {
            if (z4) {
                throw new NoWhenBranchMatchedException();
            }
            setupSimpleFootnoteWithRootConstraints(footnoteView, root, anchorView, data);
        }
        footnoteView.applyGravity(data.isMine());
    }

    private final void setupMessageFooterLabel(TextView textView, MessageListItem.MessageItem data, MessageListItemStyle style) {
        if (MessageItemKt.isBottomPosition(data) && !((Boolean) this.isDirectMessage.invoke()).booleanValue() && data.isTheirs()) {
            textView.setText(data.getMessage().getUser().getName());
            textView.setVisibility(0);
            TextStyleKt.setTextStyle(textView, style.getTextStyleUserName());
        } else if (MessageItemKt.isBottomPosition(data) && MessageUtils.isEphemeral(data.getMessage())) {
            showOnlyVisibleToYou(textView, style);
        } else {
            textView.setVisibility(8);
        }
    }

    private final void setupMessageFooterReadCounter(FootnoteView footnoteView, MessageListItem.MessageItem data) {
        boolean readCountEnabled = this.listViewStyle.getReadCountEnabled();
        boolean zShouldHideReadRelatedInfo = shouldHideReadRelatedInfo(data);
        if (!readCountEnabled || zShouldHideReadRelatedInfo) {
            footnoteView.hideReadCounter();
            return;
        }
        int size = (data.getMessage().getSyncStatus() == SyncStatus.COMPLETED && data.isMessageRead()) ? data.getMessageReadBy().size() : 0;
        if (size > 0) {
            footnoteView.showReadCounter(size, this.listViewStyle.getItemStyle());
        } else {
            footnoteView.hideReadCounter();
        }
    }

    private final void setupMessageFooterStatusIndicator(FootnoteView footnoteView, MessageListItem.MessageItem data) {
        Drawable iconIndicatorPendingSync;
        boolean showMessageDeliveryStatusIndicator = this.listViewStyle.getItemStyle().getShowMessageDeliveryStatusIndicator();
        boolean zShouldHideReadRelatedInfo = shouldHideReadRelatedInfo(data);
        if (!showMessageDeliveryStatusIndicator || zShouldHideReadRelatedInfo) {
            footnoteView.hideStatusIndicator();
            return;
        }
        int i13 = WhenMappings.$EnumSwitchMapping$0[data.getMessage().getSyncStatus().ordinal()];
        if (i13 == 1 || i13 == 2 || i13 == 3) {
            iconIndicatorPendingSync = this.listViewStyle.getItemStyle().getIconIndicatorPendingSync();
        } else if (i13 != 4) {
            iconIndicatorPendingSync = null;
        } else if (data.isMessageRead()) {
            iconIndicatorPendingSync = this.listViewStyle.getItemStyle().getIconIndicatorRead();
        } else {
            iconIndicatorPendingSync = data.isMessageDelivered() ? this.listViewStyle.getItemStyle().getIconIndicatorDelivered() : this.listViewStyle.getItemStyle().getIconIndicatorSent();
        }
        if (iconIndicatorPendingSync != null) {
            footnoteView.showStatusIndicator$stream_chat_android_ui_components_release(iconIndicatorPendingSync);
        } else {
            footnoteView.hideStatusIndicator();
        }
    }

    private final void setupMessageFooterTime(FootnoteView footnoteView, MessageListItem.MessageItem data) {
        Date createdAtOrNull = MessageKt.getCreatedAtOrNull(data.getMessage());
        String relativeTime = null;
        if (!MessageUtils.isDeleted(data.getMessage())) {
            Date messageTextUpdatedAt = data.getMessage().getMessageTextUpdatedAt();
            if (messageTextUpdatedAt == null) {
                messageTextUpdatedAt = null;
            } else if (messageTextUpdatedAt.getTime() > System.currentTimeMillis()) {
                messageTextUpdatedAt.setTime(System.currentTimeMillis());
            }
            if (messageTextUpdatedAt != null) {
                relativeTime = this.dateFormatter.formatRelativeTime(messageTextUpdatedAt);
            }
        }
        if (createdAtOrNull == null || !data.getShowMessageFooter()) {
            footnoteView.hideTimeLabel();
        } else {
            footnoteView.showTime(this.dateFormatter.formatTime(createdAtOrNull), relativeTime, this.listViewStyle.getItemStyle());
        }
    }

    private final void setupMessageFooterTranslatedLabel(FootnoteView footnoteView, MessageListItem.MessageItem data) {
        if (!ChatUI.getAutoTranslationEnabled()) {
            footnoteView.hideTranslatedLabel();
            return;
        }
        User currentUser = ChatUI.getCurrentUserProvider().getCurrentUser();
        String language = currentUser != null ? currentUser.getLanguage() : null;
        if (language == null) {
            language = "";
        }
        String originalLanguage = data.getMessage().getOriginalLanguage();
        boolean zIsGiphy = MessageUtils.isGiphy(data.getMessage());
        boolean zIsDeleted = MessageUtils.isDeleted(data.getMessage());
        String translation = data.getMessage().getTranslation(language);
        if (translation.length() == 0) {
            translation = data.getMessage().getText();
        }
        if (zIsGiphy || zIsDeleted || language.equals(originalLanguage) || AbstractC22676k.m65745e(translation, data.getMessage().getText())) {
            footnoteView.hideTranslatedLabel();
        } else {
            footnoteView.showTranslatedLabel((String) this.getLanguageDisplayName.invoke(language), this.listViewStyle.getItemStyle(), ChatUI.getShowOriginalTranslationEnabled(), data.getShowOriginalText());
        }
    }

    private final void setupSimpleFootnote(FootnoteView footnoteView, MessageListItem.MessageItem data) {
        setupMessageFooterTranslatedLabel(footnoteView, data);
        if (!data.getShowMessageFooter()) {
            footnoteView.hideSimpleFootnote();
            return;
        }
        footnoteView.showSimpleFootnote();
        setupMessageFooterLabel(footnoteView.getFooterTextLabel(), data, this.listViewStyle.getItemStyle());
        setupMessageFooterTime(footnoteView, data);
        setupMessageFooterStatusIndicator(footnoteView, data);
        setupMessageFooterReadCounter(footnoteView, data);
    }

    private final void setupSimpleFootnoteWithRootConstraints(FootnoteView footnoteView, ConstraintLayout root, View anchorView, MessageListItem.MessageItem data) {
        ConstraintLayoutKt.updateConstraints(root, new C19793a(footnoteView, anchorView, 1));
        setupSimpleFootnote(footnoteView, data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 setupSimpleFootnoteWithRootConstraints$lambda$1(FootnoteView footnoteView, View view, C1153p updateConstraints) {
        AbstractC22676k.m65750j(updateConstraints, "$this$updateConstraints");
        updateConstraints.m3646c(footnoteView.getId(), 3);
        updateConstraints.m3649f(footnoteView.getId(), 3, view.getId(), 4);
        return C23454a0.f92919a;
    }

    private final void setupThreadFootnote(FootnoteView footnoteView, ConstraintLayout root, View threadGuideline, MessageListItem.MessageItem data) {
        if (this.listViewStyle.getThreadsEnabled() && ((Boolean) this.isThreadEnabled.invoke()).booleanValue()) {
            ConstraintLayoutKt.updateConstraints(root, new C19793a(footnoteView, threadGuideline, 0));
            footnoteView.showThreadRepliesFootnote(data.isMine(), data.getMessage().getReplyCount(), data.getMessage().getThreadParticipants(), this.listViewStyle.getItemStyle());
            setupMessageFooterTranslatedLabel(footnoteView, data);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 setupThreadFootnote$lambda$2(FootnoteView footnoteView, View view, C1153p updateConstraints) {
        AbstractC22676k.m65750j(updateConstraints, "$this$updateConstraints");
        updateConstraints.m3646c(footnoteView.getId(), 3);
        updateConstraints.m3649f(footnoteView.getId(), 3, view.getId(), 4);
        return C23454a0.f92919a;
    }

    private final boolean shouldHideReadRelatedInfo(MessageListItem.MessageItem data) {
        return MessageItemKt.isNotBottomPosition(data) || data.isTheirs() || !io.getstream.chat.android.p226ui.common.utils.extensions.MessageKt.shouldShowMessageStatusIndicator(data.getMessage());
    }

    private final void showOnlyVisibleToYou(TextView textView, MessageListItemStyle style) {
        textView.setVisibility(0);
        textView.setText(textView.getContext().getString(C19469R.string.stream_ui_message_list_ephemeral_message));
        TextViewKt.setStartDrawable(textView, style.getIconOnlyVisibleToYou());
        textView.setCompoundDrawablePadding(textView.getResources().getDimensionPixelSize(C19469R.dimen.stream_ui_spacing_small));
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decorateCustomAttachmentsMessage(CustomAttachmentsViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        FootnoteView footnote = viewHolder.getBinding().footnote;
        AbstractC22676k.m65749i(footnote, "footnote");
        ConstraintLayout root = viewHolder.getBinding().getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        Space threadGuideline = viewHolder.getBinding().threadGuideline;
        AbstractC22676k.m65749i(threadGuideline, "threadGuideline");
        LinearLayout messageContainer = viewHolder.getBinding().messageContainer;
        AbstractC22676k.m65749i(messageContainer, "messageContainer");
        setupFootnote(footnote, root, threadGuideline, messageContainer, data);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decorateDeletedMessage(MessageDeletedViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        FootnoteView footnote = viewHolder.getBinding().footnote;
        AbstractC22676k.m65749i(footnote, "footnote");
        ConstraintLayout root = viewHolder.getBinding().getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        Space threadGuideline = viewHolder.getBinding().threadGuideline;
        AbstractC22676k.m65749i(threadGuideline, "threadGuideline");
        LinearLayout messageContainer = viewHolder.getBinding().messageContainer;
        AbstractC22676k.m65749i(messageContainer, "messageContainer");
        setupFootnote(footnote, root, threadGuideline, messageContainer, data);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decorateFileAttachmentsMessage(FileAttachmentsViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        FootnoteView footnote = viewHolder.getBinding().footnote;
        AbstractC22676k.m65749i(footnote, "footnote");
        ConstraintLayout root = viewHolder.getBinding().getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        Space threadGuideline = viewHolder.getBinding().threadGuideline;
        AbstractC22676k.m65749i(threadGuideline, "threadGuideline");
        LinearLayout messageContainer = viewHolder.getBinding().messageContainer;
        AbstractC22676k.m65749i(messageContainer, "messageContainer");
        setupFootnote(footnote, root, threadGuideline, messageContainer, data);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decorateGiphyAttachmentMessage(GiphyAttachmentViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        FootnoteView footnote = viewHolder.getBinding().footnote;
        AbstractC22676k.m65749i(footnote, "footnote");
        ConstraintLayout root = viewHolder.getBinding().getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        Space threadGuideline = viewHolder.getBinding().threadGuideline;
        AbstractC22676k.m65749i(threadGuideline, "threadGuideline");
        LinearLayout messageContainer = viewHolder.getBinding().messageContainer;
        AbstractC22676k.m65749i(messageContainer, "messageContainer");
        setupFootnote(footnote, root, threadGuideline, messageContainer, data);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decorateGiphyMessage(GiphyViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        FootnoteView footnote = viewHolder.getBinding().footnote;
        AbstractC22676k.m65749i(footnote, "footnote");
        ConstraintLayout root = viewHolder.getBinding().getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        MaterialCardView cardView = viewHolder.getBinding().cardView;
        AbstractC22676k.m65749i(cardView, "cardView");
        setupSimpleFootnoteWithRootConstraints(footnote, root, cardView, data);
        FootnoteView footnoteView = viewHolder.getBinding().footnote;
        footnoteView.applyGravity(data.isMine());
        footnoteView.hideStatusIndicator();
        footnoteView.hideReadCounter();
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decorateLinkAttachmentsMessage(LinkAttachmentsViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        FootnoteView footnote = viewHolder.getBinding().footnote;
        AbstractC22676k.m65749i(footnote, "footnote");
        ConstraintLayout root = viewHolder.getBinding().getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        Space threadGuideline = viewHolder.getBinding().threadGuideline;
        AbstractC22676k.m65749i(threadGuideline, "threadGuideline");
        LinearLayout messageContainer = viewHolder.getBinding().messageContainer;
        AbstractC22676k.m65749i(messageContainer, "messageContainer");
        setupFootnote(footnote, root, threadGuideline, messageContainer, data);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decorateMediaAttachmentsMessage(MediaAttachmentsViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        FootnoteView footnote = viewHolder.getBinding().footnote;
        AbstractC22676k.m65749i(footnote, "footnote");
        ConstraintLayout root = viewHolder.getBinding().getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        Space threadGuideline = viewHolder.getBinding().threadGuideline;
        AbstractC22676k.m65749i(threadGuideline, "threadGuideline");
        LinearLayout messageContainer = viewHolder.getBinding().messageContainer;
        AbstractC22676k.m65749i(messageContainer, "messageContainer");
        setupFootnote(footnote, root, threadGuideline, messageContainer, data);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decoratePlainTextMessage(MessagePlainTextViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        FootnoteView footnote = viewHolder.getBinding().footnote;
        AbstractC22676k.m65749i(footnote, "footnote");
        ConstraintLayout root = viewHolder.getBinding().getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        Space threadGuideline = viewHolder.getBinding().threadGuideline;
        AbstractC22676k.m65749i(threadGuideline, "threadGuideline");
        LinearLayout messageContainer = viewHolder.getBinding().messageContainer;
        AbstractC22676k.m65749i(messageContainer, "messageContainer");
        setupFootnote(footnote, root, threadGuideline, messageContainer, data);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decoratePollMessage(PollViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        FootnoteView footnote = viewHolder.getBinding().footnote;
        AbstractC22676k.m65749i(footnote, "footnote");
        ConstraintLayout root = viewHolder.getBinding().getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        Space threadGuideline = viewHolder.getBinding().threadGuideline;
        AbstractC22676k.m65749i(threadGuideline, "threadGuideline");
        LinearLayout messageContainer = viewHolder.getBinding().messageContainer;
        AbstractC22676k.m65749i(messageContainer, "messageContainer");
        setupFootnote(footnote, root, threadGuideline, messageContainer, data);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.Decorator
    public final Decorator.Type getType() {
        return this.type;
    }
}
