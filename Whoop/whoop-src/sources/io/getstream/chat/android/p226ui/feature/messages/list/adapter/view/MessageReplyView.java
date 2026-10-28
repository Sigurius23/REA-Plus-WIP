package io.getstream.chat.android.p226ui.feature.messages.list.adapter.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.C1141d;
import androidx.constraintlayout.widget.C1153p;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import io.getstream.chat.android.client.utils.attachment.AttachmentUtilsKt;
import io.getstream.chat.android.client.utils.message.MessageUtils;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.Poll;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.ChatUI;
import io.getstream.chat.android.p226ui.common.C19470R;
import io.getstream.chat.android.p226ui.common.helper.DurationFormatter;
import io.getstream.chat.android.p226ui.common.utils.extensions.MessageKt;
import io.getstream.chat.android.p226ui.databinding.StreamUiMessageReplyViewBinding;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageReplyStyle;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.attachment.QuotedAttachmentFactoryManager;
import io.getstream.chat.android.p226ui.feature.messages.list.background.ShapeAppearanceModelFactory;
import io.getstream.chat.android.p226ui.font.TextStyle;
import io.getstream.chat.android.p226ui.utils.MessageEllipsizeKt;
import io.getstream.chat.android.p226ui.utils.extensions.ConstraintLayoutKt;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.IntKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import io.getstream.chat.android.p226ui.widgets.avatar.UserAvatarView;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kr.C22788g;
import kr.C22792k;
import l83.C23454a0;
import m83.AbstractC25265s;
import p167g5.AbstractC15484c;
import p479s4.AbstractC32122c;
import p708hb2.C17095c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 12\u00020\u0001:\u00011B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\r\u0010\bJ\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0017H\u0002¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010!\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0017H\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0017\u0010\"\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u0017H\u0002¢\u0006\u0004\b$\u0010#J)\u0010%\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b%\u0010\u001cJ!\u0010&\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020(2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J'\u0010,\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b,\u0010\u001cR\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u0010*\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u00100¨\u00062"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ll83/a0;", "init", "Lio/getstream/chat/android/models/User;", UserState.Sources.USER, "", "isVisible", "setUserAvatar", "(Lio/getstream/chat/android/models/User;Z)V", "isMine", "setAvatarPosition", "(Z)V", "Lio/getstream/chat/android/models/Message;", "quotedMessage", "Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;", "style", "setReplyBackground", "(Lio/getstream/chat/android/models/Message;ZLio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;)V", "message", "isLink", "(Lio/getstream/chat/android/models/Message;)Z", "hasEnrichedLink", "hasLinkInText", "setAttachmentImage", "(Lio/getstream/chat/android/models/Message;)V", "setAdditionalInfo", "setReplyText", "configureLinkTextStyle", "(ZLio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;)V", "", "text", "ellipsize", "(Ljava/lang/String;)Ljava/lang/String;", "setMessage", "Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;", "binding", "Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;", "Z", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageReplyView extends FrameLayout {
    private static final int MAX_ELLIPSIZE_CHAR_COUNT = 170;
    private final StreamUiMessageReplyViewBinding binding;
    private boolean ellipsize;
    private static final Companion Companion = new Companion();
    private static final float DEFAULT_STROKE_WIDTH = IntKt.dpToPxPrecise(1);
    private static final float REPLY_CORNER_RADIUS = IntKt.dpToPxPrecise(12);
    private static final int CONTENT_MARGIN = IntKt.dpToPx(4);

    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView$Companion;", "", "<init>", "()V", "DEFAULT_STROKE_WIDTH", "", "REPLY_CORNER_RADIUS", "CONTENT_MARGIN", "", "MAX_ELLIPSIZE_CHAR_COUNT", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageReplyView(Context context) {
        super(ContextKt.createStreamThemeWrapper(context));
        AbstractC22676k.m65750j(context, "context");
        this.binding = StreamUiMessageReplyViewBinding.inflate(ViewGroupKt.getStreamThemeInflater(this), this, true);
        init(context, null);
    }

    private final void configureLinkTextStyle(boolean isMine, MessageReplyStyle style) {
        TextStyle linkStyleTheirs;
        TextStyle linkStyleMine;
        if (isMine) {
            if (style == null || (linkStyleMine = style.getLinkStyleMine()) == null) {
                return;
            }
            TextView replyText = this.binding.replyText;
            AbstractC22676k.m65749i(replyText, "replyText");
            linkStyleMine.apply(replyText);
            return;
        }
        if (style == null || (linkStyleTheirs = style.getLinkStyleTheirs()) == null) {
            return;
        }
        TextView replyText2 = this.binding.replyText;
        AbstractC22676k.m65749i(replyText2, "replyText");
        linkStyleTheirs.apply(replyText2);
    }

    private final String ellipsize(String text) {
        return MessageEllipsizeKt.ellipsizeText$default(text, MAX_ELLIPSIZE_CHAR_COUNT, 0, 4, null);
    }

    private final boolean hasEnrichedLink(Message message) {
        List<Attachment> attachments = message.getAttachments();
        if (attachments.size() == 1) {
            Attachment attachment = (Attachment) AbstractC25265s.m74112P0(attachments);
            if (AttachmentUtilsKt.isImage(attachment) && (attachment.getTitleLink() != null || attachment.getOgUrl() != null)) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"RestrictedApi"})
    private final boolean hasLinkInText(Message message) {
        return AbstractC15484c.f58140a.matcher(message.getText()).matches();
    }

    private final void init(Context context, AttributeSet attrs) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C19469R.styleable.MessageReplyView);
        AbstractC22676k.m65749i(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.ellipsize = typedArrayObtainStyledAttributes.getBoolean(C19469R.styleable.MessageReplyView_streamUiEllipsize, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final boolean isLink(Message message) {
        return hasEnrichedLink(message) || hasLinkInText(message);
    }

    private final void setAdditionalInfo(Message message) {
        Object next;
        Integer durationInMs;
        List<Attachment> attachments = message.getAttachments();
        if (!(attachments instanceof Collection) || !attachments.isEmpty()) {
            Iterator<T> it = attachments.iterator();
            while (it.hasNext()) {
                if (AttachmentUtilsKt.isAudioRecording((Attachment) it.next())) {
                    TextView additionalInfo = this.binding.additionalInfo;
                    AbstractC22676k.m65749i(additionalInfo, "additionalInfo");
                    int iIntValue = 0;
                    additionalInfo.setVisibility(0);
                    TextView textView = this.binding.additionalInfo;
                    DurationFormatter durationFormatter = ChatUI.getDurationFormatter();
                    Iterator<T> it3 = message.getAttachments().iterator();
                    do {
                        if (!it3.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it3.next();
                    } while (!AttachmentUtilsKt.isAudioRecording((Attachment) next));
                    Attachment attachment = (Attachment) next;
                    if (attachment != null && (durationInMs = AttachmentExtensionsKt.getDurationInMs(attachment)) != null) {
                        iIntValue = durationInMs.intValue();
                    }
                    textView.setText(durationFormatter.format(iIntValue));
                    return;
                }
            }
        }
        TextView additionalInfo2 = this.binding.additionalInfo;
        AbstractC22676k.m65749i(additionalInfo2, "additionalInfo");
        additionalInfo2.setVisibility(8);
    }

    private final void setAttachmentImage(Message message) {
        if (!ChatUI.getQuotedAttachmentFactoryManager().canHandle(message)) {
            FrameLayout attachmentContainer = this.binding.attachmentContainer;
            AbstractC22676k.m65749i(attachmentContainer, "attachmentContainer");
            attachmentContainer.setVisibility(8);
            return;
        }
        FrameLayout attachmentContainer2 = this.binding.attachmentContainer;
        AbstractC22676k.m65749i(attachmentContainer2, "attachmentContainer");
        attachmentContainer2.setVisibility(0);
        QuotedAttachmentFactoryManager quotedAttachmentFactoryManager = ChatUI.getQuotedAttachmentFactoryManager();
        FrameLayout attachmentContainer3 = this.binding.attachmentContainer;
        AbstractC22676k.m65749i(attachmentContainer3, "attachmentContainer");
        quotedAttachmentFactoryManager.createAndAddQuotedView(message, attachmentContainer3);
    }

    private final void setAvatarPosition(boolean isMine) {
        StreamUiMessageReplyViewBinding streamUiMessageReplyViewBinding = this.binding;
        ConstraintLayout root = streamUiMessageReplyViewBinding.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        ConstraintLayoutKt.updateConstraints(root, new C17095c(streamUiMessageReplyViewBinding, 25));
        UserAvatarView replyAvatarView = streamUiMessageReplyViewBinding.replyAvatarView;
        AbstractC22676k.m65749i(replyAvatarView, "replyAvatarView");
        ViewGroup.LayoutParams layoutParams = replyAvatarView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        C1141d c1141d = (C1141d) layoutParams;
        if (isMine) {
            c1141d.f5075v = 0;
            c1141d.f5072s = streamUiMessageReplyViewBinding.replyContainer.getId();
        } else {
            c1141d.f5073t = 0;
            c1141d.f5074u = streamUiMessageReplyViewBinding.replyContainer.getId();
        }
        int i13 = CONTENT_MARGIN;
        c1141d.setMarginStart(i13);
        c1141d.setMarginEnd(i13);
        replyAvatarView.setLayoutParams(c1141d);
        ConstraintLayout replyContainer = streamUiMessageReplyViewBinding.replyContainer;
        AbstractC22676k.m65749i(replyContainer, "replyContainer");
        ViewGroup.LayoutParams layoutParams2 = replyContainer.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        C1141d c1141d2 = (C1141d) layoutParams2;
        if (isMine) {
            c1141d2.f5073t = 0;
            c1141d2.f5074u = streamUiMessageReplyViewBinding.replyAvatarView.getId();
        } else {
            c1141d2.f5072s = streamUiMessageReplyViewBinding.replyAvatarView.getId();
            c1141d2.f5075v = 0;
        }
        c1141d2.setMarginStart(i13);
        c1141d2.setMarginEnd(i13);
        replyContainer.setLayoutParams(c1141d2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 setAvatarPosition$lambda$4$lambda$1(StreamUiMessageReplyViewBinding streamUiMessageReplyViewBinding, C1153p updateConstraints) {
        AbstractC22676k.m65750j(updateConstraints, "$this$updateConstraints");
        updateConstraints.m3646c(streamUiMessageReplyViewBinding.replyAvatarView.getId(), 6);
        updateConstraints.m3646c(streamUiMessageReplyViewBinding.replyAvatarView.getId(), 7);
        updateConstraints.m3646c(streamUiMessageReplyViewBinding.replyContainer.getId(), 6);
        updateConstraints.m3646c(streamUiMessageReplyViewBinding.replyContainer.getId(), 7);
        return C23454a0.f92919a;
    }

    private final void setReplyBackground(Message quotedMessage, boolean isMine, MessageReplyStyle style) {
        int color;
        int color2;
        int color3;
        int color4;
        int color5;
        ShapeAppearanceModelFactory shapeAppearanceModelFactory = ShapeAppearanceModelFactory.INSTANCE;
        Context context = getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        C22792k c22792kCreate = shapeAppearanceModelFactory.create(context, REPLY_CORNER_RADIUS, 0.0f, MessageKt.isMine(quotedMessage, ChatClient.INSTANCE.instance().getCurrentUser()), true);
        ConstraintLayout constraintLayout = this.binding.replyContainer;
        C22788g c22788g = new C22788g(c22792kCreate);
        if (isLink(quotedMessage)) {
            c22788g.m66013o(Paint.Style.FILL);
            if (isMine) {
                if (style != null) {
                    color5 = style.getLinkBackgroundColorMine();
                } else {
                    Context context2 = getContext();
                    AbstractC22676k.m65749i(context2, "getContext(...)");
                    color5 = AbstractC32122c.getColor(context2, C19469R.color.stream_ui_blue_alice);
                }
            } else if (style != null) {
                color5 = style.getLinkBackgroundColorTheirs();
            } else {
                Context context3 = getContext();
                AbstractC22676k.m65749i(context3, "getContext(...)");
                color5 = AbstractC32122c.getColor(context3, C19469R.color.stream_ui_blue_alice);
            }
            c22788g.setTint(color5);
        } else if (isMine) {
            c22788g.m66013o(Paint.Style.FILL_AND_STROKE);
            if (style != null) {
                color3 = style.getMessageStrokeColorMine();
            } else {
                Context context4 = getContext();
                AbstractC22676k.m65749i(context4, "getContext(...)");
                color3 = AbstractC32122c.getColor(context4, C19469R.color.stream_ui_literal_transparent);
            }
            c22788g.m66016r(color3);
            c22788g.m66017s(style != null ? style.getMessageStrokeWidthMine() : DEFAULT_STROKE_WIDTH);
            if (style != null) {
                color4 = style.getMessageBackgroundColorMine();
            } else {
                Context context5 = getContext();
                AbstractC22676k.m65749i(context5, "getContext(...)");
                color4 = AbstractC32122c.getColor(context5, C19469R.color.stream_ui_white);
            }
            c22788g.setTint(color4);
        } else {
            c22788g.m66013o(Paint.Style.FILL_AND_STROKE);
            if (style != null) {
                color = style.getMessageStrokeColorTheirs();
            } else {
                Context context6 = getContext();
                AbstractC22676k.m65749i(context6, "getContext(...)");
                color = AbstractC32122c.getColor(context6, C19469R.color.stream_ui_grey_gainsboro);
            }
            c22788g.m66016r(color);
            c22788g.m66017s(style != null ? style.getMessageStrokeWidthTheirs() : DEFAULT_STROKE_WIDTH);
            if (style != null) {
                color2 = style.getMessageBackgroundColorTheirs();
            } else {
                Context context7 = getContext();
                AbstractC22676k.m65749i(context7, "getContext(...)");
                color2 = AbstractC32122c.getColor(context7, C19469R.color.stream_ui_grey_whisper);
            }
            c22788g.setTint(color2);
        }
        constraintLayout.setBackground(c22788g);
    }

    private final void setReplyText(Message message, boolean isMine, MessageReplyStyle style) {
        String title;
        TextStyle textStyleTheirs;
        TextStyle textStyleMine;
        Poll poll = message.getPoll();
        Attachment attachment = (Attachment) AbstractC25265s.m74114R0(message.getAttachments());
        String translatedText$default = io.getstream.chat.android.p226ui.utils.extensions.MessageKt.getTranslatedText$default(message, null, 1, null);
        TextView textView = this.binding.replyText;
        if (MessageUtils.isDeleted(message)) {
            title = getContext().getString(C19470R.string.stream_ui_message_list_message_deleted);
        } else if (poll != null) {
            title = getContext().getString(C19469R.string.stream_ui_quoted_message_poll, poll.getName());
        } else if (attachment == null || !AbstractC39414r.m125890i0(translatedText$default)) {
            if (this.ellipsize) {
                translatedText$default = ellipsize(translatedText$default);
            }
            title = translatedText$default;
        } else if (AttachmentUtilsKt.isAudioRecording(attachment)) {
            title = getContext().getString(C19469R.string.stream_ui_message_audio_reply_info);
        } else {
            title = attachment.getTitle();
            if (title == null) {
                title = attachment.getName();
            }
        }
        textView.setText(title);
        if (isLink(message)) {
            configureLinkTextStyle(isMine, style);
            return;
        }
        if (isMine) {
            if (style == null || (textStyleMine = style.getTextStyleMine()) == null) {
                return;
            }
            TextView replyText = this.binding.replyText;
            AbstractC22676k.m65749i(replyText, "replyText");
            textStyleMine.apply(replyText);
            return;
        }
        if (style == null || (textStyleTheirs = style.getTextStyleTheirs()) == null) {
            return;
        }
        TextView replyText2 = this.binding.replyText;
        AbstractC22676k.m65749i(replyText2, "replyText");
        textStyleTheirs.apply(replyText2);
    }

    private final void setUserAvatar(User user, boolean isVisible) {
        UserAvatarView.setUser$default(this.binding.replyAvatarView, user, false, 2, null);
        UserAvatarView replyAvatarView = this.binding.replyAvatarView;
        AbstractC22676k.m65749i(replyAvatarView, "replyAvatarView");
        replyAvatarView.setVisibility(isVisible ? 0 : 8);
    }

    public final void setMessage(Message message, boolean isMine, MessageReplyStyle style) {
        AbstractC22676k.m65750j(message, "message");
        setUserAvatar(message.getUser(), style != null ? style.getShowUserAvatar() : true);
        setAvatarPosition(MessageKt.isMine(message, ChatClient.INSTANCE.instance().getCurrentUser()));
        setReplyBackground(message, isMine, style);
        setAttachmentImage(message);
        setAdditionalInfo(message);
        setReplyText(message, isMine, style);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageReplyView(Context context, AttributeSet attributeSet) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet);
        AbstractC22676k.m65750j(context, "context");
        this.binding = StreamUiMessageReplyViewBinding.inflate(ViewGroupKt.getStreamThemeInflater(this), this, true);
        init(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageReplyView(Context context, AttributeSet attributeSet, int i13) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        this.binding = StreamUiMessageReplyViewBinding.inflate(ViewGroupKt.getStreamThemeInflater(this), this, true);
        init(context, attributeSet);
    }
}
