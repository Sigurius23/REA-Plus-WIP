package io.getstream.chat.android.p226ui.feature.gallery.options.internal;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import io.getstream.chat.android.p226ui.databinding.StreamUiFragmentAttachmentOptionsBinding;
import io.getstream.chat.android.p226ui.feature.gallery.options.internal.AttachmentGalleryOptionsDialogFragment;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.widgets.FullScreenDialogFragment;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 )2\u00020\u0001:\u0002*)B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0003J\u0015\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u0016J\u0015\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0013¢\u0006\u0004\b\u001c\u0010\u0016J\u0015\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010$R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010$R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010$R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010$R\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010%R\u0014\u0010(\u001a\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006+"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsDialogFragment;", "Lio/getstream/chat/android/ui/widgets/FullScreenDialogFragment;", "<init>", "()V", "Ll83/a0;", "setupDialog", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsDialogFragment$AttachmentOptionHandler;", "showInChatOptionHandler", "setShowInChatOptionHandler", "(Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsDialogFragment$AttachmentOptionHandler;)V", "replyOptionHandler", "setReplyOptionHandler", "deleteOptionHandler", "setDeleteOptionHandler", "saveImageOptionHandler", "setSaveImageOptionHandler", "", "isMessageMine", "setIsMessageMine", "(Z)V", "Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentOptionsBinding;", "_binding", "Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentOptionsBinding;", "Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsDialogFragment$AttachmentOptionHandler;", "Z", "getBinding", "()Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentOptionsBinding;", "binding", "Companion", "AttachmentOptionHandler", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AttachmentGalleryOptionsDialogFragment extends FullScreenDialogFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final String TAG = "AttachmentOptionsDialogFragment";
    private StreamUiFragmentAttachmentOptionsBinding _binding;
    private AttachmentOptionHandler deleteOptionHandler;
    private boolean isMessageMine;
    private AttachmentOptionHandler replyOptionHandler;
    private AttachmentOptionHandler saveImageOptionHandler;
    private AttachmentOptionHandler showInChatOptionHandler;

    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsDialogFragment$AttachmentOptionHandler;", "", "Ll83/a0;", "onAttachmentOptionClick", "()V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface AttachmentOptionHandler {
        void onAttachmentOptionClick();
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsDialogFragment$Companion;", "", "<init>", "()V", "TAG", "", "newInstance", "Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsDialogFragment;", "showInChatOptionHandler", "Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsDialogFragment$AttachmentOptionHandler;", "replyOptionHandler", "deleteOptionHandler", "saveMediaOptionHandler", "isMessageMine", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final AttachmentGalleryOptionsDialogFragment newInstance(AttachmentOptionHandler showInChatOptionHandler, AttachmentOptionHandler replyOptionHandler, AttachmentOptionHandler deleteOptionHandler, AttachmentOptionHandler saveMediaOptionHandler, boolean isMessageMine) {
            AbstractC22676k.m65750j(showInChatOptionHandler, "showInChatOptionHandler");
            AbstractC22676k.m65750j(replyOptionHandler, "replyOptionHandler");
            AbstractC22676k.m65750j(deleteOptionHandler, "deleteOptionHandler");
            AbstractC22676k.m65750j(saveMediaOptionHandler, "saveMediaOptionHandler");
            AttachmentGalleryOptionsDialogFragment attachmentGalleryOptionsDialogFragment = new AttachmentGalleryOptionsDialogFragment();
            attachmentGalleryOptionsDialogFragment.setShowInChatOptionHandler(showInChatOptionHandler);
            attachmentGalleryOptionsDialogFragment.setReplyOptionHandler(replyOptionHandler);
            attachmentGalleryOptionsDialogFragment.setDeleteOptionHandler(deleteOptionHandler);
            attachmentGalleryOptionsDialogFragment.setSaveImageOptionHandler(saveMediaOptionHandler);
            attachmentGalleryOptionsDialogFragment.setIsMessageMine(isMessageMine);
            return attachmentGalleryOptionsDialogFragment;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    private final StreamUiFragmentAttachmentOptionsBinding getBinding() {
        StreamUiFragmentAttachmentOptionsBinding streamUiFragmentAttachmentOptionsBinding = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentAttachmentOptionsBinding);
        return streamUiFragmentAttachmentOptionsBinding;
    }

    private final void setupDialog() {
        StreamUiFragmentAttachmentOptionsBinding streamUiFragmentAttachmentOptionsBinding = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentAttachmentOptionsBinding);
        final int i13 = 0;
        streamUiFragmentAttachmentOptionsBinding.attachmentOptionsMenu.setReplyClickListener(new View.OnClickListener(this) { // from class: r13.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ AttachmentGalleryOptionsDialogFragment f127255x;

            {
                this.f127255x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        AttachmentGalleryOptionsDialogFragment.setupDialog$lambda$1(this.f127255x, view);
                        break;
                    case 1:
                        AttachmentGalleryOptionsDialogFragment.setupDialog$lambda$2(this.f127255x, view);
                        break;
                    case 2:
                        AttachmentGalleryOptionsDialogFragment.setupDialog$lambda$3(this.f127255x, view);
                        break;
                    case 3:
                        AttachmentGalleryOptionsDialogFragment.setupDialog$lambda$4(this.f127255x, view);
                        break;
                    default:
                        this.f127255x.dismiss();
                        break;
                }
            }
        });
        StreamUiFragmentAttachmentOptionsBinding streamUiFragmentAttachmentOptionsBinding2 = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentAttachmentOptionsBinding2);
        final int i14 = 1;
        streamUiFragmentAttachmentOptionsBinding2.attachmentOptionsMenu.setDeleteClickListener(new View.OnClickListener(this) { // from class: r13.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ AttachmentGalleryOptionsDialogFragment f127255x;

            {
                this.f127255x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        AttachmentGalleryOptionsDialogFragment.setupDialog$lambda$1(this.f127255x, view);
                        break;
                    case 1:
                        AttachmentGalleryOptionsDialogFragment.setupDialog$lambda$2(this.f127255x, view);
                        break;
                    case 2:
                        AttachmentGalleryOptionsDialogFragment.setupDialog$lambda$3(this.f127255x, view);
                        break;
                    case 3:
                        AttachmentGalleryOptionsDialogFragment.setupDialog$lambda$4(this.f127255x, view);
                        break;
                    default:
                        this.f127255x.dismiss();
                        break;
                }
            }
        });
        StreamUiFragmentAttachmentOptionsBinding streamUiFragmentAttachmentOptionsBinding3 = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentAttachmentOptionsBinding3);
        final int i15 = 2;
        streamUiFragmentAttachmentOptionsBinding3.attachmentOptionsMenu.setShowInChatClickListener(new View.OnClickListener(this) { // from class: r13.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ AttachmentGalleryOptionsDialogFragment f127255x;

            {
                this.f127255x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        AttachmentGalleryOptionsDialogFragment.setupDialog$lambda$1(this.f127255x, view);
                        break;
                    case 1:
                        AttachmentGalleryOptionsDialogFragment.setupDialog$lambda$2(this.f127255x, view);
                        break;
                    case 2:
                        AttachmentGalleryOptionsDialogFragment.setupDialog$lambda$3(this.f127255x, view);
                        break;
                    case 3:
                        AttachmentGalleryOptionsDialogFragment.setupDialog$lambda$4(this.f127255x, view);
                        break;
                    default:
                        this.f127255x.dismiss();
                        break;
                }
            }
        });
        StreamUiFragmentAttachmentOptionsBinding streamUiFragmentAttachmentOptionsBinding4 = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentAttachmentOptionsBinding4);
        final int i16 = 3;
        streamUiFragmentAttachmentOptionsBinding4.attachmentOptionsMenu.setSaveMediaClickListener(new View.OnClickListener(this) { // from class: r13.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ AttachmentGalleryOptionsDialogFragment f127255x;

            {
                this.f127255x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        AttachmentGalleryOptionsDialogFragment.setupDialog$lambda$1(this.f127255x, view);
                        break;
                    case 1:
                        AttachmentGalleryOptionsDialogFragment.setupDialog$lambda$2(this.f127255x, view);
                        break;
                    case 2:
                        AttachmentGalleryOptionsDialogFragment.setupDialog$lambda$3(this.f127255x, view);
                        break;
                    case 3:
                        AttachmentGalleryOptionsDialogFragment.setupDialog$lambda$4(this.f127255x, view);
                        break;
                    default:
                        this.f127255x.dismiss();
                        break;
                }
            }
        });
        StreamUiFragmentAttachmentOptionsBinding streamUiFragmentAttachmentOptionsBinding5 = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentAttachmentOptionsBinding5);
        streamUiFragmentAttachmentOptionsBinding5.attachmentOptionsMenu.setIsMine(this.isMessageMine);
        StreamUiFragmentAttachmentOptionsBinding streamUiFragmentAttachmentOptionsBinding6 = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentAttachmentOptionsBinding6);
        final int i17 = 4;
        streamUiFragmentAttachmentOptionsBinding6.getRoot().setOnClickListener(new View.OnClickListener(this) { // from class: r13.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ AttachmentGalleryOptionsDialogFragment f127255x;

            {
                this.f127255x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i17) {
                    case 0:
                        AttachmentGalleryOptionsDialogFragment.setupDialog$lambda$1(this.f127255x, view);
                        break;
                    case 1:
                        AttachmentGalleryOptionsDialogFragment.setupDialog$lambda$2(this.f127255x, view);
                        break;
                    case 2:
                        AttachmentGalleryOptionsDialogFragment.setupDialog$lambda$3(this.f127255x, view);
                        break;
                    case 3:
                        AttachmentGalleryOptionsDialogFragment.setupDialog$lambda$4(this.f127255x, view);
                        break;
                    default:
                        this.f127255x.dismiss();
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupDialog$lambda$1(AttachmentGalleryOptionsDialogFragment attachmentGalleryOptionsDialogFragment, View view) {
        AttachmentOptionHandler attachmentOptionHandler = attachmentGalleryOptionsDialogFragment.replyOptionHandler;
        if (attachmentOptionHandler != null) {
            attachmentOptionHandler.onAttachmentOptionClick();
        }
        attachmentGalleryOptionsDialogFragment.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupDialog$lambda$2(AttachmentGalleryOptionsDialogFragment attachmentGalleryOptionsDialogFragment, View view) {
        AttachmentOptionHandler attachmentOptionHandler = attachmentGalleryOptionsDialogFragment.deleteOptionHandler;
        if (attachmentOptionHandler != null) {
            attachmentOptionHandler.onAttachmentOptionClick();
        }
        attachmentGalleryOptionsDialogFragment.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupDialog$lambda$3(AttachmentGalleryOptionsDialogFragment attachmentGalleryOptionsDialogFragment, View view) {
        AttachmentOptionHandler attachmentOptionHandler = attachmentGalleryOptionsDialogFragment.showInChatOptionHandler;
        if (attachmentOptionHandler != null) {
            attachmentOptionHandler.onAttachmentOptionClick();
        }
        attachmentGalleryOptionsDialogFragment.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupDialog$lambda$4(AttachmentGalleryOptionsDialogFragment attachmentGalleryOptionsDialogFragment, View view) {
        AttachmentOptionHandler attachmentOptionHandler = attachmentGalleryOptionsDialogFragment.saveImageOptionHandler;
        if (attachmentOptionHandler != null) {
            attachmentOptionHandler.onAttachmentOptionClick();
        }
        attachmentGalleryOptionsDialogFragment.dismiss();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        Context contextRequireContext = requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        StreamUiFragmentAttachmentOptionsBinding streamUiFragmentAttachmentOptionsBindingInflate = StreamUiFragmentAttachmentOptionsBinding.inflate(ContextKt.getStreamThemeInflater(contextRequireContext), container, false);
        this._binding = streamUiFragmentAttachmentOptionsBindingInflate;
        FrameLayout root = streamUiFragmentAttachmentOptionsBindingInflate.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        boolean z4 = (this.showInChatOptionHandler == null || this.replyOptionHandler == null || this.deleteOptionHandler == null || this.saveImageOptionHandler == null) ? false : true;
        if (savedInstanceState == null && z4) {
            setupDialog();
        } else {
            dismiss();
        }
    }

    public final void setDeleteOptionHandler(AttachmentOptionHandler deleteOptionHandler) {
        AbstractC22676k.m65750j(deleteOptionHandler, "deleteOptionHandler");
        this.deleteOptionHandler = deleteOptionHandler;
    }

    public final void setIsMessageMine(boolean isMessageMine) {
        this.isMessageMine = isMessageMine;
    }

    public final void setReplyOptionHandler(AttachmentOptionHandler replyOptionHandler) {
        AbstractC22676k.m65750j(replyOptionHandler, "replyOptionHandler");
        this.replyOptionHandler = replyOptionHandler;
    }

    public final void setSaveImageOptionHandler(AttachmentOptionHandler saveImageOptionHandler) {
        AbstractC22676k.m65750j(saveImageOptionHandler, "saveImageOptionHandler");
        this.saveImageOptionHandler = saveImageOptionHandler;
    }

    public final void setShowInChatOptionHandler(AttachmentOptionHandler showInChatOptionHandler) {
        AbstractC22676k.m65750j(showInChatOptionHandler, "showInChatOptionHandler");
        this.showInChatOptionHandler = showInChatOptionHandler;
    }
}
