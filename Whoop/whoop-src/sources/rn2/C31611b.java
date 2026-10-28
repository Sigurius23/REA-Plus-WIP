package rn2;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.universalcheckout.features.buynow.domain.models.items.BuyNowCheckoutInfoModel;
import com.whoop.universalcheckout.features.buynow.domain.models.items.BuyNowItemModel;
import jb1.InterfaceC21538d;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p716lb1.C23743y0;
import p716lb1.C23749z0;
import p720m91.InterfaceC25312u;
import wn2.AbstractC37426d;
import xn2.C38484c;
import xn2.C38488g;

/* JADX INFO: renamed from: rn2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lrn2/b;", "Ljb1/d;", "<init>", "()V", "Llb1/y0;", "a", "()Llb1/y0;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final class C31611b implements InterfaceC21538d {

    /* JADX INFO: renamed from: rn2.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f130627w;

        public a(Function1 function1) {
            this.f130627w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f130627w.invoke((BuyNowItemModel) it);
        }
    }

    /* JADX INFO: renamed from: rn2.b$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f130628w;

        public b(Function1 function1) {
            this.f130628w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f130628w.invoke((BuyNowCheckoutInfoModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C38488g m97644d(BuyNowItemModel model) {
        AbstractC22676k.m65750j(model, "model");
        return AbstractC37426d.m119809m(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C38484c m97645e(BuyNowCheckoutInfoModel model) {
        AbstractC22676k.m65750j(model, "model");
        return AbstractC37426d.m119808l(model);
    }

    @Override // jb1.InterfaceC21538d
    /* JADX INFO: renamed from: a */
    public C23743y0 mo1796a() {
        C23749z0 c23749z0 = new C23749z0();
        final int i13 = 0;
        Function1 function1 = new Function1() { // from class: rn2.a
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i13) {
                    case 0:
                        return C31611b.m97644d((BuyNowItemModel) obj);
                    default:
                        return C31611b.m97645e((BuyNowCheckoutInfoModel) obj);
                }
            }
        };
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(BuyNowItemModel.class), new a(function1));
        final int i14 = 1;
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(BuyNowCheckoutInfoModel.class), new b(new Function1() { // from class: rn2.a
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        return C31611b.m97644d((BuyNowItemModel) obj);
                    default:
                        return C31611b.m97645e((BuyNowCheckoutInfoModel) obj);
                }
            }
        }));
        return c23749z0.m69766b();
    }
}
