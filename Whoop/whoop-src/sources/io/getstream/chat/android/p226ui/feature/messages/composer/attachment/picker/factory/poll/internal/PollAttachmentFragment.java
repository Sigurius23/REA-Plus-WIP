package io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.poll.internal;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.AbstractC1329o1;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import io.getstream.chat.android.models.CreatePollParams;
import io.getstream.chat.android.p226ui.databinding.StreamUiFragmentAttachmentPollBinding;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.AttachmentsPickerTabListener;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.poll.CreatePollDialogFragment;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0003R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/poll/internal/PollAttachmentFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "Ll83/a0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;", "attachmentsPickerTabListener", "setAttachmentsPickerTabListener", "(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;)V", "onDestroyView", "Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentPollBinding;", "_binding", "Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentPollBinding;", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;", "getBinding", "()Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentPollBinding;", "binding", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class PollAttachmentFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private StreamUiFragmentAttachmentPollBinding _binding;
    private AttachmentsPickerTabListener attachmentsPickerTabListener;

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/poll/internal/PollAttachmentFragment$Companion;", "", "<init>", "()V", "newInstance", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/poll/internal/PollAttachmentFragment;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final PollAttachmentFragment newInstance() {
            return new PollAttachmentFragment();
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    private final StreamUiFragmentAttachmentPollBinding getBinding() {
        StreamUiFragmentAttachmentPollBinding streamUiFragmentAttachmentPollBinding = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentAttachmentPollBinding);
        return streamUiFragmentAttachmentPollBinding;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        Context contextRequireContext = requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        StreamUiFragmentAttachmentPollBinding streamUiFragmentAttachmentPollBindingInflate = StreamUiFragmentAttachmentPollBinding.inflate(ContextKt.getStreamThemeInflater(contextRequireContext), container, false);
        this._binding = streamUiFragmentAttachmentPollBindingInflate;
        ConstraintLayout root = streamUiFragmentAttachmentPollBindingInflate.getRoot();
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
        AbstractC1329o1 fragmentManager = ContextKt.getFragmentManager(getContext());
        if (fragmentManager != null) {
            CreatePollDialogFragment.Companion.newInstance$default(CreatePollDialogFragment.INSTANCE, new CreatePollDialogFragment.CreatePollDialogListener() { // from class: io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.factory.poll.internal.PollAttachmentFragment$onViewCreated$1$1
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

    public final void setAttachmentsPickerTabListener(AttachmentsPickerTabListener attachmentsPickerTabListener) {
        AbstractC22676k.m65750j(attachmentsPickerTabListener, "attachmentsPickerTabListener");
        this.attachmentsPickerTabListener = attachmentsPickerTabListener;
    }
}
