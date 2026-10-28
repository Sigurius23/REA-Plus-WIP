package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiScrollButtonViewBinding implements InterfaceC13008a {
    private final View rootView;
    public final FloatingActionButton scrollActionButton;
    public final TextView unreadCountTextView;

    private StreamUiScrollButtonViewBinding(View view, FloatingActionButton floatingActionButton, TextView textView) {
        this.rootView = view;
        this.scrollActionButton = floatingActionButton;
        this.unreadCountTextView = textView;
    }

    public static StreamUiScrollButtonViewBinding bind(View view) {
        int i13 = C19469R.id.scrollActionButton;
        FloatingActionButton floatingActionButton = (FloatingActionButton) AbstractC34235f.m108203J(view, i13);
        if (floatingActionButton != null) {
            i13 = C19469R.id.unreadCountTextView;
            TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
            if (textView != null) {
                return new StreamUiScrollButtonViewBinding(view, floatingActionButton, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiScrollButtonViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C19469R.layout.stream_ui_scroll_button_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }
}
