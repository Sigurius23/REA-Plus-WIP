package xq2;

import am2.C1027k0;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2626t2;
import b91.C2886a;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import br2.AbstractC3563e;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import i91.AbstractC18247a;
import i91.AbstractC18249c;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import kr2.AbstractC22813b;
import kr2.EnumC22818g;
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
import p026b2.InterfaceC2300f;
import p077d0.C11393q0;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.EnumC22935a1;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import p72.C28958a;
import p734sl0.C32676t1;
import p745y81.InterfaceC39332e;
import pf.AbstractC29125c;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import w71.C36891k;
import wb3.AbstractC37056f;
import x30.C37888f1;
import x81.C38072d;

/* JADX INFO: renamed from: xq2.q0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a9\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\rH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a3\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a!\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u001e\u001a\u00020\u001dH\u0003¢\u0006\u0004\b\u001f\u0010 \u001a\u0017\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!H\u0003¢\u0006\u0004\b#\u0010$\u001aA\u0010*\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b*\u0010+¨\u0006,"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lxq2/r0;", "viewState", "", "skipAnimations", "Ll83/a0;", "A", "(Landroidx/compose/ui/Modifier;Lxq2/r0;ZLandroidx/compose/runtime/Composer;II)V", "", "index", "Lkotlin/time/Duration;", "delayMultiplier", "Lkotlin/Function0;", "content", "m", "(IJZLc93/m;Landroidx/compose/runtime/Composer;II)V", "Lxq2/k;", "header", "u", "(Lxq2/k;Landroidx/compose/runtime/Composer;I)V", "Lkd1/o;", "image", "Lcom/whoop/design/util/TextResource;", "text", "Lb2/f;", "alignment", "y", "(Landroidx/compose/ui/Modifier;Lkd1/o;Lcom/whoop/design/util/TextResource;Lb2/f;Landroidx/compose/runtime/Composer;II)V", "", "alpha", "q", "(Lkd1/o;FLandroidx/compose/runtime/Composer;II)V", "Lxq2/j;", "footer", "s", "(Lxq2/j;Landroidx/compose/runtime/Composer;I)V", "stat", "Ly81/e;", "statTextColor", "Li91/a;", "backgroundColor", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Li91/a;Lb2/f;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC38586q0 {

    /* JADX INFO: renamed from: xq2.q0$a */
    @InterfaceC32271e(m100429c = "com.whoop.user.journey.view.components.steps.inreviewdesignitem.userjourneydesigncomponents.YearInReviewComparisonKt$AnimatedColumnItem$1$1", m100430f = "YearInReviewComparison.kt", m100431l = {128}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f166044w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f166045x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ long f166046y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C11393q0 f166047z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z4, long j7, C11393q0 c11393q0, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f166045x = z4;
            this.f166046y = j7;
            this.f166047z = c11393q0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f166045x, this.f166046y, this.f166047z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f166044w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (!this.f166045x) {
                    long j7 = this.f166046y;
                    this.f166044w = 1;
                    if (AbstractC3034m0.m8783c(j7, this) == enumC31071a) {
                        return enumC31071a;
                    }
                }
                return C23454a0.f92919a;
            }
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f166047z.m30628I0(Boolean.TRUE);
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:56:0x017b  */
    /* JADX WARN: Code duplicated, block: B:58:0x0181  */
    /* JADX WARN: Code duplicated, block: B:61:0x0191  */
    /* JADX WARN: Code duplicated, block: B:63:0x019f  */
    /* JADX WARN: Code duplicated, block: B:69:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:71:0x01e9 A[LOOP:0: B:67:0x01db->B:71:0x01e9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x0236  */
    /* JADX WARN: Code duplicated, block: B:78:0x0241  */
    /* JADX WARN: Code duplicated, block: B:81:0x0203 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: A */
    public static final void m123731A(Modifier modifier, C38588r0 c38588r0, boolean z4, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        boolean z13;
        boolean z14;
        Modifier modifier3;
        boolean z15;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        boolean z16;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z17;
        int iHashCode2;
        int i16;
        boolean z18;
        int i17;
        int i18;
        final C38588r0 viewState = c38588r0;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-161927583);
        int i19 = i14 & 1;
        if (i19 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(viewState) ? 32 : 16;
        }
        int i24 = i14 & 4;
        if (i24 == 0) {
            if ((i13 & 384) == 0) {
                z13 = z4;
                i15 |= c28655q.m87155h(z13) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                c2314t = C2314t.f9131w;
                if (i19 != 0) {
                    modifier2 = c2314t;
                }
                if (i24 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier2);
                float f13 = 8;
                float f14 = ((float) 2.5d) * f13;
                C22971k c22971kM66746i = AbstractC22977m.m66746i(f14);
                C2305k c2305k = C2299e.f9110M;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22971kM66746i, c2305k, c28655q, 6);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
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
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    z17 = z16;
                } else {
                    z17 = z16;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                    Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, f14, 0.0f, 2);
                    String strM21274h = AbstractC8693b.m21274h(viewState.getTitle(), c28655q, TextResource.$stable);
                    C38072d c38072d = C38072d.f163053a;
                    int i25 = C38072d.f163054b;
                    Modifier modifier4 = modifier2;
                    int i26 = i15;
                    AbstractC30795n.m94707h(strM21274h, modifierM3396r, c38072d.m121949b(c28655q, i25).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i25).getT2(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
                    c28655q = c28655q;
                    C23010x c23010xM73381n = AbstractC25012a.m73381n((float) 0.5d, f13, c2305k, c28655q, 6);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM73381n);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                    final int i27 = 0;
                    viewState = c38588r0;
                    i16 = i26 & 896;
                    z18 = z17;
                    m123748m(0, 0L, z18, AbstractC37817c.m121344e(1135112297, c28655q, new InterfaceC4351m() { // from class: xq2.o0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int i28 = i27;
                            Composer composer2 = (Composer) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            switch (i28) {
                                case 0:
                                    return AbstractC38586q0.m123732B(viewState, composer2, iIntValue);
                                default:
                                    return AbstractC38586q0.m123734D(viewState, composer2, iIntValue);
                            }
                        }
                    }), c28655q, i16 | 3078, 2);
                    c28655q.m87150e0(1104623379);
                    i17 = 0;
                    for (Object obj : viewState.m123767a()) {
                        i18 = i17 + 1;
                        if (i17 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        m123748m(i18, 0L, z18, AbstractC37817c.m121344e(-416069184, c28655q, new C2626t2((C38575l) obj, z18, 11)), c28655q, i16 | 3072, 2);
                        i17 = i18;
                    }
                    c28655q.m87173q(false);
                    final int i28 = 1;
                    m123748m(viewState.m123767a().size() + 1, 0L, z18, AbstractC37817c.m121344e(1571595808, c28655q, new InterfaceC4351m() { // from class: xq2.o0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj2, Object obj3) {
                            int i29 = i28;
                            Composer composer2 = (Composer) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            switch (i29) {
                                case 0:
                                    return AbstractC38586q0.m123732B(viewState, composer2, iIntValue);
                                default:
                                    return AbstractC38586q0.m123734D(viewState, composer2, iIntValue);
                            }
                        }
                    }), c28655q, i16 | 3072, 2);
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    z15 = z18;
                    modifier3 = modifier4;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
                Modifier modifierM3396r2 = AbstractC1099a.m3396r(c2314t, f14, 0.0f, 2);
                String strM21274h2 = AbstractC8693b.m21274h(viewState.getTitle(), c28655q, TextResource.$stable);
                C38072d c38072d2 = C38072d.f163053a;
                int i29 = C38072d.f163054b;
                Modifier modifier5 = modifier2;
                int i210 = i15;
                AbstractC30795n.m94707h(strM21274h2, modifierM3396r2, c38072d2.m121949b(c28655q, i29).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i29).getT2(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
                c28655q = c28655q;
                C23010x c23010xM73381n2 = AbstractC25012a.m73381n((float) 0.5d, f13, c2305k, c28655q, 6);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM73381n2);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
                final int i211 = 0;
                viewState = c38588r0;
                i16 = i210 & 896;
                z18 = z17;
                m123748m(0, 0L, z18, AbstractC37817c.m121344e(1135112297, c28655q, new InterfaceC4351m() { // from class: xq2.o0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj2, Object obj3) {
                        int i212 = i211;
                        Composer composer2 = (Composer) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        switch (i212) {
                            case 0:
                                return AbstractC38586q0.m123732B(viewState, composer2, iIntValue);
                            default:
                                return AbstractC38586q0.m123734D(viewState, composer2, iIntValue);
                        }
                    }
                }), c28655q, i16 | 3078, 2);
                c28655q.m87150e0(1104623379);
                i17 = 0;
                while (r1.hasNext()) {
                    i18 = i17 + 1;
                    if (i17 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    m123748m(i18, 0L, z18, AbstractC37817c.m121344e(-416069184, c28655q, new C2626t2((C38575l) obj, z18, 11)), c28655q, i16 | 3072, 2);
                    i17 = i18;
                }
                c28655q.m87173q(false);
                final int i212 = 1;
                m123748m(viewState.m123767a().size() + 1, 0L, z18, AbstractC37817c.m121344e(1571595808, c28655q, new InterfaceC4351m() { // from class: xq2.o0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj2, Object obj3) {
                        int i213 = i212;
                        Composer composer2 = (Composer) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        switch (i213) {
                            case 0:
                                return AbstractC38586q0.m123732B(viewState, composer2, iIntValue);
                            default:
                                return AbstractC38586q0.m123734D(viewState, composer2, iIntValue);
                        }
                    }
                }), c28655q, i16 | 3072, 2);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                z15 = z18;
                modifier3 = modifier5;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32676t1(modifier3, viewState, z15, i13, i14, 6);
            }
        }
        i15 |= 384;
        z13 = z4;
        if ((i15 & 147) != 146) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            c2314t = C2314t.f9131w;
            if (i19 != 0) {
                modifier2 = c2314t;
            }
            if (i24 != 0) {
                z16 = false;
            } else {
                z16 = z13;
            }
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, modifier2);
            float f15 = 8;
            float f16 = ((float) 2.5d) * f15;
            C22971k c22971kM66746i2 = AbstractC22977m.m66746i(f16);
            C2305k c2305k2 = C2299e.f9110M;
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22971kM66746i2, c2305k2, c28655q, 6);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i6 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a2);
            C0209i c0209i7 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                z17 = z16;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i8 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N4);
                Modifier modifierM3396r3 = AbstractC1099a.m3396r(c2314t, f16, 0.0f, 2);
                String strM21274h3 = AbstractC8693b.m21274h(viewState.getTitle(), c28655q, TextResource.$stable);
                C38072d c38072d3 = C38072d.f163053a;
                int i213 = C38072d.f163054b;
                Modifier modifier6 = modifier2;
                int i214 = i15;
                AbstractC30795n.m94707h(strM21274h3, modifierM3396r3, c38072d3.m121949b(c28655q, i213).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q, i213).getT2(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
                c28655q = c28655q;
                C23010x c23010xM73381n3 = AbstractC25012a.m73381n((float) 0.5d, f15, c2305k2, c28655q, 6);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM73381n3);
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m5);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N5);
                final int i215 = 0;
                viewState = c38588r0;
                i16 = i214 & 896;
                z18 = z17;
                m123748m(0, 0L, z18, AbstractC37817c.m121344e(1135112297, c28655q, new InterfaceC4351m() { // from class: xq2.o0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj2, Object obj3) {
                        int i216 = i215;
                        Composer composer2 = (Composer) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        switch (i216) {
                            case 0:
                                return AbstractC38586q0.m123732B(viewState, composer2, iIntValue);
                            default:
                                return AbstractC38586q0.m123734D(viewState, composer2, iIntValue);
                        }
                    }
                }), c28655q, i16 | 3078, 2);
                c28655q.m87150e0(1104623379);
                i17 = 0;
                while (r1.hasNext()) {
                    i18 = i17 + 1;
                    if (i17 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    m123748m(i18, 0L, z18, AbstractC37817c.m121344e(-416069184, c28655q, new C2626t2((C38575l) obj, z18, 11)), c28655q, i16 | 3072, 2);
                    i17 = i18;
                }
                c28655q.m87173q(false);
                final int i216 = 1;
                m123748m(viewState.m123767a().size() + 1, 0L, z18, AbstractC37817c.m121344e(1571595808, c28655q, new InterfaceC4351m() { // from class: xq2.o0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj2, Object obj3) {
                        int i217 = i216;
                        Composer composer2 = (Composer) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        switch (i217) {
                            case 0:
                                return AbstractC38586q0.m123732B(viewState, composer2, iIntValue);
                            default:
                                return AbstractC38586q0.m123734D(viewState, composer2, iIntValue);
                        }
                    }
                }), c28655q, i16 | 3072, 2);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                z15 = z18;
                modifier3 = modifier6;
            } else {
                z17 = z16;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            C0209i c0209i9 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N4);
            Modifier modifierM3396r4 = AbstractC1099a.m3396r(c2314t, f16, 0.0f, 2);
            String strM21274h4 = AbstractC8693b.m21274h(viewState.getTitle(), c28655q, TextResource.$stable);
            C38072d c38072d4 = C38072d.f163053a;
            int i217 = C38072d.f163054b;
            Modifier modifier7 = modifier2;
            int i218 = i15;
            AbstractC30795n.m94707h(strM21274h4, modifierM3396r4, c38072d4.m121949b(c28655q, i217).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q, i217).getT2(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
            c28655q = c28655q;
            C23010x c23010xM73381n4 = AbstractC25012a.m73381n((float) 0.5d, f15, c2305k2, c28655q, 6);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM73381n4);
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m6);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N6);
            final int i219 = 0;
            viewState = c38588r0;
            i16 = i218 & 896;
            z18 = z17;
            m123748m(0, 0L, z18, AbstractC37817c.m121344e(1135112297, c28655q, new InterfaceC4351m() { // from class: xq2.o0
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj2, Object obj3) {
                    int i2110 = i219;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    switch (i2110) {
                        case 0:
                            return AbstractC38586q0.m123732B(viewState, composer2, iIntValue);
                        default:
                            return AbstractC38586q0.m123734D(viewState, composer2, iIntValue);
                    }
                }
            }), c28655q, i16 | 3078, 2);
            c28655q.m87150e0(1104623379);
            i17 = 0;
            while (r1.hasNext()) {
                i18 = i17 + 1;
                if (i17 >= 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                m123748m(i18, 0L, z18, AbstractC37817c.m121344e(-416069184, c28655q, new C2626t2((C38575l) obj, z18, 11)), c28655q, i16 | 3072, 2);
                i17 = i18;
            }
            c28655q.m87173q(false);
            final int i2110 = 1;
            m123748m(viewState.m123767a().size() + 1, 0L, z18, AbstractC37817c.m121344e(1571595808, c28655q, new InterfaceC4351m() { // from class: xq2.o0
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj2, Object obj3) {
                    int i2111 = i2110;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    switch (i2111) {
                        case 0:
                            return AbstractC38586q0.m123732B(viewState, composer2, iIntValue);
                        default:
                            return AbstractC38586q0.m123734D(viewState, composer2, iIntValue);
                    }
                }
            }), c28655q, i16 | 3072, 2);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            z15 = z18;
            modifier3 = modifier7;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            z15 = z13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32676t1(modifier3, viewState, z15, i13, i14, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m123732B(C38588r0 c38588r0, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C38573k c38573kM123769c = c38588r0.getHeader();
            int i14 = AbstractC22403o.f87638a;
            int i15 = TextResource.$stable;
            m123756u(c38573kM123769c, c28655q, i14 | i14 | i15 | i15);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m123733C(C38575l c38575l, boolean z4, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC3563e.m10687m(null, c38575l, z4, c28655q, 0, 1);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m123734D(C38588r0 c38588r0, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            m123754s(c38588r0.getFooter(), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m123735E(Modifier modifier, C38588r0 c38588r0, boolean z4, int i13, int i14, Composer composer, int i15) {
        m123731A(modifier, c38588r0, z4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091 A[PHI: r0 r2
      0x0091: PHI (r0v18 int) = (r0v9 int), (r0v7 int), (r0v19 int) binds: [B:57:0x00a3, B:51:0x008d, B:52:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x0091: PHI (r2v9 long) = (r2v4 long), (r2v2 long), (r2v2 long) binds: [B:57:0x00a3, B:51:0x008d, B:52:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ce A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:70:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:79:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:81:0x0124  */
    /* JADX WARN: Code duplicated, block: B:84:0x012e  */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: m */
    private static final void m123748m(final int i13, long j7, boolean z4, final InterfaceC4351m interfaceC4351m, Composer composer, final int i14, final int i15) {
        int i16;
        final long duration;
        boolean z13;
        boolean z14;
        final boolean z15;
        C28677v1 c28677v1M87180u;
        boolean z16;
        long duration2;
        int i17;
        boolean z17;
        Object objM87133R;
        C11393q0 c11393q0;
        boolean zM87151f;
        Object objM87133R2;
        C11393q0 c11393q1;
        int i18;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1430734597);
        if ((i14 & 6) == 0) {
            i16 = (c28655q.m87149e(i13) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            if ((i15 & 2) == 0) {
                duration = j7;
                int i19 = c28655q.m87151f(duration) ? 32 : 16;
                i16 |= i19;
            } else {
                duration = j7;
            }
            i16 |= i19;
        } else {
            duration = j7;
        }
        int i24 = i15 & 4;
        if (i24 == 0) {
            if ((i14 & 384) == 0) {
                z13 = z4;
                i16 |= c28655q.m87155h(z13) ? 256 : 128;
            }
            if ((i14 & 3072) == 0) {
                if (c28655q.m87157i(interfaceC4351m)) {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i16 |= i18;
            }
            if ((i16 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i16 & 1, z14)) {
                c28655q.m87140Z();
                if ((i14 & 1) != 0 || c28655q.m87118C()) {
                    if ((i15 & 2) != 0) {
                        Duration.Companion companion = Duration.INSTANCE;
                        duration = DurationKt.toDuration(0.5d, DurationUnit.SECONDS);
                        i16 &= -113;
                    }
                    if (i24 != 0) {
                        z16 = false;
                    }
                    c28655q.m87175r();
                    if (z16) {
                        duration2 = Duration.INSTANCE.m134357getZEROUwyO8pc();
                    } else {
                        duration2 = DurationKt.toDuration(((long) i13) * Duration.m134273getInWholeMillisecondsimpl(duration), DurationUnit.MILLISECONDS);
                    }
                    i17 = i16 & 896;
                    if (i17 == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    C28676v0 c28676v0 = C28635l.f115821a;
                    if (z17 || objM87133R == c28676v0) {
                        objM87133R = new C11393q0(Boolean.valueOf(z16));
                        c28655q.m87172p0(objM87133R);
                    }
                    c11393q0 = (C11393q0) objM87133R;
                    zM87151f = c28655q.m87151f(duration2) | (i17 == 256) | c28655q.m87157i(c11393q0);
                    objM87133R2 = c28655q.m87133R();
                    if (!zM87151f || objM87133R2 == c28676v0) {
                        a aVar = new a(z16, duration2, c11393q0, null);
                        c11393q1 = c11393q0;
                        c28655q.m87172p0(aVar);
                        objM87133R2 = aVar;
                    } else {
                        c11393q1 = c11393q0;
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, C23454a0.f92919a);
                    AbstractC22813b.m66084k(c11393q1, null, AbstractC37817c.m121344e(925860171, c28655q, new C37888f1(3, c11393q1, interfaceC4351m)), c28655q, 384, 2);
                    z15 = z16;
                } else {
                    c28655q.m87138X();
                    if ((i15 & 2) != 0) {
                        i16 &= -113;
                    }
                }
                z16 = z13;
                c28655q.m87175r();
                if (z16) {
                    duration2 = Duration.INSTANCE.m134357getZEROUwyO8pc();
                } else {
                    duration2 = DurationKt.toDuration(((long) i13) * Duration.m134273getInWholeMillisecondsimpl(duration), DurationUnit.MILLISECONDS);
                }
                i17 = i16 & 896;
                if (i17 == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R = c28655q.m87133R();
                C28676v0 c28676v1 = C28635l.f115821a;
                if (z17) {
                    objM87133R = new C11393q0(Boolean.valueOf(z16));
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C11393q0(Boolean.valueOf(z16));
                    c28655q.m87172p0(objM87133R);
                }
                c11393q0 = (C11393q0) objM87133R;
                zM87151f = c28655q.m87151f(duration2) | (i17 == 256) | c28655q.m87157i(c11393q0);
                objM87133R2 = c28655q.m87133R();
                if (zM87151f) {
                    a aVar2 = new a(z16, duration2, c11393q0, null);
                    c11393q1 = c11393q0;
                    c28655q.m87172p0(aVar2);
                    objM87133R2 = aVar2;
                } else {
                    a aVar3 = new a(z16, duration2, c11393q0, null);
                    c11393q1 = c11393q0;
                    c28655q.m87172p0(aVar3);
                    objM87133R2 = aVar3;
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, C23454a0.f92919a);
                AbstractC22813b.m66084k(c11393q1, null, AbstractC37817c.m121344e(925860171, c28655q, new C37888f1(3, c11393q1, interfaceC4351m)), c28655q, 384, 2);
                z15 = z16;
            } else {
                c28655q.m87138X();
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: xq2.p0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC38586q0.m123751p(i13, duration, z15, interfaceC4351m, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 384;
        z13 = z4;
        if ((i14 & 3072) == 0) {
            if (c28655q.m87157i(interfaceC4351m)) {
                i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 |= i18;
        }
        if ((i16 & 1171) != 1170) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i16 & 1, z14)) {
            c28655q.m87140Z();
            if ((i14 & 1) != 0) {
                if ((i15 & 2) != 0) {
                    Duration.Companion companion2 = Duration.INSTANCE;
                    duration = DurationKt.toDuration(0.5d, DurationUnit.SECONDS);
                    i16 &= -113;
                }
                if (i24 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
            } else {
                if ((i15 & 2) != 0) {
                    Duration.Companion companion3 = Duration.INSTANCE;
                    duration = DurationKt.toDuration(0.5d, DurationUnit.SECONDS);
                    i16 &= -113;
                }
                if (i24 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
            }
            c28655q.m87175r();
            if (z16) {
                duration2 = Duration.INSTANCE.m134357getZEROUwyO8pc();
            } else {
                duration2 = DurationKt.toDuration(((long) i13) * Duration.m134273getInWholeMillisecondsimpl(duration), DurationUnit.MILLISECONDS);
            }
            i17 = i16 & 896;
            if (i17 == 256) {
                z17 = true;
            } else {
                z17 = false;
            }
            objM87133R = c28655q.m87133R();
            C28676v0 c28676v2 = C28635l.f115821a;
            if (z17) {
                objM87133R = new C11393q0(Boolean.valueOf(z16));
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C11393q0(Boolean.valueOf(z16));
                c28655q.m87172p0(objM87133R);
            }
            c11393q0 = (C11393q0) objM87133R;
            zM87151f = c28655q.m87151f(duration2) | (i17 == 256) | c28655q.m87157i(c11393q0);
            objM87133R2 = c28655q.m87133R();
            if (zM87151f) {
                a aVar4 = new a(z16, duration2, c11393q0, null);
                c11393q1 = c11393q0;
                c28655q.m87172p0(aVar4);
                objM87133R2 = aVar4;
            } else {
                a aVar5 = new a(z16, duration2, c11393q0, null);
                c11393q1 = c11393q0;
                c28655q.m87172p0(aVar5);
                objM87133R2 = aVar5;
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, C23454a0.f92919a);
            AbstractC22813b.m66084k(c11393q1, null, AbstractC37817c.m121344e(925860171, c28655q, new C37888f1(3, c11393q1, interfaceC4351m)), c28655q, 384, 2);
            z15 = z16;
        } else {
            c28655q.m87138X();
            z15 = z13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: xq2.p0
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC38586q0.m123751p(i13, duration, z15, interfaceC4351m, i14, i15, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m123749n(C11393q0 c11393q0, InterfaceC4351m interfaceC4351m, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC22813b.m66094u(c11393q0, EnumC22818g.TOP, null, AbstractC37817c.m121344e(-2003128298, c28655q, new C38603z(interfaceC4351m, 1)), c28655q, 3120, 4);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m123750o(InterfaceC4351m interfaceC4351m, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            interfaceC4351m.invoke(c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m123751p(int i13, long j7, boolean z4, InterfaceC4351m interfaceC4351m, int i14, int i15, Composer composer, int i16) {
        m123748m(i13, j7, z4, interfaceC4351m, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    private static final void m123752q(AbstractC22403o abstractC22403o, float f13, Composer composer, int i13, int i14) {
        int i15;
        float f14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1320982483);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(abstractC22403o) : c28655q.m87157i(abstractC22403o) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87147d(f13) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            float f15 = i16 != 0 ? 1.0f : f13;
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q, AbstractC22403o.f87638a | (i15 & 14), 3), null, AbstractC34132o.m107879c(f15, AbstractC37056f.m118994r(AbstractC1102d.m3419p(5 * 4, C2314t.f9131w), AbstractC33253j.f138651a)), null, C39102j.f168199a, 0.0f, null, c28655q, 24624, 104);
            c28655q = c28655q;
            f14 = f15;
        } else {
            c28655q.m87138X();
            f14 = f13;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1027k0(abstractC22403o, f14, i13, i14, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m123753r(AbstractC22403o abstractC22403o, float f13, int i13, int i14, Composer composer, int i15) {
        m123752q(abstractC22403o, f13, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    private static final void m123754s(C38571j c38571j, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1474372462);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c38571j) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(((float) 0.5d) * 8), C2299e.f9107J, c28655q, 6);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            TextResource stat = c38571j.getLeft().getStat();
            TextResource text = c38571j.getLeft().getText();
            InterfaceC39332e statTextColor = c38571j.getLeft().getStatTextColor();
            AbstractC18247a backgroundColor = c38571j.getLeft().getBackgroundColor();
            C2305k c2305k = C2299e.f9110M;
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            int i15 = TextResource.$stable;
            int i16 = (i15 << 3) | i15 | 24576 | (AbstractC18247a.f71043a << 9);
            m123758w(stat, text, statTextColor, backgroundColor, c2305k, layoutWeightElement, c28655q, i16, 0);
            TextResource stat2 = c38571j.getRight().getStat();
            TextResource text2 = c38571j.getRight().getText();
            InterfaceC39332e statTextColor2 = c38571j.getRight().getStatTextColor();
            AbstractC18247a backgroundColor2 = c38571j.getRight().getBackgroundColor();
            C2305k c2305k2 = C2299e.f9112O;
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            m123758w(stat2, text2, statTextColor2, backgroundColor2, c2305k2, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), c28655q, i16, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C38549b(c38571j, i13, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m123755t(C38571j c38571j, int i13, Composer composer, int i14) {
        m123754s(c38571j, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: u */
    private static final void m123756u(C38573k c38573k, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(813119242);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(c38573k) : c28655q.m87157i(c38573k) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Modifier modifierM3388j = AbstractC1099a.m3388j(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), EnumC22935a1.f90537w);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(((float) 0.5d) * 8), C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3388j);
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
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM3406c = AbstractC1102d.m3406c(1.0f, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            AbstractC22403o abstractC22403oM123663a = c38573k.getLeftImage();
            TextResource textResourceM123664b = c38573k.getLeftText();
            C2305k c2305k = C2299e.f9110M;
            int i15 = (TextResource.$stable << 6) | (AbstractC22403o.f87638a << 3) | 3072;
            m123760y(modifierM3406c, abstractC22403oM123663a, textResourceM123664b, c2305k, c28655q, i15, 0);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            m123760y(AbstractC1102d.m3406c(1.0f, new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true)), c38573k.getRightImage(), c38573k.getRightText(), C2299e.f9112O, c28655q, i15, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C38549b(c38573k, i13, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m123757v(C38573k c38573k, int i13, Composer composer, int i14) {
        m123756u(c38573k, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:75:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:80:0x011f  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:85:0x01de  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: w */
    private static final void m123758w(TextResource textResource, TextResource textResource2, InterfaceC39332e interfaceC39332e, AbstractC18247a abstractC18247a, InterfaceC2300f interfaceC2300f, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        C28655q c28655q;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        C22949e c22949e;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-2129177666);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q2.m87153g(textResource) : c28655q2.m87157i(textResource) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q2.m87153g(textResource2) : c28655q2.m87157i(textResource2) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87157i(interfaceC39332e) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= (i13 & 4096) == 0 ? c28655q2.m87153g(abstractC18247a) : c28655q2.m87157i(abstractC18247a) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q2.m87153g(interfaceC2300f) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        int i16 = i14 & 32;
        if (i16 == 0) {
            if ((196608 & i13) == 0) {
                modifier2 = modifier;
                i15 |= c28655q2.m87153g(modifier2) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            if ((74899 & i15) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                float f13 = 8;
                float f14 = ((float) 2.5d) * f13;
                float f15 = f13 * 1;
                Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC18249c.m52565c(modifier4, abstractC18247a), f14, f15);
                if (AbstractC22676k.m65745e(interfaceC2300f, C2299e.f9110M)) {
                    c22949e = AbstractC22977m.f90650a;
                } else {
                    c22949e = AbstractC22977m.f90651b;
                }
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22949e, C2299e.f9108K, c28655q2, 48);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3395q);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                int i17 = TextResource.$stable;
                String strM21274h = AbstractC8693b.m21274h(textResource, c28655q2, (i15 & 14) | i17);
                C38072d c38072d = C38072d.f163053a;
                int i18 = C38072d.f163054b;
                C2886a c2886aM8405C = c38072d.m121952e(c28655q2, i18).getN6();
                long jMo134584toComposableColorWaAFU9c = interfaceC39332e.mo134584toComposableColorWaAFU9c(c28655q2, (i15 >> 6) & 14);
                int i19 = C2886a.f11498d << 18;
                Modifier modifier5 = modifier4;
                AbstractC30795n.m94707h(strM21274h, null, jMo134584toComposableColorWaAFU9c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8405C, null, c28655q2, 0, i19, 196602);
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f15, c2314t));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource2, c28655q2, i17 | ((i15 >> 3) & 14)), null, c38072d.m121949b(c28655q2, i18).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i18).getB1(), null, c28655q2, 0, i19, 196602);
                c28655q = c28655q2;
                c28655q.m87173q(true);
                modifier3 = modifier5;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C28958a(textResource, textResource2, interfaceC39332e, abstractC18247a, interfaceC2300f, modifier3, i13, i14, 12);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        modifier2 = modifier;
        if ((74899 & i15) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            float f16 = 8;
            float f17 = ((float) 2.5d) * f16;
            float f18 = f16 * 1;
            Modifier modifierM3395q2 = AbstractC1099a.m3395q(AbstractC18249c.m52565c(modifier4, abstractC18247a), f17, f18);
            if (AbstractC22676k.m65745e(interfaceC2300f, C2299e.f9110M)) {
                c22949e = AbstractC22977m.f90650a;
            } else {
                c22949e = AbstractC22977m.f90651b;
            }
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22949e, C2299e.f9108K, c28655q2, 48);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3395q2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
            int i110 = TextResource.$stable;
            String strM21274h2 = AbstractC8693b.m21274h(textResource, c28655q2, (i15 & 14) | i110);
            C38072d c38072d2 = C38072d.f163053a;
            int i111 = C38072d.f163054b;
            C2886a c2886aM8405C2 = c38072d2.m121952e(c28655q2, i111).getN6();
            long jMo134584toComposableColorWaAFU9c2 = interfaceC39332e.mo134584toComposableColorWaAFU9c(c28655q2, (i15 >> 6) & 14);
            int i112 = C2886a.f11498d << 18;
            Modifier modifier6 = modifier4;
            AbstractC30795n.m94707h(strM21274h2, null, jMo134584toComposableColorWaAFU9c2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8405C2, null, c28655q2, 0, i112, 196602);
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f18, c2314t));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource2, c28655q2, i110 | ((i15 >> 3) & 14)), null, c38072d2.m121949b(c28655q2, i111).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, i111).getB1(), null, c28655q2, 0, i112, 196602);
            c28655q = c28655q2;
            c28655q.m87173q(true);
            modifier3 = modifier6;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28958a(textResource, textResource2, interfaceC39332e, abstractC18247a, interfaceC2300f, modifier3, i13, i14, 12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m123759x(TextResource textResource, TextResource textResource2, InterfaceC39332e interfaceC39332e, AbstractC18247a abstractC18247a, InterfaceC2300f interfaceC2300f, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m123758w(textResource, textResource2, interfaceC39332e, abstractC18247a, interfaceC2300f, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: y */
    private static final void m123760y(Modifier modifier, AbstractC22403o abstractC22403o, TextResource textResource, InterfaceC2300f interfaceC2300f, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C28655q c28655q;
        Modifier modifier3;
        boolean z4;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1197354085);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q2.m87153g(abstractC22403o) : c28655q2.m87157i(abstractC22403o) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= (i13 & 512) == 0 ? c28655q2.m87153g(textResource) : c28655q2.m87157i(textResource) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q2.m87153g(interfaceC2300f) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q2.m87135U(i15 & 1, (i15 & 1171) != 1170)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier4 = i16 != 0 ? c2314t : modifier2;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier4);
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM3409f, c38072d.m121949b(c28655q2, i17).getWhite10(), AbstractC17918w0.f69621a);
            float f13 = 8;
            Modifier modifierM3395q = AbstractC1099a.m3395q(modifierM3358c, ((float) 2.5d) * f13, ((float) 1.5d) * f13);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3395q);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            Modifier modifier5 = modifier4;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            C2305k c2305k = C2299e.f9110M;
            int i18 = i15;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22676k.m65745e(interfaceC2300f, c2305k) ? AbstractC22977m.f90650a : AbstractC22977m.f90651b, C2299e.f9108K, c28655q2, 48);
            int iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3409f2);
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
            if (!AbstractC22676k.m65745e(interfaceC2300f, c2305k) || abstractC22403o == null) {
                z4 = false;
                c28655q2.m87150e0(-565925133);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-566042375);
                m123752q(abstractC22403o, 0.0f, c28655q2, AbstractC22403o.f87638a | ((i18 >> 3) & 14), 2);
                z4 = false;
                AbstractC31061c.m95650z(1, f13, c2314t, c28655q2, false);
            }
            if (!(((double) 1.0f) > 0.0d ? true : z4)) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource, c28655q2, TextResource.$stable | ((i18 >> 6) & 14)), new LayoutWeightElement(1.0f, true), c38072d.m121949b(c28655q2, i17).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(AbstractC22676k.m65745e(interfaceC2300f, c2305k) ? 5 : 6), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i17).getB1(), null, c28655q2, 0, C2886a.f11498d << 18, 196088);
            c28655q = c28655q2;
            if (!AbstractC22676k.m65745e(interfaceC2300f, C2299e.f9112O) || abstractC22403o == null) {
                c28655q.m87150e0(-565400365);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-565531061);
                AbstractC18489d0.m53380u(1, f13, c2314t, c28655q);
                m123752q(abstractC22403o, 0.5f, c28655q, AbstractC22403o.f87638a | 48 | ((i18 >> 3) & 14), 0);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            modifier3 = modifier5;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36891k(modifier3, abstractC22403o, textResource, interfaceC2300f, i13, i14, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m123761z(Modifier modifier, AbstractC22403o abstractC22403o, TextResource textResource, InterfaceC2300f interfaceC2300f, int i13, int i14, Composer composer, int i15) {
        m123760y(modifier, abstractC22403o, textResource, interfaceC2300f, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
