package yz1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.nativestore.pdp.domain.model.PackItemModel;
import h02.C16564c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23749z0;
import p720m91.InterfaceC25312u;
import yv0.C39805h;

/* JADX INFO: renamed from: yz1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/nativestore/pdp/domain/model/PackItemModel;", "Lh02/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/nativestore/pdp/domain/model/PackItemModel;)Lh02/c;", "Ljb1/a;", "a", "Ljb1/a;", "d", "()Ljb1/a;", "packItemReducer", "native-store_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39907a {

    /* JADX INFO: renamed from: a */
    private static final C21535a f172305a = AbstractC21537c.m60554d(new C39805h(14));

    /* JADX INFO: renamed from: yz1.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f172306w;

        public a(Function1 function1) {
            this.f172306w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f172306w.invoke((PackItemModel) it);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final C21535a m128024d() {
        return f172305a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m128025e(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C39805h(15));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m128026f(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        addModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(PackItemModel.class), new a(new C39805h(16)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C16564c m128027g(PackItemModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m128028h(model);
    }

    /* JADX INFO: renamed from: h */
    public static final C16564c m128028h(PackItemModel packItemModel) {
        AbstractC22676k.m65750j(packItemModel, "<this>");
        return new C16564c(packItemModel.getPackItemId(), packItemModel.getPackItemProductKey(), packItemModel.getImageUrl(), packItemModel.getTitle(), packItemModel.getSubtitle(), packItemModel.getCta().getTextDisplay(), packItemModel.getCta().getTrailingIcon(), packItemModel.getCta().getDestination());
    }
}
