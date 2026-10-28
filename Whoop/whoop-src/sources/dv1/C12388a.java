package dv1;

import b30.C2663y4;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.TimerMetaDataModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.limitedtimeoffer.domain.models.LimitedTimeOfferModels;
import com.whoop.limitedtimeoffer.domain.models.LimitedTimeOfferSectionModel;
import com.whoop.limitedtimeoffer.domain.models.LimitedTimeOfferSectionSpacingType;
import com.whoop.limitedtimeoffer.domain.models.LtoStickyModel;
import com.whoop.limitedtimeoffer.domain.models.TimerPillModel;
import cv1.C11146c;
import cv1.C11147d;
import cv1.InterfaceC11144a;
import do0.C12229c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import m83.AbstractC25267u;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p716lb1.AbstractC23607c5;
import p716lb1.C23749z0;
import p720m91.InterfaceC25312u;
import p736sz0.C33205o0;
import q31.C29943a;
import q31.C29948f;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;
import zu1.C41150c;
import zu1.InterfaceC41148a;

/* JADX INFO: renamed from: dv1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\r*\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001c\u001a\u0004\u0018\u00010\u001a*\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, m65681d2 = {"Ldv1/a;", "", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Ljb1/a;", "reducer", "<init>", "(Lcom/whoop/data/repositories/FeatureFlagChecker;Ljb1/a;)V", "", "selectedSegmentId", "d", "(Ljava/lang/String;)Ljb1/a;", "Lzu1/a$a;", "Lcv1/c;", "k", "(Lzu1/a$a;)Lcv1/c;", "Lzu1/c;", "Lcv1/c$c;", "dialog", "l", "(Lzu1/c;Lcv1/c$c;)Lcv1/c;", "spacing", "Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferSectionSpacingType;", "i", "(Ljava/lang/String;)Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferSectionSpacingType;", "", "Lcom/whoop/limitedtimeoffer/domain/models/LtoStickyModel;", "selectedCardId", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/util/Map;Ljava/lang/String;)Lcom/whoop/limitedtimeoffer/domain/models/LtoStickyModel;", "domainResult", "j", "(Lzu1/c;)Lcv1/c;", "a", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "b", "Ljb1/a;", "limited-time-offer_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12388a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C21535a reducer;

    /* JADX INFO: renamed from: dv1.a$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ String f41896w;

        public a(String str) {
            this.f41896w = str;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(InterfaceC25312u it) {
            AbstractC22676k.m65750j(it, "it");
            C29948f c29948f = (C29948f) it;
            Iterator<C29943a> it3 = c29948f.m91612e().iterator();
            int initiallySelectedSegmentIndex = 0;
            while (true) {
                if (!it3.hasNext()) {
                    initiallySelectedSegmentIndex = -1;
                    break;
                }
                if (AbstractC22676k.m65745e(it3.next().getId(), this.f41896w)) {
                    break;
                }
                initiallySelectedSegmentIndex++;
            }
            if (initiallySelectedSegmentIndex < 0) {
                initiallySelectedSegmentIndex = c29948f.getInitiallySelectedSegmentIndex();
            }
            return C29948f.m91609b(c29948f, null, null, initiallySelectedSegmentIndex, null, false, 27, null);
        }
    }

    /* JADX INFO: renamed from: dv1.a$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f41897w;

        public b(Function1 function1) {
            this.f41897w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f41897w.invoke((TimerPillModel) it);
        }
    }

    public C12388a(FeatureFlagChecker featureFlagChecker, C21535a reducer) {
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(reducer, "reducer");
        this.featureFlagChecker = featureFlagChecker;
        this.reducer = reducer;
    }

    /* JADX INFO: renamed from: d */
    private final C21535a m34774d(String selectedSegmentId) {
        return AbstractC21537c.m60554d(new C2663y4(selectedSegmentId, 15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m34775e(String str, C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C12229c(3));
        designItemReducer.m60546a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29948f.class), new a(str));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m34776f(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        addModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(TimerPillModel.class), new b(new C12229c(4)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C11147d m34777g(TimerPillModel model) {
        AbstractC22676k.m65750j(model, "model");
        String id4 = model.getId();
        String pillIcon = model.getPillIcon();
        String pillTitle = model.getPillTitle();
        DesignSystemModel timerMetadata = model.getTimerMetadata();
        TimerMetaDataModel timerMetaDataModel = timerMetadata instanceof TimerMetaDataModel ? (TimerMetaDataModel) timerMetadata : null;
        return new C11147d(id4, pillIcon, pillTitle, timerMetaDataModel != null ? AbstractC23607c5.m68611j(timerMetaDataModel) : null, null, 16, null);
    }

    /* JADX INFO: renamed from: h */
    private final LtoStickyModel m34778h(Map<String, LtoStickyModel> map, String str) {
        if (AbstractC39414r.m125890i0(str) || str.equalsIgnoreCase("null")) {
            str = "";
        }
        if (str.length() == 0) {
            return map.get("");
        }
        LtoStickyModel ltoStickyModel = map.get(str);
        if (ltoStickyModel != null) {
            return ltoStickyModel;
        }
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        LtoStickyModel ltoStickyModel2 = map.get(lowerCase);
        if (ltoStickyModel2 != null) {
            return ltoStickyModel2;
        }
        LtoStickyModel ltoStickyModel3 = map.get(AbstractC39421y.m125926K(str, "_", "", false));
        if (ltoStickyModel3 != null) {
            return ltoStickyModel3;
        }
        Pattern patternCompile = Pattern.compile("(.)([A-Z])");
        AbstractC22676k.m65749i(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(str).replaceAll("$1_$2");
        AbstractC22676k.m65749i(strReplaceAll, "replaceAll(...)");
        String lowerCase2 = strReplaceAll.toLowerCase(locale);
        AbstractC22676k.m65749i(lowerCase2, "toLowerCase(...)");
        return map.get(lowerCase2);
    }

    /* JADX INFO: renamed from: i */
    private final LimitedTimeOfferSectionSpacingType m34779i(String spacing) {
        String upperCase = spacing.toUpperCase(Locale.ROOT);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        if (upperCase.equals("NORMAL")) {
            return LimitedTimeOfferSectionSpacingType.NORMAL;
        }
        return upperCase.equals("COMPACT") ? LimitedTimeOfferSectionSpacingType.COMPACT : LimitedTimeOfferSectionSpacingType.COMPACT;
    }

    /* JADX INFO: renamed from: k */
    private final C11146c m34780k(InterfaceC41148a.a aVar) {
        if (aVar instanceof InterfaceC41148a.b) {
            return new C11146c(null, new C11146c.b(C33205o0.f138451a.m105288b(), null, null, null, 14, null), null, 5, null);
        }
        if (aVar instanceof InterfaceC41148a.c) {
            InterfaceC41148a.c cVar = (InterfaceC41148a.c) aVar;
            return new C11146c(null, new C11146c.b(C33205o0.f138451a.m105289c(), new InterfaceC11144a.j(cVar.getOfferId(), cVar.getSource()), null, InterfaceC11144a.e.f35605a, 4, null), null, 5, null);
        }
        if (!(aVar instanceof InterfaceC41148a.d)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC41148a.d dVar = (InterfaceC41148a.d) aVar;
        return new C11146c(null, new C11146c.b(C33205o0.f138451a.m105291e(), new InterfaceC11144a.j(dVar.getOfferId(), dVar.getSource()), null, InterfaceC11144a.e.f35605a, 4, null), null, 5, null);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0072  */
    /* JADX WARN: Code duplicated, block: B:69:0x0106  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [m83.y] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.List] */
    /* JADX INFO: renamed from: l */
    private final C11146c m34781l(C41150c c41150c, C11146c.c cVar) {
        AbstractC22403o cVar2;
        String str;
        boolean z4;
        TextResource textResourceM21267a;
        ?? arrayList;
        List<LimitedTimeOfferSectionModel> sections;
        LimitedTimeOfferSectionSpacingType limitedTimeOfferSectionSpacingTypeM34779i;
        String toolBarTitle;
        LimitedTimeOfferModels response;
        Map<String, LtoStickyModel> bottomStickyItems;
        Collection<LtoStickyModel> collectionValues;
        Object next;
        LimitedTimeOfferModels response2;
        String backgroundImageUrl;
        String imageUrl;
        Map<String, LtoStickyModel> bottomStickyItems2;
        boolean zIsFeatureEnabled = this.featureFlagChecker.isFeatureEnabled("lto-plan-picker-ui-and-analytics-android");
        C21535a c21535aM34774d = m34774d(c41150c.getSelectedCardId());
        LimitedTimeOfferModels response3 = c41150c.getResponse();
        C11146c.e eVar = null;
        LtoStickyModel ltoStickyModelM34778h = (response3 == null || (bottomStickyItems2 = response3.getBottomStickyItems()) == null) ? null : m34778h(bottomStickyItems2, c41150c.getSelectedCardId());
        LimitedTimeOfferModels response4 = c41150c.getResponse();
        AbstractC22403o cVar3 = (response4 == null || (imageUrl = response4.getImageUrl()) == null) ? AbstractC22403o.b.f87641b : new AbstractC22403o.c(imageUrl, 0, 0, 0, 14, null);
        if (!zIsFeatureEnabled || AbstractC22404p.m64497f(cVar3) || (response2 = c41150c.getResponse()) == null || (backgroundImageUrl = response2.getBackgroundImageUrl()) == null) {
            cVar2 = AbstractC22403o.b.f87641b;
        } else {
            String str2 = !AbstractC39414r.m125890i0(backgroundImageUrl) ? backgroundImageUrl : null;
            if (str2 != null) {
                cVar2 = new AbstractC22403o.c(str2, 0, 0, 0, 14, null);
            } else {
                cVar2 = AbstractC22403o.b.f87641b;
            }
        }
        AbstractC22403o abstractC22403o = cVar2;
        if (!zIsFeatureEnabled || (response = c41150c.getResponse()) == null || (bottomStickyItems = response.getBottomStickyItems()) == null || (collectionValues = bottomStickyItems.values()) == null) {
            str = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                String text = ((LtoStickyModel) it.next()).getText();
                if (text != null) {
                    arrayList2.add(text);
                }
            }
            Iterator it3 = arrayList2.iterator();
            if (it3.hasNext()) {
                next = it3.next();
                if (it3.hasNext()) {
                    int length = ((String) next).length();
                    do {
                        Object next2 = it3.next();
                        int length2 = ((String) next2).length();
                        if (length < length2) {
                            next = next2;
                            length = length2;
                        }
                    } while (it3.hasNext());
                }
            } else {
                next = null;
            }
            str = (String) next;
        }
        if (zIsFeatureEnabled) {
            if (!AbstractC39414r.m125890i0(c41150c.getSelectedCardId())) {
                String text2 = ltoStickyModelM34778h != null ? ltoStickyModelM34778h.getText() : null;
                if (text2 != null && !AbstractC39414r.m125890i0(text2)) {
                    z4 = true;
                }
            }
            z4 = false;
        } else {
            String text3 = ltoStickyModelM34778h != null ? ltoStickyModelM34778h.getText() : null;
            if (text3 == null || AbstractC39414r.m125890i0(text3)) {
                z4 = false;
            } else {
                z4 = true;
            }
        }
        if (ltoStickyModelM34778h != null) {
            String text4 = ltoStickyModelM34778h.getText();
            List<InterfaceC25312u> listM60540g = c21535aM34774d.m60540g(ltoStickyModelM34778h.getItems());
            Boolean shouldDismissTile = ltoStickyModelM34778h.getShouldDismissTile();
            eVar = new C11146c.e(text4, listM60540g, shouldDismissTile != null ? shouldDismissTile.booleanValue() : false);
        }
        C11146c.e eVar2 = eVar;
        LimitedTimeOfferModels response5 = c41150c.getResponse();
        if (response5 == null || (toolBarTitle = response5.getToolBarTitle()) == null || (textResourceM21267a = AbstractC8693b.m21278l(toolBarTitle)) == null) {
            textResourceM21267a = AbstractC8693b.m21267a();
        }
        TextResource textResource = textResourceM21267a;
        LimitedTimeOfferModels response6 = c41150c.getResponse();
        if (response6 == null || (sections = response6.getSections()) == null) {
            arrayList = C25271y.f99162w;
        } else {
            List<LimitedTimeOfferSectionModel> list = sections;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            for (LimitedTimeOfferSectionModel limitedTimeOfferSectionModel : list) {
                String sectionType = limitedTimeOfferSectionModel.getSectionType();
                if (sectionType == null || (limitedTimeOfferSectionSpacingTypeM34779i = m34779i(sectionType)) == null) {
                    limitedTimeOfferSectionSpacingTypeM34779i = LimitedTimeOfferSectionSpacingType.COMPACT;
                }
                arrayList.add(new C11146c.a(c21535aM34774d.m60540g(limitedTimeOfferSectionModel.getItems()), limitedTimeOfferSectionSpacingTypeM34779i));
            }
        }
        return new C11146c(cVar, null, new C11146c.d(textResource, arrayList, !c41150c.getManualRefresh() && c41150c.getDisplayRefreshingSpinner(), eVar2, c41150c.getSelectedCardId(), c41150c.getSource(), c41150c.getOfferId(), cVar3, abstractC22403o, str, z4), 2, null);
    }

    /* JADX INFO: renamed from: j */
    public final C11146c m34782j(C41150c domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        return domainResult.getCurrentDialogType() instanceof InterfaceC41148a.a ? m34780k((InterfaceC41148a.a) domainResult.getCurrentDialogType()) : m34781l(domainResult, null);
    }

    public /* synthetic */ C12388a(FeatureFlagChecker featureFlagChecker, C21535a c21535a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(featureFlagChecker, (i13 & 2) != 0 ? AbstractC12389b.f41898a : c21535a);
    }
}
