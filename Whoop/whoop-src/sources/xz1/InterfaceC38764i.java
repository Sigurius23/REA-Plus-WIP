package xz1;

import com.whoop.nativestore.pdp.domain.model.ProductMetadata;
import com.whoop.nativestore.pdp.domain.model.ProductOption;
import com.whoop.nativestore.pdp.domain.model.ProductVariantSelectorModel;
import com.whoop.nativestore.pdp.domain.model.SelectorLevel;
import com.whoop.nativestore.pdp.domain.model.SelectorOption;
import com.whoop.nativestore.pdp.domain.model.VariantOption;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l83.C23465k;
import live.hms.video.utils.HMSConstantsKt;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: xz1.i */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \r2\u00020\u0001:\u0001\rJ-\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&¢\u0006\u0004\b\t\u0010\nJ'\u0010\r\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000e\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, m65681d2 = {"Lxz1/i;", "", "Lxz1/e;", "state", "Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;", "metadata", "", "Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;", "variantSelectors", "b", "(Lxz1/e;Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;Ljava/util/List;)Lxz1/e;", "Lxz1/j;", "tap", "a", "(Lxz1/e;Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;Lxz1/j;)Lxz1/e;", "Lxz1/b;", "Lxz1/h;", "Lxz1/l;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC38764i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f166847a;

    /* JADX INFO: renamed from: xz1.i$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0019\u001a\u00020\t2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\t0\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ1\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\t0\u00162\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001f\u0010 J=\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f\u0018\u00010$2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\"\u001a\u00020!2\b\u0010#\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b%\u0010&¨\u0006'"}, m65681d2 = {"Lxz1/i$a;", "", "<init>", "()V", "Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;", "metadata", "Lxz1/i;", "c", "(Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;)Lxz1/i;", "", "productKey", "variantKey", "Lcom/whoop/nativestore/pdp/domain/model/VariantOption;", "e", "(Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/nativestore/pdp/domain/model/VariantOption;", "sku", "d", "(Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;Ljava/lang/String;)Ljava/lang/String;", "Lcom/whoop/nativestore/pdp/domain/model/ProductOption;", "product", "f", "(Lcom/whoop/nativestore/pdp/domain/model/ProductOption;Ljava/lang/String;)Ljava/lang/String;", "", "", "variantOptions", "a", "(Ljava/util/Map;)Ljava/lang/String;", "", "Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;", "selectors", "packItemId", "g", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/Map;", "Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;", "level", "requestedVariant", "", "b", "(Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;Lcom/whoop/nativestore/pdp/domain/model/VariantOption;)Ljava/util/Map$Entry;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ Companion f166847a = new Companion();

        private Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final String m124267a(Map<Integer, String> variantOptions) {
            AbstractC22676k.m65750j(variantOptions, "variantOptions");
            if (variantOptions.isEmpty()) {
                return HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY;
            }
            Collection collectionValues = AbstractC25247g0.m74005n0(variantOptions).values();
            AbstractC22676k.m65749i(collectionValues, "<get-values>(...)");
            return AbstractC25265s.m74110N0(collectionValues, "_", null, null, null, 62);
        }

        /* JADX INFO: renamed from: b */
        public final Map.Entry<String, VariantOption> m124268b(ProductMetadata metadata, String productKey, SelectorLevel level, VariantOption requestedVariant) {
            ProductOption productOption;
            Map<String, VariantOption> variants;
            Set<Map.Entry<String, VariantOption>> setEntrySet;
            AbstractC22676k.m65750j(metadata, "metadata");
            AbstractC22676k.m65750j(productKey, "productKey");
            AbstractC22676k.m65750j(level, "level");
            if (level != SelectorLevel.PRODUCT || requestedVariant != null || (productOption = metadata.getProducts().get(productKey)) == null || (variants = productOption.getVariants()) == null || (setEntrySet = variants.entrySet()) == null) {
                return null;
            }
            return (Map.Entry) AbstractC25265s.m74098G0(setEntrySet);
        }

        /* JADX INFO: renamed from: c */
        public final InterfaceC38764i m124269c(ProductMetadata metadata) {
            AbstractC22676k.m65750j(metadata, "metadata");
            if (metadata.isWhoopYourWay()) {
                return C38767l.f166860b;
            }
            return metadata.isPack() ? C38757b.f166792b : C38763h.f166844b;
        }

        /* JADX INFO: renamed from: d */
        public final String m124270d(ProductMetadata metadata, String sku) {
            Object next;
            AbstractC22676k.m65750j(metadata, "metadata");
            if (sku == null) {
                return null;
            }
            Iterator<T> it = metadata.getProducts().entrySet().iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Collection<VariantOption> collectionValues = ((ProductOption) ((Map.Entry) next).getValue()).getVariants().values();
                if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                    Iterator<T> it3 = collectionValues.iterator();
                    while (it3.hasNext()) {
                        if (AbstractC22676k.m65745e(((VariantOption) it3.next()).getSku(), sku)) {
                            break loop0;
                        }
                    }
                }
            }
            Map.Entry entry = (Map.Entry) next;
            if (entry != null) {
                return (String) entry.getKey();
            }
            return null;
        }

        /* JADX INFO: renamed from: e */
        public final VariantOption m124271e(ProductMetadata metadata, String productKey, String variantKey) {
            Map<String, VariantOption> variants;
            AbstractC22676k.m65750j(metadata, "metadata");
            AbstractC22676k.m65750j(productKey, "productKey");
            AbstractC22676k.m65750j(variantKey, "variantKey");
            ProductOption productOption = metadata.getProducts().get(productKey);
            if (productOption == null || (variants = productOption.getVariants()) == null) {
                return null;
            }
            return variants.get(variantKey);
        }

        /* JADX INFO: renamed from: f */
        public final String m124272f(ProductOption product, String sku) {
            Object next;
            AbstractC22676k.m65750j(product, "product");
            if (sku == null) {
                return null;
            }
            Iterator<T> it = product.getVariants().entrySet().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AbstractC22676k.m65745e(((VariantOption) ((Map.Entry) next).getValue()).getSku(), sku));
            Map.Entry entry = (Map.Entry) next;
            if (entry != null) {
                return (String) entry.getKey();
            }
            return null;
        }

        /* JADX INFO: renamed from: g */
        public final Map<Integer, String> m124273g(List<ProductVariantSelectorModel> selectors, String packItemId) {
            String key;
            AbstractC22676k.m65750j(selectors, "selectors");
            ArrayList<ProductVariantSelectorModel> arrayList = new ArrayList();
            for (Object obj : selectors) {
                ProductVariantSelectorModel productVariantSelectorModel = (ProductVariantSelectorModel) obj;
                if (productVariantSelectorModel.getLevel() == SelectorLevel.VARIANT && AbstractC22676k.m65745e(productVariantSelectorModel.getPackItemId(), packItemId)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (ProductVariantSelectorModel productVariantSelectorModel2 : arrayList) {
                SelectorOption selectedOption = productVariantSelectorModel2.getSelectedOption();
                C23465k c23465k = (selectedOption == null || (key = selectedOption.getKey()) == null) ? null : new C23465k(Integer.valueOf(productVariantSelectorModel2.getVariantSelectorIndex()), key);
                if (c23465k != null) {
                    arrayList2.add(c23465k);
                }
            }
            return AbstractC25247g0.m74000i0(arrayList2);
        }
    }

    /* JADX INFO: renamed from: a */
    C38760e mo124230a(C38760e state, ProductMetadata metadata, C38765j tap);

    /* JADX INFO: renamed from: b */
    C38760e mo124231b(C38760e state, ProductMetadata metadata, List<ProductVariantSelectorModel> variantSelectors);
}
