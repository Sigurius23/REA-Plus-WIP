package io.getstream.chat.android.p226ui.feature.messages.composer.attachment.preview.factory;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import io.getstream.chat.android.client.utils.attachment.AttachmentUtilsKt;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.p226ui.databinding.StreamUiUnsupportedAttachmentPreviewBinding;
import io.getstream.chat.android.p226ui.feature.messages.composer.MessageComposerViewStyle;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.preview.AttachmentPreviewViewHolder;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ5\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/FallbackAttachmentPreviewFactory;", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/AttachmentPreviewFactory;", "<init>", "()V", "Lio/getstream/chat/android/models/Attachment;", "attachment", "", "canHandle", "(Lio/getstream/chat/android/models/Attachment;)Z", "Landroid/view/ViewGroup;", "parentView", "Lkotlin/Function1;", "Ll83/a0;", "attachmentRemovalListener", "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;", "style", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewViewHolder;", "onCreateViewHolder", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewViewHolder;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "FallbackAttachmentPreviewViewHolder", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class FallbackAttachmentPreviewFactory implements AttachmentPreviewFactory {

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger = AbstractC1772c1.m5382S(this, "AttachFallbackPreviewFactory");

    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/FallbackAttachmentPreviewFactory$FallbackAttachmentPreviewViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewViewHolder;", "Lio/getstream/chat/android/ui/databinding/StreamUiUnsupportedAttachmentPreviewBinding;", "binding", "Lkotlin/Function1;", "Lio/getstream/chat/android/models/Attachment;", "Ll83/a0;", "attachmentRemovalListener", "<init>", "(Lio/getstream/chat/android/ui/databinding/StreamUiUnsupportedAttachmentPreviewBinding;Lkotlin/jvm/functions/Function1;)V", "attachment", "bind", "(Lio/getstream/chat/android/models/Attachment;)V", "Lio/getstream/chat/android/ui/databinding/StreamUiUnsupportedAttachmentPreviewBinding;", "Lkotlin/jvm/functions/Function1;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class FallbackAttachmentPreviewViewHolder extends AttachmentPreviewViewHolder {
        private final Function1 attachmentRemovalListener;
        private final StreamUiUnsupportedAttachmentPreviewBinding binding;

        /* JADX WARN: Illegal instructions before constructor call */
        public FallbackAttachmentPreviewViewHolder(StreamUiUnsupportedAttachmentPreviewBinding binding, Function1 attachmentRemovalListener) {
            AbstractC22676k.m65750j(binding, "binding");
            AbstractC22676k.m65750j(attachmentRemovalListener, "attachmentRemovalListener");
            ConstraintLayout root = binding.getRoot();
            AbstractC22676k.m65749i(root, "getRoot(...)");
            super(root);
            this.binding = binding;
            this.attachmentRemovalListener = attachmentRemovalListener;
        }

        /* JADX INFO: renamed from: a */
        public static void m55289a(FallbackAttachmentPreviewViewHolder fallbackAttachmentPreviewViewHolder, Attachment attachment, View view) {
            fallbackAttachmentPreviewViewHolder.attachmentRemovalListener.invoke(attachment);
        }

        @Override // io.getstream.chat.android.p226ui.feature.messages.composer.attachment.preview.AttachmentPreviewViewHolder
        public final void bind(Attachment attachment) {
            AbstractC22676k.m65750j(attachment, "attachment");
            this.binding.titleImageView.setText(attachment.getTitle());
            this.binding.removeButton.setOnClickListener(new ViewOnClickListenerC19703a(this, attachment, 1));
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
        if (!interfaceC2339e.isLoggable(enumC2341g, str)) {
            return true;
        }
        logger.f9274b.log(enumC2341g, str, "[canHandle] isAudioRecording: " + AttachmentUtilsKt.isAudioRecording(attachment) + "; " + attachment, null);
        return true;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.attachment.preview.factory.AttachmentPreviewFactory
    public final AttachmentPreviewViewHolder onCreateViewHolder(ViewGroup parentView, Function1 attachmentRemovalListener, MessageComposerViewStyle style) {
        AbstractC22676k.m65750j(parentView, "parentView");
        AbstractC22676k.m65750j(attachmentRemovalListener, "attachmentRemovalListener");
        Context context = parentView.getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        return new FallbackAttachmentPreviewViewHolder(StreamUiUnsupportedAttachmentPreviewBinding.inflate(ContextKt.getStreamThemeInflater(context), parentView, false), attachmentRemovalListener);
    }
}
