package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiItemCommandBinding implements InterfaceC13008a {
    public final ImageView commandIconImageView;
    public final TextView commandNameTextView;
    public final TextView commandQueryTextView;
    public final ImageView instantCommandImageView;
    private final ConstraintLayout rootView;

    private StreamUiItemCommandBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, ImageView imageView2) {
        this.rootView = constraintLayout;
        this.commandIconImageView = imageView;
        this.commandNameTextView = textView;
        this.commandQueryTextView = textView2;
        this.instantCommandImageView = imageView2;
    }

    public static StreamUiItemCommandBinding bind(View view) {
        int i13 = C19469R.id.commandIconImageView;
        ImageView imageView = (ImageView) AbstractC34235f.m108203J(view, i13);
        if (imageView != null) {
            i13 = C19469R.id.commandNameTextView;
            TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
            if (textView != null) {
                i13 = C19469R.id.commandQueryTextView;
                TextView textView2 = (TextView) AbstractC34235f.m108203J(view, i13);
                if (textView2 != null) {
                    i13 = C19469R.id.instantCommandImageView;
                    ImageView imageView2 = (ImageView) AbstractC34235f.m108203J(view, i13);
                    if (imageView2 != null) {
                        return new StreamUiItemCommandBinding((ConstraintLayout) view, imageView, textView, textView2, imageView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiItemCommandBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiItemCommandBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_item_command, viewGroup, false);
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
