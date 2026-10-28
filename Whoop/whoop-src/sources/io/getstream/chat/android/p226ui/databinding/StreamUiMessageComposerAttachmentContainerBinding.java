package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiMessageComposerAttachmentContainerBinding implements InterfaceC13008a {
    private final FrameLayout rootView;

    private StreamUiMessageComposerAttachmentContainerBinding(FrameLayout frameLayout) {
        this.rootView = frameLayout;
    }

    public static StreamUiMessageComposerAttachmentContainerBinding bind(View view) {
        if (view != null) {
            return new StreamUiMessageComposerAttachmentContainerBinding((FrameLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    public static StreamUiMessageComposerAttachmentContainerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiMessageComposerAttachmentContainerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_message_composer_attachment_container, viewGroup, false);
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
