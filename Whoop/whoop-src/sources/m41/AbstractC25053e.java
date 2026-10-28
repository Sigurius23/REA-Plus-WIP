package m41;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.WithAlignmentLineElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import b91.EnumC2888c;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import d13.AbstractC11478a;
import ht2.C17632d;
import l83.C23454a0;
import live.hms.video.connection.degredation.C24117a;
import m31.C25002h;
import n41.C26270a;
import n41.C26271b;
import n41.C26273d;
import n41.C26274e;
import n41.C26275f;
import n41.C26276g;
import n41.EnumC26272c;
import no.nordicsemi.android.dfu.DfuBaseService;
import o41.C27520a;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p208i2.C17919x;
import p209i3.AbstractC18032n;
import p209i3.AbstractC18039u;
import p209i3.C18030l;
import p209i3.C18043y;
import p209i3.InterfaceC18044z;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p294l3.C23285v0;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p634y1.AbstractC39038k;
import p635y2.AbstractC39083d;
import p635y2.C39111m;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p717lq2.C24671c;
import p719m22.C24958m;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import v63.AbstractC35745c;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: m41.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a1\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a3\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a1\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a'\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u001aH\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a/\u0010!\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001dH\u0003¢\u0006\u0004\b!\u0010\"\u001a/\u0010#\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001dH\u0003¢\u0006\u0004\b#\u0010\"\u001a1\u0010'\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\r2\u0006\u0010&\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020\u001aH\u0003¢\u0006\u0004\b'\u0010(\u001a1\u0010)\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\r2\u0006\u0010&\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020\u001aH\u0003¢\u0006\u0004\b)\u0010(\u001a1\u0010*\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\r2\u0006\u0010&\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020\u001aH\u0003¢\u0006\u0004\b*\u0010(¨\u0006,²\u0006\u0014\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Ln41/b;", "viewState", "Lkotlin/Function0;", "Ll83/a0;", "onFinished", "z", "(Landroidx/compose/ui/Modifier;Ln41/b;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "Ln41/e;", "source", "", "running", "Ln41/f;", "F", "(Ln41/e;ZLc93/a;Landroidx/compose/runtime/Composer;II)Ln41/f;", "", "value", "Lb91/c;", "style", "Li2/x;", "color", "v", "(ILb91/c;JLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "unit", "Ln41/g;", "l", "(ILjava/lang/String;Ln41/g;Landroidx/compose/runtime/Composer;I)V", "Ly3/f;", "size", "space", "pad", "n", "(JFFFLandroidx/compose/runtime/Composer;I)V", "p", "state", "Ln41/d;", "labels", "x", "(Landroidx/compose/ui/Modifier;Ln41/f;Ln41/d;Ln41/g;Landroidx/compose/runtime/Composer;II)V", "r", "t", "onFinishedUpdated", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25053e {

    /* JADX INFO: renamed from: m41.e$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f98158a;

        static {
            int[] iArr = new int[EnumC26272c.values().length];
            try {
                iArr[EnumC26272c.SEGMENTED_SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC26272c.INLINE_LARGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC26272c.INLINE_SMALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC26272c.FALL_BACK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f98158a = iArr;
        }
    }

    /* JADX INFO: renamed from: m41.e$b */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.timer.TimerComponentKt$rememberTimerState$1$1", m100430f = "TimerComponent.kt", m100431l = {152}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ long f98159E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ C26275f f98160F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC28670t2 f98161G;

        /* JADX INFO: renamed from: w */
        long f98162w;

        /* JADX INFO: renamed from: x */
        long f98163x;

        /* JADX INFO: renamed from: y */
        int f98164y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ boolean f98165z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z4, long j7, C26275f c26275f, InterfaceC28670t2 interfaceC28670t2, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f98165z = z4;
            this.f98159E = j7;
            this.f98160F = c26275f;
            this.f98161G = interfaceC28670t2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f98165z, this.f98159E, this.f98160F, this.f98161G, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            long jM82954b;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f98164y;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (!this.f98165z) {
                    return c23454a0;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            do {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jMax = Math.max(0L, this.f98159E - jCurrentTimeMillis);
                this.f98160F.m77960b(jMax);
                if (jMax <= 0) {
                    InterfaceC4339a interfaceC4339aM73498G = AbstractC25053e.m73498G(this.f98161G);
                    if (interfaceC4339aM73498G != null) {
                        interfaceC4339aM73498G.invoke();
                    }
                    return c23454a0;
                }
                jM82954b = C27520a.f110811a.m82954b(jMax);
                this.f98162w = jCurrentTimeMillis;
                this.f98163x = jMax;
                this.f98164y = 1;
            } while (AbstractC3034m0.m8782b(jM82954b, this) != enumC31071a);
            return enumC31071a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m73492A() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final long m73493B(C26271b c26271b) {
        return c26271b.getExpiresAt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m73494C(String str, InterfaceC18044z semantics) {
        AbstractC22676k.m65750j(semantics, "$this$semantics");
        C18043y c18043y = AbstractC18039u.f70034a;
        ((C18030l) semantics).m51772e(AbstractC18039u.f70034a, AbstractC37056f.m118958J(str));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m73495D(Modifier modifier, C26271b c26271b, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m73524z(modifier, c26271b, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: F */
    private static final C26275f m73497F(C26274e c26274e, boolean z4, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        boolean z13 = true;
        boolean z14 = (i14 & 2) != 0 ? true : z4;
        if ((i14 & 4) != 0) {
            interfaceC4339a = null;
        }
        long jM77958a = c26274e.getEndAtMillis();
        C28655q c28655q = (C28655q) composer;
        boolean zM87151f = c28655q.m87151f(jM77958a);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87151f || objM87133R == c28676v0) {
            long jCurrentTimeMillis = jM77958a - System.currentTimeMillis();
            if (jCurrentTimeMillis < 0) {
                jCurrentTimeMillis = 0;
            }
            objM87133R = Long.valueOf(jCurrentTimeMillis);
            c28655q.m87172p0(objM87133R);
        }
        long jLongValue = ((Number) objM87133R).longValue();
        boolean zM87151f2 = c28655q.m87151f(jM77958a);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87151f2 || objM87133R2 == c28676v0) {
            objM87133R2 = new C26275f(jLongValue);
            c28655q.m87172p0(objM87133R2);
        }
        C26275f c26275f = (C26275f) objM87133R2;
        InterfaceC28601c1 interfaceC28601c1M87238F = AbstractC28683x.m87238F(interfaceC4339a, c28655q);
        Long lValueOf = Long.valueOf(jM77958a);
        Boolean boolValueOf = Boolean.valueOf(z14);
        if ((((i13 & 112) ^ 48) <= 32 || !c28655q.m87155h(z14)) && (i13 & 48) != 32) {
            z13 = false;
        }
        boolean zM87151f3 = c28655q.m87151f(jM77958a) | z13 | c28655q.m87153g(c26275f) | c28655q.m87153g(interfaceC28601c1M87238F);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87151f3 || objM87133R3 == c28676v0) {
            b bVar = new b(z14, jM77958a, c26275f, interfaceC28601c1M87238F, null);
            c28655q.m87172p0(bVar);
            objM87133R3 = bVar;
        }
        AbstractC28683x.m87254h(lValueOf, boolValueOf, (InterfaceC4351m) objM87133R3, c28655q);
        return c26275f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final InterfaceC4339a m73498G(InterfaceC28670t2 interfaceC28670t2) {
        return (InterfaceC4339a) interfaceC28670t2.getValue();
    }

    /* JADX INFO: renamed from: l */
    private static final void m73510l(int i13, String str, C26276g c26276g, Composer composer, int i14) {
        int i15;
        String str2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1063647731);
        if ((i14 & 6) == 0) {
            i15 = (c28655q.m87149e(i13) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= c28655q.m87153g(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= c28655q.m87153g(c26276g) ? 256 : 128;
        }
        int i16 = i15;
        if (c28655q.m87135U(i16 & 1, (i16 & 147) != 146)) {
            Modifier modifierM3394p = AbstractC1099a.m3394p(8, AbstractC1092a.m3358c(C2314t.f9131w, C17919x.m51541c(0.2f, C17919x.f69629f), AbstractC33253j.m105489e(4)));
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            m73520v(i13, c26276g.getNumberStyle(), c26276g.getTextColor(), null, c28655q, i16 & 14, 8);
            str2 = str;
            AbstractC30795n.m94707h(str2, null, c26276g.getTextColor(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, EnumC2888c.INSTANCE.m8402a(c26276g.getNumberStyle()), null, c28655q, (i16 >> 3) & 14, 0, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            str2 = str;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C24671c(i13, str2, c26276g, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m73511m(int i13, String str, C26276g c26276g, int i14, Composer composer, int i15) {
        m73510l(i13, str, c26276g, composer, AbstractC28683x.m87244L(i14 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    private static final void m73512n(long j7, float f13, float f14, float f15, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1913436972);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87151f(j7) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87147d(f13) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87147d(f14) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87147d(f15) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, f15, 0.0f, 2);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), C2299e.f9111N, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
            InterfaceC0221l.f734a.getClass();
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
            Modifier modifierM3419p = AbstractC1102d.m3419p(f13, c2314t);
            C33252i c33252i = AbstractC33253j.f138651a;
            AbstractC22989q.m66760a(AbstractC1092a.m3358c(modifierM3419p, j7, c33252i), c28655q, 0);
            AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC1102d.m3419p(f13, c2314t), j7, c33252i), c28655q, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C25050b(j7, f13, f14, f15, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m73513o(long j7, float f13, float f14, float f15, int i13, Composer composer, int i14) {
        m73512n(j7, f13, f14, f15, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p */
    private static final void m73514p(long j7, float f13, float f14, float f15, Composer composer, int i13) {
        int i14;
        float f16;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1564413590);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87151f(j7) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87147d(f13) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            f16 = f14;
            i14 |= c28655q.m87147d(f16) ? 256 : 128;
        } else {
            f16 = f14;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87147d(f15) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1099a.m3396r(c2314t, f15, 0.0f, 2), 0.0f, 0.0f, 0.0f, 4, 7);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f16), C2299e.f9111N, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
            InterfaceC0221l.f734a.getClass();
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
            float f17 = 1;
            AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC1102d.m3419p(f13, c2314t), j7, AbstractC33253j.m105489e(f17)), c28655q, 0);
            AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC1102d.m3419p(f13, c2314t), j7, AbstractC33253j.m105489e(f17)), c28655q, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C25050b(j7, f13, f16, f15, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m73515q(long j7, float f13, float f14, float f15, int i13, Composer composer, int i14) {
        m73514p(j7, f13, f14, f15, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r */
    private static final void m73516r(Modifier modifier, C26275f c26275f, C26273d c26273d, C26276g c26276g, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C26276g c26276g2;
        Modifier modifier3;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1870233096);
        int i16 = i14 & 1;
        if (i16 != 0) {
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
            i15 |= c28655q.m87153g(c26275f) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87153g(c26273d) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            c26276g2 = c26276g;
            i15 |= c28655q.m87153g(c26276g2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            c26276g2 = c26276g;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 1171) != 1170)) {
            Modifier modifier4 = i16 != 0 ? C2314t.f9131w : modifier2;
            C26270a c26270aM82955c = C27520a.f110811a.m82955c(c26275f.m77959a());
            boolean z4 = c26270aM82955c.getHours() == 0;
            EnumC2888c.Companion aVar = EnumC2888c.INSTANCE;
            C23285v0 style = aVar.m8402a(c26276g2.getNumberStyleLarge()).getStyle();
            C2886a c2886aM8402a = aVar.m8402a(c26276g2.getNumberStyleLarge());
            long j7 = style.f92255a.f92192b;
            AbstractC35745c.m113242a(j7);
            C2886a c2886aM8397c = C2886a.m8397c(c2886aM8402a, C23285v0.m67364b(style, 0L, AbstractC11478a.m30852d(j7, j7 & 1095216660480L, 0.5f), null, null, 0L, 0, 0L, null, null, 16777213), null, 2, null);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9109L, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier4);
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
            C39111m c39111m = AbstractC39083d.f168140a;
            m73520v(z4 ? c26270aM82955c.getMinutes() : c26270aM82955c.getHours(), c26276g2.getNumberStyleLarge(), c26276g2.getTextColor(), new WithAlignmentLineElement(c39111m), c28655q, 0, 0);
            AbstractC30795n.m94707h(z4 ? c26273d.getMinutes() : c26273d.getHours(), new WithAlignmentLineElement(c39111m), c26276g.getTextColor(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8397c, null, c28655q, 0, 0, 196600);
            float f13 = 4;
            m73514p(c26276g.getColonColor(), f13, f13, 8, c28655q, 3504);
            m73520v(z4 ? c26270aM82955c.getSeconds() : c26270aM82955c.getMinutes(), c26276g.getNumberStyleLarge(), c26276g.getTextColor(), new WithAlignmentLineElement(c39111m), c28655q, 0, 0);
            AbstractC30795n.m94707h(z4 ? c26273d.getSeconds() : c26273d.getMinutes(), new WithAlignmentLineElement(c39111m), c26276g.getTextColor(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8397c, null, c28655q, 0, 0, 196600);
            c28655q = c28655q;
            c28655q.m87173q(true);
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C25051c(modifier3, c26275f, c26273d, c26276g, i13, i14, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m73517s(Modifier modifier, C26275f c26275f, C26273d c26273d, C26276g c26276g, int i13, int i14, Composer composer, int i15) {
        m73516r(modifier, c26275f, c26273d, c26276g, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t */
    private static final void m73518t(Modifier modifier, C26275f c26275f, C26273d c26273d, C26276g c26276g, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C26275f c26275f2;
        boolean z4;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2112418476);
        int i16 = i14 & 1;
        if (i16 != 0) {
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
            c26275f2 = c26275f;
            i15 |= c28655q.m87153g(c26275f2) ? 32 : 16;
        } else {
            c26275f2 = c26275f;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87153g(c26273d) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87153g(c26276g) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 1171) != 1170)) {
            C2314t c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier2 = c2314t;
            }
            C26270a c26270aM82955c = C27520a.f110811a.m82955c(c26275f2.m77959a());
            boolean z13 = c26270aM82955c.getHours() == 0;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9109L, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier2);
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
            if (z13) {
                z4 = false;
                c28655q.m87150e0(156816218);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(156419325);
                m73520v(c26270aM82955c.getHours(), c26276g.getNumberStyle(), c26276g.getTextColor(), null, c28655q, 0, 8);
                AbstractC30795n.m94707h(c26273d.getHours(), null, c26276g.getTextColor(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, EnumC2888c.INSTANCE.m8402a(c26276g.getNumberStyle()), null, c28655q, 0, 0, 196602);
                c28655q = c28655q;
                z4 = false;
                AbstractC25012a.m73389v(c2314t, 2, c28655q, false);
            }
            m73520v(c26270aM82955c.getMinutes(), c26276g.getNumberStyle(), c26276g.getTextColor(), null, c28655q, 0, 8);
            String strM77956b = c26273d.getMinutes();
            EnumC2888c.Companion aVar = EnumC2888c.INSTANCE;
            C28655q c28655q2 = c28655q;
            AbstractC30795n.m94707h(strM77956b, null, c26276g.getTextColor(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.m8402a(c26276g.getNumberStyle()), null, c28655q2, 0, 0, 196602);
            c28655q = c28655q2;
            if (z13) {
                c28655q.m87150e0(157166425);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(2, c2314t));
                m73520v(c26270aM82955c.getSeconds(), c26276g.getNumberStyle(), c26276g.getTextColor(), null, c28655q, 0, 8);
                AbstractC30795n.m94707h(c26273d.getSeconds(), null, c26276g.getTextColor(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.m8402a(c26276g.getNumberStyle()), null, c28655q, 0, 0, 196602);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(157567162);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        Modifier modifier3 = modifier2;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C25051c(modifier3, c26275f2, c26273d, c26276g, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m73519u(Modifier modifier, C26275f c26275f, C26273d c26273d, C26276g c26276g, int i13, int i14, Composer composer, int i15) {
        m73518t(modifier, c26275f, c26273d, c26276g, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: v */
    private static final void m73520v(int i13, EnumC2888c enumC2888c, final long j7, Modifier modifier, Composer composer, final int i14, final int i15) {
        final int i16;
        int i17;
        final Modifier modifier2;
        boolean z4;
        EnumC2888c enumC2888c2;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        Modifier modifier3;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-2079529848);
        if ((i14 & 6) == 0) {
            i16 = i13;
            i17 = (c28655q2.m87149e(i16) ? 4 : 2) | i14;
        } else {
            i16 = i13;
            i17 = i14;
        }
        if ((i14 & 48) == 0) {
            i17 |= c28655q2.m87149e(enumC2888c.ordinal()) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i17 |= c28655q2.m87151f(j7) ? 256 : 128;
        }
        int i18 = i15 & 8;
        if (i18 == 0) {
            if ((i14 & 3072) == 0) {
                modifier2 = modifier;
                i17 |= c28655q2.m87153g(modifier2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i17 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i17 & 1, z4)) {
                if (i18 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                enumC2888c2 = enumC2888c;
                c28655q = c28655q2;
                AbstractC30795n.m94707h(AbstractC39414r.m125895n0(2, String.valueOf(i16)), modifier3, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, EnumC2888c.INSTANCE.m8402a(enumC2888c2), null, c28655q, ((i17 >> 6) & 112) | (i17 & 896), 0, 196600);
                modifier2 = modifier3;
            } else {
                enumC2888c2 = enumC2888c;
                c28655q = c28655q2;
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final EnumC2888c enumC2888c3 = enumC2888c2;
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: m41.d
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC25053e.m73521w(i16, enumC2888c3, j7, modifier2, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i17 |= 3072;
        modifier2 = modifier;
        if ((i17 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i17 & 1, z4)) {
            if (i18 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            enumC2888c2 = enumC2888c;
            c28655q = c28655q2;
            AbstractC30795n.m94707h(AbstractC39414r.m125895n0(2, String.valueOf(i16)), modifier3, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, EnumC2888c.INSTANCE.m8402a(enumC2888c2), null, c28655q, ((i17 >> 6) & 112) | (i17 & 896), 0, 196600);
            modifier2 = modifier3;
        } else {
            enumC2888c2 = enumC2888c;
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final EnumC2888c enumC2888c4 = enumC2888c2;
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: m41.d
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC25053e.m73521w(i16, enumC2888c4, j7, modifier2, i14, i15, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m73521w(int i13, EnumC2888c enumC2888c, long j7, Modifier modifier, int i14, int i15, Composer composer, int i16) {
        m73520v(i13, enumC2888c, j7, modifier, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: x */
    private static final void m73522x(Modifier modifier, C26275f c26275f, C26273d c26273d, C26276g c26276g, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1112513672);
        int i16 = i14 & 1;
        if (i16 != 0) {
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
            i15 |= c28655q.m87153g(c26275f) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87153g(c26273d) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87153g(c26276g) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 1171) != 1170)) {
            Modifier modifier4 = i16 != 0 ? C2314t.f9131w : modifier2;
            C26270a c26270aM82955c = C27520a.f110811a.m82955c(c26275f.m77959a());
            boolean z4 = c26270aM82955c.getHours() == 0;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier4);
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
            int i17 = (i15 >> 3) & 896;
            m73510l(z4 ? c26270aM82955c.getMinutes() : c26270aM82955c.getHours(), z4 ? c26273d.getMinutes() : c26273d.getHours(), c26276g, c28655q, i17);
            float f13 = 4;
            m73512n(c26276g.getColonColor(), f13, f13, 8, c28655q, 3504);
            m73510l(z4 ? c26270aM82955c.getSeconds() : c26270aM82955c.getMinutes(), z4 ? c26273d.getSeconds() : c26273d.getMinutes(), c26276g, c28655q, i17);
            c28655q.m87173q(true);
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C25051c(modifier3, c26275f, c26273d, c26276g, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m73523y(Modifier modifier, C26275f c26275f, C26273d c26273d, C26276g c26276g, int i13, int i14, Composer composer, int i15) {
        m73522x(modifier, c26275f, c26273d, c26276g, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0067  */
    /* JADX WARN: Code duplicated, block: B:34:0x0069  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x0076  */
    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    /* JADX WARN: Code duplicated, block: B:47:0x0090  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:59:0x0104  */
    /* JADX WARN: Code duplicated, block: B:62:0x0136  */
    /* JADX WARN: Code duplicated, block: B:63:0x013a  */
    /* JADX WARN: Code duplicated, block: B:68:0x015b  */
    /* JADX WARN: Code duplicated, block: B:71:0x0165  */
    /* JADX WARN: Code duplicated, block: B:72:0x0170  */
    /* JADX WARN: Code duplicated, block: B:74:0x0186  */
    /* JADX WARN: Code duplicated, block: B:76:0x0189  */
    /* JADX WARN: Code duplicated, block: B:78:0x018c  */
    /* JADX WARN: Code duplicated, block: B:80:0x018f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0199  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:85:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:88:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:91:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: z */
    public static final void m73524z(Modifier modifier, C26271b viewState, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        InterfaceC4339a interfaceC4339a2;
        boolean z4;
        Modifier modifier3;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a4;
        boolean z13;
        Object objM87133R;
        C26275f c26275fM73497F;
        C26273d c26273d;
        C26276g style;
        String strM82953a;
        boolean zM87153g;
        Object objM87133R2;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i16;
        C1100b c1100b;
        Object objM87133R3;
        C2307m c2307m = C2299e.f9102E;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(177421852);
        int i17 = i14 & 1;
        if (i17 != 0) {
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
            i15 |= c28655q.m87153g(viewState) ? 32 : 16;
        }
        int i18 = i14 & 4;
        if (i18 == 0) {
            if ((i13 & 384) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                i15 |= c28655q.m87157i(interfaceC4339a2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i17 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C24958m(6);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R3;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                Object[] objArr = {Long.valueOf(viewState.getExpiresAt())};
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13 || objM87133R == c28676v0) {
                    objM87133R = new C24117a(viewState, 8);
                    c28655q.m87172p0(objM87133R);
                }
                c26275fM73497F = m73497F(new C26274e(((Number) AbstractC39038k.m124457c(objArr, (InterfaceC4339a) objM87133R, c28655q, 0)).longValue()), false, interfaceC4339a4, c28655q, i15 & 896, 2);
                InterfaceC4339a interfaceC4339a5 = interfaceC4339a4;
                c28655q = c28655q;
                c26273d = new C26273d(viewState.getHourLabel(), viewState.getMinLabel(), viewState.getSecondLabel());
                style = viewState.getVariant().getStyle();
                strM82953a = C27520a.f110811a.m82953a(c26275fM73497F.m77959a(), c26273d);
                zM87153g = c28655q.m87153g(strM82953a);
                objM87133R2 = c28655q.m87133R();
                if (zM87153g || objM87133R2 == c28676v0) {
                    objM87133R2 = new C17632d(strM82953a, 23);
                    c28655q.m87172p0(objM87133R2);
                }
                Modifier modifierM51775c = AbstractC18032n.m51775c(modifier3, false, (Function1) objM87133R2);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM51775c);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                if (style == null) {
                    c28655q.m87150e0(-196842432);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-196842431);
                    i16 = a.f98158a[viewState.getVariant().ordinal()];
                    c1100b = C1100b.f4583a;
                    if (i16 != 1) {
                        c28655q.m87150e0(-1474631170);
                        m73522x(c1100b.mo3400a(c2314t, c2307m), c26275fM73497F, c26273d, style, c28655q, 0, 0);
                        c28655q.m87173q(false);
                    } else if (i16 != 2) {
                        c28655q.m87150e0(-1474621408);
                        m73516r(c1100b.mo3400a(c2314t, c2307m), c26275fM73497F, c26273d, style, c28655q, 0, 0);
                        c28655q.m87173q(false);
                    } else if (i16 != 3) {
                        c28655q.m87150e0(-1474611584);
                        m73518t(c1100b.mo3400a(c2314t, c2307m), c26275fM73497F, c26273d, style, c28655q, 0, 0);
                        c28655q.m87173q(false);
                    } else {
                        if (i16 == 4) {
                            throw AbstractC11895b.m32003v(-1474633656, c28655q, false);
                        }
                        c28655q.m87150e0(1531957488);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                interfaceC4339a3 = interfaceC4339a5;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C25002h(modifier3, viewState, interfaceC4339a3, i13, i14, 1);
            }
        }
        i15 |= 384;
        interfaceC4339a2 = interfaceC4339a;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i17 != 0) {
                modifier3 = c2314t;
            } else {
                modifier3 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C24958m(6);
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R3;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            Object[] objArr2 = {Long.valueOf(viewState.getExpiresAt())};
            if ((i15 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R = c28655q.m87133R();
            if (z13) {
                objM87133R = new C24117a(viewState, 8);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C24117a(viewState, 8);
                c28655q.m87172p0(objM87133R);
            }
            c26275fM73497F = m73497F(new C26274e(((Number) AbstractC39038k.m124457c(objArr2, (InterfaceC4339a) objM87133R, c28655q, 0)).longValue()), false, interfaceC4339a4, c28655q, i15 & 896, 2);
            InterfaceC4339a interfaceC4339a6 = interfaceC4339a4;
            c28655q = c28655q;
            c26273d = new C26273d(viewState.getHourLabel(), viewState.getMinLabel(), viewState.getSecondLabel());
            style = viewState.getVariant().getStyle();
            strM82953a = C27520a.f110811a.m82953a(c26275fM73497F.m77959a(), c26273d);
            zM87153g = c28655q.m87153g(strM82953a);
            objM87133R2 = c28655q.m87133R();
            if (zM87153g) {
                objM87133R2 = new C17632d(strM82953a, 23);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C17632d(strM82953a, 23);
                c28655q.m87172p0(objM87133R2);
            }
            Modifier modifierM51775c2 = AbstractC18032n.m51775c(modifier3, false, (Function1) objM87133R2);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM51775c2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            if (style == null) {
                c28655q.m87150e0(-196842432);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-196842431);
                i16 = a.f98158a[viewState.getVariant().ordinal()];
                c1100b = C1100b.f4583a;
                if (i16 != 1) {
                    c28655q.m87150e0(-1474631170);
                    m73522x(c1100b.mo3400a(c2314t, c2307m), c26275fM73497F, c26273d, style, c28655q, 0, 0);
                    c28655q.m87173q(false);
                } else if (i16 != 2) {
                    c28655q.m87150e0(-1474621408);
                    m73516r(c1100b.mo3400a(c2314t, c2307m), c26275fM73497F, c26273d, style, c28655q, 0, 0);
                    c28655q.m87173q(false);
                } else if (i16 != 3) {
                    c28655q.m87150e0(-1474611584);
                    m73518t(c1100b.mo3400a(c2314t, c2307m), c26275fM73497F, c26273d, style, c28655q, 0, 0);
                    c28655q.m87173q(false);
                } else {
                    if (i16 == 4) {
                        throw AbstractC11895b.m32003v(-1474633656, c28655q, false);
                    }
                    c28655q.m87150e0(1531957488);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            interfaceC4339a3 = interfaceC4339a6;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C25002h(modifier3, viewState, interfaceC4339a3, i13, i14, 1);
        }
    }
}
