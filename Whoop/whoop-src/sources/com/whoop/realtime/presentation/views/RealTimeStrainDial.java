package com.whoop.realtime.presentation.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import androidx.core.app.NotificationCompat;
import com.bumptech.glide.C4964f;
import com.bumptech.glide.ComponentCallbacks2C4960b;
import com.whoop.domain.model.User;
import com.whoop.p069ui.ProgressDial;
import de.hdodenhof.circleimageview.CircleImageView;
import e50.C12723b;
import gy0.AbstractC16273b;
import i93.C18279e;
import i93.InterfaceC18280f;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Locale;
import k52.AbstractC22207c;
import k52.AbstractC22210f;
import k52.AbstractC22212h;
import l83.C23454a0;
import l83.C23465k;
import nf1.AbstractC26664e;
import p031b9.AbstractC2875y;
import p429ql.AbstractC30461g;
import p464rl.InterfaceC31508c;
import p479s4.AbstractC32122c;
import p513u4.AbstractC34523k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pf.C29124b;
import q52.AbstractC29983a;
import q80.C30036h;
import vu1.AbstractC36510a;
import vu1.AbstractC36511b;
import vu1.AbstractC36512c;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0017\u0018\u0000 \u0088\u00012\u00020\u0001:\u0002\u0089\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u000eJ\u0015\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u000f¢\u0006\u0004\b\u001d\u0010\u0012J\u0015\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010\u000eJ\u0017\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u000fH\u0016¢\u0006\u0004\b!\u0010\u0012J\u001f\u0010$\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006H\u0014¢\u0006\u0004\b$\u0010%J7\u0010+\u001a\u00020\f2\u0006\u0010&\u001a\u00020\n2\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u0006H\u0014¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\f2\u0006\u0010.\u001a\u00020-H\u0014¢\u0006\u0004\b/\u00100R6\u00108\u001a\b\u0012\u0004\u0012\u00020\u000f012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u000f018\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010B\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010?R\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010I\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010K\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010HR\u0016\u0010M\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010HR\u0016\u0010O\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010HR\u0016\u0010Q\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010HR\u0016\u0010S\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010HR\u0016\u0010U\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010HR\u0016\u0010W\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010HR\u0016\u0010Y\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010HR\u0014\u0010]\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010a\u001a\u00020^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010d\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010f\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010\\R\u0016\u0010j\u001a\u00020g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010n\u001a\u00020k8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010p\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010?R\u0014\u0010t\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0016\u0010v\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010cR\u0014\u0010x\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010\\R\u0014\u0010z\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010?R\u0016\u0010|\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010cR%\u0010\u0082\u0001\u001a\u00020g8\u0004@\u0004X\u0084\u000e¢\u0006\u0014\n\u0004\b}\u0010i\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R'\u0010\u0087\u0001\u001a\u00020\u000f8\u0004@\u0004X\u0084\u000e¢\u0006\u0016\n\u0005\b\u0083\u0001\u0010H\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0005\b\u0086\u0001\u0010\u0012¨\u0006\u008a\u0001"}, m65681d2 = {"Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;", "Lcom/whoop/ui/ProgressDial;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "value", "Ll83/a0;", "setFillWhite", "(Z)V", "", NotificationCompat.CATEGORY_PROGRESS, "o", "(F)V", "j", "()V", "k", "l", "angle", "i", "(F)F", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "setDrawGoalIcon", "textSize", "setOptimalLabelTextSize", "animate", "setGoalReached", "goalPct", "setGoalPct", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Li93/f;", "S", "Li93/f;", "getOptimalRange", "()Li93/f;", "setOptimalRange", "(Li93/f;)V", "optimalRange", "Landroid/graphics/Path;", "T", "Landroid/graphics/Path;", "optimalRangePath", "Landroid/graphics/Paint;", "U", "Landroid/graphics/Paint;", "optimalRangePaint", "V", "optimalLabelPaint", "", "W", "Ljava/lang/String;", "optimalString", "a0", "F", "optimalLabelLength", "b0", "optimalLabelHeight", "c0", "optimalRangeRadius", "d0", "totalOptimalArcLength", "e0", "totalOptimalArcAngle", "f0", "arcSegmentLength", "g0", "firstSegmentStartAngle", "h0", "secondSegmentStartAngle", "i0", "segmentSweepAngle", "Landroid/graphics/RectF;", "j0", "Landroid/graphics/RectF;", "optimalRangeRect", "Landroid/graphics/Typeface;", "k0", "Landroid/graphics/Typeface;", "labelTypeface", "l0", "Z", "drawGoalIcon", "m0", "goalIconRect", "Landroid/graphics/PointF;", "n0", "Landroid/graphics/PointF;", "goalIconCenterPoint", "Landroid/widget/ImageView;", "o0", "Landroid/widget/ImageView;", "goalIcon", "p0", "goalIconPaint", "Lde/hdodenhof/circleimageview/CircleImageView;", "q0", "Lde/hdodenhof/circleimageview/CircleImageView;", "goalAvatar", "r0", "fillWhite", "s0", "fillWhiteRect", "t0", "fillWhitePaint", "u0", "goalReached", "v0", "getDialCenterPoint", "()Landroid/graphics/PointF;", "setDialCenterPoint", "(Landroid/graphics/PointF;)V", "dialCenterPoint", "w0", "getDialRadius", "()F", "setDialRadius", "dialRadius", "x0", "a", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public class RealTimeStrainDial extends ProgressDial {

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private InterfaceC18280f optimalRange;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private final Path optimalRangePath;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private final Paint optimalRangePaint;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private final Paint optimalLabelPaint;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private final String optimalString;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    private float optimalLabelLength;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    private float optimalLabelHeight;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    private float optimalRangeRadius;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    private float totalOptimalArcLength;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    private float totalOptimalArcAngle;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    private float arcSegmentLength;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    private float firstSegmentStartAngle;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    private float secondSegmentStartAngle;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    private float segmentSweepAngle;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    private final RectF optimalRangeRect;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    private Typeface labelTypeface;

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    private boolean drawGoalIcon;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    private final RectF goalIconRect;

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    private PointF goalIconCenterPoint;

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    private ImageView goalIcon;

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    private final Paint goalIconPaint;

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    private final CircleImageView goalAvatar;

    /* JADX INFO: renamed from: r0, reason: from kotlin metadata */
    private boolean fillWhite;

    /* JADX INFO: renamed from: s0, reason: from kotlin metadata */
    private final RectF fillWhiteRect;

    /* JADX INFO: renamed from: t0, reason: from kotlin metadata */
    private final Paint fillWhitePaint;

    /* JADX INFO: renamed from: u0, reason: from kotlin metadata */
    private boolean goalReached;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    private PointF dialCenterPoint;

    /* JADX INFO: renamed from: w0, reason: from kotlin metadata */
    private float dialRadius;

    /* JADX INFO: renamed from: y0 */
    public static final int f29081y0 = 8;

    /* JADX INFO: renamed from: z0 */
    private static final float f29082z0 = 52.0f;

    /* JADX INFO: renamed from: A0 */
    private static final float f29079A0 = 34.0f;

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.views.RealTimeStrainDial$b */
    @Metadata(m65680d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010\u0005\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0002\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"com/whoop/realtime/presentation/views/RealTimeStrainDial$b", "Lql/g;", "Landroid/graphics/Bitmap;", "resource", "Lrl/c;", "transition", "Ll83/a0;", "i", "(Landroid/graphics/Bitmap;Lrl/c;)V", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9893b extends AbstractC30461g {
        public C9893b() {
        }

        @Override // p429ql.InterfaceC30463i
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo5838b(Bitmap resource, InterfaceC31508c transition) {
            AbstractC22676k.m65750j(resource, "resource");
            RealTimeStrainDial.this.goalAvatar.setImageBitmap(resource);
            RealTimeStrainDial.this.invalidate();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RealTimeStrainDial(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC22676k.m65750j(context, "context");
    }

    /* JADX INFO: renamed from: h */
    private final float m24161h(float angle) {
        return (float) Math.toDegrees(angle);
    }

    /* JADX INFO: renamed from: i */
    private final float m24162i(float angle) {
        return (float) Math.toRadians(angle);
    }

    /* JADX INFO: renamed from: j */
    private final void m24163j() {
        float radians = (float) Math.toRadians(this.f31550N * 360.0f);
        PointF pointF = this.goalIconCenterPoint;
        float f13 = this.dialCenterPoint.x;
        float f14 = this.dialRadius;
        float f15 = f29082z0;
        double d3 = radians;
        pointF.x = ((f14 - f15) * ((float) Math.sin(d3))) + f13;
        this.goalIconCenterPoint.y = ((this.dialRadius - f15) * (-((float) Math.cos(d3)))) + this.dialCenterPoint.y;
        RectF rectF = this.goalIconRect;
        PointF pointF2 = this.goalIconCenterPoint;
        float f16 = pointF2.x;
        float f17 = f29079A0;
        rectF.left = f16 - f17;
        float f18 = pointF2.y;
        rectF.top = f18 - f17;
        rectF.right = f16 + f17;
        rectF.bottom = f18 + f17;
    }

    /* JADX INFO: renamed from: k */
    private final void m24164k() {
        float f13 = 360;
        float fFloatValue = ((Number) this.optimalRange.getStart()).floatValue() * f13;
        float fFloatValue2 = ((Number) this.optimalRange.mo52651d()).floatValue() * f13;
        float f14 = 2;
        float f15 = fFloatValue2 - f14;
        float fAbs = Math.abs(m24162i(f15) * this.optimalRangeRadius);
        float fAbs2 = Math.abs(m24162i(f15 - fFloatValue) * this.optimalRangeRadius);
        this.totalOptimalArcLength = fAbs2;
        float f16 = this.optimalLabelLength;
        if (f16 >= fAbs2) {
            this.totalOptimalArcAngle = m24161h(fAbs2 / this.optimalRangeRadius);
            return;
        }
        float fAbs3 = Math.abs((fAbs2 - f16) / f14);
        this.arcSegmentLength = fAbs3;
        this.segmentSweepAngle = m24161h(fAbs3 / this.optimalRangeRadius);
        this.firstSegmentStartAngle = fFloatValue + f14;
        this.secondSegmentStartAngle = m24161h((fAbs - this.arcSegmentLength) / this.optimalRangeRadius);
        m24165l();
    }

    /* JADX INFO: renamed from: l */
    private final void m24165l() {
        float fM24162i = m24162i(this.firstSegmentStartAngle) + m24162i(this.segmentSweepAngle);
        float fM24161h = m24161h(this.optimalLabelLength / this.optimalRangeRadius);
        float fM24161h2 = (fM24161h / 2) + m24161h(fM24162i);
        this.optimalRangePath.reset();
        if (fM24161h2 <= 45.0f || fM24161h2 >= 270.0f) {
            this.optimalRangePath.addArc(this.optimalRangeRect, m24161h(fM24162i) - 90, fM24161h);
        } else {
            this.optimalRangePath.addArc(this.optimalRangeRect, m24161h(fM24162i) - (90 - fM24161h), 0 - fM24161h);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m24166m(RealTimeStrainDial realTimeStrainDial, float f13) {
        realTimeStrainDial.m24168o(f13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m24167n(RealTimeStrainDial realTimeStrainDial) {
        realTimeStrainDial.setDrawGoalIcon(true);
        realTimeStrainDial.setFillWhite(false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    private final void m24168o(float progress) {
        PointF pointF = this.goalIconCenterPoint;
        float f13 = 1.0f - progress;
        float f14 = pointF.x * f13;
        PointF pointF2 = this.dialCenterPoint;
        float f15 = (pointF2.x * progress) + f14;
        float f16 = (pointF2.y * progress) + (pointF.y * f13);
        float fM8288a = AbstractC2875y.m8288a(this.dialRadius, this.f31547K, progress, f29079A0 * f13);
        RectF rectF = this.fillWhiteRect;
        rectF.left = f15 - fM8288a;
        rectF.right = f15 + fM8288a;
        rectF.top = f16 - fM8288a;
        rectF.bottom = f16 + fM8288a;
        invalidate();
    }

    private final void setFillWhite(boolean value) {
        if (value != this.fillWhite) {
            this.fillWhite = value;
            m26657c();
        }
    }

    public final PointF getDialCenterPoint() {
        return this.dialCenterPoint;
    }

    public final float getDialRadius() {
        return this.dialRadius;
    }

    public final InterfaceC18280f getOptimalRange() {
        return this.optimalRange;
    }

    @Override // com.whoop.p069ui.ProgressDial, android.view.View
    public void onDraw(Canvas canvas) {
        AbstractC22676k.m65750j(canvas, "canvas");
        super.onDraw(canvas);
        if (!AbstractC22676k.m65745e(this.optimalRange, new C18279e(0.0f, 1.0f))) {
            if (this.optimalLabelLength >= this.totalOptimalArcLength) {
                canvas.drawArc(this.optimalRangeRect, this.firstSegmentStartAngle - 90, this.totalOptimalArcAngle, false, this.optimalRangePaint);
            } else {
                float f13 = 90;
                canvas.drawArc(this.optimalRangeRect, this.firstSegmentStartAngle - f13, this.segmentSweepAngle - 3, false, this.optimalRangePaint);
                canvas.drawTextOnPath(this.optimalString, this.optimalRangePath, 0.0f, this.optimalLabelHeight * 0.75f, this.optimalLabelPaint);
                canvas.drawArc(this.optimalRangeRect, 5 + (this.secondSegmentStartAngle - f13), this.segmentSweepAngle, false, this.optimalRangePaint);
            }
        }
        boolean z4 = this.drawGoalIcon;
        float f14 = this.f31550N;
        if (z4 & (f14 > 0.0f)) {
            if (!this.optimalRange.mo52654c(Float.valueOf(f14)) || this.goalReached) {
                this.goalAvatar.layout(0, 0, (int) this.goalIconRect.width(), (int) this.goalIconRect.height());
                canvas.save();
                RectF rectF = this.goalIconRect;
                canvas.translate(rectF.left, rectF.top);
                this.goalAvatar.draw(canvas);
                canvas.restore();
            } else {
                canvas.drawOval(this.goalIconRect, this.goalIconPaint);
                int iWidth = (int) (this.goalIconRect.width() * 0.4f);
                this.goalIcon.layout(0, 0, ((int) this.goalIconRect.width()) - iWidth, ((int) this.goalIconRect.height()) - iWidth);
                canvas.save();
                RectF rectF2 = this.goalIconRect;
                float f15 = iWidth / 2;
                canvas.translate(rectF2.left + f15, rectF2.top + f15);
                this.goalIcon.draw(canvas);
                canvas.restore();
            }
        }
        if (this.fillWhite) {
            canvas.drawOval(this.fillWhiteRect, this.fillWhitePaint);
        }
    }

    @Override // com.whoop.p069ui.ProgressDial, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        float dimension = getResources().getDimension(AbstractC36511b.f156052e);
        RectF rectF = this.optimalRangeRect;
        rectF.left = dimension;
        rectF.top = dimension;
        rectF.right = getMeasuredWidth() - dimension;
        this.optimalRangeRect.bottom = getMeasuredHeight() - dimension;
        float f13 = 2;
        this.optimalRangeRadius = this.optimalRangeRect.width() / f13;
        m24164k();
        super.onLayout(changed, left, top, right, bottom);
        this.dialRadius = this.f31546J.width() / f13;
        RectF rectF2 = this.f31546J;
        float fWidth = rectF2.right - (rectF2.width() / f13);
        RectF rectF3 = this.f31546J;
        float fHeight = rectF3.bottom - (rectF3.height() / f13);
        PointF pointF = this.dialCenterPoint;
        pointF.x = fWidth;
        pointF.y = fHeight;
        m24163j();
        this.goalAvatar.setImageDrawable(AbstractC32122c.getDrawable(getContext(), AbstractC36512c.f156071n));
        User userM84055f = C12723b.m35566a().m35572g().m84055f();
        if (userM84055f != null) {
            C4964f c4964fM15546j = ComponentCallbacks2C4960b.m15529e(getContext()).m15546j();
            c4964fM15546j.f20321Y = userM84055f.getAvatarUrl();
            c4964fM15546j.f20323a0 = true;
            c4964fM15546j.m15538z(new C9893b());
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        float size = View.MeasureSpec.getSize(widthMeasureSpec);
        float f13 = this.f31547K;
        float f14 = 2;
        float f15 = (f13 * f14) + size + f13;
        float size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        float f16 = this.f31547K;
        setMeasuredDimension((int) f15, (int) ((f14 * f16) + size2 + f16));
    }

    public final void setDialCenterPoint(PointF pointF) {
        AbstractC22676k.m65750j(pointF, "<set-?>");
        this.dialCenterPoint = pointF;
    }

    public final void setDialRadius(float f13) {
        this.dialRadius = f13;
    }

    public final void setDrawGoalIcon(boolean value) {
        if (value != this.drawGoalIcon) {
            this.drawGoalIcon = value;
            if (value) {
                setDrawGoalLine(true);
            }
            m26657c();
        }
    }

    @Override // com.whoop.p069ui.ProgressDial
    public void setGoalPct(float goalPct) {
        super.setGoalPct(goalPct);
        m24163j();
    }

    public final void setGoalReached(boolean animate) {
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        if (this.goalReached) {
            return;
        }
        this.goalReached = true;
        Log.i("STRAINCOACH", "strainDial animating goal complete");
        this.goalAvatar.setImageDrawable(getResources().getDrawable(AbstractC22207c.f86262c));
        if (animate) {
            int integer = getResources().getInteger(AbstractC26664e.f106003d);
            int integer2 = getResources().getInteger(AbstractC26664e.f106002c);
            int integer3 = getResources().getInteger(AbstractC26664e.f106004e);
            setDrawGoalIcon(false);
            setFillWhite(true);
            AbstractC29983a.m91706b(AbstractC37056f.m118959K(new C23465k(fValueOf2, Integer.valueOf(integer)), new C23465k(fValueOf, Integer.valueOf(integer2)), new C23465k(fValueOf, Integer.valueOf(integer3)), new C23465k(fValueOf2, 0)), new C29124b(this, 21), new C30036h(this, 11));
        }
    }

    public final void setOptimalLabelTextSize(float textSize) {
        this.optimalLabelPaint.setTextSize(textSize);
        Rect rect = new Rect();
        Paint paint = this.optimalLabelPaint;
        String str = this.optimalString;
        paint.getTextBounds(str, 0, str.length(), rect);
        this.optimalLabelLength = rect.width();
        this.optimalLabelHeight = rect.height();
        m24164k();
    }

    public final void setOptimalRange(InterfaceC18280f value) {
        AbstractC22676k.m65750j(value, "value");
        this.optimalRange = value;
        m24164k();
        m26657c();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealTimeStrainDial(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        this.optimalRange = new C18279e(0.0f, 1.0f);
        this.optimalRangePath = new Path();
        this.optimalRangeRect = new RectF();
        this.goalIconRect = new RectF();
        this.goalIconCenterPoint = new PointF();
        this.goalIcon = new ImageView(context);
        Paint paint = new Paint();
        paint.setColor(-1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.goalIconPaint = paint;
        this.goalAvatar = new CircleImageView(context);
        this.fillWhiteRect = new RectF();
        Paint paint2 = new Paint();
        paint2.setColor(-1);
        paint2.setStyle(style);
        this.fillWhitePaint = paint2;
        this.dialCenterPoint = new PointF();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC22212h.f86553j, i13, 0);
        AbstractC22676k.m65749i(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int color = typedArrayObtainStyledAttributes.getColor(AbstractC22212h.f86555l, AbstractC32122c.getColor(context, AbstractC36510a.f156018a));
        setDrawGoalLine(typedArrayObtainStyledAttributes.getBoolean(AbstractC22212h.f86554k, true));
        Paint paint3 = new Paint();
        paint3.setFlags(1);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setColor(color);
        paint3.setStrokeCap(Paint.Cap.SQUARE);
        paint3.setStrokeWidth(2.0f);
        paint3.setPathEffect(new DashPathEffect(new float[]{getResources().getDimensionPixelSize(AbstractC36511b.f156050c), 6.0f}, 0.0f));
        this.optimalRangePaint = paint3;
        Paint paint4 = new Paint();
        paint4.setFlags(1);
        paint4.setStyle(style);
        paint4.setColor(color);
        this.optimalLabelPaint = paint4;
        String string = context.getString(AbstractC22210f.f86414D);
        AbstractC22676k.m65749i(string, "getString(...)");
        String upperCase = string.toUpperCase(Locale.ROOT);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        this.optimalString = upperCase;
        Typeface typefaceM109098b = AbstractC34523k.m109098b(context, AbstractC16273b.f62200a);
        AbstractC22676k.m65747g(typefaceM109098b);
        this.labelTypeface = typefaceM109098b;
        paint4.setTypeface(typefaceM109098b);
        paint4.setTextSize(getResources().getDimensionPixelSize(AbstractC36511b.f156057j));
        Rect rect = new Rect();
        paint4.getTextBounds(upperCase, 0, upperCase.length(), rect);
        this.optimalLabelLength = rect.width();
        float fHeight = rect.height();
        this.optimalLabelHeight = fHeight;
        setGoalMargin(fHeight * 1.5f);
        if (isInEditMode()) {
            setOptimalRange(new C18279e(0.6f, 0.8f));
            setProgress(0.63f);
        }
        this.goalIcon.setImageDrawable(AbstractC32122c.getDrawable(context, AbstractC36512c.f156072o));
    }

    public /* synthetic */ RealTimeStrainDial(Context context, AttributeSet attributeSet, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }
}
