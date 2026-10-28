package b30;

import a20.C0162b;
import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.focus.AbstractC1126a;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import as1.C1946g;
import b01.C2185f;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.whoop.android.R;
import d40.AbstractC11673r;
import d40.EnumC11663h;
import ec3.InterfaceC13037f2;
import h20.AbstractC16736t0;
import h20.C16687l;
import h20.C16706o0;
import h20.C16712p0;
import h20.C16718q0;
import h20.C16724r0;
import h20.C16735t;
import java.util.List;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import o73.C27648a;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p000.C21061j;
import p000.C27314o;
import p003a1.C0111j;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p040c0.AbstractC3788w0;
import p077d0.AbstractC11348f;
import p077d0.C11347e2;
import p088dc.AbstractC11895b;
import p095dp.AbstractC12240d;
import p164g2.C15247s;
import p164g2.InterfaceC15237i;
import p209i3.AbstractC18032n;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22989q;
import p292l1.C23213z2;
import p329n0.AbstractC26071x;
import p329n0.C26068u;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p479s4.AbstractC32128i;
import p547v8.AbstractC35785b;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p696zy.C41212d;
import p696zy.InterfaceC41211c;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.AbstractC29840y;
import q20.C29838w;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r20.C30875m;
import r20.InterfaceC30876n;
import te0.AbstractC33745d;
import wb3.AbstractC37056f;
import x30.C37884e0;
import x30.C37887f0;
import y00.C38915o4;
import y00.C38931q2;
import y00.C38940r2;
import y00.C39013z3;
import y00.EnumC38828f4;
import y00.EnumC38853i;
import y00.InterfaceC38949s2;

/* JADX INFO: renamed from: b30.o5 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2592o5 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f10077a = 0;

    static {
        C41212d c41212dM100055i = AbstractC32128i.m100055i("4242");
        EnumC38828f4 enumC38828f4 = EnumC38828f4.f167090I;
        AbstractC37056f.m118959K(C16706o0.f64233a, C16718q0.f64256a, C16712p0.f64243a, new C16724r0(C16735t.m47262c(c41212dM100055i, new C38915o4("001", null, false, "card", enumC38828f4, null, null, new C39013z3("4242", EnumC38853i.Visa), null, null, null, null, null, null, null, null, null, 1048416), false, 4)), new C16724r0(C16735t.m47262c(AbstractC32128i.m100055i("4242"), new C38915o4("002", null, false, "sepa_debit", EnumC38828f4.f167093L, null, null, null, null, null, null, null, null, null, null, null, null, 1048544), false, 12)), new C16724r0(C16735t.m47262c(AbstractC32128i.m100055i("5555"), new C38915o4("003", null, false, "card", enumC38828f4, null, null, new C39013z3("4242", EnumC38853i.MasterCard), null, null, null, null, null, null, null, null, null, 1048416), false, 12)));
    }

    /* JADX INFO: renamed from: a */
    public static final void m7503a(float f13, boolean z4, InterfaceC4339a interfaceC4339a, Modifier modifier, Composer composer, int i13) {
        float f14;
        int i14;
        InterfaceC4339a interfaceC4339a2;
        Modifier modifier2;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1031416232);
        if ((i13 & 6) == 0) {
            f14 = f13;
            i14 = (c28655q2.m87147d(f14) ? 4 : 2) | i13;
        } else {
            f14 = f13;
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            interfaceC4339a2 = interfaceC4339a;
            i14 |= c28655q2.m87157i(interfaceC4339a2) ? 256 : 128;
        } else {
            interfaceC4339a2 = interfaceC4339a;
        }
        if ((i13 & 3072) == 0) {
            modifier2 = modifier;
            i14 |= c28655q2.m87153g(modifier2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            modifier2 = modifier;
        }
        if ((i14 & 1171) == 1170 && c28655q2.m87121F()) {
            c28655q2.m87138X();
            c28655q = c28655q2;
        } else {
            c28655q = c28655q2;
            AbstractC2480a5.m7452d(modifier2, f14, false, false, false, z4, false, AbstractC11673r.m31087p(AbstractC11673r.m31082k(c28655q2).f37668a) ? R.drawable.stripe_ic_paymentsheet_add_dark : R.drawable.stripe_ic_paymentsheet_add_light, null, false, AbstractC30060g.m92103Y(c28655q2, R.string.stripe_paymentsheet_add_payment_method_button_label), AbstractC30060g.m92103Y(c28655q2, R.string.stripe_add_new_payment_method), null, null, interfaceC4339a2, c28655q, ((i14 >> 9) & 14) | 28032 | ((i14 << 3) & 112) | ((i14 << 12) & 458752), (i14 << 9) & 458752, 26432);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2536h5(f13, z4, interfaceC4339a, modifier, i13);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m7504b(InterfaceC13037f2 cvcControllerFlow, boolean z4, int i13, int i14, Composer composer, int i15) {
        int i16;
        int i17;
        AbstractC22676k.m65750j(cvcControllerFlow, "cvcControllerFlow");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(685072799);
        int i18 = i15 | (c28655q.m87157i(cvcControllerFlow) ? 4 : 2) | (c28655q.m87155h(z4) ? 32 : 16) | 3456;
        if ((i18 & 1171) == 1170 && c28655q.m87121F()) {
            c28655q.m87138X();
            i16 = i13;
            i17 = i14;
        } else {
            InterfaceC28601c1 interfaceC28601c1M83597t = C27648a.m83597t(cvcControllerFlow, c28655q, i18 & 14);
            InterfaceC28601c1 interfaceC28601c1M83597t2 = C27648a.m83597t(((C37884e0) interfaceC28601c1M83597t.getValue()).f162222o, c28655q, 0);
            C37887f0 c37887f0 = new C37887f0(new IdentifierSpec(), (C37884e0) interfaceC28601c1M83597t.getValue());
            c28655q.m87150e0(-1879183954);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC33745d.m106649h(c28655q);
            }
            C15247s c15247s = (C15247s) objM87133R;
            Object objM94759h = AbstractC30802r.m94759h(-1879182381, c28655q, false);
            if (objM94759h == c28676v0) {
                objM94759h = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM94759h);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM94759h;
            c28655q.m87173q(false);
            InterfaceC15237i interfaceC15237i = (InterfaceC15237i) c28655q.m87161k(AbstractC2453v1.f9570i);
            Boolean boolValueOf = Boolean.valueOf(z4);
            c28655q.m87150e0(-1879178534);
            boolean zM87157i = ((i18 & 112) == 32) | c28655q.m87157i(interfaceC15237i);
            Object objM87133R2 = c28655q.m87133R();
            InterfaceC30057d interfaceC30057d = null;
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new C2544i5(z4, interfaceC15237i, interfaceC30057d, 0);
                c28655q.m87172p0(objM87133R2);
            }
            c28655q.m87173q(false);
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, boolValueOf);
            c28655q.m87150e0(-1879173130);
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C0162b(interfaceC28601c1, interfaceC30057d, 11);
                c28655q.m87172p0(objM87133R3);
            }
            c28655q.m87173q(false);
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, C23454a0.f92919a);
            boolean zBooleanValue = ((Boolean) interfaceC28601c1.getValue()).booleanValue();
            C11347e2 c11347e2M30574v = AbstractC11348f.m30574v(500, 400, null, 4);
            c28655q.m87150e0(-1879166901);
            Object objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = new C2185f(21);
                c28655q.m87172p0(objM87133R4);
            }
            c28655q.m87173q(false);
            AbstractC1090b.m3351f(zBooleanValue, null, AbstractC3788w0.m11576d(c11347e2M30574v, (Function1) objM87133R4, 6), null, null, AbstractC37817c.m121344e(-1074270777, c28655q, new C2560k5(c37887f0, z4, c15247s, interfaceC28601c1M83597t2)), c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21, 26);
            i16 = 500;
            i17 = 400;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2520f5(cvcControllerFlow, z4, i16, i17, i15);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m7505c(float f13, boolean z4, boolean z13, Function1 function1, Modifier modifier, Composer composer, int i13) {
        float f14;
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(253339709);
        if ((i13 & 6) == 0) {
            f14 = f13;
            i14 = (c28655q2.m87147d(f14) ? 4 : 2) | i13;
        } else {
            f14 = f13;
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87155h(z13) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q2.m87157i(function1) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q2.m87153g(modifier) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((i14 & 9363) == 9362 && c28655q2.m87121F()) {
            c28655q2.m87138X();
            c28655q = c28655q2;
        } else {
            String strM92103Y = AbstractC30060g.m92103Y(c28655q2, R.string.stripe_google_pay);
            String strM92103Y2 = AbstractC30060g.m92103Y(c28655q2, R.string.stripe_google_pay);
            c28655q2.m87150e0(920688428);
            boolean z14 = (i14 & 7168) == 2048;
            Object objM87133R = c28655q2.m87133R();
            if (z14 || objM87133R == C28635l.f115821a) {
                objM87133R = new C27314o(function1, 13);
                c28655q2.m87172p0(objM87133R);
            }
            c28655q2.m87173q(false);
            c28655q = c28655q2;
            AbstractC2480a5.m7452d(modifier, f14, z13, false, false, z4, false, R.drawable.stripe_google_pay_mark, null, false, strM92103Y, strM92103Y2, null, null, (InterfaceC4339a) objM87133R, c28655q, ((i14 >> 12) & 14) | 27648 | ((i14 << 3) & 112) | (i14 & 896) | ((i14 << 12) & 458752), 0, 26432);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2488b5(f13, z4, z13, function1, modifier, i13, 0);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m7506d(float f13, boolean z4, boolean z13, Function1 function1, Modifier modifier, Composer composer, int i13) {
        float f14;
        int i14;
        Modifier modifier2;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-329329418);
        if ((i13 & 6) == 0) {
            f14 = f13;
            i14 = (c28655q2.m87147d(f14) ? 4 : 2) | i13;
        } else {
            f14 = f13;
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87155h(z13) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q2.m87157i(function1) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            modifier2 = modifier;
            i14 |= c28655q2.m87153g(modifier2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        } else {
            modifier2 = modifier;
        }
        if ((i14 & 9363) == 9362 && c28655q2.m87121F()) {
            c28655q2.m87138X();
            c28655q = c28655q2;
        } else {
            int iM34045K = AbstractC12240d.m34045K(2, Boolean.valueOf(!AbstractC11673r.m31087p(AbstractC11673r.m31082k(c28655q2).f37668a)));
            String strM92103Y = AbstractC30060g.m92103Y(c28655q2, R.string.stripe_link);
            String strM92103Y2 = AbstractC30060g.m92103Y(c28655q2, R.string.stripe_link);
            c28655q2.m87150e0(-192106546);
            boolean z14 = (i14 & 7168) == 2048;
            Object objM87133R = c28655q2.m87133R();
            if (z14 || objM87133R == C28635l.f115821a) {
                objM87133R = new C27314o(function1, 12);
                c28655q2.m87172p0(objM87133R);
            }
            c28655q2.m87173q(false);
            c28655q = c28655q2;
            AbstractC2480a5.m7452d(modifier2, f14, z13, false, false, z4, false, iM34045K, null, false, strM92103Y, strM92103Y2, null, null, (InterfaceC4339a) objM87133R, c28655q, ((i14 >> 12) & 14) | 100690944 | ((i14 << 3) & 112) | (i14 & 896) | ((i14 << 12) & 458752), 0, 26176);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2488b5(f13, z4, z13, function1, modifier, i13, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:171:0x02a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:172:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:175:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:177:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:179:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:185:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:188:0x02e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:189:0x02e3  */
    /* JADX INFO: renamed from: e */
    public static final void m7507e(final C16724r0 c16724r0, final float f13, final boolean z4, final boolean z13, final boolean z14, final Function1 function1, final Function1 function2, final Modifier modifier, Composer composer, final int i13) {
        int i14;
        Modifier modifier2;
        int i15;
        Integer numValueOf;
        Integer num;
        final C16724r0 c16724r1;
        boolean z15;
        boolean z16;
        Object objM87133R;
        boolean z17;
        boolean z18;
        boolean z19;
        Object objM87133R2;
        C38915o4 c38915o4 = c16724r0.f64267c;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1177975555);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(c16724r0) : c28655q.m87157i(c16724r0) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87147d(f13) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87155h(z4) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87155h(z13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87155h(z14) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q.m87157i(function1) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i14 |= c28655q.m87157i(function2) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            modifier2 = modifier;
            i14 |= c28655q.m87153g(modifier2) ? 8388608 : 4194304;
        } else {
            modifier2 = modifier;
        }
        if ((i14 & 4793491) == 4793490 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            C16687l c16687l = c16724r0.f64265a;
            AbstractC22676k.m65750j(c38915o4, "<this>");
            InterfaceC38949s2 interfaceC38949s2 = c38915o4.f167524R;
            c28655q.m87150e0(1602795198);
            int iOrdinal = ((EnumC11663h) c28655q.m87161k(AbstractC11673r.f37715g)).ordinal();
            if (iOrdinal == 0) {
                i15 = R.drawable.stripe_ic_paymentsheet_bank;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                i15 = R.drawable.stripe_ic_paymentsheet_pm_bank_outlined;
            }
            EnumC38828f4 enumC38828f4 = c38915o4.f167511E;
            int i16 = enumC38828f4 == null ? -1 : AbstractC2589o2.f10074a[enumC38828f4.ordinal()];
            if (i16 != 1) {
                if (i16 != 3) {
                    if (i16 == 4) {
                        if (interfaceC38949s2 instanceof C38931q2) {
                            numValueOf = Integer.valueOf(i15);
                        } else if (!(interfaceC38949s2 instanceof C38940r2) && interfaceC38949s2 != null) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    num = null;
                } else {
                    numValueOf = Integer.valueOf(i15);
                }
                num = numValueOf;
            } else if (interfaceC38949s2 instanceof C38931q2) {
                numValueOf = Integer.valueOf(i15);
                num = numValueOf;
            } else {
                if (!(interfaceC38949s2 instanceof C38940r2) && interfaceC38949s2 != null) {
                    throw new NoWhenBranchMatchedException();
                }
                num = null;
            }
            c28655q.m87173q(false);
            InterfaceC41211c interfaceC41211cM34043I = AbstractC12240d.m34043I(c38915o4, false);
            c28655q.m87150e0(358909254);
            String strM113396S = interfaceC41211cM34043I != null ? AbstractC35785b.m113396S(interfaceC41211cM34043I, c28655q) : null;
            c28655q.m87173q(false);
            if (strM113396S == null) {
                C28677v1 c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final int i17 = 0;
                    final Modifier modifier3 = modifier2;
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: b30.c5
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i17) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    AbstractC2592o5.m7507e(c16724r0, f13, z4, z13, z14, function1, function2, modifier3, (Composer) obj, AbstractC28683x.m87244L(i13 | 1));
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    AbstractC2592o5.m7507e(c16724r0, f13, z4, z13, z14, function1, function2, modifier3, (Composer) obj, AbstractC28683x.m87244L(i13 | 1));
                                    break;
                            }
                            return C23454a0.f92919a;
                        }
                    };
                    return;
                }
                return;
            }
            c28655q.m87150e0(358911636);
            boolean zM87153g = ((i14 & 896) == 256) | ((57344 & i14) == 16384) | c28655q.m87153g(strM113396S);
            Object objM87133R3 = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R3 == c28676v0) {
                objM87133R3 = new C1946g(strM113396S, z14, z4);
                c28655q.m87172p0(objM87133R3);
            }
            c28655q.m87173q(false);
            Modifier modifierM51775c = AbstractC18032n.m51775c(C2314t.f9131w, false, (Function1) objM87133R3);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM51775c);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            int i18 = i14;
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            boolean z24 = z4 && z13;
            boolean z25 = c16687l.f64181e && z13;
            boolean z26 = !z13;
            int iM34047M = AbstractC12240d.m34047M(c38915o4, Boolean.valueOf(!AbstractC11673r.m31087p(AbstractC11673r.m31082k(c28655q).f37668a)), 3);
            AbstractC22676k.m65750j(c38915o4, "<this>");
            boolean z27 = (c38915o4.f167511E == EnumC38828f4.f167089H || c38915o4.f167525S) ? false : true;
            String strM65707O = AbstractC22674j.m65707O(AbstractC35785b.m113396S(c16687l.m47245c(), c28655q));
            String strM65707O2 = AbstractC22674j.m65707O(AbstractC35785b.m113396S(AbstractC32128i.m100064s(R.string.stripe_paymentsheet_modify_pm, new Object[]{c16687l.m47245c()}, C25271y.f99162w), c28655q));
            c28655q.m87150e0(1346354105);
            boolean z28 = (i18 & 3670016) == 1048576;
            int i19 = i18 & 14;
            if (i19 != 4) {
                if ((i18 & 8) != 0) {
                    c16724r1 = c16724r0;
                    if (c28655q.m87157i(c16724r1)) {
                    }
                    z16 = z28 | z15;
                    boolean z29 = z27;
                    objM87133R = c28655q.m87133R();
                    if (z16 || objM87133R == c28676v0) {
                        final int i24 = 0;
                        objM87133R = new InterfaceC4339a() { // from class: b30.d5
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i24) {
                                    case 0:
                                        function2.invoke(c16724r1.f64265a);
                                        break;
                                    default:
                                        function2.invoke(new C29838w(c16724r1.f64267c, null, null));
                                        break;
                                }
                                return C23454a0.f92919a;
                            }
                        };
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
                    c28655q.m87173q(false);
                    c28655q.m87150e0(1346364526);
                    if ((i18 & 458752) == 131072) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (i19 != 4 || ((i18 & 8) != 0 && c28655q.m87157i(c16724r1))) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = z17 | z18;
                    objM87133R2 = c28655q.m87133R();
                    if (z19 || objM87133R2 == c28676v0) {
                        final int i25 = 1;
                        objM87133R2 = new InterfaceC4339a() { // from class: b30.d5
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i25) {
                                    case 0:
                                        function1.invoke(c16724r1.f64265a);
                                        break;
                                    default:
                                        function1.invoke(new C29838w(c16724r1.f64267c, null, null));
                                        break;
                                }
                                return C23454a0.f92919a;
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    }
                    c28655q.m87173q(false);
                    AbstractC2480a5.m7452d(modifier, f13, z14, z24, z25, z4, z26, iM34047M, num, z29, strM113396S, strM65707O, interfaceC4339a, strM65707O2, (InterfaceC4339a) objM87133R2, c28655q, ((i18 >> 21) & 14) | (i18 & 112) | ((i18 >> 6) & 896) | ((i18 << 9) & 458752), 0, 256);
                    c28655q.m87173q(true);
                } else {
                    c16724r1 = c16724r0;
                }
                z15 = false;
                z16 = z28 | z15;
                boolean z210 = z27;
                objM87133R = c28655q.m87133R();
                if (z16) {
                    final int i26 = 0;
                    objM87133R = new InterfaceC4339a() { // from class: b30.d5
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i26) {
                                case 0:
                                    function2.invoke(c16724r1.f64265a);
                                    break;
                                default:
                                    function2.invoke(new C29838w(c16724r1.f64267c, null, null));
                                    break;
                            }
                            return C23454a0.f92919a;
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                } else {
                    final int i27 = 0;
                    objM87133R = new InterfaceC4339a() { // from class: b30.d5
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i27) {
                                case 0:
                                    function2.invoke(c16724r1.f64265a);
                                    break;
                                default:
                                    function2.invoke(new C29838w(c16724r1.f64267c, null, null));
                                    break;
                            }
                            return C23454a0.f92919a;
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                c28655q.m87173q(false);
                c28655q.m87150e0(1346364526);
                if ((i18 & 458752) == 131072) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (i19 != 4) {
                    z18 = true;
                } else {
                    z18 = true;
                }
                z19 = z17 | z18;
                objM87133R2 = c28655q.m87133R();
                if (z19) {
                    final int i28 = 1;
                    objM87133R2 = new InterfaceC4339a() { // from class: b30.d5
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i28) {
                                case 0:
                                    function1.invoke(c16724r1.f64265a);
                                    break;
                                default:
                                    function1.invoke(new C29838w(c16724r1.f64267c, null, null));
                                    break;
                            }
                            return C23454a0.f92919a;
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                } else {
                    final int i29 = 1;
                    objM87133R2 = new InterfaceC4339a() { // from class: b30.d5
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i29) {
                                case 0:
                                    function1.invoke(c16724r1.f64265a);
                                    break;
                                default:
                                    function1.invoke(new C29838w(c16724r1.f64267c, null, null));
                                    break;
                            }
                            return C23454a0.f92919a;
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                }
                c28655q.m87173q(false);
                AbstractC2480a5.m7452d(modifier, f13, z14, z24, z25, z4, z26, iM34047M, num, z210, strM113396S, strM65707O, interfaceC4339a2, strM65707O2, (InterfaceC4339a) objM87133R2, c28655q, ((i18 >> 21) & 14) | (i18 & 112) | ((i18 >> 6) & 896) | ((i18 << 9) & 458752), 0, 256);
                c28655q.m87173q(true);
            } else {
                c16724r1 = c16724r0;
            }
            z15 = true;
            z16 = z28 | z15;
            boolean z211 = z27;
            objM87133R = c28655q.m87133R();
            if (z16) {
                final int i210 = 0;
                objM87133R = new InterfaceC4339a() { // from class: b30.d5
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i210) {
                            case 0:
                                function2.invoke(c16724r1.f64265a);
                                break;
                            default:
                                function2.invoke(new C29838w(c16724r1.f64267c, null, null));
                                break;
                        }
                        return C23454a0.f92919a;
                    }
                };
                c28655q.m87172p0(objM87133R);
            } else {
                final int i211 = 0;
                objM87133R = new InterfaceC4339a() { // from class: b30.d5
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i211) {
                            case 0:
                                function2.invoke(c16724r1.f64265a);
                                break;
                            default:
                                function2.invoke(new C29838w(c16724r1.f64267c, null, null));
                                break;
                        }
                        return C23454a0.f92919a;
                    }
                };
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R;
            c28655q.m87173q(false);
            c28655q.m87150e0(1346364526);
            if ((i18 & 458752) == 131072) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (i19 != 4) {
                z18 = true;
            } else {
                z18 = true;
            }
            z19 = z17 | z18;
            objM87133R2 = c28655q.m87133R();
            if (z19) {
                final int i212 = 1;
                objM87133R2 = new InterfaceC4339a() { // from class: b30.d5
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i212) {
                            case 0:
                                function1.invoke(c16724r1.f64265a);
                                break;
                            default:
                                function1.invoke(new C29838w(c16724r1.f64267c, null, null));
                                break;
                        }
                        return C23454a0.f92919a;
                    }
                };
                c28655q.m87172p0(objM87133R2);
            } else {
                final int i213 = 1;
                objM87133R2 = new InterfaceC4339a() { // from class: b30.d5
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i213) {
                            case 0:
                                function1.invoke(c16724r1.f64265a);
                                break;
                            default:
                                function1.invoke(new C29838w(c16724r1.f64267c, null, null));
                                break;
                        }
                        return C23454a0.f92919a;
                    }
                };
                c28655q.m87172p0(objM87133R2);
            }
            c28655q.m87173q(false);
            AbstractC2480a5.m7452d(modifier, f13, z14, z24, z25, z4, z26, iM34047M, num, z211, strM113396S, strM65707O, interfaceC4339a3, strM65707O2, (InterfaceC4339a) objM87133R2, c28655q, ((i18 >> 21) & 14) | (i18 & 112) | ((i18 >> 6) & 896) | ((i18 << 9) & 458752), 0, 256);
            c28655q.m87173q(true);
        }
        C28677v1 c28677v1M87180u2 = c28655q.m87180u();
        if (c28677v1M87180u2 != null) {
            final int i34 = 1;
            c28677v1M87180u2.f115982d = new InterfaceC4351m() { // from class: b30.c5
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    switch (i34) {
                        case 0:
                            ((Integer) obj2).getClass();
                            AbstractC2592o5.m7507e(c16724r0, f13, z4, z13, z14, function1, function2, modifier, (Composer) obj, AbstractC28683x.m87244L(i13 | 1));
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            AbstractC2592o5.m7507e(c16724r0, f13, z4, z13, z14, function1, function2, modifier, (Composer) obj, AbstractC28683x.m87244L(i13 | 1));
                            break;
                    }
                    return C23454a0.f92919a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m7508f(final AbstractC16736t0 abstractC16736t0, final float f13, final boolean z4, final boolean z13, final boolean z14, final InterfaceC4339a interfaceC4339a, final Function1 function1, final Function1 function2, final Modifier modifier, Composer composer, final int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1347618524);
        int i14 = i13 | (c28655q.m87153g(abstractC16736t0) ? 4 : 2) | (c28655q.m87147d(f13) ? 32 : 16) | (c28655q.m87155h(z4) ? 256 : 128) | (c28655q.m87155h(z13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) | (c28655q.m87155h(z14) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK) | (c28655q.m87157i(interfaceC4339a) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) | (c28655q.m87157i(function1) ? 1048576 : 524288) | (c28655q.m87157i(function2) ? 8388608 : 4194304) | (c28655q.m87153g(modifier) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE);
        if ((38347923 & i14) == 38347922 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else if (abstractC16736t0 instanceof C16706o0) {
            c28655q.m87150e0(-1762700620);
            m7503a(f13, z4, interfaceC4339a, modifier, c28655q, ((i14 >> 15) & 7168) | ((i14 >> 3) & 126) | ((i14 >> 9) & 896));
            c28655q = c28655q;
            c28655q.m87173q(false);
        } else if (abstractC16736t0 instanceof C16712p0) {
            c28655q.m87150e0(-1762448435);
            m7505c(f13, z4, z14, function1, modifier, c28655q, ((i14 >> 12) & 57344) | ((i14 >> 3) & 126) | ((i14 >> 6) & 896) | ((i14 >> 9) & 7168));
            c28655q.m87173q(false);
        } else if (abstractC16736t0 instanceof C16718q0) {
            c28655q.m87150e0(-1762163886);
            m7506d(f13, z4, z14, function1, modifier, c28655q, ((i14 >> 3) & 126) | ((i14 >> 6) & 896) | ((i14 >> 9) & 7168) | ((i14 >> 12) & 57344));
            c28655q.m87173q(false);
        } else {
            if (!(abstractC16736t0 instanceof C16724r0)) {
                throw AbstractC11895b.m32003v(358779993, c28655q, false);
            }
            c28655q.m87150e0(-1761866038);
            int i15 = (57344 & i14) | (i14 & 112) | 8 | (i14 & 896) | (i14 & 7168);
            int i16 = i14 >> 3;
            m7507e((C16724r0) abstractC16736t0, f13, z4, z13, z14, function1, function2, modifier, c28655q, (i16 & 29360128) | i15 | (458752 & i16) | (3670016 & i16));
            c28655q = c28655q;
            c28655q.m87173q(false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m(f13, z4, z13, z14, interfaceC4339a, function1, function2, modifier, i13) { // from class: b30.g5

                /* JADX INFO: renamed from: E */
                public final /* synthetic */ boolean f9823E;

                /* JADX INFO: renamed from: F */
                public final /* synthetic */ InterfaceC4339a f9824F;

                /* JADX INFO: renamed from: G */
                public final /* synthetic */ Function1 f9825G;

                /* JADX INFO: renamed from: H */
                public final /* synthetic */ Function1 f9826H;

                /* JADX INFO: renamed from: I */
                public final /* synthetic */ Modifier f9827I;

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ float f9829x;

                /* JADX INFO: renamed from: y */
                public final /* synthetic */ boolean f9830y;

                /* JADX INFO: renamed from: z */
                public final /* synthetic */ boolean f9831z;

                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM87244L = AbstractC28683x.m87244L(1);
                    AbstractC2592o5.m7508f(this.f9828w, this.f9829x, this.f9830y, this.f9831z, this.f9823E, this.f9824F, this.f9825G, this.f9826H, this.f9827I, (Composer) obj, iM87244L);
                    return C23454a0.f92919a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m7509g(final C2603q0 c2603q0, InterfaceC30876n cvcRecollectionState, Modifier modifier, Composer composer, int i13) {
        int i14;
        C38915o4 c38915o4;
        AbstractC22676k.m65750j(cvcRecollectionState, "cvcRecollectionState");
        AbstractC22676k.m65750j(modifier, "modifier");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1088084493);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(c2603q0) : c28655q.m87157i(c2603q0) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(cvcRecollectionState) : c28655q.m87157i(cvcRecollectionState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(modifier) ? 256 : 128;
        }
        if ((i14 & 147) == 146 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            InterfaceC28601c1 interfaceC28601c1M83597t = C27648a.m83597t(c2603q0.f10144q, c28655q, 0);
            List list = ((C2600p5) interfaceC28601c1M83597t.getValue()).f10119a;
            AbstractC16736t0 abstractC16736t0 = ((C2600p5) interfaceC28601c1M83597t.getValue()).f10120b;
            boolean z4 = ((C2600p5) interfaceC28601c1M83597t.getValue()).f10121c;
            boolean z13 = ((C2600p5) interfaceC28601c1M83597t.getValue()).f10122d;
            c28655q.m87150e0(-1057317301);
            int i15 = i14 & 14;
            boolean z14 = i15 == 4 || ((i14 & 8) != 0 && c28655q.m87157i(c2603q0));
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z14 || objM87133R == c28676v0) {
                objM87133R = new C0111j(c2603q0, 8);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            c28655q.m87173q(false);
            c28655q.m87150e0(-1057311782);
            boolean z15 = i15 == 4 || ((i14 & 8) != 0 && c28655q.m87157i(c2603q0));
            Object objM87133R2 = c28655q.m87133R();
            if (z15 || objM87133R2 == c28676v0) {
                final int i16 = 0;
                objM87133R2 = new Function1() { // from class: b30.e5
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i16) {
                            case 0:
                                c2603q0.m7515b(new C2622s5((AbstractC29840y) obj));
                                break;
                            default:
                                C16687l it = (C16687l) obj;
                                AbstractC22676k.m65750j(it, "it");
                                c2603q0.m7515b(new C2615r5(it));
                                break;
                        }
                        return C23454a0.f92919a;
                    }
                };
                c28655q.m87172p0(objM87133R2);
            }
            Function1 function1 = (Function1) objM87133R2;
            c28655q.m87173q(false);
            c28655q.m87150e0(-1057304910);
            boolean z16 = i15 == 4 || ((i14 & 8) != 0 && c28655q.m87157i(c2603q0));
            Object objM87133R3 = c28655q.m87133R();
            if (z16 || objM87133R3 == c28676v0) {
                final int i17 = 1;
                objM87133R3 = new Function1() { // from class: b30.e5
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i17) {
                            case 0:
                                c2603q0.m7515b(new C2622s5((AbstractC29840y) obj));
                                break;
                            default:
                                C16687l it = (C16687l) obj;
                                AbstractC22676k.m65750j(it, "it");
                                c2603q0.m7515b(new C2615r5(it));
                                break;
                        }
                        return C23454a0.f92919a;
                    }
                };
                c28655q.m87172p0(objM87133R3);
            }
            c28655q.m87173q(false);
            m7510h(list, abstractC16736t0, z4, z13, interfaceC4339a, function1, (Function1) objM87133R3, modifier, null, c28655q, (i14 << 15) & 29360128);
            if (cvcRecollectionState instanceof C30875m) {
                AbstractC16736t0 abstractC16736t1 = ((C2600p5) interfaceC28601c1M83597t.getValue()).f10120b;
                EnumC38828f4 enumC38828f4 = null;
                C16724r0 c16724r0 = abstractC16736t1 instanceof C16724r0 ? (C16724r0) abstractC16736t1 : null;
                if (c16724r0 != null && (c38915o4 = c16724r0.f64267c) != null) {
                    enumC38828f4 = c38915o4.f167511E;
                }
                if (enumC38828f4 == EnumC38828f4.f167090I) {
                    m7504b(((C30875m) cvcRecollectionState).f127309a, ((C2600p5) interfaceC28601c1M83597t.getValue()).f10122d, 0, 0, c28655q, 0);
                }
            }
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21061j(c2603q0, cvcRecollectionState, modifier, i13, 6);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m7510h(List list, AbstractC16736t0 abstractC16736t0, boolean z4, boolean z13, InterfaceC4339a onAddCardPressed, Function1 onItemSelected, Function1 onModifyItem, Modifier modifier, C26068u c26068u, Composer composer, int i13) {
        int i14;
        AbstractC16736t0 abstractC16736t1;
        boolean z14;
        C26068u c26068uM77569a;
        int i15;
        C28655q c28655q;
        AbstractC22676k.m65750j(onAddCardPressed, "onAddCardPressed");
        AbstractC22676k.m65750j(onItemSelected, "onItemSelected");
        AbstractC22676k.m65750j(onModifyItem, "onModifyItem");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-405095871);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87157i(list) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            abstractC16736t1 = abstractC16736t0;
            i14 |= c28655q2.m87153g(abstractC16736t1) ? 32 : 16;
        } else {
            abstractC16736t1 = abstractC16736t0;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87155h(z4) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            z14 = z13;
            i14 |= c28655q2.m87155h(z14) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            z14 = z13;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q2.m87157i(onAddCardPressed) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q2.m87157i(onItemSelected) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i14 |= c28655q2.m87157i(onModifyItem) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i14 |= c28655q2.m87153g(modifier) ? 8388608 : 4194304;
        }
        if ((100663296 & i13) == 0) {
            i14 |= AndroidSDKConstants.FLAG_MUTABLE;
        }
        if ((38347923 & i14) == 38347922 && c28655q2.m87121F()) {
            c28655q2.m87138X();
            c26068uM77569a = c26068u;
            c28655q = c28655q2;
        } else {
            c28655q2.m87140Z();
            if ((i13 & 1) == 0 || c28655q2.m87118C()) {
                c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q2, 3);
                i15 = i14 & (-234881025);
            } else {
                c28655q2.m87138X();
                i15 = i14 & (-234881025);
                c26068uM77569a = c26068u;
            }
            c28655q2.m87175r();
            c28655q2.m87150e0(-1057270344);
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC33745d.m106649h(c28655q2);
            }
            C15247s c15247s = (C15247s) objM87133R;
            c28655q2.m87173q(false);
            Boolean boolValueOf = Boolean.valueOf(z4);
            c28655q2.m87150e0(-1057268369);
            boolean z15 = (i15 & 896) == 256;
            Object objM87133R2 = c28655q2.m87133R();
            if (z15 || objM87133R2 == c28676v0) {
                objM87133R2 = new C2544i5(z4, c15247s, (InterfaceC30057d) null, 1);
                c28655q2.m87172p0(objM87133R2);
            }
            c28655q2.m87173q(false);
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R2, boolValueOf);
            c28655q = c28655q2;
            AbstractC22953f.m66714a(AbstractC1126a.m3483b(AbstractC1136a.m3599a(AbstractC1102d.m3409f(1.0f, modifier), "PaymentSheetSavedPaymentOptionTabLayout"), c15247s), null, false, AbstractC37817c.m121344e(1633620523, c28655q2, new C23213z2(z14, c26068uM77569a, list, z4, abstractC16736t1, onAddCardPressed, onItemSelected, onModifyItem)), c28655q, 3072, 6);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2580n1(list, abstractC16736t0, z4, z13, onAddCardPressed, onItemSelected, onModifyItem, modifier, c26068uM77569a, i13);
        }
    }
}
