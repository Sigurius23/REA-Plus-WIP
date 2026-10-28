package qc1;

import ad3.C0764g;
import androidx.health.platform.client.proto.C1533u;
import com.whoop.design.models.items.ContextCardModel;
import com.whoop.design.models.items.ContextHubHeaderModel;
import com.whoop.design.models.items.recommendationtileheader.RecommendationTileHeaderModel;
import com.whoop.design.models.items.weightpicker.WeightPickerModel;
import com.whoop.domain.model.UserSwitchEvent;
import com.whoop.startactivity.presession.domain.model.PreSessionWidgetModel;
import com.whoop.startactivity.selectactivity.SelectActivityPickerModel;
import h80.InterfaceC17002b;
import j80.InterfaceC21414b;
import j93.InterfaceC21493z;
import java.util.Map;
import jb1.C21536b;
import l83.C23454a0;
import p209i3.AbstractC18039u;
import p209i3.AbstractC18041w;
import p209i3.C18030l;
import p209i3.C18043y;
import p209i3.InterfaceC18044z;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p294l3.C23277r0;
import p715kotlin.jvm.functions.Function1;
import p716lb1.C23749z0;
import p720m91.C25308q;
import p736sz0.AbstractC33199m0;
import p737t90.AbstractC33658a;
import p737t90.Function0;
import p745y81.C39336i;
import qd1.C30294a;
import qi0.C30408c;
import qz0.AbstractC30795n;
import rg2.AbstractC31405q;
import rr2.C31771h;
import rz0.EnumC31927f;
import sb1.AbstractC32346a;
import st0.AbstractC32962f;
import tc1.AbstractC33698a;
import td1.C33706d;
import tg2.AbstractC33792f;
import tn1.C33960b;

/* JADX INFO: renamed from: qc1.a */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C30217a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f123746w;

    public /* synthetic */ C30217a(int i13) {
        this.f123746w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f123746w) {
            case 0:
                return AbstractC30218b.m92475f((C23749z0) obj);
            case 1:
                return AbstractC30218b.m92476g((RecommendationTileHeaderModel) obj);
            case 2:
                return C30294a.m92547A((UserSwitchEvent) obj);
            case 3:
                return C30294a.m92549C((UserSwitchEvent) obj);
            case 4:
                return C30408c.m92933e((C0764g) obj);
            case 5:
                return AbstractC30795n.m94705f((C23277r0) obj);
            case 6:
                return AbstractC31405q.m96715e((C21536b) obj);
            case 7:
                return AbstractC31405q.m96716f((C23749z0) obj);
            case 8:
                return AbstractC31405q.m96717g((PreSessionWidgetModel) obj);
            case 9:
                return C31771h.m98646u((Map.Entry) obj);
            case 10:
                return EnumC31927f._init_$lambda$0((C39336i) obj);
            case 11:
                return EnumC31927f._init_$lambda$1((C39336i) obj);
            case 12:
                InterfaceC21493z[] interfaceC21493zArr = AbstractC18041w.f70062a;
                C18043y c18043y = AbstractC18039u.f70038e;
                C23454a0 c23454a0 = C23454a0.f92919a;
                ((C18030l) ((InterfaceC18044z) obj)).m51772e(c18043y, c23454a0);
                return c23454a0;
            case 13:
                return AbstractC32346a.m100670d((C23749z0) obj);
            case 14:
                return AbstractC32346a.m100671e((ContextCardModel) obj);
            case 15:
                return AbstractC32346a.m100672f((ContextHubHeaderModel) obj);
            case 16:
                return AbstractC33199m0.m105212D(((Float) obj).floatValue());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC33658a.m106301d((InterfaceC17002b) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return Function0.m106306d((InterfaceC22129c) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return p737t90.Function1.m106315h((InterfaceC17002b) obj);
            case 20:
                return p737t90.Function1.m106316i((InterfaceC21414b) obj);
            case 21:
                return p737t90.Function1.m106319l((InterfaceC22131e) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC33698a.m106476g((C23749z0) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC33698a.m106477h((WeightPickerModel) obj);
            case 24:
                return C33706d.m106529b0((AbstractC32962f) obj);
            case 25:
                return AbstractC33792f.m106890g((C21536b) obj);
            case 26:
                return AbstractC33792f.m106893j((C25308q) obj);
            case 27:
                return AbstractC33792f.m106891h((C23749z0) obj);
            case 28:
                return AbstractC33792f.m106892i((SelectActivityPickerModel) obj);
            default:
                return C33960b.m107413f((C21536b) obj);
        }
    }
}
