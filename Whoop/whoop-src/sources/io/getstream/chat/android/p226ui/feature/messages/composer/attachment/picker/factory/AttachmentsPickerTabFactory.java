package io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory;

import android.graphics.drawable.Drawable;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.AttachmentsPickerDialogStyle;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabFactory;", "", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;", "style", "Landroid/graphics/drawable/Drawable;", "createTabIcon", "(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;)Landroid/graphics/drawable/Drawable;", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;", "attachmentsPickerTabListener", "Landroidx/fragment/app/m0;", "createTabFragment", "(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;)Landroidx/fragment/app/m0;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface AttachmentsPickerTabFactory {
    AbstractComponentCallbacksC1320m0 createTabFragment(AttachmentsPickerDialogStyle style, AttachmentsPickerTabListener attachmentsPickerTabListener);

    Drawable createTabIcon(AttachmentsPickerDialogStyle style);
}
