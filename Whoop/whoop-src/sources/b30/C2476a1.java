package b30;

import a30.C0290f1;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import bb0.C2921a;
import br2.AbstractC3563e;
import c11.AbstractC3841h;
import c11.C3842i;
import c41.AbstractC3993b1;
import c42.C4165b;
import c42.C4183t;
import com.whoop.membership.view.upcycle.AbstractC9145b;
import com.whoop.profile.presentation.ProfileViewState;
import com.whoop.profile.view.ProfileBottomSheetKt;
import com.whoop.settings.notification.SettingsNotificationFragment;
import cr2.AbstractC11089e;
import cr2.C11087c;
import cz.C11190b;
import cz.C11197e0;
import cz.C11199f0;
import cz.C11215n0;
import cz.C11223r0;
import d30.C11534g1;
import d30.C11566v;
import d42.AbstractC11700p;
import db0.AbstractC11887c;
import er2.AbstractC13583e;
import er2.C13580b;
import fr2.AbstractC14719d;
import fr2.C14717b;
import gr1.C16105l;
import gr2.AbstractC16117e;
import gr2.C16114b;
import h02.AbstractC16586n;
import h02.AbstractC16589o0;
import h02.C16582l;
import h02.C16591p0;
import hp1.C17544d;
import hr2.AbstractC17585e;
import hr2.C17582b;
import ir2.AbstractC20865d;
import ir2.C20863b;
import j93.AbstractC21478l0;
import java.util.ArrayList;
import java.util.List;
import jp1.AbstractC21855g;
import jr1.AbstractC21899g;
import k71.AbstractC22242b;
import k71.C22258o;
import kd1.AbstractC22403o;
import ld0.C23857p;
import lf0.AbstractC23970t;
import lf0.AbstractC23971t0;
import lf0.C23973u;
import n20.C26173h;
import n20.C26178m;
import n20.C26186u;
import p040c0.InterfaceC3747i0;
import p078d1.C11452e;
import p133f1.C13977s1;
import p291l0.InterfaceC22996s0;
import p291l0.InterfaceC22997s1;
import p291l0.InterfaceC23013y;
import p294l3.C23283u0;
import p412q3.C29891y;
import p510u0.EnumC34318g0;
import p696zy.InterfaceC41211c;
import p700bd1.C3094l;
import p700bd1.C3097o;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p717lq2.AbstractC24669a;
import p717lq2.AbstractC24677i;
import p717lq2.AbstractC24681m;
import p717lq2.AbstractC24688t;
import q20.AbstractC29840y;
import q20.C29810c;
import qx1.C30754a;
import s20.C32077a;
import t00.C33254a;
import t20.C33333n;
import w30.C36784a;
import xq2.C38569i;

/* JADX INFO: renamed from: b30.a1 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C2476a1 implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9645w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f9646x;

    public /* synthetic */ C2476a1(Object obj, int i13) {
        this.f9645w = i13;
        this.f9646x = obj;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0273  */
    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC41211c interfaceC41211cMo91324f;
        C29810c c29810cM91320b;
        boolean z4 = true;
        C33254a c33254aM105492a = null;
        switch (this.f9645w) {
            case 0:
                C26186u c26186u = (C26186u) this.f9646x;
                String str = (String) obj;
                C26173h c26173h = (C26173h) obj2;
                C26178m c26178m = (C26178m) obj3;
                if (c26173h == null || c26178m == null) {
                    return null;
                }
                C0290f1 c0290f1 = c26173h.f103767w;
                return new C2666z0(str, c0290f1.f1019E, c0290f1.f1020w, c26178m.f103822b.f64405H, c26186u.f103856E);
            case 1:
                return C3094l.m8868d((C3097o) this.f9646x, (InterfaceC23013y) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 2:
                return AbstractC3563e.m10685k((C38569i) this.f9646x, (InterfaceC3747i0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 3:
                return AbstractC3841h.m11719Y((C3842i) this.f9646x, (InterfaceC3747i0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 4:
                return AbstractC3993b1.m12099w((ArrayList) this.f9646x, (InterfaceC22996s0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 5:
                return ProfileBottomSheetKt.ProfileBottomSheet$lambda$1((ProfileViewState.BottomSheet) this.f9646x, (InterfaceC23013y) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 6:
                return AbstractC11089e.m29931f((C11087c) this.f9646x, (InterfaceC3747i0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 7:
                return AbstractC9145b.m22877j((C30754a) this.f9646x, (InterfaceC22997s1) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 8:
                C11215n0 c11215n0 = (C11215n0) this.f9646x;
                C11190b c11190b = c11215n0.f35974z;
                C11197e0 customerState = (C11197e0) obj;
                C11199f0 selectionConfirmationState = (C11199f0) obj2;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                AbstractC22676k.m65750j(customerState, "customerState");
                AbstractC22676k.m65750j(selectionConfirmationState, "selectionConfirmationState");
                List list = customerState.f35910a;
                AbstractC29840y abstractC29840y = customerState.f35911b;
                boolean z13 = zBooleanValue && customerState.f35916g;
                boolean z14 = (z13 || AbstractC22676k.m65745e(c11215n0.f35971w, abstractC29840y)) ? false : true;
                return new C11223r0(c11190b.f35891y, list, abstractC29840y, c11215n0.m30339o(), selectionConfirmationState.f35920a, z13, false, z14, customerState.f35916g, customerState.f35914e, selectionConfirmationState.f35921b, (abstractC29840y == null || (interfaceC41211cMo91324f = abstractC29840y.mo91324f(c11190b.f35883F, false)) == null || !z14) ? null : interfaceC41211cMo91324f, customerState.f35915f instanceof C36784a);
            case 9:
                C11452e c11452e = (C11452e) this.f9646x;
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                if (!zBooleanValue2) {
                    iIntValue = c11452e.f36740W.mo15743n(iIntValue);
                }
                if (!zBooleanValue2) {
                    iIntValue2 = c11452e.f36740W.mo15743n(iIntValue2);
                }
                if (c11452e.f36738U) {
                    long j7 = c11452e.f36735R.f122126b;
                    int i13 = C23283u0.f92252c;
                    if (iIntValue == ((int) (j7 >> 32)) && iIntValue2 == ((int) (j7 & 4294967295L))) {
                        z4 = false;
                    } else if (Math.min(iIntValue, iIntValue2) < 0 || Math.max(iIntValue, iIntValue2) > c11452e.f36735R.f122125a.f92135x.length()) {
                        C13977s1 c13977s1 = c11452e.f36741X;
                        c13977s1.m39789s(false);
                        c13977s1.m39786p(EnumC34318g0.f144086w);
                        z4 = false;
                    } else {
                        if (zBooleanValue2 || iIntValue == iIntValue2) {
                            C13977s1 c13977s2 = c11452e.f36741X;
                            c13977s2.m39789s(false);
                            c13977s2.m39786p(EnumC34318g0.f144086w);
                        } else {
                            c11452e.f36741X.m39778h(true);
                        }
                        c11452e.f36736S.f144328v.invoke(new C29891y(c11452e.f36735R.f122125a, AbstractC21478l0.m60431f(iIntValue, iIntValue2), (C23283u0) null));
                    }
                } else {
                    z4 = false;
                }
                return Boolean.valueOf(z4);
            case 10:
                C11566v c11566v = (C11566v) this.f9646x;
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                C29810c c29810c = (C29810c) obj2;
                boolean zBooleanValue4 = ((Boolean) obj3).booleanValue();
                String str2 = c11566v.f37317a;
                C33333n c33333n = c11566v.f37321e;
                C32077a c32077a = c11566v.f37318b;
                List list2 = c11566v.f37319c;
                C33254a c33254a = c11566v.f37323g;
                if (c33254a != null) {
                    c33254aM105492a = C33254a.m105492a(c33254a, null, (c29810c == null || (c29810cM91320b = c29810c.m91320b(str2)) == null) ? null : c29810cM91320b.f121867x, 383);
                }
                return new C11534g1(str2, zBooleanValue3, zBooleanValue4, c33333n, c32077a, list2, c33254aM105492a);
            case 11:
                return AbstractC11700p.m31247V((C4183t) this.f9646x, (InterfaceC1103a) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 12:
                return AbstractC11700p.m31231F((C4165b) this.f9646x, (InterfaceC22997s1) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 13:
                return AbstractC11887c.m31878M((C2921a) this.f9646x, (InterfaceC22996s0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 14:
                return AbstractC13583e.m38337g((C13580b) this.f9646x, (InterfaceC3747i0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 15:
                return AbstractC14719d.m42212d((C14717b) this.f9646x, (InterfaceC3747i0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 16:
                return AbstractC16117e.m45662j((C16114b) this.f9646x, (InterfaceC3747i0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC16586n.m47064j((C16582l) this.f9646x, (InterfaceC3747i0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC16589o0.m47082n((C16591p0) this.f9646x, (InterfaceC3747i0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC17585e.m50070e((C17582b) this.f9646x, (InterfaceC3747i0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 20:
                return SettingsNotificationFragment.m25672S((SettingsNotificationFragment) this.f9646x, (String) obj, ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue());
            case 21:
                return AbstractC20865d.m57638m((C20863b) this.f9646x, (InterfaceC3747i0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC21855g.m61881t((C17544d) this.f9646x, (InterfaceC1103a) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC21899g.m62288n((C16105l) this.f9646x, (InterfaceC1103a) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 24:
                return AbstractC22242b.m63771l((C22258o) this.f9646x, ((Boolean) obj).booleanValue(), (Composer) obj2, ((Integer) obj3).intValue());
            case 25:
                return AbstractC23970t.m70652H((C23973u) this.f9646x, (InterfaceC22996s0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 26:
                return AbstractC23971t0.m70705p((C23857p) this.f9646x, (InterfaceC22996s0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 27:
                return AbstractC24669a.m72064h((Function3) this.f9646x, (InterfaceC3747i0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 28:
                return AbstractC24677i.m72088m((AbstractC22403o) this.f9646x, (InterfaceC3747i0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            default:
                return AbstractC24681m.m72134i((AbstractC24688t) this.f9646x, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    }
}
