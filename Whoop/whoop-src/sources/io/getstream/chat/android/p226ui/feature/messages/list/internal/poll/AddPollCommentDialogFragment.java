package io.getstream.chat.android.p226ui.feature.messages.list.internal.poll;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Window;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatEditText;
import e93.AbstractC12889b;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.databinding.StreamUiDialogAddPollCommentBinding;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import l83.C23465k;
import p314m.C24835d0;
import p314m.C24844i;
import p314m.DialogInterfaceC24846j;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AddPollCommentDialogFragment;", "Lm/d0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AddPollCommentDialogFragment extends C24835d0 {
    private static final String ARG_INITIAL_TEXT = "arg_initial_text";
    private static final String ARG_MESSAGE_ID = "arg_message_id";
    private static final String ARG_POLL_ID = "arg_poll_id";
    public static final String BUNDLE_KEY_ANSWER = "stream_ui_add_poll_comment_answer";
    public static final String BUNDLE_KEY_MESSAGE_ID = "stream_ui_add_poll_comment_message_id";
    public static final String BUNDLE_KEY_POLL_ID = "stream_ui_add_poll_comment_poll_id";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final String REQUEST_KEY = "stream_ui_add_poll_comment_request";
    public static final String TAG = "AddPollCommentDialogFragment";

    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AddPollCommentDialogFragment$Companion;", "", "<init>", "()V", "TAG", "", "REQUEST_KEY", "BUNDLE_KEY_MESSAGE_ID", "BUNDLE_KEY_POLL_ID", "BUNDLE_KEY_ANSWER", "ARG_MESSAGE_ID", "ARG_POLL_ID", "ARG_INITIAL_TEXT", "newInstance", "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AddPollCommentDialogFragment;", "messageId", "pollId", "initialText", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ AddPollCommentDialogFragment newInstance$default(Companion companion, String str, String str2, String str3, int i13, Object obj) {
            if ((i13 & 4) != 0) {
                str3 = null;
            }
            return companion.newInstance(str, str2, str3);
        }

        public final AddPollCommentDialogFragment newInstance(String messageId, String pollId, String initialText) {
            AbstractC22676k.m65750j(messageId, "messageId");
            AbstractC22676k.m65750j(pollId, "pollId");
            AddPollCommentDialogFragment addPollCommentDialogFragment = new AddPollCommentDialogFragment();
            addPollCommentDialogFragment.setArguments(AbstractC12889b.m36273g(new C23465k(AddPollCommentDialogFragment.ARG_MESSAGE_ID, messageId), new C23465k(AddPollCommentDialogFragment.ARG_POLL_ID, pollId), new C23465k(AddPollCommentDialogFragment.ARG_INITIAL_TEXT, initialText)));
            return addPollCommentDialogFragment;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateDialog$lambda$0(StreamUiDialogAddPollCommentBinding streamUiDialogAddPollCommentBinding, AddPollCommentDialogFragment addPollCommentDialogFragment, String str, String str2, DialogInterface dialogInterface, int i13) {
        String string;
        Editable text = streamUiDialogAddPollCommentBinding.answerInput.getText();
        String string2 = (text == null || (string = text.toString()) == null) ? null : AbstractC39414r.m125869O0(string).toString();
        if (string2 == null) {
            string2 = "";
        }
        if (string2.length() > 0) {
            addPollCommentDialogFragment.getParentFragmentManager().m4168f0(AbstractC12889b.m36273g(new C23465k(BUNDLE_KEY_MESSAGE_ID, str), new C23465k(BUNDLE_KEY_POLL_ID, str2), new C23465k(BUNDLE_KEY_ANSWER, string2)), REQUEST_KEY);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateDialog$lambda$2(DialogInterfaceC24846j dialogInterfaceC24846j, StreamUiDialogAddPollCommentBinding streamUiDialogAddPollCommentBinding, DialogInterface dialogInterface) {
        String string;
        String string2;
        final Button button = dialogInterfaceC24846j.f97334F.f97305i;
        Editable text = streamUiDialogAddPollCommentBinding.answerInput.getText();
        boolean z4 = false;
        if (text != null && (string = text.toString()) != null && (string2 = AbstractC39414r.m125869O0(string).toString()) != null && string2.length() > 0) {
            z4 = true;
        }
        button.setEnabled(z4);
        AppCompatEditText answerInput = streamUiDialogAddPollCommentBinding.answerInput;
        AbstractC22676k.m65749i(answerInput, "answerInput");
        answerInput.addTextChangedListener(new TextWatcher() { // from class: io.getstream.chat.android.ui.feature.messages.list.internal.poll.AddPollCommentDialogFragment$onCreateDialog$lambda$2$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable s13) {
                String string3;
                String string4;
                Button button2 = button;
                boolean z13 = false;
                if (s13 != null && (string3 = s13.toString()) != null && (string4 = AbstractC39414r.m125869O0(string3).toString()) != null && string4.length() > 0) {
                    z13 = true;
                }
                button2.setEnabled(z13);
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence text2, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence text2, int start, int before, int count) {
            }
        });
        streamUiDialogAddPollCommentBinding.answerInput.requestFocus();
        Window window = dialogInterfaceC24846j.getWindow();
        if (window != null) {
            window.setSoftInputMode(5);
        }
    }

    @Override // p314m.C24835d0, androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y
    public final Dialog onCreateDialog(Bundle savedInstanceState) {
        Bundle bundleRequireArguments = requireArguments();
        AbstractC22676k.m65749i(bundleRequireArguments, "requireArguments(...)");
        final String string = bundleRequireArguments.getString(ARG_MESSAGE_ID);
        if (string == null) {
            throw new IllegalStateException("Message ID not found in arguments");
        }
        final String string2 = bundleRequireArguments.getString(ARG_POLL_ID);
        if (string2 == null) {
            throw new IllegalStateException("Poll ID not found in arguments");
        }
        String string3 = bundleRequireArguments.getString(ARG_INITIAL_TEXT);
        Context contextRequireContext = requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        final StreamUiDialogAddPollCommentBinding streamUiDialogAddPollCommentBindingInflate = StreamUiDialogAddPollCommentBinding.inflate(ContextKt.getStreamThemeInflater(contextRequireContext), null, false);
        if (savedInstanceState == null && string3 != null && string3.length() != 0) {
            streamUiDialogAddPollCommentBindingInflate.answerInput.setText(string3);
            streamUiDialogAddPollCommentBindingInflate.answerInput.setSelection(string3.length());
        }
        int i13 = (string3 == null || string3.length() == 0) ? C19469R.string.stream_ui_poll_add_a_comment_label : C19469R.string.stream_ui_poll_update_comment_label;
        Context contextRequireContext2 = requireContext();
        AbstractC22676k.m65749i(contextRequireContext2, "requireContext(...)");
        C24844i c24844i = new C24844i(ContextKt.createStreamThemeWrapper(contextRequireContext2));
        c24844i.m72849b(i13);
        DialogInterfaceC24846j dialogInterfaceC24846jCreate = c24844i.setView(streamUiDialogAddPollCommentBindingInflate.getRoot()).setPositiveButton(C19469R.string.stream_ui_poll_add_comment_dialog_submit, new DialogInterface.OnClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.internal.poll.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i14) {
                AddPollCommentDialogFragment.onCreateDialog$lambda$0(streamUiDialogAddPollCommentBindingInflate, this, string, string2, dialogInterface, i14);
            }
        }).setNegativeButton(C19469R.string.stream_ui_poll_add_comment_dialog_cancel, null).create();
        AbstractC22676k.m65749i(dialogInterfaceC24846jCreate, "create(...)");
        dialogInterfaceC24846jCreate.setOnShowListener(new DialogInterfaceOnShowListenerC19853b(dialogInterfaceC24846jCreate, streamUiDialogAddPollCommentBindingInflate, 0));
        return dialogInterfaceC24846jCreate;
    }
}
