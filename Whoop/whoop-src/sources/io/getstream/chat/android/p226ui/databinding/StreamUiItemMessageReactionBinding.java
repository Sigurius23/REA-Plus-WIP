package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiItemMessageReactionBinding implements InterfaceC13008a {
    public final ImageView reactionIcon;
    private final ImageView rootView;

    private StreamUiItemMessageReactionBinding(ImageView imageView, ImageView imageView2) {
        this.rootView = imageView;
        this.reactionIcon = imageView2;
    }

    public static StreamUiItemMessageReactionBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ImageView imageView = (ImageView) view;
        return new StreamUiItemMessageReactionBinding(imageView, imageView);
    }

    public static StreamUiItemMessageReactionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiItemMessageReactionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_item_message_reaction, viewGroup, false);
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
