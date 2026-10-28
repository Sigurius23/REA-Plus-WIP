package of0;

import androidx.core.app.NotificationCompat;
import c41.C4092p2;
import fi0.InterfaceC14515a;
import i01.C17839b;
import i01.C17845h;
import java.util.Map;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p736sz0.C33184h0;
import q11.AbstractC29791a;
import q11.C29795e;
import q31.C29944b;
import q31.C29948f;
import sf0.InterfaceC32443a;

/* JADX INFO: renamed from: of0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lof0/a;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "Lsf0/a$f;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "b", "(Lsf0/a$f;)V", "Lsf0/a$b;", "a", "(Lsf0/a$b;)V", "Lfi0/a;", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27893a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    public C27893a(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: b */
    private final void m84164b(InterfaceC32443a.f event) {
        String str;
        InterfaceC25312u element = event.getElement();
        if (element instanceof C17845h) {
            if (event.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String() instanceof C17839b) {
                AbstractC27894b.m84169d(this.analytics, ((C17839b) event.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String()).getId());
                return;
            }
            return;
        }
        if (element instanceof C29948f) {
            Object obj = event.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
            if (obj instanceof C29944b) {
                AbstractC27894b.m84169d(this.analytics, ((C29944b) obj).getSegmentId());
                return;
            } else {
                if (obj instanceof C17839b) {
                    AbstractC27894b.m84169d(this.analytics, ((C17839b) obj).getId());
                    return;
                }
                return;
            }
        }
        if (element instanceof C33184h0) {
            AbstractC27894b.m84173h(this.analytics);
            return;
        }
        if (element instanceof C29795e) {
            Object obj2 = event.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
            if (obj2 instanceof AbstractC29791a.b) {
                AbstractC29791a.b bVar = (AbstractC29791a.b) obj2;
                if (bVar.getIsExpanded()) {
                    AbstractC27894b.m84172g(this.analytics, bVar.getId());
                    return;
                }
                return;
            }
            return;
        }
        if (element instanceof C4092p2) {
            Map<String, String> mapM12554c = ((C4092p2) event.getElement()).m12554c();
            if (mapM12554c == null || (str = mapM12554c.get("region")) == null) {
                str = "unknown";
            }
            AbstractC27894b.m84167b(this.analytics, str);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m84165a(InterfaceC32443a.b event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC32443a.a) {
            InterfaceC32443a.a aVar = (InterfaceC32443a.a) event;
            AbstractC27894b.m84171f(this.analytics, aVar.getSource(), aVar.getSelectedSegmentId());
        } else {
            if (event instanceof InterfaceC32443a.f) {
                m84164b((InterfaceC32443a.f) event);
                return;
            }
            if (event instanceof InterfaceC32443a.j) {
                AbstractC27894b.m84166a(this.analytics, ((InterfaceC32443a.j) event).getSelectedSegmentId());
            } else {
                if (!(event instanceof InterfaceC32443a.k)) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC32443a.k kVar = (InterfaceC32443a.k) event;
                AbstractC27894b.m84170e(this.analytics, kVar.getTestimonialId(), kVar.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String());
            }
        }
    }
}
