package io.getstream.chat.android.p226ui.feature.messages.preview.internal;

import android.content.Context;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import io.getstream.chat.android.client.utils.message.MessageUtils;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.ChannelInfo;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.ChatUI;
import io.getstream.chat.android.p226ui.common.model.MessageResult;
import io.getstream.chat.android.p226ui.common.utils.extensions.ChannelKt;
import io.getstream.chat.android.p226ui.databinding.StreamUiMessagePreviewItemBinding;
import io.getstream.chat.android.p226ui.feature.messages.preview.MessagePreviewStyle;
import io.getstream.chat.android.p226ui.font.TextStyleKt;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.MessageKt;
import io.getstream.chat.android.p226ui.utils.extensions.StringKt;
import io.getstream.chat.android.p226ui.utils.extensions.UserKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import io.getstream.chat.android.p226ui.widgets.avatar.UserAvatarView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\"\u0010\u0018R\u001a\u0010$\u001a\u00020#8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/preview/internal/MessagePreviewView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ll83/a0;", "init", "(Landroid/util/AttributeSet;)V", "parseAttrs", "Lio/getstream/chat/android/models/Message;", "message", "renderDate", "(Lio/getstream/chat/android/models/Message;)V", "renderMessage", "Lio/getstream/chat/android/ui/common/model/MessageResult;", "messageResult", "renderChannel", "(Lio/getstream/chat/android/ui/common/model/MessageResult;)V", "", "currentUserMention", "", "formatMessagePreview", "(Lio/getstream/chat/android/models/Message;Ljava/lang/String;)Ljava/lang/CharSequence;", "Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;", "messagePreviewStyle", "styleView", "(Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;)V", "renderMessageResult", "Lio/getstream/chat/android/ui/databinding/StreamUiMessagePreviewItemBinding;", "binding", "Lio/getstream/chat/android/ui/databinding/StreamUiMessagePreviewItemBinding;", "getBinding$stream_chat_android_ui_components_release", "()Lio/getstream/chat/android/ui/databinding/StreamUiMessagePreviewItemBinding;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessagePreviewView extends FrameLayout {
    private final StreamUiMessagePreviewItemBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagePreviewView(Context context) {
        super(ContextKt.createStreamThemeWrapper(context));
        AbstractC22676k.m65750j(context, "context");
        this.binding = StreamUiMessagePreviewItemBinding.inflate(ViewGroupKt.getStreamThemeInflater(this), this, true);
    }

    private final CharSequence formatMessagePreview(Message message, String currentUserMention) throws IOException {
        CharSequence charSequenceBold;
        if (MessageUtils.hasAudioRecording(message)) {
            String string = getContext().getString(C19469R.string.stream_ui_message_audio_reply_info);
            AbstractC22676k.m65749i(string, "getString(...)");
            return StringKt.italicize$default(string, null, false, 3, null);
        }
        SpannableString attachmentsText = MessageKt.getAttachmentsText(message);
        String string2 = AbstractC39414r.m125869O0(MessageKt.getTranslatedText$default(message, null, 1, null)).toString();
        if (currentUserMention != null) {
            charSequenceBold = string2;
            charSequenceBold = StringKt.bold(string2, AbstractC37056f.m118958J(currentUserMention), true);
        }
        charSequenceBold = string2;
        List listM118959K = AbstractC37056f.m118959K(charSequenceBold, attachmentsText);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM118959K) {
            CharSequence charSequence = (CharSequence) obj;
            if (charSequence != null && charSequence.length() != 0) {
                arrayList.add(obj);
            }
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        AbstractC25265s.m74109M0(arrayList, spannableStringBuilder, " ", null, null, null, 124);
        return spannableStringBuilder;
    }

    private final void init(AttributeSet attrs) {
    }

    private final void parseAttrs(AttributeSet attrs) {
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:7:0x000f  */
    private final void renderChannel(MessageResult messageResult) {
        boolean z4;
        User user;
        String name;
        Spanned spannedFromHtml;
        List<Member> members;
        String name2;
        Object next;
        Channel channel = messageResult.getChannel();
        if (channel != null) {
            z4 = ChannelKt.isDirectMessaging(channel);
        }
        User currentUser = ChatUI.getCurrentUserProvider().getCurrentUser();
        UserAvatarView userAvatarView = this.binding.userAvatarView;
        Channel channel2 = messageResult.getChannel();
        Spanned spannedBold$default = null;
        if (channel2 == null) {
            user = messageResult.getMessage().getUser();
        } else {
            if (!z4) {
                channel2 = null;
            }
            if (channel2 != null) {
                Iterator<T> it = channel2.getMembers().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (AbstractC22676k.m65745e(((Member) next).getUserId(), currentUser != null ? currentUser.getId() : null));
                Member member = (Member) next;
                user = member != null ? member.getUser() : null;
                if (user == null) {
                    user = messageResult.getMessage().getUser();
                }
            } else {
                user = messageResult.getMessage().getUser();
            }
        }
        UserAvatarView.setUser$default(userAvatarView, user, false, 2, null);
        TextView textView = this.binding.senderNameLabel;
        if (z4) {
            Channel channel3 = messageResult.getChannel();
            if (channel3 != null && (members = channel3.getMembers()) != null) {
                for (Member member2 : members) {
                    if (!AbstractC22676k.m65745e(member2.getUserId(), currentUser != null ? currentUser.getId() : null)) {
                        User user2 = member2.getUser();
                        if (user2 != null && (name2 = user2.getName()) != null) {
                            spannedBold$default = StringKt.bold$default(name2, null, false, 3, null);
                        }
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        } else {
            Channel channel4 = messageResult.getChannel();
            if (channel4 != null) {
                name = ChatUI.getChannelNameFormatter().formatChannelName(channel4, currentUser);
            } else {
                ChannelInfo channelInfo = messageResult.getMessage().getChannelInfo();
                name = channelInfo != null ? channelInfo.getName() : null;
            }
            spannedBold$default = (name == null || (spannedFromHtml = Html.fromHtml(getContext().getString(C19469R.string.stream_ui_message_preview_sender, messageResult.getMessage().getUser().getName(), name))) == null) ? StringKt.bold$default(messageResult.getMessage().getUser().getName(), null, false, 3, null) : spannedFromHtml;
        }
        textView.setText(spannedBold$default);
    }

    private final void renderDate(Message message) {
        this.binding.messageTimeLabel.setText(ChatUI.getDateFormatter().formatDate(MessageKt.getCreatedAtOrNull(message)));
    }

    private final void renderMessage(Message message) {
        String strAsMention;
        renderDate(message);
        TextView textView = this.binding.messageLabel;
        User currentUser = ChatUI.getCurrentUserProvider().getCurrentUser();
        if (currentUser != null) {
            Context context = getContext();
            AbstractC22676k.m65749i(context, "getContext(...)");
            strAsMention = UserKt.asMention(currentUser, context);
        } else {
            strAsMention = null;
        }
        textView.setText(formatMessagePreview(message, strAsMention));
    }

    /* JADX INFO: renamed from: getBinding$stream_chat_android_ui_components_release, reason: from getter */
    public final StreamUiMessagePreviewItemBinding getBinding() {
        return this.binding;
    }

    public final void renderMessageResult(MessageResult messageResult) {
        AbstractC22676k.m65750j(messageResult, "messageResult");
        renderMessage(messageResult.getMessage());
        renderChannel(messageResult);
    }

    public final void styleView(MessagePreviewStyle messagePreviewStyle) {
        AbstractC22676k.m65750j(messagePreviewStyle, "messagePreviewStyle");
        TextView senderNameLabel = this.binding.senderNameLabel;
        AbstractC22676k.m65749i(senderNameLabel, "senderNameLabel");
        TextStyleKt.setTextStyle(senderNameLabel, messagePreviewStyle.getMessageSenderTextStyle());
        TextView messageLabel = this.binding.messageLabel;
        AbstractC22676k.m65749i(messageLabel, "messageLabel");
        TextStyleKt.setTextStyle(messageLabel, messagePreviewStyle.getMessageTextStyle());
        TextView messageTimeLabel = this.binding.messageTimeLabel;
        AbstractC22676k.m65749i(messageTimeLabel, "messageTimeLabel");
        TextStyleKt.setTextStyle(messageTimeLabel, messagePreviewStyle.getMessageTimeTextStyle());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagePreviewView(Context context, AttributeSet attributeSet) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet);
        AbstractC22676k.m65750j(context, "context");
        this.binding = StreamUiMessagePreviewItemBinding.inflate(ViewGroupKt.getStreamThemeInflater(this), this, true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagePreviewView(Context context, AttributeSet attributeSet, int i13) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        this.binding = StreamUiMessagePreviewItemBinding.inflate(ViewGroupKt.getStreamThemeInflater(this), this, true);
    }
}
