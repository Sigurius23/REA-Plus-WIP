package io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory;

import io.getstream.chat.android.p226ui.common.permissions.VisualMediaType;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.camera.AttachmentsPickerCameraTabFactory;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.file.AttachmentsPickerFileTabFactory;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.media.AttachmentsPickerMediaTabFactory;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.poll.AttachmentsPickerPollTabFactory;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.system.AttachmentsPickerSystemTabFactory;
import java.util.List;
import m83.AbstractC25260n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bJ,\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabFactories;", "", "<init>", "()V", "defaultFactoriesWithoutPermissions", "", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabFactory;", "mediaAttachmentsTabEnabled", "", "visualMediaAllowMultiple", "visualMediaType", "Lio/getstream/chat/android/ui/common/permissions/VisualMediaType;", "fileAttachmentsTabEnabled", "cameraAttachmentsTabEnabled", "pollAttachmentsTabEnabled", "defaultFactories", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AttachmentsPickerTabFactories {
    public static final AttachmentsPickerTabFactories INSTANCE = new AttachmentsPickerTabFactories();

    private AttachmentsPickerTabFactories() {
    }

    public static /* synthetic */ List defaultFactoriesWithoutPermissions$default(AttachmentsPickerTabFactories attachmentsPickerTabFactories, boolean z4, boolean z13, VisualMediaType visualMediaType, boolean z14, boolean z15, boolean z16, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z13 = false;
        }
        boolean z17 = z13;
        if ((i13 & 4) != 0) {
            visualMediaType = VisualMediaType.IMAGE_AND_VIDEO;
        }
        return attachmentsPickerTabFactories.defaultFactoriesWithoutPermissions(z4, z17, visualMediaType, z14, z15, z16);
    }

    public final List<AttachmentsPickerTabFactory> defaultFactories(boolean mediaAttachmentsTabEnabled, boolean fileAttachmentsTabEnabled, boolean cameraAttachmentsTabEnabled, boolean pollAttachmentsTabEnabled) {
        return AbstractC25260n.m74077r0(new AttachmentsPickerTabFactory[]{mediaAttachmentsTabEnabled ? new AttachmentsPickerMediaTabFactory() : null, fileAttachmentsTabEnabled ? new AttachmentsPickerFileTabFactory() : null, cameraAttachmentsTabEnabled ? new AttachmentsPickerCameraTabFactory() : null, pollAttachmentsTabEnabled ? new AttachmentsPickerPollTabFactory() : null});
    }

    public final List<AttachmentsPickerTabFactory> defaultFactoriesWithoutPermissions(boolean mediaAttachmentsTabEnabled, boolean visualMediaAllowMultiple, VisualMediaType visualMediaType, boolean fileAttachmentsTabEnabled, boolean cameraAttachmentsTabEnabled, boolean pollAttachmentsTabEnabled) {
        AbstractC22676k.m65750j(visualMediaType, "visualMediaType");
        return AbstractC37056f.m118958J(new AttachmentsPickerSystemTabFactory(mediaAttachmentsTabEnabled, visualMediaAllowMultiple, visualMediaType, fileAttachmentsTabEnabled, cameraAttachmentsTabEnabled, pollAttachmentsTabEnabled));
    }
}
