package ko0;

import androidx.core.app.NotificationCompat;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import lo0.InterfaceC24615z;
import m83.AbstractC25265s;
import n01.C26089f;
import ny0.C27256h;
import o71.C27634d;
import o71.C27635e;
import o71.C27636f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: ko0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lko0/d;", "", "<init>", "()V", "Llo0/z$c;", "actionEvent", "Llo0/z;", "a", "(Llo0/z$c;)Llo0/z;", "Llo0/z$e;", NotificationCompat.CATEGORY_EVENT, "b", "(Llo0/z$e;)Llo0/z;", "Lm91/u;", "itemViewState", "c", "(Lm91/u;)Llo0/z;", "Lcom/whoop/navigation/e;", "navAction", "d", "(Lcom/whoop/navigation/e;)Llo0/z;", "e", "(Llo0/z;)Llo0/z;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22646d {
    /* JADX INFO: renamed from: a */
    private final InterfaceC24615z m65597a(InterfaceC24615z.c actionEvent) {
        Object obj = actionEvent.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
        if (obj instanceof C27636f) {
            C27636f c27636f = (C27636f) obj;
            return new InterfaceC24615z.q(null, Integer.valueOf(c27636f.getWeightInSelectedUnit()), c27636f.getUnit(), 1, null);
        }
        if (obj instanceof C27634d) {
            C27634d c27634d = (C27634d) obj;
            return new InterfaceC24615z.q(Integer.valueOf(c27634d.getHeightInSelectedUnit()), null, c27634d.getUnit(), 2, null);
        }
        if (!(obj instanceof C27635e)) {
            return null;
        }
        C27635e c27635e = (C27635e) obj;
        return new InterfaceC24615z.q(Integer.valueOf(c27635e.getHeightInSelectedUnit()), Integer.valueOf(c27635e.getWeightInSelectedUnit()), c27635e.getUnit());
    }

    /* JADX INFO: renamed from: b */
    private final InterfaceC24615z m65598b(InterfaceC24615z.e event) {
        Object obj = event.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
        if (obj instanceof C26089f) {
            return new InterfaceC24615z.k((String) AbstractC25265s.m74100H0(((C26089f) obj).m77610b()));
        }
        if (obj instanceof InterfaceC25312u) {
            return m65599c((InterfaceC25312u) obj);
        }
        if (obj instanceof C9598e) {
            return m65600d((C9598e) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    private final InterfaceC24615z m65599c(InterfaceC25312u itemViewState) {
        if (itemViewState instanceof C27256h) {
            return m65600d(((C27256h) itemViewState).getDestination());
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    private final InterfaceC24615z m65600d(C9598e navAction) {
        return !AbstractC22676k.m65745e(navAction.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9318g6.f27632w) ? new InterfaceC24615z.a(navAction) : InterfaceC24615z.b.f96222a;
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC24615z m65601e(InterfaceC24615z actionEvent) {
        AbstractC22676k.m65750j(actionEvent, "actionEvent");
        if (actionEvent instanceof InterfaceC24615z.e) {
            return m65598b((InterfaceC24615z.e) actionEvent);
        }
        return actionEvent instanceof InterfaceC24615z.c ? m65597a((InterfaceC24615z.c) actionEvent) : actionEvent;
    }
}
