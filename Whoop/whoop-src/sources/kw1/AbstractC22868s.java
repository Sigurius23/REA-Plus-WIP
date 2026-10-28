package kw1;

import androidx.core.app.NotificationCompat;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import ew1.C13722a;
import hw1.AbstractC17702a;
import iw1.AbstractC21004j;
import iw1.AbstractC21005k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jx1.C22032v;
import m83.AbstractC25265s;
import ny0.C27256h;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: kw1.s */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aQ\u0010\f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"", NotificationCompat.CATEGORY_EVENT, "Liw1/k$d;", "viewState", "Lkotlin/Function1;", "Liw1/j;", "Ll83/a0;", "onViewEvent", "Lhw1/a;", "onNavigationEvent", "Lew1/a;", "analyticsHelper", "a", "(Ljava/lang/Object;Liw1/k$d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lew1/a;)V", "membership_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22868s {
    /* JADX INFO: renamed from: a */
    public static final void m66419a(Object event, AbstractC21005k.d viewState, Function1 onViewEvent, Function1 onNavigationEvent, C13722a c13722a) {
        Object next;
        String trackingLabel;
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        String str = "";
        if (event instanceof C22032v) {
            if (c13722a != null) {
                String trackingLabel2 = ((C22032v) event).getTrackingLabel();
                String str2 = (String) AbstractC25265s.m74102I0(viewState.getInitialSectionIndex(), viewState.m58556g());
                c13722a.m38888o(trackingLabel2, str2 != null ? str2 : "");
            }
            onViewEvent.invoke(new AbstractC21004j.d((C22032v) event));
            return;
        }
        if (event instanceof AbstractC21004j.e) {
            if (c13722a != null) {
                c13722a.m38890q(viewState.m58556g().get(((AbstractC21004j.e) event).getIndex()));
            }
            onViewEvent.invoke(event);
            return;
        }
        if (event instanceof AbstractC21004j) {
            onViewEvent.invoke(event);
            return;
        }
        if (event instanceof C9598e) {
            onNavigationEvent.invoke(new AbstractC17702a.b((C9598e) event));
            return;
        }
        if (event instanceof C27256h) {
            String str3 = (String) AbstractC25265s.m74102I0(viewState.getInitialSectionIndex(), viewState.m58556g());
            if (str3 == null) {
                str3 = "";
            }
            List<AbstractC21005k.c> listM58557h = viewState.m58557h();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listM58557h.iterator();
            while (it.hasNext()) {
                AbstractC25265s.m74141p0(arrayList, ((AbstractC21005k.c) it.next()).m58553a());
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (obj instanceof C22032v) {
                    arrayList2.add(obj);
                }
            }
            Iterator it3 = arrayList2.iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (!((C22032v) next).getSelected());
            C22032v c22032v = (C22032v) next;
            if (c13722a != null) {
                String cardName = ((C27256h) event).getCardName();
                if (cardName == null) {
                    cardName = "";
                }
                if (c22032v != null && (trackingLabel = c22032v.getTrackingLabel()) != null) {
                    str = trackingLabel;
                }
                c13722a.m38887l(cardName, str3, str);
            }
            C27256h c27256h = (C27256h) event;
            if (!AbstractC22676k.m65745e(c27256h.getDestination().getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9318g6.f27632w)) {
                onNavigationEvent.invoke(new AbstractC17702a.b(c27256h.getDestination()));
            } else if (c22032v != null) {
                onViewEvent.invoke(new AbstractC21004j.b(c22032v));
            }
        }
    }
}
