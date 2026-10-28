package y00;

import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.C25272z;
import p499t9.C33623c0;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: y00.y5 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC39006y5 implements InterfaceC38822e8, Parcelable {
    @Override // y00.InterfaceC38822e8
    /* JADX INFO: renamed from: c0 */
    public final Map mo124325c0() {
        C33623c0 c33623c0 = EnumC38828f4.f167088G;
        C38997x5 c38997x5 = (C38997x5) this;
        C23465k c23465k = new C23465k("exp_month", c38997x5.f167848w);
        C23465k c23465k2 = new C23465k("exp_year", c38997x5.f167849x);
        C38988w5 c38988w5 = c38997x5.f167850y;
        List<C23465k> listM118959K = AbstractC37056f.m118959K(c23465k, c23465k2, new C23465k("networks", c38988w5 != null ? c38988w5.mo124325c0() : null));
        ArrayList arrayList = new ArrayList();
        for (C23465k c23465k3 : listM118959K) {
            Object obj = c23465k3.f92938x;
            C23465k c23465k4 = obj != null ? new C23465k(c23465k3.f92937w, obj) : null;
            if (c23465k4 != null) {
                arrayList.add(c23465k4);
            }
        }
        Map mapM124385o = AbstractC38963t7.m124385o("card", AbstractC25247g0.m74000i0(arrayList));
        C38977v3 c38977v3 = c38997x5.f167851z;
        Map mapM124385o2 = c38977v3 != null ? AbstractC38963t7.m124385o("billing_details", c38977v3.mo124325c0()) : null;
        Map map = C25272z.f99163w;
        if (mapM124385o2 == null) {
            mapM124385o2 = map;
        }
        EnumC38941r3 enumC38941r3 = c38997x5.f167847F;
        Map mapM95645u = enumC38941r3 != null ? AbstractC31061c.m95645u("allow_redisplay", enumC38941r3.f167636w) : null;
        if (mapM95645u != null) {
            map = mapM95645u;
        }
        return AbstractC25247g0.m73995d0(AbstractC25247g0.m73995d0(mapM124385o2, map), mapM124385o);
    }
}
