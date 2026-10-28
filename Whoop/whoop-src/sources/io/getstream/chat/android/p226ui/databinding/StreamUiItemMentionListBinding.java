package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.feature.messages.preview.internal.MessagePreviewView;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiItemMentionListBinding implements InterfaceC13008a {
    private final MessagePreviewView rootView;

    private StreamUiItemMentionListBinding(MessagePreviewView messagePreviewView) {
        this.rootView = messagePreviewView;
    }

    public static StreamUiItemMentionListBinding bind(View view) {
        if (view != null) {
            return new StreamUiItemMentionListBinding((MessagePreviewView) view);
        }
        throw new NullPointerException("rootView");
    }

    public static StreamUiItemMentionListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiItemMentionListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_item_mention_list, viewGroup, false);
        if (z4) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // ec.InterfaceC13008a
    public final MessagePreviewView getRoot() {
        return this.rootView;
    }
}
