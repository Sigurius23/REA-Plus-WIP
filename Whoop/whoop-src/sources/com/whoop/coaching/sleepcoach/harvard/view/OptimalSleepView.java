package com.whoop.coaching.sleepcoach.harvard.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import gy0.AbstractC16273b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l83.InterfaceC23462h;
import live.hms.video.connection.degredation.C24117a;
import lp0.AbstractC24635f;
import lp0.C24631b;
import lp0.C24632c;
import lp0.C24633d;
import lp0.C24634e;
import lp0.EnumC24637h;
import p513u4.AbstractC34523k;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import qe2.AbstractC30311d;
import vu1.AbstractC36510a;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010%R\u0016\u0010*\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010%R\u0016\u0010,\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010%R\u0016\u0010.\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010%R\u0016\u00100\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u0010%R\u001b\u00105\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R$\u0010;\u001a\u0002062\u0006\u00107\u001a\u0002068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\"\u00108\u001a\u0004\b9\u0010:R\u0016\u0010=\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00108R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b@\u0010-R\u0014\u0010C\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\bB\u0010-R\u0014\u0010E\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\bD\u0010-R\u0014\u0010G\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\bF\u0010-R\u0014\u0010I\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\bH\u0010\"R\u0016\u0010K\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010-R\u0016\u0010M\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010\"R\u0016\u0010O\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010\"R\u0016\u0010Q\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010\"R\u0014\u0010U\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010W\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010\"R\u0016\u0010[\u001a\u00020X8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010]\u001a\u00020X8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\\\u0010ZR\u0014\u0010_\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010TR\u0014\u0010a\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010TR\u0014\u0010c\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010TR\u0014\u0010e\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010TR\u0014\u0010g\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010T¨\u0006h"}, m65681d2 = {"Lcom/whoop/coaching/sleepcoach/harvard/view/OptimalSleepView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/Canvas;", "canvas", "", "textPosition", "Ll83/a0;", "b", "(Landroid/graphics/Canvas;F)V", "Landroid/graphics/Paint$Align;", "textAlign", "setOptimalTextAlign", "(Landroid/graphics/Paint$Align;)V", "drawableRes", "width", "height", "Landroid/graphics/Bitmap;", "c", "(III)Landroid/graphics/Bitmap;", "Llp0/f;", "optimalSleepType", "e", "(Llp0/f;)V", "onDraw", "(Landroid/graphics/Canvas;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "I", "optimalTextPaddingOffset", "x", "Landroid/graphics/Bitmap;", "dashLineTopLeftToBottomRight", "y", "dashLineTopRightToBottomLeft", "z", "dashLineTopLeftToBottomRightPartialFit", "E", "dashLineTopRightToBottomLeftPartialFit", "F", "dashLineTopLeftToBottomRightPartialFitOptimalTextCentered", "G", "dashLineTopRightToBottomLeftPartialFitOptimalTextCentered", "H", "Ll83/h;", "getOptimalSleepOutOfWindowDirection", "()Landroid/graphics/Bitmap;", "optimalSleepOutOfWindowDirection", "", "value", "Ljava/lang/String;", "getOptimalSleepText", "()Ljava/lang/String;", "optimalSleepText", "J", "optimalSleepTime", "K", "Llp0/f;", "L", "topOfSleep", "M", "dashPathOnIntervals", "N", "dashPathOffIntervals", "O", "optimalSleepBarTop", "P", "optimalSleepBitmapHeight", "Q", "optimalTextLength", "R", "optimalSleepEndPixels", "S", "optimalSleepStartPixels", "T", "optimalSleepMidPixels", "Landroid/graphics/Paint;", "U", "Landroid/graphics/Paint;", "paint", "V", "optimalSleepFitOutOfWindowDrawable", "Landroid/graphics/LinearGradient;", "W", "Landroid/graphics/LinearGradient;", "leftToRightLinearGradient", "a0", "rightToLeftLinearGradient", "b0", "optimaSleepNoDataPaintText", "c0", "optimaSleepPaintText", "d0", "optimalSleepTimePaintText", "e0", "optimalSleepNoDataDottedLinePaint", "f0", "optimalSleepPartialLinePaint", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class OptimalSleepView extends View {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private Bitmap dashLineTopRightToBottomLeftPartialFit;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private Bitmap dashLineTopLeftToBottomRightPartialFitOptimalTextCentered;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private Bitmap dashLineTopRightToBottomLeftPartialFitOptimalTextCentered;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC23462h optimalSleepOutOfWindowDirection;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private String optimalSleepText;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private String optimalSleepTime;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private AbstractC24635f optimalSleepType;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final float topOfSleep;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final float dashPathOnIntervals;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final float dashPathOffIntervals;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final float optimalSleepBarTop;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private final int optimalSleepBitmapHeight;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private float optimalTextLength;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private int optimalSleepEndPixels;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private int optimalSleepStartPixels;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private int optimalSleepMidPixels;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private final Paint paint;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private int optimalSleepFitOutOfWindowDrawable;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private LinearGradient leftToRightLinearGradient;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    private LinearGradient rightToLeftLinearGradient;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    private final Paint optimaSleepNoDataPaintText;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    private final Paint optimaSleepPaintText;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    private final Paint optimalSleepTimePaintText;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    private final Paint optimalSleepNoDataDottedLinePaint;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    private final Paint optimalSleepPartialLinePaint;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final int optimalTextPaddingOffset;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private Bitmap dashLineTopLeftToBottomRight;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private Bitmap dashLineTopRightToBottomLeft;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private Bitmap dashLineTopLeftToBottomRightPartialFit;

    /* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.harvard.view.OptimalSleepView$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class C6221a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f24456a;

        static {
            int[] iArr = new int[EnumC24637h.values().length];
            try {
                iArr[EnumC24637h.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC24637h.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f24456a = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OptimalSleepView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC22676k.m65750j(context, "context");
    }

    /* JADX INFO: renamed from: b */
    private final void m18530b(Canvas canvas, float textPosition) {
        canvas.drawText(this.optimalSleepText, textPosition, this.topOfSleep, this.optimaSleepPaintText);
        canvas.drawText(this.optimalSleepTime, textPosition, this.topOfSleep + 40.0f, this.optimalSleepTimePaintText);
    }

    /* JADX INFO: renamed from: c */
    private final Bitmap m18531c(int drawableRes, int width, int height) {
        Drawable drawable = getResources().getDrawable(drawableRes, null);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        AbstractC22676k.m65749i(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final Bitmap m18532d(OptimalSleepView optimalSleepView) {
        return optimalSleepView.m18531c(optimalSleepView.optimalSleepFitOutOfWindowDrawable, 30, 30);
    }

    private final Bitmap getOptimalSleepOutOfWindowDirection() {
        return (Bitmap) this.optimalSleepOutOfWindowDirection.getValue();
    }

    private final void setOptimalTextAlign(Paint.Align textAlign) {
        this.optimaSleepPaintText.setTextAlign(textAlign);
        this.optimalSleepTimePaintText.setTextAlign(textAlign);
    }

    /* JADX INFO: renamed from: e */
    public final void m18533e(AbstractC24635f optimalSleepType) {
        Paint.Align align;
        AbstractC22676k.m65750j(optimalSleepType, "optimalSleepType");
        this.optimalSleepType = optimalSleepType;
        if (optimalSleepType instanceof C24631b) {
            C24631b c24631b = (C24631b) optimalSleepType;
            String strM71966b = c24631b.getOptimalSleepText();
            Locale locale = Locale.ROOT;
            String upperCase = strM71966b.toUpperCase(locale);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            this.optimalSleepText = upperCase;
            String upperCase2 = c24631b.getOptimalSleepTimeText().toUpperCase(locale);
            AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
            this.optimalSleepTime = upperCase2;
            this.optimalSleepStartPixels = c24631b.getStartPixels();
            int iM71965a = c24631b.getEndTimePixels();
            this.optimalSleepEndPixels = iM71965a;
            this.optimalSleepMidPixels = (this.optimalSleepStartPixels + iM71965a) / 2;
            this.optimalTextLength = this.optimaSleepPaintText.measureText(c24631b.getOptimalSleepText());
            setOptimalTextAlign(Paint.Align.CENTER);
            float f13 = 2;
            this.dashLineTopLeftToBottomRight = m18531c(AbstractC30311d.f124032c, ((this.optimalSleepMidPixels - this.optimalSleepStartPixels) - this.optimalTextPaddingOffset) - ((int) (this.optimalTextLength / f13)), this.optimalSleepBitmapHeight);
            this.dashLineTopRightToBottomLeft = m18531c(AbstractC30311d.f124033d, ((this.optimalSleepEndPixels - this.optimalSleepMidPixels) - this.optimalTextPaddingOffset) - ((int) (this.optimalTextLength / f13)), this.optimalSleepBitmapHeight);
        } else if (optimalSleepType instanceof C24632c) {
            C24632c c24632c = (C24632c) optimalSleepType;
            String strM71970b = c24632c.getOptimalSleepText();
            Locale locale2 = Locale.ROOT;
            String upperCase3 = strM71970b.toUpperCase(locale2);
            AbstractC22676k.m65749i(upperCase3, "toUpperCase(...)");
            this.optimalSleepText = upperCase3;
            String upperCase4 = c24632c.getOptimalSleepTimeText().toUpperCase(locale2);
            AbstractC22676k.m65749i(upperCase4, "toUpperCase(...)");
            this.optimalSleepTime = upperCase4;
            if (c24632c.getOptimalSleepDirection() == EnumC24637h.LEFT) {
                setOptimalTextAlign(Paint.Align.LEFT);
                this.optimalSleepStartPixels = c24632c.getTextPosition();
                this.optimalSleepFitOutOfWindowDrawable = AbstractC30311d.f124049t;
            } else {
                setOptimalTextAlign(Paint.Align.RIGHT);
                this.optimalSleepEndPixels = c24632c.getTextPosition();
                this.optimalSleepFitOutOfWindowDrawable = AbstractC30311d.f124050u;
            }
        } else if (optimalSleepType instanceof C24633d) {
            C24633d c24633d = (C24633d) optimalSleepType;
            String strM71975c = c24633d.getOptimalSleepText();
            Locale locale3 = Locale.ROOT;
            String upperCase5 = strM71975c.toUpperCase(locale3);
            AbstractC22676k.m65749i(upperCase5, "toUpperCase(...)");
            this.optimalSleepText = upperCase5;
            String upperCase6 = c24633d.getOptimalSleepTimeText().toUpperCase(locale3);
            AbstractC22676k.m65749i(upperCase6, "toUpperCase(...)");
            this.optimalSleepTime = upperCase6;
            this.optimalSleepStartPixels = c24633d.getStartPixels();
            this.optimalSleepEndPixels = c24633d.getEndTimePixels();
            this.optimalTextLength = this.optimaSleepPaintText.measureText(c24633d.getOptimalSleepText());
            if (c24633d.getIsOptimalTextCentered()) {
                align = Paint.Align.CENTER;
            } else {
                align = c24633d.getOptimalSleepDirection() == EnumC24637h.LEFT ? Paint.Align.LEFT : Paint.Align.RIGHT;
            }
            int i13 = C6221a.f24456a[c24633d.getOptimalSleepDirection().ordinal()];
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (c24633d.getIsOptimalTextCentered()) {
                    int i14 = AbstractC30311d.f124032c;
                    int iM71978f = c24633d.getTotalTimePixels();
                    int i15 = this.optimalSleepStartPixels;
                    this.dashLineTopLeftToBottomRightPartialFitOptimalTextCentered = m18531c(i14, ((((iM71978f + i15) / 2) - i15) - this.optimalTextPaddingOffset) - ((int) (this.optimalTextLength / 2)), this.optimalSleepBitmapHeight);
                } else {
                    this.dashLineTopLeftToBottomRightPartialFit = m18531c(AbstractC30311d.f124032c, this.optimalSleepEndPixels - this.optimalSleepStartPixels, this.optimalSleepBitmapHeight);
                }
            } else if (c24633d.getIsOptimalTextCentered()) {
                this.dashLineTopRightToBottomLeftPartialFitOptimalTextCentered = m18531c(AbstractC30311d.f124033d, ((this.optimalSleepEndPixels / 2) - this.optimalTextPaddingOffset) - ((int) (this.optimalTextLength / 2)), this.optimalSleepBitmapHeight);
            } else {
                this.dashLineTopRightToBottomLeftPartialFit = m18531c(AbstractC30311d.f124033d, this.optimalSleepEndPixels - this.optimalSleepStartPixels, this.optimalSleepBitmapHeight);
            }
            setOptimalTextAlign(align);
        } else {
            if (!(optimalSleepType instanceof C24634e)) {
                throw new NoWhenBranchMatchedException();
            }
            C24634e c24634e = (C24634e) optimalSleepType;
            String upperCase7 = c24634e.getOptimalSleepText().toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase7, "toUpperCase(...)");
            this.optimalSleepText = upperCase7;
            this.optimalSleepTime = c24634e.getOptimalSleepTimeText();
            this.optimalSleepMidPixels = (int) c24634e.getMidPixels();
            this.optimaSleepPaintText.setTextAlign(Paint.Align.CENTER);
            float f14 = this.optimalSleepMidPixels - 100.0f;
            int color = getContext().getColor(AbstractC36510a.f156017Z);
            int color2 = getContext().getColor(AbstractC36510a.f156013V);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.leftToRightLinearGradient = new LinearGradient(0.0f, 0.0f, f14, 0.0f, color, color2, tileMode);
            int i16 = this.optimalSleepMidPixels;
            this.rightToLeftLinearGradient = new LinearGradient(i16 + 40.0f, 0.0f, (i16 * 2.0f) - 150, 0.0f, getContext().getColor(AbstractC36510a.f156013V), getContext().getColor(AbstractC36510a.f156017Z), tileMode);
        }
        invalidate();
    }

    public final String getOptimalSleepText() {
        return this.optimalSleepText;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        AbstractC22676k.m65750j(canvas, "canvas");
        super.onDraw(canvas);
        AbstractC24635f abstractC24635f = this.optimalSleepType;
        if (abstractC24635f != null) {
            if (abstractC24635f instanceof C24631b) {
                m18530b(canvas, this.optimalSleepMidPixels);
                Bitmap bitmap = this.dashLineTopLeftToBottomRight;
                if (bitmap == null) {
                    AbstractC22676k.m65757q("dashLineTopLeftToBottomRight");
                    throw null;
                }
                canvas.drawBitmap(bitmap, this.optimalSleepStartPixels, this.optimalSleepBarTop, this.paint);
                Bitmap bitmap2 = this.dashLineTopRightToBottomLeft;
                if (bitmap2 == null) {
                    AbstractC22676k.m65757q("dashLineTopRightToBottomLeft");
                    throw null;
                }
                canvas.drawBitmap(bitmap2, (this.optimalTextLength / 2) + this.optimalSleepMidPixels + this.optimalTextPaddingOffset, this.optimalSleepBarTop, this.paint);
                return;
            }
            if (abstractC24635f instanceof C24632c) {
                int i13 = C6221a.f24456a[((C24632c) abstractC24635f).getOptimalSleepDirection().ordinal()];
                if (i13 == 1) {
                    m18530b(canvas, 100.0f);
                    canvas.drawBitmap(getOptimalSleepOutOfWindowDirection(), 60.0f, this.topOfSleep - 10, this.paint);
                    return;
                } else {
                    if (i13 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    m18530b(canvas, this.optimalSleepEndPixels - 100.0f);
                    canvas.drawBitmap(getOptimalSleepOutOfWindowDirection(), (this.optimalSleepEndPixels - 60.0f) - getOptimalSleepOutOfWindowDirection().getWidth(), this.topOfSleep - 10, this.paint);
                    return;
                }
            }
            float textSize = 40.0f;
            if (!(abstractC24635f instanceof C24633d)) {
                if (!(abstractC24635f instanceof C24634e)) {
                    throw new NoWhenBranchMatchedException();
                }
                List listM125906y0 = AbstractC39414r.m125906y0(this.optimalSleepTime, new String[]{"\n"}, 6);
                float size = this.topOfSleep / listM125906y0.size();
                canvas.drawText(this.optimalSleepText, this.optimalSleepMidPixels, size, this.optimaSleepPaintText);
                Iterator it = listM125906y0.iterator();
                while (it.hasNext()) {
                    canvas.drawText((String) it.next(), this.optimalSleepMidPixels, size + textSize, this.optimaSleepNoDataPaintText);
                    textSize += this.optimaSleepNoDataPaintText.getTextSize() + 10.0f;
                }
                float fMeasureText = this.optimaSleepNoDataPaintText.measureText(this.optimalSleepText) / 2;
                Paint paint = this.optimalSleepNoDataDottedLinePaint;
                LinearGradient linearGradient = this.leftToRightLinearGradient;
                if (linearGradient == null) {
                    AbstractC22676k.m65757q("leftToRightLinearGradient");
                    throw null;
                }
                paint.setShader(linearGradient);
                float f13 = size - 12.0f;
                float f14 = 30;
                canvas.drawLine(150.0f, f13, (this.optimalSleepMidPixels - fMeasureText) - f14, f13, this.optimalSleepNoDataDottedLinePaint);
                Paint paint2 = this.optimalSleepNoDataDottedLinePaint;
                LinearGradient linearGradient2 = this.rightToLeftLinearGradient;
                if (linearGradient2 == null) {
                    AbstractC22676k.m65757q("rightToLeftLinearGradient");
                    throw null;
                }
                paint2.setShader(linearGradient2);
                canvas.drawLine(this.optimalSleepMidPixels + fMeasureText + f14, f13, getWidth() - 150.0f, f13, this.optimalSleepNoDataDottedLinePaint);
                return;
            }
            C24633d c24633d = (C24633d) abstractC24635f;
            int i14 = C6221a.f24456a[c24633d.getOptimalSleepDirection().ordinal()];
            if (i14 == 1) {
                if (!c24633d.getIsOptimalTextCentered()) {
                    m18530b(canvas, this.optimalSleepEndPixels + 40.0f);
                    Bitmap bitmap3 = this.dashLineTopRightToBottomLeftPartialFit;
                    if (bitmap3 != null) {
                        canvas.drawBitmap(bitmap3, this.optimalSleepStartPixels, this.optimalSleepBarTop, this.paint);
                        return;
                    } else {
                        AbstractC22676k.m65757q("dashLineTopRightToBottomLeftPartialFit");
                        throw null;
                    }
                }
                int iM71973a = c24633d.getEndTimePixels() / 2;
                this.optimalSleepMidPixels = iM71973a;
                m18530b(canvas, iM71973a);
                Bitmap bitmap4 = this.dashLineTopRightToBottomLeftPartialFitOptimalTextCentered;
                if (bitmap4 == null) {
                    AbstractC22676k.m65757q("dashLineTopRightToBottomLeftPartialFitOptimalTextCentered");
                    throw null;
                }
                canvas.drawBitmap(bitmap4, (this.optimalTextLength / 2) + this.optimalSleepMidPixels + this.optimalTextPaddingOffset, this.optimalSleepBarTop, this.paint);
                float f15 = this.topOfSleep - 15.0f;
                canvas.drawLine(0.0f, f15, (this.optimalSleepMidPixels - (this.optimalTextLength / 2.0f)) - this.optimalTextPaddingOffset, f15, this.optimalSleepPartialLinePaint);
                this.paint.setColor(getContext().getColor(AbstractC36510a.f156021b0));
                return;
            }
            if (i14 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (!c24633d.getIsOptimalTextCentered()) {
                m18530b(canvas, this.optimalSleepStartPixels - 40.0f);
                Bitmap bitmap5 = this.dashLineTopLeftToBottomRightPartialFit;
                if (bitmap5 != null) {
                    canvas.drawBitmap(bitmap5, this.optimalSleepStartPixels, this.optimalSleepBarTop, this.paint);
                    return;
                } else {
                    AbstractC22676k.m65757q("dashLineTopLeftToBottomRightPartialFit");
                    throw null;
                }
            }
            int width = (getWidth() + c24633d.getStartPixels()) / 2;
            this.optimalSleepMidPixels = width;
            m18530b(canvas, width);
            Bitmap bitmap6 = this.dashLineTopLeftToBottomRightPartialFitOptimalTextCentered;
            if (bitmap6 == null) {
                AbstractC22676k.m65757q("dashLineTopLeftToBottomRightPartialFitOptimalTextCentered");
                throw null;
            }
            canvas.drawBitmap(bitmap6, this.optimalSleepStartPixels, this.optimalSleepBarTop, this.paint);
            canvas.drawLine((this.optimalTextLength / 2) + this.optimalSleepMidPixels + this.optimalTextPaddingOffset, this.topOfSleep - 15.0f, getWidth(), this.topOfSleep - 15.0f, this.optimalSleepPartialLinePaint);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptimalSleepView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        this.optimalTextPaddingOffset = 20;
        this.optimalSleepOutOfWindowDirection = AbstractC30060g.m92088H(new C24117a(this, 6));
        this.optimalSleepText = "";
        this.optimalSleepTime = "";
        this.topOfSleep = 120.0f;
        this.dashPathOnIntervals = 7.0f;
        this.dashPathOffIntervals = 7.0f;
        this.optimalSleepBitmapHeight = 100;
        this.paint = new Paint();
        this.optimalSleepFitOutOfWindowDrawable = AbstractC30311d.f124050u;
        Paint paint = new Paint();
        paint.setColor(context.getColor(AbstractC36510a.f156027f));
        paint.setTextSize(24.0f);
        setLeft(150);
        setRight(150);
        Paint.Align align = Paint.Align.CENTER;
        paint.setTextAlign(align);
        paint.setTypeface(AbstractC34523k.m109098b(context, AbstractC16273b.f62202c));
        this.optimaSleepNoDataPaintText = paint;
        Paint paint2 = new Paint();
        paint2.setColor(context.getColor(AbstractC36510a.f156013V));
        paint2.setTextSize(30.0f);
        paint2.setLetterSpacing(0.1f);
        paint2.setTextAlign(align);
        paint2.setTypeface(AbstractC34523k.m109098b(context, AbstractC16273b.f62200a));
        this.optimaSleepPaintText = paint2;
        Paint paint3 = new Paint();
        paint3.setColor(context.getColor(AbstractC36510a.f156027f));
        paint3.setTextSize(30.0f);
        paint3.setTextAlign(align);
        paint3.setTypeface(AbstractC34523k.m109098b(context, AbstractC16273b.f62203d));
        this.optimalSleepTimePaintText = paint3;
        Paint paint4 = new Paint();
        Paint.Style style = Paint.Style.STROKE;
        paint4.setStyle(style);
        paint4.setStrokeWidth(2.0f);
        paint4.setPathEffect(new DashPathEffect(new float[]{7.0f, 7.0f}, 0.0f));
        this.optimalSleepNoDataDottedLinePaint = paint4;
        Paint paint5 = new Paint();
        paint5.setStyle(style);
        paint5.setStrokeWidth(2.0f);
        paint5.setColor(context.getColor(AbstractC36510a.f156013V));
        paint5.setPathEffect(new DashPathEffect(new float[]{7.0f, 7.0f}, 0.0f));
        this.optimalSleepPartialLinePaint = paint5;
    }

    public /* synthetic */ OptimalSleepView(Context context, AttributeSet attributeSet, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }
}
