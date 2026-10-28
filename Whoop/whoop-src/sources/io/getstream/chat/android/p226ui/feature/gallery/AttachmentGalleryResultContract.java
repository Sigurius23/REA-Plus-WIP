package io.getstream.chat.android.p226ui.feature.gallery;

import android.content.Context;
import android.content.Intent;
import p267k.AbstractC22081b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultContract;", "Lk/b;", "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultContract$Input;", "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentOptionResult;", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultContract$Input;)Landroid/content/Intent;", "", "resultCode", "intent", "parseResult", "(ILandroid/content/Intent;)Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentOptionResult;", "Input", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
final class AttachmentGalleryResultContract extends AbstractC22081b {

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultContract$Input;", "", "attachmentIndex", "", "<init>", "(I)V", "getAttachmentIndex", "()I", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Input {
        private final int attachmentIndex;

        public Input(int i13) {
            this.attachmentIndex = i13;
        }

        public final int getAttachmentIndex() {
            return this.attachmentIndex;
        }
    }

    @Override // p267k.AbstractC22081b
    public final Intent createIntent(Context context, Input input) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(input, "input");
        return AttachmentGalleryActivity.INSTANCE.createIntent(context, input.getAttachmentIndex());
    }

    @Override // p267k.AbstractC22081b
    public final AttachmentGalleryActivity.AttachmentOptionResult parseResult(int resultCode, Intent intent) {
        if (resultCode == -1 && intent != null) {
            return (AttachmentGalleryActivity.AttachmentOptionResult) intent.getParcelableExtra(AttachmentGalleryActivity.EXTRA_ATTACHMENT_OPTION_RESULT);
        }
        return null;
    }
}
