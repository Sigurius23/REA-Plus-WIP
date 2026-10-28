package y00;

import android.os.Parcelable;
import java.util.List;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.C25272z;
import p555vl.AbstractC36095b;

/* JADX INFO: renamed from: y00.j5 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC38869j5 implements InterfaceC38822e8, Parcelable {

    /* JADX INFO: renamed from: w */
    public final EnumC38828f4 f167312w;

    public AbstractC38869j5(EnumC38828f4 enumC38828f4) {
        this.f167312w = enumC38828f4;
    }

    /* JADX INFO: renamed from: b */
    public abstract List mo124343b();

    @Override // y00.InterfaceC38822e8
    /* JADX INFO: renamed from: c0 */
    public final Map mo124325c0() {
        C25272z c25272z = C25272z.f99163w;
        Map mapM73995d0 = c25272z;
        for (C23465k c23465k : mo124343b()) {
            String str = (String) c23465k.f92937w;
            Object obj = c23465k.f92938x;
            Map mapM114689q = obj != null ? AbstractC36095b.m114689q(obj, str) : null;
            if (mapM114689q == null) {
                mapM114689q = c25272z;
            }
            mapM73995d0 = AbstractC25247g0.m73995d0(mapM73995d0, mapM114689q);
        }
        return !mapM73995d0.isEmpty() ? AbstractC36095b.m114689q(mapM73995d0, this.f167312w.f167132w) : c25272z;
    }
}
