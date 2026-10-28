package dh0;

import ak2.AbstractC0952a;
import androidx.health.platform.client.proto.C1533u;
import bk2.InterfaceC3355b;
import com.whoop.design.models.items.amoeba.WhoopAgeAmoeba;
import com.whoop.health.domain.models.DataVisualizationCardBodyModel;
import com.whoop.health.domain.models.DataVisualizationCardModel;
import com.whoop.health.domain.models.EntryPointLockedCardModel;
import com.whoop.health.domain.models.HealthspanHeroMetricModel;
import com.whoop.health.domain.models.HorizontalRecordsTileModel;
import com.whoop.health.domain.models.ProgressBarDescriptionCardModel;
import com.whoop.tiltgraph.view.TiltGraphFragment;
import dj0.C12066b;
import dj1.AbstractC12090c;
import dj2.AbstractC12094c;
import dm1.C12178b;
import dn0.AbstractC12216p;
import do0.AbstractC12228b;
import java.time.LocalDate;
import jb1.C21536b;
import o02.C27354e;
import p270k2.InterfaceC22129c;
import p704dk2.AbstractC12121h;
import p704dk2.AbstractC12123j;
import p704dk2.AbstractC12125l;
import p715kotlin.jvm.functions.Function1;
import p716lb1.C23749z0;
import p720m91.C25308q;
import re.C31255a1;
import uj2.AbstractC35038a;
import zn0.AbstractC40903a;

/* JADX INFO: renamed from: dh0.a */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C12040a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f39814w;

    public /* synthetic */ C12040a(int i13) {
        this.f39814w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f39814w) {
            case 0:
                return AbstractC12042c.m33162g(obj);
            case 1:
                return AbstractC12042c.m33163h((C25308q) obj);
            case 2:
                return C12066b.m33279Q((C31255a1) obj);
            case 3:
                return AbstractC12090c.m33355A((C21536b) obj);
            case 4:
                return AbstractC12090c.m33366L((C21536b) obj);
            case 5:
                return AbstractC12090c.m33367M((C23749z0) obj);
            case 6:
                return AbstractC12090c.m33368N((WhoopAgeAmoeba) obj);
            case 7:
                return AbstractC12090c.m33396x((DataVisualizationCardBodyModel) obj);
            case 8:
                return AbstractC12090c.m33359E((DataVisualizationCardModel) obj);
            case 9:
                return AbstractC12090c.m33360F((EntryPointLockedCardModel) obj);
            case 10:
                return AbstractC12090c.m33362H((ProgressBarDescriptionCardModel) obj);
            case 11:
                return AbstractC12090c.m33364J((HorizontalRecordsTileModel) obj);
            case 12:
                return AbstractC12090c.m33365K((HealthspanHeroMetricModel) obj);
            case 13:
                return AbstractC12090c.m33361G((C21536b) obj);
            case 14:
                return AbstractC12094c.m33420d(obj);
            case 15:
                return TiltGraphFragment.m26492V((AbstractC0952a) obj);
            case 16:
                return AbstractC12121h.m33520k((InterfaceC3355b) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC12121h.m33521l((AbstractC0952a) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC12121h.m33525p(((Float) obj).floatValue());
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC12123j.m33561u((AbstractC35038a) obj);
            case 20:
                return Integer.valueOf(AbstractC12123j.m33530D(((Integer) obj).intValue()));
            case 21:
                return AbstractC12125l.m33577d((InterfaceC22129c) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return C12178b.m33769g((C27354e) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC12216p.m33883J(((Integer) obj).intValue());
            case 24:
                return AbstractC12216p.m33884K(((Integer) obj).intValue());
            case 25:
                return AbstractC12216p.m33885L(obj);
            case 26:
                return AbstractC12216p.m33886M((LocalDate) obj);
            case 27:
                return AbstractC12216p.m33927z(obj);
            case 28:
                return AbstractC12216p.m33882I(obj);
            default:
                return AbstractC12228b.m33980m((AbstractC40903a) obj);
        }
    }
}
