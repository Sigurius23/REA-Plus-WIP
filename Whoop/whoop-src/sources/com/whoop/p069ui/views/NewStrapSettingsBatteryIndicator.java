package com.whoop.p069ui.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.C4964f;
import com.bumptech.glide.ComponentCallbacks2C4960b;
import com.whoop.connectivityCore.batteryPack.models.BatteryPackType;
import d91.AbstractC11814b;
import hi0.AbstractC17311i;
import hi0.AbstractC17312j;
import ii0.AbstractC18554k0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kk1.C22541b;
import kn2.EnumC22601c;
import l83.C23454a0;
import os0.AbstractC28309e;
import p390p1.C28655q;
import p479s4.AbstractC32122c;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import yg2.C39531f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u000eJ\u000f\u0010\u0014\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001a\u0010\u0015J\u000f\u0010\u001b\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001b\u0010\u0015J\u000f\u0010\u001c\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001c\u0010\u0015J7\u0010#\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0006H\u0014¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b%\u0010\u000eR\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0011\u0010,\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, m65681d2 = {"Lcom/whoop/ui/views/NewStrapSettingsBatteryIndicator;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/whoop/ui/views/a;", "viewState", "Ll83/a0;", "setPuffinChargingStateVisibility", "(Lcom/whoop/ui/views/a;)V", "setStandardChargingStateVisibility", "batteryPercent", "q", "(I)V", "p", "m", "()V", "Lkn2/c;", "strapGeneration", "r", "(Lkn2/c;)V", "o", "l", "k", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "j", "Lii0/k0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lii0/k0;", "binding", "getBatteryLevel", "()I", "batteryLevel", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class NewStrapSettingsBatteryIndicator extends ConstraintLayout {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private AbstractC18554k0 binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NewStrapSettingsBatteryIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC22676k.m65750j(context, "context");
    }

    /* JADX INFO: renamed from: k */
    private final void m27455k() {
        this.binding.f72320b.setPositionPer(((this.binding.f72324f.getRight() + this.binding.f72324f.getLeft()) / 2) / getWidth());
    }

    /* JADX INFO: renamed from: l */
    private final void m27456l() {
        this.binding.f72320b.setVisibility(4);
    }

    /* JADX INFO: renamed from: m */
    private final void m27457m() {
        this.binding.f72328j.setVisibility(4);
        this.binding.f72326h.setVisibility(4);
        this.binding.f72325g.setVisibility(4);
        this.binding.f72321c.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m27458n(C10627a c10627a, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC28309e.m85770e(c10627a.getPuffinBatteryViewState(), c28655q, C39531f.f170077e);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    private final void m27459o() {
        this.binding.f72320b.setVisibility(0);
    }

    /* JADX INFO: renamed from: p */
    private final void m27460p(C10627a viewState) {
        this.binding.f72328j.setVisibility(0);
        this.binding.f72326h.setVisibility(0);
        if (viewState.getBatteryPackType() == BatteryPackType.PENGUIN && viewState.getIsMaverickOrGoose()) {
            this.binding.f72321c.setVisibility(0);
            this.binding.f72328j.setVisibility(8);
        } else {
            this.binding.f72321c.setVisibility(8);
            this.binding.f72328j.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: q */
    private final void m27461q(int batteryPercent) {
        this.binding.f72324f.setProgressTintList(ColorStateList.valueOf(AbstractC32122c.getColor(getContext(), EnumC10628b.INSTANCE.m27486a(batteryPercent).getColorResId())));
        if (batteryPercent < 0 || batteryPercent >= 101) {
            this.binding.f72323e.setText(AbstractC17312j.f66920D);
            this.binding.f72324f.setProgress(0);
        } else {
            this.binding.f72323e.setText(String.valueOf(batteryPercent));
            this.binding.f72324f.setProgress(batteryPercent);
        }
    }

    /* JADX INFO: renamed from: r */
    private final void m27462r(EnumC22601c strapGeneration) {
        TextView batteryIndicatorStrapGeneration = this.binding.f72329k;
        AbstractC22676k.m65749i(batteryIndicatorStrapGeneration, "batteryIndicatorStrapGeneration");
        batteryIndicatorStrapGeneration.setVisibility(strapGeneration != EnumC22601c.DISCONNECTED ? 0 : 8);
        if (strapGeneration.getTextResId() != 0) {
            this.binding.f72329k.setText(strapGeneration.getTextResId());
        }
    }

    private final void setPuffinChargingStateVisibility(C10627a viewState) {
        ComposeView batteryIndicatorPuffinContainer = this.binding.f72325g;
        AbstractC22676k.m65749i(batteryIndicatorPuffinContainer, "batteryIndicatorPuffinContainer");
        batteryIndicatorPuffinContainer.setVisibility(viewState.getIsCharging() ? 0 : 8);
        ImageView batteryIndicatorStrapChargingAnimation = this.binding.f72326h;
        AbstractC22676k.m65749i(batteryIndicatorStrapChargingAnimation, "batteryIndicatorStrapChargingAnimation");
        batteryIndicatorStrapChargingAnimation.setVisibility(viewState.getIsCharging() ? 0 : 8);
        ImageView batteryIndicatorStrapChargingImage = this.binding.f72328j;
        AbstractC22676k.m65749i(batteryIndicatorStrapChargingImage, "batteryIndicatorStrapChargingImage");
        batteryIndicatorStrapChargingImage.setVisibility(4);
        if (viewState.getIsCharging()) {
            ComposeView batteryIndicatorPuffinContainer2 = this.binding.f72325g;
            AbstractC22676k.m65749i(batteryIndicatorPuffinContainer2, "batteryIndicatorPuffinContainer");
            AbstractC11814b.m31673c(batteryIndicatorPuffinContainer2, new C37816b(new C22541b(viewState, 1), true, -419808554));
        }
    }

    private final void setStandardChargingStateVisibility(C10627a viewState) {
        if (viewState.getIsCharging()) {
            m27460p(viewState);
        } else {
            m27457m();
        }
    }

    public final int getBatteryLevel() {
        return this.binding.f72324f.getProgress();
    }

    /* JADX INFO: renamed from: j */
    public final void m27463j(C10627a viewState) {
        AbstractC22676k.m65750j(viewState, "viewState");
        m27461q(viewState.getBatteryPercent());
        m27457m();
        if (viewState.getIsMaverickOrGoose() && viewState.getPuffinChargeFeatureEnabled() && viewState.getBatteryPackType() == BatteryPackType.PUFFIN) {
            setPuffinChargingStateVisibility(viewState);
        } else {
            setStandardChargingStateVisibility(viewState);
        }
        if (viewState.m27482g()) {
            m27459o();
        } else {
            m27456l();
        }
        m27462r(viewState.getStrapGeneration());
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        m27455k();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewStrapSettingsBatteryIndicator(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        AbstractC18554k0 abstractC18554k0M53767c = AbstractC18554k0.m53767c(LayoutInflater.from(context), this, true);
        AbstractC22676k.m65749i(abstractC18554k0M53767c, "inflate(...)");
        this.binding = abstractC18554k0M53767c;
        ((C4964f) ComponentCallbacks2C4960b.m15528d(context).m75567f(context).m15548l(Integer.valueOf(AbstractC17311i.f66913j)).m89318i(Integer.MIN_VALUE, Integer.MIN_VALUE)).m15537y(this.binding.f72326h);
    }

    public /* synthetic */ NewStrapSettingsBatteryIndicator(Context context, AttributeSet attributeSet, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }
}
