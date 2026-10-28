package eb2;

import a81.InterfaceC0569t;
import androidx.core.app.NotificationCompat;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.navigation.AnnualUpsellSwitchModel;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.NativePlanSwitchModel;
import com.whoop.navigation.NavigationScreenModel;
import com.whoop.navigation.PairDeviceScreenModel;
import com.whoop.whoopaction.domain.models.Action;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.C25271y;
import ny0.C27256h;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import za2.AbstractC40237m;
import za2.AbstractC40239o;

/* JADX INFO: renamed from: eb2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0007H\u0002¢\u0006\u0004\b!\u0010\"J\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u001b\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020'¢\u0006\u0004\b(\u0010)J\u001b\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\r\u001a\u00020\u0001¢\u0006\u0004\b*\u0010+J\u001b\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020,¢\u0006\u0004\b-\u0010.¨\u0006/"}, m65681d2 = {"Leb2/a;", "", "<init>", "()V", "Lza2/m$b;", NotificationCompat.CATEGORY_EVENT, "", "Leb2/b;", "k", "(Lza2/m$b;)Ljava/util/List;", "Lza2/m$a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lza2/m$a;)Ljava/util/List;", "payload", "", "dismissModalFirst", "j", "(Ljava/lang/Object;Z)Ljava/util/List;", "Lny0/h;", "button", "e", "(Lny0/h;Z)Ljava/util/List;", NotificationCompat.CATEGORY_NAVIGATION, "l", "(Ljava/util/List;Z)Ljava/util/List;", "Lcom/whoop/design/models/modal/AnyModal;", "modal", "d", "(Lcom/whoop/design/models/modal/AnyModal;)Leb2/b;", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "c", "(Lcom/whoop/whoopaction/domain/models/Action;)Leb2/b;", "a", "()Leb2/b;", "Lcom/whoop/navigation/e;", "destination", "b", "(Lcom/whoop/navigation/e;)Ljava/util/List;", "Lza2/m;", "i", "(Lza2/m;)Ljava/util/List;", "f", "(Ljava/lang/Object;)Ljava/util/List;", "La81/t;", "g", "(La81/t;)Ljava/util/List;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C13006a {
    /* JADX INFO: renamed from: a */
    private final InterfaceC13007b m36525a() {
        return new InterfaceC13007b.c(AbstractC40239o.a.f173961a);
    }

    /* JADX INFO: renamed from: b */
    private final List<InterfaceC13007b> m36526b(C9598e destination) {
        return m36536i(new AbstractC40237m.a(destination));
    }

    /* JADX INFO: renamed from: c */
    private final InterfaceC13007b m36527c(Action action) {
        return new InterfaceC13007b.c(new AbstractC40239o.e(action));
    }

    /* JADX INFO: renamed from: d */
    private final InterfaceC13007b m36528d(AnyModal modal) {
        return new InterfaceC13007b.c(new AbstractC40239o.f(modal));
    }

    /* JADX INFO: renamed from: e */
    private final List<InterfaceC13007b> m36529e(C27256h button, boolean dismissModalFirst) {
        Action action = button.getAction();
        Object actionArgument = button.getActionArgument();
        AnyModal anyModal = actionArgument instanceof AnyModal ? (AnyModal) actionArgument : null;
        if (action != null) {
            return AbstractC37056f.m118958J(m36527c(action));
        }
        return anyModal != null ? AbstractC37056f.m118958J(m36528d(anyModal)) : m36533l(m36526b(button.getDestination()), dismissModalFirst);
    }

    /* JADX INFO: renamed from: h */
    private final List<InterfaceC13007b> m36530h(AbstractC40237m.a event) {
        return event.getAction().getParameters() instanceof PairDeviceScreenModel ? AbstractC37056f.m118958J(InterfaceC13007b.a.f44961a) : AbstractC37056f.m118959K(new InterfaceC13007b.c(AbstractC40239o.d.f173964a), new InterfaceC13007b.b(event));
    }

    /* JADX INFO: renamed from: j */
    private final List<InterfaceC13007b> m36531j(Object payload, boolean dismissModalFirst) {
        if (payload instanceof C27256h) {
            return m36529e((C27256h) payload, dismissModalFirst);
        }
        if (payload instanceof AnyModal) {
            return AbstractC37056f.m118958J(m36528d((AnyModal) payload));
        }
        if (payload instanceof Action) {
            return AbstractC37056f.m118958J(m36527c((Action) payload));
        }
        return payload instanceof C9598e ? m36533l(m36526b((C9598e) payload), dismissModalFirst) : C25271y.f99162w;
    }

    /* JADX INFO: renamed from: k */
    private final List<InterfaceC13007b> m36532k(AbstractC40237m.b event) {
        String subscriptionType;
        NavigationScreenModel parameters = event.getAction().getParameters();
        if (parameters instanceof NativePlanSwitchModel) {
            subscriptionType = ((NativePlanSwitchModel) parameters).getSubscriptionType();
        } else {
            subscriptionType = parameters instanceof AnnualUpsellSwitchModel ? ((AnnualUpsellSwitchModel) parameters).getSubscriptionType() : null;
        }
        return AbstractC25260n.m74077r0(new InterfaceC13007b[]{subscriptionType != null ? new InterfaceC13007b.c(new AbstractC40239o.c(subscriptionType)) : null, new InterfaceC13007b.b(event)});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    private final List<InterfaceC13007b> m36533l(List<? extends InterfaceC13007b> navigation, boolean dismissModalFirst) {
        return dismissModalFirst ? AbstractC25265s.m74129g1(AbstractC37056f.m118958J(m36525a()), navigation) : navigation;
    }

    /* JADX INFO: renamed from: f */
    public final List<InterfaceC13007b> m36534f(Object payload) {
        AbstractC22676k.m65750j(payload, "payload");
        return m36531j(payload, false);
    }

    /* JADX INFO: renamed from: g */
    public final List<InterfaceC13007b> m36535g(InterfaceC0569t event) {
        AbstractC22676k.m65750j(event, "event");
        if ((event instanceof InterfaceC0569t.a) || (event instanceof InterfaceC0569t.e)) {
            return AbstractC37056f.m118958J(m36525a());
        }
        if (event instanceof InterfaceC0569t.d) {
            return AbstractC37056f.m118958J(m36527c(((InterfaceC0569t.d) event).getAction()));
        }
        if (event instanceof InterfaceC0569t.f) {
            return AbstractC37056f.m118958J(m36528d(((InterfaceC0569t.f) event).getModal()));
        }
        if (event instanceof InterfaceC0569t.c) {
            return m36526b(((InterfaceC0569t.c) event).getDestination());
        }
        if (event instanceof InterfaceC0569t.b) {
            return m36531j(((InterfaceC0569t.b) event).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String(), true);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: i */
    public final List<InterfaceC13007b> m36536i(AbstractC40237m event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC40237m.b) {
            return m36532k((AbstractC40237m.b) event);
        }
        if (event instanceof AbstractC40237m.a) {
            return m36530h((AbstractC40237m.a) event);
        }
        throw new NoWhenBranchMatchedException();
    }
}
