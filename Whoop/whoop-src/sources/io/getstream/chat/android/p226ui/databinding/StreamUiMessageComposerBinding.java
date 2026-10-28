package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiMessageComposerBinding implements InterfaceC13008a {
    public final FrameLayout centerContainer;
    public final FrameLayout centerContent;
    public final FrameLayout centerOverlapContent;
    public final FrameLayout footerContent;
    public final FrameLayout headerContent;
    public final FrameLayout leadingContent;
    private final View rootView;
    public final View separator;
    public final FrameLayout trailingContent;

    private StreamUiMessageComposerBinding(View view, FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3, FrameLayout frameLayout4, FrameLayout frameLayout5, FrameLayout frameLayout6, View view2, FrameLayout frameLayout7) {
        this.rootView = view;
        this.centerContainer = frameLayout;
        this.centerContent = frameLayout2;
        this.centerOverlapContent = frameLayout3;
        this.footerContent = frameLayout4;
        this.headerContent = frameLayout5;
        this.leadingContent = frameLayout6;
        this.separator = view2;
        this.trailingContent = frameLayout7;
    }

    public static StreamUiMessageComposerBinding bind(View view) {
        View viewM108203J;
        int i13 = C19469R.id.centerContainer;
        FrameLayout frameLayout = (FrameLayout) AbstractC34235f.m108203J(view, i13);
        if (frameLayout != null) {
            i13 = C19469R.id.centerContent;
            FrameLayout frameLayout2 = (FrameLayout) AbstractC34235f.m108203J(view, i13);
            if (frameLayout2 != null) {
                i13 = C19469R.id.centerOverlapContent;
                FrameLayout frameLayout3 = (FrameLayout) AbstractC34235f.m108203J(view, i13);
                if (frameLayout3 != null) {
                    i13 = C19469R.id.footerContent;
                    FrameLayout frameLayout4 = (FrameLayout) AbstractC34235f.m108203J(view, i13);
                    if (frameLayout4 != null) {
                        i13 = C19469R.id.headerContent;
                        FrameLayout frameLayout5 = (FrameLayout) AbstractC34235f.m108203J(view, i13);
                        if (frameLayout5 != null) {
                            i13 = C19469R.id.leadingContent;
                            FrameLayout frameLayout6 = (FrameLayout) AbstractC34235f.m108203J(view, i13);
                            if (frameLayout6 != null && (viewM108203J = AbstractC34235f.m108203J(view, (i13 = C19469R.id.separator))) != null) {
                                i13 = C19469R.id.trailingContent;
                                FrameLayout frameLayout7 = (FrameLayout) AbstractC34235f.m108203J(view, i13);
                                if (frameLayout7 != null) {
                                    return new StreamUiMessageComposerBinding(view, frameLayout, frameLayout2, frameLayout3, frameLayout4, frameLayout5, frameLayout6, viewM108203J, frameLayout7);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiMessageComposerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C19469R.layout.stream_ui_message_composer, viewGroup);
        return bind(viewGroup);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }
}
