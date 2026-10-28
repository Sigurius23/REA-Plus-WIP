package io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.camera.internal;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import aq0.C1904o;
import b30.ViewOnClickListenerC2558k3;
import c93.InterfaceC4339a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import io.getstream.chat.android.p226ui.common.contract.internal.CaptureMediaContract;
import io.getstream.chat.android.p226ui.common.state.messages.composer.AttachmentMetaData;
import io.getstream.chat.android.p226ui.databinding.StreamUiAttachmentPermissionViewBinding;
import io.getstream.chat.android.p226ui.databinding.StreamUiFragmentAttachmentCameraBinding;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.AttachmentsPickerDialogStyle;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.PickerMediaMode;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.AttachmentsPickerTabListener;
import io.getstream.chat.android.p226ui.font.TextStyleKt;
import io.getstream.chat.android.p226ui.utils.PermissionChecker;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import java.io.File;
import java.util.List;
import l83.C23454a0;
import m83.C25271y;
import p236j.AbstractC21065d;
import p236j.AbstractC21071j;
import p236j.C21070i;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 -2\u00020\u0001:\u0002.-B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0003J+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u0003R\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010(R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010)R\u0014\u0010,\u001a\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006/"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/camera/internal/CameraAttachmentFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Ll83/a0;", "setupViews", "setupResultListener", "checkPermissions", "onPermissionGranted", "onPermissionDenied", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;", "style", "setStyle", "(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;)V", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;", "attachmentsPickerTabListener", "setAttachmentsPickerTabListener", "(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;)V", "onDestroyView", "Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentCameraBinding;", "_binding", "Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentCameraBinding;", "Lio/getstream/chat/android/ui/utils/PermissionChecker;", "permissionChecker", "Lio/getstream/chat/android/ui/utils/PermissionChecker;", "Lj/d;", "activityResultLauncher", "Lj/d;", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;", "getBinding", "()Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentCameraBinding;", "binding", "Companion", "LauncherRequestsKeys", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class CameraAttachmentFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private StreamUiFragmentAttachmentCameraBinding _binding;
    private AbstractC21065d activityResultLauncher;
    private AttachmentsPickerTabListener attachmentsPickerTabListener;
    private final PermissionChecker permissionChecker = new PermissionChecker();
    private AttachmentsPickerDialogStyle style;

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007R\u0018\u0010\b\u001a\u00020\t*\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/camera/internal/CameraAttachmentFragment$Companion;", "", "<init>", "()V", "newInstance", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/camera/internal/CameraAttachmentFragment;", "style", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;", "mode", "Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract$Mode;", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;", "getMode$stream_chat_android_ui_components_release", "(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;)Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract$Mode;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {

        @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PickerMediaMode.values().length];
                try {
                    iArr[PickerMediaMode.PHOTO.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PickerMediaMode.VIDEO.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PickerMediaMode.PHOTO_AND_VIDEO.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public final CaptureMediaContract.Mode getMode$stream_chat_android_ui_components_release(PickerMediaMode pickerMediaMode) {
            AbstractC22676k.m65750j(pickerMediaMode, "<this>");
            int i13 = WhenMappings.$EnumSwitchMapping$0[pickerMediaMode.ordinal()];
            if (i13 == 1) {
                return CaptureMediaContract.Mode.PHOTO;
            }
            if (i13 == 2) {
                return CaptureMediaContract.Mode.VIDEO;
            }
            if (i13 == 3) {
                return CaptureMediaContract.Mode.PHOTO_AND_VIDEO;
            }
            throw new NoWhenBranchMatchedException();
        }

        public final CameraAttachmentFragment newInstance(AttachmentsPickerDialogStyle style) {
            AbstractC22676k.m65750j(style, "style");
            CameraAttachmentFragment cameraAttachmentFragment = new CameraAttachmentFragment();
            cameraAttachmentFragment.setStyle(style);
            return cameraAttachmentFragment;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/camera/internal/CameraAttachmentFragment$LauncherRequestsKeys;", "", "<init>", "()V", "CAPTURE_MEDIA", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class LauncherRequestsKeys {
        public static final String CAPTURE_MEDIA = "capture_media_request_key";
        public static final LauncherRequestsKeys INSTANCE = new LauncherRequestsKeys();

        private LauncherRequestsKeys() {
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.factory.camera.internal.CameraAttachmentFragment$checkPermissions$1 */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class C196771 extends C22672i implements InterfaceC4339a {
        public C196771(Object obj) {
            super(0, 0, CameraAttachmentFragment.class, obj, "onPermissionDenied", "onPermissionDenied()V");
        }

        @Override // c93.InterfaceC4339a
        public final /* bridge */ /* synthetic */ Object invoke() {
            m134228invoke();
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m134228invoke() {
            ((CameraAttachmentFragment) this.receiver).onPermissionDenied();
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.factory.camera.internal.CameraAttachmentFragment$checkPermissions$2 */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class C196782 extends C22672i implements InterfaceC4339a {
        public C196782(Object obj) {
            super(0, 0, CameraAttachmentFragment.class, obj, "onPermissionGranted", "onPermissionGranted()V");
        }

        @Override // c93.InterfaceC4339a
        public final /* bridge */ /* synthetic */ Object invoke() {
            m134229invoke();
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m134229invoke() {
            ((CameraAttachmentFragment) this.receiver).onPermissionGranted();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkPermissions() {
        PermissionChecker permissionChecker = this.permissionChecker;
        Context contextRequireContext = requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        if (!permissionChecker.isNeededToRequestForCameraPermissions(contextRequireContext)) {
            onPermissionGranted();
            return;
        }
        PermissionChecker permissionChecker2 = this.permissionChecker;
        StreamUiFragmentAttachmentCameraBinding streamUiFragmentAttachmentCameraBinding = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentAttachmentCameraBinding);
        ConstraintLayout root = streamUiFragmentAttachmentCameraBinding.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        permissionChecker2.checkCameraPermissions(root, new C196771(this), new C196782(this));
    }

    private final StreamUiFragmentAttachmentCameraBinding getBinding() {
        StreamUiFragmentAttachmentCameraBinding streamUiFragmentAttachmentCameraBinding = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentAttachmentCameraBinding);
        return streamUiFragmentAttachmentCameraBinding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPermissionDenied() {
        StreamUiFragmentAttachmentCameraBinding streamUiFragmentAttachmentCameraBinding = this._binding;
        if (streamUiFragmentAttachmentCameraBinding != null) {
            LinearLayout grantPermissionsContainer = streamUiFragmentAttachmentCameraBinding.grantPermissionsInclude.grantPermissionsContainer;
            AbstractC22676k.m65749i(grantPermissionsContainer, "grantPermissionsContainer");
            grantPermissionsContainer.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPermissionGranted() {
        StreamUiFragmentAttachmentCameraBinding streamUiFragmentAttachmentCameraBinding = this._binding;
        if (streamUiFragmentAttachmentCameraBinding != null) {
            LinearLayout grantPermissionsContainer = streamUiFragmentAttachmentCameraBinding.grantPermissionsInclude.grantPermissionsContainer;
            AbstractC22676k.m65749i(grantPermissionsContainer, "grantPermissionsContainer");
            grantPermissionsContainer.setVisibility(8);
            AbstractC21065d abstractC21065d = this.activityResultLauncher;
            if (abstractC21065d != null) {
                abstractC21065d.mo4052a(C23454a0.f92919a, null);
            }
        }
    }

    private final void setupResultListener() {
        AbstractC21071j activityResultRegistry;
        AbstractActivityC1340r0 activity = getActivity();
        C21070i c21070iM58914d = null;
        if (activity != null && (activityResultRegistry = activity.getActivityResultRegistry()) != null) {
            Companion companion = INSTANCE;
            AttachmentsPickerDialogStyle attachmentsPickerDialogStyle = this.style;
            if (attachmentsPickerDialogStyle == null) {
                AbstractC22676k.m65757q("style");
                throw null;
            }
            c21070iM58914d = activityResultRegistry.m58914d(LauncherRequestsKeys.CAPTURE_MEDIA, new CaptureMediaContract(companion.getMode$stream_chat_android_ui_components_release(attachmentsPickerDialogStyle.getPickerMediaMode()), null, null, null, 14, null), new C1904o(this, 7));
        }
        this.activityResultLauncher = c21070iM58914d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupResultListener$lambda$2(CameraAttachmentFragment cameraAttachmentFragment, File file) {
        List<AttachmentMetaData> listM118958J;
        if (file == null) {
            listM118958J = C25271y.f99162w;
        } else {
            Context contextRequireContext = cameraAttachmentFragment.requireContext();
            AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
            listM118958J = AbstractC37056f.m118958J(new AttachmentMetaData(contextRequireContext, file));
        }
        AttachmentsPickerTabListener attachmentsPickerTabListener = cameraAttachmentFragment.attachmentsPickerTabListener;
        if (attachmentsPickerTabListener != null) {
            attachmentsPickerTabListener.onSelectedAttachmentsChanged(listM118958J);
        }
        AttachmentsPickerTabListener attachmentsPickerTabListener2 = cameraAttachmentFragment.attachmentsPickerTabListener;
        if (attachmentsPickerTabListener2 != null) {
            attachmentsPickerTabListener2.onSelectedAttachmentsSubmitted();
        }
    }

    private final void setupViews() {
        StreamUiFragmentAttachmentCameraBinding streamUiFragmentAttachmentCameraBinding = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentAttachmentCameraBinding);
        StreamUiAttachmentPermissionViewBinding streamUiAttachmentPermissionViewBinding = streamUiFragmentAttachmentCameraBinding.grantPermissionsInclude;
        ImageView imageView = streamUiAttachmentPermissionViewBinding.grantPermissionsImageView;
        AttachmentsPickerDialogStyle attachmentsPickerDialogStyle = this.style;
        if (attachmentsPickerDialogStyle == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        imageView.setImageDrawable(attachmentsPickerDialogStyle.getAllowAccessToCameraIconDrawable());
        TextView textView = streamUiAttachmentPermissionViewBinding.grantPermissionsTextView;
        AttachmentsPickerDialogStyle attachmentsPickerDialogStyle2 = this.style;
        if (attachmentsPickerDialogStyle2 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        textView.setText(attachmentsPickerDialogStyle2.getAllowAccessToCameraButtonText());
        TextView grantPermissionsTextView = streamUiAttachmentPermissionViewBinding.grantPermissionsTextView;
        AbstractC22676k.m65749i(grantPermissionsTextView, "grantPermissionsTextView");
        AttachmentsPickerDialogStyle attachmentsPickerDialogStyle3 = this.style;
        if (attachmentsPickerDialogStyle3 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        TextStyleKt.setTextStyle(grantPermissionsTextView, attachmentsPickerDialogStyle3.getAllowAccessButtonTextStyle());
        streamUiAttachmentPermissionViewBinding.grantPermissionsTextView.setOnClickListener(new ViewOnClickListenerC2558k3(this, 15));
    }

    /* JADX INFO: renamed from: z */
    public static void m55246z(CameraAttachmentFragment cameraAttachmentFragment) {
        cameraAttachmentFragment.checkPermissions();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        Context contextRequireContext = requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        StreamUiFragmentAttachmentCameraBinding streamUiFragmentAttachmentCameraBindingInflate = StreamUiFragmentAttachmentCameraBinding.inflate(ContextKt.getStreamThemeInflater(contextRequireContext), container, false);
        this._binding = streamUiFragmentAttachmentCameraBindingInflate;
        ConstraintLayout root = streamUiFragmentAttachmentCameraBindingInflate.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onDestroyView() {
        super.onDestroyView();
        AbstractC21065d abstractC21065d = this.activityResultLauncher;
        if (abstractC21065d != null) {
            abstractC21065d.mo4053b();
        }
        this._binding = null;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (this.style != null) {
            setupViews();
            setupResultListener();
            checkPermissions();
        }
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
