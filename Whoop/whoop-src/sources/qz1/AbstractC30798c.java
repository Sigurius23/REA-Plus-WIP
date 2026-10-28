package qz1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.nativestore.home.domain.model.ShopCategoryModel;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import kd1.AbstractC22403o;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23749z0;
import p720m91.InterfaceC25312u;
import p730qt2.C30617w;
import uz1.C35443u;

/* JADX INFO: renamed from: qz1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/nativestore/home/domain/model/ShopCategoryModel;", "Luz1/u;", "e", "(Lcom/whoop/nativestore/home/domain/model/ShopCategoryModel;)Luz1/u;", "Ljb1/a;", "a", "Ljb1/a;", "d", "()Ljb1/a;", "shopCategoryReducer", "native-store_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30798c {

    /* JADX INFO: renamed from: a */
    private static final C21535a f126943a = AbstractC21537c.m60554d(new C30617w(6));

    /* JADX INFO: renamed from: qz1.c$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f126944w;

        public a(Function1 function1) {
            this.f126944w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f126944w.invoke((ShopCategoryModel) it);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final C21535a m94729d() {
        return f126943a;
    }

    /* JADX INFO: renamed from: e */
    public static final C35443u m94730e(ShopCategoryModel shopCategoryModel) {
        AbstractC22676k.m65750j(shopCategoryModel, "<this>");
        AbstractC22403o.c cVar = new AbstractC22403o.c(shopCategoryModel.getImageUrl(), 0, 0, 0, 14, null);
        String title = shopCategoryModel.getTitle();
        if (title == null) {
            title = "";
        }
        return new C35443u(cVar, title, shopCategoryModel.getInternalName(), shopCategoryModel.getAnalyticsValue(), shopCategoryModel.getDestination());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m94731f(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C30617w(7));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m94732g(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        addModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(ShopCategoryModel.class), new a(new C30617w(8)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C35443u m94733h(ShopCategoryModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m94730e(model);
    }
}
