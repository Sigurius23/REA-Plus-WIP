package vb1;

import a63.C0486f0;
import androidx.health.platform.client.proto.C1533u;
import com.whoop.communityeverydaystats.domain.models.CommunitySnapshotContainerModel;
import com.whoop.communityeverydaystats.domain.models.SnapshotExerciseTileModel;
import com.whoop.communityeverydaystats.domain.models.SnapshotHeaderModel;
import com.whoop.communityeverydaystats.domain.models.SnapshotMetricCardModel;
import com.whoop.design.models.items.ImpactBarSegmentModel;
import java.util.Collection;
import java.util.Map;
import jb1.C21536b;
import kd1.C22395g;
import kotlinx.coroutines.TimeoutCancellationException;
import l83.C23454a0;
import p077d0.C11385o0;
import p163g1.EnumC15207z1;
import p500tb.InterfaceC33687a;
import p634y1.C39031d;
import p668z1.AbstractC39963l;
import p715kotlin.jvm.functions.Function1;
import p716lb1.C23749z0;
import p741vn1.AbstractC36212p;
import p741vn1.AbstractC36215s;
import p741vn1.C36199c;
import p741vn1.EnumC36205i;
import p745y81.AbstractC42793j;
import td1.EnumC33707e;
import v61.C35736a;
import vd1.C35910d;
import vy0.AbstractC36578h0;
import w61.AbstractC36862b;
import we1.C37220d;
import x02.AbstractC37803b;
import x51.C37992d;
import x71.AbstractC38040b;
import ym1.AbstractC39652c;
import yq0.AbstractC39709b;
import yr2.C39737b;
import yt0.C39767f;

/* JADX INFO: renamed from: vb1.a */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C35868a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f152701w;

    public /* synthetic */ C35868a(int i13) {
        this.f152701w = i13;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f152701w) {
            case 0:
                return AbstractC35869b.m113873s((ImpactBarSegmentModel) obj);
            case 1:
                return AbstractC35869b.m113863i((C21536b) obj);
            case 2:
                return C35910d.m114049G((EnumC33707e) obj);
            case 3:
                return C23454a0.f92919a;
            case 4:
                return C36199c.m115198g(((Float) obj).floatValue());
            case 5:
                return AbstractC36212p.m115249o(obj);
            case 6:
                return AbstractC36212p.m115252r((EnumC36205i) obj);
            case 7:
                return AbstractC36215s.m115278k((EnumC15207z1) obj);
            case 8:
                return AbstractC36578h0.m117341S((C11385o0) obj);
            case 9:
                return AbstractC36578h0.m117336N((C11385o0) obj);
            case 10:
                return AbstractC36578h0.m117338P((C11385o0) obj);
            case 11:
                return AbstractC36862b.m118225e((C35736a) obj);
            case 12:
                return C37220d.m119283k((InterfaceC33687a) obj);
            case 13:
                return AbstractC37803b.m121317i((C0486f0) obj);
            case 14:
                return C37992d.m121718b(obj);
            case 15:
                return AbstractC38040b.m121792f(obj);
            case 16:
                return Boolean.valueOf(obj == null);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return new C39031d((Map) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return obj;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC42793j.m125435b((C22395g) obj);
            case 20:
                return AbstractC39652c.m126777g(obj);
            case 21:
                return AbstractC39709b.m127056j((C21536b) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC39709b.m127057k((C23749z0) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC39709b.m127058l((SnapshotMetricCardModel) obj);
            case 24:
                return AbstractC39709b.m127059m((SnapshotExerciseTileModel) obj);
            case 25:
                return AbstractC39709b.m127060n((SnapshotHeaderModel) obj);
            case 26:
                return AbstractC39709b.m127061o((CommunitySnapshotContainerModel) obj);
            case 27:
                return C39737b.m127157j((TimeoutCancellationException) obj);
            case 28:
                return C39767f.m127307p((InterfaceC33687a) obj);
            default:
                synchronized (AbstractC39963l.f172462c) {
                    ?? r10 = AbstractC39963l.f172468i;
                    int size = ((Collection) r10).size();
                    for (int i13 = 0; i13 < size; i13++) {
                        ((Function1) r10.get(i13)).invoke(obj);
                    }
                }
                return C23454a0.f92919a;
        }
    }
}
