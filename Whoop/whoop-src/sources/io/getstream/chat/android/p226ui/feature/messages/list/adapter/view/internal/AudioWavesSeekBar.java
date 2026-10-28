package io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.app.NotificationCompat;
import c93.InterfaceC4339a;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.IntKt;
import java.util.List;
import live.hms.video.utils.HMSConstantsKt;
import n83.C26460c;
import p474s.C31990o1;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\u00102\b\b\u0001\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00102\b\b\u0001\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010#\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b%\u0010\u0012J\u001d\u0010+\u001a\u00020\u00102\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00100'H\u0000¢\u0006\u0004\b)\u0010*J#\u0010/\u001a\u00020\u00102\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00100,H\u0000¢\u0006\u0004\b-\u0010.J\u001f\u00102\u001a\u00020\u00102\u0006\u00100\u001a\u00020\t2\u0006\u00101\u001a\u00020\tH\u0014¢\u0006\u0004\b2\u0010$J\u0017\u00106\u001a\u0002052\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b6\u00107J\u0017\u0010:\u001a\u00020\u00102\u0006\u00109\u001a\u000208H\u0014¢\u0006\u0004\b:\u0010;R\u0014\u0010<\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010A\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010C\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010BR\u0014\u0010D\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010BR\u0018\u0010E\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010G\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010FR\u0018\u0010H\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082D¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010M\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u001c\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00100'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\"\u0010Q\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00100,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010S\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010=R\u0014\u0010U\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010W\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010VR\u001e\u0010Y\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010[\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010BR\u0016\u0010\\\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010BR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010NR\u0014\u0010^\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R0\u0010e\u001a\b\u0012\u0004\u0012\u00020\u000e0X2\f\u0010`\u001a\b\u0012\u0004\u0012\u00020\u000e0X8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\ba\u0010b\"\u0004\bc\u0010d¨\u0006f"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "seekWidth", "()I", "", NotificationCompat.CATEGORY_PROGRESS, "Ll83/a0;", "forceProgress", "(F)V", "positionX", "trackerPosition", "(F)F", "progressToX", "x", "xToProgress", "color", "setPlayedWaveBarColor", "(I)V", "setFutureWaveBarColor", "Landroid/graphics/drawable/Drawable;", "drawable", "setScrubberDrawable", "(Landroid/graphics/drawable/Drawable;)V", HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY, "pressed", "setScrubberWidth", "(II)V", "setProgress$stream_chat_android_ui_components_release", "setProgress", "Lkotlin/Function0;", "listener", "setOnStartDragListener$stream_chat_android_ui_components_release", "(Lc93/a;)V", "setOnStartDragListener", "Lkotlin/Function1;", "setOnEndDragListener$stream_chat_android_ui_components_release", "(Lkotlin/jvm/functions/Function1;)V", "setOnEndDragListener", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "Landroid/view/MotionEvent;", "motionEvent", "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "isRtl", "Z", "Landroid/widget/ImageView;", "tracker", "Landroid/widget/ImageView;", "barPadding", "I", "realPaddingStart", "realPaddingEnd", "barWidth", "Ljava/lang/Float;", "spaceWidth", "maxHeight", "Ljava/lang/Integer;", "", "barSpacing", "D", "barHeightRatio", "F", "onStartDrag", "Lc93/a;", "onEndDrag", "Lkotlin/jvm/functions/Function1;", "isDragging", "Landroid/graphics/Paint;", "paintPlayed", "Landroid/graphics/Paint;", "paintFuture", "", "internalWaveBars", "Ljava/util/List;", "defaultScrubberWidth", "pressedScrubberWidth", "Landroid/graphics/RectF;", "rect", "Landroid/graphics/RectF;", "value", "getWaveBars$stream_chat_android_ui_components_release", "()Ljava/util/List;", "setWaveBars$stream_chat_android_ui_components_release", "(Ljava/util/List;)V", "waveBars", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AudioWavesSeekBar extends LinearLayoutCompat {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ int f74614w = 0;
    private float barHeightRatio;
    private final int barPadding;
    private final double barSpacing;
    private Float barWidth;
    private int defaultScrubberWidth;
    private List<Float> internalWaveBars;
    private boolean isDragging;
    private final boolean isRtl;
    private Integer maxHeight;
    private Function1 onEndDrag;
    private InterfaceC4339a onStartDrag;
    private final Paint paintFuture;
    private final Paint paintPlayed;
    private int pressedScrubberWidth;
    private float progress;
    private final int realPaddingEnd;
    private final int realPaddingStart;
    private final RectF rect;
    private Float spaceWidth;
    private final ImageView tracker;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioWavesSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC22676k.m65750j(context, "context");
        Context context2 = getContext();
        AbstractC22676k.m65749i(context2, "getContext(...)");
        this.isRtl = ContextKt.isRtlLayout(context2);
        setOrientation(0);
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(C19469R.drawable.stream_ui_share_rectangle);
        this.tracker = imageView;
        addView(imageView, new C31990o1(-2, -1));
        this.realPaddingStart = getPaddingStart() + this.barPadding;
        this.realPaddingEnd = getPaddingEnd() + this.barPadding;
        this.barSpacing = 0.4d;
        this.barHeightRatio = 0.9f;
        this.onStartDrag = new C19777h(0);
        this.onEndDrag = new C19778i(1);
        Paint paint = new Paint();
        paint.setColor(AbstractC32122c.getColor(getContext(), C19469R.color.stream_ui_accent_blue));
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.paintPlayed = paint;
        Paint paint2 = new Paint();
        paint2.setColor(AbstractC32122c.getColor(getContext(), C19469R.color.stream_ui_grey));
        paint2.setStyle(style);
        this.paintFuture = paint2;
        this.defaultScrubberWidth = IntKt.dpToPx(7);
        this.pressedScrubberWidth = IntKt.dpToPx(10);
        this.rect = new RectF();
    }

    private final void forceProgress(float progress) {
        this.progress = progress;
        invalidate();
    }

    private final float progressToX(float progress) {
        float fSeekWidth = seekWidth();
        return this.isRtl ? ((1 - (progress / 100)) * fSeekWidth) + this.realPaddingStart : ((progress / 100) * fSeekWidth) + this.realPaddingStart;
    }

    private final int seekWidth() {
        return (getWidth() - this.realPaddingStart) - this.realPaddingEnd;
    }

    private final float trackerPosition(float positionX) {
        float f13;
        int width;
        int width2;
        int width3;
        if (this.isRtl) {
            f13 = this.realPaddingEnd;
            width = this.tracker.getWidth() / 2;
        } else {
            f13 = this.realPaddingStart;
            width = this.tracker.getWidth() / 2;
        }
        float f14 = f13 + width;
        if (this.isRtl) {
            width2 = getWidth() - this.realPaddingStart;
            width3 = this.tracker.getWidth() / 2;
        } else {
            width2 = getWidth() - this.realPaddingEnd;
            width3 = this.tracker.getWidth() / 2;
        }
        return Float.min(Math.max(f14, positionX), width2 - width3);
    }

    private final float xToProgress(float x3) {
        float fMin = Float.min(Math.max(this.realPaddingStart, x3), getWidth() - this.realPaddingEnd);
        if (this.isRtl) {
            return (((getWidth() - this.realPaddingEnd) - fMin) / seekWidth()) * 100;
        }
        return ((fMin - this.realPaddingStart) / seekWidth()) * 100;
    }

    public final List<Float> getWaveBars$stream_chat_android_ui_components_release() {
        List<Float> list = this.internalWaveBars;
        if (list != null) {
            return list;
        }
        C26460c c26460cM119000x = AbstractC37056f.m119000x();
        for (int i13 = 0; i13 < 40; i13++) {
            c26460cM119000x.add(Float.valueOf(0.0f));
        }
        return AbstractC37056f.m118988k(c26460cM119000x);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint;
        AbstractC22676k.m65750j(canvas, "canvas");
        super.onDraw(canvas);
        int size = getWaveBars$stream_chat_android_ui_components_release().size();
        int i13 = 0;
        for (Object obj : getWaveBars$stream_chat_android_ui_components_release()) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            float fFloatValue = ((Number) obj).floatValue();
            Integer num = this.maxHeight;
            AbstractC22676k.m65747g(num);
            float fMax = Math.max(fFloatValue, 0.05f) * num.intValue() * this.barHeightRatio;
            if (this.isRtl) {
                i13 = (size - 1) - i13;
            }
            Float f13 = this.barWidth;
            AbstractC22676k.m65747g(f13);
            float fFloatValue2 = f13.floatValue();
            Float f14 = this.spaceWidth;
            AbstractC22676k.m65747g(f14);
            float fFloatValue3 = ((f14.floatValue() + fFloatValue2) * i13) + this.realPaddingStart;
            Float f15 = this.barWidth;
            AbstractC22676k.m65747g(f15);
            float fFloatValue4 = f15.floatValue() + fFloatValue3;
            float f16 = 2;
            float height = (getHeight() - fMax) / f16;
            this.rect.set(fFloatValue3, height, fFloatValue4, fMax + height);
            if (this.isRtl) {
                float fProgressToX = progressToX(this.progress);
                Float f17 = this.barWidth;
                AbstractC22676k.m65747g(f17);
                paint = fProgressToX < (f17.floatValue() / f16) + fFloatValue3 ? this.paintPlayed : this.paintFuture;
            } else {
                float fProgressToX2 = progressToX(this.progress);
                Float f18 = this.barWidth;
                AbstractC22676k.m65747g(f18);
                paint = fProgressToX2 > (f18.floatValue() / f16) + fFloatValue3 ? this.paintPlayed : this.paintFuture;
            }
            this.tracker.setX(trackerPosition(progressToX(this.progress)) - (this.tracker.getWidth() / 2));
            RectF rectF = this.rect;
            Float f19 = this.barWidth;
            AbstractC22676k.m65747g(f19);
            float fFloatValue5 = f19.floatValue() / f16;
            Float f24 = this.barWidth;
            AbstractC22676k.m65747g(f24);
            canvas.drawRoundRect(rectF, fFloatValue5, f24.floatValue() / f16, paint);
            i13 = i14;
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        double measuredWidth = (getMeasuredWidth() - this.realPaddingStart) - this.realPaddingEnd;
        double d3 = this.barSpacing;
        float size = getWaveBars$stream_chat_android_ui_components_release().size();
        this.barWidth = Float.valueOf(((float) ((((double) 1) - d3) * measuredWidth)) / size);
        this.spaceWidth = Float.valueOf(((float) (measuredWidth * d3)) / size);
        this.maxHeight = Integer.valueOf((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC22676k.m65750j(motionEvent, "motionEvent");
        int action = motionEvent.getAction();
        if (action == 0) {
            performClick();
            this.isDragging = true;
            this.onStartDrag.invoke();
            getParent().requestDisallowInterceptTouchEvent(true);
            ImageView imageView = this.tracker;
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = this.pressedScrubberWidth;
            imageView.setLayoutParams(layoutParams);
            forceProgress(xToProgress(motionEvent.getX()));
            return true;
        }
        if (action == 1) {
            this.isDragging = false;
            this.onEndDrag.invoke(Integer.valueOf((int) xToProgress(motionEvent.getX())));
            getParent().requestDisallowInterceptTouchEvent(false);
            ImageView imageView2 = this.tracker;
            ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.width = this.defaultScrubberWidth;
            imageView2.setLayoutParams(layoutParams2);
            return true;
        }
        if (action == 2) {
            forceProgress(xToProgress(motionEvent.getX()));
            return true;
        }
        if (action != 3) {
            return super.onTouchEvent(motionEvent);
        }
        this.isDragging = false;
        getParent().requestDisallowInterceptTouchEvent(false);
        ImageView imageView3 = this.tracker;
        ViewGroup.LayoutParams layoutParams3 = imageView3.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams3.width = this.defaultScrubberWidth;
        imageView3.setLayoutParams(layoutParams3);
        return true;
    }

    public final void setFutureWaveBarColor(int color) {
        this.paintFuture.setColor(color);
    }

    public final void setOnEndDragListener$stream_chat_android_ui_components_release(Function1 listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.onEndDrag = listener;
    }

    public final void setOnStartDragListener$stream_chat_android_ui_components_release(InterfaceC4339a listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.onStartDrag = listener;
    }

    public final void setPlayedWaveBarColor(int color) {
        this.paintPlayed.setColor(color);
    }

    public final void setProgress$stream_chat_android_ui_components_release(float progress) {
        if (this.isDragging) {
            return;
        }
        this.progress = progress;
        invalidate();
    }

    public final void setScrubberDrawable(Drawable drawable) {
        this.tracker.setImageDrawable(drawable);
    }

    public final void setScrubberWidth(int i13, int pressed) {
        this.defaultScrubberWidth = i13;
        this.pressedScrubberWidth = pressed;
    }

    public final void setWaveBars$stream_chat_android_ui_components_release(List<Float> value) {
        AbstractC22676k.m65750j(value, "value");
        this.internalWaveBars = value;
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioWavesSeekBar(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        Context context2 = getContext();
        AbstractC22676k.m65749i(context2, "getContext(...)");
        this.isRtl = ContextKt.isRtlLayout(context2);
        setOrientation(0);
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(C19469R.drawable.stream_ui_share_rectangle);
        this.tracker = imageView;
        addView(imageView, new C31990o1(-2, -1));
        this.realPaddingStart = getPaddingStart() + this.barPadding;
        this.realPaddingEnd = getPaddingEnd() + this.barPadding;
        this.barSpacing = 0.4d;
        this.barHeightRatio = 0.9f;
        this.onStartDrag = new C19777h(0);
        this.onEndDrag = new C19778i(1);
        Paint paint = new Paint();
        paint.setColor(AbstractC32122c.getColor(getContext(), C19469R.color.stream_ui_accent_blue));
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.paintPlayed = paint;
        Paint paint2 = new Paint();
        paint2.setColor(AbstractC32122c.getColor(getContext(), C19469R.color.stream_ui_grey));
        paint2.setStyle(style);
        this.paintFuture = paint2;
        this.defaultScrubberWidth = IntKt.dpToPx(7);
        this.pressedScrubberWidth = IntKt.dpToPx(10);
        this.rect = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioWavesSeekBar(Context context) {
        super(context, null);
        AbstractC22676k.m65750j(context, "context");
        Context context2 = getContext();
        AbstractC22676k.m65749i(context2, "getContext(...)");
        this.isRtl = ContextKt.isRtlLayout(context2);
        setOrientation(0);
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(C19469R.drawable.stream_ui_share_rectangle);
        this.tracker = imageView;
        addView(imageView, new C31990o1(-2, -1));
        this.realPaddingStart = getPaddingStart() + this.barPadding;
        this.realPaddingEnd = getPaddingEnd() + this.barPadding;
        this.barSpacing = 0.4d;
        this.barHeightRatio = 0.9f;
        this.onStartDrag = new C19777h(0);
        this.onEndDrag = new C19778i(1);
        Paint paint = new Paint();
        paint.setColor(AbstractC32122c.getColor(getContext(), C19469R.color.stream_ui_accent_blue));
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.paintPlayed = paint;
        Paint paint2 = new Paint();
        paint2.setColor(AbstractC32122c.getColor(getContext(), C19469R.color.stream_ui_grey));
        paint2.setStyle(style);
        this.paintFuture = paint2;
        this.defaultScrubberWidth = IntKt.dpToPx(7);
        this.pressedScrubberWidth = IntKt.dpToPx(10);
        this.rect = new RectF();
    }
}
