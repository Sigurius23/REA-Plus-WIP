package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.Coordinates;
import com.whoop.design.models.items.GpsMetrics;
import com.whoop.design.models.items.MapModel;
import com.whoop.design.util.AbstractC8693b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import w41.AbstractC36826z;
import w41.C36815o;
import w41.C36818r;
import w41.C36823w;

/* JADX INFO: renamed from: lb1.x2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\f\"\u001a\u0010\u0012\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m65681d2 = {"Lcom/whoop/design/models/items/MapModel;", "model", "Lw41/z;", "d", "(Lcom/whoop/design/models/items/MapModel;)Lw41/z;", "Lcom/whoop/design/models/items/Coordinates;", "Lw41/w;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/design/models/items/Coordinates;)Lw41/w;", "Lcom/whoop/design/models/items/GpsMetrics;", "Lw41/r;", "g", "(Lcom/whoop/design/models/items/GpsMetrics;)Lw41/r;", "Llb1/y0;", "a", "Llb1/y0;", "c", "()Llb1/y0;", "mapModelMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23739x2 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f94056a = Function1.m68251a(new C23715t2(9));

    /* JADX INFO: renamed from: lb1.x2$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f94057w;

        public a(Function1 function1) {
            this.f94057w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f94057w.invoke((MapModel) it);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C23743y0 m69654c() {
        return f94056a;
    }

    /* JADX INFO: renamed from: d */
    private static final AbstractC36826z m69655d(MapModel mapModel) {
        List<Coordinates> gpsCoordinates = mapModel.getGpsCoordinates();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(gpsCoordinates, 10));
        Iterator<T> it = gpsCoordinates.iterator();
        while (it.hasNext()) {
            arrayList.add(m69659h((Coordinates) it.next()));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new AbstractC36826z.b((C36823w) AbstractC25265s.m74096F0(arrayList), (C36823w) AbstractC25265s.m74112P0(arrayList), arrayList, null, null, 0, 0, 120, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m69656e(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(MapModel.class), new a(new C23715t2(10)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C36815o m69657f(MapModel model) {
        AbstractC22676k.m65750j(model, "model");
        String mapTitleDisplay = model.getMapTitleDisplay();
        AbstractC36826z abstractC36826zM69655d = m69655d(model);
        List<GpsMetrics> gpsMetrics = model.getGpsMetrics();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(gpsMetrics, 10));
        Iterator<T> it = gpsMetrics.iterator();
        while (it.hasNext()) {
            arrayList.add(m69658g((GpsMetrics) it.next()));
        }
        return new C36815o(mapTitleDisplay, abstractC36826zM69655d, arrayList, model.getDestination());
    }

    /* JADX INFO: renamed from: g */
    private static final C36818r m69658g(GpsMetrics gpsMetrics) {
        return new C36818r(AbstractC8693b.m21278l(gpsMetrics.getValueDisplay()), AbstractC8693b.m21278l(gpsMetrics.getUnitDisplay()), AbstractC8693b.m21278l(gpsMetrics.getValueTitleDisplay()));
    }

    /* JADX INFO: renamed from: h */
    private static final C36823w m69659h(Coordinates coordinates) {
        return new C36823w(coordinates.getLatitude(), coordinates.getLongitude());
    }
}
