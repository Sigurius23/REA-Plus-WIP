package ga1;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.connectivityCore.firmware.models.ChipDetails;
import com.whoop.connectivityCore.firmware.models.WhoopDeviceName;
import com.whoop.connectivityCore.firmware.models.WhoopFwDevice;
import com.whoop.design.models.items.graph.StressGraphingCardModel;
import com.whoop.design.models.items.graph.plane.GraphPlaneModel;
import com.whoop.design.models.items.graph.plane.annotations.GraphAnnotationModel;
import com.whoop.home.view.HomeFragment;
import com.whoop.journalhometile.domain.model.JournalHomeTileModel;
import com.whoop.journalhometile.domain.model.JournalHomeTileResponse;
import ge.AbstractC15718c;
import h01.AbstractC16539f;
import hf2.C17238b;
import ht2.AbstractC17633e;
import i60.AbstractC18151a;
import i92.C18258c;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import l83.C23465k;
import m83.AbstractC25247g0;
import p710im1.AbstractC18697t0;
import p715kotlin.jvm.internal.AbstractC22676k;
import vg.C35966m;
import vg.C35971r;
import vg.InterfaceC35967n;

/* JADX INFO: renamed from: ga1.b */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15621b implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f58647w;

    public /* synthetic */ C15621b(int i13) {
        this.f58647w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException {
        switch (this.f58647w) {
            case 0:
                return StressGraphingCardModel._childSerializers$_anonymous_$0();
            case 1:
                return StressGraphingCardModel._childSerializers$_anonymous_$1();
            case 2:
                LinkedHashMap linkedHashMapM73993b0 = AbstractC25247g0.m73993b0(new C23465k("javaVersion", AbstractC15718c.m44299a("java.version")), new C23465k("jvmName", AbstractC15718c.m44299a("java.vm.name")), new C23465k("jvmVersion", AbstractC15718c.m44299a("java.vm.version")));
                InterfaceC35967n.f153143a.getClass();
                C35966m.f153142b.getClass();
                if (((Boolean) C35971r.f153159c.getValue()).booleanValue()) {
                    Class<?> cls = Class.forName("android.os.Build$VERSION");
                    Field declaredField = cls.getDeclaredField("SDK_INT");
                    Field declaredField2 = cls.getDeclaredField("RELEASE");
                    linkedHashMapM73993b0.put("androidApiVersion", String.valueOf(declaredField.getInt(null)));
                    Object obj = declaredField2.get(null);
                    AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.String");
                    linkedHashMapM73993b0.put("androidRelease", (String) obj);
                }
                return linkedHashMapM73993b0;
            case 3:
                return JournalHomeTileModel._childSerializers$_anonymous_();
            case 4:
                return JournalHomeTileModel._childSerializers$_anonymous_$0();
            case 5:
                return JournalHomeTileResponse._childSerializers$_anonymous_();
            case 6:
                return AbstractC16539f.m46727f();
            case 7:
                return AbstractC16539f.m46728g();
            case 8:
                return Long.valueOf(System.currentTimeMillis());
            case 9:
                return GraphPlaneModel._childSerializers$_anonymous_();
            case 10:
                return GraphPlaneModel._childSerializers$_anonymous_$0();
            case 11:
                return C17238b.m48760L();
            case 12:
                return ChipDetails._childSerializers$_anonymous_();
            case 13:
                return WhoopDeviceName._init_$_anonymous_();
            case 14:
                return WhoopFwDevice._childSerializers$_anonymous_();
            case 15:
                return WhoopFwDevice._childSerializers$_anonymous_$0();
            case 16:
                return AbstractC17633e.m50195C();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC18151a.m52112y();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return C18258c.m52600e();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return GraphAnnotationModel._childSerializers$_anonymous_();
            case 20:
                return GraphAnnotationModel._childSerializers$_anonymous_$0();
            case 21:
                return GraphAnnotationModel._childSerializers$_anonymous_$1();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return GraphAnnotationModel._childSerializers$_anonymous_$2();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return GraphAnnotationModel._childSerializers$_anonymous_$3();
            case 24:
                return HomeFragment.m21857s2();
            case 25:
                return Boolean.valueOf(HomeFragment.m21866v2());
            case 26:
                return AbstractC18697t0.m54383z0();
            case 27:
                return AbstractC18697t0.m54260A0();
            case 28:
                return AbstractC18697t0.m54286N0();
            default:
                return AbstractC18697t0.m54262B0();
        }
    }
}
