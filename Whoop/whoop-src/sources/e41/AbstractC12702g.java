package e41;

import android.content.res.Configuration;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.core.app.NotificationCompat;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ck1.C4780c;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import d01.C11439d;
import do0.C12229c;
import dw1.C12413a;
import e93.AbstractC12889b;
import gy0.AbstractC16277f;
import gz0.EnumC16313m0;
import hg3.AbstractC17269i;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.AbstractC21478l0;
import java.io.IOException;
import java.util.Map;
import l83.C23454a0;
import l83.C23465k;
import live.hms.video.utils.AndroidSDKConstants;
import m83.AbstractC25247g0;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p132f0.C13825t;
import p163g1.AbstractC15005f3;
import p163g1.C14972c3;
import p163g1.C15093n7;
import p163g1.InterfaceC15022g9;
import p180h0.EnumC16377d2;
import p208i2.AbstractC17897m;
import p208i2.C17891j;
import p208i2.C17919x;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.EnumC22935a1;
import p315m0.AbstractC24868a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p636y3.C39178j;
import p636y3.InterfaceC39171c;
import p704dk2.C12122i;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.AbstractC39330c;
import pz0.AbstractC29641d;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import rz0.AbstractC31926e;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import x81.C38072d;

/* JADX INFO: renamed from: e41.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a=\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u008b\u0001\u0010\u001e\u001a\u00020\u001b2\b\b\u0002\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u001a2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a}\u0010#\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u00012\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00192\u0006\u0010\u001d\u001a\u00020\u001aH\u0001¢\u0006\u0004\b#\u0010$\u001a\u001f\u0010'\u001a\u00020\u0000*\u00020\u00002\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%H\u0003¢\u0006\u0004\b'\u0010(\u001a\u001b\u0010+\u001a\u00020\u001b*\u00020)2\u0006\u0010*\u001a\u00020%H\u0002¢\u0006\u0004\b+\u0010,¨\u0006-"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "", "isDraggable", "Li2/x;", "borderColor", "shouldHideEndTrim", "z", "(Landroidx/compose/ui/Modifier;ZJZ)Landroidx/compose/ui/Modifier;", "Lg1/n7;", "Le41/k;", "swipeableState", "", "", "anchors", "A", "(Landroidx/compose/ui/Modifier;ZLg1/n7;Ljava/util/Map;)Landroidx/compose/ui/Modifier;", "modifier", "showHighlight", "toggleInitialState", "isOrderable", "Lgz0/m0;", "leftIcon", "previewIcon", "Lcom/whoop/design/util/TextResource;", "title", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", NotificationCompat.CATEGORY_EVENT, "r", "(Landroidx/compose/ui/Modifier;ZZZZZLgz0/m0;Lgz0/m0;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lg1/n7;Landroidx/compose/runtime/Composer;III)V", "borderModifier", "backgroundColor", "isFutureIAEnabled", "l", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;JLgz0/m0;Lgz0/m0;Lcom/whoop/design/util/TextResource;ZZZZLkotlin/jvm/functions/Function1;Ljava/lang/Object;Landroidx/compose/runtime/Composer;II)V", "Lf0/t;", "end", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Landroidx/compose/ui/Modifier;Lf0/t;)Landroidx/compose/ui/Modifier;", "Lk2/e;", "border", "y", "(Lk2/e;Lf0/t;)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC12702g {
    /* JADX INFO: renamed from: A */
    private static final Modifier m35507A(Modifier modifier, boolean z4, C15093n7 c15093n7, Map<Float, ? extends EnumC12706k> map) {
        if (!z4) {
            return modifier;
        }
        EnumC16377d2 enumC16377d2 = EnumC16377d2.f62971w;
        return AbstractC21478l0.m60426c0(modifier, c15093n7, map, false, false, new C12413a(3), null, 440);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final InterfaceC15022g9 m35508B(EnumC12706k enumC12706k, EnumC12706k enumC12706k2) {
        AbstractC22676k.m65750j(enumC12706k, "<unused var>");
        AbstractC22676k.m65750j(enumC12706k2, "<unused var>");
        return new C14972c3(0.2f);
    }

    /* JADX INFO: renamed from: l */
    public static final void m35520l(final Modifier modifier, final Modifier borderModifier, final long j7, final EnumC16313m0 leftIcon, final EnumC16313m0 enumC16313m0, final TextResource title, final boolean z4, final boolean z13, final boolean z14, final boolean z15, final Function1 onViewEvent, final Object event, Composer composer, final int i13, final int i14) {
        int i15;
        int i16;
        boolean z16;
        int i17;
        C28655q c28655q;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(borderModifier, "borderModifier");
        AbstractC22676k.m65750j(leftIcon, "leftIcon");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(event, "event");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-474138580);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87153g(borderModifier) ? 32 : 16;
        }
        int i18 = i15;
        if ((i13 & 384) == 0) {
            i16 = i18 | (c28655q2.m87151f(j7) ? 256 : 128);
        } else {
            i16 = i18;
        }
        if ((i13 & 3072) == 0) {
            i16 |= c28655q2.m87149e(leftIcon.ordinal()) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i16 |= c28655q2.m87149e(enumC16313m0 == null ? -1 : enumC16313m0.ordinal()) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i16 |= c28655q2.m87153g(title) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            z16 = z4;
            i16 |= c28655q2.m87155h(z16) ? 1048576 : 524288;
        } else {
            z16 = z4;
        }
        if ((i13 & 12582912) == 0) {
            i16 |= c28655q2.m87155h(z13) ? 8388608 : 4194304;
        }
        if ((i13 & 100663296) == 0) {
            i16 |= c28655q2.m87155h(z14) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        if ((i13 & 805306368) == 0) {
            i16 |= c28655q2.m87155h(z15) ? 536870912 : 268435456;
        }
        if ((i14 & 6) == 0) {
            i17 = i14 | (c28655q2.m87157i(onViewEvent) ? 4 : 2);
        } else {
            i17 = i14;
        }
        if ((i14 & 48) == 0) {
            i17 |= c28655q2.m87157i(event) ? 32 : 16;
        }
        if (c28655q2.m87135U(i16 & 1, ((306783379 & i16) == 306783378 && (i17 & 19) == 18) ? false : true)) {
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifier);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            int i19 = i16;
            final boolean z17 = z16;
            c28655q = c28655q2;
            AbstractC31926e.m99375j(borderModifier, null, j7, null, null, null, 0.0f, AbstractC37817c.m121344e(-1761373000, c28655q2, new InterfaceC4351m() { // from class: e41.d
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC12702g.m35521m(z13, z15, enumC16313m0, z17, onViewEvent, event, leftIcon, title, z14, (Composer) obj, iIntValue);
                }
            }), c28655q, ((i19 >> 3) & 14) | 12582912 | (i19 & 896), 122);
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e41.e
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC12702g.m35525q(modifier, borderModifier, j7, leftIcon, enumC16313m0, title, z4, z13, z14, z15, onViewEvent, event, i13, i14, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m35521m(boolean z4, boolean z13, EnumC16313m0 enumC16313m0, boolean z14, Function1 function1, Object obj, EnumC16313m0 enumC16313m1, TextResource textResource, boolean z15, Composer composer, int i13) throws XmlPullParserException, IOException {
        boolean z16;
        String strM92103Y;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f13 = (z4 ? 2 : (float) 0.5d) * 8;
            float f14 = 2;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3395q(c2314t, 8 * f14, f13));
            float f15 = 4;
            float f16 = 5 * f15;
            C22971k c22971kM66746i = AbstractC22977m.m66746i(f16);
            C2306l c2306l = C2299e.f9108K;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22971kM66746i, c2306l, c28655q, 54);
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
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q(f14, f15, c2306l, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M53376q);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            Modifier modifierM3419p = AbstractC1102d.m3419p(f16, c2314t);
            C27430e c27430eM107874S = AbstractC34132o.m107874S(enumC16313m1.toWhoopIcon(), c28655q, 6);
            C38072d c38072d = C38072d.f163053a;
            AbstractC15005f3.m43108b(c27430eM107874S, null, modifierM3419p, c38072d.m121949b(c28655q, 6).getWhite30(), c28655q, 432, 0);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource, c28655q, 0), null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getSh4(), null, c28655q, 0, 0, 196602);
            C28655q c28655q2 = c28655q;
            c28655q2.m87173q(true);
            if (!z13 || enumC16313m0 == null) {
                c28655q2.m87150e0(815598606);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(815276113);
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(enumC16313m0.toWhoopIcon(), c28655q2, 6), null, AbstractC1102d.m3419p(f16, c2314t), c38072d.m121949b(c28655q2, 6).getWhite50(), c28655q2, 432, 0);
                c28655q2.m87173q(false);
            }
            if (z4) {
                c28655q2.m87150e0(815952657);
                int whoopIcon = (z14 ? EnumC16313m0.DRAG : EnumC16313m0.ADD).toWhoopIcon();
                if (z14) {
                    c28655q2.m87150e0(-389315648);
                    strM92103Y = AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62326g);
                    z16 = false;
                } else {
                    z16 = false;
                    c28655q2.m87150e0(-389314046);
                    strM92103Y = AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62302a);
                }
                c28655q2.m87173q(z16);
                C27430e c27430eM107874S2 = AbstractC34132o.m107874S(whoopIcon, c28655q2, 6);
                boolean zM87153g = c28655q2.m87153g(function1) | c28655q2.m87157i(obj);
                Object objM87133R = c28655q2.m87133R();
                if (zM87153g || objM87133R == C28635l.f115821a) {
                    objM87133R = new C11439d(function1, obj, 1);
                    c28655q2.m87172p0(objM87133R);
                }
                AbstractC15005f3.m43108b(c27430eM107874S2, strM92103Y, AbstractC1102d.m3419p(f16, AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15)), c38072d.m121949b(c28655q2, 6).getBrandWhite(), c28655q2, 0, 0);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(815643401);
                AbstractC39330c.m125320b(0L, c38072d.m121949b(c28655q2, 6).getAccentAction(), 0L, 0L, AbstractC37817c.m121344e(-1659539717, c28655q2, new C12701f(z15, function1, 0)), c28655q2, 24576, 13);
                c28655q2 = c28655q2;
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m35522n(boolean z4, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            boolean zM87153g = c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C12122i(function1, 3);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC29641d.m91043e(null, z4, false, 0L, null, null, (Function1) objM87133R, c28655q, 0, 61);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m35523o(Function1 function1, boolean z4) {
        function1.invoke(new C12707l(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m35524p(Function1 function1, Object obj) {
        function1.invoke(obj);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m35525q(Modifier modifier, Modifier modifier2, long j7, EnumC16313m0 enumC16313m0, EnumC16313m0 enumC16313m1, TextResource textResource, boolean z4, boolean z13, boolean z14, boolean z15, Function1 function1, Object obj, int i13, int i14, Composer composer, int i15) {
        m35520l(modifier, modifier2, j7, enumC16313m0, enumC16313m1, textResource, z4, z13, z14, z15, function1, obj, composer, AbstractC28683x.m87244L(i13 | 1), AbstractC28683x.m87244L(i14));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r */
    public static final void m35526r(Modifier modifier, final boolean z4, final boolean z13, final boolean z14, final boolean z15, final boolean z16, final EnumC16313m0 leftIcon, final EnumC16313m0 enumC16313m0, final TextResource title, Function1 function1, Object obj, C15093n7 c15093n7, Composer composer, final int i13, final int i14, final int i15) {
        Modifier modifier2;
        int i16;
        Object obj2;
        int i17;
        final Function1 function2;
        final C15093n7 c15093n8;
        final Modifier modifier3;
        final Object obj3;
        Function1 function3;
        Object obj4;
        Modifier modifier4;
        Function1 function4;
        C15093n7 c15093n9;
        boolean z17;
        int i18;
        long jM95628d;
        long jM95624D;
        C2314t c2314t;
        boolean z18;
        boolean z19;
        boolean z24;
        Function1 function5;
        Function1 function6;
        AbstractC22676k.m65750j(leftIcon, "leftIcon");
        AbstractC22676k.m65750j(title, "title");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(8245268);
        int i19 = i15 & 1;
        if (i19 != 0) {
            i16 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i16 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i16 = i13;
        }
        if ((i13 & 48) == 0) {
            i16 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i16 |= c28655q.m87155h(z13) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i16 |= c28655q.m87155h(z14) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i16 |= c28655q.m87155h(z15) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i16 |= c28655q.m87155h(z16) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i16 |= c28655q.m87149e(leftIcon.ordinal()) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i16 |= c28655q.m87149e(enumC16313m0 == null ? -1 : enumC16313m0.ordinal()) ? 8388608 : 4194304;
        }
        if ((100663296 & i13) == 0) {
            i16 |= c28655q.m87153g(title) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        int i24 = i15 & 512;
        if (i24 != 0) {
            i16 |= 805306368;
        } else if ((i13 & 805306368) == 0) {
            i16 |= c28655q.m87157i(function1) ? 536870912 : 268435456;
        }
        int i25 = i16;
        int i26 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i26 != 0) {
            i17 = i14 | 6;
            obj2 = obj;
        } else {
            obj2 = obj;
            if ((i14 & 6) == 0) {
                i17 = i14 | (c28655q.m87157i(obj2) ? 4 : 2);
            } else {
                i17 = i14;
            }
        }
        if ((i14 & 48) == 0) {
            i17 |= ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0 && c28655q.m87153g(c15093n7)) ? 32 : 16;
        }
        if (c28655q.m87135U(i25 & 1, ((i25 & 306783379) == 306783378 && (i17 & 19) == 18) ? false : true)) {
            c28655q.m87140Z();
            int i27 = i13 & 1;
            C2314t c2314t2 = C2314t.f9131w;
            C28676v0 c28676v0 = C28635l.f115821a;
            int i28 = 6;
            if (i27 == 0 || c28655q.m87118C()) {
                if (i19 != 0) {
                    modifier2 = c2314t2;
                }
                if (i24 != 0) {
                    Object objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C12229c(23);
                        c28655q.m87172p0(objM87133R);
                    }
                    function3 = (Function1) objM87133R;
                } else {
                    function3 = function1;
                }
                if (i26 != 0) {
                    obj2 = C23454a0.f92919a;
                }
                if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                    i17 &= -113;
                    obj4 = obj2;
                    modifier4 = modifier2;
                    function4 = function3;
                    c15093n9 = new C15093n7(EnumC12706k.NOT_EXPANDED, null, i28);
                } else {
                    obj4 = obj2;
                    modifier4 = modifier2;
                    function4 = function3;
                    c15093n9 = c15093n7;
                }
            } else {
                c28655q.m87138X();
                if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                    i17 &= -113;
                }
                c15093n9 = c15093n7;
                obj4 = obj2;
                modifier4 = modifier2;
                function4 = function1;
            }
            c28655q.m87175r();
            FeatureFlagChecker featureFlagChecker = (FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p());
            boolean z25 = featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.HOME_ONBOARDING_FUTURE_IA) || featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.HOME_FUTURE_IA);
            if (z4) {
                c28655q.m87150e0(-666206617);
                long jM51541c = C17919x.m51541c(0.15f, C38072d.f163053a.m121949b(c28655q, 6).getRecovery());
                z17 = false;
                c28655q.m87173q(false);
                jM95628d = jM51541c;
                i18 = 6;
            } else {
                z17 = false;
                c28655q.m87150e0(-666205253);
                i18 = 6;
                jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
            }
            if (z4) {
                c28655q.m87150e0(-666203108);
                jM95624D = C38072d.f163053a.m121949b(c28655q, i18).getRecovery();
                c28655q.m87173q(z17);
            } else {
                c28655q.m87150e0(-666202082);
                jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, i18, z17);
            }
            if (z13 && z16) {
                c2314t = c2314t2;
                z18 = true;
            } else {
                c2314t = c2314t2;
                z18 = false;
            }
            Modifier modifierM35534z = m35534z(c2314t, z18, jM95624D, z15);
            float f13 = ((Configuration) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4975a)).screenWidthDp;
            Modifier modifierM35507A = m35507A(AbstractC1102d.m3424u(f13, AbstractC1099a.m3388j(modifier4, EnumC22935a1.f90537w)), z13, c15093n9, AbstractC25247g0.m73990Y(new C23465k(Float.valueOf(0.0f), EnumC12706k.NOT_EXPANDED), new C23465k(Float.valueOf(((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo743q0(f13) * (-0.2f)), EnumC12706k.EXPANDED)));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            Function1 function7 = function4;
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM35507A);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
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
            if (z16) {
                c28655q.m87150e0(2025387305);
                z19 = false;
                z24 = true;
                AbstractC12705j.m35547c(AbstractC1102d.m3424u(AbstractC12889b.m36258X(((Number) c15093n9.f56512e.getValue()).floatValue()) * (-0.3f), AbstractC1102d.m3406c(1.0f, C1100b.f4583a.mo3400a(c2314t, C2299e.f9103F))), function7, obj4, c28655q, ((i25 >> 24) & 112) | ((i17 << 6) & 896), 0);
                function5 = function7;
                c28655q.m87173q(false);
            } else {
                z19 = false;
                z24 = true;
                function5 = function7;
                c28655q.m87150e0(2025755368);
                c28655q.m87173q(false);
            }
            Modifier modifierM3424u = AbstractC1102d.m3424u(f13, c2314t);
            boolean z26 = ((((i17 & 112) ^ 48) <= 32 || !c28655q.m87153g(c15093n9)) && (i17 & 48) != 32) ? z19 : z24;
            Object objM87133R2 = c28655q.m87133R();
            if (z26 || objM87133R2 == c28676v0) {
                objM87133R2 = new C12697b(c15093n9, 0);
                c28655q.m87172p0(objM87133R2);
            }
            Modifier modifierM3390l = AbstractC1099a.m3390l(modifierM3424u, (Function1) objM87133R2);
            if (z13 && z16) {
                c28655q.m87150e0(2026432160);
                Object objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C12229c(24);
                    c28655q.m87172p0(objM87133R3);
                }
                c28655q.m87173q(z19);
                function6 = (Function1) objM87133R3;
            } else {
                c28655q.m87150e0(-1320105083);
                c28655q.m87173q(z19);
                function6 = function5;
            }
            Object obj5 = obj4;
            m35520l(modifierM3390l, modifierM35534z, jM95628d, leftIcon, enumC16313m0, title, z13, z16, z14, z25, function6, obj5, c28655q, ((i25 >> 9) & 523264) | ((i25 << 12) & 3670016) | ((i25 << 6) & 29360128) | ((i25 << 15) & 234881024), (i17 << 3) & 112);
            c28655q = c28655q;
            c28655q.m87173q(z24);
            obj3 = obj5;
            function2 = function5;
            c15093n8 = c15093n9;
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            function2 = function1;
            c15093n8 = c15093n7;
            modifier3 = modifier2;
            obj3 = obj2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e41.c
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj6, Object obj7) {
                    int iIntValue = ((Integer) obj7).intValue();
                    return AbstractC12702g.m35530v(modifier3, z4, z13, z14, z15, z16, leftIcon, enumC16313m0, title, function2, obj3, c15093n8, i13, i14, i15, (Composer) obj6, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m35527s(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C39178j m35528t(C15093n7 c15093n7, InterfaceC39171c offset) {
        AbstractC22676k.m65750j(offset, "$this$offset");
        return new C39178j((((long) AbstractC12889b.m36258X(((Number) c15093n7.f56512e.getValue()).floatValue())) << 32) | (((long) 0) & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m35529u(Object obj) {
        AbstractC22676k.m65750j(obj, "<unused var>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m35530v(Modifier modifier, boolean z4, boolean z13, boolean z14, boolean z15, boolean z16, EnumC16313m0 enumC16313m0, EnumC16313m0 enumC16313m1, TextResource textResource, Function1 function1, Object obj, C15093n7 c15093n7, int i13, int i14, int i15, Composer composer, int i16) {
        m35526r(modifier, z4, z13, z14, z15, z16, enumC16313m0, enumC16313m1, textResource, function1, obj, c15093n7, composer, AbstractC28683x.m87244L(i13 | 1), AbstractC28683x.m87244L(i14), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: w */
    private static final Modifier m35531w(Modifier modifier, C13825t c13825t) {
        return AbstractC1125a.m3478a(modifier, new C4780c(c13825t, 26));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m35532x(C13825t c13825t, InterfaceC22131e drawBehind) {
        AbstractC22676k.m65750j(drawBehind, "$this$drawBehind");
        if (c13825t != null) {
            m35533y(drawBehind, c13825t);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: y */
    private static final void m35533y(InterfaceC22131e interfaceC22131e, C13825t c13825t) {
        float fMo743q0 = interfaceC22131e.mo743q0(c13825t.f49345a);
        if (fMo743q0 == 0.0f) {
            return;
        }
        C17891j c17891jM51478a = AbstractC17897m.m51478a();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC22131e.mo731d() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC22131e.mo731d() & 4294967295L));
        c17891jM51478a.m51462i(fIntBitsToFloat, 0.0f);
        float f13 = fIntBitsToFloat - fMo743q0;
        c17891jM51478a.m51461h(f13, 0.0f);
        c17891jM51478a.m51461h(f13, fIntBitsToFloat2);
        c17891jM51478a.m51461h(fIntBitsToFloat, fIntBitsToFloat2);
        c17891jM51478a.m51459f();
        InterfaceC22131e.m63378L(interfaceC22131e, c17891jM51478a, c13825t.f49346b, 0.0f, null, 60);
    }

    /* JADX INFO: renamed from: z */
    private static final Modifier m35534z(Modifier modifier, boolean z4, long j7, boolean z13) {
        return (!z4 || z13) ? modifier : m35531w(modifier, AbstractC17269i.m48880a(1 * 4, j7));
    }
}
