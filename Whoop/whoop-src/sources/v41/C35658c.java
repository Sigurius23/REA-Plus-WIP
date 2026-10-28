package v41;

import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;
import com.whoop.profile.view.components.ContextHubTileKt;
import com.whoop.profile.view.components.ReferralsTileKt;
import com.whoop.profile.view.components.StreaksTileKt;
import p741vn1.AbstractC36207k;
import p748zc1.AbstractC40264a;
import p748zc1.AbstractC40275b;
import p748zc1.AbstractC40286c;
import p748zc1.AbstractC40297d;
import p748zc1.AbstractC40308e;
import p748zc1.AbstractC40319f;
import p748zc1.AbstractC40341h;
import p748zc1.AbstractC40352i;
import vs2.AbstractC36479e;
import vx0.AbstractC36555c;
import vy0.AbstractC36588p;
import w01.AbstractC36682g;
import wn1.AbstractC37421e;
import x71.AbstractC38041c;
import xh0.AbstractC38307c;
import xz0.AbstractC38754e;
import yd2.AbstractC39462d;
import yd2.AbstractC39469k;
import yn2.AbstractC39675b;
import yt2.AbstractC39782m;
import yy0.AbstractC39887a;
import z51.AbstractC40093d;
import z71.AbstractC40153l;

/* JADX INFO: renamed from: v41.c */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C35658c implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f151516w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f151517x;

    public /* synthetic */ C35658c(int i13, int i14) {
        this.f151516w = i14;
        this.f151517x = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f151516w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC35660d.m112882x(this.f151517x, composer, iIntValue);
            case 1:
                return ContextHubTileKt.PreviewContextHubTile$lambda$1(this.f151517x, composer, iIntValue);
            case 2:
                return ReferralsTileKt.ReferralsTileFontScalingPreview$lambda$1(this.f151517x, composer, iIntValue);
            case 3:
                return ReferralsTileKt.ReferralsTilePreview$lambda$1(this.f151517x, composer, iIntValue);
            case 4:
                return StreaksTileKt.PreviewStreaksTile$lambda$1(this.f151517x, composer, iIntValue);
            case 5:
                return AbstractC36207k.m115223c(this.f151517x, composer, iIntValue);
            case 6:
                return AbstractC36479e.m116859U(this.f151517x, composer, iIntValue);
            case 7:
                return AbstractC36555c.m117240t(this.f151517x, composer, iIntValue);
            case 8:
                return AbstractC36588p.m117482s0(this.f151517x, composer, iIntValue);
            case 9:
                return AbstractC36682g.m117724L(this.f151517x, composer, iIntValue);
            case 10:
                return AbstractC37421e.m119790c(this.f151517x, composer, iIntValue);
            case 11:
                return AbstractC38041c.m121798c(this.f151517x, composer, iIntValue);
            case 12:
                return AbstractC38307c.m122697B(this.f151517x, composer, iIntValue);
            case 13:
                return AbstractC38754e.m124183B(this.f151517x, composer, iIntValue);
            case 14:
                return AbstractC39462d.m126025m(this.f151517x, composer, iIntValue);
            case 15:
                return AbstractC39469k.m126066D(this.f151517x, composer, iIntValue);
            case 16:
                return AbstractC39675b.m126888l(this.f151517x, composer, iIntValue);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC39782m.m127480x(this.f151517x, composer, iIntValue);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC39887a.m127961d(this.f151517x, composer, iIntValue);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC39887a.m127963f(this.f151517x, composer, iIntValue);
            case 20:
                return AbstractC40093d.m128546r(this.f151517x, composer, iIntValue);
            case 21:
                return AbstractC40153l.m128760s(this.f151517x, composer, iIntValue);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC40264a.m129308e(this.f151517x, composer, iIntValue);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC40275b.m129337e(this.f151517x, composer, iIntValue);
            case 24:
                return AbstractC40286c.m129404c(this.f151517x, composer, iIntValue);
            case 25:
                return AbstractC40297d.m129492c(this.f151517x, composer, iIntValue);
            case 26:
                return AbstractC40308e.m129602c(this.f151517x, composer, iIntValue);
            case 27:
                return AbstractC40319f.m129681k(this.f151517x, composer, iIntValue);
            case 28:
                return AbstractC40341h.m129832m(this.f151517x, composer, iIntValue);
            default:
                return AbstractC40352i.m129913c(this.f151517x, composer, iIntValue);
        }
    }
}
