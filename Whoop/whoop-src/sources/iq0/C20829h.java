package iq0;

import android.view.View;
import android.widget.PopupWindow;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: iq0.h */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, m65681d2 = {"Liq0/h;", "Landroid/widget/PopupWindow;", "Landroid/view/View;", "contentView", "anchor", "<init>", "(Landroid/view/View;Landroid/view/View;)V", "", "hasSuggestions", "Ll83/a0;", "a", "(Z)V", "Landroid/view/View;", "b", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C20829h extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final View contentView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final View anchor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20829h(View contentView, View anchor) {
        super(contentView, -1, -2);
        AbstractC22676k.m65750j(contentView, "contentView");
        AbstractC22676k.m65750j(anchor, "anchor");
        this.contentView = contentView;
        this.anchor = anchor;
        setOutsideTouchable(true);
        setInputMethodMode(1);
    }

    /* JADX INFO: renamed from: a */
    public final void m57452a(boolean hasSuggestions) {
        if (!hasSuggestions) {
            dismiss();
            return;
        }
        Integer numValueOf = Integer.valueOf(this.anchor.getWidth());
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        this.contentView.measure(View.MeasureSpec.makeMeasureSpec(numValueOf != null ? numValueOf.intValue() : this.anchor.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int height = this.anchor.getHeight() + this.contentView.getMeasuredHeight();
        if (isShowing()) {
            update(this.anchor, 0, -height, -1, -1);
        } else {
            showAsDropDown(this.anchor, 0, -height);
        }
    }
}
