package p730qt2;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.nativestore.home.domain.model.ShopBannerCarouselModel;
import com.whoop.nativestore.home.domain.model.ShopCategoryModel;
import com.whoop.nativestore.home.domain.model.ShopProductCarouselModel;
import com.whoop.personalrecords.miniarch.domain.models.ArchMiniPersonalRecords;
import d30.C11570x;
import hu2.InterfaceC17654a;
import java.util.List;
import jb1.C21536b;
import l83.C23465k;
import m83.AbstractC25265s;
import mh.C25540h;
import n23.AbstractC26202e;
import p000.AbstractC11266d;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23749z0;
import p745y81.C39336i;
import qu2.AbstractC30640h;
import qz1.AbstractC30797b;
import qz1.AbstractC30798c;
import qz1.AbstractC30799d;
import r01.AbstractC30841b;
import r21.AbstractC30888f;
import r31.AbstractC30909d;
import r32.AbstractC30912a;
import r32.AbstractC30914c;
import r41.AbstractC30924h;
import r51.AbstractC30937e;
import r61.AbstractC30978a;
import r61.AbstractC30982e;
import r61.AbstractC30986i;

/* JADX INFO: renamed from: qt2.w */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C30617w implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f125892w;

    public /* synthetic */ C30617w(int i13) {
        this.f125892w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f125892w) {
            case 0:
                return AbstractC30618x.m93997g(obj);
            case 1:
                return AbstractC30640h.m94157t0((InterfaceC17654a) obj);
            case 2:
                return AbstractC30640h.m94102X((InterfaceC17654a) obj);
            case 3:
                return AbstractC30797b.m94722g((C21536b) obj);
            case 4:
                return AbstractC30797b.m94723h((C23749z0) obj);
            case 5:
                return AbstractC30797b.m94724i((ShopBannerCarouselModel) obj);
            case 6:
                return AbstractC30798c.m94731f((C21536b) obj);
            case 7:
                return AbstractC30798c.m94732g((C23749z0) obj);
            case 8:
                return AbstractC30798c.m94733h((ShopCategoryModel) obj);
            case 9:
                return AbstractC30799d.m94741g((C21536b) obj);
            case 10:
                return AbstractC30799d.m94742h((C23749z0) obj);
            case 11:
                return AbstractC30799d.m94743i((ShopProductCarouselModel) obj);
            case 12:
                return AbstractC30841b.m94848e(obj);
            case 13:
                List it = (List) obj;
                AbstractC22676k.m65750j(it, "it");
                return AbstractC25265s.m74112P0(it);
            case 14:
                List it3 = (List) obj;
                AbstractC22676k.m65750j(it3, "it");
                if (it3.isEmpty() || it3.size() == 1) {
                    return null;
                }
                return AbstractC11266d.m30455i(2, it3);
            case 15:
                C11570x state = (C11570x) obj;
                AbstractC22676k.m65750j(state, "state");
                return state.m30999a();
            case 16:
                return AbstractC30888f.m94957j((C25540h) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                AbstractC22676k.m65750j((AbstractC26202e) obj, "it");
                return Boolean.FALSE;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC30909d.m95028e(obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC30909d.m95029f(obj);
            case 20:
                return AbstractC30912a.m95040c((ArchMiniPersonalRecords) obj);
            case 21:
                return AbstractC30914c.m95048d((C21536b) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC30914c.m95049e((C23749z0) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC30924h.m95090p(obj);
            case 24:
                return AbstractC30937e.m95167u((C23465k) obj);
            case 25:
                return AbstractC30978a.m95293c((C39336i) obj);
            case 26:
                return AbstractC30982e.m95338h((C39336i) obj);
            case 27:
                return AbstractC30982e.m95353w((C39336i) obj);
            case 28:
                return AbstractC30982e.m95344n((C39336i) obj);
            default:
                return AbstractC30986i.m95389f((C39336i) obj);
        }
    }
}
