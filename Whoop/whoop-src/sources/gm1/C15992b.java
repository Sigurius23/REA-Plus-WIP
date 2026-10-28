package gm1;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.home.domain.models.CalibrationTimelineCardModel;
import com.whoop.home.domain.models.ScoreGaugeStickyModel;
import com.whoop.home.domain.models.WeeklyPlanHomeTileWrapperModel;
import com.whoop.home.domain.models.WelcomeCardModel;
import com.whoop.home.domain.models.WhatToExpectCardModel;
import com.whoop.weeklyplan.hometile.domain.api.WeeklyPlanHometile;
import gt2.AbstractC16203a;
import gz0.AbstractC16290b;
import gz0.AbstractC16291b0;
import gz0.AbstractC16294d;
import gz0.AbstractC16295d0;
import gz0.AbstractC16299f0;
import gz0.AbstractC16303h0;
import gz0.AbstractC16307j0;
import gz0.AbstractC16310l;
import gz0.AbstractC16311l0;
import gz0.AbstractC16314n;
import gz0.AbstractC16318p;
import gz0.AbstractC16321r;
import gz0.AbstractC16323t;
import gz0.AbstractC16325v;
import gz0.AbstractC16327x;
import gz0.AbstractC16329z;
import h01.AbstractC16549p;
import jb1.C21536b;
import kd1.C22395g;
import p512u2.AbstractC34454d0;
import p512u2.C34472r;
import p715kotlin.jvm.functions.Function1;
import p716lb1.C23749z0;

/* JADX INFO: renamed from: gm1.b */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15992b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f60516w;

    public /* synthetic */ C15992b(int i13) {
        this.f60516w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f60516w) {
            case 0:
                return AbstractC15993c.m45185J((WelcomeCardModel) obj);
            case 1:
                return AbstractC15993c.m45186K((WhatToExpectCardModel) obj);
            case 2:
                return AbstractC15993c.m45187L((ScoreGaugeStickyModel) obj);
            case 3:
                return AbstractC15993c.m45188M((WeeklyPlanHomeTileWrapperModel) obj);
            case 4:
                return AbstractC15993c.m45189N((CalibrationTimelineCardModel) obj);
            case 5:
                return AbstractC16203a.m45868f((C21536b) obj);
            case 6:
                return AbstractC16203a.m45869g((C23749z0) obj);
            case 7:
                return AbstractC16203a.m45870h((WeeklyPlanHometile) obj);
            case 8:
                return AbstractC16290b.m46143b((C22395g) obj);
            case 9:
                return AbstractC16294d.m46170b((C22395g) obj);
            case 10:
                return AbstractC16310l.m46367b((C22395g) obj);
            case 11:
                return AbstractC16314n.m46374b((C22395g) obj);
            case 12:
                return AbstractC16318p.m46429c((C22395g) obj);
            case 13:
                return AbstractC16321r.m46456c((C22395g) obj);
            case 14:
                return AbstractC16323t.m46473c((C22395g) obj);
            case 15:
                return AbstractC16325v.m46483c((C22395g) obj);
            case 16:
                return AbstractC16327x.m46514c((C22395g) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC16329z.m46521c((C22395g) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC16291b0.m46147c((C22395g) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC16295d0.m46174c((C22395g) obj);
            case 20:
                return AbstractC16299f0.m46195c((C22395g) obj);
            case 21:
                return AbstractC16303h0.m46220c((C22395g) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC16307j0.m46287c((C22395g) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC16311l0.m46371c((C22395g) obj);
            case 24:
                return Boolean.TRUE;
            case 25:
                ((Integer) obj).getClass();
                return Float.valueOf(Float.NaN);
            case 26:
                return Boolean.TRUE;
            case 27:
                return Boolean.TRUE;
            case 28:
                return Boolean.valueOf(!AbstractC34454d0.m108915f(((C34472r) obj).m108954j(), 2));
            default:
                return AbstractC16549p.m46784r(((Boolean) obj).booleanValue());
        }
    }
}
