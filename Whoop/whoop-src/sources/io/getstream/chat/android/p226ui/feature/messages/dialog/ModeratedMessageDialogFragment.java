package io.getstream.chat.android.p226ui.feature.messages.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.p226ui.common.state.messages.list.DeleteMessage;
import io.getstream.chat.android.p226ui.common.state.messages.list.EditMessage;
import io.getstream.chat.android.p226ui.common.state.messages.list.ModeratedMessageOption;
import io.getstream.chat.android.p226ui.common.state.messages.list.SendAnyway;
import io.getstream.chat.android.p226ui.databinding.StreamUiDialogModeratedMessageBinding;
import io.getstream.chat.android.p226ui.widgets.FullScreenDialogFragment;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t13.ViewOnClickListenerC33312a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 %2\u00020\u0001:\u0002&%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0003J\u0015\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010 R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010!R\u0014\u0010$\u001a\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006'"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/dialog/ModeratedMessageDialogFragment;", "Lio/getstream/chat/android/ui/widgets/FullScreenDialogFragment;", "<init>", "()V", "Ll83/a0;", "setupDialog", "setupDismissalArea", "setupClickListeners", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Lio/getstream/chat/android/ui/feature/messages/dialog/ModeratedMessageDialogFragment$DialogSelectionHandler;", "selectionHandler", "setDialogSelectionHandler", "(Lio/getstream/chat/android/ui/feature/messages/dialog/ModeratedMessageDialogFragment$DialogSelectionHandler;)V", "Lio/getstream/chat/android/models/Message;", "message", "setMessage", "(Lio/getstream/chat/android/models/Message;)V", "Lio/getstream/chat/android/ui/databinding/StreamUiDialogModeratedMessageBinding;", "_binding", "Lio/getstream/chat/android/ui/databinding/StreamUiDialogModeratedMessageBinding;", "Lio/getstream/chat/android/models/Message;", "Lio/getstream/chat/android/ui/feature/messages/dialog/ModeratedMessageDialogFragment$DialogSelectionHandler;", "getBinding", "()Lio/getstream/chat/android/ui/databinding/StreamUiDialogModeratedMessageBinding;", "binding", "Companion", "DialogSelectionHandler", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ModeratedMessageDialogFragment extends FullScreenDialogFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final String TAG = "ModeratedMessageDialog";
    private StreamUiDialogModeratedMessageBinding _binding;
    private Message message;
    private DialogSelectionHandler selectionHandler;

    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/dialog/ModeratedMessageDialogFragment$Companion;", "", "<init>", "()V", "TAG", "", "newInstance", "Lio/getstream/chat/android/ui/feature/messages/dialog/ModeratedMessageDialogFragment;", "message", "Lio/getstream/chat/android/models/Message;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final ModeratedMessageDialogFragment newInstance(Message message) {
            AbstractC22676k.m65750j(message, "message");
            ModeratedMessageDialogFragment moderatedMessageDialogFragment = new ModeratedMessageDialogFragment();
            moderatedMessageDialogFragment.setMessage(message);
            return moderatedMessageDialogFragment;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/dialog/ModeratedMessageDialogFragment$DialogSelectionHandler;", "", "Lio/getstream/chat/android/models/Message;", "message", "Lio/getstream/chat/android/ui/common/state/messages/list/ModeratedMessageOption;", "action", "Ll83/a0;", "onModeratedOptionSelected", "(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/state/messages/list/ModeratedMessageOption;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface DialogSelectionHandler {
        void onModeratedOptionSelected(Message message, ModeratedMessageOption action);
    }

    private final StreamUiDialogModeratedMessageBinding getBinding() {
        StreamUiDialogModeratedMessageBinding streamUiDialogModeratedMessageBinding = this._binding;
        AbstractC22676k.m65747g(streamUiDialogModeratedMessageBinding);
        return streamUiDialogModeratedMessageBinding;
    }

    private final void setupClickListeners() {
        StreamUiDialogModeratedMessageBinding streamUiDialogModeratedMessageBinding = this._binding;
        AbstractC22676k.m65747g(streamUiDialogModeratedMessageBinding);
        streamUiDialogModeratedMessageBinding.sendAnyway.setOnClickListener(new ViewOnClickListenerC33312a(this, 0));
        streamUiDialogModeratedMessageBinding.editMessage.setOnClickListener(new ViewOnClickListenerC33312a(this, 1));
        streamUiDialogModeratedMessageBinding.deleteMessage.setOnClickListener(new ViewOnClickListenerC33312a(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupClickListeners$lambda$4$lambda$1(ModeratedMessageDialogFragment moderatedMessageDialogFragment, View view) {
        DialogSelectionHandler dialogSelectionHandler = moderatedMessageDialogFragment.selectionHandler;
        if (dialogSelectionHandler != null) {
            Message message = moderatedMessageDialogFragment.message;
            if (message == null) {
                AbstractC22676k.m65757q("message");
                throw null;
            }
            dialogSelectionHandler.onModeratedOptionSelected(message, SendAnyway.INSTANCE);
        }
        moderatedMessageDialogFragment.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupClickListeners$lambda$4$lambda$2(ModeratedMessageDialogFragment moderatedMessageDialogFragment, View view) {
        DialogSelectionHandler dialogSelectionHandler = moderatedMessageDialogFragment.selectionHandler;
        if (dialogSelectionHandler != null) {
            Message message = moderatedMessageDialogFragment.message;
            if (message == null) {
                AbstractC22676k.m65757q("message");
                throw null;
            }
            dialogSelectionHandler.onModeratedOptionSelected(message, EditMessage.INSTANCE);
        }
        moderatedMessageDialogFragment.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupClickListeners$lambda$4$lambda$3(ModeratedMessageDialogFragment moderatedMessageDialogFragment, View view) {
        DialogSelectionHandler dialogSelectionHandler = moderatedMessageDialogFragment.selectionHandler;
        if (dialogSelectionHandler != null) {
            Message message = moderatedMessageDialogFragment.message;
            if (message == null) {
                AbstractC22676k.m65757q("message");
                throw null;
            }
            dialogSelectionHandler.onModeratedOptionSelected(message, DeleteMessage.INSTANCE);
        }
        moderatedMessageDialogFragment.dismiss();
    }

    private final void setupDialog() {
        setupDismissalArea();
        setupClickListeners();
    }

    private final void setupDismissalArea() {
        StreamUiDialogModeratedMessageBinding streamUiDialogModeratedMessageBinding = this._binding;
        AbstractC22676k.m65747g(streamUiDialogModeratedMessageBinding);
        streamUiDialogModeratedMessageBinding.container.setOnClickListener(new ViewOnClickListenerC33312a(this, 3));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        StreamUiDialogModeratedMessageBinding streamUiDialogModeratedMessageBindingInflate = StreamUiDialogModeratedMessageBinding.inflate(inflater, container, false);
        this._binding = streamUiDialogModeratedMessageBindingInflate;
        FrameLayout root = streamUiDialogModeratedMessageBindingInflate.getRoot();
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
        if (savedInstanceState != null || this.message == null) {
            dismiss();
        } else {
            setupDialog();
        }
    }

    public final void setDialogSelectionHandler(DialogSelectionHandler selectionHandler) {
        AbstractC22676k.m65750j(selectionHandler, "selectionHandler");
        this.selectionHandler = selectionHandler;
    }

    public final void setMessage(Message message) {
        AbstractC22676k.m65750j(message, "message");
        this.message = message;
    }
}
