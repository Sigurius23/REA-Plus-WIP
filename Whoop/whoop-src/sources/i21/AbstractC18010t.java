package i21;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import e93.AbstractC12889b;
import gy0.AbstractC16277f;
import hu1.C17650g;
import hy0.AbstractC17755i2;
import hy0.EnumC17744g;
import ih0.AbstractC18489d0;
import kd1.C22411w;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p178gz.C16283a;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22961h;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import t71.InterfaceC33570g;
import wb3.AbstractC37056f;
import x81.C38072d;
import y11.AbstractC39061n;
import y11.C39065r;

/* JADX INFO: renamed from: i21.t */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aq\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcom/whoop/design/util/TextResource;", "title", "Li2/x;", "titleColor", "subTitle", "subTitleColor", "primaryButtonText", "Ly11/r;", "horizontalImpactBarViewState", "Lt71/g$b;", "impactCardType", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "f", "(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;JLcom/whoop/design/util/TextResource;JLcom/whoop/design/util/TextResource;Ly11/r;Lt71/g$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18010t {
    /* JADX INFO: renamed from: f */
    public static final void m51710f(Modifier modifier, TextResource textResource, long j7, TextResource textResource2, long j13, TextResource textResource3, C39065r horizontalImpactBarViewState, InterfaceC33570g.b impactCardType, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        TextResource textResourceM21267a;
        long jM125430y;
        TextResource textResourceM21267a2;
        long jM125382b1;
        TextResource textResourceM21267a3;
        int i16;
        C28655q c28655q;
        Modifier modifier2;
        Function1 function2;
        TextResource textResource4;
        long j14;
        long j15;
        Function1 function3;
        TextResource textResource5;
        long j16;
        Modifier modifier3;
        int i17;
        TextResource textResource6;
        int i18;
        int i19;
        AbstractC22676k.m65750j(horizontalImpactBarViewState, "horizontalImpactBarViewState");
        AbstractC22676k.m65750j(impactCardType, "impactCardType");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(570911505);
        int i24 = i14 & 1;
        if (i24 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            if ((i14 & 2) == 0) {
                textResourceM21267a = textResource;
                int i25 = c28655q2.m87153g(textResourceM21267a) ? 32 : 16;
                i15 |= i25;
            } else {
                textResourceM21267a = textResource;
            }
            i15 |= i25;
        } else {
            textResourceM21267a = textResource;
        }
        if ((i13 & 384) == 0) {
            jM125430y = j7;
            i15 |= ((i14 & 4) == 0 && c28655q2.m87151f(jM125430y)) ? 256 : 128;
        } else {
            jM125430y = j7;
        }
        if ((i13 & 3072) == 0) {
            if ((i14 & 8) == 0) {
                textResourceM21267a2 = textResource2;
                if (c28655q2.m87153g(textResourceM21267a2)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i15 |= i19;
            } else {
                textResourceM21267a2 = textResource2;
            }
            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            i15 |= i19;
        } else {
            textResourceM21267a2 = textResource2;
        }
        if ((i13 & 24576) == 0) {
            jM125382b1 = j13;
            i15 |= ((i14 & 16) == 0 && c28655q2.m87151f(jM125382b1)) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        } else {
            jM125382b1 = j13;
        }
        if ((196608 & i13) == 0) {
            if ((i14 & 32) == 0) {
                textResourceM21267a3 = textResource3;
                if (c28655q2.m87153g(textResourceM21267a3)) {
                    i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                }
                i15 |= i18;
            } else {
                textResourceM21267a3 = textResource3;
            }
            i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            i15 |= i18;
        } else {
            textResourceM21267a3 = textResource3;
        }
        if ((1572864 & i13) == 0) {
            i15 |= c28655q2.m87153g(horizontalImpactBarViewState) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i15 |= c28655q2.m87153g(impactCardType) ? 8388608 : 4194304;
        }
        int i26 = i14 & 256;
        if (i26 != 0) {
            i15 |= 100663296;
            i16 = i24;
        } else {
            i16 = i24;
            if ((i13 & 100663296) == 0) {
                i15 |= c28655q2.m87157i(function1) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
            }
        }
        int i27 = i15;
        if (c28655q2.m87135U(i27 & 1, (i15 & 38347923) != 38347922)) {
            c28655q2.m87140Z();
            if ((i13 & 1) == 0 || c28655q2.m87118C()) {
                Modifier modifier4 = i16 != 0 ? C2314t.f9131w : modifier;
                if ((i14 & 2) != 0) {
                    textResourceM21267a = AbstractC8693b.m21267a();
                    i27 &= -113;
                }
                int i28 = i27;
                if ((i14 & 4) != 0) {
                    jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                    i28 &= -897;
                }
                if ((i14 & 8) != 0) {
                    textResourceM21267a2 = AbstractC8693b.m21267a();
                    i28 &= -7169;
                }
                if ((i14 & 16) != 0) {
                    jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                    i28 &= -57345;
                }
                if ((i14 & 32) != 0) {
                    textResourceM21267a3 = AbstractC8693b.m21267a();
                    i28 &= -458753;
                }
                if (i26 != 0) {
                    Object objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C17650g(20);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function3 = (Function1) objM87133R;
                } else {
                    function3 = function1;
                }
                textResource5 = textResourceM21267a3;
                j16 = jM125382b1;
                modifier3 = modifier4;
                i17 = i28;
                textResource6 = textResourceM21267a;
            } else {
                c28655q2.m87138X();
                int i29 = (i14 & 2) != 0 ? i27 & (-113) : i27;
                if ((i14 & 4) != 0) {
                    i29 &= -897;
                }
                if ((i14 & 8) != 0) {
                    i29 &= -7169;
                }
                if ((i14 & 16) != 0) {
                    i29 &= -57345;
                }
                if ((i14 & 32) != 0) {
                    i29 &= -458753;
                }
                function3 = function1;
                textResource6 = textResourceM21267a;
                textResource5 = textResourceM21267a3;
                j16 = jM125382b1;
                modifier3 = modifier;
                i17 = i29;
            }
            long j17 = jM125430y;
            TextResource textResource7 = textResourceM21267a2;
            long j18 = j16;
            c28655q2.m87175r();
            TextResource textResource8 = textResource6;
            j14 = j17;
            Modifier modifier5 = modifier3;
            AbstractC12889b.m36263b(modifier5, C22411w.f87680a.m64535a().m64090c(), C38072d.f163053a.m121949b(c28655q2, 6).getWhite5(), null, 0, AbstractC37817c.m121344e(2088426122, c28655q2, new C18006p(horizontalImpactBarViewState, textResource6, j17, impactCardType, textResource7, j18, function3, textResource5)), c28655q2, (i17 & 14) | 1769472, 24);
            modifier2 = modifier5;
            c28655q = c28655q2;
            textResourceM21267a = textResource8;
            textResource4 = textResource7;
            j15 = j18;
            textResourceM21267a3 = textResource5;
            function2 = function3;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier2 = modifier;
            function2 = function1;
            textResource4 = textResourceM21267a2;
            j14 = jM125430y;
            j15 = jM125382b1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C18007q(modifier2, textResourceM21267a, j14, textResource4, j15, textResourceM21267a3, horizontalImpactBarViewState, impactCardType, function2, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m51711g(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m51712h(C39065r c39065r, TextResource textResource, long j7, InterfaceC33570g.b bVar, TextResource textResource2, long j13, Function1 function1, TextResource textResource3, Composer composer, int i13) {
        C0209i c0209i;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2305k c2305k = C2299e.f9110M;
            C2314t c2314t = C2314t.f9131w;
            float f13 = 2;
            float f14 = 8;
            float f15 = f13 * f14;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f15, AbstractC1102d.m3409f(1.0f, c2314t));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i2 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
            C0209i c0209i3 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
            C0209i c0209i4 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
            }
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22961h c22961h = AbstractC22977m.f90656g;
            C2306l c2306l = C2299e.f9108K;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22961h, c2306l, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
            String strM21274h = AbstractC8693b.m21274h(textResource, c28655q, 0);
            C38072d c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(strM21274h, null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH4(), null, c28655q, 0, 0, 196602);
            C22949e c22949e = AbstractC22977m.f90651b;
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 54);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(bVar.getLabel(), c28655q, 0), null, bVar.getLabelColor().mo134584toComposableColorWaAFU9c(c28655q, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getN5(), null, c28655q, 0, 0, 196602);
            AbstractC30795n.m94707h(AbstractC8693b.m21273g(AbstractC16277f.f62235F1, c28655q, 0), null, bVar.getLabelColor().mo134584toComposableColorWaAFU9c(c28655q, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getN6(), null, c28655q, 0, 0, 196602);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            AbstractC39061n.m124553f(null, c39065r, c28655q, 0, 1);
            C22971k c22971kM66746i = AbstractC22977m.m66746i(f15);
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f15, 0.0f, 0.0f, 13);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22971kM66746i, c2305k, c28655q, 54);
            int iHashCode4 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m4);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                c0209i = c0209i4;
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i);
            } else {
                c0209i = c0209i4;
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N4);
            C0209i c0209i6 = c0209i;
            AbstractC17755i2.m50938j(null, EnumC17744g.DOTTED, null, null, null, 0L, 0L, null, c28655q, 48, 253);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource2, c28655q, 0), null, j13, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB2(), null, c28655q, 0, 0, 196602);
            Modifier modifierM3395q = AbstractC1099a.m3395q(c2314t, ((float) 0.5d) * f14, 1 * f14);
            boolean zM87153g = c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C16283a(function1, 20);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM3395q, false, null, null, (InterfaceC4339a) objM87133R, 15);
            float f16 = 4;
            C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q(f13, f16, c2306l, c28655q, 54);
            int iHashCode5 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3362g);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M53376q);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m5);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode5))) {
                AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i6);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N5);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource3, c28655q, 0), null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(6), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getBtS(), null, c28655q, 0, 0, 196090);
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward(), c28655q, 6), null, AbstractC1102d.m3419p(f16 * f16, c2314t), c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
            AbstractC25012a.m73392y(c28655q, true, true, true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m51713i(Function1 function1) {
        function1.invoke(new C18008r(1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m51714j() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m51715k(Modifier modifier, TextResource textResource, long j7, TextResource textResource2, long j13, TextResource textResource3, C39065r c39065r, InterfaceC33570g.b bVar, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m51710f(modifier, textResource, j7, textResource2, j13, textResource3, c39065r, bVar, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
