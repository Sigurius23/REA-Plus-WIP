package io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.system;

import android.graphics.drawable.Drawable;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import io.getstream.chat.android.p226ui.common.permissions.VisualMediaType;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.AttachmentsPickerDialogStyle;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.AttachmentsPickerTabFactory;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.AttachmentsPickerTabListener;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.system.internal.AttachmentsPickerSystemConfig;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.system.internal.AttachmentsPickerSystemFragment;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016¨\u0006\u0018"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/AttachmentsPickerSystemTabFactory;", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabFactory;", "", "mediaAttachmentsTabEnabled", "visualMediaAllowMultiple", "Lio/getstream/chat/android/ui/common/permissions/VisualMediaType;", "visualMediaType", "fileAttachmentsTabEnabled", "cameraAttachmentsTabEnabled", "pollAttachmentsTabEnabled", "<init>", "(ZZLio/getstream/chat/android/ui/common/permissions/VisualMediaType;ZZZ)V", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;", "style", "Landroid/graphics/drawable/Drawable;", "createTabIcon", "(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;)Landroid/graphics/drawable/Drawable;", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;", "attachmentsPickerTabListener", "Landroidx/fragment/app/m0;", "createTabFragment", "(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;)Landroidx/fragment/app/m0;", "Z", "Lio/getstream/chat/android/ui/common/permissions/VisualMediaType;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AttachmentsPickerSystemTabFactory implements AttachmentsPickerTabFactory {
    private final boolean cameraAttachmentsTabEnabled;
    private final boolean fileAttachmentsTabEnabled;
    private final boolean mediaAttachmentsTabEnabled;
    private final boolean pollAttachmentsTabEnabled;
    private final boolean visualMediaAllowMultiple;
    private final VisualMediaType visualMediaType;

    public AttachmentsPickerSystemTabFactory(boolean z4, boolean z13, VisualMediaType visualMediaType, boolean z14, boolean z15, boolean z16) {
        AbstractC22676k.m65750j(visualMediaType, "visualMediaType");
        this.mediaAttachmentsTabEnabled = z4;
        this.visualMediaAllowMultiple = z13;
        this.visualMediaType = visualMediaType;
        this.fileAttachmentsTabEnabled = z14;
        this.cameraAttachmentsTabEnabled = z15;
        this.pollAttachmentsTabEnabled = z16;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.AttachmentsPickerTabFactory
    public final AbstractComponentCallbacksC1320m0 createTabFragment(AttachmentsPickerDialogStyle style, AttachmentsPickerTabListener attachmentsPickerTabListener) {
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(attachmentsPickerTabListener, "attachmentsPickerTabListener");
        return AttachmentsPickerSystemFragment.INSTANCE.newInstance(style, attachmentsPickerTabListener, new AttachmentsPickerSystemConfig(this.mediaAttachmentsTabEnabled, this.visualMediaAllowMultiple, this.visualMediaType, this.fileAttachmentsTabEnabled, this.cameraAttachmentsTabEnabled, this.pollAttachmentsTabEnabled));
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.AttachmentsPickerTabFactory
    public final Drawable createTabIcon(AttachmentsPickerDialogStyle style) {
        AbstractC22676k.m65750j(style, "style");
        return style.getSubmitAttachmentsButtonIconDrawable();
    }
}
