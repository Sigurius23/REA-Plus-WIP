package io.getstream.chat.android.p226ui.feature.messages.list.internal.poll;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.Window;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatEditText;
import e93.AbstractC12889b;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.ChatUI;
import io.getstream.chat.android.p226ui.databinding.StreamUiDialogSuggestPollOptionBinding;
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
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/SuggestPollOptionDialogFragment;", "Lm/d0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "", "getPollId", "()Ljava/lang/String;", "pollId", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class SuggestPollOptionDialogFragment extends C24835d0 {
    private static final String ARG_POLL_ID = "arg_poll_id";
    public static final String BUNDLE_KEY_OPTION_TEXT = "stream_ui_suggest_poll_option_text";
    public static final String BUNDLE_KEY_POLL_ID = "stream_ui_suggest_poll_option_poll_id";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final String REQUEST_KEY = "stream_ui_suggest_poll_option_request";
    public static final String TAG = "SuggestPollOptionDialogFragment";

    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/SuggestPollOptionDialogFragment$Companion;", "", "<init>", "()V", "TAG", "", "REQUEST_KEY", "BUNDLE_KEY_POLL_ID", "BUNDLE_KEY_OPTION_TEXT", "ARG_POLL_ID", "newInstance", "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/SuggestPollOptionDialogFragment;", "pollId", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final SuggestPollOptionDialogFragment newInstance(String pollId) {
            AbstractC22676k.m65750j(pollId, "pollId");
            SuggestPollOptionDialogFragment suggestPollOptionDialogFragment = new SuggestPollOptionDialogFragment();
            suggestPollOptionDialogFragment.setArguments(AbstractC12889b.m36273g(new C23465k(SuggestPollOptionDialogFragment.ARG_POLL_ID, pollId)));
            return suggestPollOptionDialogFragment;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    private final String getPollId() {
        String string = requireArguments().getString(ARG_POLL_ID);
        if (string != null) {
            return string;
        }
        throw new IllegalStateException("Poll ID not found in arguments");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateDialog$lambda$1(StreamUiDialogSuggestPollOptionBinding streamUiDialogSuggestPollOptionBinding, SuggestPollOptionDialogFragment suggestPollOptionDialogFragment, DialogInterface dialogInterface, int i13) {
        Editable text = streamUiDialogSuggestPollOptionBinding.optionInput.getText();
        String string = text != null ? text.toString() : null;
        if (string == null) {
            string = "";
        }
        if (AbstractC39414r.m125890i0(string)) {
            return;
        }
        suggestPollOptionDialogFragment.getParentFragmentManager().m4168f0(AbstractC12889b.m36273g(new C23465k(BUNDLE_KEY_POLL_ID, suggestPollOptionDialogFragment.getPollId()), new C23465k(BUNDLE_KEY_OPTION_TEXT, string)), REQUEST_KEY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateDialog$lambda$3(DialogInterfaceC24846j dialogInterfaceC24846j, StreamUiDialogSuggestPollOptionBinding streamUiDialogSuggestPollOptionBinding, DialogInterface dialogInterface) {
        String string;
        final Button button = dialogInterfaceC24846j.f97334F.f97305i;
        Editable text = streamUiDialogSuggestPollOptionBinding.optionInput.getText();
        boolean z4 = false;
        if (text != null && (string = text.toString()) != null && (!AbstractC39414r.m125890i0(string))) {
            z4 = true;
        }
        button.setEnabled(z4);
        AppCompatEditText optionInput = streamUiDialogSuggestPollOptionBinding.optionInput;
        AbstractC22676k.m65749i(optionInput, "optionInput");
        optionInput.addTextChangedListener(new TextWatcher() { // from class: io.getstream.chat.android.ui.feature.messages.list.internal.poll.SuggestPollOptionDialogFragment$onCreateDialog$lambda$3$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable s13) {
                String string2;
                Button button2 = button;
                boolean z13 = false;
                if (s13 != null && (string2 = s13.toString()) != null && (!AbstractC39414r.m125890i0(string2))) {
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
        streamUiDialogSuggestPollOptionBinding.optionInput.requestFocus();
        Window window = dialogInterfaceC24846j.getWindow();
        if (window != null) {
            window.setSoftInputMode(5);
        }
    }

    @Override // p314m.C24835d0, androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y
    public final Dialog onCreateDialog(Bundle savedInstanceState) {
        Context contextRequireContext = requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        final StreamUiDialogSuggestPollOptionBinding streamUiDialogSuggestPollOptionBindingInflate = StreamUiDialogSuggestPollOptionBinding.inflate(ContextKt.getStreamThemeInflater(contextRequireContext), null, false);
        Integer optionTextLimit = ChatUI.getPollsConfig().getOptionTextLimit();
        if (optionTextLimit != null) {
            streamUiDialogSuggestPollOptionBindingInflate.optionInput.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(optionTextLimit.intValue())});
        }
        Context contextRequireContext2 = requireContext();
        AbstractC22676k.m65749i(contextRequireContext2, "requireContext(...)");
        C24844i c24844i = new C24844i(ContextKt.createStreamThemeWrapper(contextRequireContext2));
        c24844i.m72849b(C19469R.string.stream_ui_poll_suggest_option_dialog_title);
        DialogInterfaceC24846j dialogInterfaceC24846jCreate = c24844i.setView(streamUiDialogSuggestPollOptionBindingInflate.getRoot()).setPositiveButton(C19469R.string.stream_ui_poll_suggest_option_dialog_submit, new DialogInterface.OnClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.internal.poll.h
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i13) {
                SuggestPollOptionDialogFragment.onCreateDialog$lambda$1(streamUiDialogSuggestPollOptionBindingInflate, this, dialogInterface, i13);
            }
        }).setNegativeButton(C19469R.string.stream_ui_poll_suggest_option_dialog_cancel, null).create();
        AbstractC22676k.m65749i(dialogInterfaceC24846jCreate, "create(...)");
        dialogInterfaceC24846jCreate.setOnShowListener(new DialogInterfaceOnShowListenerC19853b(dialogInterfaceC24846jCreate, streamUiDialogSuggestPollOptionBindingInflate, 1));
        return dialogInterfaceC24846jCreate;
    }
}
