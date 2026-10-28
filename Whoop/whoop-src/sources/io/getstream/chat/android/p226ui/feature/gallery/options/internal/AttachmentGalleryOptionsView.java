package io.getstream.chat.android.p226ui.feature.gallery.options.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import io.getstream.chat.android.p226ui.databinding.StreamUiAttachmentGalleryOptionsViewBinding;
import io.getstream.chat.android.p226ui.feature.gallery.options.AttachmentGalleryOptionsViewStyle;
import io.getstream.chat.android.p226ui.font.TextStyleKt;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.TextViewKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0012J\u0015\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ll83/a0;", "init", "(Landroid/util/AttributeSet;)V", "Landroid/view/View$OnClickListener;", "listener", "setReplyClickListener", "(Landroid/view/View$OnClickListener;)V", "setDeleteClickListener", "setShowInChatClickListener", "setSaveMediaClickListener", "", "isMine", "setIsMine", "(Z)V", "Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentGalleryOptionsViewBinding;", "binding", "Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentGalleryOptionsViewBinding;", "Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle;", "style", "Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AttachmentGalleryOptionsView extends FrameLayout {
    private final StreamUiAttachmentGalleryOptionsViewBinding binding;
    private AttachmentGalleryOptionsViewStyle style;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AttachmentGalleryOptionsView(Context context) {
        this(context, null, 0);
        AbstractC22676k.m65750j(context, "context");
    }

    private final void init(AttributeSet attrs) {
        AttachmentGalleryOptionsViewStyle.Companion companion = AttachmentGalleryOptionsViewStyle.INSTANCE;
        Context context = getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        AttachmentGalleryOptionsViewStyle attachmentGalleryOptionsViewStyleInvoke = companion.invoke(context, attrs);
        this.style = attachmentGalleryOptionsViewStyleInvoke;
        CardView cardView = this.binding.optionsContainer;
        if (attachmentGalleryOptionsViewStyleInvoke == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        cardView.setCardBackgroundColor(attachmentGalleryOptionsViewStyleInvoke.getBackgroundColor());
        AttachmentGalleryOptionsViewStyle attachmentGalleryOptionsViewStyle = this.style;
        if (attachmentGalleryOptionsViewStyle == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        if (attachmentGalleryOptionsViewStyle.getReplyOptionEnabled()) {
            TextView reply = this.binding.reply;
            AbstractC22676k.m65749i(reply, "reply");
            AttachmentGalleryOptionsViewStyle attachmentGalleryOptionsViewStyle2 = this.style;
            if (attachmentGalleryOptionsViewStyle2 == null) {
                AbstractC22676k.m65757q("style");
                throw null;
            }
            TextViewKt.setStartDrawable(reply, attachmentGalleryOptionsViewStyle2.getReplyOptionDrawable());
            TextView reply2 = this.binding.reply;
            AbstractC22676k.m65749i(reply2, "reply");
            AttachmentGalleryOptionsViewStyle attachmentGalleryOptionsViewStyle3 = this.style;
            if (attachmentGalleryOptionsViewStyle3 == null) {
                AbstractC22676k.m65757q("style");
                throw null;
            }
            TextStyleKt.setTextStyle(reply2, attachmentGalleryOptionsViewStyle3.getOptionTextStyle());
        } else {
            TextView reply3 = this.binding.reply;
            AbstractC22676k.m65749i(reply3, "reply");
            reply3.setVisibility(8);
        }
        AttachmentGalleryOptionsViewStyle attachmentGalleryOptionsViewStyle4 = this.style;
        if (attachmentGalleryOptionsViewStyle4 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        if (attachmentGalleryOptionsViewStyle4.getShowInChatOptionEnabled()) {
            TextView showInChat = this.binding.showInChat;
            AbstractC22676k.m65749i(showInChat, "showInChat");
            AttachmentGalleryOptionsViewStyle attachmentGalleryOptionsViewStyle5 = this.style;
            if (attachmentGalleryOptionsViewStyle5 == null) {
                AbstractC22676k.m65757q("style");
                throw null;
            }
            TextViewKt.setStartDrawable(showInChat, attachmentGalleryOptionsViewStyle5.getShowInChatOptionDrawable());
            TextView showInChat2 = this.binding.showInChat;
            AbstractC22676k.m65749i(showInChat2, "showInChat");
            AttachmentGalleryOptionsViewStyle attachmentGalleryOptionsViewStyle6 = this.style;
            if (attachmentGalleryOptionsViewStyle6 == null) {
                AbstractC22676k.m65757q("style");
                throw null;
            }
            TextStyleKt.setTextStyle(showInChat2, attachmentGalleryOptionsViewStyle6.getOptionTextStyle());
        } else {
            TextView showInChat3 = this.binding.showInChat;
            AbstractC22676k.m65749i(showInChat3, "showInChat");
            showInChat3.setVisibility(8);
        }
        AttachmentGalleryOptionsViewStyle attachmentGalleryOptionsViewStyle7 = this.style;
        if (attachmentGalleryOptionsViewStyle7 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        if (attachmentGalleryOptionsViewStyle7.getSaveMediaOptionEnabled()) {
            TextView saveMedia = this.binding.saveMedia;
            AbstractC22676k.m65749i(saveMedia, "saveMedia");
            AttachmentGalleryOptionsViewStyle attachmentGalleryOptionsViewStyle8 = this.style;
            if (attachmentGalleryOptionsViewStyle8 == null) {
                AbstractC22676k.m65757q("style");
                throw null;
            }
            TextViewKt.setStartDrawable(saveMedia, attachmentGalleryOptionsViewStyle8.getSaveMediaOptionDrawable());
            TextView saveMedia2 = this.binding.saveMedia;
            AbstractC22676k.m65749i(saveMedia2, "saveMedia");
            AttachmentGalleryOptionsViewStyle attachmentGalleryOptionsViewStyle9 = this.style;
            if (attachmentGalleryOptionsViewStyle9 == null) {
                AbstractC22676k.m65757q("style");
                throw null;
            }
            TextStyleKt.setTextStyle(saveMedia2, attachmentGalleryOptionsViewStyle9.getOptionTextStyle());
        } else {
            TextView saveMedia3 = this.binding.saveMedia;
            AbstractC22676k.m65749i(saveMedia3, "saveMedia");
            saveMedia3.setVisibility(8);
        }
        AttachmentGalleryOptionsViewStyle attachmentGalleryOptionsViewStyle10 = this.style;
        if (attachmentGalleryOptionsViewStyle10 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        if (!attachmentGalleryOptionsViewStyle10.getDeleteOptionEnabled()) {
            TextView delete = this.binding.delete;
            AbstractC22676k.m65749i(delete, "delete");
            delete.setVisibility(8);
            return;
        }
        TextView delete2 = this.binding.delete;
        AbstractC22676k.m65749i(delete2, "delete");
        AttachmentGalleryOptionsViewStyle attachmentGalleryOptionsViewStyle11 = this.style;
        if (attachmentGalleryOptionsViewStyle11 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        TextViewKt.setStartDrawable(delete2, attachmentGalleryOptionsViewStyle11.getDeleteOptionDrawable());
        TextView delete3 = this.binding.delete;
        AbstractC22676k.m65749i(delete3, "delete");
        AttachmentGalleryOptionsViewStyle attachmentGalleryOptionsViewStyle12 = this.style;
        if (attachmentGalleryOptionsViewStyle12 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        TextStyleKt.setTextStyle(delete3, attachmentGalleryOptionsViewStyle12.getOptionTextStyle());
        TextView textView = this.binding.delete;
        AttachmentGalleryOptionsViewStyle attachmentGalleryOptionsViewStyle13 = this.style;
        if (attachmentGalleryOptionsViewStyle13 != null) {
            textView.setTextColor(attachmentGalleryOptionsViewStyle13.getDeleteOptionTextColor());
        } else {
            AbstractC22676k.m65757q("style");
            throw null;
        }
    }

    public final void setDeleteClickListener(View.OnClickListener listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.binding.delete.setOnClickListener(listener);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001f  */
    public final void setIsMine(boolean isMine) {
        boolean z4;
        TextView delete = this.binding.delete;
        AbstractC22676k.m65749i(delete, "delete");
        if (isMine) {
            AttachmentGalleryOptionsViewStyle attachmentGalleryOptionsViewStyle = this.style;
            if (attachmentGalleryOptionsViewStyle == null) {
                AbstractC22676k.m65757q("style");
                throw null;
            }
            if (attachmentGalleryOptionsViewStyle.getDeleteOptionEnabled()) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        delete.setVisibility(z4 ? 0 : 8);
    }

    public final void setReplyClickListener(View.OnClickListener listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.binding.reply.setOnClickListener(listener);
    }

    public final void setSaveMediaClickListener(View.OnClickListener listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.binding.saveMedia.setOnClickListener(listener);
    }

    public final void setShowInChatClickListener(View.OnClickListener listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.binding.showInChat.setOnClickListener(listener);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AttachmentGalleryOptionsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC22676k.m65750j(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttachmentGalleryOptionsView(Context context, AttributeSet attributeSet, int i13) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        this.binding = StreamUiAttachmentGalleryOptionsViewBinding.inflate(ViewGroupKt.getStreamThemeInflater(this), this, true);
        init(attributeSet);
    }
}
