package pi1;

import androidx.core.app.NotificationCompat;
import c41.C4064l2;
import c41.C4140w1;
import cj1.C4766v;
import cj1.InterfaceC4751g;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import f01.C13885o0;
import fi0.AbstractC14516b;
import fi0.InterfaceC14515a;
import fj1.C14532c;
import fj1.C14542m;
import java.util.Locale;
import l01.C23037i;
import l01.C23042n;
import l01.EnumC23048t;
import l83.C23465k;
import m83.AbstractC25247g0;
import ny0.C27256h;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: pi1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u00020\b*\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u00020\b*\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\b*\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\b*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lpi1/a;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "Lcj1/g$l;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "b", "(Lcj1/g$l;)V", "Lc41/w1;", "c", "(Lc41/w1;Lcj1/g$l;)V", "Ll01/n;", "f", "(Ll01/n;Lcj1/g$l;)V", "Lfj1/c;", "e", "(Lfj1/c;)V", "Lf01/o0;", "d", "(Lf01/o0;)V", "Lcj1/g$a;", "a", "(Lcj1/g$a;)V", "Lfi0/a;", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29251a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    public C29251a(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: b */
    private final void m88856b(InterfaceC4751g.l event) {
        InterfaceC25312u element = event.getElement();
        if (element instanceof C13885o0) {
            m88858d((C13885o0) element);
            return;
        }
        if (element instanceof C4064l2) {
            AbstractC29252b.m88866e(this.analytics);
            return;
        }
        if (element instanceof C14542m) {
            AbstractC29252b.m88871j(this.analytics);
            return;
        }
        if (element instanceof C4766v) {
            AbstractC29252b.m88868g(this.analytics);
            return;
        }
        if (element instanceof C14532c) {
            m88859e((C14532c) element);
        } else if (element instanceof C23042n) {
            m88860f((C23042n) element, event);
        } else if (element instanceof C4140w1) {
            m88857c((C4140w1) element, event);
        }
    }

    /* JADX INFO: renamed from: c */
    private final void m88857c(C4140w1 c4140w1, InterfaceC4751g.l lVar) {
        Object obj = lVar.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
        if ((obj instanceof C9598e) && (((C9598e) obj).getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String() instanceof AppScreen.C9264a0)) {
            AbstractC29252b.m88869h(this.analytics);
        }
    }

    /* JADX INFO: renamed from: d */
    private final void m88858d(C13885o0 c13885o0) {
        String cardName = c13885o0.getCardName();
        int iHashCode = cardName.hashCode();
        if (iHashCode == 670326538) {
            if (cardName.equals("BLOOD_PRESSURE")) {
                AbstractC29252b.m88865d(this.analytics);
            }
        } else if (iHashCode == 1393842086) {
            if (cardName.equals("HEALTHSPAN")) {
                AbstractC29252b.m88867f(this.analytics);
            }
        } else if (iHashCode == 1568489903 && cardName.equals("STRESS_MONITOR")) {
            AbstractC29252b.m88872k(this.analytics);
        }
    }

    /* JADX INFO: renamed from: e */
    private final void m88859e(C14532c c14532c) {
        String str = (String) AbstractC25247g0.m73990Y(new C23465k("ENTITLEMENT_HEALTH_MONITOR", "health_monitor"), new C23465k("ENTITLEMENT_STRESS_MONITOR", "stress_monitor"), new C23465k("ENTITLEMENT_HEART_SCREENER", "heart_screener"), new C23465k("ENTITLEMENT_HEALTHSPAN", "healthspan"), new C23465k("ENTITLEMENT_BLOOD_PRESSURE", "blood_pressure_monitor")).get(c14532c.getCardName());
        if (str != null) {
            AbstractC29252b.m88870i(this.analytics, str);
        }
    }

    /* JADX INFO: renamed from: f */
    private final void m88860f(C23042n c23042n, InterfaceC4751g.l lVar) {
        Object obj = lVar.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
        if (obj instanceof C23037i) {
            EnumC23048t style = c23042n.getStyle();
            if (style != null) {
                InterfaceC14515a interfaceC14515a = this.analytics;
                String lowerCase = style.name().toLowerCase(Locale.ROOT);
                AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
                AbstractC29252b.m88862a(interfaceC14515a, lowerCase);
                return;
            }
            return;
        }
        if (obj instanceof C9598e) {
            C27256h cardButton = c23042n.getCardButton();
            AnalyticEventModel analyticEvent = cardButton != null ? cardButton.getAnalyticEvent() : null;
            if (analyticEvent != null) {
                AbstractC14516b.m41429a(this.analytics, analyticEvent);
                return;
            }
            EnumC23048t style2 = c23042n.getStyle();
            if (style2 != null) {
                InterfaceC14515a interfaceC14515a2 = this.analytics;
                String lowerCase2 = style2.name().toLowerCase(Locale.ROOT);
                AbstractC22676k.m65749i(lowerCase2, "toLowerCase(...)");
                AbstractC29252b.m88873l(interfaceC14515a2, lowerCase2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m88861a(InterfaceC4751g.a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC4751g.l) {
            m88856b((InterfaceC4751g.l) event);
            return;
        }
        if (event instanceof InterfaceC4751g.k) {
            InterfaceC4751g.k kVar = (InterfaceC4751g.k) event;
            AbstractC29252b.m88874m(this.analytics, kVar.getSource(), kVar.getValue(), kVar.getLabel());
        } else {
            if (!(event instanceof InterfaceC4751g.o)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC29252b.m88864c(this.analytics);
        }
    }
}
