package p710im1;

import a01.C0084d;
import a80.C0542f;
import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2630u;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bm.C3396t;
import bm.InterfaceC3389m;
import c03.C3815c;
import c41.C4069m0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import com.whoop.design.util.AbstractC8693b;
import dp0.AbstractC12248d;
import ec3.C13084s1;
import ec3.InterfaceC13062m;
import em1.C13348v;
import ep0.C13404j;
import fm1.C14597a;
import fm1.C14599c;
import fm1.C14602f;
import fm1.EnumC14603g;
import hy0.C17734d1;
import ig0.C18468h;
import ih0.AbstractC18489d0;
import j93.AbstractC21478l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import live.hms.video.error.ErrorCodes;
import live.hms.video.utils.AndroidSDKConstants;
import m83.AbstractC25267u;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p040c0.AbstractC3736e1;
import p040c0.AbstractC3788w0;
import p040c0.InterfaceC3747i0;
import p077d0.AbstractC11348f;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p291l0.C23016z;
import p291l0.InterfaceC22973k1;
import p329n0.AbstractC26071x;
import p329n0.C26068u;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import se.AbstractC32411b;
import wb3.AbstractC37056f;
import x31.AbstractC37947f;
import x31.EnumC37944c;
import x81.C38072d;

/* JADX INFO: renamed from: im1.a1 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u001a\u0085\u0001\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\t0\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\t0\rH\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a5\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0017\u0010!\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b!\u0010\"\u001ao\u0010$\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\t0\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\t0\rH\u0001¢\u0006\u0004\b$\u0010%¨\u0006&"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lem1/v;", "homeViewState", "Lc03/c;", "statusViewState", "Lep0/j;", "screenContext", "Lkotlin/Function0;", "Ll83/a0;", "onErrorRetry", "Lim1/d0;", "itemViewEventHelper", "Lkotlin/Function1;", "Lfm1/g;", "sendPageSelectedEvent", "", "onWhoopStatusClick", "onBottomOfPillarHit", "v", "(Landroidx/compose/ui/Modifier;Lem1/v;Lc03/c;Lep0/j;Lc93/a;Lim1/d0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lbm/t;", "pagerState", "", "Ln0/u;", "listStates", "Lfm1/c;", "homeFeed", "Lx31/c;", "homeTabGroupCenterConfig", "y", "(Lbm/t;Ljava/util/List;Lfm1/c;Lx31/c;Landroidx/compose/runtime/Composer;I)V", "", "B", "(Lbm/t;Landroidx/compose/runtime/Composer;I)I", "lazyListStates", "m", "(Lbm/t;Ljava/util/List;Lfm1/c;Lc03/c;Lep0/j;Lim1/d0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "home_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18657a1 {

    /* JADX INFO: renamed from: im1.a1$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.view.PillarScreenKt$PagerLayout$1$1$1$1$1$1", m100430f = "PillarScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f73201w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C18665d0 f73202x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C3815c f73203y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C18665d0 c18665d0, C3815c c3815c, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f73202x = c18665d0;
            this.f73203y = c3815c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f73202x, this.f73203y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f73201w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f73202x.m54173t(this.f73203y.getAlertTileViewState());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: im1.a1$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.view.PillarScreenKt$PagerLayout$1$1$1$2$1$1$1", m100430f = "PillarScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f73204w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C18665d0 f73205x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C14597a f73206y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C18665d0 c18665d0, C14597a c14597a, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f73205x = c18665d0;
            this.f73206y = c14597a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f73205x, this.f73206y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f73204w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f73205x.m54173t(this.f73206y.getItemViewState());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: im1.a1$c */
    @InterfaceC32271e(m100429c = "com.whoop.home.view.PillarScreenKt$PillarScreen$1$1", m100430f = "PillarScreen.kt", m100431l = {74}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f73207w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C3396t f73208x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C13348v f73209y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Function1 f73210z;

        /* JADX INFO: renamed from: im1.a1$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C13348v f73211w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ Function1 f73212x;

            public a(C13348v c13348v, Function1 function1) {
                this.f73211w = c13348v;
                this.f73212x = function1;
            }

            /* JADX INFO: renamed from: b */
            public final Object m54115b(int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                if (this.f73211w.getHomeFeed() != null) {
                    this.f73212x.invoke(EnumC14603g.INSTANCE.m41790a(i13));
                }
                return C23454a0.f92919a;
            }

            @Override // ec3.InterfaceC13062m
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                return m54115b(((Number) obj).intValue(), interfaceC30057d);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C3396t c3396t, C13348v c13348v, Function1 function1, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f73208x = c3396t;
            this.f73209y = c13348v;
            this.f73210z = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final int m54114h(C3396t c3396t) {
            return c3396t.m9774m();
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f73208x, this.f73209y, this.f73210z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f73207w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13084s1 c13084s1M87240H = AbstractC28683x.m87240H(new C18660b1(this.f73208x, 0));
                a aVar = new a(this.f73209y, this.f73210z);
                this.f73207w = 1;
                if (c13084s1M87240H.collect(aVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: im1.a1$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.view.PillarScreenKt$TabLayout$2$1$1", m100430f = "PillarScreen.kt", m100431l = {129, 131}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f73213w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ int f73214x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C3396t f73215y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ List<C26068u> f73216z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i13, C3396t c3396t, List<C26068u> list, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f73214x = i13;
            this.f73215y = c3396t;
            this.f73216z = list;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f73214x, this.f73215y, this.f73216z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
        
            if (r5.m9775o(r1, r4) == r0) goto L19;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r4.f73213w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                p505ts.AbstractC34132o.m107864I(r5)
                goto L58
            L10:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L18:
                p505ts.AbstractC34132o.m107864I(r5)
                goto L49
            L1c:
                p505ts.AbstractC34132o.m107864I(r5)
                int r5 = r4.f73214x
                bm.t r1 = r4.f73215y
                int r1 = r1.m9774m()
                if (r5 != r1) goto L49
                java.util.List<n0.u> r5 = r4.f73216z
                java.util.Collection r5 = (java.util.Collection) r5
                boolean r5 = r5.isEmpty()
                if (r5 != 0) goto L49
                java.util.List<n0.u> r5 = r4.f73216z
                int r1 = r4.f73214x
                java.lang.Object r5 = r5.get(r1)
                n0.u r5 = (p329n0.C26068u) r5
                r4.f73213w = r3
                p0.n0 r1 = p329n0.C26068u.f103217x
                r1 = 0
                java.lang.Object r5 = r5.m77563f(r1, r1, r4)
                if (r5 != r0) goto L49
                goto L57
            L49:
                bm.t r5 = r4.f73215y
                int r1 = r4.f73214x
                r4.f73213w = r2
                p0.n0 r2 = bm.C3396t.f13251h
                java.lang.Object r5 = r5.m9775o(r1, r4)
                if (r5 != r0) goto L58
            L57:
                return r0
            L58:
                l83.a0 r5 = l83.C23454a0.f92919a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p710im1.AbstractC18657a1.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m54085A(C3396t c3396t, List list, C14599c c14599c, EnumC37944c enumC37944c, int i13, Composer composer, int i14) {
        m54111y(c3396t, list, c14599c, enumC37944c, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: B */
    public static final int m54086B(C3396t pagerState, Composer composer, int i13) {
        AbstractC22676k.m65750j(pagerState, "pagerState");
        if (pagerState.m9769h() >= 0.5d) {
            return pagerState.m9774m() + 1;
        }
        return ((double) pagerState.m9769h()) <= -0.5d ? pagerState.m9774m() - 1 : pagerState.m9774m();
    }

    /* JADX INFO: renamed from: m */
    public static final void m54099m(C3396t pagerState, List<C26068u> lazyListStates, C14599c homeFeed, C3815c statusViewState, C13404j c13404j, C18665d0 itemViewEventHelper, Function1 onWhoopStatusClick, Function1 onBottomOfPillarHit, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(pagerState, "pagerState");
        AbstractC22676k.m65750j(lazyListStates, "lazyListStates");
        AbstractC22676k.m65750j(homeFeed, "homeFeed");
        AbstractC22676k.m65750j(statusViewState, "statusViewState");
        AbstractC22676k.m65750j(itemViewEventHelper, "itemViewEventHelper");
        AbstractC22676k.m65750j(onWhoopStatusClick, "onWhoopStatusClick");
        AbstractC22676k.m65750j(onBottomOfPillarHit, "onBottomOfPillarHit");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(50129248);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(pagerState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(lazyListStates) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(homeFeed) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= (i13 & 4096) == 0 ? c28655q.m87153g(statusViewState) : c28655q.m87157i(statusViewState) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= (32768 & i13) == 0 ? c28655q.m87153g(c13404j) : c28655q.m87157i(c13404j) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q.m87157i(itemViewEventHelper) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i14 |= c28655q.m87157i(onWhoopStatusClick) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i14 |= c28655q.m87157i(onBottomOfPillarHit) ? 8388608 : 4194304;
        }
        int i15 = i14;
        if (c28655q.m87135U(i15 & 1, (4793491 & i15) != 4793490)) {
            AbstractC32411b.m101095g(homeFeed.m41769b().size(), AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3427x(C2314t.f9131w, null, 3)), pagerState, 0.0f, null, C2299e.f9107J, null, false, AbstractC37817c.m121344e(-207587995, c28655q, new C18707y0(homeFeed, lazyListStates, pagerState, onBottomOfPillarHit, c13404j, statusViewState, itemViewEventHelper, onWhoopStatusClick)), c28655q, ((i15 << 6) & 896) | 1572912, 952);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2630u(pagerState, lazyListStates, homeFeed, statusViewState, c13404j, itemViewEventHelper, onWhoopStatusClick, onBottomOfPillarHit, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m54100n(C14599c c14599c, List list, C3396t c3396t, Function1 function1, C13404j c13404j, C3815c c3815c, C18665d0 c18665d0, Function1 function2, InterfaceC3389m HorizontalPager, int i13, Composer composer, int i14) {
        int i15;
        C26068u c26068uM77569a;
        AbstractC22676k.m65750j(HorizontalPager, "$this$HorizontalPager");
        if ((i14 & 48) == 0) {
            i15 = i14 | (((C28655q) composer).m87149e(i13) ? 32 : 16);
        } else {
            i15 = i14;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i15 & 1, (i15 & 145) != 144)) {
            C14602f c14602f = c14599c.m41769b().get(i13);
            if (list.isEmpty()) {
                c28655q.m87150e0(-1923562532);
                c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q, 3);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1923563398);
                c28655q.m87173q(false);
                c26068uM77569a = (C26068u) list.get(i13);
            }
            C26068u c26068u = c26068uM77569a;
            AbstractC18703w0.m54388b(c3396t, c26068u, function1, c3396t.m9774m() < c14599c.m41769b().size() ? AbstractC18703w0.m54391e(c14599c.m41769b().get(c3396t.m9774m()).getPillarType()) : AbstractC18703w0.m54391e(EnumC14603g.OVERVIEW), c28655q, 0);
            float f13 = 2 * 8;
            InterfaceC22973k1 interfaceC22973k1M34113f = AbstractC12248d.m34113f(c13404j, AbstractC1099a.m3381c(f13, f13, f13, 0.0f, 8), false, c28655q, C13404j.f46947x, 4);
            C2305k c2305k = C2299e.f9111N;
            boolean zM87157i = c28655q.m87157i(c3815c) | ((i15 & 112) == 32) | c28655q.m87157i(c18665d0) | c28655q.m87153g(function2) | c28655q.m87157i(c14602f) | c28655q.m87157i(c14599c);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                C18709z0 c18709z0 = new C18709z0(i13, c3815c, c14602f, c18665d0, function2, c14599c);
                c28655q.m87172p0(c18709z0);
                objM87133R = c18709z0;
            }
            AbstractC22674j.m65717c(null, c26068u, interfaceC22973k1M34113f, null, c2305k, null, false, null, (Function1) objM87133R, c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21, 473);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m54101o(int i13, C3815c c3815c, C14602f c14602f, C18665d0 c18665d0, Function1 function1, C14599c c14599c, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        if (i13 == 0 && c3815c.getShouldDisplay()) {
            InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C0542f(c18665d0, c3815c, function1, 19), true, -1755763051), 3);
        }
        Iterator<T> it = c14602f.m41787a().iterator();
        while (it.hasNext()) {
            InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C0542f(c18665d0, (C14597a) it.next(), c14599c, 20), true, -300845293), 3);
        }
        InterfaceC26064q.m77556b(LazyColumn, null, C18670g.f73249a.m54201b(), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m54102p(C18665d0 c18665d0, C3815c c3815c, Function1 function1, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        boolean zM87135U = c28655q.m87135U(i13 & 1, (i13 & 17) != 16);
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!zM87135U) {
            c28655q.m87138X();
            return c23454a0;
        }
        boolean zM87157i = c28655q.m87157i(c18665d0) | c28655q.m87157i(c3815c);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87157i || objM87133R == c28676v0) {
            objM87133R = new a(c18665d0, c3815c, null);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, c23454a0);
        C4069m0 c4069m0M11684a = c3815c.getAlertTileViewState();
        AbstractC22676k.m65748h(c4069m0M11684a, "null cannot be cast to non-null type com.whoop.design.atomic.molecule.tile.AlertTileState");
        boolean zM87153g = c28655q.m87153g(function1);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87153g || objM87133R2 == c28676v0) {
            objM87133R2 = new C18664d(function1, 1);
            c28655q.m87172p0(objM87133R2);
        }
        AbstractC25303l.m74291r(c4069m0M11684a, null, null, (Function1) objM87133R2, c28655q, C4069m0.f16535h, 6);
        AbstractC18489d0.m53380u(3, 4, C2314t.f9131w, c28655q);
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m54103q(Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke("Overview Screen");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m54104r(C18665d0 c18665d0, C14597a c14597a, C14599c c14599c, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        boolean zM87135U = c28655q.m87135U(i13 & 1, (i13 & 17) != 16);
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!zM87135U) {
            c28655q.m87138X();
            return c23454a0;
        }
        boolean zM87157i = c28655q.m87157i(c18665d0) | c28655q.m87157i(c14597a);
        Object objM87133R = c28655q.m87133R();
        if (zM87157i || objM87133R == C28635l.f115821a) {
            objM87133R = new b(c18665d0, c14597a, null);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, c23454a0);
        AbstractC28683x.m87247a(AbstractC25303l.m74272C().mo86977a(AbstractC18667e0.m54175b()), AbstractC37817c.m121344e(1893714899, c28655q, new C0084d(c14597a, c18665d0, c14599c, 29)), c28655q, 56);
        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(c14597a.getInsetBottom().getSpacing(), C2314t.f9131w));
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m54105s(C14597a c14597a, C18665d0 c18665d0, C14599c c14599c, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            InterfaceC25312u interfaceC25312uM41765b = c14597a.getItemViewState();
            C25307p c25307pM54175b = AbstractC18667e0.m54175b();
            boolean zM87157i = c28655q.m87157i(c18665d0) | c28655q.m87157i(c14597a) | c28655q.m87157i(c14599c);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C18468h(c18665d0, c14597a, c14599c, 4);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC25303l.m74291r(interfaceC25312uM41765b, c25307pM54175b, null, (Function1) objM87133R, c28655q, C25307p.f99300b << 3, 4);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m54106t(C18665d0 c18665d0, C14597a c14597a, C14599c c14599c, Object it) {
        AbstractC22676k.m65750j(it, "it");
        c18665d0.m54172j(c14597a.getItemViewState(), c14599c.getHomeMetaData(), it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m54107u(C3396t c3396t, List list, C14599c c14599c, C3815c c3815c, C13404j c13404j, C18665d0 c18665d0, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m54099m(c3396t, list, c14599c, c3815c, c13404j, c18665d0, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: v */
    public static final void m54108v(Modifier modifier, final C13348v homeViewState, final C3815c statusViewState, final C13404j c13404j, final InterfaceC4339a onErrorRetry, final C18665d0 itemViewEventHelper, final Function1 sendPageSelectedEvent, final Function1 onWhoopStatusClick, final Function1 onBottomOfPillarHit, Composer composer, final int i13, final int i14) {
        Modifier modifier2;
        int i15;
        final Modifier modifier3;
        List list;
        Modifier modifier4;
        C3396t c3396t;
        boolean z4;
        boolean z13;
        C14599c c14599c;
        List list2;
        boolean z14;
        AbstractC22676k.m65750j(homeViewState, "homeViewState");
        AbstractC22676k.m65750j(statusViewState, "statusViewState");
        AbstractC22676k.m65750j(onErrorRetry, "onErrorRetry");
        AbstractC22676k.m65750j(itemViewEventHelper, "itemViewEventHelper");
        AbstractC22676k.m65750j(sendPageSelectedEvent, "sendPageSelectedEvent");
        AbstractC22676k.m65750j(onWhoopStatusClick, "onWhoopStatusClick");
        AbstractC22676k.m65750j(onBottomOfPillarHit, "onBottomOfPillarHit");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(486451155);
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
            i15 |= c28655q.m87157i(homeViewState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= (i13 & 512) == 0 ? c28655q.m87153g(statusViewState) : c28655q.m87157i(statusViewState) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= (i13 & 4096) == 0 ? c28655q.m87153g(c13404j) : c28655q.m87157i(c13404j) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q.m87157i(onErrorRetry) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i15 |= c28655q.m87157i(itemViewEventHelper) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i15 |= c28655q.m87157i(sendPageSelectedEvent) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i15 |= c28655q.m87157i(onWhoopStatusClick) ? 8388608 : 4194304;
        }
        if ((100663296 & i13) == 0) {
            i15 |= c28655q.m87157i(onBottomOfPillarHit) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        int i17 = i15;
        if (c28655q.m87135U(i17 & 1, (i17 & 38347923) != 38347922)) {
            Modifier modifier5 = i16 != 0 ? C2314t.f9131w : modifier2;
            C3396t c3396tM60415U = AbstractC21478l0.m60415U(homeViewState.getCurrentPageIndex(), c28655q, 0);
            if (c3396tM60415U.m9772k() > 0) {
                c28655q.m87150e0(647214798);
                int iM9772k = c3396tM60415U.m9772k();
                ArrayList arrayList = new ArrayList(iM9772k);
                int i18 = 0;
                while (i18 < iM9772k) {
                    arrayList.add(AbstractC26071x.m77569a(0, 0, c28655q, 3));
                    i18++;
                    iM9772k = iM9772k;
                }
                c28655q.m87173q(false);
                list = arrayList;
            } else {
                c28655q.m87150e0(647314804);
                c28655q.m87173q(false);
                list = C25271y.f99162w;
            }
            List list3 = list;
            boolean zM87153g = c28655q.m87153g(c3396tM60415U) | c28655q.m87157i(homeViewState) | ((i17 & 3670016) == 1048576);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new c(c3396tM60415U, homeViewState, sendPageSelectedEvent, null);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, c3396tM60415U);
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, modifier5);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
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
            int i19 = i17 >> 3;
            int i24 = C3815c.f15649d << 9;
            int i25 = i17 << 3;
            int i26 = i25 & 7168;
            AbstractC18682m.m54248k(homeViewState, onErrorRetry, onWhoopStatusClick, statusViewState, c28655q, (i19 & 14) | ((i17 >> 9) & 112) | ((i17 >> 15) & 896) | i24 | i26);
            C14599c c14599cM37585l = homeViewState.getHomeFeed();
            if (c14599cM37585l == null) {
                c28655q.m87150e0(-1053882408);
                c28655q.m87173q(false);
                modifier4 = modifier5;
                z14 = true;
            } else {
                c28655q.m87150e0(-1053882407);
                if (C38072d.f163053a.m121950c(c28655q, C38072d.f163054b).isFeatureEnabled(OnboardingFeatureFlag.HOME_XP)) {
                    c28655q.m87150e0(1787030629);
                    c3396t = c3396tM60415U;
                    z13 = true;
                    list2 = list3;
                    modifier4 = modifier5;
                    z4 = false;
                    AbstractC1090b.m3350e(C23016z.f90757a, homeViewState.getShouldShowHomeTabs(), null, AbstractC3788w0.m11588p(AbstractC11348f.m30574v(1000, 0, null, 6), null, 2).m11562a(AbstractC3788w0.m11577e(AbstractC11348f.m30574v(ErrorCodes.InitAPIErrors.cServerErrors, 0, null, 6), 2)), AbstractC3736e1.f15289a, null, AbstractC37817c.m121344e(-2096755454, c28655q, new C18685n0(c3396tM60415U, list3, c14599cM37585l, homeViewState)), c28655q, 1575942, 18);
                    c28655q.m87173q(false);
                    c14599c = c14599cM37585l;
                } else {
                    modifier4 = modifier5;
                    c3396t = c3396tM60415U;
                    List list4 = list3;
                    z4 = false;
                    z13 = true;
                    c28655q.m87150e0(1787514756);
                    c14599c = c14599cM37585l;
                    m54111y(c3396t, list4, c14599c, homeViewState.getHomeTabGroupCenterConfig(), c28655q, 0);
                    c28655q.m87173q(false);
                    list2 = list4;
                }
                z14 = z13;
                m54099m(c3396t, list2, c14599c, statusViewState, c13404j, itemViewEventHelper, onWhoopStatusClick, onBottomOfPillarHit, c28655q, i24 | i26 | (C13404j.f46947x << 12) | (i25 & 57344) | (i17 & 458752) | (i19 & 3670016) | (i19 & 29360128));
                c28655q = c28655q;
                c28655q.m87173q(z4);
            }
            c28655q.m87173q(z14);
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: im1.x0
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC18657a1.m54110x(modifier3, homeViewState, statusViewState, c13404j, onErrorRetry, itemViewEventHelper, sendPageSelectedEvent, onWhoopStatusClick, onBottomOfPillarHit, i13, i14, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m54109w(C3396t c3396t, List list, C14599c c14599c, C13348v c13348v, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        m54111y(c3396t, list, c14599c, c13348v.getHomeTabGroupCenterConfig(), composer, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m54110x(Modifier modifier, C13348v c13348v, C3815c c3815c, C13404j c13404j, InterfaceC4339a interfaceC4339a, C18665d0 c18665d0, Function1 function1, Function1 function2, Function1 function3, int i13, int i14, Composer composer, int i15) {
        m54108v(modifier, c13348v, c3815c, c13404j, interfaceC4339a, c18665d0, function1, function2, function3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: y */
    public static final void m54111y(C3396t pagerState, List<C26068u> listStates, C14599c homeFeed, EnumC37944c homeTabGroupCenterConfig, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(pagerState, "pagerState");
        AbstractC22676k.m65750j(listStates, "listStates");
        AbstractC22676k.m65750j(homeFeed, "homeFeed");
        AbstractC22676k.m65750j(homeTabGroupCenterConfig, "homeTabGroupCenterConfig");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-872073869);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(pagerState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(listStates) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(homeFeed) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87149e(homeTabGroupCenterConfig.ordinal()) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87262p(c28655q);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
            Modifier modifierM3396r = AbstractC1099a.m3396r(C2314t.f9131w, 1 * 8, 0.0f, 2);
            int i15 = i14 & 14;
            int iM54086B = m54086B(pagerState, c28655q, i15);
            List<C14602f> listM41769b = homeFeed.m41769b();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM41769b, 10));
            Iterator<T> it = listM41769b.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC8693b.m21278l(((C14602f) it.next()).getPillarDisplayName()));
            }
            boolean zM87157i = c28655q.m87157i(interfaceC2994c0) | (i15 == 4) | c28655q.m87157i(listStates);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new C18468h(interfaceC2994c0, pagerState, listStates, 5);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC37947f.m121524r(iM54086B, arrayList, modifierM3396r, homeTabGroupCenterConfig, null, (Function1) objM87133R2, c28655q, (i14 & 7168) | 384, 16);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17734d1(pagerState, listStates, homeFeed, homeTabGroupCenterConfig, i13, 18);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m54112z(InterfaceC2994c0 interfaceC2994c0, C3396t c3396t, List list, int i13) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new d(i13, c3396t, list, null), 3);
        return C23454a0.f92919a;
    }
}
