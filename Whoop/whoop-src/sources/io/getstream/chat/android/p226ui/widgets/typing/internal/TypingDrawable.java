package io.getstream.chat.android.p226ui.widgets.typing.internal;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.utils.extensions.IntKt;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 72\u00020\u00012\u00020\u0002:\u00017B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\"\u0010#J\u0019\u0010&\u001a\u00020\u000f2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0007H\u0016¢\u0006\u0004\b(\u0010\u001bR\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010-R\u0014\u0010/\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00100R\u0014\u00102\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00100R\u001c\u00105\u001a\n 4*\u0004\u0018\u000103038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u00068"}, m65681d2 = {"Lio/getstream/chat/android/ui/widgets/typing/internal/TypingDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Animatable;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "dotIndex", "", "phase", "calculateAlpha", "(IF)I", "calculateCx", "(I)F", "Ll83/a0;", "start", "()V", "stop", "", "isRunning", "()Z", "visible", "restart", "setVisible", "(ZZ)Z", "getIntrinsicWidth", "()I", "getIntrinsicHeight", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "alpha", "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "intrinsicHeight", "I", "intrinsicWidth", "dotSpacingPx", "F", "dotDiameterPx", "dotRadiusPx", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "animator", "Landroid/animation/ValueAnimator;", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
final class TypingDrawable extends Drawable implements Animatable {
    private static final int ANIMATION_OFFSET_MILLIS = 166;
    private static final int DELAY_DURATION_MILLIS = 300;
    private static final int DOTS_ANIMATION_DURATION_MILLIS = 500;
    private static final int DOT_COUNT = 3;
    private static final int DOT_SIZE_DP = 5;
    private static final int DOT_SPACING_DP = 3;
    private static final int FULL_ANIMATION_DURATION = 800;
    private final ValueAnimator animator;
    private final float dotDiameterPx;
    private final float dotRadiusPx;
    private final float dotSpacingPx;
    private final int intrinsicHeight;
    private final int intrinsicWidth;
    private final Paint paint;

    public TypingDrawable(Context context) {
        AbstractC22676k.m65750j(context, "context");
        Paint paint = new Paint();
        this.paint = paint;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 800.0f);
        valueAnimatorOfFloat.setDuration(800L);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: io.getstream.chat.android.ui.widgets.typing.internal.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                TypingDrawable.animator$lambda$1$lambda$0(this.f74899a, valueAnimator);
            }
        });
        this.animator = valueAnimatorOfFloat;
        paint.setColor(AbstractC32122c.getColor(context, C19469R.color.stream_ui_grey));
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.dotSpacingPx = IntKt.dpToPxPrecise(3);
        float fDpToPxPrecise = IntKt.dpToPxPrecise(5);
        this.dotDiameterPx = fDpToPxPrecise;
        this.dotRadiusPx = fDpToPxPrecise / 2;
        this.intrinsicWidth = IntKt.dpToPx(24);
        this.intrinsicHeight = IntKt.dpToPx(5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animator$lambda$1$lambda$0(TypingDrawable typingDrawable, ValueAnimator it) {
        AbstractC22676k.m65750j(it, "it");
        typingDrawable.invalidateSelf();
    }

    private final int calculateAlpha(int dotIndex, float phase) {
        float f13 = (phase + ((3 - dotIndex) * ANIMATION_OFFSET_MILLIS)) % FULL_ANIMATION_DURATION;
        return (int) ((((f13 > 500.0f ? 0.0f : (float) Math.abs(Math.sin((((double) f13) * 3.141592653589793d) / ((double) 500.0f)))) * 0.5f) + 0.5f) * 255);
    }

    private final float calculateCx(int dotIndex) {
        float f13 = dotIndex;
        return (f13 * this.dotSpacingPx) + (this.dotDiameterPx * f13) + this.dotRadiusPx;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        AbstractC22676k.m65750j(canvas, "canvas");
        Object animatedValue = this.animator.getAnimatedValue();
        Float f13 = animatedValue instanceof Float ? (Float) animatedValue : null;
        float fFloatValue = f13 != null ? f13.floatValue() : 0.0f;
        for (int i13 = 0; i13 < 3; i13++) {
            this.paint.setAlpha(calculateAlpha(i13, fFloatValue));
            float fCalculateCx = calculateCx(i13);
            float f14 = this.dotRadiusPx;
            canvas.drawCircle(fCalculateCx, f14, f14, this.paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.intrinsicHeight;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.intrinsicWidth;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.animator.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int alpha) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean visible, boolean restart) {
        boolean visible2 = super.setVisible(visible, restart);
        if (visible) {
            start();
            return visible2;
        }
        stop();
        return visible2;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (this.animator.isStarted()) {
            return;
        }
        this.animator.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.animator.cancel();
    }
}
