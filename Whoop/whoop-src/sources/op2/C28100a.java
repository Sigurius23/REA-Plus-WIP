package op2;

import androidx.core.app.NotificationCompat;
import c41.AbstractC4076n0;
import c41.C4069m0;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.universalcheckout.features.shippingaddress.domain.models.DropdownLookup;
import com.whoop.universalcheckout.features.shippingaddress.domain.models.ShippingAddressField;
import com.whoop.universalcheckout.features.shippingaddress.domain.models.ShippingAddressModels;
import i91.AbstractC18249c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j11.EnumC21213p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import jb1.C21535a;
import jp2.C21874e;
import jp2.C21884o;
import kd1.EnumC22400l;
import kp2.AbstractC22764g;
import kp2.C22760c;
import kp2.C22761d;
import kp2.C22765h;
import kp2.InterfaceC22758a;
import l83.C23465k;
import ln2.AbstractC24541a;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25235a0;
import m83.C25271y;
import mn2.EnumC25719b;
import no.nordicsemi.android.dfu.DfuBaseService;
import np2.C27036c;
import np2.InterfaceC27034a;
import ny0.C27256h;
import ny0.EnumC27254g;
import ny0.EnumC27272p;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33208p0;
import p736sz0.C33205o0;
import p736sz0.C33211q0;
import p745y81.EnumC39333f;
import uv0.AbstractC35283c;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: op2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\b*\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001d\u001a\u00020\u001c*\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010 \u001a\u00020\b*\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b \u0010!J#\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\"2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020'2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b*\u0010+J1\u00100\u001a\u00020)2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00120,2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120.H\u0002¢\u0006\u0004\b0\u00101J\u001f\u00102\u001a\u00020#2\u0006\u0010(\u001a\u00020'2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b2\u00103J\u001f\u00104\u001a\u00020)2\u0006\u0010(\u001a\u00020'2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b4\u0010+J\u001f\u00105\u001a\u00020)2\u0006\u0010(\u001a\u00020'2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b5\u0010+J\u001b\u00107\u001a\u000206*\u00020'2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b7\u00108J!\u00109\u001a\b\u0012\u0004\u0012\u00020\u001c0\"*\u00020'2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b9\u0010:J'\u0010>\u001a\u0004\u0018\u00010\u0012*\u00020\u00062\u0006\u0010;\u001a\u00020\u00122\b\u0010=\u001a\u0004\u0018\u00010<H\u0002¢\u0006\u0004\b>\u0010?J\u0015\u0010A\u001a\u00020\b2\u0006\u0010@\u001a\u00020\u0006¢\u0006\u0004\bA\u0010\nJ=\u0010E\u001a\u0002062\u0006\u0010B\u001a\u0002062\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120.2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020C0.¢\u0006\u0004\bE\u0010FR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010G¨\u0006H"}, m65681d2 = {"Lop2/a;", "", "Ljb1/a;", "reducer", "<init>", "(Ljb1/a;)V", "Lkp2/c;", "domainState", "Lnp2/c;", "c", "(Lkp2/c;)Lnp2/c;", "Lkp2/a$c;", "o", "(Lkp2/a$c;)Lnp2/c;", "Lkp2/a$f;", "Lnp2/c$f;", "n", "(Lkp2/a$f;)Lnp2/c$f;", "", "source", "Ll83/k;", "Lcom/whoop/design/util/TextResource;", "f", "(Ljava/lang/String;)Ll83/k;", "Lnp2/c$a;", "d", "(Lkp2/c;)Lnp2/c$a;", "Lkp2/h;", "Lnp2/c$e;", "r", "(Lkp2/h;)Lnp2/c$e;", "Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressModels;", "q", "(Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressModels;Lkp2/c;)Lnp2/c;", "", "Lnp2/c$b;", "items", "i", "(Ljava/util/List;)Ljava/util/List;", "Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;", "field", "", "l", "(Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;Lkp2/c;)Z", "", "requiredFields", "", "userInput", "b", "(Ljava/util/Set;Ljava/util/Map;)Z", "e", "(Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;Lkp2/c;)Lnp2/c$b;", "m", "k", "Lm91/u;", "p", "(Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;Lkp2/c;)Lm91/u;", "g", "(Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;Lkp2/c;)Ljava/util/List;", "dropdownKey", "Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/DropdownLookup;", "lookup", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lkp2/c;Ljava/lang/String;Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/DropdownLookup;)Ljava/lang/String;", "domainResult", "j", "itemViewState", "Lop2/c;", "validationState", "a", "(Lm91/u;Ljava/util/Map;Ljava/util/Map;)Lm91/u;", "Ljb1/a;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28100a {

    /* JADX INFO: renamed from: b */
    public static final int f113652b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a reducer;

    /* JADX INFO: renamed from: op2.a$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f113654a;

        static {
            int[] iArr = new int[EnumC25719b.values().length];
            try {
                iArr[EnumC25719b.JOIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC25719b.GIFTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC25719b.SHOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC25719b.DEVICE_UPSELL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC25719b.CART_SCREEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC25719b.IAJF_PREPAIDS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC25719b.IAJF_TRIALS_AA_UPSELL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f113654a = iArr;
        }
    }

    public C28100a(C21535a reducer) {
        AbstractC22676k.m65750j(reducer, "reducer");
        this.reducer = reducer;
    }

    /* JADX INFO: renamed from: b */
    private final boolean m84917b(Set<String> requiredFields, Map<String, String> userInput) {
        Set<String> set = requiredFields;
        if ((set instanceof Collection) && set.isEmpty()) {
            return true;
        }
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            String strM65963a = AbstractC22764g.m65963a(userInput, (String) it.next());
            if (strM65963a == null || AbstractC39414r.m125890i0(strM65963a)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    private final C27036c m84918c(C22760c domainState) {
        C27036c c27036cM84931q;
        ShippingAddressModels response = domainState.getResponse();
        C27036c c27036c = (response == null || (c27036cM84931q = m84931q(response, domainState)) == null) ? new C27036c(null, null, null, null, 15, null) : c27036cM84931q;
        C27036c.d screenContent = c27036c.getScreenContent();
        C27036c.d dVarM81132b = null;
        if (screenContent != null) {
            Map<String, TextResource> mapM65927o = domainState.m65927o();
            LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC25247g0.m73988W(mapM65927o.size()));
            Iterator<T> it = mapM65927o.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), new C28102c(true, (TextResource) entry.getValue()));
            }
            List<C27036c.b> listM81135d = screenContent.m81135d();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM81135d, 10));
            for (C27036c.b bVar : listM81135d) {
                List<InterfaceC25312u> listM81125b = bVar.m81125b();
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM81125b, 10));
                Iterator<T> it3 = listM81125b.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(m84933a((InterfaceC25312u) it3.next(), domainState.m65926n(), linkedHashMap));
                }
                arrayList.add(bVar.m81124a(arrayList2));
            }
            if (domainState.getBackendErrorMessage() != null) {
                arrayList = AbstractC25265s.m74129g1(AbstractC37056f.m118958J(new C27036c.b(AbstractC37056f.m118958J(new C4069m0(AbstractC8693b.m21278l(domainState.getBackendErrorMessage()), null, new AbstractC4076n0.e(null, 1, null), EnumC22400l.UNKNOWN, null, null, null, 112, null)))), arrayList);
            }
            dVarM81132b = C27036c.d.m81132b(screenContent, null, arrayList, false, null, 13, null);
        }
        return C27036c.m81114c(c27036c, null, null, dVarM81132b, m84919d(domainState), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [m83.y] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
    /* JADX INFO: renamed from: d */
    private final C27036c.a m84919d(C22760c domainState) {
        ?? arrayList;
        if (domainState.getBottomSheetFieldType() == null) {
            return null;
        }
        String bottomSheetFieldType = domainState.getBottomSheetFieldType();
        String bottomSheetTitle = domainState.getBottomSheetTitle();
        if (bottomSheetTitle == null) {
            bottomSheetTitle = "";
        }
        String str = bottomSheetTitle;
        List<C22765h> listM65918f = domainState.m65918f();
        if (listM65918f != null) {
            List<C22765h> list = listM65918f;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(m84932r((C22765h) it.next()));
            }
        } else {
            arrayList = C25271y.f99162w;
        }
        return new C27036c.a(bottomSheetFieldType, str, arrayList, domainState.getBottomSheetSelectedValue(), "", domainState.getBottomSheetOpenTimestamp());
    }

    /* JADX INFO: renamed from: e */
    private final C27036c.b m84920e(ShippingAddressField field, C22760c domainState) {
        String lowerCase = field.getType().toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        String strConcat = lowerCase.concat("_other_input");
        String strM65963a = AbstractC22764g.m65963a(domainState.m65926n(), strConcat);
        TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC24541a.f95793y, null, 2, null);
        TextResource textResourceM21278l = strM65963a != null ? AbstractC8693b.m21278l(strM65963a) : null;
        TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC24541a.f95793y, null, 2, null);
        Boolean boolIsRequired = field.isRequired();
        return new C27036c.b(AbstractC37056f.m118958J(new C21884o(strConcat, 1, c8688b, textResourceM21278l, c8688b2, false, null, boolIsRequired != null ? boolIsRequired.booleanValue() : false, field.getMinLength(), field.getMaxLength(), field.getPattern(), false, null, domainState.getSource(), lowerCase, 32, null)));
    }

    /* JADX INFO: renamed from: f */
    private final C23465k m84921f(String source) {
        switch (a.f113654a[EnumC25719b.INSTANCE.m75836a(source).ordinal()]) {
            case 1:
                return new C23465k(AbstractC8693b.m21277k(AbstractC24541a.f95787s), AbstractC8693b.m21277k(AbstractC24541a.f95785q));
            case 2:
                return new C23465k(AbstractC8693b.m21277k(AbstractC24541a.f95784p), AbstractC8693b.m21277k(AbstractC24541a.f95783o));
            case 3:
                return new C23465k(AbstractC8693b.m21277k(AbstractC24541a.f95787s), AbstractC8693b.m21277k(AbstractC24541a.f95786r));
            case 4:
                return new C23465k(AbstractC8693b.m21277k(AbstractC24541a.f95782n), AbstractC8693b.m21277k(AbstractC24541a.f95781m));
            case 5:
            case 6:
            case 7:
                return new C23465k(AbstractC8693b.m21277k(AbstractC24541a.f95780l), AbstractC8693b.m21277k(AbstractC24541a.f95779k));
            default:
                return new C23465k(AbstractC8693b.m21277k(AbstractC24541a.f95787s), AbstractC8693b.m21277k(AbstractC24541a.f95785q));
        }
    }

    /* JADX INFO: renamed from: g */
    private final List<C27036c.e> m84922g(ShippingAddressField shippingAddressField, C22760c c22760c) {
        DropdownLookup dropdownLookup = shippingAddressField.getDropdownLookup();
        List listM74164j0 = C25271y.f99162w;
        if (dropdownLookup != null) {
            String lowerCase = shippingAddressField.getType().toLowerCase(Locale.ROOT);
            AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
            if (lowerCase.equals("country") || AbstractC39421y.m125921F(dropdownLookup.getDropdownKey(), lowerCase, true)) {
                listM74164j0 = AbstractC25267u.m74164j0(dropdownLookup.getDropdownValues().values());
            } else {
                String strM84923h = m84923h(c22760c, dropdownLookup.getDropdownKey(), dropdownLookup);
                if (strM84923h != null) {
                    if (AbstractC22764g.m65964b(strM84923h)) {
                        strM84923h = null;
                    }
                    if (strM84923h != null) {
                        List list = dropdownLookup.getDropdownValues().get(strM84923h);
                        if (list != null) {
                            listM74164j0 = list;
                        }
                    }
                }
            }
            List<String> list2 = listM74164j0;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
            for (String str : list2) {
                arrayList.add(new C27036c.e(str, str, str, AbstractC22676k.m65745e(str, shippingAddressField.getPrefillText())));
            }
            return arrayList;
        }
        return listM74164j0;
    }

    /* JADX INFO: renamed from: h */
    private final String m84923h(C22760c c22760c, String str, DropdownLookup dropdownLookup) {
        Set<String> setKeySet;
        List<ShippingAddressField> fields;
        Object next;
        String prefillText;
        ShippingAddressModels response;
        String countryCode;
        Map<String, List<String>> dropdownValues;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        if (dropdownLookup == null || (dropdownValues = dropdownLookup.getDropdownValues()) == null || (setKeySet = dropdownValues.keySet()) == null) {
            setKeySet = C25235a0.f99113w;
        }
        String strM65963a = AbstractC22764g.m65963a(c22760c.m65926n(), lowerCase);
        if (strM65963a == null || AbstractC39414r.m125890i0(strM65963a) || (!setKeySet.isEmpty() && !setKeySet.contains(strM65963a))) {
            if (lowerCase.equals("country") && (response = c22760c.getResponse()) != null && (countryCode = response.getCountryCode()) != null) {
                if (AbstractC39414r.m125890i0(countryCode)) {
                    countryCode = null;
                }
                if (countryCode != null && (setKeySet.isEmpty() || setKeySet.contains(countryCode))) {
                    return countryCode;
                }
            }
            ShippingAddressModels response2 = c22760c.getResponse();
            if (response2 != null && (fields = response2.getFields()) != null) {
                Iterator<T> it = fields.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!AbstractC39421y.m125921F(((ShippingAddressField) next).getType(), str, true));
                ShippingAddressField shippingAddressField = (ShippingAddressField) next;
                if (shippingAddressField != null && (prefillText = shippingAddressField.getPrefillText()) != null) {
                    String str2 = AbstractC39414r.m125890i0(prefillText) ? null : prefillText;
                    if (str2 != null && (setKeySet.isEmpty() || setKeySet.contains(str2))) {
                        return str2;
                    }
                }
            }
            if (setKeySet.size() == 1 && lowerCase.equals("country")) {
                return (String) AbstractC25265s.m74094E0(setKeySet);
            }
        }
        return strM65963a;
    }

    /* JADX INFO: renamed from: i */
    private final List<C27036c.b> m84924i(List<C27036c.b> items) {
        int iNextIndex;
        ListIterator<C27036c.b> listIterator = items.listIterator(items.size());
        loop0: while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            List<InterfaceC25312u> listM81125b = listIterator.previous().m81125b();
            if (!(listM81125b instanceof Collection) || !listM81125b.isEmpty()) {
                Iterator<T> it = listM81125b.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC25312u) it.next()) instanceof C21884o) {
                        iNextIndex = listIterator.nextIndex();
                        break loop0;
                    }
                }
            }
        }
        if (iNextIndex == -1) {
            return items;
        }
        List<C27036c.b> list = items;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        int i13 = 0;
        for (Object obj : list) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            C27036c.b bVarM81124a = (C27036c.b) obj;
            if (i13 == iNextIndex) {
                List<InterfaceC25312u> listM81125b2 = bVarM81124a.m81125b();
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM81125b2, 10));
                for (Object objM62090a : listM81125b2) {
                    if (objM62090a instanceof C21884o) {
                        C21884o c21884o = (C21884o) objM62090a;
                        objM62090a = c21884o.m62090a((32735 & 1) != 0 ? c21884o.fieldId : null, (32735 & 2) != 0 ? c21884o.keyboardType : 0, (32735 & 4) != 0 ? c21884o.displayLabel : null, (32735 & 8) != 0 ? c21884o.currentText : null, (32735 & 16) != 0 ? c21884o.placeholder : null, (32735 & 32) != 0 ? c21884o.isLastTextField : true, (32735 & 64) != 0 ? c21884o.errorMessage : null, (32735 & 128) != 0 ? c21884o.isRequired : false, (32735 & 256) != 0 ? c21884o.minLength : null, (32735 & 512) != 0 ? c21884o.maxLength : null, (32735 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c21884o.pattern : null, (32735 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c21884o.isReadOnly : false, (32735 & 4096) != 0 ? c21884o.autoFillType : null, (32735 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c21884o.source : null, (32735 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c21884o.otherDropdownKey : null);
                    }
                    arrayList2.add(objM62090a);
                }
                bVarM81124a = bVarM81124a.m81124a(arrayList2);
            }
            arrayList.add(bVarM81124a);
            i13 = i14;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k */
    private final boolean m84925k(ShippingAddressField field, C22760c domainState) {
        String upperCase;
        DropdownLookup dropdownLookup;
        String fieldType = field.getFieldType();
        if (fieldType != null) {
            upperCase = fieldType.toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        } else {
            upperCase = null;
        }
        if (AbstractC22676k.m65745e(upperCase, ShippingAddressField.DROPDOWN_FIELD_TYPE) && (dropdownLookup = field.getDropdownLookup()) != null) {
            String lowerCase = dropdownLookup.getDropdownKey().toLowerCase(Locale.ROOT);
            AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
            if (AbstractC22764g.m65964b(AbstractC22764g.m65963a(domainState.m65926n(), lowerCase))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    private final boolean m84926l(ShippingAddressField field, C22760c domainState) {
        DropdownLookup dropdownLookup = field.getDropdownLookup();
        if (dropdownLookup == null) {
            return true;
        }
        String lowerCase = field.getType().toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        if (lowerCase.equals("country")) {
            return true;
        }
        String strM84923h = m84923h(domainState, dropdownLookup.getDropdownKey(), dropdownLookup);
        return !(strM84923h == null || AbstractC39414r.m125890i0(strM84923h));
    }

    /* JADX INFO: renamed from: m */
    private final boolean m84927m(ShippingAddressField field, C22760c domainState) {
        String upperCase;
        String fieldType = field.getFieldType();
        if (fieldType != null) {
            upperCase = fieldType.toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        } else {
            upperCase = null;
        }
        if (!AbstractC22676k.m65745e(upperCase, ShippingAddressField.DROPDOWN_FIELD_TYPE)) {
            return false;
        }
        String lowerCase = field.getType().toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        return AbstractC22764g.m65964b(AbstractC22764g.m65963a(domainState.m65926n(), lowerCase));
    }

    /* JADX INFO: renamed from: n */
    private final C27036c.f m84928n(InterfaceC22758a.f fVar) {
        if (!(fVar instanceof InterfaceC22758a.a)) {
            return null;
        }
        InterfaceC22758a.a aVar = (InterfaceC22758a.a) fVar;
        C23465k c23465kM84921f = m84921f(aVar.getSource());
        TextResource textResource = (TextResource) c23465kM84921f.f92937w;
        TextResource textResource2 = (TextResource) c23465kM84921f.f92938x;
        TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC35283c.f150169G);
        EnumC21213p enumC21213p = EnumC21213p.MARGIN;
        InterfaceC27034a.h hVar = InterfaceC27034a.h.f107844a;
        return new C27036c.f(textResource, c8688bM21277k, null, null, textResource2, true, true, enumC21213p, aVar, hVar, hVar, 4, null);
    }

    /* JADX INFO: renamed from: o */
    private final C27036c m84929o(InterfaceC22758a.c cVar) {
        if (cVar instanceof InterfaceC22758a.d) {
            return new C27036c(null, new C27036c.c(C33205o0.f138451a.m105288b(), null, null, null, null, false, 62, null), null, null, 13, null);
        }
        if (cVar instanceof InterfaceC22758a.b) {
            return new C27036c(null, new C27036c.c(C33205o0.f138451a.m105288b(), null, null, null, Boolean.TRUE, false, 46, null), null, null, 13, null);
        }
        if (cVar instanceof InterfaceC22758a.e) {
            return new C27036c(null, new C27036c.c(C33205o0.f138451a.m105289c(), new InterfaceC27034a.o(false, 1, null), null, InterfaceC27034a.l.f107852a, null, false, 52, null), null, null, 13, null);
        }
        if (cVar instanceof InterfaceC22758a.g) {
            return new C27036c(null, new C27036c.c(C33205o0.f138451a.m105291e(), new InterfaceC27034a.o(false, 1, null), null, InterfaceC27034a.l.f107852a, null, false, 52, null), null, null, 13, null);
        }
        if (cVar instanceof InterfaceC22758a.i) {
            C33211q0 c33211q0M105293g = C33205o0.f138451a.m105293g();
            InterfaceC27034a.l lVar = InterfaceC27034a.l.f107852a;
            return new C27036c(null, new C27036c.c(c33211q0M105293g, lVar, null, lVar, null, false, 52, null), null, null, 13, null);
        }
        if (cVar instanceof InterfaceC22758a.h) {
            return new C27036c(null, new C27036c.c(new C33211q0(null, new AbstractC33208p0.b(AbstractC8693b.m21277k(AbstractC24541a.f95768A), false, null, 6, null), null, null, AbstractC8693b.m21277k(AbstractC24541a.f95794z), false, false, null, false, true, 493, null), InterfaceC27034a.j.f107846a, null, null, null, true, 28, null), null, null, 13, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00cd  */
    /* JADX INFO: renamed from: p */
    private final InterfaceC25312u m84930p(ShippingAddressField shippingAddressField, C22760c c22760c) {
        String upperCase;
        String upperCase2;
        int i13;
        String upperCase3;
        String type = shippingAddressField.getType();
        Locale locale = Locale.ROOT;
        String lowerCase = type.toLowerCase(locale);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        TextResource textResourceM21278l = null;
        if (m84925k(shippingAddressField, c22760c)) {
            String fieldType = shippingAddressField.getFieldType();
            if (fieldType != null) {
                upperCase3 = fieldType.toUpperCase(locale);
                AbstractC22676k.m65749i(upperCase3, "toUpperCase(...)");
            } else {
                upperCase3 = null;
            }
            if (AbstractC22676k.m65745e(upperCase3, ShippingAddressField.DROPDOWN_FIELD_TYPE)) {
                String strM65963a = AbstractC22764g.m65963a(c22760c.m65926n(), lowerCase);
                TextResource textResourceM21278l2 = AbstractC8693b.m21278l(shippingAddressField.getLabel());
                textResourceM21278l = strM65963a != null ? AbstractC8693b.m21278l(strM65963a) : null;
                TextResource textResourceM21278l3 = AbstractC8693b.m21278l(shippingAddressField.getLabel());
                Boolean boolIsRequired = shippingAddressField.isRequired();
                return new C21884o(lowerCase, 1, textResourceM21278l2, textResourceM21278l, textResourceM21278l3, false, null, boolIsRequired != null ? boolIsRequired.booleanValue() : false, shippingAddressField.getMinLength(), shippingAddressField.getMaxLength(), shippingAddressField.getPattern(), false, C22761d.f89610a.m65928a(shippingAddressField.getType()), c22760c.getSource(), lowerCase, 32, null);
            }
        }
        String fieldType2 = shippingAddressField.getFieldType();
        if (fieldType2 != null) {
            upperCase = fieldType2.toUpperCase(locale);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        } else {
            upperCase = null;
        }
        if (!AbstractC22676k.m65745e(upperCase, ShippingAddressField.TEXT_FIELD_TYPE)) {
            String fieldType3 = shippingAddressField.getFieldType();
            if (fieldType3 != null) {
                upperCase2 = fieldType3.toUpperCase(locale);
                AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
            } else {
                upperCase2 = null;
            }
            if (AbstractC22676k.m65745e(upperCase2, ShippingAddressField.DROPDOWN_FIELD_TYPE)) {
                TextResource textResourceM21278l4 = AbstractC8693b.m21278l(shippingAddressField.getLabel());
                TextResource textResourceM21278l5 = AbstractC8693b.m21278l(shippingAddressField.getLabel());
                List<C27036c.e> listM84922g = m84922g(shippingAddressField, c22760c);
                String prefillText = shippingAddressField.getPrefillText();
                textResourceM21278l = prefillText != null ? AbstractC8693b.m21278l(prefillText) : null;
                Boolean boolIsRequired2 = shippingAddressField.isRequired();
                return new C21874e(lowerCase, textResourceM21278l4, textResourceM21278l, textResourceM21278l5, listM84922g, null, boolIsRequired2 != null ? boolIsRequired2.booleanValue() : false, shippingAddressField.getPattern());
            }
            TextResource textResourceM21278l6 = AbstractC8693b.m21278l(shippingAddressField.getLabel());
            String prefillText2 = shippingAddressField.getPrefillText();
            textResourceM21278l = prefillText2 != null ? AbstractC8693b.m21278l(prefillText2) : null;
            Boolean boolIsRequired3 = shippingAddressField.isRequired();
            boolean zBooleanValue = boolIsRequired3 != null ? boolIsRequired3.booleanValue() : false;
            Integer minLength = shippingAddressField.getMinLength();
            Integer maxLength = shippingAddressField.getMaxLength();
            String pattern = shippingAddressField.getPattern();
            Boolean boolIsReadOnly = shippingAddressField.isReadOnly();
            return new C21884o(lowerCase, 1, textResourceM21278l6, textResourceM21278l, null, false, null, zBooleanValue, minLength, maxLength, pattern, boolIsReadOnly != null ? boolIsReadOnly.booleanValue() : false, C22761d.f89610a.m65928a(shippingAddressField.getType()), c22760c.getSource(), null, 16432, null);
        }
        int iHashCode = lowerCase.hashCode();
        if (iHashCode != -1034364087) {
            if (iHashCode != 96619420) {
                if (iHashCode == 106642798 && lowerCase.equals("phone")) {
                    i13 = 4;
                } else {
                    i13 = 1;
                }
            } else if (lowerCase.equals(NotificationCompat.CATEGORY_EMAIL)) {
                i13 = 6;
            } else {
                i13 = 1;
            }
        } else if (lowerCase.equals("number")) {
            i13 = 3;
        } else {
            i13 = 1;
        }
        int i14 = i13;
        TextResource textResourceM21278l7 = AbstractC8693b.m21278l(shippingAddressField.getLabel());
        String prefillText3 = shippingAddressField.getPrefillText();
        TextResource textResourceM21278l8 = prefillText3 != null ? AbstractC8693b.m21278l(prefillText3) : null;
        String example = shippingAddressField.getExample();
        if (example != null) {
            if (AbstractC39414r.m125890i0(example)) {
                example = null;
            }
            if (example != null) {
                textResourceM21278l = AbstractC8693b.m21278l(example);
            }
        }
        TextResource textResource = textResourceM21278l;
        Boolean boolIsRequired4 = shippingAddressField.isRequired();
        boolean zBooleanValue2 = boolIsRequired4 != null ? boolIsRequired4.booleanValue() : false;
        Integer minLength2 = shippingAddressField.getMinLength();
        Integer maxLength2 = shippingAddressField.getMaxLength();
        String pattern2 = shippingAddressField.getPattern();
        Boolean boolIsReadOnly2 = shippingAddressField.isReadOnly();
        return new C21884o(lowerCase, i14, textResourceM21278l7, textResourceM21278l8, textResource, false, null, zBooleanValue2, minLength2, maxLength2, pattern2, boolIsReadOnly2 != null ? boolIsReadOnly2.booleanValue() : false, C22761d.f89610a.m65928a(shippingAddressField.getType()), c22760c.getSource(), null, 16416, null);
    }

    /* JADX INFO: renamed from: q */
    private final C27036c m84931q(ShippingAddressModels shippingAddressModels, C22760c c22760c) {
        List<ShippingAddressField> fields = shippingAddressModels.getFields();
        ArrayList<ShippingAddressField> arrayList = new ArrayList();
        for (Object obj : fields) {
            if (m84926l((ShippingAddressField) obj, c22760c)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (ShippingAddressField shippingAddressField : arrayList) {
            AbstractC25265s.m74141p0(arrayList2, AbstractC25260n.m74077r0(new C27036c.b[]{new C27036c.b(AbstractC37056f.m118958J(m84930p(shippingAddressField, c22760c))), m84927m(shippingAddressField, c22760c) ? m84920e(shippingAddressField, c22760c) : null}));
        }
        List<C27036c.b> listM84924i = m84924i(arrayList2);
        boolean zM84917b = m84917b(c22760c.m65923k(), c22760c.m65926n());
        return new C27036c(null, null, new C27036c.d(AbstractC8693b.m21278l(shippingAddressModels.getTitle()), listM84924i, false, AbstractC37056f.m118958J(new C27256h(AbstractC8693b.m21278l(shippingAddressModels.getCtaText()), null, zM84917b ? AbstractC18249c.m52575m(EnumC39333f.BRAND_WHITE) : AbstractC18249c.m52575m(EnumC39333f.WHITE_30), zM84917b ? EnumC39333f.BRAND_BLACK : EnumC39333f.WHITE_50, null, null, EnumC27272p.DEFAULT, null, null, null, EnumC27254g.STANDARD, null, null, false, true, null, zM84917b, false, null, null, null, null, null, null, null, 33463218, null)), 4, null), null, 11, null);
    }

    /* JADX INFO: renamed from: r */
    private final C27036c.e m84932r(C22765h c22765h) {
        return new C27036c.e(c22765h.getValue(), c22765h.getText(), c22765h.getId(), c22765h.getIsSelected());
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC25312u m84933a(InterfaceC25312u itemViewState, Map<String, String> userInput, Map<String, C28102c> validationState) {
        Object next;
        String text;
        AbstractC22676k.m65750j(itemViewState, "itemViewState");
        AbstractC22676k.m65750j(userInput, "userInput");
        AbstractC22676k.m65750j(validationState, "validationState");
        if (itemViewState instanceof C21884o) {
            C21884o c21884o = (C21884o) itemViewState;
            C28102c c28102c = validationState.get(c21884o.getFieldId());
            String strM65963a = AbstractC22764g.m65963a(userInput, c21884o.getFieldId());
            return c21884o.m62090a((32735 & 1) != 0 ? c21884o.fieldId : null, (32735 & 2) != 0 ? c21884o.keyboardType : 0, (32735 & 4) != 0 ? c21884o.displayLabel : null, (32735 & 8) != 0 ? c21884o.currentText : strM65963a != null ? AbstractC8693b.m21278l(strM65963a) : null, (32735 & 16) != 0 ? c21884o.placeholder : null, (32735 & 32) != 0 ? c21884o.isLastTextField : false, (32735 & 64) != 0 ? c21884o.errorMessage : c28102c != null ? c28102c.getErrorMessage() : null, (32735 & 128) != 0 ? c21884o.isRequired : false, (32735 & 256) != 0 ? c21884o.minLength : null, (32735 & 512) != 0 ? c21884o.maxLength : null, (32735 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c21884o.pattern : null, (32735 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c21884o.isReadOnly : false, (32735 & 4096) != 0 ? c21884o.autoFillType : null, (32735 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c21884o.source : null, (32735 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c21884o.otherDropdownKey : null);
        }
        if (!(itemViewState instanceof C21874e)) {
            return itemViewState;
        }
        C21874e c21874e = (C21874e) itemViewState;
        C28102c c28102c2 = validationState.get(c21874e.getFieldId());
        String strM65963a2 = AbstractC22764g.m65963a(userInput, c21874e.getFieldId());
        Iterator<T> it = c21874e.m62031g().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((C27036c.e) next).getValue(), strM65963a2));
        C27036c.e eVar = (C27036c.e) next;
        return C21874e.m62026b(c21874e, null, null, (eVar == null || (text = eVar.getText()) == null) ? null : AbstractC8693b.m21278l(text), null, null, c28102c2 != null ? c28102c2.getErrorMessage() : null, false, null, 219, null);
    }

    /* JADX INFO: renamed from: j */
    public final C27036c m84934j(C22760c domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        InterfaceC22758a currentDialogType = domainResult.getCurrentDialogType();
        if (currentDialogType instanceof InterfaceC22758a.c) {
            return m84929o((InterfaceC22758a.c) domainResult.getCurrentDialogType());
        }
        return currentDialogType instanceof InterfaceC22758a.f ? C27036c.m81114c(m84918c(domainResult), m84928n((InterfaceC22758a.f) domainResult.getCurrentDialogType()), null, null, null, 14, null) : m84918c(domainResult);
    }

    public /* synthetic */ C28100a(C21535a c21535a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC28101b.f113655a : c21535a);
    }
}
