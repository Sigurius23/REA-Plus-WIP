package no1;

import androidx.health.platform.client.proto.C1533u;
import bw0.AbstractC3680c;
import com.whoop.design.models.items.ArchMiniBehaviorDetailsModel;
import com.whoop.design.models.items.BehaviorDetailsTileModel;
import com.whoop.domain.model.teams.MemberStory;
import jb1.C21536b;
import jx1.C22015f0;
import lo1.InterfaceC24616a;
import mw0.AbstractC25979g;
import nq0.C27046i;
import nq1.AbstractC27056a;
import nq1.C27057b;
import nq2.AbstractC27062e;
import nq2.AbstractC27065h;
import nr0.AbstractC27073f;
import nr0.AbstractC27076i;
import nw0.AbstractC27200g;
import nw0.AbstractC27203j;
import nw0.AbstractC27208o;
import nw1.AbstractC27210b;
import nx1.AbstractC27221c;
import nx1.AbstractC27223e;
import ny0.C27268n;
import p134f2.C14015d;
import p270k2.InterfaceC22129c;
import p715kotlin.jvm.functions.Function1;
import p716lb1.C23749z0;

/* JADX INFO: renamed from: no1.g */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C26993g implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f107664w;

    public /* synthetic */ C26993g(int i13) {
        this.f107664w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f107664w) {
            case 0:
                return AbstractC26994h.m80976k((InterfaceC24616a) obj);
            case 1:
                return Boolean.valueOf(C27046i.m81208i0((MemberStory) obj));
            case 2:
                return AbstractC27056a.m81285e((C21536b) obj);
            case 3:
                return AbstractC27056a.m81286f((C23749z0) obj);
            case 4:
                return AbstractC27056a.m81287g((ArchMiniBehaviorDetailsModel) obj);
            case 5:
                return AbstractC27056a.m81288h((BehaviorDetailsTileModel) obj);
            case 6:
                return C27057b.m81294c((C21536b) obj);
            case 7:
                return AbstractC27062e.m81308F((C14015d) obj);
            case 8:
                return AbstractC27065h.m81351f(obj);
            case 9:
                return AbstractC27065h.m81353h(((Float) obj).floatValue());
            case 10:
                return AbstractC27073f.m81406x(obj);
            case 11:
                return AbstractC27073f.m81397o(obj);
            case 12:
                return AbstractC27076i.m81419f(obj);
            case 13:
                return AbstractC27200g.m81798W((AbstractC3680c) obj);
            case 14:
                return AbstractC27200g.m81781F((AbstractC3680c) obj);
            case 15:
                return AbstractC27200g.m81799X((AbstractC25979g) obj);
            case 16:
                return AbstractC27203j.m81842I((AbstractC3680c) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC27203j.m81861a0((AbstractC25979g) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC27203j.m81887y((AbstractC3680c) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC27203j.m81837D((AbstractC3680c) obj);
            case 20:
                return AbstractC27208o.m81900L((AbstractC3680c) obj);
            case 21:
                return AbstractC27208o.m81890B((AbstractC25979g) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC27208o.m81891C(obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC27208o.m81892D(obj);
            case 24:
                return AbstractC27210b.m81943d((C22015f0) obj);
            case 25:
                return AbstractC27221c.m81969h((InterfaceC22129c) obj);
            case 26:
                return AbstractC27223e.m81997q((InterfaceC22129c) obj);
            case 27:
                return C27268n.m82234h(obj);
            case 28:
                return C27268n.m82235i(obj);
            default:
                return C27268n.m82236j(obj);
        }
    }
}
