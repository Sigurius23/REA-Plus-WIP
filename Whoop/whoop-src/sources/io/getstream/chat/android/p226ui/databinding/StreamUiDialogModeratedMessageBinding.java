package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiDialogModeratedMessageBinding implements InterfaceC13008a {
    public final FrameLayout container;
    public final TextView deleteMessage;
    public final TextView editMessage;
    private final FrameLayout rootView;
    public final TextView sendAnyway;

    private StreamUiDialogModeratedMessageBinding(FrameLayout frameLayout, FrameLayout frameLayout2, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = frameLayout;
        this.container = frameLayout2;
        this.deleteMessage = textView;
        this.editMessage = textView2;
        this.sendAnyway = textView3;
    }

    public static StreamUiDialogModeratedMessageBinding bind(View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i13 = C19469R.id.deleteMessage;
        TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
        if (textView != null) {
            i13 = C19469R.id.editMessage;
            TextView textView2 = (TextView) AbstractC34235f.m108203J(view, i13);
            if (textView2 != null) {
                i13 = C19469R.id.sendAnyway;
                TextView textView3 = (TextView) AbstractC34235f.m108203J(view, i13);
                if (textView3 != null) {
                    return new StreamUiDialogModeratedMessageBinding(frameLayout, frameLayout, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiDialogModeratedMessageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiDialogModeratedMessageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_dialog_moderated_message, viewGroup, false);
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
