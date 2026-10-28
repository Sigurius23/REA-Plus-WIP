package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.ZoneBarModel;
import com.whoop.design.models.items.ZoneBarZone;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import u41.C34534b;

/* JADX INFO: renamed from: lb1.j5 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/design/models/items/ZoneBarZone;", "Lu41/b$a;", "d", "(Lcom/whoop/design/models/items/ZoneBarZone;)Lu41/b$a;", "Llb1/y0;", "a", "Llb1/y0;", "c", "()Llb1/y0;", "zoneBarMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23656j5 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93822a = Function1.m68251a(new C23753z4(16));

    /* JADX INFO: renamed from: lb1.j5$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93823w;

        public a(Function1 function1) {
            this.f93823w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93823w.invoke((ZoneBarModel) it);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C23743y0 m68933c() {
        return f93822a;
    }

    /* JADX INFO: renamed from: d */
    private static final C34534b.a m68934d(ZoneBarZone zoneBarZone) {
        return new C34534b.a(zoneBarZone.getTitle(), zoneBarZone.getLabel(), zoneBarZone.getColor(), (float) zoneBarZone.getWeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m68935e(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(ZoneBarModel.class), new a(new C23753z4(17)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C34534b m68936f(ZoneBarModel model) {
        AbstractC22676k.m65750j(model, "model");
        String title = model.getTitle();
        List<ZoneBarZone> zones = model.getZones();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(zones, 10));
        Iterator<T> it = zones.iterator();
        while (it.hasNext()) {
            arrayList.add(m68934d((ZoneBarZone) it.next()));
        }
        Double indicatorPosition = model.getIndicatorPosition();
        return new C34534b(title, arrayList, indicatorPosition != null ? Float.valueOf((float) indicatorPosition.doubleValue()) : null);
    }
}
