package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal.FootnoteView;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal.GapView;
import io.getstream.chat.android.p226ui.widgets.avatar.UserAvatarView;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiItemMessageDeletedBinding implements InterfaceC13008a {
    public final TextView deleteLabel;
    public final FootnoteView footnote;
    public final GapView gapView;
    public final Guideline marginEnd;
    public final Guideline marginStart;
    public final LinearLayout messageContainer;
    private final ConstraintLayout rootView;
    public final Space threadGuideline;
    public final UserAvatarView userAvatarMineView;
    public final UserAvatarView userAvatarView;

    private StreamUiItemMessageDeletedBinding(ConstraintLayout constraintLayout, TextView textView, FootnoteView footnoteView, GapView gapView, Guideline guideline, Guideline guideline2, LinearLayout linearLayout, Space space, UserAvatarView userAvatarView, UserAvatarView userAvatarView2) {
        this.rootView = constraintLayout;
        this.deleteLabel = textView;
        this.footnote = footnoteView;
        this.gapView = gapView;
        this.marginEnd = guideline;
        this.marginStart = guideline2;
        this.messageContainer = linearLayout;
        this.threadGuideline = space;
        this.userAvatarMineView = userAvatarView;
        this.userAvatarView = userAvatarView2;
    }

    public static StreamUiItemMessageDeletedBinding bind(View view) {
        int i13 = C19469R.id.deleteLabel;
        TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
        if (textView != null) {
            i13 = C19469R.id.footnote;
            FootnoteView footnoteView = (FootnoteView) AbstractC34235f.m108203J(view, i13);
            if (footnoteView != null) {
                i13 = C19469R.id.gapView;
                GapView gapView = (GapView) AbstractC34235f.m108203J(view, i13);
                if (gapView != null) {
                    i13 = C19469R.id.marginEnd;
                    Guideline guideline = (Guideline) AbstractC34235f.m108203J(view, i13);
                    if (guideline != null) {
                        i13 = C19469R.id.marginStart;
                        Guideline guideline2 = (Guideline) AbstractC34235f.m108203J(view, i13);
                        if (guideline2 != null) {
                            i13 = C19469R.id.messageContainer;
                            LinearLayout linearLayout = (LinearLayout) AbstractC34235f.m108203J(view, i13);
                            if (linearLayout != null) {
                                i13 = C19469R.id.threadGuideline;
                                Space space = (Space) AbstractC34235f.m108203J(view, i13);
                                if (space != null) {
                                    i13 = C19469R.id.userAvatarMineView;
                                    UserAvatarView userAvatarView = (UserAvatarView) AbstractC34235f.m108203J(view, i13);
                                    if (userAvatarView != null) {
                                        i13 = C19469R.id.userAvatarView;
                                        UserAvatarView userAvatarView2 = (UserAvatarView) AbstractC34235f.m108203J(view, i13);
                                        if (userAvatarView2 != null) {
                                            return new StreamUiItemMessageDeletedBinding((ConstraintLayout) view, textView, footnoteView, gapView, guideline, guideline2, linearLayout, space, userAvatarView, userAvatarView2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiItemMessageDeletedBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiItemMessageDeletedBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_item_message_deleted, viewGroup, false);
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
