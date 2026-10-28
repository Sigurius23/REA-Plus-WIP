package com.whoop.realtime.presentation.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whoop.p069ui.views.ColoredImageView;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import k52.AbstractC22212h;
import m52.AbstractC25101u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010!\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010$\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010 R$\u0010*\u001a\u00020%2\u0006\u0010$\u001a\u00020%8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010-\u001a\u00020%2\u0006\u0010$\u001a\u00020%8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)¨\u0006."}, m65681d2 = {"Lcom/whoop/realtime/presentation/views/RealTimeCell;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/content/res/TypedArray;", "arr", "Ll83/a0;", "a", "(Landroid/content/res/TypedArray;)V", "b", "c", "d", "Lm52/u;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lm52/u;", "binding", "Landroid/widget/ImageView;", "x", "Landroid/widget/ImageView;", "getIcon", "()Landroid/widget/ImageView;", "icon", "Landroid/widget/TextView;", "y", "Landroid/widget/TextView;", "getLabel", "()Landroid/widget/TextView;", "label", "z", "getValue", "value", "", "getValueText", "()Ljava/lang/CharSequence;", "setValueText", "(Ljava/lang/CharSequence;)V", "valueText", "getLabelText", "setLabelText", "labelText", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class RealTimeCell extends LinearLayout {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final AbstractC25101u binding;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final ImageView icon;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final TextView label;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final TextView value;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RealTimeCell(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC22676k.m65750j(context, "context");
    }

    /* JADX INFO: renamed from: a */
    private final void m24154a(TypedArray arr) {
        setLayerType(1, null);
        setOrientation(1);
        m24155b(arr);
        m24156c(arr);
        m24157d(arr);
    }

    /* JADX INFO: renamed from: b */
    private final void m24155b(TypedArray arr) {
        Drawable drawable = getContext().getDrawable(arr.getResourceId(AbstractC22212h.f86545b, 0));
        if (drawable != null) {
            if (arr.hasValue(AbstractC22212h.f86547d)) {
                drawable.setTint(arr.getColor(AbstractC22212h.f86547d, 0));
            }
            this.icon.setImageDrawable(drawable);
        }
        if (arr.hasValue(AbstractC22212h.f86546c)) {
            ViewGroup.LayoutParams layoutParams = this.icon.getLayoutParams();
            layoutParams.height = arr.getDimensionPixelOffset(AbstractC22212h.f86546c, layoutParams.height);
            if (arr.hasValue(AbstractC22212h.f86548e)) {
                layoutParams.width = arr.getDimensionPixelOffset(AbstractC22212h.f86548e, layoutParams.width);
            }
            this.icon.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: c */
    private final void m24156c(TypedArray arr) {
        this.label.setText(arr.getString(AbstractC22212h.f86550g));
        if (arr.hasValue(AbstractC22212h.f86549f)) {
            this.label.setTextColor(arr.getColor(AbstractC22212h.f86549f, 0));
        }
    }

    /* JADX INFO: renamed from: d */
    private final void m24157d(TypedArray arr) {
        this.value.setText(arr.getString(AbstractC22212h.f86552i));
        if (arr.hasValue(AbstractC22212h.f86551h)) {
            this.value.setTextColor(arr.getColor(AbstractC22212h.f86551h, 0));
        }
    }

    public final ImageView getIcon() {
        return this.icon;
    }

    public final TextView getLabel() {
        return this.label;
    }

    public final CharSequence getLabelText() {
        return this.label.getText().toString();
    }

    public final TextView getValue() {
        return this.value;
    }

    public final CharSequence getValueText() {
        return this.value.getText().toString();
    }

    public final void setLabelText(CharSequence value) {
        AbstractC22676k.m65750j(value, "value");
        this.label.setText(value);
    }

    public final void setValueText(CharSequence value) {
        AbstractC22676k.m65750j(value, "value");
        this.value.setText(value);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealTimeCell(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        AbstractC25101u abstractC25101uM73594c = AbstractC25101u.m73594c(LayoutInflater.from(context), this, true);
        AbstractC22676k.m65749i(abstractC25101uM73594c, "inflate(...)");
        this.binding = abstractC25101uM73594c;
        ColoredImageView viewRealtimeCellIcon = abstractC25101uM73594c.f98383a;
        AbstractC22676k.m65749i(viewRealtimeCellIcon, "viewRealtimeCellIcon");
        this.icon = viewRealtimeCellIcon;
        TextView viewRealtimeCellLabel = abstractC25101uM73594c.f98384b;
        AbstractC22676k.m65749i(viewRealtimeCellLabel, "viewRealtimeCellLabel");
        this.label = viewRealtimeCellLabel;
        TextView viewRealtimeCellValue = abstractC25101uM73594c.f98385c;
        AbstractC22676k.m65749i(viewRealtimeCellValue, "viewRealtimeCellValue");
        this.value = viewRealtimeCellValue;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC22212h.f86544a);
        AbstractC22676k.m65749i(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        m24154a(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    public /* synthetic */ RealTimeCell(Context context, AttributeSet attributeSet, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }
}
