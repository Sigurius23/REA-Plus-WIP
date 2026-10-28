package by0;

import androidx.core.app.NotificationCompat;
import com.whoop.navigation.C9598e;
import cy0.InterfaceC11182a;
import im2.InterfaceC18710a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import qu1.InterfaceC30627c;
import xx0.C38689a;

/* JADX INFO: renamed from: by0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lby0/a;", "", "Lxx0/a;", "analytics", "<init>", "(Lxx0/a;)V", "Lcy0/a$f;", NotificationCompat.CATEGORY_EVENT, "Lcy0/a;", "a", "(Lcy0/a$f;)Lcy0/a;", "Lcom/whoop/navigation/e;", "navAction", "", "source", "Lm91/u;", "itemViewState", "Lcy0/a$c;", "b", "(Lcom/whoop/navigation/e;Ljava/lang/String;Lm91/u;)Lcy0/a$c;", "actionEvent", "c", "(Lcy0/a;)Lcy0/a;", "Lxx0/a;", "deep-dive_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C3691a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C38689a analytics;

    public C3691a(C38689a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    private final InterfaceC11182a m11485a(InterfaceC11182a.f event) {
        Object obj = event.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
        if (obj instanceof InterfaceC25312u) {
            return new InterfaceC11182a.b((InterfaceC25312u) obj, event.getSource());
        }
        if (obj instanceof C9598e) {
            return m11486b((C9598e) obj, event.getSource(), event.getElement());
        }
        if (obj instanceof InterfaceC18710a.b) {
            return m11486b(((InterfaceC18710a.b) obj).getNavAction(), event.getSource(), event.getElement());
        }
        if (!(obj instanceof InterfaceC30627c.d)) {
            return null;
        }
        InterfaceC30627c.d dVar = (InterfaceC30627c.d) obj;
        if (dVar instanceof InterfaceC30627c.c) {
            return new InterfaceC11182a.d(((InterfaceC30627c.c) obj).getBottomSheetState());
        }
        if (dVar instanceof InterfaceC30627c.b) {
            return m11486b(((InterfaceC30627c.b) obj).getNavAction(), event.getSource(), event.getElement());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: b */
    private final InterfaceC11182a.c m11486b(C9598e navAction, String source, InterfaceC25312u itemViewState) {
        return new InterfaceC11182a.c(navAction, source, itemViewState);
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC11182a m11487c(InterfaceC11182a actionEvent) {
        AbstractC22676k.m65750j(actionEvent, "actionEvent");
        if (actionEvent instanceof InterfaceC11182a.a) {
            this.analytics.m124088a((InterfaceC11182a.a) actionEvent);
        }
        return actionEvent instanceof InterfaceC11182a.f ? m11485a((InterfaceC11182a.f) actionEvent) : actionEvent;
    }
}
