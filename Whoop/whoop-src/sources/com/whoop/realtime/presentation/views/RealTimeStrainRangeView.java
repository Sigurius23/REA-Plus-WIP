package com.whoop.realtime.presentation.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import e93.AbstractC12889b;
import i93.C18284j;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import lr.RunnableC24693e;
import m52.AbstractC25099s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import se.AbstractC32411b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001,B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fR*\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0018R\u0014\u0010%\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0018R\u0014\u0010'\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0018R\u0014\u0010)\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0018R\u0014\u0010*\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018¨\u0006-"}, m65681d2 = {"Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ll83/a0;", "d", "()V", "c", "value", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "I", "getStrainPercent", "()I", "setStrainPercent", "(I)V", "strainPercent", "Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;", "x", "Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;", "currentSegment", "Lm52/s;", "y", "Lm52/s;", "binding", "Landroid/widget/ImageView;", "z", "Landroid/widget/ImageView;", "indicatorView", "E", "fiftyPercentRange", "F", "sixtyPercentRange", "G", "seventyPercentRange", "H", "eightyPercentRange", "ninetyPercentRange", "J", "a", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class RealTimeStrainRangeView extends FrameLayout {

    /* JADX INFO: renamed from: K */
    public static final int f29123K = 8;

    /* JADX INFO: renamed from: L */
    private static final C18284j f29124L = AbstractC12889b.m36278i0(50, 60);

    /* JADX INFO: renamed from: M */
    private static final C18284j f29125M = AbstractC12889b.m36278i0(60, 70);

    /* JADX INFO: renamed from: N */
    private static final C18284j f29126N = AbstractC12889b.m36278i0(70, 80);

    /* JADX INFO: renamed from: O */
    private static final C18284j f29127O = AbstractC12889b.m36278i0(80, 90);

    /* JADX INFO: renamed from: P */
    private static final C18284j f29128P = AbstractC12889b.m36278i0(90, 100);

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final RealTimeStrainRangeSegment fiftyPercentRange;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final RealTimeStrainRangeSegment sixtyPercentRange;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final RealTimeStrainRangeSegment seventyPercentRange;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final RealTimeStrainRangeSegment eightyPercentRange;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final RealTimeStrainRangeSegment ninetyPercentRange;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private int strainPercent;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private RealTimeStrainRangeSegment currentSegment;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final AbstractC25099s binding;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final ImageView indicatorView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RealTimeStrainRangeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC22676k.m65750j(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final void m24171b(RealTimeStrainRangeView realTimeStrainRangeView) {
        realTimeStrainRangeView.m24173d();
        realTimeStrainRangeView.m24172c();
    }

    /* JADX INFO: renamed from: c */
    private final void m24172c() {
        if (this.strainPercent < 50) {
            this.indicatorView.setTranslationX(0.0f);
            return;
        }
        RealTimeStrainRangeSegment realTimeStrainRangeSegment = this.currentSegment;
        if (realTimeStrainRangeSegment != null) {
            this.indicatorView.setTranslationX(realTimeStrainRangeSegment.getLeft() + (((getMeasuredWidth() / 5.0f) / 10.0f) * (this.strainPercent % 10)));
        }
    }

    /* JADX INFO: renamed from: d */
    private final void m24173d() {
        int i13 = this.strainPercent;
        C18284j c18284j = f29124L;
        int i14 = c18284j.f71133w;
        if (i13 <= c18284j.f71134x && i14 <= i13) {
            RealTimeStrainRangeSegment realTimeStrainRangeSegment = this.fiftyPercentRange;
            this.currentSegment = realTimeStrainRangeSegment;
            realTimeStrainRangeSegment.setState(RealTimeStrainRangeSegment.EnumC9895b.ACTIVE);
            RealTimeStrainRangeSegment realTimeStrainRangeSegment2 = this.sixtyPercentRange;
            RealTimeStrainRangeSegment.EnumC9895b enumC9895b = RealTimeStrainRangeSegment.EnumC9895b.NYR;
            realTimeStrainRangeSegment2.setState(enumC9895b);
            this.seventyPercentRange.setState(enumC9895b);
            this.eightyPercentRange.setState(enumC9895b);
            this.ninetyPercentRange.setState(enumC9895b);
            return;
        }
        C18284j c18284j2 = f29125M;
        int i15 = c18284j2.f71133w;
        if (i13 <= c18284j2.f71134x && i15 <= i13) {
            this.currentSegment = this.sixtyPercentRange;
            this.fiftyPercentRange.setState(RealTimeStrainRangeSegment.EnumC9895b.PREV);
            this.sixtyPercentRange.setState(RealTimeStrainRangeSegment.EnumC9895b.ACTIVE);
            RealTimeStrainRangeSegment realTimeStrainRangeSegment3 = this.seventyPercentRange;
            RealTimeStrainRangeSegment.EnumC9895b enumC9895b2 = RealTimeStrainRangeSegment.EnumC9895b.NYR;
            realTimeStrainRangeSegment3.setState(enumC9895b2);
            this.eightyPercentRange.setState(enumC9895b2);
            this.ninetyPercentRange.setState(enumC9895b2);
            return;
        }
        C18284j c18284j3 = f29126N;
        int i16 = c18284j3.f71133w;
        if (i13 <= c18284j3.f71134x && i16 <= i13) {
            this.currentSegment = this.seventyPercentRange;
            RealTimeStrainRangeSegment realTimeStrainRangeSegment4 = this.fiftyPercentRange;
            RealTimeStrainRangeSegment.EnumC9895b enumC9895b3 = RealTimeStrainRangeSegment.EnumC9895b.PREV;
            realTimeStrainRangeSegment4.setState(enumC9895b3);
            this.sixtyPercentRange.setState(enumC9895b3);
            this.seventyPercentRange.setState(RealTimeStrainRangeSegment.EnumC9895b.ACTIVE);
            RealTimeStrainRangeSegment realTimeStrainRangeSegment5 = this.eightyPercentRange;
            RealTimeStrainRangeSegment.EnumC9895b enumC9895b4 = RealTimeStrainRangeSegment.EnumC9895b.NYR;
            realTimeStrainRangeSegment5.setState(enumC9895b4);
            this.ninetyPercentRange.setState(enumC9895b4);
            return;
        }
        C18284j c18284j4 = f29127O;
        int i17 = c18284j4.f71133w;
        if (i13 <= c18284j4.f71134x && i17 <= i13) {
            this.currentSegment = this.eightyPercentRange;
            RealTimeStrainRangeSegment realTimeStrainRangeSegment6 = this.fiftyPercentRange;
            RealTimeStrainRangeSegment.EnumC9895b enumC9895b5 = RealTimeStrainRangeSegment.EnumC9895b.PREV;
            realTimeStrainRangeSegment6.setState(enumC9895b5);
            this.sixtyPercentRange.setState(enumC9895b5);
            this.seventyPercentRange.setState(enumC9895b5);
            this.eightyPercentRange.setState(RealTimeStrainRangeSegment.EnumC9895b.ACTIVE);
            this.ninetyPercentRange.setState(RealTimeStrainRangeSegment.EnumC9895b.NYR);
            return;
        }
        C18284j c18284j5 = f29128P;
        int i18 = c18284j5.f71133w;
        if (i13 > c18284j5.f71134x || i18 > i13) {
            RealTimeStrainRangeSegment realTimeStrainRangeSegment7 = this.fiftyPercentRange;
            this.currentSegment = realTimeStrainRangeSegment7;
            RealTimeStrainRangeSegment.EnumC9895b enumC9895b6 = RealTimeStrainRangeSegment.EnumC9895b.NYR;
            realTimeStrainRangeSegment7.setState(enumC9895b6);
            this.sixtyPercentRange.setState(enumC9895b6);
            this.seventyPercentRange.setState(enumC9895b6);
            this.eightyPercentRange.setState(enumC9895b6);
            this.ninetyPercentRange.setState(enumC9895b6);
            return;
        }
        this.currentSegment = this.ninetyPercentRange;
        RealTimeStrainRangeSegment realTimeStrainRangeSegment8 = this.fiftyPercentRange;
        RealTimeStrainRangeSegment.EnumC9895b enumC9895b7 = RealTimeStrainRangeSegment.EnumC9895b.PREV;
        realTimeStrainRangeSegment8.setState(enumC9895b7);
        this.sixtyPercentRange.setState(enumC9895b7);
        this.seventyPercentRange.setState(enumC9895b7);
        this.eightyPercentRange.setState(enumC9895b7);
        this.ninetyPercentRange.setState(RealTimeStrainRangeSegment.EnumC9895b.ACTIVE);
    }

    public final int getStrainPercent() {
        return this.strainPercent;
    }

    public final void setStrainPercent(int i13) {
        this.strainPercent = i13;
        AbstractC32411b.m101066J().post(new RunnableC24693e(this, 14));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealTimeStrainRangeView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        AbstractC25099s abstractC25099sM73592c = AbstractC25099s.m73592c(LayoutInflater.from(context), this, true);
        AbstractC22676k.m65749i(abstractC25099sM73592c, "inflate(...)");
        this.binding = abstractC25099sM73592c;
        ImageView viewRealTimeStrainRangeIndicator = abstractC25099sM73592c.f98375c;
        AbstractC22676k.m65749i(viewRealTimeStrainRangeIndicator, "viewRealTimeStrainRangeIndicator");
        this.indicatorView = viewRealTimeStrainRangeIndicator;
        RealTimeStrainRangeSegment viewRealTimeStrainRangeFifty = abstractC25099sM73592c.f98374b;
        AbstractC22676k.m65749i(viewRealTimeStrainRangeFifty, "viewRealTimeStrainRangeFifty");
        this.fiftyPercentRange = viewRealTimeStrainRangeFifty;
        RealTimeStrainRangeSegment viewRealTimeStrainRangeSixty = abstractC25099sM73592c.f98378f;
        AbstractC22676k.m65749i(viewRealTimeStrainRangeSixty, "viewRealTimeStrainRangeSixty");
        this.sixtyPercentRange = viewRealTimeStrainRangeSixty;
        RealTimeStrainRangeSegment viewRealTimeStrainRangeSeventy = abstractC25099sM73592c.f98377e;
        AbstractC22676k.m65749i(viewRealTimeStrainRangeSeventy, "viewRealTimeStrainRangeSeventy");
        this.seventyPercentRange = viewRealTimeStrainRangeSeventy;
        RealTimeStrainRangeSegment viewRealTimeStrainRangeEighty = abstractC25099sM73592c.f98373a;
        AbstractC22676k.m65749i(viewRealTimeStrainRangeEighty, "viewRealTimeStrainRangeEighty");
        this.eightyPercentRange = viewRealTimeStrainRangeEighty;
        RealTimeStrainRangeSegment viewRealTimeStrainRangeNinety = abstractC25099sM73592c.f98376d;
        AbstractC22676k.m65749i(viewRealTimeStrainRangeNinety, "viewRealTimeStrainRangeNinety");
        this.ninetyPercentRange = viewRealTimeStrainRangeNinety;
    }

    public /* synthetic */ RealTimeStrainRangeView(Context context, AttributeSet attributeSet, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }
}
