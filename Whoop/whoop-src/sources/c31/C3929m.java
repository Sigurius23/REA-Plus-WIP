package c31;

import androidx.compose.p018ui.Modifier;
import androidx.health.platform.client.proto.C1533u;
import c32.AbstractC3933a;
import c41.AbstractC3993b1;
import c41.AbstractC3995b3;
import c41.AbstractC4001c2;
import c41.AbstractC4012e;
import c41.AbstractC4021f1;
import c41.AbstractC4023f3;
import c41.AbstractC4039h5;
import c41.AbstractC4050j2;
import c41.AbstractC4060k5;
import c41.AbstractC4062l0;
import c41.AbstractC4066l4;
import c41.AbstractC4087o4;
import c41.AbstractC4106r2;
import c41.AbstractC4117t;
import c41.AbstractC4128u3;
import c41.AbstractC4133v1;
import c41.AbstractC4157y4;
import c41.AbstractC4162z3;
import c41.C3990a5;
import c51.AbstractC4234k;
import c62.AbstractC4274b;
import com.whoop.payments.stripebottomsheettile.model.PaymentMethodMenuTileModel;
import jb1.C21536b;
import mh.C25540h;
import p208i2.InterfaceC17886g0;
import p209i3.InterfaceC18044z;
import p270k2.InterfaceC22131e;
import p715kotlin.jvm.functions.Function1;
import p716lb1.C23749z0;

/* JADX INFO: renamed from: c31.m */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C3929m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f16041w;

    public /* synthetic */ C3929m(int i13) {
        this.f16041w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f16041w) {
            case 0:
                return AbstractC3932p.m11969k((EnumC3919c) obj);
            case 1:
                return AbstractC3932p.m11971m((InterfaceC18044z) obj);
            case 2:
                return AbstractC3933a.m11977e((C21536b) obj);
            case 3:
                return AbstractC3933a.m11978f((C23749z0) obj);
            case 4:
                return AbstractC3933a.m11979g((PaymentMethodMenuTileModel) obj);
            case 5:
                return AbstractC4012e.m12169f(obj);
            case 6:
                return AbstractC4117t.m12689f(obj);
            case 7:
                return AbstractC4062l0.m12422j(obj);
            case 8:
                return AbstractC3993b1.m12100x(obj);
            case 9:
                return AbstractC4021f1.m12232i(obj);
            case 10:
                return AbstractC4133v1.m12788p((InterfaceC17886g0) obj);
            case 11:
                return AbstractC4133v1.m12791s(((Boolean) obj).booleanValue());
            case 12:
                return AbstractC4001c2.m12138l(obj);
            case 13:
                return AbstractC4050j2.m12378k(obj);
            case 14:
                return AbstractC4106r2.m12648g(obj);
            case 15:
                return AbstractC3995b3.m12110f((C25540h) obj);
            case 16:
                return AbstractC4023f3.m12256i(obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC4023f3.m12264q((Modifier) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC4128u3.m12750o(obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC4162z3.m12992f(obj);
            case 20:
                return AbstractC4066l4.m12456q(obj);
            case 21:
                return AbstractC4066l4.m12451l(obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC4087o4.m12544d(obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC4157y4.m12963o(((Boolean) obj).booleanValue());
            case 24:
                return C3990a5.m12050b(((Boolean) obj).booleanValue());
            case 25:
                return AbstractC4039h5.m12312h(obj);
            case 26:
                return AbstractC4060k5.m12409f(obj);
            case 27:
                return AbstractC4234k.m13132E((InterfaceC22131e) obj);
            case 28:
                return AbstractC4234k.m13139L((InterfaceC22131e) obj);
            default:
                return AbstractC4274b.m13315e((C21536b) obj);
        }
    }
}
