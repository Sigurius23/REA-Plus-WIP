package tz1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.ShippingProgressBarModel;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.AbstractC23662k4;
import p716lb1.C23749z0;
import p720m91.InterfaceC25312u;
import p736sz0.C33167b1;
import qz1.AbstractC30797b;
import qz1.AbstractC30798c;
import qz1.AbstractC30799d;
import t71.C33572i;

/* JADX INFO: renamed from: tz1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m65681d2 = {"Ljb1/a;", "a", "Ljb1/a;", "d", "()Ljb1/a;", "nativeStoreReducer", "native-store_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34281c {

    /* JADX INFO: renamed from: a */
    private static final C21535a f143984a = AbstractC21537c.m60554d(new C33572i(25));

    /* JADX INFO: renamed from: tz1.c$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f143985w;

        public a(Function1 function1) {
            this.f143985w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f143985w.invoke((ShippingProgressBarModel) it);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final C21535a m108567d() {
        return f143984a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m108568e(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60548c(AbstractC30797b.m94719d().getModelMapper());
        designItemReducer.m60548c(AbstractC30799d.m94738d().getModelMapper());
        designItemReducer.m60548c(AbstractC30798c.m94729d().getModelMapper());
        designItemReducer.m60547b(new C33572i(26));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m108569f(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        addModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(ShippingProgressBarModel.class), new a(new C33572i(27)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C33167b1 m108570g(ShippingProgressBarModel model) {
        AbstractC22676k.m65750j(model, "model");
        return AbstractC23662k4.m68991a(model);
    }
}
