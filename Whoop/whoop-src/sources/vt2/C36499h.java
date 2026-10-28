package vt2;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.NavigationScreenModel;
import com.whoop.navigation.TrendsScreenModel;
import j02.InterfaceC21159o0;
import ls2.AbstractC24716a;
import ls2.C24717b;
import nf1.AbstractC26666g;
import or2.C28216y;
import p114eb.AbstractC12939a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: vt2.h */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\u0012B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, m65681d2 = {"Lvt2/h;", "", "Landroidx/fragment/app/m0;", "fragment", "Leb/a0;", "composeNavController", "fragmentNavController", "Lj02/o0;", "navigator", "Lor2/y;", "externalLinkNavigator", "Lls2/b;", "analytics", "<init>", "(Landroidx/fragment/app/m0;Leb/a0;Leb/a0;Lj02/o0;Lor2/y;Lls2/b;)V", "Lcom/whoop/navigation/e;", "action", "Ll83/a0;", "a", "(Lcom/whoop/navigation/e;)V", "Lcom/whoop/navigation/NavigationScreenModel;", "c", "(Lcom/whoop/navigation/NavigationScreenModel;)Lcom/whoop/navigation/NavigationScreenModel;", NotificationCompat.CATEGORY_EVENT, "b", "(Ljava/lang/Object;)V", "Landroidx/fragment/app/m0;", "Leb/a0;", "d", "Lj02/o0;", "e", "Lor2/y;", "f", "Lls2/b;", "g", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36499h {

    /* JADX INFO: renamed from: h */
    public static final int f155931h = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractComponentCallbacksC1320m0 fragment;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC12939a0 composeNavController;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC12939a0 fragmentNavController;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C28216y externalLinkNavigator;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C24717b analytics;

    public C36499h(AbstractComponentCallbacksC1320m0 fragment, AbstractC12939a0 composeNavController, AbstractC12939a0 fragmentNavController, InterfaceC21159o0 navigator, C28216y externalLinkNavigator, C24717b analytics) {
        AbstractC22676k.m65750j(fragment, "fragment");
        AbstractC22676k.m65750j(composeNavController, "composeNavController");
        AbstractC22676k.m65750j(fragmentNavController, "fragmentNavController");
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(externalLinkNavigator, "externalLinkNavigator");
        AbstractC22676k.m65750j(analytics, "analytics");
        this.fragment = fragment;
        this.composeNavController = composeNavController;
        this.fragmentNavController = fragmentNavController;
        this.navigator = navigator;
        this.externalLinkNavigator = externalLinkNavigator;
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    private final void m116995a(C9598e action) {
        this.navigator.mo59392a(C9598e.m23127b(action, null, m116996c(action.getParameters()), null, 5, null));
    }

    /* JADX INFO: renamed from: c */
    private final NavigationScreenModel m116996c(NavigationScreenModel navigationScreenModel) {
        return navigationScreenModel instanceof TrendsScreenModel ? TrendsScreenModel.copy$default((TrendsScreenModel) navigationScreenModel, null, 0, null, null, "Weekly Plan", null, 47, null) : navigationScreenModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final void m116997b(Object event) {
        String string;
        AbstractC22676k.m65750j(event, "event");
        if (event.equals(AbstractC36498g.a.f155924a)) {
            this.composeNavController.m36410z();
            return;
        }
        if (event.equals(AbstractC36498g.b.f155925a)) {
            this.fragmentNavController.m36410z();
            return;
        }
        String str = null;
        Object[] objArr = 0;
        if (event instanceof AbstractC36498g.c) {
            AbstractC12939a0.m36374y(this.composeNavController, "PRESETS", null, 6);
            return;
        }
        if (event instanceof AbstractC36498g.d) {
            AbstractC36498g.d dVar = (AbstractC36498g.d) event;
            this.analytics.m72377q(new AbstractC24716a.r(dVar.getNumberOfGoals(), str, 2, objArr == true ? 1 : 0));
            this.fragmentNavController.m36402q(C36494c.f155913a.m116954a(dVar.getPlanId()));
        } else {
            if (!event.equals(AbstractC36498g.e.f155929a)) {
                if (event instanceof C9598e) {
                    m116995a((C9598e) event);
                    return;
                }
                return;
            }
            C28216y c28216y = this.externalLinkNavigator;
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = this.fragment.requireActivity();
            AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
            Context context = this.fragment.getContext();
            if (context == null || (string = context.getString(AbstractC26666g.f106010a)) == null) {
                string = "";
            }
            C28216y.m85414y(c28216y, abstractActivityC1340r0RequireActivity, string, false, 4, null);
        }
    }
}
