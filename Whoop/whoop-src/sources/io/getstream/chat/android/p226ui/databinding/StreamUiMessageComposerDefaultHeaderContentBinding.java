package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiMessageComposerDefaultHeaderContentBinding implements InterfaceC13008a {
    public final ImageView dismissInputModeButton;
    public final FrameLayout inputModeHeaderContainer;
    public final ImageView inputModeImageView;
    public final TextView inputModeTextView;
    private final View rootView;

    private StreamUiMessageComposerDefaultHeaderContentBinding(View view, ImageView imageView, FrameLayout frameLayout, ImageView imageView2, TextView textView) {
        this.rootView = view;
        this.dismissInputModeButton = imageView;
        this.inputModeHeaderContainer = frameLayout;
        this.inputModeImageView = imageView2;
        this.inputModeTextView = textView;
    }

    public static StreamUiMessageComposerDefaultHeaderContentBinding bind(View view) {
        int i13 = C19469R.id.dismissInputModeButton;
        ImageView imageView = (ImageView) AbstractC34235f.m108203J(view, i13);
        if (imageView != null) {
            i13 = C19469R.id.inputModeHeaderContainer;
            FrameLayout frameLayout = (FrameLayout) AbstractC34235f.m108203J(view, i13);
            if (frameLayout != null) {
                i13 = C19469R.id.inputModeImageView;
                ImageView imageView2 = (ImageView) AbstractC34235f.m108203J(view, i13);
                if (imageView2 != null) {
                    i13 = C19469R.id.inputModeTextView;
                    TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
                    if (textView != null) {
                        return new StreamUiMessageComposerDefaultHeaderContentBinding(view, imageView, frameLayout, imageView2, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiMessageComposerDefaultHeaderContentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C19469R.layout.stream_ui_message_composer_default_header_content, viewGroup);
        return bind(viewGroup);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }
}
