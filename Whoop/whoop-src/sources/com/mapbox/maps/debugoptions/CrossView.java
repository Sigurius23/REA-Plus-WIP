package com.mapbox.maps.debugoptions;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.mapbox.maps.UtilsKt;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lcom/mapbox/maps/debugoptions/CrossView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/Canvas;", "canvas", "Ll83/a0;", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/Paint;", "greenPaint", "Landroid/graphics/Paint;", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class CrossView extends View {
    private final Paint greenPaint;

    public /* synthetic */ CrossView(Context context, AttributeSet attributeSet, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (canvas != null) {
            float height = canvas.getHeight() / 2.0f;
            float width = canvas.getWidth() / 2.0f;
            canvas.drawLine(0.0f, height, canvas.getWidth(), height, this.greenPaint);
            canvas.drawLine(width, 0.0f, width, canvas.getHeight(), this.greenPaint);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrossView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        Paint paint = new Paint(0);
        paint.setColor(PaddingDebugViewKt.GREEN_DARK);
        paint.setStrokeWidth(UtilsKt.toDP(Float.valueOf(1.0f), context).floatValue());
        this.greenPaint = paint;
    }
}
