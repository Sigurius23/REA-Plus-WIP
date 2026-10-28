package qz1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.nativestore.home.domain.model.ShopBannerCarouselModel;
import com.whoop.nativestore.home.domain.model.ShopBannerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import kd1.AbstractC22403o;
import l83.C23454a0;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23749z0;
import p720m91.InterfaceC25312u;
import p730qt2.C30617w;
import uz1.C35437o;
import uz1.C35440r;

/* JADX INFO: renamed from: qz1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\"\u001a\u0010\r\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"Lcom/whoop/nativestore/home/domain/model/ShopBannerCarouselModel;", "Luz1/o;", "e", "(Lcom/whoop/nativestore/home/domain/model/ShopBannerCarouselModel;)Luz1/o;", "Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;", "Luz1/r;", "f", "(Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;)Luz1/r;", "Ljb1/a;", "a", "Ljb1/a;", "d", "()Ljb1/a;", "shopBannerCarouselReducer", "native-store_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30797b {

    /* JADX INFO: renamed from: a */
    private static final C21535a f126941a = AbstractC21537c.m60554d(new C30617w(3));

    /* JADX INFO: renamed from: qz1.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f126942w;

        public a(Function1 function1) {
            this.f126942w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f126942w.invoke((ShopBannerCarouselModel) it);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final C21535a m94719d() {
        return f126941a;
    }

    /* JADX INFO: renamed from: e */
    public static final C35437o m94720e(ShopBannerCarouselModel shopBannerCarouselModel) {
        AbstractC22676k.m65750j(shopBannerCarouselModel, "<this>");
        List<ShopBannerModel> banners = shopBannerCarouselModel.getBanners();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(banners, 10));
        Iterator<T> it = banners.iterator();
        while (it.hasNext()) {
            arrayList.add(m94721f((ShopBannerModel) it.next()));
        }
        return new C35437o(arrayList);
    }

    /* JADX INFO: renamed from: f */
    private static final C35440r m94721f(ShopBannerModel shopBannerModel) {
        String title = shopBannerModel.getTitle();
        String subCopy = shopBannerModel.getSubCopy();
        String ctaText = shopBannerModel.getCtaText();
        String backgroundMedia = shopBannerModel.getBackgroundMedia();
        return new C35440r(title, subCopy, ctaText, backgroundMedia != null ? new AbstractC22403o.c(backgroundMedia, 0, 0, 0, 14, null) : null, shopBannerModel.getDestination(), shopBannerModel.getIndex(), shopBannerModel.getAnalyticsValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m94722g(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C30617w(4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m94723h(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        addModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(ShopBannerCarouselModel.class), new a(new C30617w(5)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C35437o m94724i(ShopBannerCarouselModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m94720e(model);
    }
}
