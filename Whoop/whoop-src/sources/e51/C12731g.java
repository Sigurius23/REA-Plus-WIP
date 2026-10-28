package e51;

import androidx.core.app.NotificationCompat;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.item.DesignItemInteraction;
import java.util.Iterator;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: e51.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u0001*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000b\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Le51/g;", "", "<init>", "()V", "Le51/h$b;", "", "Le51/p;", "tags", "b", "(Le51/h$b;Ljava/util/List;)Ljava/lang/Object;", NotificationCompat.CATEGORY_EVENT, "a", "(Ljava/lang/Object;Ljava/util/List;)Ljava/lang/Object;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12731g {

    /* JADX INFO: renamed from: a */
    public static final C12731g f43545a = new C12731g();

    private C12731g() {
    }

    /* JADX INFO: renamed from: b */
    private final Object m35602b(AbstractC12732h.b bVar, List<C12740p> list) {
        Object next;
        AnalyticEventModel analyticEvent;
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((C12740p) next).getId(), bVar.getTagId()));
        C12740p c12740p = (C12740p) next;
        return (c12740p == null || (analyticEvent = c12740p.getAnalyticEvent()) == null) ? bVar : new DesignItemInteraction(bVar, analyticEvent);
    }

    /* JADX INFO: renamed from: a */
    public final Object m35603a(Object event, List<C12740p> tags) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(tags, "tags");
        if (event instanceof AbstractC12732h.a) {
            return ((AbstractC12732h.a) event).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
        }
        return event instanceof AbstractC12732h.b ? m35602b((AbstractC12732h.b) event, tags) : event;
    }
}
