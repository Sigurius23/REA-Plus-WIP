package eo2;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.CardButtonModel;
import com.whoop.design.models.items.ShippingProgressBarModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.universalcheckout.features.cart.domain.models.items.CartItemModel;
import com.whoop.universalcheckout.features.cart.domain.models.items.EmptyCartContentModel;
import com.whoop.universalcheckout.features.checkout.domain.models.items.CheckoutInfoModel;
import ej1.C13251n;
import fo2.C14666d;
import fo2.C14670h;
import io2.C20768k;
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
import mn2.AbstractC25718a;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.C27256h;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p716lb1.AbstractC23613d4;
import p716lb1.AbstractC23662k4;
import p716lb1.C23749z0;
import p720m91.InterfaceC25312u;
import p736sz0.C33167b1;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: eo2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u001a\u0010\r\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;", "Lfo2/d;", "p", "(Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;)Lfo2/d;", "Lcom/whoop/universalcheckout/features/cart/domain/models/items/EmptyCartContentModel;", "Lfo2/h;", "q", "(Lcom/whoop/universalcheckout/features/cart/domain/models/items/EmptyCartContentModel;)Lfo2/h;", "Ljb1/a;", "a", "Ljb1/a;", "o", "()Ljb1/a;", "cartReducer", "universal-checkout_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13382b {

    /* JADX INFO: renamed from: a */
    private static final C21535a f46834a = AbstractC21537c.m60554d(new C13251n(20));

    /* JADX INFO: renamed from: eo2.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f46835w;

        public a(Function1 function1) {
            this.f46835w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f46835w.invoke((CartItemModel) it);
        }
    }

    /* JADX INFO: renamed from: eo2.b$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f46836w;

        public b(Function1 function1) {
            this.f46836w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f46836w.invoke((EmptyCartContentModel) it);
        }
    }

    /* JADX INFO: renamed from: eo2.b$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f46837w;

        public c(Function1 function1) {
            this.f46837w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f46837w.invoke((CheckoutInfoModel) it);
        }
    }

    /* JADX INFO: renamed from: eo2.b$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f46838w;

        public d(Function1 function1) {
            this.f46838w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f46838w.invoke((CardButtonModel) it);
        }
    }

    /* JADX INFO: renamed from: eo2.b$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f46839w;

        public e(Function1 function1) {
            this.f46839w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f46839w.invoke((ShippingProgressBarModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m37753h(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C13251n(21));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m37754i(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        C13251n c13251n = new C13251n(22);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(CartItemModel.class), new a(c13251n));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(EmptyCartContentModel.class), new b(new C13251n(23)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(CheckoutInfoModel.class), new c(new C13251n(24)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(CardButtonModel.class), new d(new C13251n(25)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ShippingProgressBarModel.class), new e(new C13251n(26)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C14666d m37755j(CartItemModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m37761p(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C14670h m37756k(EmptyCartContentModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m37762q(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C20768k m37757l(CheckoutInfoModel model) {
        AbstractC22676k.m65750j(model, "model");
        return AbstractC25718a.m75818u(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C27256h m37758m(CardButtonModel model) {
        AbstractC22676k.m65750j(model, "model");
        return AbstractC23613d4.m68662l(model, null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C33167b1 m37759n(ShippingProgressBarModel model) {
        AbstractC22676k.m65750j(model, "model");
        return AbstractC23662k4.m68991a(model);
    }

    /* JADX INFO: renamed from: o */
    public static final C21535a m37760o() {
        return f46834a;
    }

    /* JADX INFO: renamed from: p */
    public static final C14666d m37761p(CartItemModel cartItemModel) {
        ArrayList arrayList;
        AbstractC22676k.m65750j(cartItemModel, "<this>");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(cartItemModel.getTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(cartItemModel.getSubtitle());
        String image = cartItemModel.getImage();
        if (AbstractC39414r.m125890i0(image)) {
            image = null;
        }
        AbstractC22403o abstractC22403oM64503l = image != null ? AbstractC22404p.m64503l(image) : null;
        List<String> stackedImages = cartItemModel.getStackedImages();
        if (stackedImages != null) {
            List<String> list = stackedImages;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC22404p.m64503l((String) it.next()));
            }
        } else {
            arrayList = null;
        }
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(cartItemModel.getPrice());
        String strikethroughPrice = cartItemModel.getStrikethroughPrice();
        return new C14666d(textResourceM21278l, textResourceM21278l2, abstractC22403oM64503l, arrayList, textResourceM21278l3, strikethroughPrice != null ? AbstractC8693b.m21278l(strikethroughPrice) : null, cartItemModel.getQuantity(), cartItemModel.getMinQuantity(), cartItemModel.getMaxQuantity(), cartItemModel.getMinQuantity() == cartItemModel.getMaxQuantity(), cartItemModel.getHideQuantity(), cartItemModel.getLineItemId(), cartItemModel.getAnalyticsLabel(), false, DfuBaseService.ERROR_REMOTE_MASK, null);
    }

    /* JADX INFO: renamed from: q */
    public static final C14670h m37762q(EmptyCartContentModel emptyCartContentModel) {
        AbstractC22676k.m65750j(emptyCartContentModel, "<this>");
        return new C14670h(emptyCartContentModel.getIcon(), AbstractC8693b.m21278l(emptyCartContentModel.getText()));
    }
}
