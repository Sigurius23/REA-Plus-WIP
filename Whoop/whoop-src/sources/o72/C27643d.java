package o72;

import a71.C0520a;
import a71.C0522c;
import a72.AbstractC0524a;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import b72.C2786d;
import b72.C2787e;
import b72.EnumC2788f;
import com.whoop.design.util.TextResource;
import cz0.AbstractC11258s;
import d61.InterfaceC11732a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import m72.AbstractC25206e;
import m83.AbstractC25265s;
import o51.AbstractC27535a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: o72.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJo\u0010\u0017\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\b2\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00110\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00110\u00102\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, m65681d2 = {"Lo72/d;", "", "<init>", "()V", "Lb72/e;", "gaugeState", "Ld61/a;", NotificationCompat.CATEGORY_EVENT, "Landroid/content/Context;", "context", "c", "(Lb72/e;Ld61/a;Landroid/content/Context;)Lb72/e;", "Lo51/a;", "action", "sageGaugeState", "initialSageGaugeState", "Lkotlin/Function1;", "Ll83/a0;", "onUpdateGaugeState", "Lm72/e;", "onViewEvent", "La72/a;", "onAnalyticsEvent", "a", "(Lo51/a;Lb72/e;Lb72/e;Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "La71/c;", "sageDetails", "", "isRight", "Lb72/d;", "b", "(La71/c;Z)Lb72/d;", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27643d {
    /* JADX INFO: renamed from: a */
    public final void m83466a(AbstractC27535a action, C2787e sageGaugeState, C2787e initialSageGaugeState, Context context, Function1 onUpdateGaugeState, Function1 onViewEvent, Function1 onAnalyticsEvent) {
        AbstractC22676k.m65750j(action, "action");
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(onUpdateGaugeState, "onUpdateGaugeState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onAnalyticsEvent, "onAnalyticsEvent");
        if (!(action instanceof AbstractC27535a.c)) {
            if (action instanceof AbstractC27535a.a) {
                onAnalyticsEvent.invoke(new AbstractC0524a.c(((AbstractC27535a.a) action).getIsDateIncrease()));
                onViewEvent.invoke(new AbstractC25206e.a(action));
                return;
            } else {
                if (action instanceof AbstractC27535a.b) {
                    onAnalyticsEvent.invoke(new AbstractC0524a.d(((AbstractC27535a.b) action).getIndex()));
                    return;
                }
                return;
            }
        }
        Object obj = ((AbstractC27535a.c) action).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
        if (obj instanceof InterfaceC11732a) {
            InterfaceC11732a interfaceC11732a = (InterfaceC11732a) obj;
            if ((interfaceC11732a instanceof InterfaceC11732a.c) || (interfaceC11732a instanceof InterfaceC11732a.a)) {
                onUpdateGaugeState.invoke(sageGaugeState != null ? m83468c(sageGaugeState, interfaceC11732a, context) : null);
            } else {
                if (!(interfaceC11732a instanceof InterfaceC11732a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                onUpdateGaugeState.invoke(initialSageGaugeState);
                onAnalyticsEvent.invoke(AbstractC0524a.p.f1808a);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final C2786d m83467b(C0522c sageDetails, boolean isRight) {
        if (sageDetails == null) {
            return new C2786d("", "--", "");
        }
        return new C2786d(isRight ? sageDetails.getTrailingLabelDisplay() : sageDetails.getLeadingLabelDisplay(), isRight ? sageDetails.getTrailingRangeDisplay() : sageDetails.getLeadingRangeDisplay(), sageDetails.getUnitDisplay());
    }

    /* JADX INFO: renamed from: c */
    public final C2787e m83468c(C2787e gaugeState, InterfaceC11732a event, Context context) {
        TextResource secondaryContextualDisplay;
        CharSequence charSequenceResolve;
        Float value;
        AbstractC22676k.m65750j(gaugeState, "gaugeState");
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(context, "context");
        Collection<AbstractC11258s> collectionValues = event.mo31360b().values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            AbstractC25265s.m74141p0(arrayList, ((AbstractC11258s) it.next()).mo30408a());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((C0520a) obj).getSageScrubberDetails() != null) {
                arrayList2.add(obj);
            }
        }
        C0520a c0520a = (C0520a) AbstractC25265s.m74100H0(arrayList2);
        String string = (c0520a != null ? c0520a.getPrimaryContextualDisplay() : null) != null ? c0520a.getPrimaryContextualDisplay().resolve(context).toString() : "";
        float fFloatValue = (c0520a == null || (value = c0520a.getValue()) == null) ? 0.0f : value.floatValue();
        return C2787e.m7922b(gaugeState, (c0520a == null || (secondaryContextualDisplay = c0520a.getSecondaryContextualDisplay()) == null || (charSequenceResolve = secondaryContextualDisplay.resolve(context)) == null) ? null : charSequenceResolve.toString(), string, c0520a != null ? EnumC2788f.DATA_PRESENT : EnumC2788f.MISSING_DATA, m83467b(c0520a != null ? c0520a.getSageScrubberDetails() : null, false), m83467b(c0520a != null ? c0520a.getSageScrubberDetails() : null, true), Float.valueOf(fFloatValue), false, null, false, 448, null);
    }
}
