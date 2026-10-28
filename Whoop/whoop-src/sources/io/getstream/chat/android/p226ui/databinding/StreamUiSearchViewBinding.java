package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiSearchViewBinding implements InterfaceC13008a {
    public final ImageView clearInputButton;
    public final EditText inputField;
    private final ConstraintLayout rootView;
    public final ImageView searchIcon;

    private StreamUiSearchViewBinding(ConstraintLayout constraintLayout, ImageView imageView, EditText editText, ImageView imageView2) {
        this.rootView = constraintLayout;
        this.clearInputButton = imageView;
        this.inputField = editText;
        this.searchIcon = imageView2;
    }

    public static StreamUiSearchViewBinding bind(View view) {
        int i13 = C19469R.id.clearInputButton;
        ImageView imageView = (ImageView) AbstractC34235f.m108203J(view, i13);
        if (imageView != null) {
            i13 = C19469R.id.inputField;
            EditText editText = (EditText) AbstractC34235f.m108203J(view, i13);
            if (editText != null) {
                i13 = C19469R.id.searchIcon;
                ImageView imageView2 = (ImageView) AbstractC34235f.m108203J(view, i13);
                if (imageView2 != null) {
                    return new StreamUiSearchViewBinding((ConstraintLayout) view, imageView, editText, imageView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiSearchViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiSearchViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_search_view, viewGroup, false);
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
