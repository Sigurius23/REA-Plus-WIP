package io.getstream.chat.android.p226ui.feature.gallery.internal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import b30.ViewOnClickListenerC2558k3;
import c93.InterfaceC4339a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import io.getstream.chat.android.p226ui.common.images.internal.StreamImageLoader;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemAttachmentGalleryImageBinding;
import io.getstream.chat.android.p226ui.utils.ImageUtilsKt;
import io.getstream.photoview.PhotoView;
import l83.C23454a0;
import l83.InterfaceC23462h;
import ou1.C28376a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0003R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001a\u001a\u0004\u0018\u00010\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryImagePageFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "Ll83/a0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryImageBinding;", "_binding", "Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryImageBinding;", "", "imageUrl$delegate", "Ll83/h;", "getImageUrl", "()Ljava/lang/String;", "imageUrl", "Lkotlin/Function0;", "imageClickListener", "Lc93/a;", "getBinding", "()Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryImageBinding;", "binding", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AttachmentGalleryImagePageFragment extends AbstractComponentCallbacksC1320m0 {
    private static final String ARG_IMAGE_URL = "image_url";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private StreamUiItemAttachmentGalleryImageBinding _binding;

    /* JADX INFO: renamed from: imageUrl$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h imageUrl = AbstractC30060g.m92088H(new C19662a(this, 0));
    private InterfaceC4339a imageClickListener = new C28376a(7);

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryImagePageFragment$Companion;", "", "<init>", "()V", "", "imageUrl", "Lkotlin/Function0;", "Ll83/a0;", "imageClickListener", "Landroidx/fragment/app/m0;", "create", "(Ljava/lang/String;Lc93/a;)Landroidx/fragment/app/m0;", "ARG_IMAGE_URL", "Ljava/lang/String;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ AbstractComponentCallbacksC1320m0 create$default(Companion companion, String str, InterfaceC4339a interfaceC4339a, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                interfaceC4339a = new C28376a(7);
            }
            return companion.create(str, interfaceC4339a);
        }

        public final AbstractComponentCallbacksC1320m0 create(String imageUrl, InterfaceC4339a imageClickListener) {
            AbstractC22676k.m65750j(imageClickListener, "imageClickListener");
            AttachmentGalleryImagePageFragment attachmentGalleryImagePageFragment = new AttachmentGalleryImagePageFragment();
            Bundle bundle = new Bundle();
            bundle.putString(AttachmentGalleryImagePageFragment.ARG_IMAGE_URL, imageUrl);
            attachmentGalleryImagePageFragment.setArguments(bundle);
            attachmentGalleryImagePageFragment.imageClickListener = imageClickListener;
            return attachmentGalleryImagePageFragment;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: A */
    public static void m55154A(AttachmentGalleryImagePageFragment attachmentGalleryImagePageFragment, View view) {
        attachmentGalleryImagePageFragment.imageClickListener.invoke();
    }

    private final StreamUiItemAttachmentGalleryImageBinding getBinding() {
        StreamUiItemAttachmentGalleryImageBinding streamUiItemAttachmentGalleryImageBinding = this._binding;
        AbstractC22676k.m65747g(streamUiItemAttachmentGalleryImageBinding);
        return streamUiItemAttachmentGalleryImageBinding;
    }

    private final String getImageUrl() {
        return (String) this.imageUrl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 onViewCreated$lambda$6$lambda$3(AttachmentGalleryImagePageFragment attachmentGalleryImagePageFragment) {
        StreamUiItemAttachmentGalleryImageBinding streamUiItemAttachmentGalleryImageBinding = attachmentGalleryImagePageFragment._binding;
        AbstractC22676k.m65747g(streamUiItemAttachmentGalleryImageBinding);
        streamUiItemAttachmentGalleryImageBinding.placeHolderImageView.setVisibility(8);
        StreamUiItemAttachmentGalleryImageBinding streamUiItemAttachmentGalleryImageBinding2 = attachmentGalleryImagePageFragment._binding;
        AbstractC22676k.m65747g(streamUiItemAttachmentGalleryImageBinding2);
        streamUiItemAttachmentGalleryImageBinding2.progressBar.setVisibility(0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 onViewCreated$lambda$6$lambda$4(AttachmentGalleryImagePageFragment attachmentGalleryImagePageFragment) {
        StreamUiItemAttachmentGalleryImageBinding streamUiItemAttachmentGalleryImageBinding = attachmentGalleryImagePageFragment._binding;
        AbstractC22676k.m65747g(streamUiItemAttachmentGalleryImageBinding);
        streamUiItemAttachmentGalleryImageBinding.placeHolderImageView.setVisibility(0);
        StreamUiItemAttachmentGalleryImageBinding streamUiItemAttachmentGalleryImageBinding2 = attachmentGalleryImagePageFragment._binding;
        AbstractC22676k.m65747g(streamUiItemAttachmentGalleryImageBinding2);
        streamUiItemAttachmentGalleryImageBinding2.progressBar.setVisibility(8);
        return C23454a0.f92919a;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        StreamUiItemAttachmentGalleryImageBinding streamUiItemAttachmentGalleryImageBindingInflate = StreamUiItemAttachmentGalleryImageBinding.inflate(inflater, null, false);
        this._binding = streamUiItemAttachmentGalleryImageBindingInflate;
        ConstraintLayout root = streamUiItemAttachmentGalleryImageBindingInflate.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        StreamUiItemAttachmentGalleryImageBinding streamUiItemAttachmentGalleryImageBinding = this._binding;
        AbstractC22676k.m65747g(streamUiItemAttachmentGalleryImageBinding);
        PhotoView photoView = streamUiItemAttachmentGalleryImageBinding.photoView;
        AbstractC22676k.m65747g(photoView);
        ImageUtilsKt.load$default(photoView, getImageUrl(), (Integer) null, (StreamImageLoader.ImageTransformation) null, new C19662a(this, 1), new C19662a(this, 2), 6, (Object) null);
        photoView.setOnClickListener(new ViewOnClickListenerC2558k3(this, 9));
    }
}
