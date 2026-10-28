package io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.camera;

import android.graphics.drawable.Drawable;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.AttachmentsPickerDialogStyle;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.AttachmentsPickerTabFactory;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.AttachmentsPickerTabListener;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.camera.internal.CameraAttachmentFragment;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/camera/AttachmentsPickerCameraTabFactory;", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabFactory;", "<init>", "()V", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;", "style", "Landroid/graphics/drawable/Drawable;", "createTabIcon", "(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;)Landroid/graphics/drawable/Drawable;", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;", "attachmentsPickerTabListener", "Landroidx/fragment/app/m0;", "createTabFragment", "(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;)Landroidx/fragment/app/m0;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AttachmentsPickerCameraTabFactory implements AttachmentsPickerTabFactory {
    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.AttachmentsPickerTabFactory
    public final AbstractComponentCallbacksC1320m0 createTabFragment(AttachmentsPickerDialogStyle style, AttachmentsPickerTabListener attachmentsPickerTabListener) {
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(attachmentsPickerTabListener, "attachmentsPickerTabListener");
        CameraAttachmentFragment cameraAttachmentFragmentNewInstance = CameraAttachmentFragment.INSTANCE.newInstance(style);
        cameraAttachmentFragmentNewInstance.setAttachmentsPickerTabListener(attachmentsPickerTabListener);
        return cameraAttachmentFragmentNewInstance;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.AttachmentsPickerTabFactory
    public final Drawable createTabIcon(AttachmentsPickerDialogStyle style) {
        AbstractC22676k.m65750j(style, "style");
        return style.getCameraAttachmentsTabIconDrawable();
    }
}
