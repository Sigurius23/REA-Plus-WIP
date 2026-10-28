package jd0;

import a41.C0366b;
import androidx.core.app.NotificationCompat;
import com.whoop.advancedlabs.presentation.models.AppointmentSummaryBottomSheet;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.item.DesignItemInteraction;
import com.whoop.design.models.items.ArticleTileModelEvent;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.navigation.C9598e;
import com.whoop.whoopaction.domain.models.Action;
import d11.C11474i;
import j02.C21166s;
import j21.AbstractC21243b;
import k11.AbstractC22122e;
import kd0.InterfaceC22381a;
import lf0.AbstractC23926i;
import ny0.C27256h;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q31.C29944b;
import s01.C32048d;
import vw2.C36548c;
import ya0.C39355a;

/* JADX INFO: renamed from: jd0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Ljd0/a;", "", "Lya0/a;", "analytics", "<init>", "(Lya0/a;)V", "Lkd0/a$x;", NotificationCompat.CATEGORY_EVENT, "Lkd0/a;", "b", "(Lkd0/a$x;)Lkd0/a;", "Lcom/whoop/navigation/e;", "navAction", "c", "(Lcom/whoop/navigation/e;)Lkd0/a;", "actionEvent", "d", "(Lkd0/a;)Lkd0/a;", "Lk11/e;", "a", "(Lk11/e;)Lkd0/a;", "Lya0/a;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21608a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C39355a analytics;

    public C21608a(C39355a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: b */
    private final InterfaceC22381a m60766b(InterfaceC22381a.x event) {
        InterfaceC22381a interfaceC22381aM60767c;
        Object obj = event.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
        if (obj instanceof DesignItemInteraction) {
            DesignItemInteraction designItemInteraction = (DesignItemInteraction) obj;
            AnalyticEventModel analyticEvent = designItemInteraction.getAnalyticEvent();
            if (analyticEvent != null) {
                this.analytics.m125495d(analyticEvent);
            }
            Object actionArgument = designItemInteraction.getActionArgument();
            if (actionArgument != null) {
                return m60766b(InterfaceC22381a.x.m64343b(event, actionArgument, null, 2, null));
            }
        } else {
            if (obj instanceof C9598e) {
                return m60767c((C9598e) obj);
            }
            if (obj instanceof Action) {
                return new InterfaceC22381a.i(new C36548c((Action) obj));
            }
            if (obj instanceof ArticleTileModelEvent) {
                ArticleTileModelEvent articleTileModelEvent = (ArticleTileModelEvent) obj;
                AnalyticEventModel analyticEvent2 = articleTileModelEvent.getAnalyticEvent();
                if (analyticEvent2 != null) {
                    this.analytics.m125495d(analyticEvent2);
                }
                if (articleTileModelEvent instanceof ArticleTileModelEvent.Url) {
                    C39355a c39355a = this.analytics;
                    ArticleTileModelEvent.Url url = (ArticleTileModelEvent.Url) obj;
                    Integer index = url.getIndex();
                    c39355a.m125496e(new InterfaceC22381a.q(index != null ? String.valueOf(index.intValue()) : null, url.getTitle()));
                    return new InterfaceC22381a.h(url);
                }
                if (!(articleTileModelEvent instanceof ArticleTileModelEvent.Cta) && !(articleTileModelEvent instanceof ArticleTileModelEvent.Image)) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                if (obj instanceof AbstractC21243b.a) {
                    return new InterfaceC22381a.z(((AbstractC21243b.a) obj).getId());
                }
                if (obj instanceof AbstractC21243b.b) {
                    return m60767c(((AbstractC21243b.b) obj).getDestination());
                }
                if (obj instanceof C11474i) {
                    C9598e navigationAction = ((C11474i) obj).getNavigationAction();
                    if (navigationAction != null) {
                        return m60767c(navigationAction);
                    }
                } else {
                    if (obj instanceof C32048d) {
                        C32048d c32048d = (C32048d) obj;
                        C9598e destination = c32048d.getDestination();
                        return (destination == null || (interfaceC22381aM60767c = m60767c(destination)) == null) ? new InterfaceC22381a.h1(AbstractC8693b.m21268b(c32048d.getVow())) : interfaceC22381aM60767c;
                    }
                    if (obj instanceof C27256h) {
                        C27256h c27256h = (C27256h) obj;
                        if (AbstractC22676k.m65745e(c27256h.getId(), "advanced_labs_home_info_callout_missed_test_callout_reschedule_button")) {
                            this.analytics.m125496e(new InterfaceC22381a.g("appt_no_show"));
                        }
                        Object actionArgument2 = c27256h.getActionArgument();
                        C21166s dismissEvent = c27256h.getDismissEvent();
                        Action action = c27256h.getAction();
                        if (action != null) {
                            return new InterfaceC22381a.i(new C36548c(action));
                        }
                        if (actionArgument2 instanceof AnyModal) {
                            return new InterfaceC22381a.j0((AnyModal) actionArgument2);
                        }
                        return dismissEvent != null ? new InterfaceC22381a.i0(dismissEvent) : m60767c(c27256h.getDestination());
                    }
                    if (obj instanceof AbstractC22122e) {
                        return m60768a((AbstractC22122e) obj);
                    }
                    if (obj instanceof InterfaceC25312u) {
                        return new InterfaceC22381a.d((InterfaceC25312u) obj);
                    }
                    if (obj instanceof AbstractC23926i.a) {
                        this.analytics.m125496e(InterfaceC22381a.e.f87398a);
                        return null;
                    }
                    if (obj instanceof AbstractC23926i.b) {
                        this.analytics.m125496e(new InterfaceC22381a.g("workflow_tile"));
                        return null;
                    }
                    if (obj instanceof AbstractC23926i.c) {
                        this.analytics.m125496e(InterfaceC22381a.f.f87401a);
                        AbstractC23926i.c cVar = (AbstractC23926i.c) obj;
                        Action action2 = cVar.getState().getAction();
                        return action2 != null ? new InterfaceC22381a.i(new C36548c(action2)) : m60767c(cVar.getState().getDestination());
                    }
                    if (obj instanceof C29944b) {
                        C29944b c29944b = (C29944b) obj;
                        this.analytics.m125496e(new InterfaceC22381a.o0(c29944b.getSegmentId()));
                        return new InterfaceC22381a.o0(c29944b.getSegmentId());
                    }
                    if (obj instanceof C0366b) {
                        this.analytics.m125496e(new InterfaceC22381a.t0(((C0366b) obj).getId(), "advanced_labs_home"));
                        return null;
                    }
                    if (obj instanceof AppointmentSummaryBottomSheet) {
                        return new InterfaceC22381a.p0((AppointmentSummaryBottomSheet) obj);
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    private final InterfaceC22381a m60767c(C9598e navAction) {
        return new InterfaceC22381a.j(navAction);
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC22381a m60768a(AbstractC22122e event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC22122e.a) {
            return new InterfaceC22381a.i(new C36548c(((AbstractC22122e.a) event).getAction()));
        }
        if (event instanceof AbstractC22122e.b) {
            return m60767c(((AbstractC22122e.b) event).getDestination());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC22381a m60769d(InterfaceC22381a actionEvent) {
        AbstractC22676k.m65750j(actionEvent, "actionEvent");
        if (actionEvent instanceof InterfaceC22381a.c) {
            this.analytics.m125496e((InterfaceC22381a.c) actionEvent);
        }
        return actionEvent instanceof InterfaceC22381a.x ? m60766b((InterfaceC22381a.x) actionEvent) : actionEvent;
    }
}
