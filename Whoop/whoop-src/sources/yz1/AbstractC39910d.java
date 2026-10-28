package yz1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.nativestore.pdp.domain.model.ProductAttribute;
import com.whoop.nativestore.pdp.domain.model.ProductDetailsSectionModel;
import h02.C16597u;
import h02.C16600x;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
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
import yv0.C39805h;

/* JADX INFO: renamed from: yz1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/nativestore/pdp/domain/model/ProductDetailsSectionModel;", "Lh02/x;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/nativestore/pdp/domain/model/ProductDetailsSectionModel;)Lh02/x;", "Ljb1/a;", "a", "Ljb1/a;", "d", "()Ljb1/a;", "productDetailsSectionReducer", "native-store_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39910d {

    /* JADX INFO: renamed from: a */
    private static final C21535a f172311a = AbstractC21537c.m60554d(new C39805h(23));

    /* JADX INFO: renamed from: yz1.d$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f172312w;

        public a(Function1 function1) {
            this.f172312w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f172312w.invoke((ProductDetailsSectionModel) it);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final C21535a m128052d() {
        return f172311a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m128053e(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C39805h(24));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m128054f(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        addModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(ProductDetailsSectionModel.class), new a(new C39805h(25)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C16600x m128055g(ProductDetailsSectionModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m128056h(model);
    }

    /* JADX INFO: renamed from: h */
    public static final C16600x m128056h(ProductDetailsSectionModel productDetailsSectionModel) {
        AbstractC22676k.m65750j(productDetailsSectionModel, "<this>");
        String header = productDetailsSectionModel.getHeader();
        List<ProductAttribute> attributes = productDetailsSectionModel.getAttributes();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(attributes, 10));
        for (ProductAttribute productAttribute : attributes) {
            arrayList.add(new C16597u(new AbstractC22403o.c(productAttribute.getIconUrl(), 0, 0, 0, 14, null), productAttribute.getText()));
        }
        return new C16600x(header, arrayList, productDetailsSectionModel.getDescription());
    }
}
