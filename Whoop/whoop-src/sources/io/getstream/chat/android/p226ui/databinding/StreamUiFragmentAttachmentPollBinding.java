package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiFragmentAttachmentPollBinding implements InterfaceC13008a {
    private final ConstraintLayout rootView;

    private StreamUiFragmentAttachmentPollBinding(ConstraintLayout constraintLayout) {
        this.rootView = constraintLayout;
    }

    public static StreamUiFragmentAttachmentPollBinding bind(View view) {
        if (view != null) {
            return new StreamUiFragmentAttachmentPollBinding((ConstraintLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    public static StreamUiFragmentAttachmentPollBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiFragmentAttachmentPollBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_fragment_attachment_poll, viewGroup, false);
        if (z4) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // ec.InterfaceC13008a
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }
}
