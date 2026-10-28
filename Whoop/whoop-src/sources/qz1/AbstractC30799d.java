package qz1;

import b91.EnumC2888c;
import com.whoop.design.models.ContentType;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.nativestore.home.domain.model.ShopProductCarouselModel;
import com.whoop.nativestore.home.domain.model.ShopProductModel;
import com.whoop.nativestore.home.domain.model.ShopProductTagType;
import com.whoop.nativestore.home.domain.model.ShopSectionHeaderModel;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.NavigationScreenModel;
import com.whoop.navigation.ProductDescriptionPageScreenModel;
import gz0.AbstractC16319p0;
import h41.AbstractC16851e;
import h41.C16849c;
import h51.C16934f;
import i91.AbstractC18247a;
import i91.AbstractC18249c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import m83.AbstractC25267u;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23749z0;
import p720m91.InterfaceC25312u;
import p730qt2.C30617w;
import p745y81.C39336i;
import tz1.C34287i;
import tz1.C34290l;
import y71.C39274g;

/* JADX INFO: renamed from: qz1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\u000f\u001a\u00020\u000e*\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\"\u001a\u0010\u0016\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m65681d2 = {"Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;", "Lh51/f;", "f", "(Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;)Lh51/f;", "", "Lb91/c;", "k", "(Ljava/lang/String;)Lb91/c;", "Lcom/whoop/nativestore/home/domain/model/ShopProductModel;", "Lh41/c;", "e", "(Lcom/whoop/nativestore/home/domain/model/ShopProductModel;)Lh41/c;", "Lcom/whoop/nativestore/home/domain/model/ShopProductTagType;", "tagText", "Lh41/e;", "j", "(Lcom/whoop/nativestore/home/domain/model/ShopProductTagType;Ljava/lang/String;)Lh41/e;", "Ljb1/a;", "a", "Ljb1/a;", "d", "()Ljb1/a;", "shopProductCarouselReducer", "native-store_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30799d {

    /* JADX INFO: renamed from: a */
    private static final C21535a f126945a = AbstractC21537c.m60554d(new C30617w(9));

    /* JADX INFO: renamed from: qz1.d$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f126946a;

        static {
            int[] iArr = new int[ShopProductTagType.values().length];
            try {
                iArr[ShopProductTagType.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShopProductTagType.COMING_SOON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ShopProductTagType.SALE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ShopProductTagType.OUT_OF_STOCK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ShopProductTagType.CYBER_SALE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f126946a = iArr;
        }
    }

    /* JADX INFO: renamed from: qz1.d$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f126947w = new b();

        /* JADX INFO: renamed from: a */
        public final long m94746a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m94746a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: qz1.d$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f126948w;

        public c(Function1 function1) {
            this.f126948w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f126948w.invoke((ShopProductCarouselModel) it);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final C21535a m94738d() {
        return f126945a;
    }

    /* JADX INFO: renamed from: e */
    private static final C16849c m94739e(ShopProductModel shopProductModel) {
        AbstractC22403o abstractC22403oM64503l = AbstractC22404p.m64503l(shopProductModel.getImageUrl());
        TextResource textResourceM21278l = AbstractC8693b.m21278l(shopProductModel.getTitle());
        String salePrice = shopProductModel.getSalePrice();
        if (salePrice == null) {
            salePrice = shopProductModel.getPrice();
        }
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(salePrice);
        TextResource textResourceM21278l3 = shopProductModel.getSalePrice() != null ? AbstractC8693b.m21278l(shopProductModel.getPrice()) : AbstractC8693b.m21267a();
        ShopProductTagType tagType = shopProductModel.getTagType();
        AbstractC16851e abstractC16851eM94744j = tagType != null ? m94744j(tagType, shopProductModel.getTagText()) : null;
        C9598e destination = shopProductModel.getDestination();
        String analyticsValue = shopProductModel.getAnalyticsValue();
        Integer index = shopProductModel.getIndex();
        ShopProductTagType tagType2 = shopProductModel.getTagType();
        NavigationScreenModel parameters = shopProductModel.getDestination().getParameters();
        ProductDescriptionPageScreenModel productDescriptionPageScreenModel = parameters instanceof ProductDescriptionPageScreenModel ? (ProductDescriptionPageScreenModel) parameters : null;
        return new C16849c(new C34290l(destination, analyticsValue, index, tagType2, productDescriptionPageScreenModel != null ? productDescriptionPageScreenModel.getSku() : null, shopProductModel.getCategory()), false, abstractC22403oM64503l, textResourceM21278l, abstractC16851eM94744j, textResourceM21278l3, textResourceM21278l2, false, 130, null);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00db  */
    /* JADX INFO: renamed from: f */
    public static final C16934f m94740f(ShopProductCarouselModel shopProductCarouselModel) {
        AbstractC22403o.c cVar;
        String typography;
        AbstractC22676k.m65750j(shopProductCarouselModel, "<this>");
        ShopSectionHeaderModel header = shopProductCarouselModel.getHeader();
        C34287i c34287i = new C34287i(header != null ? header.getDestination() : null, shopProductCarouselModel.getAnalyticsValue());
        ShopSectionHeaderModel header2 = shopProductCarouselModel.getHeader();
        TextResource textResourceM21278l = AbstractC8693b.m21278l(header2 != null ? header2.getTitle() : null);
        AbstractC18247a abstractC18247aM52574l = AbstractC18249c.m52574l(b.f126947w);
        ShopSectionHeaderModel header3 = shopProductCarouselModel.getHeader();
        EnumC2888c enumC2888cM94745k = (header3 == null || (typography = header3.getTypography()) == null) ? null : m94745k(typography);
        boolean z4 = shopProductCarouselModel.getHeader() != null;
        ShopSectionHeaderModel header4 = shopProductCarouselModel.getHeader();
        boolean z13 = (header4 != null ? header4.getSubtitle() : null) != null;
        ShopSectionHeaderModel header5 = shopProductCarouselModel.getHeader();
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(header5 != null ? header5.getSubtitle() : null);
        ShopSectionHeaderModel header6 = shopProductCarouselModel.getHeader();
        C39274g c39274g = (header6 == null || header6.getSubtitle() == null) ? null : new C39274g(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward(), null, 2, null);
        List<ShopProductModel> products = shopProductCarouselModel.getProducts();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(products, 10));
        Iterator<T> it = products.iterator();
        while (it.hasNext()) {
            arrayList.add(m94739e((ShopProductModel) it.next()));
        }
        String backgroundContentUrl = shopProductCarouselModel.getBackgroundContentUrl();
        if (backgroundContentUrl == null) {
            cVar = null;
        } else {
            String str = shopProductCarouselModel.getBackgroundContentType() == ContentType.IMAGE ? backgroundContentUrl : null;
            if (str != null) {
                cVar = new AbstractC22403o.c(str, 0, 0, 0, 14, null);
            } else {
                cVar = null;
            }
        }
        return new C16934f(c34287i, textResourceM21278l, abstractC18247aM52574l, enumC2888cM94745k, textResourceM21278l2, c39274g, z13, z4, arrayList, null, null, cVar, false, 5632, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m94741g(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C30617w(10));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m94742h(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        addModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(ShopProductCarouselModel.class), new c(new C30617w(11)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C16934f m94743i(ShopProductCarouselModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m94740f(model);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    private static final AbstractC16851e m94744j(ShopProductTagType shopProductTagType, String str) {
        TextResource textResource = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        TextResource.C8691e c8691e = str != null ? new TextResource.C8691e(str) : null;
        int i13 = a.f126946a[shopProductTagType.ordinal()];
        int i14 = 1;
        if (i13 == 1) {
            return c8691e != null ? new AbstractC16851e.d(c8691e) : new AbstractC16851e.d(objArr2 == true ? 1 : 0, i14, objArr == true ? 1 : 0);
        }
        if (i13 == 2) {
            return c8691e != null ? new AbstractC16851e.a(c8691e) : new AbstractC16851e.a(objArr4 == true ? 1 : 0, i14, objArr3 == true ? 1 : 0);
        }
        if (i13 == 3) {
            return c8691e != null ? new AbstractC16851e.f(c8691e) : new AbstractC16851e.f(objArr6 == true ? 1 : 0, i14, objArr5 == true ? 1 : 0);
        }
        if (i13 == 4) {
            return c8691e != null ? new AbstractC16851e.e(c8691e) : new AbstractC16851e.e(objArr8 == true ? 1 : 0, i14, objArr7 == true ? 1 : 0);
        }
        if (i13 == 5) {
            return c8691e != null ? new AbstractC16851e.b(c8691e) : new AbstractC16851e.b(textResource, i14, objArr9 == true ? 1 : 0);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: k */
    private static final EnumC2888c m94745k(String str) {
        for (EnumC2888c enumC2888c : EnumC2888c.values()) {
            if (AbstractC22676k.m65745e(enumC2888c.name(), str)) {
                return enumC2888c;
            }
        }
        return null;
    }
}
