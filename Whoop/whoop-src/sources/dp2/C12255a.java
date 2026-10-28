package dp2;

import ad3.AbstractC0757c;
import androidx.core.app.NotificationCompat;
import ap2.C1882a;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.models.modal.DecodedGenericInteraction;
import com.whoop.design.models.modal.GenericInteractionDecoderKt;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.models.GenericInteraction;
import ep2.InterfaceC13429a;
import io2.C20776o;
import j02.C21166s;
import java.util.List;
import ny0.C27256h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import s21.C32085h;

/* JADX INFO: renamed from: dp2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u0004\u0018\u00010\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u0004\u0018\u00010\n*\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010 \u001a\u0004\u0018\u00010\n2\u0006\u0010\u001d\u001a\u00020\n2\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010#¨\u0006$"}, m65681d2 = {"Ldp2/a;", "", "Lap2/a;", "analytics", "Lad3/c;", "json", "<init>", "(Lap2/a;Lad3/c;)V", "Lep2/a$k;", NotificationCompat.CATEGORY_EVENT, "Lep2/a;", "d", "(Lep2/a$k;)Lep2/a;", "Lny0/h;", "cardButton", "c", "(Lny0/h;)Lep2/a;", "", "Lm91/u;", "elements", "a", "(Ljava/util/List;)Lep2/a;", "Lcom/whoop/navigation/e;", "navAction", "e", "(Lcom/whoop/navigation/e;)Lep2/a;", "Lcom/whoop/navigation/models/GenericInteraction;", "b", "(Lcom/whoop/navigation/models/GenericInteraction;)Lep2/a;", "actionEvent", "", "source", "f", "(Lep2/a;Ljava/lang/String;)Lep2/a;", "Lap2/a;", "Lad3/c;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12255a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C1882a analytics;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC0757c json;

    public C12255a(C1882a analytics, AbstractC0757c json) {
        AbstractC22676k.m65750j(analytics, "analytics");
        AbstractC22676k.m65750j(json, "json");
        this.analytics = analytics;
        this.json = json;
    }

    /* JADX INFO: renamed from: a */
    private final InterfaceC13429a m34169a(List<? extends InterfaceC25312u> elements) {
        for (InterfaceC25312u interfaceC25312u : elements) {
            if (interfaceC25312u instanceof C27256h) {
                return m34172d(new InterfaceC13429a.k(interfaceC25312u, interfaceC25312u));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    private final InterfaceC13429a m34170b(GenericInteraction genericInteraction) {
        DecodedGenericInteraction decodedGenericInteraction = GenericInteractionDecoderKt.toDecodedGenericInteraction(genericInteraction, this.json);
        if (decodedGenericInteraction == null) {
            return null;
        }
        if (decodedGenericInteraction.getNavigation() != null) {
            C9598e navigation = decodedGenericInteraction.getNavigation();
            AbstractC22676k.m65747g(navigation);
            return new InterfaceC13429a.d(navigation);
        }
        if (decodedGenericInteraction.getDismissEvent() == null) {
            return null;
        }
        C21166s dismissEvent = decodedGenericInteraction.getDismissEvent();
        AbstractC22676k.m65747g(dismissEvent);
        return new InterfaceC13429a.c(dismissEvent);
    }

    /* JADX INFO: renamed from: c */
    private final InterfaceC13429a m34171c(C27256h cardButton) {
        Object actionArgument = cardButton.getActionArgument();
        C21166s dismissEvent = cardButton.getDismissEvent();
        if (actionArgument instanceof AnyModal) {
            return new InterfaceC13429a.n((AnyModal) actionArgument);
        }
        return dismissEvent != null ? new InterfaceC13429a.m(dismissEvent) : new InterfaceC13429a.b(cardButton);
    }

    /* JADX INFO: renamed from: d */
    private final InterfaceC13429a m34172d(InterfaceC13429a.k event) {
        if (event.getElement() instanceof C32085h) {
            return new InterfaceC13429a.b(event.getElement());
        }
        Object obj = event.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
        if (obj instanceof C27256h) {
            return m34171c((C27256h) obj);
        }
        if (obj instanceof InterfaceC25312u) {
            return new InterfaceC13429a.b((InterfaceC25312u) obj);
        }
        if (obj instanceof C9598e) {
            return m34173e((C9598e) obj);
        }
        if (obj instanceof C20776o) {
            return InterfaceC13429a.p.f47045a;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    private final InterfaceC13429a m34173e(C9598e navAction) {
        return new InterfaceC13429a.d(navAction);
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC13429a m34174f(InterfaceC13429a actionEvent, String source) {
        AbstractC22676k.m65750j(actionEvent, "actionEvent");
        AbstractC22676k.m65750j(source, "source");
        if (actionEvent instanceof InterfaceC13429a.a) {
            this.analytics.m5661a((InterfaceC13429a.a) actionEvent, source);
        }
        if (actionEvent instanceof InterfaceC13429a.k) {
            return m34172d((InterfaceC13429a.k) actionEvent);
        }
        if (actionEvent instanceof InterfaceC13429a.h) {
            return m34169a(((InterfaceC13429a.h) actionEvent).m38140a());
        }
        return actionEvent instanceof InterfaceC13429a.i ? m34170b(((InterfaceC13429a.i) actionEvent).getInteraction()) : actionEvent;
    }
}
