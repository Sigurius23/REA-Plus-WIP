package c81;

import a41.C0373i;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import bu2.C3657r;
import bu2.C3658s;
import c13.AbstractC3855a;
import c41.C4007d1;
import c93.InterfaceC4351m;
import com.whoop.navigation.C9598e;
import e93.AbstractC12889b;
import hy0.AbstractC17808z1;
import hy0.C17731c2;
import i93.C18282h;
import java.util.ArrayList;
import java.util.List;
import kd1.C22408t;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2307m;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22663d0;
import p715kotlin.jvm.internal.C22667f0;
import p745y81.EnumC39333f;
import p91.AbstractC29011e;
import p91.C29007a;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: c81.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u001a+\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a7\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001f\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001aD\u0010\u001d\u001a\u00020\u00062\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u001c\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0018\u0018\u00010\u001b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u001d\u0010\u001e\u001a/\u0010!\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b!\u0010\"\u001a;\u0010'\u001a\u00020\u0000*\u00020\u00002\u0006\u0010$\u001a\u00020#2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020#2\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b'\u0010(\u001a;\u0010*\u001a\u00020\u0000*\u00020\u00002\u0006\u0010$\u001a\u00020#2\u0006\u0010)\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020#2\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b*\u0010+\"\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-\"\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010-\"\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010-¨\u00060"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lc81/g;", "itemState", "Lkd1/t;", "helper", "Ll83/a0;", "i", "(Landroidx/compose/ui/Modifier;Lc81/g;Lkd1/t;Landroidx/compose/runtime/Composer;II)V", "", "text", "", "index", "", "totalTickCount", "Li2/x;", "backgroundColor", "g", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;FIJLandroidx/compose/runtime/Composer;I)V", "e", "(Lc81/g;Landroidx/compose/runtime/Composer;I)V", "animatableColor", "k", "(Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;I)V", "Lp1/c1;", "Li93/h;", "gradientStartEnd", "", "animatablesColor", "p", "(Lp1/c1;Lc81/g;Ljava/util/List;Lkd1/t;Lq83/d;)Ljava/lang/Object;", "Lc81/e;", "model", "q", "(Li93/h;ILc81/e;Lkd1/t;)J", "Ly3/f;", "tickRowPadding", "tickWidth", "tickSpacing", "o", "(Landroidx/compose/ui/Modifier;FIFFILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "continuousIndex", "n", "(Landroidx/compose/ui/Modifier;FFFFILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "a", "F", "b", "c", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4304d {

    /* JADX INFO: renamed from: a */
    private static final float f17445a = 2;

    /* JADX INFO: renamed from: b */
    private static final float f17446b = 1;

    /* JADX INFO: renamed from: c */
    private static final float f17447c = 8;

    /* JADX INFO: renamed from: c81.d$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.paceofagingmeter.PaceOfAgingMeterKt$PaceOfAgingMeter$1$1", m100430f = "PaceOfAgingMeter.kt", m100431l = {79, 81, 93}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        int f17448E;

        /* JADX INFO: renamed from: F */
        float f17449F;

        /* JADX INFO: renamed from: G */
        int f17450G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ C4307g f17451H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ InterfaceC28601c1 f17452I;

        /* JADX INFO: renamed from: J */
        final /* synthetic */ List<InterfaceC28601c1> f17453J;

        /* JADX INFO: renamed from: K */
        final /* synthetic */ C22408t f17454K;

        /* JADX INFO: renamed from: L */
        final /* synthetic */ InterfaceC28601c1 f17455L;

        /* JADX INFO: renamed from: w */
        Object f17456w;

        /* JADX INFO: renamed from: x */
        Object f17457x;

        /* JADX INFO: renamed from: y */
        Object f17458y;

        /* JADX INFO: renamed from: z */
        Object f17459z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(C4307g c4307g, InterfaceC28601c1 interfaceC28601c1, List<? extends InterfaceC28601c1> list, C22408t c22408t, InterfaceC28601c1 interfaceC28601c2, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f17451H = c4307g;
            this.f17452I = interfaceC28601c1;
            this.f17453J = list;
            this.f17454K = c22408t;
            this.f17455L = interfaceC28601c2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final C23454a0 m13575h(C22667f0 c22667f0, C22667f0 c22667f1, int i13, C22408t c22408t, C18282h c18282h, InterfaceC28601c1 interfaceC28601c1, C22663d0 c22663d0, C4307g c4307g, List list, long j7) {
            InterfaceC28601c1 interfaceC28601c2;
            if (c22667f0.f89335w == -1) {
                c22667f0.f89335w = j7;
            }
            long j13 = j7 - c22667f0.f89335w;
            c22667f1.f89335w = j13;
            float fM64515c = c22408t.m64515c(c18282h, AbstractC12889b.m36283m(i13 != 0 ? j13 / i13 : 0.0f, 0.0f, 1.0f));
            interfaceC28601c1.setValue(Float.valueOf(fM64515c));
            if (!Float.isNaN(c22663d0.f89331w) && !Float.isNaN(fM64515c) && AbstractC12889b.m36258X(c22663d0.f89331w) != AbstractC12889b.m36258X(fM64515c)) {
                C18282h c18282hM64514b = c22408t.m64514b(new C23465k(Integer.valueOf((int) c22663d0.f89331w), Integer.valueOf((int) fM64515c)));
                int i14 = c18282hM64514b.f71133w;
                int i15 = c18282hM64514b.f71134x;
                int i16 = c18282hM64514b.f71135y;
                if ((i16 > 0 && i14 <= i15) || (i16 < 0 && i15 <= i14)) {
                    while (true) {
                        C4305e c4305e = (C4305e) AbstractC25265s.m74102I0(i14, c4307g.m13587j());
                        if (c4305e != null && (interfaceC28601c2 = (InterfaceC28601c1) AbstractC25265s.m74102I0(i14, list)) != null) {
                            interfaceC28601c2.setValue(new C17919x(AbstractC4304d.m13573q(c18282h, i14, c4305e, c22408t)));
                        }
                        if (i14 == i15) {
                            break;
                        }
                        i14 += i16;
                    }
                }
            }
            c22663d0.f89331w = fM64515c;
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f17451H, this.f17452I, this.f17453J, this.f17454K, this.f17455L, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x00ac  */
        /* JADX WARN: Code duplicated, block: B:28:0x00d8  */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
        
            if (bc3.AbstractC3034m0.m8782b(1000, r21) == r1) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00d5, code lost:
        
            if (p390p1.AbstractC28683x.m87246N(r11, r21) == r1) goto L27;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00d5 -> B:8:0x002d). Please report as a decompilation issue!!! */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instruction units count: 224
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: c81.AbstractC4304d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: c81.d$b */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.paceofagingmeter.PaceOfAgingMeterKt", m100430f = "PaceOfAgingMeter.kt", m100431l = {273}, m100432m = "collapseCurrentGradient", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f17460E;

        /* JADX INFO: renamed from: F */
        Object f17461F;

        /* JADX INFO: renamed from: G */
        int f17462G;

        /* JADX INFO: renamed from: H */
        int f17463H;

        /* JADX INFO: renamed from: I */
        int f17464I;

        /* JADX INFO: renamed from: J */
        int f17465J;

        /* JADX INFO: renamed from: K */
        int f17466K;

        /* JADX INFO: renamed from: L */
        /* synthetic */ Object f17467L;

        /* JADX INFO: renamed from: M */
        int f17468M;

        /* JADX INFO: renamed from: w */
        Object f17469w;

        /* JADX INFO: renamed from: x */
        Object f17470x;

        /* JADX INFO: renamed from: y */
        Object f17471y;

        /* JADX INFO: renamed from: z */
        Object f17472z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f17467L = obj;
            this.f17468M |= Integer.MIN_VALUE;
            return AbstractC4304d.m13572p(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: e */
    private static final void m13561e(C4307g c4307g, Composer composer, int i13) {
        C2314t c2314t;
        boolean z4;
        C4307g c4307g2 = c4307g;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1150918371);
        int i14 = (i13 & 6) == 0 ? (c28655q.m87157i(c4307g2) ? 4 : 2) | i13 : i13;
        boolean z13 = true;
        boolean z14 = false;
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t2);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            c28655q.m87150e0(33813636);
            int i15 = 0;
            for (Object obj : c4307g2.m13587j()) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                String strM13576a = ((C4305e) obj).getBottomValueDisplay();
                if (strM13576a == null) {
                    c28655q.m87150e0(-1539009621);
                    c28655q.m87173q(z14);
                    c2314t = c2314t2;
                    z4 = z14;
                } else {
                    c28655q.m87150e0(-1539009620);
                    C2314t c2314t3 = c2314t2;
                    c2314t = c2314t3;
                    C28655q c28655q2 = c28655q;
                    z4 = z14;
                    AbstractC30795n.m94707h(strM13576a, m13571o(c2314t3, f17447c, i15, f17445a, f17446b, c4307g2.m13587j().size(), c28655q, 27702), EnumC39333f.WHITE_50.mo134584toComposableColorWaAFU9c(c28655q, 6), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getN9(), null, c28655q2, 0, 0, 196600);
                    c28655q = c28655q2;
                    c28655q.m87173q(z4);
                }
                z13 = true;
                z14 = z4;
                i15 = i16;
                c2314t2 = c2314t;
                c4307g2 = c4307g;
            }
            c28655q.m87173q(z14);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0373i(c4307g, i13, 25);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m13562f(C4307g c4307g, int i13, Composer composer, int i14) {
        m13561e(c4307g, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g */
    private static final void m13563g(Modifier modifier, String str, float f13, int i13, long j7, Composer composer, int i14) {
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-31490978);
        if ((i14 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 384) == 0) {
            i15 |= c28655q.m87147d(f13) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= c28655q.m87149e(i13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i14 & 24576) == 0) {
            i15 |= c28655q.m87151f(j7) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 9347) != 9346)) {
            float f14 = f17447c;
            float f15 = f17445a;
            float f16 = 4;
            AbstractC22989q.m66760a(AbstractC31061c.m95629e(AbstractC1102d.m3411h(32, AbstractC1102d.m3424u(f15, m13570n(modifier, f14, f13, f15, f17446b, i13, c28655q, (i15 & 14) | 27696 | (i15 & 896) | ((i15 << 6) & 458752)))), f16, f16, j7), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3658s(modifier, str, f13, i13, j7, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m13564h(Modifier modifier, String str, float f13, int i13, long j7, int i14, Composer composer, int i15) {
        m13563g(modifier, str, f13, i13, j7, composer, AbstractC28683x.m87244L(i14 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:102:0x0222  */
    /* JADX WARN: Code duplicated, block: B:103:0x0226  */
    /* JADX WARN: Code duplicated, block: B:106:0x0233  */
    /* JADX WARN: Code duplicated, block: B:108:0x0241  */
    /* JADX WARN: Code duplicated, block: B:111:0x024d  */
    /* JADX WARN: Code duplicated, block: B:113:0x026a  */
    /* JADX WARN: Code duplicated, block: B:117:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:120:0x0305  */
    /* JADX WARN: Code duplicated, block: B:121:0x030f  */
    /* JADX WARN: Code duplicated, block: B:125:0x0349  */
    /* JADX WARN: Code duplicated, block: B:126:0x034d  */
    /* JADX WARN: Code duplicated, block: B:133:0x036c  */
    /* JADX WARN: Code duplicated, block: B:136:0x0394  */
    /* JADX WARN: Code duplicated, block: B:137:0x0398  */
    /* JADX WARN: Code duplicated, block: B:142:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:145:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:146:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:151:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:157:0x043f  */
    /* JADX WARN: Code duplicated, block: B:164:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:168:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:174:0x052a  */
    /* JADX WARN: Code duplicated, block: B:180:0x0580  */
    /* JADX WARN: Code duplicated, block: B:185:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:188:0x0629  */
    /* JADX WARN: Code duplicated, block: B:189:0x062d  */
    /* JADX WARN: Code duplicated, block: B:194:0x0648  */
    /* JADX WARN: Code duplicated, block: B:197:0x0674  */
    /* JADX WARN: Code duplicated, block: B:198:0x0678  */
    /* JADX WARN: Code duplicated, block: B:203:0x0693  */
    /* JADX WARN: Code duplicated, block: B:207:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:209:0x06b8 A[LOOP:1: B:205:0x06aa->B:209:0x06b8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:214:0x0719  */
    /* JADX WARN: Code duplicated, block: B:215:0x071d  */
    /* JADX WARN: Code duplicated, block: B:220:0x073e  */
    /* JADX WARN: Code duplicated, block: B:227:0x0766  */
    /* JADX WARN: Code duplicated, block: B:237:0x06e6 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v17, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r10v19, types: [y81.f] */
    /* JADX WARN: Type inference failed for: r14v10, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r14v12, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r14v14, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r14v16, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r14v18, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r14v2, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r14v20, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r14v28 */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v30 */
    /* JADX WARN: Type inference failed for: r14v31 */
    /* JADX WARN: Type inference failed for: r14v32 */
    /* JADX WARN: Type inference failed for: r14v6, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r14v7, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r14v8, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r14v9, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r1v18, types: [y81.f] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [int] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r30v1, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r30v2, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r30v3, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r30v4, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r30v5, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v15, types: [kd1.t] */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r5v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r9v40, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r9v47, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r9v49, types: [y81.f] */
    /* JADX WARN: Type inference failed for: r9v52, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r9v54, types: [y81.f] */
    /* JADX WARN: Type inference failed for: r9v57, types: [y81.f] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: i */
    public static final void m13565i(Modifier modifier, C4307g itemState, C22408t c22408t, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C22408t c22408t2;
        Modifier modifier3;
        ?? r14;
        ?? r10;
        C22408t c22408t3;
        InterfaceC28601c1 interfaceC28601c1;
        InterfaceC28601c1 interfaceC28601c2;
        C0209i c0209i;
        int iHashCode;
        boolean z4;
        int i16;
        boolean z13;
        C0213j c0213j;
        C2314t c2314t;
        Modifier modifier4;
        C2305k c2305k;
        C28655q c28655q;
        C17731c2 c17731c2M13589l;
        C22408t c22408t4;
        ?? r15;
        ?? r16;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        ?? r17;
        ?? r18;
        ?? r19;
        ?? r110;
        C4305e c4305e;
        String strM13578c;
        ?? r111;
        int iHashCode5;
        int iHashCode6;
        ?? r24;
        int iHashCode7;
        C0213j c0213j2;
        C0209i c0209i2;
        C4305e c4305e2;
        String str;
        String strM13578c2;
        int i17;
        C22408t c22408t5;
        int i18;
        C22408t c22408t6;
        C22408t c22408t7;
        AbstractC22676k.m65750j(itemState, "itemState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1593386805);
        int i19 = i14 & 1;
        if (i19 != 0) {
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
            i15 |= c28655q2.m87157i(itemState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            if ((i14 & 4) == 0) {
                c22408t7 = c22408t;
                if (c28655q2.m87153g(c22408t7)) {
                    c22408t5 = c22408t7;
                    i18 = 256;
                    c22408t6 = c22408t7;
                }
                i15 |= i18;
                c22408t2 = c22408t6;
            } else {
                c22408t5 = c22408t;
            }
            c22408t5 = c22408t7;
            i18 = 128;
            c22408t6 = c22408t5;
            i15 |= i18;
            c22408t2 = c22408t6;
        } else {
            c22408t2 = c22408t;
        }
        if (c28655q2.m87135U(i15 & 1, (i15 & 147) != 146)) {
            c28655q2.m87140Z();
            int i24 = i13 & 1;
            C2314t c2314t2 = C2314t.f9131w;
            if (i24 == 0 || c28655q2.m87118C()) {
                if (i19 != 0) {
                    modifier2 = c2314t2;
                }
                c22408t3 = c22408t2;
                if ((i14 & 4) != 0) {
                    i15 &= -897;
                    c22408t3 = new C22408t();
                }
            } else {
                c28655q2.m87138X();
                if ((i14 & 4) != 0) {
                    c22408t3 = c22408t2;
                    i15 &= -897;
                    c22408t3 = c22408t2;
                }
            }
            c22408t3 = c22408t2;
            Modifier modifier5 = modifier2;
            int i25 = i15;
            c28655q2.m87175r();
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                List<C4305e> listM13587j = itemState.m13587j();
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM13587j, 10));
                int i26 = 0;
                for (Object obj : listM13587j) {
                    int i27 = i26 + 1;
                    if (i26 < 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    arrayList.add(AbstractC28683x.m87272z(new C17919x(m13573q(itemState.getGradientProgression(), i26, (C4305e) obj, c22408t3))));
                    i26 = i27;
                }
                c28655q2.m87172p0(arrayList);
                objM87133R = arrayList;
            }
            List list = (List) objM87133R;
            Object objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(itemState.getGradientProgression());
                c28655q2.m87172p0(objM87133R2);
            }
            InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) objM87133R2;
            Object objM87133R3 = c28655q2.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC3855a.m11831o(itemState.getGradientProgression().f71134x, c28655q2);
            }
            InterfaceC28601c1 interfaceC28601c4 = (InterfaceC28601c1) objM87133R3;
            Integer numValueOf = Integer.valueOf(itemState.getGradientProgression().f71133w);
            Integer numValueOf2 = Integer.valueOf(itemState.getGradientProgression().f71134x);
            boolean zM87157i = c28655q2.m87157i(itemState) | c28655q2.m87157i(list) | ((((i25 & 896) ^ 384) > 256 && c28655q2.m87153g(c22408t3)) || (i25 & 384) == 256);
            Object objM87133R4 = c28655q2.m87133R();
            if (zM87157i || objM87133R4 == c28676v0) {
                interfaceC28601c1 = interfaceC28601c4;
                a aVar = new a(itemState, interfaceC28601c3, list, c22408t3, interfaceC28601c1, null);
                c28655q2.m87172p0(aVar);
                objM87133R4 = aVar;
            } else {
                interfaceC28601c1 = interfaceC28601c4;
            }
            AbstractC28683x.m87254h(numValueOf, numValueOf2, (InterfaceC4351m) objM87133R4, c28655q2);
            C22971k c22971kM66746i = AbstractC22977m.m66746i(6);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier5);
            C2305k c2305k2 = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22971kM66746i, c2305k2, c28655q2, 6);
            int iHashCode8 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j3 = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j3);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i3 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i3, c23010xM66775a);
            C0209i c0209i4 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i4, interfaceC28653p1M87165m);
            C0209i c0209i5 = C0217k.f732j;
            if (c28655q2.f115903S) {
                interfaceC28601c2 = interfaceC28601c1;
            } else {
                interfaceC28601c2 = interfaceC28601c1;
                if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode8))) {
                }
                c0209i = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i, modifierM118962N);
                if (itemState.getTitleDisplay() == null || itemState.getTrend() != null) {
                    c28655q2.m87150e0(538321689);
                    Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t2);
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q2, 48);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3409f2);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j3);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i3, c22994r1M66759a);
                    AbstractC28683x.m87239G(c28655q2, c0209i4, interfaceC28653p1M87165m2);
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i5);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, modifierM118962N2);
                    if (itemState.getTitleDisplay() == null) {
                        c28655q2.m87150e0(-1494117923);
                        z4 = false;
                        c28655q2.m87173q(false);
                        c2305k = c2305k2;
                        c0213j = c0213j3;
                        modifier4 = modifier5;
                        i16 = i25;
                        c2314t = c2314t2;
                        z13 = true;
                        c28655q = c28655q2;
                    } else {
                        z4 = false;
                        c28655q2.m87150e0(-1494117922);
                        i16 = i25;
                        z13 = true;
                        c0213j = c0213j3;
                        c2314t = c2314t2;
                        modifier4 = modifier5;
                        c2305k = c2305k2;
                        AbstractC30795n.m94707h(itemState.getTitleDisplay(), null, EnumC39333f.BRAND_WHITE.mo134584toComposableColorWaAFU9c(c28655q2, 6), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q2, 6).getSh4(), null, c28655q2, 0, 0, 196602);
                        C28655q c28655q3 = c28655q2;
                        c28655q3.m87173q(false);
                        c28655q = c28655q3;
                    }
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(1.0f, z13));
                    c17731c2M13589l = itemState.getTrend();
                    if (c17731c2M13589l == null) {
                        c28655q.m87150e0(-1493858794);
                        c28655q.m87173q(z4);
                    } else {
                        c28655q.m87150e0(-1493858793);
                        AbstractC17808z1.m51175c(c17731c2M13589l, c28655q, C9598e.f28134d);
                        c28655q.m87173q(z4);
                    }
                    c28655q.m87173q(z13);
                    c28655q.m87173q(z4);
                    r16 = z4;
                    r15 = c28655q;
                    c22408t4 = c22408t3;
                } else {
                    c28655q2.m87150e0(538832941);
                    r16 = 0;
                    c28655q2.m87173q(false);
                    c0209i = c0209i;
                    list = list;
                    c22408t4 = c22408t3;
                    c2305k = c2305k2;
                    c2314t = c2314t2;
                    c0213j = c0213j3;
                    modifier4 = modifier5;
                    i16 = i25;
                    z13 = true;
                    r15 = c28655q2;
                }
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                float f13 = 4;
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f13), c2305k, r15, 6);
                iHashCode2 = Long.hashCode(r15.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = r15.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(r15, modifierM3409f3);
                r15.m87158i0();
                if (r15.f115903S) {
                    r15.m87163l(c0213j);
                } else {
                    r15.m87178s0();
                }
                AbstractC28683x.m87239G(r15, c0209i3, c23010xM66775a2);
                AbstractC28683x.m87239G(r15, c0209i4, interfaceC28653p1M87165m3);
                if (r15.f115903S || !AbstractC22676k.m65745e(r15.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i5);
                }
                C0209i c0209i6 = c0209i;
                AbstractC28683x.m87239G(r15, c0209i6, modifierM118962N3);
                C2307m c2307m = C2299e.f9104G;
                Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, r16);
                iHashCode3 = Long.hashCode(r15.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = r15.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(r15, modifierM3409f4);
                r15.m87158i0();
                if (r15.f115903S) {
                    r15.m87163l(c0213j);
                } else {
                    r15.m87178s0();
                }
                AbstractC28683x.m87239G(r15, c0209i3, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(r15, c0209i4, interfaceC28653p1M87165m4);
                if (r15.f115903S || !AbstractC22676k.m65745e(r15.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i5);
                }
                AbstractC28683x.m87239G(r15, c0209i6, modifierM118962N4);
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f13), C2299e.f9107J, r15, 6);
                iHashCode4 = Long.hashCode(r15.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = r15.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(r15, c2314t);
                r15.m87158i0();
                if (r15.f115903S) {
                    r15.m87163l(c0213j);
                } else {
                    r15.m87178s0();
                }
                AbstractC28683x.m87239G(r15, c0209i3, c22994r1M66759a2);
                AbstractC28683x.m87239G(r15, c0209i4, interfaceC28653p1M87165m5);
                if (r15.f115903S || !AbstractC22676k.m65745e(r15.m87133R(), Integer.valueOf(iHashCode4))) {
                    AbstractC11266d.m30471y(iHashCode4, r15, iHashCode4, c0209i5);
                }
                AbstractC28683x.m87239G(r15, c0209i6, modifierM118962N5);
                if (itemState.getLeftIcon() != null || ((Number) interfaceC28601c2.getValue()).floatValue() <= 20.0f) {
                    r15.m87150e0(-84217939);
                    r15.m87173q(r16);
                    r17 = r15;
                } else {
                    r15.m87150e0(-84529303);
                    ?? r33 = r15;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(itemState.getLeftIcon().toWhoopIcon(), r15, 6), null, null, EnumC39333f.BRAND_WHITE.mo134584toComposableColorWaAFU9c(r15, 6), r33, 48, 4);
                    ?? r112 = r33;
                    r112.m87173q(r16);
                    r17 = r112;
                }
                if (itemState.getLeftLabelDisplay() != null || ((Number) interfaceC28601c2.getValue()).floatValue() <= 20.0f) {
                    r17.m87150e0(-83919347);
                    r17.m87173q(r16);
                    r18 = r17;
                } else {
                    r17.m87150e0(-84066101);
                    ?? r34 = r17;
                    AbstractC30795n.m94707h(itemState.getLeftLabelDisplay(), null, EnumC39333f.WHITE_50.mo134584toComposableColorWaAFU9c(r17, 6), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(r17, 6).getB2(), null, r34, 0, 0, 196602);
                    ?? r113 = r34;
                    r113.m87173q(r16);
                    r18 = r113;
                }
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC22953f.m66715b(r18, new LayoutWeightElement(1.0f, z13));
                if (itemState.getRightLabelDisplay() != null || ((Number) interfaceC28601c2.getValue()).floatValue() >= itemState.m13587j().size() - 20) {
                    r18.m87150e0(-83537427);
                    r18.m87173q(r16);
                    r19 = r18;
                } else {
                    r18.m87150e0(-83685142);
                    ?? r35 = r18;
                    AbstractC30795n.m94707h(itemState.getRightLabelDisplay(), null, EnumC39333f.WHITE_50.mo134584toComposableColorWaAFU9c(r18, 6), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(r18, 6).getB2(), null, r35, 0, 0, 196602);
                    ?? r114 = r35;
                    r114.m87173q(r16);
                    r19 = r114;
                }
                if (itemState.getRightIcon() != null || ((Number) interfaceC28601c2.getValue()).floatValue() >= itemState.m13587j().size() - 20) {
                    r19.m87150e0(-83094003);
                    r19.m87173q(r16);
                    r110 = r19;
                } else {
                    r19.m87150e0(-83389991);
                    ?? r36 = r19;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(itemState.getRightIcon().toWhoopIcon(), r19, 6), null, null, C38072d.f163053a.m121949b(r19, 6).getBrandWhite(), r36, 48, 4);
                    ?? r115 = r36;
                    r115.m87173q(r16);
                    r110 = r115;
                }
                r110.m87173q(z13);
                Modifier modifierM13570n = m13570n(c2314t, f17447c, ((Number) interfaceC28601c2.getValue()).floatValue(), f17445a, f17446b, itemState.m13587j().size(), r110, 27702);
                c4305e = (C4305e) AbstractC25265s.m74102I0((int) ((Number) interfaceC28601c2.getValue()).floatValue(), itemState.m13587j());
                if (c4305e != null || (strM13578c = c4305e.getTopValueDisplay()) == null) {
                    strM13578c = "";
                }
                ?? r37 = r110;
                AbstractC30795n.m94707h(strM13578c, modifierM13570n, EnumC39333f.BRAND_WHITE.mo134584toComposableColorWaAFU9c(r110, 6), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(r110, 6).getN55(), null, r37, 0, 0, 196600);
                r111 = r37;
                r111.m87173q(z13);
                Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, c2314t);
                C2307m c2307m2 = C2299e.f9117z;
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m2, r16);
                iHashCode5 = Long.hashCode(r111.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = r111.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(r111, modifierM3409f5);
                r111.m87158i0();
                if (r111.f115903S) {
                    r111.m87163l(c0213j);
                } else {
                    r111.m87178s0();
                }
                AbstractC28683x.m87239G(r111, c0209i3, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(r111, c0209i4, interfaceC28653p1M87165m6);
                if (r111.f115903S || !AbstractC22676k.m65745e(r111.m87133R(), Integer.valueOf(iHashCode5))) {
                    AbstractC11266d.m30471y(iHashCode5, r111, iHashCode5, c0209i5);
                }
                AbstractC28683x.m87239G(r111, c0209i6, modifierM118962N6);
                Modifier modifierM3411h = AbstractC1102d.m3411h(32, AbstractC1102d.m3409f(1.0f, c2314t));
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m2, r16);
                iHashCode6 = Long.hashCode(r111.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = r111.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(r111, modifierM3411h);
                r111.m87158i0();
                if (r111.f115903S) {
                    r111.m87163l(c0213j);
                } else {
                    r111.m87178s0();
                }
                AbstractC28683x.m87239G(r111, c0209i3, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(r111, c0209i4, interfaceC28653p1M87165m7);
                if (r111.f115903S || !AbstractC22676k.m65745e(r111.m87133R(), Integer.valueOf(iHashCode6))) {
                    AbstractC11266d.m30471y(iHashCode6, r111, iHashCode6, c0209i5);
                }
                AbstractC28683x.m87239G(r111, c0209i6, modifierM118962N7);
                r111.m87150e0(2111562359);
                r24 = r16;
                for (Object obj2 : itemState.m13587j()) {
                    i17 = r24 + 1;
                    if (r24 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    C2314t c2314t3 = c2314t;
                    m13567k(m13570n(c2314t3, f17447c, (float) r24, f17445a, f17446b, itemState.m13587j().size(), r111, 27702), ((C17919x) ((InterfaceC28601c1) list.get(r24)).getValue()).f69639a, r111, r16);
                    r24 = i17;
                    c2314t = c2314t3;
                }
                C2314t c2314t4 = c2314t;
                r111.m87173q(r16);
                r111.m87173q(z13);
                Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, c2314t4);
                InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, r16);
                iHashCode7 = Long.hashCode(r111.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = r111.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(r111, modifierM3409f6);
                InterfaceC0221l.f734a.getClass();
                c0213j2 = C0217k.f724b;
                r111.m87158i0();
                if (r111.f115903S) {
                    r111.m87163l(c0213j2);
                } else {
                    r111.m87178s0();
                }
                AbstractC28683x.m87239G(r111, C0217k.f729g, interfaceC39127r0M66763d4);
                AbstractC28683x.m87239G(r111, C0217k.f728f, interfaceC28653p1M87165m8);
                c0209i2 = C0217k.f732j;
                if (r111.f115903S || !AbstractC22676k.m65745e(r111.m87133R(), Integer.valueOf(iHashCode7))) {
                    AbstractC11266d.m30471y(iHashCode7, r111, iHashCode7, c0209i2);
                }
                AbstractC28683x.m87239G(r111, C0217k.f726d, modifierM118962N8);
                c4305e2 = (C4305e) AbstractC25265s.m74102I0((int) ((Number) interfaceC28601c2.getValue()).floatValue(), itemState.m13587j());
                if (c4305e2 != null || (strM13578c2 = c4305e2.getTopValueDisplay()) == null) {
                    str = "";
                } else {
                    str = strM13578c2;
                }
                ?? r25 = c22408t4;
                m13563g(c2314t4, str, ((Number) interfaceC28601c2.getValue()).floatValue(), itemState.m13587j().size(), r25.m64518f("CURRENT_VALUE", r16).mo134584toComposableColorWaAFU9c(r111, r16), r111, 6);
                r111.m87173q(z13);
                r111.m87173q(z13);
                m13561e(itemState, r111, (i16 >> 3) & 14);
                r111.m87173q(z13);
                r111.m87173q(z13);
                modifier3 = modifier4;
                r10 = r25;
                r14 = r111;
            }
            AbstractC11266d.m30471y(iHashCode8, c28655q2, iHashCode8, c0209i5);
            c0209i = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i, modifierM118962N);
            if (itemState.getTitleDisplay() == null) {
                c28655q2.m87150e0(538321689);
                Modifier modifierM3409f7 = AbstractC1102d.m3409f(1.0f, c2314t2);
                C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q2, 48);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q2.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q2, modifierM3409f7);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j3);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i3, c22994r1M66759a3);
                AbstractC28683x.m87239G(c28655q2, c0209i4, interfaceC28653p1M87165m9);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i5);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, modifierM118962N9);
                if (itemState.getTitleDisplay() == null) {
                    c28655q2.m87150e0(-1494117923);
                    z4 = false;
                    c28655q2.m87173q(false);
                    c2305k = c2305k2;
                    c0213j = c0213j3;
                    modifier4 = modifier5;
                    i16 = i25;
                    c2314t = c2314t2;
                    z13 = true;
                    c28655q = c28655q2;
                } else {
                    z4 = false;
                    c28655q2.m87150e0(-1494117922);
                    i16 = i25;
                    z13 = true;
                    c0213j = c0213j3;
                    c2314t = c2314t2;
                    modifier4 = modifier5;
                    c2305k = c2305k2;
                    AbstractC30795n.m94707h(itemState.getTitleDisplay(), null, EnumC39333f.BRAND_WHITE.mo134584toComposableColorWaAFU9c(c28655q2, 6), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q2, 6).getSh4(), null, c28655q2, 0, 0, 196602);
                    C28655q c28655q4 = c28655q2;
                    c28655q4.m87173q(false);
                    c28655q = c28655q4;
                }
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(1.0f, z13));
                c17731c2M13589l = itemState.getTrend();
                if (c17731c2M13589l == null) {
                    c28655q.m87150e0(-1493858794);
                    c28655q.m87173q(z4);
                } else {
                    c28655q.m87150e0(-1493858793);
                    AbstractC17808z1.m51175c(c17731c2M13589l, c28655q, C9598e.f28134d);
                    c28655q.m87173q(z4);
                }
                c28655q.m87173q(z13);
                c28655q.m87173q(z4);
                r16 = z4;
                r15 = c28655q;
                c22408t4 = c22408t3;
            } else {
                c28655q2.m87150e0(538321689);
                Modifier modifierM3409f8 = AbstractC1102d.m3409f(1.0f, c2314t2);
                C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q2, 48);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q2.m87165m();
                Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q2, modifierM3409f8);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j3);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i3, c22994r1M66759a4);
                AbstractC28683x.m87239G(c28655q2, c0209i4, interfaceC28653p1M87165m10);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i5);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, modifierM118962N10);
                if (itemState.getTitleDisplay() == null) {
                    c28655q2.m87150e0(-1494117923);
                    z4 = false;
                    c28655q2.m87173q(false);
                    c2305k = c2305k2;
                    c0213j = c0213j3;
                    modifier4 = modifier5;
                    i16 = i25;
                    c2314t = c2314t2;
                    z13 = true;
                    c28655q = c28655q2;
                } else {
                    z4 = false;
                    c28655q2.m87150e0(-1494117922);
                    i16 = i25;
                    z13 = true;
                    c0213j = c0213j3;
                    c2314t = c2314t2;
                    modifier4 = modifier5;
                    c2305k = c2305k2;
                    AbstractC30795n.m94707h(itemState.getTitleDisplay(), null, EnumC39333f.BRAND_WHITE.mo134584toComposableColorWaAFU9c(c28655q2, 6), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q2, 6).getSh4(), null, c28655q2, 0, 0, 196602);
                    C28655q c28655q5 = c28655q2;
                    c28655q5.m87173q(false);
                    c28655q = c28655q5;
                }
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(1.0f, z13));
                c17731c2M13589l = itemState.getTrend();
                if (c17731c2M13589l == null) {
                    c28655q.m87150e0(-1493858794);
                    c28655q.m87173q(z4);
                } else {
                    c28655q.m87150e0(-1493858793);
                    AbstractC17808z1.m51175c(c17731c2M13589l, c28655q, C9598e.f28134d);
                    c28655q.m87173q(z4);
                }
                c28655q.m87173q(z13);
                c28655q.m87173q(z4);
                r16 = z4;
                r15 = c28655q;
                c22408t4 = c22408t3;
            }
            Modifier modifierM3409f9 = AbstractC1102d.m3409f(1.0f, c2314t);
            float f14 = 4;
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), c2305k, r15, 6);
            iHashCode2 = Long.hashCode(r15.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m11 = r15.m87165m();
            Modifier modifierM118962N11 = AbstractC37056f.m118962N(r15, modifierM3409f9);
            r15.m87158i0();
            if (r15.f115903S) {
                r15.m87163l(c0213j);
            } else {
                r15.m87178s0();
            }
            AbstractC28683x.m87239G(r15, c0209i3, c23010xM66775a3);
            AbstractC28683x.m87239G(r15, c0209i4, interfaceC28653p1M87165m11);
            if (r15.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i5);
            } else {
                AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i5);
            }
            C0209i c0209i7 = c0209i;
            AbstractC28683x.m87239G(r15, c0209i7, modifierM118962N11);
            C2307m c2307m3 = C2299e.f9104G;
            Modifier modifierM3409f10 = AbstractC1102d.m3409f(1.0f, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(c2307m3, r16);
            iHashCode3 = Long.hashCode(r15.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m12 = r15.m87165m();
            Modifier modifierM118962N12 = AbstractC37056f.m118962N(r15, modifierM3409f10);
            r15.m87158i0();
            if (r15.f115903S) {
                r15.m87163l(c0213j);
            } else {
                r15.m87178s0();
            }
            AbstractC28683x.m87239G(r15, c0209i3, interfaceC39127r0M66763d5);
            AbstractC28683x.m87239G(r15, c0209i4, interfaceC28653p1M87165m12);
            if (r15.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i5);
            } else {
                AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i5);
            }
            AbstractC28683x.m87239G(r15, c0209i7, modifierM118962N12);
            C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f14), C2299e.f9107J, r15, 6);
            iHashCode4 = Long.hashCode(r15.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m13 = r15.m87165m();
            Modifier modifierM118962N13 = AbstractC37056f.m118962N(r15, c2314t);
            r15.m87158i0();
            if (r15.f115903S) {
                r15.m87163l(c0213j);
            } else {
                r15.m87178s0();
            }
            AbstractC28683x.m87239G(r15, c0209i3, c22994r1M66759a5);
            AbstractC28683x.m87239G(r15, c0209i4, interfaceC28653p1M87165m13);
            if (r15.f115903S) {
                AbstractC11266d.m30471y(iHashCode4, r15, iHashCode4, c0209i5);
            } else {
                AbstractC11266d.m30471y(iHashCode4, r15, iHashCode4, c0209i5);
            }
            AbstractC28683x.m87239G(r15, c0209i7, modifierM118962N13);
            if (itemState.getLeftIcon() != null) {
                r15.m87150e0(-84217939);
                r15.m87173q(r16);
                r17 = r15;
            } else {
                r15.m87150e0(-84217939);
                r15.m87173q(r16);
                r17 = r15;
            }
            if (itemState.getLeftLabelDisplay() != null) {
                r17.m87150e0(-83919347);
                r17.m87173q(r16);
                r18 = r17;
            } else {
                r17.m87150e0(-83919347);
                r17.m87173q(r16);
                r18 = r17;
            }
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC22953f.m66715b(r18, new LayoutWeightElement(1.0f, z13));
            if (itemState.getRightLabelDisplay() != null) {
                r18.m87150e0(-83537427);
                r18.m87173q(r16);
                r19 = r18;
            } else {
                r18.m87150e0(-83537427);
                r18.m87173q(r16);
                r19 = r18;
            }
            if (itemState.getRightIcon() != null) {
                r19.m87150e0(-83094003);
                r19.m87173q(r16);
                r110 = r19;
            } else {
                r19.m87150e0(-83094003);
                r19.m87173q(r16);
                r110 = r19;
            }
            r110.m87173q(z13);
            Modifier modifierM13570n2 = m13570n(c2314t, f17447c, ((Number) interfaceC28601c2.getValue()).floatValue(), f17445a, f17446b, itemState.m13587j().size(), r110, 27702);
            c4305e = (C4305e) AbstractC25265s.m74102I0((int) ((Number) interfaceC28601c2.getValue()).floatValue(), itemState.m13587j());
            if (c4305e != null) {
                strM13578c = "";
            } else {
                strM13578c = "";
            }
            ?? r38 = r110;
            AbstractC30795n.m94707h(strM13578c, modifierM13570n2, EnumC39333f.BRAND_WHITE.mo134584toComposableColorWaAFU9c(r110, 6), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(r110, 6).getN55(), null, r38, 0, 0, 196600);
            r111 = r38;
            r111.m87173q(z13);
            Modifier modifierM3409f11 = AbstractC1102d.m3409f(1.0f, c2314t);
            C2307m c2307m4 = C2299e.f9117z;
            InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(c2307m4, r16);
            iHashCode5 = Long.hashCode(r111.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m14 = r111.m87165m();
            Modifier modifierM118962N14 = AbstractC37056f.m118962N(r111, modifierM3409f11);
            r111.m87158i0();
            if (r111.f115903S) {
                r111.m87163l(c0213j);
            } else {
                r111.m87178s0();
            }
            AbstractC28683x.m87239G(r111, c0209i3, interfaceC39127r0M66763d6);
            AbstractC28683x.m87239G(r111, c0209i4, interfaceC28653p1M87165m14);
            if (r111.f115903S) {
                AbstractC11266d.m30471y(iHashCode5, r111, iHashCode5, c0209i5);
            } else {
                AbstractC11266d.m30471y(iHashCode5, r111, iHashCode5, c0209i5);
            }
            AbstractC28683x.m87239G(r111, c0209i7, modifierM118962N14);
            Modifier modifierM3411h2 = AbstractC1102d.m3411h(32, AbstractC1102d.m3409f(1.0f, c2314t));
            InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(c2307m4, r16);
            iHashCode6 = Long.hashCode(r111.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m15 = r111.m87165m();
            Modifier modifierM118962N15 = AbstractC37056f.m118962N(r111, modifierM3411h2);
            r111.m87158i0();
            if (r111.f115903S) {
                r111.m87163l(c0213j);
            } else {
                r111.m87178s0();
            }
            AbstractC28683x.m87239G(r111, c0209i3, interfaceC39127r0M66763d7);
            AbstractC28683x.m87239G(r111, c0209i4, interfaceC28653p1M87165m15);
            if (r111.f115903S) {
                AbstractC11266d.m30471y(iHashCode6, r111, iHashCode6, c0209i5);
            } else {
                AbstractC11266d.m30471y(iHashCode6, r111, iHashCode6, c0209i5);
            }
            AbstractC28683x.m87239G(r111, c0209i7, modifierM118962N15);
            r111.m87150e0(2111562359);
            r24 = r16;
            while (r1.hasNext()) {
                i17 = r24 + 1;
                if (r24 >= 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                C2314t c2314t5 = c2314t;
                m13567k(m13570n(c2314t5, f17447c, (float) r24, f17445a, f17446b, itemState.m13587j().size(), r111, 27702), ((C17919x) ((InterfaceC28601c1) list.get(r24)).getValue()).f69639a, r111, r16);
                r24 = i17;
                c2314t = c2314t5;
            }
            C2314t c2314t6 = c2314t;
            r111.m87173q(r16);
            r111.m87173q(z13);
            Modifier modifierM3409f12 = AbstractC1102d.m3409f(1.0f, c2314t6);
            InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(C2299e.f9114w, r16);
            iHashCode7 = Long.hashCode(r111.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m16 = r111.m87165m();
            Modifier modifierM118962N16 = AbstractC37056f.m118962N(r111, modifierM3409f12);
            InterfaceC0221l.f734a.getClass();
            c0213j2 = C0217k.f724b;
            r111.m87158i0();
            if (r111.f115903S) {
                r111.m87163l(c0213j2);
            } else {
                r111.m87178s0();
            }
            AbstractC28683x.m87239G(r111, C0217k.f729g, interfaceC39127r0M66763d8);
            AbstractC28683x.m87239G(r111, C0217k.f728f, interfaceC28653p1M87165m16);
            c0209i2 = C0217k.f732j;
            if (r111.f115903S) {
                AbstractC11266d.m30471y(iHashCode7, r111, iHashCode7, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode7, r111, iHashCode7, c0209i2);
            }
            AbstractC28683x.m87239G(r111, C0217k.f726d, modifierM118962N16);
            c4305e2 = (C4305e) AbstractC25265s.m74102I0((int) ((Number) interfaceC28601c2.getValue()).floatValue(), itemState.m13587j());
            if (c4305e2 != null) {
                str = "";
            } else {
                str = "";
            }
            ?? r26 = c22408t4;
            m13563g(c2314t6, str, ((Number) interfaceC28601c2.getValue()).floatValue(), itemState.m13587j().size(), r26.m64518f("CURRENT_VALUE", r16).mo134584toComposableColorWaAFU9c(r111, r16), r111, 6);
            r111.m87173q(z13);
            r111.m87173q(z13);
            m13561e(itemState, r111, (i16 >> 3) & 14);
            r111.m87173q(z13);
            r111.m87173q(z13);
            modifier3 = modifier4;
            r10 = r26;
            r14 = r111;
        } else {
            c28655q2.m87138X();
            modifier3 = modifier2;
            r10 = c22408t2;
            r14 = c28655q2;
        }
        ?? r27 = r10;
        C28677v1 c28677v1M87180u = r14.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4007d1(modifier3, itemState, (Object) r27, i13, i14, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m13566j(Modifier modifier, C4307g c4307g, C22408t c22408t, int i13, int i14, Composer composer, int i15) {
        m13565i(modifier, c4307g, c22408t, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    private static final void m13567k(Modifier modifier, long j7, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-336252024);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87151f(j7) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            float f13 = 4;
            AbstractC22989q.m66760a(AbstractC31061c.m95629e(AbstractC1102d.m3411h(24, AbstractC1102d.m3424u(f17445a, modifier)), f13, f13, j7), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3657r(i13, 1, j7, modifier);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m13568l(Modifier modifier, long j7, int i13, Composer composer, int i14) {
        m13567k(modifier, j7, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    private static final Modifier m13570n(Modifier modifier, float f13, float f14, float f15, float f16, int i13, Composer composer, int i14) {
        return AbstractC29011e.m88150k(modifier, (0.5f + f14) / i13, 0.0f, C29007a.m88130f(C29007a.INSTANCE.m88137b(), 0.0f, 0.0f, true, false, 11, null), 2, null);
    }

    /* JADX INFO: renamed from: o */
    private static final Modifier m13571o(Modifier modifier, float f13, int i13, float f14, float f15, int i14, Composer composer, int i15) {
        return m13570n(modifier, f13, i13, f14, f15, i14, composer, i15 & 523390);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0079  */
    /* JADX WARN: Code duplicated, block: B:23:0x007b  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:32:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0077 -> B:31:0x00cb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00b9 -> B:30:0x00c2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: p */
    public static final java.lang.Object m13572p(p390p1.InterfaceC28601c1 r11, c81.C4307g r12, java.util.List<? extends p390p1.InterfaceC28601c1> r13, kd1.C22408t r14, q83.InterfaceC30057d<? super l83.C23454a0> r15) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c81.AbstractC4304d.m13572p(p1.c1, c81.g, java.util.List, kd1.t, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final long m13573q(C18282h c18282h, int i13, C4305e c4305e, C22408t c22408t) {
        if (!AbstractC25265s.m74155w0(c18282h, Integer.valueOf(i13))) {
            return c22408t.m64518f(c4305e.getStyle(), true).getColor();
        }
        return AbstractC17918w0.m51515c(c22408t.m64517e(AbstractC17918w0.m51506H(c22408t.m64518f("HIGHLIGHT", false).getColor()), AbstractC17918w0.m51506H(c22408t.m64518f("CURRENT_VALUE", false).getColor()), c22408t.m64516d(c18282h, i13)));
    }
}
