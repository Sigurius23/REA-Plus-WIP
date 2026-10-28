package tf0;

import com.whoop.advancedlabsjoin.feature.join.domain.models.AdvanceLabsJoinStickyModel;
import com.whoop.advancedlabsjoin.feature.join.domain.models.AdvancedLabsJoinModels;
import com.whoop.advancedlabsjoin.feature.join.domain.models.AdvancedLabsJoinSectionModel;
import com.whoop.advancedlabsjoin.feature.join.domain.models.AdvancedLabsJoinSectionSpacingType;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.FeatureListModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import hy0.C17750h1;
import i01.C17845h;
import i01.EnumC17846i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j11.EnumC21213p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import jb1.C21535a;
import m83.AbstractC25267u;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p736sz0.C33205o0;
import p745y81.EnumC39333f;
import pf0.C29147c;
import pf0.InterfaceC29145a;
import q31.C29943a;
import q31.C29948f;
import sf0.C32445c;
import sf0.InterfaceC32443a;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: tf0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\u000b\u001a\u00020\n*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\n*\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001e\u001a\u00020\u001d*\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010#\u001a\b\u0012\u0004\u0012\u00020!0 *\u00020\u00112\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b#\u0010$J5\u0010'\u001a\b\u0012\u0004\u0012\u00020&0 2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u0007H\u0002¢\u0006\u0004\b'\u0010(J'\u0010*\u001a\u00020&2\u0006\u0010)\u001a\u00020&2\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b*\u0010+J'\u0010-\u001a\u00020,2\u0006\u0010)\u001a\u00020,2\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020&2\u0006\u0010/\u001a\u00020&H\u0002¢\u0006\u0004\b0\u00101J'\u00103\u001a\u00020&2\u0006\u0010/\u001a\u00020&2\u0006\u00102\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b3\u0010+J\u001f\u00105\u001a\u0002042\u0006\u0010)\u001a\u0002042\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u0002082\u0006\u00107\u001a\u00020\u0007H\u0002¢\u0006\u0004\b9\u0010:J\u0015\u0010<\u001a\u00020\n2\u0006\u0010;\u001a\u00020\u0011¢\u0006\u0004\b<\u0010=R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010>R\u0016\u0010@\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010?¨\u0006A"}, m65681d2 = {"Ltf0/a;", "", "Ljb1/a;", "reducer", "<init>", "(Ljb1/a;)V", "Lpf0/a$b;", "", "source", "selectedSegmentId", "Lsf0/c;", "m", "(Lpf0/a$b;Ljava/lang/String;Ljava/lang/String;)Lsf0/c;", "Lpf0/a$e;", "Lsf0/c$a;", "l", "(Lpf0/a$e;)Lsf0/c$a;", "Lpf0/c;", "dialog", "n", "(Lpf0/c;Lsf0/c$a;)Lsf0/c;", "Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvanceLabsJoinStickyModel;", "stickyModel", "effectiveTabId", "Lsf0/c$e;", "f", "(Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvanceLabsJoinStickyModel;Ljava/lang/String;Ljava/lang/String;)Lsf0/c$e;", "Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinSectionModel;", "section", "Lsf0/c$b;", "k", "(Lpf0/c;Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinSectionModel;Ljava/lang/String;Ljava/lang/String;)Lsf0/c$b;", "", "Lcom/whoop/design/models/DesignSystemModel;", "items", "j", "(Lpf0/c;Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "models", "Lm91/u;", "g", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "item", "b", "(Lm91/u;Ljava/lang/String;Ljava/lang/String;)Lm91/u;", "Lq31/f;", "e", "(Lq31/f;Ljava/lang/String;Ljava/lang/String;)Lq31/f;", "segmentItem", "d", "(Lm91/u;)Lm91/u;", "segmentId", "c", "Li01/h;", "a", "(Li01/h;Ljava/lang/String;)Li01/h;", "spacing", "Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinSectionSpacingType;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;)Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinSectionSpacingType;", "domainResult", "i", "(Lpf0/c;)Lsf0/c;", "Ljb1/a;", "Ljava/lang/String;", "lastSelectedSubscriptionSegmentId", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33760a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a reducer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String lastSelectedSubscriptionSegmentId;

    public C33760a(C21535a reducer) {
        AbstractC22676k.m65750j(reducer, "reducer");
        this.reducer = reducer;
        this.lastSelectedSubscriptionSegmentId = "";
    }

    /* JADX INFO: renamed from: a */
    private final C17845h m106728a(C17845h item, String selectedSegmentId) {
        String id4;
        return C17845h.m51308b(item, null, null, null, null, null, null, null, null, null, AbstractC22676k.m65745e(item.getId(), selectedSegmentId) || (AbstractC22676k.m65745e(selectedSegmentId, "one_time_test") && ((id4 = item.getId()) == null || AbstractC39414r.m125890i0(id4))) ? EnumC17846i.SAVINGS : EnumC17846i.DEFAULT, null, null, 3583, null);
    }

    /* JADX INFO: renamed from: b */
    private final InterfaceC25312u m106729b(InterfaceC25312u item, String effectiveTabId, String selectedSegmentId) {
        if (item instanceof C29948f) {
            return m106732e((C29948f) item, effectiveTabId, selectedSegmentId);
        }
        return item instanceof C17845h ? m106728a((C17845h) item, selectedSegmentId) : item;
    }

    /* JADX INFO: renamed from: c */
    private final InterfaceC25312u m106730c(InterfaceC25312u segmentItem, String segmentId, String selectedSegmentId) {
        if (!(segmentItem instanceof C17845h)) {
            return segmentItem;
        }
        C17845h c17845h = (C17845h) segmentItem;
        String id4 = c17845h.getId();
        String str = id4 == null ? segmentId : id4;
        return C17845h.m51308b(c17845h, str, null, null, null, null, null, null, null, null, AbstractC22676k.m65745e(str, selectedSegmentId) ? EnumC17846i.SAVINGS : EnumC17846i.DEFAULT, null, null, 3582, null);
    }

    /* JADX INFO: renamed from: d */
    private final InterfaceC25312u m106731d(InterfaceC25312u segmentItem) {
        if (!(segmentItem instanceof C17845h)) {
            return segmentItem;
        }
        C17845h c17845h = (C17845h) segmentItem;
        EnumC17846i enumC17846i = EnumC17846i.DEFAULT;
        C17750h1 tag = c17845h.getTag();
        return C17845h.m51308b(c17845h, null, null, null, null, null, null, null, tag != null ? C17750h1.m50901b(tag, null, null, EnumC39333f.BRAND_WHITE, null, EnumC39333f.BRAND_BLACK, null, null, null, false, null, 0.0f, 0.0f, 0.0f, null, 0.0f, null, null, null, null, null, null, null, 4194283, null) : null, null, enumC17846i, null, null, 3455, null);
    }

    /* JADX INFO: renamed from: e */
    private final C29948f m106732e(C29948f item, String effectiveTabId, String selectedSegmentId) {
        ArrayList arrayList;
        Iterator<C29943a> it = item.m91612e().iterator();
        int initiallySelectedSegmentIndex = 0;
        while (true) {
            if (!it.hasNext()) {
                initiallySelectedSegmentIndex = -1;
                break;
            }
            if (AbstractC22676k.m65745e(it.next().getId(), effectiveTabId)) {
                break;
            }
            initiallySelectedSegmentIndex++;
        }
        if (AbstractC22676k.m65745e(selectedSegmentId, "one_time_test")) {
            List<C29943a> listM91612e = item.m91612e();
            arrayList = new ArrayList(AbstractC25267u.m74163i0(listM91612e, 10));
            for (C29943a c29943a : listM91612e) {
                List<InterfaceC25312u> listM91582f = c29943a.m91582f();
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM91582f, 10));
                Iterator<T> it3 = listM91582f.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(m106731d((InterfaceC25312u) it3.next()));
                }
                arrayList.add(C29943a.m91577b(c29943a, null, null, null, arrayList2, null, null, 55, null));
            }
        } else {
            List<C29943a> listM91612e2 = item.m91612e();
            arrayList = new ArrayList(AbstractC25267u.m74163i0(listM91612e2, 10));
            for (C29943a c29943a2 : listM91612e2) {
                List<InterfaceC25312u> listM91582f2 = c29943a2.m91582f();
                ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(listM91582f2, 10));
                Iterator<T> it4 = listM91582f2.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(m106730c((InterfaceC25312u) it4.next(), c29943a2.getId(), selectedSegmentId));
                }
                arrayList.add(C29943a.m91577b(c29943a2, null, null, null, arrayList3, null, null, 55, null));
            }
        }
        ArrayList arrayList4 = arrayList;
        if ((AbstractC22676k.m65745e(selectedSegmentId, "one_time_test") && this.lastSelectedSubscriptionSegmentId.length() == 0) || initiallySelectedSegmentIndex < 0) {
            initiallySelectedSegmentIndex = item.getInitiallySelectedSegmentIndex();
        }
        return C29948f.m91609b(item, null, null, initiallySelectedSegmentIndex, arrayList4, false, 19, null);
    }

    /* JADX INFO: renamed from: f */
    private final C32445c.e m106733f(AdvanceLabsJoinStickyModel stickyModel, String selectedSegmentId, String effectiveTabId) {
        return new C32445c.e(stickyModel.getText(), m106734g(stickyModel.getItems(), selectedSegmentId, effectiveTabId));
    }

    /* JADX INFO: renamed from: g */
    private final List<InterfaceC25312u> m106734g(List<? extends DesignSystemModel> models, String selectedSegmentId, String effectiveTabId) {
        List<InterfaceC25312u> listM60540g = this.reducer.m60540g(models);
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM60540g, 10));
        Iterator<T> it = listM60540g.iterator();
        while (it.hasNext()) {
            arrayList.add(m106729b((InterfaceC25312u) it.next(), effectiveTabId, selectedSegmentId));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    private final AdvancedLabsJoinSectionSpacingType m106735h(String spacing) {
        String upperCase = spacing.toUpperCase(Locale.ROOT);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        if (upperCase.equals("NORMAL")) {
            return AdvancedLabsJoinSectionSpacingType.NORMAL;
        }
        return upperCase.equals("COMPACT") ? AdvancedLabsJoinSectionSpacingType.COMPACT : AdvancedLabsJoinSectionSpacingType.COMPACT;
    }

    /* JADX INFO: renamed from: j */
    private final List<DesignSystemModel> m106736j(C29147c c29147c, List<? extends DesignSystemModel> list, String str) {
        AdvancedLabsJoinModels response;
        Map<String, DesignSystemModel> featuresBySegment;
        DesignSystemModel designSystemModel;
        List<? extends DesignSystemModel> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        for (DesignSystemModel designSystemModel2 : list2) {
            if ((designSystemModel2 instanceof FeatureListModel) && (response = c29147c.getResponse()) != null && (featuresBySegment = response.getFeaturesBySegment()) != null && (designSystemModel = featuresBySegment.get(str)) != null) {
                designSystemModel2 = designSystemModel;
            }
            arrayList.add(designSystemModel2);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k */
    private final C32445c.b m106737k(C29147c c29147c, AdvancedLabsJoinSectionModel advancedLabsJoinSectionModel, String str, String str2) {
        AdvancedLabsJoinSectionSpacingType advancedLabsJoinSectionSpacingTypeM106735h;
        String sectionType = advancedLabsJoinSectionModel.getSectionType();
        if (sectionType == null || (advancedLabsJoinSectionSpacingTypeM106735h = m106735h(sectionType)) == null) {
            advancedLabsJoinSectionSpacingTypeM106735h = AdvancedLabsJoinSectionSpacingType.COMPACT;
        }
        return new C32445c.b(m106734g(m106736j(c29147c, advancedLabsJoinSectionModel.getItems(), str), str, str2), advancedLabsJoinSectionSpacingTypeM106735h);
    }

    /* JADX INFO: renamed from: l */
    private final C32445c.a m106738l(InterfaceC29145a.e eVar) {
        if (!(eVar instanceof InterfaceC29145a.a)) {
            throw new NoWhenBranchMatchedException();
        }
        return new C32445c.a(AbstractC8693b.m21278l("title"), AbstractC8693b.m21278l("Confirm"), null, AbstractC8693b.m21278l("Cancel"), AbstractC8693b.m21278l("description"), true, true, EnumC21213p.LOTTIE, null, null, 4, null);
    }

    /* JADX INFO: renamed from: m */
    private final C32445c m106739m(InterfaceC29145a.b bVar, String str, String str2) {
        if (bVar instanceof InterfaceC29145a.c) {
            return new C32445c(null, new C32445c.c(C33205o0.f138451a.m105288b(), null, null, null, 14, null), null, 5, null);
        }
        if (bVar instanceof InterfaceC29145a.d) {
            return new C32445c(null, new C32445c.c(C33205o0.f138451a.m105289c(), new InterfaceC32443a.h(str, str2, str2), null, InterfaceC32443a.e.f134354a, 4, null), null, 5, null);
        }
        if (bVar instanceof InterfaceC29145a.f) {
            return new C32445c(null, new C32445c.c(C33205o0.f138451a.m105291e(), new InterfaceC32443a.h(str, str2, str2), null, InterfaceC32443a.e.f134354a, 4, null), null, 5, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004b  */
    /* JADX INFO: renamed from: n */
    private final C32445c m106740n(C29147c c29147c, C32445c.a aVar) {
        String selectedSegmentId;
        List list;
        TextResource textResourceM21267a;
        String toolBarTitle;
        List<AdvancedLabsJoinSectionModel> sections;
        Map<String, AdvanceLabsJoinStickyModel> bottomStickyItems;
        AdvanceLabsJoinStickyModel advanceLabsJoinStickyModel;
        Map<String, AdvanceLabsJoinStickyModel> bottomStickyItems2;
        Set<String> setKeySet;
        Object next;
        C32445c.e eVarM106733f = null;
        if (AbstractC22676k.m65745e(c29147c.getSelectedSegmentId(), "one_time_test")) {
            selectedSegmentId = this.lastSelectedSubscriptionSegmentId;
            if (selectedSegmentId.length() == 0) {
                AdvancedLabsJoinModels response = c29147c.getResponse();
                if (response == null || (bottomStickyItems2 = response.getBottomStickyItems()) == null || (setKeySet = bottomStickyItems2.keySet()) == null) {
                    selectedSegmentId = "";
                } else {
                    Iterator<T> it = setKeySet.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (AbstractC22676k.m65745e((String) next, "one_time_test"));
                    String str = (String) next;
                    if (str == null) {
                        selectedSegmentId = "";
                    } else {
                        selectedSegmentId = str;
                    }
                }
            }
        } else {
            selectedSegmentId = c29147c.getSelectedSegmentId();
        }
        AdvancedLabsJoinModels response2 = c29147c.getResponse();
        if (response2 != null && (bottomStickyItems = response2.getBottomStickyItems()) != null && (advanceLabsJoinStickyModel = bottomStickyItems.get(c29147c.getSelectedSegmentId())) != null) {
            eVarM106733f = m106733f(advanceLabsJoinStickyModel, c29147c.getSelectedSegmentId(), selectedSegmentId);
        }
        C32445c.e eVar = eVarM106733f;
        AdvancedLabsJoinModels response3 = c29147c.getResponse();
        if (response3 == null || (sections = response3.getSections()) == null) {
            list = C25271y.f99162w;
        } else {
            List<AdvancedLabsJoinSectionModel> list2 = sections;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
            Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList.add(m106737k(c29147c, (AdvancedLabsJoinSectionModel) it3.next(), c29147c.getSelectedSegmentId(), selectedSegmentId));
            }
            list = arrayList;
        }
        AdvancedLabsJoinModels response4 = c29147c.getResponse();
        if (response4 == null || (toolBarTitle = response4.getToolBarTitle()) == null || (textResourceM21267a = AbstractC8693b.m21278l(toolBarTitle)) == null) {
            textResourceM21267a = AbstractC8693b.m21267a();
        }
        return new C32445c(aVar, null, new C32445c.d(textResourceM21267a, list, !c29147c.getManualRefresh() && c29147c.getDisplayRefreshingSpinner(), eVar, c29147c.getSelectedSegmentId(), c29147c.getSource()), 2, null);
    }

    /* JADX INFO: renamed from: i */
    public final C32445c m106741i(C29147c domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        if (!AbstractC22676k.m65745e(domainResult.getSelectedSegmentId(), "one_time_test")) {
            this.lastSelectedSubscriptionSegmentId = domainResult.getSelectedSegmentId();
        }
        InterfaceC29145a currentDialogType = domainResult.getCurrentDialogType();
        if (currentDialogType instanceof InterfaceC29145a.b) {
            return m106739m((InterfaceC29145a.b) domainResult.getCurrentDialogType(), domainResult.getSource(), domainResult.getSelectedSegmentId());
        }
        return currentDialogType instanceof InterfaceC29145a.e ? m106740n(domainResult, m106738l((InterfaceC29145a.e) domainResult.getCurrentDialogType())) : m106740n(domainResult, null);
    }

    public /* synthetic */ C33760a(C21535a c21535a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC33761b.f141276a : c21535a);
    }
}
