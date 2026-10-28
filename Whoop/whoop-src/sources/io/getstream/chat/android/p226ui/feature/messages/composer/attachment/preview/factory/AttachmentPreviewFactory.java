package io.getstream.chat.android.p226ui.feature.messages.composer.attachment.preview.factory;

import android.view.ViewGroup;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.p226ui.feature.messages.composer.MessageComposerViewStyle;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.preview.AttachmentPreviewViewHolder;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/AttachmentPreviewFactory;", "", "Lio/getstream/chat/android/models/Attachment;", "attachment", "", "canHandle", "(Lio/getstream/chat/android/models/Attachment;)Z", "Landroid/view/ViewGroup;", "parentView", "Lkotlin/Function1;", "Ll83/a0;", "attachmentRemovalListener", "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;", "style", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewViewHolder;", "onCreateViewHolder", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewViewHolder;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface AttachmentPreviewFactory {

    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ AttachmentPreviewViewHolder onCreateViewHolder$default(AttachmentPreviewFactory attachmentPreviewFactory, ViewGroup viewGroup, Function1 function1, MessageComposerViewStyle messageComposerViewStyle, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onCreateViewHolder");
        }
        if ((i13 & 4) != 0) {
            messageComposerViewStyle = null;
        }
        return attachmentPreviewFactory.onCreateViewHolder(viewGroup, function1, messageComposerViewStyle);
    }

    boolean canHandle(Attachment attachment);

    AttachmentPreviewViewHolder onCreateViewHolder(ViewGroup parentView, Function1 attachmentRemovalListener, MessageComposerViewStyle style);
}
