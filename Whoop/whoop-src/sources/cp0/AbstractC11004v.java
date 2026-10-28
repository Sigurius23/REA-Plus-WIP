package cp0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.navigation.DrawerPresentation;
import l83.C23454a0;
import p077d0.AbstractC11333b0;
import p077d0.AbstractC11348f;
import p077d0.C11347e2;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: cp0.v */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a1\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u000b\u0010\f\"\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/navigation/DrawerPresentation;", "presentation", "Lcp0/l;", "e", "(Lcom/whoop/navigation/DrawerPresentation;)Lcp0/l;", "", "halfDrawerExpansionSpanPx", "fullDrawerExpansionSpanPx", "barExpansionSpanPx", "gaugeExpansionSpanPx", "Lcp0/t;", "c", "(FFFFLandroidx/compose/runtime/Composer;II)Lcp0/t;", "Ld0/e2;", "a", "Ld0/e2;", "COACH_DRAWER_SETTLE_ANIMATION", "coach-everywhere_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC11004v {

    /* JADX INFO: renamed from: a */
    private static final C11347e2 f34416a = AbstractC11348f.m30574v(300, 0, AbstractC11333b0.f36310a, 2);

    /* JADX INFO: renamed from: cp0.v$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f34417a;

        static {
            int[] iArr = new int[DrawerPresentation.values().length];
            try {
                iArr[DrawerPresentation.HALF_SCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DrawerPresentation.HOME_GAUGE_LEVEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DrawerPresentation.INLINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DrawerPresentation.FULL_SCREEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f34417a = iArr;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C10998t m29406c(final float f13, final float f14, final float f15, float f16, Composer composer, int i13, int i14) {
        if ((i14 & 8) != 0) {
            f16 = 0.0f;
        }
        final float f17 = f16;
        C28655q c28655q = (C28655q) composer;
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (objM87133R == c28676v0) {
            objM87133R = new C10998t();
            c28655q.m87172p0(objM87133R);
        }
        final C10998t c10998t = (C10998t) objM87133R;
        boolean z4 = true;
        boolean z13 = ((((i13 & 14) ^ 6) > 4 && c28655q.m87147d(f13)) || (i13 & 6) == 4) | ((((i13 & 112) ^ 48) > 32 && c28655q.m87147d(f14)) || (i13 & 48) == 32) | ((((i13 & 896) ^ 384) > 256 && c28655q.m87147d(f15)) || (i13 & 384) == 256);
        if ((((i13 & 7168) ^ 3072) <= 2048 || !c28655q.m87147d(f17)) && (i13 & 3072) != 2048) {
            z4 = false;
        }
        boolean z14 = z13 | z4;
        Object objM87133R2 = c28655q.m87133R();
        if (z14 || objM87133R2 == c28676v0) {
            InterfaceC4339a interfaceC4339a = new InterfaceC4339a() { // from class: cp0.u
                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    return AbstractC11004v.m29407d(c10998t, f13, f14, f15, f17);
                }
            };
            c28655q.m87172p0(interfaceC4339a);
            objM87133R2 = interfaceC4339a;
        }
        AbstractC28683x.m87257k((InterfaceC4339a) objM87133R2, c28655q);
        return c10998t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m29407d(C10998t c10998t, float f13, float f14, float f15, float f16) {
        c10998t.m29401v(f13, f14, f15, f16);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e */
    public static final EnumC10974l m29408e(DrawerPresentation drawerPresentation) {
        int i13 = drawerPresentation == null ? -1 : a.f34417a[drawerPresentation.ordinal()];
        if (i13 != -1) {
            if (i13 == 1) {
                return EnumC10974l.HalfDrawer;
            }
            if (i13 == 2) {
                return EnumC10974l.GaugeLevel;
            }
            if (i13 != 3 && i13 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return EnumC10974l.FullDrawer;
    }
}
