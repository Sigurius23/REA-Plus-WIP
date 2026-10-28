package io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.file.internal;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.AbstractC1613o1;
import aq0.C1904o;
import bc3.AbstractC3006f0;
import bc3.AbstractC3076z;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import io.getstream.chat.android.core.internal.coroutines.DispatcherProvider;
import io.getstream.chat.android.p226ui.common.contract.internal.SelectFilesContract;
import io.getstream.chat.android.p226ui.common.helper.internal.AttachmentStorageHelper;
import io.getstream.chat.android.p226ui.common.permissions.FilesAccess;
import io.getstream.chat.android.p226ui.common.permissions.FilesAccessKt;
import io.getstream.chat.android.p226ui.common.state.messages.composer.AttachmentMetaData;
import io.getstream.chat.android.p226ui.databinding.StreamUiFragmentAttachmentFileBinding;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.AttachmentsPickerDialogStyle;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.AttachmentsPickerTabListener;
import io.getstream.chat.android.p226ui.font.TextStyleKt;
import io.getstream.chat.android.p226ui.utils.PermissionChecker;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l83.C23454a0;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import m83.C25235a0;
import p098dt.AbstractC12350b;
import p236j.AbstractC21065d;
import p236j.AbstractC21071j;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\b\b\u0000\u0018\u0000 J2\u00020\u0001:\u0002KJB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0003J\u0015\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b \u0010\u0003J\u000f\u0010!\u001a\u00020\u0006H\u0002¢\u0006\u0004\b!\u0010\u0003J\u0017\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00062\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J!\u0010+\u001a\u00020\u00062\u0006\u0010'\u001a\u00020&2\b\b\u0002\u0010*\u001a\u00020&H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u00062\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b-\u0010)J\u000f\u0010.\u001a\u00020\u0006H\u0002¢\u0006\u0004\b.\u0010\u0003J\u000f\u0010/\u001a\u00020\u0006H\u0002¢\u0006\u0004\b/\u0010\u0003R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00104\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001e\u0010:\u001a\n\u0012\u0004\u0012\u00020&\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0005\u0010<R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010=R\u001b\u0010C\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001c\u0010E\u001a\b\u0012\u0004\u0012\u00020\u001c0D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010I\u001a\u0002008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006L"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;", "style", "Ll83/a0;", "setStyle", "(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "onDestroyView", "onDetach", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;", "attachmentsPickerTabListener", "setAttachmentsPickerTabListener", "(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;)V", "Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;", "attachmentMetaData", "updateFileAttachment", "(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;)V", "setupViews", "checkPermissions", "Lio/getstream/chat/android/ui/common/permissions/FilesAccess;", "access", "handleFilesAccessState", "(Lio/getstream/chat/android/ui/common/permissions/FilesAccess;)V", "", "show", "showRequestAudioAccessLabel", "(Z)V", "hasPartialAccess", "showRequestVisualMediaAccessLabel", "(ZZ)V", "showGrantPermissionsContainer", "setupResultListener", "populateAttachments", "Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;", "_binding", "Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;", "Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;", "attachmentStorageHelper", "Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;", "Lio/getstream/chat/android/ui/utils/PermissionChecker;", "permissionChecker", "Lio/getstream/chat/android/ui/utils/PermissionChecker;", "Lj/d;", "activityResultLauncher", "Lj/d;", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter;", "fileAttachmentsAdapter$delegate", "Ll83/h;", "getFileAttachmentsAdapter", "()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter;", "fileAttachmentsAdapter", "", "selectedAttachments", "Ljava/util/Set;", "getBinding", "()Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;", "binding", "Companion", "LauncherRequestsKeys", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class FileAttachmentFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private StreamUiFragmentAttachmentFileBinding _binding;
    private AbstractC21065d activityResultLauncher;
    private AttachmentStorageHelper attachmentStorageHelper;
    private AttachmentsPickerTabListener attachmentsPickerTabListener;
    private AttachmentsPickerDialogStyle style;
    private final PermissionChecker permissionChecker = new PermissionChecker();

    /* JADX INFO: renamed from: fileAttachmentsAdapter$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h fileAttachmentsAdapter = AbstractC30060g.m92088H(new C19683b(this, 0));
    private Set<AttachmentMetaData> selectedAttachments = C25235a0.f99113w;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment$Companion;", "", "<init>", "()V", "newInstance", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;", "style", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final FileAttachmentFragment newInstance(AttachmentsPickerDialogStyle style) {
            AbstractC22676k.m65750j(style, "style");
            FileAttachmentFragment fileAttachmentFragment = new FileAttachmentFragment();
            fileAttachmentFragment.setStyle(style);
            return fileAttachmentFragment;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment$LauncherRequestsKeys;", "", "<init>", "()V", "SELECT_FILES", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class LauncherRequestsKeys {
        public static final LauncherRequestsKeys INSTANCE = new LauncherRequestsKeys();
        public static final String SELECT_FILES = "select_files_request_key";

        private LauncherRequestsKeys() {
        }
    }

    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FilesAccess.values().length];
            try {
                iArr[FilesAccess.DENIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.factory.file.internal.FileAttachmentFragment$populateAttachments$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.factory.file.internal.FileAttachmentFragment$populateAttachments$1", m100430f = "FileAttachmentFragment.kt", m100431l = {258}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C196791 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        public C196791(InterfaceC30057d<? super C196791> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return FileAttachmentFragment.this.new C196791(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C196791) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                ProgressBar progressBar = FileAttachmentFragment.access$getBinding(FileAttachmentFragment.this).progressBar;
                AbstractC22676k.m65749i(progressBar, "progressBar");
                progressBar.setVisibility(0);
                AbstractC3076z io3 = DispatcherProvider.INSTANCE.getIO();
                C19680x2d1f7f20 c19680x2d1f7f20 = new C19680x2d1f7f20(FileAttachmentFragment.this, null);
                this.label = 1;
                obj = AbstractC3006f0.m8705K(io3, c19680x2d1f7f20, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            List<AttachmentMetaData> list = (List) obj;
            if (list.isEmpty()) {
                TextView emptyPlaceholderTextView = FileAttachmentFragment.access$getBinding(FileAttachmentFragment.this).emptyPlaceholderTextView;
                AbstractC22676k.m65749i(emptyPlaceholderTextView, "emptyPlaceholderTextView");
                AttachmentsPickerDialogStyle attachmentsPickerDialogStyle = FileAttachmentFragment.this.style;
                if (attachmentsPickerDialogStyle == null) {
                    AbstractC22676k.m65757q("style");
                    throw null;
                }
                TextStyleKt.setTextStyle(emptyPlaceholderTextView, attachmentsPickerDialogStyle.getFileAttachmentsNoFilesTextStyle());
                TextView textView = FileAttachmentFragment.access$getBinding(FileAttachmentFragment.this).emptyPlaceholderTextView;
                AttachmentsPickerDialogStyle attachmentsPickerDialogStyle2 = FileAttachmentFragment.this.style;
                if (attachmentsPickerDialogStyle2 == null) {
                    AbstractC22676k.m65757q("style");
                    throw null;
                }
                textView.setText(attachmentsPickerDialogStyle2.getFileAttachmentsNoFilesText());
                TextView emptyPlaceholderTextView2 = FileAttachmentFragment.access$getBinding(FileAttachmentFragment.this).emptyPlaceholderTextView;
                AbstractC22676k.m65749i(emptyPlaceholderTextView2, "emptyPlaceholderTextView");
                emptyPlaceholderTextView2.setVisibility(0);
            } else {
                FileAttachmentFragment.this.getFileAttachmentsAdapter().setAttachments(list);
            }
            ProgressBar progressBar2 = FileAttachmentFragment.access$getBinding(FileAttachmentFragment.this).progressBar;
            AbstractC22676k.m65749i(progressBar2, "progressBar");
            progressBar2.setVisibility(8);
            return C23454a0.f92919a;
        }
    }

    public static final StreamUiFragmentAttachmentFileBinding access$getBinding(FileAttachmentFragment fileAttachmentFragment) {
        StreamUiFragmentAttachmentFileBinding streamUiFragmentAttachmentFileBinding = fileAttachmentFragment._binding;
        AbstractC22676k.m65747g(streamUiFragmentAttachmentFileBinding);
        return streamUiFragmentAttachmentFileBinding;
    }

    private final void checkPermissions() {
        Context contextRequireContext = requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        handleFilesAccessState(FilesAccessKt.resolveFilesAccessState(contextRequireContext));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FileAttachmentAdapter fileAttachmentsAdapter_delegate$lambda$1(FileAttachmentFragment fileAttachmentFragment) {
        AttachmentsPickerDialogStyle attachmentsPickerDialogStyle = fileAttachmentFragment.style;
        if (attachmentsPickerDialogStyle != null) {
            return new FileAttachmentAdapter(attachmentsPickerDialogStyle, new C19682a(fileAttachmentFragment, 2));
        }
        AbstractC22676k.m65757q("style");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 fileAttachmentsAdapter_delegate$lambda$1$lambda$0(FileAttachmentFragment fileAttachmentFragment, AttachmentMetaData it) {
        AbstractC22676k.m65750j(it, "it");
        fileAttachmentFragment.updateFileAttachment(it);
        return C23454a0.f92919a;
    }

    private final StreamUiFragmentAttachmentFileBinding getBinding() {
        StreamUiFragmentAttachmentFileBinding streamUiFragmentAttachmentFileBinding = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentAttachmentFileBinding);
        return streamUiFragmentAttachmentFileBinding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FileAttachmentAdapter getFileAttachmentsAdapter() {
        return (FileAttachmentAdapter) this.fileAttachmentsAdapter.getValue();
    }

    private final void handleFilesAccessState(FilesAccess access) {
        if (WhenMappings.$EnumSwitchMapping$0[access.ordinal()] == 1) {
            showGrantPermissionsContainer(true);
            showRequestAudioAccessLabel(false);
            showRequestVisualMediaAccessLabel$default(this, false, false, 2, null);
            return;
        }
        FilesAccess filesAccess = FilesAccess.AUDIO_AND_FULL_VISUAL;
        boolean z4 = access == filesAccess || access == FilesAccess.AUDIO_AND_PARTIAL_VISUAL || access == FilesAccess.AUDIO;
        boolean z13 = access == filesAccess || access == FilesAccess.FULL_VISUAL;
        boolean z14 = access == FilesAccess.AUDIO_AND_PARTIAL_VISUAL || access == FilesAccess.PARTIAL_VISUAL;
        showGrantPermissionsContainer(false);
        showRequestAudioAccessLabel(!z4);
        showRequestVisualMediaAccessLabel(!z13, z14);
        populateAttachments();
    }

    private final void populateAttachments() {
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(this), DispatcherProvider.INSTANCE.getMain(), null, new C196791(null), 2);
    }

    private final void setupResultListener() {
        AbstractC21071j activityResultRegistry;
        AbstractActivityC1340r0 activity = getActivity();
        this.activityResultLauncher = (activity == null || (activityResultRegistry = activity.getActivityResultRegistry()) == null) ? null : activityResultRegistry.m58914d(LauncherRequestsKeys.SELECT_FILES, new SelectFilesContract(), new C1904o(this, 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupResultListener$lambda$13(FileAttachmentFragment fileAttachmentFragment, List uris) {
        AbstractC22676k.m65750j(uris, "uris");
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(fileAttachmentFragment), DispatcherProvider.INSTANCE.getMain(), null, new FileAttachmentFragment$setupResultListener$1$1(uris, fileAttachmentFragment, null), 2);
    }

    private final void setupViews() {
        StreamUiFragmentAttachmentFileBinding streamUiFragmentAttachmentFileBinding = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentAttachmentFileBinding);
        ImageView imageView = streamUiFragmentAttachmentFileBinding.grantPermissionsInclude.grantPermissionsImageView;
        AttachmentsPickerDialogStyle attachmentsPickerDialogStyle = this.style;
        if (attachmentsPickerDialogStyle == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        imageView.setImageDrawable(attachmentsPickerDialogStyle.getAllowAccessToFilesIconDrawable());
        TextView textView = streamUiFragmentAttachmentFileBinding.grantPermissionsInclude.grantPermissionsTextView;
        AttachmentsPickerDialogStyle attachmentsPickerDialogStyle2 = this.style;
        if (attachmentsPickerDialogStyle2 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        textView.setText(attachmentsPickerDialogStyle2.getAllowAccessToFilesButtonText());
        TextView grantPermissionsTextView = streamUiFragmentAttachmentFileBinding.grantPermissionsInclude.grantPermissionsTextView;
        AbstractC22676k.m65749i(grantPermissionsTextView, "grantPermissionsTextView");
        AttachmentsPickerDialogStyle attachmentsPickerDialogStyle3 = this.style;
        if (attachmentsPickerDialogStyle3 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        TextStyleKt.setTextStyle(grantPermissionsTextView, attachmentsPickerDialogStyle3.getAllowAccessButtonTextStyle());
        final int i13 = 0;
        streamUiFragmentAttachmentFileBinding.grantPermissionsInclude.grantPermissionsTextView.setOnClickListener(new View.OnClickListener(this) { // from class: io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.factory.file.internal.c

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ FileAttachmentFragment f74535x;

            {
                this.f74535x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        FileAttachmentFragment.setupViews$lambda$9$lambda$3(this.f74535x, view);
                        break;
                    case 1:
                        FileAttachmentFragment.setupViews$lambda$9$lambda$4(this.f74535x, view);
                        break;
                    case 2:
                        FileAttachmentFragment.setupViews$lambda$9$lambda$6(this.f74535x, view);
                        break;
                    default:
                        FileAttachmentFragment.setupViews$lambda$9$lambda$8(this.f74535x, view);
                        break;
                }
            }
        });
        streamUiFragmentAttachmentFileBinding.recentFilesRecyclerView.setAdapter(getFileAttachmentsAdapter());
        ImageView imageView2 = streamUiFragmentAttachmentFileBinding.fileManagerImageView;
        AttachmentsPickerDialogStyle attachmentsPickerDialogStyle4 = this.style;
        if (attachmentsPickerDialogStyle4 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        imageView2.setImageDrawable(attachmentsPickerDialogStyle4.getFileManagerIconDrawable());
        TextView textView2 = streamUiFragmentAttachmentFileBinding.recentFilesTextView;
        AttachmentsPickerDialogStyle attachmentsPickerDialogStyle5 = this.style;
        if (attachmentsPickerDialogStyle5 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        textView2.setText(attachmentsPickerDialogStyle5.getRecentFilesText());
        TextView recentFilesTextView = streamUiFragmentAttachmentFileBinding.recentFilesTextView;
        AbstractC22676k.m65749i(recentFilesTextView, "recentFilesTextView");
        AttachmentsPickerDialogStyle attachmentsPickerDialogStyle6 = this.style;
        if (attachmentsPickerDialogStyle6 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        TextStyleKt.setTextStyle(recentFilesTextView, attachmentsPickerDialogStyle6.getRecentFilesTextStyle());
        final int i14 = 1;
        streamUiFragmentAttachmentFileBinding.fileManagerImageView.setOnClickListener(new View.OnClickListener(this) { // from class: io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.factory.file.internal.c

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ FileAttachmentFragment f74535x;

            {
                this.f74535x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        FileAttachmentFragment.setupViews$lambda$9$lambda$3(this.f74535x, view);
                        break;
                    case 1:
                        FileAttachmentFragment.setupViews$lambda$9$lambda$4(this.f74535x, view);
                        break;
                    case 2:
                        FileAttachmentFragment.setupViews$lambda$9$lambda$6(this.f74535x, view);
                        break;
                    default:
                        FileAttachmentFragment.setupViews$lambda$9$lambda$8(this.f74535x, view);
                        break;
                }
            }
        });
        TextView textView3 = streamUiFragmentAttachmentFileBinding.audioAccessTextView;
        AttachmentsPickerDialogStyle attachmentsPickerDialogStyle7 = this.style;
        if (attachmentsPickerDialogStyle7 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        textView3.setText(attachmentsPickerDialogStyle7.getAllowAccessToAudioText());
        TextView audioAccessTextView = streamUiFragmentAttachmentFileBinding.audioAccessTextView;
        AbstractC22676k.m65749i(audioAccessTextView, "audioAccessTextView");
        AttachmentsPickerDialogStyle attachmentsPickerDialogStyle8 = this.style;
        if (attachmentsPickerDialogStyle8 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        TextStyleKt.setTextStyle(audioAccessTextView, attachmentsPickerDialogStyle8.getAllowAccessToAudioTextStyle());
        ImageView imageView3 = streamUiFragmentAttachmentFileBinding.audioAccessImageView;
        AttachmentsPickerDialogStyle attachmentsPickerDialogStyle9 = this.style;
        if (attachmentsPickerDialogStyle9 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        imageView3.setImageDrawable(attachmentsPickerDialogStyle9.getAllowAccessToAudioIconDrawable());
        final int i15 = 2;
        streamUiFragmentAttachmentFileBinding.audioAccessImageView.setOnClickListener(new View.OnClickListener(this) { // from class: io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.factory.file.internal.c

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ FileAttachmentFragment f74535x;

            {
                this.f74535x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        FileAttachmentFragment.setupViews$lambda$9$lambda$3(this.f74535x, view);
                        break;
                    case 1:
                        FileAttachmentFragment.setupViews$lambda$9$lambda$4(this.f74535x, view);
                        break;
                    case 2:
                        FileAttachmentFragment.setupViews$lambda$9$lambda$6(this.f74535x, view);
                        break;
                    default:
                        FileAttachmentFragment.setupViews$lambda$9$lambda$8(this.f74535x, view);
                        break;
                }
            }
        });
        TextView visualMediaAccessTextView = streamUiFragmentAttachmentFileBinding.visualMediaAccessTextView;
        AbstractC22676k.m65749i(visualMediaAccessTextView, "visualMediaAccessTextView");
        AttachmentsPickerDialogStyle attachmentsPickerDialogStyle10 = this.style;
        if (attachmentsPickerDialogStyle10 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        TextStyleKt.setTextStyle(visualMediaAccessTextView, attachmentsPickerDialogStyle10.getAllowAccessToVisualMediaTextStyle());
        ImageView imageView4 = streamUiFragmentAttachmentFileBinding.visualMediaAccessImageView;
        AttachmentsPickerDialogStyle attachmentsPickerDialogStyle11 = this.style;
        if (attachmentsPickerDialogStyle11 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        imageView4.setImageDrawable(attachmentsPickerDialogStyle11.getAllowAccessToVisualMediaIconDrawable());
        final int i16 = 3;
        streamUiFragmentAttachmentFileBinding.visualMediaAccessImageView.setOnClickListener(new View.OnClickListener(this) { // from class: io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.factory.file.internal.c

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ FileAttachmentFragment f74535x;

            {
                this.f74535x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        FileAttachmentFragment.setupViews$lambda$9$lambda$3(this.f74535x, view);
                        break;
                    case 1:
                        FileAttachmentFragment.setupViews$lambda$9$lambda$4(this.f74535x, view);
                        break;
                    case 2:
                        FileAttachmentFragment.setupViews$lambda$9$lambda$6(this.f74535x, view);
                        break;
                    default:
                        FileAttachmentFragment.setupViews$lambda$9$lambda$8(this.f74535x, view);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupViews$lambda$9$lambda$3(FileAttachmentFragment fileAttachmentFragment, View view) {
        PermissionChecker permissionChecker = fileAttachmentFragment.permissionChecker;
        StreamUiFragmentAttachmentFileBinding streamUiFragmentAttachmentFileBinding = fileAttachmentFragment._binding;
        AbstractC22676k.m65747g(streamUiFragmentAttachmentFileBinding);
        ConstraintLayout root = streamUiFragmentAttachmentFileBinding.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        permissionChecker.checkFilesPermissions(root, new C19682a(fileAttachmentFragment, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 setupViews$lambda$9$lambda$3$lambda$2(FileAttachmentFragment fileAttachmentFragment, Map it) {
        AbstractC22676k.m65750j(it, "it");
        fileAttachmentFragment.checkPermissions();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupViews$lambda$9$lambda$4(FileAttachmentFragment fileAttachmentFragment, View view) {
        AbstractC21065d abstractC21065d = fileAttachmentFragment.activityResultLauncher;
        if (abstractC21065d != null) {
            abstractC21065d.mo4052a(Boolean.TRUE, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupViews$lambda$9$lambda$6(FileAttachmentFragment fileAttachmentFragment, View view) {
        PermissionChecker permissionChecker = fileAttachmentFragment.permissionChecker;
        StreamUiFragmentAttachmentFileBinding streamUiFragmentAttachmentFileBinding = fileAttachmentFragment._binding;
        AbstractC22676k.m65747g(streamUiFragmentAttachmentFileBinding);
        ConstraintLayout root = streamUiFragmentAttachmentFileBinding.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        permissionChecker.checkAudioPermissions(root, new C19682a(fileAttachmentFragment, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 setupViews$lambda$9$lambda$6$lambda$5(FileAttachmentFragment fileAttachmentFragment, Map it) {
        AbstractC22676k.m65750j(it, "it");
        fileAttachmentFragment.checkPermissions();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupViews$lambda$9$lambda$8(FileAttachmentFragment fileAttachmentFragment, View view) {
        PermissionChecker permissionChecker = fileAttachmentFragment.permissionChecker;
        StreamUiFragmentAttachmentFileBinding streamUiFragmentAttachmentFileBinding = fileAttachmentFragment._binding;
        AbstractC22676k.m65747g(streamUiFragmentAttachmentFileBinding);
        ConstraintLayout root = streamUiFragmentAttachmentFileBinding.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        permissionChecker.checkVisualMediaPermissions(root, new C19682a(fileAttachmentFragment, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 setupViews$lambda$9$lambda$8$lambda$7(FileAttachmentFragment fileAttachmentFragment, Map it) {
        AbstractC22676k.m65750j(it, "it");
        fileAttachmentFragment.checkPermissions();
        return C23454a0.f92919a;
    }

    private final void showGrantPermissionsContainer(boolean show) {
        StreamUiFragmentAttachmentFileBinding streamUiFragmentAttachmentFileBinding = this._binding;
        if (streamUiFragmentAttachmentFileBinding != null) {
            LinearLayout grantPermissionsContainer = streamUiFragmentAttachmentFileBinding.grantPermissionsInclude.grantPermissionsContainer;
            AbstractC22676k.m65749i(grantPermissionsContainer, "grantPermissionsContainer");
            grantPermissionsContainer.setVisibility(show ? 0 : 8);
        }
    }

    private final void showRequestAudioAccessLabel(boolean show) {
        StreamUiFragmentAttachmentFileBinding streamUiFragmentAttachmentFileBinding = this._binding;
        if (streamUiFragmentAttachmentFileBinding != null) {
            TextView audioAccessTextView = streamUiFragmentAttachmentFileBinding.audioAccessTextView;
            AbstractC22676k.m65749i(audioAccessTextView, "audioAccessTextView");
            audioAccessTextView.setVisibility(show ? 0 : 8);
            ImageView audioAccessImageView = streamUiFragmentAttachmentFileBinding.audioAccessImageView;
            AbstractC22676k.m65749i(audioAccessImageView, "audioAccessImageView");
            audioAccessImageView.setVisibility(show ? 0 : 8);
        }
    }

    private final void showRequestVisualMediaAccessLabel(boolean show, boolean hasPartialAccess) {
        String allowAccessToVisualMediaText;
        StreamUiFragmentAttachmentFileBinding streamUiFragmentAttachmentFileBinding = this._binding;
        if (streamUiFragmentAttachmentFileBinding != null) {
            if (hasPartialAccess) {
                AttachmentsPickerDialogStyle attachmentsPickerDialogStyle = this.style;
                if (attachmentsPickerDialogStyle == null) {
                    AbstractC22676k.m65757q("style");
                    throw null;
                }
                allowAccessToVisualMediaText = attachmentsPickerDialogStyle.getAllowAccessToMoreVisualMediaText();
            } else {
                AttachmentsPickerDialogStyle attachmentsPickerDialogStyle2 = this.style;
                if (attachmentsPickerDialogStyle2 == null) {
                    AbstractC22676k.m65757q("style");
                    throw null;
                }
                allowAccessToVisualMediaText = attachmentsPickerDialogStyle2.getAllowAccessToVisualMediaText();
            }
            streamUiFragmentAttachmentFileBinding.visualMediaAccessTextView.setText(allowAccessToVisualMediaText);
            TextView visualMediaAccessTextView = streamUiFragmentAttachmentFileBinding.visualMediaAccessTextView;
            AbstractC22676k.m65749i(visualMediaAccessTextView, "visualMediaAccessTextView");
            visualMediaAccessTextView.setVisibility(show ? 0 : 8);
            ImageView visualMediaAccessImageView = streamUiFragmentAttachmentFileBinding.visualMediaAccessImageView;
            AbstractC22676k.m65749i(visualMediaAccessImageView, "visualMediaAccessImageView");
            visualMediaAccessImageView.setVisibility(show ? 0 : 8);
        }
    }

    public static /* synthetic */ void showRequestVisualMediaAccessLabel$default(FileAttachmentFragment fileAttachmentFragment, boolean z4, boolean z13, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z13 = false;
        }
        fileAttachmentFragment.showRequestVisualMediaAccessLabel(z4, z13);
    }

    private final void updateFileAttachment(AttachmentMetaData attachmentMetaData) {
        if (attachmentMetaData.getIsSelected()) {
            attachmentMetaData.setSelected(false);
            this.selectedAttachments = AbstractC12350b.m34604y(attachmentMetaData, this.selectedAttachments);
            getFileAttachmentsAdapter().deselectAttachment(attachmentMetaData);
        } else {
            attachmentMetaData.setSelected(true);
            this.selectedAttachments = AbstractC12350b.m34555D(attachmentMetaData, this.selectedAttachments);
            getFileAttachmentsAdapter().selectAttachment(attachmentMetaData);
        }
        AttachmentsPickerTabListener attachmentsPickerTabListener = this.attachmentsPickerTabListener;
        if (attachmentsPickerTabListener != null) {
            attachmentsPickerTabListener.onSelectedAttachmentsChanged(AbstractC25265s.m74093D1(this.selectedAttachments));
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
        StreamUiFragmentAttachmentFileBinding streamUiFragmentAttachmentFileBindingInflate = StreamUiFragmentAttachmentFileBinding.inflate(ContextKt.getStreamThemeInflater(contextRequireContext2), container, false);
        this._binding = streamUiFragmentAttachmentFileBindingInflate;
        ConstraintLayout root = streamUiFragmentAttachmentFileBindingInflate.getRoot();
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
    public final void onDetach() {
        super.onDetach();
        this.attachmentsPickerTabListener = null;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onResume() {
        super.onResume();
        if (this.style != null) {
            checkPermissions();
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (this.style != null) {
            setupViews();
            setupResultListener();
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
