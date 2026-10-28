package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiMessageComposerDefaultCenterOverlapFloatingLockBinding implements InterfaceC13008a {
    private final ImageView rootView;

    private StreamUiMessageComposerDefaultCenterOverlapFloatingLockBinding(ImageView imageView) {
        this.rootView = imageView;
    }

    public static StreamUiMessageComposerDefaultCenterOverlapFloatingLockBinding bind(View view) {
        if (view != null) {
            return new StreamUiMessageComposerDefaultCenterOverlapFloatingLockBinding((ImageView) view);
        }
        throw new NullPointerException("rootView");
    }

    public static StreamUiMessageComposerDefaultCenterOverlapFloatingLockBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiMessageComposerDefaultCenterOverlapFloatingLockBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_message_composer_default_center_overlap_floating_lock, viewGroup, false);
        if (z4) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // ec.InterfaceC13008a
    public final ImageView getRoot() {
        return this.rootView;
    }
}
