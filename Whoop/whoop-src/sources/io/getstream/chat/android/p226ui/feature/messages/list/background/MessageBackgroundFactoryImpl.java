package io.getstream.chat.android.p226ui.feature.messages.list.background;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.common.utils.extensions.AttachmentKt;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListItemStyle;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem;
import io.getstream.chat.android.p226ui.utils.extensions.IntKt;
import io.getstream.chat.android.p226ui.utils.extensions.MessageItemKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kr.C22788g;
import kr.C22792k;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0016\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\fJ\u001f\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\fJ\u001f\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\fJ\u001f\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\fJ\u001f\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\fJ\u001f\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\fJ\u001f\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\fJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001f¨\u0006!"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactoryImpl;", "Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactory;", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;", "style", "<init>", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;)V", "Landroid/content/Context;", "context", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;", "data", "Landroid/graphics/drawable/Drawable;", "defaultBackground", "(Landroid/content/Context;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)Landroid/graphics/drawable/Drawable;", "", "radius", "bottomEndCorner", "", "isMine", "isBottomPosition", "Lkr/k;", "shapeAppearanceModel", "(Landroid/content/Context;FFZZ)Lkr/k;", "plainTextMessageBackground", "pollMessageBackground", "imageAttachmentMessageBackground", "deletedMessageBackground", "textAndAttachmentMessageBackground", "fileAttachmentsMessageBackground", "linkAttachmentMessageBackground", "giphyAppearanceModel", "(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public class MessageBackgroundFactoryImpl implements MessageBackgroundFactory {
    private final MessageListItemStyle style;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final int MESSAGE_OTHER_USER_BACKGROUND = C19469R.color.stream_ui_white;
    private static final int MESSAGE_CURRENT_USER_BACKGROUND = C19469R.color.stream_ui_grey_gainsboro;
    private static final float SMALL_CARD_VIEW_CORNER_RADIUS = IntKt.dpToPxPrecise(2);
    private static final float DEFAULT_CORNER_RADIUS = IntKt.dpToPxPrecise(16);

    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactoryImpl$Companion;", "", "<init>", "()V", "MESSAGE_OTHER_USER_BACKGROUND", "", "MESSAGE_CURRENT_USER_BACKGROUND", "SMALL_CARD_VIEW_CORNER_RADIUS", "", "DEFAULT_CORNER_RADIUS", "getDEFAULT_CORNER_RADIUS$stream_chat_android_ui_components_release", "()F", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: renamed from: getDEFAULT_CORNER_RADIUS$stream_chat_android_ui_components_release */
        public final float m55603xf05a04f5() {
            return MessageBackgroundFactoryImpl.DEFAULT_CORNER_RADIUS;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public MessageBackgroundFactoryImpl(MessageListItemStyle style) {
        AbstractC22676k.m65750j(style, "style");
        this.style = style;
    }

    private final Drawable defaultBackground(Context context, MessageListItem.MessageItem data) {
        int iIntValue;
        int iIntValue2;
        C22788g c22788g = new C22788g(ShapeAppearanceModelFactory.INSTANCE.create(context, DEFAULT_CORNER_RADIUS, 0.0f, data.isMine(), MessageItemKt.isBottomPosition(data)));
        List<Attachment> attachments = data.getMessage().getAttachments();
        boolean z4 = false;
        if (!(attachments instanceof Collection) || !attachments.isEmpty()) {
            Iterator<T> it = attachments.iterator();
            while (it.hasNext()) {
                if (AttachmentKt.hasLink((Attachment) it.next())) {
                    z4 = true;
                    break;
                }
            }
        }
        if (data.isMine()) {
            c22788g.m66013o(Paint.Style.FILL_AND_STROKE);
            c22788g.m66016r(this.style.getMessageStrokeColorMine());
            c22788g.m66017s(this.style.getMessageStrokeWidthMine());
            if (z4) {
                iIntValue2 = this.style.getMessageLinkBackgroundColorMine();
            } else {
                Integer messageBackgroundColorMine = this.style.getMessageBackgroundColorMine();
                iIntValue2 = messageBackgroundColorMine != null ? messageBackgroundColorMine.intValue() : AbstractC32122c.getColor(context, MESSAGE_CURRENT_USER_BACKGROUND);
            }
            c22788g.setTint(iIntValue2);
            return c22788g;
        }
        c22788g.m66013o(Paint.Style.FILL_AND_STROKE);
        c22788g.m66016r(this.style.getMessageStrokeColorTheirs());
        c22788g.m66017s(this.style.getMessageStrokeWidthTheirs());
        if (z4) {
            iIntValue = this.style.getMessageLinkBackgroundColorTheirs();
        } else {
            Integer messageBackgroundColorTheirs = this.style.getMessageBackgroundColorTheirs();
            iIntValue = messageBackgroundColorTheirs != null ? messageBackgroundColorTheirs.intValue() : AbstractC32122c.getColor(context, MESSAGE_OTHER_USER_BACKGROUND);
        }
        c22788g.setTint(iIntValue);
        return c22788g;
    }

    private final C22792k shapeAppearanceModel(Context context, float radius, float bottomEndCorner, boolean isMine, boolean isBottomPosition) {
        return ShapeAppearanceModelFactory.INSTANCE.create(context, radius, bottomEndCorner, isMine, isBottomPosition);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.background.MessageBackgroundFactory
    public final Drawable deletedMessageBackground(Context context, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(data, "data");
        C22788g c22788g = new C22788g(ShapeAppearanceModelFactory.INSTANCE.create(context, DEFAULT_CORNER_RADIUS, 0.0f, data.isMine(), MessageItemKt.isBottomPosition(data)));
        c22788g.setTint(data.isTheirs() ? this.style.getMessageDeletedBackgroundTheirs() : this.style.getMessageDeletedBackgroundMine());
        return c22788g;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.background.MessageBackgroundFactory
    public final Drawable fileAttachmentsMessageBackground(Context context, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(data, "data");
        return defaultBackground(context, data);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.background.MessageBackgroundFactory
    public final Drawable giphyAppearanceModel(Context context) {
        AbstractC22676k.m65750j(context, "context");
        C22788g c22788g = new C22788g(ShapeAppearanceModelFactory.INSTANCE.create(context, DEFAULT_CORNER_RADIUS, SMALL_CARD_VIEW_CORNER_RADIUS, true, true));
        c22788g.setTint(AbstractC32122c.getColor(context, MESSAGE_OTHER_USER_BACKGROUND));
        return c22788g;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.background.MessageBackgroundFactory
    public final Drawable imageAttachmentMessageBackground(Context context, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(data, "data");
        return defaultBackground(context, data);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.background.MessageBackgroundFactory
    public final Drawable linkAttachmentMessageBackground(Context context, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(data, "data");
        return defaultBackground(context, data);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.background.MessageBackgroundFactory
    public final Drawable plainTextMessageBackground(Context context, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(data, "data");
        return defaultBackground(context, data);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.background.MessageBackgroundFactory
    public final Drawable pollMessageBackground(Context context, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(data, "data");
        return defaultBackground(context, data);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.background.MessageBackgroundFactory
    public final Drawable textAndAttachmentMessageBackground(Context context, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(data, "data");
        return defaultBackground(context, data);
    }
}
