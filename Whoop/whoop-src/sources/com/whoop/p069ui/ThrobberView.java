package com.whoop.p069ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.annotation.Keep;
import com.whoop.p069ui.views.ColoredImageView;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.LinkedList;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import vu1.AbstractC36512c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000=\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0006*\u0001\u001b\u0018\u00002\u00020\u0001:\u0001\u001fB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000f\u0010\nJ\u000f\u0010\u0010\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0010\u0010\nJ\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\nJ\r\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\nR\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, m65681d2 = {"Lcom/whoop/ui/ThrobberView;", "Lcom/whoop/ui/views/ColoredImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Ll83/a0;", "e", "()V", "", "scale", "setScale", "(F)V", "onAttachedToWindow", "onDetachedFromWindow", "f", "g", "Landroid/animation/AnimatorSet;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Landroid/animation/AnimatorSet;", "animation", "", "x", "Z", "isAnimating", "com/whoop/ui/m", "y", "Lcom/whoop/ui/m;", "listener", "a", "legacy_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ThrobberView extends ColoredImageView {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private AnimatorSet animation;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private boolean isAnimating;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C10596m listener;

    /* JADX INFO: renamed from: com.whoop.ui.ThrobberView$a */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m65681d2 = {"Lcom/whoop/ui/ThrobberView$a;", "", "Lcom/whoop/ui/ThrobberView;", "target", "<init>", "(Lcom/whoop/ui/ThrobberView;)V", "", "scale", "", AttachmentExtensionsKt.EXTRA_DURATION, "a", "(FJ)Lcom/whoop/ui/ThrobberView$a;", "Landroid/animation/AnimatorSet;", "b", "()Landroid/animation/AnimatorSet;", "Lcom/whoop/ui/ThrobberView;", "Ljava/util/LinkedList;", "Landroid/animation/Animator;", "Ljava/util/LinkedList;", "animators", "c", "F", "prevScale", "legacy_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10450a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final ThrobberView target;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final LinkedList<Animator> animators;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private float prevScale;

        public C10450a(ThrobberView target) {
            AbstractC22676k.m65750j(target, "target");
            this.target = target;
            this.animators = new LinkedList<>();
            this.prevScale = target.getScaleX();
        }

        /* JADX INFO: renamed from: a */
        public final C10450a m26665a(float scale, long duration) {
            this.animators.add(ObjectAnimator.ofFloat(this.target, "scale", this.prevScale, scale).setDuration(duration));
            this.prevScale = scale;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public final AnimatorSet m26666b() {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(this.animators);
            return animatorSet;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThrobberView(Context context, AttributeSet attrs) {
        super(context, attrs);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(attrs, "attrs");
        this.listener = new C10596m(this);
        m26662e();
    }

    /* JADX INFO: renamed from: e */
    private final void m26662e() {
        if (getDrawable() == null) {
            setImageResource(AbstractC36512c.f156072o);
        }
        setScale(1.0f);
        AnimatorSet animatorSetM26666b = new C10450a(this).m26665a(0.9375f, 88L).m26665a(1.25f, 132L).m26665a(0.9375f, 88L).m26665a(1.15f, 88L).m26665a(0.9375f, 154L).m26665a(1.0f, 550L).m26666b();
        this.animation = animatorSetM26666b;
        if (animatorSetM26666b != null) {
            animatorSetM26666b.setInterpolator(new AccelerateDecelerateInterpolator());
        } else {
            AbstractC22676k.m65757q("animation");
            throw null;
        }
    }

    @Keep
    private final void setScale(float scale) {
        setScaleX(scale);
        setScaleY(scale);
    }

    /* JADX INFO: renamed from: f */
    public final void m26663f() {
        if (this.isAnimating) {
            return;
        }
        this.isAnimating = true;
        AnimatorSet animatorSet = this.animation;
        if (animatorSet != null) {
            animatorSet.start();
        } else {
            AbstractC22676k.m65757q("animation");
            throw null;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m26664g() {
        if (this.isAnimating) {
            AnimatorSet animatorSet = this.animation;
            if (animatorSet == null) {
                AbstractC22676k.m65757q("animation");
                throw null;
            }
            animatorSet.cancel();
            this.isAnimating = false;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        AnimatorSet animatorSet = this.animation;
        if (animatorSet == null) {
            AbstractC22676k.m65757q("animation");
            throw null;
        }
        ArrayList<Animator.AnimatorListener> listeners = animatorSet.getListeners();
        if (listeners != null && !listeners.contains(this.listener)) {
            AnimatorSet animatorSet2 = this.animation;
            if (animatorSet2 == null) {
                AbstractC22676k.m65757q("animation");
                throw null;
            }
            animatorSet2.addListener(this.listener);
        }
        super.onAttachedToWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.animation;
        if (animatorSet != null) {
            animatorSet.removeListener(this.listener);
        } else {
            AbstractC22676k.m65757q("animation");
            throw null;
        }
    }
}
