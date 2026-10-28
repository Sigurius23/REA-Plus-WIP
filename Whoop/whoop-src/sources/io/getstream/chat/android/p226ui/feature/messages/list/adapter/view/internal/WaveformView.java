package io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.app.NotificationCompat;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import e93.AbstractC12889b;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.IntKt;
import java.util.ArrayList;
import java.util.List;
import l83.InterfaceC23462h;
import p474s.C31990o1;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082D¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010&R.\u00107\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\r068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R.\u0010=\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\r068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u00108\u001a\u0004\b>\u0010:\"\u0004\b?\u0010<R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010BR$\u0010F\u001a\u0012\u0012\u0004\u0012\u00020,0Dj\b\u0012\u0004\u0012\u00020,`E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR*\u0010I\u001a\u00020,2\u0006\u0010H\u001a\u00020,8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010R\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010QR$\u0010S\u001a\u00020\u00182\u0006\u0010H\u001a\u00020\u00188F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR0\u0010\\\u001a\b\u0012\u0004\u0012\u00020,0W2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020,0W8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[¨\u0006]"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "color", "Ll83/a0;", "setWaveformColor", "(I)V", "clearData", "()V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "isRtl", "Z", "Landroid/widget/ImageView;", "slider", "Landroid/widget/ImageView;", "barLimit", "I", "", "barWidth", "Ljava/lang/Float;", "spaceWidth", "maxHeight", "Ljava/lang/Integer;", "", "barSpacing", "D", "isDragging", "Lkotlin/Function1;", "onSliderDragStart", "Lkotlin/jvm/functions/Function1;", "getOnSliderDragStart", "()Lkotlin/jvm/functions/Function1;", "setOnSliderDragStart", "(Lkotlin/jvm/functions/Function1;)V", "onSliderDragStop", "getOnSliderDragStop", "setOnSliderDragStop", "Landroid/graphics/Paint;", "paintPassed", "Landroid/graphics/Paint;", "paintUpcoming", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "_waveform", "Ljava/util/ArrayList;", "value", NotificationCompat.CATEGORY_PROGRESS, "F", "getProgress", "()F", "setProgress", "(F)V", "Landroid/graphics/RectF;", "viewportRect", "Landroid/graphics/RectF;", "barRect", "isSliderVisible", "()Z", "setSliderVisible", "(Z)V", "", "getWaveform", "()Ljava/util/List;", "setWaveform", "(Ljava/util/List;)V", "waveform", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class WaveformView extends LinearLayoutCompat {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ int f74618w = 0;
    private final ArrayList<Float> _waveform;
    private int barLimit;
    private final RectF barRect;
    private final double barSpacing;
    private Float barWidth;
    private boolean isDragging;
    private final boolean isRtl;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private Integer maxHeight;
    private Function1 onSliderDragStart;
    private Function1 onSliderDragStop;
    private final Paint paintPassed;
    private final Paint paintUpcoming;
    private float progress;
    private final ImageView slider;
    private Float spaceWidth;
    private final RectF viewportRect;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WaveformView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC22676k.m65750j(context, "context");
        this.logger = AbstractC1772c1.m5382S(this, "WaveformView");
        Context context2 = getContext();
        AbstractC22676k.m65749i(context2, "getContext(...)");
        this.isRtl = ContextKt.isRtlLayout(context2);
        setOrientation(0);
        ImageView imageView = new ImageView(getContext());
        imageView.setBackgroundResource(C19469R.drawable.stream_ui_share_rectangle);
        imageView.setVisibility(8);
        this.slider = imageView;
        addView(imageView, new C31990o1(-2, -1));
        setWillNotDraw(false);
        this.barLimit = 100;
        this.barSpacing = 0.4d;
        this.onSliderDragStart = new C19778i(8);
        this.onSliderDragStop = new C19778i(8);
        Paint paint = new Paint();
        paint.setColor(AbstractC32122c.getColor(getContext(), C19469R.color.stream_ui_accent_blue));
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.paintPassed = paint;
        Paint paint2 = new Paint();
        paint2.setColor(AbstractC32122c.getColor(getContext(), C19469R.color.stream_ui_grey));
        paint2.setStyle(style);
        this.paintUpcoming = paint2;
        this._waveform = new ArrayList<>();
        this.viewportRect = new RectF();
        this.barRect = new RectF();
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    public final void clearData() {
        this._waveform.clear();
        invalidate();
    }

    public final Function1 getOnSliderDragStart() {
        return this.onSliderDragStart;
    }

    public final Function1 getOnSliderDragStop() {
        return this.onSliderDragStop;
    }

    public final float getProgress() {
        return this.progress;
    }

    public final List<Float> getWaveform() {
        return this._waveform;
    }

    public final boolean isSliderVisible() {
        return this.slider.getVisibility() == 0;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onDraw(Canvas canvas) {
        float f13;
        AbstractC22676k.m65750j(canvas, "canvas");
        super.onDraw(canvas);
        float fWidth = this.viewportRect.width();
        float f14 = fWidth / this.barLimit;
        float f15 = f14 - (0.3f * f14);
        float fHeight = this.viewportRect.height();
        float f16 = 2.0f;
        float height = getHeight() / 2.0f;
        int width = getWidth() - getPaddingEnd();
        int paddingStart = getPaddingStart();
        int iMax = Math.max(this._waveform.size() - this.barLimit, 0);
        float f17 = this.isRtl ? (1 - this.progress) * fWidth : this.progress * fWidth;
        int iM118951C = AbstractC37056f.m118951C(this._waveform);
        if (iMax <= iM118951C) {
            while (true) {
                Float f18 = this._waveform.get(iM118951C);
                AbstractC22676k.m65749i(f18, "get(...)");
                int i13 = iM118951C - iMax;
                f13 = f16;
                float fMax = Math.max(f18.floatValue() * fHeight, f15) / 2;
                float f19 = height - fMax;
                float f24 = fMax + height;
                float f25 = this.isRtl ? width - ((i13 + 1) * f14) : paddingStart + (i13 * f14);
                float f26 = f15 / f13;
                float f27 = f14;
                this.barRect.set(f25, f19, f25 + f15, f24);
                RectF rectF = this.barRect;
                float f28 = paddingStart;
                if (rectF.left < f28) {
                    rectF.left = f28;
                } else {
                    float f29 = width;
                    if (rectF.right > f29) {
                        rectF.right = f29;
                    }
                }
                canvas.drawRoundRect(this.barRect, f26, f26, !this.isRtl ? !isSliderVisible() || (this.barRect.centerX() > f17 ? 1 : (this.barRect.centerX() == f17 ? 0 : -1)) < 0 : !isSliderVisible() || (this.barRect.centerX() > f17 ? 1 : (this.barRect.centerX() == f17 ? 0 : -1)) > 0 ? this.paintPassed : this.paintUpcoming);
                if (iM118951C == iMax) {
                    break;
                }
                iM118951C--;
                f16 = f13;
                f14 = f27;
            }
        } else {
            f13 = 2.0f;
        }
        float width2 = f17 - ((this.isRtl ? this.slider.getWidth() : this.slider.getWidth()) / f13);
        RectF rectF2 = this.viewportRect;
        this.slider.setX(AbstractC12889b.m36283m(width2, rectF2.left, rectF2.right - this.slider.getWidth()));
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        double measuredWidth = (getMeasuredWidth() - getPaddingStart()) - getPaddingEnd();
        double d3 = this.barSpacing;
        float size = this._waveform.size();
        this.barWidth = Float.valueOf(((float) ((((double) 1) - d3) * measuredWidth)) / size);
        this.spaceWidth = Float.valueOf(((float) (measuredWidth * d3)) / size);
        this.maxHeight = Integer.valueOf((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        RectF rectF = this.viewportRect;
        rectF.left = getPaddingStart();
        rectF.right = getMeasuredWidth() - getPaddingEnd();
        rectF.top = getPaddingTop();
        rectF.bottom = getMeasuredHeight() - getPaddingBottom();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        AbstractC22676k.m65750j(event, "event");
        float width = this.isRtl ? getWidth() - event.getX() : event.getX();
        int action = event.getAction();
        if (action == 0) {
            this.isDragging = true;
            ImageView imageView = this.slider;
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = IntKt.dpToPx(10) + layoutParams.width;
            imageView.setLayoutParams(layoutParams);
            setProgress(width / this.viewportRect.width());
            this.onSliderDragStart.invoke(Float.valueOf(this.progress));
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                setProgress(width / this.viewportRect.width());
                return true;
            }
            if (action != 3) {
                return super.onTouchEvent(event);
            }
        }
        setProgress(width / this.viewportRect.width());
        this.onSliderDragStop.invoke(Float.valueOf(this.progress));
        this.isDragging = false;
        ImageView imageView2 = this.slider;
        ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams2.width -= IntKt.dpToPx(10);
        imageView2.setLayoutParams(layoutParams2);
        return true;
    }

    public final void setOnSliderDragStart(Function1 function1) {
        AbstractC22676k.m65750j(function1, "<set-?>");
        this.onSliderDragStart = function1;
    }

    public final void setOnSliderDragStop(Function1 function1) {
        AbstractC22676k.m65750j(function1, "<set-?>");
        this.onSliderDragStop = function1;
    }

    public final void setProgress(float f13) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[setProgress] progress: " + f13, null);
        }
        this.progress = f13;
        invalidate();
    }

    public final void setSliderVisible(boolean z4) {
        this.slider.setVisibility(z4 ? 0 : 8);
    }

    public final void setWaveform(List<Float> value) {
        AbstractC22676k.m65750j(value, "value");
        this._waveform.clear();
        this._waveform.addAll(value);
        invalidate();
    }

    public final void setWaveformColor(int color) {
        this.paintPassed.setColor(color);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WaveformView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        this.logger = AbstractC1772c1.m5382S(this, "WaveformView");
        Context context2 = getContext();
        AbstractC22676k.m65749i(context2, "getContext(...)");
        this.isRtl = ContextKt.isRtlLayout(context2);
        setOrientation(0);
        ImageView imageView = new ImageView(getContext());
        imageView.setBackgroundResource(C19469R.drawable.stream_ui_share_rectangle);
        imageView.setVisibility(8);
        this.slider = imageView;
        addView(imageView, new C31990o1(-2, -1));
        setWillNotDraw(false);
        this.barLimit = 100;
        this.barSpacing = 0.4d;
        this.onSliderDragStart = new C19778i(8);
        this.onSliderDragStop = new C19778i(8);
        Paint paint = new Paint();
        paint.setColor(AbstractC32122c.getColor(getContext(), C19469R.color.stream_ui_accent_blue));
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.paintPassed = paint;
        Paint paint2 = new Paint();
        paint2.setColor(AbstractC32122c.getColor(getContext(), C19469R.color.stream_ui_grey));
        paint2.setStyle(style);
        this.paintUpcoming = paint2;
        this._waveform = new ArrayList<>();
        this.viewportRect = new RectF();
        this.barRect = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WaveformView(Context context) {
        super(context, null);
        AbstractC22676k.m65750j(context, "context");
        this.logger = AbstractC1772c1.m5382S(this, "WaveformView");
        Context context2 = getContext();
        AbstractC22676k.m65749i(context2, "getContext(...)");
        this.isRtl = ContextKt.isRtlLayout(context2);
        setOrientation(0);
        ImageView imageView = new ImageView(getContext());
        imageView.setBackgroundResource(C19469R.drawable.stream_ui_share_rectangle);
        imageView.setVisibility(8);
        this.slider = imageView;
        addView(imageView, new C31990o1(-2, -1));
        setWillNotDraw(false);
        this.barLimit = 100;
        this.barSpacing = 0.4d;
        this.onSliderDragStart = new C19778i(8);
        this.onSliderDragStop = new C19778i(8);
        Paint paint = new Paint();
        paint.setColor(AbstractC32122c.getColor(getContext(), C19469R.color.stream_ui_accent_blue));
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.paintPassed = paint;
        Paint paint2 = new Paint();
        paint2.setColor(AbstractC32122c.getColor(getContext(), C19469R.color.stream_ui_grey));
        paint2.setStyle(style);
        this.paintUpcoming = paint2;
        this._waveform = new ArrayList<>();
        this.viewportRect = new RectF();
        this.barRect = new RectF();
    }
}
