package com.whoop.realtime.presentation.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import c93.InterfaceC4339a;
import com.whoop.data.repositories.FeatureFlagRepository;
import com.whoop.domain.model.StrainRecoveryMapping;
import com.whoop.p069ui.AbstractC10538f;
import gy0.AbstractC16273b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Iterator;
import k52.AbstractC22206b;
import k52.AbstractC22207c;
import k52.AbstractC22210f;
import k52.AbstractC22212h;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import nf3.C26669a;
import o52.EnumC27584v0;
import of3.InterfaceC27903a;
import p479s4.AbstractC32122c;
import p505ts.AbstractC34132o;
import p513u4.AbstractC34523k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p92.C29021j;
import q52.AbstractC29985c;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import vf3.InterfaceC35951a;
import vu1.AbstractC36510a;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u008f\u00012\u00020\u00012\u00020\u0002:\u0001 B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u0017J\u0017\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001c\u0010\u0017J\u001f\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0011H\u0002¢\u0006\u0004\b \u0010!J\u0019\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\"\u001a\u00020\u0007H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020(2\u0006\u0010\"\u001a\u00020\u0007H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0011H\u0002¢\u0006\u0004\b-\u0010!R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00104\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00108\u001a\u0004\u0018\u0001058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010:\u001a\u0004\u0018\u0001058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00107R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010=R\u0014\u0010A\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010=R\u0014\u0010C\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010=R\u0014\u0010E\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010=R\u0014\u0010G\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010=R\u0014\u0010I\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010=R\u0014\u0010K\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010=R\u0014\u0010M\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010=R\u0014\u0010O\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010=R\u0014\u0010Q\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010=R\u0014\u0010S\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010=R\u0014\u0010W\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010Y\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\bX\u0010DR\u0014\u0010]\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010a\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R*\u0010i\u001a\u00020&2\u0006\u0010b\u001a\u00020&8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR*\u0010m\u001a\u00020&2\u0006\u0010b\u001a\u00020&8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bj\u0010d\u001a\u0004\bk\u0010f\"\u0004\bl\u0010hR.\u0010t\u001a\u0004\u0018\u00010(2\b\u0010b\u001a\u0004\u0018\u00010(8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR*\u0010x\u001a\u00020&2\u0006\u0010b\u001a\u00020&8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bu\u0010d\u001a\u0004\bv\u0010f\"\u0004\bw\u0010hR/\u0010\u0080\u0001\u001a\u0004\u0018\u00010y2\b\u0010b\u001a\u0004\u0018\u00010y8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR7\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0081\u00012\t\u0010b\u001a\u0005\u0018\u00010\u0081\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R!\u0010\u008e\u0001\u001a\u00030\u0089\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001¨\u0006\u0090\u0001"}, m65681d2 = {"Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;", "Landroid/view/View;", "Lof3/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "changed", "left", "top", "right", "bottom", "Ll83/a0;", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "d", "g", "e", "b", "f", "error", "c", "(Landroid/graphics/Canvas;I)V", "a", "()V", "recovery", "Lcom/whoop/domain/model/StrainRecoveryMapping;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(I)Lcom/whoop/domain/model/StrainRecoveryMapping;", "", "strain", "", "k", "(D)F", "j", "(I)F", "i", "Landroid/content/res/TypedArray;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Landroid/content/res/TypedArray;", "attributes", "x", "F", "barWidth", "Landroid/graphics/Typeface;", "y", "Landroid/graphics/Typeface;", "fontNumbers", "z", "fontLabels", "Landroid/graphics/Paint;", "E", "Landroid/graphics/Paint;", "gridPaint", "strainNumberPaint", "G", "recoveryLabelPaint", "H", "estimatedLabelPaint", "I", "optimalLabelPaint", "J", "optimalAreaPaint", "K", "estimatedPaint", "L", "dayPaint", "M", "barTopPaint", "N", "dashLevelPaint", "O", "setGoalTitlePaint", "P", "setGoalTextPaint", "Landroid/widget/ImageView;", "Q", "Landroid/widget/ImageView;", "setGoalIcon", "R", "setGoalIconSize", "Landroid/graphics/RectF;", "S", "Landroid/graphics/RectF;", "graphRect", "Landroid/graphics/Path;", "T", "Landroid/graphics/Path;", "optimalArea", "value", "U", "D", "getDayStrain", "()D", "setDayStrain", "(D)V", "dayStrain", "V", "getActivityStrain", "setActivityStrain", "activityStrain", "W", "Ljava/lang/Float;", "getRecoveryPct", "()Ljava/lang/Float;", "setRecoveryPct", "(Ljava/lang/Float;)V", "recoveryPct", "a0", "getEstimatedDayStrain", "setEstimatedDayStrain", "estimatedDayStrain", "Lp92/j;", "b0", "Lp92/j;", "getStrainRecoveryMapper", "()Lp92/j;", "setStrainRecoveryMapper", "(Lp92/j;)V", "strainRecoveryMapper", "Lo52/v0;", "c0", "Lo52/v0;", "getStrainCoachStates", "()Lo52/v0;", "setStrainCoachStates", "(Lo52/v0;)V", "strainCoachStates", "Lcom/whoop/data/repositories/FeatureFlagRepository;", "d0", "Ll83/h;", "getFeatureFlagRepository", "()Lcom/whoop/data/repositories/FeatureFlagRepository;", "featureFlagRepository", "e0", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class StrainCoachStrainGraph extends View implements InterfaceC27903a {

    /* JADX INFO: renamed from: f0 */
    public static final int f29179f0 = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final Paint gridPaint;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final Paint strainNumberPaint;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final Paint recoveryLabelPaint;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final Paint estimatedLabelPaint;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final Paint optimalLabelPaint;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final Paint optimalAreaPaint;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final Paint estimatedPaint;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final Paint dayPaint;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final Paint barTopPaint;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final Paint dashLevelPaint;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final Paint setGoalTitlePaint;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private final Paint setGoalTextPaint;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private final ImageView setGoalIcon;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private final int setGoalIconSize;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private final RectF graphRect;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private final Path optimalArea;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private double dayStrain;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private double activityStrain;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private Float recoveryPct;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    private double estimatedDayStrain;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    private C29021j strainRecoveryMapper;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    private EnumC27584v0 strainCoachStates;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    private final InterfaceC23462h featureFlagRepository;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final TypedArray attributes;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final float barWidth;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final Typeface fontNumbers;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final Typeface fontLabels;

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.views.StrainCoachStrainGraph$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9903b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f29207w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f29208x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f29209y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9903b(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f29207w = interfaceC27903a;
            this.f29208x = interfaceC35951a;
            this.f29209y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [com.whoop.data.repositories.FeatureFlagRepository, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagRepository invoke() {
            InterfaceC27903a interfaceC27903a = this.f29207w;
            InterfaceC35951a interfaceC35951a = this.f29208x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f29209y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagRepository.class), interfaceC35951a);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StrainCoachStrainGraph(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC22676k.m65750j(context, "context");
    }

    /* JADX INFO: renamed from: a */
    private final void m24203a() {
        this.optimalArea.reset();
        Path path = this.optimalArea;
        float fM24212j = m24212j(0);
        StrainRecoveryMapping strainRecoveryMappingM24210h = m24210h(0);
        AbstractC22676k.m65747g(strainRecoveryMappingM24210h);
        path.moveTo(fM24212j, m24213k(strainRecoveryMappingM24210h.getUpperRecStrain()));
        for (int i13 = 1; i13 < 101; i13++) {
            StrainRecoveryMapping strainRecoveryMappingM24210h2 = m24210h(i13);
            Path path2 = this.optimalArea;
            float fM24212j2 = m24212j(i13);
            AbstractC22676k.m65747g(strainRecoveryMappingM24210h2);
            path2.lineTo(fM24212j2, m24213k(strainRecoveryMappingM24210h2.getUpperRecStrain()));
        }
        for (int i14 = 100; -1 < i14; i14--) {
            StrainRecoveryMapping strainRecoveryMappingM24210h3 = m24210h(i14);
            Path path3 = this.optimalArea;
            float fM24212j3 = m24212j(i14);
            AbstractC22676k.m65747g(strainRecoveryMappingM24210h3);
            path3.lineTo(fM24212j3, m24213k(strainRecoveryMappingM24210h3.getLowerRecStrain()));
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m24204b(Canvas canvas) {
        RectF rectF = this.graphRect;
        float f13 = rectF.left;
        float fWidth = rectF.width();
        Float f14 = this.recoveryPct;
        float f15 = 2;
        float fFloatValue = (fWidth * (f14 != null ? f14.floatValue() : 0.0f)) - (this.barWidth / f15);
        if (fFloatValue < 0.0f) {
            fFloatValue = 0.0f;
        }
        float fWidth2 = this.graphRect.width() - this.barWidth;
        if (fFloatValue > fWidth2) {
            fFloatValue = fWidth2;
        }
        float f16 = f13 + fFloatValue;
        double dHeight = (this.dayStrain / 21.0d) * ((double) this.graphRect.height());
        double dHeight2 = (this.estimatedDayStrain / 21.0d) * ((double) this.graphRect.height());
        float f17 = this.graphRect.bottom;
        canvas.drawRect(f16, (float) (((double) f17) - dHeight2), f16 + this.barWidth, f17, this.estimatedPaint);
        float f18 = this.graphRect.bottom;
        canvas.drawRect(f16, (float) (((double) f18) - dHeight), f16 + this.barWidth, f18, this.dayPaint);
        RectF rectF2 = this.graphRect;
        float f19 = rectF2.left;
        float f24 = rectF2.bottom;
        canvas.drawLine(f19, (float) (((double) f24) - dHeight2), f16, (float) (((double) f24) - dHeight2), this.dashLevelPaint);
        float f25 = this.graphRect.bottom;
        double d3 = 5.0f;
        canvas.drawRect(f16, (float) (((double) f25) - (dHeight2 + d3)), this.barWidth + f16, (float) (((double) f25) - (dHeight2 - d3)), this.barTopPaint);
        Float f26 = this.recoveryPct;
        AbstractC29985c.m91709a(canvas, AbstractC31061c.m95635k((int) ((f26 != null ? f26.floatValue() : 0.0f) * 100.0f), "%"), (this.barWidth / f15) + f16, getHeight(), this.recoveryLabelPaint);
        AbstractC29985c.m91709a(canvas, AbstractC10538f.m27183h(this.estimatedDayStrain), (this.barWidth / f15) + f16, (float) (((double) this.graphRect.bottom) - (dHeight2 + ((double) 18.0f))), this.estimatedLabelPaint);
    }

    /* JADX INFO: renamed from: c */
    private final void m24205c(Canvas canvas, int error) {
        int i13;
        int i14;
        int i15;
        if (error == 1) {
            i13 = AbstractC22210f.f86449U0;
        } else if (error == 2) {
            i13 = AbstractC22210f.f86443R0;
        } else {
            if (error != 3) {
                throw new IllegalStateException("Unknown error state");
            }
            i13 = AbstractC22210f.f86534y1;
        }
        if (error == 1) {
            i14 = AbstractC22210f.f86445S0;
        } else if (error == 2) {
            i14 = AbstractC22210f.f86439P0;
        } else {
            if (error != 3) {
                throw new IllegalStateException("Unknown error state");
            }
            i14 = AbstractC22210f.f86531x1;
        }
        if (error == 1) {
            i15 = AbstractC22210f.f86447T0;
        } else {
            if (error != 2 && error != 3) {
                throw new IllegalStateException("Unknown error state");
            }
            i15 = AbstractC22210f.f86441Q0;
        }
        int i16 = i15;
        float fHeight = this.graphRect.height() / 7;
        canvas.save();
        RectF rectF = this.graphRect;
        float f13 = rectF.left;
        float f14 = 2;
        canvas.translate((((rectF.right - f13) / f14) + f13) - (this.setGoalIconSize / 2), rectF.top + fHeight);
        this.setGoalIcon.draw(canvas);
        canvas.restore();
        float f15 = fHeight + this.setGoalIconSize + 40;
        String string = getResources().getString(i13);
        AbstractC22676k.m65749i(string, "getString(...)");
        RectF rectF2 = this.graphRect;
        AbstractC29985c.m91709a(canvas, string, (rectF2.width() / f14) + rectF2.left, this.graphRect.top + f15, this.setGoalTitlePaint);
        float textSize = f15 + ((int) this.setGoalTitlePaint.getTextSize()) + 10;
        String string2 = getResources().getString(i14);
        AbstractC22676k.m65749i(string2, "getString(...)");
        RectF rectF3 = this.graphRect;
        float fWidth = (rectF3.width() / f14) + rectF3.left;
        RectF rectF4 = this.graphRect;
        float fM91710b = AbstractC29985c.m91710b(canvas, string2, fWidth, rectF4.top + textSize, this.setGoalTextPaint, rectF4.width());
        String string3 = getResources().getString(i16);
        AbstractC22676k.m65749i(string3, "getString(...)");
        RectF rectF5 = this.graphRect;
        AbstractC29985c.m91710b(canvas, string3, rectF5.left + (rectF5.width() / f14), fM91710b, this.setGoalTextPaint, this.graphRect.width());
    }

    /* JADX INFO: renamed from: d */
    private final void m24206d(Canvas canvas) {
        float fWidth = this.graphRect.width() / 6;
        float fHeight = this.graphRect.height() / 21;
        for (int i13 = 0; i13 < 22; i13++) {
            RectF rectF = this.graphRect;
            float f13 = rectF.left;
            float f14 = rectF.top;
            float f15 = i13 * fHeight;
            canvas.drawLine(f13, f14 + f15, rectF.right, f14 + f15, this.gridPaint);
        }
        for (int i14 = 0; i14 < 7; i14++) {
            RectF rectF2 = this.graphRect;
            float f16 = rectF2.left;
            float f17 = i14 * fWidth;
            canvas.drawLine(f16 + f17, rectF2.top, f16 + f17, rectF2.bottom, this.gridPaint);
        }
        Iterator it = AbstractC37056f.m118959K(Double.valueOf(0.0d), Double.valueOf(6.0d), Double.valueOf(10.0d), Double.valueOf(14.0d), Double.valueOf(18.0d), Double.valueOf(21.0d)).iterator();
        while (it.hasNext()) {
            double dDoubleValue = ((Number) it.next()).doubleValue();
            canvas.drawText(AbstractC10538f.m27183h(dDoubleValue), 0.0f, ((float) (((21.0d - dDoubleValue) * ((double) fHeight)) + ((double) this.graphRect.top))) + 10.0f, this.strainNumberPaint);
        }
    }

    /* JADX INFO: renamed from: e */
    private final void m24207e(Canvas canvas) {
        canvas.drawPath(this.optimalArea, this.optimalAreaPaint);
    }

    /* JADX INFO: renamed from: f */
    private final void m24208f(Canvas canvas) {
        String string = getResources().getString(AbstractC22210f.f86503o0);
        AbstractC22676k.m65749i(string, "getString(...)");
        RectF rectF = this.graphRect;
        float f13 = 2;
        float fWidth = (rectF.width() / f13) + rectF.left;
        RectF rectF2 = this.graphRect;
        AbstractC29985c.m91709a(canvas, string, fWidth, ((rectF2.height() / f13) + rectF2.top) - 25.0f, this.optimalLabelPaint);
        String string2 = getResources().getString(AbstractC22210f.f86506p0);
        AbstractC22676k.m65749i(string2, "getString(...)");
        RectF rectF3 = this.graphRect;
        float fWidth2 = (rectF3.width() / f13) + rectF3.left;
        RectF rectF4 = this.graphRect;
        AbstractC29985c.m91709a(canvas, string2, fWidth2, (rectF4.height() / f13) + rectF4.top + 25.0f, this.optimalLabelPaint);
    }

    /* JADX INFO: renamed from: g */
    private final void m24209g(Canvas canvas) {
        float f13 = 3;
        float fWidth = this.graphRect.width() / f13;
        Paint paint = new Paint();
        paint.setStrokeWidth(8.0f);
        paint.setColor(getContext().getColor(AbstractC36510a.f156040s));
        RectF rectF = this.graphRect;
        float f14 = rectF.left;
        float f15 = rectF.bottom;
        canvas.drawLine(f14, f15, f14 + fWidth, f15, paint);
        paint.setColor(getContext().getColor(AbstractC36510a.f156025d0));
        RectF rectF2 = this.graphRect;
        float f16 = rectF2.left;
        float f17 = rectF2.bottom;
        float f18 = fWidth * 2;
        canvas.drawLine(f16 + fWidth, f17, f16 + f18, f17, paint);
        paint.setColor(getContext().getColor(AbstractC36510a.f156037p));
        RectF rectF3 = this.graphRect;
        float f19 = rectF3.left;
        float f24 = rectF3.bottom;
        canvas.drawLine(f18 + f19, f24, (fWidth * f13) + f19, f24, paint);
    }

    private final FeatureFlagRepository getFeatureFlagRepository() {
        return (FeatureFlagRepository) this.featureFlagRepository.getValue();
    }

    /* JADX INFO: renamed from: h */
    private final StrainRecoveryMapping m24210h(int recovery) {
        C29021j c29021j = this.strainRecoveryMapper;
        if (c29021j != null) {
            return C29021j.m88253b(c29021j, recovery, 0.0d, 2, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    private final void m24211i() {
        invalidate();
    }

    /* JADX INFO: renamed from: j */
    private final float m24212j(int recovery) {
        RectF rectF = this.graphRect;
        float f13 = rectF.left;
        return (((rectF.right - f13) / 100) * recovery) + f13;
    }

    /* JADX INFO: renamed from: k */
    private final float m24213k(double strain) {
        RectF rectF = this.graphRect;
        float f13 = rectF.bottom;
        return (float) (((double) f13) - ((strain / 21.0d) * ((double) (f13 - rectF.top))));
    }

    public final double getActivityStrain() {
        return this.activityStrain;
    }

    public final double getDayStrain() {
        return this.dayStrain;
    }

    public final double getEstimatedDayStrain() {
        return this.estimatedDayStrain;
    }

    @Override // of3.InterfaceC27903a
    public /* bridge */ C26669a getKoin() {
        return AbstractC34132o.m107856A(this);
    }

    public final Float getRecoveryPct() {
        return this.recoveryPct;
    }

    public final EnumC27584v0 getStrainCoachStates() {
        return this.strainCoachStates;
    }

    public final C29021j getStrainRecoveryMapper() {
        return this.strainRecoveryMapper;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        AbstractC22676k.m65750j(canvas, "canvas");
        super.onDraw(canvas);
        m24206d(canvas);
        EnumC27584v0 enumC27584v0 = this.strainCoachStates;
        if (enumC27584v0 == EnumC27584v0.RECOVERY_AND_STRAIN_PENDING) {
            m24204b(canvas);
        } else if (this.recoveryPct == null || enumC27584v0 == EnumC27584v0.NO_RECOVERY_AND_STRAIN_PENDING) {
            m24205c(canvas, 2);
        } else if (this.activityStrain > 0.0d) {
            m24207e(canvas);
            m24204b(canvas);
            m24208f(canvas);
        } else {
            m24205c(canvas, 1);
        }
        m24209g(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        RectF rectF = this.graphRect;
        rectF.left = 90.0f;
        rectF.top = 48.0f;
        rectF.right = getWidth() - 36.0f;
        this.graphRect.bottom = getHeight() - 48.0f;
        if (this.strainRecoveryMapper != null) {
            m24203a();
        }
        m24211i();
    }

    public final void setActivityStrain(double d3) {
        this.activityStrain = d3;
        m24211i();
    }

    public final void setDayStrain(double d3) {
        this.dayStrain = d3;
        m24211i();
    }

    public final void setEstimatedDayStrain(double d3) {
        this.estimatedDayStrain = d3;
        m24211i();
    }

    public final void setRecoveryPct(Float f13) {
        this.recoveryPct = f13;
        m24211i();
    }

    public final void setStrainCoachStates(EnumC27584v0 enumC27584v0) {
        this.strainCoachStates = enumC27584v0;
        m24211i();
        requestLayout();
    }

    public final void setStrainRecoveryMapper(C29021j c29021j) {
        this.strainRecoveryMapper = c29021j;
        m24211i();
        requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StrainCoachStrainGraph(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC22212h.f86560q);
        AbstractC22676k.m65749i(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.attributes = typedArrayObtainStyledAttributes;
        this.barWidth = typedArrayObtainStyledAttributes.getFloat(AbstractC22212h.f86561r, 40.0f);
        Typeface typefaceM109098b = AbstractC34523k.m109098b(context, AbstractC16273b.f62203d);
        this.fontNumbers = typefaceM109098b;
        Typeface typefaceM109098b2 = AbstractC34523k.m109098b(context, AbstractC16273b.f62200a);
        this.fontLabels = typefaceM109098b2;
        Paint paint = new Paint();
        paint.setColor(typedArrayObtainStyledAttributes.getColor(AbstractC22212h.f86563t, context.getColor(AbstractC22206b.f86253l)));
        paint.setStrokeWidth(typedArrayObtainStyledAttributes.getFloat(AbstractC22212h.f86564u, 2.0f));
        this.gridPaint = paint;
        Paint paint2 = new Paint();
        paint2.setColor(typedArrayObtainStyledAttributes.getColor(AbstractC22212h.f86566w, context.getColor(AbstractC36510a.f156020b)));
        paint2.setTypeface(typefaceM109098b);
        paint2.setTextSize(36.0f);
        this.strainNumberPaint = paint2;
        Paint paint3 = new Paint();
        paint3.setColor(context.getColor(AbstractC36510a.f156018a));
        paint3.setTypeface(typefaceM109098b);
        paint3.setTextSize(36.0f);
        this.recoveryLabelPaint = paint3;
        Paint paint4 = new Paint();
        paint4.setColor(context.getColor(AbstractC36510a.f156018a));
        paint4.setTypeface(typefaceM109098b);
        paint4.setTextSize(48.0f);
        this.estimatedLabelPaint = paint4;
        Paint paint5 = new Paint();
        paint5.setColor(context.getColor(AbstractC36510a.f156034m));
        paint5.setTypeface(typefaceM109098b2);
        paint5.setTextSize(40.0f);
        this.optimalLabelPaint = paint5;
        Paint paint6 = new Paint();
        paint6.setColor(typedArrayObtainStyledAttributes.getColor(AbstractC22212h.f86565v, context.getColor(AbstractC36510a.f156033l)));
        Paint.Style style = Paint.Style.FILL;
        paint6.setStyle(style);
        this.optimalAreaPaint = paint6;
        Paint paint7 = new Paint(2);
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), AbstractC22207c.f86260a);
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        paint7.setShader(new BitmapShader(bitmapDecodeResource, tileMode, tileMode));
        paint7.setAlpha(72);
        this.estimatedPaint = paint7;
        Paint paint8 = new Paint();
        paint8.setColor(typedArrayObtainStyledAttributes.getColor(AbstractC22212h.f86562s, context.getColor(AbstractC36510a.f156020b)));
        paint8.setStyle(style);
        this.dayPaint = paint8;
        Paint paint9 = new Paint();
        paint9.setColor(context.getColor(AbstractC36510a.f156018a));
        paint9.setStyle(style);
        this.barTopPaint = paint9;
        Paint paint10 = new Paint();
        paint10.setFlags(1);
        paint10.setStyle(Paint.Style.STROKE);
        paint10.setColor(context.getColor(AbstractC36510a.f156030i));
        paint10.setStrokeWidth(4.0f);
        paint10.setPathEffect(new DashPathEffect(new float[]{12.0f, 12.0f}, 0.0f));
        this.dashLevelPaint = paint10;
        Paint paint11 = new Paint();
        paint11.setColor(context.getColor(AbstractC36510a.f156018a));
        paint11.setTypeface(typefaceM109098b2);
        paint11.setTextSize(40.0f);
        this.setGoalTitlePaint = paint11;
        Paint paint12 = new Paint();
        paint12.setColor(context.getColor(AbstractC36510a.f156032k));
        paint12.setTypeface(typefaceM109098b);
        paint12.setTextSize(32.0f);
        this.setGoalTextPaint = paint12;
        ImageView imageView = new ImageView(context);
        this.setGoalIcon = imageView;
        this.setGoalIconSize = 70;
        this.graphRect = new RectF();
        this.optimalArea = new Path();
        this.featureFlagRepository = AbstractC30060g.m92087G(EnumC23463i.f92933w, new C9903b(this, null, null));
        setLayerType(1, null);
        imageView.setImageDrawable(AbstractC32122c.getDrawable(context, AbstractC22207c.f86265f));
        imageView.layout(0, 0, 70, 70);
        paint11.setLetterSpacing(0.05f);
    }

    public /* synthetic */ StrainCoachStrainGraph(Context context, AttributeSet attributeSet, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }
}
