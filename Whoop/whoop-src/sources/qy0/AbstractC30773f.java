package qy0;

import ai1.C0910b;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.AbstractC1095d;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.mapbox.maps.MapboxMap;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import dn0.C12201a;
import dn0.C12202b;
import dn0.C12203c;
import dn0.C12205e;
import dn0.C12206f;
import dn0.C12207g;
import e93.AbstractC12889b;
import gb1.AbstractC15676d;
import gb1.AbstractC15679g;
import ge3.AbstractC15751g;
import ht2.C17632d;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p132f0.InterfaceC13832v0;
import p181h2.C16620e;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17916v0;
import p208i2.C17919x;
import p209i3.AbstractC18032n;
import p209i3.AbstractC18041w;
import p209i3.InterfaceC18044z;
import p238j0.InterfaceC21083i;
import p270k2.C22135i;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p635y2.InterfaceC39127r0;
import p636y3.C39174f;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import qv1.C30654e;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: qy0.f */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u001aí\u0001\u0010\u001d\u001a\u00020\u001b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\u000f2\b\b\u0002\u0010\u0019\u001a\u00020\u000f2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a;\u0010!\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\bH\u0003¢\u0006\u0004\b!\u0010\"\u001a/\u0010$\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0004H\u0003¢\u0006\u0004\b$\u0010%\u001a'\u0010&\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b&\u0010'\u001aC\u0010)\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010#\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b)\u0010*\u001a!\u0010+\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0003¢\u0006\u0004\b+\u0010,¨\u0006-"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcom/whoop/design/util/TextResource;", "label", "Ly81/e;", "labelColor", "contentDescription", "backgroundColor", "Ly3/f;", "backgroundSize", "Lqy0/g;", "viewCorners", "dotColor", "dotShadowColor", "dotBorderColor", "", "increaseDotOffset", "", "dotSizeMultiplier", "dateBackgroundColor", "dateBorderColor", "dateBorderWidth", "showDashedBorder", "circleSize", "isEnabled", "showSelectedDateCircle", "Lkotlin/Function0;", "Ll83/a0;", "onClick", "v", "(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly3/f;Lqy0/g;Ly81/e;Ly81/e;Ly81/e;ZLjava/lang/Float;Ly81/e;Ly81/e;FZFZZLc93/a;Landroidx/compose/runtime/Composer;III)V", "dotSize", MapboxMap.QFE_OFFSET, "r", "(Ly81/e;Ly81/e;Ly81/e;FFLandroidx/compose/runtime/Composer;I)V", "backgroundCircleSize", "n", "(FZFLy81/e;Landroidx/compose/runtime/Composer;I)V", "p", "(Ly81/e;FLqy0/g;Landroidx/compose/runtime/Composer;I)V", "scale", "A", "(FFLy81/e;Ly81/e;FLqy0/g;Landroidx/compose/runtime/Composer;I)V", "l", "(FLy81/e;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30773f {

    /* JADX INFO: renamed from: qy0.f$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f126731w = new a();

        /* JADX INFO: renamed from: a */
        public final long m94553a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getTransparent();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m94553a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: qy0.f$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f126732w = new b();

        /* JADX INFO: renamed from: a */
        public final long m94554a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m94554a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: qy0.f$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f126733w = new c();

        /* JADX INFO: renamed from: a */
        public final long m94555a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBlack20();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m94555a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: A */
    private static final void m94525A(float f13, float f14, InterfaceC39332e interfaceC39332e, InterfaceC39332e interfaceC39332e2, float f15, EnumC30774g enumC30774g, Composer composer, int i13) {
        int i14;
        InterfaceC39332e interfaceC39332e3;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1384777426);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87147d(f13) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87147d(f14) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= (i13 & 512) == 0 ? c28655q.m87153g(interfaceC39332e) : c28655q.m87157i(interfaceC39332e) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= (i13 & 4096) == 0 ? c28655q.m87153g(interfaceC39332e2) : c28655q.m87157i(interfaceC39332e2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87147d(f15) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q.m87149e(enumC30774g.ordinal()) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if (c28655q.m87135U(i14 & 1, (74899 & i14) != 74898)) {
            C2314t c2314t = C2314t.f9131w;
            if (interfaceC39332e != null) {
                c28655q.m87150e0(-743173868);
                long jMo134584toComposableColorWaAFU9c = interfaceC39332e.mo134584toComposableColorWaAFU9c(c28655q, (i14 >> 6) & 14);
                AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC37056f.m118994r(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(f15, c2314t)), enumC30774g.getStartPadding(), 0.0f, enumC30774g.getEndPadding(), 0.0f, 10), AbstractC33253j.m105487c(enumC30774g.getStartRadius(), enumC30774g.getEndRadius(), enumC30774g.getEndRadius(), enumC30774g.getStartRadius())), C17909s.m51483a(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(jMo134584toComposableColorWaAFU9c), new C17919x(C17919x.m51541c(0.3f, jMo134584toComposableColorWaAFU9c)), new C17919x(jMo134584toComposableColorWaAFU9c)), 0.0f, 0.0f, 14), null, 0.0f, 6), c28655q, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-742435820);
                c28655q.m87173q(false);
            }
            Modifier modifierM3419p = AbstractC1102d.m3419p(12 * 4 * f13, c2314t);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = b.f126732w;
                c28655q.m87172p0(objM87133R);
            }
            long jMo134584toComposableColorWaAFU9c2 = p745y81.Function1.m125323a((Function1) objM87133R).mo134584toComposableColorWaAFU9c(c28655q, 0);
            C33252i c33252i = AbstractC33253j.f138651a;
            Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC15751g.m44455h(modifierM3419p, f14, jMo134584toComposableColorWaAFU9c2, c33252i), c33252i);
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = c.f126733w;
                c28655q.m87172p0(objM87133R2);
            }
            long jMo134584toComposableColorWaAFU9c3 = p745y81.Function1.m125323a((Function1) objM87133R2).mo134584toComposableColorWaAFU9c(c28655q, 0);
            C17916v0 c17916v0 = AbstractC17918w0.f69621a;
            AbstractC22989q.m66760a(AbstractC1092a.m3358c(modifierM118994r, jMo134584toComposableColorWaAFU9c3, c17916v0), c28655q, 0);
            if (interfaceC39332e == null || interfaceC39332e2 != null) {
                interfaceC39332e3 = interfaceC39332e;
                c28655q.m87150e0(-741794988);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-742059263);
                c28655q.m87150e0(668803682);
                Modifier modifierM118994r2 = AbstractC37056f.m118994r(AbstractC1102d.m3419p(f15, c2314t), c33252i);
                interfaceC39332e3 = interfaceC39332e;
                Modifier modifierMo3471e = modifierM118994r2.mo3471e(AbstractC1092a.m3358c(c2314t, interfaceC39332e3.mo134584toComposableColorWaAFU9c(c28655q, 0), c17916v0));
                c28655q.m87173q(false);
                AbstractC22989q.m66760a(modifierMo3471e, c28655q, 0);
                c28655q.m87173q(false);
            }
        } else {
            interfaceC39332e3 = interfaceC39332e;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C12207g(f13, f14, interfaceC39332e3, interfaceC39332e2, f15, enumC30774g, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m94526B(float f13, float f14, InterfaceC39332e interfaceC39332e, InterfaceC39332e interfaceC39332e2, float f15, EnumC30774g enumC30774g, int i13, Composer composer, int i14) {
        m94525A(f13, f14, interfaceC39332e, interfaceC39332e2, f15, enumC30774g, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    private static final void m94538l(float f13, InterfaceC39332e interfaceC39332e, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1774698934);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87147d(f13) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(interfaceC39332e) : c28655q.m87157i(interfaceC39332e) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            c28655q.m87150e0(383671238);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3419p = AbstractC1102d.m3419p(f13, c2314t);
            Modifier modifierM118994r = AbstractC37056f.m118994r(interfaceC39332e != null ? modifierM3419p.mo3471e(AbstractC12889b.m36262a0(c2314t, 6, AbstractC33253j.f138651a, false, 0L, 0L, 28)) : modifierM3419p.mo3471e(c2314t), AbstractC33253j.f138651a);
            Modifier modifierMo3471e = interfaceC39332e != null ? modifierM118994r.mo3471e(AbstractC1092a.m3358c(c2314t, interfaceC39332e.mo134584toComposableColorWaAFU9c(c28655q, 0), AbstractC17918w0.f69621a)) : modifierM118994r.mo3471e(c2314t);
            c28655q.m87173q(false);
            AbstractC22989q.m66760a(modifierMo3471e, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C12206f(f13, interfaceC39332e, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m94539m(float f13, InterfaceC39332e interfaceC39332e, int i13, Composer composer, int i14) {
        m94538l(f13, interfaceC39332e, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    private static final void m94540n(float f13, boolean z4, float f14, InterfaceC39332e interfaceC39332e, Composer composer, int i13) {
        int i14;
        float f15;
        Modifier modifierMo3471e;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(437074958);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87147d(f13) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87147d(f14) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= (i13 & 4096) == 0 ? c28655q.m87153g(interfaceC39332e) : c28655q.m87157i(interfaceC39332e) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            c28655q.m87150e0(-877753049);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3419p = AbstractC1102d.m3419p(f13, c2314t);
            if (z4) {
                float f16 = 4;
                Modifier modifierM44107d = AbstractC15679g.m44107d(c2314t, f14, interfaceC39332e.mo134584toComposableColorWaAFU9c(c28655q, (i14 >> 9) & 14), AbstractC33253j.f138651a, ((float) 1.5d) * f16, ((float) 0.5d) * f16);
                f15 = f14;
                modifierMo3471e = modifierM3419p.mo3471e(modifierM44107d);
            } else {
                f15 = f14;
                modifierMo3471e = modifierM3419p.mo3471e(AbstractC15751g.m44455h(c2314t, f15, interfaceC39332e.mo134584toComposableColorWaAFU9c(c28655q, (i14 >> 9) & 14), AbstractC33253j.f138651a));
            }
            c28655q.m87173q(false);
            AbstractC22989q.m66760a(AbstractC37056f.m118994r(modifierMo3471e, AbstractC33253j.f138651a), c28655q, 0);
        } else {
            f15 = f14;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C12205e(f13, z4, f15, interfaceC39332e, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m94541o(float f13, boolean z4, float f14, InterfaceC39332e interfaceC39332e, int i13, Composer composer, int i14) {
        m94540n(f13, z4, f14, interfaceC39332e, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p */
    private static final void m94542p(InterfaceC39332e interfaceC39332e, float f13, EnumC30774g enumC30774g, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2045997614);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(interfaceC39332e) : c28655q.m87157i(interfaceC39332e) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87147d(f13) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87149e(enumC30774g.ordinal()) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(f13, C2314t.f9131w)), enumC30774g.getStartPadding(), 0.0f, enumC30774g.getEndPadding(), 0.0f, 10), AbstractC33253j.m105487c(enumC30774g.getStartRadius(), enumC30774g.getEndRadius(), enumC30774g.getEndRadius(), enumC30774g.getStartRadius())), interfaceC39332e.mo134584toComposableColorWaAFU9c(c28655q, i14 & 14), AbstractC17918w0.f69621a), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C12202b(interfaceC39332e, f13, enumC30774g, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m94543q(InterfaceC39332e interfaceC39332e, float f13, EnumC30774g enumC30774g, int i13, Composer composer, int i14) {
        m94542p(interfaceC39332e, f13, enumC30774g, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r */
    private static final void m94544r(InterfaceC39332e interfaceC39332e, InterfaceC39332e interfaceC39332e2, InterfaceC39332e interfaceC39332e3, float f13, float f14, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1622626797);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(interfaceC39332e) : c28655q.m87157i(interfaceC39332e) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(interfaceC39332e2) : c28655q.m87157i(interfaceC39332e2) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= (i13 & 512) == 0 ? c28655q.m87153g(interfaceC39332e3) : c28655q.m87157i(interfaceC39332e3) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87147d(f13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87147d(f14) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 9363) != 9362)) {
            C2314t c2314t = C2314t.f9131w;
            AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1099a.m3392n(AbstractC1102d.m3419p(f13, c2314t), 0.0f, f14, 1), AbstractC33253j.f138651a), interfaceC39332e.mo134584toComposableColorWaAFU9c(c28655q, i14 & 14), AbstractC17918w0.f69621a), c28655q, 0);
            C28676v0 c28676v0 = C28635l.f115821a;
            if (interfaceC39332e2 != null) {
                c28655q.m87150e0(-181624325);
                long jMo134584toComposableColorWaAFU9c = interfaceC39332e2.mo134584toComposableColorWaAFU9c(c28655q, (i14 >> 3) & 14);
                Modifier modifierM3392n = AbstractC1099a.m3392n(AbstractC1102d.m3419p((1 * 4) + f13, c2314t), 0.0f, f14, 1);
                boolean zM87151f = c28655q.m87151f(jMo134584toComposableColorWaAFU9c);
                Object objM87133R = c28655q.m87133R();
                if (zM87151f || objM87133R == c28676v0) {
                    objM87133R = new C0910b(jMo134584toComposableColorWaAFU9c, 27);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC22989q.m66760a(AbstractC1125a.m3478a(modifierM3392n, (Function1) objM87133R), c28655q, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-181045803);
                c28655q.m87173q(false);
            }
            if (interfaceC39332e3 != null) {
                c28655q.m87150e0(-180995025);
                long jMo134584toComposableColorWaAFU9c2 = interfaceC39332e3.mo134584toComposableColorWaAFU9c(c28655q, (i14 >> 6) & 14);
                Modifier modifierM3392n2 = AbstractC1099a.m3392n(AbstractC1102d.m3419p(f13, c2314t), 0.0f, f14, 1);
                boolean zM87151f2 = c28655q.m87151f(jMo134584toComposableColorWaAFU9c2);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87151f2 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C0910b(jMo134584toComposableColorWaAFU9c2, 28);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC22989q.m66760a(AbstractC1125a.m3478a(modifierM3392n2, (Function1) objM87133R2), c28655q, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-180466475);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C12201a(interfaceC39332e, interfaceC39332e2, interfaceC39332e3, f13, f14, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m94545s(long j7, InterfaceC22131e drawBehind) {
        AbstractC22676k.m65750j(drawBehind, "$this$drawBehind");
        float fMo743q0 = drawBehind.mo743q0(((float) 0.5d) * 4);
        InterfaceC22131e.m63379M(drawBehind, j7, (C16620e.m47212d(drawBehind.mo731d()) - fMo743q0) / 2, 0L, 0.0f, new C22135i(fMo743q0, 0.0f, 0, 0, null, 30), 108);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m94546t(long j7, InterfaceC22131e drawBehind) {
        AbstractC22676k.m65750j(drawBehind, "$this$drawBehind");
        float fMo743q0 = drawBehind.mo743q0(((float) 0.25d) * 4);
        InterfaceC22131e.m63379M(drawBehind, j7, (C16620e.m47212d(drawBehind.mo731d()) - fMo743q0) / 2, 0L, 0.0f, new C22135i(fMo743q0, 0.0f, 0, 0, null, 30), 108);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m94547u(InterfaceC39332e interfaceC39332e, InterfaceC39332e interfaceC39332e2, InterfaceC39332e interfaceC39332e3, float f13, float f14, int i13, Composer composer, int i14) {
        m94544r(interfaceC39332e, interfaceC39332e2, interfaceC39332e3, f13, f14, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0147  */
    /* JADX WARN: Code duplicated, block: B:102:0x014b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0151  */
    /* JADX WARN: Code duplicated, block: B:105:0x0156  */
    /* JADX WARN: Code duplicated, block: B:107:0x015c  */
    /* JADX WARN: Code duplicated, block: B:108:0x015f  */
    /* JADX WARN: Code duplicated, block: B:112:0x016f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0172  */
    /* JADX WARN: Code duplicated, block: B:115:0x0176  */
    /* JADX WARN: Code duplicated, block: B:117:0x017c  */
    /* JADX WARN: Code duplicated, block: B:118:0x0181  */
    /* JADX WARN: Code duplicated, block: B:120:0x0187  */
    /* JADX WARN: Code duplicated, block: B:121:0x018a  */
    /* JADX WARN: Code duplicated, block: B:125:0x0192  */
    /* JADX WARN: Code duplicated, block: B:126:0x019b  */
    /* JADX WARN: Code duplicated, block: B:128:0x019f  */
    /* JADX WARN: Code duplicated, block: B:130:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:131:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:133:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:136:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:138:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:140:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:142:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:144:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:147:0x01de  */
    /* JADX WARN: Code duplicated, block: B:148:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:150:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:152:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:153:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:155:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:157:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:160:0x0203  */
    /* JADX WARN: Code duplicated, block: B:161:0x0206  */
    /* JADX WARN: Code duplicated, block: B:163:0x020c  */
    /* JADX WARN: Code duplicated, block: B:165:0x0210  */
    /* JADX WARN: Code duplicated, block: B:166:0x0215  */
    /* JADX WARN: Code duplicated, block: B:168:0x021b  */
    /* JADX WARN: Code duplicated, block: B:170:0x0220  */
    /* JADX WARN: Code duplicated, block: B:173:0x0228  */
    /* JADX WARN: Code duplicated, block: B:175:0x022f  */
    /* JADX WARN: Code duplicated, block: B:177:0x0235  */
    /* JADX WARN: Code duplicated, block: B:179:0x023d  */
    /* JADX WARN: Code duplicated, block: B:183:0x0245  */
    /* JADX WARN: Code duplicated, block: B:184:0x024a  */
    /* JADX WARN: Code duplicated, block: B:186:0x0250  */
    /* JADX WARN: Code duplicated, block: B:188:0x0256  */
    /* JADX WARN: Code duplicated, block: B:189:0x0259  */
    /* JADX WARN: Code duplicated, block: B:193:0x0261  */
    /* JADX WARN: Code duplicated, block: B:194:0x0266  */
    /* JADX WARN: Code duplicated, block: B:196:0x026c  */
    /* JADX WARN: Code duplicated, block: B:199:0x0273  */
    /* JADX WARN: Code duplicated, block: B:203:0x027b  */
    /* JADX WARN: Code duplicated, block: B:204:0x0280  */
    /* JADX WARN: Code duplicated, block: B:206:0x0286  */
    /* JADX WARN: Code duplicated, block: B:208:0x028c  */
    /* JADX WARN: Code duplicated, block: B:212:0x0296  */
    /* JADX WARN: Code duplicated, block: B:213:0x029b  */
    /* JADX WARN: Code duplicated, block: B:215:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:217:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:221:0x02af  */
    /* JADX WARN: Code duplicated, block: B:223:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:225:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:227:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:231:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:235:0x02da  */
    /* JADX WARN: Code duplicated, block: B:238:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:240:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:254:0x0334 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:255:0x0336  */
    /* JADX WARN: Code duplicated, block: B:256:0x0339  */
    /* JADX WARN: Code duplicated, block: B:259:0x033f  */
    /* JADX WARN: Code duplicated, block: B:262:0x0349  */
    /* JADX WARN: Code duplicated, block: B:264:0x034f  */
    /* JADX WARN: Code duplicated, block: B:266:0x035d  */
    /* JADX WARN: Code duplicated, block: B:269:0x0363  */
    /* JADX WARN: Code duplicated, block: B:272:0x036d  */
    /* JADX WARN: Code duplicated, block: B:273:0x0370  */
    /* JADX WARN: Code duplicated, block: B:275:0x0374  */
    /* JADX WARN: Code duplicated, block: B:276:0x0377  */
    /* JADX WARN: Code duplicated, block: B:278:0x037b  */
    /* JADX WARN: Code duplicated, block: B:279:0x037e  */
    /* JADX WARN: Code duplicated, block: B:281:0x0382  */
    /* JADX WARN: Code duplicated, block: B:282:0x0385  */
    /* JADX WARN: Code duplicated, block: B:284:0x0389  */
    /* JADX WARN: Code duplicated, block: B:286:0x038d  */
    /* JADX WARN: Code duplicated, block: B:288:0x0391  */
    /* JADX WARN: Code duplicated, block: B:289:0x0394  */
    /* JADX WARN: Code duplicated, block: B:291:0x0398  */
    /* JADX WARN: Code duplicated, block: B:292:0x039b  */
    /* JADX WARN: Code duplicated, block: B:294:0x039f  */
    /* JADX WARN: Code duplicated, block: B:297:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:300:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:301:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:303:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:304:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:306:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:307:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:309:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:310:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:312:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:313:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:316:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:318:0x03df  */
    /* JADX WARN: Code duplicated, block: B:319:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:321:0x0416  */
    /* JADX WARN: Code duplicated, block: B:324:0x0448  */
    /* JADX WARN: Code duplicated, block: B:327:0x046c  */
    /* JADX WARN: Code duplicated, block: B:329:0x0472 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:330:0x0474  */
    /* JADX WARN: Code duplicated, block: B:331:0x0477  */
    /* JADX WARN: Code duplicated, block: B:334:0x0481  */
    /* JADX WARN: Code duplicated, block: B:335:0x048f  */
    /* JADX WARN: Code duplicated, block: B:338:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:339:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:33:0x0078  */
    /* JADX WARN: Code duplicated, block: B:342:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:343:0x04df  */
    /* JADX WARN: Code duplicated, block: B:346:0x04e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:347:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:350:0x051d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:351:0x051f  */
    /* JADX WARN: Code duplicated, block: B:354:0x0557  */
    /* JADX WARN: Code duplicated, block: B:355:0x055b  */
    /* JADX WARN: Code duplicated, block: B:358:0x0570  */
    /* JADX WARN: Code duplicated, block: B:361:0x0581  */
    /* JADX WARN: Code duplicated, block: B:365:0x058d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:367:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:369:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:370:0x05e6  */
    /* JADX WARN: Code duplicated, block: B:372:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:374:0x0603  */
    /* JADX WARN: Code duplicated, block: B:375:0x0618  */
    /* JADX WARN: Code duplicated, block: B:377:0x062d  */
    /* JADX WARN: Code duplicated, block: B:379:0x0639  */
    /* JADX WARN: Code duplicated, block: B:381:0x0665  */
    /* JADX WARN: Code duplicated, block: B:384:0x0697  */
    /* JADX WARN: Code duplicated, block: B:385:0x069b  */
    /* JADX WARN: Code duplicated, block: B:388:0x06a8  */
    /* JADX WARN: Code duplicated, block: B:390:0x06b6  */
    /* JADX WARN: Code duplicated, block: B:393:0x0722  */
    /* JADX WARN: Code duplicated, block: B:394:0x0747  */
    /* JADX WARN: Code duplicated, block: B:396:0x077e  */
    /* JADX WARN: Code duplicated, block: B:399:0x07ab  */
    /* JADX WARN: Code duplicated, block: B:401:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:78:0x0100  */
    /* JADX WARN: Code duplicated, block: B:81:0x010b  */
    /* JADX WARN: Code duplicated, block: B:82:0x010e  */
    /* JADX WARN: Code duplicated, block: B:86:0x011b  */
    /* JADX WARN: Code duplicated, block: B:87:0x011e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0122  */
    /* JADX WARN: Code duplicated, block: B:91:0x0128  */
    /* JADX WARN: Code duplicated, block: B:92:0x012d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0133  */
    /* JADX WARN: Code duplicated, block: B:95:0x0136  */
    /* JADX WARN: Code duplicated, block: B:99:0x0144  */
    /* JADX INFO: renamed from: v */
    public static final void m94548v(Modifier modifier, TextResource textResource, InterfaceC39332e interfaceC39332e, TextResource textResource2, InterfaceC39332e interfaceC39332e2, C39174f c39174f, EnumC30774g enumC30774g, InterfaceC39332e interfaceC39332e3, InterfaceC39332e interfaceC39332e4, InterfaceC39332e interfaceC39332e5, boolean z4, Float f13, InterfaceC39332e interfaceC39332e6, InterfaceC39332e interfaceC39332e7, float f14, boolean z13, float f15, boolean z14, boolean z15, InterfaceC4339a interfaceC4339a, Composer composer, final int i13, final int i14, final int i15) {
        int i16;
        TextResource textResourceM21267a;
        TextResource textResourceM21267a2;
        int i17;
        int iOrdinal;
        int i18;
        int i19;
        boolean zM87157i;
        int i24;
        int i25;
        int i26;
        boolean zM87157i2;
        int i27;
        int i28;
        boolean zM87157i3;
        int i29;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i44;
        boolean zM87157i4;
        int i45;
        int i46;
        int i47;
        boolean zM87157i5;
        int i48;
        int i49;
        int i54;
        int i55;
        int i56;
        int i57;
        int i58;
        int i59;
        int i64;
        boolean z16;
        final Modifier modifier2;
        final EnumC30774g enumC30774g2;
        final InterfaceC39332e interfaceC39332e8;
        final boolean z17;
        final float f16;
        final boolean z18;
        final float f17;
        final boolean z19;
        final boolean z24;
        final InterfaceC4339a interfaceC4339a2;
        final InterfaceC39332e interfaceC39332e9;
        final InterfaceC39332e interfaceC39332e10;
        C28655q c28655q;
        final TextResource textResource3;
        final InterfaceC39332e interfaceC39332e11;
        final C39174f c39174f2;
        final Float f18;
        final InterfaceC39332e interfaceC39332e12;
        final TextResource textResource4;
        final InterfaceC39332e interfaceC39332e13;
        final InterfaceC39332e interfaceC39332e14;
        C28677v1 c28677v1M87180u;
        int i65;
        C28676v0 c28676v0;
        Modifier modifier3;
        InterfaceC39332e interfaceC39332eM125323a;
        InterfaceC39332e interfaceC39332e15;
        C39174f c39174f3;
        EnumC30774g enumC30774g3;
        InterfaceC39332e interfaceC39332e16;
        boolean z25;
        Float f19;
        InterfaceC39332e interfaceC39332e17;
        int i66;
        float f24;
        boolean z26;
        float f25;
        boolean z27;
        boolean z28;
        float f26;
        InterfaceC39332e interfaceC39332e18;
        TextResource textResource5;
        int i67;
        InterfaceC39332e interfaceC39332e19;
        float f27;
        InterfaceC39332e interfaceC39332e20;
        float f28;
        InterfaceC39332e interfaceC39332e21;
        TextResource textResource6;
        boolean z29;
        boolean z34;
        Modifier modifier4;
        InterfaceC39332e interfaceC39332e22;
        C39174f c39174f4;
        EnumC30774g enumC30774g4;
        InterfaceC39332e interfaceC39332e23;
        boolean z35;
        Float f29;
        boolean z36;
        Object objM87133R;
        InterfaceC4339a interfaceC4339a3;
        Object objM87133R2;
        Object objM87133R3;
        String strM21274h;
        float fMo740m0;
        float f34;
        int i68;
        float fFloatValue;
        float f35;
        float f36;
        float f37;
        int i69;
        float f38;
        int i74;
        boolean z37;
        boolean z38;
        boolean z39;
        Object objM87133R4;
        boolean zM87153g;
        Object objM87133R5;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i75;
        InterfaceC39332e interfaceC39332e24;
        C28655q c28655q2;
        EnumC30774g enumC30774g5;
        float f39;
        boolean z44;
        InterfaceC39332e interfaceC39332e25;
        boolean z45;
        int iHashCode2;
        boolean z46;
        C28655q c28655q3;
        InterfaceC39332e interfaceC39332e26;
        InterfaceC39332e interfaceC39332e27;
        InterfaceC39332e interfaceC39332e28;
        boolean z47;
        int i76;
        int i77;
        InterfaceC39332e interfaceC39332e29 = interfaceC39332e4;
        InterfaceC39332e interfaceC39332e30 = interfaceC39332e5;
        InterfaceC39332e interfaceC39332e31 = interfaceC39332e6;
        C28655q c28655q4 = (C28655q) composer;
        c28655q4.m87154g0(534765181);
        int i78 = i15 & 1;
        if (i78 != 0) {
            i16 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i16 = (c28655q4.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i16 = i13;
        }
        if ((i13 & 48) == 0) {
            textResourceM21267a = textResource;
            i16 |= ((i15 & 2) == 0 && c28655q4.m87153g(textResourceM21267a)) ? 32 : 16;
        } else {
            textResourceM21267a = textResource;
        }
        if ((i13 & 384) == 0) {
            if ((i15 & 4) != 0) {
                i77 = 128;
            } else {
                if ((i13 & 512) == 0 ? c28655q4.m87153g(interfaceC39332e) : c28655q4.m87157i(interfaceC39332e)) {
                    i77 = 256;
                } else {
                    i77 = 128;
                }
            }
            i16 |= i77;
        }
        int i79 = i13 & 3072;
        int i83 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i79 == 0) {
            if ((i15 & 8) == 0) {
                textResourceM21267a2 = textResource2;
                if (c28655q4.m87153g(textResourceM21267a2)) {
                    i76 = 2048;
                }
                i16 |= i76;
            } else {
                textResourceM21267a2 = textResource2;
            }
            i76 = 1024;
            i16 |= i76;
        } else {
            textResourceM21267a2 = textResource2;
        }
        int i84 = i15 & 16;
        int i85 = DfuBaseService.ERROR_REMOTE_MASK;
        if (i84 != 0) {
            i16 |= 24576;
        } else if ((i13 & 24576) == 0) {
            i16 |= (i13 & 32768) == 0 ? c28655q4.m87153g(interfaceC39332e2) : c28655q4.m87157i(interfaceC39332e2) ? 16384 : 8192;
        }
        int i86 = i15 & 32;
        if (i86 == 0) {
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                i16 |= c28655q4.m87153g(c39174f) ? 131072 : 65536;
            }
            i17 = i15 & 64;
            if (i17 != 0) {
                i16 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (enumC30774g == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = enumC30774g.ordinal();
                }
                if (c28655q4.m87149e(iOrdinal)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i16 |= i18;
            }
            i19 = i15 & 128;
            if (i19 != 0) {
                i16 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if ((i13 & 16777216) == 0) {
                    zM87157i = c28655q4.m87153g(interfaceC39332e3);
                } else {
                    zM87157i = c28655q4.m87157i(interfaceC39332e3);
                }
                if (zM87157i) {
                    i24 = 8388608;
                } else {
                    i24 = 4194304;
                }
                i16 |= i24;
            }
            i25 = i15 & 256;
            i26 = AndroidSDKConstants.FLAG_MUTABLE;
            if (i25 != 0) {
                i16 |= 100663296;
            } else if ((i13 & 100663296) == 0) {
                if ((i13 & 134217728) == 0) {
                    zM87157i2 = c28655q4.m87153g(interfaceC39332e29);
                } else {
                    zM87157i2 = c28655q4.m87157i(interfaceC39332e29);
                }
                if (zM87157i2) {
                    i27 = 67108864;
                } else {
                    i27 = 33554432;
                }
                i16 |= i27;
            }
            i28 = i15 & 512;
            if (i28 != 0) {
                i16 |= 805306368;
            } else if ((i13 & 805306368) == 0) {
                if ((i13 & 1073741824) == 0) {
                    zM87157i3 = c28655q4.m87153g(interfaceC39332e30);
                } else {
                    zM87157i3 = c28655q4.m87157i(interfaceC39332e30);
                }
                if (zM87157i3) {
                    i29 = 536870912;
                } else {
                    i29 = 268435456;
                }
                i16 |= i29;
            }
            i34 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i34 != 0) {
                i35 = i14 | 6;
            } else if ((i14 & 6) == 0) {
                if (c28655q4.m87155h(z4)) {
                    i36 = 4;
                } else {
                    i36 = 2;
                }
                i35 = i14 | i36;
            } else {
                i35 = i14;
            }
            i37 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            if (i37 != 0) {
                i35 |= 48;
            } else if ((i14 & 48) != 0) {
                i35 |= c28655q4.m87153g(f13) ? 32 : 16;
            }
            i38 = i35;
            i39 = i15 & 4096;
            if (i39 != 0) {
                i44 = i38 | 384;
            } else if ((i14 & 384) == 0) {
                if ((i14 & 512) == 0) {
                    zM87157i4 = c28655q4.m87153g(interfaceC39332e31);
                } else {
                    zM87157i4 = c28655q4.m87157i(interfaceC39332e31);
                }
                i44 = i38 | (zM87157i4 ? 256 : 128);
            } else {
                i44 = i38;
            }
            i45 = i15 & DfuBaseService.ERROR_REMOTE_MASK;
            if (i45 != 0) {
                i47 = i44 | 3072;
            } else {
                i46 = i44;
                if ((i14 & 3072) == 0) {
                    if ((i14 & 4096) == 0) {
                        zM87157i5 = c28655q4.m87153g(interfaceC39332e7);
                    } else {
                        zM87157i5 = c28655q4.m87157i(interfaceC39332e7);
                    }
                    if (zM87157i5) {
                        i83 = 2048;
                    }
                    i47 = i46 | i83;
                } else {
                    i47 = i46;
                }
            }
            i48 = i15 & DfuBaseService.ERROR_CONNECTION_MASK;
            if (i48 != 0) {
                i49 = i47;
                if ((i14 & 24576) == 0) {
                    if (c28655q4.m87147d(f14)) {
                        i85 = 16384;
                    }
                    i49 |= i85;
                }
                i54 = i15 & 32768;
                if (i54 != 0) {
                    i49 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q4.m87155h(z13)) {
                        i55 = 131072;
                    } else {
                        i55 = 65536;
                    }
                    i49 |= i55;
                }
                i56 = i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                if (i56 != 0) {
                    i49 |= 1572864;
                } else if ((i14 & 1572864) == 0) {
                    i49 |= c28655q4.m87147d(f15) ? 1048576 : 524288;
                }
                i57 = i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                if (i57 != 0) {
                    i49 |= 12582912;
                } else if ((i14 & 12582912) == 0) {
                    i49 |= c28655q4.m87155h(z14) ? 8388608 : 4194304;
                }
                i58 = i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION;
                if (i58 != 0) {
                    i49 |= 100663296;
                } else if ((i14 & 100663296) == 0) {
                    if (c28655q4.m87155h(z15)) {
                        i26 = 67108864;
                    }
                    i49 |= i26;
                }
                i59 = i15 & 524288;
                if (i59 != 0) {
                    i49 |= 805306368;
                } else if ((i14 & 805306368) == 0) {
                    i49 |= c28655q4.m87157i(interfaceC4339a) ? 536870912 : 268435456;
                }
                i64 = i49;
                if ((i16 & 306783379) == 306783378 || (i64 & 306783379) != 306783378) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q4.m87135U(i16 & 1, z16)) {
                    c28655q4.m87140Z();
                    i65 = i13 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i65 != 0 || c28655q4.m87118C()) {
                        if (i78 != 0) {
                            modifier3 = C2314t.f9131w;
                        } else {
                            modifier3 = modifier;
                        }
                        if ((i15 & 2) != 0) {
                            textResourceM21267a = AbstractC8693b.m21267a();
                            i16 &= -113;
                        }
                        if ((i15 & 4) != 0) {
                            objM87133R2 = c28655q4.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = a.f126731w;
                                c28655q4.m87172p0(objM87133R2);
                            }
                            interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R2);
                            i16 &= -897;
                        } else {
                            interfaceC39332eM125323a = interfaceC39332e;
                        }
                        if ((i15 & 8) != 0) {
                            textResourceM21267a2 = AbstractC8693b.m21267a();
                            i16 &= -7169;
                        }
                        if (i84 != 0) {
                            interfaceC39332e15 = null;
                        } else {
                            interfaceC39332e15 = interfaceC39332e2;
                        }
                        if (i86 != 0) {
                            c39174f3 = null;
                        } else {
                            c39174f3 = c39174f;
                        }
                        if (i17 != 0) {
                            enumC30774g3 = EnumC30774g.NONE;
                        } else {
                            enumC30774g3 = enumC30774g;
                        }
                        if (i19 != 0) {
                            interfaceC39332e16 = null;
                        } else {
                            interfaceC39332e16 = interfaceC39332e3;
                        }
                        if (i25 != 0) {
                            interfaceC39332e29 = null;
                        }
                        if (i28 != 0) {
                            interfaceC39332e30 = null;
                        }
                        if (i34 != 0) {
                            z25 = false;
                        } else {
                            z25 = z4;
                        }
                        if (i37 != 0) {
                            f19 = null;
                        } else {
                            f19 = f13;
                        }
                        if (i39 != 0) {
                            interfaceC39332e31 = null;
                        }
                        interfaceC39332e17 = i45 == 0 ? interfaceC39332e7 : null;
                        i66 = i16;
                        if (i48 != 0) {
                            f24 = (float) 1.5d;
                        } else {
                            f24 = f14;
                        }
                        if (i54 != 0) {
                            z26 = false;
                        } else {
                            z26 = z13;
                        }
                        if (i56 != 0) {
                            f25 = 7 * 4;
                        } else {
                            f25 = f15;
                        }
                        if (i57 != 0) {
                            z27 = true;
                        } else {
                            z27 = z14;
                        }
                        if (i58 != 0) {
                            z28 = false;
                        } else {
                            z28 = z15;
                        }
                        f26 = f25;
                        if (i59 != 0) {
                            objM87133R = c28655q4.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C30654e(3);
                                c28655q4.m87172p0(objM87133R);
                            }
                            TextResource textResource7 = textResourceM21267a2;
                            interfaceC39332e18 = interfaceC39332e31;
                            textResource5 = textResource7;
                            i67 = i66;
                            interfaceC39332e19 = interfaceC39332e29;
                            f27 = f26;
                            interfaceC39332e20 = interfaceC39332e30;
                            f28 = f24;
                            interfaceC39332e21 = interfaceC39332eM125323a;
                            textResource6 = textResourceM21267a;
                            z29 = z26;
                            z34 = z28;
                            interfaceC39332e22 = interfaceC39332e15;
                            c39174f4 = c39174f3;
                            enumC30774g4 = enumC30774g3;
                            interfaceC39332e23 = interfaceC39332e16;
                            z35 = z25;
                            f29 = f19;
                            z36 = z27;
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                            modifier4 = modifier3;
                        } else {
                            boolean z48 = z27;
                            TextResource textResource8 = textResourceM21267a2;
                            interfaceC39332e18 = interfaceC39332e31;
                            textResource5 = textResource8;
                            i67 = i66;
                            interfaceC39332e19 = interfaceC39332e29;
                            f27 = f26;
                            interfaceC39332e20 = interfaceC39332e30;
                            f28 = f24;
                            interfaceC39332e21 = interfaceC39332eM125323a;
                            textResource6 = textResourceM21267a;
                            z29 = z26;
                            z34 = z28;
                            modifier4 = modifier3;
                            interfaceC39332e22 = interfaceC39332e15;
                            c39174f4 = c39174f3;
                            enumC30774g4 = enumC30774g3;
                            interfaceC39332e23 = interfaceC39332e16;
                            z35 = z25;
                            f29 = f19;
                            z36 = z48;
                        }
                        c28655q4.m87175r();
                        objM87133R3 = c28655q4.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC11266d.m30453g(c28655q4);
                        }
                        InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R3;
                        strM21274h = AbstractC8693b.m21274h(textResource5, c28655q4, (i67 >> 9) & 14);
                        TextResource textResource9 = textResource5;
                        fMo740m0 = ((InterfaceC39171c) c28655q4.m87161k(AbstractC2453v1.f9569h)).getFontScale();
                        f34 = f27 * fMo740m0;
                        if (f29 != null) {
                            fFloatValue = f29.floatValue();
                        } else {
                            if (z35) {
                                fFloatValue = 2.0f;
                            } else {
                                i68 = 4;
                                fFloatValue = 1.0f;
                            }
                            f35 = i68;
                            f36 = fFloatValue * f35 * fMo740m0;
                            if (z35) {
                                f37 = (((3 * f34) / f35) - (f36 / f35)) + f28;
                            } else {
                                float f43 = 2;
                                f37 = (f28 / f43) + ((f34 / f43) - (f36 / f43));
                            }
                            i69 = i67 >> 3;
                            f38 = f37;
                            i74 = i69 & 14;
                            InterfaceC39332e interfaceC39332e32 = interfaceC39332e21;
                            TextResource textResource10 = textResource6;
                            String str = "home_calendar_date_" + AbstractC8693b.m21274h(textResource6, c28655q4, i74);
                            C2314t c2314t = C2314t.f9131w;
                            Modifier modifierM44101d = AbstractC15676d.m44101d(c2314t, str);
                            InterfaceC13832v0 interfaceC13832v0 = (InterfaceC13832v0) c28655q4.m87161k(AbstractC1095d.f4515a);
                            if ((i64 & 29360128) == 8388608) {
                                z37 = true;
                            } else {
                                z37 = false;
                            }
                            boolean z49 = z37;
                            if ((1879048192 & i64) == 536870912) {
                                z38 = true;
                            } else {
                                z38 = false;
                            }
                            z39 = z49 | z38;
                            objM87133R4 = c28655q4.m87133R();
                            if (z39 || objM87133R4 == c28676v0) {
                                objM87133R4 = new C12203c(4, interfaceC4339a3, z36);
                                c28655q4.m87172p0(objM87133R4);
                            }
                            Modifier modifierMo3471e = AbstractC1102d.m3407d(1.0f, AbstractC1092a.m3360e(modifierM44101d, interfaceC21083i, interfaceC13832v0, false, null, (InterfaceC4339a) objM87133R4, 28)).mo3471e(modifier4);
                            zM87153g = c28655q4.m87153g(strM21274h);
                            Modifier modifier5 = modifier4;
                            objM87133R5 = c28655q4.m87133R();
                            if (zM87153g || objM87133R5 == c28676v0) {
                                objM87133R5 = new C17632d(strM21274h, 29);
                                c28655q4.m87172p0(objM87133R5);
                            }
                            Modifier modifierM51775c = AbstractC18032n.m51775c(modifierMo3471e, true, (Function1) objM87133R5);
                            C2307m c2307m = C2299e.f9102E;
                            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                            iHashCode = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q4.m87165m();
                            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q4, modifierM51775c);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q4.m87158i0();
                            boolean z52 = z36;
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(c0213j);
                            } else {
                                c28655q4.m87178s0();
                            }
                            C0209i c0209i2 = C0217k.f729g;
                            AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC39127r0M66763d);
                            C0209i c0209i3 = C0217k.f728f;
                            AbstractC28683x.m87239G(c28655q4, c0209i3, interfaceC28653p1M87165m);
                            c0209i = C0217k.f732j;
                            InterfaceC4339a interfaceC4339a4 = interfaceC4339a3;
                            if (c28655q4.f115903S) {
                                i75 = i74;
                            } else {
                                i75 = i74;
                                if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                                }
                                C0209i c0209i4 = C0217k.f726d;
                                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N);
                                if (interfaceC39332e22 != null || z34) {
                                    c28655q4.m87150e0(-1484429813);
                                    c28655q4.m87173q(false);
                                } else {
                                    c28655q4.m87150e0(-1484526874);
                                    m94542p(interfaceC39332e22, f34, enumC30774g4, c28655q4, (i67 >> 12) & 910);
                                    c28655q4.m87173q(false);
                                }
                                if (z34) {
                                    c28655q4.m87150e0(-1484387932);
                                    InterfaceC39332e interfaceC39332e33 = interfaceC39332e22;
                                    EnumC30774g enumC30774g6 = enumC30774g4;
                                    m94525A(fMo740m0, f28, interfaceC39332e33, interfaceC39332e17, f34, enumC30774g6, c28655q4, ((i64 >> 9) & 112) | ((i67 >> 6) & 896) | (i64 & 7168) | (i69 & 458752));
                                    f39 = f34;
                                    enumC30774g5 = enumC30774g6;
                                    c28655q2 = c28655q4;
                                    c28655q2.m87173q(false);
                                    interfaceC39332e24 = interfaceC39332e33;
                                } else {
                                    interfaceC39332e24 = interfaceC39332e22;
                                    c28655q2 = c28655q4;
                                    enumC30774g5 = enumC30774g4;
                                    f39 = f34;
                                    c28655q2.m87150e0(-1484258197);
                                    c28655q2.m87173q(false);
                                }
                                if (interfaceC39332e18 != null) {
                                    c28655q2.m87150e0(-1484207853);
                                    if (c39174f4 != null) {
                                        c28655q2.m87150e0(-1484170901);
                                        m94538l(c39174f4.f168413w * fMo740m0, interfaceC39332e18, c28655q2, (i64 >> 3) & 112);
                                        z47 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z47 = false;
                                        c28655q2.m87150e0(-1484069779);
                                        m94538l(f39, interfaceC39332e18, c28655q2, (i64 >> 3) & 112);
                                        c28655q2.m87173q(false);
                                    }
                                    c28655q2.m87173q(z47);
                                } else {
                                    c28655q2.m87150e0(-1483969525);
                                    c28655q2.m87173q(false);
                                }
                                if (interfaceC39332e17 != null) {
                                    c28655q2.m87150e0(-1483927334);
                                    boolean z54 = z29;
                                    InterfaceC39332e interfaceC39332e34 = interfaceC39332e17;
                                    m94540n(f39, z54, f28, interfaceC39332e34, c28655q2, (i64 & 7168) | ((i64 >> 12) & 112) | ((i64 >> 6) & 896));
                                    z44 = z54;
                                    interfaceC39332e25 = interfaceC39332e34;
                                    z45 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z44 = z29;
                                    interfaceC39332e25 = interfaceC39332e17;
                                    z45 = false;
                                    c28655q2.m87150e0(-1483818741);
                                    c28655q2.m87173q(false);
                                }
                                Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
                                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, z45);
                                boolean z55 = z44;
                                float f44 = f28;
                                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3407d);
                                c28655q2.m87158i0();
                                if (c28655q2.f115903S) {
                                    c28655q2.m87163l(c0213j);
                                } else {
                                    c28655q2.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC39127r0M66763d2);
                                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m2);
                                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                                }
                                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                                textResource3 = textResource10;
                                C39174f c39174f5 = c39174f4;
                                z46 = z45;
                                c28655q3 = c28655q2;
                                InterfaceC39332e interfaceC39332e35 = interfaceC39332e18;
                                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource3, c28655q2, i75), null, interfaceC39332e32.mo134584toComposableColorWaAFU9c(c28655q2, (i67 >> 6) & 14), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q2, 6).getN8(), null, c28655q3, 0, 0, 196602);
                                if (interfaceC39332e23 != null) {
                                    c28655q3.m87150e0(-1057261933);
                                    InterfaceC39332e interfaceC39332e36 = interfaceC39332e23;
                                    InterfaceC39332e interfaceC39332e37 = interfaceC39332e19;
                                    InterfaceC39332e interfaceC39332e38 = interfaceC39332e20;
                                    m94544r(interfaceC39332e36, interfaceC39332e37, interfaceC39332e38, f36, f38, c28655q3, (i67 >> 21) & 1022);
                                    interfaceC39332e26 = interfaceC39332e36;
                                    interfaceC39332e27 = interfaceC39332e37;
                                    interfaceC39332e28 = interfaceC39332e38;
                                    c28655q3.m87173q(z46);
                                } else {
                                    interfaceC39332e26 = interfaceC39332e23;
                                    interfaceC39332e27 = interfaceC39332e19;
                                    interfaceC39332e28 = interfaceC39332e20;
                                    c28655q3.m87150e0(-1056987087);
                                    c28655q3.m87173q(z46);
                                }
                                c28655q3.m87173q(true);
                                c28655q3.m87173q(true);
                                f16 = f44;
                                z18 = z55;
                                interfaceC39332e10 = interfaceC39332e25;
                                c39174f2 = c39174f5;
                                interfaceC39332e11 = interfaceC39332e32;
                                interfaceC39332e13 = interfaceC39332e35;
                                z19 = z52;
                                enumC30774g2 = enumC30774g5;
                                interfaceC4339a2 = interfaceC4339a4;
                                c28655q = c28655q3;
                                interfaceC39332e9 = interfaceC39332e27;
                                interfaceC39332e12 = interfaceC39332e28;
                                interfaceC39332e8 = interfaceC39332e26;
                                modifier2 = modifier5;
                                z17 = z35;
                                f18 = f29;
                                f17 = f27;
                                z24 = z34;
                                textResource4 = textResource9;
                                interfaceC39332e14 = interfaceC39332e24;
                            }
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                            C0209i c0209i5 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q4, c0209i5, modifierM118962N);
                            if (interfaceC39332e22 != null) {
                                c28655q4.m87150e0(-1484429813);
                                c28655q4.m87173q(false);
                            } else {
                                c28655q4.m87150e0(-1484429813);
                                c28655q4.m87173q(false);
                            }
                            if (z34) {
                                c28655q4.m87150e0(-1484387932);
                                InterfaceC39332e interfaceC39332e39 = interfaceC39332e22;
                                EnumC30774g enumC30774g7 = enumC30774g4;
                                m94525A(fMo740m0, f28, interfaceC39332e39, interfaceC39332e17, f34, enumC30774g7, c28655q4, ((i64 >> 9) & 112) | ((i67 >> 6) & 896) | (i64 & 7168) | (i69 & 458752));
                                f39 = f34;
                                enumC30774g5 = enumC30774g7;
                                c28655q2 = c28655q4;
                                c28655q2.m87173q(false);
                                interfaceC39332e24 = interfaceC39332e39;
                            } else {
                                interfaceC39332e24 = interfaceC39332e22;
                                c28655q2 = c28655q4;
                                enumC30774g5 = enumC30774g4;
                                f39 = f34;
                                c28655q2.m87150e0(-1484258197);
                                c28655q2.m87173q(false);
                            }
                            if (interfaceC39332e18 != null) {
                                c28655q2.m87150e0(-1484207853);
                                if (c39174f4 != null) {
                                    c28655q2.m87150e0(-1484170901);
                                    m94538l(c39174f4.f168413w * fMo740m0, interfaceC39332e18, c28655q2, (i64 >> 3) & 112);
                                    z47 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z47 = false;
                                    c28655q2.m87150e0(-1484069779);
                                    m94538l(f39, interfaceC39332e18, c28655q2, (i64 >> 3) & 112);
                                    c28655q2.m87173q(false);
                                }
                                c28655q2.m87173q(z47);
                            } else {
                                c28655q2.m87150e0(-1483969525);
                                c28655q2.m87173q(false);
                            }
                            if (interfaceC39332e17 != null) {
                                c28655q2.m87150e0(-1483927334);
                                boolean z56 = z29;
                                InterfaceC39332e interfaceC39332e310 = interfaceC39332e17;
                                m94540n(f39, z56, f28, interfaceC39332e310, c28655q2, (i64 & 7168) | ((i64 >> 12) & 112) | ((i64 >> 6) & 896));
                                z44 = z56;
                                interfaceC39332e25 = interfaceC39332e310;
                                z45 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z44 = z29;
                                interfaceC39332e25 = interfaceC39332e17;
                                z45 = false;
                                c28655q2.m87150e0(-1483818741);
                                c28655q2.m87173q(false);
                            }
                            Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, c2314t);
                            InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m, z45);
                            boolean z57 = z44;
                            float f45 = f28;
                            iHashCode2 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3407d2);
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC39127r0M66763d3);
                            AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m3);
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N3);
                            textResource3 = textResource10;
                            C39174f c39174f6 = c39174f4;
                            z46 = z45;
                            c28655q3 = c28655q2;
                            InterfaceC39332e interfaceC39332e311 = interfaceC39332e18;
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource3, c28655q2, i75), null, interfaceC39332e32.mo134584toComposableColorWaAFU9c(c28655q2, (i67 >> 6) & 14), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q2, 6).getN8(), null, c28655q3, 0, 0, 196602);
                            if (interfaceC39332e23 != null) {
                                c28655q3.m87150e0(-1057261933);
                                InterfaceC39332e interfaceC39332e312 = interfaceC39332e23;
                                InterfaceC39332e interfaceC39332e313 = interfaceC39332e19;
                                InterfaceC39332e interfaceC39332e314 = interfaceC39332e20;
                                m94544r(interfaceC39332e312, interfaceC39332e313, interfaceC39332e314, f36, f38, c28655q3, (i67 >> 21) & 1022);
                                interfaceC39332e26 = interfaceC39332e312;
                                interfaceC39332e27 = interfaceC39332e313;
                                interfaceC39332e28 = interfaceC39332e314;
                                c28655q3.m87173q(z46);
                            } else {
                                interfaceC39332e26 = interfaceC39332e23;
                                interfaceC39332e27 = interfaceC39332e19;
                                interfaceC39332e28 = interfaceC39332e20;
                                c28655q3.m87150e0(-1056987087);
                                c28655q3.m87173q(z46);
                            }
                            c28655q3.m87173q(true);
                            c28655q3.m87173q(true);
                            f16 = f45;
                            z18 = z57;
                            interfaceC39332e10 = interfaceC39332e25;
                            c39174f2 = c39174f6;
                            interfaceC39332e11 = interfaceC39332e32;
                            interfaceC39332e13 = interfaceC39332e311;
                            z19 = z52;
                            enumC30774g2 = enumC30774g5;
                            interfaceC4339a2 = interfaceC4339a4;
                            c28655q = c28655q3;
                            interfaceC39332e9 = interfaceC39332e27;
                            interfaceC39332e12 = interfaceC39332e28;
                            interfaceC39332e8 = interfaceC39332e26;
                            modifier2 = modifier5;
                            z17 = z35;
                            f18 = f29;
                            f17 = f27;
                            z24 = z34;
                            textResource4 = textResource9;
                            interfaceC39332e14 = interfaceC39332e24;
                        }
                        i68 = 4;
                        f35 = i68;
                        f36 = fFloatValue * f35 * fMo740m0;
                        if (z35) {
                            f37 = (((3 * f34) / f35) - (f36 / f35)) + f28;
                        } else {
                            float f46 = 2;
                            f37 = (f28 / f46) + ((f34 / f46) - (f36 / f46));
                        }
                        i69 = i67 >> 3;
                        f38 = f37;
                        i74 = i69 & 14;
                        InterfaceC39332e interfaceC39332e315 = interfaceC39332e21;
                        TextResource textResource11 = textResource6;
                        String str2 = "home_calendar_date_" + AbstractC8693b.m21274h(textResource6, c28655q4, i74);
                        C2314t c2314t2 = C2314t.f9131w;
                        Modifier modifierM44101d2 = AbstractC15676d.m44101d(c2314t2, str2);
                        InterfaceC13832v0 interfaceC13832v1 = (InterfaceC13832v0) c28655q4.m87161k(AbstractC1095d.f4515a);
                        if ((i64 & 29360128) == 8388608) {
                            z37 = true;
                        } else {
                            z37 = false;
                        }
                        boolean z410 = z37;
                        if ((1879048192 & i64) == 536870912) {
                            z38 = true;
                        } else {
                            z38 = false;
                        }
                        z39 = z410 | z38;
                        objM87133R4 = c28655q4.m87133R();
                        if (z39) {
                            objM87133R4 = new C12203c(4, interfaceC4339a3, z36);
                            c28655q4.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C12203c(4, interfaceC4339a3, z36);
                            c28655q4.m87172p0(objM87133R4);
                        }
                        Modifier modifierMo3471e2 = AbstractC1102d.m3407d(1.0f, AbstractC1092a.m3360e(modifierM44101d2, interfaceC21083i, interfaceC13832v1, false, null, (InterfaceC4339a) objM87133R4, 28)).mo3471e(modifier4);
                        zM87153g = c28655q4.m87153g(strM21274h);
                        Modifier modifier6 = modifier4;
                        objM87133R5 = c28655q4.m87133R();
                        if (zM87153g) {
                            objM87133R5 = new C17632d(strM21274h, 29);
                            c28655q4.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new C17632d(strM21274h, 29);
                            c28655q4.m87172p0(objM87133R5);
                        }
                        Modifier modifierM51775c2 = AbstractC18032n.m51775c(modifierMo3471e2, true, (Function1) objM87133R5);
                        C2307m c2307m2 = C2299e.f9102E;
                        InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m2, false);
                        iHashCode = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q4.m87165m();
                        Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q4, modifierM51775c2);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q4.m87158i0();
                        boolean z58 = z36;
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j);
                        } else {
                            c28655q4.m87178s0();
                        }
                        C0209i c0209i6 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q4, c0209i6, interfaceC39127r0M66763d4);
                        C0209i c0209i7 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q4, c0209i7, interfaceC28653p1M87165m4);
                        c0209i = C0217k.f732j;
                        InterfaceC4339a interfaceC4339a5 = interfaceC4339a3;
                        if (c28655q4.f115903S) {
                            i75 = i74;
                            if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                            }
                            C0209i c0209i8 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q4, c0209i8, modifierM118962N4);
                            if (interfaceC39332e22 != null) {
                                c28655q4.m87150e0(-1484429813);
                                c28655q4.m87173q(false);
                            } else {
                                c28655q4.m87150e0(-1484429813);
                                c28655q4.m87173q(false);
                            }
                            if (z34) {
                                c28655q4.m87150e0(-1484387932);
                                InterfaceC39332e interfaceC39332e316 = interfaceC39332e22;
                                EnumC30774g enumC30774g8 = enumC30774g4;
                                m94525A(fMo740m0, f28, interfaceC39332e316, interfaceC39332e17, f34, enumC30774g8, c28655q4, ((i64 >> 9) & 112) | ((i67 >> 6) & 896) | (i64 & 7168) | (i69 & 458752));
                                f39 = f34;
                                enumC30774g5 = enumC30774g8;
                                c28655q2 = c28655q4;
                                c28655q2.m87173q(false);
                                interfaceC39332e24 = interfaceC39332e316;
                            } else {
                                interfaceC39332e24 = interfaceC39332e22;
                                c28655q2 = c28655q4;
                                enumC30774g5 = enumC30774g4;
                                f39 = f34;
                                c28655q2.m87150e0(-1484258197);
                                c28655q2.m87173q(false);
                            }
                            if (interfaceC39332e18 != null) {
                                c28655q2.m87150e0(-1484207853);
                                if (c39174f4 != null) {
                                    c28655q2.m87150e0(-1484170901);
                                    m94538l(c39174f4.f168413w * fMo740m0, interfaceC39332e18, c28655q2, (i64 >> 3) & 112);
                                    z47 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z47 = false;
                                    c28655q2.m87150e0(-1484069779);
                                    m94538l(f39, interfaceC39332e18, c28655q2, (i64 >> 3) & 112);
                                    c28655q2.m87173q(false);
                                }
                                c28655q2.m87173q(z47);
                            } else {
                                c28655q2.m87150e0(-1483969525);
                                c28655q2.m87173q(false);
                            }
                            if (interfaceC39332e17 != null) {
                                c28655q2.m87150e0(-1483927334);
                                boolean z59 = z29;
                                InterfaceC39332e interfaceC39332e317 = interfaceC39332e17;
                                m94540n(f39, z59, f28, interfaceC39332e317, c28655q2, (i64 & 7168) | ((i64 >> 12) & 112) | ((i64 >> 6) & 896));
                                z44 = z59;
                                interfaceC39332e25 = interfaceC39332e317;
                                z45 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z44 = z29;
                                interfaceC39332e25 = interfaceC39332e17;
                                z45 = false;
                                c28655q2.m87150e0(-1483818741);
                                c28655q2.m87173q(false);
                            }
                            Modifier modifierM3407d3 = AbstractC1102d.m3407d(1.0f, c2314t2);
                            InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(c2307m2, z45);
                            boolean z510 = z44;
                            float f47 = f28;
                            iHashCode2 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM3407d3);
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC39127r0M66763d5);
                            AbstractC28683x.m87239G(c28655q2, c0209i7, interfaceC28653p1M87165m5);
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i8, modifierM118962N5);
                            textResource3 = textResource11;
                            C39174f c39174f7 = c39174f4;
                            z46 = z45;
                            c28655q3 = c28655q2;
                            InterfaceC39332e interfaceC39332e318 = interfaceC39332e18;
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource3, c28655q2, i75), null, interfaceC39332e315.mo134584toComposableColorWaAFU9c(c28655q2, (i67 >> 6) & 14), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q2, 6).getN8(), null, c28655q3, 0, 0, 196602);
                            if (interfaceC39332e23 != null) {
                                c28655q3.m87150e0(-1057261933);
                                InterfaceC39332e interfaceC39332e319 = interfaceC39332e23;
                                InterfaceC39332e interfaceC39332e3110 = interfaceC39332e19;
                                InterfaceC39332e interfaceC39332e3111 = interfaceC39332e20;
                                m94544r(interfaceC39332e319, interfaceC39332e3110, interfaceC39332e3111, f36, f38, c28655q3, (i67 >> 21) & 1022);
                                interfaceC39332e26 = interfaceC39332e319;
                                interfaceC39332e27 = interfaceC39332e3110;
                                interfaceC39332e28 = interfaceC39332e3111;
                                c28655q3.m87173q(z46);
                            } else {
                                interfaceC39332e26 = interfaceC39332e23;
                                interfaceC39332e27 = interfaceC39332e19;
                                interfaceC39332e28 = interfaceC39332e20;
                                c28655q3.m87150e0(-1056987087);
                                c28655q3.m87173q(z46);
                            }
                            c28655q3.m87173q(true);
                            c28655q3.m87173q(true);
                            f16 = f47;
                            z18 = z510;
                            interfaceC39332e10 = interfaceC39332e25;
                            c39174f2 = c39174f7;
                            interfaceC39332e11 = interfaceC39332e315;
                            interfaceC39332e13 = interfaceC39332e318;
                            z19 = z58;
                            enumC30774g2 = enumC30774g5;
                            interfaceC4339a2 = interfaceC4339a5;
                            c28655q = c28655q3;
                            interfaceC39332e9 = interfaceC39332e27;
                            interfaceC39332e12 = interfaceC39332e28;
                            interfaceC39332e8 = interfaceC39332e26;
                            modifier2 = modifier6;
                            z17 = z35;
                            f18 = f29;
                            f17 = f27;
                            z24 = z34;
                            textResource4 = textResource9;
                            interfaceC39332e14 = interfaceC39332e24;
                        } else {
                            i75 = i74;
                        }
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        C0209i c0209i9 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q4, c0209i9, modifierM118962N4);
                        if (interfaceC39332e22 != null) {
                            c28655q4.m87150e0(-1484429813);
                            c28655q4.m87173q(false);
                        } else {
                            c28655q4.m87150e0(-1484429813);
                            c28655q4.m87173q(false);
                        }
                        if (z34) {
                            c28655q4.m87150e0(-1484387932);
                            InterfaceC39332e interfaceC39332e3112 = interfaceC39332e22;
                            EnumC30774g enumC30774g9 = enumC30774g4;
                            m94525A(fMo740m0, f28, interfaceC39332e3112, interfaceC39332e17, f34, enumC30774g9, c28655q4, ((i64 >> 9) & 112) | ((i67 >> 6) & 896) | (i64 & 7168) | (i69 & 458752));
                            f39 = f34;
                            enumC30774g5 = enumC30774g9;
                            c28655q2 = c28655q4;
                            c28655q2.m87173q(false);
                            interfaceC39332e24 = interfaceC39332e3112;
                        } else {
                            interfaceC39332e24 = interfaceC39332e22;
                            c28655q2 = c28655q4;
                            enumC30774g5 = enumC30774g4;
                            f39 = f34;
                            c28655q2.m87150e0(-1484258197);
                            c28655q2.m87173q(false);
                        }
                        if (interfaceC39332e18 != null) {
                            c28655q2.m87150e0(-1484207853);
                            if (c39174f4 != null) {
                                c28655q2.m87150e0(-1484170901);
                                m94538l(c39174f4.f168413w * fMo740m0, interfaceC39332e18, c28655q2, (i64 >> 3) & 112);
                                z47 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z47 = false;
                                c28655q2.m87150e0(-1484069779);
                                m94538l(f39, interfaceC39332e18, c28655q2, (i64 >> 3) & 112);
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(z47);
                        } else {
                            c28655q2.m87150e0(-1483969525);
                            c28655q2.m87173q(false);
                        }
                        if (interfaceC39332e17 != null) {
                            c28655q2.m87150e0(-1483927334);
                            boolean z511 = z29;
                            InterfaceC39332e interfaceC39332e3113 = interfaceC39332e17;
                            m94540n(f39, z511, f28, interfaceC39332e3113, c28655q2, (i64 & 7168) | ((i64 >> 12) & 112) | ((i64 >> 6) & 896));
                            z44 = z511;
                            interfaceC39332e25 = interfaceC39332e3113;
                            z45 = false;
                            c28655q2.m87173q(false);
                        } else {
                            z44 = z29;
                            interfaceC39332e25 = interfaceC39332e17;
                            z45 = false;
                            c28655q2.m87150e0(-1483818741);
                            c28655q2.m87173q(false);
                        }
                        Modifier modifierM3407d4 = AbstractC1102d.m3407d(1.0f, c2314t2);
                        InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(c2307m2, z45);
                        boolean z512 = z44;
                        float f48 = f28;
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
                        Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierM3407d4);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC39127r0M66763d6);
                        AbstractC28683x.m87239G(c28655q2, c0209i7, interfaceC28653p1M87165m6);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i9, modifierM118962N6);
                        textResource3 = textResource11;
                        C39174f c39174f8 = c39174f4;
                        z46 = z45;
                        c28655q3 = c28655q2;
                        InterfaceC39332e interfaceC39332e3114 = interfaceC39332e18;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource3, c28655q2, i75), null, interfaceC39332e315.mo134584toComposableColorWaAFU9c(c28655q2, (i67 >> 6) & 14), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q2, 6).getN8(), null, c28655q3, 0, 0, 196602);
                        if (interfaceC39332e23 != null) {
                            c28655q3.m87150e0(-1057261933);
                            InterfaceC39332e interfaceC39332e3115 = interfaceC39332e23;
                            InterfaceC39332e interfaceC39332e3116 = interfaceC39332e19;
                            InterfaceC39332e interfaceC39332e3117 = interfaceC39332e20;
                            m94544r(interfaceC39332e3115, interfaceC39332e3116, interfaceC39332e3117, f36, f38, c28655q3, (i67 >> 21) & 1022);
                            interfaceC39332e26 = interfaceC39332e3115;
                            interfaceC39332e27 = interfaceC39332e3116;
                            interfaceC39332e28 = interfaceC39332e3117;
                            c28655q3.m87173q(z46);
                        } else {
                            interfaceC39332e26 = interfaceC39332e23;
                            interfaceC39332e27 = interfaceC39332e19;
                            interfaceC39332e28 = interfaceC39332e20;
                            c28655q3.m87150e0(-1056987087);
                            c28655q3.m87173q(z46);
                        }
                        c28655q3.m87173q(true);
                        c28655q3.m87173q(true);
                        f16 = f48;
                        z18 = z512;
                        interfaceC39332e10 = interfaceC39332e25;
                        c39174f2 = c39174f8;
                        interfaceC39332e11 = interfaceC39332e315;
                        interfaceC39332e13 = interfaceC39332e3114;
                        z19 = z58;
                        enumC30774g2 = enumC30774g5;
                        interfaceC4339a2 = interfaceC4339a5;
                        c28655q = c28655q3;
                        interfaceC39332e9 = interfaceC39332e27;
                        interfaceC39332e12 = interfaceC39332e28;
                        interfaceC39332e8 = interfaceC39332e26;
                        modifier2 = modifier6;
                        z17 = z35;
                        f18 = f29;
                        f17 = f27;
                        z24 = z34;
                        textResource4 = textResource9;
                        interfaceC39332e14 = interfaceC39332e24;
                    } else {
                        c28655q4.m87138X();
                        if ((i15 & 2) != 0) {
                            i16 &= -113;
                        }
                        if ((i15 & 4) != 0) {
                            i16 &= -897;
                        }
                        if ((i15 & 8) != 0) {
                            i16 &= -7169;
                        }
                        TextResource textResource12 = textResourceM21267a2;
                        interfaceC39332e18 = interfaceC39332e31;
                        textResource5 = textResource12;
                        modifier4 = modifier;
                        c39174f4 = c39174f;
                        interfaceC39332e23 = interfaceC39332e3;
                        z35 = z4;
                        f29 = f13;
                        f28 = f14;
                        z29 = z13;
                        f27 = f15;
                        z36 = z14;
                        z34 = z15;
                        interfaceC39332e19 = interfaceC39332e29;
                        interfaceC39332e20 = interfaceC39332e30;
                        interfaceC39332e17 = interfaceC39332e7;
                        textResource6 = textResourceM21267a;
                        i67 = i16;
                        interfaceC39332e21 = interfaceC39332e;
                        interfaceC39332e22 = interfaceC39332e2;
                        enumC30774g4 = enumC30774g;
                    }
                    interfaceC4339a3 = interfaceC4339a;
                    c28655q4.m87175r();
                    objM87133R3 = c28655q4.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC11266d.m30453g(c28655q4);
                    }
                    InterfaceC21083i interfaceC21083i2 = (InterfaceC21083i) objM87133R3;
                    strM21274h = AbstractC8693b.m21274h(textResource5, c28655q4, (i67 >> 9) & 14);
                    TextResource textResource13 = textResource5;
                    fMo740m0 = ((InterfaceC39171c) c28655q4.m87161k(AbstractC2453v1.f9569h)).getFontScale();
                    f34 = f27 * fMo740m0;
                    if (f29 != null) {
                        fFloatValue = f29.floatValue();
                    } else {
                        if (z35) {
                            fFloatValue = 2.0f;
                        } else {
                            i68 = 4;
                            fFloatValue = 1.0f;
                        }
                        f35 = i68;
                        f36 = fFloatValue * f35 * fMo740m0;
                        if (z35) {
                            f37 = (((3 * f34) / f35) - (f36 / f35)) + f28;
                        } else {
                            float f49 = 2;
                            f37 = (f28 / f49) + ((f34 / f49) - (f36 / f49));
                        }
                        i69 = i67 >> 3;
                        f38 = f37;
                        i74 = i69 & 14;
                        InterfaceC39332e interfaceC39332e3118 = interfaceC39332e21;
                        TextResource textResource14 = textResource6;
                        String str3 = "home_calendar_date_" + AbstractC8693b.m21274h(textResource6, c28655q4, i74);
                        C2314t c2314t3 = C2314t.f9131w;
                        Modifier modifierM44101d3 = AbstractC15676d.m44101d(c2314t3, str3);
                        InterfaceC13832v0 interfaceC13832v2 = (InterfaceC13832v0) c28655q4.m87161k(AbstractC1095d.f4515a);
                        if ((i64 & 29360128) == 8388608) {
                            z37 = true;
                        } else {
                            z37 = false;
                        }
                        boolean z411 = z37;
                        if ((1879048192 & i64) == 536870912) {
                            z38 = true;
                        } else {
                            z38 = false;
                        }
                        z39 = z411 | z38;
                        objM87133R4 = c28655q4.m87133R();
                        if (z39) {
                            objM87133R4 = new C12203c(4, interfaceC4339a3, z36);
                            c28655q4.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C12203c(4, interfaceC4339a3, z36);
                            c28655q4.m87172p0(objM87133R4);
                        }
                        Modifier modifierMo3471e3 = AbstractC1102d.m3407d(1.0f, AbstractC1092a.m3360e(modifierM44101d3, interfaceC21083i2, interfaceC13832v2, false, null, (InterfaceC4339a) objM87133R4, 28)).mo3471e(modifier4);
                        zM87153g = c28655q4.m87153g(strM21274h);
                        Modifier modifier7 = modifier4;
                        objM87133R5 = c28655q4.m87133R();
                        if (zM87153g) {
                            objM87133R5 = new C17632d(strM21274h, 29);
                            c28655q4.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new C17632d(strM21274h, 29);
                            c28655q4.m87172p0(objM87133R5);
                        }
                        Modifier modifierM51775c3 = AbstractC18032n.m51775c(modifierMo3471e3, true, (Function1) objM87133R5);
                        C2307m c2307m3 = C2299e.f9102E;
                        InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(c2307m3, false);
                        iHashCode = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q4.m87165m();
                        Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q4, modifierM51775c3);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q4.m87158i0();
                        boolean z513 = z36;
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j);
                        } else {
                            c28655q4.m87178s0();
                        }
                        C0209i c0209i10 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q4, c0209i10, interfaceC39127r0M66763d7);
                        C0209i c0209i11 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q4, c0209i11, interfaceC28653p1M87165m7);
                        c0209i = C0217k.f732j;
                        InterfaceC4339a interfaceC4339a6 = interfaceC4339a3;
                        if (c28655q4.f115903S) {
                            i75 = i74;
                            if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                            }
                            C0209i c0209i12 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q4, c0209i12, modifierM118962N7);
                            if (interfaceC39332e22 != null) {
                                c28655q4.m87150e0(-1484429813);
                                c28655q4.m87173q(false);
                            } else {
                                c28655q4.m87150e0(-1484429813);
                                c28655q4.m87173q(false);
                            }
                            if (z34) {
                                c28655q4.m87150e0(-1484387932);
                                InterfaceC39332e interfaceC39332e3119 = interfaceC39332e22;
                                EnumC30774g enumC30774g10 = enumC30774g4;
                                m94525A(fMo740m0, f28, interfaceC39332e3119, interfaceC39332e17, f34, enumC30774g10, c28655q4, ((i64 >> 9) & 112) | ((i67 >> 6) & 896) | (i64 & 7168) | (i69 & 458752));
                                f39 = f34;
                                enumC30774g5 = enumC30774g10;
                                c28655q2 = c28655q4;
                                c28655q2.m87173q(false);
                                interfaceC39332e24 = interfaceC39332e3119;
                            } else {
                                interfaceC39332e24 = interfaceC39332e22;
                                c28655q2 = c28655q4;
                                enumC30774g5 = enumC30774g4;
                                f39 = f34;
                                c28655q2.m87150e0(-1484258197);
                                c28655q2.m87173q(false);
                            }
                            if (interfaceC39332e18 != null) {
                                c28655q2.m87150e0(-1484207853);
                                if (c39174f4 != null) {
                                    c28655q2.m87150e0(-1484170901);
                                    m94538l(c39174f4.f168413w * fMo740m0, interfaceC39332e18, c28655q2, (i64 >> 3) & 112);
                                    z47 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z47 = false;
                                    c28655q2.m87150e0(-1484069779);
                                    m94538l(f39, interfaceC39332e18, c28655q2, (i64 >> 3) & 112);
                                    c28655q2.m87173q(false);
                                }
                                c28655q2.m87173q(z47);
                            } else {
                                c28655q2.m87150e0(-1483969525);
                                c28655q2.m87173q(false);
                            }
                            if (interfaceC39332e17 != null) {
                                c28655q2.m87150e0(-1483927334);
                                boolean z514 = z29;
                                InterfaceC39332e interfaceC39332e31110 = interfaceC39332e17;
                                m94540n(f39, z514, f28, interfaceC39332e31110, c28655q2, (i64 & 7168) | ((i64 >> 12) & 112) | ((i64 >> 6) & 896));
                                z44 = z514;
                                interfaceC39332e25 = interfaceC39332e31110;
                                z45 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z44 = z29;
                                interfaceC39332e25 = interfaceC39332e17;
                                z45 = false;
                                c28655q2.m87150e0(-1483818741);
                                c28655q2.m87173q(false);
                            }
                            Modifier modifierM3407d5 = AbstractC1102d.m3407d(1.0f, c2314t3);
                            InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(c2307m3, z45);
                            boolean z515 = z44;
                            float f410 = f28;
                            iHashCode2 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q2.m87165m();
                            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q2, modifierM3407d5);
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i10, interfaceC39127r0M66763d8);
                            AbstractC28683x.m87239G(c28655q2, c0209i11, interfaceC28653p1M87165m8);
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i12, modifierM118962N8);
                            textResource3 = textResource14;
                            C39174f c39174f9 = c39174f4;
                            z46 = z45;
                            c28655q3 = c28655q2;
                            InterfaceC39332e interfaceC39332e31111 = interfaceC39332e18;
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource3, c28655q2, i75), null, interfaceC39332e3118.mo134584toComposableColorWaAFU9c(c28655q2, (i67 >> 6) & 14), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q2, 6).getN8(), null, c28655q3, 0, 0, 196602);
                            if (interfaceC39332e23 != null) {
                                c28655q3.m87150e0(-1057261933);
                                InterfaceC39332e interfaceC39332e31112 = interfaceC39332e23;
                                InterfaceC39332e interfaceC39332e31113 = interfaceC39332e19;
                                InterfaceC39332e interfaceC39332e31114 = interfaceC39332e20;
                                m94544r(interfaceC39332e31112, interfaceC39332e31113, interfaceC39332e31114, f36, f38, c28655q3, (i67 >> 21) & 1022);
                                interfaceC39332e26 = interfaceC39332e31112;
                                interfaceC39332e27 = interfaceC39332e31113;
                                interfaceC39332e28 = interfaceC39332e31114;
                                c28655q3.m87173q(z46);
                            } else {
                                interfaceC39332e26 = interfaceC39332e23;
                                interfaceC39332e27 = interfaceC39332e19;
                                interfaceC39332e28 = interfaceC39332e20;
                                c28655q3.m87150e0(-1056987087);
                                c28655q3.m87173q(z46);
                            }
                            c28655q3.m87173q(true);
                            c28655q3.m87173q(true);
                            f16 = f410;
                            z18 = z515;
                            interfaceC39332e10 = interfaceC39332e25;
                            c39174f2 = c39174f9;
                            interfaceC39332e11 = interfaceC39332e3118;
                            interfaceC39332e13 = interfaceC39332e31111;
                            z19 = z513;
                            enumC30774g2 = enumC30774g5;
                            interfaceC4339a2 = interfaceC4339a6;
                            c28655q = c28655q3;
                            interfaceC39332e9 = interfaceC39332e27;
                            interfaceC39332e12 = interfaceC39332e28;
                            interfaceC39332e8 = interfaceC39332e26;
                            modifier2 = modifier7;
                            z17 = z35;
                            f18 = f29;
                            f17 = f27;
                            z24 = z34;
                            textResource4 = textResource13;
                            interfaceC39332e14 = interfaceC39332e24;
                        } else {
                            i75 = i74;
                        }
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        C0209i c0209i13 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q4, c0209i13, modifierM118962N7);
                        if (interfaceC39332e22 != null) {
                            c28655q4.m87150e0(-1484429813);
                            c28655q4.m87173q(false);
                        } else {
                            c28655q4.m87150e0(-1484429813);
                            c28655q4.m87173q(false);
                        }
                        if (z34) {
                            c28655q4.m87150e0(-1484387932);
                            InterfaceC39332e interfaceC39332e31115 = interfaceC39332e22;
                            EnumC30774g enumC30774g11 = enumC30774g4;
                            m94525A(fMo740m0, f28, interfaceC39332e31115, interfaceC39332e17, f34, enumC30774g11, c28655q4, ((i64 >> 9) & 112) | ((i67 >> 6) & 896) | (i64 & 7168) | (i69 & 458752));
                            f39 = f34;
                            enumC30774g5 = enumC30774g11;
                            c28655q2 = c28655q4;
                            c28655q2.m87173q(false);
                            interfaceC39332e24 = interfaceC39332e31115;
                        } else {
                            interfaceC39332e24 = interfaceC39332e22;
                            c28655q2 = c28655q4;
                            enumC30774g5 = enumC30774g4;
                            f39 = f34;
                            c28655q2.m87150e0(-1484258197);
                            c28655q2.m87173q(false);
                        }
                        if (interfaceC39332e18 != null) {
                            c28655q2.m87150e0(-1484207853);
                            if (c39174f4 != null) {
                                c28655q2.m87150e0(-1484170901);
                                m94538l(c39174f4.f168413w * fMo740m0, interfaceC39332e18, c28655q2, (i64 >> 3) & 112);
                                z47 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z47 = false;
                                c28655q2.m87150e0(-1484069779);
                                m94538l(f39, interfaceC39332e18, c28655q2, (i64 >> 3) & 112);
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(z47);
                        } else {
                            c28655q2.m87150e0(-1483969525);
                            c28655q2.m87173q(false);
                        }
                        if (interfaceC39332e17 != null) {
                            c28655q2.m87150e0(-1483927334);
                            boolean z516 = z29;
                            InterfaceC39332e interfaceC39332e31116 = interfaceC39332e17;
                            m94540n(f39, z516, f28, interfaceC39332e31116, c28655q2, (i64 & 7168) | ((i64 >> 12) & 112) | ((i64 >> 6) & 896));
                            z44 = z516;
                            interfaceC39332e25 = interfaceC39332e31116;
                            z45 = false;
                            c28655q2.m87173q(false);
                        } else {
                            z44 = z29;
                            interfaceC39332e25 = interfaceC39332e17;
                            z45 = false;
                            c28655q2.m87150e0(-1483818741);
                            c28655q2.m87173q(false);
                        }
                        Modifier modifierM3407d6 = AbstractC1102d.m3407d(1.0f, c2314t3);
                        InterfaceC39127r0 interfaceC39127r0M66763d9 = AbstractC22989q.m66763d(c2307m3, z45);
                        boolean z517 = z44;
                        float f411 = f28;
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q2.m87165m();
                        Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q2, modifierM3407d6);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i10, interfaceC39127r0M66763d9);
                        AbstractC28683x.m87239G(c28655q2, c0209i11, interfaceC28653p1M87165m9);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i13, modifierM118962N9);
                        textResource3 = textResource14;
                        C39174f c39174f10 = c39174f4;
                        z46 = z45;
                        c28655q3 = c28655q2;
                        InterfaceC39332e interfaceC39332e31117 = interfaceC39332e18;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource3, c28655q2, i75), null, interfaceC39332e3118.mo134584toComposableColorWaAFU9c(c28655q2, (i67 >> 6) & 14), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q2, 6).getN8(), null, c28655q3, 0, 0, 196602);
                        if (interfaceC39332e23 != null) {
                            c28655q3.m87150e0(-1057261933);
                            InterfaceC39332e interfaceC39332e31118 = interfaceC39332e23;
                            InterfaceC39332e interfaceC39332e31119 = interfaceC39332e19;
                            InterfaceC39332e interfaceC39332e311110 = interfaceC39332e20;
                            m94544r(interfaceC39332e31118, interfaceC39332e31119, interfaceC39332e311110, f36, f38, c28655q3, (i67 >> 21) & 1022);
                            interfaceC39332e26 = interfaceC39332e31118;
                            interfaceC39332e27 = interfaceC39332e31119;
                            interfaceC39332e28 = interfaceC39332e311110;
                            c28655q3.m87173q(z46);
                        } else {
                            interfaceC39332e26 = interfaceC39332e23;
                            interfaceC39332e27 = interfaceC39332e19;
                            interfaceC39332e28 = interfaceC39332e20;
                            c28655q3.m87150e0(-1056987087);
                            c28655q3.m87173q(z46);
                        }
                        c28655q3.m87173q(true);
                        c28655q3.m87173q(true);
                        f16 = f411;
                        z18 = z517;
                        interfaceC39332e10 = interfaceC39332e25;
                        c39174f2 = c39174f10;
                        interfaceC39332e11 = interfaceC39332e3118;
                        interfaceC39332e13 = interfaceC39332e31117;
                        z19 = z513;
                        enumC30774g2 = enumC30774g5;
                        interfaceC4339a2 = interfaceC4339a6;
                        c28655q = c28655q3;
                        interfaceC39332e9 = interfaceC39332e27;
                        interfaceC39332e12 = interfaceC39332e28;
                        interfaceC39332e8 = interfaceC39332e26;
                        modifier2 = modifier7;
                        z17 = z35;
                        f18 = f29;
                        f17 = f27;
                        z24 = z34;
                        textResource4 = textResource13;
                        interfaceC39332e14 = interfaceC39332e24;
                    }
                    i68 = 4;
                    f35 = i68;
                    f36 = fFloatValue * f35 * fMo740m0;
                    if (z35) {
                        f37 = (((3 * f34) / f35) - (f36 / f35)) + f28;
                    } else {
                        float f412 = 2;
                        f37 = (f28 / f412) + ((f34 / f412) - (f36 / f412));
                    }
                    i69 = i67 >> 3;
                    f38 = f37;
                    i74 = i69 & 14;
                    InterfaceC39332e interfaceC39332e31120 = interfaceC39332e21;
                    TextResource textResource15 = textResource6;
                    String str4 = "home_calendar_date_" + AbstractC8693b.m21274h(textResource6, c28655q4, i74);
                    C2314t c2314t4 = C2314t.f9131w;
                    Modifier modifierM44101d4 = AbstractC15676d.m44101d(c2314t4, str4);
                    InterfaceC13832v0 interfaceC13832v3 = (InterfaceC13832v0) c28655q4.m87161k(AbstractC1095d.f4515a);
                    if ((i64 & 29360128) == 8388608) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    boolean z412 = z37;
                    if ((1879048192 & i64) == 536870912) {
                        z38 = true;
                    } else {
                        z38 = false;
                    }
                    z39 = z412 | z38;
                    objM87133R4 = c28655q4.m87133R();
                    if (z39) {
                        objM87133R4 = new C12203c(4, interfaceC4339a3, z36);
                        c28655q4.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C12203c(4, interfaceC4339a3, z36);
                        c28655q4.m87172p0(objM87133R4);
                    }
                    Modifier modifierMo3471e4 = AbstractC1102d.m3407d(1.0f, AbstractC1092a.m3360e(modifierM44101d4, interfaceC21083i2, interfaceC13832v3, false, null, (InterfaceC4339a) objM87133R4, 28)).mo3471e(modifier4);
                    zM87153g = c28655q4.m87153g(strM21274h);
                    Modifier modifier8 = modifier4;
                    objM87133R5 = c28655q4.m87133R();
                    if (zM87153g) {
                        objM87133R5 = new C17632d(strM21274h, 29);
                        c28655q4.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new C17632d(strM21274h, 29);
                        c28655q4.m87172p0(objM87133R5);
                    }
                    Modifier modifierM51775c4 = AbstractC18032n.m51775c(modifierMo3471e4, true, (Function1) objM87133R5);
                    C2307m c2307m4 = C2299e.f9102E;
                    InterfaceC39127r0 interfaceC39127r0M66763d10 = AbstractC22989q.m66763d(c2307m4, false);
                    iHashCode = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q4.m87165m();
                    Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q4, modifierM51775c4);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q4.m87158i0();
                    boolean z518 = z36;
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    C0209i c0209i14 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q4, c0209i14, interfaceC39127r0M66763d10);
                    C0209i c0209i15 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q4, c0209i15, interfaceC28653p1M87165m10);
                    c0209i = C0217k.f732j;
                    InterfaceC4339a interfaceC4339a7 = interfaceC4339a3;
                    if (c28655q4.f115903S) {
                        i75 = i74;
                        if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i16 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q4, c0209i16, modifierM118962N10);
                        if (interfaceC39332e22 != null) {
                            c28655q4.m87150e0(-1484429813);
                            c28655q4.m87173q(false);
                        } else {
                            c28655q4.m87150e0(-1484429813);
                            c28655q4.m87173q(false);
                        }
                        if (z34) {
                            c28655q4.m87150e0(-1484387932);
                            InterfaceC39332e interfaceC39332e311111 = interfaceC39332e22;
                            EnumC30774g enumC30774g12 = enumC30774g4;
                            m94525A(fMo740m0, f28, interfaceC39332e311111, interfaceC39332e17, f34, enumC30774g12, c28655q4, ((i64 >> 9) & 112) | ((i67 >> 6) & 896) | (i64 & 7168) | (i69 & 458752));
                            f39 = f34;
                            enumC30774g5 = enumC30774g12;
                            c28655q2 = c28655q4;
                            c28655q2.m87173q(false);
                            interfaceC39332e24 = interfaceC39332e311111;
                        } else {
                            interfaceC39332e24 = interfaceC39332e22;
                            c28655q2 = c28655q4;
                            enumC30774g5 = enumC30774g4;
                            f39 = f34;
                            c28655q2.m87150e0(-1484258197);
                            c28655q2.m87173q(false);
                        }
                        if (interfaceC39332e18 != null) {
                            c28655q2.m87150e0(-1484207853);
                            if (c39174f4 != null) {
                                c28655q2.m87150e0(-1484170901);
                                m94538l(c39174f4.f168413w * fMo740m0, interfaceC39332e18, c28655q2, (i64 >> 3) & 112);
                                z47 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z47 = false;
                                c28655q2.m87150e0(-1484069779);
                                m94538l(f39, interfaceC39332e18, c28655q2, (i64 >> 3) & 112);
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(z47);
                        } else {
                            c28655q2.m87150e0(-1483969525);
                            c28655q2.m87173q(false);
                        }
                        if (interfaceC39332e17 != null) {
                            c28655q2.m87150e0(-1483927334);
                            boolean z519 = z29;
                            InterfaceC39332e interfaceC39332e311112 = interfaceC39332e17;
                            m94540n(f39, z519, f28, interfaceC39332e311112, c28655q2, (i64 & 7168) | ((i64 >> 12) & 112) | ((i64 >> 6) & 896));
                            z44 = z519;
                            interfaceC39332e25 = interfaceC39332e311112;
                            z45 = false;
                            c28655q2.m87173q(false);
                        } else {
                            z44 = z29;
                            interfaceC39332e25 = interfaceC39332e17;
                            z45 = false;
                            c28655q2.m87150e0(-1483818741);
                            c28655q2.m87173q(false);
                        }
                        Modifier modifierM3407d7 = AbstractC1102d.m3407d(1.0f, c2314t4);
                        InterfaceC39127r0 interfaceC39127r0M66763d11 = AbstractC22989q.m66763d(c2307m4, z45);
                        boolean z5110 = z44;
                        float f413 = f28;
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q2.m87165m();
                        Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q2, modifierM3407d7);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i14, interfaceC39127r0M66763d11);
                        AbstractC28683x.m87239G(c28655q2, c0209i15, interfaceC28653p1M87165m11);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i16, modifierM118962N11);
                        textResource3 = textResource15;
                        C39174f c39174f11 = c39174f4;
                        z46 = z45;
                        c28655q3 = c28655q2;
                        InterfaceC39332e interfaceC39332e311113 = interfaceC39332e18;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource3, c28655q2, i75), null, interfaceC39332e31120.mo134584toComposableColorWaAFU9c(c28655q2, (i67 >> 6) & 14), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q2, 6).getN8(), null, c28655q3, 0, 0, 196602);
                        if (interfaceC39332e23 != null) {
                            c28655q3.m87150e0(-1057261933);
                            InterfaceC39332e interfaceC39332e311114 = interfaceC39332e23;
                            InterfaceC39332e interfaceC39332e311115 = interfaceC39332e19;
                            InterfaceC39332e interfaceC39332e311116 = interfaceC39332e20;
                            m94544r(interfaceC39332e311114, interfaceC39332e311115, interfaceC39332e311116, f36, f38, c28655q3, (i67 >> 21) & 1022);
                            interfaceC39332e26 = interfaceC39332e311114;
                            interfaceC39332e27 = interfaceC39332e311115;
                            interfaceC39332e28 = interfaceC39332e311116;
                            c28655q3.m87173q(z46);
                        } else {
                            interfaceC39332e26 = interfaceC39332e23;
                            interfaceC39332e27 = interfaceC39332e19;
                            interfaceC39332e28 = interfaceC39332e20;
                            c28655q3.m87150e0(-1056987087);
                            c28655q3.m87173q(z46);
                        }
                        c28655q3.m87173q(true);
                        c28655q3.m87173q(true);
                        f16 = f413;
                        z18 = z5110;
                        interfaceC39332e10 = interfaceC39332e25;
                        c39174f2 = c39174f11;
                        interfaceC39332e11 = interfaceC39332e31120;
                        interfaceC39332e13 = interfaceC39332e311113;
                        z19 = z518;
                        enumC30774g2 = enumC30774g5;
                        interfaceC4339a2 = interfaceC4339a7;
                        c28655q = c28655q3;
                        interfaceC39332e9 = interfaceC39332e27;
                        interfaceC39332e12 = interfaceC39332e28;
                        interfaceC39332e8 = interfaceC39332e26;
                        modifier2 = modifier8;
                        z17 = z35;
                        f18 = f29;
                        f17 = f27;
                        z24 = z34;
                        textResource4 = textResource13;
                        interfaceC39332e14 = interfaceC39332e24;
                    } else {
                        i75 = i74;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    C0209i c0209i17 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q4, c0209i17, modifierM118962N10);
                    if (interfaceC39332e22 != null) {
                        c28655q4.m87150e0(-1484429813);
                        c28655q4.m87173q(false);
                    } else {
                        c28655q4.m87150e0(-1484429813);
                        c28655q4.m87173q(false);
                    }
                    if (z34) {
                        c28655q4.m87150e0(-1484387932);
                        InterfaceC39332e interfaceC39332e311117 = interfaceC39332e22;
                        EnumC30774g enumC30774g13 = enumC30774g4;
                        m94525A(fMo740m0, f28, interfaceC39332e311117, interfaceC39332e17, f34, enumC30774g13, c28655q4, ((i64 >> 9) & 112) | ((i67 >> 6) & 896) | (i64 & 7168) | (i69 & 458752));
                        f39 = f34;
                        enumC30774g5 = enumC30774g13;
                        c28655q2 = c28655q4;
                        c28655q2.m87173q(false);
                        interfaceC39332e24 = interfaceC39332e311117;
                    } else {
                        interfaceC39332e24 = interfaceC39332e22;
                        c28655q2 = c28655q4;
                        enumC30774g5 = enumC30774g4;
                        f39 = f34;
                        c28655q2.m87150e0(-1484258197);
                        c28655q2.m87173q(false);
                    }
                    if (interfaceC39332e18 != null) {
                        c28655q2.m87150e0(-1484207853);
                        if (c39174f4 != null) {
                            c28655q2.m87150e0(-1484170901);
                            m94538l(c39174f4.f168413w * fMo740m0, interfaceC39332e18, c28655q2, (i64 >> 3) & 112);
                            z47 = false;
                            c28655q2.m87173q(false);
                        } else {
                            z47 = false;
                            c28655q2.m87150e0(-1484069779);
                            m94538l(f39, interfaceC39332e18, c28655q2, (i64 >> 3) & 112);
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(z47);
                    } else {
                        c28655q2.m87150e0(-1483969525);
                        c28655q2.m87173q(false);
                    }
                    if (interfaceC39332e17 != null) {
                        c28655q2.m87150e0(-1483927334);
                        boolean z5111 = z29;
                        InterfaceC39332e interfaceC39332e311118 = interfaceC39332e17;
                        m94540n(f39, z5111, f28, interfaceC39332e311118, c28655q2, (i64 & 7168) | ((i64 >> 12) & 112) | ((i64 >> 6) & 896));
                        z44 = z5111;
                        interfaceC39332e25 = interfaceC39332e311118;
                        z45 = false;
                        c28655q2.m87173q(false);
                    } else {
                        z44 = z29;
                        interfaceC39332e25 = interfaceC39332e17;
                        z45 = false;
                        c28655q2.m87150e0(-1483818741);
                        c28655q2.m87173q(false);
                    }
                    Modifier modifierM3407d8 = AbstractC1102d.m3407d(1.0f, c2314t4);
                    InterfaceC39127r0 interfaceC39127r0M66763d12 = AbstractC22989q.m66763d(c2307m4, z45);
                    boolean z5112 = z44;
                    float f414 = f28;
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q2.m87165m();
                    Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q2, modifierM3407d8);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i14, interfaceC39127r0M66763d12);
                    AbstractC28683x.m87239G(c28655q2, c0209i15, interfaceC28653p1M87165m12);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i17, modifierM118962N12);
                    textResource3 = textResource15;
                    C39174f c39174f12 = c39174f4;
                    z46 = z45;
                    c28655q3 = c28655q2;
                    InterfaceC39332e interfaceC39332e311119 = interfaceC39332e18;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource3, c28655q2, i75), null, interfaceC39332e31120.mo134584toComposableColorWaAFU9c(c28655q2, (i67 >> 6) & 14), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q2, 6).getN8(), null, c28655q3, 0, 0, 196602);
                    if (interfaceC39332e23 != null) {
                        c28655q3.m87150e0(-1057261933);
                        InterfaceC39332e interfaceC39332e3111110 = interfaceC39332e23;
                        InterfaceC39332e interfaceC39332e3111111 = interfaceC39332e19;
                        InterfaceC39332e interfaceC39332e3111112 = interfaceC39332e20;
                        m94544r(interfaceC39332e3111110, interfaceC39332e3111111, interfaceC39332e3111112, f36, f38, c28655q3, (i67 >> 21) & 1022);
                        interfaceC39332e26 = interfaceC39332e3111110;
                        interfaceC39332e27 = interfaceC39332e3111111;
                        interfaceC39332e28 = interfaceC39332e3111112;
                        c28655q3.m87173q(z46);
                    } else {
                        interfaceC39332e26 = interfaceC39332e23;
                        interfaceC39332e27 = interfaceC39332e19;
                        interfaceC39332e28 = interfaceC39332e20;
                        c28655q3.m87150e0(-1056987087);
                        c28655q3.m87173q(z46);
                    }
                    c28655q3.m87173q(true);
                    c28655q3.m87173q(true);
                    f16 = f414;
                    z18 = z5112;
                    interfaceC39332e10 = interfaceC39332e25;
                    c39174f2 = c39174f12;
                    interfaceC39332e11 = interfaceC39332e31120;
                    interfaceC39332e13 = interfaceC39332e311119;
                    z19 = z518;
                    enumC30774g2 = enumC30774g5;
                    interfaceC4339a2 = interfaceC4339a7;
                    c28655q = c28655q3;
                    interfaceC39332e9 = interfaceC39332e27;
                    interfaceC39332e12 = interfaceC39332e28;
                    interfaceC39332e8 = interfaceC39332e26;
                    modifier2 = modifier8;
                    z17 = z35;
                    f18 = f29;
                    f17 = f27;
                    z24 = z34;
                    textResource4 = textResource13;
                    interfaceC39332e14 = interfaceC39332e24;
                } else {
                    c28655q4.m87138X();
                    modifier2 = modifier;
                    enumC30774g2 = enumC30774g;
                    interfaceC39332e8 = interfaceC39332e3;
                    z17 = z4;
                    f16 = f14;
                    z18 = z13;
                    f17 = f15;
                    z19 = z14;
                    z24 = z15;
                    interfaceC4339a2 = interfaceC4339a;
                    interfaceC39332e9 = interfaceC39332e29;
                    interfaceC39332e10 = interfaceC39332e7;
                    c28655q = c28655q4;
                    textResource3 = textResourceM21267a;
                    interfaceC39332e11 = interfaceC39332e;
                    c39174f2 = c39174f;
                    f18 = f13;
                    interfaceC39332e12 = interfaceC39332e30;
                    textResource4 = textResourceM21267a2;
                    interfaceC39332e13 = interfaceC39332e31;
                    interfaceC39332e14 = interfaceC39332e2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: qy0.e
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC30773f.m94552z(modifier2, textResource3, interfaceC39332e11, textResource4, interfaceC39332e14, c39174f2, enumC30774g2, interfaceC39332e8, interfaceC39332e9, interfaceC39332e12, z17, f18, interfaceC39332e13, interfaceC39332e10, f16, z18, f17, z19, z24, interfaceC4339a2, i13, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i49 = i47 | 24576;
            i54 = i15 & 32768;
            if (i54 != 0) {
                i49 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q4.m87155h(z13)) {
                    i55 = 131072;
                } else {
                    i55 = 65536;
                }
                i49 |= i55;
            }
            i56 = i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            if (i56 != 0) {
                i49 |= 1572864;
            } else if ((i14 & 1572864) == 0) {
                i49 |= c28655q4.m87147d(f15) ? 1048576 : 524288;
            }
            i57 = i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            if (i57 != 0) {
                i49 |= 12582912;
            } else if ((i14 & 12582912) == 0) {
                i49 |= c28655q4.m87155h(z14) ? 8388608 : 4194304;
            }
            i58 = i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION;
            if (i58 != 0) {
                i49 |= 100663296;
            } else if ((i14 & 100663296) == 0) {
                if (c28655q4.m87155h(z15)) {
                    i26 = 67108864;
                }
                i49 |= i26;
            }
            i59 = i15 & 524288;
            if (i59 != 0) {
                i49 |= 805306368;
            } else if ((i14 & 805306368) == 0) {
                i49 |= c28655q4.m87157i(interfaceC4339a) ? 536870912 : 268435456;
            }
            i64 = i49;
            if ((i16 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (c28655q4.m87135U(i16 & 1, z16)) {
                c28655q4.m87140Z();
                i65 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i65 != 0) {
                    if (i78 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier;
                    }
                    if ((i15 & 2) != 0) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                        i16 &= -113;
                    }
                    if ((i15 & 4) != 0) {
                        objM87133R2 = c28655q4.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = a.f126731w;
                            c28655q4.m87172p0(objM87133R2);
                        }
                        interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R2);
                        i16 &= -897;
                    } else {
                        interfaceC39332eM125323a = interfaceC39332e;
                    }
                    if ((i15 & 8) != 0) {
                        textResourceM21267a2 = AbstractC8693b.m21267a();
                        i16 &= -7169;
                    }
                    if (i84 != 0) {
                        interfaceC39332e15 = null;
                    } else {
                        interfaceC39332e15 = interfaceC39332e2;
                    }
                    if (i86 != 0) {
                        c39174f3 = null;
                    } else {
                        c39174f3 = c39174f;
                    }
                    if (i17 != 0) {
                        enumC30774g3 = EnumC30774g.NONE;
                    } else {
                        enumC30774g3 = enumC30774g;
                    }
                    if (i19 != 0) {
                        interfaceC39332e16 = null;
                    } else {
                        interfaceC39332e16 = interfaceC39332e3;
                    }
                    if (i25 != 0) {
                        interfaceC39332e29 = null;
                    }
                    if (i28 != 0) {
                        interfaceC39332e30 = null;
                    }
                    if (i34 != 0) {
                        z25 = false;
                    } else {
                        z25 = z4;
                    }
                    if (i37 != 0) {
                        f19 = null;
                    } else {
                        f19 = f13;
                    }
                    if (i39 != 0) {
                        interfaceC39332e31 = null;
                    }
                    if (i45 == 0) {
                    }
                    i66 = i16;
                    if (i48 != 0) {
                        f24 = (float) 1.5d;
                    } else {
                        f24 = f14;
                    }
                    if (i54 != 0) {
                        z26 = false;
                    } else {
                        z26 = z13;
                    }
                    if (i56 != 0) {
                        f25 = 7 * 4;
                    } else {
                        f25 = f15;
                    }
                    if (i57 != 0) {
                        z27 = true;
                    } else {
                        z27 = z14;
                    }
                    if (i58 != 0) {
                        z28 = false;
                    } else {
                        z28 = z15;
                    }
                    f26 = f25;
                    if (i59 != 0) {
                        objM87133R = c28655q4.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C30654e(3);
                            c28655q4.m87172p0(objM87133R);
                        }
                        TextResource textResource16 = textResourceM21267a2;
                        interfaceC39332e18 = interfaceC39332e31;
                        textResource5 = textResource16;
                        i67 = i66;
                        interfaceC39332e19 = interfaceC39332e29;
                        f27 = f26;
                        interfaceC39332e20 = interfaceC39332e30;
                        f28 = f24;
                        interfaceC39332e21 = interfaceC39332eM125323a;
                        textResource6 = textResourceM21267a;
                        z29 = z26;
                        z34 = z28;
                        interfaceC39332e22 = interfaceC39332e15;
                        c39174f4 = c39174f3;
                        enumC30774g4 = enumC30774g3;
                        interfaceC39332e23 = interfaceC39332e16;
                        z35 = z25;
                        f29 = f19;
                        z36 = z27;
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                        modifier4 = modifier3;
                    } else {
                        boolean z413 = z27;
                        TextResource textResource17 = textResourceM21267a2;
                        interfaceC39332e18 = interfaceC39332e31;
                        textResource5 = textResource17;
                        i67 = i66;
                        interfaceC39332e19 = interfaceC39332e29;
                        f27 = f26;
                        interfaceC39332e20 = interfaceC39332e30;
                        f28 = f24;
                        interfaceC39332e21 = interfaceC39332eM125323a;
                        textResource6 = textResourceM21267a;
                        z29 = z26;
                        z34 = z28;
                        modifier4 = modifier3;
                        interfaceC39332e22 = interfaceC39332e15;
                        c39174f4 = c39174f3;
                        enumC30774g4 = enumC30774g3;
                        interfaceC39332e23 = interfaceC39332e16;
                        z35 = z25;
                        f29 = f19;
                        z36 = z413;
                        interfaceC4339a3 = interfaceC4339a;
                    }
                } else {
                    if (i78 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier;
                    }
                    if ((i15 & 2) != 0) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                        i16 &= -113;
                    }
                    if ((i15 & 4) != 0) {
                        objM87133R2 = c28655q4.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = a.f126731w;
                            c28655q4.m87172p0(objM87133R2);
                        }
                        interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R2);
                        i16 &= -897;
                    } else {
                        interfaceC39332eM125323a = interfaceC39332e;
                    }
                    if ((i15 & 8) != 0) {
                        textResourceM21267a2 = AbstractC8693b.m21267a();
                        i16 &= -7169;
                    }
                    if (i84 != 0) {
                        interfaceC39332e15 = null;
                    } else {
                        interfaceC39332e15 = interfaceC39332e2;
                    }
                    if (i86 != 0) {
                        c39174f3 = null;
                    } else {
                        c39174f3 = c39174f;
                    }
                    if (i17 != 0) {
                        enumC30774g3 = EnumC30774g.NONE;
                    } else {
                        enumC30774g3 = enumC30774g;
                    }
                    if (i19 != 0) {
                        interfaceC39332e16 = null;
                    } else {
                        interfaceC39332e16 = interfaceC39332e3;
                    }
                    if (i25 != 0) {
                        interfaceC39332e29 = null;
                    }
                    if (i28 != 0) {
                        interfaceC39332e30 = null;
                    }
                    if (i34 != 0) {
                        z25 = false;
                    } else {
                        z25 = z4;
                    }
                    if (i37 != 0) {
                        f19 = null;
                    } else {
                        f19 = f13;
                    }
                    if (i39 != 0) {
                        interfaceC39332e31 = null;
                    }
                    if (i45 == 0) {
                    }
                    i66 = i16;
                    if (i48 != 0) {
                        f24 = (float) 1.5d;
                    } else {
                        f24 = f14;
                    }
                    if (i54 != 0) {
                        z26 = false;
                    } else {
                        z26 = z13;
                    }
                    if (i56 != 0) {
                        f25 = 7 * 4;
                    } else {
                        f25 = f15;
                    }
                    if (i57 != 0) {
                        z27 = true;
                    } else {
                        z27 = z14;
                    }
                    if (i58 != 0) {
                        z28 = false;
                    } else {
                        z28 = z15;
                    }
                    f26 = f25;
                    if (i59 != 0) {
                        objM87133R = c28655q4.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C30654e(3);
                            c28655q4.m87172p0(objM87133R);
                        }
                        TextResource textResource18 = textResourceM21267a2;
                        interfaceC39332e18 = interfaceC39332e31;
                        textResource5 = textResource18;
                        i67 = i66;
                        interfaceC39332e19 = interfaceC39332e29;
                        f27 = f26;
                        interfaceC39332e20 = interfaceC39332e30;
                        f28 = f24;
                        interfaceC39332e21 = interfaceC39332eM125323a;
                        textResource6 = textResourceM21267a;
                        z29 = z26;
                        z34 = z28;
                        interfaceC39332e22 = interfaceC39332e15;
                        c39174f4 = c39174f3;
                        enumC30774g4 = enumC30774g3;
                        interfaceC39332e23 = interfaceC39332e16;
                        z35 = z25;
                        f29 = f19;
                        z36 = z27;
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                        modifier4 = modifier3;
                    } else {
                        boolean z414 = z27;
                        TextResource textResource19 = textResourceM21267a2;
                        interfaceC39332e18 = interfaceC39332e31;
                        textResource5 = textResource19;
                        i67 = i66;
                        interfaceC39332e19 = interfaceC39332e29;
                        f27 = f26;
                        interfaceC39332e20 = interfaceC39332e30;
                        f28 = f24;
                        interfaceC39332e21 = interfaceC39332eM125323a;
                        textResource6 = textResourceM21267a;
                        z29 = z26;
                        z34 = z28;
                        modifier4 = modifier3;
                        interfaceC39332e22 = interfaceC39332e15;
                        c39174f4 = c39174f3;
                        enumC30774g4 = enumC30774g3;
                        interfaceC39332e23 = interfaceC39332e16;
                        z35 = z25;
                        f29 = f19;
                        z36 = z414;
                        interfaceC4339a3 = interfaceC4339a;
                    }
                }
                c28655q4.m87175r();
                objM87133R3 = c28655q4.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC11266d.m30453g(c28655q4);
                }
                InterfaceC21083i interfaceC21083i3 = (InterfaceC21083i) objM87133R3;
                strM21274h = AbstractC8693b.m21274h(textResource5, c28655q4, (i67 >> 9) & 14);
                TextResource textResource110 = textResource5;
                fMo740m0 = ((InterfaceC39171c) c28655q4.m87161k(AbstractC2453v1.f9569h)).getFontScale();
                f34 = f27 * fMo740m0;
                if (f29 != null) {
                    fFloatValue = f29.floatValue();
                } else {
                    if (z35) {
                        fFloatValue = 2.0f;
                    } else {
                        i68 = 4;
                        fFloatValue = 1.0f;
                    }
                    f35 = i68;
                    f36 = fFloatValue * f35 * fMo740m0;
                    if (z35) {
                        f37 = (((3 * f34) / f35) - (f36 / f35)) + f28;
                    } else {
                        float f415 = 2;
                        f37 = (f28 / f415) + ((f34 / f415) - (f36 / f415));
                    }
                    i69 = i67 >> 3;
                    f38 = f37;
                    i74 = i69 & 14;
                    InterfaceC39332e interfaceC39332e31121 = interfaceC39332e21;
                    TextResource textResource111 = textResource6;
                    String str5 = "home_calendar_date_" + AbstractC8693b.m21274h(textResource6, c28655q4, i74);
                    C2314t c2314t5 = C2314t.f9131w;
                    Modifier modifierM44101d5 = AbstractC15676d.m44101d(c2314t5, str5);
                    InterfaceC13832v0 interfaceC13832v4 = (InterfaceC13832v0) c28655q4.m87161k(AbstractC1095d.f4515a);
                    if ((i64 & 29360128) == 8388608) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    boolean z415 = z37;
                    if ((1879048192 & i64) == 536870912) {
                        z38 = true;
                    } else {
                        z38 = false;
                    }
                    z39 = z415 | z38;
                    objM87133R4 = c28655q4.m87133R();
                    if (z39) {
                        objM87133R4 = new C12203c(4, interfaceC4339a3, z36);
                        c28655q4.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C12203c(4, interfaceC4339a3, z36);
                        c28655q4.m87172p0(objM87133R4);
                    }
                    Modifier modifierMo3471e5 = AbstractC1102d.m3407d(1.0f, AbstractC1092a.m3360e(modifierM44101d5, interfaceC21083i3, interfaceC13832v4, false, null, (InterfaceC4339a) objM87133R4, 28)).mo3471e(modifier4);
                    zM87153g = c28655q4.m87153g(strM21274h);
                    Modifier modifier9 = modifier4;
                    objM87133R5 = c28655q4.m87133R();
                    if (zM87153g) {
                        objM87133R5 = new C17632d(strM21274h, 29);
                        c28655q4.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new C17632d(strM21274h, 29);
                        c28655q4.m87172p0(objM87133R5);
                    }
                    Modifier modifierM51775c5 = AbstractC18032n.m51775c(modifierMo3471e5, true, (Function1) objM87133R5);
                    C2307m c2307m5 = C2299e.f9102E;
                    InterfaceC39127r0 interfaceC39127r0M66763d13 = AbstractC22989q.m66763d(c2307m5, false);
                    iHashCode = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q4.m87165m();
                    Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q4, modifierM51775c5);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q4.m87158i0();
                    boolean z5113 = z36;
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    C0209i c0209i18 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q4, c0209i18, interfaceC39127r0M66763d13);
                    C0209i c0209i19 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q4, c0209i19, interfaceC28653p1M87165m13);
                    c0209i = C0217k.f732j;
                    InterfaceC4339a interfaceC4339a8 = interfaceC4339a3;
                    if (c28655q4.f115903S) {
                        i75 = i74;
                        if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i110 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q4, c0209i110, modifierM118962N13);
                        if (interfaceC39332e22 != null) {
                            c28655q4.m87150e0(-1484429813);
                            c28655q4.m87173q(false);
                        } else {
                            c28655q4.m87150e0(-1484429813);
                            c28655q4.m87173q(false);
                        }
                        if (z34) {
                            c28655q4.m87150e0(-1484387932);
                            InterfaceC39332e interfaceC39332e3111113 = interfaceC39332e22;
                            EnumC30774g enumC30774g14 = enumC30774g4;
                            m94525A(fMo740m0, f28, interfaceC39332e3111113, interfaceC39332e17, f34, enumC30774g14, c28655q4, ((i64 >> 9) & 112) | ((i67 >> 6) & 896) | (i64 & 7168) | (i69 & 458752));
                            f39 = f34;
                            enumC30774g5 = enumC30774g14;
                            c28655q2 = c28655q4;
                            c28655q2.m87173q(false);
                            interfaceC39332e24 = interfaceC39332e3111113;
                        } else {
                            interfaceC39332e24 = interfaceC39332e22;
                            c28655q2 = c28655q4;
                            enumC30774g5 = enumC30774g4;
                            f39 = f34;
                            c28655q2.m87150e0(-1484258197);
                            c28655q2.m87173q(false);
                        }
                        if (interfaceC39332e18 != null) {
                            c28655q2.m87150e0(-1484207853);
                            if (c39174f4 != null) {
                                c28655q2.m87150e0(-1484170901);
                                m94538l(c39174f4.f168413w * fMo740m0, interfaceC39332e18, c28655q2, (i64 >> 3) & 112);
                                z47 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z47 = false;
                                c28655q2.m87150e0(-1484069779);
                                m94538l(f39, interfaceC39332e18, c28655q2, (i64 >> 3) & 112);
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(z47);
                        } else {
                            c28655q2.m87150e0(-1483969525);
                            c28655q2.m87173q(false);
                        }
                        if (interfaceC39332e17 != null) {
                            c28655q2.m87150e0(-1483927334);
                            boolean z5114 = z29;
                            InterfaceC39332e interfaceC39332e3111114 = interfaceC39332e17;
                            m94540n(f39, z5114, f28, interfaceC39332e3111114, c28655q2, (i64 & 7168) | ((i64 >> 12) & 112) | ((i64 >> 6) & 896));
                            z44 = z5114;
                            interfaceC39332e25 = interfaceC39332e3111114;
                            z45 = false;
                            c28655q2.m87173q(false);
                        } else {
                            z44 = z29;
                            interfaceC39332e25 = interfaceC39332e17;
                            z45 = false;
                            c28655q2.m87150e0(-1483818741);
                            c28655q2.m87173q(false);
                        }
                        Modifier modifierM3407d9 = AbstractC1102d.m3407d(1.0f, c2314t5);
                        InterfaceC39127r0 interfaceC39127r0M66763d14 = AbstractC22989q.m66763d(c2307m5, z45);
                        boolean z5115 = z44;
                        float f416 = f28;
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q2.m87165m();
                        Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q2, modifierM3407d9);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i18, interfaceC39127r0M66763d14);
                        AbstractC28683x.m87239G(c28655q2, c0209i19, interfaceC28653p1M87165m14);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i110, modifierM118962N14);
                        textResource3 = textResource111;
                        C39174f c39174f13 = c39174f4;
                        z46 = z45;
                        c28655q3 = c28655q2;
                        InterfaceC39332e interfaceC39332e3111115 = interfaceC39332e18;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource3, c28655q2, i75), null, interfaceC39332e31121.mo134584toComposableColorWaAFU9c(c28655q2, (i67 >> 6) & 14), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q2, 6).getN8(), null, c28655q3, 0, 0, 196602);
                        if (interfaceC39332e23 != null) {
                            c28655q3.m87150e0(-1057261933);
                            InterfaceC39332e interfaceC39332e3111116 = interfaceC39332e23;
                            InterfaceC39332e interfaceC39332e3111117 = interfaceC39332e19;
                            InterfaceC39332e interfaceC39332e3111118 = interfaceC39332e20;
                            m94544r(interfaceC39332e3111116, interfaceC39332e3111117, interfaceC39332e3111118, f36, f38, c28655q3, (i67 >> 21) & 1022);
                            interfaceC39332e26 = interfaceC39332e3111116;
                            interfaceC39332e27 = interfaceC39332e3111117;
                            interfaceC39332e28 = interfaceC39332e3111118;
                            c28655q3.m87173q(z46);
                        } else {
                            interfaceC39332e26 = interfaceC39332e23;
                            interfaceC39332e27 = interfaceC39332e19;
                            interfaceC39332e28 = interfaceC39332e20;
                            c28655q3.m87150e0(-1056987087);
                            c28655q3.m87173q(z46);
                        }
                        c28655q3.m87173q(true);
                        c28655q3.m87173q(true);
                        f16 = f416;
                        z18 = z5115;
                        interfaceC39332e10 = interfaceC39332e25;
                        c39174f2 = c39174f13;
                        interfaceC39332e11 = interfaceC39332e31121;
                        interfaceC39332e13 = interfaceC39332e3111115;
                        z19 = z5113;
                        enumC30774g2 = enumC30774g5;
                        interfaceC4339a2 = interfaceC4339a8;
                        c28655q = c28655q3;
                        interfaceC39332e9 = interfaceC39332e27;
                        interfaceC39332e12 = interfaceC39332e28;
                        interfaceC39332e8 = interfaceC39332e26;
                        modifier2 = modifier9;
                        z17 = z35;
                        f18 = f29;
                        f17 = f27;
                        z24 = z34;
                        textResource4 = textResource110;
                        interfaceC39332e14 = interfaceC39332e24;
                    } else {
                        i75 = i74;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    C0209i c0209i111 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q4, c0209i111, modifierM118962N13);
                    if (interfaceC39332e22 != null) {
                        c28655q4.m87150e0(-1484429813);
                        c28655q4.m87173q(false);
                    } else {
                        c28655q4.m87150e0(-1484429813);
                        c28655q4.m87173q(false);
                    }
                    if (z34) {
                        c28655q4.m87150e0(-1484387932);
                        InterfaceC39332e interfaceC39332e3111119 = interfaceC39332e22;
                        EnumC30774g enumC30774g15 = enumC30774g4;
                        m94525A(fMo740m0, f28, interfaceC39332e3111119, interfaceC39332e17, f34, enumC30774g15, c28655q4, ((i64 >> 9) & 112) | ((i67 >> 6) & 896) | (i64 & 7168) | (i69 & 458752));
                        f39 = f34;
                        enumC30774g5 = enumC30774g15;
                        c28655q2 = c28655q4;
                        c28655q2.m87173q(false);
                        interfaceC39332e24 = interfaceC39332e3111119;
                    } else {
                        interfaceC39332e24 = interfaceC39332e22;
                        c28655q2 = c28655q4;
                        enumC30774g5 = enumC30774g4;
                        f39 = f34;
                        c28655q2.m87150e0(-1484258197);
                        c28655q2.m87173q(false);
                    }
                    if (interfaceC39332e18 != null) {
                        c28655q2.m87150e0(-1484207853);
                        if (c39174f4 != null) {
                            c28655q2.m87150e0(-1484170901);
                            m94538l(c39174f4.f168413w * fMo740m0, interfaceC39332e18, c28655q2, (i64 >> 3) & 112);
                            z47 = false;
                            c28655q2.m87173q(false);
                        } else {
                            z47 = false;
                            c28655q2.m87150e0(-1484069779);
                            m94538l(f39, interfaceC39332e18, c28655q2, (i64 >> 3) & 112);
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(z47);
                    } else {
                        c28655q2.m87150e0(-1483969525);
                        c28655q2.m87173q(false);
                    }
                    if (interfaceC39332e17 != null) {
                        c28655q2.m87150e0(-1483927334);
                        boolean z5116 = z29;
                        InterfaceC39332e interfaceC39332e31111110 = interfaceC39332e17;
                        m94540n(f39, z5116, f28, interfaceC39332e31111110, c28655q2, (i64 & 7168) | ((i64 >> 12) & 112) | ((i64 >> 6) & 896));
                        z44 = z5116;
                        interfaceC39332e25 = interfaceC39332e31111110;
                        z45 = false;
                        c28655q2.m87173q(false);
                    } else {
                        z44 = z29;
                        interfaceC39332e25 = interfaceC39332e17;
                        z45 = false;
                        c28655q2.m87150e0(-1483818741);
                        c28655q2.m87173q(false);
                    }
                    Modifier modifierM3407d10 = AbstractC1102d.m3407d(1.0f, c2314t5);
                    InterfaceC39127r0 interfaceC39127r0M66763d15 = AbstractC22989q.m66763d(c2307m5, z45);
                    boolean z5117 = z44;
                    float f417 = f28;
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q2.m87165m();
                    Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q2, modifierM3407d10);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i18, interfaceC39127r0M66763d15);
                    AbstractC28683x.m87239G(c28655q2, c0209i19, interfaceC28653p1M87165m15);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i111, modifierM118962N15);
                    textResource3 = textResource111;
                    C39174f c39174f14 = c39174f4;
                    z46 = z45;
                    c28655q3 = c28655q2;
                    InterfaceC39332e interfaceC39332e31111111 = interfaceC39332e18;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource3, c28655q2, i75), null, interfaceC39332e31121.mo134584toComposableColorWaAFU9c(c28655q2, (i67 >> 6) & 14), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q2, 6).getN8(), null, c28655q3, 0, 0, 196602);
                    if (interfaceC39332e23 != null) {
                        c28655q3.m87150e0(-1057261933);
                        InterfaceC39332e interfaceC39332e31111112 = interfaceC39332e23;
                        InterfaceC39332e interfaceC39332e31111113 = interfaceC39332e19;
                        InterfaceC39332e interfaceC39332e31111114 = interfaceC39332e20;
                        m94544r(interfaceC39332e31111112, interfaceC39332e31111113, interfaceC39332e31111114, f36, f38, c28655q3, (i67 >> 21) & 1022);
                        interfaceC39332e26 = interfaceC39332e31111112;
                        interfaceC39332e27 = interfaceC39332e31111113;
                        interfaceC39332e28 = interfaceC39332e31111114;
                        c28655q3.m87173q(z46);
                    } else {
                        interfaceC39332e26 = interfaceC39332e23;
                        interfaceC39332e27 = interfaceC39332e19;
                        interfaceC39332e28 = interfaceC39332e20;
                        c28655q3.m87150e0(-1056987087);
                        c28655q3.m87173q(z46);
                    }
                    c28655q3.m87173q(true);
                    c28655q3.m87173q(true);
                    f16 = f417;
                    z18 = z5117;
                    interfaceC39332e10 = interfaceC39332e25;
                    c39174f2 = c39174f14;
                    interfaceC39332e11 = interfaceC39332e31121;
                    interfaceC39332e13 = interfaceC39332e31111111;
                    z19 = z5113;
                    enumC30774g2 = enumC30774g5;
                    interfaceC4339a2 = interfaceC4339a8;
                    c28655q = c28655q3;
                    interfaceC39332e9 = interfaceC39332e27;
                    interfaceC39332e12 = interfaceC39332e28;
                    interfaceC39332e8 = interfaceC39332e26;
                    modifier2 = modifier9;
                    z17 = z35;
                    f18 = f29;
                    f17 = f27;
                    z24 = z34;
                    textResource4 = textResource110;
                    interfaceC39332e14 = interfaceC39332e24;
                }
                i68 = 4;
                f35 = i68;
                f36 = fFloatValue * f35 * fMo740m0;
                if (z35) {
                    f37 = (((3 * f34) / f35) - (f36 / f35)) + f28;
                } else {
                    float f418 = 2;
                    f37 = (f28 / f418) + ((f34 / f418) - (f36 / f418));
                }
                i69 = i67 >> 3;
                f38 = f37;
                i74 = i69 & 14;
                InterfaceC39332e interfaceC39332e31122 = interfaceC39332e21;
                TextResource textResource112 = textResource6;
                String str6 = "home_calendar_date_" + AbstractC8693b.m21274h(textResource6, c28655q4, i74);
                C2314t c2314t6 = C2314t.f9131w;
                Modifier modifierM44101d6 = AbstractC15676d.m44101d(c2314t6, str6);
                InterfaceC13832v0 interfaceC13832v5 = (InterfaceC13832v0) c28655q4.m87161k(AbstractC1095d.f4515a);
                if ((i64 & 29360128) == 8388608) {
                    z37 = true;
                } else {
                    z37 = false;
                }
                boolean z416 = z37;
                if ((1879048192 & i64) == 536870912) {
                    z38 = true;
                } else {
                    z38 = false;
                }
                z39 = z416 | z38;
                objM87133R4 = c28655q4.m87133R();
                if (z39) {
                    objM87133R4 = new C12203c(4, interfaceC4339a3, z36);
                    c28655q4.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C12203c(4, interfaceC4339a3, z36);
                    c28655q4.m87172p0(objM87133R4);
                }
                Modifier modifierMo3471e6 = AbstractC1102d.m3407d(1.0f, AbstractC1092a.m3360e(modifierM44101d6, interfaceC21083i3, interfaceC13832v5, false, null, (InterfaceC4339a) objM87133R4, 28)).mo3471e(modifier4);
                zM87153g = c28655q4.m87153g(strM21274h);
                Modifier modifier10 = modifier4;
                objM87133R5 = c28655q4.m87133R();
                if (zM87153g) {
                    objM87133R5 = new C17632d(strM21274h, 29);
                    c28655q4.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new C17632d(strM21274h, 29);
                    c28655q4.m87172p0(objM87133R5);
                }
                Modifier modifierM51775c6 = AbstractC18032n.m51775c(modifierMo3471e6, true, (Function1) objM87133R5);
                C2307m c2307m6 = C2299e.f9102E;
                InterfaceC39127r0 interfaceC39127r0M66763d16 = AbstractC22989q.m66763d(c2307m6, false);
                iHashCode = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q4.m87165m();
                Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q4, modifierM51775c6);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q4.m87158i0();
                boolean z5118 = z36;
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                C0209i c0209i112 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q4, c0209i112, interfaceC39127r0M66763d16);
                C0209i c0209i113 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q4, c0209i113, interfaceC28653p1M87165m16);
                c0209i = C0217k.f732j;
                InterfaceC4339a interfaceC4339a9 = interfaceC4339a3;
                if (c28655q4.f115903S) {
                    i75 = i74;
                    if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i114 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q4, c0209i114, modifierM118962N16);
                    if (interfaceC39332e22 != null) {
                        c28655q4.m87150e0(-1484429813);
                        c28655q4.m87173q(false);
                    } else {
                        c28655q4.m87150e0(-1484429813);
                        c28655q4.m87173q(false);
                    }
                    if (z34) {
                        c28655q4.m87150e0(-1484387932);
                        InterfaceC39332e interfaceC39332e31111115 = interfaceC39332e22;
                        EnumC30774g enumC30774g16 = enumC30774g4;
                        m94525A(fMo740m0, f28, interfaceC39332e31111115, interfaceC39332e17, f34, enumC30774g16, c28655q4, ((i64 >> 9) & 112) | ((i67 >> 6) & 896) | (i64 & 7168) | (i69 & 458752));
                        f39 = f34;
                        enumC30774g5 = enumC30774g16;
                        c28655q2 = c28655q4;
                        c28655q2.m87173q(false);
                        interfaceC39332e24 = interfaceC39332e31111115;
                    } else {
                        interfaceC39332e24 = interfaceC39332e22;
                        c28655q2 = c28655q4;
                        enumC30774g5 = enumC30774g4;
                        f39 = f34;
                        c28655q2.m87150e0(-1484258197);
                        c28655q2.m87173q(false);
                    }
                    if (interfaceC39332e18 != null) {
                        c28655q2.m87150e0(-1484207853);
                        if (c39174f4 != null) {
                            c28655q2.m87150e0(-1484170901);
                            m94538l(c39174f4.f168413w * fMo740m0, interfaceC39332e18, c28655q2, (i64 >> 3) & 112);
                            z47 = false;
                            c28655q2.m87173q(false);
                        } else {
                            z47 = false;
                            c28655q2.m87150e0(-1484069779);
                            m94538l(f39, interfaceC39332e18, c28655q2, (i64 >> 3) & 112);
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(z47);
                    } else {
                        c28655q2.m87150e0(-1483969525);
                        c28655q2.m87173q(false);
                    }
                    if (interfaceC39332e17 != null) {
                        c28655q2.m87150e0(-1483927334);
                        boolean z5119 = z29;
                        InterfaceC39332e interfaceC39332e31111116 = interfaceC39332e17;
                        m94540n(f39, z5119, f28, interfaceC39332e31111116, c28655q2, (i64 & 7168) | ((i64 >> 12) & 112) | ((i64 >> 6) & 896));
                        z44 = z5119;
                        interfaceC39332e25 = interfaceC39332e31111116;
                        z45 = false;
                        c28655q2.m87173q(false);
                    } else {
                        z44 = z29;
                        interfaceC39332e25 = interfaceC39332e17;
                        z45 = false;
                        c28655q2.m87150e0(-1483818741);
                        c28655q2.m87173q(false);
                    }
                    Modifier modifierM3407d11 = AbstractC1102d.m3407d(1.0f, c2314t6);
                    InterfaceC39127r0 interfaceC39127r0M66763d17 = AbstractC22989q.m66763d(c2307m6, z45);
                    boolean z51110 = z44;
                    float f419 = f28;
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q2.m87165m();
                    Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q2, modifierM3407d11);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i112, interfaceC39127r0M66763d17);
                    AbstractC28683x.m87239G(c28655q2, c0209i113, interfaceC28653p1M87165m17);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i114, modifierM118962N17);
                    textResource3 = textResource112;
                    C39174f c39174f15 = c39174f4;
                    z46 = z45;
                    c28655q3 = c28655q2;
                    InterfaceC39332e interfaceC39332e31111117 = interfaceC39332e18;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource3, c28655q2, i75), null, interfaceC39332e31122.mo134584toComposableColorWaAFU9c(c28655q2, (i67 >> 6) & 14), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q2, 6).getN8(), null, c28655q3, 0, 0, 196602);
                    if (interfaceC39332e23 != null) {
                        c28655q3.m87150e0(-1057261933);
                        InterfaceC39332e interfaceC39332e31111118 = interfaceC39332e23;
                        InterfaceC39332e interfaceC39332e31111119 = interfaceC39332e19;
                        InterfaceC39332e interfaceC39332e311111110 = interfaceC39332e20;
                        m94544r(interfaceC39332e31111118, interfaceC39332e31111119, interfaceC39332e311111110, f36, f38, c28655q3, (i67 >> 21) & 1022);
                        interfaceC39332e26 = interfaceC39332e31111118;
                        interfaceC39332e27 = interfaceC39332e31111119;
                        interfaceC39332e28 = interfaceC39332e311111110;
                        c28655q3.m87173q(z46);
                    } else {
                        interfaceC39332e26 = interfaceC39332e23;
                        interfaceC39332e27 = interfaceC39332e19;
                        interfaceC39332e28 = interfaceC39332e20;
                        c28655q3.m87150e0(-1056987087);
                        c28655q3.m87173q(z46);
                    }
                    c28655q3.m87173q(true);
                    c28655q3.m87173q(true);
                    f16 = f419;
                    z18 = z51110;
                    interfaceC39332e10 = interfaceC39332e25;
                    c39174f2 = c39174f15;
                    interfaceC39332e11 = interfaceC39332e31122;
                    interfaceC39332e13 = interfaceC39332e31111117;
                    z19 = z5118;
                    enumC30774g2 = enumC30774g5;
                    interfaceC4339a2 = interfaceC4339a9;
                    c28655q = c28655q3;
                    interfaceC39332e9 = interfaceC39332e27;
                    interfaceC39332e12 = interfaceC39332e28;
                    interfaceC39332e8 = interfaceC39332e26;
                    modifier2 = modifier10;
                    z17 = z35;
                    f18 = f29;
                    f17 = f27;
                    z24 = z34;
                    textResource4 = textResource110;
                    interfaceC39332e14 = interfaceC39332e24;
                } else {
                    i75 = i74;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                C0209i c0209i115 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q4, c0209i115, modifierM118962N16);
                if (interfaceC39332e22 != null) {
                    c28655q4.m87150e0(-1484429813);
                    c28655q4.m87173q(false);
                } else {
                    c28655q4.m87150e0(-1484429813);
                    c28655q4.m87173q(false);
                }
                if (z34) {
                    c28655q4.m87150e0(-1484387932);
                    InterfaceC39332e interfaceC39332e311111111 = interfaceC39332e22;
                    EnumC30774g enumC30774g17 = enumC30774g4;
                    m94525A(fMo740m0, f28, interfaceC39332e311111111, interfaceC39332e17, f34, enumC30774g17, c28655q4, ((i64 >> 9) & 112) | ((i67 >> 6) & 896) | (i64 & 7168) | (i69 & 458752));
                    f39 = f34;
                    enumC30774g5 = enumC30774g17;
                    c28655q2 = c28655q4;
                    c28655q2.m87173q(false);
                    interfaceC39332e24 = interfaceC39332e311111111;
                } else {
                    interfaceC39332e24 = interfaceC39332e22;
                    c28655q2 = c28655q4;
                    enumC30774g5 = enumC30774g4;
                    f39 = f34;
                    c28655q2.m87150e0(-1484258197);
                    c28655q2.m87173q(false);
                }
                if (interfaceC39332e18 != null) {
                    c28655q2.m87150e0(-1484207853);
                    if (c39174f4 != null) {
                        c28655q2.m87150e0(-1484170901);
                        m94538l(c39174f4.f168413w * fMo740m0, interfaceC39332e18, c28655q2, (i64 >> 3) & 112);
                        z47 = false;
                        c28655q2.m87173q(false);
                    } else {
                        z47 = false;
                        c28655q2.m87150e0(-1484069779);
                        m94538l(f39, interfaceC39332e18, c28655q2, (i64 >> 3) & 112);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(z47);
                } else {
                    c28655q2.m87150e0(-1483969525);
                    c28655q2.m87173q(false);
                }
                if (interfaceC39332e17 != null) {
                    c28655q2.m87150e0(-1483927334);
                    boolean z51111 = z29;
                    InterfaceC39332e interfaceC39332e311111112 = interfaceC39332e17;
                    m94540n(f39, z51111, f28, interfaceC39332e311111112, c28655q2, (i64 & 7168) | ((i64 >> 12) & 112) | ((i64 >> 6) & 896));
                    z44 = z51111;
                    interfaceC39332e25 = interfaceC39332e311111112;
                    z45 = false;
                    c28655q2.m87173q(false);
                } else {
                    z44 = z29;
                    interfaceC39332e25 = interfaceC39332e17;
                    z45 = false;
                    c28655q2.m87150e0(-1483818741);
                    c28655q2.m87173q(false);
                }
                Modifier modifierM3407d12 = AbstractC1102d.m3407d(1.0f, c2314t6);
                InterfaceC39127r0 interfaceC39127r0M66763d18 = AbstractC22989q.m66763d(c2307m6, z45);
                boolean z51112 = z44;
                float f4110 = f28;
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q2.m87165m();
                Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q2, modifierM3407d12);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i112, interfaceC39127r0M66763d18);
                AbstractC28683x.m87239G(c28655q2, c0209i113, interfaceC28653p1M87165m18);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i115, modifierM118962N18);
                textResource3 = textResource112;
                C39174f c39174f16 = c39174f4;
                z46 = z45;
                c28655q3 = c28655q2;
                InterfaceC39332e interfaceC39332e311111113 = interfaceC39332e18;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource3, c28655q2, i75), null, interfaceC39332e31122.mo134584toComposableColorWaAFU9c(c28655q2, (i67 >> 6) & 14), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q2, 6).getN8(), null, c28655q3, 0, 0, 196602);
                if (interfaceC39332e23 != null) {
                    c28655q3.m87150e0(-1057261933);
                    InterfaceC39332e interfaceC39332e311111114 = interfaceC39332e23;
                    InterfaceC39332e interfaceC39332e311111115 = interfaceC39332e19;
                    InterfaceC39332e interfaceC39332e311111116 = interfaceC39332e20;
                    m94544r(interfaceC39332e311111114, interfaceC39332e311111115, interfaceC39332e311111116, f36, f38, c28655q3, (i67 >> 21) & 1022);
                    interfaceC39332e26 = interfaceC39332e311111114;
                    interfaceC39332e27 = interfaceC39332e311111115;
                    interfaceC39332e28 = interfaceC39332e311111116;
                    c28655q3.m87173q(z46);
                } else {
                    interfaceC39332e26 = interfaceC39332e23;
                    interfaceC39332e27 = interfaceC39332e19;
                    interfaceC39332e28 = interfaceC39332e20;
                    c28655q3.m87150e0(-1056987087);
                    c28655q3.m87173q(z46);
                }
                c28655q3.m87173q(true);
                c28655q3.m87173q(true);
                f16 = f4110;
                z18 = z51112;
                interfaceC39332e10 = interfaceC39332e25;
                c39174f2 = c39174f16;
                interfaceC39332e11 = interfaceC39332e31122;
                interfaceC39332e13 = interfaceC39332e311111113;
                z19 = z5118;
                enumC30774g2 = enumC30774g5;
                interfaceC4339a2 = interfaceC4339a9;
                c28655q = c28655q3;
                interfaceC39332e9 = interfaceC39332e27;
                interfaceC39332e12 = interfaceC39332e28;
                interfaceC39332e8 = interfaceC39332e26;
                modifier2 = modifier10;
                z17 = z35;
                f18 = f29;
                f17 = f27;
                z24 = z34;
                textResource4 = textResource110;
                interfaceC39332e14 = interfaceC39332e24;
            } else {
                c28655q4.m87138X();
                modifier2 = modifier;
                enumC30774g2 = enumC30774g;
                interfaceC39332e8 = interfaceC39332e3;
                z17 = z4;
                f16 = f14;
                z18 = z13;
                f17 = f15;
                z19 = z14;
                z24 = z15;
                interfaceC4339a2 = interfaceC4339a;
                interfaceC39332e9 = interfaceC39332e29;
                interfaceC39332e10 = interfaceC39332e7;
                c28655q = c28655q4;
                textResource3 = textResourceM21267a;
                interfaceC39332e11 = interfaceC39332e;
                c39174f2 = c39174f;
                f18 = f13;
                interfaceC39332e12 = interfaceC39332e30;
                textResource4 = textResourceM21267a2;
                interfaceC39332e13 = interfaceC39332e31;
                interfaceC39332e14 = interfaceC39332e2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: qy0.e
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC30773f.m94552z(modifier2, textResource3, interfaceC39332e11, textResource4, interfaceC39332e14, c39174f2, enumC30774g2, interfaceC39332e8, interfaceC39332e9, interfaceC39332e12, z17, f18, interfaceC39332e13, interfaceC39332e10, f16, z18, f17, z19, z24, interfaceC4339a2, i13, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        i17 = i15 & 64;
        if (i17 != 0) {
            i16 |= 1572864;
        } else if ((i13 & 1572864) == 0) {
            if (enumC30774g == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = enumC30774g.ordinal();
            }
            if (c28655q4.m87149e(iOrdinal)) {
                i18 = 1048576;
            } else {
                i18 = 524288;
            }
            i16 |= i18;
        }
        i19 = i15 & 128;
        if (i19 != 0) {
            i16 |= 12582912;
        } else if ((i13 & 12582912) == 0) {
            if ((i13 & 16777216) == 0) {
                zM87157i = c28655q4.m87153g(interfaceC39332e3);
            } else {
                zM87157i = c28655q4.m87157i(interfaceC39332e3);
            }
            if (zM87157i) {
                i24 = 8388608;
            } else {
                i24 = 4194304;
            }
            i16 |= i24;
        }
        i25 = i15 & 256;
        i26 = AndroidSDKConstants.FLAG_MUTABLE;
        if (i25 != 0) {
            i16 |= 100663296;
        } else if ((i13 & 100663296) == 0) {
            if ((i13 & 134217728) == 0) {
                zM87157i2 = c28655q4.m87153g(interfaceC39332e29);
            } else {
                zM87157i2 = c28655q4.m87157i(interfaceC39332e29);
            }
            if (zM87157i2) {
                i27 = 67108864;
            } else {
                i27 = 33554432;
            }
            i16 |= i27;
        }
        i28 = i15 & 512;
        if (i28 != 0) {
            i16 |= 805306368;
        } else if ((i13 & 805306368) == 0) {
            if ((i13 & 1073741824) == 0) {
                zM87157i3 = c28655q4.m87153g(interfaceC39332e30);
            } else {
                zM87157i3 = c28655q4.m87157i(interfaceC39332e30);
            }
            if (zM87157i3) {
                i29 = 536870912;
            } else {
                i29 = 268435456;
            }
            i16 |= i29;
        }
        i34 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i34 != 0) {
            i35 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            if (c28655q4.m87155h(z4)) {
                i36 = 4;
            } else {
                i36 = 2;
            }
            i35 = i14 | i36;
        } else {
            i35 = i14;
        }
        i37 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
        if (i37 != 0) {
            i35 |= 48;
        } else if ((i14 & 48) != 0) {
            i35 |= c28655q4.m87153g(f13) ? 32 : 16;
        }
        i38 = i35;
        i39 = i15 & 4096;
        if (i39 != 0) {
            i44 = i38 | 384;
        } else if ((i14 & 384) == 0) {
            if ((i14 & 512) == 0) {
                zM87157i4 = c28655q4.m87153g(interfaceC39332e31);
            } else {
                zM87157i4 = c28655q4.m87157i(interfaceC39332e31);
            }
            i44 = i38 | (zM87157i4 ? 256 : 128);
        } else {
            i44 = i38;
        }
        i45 = i15 & DfuBaseService.ERROR_REMOTE_MASK;
        if (i45 != 0) {
            i47 = i44 | 3072;
        } else {
            i46 = i44;
            if ((i14 & 3072) == 0) {
                if ((i14 & 4096) == 0) {
                    zM87157i5 = c28655q4.m87153g(interfaceC39332e7);
                } else {
                    zM87157i5 = c28655q4.m87157i(interfaceC39332e7);
                }
                if (zM87157i5) {
                    i83 = 2048;
                }
                i47 = i46 | i83;
            } else {
                i47 = i46;
            }
        }
        i48 = i15 & DfuBaseService.ERROR_CONNECTION_MASK;
        if (i48 != 0) {
            i49 = i47;
            if ((i14 & 24576) == 0) {
                if (c28655q4.m87147d(f14)) {
                    i85 = 16384;
                }
                i49 |= i85;
            }
            i54 = i15 & 32768;
            if (i54 != 0) {
                i49 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q4.m87155h(z13)) {
                    i55 = 131072;
                } else {
                    i55 = 65536;
                }
                i49 |= i55;
            }
            i56 = i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            if (i56 != 0) {
                i49 |= 1572864;
            } else if ((i14 & 1572864) == 0) {
                i49 |= c28655q4.m87147d(f15) ? 1048576 : 524288;
            }
            i57 = i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            if (i57 != 0) {
                i49 |= 12582912;
            } else if ((i14 & 12582912) == 0) {
                i49 |= c28655q4.m87155h(z14) ? 8388608 : 4194304;
            }
            i58 = i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION;
            if (i58 != 0) {
                i49 |= 100663296;
            } else if ((i14 & 100663296) == 0) {
                if (c28655q4.m87155h(z15)) {
                    i26 = 67108864;
                }
                i49 |= i26;
            }
            i59 = i15 & 524288;
            if (i59 != 0) {
                i49 |= 805306368;
            } else if ((i14 & 805306368) == 0) {
                i49 |= c28655q4.m87157i(interfaceC4339a) ? 536870912 : 268435456;
            }
            i64 = i49;
            if ((i16 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (c28655q4.m87135U(i16 & 1, z16)) {
                c28655q4.m87140Z();
                i65 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i65 != 0) {
                    if (i78 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier;
                    }
                    if ((i15 & 2) != 0) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                        i16 &= -113;
                    }
                    if ((i15 & 4) != 0) {
                        objM87133R2 = c28655q4.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = a.f126731w;
                            c28655q4.m87172p0(objM87133R2);
                        }
                        interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R2);
                        i16 &= -897;
                    } else {
                        interfaceC39332eM125323a = interfaceC39332e;
                    }
                    if ((i15 & 8) != 0) {
                        textResourceM21267a2 = AbstractC8693b.m21267a();
                        i16 &= -7169;
                    }
                    if (i84 != 0) {
                        interfaceC39332e15 = null;
                    } else {
                        interfaceC39332e15 = interfaceC39332e2;
                    }
                    if (i86 != 0) {
                        c39174f3 = null;
                    } else {
                        c39174f3 = c39174f;
                    }
                    if (i17 != 0) {
                        enumC30774g3 = EnumC30774g.NONE;
                    } else {
                        enumC30774g3 = enumC30774g;
                    }
                    if (i19 != 0) {
                        interfaceC39332e16 = null;
                    } else {
                        interfaceC39332e16 = interfaceC39332e3;
                    }
                    if (i25 != 0) {
                        interfaceC39332e29 = null;
                    }
                    if (i28 != 0) {
                        interfaceC39332e30 = null;
                    }
                    if (i34 != 0) {
                        z25 = false;
                    } else {
                        z25 = z4;
                    }
                    if (i37 != 0) {
                        f19 = null;
                    } else {
                        f19 = f13;
                    }
                    if (i39 != 0) {
                        interfaceC39332e31 = null;
                    }
                    if (i45 == 0) {
                    }
                    i66 = i16;
                    if (i48 != 0) {
                        f24 = (float) 1.5d;
                    } else {
                        f24 = f14;
                    }
                    if (i54 != 0) {
                        z26 = false;
                    } else {
                        z26 = z13;
                    }
                    if (i56 != 0) {
                        f25 = 7 * 4;
                    } else {
                        f25 = f15;
                    }
                    if (i57 != 0) {
                        z27 = true;
                    } else {
                        z27 = z14;
                    }
                    if (i58 != 0) {
                        z28 = false;
                    } else {
                        z28 = z15;
                    }
                    f26 = f25;
                    if (i59 != 0) {
                        objM87133R = c28655q4.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C30654e(3);
                            c28655q4.m87172p0(objM87133R);
                        }
                        TextResource textResource113 = textResourceM21267a2;
                        interfaceC39332e18 = interfaceC39332e31;
                        textResource5 = textResource113;
                        i67 = i66;
                        interfaceC39332e19 = interfaceC39332e29;
                        f27 = f26;
                        interfaceC39332e20 = interfaceC39332e30;
                        f28 = f24;
                        interfaceC39332e21 = interfaceC39332eM125323a;
                        textResource6 = textResourceM21267a;
                        z29 = z26;
                        z34 = z28;
                        interfaceC39332e22 = interfaceC39332e15;
                        c39174f4 = c39174f3;
                        enumC30774g4 = enumC30774g3;
                        interfaceC39332e23 = interfaceC39332e16;
                        z35 = z25;
                        f29 = f19;
                        z36 = z27;
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                        modifier4 = modifier3;
                    } else {
                        boolean z417 = z27;
                        TextResource textResource114 = textResourceM21267a2;
                        interfaceC39332e18 = interfaceC39332e31;
                        textResource5 = textResource114;
                        i67 = i66;
                        interfaceC39332e19 = interfaceC39332e29;
                        f27 = f26;
                        interfaceC39332e20 = interfaceC39332e30;
                        f28 = f24;
                        interfaceC39332e21 = interfaceC39332eM125323a;
                        textResource6 = textResourceM21267a;
                        z29 = z26;
                        z34 = z28;
                        modifier4 = modifier3;
                        interfaceC39332e22 = interfaceC39332e15;
                        c39174f4 = c39174f3;
                        enumC30774g4 = enumC30774g3;
                        interfaceC39332e23 = interfaceC39332e16;
                        z35 = z25;
                        f29 = f19;
                        z36 = z417;
                        interfaceC4339a3 = interfaceC4339a;
                    }
                } else {
                    if (i78 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier;
                    }
                    if ((i15 & 2) != 0) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                        i16 &= -113;
                    }
                    if ((i15 & 4) != 0) {
                        objM87133R2 = c28655q4.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = a.f126731w;
                            c28655q4.m87172p0(objM87133R2);
                        }
                        interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R2);
                        i16 &= -897;
                    } else {
                        interfaceC39332eM125323a = interfaceC39332e;
                    }
                    if ((i15 & 8) != 0) {
                        textResourceM21267a2 = AbstractC8693b.m21267a();
                        i16 &= -7169;
                    }
                    if (i84 != 0) {
                        interfaceC39332e15 = null;
                    } else {
                        interfaceC39332e15 = interfaceC39332e2;
                    }
                    if (i86 != 0) {
                        c39174f3 = null;
                    } else {
                        c39174f3 = c39174f;
                    }
                    if (i17 != 0) {
                        enumC30774g3 = EnumC30774g.NONE;
                    } else {
                        enumC30774g3 = enumC30774g;
                    }
                    if (i19 != 0) {
                        interfaceC39332e16 = null;
                    } else {
                        interfaceC39332e16 = interfaceC39332e3;
                    }
                    if (i25 != 0) {
                        interfaceC39332e29 = null;
                    }
                    if (i28 != 0) {
                        interfaceC39332e30 = null;
                    }
                    if (i34 != 0) {
                        z25 = false;
                    } else {
                        z25 = z4;
                    }
                    if (i37 != 0) {
                        f19 = null;
                    } else {
                        f19 = f13;
                    }
                    if (i39 != 0) {
                        interfaceC39332e31 = null;
                    }
                    if (i45 == 0) {
                    }
                    i66 = i16;
                    if (i48 != 0) {
                        f24 = (float) 1.5d;
                    } else {
                        f24 = f14;
                    }
                    if (i54 != 0) {
                        z26 = false;
                    } else {
                        z26 = z13;
                    }
                    if (i56 != 0) {
                        f25 = 7 * 4;
                    } else {
                        f25 = f15;
                    }
                    if (i57 != 0) {
                        z27 = true;
                    } else {
                        z27 = z14;
                    }
                    if (i58 != 0) {
                        z28 = false;
                    } else {
                        z28 = z15;
                    }
                    f26 = f25;
                    if (i59 != 0) {
                        objM87133R = c28655q4.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C30654e(3);
                            c28655q4.m87172p0(objM87133R);
                        }
                        TextResource textResource115 = textResourceM21267a2;
                        interfaceC39332e18 = interfaceC39332e31;
                        textResource5 = textResource115;
                        i67 = i66;
                        interfaceC39332e19 = interfaceC39332e29;
                        f27 = f26;
                        interfaceC39332e20 = interfaceC39332e30;
                        f28 = f24;
                        interfaceC39332e21 = interfaceC39332eM125323a;
                        textResource6 = textResourceM21267a;
                        z29 = z26;
                        z34 = z28;
                        interfaceC39332e22 = interfaceC39332e15;
                        c39174f4 = c39174f3;
                        enumC30774g4 = enumC30774g3;
                        interfaceC39332e23 = interfaceC39332e16;
                        z35 = z25;
                        f29 = f19;
                        z36 = z27;
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                        modifier4 = modifier3;
                    } else {
                        boolean z418 = z27;
                        TextResource textResource116 = textResourceM21267a2;
                        interfaceC39332e18 = interfaceC39332e31;
                        textResource5 = textResource116;
                        i67 = i66;
                        interfaceC39332e19 = interfaceC39332e29;
                        f27 = f26;
                        interfaceC39332e20 = interfaceC39332e30;
                        f28 = f24;
                        interfaceC39332e21 = interfaceC39332eM125323a;
                        textResource6 = textResourceM21267a;
                        z29 = z26;
                        z34 = z28;
                        modifier4 = modifier3;
                        interfaceC39332e22 = interfaceC39332e15;
                        c39174f4 = c39174f3;
                        enumC30774g4 = enumC30774g3;
                        interfaceC39332e23 = interfaceC39332e16;
                        z35 = z25;
                        f29 = f19;
                        z36 = z418;
                        interfaceC4339a3 = interfaceC4339a;
                    }
                }
                c28655q4.m87175r();
                objM87133R3 = c28655q4.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC11266d.m30453g(c28655q4);
                }
                InterfaceC21083i interfaceC21083i4 = (InterfaceC21083i) objM87133R3;
                strM21274h = AbstractC8693b.m21274h(textResource5, c28655q4, (i67 >> 9) & 14);
                TextResource textResource117 = textResource5;
                fMo740m0 = ((InterfaceC39171c) c28655q4.m87161k(AbstractC2453v1.f9569h)).getFontScale();
                f34 = f27 * fMo740m0;
                if (f29 != null) {
                    fFloatValue = f29.floatValue();
                } else {
                    if (z35) {
                        fFloatValue = 2.0f;
                    } else {
                        i68 = 4;
                        fFloatValue = 1.0f;
                    }
                    f35 = i68;
                    f36 = fFloatValue * f35 * fMo740m0;
                    if (z35) {
                        f37 = (((3 * f34) / f35) - (f36 / f35)) + f28;
                    } else {
                        float f4111 = 2;
                        f37 = (f28 / f4111) + ((f34 / f4111) - (f36 / f4111));
                    }
                    i69 = i67 >> 3;
                    f38 = f37;
                    i74 = i69 & 14;
                    InterfaceC39332e interfaceC39332e31123 = interfaceC39332e21;
                    TextResource textResource118 = textResource6;
                    String str7 = "home_calendar_date_" + AbstractC8693b.m21274h(textResource6, c28655q4, i74);
                    C2314t c2314t7 = C2314t.f9131w;
                    Modifier modifierM44101d7 = AbstractC15676d.m44101d(c2314t7, str7);
                    InterfaceC13832v0 interfaceC13832v6 = (InterfaceC13832v0) c28655q4.m87161k(AbstractC1095d.f4515a);
                    if ((i64 & 29360128) == 8388608) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    boolean z419 = z37;
                    if ((1879048192 & i64) == 536870912) {
                        z38 = true;
                    } else {
                        z38 = false;
                    }
                    z39 = z419 | z38;
                    objM87133R4 = c28655q4.m87133R();
                    if (z39) {
                        objM87133R4 = new C12203c(4, interfaceC4339a3, z36);
                        c28655q4.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C12203c(4, interfaceC4339a3, z36);
                        c28655q4.m87172p0(objM87133R4);
                    }
                    Modifier modifierMo3471e7 = AbstractC1102d.m3407d(1.0f, AbstractC1092a.m3360e(modifierM44101d7, interfaceC21083i4, interfaceC13832v6, false, null, (InterfaceC4339a) objM87133R4, 28)).mo3471e(modifier4);
                    zM87153g = c28655q4.m87153g(strM21274h);
                    Modifier modifier11 = modifier4;
                    objM87133R5 = c28655q4.m87133R();
                    if (zM87153g) {
                        objM87133R5 = new C17632d(strM21274h, 29);
                        c28655q4.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new C17632d(strM21274h, 29);
                        c28655q4.m87172p0(objM87133R5);
                    }
                    Modifier modifierM51775c7 = AbstractC18032n.m51775c(modifierMo3471e7, true, (Function1) objM87133R5);
                    C2307m c2307m7 = C2299e.f9102E;
                    InterfaceC39127r0 interfaceC39127r0M66763d19 = AbstractC22989q.m66763d(c2307m7, false);
                    iHashCode = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q4.m87165m();
                    Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q4, modifierM51775c7);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q4.m87158i0();
                    boolean z51113 = z36;
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    C0209i c0209i116 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q4, c0209i116, interfaceC39127r0M66763d19);
                    C0209i c0209i117 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q4, c0209i117, interfaceC28653p1M87165m19);
                    c0209i = C0217k.f732j;
                    InterfaceC4339a interfaceC4339a10 = interfaceC4339a3;
                    if (c28655q4.f115903S) {
                        i75 = i74;
                        if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i118 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q4, c0209i118, modifierM118962N19);
                        if (interfaceC39332e22 != null) {
                            c28655q4.m87150e0(-1484429813);
                            c28655q4.m87173q(false);
                        } else {
                            c28655q4.m87150e0(-1484429813);
                            c28655q4.m87173q(false);
                        }
                        if (z34) {
                            c28655q4.m87150e0(-1484387932);
                            InterfaceC39332e interfaceC39332e311111117 = interfaceC39332e22;
                            EnumC30774g enumC30774g18 = enumC30774g4;
                            m94525A(fMo740m0, f28, interfaceC39332e311111117, interfaceC39332e17, f34, enumC30774g18, c28655q4, ((i64 >> 9) & 112) | ((i67 >> 6) & 896) | (i64 & 7168) | (i69 & 458752));
                            f39 = f34;
                            enumC30774g5 = enumC30774g18;
                            c28655q2 = c28655q4;
                            c28655q2.m87173q(false);
                            interfaceC39332e24 = interfaceC39332e311111117;
                        } else {
                            interfaceC39332e24 = interfaceC39332e22;
                            c28655q2 = c28655q4;
                            enumC30774g5 = enumC30774g4;
                            f39 = f34;
                            c28655q2.m87150e0(-1484258197);
                            c28655q2.m87173q(false);
                        }
                        if (interfaceC39332e18 != null) {
                            c28655q2.m87150e0(-1484207853);
                            if (c39174f4 != null) {
                                c28655q2.m87150e0(-1484170901);
                                m94538l(c39174f4.f168413w * fMo740m0, interfaceC39332e18, c28655q2, (i64 >> 3) & 112);
                                z47 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z47 = false;
                                c28655q2.m87150e0(-1484069779);
                                m94538l(f39, interfaceC39332e18, c28655q2, (i64 >> 3) & 112);
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(z47);
                        } else {
                            c28655q2.m87150e0(-1483969525);
                            c28655q2.m87173q(false);
                        }
                        if (interfaceC39332e17 != null) {
                            c28655q2.m87150e0(-1483927334);
                            boolean z51114 = z29;
                            InterfaceC39332e interfaceC39332e311111118 = interfaceC39332e17;
                            m94540n(f39, z51114, f28, interfaceC39332e311111118, c28655q2, (i64 & 7168) | ((i64 >> 12) & 112) | ((i64 >> 6) & 896));
                            z44 = z51114;
                            interfaceC39332e25 = interfaceC39332e311111118;
                            z45 = false;
                            c28655q2.m87173q(false);
                        } else {
                            z44 = z29;
                            interfaceC39332e25 = interfaceC39332e17;
                            z45 = false;
                            c28655q2.m87150e0(-1483818741);
                            c28655q2.m87173q(false);
                        }
                        Modifier modifierM3407d13 = AbstractC1102d.m3407d(1.0f, c2314t7);
                        InterfaceC39127r0 interfaceC39127r0M66763d110 = AbstractC22989q.m66763d(c2307m7, z45);
                        boolean z51115 = z44;
                        float f4112 = f28;
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q2.m87165m();
                        Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q2, modifierM3407d13);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i116, interfaceC39127r0M66763d110);
                        AbstractC28683x.m87239G(c28655q2, c0209i117, interfaceC28653p1M87165m110);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i118, modifierM118962N110);
                        textResource3 = textResource118;
                        C39174f c39174f17 = c39174f4;
                        z46 = z45;
                        c28655q3 = c28655q2;
                        InterfaceC39332e interfaceC39332e311111119 = interfaceC39332e18;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource3, c28655q2, i75), null, interfaceC39332e31123.mo134584toComposableColorWaAFU9c(c28655q2, (i67 >> 6) & 14), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q2, 6).getN8(), null, c28655q3, 0, 0, 196602);
                        if (interfaceC39332e23 != null) {
                            c28655q3.m87150e0(-1057261933);
                            InterfaceC39332e interfaceC39332e3111111110 = interfaceC39332e23;
                            InterfaceC39332e interfaceC39332e3111111111 = interfaceC39332e19;
                            InterfaceC39332e interfaceC39332e3111111112 = interfaceC39332e20;
                            m94544r(interfaceC39332e3111111110, interfaceC39332e3111111111, interfaceC39332e3111111112, f36, f38, c28655q3, (i67 >> 21) & 1022);
                            interfaceC39332e26 = interfaceC39332e3111111110;
                            interfaceC39332e27 = interfaceC39332e3111111111;
                            interfaceC39332e28 = interfaceC39332e3111111112;
                            c28655q3.m87173q(z46);
                        } else {
                            interfaceC39332e26 = interfaceC39332e23;
                            interfaceC39332e27 = interfaceC39332e19;
                            interfaceC39332e28 = interfaceC39332e20;
                            c28655q3.m87150e0(-1056987087);
                            c28655q3.m87173q(z46);
                        }
                        c28655q3.m87173q(true);
                        c28655q3.m87173q(true);
                        f16 = f4112;
                        z18 = z51115;
                        interfaceC39332e10 = interfaceC39332e25;
                        c39174f2 = c39174f17;
                        interfaceC39332e11 = interfaceC39332e31123;
                        interfaceC39332e13 = interfaceC39332e311111119;
                        z19 = z51113;
                        enumC30774g2 = enumC30774g5;
                        interfaceC4339a2 = interfaceC4339a10;
                        c28655q = c28655q3;
                        interfaceC39332e9 = interfaceC39332e27;
                        interfaceC39332e12 = interfaceC39332e28;
                        interfaceC39332e8 = interfaceC39332e26;
                        modifier2 = modifier11;
                        z17 = z35;
                        f18 = f29;
                        f17 = f27;
                        z24 = z34;
                        textResource4 = textResource117;
                        interfaceC39332e14 = interfaceC39332e24;
                    } else {
                        i75 = i74;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    C0209i c0209i119 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q4, c0209i119, modifierM118962N19);
                    if (interfaceC39332e22 != null) {
                        c28655q4.m87150e0(-1484429813);
                        c28655q4.m87173q(false);
                    } else {
                        c28655q4.m87150e0(-1484429813);
                        c28655q4.m87173q(false);
                    }
                    if (z34) {
                        c28655q4.m87150e0(-1484387932);
                        InterfaceC39332e interfaceC39332e3111111113 = interfaceC39332e22;
                        EnumC30774g enumC30774g19 = enumC30774g4;
                        m94525A(fMo740m0, f28, interfaceC39332e3111111113, interfaceC39332e17, f34, enumC30774g19, c28655q4, ((i64 >> 9) & 112) | ((i67 >> 6) & 896) | (i64 & 7168) | (i69 & 458752));
                        f39 = f34;
                        enumC30774g5 = enumC30774g19;
                        c28655q2 = c28655q4;
                        c28655q2.m87173q(false);
                        interfaceC39332e24 = interfaceC39332e3111111113;
                    } else {
                        interfaceC39332e24 = interfaceC39332e22;
                        c28655q2 = c28655q4;
                        enumC30774g5 = enumC30774g4;
                        f39 = f34;
                        c28655q2.m87150e0(-1484258197);
                        c28655q2.m87173q(false);
                    }
                    if (interfaceC39332e18 != null) {
                        c28655q2.m87150e0(-1484207853);
                        if (c39174f4 != null) {
                            c28655q2.m87150e0(-1484170901);
                            m94538l(c39174f4.f168413w * fMo740m0, interfaceC39332e18, c28655q2, (i64 >> 3) & 112);
                            z47 = false;
                            c28655q2.m87173q(false);
                        } else {
                            z47 = false;
                            c28655q2.m87150e0(-1484069779);
                            m94538l(f39, interfaceC39332e18, c28655q2, (i64 >> 3) & 112);
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(z47);
                    } else {
                        c28655q2.m87150e0(-1483969525);
                        c28655q2.m87173q(false);
                    }
                    if (interfaceC39332e17 != null) {
                        c28655q2.m87150e0(-1483927334);
                        boolean z51116 = z29;
                        InterfaceC39332e interfaceC39332e3111111114 = interfaceC39332e17;
                        m94540n(f39, z51116, f28, interfaceC39332e3111111114, c28655q2, (i64 & 7168) | ((i64 >> 12) & 112) | ((i64 >> 6) & 896));
                        z44 = z51116;
                        interfaceC39332e25 = interfaceC39332e3111111114;
                        z45 = false;
                        c28655q2.m87173q(false);
                    } else {
                        z44 = z29;
                        interfaceC39332e25 = interfaceC39332e17;
                        z45 = false;
                        c28655q2.m87150e0(-1483818741);
                        c28655q2.m87173q(false);
                    }
                    Modifier modifierM3407d14 = AbstractC1102d.m3407d(1.0f, c2314t7);
                    InterfaceC39127r0 interfaceC39127r0M66763d111 = AbstractC22989q.m66763d(c2307m7, z45);
                    boolean z51117 = z44;
                    float f4113 = f28;
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q2.m87165m();
                    Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q2, modifierM3407d14);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i116, interfaceC39127r0M66763d111);
                    AbstractC28683x.m87239G(c28655q2, c0209i117, interfaceC28653p1M87165m111);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i119, modifierM118962N111);
                    textResource3 = textResource118;
                    C39174f c39174f18 = c39174f4;
                    z46 = z45;
                    c28655q3 = c28655q2;
                    InterfaceC39332e interfaceC39332e3111111115 = interfaceC39332e18;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource3, c28655q2, i75), null, interfaceC39332e31123.mo134584toComposableColorWaAFU9c(c28655q2, (i67 >> 6) & 14), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q2, 6).getN8(), null, c28655q3, 0, 0, 196602);
                    if (interfaceC39332e23 != null) {
                        c28655q3.m87150e0(-1057261933);
                        InterfaceC39332e interfaceC39332e3111111116 = interfaceC39332e23;
                        InterfaceC39332e interfaceC39332e3111111117 = interfaceC39332e19;
                        InterfaceC39332e interfaceC39332e3111111118 = interfaceC39332e20;
                        m94544r(interfaceC39332e3111111116, interfaceC39332e3111111117, interfaceC39332e3111111118, f36, f38, c28655q3, (i67 >> 21) & 1022);
                        interfaceC39332e26 = interfaceC39332e3111111116;
                        interfaceC39332e27 = interfaceC39332e3111111117;
                        interfaceC39332e28 = interfaceC39332e3111111118;
                        c28655q3.m87173q(z46);
                    } else {
                        interfaceC39332e26 = interfaceC39332e23;
                        interfaceC39332e27 = interfaceC39332e19;
                        interfaceC39332e28 = interfaceC39332e20;
                        c28655q3.m87150e0(-1056987087);
                        c28655q3.m87173q(z46);
                    }
                    c28655q3.m87173q(true);
                    c28655q3.m87173q(true);
                    f16 = f4113;
                    z18 = z51117;
                    interfaceC39332e10 = interfaceC39332e25;
                    c39174f2 = c39174f18;
                    interfaceC39332e11 = interfaceC39332e31123;
                    interfaceC39332e13 = interfaceC39332e3111111115;
                    z19 = z51113;
                    enumC30774g2 = enumC30774g5;
                    interfaceC4339a2 = interfaceC4339a10;
                    c28655q = c28655q3;
                    interfaceC39332e9 = interfaceC39332e27;
                    interfaceC39332e12 = interfaceC39332e28;
                    interfaceC39332e8 = interfaceC39332e26;
                    modifier2 = modifier11;
                    z17 = z35;
                    f18 = f29;
                    f17 = f27;
                    z24 = z34;
                    textResource4 = textResource117;
                    interfaceC39332e14 = interfaceC39332e24;
                }
                i68 = 4;
                f35 = i68;
                f36 = fFloatValue * f35 * fMo740m0;
                if (z35) {
                    f37 = (((3 * f34) / f35) - (f36 / f35)) + f28;
                } else {
                    float f4114 = 2;
                    f37 = (f28 / f4114) + ((f34 / f4114) - (f36 / f4114));
                }
                i69 = i67 >> 3;
                f38 = f37;
                i74 = i69 & 14;
                InterfaceC39332e interfaceC39332e31124 = interfaceC39332e21;
                TextResource textResource119 = textResource6;
                String str8 = "home_calendar_date_" + AbstractC8693b.m21274h(textResource6, c28655q4, i74);
                C2314t c2314t8 = C2314t.f9131w;
                Modifier modifierM44101d8 = AbstractC15676d.m44101d(c2314t8, str8);
                InterfaceC13832v0 interfaceC13832v7 = (InterfaceC13832v0) c28655q4.m87161k(AbstractC1095d.f4515a);
                if ((i64 & 29360128) == 8388608) {
                    z37 = true;
                } else {
                    z37 = false;
                }
                boolean z4110 = z37;
                if ((1879048192 & i64) == 536870912) {
                    z38 = true;
                } else {
                    z38 = false;
                }
                z39 = z4110 | z38;
                objM87133R4 = c28655q4.m87133R();
                if (z39) {
                    objM87133R4 = new C12203c(4, interfaceC4339a3, z36);
                    c28655q4.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C12203c(4, interfaceC4339a3, z36);
                    c28655q4.m87172p0(objM87133R4);
                }
                Modifier modifierMo3471e8 = AbstractC1102d.m3407d(1.0f, AbstractC1092a.m3360e(modifierM44101d8, interfaceC21083i4, interfaceC13832v7, false, null, (InterfaceC4339a) objM87133R4, 28)).mo3471e(modifier4);
                zM87153g = c28655q4.m87153g(strM21274h);
                Modifier modifier12 = modifier4;
                objM87133R5 = c28655q4.m87133R();
                if (zM87153g) {
                    objM87133R5 = new C17632d(strM21274h, 29);
                    c28655q4.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new C17632d(strM21274h, 29);
                    c28655q4.m87172p0(objM87133R5);
                }
                Modifier modifierM51775c8 = AbstractC18032n.m51775c(modifierMo3471e8, true, (Function1) objM87133R5);
                C2307m c2307m8 = C2299e.f9102E;
                InterfaceC39127r0 interfaceC39127r0M66763d112 = AbstractC22989q.m66763d(c2307m8, false);
                iHashCode = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q4.m87165m();
                Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q4, modifierM51775c8);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q4.m87158i0();
                boolean z51118 = z36;
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                C0209i c0209i1110 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q4, c0209i1110, interfaceC39127r0M66763d112);
                C0209i c0209i1111 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q4, c0209i1111, interfaceC28653p1M87165m112);
                c0209i = C0217k.f732j;
                InterfaceC4339a interfaceC4339a11 = interfaceC4339a3;
                if (c28655q4.f115903S) {
                    i75 = i74;
                    if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i1112 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q4, c0209i1112, modifierM118962N112);
                    if (interfaceC39332e22 != null) {
                        c28655q4.m87150e0(-1484429813);
                        c28655q4.m87173q(false);
                    } else {
                        c28655q4.m87150e0(-1484429813);
                        c28655q4.m87173q(false);
                    }
                    if (z34) {
                        c28655q4.m87150e0(-1484387932);
                        InterfaceC39332e interfaceC39332e3111111119 = interfaceC39332e22;
                        EnumC30774g enumC30774g110 = enumC30774g4;
                        m94525A(fMo740m0, f28, interfaceC39332e3111111119, interfaceC39332e17, f34, enumC30774g110, c28655q4, ((i64 >> 9) & 112) | ((i67 >> 6) & 896) | (i64 & 7168) | (i69 & 458752));
                        f39 = f34;
                        enumC30774g5 = enumC30774g110;
                        c28655q2 = c28655q4;
                        c28655q2.m87173q(false);
                        interfaceC39332e24 = interfaceC39332e3111111119;
                    } else {
                        interfaceC39332e24 = interfaceC39332e22;
                        c28655q2 = c28655q4;
                        enumC30774g5 = enumC30774g4;
                        f39 = f34;
                        c28655q2.m87150e0(-1484258197);
                        c28655q2.m87173q(false);
                    }
                    if (interfaceC39332e18 != null) {
                        c28655q2.m87150e0(-1484207853);
                        if (c39174f4 != null) {
                            c28655q2.m87150e0(-1484170901);
                            m94538l(c39174f4.f168413w * fMo740m0, interfaceC39332e18, c28655q2, (i64 >> 3) & 112);
                            z47 = false;
                            c28655q2.m87173q(false);
                        } else {
                            z47 = false;
                            c28655q2.m87150e0(-1484069779);
                            m94538l(f39, interfaceC39332e18, c28655q2, (i64 >> 3) & 112);
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(z47);
                    } else {
                        c28655q2.m87150e0(-1483969525);
                        c28655q2.m87173q(false);
                    }
                    if (interfaceC39332e17 != null) {
                        c28655q2.m87150e0(-1483927334);
                        boolean z51119 = z29;
                        InterfaceC39332e interfaceC39332e31111111110 = interfaceC39332e17;
                        m94540n(f39, z51119, f28, interfaceC39332e31111111110, c28655q2, (i64 & 7168) | ((i64 >> 12) & 112) | ((i64 >> 6) & 896));
                        z44 = z51119;
                        interfaceC39332e25 = interfaceC39332e31111111110;
                        z45 = false;
                        c28655q2.m87173q(false);
                    } else {
                        z44 = z29;
                        interfaceC39332e25 = interfaceC39332e17;
                        z45 = false;
                        c28655q2.m87150e0(-1483818741);
                        c28655q2.m87173q(false);
                    }
                    Modifier modifierM3407d15 = AbstractC1102d.m3407d(1.0f, c2314t8);
                    InterfaceC39127r0 interfaceC39127r0M66763d113 = AbstractC22989q.m66763d(c2307m8, z45);
                    boolean z511110 = z44;
                    float f4115 = f28;
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m113 = c28655q2.m87165m();
                    Modifier modifierM118962N113 = AbstractC37056f.m118962N(c28655q2, modifierM3407d15);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i1110, interfaceC39127r0M66763d113);
                    AbstractC28683x.m87239G(c28655q2, c0209i1111, interfaceC28653p1M87165m113);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i1112, modifierM118962N113);
                    textResource3 = textResource119;
                    C39174f c39174f19 = c39174f4;
                    z46 = z45;
                    c28655q3 = c28655q2;
                    InterfaceC39332e interfaceC39332e31111111111 = interfaceC39332e18;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource3, c28655q2, i75), null, interfaceC39332e31124.mo134584toComposableColorWaAFU9c(c28655q2, (i67 >> 6) & 14), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q2, 6).getN8(), null, c28655q3, 0, 0, 196602);
                    if (interfaceC39332e23 != null) {
                        c28655q3.m87150e0(-1057261933);
                        InterfaceC39332e interfaceC39332e31111111112 = interfaceC39332e23;
                        InterfaceC39332e interfaceC39332e31111111113 = interfaceC39332e19;
                        InterfaceC39332e interfaceC39332e31111111114 = interfaceC39332e20;
                        m94544r(interfaceC39332e31111111112, interfaceC39332e31111111113, interfaceC39332e31111111114, f36, f38, c28655q3, (i67 >> 21) & 1022);
                        interfaceC39332e26 = interfaceC39332e31111111112;
                        interfaceC39332e27 = interfaceC39332e31111111113;
                        interfaceC39332e28 = interfaceC39332e31111111114;
                        c28655q3.m87173q(z46);
                    } else {
                        interfaceC39332e26 = interfaceC39332e23;
                        interfaceC39332e27 = interfaceC39332e19;
                        interfaceC39332e28 = interfaceC39332e20;
                        c28655q3.m87150e0(-1056987087);
                        c28655q3.m87173q(z46);
                    }
                    c28655q3.m87173q(true);
                    c28655q3.m87173q(true);
                    f16 = f4115;
                    z18 = z511110;
                    interfaceC39332e10 = interfaceC39332e25;
                    c39174f2 = c39174f19;
                    interfaceC39332e11 = interfaceC39332e31124;
                    interfaceC39332e13 = interfaceC39332e31111111111;
                    z19 = z51118;
                    enumC30774g2 = enumC30774g5;
                    interfaceC4339a2 = interfaceC4339a11;
                    c28655q = c28655q3;
                    interfaceC39332e9 = interfaceC39332e27;
                    interfaceC39332e12 = interfaceC39332e28;
                    interfaceC39332e8 = interfaceC39332e26;
                    modifier2 = modifier12;
                    z17 = z35;
                    f18 = f29;
                    f17 = f27;
                    z24 = z34;
                    textResource4 = textResource117;
                    interfaceC39332e14 = interfaceC39332e24;
                } else {
                    i75 = i74;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                C0209i c0209i1113 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q4, c0209i1113, modifierM118962N112);
                if (interfaceC39332e22 != null) {
                    c28655q4.m87150e0(-1484429813);
                    c28655q4.m87173q(false);
                } else {
                    c28655q4.m87150e0(-1484429813);
                    c28655q4.m87173q(false);
                }
                if (z34) {
                    c28655q4.m87150e0(-1484387932);
                    InterfaceC39332e interfaceC39332e31111111115 = interfaceC39332e22;
                    EnumC30774g enumC30774g111 = enumC30774g4;
                    m94525A(fMo740m0, f28, interfaceC39332e31111111115, interfaceC39332e17, f34, enumC30774g111, c28655q4, ((i64 >> 9) & 112) | ((i67 >> 6) & 896) | (i64 & 7168) | (i69 & 458752));
                    f39 = f34;
                    enumC30774g5 = enumC30774g111;
                    c28655q2 = c28655q4;
                    c28655q2.m87173q(false);
                    interfaceC39332e24 = interfaceC39332e31111111115;
                } else {
                    interfaceC39332e24 = interfaceC39332e22;
                    c28655q2 = c28655q4;
                    enumC30774g5 = enumC30774g4;
                    f39 = f34;
                    c28655q2.m87150e0(-1484258197);
                    c28655q2.m87173q(false);
                }
                if (interfaceC39332e18 != null) {
                    c28655q2.m87150e0(-1484207853);
                    if (c39174f4 != null) {
                        c28655q2.m87150e0(-1484170901);
                        m94538l(c39174f4.f168413w * fMo740m0, interfaceC39332e18, c28655q2, (i64 >> 3) & 112);
                        z47 = false;
                        c28655q2.m87173q(false);
                    } else {
                        z47 = false;
                        c28655q2.m87150e0(-1484069779);
                        m94538l(f39, interfaceC39332e18, c28655q2, (i64 >> 3) & 112);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(z47);
                } else {
                    c28655q2.m87150e0(-1483969525);
                    c28655q2.m87173q(false);
                }
                if (interfaceC39332e17 != null) {
                    c28655q2.m87150e0(-1483927334);
                    boolean z511111 = z29;
                    InterfaceC39332e interfaceC39332e31111111116 = interfaceC39332e17;
                    m94540n(f39, z511111, f28, interfaceC39332e31111111116, c28655q2, (i64 & 7168) | ((i64 >> 12) & 112) | ((i64 >> 6) & 896));
                    z44 = z511111;
                    interfaceC39332e25 = interfaceC39332e31111111116;
                    z45 = false;
                    c28655q2.m87173q(false);
                } else {
                    z44 = z29;
                    interfaceC39332e25 = interfaceC39332e17;
                    z45 = false;
                    c28655q2.m87150e0(-1483818741);
                    c28655q2.m87173q(false);
                }
                Modifier modifierM3407d16 = AbstractC1102d.m3407d(1.0f, c2314t8);
                InterfaceC39127r0 interfaceC39127r0M66763d114 = AbstractC22989q.m66763d(c2307m8, z45);
                boolean z511112 = z44;
                float f4116 = f28;
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q2.m87165m();
                Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q2, modifierM3407d16);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i1110, interfaceC39127r0M66763d114);
                AbstractC28683x.m87239G(c28655q2, c0209i1111, interfaceC28653p1M87165m114);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i1113, modifierM118962N114);
                textResource3 = textResource119;
                C39174f c39174f110 = c39174f4;
                z46 = z45;
                c28655q3 = c28655q2;
                InterfaceC39332e interfaceC39332e31111111117 = interfaceC39332e18;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource3, c28655q2, i75), null, interfaceC39332e31124.mo134584toComposableColorWaAFU9c(c28655q2, (i67 >> 6) & 14), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q2, 6).getN8(), null, c28655q3, 0, 0, 196602);
                if (interfaceC39332e23 != null) {
                    c28655q3.m87150e0(-1057261933);
                    InterfaceC39332e interfaceC39332e31111111118 = interfaceC39332e23;
                    InterfaceC39332e interfaceC39332e31111111119 = interfaceC39332e19;
                    InterfaceC39332e interfaceC39332e311111111110 = interfaceC39332e20;
                    m94544r(interfaceC39332e31111111118, interfaceC39332e31111111119, interfaceC39332e311111111110, f36, f38, c28655q3, (i67 >> 21) & 1022);
                    interfaceC39332e26 = interfaceC39332e31111111118;
                    interfaceC39332e27 = interfaceC39332e31111111119;
                    interfaceC39332e28 = interfaceC39332e311111111110;
                    c28655q3.m87173q(z46);
                } else {
                    interfaceC39332e26 = interfaceC39332e23;
                    interfaceC39332e27 = interfaceC39332e19;
                    interfaceC39332e28 = interfaceC39332e20;
                    c28655q3.m87150e0(-1056987087);
                    c28655q3.m87173q(z46);
                }
                c28655q3.m87173q(true);
                c28655q3.m87173q(true);
                f16 = f4116;
                z18 = z511112;
                interfaceC39332e10 = interfaceC39332e25;
                c39174f2 = c39174f110;
                interfaceC39332e11 = interfaceC39332e31124;
                interfaceC39332e13 = interfaceC39332e31111111117;
                z19 = z51118;
                enumC30774g2 = enumC30774g5;
                interfaceC4339a2 = interfaceC4339a11;
                c28655q = c28655q3;
                interfaceC39332e9 = interfaceC39332e27;
                interfaceC39332e12 = interfaceC39332e28;
                interfaceC39332e8 = interfaceC39332e26;
                modifier2 = modifier12;
                z17 = z35;
                f18 = f29;
                f17 = f27;
                z24 = z34;
                textResource4 = textResource117;
                interfaceC39332e14 = interfaceC39332e24;
            } else {
                c28655q4.m87138X();
                modifier2 = modifier;
                enumC30774g2 = enumC30774g;
                interfaceC39332e8 = interfaceC39332e3;
                z17 = z4;
                f16 = f14;
                z18 = z13;
                f17 = f15;
                z19 = z14;
                z24 = z15;
                interfaceC4339a2 = interfaceC4339a;
                interfaceC39332e9 = interfaceC39332e29;
                interfaceC39332e10 = interfaceC39332e7;
                c28655q = c28655q4;
                textResource3 = textResourceM21267a;
                interfaceC39332e11 = interfaceC39332e;
                c39174f2 = c39174f;
                f18 = f13;
                interfaceC39332e12 = interfaceC39332e30;
                textResource4 = textResourceM21267a2;
                interfaceC39332e13 = interfaceC39332e31;
                interfaceC39332e14 = interfaceC39332e2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: qy0.e
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC30773f.m94552z(modifier2, textResource3, interfaceC39332e11, textResource4, interfaceC39332e14, c39174f2, enumC30774g2, interfaceC39332e8, interfaceC39332e9, interfaceC39332e12, z17, f18, interfaceC39332e13, interfaceC39332e10, f16, z18, f17, z19, z24, interfaceC4339a2, i13, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i49 = i47 | 24576;
        i54 = i15 & 32768;
        if (i54 != 0) {
            i49 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if (c28655q4.m87155h(z13)) {
                i55 = 131072;
            } else {
                i55 = 65536;
            }
            i49 |= i55;
        }
        i56 = i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        if (i56 != 0) {
            i49 |= 1572864;
        } else if ((i14 & 1572864) == 0) {
            i49 |= c28655q4.m87147d(f15) ? 1048576 : 524288;
        }
        i57 = i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
        if (i57 != 0) {
            i49 |= 12582912;
        } else if ((i14 & 12582912) == 0) {
            i49 |= c28655q4.m87155h(z14) ? 8388608 : 4194304;
        }
        i58 = i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION;
        if (i58 != 0) {
            i49 |= 100663296;
        } else if ((i14 & 100663296) == 0) {
            if (c28655q4.m87155h(z15)) {
                i26 = 67108864;
            }
            i49 |= i26;
        }
        i59 = i15 & 524288;
        if (i59 != 0) {
            i49 |= 805306368;
        } else if ((i14 & 805306368) == 0) {
            i49 |= c28655q4.m87157i(interfaceC4339a) ? 536870912 : 268435456;
        }
        i64 = i49;
        if ((i16 & 306783379) == 306783378) {
            z16 = true;
        } else {
            z16 = true;
        }
        if (c28655q4.m87135U(i16 & 1, z16)) {
            c28655q4.m87140Z();
            i65 = i13 & 1;
            c28676v0 = C28635l.f115821a;
            if (i65 != 0) {
                if (i78 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier;
                }
                if ((i15 & 2) != 0) {
                    textResourceM21267a = AbstractC8693b.m21267a();
                    i16 &= -113;
                }
                if ((i15 & 4) != 0) {
                    objM87133R2 = c28655q4.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = a.f126731w;
                        c28655q4.m87172p0(objM87133R2);
                    }
                    interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R2);
                    i16 &= -897;
                } else {
                    interfaceC39332eM125323a = interfaceC39332e;
                }
                if ((i15 & 8) != 0) {
                    textResourceM21267a2 = AbstractC8693b.m21267a();
                    i16 &= -7169;
                }
                if (i84 != 0) {
                    interfaceC39332e15 = null;
                } else {
                    interfaceC39332e15 = interfaceC39332e2;
                }
                if (i86 != 0) {
                    c39174f3 = null;
                } else {
                    c39174f3 = c39174f;
                }
                if (i17 != 0) {
                    enumC30774g3 = EnumC30774g.NONE;
                } else {
                    enumC30774g3 = enumC30774g;
                }
                if (i19 != 0) {
                    interfaceC39332e16 = null;
                } else {
                    interfaceC39332e16 = interfaceC39332e3;
                }
                if (i25 != 0) {
                    interfaceC39332e29 = null;
                }
                if (i28 != 0) {
                    interfaceC39332e30 = null;
                }
                if (i34 != 0) {
                    z25 = false;
                } else {
                    z25 = z4;
                }
                if (i37 != 0) {
                    f19 = null;
                } else {
                    f19 = f13;
                }
                if (i39 != 0) {
                    interfaceC39332e31 = null;
                }
                if (i45 == 0) {
                }
                i66 = i16;
                if (i48 != 0) {
                    f24 = (float) 1.5d;
                } else {
                    f24 = f14;
                }
                if (i54 != 0) {
                    z26 = false;
                } else {
                    z26 = z13;
                }
                if (i56 != 0) {
                    f25 = 7 * 4;
                } else {
                    f25 = f15;
                }
                if (i57 != 0) {
                    z27 = true;
                } else {
                    z27 = z14;
                }
                if (i58 != 0) {
                    z28 = false;
                } else {
                    z28 = z15;
                }
                f26 = f25;
                if (i59 != 0) {
                    objM87133R = c28655q4.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C30654e(3);
                        c28655q4.m87172p0(objM87133R);
                    }
                    TextResource textResource1110 = textResourceM21267a2;
                    interfaceC39332e18 = interfaceC39332e31;
                    textResource5 = textResource1110;
                    i67 = i66;
                    interfaceC39332e19 = interfaceC39332e29;
                    f27 = f26;
                    interfaceC39332e20 = interfaceC39332e30;
                    f28 = f24;
                    interfaceC39332e21 = interfaceC39332eM125323a;
                    textResource6 = textResourceM21267a;
                    z29 = z26;
                    z34 = z28;
                    interfaceC39332e22 = interfaceC39332e15;
                    c39174f4 = c39174f3;
                    enumC30774g4 = enumC30774g3;
                    interfaceC39332e23 = interfaceC39332e16;
                    z35 = z25;
                    f29 = f19;
                    z36 = z27;
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                    modifier4 = modifier3;
                } else {
                    boolean z4111 = z27;
                    TextResource textResource1111 = textResourceM21267a2;
                    interfaceC39332e18 = interfaceC39332e31;
                    textResource5 = textResource1111;
                    i67 = i66;
                    interfaceC39332e19 = interfaceC39332e29;
                    f27 = f26;
                    interfaceC39332e20 = interfaceC39332e30;
                    f28 = f24;
                    interfaceC39332e21 = interfaceC39332eM125323a;
                    textResource6 = textResourceM21267a;
                    z29 = z26;
                    z34 = z28;
                    modifier4 = modifier3;
                    interfaceC39332e22 = interfaceC39332e15;
                    c39174f4 = c39174f3;
                    enumC30774g4 = enumC30774g3;
                    interfaceC39332e23 = interfaceC39332e16;
                    z35 = z25;
                    f29 = f19;
                    z36 = z4111;
                    interfaceC4339a3 = interfaceC4339a;
                }
            } else {
                if (i78 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier;
                }
                if ((i15 & 2) != 0) {
                    textResourceM21267a = AbstractC8693b.m21267a();
                    i16 &= -113;
                }
                if ((i15 & 4) != 0) {
                    objM87133R2 = c28655q4.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = a.f126731w;
                        c28655q4.m87172p0(objM87133R2);
                    }
                    interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R2);
                    i16 &= -897;
                } else {
                    interfaceC39332eM125323a = interfaceC39332e;
                }
                if ((i15 & 8) != 0) {
                    textResourceM21267a2 = AbstractC8693b.m21267a();
                    i16 &= -7169;
                }
                if (i84 != 0) {
                    interfaceC39332e15 = null;
                } else {
                    interfaceC39332e15 = interfaceC39332e2;
                }
                if (i86 != 0) {
                    c39174f3 = null;
                } else {
                    c39174f3 = c39174f;
                }
                if (i17 != 0) {
                    enumC30774g3 = EnumC30774g.NONE;
                } else {
                    enumC30774g3 = enumC30774g;
                }
                if (i19 != 0) {
                    interfaceC39332e16 = null;
                } else {
                    interfaceC39332e16 = interfaceC39332e3;
                }
                if (i25 != 0) {
                    interfaceC39332e29 = null;
                }
                if (i28 != 0) {
                    interfaceC39332e30 = null;
                }
                if (i34 != 0) {
                    z25 = false;
                } else {
                    z25 = z4;
                }
                if (i37 != 0) {
                    f19 = null;
                } else {
                    f19 = f13;
                }
                if (i39 != 0) {
                    interfaceC39332e31 = null;
                }
                if (i45 == 0) {
                }
                i66 = i16;
                if (i48 != 0) {
                    f24 = (float) 1.5d;
                } else {
                    f24 = f14;
                }
                if (i54 != 0) {
                    z26 = false;
                } else {
                    z26 = z13;
                }
                if (i56 != 0) {
                    f25 = 7 * 4;
                } else {
                    f25 = f15;
                }
                if (i57 != 0) {
                    z27 = true;
                } else {
                    z27 = z14;
                }
                if (i58 != 0) {
                    z28 = false;
                } else {
                    z28 = z15;
                }
                f26 = f25;
                if (i59 != 0) {
                    objM87133R = c28655q4.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C30654e(3);
                        c28655q4.m87172p0(objM87133R);
                    }
                    TextResource textResource1112 = textResourceM21267a2;
                    interfaceC39332e18 = interfaceC39332e31;
                    textResource5 = textResource1112;
                    i67 = i66;
                    interfaceC39332e19 = interfaceC39332e29;
                    f27 = f26;
                    interfaceC39332e20 = interfaceC39332e30;
                    f28 = f24;
                    interfaceC39332e21 = interfaceC39332eM125323a;
                    textResource6 = textResourceM21267a;
                    z29 = z26;
                    z34 = z28;
                    interfaceC39332e22 = interfaceC39332e15;
                    c39174f4 = c39174f3;
                    enumC30774g4 = enumC30774g3;
                    interfaceC39332e23 = interfaceC39332e16;
                    z35 = z25;
                    f29 = f19;
                    z36 = z27;
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                    modifier4 = modifier3;
                } else {
                    boolean z4112 = z27;
                    TextResource textResource1113 = textResourceM21267a2;
                    interfaceC39332e18 = interfaceC39332e31;
                    textResource5 = textResource1113;
                    i67 = i66;
                    interfaceC39332e19 = interfaceC39332e29;
                    f27 = f26;
                    interfaceC39332e20 = interfaceC39332e30;
                    f28 = f24;
                    interfaceC39332e21 = interfaceC39332eM125323a;
                    textResource6 = textResourceM21267a;
                    z29 = z26;
                    z34 = z28;
                    modifier4 = modifier3;
                    interfaceC39332e22 = interfaceC39332e15;
                    c39174f4 = c39174f3;
                    enumC30774g4 = enumC30774g3;
                    interfaceC39332e23 = interfaceC39332e16;
                    z35 = z25;
                    f29 = f19;
                    z36 = z4112;
                    interfaceC4339a3 = interfaceC4339a;
                }
            }
            c28655q4.m87175r();
            objM87133R3 = c28655q4.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC11266d.m30453g(c28655q4);
            }
            InterfaceC21083i interfaceC21083i5 = (InterfaceC21083i) objM87133R3;
            strM21274h = AbstractC8693b.m21274h(textResource5, c28655q4, (i67 >> 9) & 14);
            TextResource textResource1114 = textResource5;
            fMo740m0 = ((InterfaceC39171c) c28655q4.m87161k(AbstractC2453v1.f9569h)).getFontScale();
            f34 = f27 * fMo740m0;
            if (f29 != null) {
                fFloatValue = f29.floatValue();
            } else {
                if (z35) {
                    fFloatValue = 2.0f;
                } else {
                    i68 = 4;
                    fFloatValue = 1.0f;
                }
                f35 = i68;
                f36 = fFloatValue * f35 * fMo740m0;
                if (z35) {
                    f37 = (((3 * f34) / f35) - (f36 / f35)) + f28;
                } else {
                    float f4117 = 2;
                    f37 = (f28 / f4117) + ((f34 / f4117) - (f36 / f4117));
                }
                i69 = i67 >> 3;
                f38 = f37;
                i74 = i69 & 14;
                InterfaceC39332e interfaceC39332e31125 = interfaceC39332e21;
                TextResource textResource1115 = textResource6;
                String str9 = "home_calendar_date_" + AbstractC8693b.m21274h(textResource6, c28655q4, i74);
                C2314t c2314t9 = C2314t.f9131w;
                Modifier modifierM44101d9 = AbstractC15676d.m44101d(c2314t9, str9);
                InterfaceC13832v0 interfaceC13832v8 = (InterfaceC13832v0) c28655q4.m87161k(AbstractC1095d.f4515a);
                if ((i64 & 29360128) == 8388608) {
                    z37 = true;
                } else {
                    z37 = false;
                }
                boolean z4113 = z37;
                if ((1879048192 & i64) == 536870912) {
                    z38 = true;
                } else {
                    z38 = false;
                }
                z39 = z4113 | z38;
                objM87133R4 = c28655q4.m87133R();
                if (z39) {
                    objM87133R4 = new C12203c(4, interfaceC4339a3, z36);
                    c28655q4.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C12203c(4, interfaceC4339a3, z36);
                    c28655q4.m87172p0(objM87133R4);
                }
                Modifier modifierMo3471e9 = AbstractC1102d.m3407d(1.0f, AbstractC1092a.m3360e(modifierM44101d9, interfaceC21083i5, interfaceC13832v8, false, null, (InterfaceC4339a) objM87133R4, 28)).mo3471e(modifier4);
                zM87153g = c28655q4.m87153g(strM21274h);
                Modifier modifier13 = modifier4;
                objM87133R5 = c28655q4.m87133R();
                if (zM87153g) {
                    objM87133R5 = new C17632d(strM21274h, 29);
                    c28655q4.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new C17632d(strM21274h, 29);
                    c28655q4.m87172p0(objM87133R5);
                }
                Modifier modifierM51775c9 = AbstractC18032n.m51775c(modifierMo3471e9, true, (Function1) objM87133R5);
                C2307m c2307m9 = C2299e.f9102E;
                InterfaceC39127r0 interfaceC39127r0M66763d115 = AbstractC22989q.m66763d(c2307m9, false);
                iHashCode = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m115 = c28655q4.m87165m();
                Modifier modifierM118962N115 = AbstractC37056f.m118962N(c28655q4, modifierM51775c9);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q4.m87158i0();
                boolean z511113 = z36;
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                C0209i c0209i1114 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q4, c0209i1114, interfaceC39127r0M66763d115);
                C0209i c0209i1115 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q4, c0209i1115, interfaceC28653p1M87165m115);
                c0209i = C0217k.f732j;
                InterfaceC4339a interfaceC4339a12 = interfaceC4339a3;
                if (c28655q4.f115903S) {
                    i75 = i74;
                    if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i1116 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q4, c0209i1116, modifierM118962N115);
                    if (interfaceC39332e22 != null) {
                        c28655q4.m87150e0(-1484429813);
                        c28655q4.m87173q(false);
                    } else {
                        c28655q4.m87150e0(-1484429813);
                        c28655q4.m87173q(false);
                    }
                    if (z34) {
                        c28655q4.m87150e0(-1484387932);
                        InterfaceC39332e interfaceC39332e311111111111 = interfaceC39332e22;
                        EnumC30774g enumC30774g112 = enumC30774g4;
                        m94525A(fMo740m0, f28, interfaceC39332e311111111111, interfaceC39332e17, f34, enumC30774g112, c28655q4, ((i64 >> 9) & 112) | ((i67 >> 6) & 896) | (i64 & 7168) | (i69 & 458752));
                        f39 = f34;
                        enumC30774g5 = enumC30774g112;
                        c28655q2 = c28655q4;
                        c28655q2.m87173q(false);
                        interfaceC39332e24 = interfaceC39332e311111111111;
                    } else {
                        interfaceC39332e24 = interfaceC39332e22;
                        c28655q2 = c28655q4;
                        enumC30774g5 = enumC30774g4;
                        f39 = f34;
                        c28655q2.m87150e0(-1484258197);
                        c28655q2.m87173q(false);
                    }
                    if (interfaceC39332e18 != null) {
                        c28655q2.m87150e0(-1484207853);
                        if (c39174f4 != null) {
                            c28655q2.m87150e0(-1484170901);
                            m94538l(c39174f4.f168413w * fMo740m0, interfaceC39332e18, c28655q2, (i64 >> 3) & 112);
                            z47 = false;
                            c28655q2.m87173q(false);
                        } else {
                            z47 = false;
                            c28655q2.m87150e0(-1484069779);
                            m94538l(f39, interfaceC39332e18, c28655q2, (i64 >> 3) & 112);
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(z47);
                    } else {
                        c28655q2.m87150e0(-1483969525);
                        c28655q2.m87173q(false);
                    }
                    if (interfaceC39332e17 != null) {
                        c28655q2.m87150e0(-1483927334);
                        boolean z511114 = z29;
                        InterfaceC39332e interfaceC39332e311111111112 = interfaceC39332e17;
                        m94540n(f39, z511114, f28, interfaceC39332e311111111112, c28655q2, (i64 & 7168) | ((i64 >> 12) & 112) | ((i64 >> 6) & 896));
                        z44 = z511114;
                        interfaceC39332e25 = interfaceC39332e311111111112;
                        z45 = false;
                        c28655q2.m87173q(false);
                    } else {
                        z44 = z29;
                        interfaceC39332e25 = interfaceC39332e17;
                        z45 = false;
                        c28655q2.m87150e0(-1483818741);
                        c28655q2.m87173q(false);
                    }
                    Modifier modifierM3407d17 = AbstractC1102d.m3407d(1.0f, c2314t9);
                    InterfaceC39127r0 interfaceC39127r0M66763d116 = AbstractC22989q.m66763d(c2307m9, z45);
                    boolean z511115 = z44;
                    float f4118 = f28;
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m116 = c28655q2.m87165m();
                    Modifier modifierM118962N116 = AbstractC37056f.m118962N(c28655q2, modifierM3407d17);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i1114, interfaceC39127r0M66763d116);
                    AbstractC28683x.m87239G(c28655q2, c0209i1115, interfaceC28653p1M87165m116);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i1116, modifierM118962N116);
                    textResource3 = textResource1115;
                    C39174f c39174f111 = c39174f4;
                    z46 = z45;
                    c28655q3 = c28655q2;
                    InterfaceC39332e interfaceC39332e311111111113 = interfaceC39332e18;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource3, c28655q2, i75), null, interfaceC39332e31125.mo134584toComposableColorWaAFU9c(c28655q2, (i67 >> 6) & 14), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q2, 6).getN8(), null, c28655q3, 0, 0, 196602);
                    if (interfaceC39332e23 != null) {
                        c28655q3.m87150e0(-1057261933);
                        InterfaceC39332e interfaceC39332e311111111114 = interfaceC39332e23;
                        InterfaceC39332e interfaceC39332e311111111115 = interfaceC39332e19;
                        InterfaceC39332e interfaceC39332e311111111116 = interfaceC39332e20;
                        m94544r(interfaceC39332e311111111114, interfaceC39332e311111111115, interfaceC39332e311111111116, f36, f38, c28655q3, (i67 >> 21) & 1022);
                        interfaceC39332e26 = interfaceC39332e311111111114;
                        interfaceC39332e27 = interfaceC39332e311111111115;
                        interfaceC39332e28 = interfaceC39332e311111111116;
                        c28655q3.m87173q(z46);
                    } else {
                        interfaceC39332e26 = interfaceC39332e23;
                        interfaceC39332e27 = interfaceC39332e19;
                        interfaceC39332e28 = interfaceC39332e20;
                        c28655q3.m87150e0(-1056987087);
                        c28655q3.m87173q(z46);
                    }
                    c28655q3.m87173q(true);
                    c28655q3.m87173q(true);
                    f16 = f4118;
                    z18 = z511115;
                    interfaceC39332e10 = interfaceC39332e25;
                    c39174f2 = c39174f111;
                    interfaceC39332e11 = interfaceC39332e31125;
                    interfaceC39332e13 = interfaceC39332e311111111113;
                    z19 = z511113;
                    enumC30774g2 = enumC30774g5;
                    interfaceC4339a2 = interfaceC4339a12;
                    c28655q = c28655q3;
                    interfaceC39332e9 = interfaceC39332e27;
                    interfaceC39332e12 = interfaceC39332e28;
                    interfaceC39332e8 = interfaceC39332e26;
                    modifier2 = modifier13;
                    z17 = z35;
                    f18 = f29;
                    f17 = f27;
                    z24 = z34;
                    textResource4 = textResource1114;
                    interfaceC39332e14 = interfaceC39332e24;
                } else {
                    i75 = i74;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                C0209i c0209i1117 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q4, c0209i1117, modifierM118962N115);
                if (interfaceC39332e22 != null) {
                    c28655q4.m87150e0(-1484429813);
                    c28655q4.m87173q(false);
                } else {
                    c28655q4.m87150e0(-1484429813);
                    c28655q4.m87173q(false);
                }
                if (z34) {
                    c28655q4.m87150e0(-1484387932);
                    InterfaceC39332e interfaceC39332e311111111117 = interfaceC39332e22;
                    EnumC30774g enumC30774g113 = enumC30774g4;
                    m94525A(fMo740m0, f28, interfaceC39332e311111111117, interfaceC39332e17, f34, enumC30774g113, c28655q4, ((i64 >> 9) & 112) | ((i67 >> 6) & 896) | (i64 & 7168) | (i69 & 458752));
                    f39 = f34;
                    enumC30774g5 = enumC30774g113;
                    c28655q2 = c28655q4;
                    c28655q2.m87173q(false);
                    interfaceC39332e24 = interfaceC39332e311111111117;
                } else {
                    interfaceC39332e24 = interfaceC39332e22;
                    c28655q2 = c28655q4;
                    enumC30774g5 = enumC30774g4;
                    f39 = f34;
                    c28655q2.m87150e0(-1484258197);
                    c28655q2.m87173q(false);
                }
                if (interfaceC39332e18 != null) {
                    c28655q2.m87150e0(-1484207853);
                    if (c39174f4 != null) {
                        c28655q2.m87150e0(-1484170901);
                        m94538l(c39174f4.f168413w * fMo740m0, interfaceC39332e18, c28655q2, (i64 >> 3) & 112);
                        z47 = false;
                        c28655q2.m87173q(false);
                    } else {
                        z47 = false;
                        c28655q2.m87150e0(-1484069779);
                        m94538l(f39, interfaceC39332e18, c28655q2, (i64 >> 3) & 112);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(z47);
                } else {
                    c28655q2.m87150e0(-1483969525);
                    c28655q2.m87173q(false);
                }
                if (interfaceC39332e17 != null) {
                    c28655q2.m87150e0(-1483927334);
                    boolean z511116 = z29;
                    InterfaceC39332e interfaceC39332e311111111118 = interfaceC39332e17;
                    m94540n(f39, z511116, f28, interfaceC39332e311111111118, c28655q2, (i64 & 7168) | ((i64 >> 12) & 112) | ((i64 >> 6) & 896));
                    z44 = z511116;
                    interfaceC39332e25 = interfaceC39332e311111111118;
                    z45 = false;
                    c28655q2.m87173q(false);
                } else {
                    z44 = z29;
                    interfaceC39332e25 = interfaceC39332e17;
                    z45 = false;
                    c28655q2.m87150e0(-1483818741);
                    c28655q2.m87173q(false);
                }
                Modifier modifierM3407d18 = AbstractC1102d.m3407d(1.0f, c2314t9);
                InterfaceC39127r0 interfaceC39127r0M66763d117 = AbstractC22989q.m66763d(c2307m9, z45);
                boolean z511117 = z44;
                float f4119 = f28;
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m117 = c28655q2.m87165m();
                Modifier modifierM118962N117 = AbstractC37056f.m118962N(c28655q2, modifierM3407d18);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i1114, interfaceC39127r0M66763d117);
                AbstractC28683x.m87239G(c28655q2, c0209i1115, interfaceC28653p1M87165m117);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i1117, modifierM118962N117);
                textResource3 = textResource1115;
                C39174f c39174f112 = c39174f4;
                z46 = z45;
                c28655q3 = c28655q2;
                InterfaceC39332e interfaceC39332e311111111119 = interfaceC39332e18;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource3, c28655q2, i75), null, interfaceC39332e31125.mo134584toComposableColorWaAFU9c(c28655q2, (i67 >> 6) & 14), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q2, 6).getN8(), null, c28655q3, 0, 0, 196602);
                if (interfaceC39332e23 != null) {
                    c28655q3.m87150e0(-1057261933);
                    InterfaceC39332e interfaceC39332e3111111111110 = interfaceC39332e23;
                    InterfaceC39332e interfaceC39332e3111111111111 = interfaceC39332e19;
                    InterfaceC39332e interfaceC39332e3111111111112 = interfaceC39332e20;
                    m94544r(interfaceC39332e3111111111110, interfaceC39332e3111111111111, interfaceC39332e3111111111112, f36, f38, c28655q3, (i67 >> 21) & 1022);
                    interfaceC39332e26 = interfaceC39332e3111111111110;
                    interfaceC39332e27 = interfaceC39332e3111111111111;
                    interfaceC39332e28 = interfaceC39332e3111111111112;
                    c28655q3.m87173q(z46);
                } else {
                    interfaceC39332e26 = interfaceC39332e23;
                    interfaceC39332e27 = interfaceC39332e19;
                    interfaceC39332e28 = interfaceC39332e20;
                    c28655q3.m87150e0(-1056987087);
                    c28655q3.m87173q(z46);
                }
                c28655q3.m87173q(true);
                c28655q3.m87173q(true);
                f16 = f4119;
                z18 = z511117;
                interfaceC39332e10 = interfaceC39332e25;
                c39174f2 = c39174f112;
                interfaceC39332e11 = interfaceC39332e31125;
                interfaceC39332e13 = interfaceC39332e311111111119;
                z19 = z511113;
                enumC30774g2 = enumC30774g5;
                interfaceC4339a2 = interfaceC4339a12;
                c28655q = c28655q3;
                interfaceC39332e9 = interfaceC39332e27;
                interfaceC39332e12 = interfaceC39332e28;
                interfaceC39332e8 = interfaceC39332e26;
                modifier2 = modifier13;
                z17 = z35;
                f18 = f29;
                f17 = f27;
                z24 = z34;
                textResource4 = textResource1114;
                interfaceC39332e14 = interfaceC39332e24;
            }
            i68 = 4;
            f35 = i68;
            f36 = fFloatValue * f35 * fMo740m0;
            if (z35) {
                f37 = (((3 * f34) / f35) - (f36 / f35)) + f28;
            } else {
                float f41110 = 2;
                f37 = (f28 / f41110) + ((f34 / f41110) - (f36 / f41110));
            }
            i69 = i67 >> 3;
            f38 = f37;
            i74 = i69 & 14;
            InterfaceC39332e interfaceC39332e31126 = interfaceC39332e21;
            TextResource textResource1116 = textResource6;
            String str10 = "home_calendar_date_" + AbstractC8693b.m21274h(textResource6, c28655q4, i74);
            C2314t c2314t10 = C2314t.f9131w;
            Modifier modifierM44101d10 = AbstractC15676d.m44101d(c2314t10, str10);
            InterfaceC13832v0 interfaceC13832v9 = (InterfaceC13832v0) c28655q4.m87161k(AbstractC1095d.f4515a);
            if ((i64 & 29360128) == 8388608) {
                z37 = true;
            } else {
                z37 = false;
            }
            boolean z4114 = z37;
            if ((1879048192 & i64) == 536870912) {
                z38 = true;
            } else {
                z38 = false;
            }
            z39 = z4114 | z38;
            objM87133R4 = c28655q4.m87133R();
            if (z39) {
                objM87133R4 = new C12203c(4, interfaceC4339a3, z36);
                c28655q4.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new C12203c(4, interfaceC4339a3, z36);
                c28655q4.m87172p0(objM87133R4);
            }
            Modifier modifierMo3471e10 = AbstractC1102d.m3407d(1.0f, AbstractC1092a.m3360e(modifierM44101d10, interfaceC21083i5, interfaceC13832v9, false, null, (InterfaceC4339a) objM87133R4, 28)).mo3471e(modifier4);
            zM87153g = c28655q4.m87153g(strM21274h);
            Modifier modifier14 = modifier4;
            objM87133R5 = c28655q4.m87133R();
            if (zM87153g) {
                objM87133R5 = new C17632d(strM21274h, 29);
                c28655q4.m87172p0(objM87133R5);
            } else {
                objM87133R5 = new C17632d(strM21274h, 29);
                c28655q4.m87172p0(objM87133R5);
            }
            Modifier modifierM51775c10 = AbstractC18032n.m51775c(modifierMo3471e10, true, (Function1) objM87133R5);
            C2307m c2307m10 = C2299e.f9102E;
            InterfaceC39127r0 interfaceC39127r0M66763d118 = AbstractC22989q.m66763d(c2307m10, false);
            iHashCode = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m118 = c28655q4.m87165m();
            Modifier modifierM118962N118 = AbstractC37056f.m118962N(c28655q4, modifierM51775c10);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q4.m87158i0();
            boolean z511118 = z36;
            if (c28655q4.f115903S) {
                c28655q4.m87163l(c0213j);
            } else {
                c28655q4.m87178s0();
            }
            C0209i c0209i1118 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q4, c0209i1118, interfaceC39127r0M66763d118);
            C0209i c0209i1119 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q4, c0209i1119, interfaceC28653p1M87165m118);
            c0209i = C0217k.f732j;
            InterfaceC4339a interfaceC4339a13 = interfaceC4339a3;
            if (c28655q4.f115903S) {
                i75 = i74;
                if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i11110 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q4, c0209i11110, modifierM118962N118);
                if (interfaceC39332e22 != null) {
                    c28655q4.m87150e0(-1484429813);
                    c28655q4.m87173q(false);
                } else {
                    c28655q4.m87150e0(-1484429813);
                    c28655q4.m87173q(false);
                }
                if (z34) {
                    c28655q4.m87150e0(-1484387932);
                    InterfaceC39332e interfaceC39332e3111111111113 = interfaceC39332e22;
                    EnumC30774g enumC30774g114 = enumC30774g4;
                    m94525A(fMo740m0, f28, interfaceC39332e3111111111113, interfaceC39332e17, f34, enumC30774g114, c28655q4, ((i64 >> 9) & 112) | ((i67 >> 6) & 896) | (i64 & 7168) | (i69 & 458752));
                    f39 = f34;
                    enumC30774g5 = enumC30774g114;
                    c28655q2 = c28655q4;
                    c28655q2.m87173q(false);
                    interfaceC39332e24 = interfaceC39332e3111111111113;
                } else {
                    interfaceC39332e24 = interfaceC39332e22;
                    c28655q2 = c28655q4;
                    enumC30774g5 = enumC30774g4;
                    f39 = f34;
                    c28655q2.m87150e0(-1484258197);
                    c28655q2.m87173q(false);
                }
                if (interfaceC39332e18 != null) {
                    c28655q2.m87150e0(-1484207853);
                    if (c39174f4 != null) {
                        c28655q2.m87150e0(-1484170901);
                        m94538l(c39174f4.f168413w * fMo740m0, interfaceC39332e18, c28655q2, (i64 >> 3) & 112);
                        z47 = false;
                        c28655q2.m87173q(false);
                    } else {
                        z47 = false;
                        c28655q2.m87150e0(-1484069779);
                        m94538l(f39, interfaceC39332e18, c28655q2, (i64 >> 3) & 112);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(z47);
                } else {
                    c28655q2.m87150e0(-1483969525);
                    c28655q2.m87173q(false);
                }
                if (interfaceC39332e17 != null) {
                    c28655q2.m87150e0(-1483927334);
                    boolean z511119 = z29;
                    InterfaceC39332e interfaceC39332e3111111111114 = interfaceC39332e17;
                    m94540n(f39, z511119, f28, interfaceC39332e3111111111114, c28655q2, (i64 & 7168) | ((i64 >> 12) & 112) | ((i64 >> 6) & 896));
                    z44 = z511119;
                    interfaceC39332e25 = interfaceC39332e3111111111114;
                    z45 = false;
                    c28655q2.m87173q(false);
                } else {
                    z44 = z29;
                    interfaceC39332e25 = interfaceC39332e17;
                    z45 = false;
                    c28655q2.m87150e0(-1483818741);
                    c28655q2.m87173q(false);
                }
                Modifier modifierM3407d19 = AbstractC1102d.m3407d(1.0f, c2314t10);
                InterfaceC39127r0 interfaceC39127r0M66763d119 = AbstractC22989q.m66763d(c2307m10, z45);
                boolean z5111110 = z44;
                float f41111 = f28;
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m119 = c28655q2.m87165m();
                Modifier modifierM118962N119 = AbstractC37056f.m118962N(c28655q2, modifierM3407d19);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i1118, interfaceC39127r0M66763d119);
                AbstractC28683x.m87239G(c28655q2, c0209i1119, interfaceC28653p1M87165m119);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i11110, modifierM118962N119);
                textResource3 = textResource1116;
                C39174f c39174f113 = c39174f4;
                z46 = z45;
                c28655q3 = c28655q2;
                InterfaceC39332e interfaceC39332e3111111111115 = interfaceC39332e18;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource3, c28655q2, i75), null, interfaceC39332e31126.mo134584toComposableColorWaAFU9c(c28655q2, (i67 >> 6) & 14), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q2, 6).getN8(), null, c28655q3, 0, 0, 196602);
                if (interfaceC39332e23 != null) {
                    c28655q3.m87150e0(-1057261933);
                    InterfaceC39332e interfaceC39332e3111111111116 = interfaceC39332e23;
                    InterfaceC39332e interfaceC39332e3111111111117 = interfaceC39332e19;
                    InterfaceC39332e interfaceC39332e3111111111118 = interfaceC39332e20;
                    m94544r(interfaceC39332e3111111111116, interfaceC39332e3111111111117, interfaceC39332e3111111111118, f36, f38, c28655q3, (i67 >> 21) & 1022);
                    interfaceC39332e26 = interfaceC39332e3111111111116;
                    interfaceC39332e27 = interfaceC39332e3111111111117;
                    interfaceC39332e28 = interfaceC39332e3111111111118;
                    c28655q3.m87173q(z46);
                } else {
                    interfaceC39332e26 = interfaceC39332e23;
                    interfaceC39332e27 = interfaceC39332e19;
                    interfaceC39332e28 = interfaceC39332e20;
                    c28655q3.m87150e0(-1056987087);
                    c28655q3.m87173q(z46);
                }
                c28655q3.m87173q(true);
                c28655q3.m87173q(true);
                f16 = f41111;
                z18 = z5111110;
                interfaceC39332e10 = interfaceC39332e25;
                c39174f2 = c39174f113;
                interfaceC39332e11 = interfaceC39332e31126;
                interfaceC39332e13 = interfaceC39332e3111111111115;
                z19 = z511118;
                enumC30774g2 = enumC30774g5;
                interfaceC4339a2 = interfaceC4339a13;
                c28655q = c28655q3;
                interfaceC39332e9 = interfaceC39332e27;
                interfaceC39332e12 = interfaceC39332e28;
                interfaceC39332e8 = interfaceC39332e26;
                modifier2 = modifier14;
                z17 = z35;
                f18 = f29;
                f17 = f27;
                z24 = z34;
                textResource4 = textResource1114;
                interfaceC39332e14 = interfaceC39332e24;
            } else {
                i75 = i74;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
            C0209i c0209i11111 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q4, c0209i11111, modifierM118962N118);
            if (interfaceC39332e22 != null) {
                c28655q4.m87150e0(-1484429813);
                c28655q4.m87173q(false);
            } else {
                c28655q4.m87150e0(-1484429813);
                c28655q4.m87173q(false);
            }
            if (z34) {
                c28655q4.m87150e0(-1484387932);
                InterfaceC39332e interfaceC39332e3111111111119 = interfaceC39332e22;
                EnumC30774g enumC30774g115 = enumC30774g4;
                m94525A(fMo740m0, f28, interfaceC39332e3111111111119, interfaceC39332e17, f34, enumC30774g115, c28655q4, ((i64 >> 9) & 112) | ((i67 >> 6) & 896) | (i64 & 7168) | (i69 & 458752));
                f39 = f34;
                enumC30774g5 = enumC30774g115;
                c28655q2 = c28655q4;
                c28655q2.m87173q(false);
                interfaceC39332e24 = interfaceC39332e3111111111119;
            } else {
                interfaceC39332e24 = interfaceC39332e22;
                c28655q2 = c28655q4;
                enumC30774g5 = enumC30774g4;
                f39 = f34;
                c28655q2.m87150e0(-1484258197);
                c28655q2.m87173q(false);
            }
            if (interfaceC39332e18 != null) {
                c28655q2.m87150e0(-1484207853);
                if (c39174f4 != null) {
                    c28655q2.m87150e0(-1484170901);
                    m94538l(c39174f4.f168413w * fMo740m0, interfaceC39332e18, c28655q2, (i64 >> 3) & 112);
                    z47 = false;
                    c28655q2.m87173q(false);
                } else {
                    z47 = false;
                    c28655q2.m87150e0(-1484069779);
                    m94538l(f39, interfaceC39332e18, c28655q2, (i64 >> 3) & 112);
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(z47);
            } else {
                c28655q2.m87150e0(-1483969525);
                c28655q2.m87173q(false);
            }
            if (interfaceC39332e17 != null) {
                c28655q2.m87150e0(-1483927334);
                boolean z5111111 = z29;
                InterfaceC39332e interfaceC39332e31111111111110 = interfaceC39332e17;
                m94540n(f39, z5111111, f28, interfaceC39332e31111111111110, c28655q2, (i64 & 7168) | ((i64 >> 12) & 112) | ((i64 >> 6) & 896));
                z44 = z5111111;
                interfaceC39332e25 = interfaceC39332e31111111111110;
                z45 = false;
                c28655q2.m87173q(false);
            } else {
                z44 = z29;
                interfaceC39332e25 = interfaceC39332e17;
                z45 = false;
                c28655q2.m87150e0(-1483818741);
                c28655q2.m87173q(false);
            }
            Modifier modifierM3407d110 = AbstractC1102d.m3407d(1.0f, c2314t10);
            InterfaceC39127r0 interfaceC39127r0M66763d1110 = AbstractC22989q.m66763d(c2307m10, z45);
            boolean z5111112 = z44;
            float f41112 = f28;
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m1110 = c28655q2.m87165m();
            Modifier modifierM118962N1110 = AbstractC37056f.m118962N(c28655q2, modifierM3407d110);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i1118, interfaceC39127r0M66763d1110);
            AbstractC28683x.m87239G(c28655q2, c0209i1119, interfaceC28653p1M87165m1110);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i11111, modifierM118962N1110);
            textResource3 = textResource1116;
            C39174f c39174f114 = c39174f4;
            z46 = z45;
            c28655q3 = c28655q2;
            InterfaceC39332e interfaceC39332e31111111111111 = interfaceC39332e18;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource3, c28655q2, i75), null, interfaceC39332e31126.mo134584toComposableColorWaAFU9c(c28655q2, (i67 >> 6) & 14), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q2, 6).getN8(), null, c28655q3, 0, 0, 196602);
            if (interfaceC39332e23 != null) {
                c28655q3.m87150e0(-1057261933);
                InterfaceC39332e interfaceC39332e31111111111112 = interfaceC39332e23;
                InterfaceC39332e interfaceC39332e31111111111113 = interfaceC39332e19;
                InterfaceC39332e interfaceC39332e31111111111114 = interfaceC39332e20;
                m94544r(interfaceC39332e31111111111112, interfaceC39332e31111111111113, interfaceC39332e31111111111114, f36, f38, c28655q3, (i67 >> 21) & 1022);
                interfaceC39332e26 = interfaceC39332e31111111111112;
                interfaceC39332e27 = interfaceC39332e31111111111113;
                interfaceC39332e28 = interfaceC39332e31111111111114;
                c28655q3.m87173q(z46);
            } else {
                interfaceC39332e26 = interfaceC39332e23;
                interfaceC39332e27 = interfaceC39332e19;
                interfaceC39332e28 = interfaceC39332e20;
                c28655q3.m87150e0(-1056987087);
                c28655q3.m87173q(z46);
            }
            c28655q3.m87173q(true);
            c28655q3.m87173q(true);
            f16 = f41112;
            z18 = z5111112;
            interfaceC39332e10 = interfaceC39332e25;
            c39174f2 = c39174f114;
            interfaceC39332e11 = interfaceC39332e31126;
            interfaceC39332e13 = interfaceC39332e31111111111111;
            z19 = z511118;
            enumC30774g2 = enumC30774g5;
            interfaceC4339a2 = interfaceC4339a13;
            c28655q = c28655q3;
            interfaceC39332e9 = interfaceC39332e27;
            interfaceC39332e12 = interfaceC39332e28;
            interfaceC39332e8 = interfaceC39332e26;
            modifier2 = modifier14;
            z17 = z35;
            f18 = f29;
            f17 = f27;
            z24 = z34;
            textResource4 = textResource1114;
            interfaceC39332e14 = interfaceC39332e24;
        } else {
            c28655q4.m87138X();
            modifier2 = modifier;
            enumC30774g2 = enumC30774g;
            interfaceC39332e8 = interfaceC39332e3;
            z17 = z4;
            f16 = f14;
            z18 = z13;
            f17 = f15;
            z19 = z14;
            z24 = z15;
            interfaceC4339a2 = interfaceC4339a;
            interfaceC39332e9 = interfaceC39332e29;
            interfaceC39332e10 = interfaceC39332e7;
            c28655q = c28655q4;
            textResource3 = textResourceM21267a;
            interfaceC39332e11 = interfaceC39332e;
            c39174f2 = c39174f;
            f18 = f13;
            interfaceC39332e12 = interfaceC39332e30;
            textResource4 = textResourceM21267a2;
            interfaceC39332e13 = interfaceC39332e31;
            interfaceC39332e14 = interfaceC39332e2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: qy0.e
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC30773f.m94552z(modifier2, textResource3, interfaceC39332e11, textResource4, interfaceC39332e14, c39174f2, enumC30774g2, interfaceC39332e8, interfaceC39332e9, interfaceC39332e12, z17, f18, interfaceC39332e13, interfaceC39332e10, f16, z18, f17, z19, z24, interfaceC4339a2, i13, i14, i15, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m94549w() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m94550x(boolean z4, InterfaceC4339a interfaceC4339a) {
        if (z4) {
            interfaceC4339a.invoke();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m94551y(String str, InterfaceC18044z semantics) {
        AbstractC22676k.m65750j(semantics, "$this$semantics");
        AbstractC18041w.m51806e(str, semantics);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m94552z(Modifier modifier, TextResource textResource, InterfaceC39332e interfaceC39332e, TextResource textResource2, InterfaceC39332e interfaceC39332e2, C39174f c39174f, EnumC30774g enumC30774g, InterfaceC39332e interfaceC39332e3, InterfaceC39332e interfaceC39332e4, InterfaceC39332e interfaceC39332e5, boolean z4, Float f13, InterfaceC39332e interfaceC39332e6, InterfaceC39332e interfaceC39332e7, float f14, boolean z13, float f15, boolean z14, boolean z15, InterfaceC4339a interfaceC4339a, int i13, int i14, int i15, Composer composer, int i16) {
        m94548v(modifier, textResource, interfaceC39332e, textResource2, interfaceC39332e2, c39174f, enumC30774g, interfaceC39332e3, interfaceC39332e4, interfaceC39332e5, z4, f13, interfaceC39332e6, interfaceC39332e7, f14, z13, f15, z14, z15, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), AbstractC28683x.m87244L(i14), i15);
        return C23454a0.f92919a;
    }
}
