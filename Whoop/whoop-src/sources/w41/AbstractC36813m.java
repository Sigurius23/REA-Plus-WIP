package w41;

import com.google.android.gms.common.util.VisibleForTesting;
import p291l0.C22976l1;
import p291l0.InterfaceC22973k1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: w41.m */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0005H\u0000¢\u0006\u0004\b\t\u0010\n\"\u001a\u0010\u000e\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u001a\u0010\u0010\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000f\u0010\r¨\u0006\u0011"}, m65681d2 = {"Ly3/f;", "mapWidth", "a", "(F)F", "b", "Lw41/x;", "c", "(F)Lw41/x;", "Ll0/k1;", "d", "(Lw41/x;)Ll0/k1;", "F", "getMAP_BACKGROUND_LOGO_STRIP_MIN", "()F", "MAP_BACKGROUND_LOGO_STRIP_MIN", "getMAP_BACKGROUND_LOGO_STRIP_MAX", "MAP_BACKGROUND_LOGO_STRIP_MAX", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36813m {

    /* JADX INFO: renamed from: a */
    private static final float f157490a;

    /* JADX INFO: renamed from: b */
    private static final float f157491b;

    static {
        float f13 = 8;
        f157490a = 12 * f13;
        f157491b = 15 * f13;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: a */
    public static final float m118020a(float f13) {
        float f14 = f13 * 0.22f;
        float f15 = f157490a;
        if (Float.compare(f14, f15) < 0) {
            return f15;
        }
        float f16 = f157491b;
        return Float.compare(f14, f16) > 0 ? f16 : f14;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: b */
    public static final float m118021b(float f13) {
        float fM118020a = f13 - m118020a(f13);
        float f14 = 0 * 8;
        return fM118020a < f14 ? f14 : fM118020a;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: c */
    public static final AbstractC36824x m118022c(float f13) {
        return AbstractC36824x.b.INSTANCE.m118050a(f13);
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC22973k1 m118023d(AbstractC36824x abstractC36824x) {
        AbstractC22676k.m65750j(abstractC36824x, "<this>");
        return new C22976l1(abstractC36824x.getStart(), abstractC36824x.getTop(), abstractC36824x.getEnd(), abstractC36824x.getBottom());
    }
}
