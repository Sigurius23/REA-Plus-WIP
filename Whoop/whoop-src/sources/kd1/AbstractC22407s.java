package kd1;

import androidx.compose.runtime.Composer;
import d13.AbstractC11478a;
import p027b3.AbstractC2453v1;
import p390p1.C28655q;
import p390p1.C28674u2;
import p636y3.C39183o;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import r80.AbstractC31061c;
import v63.AbstractC35745c;

/* JADX INFO: renamed from: kd1.s */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Ly3/o;", "", "scale", "a", "(JFLandroidx/compose/runtime/Composer;I)J", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22407s {
    /* JADX INFO: renamed from: a */
    public static final long m64512a(long j7, float f13, Composer composer, int i13) {
        float fM124805c = C39183o.m124805c(j7);
        C28674u2 c28674u2 = AbstractC2453v1.f9569h;
        C28655q c28655q = (C28655q) composer;
        long jM95626b = AbstractC31061c.m95626b(fM124805c, 4294967296L, (InterfaceC39171c) c28655q.m87161k(c28674u2));
        float fMin = Math.min(f13, ((InterfaceC39171c) c28655q.m87161k(c28674u2)).getFontScale());
        AbstractC35745c.m113242a(jM95626b);
        return AbstractC11478a.m30852d(jM95626b, 1095216660480L & jM95626b, fMin);
    }
}
