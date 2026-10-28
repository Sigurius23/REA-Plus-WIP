package live.hms.video.media.capturers.camera.utils;

import androidx.compose.p018ui.Modifier;
import androidx.health.platform.client.proto.C1533u;
import com.whoop.membership.extensions.domain.models.OrderOption;
import hn1.InterfaceC17515a;
import hn1.InterfaceC17516b;
import in1.InterfaceC18722b;
import jz1.C22077e;
import lk1.AbstractC24492b;
import lk1.AbstractC24493c;
import lm1.AbstractC24513c;
import ln1.AbstractC24525c;
import ln1.AbstractC24539q;
import ln1.AbstractC24540r;
import ln1.C24526d;
import lw1.AbstractC24768d;
import lw1.AbstractC24769e;
import lw1.AbstractC24770f;
import lw1.AbstractC24772h;
import lz0.AbstractC24818c;
import p208i2.InterfaceC17886g0;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p715kotlin.jvm.functions.Function1;
import p717lq2.AbstractC24669a;
import p717lq2.AbstractC24680l;
import p717lq2.AbstractC24686r;
import p718lz1.Function0;
import p720m91.C25308q;
import q22.EnumC29858h;

/* JADX INFO: renamed from: live.hms.video.media.capturers.camera.utils.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C24174a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f95242w;

    public /* synthetic */ C24174a(int i13) {
        this.f95242w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f95242w) {
            case 0:
                return OrientationTools.correctOrientation$lambda$5((BitMatrix) obj);
            case 1:
                return OrientationTools.correctOrientation$lambda$6((BitMatrix) obj);
            case 2:
                return AbstractC24492b.m71281e(obj);
            case 3:
                return AbstractC24493c.m71287c((C25308q) obj);
            case 4:
                return AbstractC24513c.m71396s((InterfaceC22129c) obj);
            case 5:
                return AbstractC24513c.m71398u((InterfaceC22129c) obj);
            case 6:
                return AbstractC24513c.m71400w((InterfaceC22129c) obj);
            case 7:
                return AbstractC24525c.m71439f(obj);
            case 8:
                return AbstractC24539q.m71519b0((C25308q) obj);
            case 9:
                return AbstractC24539q.m71500K((C24526d) obj);
            case 10:
                return AbstractC24539q.m71490A((InterfaceC18722b) obj);
            case 11:
                return AbstractC24539q.m71491B((InterfaceC17516b) obj);
            case 12:
                return AbstractC24539q.m71492C((InterfaceC17515a) obj);
            case 13:
                return AbstractC24540r.m71555h((InterfaceC17886g0) obj);
            case 14:
                return AbstractC24540r.m71556i((InterfaceC22129c) obj);
            case 15:
                return Integer.valueOf(AbstractC24669a.m72062f(((Integer) obj).intValue()));
            case 16:
                return Integer.valueOf(AbstractC24669a.m72063g(((Integer) obj).intValue()));
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC24680l.m72119t(((Float) obj).floatValue());
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC24686r.m72221i0((String) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC24686r.m72223j0(obj);
            case 20:
                return AbstractC24686r.m72243t0((String) obj);
            case 21:
                return AbstractC24686r.m72245u0(obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC24768d.m72530e((OrderOption) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC24769e.m72544j(((Integer) obj).intValue());
            case 24:
                return AbstractC24769e.m72550p((EnumC29858h) obj);
            case 25:
                return AbstractC24770f.m72560h((String) obj);
            case 26:
                return AbstractC24772h.m72583n((Modifier) obj);
            case 27:
                return AbstractC24772h.m72584o((Modifier) obj);
            case 28:
                return AbstractC24818c.m72730f((InterfaceC22131e) obj);
            default:
                return Function0.m72758r((C22077e) obj);
        }
    }
}
