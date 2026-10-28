package oh1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.CountrySelectorModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.gifting.feature.gifting.domain.models.BottomStickyItemsModel;
import com.whoop.gifting.feature.gifting.domain.models.GiftingModels;
import com.whoop.gifting.feature.gifting.domain.models.GiftingSectionModel;
import com.whoop.gifting.feature.gifting.domain.models.GiftingSectionSpacingType;
import com.whoop.gifting.feature.gifting.domain.models.GiftingStickyModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import jb1.C21535a;
import kh1.C22482c;
import kh1.InterfaceC22480a;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import m83.C25272z;
import nh1.C26722c;
import nh1.C26723d;
import nh1.InterfaceC26720a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p736sz0.C33205o0;
import q31.C29943a;
import q31.C29948f;
import r51.C30938f;
import r51.C30939g;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: oh1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\r\u001a\u00020\f*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\f*\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J=\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0014*\u00020\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010 ¨\u0006!"}, m65681d2 = {"Loh1/a;", "", "Ljb1/a;", "reducer", "<init>", "(Ljb1/a;)V", "Lkh1/a$a;", "", "source", "giftType", "testCount", "selectedTier", "Lnh1/c;", "c", "(Lkh1/a$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnh1/c;", "Lkh1/c;", "Lnh1/c$c;", "dialog", "d", "(Lkh1/c;Lnh1/c$c;)Lnh1/c;", "", "Lcom/whoop/design/models/DesignSystemModel;", "models", "", "selectedQuantity", "selectedCountry", "Lm91/u;", "a", "(Lkh1/c;Ljava/util/List;ILjava/lang/String;)Ljava/util/List;", "domainResult", "b", "(Lkh1/c;)Lnh1/c;", "Ljb1/a;", "gifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27936a {

    /* JADX INFO: renamed from: b */
    public static final int f112654b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a reducer;

    public C27936a(C21535a reducer) {
        AbstractC22676k.m65750j(reducer, "reducer");
        this.reducer = reducer;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0071  */
    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX INFO: renamed from: a */
    private final List<InterfaceC25312u> m84286a(C22482c c22482c, List<? extends DesignSystemModel> list, int i13, String str) {
        C30939g selectedCountry;
        Object next;
        List<InterfaceC25312u> listM60540g = this.reducer.m60540g(list);
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM60540g, 10));
        for (Object objM91609b : listM60540g) {
            if (objM91609b instanceof C26723d) {
                objM91609b = C26723d.m79490b((C26723d) objM91609b, null, null, 0, 0, i13, 15, null);
            } else if (objM91609b instanceof C30938f) {
                if (str == null) {
                    selectedCountry = ((C30938f) objM91609b).getSelectedCountry();
                } else {
                    C30938f c30938f = (C30938f) objM91609b;
                    List<C30939g> listM95179f = c30938f.m95179f();
                    if (listM95179f != null) {
                        Iterator<T> it = listM95179f.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!AbstractC22676k.m65745e(((C30939g) next).getAlpha2(), str));
                        selectedCountry = (C30939g) next;
                        if (selectedCountry == null) {
                            selectedCountry = c30938f.getSelectedCountry();
                        }
                    } else {
                        selectedCountry = c30938f.getSelectedCountry();
                    }
                    if (selectedCountry == null) {
                        selectedCountry = ((C30938f) objM91609b).getSelectedCountry();
                    }
                }
                objM91609b = C30938f.m95175b((C30938f) objM91609b, null, null, selectedCountry, null, null, null, null, 123, null);
            } else if (objM91609b instanceof C29948f) {
                C29948f c29948f = (C29948f) objM91609b;
                Iterator<C29943a> it3 = c29948f.m91612e().iterator();
                int initiallySelectedSegmentIndex = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        initiallySelectedSegmentIndex = -1;
                        break;
                    }
                    if (AbstractC22676k.m65745e(it3.next().getId(), c22482c.getSelectedSegmentId())) {
                        break;
                    }
                    initiallySelectedSegmentIndex++;
                }
                if (initiallySelectedSegmentIndex < 0) {
                    initiallySelectedSegmentIndex = c29948f.getInitiallySelectedSegmentIndex();
                }
                objM91609b = C29948f.m91609b(c29948f, null, null, initiallySelectedSegmentIndex, null, false, 27, null);
            }
            arrayList.add(objM91609b);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    private final C26722c m84287c(InterfaceC22480a.a aVar, String str, String str2, String str3, String str4) {
        if (aVar instanceof InterfaceC22480a.b) {
            return new C26722c(null, new C26722c.b(C33205o0.f138451a.m105288b(), null, null, null, 14, null), null, 5, null);
        }
        if (aVar instanceof InterfaceC22480a.c) {
            return new C26722c(null, new C26722c.b(C33205o0.f138451a.m105289c(), new InterfaceC26720a.q(str, str2, str3, str4), null, InterfaceC26720a.j.f106236a, 4, null), null, 5, null);
        }
        if (aVar instanceof InterfaceC22480a.d) {
            return new C26722c(null, new C26722c.b(C33205o0.f138451a.m105291e(), new InterfaceC26720a.q(str, str2, str3, str4), null, InterfaceC26720a.j.f106236a, 4, null), null, 5, null);
        }
        if (aVar instanceof InterfaceC22480a.e) {
            return new C26722c(null, new C26722c.b(C33205o0.f138451a.m105293g(), null, null, null, 14, null), null, 5, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0042  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [m83.y] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX INFO: renamed from: d */
    private final C26722c m84288d(C22482c c22482c, C26722c.c cVar) {
        ?? r10;
        ?? r14;
        String text;
        C26722c.e eVar;
        List<DesignSystemModel> items;
        Map mapM84300k;
        C30938f c30938f;
        TextResource textResourceM21267a;
        List<GiftingSectionModel> sections;
        GiftingSectionSpacingType giftingSectionSpacingType;
        String toolBarTitle;
        CountrySelectorModel countrySelector;
        Map<String, GiftingStickyModel> bottomStickyItems;
        GiftingModels response = c22482c.getResponse();
        BottomStickyItemsModel bottomCommonStickyItems = response != null ? response.getBottomCommonStickyItems() : null;
        GiftingModels response2 = c22482c.getResponse();
        GiftingStickyModel giftingStickyModel = (response2 == null || (bottomStickyItems = response2.getBottomStickyItems()) == null) ? null : bottomStickyItems.get(c22482c.getSelectedSegmentId());
        ?? arrayList = C25271y.f99162w;
        if (bottomCommonStickyItems == null && giftingStickyModel == null) {
            eVar = null;
        } else {
            if (bottomCommonStickyItems == null || (items = bottomCommonStickyItems.getItems()) == null) {
                r10 = items;
                r10 = arrayList;
            }
            if (giftingStickyModel != null) {
                List<DesignSystemModel> items2 = giftingStickyModel.getItems();
                r14 = items2;
                if (items2 == null) {
                    r14 = arrayList;
                }
            } else {
                r14 = arrayList;
            }
            ArrayList arrayListM74129g1 = AbstractC25265s.m74129g1((Collection) r10, (Iterable) r14);
            if (giftingStickyModel == null || (text = giftingStickyModel.getText()) == null) {
                text = bottomCommonStickyItems != null ? bottomCommonStickyItems.getText() : null;
            }
            eVar = new C26722c.e(text, m84286a(c22482c, arrayListM74129g1, c22482c.getSelectedQuantity(), c22482c.getSelectedCountry()));
        }
        GiftingModels response3 = c22482c.getResponse();
        if (response3 == null || (mapM84300k = AbstractC27937b.m84300k(response3)) == null) {
            mapM84300k = C25272z.f99163w;
        }
        Map map = mapM84300k;
        GiftingModels response4 = c22482c.getResponse();
        if (response4 == null || (countrySelector = response4.getCountrySelector()) == null) {
            c30938f = null;
        } else {
            List<InterfaceC25312u> listM84286a = m84286a(c22482c, AbstractC37056f.m118958J(countrySelector), c22482c.getSelectedQuantity(), c22482c.getSelectedCountry());
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listM84286a) {
                if (obj instanceof C30938f) {
                    arrayList2.add(obj);
                }
            }
            c30938f = (C30938f) AbstractC25265s.m74100H0(arrayList2);
        }
        GiftingModels response5 = c22482c.getResponse();
        if (response5 == null || (toolBarTitle = response5.getToolBarTitle()) == null || (textResourceM21267a = AbstractC8693b.m21278l(toolBarTitle)) == null) {
            textResourceM21267a = AbstractC8693b.m21267a();
        }
        TextResource textResource = textResourceM21267a;
        GiftingModels response6 = c22482c.getResponse();
        boolean z4 = false;
        if (response6 != null && (sections = response6.getSections()) != null) {
            List<GiftingSectionModel> list = sections;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            for (GiftingSectionModel giftingSectionModel : list) {
                String sectionType = giftingSectionModel.getSectionType();
                if (sectionType == null) {
                    sectionType = "";
                }
                String upperCase = sectionType.toUpperCase(Locale.ROOT);
                AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                GiftingSectionSpacingType giftingSectionSpacingType2 = GiftingSectionSpacingType.COMPACT;
                GiftingSectionSpacingType[] giftingSectionSpacingTypeArrValues = GiftingSectionSpacingType.values();
                int length = giftingSectionSpacingTypeArrValues.length;
                int i13 = 0;
                while (true) {
                    if (i13 >= length) {
                        giftingSectionSpacingType = null;
                        break;
                    }
                    giftingSectionSpacingType = giftingSectionSpacingTypeArrValues[i13];
                    if (AbstractC22676k.m65745e(giftingSectionSpacingType.name(), upperCase)) {
                        break;
                    }
                    i13++;
                }
                if (giftingSectionSpacingType != null) {
                    giftingSectionSpacingType2 = giftingSectionSpacingType;
                }
                arrayList.add(new C26722c.a(m84286a(c22482c, giftingSectionModel.getItems(), c22482c.getSelectedQuantity(), c22482c.getSelectedCountry()), giftingSectionSpacingType2));
            }
        }
        ?? r15 = arrayList;
        String selectedSegmentId = c22482c.getSelectedSegmentId();
        int selectedQuantity = c22482c.getSelectedQuantity();
        if (!c22482c.getManualRefresh() && c22482c.getDisplayRefreshingSpinner()) {
            z4 = true;
        }
        return new C26722c(cVar, null, new C26722c.d(textResource, r15, z4, eVar, selectedSegmentId, selectedQuantity, c30938f, map), 2, null);
    }

    /* JADX INFO: renamed from: b */
    public final C26722c m84289b(C22482c domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        return domainResult.getCurrentDialogType() instanceof InterfaceC22480a.a ? m84287c((InterfaceC22480a.a) domainResult.getCurrentDialogType(), domainResult.getSource(), domainResult.getGiftType(), domainResult.getTestCount(), domainResult.getSelectedTier()) : m84288d(domainResult, null);
    }

    public /* synthetic */ C27936a(C21535a c21535a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC27937b.f112656a : c21535a);
    }
}
