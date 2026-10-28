package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatCheckBox;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiMessageComposerDefaultFooterContentBinding implements InterfaceC13008a {
    public final AppCompatCheckBox alsoSendToChannelCheckBox;
    private final View rootView;

    private StreamUiMessageComposerDefaultFooterContentBinding(View view, AppCompatCheckBox appCompatCheckBox) {
        this.rootView = view;
        this.alsoSendToChannelCheckBox = appCompatCheckBox;
    }

    public static StreamUiMessageComposerDefaultFooterContentBinding bind(View view) {
        int i13 = C19469R.id.alsoSendToChannelCheckBox;
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) AbstractC34235f.m108203J(view, i13);
        if (appCompatCheckBox != null) {
            return new StreamUiMessageComposerDefaultFooterContentBinding(view, appCompatCheckBox);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiMessageComposerDefaultFooterContentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C19469R.layout.stream_ui_message_composer_default_footer_content, viewGroup);
        return bind(viewGroup);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }
}
