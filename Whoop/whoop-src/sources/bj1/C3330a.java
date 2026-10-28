package bj1;

import a11.C0140r;
import a11.EnumC0123a;
import a11.EnumC0124b;
import androidx.core.app.NotificationCompat;
import c41.C4091p1;
import cj1.InterfaceC4751g;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.HeartScreenerModel;
import com.whoop.navigation.IntegrationsScreenModel;
import com.whoop.navigation.NavigationScreenModel;
import gt0.InterfaceC16183e;
import ih0.AbstractC18489d0;
import l01.C23037i;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import pi1.C29251a;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: bj1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0015\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lbj1/a;", "", "Lgt0/e;", "firmwareUpdateApi", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lpi1/a;", "analytics", "Ltr2/n;", "logger", "<init>", "(Lgt0/e;Lcom/whoop/data/repositories/FeatureFlagChecker;Lpi1/a;Ltr2/n;)V", "Lcj1/g$l;", NotificationCompat.CATEGORY_EVENT, "Lcj1/g;", "a", "(Lcj1/g$l;)Lcj1/g;", "Lcom/whoop/navigation/e;", "navAction", "b", "(Lcom/whoop/navigation/e;)Lcj1/g;", "actionEvent", "c", "(Lcj1/g;)Lcj1/g;", "Lgt0/e;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Lpi1/a;", "d", "Ltr2/n;", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C3330a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC16183e firmwareUpdateApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C29251a analytics;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: bj1.a$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f12925a;

        static {
            int[] iArr = new int[EnumC0123a.values().length];
            try {
                iArr[EnumC0123a.PROCESS_FW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0123a.RETRY_FW_UPDATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC0123a.RESET_FW_STATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC0123a.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f12925a = iArr;
        }
    }

    public C3330a(InterfaceC16183e firmwareUpdateApi, FeatureFlagChecker featureFlagChecker, C29251a analytics, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(firmwareUpdateApi, "firmwareUpdateApi");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(analytics, "analytics");
        AbstractC22676k.m65750j(logger, "logger");
        this.firmwareUpdateApi = firmwareUpdateApi;
        this.featureFlagChecker = featureFlagChecker;
        this.analytics = analytics;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: a */
    private final InterfaceC4751g m9635a(InterfaceC4751g.l event) {
        Object obj = event.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
        if (obj instanceof InterfaceC25312u) {
            return new InterfaceC4751g.b((InterfaceC25312u) obj);
        }
        if (obj instanceof C9598e) {
            return m9636b((C9598e) obj);
        }
        if (obj instanceof EnumC0124b) {
            return new InterfaceC4751g.b(event.getElement());
        }
        if (!(obj instanceof EnumC0123a)) {
            if (obj instanceof C23037i) {
                return new InterfaceC4751g.f(((C23037i) obj).getId());
            }
            if (obj instanceof C4091p1) {
                return new InterfaceC4751g.f(((C4091p1) obj).getId());
            }
            return null;
        }
        int i13 = a.f12925a[((EnumC0123a) obj).ordinal()];
        if (i13 == 1) {
            return InterfaceC4751g.h.a.f19489a;
        }
        if (i13 == 2) {
            return InterfaceC4751g.h.c.f19491a;
        }
        if (i13 == 3) {
            return InterfaceC4751g.h.b.f19490a;
        }
        if (i13 != 4) {
            this.logger.mo85228t(AbstractC18489d0.m53369j(obj, "ConnectivityEventType ", " not handled"), new AbstractC30556a.a[0]);
            return null;
        }
        InterfaceC25312u element = event.getElement();
        C0140r c0140r = element instanceof C0140r ? (C0140r) element : null;
        if (c0140r != null && c0140r.getConnectivityNavType() != EnumC0124b.DEFAULT) {
            return new InterfaceC4751g.b(c0140r);
        }
        this.logger.mo85228t(AbstractC18489d0.m53369j(obj, "ConnectivityEventType ", " not handled"), new AbstractC30556a.a[0]);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0085  */
    /* JADX INFO: renamed from: b */
    private final InterfaceC4751g m9636b(C9598e navAction) {
        C9598e c9598eM23127b;
        NavigationScreenModel parameters;
        if ((navAction.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String() instanceof AppScreen.C9410s2) && this.firmwareUpdateApi.mo45720a()) {
            return InterfaceC4751g.j.f19492a;
        }
        if ((navAction.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String() instanceof AppScreen.C9410s2) && (navAction.getParameters() instanceof HeartScreenerModel)) {
            NavigationScreenModel parameters2 = navAction.getParameters();
            HeartScreenerModel heartScreenerModel = parameters2 instanceof HeartScreenerModel ? (HeartScreenerModel) parameters2 : null;
            if (heartScreenerModel == null || (parameters = heartScreenerModel.copy("health_tab")) == null) {
                parameters = navAction.getParameters();
            }
            c9598eM23127b = C9598e.m23127b(navAction, null, parameters, null, 5, null);
        } else if (navAction.getParameters() instanceof IntegrationsScreenModel) {
            NavigationScreenModel parameters3 = navAction.getParameters();
            AbstractC22676k.m65748h(parameters3, "null cannot be cast to non-null type com.whoop.navigation.IntegrationsScreenModel");
            String source = ((IntegrationsScreenModel) parameters3).getSource();
            if (source == null || source.length() == 0) {
                NavigationScreenModel parameters4 = navAction.getParameters();
                AbstractC22676k.m65748h(parameters4, "null cannot be cast to non-null type com.whoop.navigation.IntegrationsScreenModel");
                c9598eM23127b = C9598e.m23127b(navAction, null, IntegrationsScreenModel.copy$default((IntegrationsScreenModel) parameters4, null, "health_tab", null, 5, null), null, 5, null);
            } else {
                c9598eM23127b = navAction;
            }
        } else {
            c9598eM23127b = navAction;
        }
        return new InterfaceC4751g.c(c9598eM23127b);
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC4751g m9637c(InterfaceC4751g actionEvent) {
        AbstractC22676k.m65750j(actionEvent, "actionEvent");
        if (actionEvent instanceof InterfaceC4751g.a) {
            this.analytics.m88861a((InterfaceC4751g.a) actionEvent);
        }
        return actionEvent instanceof InterfaceC4751g.l ? m9635a((InterfaceC4751g.l) actionEvent) : actionEvent;
    }
}
