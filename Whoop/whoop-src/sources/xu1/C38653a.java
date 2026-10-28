package xu1;

import androidx.core.app.NotificationCompat;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import cv1.InterfaceC11144a;
import fi0.InterfaceC14515a;
import java.util.concurrent.atomic.AtomicReference;
import ny0.C27256h;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: xu1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001aR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001d¨\u0006\u001f"}, m65681d2 = {"Lxu1/a;", "", "Lfi0/a;", "analytics", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lfi0/a;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Lcv1/a$f;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "c", "(Lcv1/a$f;)V", "Lcom/whoop/navigation/e;", "navAction", "", "a", "(Lcom/whoop/navigation/e;)Ljava/lang/String;", "source", "offerId", "d", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcv1/a$a;", "b", "(Lcv1/a$a;)V", "Lfi0/a;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Ljava/util/concurrent/atomic/AtomicReference;", "Lxu1/a$a;", "Ljava/util/concurrent/atomic/AtomicReference;", "screenContext", "limited-time-offer_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38653a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AtomicReference<a> screenContext;

    /* JADX INFO: renamed from: xu1.a$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\b¨\u0006\u0013"}, m65681d2 = {"Lxu1/a$a;", "", "", "source", "offerId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "limited-time-offer_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String offerId;

        public a(String source, String offerId) {
            AbstractC22676k.m65750j(source, "source");
            AbstractC22676k.m65750j(offerId, "offerId");
            this.source = source;
            this.offerId = offerId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getOfferId() {
            return this.offerId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.source, aVar.source) && AbstractC22676k.m65745e(this.offerId, aVar.offerId);
        }

        public int hashCode() {
            return this.offerId.hashCode() + (this.source.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("ScreenContext(source=", this.source, ", offerId=", this.offerId, ")");
        }
    }

    public C38653a(InterfaceC14515a analytics, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(analytics, "analytics");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.analytics = analytics;
        this.featureFlagChecker = featureFlagChecker;
        this.screenContext = new AtomicReference<>(null);
    }

    /* JADX INFO: renamed from: a */
    private final String m123905a(C9598e navAction) {
        AppScreen appScreen = navAction.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String();
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9313g1.f27616w) || AbstractC22676k.m65745e(appScreen, AppScreen.C9294d6.f27557w)) {
            return "pay_today";
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9298e2.f27571w)) {
            return "pay_later";
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    private final void m123906c(InterfaceC11144a.f event) {
        a aVar;
        if (!this.featureFlagChecker.isFeatureEnabled("lto-plan-picker-ui-and-analytics-android") || (aVar = this.screenContext.get()) == null || (event.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String() instanceof C27256h)) {
            return;
        }
        Object obj = event.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
        String strM123905a = obj instanceof C9598e ? m123905a((C9598e) obj) : null;
        if (strM123905a != null) {
            AbstractC38654b.m123911a(this.analytics, aVar.getSource(), aVar.getOfferId(), strM123905a);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m123907b(InterfaceC11144a.a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC11144a.h) {
            InterfaceC11144a.h hVar = (InterfaceC11144a.h) event;
            AbstractC38654b.m123913c(this.analytics, hVar.getSource(), hVar.getOfferId(), hVar.getTimeLeft());
        } else if (!(event instanceof InterfaceC11144a.g)) {
            if (!(event instanceof InterfaceC11144a.f)) {
                throw new NoWhenBranchMatchedException();
            }
            m123906c((InterfaceC11144a.f) event);
        } else if (this.featureFlagChecker.isFeatureEnabled("lto-plan-picker-ui-and-analytics-android")) {
            InterfaceC11144a.g gVar = (InterfaceC11144a.g) event;
            AbstractC38654b.m123911a(this.analytics, gVar.getSource(), gVar.getOfferId(), gVar.getCloseAction());
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m123908d(String source, String offerId) {
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(offerId, "offerId");
        this.screenContext.set(new a(source, offerId));
    }
}
