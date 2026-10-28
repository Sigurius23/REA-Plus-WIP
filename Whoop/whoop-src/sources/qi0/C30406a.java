package qi0;

import ad3.AbstractC0757c;
import androidx.core.app.NotificationCompat;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.analytics.ScreenAnalyticEventModel;
import com.whoop.design.item.DesignItemInteraction;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.models.modal.DecodedGenericInteraction;
import com.whoop.design.models.modal.GenericInteractionDecoderKt;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.whoopaction.domain.models.Action;
import com.whoop.whoopaction.domain.models.DismissModalAction;
import d11.C11474i;
import d11.EnumC11472g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.C21166s;
import j02.EnumC21172v;
import ny0.C27256h;
import oi0.C27948a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import ri0.InterfaceC31443b;
import s01.C32048d;

/* JADX INFO: renamed from: qi0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0015\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u0004\u0018\u00010\f2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u0004\u0018\u00010\f2\u0006\u0010!\u001a\u00020$H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u0004\u0018\u00010\f2\u0006\u0010'\u001a\u00020\f¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010,¨\u0006-"}, m65681d2 = {"Lqi0/a;", "", "Loi0/a;", "analytics", "Lcom/whoop/analytics/ScreenAnalyticEventModel;", "screenAnalytics", "Lad3/c;", "json", "<init>", "(Loi0/a;Lcom/whoop/analytics/ScreenAnalyticEventModel;Lad3/c;)V", "Lri0/b$h;", NotificationCompat.CATEGORY_EVENT, "Lri0/b;", "f", "(Lri0/b$h;)Lri0/b;", "Lj02/s;", "a", "(Lj02/s;)Lri0/b;", "Lri0/b$j;", "g", "(Lri0/b$j;)Lri0/b;", "any", "c", "(Ljava/lang/Object;)Lri0/b;", "Lcom/whoop/navigation/e;", "navAction", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/navigation/e;)Lri0/b;", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "b", "(Lcom/whoop/whoopaction/domain/models/Action;)Lri0/b;", "Lcom/whoop/navigation/models/GenericInteraction;", "interaction", "e", "(Lcom/whoop/navigation/models/GenericInteraction;)Lri0/b;", "Lcom/whoop/design/item/DesignItemInteraction;", "d", "(Lcom/whoop/design/item/DesignItemInteraction;)Lri0/b;", "actionEvent", "i", "(Lri0/b;)Lri0/b;", "Loi0/a;", "Lcom/whoop/analytics/ScreenAnalyticEventModel;", "Lad3/c;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30406a {

    /* JADX INFO: renamed from: d */
    public static final int f124781d = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C27948a analytics;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ScreenAnalyticEventModel screenAnalytics;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC0757c json;

    /* JADX INFO: renamed from: qi0.a$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f124785a;

        static {
            int[] iArr = new int[EnumC21172v.values().length];
            try {
                iArr[EnumC21172v.DISMISS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC21172v.POP_CURRENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC21172v.POP_TO_ROOT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC21172v.DISMISS_WITHOUT_ANIMATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC21172v.AUTO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f124785a = iArr;
        }
    }

    public C30406a(C27948a analytics, ScreenAnalyticEventModel screenAnalytics, AbstractC0757c json) {
        AbstractC22676k.m65750j(analytics, "analytics");
        AbstractC22676k.m65750j(screenAnalytics, "screenAnalytics");
        AbstractC22676k.m65750j(json, "json");
        this.analytics = analytics;
        this.screenAnalytics = screenAnalytics;
        this.json = json;
    }

    /* JADX INFO: renamed from: a */
    private final InterfaceC31443b m92904a(C21166s event) {
        int i13 = a.f124785a[event.getType().ordinal()];
        if (i13 != 1 && i13 != 2 && i13 != 3 && i13 != 4 && i13 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        AnalyticEventModel screenDismissed = this.screenAnalytics.getScreenDismissed();
        if (screenDismissed != null) {
            this.analytics.m84382a(new InterfaceC31443b.g(screenDismissed));
        }
        return new InterfaceC31443b.q(event);
    }

    /* JADX INFO: renamed from: b */
    private final InterfaceC31443b m92905b(Action action) {
        return action instanceof DismissModalAction ? InterfaceC31443b.f.f129347a : new InterfaceC31443b.p(action);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    private final InterfaceC31443b m92906c(Object any) {
        if (any instanceof DesignItemInteraction) {
            return m92907d((DesignItemInteraction) any);
        }
        if (any instanceof GenericInteraction) {
            return m92908e((GenericInteraction) any);
        }
        C21166s c21166s = null;
        Object[] objArr = 0;
        if (any instanceof C27256h) {
            C27256h c27256h = (C27256h) any;
            Action action = c27256h.getAction();
            C9598e destination = c27256h.getDestination();
            Object actionArgument = c27256h.getActionArgument();
            C21166s dismissEvent = c27256h.getDismissEvent();
            if (actionArgument instanceof AnyModal) {
                return new InterfaceC31443b.s((AnyModal) actionArgument);
            }
            if (dismissEvent != null) {
                return m92904a(dismissEvent);
            }
            if (action != null) {
                return m92905b(action);
            }
            return !AbstractC22676k.m65745e(destination.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9318g6.f27632w) ? m92911h(destination) : new InterfaceC31443b.h(c21166s, 1, objArr == true ? 1 : 0);
        }
        if (any instanceof C32048d) {
            C9598e destination2 = ((C32048d) any).getDestination();
            if (destination2 != null) {
                return m92911h(destination2);
            }
        } else {
            if (any instanceof AnyModal) {
                return new InterfaceC31443b.s((AnyModal) any);
            }
            if (any instanceof InterfaceC25312u) {
                return new InterfaceC31443b.b((InterfaceC25312u) any);
            }
            if (any instanceof C9598e) {
                return m92911h((C9598e) any);
            }
            if (any instanceof Action) {
                return m92905b((Action) any);
            }
            if (any instanceof C21166s) {
                return m92904a((C21166s) any);
            }
            if (any instanceof InterfaceC31443b) {
                return (InterfaceC31443b) any;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    private final InterfaceC31443b m92907d(DesignItemInteraction interaction) {
        AnalyticEventModel analyticEvent = interaction.getAnalyticEvent();
        if (analyticEvent != null) {
            this.analytics.m84382a(new InterfaceC31443b.g(analyticEvent));
        }
        Object actionArgument = interaction.getActionArgument();
        if (actionArgument != null) {
            return m92906c(actionArgument);
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    private final InterfaceC31443b m92908e(GenericInteraction interaction) {
        DecodedGenericInteraction decodedGenericInteraction = GenericInteractionDecoderKt.toDecodedGenericInteraction(interaction, this.json);
        if (decodedGenericInteraction == null) {
            return null;
        }
        AnalyticEventModel analyticEvent = decodedGenericInteraction.getAnalyticEvent();
        if (analyticEvent != null) {
            this.analytics.m84382a(new InterfaceC31443b.g(analyticEvent));
        }
        if (decodedGenericInteraction.getModal() != null) {
            AnyModal modal = decodedGenericInteraction.getModal();
            AbstractC22676k.m65747g(modal);
            return new InterfaceC31443b.s(modal);
        }
        if (decodedGenericInteraction.getAction() != null) {
            Action action = decodedGenericInteraction.getAction();
            AbstractC22676k.m65747g(action);
            return m92905b(action);
        }
        if (decodedGenericInteraction.getNavigation() != null) {
            C9598e navigation = decodedGenericInteraction.getNavigation();
            AbstractC22676k.m65747g(navigation);
            return m92911h(navigation);
        }
        if (decodedGenericInteraction.getDismissEvent() == null) {
            return null;
        }
        C21166s dismissEvent = decodedGenericInteraction.getDismissEvent();
        AbstractC22676k.m65747g(dismissEvent);
        return m92904a(dismissEvent);
    }

    /* JADX INFO: renamed from: f */
    private final InterfaceC31443b m92909f(InterfaceC31443b.h event) {
        AnalyticEventModel screenDismissed = this.screenAnalytics.getScreenDismissed();
        if (screenDismissed != null) {
            this.analytics.m84382a(new InterfaceC31443b.g(screenDismissed));
        }
        return event;
    }

    /* JADX INFO: renamed from: g */
    private final InterfaceC31443b m92910g(InterfaceC31443b.j event) {
        C9598e navigationAction;
        Object event2 = event.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
        if (!(event2 instanceof EnumC11472g)) {
            return m92906c(event2);
        }
        if (event2 == EnumC11472g.TILE_CLICKED && (event.getElement() instanceof C11474i) && (navigationAction = ((C11474i) event.getElement()).getNavigationAction()) != null) {
            return m92911h(navigationAction);
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    private final InterfaceC31443b m92911h(C9598e navAction) {
        return new InterfaceC31443b.c(navAction, false, 2, null);
    }

    /* JADX INFO: renamed from: i */
    public final InterfaceC31443b m92912i(InterfaceC31443b actionEvent) {
        AbstractC22676k.m65750j(actionEvent, "actionEvent");
        boolean z4 = actionEvent instanceof InterfaceC31443b.a;
        if (z4) {
            this.analytics.m84382a((InterfaceC31443b.a) actionEvent);
        }
        if (actionEvent instanceof InterfaceC31443b.j) {
            return m92910g((InterfaceC31443b.j) actionEvent);
        }
        if (actionEvent instanceof InterfaceC31443b.h) {
            return m92909f((InterfaceC31443b.h) actionEvent);
        }
        if (actionEvent instanceof InterfaceC31443b.q) {
            return m92904a(((InterfaceC31443b.q) actionEvent).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String());
        }
        if (z4) {
            return null;
        }
        return actionEvent;
    }
}
