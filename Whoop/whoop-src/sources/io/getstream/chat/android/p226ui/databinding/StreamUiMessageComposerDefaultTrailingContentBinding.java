package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiMessageComposerDefaultTrailingContentBinding implements InterfaceC13008a {
    public final TextView cooldownBadgeTextView;
    public final ImageView recordAudioButton;
    private final View rootView;
    public final ImageView sendMessageButton;

    private StreamUiMessageComposerDefaultTrailingContentBinding(View view, TextView textView, ImageView imageView, ImageView imageView2) {
        this.rootView = view;
        this.cooldownBadgeTextView = textView;
        this.recordAudioButton = imageView;
        this.sendMessageButton = imageView2;
    }

    public static StreamUiMessageComposerDefaultTrailingContentBinding bind(View view) {
        int i13 = C19469R.id.cooldownBadgeTextView;
        TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
        if (textView != null) {
            i13 = C19469R.id.recordAudioButton;
            ImageView imageView = (ImageView) AbstractC34235f.m108203J(view, i13);
            if (imageView != null) {
                i13 = C19469R.id.sendMessageButton;
                ImageView imageView2 = (ImageView) AbstractC34235f.m108203J(view, i13);
                if (imageView2 != null) {
                    return new StreamUiMessageComposerDefaultTrailingContentBinding(view, textView, imageView, imageView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiMessageComposerDefaultTrailingContentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C19469R.layout.stream_ui_message_composer_default_trailing_content, viewGroup);
        return bind(viewGroup);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }
}
