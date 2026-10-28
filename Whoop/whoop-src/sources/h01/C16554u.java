package h01;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.access.careupdateentrypointtile.models.CareUpdateEntrypointTileModel;
import com.whoop.access.circumference.models.CircumferenceModel;
import com.whoop.access.labsummary.models.LabSummaryModel;
import com.whoop.access.measurementprogress.models.MeasurementProgressModel;
import com.whoop.navigation.C9598e;
import ha0.C17050c;
import ha0.C17054g;
import ht2.AbstractC17633e;
import hx0.C17706b;
import hx0.C17710f;
import i60.AbstractC18151a;
import il1.AbstractC18642s;
import jb1.C21536b;
import kb1.C22325e;
import p500tb.InterfaceC33687a;
import p710im1.AbstractC18667e0;
import p710im1.AbstractC18677j0;
import p710im1.AbstractC18697t0;
import p715kotlin.jvm.functions.Function1;
import p716lb1.C23749z0;
import p720m91.C25308q;

/* JADX INFO: renamed from: h01.u */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C16554u implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f63734w;

    public /* synthetic */ C16554u(int i13) {
        this.f63734w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f63734w) {
            case 0:
                return AbstractC16555v.m46845c((C25308q) obj);
            case 1:
                return AbstractC16559z.m46868j(obj);
            case 2:
                return C17050c.m48135l((InterfaceC33687a) obj);
            case 3:
                return C17054g.m48158l((InterfaceC33687a) obj);
            case 4:
                return AbstractC17633e.m50205M(obj);
            case 5:
                return AbstractC17633e.m50199G(obj);
            case 6:
                return AbstractC17633e.m50196D(((Float) obj).floatValue());
            case 7:
                return C17706b.m50694m((C17710f) obj);
            case 8:
                return C17706b.m50695n((C17710f) obj);
            case 9:
                return AbstractC18151a.m52101n((C21536b) obj);
            case 10:
                return AbstractC18151a.m52103p((CareUpdateEntrypointTileModel) obj);
            case 11:
                return AbstractC18151a.m52107t((CircumferenceModel) obj);
            case 12:
                return AbstractC18151a.m52109v((MeasurementProgressModel) obj);
            case 13:
                return AbstractC18151a.m52113z((C25308q) obj);
            case 14:
                return AbstractC18151a.m52102o((C23749z0) obj);
            case 15:
                return AbstractC18151a.m52104q((C23749z0) obj);
            case 16:
                return AbstractC18151a.m52106s((C23749z0) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC18151a.m52108u((C23749z0) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC18151a.m52110w((C23749z0) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC18151a.m52105r((LabSummaryModel) obj);
            case 20:
                return AbstractC18667e0.m54176c((C25308q) obj);
            case 21:
                return AbstractC18677j0.m54232s(((Boolean) obj).booleanValue());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC18677j0.m54236w(((Boolean) obj).booleanValue());
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC18677j0.m54225l(((Boolean) obj).booleanValue());
            case 24:
                return AbstractC18697t0.m54280K0(obj);
            case 25:
                return AbstractC18697t0.m54284M0(((Boolean) obj).booleanValue());
            case 26:
                return AbstractC18697t0.m54288O0(((Boolean) obj).booleanValue());
            case 27:
                return AbstractC18697t0.m54290P0((C9598e) obj);
            case 28:
                return AbstractC18697t0.m54264C0((AbstractC18642s) obj);
            default:
                return AbstractC18697t0.m54337i1((C22325e) obj);
        }
    }
}
