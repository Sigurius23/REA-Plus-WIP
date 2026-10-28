package x70;

import androidx.core.app.NotificationCompat;
import com.whoop.design.models.items.ArticleTileCarouselModelKt;
import com.whoop.design.models.items.ArticleTileModelEvent;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import j02.AbstractC21155m0;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import ny0.C27256h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import t70.C33563a;
import u70.C34566f;
import y70.InterfaceC39265a;
import y71.C39282o;

/* JADX INFO: renamed from: x70.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lx70/a;", "", "Lt70/a;", "analytics", "<init>", "(Lt70/a;)V", "Ly70/a$i;", NotificationCompat.CATEGORY_EVENT, "Ly70/a;", "a", "(Ly70/a$i;)Ly70/a;", "Lcom/whoop/navigation/e;", "navAction", "b", "(Lcom/whoop/navigation/e;)Ly70/a;", "actionEvent", "c", "(Ly70/a;)Ly70/a;", "Lt70/a;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38036a {

    /* JADX INFO: renamed from: c */
    public static final int f162943c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C33563a analytics;

    public C38036a(C33563a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    private final InterfaceC39265a m121772a(InterfaceC39265a.i event) throws UnsupportedEncodingException {
        InterfaceC39265a interfaceC39265aM121773b;
        Object obj = event.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
        if (obj instanceof C34566f) {
            InterfaceC25312u element = event.getElement();
            if (!(element instanceof C39282o)) {
                return new InterfaceC39265a.b((InterfaceC25312u) obj);
            }
            C9598e destination = ((C39282o) element).getDestination();
            return (destination == null || (interfaceC39265aM121773b = m121773b(destination)) == null) ? new InterfaceC39265a.b((InterfaceC25312u) obj) : interfaceC39265aM121773b;
        }
        if (obj instanceof C27256h) {
            return m121773b(((C27256h) obj).getDestination());
        }
        if (obj instanceof InterfaceC25312u) {
            return new InterfaceC39265a.b((InterfaceC25312u) obj);
        }
        if (obj instanceof C9598e) {
            return m121773b((C9598e) obj);
        }
        if (!(obj instanceof ArticleTileModelEvent.Url)) {
            return null;
        }
        ArticleTileModelEvent.Url url = (ArticleTileModelEvent.Url) obj;
        if (ArticleTileCarouselModelKt.isVideo(url.getType())) {
            return new InterfaceC39265a.d(new AbstractC21155m0.g3(url.getUrl()));
        }
        String strEncode = URLEncoder.encode(url.getId(), "UTF-8");
        AbstractC22676k.m65747g(strEncode);
        String tag = url.getTag();
        if (tag == null) {
            tag = "";
        }
        return new InterfaceC39265a.d(new AbstractC21155m0.f3(strEncode, tag, "Order Confirmation", null, null, 24, null));
    }

    /* JADX INFO: renamed from: b */
    private final InterfaceC39265a m121773b(C9598e navAction) {
        return AbstractC22676k.m65745e(navAction.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9318g6.f27632w) ? new InterfaceC39265a.e(navAction) : new InterfaceC39265a.c(navAction);
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC39265a m121774c(InterfaceC39265a actionEvent) {
        AbstractC22676k.m65750j(actionEvent, "actionEvent");
        if (actionEvent instanceof InterfaceC39265a.a) {
            this.analytics.m105981b((InterfaceC39265a.a) actionEvent);
        }
        return actionEvent instanceof InterfaceC39265a.i ? m121772a((InterfaceC39265a.i) actionEvent) : actionEvent;
    }
}
