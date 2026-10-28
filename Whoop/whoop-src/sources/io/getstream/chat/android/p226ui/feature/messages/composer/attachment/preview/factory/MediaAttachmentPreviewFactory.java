package io.getstream.chat.android.p226ui.feature.messages.composer.attachment.preview.factory;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b23.InterfaceC2344j;
import c93.InterfaceC4339a;
import com.google.android.material.imageview.ShapeableImageView;
import io.getstream.chat.android.client.utils.attachment.AttachmentUtilsKt;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.common.images.internal.StreamImageLoader;
import io.getstream.chat.android.p226ui.databinding.StreamUiMediaAttachmentPreviewBinding;
import io.getstream.chat.android.p226ui.feature.messages.composer.MessageComposerViewStyle;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.preview.AttachmentPreviewViewHolder;
import io.getstream.chat.android.p226ui.utils.ImageUtilsKt;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.DrawableKt;
import java.io.File;
import kr.C22782a;
import kr.C22786e;
import kr.C22790i;
import kr.C22792k;
import l83.InterfaceC23462h;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ5\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/MediaAttachmentPreviewFactory;", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/AttachmentPreviewFactory;", "<init>", "()V", "Lio/getstream/chat/android/models/Attachment;", "attachment", "", "canHandle", "(Lio/getstream/chat/android/models/Attachment;)Z", "Landroid/view/ViewGroup;", "parentView", "Lkotlin/Function1;", "Ll83/a0;", "attachmentRemovalListener", "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;", "style", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewViewHolder;", "onCreateViewHolder", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewViewHolder;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "MediaAttachmentPreviewViewHolder", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MediaAttachmentPreviewFactory implements AttachmentPreviewFactory {

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger = AbstractC1772c1.m5382S(this, "AttachMediaPreviewFactory");

    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u000f\u001a\u00020\u00058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/MediaAttachmentPreviewFactory$MediaAttachmentPreviewViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewViewHolder;", "Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentPreviewBinding;", "binding", "Lkotlin/Function1;", "Lio/getstream/chat/android/models/Attachment;", "Ll83/a0;", "attachmentRemovalListener", "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;", "style", "<init>", "(Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentPreviewBinding;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;)V", "setupIconImageView", "()V", "setupIconCard", "attachment", "bind", "(Lio/getstream/chat/android/models/Attachment;)V", "Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentPreviewBinding;", "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "Lio/getstream/chat/android/models/Attachment;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class MediaAttachmentPreviewViewHolder extends AttachmentPreviewViewHolder {
        private Attachment attachment;
        private final StreamUiMediaAttachmentPreviewBinding binding;

        /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
        private final InterfaceC23462h logger;
        private final MessageComposerViewStyle style;

        /* JADX WARN: Illegal instructions before constructor call */
        public MediaAttachmentPreviewViewHolder(StreamUiMediaAttachmentPreviewBinding binding, Function1 attachmentRemovalListener, MessageComposerViewStyle messageComposerViewStyle) {
            AbstractC22676k.m65750j(binding, "binding");
            AbstractC22676k.m65750j(attachmentRemovalListener, "attachmentRemovalListener");
            ConstraintLayout root = binding.getRoot();
            AbstractC22676k.m65749i(root, "getRoot(...)");
            super(root);
            this.binding = binding;
            this.style = messageComposerViewStyle;
            this.logger = AbstractC1772c1.m5382S(this, "AttachMediaPreviewHolder");
            float dimension = ContextKt.getDimension(getContext(), C19469R.dimen.stream_ui_selected_attachment_corner_radius);
            ShapeableImageView shapeableImageView = binding.thumbImageView;
            C22790i c22790i = new C22790i();
            C22790i c22790i2 = new C22790i();
            C22790i c22790i3 = new C22790i();
            C22790i c22790i4 = new C22790i();
            C22786e c22786e = new C22786e(0);
            C22786e c22786e2 = new C22786e(0);
            C22786e c22786e3 = new C22786e(0);
            C22786e c22786e4 = new C22786e(0);
            C22782a c22782a = new C22782a(dimension);
            C22782a c22782a2 = new C22782a(dimension);
            C22782a c22782a3 = new C22782a(dimension);
            C22782a c22782a4 = new C22782a(dimension);
            C22792k c22792k = new C22792k();
            c22792k.f89766a = c22790i;
            c22792k.f89767b = c22790i2;
            c22792k.f89768c = c22790i3;
            c22792k.f89769d = c22790i4;
            c22792k.f89770e = c22782a;
            c22792k.f89771f = c22782a2;
            c22792k.f89772g = c22782a3;
            c22792k.f89773h = c22782a4;
            c22792k.f89774i = c22786e;
            c22792k.f89775j = c22786e2;
            c22792k.f89776k = c22786e3;
            c22792k.f89777l = c22786e4;
            shapeableImageView.setShapeAppearanceModel(c22792k);
            binding.removeButton.setOnClickListener(new ViewOnClickListenerC19703a(attachmentRemovalListener, this, 3));
            setupIconImageView();
            setupIconCard();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void _init_$lambda$0(Function1 function1, MediaAttachmentPreviewViewHolder mediaAttachmentPreviewViewHolder, View view) {
            Attachment attachment = mediaAttachmentPreviewViewHolder.attachment;
            if (attachment != null) {
                function1.invoke(attachment);
            } else {
                AbstractC22676k.m65757q("attachment");
                throw null;
            }
        }

        private final C2345k getLogger() {
            return (C2345k) this.logger.getValue();
        }

        private final void setupIconCard() {
            MessageComposerViewStyle messageComposerViewStyle = this.style;
            if (messageComposerViewStyle != null) {
                CardView cardView = this.binding.playIconCardView;
                Integer messageInputVideoAttachmentIconBackgroundColor = messageComposerViewStyle.getMessageInputVideoAttachmentIconBackgroundColor();
                if (messageInputVideoAttachmentIconBackgroundColor != null) {
                    cardView.setCardBackgroundColor(messageInputVideoAttachmentIconBackgroundColor.intValue());
                }
                cardView.setElevation(this.style.getMessageInputVideoAttachmentIconElevation());
                cardView.setRadius(this.style.getMessageInputVideoAttachmentIconCornerRadius());
            }
        }

        private final void setupIconImageView() {
            MessageComposerViewStyle messageComposerViewStyle = this.style;
            if (messageComposerViewStyle != null) {
                ImageView imageView = this.binding.playIconImageView;
                imageView.setImageDrawable(DrawableKt.applyTint(messageComposerViewStyle.getMessageInputVideoAttachmentIconDrawable(), this.style.getMessageInputVideoAttachmentIconDrawableTint()));
                imageView.setPaddingRelative(this.style.getMessageInputVideoAttachmentIconDrawablePaddingStart(), this.style.getMessageInputVideoAttachmentIconDrawablePaddingTop(), this.style.getMessageInputVideoAttachmentIconDrawablePaddingEnd(), this.style.getMessageInputVideoAttachmentIconDrawablePaddingBottom());
            }
        }

        @Override // io.getstream.chat.android.p226ui.feature.messages.composer.attachment.preview.AttachmentPreviewViewHolder
        public final void bind(Attachment attachment) {
            AbstractC22676k.m65750j(attachment, "attachment");
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
            String str = logger.f9273a;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                InterfaceC2344j interfaceC2344j = logger.f9274b;
                StringBuilder sbM32002u = AbstractC11895b.m32002u("[bind] isImage: ", ", isVideo: ", "; ", AttachmentUtilsKt.isImage(attachment), AttachmentUtilsKt.isVideo(attachment));
                sbM32002u.append(attachment);
                interfaceC2344j.log(enumC2341g, str, sbM32002u.toString(), null);
            }
            this.attachment = attachment;
            File upload = attachment.getUpload();
            CardView playIconCardView = this.binding.playIconCardView;
            AbstractC22676k.m65749i(playIconCardView, "playIconCardView");
            playIconCardView.setVisibility(AttachmentUtilsKt.isVideo(attachment) ? 0 : 8);
            if (upload != null) {
                ShapeableImageView thumbImageView = this.binding.thumbImageView;
                AbstractC22676k.m65749i(thumbImageView, "thumbImageView");
                ImageUtilsKt.load$default(thumbImageView, upload, (Integer) null, (StreamImageLoader.ImageTransformation) null, (InterfaceC4339a) null, (InterfaceC4339a) null, 30, (Object) null);
            } else {
                ShapeableImageView thumbImageView2 = this.binding.thumbImageView;
                AbstractC22676k.m65749i(thumbImageView2, "thumbImageView");
                io.getstream.chat.android.p226ui.utils.AttachmentUtilsKt.loadAttachmentThumb(thumbImageView2, attachment);
            }
        }
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.attachment.preview.factory.AttachmentPreviewFactory
    public final boolean canHandle(Attachment attachment) {
        AbstractC22676k.m65750j(attachment, "attachment");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            InterfaceC2344j interfaceC2344j = logger.f9274b;
            StringBuilder sbM32002u = AbstractC11895b.m32002u("[canHandle] isImage: ", ", isVideo: ", "; ", AttachmentUtilsKt.isImage(attachment), AttachmentUtilsKt.isVideo(attachment));
            sbM32002u.append(attachment);
            interfaceC2344j.log(enumC2341g, str, sbM32002u.toString(), null);
        }
        return AttachmentUtilsKt.isImage(attachment) || AttachmentUtilsKt.isVideo(attachment);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.attachment.preview.factory.AttachmentPreviewFactory
    public final AttachmentPreviewViewHolder onCreateViewHolder(ViewGroup parentView, Function1 attachmentRemovalListener, MessageComposerViewStyle style) {
        AbstractC22676k.m65750j(parentView, "parentView");
        AbstractC22676k.m65750j(attachmentRemovalListener, "attachmentRemovalListener");
        Context context = parentView.getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        return new MediaAttachmentPreviewViewHolder(StreamUiMediaAttachmentPreviewBinding.inflate(ContextKt.getStreamThemeInflater(context), parentView, false), attachmentRemovalListener, style);
    }
}
