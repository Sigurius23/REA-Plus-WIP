package io.getstream.chat.android.p226ui.feature.messages.list.options.message;

import android.content.Context;
import android.graphics.drawable.Drawable;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.common.state.messages.BlockUser;
import io.getstream.chat.android.p226ui.common.state.messages.Copy;
import io.getstream.chat.android.p226ui.common.state.messages.Delete;
import io.getstream.chat.android.p226ui.common.state.messages.Edit;
import io.getstream.chat.android.p226ui.common.state.messages.Flag;
import io.getstream.chat.android.p226ui.common.state.messages.MarkAsUnread;
import io.getstream.chat.android.p226ui.common.state.messages.MessageAction;
import io.getstream.chat.android.p226ui.common.state.messages.Pin;
import io.getstream.chat.android.p226ui.common.state.messages.Reply;
import io.getstream.chat.android.p226ui.common.state.messages.Resend;
import io.getstream.chat.android.p226ui.common.state.messages.ThreadReply;
import io.getstream.chat.android.p226ui.common.state.messages.UnblockUser;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListViewStyle;
import io.getstream.chat.android.p226ui.feature.messages.list.internal.MessageListViewExtensionsKt;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import java.util.List;
import java.util.Set;
import l83.C23465k;
import m83.AbstractC25260n;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J>\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/options/message/DefaultMessageOptionItemsFactory;", "Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItemsFactory;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "createMessageOptionItems", "", "Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;", "selectedMessage", "Lio/getstream/chat/android/models/Message;", "currentUser", "Lio/getstream/chat/android/models/User;", "isInThread", "", "ownCapabilities", "", "", "style", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public class DefaultMessageOptionItemsFactory implements MessageOptionItemsFactory {
    private final Context context;

    public DefaultMessageOptionItemsFactory(Context context) {
        AbstractC22676k.m65750j(context, "context");
        this.context = context;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.options.message.MessageOptionItemsFactory
    public final List<MessageOptionItem> createMessageOptionItems(Message selectedMessage, User currentUser, boolean isInThread, Set<String> ownCapabilities, MessageListViewStyle style) {
        MessageOptionItem messageOptionItem;
        MessageOptionItem messageOptionItem2;
        MessageOptionItem messageOptionItem3;
        MessageOptionItem messageOptionItem4;
        MessageOptionItem messageOptionItem5;
        MessageOptionItem messageOptionItem6;
        MessageOptionItem messageOptionItem7;
        MessageOptionItem messageOptionItem8;
        MessageOptionItem messageOptionItem9;
        MessageOptionItem messageOptionItem10;
        List<String> blockedUserIds;
        AbstractC22676k.m65750j(selectedMessage, "selectedMessage");
        AbstractC22676k.m65750j(ownCapabilities, "ownCapabilities");
        AbstractC22676k.m65750j(style, "style");
        if (selectedMessage.getId().length() == 0) {
            return C25271y.f99162w;
        }
        String id4 = selectedMessage.getUser().getId();
        if (MessageListViewExtensionsKt.canRetryMessage(style, currentUser, selectedMessage)) {
            String string = this.context.getString(C19469R.string.stream_ui_message_list_resend_message);
            AbstractC22676k.m65749i(string, "getString(...)");
            Drawable drawableCompat = ContextKt.getDrawableCompat(this.context, style.getRetryIcon());
            AbstractC22676k.m65747g(drawableCompat);
            messageOptionItem = new MessageOptionItem(string, drawableCompat, new Resend(selectedMessage), false, 8, null);
        } else {
            messageOptionItem = null;
        }
        if (MessageListViewExtensionsKt.canReplyToMessage(style, selectedMessage, ownCapabilities)) {
            String string2 = this.context.getString(C19469R.string.stream_ui_message_list_reply);
            AbstractC22676k.m65749i(string2, "getString(...)");
            Drawable drawableCompat2 = ContextKt.getDrawableCompat(this.context, style.getReplyIcon());
            AbstractC22676k.m65747g(drawableCompat2);
            messageOptionItem2 = new MessageOptionItem(string2, drawableCompat2, new Reply(selectedMessage), false, 8, null);
        } else {
            messageOptionItem2 = null;
        }
        if (MessageListViewExtensionsKt.canThreadReplyToMessage(style, isInThread, selectedMessage, ownCapabilities)) {
            String string3 = this.context.getString(C19469R.string.stream_ui_message_list_thread_reply);
            AbstractC22676k.m65749i(string3, "getString(...)");
            Drawable drawableCompat3 = ContextKt.getDrawableCompat(this.context, style.getThreadReplyIcon());
            AbstractC22676k.m65747g(drawableCompat3);
            messageOptionItem3 = new MessageOptionItem(string3, drawableCompat3, new ThreadReply(selectedMessage), false, 8, null);
        } else {
            messageOptionItem3 = null;
        }
        if (MessageListViewExtensionsKt.canMarkAsUnread(style, currentUser, selectedMessage, ownCapabilities)) {
            String string4 = this.context.getString(C19469R.string.stream_ui_message_list_mark_as_unread);
            AbstractC22676k.m65749i(string4, "getString(...)");
            Drawable drawableCompat4 = ContextKt.getDrawableCompat(this.context, style.getMarkAsUnreadIcon());
            AbstractC22676k.m65747g(drawableCompat4);
            messageOptionItem4 = new MessageOptionItem(string4, drawableCompat4, new MarkAsUnread(selectedMessage), false, 8, null);
        } else {
            messageOptionItem4 = null;
        }
        if (MessageListViewExtensionsKt.canCopyMessage(style, selectedMessage)) {
            String string5 = this.context.getString(C19469R.string.stream_ui_message_list_copy_message);
            AbstractC22676k.m65749i(string5, "getString(...)");
            Drawable drawableCompat5 = ContextKt.getDrawableCompat(this.context, style.getCopyIcon());
            AbstractC22676k.m65747g(drawableCompat5);
            messageOptionItem5 = new MessageOptionItem(string5, drawableCompat5, new Copy(selectedMessage), false, 8, null);
        } else {
            messageOptionItem5 = null;
        }
        if (MessageListViewExtensionsKt.canEditMessage(style, currentUser, selectedMessage, ownCapabilities)) {
            String string6 = this.context.getString(C19469R.string.stream_ui_message_list_edit_message);
            AbstractC22676k.m65749i(string6, "getString(...)");
            Drawable drawableCompat6 = ContextKt.getDrawableCompat(this.context, style.getEditIcon());
            AbstractC22676k.m65747g(drawableCompat6);
            messageOptionItem6 = new MessageOptionItem(string6, drawableCompat6, new Edit(selectedMessage), false, 8, null);
        } else {
            messageOptionItem6 = null;
        }
        if (MessageListViewExtensionsKt.canFlagMessage(style, currentUser, selectedMessage, ownCapabilities)) {
            String string7 = this.context.getString(C19469R.string.stream_ui_message_list_flag_message);
            AbstractC22676k.m65749i(string7, "getString(...)");
            Drawable drawableCompat7 = ContextKt.getDrawableCompat(this.context, style.getFlagIcon());
            AbstractC22676k.m65747g(drawableCompat7);
            messageOptionItem7 = new MessageOptionItem(string7, drawableCompat7, new Flag(selectedMessage), false, 8, null);
        } else {
            messageOptionItem7 = null;
        }
        if (MessageListViewExtensionsKt.canPinMessage(style, selectedMessage, ownCapabilities)) {
            C23465k c23465k = selectedMessage.getPinned() ? new C23465k(Integer.valueOf(C19469R.string.stream_ui_message_list_unpin_message), Integer.valueOf(style.getUnpinIcon())) : new C23465k(Integer.valueOf(C19469R.string.stream_ui_message_list_pin_message), Integer.valueOf(style.getPinIcon()));
            int iIntValue = ((Number) c23465k.f92937w).intValue();
            int iIntValue2 = ((Number) c23465k.f92938x).intValue();
            String string8 = this.context.getString(iIntValue);
            AbstractC22676k.m65749i(string8, "getString(...)");
            Drawable drawableCompat8 = ContextKt.getDrawableCompat(this.context, iIntValue2);
            AbstractC22676k.m65747g(drawableCompat8);
            messageOptionItem8 = new MessageOptionItem(string8, drawableCompat8, new Pin(selectedMessage), false, 8, null);
        } else {
            messageOptionItem8 = null;
        }
        if (MessageListViewExtensionsKt.canBlockUser(style, currentUser, selectedMessage)) {
            boolean z4 = false;
            if (currentUser != null && (blockedUserIds = currentUser.getBlockedUserIds()) != null && blockedUserIds.contains(id4)) {
                z4 = true;
            }
            int i13 = z4 ? C19469R.string.stream_ui_message_list_unblock_user : C19469R.string.stream_ui_message_list_block_user;
            int unblockUserIcon = z4 ? style.getUnblockUserIcon() : style.getBlockUserIcon();
            MessageAction unblockUser = z4 ? new UnblockUser(selectedMessage) : new BlockUser(selectedMessage);
            String string9 = this.context.getString(i13);
            AbstractC22676k.m65749i(string9, "getString(...)");
            Drawable drawableCompat9 = ContextKt.getDrawableCompat(this.context, unblockUserIcon);
            AbstractC22676k.m65747g(drawableCompat9);
            messageOptionItem9 = new MessageOptionItem(string9, drawableCompat9, unblockUser, false, 8, null);
        } else {
            messageOptionItem9 = null;
        }
        if (MessageListViewExtensionsKt.canDeleteMessage(style, currentUser, selectedMessage, ownCapabilities)) {
            String string10 = this.context.getString(C19469R.string.stream_ui_message_list_delete_message);
            AbstractC22676k.m65749i(string10, "getString(...)");
            Drawable drawableCompat10 = ContextKt.getDrawableCompat(this.context, style.getDeleteIcon());
            AbstractC22676k.m65747g(drawableCompat10);
            messageOptionItem10 = new MessageOptionItem(string10, drawableCompat10, new Delete(selectedMessage), true);
        } else {
            messageOptionItem10 = null;
        }
        return AbstractC25260n.m74077r0(new MessageOptionItem[]{messageOptionItem, messageOptionItem2, messageOptionItem3, messageOptionItem4, messageOptionItem5, messageOptionItem6, messageOptionItem7, messageOptionItem8, messageOptionItem9, messageOptionItem10});
    }
}
