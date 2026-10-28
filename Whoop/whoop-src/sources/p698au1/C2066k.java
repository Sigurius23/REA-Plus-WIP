package p698au1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.bot.settings.CoachSettingsScreenKt;
import fy2.AbstractC14879a;
import mn1.AbstractC25717h;
import p715kotlin.jvm.functions.Function1;
import pt2.AbstractC29540v;
import yt2.AbstractC39772c;

/* JADX INFO: renamed from: au1.k */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C2066k implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f8191w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f8192x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f8193y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f8194z;

    public /* synthetic */ C2066k(int i13, int i14, int i15, Function1 function1) {
        this.f8191w = i15;
        this.f8192x = function1;
        this.f8193y = i13;
        this.f8194z = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f8191w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return Function1.m6511g(this.f8192x, this.f8193y, this.f8194z, composer, iIntValue);
            case 1:
                return CoachSettingsScreenKt.ErrorState$lambda$3(this.f8192x, this.f8193y, this.f8194z, composer, iIntValue);
            case 2:
                return AbstractC14879a.m42937s(this.f8193y, this.f8192x, this.f8194z, composer, iIntValue);
            case 3:
                return AbstractC25717h.m75761C(this.f8192x, this.f8193y, this.f8194z, composer, iIntValue);
            case 4:
                return AbstractC29540v.m90394R(this.f8192x, this.f8193y, this.f8194z, composer, iIntValue);
            case 5:
                return p730qt2.Function1.m93912g(this.f8192x, this.f8193y, this.f8194z, composer, iIntValue);
            case 6:
                return p743vy1.Function1.m117543E(this.f8192x, this.f8193y, this.f8194z, composer, iIntValue);
            default:
                return AbstractC39772c.m127327G(this.f8192x, this.f8193y, this.f8194z, composer, iIntValue);
        }
    }

    public /* synthetic */ C2066k(Function1 function1, int i13, int i14) {
        this.f8191w = 2;
        this.f8193y = i13;
        this.f8192x = function1;
        this.f8194z = i14;
    }
}
