package yz1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.nativestore.pdp.domain.model.ProductVariantSelectorModel;
import com.whoop.nativestore.pdp.domain.model.SelectorLevel;
import com.whoop.nativestore.pdp.domain.model.SelectorOption;
import com.whoop.nativestore.pdp.domain.model.SelectorType;
import com.whoop.nativestore.pdp.domain.model.SizeChart;
import h02.C16577i0;
import h02.C16583l0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import kd1.AbstractC22404p;
import l83.C23454a0;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23749z0;
import p720m91.InterfaceC25312u;
import yv0.C39805h;

/* JADX INFO: renamed from: yz1.f */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\t\"\u001a\u0010\u000f\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;", "Lh02/i0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;)Lh02/i0;", "Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;", "Lcom/whoop/nativestore/pdp/domain/model/SelectorType;", "type", "Lh02/l0;", "i", "(Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;Lcom/whoop/nativestore/pdp/domain/model/SelectorType;)Lh02/l0;", "Ljb1/a;", "a", "Ljb1/a;", "d", "()Ljb1/a;", "productVariantSelectorReducer", "native-store_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39912f {

    /* JADX INFO: renamed from: a */
    private static final C21535a f172313a = AbstractC21537c.m60554d(new C39805h(26));

    /* JADX INFO: renamed from: yz1.f$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f172314w;

        public a(Function1 function1) {
            this.f172314w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f172314w.invoke((ProductVariantSelectorModel) it);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final C21535a m128063d() {
        return f172313a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m128064e(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C39805h(27));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m128065f(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        addModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(ProductVariantSelectorModel.class), new a(new C39805h(28)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C16577i0 m128066g(ProductVariantSelectorModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m128067h(model);
    }

    /* JADX INFO: renamed from: h */
    public static final C16577i0 m128067h(ProductVariantSelectorModel productVariantSelectorModel) {
        AbstractC22676k.m65750j(productVariantSelectorModel, "<this>");
        SelectorLevel level = productVariantSelectorModel.getLevel();
        String title = productVariantSelectorModel.getTitle();
        SelectorType type = productVariantSelectorModel.getType();
        List<SelectorOption> options = productVariantSelectorModel.getOptions();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(options, 10));
        Iterator<T> it = options.iterator();
        while (it.hasNext()) {
            arrayList.add(m128068i((SelectorOption) it.next(), productVariantSelectorModel.getType()));
        }
        SizeChart sizeChart = productVariantSelectorModel.getSizeChart();
        SelectorOption selectedOption = productVariantSelectorModel.getSelectedOption();
        return new C16577i0(level, title, type, arrayList, sizeChart, selectedOption != null ? m128068i(selectedOption, productVariantSelectorModel.getType()) : null, productVariantSelectorModel.getVariantSelectorIndex(), productVariantSelectorModel.getPackItemId(), productVariantSelectorModel.getPackItemProductKey());
    }

    /* JADX INFO: renamed from: i */
    private static final C16583l0 m128068i(SelectorOption selectorOption, SelectorType selectorType) {
        return new C16583l0(selectorOption.getKey(), selectorType == SelectorType.TEXT ? selectorOption.getContent() : "", selectorType == SelectorType.IMAGE ? AbstractC22404p.m64503l(selectorOption.getContent()) : null, selectorOption.getLabel(), selectorOption.getHasStock());
    }
}
