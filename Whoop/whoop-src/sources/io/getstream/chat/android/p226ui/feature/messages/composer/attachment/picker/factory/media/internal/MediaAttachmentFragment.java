package io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.media.internal;

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
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.AbstractC1613o1;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b30.ViewOnClickListenerC2558k3;
import bc3.AbstractC3006f0;
import bc3.AbstractC3076z;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import io.getstream.chat.android.core.internal.coroutines.DispatcherProvider;
import io.getstream.chat.android.p226ui.common.helper.internal.AttachmentStorageHelper;
import io.getstream.chat.android.p226ui.common.permissions.VisualMediaAccess;
import io.getstream.chat.android.p226ui.common.permissions.VisualMediaAccessKt;
import io.getstream.chat.android.p226ui.common.state.messages.composer.AttachmentMetaData;
import io.getstream.chat.android.p226ui.databinding.StreamUiAttachmentPermissionViewBinding;
import io.getstream.chat.android.p226ui.databinding.StreamUiFragmentAttachmentMediaBinding;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.AttachmentsPickerDialogStyle;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.AttachmentsPickerTabListener;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.file.internal.C19683b;
import io.getstream.chat.android.p226ui.font.TextStyleKt;
import io.getstream.chat.android.p226ui.utils.PermissionChecker;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.widgets.GridSpacingItemDecoration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l83.C23454a0;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25235a0;
import p098dt.AbstractC12350b;
import p505ts.AbstractC34132o;
import p708hb2.C17095c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\b\b\u0000\u0018\u0000 K2\u00020\u0001:\u0001KB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u0003J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0004H\u0016¢\u0006\u0004\b#\u0010\u0003J\u000f\u0010$\u001a\u00020\u0004H\u0016¢\u0006\u0004\b$\u0010\u0003J\u000f\u0010%\u001a\u00020\u0004H\u0016¢\u0006\u0004\b%\u0010\u0003J\u0015\u0010(\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0015\u0010,\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010=R\u001b\u0010C\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001c\u0010E\u001a\b\u0012\u0004\u0012\u00020\u000f0D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010GR\u0014\u0010J\u001a\u00020.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006L"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Ll83/a0;", "setupViews", "checkPermissions", "requestPermissions", "Lio/getstream/chat/android/ui/common/permissions/VisualMediaAccess;", "access", "handleVisualMediaAccessState", "(Lio/getstream/chat/android/ui/common/permissions/VisualMediaAccess;)V", "onPermissionGranted", "onPermissionPartiallyGranted", "onPermissionDenied", "Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;", "attachmentMetaData", "updateMediaAttachment", "(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;)V", "", "allowAddMore", "populateAttachments", "(Z)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "onDestroyView", "onDetach", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;", "attachmentsPickerTabListener", "setAttachmentsPickerTabListener", "(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;)V", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;", "style", "setStyle", "(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;)V", "Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentMediaBinding;", "_binding", "Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentMediaBinding;", "Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;", "attachmentStorageHelper", "Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;", "Lio/getstream/chat/android/ui/utils/PermissionChecker;", "permissionChecker", "Lio/getstream/chat/android/ui/utils/PermissionChecker;", "Landroidx/recyclerview/widget/GridLayoutManager;", "gridLayoutManager", "Landroidx/recyclerview/widget/GridLayoutManager;", "Lio/getstream/chat/android/ui/widgets/GridSpacingItemDecoration;", "gridSpacingItemDecoration", "Lio/getstream/chat/android/ui/widgets/GridSpacingItemDecoration;", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter;", "mediaAttachmentsAdapter$delegate", "Ll83/h;", "getMediaAttachmentsAdapter", "()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter;", "mediaAttachmentsAdapter", "", "selectedAttachments", "Ljava/util/Set;", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;", "getBinding", "()Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentMediaBinding;", "binding", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MediaAttachmentFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final int SPACING = 2;
    private static final int SPAN_COUNT = 3;
    private StreamUiFragmentAttachmentMediaBinding _binding;
    private AttachmentStorageHelper attachmentStorageHelper;
    private AttachmentsPickerTabListener attachmentsPickerTabListener;
    private final GridLayoutManager gridLayoutManager;
    private final GridSpacingItemDecoration gridSpacingItemDecoration;

    /* JADX INFO: renamed from: mediaAttachmentsAdapter$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h mediaAttachmentsAdapter;
    private final PermissionChecker permissionChecker = new PermissionChecker();
    private Set<AttachmentMetaData> selectedAttachments;
    private AttachmentsPickerDialogStyle style;

    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment$Companion;", "", "<init>", "()V", "newInstance", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment;", "style", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;", "SPAN_COUNT", "", "SPACING", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final MediaAttachmentFragment newInstance(AttachmentsPickerDialogStyle style) {
            AbstractC22676k.m65750j(style, "style");
            MediaAttachmentFragment mediaAttachmentFragment = new MediaAttachmentFragment();
            mediaAttachmentFragment.setStyle(style);
            return mediaAttachmentFragment;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VisualMediaAccess.values().length];
            try {
                iArr[VisualMediaAccess.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VisualMediaAccess.PARTIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VisualMediaAccess.DENIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.factory.media.internal.MediaAttachmentFragment$populateAttachments$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.factory.media.internal.MediaAttachmentFragment$populateAttachments$1", m100430f = "MediaAttachmentFragment.kt", m100431l = {198}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C196851 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ boolean $allowAddMore;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C196851(boolean z4, InterfaceC30057d<? super C196851> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$allowAddMore = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return MediaAttachmentFragment.this.new C196851(this.$allowAddMore, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C196851) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                ProgressBar progressBar = MediaAttachmentFragment.access$getBinding(MediaAttachmentFragment.this).progressBar;
                AbstractC22676k.m65749i(progressBar, "progressBar");
                progressBar.setVisibility(0);
                AbstractC3076z io3 = DispatcherProvider.INSTANCE.getIO();
                C19686x53f4bf48 c19686x53f4bf48 = new C19686x53f4bf48(MediaAttachmentFragment.this, null);
                this.label = 1;
                obj = AbstractC3006f0.m8705K(io3, c19686x53f4bf48, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            List list = (List) obj;
            if (list.isEmpty()) {
                TextView emptyPlaceholderTextView = MediaAttachmentFragment.access$getBinding(MediaAttachmentFragment.this).emptyPlaceholderTextView;
                AbstractC22676k.m65749i(emptyPlaceholderTextView, "emptyPlaceholderTextView");
                AttachmentsPickerDialogStyle attachmentsPickerDialogStyle = MediaAttachmentFragment.this.style;
                if (attachmentsPickerDialogStyle == null) {
                    AbstractC22676k.m65757q("style");
                    throw null;
                }
                TextStyleKt.setTextStyle(emptyPlaceholderTextView, attachmentsPickerDialogStyle.getMediaAttachmentNoMediaTextStyle());
                TextView textView = MediaAttachmentFragment.access$getBinding(MediaAttachmentFragment.this).emptyPlaceholderTextView;
                AttachmentsPickerDialogStyle attachmentsPickerDialogStyle2 = MediaAttachmentFragment.this.style;
                if (attachmentsPickerDialogStyle2 == null) {
                    AbstractC22676k.m65757q("style");
                    throw null;
                }
                textView.setText(attachmentsPickerDialogStyle2.getMediaAttachmentNoMediaText());
                TextView emptyPlaceholderTextView2 = MediaAttachmentFragment.access$getBinding(MediaAttachmentFragment.this).emptyPlaceholderTextView;
                AbstractC22676k.m65749i(emptyPlaceholderTextView2, "emptyPlaceholderTextView");
                emptyPlaceholderTextView2.setVisibility(0);
            } else {
                List list2 = list;
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new MediaAttachmentListItem.MediaAttachmentItem((AttachmentMetaData) it.next()));
                }
                if (this.$allowAddMore) {
                    arrayList = AbstractC25265s.m74129g1(AbstractC37056f.m118958J(MediaAttachmentListItem.AddMoreItem.INSTANCE), arrayList);
                }
                MediaAttachmentFragment.this.getMediaAttachmentsAdapter().setItems(arrayList);
            }
            ProgressBar progressBar2 = MediaAttachmentFragment.access$getBinding(MediaAttachmentFragment.this).progressBar;
            AbstractC22676k.m65749i(progressBar2, "progressBar");
            progressBar2.setVisibility(8);
            return C23454a0.f92919a;
        }
    }

    public MediaAttachmentFragment() {
        getContext();
        this.gridLayoutManager = new GridLayoutManager(3, 0);
        this.gridSpacingItemDecoration = new GridSpacingItemDecoration(3, 2, false);
        this.mediaAttachmentsAdapter = AbstractC30060g.m92088H(new C19683b(this, 1));
        this.selectedAttachments = C25235a0.f99113w;
    }

    public static final StreamUiFragmentAttachmentMediaBinding access$getBinding(MediaAttachmentFragment mediaAttachmentFragment) {
        StreamUiFragmentAttachmentMediaBinding streamUiFragmentAttachmentMediaBinding = mediaAttachmentFragment._binding;
        AbstractC22676k.m65747g(streamUiFragmentAttachmentMediaBinding);
        return streamUiFragmentAttachmentMediaBinding;
    }

    private final void checkPermissions() {
        Context contextRequireContext = requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        handleVisualMediaAccessState(VisualMediaAccessKt.resolveVisualMediaAccessState(contextRequireContext));
    }

    private final StreamUiFragmentAttachmentMediaBinding getBinding() {
        StreamUiFragmentAttachmentMediaBinding streamUiFragmentAttachmentMediaBinding = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentAttachmentMediaBinding);
        return streamUiFragmentAttachmentMediaBinding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MediaAttachmentAdapter getMediaAttachmentsAdapter() {
        return (MediaAttachmentAdapter) this.mediaAttachmentsAdapter.getValue();
    }

    private final void handleVisualMediaAccessState(VisualMediaAccess access) {
        int i13 = WhenMappings.$EnumSwitchMapping$0[access.ordinal()];
        if (i13 == 1) {
            onPermissionGranted();
        } else if (i13 == 2) {
            onPermissionPartiallyGranted();
        } else {
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            onPermissionDenied();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MediaAttachmentAdapter mediaAttachmentsAdapter_delegate$lambda$0(MediaAttachmentFragment mediaAttachmentFragment) {
        AttachmentsPickerDialogStyle attachmentsPickerDialogStyle = mediaAttachmentFragment.style;
        if (attachmentsPickerDialogStyle != null) {
            return new MediaAttachmentAdapter(attachmentsPickerDialogStyle, new MediaAttachmentFragment$mediaAttachmentsAdapter$2$1(mediaAttachmentFragment), new MediaAttachmentFragment$mediaAttachmentsAdapter$2$2(mediaAttachmentFragment));
        }
        AbstractC22676k.m65757q("style");
        throw null;
    }

    private final void onPermissionDenied() {
        StreamUiFragmentAttachmentMediaBinding streamUiFragmentAttachmentMediaBinding = this._binding;
        if (streamUiFragmentAttachmentMediaBinding != null) {
            LinearLayout grantPermissionsContainer = streamUiFragmentAttachmentMediaBinding.grantPermissionsInclude.grantPermissionsContainer;
            AbstractC22676k.m65749i(grantPermissionsContainer, "grantPermissionsContainer");
            grantPermissionsContainer.setVisibility(0);
        }
    }

    private final void onPermissionGranted() {
        StreamUiFragmentAttachmentMediaBinding streamUiFragmentAttachmentMediaBinding = this._binding;
        if (streamUiFragmentAttachmentMediaBinding != null) {
            LinearLayout grantPermissionsContainer = streamUiFragmentAttachmentMediaBinding.grantPermissionsInclude.grantPermissionsContainer;
            AbstractC22676k.m65749i(grantPermissionsContainer, "grantPermissionsContainer");
            grantPermissionsContainer.setVisibility(8);
            populateAttachments(false);
        }
    }

    private final void onPermissionPartiallyGranted() {
        StreamUiFragmentAttachmentMediaBinding streamUiFragmentAttachmentMediaBinding = this._binding;
        if (streamUiFragmentAttachmentMediaBinding != null) {
            LinearLayout grantPermissionsContainer = streamUiFragmentAttachmentMediaBinding.grantPermissionsInclude.grantPermissionsContainer;
            AbstractC22676k.m65749i(grantPermissionsContainer, "grantPermissionsContainer");
            grantPermissionsContainer.setVisibility(8);
            populateAttachments(true);
        }
    }

    private final void populateAttachments(boolean allowAddMore) {
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(this), DispatcherProvider.INSTANCE.getMain(), null, new C196851(allowAddMore, null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestPermissions() {
        PermissionChecker permissionChecker = this.permissionChecker;
        StreamUiFragmentAttachmentMediaBinding streamUiFragmentAttachmentMediaBinding = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentAttachmentMediaBinding);
        ConstraintLayout root = streamUiFragmentAttachmentMediaBinding.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        permissionChecker.checkVisualMediaPermissions(root, new C17095c(this, 24));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 requestPermissions$lambda$4(MediaAttachmentFragment mediaAttachmentFragment, Map map) {
        AbstractC22676k.m65750j(map, "<unused var>");
        Context contextRequireContext = mediaAttachmentFragment.requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        mediaAttachmentFragment.handleVisualMediaAccessState(VisualMediaAccessKt.resolveVisualMediaAccessState(contextRequireContext));
        return C23454a0.f92919a;
    }

    private final void setupViews() {
        StreamUiFragmentAttachmentMediaBinding streamUiFragmentAttachmentMediaBinding = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentAttachmentMediaBinding);
        RecyclerView recyclerView = streamUiFragmentAttachmentMediaBinding.mediaFileRecyclerView;
        recyclerView.setLayoutManager(this.gridLayoutManager);
        recyclerView.addItemDecoration(this.gridSpacingItemDecoration, -1);
        recyclerView.setAdapter(getMediaAttachmentsAdapter());
        StreamUiFragmentAttachmentMediaBinding streamUiFragmentAttachmentMediaBinding2 = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentAttachmentMediaBinding2);
        StreamUiAttachmentPermissionViewBinding streamUiAttachmentPermissionViewBinding = streamUiFragmentAttachmentMediaBinding2.grantPermissionsInclude;
        ImageView imageView = streamUiAttachmentPermissionViewBinding.grantPermissionsImageView;
        AttachmentsPickerDialogStyle attachmentsPickerDialogStyle = this.style;
        if (attachmentsPickerDialogStyle == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        imageView.setImageDrawable(attachmentsPickerDialogStyle.getAllowAccessToMediaIconDrawable());
        TextView textView = streamUiAttachmentPermissionViewBinding.grantPermissionsTextView;
        AttachmentsPickerDialogStyle attachmentsPickerDialogStyle2 = this.style;
        if (attachmentsPickerDialogStyle2 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        textView.setText(attachmentsPickerDialogStyle2.getAllowAccessToMediaButtonText());
        TextView grantPermissionsTextView = streamUiAttachmentPermissionViewBinding.grantPermissionsTextView;
        AbstractC22676k.m65749i(grantPermissionsTextView, "grantPermissionsTextView");
        AttachmentsPickerDialogStyle attachmentsPickerDialogStyle3 = this.style;
        if (attachmentsPickerDialogStyle3 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        TextStyleKt.setTextStyle(grantPermissionsTextView, attachmentsPickerDialogStyle3.getAllowAccessButtonTextStyle());
        streamUiAttachmentPermissionViewBinding.grantPermissionsTextView.setOnClickListener(new ViewOnClickListenerC2558k3(this, 19));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateMediaAttachment(AttachmentMetaData attachmentMetaData) {
        if (attachmentMetaData.getIsSelected()) {
            attachmentMetaData.setSelected(false);
            this.selectedAttachments = AbstractC12350b.m34604y(attachmentMetaData, this.selectedAttachments);
            getMediaAttachmentsAdapter().deselectAttachment(attachmentMetaData);
        } else {
            attachmentMetaData.setSelected(true);
            this.selectedAttachments = AbstractC12350b.m34555D(attachmentMetaData, this.selectedAttachments);
            getMediaAttachmentsAdapter().selectAttachment(attachmentMetaData);
        }
        AttachmentsPickerTabListener attachmentsPickerTabListener = this.attachmentsPickerTabListener;
        if (attachmentsPickerTabListener != null) {
            attachmentsPickerTabListener.onSelectedAttachmentsChanged(AbstractC25265s.m74093D1(this.selectedAttachments));
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m55261y(MediaAttachmentFragment mediaAttachmentFragment) {
        mediaAttachmentFragment.requestPermissions();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        Context contextRequireContext = requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        this.attachmentStorageHelper = new AttachmentStorageHelper(contextRequireContext, null, null, 6, null);
        Context contextRequireContext2 = requireContext();
        AbstractC22676k.m65749i(contextRequireContext2, "requireContext(...)");
        StreamUiFragmentAttachmentMediaBinding streamUiFragmentAttachmentMediaBindingInflate = StreamUiFragmentAttachmentMediaBinding.inflate(ContextKt.getStreamThemeInflater(contextRequireContext2), container, false);
        this._binding = streamUiFragmentAttachmentMediaBindingInflate;
        ConstraintLayout root = streamUiFragmentAttachmentMediaBindingInflate.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onDestroyView() {
        super.onDestroyView();
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
