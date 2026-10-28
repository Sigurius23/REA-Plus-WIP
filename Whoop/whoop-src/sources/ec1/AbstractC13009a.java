package ec1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.graph.plot.OverlayPlotModel;
import com.whoop.design.models.items.graph.plot.overlay.OverlayBar;
import com.whoop.design.models.items.graph.plot.overlay.OverlayBarStyle;
import com.whoop.design.models.items.graph.plot.overlay.OverlayCta;
import com.whoop.design.models.items.graph.plot.overlay.OverlayGroupModel;
import com.whoop.design.util.AbstractC8693b;
import dc1.C11906c;
import j71.AbstractC21394b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import kd1.AbstractC22403o;
import l83.C23454a0;
import m83.AbstractC25267u;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import u61.C34555d;
import y61.C39260a;
import y61.C39261b;

/* JADX INFO: renamed from: ec1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/OverlayPlotModel;", "plot", "Lj71/b$i;", "c", "(Lcom/whoop/design/models/items/graph/plot/OverlayPlotModel;)Lj71/b$i;", "Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBarStyle;", "style", "Ly81/e;", "b", "(Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBarStyle;)Ly81/e;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13009a {

    /* JADX INFO: renamed from: ec1.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f44964a;

        static {
            int[] iArr = new int[OverlayBarStyle.values().length];
            try {
                iArr[OverlayBarStyle.SLEEP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OverlayBarStyle.CARDIO_ACTIVITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OverlayBarStyle.RECOVERY_ACTIVITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f44964a = iArr;
        }
    }

    /* JADX INFO: renamed from: ec1.a$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f44965w = new b();

        /* JADX INFO: renamed from: a */
        public final long m36543a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m36543a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: ec1.a$c */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f44966w = new c();

        /* JADX INFO: renamed from: a */
        public final long m36544a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getStrain();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m36544a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: ec1.a$d */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f44967w = new d();

        /* JADX INFO: renamed from: a */
        public final long m36545a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m36545a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: b */
    private static final InterfaceC39332e m36540b(OverlayBarStyle overlayBarStyle) {
        int i13 = a.f44964a[overlayBarStyle.ordinal()];
        if (i13 == 1) {
            return p745y81.Function1.m125323a(b.f44965w);
        }
        if (i13 == 2) {
            return p745y81.Function1.m125323a(c.f44966w);
        }
        if (i13 == 3) {
            return p745y81.Function1.m125323a(d.f44967w);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: c */
    public static final AbstractC21394b.i m36541c(OverlayPlotModel plot) {
        AbstractC22676k.m65750j(plot, "plot");
        C21535a c21535aM60554d = AbstractC21537c.m60554d(new C11906c(22));
        List<OverlayGroupModel> overlayGroupList = plot.getOverlayGroupList();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(overlayGroupList, 10));
        for (OverlayGroupModel overlayGroupModel : overlayGroupList) {
            List<OverlayBar> overlayList = overlayGroupModel.getOverlayList();
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(overlayList, 10));
            for (OverlayBar overlayBar : overlayList) {
                arrayList2.add(new C39261b(overlayBar.getWidth(), overlayBar.getPositionX(), m36540b(overlayBar.getStyle())));
            }
            float positionX = overlayGroupModel.getLabel().getPositionX();
            String topLabel = overlayGroupModel.getLabel().getTopLabel();
            ArrayList arrayList3 = null;
            C34555d c34555d = topLabel != null ? new C34555d(AbstractC8693b.m21278l(topLabel), null, false, false, 14, null) : null;
            String topIconUrl = overlayGroupModel.getLabel().getTopIconUrl();
            AbstractC22403o.c cVar = topIconUrl != null ? new AbstractC22403o.c(topIconUrl, 0, 0, 0, 14, null) : null;
            OverlayCta cta = overlayGroupModel.getLabel().getCta();
            String strName = cta != null ? cta.name() : null;
            String activityId = overlayGroupModel.getLabel().getActivityId();
            List<DesignSystemModel> overlayLabelCtaContent = overlayGroupModel.getLabel().getOverlayLabelCtaContent();
            if (overlayLabelCtaContent != null) {
                List<DesignSystemModel> list = overlayLabelCtaContent;
                arrayList3 = new ArrayList(AbstractC25267u.m74163i0(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList3.add(c21535aM60554d.m60541h((DesignSystemModel) it.next()));
                }
            }
            arrayList.add(new C39260a(null, arrayList2, positionX, c34555d, cVar, null, null, strName, activityId, arrayList3, overlayGroupModel.getLabel().getSecondaryIcon(), 97, null));
        }
        String id4 = plot.getId();
        Boolean hideWhileScrubbing = plot.getHideWhileScrubbing();
        boolean zBooleanValue = hideWhileScrubbing != null ? hideWhileScrubbing.booleanValue() : false;
        Boolean skipScrubbing = plot.getSkipScrubbing();
        return new AbstractC21394b.i(arrayList, null, id4, skipScrubbing != null ? skipScrubbing.booleanValue() : false, zBooleanValue, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m36542d(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        return C23454a0.f92919a;
    }
}
