package yt2;

import android.content.res.Configuration;
import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.p018ui.layout.AbstractC1131a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import au2.AbstractC2078c;
import au2.AbstractC2083h;
import au2.C2079d;
import b91.C2886a;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import d41.C11678d;
import dp0.AbstractC12248d;
import dp0.AbstractC12250f;
import ep0.C13404j;
import gb1.AbstractC15673b0;
import hb3.AbstractC17104a0;
import ih0.AbstractC18489d0;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import ks2.AbstractC22822a;
import l83.C23454a0;
import lz0.AbstractC24821f;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import o81.C27656a;
import p000.AbstractC11266d;
import p000.AbstractC14893g;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.AbstractC2294a;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p040c0.AbstractC3788w0;
import p040c0.C3733d1;
import p040c0.InterfaceC3747i0;
import p077d0.AbstractC11348f;
import p077d0.AbstractC11352g;
import p077d0.C11347e2;
import p077d0.InterfaceC11372l;
import p077d0.InterfaceC11419z;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p208i2.C17920x0;
import p208i2.InterfaceC17886g0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28617g1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p390p1.InterfaceC28690z0;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p635y2.C39102j;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p636y3.C39169a;
import p636y3.C39174f;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p733ry2.C31919h;
import p734sl0.C32676t1;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import uv0.AbstractC35283c;
import vt2.AbstractC36492a;
import vv2.C36538d;
import vx0.C36553a;
import wb3.AbstractC37056f;
import wr0.C37564y;
import wt2.AbstractC37628i;
import wt2.AbstractC37630k;
import wt2.C37620a;
import wt2.C37622c;
import x81.C38072d;
import y00.AbstractC38963t7;
import yk2.C39611k;
import yo1.C39689b;

/* JADX INFO: renamed from: yt2.k */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aM\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a5\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\"²\u0006\u000e\u0010\u0018\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0019\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001a\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001c\u001a\u00020\u001b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001d\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u001f\u001a\u00020\u001e8\nX\u008a\u0084\u0002²\u0006\u000e\u0010 \u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\f\u0010!\u001a\u00020\u001b8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lwt2/k;", "viewState", "", "isPreview", "Lkotlin/Function1;", "Lwt2/i;", "Ll83/a0;", "onViewEvent", "Lvt2/a;", "onNavigationEvent", "X", "(Lwt2/k;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lwt2/k$c;", "summaryState", "x", "(Lwt2/k$c;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lwt2/c;", "challengeBar", "v", "(Lwt2/c;Landroidx/compose/runtime/Composer;I)V", "Lkd1/o;", "overrideImage", "t", "(Lkd1/o;Landroidx/compose/runtime/Composer;I)V", "showLoading", "animationFinished", "showFooter", "", "gradientAlpha", "showToolbar", "Ly3/f;", "gaugeOffsetY", "showContent", "toolbarAlpha", "weekly-plan_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39780k {

    /* JADX INFO: renamed from: yt2.k$a */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.weeklyplan.view.SummaryV2ScreenKt$Success$2$1", m100430f = "SummaryV2Screen.kt", m100431l = {149, 150}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f171338E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28601c1 f171339F;

        /* JADX INFO: renamed from: w */
        int f171340w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f171341x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f171342y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28690z0 f171343z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z4, InterfaceC28601c1 interfaceC28601c1, InterfaceC28690z0 interfaceC28690z0, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f171341x = z4;
            this.f171342y = interfaceC28601c1;
            this.f171343z = interfaceC28690z0;
            this.f171338E = interfaceC28601c2;
            this.f171339F = interfaceC28601c3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final C23454a0 m127423h(InterfaceC28690z0 interfaceC28690z0, float f13, float f14) {
            AbstractC39780k.m127381W(interfaceC28690z0, f13);
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f171341x, this.f171342y, this.f171343z, this.f171338E, this.f171339F, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
        
            if (p077d0.AbstractC11348f.m30557e(0.0f, 1.0f, r8, r9, r10, 4) == r0) goto L17;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r12.f171340w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1d
                if (r1 == r3) goto L19
                if (r1 != r2) goto L11
                p505ts.AbstractC34132o.m107864I(r13)
                r10 = r12
                goto L54
            L11:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L19:
                p505ts.AbstractC34132o.m107864I(r13)
                goto L35
            L1d:
                p505ts.AbstractC34132o.m107864I(r13)
                boolean r13 = r12.f171341x
                if (r13 != 0) goto L5f
                p1.c1 r13 = r12.f171342y
                yt2.AbstractC39780k.m127394e0(r13, r3)
                r12.f171340w = r3
                r4 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r13 = bc3.AbstractC3034m0.m8782b(r4, r12)
                if (r13 != r0) goto L35
                r10 = r12
                goto L53
            L35:
                r13 = 0
                r1 = 6
                r4 = 2200(0x898, float:3.083E-42)
                r5 = 0
                d0.e2 r8 = p077d0.AbstractC11348f.m30574v(r4, r13, r5, r1)
                p1.z0 r13 = r12.f171343z
                yt2.j r9 = new yt2.j
                r1 = 0
                r9.<init>(r13, r1)
                r12.f171340w = r2
                r6 = 0
                r7 = 1065353216(0x3f800000, float:1.0)
                r11 = 4
                r10 = r12
                java.lang.Object r13 = p077d0.AbstractC11348f.m30557e(r6, r7, r8, r9, r10, r11)
                if (r13 != r0) goto L54
            L53:
                return r0
            L54:
                p1.c1 r13 = r10.f171338E
                yt2.AbstractC39780k.m127400h0(r13, r3)
                p1.c1 r13 = r10.f171339F
                yt2.AbstractC39780k.m127402i0(r13, r3)
                goto L67
            L5f:
                r10 = r12
                p1.z0 r13 = r10.f171343z
                r0 = 1065353216(0x3f800000, float:1.0)
                yt2.AbstractC39780k.m127404j0(r13, r0)
            L67:
                l83.a0 r13 = l83.C23454a0.f92919a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: yt2.AbstractC39780k.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: yt2.k$b */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.weeklyplan.view.SummaryV2ScreenKt$Success$3$1", m100430f = "SummaryV2Screen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f171344w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28601c1 f171345x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f171346y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f171345x = interfaceC28601c1;
            this.f171346y = interfaceC28601c2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f171345x, this.f171346y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f171344w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (AbstractC39780k.m127364F(this.f171345x)) {
                AbstractC39780k.m127362D(this.f171346y, true);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: yt2.k$c */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.weeklyplan.view.SummaryV2ScreenKt$SummaryV2Screen$3$1", m100430f = "SummaryV2Screen.kt", m100431l = {91}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f171347w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28601c1 f171348x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f171348x = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f171348x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f171347w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                this.f171347w = 1;
                if (AbstractC3034m0.m8782b(1000L, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            AbstractC39780k.m127388b0(this.f171348x, true);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final void m127359A(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: B */
    private static final float m127360B(InterfaceC28670t2 interfaceC28670t2) {
        return ((C39174f) interfaceC28670t2.getValue()).f168413w;
    }

    /* JADX INFO: renamed from: C */
    private static final boolean m127361C(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final void m127362D(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: E */
    private static final float m127363E(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final boolean m127364F(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m127365G(InterfaceC28690z0 interfaceC28690z0, InterfaceC17886g0 graphicsLayer) {
        AbstractC22676k.m65750j(graphicsLayer, "$this$graphicsLayer");
        ((C17920x0) graphicsLayer).m51551a(m127380V(interfaceC28690z0));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m127366H(Function1 function1) {
        function1.invoke(AbstractC36492a.a.f155906a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m127367I(InterfaceC28690z0 interfaceC28690z0, InterfaceC17886g0 graphicsLayer) {
        AbstractC22676k.m65750j(graphicsLayer, "$this$graphicsLayer");
        ((C17920x0) graphicsLayer).m51551a(m127380V(interfaceC28690z0));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m127368J(InterfaceC28690z0 interfaceC28690z0, InterfaceC17886g0 graphicsLayer) {
        AbstractC22676k.m65750j(graphicsLayer, "$this$graphicsLayer");
        ((C17920x0) graphicsLayer).m51551a(m127380V(interfaceC28690z0));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final InterfaceC39130s0 m127369K(InterfaceC39133t0 layout, InterfaceC39124q0 measurable, C39169a c39169a) {
        AbstractC22676k.m65750j(layout, "$this$layout");
        AbstractC22676k.m65750j(measurable, "measurable");
        AbstractC39104j1 abstractC39104j1Mo448T = measurable.mo448T(c39169a.f168407a);
        return layout.mo86822W(abstractC39104j1Mo448T.f168211w, (int) (abstractC39104j1Mo448T.f168212x * 0.94f), C25272z.f99163w, new C39777h(abstractC39104j1Mo448T, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m127370L(AbstractC39104j1 abstractC39104j1, AbstractC39101i1 layout) {
        AbstractC22676k.m65750j(layout, "$this$layout");
        AbstractC39101i1.m124624n(abstractC39104j1, 0, 0, layout);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final int m127371M(int i13, int i14) {
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m127372N(AbstractC37630k.c cVar, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        C28655q c28655q;
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, composer, 48);
        C28655q c28655q2 = (C28655q) composer;
        int iHashCode = Long.hashCode(c28655q2.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
        C2314t c2314t = C2314t.f9131w;
        Modifier modifierM118962N = AbstractC37056f.m118962N(composer, c2314t);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j = C0217k.f724b;
        AbstractC17104a0 abstractC17104a0 = c28655q2.f115906a;
        c28655q2.m87158i0();
        if (c28655q2.f115903S) {
            c28655q2.m87163l(c0213j);
        } else {
            c28655q2.m87178s0();
        }
        AbstractC28683x.m87239G(composer, C0217k.f729g, c23010xM66775a);
        AbstractC28683x.m87239G(composer, C0217k.f728f, interfaceC28653p1M87165m);
        C0209i c0209i = C0217k.f732j;
        if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
        }
        AbstractC28683x.m87239G(composer, C0217k.f726d, modifierM118962N);
        TextResource textResourceM120904a = cVar.getHeader().getDisplay();
        int i14 = TextResource.$stable;
        String strM21274h = AbstractC8693b.m21274h(textResourceM120904a, composer, i14);
        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
        C38072d c38072d = C38072d.f163053a;
        int i15 = C38072d.f163054b;
        C2886a c2886aM8417O = c38072d.m121952e(composer, i15).getT2();
        long jM125430y = c38072d.m121949b(composer, i15).getBrandWhite();
        int i16 = C2886a.f11498d << 18;
        AbstractC30795n.m94707h(strM21274h, modifierM3409f, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O, null, composer, 48, i16, 196600);
        float f13 = 4;
        AbstractC22953f.m66715b(composer, AbstractC1102d.m3411h(1 * f13, c2314t));
        AbstractC30795n.m94707h(AbstractC8693b.m21274h(cVar.getDescription(), composer, i14), AbstractC1102d.m3409f(1.0f, c2314t), c38072d.m121949b(composer, i15).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(composer, i15).getB1(), null, composer, 48, i16, 196600);
        C2079d c2079dM120918d = cVar.getNewSummary();
        if (c2079dM120918d == null) {
            c28655q = c28655q2;
            c28655q.m87150e0(4590535);
            c28655q.m87173q(false);
        } else {
            c28655q = c28655q2;
            c28655q.m87150e0(4590536);
            float f14 = 5 * f13;
            AbstractC22953f.m66715b(composer, AbstractC1102d.m3411h(f14, c2314t));
            AbstractC2078c.m6570g(c2079dM120918d, composer, 0);
            AbstractC22953f.m66715b(composer, AbstractC1102d.m3411h(f14, c2314t));
            c28655q.m87173q(false);
        }
        c28655q.m87173q(true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final int m127373O(int i13) {
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m127374P(AbstractC37630k.c cVar, Function1 function1, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
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
        AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1102d.m3411h(5 * 4, AbstractC1102d.m3409f(1.0f, c2314t)), C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.f69636m), new C17919x(AbstractC17918w0.m51517e(4279244056L)), new C17919x(AbstractC17918w0.m51517e(4279244056L))), 0.0f, 0.0f, 14), null, 0.0f, 6), composer, 6);
        float f13 = 8;
        float f14 = 3 * f13;
        Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC1099a.m3398t(AbstractC1092a.m3358c(AbstractC1102d.m3409f(1.0f, c2314t), AbstractC17918w0.m51517e(4279244056L), AbstractC17918w0.f69621a), f14, 0.0f, f14, 0.0f, 10));
        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
        int iHashCode2 = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
        Modifier modifierM118962N2 = AbstractC37056f.m118962N(composer, modifierM66722k);
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(composer, c0209i, interfaceC39127r0M66763d);
        AbstractC28683x.m87239G(composer, c0209i2, interfaceC28653p1M87165m2);
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
        }
        AbstractC28683x.m87239G(composer, c0209i4, modifierM118962N2);
        C37620a c37620aM120921g = cVar.getPrimaryButton();
        C37620a c37620aM120923i = cVar.getSecondaryButton();
        boolean z4 = cVar.getNewSummary() != null;
        float f15 = 2 * f13;
        boolean zM87153g = c28655q.m87153g(function1);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            objM87133R = new C39777h(function1, 0);
            c28655q.m87172p0(objM87133R);
        }
        int i14 = TextResource.$stable | C9598e.f28134d;
        AbstractC2083h.m6593h(c37620aM120921g, c37620aM120923i, z4, f15, (Function1) objM87133R, composer, i14 | 3072 | (i14 << 3), 0);
        c28655q.m87173q(true);
        c28655q.m87173q(true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m127375Q(Function1 function1, C9598e it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new AbstractC36492a.b(it));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m127376R(AbstractC37630k.c cVar, boolean z4, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m127419x(cVar, z4, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final void m127377S(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: T */
    private static final boolean m127378T(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final void m127379U(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: V */
    private static final float m127380V(InterfaceC28690z0 interfaceC28690z0) {
        return ((C28617g1) interfaceC28690z0).m87022x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final void m127381W(InterfaceC28690z0 interfaceC28690z0, float f13) {
        ((C28617g1) interfaceC28690z0).m87023y(f13);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:103:0x0228  */
    /* JADX WARN: Code duplicated, block: B:106:0x023a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0242  */
    /* JADX WARN: Code duplicated, block: B:111:0x024e  */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x008e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:56:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:74:0x0108  */
    /* JADX WARN: Code duplicated, block: B:76:0x0110  */
    /* JADX WARN: Code duplicated, block: B:78:0x0145  */
    /* JADX WARN: Code duplicated, block: B:79:0x0147  */
    /* JADX WARN: Code duplicated, block: B:83:0x014d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0156 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:87:0x0158  */
    /* JADX WARN: Code duplicated, block: B:89:0x018c  */
    /* JADX WARN: Code duplicated, block: B:91:0x0195  */
    /* JADX WARN: Code duplicated, block: B:93:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:95:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:96:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:99:0x01e6  */
    /* JADX INFO: renamed from: X */
    public static final void m127382X(AbstractC37630k viewState, boolean z4, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        int i15;
        boolean z13;
        int i16;
        Function1 function3;
        int i17;
        int i18;
        Function1 function4;
        int i19;
        boolean z14;
        boolean z15;
        Function1 function5;
        Function1 function6;
        C28677v1 c28677v1M87180u;
        boolean z16;
        C28676v0 c28676v0;
        Function1 function7;
        Function1 function8;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R2;
        boolean z17;
        Function1 function9;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z18;
        boolean z19;
        Object objM87133R3;
        Object objM87133R4;
        Object objM87133R5;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1785074167);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i24 = i14 & 2;
        if (i24 == 0) {
            if ((i13 & 48) == 0) {
                z13 = z4;
                i15 |= c28655q.m87155h(z13) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function3 = function1;
                    if (c28655q.m87157i(function3)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        function4 = function2;
                        if (c28655q.m87157i(function4)) {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i15 |= i19;
                    }
                    if ((i15 & 1171) != 1170) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z14)) {
                        if (i24 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R5 = c28655q.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C39611k(15);
                                c28655q.m87172p0(objM87133R5);
                            }
                            function7 = (Function1) objM87133R5;
                        } else {
                            function7 = function3;
                        }
                        if (i18 != 0) {
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C39611k(17);
                                c28655q.m87172p0(objM87133R4);
                            }
                            function8 = (Function1) objM87133R4;
                        } else {
                            function8 = function4;
                        }
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC31061c.m95647w(z16, c28655q);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new c(interfaceC28601c1, null);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, C23454a0.f92919a);
                        if (viewState instanceof AbstractC37630k.c) {
                            c28655q.m87150e0(-1140132682);
                            m127419x((AbstractC37630k.c) viewState, z16, function8, c28655q, (i15 & 126) | ((i15 >> 3) & 896), 0);
                            z17 = z16;
                            function9 = function8;
                            c28655q.m87173q(false);
                        } else {
                            z17 = z16;
                            function9 = function8;
                            if (viewState instanceof AbstractC37630k.a) {
                                c28655q.m87150e0(-1139899221);
                                AbstractC33208p0.b bVar = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89935g)), false, null, 6, null);
                                TextResource textResourceM21278l = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89932d));
                                TextResource textResourceM21278l2 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89933e));
                                if ((i15 & 896) == 256) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                z19 = z18 | ((i15 & 14) == 4);
                                objM87133R3 = c28655q.m87133R();
                                if (z19 || objM87133R3 == c28676v0) {
                                    objM87133R3 = new C39689b(2, function7, viewState);
                                    c28655q.m87172p0(objM87133R3);
                                }
                                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R3;
                                int i25 = AbstractC33208p0.b.f138467h;
                                int i26 = TextResource.$stable;
                                AbstractC33199m0.m105214F(bVar, textResourceM21278l, null, textResourceM21278l2, interfaceC4339a, false, false, null, null, null, true, false, c28655q, i25 | (i26 << 3) | (i26 << 9), 6, 3044);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                            } else {
                                if (viewState.equals(AbstractC37630k.b.f161052a)) {
                                    throw AbstractC11895b.m32003v(1764336160, c28655q, false);
                                }
                                c28655q.m87150e0(-1139260342);
                                if (m127386a0(interfaceC28601c1)) {
                                    c28655q.m87150e0(-1139230861);
                                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                                    iHashCode = Long.hashCode(c28655q.f115904T);
                                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                                    InterfaceC0221l.f734a.getClass();
                                    c0213j = C0217k.f724b;
                                    c28655q.m87158i0();
                                    if (c28655q.f115903S) {
                                        c28655q.m87163l(c0213j);
                                    } else {
                                        c28655q.m87178s0();
                                    }
                                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                                    c0209i = C0217k.f732j;
                                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                                    }
                                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, true, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 6, 3068);
                                    c28655q = c28655q;
                                    c28655q.m87173q(true);
                                    c28655q.m87173q(false);
                                } else {
                                    c28655q.m87150e0(-1138808021);
                                    c28655q.m87173q(false);
                                }
                                c28655q.m87173q(false);
                            }
                        }
                        function5 = function7;
                        z15 = z17;
                        function6 = function9;
                    } else {
                        c28655q.m87138X();
                        z15 = z13;
                        function5 = function3;
                        function6 = function4;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C31919h(i13, i14, 14, viewState, function5, function6, z15);
                    }
                }
                i15 |= 3072;
                function4 = function2;
                if ((i15 & 1171) != 1170) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    if (i24 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C39611k(15);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function7 = (Function1) objM87133R5;
                    } else {
                        function7 = function3;
                    }
                    if (i18 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C39611k(17);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function8 = (Function1) objM87133R4;
                    } else {
                        function8 = function4;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC31061c.m95647w(z16, c28655q);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new c(interfaceC28601c1, null);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, C23454a0.f92919a);
                    if (viewState instanceof AbstractC37630k.c) {
                        c28655q.m87150e0(-1140132682);
                        m127419x((AbstractC37630k.c) viewState, z16, function8, c28655q, (i15 & 126) | ((i15 >> 3) & 896), 0);
                        z17 = z16;
                        function9 = function8;
                        c28655q.m87173q(false);
                    } else {
                        z17 = z16;
                        function9 = function8;
                        if (viewState instanceof AbstractC37630k.a) {
                            c28655q.m87150e0(-1139899221);
                            AbstractC33208p0.b bVar2 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89935g)), false, null, 6, null);
                            TextResource textResourceM21278l3 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89932d));
                            TextResource textResourceM21278l4 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89933e));
                            if ((i15 & 896) == 256) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            z19 = z18 | ((i15 & 14) == 4);
                            objM87133R3 = c28655q.m87133R();
                            if (z19) {
                                objM87133R3 = new C39689b(2, function7, viewState);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C39689b(2, function7, viewState);
                                c28655q.m87172p0(objM87133R3);
                            }
                            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R3;
                            int i27 = AbstractC33208p0.b.f138467h;
                            int i28 = TextResource.$stable;
                            AbstractC33199m0.m105214F(bVar2, textResourceM21278l3, null, textResourceM21278l4, interfaceC4339a2, false, false, null, null, null, true, false, c28655q, i27 | (i28 << 3) | (i28 << 9), 6, 3044);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            if (viewState.equals(AbstractC37630k.b.f161052a)) {
                                throw AbstractC11895b.m32003v(1764336160, c28655q, false);
                            }
                            c28655q.m87150e0(-1139260342);
                            if (m127386a0(interfaceC28601c1)) {
                                c28655q.m87150e0(-1139230861);
                                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                                iHashCode = Long.hashCode(c28655q.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                                InterfaceC0221l.f734a.getClass();
                                c0213j = C0217k.f724b;
                                c28655q.m87158i0();
                                if (c28655q.f115903S) {
                                    c28655q.m87163l(c0213j);
                                } else {
                                    c28655q.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
                                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                                c0209i = C0217k.f732j;
                                if (c28655q.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                                }
                                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                                AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, true, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 6, 3068);
                                c28655q = c28655q;
                                c28655q.m87173q(true);
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(-1138808021);
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(false);
                        }
                    }
                    function5 = function7;
                    z15 = z17;
                    function6 = function9;
                } else {
                    c28655q.m87138X();
                    z15 = z13;
                    function5 = function3;
                    function6 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C31919h(i13, i14, 14, viewState, function5, function6, z15);
                }
            }
            i15 |= 384;
            function3 = function1;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    function4 = function2;
                    if (c28655q.m87157i(function4)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                if ((i15 & 1171) != 1170) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    if (i24 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C39611k(15);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function7 = (Function1) objM87133R5;
                    } else {
                        function7 = function3;
                    }
                    if (i18 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C39611k(17);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function8 = (Function1) objM87133R4;
                    } else {
                        function8 = function4;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC31061c.m95647w(z16, c28655q);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new c(interfaceC28601c1, null);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, C23454a0.f92919a);
                    if (viewState instanceof AbstractC37630k.c) {
                        c28655q.m87150e0(-1140132682);
                        m127419x((AbstractC37630k.c) viewState, z16, function8, c28655q, (i15 & 126) | ((i15 >> 3) & 896), 0);
                        z17 = z16;
                        function9 = function8;
                        c28655q.m87173q(false);
                    } else {
                        z17 = z16;
                        function9 = function8;
                        if (viewState instanceof AbstractC37630k.a) {
                            c28655q.m87150e0(-1139899221);
                            AbstractC33208p0.b bVar3 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89935g)), false, null, 6, null);
                            TextResource textResourceM21278l5 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89932d));
                            TextResource textResourceM21278l6 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89933e));
                            if ((i15 & 896) == 256) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            z19 = z18 | ((i15 & 14) == 4);
                            objM87133R3 = c28655q.m87133R();
                            if (z19) {
                                objM87133R3 = new C39689b(2, function7, viewState);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C39689b(2, function7, viewState);
                                c28655q.m87172p0(objM87133R3);
                            }
                            InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R3;
                            int i29 = AbstractC33208p0.b.f138467h;
                            int i210 = TextResource.$stable;
                            AbstractC33199m0.m105214F(bVar3, textResourceM21278l5, null, textResourceM21278l6, interfaceC4339a3, false, false, null, null, null, true, false, c28655q, i29 | (i210 << 3) | (i210 << 9), 6, 3044);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            if (viewState.equals(AbstractC37630k.b.f161052a)) {
                                throw AbstractC11895b.m32003v(1764336160, c28655q, false);
                            }
                            c28655q.m87150e0(-1139260342);
                            if (m127386a0(interfaceC28601c1)) {
                                c28655q.m87150e0(-1139230861);
                                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                                iHashCode = Long.hashCode(c28655q.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                                InterfaceC0221l.f734a.getClass();
                                c0213j = C0217k.f724b;
                                c28655q.m87158i0();
                                if (c28655q.f115903S) {
                                    c28655q.m87163l(c0213j);
                                } else {
                                    c28655q.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a3);
                                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                                c0209i = C0217k.f732j;
                                if (c28655q.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                                }
                                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                                AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, true, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 6, 3068);
                                c28655q = c28655q;
                                c28655q.m87173q(true);
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(-1138808021);
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(false);
                        }
                    }
                    function5 = function7;
                    z15 = z17;
                    function6 = function9;
                } else {
                    c28655q.m87138X();
                    z15 = z13;
                    function5 = function3;
                    function6 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C31919h(i13, i14, 14, viewState, function5, function6, z15);
                }
            }
            i15 |= 3072;
            function4 = function2;
            if ((i15 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i24 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C39611k(15);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function7 = (Function1) objM87133R5;
                } else {
                    function7 = function3;
                }
                if (i18 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C39611k(17);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function8 = (Function1) objM87133R4;
                } else {
                    function8 = function4;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC31061c.m95647w(z16, c28655q);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new c(interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, C23454a0.f92919a);
                if (viewState instanceof AbstractC37630k.c) {
                    c28655q.m87150e0(-1140132682);
                    m127419x((AbstractC37630k.c) viewState, z16, function8, c28655q, (i15 & 126) | ((i15 >> 3) & 896), 0);
                    z17 = z16;
                    function9 = function8;
                    c28655q.m87173q(false);
                } else {
                    z17 = z16;
                    function9 = function8;
                    if (viewState instanceof AbstractC37630k.a) {
                        c28655q.m87150e0(-1139899221);
                        AbstractC33208p0.b bVar4 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89935g)), false, null, 6, null);
                        TextResource textResourceM21278l7 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89932d));
                        TextResource textResourceM21278l8 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89933e));
                        if ((i15 & 896) == 256) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z19 = z18 | ((i15 & 14) == 4);
                        objM87133R3 = c28655q.m87133R();
                        if (z19) {
                            objM87133R3 = new C39689b(2, function7, viewState);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C39689b(2, function7, viewState);
                            c28655q.m87172p0(objM87133R3);
                        }
                        InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R3;
                        int i211 = AbstractC33208p0.b.f138467h;
                        int i212 = TextResource.$stable;
                        AbstractC33199m0.m105214F(bVar4, textResourceM21278l7, null, textResourceM21278l8, interfaceC4339a4, false, false, null, null, null, true, false, c28655q, i211 | (i212 << 3) | (i212 << 9), 6, 3044);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        if (viewState.equals(AbstractC37630k.b.f161052a)) {
                            throw AbstractC11895b.m32003v(1764336160, c28655q, false);
                        }
                        c28655q.m87150e0(-1139260342);
                        if (m127386a0(interfaceC28601c1)) {
                            c28655q.m87150e0(-1139230861);
                            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                            iHashCode = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a4);
                            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
                            c0209i = C0217k.f732j;
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
                            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, true, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 6, 3068);
                            c28655q = c28655q;
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-1138808021);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(false);
                    }
                }
                function5 = function7;
                z15 = z17;
                function6 = function9;
            } else {
                c28655q.m87138X();
                z15 = z13;
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C31919h(i13, i14, 14, viewState, function5, function6, z15);
            }
        }
        i15 |= 48;
        z13 = z4;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function3 = function1;
                if (c28655q.m87157i(function3)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    function4 = function2;
                    if (c28655q.m87157i(function4)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                if ((i15 & 1171) != 1170) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    if (i24 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C39611k(15);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function7 = (Function1) objM87133R5;
                    } else {
                        function7 = function3;
                    }
                    if (i18 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C39611k(17);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function8 = (Function1) objM87133R4;
                    } else {
                        function8 = function4;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC31061c.m95647w(z16, c28655q);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new c(interfaceC28601c1, null);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, C23454a0.f92919a);
                    if (viewState instanceof AbstractC37630k.c) {
                        c28655q.m87150e0(-1140132682);
                        m127419x((AbstractC37630k.c) viewState, z16, function8, c28655q, (i15 & 126) | ((i15 >> 3) & 896), 0);
                        z17 = z16;
                        function9 = function8;
                        c28655q.m87173q(false);
                    } else {
                        z17 = z16;
                        function9 = function8;
                        if (viewState instanceof AbstractC37630k.a) {
                            c28655q.m87150e0(-1139899221);
                            AbstractC33208p0.b bVar5 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89935g)), false, null, 6, null);
                            TextResource textResourceM21278l9 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89932d));
                            TextResource textResourceM21278l10 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89933e));
                            if ((i15 & 896) == 256) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            z19 = z18 | ((i15 & 14) == 4);
                            objM87133R3 = c28655q.m87133R();
                            if (z19) {
                                objM87133R3 = new C39689b(2, function7, viewState);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C39689b(2, function7, viewState);
                                c28655q.m87172p0(objM87133R3);
                            }
                            InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R3;
                            int i213 = AbstractC33208p0.b.f138467h;
                            int i214 = TextResource.$stable;
                            AbstractC33199m0.m105214F(bVar5, textResourceM21278l9, null, textResourceM21278l10, interfaceC4339a5, false, false, null, null, null, true, false, c28655q, i213 | (i214 << 3) | (i214 << 9), 6, 3044);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            if (viewState.equals(AbstractC37630k.b.f161052a)) {
                                throw AbstractC11895b.m32003v(1764336160, c28655q, false);
                            }
                            c28655q.m87150e0(-1139260342);
                            if (m127386a0(interfaceC28601c1)) {
                                c28655q.m87150e0(-1139230861);
                                C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                                iHashCode = Long.hashCode(c28655q.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                                InterfaceC0221l.f734a.getClass();
                                c0213j = C0217k.f724b;
                                c28655q.m87158i0();
                                if (c28655q.f115903S) {
                                    c28655q.m87163l(c0213j);
                                } else {
                                    c28655q.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a5);
                                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m5);
                                c0209i = C0217k.f732j;
                                if (c28655q.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                                }
                                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N5);
                                AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, true, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 6, 3068);
                                c28655q = c28655q;
                                c28655q.m87173q(true);
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(-1138808021);
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(false);
                        }
                    }
                    function5 = function7;
                    z15 = z17;
                    function6 = function9;
                } else {
                    c28655q.m87138X();
                    z15 = z13;
                    function5 = function3;
                    function6 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C31919h(i13, i14, 14, viewState, function5, function6, z15);
                }
            }
            i15 |= 3072;
            function4 = function2;
            if ((i15 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i24 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C39611k(15);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function7 = (Function1) objM87133R5;
                } else {
                    function7 = function3;
                }
                if (i18 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C39611k(17);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function8 = (Function1) objM87133R4;
                } else {
                    function8 = function4;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC31061c.m95647w(z16, c28655q);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new c(interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, C23454a0.f92919a);
                if (viewState instanceof AbstractC37630k.c) {
                    c28655q.m87150e0(-1140132682);
                    m127419x((AbstractC37630k.c) viewState, z16, function8, c28655q, (i15 & 126) | ((i15 >> 3) & 896), 0);
                    z17 = z16;
                    function9 = function8;
                    c28655q.m87173q(false);
                } else {
                    z17 = z16;
                    function9 = function8;
                    if (viewState instanceof AbstractC37630k.a) {
                        c28655q.m87150e0(-1139899221);
                        AbstractC33208p0.b bVar6 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89935g)), false, null, 6, null);
                        TextResource textResourceM21278l11 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89932d));
                        TextResource textResourceM21278l12 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89933e));
                        if ((i15 & 896) == 256) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z19 = z18 | ((i15 & 14) == 4);
                        objM87133R3 = c28655q.m87133R();
                        if (z19) {
                            objM87133R3 = new C39689b(2, function7, viewState);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C39689b(2, function7, viewState);
                            c28655q.m87172p0(objM87133R3);
                        }
                        InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R3;
                        int i215 = AbstractC33208p0.b.f138467h;
                        int i216 = TextResource.$stable;
                        AbstractC33199m0.m105214F(bVar6, textResourceM21278l11, null, textResourceM21278l12, interfaceC4339a6, false, false, null, null, null, true, false, c28655q, i215 | (i216 << 3) | (i216 << 9), 6, 3044);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        if (viewState.equals(AbstractC37630k.b.f161052a)) {
                            throw AbstractC11895b.m32003v(1764336160, c28655q, false);
                        }
                        c28655q.m87150e0(-1139260342);
                        if (m127386a0(interfaceC28601c1)) {
                            c28655q.m87150e0(-1139230861);
                            C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                            iHashCode = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a6);
                            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m6);
                            c0209i = C0217k.f732j;
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N6);
                            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, true, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 6, 3068);
                            c28655q = c28655q;
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-1138808021);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(false);
                    }
                }
                function5 = function7;
                z15 = z17;
                function6 = function9;
            } else {
                c28655q.m87138X();
                z15 = z13;
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C31919h(i13, i14, 14, viewState, function5, function6, z15);
            }
        }
        i15 |= 384;
        function3 = function1;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                function4 = function2;
                if (c28655q.m87157i(function4)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            if ((i15 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i24 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C39611k(15);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function7 = (Function1) objM87133R5;
                } else {
                    function7 = function3;
                }
                if (i18 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C39611k(17);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function8 = (Function1) objM87133R4;
                } else {
                    function8 = function4;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC31061c.m95647w(z16, c28655q);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new c(interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, C23454a0.f92919a);
                if (viewState instanceof AbstractC37630k.c) {
                    c28655q.m87150e0(-1140132682);
                    m127419x((AbstractC37630k.c) viewState, z16, function8, c28655q, (i15 & 126) | ((i15 >> 3) & 896), 0);
                    z17 = z16;
                    function9 = function8;
                    c28655q.m87173q(false);
                } else {
                    z17 = z16;
                    function9 = function8;
                    if (viewState instanceof AbstractC37630k.a) {
                        c28655q.m87150e0(-1139899221);
                        AbstractC33208p0.b bVar7 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89935g)), false, null, 6, null);
                        TextResource textResourceM21278l13 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89932d));
                        TextResource textResourceM21278l14 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89933e));
                        if ((i15 & 896) == 256) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z19 = z18 | ((i15 & 14) == 4);
                        objM87133R3 = c28655q.m87133R();
                        if (z19) {
                            objM87133R3 = new C39689b(2, function7, viewState);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C39689b(2, function7, viewState);
                            c28655q.m87172p0(objM87133R3);
                        }
                        InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) objM87133R3;
                        int i217 = AbstractC33208p0.b.f138467h;
                        int i218 = TextResource.$stable;
                        AbstractC33199m0.m105214F(bVar7, textResourceM21278l13, null, textResourceM21278l14, interfaceC4339a7, false, false, null, null, null, true, false, c28655q, i217 | (i218 << 3) | (i218 << 9), 6, 3044);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        if (viewState.equals(AbstractC37630k.b.f161052a)) {
                            throw AbstractC11895b.m32003v(1764336160, c28655q, false);
                        }
                        c28655q.m87150e0(-1139260342);
                        if (m127386a0(interfaceC28601c1)) {
                            c28655q.m87150e0(-1139230861);
                            C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                            iHashCode = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a7);
                            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m7);
                            c0209i = C0217k.f732j;
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N7);
                            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, true, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 6, 3068);
                            c28655q = c28655q;
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-1138808021);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(false);
                    }
                }
                function5 = function7;
                z15 = z17;
                function6 = function9;
            } else {
                c28655q.m87138X();
                z15 = z13;
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C31919h(i13, i14, 14, viewState, function5, function6, z15);
            }
        }
        i15 |= 3072;
        function4 = function2;
        if ((i15 & 1171) != 1170) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            if (i24 != 0) {
                z16 = false;
            } else {
                z16 = z13;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C39611k(15);
                    c28655q.m87172p0(objM87133R5);
                }
                function7 = (Function1) objM87133R5;
            } else {
                function7 = function3;
            }
            if (i18 != 0) {
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C39611k(17);
                    c28655q.m87172p0(objM87133R4);
                }
                function8 = (Function1) objM87133R4;
            } else {
                function8 = function4;
            }
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC31061c.m95647w(z16, c28655q);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new c(interfaceC28601c1, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, C23454a0.f92919a);
            if (viewState instanceof AbstractC37630k.c) {
                c28655q.m87150e0(-1140132682);
                m127419x((AbstractC37630k.c) viewState, z16, function8, c28655q, (i15 & 126) | ((i15 >> 3) & 896), 0);
                z17 = z16;
                function9 = function8;
                c28655q.m87173q(false);
            } else {
                z17 = z16;
                function9 = function8;
                if (viewState instanceof AbstractC37630k.a) {
                    c28655q.m87150e0(-1139899221);
                    AbstractC33208p0.b bVar8 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89935g)), false, null, 6, null);
                    TextResource textResourceM21278l15 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89932d));
                    TextResource textResourceM21278l16 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89933e));
                    if ((i15 & 896) == 256) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = z18 | ((i15 & 14) == 4);
                    objM87133R3 = c28655q.m87133R();
                    if (z19) {
                        objM87133R3 = new C39689b(2, function7, viewState);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C39689b(2, function7, viewState);
                        c28655q.m87172p0(objM87133R3);
                    }
                    InterfaceC4339a interfaceC4339a8 = (InterfaceC4339a) objM87133R3;
                    int i219 = AbstractC33208p0.b.f138467h;
                    int i2110 = TextResource.$stable;
                    AbstractC33199m0.m105214F(bVar8, textResourceM21278l15, null, textResourceM21278l16, interfaceC4339a8, false, false, null, null, null, true, false, c28655q, i219 | (i2110 << 3) | (i2110 << 9), 6, 3044);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    if (viewState.equals(AbstractC37630k.b.f161052a)) {
                        throw AbstractC11895b.m32003v(1764336160, c28655q, false);
                    }
                    c28655q.m87150e0(-1139260342);
                    if (m127386a0(interfaceC28601c1)) {
                        c28655q.m87150e0(-1139230861);
                        C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                        Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a8);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m8);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N8);
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, true, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 6, 3068);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-1138808021);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                }
            }
            function5 = function7;
            z15 = z17;
            function6 = function9;
        } else {
            c28655q.m87138X();
            z15 = z13;
            function5 = function3;
            function6 = function4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C31919h(i13, i14, 14, viewState, function5, function6, z15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C23454a0 m127383Y(AbstractC37628i it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m127384Z(AbstractC36492a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: a0 */
    private static final boolean m127386a0(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final void m127388b0(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final C23454a0 m127390c0(Function1 function1, AbstractC37630k abstractC37630k) {
        function1.invoke(new AbstractC37628i.b(((AbstractC37630k.a) abstractC37630k).getPlanId()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final C23454a0 m127392d0(AbstractC37630k abstractC37630k, boolean z4, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m127382X(abstractC37630k, z4, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t */
    private static final void m127415t(AbstractC22403o abstractC22403o, Composer composer, int i13) {
        int i14;
        AbstractC22403o abstractC22403o2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1185702167);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(abstractC22403o) : c28655q.m87157i(abstractC22403o) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(300, c2314t));
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
            float f13 = 2 * 8;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1099a.m3394p(f13, AbstractC1102d.m3407d(1.0f, c2314t)), 0.0f, 0.0f, 0.0f, f13, 7);
            AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q, AbstractC22403o.f87638a | (i14 & 14), 3);
            abstractC22403o2 = abstractC22403o;
            AbstractC29125c.m88522c(abstractC26165aM64500i, null, modifierM3398t, null, C39102j.f168200b, 0.0f, null, c28655q, 25008, 104);
            c28655q = c28655q;
            AbstractC18489d0.m53356B(c28655q, true, c2314t, f13, c28655q);
        } else {
            abstractC22403o2 = abstractC22403o;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11678d(abstractC22403o2, i13, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m127416u(AbstractC22403o abstractC22403o, int i13, Composer composer, int i14) {
        m127415t(abstractC22403o, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: v */
    private static final void m127417v(C37622c c37622c, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-811178298);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(c37622c) : c28655q.m87157i(c37622c) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
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
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9107J, c28655q, 6);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
            TextResource textResourceM120894c = c37622c.getTitle();
            int i15 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM120894c, c28655q, i15);
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            C2886a c2886aM8414L = c38072d.m121952e(c28655q, i16).getSh4();
            long jM125385c1 = c38072d.m121949b(c28655q, i16).getWhite70();
            int i17 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, null, jM125385c1, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8414L, null, c28655q, 0, i17, 196602);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c37622c.getRightLabel(), c28655q, i15), null, c38072d.m121949b(c28655q, i16).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getSh4(), null, c28655q, 0, i17, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
            float f13 = 1 * 4;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13, c2314t));
            AbstractC24821f.m72736b(null, c37622c.getPercentValue(), 100, AbstractC15673b0.m43989I0(), c38072d.m121949b(c28655q, i16).getWhite10(), false, f13, c28655q, 1769856, 1);
            AbstractC25012a.m73388u(3, 8, c2314t, c28655q, true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37564y(c37622c, i13, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m127418w(C37622c c37622c, int i13, Composer composer, int i14) {
        m127417v(c37622c, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:101:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:104:0x0251  */
    /* JADX WARN: Code duplicated, block: B:105:0x0255  */
    /* JADX WARN: Code duplicated, block: B:110:0x0270  */
    /* JADX WARN: Code duplicated, block: B:114:0x0285  */
    /* JADX WARN: Code duplicated, block: B:116:0x0288  */
    /* JADX WARN: Code duplicated, block: B:117:0x0291  */
    /* JADX WARN: Code duplicated, block: B:120:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:121:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:125:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:129:0x0316  */
    /* JADX WARN: Code duplicated, block: B:132:0x033c  */
    /* JADX WARN: Code duplicated, block: B:133:0x0340  */
    /* JADX WARN: Code duplicated, block: B:138:0x035b  */
    /* JADX WARN: Code duplicated, block: B:141:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:142:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:147:0x03df  */
    /* JADX WARN: Code duplicated, block: B:150:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:151:0x0408  */
    /* JADX WARN: Code duplicated, block: B:153:0x0416  */
    /* JADX WARN: Code duplicated, block: B:154:0x0422  */
    /* JADX WARN: Code duplicated, block: B:157:0x0446  */
    /* JADX WARN: Code duplicated, block: B:158:0x044a  */
    /* JADX WARN: Code duplicated, block: B:163:0x0465  */
    /* JADX WARN: Code duplicated, block: B:167:0x047e  */
    /* JADX WARN: Code duplicated, block: B:168:0x048c  */
    /* JADX WARN: Code duplicated, block: B:170:0x0498  */
    /* JADX WARN: Code duplicated, block: B:173:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:174:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:179:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:182:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:184:0x0505  */
    /* JADX WARN: Code duplicated, block: B:185:0x0511  */
    /* JADX WARN: Code duplicated, block: B:187:0x0527  */
    /* JADX WARN: Code duplicated, block: B:190:0x0553  */
    /* JADX WARN: Code duplicated, block: B:191:0x0557  */
    /* JADX WARN: Code duplicated, block: B:196:0x0572  */
    /* JADX WARN: Code duplicated, block: B:199:0x058c  */
    /* JADX WARN: Code duplicated, block: B:203:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:206:0x060d  */
    /* JADX WARN: Code duplicated, block: B:207:0x061e  */
    /* JADX WARN: Code duplicated, block: B:209:0x064c  */
    /* JADX WARN: Code duplicated, block: B:210:0x0650  */
    /* JADX WARN: Code duplicated, block: B:215:0x066b  */
    /* JADX WARN: Code duplicated, block: B:218:0x068f  */
    /* JADX WARN: Code duplicated, block: B:221:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:224:0x06da  */
    /* JADX WARN: Code duplicated, block: B:226:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:44:0x0098  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:69:0x010e  */
    /* JADX WARN: Code duplicated, block: B:70:0x0110  */
    /* JADX WARN: Code duplicated, block: B:73:0x0118  */
    /* JADX WARN: Code duplicated, block: B:75:0x011f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0145  */
    /* JADX WARN: Code duplicated, block: B:81:0x0159  */
    /* JADX WARN: Code duplicated, block: B:84:0x016c  */
    /* JADX WARN: Code duplicated, block: B:85:0x0170  */
    /* JADX WARN: Code duplicated, block: B:87:0x0174  */
    /* JADX WARN: Code duplicated, block: B:88:0x017b  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:92:0x01be  */
    /* JADX WARN: Code duplicated, block: B:97:0x01df  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x */
    private static final void m127419x(AbstractC37630k.c cVar, boolean z4, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        int i16;
        boolean z13;
        AbstractC37630k.c cVar2;
        Function1 function3;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        float f13;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c2;
        Object objM87133R3;
        InterfaceC28690z0 interfaceC28690z0;
        Object objM87133R4;
        InterfaceC28601c1 interfaceC28601c3;
        boolean z14;
        Object aVar;
        InterfaceC28690z0 interfaceC28690z1;
        boolean z15;
        InterfaceC28601c1 interfaceC28601c4;
        InterfaceC28601c1 interfaceC28601c5;
        C23454a0 c23454a0;
        float f14;
        InterfaceC11372l interfaceC11372lM30574v;
        InterfaceC28690z0 interfaceC28690z2;
        InterfaceC28670t2 interfaceC28670t2M30587a;
        Object objM87133R5;
        InterfaceC28601c1 interfaceC28601c6;
        Object objM87133R6;
        float f15;
        char c3;
        InterfaceC11372l interfaceC11372lM30574v2;
        C2314t c2314t;
        C2307m c2307m;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C0209i c0209i4;
        Object objM87133R7;
        final InterfaceC28690z0 interfaceC28690z3;
        InterfaceC28690z0 interfaceC28690z4;
        int iHashCode2;
        TextResource textResourceM120924j;
        C27656a c27656a;
        boolean z16;
        Object objM87133R8;
        Function1 function5;
        int iHashCode3;
        int iHashCode4;
        C37622c c37622cM120915a;
        Object objM87133R9;
        C28676v0 c28676v1;
        final InterfaceC28690z0 interfaceC28690z5;
        int iHashCode5;
        boolean z17;
        AbstractC22403o abstractC22403oM120919e;
        Object objM87133R10;
        C2307m c2307m2;
        int iHashCode6;
        boolean z18;
        C23454a0 c23454a1;
        InterfaceC11419z interfaceC11419z;
        int i17;
        int iMo743q0;
        boolean zM87149e;
        Object objM87133R11;
        C2307m c2307m3;
        C28676v0 c28676v2;
        C28655q c28655q2;
        int iHashCode7;
        Object objM87133R12;
        Function1 function6;
        boolean z19;
        C28655q c28655q3;
        Object objM87133R13;
        int iHashCode8;
        boolean z24;
        float f16;
        Object objM87133R14;
        C28655q c28655q4 = (C28655q) composer;
        c28655q4.m87154g0(2141388040);
        if ((i13 & 6) == 0) {
            i15 = (c28655q4.m87157i(cVar) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q4.m87155h(z4) ? 32 : 16;
        }
        int i18 = i14 & 4;
        if (i18 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q4.m87157i(function2) ? 256 : 128;
            }
            i16 = i15;
            if ((i16 & 147) != 146) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q4.m87135U(i16 & 1, z13)) {
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R14 = c28655q4.m87133R();
                    if (objM87133R14 == c28676v0) {
                        objM87133R14 = new C39611k(18);
                        c28655q4.m87172p0(objM87133R14);
                    }
                    function4 = (Function1) objM87133R14;
                } else {
                    function4 = function2;
                }
                float f17 = 4;
                f13 = ((((Configuration) c28655q4.m87161k(AndroidCompositionLocals_androidKt.f4975a)).screenHeightDp - 180) / 2) - (36 * f17);
                objM87133R = c28655q4.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC31061c.m95647w(z4, c28655q4);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q4.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC31061c.m95647w(z4, c28655q4);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q4.m87133R();
                if (objM87133R3 == c28676v0) {
                    if (z4) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    objM87133R3 = AbstractC11266d.m30468v(f16, c28655q4);
                }
                interfaceC28690z0 = (InterfaceC28690z0) objM87133R3;
                objM87133R4 = c28655q4.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC31061c.m95647w(z4, c28655q4);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R4;
                if ((i16 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                Object objM87133R15 = c28655q4.m87133R();
                if (!z14 || objM87133R15 == c28676v0) {
                    interfaceC28690z1 = interfaceC28690z0;
                    aVar = new a(z4, interfaceC28601c3, interfaceC28690z1, interfaceC28601c1, interfaceC28601c2, null);
                    z15 = z4;
                    interfaceC28601c4 = interfaceC28601c3;
                    interfaceC28601c5 = interfaceC28601c1;
                    c28655q4.m87172p0(aVar);
                } else {
                    z15 = z4;
                    aVar = objM87133R15;
                    interfaceC28601c5 = interfaceC28601c1;
                    interfaceC28690z1 = interfaceC28690z0;
                    interfaceC28601c4 = interfaceC28601c3;
                }
                c23454a0 = C23454a0.f92919a;
                AbstractC28683x.m87253g(c28655q4, (InterfaceC4351m) aVar, c23454a0);
                if (m127364F(interfaceC28601c5)) {
                    f14 = 0;
                } else {
                    f14 = f13;
                }
                if (z15) {
                    interfaceC11372lM30574v = AbstractC11348f.m30572t();
                } else {
                    interfaceC11372lM30574v = AbstractC11348f.m30574v(600, 0, null, 6);
                }
                interfaceC28690z2 = interfaceC28690z1;
                interfaceC28670t2M30587a = AbstractC11352g.m30587a(f14, interfaceC11372lM30574v, "GaugeOffsetY", c28655q4, 384, 8);
                objM87133R5 = c28655q4.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC31061c.m95647w(z15, c28655q4);
                }
                interfaceC28601c6 = (InterfaceC28601c1) objM87133R5;
                Boolean boolValueOf = Boolean.valueOf(m127364F(interfaceC28601c5));
                objM87133R6 = c28655q4.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new b(interfaceC28601c5, interfaceC28601c6, null);
                    c28655q4.m87172p0(objM87133R6);
                }
                AbstractC28683x.m87253g(c28655q4, (InterfaceC4351m) objM87133R6, boolValueOf);
                if (m127421z(interfaceC28601c4)) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                if (z15) {
                    interfaceC11372lM30574v2 = AbstractC11348f.m30572t();
                    c3 = 6;
                } else {
                    c3 = 6;
                    interfaceC11372lM30574v2 = AbstractC11348f.m30574v(600, 0, null, 6);
                }
                InterfaceC28670t2 interfaceC28670t2M30588b = AbstractC11352g.m30588b(f15, interfaceC11372lM30574v2, "ToolbarAlpha", null, c28655q4, 3072, 20);
                c2314t = C2314t.f9131w;
                Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
                c2307m = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                iHashCode = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q4.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q4, modifierM3407d);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC39127r0M66763d);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m);
                c0209i3 = C0217k.f732j;
                if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N);
                Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, c2314t);
                objM87133R7 = c28655q4.m87133R();
                if (objM87133R7 == c28676v0) {
                    final int i19 = 0;
                    interfaceC28690z3 = interfaceC28690z2;
                    objM87133R7 = new Function1() { // from class: yt2.i
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i19) {
                                case 0:
                                    return AbstractC39780k.m127365G(interfaceC28690z3, (InterfaceC17886g0) obj);
                                case 1:
                                    return AbstractC39780k.m127367I(interfaceC28690z3, (InterfaceC17886g0) obj);
                                default:
                                    return AbstractC39780k.m127368J(interfaceC28690z3, (InterfaceC17886g0) obj);
                            }
                        }
                    };
                    c28655q4.m87172p0(objM87133R7);
                } else {
                    interfaceC28690z3 = interfaceC28690z2;
                }
                interfaceC28690z4 = interfaceC28690z3;
                AbstractC22953f.m66714a(AbstractC1127a.m3486a(modifierM3407d2, (Function1) objM87133R7), null, false, C39770a.f171309a.m127320b(), c28655q4, 3078, 6);
                Modifier modifierM7154a = AbstractC2294a.m7154a(1.0f, AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t)));
                C22957g c22957g = AbstractC22977m.f90652c;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, C2299e.f9110M, c28655q4, 0);
                iHashCode2 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q4.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q4, modifierM7154a);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N2);
                TextResource textResourceM120925k = cVar.getTitle();
                textResourceM120924j = cVar.getSubtitle();
                if (!AbstractC8693b.m21270d(textResourceM120924j)) {
                    textResourceM120924j = null;
                }
                if (textResourceM120924j != null) {
                    c27656a = new C27656a(textResourceM120924j, false);
                } else {
                    c27656a = null;
                }
                AbstractC6721d.a aVar2 = new AbstractC6721d.a(textResourceM120925k, c27656a, AbstractC38963t7.m124375e(C38072d.f163053a), AbstractC30060g.m92103Y(c28655q4, AbstractC35283c.f150167E), null, null, null, null, false, null, null, null, null, null, null, null, 65520, null);
                Modifier modifierM107879c = AbstractC34132o.m107879c(m127363E(interfaceC28670t2M30588b), AbstractC1102d.m3409f(1.0f, c2314t));
                if ((i16 & 896) == 256) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objM87133R8 = c28655q4.m87133R();
                if (z16 || objM87133R8 == c28676v0) {
                    objM87133R8 = new C39771b(function4, 3);
                    c28655q4.m87172p0(objM87133R8);
                }
                function5 = function4;
                AbstractC6719b.m20143d(modifierM107879c, aVar2, null, (InterfaceC4339a) objM87133R8, null, null, c28655q4, AbstractC6721d.a.f25641r << 3, 52);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM124374d = AbstractC38963t7.m124374d(1.0f, 1.0f, true);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                iHashCode3 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q4.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q4, modifierM124374d);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m3);
                if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N3);
                Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q4, 1), 14), f17 * f17, 0.0f, 2);
                C13404j c13404jM120922h = cVar.getScreenContextMetadata();
                int i24 = C13404j.f46947x << 3;
                Modifier modifierM34108a = AbstractC12248d.m34108a(AbstractC12250f.m34129b(modifierM3396r, c13404jM120922h, false, c28655q4, i24, 2), cVar.getScreenContextMetadata(), 21 * 8, false, c28655q4, i24 | 384, 4);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, C2299e.f9111N, c28655q4, 48);
                iHashCode4 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q4.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q4, modifierM34108a);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m4);
                if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode4))) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N4);
                AbstractC22953f.m66715b(c28655q4, AbstractC1102d.m3411h(5 * f17, c2314t));
                c37622cM120915a = cVar.getChallengeProgressBar();
                if (c37622cM120915a == null) {
                    c28655q4.m87150e0(-291023748);
                    c28655q4.m87173q(false);
                    z17 = false;
                    c28676v1 = c28676v0;
                    interfaceC28690z5 = interfaceC28690z4;
                } else {
                    c28655q4.m87150e0(-291023747);
                    objM87133R9 = c28655q4.m87133R();
                    if (objM87133R9 == c28676v1) {
                        c28676v1 = c28676v0;
                        final int i25 = 1;
                        interfaceC28690z5 = interfaceC28690z4;
                        objM87133R9 = new Function1() { // from class: yt2.i
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                switch (i25) {
                                    case 0:
                                        return AbstractC39780k.m127365G(interfaceC28690z5, (InterfaceC17886g0) obj);
                                    case 1:
                                        return AbstractC39780k.m127367I(interfaceC28690z5, (InterfaceC17886g0) obj);
                                    default:
                                        return AbstractC39780k.m127368J(interfaceC28690z5, (InterfaceC17886g0) obj);
                                }
                            }
                        };
                        c28655q4.m87172p0(objM87133R9);
                    } else {
                        c28676v1 = c28676v0;
                        interfaceC28690z5 = interfaceC28690z4;
                    }
                    Modifier modifierM3486a = AbstractC1127a.m3486a(c2314t, (Function1) objM87133R9);
                    InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode5 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q4.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q4, modifierM3486a);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC39127r0M66763d3);
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m5);
                    if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode5))) {
                        AbstractC11266d.m30471y(iHashCode5, c28655q4, iHashCode5, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N5);
                    m127417v(c37622cM120915a, c28655q4, TextResource.$stable);
                    c28655q4.m87173q(true);
                    z17 = false;
                    c28655q4.m87173q(false);
                }
                abstractC22403oM120919e = cVar.getOverrideImage();
                if (abstractC22403oM120919e == null) {
                    c28655q4.m87150e0(-290778662);
                    c28655q4.m87173q(z17);
                    z18 = z17;
                    c2307m2 = c2307m;
                    c23454a1 = null;
                } else {
                    c28655q4.m87150e0(-290778661);
                    objM87133R10 = c28655q4.m87133R();
                    if (objM87133R10 == c28676v1) {
                        final int i26 = 2;
                        objM87133R10 = new Function1() { // from class: yt2.i
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                switch (i26) {
                                    case 0:
                                        return AbstractC39780k.m127365G(interfaceC28690z5, (InterfaceC17886g0) obj);
                                    case 1:
                                        return AbstractC39780k.m127367I(interfaceC28690z5, (InterfaceC17886g0) obj);
                                    default:
                                        return AbstractC39780k.m127368J(interfaceC28690z5, (InterfaceC17886g0) obj);
                                }
                            }
                        };
                        c28655q4.m87172p0(objM87133R10);
                    }
                    Modifier modifierM3486a2 = AbstractC1127a.m3486a(c2314t, (Function1) objM87133R10);
                    c2307m2 = r9;
                    InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m2, false);
                    iHashCode6 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q4.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q4, modifierM3486a2);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC39127r0M66763d4);
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m6);
                    if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode6))) {
                        AbstractC11266d.m30471y(iHashCode6, c28655q4, iHashCode6, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N6);
                    m127415t(abstractC22403oM120919e, c28655q4, AbstractC22403o.f87638a);
                    c28655q4.m87173q(true);
                    z18 = false;
                    c28655q4.m87173q(false);
                    c23454a1 = c23454a0;
                }
                if (c23454a1 == null) {
                    c28655q4.m87150e0(-290553353);
                    if (cVar.getPercentageGauge() == null) {
                        c28655q4.m87150e0(1473614697);
                        c28655q4.m87173q(z18);
                        interfaceC11419z = null;
                        z24 = z18;
                    } else {
                        c28655q4.m87150e0(1473614698);
                        Modifier modifierM3392n = AbstractC1099a.m3392n(c2314t, 0.0f, m127360B(interfaceC28670t2M30587a), 1);
                        objM87133R13 = c28655q4.m87133R();
                        if (objM87133R13 == c28676v1) {
                            objM87133R13 = new C36553a(25);
                            c28655q4.m87172p0(objM87133R13);
                        }
                        Modifier modifierM3498b = AbstractC1131a.m3498b(modifierM3392n, (Function3) objM87133R13);
                        InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9115x, false);
                        iHashCode8 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q4.m87165m();
                        Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q4, modifierM3498b);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC39127r0M66763d5);
                        AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m7);
                        if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode8))) {
                            AbstractC11266d.m30471y(iHashCode8, c28655q4, iHashCode8, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N7);
                        interfaceC11419z = null;
                        z24 = false;
                        AbstractC14893g.m42994a(cVar.getPercentageGauge(), null, c28655q4, 0);
                        c28655q4.m87173q(true);
                        c28655q4.m87173q(false);
                    }
                    c28655q4.m87173q(z24);
                    i17 = z24;
                } else {
                    interfaceC11419z = null;
                    c28655q4.m87150e0(-147927182);
                    c28655q4.m87173q(z18);
                    i17 = z18;
                }
                iMo743q0 = (int) ((InterfaceC39171c) c28655q4.m87161k(AbstractC2453v1.f9569h)).mo743q0(40);
                boolean zM127361C = m127361C(interfaceC28601c6);
                C3733d1 c3733d1M11577e = AbstractC3788w0.m11577e(AbstractC11348f.m30574v(600, i17, interfaceC11419z, 6), 2);
                C11347e2 c11347e2M30574v = AbstractC11348f.m30574v(600, i17, interfaceC11419z, 6);
                zM87149e = c28655q4.m87149e(iMo743q0);
                objM87133R11 = c28655q4.m87133R();
                if (zM87149e || objM87133R11 == c28676v1) {
                    objM87133R11 = new C39775f(iMo743q0, 0);
                    c28655q4.m87172p0(objM87133R11);
                }
                c2307m3 = c2307m2;
                c28676v2 = c28676v1;
                AbstractC1090b.m3351f(zM127361C, null, c3733d1M11577e.m11562a(AbstractC3788w0.m11587o(c11347e2M30574v, (Function1) objM87133R11)), null, null, AbstractC37817c.m121344e(1358924504, c28655q4, new C39776g(cVar, 0)), c28655q4, ProfileVerifier.CompilationStatus.f6515xf2722a21, 26);
                c28655q2 = c28655q4;
                c28655q2.m87173q(true);
                if (cVar.getPrimaryButton() == null) {
                    c28655q2.m87150e0(1528477094);
                    c28655q2.m87173q(false);
                    z19 = true;
                    cVar2 = cVar;
                    function6 = function5;
                    c28655q3 = c28655q2;
                } else {
                    c28655q2.m87150e0(1528477095);
                    Modifier modifierMo3400a = C1100b.f4583a.mo3400a(AbstractC1102d.m3409f(1.0f, c2314t), C2299e.f9105H);
                    InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(c2307m3, false);
                    iHashCode7 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q2.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q2, modifierMo3400a);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d6);
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m8);
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode7))) {
                        AbstractC11266d.m30471y(iHashCode7, c28655q2, iHashCode7, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N8);
                    boolean zM127378T = m127378T(interfaceC28601c2);
                    C3733d1 c3733d1M11577e2 = AbstractC3788w0.m11577e(AbstractC11348f.m30574v(600, 0, null, 6), 2);
                    C11347e2 c11347e2M30574v2 = AbstractC11348f.m30574v(600, 0, null, 6);
                    objM87133R12 = c28655q2.m87133R();
                    if (objM87133R12 == c28676v2) {
                        objM87133R12 = new C39611k(16);
                        c28655q2.m87172p0(objM87133R12);
                    }
                    cVar2 = cVar;
                    function6 = function5;
                    AbstractC1090b.m3351f(zM127378T, null, c3733d1M11577e2.m11562a(AbstractC3788w0.m11587o(c11347e2M30574v2, (Function1) objM87133R12)), null, null, AbstractC37817c.m121344e(1688846516, c28655q2, new C36538d(15, cVar2, function6)), c28655q2, ProfileVerifier.CompilationStatus.f6515xf2722a21, 26);
                    C28655q c28655q5 = c28655q2;
                    z19 = true;
                    c28655q5.m87173q(true);
                    c28655q5.m87173q(false);
                    c28655q3 = c28655q5;
                }
                AbstractC25012a.m73392y(c28655q3, z19, z19, z19);
                function3 = function6;
                c28655q = c28655q3;
            } else {
                cVar2 = cVar;
                C28655q c28655q6 = c28655q4;
                c28655q6.m87138X();
                function3 = function2;
                c28655q = c28655q6;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32676t1(cVar2, z4, function3, i13, i14, 9);
            }
        }
        i15 |= 384;
        function2 = function1;
        i16 = i15;
        if ((i16 & 147) != 146) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q4.m87135U(i16 & 1, z13)) {
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R14 = c28655q4.m87133R();
                if (objM87133R14 == c28676v0) {
                    objM87133R14 = new C39611k(18);
                    c28655q4.m87172p0(objM87133R14);
                }
                function4 = (Function1) objM87133R14;
            } else {
                function4 = function2;
            }
            float f18 = 4;
            f13 = ((((Configuration) c28655q4.m87161k(AndroidCompositionLocals_androidKt.f4975a)).screenHeightDp - 180) / 2) - (36 * f18);
            objM87133R = c28655q4.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC31061c.m95647w(z4, c28655q4);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            objM87133R2 = c28655q4.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC31061c.m95647w(z4, c28655q4);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
            objM87133R3 = c28655q4.m87133R();
            if (objM87133R3 == c28676v0) {
                if (z4) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                objM87133R3 = AbstractC11266d.m30468v(f16, c28655q4);
            }
            interfaceC28690z0 = (InterfaceC28690z0) objM87133R3;
            objM87133R4 = c28655q4.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = AbstractC31061c.m95647w(z4, c28655q4);
            }
            interfaceC28601c3 = (InterfaceC28601c1) objM87133R4;
            if ((i16 & 112) == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            Object objM87133R16 = c28655q4.m87133R();
            if (z14) {
                interfaceC28690z1 = interfaceC28690z0;
                aVar = new a(z4, interfaceC28601c3, interfaceC28690z1, interfaceC28601c1, interfaceC28601c2, null);
                z15 = z4;
                interfaceC28601c4 = interfaceC28601c3;
                interfaceC28601c5 = interfaceC28601c1;
                c28655q4.m87172p0(aVar);
            } else {
                interfaceC28690z1 = interfaceC28690z0;
                aVar = new a(z4, interfaceC28601c3, interfaceC28690z1, interfaceC28601c1, interfaceC28601c2, null);
                z15 = z4;
                interfaceC28601c4 = interfaceC28601c3;
                interfaceC28601c5 = interfaceC28601c1;
                c28655q4.m87172p0(aVar);
            }
            c23454a0 = C23454a0.f92919a;
            AbstractC28683x.m87253g(c28655q4, (InterfaceC4351m) aVar, c23454a0);
            if (m127364F(interfaceC28601c5)) {
                f14 = 0;
            } else {
                f14 = f13;
            }
            if (z15) {
                interfaceC11372lM30574v = AbstractC11348f.m30572t();
            } else {
                interfaceC11372lM30574v = AbstractC11348f.m30574v(600, 0, null, 6);
            }
            interfaceC28690z2 = interfaceC28690z1;
            interfaceC28670t2M30587a = AbstractC11352g.m30587a(f14, interfaceC11372lM30574v, "GaugeOffsetY", c28655q4, 384, 8);
            objM87133R5 = c28655q4.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = AbstractC31061c.m95647w(z15, c28655q4);
            }
            interfaceC28601c6 = (InterfaceC28601c1) objM87133R5;
            Boolean boolValueOf2 = Boolean.valueOf(m127364F(interfaceC28601c5));
            objM87133R6 = c28655q4.m87133R();
            if (objM87133R6 == c28676v0) {
                objM87133R6 = new b(interfaceC28601c5, interfaceC28601c6, null);
                c28655q4.m87172p0(objM87133R6);
            }
            AbstractC28683x.m87253g(c28655q4, (InterfaceC4351m) objM87133R6, boolValueOf2);
            if (m127421z(interfaceC28601c4)) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            if (z15) {
                interfaceC11372lM30574v2 = AbstractC11348f.m30572t();
                c3 = 6;
            } else {
                c3 = 6;
                interfaceC11372lM30574v2 = AbstractC11348f.m30574v(600, 0, null, 6);
            }
            InterfaceC28670t2 interfaceC28670t2M30588b2 = AbstractC11352g.m30588b(f15, interfaceC11372lM30574v2, "ToolbarAlpha", null, c28655q4, 3072, 20);
            c2314t = C2314t.f9131w;
            Modifier modifierM3407d3 = AbstractC1102d.m3407d(1.0f, c2314t);
            c2307m = C2299e.f9114w;
            InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(c2307m, false);
            iHashCode = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q4.m87165m();
            Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q4, modifierM3407d3);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(c0213j);
            } else {
                c28655q4.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC39127r0M66763d7);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m9);
            c0209i3 = C0217k.f732j;
            if (c28655q4.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i3);
            }
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N9);
            Modifier modifierM3407d4 = AbstractC1102d.m3407d(1.0f, c2314t);
            objM87133R7 = c28655q4.m87133R();
            if (objM87133R7 == c28676v0) {
                final int i110 = 0;
                interfaceC28690z3 = interfaceC28690z2;
                objM87133R7 = new Function1() { // from class: yt2.i
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i110) {
                            case 0:
                                return AbstractC39780k.m127365G(interfaceC28690z3, (InterfaceC17886g0) obj);
                            case 1:
                                return AbstractC39780k.m127367I(interfaceC28690z3, (InterfaceC17886g0) obj);
                            default:
                                return AbstractC39780k.m127368J(interfaceC28690z3, (InterfaceC17886g0) obj);
                        }
                    }
                };
                c28655q4.m87172p0(objM87133R7);
            } else {
                interfaceC28690z3 = interfaceC28690z2;
            }
            interfaceC28690z4 = interfaceC28690z3;
            AbstractC22953f.m66714a(AbstractC1127a.m3486a(modifierM3407d4, (Function1) objM87133R7), null, false, C39770a.f171309a.m127320b(), c28655q4, 3078, 6);
            Modifier modifierM7154a2 = AbstractC2294a.m7154a(1.0f, AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t)));
            C22957g c22957g2 = AbstractC22977m.f90652c;
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g2, C2299e.f9110M, c28655q4, 0);
            iHashCode2 = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q4.m87165m();
            Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q4, modifierM7154a2);
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(c0213j);
            } else {
                c28655q4.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a3);
            AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m10);
            if (c28655q4.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N10);
            TextResource textResourceM120925k2 = cVar.getTitle();
            textResourceM120924j = cVar.getSubtitle();
            if (!AbstractC8693b.m21270d(textResourceM120924j)) {
                textResourceM120924j = null;
            }
            if (textResourceM120924j != null) {
                c27656a = new C27656a(textResourceM120924j, false);
            } else {
                c27656a = null;
            }
            AbstractC6721d.a aVar3 = new AbstractC6721d.a(textResourceM120925k2, c27656a, AbstractC38963t7.m124375e(C38072d.f163053a), AbstractC30060g.m92103Y(c28655q4, AbstractC35283c.f150167E), null, null, null, null, false, null, null, null, null, null, null, null, 65520, null);
            Modifier modifierM107879c2 = AbstractC34132o.m107879c(m127363E(interfaceC28670t2M30588b2), AbstractC1102d.m3409f(1.0f, c2314t));
            if ((i16 & 896) == 256) {
                z16 = true;
            } else {
                z16 = false;
            }
            objM87133R8 = c28655q4.m87133R();
            if (z16) {
                objM87133R8 = new C39771b(function4, 3);
                c28655q4.m87172p0(objM87133R8);
            } else {
                objM87133R8 = new C39771b(function4, 3);
                c28655q4.m87172p0(objM87133R8);
            }
            function5 = function4;
            AbstractC6719b.m20143d(modifierM107879c2, aVar3, null, (InterfaceC4339a) objM87133R8, null, null, c28655q4, AbstractC6721d.a.f25641r << 3, 52);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM124374d2 = AbstractC38963t7.m124374d(1.0f, 1.0f, true);
            InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(c2307m, false);
            iHashCode3 = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q4.m87165m();
            Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q4, modifierM124374d2);
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(c0213j);
            } else {
                c28655q4.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC39127r0M66763d8);
            AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m11);
            if (c28655q4.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N11);
            Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q4, 1), 14), f18 * f18, 0.0f, 2);
            C13404j c13404jM120922h2 = cVar.getScreenContextMetadata();
            int i27 = C13404j.f46947x << 3;
            Modifier modifierM34108a2 = AbstractC12248d.m34108a(AbstractC12250f.m34129b(modifierM3396r2, c13404jM120922h2, false, c28655q4, i27, 2), cVar.getScreenContextMetadata(), 21 * 8, false, c28655q4, i27 | 384, 4);
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g2, C2299e.f9111N, c28655q4, 48);
            iHashCode4 = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q4.m87165m();
            Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q4, modifierM34108a2);
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(c0213j);
            } else {
                c28655q4.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m12);
            if (c28655q4.f115903S) {
                AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N12);
            AbstractC22953f.m66715b(c28655q4, AbstractC1102d.m3411h(5 * f18, c2314t));
            c37622cM120915a = cVar.getChallengeProgressBar();
            if (c37622cM120915a == null) {
                c28655q4.m87150e0(-291023748);
                c28655q4.m87173q(false);
                z17 = false;
                c28676v1 = c28676v0;
                interfaceC28690z5 = interfaceC28690z4;
            } else {
                c28655q4.m87150e0(-291023747);
                objM87133R9 = c28655q4.m87133R();
                if (objM87133R9 == c28676v1) {
                    c28676v1 = c28676v0;
                    final int i28 = 1;
                    interfaceC28690z5 = interfaceC28690z4;
                    objM87133R9 = new Function1() { // from class: yt2.i
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i28) {
                                case 0:
                                    return AbstractC39780k.m127365G(interfaceC28690z5, (InterfaceC17886g0) obj);
                                case 1:
                                    return AbstractC39780k.m127367I(interfaceC28690z5, (InterfaceC17886g0) obj);
                                default:
                                    return AbstractC39780k.m127368J(interfaceC28690z5, (InterfaceC17886g0) obj);
                            }
                        }
                    };
                    c28655q4.m87172p0(objM87133R9);
                } else {
                    c28676v1 = c28676v0;
                    interfaceC28690z5 = interfaceC28690z4;
                }
                Modifier modifierM3486a3 = AbstractC1127a.m3486a(c2314t, (Function1) objM87133R9);
                InterfaceC39127r0 interfaceC39127r0M66763d9 = AbstractC22989q.m66763d(c2307m, false);
                iHashCode5 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q4.m87165m();
                Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q4, modifierM3486a3);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC39127r0M66763d9);
                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m13);
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode5, c28655q4, iHashCode5, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode5, c28655q4, iHashCode5, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N13);
                m127417v(c37622cM120915a, c28655q4, TextResource.$stable);
                c28655q4.m87173q(true);
                z17 = false;
                c28655q4.m87173q(false);
            }
            abstractC22403oM120919e = cVar.getOverrideImage();
            if (abstractC22403oM120919e == null) {
                c28655q4.m87150e0(-290778662);
                c28655q4.m87173q(z17);
                z18 = z17;
                c2307m2 = c2307m;
                c23454a1 = null;
            } else {
                c28655q4.m87150e0(-290778661);
                objM87133R10 = c28655q4.m87133R();
                if (objM87133R10 == c28676v1) {
                    final int i29 = 2;
                    objM87133R10 = new Function1() { // from class: yt2.i
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i29) {
                                case 0:
                                    return AbstractC39780k.m127365G(interfaceC28690z5, (InterfaceC17886g0) obj);
                                case 1:
                                    return AbstractC39780k.m127367I(interfaceC28690z5, (InterfaceC17886g0) obj);
                                default:
                                    return AbstractC39780k.m127368J(interfaceC28690z5, (InterfaceC17886g0) obj);
                            }
                        }
                    };
                    c28655q4.m87172p0(objM87133R10);
                }
                Modifier modifierM3486a4 = AbstractC1127a.m3486a(c2314t, (Function1) objM87133R10);
                c2307m2 = r9;
                InterfaceC39127r0 interfaceC39127r0M66763d10 = AbstractC22989q.m66763d(c2307m2, false);
                iHashCode6 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q4.m87165m();
                Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q4, modifierM3486a4);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC39127r0M66763d10);
                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m14);
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode6, c28655q4, iHashCode6, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode6, c28655q4, iHashCode6, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N14);
                m127415t(abstractC22403oM120919e, c28655q4, AbstractC22403o.f87638a);
                c28655q4.m87173q(true);
                z18 = false;
                c28655q4.m87173q(false);
                c23454a1 = c23454a0;
            }
            if (c23454a1 == null) {
                c28655q4.m87150e0(-290553353);
                if (cVar.getPercentageGauge() == null) {
                    c28655q4.m87150e0(1473614697);
                    c28655q4.m87173q(z18);
                    interfaceC11419z = null;
                    z24 = z18;
                } else {
                    c28655q4.m87150e0(1473614698);
                    Modifier modifierM3392n2 = AbstractC1099a.m3392n(c2314t, 0.0f, m127360B(interfaceC28670t2M30587a), 1);
                    objM87133R13 = c28655q4.m87133R();
                    if (objM87133R13 == c28676v1) {
                        objM87133R13 = new C36553a(25);
                        c28655q4.m87172p0(objM87133R13);
                    }
                    Modifier modifierM3498b2 = AbstractC1131a.m3498b(modifierM3392n2, (Function3) objM87133R13);
                    InterfaceC39127r0 interfaceC39127r0M66763d11 = AbstractC22989q.m66763d(C2299e.f9115x, false);
                    iHashCode8 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q4.m87165m();
                    Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q4, modifierM3498b2);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC39127r0M66763d11);
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m15);
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode8, c28655q4, iHashCode8, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode8, c28655q4, iHashCode8, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N15);
                    interfaceC11419z = null;
                    z24 = false;
                    AbstractC14893g.m42994a(cVar.getPercentageGauge(), null, c28655q4, 0);
                    c28655q4.m87173q(true);
                    c28655q4.m87173q(false);
                }
                c28655q4.m87173q(z24);
                i17 = z24;
            } else {
                interfaceC11419z = null;
                c28655q4.m87150e0(-147927182);
                c28655q4.m87173q(z18);
                i17 = z18;
            }
            iMo743q0 = (int) ((InterfaceC39171c) c28655q4.m87161k(AbstractC2453v1.f9569h)).mo743q0(40);
            boolean zM127361C2 = m127361C(interfaceC28601c6);
            C3733d1 c3733d1M11577e3 = AbstractC3788w0.m11577e(AbstractC11348f.m30574v(600, i17, interfaceC11419z, 6), 2);
            C11347e2 c11347e2M30574v3 = AbstractC11348f.m30574v(600, i17, interfaceC11419z, 6);
            zM87149e = c28655q4.m87149e(iMo743q0);
            objM87133R11 = c28655q4.m87133R();
            if (zM87149e) {
                objM87133R11 = new C39775f(iMo743q0, 0);
                c28655q4.m87172p0(objM87133R11);
            } else {
                objM87133R11 = new C39775f(iMo743q0, 0);
                c28655q4.m87172p0(objM87133R11);
            }
            c2307m3 = c2307m2;
            c28676v2 = c28676v1;
            AbstractC1090b.m3351f(zM127361C2, null, c3733d1M11577e3.m11562a(AbstractC3788w0.m11587o(c11347e2M30574v3, (Function1) objM87133R11)), null, null, AbstractC37817c.m121344e(1358924504, c28655q4, new C39776g(cVar, 0)), c28655q4, ProfileVerifier.CompilationStatus.f6515xf2722a21, 26);
            c28655q2 = c28655q4;
            c28655q2.m87173q(true);
            if (cVar.getPrimaryButton() == null) {
                c28655q2.m87150e0(1528477094);
                c28655q2.m87173q(false);
                z19 = true;
                cVar2 = cVar;
                function6 = function5;
                c28655q3 = c28655q2;
            } else {
                c28655q2.m87150e0(1528477095);
                Modifier modifierMo3400a2 = C1100b.f4583a.mo3400a(AbstractC1102d.m3409f(1.0f, c2314t), C2299e.f9105H);
                InterfaceC39127r0 interfaceC39127r0M66763d12 = AbstractC22989q.m66763d(c2307m3, false);
                iHashCode7 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q2.m87165m();
                Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q2, modifierMo3400a2);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d12);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m16);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode7, c28655q2, iHashCode7, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode7, c28655q2, iHashCode7, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N16);
                boolean zM127378T2 = m127378T(interfaceC28601c2);
                C3733d1 c3733d1M11577e4 = AbstractC3788w0.m11577e(AbstractC11348f.m30574v(600, 0, null, 6), 2);
                C11347e2 c11347e2M30574v4 = AbstractC11348f.m30574v(600, 0, null, 6);
                objM87133R12 = c28655q2.m87133R();
                if (objM87133R12 == c28676v2) {
                    objM87133R12 = new C39611k(16);
                    c28655q2.m87172p0(objM87133R12);
                }
                cVar2 = cVar;
                function6 = function5;
                AbstractC1090b.m3351f(zM127378T2, null, c3733d1M11577e4.m11562a(AbstractC3788w0.m11587o(c11347e2M30574v4, (Function1) objM87133R12)), null, null, AbstractC37817c.m121344e(1688846516, c28655q2, new C36538d(15, cVar2, function6)), c28655q2, ProfileVerifier.CompilationStatus.f6515xf2722a21, 26);
                C28655q c28655q7 = c28655q2;
                z19 = true;
                c28655q7.m87173q(true);
                c28655q7.m87173q(false);
                c28655q3 = c28655q7;
            }
            AbstractC25012a.m73392y(c28655q3, z19, z19, z19);
            function3 = function6;
            c28655q = c28655q3;
        } else {
            cVar2 = cVar;
            C28655q c28655q8 = c28655q4;
            c28655q8.m87138X();
            function3 = function2;
            c28655q = c28655q8;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32676t1(cVar2, z4, function3, i13, i14, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m127420y(AbstractC36492a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: z */
    private static final boolean m127421z(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }
}
