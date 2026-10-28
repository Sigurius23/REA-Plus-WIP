package p716lb1;

import c41.C3998c;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.FaqListModel;
import com.whoop.design.models.items.FaqModel;
import com.whoop.design.models.items.Media;
import com.whoop.design.models.items.PerksListModel;
import com.whoop.design.models.items.PerksModel;
import com.whoop.design.models.items.Prices;
import com.whoop.design.models.items.ProductItems;
import com.whoop.design.models.items.ShoppingTileCarouselModel;
import com.whoop.design.models.items.ShoppingTileModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import d81.C11776d;
import gb1.AbstractC15673b0;
import gy0.AbstractC16277f;
import gz0.AbstractC16315n0;
import h41.AbstractC16851e;
import h41.C16849c;
import h51.C16934f;
import i91.AbstractC18249c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import jb1.AbstractC21537c;
import jb1.C21536b;
import kd1.AbstractC22403o;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p208i2.AbstractC17911t;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p720m91.InterfaceC25312u;
import p745y81.C39336i;
import r81.C31069e;
import y51.C39235c;

/* JADX INFO: renamed from: lb1.z1 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000b\"\u001a\u0010\u0011\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/design/models/items/ShoppingTileModel;", "model", "Lh41/c;", "j", "(Lcom/whoop/design/models/items/ShoppingTileModel;)Lh41/c;", "", "centsAmount", "", "currencyCode", "Lcom/whoop/design/util/TextResource;", "i", "(ILjava/lang/String;)Lcom/whoop/design/util/TextResource;", "Llb1/y0;", "a", "Llb1/y0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Llb1/y0;", "growthMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23750z1 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f94091a = Function1.m68251a(new C23714t1(4));

    /* JADX INFO: renamed from: lb1.z1$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f94092w = new a();

        /* JADX INFO: renamed from: a */
        public final long m69784a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getWhite50();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m69784a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.z1$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f94093w;

        public b(Function1 function1) {
            this.f94093w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f94093w.invoke((PerksListModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.z1$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f94094w;

        public c(Function1 function1) {
            this.f94094w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f94094w.invoke((FaqListModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.z1$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f94095w;

        public d(Function1 function1) {
            this.f94095w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f94095w.invoke((ShoppingTileCarouselModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.z1$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f94096w;

        public e(Function1 function1) {
            this.f94096w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f94096w.invoke((ShoppingTileModel) it);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final C23743y0 m69774h() {
        return f94091a;
    }

    /* JADX INFO: renamed from: i */
    private static final TextResource m69775i(int i13, String str) {
        int iCeil = (int) Math.ceil(((double) i13) / ((double) 100));
        String upperCase = str.toUpperCase(Locale.ROOT);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        return AbstractC8693b.m21278l(Currency.getInstance(upperCase).getSymbol() + iCeil);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:103:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:109:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:111:0x0302  */
    /* JADX WARN: Code duplicated, block: B:113:0x0320  */
    /* JADX WARN: Code duplicated, block: B:116:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x0145 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x02de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x01f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x01f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0108  */
    /* JADX WARN: Code duplicated, block: B:30:0x011f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0150  */
    /* JADX WARN: Code duplicated, block: B:40:0x015a  */
    /* JADX WARN: Code duplicated, block: B:41:0x015d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0169  */
    /* JADX WARN: Code duplicated, block: B:47:0x017c  */
    /* JADX WARN: Code duplicated, block: B:53:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:57:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:65:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:68:0x020f  */
    /* JADX WARN: Code duplicated, block: B:71:0x021f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0276 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x0278  */
    /* JADX WARN: Code duplicated, block: B:90:0x028b  */
    /* JADX WARN: Code duplicated, block: B:95:0x02a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:99:0x02ba A[DONT_INVERT] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    private static final C16849c m69776j(ShoppingTileModel shoppingTileModel) {
        AbstractC16851e abstractC16851e;
        AbstractC16851e cVar;
        ArrayList arrayList;
        ProductItems productItems;
        TextResource textResourceM21278l;
        TextResource textResourceM21278l2;
        TextResource textResource;
        TextResource textResource2;
        Iterator<T> it;
        Prices prices;
        String upperCase;
        String upperCase2;
        TextResource textResourceM21267a;
        Iterator it3;
        Object next;
        Iterator<T> it4;
        Prices prices2;
        String upperCase3;
        String upperCase4;
        int amount;
        Object next2;
        Iterator<T> it5;
        Prices prices3;
        String upperCase5;
        String upperCase6;
        int amount2;
        Iterator<T> it6;
        Object next3;
        String upperCase7;
        String upperCase8;
        boolean zM65745e = AbstractC22676k.m65745e(shoppingTileModel.getProduct().getProductInfo().getHandle(), "whoop-your-way-kit");
        boolean z4 = false;
        int i13 = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        if (shoppingTileModel.isWhoopPro() && shoppingTileModel.getProduct().getProductInfo().getProDiscount() != null) {
            cVar = new AbstractC16851e.f(new TextResource.C8688b(AbstractC16277f.f62365p2, new TextResource.AbstractC8690d.a(shoppingTileModel.getProduct().getProductInfo().getProDiscount())));
        } else if (shoppingTileModel.isWhoopPro() || shoppingTileModel.getProduct().getProductInfo().getDiscount() == null) {
            if (shoppingTileModel.getProduct().getProductInfo().getItems().isEmpty() || !((ProductItems) AbstractC25265s.m74096F0(shoppingTileModel.getProduct().getProductInfo().getItems())).getNew()) {
                if (shoppingTileModel.getProduct().getProductInfo().getItems().isEmpty() || !((ProductItems) AbstractC25265s.m74096F0(shoppingTileModel.getProduct().getProductInfo().getItems())).getProExclusive()) {
                    abstractC16851e = null;
                } else {
                    cVar = new AbstractC16851e.c(objArr2 == true ? 1 : 0, i13, objArr == true ? 1 : 0);
                }
                List<ProductItems> items = shoppingTileModel.getProduct().getProductInfo().getItems();
                arrayList = new ArrayList();
                for (Object obj : items) {
                    it6 = ((ProductItems) obj).getPrices().iterator();
                    do {
                        if (it6.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it6.next();
                        String currency = ((Prices) next3).getCurrency();
                        Locale locale = Locale.ROOT;
                        upperCase7 = currency.toUpperCase(locale);
                        AbstractC22676k.m65749i(upperCase7, "toUpperCase(...)");
                        upperCase8 = shoppingTileModel.getUserCurrencyCode().toUpperCase(locale);
                        AbstractC22676k.m65749i(upperCase8, "toUpperCase(...)");
                    } while (!upperCase7.equals(upperCase8));
                    if (next3 != null) {
                        arrayList.add(obj);
                    }
                }
                if (zM65745e) {
                    it3 = arrayList.iterator();
                    if (it3.hasNext()) {
                        next = it3.next();
                        if (it3.hasNext()) {
                            it4 = ((ProductItems) next).getPrices().iterator();
                            do {
                                if (it4.hasNext()) {
                                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                }
                                prices2 = (Prices) it4.next();
                                String currency2 = prices2.getCurrency();
                                Locale locale2 = Locale.ROOT;
                                upperCase3 = currency2.toUpperCase(locale2);
                                AbstractC22676k.m65749i(upperCase3, "toUpperCase(...)");
                                upperCase4 = shoppingTileModel.getUserCurrencyCode().toUpperCase(locale2);
                                AbstractC22676k.m65749i(upperCase4, "toUpperCase(...)");
                            } while (!upperCase3.equals(upperCase4));
                            amount = prices2.getAmount();
                            do {
                                next2 = it3.next();
                                it5 = ((ProductItems) next2).getPrices().iterator();
                                do {
                                    if (it5.hasNext()) {
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                    prices3 = (Prices) it5.next();
                                    String currency3 = prices3.getCurrency();
                                    Locale locale3 = Locale.ROOT;
                                    upperCase5 = currency3.toUpperCase(locale3);
                                    AbstractC22676k.m65749i(upperCase5, "toUpperCase(...)");
                                    upperCase6 = shoppingTileModel.getUserCurrencyCode().toUpperCase(locale3);
                                    AbstractC22676k.m65749i(upperCase6, "toUpperCase(...)");
                                } while (!upperCase5.equals(upperCase6));
                                amount2 = prices3.getAmount();
                                if (amount > amount2) {
                                    next = next2;
                                    amount = amount2;
                                }
                            } while (it3.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    productItems = (ProductItems) next;
                } else {
                    productItems = (ProductItems) AbstractC25265s.m74100H0(arrayList);
                }
                textResourceM21278l = AbstractC8693b.m21278l("");
                textResourceM21278l2 = AbstractC8693b.m21278l("");
                if (productItems != null) {
                    it = productItems.getPrices().iterator();
                    do {
                        if (it.hasNext()) {
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        prices = (Prices) it.next();
                        String currency4 = prices.getCurrency();
                        Locale locale4 = Locale.ROOT;
                        upperCase = currency4.toUpperCase(locale4);
                        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                        upperCase2 = shoppingTileModel.getUserCurrencyCode().toUpperCase(locale4);
                        AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
                    } while (!upperCase.equals(upperCase2));
                    if (shoppingTileModel.isWhoopPro() ? prices.getAmount() != prices.getSaleAmount() : prices.getProAmount() != prices.getProSaleAmount()) {
                    }
                    if (!z4 && shoppingTileModel.isWhoopPro()) {
                        textResourceM21267a = m69775i(prices.getProAmount(), shoppingTileModel.getUserCurrencyCode());
                    } else if (z4 || shoppingTileModel.isWhoopPro()) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                    } else {
                        textResourceM21267a = m69775i(prices.getAmount(), shoppingTileModel.getUserCurrencyCode());
                    }
                    textResourceM21278l = textResourceM21267a;
                    if (!z4 && shoppingTileModel.isWhoopPro()) {
                        textResourceM21278l2 = m69775i(prices.getProSaleAmount(), shoppingTileModel.getUserCurrencyCode());
                    } else if (!z4 && !shoppingTileModel.isWhoopPro()) {
                        textResourceM21278l2 = m69775i(prices.getSaleAmount(), shoppingTileModel.getUserCurrencyCode());
                    } else if (z4 && shoppingTileModel.isWhoopPro()) {
                        textResourceM21278l2 = m69775i(prices.getProAmount(), shoppingTileModel.getUserCurrencyCode());
                    } else {
                        textResourceM21278l2 = m69775i(prices.getAmount(), shoppingTileModel.getUserCurrencyCode());
                    }
                }
                textResource = textResourceM21278l2;
                textResource2 = textResourceM21278l;
                if (shoppingTileModel.isDiscovery()) {
                    return new C16849c(null, true, null, null, null, null, null, false, 253, null);
                }
                String handle = shoppingTileModel.getProduct().getProductInfo().getHandle();
                Media featuredMedia = shoppingTileModel.getProduct().getProductInfo().getFeaturedMedia();
                return new C16849c(handle, false, new AbstractC22403o.c(featuredMedia != null ? featuredMedia.getUrl() : null, 0, 0, 0, 14, null), AbstractC8693b.m21278l(shoppingTileModel.getProduct().getProductInfo().getTitle()), abstractC16851e, textResource2, textResource, shoppingTileModel.isWhoopPro(), 2, null);
            }
            cVar = new AbstractC16851e.d(objArr4 == true ? 1 : 0, i13, objArr3 == true ? 1 : 0);
        } else {
            cVar = new AbstractC16851e.f(new TextResource.C8688b(AbstractC16277f.f62365p2, new TextResource.AbstractC8690d.a(shoppingTileModel.getProduct().getProductInfo().getDiscount())));
        }
        abstractC16851e = cVar;
        List<ProductItems> items2 = shoppingTileModel.getProduct().getProductInfo().getItems();
        arrayList = new ArrayList();
        while (r1.hasNext()) {
            it6 = ((ProductItems) obj).getPrices().iterator();
            do {
                if (it6.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it6.next();
                String currency5 = ((Prices) next3).getCurrency();
                Locale locale5 = Locale.ROOT;
                upperCase7 = currency5.toUpperCase(locale5);
                AbstractC22676k.m65749i(upperCase7, "toUpperCase(...)");
                upperCase8 = shoppingTileModel.getUserCurrencyCode().toUpperCase(locale5);
                AbstractC22676k.m65749i(upperCase8, "toUpperCase(...)");
            } while (!upperCase7.equals(upperCase8));
            if (next3 != null) {
                arrayList.add(obj);
            }
        }
        if (zM65745e) {
            it3 = arrayList.iterator();
            if (it3.hasNext()) {
                next = null;
            } else {
                next = it3.next();
                if (it3.hasNext()) {
                    it4 = ((ProductItems) next).getPrices().iterator();
                    do {
                        if (it4.hasNext()) {
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        prices2 = (Prices) it4.next();
                        String currency6 = prices2.getCurrency();
                        Locale locale6 = Locale.ROOT;
                        upperCase3 = currency6.toUpperCase(locale6);
                        AbstractC22676k.m65749i(upperCase3, "toUpperCase(...)");
                        upperCase4 = shoppingTileModel.getUserCurrencyCode().toUpperCase(locale6);
                        AbstractC22676k.m65749i(upperCase4, "toUpperCase(...)");
                    } while (!upperCase3.equals(upperCase4));
                    amount = prices2.getAmount();
                    do {
                        next2 = it3.next();
                        it5 = ((ProductItems) next2).getPrices().iterator();
                        do {
                            if (it5.hasNext()) {
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            prices3 = (Prices) it5.next();
                            String currency7 = prices3.getCurrency();
                            Locale locale7 = Locale.ROOT;
                            upperCase5 = currency7.toUpperCase(locale7);
                            AbstractC22676k.m65749i(upperCase5, "toUpperCase(...)");
                            upperCase6 = shoppingTileModel.getUserCurrencyCode().toUpperCase(locale7);
                            AbstractC22676k.m65749i(upperCase6, "toUpperCase(...)");
                        } while (!upperCase5.equals(upperCase6));
                        amount2 = prices3.getAmount();
                        if (amount > amount2) {
                            next = next2;
                            amount = amount2;
                        }
                    } while (it3.hasNext());
                }
            }
            productItems = (ProductItems) next;
        } else {
            productItems = (ProductItems) AbstractC25265s.m74100H0(arrayList);
        }
        textResourceM21278l = AbstractC8693b.m21278l("");
        textResourceM21278l2 = AbstractC8693b.m21278l("");
        if (productItems != null) {
            it = productItems.getPrices().iterator();
            do {
                if (it.hasNext()) {
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                prices = (Prices) it.next();
                String currency8 = prices.getCurrency();
                Locale locale8 = Locale.ROOT;
                upperCase = currency8.toUpperCase(locale8);
                AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                upperCase2 = shoppingTileModel.getUserCurrencyCode().toUpperCase(locale8);
                AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
            } while (!upperCase.equals(upperCase2));
            z4 = shoppingTileModel.isWhoopPro() ? true : true;
            if (!z4) {
                if (z4) {
                    textResourceM21267a = AbstractC8693b.m21267a();
                } else {
                    textResourceM21267a = AbstractC8693b.m21267a();
                }
            } else if (z4) {
                textResourceM21267a = AbstractC8693b.m21267a();
            } else {
                textResourceM21267a = AbstractC8693b.m21267a();
            }
            textResourceM21278l = textResourceM21267a;
            if (!z4) {
                if (!z4) {
                    if (z4) {
                        textResourceM21278l2 = m69775i(prices.getAmount(), shoppingTileModel.getUserCurrencyCode());
                    } else {
                        textResourceM21278l2 = m69775i(prices.getAmount(), shoppingTileModel.getUserCurrencyCode());
                    }
                } else if (z4) {
                    textResourceM21278l2 = m69775i(prices.getAmount(), shoppingTileModel.getUserCurrencyCode());
                } else {
                    textResourceM21278l2 = m69775i(prices.getAmount(), shoppingTileModel.getUserCurrencyCode());
                }
            } else if (!z4) {
                if (z4) {
                    textResourceM21278l2 = m69775i(prices.getAmount(), shoppingTileModel.getUserCurrencyCode());
                } else {
                    textResourceM21278l2 = m69775i(prices.getAmount(), shoppingTileModel.getUserCurrencyCode());
                }
            } else if (z4) {
                textResourceM21278l2 = m69775i(prices.getAmount(), shoppingTileModel.getUserCurrencyCode());
            } else {
                textResourceM21278l2 = m69775i(prices.getAmount(), shoppingTileModel.getUserCurrencyCode());
            }
        }
        textResource = textResourceM21278l2;
        textResource2 = textResourceM21278l;
        if (shoppingTileModel.isDiscovery()) {
            return new C16849c(null, true, null, null, null, null, null, false, 253, null);
        }
        String handle2 = shoppingTileModel.getProduct().getProductInfo().getHandle();
        Media featuredMedia2 = shoppingTileModel.getProduct().getProductInfo().getFeaturedMedia();
        return new C16849c(handle2, false, new AbstractC22403o.c(featuredMedia2 != null ? featuredMedia2.getUrl() : null, 0, 0, 0, 14, null), AbstractC8693b.m21278l(shoppingTileModel.getProduct().getProductInfo().getTitle()), abstractC16851e, textResource2, textResource, shoppingTileModel.isWhoopPro(), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m69777k(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        C23714t1 c23714t1 = new C23714t1(5);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(PerksListModel.class), new b(c23714t1));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(FaqListModel.class), new c(new C23714t1(6)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ShoppingTileCarouselModel.class), new d(new C23714t1(7)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ShoppingTileModel.class), new e(new C23714t1(8)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C11776d m69778l(PerksListModel model) {
        AbstractC22676k.m65750j(model, "model");
        List<PerksModel> perks = model.getPerks();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(perks, 10));
        for (PerksModel perksModel : perks) {
            arrayList.add(new C31069e(AbstractC8693b.m21278l(perksModel.getDescription()), AbstractC16315n0.m46381f(perksModel.getIcon(), null, 1, null)));
        }
        return new C11776d(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C39235c m69779m(FaqListModel model) {
        AbstractC22676k.m65750j(model, "model");
        List<FaqModel> faqs = model.getFaqs();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(faqs, 10));
        for (FaqModel faqModel : faqs) {
            arrayList.add(new C3998c(AbstractC8693b.m21278l(faqModel.getQuestion()), AbstractC8693b.m21278l(faqModel.getAnswer()), false, 4, null));
        }
        return new C39235c(AbstractC8693b.m21278l(model.getTitle()), AbstractC8693b.m21278l(model.getCta()), model.getTarget(), arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C16934f m69780n(ShoppingTileCarouselModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C16934f(model.getHandle(), AbstractC8693b.m21278l(model.getTitle()), model.isWhoopPro() ? AbstractC18249c.m52572j(new C23670m(20)) : AbstractC18249c.m52574l(a.f94092w), null, AbstractC8693b.m21278l(model.getCta()), null, true, false, AbstractC21537c.m60554d(new C23670m(19)).m60540g(model.getTiles()), null, null, null, false, 7848, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m69781o(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final AbstractC17911t m69782p(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        return AbstractC15673b0.m44001O0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C16849c m69783q(ShoppingTileModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69776j(model);
    }
}
