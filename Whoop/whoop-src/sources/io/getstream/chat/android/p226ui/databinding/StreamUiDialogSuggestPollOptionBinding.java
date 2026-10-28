package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatEditText;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiDialogSuggestPollOptionBinding implements InterfaceC13008a {
    public final AppCompatEditText optionInput;
    private final FrameLayout rootView;

    private StreamUiDialogSuggestPollOptionBinding(FrameLayout frameLayout, AppCompatEditText appCompatEditText) {
        this.rootView = frameLayout;
        this.optionInput = appCompatEditText;
    }

    public static StreamUiDialogSuggestPollOptionBinding bind(View view) {
        int i13 = C19469R.id.optionInput;
        AppCompatEditText appCompatEditText = (AppCompatEditText) AbstractC34235f.m108203J(view, i13);
        if (appCompatEditText != null) {
            return new StreamUiDialogSuggestPollOptionBinding((FrameLayout) view, appCompatEditText);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiDialogSuggestPollOptionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiDialogSuggestPollOptionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_dialog_suggest_poll_option, viewGroup, false);
        if (z4) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // ec.InterfaceC13008a
    public final FrameLayout getRoot() {
        return this.rootView;
    }
}
