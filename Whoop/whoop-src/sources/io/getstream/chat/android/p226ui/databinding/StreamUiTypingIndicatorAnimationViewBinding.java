package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.widgets.typing.internal.TypingIndicatorAnimationView;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiTypingIndicatorAnimationViewBinding implements InterfaceC13008a {
    public final TypingIndicatorAnimationView lvAnimatingDots;
    private final TypingIndicatorAnimationView rootView;

    private StreamUiTypingIndicatorAnimationViewBinding(TypingIndicatorAnimationView typingIndicatorAnimationView, TypingIndicatorAnimationView typingIndicatorAnimationView2) {
        this.rootView = typingIndicatorAnimationView;
        this.lvAnimatingDots = typingIndicatorAnimationView2;
    }

    public static StreamUiTypingIndicatorAnimationViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TypingIndicatorAnimationView typingIndicatorAnimationView = (TypingIndicatorAnimationView) view;
        return new StreamUiTypingIndicatorAnimationViewBinding(typingIndicatorAnimationView, typingIndicatorAnimationView);
    }

    public static StreamUiTypingIndicatorAnimationViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiTypingIndicatorAnimationViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_typing_indicator_animation_view, viewGroup, false);
        if (z4) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // ec.InterfaceC13008a
    public final TypingIndicatorAnimationView getRoot() {
        return this.rootView;
    }
}
