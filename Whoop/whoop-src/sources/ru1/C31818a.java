package ru1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.ArrowStatModel;
import com.whoop.design.models.items.SecondaryButtonModel;
import com.whoop.design.models.items.UnknownDesignModel;
import com.whoop.design.models.items.graph.GraphModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.lastnightsleep.domain.models.DetailsGraphingCardModel;
import com.whoop.lastnightsleep.domain.models.GraphLegendModel;
import e71.C12800a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j61.C21374h;
import j71.AbstractC21394b;
import j71.C21395c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import k71.C22257n;
import l83.C23454a0;
import l83.C23465k;
import ly0.C24802f;
import m83.AbstractC25267u;
import m83.C25271y;
import mc1.AbstractC25419d;
import mc1.AbstractC25421f;
import mc1.C25420e;
import mc1.EnumC25417b;
import n21.C26191e;
import no.nordicsemi.android.dfu.DfuBaseService;
import nu1.C27139c;
import nu1.C27142f;
import nu1.C27143g;
import ny0.C27273p0;
import p181h2.C16618c;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.AbstractC23697q2;
import p720m91.InterfaceC25312u;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import rq0.C31703x;
import tu1.C34188a;
import tu1.C34189b;
import tu1.C34194g;
import tu1.C34195h;
import wb3.AbstractC37056f;
import y11.C39059l;

/* JADX INFO: renamed from: ru1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00052\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ?\u0010#\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00050 2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b#\u0010$J\u001d\u0010&\u001a\u00020%2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\n¢\u0006\u0004\b&\u0010'¨\u0006("}, m65681d2 = {"Lru1/a;", "", "<init>", "()V", "Lcom/whoop/lastnightsleep/domain/models/DetailsGraphingCardModel;", "", "Ln21/e;", "d", "(Lcom/whoop/lastnightsleep/domain/models/DetailsGraphingCardModel;)Ljava/util/List;", "model", "Lnu1/c;", "domainState", "Lmc1/b;", "b", "(Lcom/whoop/lastnightsleep/domain/models/DetailsGraphingCardModel;Lnu1/c;)Lmc1/b;", "applicableHeartRateZone", "Ljb1/a;", "reducer", "Lm91/u;", "g", "(Lcom/whoop/lastnightsleep/domain/models/DetailsGraphingCardModel;Lmc1/b;Ljb1/a;)Ljava/util/List;", "Lcom/whoop/design/models/items/graph/GraphModel;", "content", "applicableZone", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/lastnightsleep/domain/models/DetailsGraphingCardModel;Lmc1/b;Ljb1/a;)Lm91/u;", "Lj71/c;", "j", "(Lcom/whoop/design/models/items/graph/GraphModel;Lmc1/b;)Lj71/c;", "i", "(Lcom/whoop/design/models/items/graph/GraphModel;Ljb1/a;)Lj71/c;", "lastNightSleepDomainState", "Ll83/k;", "Lly0/f;", "Ltu1/h;", "c", "(Lnu1/c;Lcom/whoop/lastnightsleep/domain/models/DetailsGraphingCardModel;Ljb1/a;)Ll83/k;", "Ltu1/g;", "e", "(Lcom/whoop/lastnightsleep/domain/models/DetailsGraphingCardModel;Lnu1/c;)Ltu1/g;", "last-night-sleep_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31818a {

    /* JADX INFO: renamed from: ru1.a$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f131830w = new a();

        /* JADX INFO: renamed from: a */
        public final long m98881a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m98881a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: ru1.a$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ EnumC25417b f131831w;

        public b(EnumC25417b enumC25417b) {
            this.f131831w = enumC25417b;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(InterfaceC25312u it) {
            AbstractC22676k.m65750j(it, "it");
            C22257n c22257n = (C22257n) it;
            if (this.f131831w == EnumC25417b.NONE) {
                return c22257n;
            }
            AbstractC25419d.Companion aVar = AbstractC25419d.INSTANCE;
            List<C39059l> listM63919c = c22257n.m63919c();
            EnumC25417b enumC25417b = this.f131831w;
            return C22257n.m63917b(c22257n, null, aVar.m74619a(listM63919c, enumC25417b, enumC25417b), 1, null);
        }
    }

    /* JADX INFO: renamed from: b */
    private final EnumC25417b m98872b(DetailsGraphingCardModel model, C27139c domainState) {
        EnumC25417b heartRateZoneType;
        C27143g selectedHeartRateZoneType = domainState.getSelectedHeartRateZoneType();
        if (selectedHeartRateZoneType != null) {
            if (!AbstractC22676k.m65745e(selectedHeartRateZoneType.getComponentId(), model.getId())) {
                selectedHeartRateZoneType = null;
            }
            if (selectedHeartRateZoneType != null && (heartRateZoneType = selectedHeartRateZoneType.getHeartRateZoneType()) != null) {
                return heartRateZoneType;
            }
        }
        return EnumC25417b.NONE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    private final C23465k m98873c(C27139c lastNightSleepDomainState, DetailsGraphingCardModel model, C21535a reducer) {
        ArrayList arrayList;
        C27142f scrubbingHorizontalStatState = lastNightSleepDomainState.getScrubbingHorizontalStatState();
        boolean z4 = scrubbingHorizontalStatState != null && AbstractC22676k.m65745e(scrubbingHorizontalStatState.getComponentId(), model.getId());
        Object objM118958J = C25271y.f99162w;
        if (z4) {
            arrayList = objM118958J;
        } else {
            List<ArrowStatModel> arrowStat = model.getArrowStat();
            arrayList = new ArrayList(AbstractC25267u.m74163i0(arrowStat, 10));
            Iterator<T> it = arrowStat.iterator();
            while (it.hasNext()) {
                InterfaceC25312u interfaceC25312uM60541h = reducer.m60541h((ArrowStatModel) it.next());
                AbstractC22676k.m65748h(interfaceC25312uM60541h, "null cannot be cast to non-null type com.whoop.design.atomic.atom.arrowStat.ArrowStatState");
                arrayList.add((C24802f) interfaceC25312uM60541h);
            }
        }
        if (z4 && scrubbingHorizontalStatState != null) {
            TextResource valueDisplay = scrubbingHorizontalStatState.getValueDisplay();
            TextResource unitDisplay = scrubbingHorizontalStatState.getUnitDisplay();
            TextResource timeDisplay = scrubbingHorizontalStatState.getTimeDisplay();
            InterfaceC39332e scrubColor = scrubbingHorizontalStatState.getScrubColor();
            if (scrubColor == null) {
                scrubColor = p745y81.Function1.m125323a(a.f131830w);
            }
            objM118958J = AbstractC37056f.m118958J(new C34195h(valueDisplay, unitDisplay, timeDisplay, scrubColor));
        }
        return new C23465k(arrayList, objM118958J);
    }

    /* JADX INFO: renamed from: d */
    private final List<C26191e> m98874d(DetailsGraphingCardModel detailsGraphingCardModel) {
        List<GraphLegendModel> graphLegends = detailsGraphingCardModel.getGraphLegends();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(graphLegends, 10));
        for (GraphLegendModel graphLegendModel : graphLegends) {
            arrayList.add(AbstractC23697q2.m69290d(graphLegendModel.getGraphLegendStyle(), graphLegendModel.getLegendText(), false));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m98875f(EnumC25417b enumC25417b, C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60546a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C22257n.class), new b(enumC25417b));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g */
    private final List<InterfaceC25312u> m98876g(DetailsGraphingCardModel model, EnumC25417b applicableHeartRateZone, C21535a reducer) {
        List<DesignSystemModel> cardContent = model.getCardContent();
        ArrayList<DesignSystemModel> arrayList = new ArrayList();
        for (Object obj : cardContent) {
            if (!(((DesignSystemModel) obj) instanceof UnknownDesignModel)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        for (DesignSystemModel designSystemModel : arrayList) {
            arrayList2.add(designSystemModel instanceof GraphModel ? m98877h((GraphModel) designSystemModel, model, applicableHeartRateZone, reducer) : reducer.m60541h(designSystemModel));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: h */
    private final InterfaceC25312u m98877h(GraphModel content, DetailsGraphingCardModel model, EnumC25417b applicableZone, C21535a reducer) {
        String id4 = model.getId();
        if (AbstractC22676k.m65745e(id4, "hours_of_sleep")) {
            return m98879j(content, applicableZone);
        }
        if (AbstractC22676k.m65745e(id4, "sleep_consistency")) {
            return m98878i(content, reducer);
        }
        InterfaceC25312u interfaceC25312uM60541h = reducer.m60541h(content);
        AbstractC22676k.m65748h(interfaceC25312uM60541h, "null cannot be cast to non-null type com.whoop.design.atomic.organism.graph.state.GraphState");
        C21395c c21395c = (C21395c) interfaceC25312uM60541h;
        C21374h plane = c21395c.getPlane();
        return C21395c.m60092b(c21395c, plane.m59985a((8187 & 1) != 0 ? plane.startVerticalAxis : null, (8187 & 2) != 0 ? plane.endVerticalAxis : null, (8187 & 4) != 0 ? plane.bottomHorizontalAxis : null, (8187 & 8) != 0 ? plane.topHorizontalAxis : null, (8187 & 16) != 0 ? plane.insets : null, (8187 & 32) != 0 ? plane.lines : null, (8187 & 64) != 0 ? plane.graphAnnotations : null, (8187 & 128) != 0 ? plane.accessibilityState : null, (8187 & 256) != 0 ? plane.scrubberEnabled : false, (8187 & 512) != 0 ? plane.clickable : false, (8187 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? plane.buttons : null, (8187 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? plane.longPressTimeoutMillis : 200L, (8187 & 4096) != 0 ? plane.horizontalGridLinePadding : 0.0f), null, null, null, 14, null);
    }

    /* JADX INFO: renamed from: i */
    private final C21395c m98878i(GraphModel content, C21535a reducer) {
        AbstractC21394b.b bVar;
        List arrayList;
        List<C12800a> listM60064g;
        InterfaceC25312u interfaceC25312uM60541h = reducer.m60541h(content);
        AbstractC22676k.m65748h(interfaceC25312uM60541h, "null cannot be cast to non-null type com.whoop.design.atomic.organism.graph.state.GraphState");
        C21395c c21395c = (C21395c) interfaceC25312uM60541h;
        Iterator<T> it = c21395c.m60096f().iterator();
        do {
            bVar = null;
            if (!it.hasNext()) {
                break;
            }
            AbstractC21394b abstractC21394b = (AbstractC21394b) it.next();
            if (abstractC21394b instanceof AbstractC21394b.b) {
                bVar = (AbstractC21394b.b) abstractC21394b;
            }
        } while (bVar == null);
        if (bVar == null || (listM60064g = bVar.m60064g()) == null) {
            arrayList = C25271y.f99162w;
        } else {
            List<C12800a> list = listM60064g;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator<T> it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList.add(C12800a.m35840b((C12800a) it3.next(), null, null, 0.0f, 0.0f, null, null, null, null, true, 255, null));
            }
        }
        List list2 = arrayList;
        List<AbstractC21394b> listM60096f = c21395c.m60096f();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM60096f, 10));
        for (Object objM60062f : listM60096f) {
            if (objM60062f instanceof AbstractC21394b.b) {
                objM60062f = AbstractC21394b.b.m60062f((AbstractC21394b.b) objM60062f, list2, null, false, false, 14, null);
            }
            arrayList2.add(objM60062f);
        }
        C21374h plane = c21395c.getPlane();
        return C21395c.m60092b(c21395c, plane.m59985a((8187 & 1) != 0 ? plane.startVerticalAxis : null, (8187 & 2) != 0 ? plane.endVerticalAxis : null, (8187 & 4) != 0 ? plane.bottomHorizontalAxis : null, (8187 & 8) != 0 ? plane.topHorizontalAxis : null, (8187 & 16) != 0 ? plane.insets : null, (8187 & 32) != 0 ? plane.lines : null, (8187 & 64) != 0 ? plane.graphAnnotations : null, (8187 & 128) != 0 ? plane.accessibilityState : null, (8187 & 256) != 0 ? plane.scrubberEnabled : false, (8187 & 512) != 0 ? plane.clickable : false, (8187 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? plane.buttons : null, (8187 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? plane.longPressTimeoutMillis : 200L, (8187 & 4096) != 0 ? plane.horizontalGridLinePadding : 0.0f), arrayList2, null, null, 12, null);
    }

    /* JADX INFO: renamed from: j */
    private final C21395c m98879j(GraphModel content, EnumC25417b applicableZone) {
        C21395c c21395cM74622b = AbstractC25421f.m74622b(content, AbstractC25421f.m74624d(applicableZone, C25420e.a.SLEEP, null, 4, null));
        C21374h plane = c21395cM74622b.getPlane();
        return C21395c.m60092b(c21395cM74622b, plane.m59985a((8187 & 1) != 0 ? plane.startVerticalAxis : null, (8187 & 2) != 0 ? plane.endVerticalAxis : null, (8187 & 4) != 0 ? plane.bottomHorizontalAxis : null, (8187 & 8) != 0 ? plane.topHorizontalAxis : null, (8187 & 16) != 0 ? plane.insets : C16618c.f63938e, (8187 & 32) != 0 ? plane.lines : null, (8187 & 64) != 0 ? plane.graphAnnotations : null, (8187 & 128) != 0 ? plane.accessibilityState : null, (8187 & 256) != 0 ? plane.scrubberEnabled : false, (8187 & 512) != 0 ? plane.clickable : false, (8187 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? plane.buttons : null, (8187 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? plane.longPressTimeoutMillis : 200L, (8187 & 4096) != 0 ? plane.horizontalGridLinePadding : 0.0f), null, null, null, 14, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x007e  */
    /* JADX INFO: renamed from: e */
    public final C34194g m98880e(DetailsGraphingCardModel model, C27139c lastNightSleepDomainState) {
        C27273p0 c27273p0;
        AbstractC22676k.m65750j(model, "model");
        AbstractC22676k.m65750j(lastNightSleepDomainState, "lastNightSleepDomainState");
        EnumC25417b enumC25417bM98872b = m98872b(model, lastNightSleepDomainState);
        C21535a c21535aM60554d = AbstractC21537c.m60554d(new C31703x(enumC25417bM98872b, 4));
        C23465k c23465kM98873c = m98873c(lastNightSleepDomainState, model, c21535aM60554d);
        List list = (List) c23465kM98873c.f92937w;
        List list2 = (List) c23465kM98873c.f92938x;
        String id4 = model.getId();
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getCardTitle());
        String infoIcon = model.getCardInfo().getInfoIcon();
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(model.getCardInfo().getInfoSheetDetails());
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(model.getCardInfo().getInfoSheetTitle());
        String infoSheetTitle = model.getCardInfo().getInfoSheetTitle();
        String infoSheetDetails = model.getCardInfo().getInfoSheetDetails();
        SecondaryButtonModel cta = model.getCardInfo().getCta();
        if (cta != null) {
            InterfaceC25312u interfaceC25312uM60544l = c21535aM60554d.m60544l(cta);
            if (interfaceC25312uM60544l instanceof C27273p0) {
                c27273p0 = (C27273p0) interfaceC25312uM60544l;
            } else {
                c27273p0 = null;
            }
        } else {
            c27273p0 = null;
        }
        C34188a c34188a = new C34188a(infoSheetTitle, infoSheetDetails, c27273p0);
        SecondaryButtonModel cta2 = model.getCardInfo().getCta();
        return new C34194g(id4, textResourceM21278l, new C34189b(infoIcon, textResourceM21278l2, textResourceM21278l3, cta2 != null ? c21535aM60554d.m60544l(cta2) : null, c34188a), list, list2, m98874d(model), m98876g(model, enumC25417bM98872b, c21535aM60554d));
    }
}
