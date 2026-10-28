package tw1;

import androidx.core.app.NotificationCompat;
import com.whoop.navigation.C9598e;
import nw1.C27209a;
import ny0.C27256h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import uw1.C35310c;
import ww1.AbstractC37659e;
import ww1.C37662h;
import ww1.InterfaceC37655a;
import ww1.InterfaceC37657c;
import ww1.InterfaceC37661g;
import xw1.AbstractC38681e;

/* JADX INFO: renamed from: tw1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Ltw1/a;", "", "Lnw1/a;", "analyticsHelper", "<init>", "(Lnw1/a;)V", "Lww1/h;", NotificationCompat.CATEGORY_EVENT, "Lww1/c;", "a", "(Lww1/h;)Lww1/c;", "Lcom/whoop/navigation/e;", "navAction", "Luw1/c$c;", "hubScreenContent", "b", "(Lcom/whoop/navigation/e;Luw1/c$c;)Lww1/c;", "actionEvent", "c", "(Lww1/c;)Lww1/c;", "Lnw1/a;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34220a {

    /* JADX INFO: renamed from: c */
    public static final int f143569c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C27209a analyticsHelper;

    public C34220a(C27209a analyticsHelper) {
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        this.analyticsHelper = analyticsHelper;
    }

    /* JADX INFO: renamed from: a */
    private final InterfaceC37657c m108168a(C37662h event) {
        Object obj = event.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
        if (obj instanceof AbstractC38681e.b) {
            return new InterfaceC37661g.b(((AbstractC38681e.b) obj).getEmailText());
        }
        if (obj instanceof AbstractC38681e.a) {
            return new InterfaceC37661g.d(((AbstractC38681e.a) obj).getEmailText());
        }
        if (!(obj instanceof InterfaceC25312u)) {
            if (obj instanceof C9598e) {
                return m108169b((C9598e) obj, event.getHubScreenContent());
            }
            return null;
        }
        if (!(event.getElement() instanceof C27256h)) {
            return new AbstractC37659e.a((InterfaceC25312u) obj);
        }
        String id4 = ((C27256h) event.getElement()).getId();
        if (AbstractC22676k.m65745e(id4, "AddNewMemberButton")) {
            return new AbstractC37659e.e(true);
        }
        return AbstractC22676k.m65745e(id4, "AddExistingMemberButton") ? new AbstractC37659e.e(false) : new AbstractC37659e.a((InterfaceC25312u) obj);
    }

    /* JADX INFO: renamed from: b */
    private final InterfaceC37657c m108169b(C9598e navAction, C35310c.c hubScreenContent) {
        return new AbstractC37659e.b(navAction, hubScreenContent);
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC37657c m108170c(InterfaceC37657c actionEvent) {
        AbstractC22676k.m65750j(actionEvent, "actionEvent");
        if (actionEvent instanceof InterfaceC37655a) {
            this.analyticsHelper.m81939a((InterfaceC37655a) actionEvent);
        }
        return actionEvent instanceof C37662h ? m108168a((C37662h) actionEvent) : actionEvent;
    }
}
