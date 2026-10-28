package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiItemAttachmentMediaAddMoreBinding implements InterfaceC13008a {
    private final LinearLayout rootView;

    private StreamUiItemAttachmentMediaAddMoreBinding(LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    public static StreamUiItemAttachmentMediaAddMoreBinding bind(View view) {
        if (view != null) {
            return new StreamUiItemAttachmentMediaAddMoreBinding((LinearLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    public static StreamUiItemAttachmentMediaAddMoreBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiItemAttachmentMediaAddMoreBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_item_attachment_media_add_more, viewGroup, false);
        if (z4) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // ec.InterfaceC13008a
    public final LinearLayout getRoot() {
        return this.rootView;
    }
}
