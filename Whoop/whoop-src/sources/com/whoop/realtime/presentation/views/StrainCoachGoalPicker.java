package com.whoop.realtime.presentation.views;

import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import androidx.core.app.NotificationCompat;
import com.bumptech.glide.C4964f;
import com.bumptech.glide.ComponentCallbacks2C4960b;
import com.whoop.domain.model.User;
import de.hdodenhof.circleimageview.CircleImageView;
import e50.C12723b;
import i93.C18279e;
import k52.AbstractC22206b;
import k52.AbstractC22207c;
import l83.C23454a0;
import l83.C23465k;
import lh3.C24082e;
import nf1.AbstractC26664e;
import p087db.C11845e;
import p429ql.AbstractC30461g;
import p464rl.InterfaceC31508c;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pf.C29124b;
import q52.AbstractC29983a;
import qv1.C30654e;
import vu1.AbstractC36512c;
import wb3.AbstractC37056f;
import ze1.C40588d;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001a\u0010\u0011J\u0017\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001bH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010\u001eJ\u0017\u0010#\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001bH\u0016¢\u0006\u0004\b#\u0010\u001eJ1\u0010)\u001a\u00020\u00122\b\u0010$\u001a\u0004\u0018\u00010\u001b2\u0006\u0010%\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&H\u0016¢\u0006\u0004\b)\u0010*J1\u0010-\u001a\u00020\u00122\b\u0010$\u001a\u0004\u0018\u00010\u001b2\u0006\u0010%\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020&2\u0006\u0010,\u001a\u00020&H\u0016¢\u0006\u0004\b-\u0010*J\u0017\u0010.\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001bH\u0016¢\u0006\u0004\b.\u0010!J\u001d\u00101\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020&2\u0006\u00100\u001a\u00020&¢\u0006\u0004\b1\u00102J\u0013\u00104\u001a\b\u0012\u0004\u0012\u00020&03¢\u0006\u0004\b4\u00105J\u0013\u00107\u001a\b\u0012\u0004\u0012\u00020\u001206¢\u0006\u0004\b7\u00108J\r\u00109\u001a\u00020\u0012¢\u0006\u0004\b9\u0010:J\u0015\u0010<\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020&¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020\u000b¢\u0006\u0004\b>\u0010\rR*\u0010E\u001a\u00020&2\u0006\u0010?\u001a\u00020&8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010=R\u0016\u0010H\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010J\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010GR\u0018\u0010N\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010R\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020&038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020\u0012068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010Z\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010AR\u0016\u0010\\\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010AR\u0016\u0010^\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010AR\u0016\u0010`\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010AR\u0016\u0010d\u001a\u00020a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010f\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010AR\u0014\u0010j\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010l\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010iR\u0014\u0010n\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010iR\u0014\u0010p\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010iR\u0016\u0010r\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010AR\u0014\u0010v\u001a\u00020s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010x\u001a\u00020s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010uR\u0014\u0010z\u001a\u00020s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010uR\u0014\u0010}\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0018\u0010\u0081\u0001\u001a\u00020~8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u001a\u0010\u0085\u0001\u001a\u00030\u0082\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001a\u0010\u0087\u0001\u001a\u00030\u0082\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0084\u0001R\u001a\u0010\u0089\u0001\u001a\u00030\u0082\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0084\u0001R\u001c\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001¨\u0006\u008e\u0001"}, m65681d2 = {"Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;", "Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;", "Landroid/view/GestureDetector$OnGestureListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ll83/a0;", "u", "()V", "Landroid/graphics/Canvas;", "canvas", "x", "(Landroid/graphics/Canvas;)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "onDraw", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "e", "onShowPress", "(Landroid/view/MotionEvent;)V", "onSingleTapUp", "onDown", "e1", "e2", "", "velocityX", "velocityY", "onFling", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z", "distanceX", "distanceY", "onScroll", "onLongPress", "start", "end", "E", "(FF)V", "Lze1/d;", "A", "()Lze1/d;", "Llh3/e;", "z", "()Llh3/e;", "y", "()Z", "target", "v", "(F)V", "B", "value", "B0", "F", "getStrainGoal", "()F", "setStrainGoal", "strainGoal", "C0", "Z", "animating", "D0", "scrolling", "", "E0", "Ljava/lang/Double;", "lastTouchPct", "Landroid/view/GestureDetector;", "F0", "Landroid/view/GestureDetector;", "gestureDetector", "G0", "Lze1/d;", "goalSubject", "H0", "Llh3/e;", "scrollSubject", "I0", "controlDiameter", "J0", "controlIconDiameter", "K0", "controlBorderDiameter", "L0", "controlShadowDiameter", "Landroid/graphics/PointF;", "M0", "Landroid/graphics/PointF;", "controlCenterPoint", "N0", "currentGoalAngle", "Landroid/graphics/RectF;", "O0", "Landroid/graphics/RectF;", "controlRect", "P0", "controlIconRect", "Q0", "controlBorderRect", "R0", "controlShadowRect", "S0", "controlPulseScale", "Landroid/graphics/Paint;", "T0", "Landroid/graphics/Paint;", "controlPaint", "U0", "controlBorderPaint", "V0", "controlShadowPaint", "W0", "I", "controlShadowBaseColor", "Lde/hdodenhof/circleimageview/CircleImageView;", "X0", "Lde/hdodenhof/circleimageview/CircleImageView;", "controlAvatar", "Landroid/widget/ImageView;", "Y0", "Landroid/widget/ImageView;", "controlIcon", "Z0", "controlZero", "a1", "controlShadow", "Landroid/animation/ValueAnimator;", "b1", "Landroid/animation/ValueAnimator;", "animator", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class StrainCoachGoalPicker extends RealTimeStrainDial implements GestureDetector.OnGestureListener {

    /* JADX INFO: renamed from: B0, reason: from kotlin metadata */
    private float strainGoal;

    /* JADX INFO: renamed from: C0, reason: from kotlin metadata */
    private boolean animating;

    /* JADX INFO: renamed from: D0, reason: from kotlin metadata */
    private boolean scrolling;

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    private Double lastTouchPct;

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    private final GestureDetector gestureDetector;

    /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
    private final C40588d<Float> goalSubject;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    private final C24082e scrollSubject;

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    private float controlDiameter;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    private float controlIconDiameter;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    private float controlBorderDiameter;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    private float controlShadowDiameter;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    private PointF controlCenterPoint;

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    private float currentGoalAngle;

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    private final RectF controlRect;

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    private final RectF controlIconRect;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    private final RectF controlBorderRect;

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    private final RectF controlShadowRect;

    /* JADX INFO: renamed from: S0, reason: from kotlin metadata */
    private float controlPulseScale;

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    private final Paint controlPaint;

    /* JADX INFO: renamed from: U0, reason: from kotlin metadata */
    private final Paint controlBorderPaint;

    /* JADX INFO: renamed from: V0, reason: from kotlin metadata */
    private final Paint controlShadowPaint;

    /* JADX INFO: renamed from: W0, reason: from kotlin metadata */
    private final int controlShadowBaseColor;

    /* JADX INFO: renamed from: X0, reason: from kotlin metadata */
    private CircleImageView controlAvatar;

    /* JADX INFO: renamed from: Y0, reason: from kotlin metadata */
    private ImageView controlIcon;

    /* JADX INFO: renamed from: Z0, reason: from kotlin metadata */
    private ImageView controlZero;

    /* JADX INFO: renamed from: a1, reason: from kotlin metadata */
    private ImageView controlShadow;

    /* JADX INFO: renamed from: b1, reason: from kotlin metadata */
    private ValueAnimator animator;

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.views.StrainCoachGoalPicker$a */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, m65681d2 = {"com/whoop/realtime/presentation/views/StrainCoachGoalPicker$a", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animation", "Ll83/a0;", "onAnimationStart", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationRepeat", "onAnimationCancel", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9900a implements Animator.AnimatorListener {
        public C9900a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            AbstractC22676k.m65750j(animation, "animation");
            StrainCoachGoalPicker.this.animating = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            AbstractC22676k.m65750j(animation, "animation");
            StrainCoachGoalPicker.this.animating = false;
            StrainCoachGoalPicker strainCoachGoalPicker = StrainCoachGoalPicker.this;
            strainCoachGoalPicker.setStrainGoal(strainCoachGoalPicker.getStrainGoal());
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
            AbstractC22676k.m65750j(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            AbstractC22676k.m65750j(animation, "animation");
            StrainCoachGoalPicker.this.animating = true;
        }
    }

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.views.StrainCoachGoalPicker$b */
    @Metadata(m65680d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010\u0005\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0002\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"com/whoop/realtime/presentation/views/StrainCoachGoalPicker$b", "Lql/g;", "Landroid/graphics/Bitmap;", "resource", "Lrl/c;", "transition", "Ll83/a0;", "i", "(Landroid/graphics/Bitmap;Lrl/c;)V", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9901b extends AbstractC30461g {
        public C9901b() {
        }

        @Override // p429ql.InterfaceC30463i
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo5838b(Bitmap resource, InterfaceC31508c transition) {
            AbstractC22676k.m65750j(resource, "resource");
            StrainCoachGoalPicker.this.controlAvatar.setImageBitmap(resource);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StrainCoachGoalPicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC22676k.m65750j(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m24186C(StrainCoachGoalPicker strainCoachGoalPicker, float f13) {
        strainCoachGoalPicker.controlPulseScale = f13;
        strainCoachGoalPicker.m24193u();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m24187D() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: u */
    private final void m24193u() {
        float f13 = this.strainGoal * 360.0f;
        this.currentGoalAngle = f13;
        double radians = (float) Math.toRadians(f13);
        float dialRadius = (getDialRadius() * ((float) Math.sin(radians))) + getDialCenterPoint().x;
        float dialRadius2 = (getDialRadius() * (-((float) Math.cos(radians)))) + getDialCenterPoint().y;
        RectF rectF = this.controlRect;
        float f14 = this.controlDiameter;
        float f15 = this.controlPulseScale;
        float f16 = 2;
        rectF.left = dialRadius - ((f14 * f15) / f16);
        rectF.top = dialRadius2 - ((f14 * f15) / f16);
        rectF.right = ((f14 * f15) / f16) + dialRadius;
        rectF.bottom = ((f14 * f15) / f16) + dialRadius2;
        RectF rectF2 = this.controlIconRect;
        float f17 = this.controlIconDiameter;
        rectF2.left = dialRadius - ((f17 * f15) / f16);
        rectF2.top = dialRadius2 - ((f17 * f15) / f16);
        rectF2.right = ((f17 * f15) / f16) + dialRadius;
        rectF2.bottom = ((f17 * f15) / f16) + dialRadius2;
        RectF rectF3 = this.controlBorderRect;
        float f18 = this.controlBorderDiameter;
        rectF3.left = dialRadius - ((f18 * f15) / f16);
        rectF3.top = dialRadius2 - ((f18 * f15) / f16);
        rectF3.right = ((f18 * f15) / f16) + dialRadius;
        rectF3.bottom = ((f18 * f15) / f16) + dialRadius2;
        RectF rectF4 = this.controlShadowRect;
        float f19 = this.controlShadowDiameter;
        rectF4.left = dialRadius - ((f19 * f15) / f16);
        rectF4.top = dialRadius2 - ((f19 * f15) / f16);
        rectF4.right = ((f19 * f15) / f16) + dialRadius;
        rectF4.bottom = ((f19 * f15) / f16) + dialRadius2;
        this.controlCenterPoint = new PointF(dialRadius, dialRadius2);
        float f24 = this.controlShadowDiameter * this.controlPulseScale;
        this.controlShadowPaint.setShader(new RadialGradient(this.controlShadowRect.width() / f16, this.controlShadowRect.height() / f16, this.controlShadowRect.height() / f16, this.controlShadowBaseColor, 0, Shader.TileMode.CLAMP));
        this.controlShadow.setBackgroundColor(getResources().getColor(R.color.transparent));
        int i13 = (int) f24;
        this.controlShadow.layout(0, 0, i13, i13);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.controlShadow.getWidth(), this.controlShadow.getHeight(), Bitmap.Config.ARGB_8888);
        AbstractC22676k.m65749i(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        float f25 = f24 / f16;
        canvas.drawCircle(f25, f25, f25, this.controlShadowPaint);
        float f26 = (this.controlBorderDiameter * this.controlPulseScale) / f16;
        Paint paint = new Paint();
        paint.setColor(0);
        canvas.drawCircle(f25, f25, f26, paint);
        this.controlShadow.setImageBitmap(bitmapCreateBitmap);
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final void m24194w(StrainCoachGoalPicker strainCoachGoalPicker, ValueAnimator it) {
        AbstractC22676k.m65750j(it, "it");
        Object animatedValue = it.getAnimatedValue();
        AbstractC22676k.m65748h(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        strainCoachGoalPicker.setStrainGoal(((Float) animatedValue).floatValue());
    }

    /* JADX INFO: renamed from: x */
    private final void m24195x(Canvas canvas) {
        View view;
        if (canvas != null) {
            if (((double) this.strainGoal) * 21.0d < 0.10000000149011612d) {
                view = this.controlZero;
            } else {
                view = getOptimalRange().mo52654c(Float.valueOf(this.strainGoal)) ? this.controlIcon : this.controlAvatar;
            }
            RectF rectF = (((double) this.strainGoal) * 21.0d >= 0.10000000149011612d && !getOptimalRange().mo52654c(Float.valueOf(this.strainGoal))) ? this.controlRect : this.controlIconRect;
            canvas.save();
            RectF rectF2 = this.controlShadowRect;
            canvas.translate(rectF2.left, rectF2.top);
            this.controlShadow.draw(canvas);
            canvas.restore();
            canvas.drawOval(this.controlBorderRect, this.controlBorderPaint);
            canvas.drawOval(this.controlRect, this.controlPaint);
            view.layout(0, 0, (int) rectF.width(), (int) rectF.height());
            canvas.save();
            canvas.translate(rectF.left, rectF.top);
            view.draw(canvas);
            canvas.restore();
        }
    }

    /* JADX INFO: renamed from: A */
    public final C40588d<Float> m24196A() {
        return this.goalSubject;
    }

    /* JADX INFO: renamed from: B */
    public final void m24197B() {
        int integer = getResources().getInteger(AbstractC26664e.f106005f);
        Float fValueOf = Float.valueOf(1.0f);
        int i13 = integer / 4;
        AbstractC29983a.m91706b(AbstractC37056f.m118959K(new C23465k(fValueOf, Integer.valueOf(i13)), new C23465k(Float.valueOf(1.5f), Integer.valueOf(i13)), new C23465k(fValueOf, Integer.valueOf(i13)), new C23465k(Float.valueOf(1.3f), Integer.valueOf(i13)), new C23465k(fValueOf, 0)), new C29124b(this, 22), new C30654e(16));
    }

    /* JADX INFO: renamed from: E */
    public final void m24198E(float start, float end) {
        setOptimalRange(new C18279e(start, end));
    }

    public final float getStrainGoal() {
        return this.strainGoal;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent e5) {
        AbstractC22676k.m65750j(e5, "e");
        if (!this.controlBorderRect.contains(e5.getX(), e5.getY())) {
            return false;
        }
        this.scrolling = true;
        this.scrollSubject.onNext(Boolean.TRUE);
        return true;
    }

    @Override // com.whoop.realtime.presentation.views.RealTimeStrainDial, com.whoop.p069ui.ProgressDial, android.view.View
    public void onDraw(Canvas canvas) {
        AbstractC22676k.m65750j(canvas, "canvas");
        super.onDraw(canvas);
        m24195x(canvas);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent e5, MotionEvent e13, float velocityX, float velocityY) {
        AbstractC22676k.m65750j(e13, "e2");
        return false;
    }

    @Override // com.whoop.realtime.presentation.views.RealTimeStrainDial, com.whoop.p069ui.ProgressDial, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        m24193u();
        this.controlAvatar.setImageDrawable(AbstractC32122c.getDrawable(getContext(), AbstractC36512c.f156071n));
        User userM84055f = C12723b.m35566a().m35572g().m84055f();
        if (userM84055f != null) {
            C4964f c4964fM15546j = ComponentCallbacks2C4960b.m15529e(getContext()).m15546j();
            c4964fM15546j.f20321Y = userM84055f.getAvatarUrl();
            c4964fM15546j.f20323a0 = true;
            c4964fM15546j.m15538z(new C9901b());
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent e5) {
        AbstractC22676k.m65750j(e5, "e");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent e5, MotionEvent e13, float distanceX, float distanceY) {
        AbstractC22676k.m65750j(e13, "e2");
        if (!this.scrolling) {
            this.scrolling = true;
            this.scrollSubject.onNext(Boolean.TRUE);
        }
        double dAtan2 = (float) Math.atan2(getDialCenterPoint().y - e13.getY(), getDialCenterPoint().x - e13.getX());
        if (dAtan2 < 0.0d) {
            dAtan2 = (3.141592653589793d - Math.abs(dAtan2)) + 3.141592653589793d;
        }
        double degrees = Math.toDegrees(dAtan2) - ((double) 90.0f);
        if (degrees > 360.0d) {
            degrees -= (double) 360.0f;
        }
        if (degrees < 0.0d) {
            degrees += (double) 360.0f;
        }
        double dAbs = Math.abs(degrees / ((double) 360));
        Double d3 = this.lastTouchPct;
        if (d3 != null) {
            double dDoubleValue = d3.doubleValue();
            double d14 = (((dDoubleValue > 0.5d ? 1 : (dDoubleValue == 0.5d ? 0 : -1)) < 0) && ((Math.abs(dAbs - dDoubleValue) > 0.5d ? 1 : (Math.abs(dAbs - dDoubleValue) == 0.5d ? 0 : -1)) > 0)) ? 0.0d : dAbs;
            dAbs = ((dDoubleValue > 0.5d ? 1 : (dDoubleValue == 0.5d ? 0 : -1)) >= 0) & (Math.abs(d14 - dDoubleValue) > 0.5d) ? 0.999d : d14;
        }
        this.lastTouchPct = Double.valueOf(dAbs);
        setStrainGoal((float) dAbs);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent e5) {
        AbstractC22676k.m65750j(e5, "e");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent e5) {
        AbstractC22676k.m65750j(e5, "e");
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        AbstractC22676k.m65750j(event, "event");
        if (this.scrolling & (event.getAction() == 1)) {
            this.scrolling = false;
            this.scrollSubject.onNext(Boolean.FALSE);
            this.lastTouchPct = Double.valueOf(this.f31550N);
        }
        if (this.gestureDetector.onTouchEvent(event)) {
            return true;
        }
        return super.onTouchEvent(event);
    }

    public final void setStrainGoal(float f13) {
        this.strainGoal = f13;
        this.goalSubject.onNext(Float.valueOf(f13));
        setGoalPct(f13);
        setProgress(f13);
        m24193u();
    }

    /* JADX INFO: renamed from: v */
    public final void m24199v(float target) {
        if (target == 0.0f) {
            this.lastTouchPct = Double.valueOf(0.01d);
        }
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            valueAnimator.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.strainGoal, target);
        valueAnimatorOfFloat.addUpdateListener(new C11845e(this, 8));
        valueAnimatorOfFloat.addListener(new C9900a());
        valueAnimatorOfFloat.setDuration(getResources().getInteger(AbstractC26664e.f106000a));
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.start();
        this.animator = valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final boolean getAnimating() {
        return this.animating;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final C24082e getScrollSubject() {
        return this.scrollSubject;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StrainCoachGoalPicker(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        this.gestureDetector = new GestureDetector(context, this);
        C40588d<Float> c40588dM131622Y = C40588d.m131622Y();
        AbstractC22676k.m65749i(c40588dM131622Y, "createSingle(...)");
        this.goalSubject = c40588dM131622Y;
        this.scrollSubject = C24082e.m71000Y();
        float f13 = this.f31547K;
        this.controlDiameter = 2.6f * f13;
        this.controlIconDiameter = 1.5f * f13;
        this.controlBorderDiameter = 3.2f * f13;
        this.controlShadowDiameter = f13 * 4.5f;
        this.controlCenterPoint = new PointF(0.0f, 0.0f);
        this.controlRect = new RectF();
        this.controlIconRect = new RectF();
        this.controlBorderRect = new RectF();
        this.controlShadowRect = new RectF();
        this.controlPulseScale = 1.0f;
        Paint paint = new Paint();
        paint.setColor(-1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.controlPaint = paint;
        Paint paint2 = new Paint();
        paint2.setColor(getResources().getColor(AbstractC22206b.f86251j));
        paint2.setStyle(style);
        this.controlBorderPaint = paint2;
        Paint paint3 = new Paint();
        paint3.setStyle(style);
        this.controlShadowPaint = paint3;
        this.controlShadowBaseColor = getResources().getColor(AbstractC22206b.f86252k);
        this.controlAvatar = new CircleImageView(context);
        this.controlIcon = new ImageView(context);
        this.controlZero = new ImageView(context);
        this.controlShadow = new ImageView(context);
        this.controlIcon.setImageDrawable(AbstractC32122c.getDrawable(context, AbstractC36512c.f156072o));
        this.controlZero.setImageDrawable(AbstractC32122c.getDrawable(context, AbstractC22207c.f86268i));
        setDrawGoalIcon(false);
    }

    public /* synthetic */ StrainCoachGoalPicker(Context context, AttributeSet attributeSet, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }
}
