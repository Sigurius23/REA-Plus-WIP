package io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import c93.InterfaceC4339a;
import io.getstream.chat.android.client.api.QueryParams;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.common.images.internal.StreamImageLoader;
import io.getstream.chat.android.p226ui.common.utils.extensions.AttachmentKt;
import io.getstream.chat.android.p226ui.databinding.StreamUiLinkAttachmentsViewBinding;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListItemStyle;
import io.getstream.chat.android.p226ui.font.TextStyle;
import io.getstream.chat.android.p226ui.font.TextStyleKt;
import io.getstream.chat.android.p226ui.utils.ImageUtilsKt;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.IntKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import java.util.Locale;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u0000 32\u00020\u0001:\u000243B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0017\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0012J\u0017\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001d\u0010\u001bJ\u0017\u0010 \u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001f\u0010\u001bJ\u0017\u0010$\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\tH\u0000¢\u0006\u0004\b\"\u0010#J\u0015\u0010'\u001a\u00020\u00102\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0015\u0010+\u001a\u00020\u00102\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00065"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lio/getstream/chat/android/models/Attachment;", "attachment", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;", "style", "Ll83/a0;", "showTitle", "(Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;)V", "showDescription", "showLabel", "showAttachmentImage", "(Lio/getstream/chat/android/models/Attachment;)V", "showLinkAttachment", "Lio/getstream/chat/android/ui/font/TextStyle;", "textStyle", "setTitleTextStyle$stream_chat_android_ui_components_release", "(Lio/getstream/chat/android/ui/font/TextStyle;)V", "setTitleTextStyle", "setDescriptionTextStyle$stream_chat_android_ui_components_release", "setDescriptionTextStyle", "setLabelTextStyle$stream_chat_android_ui_components_release", "setLabelTextStyle", "maxLines", "setLinkDescriptionMaxLines$stream_chat_android_ui_components_release", "(I)V", "setLinkDescriptionMaxLines", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView$LinkPreviewClickListener;", "linkPreviewClickListener", "setLinkPreviewClickListener", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView$LinkPreviewClickListener;)V", "Landroid/view/View;", "longClickTarget", "setLongClickTarget", "(Landroid/view/View;)V", "Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;", "binding", "Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;", "", "previewUrl", "Ljava/lang/String;", "Companion", "LinkPreviewClickListener", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class LinkAttachmentView extends FrameLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final float LINK_PREVIEW_CORNER_RADIUS = IntKt.dpToPxPrecise(8);
    private final StreamUiLinkAttachmentsViewBinding binding;
    private String previewUrl;

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView$Companion;", "", "<init>", "()V", "LINK_PREVIEW_CORNER_RADIUS", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView$LinkPreviewClickListener;", "", "", QueryParams.URL, "Ll83/a0;", "onLinkPreviewClick", "(Ljava/lang/String;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface LinkPreviewClickListener {
        void onLinkPreviewClick(String url);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkAttachmentView(Context context) {
        super(ContextKt.createStreamThemeWrapper(context));
        AbstractC22676k.m65750j(context, "context");
        this.binding = StreamUiLinkAttachmentsViewBinding.inflate(ViewGroupKt.getStreamThemeInflater(this), this, true);
    }

    /* JADX INFO: renamed from: a */
    public static void m55499a(LinkAttachmentView linkAttachmentView, LinkPreviewClickListener linkPreviewClickListener, View view) {
        String str = linkAttachmentView.previewUrl;
        if (str != null) {
            linkPreviewClickListener.onLinkPreviewClick(str);
        }
    }

    private static final void setLinkPreviewClickListener$lambda$3(LinkAttachmentView linkAttachmentView, LinkPreviewClickListener linkPreviewClickListener, View view) {
        String str = linkAttachmentView.previewUrl;
        if (str != null) {
            linkPreviewClickListener.onLinkPreviewClick(str);
        }
    }

    private static final boolean setLongClickTarget$lambda$4(View view, View view2) {
        view.performLongClick();
        return true;
    }

    private final void showAttachmentImage(Attachment attachment) {
        String linkPreviewImageUrl = AttachmentKt.getLinkPreviewImageUrl(attachment);
        if (linkPreviewImageUrl == null) {
            FrameLayout linkPreviewContainer = this.binding.linkPreviewContainer;
            AbstractC22676k.m65749i(linkPreviewContainer, "linkPreviewContainer");
            linkPreviewContainer.setVisibility(8);
            ProgressBar progressBar = this.binding.progressBar;
            AbstractC22676k.m65749i(progressBar, "progressBar");
            progressBar.setVisibility(8);
            return;
        }
        FrameLayout linkPreviewContainer2 = this.binding.linkPreviewContainer;
        AbstractC22676k.m65749i(linkPreviewContainer2, "linkPreviewContainer");
        linkPreviewContainer2.setVisibility(0);
        ImageView linkPreviewImageView = this.binding.linkPreviewImageView;
        AbstractC22676k.m65749i(linkPreviewImageView, "linkPreviewImageView");
        int i13 = C19469R.drawable.stream_ui_picture_placeholder;
        StreamImageLoader.ImageTransformation.RoundedCorners roundedCorners = new StreamImageLoader.ImageTransformation.RoundedCorners(LINK_PREVIEW_CORNER_RADIUS);
        Integer numValueOf = Integer.valueOf(i13);
        final int i14 = 0;
        InterfaceC4339a interfaceC4339a = new InterfaceC4339a(this) { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.view.internal.n

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ LinkAttachmentView f74647x;

            {
                this.f74647x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        LinkAttachmentView.showAttachmentImage$lambda$0(this.f74647x);
                        break;
                    default:
                        LinkAttachmentView.showAttachmentImage$lambda$1(this.f74647x);
                        break;
                }
                return C23454a0.f92919a;
            }
        };
        final int i15 = 1;
        ImageUtilsKt.load(linkPreviewImageView, linkPreviewImageUrl, numValueOf, roundedCorners, interfaceC4339a, new InterfaceC4339a(this) { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.view.internal.n

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ LinkAttachmentView f74647x;

            {
                this.f74647x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        LinkAttachmentView.showAttachmentImage$lambda$0(this.f74647x);
                        break;
                    default:
                        LinkAttachmentView.showAttachmentImage$lambda$1(this.f74647x);
                        break;
                }
                return C23454a0.f92919a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 showAttachmentImage$lambda$0(LinkAttachmentView linkAttachmentView) {
        ProgressBar progressBar = linkAttachmentView.binding.progressBar;
        AbstractC22676k.m65749i(progressBar, "progressBar");
        progressBar.setVisibility(0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 showAttachmentImage$lambda$1(LinkAttachmentView linkAttachmentView) {
        ProgressBar progressBar = linkAttachmentView.binding.progressBar;
        AbstractC22676k.m65749i(progressBar, "progressBar");
        progressBar.setVisibility(8);
        return C23454a0.f92919a;
    }

    private final void showDescription(Attachment attachment, MessageListItemStyle style) {
        String text = attachment.getText();
        if (text != null) {
            TextView descriptionTextView = this.binding.descriptionTextView;
            AbstractC22676k.m65749i(descriptionTextView, "descriptionTextView");
            descriptionTextView.setVisibility(0);
            this.binding.descriptionTextView.setText(text);
        } else {
            TextView descriptionTextView2 = this.binding.descriptionTextView;
            AbstractC22676k.m65749i(descriptionTextView2, "descriptionTextView");
            descriptionTextView2.setVisibility(8);
        }
        TextView descriptionTextView3 = this.binding.descriptionTextView;
        AbstractC22676k.m65749i(descriptionTextView3, "descriptionTextView");
        TextStyleKt.setTextStyle(descriptionTextView3, style.getTextStyleLinkDescription());
    }

    private final void showLabel(Attachment attachment, MessageListItemStyle style) {
        String authorName = attachment.getAuthorName();
        if (authorName != null) {
            FrameLayout labelContainer = this.binding.labelContainer;
            AbstractC22676k.m65749i(labelContainer, "labelContainer");
            labelContainer.setVisibility(0);
            TextView textView = this.binding.labelTextView;
            if (authorName.length() > 0) {
                StringBuilder sb4 = new StringBuilder();
                String strValueOf = String.valueOf(authorName.charAt(0));
                AbstractC22676k.m65748h(strValueOf, "null cannot be cast to non-null type java.lang.String");
                String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                sb4.append((Object) upperCase);
                String strSubstring = authorName.substring(1);
                AbstractC22676k.m65749i(strSubstring, "substring(...)");
                sb4.append(strSubstring);
                authorName = sb4.toString();
            }
            textView.setText(authorName);
        } else {
            FrameLayout labelContainer2 = this.binding.labelContainer;
            AbstractC22676k.m65749i(labelContainer2, "labelContainer");
            labelContainer2.setVisibility(8);
        }
        TextView labelTextView = this.binding.labelTextView;
        AbstractC22676k.m65749i(labelTextView, "labelTextView");
        TextStyleKt.setTextStyle(labelTextView, style.getTextStyleLinkLabel());
    }

    private final void showTitle(Attachment attachment, MessageListItemStyle style) {
        String title = attachment.getTitle();
        if (title != null) {
            TextView titleTextView = this.binding.titleTextView;
            AbstractC22676k.m65749i(titleTextView, "titleTextView");
            titleTextView.setVisibility(0);
            this.binding.titleTextView.setText(title);
        } else {
            TextView titleTextView2 = this.binding.titleTextView;
            AbstractC22676k.m65749i(titleTextView2, "titleTextView");
            titleTextView2.setVisibility(8);
        }
        TextView titleTextView3 = this.binding.titleTextView;
        AbstractC22676k.m65749i(titleTextView3, "titleTextView");
        TextStyleKt.setTextStyle(titleTextView3, style.getTextStyleLinkTitle());
    }

    /* JADX INFO: renamed from: setDescriptionTextStyle$stream_chat_android_ui_components_release */
    public final void m55502x604a2357(TextStyle textStyle) {
        AbstractC22676k.m65750j(textStyle, "textStyle");
        TextView descriptionTextView = this.binding.descriptionTextView;
        AbstractC22676k.m65749i(descriptionTextView, "descriptionTextView");
        TextStyleKt.setTextStyle(descriptionTextView, textStyle);
    }

    public final void setLabelTextStyle$stream_chat_android_ui_components_release(TextStyle textStyle) {
        AbstractC22676k.m65750j(textStyle, "textStyle");
        TextView labelTextView = this.binding.labelTextView;
        AbstractC22676k.m65749i(labelTextView, "labelTextView");
        TextStyleKt.setTextStyle(labelTextView, textStyle);
    }

    /* JADX INFO: renamed from: setLinkDescriptionMaxLines$stream_chat_android_ui_components_release */
    public final void m55503xdf9c1a8(int maxLines) {
        this.binding.descriptionTextView.setMaxLines(maxLines);
    }

    public final void setLinkPreviewClickListener(LinkPreviewClickListener linkPreviewClickListener) {
        AbstractC22676k.m65750j(linkPreviewClickListener, "linkPreviewClickListener");
        setOnClickListener(new ViewOnClickListenerC19771b(7, this, linkPreviewClickListener));
    }

    public final void setLongClickTarget(View longClickTarget) {
        AbstractC22676k.m65750j(longClickTarget, "longClickTarget");
        setOnLongClickListener(new ViewOnLongClickListenerC19775f(longClickTarget, 1));
    }

    public final void setTitleTextStyle$stream_chat_android_ui_components_release(TextStyle textStyle) {
        AbstractC22676k.m65750j(textStyle, "textStyle");
        TextView titleTextView = this.binding.titleTextView;
        AbstractC22676k.m65749i(titleTextView, "titleTextView");
        TextStyleKt.setTextStyle(titleTextView, textStyle);
    }

    public final void showLinkAttachment(Attachment attachment, MessageListItemStyle style) {
        AbstractC22676k.m65750j(attachment, "attachment");
        AbstractC22676k.m65750j(style, "style");
        this.previewUrl = AttachmentKt.getLinkUrl(attachment);
        showTitle(attachment, style);
        showDescription(attachment, style);
        showLabel(attachment, style);
        showAttachmentImage(attachment);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkAttachmentView(Context context, AttributeSet attributeSet) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet);
        AbstractC22676k.m65750j(context, "context");
        this.binding = StreamUiLinkAttachmentsViewBinding.inflate(ViewGroupKt.getStreamThemeInflater(this), this, true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkAttachmentView(Context context, AttributeSet attributeSet, int i13) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        this.binding = StreamUiLinkAttachmentsViewBinding.inflate(ViewGroupKt.getStreamThemeInflater(this), this, true);
    }
}
