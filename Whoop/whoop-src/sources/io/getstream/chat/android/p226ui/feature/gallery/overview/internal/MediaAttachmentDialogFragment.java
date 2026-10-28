package io.getstream.chat.android.p226ui.feature.gallery.overview.internal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.C1643y1;
import b30.ViewOnClickListenerC2558k3;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hn.C17508p;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.common.utils.extensions.C19616a;
import io.getstream.chat.android.p226ui.databinding.StreamUiDialogMediaAttachmentBinding;
import io.getstream.chat.android.p226ui.feature.gallery.internal.AttachmentGalleryViewModel;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p404pq.C29464l;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 '2\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0003J!\u0010\u0017\u001a\u00020\u00112\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006("}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentDialogFragment;", "Lpq/l;", "<init>", "()V", "", "getTheme", "()I", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "Ll83/a0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Lkotlin/Function1;", "listener", "setMediaClickListener", "(Lkotlin/jvm/functions/Function1;)V", "Lio/getstream/chat/android/ui/databinding/StreamUiDialogMediaAttachmentBinding;", "_binding", "Lio/getstream/chat/android/ui/databinding/StreamUiDialogMediaAttachmentBinding;", "Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryViewModel;", "viewModel$delegate", "Ll83/h;", "getViewModel", "()Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryViewModel;", "viewModel", "mediaClickListener", "Lkotlin/jvm/functions/Function1;", "getBinding", "()Lio/getstream/chat/android/ui/databinding/StreamUiDialogMediaAttachmentBinding;", "binding", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MediaAttachmentDialogFragment extends C29464l {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private StreamUiDialogMediaAttachmentBinding _binding;
    private Function1 mediaClickListener;

    /* JADX INFO: renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel;

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentDialogFragment$Companion;", "", "<init>", "()V", "newInstance", "Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentDialogFragment;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final MediaAttachmentDialogFragment newInstance() {
            return new MediaAttachmentDialogFragment();
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public MediaAttachmentDialogFragment() {
        InterfaceC23462h interfaceC23462hM92087G = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C19666x1bd271e7(new C19665x1bd271e6(this)));
        this.viewModel = new C1643y1(AbstractC22671h0.f89337a.getOrCreateKotlinClass(AttachmentGalleryViewModel.class), new C19667x1bd271e8(interfaceC23462hM92087G), new C19669x1bd271ea(this, interfaceC23462hM92087G), new C19668x1bd271e9(null, interfaceC23462hM92087G));
        this.mediaClickListener = new C19616a(12);
    }

    /* JADX INFO: renamed from: A */
    public static void m55172A(MediaAttachmentDialogFragment mediaAttachmentDialogFragment, int i13) {
        mediaAttachmentDialogFragment.mediaClickListener.invoke(Integer.valueOf(i13));
    }

    private final StreamUiDialogMediaAttachmentBinding getBinding() {
        StreamUiDialogMediaAttachmentBinding streamUiDialogMediaAttachmentBinding = this._binding;
        AbstractC22676k.m65747g(streamUiDialogMediaAttachmentBinding);
        return streamUiDialogMediaAttachmentBinding;
    }

    private final AttachmentGalleryViewModel getViewModel() {
        return (AttachmentGalleryViewModel) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y
    public final int getTheme() {
        return C19469R.style.StreamUiBottomSheetDialogTheme;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        StreamUiDialogMediaAttachmentBinding streamUiDialogMediaAttachmentBindingInflate = StreamUiDialogMediaAttachmentBinding.inflate(inflater, container, false);
        this._binding = streamUiDialogMediaAttachmentBindingInflate;
        LinearLayout root = streamUiDialogMediaAttachmentBindingInflate.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onDestroyView() {
        this._binding = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        StreamUiDialogMediaAttachmentBinding streamUiDialogMediaAttachmentBinding = this._binding;
        AbstractC22676k.m65747g(streamUiDialogMediaAttachmentBinding);
        streamUiDialogMediaAttachmentBinding.closeButton.setOnClickListener(new ViewOnClickListenerC2558k3(this, 12));
        streamUiDialogMediaAttachmentBinding.mediaAttachmentGridView.setMediaClickListener(new C17508p(this, 7));
        getViewModel().getAttachmentGalleryItemsLiveData().observe(getViewLifecycleOwner(), new MediaAttachmentDialogFragment$sam$androidx_lifecycle_Observer$0(new MediaAttachmentDialogFragment$onViewCreated$1$3(streamUiDialogMediaAttachmentBinding.mediaAttachmentGridView)));
    }

    public final void setMediaClickListener(Function1 listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.mediaClickListener = listener;
    }
}
