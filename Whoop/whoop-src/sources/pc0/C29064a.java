package pc0;

import androidx.core.app.NotificationCompat;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.whoopaction.domain.models.Action;
import ny0.C27256h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import qc0.InterfaceC30214a;

/* JADX INFO: renamed from: pc0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lpc0/a;", "", "<init>", "()V", "Lqc0/a$e;", NotificationCompat.CATEGORY_EVENT, "Lqc0/a;", "a", "(Lqc0/a$e;)Lqc0/a;", "Lm91/u;", "itemViewState", "b", "(Lm91/u;)Lqc0/a;", "Lcom/whoop/navigation/e;", "navAction", "c", "(Lcom/whoop/navigation/e;)Lqc0/a;", "actionEvent", "d", "(Lqc0/a;)Lqc0/a;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29064a {
    /* JADX INFO: renamed from: a */
    private final InterfaceC30214a m88345a(InterfaceC30214a.e event) {
        Object obj = event.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
        if (obj instanceof Action) {
            return new InterfaceC30214a.g((Action) obj);
        }
        if (obj instanceof AnyModal) {
            return new InterfaceC30214a.h((AnyModal) obj);
        }
        if (obj instanceof InterfaceC25312u) {
            return m88346b((InterfaceC25312u) obj);
        }
        if (obj instanceof C9598e) {
            return m88347c((C9598e) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    private final InterfaceC30214a m88346b(InterfaceC25312u itemViewState) {
        if (!(itemViewState instanceof C27256h)) {
            return null;
        }
        C27256h c27256h = (C27256h) itemViewState;
        Action action = c27256h.getAction();
        Object actionArgument = c27256h.getActionArgument();
        AnyModal anyModal = actionArgument instanceof AnyModal ? (AnyModal) actionArgument : null;
        C9598e destination = c27256h.getDestination();
        if (action != null) {
            return new InterfaceC30214a.g(action);
        }
        return anyModal != null ? new InterfaceC30214a.h(anyModal) : m88347c(destination);
    }

    /* JADX INFO: renamed from: c */
    private final InterfaceC30214a m88347c(C9598e navAction) {
        return !AbstractC22676k.m65745e(navAction.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9318g6.f27632w) ? new InterfaceC30214a.a(navAction) : InterfaceC30214a.d.f123676a;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC30214a m88348d(InterfaceC30214a actionEvent) {
        AbstractC22676k.m65750j(actionEvent, "actionEvent");
        return actionEvent instanceof InterfaceC30214a.e ? m88345a((InterfaceC30214a.e) actionEvent) : actionEvent;
    }
}
