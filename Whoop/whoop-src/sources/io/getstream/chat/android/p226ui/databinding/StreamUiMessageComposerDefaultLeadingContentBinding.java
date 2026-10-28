package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiMessageComposerDefaultLeadingContentBinding implements InterfaceC13008a {
    public final ImageView attachmentsButton;
    public final ImageView commandsButton;
    private final View rootView;

    private StreamUiMessageComposerDefaultLeadingContentBinding(View view, ImageView imageView, ImageView imageView2) {
        this.rootView = view;
        this.attachmentsButton = imageView;
        this.commandsButton = imageView2;
    }

    public static StreamUiMessageComposerDefaultLeadingContentBinding bind(View view) {
        int i13 = C19469R.id.attachmentsButton;
        ImageView imageView = (ImageView) AbstractC34235f.m108203J(view, i13);
        if (imageView != null) {
            i13 = C19469R.id.commandsButton;
            ImageView imageView2 = (ImageView) AbstractC34235f.m108203J(view, i13);
            if (imageView2 != null) {
                return new StreamUiMessageComposerDefaultLeadingContentBinding(view, imageView, imageView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiMessageComposerDefaultLeadingContentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C19469R.layout.stream_ui_message_composer_default_leading_content, viewGroup);
        return bind(viewGroup);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }
}
