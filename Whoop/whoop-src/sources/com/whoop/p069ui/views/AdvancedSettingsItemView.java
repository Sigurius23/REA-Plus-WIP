package com.whoop.p069ui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import hi0.AbstractC17314l;
import ii0.AbstractC18569y;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import vu1.AbstractC36510a;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001b¨\u0006\u001f"}, m65681d2 = {"Lcom/whoop/ui/views/AdvancedSettingsItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/content/res/TypedArray;", "arr", "Ll83/a0;", "f", "(Landroid/content/res/TypedArray;)V", "", "enabled", "setEnabled", "(Z)V", "Landroid/view/View$OnClickListener;", "l", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "Lii0/y;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lii0/y;", "binding", "", "x", "I", "disabledColor", "y", "enabledColor", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class AdvancedSettingsItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final AbstractC18569y binding;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final int disabledColor;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final int enabledColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedSettingsItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(attrs, "attrs");
        AbstractC18569y abstractC18569yM53782c = AbstractC18569y.m53782c(LayoutInflater.from(getContext()), this, true);
        AbstractC22676k.m65749i(abstractC18569yM53782c, "inflate(...)");
        this.binding = abstractC18569yM53782c;
        this.disabledColor = AbstractC32122c.getColor(getContext(), AbstractC36510a.f156008Q);
        this.enabledColor = AbstractC32122c.getColor(getContext(), AbstractC36510a.f156006O);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, AbstractC17314l.f67046a);
        AbstractC22676k.m65749i(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        m27394f(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: f */
    private final void m27394f(TypedArray arr) {
        if (arr != null) {
            this.binding.f72553c.setImageResource(arr.getResourceId(AbstractC17314l.f67048c, 0));
            this.binding.f72554d.setText(getContext().getString(arr.getResourceId(AbstractC17314l.f67049d, 0)));
            this.binding.f72552b.setText(getContext().getString(arr.getResourceId(AbstractC17314l.f67047b, 0)));
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        this.binding.f72554d.setTextColor(enabled ? this.enabledColor : this.disabledColor);
        this.binding.f72551a.setClickable(enabled);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener l7) {
        this.binding.f72551a.setOnClickListener(l7);
    }
}
