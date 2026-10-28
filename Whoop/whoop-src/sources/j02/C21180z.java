package j02;

import android.net.Uri;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: j02.z */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lj02/z;", "Lj02/k0;", "Lj02/i0;", "navDeepLinkRequestHelper", "<init>", "(Lj02/i0;)V", "Lj02/m0;", "navigationScreen", "Lj02/j0;", "provideNavigationData", "(Lj02/m0;)Lj02/j0;", "a", "Lj02/i0;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21180z implements InterfaceC21151k0 {

    /* JADX INFO: renamed from: b */
    public static final int f80718b = C21147i0.f80230a;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21147i0 navDeepLinkRequestHelper;

    public C21180z(C21147i0 navDeepLinkRequestHelper) {
        AbstractC22676k.m65750j(navDeepLinkRequestHelper, "navDeepLinkRequestHelper");
        this.navDeepLinkRequestHelper = navDeepLinkRequestHelper;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a5  */
    @Override // j02.InterfaceC21151k0
    public InterfaceC21149j0 provideNavigationData(AbstractC21155m0 navigationScreen) {
        AbstractC22676k.m65750j(navigationScreen, "navigationScreen");
        String strM30461o = null;
        if (!(navigationScreen instanceof AbstractC21155m0.e1)) {
            if (!(navigationScreen instanceof AbstractC21155m0.d1)) {
                return InterfaceC21149j0.d.f80241a;
            }
            AbstractC21155m0.d1 d1Var = (AbstractC21155m0.d1) navigationScreen;
            String string = AbstractC39414r.m125869O0(d1Var.getExerciseId()).toString();
            if (AbstractC39414r.m125890i0(string)) {
                return InterfaceC21149j0.d.f80241a;
            }
            String entryPoint = d1Var.getEntryPoint();
            if (entryPoint == null) {
                strM30461o = "edit";
            } else {
                strM30461o = AbstractC39414r.m125890i0(entryPoint) ? null : entryPoint;
                if (strM30461o == null) {
                    strM30461o = "edit";
                }
            }
            return new InterfaceC21149j0.c(this.navDeepLinkRequestHelper.m58994a(AbstractC11895b.m31996o("whoop://strength.builder?screen=customExerciseScreen&exerciseId=", Uri.encode(string), AbstractC11266d.m30461o("&source=", Uri.encode(strM30461o)))), null, null, 6, null);
        }
        AbstractC21155m0.e1 e1Var = (AbstractC21155m0.e1) navigationScreen;
        if (AbstractC39414r.m125890i0(e1Var.getExerciseId())) {
            return InterfaceC21149j0.d.f80241a;
        }
        String entryPoint2 = e1Var.getEntryPoint();
        if (entryPoint2 != null) {
            if (AbstractC39414r.m125890i0(entryPoint2)) {
                entryPoint2 = null;
            }
            if (entryPoint2 != null) {
                strM30461o = AbstractC11266d.m30461o("&source=", Uri.encode(entryPoint2));
            }
        }
        if (strM30461o == null) {
            strM30461o = "";
        }
        String strEncode = Uri.encode(e1Var.getExerciseId());
        boolean showCTA = e1Var.getShowCTA();
        String strEncode2 = Uri.encode(e1Var.getEntryPointType());
        boolean isExerciseDetailsV2ExperimentEnabled = e1Var.getIsExerciseDetailsV2ExperimentEnabled();
        StringBuilder sbM73379l = AbstractC25012a.m73379l("whoop://strength.builder?screen=exerciseDetails&exerciseId=", strEncode, "&showCTA=", strM30461o, showCTA);
        sbM73379l.append("&entryPointType=");
        sbM73379l.append(strEncode2);
        sbM73379l.append("&isExerciseDetailsV2ExperimentEnabled=");
        sbM73379l.append(isExerciseDetailsV2ExperimentEnabled);
        return new InterfaceC21149j0.c(this.navDeepLinkRequestHelper.m58994a(sbM73379l.toString()), null, null, 6, null);
    }

    public /* synthetic */ C21180z(C21147i0 c21147i0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C21147i0() : c21147i0);
    }
}
