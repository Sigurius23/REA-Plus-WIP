package com.whoop.realtime.presentation.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whoop.p069ui.AbstractC10538f;
import com.whoop.realtime.presentation.C9889m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import k52.AbstractC22210f;
import m52.AbstractC25097q;
import o52.EnumC27584v0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p92.C29021j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0006\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010'R\u0014\u0010,\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010'R\"\u00102\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010#\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0018\u00105\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R*\u0010>\u001a\u0002062\u0006\u00107\u001a\u0002068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R*\u0010B\u001a\u0002062\u0006\u00107\u001a\u0002068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b?\u00109\u001a\u0004\b@\u0010;\"\u0004\bA\u0010=¨\u0006C"}, m65681d2 = {"Lcom/whoop/realtime/presentation/views/DayStrainView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ll83/a0;", "f", "()V", "j", "", "getTrainingStateLabel", "()Ljava/lang/String;", "Lcom/whoop/realtime/presentation/m;", "controller", "Lp92/j;", "strainRecoveryMapper", "Lo52/v0;", "strainCoachStates", "k", "(Lcom/whoop/realtime/presentation/m;Lp92/j;Lo52/v0;)V", "Lm52/q;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lm52/q;", "binding", "Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;", "x", "Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;", "strainGraph", "Landroid/widget/TextView;", "y", "Landroid/widget/TextView;", "titleText", "Lcom/whoop/realtime/presentation/views/RealTimeCell;", "z", "Lcom/whoop/realtime/presentation/views/RealTimeCell;", "currentDayStrainCell", "E", "activityStrainCell", "F", "estimatedDayStrainCell", "G", "getOptimalTrainingLink", "()Landroid/widget/TextView;", "setOptimalTrainingLink", "(Landroid/widget/TextView;)V", "optimalTrainingLink", "H", "Lcom/whoop/realtime/presentation/m;", "strainController", "", "value", "I", "D", "getActivityStrain", "()D", "setActivityStrain", "(D)V", "activityStrain", "J", "getEstimatedDayStrain", "setEstimatedDayStrain", "estimatedDayStrain", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class DayStrainView extends ConstraintLayout {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final RealTimeCell activityStrainCell;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final RealTimeCell estimatedDayStrainCell;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private TextView optimalTrainingLink;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private C9889m strainController;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private double activityStrain;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private double estimatedDayStrain;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final AbstractC25097q binding;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final StrainCoachStrainGraph strainGraph;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final TextView titleText;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final RealTimeCell currentDayStrainCell;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DayStrainView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC22676k.m65750j(context, "context");
    }

    /* JADX INFO: renamed from: f */
    private final void m24151f() {
        setLayerType(1, null);
        RealTimeCell realTimeCell = this.currentDayStrainCell;
        String string = getContext().getString(AbstractC22210f.f86497m0);
        AbstractC22676k.m65749i(string, "getString(...)");
        realTimeCell.setLabelText(string);
        RealTimeCell realTimeCell2 = this.activityStrainCell;
        String string2 = getContext().getString(AbstractC22210f.f86494l0);
        AbstractC22676k.m65749i(string2, "getString(...)");
        realTimeCell2.setLabelText(string2);
        RealTimeCell realTimeCell3 = this.estimatedDayStrainCell;
        String string3 = getContext().getString(AbstractC22210f.f86500n0);
        AbstractC22676k.m65749i(string3, "getString(...)");
        realTimeCell3.setLabelText(string3);
    }

    private final String getTrainingStateLabel() {
        C9889m c9889m = this.strainController;
        if (c9889m == null) {
            return "";
        }
        Context context = getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        return c9889m.m24136i(context, this.estimatedDayStrain);
    }

    /* JADX INFO: renamed from: j */
    private final void m24152j() {
        C9889m c9889m;
        String strM27183h;
        String strM27183h2;
        String strM27183h3;
        C9889m c9889m2 = this.strainController;
        if ((c9889m2 != null ? c9889m2.getCurrentRecoveryPct() : null) == null || (c9889m = this.strainController) == null || c9889m.getIsCurrentlyBlackedOut()) {
            RealTimeCell realTimeCell = this.currentDayStrainCell;
            String string = getContext().getString(AbstractC22210f.f86519t1);
            AbstractC22676k.m65749i(string, "getString(...)");
            realTimeCell.setValueText(string);
            RealTimeCell realTimeCell2 = this.activityStrainCell;
            String string2 = getContext().getString(AbstractC22210f.f86519t1);
            AbstractC22676k.m65749i(string2, "getString(...)");
            realTimeCell2.setValueText(string2);
            RealTimeCell realTimeCell3 = this.estimatedDayStrainCell;
            String string3 = getContext().getString(AbstractC22210f.f86519t1);
            AbstractC22676k.m65749i(string3, "getString(...)");
            realTimeCell3.setValueText(string3);
            this.titleText.setText(getContext().getString(AbstractC22210f.f86453W0));
        } else {
            C9889m c9889m3 = this.strainController;
            double currentDayStrain = c9889m3 != null ? c9889m3.getCurrentDayStrain() : 0.0d;
            this.strainGraph.setDayStrain(currentDayStrain);
            StrainCoachStrainGraph strainCoachStrainGraph = this.strainGraph;
            C9889m c9889m4 = this.strainController;
            strainCoachStrainGraph.setRecoveryPct(c9889m4 != null ? c9889m4.getCurrentRecoveryPct() : null);
            this.strainGraph.setActivityStrain(this.activityStrain);
            this.strainGraph.setEstimatedDayStrain(this.estimatedDayStrain);
            RealTimeCell realTimeCell4 = this.currentDayStrainCell;
            if (currentDayStrain == 0.0d) {
                strM27183h = getContext().getString(AbstractC22210f.f86519t1);
                AbstractC22676k.m65749i(strM27183h, "getString(...)");
            } else {
                strM27183h = AbstractC10538f.m27183h(currentDayStrain);
            }
            realTimeCell4.setValueText(strM27183h);
            RealTimeCell realTimeCell5 = this.activityStrainCell;
            double d3 = this.activityStrain;
            if (d3 == 0.0d) {
                strM27183h2 = getContext().getString(AbstractC22210f.f86519t1);
                AbstractC22676k.m65749i(strM27183h2, "getString(...)");
            } else {
                strM27183h2 = AbstractC10538f.m27183h(d3);
            }
            realTimeCell5.setValueText(strM27183h2);
            RealTimeCell realTimeCell6 = this.estimatedDayStrainCell;
            double d14 = this.estimatedDayStrain;
            if (d14 == 0.0d) {
                strM27183h3 = getContext().getString(AbstractC22210f.f86519t1);
                AbstractC22676k.m65749i(strM27183h3, "getString(...)");
            } else {
                strM27183h3 = AbstractC10538f.m27183h(d14);
            }
            realTimeCell6.setValueText(strM27183h3);
            this.titleText.setText(this.activityStrain == 0.0d ? getContext().getString(AbstractC22210f.f86453W0) : getContext().getString(AbstractC22210f.f86451V0, getTrainingStateLabel()));
        }
        invalidate();
    }

    public final double getActivityStrain() {
        return this.activityStrain;
    }

    public final double getEstimatedDayStrain() {
        return this.estimatedDayStrain;
    }

    public final TextView getOptimalTrainingLink() {
        return this.optimalTrainingLink;
    }

    /* JADX INFO: renamed from: k */
    public final void m24153k(C9889m controller, C29021j strainRecoveryMapper, EnumC27584v0 strainCoachStates) {
        AbstractC22676k.m65750j(controller, "controller");
        AbstractC22676k.m65750j(strainCoachStates, "strainCoachStates");
        this.strainController = controller;
        this.strainGraph.setStrainRecoveryMapper(strainRecoveryMapper);
        this.strainGraph.setStrainCoachStates(strainCoachStates);
        m24152j();
    }

    public final void setActivityStrain(double d3) {
        this.activityStrain = d3;
        m24152j();
    }

    public final void setEstimatedDayStrain(double d3) {
        this.estimatedDayStrain = d3;
        m24152j();
    }

    public final void setOptimalTrainingLink(TextView textView) {
        AbstractC22676k.m65750j(textView, "<set-?>");
        this.optimalTrainingLink = textView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DayStrainView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        AbstractC25097q abstractC25097qM73590c = AbstractC25097q.m73590c(LayoutInflater.from(context), this, true);
        AbstractC22676k.m65749i(abstractC25097qM73590c, "inflate(...)");
        this.binding = abstractC25097qM73590c;
        StrainCoachStrainGraph viewDaystrainStraingraph = abstractC25097qM73590c.f98367o;
        AbstractC22676k.m65749i(viewDaystrainStraingraph, "viewDaystrainStraingraph");
        this.strainGraph = viewDaystrainStraingraph;
        TextView viewDaystrainTitle = abstractC25097qM73590c.f98368p;
        AbstractC22676k.m65749i(viewDaystrainTitle, "viewDaystrainTitle");
        this.titleText = viewDaystrainTitle;
        RealTimeCell viewDaystrainCurrentDayStrainCell = abstractC25097qM73590c.f98363k;
        AbstractC22676k.m65749i(viewDaystrainCurrentDayStrainCell, "viewDaystrainCurrentDayStrainCell");
        this.currentDayStrainCell = viewDaystrainCurrentDayStrainCell;
        RealTimeCell viewDaystrainActivityStrainCell = abstractC25097qM73590c.f98362j;
        AbstractC22676k.m65749i(viewDaystrainActivityStrainCell, "viewDaystrainActivityStrainCell");
        this.activityStrainCell = viewDaystrainActivityStrainCell;
        RealTimeCell viewDaystrainEstimatedDayStrainCell = abstractC25097qM73590c.f98364l;
        AbstractC22676k.m65749i(viewDaystrainEstimatedDayStrainCell, "viewDaystrainEstimatedDayStrainCell");
        this.estimatedDayStrainCell = viewDaystrainEstimatedDayStrainCell;
        TextView viewDaystrainOptimaltrainingLink = abstractC25097qM73590c.f98365m;
        AbstractC22676k.m65749i(viewDaystrainOptimaltrainingLink, "viewDaystrainOptimaltrainingLink");
        this.optimalTrainingLink = viewDaystrainOptimaltrainingLink;
        m24151f();
    }

    public /* synthetic */ DayStrainView(Context context, AttributeSet attributeSet, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }
}
