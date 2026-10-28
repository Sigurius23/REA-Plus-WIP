package yz1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.nativestore.pdp.domain.model.ProductAccordionEntry;
import com.whoop.nativestore.pdp.domain.model.ProductAccordionListModel;
import h02.C16582l;
import h02.C16588o;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
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

/* JADX INFO: renamed from: yz1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\"\u001a\u0010\r\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"Lcom/whoop/nativestore/pdp/domain/model/ProductAccordionListModel;", "Lh02/o;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/nativestore/pdp/domain/model/ProductAccordionListModel;)Lh02/o;", "Lcom/whoop/nativestore/pdp/domain/model/ProductAccordionEntry;", "Lh02/l;", "i", "(Lcom/whoop/nativestore/pdp/domain/model/ProductAccordionEntry;)Lh02/l;", "Ljb1/a;", "a", "Ljb1/a;", "d", "()Ljb1/a;", "productAccordionListReducer", "native-store_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39908b {

    /* JADX INFO: renamed from: a */
    private static final C21535a f172307a = AbstractC21537c.m60554d(new C39805h(17));

    /* JADX INFO: renamed from: yz1.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f172308w;

        public a(Function1 function1) {
            this.f172308w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f172308w.invoke((ProductAccordionListModel) it);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final C21535a m128033d() {
        return f172307a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m128034e(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C39805h(18));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m128035f(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        addModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(ProductAccordionListModel.class), new a(new C39805h(19)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C16588o m128036g(ProductAccordionListModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m128037h(model);
    }

    /* JADX INFO: renamed from: h */
    public static final C16588o m128037h(ProductAccordionListModel productAccordionListModel) {
        AbstractC22676k.m65750j(productAccordionListModel, "<this>");
        List<ProductAccordionEntry> accordions = productAccordionListModel.getAccordions();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(accordions, 10));
        Iterator<T> it = accordions.iterator();
        while (it.hasNext()) {
            arrayList.add(m128038i((ProductAccordionEntry) it.next()));
        }
        return new C16588o(arrayList);
    }

    /* JADX INFO: renamed from: i */
    private static final C16582l m128038i(ProductAccordionEntry productAccordionEntry) {
        return new C16582l(AbstractC8693b.m21278l(productAccordionEntry.getTitle()), AbstractC8693b.m21278l(productAccordionEntry.getAnnotatedText().getText()), false, 4, null);
    }
}
