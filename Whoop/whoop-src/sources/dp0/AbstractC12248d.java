package dp0;

import android.annotation.SuppressLint;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import com.whoop.data.repositories.FeatureFlagChecker;
import ep0.C13398d;
import ep0.C13404j;
import java.util.WeakHashMap;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p077d0.AbstractC11348f;
import p077d0.AbstractC11352g;
import p291l0.C22944c2;
import p291l0.C22949e;
import p291l0.C22976l1;
import p291l0.InterfaceC22973k1;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p636y3.C39174f;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qf1.AbstractC30320a;

/* JADX INFO: renamed from: dp0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a1\u0010\n\u001a\u00020\u0004*\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a-\u0010\u000e\u001a\u00020\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\t\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\"\u0017\u0010\u0013\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0015\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010¨\u0006\u001a²\u0006\f\u0010\u0017\u001a\u00020\u00168\nX\u008a\u0084\u0002²\u0006\f\u0010\u0018\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\f\u0010\u0017\u001a\u00020\u00168\nX\u008a\u0084\u0002²\u0006\f\u0010\u0019\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/data/repositories/FeatureFlagChecker;", "", "e", "(Lcom/whoop/data/repositories/FeatureFlagChecker;)Z", "Landroidx/compose/ui/Modifier;", "Lep0/j;", "screenContext", "Ly3/f;", "bottomPadding", "isNavHostScreen", "a", "(Landroidx/compose/ui/Modifier;Lep0/j;FZLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;", "Ll0/k1;", "basePadding", "f", "(Lep0/j;Ll0/k1;ZLandroidx/compose/runtime/Composer;II)Ll0/k1;", "F", "d", "()F", "FAB_HEIGHT_WITH_MARGIN", "b", "COACH_BAR_HEIGHT_WITH_MARGIN", "Lep0/d;", "globalCoachState", "animatedPadding", "animatedBottomPadding", "coach-everywhere-common_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC12248d {

    /* JADX INFO: renamed from: a */
    private static final float f40979a = 86;

    /* JADX INFO: renamed from: b */
    private static final float f40980b = 160;

    @SuppressLint({"ComposableModifierFactory", "This is actually the standard moving forward, but lint disagrees and the agents will keep trying to change it"})
    /* JADX INFO: renamed from: a */
    public static final Modifier m34108a(Modifier coachEverywhereBottomSheetPadding, C13404j c13404j, float f13, boolean z4, Composer composer, int i13, int i14) {
        boolean zM34112e;
        AbstractC22676k.m65750j(coachEverywhereBottomSheetPadding, "$this$coachEverywhereBottomSheetPadding");
        if ((i14 & 2) != 0) {
            f13 = 0;
        }
        if ((i14 & 4) != 0) {
            z4 = false;
        }
        C28655q c28655q = (C28655q) composer;
        InterfaceC12251g interfaceC12251g = (InterfaceC12251g) c28655q.m87161k(AbstractC12252h.m34153c());
        Configuration configuration = (Configuration) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4975a);
        InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
        InterfaceC28601c1 interfaceC28601c1M87261o = AbstractC28683x.m87261o(interfaceC12251g.getState(), c28655q, 0);
        c28655q.m87150e0(-2065207088);
        WeakHashMap weakHashMap = C22944c2.f90553v;
        float fMo733e0 = interfaceC39171c.mo733e0(C22949e.m66712e(c28655q).f90558e.m66705e().f151452d);
        c28655q.m87173q(false);
        if (z4) {
            c28655q.m87150e0(-2065201962);
            zM34112e = m34112e((FeatureFlagChecker) c28655q.m87161k(AbstractC30320a.m92665c()));
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(403249855);
            c28655q.m87173q(false);
            zM34112e = false;
        }
        return AbstractC1099a.m3398t(coachEverywhereBottomSheetPadding, 0.0f, 0.0f, 0.0f, m34110c(AbstractC11352g.m30587a(m34109b(interfaceC28601c1M87261o).getIsBottomSheetVisible() ? configuration.screenHeightDp * 0.35f : f13 + fMo733e0 + (zM34112e ? f40980b : f40979a), AbstractC11348f.m30574v(300, 0, null, 6), "coach_bottom_sheet_padding", c28655q, 432, 8)), 7).mo3471e(C2314t.f9131w);
    }

    /* JADX INFO: renamed from: b */
    private static final C13398d m34109b(InterfaceC28670t2 interfaceC28670t2) {
        return (C13398d) interfaceC28670t2.getValue();
    }

    /* JADX INFO: renamed from: c */
    private static final float m34110c(InterfaceC28670t2 interfaceC28670t2) {
        return ((C39174f) interfaceC28670t2.getValue()).f168413w;
    }

    /* JADX INFO: renamed from: d */
    public static final float m34111d() {
        return f40979a;
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m34112e(FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(featureFlagChecker, "<this>");
        return featureFlagChecker.isFeatureEnabled("aix-coach-bar-fab") && featureFlagChecker.isFeatureEnabled("aix-coach-bar-home");
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a2  */
    /* JADX INFO: renamed from: f */
    public static final InterfaceC22973k1 m34113f(C13404j c13404j, InterfaceC22973k1 interfaceC22973k1, boolean z4, Composer composer, int i13, int i14) {
        boolean zM34112e;
        boolean z13;
        float fMo43109a;
        if ((i14 & 2) != 0) {
            float f13 = 0;
            interfaceC22973k1 = new C22976l1(f13, f13, f13, f13);
        }
        if ((i14 & 4) != 0) {
            z4 = false;
        }
        C28655q c28655q = (C28655q) composer;
        InterfaceC12251g interfaceC12251g = (InterfaceC12251g) c28655q.m87161k(AbstractC12252h.m34153c());
        Configuration configuration = (Configuration) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4975a);
        InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
        EnumC39181m enumC39181m = (EnumC39181m) c28655q.m87161k(AbstractC2453v1.f9575n);
        InterfaceC28601c1 interfaceC28601c1M87261o = AbstractC28683x.m87261o(interfaceC12251g.getState(), c28655q, 0);
        c28655q.m87150e0(-898470918);
        WeakHashMap weakHashMap = C22944c2.f90553v;
        float fMo733e0 = interfaceC39171c.mo733e0(C22949e.m66712e(c28655q).f90558e.m66705e().f151452d);
        c28655q.m87173q(false);
        if (z4) {
            c28655q.m87150e0(-898465792);
            zM34112e = m34112e((FeatureFlagChecker) c28655q.m87161k(AbstractC30320a.m92665c()));
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(-2082634539);
            c28655q.m87173q(false);
            zM34112e = false;
        }
        float f14 = zM34112e ? f40980b : f40979a;
        if (m34114g(interfaceC28601c1M87261o).getIsBottomSheetVisible()) {
            fMo43109a = configuration.screenHeightDp * 0.35f;
        } else {
            if (c13404j != null) {
                z13 = c13404j.getIsWceEnabled();
            }
            fMo43109a = z13 ? interfaceC22973k1.mo43109a() + fMo733e0 + f14 : interfaceC22973k1.mo43109a() + fMo733e0;
        }
        return new C22976l1(AbstractC1099a.m3387i(interfaceC22973k1, enumC39181m), interfaceC22973k1.mo43112d(), AbstractC1099a.m3386h(interfaceC22973k1, enumC39181m), m34115h(AbstractC11352g.m30587a(fMo43109a, AbstractC11348f.m30574v(300, 0, null, 6), "coach_bottom_sheet_content_padding", c28655q, 432, 8)));
    }

    /* JADX INFO: renamed from: g */
    private static final C13398d m34114g(InterfaceC28670t2 interfaceC28670t2) {
        return (C13398d) interfaceC28670t2.getValue();
    }

    /* JADX INFO: renamed from: h */
    private static final float m34115h(InterfaceC28670t2 interfaceC28670t2) {
        return ((C39174f) interfaceC28670t2.getValue()).f168413w;
    }
}
