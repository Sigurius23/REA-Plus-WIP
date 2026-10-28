package w41;

import com.google.android.gms.common.util.VisibleForTesting;
import eu.C13607d0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: w41.q */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a3\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b\"\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b\"\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000b¨\u0006\u0010"}, m65681d2 = {"Lw41/z;", "mapState", "", "a", "(Lw41/z;)Z", "interactive", "isStartActivityRevampEnabled", "hasExternalControls", "Leu/d0;", "b", "(ZLw41/z;ZZ)Leu/d0;", "Leu/d0;", "InteractiveMapUiSettings", "LiveInteractiveMapUiSettings", "c", "StaticMapUiSettings", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36817q {

    /* JADX INFO: renamed from: a */
    private static final C13607d0 f157497a = new C13607d0(false, false, false, false, 1023);

    /* JADX INFO: renamed from: b */
    private static final C13607d0 f157498b = new C13607d0(true, true, true, true, 67);

    /* JADX INFO: renamed from: c */
    private static final C13607d0 f157499c = new C13607d0(false, false, false, false, false, false, false, false, false, false);

    @VisibleForTesting
    /* JADX INFO: renamed from: a */
    public static final boolean m118033a(AbstractC36826z mapState) {
        AbstractC22676k.m65750j(mapState, "mapState");
        if (mapState instanceof AbstractC36826z.b) {
            return false;
        }
        if (mapState instanceof AbstractC36826z.a) {
            return ((AbstractC36826z.a) mapState).getIsMyLocationEnabled();
        }
        throw new NoWhenBranchMatchedException();
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: b */
    public static final C13607d0 m118034b(boolean z4, AbstractC36826z mapState, boolean z13, boolean z14) {
        AbstractC22676k.m65750j(mapState, "mapState");
        if (!z4) {
            return f157499c;
        }
        if (!(mapState instanceof AbstractC36826z.a) || !z13) {
            return f157497a;
        }
        if (!z14) {
            return f157498b;
        }
        C13607d0 c13607d0 = f157498b;
        boolean z15 = c13607d0.f48156a;
        boolean z16 = c13607d0.f48157b;
        boolean z17 = c13607d0.f48158c;
        boolean z18 = c13607d0.f48160e;
        boolean z19 = c13607d0.f48161f;
        boolean z24 = c13607d0.f48162g;
        boolean z25 = c13607d0.f48163h;
        boolean z26 = c13607d0.f48165j;
        c13607d0.getClass();
        return new C13607d0(z15, z16, z17, false, z18, z19, z24, z25, false, z26);
    }
}
