package c62;

import c31.C3929m;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.ImpactModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.recoveryimpacts.domain.model.RecoveryImpactsTileModel;
import d62.C11742h;
import gz0.AbstractC16315n0;
import gz0.EnumC16313m0;
import hy0.C17731c2;
import java.util.ArrayList;
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

/* JADX INFO: renamed from: c62.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m65681d2 = {"Ljb1/a;", "a", "Ljb1/a;", "d", "()Ljb1/a;", "recoveryImpactsDesignItemReducer", "recovery-impacts-mini-arch_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4274b {

    /* JADX INFO: renamed from: a */
    private static final C21535a f17355a = AbstractC21537c.m60554d(new C3929m(29));

    /* JADX INFO: renamed from: c62.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f17356w;

        public a(Function1 function1) {
            this.f17356w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f17356w.invoke((RecoveryImpactsTileModel) it);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final C21535a m13314d() {
        return f17355a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m13315e(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C4273a(0));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m13316f(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        addModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(RecoveryImpactsTileModel.class), new a(new C4273a(1)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C11742h m13317g(RecoveryImpactsTileModel model) {
        AbstractC22676k.m65750j(model, "model");
        EnumC16313m0 enumC16313m0M46378c = AbstractC16315n0.m46378c(model.getIcon(), EnumC16313m0.WHOOP_LOGO_CIRCLE);
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(model.getSubtitle());
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(model.getDescription());
        C9598e destination = model.getDestination();
        List<ImpactModel> items = model.getItems();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(items, 10));
        for (ImpactModel impactModel : items) {
            arrayList.add(new C17731c2(AbstractC8693b.m21278l(impactModel.getTitleDisplay()), impactModel.getBackgroundEnabled(), impactModel.getTrend(), false, AbstractC16315n0.m46377b(impactModel.getIcon()), null, false, false, 2, 0, 0.0f, null, null, 0.0f, null, 32480, null));
        }
        return new C11742h(enumC16313m0M46378c, textResourceM21278l, textResourceM21278l3, textResourceM21278l2, arrayList, destination);
    }
}
