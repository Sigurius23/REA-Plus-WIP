package o11;

import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.WithAlignmentLineElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import aw0.C2101a;
import b30.C2549j2;
import b91.C2886a;
import bm2.C3428b1;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import d01.C11439d;
import d30.C11545k0;
import ge3.AbstractC15751g;
import gy0.AbstractC16277f;
import hb3.AbstractC17104a0;
import hy0.AbstractC17755i2;
import hy0.EnumC17744g;
import ih1.C18522f;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import mx1.C26003i;
import no.nordicsemi.android.dfu.DfuBaseService;
import nq0.C27050m;
import ny0.AbstractC27237a;
import ny0.AbstractC27242b1;
import ny0.AbstractC27265l0;
import ny0.AbstractC27274q;
import ny0.C27270o;
import ny0.EnumC27269n0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2314t;
import p031b9.AbstractC2875y;
import p040c0.AbstractC3788w0;
import p040c0.C3733d1;
import p040c0.C3739f1;
import p040c0.InterfaceC3747i0;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22994r1;
import p291l0.C23000t1;
import p291l0.C23010x;
import p291l0.C23016z;
import p291l0.InterfaceC22965i;
import p294l3.C23285v0;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.AbstractC39083d;
import p635y2.C39111m;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p719m22.C24965t;
import p720m91.AbstractC25291c;
import p720m91.AbstractC25303l;
import p720m91.C25287a;
import p736sz0.C33210q;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import r41.AbstractC30924h;
import r41.AbstractC30925i;
import v63.AbstractC35745c;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.C39274g;

/* JADX INFO: renamed from: o11.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u00ad\u0001\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0091\u0001\u0010(\u001a\u00020\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001d2\u0006\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f2\b\b\u0002\u0010#\u001a\u00020\u001d2\b\b\u0001\u0010%\u001a\u00020$2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00140&H\u0003¢\u0006\u0004\b(\u0010)\u001a\u0017\u0010*\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0000H\u0003¢\u0006\u0004\b*\u0010+\u001aE\u0010,\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001d2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00140&H\u0003¢\u0006\u0004\b,\u0010-\u001a+\u0010.\u001a\u00020\u00142\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00140&2\u0006\u0010\u001e\u001a\u00020\u001dH\u0003¢\u0006\u0004\b.\u0010/\u001a;\u00107\u001a\u00020\u00142\u0006\u00101\u001a\u0002002\b\u00102\u001a\u0004\u0018\u0001002\b\u00103\u001a\u0004\u0018\u0001002\u0006\u00104\u001a\u00020\f2\u0006\u00106\u001a\u000205H\u0003¢\u0006\u0004\b7\u00108\u001a\u000f\u00109\u001a\u00020\u0014H\u0003¢\u0006\u0004\b9\u0010:\"\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006?"}, m65681d2 = {"Lcom/whoop/design/util/TextResource;", "repsTitleDisplay", "weightTitleDisplay", "avgHrTitleDisplay", "tonnageUnitsDisplay", "hrUnitsDisplay", "tonnageDisplay", "repsDisplay", "totalsDisplay", "", "Lo11/q;", "statRows", "", "isOneRepMaxIntensityEnabled", "hasSessionIntensity", "intensityTitleDisplay", "intensityUnitsDisplay", "intensityDisplay", "weightLabelDisplay", "intensityLabelDisplay", "Ll83/a0;", "y", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;ZZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;III)V", "Lr41/i;", "sets", "infoText", "volumeLabelText", "hideAllBottomControls", "enableDeleteButton", "", "onAddSetClickEvent", "onRemoveSetClickEvent", "showAddAndRemoveSetButtons", "enableAddSetButton", "enableRemoveSetButton", "onDeleteExerciseClickEvent", "", "weightLabelResId", "Lkotlin/Function1;", "onViewEvent", "C", "(Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLjava/lang/Object;Ljava/lang/Object;ZZZLjava/lang/Object;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "A", "(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V", "r", "(Ljava/lang/Object;Ljava/lang/Object;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "v", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)V", "Lsz0/q;", "leftStat", "middleStat", "rightStat", "useDividers", "Landroidx/compose/ui/Modifier;", "modifier", "K", "(Lsz0/q;Lsz0/q;Lsz0/q;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "I", "(Landroidx/compose/runtime/Composer;I)V", "Ly3/f;", "a", "F", "detailsSummaryAchievementIconSize", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27401g {

    /* JADX INFO: renamed from: a */
    private static final float f110163a = 5 * 4;

    /* JADX INFO: renamed from: A */
    private static final void m82558A(TextResource textResource, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-951317248);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87153g(textResource) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            String strM21274h = AbstractC8693b.m21274h(textResource, c28655q2, i14 & 14);
            C38072d c38072d = C38072d.f163053a;
            c28655q = c28655q2;
            AbstractC30795n.m94707h(strM21274h, AbstractC1099a.m3398t(AbstractC1099a.m3396r(C2314t.f9131w, AbstractC30924h.m95072M(), 0.0f, 2), 0.0f, ((float) 1.5d) * 8, 0.0f, 0.0f, 13), c38072d.m121949b(c28655q2, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getB3(), null, c28655q, 48, 0, 196600);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3428b1(textResource, i13, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m82559B(TextResource textResource, int i13, Composer composer, int i14) {
        m82558A(textResource, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r4v10, types: [d0.c0, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX INFO: renamed from: C */
    public static final void m82560C(final List<? extends AbstractC30925i> list, final TextResource textResource, final TextResource textResource2, final boolean z4, final boolean z13, final Object obj, final Object obj2, final boolean z14, final boolean z15, final boolean z16, Object obj3, final int i13, final Function1 function1, Composer composer, final int i14, final int i15, final int i16) {
        boolean z17;
        Object obj4;
        int i17;
        final Object obj5;
        C2306l c2306l = C2299e.f9107J;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-7962785);
        int i18 = (i14 & 6) == 0 ? (c28655q.m87157i(list) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i18 |= c28655q.m87153g(textResource) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i18 |= c28655q.m87153g(textResource2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i18 |= c28655q.m87155h(z4) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i14 & 24576) == 0) {
            z17 = z13;
            i18 |= c28655q.m87155h(z17) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        } else {
            z17 = z13;
        }
        if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            i18 |= c28655q.m87157i(obj) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((i14 & 1572864) == 0) {
            i18 |= c28655q.m87157i(obj2) ? 1048576 : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i18 |= c28655q.m87155h(z14) ? 8388608 : 4194304;
        }
        if ((i14 & 100663296) == 0) {
            i18 |= c28655q.m87155h(z15) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        if ((i14 & 805306368) == 0) {
            i18 |= c28655q.m87155h(z16) ? 536870912 : 268435456;
        }
        int i19 = i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i19 != 0) {
            obj4 = obj3;
            i17 = i15 | 6;
        } else {
            obj4 = obj3;
            i17 = (i15 & 6) == 0 ? i15 | (c28655q.m87157i(obj4) ? 4 : 2) : i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= c28655q.m87149e(i13) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i17 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        int i24 = i18;
        if (c28655q.m87135U(i24 & 1, ((i18 & 306783379) == 306783378 && (i17 & 147) == 146) ? false : true)) {
            Object obj6 = i19 != 0 ? C23454a0.f92919a : obj4;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
            InterfaceC0221l.f734a.getClass();
            final Object obj7 = obj6;
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            boolean z18 = !list.isEmpty();
            ?? r10 = 0;
            C3733d1 c3733d1M11576d = AbstractC3788w0.m11576d(null, null, 13);
            C3739f1 c3739f1M11584l = AbstractC3788w0.m11584l(null, c2306l, null, 13);
            C37816b c37816bM121344e = AbstractC37817c.m121344e(-278716243, c28655q, new Function3() { // from class: o11.c
                @Override // p715kotlin.jvm.functions.Function3
                public final Object invoke(Object obj8, Object obj9, Object obj10) {
                    int iIntValue = ((Integer) obj10).intValue();
                    return AbstractC27401g.m82561D(textResource, textResource2, i13, (InterfaceC3747i0) obj8, (Composer) obj9, iIntValue);
                }
            });
            C23016z c23016z = C23016z.f90757a;
            AbstractC1090b.m3350e(c23016z, z18, null, c3733d1M11576d, c3739f1M11584l, null, c37816bM121344e, c28655q, 1600518, 18);
            c28655q.m87150e0(-2129847316);
            for (C25287a c25287a : AbstractC25291c.m74242b(list, c28655q, i24 & 14)) {
                AbstractC1090b.m3349d(c23016z, c25287a.getTransitionState(), null, AbstractC3788w0.m11576d(r10, r10, 13), AbstractC3788w0.m11584l(r10, c2306l, r10, 13), null, AbstractC37817c.m121344e(929765515, c28655q, new C18522f(29, c25287a, function1)), c28655q, 1600518, 18);
                r10 = 0;
            }
            c28655q.m87173q(false);
            final boolean z19 = z17;
            AbstractC1090b.m3350e(c23016z, !z4, null, AbstractC3788w0.m11576d(null, null, 13), AbstractC3788w0.m11584l(null, c2306l, null, 13), null, AbstractC37817c.m121344e(-1721597596, c28655q, new Function3() { // from class: o11.d
                @Override // p715kotlin.jvm.functions.Function3
                public final Object invoke(Object obj8, Object obj9, Object obj10) {
                    int iIntValue = ((Integer) obj10).intValue();
                    return AbstractC27401g.m82563F(z14, obj, obj2, z15, z16, function1, z19, obj7, (InterfaceC3747i0) obj8, (Composer) obj9, iIntValue);
                }
            }), c28655q, 1600518, 18);
            float f13 = 4;
            AbstractC25012a.m73388u(f13, f13, c2314t, c28655q, true);
            obj5 = obj7;
        } else {
            c28655q.m87138X();
            obj5 = obj4;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: o11.e
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj8, Object obj9) {
                    int iIntValue = ((Integer) obj9).intValue();
                    return AbstractC27401g.m82565H(list, textResource, textResource2, z4, z13, obj, obj2, z14, z15, z16, obj5, i13, function1, i14, i15, i16, (Composer) obj8, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m82561D(TextResource textResource, TextResource textResource2, int i13, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i14) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, composer, 0);
        C28655q c28655q = (C28655q) composer;
        int iHashCode = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        C2314t c2314t = C2314t.f9131w;
        Modifier modifierM118962N = AbstractC37056f.m118962N(composer, c2314t);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j = C0217k.f724b;
        AbstractC17104a0 abstractC17104a0 = c28655q.f115906a;
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        C0209i c0209i = C0217k.f729g;
        AbstractC28683x.m87239G(composer, c0209i, c23010xM66775a);
        C0209i c0209i2 = C0217k.f728f;
        AbstractC28683x.m87239G(composer, c0209i2, interfaceC28653p1M87165m);
        C0209i c0209i3 = C0217k.f732j;
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
        }
        C0209i c0209i4 = C0217k.f726d;
        AbstractC28683x.m87239G(composer, c0209i4, modifierM118962N);
        if (textResource != null) {
            c28655q.m87150e0(623597309);
            m82558A(textResource, composer, 0);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(623660735);
            c28655q.m87173q(false);
        }
        C2306l c2306l = C2299e.f9108K;
        float f13 = 8;
        Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3413j(c2314t, ((float) 4.5d) * f13, 0.0f, 2), 0.0f, 2 * f13, 0.0f, 1 * f13, 5);
        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, composer, 48);
        int iHashCode2 = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
        Modifier modifierM118962N2 = AbstractC37056f.m118962N(composer, modifierM3398t);
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(composer, c0209i, c22994r1M66759a);
        AbstractC28683x.m87239G(composer, c0209i2, interfaceC28653p1M87165m2);
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
        }
        AbstractC28683x.m87239G(composer, c0209i4, modifierM118962N2);
        C38072d c38072d = C38072d.f163053a;
        C2886a c2886aM8397c = C2886a.m8397c(c38072d.m121952e(composer, 6).getFormLabel(), C23285v0.m67364b(c38072d.m121952e(composer, 6).getFormLabel().getStyle(), c38072d.m121949b(composer, 6).getWhite70(), AbstractC35745c.m113246h(12), null, null, 0L, 0, 0L, null, null, 16777212), null, 2, null);
        AbstractC22953f.m66715b(composer, AbstractC1102d.m3424u(AbstractC30924h.m95070K() + AbstractC30924h.m95071L() + AbstractC30924h.m95072M(), c2314t));
        String strM21274h = AbstractC8693b.m21274h(textResource2, composer, 0);
        if (0.4f <= 0.0d) {
            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
        }
        AbstractC30795n.m94707h(strM21274h, new LayoutWeightElement(0.4f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.4f, true), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8397c, null, composer, 0, 0, 196604);
        AbstractC22953f.m66715b(composer, AbstractC1102d.m3424u(AbstractC30924h.m95073N(), c2314t));
        String strM92103Y = AbstractC30060g.m92103Y(composer, i13);
        if (0.6f <= 0.0d) {
            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
        }
        AbstractC30795n.m94707h(strM92103Y, new LayoutWeightElement(0.6f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.6f, true), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8397c, null, composer, 0, 0, 196604);
        AbstractC22953f.m66715b(composer, AbstractC1102d.m3424u(AbstractC30924h.m95067H() + AbstractC30924h.m95068I() + AbstractC30924h.m95069J(), c2314t));
        c28655q.m87173q(true);
        c28655q.m87173q(true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m82562E(C25287a c25287a, Function1 function1, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        AbstractC25303l.m74291r(c25287a.m74235d(), null, null, function1, composer, 0, 6);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m82563F(boolean z4, Object obj, Object obj2, boolean z13, boolean z14, Function1 function1, boolean z15, Object obj3, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        Function1 function2;
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        C2306l c2306l = C2299e.f9108K;
        float f13 = 8;
        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(C2314t.f9131w, 1 * f13, ((float) 1.25d) * f13, 2 * f13, 0.0f, 8));
        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, composer, 54);
        C28655q c28655q = (C28655q) composer;
        int iHashCode = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        Modifier modifierM118962N = AbstractC37056f.m118962N(composer, modifierM3409f);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j = C0217k.f724b;
        AbstractC17104a0 abstractC17104a0 = c28655q.f115906a;
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(composer, C0217k.f729g, c22994r1M66759a);
        AbstractC28683x.m87239G(composer, C0217k.f728f, interfaceC28653p1M87165m);
        C0209i c0209i = C0217k.f732j;
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
        }
        AbstractC28683x.m87239G(composer, C0217k.f726d, modifierM118962N);
        if (z4) {
            c28655q.m87150e0(2136722150);
            function2 = function1;
            m82592r(obj, obj2, z13, z14, function2, composer, 0);
            c28655q.m87173q(false);
        } else {
            function2 = function1;
            c28655q.m87150e0(2137122298);
            m82596v(function2, obj, composer, 0);
            c28655q.m87173q(false);
        }
        C27270o c27270o = new C27270o(AbstractC27274q.c.f109140f, C38072d.f163053a.m121951d().getAction().getDelete(), null, null, null, z15, false, false, 0.0f, false, 988, null);
        String strM92103Y = AbstractC30060g.m92103Y(composer, AbstractC16277f.f62329g2);
        boolean zM87153g = c28655q.m87153g(function2) | c28655q.m87157i(obj3);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            objM87133R = new C11439d(function2, obj3, 8);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC27242b1.m82092d(c27270o, strM92103Y, null, null, (InterfaceC4339a) objM87133R, composer, 0, 12);
        c28655q.m87173q(true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m82564G(Function1 function1, Object obj) {
        function1.invoke(obj);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m82565H(List list, TextResource textResource, TextResource textResource2, boolean z4, boolean z13, Object obj, Object obj2, boolean z14, boolean z15, boolean z16, Object obj3, int i13, Function1 function1, int i14, int i15, int i16, Composer composer, int i17) {
        m82560C(list, textResource, textResource2, z4, z13, obj, obj2, z14, z15, z16, obj3, i13, function1, composer, AbstractC28683x.m87244L(i14 | 1), AbstractC28683x.m87244L(i15), i16);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: I */
    private static final void m82566I(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(348039787);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            AbstractC15751g.m44449b(AbstractC1102d.m3424u(1, AbstractC1102d.m3411h(11 * 4, AbstractC1099a.m3396r(C2314t.f9131w, 2 * 8, 0.0f, 2))), C38072d.f163053a.m121949b(c28655q, 6).getWhite10(), 0.0f, 0.0f, c28655q, 6, 12);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C24965t(i13, 12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m82567J(int i13, Composer composer, int i14) {
        m82566I(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX INFO: renamed from: K */
    public static final void m82568K(C33210q c33210q, C33210q c33210q2, C33210q c33210q3, boolean z4, Modifier modifier, Composer composer, int i13) {
        int i14;
        boolean z13;
        Modifier layoutWeightElement;
        Modifier modifier2;
        ?? r15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1287499085);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c33210q) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(c33210q2) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(c33210q3) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87155h(z4) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87153g(modifier) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 9363) != 9362)) {
            InterfaceC22965i interfaceC22965iM66746i = z4 ? AbstractC22977m.f90654e : AbstractC22977m.m66746i(4 * 8);
            float f13 = 8;
            Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, modifier), ((float) 2.5d) * f13, 2 * f13);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(interfaceC22965iM66746i, C2299e.f9108K, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3395q);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            if (z4) {
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                z13 = true;
                layoutWeightElement = new LayoutWeightElement(1.0f, true);
            } else {
                z13 = true;
                layoutWeightElement = C2314t.f9131w;
            }
            AbstractC25303l.m74291r(c33210q, null, new C2101a(7, layoutWeightElement), null, c28655q, i14 & 14, 10);
            if (c33210q2 == null) {
                c28655q.m87150e0(-665110066);
                c28655q.m87173q(false);
                r15 = 0;
                modifier2 = layoutWeightElement;
            } else {
                c28655q.m87150e0(-665110065);
                if (z4) {
                    c28655q.m87150e0(2085344500);
                    m82566I(c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(2085399277);
                    c28655q.m87173q(false);
                }
                modifier2 = layoutWeightElement;
                r15 = 0;
                AbstractC25303l.m74291r(c33210q2, null, new C2101a(8, layoutWeightElement), null, c28655q, 0, 10);
                c28655q.m87173q(false);
            }
            if (c33210q3 == null) {
                c28655q.m87150e0(-664857199);
                c28655q.m87173q(r15);
            } else {
                c28655q.m87150e0(-664857198);
                if (z4) {
                    c28655q.m87150e0(-100966005);
                    m82566I(c28655q, r15);
                    c28655q.m87173q(r15);
                } else {
                    c28655q.m87150e0(-100911228);
                    c28655q.m87173q(r15);
                }
                AbstractC25303l.m74291r(c33210q3, null, new C2101a(9, modifier2), null, c28655q, 0, 10);
                c28655q.m87173q(r15);
            }
            c28655q.m87173q(z13);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2549j2(c33210q, c33210q2, c33210q3, z4, modifier, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final Modifier m82569L(Modifier modifier, C33210q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(1708482265);
        Modifier modifierM3599a = AbstractC1136a.m3599a(modifier, "exerciseTileContentLeftStatTag");
        c28655q.m87173q(false);
        return modifierM3599a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final Modifier m82570M(Modifier modifier, C33210q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-66074715);
        Modifier modifierM3599a = AbstractC1136a.m3599a(modifier, "exerciseTileContentMiddleStatTag");
        c28655q.m87173q(false);
        return modifierM3599a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final Modifier m82571N(Modifier modifier, C33210q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-1394227570);
        Modifier modifierM3599a = AbstractC1136a.m3599a(modifier, "exerciseTileContentRightStatTag");
        c28655q.m87173q(false);
        return modifierM3599a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m82572O(C33210q c33210q, C33210q c33210q2, C33210q c33210q3, boolean z4, Modifier modifier, int i13, Composer composer, int i14) {
        m82568K(c33210q, c33210q2, c33210q3, z4, modifier, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r */
    private static final void m82592r(Object obj, Object obj2, boolean z4, boolean z13, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1280662746);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(obj) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(obj2) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87155h(z4) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87155h(z13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87157i(function1) ? 16384 : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 9363) != 9362)) {
            float f13 = 8;
            Modifier modifierM3395q = AbstractC1099a.m3395q(C2314t.f9131w, 1 * f13, ((float) 0.5d) * f13);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(((float) 1.5d) * f13), C2299e.f9107J, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3395q);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            C38072d c38072d = C38072d.f163053a;
            int iM46127m = c38072d.m121951d().getAction().getRemove();
            String strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62299Z);
            int i15 = 57344 & i14;
            boolean zM87157i = c28655q.m87157i(obj2) | (i15 == 16384);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C11439d(obj2, function1, 6);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27237a.m82073c(iM46127m, strM92103Y, z13, 0.0f, (InterfaceC4339a) objM87133R, c28655q, (i14 >> 3) & 896, 8);
            int iM46115a = c38072d.m121951d().getAction().getAdd();
            String strM92103Y2 = AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62343k0);
            boolean zM87157i2 = (i15 == 16384) | c28655q.m87157i(obj);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C11439d(function1, obj, 7);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC27237a.m82073c(iM46115a, strM92103Y2, z4, 0.0f, (InterfaceC4339a) objM87133R2, c28655q, i14 & 896, 8);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11545k0(obj, obj2, z4, z13, function1, i13, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m82593s(Object obj, Function1 function1) {
        if (obj != null) {
            function1.invoke(obj);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m82594t(Function1 function1, Object obj) {
        function1.invoke(obj);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m82595u(Object obj, Object obj2, boolean z4, boolean z13, Function1 function1, int i13, Composer composer, int i14) {
        m82592r(obj, obj2, z4, z13, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    private static final void m82596v(Function1 function1, Object obj, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(523306961);
        int i15 = 2;
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87157i(function1) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(obj) ? 32 : 16;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 19) != 18)) {
            int i16 = i14;
            EnumC27269n0 enumC27269n0 = EnumC27269n0.TextMedium;
            TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC16277f.f62343k0);
            C39274g c39274g = new C39274g(C38072d.f163053a.m121951d().getAction().getAdd(), null, i15, 0 == true ? 1 : 0);
            boolean zM87157i = c28655q2.m87157i(obj) | ((i16 & 14) == 4);
            Object objM87133R = c28655q2.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C27050m(4, function1, obj);
                c28655q2.m87172p0(objM87133R);
            }
            c28655q = c28655q2;
            AbstractC27265l0.m82217i(null, enumC27269n0, c8688bM21277k, null, c39274g, false, null, null, false, false, null, null, (Function1) objM87133R, c28655q, 48, 0, 4073);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26003i(function1, obj, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m82597w(Function1 function1, Object obj, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(obj);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m82598x(Function1 function1, Object obj, int i13, Composer composer, int i14) {
        m82596v(function1, obj, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:132:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:134:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:136:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:138:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:146:0x0214  */
    /* JADX WARN: Code duplicated, block: B:149:0x021d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:150:0x021f  */
    /* JADX WARN: Code duplicated, block: B:151:0x0221  */
    /* JADX WARN: Code duplicated, block: B:153:0x0225  */
    /* JADX WARN: Code duplicated, block: B:154:0x0227  */
    /* JADX WARN: Code duplicated, block: B:156:0x022b  */
    /* JADX WARN: Code duplicated, block: B:157:0x022e  */
    /* JADX WARN: Code duplicated, block: B:159:0x0232  */
    /* JADX WARN: Code duplicated, block: B:160:0x0235  */
    /* JADX WARN: Code duplicated, block: B:162:0x0239  */
    /* JADX WARN: Code duplicated, block: B:163:0x023b  */
    /* JADX WARN: Code duplicated, block: B:166:0x0241  */
    /* JADX WARN: Code duplicated, block: B:167:0x0243  */
    /* JADX WARN: Code duplicated, block: B:170:0x0249  */
    /* JADX WARN: Code duplicated, block: B:171:0x024b  */
    /* JADX WARN: Code duplicated, block: B:175:0x0254  */
    /* JADX WARN: Code duplicated, block: B:177:0x0258  */
    /* JADX WARN: Code duplicated, block: B:182:0x026a  */
    /* JADX WARN: Code duplicated, block: B:185:0x0274  */
    /* JADX WARN: Code duplicated, block: B:189:0x0283  */
    /* JADX WARN: Code duplicated, block: B:191:0x0286  */
    /* JADX WARN: Code duplicated, block: B:192:0x028e  */
    /* JADX WARN: Code duplicated, block: B:194:0x0294  */
    /* JADX WARN: Code duplicated, block: B:195:0x029c  */
    /* JADX WARN: Code duplicated, block: B:197:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:198:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:201:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:202:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:207:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:210:0x034e  */
    /* JADX WARN: Code duplicated, block: B:211:0x0352  */
    /* JADX WARN: Code duplicated, block: B:216:0x037b  */
    /* JADX WARN: Code duplicated, block: B:219:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:223:0x0454  */
    /* JADX WARN: Code duplicated, block: B:225:0x0476  */
    /* JADX WARN: Code duplicated, block: B:227:0x047c  */
    /* JADX WARN: Code duplicated, block: B:228:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:232:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:234:0x0539  */
    /* JADX WARN: Code duplicated, block: B:235:0x053d  */
    /* JADX WARN: Code duplicated, block: B:240:0x0566  */
    /* JADX WARN: Code duplicated, block: B:243:0x059a  */
    /* JADX WARN: Code duplicated, block: B:244:0x059e  */
    /* JADX WARN: Code duplicated, block: B:249:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:252:0x0646  */
    /* JADX WARN: Code duplicated, block: B:253:0x064a  */
    /* JADX WARN: Code duplicated, block: B:258:0x0673  */
    /* JADX WARN: Code duplicated, block: B:261:0x06f0  */
    /* JADX WARN: Code duplicated, block: B:262:0x0702  */
    /* JADX WARN: Code duplicated, block: B:265:0x0741  */
    /* JADX WARN: Code duplicated, block: B:267:0x0770  */
    /* JADX WARN: Code duplicated, block: B:268:0x0774  */
    /* JADX WARN: Code duplicated, block: B:273:0x079d  */
    /* JADX WARN: Code duplicated, block: B:276:0x07ad  */
    /* JADX WARN: Code duplicated, block: B:277:0x07bc  */
    /* JADX WARN: Code duplicated, block: B:279:0x0809  */
    /* JADX WARN: Code duplicated, block: B:280:0x0815  */
    /* JADX WARN: Code duplicated, block: B:283:0x0887  */
    /* JADX WARN: Code duplicated, block: B:285:0x088d  */
    /* JADX WARN: Code duplicated, block: B:287:0x08bf  */
    /* JADX WARN: Code duplicated, block: B:288:0x08c3  */
    /* JADX WARN: Code duplicated, block: B:293:0x08ec  */
    /* JADX WARN: Code duplicated, block: B:295:0x097d  */
    /* JADX WARN: Code duplicated, block: B:298:0x0991  */
    /* JADX WARN: Code duplicated, block: B:299:0x099b  */
    /* JADX WARN: Code duplicated, block: B:303:0x0a4b  */
    /* JADX WARN: Code duplicated, block: B:304:0x0a4f  */
    /* JADX WARN: Code duplicated, block: B:309:0x0a78  */
    /* JADX WARN: Code duplicated, block: B:312:0x0abd  */
    /* JADX WARN: Code duplicated, block: B:313:0x0ac1  */
    /* JADX WARN: Code duplicated, block: B:318:0x0adc  */
    /* JADX WARN: Code duplicated, block: B:321:0x0b58  */
    /* JADX WARN: Code duplicated, block: B:323:0x0b93  */
    /* JADX WARN: Code duplicated, block: B:324:0x0b97  */
    /* JADX WARN: Code duplicated, block: B:329:0x0bb2  */
    /* JADX WARN: Code duplicated, block: B:332:0x0bbe  */
    /* JADX WARN: Code duplicated, block: B:334:0x0bcb  */
    /* JADX WARN: Code duplicated, block: B:337:0x0c3b  */
    /* JADX WARN: Code duplicated, block: B:338:0x0c3f  */
    /* JADX WARN: Code duplicated, block: B:343:0x0c68  */
    /* JADX WARN: Code duplicated, block: B:346:0x0d30  */
    /* JADX WARN: Code duplicated, block: B:347:0x0d34  */
    /* JADX WARN: Code duplicated, block: B:352:0x0d4f  */
    /* JADX WARN: Code duplicated, block: B:355:0x0d5b  */
    /* JADX WARN: Code duplicated, block: B:356:0x0d67  */
    /* JADX WARN: Code duplicated, block: B:358:0x0db5  */
    /* JADX WARN: Code duplicated, block: B:359:0x0dc2  */
    /* JADX WARN: Code duplicated, block: B:361:0x0dea  */
    /* JADX WARN: Code duplicated, block: B:362:0x0dee  */
    /* JADX WARN: Code duplicated, block: B:367:0x0e17  */
    /* JADX WARN: Code duplicated, block: B:370:0x0e68  */
    /* JADX WARN: Code duplicated, block: B:371:0x0e72  */
    /* JADX WARN: Code duplicated, block: B:374:0x0ee5  */
    /* JADX WARN: Code duplicated, block: B:376:0x0f23  */
    /* JADX WARN: Code duplicated, block: B:377:0x0f27  */
    /* JADX WARN: Code duplicated, block: B:382:0x0f50  */
    /* JADX WARN: Code duplicated, block: B:385:0x0fe6  */
    /* JADX WARN: Code duplicated, block: B:386:0x0ff9  */
    /* JADX WARN: Code duplicated, block: B:389:0x101a  */
    /* JADX WARN: Code duplicated, block: B:392:0x1036  */
    /* JADX WARN: Code duplicated, block: B:394:0x09f5 A[EDGE_INSN: B:394:0x09f5->B:301:0x09f5 BREAK  A[LOOP:0: B:230:0x04f5->B:300:0x09db], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:397:0x0281 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:398:0x0283 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:399:? A[LOOP:1: B:183:0x026e->B:399:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:400:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: y */
    public static final void m82599y(final TextResource repsTitleDisplay, final TextResource weightTitleDisplay, final TextResource avgHrTitleDisplay, final TextResource tonnageUnitsDisplay, final TextResource hrUnitsDisplay, TextResource tonnageDisplay, final TextResource repsDisplay, final TextResource totalsDisplay, final List<C27411q> statRows, boolean z4, boolean z13, TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, TextResource textResource5, Composer composer, final int i13, final int i14, final int i15) {
        int i16;
        int i17;
        int i18;
        int i19;
        int i24;
        int i25;
        boolean z14;
        TextResource textResource6;
        final boolean z15;
        final boolean z16;
        final TextResource textResource7;
        final TextResource textResource8;
        final TextResource textResource9;
        final TextResource textResource10;
        C28655q c28655q;
        final TextResource textResource11;
        C28677v1 c28677v1M87180u;
        boolean z17;
        boolean z18;
        TextResource textResource12;
        TextResource textResource13;
        TextResource textResource14;
        boolean z19;
        TextResource textResource15;
        TextResource textResource16;
        boolean z24;
        boolean z25;
        float f13;
        float f14;
        Float fValueOf;
        TextResource textResource17;
        int iHashCode;
        TextResource textResource18;
        C2314t c2314t;
        C0213j c0213jM545a;
        C0209i c0209iM8291d;
        float f15;
        float f16;
        float f17;
        int iHashCode2;
        C0213j c0213jM545a2;
        C0209i c0209iM546b;
        C23000t1 c23000t1;
        C38072d c38072d;
        C28655q c28655q2;
        TextResource textResource19;
        Iterator it;
        Iterator it3;
        TextResource textResource20;
        Float f18;
        C28655q c28655q3;
        C22949e c22949e;
        int iHashCode3;
        C0213j c0213jM545a3;
        C0209i c0209iM546b2;
        C39111m c39111m;
        float f19;
        int iHashCode4;
        C0213j c0213jM545a4;
        C0209i c0209iM8291d2;
        C38072d c38072d2;
        C28655q c28655q4;
        TextResource textResource21;
        TextResource textResource22;
        int iHashCode5;
        C0213j c0213jM545a5;
        C0209i c0209iM546b3;
        C28655q c28655q5;
        int iHashCode6;
        C0213j c0213jM545a6;
        C0209i c0209iM8291d3;
        TextResource textResource23;
        int iHashCode7;
        C0213j c0213jM545a7;
        C0209i c0209iM546b4;
        float f24;
        int iHashCode8;
        C0213j c0213jM545a8;
        C0209i c0209iM8291d4;
        int iHashCode9;
        C0213j c0213jM545a9;
        C0209i c0209iM546b5;
        C27411q c27411q;
        int iHashCode10;
        Float f25;
        C0213j c0213jM545a10;
        C0209i c0209iM546b6;
        C22949e c22949e2;
        int iHashCode11;
        C0213j c0213jM545a11;
        C0209i c0209iM546b7;
        C38072d c38072d3;
        C28655q c28655q6;
        int iHashCode12;
        C0213j c0213jM545a12;
        C0209i c0209iM546b8;
        float f26;
        long jM125430y;
        TextResource textResource24;
        Float f27;
        int iHashCode13;
        C0213j c0213jM545a13;
        C0209i c0209iM546b9;
        Integer numM82769a;
        int iHashCode14;
        C0213j c0213jM545a14;
        C0209i c0209iM546b10;
        TextResource textResourceM82771c;
        List<C27411q> list;
        Iterator<T> it4;
        C2305k c2305k = C2299e.f9110M;
        C2306l c2306l = C2299e.f9107J;
        AbstractC22676k.m65750j(repsTitleDisplay, "repsTitleDisplay");
        AbstractC22676k.m65750j(weightTitleDisplay, "weightTitleDisplay");
        AbstractC22676k.m65750j(avgHrTitleDisplay, "avgHrTitleDisplay");
        AbstractC22676k.m65750j(tonnageUnitsDisplay, "tonnageUnitsDisplay");
        AbstractC22676k.m65750j(hrUnitsDisplay, "hrUnitsDisplay");
        AbstractC22676k.m65750j(tonnageDisplay, "tonnageDisplay");
        AbstractC22676k.m65750j(repsDisplay, "repsDisplay");
        AbstractC22676k.m65750j(totalsDisplay, "totalsDisplay");
        AbstractC22676k.m65750j(statRows, "statRows");
        C28655q c28655q7 = (C28655q) composer;
        c28655q7.m87154g0(-330862934);
        if ((i13 & 6) == 0) {
            i16 = i13 | (c28655q7.m87153g(repsTitleDisplay) ? 4 : 2);
        } else {
            i16 = i13;
        }
        if ((i13 & 48) == 0) {
            i16 |= c28655q7.m87153g(weightTitleDisplay) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i16 |= c28655q7.m87153g(avgHrTitleDisplay) ? 256 : 128;
        }
        int i26 = i13 & 3072;
        int i27 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i26 == 0) {
            i16 |= c28655q7.m87153g(tonnageUnitsDisplay) ? 2048 : 1024;
        }
        int i28 = i13 & 24576;
        int i29 = DfuBaseService.ERROR_REMOTE_MASK;
        if (i28 == 0) {
            i16 |= c28655q7.m87153g(hrUnitsDisplay) ? 16384 : 8192;
        }
        int i34 = i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21;
        int i35 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        if (i34 == 0) {
            i16 |= c28655q7.m87153g(tonnageDisplay) ? 131072 : 65536;
        }
        if ((i13 & 1572864) == 0) {
            i16 |= c28655q7.m87153g(repsDisplay) ? 1048576 : 524288;
        }
        if ((i13 & 12582912) == 0) {
            i16 |= c28655q7.m87153g(totalsDisplay) ? 8388608 : 4194304;
        }
        if ((i13 & 100663296) == 0) {
            i16 |= c28655q7.m87157i(statRows) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        int i36 = i15 & 512;
        if (i36 != 0) {
            i16 |= 805306368;
        } else if ((i13 & 805306368) == 0) {
            i16 |= c28655q7.m87155h(z4) ? 536870912 : 268435456;
        }
        int i37 = i16;
        int i38 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i38 != 0) {
            i17 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i17 = i14 | (c28655q7.m87155h(z13) ? 4 : 2);
        } else {
            i17 = i14;
        }
        int i39 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
        if (i39 != 0) {
            i17 |= 48;
        } else if ((i14 & 48) == 0) {
            i17 |= c28655q7.m87153g(textResource) ? 32 : 16;
        }
        int i44 = i17;
        int i45 = i15 & 4096;
        if (i45 != 0) {
            i18 = i44 | 384;
        } else if ((i14 & 384) == 0) {
            i18 = i44 | (c28655q7.m87153g(textResource2) ? 256 : 128);
        } else {
            i18 = i44;
        }
        int i46 = i15 & DfuBaseService.ERROR_REMOTE_MASK;
        if (i46 != 0) {
            i19 = i18 | 3072;
        } else {
            int i47 = i18;
            if ((i14 & 3072) == 0) {
                if (c28655q7.m87153g(textResource3)) {
                    i27 = 2048;
                }
                i47 |= i27;
            }
            i19 = i47;
        }
        int i48 = i15 & DfuBaseService.ERROR_CONNECTION_MASK;
        if (i48 == 0) {
            i24 = i19;
            if ((i14 & 24576) == 0) {
                if (c28655q7.m87153g(textResource4)) {
                    i29 = 16384;
                }
                i24 |= i29;
            }
            i25 = i15 & 32768;
            if (i25 != 0) {
                i24 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q7.m87153g(textResource5)) {
                    i35 = 131072;
                }
                i24 |= i35;
            }
            int i49 = i24;
            if ((i37 & 306783379) == 306783378 || (i49 & 74899) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q7.m87135U(i37 & 1, z14)) {
                if (i36 != 0) {
                    z17 = false;
                } else {
                    z17 = z4;
                }
                if (i38 != 0) {
                    z18 = false;
                } else {
                    z18 = z13;
                }
                if (i39 != 0) {
                    textResource12 = null;
                } else {
                    textResource12 = textResource;
                }
                if (i45 != 0) {
                    textResource13 = null;
                } else {
                    textResource13 = textResource2;
                }
                if (i46 != 0) {
                    textResource14 = null;
                } else {
                    textResource14 = textResource3;
                }
                z19 = z17;
                if (i48 != 0) {
                    textResource15 = null;
                } else {
                    textResource15 = textResource4;
                }
                boolean z26 = z18;
                if (i25 != 0) {
                    textResource16 = null;
                } else {
                    textResource16 = textResource5;
                }
                if (z19 || !z26) {
                    z24 = false;
                } else {
                    z24 = true;
                }
                if (textResource14 == null) {
                    list = statRows;
                    if ((list instanceof Collection) || !list.isEmpty()) {
                        it4 = list.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                if (((C27411q) it4.next()).getIntensityDisplay() != null) {
                                    z25 = true;
                                }
                            }
                        }
                    }
                    z25 = false;
                } else {
                    z25 = true;
                }
                if (z24) {
                    f13 = 0.21f;
                } else {
                    f13 = 1.0f;
                }
                if (z24) {
                    f14 = 0.35f;
                } else {
                    f14 = 1.0f;
                }
                if (z24) {
                    fValueOf = Float.valueOf(1.5f);
                } else {
                    fValueOf = null;
                }
                textResource17 = textResource16;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q7, 0);
                iHashCode = Long.hashCode(AbstractC28683x.m87267u(c28655q7));
                InterfaceC28653p1 interfaceC28653p1M87116A = c28655q7.m87116A();
                textResource18 = textResource15;
                c2314t = C2314t.f9131w;
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q7, c2314t);
                InterfaceC0221l.f734a.getClass();
                c0213jM545a = C0217k.m545a();
                c28655q7.m87158i0();
                if (c28655q7.m87120E()) {
                    c28655q7.m87163l(c0213jM545a);
                } else {
                    c28655q7.m87178s0();
                }
                c0209iM8291d = AbstractC2875y.m8291d(c28655q7, c23010xM66775a, c28655q7, interfaceC28653p1M87116A);
                if (c28655q7.m87120E() || !AbstractC22676k.m65745e(c28655q7.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q7, iHashCode, c0209iM8291d);
                }
                AbstractC28683x.m87239G(c28655q7, C0217k.m548d(), modifierM118962N);
                float f28 = 4;
                f15 = f28 * f28;
                AbstractC22953f.m66715b(c28655q7, AbstractC1102d.m3411h(f15, c2314t));
                f16 = 8;
                f17 = ((float) 2.5d) * f16;
                Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f17, 0.0f, 2);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q7, 0);
                iHashCode2 = Long.hashCode(AbstractC28683x.m87267u(c28655q7));
                InterfaceC28653p1 interfaceC28653p1M87116A2 = c28655q7.m87116A();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q7, modifierM3396r);
                c0213jM545a2 = C0217k.m545a();
                c28655q7.m87158i0();
                if (c28655q7.m87120E()) {
                    c28655q7.m87163l(c0213jM545a2);
                } else {
                    c28655q7.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q7, C0217k.m547c(), c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q7, C0217k.m549e(), interfaceC28653p1M87116A2);
                c0209iM546b = C0217k.m546b();
                if (c28655q7.m87120E() || !AbstractC22676k.m65745e(c28655q7.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q7, iHashCode2, c0209iM546b);
                }
                AbstractC28683x.m87239G(c28655q7, C0217k.m548d(), modifierM118962N2);
                c23000t1 = C23000t1.f90727a;
                Modifier modifierMo66772c = c23000t1.mo66772c(c2314t, true, f13);
                String strM21274h = AbstractC8693b.m21274h(repsTitleDisplay, c28655q7, i37 & 14);
                c38072d = C38072d.f163053a;
                AbstractC30795n.m94707h(strM21274h, modifierMo66772c, c38072d.m121949b(c28655q7, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q7, 6).getH6(), fValueOf, c28655q7, 0, 0, 65528);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(weightTitleDisplay, c28655q7, (i37 >> 3) & 14), c23000t1.mo66772c(c2314t, true, f14), c38072d.m121949b(c28655q7, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q7, 6).getH6(), fValueOf, c28655q7, 0, 0, 65528);
                c28655q2 = c28655q7;
                if (z24) {
                    c28655q2.m87150e0(1085252278);
                    textResource19 = textResource12;
                    if (textResource19 == null && z25) {
                        c28655q2.m87150e0(1085336319);
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource19, c28655q2, (i49 >> 3) & 14), c23000t1.mo66772c(c2314t, true, 0.44f), c38072d.m121949b(c28655q2, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, c38072d.m121952e(c28655q2, 6).getH6(), fValueOf, c28655q2, 0, 3456, 53240);
                        c28655q2 = c28655q2;
                        c28655q2.m87179t();
                    } else {
                        c28655q2.m87150e0(1085812355);
                        AbstractC22953f.m66715b(c28655q2, c23000t1.mo66772c(c2314t, true, 0.44f));
                        c28655q2.m87179t();
                    }
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f110163a, c2314t));
                    c28655q2.m87179t();
                } else {
                    fValueOf = fValueOf;
                    textResource19 = textResource12;
                    if (z19) {
                        c28655q2.m87150e0(1086332690);
                        c28655q2.m87179t();
                    } else {
                        c28655q2.m87150e0(1086069903);
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(avgHrTitleDisplay, c28655q2, (i37 >> 6) & 14), c23000t1.mo66772c(c2314t, true, 1.0f), c38072d.m121949b(c28655q2, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getH6(), null, c28655q2, 0, 0, 196600);
                        c28655q2 = c28655q2;
                        c28655q2.m87179t();
                    }
                }
                c28655q2.m87177s();
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(2 * f28, c2314t));
                c28655q2.m87150e0(-2054958321);
                it = statRows.iterator();
                while (true) {
                    it3 = it;
                    if (it.hasNext()) {
                        break;
                    }
                    c27411q = (C27411q) it3.next();
                    Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f17, 0.0f, 2);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode10 = Long.hashCode(AbstractC28683x.m87267u(c28655q2));
                    InterfaceC28653p1 interfaceC28653p1M87116A3 = c28655q2.m87116A();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3396r2);
                    InterfaceC0221l.f734a.getClass();
                    f25 = fValueOf;
                    c0213jM545a10 = C0217k.m545a();
                    c28655q2.m87158i0();
                    if (c28655q2.m87120E()) {
                        c28655q2.m87163l(c0213jM545a10);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.m547c(), interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q2, C0217k.m549e(), interfaceC28653p1M87116A3);
                    c0209iM546b6 = C0217k.m546b();
                    if (c28655q2.m87120E() || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode10))) {
                        AbstractC11266d.m30471y(iHashCode10, c28655q2, iHashCode10, c0209iM546b6);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.m548d(), modifierM118962N3);
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                    c22949e2 = AbstractC22977m.f90650a;
                    C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22949e2, c2306l, c28655q2, 0);
                    iHashCode11 = Long.hashCode(AbstractC28683x.m87267u(c28655q2));
                    InterfaceC28653p1 interfaceC28653p1M87116A4 = c28655q2.m87116A();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
                    TextResource textResource25 = textResource19;
                    c0213jM545a11 = C0217k.m545a();
                    c28655q2.m87158i0();
                    if (c28655q2.m87120E()) {
                        c28655q2.m87163l(c0213jM545a11);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.m547c(), c22994r1M66759a2);
                    AbstractC28683x.m87239G(c28655q2, C0217k.m549e(), interfaceC28653p1M87116A4);
                    c0209iM546b7 = C0217k.m546b();
                    if (c28655q2.m87120E() || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode11))) {
                        AbstractC11266d.m30471y(iHashCode11, c28655q2, iHashCode11, c0209iM546b7);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.m548d(), modifierM118962N4);
                    Modifier modifierMo66772c2 = c23000t1.mo66772c(c23000t1.m66773d(), true, f13);
                    String strM21274h2 = AbstractC8693b.m21274h(c27411q.getVolumeDisplay(), c28655q2, 0);
                    c38072d3 = C38072d.f163053a;
                    c28655q6 = c28655q2;
                    AbstractC30795n.m94707h(strM21274h2, modifierMo66772c2, c38072d3.m121949b(c28655q2, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q2, 6).getN6(), f25, c28655q6, 0, 0, 65528);
                    Modifier modifierMo66772c3 = c23000t1.mo66772c(c2314t, true, f14);
                    C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(c22949e2, c2306l, c28655q6, 0);
                    iHashCode12 = Long.hashCode(AbstractC28683x.m87267u(c28655q6));
                    InterfaceC28653p1 interfaceC28653p1M87116A5 = c28655q6.m87116A();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q6, modifierMo66772c3);
                    c0213jM545a12 = C0217k.m545a();
                    c28655q6.m87158i0();
                    if (c28655q6.m87120E()) {
                        c28655q6.m87163l(c0213jM545a12);
                    } else {
                        c28655q6.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q6, C0217k.m547c(), c22994r1M66759a3);
                    AbstractC28683x.m87239G(c28655q6, C0217k.m549e(), interfaceC28653p1M87116A5);
                    c0209iM546b8 = C0217k.m546b();
                    if (c28655q6.m87120E() || !AbstractC22676k.m65745e(c28655q6.m87133R(), Integer.valueOf(iHashCode12))) {
                        AbstractC11266d.m30471y(iHashCode12, c28655q6, iHashCode12, c0209iM546b8);
                    }
                    AbstractC28683x.m87239G(c28655q6, C0217k.m548d(), modifierM118962N5);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(c27411q.getWeightDisplay(), c28655q6, 0), c23000t1.m66773d(), c38072d3.m121949b(c28655q6, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q6, 6).getN6(), f25, c28655q6, 0, 0, 65528);
                    f26 = ((float) 0.5d) * f16;
                    Modifier modifierM3398t = AbstractC1099a.m3398t(c23000t1.m66773d(), f26, 0.0f, 0.0f, 0.0f, 14);
                    String strM21274h3 = AbstractC8693b.m21274h(tonnageUnitsDisplay, c28655q6, (i37 >> 9) & 14);
                    C2886a c2886aM8420a = c38072d3.m121952e(c28655q6, 6).getB1();
                    if (z24) {
                        c28655q6.m87150e0(-1693080430);
                        jM125430y = c38072d3.m121949b(c28655q6, 6).getWhite50();
                        c28655q6.m87179t();
                    } else {
                        c28655q6.m87150e0(-1692986097);
                        jM125430y = c38072d3.m121949b(c28655q6, 6).getBrandWhite();
                        c28655q6.m87179t();
                    }
                    AbstractC30795n.m94707h(strM21274h3, modifierM3398t, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, f25, c28655q6, 0, 0, 65528);
                    c28655q2 = c28655q6;
                    c28655q2.m87177s();
                    if (z24) {
                        c28655q2.m87150e0(277839725);
                        Modifier modifierMo66772c4 = c23000t1.mo66772c(c2314t, true, 0.44f);
                        C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(c22949e2, c2306l, c28655q2, 0);
                        iHashCode14 = Long.hashCode(AbstractC28683x.m87267u(c28655q2));
                        InterfaceC28653p1 interfaceC28653p1M87116A6 = c28655q2.m87116A();
                        Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierMo66772c4);
                        c0213jM545a14 = C0217k.m545a();
                        c28655q2.m87158i0();
                        if (c28655q2.m87120E()) {
                            c28655q2.m87163l(c0213jM545a14);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.m547c(), c22994r1M66759a4);
                        AbstractC28683x.m87239G(c28655q2, C0217k.m549e(), interfaceC28653p1M87116A6);
                        c0209iM546b10 = C0217k.m546b();
                        if (c28655q2.m87120E() || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode14))) {
                            AbstractC11266d.m30471y(iHashCode14, c28655q2, iHashCode14, c0209iM546b10);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.m548d(), modifierM118962N6);
                        textResourceM82771c = c27411q.getIntensityDisplay();
                        if (textResourceM82771c == null) {
                            c28655q2.m87150e0(1347853743);
                            c28655q2.m87179t();
                            f25 = f25;
                            textResource24 = textResource13;
                        } else {
                            c28655q2.m87150e0(1347853744);
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM82771c, c28655q2, 0), c23000t1.m66773d(), c38072d3.m121949b(c28655q2, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, c38072d3.m121952e(c28655q2, 6).getN6(), f25, c28655q2, 0, 3456, 53240);
                            textResource24 = textResource13;
                            if (textResource24 == null) {
                                c28655q2 = c28655q2;
                                c28655q2.m87150e0(1408051930);
                                c28655q2.m87179t();
                            } else {
                                c28655q2 = c28655q2;
                                c28655q2.m87150e0(1408051931);
                                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource24, c28655q2, 0), AbstractC1099a.m3398t(c23000t1.m66773d(), f26, 0.0f, 0.0f, 0.0f, 14), c38072d3.m121949b(c28655q2, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, c38072d3.m121952e(c28655q2, 6).getB1(), f25, c28655q2, 0, 3456, 53240);
                                c28655q2 = c28655q2;
                                c28655q2.m87179t();
                            }
                            c28655q2.m87179t();
                        }
                        c28655q2.m87177s();
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f110163a, c2314t));
                        c28655q2.m87179t();
                        f27 = f25;
                    } else {
                        textResource24 = textResource13;
                        if (z19) {
                            f27 = f25;
                            c28655q2.m87150e0(280446887);
                            c28655q2.m87179t();
                        } else {
                            c28655q2.m87150e0(279550274);
                            Modifier modifierMo66772c5 = c23000t1.mo66772c(c2314t, true, 1.0f);
                            C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(c22949e2, c2306l, c28655q2, 0);
                            iHashCode13 = Long.hashCode(AbstractC28683x.m87267u(c28655q2));
                            InterfaceC28653p1 interfaceC28653p1M87116A7 = c28655q2.m87116A();
                            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, modifierMo66772c5);
                            f27 = f25;
                            c0213jM545a13 = C0217k.m545a();
                            c28655q2.m87158i0();
                            if (c28655q2.m87120E()) {
                                c28655q2.m87163l(c0213jM545a13);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.m547c(), c22994r1M66759a5);
                            AbstractC28683x.m87239G(c28655q2, C0217k.m549e(), interfaceC28653p1M87116A7);
                            c0209iM546b9 = C0217k.m546b();
                            if (c28655q2.m87120E() || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode13))) {
                                AbstractC11266d.m30471y(iHashCode13, c28655q2, iHashCode13, c0209iM546b9);
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.m548d(), modifierM118962N7);
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c27411q.getAvgHrDisplay(), c28655q2, 0), c23000t1.m66773d(), c38072d3.m121949b(c28655q2, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q2, 6).getN6(), null, c28655q2, 0, 0, 196600);
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(hrUnitsDisplay, c28655q2, (i37 >> 12) & 14), AbstractC1099a.m3398t(c23000t1.m66773d(), f26, 0.0f, 0.0f, 0.0f, 14), c38072d3.m121949b(c28655q2, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q2, 6).getB1(), null, c28655q2, 0, 0, 196600);
                            c28655q2 = c28655q2;
                            c28655q2.m87177s();
                            c28655q2.m87179t();
                        }
                    }
                    c28655q2.m87177s();
                    numM82769a = c27411q.getAchievementIconRes();
                    if (numM82769a == null) {
                        c28655q2.m87150e0(996660525);
                        c28655q2.m87179t();
                    } else {
                        c28655q2.m87150e0(996660526);
                        int iIntValue = numM82769a.intValue();
                        Modifier modifierM3419p = AbstractC1102d.m3419p(f110163a, C1100b.f4583a.mo3400a(c2314t, C2299e.f9103F));
                        AbstractC26165a abstractC26165aM88500I = AbstractC29125c.m88500I(iIntValue, c28655q2, 0);
                        String strM92103Y = AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62398y);
                        int i54 = C17919x.f69638o;
                        AbstractC15005f3.m43107a(abstractC26165aM88500I, strM92103Y, modifierM3419p, AbstractC17918w0.m51533u(), c28655q2, 3072, 0);
                        c28655q2.m87179t();
                    }
                    c28655q2.m87177s();
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f15, c2314t));
                    fValueOf = f27;
                    textResource19 = textResource25;
                    it = it3;
                    textResource13 = textResource24;
                }
                TextResource textResource26 = textResource19;
                textResource20 = textResource13;
                f18 = fValueOf;
                c28655q2.m87179t();
                c28655q3 = c28655q2;
                AbstractC17755i2.m50938j(null, EnumC17744g.DOTTED, null, null, null, 0L, 0L, null, c28655q3, 48, 253);
                Modifier modifierM3394p = AbstractC1099a.m3394p(f17, AbstractC1102d.m3409f(1.0f, c2314t));
                c22949e = AbstractC22977m.f90650a;
                C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q3, 0);
                iHashCode3 = Long.hashCode(AbstractC28683x.m87267u(c28655q3));
                InterfaceC28653p1 interfaceC28653p1M87116A8 = c28655q3.m87116A();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q3, modifierM3394p);
                InterfaceC0221l.f734a.getClass();
                c0213jM545a3 = C0217k.m545a();
                c28655q3.m87158i0();
                if (c28655q3.m87120E()) {
                    c28655q3.m87163l(c0213jM545a3);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.m547c(), c22994r1M66759a6);
                AbstractC28683x.m87239G(c28655q3, C0217k.m549e(), interfaceC28653p1M87116A8);
                c0209iM546b2 = C0217k.m546b();
                if (c28655q3.m87120E() || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209iM546b2);
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.m548d(), modifierM118962N8);
                Modifier modifierMo66772c6 = c23000t1.mo66772c(c2314t, true, f13);
                c39111m = AbstractC39083d.f168141b;
                Modifier modifierMo3471e = modifierMo66772c6.mo3471e(new WithAlignmentLineElement(c39111m));
                f19 = 1 * f16;
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f19), c2305k, c28655q3, 6);
                iHashCode4 = Long.hashCode(AbstractC28683x.m87267u(c28655q3));
                InterfaceC28653p1 interfaceC28653p1M87116A9 = c28655q3.m87116A();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q3, modifierMo3471e);
                c0213jM545a4 = C0217k.m545a();
                c28655q3.m87158i0();
                if (c28655q3.m87120E()) {
                    c28655q3.m87163l(c0213jM545a4);
                } else {
                    c28655q3.m87178s0();
                }
                c0209iM8291d2 = AbstractC2875y.m8291d(c28655q3, c23010xM66775a2, c28655q3, interfaceC28653p1M87116A9);
                if (c28655q3.m87120E() || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode4))) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q3, iHashCode4, c0209iM8291d2);
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.m548d(), modifierM118962N9);
                String strM21274h4 = AbstractC8693b.m21274h(totalsDisplay, c28655q3, (i37 >> 21) & 14);
                c38072d2 = C38072d.f163053a;
                AbstractC30795n.m94707h(strM21274h4, null, c38072d2.m121949b(c28655q3, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q3, 6).getH6(), f18, c28655q3, 0, 0, 65530);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(repsDisplay, c28655q3, (i37 >> 18) & 14), null, c38072d2.m121949b(c28655q3, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q3, 6).getN6(), f18, c28655q3, 0, 0, 65530);
                c28655q4 = c28655q3;
                c28655q4.m87177s();
                if (z24) {
                    c28655q4.m87150e0(1269982439);
                    Modifier modifierMo3471e2 = c23000t1.mo66772c(c2314t, true, f14).mo3471e(new WithAlignmentLineElement(c39111m));
                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f19), c2305k, c28655q4, 6);
                    iHashCode6 = Long.hashCode(AbstractC28683x.m87267u(c28655q4));
                    InterfaceC28653p1 interfaceC28653p1M87116A10 = c28655q4.m87116A();
                    Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q4, modifierMo3471e2);
                    c0213jM545a6 = C0217k.m545a();
                    c28655q4.m87158i0();
                    if (c28655q4.m87120E()) {
                        c28655q4.m87163l(c0213jM545a6);
                    } else {
                        c28655q4.m87178s0();
                    }
                    c0209iM8291d3 = AbstractC2875y.m8291d(c28655q4, c23010xM66775a3, c28655q4, interfaceC28653p1M87116A10);
                    if (c28655q4.m87120E() || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode6))) {
                        AbstractC11266d.m30471y(iHashCode6, c28655q4, iHashCode6, c0209iM8291d3);
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.m548d(), modifierM118962N10);
                    if (textResource18 == null) {
                        c28655q4.m87150e0(949156654);
                        c28655q4.m87179t();
                        textResource23 = textResource18;
                    } else {
                        c28655q4.m87150e0(949156655);
                        textResource23 = textResource18;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource23, c28655q4, 0), null, c38072d2.m121949b(c28655q4, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q4, 6).getH6(), f18, c28655q4, 0, 0, 65530);
                        c28655q4 = c28655q4;
                        c28655q4.m87179t();
                    }
                    C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q4, 0);
                    iHashCode7 = Long.hashCode(AbstractC28683x.m87267u(c28655q4));
                    InterfaceC28653p1 interfaceC28653p1M87116A11 = c28655q4.m87116A();
                    Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q4, c2314t);
                    textResource18 = textResource23;
                    c0213jM545a7 = C0217k.m545a();
                    c28655q4.m87158i0();
                    if (c28655q4.m87120E()) {
                        c28655q4.m87163l(c0213jM545a7);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.m547c(), c22994r1M66759a7);
                    AbstractC28683x.m87239G(c28655q4, C0217k.m549e(), interfaceC28653p1M87116A11);
                    c0209iM546b4 = C0217k.m546b();
                    if (c28655q4.m87120E() || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode7))) {
                        AbstractC11266d.m30471y(iHashCode7, c28655q4, iHashCode7, c0209iM546b4);
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.m548d(), modifierM118962N11);
                    C28655q c28655q8 = c28655q4;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(tonnageDisplay, c28655q4, (i37 >> 15) & 14), c23000t1.m66773d(), c38072d2.m121949b(c28655q4, 6).getStrain(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q4, 6).getN7(), f18, c28655q8, 0, 0, 65528);
                    f24 = ((float) 0.5d) * f16;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(tonnageUnitsDisplay, c28655q8, (i37 >> 9) & 14), AbstractC1099a.m3398t(c23000t1.m66773d(), f24, 0.0f, 0.0f, 0.0f, 14), c38072d2.m121949b(c28655q8, 6).getStrain(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q8, 6).getB1(), f18, c28655q8, 0, 0, 65528);
                    c28655q5 = c28655q8;
                    c28655q5.m87177s();
                    c28655q5.m87177s();
                    Modifier modifierMo3471e3 = c23000t1.mo66772c(c2314t, true, 0.44f).mo3471e(new WithAlignmentLineElement(c39111m));
                    C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f19), c2305k, c28655q5, 6);
                    iHashCode8 = Long.hashCode(AbstractC28683x.m87267u(c28655q5));
                    InterfaceC28653p1 interfaceC28653p1M87116A12 = c28655q5.m87116A();
                    Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q5, modifierMo3471e3);
                    c0213jM545a8 = C0217k.m545a();
                    c28655q5.m87158i0();
                    if (c28655q5.m87120E()) {
                        c28655q5.m87163l(c0213jM545a8);
                    } else {
                        c28655q5.m87178s0();
                    }
                    c0209iM8291d4 = AbstractC2875y.m8291d(c28655q5, c23010xM66775a4, c28655q5, interfaceC28653p1M87116A12);
                    if (c28655q5.m87120E() || !AbstractC22676k.m65745e(c28655q5.m87133R(), Integer.valueOf(iHashCode8))) {
                        AbstractC11266d.m30471y(iHashCode8, c28655q5, iHashCode8, c0209iM8291d4);
                    }
                    AbstractC28683x.m87239G(c28655q5, C0217k.m548d(), modifierM118962N12);
                    if (textResource17 == null) {
                        c28655q5.m87150e0(1222615365);
                        c28655q5.m87179t();
                        textResource22 = textResource17;
                    } else {
                        c28655q5.m87150e0(1222615366);
                        textResource22 = textResource17;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource22, c28655q5, 0), null, c38072d2.m121949b(c28655q5, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q5, 6).getH6(), f18, c28655q5, 0, 0, 65530);
                        c28655q5.m87179t();
                    }
                    if (textResource14 == 0) {
                        c28655q5 = c28655q5;
                        c28655q5.m87150e0(1223046172);
                        c28655q5.m87179t();
                        textResource21 = textResource14;
                    } else {
                        c28655q5 = c28655q5;
                        c28655q5.m87150e0(1223046173);
                        C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q5, 0);
                        iHashCode9 = Long.hashCode(AbstractC28683x.m87267u(c28655q5));
                        InterfaceC28653p1 interfaceC28653p1M87116A13 = c28655q5.m87116A();
                        Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q5, c2314t);
                        c0213jM545a9 = C0217k.m545a();
                        c28655q5.m87158i0();
                        if (c28655q5.m87120E()) {
                            c28655q5.m87163l(c0213jM545a9);
                        } else {
                            c28655q5.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q5, C0217k.m547c(), c22994r1M66759a8);
                        AbstractC28683x.m87239G(c28655q5, C0217k.m549e(), interfaceC28653p1M87116A13);
                        c0209iM546b5 = C0217k.m546b();
                        if (c28655q5.m87120E() || !AbstractC22676k.m65745e(c28655q5.m87133R(), Integer.valueOf(iHashCode9))) {
                            AbstractC11266d.m30471y(iHashCode9, c28655q5, iHashCode9, c0209iM546b5);
                        }
                        AbstractC28683x.m87239G(c28655q5, C0217k.m548d(), modifierM118962N13);
                        textResource21 = textResource14;
                        C28655q c28655q9 = c28655q5;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource21, c28655q5, 0), c23000t1.m66773d(), c38072d2.m121949b(c28655q5, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, c38072d2.m121952e(c28655q5, 6).getN6(), f18, c28655q9, 0, 3456, 53240);
                        c28655q5 = c28655q9;
                        if (textResource20 == null) {
                            c28655q5.m87150e0(-1577196312);
                            c28655q5.m87179t();
                        } else {
                            c28655q5.m87150e0(-1577196311);
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource20, c28655q5, 0), AbstractC1099a.m3398t(c23000t1.m66773d(), f24, 0.0f, 0.0f, 0.0f, 14), c38072d2.m121949b(c28655q5, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, c38072d2.m121952e(c28655q5, 6).getB1(), f18, c28655q5, 0, 3456, 53240);
                            c28655q5 = c28655q5;
                            c28655q5.m87179t();
                        }
                        c28655q5.m87177s();
                        c28655q5.m87179t();
                    }
                    c28655q5.m87177s();
                    AbstractC22953f.m66715b(c28655q5, AbstractC1102d.m3424u(f110163a, c2314t));
                    c28655q5.m87179t();
                    textResource6 = tonnageDisplay;
                } else {
                    textResource21 = textResource14;
                    textResource22 = textResource17;
                    c28655q4.m87150e0(1273744506);
                    Modifier modifierMo3471e4 = c23000t1.mo66772c(c2314t, true, 1.0f).mo3471e(new WithAlignmentLineElement(c39111m));
                    C22994r1 c22994r1M66759a9 = AbstractC22988p1.m66759a(c22949e, C2299e.f9109L, c28655q4, 48);
                    iHashCode5 = Long.hashCode(AbstractC28683x.m87267u(c28655q4));
                    InterfaceC28653p1 interfaceC28653p1M87116A14 = c28655q4.m87116A();
                    Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q4, modifierMo3471e4);
                    c0213jM545a5 = C0217k.m545a();
                    c28655q4.m87158i0();
                    if (c28655q4.m87120E()) {
                        c28655q4.m87163l(c0213jM545a5);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.m547c(), c22994r1M66759a9);
                    AbstractC28683x.m87239G(c28655q4, C0217k.m549e(), interfaceC28653p1M87116A14);
                    c0209iM546b3 = C0217k.m546b();
                    if (c28655q4.m87120E() || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode5))) {
                        AbstractC11266d.m30471y(iHashCode5, c28655q4, iHashCode5, c0209iM546b3);
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.m548d(), modifierM118962N14);
                    textResource6 = tonnageDisplay;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource6, c28655q4, (i37 >> 15) & 14), c23000t1.m66773d(), c38072d2.m121949b(c28655q4, 6).getStrain(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q4, 6).getN7(), null, c28655q4, 0, 0, 196600);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(tonnageUnitsDisplay, c28655q4, (i37 >> 9) & 14), AbstractC1099a.m3398t(c23000t1.m66773d(), ((float) 0.5d) * f16, 0.0f, 0.0f, 0.0f, 14), c38072d2.m121949b(c28655q4, 6).getStrain(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                    c28655q5 = c28655q4;
                    c28655q5.m87177s();
                    if (z19) {
                        c28655q5.m87150e0(1274759849);
                        c28655q5.m87179t();
                    } else {
                        c28655q5.m87150e0(1274684891);
                        AbstractC22953f.m66715b(c28655q5, c23000t1.mo66772c(c2314t, true, 1.0f));
                        c28655q5.m87179t();
                    }
                    c28655q5.m87179t();
                }
                c28655q5.m87177s();
                c28655q5.m87177s();
                textResource10 = textResource22;
                textResource9 = textResource21;
                textResource8 = textResource20;
                c28655q = c28655q5;
                z15 = z19;
                z16 = z26;
                textResource11 = textResource18;
                textResource7 = textResource26;
            } else {
                textResource6 = tonnageDisplay;
                c28655q7.m87138X();
                z15 = z4;
                z16 = z13;
                textResource7 = textResource;
                textResource8 = textResource2;
                textResource9 = textResource3;
                textResource10 = textResource5;
                c28655q = c28655q7;
                textResource11 = textResource4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final TextResource textResource27 = textResource6;
                c28677v1M87180u.m87205f(new InterfaceC4351m() { // from class: o11.f
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue2 = ((Integer) obj2).intValue();
                        return AbstractC27401g.m82600z(repsTitleDisplay, weightTitleDisplay, avgHrTitleDisplay, tonnageUnitsDisplay, hrUnitsDisplay, textResource27, repsDisplay, totalsDisplay, statRows, z15, z16, textResource7, textResource8, textResource9, textResource11, textResource10, i13, i14, i15, (Composer) obj, iIntValue2);
                    }
                });
            }
        }
        i24 = i19 | 24576;
        i25 = i15 & 32768;
        if (i25 != 0) {
            i24 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if (c28655q7.m87153g(textResource5)) {
                i35 = 131072;
            }
            i24 |= i35;
        }
        int i410 = i24;
        if ((i37 & 306783379) == 306783378) {
            z14 = true;
        } else {
            z14 = true;
        }
        if (c28655q7.m87135U(i37 & 1, z14)) {
            if (i36 != 0) {
                z17 = false;
            } else {
                z17 = z4;
            }
            if (i38 != 0) {
                z18 = false;
            } else {
                z18 = z13;
            }
            if (i39 != 0) {
                textResource12 = null;
            } else {
                textResource12 = textResource;
            }
            if (i45 != 0) {
                textResource13 = null;
            } else {
                textResource13 = textResource2;
            }
            if (i46 != 0) {
                textResource14 = null;
            } else {
                textResource14 = textResource3;
            }
            z19 = z17;
            if (i48 != 0) {
                textResource15 = null;
            } else {
                textResource15 = textResource4;
            }
            boolean z27 = z18;
            if (i25 != 0) {
                textResource16 = null;
            } else {
                textResource16 = textResource5;
            }
            if (z19) {
                z24 = false;
            } else {
                z24 = false;
            }
            if (textResource14 == null) {
                list = statRows;
                if (list instanceof Collection) {
                    it4 = list.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            if (((C27411q) it4.next()).getIntensityDisplay() != null) {
                                z25 = true;
                            }
                        }
                    }
                } else {
                    it4 = list.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            if (((C27411q) it4.next()).getIntensityDisplay() != null) {
                                z25 = true;
                            }
                        }
                    }
                }
                z25 = false;
            } else {
                z25 = true;
            }
            if (z24) {
                f13 = 0.21f;
            } else {
                f13 = 1.0f;
            }
            if (z24) {
                f14 = 0.35f;
            } else {
                f14 = 1.0f;
            }
            if (z24) {
                fValueOf = Float.valueOf(1.5f);
            } else {
                fValueOf = null;
            }
            textResource17 = textResource16;
            C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q7, 0);
            iHashCode = Long.hashCode(AbstractC28683x.m87267u(c28655q7));
            InterfaceC28653p1 interfaceC28653p1M87116A15 = c28655q7.m87116A();
            textResource18 = textResource15;
            c2314t = C2314t.f9131w;
            Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q7, c2314t);
            InterfaceC0221l.f734a.getClass();
            c0213jM545a = C0217k.m545a();
            c28655q7.m87158i0();
            if (c28655q7.m87120E()) {
                c28655q7.m87163l(c0213jM545a);
            } else {
                c28655q7.m87178s0();
            }
            c0209iM8291d = AbstractC2875y.m8291d(c28655q7, c23010xM66775a5, c28655q7, interfaceC28653p1M87116A15);
            if (c28655q7.m87120E()) {
                AbstractC11266d.m30471y(iHashCode, c28655q7, iHashCode, c0209iM8291d);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q7, iHashCode, c0209iM8291d);
            }
            AbstractC28683x.m87239G(c28655q7, C0217k.m548d(), modifierM118962N15);
            float f29 = 4;
            f15 = f29 * f29;
            AbstractC22953f.m66715b(c28655q7, AbstractC1102d.m3411h(f15, c2314t));
            f16 = 8;
            f17 = ((float) 2.5d) * f16;
            Modifier modifierM3396r3 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f17, 0.0f, 2);
            C22994r1 c22994r1M66759a10 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q7, 0);
            iHashCode2 = Long.hashCode(AbstractC28683x.m87267u(c28655q7));
            InterfaceC28653p1 interfaceC28653p1M87116A16 = c28655q7.m87116A();
            Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q7, modifierM3396r3);
            c0213jM545a2 = C0217k.m545a();
            c28655q7.m87158i0();
            if (c28655q7.m87120E()) {
                c28655q7.m87163l(c0213jM545a2);
            } else {
                c28655q7.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q7, C0217k.m547c(), c22994r1M66759a10);
            AbstractC28683x.m87239G(c28655q7, C0217k.m549e(), interfaceC28653p1M87116A16);
            c0209iM546b = C0217k.m546b();
            if (c28655q7.m87120E()) {
                AbstractC11266d.m30471y(iHashCode2, c28655q7, iHashCode2, c0209iM546b);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q7, iHashCode2, c0209iM546b);
            }
            AbstractC28683x.m87239G(c28655q7, C0217k.m548d(), modifierM118962N16);
            c23000t1 = C23000t1.f90727a;
            Modifier modifierMo66772c7 = c23000t1.mo66772c(c2314t, true, f13);
            String strM21274h5 = AbstractC8693b.m21274h(repsTitleDisplay, c28655q7, i37 & 14);
            c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(strM21274h5, modifierMo66772c7, c38072d.m121949b(c28655q7, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q7, 6).getH6(), fValueOf, c28655q7, 0, 0, 65528);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(weightTitleDisplay, c28655q7, (i37 >> 3) & 14), c23000t1.mo66772c(c2314t, true, f14), c38072d.m121949b(c28655q7, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q7, 6).getH6(), fValueOf, c28655q7, 0, 0, 65528);
            c28655q2 = c28655q7;
            if (z24) {
                c28655q2.m87150e0(1085252278);
                textResource19 = textResource12;
                if (textResource19 == null) {
                    c28655q2.m87150e0(1085812355);
                    AbstractC22953f.m66715b(c28655q2, c23000t1.mo66772c(c2314t, true, 0.44f));
                    c28655q2.m87179t();
                } else {
                    c28655q2.m87150e0(1085812355);
                    AbstractC22953f.m66715b(c28655q2, c23000t1.mo66772c(c2314t, true, 0.44f));
                    c28655q2.m87179t();
                }
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f110163a, c2314t));
                c28655q2.m87179t();
            } else {
                fValueOf = fValueOf;
                textResource19 = textResource12;
                if (z19) {
                    c28655q2.m87150e0(1086069903);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(avgHrTitleDisplay, c28655q2, (i37 >> 6) & 14), c23000t1.mo66772c(c2314t, true, 1.0f), c38072d.m121949b(c28655q2, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getH6(), null, c28655q2, 0, 0, 196600);
                    c28655q2 = c28655q2;
                    c28655q2.m87179t();
                } else {
                    c28655q2.m87150e0(1086332690);
                    c28655q2.m87179t();
                }
            }
            c28655q2.m87177s();
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(2 * f29, c2314t));
            c28655q2.m87150e0(-2054958321);
            it = statRows.iterator();
            while (true) {
                it3 = it;
                if (it.hasNext()) {
                    break;
                    break;
                }
                c27411q = (C27411q) it3.next();
                Modifier modifierM3396r4 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f17, 0.0f, 2);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode10 = Long.hashCode(AbstractC28683x.m87267u(c28655q2));
                InterfaceC28653p1 interfaceC28653p1M87116A17 = c28655q2.m87116A();
                Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q2, modifierM3396r4);
                InterfaceC0221l.f734a.getClass();
                f25 = fValueOf;
                c0213jM545a10 = C0217k.m545a();
                c28655q2.m87158i0();
                if (c28655q2.m87120E()) {
                    c28655q2.m87163l(c0213jM545a10);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.m547c(), interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q2, C0217k.m549e(), interfaceC28653p1M87116A17);
                c0209iM546b6 = C0217k.m546b();
                if (c28655q2.m87120E()) {
                    AbstractC11266d.m30471y(iHashCode10, c28655q2, iHashCode10, c0209iM546b6);
                } else {
                    AbstractC11266d.m30471y(iHashCode10, c28655q2, iHashCode10, c0209iM546b6);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.m548d(), modifierM118962N17);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                c22949e2 = AbstractC22977m.f90650a;
                C22994r1 c22994r1M66759a11 = AbstractC22988p1.m66759a(c22949e2, c2306l, c28655q2, 0);
                iHashCode11 = Long.hashCode(AbstractC28683x.m87267u(c28655q2));
                InterfaceC28653p1 interfaceC28653p1M87116A18 = c28655q2.m87116A();
                Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q2, modifierM3409f2);
                TextResource textResource28 = textResource19;
                c0213jM545a11 = C0217k.m545a();
                c28655q2.m87158i0();
                if (c28655q2.m87120E()) {
                    c28655q2.m87163l(c0213jM545a11);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.m547c(), c22994r1M66759a11);
                AbstractC28683x.m87239G(c28655q2, C0217k.m549e(), interfaceC28653p1M87116A18);
                c0209iM546b7 = C0217k.m546b();
                if (c28655q2.m87120E()) {
                    AbstractC11266d.m30471y(iHashCode11, c28655q2, iHashCode11, c0209iM546b7);
                } else {
                    AbstractC11266d.m30471y(iHashCode11, c28655q2, iHashCode11, c0209iM546b7);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.m548d(), modifierM118962N18);
                Modifier modifierMo66772c8 = c23000t1.mo66772c(c23000t1.m66773d(), true, f13);
                String strM21274h6 = AbstractC8693b.m21274h(c27411q.getVolumeDisplay(), c28655q2, 0);
                c38072d3 = C38072d.f163053a;
                c28655q6 = c28655q2;
                AbstractC30795n.m94707h(strM21274h6, modifierMo66772c8, c38072d3.m121949b(c28655q2, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q2, 6).getN6(), f25, c28655q6, 0, 0, 65528);
                Modifier modifierMo66772c9 = c23000t1.mo66772c(c2314t, true, f14);
                C22994r1 c22994r1M66759a12 = AbstractC22988p1.m66759a(c22949e2, c2306l, c28655q6, 0);
                iHashCode12 = Long.hashCode(AbstractC28683x.m87267u(c28655q6));
                InterfaceC28653p1 interfaceC28653p1M87116A19 = c28655q6.m87116A();
                Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q6, modifierMo66772c9);
                c0213jM545a12 = C0217k.m545a();
                c28655q6.m87158i0();
                if (c28655q6.m87120E()) {
                    c28655q6.m87163l(c0213jM545a12);
                } else {
                    c28655q6.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q6, C0217k.m547c(), c22994r1M66759a12);
                AbstractC28683x.m87239G(c28655q6, C0217k.m549e(), interfaceC28653p1M87116A19);
                c0209iM546b8 = C0217k.m546b();
                if (c28655q6.m87120E()) {
                    AbstractC11266d.m30471y(iHashCode12, c28655q6, iHashCode12, c0209iM546b8);
                } else {
                    AbstractC11266d.m30471y(iHashCode12, c28655q6, iHashCode12, c0209iM546b8);
                }
                AbstractC28683x.m87239G(c28655q6, C0217k.m548d(), modifierM118962N19);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c27411q.getWeightDisplay(), c28655q6, 0), c23000t1.m66773d(), c38072d3.m121949b(c28655q6, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q6, 6).getN6(), f25, c28655q6, 0, 0, 65528);
                f26 = ((float) 0.5d) * f16;
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(c23000t1.m66773d(), f26, 0.0f, 0.0f, 0.0f, 14);
                String strM21274h7 = AbstractC8693b.m21274h(tonnageUnitsDisplay, c28655q6, (i37 >> 9) & 14);
                C2886a c2886aM8420a2 = c38072d3.m121952e(c28655q6, 6).getB1();
                if (z24) {
                    c28655q6.m87150e0(-1693080430);
                    jM125430y = c38072d3.m121949b(c28655q6, 6).getWhite50();
                    c28655q6.m87179t();
                } else {
                    c28655q6.m87150e0(-1692986097);
                    jM125430y = c38072d3.m121949b(c28655q6, 6).getBrandWhite();
                    c28655q6.m87179t();
                }
                AbstractC30795n.m94707h(strM21274h7, modifierM3398t2, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a2, f25, c28655q6, 0, 0, 65528);
                c28655q2 = c28655q6;
                c28655q2.m87177s();
                if (z24) {
                    c28655q2.m87150e0(277839725);
                    Modifier modifierMo66772c10 = c23000t1.mo66772c(c2314t, true, 0.44f);
                    C22994r1 c22994r1M66759a13 = AbstractC22988p1.m66759a(c22949e2, c2306l, c28655q2, 0);
                    iHashCode14 = Long.hashCode(AbstractC28683x.m87267u(c28655q2));
                    InterfaceC28653p1 interfaceC28653p1M87116A20 = c28655q2.m87116A();
                    Modifier modifierM118962N20 = AbstractC37056f.m118962N(c28655q2, modifierMo66772c10);
                    c0213jM545a14 = C0217k.m545a();
                    c28655q2.m87158i0();
                    if (c28655q2.m87120E()) {
                        c28655q2.m87163l(c0213jM545a14);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.m547c(), c22994r1M66759a13);
                    AbstractC28683x.m87239G(c28655q2, C0217k.m549e(), interfaceC28653p1M87116A20);
                    c0209iM546b10 = C0217k.m546b();
                    if (c28655q2.m87120E()) {
                        AbstractC11266d.m30471y(iHashCode14, c28655q2, iHashCode14, c0209iM546b10);
                    } else {
                        AbstractC11266d.m30471y(iHashCode14, c28655q2, iHashCode14, c0209iM546b10);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.m548d(), modifierM118962N20);
                    textResourceM82771c = c27411q.getIntensityDisplay();
                    if (textResourceM82771c == null) {
                        c28655q2.m87150e0(1347853743);
                        c28655q2.m87179t();
                        f25 = f25;
                        textResource24 = textResource13;
                    } else {
                        c28655q2.m87150e0(1347853744);
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM82771c, c28655q2, 0), c23000t1.m66773d(), c38072d3.m121949b(c28655q2, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, c38072d3.m121952e(c28655q2, 6).getN6(), f25, c28655q2, 0, 3456, 53240);
                        textResource24 = textResource13;
                        if (textResource24 == null) {
                            c28655q2 = c28655q2;
                            c28655q2.m87150e0(1408051930);
                            c28655q2.m87179t();
                        } else {
                            c28655q2 = c28655q2;
                            c28655q2.m87150e0(1408051931);
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource24, c28655q2, 0), AbstractC1099a.m3398t(c23000t1.m66773d(), f26, 0.0f, 0.0f, 0.0f, 14), c38072d3.m121949b(c28655q2, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, c38072d3.m121952e(c28655q2, 6).getB1(), f25, c28655q2, 0, 3456, 53240);
                            c28655q2 = c28655q2;
                            c28655q2.m87179t();
                        }
                        c28655q2.m87179t();
                    }
                    c28655q2.m87177s();
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f110163a, c2314t));
                    c28655q2.m87179t();
                    f27 = f25;
                } else {
                    textResource24 = textResource13;
                    if (z19) {
                        c28655q2.m87150e0(279550274);
                        Modifier modifierMo66772c11 = c23000t1.mo66772c(c2314t, true, 1.0f);
                        C22994r1 c22994r1M66759a14 = AbstractC22988p1.m66759a(c22949e2, c2306l, c28655q2, 0);
                        iHashCode13 = Long.hashCode(AbstractC28683x.m87267u(c28655q2));
                        InterfaceC28653p1 interfaceC28653p1M87116A21 = c28655q2.m87116A();
                        Modifier modifierM118962N21 = AbstractC37056f.m118962N(c28655q2, modifierMo66772c11);
                        f27 = f25;
                        c0213jM545a13 = C0217k.m545a();
                        c28655q2.m87158i0();
                        if (c28655q2.m87120E()) {
                            c28655q2.m87163l(c0213jM545a13);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.m547c(), c22994r1M66759a14);
                        AbstractC28683x.m87239G(c28655q2, C0217k.m549e(), interfaceC28653p1M87116A21);
                        c0209iM546b9 = C0217k.m546b();
                        if (c28655q2.m87120E()) {
                            AbstractC11266d.m30471y(iHashCode13, c28655q2, iHashCode13, c0209iM546b9);
                        } else {
                            AbstractC11266d.m30471y(iHashCode13, c28655q2, iHashCode13, c0209iM546b9);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.m548d(), modifierM118962N21);
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(c27411q.getAvgHrDisplay(), c28655q2, 0), c23000t1.m66773d(), c38072d3.m121949b(c28655q2, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q2, 6).getN6(), null, c28655q2, 0, 0, 196600);
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(hrUnitsDisplay, c28655q2, (i37 >> 12) & 14), AbstractC1099a.m3398t(c23000t1.m66773d(), f26, 0.0f, 0.0f, 0.0f, 14), c38072d3.m121949b(c28655q2, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q2, 6).getB1(), null, c28655q2, 0, 0, 196600);
                        c28655q2 = c28655q2;
                        c28655q2.m87177s();
                        c28655q2.m87179t();
                    } else {
                        f27 = f25;
                        c28655q2.m87150e0(280446887);
                        c28655q2.m87179t();
                    }
                }
                c28655q2.m87177s();
                numM82769a = c27411q.getAchievementIconRes();
                if (numM82769a == null) {
                    c28655q2.m87150e0(996660525);
                    c28655q2.m87179t();
                } else {
                    c28655q2.m87150e0(996660526);
                    int iIntValue2 = numM82769a.intValue();
                    Modifier modifierM3419p2 = AbstractC1102d.m3419p(f110163a, C1100b.f4583a.mo3400a(c2314t, C2299e.f9103F));
                    AbstractC26165a abstractC26165aM88500I2 = AbstractC29125c.m88500I(iIntValue2, c28655q2, 0);
                    String strM92103Y2 = AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62398y);
                    int i55 = C17919x.f69638o;
                    AbstractC15005f3.m43107a(abstractC26165aM88500I2, strM92103Y2, modifierM3419p2, AbstractC17918w0.m51533u(), c28655q2, 3072, 0);
                    c28655q2.m87179t();
                }
                c28655q2.m87177s();
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f15, c2314t));
                fValueOf = f27;
                textResource19 = textResource28;
                it = it3;
                textResource13 = textResource24;
            }
            TextResource textResource29 = textResource19;
            textResource20 = textResource13;
            f18 = fValueOf;
            c28655q2.m87179t();
            c28655q3 = c28655q2;
            AbstractC17755i2.m50938j(null, EnumC17744g.DOTTED, null, null, null, 0L, 0L, null, c28655q3, 48, 253);
            Modifier modifierM3394p2 = AbstractC1099a.m3394p(f17, AbstractC1102d.m3409f(1.0f, c2314t));
            c22949e = AbstractC22977m.f90650a;
            C22994r1 c22994r1M66759a15 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q3, 0);
            iHashCode3 = Long.hashCode(AbstractC28683x.m87267u(c28655q3));
            InterfaceC28653p1 interfaceC28653p1M87116A22 = c28655q3.m87116A();
            Modifier modifierM118962N22 = AbstractC37056f.m118962N(c28655q3, modifierM3394p2);
            InterfaceC0221l.f734a.getClass();
            c0213jM545a3 = C0217k.m545a();
            c28655q3.m87158i0();
            if (c28655q3.m87120E()) {
                c28655q3.m87163l(c0213jM545a3);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.m547c(), c22994r1M66759a15);
            AbstractC28683x.m87239G(c28655q3, C0217k.m549e(), interfaceC28653p1M87116A22);
            c0209iM546b2 = C0217k.m546b();
            if (c28655q3.m87120E()) {
                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209iM546b2);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209iM546b2);
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.m548d(), modifierM118962N22);
            Modifier modifierMo66772c12 = c23000t1.mo66772c(c2314t, true, f13);
            c39111m = AbstractC39083d.f168141b;
            Modifier modifierMo3471e5 = modifierMo66772c12.mo3471e(new WithAlignmentLineElement(c39111m));
            f19 = 1 * f16;
            C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f19), c2305k, c28655q3, 6);
            iHashCode4 = Long.hashCode(AbstractC28683x.m87267u(c28655q3));
            InterfaceC28653p1 interfaceC28653p1M87116A23 = c28655q3.m87116A();
            Modifier modifierM118962N23 = AbstractC37056f.m118962N(c28655q3, modifierMo3471e5);
            c0213jM545a4 = C0217k.m545a();
            c28655q3.m87158i0();
            if (c28655q3.m87120E()) {
                c28655q3.m87163l(c0213jM545a4);
            } else {
                c28655q3.m87178s0();
            }
            c0209iM8291d2 = AbstractC2875y.m8291d(c28655q3, c23010xM66775a6, c28655q3, interfaceC28653p1M87116A23);
            if (c28655q3.m87120E()) {
                AbstractC11266d.m30471y(iHashCode4, c28655q3, iHashCode4, c0209iM8291d2);
            } else {
                AbstractC11266d.m30471y(iHashCode4, c28655q3, iHashCode4, c0209iM8291d2);
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.m548d(), modifierM118962N23);
            String strM21274h8 = AbstractC8693b.m21274h(totalsDisplay, c28655q3, (i37 >> 21) & 14);
            c38072d2 = C38072d.f163053a;
            AbstractC30795n.m94707h(strM21274h8, null, c38072d2.m121949b(c28655q3, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q3, 6).getH6(), f18, c28655q3, 0, 0, 65530);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(repsDisplay, c28655q3, (i37 >> 18) & 14), null, c38072d2.m121949b(c28655q3, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q3, 6).getN6(), f18, c28655q3, 0, 0, 65530);
            c28655q4 = c28655q3;
            c28655q4.m87177s();
            if (z24) {
                c28655q4.m87150e0(1269982439);
                Modifier modifierMo3471e6 = c23000t1.mo66772c(c2314t, true, f14).mo3471e(new WithAlignmentLineElement(c39111m));
                C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f19), c2305k, c28655q4, 6);
                iHashCode6 = Long.hashCode(AbstractC28683x.m87267u(c28655q4));
                InterfaceC28653p1 interfaceC28653p1M87116A110 = c28655q4.m87116A();
                Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q4, modifierMo3471e6);
                c0213jM545a6 = C0217k.m545a();
                c28655q4.m87158i0();
                if (c28655q4.m87120E()) {
                    c28655q4.m87163l(c0213jM545a6);
                } else {
                    c28655q4.m87178s0();
                }
                c0209iM8291d3 = AbstractC2875y.m8291d(c28655q4, c23010xM66775a7, c28655q4, interfaceC28653p1M87116A110);
                if (c28655q4.m87120E()) {
                    AbstractC11266d.m30471y(iHashCode6, c28655q4, iHashCode6, c0209iM8291d3);
                } else {
                    AbstractC11266d.m30471y(iHashCode6, c28655q4, iHashCode6, c0209iM8291d3);
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.m548d(), modifierM118962N110);
                if (textResource18 == null) {
                    c28655q4.m87150e0(949156654);
                    c28655q4.m87179t();
                    textResource23 = textResource18;
                } else {
                    c28655q4.m87150e0(949156655);
                    textResource23 = textResource18;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource23, c28655q4, 0), null, c38072d2.m121949b(c28655q4, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q4, 6).getH6(), f18, c28655q4, 0, 0, 65530);
                    c28655q4 = c28655q4;
                    c28655q4.m87179t();
                }
                C22994r1 c22994r1M66759a16 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q4, 0);
                iHashCode7 = Long.hashCode(AbstractC28683x.m87267u(c28655q4));
                InterfaceC28653p1 interfaceC28653p1M87116A111 = c28655q4.m87116A();
                Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q4, c2314t);
                textResource18 = textResource23;
                c0213jM545a7 = C0217k.m545a();
                c28655q4.m87158i0();
                if (c28655q4.m87120E()) {
                    c28655q4.m87163l(c0213jM545a7);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.m547c(), c22994r1M66759a16);
                AbstractC28683x.m87239G(c28655q4, C0217k.m549e(), interfaceC28653p1M87116A111);
                c0209iM546b4 = C0217k.m546b();
                if (c28655q4.m87120E()) {
                    AbstractC11266d.m30471y(iHashCode7, c28655q4, iHashCode7, c0209iM546b4);
                } else {
                    AbstractC11266d.m30471y(iHashCode7, c28655q4, iHashCode7, c0209iM546b4);
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.m548d(), modifierM118962N111);
                C28655q c28655q10 = c28655q4;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(tonnageDisplay, c28655q4, (i37 >> 15) & 14), c23000t1.m66773d(), c38072d2.m121949b(c28655q4, 6).getStrain(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q4, 6).getN7(), f18, c28655q10, 0, 0, 65528);
                f24 = ((float) 0.5d) * f16;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(tonnageUnitsDisplay, c28655q10, (i37 >> 9) & 14), AbstractC1099a.m3398t(c23000t1.m66773d(), f24, 0.0f, 0.0f, 0.0f, 14), c38072d2.m121949b(c28655q10, 6).getStrain(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q10, 6).getB1(), f18, c28655q10, 0, 0, 65528);
                c28655q5 = c28655q10;
                c28655q5.m87177s();
                c28655q5.m87177s();
                Modifier modifierMo3471e7 = c23000t1.mo66772c(c2314t, true, 0.44f).mo3471e(new WithAlignmentLineElement(c39111m));
                C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f19), c2305k, c28655q5, 6);
                iHashCode8 = Long.hashCode(AbstractC28683x.m87267u(c28655q5));
                InterfaceC28653p1 interfaceC28653p1M87116A112 = c28655q5.m87116A();
                Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q5, modifierMo3471e7);
                c0213jM545a8 = C0217k.m545a();
                c28655q5.m87158i0();
                if (c28655q5.m87120E()) {
                    c28655q5.m87163l(c0213jM545a8);
                } else {
                    c28655q5.m87178s0();
                }
                c0209iM8291d4 = AbstractC2875y.m8291d(c28655q5, c23010xM66775a8, c28655q5, interfaceC28653p1M87116A112);
                if (c28655q5.m87120E()) {
                    AbstractC11266d.m30471y(iHashCode8, c28655q5, iHashCode8, c0209iM8291d4);
                } else {
                    AbstractC11266d.m30471y(iHashCode8, c28655q5, iHashCode8, c0209iM8291d4);
                }
                AbstractC28683x.m87239G(c28655q5, C0217k.m548d(), modifierM118962N112);
                if (textResource17 == null) {
                    c28655q5.m87150e0(1222615365);
                    c28655q5.m87179t();
                    textResource22 = textResource17;
                } else {
                    c28655q5.m87150e0(1222615366);
                    textResource22 = textResource17;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource22, c28655q5, 0), null, c38072d2.m121949b(c28655q5, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q5, 6).getH6(), f18, c28655q5, 0, 0, 65530);
                    c28655q5.m87179t();
                }
                if (textResource14 == 0) {
                    c28655q5 = c28655q5;
                    c28655q5.m87150e0(1223046172);
                    c28655q5.m87179t();
                    textResource21 = textResource14;
                } else {
                    c28655q5 = c28655q5;
                    c28655q5.m87150e0(1223046173);
                    C22994r1 c22994r1M66759a17 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q5, 0);
                    iHashCode9 = Long.hashCode(AbstractC28683x.m87267u(c28655q5));
                    InterfaceC28653p1 interfaceC28653p1M87116A113 = c28655q5.m87116A();
                    Modifier modifierM118962N113 = AbstractC37056f.m118962N(c28655q5, c2314t);
                    c0213jM545a9 = C0217k.m545a();
                    c28655q5.m87158i0();
                    if (c28655q5.m87120E()) {
                        c28655q5.m87163l(c0213jM545a9);
                    } else {
                        c28655q5.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q5, C0217k.m547c(), c22994r1M66759a17);
                    AbstractC28683x.m87239G(c28655q5, C0217k.m549e(), interfaceC28653p1M87116A113);
                    c0209iM546b5 = C0217k.m546b();
                    if (c28655q5.m87120E()) {
                        AbstractC11266d.m30471y(iHashCode9, c28655q5, iHashCode9, c0209iM546b5);
                    } else {
                        AbstractC11266d.m30471y(iHashCode9, c28655q5, iHashCode9, c0209iM546b5);
                    }
                    AbstractC28683x.m87239G(c28655q5, C0217k.m548d(), modifierM118962N113);
                    textResource21 = textResource14;
                    C28655q c28655q11 = c28655q5;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource21, c28655q5, 0), c23000t1.m66773d(), c38072d2.m121949b(c28655q5, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, c38072d2.m121952e(c28655q5, 6).getN6(), f18, c28655q11, 0, 3456, 53240);
                    c28655q5 = c28655q11;
                    if (textResource20 == null) {
                        c28655q5.m87150e0(-1577196312);
                        c28655q5.m87179t();
                    } else {
                        c28655q5.m87150e0(-1577196311);
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource20, c28655q5, 0), AbstractC1099a.m3398t(c23000t1.m66773d(), f24, 0.0f, 0.0f, 0.0f, 14), c38072d2.m121949b(c28655q5, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, c38072d2.m121952e(c28655q5, 6).getB1(), f18, c28655q5, 0, 3456, 53240);
                        c28655q5 = c28655q5;
                        c28655q5.m87179t();
                    }
                    c28655q5.m87177s();
                    c28655q5.m87179t();
                }
                c28655q5.m87177s();
                AbstractC22953f.m66715b(c28655q5, AbstractC1102d.m3424u(f110163a, c2314t));
                c28655q5.m87179t();
                textResource6 = tonnageDisplay;
            } else {
                textResource21 = textResource14;
                textResource22 = textResource17;
                c28655q4.m87150e0(1273744506);
                Modifier modifierMo3471e8 = c23000t1.mo66772c(c2314t, true, 1.0f).mo3471e(new WithAlignmentLineElement(c39111m));
                C22994r1 c22994r1M66759a18 = AbstractC22988p1.m66759a(c22949e, C2299e.f9109L, c28655q4, 48);
                iHashCode5 = Long.hashCode(AbstractC28683x.m87267u(c28655q4));
                InterfaceC28653p1 interfaceC28653p1M87116A114 = c28655q4.m87116A();
                Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q4, modifierMo3471e8);
                c0213jM545a5 = C0217k.m545a();
                c28655q4.m87158i0();
                if (c28655q4.m87120E()) {
                    c28655q4.m87163l(c0213jM545a5);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.m547c(), c22994r1M66759a18);
                AbstractC28683x.m87239G(c28655q4, C0217k.m549e(), interfaceC28653p1M87116A114);
                c0209iM546b3 = C0217k.m546b();
                if (c28655q4.m87120E()) {
                    AbstractC11266d.m30471y(iHashCode5, c28655q4, iHashCode5, c0209iM546b3);
                } else {
                    AbstractC11266d.m30471y(iHashCode5, c28655q4, iHashCode5, c0209iM546b3);
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.m548d(), modifierM118962N114);
                textResource6 = tonnageDisplay;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource6, c28655q4, (i37 >> 15) & 14), c23000t1.m66773d(), c38072d2.m121949b(c28655q4, 6).getStrain(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q4, 6).getN7(), null, c28655q4, 0, 0, 196600);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(tonnageUnitsDisplay, c28655q4, (i37 >> 9) & 14), AbstractC1099a.m3398t(c23000t1.m66773d(), ((float) 0.5d) * f16, 0.0f, 0.0f, 0.0f, 14), c38072d2.m121949b(c28655q4, 6).getStrain(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                c28655q5 = c28655q4;
                c28655q5.m87177s();
                if (z19) {
                    c28655q5.m87150e0(1274684891);
                    AbstractC22953f.m66715b(c28655q5, c23000t1.mo66772c(c2314t, true, 1.0f));
                    c28655q5.m87179t();
                } else {
                    c28655q5.m87150e0(1274759849);
                    c28655q5.m87179t();
                }
                c28655q5.m87179t();
            }
            c28655q5.m87177s();
            c28655q5.m87177s();
            textResource10 = textResource22;
            textResource9 = textResource21;
            textResource8 = textResource20;
            c28655q = c28655q5;
            z15 = z19;
            z16 = z27;
            textResource11 = textResource18;
            textResource7 = textResource29;
        } else {
            textResource6 = tonnageDisplay;
            c28655q7.m87138X();
            z15 = z4;
            z16 = z13;
            textResource7 = textResource;
            textResource8 = textResource2;
            textResource9 = textResource3;
            textResource10 = textResource5;
            c28655q = c28655q7;
            textResource11 = textResource4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final TextResource textResource210 = textResource6;
            c28677v1M87180u.m87205f(new InterfaceC4351m() { // from class: o11.f
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue3 = ((Integer) obj2).intValue();
                    return AbstractC27401g.m82600z(repsTitleDisplay, weightTitleDisplay, avgHrTitleDisplay, tonnageUnitsDisplay, hrUnitsDisplay, textResource210, repsDisplay, totalsDisplay, statRows, z15, z16, textResource7, textResource8, textResource9, textResource11, textResource10, i13, i14, i15, (Composer) obj, iIntValue3);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m82600z(TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, TextResource textResource5, TextResource textResource6, TextResource textResource7, TextResource textResource8, List list, boolean z4, boolean z13, TextResource textResource9, TextResource textResource10, TextResource textResource11, TextResource textResource12, TextResource textResource13, int i13, int i14, int i15, Composer composer, int i16) {
        m82599y(textResource, textResource2, textResource3, textResource4, textResource5, textResource6, textResource7, textResource8, list, z4, z13, textResource9, textResource10, textResource11, textResource12, textResource13, composer, AbstractC28683x.m87244L(i13 | 1), AbstractC28683x.m87244L(i14), i15);
        return C23454a0.f92919a;
    }
}
