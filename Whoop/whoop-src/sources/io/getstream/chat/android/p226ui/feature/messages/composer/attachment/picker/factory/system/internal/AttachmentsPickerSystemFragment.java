package io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.system.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.contract.ActivityResultContracts$PickMultipleVisualMedia;
import androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia;
import androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractC1329o1;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.fragment.app.C1271a;
import c93.InterfaceC4339a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import e93.AbstractC12889b;
import io.getstream.chat.android.models.CreatePollParams;
import io.getstream.chat.android.p226ui.common.contract.internal.CaptureMediaContract;
import io.getstream.chat.android.p226ui.common.helper.internal.AttachmentFilter;
import io.getstream.chat.android.p226ui.common.helper.internal.AttachmentStorageHelper;
import io.getstream.chat.android.p226ui.common.permissions.VisualMediaType;
import io.getstream.chat.android.p226ui.common.permissions.VisualMediaTypeKt;
import io.getstream.chat.android.p226ui.common.state.messages.composer.AttachmentMetaData;
import io.getstream.chat.android.p226ui.databinding.StreamUiFragmentAttachmentSystemPickerBinding;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.AttachmentsPickerDialogStyle;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.AttachmentsPickerTabListener;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.camera.internal.CameraAttachmentFragment;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.file.internal.C19683b;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.poll.CreatePollDialogFragment;
import io.getstream.chat.android.p226ui.utils.PermissionChecker;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import java.io.File;
import java.io.Serializable;
import java.util.List;
import l83.C23454a0;
import l83.C23465k;
import m83.C25271y;
import ou1.C28376a;
import p236j.AbstractC21065d;
import p236j.AbstractC21071j;
import p236j.C21062a;
import p236j.C21070i;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import se.AbstractC32416g;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 <2\u00020\u0001:\u0001<B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J%\u0010\u000b\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u0003J\u0015\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010-R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\"\u00105\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u000104040\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001e\u00107\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00106R\u001e\u00108\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00106R\u0014\u0010;\u001a\u00020&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006="}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Ll83/a0;", "setupViews", "", "allowMultiple", "Lj/d;", "Lj/m;", "kotlin.jvm.PlatformType", "registerVisualMediaPickerLauncher", "(Z)Lj/d;", "Lkotlin/Function0;", "onPermissionGranted", "checkCameraPermissions", "(Lc93/a;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;", "attachmentsPickerTabListener", "setAttachmentsPickerTabListener", "(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;)V", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;", "style", "setStyle", "(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;)V", "Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;", "_binding", "Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;", "Lio/getstream/chat/android/ui/utils/PermissionChecker;", "permissionChecker", "Lio/getstream/chat/android/ui/utils/PermissionChecker;", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;", "Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;", "attachmentStorageHelper", "Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;", "Lio/getstream/chat/android/ui/common/helper/internal/AttachmentFilter;", "attachmentFilter", "Lio/getstream/chat/android/ui/common/helper/internal/AttachmentFilter;", "Landroid/content/Intent;", "filePickerLauncher", "Lj/d;", "visualMediaPickerLauncher", "captureMedia", "getBinding", "()Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;", "binding", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AttachmentsPickerSystemFragment extends AbstractComponentCallbacksC1320m0 {
    private static final String ARG_CAMERA_ATTACHMENTS_TAB_ENABLED = "camera_attachments_tab_enabled";
    private static final String ARG_FILE_ATTACHMENTS_TAB_ENABLED = "file_attachments_tab_enabled";
    private static final String ARG_POLL_ATTACHMENTS_TAB_ENABLED = "poll_attachments_tab_enabled";
    private static final String ARG_VISUAL_MEDIA_ALLOW_MULTIPLE = "visual_media_allow_multiple";
    private static final String ARG_VISUAL_MEDIA_ATTACHMENTS_TAB_ENABLED = "visual_media_attachments_tab_enabled";
    private static final String ARG_VISUAL_MEDIA_TYPE = "visual_media_type";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private StreamUiFragmentAttachmentSystemPickerBinding _binding;
    private AttachmentStorageHelper attachmentStorageHelper;
    private AttachmentsPickerTabListener attachmentsPickerTabListener;
    private AbstractC21065d captureMedia;
    private final AbstractC21065d filePickerLauncher;
    private AttachmentsPickerDialogStyle style;
    private AbstractC21065d visualMediaPickerLauncher;
    private final PermissionChecker permissionChecker = new PermissionChecker();
    private final AttachmentFilter attachmentFilter = new AttachmentFilter(null, 1, 0 == true ? 1 : 0);

    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0012¨\u0006\u0018"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment$Companion;", "", "<init>", "()V", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;", "Landroid/os/Bundle;", "toBundle", "(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;)Landroid/os/Bundle;", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;", "style", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;", "attachmentsPickerTabListener", "config", "Landroidx/fragment/app/m0;", "newInstance", "(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;)Landroidx/fragment/app/m0;", "", "ARG_VISUAL_MEDIA_ATTACHMENTS_TAB_ENABLED", "Ljava/lang/String;", "ARG_VISUAL_MEDIA_ALLOW_MULTIPLE", "ARG_VISUAL_MEDIA_TYPE", "ARG_FILE_ATTACHMENTS_TAB_ENABLED", "ARG_CAMERA_ATTACHMENTS_TAB_ENABLED", "ARG_POLL_ATTACHMENTS_TAB_ENABLED", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        private final Bundle toBundle(AttachmentsPickerSystemConfig attachmentsPickerSystemConfig) {
            return AbstractC12889b.m36273g(new C23465k(AttachmentsPickerSystemFragment.ARG_VISUAL_MEDIA_ATTACHMENTS_TAB_ENABLED, Boolean.valueOf(attachmentsPickerSystemConfig.getVisualMediaAttachmentsTabEnabled())), new C23465k(AttachmentsPickerSystemFragment.ARG_VISUAL_MEDIA_ALLOW_MULTIPLE, Boolean.valueOf(attachmentsPickerSystemConfig.getVisualMediaAllowMultiple())), new C23465k(AttachmentsPickerSystemFragment.ARG_VISUAL_MEDIA_TYPE, attachmentsPickerSystemConfig.getVisualMediaType()), new C23465k(AttachmentsPickerSystemFragment.ARG_FILE_ATTACHMENTS_TAB_ENABLED, Boolean.valueOf(attachmentsPickerSystemConfig.getFileAttachmentsTabEnabled())), new C23465k(AttachmentsPickerSystemFragment.ARG_CAMERA_ATTACHMENTS_TAB_ENABLED, Boolean.valueOf(attachmentsPickerSystemConfig.getCameraAttachmentsTabEnabled())), new C23465k(AttachmentsPickerSystemFragment.ARG_POLL_ATTACHMENTS_TAB_ENABLED, Boolean.valueOf(attachmentsPickerSystemConfig.getPollAttachmentsTabEnabled())));
        }

        public final AbstractComponentCallbacksC1320m0 newInstance(AttachmentsPickerDialogStyle style, AttachmentsPickerTabListener attachmentsPickerTabListener, AttachmentsPickerSystemConfig config) {
            AbstractC22676k.m65750j(style, "style");
            AbstractC22676k.m65750j(attachmentsPickerTabListener, "attachmentsPickerTabListener");
            AbstractC22676k.m65750j(config, "config");
            AttachmentsPickerSystemFragment attachmentsPickerSystemFragment = new AttachmentsPickerSystemFragment();
            attachmentsPickerSystemFragment.style = style;
            attachmentsPickerSystemFragment.attachmentsPickerTabListener = attachmentsPickerTabListener;
            attachmentsPickerSystemFragment.setArguments(AttachmentsPickerSystemFragment.INSTANCE.toBundle(config));
            return attachmentsPickerSystemFragment;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AttachmentsPickerSystemFragment() {
        AbstractC21065d abstractC21065dRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new C19687a(this, 3));
        AbstractC22676k.m65749i(abstractC21065dRegisterForActivityResult, "registerForActivityResult(...)");
        this.filePickerLauncher = abstractC21065dRegisterForActivityResult;
    }

    private final void checkCameraPermissions(InterfaceC4339a onPermissionGranted) {
        PermissionChecker permissionChecker = this.permissionChecker;
        Context contextRequireContext = requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        if (!permissionChecker.isNeededToRequestForCameraPermissions(contextRequireContext)) {
            onPermissionGranted.invoke();
            return;
        }
        PermissionChecker permissionChecker2 = this.permissionChecker;
        StreamUiFragmentAttachmentSystemPickerBinding streamUiFragmentAttachmentSystemPickerBinding = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentAttachmentSystemPickerBinding);
        ConstraintLayout root = streamUiFragmentAttachmentSystemPickerBinding.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        permissionChecker2.checkCameraPermissions(root, new C28376a(7), onPermissionGranted);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void filePickerLauncher$lambda$0(AttachmentsPickerSystemFragment attachmentsPickerSystemFragment, C21062a result) {
        AbstractC22676k.m65750j(result, "result");
        Intent intent = result.f79916x;
        Uri data = intent != null ? intent.getData() : null;
        if (data != null) {
            AttachmentStorageHelper attachmentStorageHelper = attachmentsPickerSystemFragment.attachmentStorageHelper;
            if (attachmentStorageHelper == null) {
                AbstractC22676k.m65757q("attachmentStorageHelper");
                throw null;
            }
            List<AttachmentMetaData> listResolveMetadata = attachmentStorageHelper.resolveMetadata(AbstractC37056f.m118958J(data));
            AttachmentsPickerTabListener attachmentsPickerTabListener = attachmentsPickerSystemFragment.attachmentsPickerTabListener;
            if (attachmentsPickerTabListener != null) {
                attachmentsPickerTabListener.onSelectedAttachmentsChanged(listResolveMetadata);
            }
        }
        AttachmentsPickerTabListener attachmentsPickerTabListener2 = attachmentsPickerSystemFragment.attachmentsPickerTabListener;
        if (attachmentsPickerTabListener2 != null) {
            attachmentsPickerTabListener2.onSelectedAttachmentsSubmitted();
        }
    }

    private final StreamUiFragmentAttachmentSystemPickerBinding getBinding() {
        StreamUiFragmentAttachmentSystemPickerBinding streamUiFragmentAttachmentSystemPickerBinding = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentAttachmentSystemPickerBinding);
        return streamUiFragmentAttachmentSystemPickerBinding;
    }

    private final AbstractC21065d registerVisualMediaPickerLauncher(boolean allowMultiple) {
        AbstractC21065d abstractC21065dRegisterForActivityResult = allowMultiple ? registerForActivityResult(new ActivityResultContracts$PickMultipleVisualMedia((Object) null), new C19687a(this, 0)) : registerForActivityResult(new ActivityResultContracts$PickVisualMedia(), new C19687a(this, 1));
        AbstractC22676k.m65747g(abstractC21065dRegisterForActivityResult);
        return abstractC21065dRegisterForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerVisualMediaPickerLauncher$lambda$10(AttachmentsPickerSystemFragment attachmentsPickerSystemFragment, List uris) {
        AbstractC22676k.m65750j(uris, "uris");
        AttachmentStorageHelper attachmentStorageHelper = attachmentsPickerSystemFragment.attachmentStorageHelper;
        if (attachmentStorageHelper == null) {
            AbstractC22676k.m65757q("attachmentStorageHelper");
            throw null;
        }
        List<AttachmentMetaData> listResolveMetadata = attachmentStorageHelper.resolveMetadata(uris);
        AttachmentsPickerTabListener attachmentsPickerTabListener = attachmentsPickerSystemFragment.attachmentsPickerTabListener;
        if (attachmentsPickerTabListener != null) {
            attachmentsPickerTabListener.onSelectedAttachmentsChanged(listResolveMetadata);
        }
        AttachmentsPickerTabListener attachmentsPickerTabListener2 = attachmentsPickerSystemFragment.attachmentsPickerTabListener;
        if (attachmentsPickerTabListener2 != null) {
            attachmentsPickerTabListener2.onSelectedAttachmentsSubmitted();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerVisualMediaPickerLauncher$lambda$11(AttachmentsPickerSystemFragment attachmentsPickerSystemFragment, Uri uri) {
        if (uri != null) {
            AttachmentStorageHelper attachmentStorageHelper = attachmentsPickerSystemFragment.attachmentStorageHelper;
            if (attachmentStorageHelper == null) {
                AbstractC22676k.m65757q("attachmentStorageHelper");
                throw null;
            }
            List<AttachmentMetaData> listResolveMetadata = attachmentStorageHelper.resolveMetadata(AbstractC37056f.m118958J(uri));
            AttachmentsPickerTabListener attachmentsPickerTabListener = attachmentsPickerSystemFragment.attachmentsPickerTabListener;
            if (attachmentsPickerTabListener != null) {
                attachmentsPickerTabListener.onSelectedAttachmentsChanged(listResolveMetadata);
            }
        }
        AttachmentsPickerTabListener attachmentsPickerTabListener2 = attachmentsPickerSystemFragment.attachmentsPickerTabListener;
        if (attachmentsPickerTabListener2 != null) {
            attachmentsPickerTabListener2.onSelectedAttachmentsSubmitted();
        }
    }

    private final void setupViews() {
        AbstractC21071j activityResultRegistry;
        if (!requireArguments().getBoolean(ARG_FILE_ATTACHMENTS_TAB_ENABLED)) {
            StreamUiFragmentAttachmentSystemPickerBinding streamUiFragmentAttachmentSystemPickerBinding = this._binding;
            AbstractC22676k.m65747g(streamUiFragmentAttachmentSystemPickerBinding);
            streamUiFragmentAttachmentSystemPickerBinding.buttonFiles.setVisibility(8);
            StreamUiFragmentAttachmentSystemPickerBinding streamUiFragmentAttachmentSystemPickerBinding2 = this._binding;
            AbstractC22676k.m65747g(streamUiFragmentAttachmentSystemPickerBinding2);
            streamUiFragmentAttachmentSystemPickerBinding2.textFiles.setVisibility(8);
        }
        if (!requireArguments().getBoolean(ARG_VISUAL_MEDIA_ATTACHMENTS_TAB_ENABLED)) {
            StreamUiFragmentAttachmentSystemPickerBinding streamUiFragmentAttachmentSystemPickerBinding3 = this._binding;
            AbstractC22676k.m65747g(streamUiFragmentAttachmentSystemPickerBinding3);
            streamUiFragmentAttachmentSystemPickerBinding3.buttonMedia.setVisibility(8);
            StreamUiFragmentAttachmentSystemPickerBinding streamUiFragmentAttachmentSystemPickerBinding4 = this._binding;
            AbstractC22676k.m65747g(streamUiFragmentAttachmentSystemPickerBinding4);
            streamUiFragmentAttachmentSystemPickerBinding4.textMedia.setVisibility(8);
        }
        if (!requireArguments().getBoolean(ARG_CAMERA_ATTACHMENTS_TAB_ENABLED)) {
            StreamUiFragmentAttachmentSystemPickerBinding streamUiFragmentAttachmentSystemPickerBinding5 = this._binding;
            AbstractC22676k.m65747g(streamUiFragmentAttachmentSystemPickerBinding5);
            streamUiFragmentAttachmentSystemPickerBinding5.buttonCapture.setVisibility(8);
            StreamUiFragmentAttachmentSystemPickerBinding streamUiFragmentAttachmentSystemPickerBinding6 = this._binding;
            AbstractC22676k.m65747g(streamUiFragmentAttachmentSystemPickerBinding6);
            streamUiFragmentAttachmentSystemPickerBinding6.textCapture.setVisibility(8);
        }
        if (!requireArguments().getBoolean(ARG_POLL_ATTACHMENTS_TAB_ENABLED)) {
            StreamUiFragmentAttachmentSystemPickerBinding streamUiFragmentAttachmentSystemPickerBinding7 = this._binding;
            AbstractC22676k.m65747g(streamUiFragmentAttachmentSystemPickerBinding7);
            streamUiFragmentAttachmentSystemPickerBinding7.buttonPolls.setVisibility(8);
            StreamUiFragmentAttachmentSystemPickerBinding streamUiFragmentAttachmentSystemPickerBinding8 = this._binding;
            AbstractC22676k.m65747g(streamUiFragmentAttachmentSystemPickerBinding8);
            streamUiFragmentAttachmentSystemPickerBinding8.textPoll.setVisibility(8);
        }
        StreamUiFragmentAttachmentSystemPickerBinding streamUiFragmentAttachmentSystemPickerBinding9 = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentAttachmentSystemPickerBinding9);
        final int i13 = 0;
        streamUiFragmentAttachmentSystemPickerBinding9.buttonFiles.setOnClickListener(new View.OnClickListener(this) { // from class: io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.factory.system.internal.b

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ AttachmentsPickerSystemFragment f74539x;

            {
                this.f74539x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        AttachmentsPickerSystemFragment.setupViews$lambda$2(this.f74539x, view);
                        break;
                    case 1:
                        AttachmentsPickerSystemFragment.setupViews$lambda$3(this.f74539x, view);
                        break;
                    case 2:
                        AttachmentsPickerSystemFragment.setupViews$lambda$7$lambda$6(this.f74539x, view);
                        break;
                    default:
                        AttachmentsPickerSystemFragment.setupViews$lambda$9(this.f74539x, view);
                        break;
                }
            }
        });
        this.visualMediaPickerLauncher = registerVisualMediaPickerLauncher(requireArguments().getBoolean(ARG_VISUAL_MEDIA_ALLOW_MULTIPLE));
        StreamUiFragmentAttachmentSystemPickerBinding streamUiFragmentAttachmentSystemPickerBinding10 = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentAttachmentSystemPickerBinding10);
        final int i14 = 1;
        streamUiFragmentAttachmentSystemPickerBinding10.buttonMedia.setOnClickListener(new View.OnClickListener(this) { // from class: io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.factory.system.internal.b

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ AttachmentsPickerSystemFragment f74539x;

            {
                this.f74539x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        AttachmentsPickerSystemFragment.setupViews$lambda$2(this.f74539x, view);
                        break;
                    case 1:
                        AttachmentsPickerSystemFragment.setupViews$lambda$3(this.f74539x, view);
                        break;
                    case 2:
                        AttachmentsPickerSystemFragment.setupViews$lambda$7$lambda$6(this.f74539x, view);
                        break;
                    default:
                        AttachmentsPickerSystemFragment.setupViews$lambda$9(this.f74539x, view);
                        break;
                }
            }
        });
        AbstractActivityC1340r0 activity = getActivity();
        C21070i c21070iM58914d = null;
        if (activity != null && (activityResultRegistry = activity.getActivityResultRegistry()) != null) {
            CameraAttachmentFragment.Companion companion = CameraAttachmentFragment.INSTANCE;
            AttachmentsPickerDialogStyle attachmentsPickerDialogStyle = this.style;
            if (attachmentsPickerDialogStyle == null) {
                AbstractC22676k.m65757q("style");
                throw null;
            }
            c21070iM58914d = activityResultRegistry.m58914d(CameraAttachmentFragment.LauncherRequestsKeys.CAPTURE_MEDIA, new CaptureMediaContract(companion.getMode$stream_chat_android_ui_components_release(attachmentsPickerDialogStyle.getPickerMediaMode()), null, null, null, 14, null), new C19687a(this, 2));
        }
        this.captureMedia = c21070iM58914d;
        if (c21070iM58914d != null) {
            StreamUiFragmentAttachmentSystemPickerBinding streamUiFragmentAttachmentSystemPickerBinding11 = this._binding;
            AbstractC22676k.m65747g(streamUiFragmentAttachmentSystemPickerBinding11);
            final int i15 = 2;
            streamUiFragmentAttachmentSystemPickerBinding11.buttonCapture.setOnClickListener(new View.OnClickListener(this) { // from class: io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.factory.system.internal.b

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ AttachmentsPickerSystemFragment f74539x;

                {
                    this.f74539x = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i15) {
                        case 0:
                            AttachmentsPickerSystemFragment.setupViews$lambda$2(this.f74539x, view);
                            break;
                        case 1:
                            AttachmentsPickerSystemFragment.setupViews$lambda$3(this.f74539x, view);
                            break;
                        case 2:
                            AttachmentsPickerSystemFragment.setupViews$lambda$7$lambda$6(this.f74539x, view);
                            break;
                        default:
                            AttachmentsPickerSystemFragment.setupViews$lambda$9(this.f74539x, view);
                            break;
                    }
                }
            });
        }
        StreamUiFragmentAttachmentSystemPickerBinding streamUiFragmentAttachmentSystemPickerBinding12 = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentAttachmentSystemPickerBinding12);
        final int i16 = 3;
        streamUiFragmentAttachmentSystemPickerBinding12.buttonPolls.setOnClickListener(new View.OnClickListener(this) { // from class: io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.factory.system.internal.b

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ AttachmentsPickerSystemFragment f74539x;

            {
                this.f74539x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        AttachmentsPickerSystemFragment.setupViews$lambda$2(this.f74539x, view);
                        break;
                    case 1:
                        AttachmentsPickerSystemFragment.setupViews$lambda$3(this.f74539x, view);
                        break;
                    case 2:
                        AttachmentsPickerSystemFragment.setupViews$lambda$7$lambda$6(this.f74539x, view);
                        break;
                    default:
                        AttachmentsPickerSystemFragment.setupViews$lambda$9(this.f74539x, view);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupViews$lambda$2(AttachmentsPickerSystemFragment attachmentsPickerSystemFragment, View view) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("*/*");
        intent.putExtra("android.intent.extra.MIME_TYPES", (String[]) attachmentsPickerSystemFragment.attachmentFilter.getSupportedMimeTypes().toArray(new String[0]));
        intent.addCategory("android.intent.category.OPENABLE");
        attachmentsPickerSystemFragment.filePickerLauncher.mo4052a(intent, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupViews$lambda$3(AttachmentsPickerSystemFragment attachmentsPickerSystemFragment, View view) {
        AbstractC21065d abstractC21065d = attachmentsPickerSystemFragment.visualMediaPickerLauncher;
        if (abstractC21065d != null) {
            Serializable serializable = attachmentsPickerSystemFragment.requireArguments().getSerializable(ARG_VISUAL_MEDIA_TYPE);
            AbstractC22676k.m65748h(serializable, "null cannot be cast to non-null type io.getstream.chat.android.ui.common.permissions.VisualMediaType");
            abstractC21065d.mo4052a(AbstractC32416g.m101149f(VisualMediaTypeKt.toContractVisualMediaType((VisualMediaType) serializable)), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupViews$lambda$4(AttachmentsPickerSystemFragment attachmentsPickerSystemFragment, File file) {
        List<AttachmentMetaData> listM118958J;
        if (file == null) {
            listM118958J = C25271y.f99162w;
        } else {
            Context contextRequireContext = attachmentsPickerSystemFragment.requireContext();
            AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
            listM118958J = AbstractC37056f.m118958J(new AttachmentMetaData(contextRequireContext, file));
        }
        AttachmentsPickerTabListener attachmentsPickerTabListener = attachmentsPickerSystemFragment.attachmentsPickerTabListener;
        if (attachmentsPickerTabListener != null) {
            attachmentsPickerTabListener.onSelectedAttachmentsChanged(listM118958J);
        }
        AttachmentsPickerTabListener attachmentsPickerTabListener2 = attachmentsPickerSystemFragment.attachmentsPickerTabListener;
        if (attachmentsPickerTabListener2 != null) {
            attachmentsPickerTabListener2.onSelectedAttachmentsSubmitted();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupViews$lambda$7$lambda$6(AttachmentsPickerSystemFragment attachmentsPickerSystemFragment, View view) {
        attachmentsPickerSystemFragment.checkCameraPermissions(new C19683b(attachmentsPickerSystemFragment, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 setupViews$lambda$7$lambda$6$lambda$5(AttachmentsPickerSystemFragment attachmentsPickerSystemFragment) {
        AbstractC21065d abstractC21065d;
        StreamUiFragmentAttachmentSystemPickerBinding streamUiFragmentAttachmentSystemPickerBinding = attachmentsPickerSystemFragment._binding;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (streamUiFragmentAttachmentSystemPickerBinding != null && (abstractC21065d = attachmentsPickerSystemFragment.captureMedia) != null) {
            abstractC21065d.mo4052a(c23454a0, null);
        }
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupViews$lambda$9(final AttachmentsPickerSystemFragment attachmentsPickerSystemFragment, View view) {
        AbstractC1329o1 fragmentManager = ContextKt.getFragmentManager(attachmentsPickerSystemFragment.getContext());
        if (fragmentManager != null) {
            CreatePollDialogFragment.Companion.newInstance$default(CreatePollDialogFragment.INSTANCE, new CreatePollDialogFragment.CreatePollDialogListener() { // from class: io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.factory.system.internal.AttachmentsPickerSystemFragment$setupViews$5$1$1
                @Override // io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.poll.CreatePollDialogFragment.CreatePollDialogListener
                public final void onCreatePoll(CreatePollParams createPollParams) {
                    AbstractC22676k.m65750j(createPollParams, "createPollParams");
                    AttachmentsPickerTabListener attachmentsPickerTabListener = this.this$0.attachmentsPickerTabListener;
                    if (attachmentsPickerTabListener != null) {
                        attachmentsPickerTabListener.onPollSubmitted(createPollParams);
                    }
                }

                @Override // io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.poll.CreatePollDialogFragment.CreatePollDialogListener
                public final void onDismiss() {
                    AttachmentsPickerTabListener attachmentsPickerTabListener = this.this$0.attachmentsPickerTabListener;
                    if (attachmentsPickerTabListener != null) {
                        attachmentsPickerTabListener.onPollSubmitted(null);
                    }
                }
            }, null, 2, null).show(fragmentManager, CreatePollDialogFragment.TAG);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        Context contextRequireContext = requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        this.attachmentStorageHelper = new AttachmentStorageHelper(contextRequireContext, null, null, 6, null);
        Context contextRequireContext2 = requireContext();
        AbstractC22676k.m65749i(contextRequireContext2, "requireContext(...)");
        StreamUiFragmentAttachmentSystemPickerBinding streamUiFragmentAttachmentSystemPickerBindingInflate = StreamUiFragmentAttachmentSystemPickerBinding.inflate(ContextKt.getStreamThemeInflater(contextRequireContext2), container, false);
        this._binding = streamUiFragmentAttachmentSystemPickerBindingInflate;
        return streamUiFragmentAttachmentSystemPickerBindingInflate.getRoot();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onDestroyView() {
        super.onDestroyView();
        AbstractC21065d abstractC21065d = this.visualMediaPickerLauncher;
        if (abstractC21065d != null) {
            abstractC21065d.mo4053b();
        }
        AbstractC21065d abstractC21065d2 = this.captureMedia;
        if (abstractC21065d2 != null) {
            abstractC21065d2.mo4053b();
        }
        this._binding = null;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (savedInstanceState == null && this.style != null) {
            setupViews();
            return;
        }
        AbstractC1329o1 parentFragmentManager = getParentFragmentManager();
        parentFragmentManager.getClass();
        C1271a c1271a = new C1271a(parentFragmentManager);
        c1271a.m4050n(this);
        c1271a.m4046j();
    }

    public final void setAttachmentsPickerTabListener(AttachmentsPickerTabListener attachmentsPickerTabListener) {
        AbstractC22676k.m65750j(attachmentsPickerTabListener, "attachmentsPickerTabListener");
        this.attachmentsPickerTabListener = attachmentsPickerTabListener;
    }

    public final void setStyle(AttachmentsPickerDialogStyle style) {
        AbstractC22676k.m65750j(style, "style");
        this.style = style;
    }
}
