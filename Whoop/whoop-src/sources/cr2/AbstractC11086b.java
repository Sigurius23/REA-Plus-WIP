package cr2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import be1.C3172f;
import bf0.C3198j;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import hy0.AbstractC17755i2;
import hy0.AbstractC17808z1;
import hy0.EnumC17727b2;
import hy0.EnumC17744g;
import ih0.AbstractC18489d0;
import jr2.AbstractC21904c;
import kr2.AbstractC22813b;
import kr2.EnumC22817f;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p077d0.C11393q0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22976l1;
import p291l0.C22994r1;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: cr2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aA\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001aQ\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/design/util/TextResource;", "title", "value", "suffix", "Lcr2/h;", "style", "subtext", "Lhy0/b2;", "subtextState", "Ll83/a0;", "d", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcr2/h;Lcom/whoop/design/util/TextResource;Lhy0/b2;Landroidx/compose/runtime/Composer;I)V", "", "isLastIndex", "Lkotlin/time/Duration;", "delay", "f", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcr2/h;Lcom/whoop/design/util/TextResource;Lhy0/b2;ZJLandroidx/compose/runtime/Composer;I)V", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC11086b {

    /* JADX INFO: renamed from: cr2.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.user.journey.view.components.steps.statitem.StatItemKt$StatItemV2$1$1", m100430f = "StatItem.kt", m100431l = {113}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f35168w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ long f35169x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C11393q0 f35170y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j7, C11393q0 c11393q0, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f35169x = j7;
            this.f35170y = c11393q0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f35169x, this.f35170y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f35168w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                long j7 = this.f35169x;
                this.f35168w = 1;
                if (AbstractC3034m0.m8783c(j7, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            this.f35170y.m30628I0(Boolean.TRUE);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m29916d(TextResource title, TextResource value, TextResource textResource, EnumC11092h style, TextResource subtext, EnumC17727b2 subtextState, Composer composer, int i13) {
        int i14;
        TextResource textResource2;
        C28655q c28655q;
        boolean z4;
        C38072d c38072d;
        int i15;
        C2886a c2886aM62318f;
        int i16;
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(value, "value");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(subtext, "subtext");
        AbstractC22676k.m65750j(subtextState, "subtextState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1491077738);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q2.m87153g(title) : c28655q2.m87157i(title) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q2.m87153g(value) : c28655q2.m87157i(value) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= (i13 & 512) == 0 ? c28655q2.m87153g(textResource) : c28655q2.m87157i(textResource) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q2.m87149e(style.ordinal()) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= (32768 & i13) == 0 ? c28655q2.m87153g(subtext) : c28655q2.m87157i(subtext) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q2.m87149e(subtextState.ordinal()) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        int i17 = i14;
        if (c28655q2.m87135U(i17 & 1, (i17 & 74899) != 74898)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 0);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
            int i18 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(title, c28655q2, (i17 & 14) | i18);
            C38072d c38072d2 = C38072d.f163053a;
            int i19 = C38072d.f163054b;
            C2886a b6 = c38072d2.m121952e(c28655q2, i19).getB1();
            long white50 = c38072d2.m121949b(c28655q2, i19).getWhite50();
            int i24 = C2886a.f11498d;
            int i25 = i24 << 18;
            C2314t c2314t2 = c2314t;
            AbstractC30795n.m94707h(strM21274h, null, white50, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b6, null, c28655q2, 0, i25, 196602);
            float f13 = 1;
            float f14 = 4;
            float f15 = f13 * f14;
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f15, c2314t2));
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66747j(f15, c2305k), C2299e.f9109L, c28655q2, 54);
            int iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, c2314t2);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
            textResource2 = value;
            String strM21274h2 = AbstractC8693b.m21274h(textResource2, c28655q2, i18 | ((i17 >> 3) & 14));
            if (style == EnumC11092h.TEXT) {
                c28655q2.m87150e0(2120056854);
                z4 = false;
                c28655q2.m87173q(false);
                c2886aM62318f = AbstractC21904c.m62318f();
                c38072d = c38072d2;
                i15 = i19;
            } else {
                z4 = false;
                c28655q2.m87150e0(2120058310);
                c38072d = c38072d2;
                i15 = i19;
                C2886a n13 = c38072d.m121952e(c28655q2, i15).getN3();
                c28655q2.m87173q(false);
                c2886aM62318f = n13;
            }
            AbstractC30795n.m94707h(strM21274h2, null, c38072d.m121949b(c28655q2, i15).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM62318f, null, c28655q2, 0, i25, 196602);
            C28655q c28655q3 = c28655q2;
            if (textResource == null) {
                c28655q3.m87150e0(1297398301);
                c28655q3.m87173q(z4);
                i16 = i18;
            } else {
                c28655q3.m87150e0(1297398302);
                String strM21274h3 = AbstractC8693b.m21274h(textResource, c28655q3, i18);
                C2886a t14 = c38072d.m121952e(c28655q3, i15).getT2();
                long brandWhite = c38072d.m121949b(c28655q3, i15).getBrandWhite();
                Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 0.0f, f15, 7);
                i16 = i18;
                c2314t2 = c2314t2;
                AbstractC30795n.m94707h(strM21274h3, modifierM3398t, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, t14, null, c28655q3, 48, i25, 196600);
                c28655q3 = c28655q3;
                c28655q3.m87173q(z4);
            }
            c28655q3.m87173q(true);
            AbstractC18489d0.m53380u(2, f14, c2314t2, c28655q3);
            float f16 = 3 * f14;
            float f17 = 8;
            float f18 = ((float) 1.5d) * f17;
            float f19 = f13 * f17;
            C28655q c28655q4 = c28655q3;
            AbstractC17808z1.m51177e(subtext, true, subtextState, false, null, f16, null, false, f16, new C22976l1(f18, f19, f18, f19), false, 0, 0, c38072d.m121952e(c28655q3, i15).getN6(), null, c28655q4, i16 | 906166320 | ((i17 >> 12) & 14) | ((i17 >> 9) & 896), i24 << 9, 23768);
            c28655q = c28655q4;
            c28655q.m87173q(true);
        } else {
            textResource2 = value;
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3172f(title, textResource2, textResource, style, subtext, subtextState, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m29917e(TextResource textResource, TextResource textResource2, TextResource textResource3, EnumC11092h enumC11092h, TextResource textResource4, EnumC17727b2 enumC17727b2, int i13, Composer composer, int i14) {
        m29916d(textResource, textResource2, textResource3, enumC11092h, textResource4, enumC17727b2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: f */
    public static final void m29918f(final TextResource title, final TextResource value, final TextResource textResource, final EnumC11092h style, final TextResource subtext, final EnumC17727b2 subtextState, final boolean z4, final long j7, Composer composer, final int i13) {
        int i14;
        boolean z13;
        C28655q c28655q;
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(value, "value");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(subtext, "subtext");
        AbstractC22676k.m65750j(subtextState, "subtextState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1279888340);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q2.m87153g(title) : c28655q2.m87157i(title) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q2.m87153g(value) : c28655q2.m87157i(value) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= (i13 & 512) == 0 ? c28655q2.m87153g(textResource) : c28655q2.m87157i(textResource) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q2.m87149e(style.ordinal()) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= (32768 & i13) == 0 ? c28655q2.m87153g(subtext) : c28655q2.m87157i(subtext) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q2.m87149e(subtextState.ordinal()) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            z13 = z4;
            i14 |= c28655q2.m87155h(z13) ? 1048576 : 524288;
        } else {
            z13 = z4;
        }
        if ((12582912 & i13) == 0) {
            i14 |= c28655q2.m87151f(j7) ? 8388608 : 4194304;
        }
        if (c28655q2.m87135U(i14 & 1, (4793491 & i14) != 4793490)) {
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C11393q0(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R);
            }
            C11393q0 c11393q0 = (C11393q0) objM87133R;
            boolean zM87157i = c28655q2.m87157i(c11393q0) | ((i14 & 29360128) == 8388608);
            Object objM87133R2 = c28655q2.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new a(j7, c11393q0, null);
                c28655q2.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R2, C23454a0.f92919a);
            c28655q = c28655q2;
            AbstractC22813b.m66090q(c11393q0, EnumC22817f.START, null, AbstractC37817c.m121344e(-812193733, c28655q2, new C3198j(title, subtext, subtextState, z13, value, style, textResource)), c28655q, 3120, 4);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: cr2.a
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC11086b.m29920h(title, value, textResource, style, subtext, subtextState, z4, j7, i13, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m29919g(TextResource textResource, TextResource textResource2, EnumC17727b2 enumC17727b2, boolean z4, TextResource textResource3, EnumC11092h enumC11092h, TextResource textResource4, Composer composer, int i13) {
        C38072d c38072d;
        int i14;
        C2886a c2886aM62318f;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            int i15 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResource, c28655q, i15);
            C38072d c38072d2 = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            C2886a b6 = c38072d2.m121952e(c28655q, i16).getB1();
            long white50 = c38072d2.m121949b(c28655q, i16).getWhite50();
            int i17 = C2886a.f11498d;
            int i18 = i17 << 18;
            AbstractC30795n.m94707h(strM21274h, null, white50, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b6, null, c28655q, 0, i18, 196602);
            float f13 = 1;
            float f14 = 4;
            float f15 = f13 * f14;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15, c2314t));
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66747j(f15, c2305k), C2299e.f9109L, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            String strM21274h2 = AbstractC8693b.m21274h(textResource3, c28655q, i15);
            if (enumC11092h == EnumC11092h.TEXT) {
                c28655q.m87150e0(-831822553);
                c28655q.m87173q(false);
                c2886aM62318f = AbstractC21904c.m62318f();
                c38072d = c38072d2;
                i14 = i16;
            } else {
                c28655q.m87150e0(-831821097);
                c38072d = c38072d2;
                i14 = i16;
                C2886a n13 = c38072d.m121952e(c28655q, i14).getN3();
                c28655q.m87173q(false);
                c2886aM62318f = n13;
            }
            int i19 = i14;
            AbstractC30795n.m94707h(strM21274h2, null, c38072d.m121949b(c28655q, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM62318f, null, c28655q, 0, i18, 196602);
            C28655q c28655q2 = c28655q;
            if (textResource4 == null) {
                c28655q2.m87150e0(-16537328);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-16537327);
                String strM21274h3 = AbstractC8693b.m21274h(textResource4, c28655q2, i15);
                C2886a t14 = c38072d.m121952e(c28655q2, i19).getT2();
                long brandWhite = c38072d.m121949b(c28655q2, i19).getBrandWhite();
                Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f15, 7);
                c2314t = c2314t;
                AbstractC30795n.m94707h(strM21274h3, modifierM3398t, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, t14, null, c28655q2, 48, i18, 196600);
                c28655q2 = c28655q2;
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
            float f16 = 2;
            AbstractC18489d0.m53380u(f16, f14, c2314t, c28655q2);
            float f17 = 3 * f14;
            float f18 = 8;
            float f19 = ((float) 1.5d) * f18;
            float f24 = f13 * f18;
            C28655q c28655q3 = c28655q2;
            AbstractC17808z1.m51177e(textResource2, true, enumC17727b2, false, null, f17, null, false, f17, new C22976l1(f19, f24, f19, f24), false, 0, 0, c38072d.m121952e(c28655q2, i19).getN8(), null, c28655q3, i15 | 906166320, i17 << 9, 23768);
            C28655q c28655q4 = c28655q3;
            if (z4) {
                c28655q4.m87150e0(1601010577);
                c28655q4.m87173q(false);
            } else {
                c28655q4.m87150e0(1600779937);
                float f25 = f16 * f18;
                AbstractC22953f.m66715b(c28655q4, AbstractC1102d.m3419p(f25, c2314t));
                AbstractC17755i2.m50938j(null, EnumC17744g.DOTTED, null, null, null, 0L, 0L, null, c28655q4, 48, 253);
                c28655q4 = c28655q4;
                AbstractC25012a.m73389v(c2314t, f25, c28655q4, false);
            }
            c28655q4.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m29920h(TextResource textResource, TextResource textResource2, TextResource textResource3, EnumC11092h enumC11092h, TextResource textResource4, EnumC17727b2 enumC17727b2, boolean z4, long j7, int i13, Composer composer, int i14) {
        m29918f(textResource, textResource2, textResource3, enumC11092h, textResource4, enumC17727b2, z4, j7, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
