package r61;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.design.models.binding.AggregateBindingKt;
import com.whoop.design.models.binding.DotPathBindingsKt;
import com.whoop.design.models.items.collapsiblerow.CollapsibleRowModel;
import com.whoop.design.models.items.shopmediacard.ShopMediaCardModel;
import com.whoop.startactivity.presession.domain.model.PreSessionRecentActivitiesRowModel;
import com.whoop.startactivity.presession.domain.model.PreSessionRecentActivityIconModel;
import jb1.C21536b;
import l83.C23465k;
import ne1.AbstractC26598a;
import p134f2.C14015d;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;
import p716lb1.C23749z0;
import p720m91.C25308q;
import p741vn1.EnumC36205i;
import p745y81.C39336i;
import r71.AbstractC31052b;
import r81.AbstractC31066b;
import r90.AbstractC31099f;
import rb1.AbstractC31191a;
import rc1.AbstractC31234a;
import re1.AbstractC31323j;
import re1.AbstractC31325l;
import rf2.C31361c;
import rg2.AbstractC31390b;
import rg2.AbstractC31393e;
import rk2.C31500d;
import rm1.AbstractC31592f;
import rm1.AbstractC31594h;
import yb3.InterfaceC39407k;

/* JADX INFO: renamed from: r61.h */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C30985h implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f127829w;

    public /* synthetic */ C30985h(int i13) {
        this.f127829w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f127829w) {
            case 0:
                return AbstractC30986i.m95391h((C39336i) obj);
            case 1:
                return AbstractC31052b.m95585l(obj);
            case 2:
                return AbstractC31066b.m95695m(obj);
            case 3:
                return AbstractC31066b.m95698p(obj);
            case 4:
                return AbstractC31099f.m95789l(obj);
            case 5:
                return AggregateBindingKt.camelToSnakeCase$lambda$0((InterfaceC39407k) obj);
            case 6:
                return DotPathBindingsKt.mergeAggregateBindingProperty$lambda$0((C23465k) obj);
            case 7:
                return AbstractC31191a.m96129d((C23749z0) obj);
            case 8:
                return AbstractC31191a.m96130e((CollapsibleRowModel) obj);
            case 9:
                return AbstractC31234a.m96177d((C23749z0) obj);
            case 10:
                return AbstractC31234a.m96178e((ShopMediaCardModel) obj);
            case 11:
                return AbstractC31323j.m96352Z((AbstractC26598a) obj);
            case 12:
                return AbstractC31323j.m96370i0((AbstractC26598a) obj);
            case 13:
                return AbstractC31325l.m96404g((C14015d) obj);
            case 14:
                return C31361c.m96451s((InterfaceC33687a) obj);
            case 15:
                return AbstractC31390b.m96660c((C25308q) obj);
            case 16:
                return AbstractC31393e.m96683n((C21536b) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC31393e.m96687r((C21536b) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC31393e.m96679j((C21536b) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC31393e.m96686q((C25308q) obj);
            case 20:
                return AbstractC31393e.m96682m((C25308q) obj);
            case 21:
                return AbstractC31393e.m96684o((C23749z0) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC31393e.m96680k((C23749z0) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC31393e.m96685p((PreSessionRecentActivityIconModel) obj);
            case 24:
                return AbstractC31393e.m96681l((PreSessionRecentActivitiesRowModel) obj);
            case 25:
                return C31500d.m97055i((InterfaceC33687a) obj);
            case 26:
                return AbstractC31592f.m97386j(obj);
            case 27:
                return AbstractC31592f.m97389m((EnumC36205i) obj);
            case 28:
                return AbstractC31594h.m97436q(((Boolean) obj).booleanValue());
            default:
                return AbstractC31594h.m97404G(obj);
        }
    }
}
