package xz1;

import com.whoop.nativestore.pdp.domain.model.PackItemProductMetadata;
import com.whoop.nativestore.pdp.domain.model.ProductMetadata;
import com.whoop.nativestore.pdp.domain.model.ProductOption;
import com.whoop.nativestore.pdp.domain.model.ProductVariantSelectorModel;
import com.whoop.nativestore.pdp.domain.model.SelectorLevel;
import com.whoop.nativestore.pdp.domain.model.VariantOption;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import m83.AbstractC25247g0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: xz1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lxz1/b;", "Lxz1/i;", "<init>", "()V", "Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;", "metadata", "", "packItemId", "Lcom/whoop/nativestore/pdp/domain/model/PackItemProductMetadata;", "itemMetadata", "", "Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;", "variantSelectors", "Lxz1/a;", "c", "(Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/PackItemProductMetadata;Ljava/util/List;)Lxz1/a;", "Lxz1/e;", "state", "b", "(Lxz1/e;Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;Ljava/util/List;)Lxz1/e;", "Lxz1/j;", "tap", "a", "(Lxz1/e;Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;Lxz1/j;)Lxz1/e;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38757b implements InterfaceC38764i {

    /* JADX INFO: renamed from: b */
    public static final C38757b f166792b = new C38757b();

    /* JADX INFO: renamed from: xz1.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f166793a;

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
            f166793a = iArr;
        }
    }

    private C38757b() {
    }

    /* JADX INFO: renamed from: c */
    private final C38756a m124229c(ProductMetadata metadata, String packItemId, PackItemProductMetadata itemMetadata, List<ProductVariantSelectorModel> variantSelectors) {
        boolean zBooleanValue;
        String sku;
        ProductOption productOption;
        String initiallySelectedSku = itemMetadata.getInitiallySelectedSku();
        InterfaceC38764i.Companion aVar = InterfaceC38764i.INSTANCE;
        String strM124270d = aVar.m124270d(metadata, initiallySelectedSku);
        VariantOption variantOptionM124271e = null;
        String strM124272f = (strM124270d == null || (productOption = metadata.getProducts().get(strM124270d)) == null) ? null : aVar.m124272f(productOption, initiallySelectedSku);
        if (strM124270d != null && strM124272f != null) {
            variantOptionM124271e = aVar.m124271e(metadata, strM124270d, strM124272f);
        }
        VariantOption variantOption = variantOptionM124271e;
        if (strM124270d == null) {
            strM124270d = "";
        }
        String str = strM124270d;
        Map<Integer, String> mapM124273g = aVar.m124273g(variantSelectors, packItemId);
        String str2 = (variantOption == null || (sku = variantOption.getSku()) == null) ? initiallySelectedSku : sku;
        if (variantOption != null) {
            zBooleanValue = variantOption.getHasStock();
        } else {
            Boolean initialVariantHasStock = itemMetadata.getInitialVariantHasStock();
            zBooleanValue = initialVariantHasStock != null ? initialVariantHasStock.booleanValue() : true;
        }
        return new C38756a(packItemId, str, mapM124273g, variantOption, str2, zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003c  */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        if (r5 != null) goto L17;
     */
    @Override // xz1.InterfaceC38764i
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public xz1.C38760e mo124230a(xz1.C38760e r14, com.whoop.nativestore.pdp.domain.model.ProductMetadata r15, xz1.C38765j r16) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xz1.C38757b.mo124230a(xz1.e, com.whoop.nativestore.pdp.domain.model.ProductMetadata, xz1.j):xz1.e");
    }

    @Override // xz1.InterfaceC38764i
    /* JADX INFO: renamed from: b */
    public C38760e mo124231b(C38760e state, ProductMetadata metadata, List<ProductVariantSelectorModel> variantSelectors) {
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(metadata, "metadata");
        AbstractC22676k.m65750j(variantSelectors, "variantSelectors");
        Map<String, PackItemProductMetadata> packItemMetadata = metadata.getPackItemMetadata();
        if (packItemMetadata == null) {
            return state;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC25247g0.m73988W(packItemMetadata.size()));
        Iterator<T> it = packItemMetadata.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), f166792b.m124229c(metadata, (String) entry.getKey(), (PackItemProductMetadata) entry.getValue(), variantSelectors));
        }
        return C38760e.m124242b(state, null, null, null, null, null, null, null, linkedHashMap, null, null, 895, null);
    }
}
