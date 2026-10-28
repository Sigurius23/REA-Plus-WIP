package c03;

import a11.C0129g;
import a13.C0148f;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.whoopstatus.models.WhoopStatusArchMiniModel;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import l83.C23454a0;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23743y0;
import p716lb1.C23749z0;
import p720m91.InterfaceC25312u;
import q83.AbstractC30060g;
import t41.C33537a;

/* JADX INFO: renamed from: c03.a */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001b\u0010\u000b\u001a\u00020\u00068@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m65681d2 = {"Ljb1/a;", "a", "Ljb1/a;", "getWhoopStatusDesignItemReducer", "()Ljb1/a;", "whoopStatusDesignItemReducer", "Llb1/y0;", "b", "Ll83/h;", "e", "()Llb1/y0;", "whoopStatusDesignModelMapper", "whoop-status_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3813a {

    /* JADX INFO: renamed from: a */
    private static final C21535a f15643a = AbstractC21537c.m60554d(new C0129g(14));

    /* JADX INFO: renamed from: b */
    private static final InterfaceC23462h f15644b = AbstractC30060g.m92088H(new C0148f(15));

    /* JADX INFO: renamed from: c03.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f15645w;

        public a(Function1 function1) {
            this.f15645w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f15645w.invoke((WhoopStatusArchMiniModel) it);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final C23743y0 m11676e() {
        return (C23743y0) f15644b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m11677f(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C0129g(15));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m11678g(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        addModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(WhoopStatusArchMiniModel.class), new a(new C0129g(16)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C33537a m11679h(WhoopStatusArchMiniModel whoopStatusArchMiniModel) {
        AbstractC22676k.m65750j(whoopStatusArchMiniModel, "<unused var>");
        return new C33537a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23743y0 m11680i() {
        return f15643a.getModelMapper();
    }
}
