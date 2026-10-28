package hd2;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.Coordinates;
import com.whoop.share.model.ShareRouteMapModel;
import hb1.C17085h;
import java.util.ArrayList;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23749z0;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: hd2.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002¨\u0006\u0004"}, m65681d2 = {"Ljb1/a;", "a", "Ljb1/a;", "itemReducer", "share_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17204f {

    /* JADX INFO: renamed from: a */
    private static final C21535a f66090a = AbstractC21537c.m60554d(new C17085h(8));

    /* JADX INFO: renamed from: hd2.f$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f66091w;

        public a(Function1 function1) {
            this.f66091w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f66091w.invoke((ShareRouteMapModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m48600f(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C17085h(9));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m48601g(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        addModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(ShareRouteMapModel.class), new a(new C17085h(10)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C17199a m48602h(ShareRouteMapModel model) {
        AbstractC22676k.m65750j(model, "model");
        C21535a c21535aM60554d = AbstractC21537c.m60554d(new C17085h(11));
        String activityIconUrl = model.getActivityIconUrl();
        List<Coordinates> gpsCoordinates = model.getGpsCoordinates();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(gpsCoordinates, 10));
        for (Coordinates coordinates : gpsCoordinates) {
            arrayList.add(new C23465k(Double.valueOf(coordinates.getLatitude()), Double.valueOf(coordinates.getLongitude())));
        }
        return new C17199a(activityIconUrl, arrayList, C21535a.m60536k(c21535aM60554d, model.getItems(), null, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m48603i(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        return C23454a0.f92919a;
    }
}
