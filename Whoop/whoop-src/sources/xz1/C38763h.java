package xz1;

import com.whoop.nativestore.pdp.domain.model.ProductMetadata;
import com.whoop.nativestore.pdp.domain.model.ProductOption;
import com.whoop.nativestore.pdp.domain.model.ProductVariantSelectorModel;
import com.whoop.nativestore.pdp.domain.model.SelectorLevel;
import com.whoop.nativestore.pdp.domain.model.VariantOption;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.C25272z;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: xz1.h */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lxz1/h;", "Lxz1/i;", "<init>", "()V", "Lxz1/e;", "state", "Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;", "metadata", "", "Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;", "variantSelectors", "b", "(Lxz1/e;Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;Ljava/util/List;)Lxz1/e;", "Lxz1/j;", "tap", "a", "(Lxz1/e;Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;Lxz1/j;)Lxz1/e;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38763h implements InterfaceC38764i {

    /* JADX INFO: renamed from: b */
    public static final C38763h f166844b = new C38763h();

    /* JADX INFO: renamed from: xz1.h$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f166845a;

        static {
            int[] iArr = new int[SelectorLevel.values().length];
            try {
                iArr[SelectorLevel.PRODUCT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SelectorLevel.VARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f166845a = iArr;
        }
    }

    private C38763h() {
    }

    @Override // xz1.InterfaceC38764i
    /* JADX INFO: renamed from: a */
    public C38760e mo124230a(C38760e state, ProductMetadata metadata, C38765j tap) {
        String optionKey;
        Map<Integer, String> mapM124251j;
        String key;
        VariantOption value;
        String selectedSku;
        VariantOption value2;
        String selectedPrice;
        VariantOption value3;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(metadata, "metadata");
        AbstractC22676k.m65750j(tap, "tap");
        SelectorLevel level = tap.getLevel();
        int[] iArr = a.f166845a;
        int i13 = iArr[level.ordinal()];
        if (i13 == 1) {
            optionKey = tap.getOptionKey();
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            optionKey = state.getSelectedProductKey();
            if (optionKey == null) {
                return state;
            }
        }
        int i14 = iArr[tap.getLevel().ordinal()];
        if (i14 == 1) {
            mapM124251j = state.m124251j();
        } else {
            if (i14 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            mapM124251j = AbstractC25247g0.m73996e0(state.m124251j(), new C23465k(Integer.valueOf(tap.getVariantIndex()), tap.getOptionKey()));
        }
        InterfaceC38764i.Companion aVar = InterfaceC38764i.INSTANCE;
        String strM124267a = aVar.m124267a(mapM124251j);
        VariantOption variantOptionM124271e = aVar.m124271e(metadata, optionKey, strM124267a);
        Map.Entry<String, VariantOption> entryM124268b = aVar.m124268b(metadata, optionKey, tap.getLevel(), variantOptionM124271e);
        if (entryM124268b != null) {
            mapM124251j = C25272z.f99163w;
        }
        Map<Integer, String> map = mapM124251j;
        if (entryM124268b == null || (key = entryM124268b.getKey()) == null) {
            key = strM124267a;
        }
        if (variantOptionM124271e == null) {
            value = entryM124268b != null ? entryM124268b.getValue() : null;
        } else {
            value = variantOptionM124271e;
        }
        if (variantOptionM124271e == null || (selectedSku = variantOptionM124271e.getSku()) == null) {
            selectedSku = (entryM124268b == null || (value2 = entryM124268b.getValue()) == null) ? state.getSelectedSku() : value2.getSku();
        }
        if (variantOptionM124271e == null || (selectedPrice = variantOptionM124271e.getPrice()) == null) {
            selectedPrice = (entryM124268b == null || (value3 = entryM124268b.getValue()) == null) ? state.getSelectedPrice() : value3.getPrice();
        }
        return C38760e.m124242b(state, null, optionKey, map, key, value, selectedSku, selectedPrice, null, null, null, 897, null);
    }

    @Override // xz1.InterfaceC38764i
    /* JADX INFO: renamed from: b */
    public C38760e mo124231b(C38760e state, ProductMetadata metadata, List<ProductVariantSelectorModel> variantSelectors) {
        String strM124272f;
        Map<String, VariantOption> variants;
        Set<String> setKeySet;
        String str;
        String price;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(metadata, "metadata");
        AbstractC22676k.m65750j(variantSelectors, "variantSelectors");
        InterfaceC38764i.Companion aVar = InterfaceC38764i.INSTANCE;
        String strM124270d = aVar.m124270d(metadata, metadata.getInitiallySelectedSku());
        if (strM124270d == null) {
            strM124270d = (String) AbstractC25265s.m74098G0(metadata.getProducts().keySet());
        }
        String str2 = strM124270d;
        ProductOption productOption = str2 != null ? metadata.getProducts().get(str2) : null;
        if (productOption == null || (strM124272f = aVar.m124272f(productOption, metadata.getInitiallySelectedSku())) == null) {
            strM124272f = (productOption == null || (variants = productOption.getVariants()) == null || (setKeySet = variants.keySet()) == null) ? null : (String) AbstractC25265s.m74098G0(setKeySet);
        }
        VariantOption variantOptionM124271e = (str2 == null || strM124272f == null) ? null : aVar.m124271e(metadata, str2, strM124272f);
        Map<Integer, String> mapM124273g = aVar.m124273g(variantSelectors, null);
        String initiallySelectedSku = metadata.getInitiallySelectedSku();
        if (initiallySelectedSku != null) {
            str = initiallySelectedSku;
        } else if (variantOptionM124271e != null) {
            initiallySelectedSku = variantOptionM124271e.getSku();
            str = initiallySelectedSku;
        } else {
            str = null;
        }
        String initiallySelectedPrice = metadata.getInitiallySelectedPrice();
        if (initiallySelectedPrice == null) {
            price = variantOptionM124271e != null ? variantOptionM124271e.getPrice() : null;
        } else {
            price = initiallySelectedPrice;
        }
        return C38760e.m124242b(state, null, str2, mapM124273g, strM124272f, variantOptionM124271e, str, price, null, null, null, 897, null);
    }
}
