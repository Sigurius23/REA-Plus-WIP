package io.getstream.chat.android.p226ui.feature.messages.composer.internal;

import android.content.res.Resources;
import android.view.View;
import android.widget.PopupWindow;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\f¨\u0006\r"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/internal/MessageComposerSuggestionsPopup;", "Landroid/widget/PopupWindow;", "Landroid/view/View;", "suggestionView", "anchorView", "Landroid/widget/PopupWindow$OnDismissListener;", "dismissListener", "<init>", "(Landroid/view/View;Landroid/view/View;Landroid/widget/PopupWindow$OnDismissListener;)V", "Ll83/a0;", "showOrUpdate", "()V", "Landroid/view/View;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageComposerSuggestionsPopup extends PopupWindow {
    private final View anchorView;
    private final View suggestionView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageComposerSuggestionsPopup(View suggestionView, View anchorView, PopupWindow.OnDismissListener dismissListener) {
        super(suggestionView, -1, -2);
        AbstractC22676k.m65750j(suggestionView, "suggestionView");
        AbstractC22676k.m65750j(anchorView, "anchorView");
        AbstractC22676k.m65750j(dismissListener, "dismissListener");
        this.suggestionView = suggestionView;
        this.anchorView = anchorView;
        setOutsideTouchable(true);
        setInputMethodMode(1);
        setOnDismissListener(dismissListener);
    }

    public final void showOrUpdate() {
        this.suggestionView.measure(View.MeasureSpec.makeMeasureSpec(Resources.getSystem().getDisplayMetrics().widthPixels, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int height = this.anchorView.getHeight() + this.suggestionView.getMeasuredHeight();
        if (isShowing()) {
            update(this.anchorView, 0, -height, -1, -1);
        } else {
            showAsDropDown(this.anchorView, 0, -height);
        }
    }
}
