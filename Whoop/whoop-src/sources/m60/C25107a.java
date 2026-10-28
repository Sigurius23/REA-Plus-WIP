package m60;

import androidx.core.app.NotificationCompat;
import com.whoop.achievements.celebration.InterfaceC5737b;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.item.DesignItemInteraction;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import fi0.InterfaceC14515a;
import i51.C18118o;
import ny0.C27256h;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m60.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lm60/a;", "", "Lfi0/a;", "baseAnalytics", "<init>", "(Lfi0/a;)V", "Li51/o;", "celebrationOverlayData", "Ll83/a0;", "a", "(Li51/o;)V", "Lcom/whoop/achievements/celebration/b$b;", NotificationCompat.CATEGORY_EVENT, "d", "(Lcom/whoop/achievements/celebration/b$b;)V", "clickedItem", "", "primaryButtonAction", "b", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;", "Lcom/whoop/achievements/celebration/b$a;", "c", "(Lcom/whoop/achievements/celebration/b$a;)V", "Lfi0/a;", "achievements_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25107a {

    /* JADX INFO: renamed from: c */
    public static final int f98397c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a baseAnalytics;

    public C25107a(InterfaceC14515a baseAnalytics) {
        AbstractC22676k.m65750j(baseAnalytics, "baseAnalytics");
        this.baseAnalytics = baseAnalytics;
    }

    /* JADX INFO: renamed from: a */
    private final void m73610a(C18118o celebrationOverlayData) {
        InterfaceC14515a.m41418i(this.baseAnalytics, null, "View", null, "Gamification Pop", null, celebrationOverlayData.m52013b(), 21, null);
    }

    /* JADX INFO: renamed from: b */
    private final String m73611b(Object clickedItem, String primaryButtonAction) {
        String label;
        if (clickedItem instanceof DesignItemInteraction) {
            return m73611b(((DesignItemInteraction) clickedItem).getActionArgument(), primaryButtonAction);
        }
        if (clickedItem instanceof C27256h) {
            C27256h c27256h = (C27256h) clickedItem;
            if (AbstractC22676k.m65745e(c27256h.getDestination().getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9318g6.f27632w)) {
                return "close";
            }
            AnalyticEventModel analyticEvent = c27256h.getAnalyticEvent();
            if (analyticEvent != null && (label = analyticEvent.getLabel()) != null) {
                return label;
            }
        } else if (!(clickedItem instanceof C9598e) || AbstractC22676k.m65745e(((C9598e) clickedItem).getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9318g6.f27632w)) {
            return "close";
        }
        return primaryButtonAction;
    }

    /* JADX INFO: renamed from: d */
    private final void m73612d(InterfaceC5737b.b event) {
        String str = event.getElement().m52013b().get("button_action");
        if (str == null) {
            str = ProfileAnalyticsKt.VIEW;
        }
        this.baseAnalytics.mo41424f(event.getElement().m52013b().get("category"), "Click", m73611b(event.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String(), str), "Gamification Pop");
    }

    /* JADX INFO: renamed from: c */
    public final void m73613c(InterfaceC5737b.a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC5737b.a.C41365a) {
            m73610a(((InterfaceC5737b.a.C41365a) event).getCelebrationOverlay());
        } else {
            if (!(event instanceof InterfaceC5737b.b)) {
                throw new NoWhenBranchMatchedException();
            }
            m73612d((InterfaceC5737b.b) event);
        }
    }
}
