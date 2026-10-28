package ck2;

import bk2.AbstractC3360g;
import bk2.C3356c;
import cj2.C4769a;
import com.whoop.design.models.calendar.CalendarDateModel;
import com.whoop.design.models.items.graph.ZoomableGraphModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.tiltgraph.domain.models.TiltGraphDatePickerModel;
import h71.C16994k;
import h91.C17027b;
import i11.C17863f;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j71.AbstractC21394b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import l83.C23454a0;
import m83.AbstractC25267u;
import no.nordicsemi.android.dfu.DfuBaseService;
import p181h2.C16618c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import t81.C33612r;
import wj2.AbstractC37321b;
import x81.C38072d;
import y61.C39260a;
import yj2.C39593a;

/* JADX INFO: renamed from: ck2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\u0004\u0018\u0001`\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012*\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, m65681d2 = {"Lck2/a;", "", "<init>", "()V", "Lwj2/b$c;", "domainResult", "Lh91/b;", "Lcom/whoop/design/models/calendar/CalendarDateModel;", "Lcom/whoop/design/domain/calendar/CalendarDomainState;", "calendarState", "Lbk2/g;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lwj2/b$c;Lh91/b;)Lbk2/g;", "Lcom/whoop/design/models/items/graph/ZoomableGraphModel;", "graphModel", "Lt81/r;", "e", "(Lcom/whoop/design/models/items/graph/ZoomableGraphModel;)Lt81/r;", "", "Lj71/b;", "c", "(Ljava/util/List;)Ljava/util/List;", "Lh71/k;", "b", "(Lh71/k;)Lh71/k;", "Lcom/whoop/tiltgraph/domain/models/TiltGraphDatePickerModel;", "tiltGraphDatePickerModel", "Li11/f;", "g", "(Lcom/whoop/tiltgraph/domain/models/TiltGraphDatePickerModel;)Li11/f;", "Lyj2/a;", "combinedDomainState", "f", "(Lyj2/a;)Lbk2/g;", "Ljb1/a;", "a", "Ljb1/a;", "designItemReducer", "tilt-graph_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C4792a {

    /* JADX INFO: renamed from: c */
    public static final int f19711c = C21535a.f82608c;

    /* JADX INFO: renamed from: d */
    private static final C16618c f19712d = new C16618c(0.0f, 0.2f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a designItemReducer = AbstractC21537c.m60554d(new C4769a(15));

    /* JADX INFO: renamed from: b */
    private final C16994k m15144b(C16994k c16994k) {
        return C16994k.m47859b(c16994k, null, f19712d, null, false, true, false, 13, null);
    }

    /* JADX INFO: renamed from: c */
    private final List<AbstractC21394b> m15145c(List<? extends AbstractC21394b> list) {
        List<? extends AbstractC21394b> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        for (Object objM60067f : list2) {
            if (objM60067f instanceof AbstractC21394b.i) {
                AbstractC21394b.i iVar = (AbstractC21394b.i) objM60067f;
                List<C39260a> listM60086h = iVar.m60086h();
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM60086h, 10));
                Iterator<T> it = listM60086h.iterator();
                while (it.hasNext()) {
                    arrayList2.add(C39260a.m125036b((C39260a) it.next(), null, null, 0.0f, null, null, EnumC39333f.WHITE_50, null, null, null, null, null, 2015, null));
                }
                objM60067f = AbstractC21394b.i.m60083f(iVar, arrayList2, null, null, false, false, 30, null);
            } else if (objM60067f instanceof AbstractC21394b.d) {
                objM60067f = AbstractC21394b.d.m60067f((AbstractC21394b.d) objM60067f, null, null, null, -0.1f, false, false, 55, null);
            }
            arrayList.add(objM60067f);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m15146d(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e */
    private final C33612r m15147e(ZoomableGraphModel graphModel) {
        InterfaceC25312u interfaceC25312uM60541h = this.designItemReducer.m60541h(graphModel);
        if (!(interfaceC25312uM60541h instanceof C33612r)) {
            return null;
        }
        C33612r c33612r = (C33612r) interfaceC25312uM60541h;
        return c33612r.m106189a((8159 & 1) != 0 ? c33612r.planeState : m15144b(c33612r.getPlaneState()), (8159 & 2) != 0 ? c33612r.plotPadding : null, (8159 & 4) != 0 ? c33612r.plots : m15145c(c33612r.m106196j()), (8159 & 8) != 0 ? c33612r.initialGraphSize : 0L, (8159 & 16) != 0 ? c33612r.accessibilityLabel : null, (8159 & 32) != 0 ? c33612r.zoom : 0.0f, (8159 & 64) != 0 ? c33612r.zoomLevel : null, (8159 & 128) != 0 ? c33612r.zoomToggleState : null, (8159 & 256) != 0 ? c33612r.isAnimating : false, (8159 & 512) != 0 ? c33612r.initialDataScrubState : null, (8159 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c33612r.initialPlotId : null, (8159 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c33612r.initialScrollableScrubberState : null, (8159 & 4096) != 0 ? c33612r.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : null);
    }

    /* JADX INFO: renamed from: g */
    private final C17863f m15148g(TiltGraphDatePickerModel tiltGraphDatePickerModel) {
        TextResource textResourceM21278l = AbstractC8693b.m21278l(tiltGraphDatePickerModel.getCurrentDateRangeDisplay());
        boolean z4 = tiltGraphDatePickerModel.getPreviousDateTime() != null;
        boolean z13 = tiltGraphDatePickerModel.getNextDateTime() != null;
        String previousDateTime = tiltGraphDatePickerModel.getPreviousDateTime();
        String str = previousDateTime == null ? "" : previousDateTime;
        String nextDateTime = tiltGraphDatePickerModel.getNextDateTime();
        return new C17863f(null, textResourceM21278l, z4, str, z13, nextDateTime == null ? "" : nextDateTime, null, null, null, null, 961, null);
    }

    /* JADX INFO: renamed from: h */
    private final AbstractC3360g m15149h(AbstractC37321b.c domainResult, C17027b<CalendarDateModel> calendarState) {
        return new AbstractC3360g.c(new C3356c(calendarState, m15148g(domainResult.getDomainState().getDatePicker()), C38072d.f163053a.m121951d().getAction().getCollapse(), AbstractC8693b.m21278l(domainResult.getDomainState().getTitle()), AbstractC8693b.m21278l(domainResult.getDomainState().getLastUpdatedTimestamp()), false, 32, null), m15147e(domainResult.getDomainState().getGraph()), f19712d);
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC3360g m15150f(C39593a combinedDomainState) {
        AbstractC22676k.m65750j(combinedDomainState, "combinedDomainState");
        AbstractC37321b abstractC37321bM126475b = combinedDomainState.getDomainResult();
        if (abstractC37321bM126475b instanceof AbstractC37321b.a) {
            return new AbstractC3360g.a(((AbstractC37321b.a) combinedDomainState.getDomainResult()).getCom.mapbox.common.HttpHeaders.DATE java.lang.String());
        }
        if (AbstractC22676k.m65745e(abstractC37321bM126475b, AbstractC37321b.b.f159552a)) {
            return AbstractC3360g.b.f13097a;
        }
        if (abstractC37321bM126475b instanceof AbstractC37321b.c) {
            return m15149h((AbstractC37321b.c) combinedDomainState.getDomainResult(), combinedDomainState.m126474a());
        }
        throw new NoWhenBranchMatchedException();
    }
}
