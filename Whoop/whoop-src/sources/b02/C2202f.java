package b02;

import b01.C2185f;
import com.whoop.design.models.items.CardButtonModel;
import com.whoop.nativestore.pdp.domain.model.PackItemProductMetadata;
import com.whoop.nativestore.pdp.domain.model.PdpCheckoutFooter;
import com.whoop.nativestore.pdp.domain.model.PdpSection;
import com.whoop.nativestore.pdp.domain.model.ProductDescriptionPageResponse;
import com.whoop.nativestore.pdp.domain.model.ProductImageGalleryTagModel;
import com.whoop.nativestore.pdp.domain.model.ProductMetadata;
import com.whoop.nativestore.pdp.domain.model.ProductOption;
import com.whoop.nativestore.pdp.domain.model.SelectorLevel;
import com.whoop.nativestore.pdp.domain.model.VariantOption;
import com.whoop.nativestore.pdp.domain.model.WhoopYourWayComponentMetadata;
import com.whoop.nativestore.pdp.domain.model.WhoopYourWayMetadata;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.NavigationScreenModel;
import com.whoop.navigation.ProductDescriptionPageScreenModel;
import com.whoop.universalcheckout.features.cart.domain.CartAddIntent;
import h02.C16564c;
import h02.C16565c0;
import h02.C16567d0;
import h02.C16577i0;
import h02.C16580k;
import h02.C16583l0;
import h02.C16591p0;
import h02.C16595s;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jb1.C21535a;
import kd1.AbstractC22403o;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonElement;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import m83.C25272z;
import n81.C26448a;
import n81.C26453f;
import ny0.C27256h;
import ny0.EnumC27272p;
import p208i2.AbstractC17911t;
import p208i2.C17875c1;
import p712j91.Function1;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p716lb1.AbstractC23613d4;
import p720m91.InterfaceC25312u;
import p745y81.C39336i;
import p745y81.EnumC39333f;
import q83.AbstractC30060g;
import u82.AbstractC34650k;
import v71.C35768i;
import xz1.AbstractC38759d;
import xz1.C38756a;
import xz1.C38760e;
import xz1.C38766k;
import xz1.C38767l;
import xz1.InterfaceC38764i;
import yb3.AbstractC39414r;
import yz1.AbstractC39911e;

/* JADX INFO: renamed from: b02.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u0007*\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0015*\u00020\u000b2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001a\u001a\u00020\u0019*\u00020\u00182\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001d\u001a\u00020\u001c*\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010 \u001a\u00020\u001f*\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b \u0010!J%\u0010#\u001a\u00020\"*\u00020\"2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b#\u0010$J%\u0010&\u001a\u00020%*\u00020%2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b&\u0010'J\u001d\u0010*\u001a\u0004\u0018\u00010)*\u00020(2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b*\u0010+J\u001b\u0010-\u001a\u00020,*\u00020,2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b-\u0010.J9\u00102\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u00070\u0012\u0018\u000100*\u00020\r2\b\u0010/\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b2\u00103J\u001b\u00104\u001a\u00020,*\u00020,2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b4\u0010.J'\u00105\u001a\b\u0012\u0004\u0012\u00020\u00190\u0015*\b\u0012\u0004\u0012\u00020\u00190\u00152\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b5\u00106J%\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0012*\b\u0012\u0004\u0012\u00020\u00190\u0015H\u0002¢\u0006\u0004\b7\u00108J'\u0010<\u001a\u000209*\u0002092\b\u0010:\u001a\u0004\u0018\u00010\u00132\b\u0010;\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b<\u0010=J%\u0010?\u001a\u00020>*\u00020>2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b?\u0010@J\u0015\u0010B\u001a\u0004\u0018\u00010A*\u00020)H\u0002¢\u0006\u0004\bB\u0010CJ\u0013\u0010E\u001a\u00020D*\u00020DH\u0002¢\u0006\u0004\bE\u0010FJ\u001b\u0010I\u001a\u00020D*\u00020D2\u0006\u0010H\u001a\u00020GH\u0002¢\u0006\u0004\bI\u0010JJ\u001d\u0010K\u001a\u00020G*\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\bK\u0010LJ\u001d\u0010O\u001a\u00020M*\u00020M2\b\u0010N\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\bO\u0010PJ\u0015\u0010R\u001a\u00020Q2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\bR\u0010SR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010U¨\u0006V"}, m65681d2 = {"Lb02/f;", "", "Ljb1/a;", "designItemReducer", "<init>", "(Ljb1/a;)V", "Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionPageResponse;", "", "selectedProductKey", "q", "(Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionPageResponse;Ljava/lang/String;)Ljava/lang/String;", "Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;", "metadata", "Lxz1/e;", "domainState", "Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;", "j", "(Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;Lxz1/e;)Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;", "", "Lxz1/a;", "packSelections", "", "l", "(Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;Ljava/util/Map;)Ljava/util/List;", "Lcom/whoop/nativestore/pdp/domain/model/PdpSection;", "Lb02/d;", "v", "(Lcom/whoop/nativestore/pdp/domain/model/PdpSection;Lxz1/e;Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;)Lb02/d;", "Lm91/u;", "b", "(Lm91/u;Lxz1/e;Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;)Lm91/u;", "Ln81/f;", "i", "(Ln81/f;Lxz1/e;Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;)Ln81/f;", "Lh02/s;", "g", "(Lh02/s;Lxz1/e;Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;)Lh02/s;", "Lh02/p0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lh02/p0;Lxz1/e;Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;)Lh02/p0;", "Lxz1/k;", "Lcom/whoop/nativestore/pdp/domain/model/VariantOption;", "s", "(Lxz1/k;Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;)Lcom/whoop/nativestore/pdp/domain/model/VariantOption;", "Lh02/i0;", "d", "(Lh02/i0;Lxz1/e;)Lh02/i0;", "packItemId", "Ll83/k;", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lxz1/e;Ljava/lang/String;)Ll83/k;", "e", "n", "(Ljava/util/List;Lxz1/e;)Ljava/util/List;", "t", "(Ljava/util/List;)Ljava/util/Map;", "Lh02/c;", "selection", "labels", "m", "(Lh02/c;Lxz1/a;Ljava/lang/String;)Lh02/c;", "Lh02/c0;", "f", "(Lh02/c0;Lxz1/e;Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;)Lh02/c0;", "Lh02/d0;", "u", "(Lcom/whoop/nativestore/pdp/domain/model/VariantOption;)Lh02/d0;", "Lny0/h;", "o", "(Lny0/h;)Lny0/h;", "", "enabled", "c", "(Lny0/h;Z)Lny0/h;", "k", "(Lxz1/e;Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;)Z", "Lcom/whoop/navigation/e;", "sku", "x", "(Lcom/whoop/navigation/e;Ljava/lang/String;)Lcom/whoop/navigation/e;", "Lb02/e;", "r", "(Lxz1/e;)Lb02/e;", "a", "Ljb1/a;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C2202f {

    /* JADX INFO: renamed from: b */
    public static final int f8775b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a designItemReducer;

    /* JADX INFO: renamed from: b02.f$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f8777a;

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
            f8777a = iArr;
        }
    }

    /* JADX INFO: renamed from: b02.f$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t14, T t15) {
            return AbstractC30060g.m92127q(Integer.valueOf(((C16577i0) t14).getVariantSelectorIndex()), Integer.valueOf(((C16577i0) t15).getVariantSelectorIndex()));
        }
    }

    public C2202f(C21535a designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "designItemReducer");
        this.designItemReducer = designItemReducer;
    }

    /* JADX INFO: renamed from: b */
    private final InterfaceC25312u m7006b(InterfaceC25312u interfaceC25312u, C38760e c38760e, ProductMetadata productMetadata) {
        if (interfaceC25312u instanceof C16577i0) {
            return m7009e(m7008d((C16577i0) interfaceC25312u, c38760e), c38760e);
        }
        if (interfaceC25312u instanceof C16565c0) {
            return m7010f((C16565c0) interfaceC25312u, c38760e, productMetadata);
        }
        if (interfaceC25312u instanceof C16595s) {
            return m7011g((C16595s) interfaceC25312u, c38760e, productMetadata);
        }
        if (interfaceC25312u instanceof C16591p0) {
            return m7012h((C16591p0) interfaceC25312u, c38760e, productMetadata);
        }
        if (interfaceC25312u instanceof C26453f) {
            return m7013i((C26453f) interfaceC25312u, c38760e, productMetadata);
        }
        if (!(interfaceC25312u instanceof C35768i)) {
            return interfaceC25312u;
        }
        C35768i c35768i = (C35768i) interfaceC25312u;
        List<InterfaceC25312u> listM113365i = c35768i.m113365i();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM113365i, 10));
        Iterator<T> it = listM113365i.iterator();
        while (it.hasNext()) {
            arrayList.add(m7006b((InterfaceC25312u) it.next(), c38760e, productMetadata));
        }
        List<InterfaceC25312u> listM113363g = c35768i.m113363g();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM113363g, 10));
        Iterator<T> it3 = listM113363g.iterator();
        while (it3.hasNext()) {
            arrayList2.add(m7006b((InterfaceC25312u) it3.next(), c38760e, productMetadata));
        }
        return C35768i.m113358b(c35768i, null, null, null, arrayList, arrayList2, null, 39, null);
    }

    /* JADX INFO: renamed from: c */
    private final C27256h m7007c(C27256h c27256h, boolean z4) {
        return z4 ? c27256h : C27256h.m82144b(c27256h, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, c27256h.m82149g(), null, null, null, null, null, null, 33226751, null);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0008  */
    /* JADX INFO: renamed from: d */
    private final C16577i0 m7008d(C16577i0 c16577i0, C38760e c38760e) {
        ProductDescriptionPageResponse response;
        ProductMetadata productMetadata;
        if (c16577i0.getLevel() == SelectorLevel.VARIANT) {
            AbstractC38759d state = c38760e.getState();
            AbstractC38759d.b bVar = state instanceof AbstractC38759d.b ? (AbstractC38759d.b) state : null;
            if (bVar != null && (response = bVar.getResponse()) != null && (productMetadata = response.getProductMetadata()) != null) {
                C23465k c23465kM7026w = m7026w(c38760e, c16577i0.getPackItemId());
                if (c23465kM7026w != null) {
                    String str = (String) c23465kM7026w.f92937w;
                    Map map = (Map) c23465kM7026w.f92938x;
                    if (str != null && str.length() != 0) {
                        List<C16583l0> listM46994e = c16577i0.m46994e();
                        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM46994e, 10));
                        for (C16583l0 c16583l0 : listM46994e) {
                            Map<Integer, String> mapM73996e0 = AbstractC25247g0.m73996e0(map, new C23465k(Integer.valueOf(c16577i0.getVariantSelectorIndex()), c16583l0.getKey()));
                            InterfaceC38764i.Companion aVar = InterfaceC38764i.INSTANCE;
                            VariantOption variantOptionM124271e = aVar.m124271e(productMetadata, str, aVar.m124267a(mapM73996e0));
                            arrayList.add(C16583l0.m47042b(c16583l0, null, null, null, null, variantOptionM124271e != null ? variantOptionM124271e.getHasStock() : c16583l0.getHasStock(), 15, null));
                        }
                        return C16577i0.m46991b(c16577i0, null, null, null, arrayList, null, null, 0, null, null, 503, null);
                    }
                }
            }
        }
        return c16577i0;
    }

    /* JADX INFO: renamed from: e */
    private final C16577i0 m7009e(C16577i0 c16577i0, C38760e c38760e) {
        String selectedProductKey;
        String packItemId = c16577i0.getPackItemId();
        Object obj = null;
        if (packItemId != null) {
            Map<String, C38766k> map = c38760e.m124253l().get(c38760e.getCurrentWywTagId());
            C38766k c38766k = map != null ? map.get(packItemId) : null;
            if (c38766k == null) {
                C38756a c38756a = c38760e.m124245d().get(packItemId);
                if (c38756a != null) {
                    int i13 = a.f8777a[c16577i0.getLevel().ordinal()];
                    if (i13 == 1) {
                        selectedProductKey = c38756a.getSelectedProductKey();
                    } else {
                        if (i13 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        selectedProductKey = c38756a.m124227d().get(Integer.valueOf(c16577i0.getVariantSelectorIndex()));
                    }
                }
                return c16577i0;
            }
            selectedProductKey = c38766k.getSelectedProductKey();
        } else {
            int i14 = a.f8777a[c16577i0.getLevel().ordinal()];
            if (i14 == 1) {
                selectedProductKey = c38760e.getSelectedProductKey();
            } else {
                if (i14 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                selectedProductKey = c38760e.m124251j().get(Integer.valueOf(c16577i0.getVariantSelectorIndex()));
            }
        }
        if (selectedProductKey != null) {
            for (Object obj2 : c16577i0.m46994e()) {
                if (AbstractC22676k.m65745e(((C16583l0) obj2).getKey(), selectedProductKey)) {
                    obj = obj2;
                    break;
                }
            }
            C16583l0 c16583l0 = (C16583l0) obj;
            if (c16583l0 != null) {
                return C16577i0.m46991b(c16577i0, null, null, null, null, null, c16583l0, 0, null, null, 479, null);
            }
        }
        return c16577i0;
    }

    /* JADX INFO: renamed from: f */
    private final C16565c0 m7010f(C16565c0 c16565c0, C38760e c38760e, ProductMetadata productMetadata) {
        if (productMetadata == null || !productMetadata.isWhoopYourWay()) {
            VariantOption selectedVariant = c38760e.getSelectedVariant();
            if (selectedVariant == null) {
                return c16565c0;
            }
            List<String> images = selectedVariant.getImages();
            if (images.isEmpty()) {
                return c16565c0;
            }
            List<String> list = images;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new AbstractC22403o.c((String) it.next(), 0, 0, 0, 14, null));
            }
            return C16565c0.m46932b(c16565c0, arrayList, m7024u(selectedVariant), null, 4, null);
        }
        List<List<String>> listM124303s = C38767l.f166860b.m124303s(c38760e, productMetadata);
        if (listM124303s.isEmpty()) {
            return c16565c0;
        }
        List<List<String>> list2 = listM124303s;
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        Iterator<T> it3 = list2.iterator();
        while (it3.hasNext()) {
            List list3 = (List) it3.next();
            ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(list3, 10));
            Iterator it4 = list3.iterator();
            while (it4.hasNext()) {
                arrayList3.add(new AbstractC22403o.c((String) it4.next(), 0, 0, 0, 14, null));
            }
            arrayList2.add(arrayList3);
        }
        return C16565c0.m46932b(c16565c0, null, null, arrayList2, 3, null);
    }

    /* JADX INFO: renamed from: g */
    private final C16595s m7011g(C16595s c16595s, C38760e c38760e, ProductMetadata productMetadata) {
        if (productMetadata != null && productMetadata.isWhoopYourWay()) {
            String strM124300j = C38767l.f166860b.m124300j(c38760e, productMetadata);
            return AbstractC39414r.m125890i0(strM124300j) ? c16595s : C16595s.m47096b(c16595s, null, strM124300j, null, null, 13, null);
        }
        return c16595s;
    }

    /* JADX INFO: renamed from: h */
    private final C16591p0 m7012h(C16591p0 c16591p0, C38760e c38760e, ProductMetadata productMetadata) {
        WhoopYourWayMetadata wywMetadata;
        Map<String, WhoopYourWayComponentMetadata> wywComponentMetadata;
        Map<String, C38766k> map;
        String displayLabel;
        C38766k c38766k;
        VariantOption variantOptionM7022s;
        C38766k c38766k2;
        VariantOption variantOptionM7022s2;
        if (productMetadata == null || (wywMetadata = productMetadata.getWywMetadata()) == null || (wywComponentMetadata = wywMetadata.getWywComponentMetadata()) == null || (map = c38760e.m124253l().get(c38760e.getCurrentWywTagId())) == null) {
            return c16591p0;
        }
        List<C16580k> listM47086c = c16591p0.m47086c();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM47086c, 10));
        Iterator<T> it = listM47086c.iterator();
        while (it.hasNext()) {
            arrayList.add(((C16580k) it.next()).getId());
        }
        Set setM74103I1 = AbstractC25265s.m74103I1(arrayList);
        List<C16580k> listM47086c2 = c16591p0.m47086c();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it3 = listM47086c2.iterator();
        while (true) {
            C16580k c16580kM47032b = null;
            if (!it3.hasNext()) {
                break;
            }
            C16580k c16580k = (C16580k) it3.next();
            if (c16580k.getIsStatic() || (c38766k2 = map.get(c16580k.getId())) == null || (variantOptionM7022s2 = m7022s(c38766k2, productMetadata)) == null) {
                c16580kM47032b = c16580k;
            } else if (variantOptionM7022s2.getPriceAmount() > 0) {
                c16580kM47032b = C16580k.m47032b(c16580k, null, null, variantOptionM7022s2.getPrice(), false, 11, null);
            }
            if (c16580kM47032b != null) {
                arrayList2.add(c16580kM47032b);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Map.Entry<String, WhoopYourWayComponentMetadata> entry : wywComponentMetadata.entrySet()) {
            String key = entry.getKey();
            C16580k c16580k2 = (setM74103I1.contains(key) || (displayLabel = entry.getValue().getDisplayLabel()) == null || (c38766k = map.get(key)) == null || (variantOptionM7022s = m7022s(c38766k, productMetadata)) == null || variantOptionM7022s.getPriceAmount() <= 0) ? null : new C16580k(key, displayLabel, variantOptionM7022s.getPrice(), false, 8, null);
            if (c16580k2 != null) {
                arrayList3.add(c16580k2);
            }
        }
        ArrayList arrayListM74129g1 = AbstractC25265s.m74129g1(arrayList2, arrayList3);
        return arrayListM74129g1.equals(c16591p0.m47086c()) ? c16591p0 : C16591p0.m47084b(c16591p0, null, arrayListM74129g1, false, 5, null);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0044 A[EDGE_INSN: B:15:0x0044->B:16:0x0046 BREAK  A[LOOP:0: B:10:0x001e->B:24:?]] */
    /* JADX INFO: renamed from: i */
    private final C26453f m7013i(C26453f c26453f, C38760e c38760e, ProductMetadata productMetadata) {
        C26453f c26453fM78338b;
        String currentWywTagId = c38760e.getCurrentWywTagId();
        if (currentWywTagId == null) {
            c26453fM78338b = c26453f;
            break;
        }
        List<C26448a> listM78345i = c26453f.m78345i();
        if (!(listM78345i instanceof Collection) || !listM78345i.isEmpty()) {
            Iterator<T> it = listM78345i.iterator();
            while (true) {
                if (!it.hasNext()) {
                    c26453fM78338b = c26453f;
                    break;
                }
                if (AbstractC22676k.m65745e(((C26448a) it.next()).getId(), currentWywTagId)) {
                    c26453fM78338b = C26453f.m78338b(c26453f, null, currentWywTagId, null, null, null, null, 61, null);
                    break;
                }
            }
        } else {
            c26453fM78338b = c26453f;
            break;
        }
        Map<String, InterfaceC25312u> mapM78344h = c26453fM78338b.m78344h();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC25247g0.m73988W(mapM78344h.size()));
        Iterator<T> it3 = mapM78344h.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            linkedHashMap.put(entry.getKey(), m7006b((InterfaceC25312u) entry.getValue(), C38760e.m124242b(c38760e, null, null, null, null, null, null, null, null, (String) entry.getKey(), null, 767, null), productMetadata));
        }
        return C26453f.m78338b(c26453fM78338b, null, null, null, null, null, linkedHashMap, 31, null);
    }

    /* JADX INFO: renamed from: j */
    private final CartAddIntent m7014j(ProductMetadata metadata, C38760e domainState) {
        if (metadata != null && metadata.isWhoopYourWay()) {
            return C38767l.f166860b.m124298c(domainState, metadata);
        }
        if (metadata == null || !metadata.isPack()) {
            String selectedSku = domainState.getSelectedSku();
            if (selectedSku != null) {
                return new CartAddIntent.Standalone(selectedSku);
            }
            return null;
        }
        String packSku = metadata.getPackSku();
        if (packSku != null) {
            return new CartAddIntent.Pack(packSku, m7016l(metadata, domainState.m124245d()));
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    private final boolean m7015k(C38760e c38760e, ProductMetadata productMetadata) {
        if (productMetadata != null && productMetadata.isWhoopYourWay()) {
            C38767l c38767l = C38767l.f166860b;
            return c38767l.m124301o(c38760e) && c38767l.m124299d(c38760e);
        }
        if (productMetadata == null || !productMetadata.isPack()) {
            VariantOption selectedVariant = c38760e.getSelectedVariant();
            return selectedVariant != null && selectedVariant.getHasStock();
        }
        if (!c38760e.m124245d().values().isEmpty()) {
            Collection<C38756a> collectionValues = c38760e.m124245d().values();
            if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                Iterator<T> it = collectionValues.iterator();
                while (it.hasNext()) {
                    if (!((C38756a) it.next()).getIsInStock()) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    private final List<String> m7016l(ProductMetadata productMetadata, Map<String, C38756a> map) {
        String initiallySelectedSku;
        Map<String, PackItemProductMetadata> packItemMetadata = productMetadata.getPackItemMetadata();
        if (packItemMetadata == null) {
            packItemMetadata = C25272z.f99163w;
        }
        ArrayList arrayList = new ArrayList(packItemMetadata.size());
        for (Map.Entry<String, PackItemProductMetadata> entry : packItemMetadata.entrySet()) {
            String key = entry.getKey();
            PackItemProductMetadata value = entry.getValue();
            C38756a c38756a = map.get(key);
            if (c38756a == null || (initiallySelectedSku = c38756a.getSelectedSku()) == null) {
                initiallySelectedSku = value.getInitiallySelectedSku();
            }
            arrayList.add(initiallySelectedSku);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002e  */
    /* JADX INFO: renamed from: m */
    private final C16564c m7017m(C16564c c16564c, C38756a c38756a, String str) {
        String imageUrl;
        VariantOption selectedVariant;
        List<String> images;
        if (c38756a == null || (selectedVariant = c38756a.getSelectedVariant()) == null || (images = selectedVariant.getImages()) == null || (imageUrl = (String) AbstractC25265s.m74100H0(images)) == null) {
            imageUrl = c16564c.getImageUrl();
        }
        String str2 = imageUrl;
        if (str == null) {
            str = c16564c.getSubtitle();
        } else {
            if (AbstractC39414r.m125890i0(str)) {
                str = null;
            }
            if (str == null) {
                str = c16564c.getSubtitle();
            }
        }
        return C16564c.m46923b(c16564c, null, null, str2, null, str, null, null, m7027x(c16564c.getDestination(), c38756a != null ? c38756a.getSelectedSku() : null), 107, null);
    }

    /* JADX INFO: renamed from: n */
    private final List<C2200d> m7018n(List<C2200d> list, C38760e c38760e) {
        if (c38760e.m124245d().isEmpty()) {
            return list;
        }
        Map<String, String> mapM7023t = m7023t(list);
        List<C2200d> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        for (C2200d c2200d : list2) {
            List<InterfaceC25312u> listM6999c = c2200d.m6999c();
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM6999c, 10));
            for (Object objM7017m : listM6999c) {
                if (objM7017m instanceof C16564c) {
                    C16564c c16564c = (C16564c) objM7017m;
                    objM7017m = m7017m(c16564c, c38760e.m124245d().get(c16564c.getPackItemId()), mapM7023t.get(c16564c.getPackItemId()));
                }
                arrayList2.add(objM7017m);
            }
            arrayList.add(C2200d.m6997b(c2200d, null, null, arrayList2, 3, null));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    private final C27256h m7019o(C27256h c27256h) {
        return c27256h.getStyle() != EnumC27272p.TRANSPARENT_BACKGROUND ? c27256h : C27256h.m82144b(c27256h, null, null, null, EnumC39333f.BRAND_BLACK, null, null, null, null, null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, Function1.m60319b(new C2185f(10)), null, 25165815, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final AbstractC17911t m7020p(C39336i whoopBrush) {
        AbstractC22676k.m65750j(whoopBrush, "$this$whoopBrush");
        return new C17875c1(whoopBrush.getBlack30());
    }

    /* JADX INFO: renamed from: q */
    private final String m7021q(ProductDescriptionPageResponse productDescriptionPageResponse, String str) {
        Map<String, ProductOption> products;
        ProductOption productOption;
        String title;
        ProductMetadata productMetadata = productDescriptionPageResponse.getProductMetadata();
        return (productMetadata == null || (products = productMetadata.getProducts()) == null || (productOption = products.get(str)) == null || (title = productOption.getTitle()) == null) ? productDescriptionPageResponse.getNavigationBarText() : title;
    }

    /* JADX INFO: renamed from: s */
    private final VariantOption m7022s(C38766k c38766k, ProductMetadata productMetadata) {
        return InterfaceC38764i.INSTANCE.m124271e(productMetadata, c38766k.getSelectedProductKey(), c38766k.getSelectedVariantKey());
    }

    /* JADX INFO: renamed from: t */
    private final Map<String, String> m7023t(List<C2200d> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            AbstractC25265s.m74141p0(arrayList, ((C2200d) it.next()).m6999c());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof C16577i0) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (((C16577i0) obj2).getPackItemId() != null) {
                arrayList3.add(obj2);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj3 : arrayList3) {
            String packItemId = ((C16577i0) obj3).getPackItemId();
            AbstractC22676k.m65747g(packItemId);
            Object arrayList4 = linkedHashMap.get(packItemId);
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
                linkedHashMap.put(packItemId, arrayList4);
            }
            ((List) arrayList4).add(obj3);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC25247g0.m73988W(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            List list2 = (List) entry.getValue();
            ArrayList arrayList5 = new ArrayList();
            for (Object obj4 : list2) {
                if (((C16577i0) obj4).getLevel() == SelectorLevel.PRODUCT) {
                    arrayList5.add(obj4);
                }
            }
            ArrayList arrayList6 = new ArrayList();
            Iterator it3 = arrayList5.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                C16583l0 selectedOption = ((C16577i0) it3.next()).getSelectedOption();
                String label = selectedOption != null ? selectedOption.getLabel() : null;
                if (label != null) {
                    arrayList6.add(label);
                }
            }
            ArrayList arrayList7 = new ArrayList();
            for (Object obj5 : list2) {
                if (((C16577i0) obj5).getLevel() == SelectorLevel.VARIANT) {
                    arrayList7.add(obj5);
                }
            }
            List listM74152u1 = AbstractC25265s.m74152u1(arrayList7, new b());
            ArrayList arrayList8 = new ArrayList();
            Iterator it4 = listM74152u1.iterator();
            while (it4.hasNext()) {
                C16583l0 selectedOption2 = ((C16577i0) it4.next()).getSelectedOption();
                String label2 = selectedOption2 != null ? selectedOption2.getLabel() : null;
                if (label2 != null) {
                    arrayList8.add(label2);
                }
            }
            ArrayList arrayListM74129g1 = AbstractC25265s.m74129g1(arrayList6, arrayList8);
            ArrayList arrayList9 = new ArrayList();
            for (Object obj6 : arrayListM74129g1) {
                if (!AbstractC39414r.m125890i0((String) obj6)) {
                    arrayList9.add(obj6);
                }
            }
            linkedHashMap2.put(key, AbstractC25265s.m74110N0(arrayList9, ", ", null, null, null, 62));
        }
        return linkedHashMap2;
    }

    /* JADX INFO: renamed from: u */
    private final C16567d0 m7024u(VariantOption variantOption) {
        JsonElement productTag = variantOption.getProductTag();
        if (productTag == null) {
            return null;
        }
        try {
            return AbstractC39911e.m128059b((ProductImageGalleryTagModel) AbstractC34650k.m109496c().m1830a(ProductImageGalleryTagModel.INSTANCE.serializer(), productTag));
        } catch (SerializationException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: v */
    private final C2200d m7025v(PdpSection pdpSection, C38760e c38760e, ProductMetadata productMetadata) {
        String id4 = pdpSection.getId();
        String sectionType = pdpSection.getSectionType();
        List<InterfaceC25312u> listM60545m = this.designItemReducer.m60545m(pdpSection.getItems());
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM60545m, 10));
        Iterator<T> it = listM60545m.iterator();
        while (it.hasNext()) {
            arrayList.add(m7006b((InterfaceC25312u) it.next(), c38760e, productMetadata));
        }
        return new C2200d(id4, sectionType, arrayList);
    }

    /* JADX INFO: renamed from: w */
    private final C23465k m7026w(C38760e c38760e, String str) {
        if (str == null) {
            return new C23465k(c38760e.getSelectedProductKey(), c38760e.m124251j());
        }
        C38756a c38756a = c38760e.m124245d().get(str);
        if (c38756a != null) {
            return new C23465k(c38756a.getSelectedProductKey(), c38756a.m124227d());
        }
        return null;
    }

    /* JADX INFO: renamed from: x */
    private final C9598e m7027x(C9598e c9598e, String str) {
        if (str == null) {
            return c9598e;
        }
        NavigationScreenModel parameters = c9598e.getParameters();
        ProductDescriptionPageScreenModel productDescriptionPageScreenModel = parameters instanceof ProductDescriptionPageScreenModel ? (ProductDescriptionPageScreenModel) parameters : null;
        return productDescriptionPageScreenModel == null ? c9598e : C9598e.m23127b(c9598e, null, ProductDescriptionPageScreenModel.copy$default(productDescriptionPageScreenModel, null, str, null, 5, null), null, 5, null);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0123  */
    /* JADX INFO: renamed from: r */
    public final C2201e m7028r(C38760e domainState) {
        String selectedPrice;
        AbstractC22676k.m65750j(domainState, "domainState");
        AbstractC38759d state = domainState.getState();
        if (AbstractC22676k.m65745e(state, AbstractC38759d.c.f166805a)) {
            return new C2201e(true, false, null, null, 14, null);
        }
        if (AbstractC22676k.m65745e(state, AbstractC38759d.a.f166803a)) {
            return new C2201e(false, true, null, null, 13, null);
        }
        if (!(state instanceof AbstractC38759d.b)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC38759d.b bVar = (AbstractC38759d.b) state;
        ProductMetadata productMetadata = bVar.getResponse().getProductMetadata();
        boolean z4 = productMetadata != null && productMetadata.isPack();
        List<PdpSection> sections = bVar.getResponse().getSections();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(sections, 10));
        Iterator<T> it = sections.iterator();
        while (it.hasNext()) {
            arrayList.add(m7025v((PdpSection) it.next(), domainState, productMetadata));
        }
        List<C2200d> listM7018n = m7018n(arrayList, domainState);
        String navigationBarText = bVar.getResponse().getNavigationBarText();
        String strM7021q = m7021q(bVar.getResponse(), domainState.getSelectedProductKey());
        Map<String, String> analyticsProperties = bVar.getResponse().getAnalyticsProperties();
        if (analyticsProperties == null) {
            analyticsProperties = C25272z.f99163w;
        }
        Map<String, String> map = analyticsProperties;
        PdpCheckoutFooter checkoutFooter = bVar.getResponse().getCheckoutFooter();
        List<CardButtonModel> cardButtons = checkoutFooter != null ? checkoutFooter.getCardButtons() : null;
        if (cardButtons == null) {
            cardButtons = C25271y.f99162w;
        }
        List<CardButtonModel> list = cardButtons;
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList2.add(m7019o(AbstractC23613d4.m68662l((CardButtonModel) it3.next(), null, 1, null)));
        }
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(arrayList2, 10));
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            arrayList3.add(m7007c((C27256h) it4.next(), m7015k(domainState, productMetadata)));
        }
        String selectedSku = domainState.getSelectedSku();
        if (productMetadata == null) {
            selectedPrice = domainState.getSelectedPrice();
        } else {
            ProductMetadata productMetadata2 = productMetadata.isWhoopYourWay() ? productMetadata : null;
            if (productMetadata2 == null || (selectedPrice = C38767l.f166860b.m124300j(domainState, productMetadata2)) == null) {
                selectedPrice = domainState.getSelectedPrice();
            }
        }
        return new C2201e(false, false, new C2197a(navigationBarText, listM7018n, arrayList3, selectedSku, selectedPrice, domainState.getSelectedProductKey(), domainState.getSelectedVariantKey(), strM7021q, map, m7014j(bVar.getResponse().getProductMetadata(), domainState), z4, productMetadata != null ? productMetadata.getPackSku() : null), null, 11, null);
    }

    public /* synthetic */ C2202f(C21535a c21535a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC2198b.m6961h() : c21535a);
    }
}
