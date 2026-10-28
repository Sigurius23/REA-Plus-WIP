package bk2;

import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import wj2.AbstractC37320a;
import xj2.AbstractC38408d;

/* JADX INFO: renamed from: bk2.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lbk2/d;", "Lwj2/a$a;", "d", "(Lbk2/d;)Lwj2/a$a;", "Lbk2/a;", "Lxj2/d;", "c", "(Lbk2/a;)Lxj2/d;", "tilt-graph_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3359f {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final AbstractC38408d m9704c(AbstractC3354a abstractC3354a) {
        if (abstractC3354a instanceof AbstractC3354a.a) {
            return new AbstractC38408d.a(((AbstractC3354a.a) abstractC3354a).getCom.mapbox.maps.MapboxMap.QFE_OFFSET java.lang.String());
        }
        if (abstractC3354a instanceof AbstractC3354a.b) {
            return new AbstractC38408d.c(((AbstractC3354a.b) abstractC3354a).getCom.mapbox.common.HttpHeaders.DATE java.lang.String());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final AbstractC37320a.a m9705d(AbstractC3357d abstractC3357d) {
        if (!(abstractC3357d instanceof AbstractC3357d.a)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC3357d.a aVar = (AbstractC3357d.a) abstractC3357d;
        return new AbstractC37320a.a(aVar.getCom.mapbox.common.HttpHeaders.DATE java.lang.String(), aVar.getSource(), aVar.getShouldLogAnalytics());
    }
}
