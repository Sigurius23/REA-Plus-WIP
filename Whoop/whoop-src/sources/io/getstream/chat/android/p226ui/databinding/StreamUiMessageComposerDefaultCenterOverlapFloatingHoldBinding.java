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
public final class StreamUiMessageComposerDefaultCenterOverlapFloatingHoldBinding implements InterfaceC13008a {
    public final TextView holdToRecordText;
    private final FrameLayout rootView;

    private StreamUiMessageComposerDefaultCenterOverlapFloatingHoldBinding(FrameLayout frameLayout, TextView textView) {
        this.rootView = frameLayout;
        this.holdToRecordText = textView;
    }

    public static StreamUiMessageComposerDefaultCenterOverlapFloatingHoldBinding bind(View view) {
        int i13 = C19469R.id.holdToRecordText;
        TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
        if (textView != null) {
            return new StreamUiMessageComposerDefaultCenterOverlapFloatingHoldBinding((FrameLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiMessageComposerDefaultCenterOverlapFloatingHoldBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiMessageComposerDefaultCenterOverlapFloatingHoldBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_message_composer_default_center_overlap_floating_hold, viewGroup, false);
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
