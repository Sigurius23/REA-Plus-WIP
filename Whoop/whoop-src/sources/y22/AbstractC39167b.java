package y22;

import c32.AbstractC3933a;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.payments.stripebottomsheettile.model.StripeBottomSheetTileModel;
import g32.C15312l;
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
import xl0.C38448b;

/* JADX INFO: renamed from: y22.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002¨\u0006\u0004"}, m65681d2 = {"Ljb1/a;", "a", "Ljb1/a;", "itemReducer", "payments_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39167b {

    /* JADX INFO: renamed from: a */
    private static final C21535a f168404a = AbstractC21537c.m60554d(new C38448b(24));

    /* JADX INFO: renamed from: y22.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f168405w;

        public a(Function1 function1) {
            this.f168405w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f168405w.invoke((StripeBottomSheetTileModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m124753e(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C38448b(25));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m124754f(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        addModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(StripeBottomSheetTileModel.class), new a(new C38448b(26)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C15312l m124755g(StripeBottomSheetTileModel model) {
        AbstractC22676k.m65750j(model, "model");
        return AbstractC3933a.m11976d(model, "PAYMENT_V2");
    }
}
