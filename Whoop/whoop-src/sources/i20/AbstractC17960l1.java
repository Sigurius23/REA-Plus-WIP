package i20;

import a01.C0084d;
import a20.C0168h;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.lifecycle.InterfaceC1620r;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2479a4;
import b30.C2509e2;
import b30.C2539i0;
import b30.C2552j5;
import b30.C2647w2;
import b30.C2662y3;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.stripe.android.uicore.elements.AddressFieldConfiguration;
import com.stripe.android.uicore.elements.C5705a;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.whoop.android.R;
import d30.C11518b0;
import d30.C11558r;
import d40.AbstractC11672q;
import g40.C15351f3;
import g40.C15352f4;
import g40.C15383l0;
import g40.InterfaceC15391m3;
import h02.C16587n0;
import h20.C16670i0;
import h20.C16671i1;
import h20.C16760x0;
import j93.InterfaceC21467g;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import k83.InterfaceC22297a;
import l83.C23454a0;
import l83.C23465k;
import live.hms.video.utils.AndroidSDKConstants;
import m63.C25126d;
import m83.AbstractC25247g0;
import m83.C25272z;
import n53.C26318e;
import no.nordicsemi.android.dfu.DfuBaseService;
import o73.C27648a;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p026b2.InterfaceC2300f;
import p027b3.AbstractC2453v1;
import p088dc.AbstractC11894a;
import p163g1.AbstractC14981d1;
import p163g1.AbstractC15011f9;
import p163g1.AbstractC15018g5;
import p163g1.AbstractC15044i9;
import p163g1.C14970c1;
import p163g1.C15033h9;
import p164g2.InterfaceC15237i;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p291l0.C23016z;
import p294l3.C23248d;
import p294l3.C23254g;
import p294l3.C23280t;
import p294l3.C23285v0;
import p298l8.C23418a;
import p323m8.AbstractC25218a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p619xl.C38445a;
import p635y2.InterfaceC39127r0;
import p708hb2.C17098f;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import wb3.AbstractC37056f;
import y00.C38793c;
import y00.C38919p;
import y30.C39189d;

/* JADX INFO: renamed from: i20.l1 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC17960l1 {

    /* JADX INFO: renamed from: a */
    public static final C17963m1 f69771a = new C17963m1();

    /* JADX INFO: renamed from: a */
    public static final void m51574a(InterfaceC22297a autoCompleteViewModelSubcomponentFactoryProvider, C17957k1 navigator, String str, Composer composer, int i13) {
        AbstractC22676k.m65750j(autoCompleteViewModelSubcomponentFactoryProvider, "autoCompleteViewModelSubcomponentFactoryProvider");
        AbstractC22676k.m65750j(navigator, "navigator");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-597861359);
        int i14 = (c28655q.m87157i(autoCompleteViewModelSubcomponentFactoryProvider) ? 4 : 2) | i13 | (c28655q.m87153g(navigator) ? 32 : 16) | (c28655q.m87153g(str) ? 256 : 128);
        if ((i14 & 147) == 146 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            C0168h c0168h = new C0168h(new C38445a(autoCompleteViewModelSubcomponentFactoryProvider, new C17970p0(str)), 6);
            c28655q.m87152f0(1729797275);
            InterfaceC1583f2 interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
            if (interfaceC1583f2M73844a == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            AbstractC1637w1 abstractC1637w1M88523c0 = AbstractC29125c.m88523c0(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17982v0.class), interfaceC1583f2M73844a, null, c0168h, interfaceC1583f2M73844a instanceof InterfaceC1620r ? ((InterfaceC1620r) interfaceC1583f2M73844a).getDefaultViewModelCreationExtras() : C23418a.f92771b, c28655q);
            c28655q.m87173q(false);
            m51576c((C17982v0) abstractC1637w1M88523c0, navigator, null, c28655q, i14 & 112);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0084d(autoCompleteViewModelSubcomponentFactoryProvider, navigator, str, false, i13, 27);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m51575b(C17982v0 c17982v0, InterfaceC17929b0 appearanceContext, Integer num, Composer composer, int i13) {
        C28676v0 c28676v0;
        C28676v0 c28676v1;
        C28655q c28655q;
        AbstractC22676k.m65750j(appearanceContext, "appearanceContext");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(154747508);
        int i14 = i13 | (c28655q2.m87157i(c17982v0) ? 4 : 2) | (c28655q2.m87153g(appearanceContext) ? 32 : 16) | (c28655q2.m87153g(num) ? 256 : 128);
        if ((i14 & 1171) == 1170 && c28655q2.m87121F()) {
            c28655q2.m87138X();
            c28655q = c28655q2;
        } else {
            InterfaceC28601c1 interfaceC28601c1M83597t = C27648a.m83597t(c17982v0.f69819z, c28655q2, 0);
            InterfaceC28601c1 interfaceC28601c1M83597t2 = C27648a.m83597t(c17982v0.f69811E, c28655q2, 0);
            List list = (List) interfaceC28601c1M83597t.getValue();
            boolean zBooleanValue = ((Boolean) interfaceC28601c1M83597t2.getValue()).booleanValue();
            C15351f3 c15351f3 = c17982v0.f69815I;
            c28655q2.m87150e0(703970404);
            boolean zM87157i = c28655q2.m87157i(c17982v0);
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v2 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v2) {
                c28676v0 = c28676v2;
                C2539i0 c2539i0 = new C2539i0(0, c17982v0, C17982v0.class, "onBackPressed", "onBackPressed()V", 0, 15);
                c28655q2.m87172p0(c2539i0);
                objM87133R = c2539i0;
            } else {
                c28676v0 = c28676v2;
            }
            c28655q2.m87173q(false);
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) ((InterfaceC21467g) objM87133R);
            c28655q2.m87150e0(703972077);
            boolean zM87157i2 = c28655q2.m87157i(c17982v0);
            Object objM87133R2 = c28655q2.m87133R();
            if (zM87157i2) {
                c28676v1 = c28676v0;
                C2539i0 c2539i1 = new C2539i0(0, c17982v0, C17982v0.class, "onEnterAddressManually", "onEnterAddressManually()V", 0, 16);
                c28655q2.m87172p0(c2539i1);
                objM87133R2 = c2539i1;
            } else {
                C28676v0 c28676v3 = c28676v0;
                if (objM87133R2 == c28676v3) {
                    c28676v0 = c28676v3;
                    c28676v1 = c28676v0;
                    C2539i0 c2539i2 = new C2539i0(0, c17982v0, C17982v0.class, "onEnterAddressManually", "onEnterAddressManually()V", 0, 16);
                    c28655q2.m87172p0(c2539i2);
                    objM87133R2 = c2539i2;
                } else {
                    c28676v1 = c28676v3;
                }
            }
            c28655q2.m87173q(false);
            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) ((InterfaceC21467g) objM87133R2);
            c28655q2.m87150e0(703974119);
            boolean zM87157i3 = c28655q2.m87157i(c17982v0);
            Object objM87133R3 = c28655q2.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v1) {
                C15352f4 c15352f4 = new C15352f4(1, c17982v0, C17982v0.class, "selectPrediction", "selectPrediction(Lcom/stripe/android/ui/core/elements/autocomplete/model/AutocompletePrediction;)V", 0, 10);
                c28655q2.m87172p0(c15352f4);
                objM87133R3 = c15352f4;
            }
            c28655q2.m87173q(false);
            c28655q = c28655q2;
            m51577d(list, zBooleanValue, c15351f3, num, appearanceContext, interfaceC4339a, interfaceC4339a2, (Function1) ((InterfaceC21467g) objM87133R3), c28655q, ((i14 << 3) & 7168) | 512 | ((i14 << 9) & 57344) | ProfileVerifier.CompilationStatus.f6515xf2722a21);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0084d(c17982v0, appearanceContext, num, i13, 26);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m51576c(C17982v0 viewModel, C17957k1 navigator, Integer num, Composer composer, int i13) {
        int i14;
        Integer numM124826e;
        Integer num2;
        AbstractC22676k.m65750j(viewModel, "viewModel");
        AbstractC22676k.m65750j(navigator, "navigator");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1164200668);
        int i15 = (c28655q.m87157i(viewModel) ? 4 : 2) | i13 | (c28655q.m87153g(navigator) ? 32 : 16) | 128;
        if ((i15 & 147) == 146 && c28655q.m87121F()) {
            c28655q.m87138X();
            num2 = num;
        } else {
            c28655q.m87140Z();
            int i16 = 0;
            if ((i13 & 1) == 0 || c28655q.m87118C()) {
                i14 = i15 & (-897);
                numM124826e = C39189d.m124826e(AbstractC11894a.m31939G(c28655q), new C15383l0(i16));
            } else {
                c28655q.m87138X();
                i14 = i15 & (-897);
                numM124826e = num;
            }
            c28655q.m87175r();
            c28655q.m87150e0(703915933);
            boolean zM87157i = ((i14 & 112) == 32) | c28655q.m87157i(viewModel);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C16670i0(viewModel, navigator, (InterfaceC30057d) null, 8);
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, C23454a0.f92919a);
            long jM43093h = ((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43093h();
            C37816b c37816b = AbstractC17986x0.f69826a;
            m51579f(viewModel, numM124826e, jM43093h, c28655q, (i14 & 14) | 24960);
            num2 = numM124826e;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0084d(viewModel, navigator, num2, i13, 28);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m51577d(List list, boolean z4, InterfaceC15391m3 queryController, Integer num, InterfaceC17929b0 appearanceContext, InterfaceC4339a onBackPressed, InterfaceC4339a onEnterManually, Function1 onSelectPrediction, Composer composer, int i13) {
        List list2;
        int i14;
        boolean z13;
        AbstractC22676k.m65750j(queryController, "queryController");
        AbstractC22676k.m65750j(appearanceContext, "appearanceContext");
        AbstractC22676k.m65750j(onBackPressed, "onBackPressed");
        AbstractC22676k.m65750j(onEnterManually, "onEnterManually");
        AbstractC22676k.m65750j(onSelectPrediction, "onSelectPrediction");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1440495536);
        if ((i13 & 6) == 0) {
            list2 = list;
            i14 = (c28655q.m87157i(list2) ? 4 : 2) | i13;
        } else {
            list2 = list;
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            z13 = z4;
            i14 |= c28655q.m87155h(z13) ? 32 : 16;
        } else {
            z13 = z4;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(queryController) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87153g(num) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= (32768 & i13) == 0 ? c28655q.m87153g(appearanceContext) : c28655q.m87157i(appearanceContext) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q.m87155h(true) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((i13 & 1572864) == 0) {
            i14 |= c28655q.m87157i(onBackPressed) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i14 |= c28655q.m87157i(onEnterManually) ? 8388608 : 4194304;
        }
        if ((100663296 & i13) == 0) {
            i14 |= c28655q.m87157i(onSelectPrediction) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        if ((38347923 & i14) == 38347922 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            int i15 = 1572864 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (458752 & i14);
            int i16 = i14 << 3;
            m51578e(list2, z13, queryController, num, appearanceContext.mo51568d0(c28655q), true, AbstractC37817c.m121344e(847752627, c28655q, new C2479a4(appearanceContext, 2)), onBackPressed, onEnterManually, onSelectPrediction, c28655q, (i16 & 1879048192) | i15 | (29360128 & i16) | (234881024 & i16));
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2509e2(list, z4, queryController, num, appearanceContext, onBackPressed, onEnterManually, onSelectPrediction, i13);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m51578e(final List list, final boolean z4, final InterfaceC15391m3 queryController, final Integer num, final long j7, final boolean z13, final C37816b c37816b, final InterfaceC4339a onBackPressed, final InterfaceC4339a onEnterManually, final Function1 onSelectPrediction, Composer composer, final int i13) {
        int i14;
        boolean z14;
        Integer num2;
        C28655q c28655q;
        AbstractC22676k.m65750j(queryController, "queryController");
        AbstractC22676k.m65750j(onBackPressed, "onBackPressed");
        AbstractC22676k.m65750j(onEnterManually, "onEnterManually");
        AbstractC22676k.m65750j(onSelectPrediction, "onSelectPrediction");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(266972303);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87157i(list) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            z14 = z4;
            i14 |= c28655q2.m87155h(z14) ? 32 : 16;
        } else {
            z14 = z4;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(queryController) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            num2 = num;
            i14 |= c28655q2.m87153g(num2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            num2 = num;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q2.m87151f(j7) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q2.m87155h(z13) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i14 |= c28655q2.m87157i(c37816b) ? 1048576 : 524288;
        }
        if ((i13 & 12582912) == 0) {
            i14 |= c28655q2.m87157i(onBackPressed) ? 8388608 : 4194304;
        }
        if ((100663296 & i13) == 0) {
            i14 |= c28655q2.m87157i(onEnterManually) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        if ((805306368 & i13) == 0) {
            i14 |= c28655q2.m87157i(onSelectPrediction) ? 536870912 : 268435456;
        }
        int i15 = i14;
        if ((i15 & 306783379) == 306783378 && c28655q2.m87121F()) {
            c28655q2.m87138X();
            c28655q = c28655q2;
        } else {
            c28655q = c28655q2;
            AbstractC15018g5.m43116a(null, null, AbstractC37817c.m121344e(1403760426, c28655q2, new C2552j5(c37816b, z13, onBackPressed, 2)), AbstractC37817c.m121344e(-200243447, c28655q2, new C17959l0(onEnterManually, 0)), null, null, 0, false, null, 0.0f, 0L, 0L, 0L, j7, 0L, AbstractC37817c.m121344e(138753041, c28655q2, new C17965n0(z14, list, queryController, C27648a.m83597t(queryController.mo43570p(), c28655q2, 0), num2, onSelectPrediction)), c28655q, 3456, ((i15 << 3) & 458752) | 12582912, 98291);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: i20.j0
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC17960l1.m51578e(list, z4, queryController, num, j7, z13, c37816b, onBackPressed, onEnterManually, onSelectPrediction, (Composer) obj, AbstractC28683x.m87244L(i13 | 1));
                    return C23454a0.f92919a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m51579f(C17982v0 viewModel, Integer num, long j7, Composer composer, int i13) {
        int i14;
        C28676v0 c28676v0;
        boolean z4;
        C28655q c28655q;
        C37816b c37816b = AbstractC17986x0.f69826a;
        AbstractC22676k.m65750j(viewModel, "viewModel");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1283797203);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87157i(viewModel) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87153g(num) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87155h(false) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q2.m87151f(j7) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q2.m87157i(c37816b) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        int i15 = i14;
        if ((i15 & 9363) == 9362 && c28655q2.m87121F()) {
            c28655q2.m87138X();
            c28655q = c28655q2;
        } else {
            InterfaceC28601c1 interfaceC28601c1M83597t = C27648a.m83597t(viewModel.f69819z, c28655q2, 0);
            InterfaceC28601c1 interfaceC28601c1M83597t2 = C27648a.m83597t(viewModel.f69811E, c28655q2, 0);
            List list = (List) interfaceC28601c1M83597t.getValue();
            boolean zBooleanValue = ((Boolean) interfaceC28601c1M83597t2.getValue()).booleanValue();
            C15351f3 c15351f3 = viewModel.f69815I;
            c28655q2.m87150e0(703997540);
            boolean zM87157i = c28655q2.m87157i(viewModel);
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v1) {
                c28676v0 = c28676v1;
                z4 = false;
                C2539i0 c2539i0 = new C2539i0(0, viewModel, C17982v0.class, "onBackPressed", "onBackPressed()V", 0, 17);
                c28655q2.m87172p0(c2539i0);
                objM87133R = c2539i0;
            } else {
                z4 = false;
                c28676v0 = c28676v1;
            }
            InterfaceC21467g interfaceC21467g = (InterfaceC21467g) objM87133R;
            c28655q2.m87173q(z4);
            c28655q2.m87150e0(703999213);
            boolean zM87157i2 = c28655q2.m87157i(viewModel);
            Object objM87133R2 = c28655q2.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                C2539i0 c2539i1 = new C2539i0(0, viewModel, C17982v0.class, "onEnterAddressManually", "onEnterAddressManually()V", 0, 18);
                c28655q2.m87172p0(c2539i1);
                objM87133R2 = c2539i1;
            }
            InterfaceC21467g interfaceC21467g2 = (InterfaceC21467g) objM87133R2;
            c28655q2.m87173q(z4);
            c28655q2.m87150e0(704001255);
            boolean zM87157i3 = c28655q2.m87157i(viewModel);
            Object objM87133R3 = c28655q2.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v0) {
                C15352f4 c15352f4 = new C15352f4(1, viewModel, C17982v0.class, "selectPrediction", "selectPrediction(Lcom/stripe/android/ui/core/elements/autocomplete/model/AutocompletePrediction;)V", 0, 11);
                c28655q2.m87172p0(c15352f4);
                objM87133R3 = c15352f4;
            }
            c28655q2.m87173q(z4);
            int i16 = i15 << 6;
            c28655q = c28655q2;
            m51578e(list, zBooleanValue, c15351f3, num, j7, false, c37816b, (InterfaceC4339a) interfaceC21467g, (InterfaceC4339a) interfaceC21467g2, (Function1) ((InterfaceC21467g) objM87133R3), c28655q, (i16 & 7168) | 512 | ((i15 << 3) & 57344) | ((i15 << 9) & 458752) | (i16 & 3670016));
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17956k0(viewModel, num, j7, i13);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m51580g(InterfaceC4339a onClick, Composer composer, int i13) {
        C28655q c28655q;
        AbstractC22676k.m65750j(onClick, "onClick");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-776723448);
        int i14 = (c28655q2.m87157i(onClick) ? 4 : 2) | i13;
        if ((i14 & 3) == 2 && c28655q2.m87121F()) {
            c28655q2.m87138X();
            c28655q = c28655q2;
        } else {
            c28655q2.m87150e0(-1477613758);
            C23248d c23248d = new C23248d();
            c28655q2.m87150e0(1107030156);
            boolean z4 = (i14 & 14) == 4;
            Object objM87133R = c28655q2.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C17990z0(onClick, 0);
                c28655q2.m87172p0(objM87133R);
            }
            c28655q2.m87173q(false);
            C23280t c23280t = new C23280t("EnterAddressManually", null, (C17990z0) objM87133R);
            c28655q2.m87150e0(-1477605305);
            int iM67305g = c23248d.m67305g(c23280t);
            try {
                c23248d.m67300b(AbstractC30060g.m92103Y(c28655q2, R.string.stripe_paymentsheet_enter_address_manually));
                c23248d.m67304f(iM67305g);
                c28655q2.m87173q(false);
                C23254g c23254gM67309k = c23248d.m67309k();
                c28655q2.m87173q(false);
                c28655q = c28655q2;
                AbstractC15011f9.m43115c(c23254gM67309k, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, C23285v0.m67364b(((C15033h9) c28655q2.m87161k(AbstractC15044i9.f56319b)).f56282i, ((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43091f(), AbstractC11672q.f37694d.f37727i, null, null, 0L, 0, 0L, null, null, 16777212), c28655q, 0, 0, 131070);
            } catch (Throwable th3) {
                c23248d.m67304f(iM67305g);
                throw th3;
            }
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2662y3(i13, 4, onClick);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m51581h(InterfaceC22297a inputAddressViewModelSubcomponentFactoryProvider, Composer composer, int i13) {
        AbstractC22676k.m65750j(inputAddressViewModelSubcomponentFactoryProvider, "inputAddressViewModelSubcomponentFactoryProvider");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1998888381);
        if ((((c28655q.m87157i(inputAddressViewModelSubcomponentFactoryProvider) ? 4 : 2) | i13) & 3) == 2 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            C17942f1 c17942f1 = new C17942f1(inputAddressViewModelSubcomponentFactoryProvider);
            c28655q.m87152f0(1729797275);
            InterfaceC1583f2 interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
            if (interfaceC1583f2M73844a == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            AbstractC1637w1 abstractC1637w1M88523c0 = AbstractC29125c.m88523c0(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17954j1.class), interfaceC1583f2M73844a, null, c17942f1, interfaceC1583f2M73844a instanceof InterfaceC1620r ? ((InterfaceC1620r) interfaceC1583f2M73844a).getDefaultViewModelCreationExtras() : C23418a.f92771b, c28655q);
            c28655q.m87173q(false);
            C17954j1 c17954j1 = (C17954j1) abstractC1637w1M88523c0;
            C25126d c25126d = c17954j1.f69751L;
            C17946h c17946h = c17954j1.f69756w;
            InterfaceC28601c1 interfaceC28601c1M83597t = C27648a.m83597t((C26318e) c25126d.f98481G, c28655q, 0);
            C17975s c17975s = c17946h.f69728x;
            String strM92103Y = c17975s != null ? c17975s.f69807z : null;
            c28655q.m87150e0(-1988496391);
            if (strM92103Y == null) {
                strM92103Y = AbstractC30060g.m92103Y(c28655q, R.string.stripe_paymentsheet_address_element_primary_button);
            }
            c28655q.m87173q(false);
            C17975s c17975s2 = c17946h.f69728x;
            String strM92103Y2 = c17975s2 != null ? c17975s2.f69800F : null;
            c28655q.m87150e0(-1988491659);
            if (strM92103Y2 == null) {
                strM92103Y2 = AbstractC30060g.m92103Y(c28655q, R.string.stripe_paymentsheet_address_element_shipping_address);
            }
            c28655q.m87173q(false);
            InterfaceC28601c1 interfaceC28601c1M83597t2 = C27648a.m83597t(c17954j1.f69753N, c28655q, 0);
            InterfaceC28601c1 interfaceC28601c1M83597t3 = C27648a.m83597t(c17954j1.f69755P, c28655q, 0);
            InterfaceC28601c1 interfaceC28601c1M83597t4 = C27648a.m83597t(c17954j1.f69747H, c28655q, 0);
            boolean z4 = ((Map) interfaceC28601c1M83597t.getValue()) != null;
            c28655q.m87150e0(-1988474819);
            boolean zM87157i = c28655q.m87157i(c17954j1) | c28655q.m87153g(interfaceC28601c1M83597t) | c28655q.m87153g(interfaceC28601c1M83597t3);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C11558r(c17954j1, interfaceC28601c1M83597t, interfaceC28601c1M83597t3, 26);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            c28655q.m87173q(false);
            c28655q.m87150e0(-1988469925);
            boolean zM87157i2 = c28655q.m87157i(c17954j1);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C16587n0(c17954j1, 12);
                c28655q.m87172p0(objM87133R2);
            }
            c28655q.m87173q(false);
            boolean z13 = z4;
            m51582i(z13, strM92103Y, strM92103Y2, interfaceC4339a, (InterfaceC4339a) objM87133R2, AbstractC37817c.m121344e(-2084438075, c28655q, new C17936d1(c17954j1, interfaceC28601c1M83597t4, interfaceC28601c1M83597t2, 0)), AbstractC37817c.m121344e(268350756, c28655q, new C11518b0(4, c17954j1, c25126d)), AbstractC37817c.m121344e(-1673827709, c28655q, new C17936d1(c17954j1, interfaceC28601c1M83597t3, interfaceC28601c1M83597t2, 1)), c28655q, 14352384);
            c28655q = c28655q;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17098f(inputAddressViewModelSubcomponentFactoryProvider, i13);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m51582i(boolean z4, String primaryButtonText, String title, InterfaceC4339a onPrimaryButtonClick, InterfaceC4339a onCloseClick, C37816b c37816b, C37816b c37816b2, C37816b c37816b3, Composer composer, int i13) {
        C28655q c28655q;
        AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(onPrimaryButtonClick, "onPrimaryButtonClick");
        AbstractC22676k.m65750j(onCloseClick, "onCloseClick");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-792464202);
        if (((i13 | (c28655q2.m87155h(z4) ? 4 : 2) | (c28655q2.m87153g(primaryButtonText) ? 32 : 16) | (c28655q2.m87153g(title) ? 256 : 128) | (c28655q2.m87157i(onPrimaryButtonClick) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) | (c28655q2.m87157i(onCloseClick) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK)) & 4793491) == 4793490 && c28655q2.m87121F()) {
            c28655q2.m87138X();
            c28655q = c28655q2;
        } else {
            InterfaceC15237i interfaceC15237i = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
            c28655q = c28655q2;
            AbstractC15018g5.m43116a(AbstractC22953f.m66720i(AbstractC1102d.m3406c(1.0f, C2314t.f9131w)), null, AbstractC37817c.m121344e(-340151621, c28655q2, new C2647w2(16, interfaceC15237i, onCloseClick)), null, null, null, 0, false, null, 0.0f, 0L, 0L, 0L, ((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43093h(), 0L, AbstractC37817c.m121344e(-1627884300, c28655q2, new C17933c1(title, c37816b, c37816b2, c37816b3, primaryButtonText, z4, interfaceC15237i, onPrimaryButtonClick, 1)), c28655q, 384, 12582912, 98298);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17927a1(z4, primaryButtonText, title, onPrimaryButtonClick, onCloseClick, c37816b, c37816b2, c37816b3, i13);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m51583j(Modifier modifier, InterfaceC2300f interfaceC2300f, C37816b c37816b, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1837765585);
        if ((((c28655q.m87153g(modifier) ? 4 : 2) | i13 | 48) & 147) == 146 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            interfaceC2300f = C2299e.f9110M;
            Modifier modifierM92116f0 = AbstractC30060g.m92116f0(C2314t.f9131w, AbstractC30060g.m92099U(0, c28655q, 1), 14);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM92116f0);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, interfaceC2300f, c28655q, 48);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifier);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            c37816b.invoke(C23016z.f90757a, c28655q, 54);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        }
        InterfaceC2300f interfaceC2300f2 = interfaceC2300f;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0084d(modifier, interfaceC2300f2, c37816b, i13, 25);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m51584k(C17957k1 c17957k1) {
        C17977t c17977t = new C17977t(true);
        Function1 function1 = c17957k1.f69767b;
        if (function1 != null) {
            function1.invoke(c17977t);
        }
    }

    /* JADX INFO: renamed from: l */
    public static final int m51585l(String str, String str2) {
        if (str.equals(str2)) {
            return 0;
        }
        if (str.length() == 0) {
            return str2.length();
        }
        if (str2.length() == 0) {
            return str.length();
        }
        int length = str.length();
        int i13 = length + 1;
        int length2 = str2.length() + 1;
        Integer[] numArr = new Integer[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            numArr[i14] = Integer.valueOf(i14);
        }
        Integer[] numArr2 = new Integer[i13];
        for (int i15 = 0; i15 < i13; i15++) {
            numArr2[i15] = 0;
        }
        int i16 = 1;
        while (i16 < length2) {
            numArr2[0] = Integer.valueOf(i16);
            for (int i17 = 1; i17 < i13; i17++) {
                int i18 = i17 - 1;
                numArr2[i17] = Integer.valueOf(Math.min(Math.min(numArr[i17].intValue() + 1, numArr2[i18].intValue() + 1), numArr[i18].intValue() + (str.charAt(i18) == str2.charAt(i16 + (-1)) ? 0 : 1)));
            }
            i16++;
            Integer[] numArr3 = numArr2;
            numArr2 = numArr;
            numArr = numArr3;
        }
        return numArr[length].intValue();
    }

    /* JADX INFO: renamed from: m */
    public static final AddressFieldConfiguration m51586m(EnumC17971q enumC17971q) {
        int i13 = enumC17971q == null ? -1 : AbstractC17964n.f69774a[enumC17971q.ordinal()];
        if (i13 == -1) {
            return AddressFieldConfiguration.OPTIONAL;
        }
        if (i13 == 1) {
            return AddressFieldConfiguration.HIDDEN;
        }
        if (i13 == 2) {
            return AddressFieldConfiguration.OPTIONAL;
        }
        if (i13 == 3) {
            return AddressFieldConfiguration.REQUIRED;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: n */
    public static final C38919p m51587n(C17928b c17928b) {
        String str;
        AbstractC22676k.m65750j(c17928b, "<this>");
        C16760x0 c16760x0 = c17928b.f69684x;
        String str2 = c17928b.f69683w;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        String str4 = c16760x0 != null ? c16760x0.f64400y : null;
        String str5 = c16760x0 != null ? c16760x0.f64401z : null;
        String str6 = c16760x0 != null ? c16760x0.f64398w : null;
        String str7 = c16760x0 != null ? c16760x0.f64397F : null;
        String str8 = c16760x0 != null ? c16760x0.f64399x : null;
        if (str8 != null) {
            String upperCase = str8.toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            str = upperCase;
        } else {
            str = null;
        }
        return new C38919p(new C38793c(str6, str, str4, str5, c16760x0 != null ? c16760x0.f64396E : null, str7), str3, null, c17928b.f69685y, null);
    }

    /* JADX INFO: renamed from: o */
    public static final Map m51588o(C16760x0 c16760x0) {
        AbstractC22676k.m65750j(c16760x0, "<this>");
        C5705a c5705a = IdentifierSpec.Companion;
        c5705a.getClass();
        C23465k c23465k = new C23465k(IdentifierSpec.Line1, c16760x0.f64400y);
        c5705a.getClass();
        C23465k c23465k2 = new C23465k(IdentifierSpec.Line2, c16760x0.f64401z);
        c5705a.getClass();
        C23465k c23465k3 = new C23465k(IdentifierSpec.City, c16760x0.f64398w);
        c5705a.getClass();
        C23465k c23465k4 = new C23465k(IdentifierSpec.State, c16760x0.f64397F);
        c5705a.getClass();
        C23465k c23465k5 = new C23465k(IdentifierSpec.PostalCode, c16760x0.f64396E);
        c5705a.getClass();
        return AbstractC25247g0.m73990Y(c23465k, c23465k2, c23465k3, c23465k4, c23465k5, new C23465k(IdentifierSpec.Country, c16760x0.f64399x));
    }

    /* JADX INFO: renamed from: p */
    public static final Map m51589p(C17928b c17928b, C16671i1 c16671i1) {
        C16760x0 c16760x0;
        AbstractC22676k.m65750j(c17928b, "<this>");
        Boolean bool = c17928b.f69686z;
        C16760x0 c16760x1 = c17928b.f69684x;
        Map map = C25272z.f99163w;
        if (c16671i1 != null && c16671i1.m47234b()) {
            return map;
        }
        IdentifierSpec.Companion.getClass();
        LinkedHashMap linkedHashMapM73995d0 = AbstractC25247g0.m73995d0(AbstractC25247g0.m73990Y(new C23465k(IdentifierSpec.Name, c17928b.f69683w), new C23465k(IdentifierSpec.Line1, c16760x1 != null ? c16760x1.f64400y : null), new C23465k(IdentifierSpec.Line2, c16760x1 != null ? c16760x1.f64401z : null), new C23465k(IdentifierSpec.City, c16760x1 != null ? c16760x1.f64398w : null), new C23465k(IdentifierSpec.State, c16760x1 != null ? c16760x1.f64397F : null), new C23465k(IdentifierSpec.PostalCode, c16760x1 != null ? c16760x1.f64396E : null), new C23465k(IdentifierSpec.Country, c16760x1 != null ? c16760x1.f64399x : null), new C23465k(IdentifierSpec.Phone, c17928b.f69685y)), (c16671i1 == null || (c16760x0 = c16671i1.f64114w) == null) ? map : m51588o(c16760x0));
        Map mapM73989X = bool != null ? AbstractC25247g0.m73989X(new C23465k(IdentifierSpec.SameAsShipping, bool != null ? bool.toString() : null)) : null;
        if (mapM73989X != null) {
            map = mapM73989X;
        }
        return AbstractC25247g0.m73995d0(linkedHashMapM73995d0, map);
    }
}
