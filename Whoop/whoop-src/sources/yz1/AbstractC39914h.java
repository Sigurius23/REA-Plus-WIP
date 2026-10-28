package yz1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.nativestore.pdp.domain.model.PriceBreakdownItemModel;
import com.whoop.nativestore.pdp.domain.model.WhoopYourWayPriceBreakdownAccordionModel;
import h02.C16580k;
import h02.C16591p0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import l83.C23454a0;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23749z0;
import p720m91.InterfaceC25312u;
import yv0.C39805h;

/* JADX INFO: renamed from: yz1.h */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\"\u001a\u0010\r\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayPriceBreakdownAccordionModel;", "Lh02/p0;", "e", "(Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayPriceBreakdownAccordionModel;)Lh02/p0;", "Lcom/whoop/nativestore/pdp/domain/model/PriceBreakdownItemModel;", "Lh02/k;", "f", "(Lcom/whoop/nativestore/pdp/domain/model/PriceBreakdownItemModel;)Lh02/k;", "Ljb1/a;", "a", "Ljb1/a;", "d", "()Ljb1/a;", "whoopYourWayPriceBreakdownAccordionReducer", "native-store_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39914h {

    /* JADX INFO: renamed from: a */
    private static final C21535a f172316a = AbstractC21537c.m60554d(new C39805h(29));

    /* JADX INFO: renamed from: yz1.h$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f172317w;

        public a(Function1 function1) {
            this.f172317w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f172317w.invoke((WhoopYourWayPriceBreakdownAccordionModel) it);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final C21535a m128073d() {
        return f172316a;
    }

    /* JADX INFO: renamed from: e */
    public static final C16591p0 m128074e(WhoopYourWayPriceBreakdownAccordionModel whoopYourWayPriceBreakdownAccordionModel) {
        AbstractC22676k.m65750j(whoopYourWayPriceBreakdownAccordionModel, "<this>");
        String title = whoopYourWayPriceBreakdownAccordionModel.getTitle();
        List<PriceBreakdownItemModel> items = whoopYourWayPriceBreakdownAccordionModel.getItems();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(m128075f((PriceBreakdownItemModel) it.next()));
        }
        return new C16591p0(title, arrayList, true);
    }

    /* JADX INFO: renamed from: f */
    private static final C16580k m128075f(PriceBreakdownItemModel priceBreakdownItemModel) {
        return new C16580k(priceBreakdownItemModel.getId(), priceBreakdownItemModel.getLabel(), priceBreakdownItemModel.getCost(), priceBreakdownItemModel.isStatic());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m128076g(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C39913g(0));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m128077h(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        addModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(WhoopYourWayPriceBreakdownAccordionModel.class), new a(new C39913g(1)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C16591p0 m128078i(WhoopYourWayPriceBreakdownAccordionModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m128074e(model);
    }
}
