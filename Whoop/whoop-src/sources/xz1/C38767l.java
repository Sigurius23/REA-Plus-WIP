package xz1;

import androidx.core.app.FrameMetricsAggregator;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.DesignSystemModelKt;
import com.whoop.design.models.items.ColumnModel;
import com.whoop.design.models.items.DesignItemGridModel;
import com.whoop.design.models.items.ExpandableCardModel;
import com.whoop.design.models.items.ExpandableContentModel;
import com.whoop.design.models.items.FlowRowModel;
import com.whoop.design.models.items.GroupedItemsPanelModel;
import com.whoop.design.models.items.HeaderItemsCardModel;
import com.whoop.design.models.items.HorizontalScrollContainerModel;
import com.whoop.design.models.items.ItemsCardModel;
import com.whoop.design.models.items.SectionModel;
import com.whoop.design.models.items.SplitColumnModel;
import com.whoop.design.models.items.TagSelectorModel;
import com.whoop.nativestore.pdp.domain.model.PdpSection;
import com.whoop.nativestore.pdp.domain.model.ProductDescriptionPageResponse;
import com.whoop.nativestore.pdp.domain.model.ProductMetadata;
import com.whoop.nativestore.pdp.domain.model.ProductOption;
import com.whoop.nativestore.pdp.domain.model.ProductVariantSelectorModel;
import com.whoop.nativestore.pdp.domain.model.SelectorLevel;
import com.whoop.nativestore.pdp.domain.model.SelectorOption;
import com.whoop.nativestore.pdp.domain.model.VariantOption;
import com.whoop.nativestore.pdp.domain.model.WhoopYourWayComponentMetadata;
import com.whoop.nativestore.pdp.domain.model.WhoopYourWayMetadata;
import com.whoop.universalcheckout.features.cart.domain.CartAddIntent;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Currency;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l83.C23465k;
import live.hms.video.utils.HMSConstantsKt;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.C25271y;
import m83.C25272z;
import p098dt.AbstractC12350b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: xz1.l */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJk\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0012JE\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00182\b\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0018*\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ5\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u00182\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b \u0010!J'\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00042\u0006\u0010\"\u001a\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010$J)\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%H\u0002¢\u0006\u0004\b(\u0010)J\u0019\u0010+\u001a\b\u0012\u0004\u0012\u00020&0%*\u00020*H\u0002¢\u0006\u0004\b+\u0010,J\u001f\u0010-\u001a\b\u0012\u0004\u0012\u00020&0%*\b\u0012\u0004\u0012\u00020*0%H\u0002¢\u0006\u0004\b-\u0010.J!\u00102\u001a\u0004\u0018\u00010\u00062\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020\u0006H\u0002¢\u0006\u0004\b2\u00103J-\u00106\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\f\u00105\u001a\b\u0012\u0004\u0012\u00020&0%H\u0016¢\u0006\u0004\b6\u00107J'\u0010:\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J%\u0010<\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u0006¢\u0006\u0004\b<\u0010=J)\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060%0%2\u0006\u00104\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b>\u0010?J\u001d\u0010@\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b@\u0010AJ\u0015\u0010C\u001a\u00020B2\u0006\u00104\u001a\u00020\u0004¢\u0006\u0004\bC\u0010DJ\u0015\u0010E\u001a\u00020B2\u0006\u00104\u001a\u00020\u0004¢\u0006\u0004\bE\u0010DJ\u001f\u0010G\u001a\u0004\u0018\u00010F2\u0006\u00104\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\bG\u0010HR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00060%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010I¨\u0006K"}, m65681d2 = {"Lxz1/l;", "Lxz1/i;", "<init>", "()V", "Lxz1/e;", "", "", "Lxz1/k;", "k", "(Lxz1/e;)Ljava/util/Map;", "Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;", "metadata", "Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayMetadata;", "wyw", "declaredProductKeys", "tagSelections", "carriedOverSelections", "e", "(Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayMetadata;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;", "declaredProductKey", "tagSelection", "carriedOverSelection", "Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayComponentMetadata;", "componentMetadata", "Ll83/k;", "g", "(Ljava/lang/String;Lxz1/k;Lxz1/k;Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayComponentMetadata;)Ll83/k;", "p", "(Lxz1/k;)Ll83/k;", "productKey", "variantKey", "Lcom/whoop/nativestore/pdp/domain/model/VariantOption;", "q", "(Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;Ljava/lang/String;Ljava/lang/String;)Ll83/k;", "tagId", "m", "(Lxz1/e;Ljava/lang/String;)Ljava/util/Map;", "", "Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;", "selectors", "l", "(Ljava/util/List;)Ljava/util/Map;", "Lcom/whoop/design/models/DesignSystemModel;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/design/models/DesignSystemModel;)Ljava/util/List;", "i", "(Ljava/util/List;)Ljava/util/List;", "", "amountInCents", "currencyCode", "n", "(ILjava/lang/String;)Ljava/lang/String;", "state", "variantSelectors", "b", "(Lxz1/e;Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;Ljava/util/List;)Lxz1/e;", "Lxz1/j;", "tap", "a", "(Lxz1/e;Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;Lxz1/j;)Lxz1/e;", "r", "(Lxz1/e;Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;Ljava/lang/String;)Lxz1/e;", "s", "(Lxz1/e;Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;)Ljava/util/List;", "j", "(Lxz1/e;Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;)Ljava/lang/String;", "", "o", "(Lxz1/e;)Z", "d", "Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Wyw;", "c", "(Lxz1/e;Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;)Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Wyw;", "Ljava/util/List;", "REQUIRED_COMPONENTS", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38767l implements InterfaceC38764i {

    /* JADX INFO: renamed from: b */
    public static final C38767l f166860b = new C38767l();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final List<String> REQUIRED_COMPONENTS = AbstractC37056f.m118959K("band", "clasp", "hook", "fast-link");

    /* JADX INFO: renamed from: d */
    public static final int f166862d = 8;

    private C38767l() {
    }

    /* JADX INFO: renamed from: e */
    private final Map<String, C38766k> m124287e(ProductMetadata metadata, WhoopYourWayMetadata wyw, Map<String, String> declaredProductKeys, Map<String, C38766k> tagSelections, Map<String, C38766k> carriedOverSelections) {
        String str;
        C23465k c23465kM124297q;
        LinkedHashSet<String> linkedHashSetM34556E = AbstractC12350b.m34556E(wyw.getWywComponentMetadata().keySet(), declaredProductKeys.keySet());
        ArrayList arrayList = new ArrayList();
        for (String str2 : linkedHashSetM34556E) {
            C38767l c38767l = f166860b;
            C23465k c23465kM124289g = c38767l.m124289g(declaredProductKeys.get(str2), tagSelections.get(str2), carriedOverSelections.get(str2), wyw.getWywComponentMetadata().get(str2));
            C23465k c23465k = null;
            if (c23465kM124289g != null && (c23465kM124297q = c38767l.m124297q(metadata, (str = (String) c23465kM124289g.f92937w), (String) c23465kM124289g.f92938x)) != null) {
                String str3 = (String) c23465kM124297q.f92937w;
                VariantOption variantOption = (VariantOption) c23465kM124297q.f92938x;
                c23465k = new C23465k(str2, new C38766k(str2, str, str3, variantOption.getSku(), variantOption.getPriceAmount(), variantOption.getPriceCurrencyCode(), variantOption.getHasStock()));
            }
            if (c23465k != null) {
                arrayList.add(c23465k);
            }
        }
        return AbstractC25247g0.m74000i0(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Map m124288f(C38767l c38767l, ProductMetadata productMetadata, WhoopYourWayMetadata whoopYourWayMetadata, Map map, Map map2, Map map3, int i13, Object obj) {
        int i14 = i13 & 8;
        C25272z c25272z = C25272z.f99163w;
        if (i14 != 0) {
            map2 = c25272z;
        }
        if ((i13 & 16) != 0) {
            map3 = c25272z;
        }
        return c38767l.m124287e(productMetadata, whoopYourWayMetadata, map, map2, map3);
    }

    /* JADX INFO: renamed from: g */
    private final C23465k m124289g(String declaredProductKey, C38766k tagSelection, C38766k carriedOverSelection, WhoopYourWayComponentMetadata componentMetadata) {
        C23465k c23465kM124296p;
        C23465k c23465kM124296p2;
        if (declaredProductKey != null) {
            return (tagSelection == null || (c23465kM124296p2 = m124296p(tagSelection)) == null) ? new C23465k(declaredProductKey, HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY) : c23465kM124296p2;
        }
        if (carriedOverSelection != null && (c23465kM124296p = m124296p(carriedOverSelection)) != null) {
            return c23465kM124296p;
        }
        if (tagSelection != null) {
            return m124296p(tagSelection);
        }
        if (componentMetadata != null) {
            return new C23465k(componentMetadata.getInitiallySelectedProductKey(), componentMetadata.getInitiallySelectedVariantKey());
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    private final List<ProductVariantSelectorModel> m124290h(DesignSystemModel designSystemModel) {
        DesignSystemModel designSystemModelUnwrap = DesignSystemModelKt.unwrap(designSystemModel);
        if (designSystemModelUnwrap instanceof ProductVariantSelectorModel) {
            return AbstractC37056f.m118958J(designSystemModelUnwrap);
        }
        boolean z4 = designSystemModelUnwrap instanceof ItemsCardModel;
        List list = C25271y.f99162w;
        if (z4) {
            ItemsCardModel itemsCardModel = (ItemsCardModel) designSystemModelUnwrap;
            List<DesignSystemModel> items = itemsCardModel.getItems();
            List<DesignSystemModel> footerItems = itemsCardModel.getFooterItems();
            if (footerItems != null) {
                list = footerItems;
            }
            return m124291i(AbstractC25265s.m74129g1(items, list));
        }
        if (designSystemModelUnwrap instanceof SplitColumnModel) {
            SplitColumnModel splitColumnModel = (SplitColumnModel) designSystemModelUnwrap;
            return m124291i(AbstractC25265s.m74129g1(splitColumnModel.getTopContent(), splitColumnModel.getBottomContent()));
        }
        if (designSystemModelUnwrap instanceof ExpandableCardModel) {
            ExpandableCardModel expandableCardModel = (ExpandableCardModel) designSystemModelUnwrap;
            return m124291i(AbstractC25265s.m74129g1(AbstractC37056f.m118958J(expandableCardModel.getHeaderContent()), expandableCardModel.getExpandedContent()));
        }
        if (designSystemModelUnwrap instanceof HeaderItemsCardModel) {
            return m124291i(((HeaderItemsCardModel) designSystemModelUnwrap).getItems());
        }
        if (designSystemModelUnwrap instanceof ColumnModel) {
            return m124291i(((ColumnModel) designSystemModelUnwrap).getItems());
        }
        if (designSystemModelUnwrap instanceof SectionModel) {
            return m124291i(((SectionModel) designSystemModelUnwrap).getItems());
        }
        if (designSystemModelUnwrap instanceof FlowRowModel) {
            List<DesignSystemModel> items2 = ((FlowRowModel) designSystemModelUnwrap).getItems();
            if (items2 != null) {
                list = items2;
            }
            return m124291i(list);
        }
        if (designSystemModelUnwrap instanceof HorizontalScrollContainerModel) {
            return m124291i(((HorizontalScrollContainerModel) designSystemModelUnwrap).getItems());
        }
        if (designSystemModelUnwrap instanceof GroupedItemsPanelModel) {
            return m124291i(((GroupedItemsPanelModel) designSystemModelUnwrap).getItems());
        }
        if (designSystemModelUnwrap instanceof DesignItemGridModel) {
            return m124291i(((DesignItemGridModel) designSystemModelUnwrap).getItems());
        }
        return designSystemModelUnwrap instanceof ExpandableContentModel ? m124291i(((ExpandableContentModel) designSystemModelUnwrap).getItems()) : list;
    }

    /* JADX INFO: renamed from: i */
    private final List<ProductVariantSelectorModel> m124291i(List<? extends DesignSystemModel> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            AbstractC25265s.m74141p0(arrayList, f166860b.m124290h((DesignSystemModel) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k */
    private final Map<String, C38766k> m124292k(C38760e c38760e) {
        Map<String, C38766k> map = c38760e.m124253l().get(c38760e.getCurrentWywTagId());
        return map == null ? C25272z.f99163w : map;
    }

    /* JADX INFO: renamed from: l */
    private final Map<String, String> m124293l(List<ProductVariantSelectorModel> selectors) {
        SelectorOption selectedOption;
        String key;
        ArrayList<ProductVariantSelectorModel> arrayList = new ArrayList();
        for (Object obj : selectors) {
            if (((ProductVariantSelectorModel) obj).getLevel() == SelectorLevel.PRODUCT) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (ProductVariantSelectorModel productVariantSelectorModel : arrayList) {
            String packItemId = productVariantSelectorModel.getPackItemId();
            C23465k c23465k = null;
            if (packItemId != null && (selectedOption = productVariantSelectorModel.getSelectedOption()) != null && (key = selectedOption.getKey()) != null) {
                c23465k = new C23465k(packItemId, key);
            }
            if (c23465k != null) {
                arrayList2.add(c23465k);
            }
        }
        return AbstractC25247g0.m74000i0(arrayList2);
    }

    /* JADX INFO: renamed from: m */
    private final Map<String, String> m124294m(C38760e c38760e, String str) {
        ProductDescriptionPageResponse response;
        AbstractC38759d state = c38760e.getState();
        DesignSystemModel designSystemModel = null;
        AbstractC38759d.b bVar = state instanceof AbstractC38759d.b ? (AbstractC38759d.b) state : null;
        if (bVar != null && (response = bVar.getResponse()) != null) {
            List<PdpSection> sections = response.getSections();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = sections.iterator();
            while (it.hasNext()) {
                AbstractC25265s.m74141p0(arrayList, ((PdpSection) it.next()).getItems());
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (obj instanceof TagSelectorModel) {
                    arrayList2.add(obj);
                }
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                DesignSystemModel designSystemModel2 = ((TagSelectorModel) it3.next()).getTagMaps().get(str);
                if (designSystemModel2 != null) {
                    designSystemModel = designSystemModel2;
                    break;
                }
            }
            if (designSystemModel != null) {
                return m124293l(m124290h(designSystemModel));
            }
        }
        return C25272z.f99163w;
    }

    /* JADX INFO: renamed from: n */
    private final String m124295n(int amountInCents, String currencyCode) {
        try {
            NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
            currencyInstance.setCurrency(Currency.getInstance(currencyCode));
            return currencyInstance.format(((double) amountInCents) / 100.0d);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: p */
    private final C23465k m124296p(C38766k c38766k) {
        return new C23465k(c38766k.getSelectedProductKey(), c38766k.getSelectedVariantKey());
    }

    /* JADX INFO: renamed from: q */
    private final C23465k m124297q(ProductMetadata metadata, String productKey, String variantKey) {
        Map<String, VariantOption> variants;
        Set<Map.Entry<String, VariantOption>> setEntrySet;
        Map.Entry entry;
        VariantOption variantOptionM124271e = InterfaceC38764i.INSTANCE.m124271e(metadata, productKey, variantKey);
        if (variantOptionM124271e != null) {
            return new C23465k(variantKey, variantOptionM124271e);
        }
        ProductOption productOption = metadata.getProducts().get(productKey);
        if (productOption == null || (variants = productOption.getVariants()) == null || (setEntrySet = variants.entrySet()) == null || (entry = (Map.Entry) AbstractC25265s.m74098G0(setEntrySet)) == null) {
            return null;
        }
        return new C23465k(entry.getKey(), entry.getValue());
    }

    @Override // xz1.InterfaceC38764i
    /* JADX INFO: renamed from: a */
    public C38760e mo124230a(C38760e state, ProductMetadata metadata, C38765j tap) {
        String currentWywTagId;
        Map<String, C38766k> map;
        C38766k c38766k;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(metadata, "metadata");
        AbstractC22676k.m65750j(tap, "tap");
        String packItemId = tap.getPackItemId();
        if (packItemId != null && (currentWywTagId = state.getCurrentWywTagId()) != null && (map = state.m124253l().get(currentWywTagId)) != null && (c38766k = map.get(packItemId)) != null) {
            String optionKey = tap.getOptionKey();
            C23465k c23465kM124297q = m124297q(metadata, optionKey, HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY);
            if (c23465kM124297q != null) {
                String str = (String) c23465kM124297q.f92937w;
                VariantOption variantOption = (VariantOption) c23465kM124297q.f92938x;
                return C38760e.m124242b(state, null, null, null, null, null, null, null, null, null, AbstractC25247g0.m73996e0(state.m124253l(), new C23465k(currentWywTagId, AbstractC25247g0.m73996e0(map, new C23465k(packItemId, C38766k.m124279b(c38766k, null, optionKey, str, variantOption.getSku(), variantOption.getPriceAmount(), variantOption.getPriceCurrencyCode(), variantOption.getHasStock(), 1, null))))), FrameMetricsAggregator.EVERY_DURATION, null);
            }
        }
        return state;
    }

    @Override // xz1.InterfaceC38764i
    /* JADX INFO: renamed from: b */
    public C38760e mo124231b(C38760e state, ProductMetadata metadata, List<ProductVariantSelectorModel> variantSelectors) {
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(metadata, "metadata");
        AbstractC22676k.m65750j(variantSelectors, "variantSelectors");
        WhoopYourWayMetadata wywMetadata = metadata.getWywMetadata();
        if (wywMetadata == null) {
            return state;
        }
        String currentWywTagId = state.getCurrentWywTagId();
        if (currentWywTagId == null) {
            currentWywTagId = "";
        }
        String str = currentWywTagId;
        return C38760e.m124242b(state, null, null, null, null, null, null, null, null, str, AbstractC25247g0.m73996e0(state.m124253l(), new C23465k(str, m124288f(this, metadata, wywMetadata, AbstractC25247g0.m73995d0(m124293l(variantSelectors), m124294m(state, str)), null, null, 24, null))), 255, null);
    }

    /* JADX INFO: renamed from: c */
    public final CartAddIntent.Wyw m124298c(C38760e state, ProductMetadata metadata) {
        String wywSku;
        Map<String, C38766k> mapM124292k;
        C38766k c38766k;
        String selectedSku;
        C38766k c38766k2;
        String selectedSku2;
        C38766k c38766k3;
        String selectedSku3;
        C38766k c38766k4;
        String selectedSku4;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(metadata, "metadata");
        WhoopYourWayMetadata wywMetadata = metadata.getWywMetadata();
        if (wywMetadata == null || (wywSku = wywMetadata.getWywSku()) == null || (c38766k = (mapM124292k = m124292k(state)).get("band")) == null || (selectedSku = c38766k.getSelectedSku()) == null || (c38766k2 = mapM124292k.get("clasp")) == null || (selectedSku2 = c38766k2.getSelectedSku()) == null || (c38766k3 = mapM124292k.get("hook")) == null || (selectedSku3 = c38766k3.getSelectedSku()) == null || (c38766k4 = mapM124292k.get("fast-link")) == null || (selectedSku4 = c38766k4.getSelectedSku()) == null) {
            return null;
        }
        return new CartAddIntent.Wyw(wywSku, selectedSku, selectedSku2, selectedSku3, selectedSku4);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m124299d(C38760e state) {
        AbstractC22676k.m65750j(state, "state");
        Collection<C38766k> collectionValues = m124292k(state).values();
        if (collectionValues.isEmpty()) {
            return false;
        }
        Collection<C38766k> collection = collectionValues;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!((C38766k) it.next()).getIsInStock()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final String m124300j(C38760e state, ProductMetadata metadata) {
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(metadata, "metadata");
        WhoopYourWayMetadata wywMetadata = metadata.getWywMetadata();
        if (wywMetadata == null) {
            return "";
        }
        Collection<C38766k> collectionValues = m124292k(state).values();
        if (collectionValues.isEmpty()) {
            return wywMetadata.getWywInitialPrice();
        }
        Collection<C38766k> collection = collectionValues;
        Iterator<T> it = collection.iterator();
        int priceAmount = 0;
        while (it.hasNext()) {
            priceAmount += ((C38766k) it.next()).getPriceAmount();
        }
        int wywCustomizationFeeAmount = wywMetadata.getWywCustomizationFeeAmount() + priceAmount;
        C38766k c38766k = (C38766k) AbstractC25265s.m74098G0(collection);
        String priceCurrencyCode = c38766k != null ? c38766k.getPriceCurrencyCode() : null;
        String strM124295n = m124295n(wywCustomizationFeeAmount, priceCurrencyCode != null ? priceCurrencyCode : "");
        return strM124295n == null ? wywMetadata.getWywInitialPrice() : strM124295n;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m124301o(C38760e state) {
        AbstractC22676k.m65750j(state, "state");
        Map<String, C38766k> mapM124292k = m124292k(state);
        List<String> list = REQUIRED_COMPONENTS;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            C38766k c38766k = mapM124292k.get((String) it.next());
            if ((c38766k != null ? c38766k.getSelectedSku() : null) == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: r */
    public final C38760e m124302r(C38760e state, ProductMetadata metadata, String tagId) {
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(metadata, "metadata");
        AbstractC22676k.m65750j(tagId, "tagId");
        WhoopYourWayMetadata wywMetadata = metadata.getWywMetadata();
        if (wywMetadata == null) {
            return state;
        }
        Map<String, String> mapM124294m = m124294m(state, tagId);
        Map<String, C38766k> map = state.m124253l().get(tagId);
        if (map == null) {
            map = C25272z.f99163w;
        }
        return C38760e.m124242b(state, null, null, null, null, null, null, null, null, tagId, AbstractC25247g0.m73996e0(state.m124253l(), new C23465k(tagId, m124287e(metadata, wywMetadata, mapM124294m, map, m124292k(state)))), 255, null);
    }

    /* JADX INFO: renamed from: s */
    public final List<List<String>> m124303s(C38760e state, ProductMetadata metadata) {
        Map<String, String> imagesWithLabels;
        Map<String, VariantOption> variants;
        Collection<VariantOption> collectionValues;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(metadata, "metadata");
        WhoopYourWayMetadata wywMetadata = metadata.getWywMetadata();
        if (wywMetadata != null && !wywMetadata.getWywImageLabelOrder().isEmpty()) {
            Map<String, C38766k> mapM124292k = m124292k(state);
            Set<String> setKeySet = wywMetadata.getWywComponentMetadata().keySet();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = setKeySet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C38766k c38766k = mapM124292k.get((String) it.next());
                VariantOption variantOptionM124271e = c38766k != null ? InterfaceC38764i.INSTANCE.m124271e(metadata, c38766k.getSelectedProductKey(), c38766k.getSelectedVariantKey()) : null;
                if (variantOptionM124271e != null) {
                    arrayList.add(variantOptionM124271e);
                }
            }
            if (!arrayList.isEmpty()) {
                ProductOption productOption = metadata.getProducts().get(wywMetadata.getWywDeviceProductKey());
                VariantOption variantOption = (productOption == null || (variants = productOption.getVariants()) == null || (collectionValues = variants.values()) == null) ? null : (VariantOption) AbstractC25265s.m74098G0(collectionValues);
                List<String> wywImageLabelOrder = wywMetadata.getWywImageLabelOrder();
                ArrayList arrayList2 = new ArrayList();
                for (String str : wywImageLabelOrder) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        Map<String, String> imagesWithLabels2 = ((VariantOption) it3.next()).getImagesWithLabels();
                        String str2 = imagesWithLabels2 != null ? imagesWithLabels2.get(str) : null;
                        if (str2 != null) {
                            arrayList3.add(str2);
                        }
                    }
                    ArrayList arrayListM74129g1 = AbstractC25265s.m74129g1(arrayList3, AbstractC37056f.m118960L((variantOption == null || (imagesWithLabels = variantOption.getImagesWithLabels()) == null) ? null : imagesWithLabels.get(str)));
                    if (arrayListM74129g1.isEmpty()) {
                        arrayListM74129g1 = null;
                    }
                    if (arrayListM74129g1 != null) {
                        arrayList2.add(arrayListM74129g1);
                    }
                }
                return arrayList2;
            }
        }
        return C25271y.f99162w;
    }
}
