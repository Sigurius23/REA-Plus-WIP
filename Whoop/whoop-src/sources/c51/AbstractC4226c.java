package c51;

import a81.C0555f;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import aq1.C1910d;
import b91.C2886a;
import b91.EnumC2888c;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import c13.AbstractC3855a;
import c93.InterfaceC4351m;
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
import p027b3.AbstractC2453v1;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC22974l;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p635y2.InterfaceC39127r0;
import p636y3.C39174f;
import p636y3.C39183o;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22661c0;
import p715kotlin.jvm.internal.C22667f0;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import q63.AbstractC30007c;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import v63.AbstractC35745c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: c51.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a1\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\b\u0010\t\u001aE\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00070\u000e2\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u001d²\u0006\u000e\u0010\u0013\u001a\u00020\f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0014\u001a\u00020\f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0015\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0017\u001a\u00020\u00168\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0019\u001a\u00020\u00188\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001a\u001a\u00020\u00188\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001b\u001a\u00020\u00188\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001c\u001a\u00020\u00188\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lc51/s;", "viewState", "Landroidx/compose/ui/Modifier;", "modifier", "subtitleModifier", "Lc51/v;", "frameMillisProvider", "Ll83/a0;", "g", "(Lc51/s;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc51/v;Landroidx/compose/runtime/Composer;II)V", "Lc51/p;", "forTransitionType", "", "transitionAnimationDuration", "Lkotlin/Function1;", "", "onAnimationProgress", "C", "(Lc51/s;Lc51/p;FLkotlin/jvm/functions/Function1;Lc51/v;Landroidx/compose/runtime/Composer;II)V", "alphaAnimation", "nonYearsDifferenceTextAlpha", "yearsDifferenceTextSizeMultiplier", "Ly3/f;", "yearsDifferenceSpacerHeight", "", "ageValueDisplay", "ageTitleDisplay", "ageSubtitleDisplay", "ageSubtitleValueDisplay", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4226c {

    /* JADX INFO: renamed from: c51.c$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.amoeba.presentation.AmoebaAgeTextKt$AmoebaAgeText$5$1", m100430f = "AmoebaAgeText.kt", m100431l = {78}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f17121E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28601c1 f17122F;

        /* JADX INFO: renamed from: w */
        int f17123w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C4242s f17124x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f17125y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f17126z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C4242s c4242s, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28601c1 interfaceC28601c4, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f17124x = c4242s;
            this.f17125y = interfaceC28601c1;
            this.f17126z = interfaceC28601c2;
            this.f17121E = interfaceC28601c3;
            this.f17122F = interfaceC28601c4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f17124x, this.f17125y, this.f17126z, this.f17121E, this.f17122F, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f17123w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C4241r c4241rM13248p = this.f17124x.getTransition();
                if ((c4241rM13248p != null ? c4241rM13248p.getType() : null) == EnumC4239p.PULSE_YEARS_DIFFERENCE) {
                    long jM13230a = this.f17124x.getTransition().getEaseInDuration();
                    this.f17123w = 1;
                    if (AbstractC3034m0.m8783c(jM13230a, this) == enumC31071a) {
                        return enumC31071a;
                    }
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            AbstractC4226c.m13106p(this.f17125y, this.f17124x.getText().getAgeValueDisplay());
            AbstractC4226c.m13109s(this.f17126z, this.f17124x.getText().getAgeTitleDisplay());
            AbstractC4226c.m13111u(this.f17121E, this.f17124x.getText().getAgeSubtitleDisplay());
            AbstractC4226c.m13113w(this.f17122F, this.f17124x.getText().getAgeSubtitleValueDisplay());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: c51.c$b */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.amoeba.presentation.AmoebaAgeTextKt$AnimateOverTimeEffect$1$1", m100430f = "AmoebaAgeText.kt", m100431l = {153}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ EnumC4239p f17127E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ float f17128F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC4245v f17129G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ Function1 f17130H;

        /* JADX INFO: renamed from: w */
        Object f17131w;

        /* JADX INFO: renamed from: x */
        Object f17132x;

        /* JADX INFO: renamed from: y */
        int f17133y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C4242s f17134z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C4242s c4242s, EnumC4239p enumC4239p, float f13, InterfaceC4245v interfaceC4245v, Function1 function1, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f17134z = c4242s;
            this.f17127E = enumC4239p;
            this.f17128F = f13;
            this.f17129G = interfaceC4245v;
            this.f17130H = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final C23454a0 m13118h(C22667f0 c22667f0, C22661c0 c22661c0, float f13, Function1 function1, long j7) {
            if (c22667f0.f89335w == -1) {
                c22667f0.f89335w = j7;
            }
            Duration.Companion companion = Duration.INSTANCE;
            double dM134298toDoubleimpl = Duration.m134298toDoubleimpl(DurationKt.toDuration(j7 - c22667f0.f89335w, DurationUnit.MILLISECONDS), DurationUnit.SECONDS);
            c22661c0.f89330w = dM134298toDoubleimpl;
            function1.invoke(Double.valueOf(dM134298toDoubleimpl / ((double) f13)));
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f17134z, this.f17127E, this.f17128F, this.f17129G, this.f17130H, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C22661c0 c22661c0;
            C22667f0 c22667f0;
            InterfaceC4245v interfaceC4245v;
            C4227d c4227d;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f17133y;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C4241r c4241rM13248p = this.f17134z.getTransition();
                if ((c4241rM13248p != null ? c4241rM13248p.getType() : null) == this.f17127E) {
                    C22667f0 c22667f1 = new C22667f0();
                    c22667f1.f89335w = -1L;
                    c22661c0 = new C22661c0();
                    c22661c0.f89330w = -1.0d;
                    c22667f0 = c22667f1;
                }
                return C23454a0.f92919a;
            }
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c22661c0 = (C22661c0) this.f17132x;
            c22667f0 = (C22667f0) this.f17131w;
            AbstractC34132o.m107864I(obj);
            do {
                double d3 = c22661c0.f89330w;
                float f13 = this.f17128F;
                if (d3 >= f13) {
                    return C23454a0.f92919a;
                }
                interfaceC4245v = this.f17129G;
                c4227d = new C4227d(c22667f0, c22661c0, f13, this.f17130H);
                this.f17131w = c22667f0;
                this.f17132x = c22661c0;
                this.f17133y = 1;
            } while (interfaceC4245v.mo13082a(c4227d, this) != enumC31071a);
            return enumC31071a;
        }
    }

    /* JADX INFO: renamed from: A */
    private static final double m13083A(InterfaceC28601c1 interfaceC28601c1) {
        return ((Number) interfaceC28601c1.getValue()).doubleValue();
    }

    /* JADX INFO: renamed from: B */
    private static final void m13084B(InterfaceC28601c1 interfaceC28601c1, double d3) {
        interfaceC28601c1.setValue(Double.valueOf(d3));
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008c  */
    /* JADX INFO: renamed from: C */
    public static final void m13085C(C4242s viewState, EnumC4239p forTransitionType, float f13, Function1 onAnimationProgress, InterfaceC4245v interfaceC4245v, Composer composer, int i13, int i14) {
        int i15;
        float f14;
        InterfaceC4245v interfaceC4245v2;
        InterfaceC4245v interfaceC4245v3;
        int i16;
        InterfaceC4245v c4223a0 = interfaceC4245v;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(forTransitionType, "forTransitionType");
        AbstractC22676k.m65750j(onAnimationProgress, "onAnimationProgress");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-838031734);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87149e(forTransitionType.ordinal()) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            f14 = f13;
            i15 |= c28655q.m87147d(f14) ? 256 : 128;
        } else {
            f14 = f13;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87157i(onAnimationProgress) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            if ((i14 & 16) != 0) {
                i16 = DfuBaseService.ERROR_REMOTE_MASK;
            } else {
                if ((32768 & i13) == 0 ? c28655q.m87153g(c4223a0) : c28655q.m87157i(c4223a0)) {
                    i16 = 16384;
                } else {
                    i16 = DfuBaseService.ERROR_REMOTE_MASK;
                }
            }
            i15 |= i16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 9363) != 9362)) {
            c28655q.m87140Z();
            if ((i13 & 1) != 0 && !c28655q.m87118C()) {
                c28655q.m87138X();
                if ((i14 & 16) != 0) {
                    i15 &= -57345;
                }
            } else if ((i14 & 16) != 0) {
                c4223a0 = new C4223a0();
                i15 &= -57345;
            }
            c28655q.m87175r();
            C4238o c4238oM13247o = viewState.getText();
            String strM13220f = c4238oM13247o != null ? c4238oM13247o.getAgeValueDisplay() : null;
            C4238o c4238oM13247o2 = viewState.getText();
            String strM13217c = c4238oM13247o2 != null ? c4238oM13247o2.getAgeSubtitleDisplay() : null;
            boolean zM87157i = c28655q.m87157i(viewState) | ((i15 & 112) == 32) | ((i15 & 896) == 256) | ((((57344 & i15) ^ 24576) > 16384 && c28655q.m87157i(c4223a0)) || (i15 & 24576) == 16384) | ((i15 & 7168) == 2048);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                interfaceC4245v3 = c4223a0;
                b bVar = new b(viewState, forTransitionType, f14, interfaceC4245v3, onAnimationProgress, null);
                c28655q.m87172p0(bVar);
                objM87133R = bVar;
            } else {
                interfaceC4245v3 = c4223a0;
            }
            AbstractC28683x.m87254h(strM13220f, strM13217c, (InterfaceC4351m) objM87133R, c28655q);
            interfaceC4245v2 = interfaceC4245v3;
        } else {
            c28655q.m87138X();
            interfaceC4245v2 = c4223a0;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4224b(viewState, forTransitionType, f13, onAnimationProgress, interfaceC4245v2, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m13086D(C4242s c4242s, EnumC4239p enumC4239p, float f13, Function1 function1, InterfaceC4245v interfaceC4245v, int i13, int i14, Composer composer, int i15) {
        m13085C(c4242s, enumC4239p, f13, function1, interfaceC4245v, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0275  */
    /* JADX WARN: Code duplicated, block: B:117:0x027a  */
    /* JADX WARN: Code duplicated, block: B:120:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:122:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:127:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:130:0x0360  */
    /* JADX WARN: Code duplicated, block: B:131:0x036c  */
    /* JADX WARN: Code duplicated, block: B:134:0x0384  */
    /* JADX WARN: Code duplicated, block: B:136:0x0398  */
    /* JADX WARN: Code duplicated, block: B:139:0x0406  */
    /* JADX WARN: Code duplicated, block: B:141:0x040c  */
    /* JADX WARN: Code duplicated, block: B:146:0x0428  */
    /* JADX WARN: Code duplicated, block: B:149:0x043a  */
    /* JADX WARN: Code duplicated, block: B:150:0x0448  */
    /* JADX WARN: Code duplicated, block: B:153:0x0471  */
    /* JADX WARN: Code duplicated, block: B:154:0x0475  */
    /* JADX WARN: Code duplicated, block: B:159:0x0490  */
    /* JADX WARN: Code duplicated, block: B:162:0x0592  */
    /* JADX WARN: Code duplicated, block: B:164:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:34:0x0073  */
    /* JADX INFO: renamed from: g */
    public static final void m13097g(C4242s viewState, Modifier modifier, Modifier subtitleModifier, InterfaceC4245v interfaceC4245v, Composer composer, int i13, int i14) {
        int i15;
        C28655q c28655q;
        InterfaceC4245v interfaceC4245v2;
        InterfaceC28601c1 interfaceC28601c1;
        InterfaceC28601c1 interfaceC28601c2;
        InterfaceC22974l interfaceC22974lM66746i;
        C2314t c2314t;
        int iHashCode;
        C38072d c38072d;
        boolean z4;
        C2886a c2886aM8413K;
        int iHashCode2;
        float f13;
        int iHashCode3;
        boolean z13;
        int i16;
        InterfaceC4245v c4223a0 = interfaceC4245v;
        Float fValueOf = Float.valueOf(1.0f);
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(subtitleModifier, "subtitleModifier");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(413121859);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87153g(modifier) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87153g(subtitleModifier) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            if ((i14 & 8) != 0) {
                i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            } else {
                if ((i13 & 4096) == 0 ? c28655q2.m87153g(c4223a0) : c28655q2.m87157i(c4223a0)) {
                    i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
            }
            i15 |= i16;
        }
        if (c28655q2.m87135U(i15 & 1, (i15 & 1171) != 1170)) {
            c28655q2.m87140Z();
            if ((i13 & 1) != 0 && !c28655q2.m87118C()) {
                c28655q2.m87138X();
                if ((i14 & 8) != 0) {
                    i15 &= -7169;
                }
            } else if ((i14 & 8) != 0) {
                c4223a0 = new C4223a0();
                i15 &= -7169;
            }
            InterfaceC4245v interfaceC4245v3 = c4223a0;
            int i17 = i15;
            c28655q2.m87175r();
            float f14 = 90;
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC3855a.m11831o(0.0f, c28655q2);
            }
            InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) objM87133R;
            Object objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(fValueOf);
                c28655q2.m87172p0(objM87133R2);
            }
            InterfaceC28601c1 interfaceC28601c4 = (InterfaceC28601c1) objM87133R2;
            Object objM87133R3 = c28655q2.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87272z(Double.valueOf(1.0d));
                c28655q2.m87172p0(objM87133R3);
            }
            InterfaceC28601c1 interfaceC28601c5 = (InterfaceC28601c1) objM87133R3;
            Object objM87133R4 = c28655q2.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = AbstractC28683x.m87272z(new C39174f(f14));
                c28655q2.m87172p0(objM87133R4);
            }
            InterfaceC28601c1 interfaceC28601c6 = (InterfaceC28601c1) objM87133R4;
            EnumC4239p enumC4239p = EnumC4239p.PULSE_YEARS_DIFFERENCE;
            Object objM87133R5 = c28655q2.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = new C1910d(8, interfaceC28601c4);
                c28655q2.m87172p0(objM87133R5);
            }
            int i18 = (i17 & 14) | 3504 | ((i17 << 3) & 57344);
            m13085C(viewState, enumC4239p, 3.0f, (Function1) objM87133R5, interfaceC4245v3, c28655q2, i18, 0);
            Object objM87133R6 = c28655q2.m87133R();
            if (objM87133R6 == c28676v0) {
                objM87133R6 = new C1910d(9, interfaceC28601c5);
                c28655q2.m87172p0(objM87133R6);
            }
            m13085C(viewState, enumC4239p, 3.0f, (Function1) objM87133R6, interfaceC4245v3, c28655q2, i18, 0);
            Object objM87133R7 = c28655q2.m87133R();
            if (objM87133R7 == c28676v0) {
                objM87133R7 = new C4222a(f14, interfaceC28601c6, 0);
                c28655q2.m87172p0(objM87133R7);
            }
            m13085C(viewState, enumC4239p, 3.0f, (Function1) objM87133R7, interfaceC4245v3, c28655q2, i18, 0);
            m13107q(interfaceC28601c3, 1.0f);
            EnumC4239p enumC4239p2 = EnumC4239p.FADE_IN;
            Object objM87133R8 = c28655q2.m87133R();
            if (objM87133R8 == c28676v0) {
                objM87133R8 = new C1910d(10, interfaceC28601c3);
                c28655q2.m87172p0(objM87133R8);
            }
            m13085C(viewState, enumC4239p2, 1.5f, (Function1) objM87133R8, interfaceC4245v3, c28655q2, i18, 0);
            if (viewState.getTransition() == null || viewState.getTransition().getType() == enumC4239p) {
                m13107q(interfaceC28601c3, 1.0f);
            }
            if (viewState.getText() != null) {
                c28655q2.m87150e0(-2060618011);
                Object objM87133R9 = c28655q2.m87133R();
                if (objM87133R9 == c28676v0) {
                    objM87133R9 = AbstractC28683x.m87272z("");
                    c28655q2.m87172p0(objM87133R9);
                }
                InterfaceC28601c1 interfaceC28601c7 = (InterfaceC28601c1) objM87133R9;
                Object objM87133R10 = c28655q2.m87133R();
                if (objM87133R10 == c28676v0) {
                    objM87133R10 = AbstractC28683x.m87272z("");
                    c28655q2.m87172p0(objM87133R10);
                }
                InterfaceC28601c1 interfaceC28601c8 = (InterfaceC28601c1) objM87133R10;
                Object objM87133R11 = c28655q2.m87133R();
                if (objM87133R11 == c28676v0) {
                    objM87133R11 = AbstractC28683x.m87272z("");
                    c28655q2.m87172p0(objM87133R11);
                }
                InterfaceC28601c1 interfaceC28601c9 = (InterfaceC28601c1) objM87133R11;
                Object objM87133R12 = c28655q2.m87133R();
                if (objM87133R12 == c28676v0) {
                    objM87133R12 = AbstractC28683x.m87272z("");
                    c28655q2.m87172p0(objM87133R12);
                }
                InterfaceC28601c1 interfaceC28601c10 = (InterfaceC28601c1) objM87133R12;
                C4238o c4238oM13247o = viewState.getText();
                boolean zM87157i = c28655q2.m87157i(viewState);
                Object objM87133R13 = c28655q2.m87133R();
                if (zM87157i || objM87133R13 == c28676v0) {
                    interfaceC28601c1 = interfaceC28601c7;
                    a aVar = new a(viewState, interfaceC28601c1, interfaceC28601c8, interfaceC28601c9, interfaceC28601c10, null);
                    c28655q2.m87172p0(aVar);
                    objM87133R13 = aVar;
                } else {
                    interfaceC28601c1 = interfaceC28601c7;
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R13, c4238oM13247o);
                Modifier modifierM107879c = AbstractC34132o.m107879c(m13098h(interfaceC28601c3), modifier);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                InterfaceC28601c1 interfaceC28601c11 = interfaceC28601c1;
                int iHashCode4 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM107879c);
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
                if (c28655q2.f115903S) {
                    interfaceC28601c2 = interfaceC28601c9;
                } else {
                    interfaceC28601c2 = interfaceC28601c9;
                    if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode4))) {
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                    if (viewState.getText().getLargeTitleDisplay()) {
                        interfaceC22974lM66746i = AbstractC22977m.f90654e;
                    } else {
                        interfaceC22974lM66746i = AbstractC22977m.m66746i(1);
                    }
                    C2305k c2305k = C2299e.f9111N;
                    c2314t = C2314t.f9131w;
                    Modifier modifierM107879c2 = AbstractC34132o.m107879c(m13115y(interfaceC28601c4), AbstractC1102d.m3411h(f14, c2314t));
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(interfaceC22974lM66746i, c2305k, c28655q2, 48);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM107879c2);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                    String strM13105o = m13105o(interfaceC28601c11);
                    C2886a c2886aM8402a = EnumC2888c.INSTANCE.m8402a(viewState.getText().getLargeValueDisplayStyle());
                    c38072d = C38072d.f163053a;
                    AbstractC30795n.m94707h(strM13105o, c2314t, c38072d.m121949b(c28655q2, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 3, false, 1, 0, null, c2886aM8402a, fValueOf, c28655q2, 48, 12586032, 54776);
                    if (viewState.getText().getLargeTitleDisplay()) {
                        c28655q2.m87150e0(-504752127);
                        z4 = false;
                        AbstractC30007c.m91851u(c2314t, 6, c28655q2, false);
                    } else {
                        z4 = false;
                        c28655q2.m87150e0(-504675247);
                        c28655q2.m87173q(false);
                    }
                    String strM13108r = m13108r(interfaceC28601c8);
                    if (viewState.getText().getLargeTitleDisplay()) {
                        c28655q2.m87150e0(-293369389);
                        c2886aM8413K = c38072d.m121952e(c28655q2, 6).getH5();
                    } else {
                        c28655q2.m87150e0(-293368428);
                        c2886aM8413K = c38072d.m121952e(c28655q2, 6).getSh3();
                    }
                    c28655q2.m87173q(z4);
                    AbstractC30795n.m94707h(strM13108r, null, c38072d.m121949b(c28655q2, 6).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c2886aM8413K, fValueOf, c28655q2, 0, 12582912, 65018);
                    c28655q2.m87173q(true);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1), c2305k, c28655q2, 54);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, c2314t);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m3);
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N3);
                    f13 = 0;
                    if (Float.compare(m13099i(interfaceC28601c6), f13) > 0) {
                        c28655q2.m87150e0(295300339);
                        AbstractC30007c.m91851u(c2314t, m13099i(interfaceC28601c6), c28655q2, false);
                    } else {
                        c28655q2.m87150e0(295399322);
                        c28655q2.m87173q(false);
                    }
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9109L, c28655q2, 48);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, c2314t);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a);
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m4);
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N4);
                    String strM13112v = m13112v(interfaceC28601c10);
                    C2886a c2886aM8408F = c38072d.m121952e(c28655q2, 6).getN9();
                    long jMo134584toComposableColorWaAFU9c = viewState.getText().getSubtitleColor().mo134584toComposableColorWaAFU9c(c28655q2, 0);
                    float fM124805c = C39183o.m124805c(c38072d.m121952e(c28655q2, 6).getN7().getStyle().f92255a.f92192b);
                    C28674u2 c28674u2 = AbstractC2453v1.f9569h;
                    long jM95626b = AbstractC31061c.m95626b(fM124805c, 4294967296L, (InterfaceC39171c) c28655q2.m87161k(c28674u2));
                    double dM13083A = m13083A(interfaceC28601c5);
                    AbstractC35745c.m113242a(jM95626b);
                    int i19 = (i17 >> 3) & 112;
                    AbstractC30795n.m94707h(strM13112v, subtitleModifier, jMo134584toComposableColorWaAFU9c, AbstractC35745c.m113248j((float) (((double) C39183o.m124805c(jM95626b)) * dM13083A), jM95626b & 1095216660480L), null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c2886aM8408F, null, c28655q2, i19, 0, 196080);
                    String strM13110t = m13110t(interfaceC28601c2);
                    C2886a c2886aM8406D = c38072d.m121952e(c28655q2, 6).getN7();
                    long jMo134584toComposableColorWaAFU9c2 = viewState.getText().getSubtitleColor().mo134584toComposableColorWaAFU9c(c28655q2, 0);
                    long jM95626b2 = AbstractC31061c.m95626b(C39183o.m124805c(c38072d.m121952e(c28655q2, 6).getN7().getStyle().f92255a.f92192b), 4294967296L, (InterfaceC39171c) c28655q2.m87161k(c28674u2));
                    double dM13083A2 = m13083A(interfaceC28601c5);
                    AbstractC35745c.m113242a(jM95626b2);
                    AbstractC30795n.m94707h(strM13110t, subtitleModifier, jMo134584toComposableColorWaAFU9c2, AbstractC35745c.m113248j((float) (((double) C39183o.m124805c(jM95626b2)) * dM13083A2), jM95626b2 & 1095216660480L), null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c2886aM8406D, null, c28655q2, i19, 0, 196080);
                    c28655q = c28655q2;
                    c28655q.m87173q(true);
                    if (Float.compare(m13099i(interfaceC28601c6), f13) < 0) {
                        c28655q.m87150e0(296190194);
                        z13 = false;
                        AbstractC30007c.m91851u(c2314t, -m13099i(interfaceC28601c6), c28655q, false);
                    } else {
                        z13 = false;
                        c28655q.m87150e0(296290138);
                        c28655q.m87173q(false);
                    }
                    AbstractC25012a.m73392y(c28655q, true, true, z13);
                }
                AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i3);
                C0209i c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N);
                if (viewState.getText().getLargeTitleDisplay()) {
                    interfaceC22974lM66746i = AbstractC22977m.f90654e;
                } else {
                    interfaceC22974lM66746i = AbstractC22977m.m66746i(1);
                }
                C2305k c2305k2 = C2299e.f9111N;
                c2314t = C2314t.f9131w;
                Modifier modifierM107879c3 = AbstractC34132o.m107879c(m13115y(interfaceC28601c4), AbstractC1102d.m3411h(f14, c2314t));
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(interfaceC22974lM66746i, c2305k2, c28655q2, 48);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM107879c3);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m5);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N5);
                String strM13105o2 = m13105o(interfaceC28601c11);
                C2886a c2886aM8402a2 = EnumC2888c.INSTANCE.m8402a(viewState.getText().getLargeValueDisplayStyle());
                c38072d = C38072d.f163053a;
                AbstractC30795n.m94707h(strM13105o2, c2314t, c38072d.m121949b(c28655q2, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 3, false, 1, 0, null, c2886aM8402a2, fValueOf, c28655q2, 48, 12586032, 54776);
                if (viewState.getText().getLargeTitleDisplay()) {
                    c28655q2.m87150e0(-504752127);
                    z4 = false;
                    AbstractC30007c.m91851u(c2314t, 6, c28655q2, false);
                } else {
                    z4 = false;
                    c28655q2.m87150e0(-504675247);
                    c28655q2.m87173q(false);
                }
                String strM13108r2 = m13108r(interfaceC28601c8);
                if (viewState.getText().getLargeTitleDisplay()) {
                    c28655q2.m87150e0(-293369389);
                    c2886aM8413K = c38072d.m121952e(c28655q2, 6).getH5();
                } else {
                    c28655q2.m87150e0(-293368428);
                    c2886aM8413K = c38072d.m121952e(c28655q2, 6).getSh3();
                }
                c28655q2.m87173q(z4);
                AbstractC30795n.m94707h(strM13108r2, null, c38072d.m121949b(c28655q2, 6).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c2886aM8413K, fValueOf, c28655q2, 0, 12582912, 65018);
                c28655q2.m87173q(true);
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1), c2305k2, c28655q2, 54);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, c2314t);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a4);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m6);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N6);
                f13 = 0;
                if (Float.compare(m13099i(interfaceC28601c6), f13) > 0) {
                    c28655q2.m87150e0(295300339);
                    AbstractC30007c.m91851u(c2314t, m13099i(interfaceC28601c6), c28655q2, false);
                } else {
                    c28655q2.m87150e0(295399322);
                    c28655q2.m87173q(false);
                }
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9109L, c28655q2, 48);
                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, c2314t);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m7);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N7);
                String strM13112v2 = m13112v(interfaceC28601c10);
                C2886a c2886aM8408F2 = c38072d.m121952e(c28655q2, 6).getN9();
                long jMo134584toComposableColorWaAFU9c3 = viewState.getText().getSubtitleColor().mo134584toComposableColorWaAFU9c(c28655q2, 0);
                float fM124805c2 = C39183o.m124805c(c38072d.m121952e(c28655q2, 6).getN7().getStyle().f92255a.f92192b);
                C28674u2 c28674u3 = AbstractC2453v1.f9569h;
                long jM95626b3 = AbstractC31061c.m95626b(fM124805c2, 4294967296L, (InterfaceC39171c) c28655q2.m87161k(c28674u3));
                double dM13083A3 = m13083A(interfaceC28601c5);
                AbstractC35745c.m113242a(jM95626b3);
                int i110 = (i17 >> 3) & 112;
                AbstractC30795n.m94707h(strM13112v2, subtitleModifier, jMo134584toComposableColorWaAFU9c3, AbstractC35745c.m113248j((float) (((double) C39183o.m124805c(jM95626b3)) * dM13083A3), jM95626b3 & 1095216660480L), null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c2886aM8408F2, null, c28655q2, i110, 0, 196080);
                String strM13110t2 = m13110t(interfaceC28601c2);
                C2886a c2886aM8406D2 = c38072d.m121952e(c28655q2, 6).getN7();
                long jMo134584toComposableColorWaAFU9c4 = viewState.getText().getSubtitleColor().mo134584toComposableColorWaAFU9c(c28655q2, 0);
                long jM95626b4 = AbstractC31061c.m95626b(C39183o.m124805c(c38072d.m121952e(c28655q2, 6).getN7().getStyle().f92255a.f92192b), 4294967296L, (InterfaceC39171c) c28655q2.m87161k(c28674u3));
                double dM13083A4 = m13083A(interfaceC28601c5);
                AbstractC35745c.m113242a(jM95626b4);
                AbstractC30795n.m94707h(strM13110t2, subtitleModifier, jMo134584toComposableColorWaAFU9c4, AbstractC35745c.m113248j((float) (((double) C39183o.m124805c(jM95626b4)) * dM13083A4), jM95626b4 & 1095216660480L), null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c2886aM8406D2, null, c28655q2, i110, 0, 196080);
                c28655q = c28655q2;
                c28655q.m87173q(true);
                if (Float.compare(m13099i(interfaceC28601c6), f13) < 0) {
                    c28655q.m87150e0(296190194);
                    z13 = false;
                    AbstractC30007c.m91851u(c2314t, -m13099i(interfaceC28601c6), c28655q, false);
                } else {
                    z13 = false;
                    c28655q.m87150e0(296290138);
                    c28655q.m87173q(false);
                }
                AbstractC25012a.m73392y(c28655q, true, true, z13);
            } else {
                c28655q = c28655q2;
                c28655q.m87150e0(-2057271809);
                c28655q.m87173q(false);
            }
            interfaceC4245v2 = interfaceC4245v3;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            interfaceC4245v2 = c4223a0;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0555f(viewState, modifier, subtitleModifier, interfaceC4245v2, i13, i14, 12);
        }
    }

    /* JADX INFO: renamed from: h */
    private static final float m13098h(InterfaceC28601c1 interfaceC28601c1) {
        return ((Number) interfaceC28601c1.getValue()).floatValue();
    }

    /* JADX INFO: renamed from: i */
    private static final float m13099i(InterfaceC28601c1 interfaceC28601c1) {
        return ((C39174f) interfaceC28601c1.getValue()).f168413w;
    }

    /* JADX INFO: renamed from: j */
    private static final void m13100j(InterfaceC28601c1 interfaceC28601c1, float f13) {
        interfaceC28601c1.setValue(new C39174f(f13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m13101k(InterfaceC28601c1 interfaceC28601c1, double d3) {
        m13116z(interfaceC28601c1, (float) C4249z.f17271a.m13279a().m31308c(d3));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m13102l(InterfaceC28601c1 interfaceC28601c1, double d3) {
        m13084B(interfaceC28601c1, C4249z.f17271a.m13281c().m31308c(d3));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m13103m(float f13, InterfaceC28601c1 interfaceC28601c1, double d3) {
        m13100j(interfaceC28601c1, f13 - ((float) C4249z.f17271a.m13280b().m31308c(d3)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m13104n(InterfaceC28601c1 interfaceC28601c1, double d3) {
        m13107q(interfaceC28601c1, (float) C4244u.f17251a.m13257a().m31308c(d3));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    private static final String m13105o(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final void m13106p(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: renamed from: q */
    private static final void m13107q(InterfaceC28601c1 interfaceC28601c1, float f13) {
        interfaceC28601c1.setValue(Float.valueOf(f13));
    }

    /* JADX INFO: renamed from: r */
    private static final String m13108r(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final void m13109s(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: renamed from: t */
    private static final String m13110t(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final void m13111u(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: renamed from: v */
    private static final String m13112v(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final void m13113w(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m13114x(C4242s c4242s, Modifier modifier, Modifier modifier2, InterfaceC4245v interfaceC4245v, int i13, int i14, Composer composer, int i15) {
        m13097g(c4242s, modifier, modifier2, interfaceC4245v, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: y */
    private static final float m13115y(InterfaceC28601c1 interfaceC28601c1) {
        return ((Number) interfaceC28601c1.getValue()).floatValue();
    }

    /* JADX INFO: renamed from: z */
    private static final void m13116z(InterfaceC28601c1 interfaceC28601c1, float f13) {
        interfaceC28601c1.setValue(Float.valueOf(f13));
    }
}
