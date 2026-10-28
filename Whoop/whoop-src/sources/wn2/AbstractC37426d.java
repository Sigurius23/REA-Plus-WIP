package wn2;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.universalcheckout.features.buynow.domain.models.items.BuyNowCheckoutInfoCtaModel;
import com.whoop.universalcheckout.features.buynow.domain.models.items.BuyNowCheckoutInfoModel;
import com.whoop.universalcheckout.features.buynow.domain.models.items.BuyNowItemModel;
import com.whoop.universalcheckout.features.checkout.domain.models.items.CheckoutFooterModel;
import io2.C20762h;
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
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p716lb1.C23749z0;
import p720m91.InterfaceC25312u;
import wd3.C37168b;
import xn2.C38484c;
import xn2.C38488g;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: wn2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\"\u001a\u0010\r\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowItemModel;", "Lxn2/g;", "m", "(Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowItemModel;)Lxn2/g;", "Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowCheckoutInfoModel;", "Lxn2/c;", "l", "(Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowCheckoutInfoModel;)Lxn2/c;", "Ljb1/a;", "a", "Ljb1/a;", "k", "()Ljb1/a;", "buyNowDesignItemReducer", "universal-checkout_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37426d {

    /* JADX INFO: renamed from: a */
    private static final C21535a f160173a = AbstractC21537c.m60554d(new C37168b(14));

    /* JADX INFO: renamed from: wn2.d$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f160174w;

        public a(Function1 function1) {
            this.f160174w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f160174w.invoke((BuyNowItemModel) it);
        }
    }

    /* JADX INFO: renamed from: wn2.d$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f160175w;

        public b(Function1 function1) {
            this.f160175w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f160175w.invoke((BuyNowCheckoutInfoModel) it);
        }
    }

    /* JADX INFO: renamed from: wn2.d$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f160176w;

        public c(Function1 function1) {
            this.f160176w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f160176w.invoke((CheckoutFooterModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m119802f(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C37168b(15));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m119803g(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        C37168b c37168b = new C37168b(16);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(BuyNowItemModel.class), new a(c37168b));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(BuyNowCheckoutInfoModel.class), new b(new C37168b(17)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(CheckoutFooterModel.class), new c(new C37168b(18)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C38488g m119804h(BuyNowItemModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m119809m(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C38484c m119805i(BuyNowCheckoutInfoModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m119808l(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C20762h m119806j(CheckoutFooterModel model) {
        AbstractC22676k.m65750j(model, "model");
        return AbstractC25718a.m75817t(model);
    }

    /* JADX INFO: renamed from: k */
    public static final C21535a m119807k() {
        return f160173a;
    }

    /* JADX INFO: renamed from: l */
    public static final C38484c m119808l(BuyNowCheckoutInfoModel buyNowCheckoutInfoModel) {
        C9598e destination;
        AbstractC22676k.m65750j(buyNowCheckoutInfoModel, "<this>");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(buyNowCheckoutInfoModel.getTotalLabel());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(buyNowCheckoutInfoModel.getTotalAmount());
        BuyNowCheckoutInfoCtaModel cta = buyNowCheckoutInfoModel.getCta();
        String textDisplay = cta != null ? cta.getTextDisplay() : null;
        if (textDisplay == null) {
            textDisplay = "";
        }
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(textDisplay);
        BuyNowCheckoutInfoCtaModel cta2 = buyNowCheckoutInfoModel.getCta();
        return new C38484c(textResourceM21278l, textResourceM21278l2, textResourceM21278l3, (cta2 == null || (destination = cta2.getDestination()) == null || AbstractC22676k.m65745e(destination.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9318g6.f27632w)) ? null : destination, AbstractC8693b.m21278l(buyNowCheckoutInfoModel.getDisclaimerText()));
    }

    /* JADX INFO: renamed from: m */
    public static final C38488g m119809m(BuyNowItemModel buyNowItemModel) {
        ArrayList arrayList;
        AbstractC22676k.m65750j(buyNowItemModel, "<this>");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(buyNowItemModel.getTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(buyNowItemModel.getSubtitle());
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(buyNowItemModel.getDescription());
        String image = buyNowItemModel.getImage();
        if (AbstractC39414r.m125890i0(image)) {
            image = null;
        }
        AbstractC22403o abstractC22403oM64503l = image != null ? AbstractC22404p.m64503l(image) : null;
        List<String> stackedImages = buyNowItemModel.getStackedImages();
        if (stackedImages != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : stackedImages) {
                if (!AbstractC39414r.m125890i0((String) obj)) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(AbstractC22404p.m64503l((String) it.next()));
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        return new C38488g(textResourceM21278l, textResourceM21278l2, textResourceM21278l3, abstractC22403oM64503l, arrayList, buyNowItemModel.getLineItemId(), buyNowItemModel.getAnalyticsLabel());
    }
}
