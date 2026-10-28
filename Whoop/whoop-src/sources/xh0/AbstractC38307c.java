package xh0;

import android.content.res.Configuration;
import androidx.compose.animation.AbstractC1091c;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.material.AbstractC1118c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2541i2;
import b91.C2886a;
import bc3.AbstractC3006f0;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import bf0.C3196h;
import bm2.C3466p;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import gb1.AbstractC15673b0;
import gz0.EnumC16313m0;
import hg3.AbstractC17269i;
import i91.AbstractC18249c;
import ih0.AbstractC18489d0;
import java.util.List;
import kotlin.C2026r;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import no0.C26949h;
import ny0.AbstractC27292z;
import o01.AbstractC27348d;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p132f0.C13825t;
import p163g1.AbstractC15166v0;
import p163g1.C15077m1;
import p163g1.C15199y3;
import p163g1.EnumC15209z3;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22976l1;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC23013y;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p329n0.C26053f;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p579wc.C37082e1;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import p745y81.C39336i;
import p745y81.EnumC39333f;
import ph0.AbstractC29235c;
import q83.InterfaceC30057d;
import qh0.AbstractC30364a;
import qh0.C30365b;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import re1.C31324k;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import uh0.AbstractC34963a;
import v41.AbstractC35660d;
import v41.AbstractC35664f;
import v41.C35658c;
import v41.C35666g;
import v41.EnumC35671i0;
import vh0.AbstractC36042c;
import vh0.C36044e;
import vh0.InterfaceC36040a;
import w71.C36891k;
import wb3.AbstractC37056f;
import wr0.C37550r;
import x81.C38072d;
import xa0.C38136a;
import xa1.C38138a;
import y71.C39274g;

/* JADX INFO: renamed from: xh0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001ai\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001aE\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\fH\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u0014\u0010\u001d\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a\"\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 \"\u0014\u0010#\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010 ¨\u0006$"}, m65681d2 = {"Lvh0/c;", "viewState", "Lqh0/b;", "analyticsHelper", "Lkotlin/Function1;", "Lvh0/a;", "Ll83/a0;", "onViewEvent", "Luh0/a;", "onNavigationEvent", "", "showBottomSheet", "Lkotlin/Function0;", "onDismiss", "r", "(Lvh0/c;Lqh0/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLc93/a;Landroidx/compose/runtime/Composer;II)V", "C", "(Lvh0/c;Lqh0/b;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "A", "(Landroidx/compose/runtime/Composer;I)V", "Ltr2/n;", "a", "Ltr2/n;", "logger", "Li2/x;", "b", "J", "tileGradientStart", "c", "tileGradientEnd", "Li2/t;", "d", "Li2/t;", "customGradient", "e", "iconGradient", "ai-insights_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC38307c {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC34116n f164167a = InterfaceC34116n.INSTANCE.m107848a("AiInsightsScreen");

    /* JADX INFO: renamed from: b */
    private static final long f164168b;

    /* JADX INFO: renamed from: c */
    private static final long f164169c;

    /* JADX INFO: renamed from: d */
    private static final AbstractC17911t f164170d;

    /* JADX INFO: renamed from: e */
    private static final AbstractC17911t f164171e;

    /* JADX INFO: renamed from: xh0.c$a */
    @InterfaceC32271e(m100429c = "com.whoop.aiinsights.ui.AiInsightsScreenKt$AiInsightsScreen$4$1", m100430f = "AiInsightsScreen.kt", m100431l = {103, 105}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f164172w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f164173x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C15199y3 f164174y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z4, C15199y3 c15199y3, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f164173x = z4;
            this.f164174y = c15199y3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f164173x, this.f164174y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        
            if (r5.m43225f(r4) == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
        
            if (r5.m43223d(r4) == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
        
            return r0;
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
                int r1 = r4.f164172w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L19
                if (r1 == r3) goto L15
                if (r1 != r2) goto Ld
                goto L15
            Ld:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L15:
                p505ts.AbstractC34132o.m107864I(r5)
                goto L4e
            L19:
                p505ts.AbstractC34132o.m107864I(r5)
                boolean r5 = r4.f164173x
                if (r5 == 0) goto L35
                g1.y3 r5 = r4.f164174y
                g1.z3 r5 = r5.m43221b()
                g1.z3 r1 = p163g1.EnumC15209z3.f57107x
                if (r5 == r1) goto L35
                g1.y3 r5 = r4.f164174y
                r4.f164172w = r3
                java.lang.Object r5 = r5.m43225f(r4)
                if (r5 != r0) goto L4e
                goto L4d
            L35:
                boolean r5 = r4.f164173x
                if (r5 != 0) goto L4e
                g1.y3 r5 = r4.f164174y
                g1.z3 r5 = r5.m43221b()
                g1.z3 r1 = p163g1.EnumC15209z3.f57106w
                if (r5 == r1) goto L4e
                g1.y3 r5 = r4.f164174y
                r4.f164172w = r2
                java.lang.Object r5 = r5.m43223d(r4)
                if (r5 != r0) goto L4e
            L4d:
                return r0
            L4e:
                l83.a0 r5 = l83.C23454a0.f92919a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: xh0.AbstractC38307c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: xh0.c$b */
    @InterfaceC32271e(m100429c = "com.whoop.aiinsights.ui.AiInsightsScreenKt$AiInsightsScreen$5$1", m100430f = "AiInsightsScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f164175w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f164176x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f164177y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C15199y3 c15199y3, InterfaceC4339a interfaceC4339a, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f164176x = c15199y3;
            this.f164177y = interfaceC4339a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f164176x, this.f164177y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f164175w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f164176x.m43221b() == EnumC15209z3.f57106w) {
                this.f164177y.invoke();
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: xh0.c$c */
    @InterfaceC32271e(m100429c = "com.whoop.aiinsights.ui.AiInsightsScreenKt$AiInsightsScreen$6$1$1$1", m100430f = "AiInsightsScreen.kt", m100431l = {141}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f164178w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f164179x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C15199y3 c15199y3, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f164179x = c15199y3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f164179x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f164178w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3 = this.f164179x;
                this.f164178w = 1;
                if (c15199y3.m43223d(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: xh0.c$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f164180w = new d();

        /* JADX INFO: renamed from: a */
        public final long m122734a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getTransparent();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m122734a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: xh0.c$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function3 {

        /* JADX INFO: renamed from: w */
        public static final e f164181w = new e();

        /* JADX INFO: renamed from: a */
        public final Modifier m122735a(InterfaceC25312u it, Composer composer, int i13) {
            AbstractC22676k.m65750j(it, "it");
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(407747718);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            c28655q.m87173q(false);
            return modifierM3409f;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m122735a((InterfaceC25312u) obj, (Composer) obj2, ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: xh0.c$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f164182w;

        public f(Function1 function1) {
            this.f164182w = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m122736a(Object event) {
            AbstractC22676k.m65750j(event, "event");
            AbstractC34963a abstractC34963aM110425a = AbstractC34963a.INSTANCE.m110425a(event, AbstractC38307c.f164167a);
            if (abstractC34963aM110425a != null) {
                this.f164182w.invoke(abstractC34963aM110425a);
            }
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m122736a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: xh0.c$g */
    @InterfaceC32271e(m100429c = "com.whoop.aiinsights.ui.AiInsightsScreenKt$InsightContent$3$1", m100430f = "AiInsightsScreen.kt", m100431l = {322}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f164183w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC4339a f164184x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC4339a interfaceC4339a, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f164184x = interfaceC4339a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new g(this.f164184x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f164183w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                this.f164183w = 1;
                if (AbstractC3034m0.m8782b(1000L, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            this.f164184x.invoke();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: xh0.c$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final h f164185w = new h();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(InterfaceC25312u interfaceC25312u) {
            return null;
        }
    }

    /* JADX INFO: renamed from: xh0.c$i */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f164186w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f164187x;

        public i(Function1 function1, List list) {
            this.f164186w = function1;
            this.f164187x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m122738a(int i13) {
            return this.f164186w.invoke(this.f164187x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m122738a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: xh0.c$j */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f164188w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f164189x;

        public j(List list, Function1 function1) {
            this.f164188w = list;
            this.f164189x = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m122739a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
            int i15;
            if ((i14 & 6) == 0) {
                i15 = (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2) | i14;
            } else {
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= ((C28655q) composer).m87149e(i13) ? 32 : 16;
            }
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
                c28655q.m87138X();
                return;
            }
            InterfaceC25312u interfaceC25312u = (InterfaceC25312u) this.f164188w.get(i13);
            c28655q.m87150e0(1391140102);
            AbstractC18489d0.m53380u(2, 8, C2314t.f9131w, c28655q);
            e eVar = e.f164181w;
            boolean zM87153g = c28655q.m87153g(this.f164189x);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new f(this.f164189x);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC25303l.m74291r(interfaceC25312u, null, eVar, (Function1) objM87133R, c28655q, 0, 2);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m122739a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    static {
        long jM51517e = AbstractC17918w0.m51517e(4283487743L);
        f164168b = jM51517e;
        long jM51517e2 = AbstractC17918w0.m51517e(4287324927L);
        f164169c = jM51517e2;
        C17909s c17909s = AbstractC17911t.f69612b;
        f164170d = C17909s.m51486d(c17909s, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.2f, jM51517e2)), new C17919x(C17919x.m51541c(0.2f, jM51517e))), 0L, 9187343241974906880L, 8);
        f164171e = C17909s.m51486d(c17909s, AbstractC37056f.m118959K(new C17919x(jM51517e2), new C17919x(jM51517e)), 0L, 9187343241974906880L, 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A */
    public static final void m122696A(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(86212660);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            int i14 = 2;
            AbstractC33199m0.m105214F(new AbstractC33208p0.b(new TextResource.C8688b(AbstractC29235c.f118313c, null, i14, 0 == true ? 1 : 0), false, null, 6, null), new TextResource.C8688b(AbstractC29235c.f118316f, 0 == true ? 1 : 0, i14, 0 == true ? 1 : 0), null, null, null, false, false, null, null, null, true, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.C8688b.f25889c << 3), 6, 3068);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35658c(i13, 12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m122697B(int i13, Composer composer, int i14) {
        m122696A(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x029c  */
    /* JADX WARN: Code duplicated, block: B:104:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:107:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:108:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:111:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:112:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:116:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:122:0x0331  */
    /* JADX WARN: Code duplicated, block: B:123:0x033e  */
    /* JADX WARN: Code duplicated, block: B:126:0x034e  */
    /* JADX WARN: Code duplicated, block: B:129:0x0357  */
    /* JADX WARN: Code duplicated, block: B:132:0x0363  */
    /* JADX WARN: Code duplicated, block: B:133:0x036d  */
    /* JADX WARN: Code duplicated, block: B:136:0x037a  */
    /* JADX WARN: Code duplicated, block: B:137:0x037c  */
    /* JADX WARN: Code duplicated, block: B:140:0x0382  */
    /* JADX WARN: Code duplicated, block: B:141:0x0384  */
    /* JADX WARN: Code duplicated, block: B:145:0x038e  */
    /* JADX WARN: Code duplicated, block: B:151:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:153:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:154:0x041b  */
    /* JADX WARN: Code duplicated, block: B:156:0x0420  */
    /* JADX WARN: Code duplicated, block: B:157:0x046a  */
    /* JADX WARN: Code duplicated, block: B:159:0x0472  */
    /* JADX WARN: Code duplicated, block: B:161:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:162:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:168:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:171:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:173:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:176:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:46:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:59:0x010d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0111  */
    /* JADX WARN: Code duplicated, block: B:65:0x0132  */
    /* JADX WARN: Code duplicated, block: B:69:0x0147  */
    /* JADX WARN: Code duplicated, block: B:72:0x0162  */
    /* JADX WARN: Code duplicated, block: B:73:0x0164  */
    /* JADX WARN: Code duplicated, block: B:76:0x016d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0170  */
    /* JADX WARN: Code duplicated, block: B:83:0x018a  */
    /* JADX WARN: Code duplicated, block: B:86:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:87:0x0202  */
    /* JADX WARN: Code duplicated, block: B:92:0x021d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0230  */
    /* JADX WARN: Code duplicated, block: B:96:0x0244  */
    /* JADX WARN: Code duplicated, block: B:99:0x0293  */
    /* JADX WARN: Multi-variable type inference failed */
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
    /* JADX INFO: renamed from: C */
    private static final void m122698C(AbstractC36042c abstractC36042c, C30365b c30365b, final Function1 function1, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        C30365b c30365b2;
        boolean z4;
        AbstractC36042c abstractC36042c2;
        C28655q c28655q;
        InterfaceC4339a interfaceC4339a2;
        C28677v1 c28677v1M87180u;
        C30365b c30365b3;
        boolean z13;
        C2314t c2314t;
        C28676v0 c28676v0;
        C28655q c28655q2;
        final C30365b c30365b4;
        List list;
        Object[] objArr;
        Object objM87133R;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i16;
        boolean z14;
        int i17;
        boolean z15;
        boolean zM87157i;
        Object objM87133R2;
        int iHashCode2;
        final AbstractC36042c.f fVar;
        final C36044e c36044eM114413f;
        float f13;
        float f14;
        boolean z16;
        boolean z17;
        boolean z18;
        Object objM87133R3;
        int i18;
        Object obj;
        boolean z19;
        C28676v0 c28676v1;
        final C36044e c36044eM114415h;
        EnumC16313m0 enumC16313m0M114418a;
        Integer numValueOf;
        boolean z24;
        boolean z25;
        boolean z26;
        Object objM87133R4;
        boolean z27;
        Object objM87133R5;
        int i19;
        int i24;
        Object[] objArr2;
        Object[] objArr3;
        Object[] objArr4;
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(-969697324);
        if ((i13 & 6) == 0) {
            i15 = (c28655q3.m87153g(abstractC36042c) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i25 = i14 & 2;
        if (i25 == 0) {
            if ((i13 & 48) == 0) {
                c30365b2 = c30365b;
                i15 |= c28655q3.m87157i(c30365b2) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if (c28655q3.m87157i(function1)) {
                    i24 = 256;
                } else {
                    i24 = 128;
                }
                i15 |= i24;
            }
            if ((i13 & 3072) == 0) {
                if (c28655q3.m87157i(interfaceC4339a)) {
                    i19 = 2048;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q3.m87135U(i15 & 1, z4)) {
                if (i25 != 0) {
                    c30365b3 = null;
                } else {
                    c30365b3 = c30365b2;
                }
                z13 = abstractC36042c instanceof AbstractC36042c.e;
                c2314t = C2314t.f9131w;
                c28676v0 = C28635l.f115821a;
                if (z13) {
                    c28655q3.m87150e0(-302679724);
                    AbstractC33208p0.c cVar = AbstractC33208p0.c.f138471e;
                    TextResource textResourceM21267a = AbstractC8693b.m21267a();
                    objM87133R5 = c28655q3.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = d.f164180w;
                        c28655q3.m87172p0(objM87133R5);
                    }
                    AbstractC33199m0.m105214F(cVar, textResourceM21267a, null, null, null, false, false, null, null, AbstractC18249c.m52565c(c2314t, AbstractC18249c.m52574l((Function1) objM87133R5)), true, false, c28655q3, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 6, 2556);
                    c28655q2 = c28655q3;
                    c28655q2.m87173q(false);
                } else {
                    c28655q2 = c28655q3;
                    if (abstractC36042c instanceof AbstractC36042c.d) {
                        c28655q2.m87150e0(-302367089);
                        m122696A(c28655q2, 0);
                        c28655q2.m87173q(false);
                    } else {
                        if (abstractC36042c instanceof AbstractC36042c.f) {
                            c28655q2.m87150e0(-302119492);
                            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                            iHashCode = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, c2314t);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            C0209i c0209i2 = C0217k.f729g;
                            AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a);
                            C0209i c0209i3 = C0217k.f728f;
                            AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m);
                            c0209i = C0217k.f732j;
                            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                            }
                            C0209i c0209i4 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            float f15 = 8;
                            float f16 = ((float) 1.5d) * f15;
                            Modifier modifierM3396r = AbstractC1099a.m3396r(new LayoutWeightElement(1.0f, false), f16, 0.0f, 2);
                            i16 = i15 & 14;
                            if (i16 == 4) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            i17 = i15 & 896;
                            if (i17 == 256) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            zM87157i = z14 | z15 | c28655q2.m87157i(c30365b3);
                            objM87133R2 = c28655q2.m87133R();
                            if (zM87157i || objM87133R2 == c28676v0) {
                                objM87133R2 = new C37082e1((AbstractC36042c.f) abstractC36042c, function1, c30365b3, 8);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            AbstractC22674j.m65717c(modifierM3396r, null, null, null, null, null, false, null, (Function1) objM87133R2, c28655q2, 0, 510);
                            c28655q2 = c28655q2;
                            Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t), ((float) 2.5d) * f15, 2 * f15);
                            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9107J, c28655q2, 6);
                            iHashCode2 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3395q);
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i2, c22994r1M66759a);
                            AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m2);
                            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                            fVar = (AbstractC36042c.f) abstractC36042c;
                            c36044eM114413f = fVar.getLeftButton();
                            if (c36044eM114413f == null) {
                                c28655q2.m87150e0(-2000157161);
                                c28655q2.m87173q(false);
                                z19 = false;
                                c30365b4 = c30365b3;
                                c28676v1 = c28676v0;
                                f13 = 1.0f;
                            } else {
                                c28655q2.m87150e0(-2000157160);
                                TextResource textResourceM114420c = c36044eM114413f.getText();
                                C22976l1 c22976l1 = AbstractC15166v0.f56891a;
                                C38072d c38072d = C38072d.f163053a;
                                int i26 = C38072d.f163054b;
                                C15077m1 c15077m1M43196a = AbstractC15166v0.m43196a(c38072d.m121949b(c28655q2, i26).getTransparent(), c38072d.m121949b(c28655q2, i26).getBrandWhite(), 0L, 0L, c28655q2, 0, 12);
                                C13825t c13825tM48880a = AbstractC17269i.m48880a(((float) 0.5d) * 4, c38072d.m121949b(c28655q2, i26).getWhite20());
                                f13 = 1.0f;
                                if (1.0f <= 0.0d) {
                                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                }
                                if (1.0f > Float.MAX_VALUE) {
                                    f14 = Float.MAX_VALUE;
                                } else {
                                    f14 = 1.0f;
                                }
                                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(f14, true);
                                boolean zM87157i2 = c28655q2.m87157i(c36044eM114413f) | c28655q2.m87157i(c30365b3);
                                if (i16 == 4) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                boolean z28 = zM87157i2 | z16;
                                if (i17 == 256) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                z18 = z28 | z17;
                                objM87133R3 = c28655q2.m87133R();
                                if (!z18 || objM87133R3 == c28676v0) {
                                    c30365b4 = c30365b3;
                                    final int i27 = 1;
                                    i18 = i17;
                                    obj = null;
                                    InterfaceC4339a interfaceC4339a3 = new InterfaceC4339a() { // from class: xh0.a
                                        @Override // c93.InterfaceC4339a
                                        public final Object invoke() {
                                            switch (i27) {
                                                case 0:
                                                    return AbstractC38307c.m122705J(c36044eM114413f, c30365b4, fVar, function1);
                                                default:
                                                    return AbstractC38307c.m122704I(c36044eM114413f, c30365b4, fVar, function1);
                                            }
                                        }
                                    };
                                    c28655q2.m87172p0(interfaceC4339a3);
                                    objM87133R3 = interfaceC4339a3;
                                } else {
                                    c30365b4 = c30365b3;
                                    obj = null;
                                    i18 = i17;
                                }
                                i17 = i18;
                                z19 = false;
                                c28676v1 = c28676v0;
                                AbstractC27292z.m82343j(layoutWeightElement, false, false, null, null, null, textResourceM114420c, c15077m1M43196a, null, c13825tM48880a, 0.0f, null, null, (InterfaceC4339a) objM87133R3, c28655q2, TextResource.$stable << 18, 0, 7486);
                                c28655q2 = c28655q2;
                                c28655q2.m87173q(false);
                            }
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f16, c2314t));
                            c36044eM114415h = fVar.getRightButton();
                            if (c36044eM114415h == null) {
                                c28655q2.m87150e0(-1998994723);
                                c28655q2.m87173q(z19);
                                z19 = z19;
                                z27 = true;
                            } else {
                                c28655q2.m87150e0(-1998994722);
                                TextResource textResourceM114420c2 = c36044eM114415h.getText();
                                if (f13 <= 0.0d) {
                                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                }
                                if (f13 > Float.MAX_VALUE) {
                                    f13 = Float.MAX_VALUE;
                                }
                                LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(f13, true);
                                enumC16313m0M114418a = c36044eM114415h.getIcon();
                                if (enumC16313m0M114418a != null) {
                                    numValueOf = Integer.valueOf(enumC16313m0M114418a.toWhoopIcon());
                                } else {
                                    numValueOf = null;
                                }
                                boolean zM87157i3 = c28655q2.m87157i(c36044eM114415h) | c28655q2.m87157i(c30365b4);
                                if (i16 == 4) {
                                    z24 = true;
                                } else {
                                    z24 = z19;
                                }
                                boolean z29 = zM87157i3 | z24;
                                if (i17 == 256) {
                                    z25 = true;
                                } else {
                                    z25 = z19;
                                }
                                z26 = z29 | z25;
                                objM87133R4 = c28655q2.m87133R();
                                if (!z26 || objM87133R4 == c28676v1) {
                                    final int i28 = 0;
                                    z27 = true;
                                    InterfaceC4339a interfaceC4339a4 = new InterfaceC4339a() { // from class: xh0.a
                                        @Override // c93.InterfaceC4339a
                                        public final Object invoke() {
                                            switch (i28) {
                                                case 0:
                                                    return AbstractC38307c.m122705J(c36044eM114415h, c30365b4, fVar, function1);
                                                default:
                                                    return AbstractC38307c.m122704I(c36044eM114415h, c30365b4, fVar, function1);
                                            }
                                        }
                                    };
                                    c28655q2.m87172p0(interfaceC4339a4);
                                    objM87133R4 = interfaceC4339a4;
                                } else {
                                    z27 = true;
                                }
                                C28655q c28655q4 = c28655q2;
                                AbstractC27292z.m82343j(layoutWeightElement2, false, false, numValueOf, null, null, textResourceM114420c2, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R4, c28655q4, TextResource.$stable << 18, 0, 8118);
                                c28655q2 = c28655q4;
                                c28655q2.m87173q(z19);
                            }
                            AbstractC25012a.m73392y(c28655q2, z27, z27, z19);
                            abstractC36042c2 = abstractC36042c;
                        } else {
                            c30365b4 = c30365b3;
                            abstractC36042c2 = abstractC36042c;
                            if (AbstractC22676k.m65745e(abstractC36042c2, AbstractC36042c.c.f153774a)) {
                                c28655q2.m87150e0(-296640893);
                                AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, new TextResource.C8688b(AbstractC29235c.f118312b, null, 2, 0 == true ? 1 : 0), null, null, null, false, false, null, null, null, true, false, c28655q2, AbstractC33208p0.c.f138472f | (TextResource.C8688b.f25889c << 3), 6, 3068);
                                c28655q2 = c28655q2;
                                c28655q2.m87173q(false);
                            } else {
                                list = null;
                                objArr4 = 0;
                                objArr3 = 0;
                                objArr2 = 0;
                                if (abstractC36042c2 instanceof AbstractC36042c.a) {
                                    c28655q2.m87150e0(-296344502);
                                    AbstractC33199m0.m105214F(new AbstractC33208p0.b(AbstractC8693b.m21278l(((AbstractC36042c.a) abstractC36042c2).getErrorMessage()), false, null, 6, null), new TextResource.C8688b(AbstractC29235c.f118316f, list, 2, objArr2 == true ? 1 : 0), null, null, null, false, false, null, null, null, true, false, c28655q2, AbstractC33208p0.b.f138467h | (TextResource.C8688b.f25889c << 3), 6, 3068);
                                    c28655q2 = c28655q2;
                                    c28655q2.m87173q(false);
                                } else {
                                    if (AbstractC22676k.m65745e(abstractC36042c2, AbstractC36042c.b.f153773a)) {
                                        throw AbstractC11895b.m32003v(128788378, c28655q2, false);
                                    }
                                    c28655q2.m87150e0(-295997767);
                                    AbstractC33199m0.m105214F(new AbstractC33208p0.h(null, 0L, null, 7, null), new TextResource.C8688b(AbstractC29235c.f118315e, objArr3 == true ? 1 : 0, 2, objArr4 == true ? 1 : 0), null, null, null, false, false, null, null, null, true, false, c28655q2, AbstractC33208p0.h.f138482h | (TextResource.C8688b.f25889c << 3), 6, 3068);
                                    c28655q = c28655q2;
                                    if ((i15 & 7168) == 2048) {
                                        objArr = true;
                                    } else {
                                        objArr = false;
                                    }
                                    objM87133R = c28655q.m87133R();
                                    if (!objArr == true || objM87133R == c28676v0) {
                                        interfaceC4339a2 = interfaceC4339a;
                                        objM87133R = new g(interfaceC4339a2, null);
                                        c28655q.m87172p0(objM87133R);
                                    } else {
                                        interfaceC4339a2 = interfaceC4339a;
                                    }
                                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, C23454a0.f92919a);
                                    c28655q.m87173q(false);
                                }
                            }
                        }
                        interfaceC4339a2 = interfaceC4339a;
                        c28655q = c28655q2;
                    }
                    c30365b2 = c30365b4;
                }
                interfaceC4339a2 = interfaceC4339a;
                abstractC36042c2 = abstractC36042c;
                c30365b4 = c30365b3;
                c28655q = c28655q2;
                c30365b2 = c30365b4;
            } else {
                abstractC36042c2 = abstractC36042c;
                c28655q = c28655q3;
                interfaceC4339a2 = interfaceC4339a;
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C36891k(abstractC36042c2, c30365b2, function1, interfaceC4339a2, i13, i14, 7);
            }
        }
        i15 |= 48;
        c30365b2 = c30365b;
        if ((i13 & 384) == 0) {
            if (c28655q3.m87157i(function1)) {
                i24 = 256;
            } else {
                i24 = 128;
            }
            i15 |= i24;
        }
        if ((i13 & 3072) == 0) {
            if (c28655q3.m87157i(interfaceC4339a)) {
                i19 = 2048;
            } else {
                i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i19;
        }
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q3.m87135U(i15 & 1, z4)) {
            if (i25 != 0) {
                c30365b3 = null;
            } else {
                c30365b3 = c30365b2;
            }
            z13 = abstractC36042c instanceof AbstractC36042c.e;
            c2314t = C2314t.f9131w;
            c28676v0 = C28635l.f115821a;
            if (z13) {
                c28655q3.m87150e0(-302679724);
                AbstractC33208p0.c cVar2 = AbstractC33208p0.c.f138471e;
                TextResource textResourceM21267a2 = AbstractC8693b.m21267a();
                objM87133R5 = c28655q3.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = d.f164180w;
                    c28655q3.m87172p0(objM87133R5);
                }
                AbstractC33199m0.m105214F(cVar2, textResourceM21267a2, null, null, null, false, false, null, null, AbstractC18249c.m52565c(c2314t, AbstractC18249c.m52574l((Function1) objM87133R5)), true, false, c28655q3, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 6, 2556);
                c28655q2 = c28655q3;
                c28655q2.m87173q(false);
            } else {
                c28655q2 = c28655q3;
                if (abstractC36042c instanceof AbstractC36042c.d) {
                    c28655q2.m87150e0(-302367089);
                    m122696A(c28655q2, 0);
                    c28655q2.m87173q(false);
                } else {
                    if (abstractC36042c instanceof AbstractC36042c.f) {
                        c28655q2.m87150e0(-302119492);
                        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, c2314t);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        C0209i c0209i5 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q2, c0209i5, c23010xM66775a2);
                        C0209i c0209i6 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m3);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        C0209i c0209i7 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N3);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        float f17 = 8;
                        float f18 = ((float) 1.5d) * f17;
                        Modifier modifierM3396r2 = AbstractC1099a.m3396r(new LayoutWeightElement(1.0f, false), f18, 0.0f, 2);
                        i16 = i15 & 14;
                        if (i16 == 4) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        i17 = i15 & 896;
                        if (i17 == 256) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        zM87157i = z14 | z15 | c28655q2.m87157i(c30365b3);
                        objM87133R2 = c28655q2.m87133R();
                        if (zM87157i) {
                            objM87133R2 = new C37082e1((AbstractC36042c.f) abstractC36042c, function1, c30365b3, 8);
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C37082e1((AbstractC36042c.f) abstractC36042c, function1, c30365b3, 8);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        AbstractC22674j.m65717c(modifierM3396r2, null, null, null, null, null, false, null, (Function1) objM87133R2, c28655q2, 0, 510);
                        c28655q2 = c28655q2;
                        Modifier modifierM3395q2 = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t), ((float) 2.5d) * f17, 2 * f17);
                        C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9107J, c28655q2, 6);
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                        Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3395q2);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i5, c22994r1M66759a2);
                        AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m4);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N4);
                        fVar = (AbstractC36042c.f) abstractC36042c;
                        c36044eM114413f = fVar.getLeftButton();
                        if (c36044eM114413f == null) {
                            c28655q2.m87150e0(-2000157161);
                            c28655q2.m87173q(false);
                            z19 = false;
                            c30365b4 = c30365b3;
                            c28676v1 = c28676v0;
                            f13 = 1.0f;
                        } else {
                            c28655q2.m87150e0(-2000157160);
                            TextResource textResourceM114420c3 = c36044eM114413f.getText();
                            C22976l1 c22976l2 = AbstractC15166v0.f56891a;
                            C38072d c38072d2 = C38072d.f163053a;
                            int i29 = C38072d.f163054b;
                            C15077m1 c15077m1M43196a2 = AbstractC15166v0.m43196a(c38072d2.m121949b(c28655q2, i29).getTransparent(), c38072d2.m121949b(c28655q2, i29).getBrandWhite(), 0L, 0L, c28655q2, 0, 12);
                            C13825t c13825tM48880a2 = AbstractC17269i.m48880a(((float) 0.5d) * 4, c38072d2.m121949b(c28655q2, i29).getWhite20());
                            f13 = 1.0f;
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > Float.MAX_VALUE) {
                                f14 = Float.MAX_VALUE;
                            } else {
                                f14 = 1.0f;
                            }
                            LayoutWeightElement layoutWeightElement3 = new LayoutWeightElement(f14, true);
                            boolean zM87157i4 = c28655q2.m87157i(c36044eM114413f) | c28655q2.m87157i(c30365b3);
                            if (i16 == 4) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            boolean z210 = zM87157i4 | z16;
                            if (i17 == 256) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            z18 = z210 | z17;
                            objM87133R3 = c28655q2.m87133R();
                            if (z18) {
                                c30365b4 = c30365b3;
                                final int i210 = 1;
                                i18 = i17;
                                obj = null;
                                InterfaceC4339a interfaceC4339a5 = new InterfaceC4339a() { // from class: xh0.a
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i210) {
                                            case 0:
                                                return AbstractC38307c.m122705J(c36044eM114413f, c30365b4, fVar, function1);
                                            default:
                                                return AbstractC38307c.m122704I(c36044eM114413f, c30365b4, fVar, function1);
                                        }
                                    }
                                };
                                c28655q2.m87172p0(interfaceC4339a5);
                                objM87133R3 = interfaceC4339a5;
                            } else {
                                c30365b4 = c30365b3;
                                final int i211 = 1;
                                i18 = i17;
                                obj = null;
                                InterfaceC4339a interfaceC4339a6 = new InterfaceC4339a() { // from class: xh0.a
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i211) {
                                            case 0:
                                                return AbstractC38307c.m122705J(c36044eM114413f, c30365b4, fVar, function1);
                                            default:
                                                return AbstractC38307c.m122704I(c36044eM114413f, c30365b4, fVar, function1);
                                        }
                                    }
                                };
                                c28655q2.m87172p0(interfaceC4339a6);
                                objM87133R3 = interfaceC4339a6;
                            }
                            i17 = i18;
                            z19 = false;
                            c28676v1 = c28676v0;
                            AbstractC27292z.m82343j(layoutWeightElement3, false, false, null, null, null, textResourceM114420c3, c15077m1M43196a2, null, c13825tM48880a2, 0.0f, null, null, (InterfaceC4339a) objM87133R3, c28655q2, TextResource.$stable << 18, 0, 7486);
                            c28655q2 = c28655q2;
                            c28655q2.m87173q(false);
                        }
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f18, c2314t));
                        c36044eM114415h = fVar.getRightButton();
                        if (c36044eM114415h == null) {
                            c28655q2.m87150e0(-1998994723);
                            c28655q2.m87173q(z19);
                            z19 = z19;
                            z27 = true;
                        } else {
                            c28655q2.m87150e0(-1998994722);
                            TextResource textResourceM114420c4 = c36044eM114415h.getText();
                            if (f13 <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            if (f13 > Float.MAX_VALUE) {
                                f13 = Float.MAX_VALUE;
                            }
                            LayoutWeightElement layoutWeightElement4 = new LayoutWeightElement(f13, true);
                            enumC16313m0M114418a = c36044eM114415h.getIcon();
                            if (enumC16313m0M114418a != null) {
                                numValueOf = Integer.valueOf(enumC16313m0M114418a.toWhoopIcon());
                            } else {
                                numValueOf = null;
                            }
                            boolean zM87157i5 = c28655q2.m87157i(c36044eM114415h) | c28655q2.m87157i(c30365b4);
                            if (i16 == 4) {
                                z24 = true;
                            } else {
                                z24 = z19;
                            }
                            boolean z211 = zM87157i5 | z24;
                            if (i17 == 256) {
                                z25 = true;
                            } else {
                                z25 = z19;
                            }
                            z26 = z211 | z25;
                            objM87133R4 = c28655q2.m87133R();
                            if (z26) {
                                final int i212 = 0;
                                z27 = true;
                                InterfaceC4339a interfaceC4339a7 = new InterfaceC4339a() { // from class: xh0.a
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i212) {
                                            case 0:
                                                return AbstractC38307c.m122705J(c36044eM114415h, c30365b4, fVar, function1);
                                            default:
                                                return AbstractC38307c.m122704I(c36044eM114415h, c30365b4, fVar, function1);
                                        }
                                    }
                                };
                                c28655q2.m87172p0(interfaceC4339a7);
                                objM87133R4 = interfaceC4339a7;
                            } else {
                                final int i213 = 0;
                                z27 = true;
                                InterfaceC4339a interfaceC4339a8 = new InterfaceC4339a() { // from class: xh0.a
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i213) {
                                            case 0:
                                                return AbstractC38307c.m122705J(c36044eM114415h, c30365b4, fVar, function1);
                                            default:
                                                return AbstractC38307c.m122704I(c36044eM114415h, c30365b4, fVar, function1);
                                        }
                                    }
                                };
                                c28655q2.m87172p0(interfaceC4339a8);
                                objM87133R4 = interfaceC4339a8;
                            }
                            C28655q c28655q5 = c28655q2;
                            AbstractC27292z.m82343j(layoutWeightElement4, false, false, numValueOf, null, null, textResourceM114420c4, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R4, c28655q5, TextResource.$stable << 18, 0, 8118);
                            c28655q2 = c28655q5;
                            c28655q2.m87173q(z19);
                        }
                        AbstractC25012a.m73392y(c28655q2, z27, z27, z19);
                        abstractC36042c2 = abstractC36042c;
                    } else {
                        c30365b4 = c30365b3;
                        abstractC36042c2 = abstractC36042c;
                        if (AbstractC22676k.m65745e(abstractC36042c2, AbstractC36042c.c.f153774a)) {
                            c28655q2.m87150e0(-296640893);
                            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, new TextResource.C8688b(AbstractC29235c.f118312b, null, 2, 0 == true ? 1 : 0), null, null, null, false, false, null, null, null, true, false, c28655q2, AbstractC33208p0.c.f138472f | (TextResource.C8688b.f25889c << 3), 6, 3068);
                            c28655q2 = c28655q2;
                            c28655q2.m87173q(false);
                        } else {
                            list = null;
                            objArr4 = 0;
                            objArr3 = 0;
                            objArr2 = 0;
                            if (abstractC36042c2 instanceof AbstractC36042c.a) {
                                c28655q2.m87150e0(-296344502);
                                AbstractC33199m0.m105214F(new AbstractC33208p0.b(AbstractC8693b.m21278l(((AbstractC36042c.a) abstractC36042c2).getErrorMessage()), false, null, 6, null), new TextResource.C8688b(AbstractC29235c.f118316f, list, 2, objArr2 == true ? 1 : 0), null, null, null, false, false, null, null, null, true, false, c28655q2, AbstractC33208p0.b.f138467h | (TextResource.C8688b.f25889c << 3), 6, 3068);
                                c28655q2 = c28655q2;
                                c28655q2.m87173q(false);
                            } else {
                                if (AbstractC22676k.m65745e(abstractC36042c2, AbstractC36042c.b.f153773a)) {
                                    throw AbstractC11895b.m32003v(128788378, c28655q2, false);
                                }
                                c28655q2.m87150e0(-295997767);
                                AbstractC33199m0.m105214F(new AbstractC33208p0.h(null, 0L, null, 7, null), new TextResource.C8688b(AbstractC29235c.f118315e, objArr3 == true ? 1 : 0, 2, objArr4 == true ? 1 : 0), null, null, null, false, false, null, null, null, true, false, c28655q2, AbstractC33208p0.h.f138482h | (TextResource.C8688b.f25889c << 3), 6, 3068);
                                c28655q = c28655q2;
                                if ((i15 & 7168) == 2048) {
                                    objArr = true;
                                } else {
                                    objArr = false;
                                }
                                objM87133R = c28655q.m87133R();
                                if (objArr == true) {
                                    interfaceC4339a2 = interfaceC4339a;
                                    objM87133R = new g(interfaceC4339a2, null);
                                    c28655q.m87172p0(objM87133R);
                                } else {
                                    interfaceC4339a2 = interfaceC4339a;
                                    objM87133R = new g(interfaceC4339a2, null);
                                    c28655q.m87172p0(objM87133R);
                                }
                                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, C23454a0.f92919a);
                                c28655q.m87173q(false);
                            }
                        }
                    }
                    interfaceC4339a2 = interfaceC4339a;
                    c28655q = c28655q2;
                }
                c30365b2 = c30365b4;
            }
            interfaceC4339a2 = interfaceC4339a;
            abstractC36042c2 = abstractC36042c;
            c30365b4 = c30365b3;
            c28655q = c28655q2;
            c30365b2 = c30365b4;
        } else {
            abstractC36042c2 = abstractC36042c;
            c28655q = c28655q3;
            interfaceC4339a2 = interfaceC4339a;
            c28655q.m87138X();
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36891k(abstractC36042c2, c30365b2, function1, interfaceC4339a2, i13, i14, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m122699D(final AbstractC36042c abstractC36042c, Function1 function1, C30365b c30365b, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        final int i13 = 0;
        InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new Function3() { // from class: xh0.b
            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i14 = i13;
                InterfaceC1103a interfaceC1103a = (InterfaceC1103a) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                switch (i14) {
                    case 0:
                        return AbstractC38307c.m122700E(abstractC36042c, interfaceC1103a, composer, iIntValue);
                    default:
                        return AbstractC38307c.m122701F(abstractC36042c, interfaceC1103a, composer, iIntValue);
                }
            }
        }, true, -1538338327), 3);
        final int i14 = 1;
        InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new Function3() { // from class: xh0.b
            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i15 = i14;
                InterfaceC1103a interfaceC1103a = (InterfaceC1103a) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                switch (i15) {
                    case 0:
                        return AbstractC38307c.m122700E(abstractC36042c, interfaceC1103a, composer, iIntValue);
                    default:
                        return AbstractC38307c.m122701F(abstractC36042c, interfaceC1103a, composer, iIntValue);
                }
            }
        }, true, 1545256530), 3);
        List<InterfaceC25312u> listM114409b = ((AbstractC36042c.f) abstractC36042c).m114409b();
        h hVar = h.f164185w;
        ((C26053f) LazyColumn).m77529r(listM114409b.size(), null, new i(hVar, listM114409b), new C37816b(new j(listM114409b, function1), true, 802480018));
        InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C26949h(abstractC36042c, c30365b, function1, 27), true, -1411218511), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m122700E(AbstractC36042c abstractC36042c, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            TextResource textResourceM114416i = ((AbstractC36042c.f) abstractC36042c).getTitle();
            if (textResourceM114416i == null) {
                c28655q.m87150e0(-1335996621);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1335996620);
                String strM21274h = AbstractC8693b.m21274h(textResourceM114416i, c28655q, TextResource.$stable);
                C38072d c38072d = C38072d.f163053a;
                int i14 = C38072d.f163054b;
                AbstractC30795n.m94707h(strM21274h, AbstractC1099a.m3396r(C2314t.f9131w, 0.0f, 1 * 8, 1), c38072d.m121949b(c28655q, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getT3(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m122701F(AbstractC36042c abstractC36042c, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            TextResource textResourceM114414g = ((AbstractC36042c.f) abstractC36042c).getMessage();
            if (textResourceM114414g == null) {
                c28655q.m87150e0(1277870563);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1277870564);
                float f13 = 4;
                C2314t c2314t = C2314t.f9131w;
                AbstractC18489d0.m53380u(1, f13, c2314t, c28655q);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 48);
                int iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
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
                AbstractC27348d.m82519c(null, c28655q, 0, 1);
                AbstractC18489d0.m53380u(2, f13, c2314t, c28655q);
                String strM21274h = AbstractC8693b.m21274h(textResourceM114414g, c28655q, TextResource.$stable);
                C38072d c38072d = C38072d.f163053a;
                int i14 = C38072d.f163054b;
                AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, i14).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getB1(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
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
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m122702G(AbstractC36042c abstractC36042c, C30365b c30365b, Function1 function1, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            C36044e c36044eM114410c = ((AbstractC36042c.f) abstractC36042c).getGenerateAlternativesButton();
            if (c36044eM114410c == null) {
                c28655q.m87150e0(1824304372);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1824304373);
                float f13 = 8;
                C2314t c2314t = C2314t.f9131w;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(1 * f13, c2314t));
                TextResource textResourceM114420c = c36044eM114410c.getText();
                C38072d c38072d = C38072d.f163053a;
                int i14 = C38072d.f163054b;
                C2886a c2886aM8430k = c38072d.m121952e(c28655q, i14).getBtS();
                EnumC16313m0 enumC16313m0M114418a = c36044eM114410c.getIcon();
                Integer numValueOf = enumC16313m0M114418a != null ? Integer.valueOf(enumC16313m0M114418a.toWhoopIcon()) : null;
                Modifier modifierM44061s = AbstractC15673b0.m44061s(c2314t, f164171e);
                C22976l1 c22976l1 = AbstractC15166v0.f56891a;
                C15077m1 c15077m1M43196a = AbstractC15166v0.m43196a(c38072d.m121949b(c28655q, i14).getTransparent(), c38072d.m121949b(c28655q, i14).getBrandWhite(), 0L, 0L, c28655q, 0, 12);
                Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 2 * f13, 1);
                boolean zM87157i = c28655q.m87157i(c36044eM114410c) | c28655q.m87157i(c30365b) | c28655q.m87153g(function1);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == C28635l.f115821a) {
                    objM87133R = new C31324k(c36044eM114410c, c30365b, function1, 22);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC27292z.m82343j(modifierM3396r, false, false, numValueOf, modifierM44061s, null, textResourceM114420c, c15077m1M43196a, null, null, 0.0f, null, c2886aM8430k, (InterfaceC4339a) objM87133R, c28655q, (TextResource.$stable << 18) | 6, C2886a.f11498d << 6, 3878);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m122703H(C36044e c36044e, C30365b c30365b, Function1 function1) {
        C9598e c9598eM114419b = c36044e.getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String();
        if (c9598eM114419b != null) {
            if (c30365b != null) {
                c30365b.m92836a(AbstractC30364a.b.f124566a);
            }
            function1.invoke(new AbstractC34963a.a(c9598eM114419b));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m122704I(C36044e c36044e, C30365b c30365b, AbstractC36042c abstractC36042c, Function1 function1) {
        C9598e c9598eM114419b = c36044e.getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String();
        if (c9598eM114419b != null) {
            if (c30365b != null) {
                c30365b.m92836a(new AbstractC30364a.a(((AbstractC36042c.f) abstractC36042c).getAnalyticsActivityString()));
            }
            function1.invoke(new AbstractC34963a.a(c9598eM114419b));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m122705J(C36044e c36044e, C30365b c30365b, AbstractC36042c abstractC36042c, Function1 function1) {
        C9598e c9598eM114419b = c36044e.getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String();
        if (c9598eM114419b != null) {
            if (c30365b != null) {
                c30365b.m92836a(new AbstractC30364a.e(((AbstractC36042c.f) abstractC36042c).getAnalyticsActivityString()));
            }
            function1.invoke(new AbstractC34963a.a(c9598eM114419b));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m122706K(AbstractC36042c abstractC36042c, C30365b c30365b, Function1 function1, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m122698C(abstractC36042c, c30365b, function1, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x014a  */
    /* JADX WARN: Code duplicated, block: B:101:0x014d  */
    /* JADX WARN: Code duplicated, block: B:104:0x015a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:105:0x015c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0178  */
    /* JADX WARN: Code duplicated, block: B:111:0x0182 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:112:0x0184  */
    /* JADX WARN: Code duplicated, block: B:115:0x0195  */
    /* JADX WARN: Code duplicated, block: B:117:0x019e  */
    /* JADX WARN: Code duplicated, block: B:120:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:121:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:123:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:125:0x024b  */
    /* JADX WARN: Code duplicated, block: B:128:0x025b  */
    /* JADX WARN: Code duplicated, block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:57:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:67:0x00be  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:86:0x0100  */
    /* JADX WARN: Code duplicated, block: B:88:0x0104  */
    /* JADX WARN: Code duplicated, block: B:89:0x0107  */
    /* JADX WARN: Code duplicated, block: B:91:0x010a  */
    /* JADX WARN: Code duplicated, block: B:93:0x0110  */
    /* JADX WARN: Code duplicated, block: B:97:0x0123  */
    /* JADX WARN: Multi-variable type inference failed */
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
    /* JADX INFO: renamed from: r */
    public static final void m122725r(AbstractC36042c viewState, C30365b c30365b, Function1 function1, Function1 function2, boolean z4, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        C30365b c30365b2;
        int i16;
        Function1 function3;
        int i17;
        int i18;
        Function1 function4;
        int i19;
        int i24;
        boolean z13;
        int i25;
        int i26;
        InterfaceC4339a interfaceC4339a2;
        int i27;
        boolean z14;
        C28655q c28655q;
        C30365b c30365b3;
        Function1 function5;
        Function1 function6;
        InterfaceC4339a interfaceC4339a3;
        boolean z15;
        C28677v1 c28677v1M87180u;
        List list;
        C30365b c30365b4;
        C28676v0 c28676v0;
        Function1 function7;
        Function1 function8;
        boolean z16;
        Object objM87133R;
        C15199y3 c15199y3M3460c;
        boolean z17;
        boolean zM87157i;
        Object objM87133R2;
        boolean zM87157i2;
        Object objM87133R3;
        C35666g c35666g;
        TextResource textResourceM114411d;
        int i28;
        EnumC16313m0 enumC16313m0M114412e;
        C39274g c39274g;
        Object objM87133R4;
        Object objM87133R5;
        Object objM87133R6;
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1432991381);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i29 = i14 & 2;
        if (i29 == 0) {
            if ((i13 & 48) == 0) {
                c30365b2 = c30365b;
                i15 |= c28655q2.m87157i(c30365b2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function3 = function1;
                    if (c28655q2.m87157i(function3)) {
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
                        if (c28655q2.m87157i(function4)) {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i15 |= i19;
                    }
                    i24 = i14 & 16;
                    if (i24 != 0) {
                        if ((i13 & 24576) == 0) {
                            z13 = z4;
                            if (c28655q2.m87155h(z13)) {
                                i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                            } else {
                                i25 = DfuBaseService.ERROR_REMOTE_MASK;
                            }
                            i15 |= i25;
                        }
                        i26 = i14 & 32;
                        if (i26 != 0) {
                            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                            interfaceC4339a2 = interfaceC4339a;
                        } else {
                            interfaceC4339a2 = interfaceC4339a;
                            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                                if (c28655q2.m87157i(interfaceC4339a2)) {
                                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                                } else {
                                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                                }
                                i15 |= i27;
                            }
                        }
                        if ((i15 & 74899) != 74898) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c28655q2.m87135U(i15 & 1, z14)) {
                            list = null;
                            objArr3 = 0;
                            objArr2 = 0;
                            objArr = 0;
                            if (i29 != 0) {
                                c30365b4 = null;
                            } else {
                                c30365b4 = c30365b2;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i16 != 0) {
                                objM87133R6 = c28655q2.m87133R();
                                if (objM87133R6 == c28676v0) {
                                    objM87133R6 = new C38136a(17);
                                    c28655q2.m87172p0(objM87133R6);
                                }
                                function7 = (Function1) objM87133R6;
                            } else {
                                function7 = function3;
                            }
                            if (i18 != 0) {
                                objM87133R5 = c28655q2.m87133R();
                                if (objM87133R5 == c28676v0) {
                                    objM87133R5 = new C38136a(18);
                                    c28655q2.m87172p0(objM87133R5);
                                }
                                function8 = (Function1) objM87133R5;
                            } else {
                                function8 = function4;
                            }
                            if (i24 != 0) {
                                z16 = true;
                            } else {
                                z16 = z13;
                            }
                            if (i26 != 0) {
                                objM87133R4 = c28655q2.m87133R();
                                if (objM87133R4 == c28676v0) {
                                    objM87133R4 = new C38138a(28);
                                    c28655q2.m87172p0(objM87133R4);
                                }
                                interfaceC4339a2 = (InterfaceC4339a) objM87133R4;
                            }
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = AbstractC28683x.m87262p(c28655q2);
                                c28655q2.m87172p0(objM87133R);
                            }
                            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                            c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57107x, null, null, true, c28655q2, 3078, 6);
                            Boolean boolValueOf = Boolean.valueOf(z16);
                            if ((57344 & i15) == 16384) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            zM87157i = z17 | c28655q2.m87157i(c15199y3M3460c);
                            objM87133R2 = c28655q2.m87133R();
                            if (zM87157i || objM87133R2 == c28676v0) {
                                objM87133R2 = new a(z16, c15199y3M3460c, null);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R2, boolValueOf);
                            EnumC15209z3 enumC15209z3M43221b = c15199y3M3460c.m43221b();
                            zM87157i2 = c28655q2.m87157i(c15199y3M3460c) | ((i15 & 458752) == 131072);
                            objM87133R3 = c28655q2.m87133R();
                            if (zM87157i2 || objM87133R3 == c28676v0) {
                                objM87133R3 = new b(c15199y3M3460c, interfaceC4339a2, null);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R3, enumC15209z3M43221b);
                            if (viewState instanceof AbstractC36042c.f) {
                                AbstractC36042c.f fVar = (AbstractC36042c.f) viewState;
                                textResourceM114411d = fVar.getHeader();
                                if (textResourceM114411d == null) {
                                    textResourceM114411d = AbstractC8693b.m21267a();
                                }
                                TextResource textResource = textResourceM114411d;
                                i28 = 2;
                                C39274g c39274g2 = new C39274g(EnumC16313m0.CROSS.toWhoopIcon(), new TextResource.C8688b(AbstractC29235c.f118314d, list, i28, objArr == true ? 1 : 0));
                                enumC16313m0M114412e = fVar.getHeaderRightIcon();
                                if (enumC16313m0M114412e != null) {
                                    c39274g = new C39274g(enumC16313m0M114412e.toWhoopIcon(), new TextResource.C8688b(AbstractC29235c.f118311a, objArr2 == true ? 1 : 0, i28, objArr3 == true ? 1 : 0));
                                } else {
                                    c39274g = null;
                                }
                                c35666g = new C35666g(textResource, c39274g2, c39274g, EnumC35671i0.LEFT, null, 0.0f, 0.0f, 112, null);
                            } else {
                                c35666g = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                            }
                            InterfaceC4339a interfaceC4339a4 = interfaceC4339a2;
                            C30365b c30365b5 = c30365b4;
                            Function1 function9 = function7;
                            Function1 function10 = function8;
                            c28655q = c28655q2;
                            AbstractC17269i.m48898k(AbstractC1102d.m3407d(1.0f, C2314t.f9131w), null, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getBlack50(), 0L, null, 0.0f, AbstractC37817c.m121344e(-12952401, c28655q2, new C3466p(c15199y3M3460c, c35666g, interfaceC2994c0, c30365b5, function9, viewState, function10, interfaceC4339a4)), c28655q, 1572870, 58);
                            c30365b3 = c30365b5;
                            function5 = function9;
                            function6 = function10;
                            interfaceC4339a3 = interfaceC4339a4;
                            z15 = z16;
                        } else {
                            c28655q = c28655q2;
                            c28655q.m87138X();
                            c30365b3 = c30365b2;
                            function5 = function3;
                            function6 = function4;
                            interfaceC4339a3 = interfaceC4339a2;
                            z15 = z13;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new C2541i2(viewState, c30365b3, function5, function6, z15, interfaceC4339a3, i13, i14);
                        }
                    }
                    i15 |= 24576;
                    z13 = z4;
                    i26 = i14 & 32;
                    if (i26 != 0) {
                        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                        interfaceC4339a2 = interfaceC4339a;
                    } else {
                        interfaceC4339a2 = interfaceC4339a;
                        if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                            if (c28655q2.m87157i(interfaceC4339a2)) {
                                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                            } else {
                                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                            }
                            i15 |= i27;
                        }
                    }
                    if ((i15 & 74899) != 74898) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z14)) {
                        list = null;
                        objArr3 = 0;
                        objArr2 = 0;
                        objArr = 0;
                        if (i29 != 0) {
                            c30365b4 = null;
                        } else {
                            c30365b4 = c30365b2;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R6 = c28655q2.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C38136a(17);
                                c28655q2.m87172p0(objM87133R6);
                            }
                            function7 = (Function1) objM87133R6;
                        } else {
                            function7 = function3;
                        }
                        if (i18 != 0) {
                            objM87133R5 = c28655q2.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C38136a(18);
                                c28655q2.m87172p0(objM87133R5);
                            }
                            function8 = (Function1) objM87133R5;
                        } else {
                            function8 = function4;
                        }
                        if (i24 != 0) {
                            z16 = true;
                        } else {
                            z16 = z13;
                        }
                        if (i26 != 0) {
                            objM87133R4 = c28655q2.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C38138a(28);
                                c28655q2.m87172p0(objM87133R4);
                            }
                            interfaceC4339a2 = (InterfaceC4339a) objM87133R4;
                        }
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87262p(c28655q2);
                            c28655q2.m87172p0(objM87133R);
                        }
                        InterfaceC2994c0 interfaceC2994c1 = (InterfaceC2994c0) objM87133R;
                        c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57107x, null, null, true, c28655q2, 3078, 6);
                        Boolean boolValueOf2 = Boolean.valueOf(z16);
                        if ((57344 & i15) == 16384) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zM87157i = z17 | c28655q2.m87157i(c15199y3M3460c);
                        objM87133R2 = c28655q2.m87133R();
                        if (zM87157i) {
                            objM87133R2 = new a(z16, c15199y3M3460c, null);
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new a(z16, c15199y3M3460c, null);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R2, boolValueOf2);
                        EnumC15209z3 enumC15209z3M43221b2 = c15199y3M3460c.m43221b();
                        zM87157i2 = c28655q2.m87157i(c15199y3M3460c) | ((i15 & 458752) == 131072);
                        objM87133R3 = c28655q2.m87133R();
                        if (zM87157i2) {
                            objM87133R3 = new b(c15199y3M3460c, interfaceC4339a2, null);
                            c28655q2.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new b(c15199y3M3460c, interfaceC4339a2, null);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R3, enumC15209z3M43221b2);
                        if (viewState instanceof AbstractC36042c.f) {
                            AbstractC36042c.f fVar2 = (AbstractC36042c.f) viewState;
                            textResourceM114411d = fVar2.getHeader();
                            if (textResourceM114411d == null) {
                                textResourceM114411d = AbstractC8693b.m21267a();
                            }
                            TextResource textResource2 = textResourceM114411d;
                            i28 = 2;
                            C39274g c39274g3 = new C39274g(EnumC16313m0.CROSS.toWhoopIcon(), new TextResource.C8688b(AbstractC29235c.f118314d, list, i28, objArr == true ? 1 : 0));
                            enumC16313m0M114412e = fVar2.getHeaderRightIcon();
                            if (enumC16313m0M114412e != null) {
                                c39274g = new C39274g(enumC16313m0M114412e.toWhoopIcon(), new TextResource.C8688b(AbstractC29235c.f118311a, objArr2 == true ? 1 : 0, i28, objArr3 == true ? 1 : 0));
                            } else {
                                c39274g = null;
                            }
                            c35666g = new C35666g(textResource2, c39274g3, c39274g, EnumC35671i0.LEFT, null, 0.0f, 0.0f, 112, null);
                        } else {
                            c35666g = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                        }
                        InterfaceC4339a interfaceC4339a5 = interfaceC4339a2;
                        C30365b c30365b6 = c30365b4;
                        Function1 function11 = function7;
                        Function1 function12 = function8;
                        c28655q = c28655q2;
                        AbstractC17269i.m48898k(AbstractC1102d.m3407d(1.0f, C2314t.f9131w), null, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getBlack50(), 0L, null, 0.0f, AbstractC37817c.m121344e(-12952401, c28655q2, new C3466p(c15199y3M3460c, c35666g, interfaceC2994c1, c30365b6, function11, viewState, function12, interfaceC4339a5)), c28655q, 1572870, 58);
                        c30365b3 = c30365b6;
                        function5 = function11;
                        function6 = function12;
                        interfaceC4339a3 = interfaceC4339a5;
                        z15 = z16;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        c30365b3 = c30365b2;
                        function5 = function3;
                        function6 = function4;
                        interfaceC4339a3 = interfaceC4339a2;
                        z15 = z13;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C2541i2(viewState, c30365b3, function5, function6, z15, interfaceC4339a3, i13, i14);
                    }
                }
                i15 |= 3072;
                function4 = function2;
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        z13 = z4;
                        if (c28655q2.m87155h(z13)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    i26 = i14 & 32;
                    if (i26 != 0) {
                        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                        interfaceC4339a2 = interfaceC4339a;
                    } else {
                        interfaceC4339a2 = interfaceC4339a;
                        if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                            if (c28655q2.m87157i(interfaceC4339a2)) {
                                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                            } else {
                                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                            }
                            i15 |= i27;
                        }
                    }
                    if ((i15 & 74899) != 74898) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z14)) {
                        list = null;
                        objArr3 = 0;
                        objArr2 = 0;
                        objArr = 0;
                        if (i29 != 0) {
                            c30365b4 = null;
                        } else {
                            c30365b4 = c30365b2;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R6 = c28655q2.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C38136a(17);
                                c28655q2.m87172p0(objM87133R6);
                            }
                            function7 = (Function1) objM87133R6;
                        } else {
                            function7 = function3;
                        }
                        if (i18 != 0) {
                            objM87133R5 = c28655q2.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C38136a(18);
                                c28655q2.m87172p0(objM87133R5);
                            }
                            function8 = (Function1) objM87133R5;
                        } else {
                            function8 = function4;
                        }
                        if (i24 != 0) {
                            z16 = true;
                        } else {
                            z16 = z13;
                        }
                        if (i26 != 0) {
                            objM87133R4 = c28655q2.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C38138a(28);
                                c28655q2.m87172p0(objM87133R4);
                            }
                            interfaceC4339a2 = (InterfaceC4339a) objM87133R4;
                        }
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87262p(c28655q2);
                            c28655q2.m87172p0(objM87133R);
                        }
                        InterfaceC2994c0 interfaceC2994c2 = (InterfaceC2994c0) objM87133R;
                        c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57107x, null, null, true, c28655q2, 3078, 6);
                        Boolean boolValueOf3 = Boolean.valueOf(z16);
                        if ((57344 & i15) == 16384) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zM87157i = z17 | c28655q2.m87157i(c15199y3M3460c);
                        objM87133R2 = c28655q2.m87133R();
                        if (zM87157i) {
                            objM87133R2 = new a(z16, c15199y3M3460c, null);
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new a(z16, c15199y3M3460c, null);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R2, boolValueOf3);
                        EnumC15209z3 enumC15209z3M43221b3 = c15199y3M3460c.m43221b();
                        zM87157i2 = c28655q2.m87157i(c15199y3M3460c) | ((i15 & 458752) == 131072);
                        objM87133R3 = c28655q2.m87133R();
                        if (zM87157i2) {
                            objM87133R3 = new b(c15199y3M3460c, interfaceC4339a2, null);
                            c28655q2.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new b(c15199y3M3460c, interfaceC4339a2, null);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R3, enumC15209z3M43221b3);
                        if (viewState instanceof AbstractC36042c.f) {
                            AbstractC36042c.f fVar3 = (AbstractC36042c.f) viewState;
                            textResourceM114411d = fVar3.getHeader();
                            if (textResourceM114411d == null) {
                                textResourceM114411d = AbstractC8693b.m21267a();
                            }
                            TextResource textResource3 = textResourceM114411d;
                            i28 = 2;
                            C39274g c39274g4 = new C39274g(EnumC16313m0.CROSS.toWhoopIcon(), new TextResource.C8688b(AbstractC29235c.f118314d, list, i28, objArr == true ? 1 : 0));
                            enumC16313m0M114412e = fVar3.getHeaderRightIcon();
                            if (enumC16313m0M114412e != null) {
                                c39274g = new C39274g(enumC16313m0M114412e.toWhoopIcon(), new TextResource.C8688b(AbstractC29235c.f118311a, objArr2 == true ? 1 : 0, i28, objArr3 == true ? 1 : 0));
                            } else {
                                c39274g = null;
                            }
                            c35666g = new C35666g(textResource3, c39274g4, c39274g, EnumC35671i0.LEFT, null, 0.0f, 0.0f, 112, null);
                        } else {
                            c35666g = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                        }
                        InterfaceC4339a interfaceC4339a6 = interfaceC4339a2;
                        C30365b c30365b7 = c30365b4;
                        Function1 function13 = function7;
                        Function1 function14 = function8;
                        c28655q = c28655q2;
                        AbstractC17269i.m48898k(AbstractC1102d.m3407d(1.0f, C2314t.f9131w), null, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getBlack50(), 0L, null, 0.0f, AbstractC37817c.m121344e(-12952401, c28655q2, new C3466p(c15199y3M3460c, c35666g, interfaceC2994c2, c30365b7, function13, viewState, function14, interfaceC4339a6)), c28655q, 1572870, 58);
                        c30365b3 = c30365b7;
                        function5 = function13;
                        function6 = function14;
                        interfaceC4339a3 = interfaceC4339a6;
                        z15 = z16;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        c30365b3 = c30365b2;
                        function5 = function3;
                        function6 = function4;
                        interfaceC4339a3 = interfaceC4339a2;
                        z15 = z13;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C2541i2(viewState, c30365b3, function5, function6, z15, interfaceC4339a3, i13, i14);
                    }
                }
                i15 |= 24576;
                z13 = z4;
                i26 = i14 & 32;
                if (i26 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    interfaceC4339a2 = interfaceC4339a;
                } else {
                    interfaceC4339a2 = interfaceC4339a;
                    if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q2.m87157i(interfaceC4339a2)) {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i27;
                    }
                }
                if ((i15 & 74899) != 74898) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z14)) {
                    list = null;
                    objArr3 = 0;
                    objArr2 = 0;
                    objArr = 0;
                    if (i29 != 0) {
                        c30365b4 = null;
                    } else {
                        c30365b4 = c30365b2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C38136a(17);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        function7 = (Function1) objM87133R6;
                    } else {
                        function7 = function3;
                    }
                    if (i18 != 0) {
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C38136a(18);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        function8 = (Function1) objM87133R5;
                    } else {
                        function8 = function4;
                    }
                    if (i24 != 0) {
                        z16 = true;
                    } else {
                        z16 = z13;
                    }
                    if (i26 != 0) {
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C38138a(28);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R4;
                    }
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87262p(c28655q2);
                        c28655q2.m87172p0(objM87133R);
                    }
                    InterfaceC2994c0 interfaceC2994c3 = (InterfaceC2994c0) objM87133R;
                    c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57107x, null, null, true, c28655q2, 3078, 6);
                    Boolean boolValueOf4 = Boolean.valueOf(z16);
                    if ((57344 & i15) == 16384) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM87157i = z17 | c28655q2.m87157i(c15199y3M3460c);
                    objM87133R2 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R2 = new a(z16, c15199y3M3460c, null);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new a(z16, c15199y3M3460c, null);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R2, boolValueOf4);
                    EnumC15209z3 enumC15209z3M43221b4 = c15199y3M3460c.m43221b();
                    zM87157i2 = c28655q2.m87157i(c15199y3M3460c) | ((i15 & 458752) == 131072);
                    objM87133R3 = c28655q2.m87133R();
                    if (zM87157i2) {
                        objM87133R3 = new b(c15199y3M3460c, interfaceC4339a2, null);
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new b(c15199y3M3460c, interfaceC4339a2, null);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R3, enumC15209z3M43221b4);
                    if (viewState instanceof AbstractC36042c.f) {
                        AbstractC36042c.f fVar4 = (AbstractC36042c.f) viewState;
                        textResourceM114411d = fVar4.getHeader();
                        if (textResourceM114411d == null) {
                            textResourceM114411d = AbstractC8693b.m21267a();
                        }
                        TextResource textResource4 = textResourceM114411d;
                        i28 = 2;
                        C39274g c39274g5 = new C39274g(EnumC16313m0.CROSS.toWhoopIcon(), new TextResource.C8688b(AbstractC29235c.f118314d, list, i28, objArr == true ? 1 : 0));
                        enumC16313m0M114412e = fVar4.getHeaderRightIcon();
                        if (enumC16313m0M114412e != null) {
                            c39274g = new C39274g(enumC16313m0M114412e.toWhoopIcon(), new TextResource.C8688b(AbstractC29235c.f118311a, objArr2 == true ? 1 : 0, i28, objArr3 == true ? 1 : 0));
                        } else {
                            c39274g = null;
                        }
                        c35666g = new C35666g(textResource4, c39274g5, c39274g, EnumC35671i0.LEFT, null, 0.0f, 0.0f, 112, null);
                    } else {
                        c35666g = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                    }
                    InterfaceC4339a interfaceC4339a7 = interfaceC4339a2;
                    C30365b c30365b8 = c30365b4;
                    Function1 function15 = function7;
                    Function1 function16 = function8;
                    c28655q = c28655q2;
                    AbstractC17269i.m48898k(AbstractC1102d.m3407d(1.0f, C2314t.f9131w), null, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getBlack50(), 0L, null, 0.0f, AbstractC37817c.m121344e(-12952401, c28655q2, new C3466p(c15199y3M3460c, c35666g, interfaceC2994c3, c30365b8, function15, viewState, function16, interfaceC4339a7)), c28655q, 1572870, 58);
                    c30365b3 = c30365b8;
                    function5 = function15;
                    function6 = function16;
                    interfaceC4339a3 = interfaceC4339a7;
                    z15 = z16;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    c30365b3 = c30365b2;
                    function5 = function3;
                    function6 = function4;
                    interfaceC4339a3 = interfaceC4339a2;
                    z15 = z13;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2541i2(viewState, c30365b3, function5, function6, z15, interfaceC4339a3, i13, i14);
                }
            }
            i15 |= 384;
            function3 = function1;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    function4 = function2;
                    if (c28655q2.m87157i(function4)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        z13 = z4;
                        if (c28655q2.m87155h(z13)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    i26 = i14 & 32;
                    if (i26 != 0) {
                        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                        interfaceC4339a2 = interfaceC4339a;
                    } else {
                        interfaceC4339a2 = interfaceC4339a;
                        if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                            if (c28655q2.m87157i(interfaceC4339a2)) {
                                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                            } else {
                                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                            }
                            i15 |= i27;
                        }
                    }
                    if ((i15 & 74899) != 74898) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z14)) {
                        list = null;
                        objArr3 = 0;
                        objArr2 = 0;
                        objArr = 0;
                        if (i29 != 0) {
                            c30365b4 = null;
                        } else {
                            c30365b4 = c30365b2;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R6 = c28655q2.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C38136a(17);
                                c28655q2.m87172p0(objM87133R6);
                            }
                            function7 = (Function1) objM87133R6;
                        } else {
                            function7 = function3;
                        }
                        if (i18 != 0) {
                            objM87133R5 = c28655q2.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C38136a(18);
                                c28655q2.m87172p0(objM87133R5);
                            }
                            function8 = (Function1) objM87133R5;
                        } else {
                            function8 = function4;
                        }
                        if (i24 != 0) {
                            z16 = true;
                        } else {
                            z16 = z13;
                        }
                        if (i26 != 0) {
                            objM87133R4 = c28655q2.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C38138a(28);
                                c28655q2.m87172p0(objM87133R4);
                            }
                            interfaceC4339a2 = (InterfaceC4339a) objM87133R4;
                        }
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87262p(c28655q2);
                            c28655q2.m87172p0(objM87133R);
                        }
                        InterfaceC2994c0 interfaceC2994c4 = (InterfaceC2994c0) objM87133R;
                        c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57107x, null, null, true, c28655q2, 3078, 6);
                        Boolean boolValueOf5 = Boolean.valueOf(z16);
                        if ((57344 & i15) == 16384) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zM87157i = z17 | c28655q2.m87157i(c15199y3M3460c);
                        objM87133R2 = c28655q2.m87133R();
                        if (zM87157i) {
                            objM87133R2 = new a(z16, c15199y3M3460c, null);
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new a(z16, c15199y3M3460c, null);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R2, boolValueOf5);
                        EnumC15209z3 enumC15209z3M43221b5 = c15199y3M3460c.m43221b();
                        zM87157i2 = c28655q2.m87157i(c15199y3M3460c) | ((i15 & 458752) == 131072);
                        objM87133R3 = c28655q2.m87133R();
                        if (zM87157i2) {
                            objM87133R3 = new b(c15199y3M3460c, interfaceC4339a2, null);
                            c28655q2.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new b(c15199y3M3460c, interfaceC4339a2, null);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R3, enumC15209z3M43221b5);
                        if (viewState instanceof AbstractC36042c.f) {
                            AbstractC36042c.f fVar5 = (AbstractC36042c.f) viewState;
                            textResourceM114411d = fVar5.getHeader();
                            if (textResourceM114411d == null) {
                                textResourceM114411d = AbstractC8693b.m21267a();
                            }
                            TextResource textResource5 = textResourceM114411d;
                            i28 = 2;
                            C39274g c39274g6 = new C39274g(EnumC16313m0.CROSS.toWhoopIcon(), new TextResource.C8688b(AbstractC29235c.f118314d, list, i28, objArr == true ? 1 : 0));
                            enumC16313m0M114412e = fVar5.getHeaderRightIcon();
                            if (enumC16313m0M114412e != null) {
                                c39274g = new C39274g(enumC16313m0M114412e.toWhoopIcon(), new TextResource.C8688b(AbstractC29235c.f118311a, objArr2 == true ? 1 : 0, i28, objArr3 == true ? 1 : 0));
                            } else {
                                c39274g = null;
                            }
                            c35666g = new C35666g(textResource5, c39274g6, c39274g, EnumC35671i0.LEFT, null, 0.0f, 0.0f, 112, null);
                        } else {
                            c35666g = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                        }
                        InterfaceC4339a interfaceC4339a8 = interfaceC4339a2;
                        C30365b c30365b9 = c30365b4;
                        Function1 function17 = function7;
                        Function1 function18 = function8;
                        c28655q = c28655q2;
                        AbstractC17269i.m48898k(AbstractC1102d.m3407d(1.0f, C2314t.f9131w), null, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getBlack50(), 0L, null, 0.0f, AbstractC37817c.m121344e(-12952401, c28655q2, new C3466p(c15199y3M3460c, c35666g, interfaceC2994c4, c30365b9, function17, viewState, function18, interfaceC4339a8)), c28655q, 1572870, 58);
                        c30365b3 = c30365b9;
                        function5 = function17;
                        function6 = function18;
                        interfaceC4339a3 = interfaceC4339a8;
                        z15 = z16;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        c30365b3 = c30365b2;
                        function5 = function3;
                        function6 = function4;
                        interfaceC4339a3 = interfaceC4339a2;
                        z15 = z13;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C2541i2(viewState, c30365b3, function5, function6, z15, interfaceC4339a3, i13, i14);
                    }
                }
                i15 |= 24576;
                z13 = z4;
                i26 = i14 & 32;
                if (i26 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    interfaceC4339a2 = interfaceC4339a;
                } else {
                    interfaceC4339a2 = interfaceC4339a;
                    if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q2.m87157i(interfaceC4339a2)) {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i27;
                    }
                }
                if ((i15 & 74899) != 74898) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z14)) {
                    list = null;
                    objArr3 = 0;
                    objArr2 = 0;
                    objArr = 0;
                    if (i29 != 0) {
                        c30365b4 = null;
                    } else {
                        c30365b4 = c30365b2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C38136a(17);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        function7 = (Function1) objM87133R6;
                    } else {
                        function7 = function3;
                    }
                    if (i18 != 0) {
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C38136a(18);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        function8 = (Function1) objM87133R5;
                    } else {
                        function8 = function4;
                    }
                    if (i24 != 0) {
                        z16 = true;
                    } else {
                        z16 = z13;
                    }
                    if (i26 != 0) {
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C38138a(28);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R4;
                    }
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87262p(c28655q2);
                        c28655q2.m87172p0(objM87133R);
                    }
                    InterfaceC2994c0 interfaceC2994c5 = (InterfaceC2994c0) objM87133R;
                    c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57107x, null, null, true, c28655q2, 3078, 6);
                    Boolean boolValueOf6 = Boolean.valueOf(z16);
                    if ((57344 & i15) == 16384) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM87157i = z17 | c28655q2.m87157i(c15199y3M3460c);
                    objM87133R2 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R2 = new a(z16, c15199y3M3460c, null);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new a(z16, c15199y3M3460c, null);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R2, boolValueOf6);
                    EnumC15209z3 enumC15209z3M43221b6 = c15199y3M3460c.m43221b();
                    zM87157i2 = c28655q2.m87157i(c15199y3M3460c) | ((i15 & 458752) == 131072);
                    objM87133R3 = c28655q2.m87133R();
                    if (zM87157i2) {
                        objM87133R3 = new b(c15199y3M3460c, interfaceC4339a2, null);
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new b(c15199y3M3460c, interfaceC4339a2, null);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R3, enumC15209z3M43221b6);
                    if (viewState instanceof AbstractC36042c.f) {
                        AbstractC36042c.f fVar6 = (AbstractC36042c.f) viewState;
                        textResourceM114411d = fVar6.getHeader();
                        if (textResourceM114411d == null) {
                            textResourceM114411d = AbstractC8693b.m21267a();
                        }
                        TextResource textResource6 = textResourceM114411d;
                        i28 = 2;
                        C39274g c39274g7 = new C39274g(EnumC16313m0.CROSS.toWhoopIcon(), new TextResource.C8688b(AbstractC29235c.f118314d, list, i28, objArr == true ? 1 : 0));
                        enumC16313m0M114412e = fVar6.getHeaderRightIcon();
                        if (enumC16313m0M114412e != null) {
                            c39274g = new C39274g(enumC16313m0M114412e.toWhoopIcon(), new TextResource.C8688b(AbstractC29235c.f118311a, objArr2 == true ? 1 : 0, i28, objArr3 == true ? 1 : 0));
                        } else {
                            c39274g = null;
                        }
                        c35666g = new C35666g(textResource6, c39274g7, c39274g, EnumC35671i0.LEFT, null, 0.0f, 0.0f, 112, null);
                    } else {
                        c35666g = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                    }
                    InterfaceC4339a interfaceC4339a9 = interfaceC4339a2;
                    C30365b c30365b10 = c30365b4;
                    Function1 function19 = function7;
                    Function1 function110 = function8;
                    c28655q = c28655q2;
                    AbstractC17269i.m48898k(AbstractC1102d.m3407d(1.0f, C2314t.f9131w), null, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getBlack50(), 0L, null, 0.0f, AbstractC37817c.m121344e(-12952401, c28655q2, new C3466p(c15199y3M3460c, c35666g, interfaceC2994c5, c30365b10, function19, viewState, function110, interfaceC4339a9)), c28655q, 1572870, 58);
                    c30365b3 = c30365b10;
                    function5 = function19;
                    function6 = function110;
                    interfaceC4339a3 = interfaceC4339a9;
                    z15 = z16;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    c30365b3 = c30365b2;
                    function5 = function3;
                    function6 = function4;
                    interfaceC4339a3 = interfaceC4339a2;
                    z15 = z13;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2541i2(viewState, c30365b3, function5, function6, z15, interfaceC4339a3, i13, i14);
                }
            }
            i15 |= 3072;
            function4 = function2;
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    z13 = z4;
                    if (c28655q2.m87155h(z13)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 32;
                if (i26 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    interfaceC4339a2 = interfaceC4339a;
                } else {
                    interfaceC4339a2 = interfaceC4339a;
                    if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q2.m87157i(interfaceC4339a2)) {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i27;
                    }
                }
                if ((i15 & 74899) != 74898) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z14)) {
                    list = null;
                    objArr3 = 0;
                    objArr2 = 0;
                    objArr = 0;
                    if (i29 != 0) {
                        c30365b4 = null;
                    } else {
                        c30365b4 = c30365b2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C38136a(17);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        function7 = (Function1) objM87133R6;
                    } else {
                        function7 = function3;
                    }
                    if (i18 != 0) {
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C38136a(18);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        function8 = (Function1) objM87133R5;
                    } else {
                        function8 = function4;
                    }
                    if (i24 != 0) {
                        z16 = true;
                    } else {
                        z16 = z13;
                    }
                    if (i26 != 0) {
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C38138a(28);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R4;
                    }
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87262p(c28655q2);
                        c28655q2.m87172p0(objM87133R);
                    }
                    InterfaceC2994c0 interfaceC2994c6 = (InterfaceC2994c0) objM87133R;
                    c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57107x, null, null, true, c28655q2, 3078, 6);
                    Boolean boolValueOf7 = Boolean.valueOf(z16);
                    if ((57344 & i15) == 16384) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM87157i = z17 | c28655q2.m87157i(c15199y3M3460c);
                    objM87133R2 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R2 = new a(z16, c15199y3M3460c, null);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new a(z16, c15199y3M3460c, null);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R2, boolValueOf7);
                    EnumC15209z3 enumC15209z3M43221b7 = c15199y3M3460c.m43221b();
                    zM87157i2 = c28655q2.m87157i(c15199y3M3460c) | ((i15 & 458752) == 131072);
                    objM87133R3 = c28655q2.m87133R();
                    if (zM87157i2) {
                        objM87133R3 = new b(c15199y3M3460c, interfaceC4339a2, null);
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new b(c15199y3M3460c, interfaceC4339a2, null);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R3, enumC15209z3M43221b7);
                    if (viewState instanceof AbstractC36042c.f) {
                        AbstractC36042c.f fVar7 = (AbstractC36042c.f) viewState;
                        textResourceM114411d = fVar7.getHeader();
                        if (textResourceM114411d == null) {
                            textResourceM114411d = AbstractC8693b.m21267a();
                        }
                        TextResource textResource7 = textResourceM114411d;
                        i28 = 2;
                        C39274g c39274g8 = new C39274g(EnumC16313m0.CROSS.toWhoopIcon(), new TextResource.C8688b(AbstractC29235c.f118314d, list, i28, objArr == true ? 1 : 0));
                        enumC16313m0M114412e = fVar7.getHeaderRightIcon();
                        if (enumC16313m0M114412e != null) {
                            c39274g = new C39274g(enumC16313m0M114412e.toWhoopIcon(), new TextResource.C8688b(AbstractC29235c.f118311a, objArr2 == true ? 1 : 0, i28, objArr3 == true ? 1 : 0));
                        } else {
                            c39274g = null;
                        }
                        c35666g = new C35666g(textResource7, c39274g8, c39274g, EnumC35671i0.LEFT, null, 0.0f, 0.0f, 112, null);
                    } else {
                        c35666g = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                    }
                    InterfaceC4339a interfaceC4339a10 = interfaceC4339a2;
                    C30365b c30365b11 = c30365b4;
                    Function1 function111 = function7;
                    Function1 function112 = function8;
                    c28655q = c28655q2;
                    AbstractC17269i.m48898k(AbstractC1102d.m3407d(1.0f, C2314t.f9131w), null, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getBlack50(), 0L, null, 0.0f, AbstractC37817c.m121344e(-12952401, c28655q2, new C3466p(c15199y3M3460c, c35666g, interfaceC2994c6, c30365b11, function111, viewState, function112, interfaceC4339a10)), c28655q, 1572870, 58);
                    c30365b3 = c30365b11;
                    function5 = function111;
                    function6 = function112;
                    interfaceC4339a3 = interfaceC4339a10;
                    z15 = z16;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    c30365b3 = c30365b2;
                    function5 = function3;
                    function6 = function4;
                    interfaceC4339a3 = interfaceC4339a2;
                    z15 = z13;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2541i2(viewState, c30365b3, function5, function6, z15, interfaceC4339a3, i13, i14);
                }
            }
            i15 |= 24576;
            z13 = z4;
            i26 = i14 & 32;
            if (i26 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                interfaceC4339a2 = interfaceC4339a;
            } else {
                interfaceC4339a2 = interfaceC4339a;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q2.m87157i(interfaceC4339a2)) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i27;
                }
            }
            if ((i15 & 74899) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z14)) {
                list = null;
                objArr3 = 0;
                objArr2 = 0;
                objArr = 0;
                if (i29 != 0) {
                    c30365b4 = null;
                } else {
                    c30365b4 = c30365b2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C38136a(17);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    function7 = (Function1) objM87133R6;
                } else {
                    function7 = function3;
                }
                if (i18 != 0) {
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C38136a(18);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    function8 = (Function1) objM87133R5;
                } else {
                    function8 = function4;
                }
                if (i24 != 0) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                if (i26 != 0) {
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C38138a(28);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R4;
                }
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87262p(c28655q2);
                    c28655q2.m87172p0(objM87133R);
                }
                InterfaceC2994c0 interfaceC2994c7 = (InterfaceC2994c0) objM87133R;
                c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57107x, null, null, true, c28655q2, 3078, 6);
                Boolean boolValueOf8 = Boolean.valueOf(z16);
                if ((57344 & i15) == 16384) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zM87157i = z17 | c28655q2.m87157i(c15199y3M3460c);
                objM87133R2 = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R2 = new a(z16, c15199y3M3460c, null);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new a(z16, c15199y3M3460c, null);
                    c28655q2.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R2, boolValueOf8);
                EnumC15209z3 enumC15209z3M43221b8 = c15199y3M3460c.m43221b();
                zM87157i2 = c28655q2.m87157i(c15199y3M3460c) | ((i15 & 458752) == 131072);
                objM87133R3 = c28655q2.m87133R();
                if (zM87157i2) {
                    objM87133R3 = new b(c15199y3M3460c, interfaceC4339a2, null);
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new b(c15199y3M3460c, interfaceC4339a2, null);
                    c28655q2.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R3, enumC15209z3M43221b8);
                if (viewState instanceof AbstractC36042c.f) {
                    AbstractC36042c.f fVar8 = (AbstractC36042c.f) viewState;
                    textResourceM114411d = fVar8.getHeader();
                    if (textResourceM114411d == null) {
                        textResourceM114411d = AbstractC8693b.m21267a();
                    }
                    TextResource textResource8 = textResourceM114411d;
                    i28 = 2;
                    C39274g c39274g9 = new C39274g(EnumC16313m0.CROSS.toWhoopIcon(), new TextResource.C8688b(AbstractC29235c.f118314d, list, i28, objArr == true ? 1 : 0));
                    enumC16313m0M114412e = fVar8.getHeaderRightIcon();
                    if (enumC16313m0M114412e != null) {
                        c39274g = new C39274g(enumC16313m0M114412e.toWhoopIcon(), new TextResource.C8688b(AbstractC29235c.f118311a, objArr2 == true ? 1 : 0, i28, objArr3 == true ? 1 : 0));
                    } else {
                        c39274g = null;
                    }
                    c35666g = new C35666g(textResource8, c39274g9, c39274g, EnumC35671i0.LEFT, null, 0.0f, 0.0f, 112, null);
                } else {
                    c35666g = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                }
                InterfaceC4339a interfaceC4339a11 = interfaceC4339a2;
                C30365b c30365b12 = c30365b4;
                Function1 function113 = function7;
                Function1 function114 = function8;
                c28655q = c28655q2;
                AbstractC17269i.m48898k(AbstractC1102d.m3407d(1.0f, C2314t.f9131w), null, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getBlack50(), 0L, null, 0.0f, AbstractC37817c.m121344e(-12952401, c28655q2, new C3466p(c15199y3M3460c, c35666g, interfaceC2994c7, c30365b12, function113, viewState, function114, interfaceC4339a11)), c28655q, 1572870, 58);
                c30365b3 = c30365b12;
                function5 = function113;
                function6 = function114;
                interfaceC4339a3 = interfaceC4339a11;
                z15 = z16;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                c30365b3 = c30365b2;
                function5 = function3;
                function6 = function4;
                interfaceC4339a3 = interfaceC4339a2;
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2541i2(viewState, c30365b3, function5, function6, z15, interfaceC4339a3, i13, i14);
            }
        }
        i15 |= 48;
        c30365b2 = c30365b;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function3 = function1;
                if (c28655q2.m87157i(function3)) {
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
                    if (c28655q2.m87157i(function4)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        z13 = z4;
                        if (c28655q2.m87155h(z13)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    i26 = i14 & 32;
                    if (i26 != 0) {
                        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                        interfaceC4339a2 = interfaceC4339a;
                    } else {
                        interfaceC4339a2 = interfaceC4339a;
                        if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                            if (c28655q2.m87157i(interfaceC4339a2)) {
                                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                            } else {
                                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                            }
                            i15 |= i27;
                        }
                    }
                    if ((i15 & 74899) != 74898) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z14)) {
                        list = null;
                        objArr3 = 0;
                        objArr2 = 0;
                        objArr = 0;
                        if (i29 != 0) {
                            c30365b4 = null;
                        } else {
                            c30365b4 = c30365b2;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R6 = c28655q2.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C38136a(17);
                                c28655q2.m87172p0(objM87133R6);
                            }
                            function7 = (Function1) objM87133R6;
                        } else {
                            function7 = function3;
                        }
                        if (i18 != 0) {
                            objM87133R5 = c28655q2.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C38136a(18);
                                c28655q2.m87172p0(objM87133R5);
                            }
                            function8 = (Function1) objM87133R5;
                        } else {
                            function8 = function4;
                        }
                        if (i24 != 0) {
                            z16 = true;
                        } else {
                            z16 = z13;
                        }
                        if (i26 != 0) {
                            objM87133R4 = c28655q2.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C38138a(28);
                                c28655q2.m87172p0(objM87133R4);
                            }
                            interfaceC4339a2 = (InterfaceC4339a) objM87133R4;
                        }
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87262p(c28655q2);
                            c28655q2.m87172p0(objM87133R);
                        }
                        InterfaceC2994c0 interfaceC2994c8 = (InterfaceC2994c0) objM87133R;
                        c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57107x, null, null, true, c28655q2, 3078, 6);
                        Boolean boolValueOf9 = Boolean.valueOf(z16);
                        if ((57344 & i15) == 16384) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zM87157i = z17 | c28655q2.m87157i(c15199y3M3460c);
                        objM87133R2 = c28655q2.m87133R();
                        if (zM87157i) {
                            objM87133R2 = new a(z16, c15199y3M3460c, null);
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new a(z16, c15199y3M3460c, null);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R2, boolValueOf9);
                        EnumC15209z3 enumC15209z3M43221b9 = c15199y3M3460c.m43221b();
                        zM87157i2 = c28655q2.m87157i(c15199y3M3460c) | ((i15 & 458752) == 131072);
                        objM87133R3 = c28655q2.m87133R();
                        if (zM87157i2) {
                            objM87133R3 = new b(c15199y3M3460c, interfaceC4339a2, null);
                            c28655q2.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new b(c15199y3M3460c, interfaceC4339a2, null);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R3, enumC15209z3M43221b9);
                        if (viewState instanceof AbstractC36042c.f) {
                            AbstractC36042c.f fVar9 = (AbstractC36042c.f) viewState;
                            textResourceM114411d = fVar9.getHeader();
                            if (textResourceM114411d == null) {
                                textResourceM114411d = AbstractC8693b.m21267a();
                            }
                            TextResource textResource9 = textResourceM114411d;
                            i28 = 2;
                            C39274g c39274g10 = new C39274g(EnumC16313m0.CROSS.toWhoopIcon(), new TextResource.C8688b(AbstractC29235c.f118314d, list, i28, objArr == true ? 1 : 0));
                            enumC16313m0M114412e = fVar9.getHeaderRightIcon();
                            if (enumC16313m0M114412e != null) {
                                c39274g = new C39274g(enumC16313m0M114412e.toWhoopIcon(), new TextResource.C8688b(AbstractC29235c.f118311a, objArr2 == true ? 1 : 0, i28, objArr3 == true ? 1 : 0));
                            } else {
                                c39274g = null;
                            }
                            c35666g = new C35666g(textResource9, c39274g10, c39274g, EnumC35671i0.LEFT, null, 0.0f, 0.0f, 112, null);
                        } else {
                            c35666g = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                        }
                        InterfaceC4339a interfaceC4339a12 = interfaceC4339a2;
                        C30365b c30365b13 = c30365b4;
                        Function1 function115 = function7;
                        Function1 function116 = function8;
                        c28655q = c28655q2;
                        AbstractC17269i.m48898k(AbstractC1102d.m3407d(1.0f, C2314t.f9131w), null, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getBlack50(), 0L, null, 0.0f, AbstractC37817c.m121344e(-12952401, c28655q2, new C3466p(c15199y3M3460c, c35666g, interfaceC2994c8, c30365b13, function115, viewState, function116, interfaceC4339a12)), c28655q, 1572870, 58);
                        c30365b3 = c30365b13;
                        function5 = function115;
                        function6 = function116;
                        interfaceC4339a3 = interfaceC4339a12;
                        z15 = z16;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        c30365b3 = c30365b2;
                        function5 = function3;
                        function6 = function4;
                        interfaceC4339a3 = interfaceC4339a2;
                        z15 = z13;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C2541i2(viewState, c30365b3, function5, function6, z15, interfaceC4339a3, i13, i14);
                    }
                }
                i15 |= 24576;
                z13 = z4;
                i26 = i14 & 32;
                if (i26 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    interfaceC4339a2 = interfaceC4339a;
                } else {
                    interfaceC4339a2 = interfaceC4339a;
                    if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q2.m87157i(interfaceC4339a2)) {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i27;
                    }
                }
                if ((i15 & 74899) != 74898) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z14)) {
                    list = null;
                    objArr3 = 0;
                    objArr2 = 0;
                    objArr = 0;
                    if (i29 != 0) {
                        c30365b4 = null;
                    } else {
                        c30365b4 = c30365b2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C38136a(17);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        function7 = (Function1) objM87133R6;
                    } else {
                        function7 = function3;
                    }
                    if (i18 != 0) {
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C38136a(18);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        function8 = (Function1) objM87133R5;
                    } else {
                        function8 = function4;
                    }
                    if (i24 != 0) {
                        z16 = true;
                    } else {
                        z16 = z13;
                    }
                    if (i26 != 0) {
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C38138a(28);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R4;
                    }
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87262p(c28655q2);
                        c28655q2.m87172p0(objM87133R);
                    }
                    InterfaceC2994c0 interfaceC2994c9 = (InterfaceC2994c0) objM87133R;
                    c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57107x, null, null, true, c28655q2, 3078, 6);
                    Boolean boolValueOf10 = Boolean.valueOf(z16);
                    if ((57344 & i15) == 16384) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM87157i = z17 | c28655q2.m87157i(c15199y3M3460c);
                    objM87133R2 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R2 = new a(z16, c15199y3M3460c, null);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new a(z16, c15199y3M3460c, null);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R2, boolValueOf10);
                    EnumC15209z3 enumC15209z3M43221b10 = c15199y3M3460c.m43221b();
                    zM87157i2 = c28655q2.m87157i(c15199y3M3460c) | ((i15 & 458752) == 131072);
                    objM87133R3 = c28655q2.m87133R();
                    if (zM87157i2) {
                        objM87133R3 = new b(c15199y3M3460c, interfaceC4339a2, null);
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new b(c15199y3M3460c, interfaceC4339a2, null);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R3, enumC15209z3M43221b10);
                    if (viewState instanceof AbstractC36042c.f) {
                        AbstractC36042c.f fVar10 = (AbstractC36042c.f) viewState;
                        textResourceM114411d = fVar10.getHeader();
                        if (textResourceM114411d == null) {
                            textResourceM114411d = AbstractC8693b.m21267a();
                        }
                        TextResource textResource10 = textResourceM114411d;
                        i28 = 2;
                        C39274g c39274g11 = new C39274g(EnumC16313m0.CROSS.toWhoopIcon(), new TextResource.C8688b(AbstractC29235c.f118314d, list, i28, objArr == true ? 1 : 0));
                        enumC16313m0M114412e = fVar10.getHeaderRightIcon();
                        if (enumC16313m0M114412e != null) {
                            c39274g = new C39274g(enumC16313m0M114412e.toWhoopIcon(), new TextResource.C8688b(AbstractC29235c.f118311a, objArr2 == true ? 1 : 0, i28, objArr3 == true ? 1 : 0));
                        } else {
                            c39274g = null;
                        }
                        c35666g = new C35666g(textResource10, c39274g11, c39274g, EnumC35671i0.LEFT, null, 0.0f, 0.0f, 112, null);
                    } else {
                        c35666g = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                    }
                    InterfaceC4339a interfaceC4339a13 = interfaceC4339a2;
                    C30365b c30365b14 = c30365b4;
                    Function1 function117 = function7;
                    Function1 function118 = function8;
                    c28655q = c28655q2;
                    AbstractC17269i.m48898k(AbstractC1102d.m3407d(1.0f, C2314t.f9131w), null, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getBlack50(), 0L, null, 0.0f, AbstractC37817c.m121344e(-12952401, c28655q2, new C3466p(c15199y3M3460c, c35666g, interfaceC2994c9, c30365b14, function117, viewState, function118, interfaceC4339a13)), c28655q, 1572870, 58);
                    c30365b3 = c30365b14;
                    function5 = function117;
                    function6 = function118;
                    interfaceC4339a3 = interfaceC4339a13;
                    z15 = z16;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    c30365b3 = c30365b2;
                    function5 = function3;
                    function6 = function4;
                    interfaceC4339a3 = interfaceC4339a2;
                    z15 = z13;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2541i2(viewState, c30365b3, function5, function6, z15, interfaceC4339a3, i13, i14);
                }
            }
            i15 |= 3072;
            function4 = function2;
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    z13 = z4;
                    if (c28655q2.m87155h(z13)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 32;
                if (i26 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    interfaceC4339a2 = interfaceC4339a;
                } else {
                    interfaceC4339a2 = interfaceC4339a;
                    if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q2.m87157i(interfaceC4339a2)) {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i27;
                    }
                }
                if ((i15 & 74899) != 74898) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z14)) {
                    list = null;
                    objArr3 = 0;
                    objArr2 = 0;
                    objArr = 0;
                    if (i29 != 0) {
                        c30365b4 = null;
                    } else {
                        c30365b4 = c30365b2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C38136a(17);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        function7 = (Function1) objM87133R6;
                    } else {
                        function7 = function3;
                    }
                    if (i18 != 0) {
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C38136a(18);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        function8 = (Function1) objM87133R5;
                    } else {
                        function8 = function4;
                    }
                    if (i24 != 0) {
                        z16 = true;
                    } else {
                        z16 = z13;
                    }
                    if (i26 != 0) {
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C38138a(28);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R4;
                    }
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87262p(c28655q2);
                        c28655q2.m87172p0(objM87133R);
                    }
                    InterfaceC2994c0 interfaceC2994c10 = (InterfaceC2994c0) objM87133R;
                    c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57107x, null, null, true, c28655q2, 3078, 6);
                    Boolean boolValueOf11 = Boolean.valueOf(z16);
                    if ((57344 & i15) == 16384) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM87157i = z17 | c28655q2.m87157i(c15199y3M3460c);
                    objM87133R2 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R2 = new a(z16, c15199y3M3460c, null);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new a(z16, c15199y3M3460c, null);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R2, boolValueOf11);
                    EnumC15209z3 enumC15209z3M43221b11 = c15199y3M3460c.m43221b();
                    zM87157i2 = c28655q2.m87157i(c15199y3M3460c) | ((i15 & 458752) == 131072);
                    objM87133R3 = c28655q2.m87133R();
                    if (zM87157i2) {
                        objM87133R3 = new b(c15199y3M3460c, interfaceC4339a2, null);
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new b(c15199y3M3460c, interfaceC4339a2, null);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R3, enumC15209z3M43221b11);
                    if (viewState instanceof AbstractC36042c.f) {
                        AbstractC36042c.f fVar11 = (AbstractC36042c.f) viewState;
                        textResourceM114411d = fVar11.getHeader();
                        if (textResourceM114411d == null) {
                            textResourceM114411d = AbstractC8693b.m21267a();
                        }
                        TextResource textResource11 = textResourceM114411d;
                        i28 = 2;
                        C39274g c39274g12 = new C39274g(EnumC16313m0.CROSS.toWhoopIcon(), new TextResource.C8688b(AbstractC29235c.f118314d, list, i28, objArr == true ? 1 : 0));
                        enumC16313m0M114412e = fVar11.getHeaderRightIcon();
                        if (enumC16313m0M114412e != null) {
                            c39274g = new C39274g(enumC16313m0M114412e.toWhoopIcon(), new TextResource.C8688b(AbstractC29235c.f118311a, objArr2 == true ? 1 : 0, i28, objArr3 == true ? 1 : 0));
                        } else {
                            c39274g = null;
                        }
                        c35666g = new C35666g(textResource11, c39274g12, c39274g, EnumC35671i0.LEFT, null, 0.0f, 0.0f, 112, null);
                    } else {
                        c35666g = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                    }
                    InterfaceC4339a interfaceC4339a14 = interfaceC4339a2;
                    C30365b c30365b15 = c30365b4;
                    Function1 function119 = function7;
                    Function1 function1110 = function8;
                    c28655q = c28655q2;
                    AbstractC17269i.m48898k(AbstractC1102d.m3407d(1.0f, C2314t.f9131w), null, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getBlack50(), 0L, null, 0.0f, AbstractC37817c.m121344e(-12952401, c28655q2, new C3466p(c15199y3M3460c, c35666g, interfaceC2994c10, c30365b15, function119, viewState, function1110, interfaceC4339a14)), c28655q, 1572870, 58);
                    c30365b3 = c30365b15;
                    function5 = function119;
                    function6 = function1110;
                    interfaceC4339a3 = interfaceC4339a14;
                    z15 = z16;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    c30365b3 = c30365b2;
                    function5 = function3;
                    function6 = function4;
                    interfaceC4339a3 = interfaceC4339a2;
                    z15 = z13;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2541i2(viewState, c30365b3, function5, function6, z15, interfaceC4339a3, i13, i14);
                }
            }
            i15 |= 24576;
            z13 = z4;
            i26 = i14 & 32;
            if (i26 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                interfaceC4339a2 = interfaceC4339a;
            } else {
                interfaceC4339a2 = interfaceC4339a;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q2.m87157i(interfaceC4339a2)) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i27;
                }
            }
            if ((i15 & 74899) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z14)) {
                list = null;
                objArr3 = 0;
                objArr2 = 0;
                objArr = 0;
                if (i29 != 0) {
                    c30365b4 = null;
                } else {
                    c30365b4 = c30365b2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C38136a(17);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    function7 = (Function1) objM87133R6;
                } else {
                    function7 = function3;
                }
                if (i18 != 0) {
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C38136a(18);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    function8 = (Function1) objM87133R5;
                } else {
                    function8 = function4;
                }
                if (i24 != 0) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                if (i26 != 0) {
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C38138a(28);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R4;
                }
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87262p(c28655q2);
                    c28655q2.m87172p0(objM87133R);
                }
                InterfaceC2994c0 interfaceC2994c11 = (InterfaceC2994c0) objM87133R;
                c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57107x, null, null, true, c28655q2, 3078, 6);
                Boolean boolValueOf12 = Boolean.valueOf(z16);
                if ((57344 & i15) == 16384) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zM87157i = z17 | c28655q2.m87157i(c15199y3M3460c);
                objM87133R2 = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R2 = new a(z16, c15199y3M3460c, null);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new a(z16, c15199y3M3460c, null);
                    c28655q2.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R2, boolValueOf12);
                EnumC15209z3 enumC15209z3M43221b12 = c15199y3M3460c.m43221b();
                zM87157i2 = c28655q2.m87157i(c15199y3M3460c) | ((i15 & 458752) == 131072);
                objM87133R3 = c28655q2.m87133R();
                if (zM87157i2) {
                    objM87133R3 = new b(c15199y3M3460c, interfaceC4339a2, null);
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new b(c15199y3M3460c, interfaceC4339a2, null);
                    c28655q2.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R3, enumC15209z3M43221b12);
                if (viewState instanceof AbstractC36042c.f) {
                    AbstractC36042c.f fVar12 = (AbstractC36042c.f) viewState;
                    textResourceM114411d = fVar12.getHeader();
                    if (textResourceM114411d == null) {
                        textResourceM114411d = AbstractC8693b.m21267a();
                    }
                    TextResource textResource12 = textResourceM114411d;
                    i28 = 2;
                    C39274g c39274g13 = new C39274g(EnumC16313m0.CROSS.toWhoopIcon(), new TextResource.C8688b(AbstractC29235c.f118314d, list, i28, objArr == true ? 1 : 0));
                    enumC16313m0M114412e = fVar12.getHeaderRightIcon();
                    if (enumC16313m0M114412e != null) {
                        c39274g = new C39274g(enumC16313m0M114412e.toWhoopIcon(), new TextResource.C8688b(AbstractC29235c.f118311a, objArr2 == true ? 1 : 0, i28, objArr3 == true ? 1 : 0));
                    } else {
                        c39274g = null;
                    }
                    c35666g = new C35666g(textResource12, c39274g13, c39274g, EnumC35671i0.LEFT, null, 0.0f, 0.0f, 112, null);
                } else {
                    c35666g = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                }
                InterfaceC4339a interfaceC4339a15 = interfaceC4339a2;
                C30365b c30365b16 = c30365b4;
                Function1 function1111 = function7;
                Function1 function1112 = function8;
                c28655q = c28655q2;
                AbstractC17269i.m48898k(AbstractC1102d.m3407d(1.0f, C2314t.f9131w), null, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getBlack50(), 0L, null, 0.0f, AbstractC37817c.m121344e(-12952401, c28655q2, new C3466p(c15199y3M3460c, c35666g, interfaceC2994c11, c30365b16, function1111, viewState, function1112, interfaceC4339a15)), c28655q, 1572870, 58);
                c30365b3 = c30365b16;
                function5 = function1111;
                function6 = function1112;
                interfaceC4339a3 = interfaceC4339a15;
                z15 = z16;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                c30365b3 = c30365b2;
                function5 = function3;
                function6 = function4;
                interfaceC4339a3 = interfaceC4339a2;
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2541i2(viewState, c30365b3, function5, function6, z15, interfaceC4339a3, i13, i14);
            }
        }
        i15 |= 384;
        function3 = function1;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                function4 = function2;
                if (c28655q2.m87157i(function4)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    z13 = z4;
                    if (c28655q2.m87155h(z13)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 32;
                if (i26 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    interfaceC4339a2 = interfaceC4339a;
                } else {
                    interfaceC4339a2 = interfaceC4339a;
                    if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q2.m87157i(interfaceC4339a2)) {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i27;
                    }
                }
                if ((i15 & 74899) != 74898) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z14)) {
                    list = null;
                    objArr3 = 0;
                    objArr2 = 0;
                    objArr = 0;
                    if (i29 != 0) {
                        c30365b4 = null;
                    } else {
                        c30365b4 = c30365b2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C38136a(17);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        function7 = (Function1) objM87133R6;
                    } else {
                        function7 = function3;
                    }
                    if (i18 != 0) {
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C38136a(18);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        function8 = (Function1) objM87133R5;
                    } else {
                        function8 = function4;
                    }
                    if (i24 != 0) {
                        z16 = true;
                    } else {
                        z16 = z13;
                    }
                    if (i26 != 0) {
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C38138a(28);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R4;
                    }
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87262p(c28655q2);
                        c28655q2.m87172p0(objM87133R);
                    }
                    InterfaceC2994c0 interfaceC2994c12 = (InterfaceC2994c0) objM87133R;
                    c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57107x, null, null, true, c28655q2, 3078, 6);
                    Boolean boolValueOf13 = Boolean.valueOf(z16);
                    if ((57344 & i15) == 16384) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM87157i = z17 | c28655q2.m87157i(c15199y3M3460c);
                    objM87133R2 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R2 = new a(z16, c15199y3M3460c, null);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new a(z16, c15199y3M3460c, null);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R2, boolValueOf13);
                    EnumC15209z3 enumC15209z3M43221b13 = c15199y3M3460c.m43221b();
                    zM87157i2 = c28655q2.m87157i(c15199y3M3460c) | ((i15 & 458752) == 131072);
                    objM87133R3 = c28655q2.m87133R();
                    if (zM87157i2) {
                        objM87133R3 = new b(c15199y3M3460c, interfaceC4339a2, null);
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new b(c15199y3M3460c, interfaceC4339a2, null);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R3, enumC15209z3M43221b13);
                    if (viewState instanceof AbstractC36042c.f) {
                        AbstractC36042c.f fVar13 = (AbstractC36042c.f) viewState;
                        textResourceM114411d = fVar13.getHeader();
                        if (textResourceM114411d == null) {
                            textResourceM114411d = AbstractC8693b.m21267a();
                        }
                        TextResource textResource13 = textResourceM114411d;
                        i28 = 2;
                        C39274g c39274g14 = new C39274g(EnumC16313m0.CROSS.toWhoopIcon(), new TextResource.C8688b(AbstractC29235c.f118314d, list, i28, objArr == true ? 1 : 0));
                        enumC16313m0M114412e = fVar13.getHeaderRightIcon();
                        if (enumC16313m0M114412e != null) {
                            c39274g = new C39274g(enumC16313m0M114412e.toWhoopIcon(), new TextResource.C8688b(AbstractC29235c.f118311a, objArr2 == true ? 1 : 0, i28, objArr3 == true ? 1 : 0));
                        } else {
                            c39274g = null;
                        }
                        c35666g = new C35666g(textResource13, c39274g14, c39274g, EnumC35671i0.LEFT, null, 0.0f, 0.0f, 112, null);
                    } else {
                        c35666g = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                    }
                    InterfaceC4339a interfaceC4339a16 = interfaceC4339a2;
                    C30365b c30365b17 = c30365b4;
                    Function1 function1113 = function7;
                    Function1 function1114 = function8;
                    c28655q = c28655q2;
                    AbstractC17269i.m48898k(AbstractC1102d.m3407d(1.0f, C2314t.f9131w), null, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getBlack50(), 0L, null, 0.0f, AbstractC37817c.m121344e(-12952401, c28655q2, new C3466p(c15199y3M3460c, c35666g, interfaceC2994c12, c30365b17, function1113, viewState, function1114, interfaceC4339a16)), c28655q, 1572870, 58);
                    c30365b3 = c30365b17;
                    function5 = function1113;
                    function6 = function1114;
                    interfaceC4339a3 = interfaceC4339a16;
                    z15 = z16;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    c30365b3 = c30365b2;
                    function5 = function3;
                    function6 = function4;
                    interfaceC4339a3 = interfaceC4339a2;
                    z15 = z13;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2541i2(viewState, c30365b3, function5, function6, z15, interfaceC4339a3, i13, i14);
                }
            }
            i15 |= 24576;
            z13 = z4;
            i26 = i14 & 32;
            if (i26 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                interfaceC4339a2 = interfaceC4339a;
            } else {
                interfaceC4339a2 = interfaceC4339a;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q2.m87157i(interfaceC4339a2)) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i27;
                }
            }
            if ((i15 & 74899) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z14)) {
                list = null;
                objArr3 = 0;
                objArr2 = 0;
                objArr = 0;
                if (i29 != 0) {
                    c30365b4 = null;
                } else {
                    c30365b4 = c30365b2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C38136a(17);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    function7 = (Function1) objM87133R6;
                } else {
                    function7 = function3;
                }
                if (i18 != 0) {
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C38136a(18);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    function8 = (Function1) objM87133R5;
                } else {
                    function8 = function4;
                }
                if (i24 != 0) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                if (i26 != 0) {
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C38138a(28);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R4;
                }
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87262p(c28655q2);
                    c28655q2.m87172p0(objM87133R);
                }
                InterfaceC2994c0 interfaceC2994c13 = (InterfaceC2994c0) objM87133R;
                c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57107x, null, null, true, c28655q2, 3078, 6);
                Boolean boolValueOf14 = Boolean.valueOf(z16);
                if ((57344 & i15) == 16384) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zM87157i = z17 | c28655q2.m87157i(c15199y3M3460c);
                objM87133R2 = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R2 = new a(z16, c15199y3M3460c, null);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new a(z16, c15199y3M3460c, null);
                    c28655q2.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R2, boolValueOf14);
                EnumC15209z3 enumC15209z3M43221b14 = c15199y3M3460c.m43221b();
                zM87157i2 = c28655q2.m87157i(c15199y3M3460c) | ((i15 & 458752) == 131072);
                objM87133R3 = c28655q2.m87133R();
                if (zM87157i2) {
                    objM87133R3 = new b(c15199y3M3460c, interfaceC4339a2, null);
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new b(c15199y3M3460c, interfaceC4339a2, null);
                    c28655q2.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R3, enumC15209z3M43221b14);
                if (viewState instanceof AbstractC36042c.f) {
                    AbstractC36042c.f fVar14 = (AbstractC36042c.f) viewState;
                    textResourceM114411d = fVar14.getHeader();
                    if (textResourceM114411d == null) {
                        textResourceM114411d = AbstractC8693b.m21267a();
                    }
                    TextResource textResource14 = textResourceM114411d;
                    i28 = 2;
                    C39274g c39274g15 = new C39274g(EnumC16313m0.CROSS.toWhoopIcon(), new TextResource.C8688b(AbstractC29235c.f118314d, list, i28, objArr == true ? 1 : 0));
                    enumC16313m0M114412e = fVar14.getHeaderRightIcon();
                    if (enumC16313m0M114412e != null) {
                        c39274g = new C39274g(enumC16313m0M114412e.toWhoopIcon(), new TextResource.C8688b(AbstractC29235c.f118311a, objArr2 == true ? 1 : 0, i28, objArr3 == true ? 1 : 0));
                    } else {
                        c39274g = null;
                    }
                    c35666g = new C35666g(textResource14, c39274g15, c39274g, EnumC35671i0.LEFT, null, 0.0f, 0.0f, 112, null);
                } else {
                    c35666g = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                }
                InterfaceC4339a interfaceC4339a17 = interfaceC4339a2;
                C30365b c30365b18 = c30365b4;
                Function1 function1115 = function7;
                Function1 function1116 = function8;
                c28655q = c28655q2;
                AbstractC17269i.m48898k(AbstractC1102d.m3407d(1.0f, C2314t.f9131w), null, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getBlack50(), 0L, null, 0.0f, AbstractC37817c.m121344e(-12952401, c28655q2, new C3466p(c15199y3M3460c, c35666g, interfaceC2994c13, c30365b18, function1115, viewState, function1116, interfaceC4339a17)), c28655q, 1572870, 58);
                c30365b3 = c30365b18;
                function5 = function1115;
                function6 = function1116;
                interfaceC4339a3 = interfaceC4339a17;
                z15 = z16;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                c30365b3 = c30365b2;
                function5 = function3;
                function6 = function4;
                interfaceC4339a3 = interfaceC4339a2;
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2541i2(viewState, c30365b3, function5, function6, z15, interfaceC4339a3, i13, i14);
            }
        }
        i15 |= 3072;
        function4 = function2;
        i24 = i14 & 16;
        if (i24 != 0) {
            if ((i13 & 24576) == 0) {
                z13 = z4;
                if (c28655q2.m87155h(z13)) {
                    i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i25 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i25;
            }
            i26 = i14 & 32;
            if (i26 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                interfaceC4339a2 = interfaceC4339a;
            } else {
                interfaceC4339a2 = interfaceC4339a;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q2.m87157i(interfaceC4339a2)) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i27;
                }
            }
            if ((i15 & 74899) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z14)) {
                list = null;
                objArr3 = 0;
                objArr2 = 0;
                objArr = 0;
                if (i29 != 0) {
                    c30365b4 = null;
                } else {
                    c30365b4 = c30365b2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C38136a(17);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    function7 = (Function1) objM87133R6;
                } else {
                    function7 = function3;
                }
                if (i18 != 0) {
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C38136a(18);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    function8 = (Function1) objM87133R5;
                } else {
                    function8 = function4;
                }
                if (i24 != 0) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                if (i26 != 0) {
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C38138a(28);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R4;
                }
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87262p(c28655q2);
                    c28655q2.m87172p0(objM87133R);
                }
                InterfaceC2994c0 interfaceC2994c14 = (InterfaceC2994c0) objM87133R;
                c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57107x, null, null, true, c28655q2, 3078, 6);
                Boolean boolValueOf15 = Boolean.valueOf(z16);
                if ((57344 & i15) == 16384) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zM87157i = z17 | c28655q2.m87157i(c15199y3M3460c);
                objM87133R2 = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R2 = new a(z16, c15199y3M3460c, null);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new a(z16, c15199y3M3460c, null);
                    c28655q2.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R2, boolValueOf15);
                EnumC15209z3 enumC15209z3M43221b15 = c15199y3M3460c.m43221b();
                zM87157i2 = c28655q2.m87157i(c15199y3M3460c) | ((i15 & 458752) == 131072);
                objM87133R3 = c28655q2.m87133R();
                if (zM87157i2) {
                    objM87133R3 = new b(c15199y3M3460c, interfaceC4339a2, null);
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new b(c15199y3M3460c, interfaceC4339a2, null);
                    c28655q2.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R3, enumC15209z3M43221b15);
                if (viewState instanceof AbstractC36042c.f) {
                    AbstractC36042c.f fVar15 = (AbstractC36042c.f) viewState;
                    textResourceM114411d = fVar15.getHeader();
                    if (textResourceM114411d == null) {
                        textResourceM114411d = AbstractC8693b.m21267a();
                    }
                    TextResource textResource15 = textResourceM114411d;
                    i28 = 2;
                    C39274g c39274g16 = new C39274g(EnumC16313m0.CROSS.toWhoopIcon(), new TextResource.C8688b(AbstractC29235c.f118314d, list, i28, objArr == true ? 1 : 0));
                    enumC16313m0M114412e = fVar15.getHeaderRightIcon();
                    if (enumC16313m0M114412e != null) {
                        c39274g = new C39274g(enumC16313m0M114412e.toWhoopIcon(), new TextResource.C8688b(AbstractC29235c.f118311a, objArr2 == true ? 1 : 0, i28, objArr3 == true ? 1 : 0));
                    } else {
                        c39274g = null;
                    }
                    c35666g = new C35666g(textResource15, c39274g16, c39274g, EnumC35671i0.LEFT, null, 0.0f, 0.0f, 112, null);
                } else {
                    c35666g = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                }
                InterfaceC4339a interfaceC4339a18 = interfaceC4339a2;
                C30365b c30365b19 = c30365b4;
                Function1 function1117 = function7;
                Function1 function1118 = function8;
                c28655q = c28655q2;
                AbstractC17269i.m48898k(AbstractC1102d.m3407d(1.0f, C2314t.f9131w), null, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getBlack50(), 0L, null, 0.0f, AbstractC37817c.m121344e(-12952401, c28655q2, new C3466p(c15199y3M3460c, c35666g, interfaceC2994c14, c30365b19, function1117, viewState, function1118, interfaceC4339a18)), c28655q, 1572870, 58);
                c30365b3 = c30365b19;
                function5 = function1117;
                function6 = function1118;
                interfaceC4339a3 = interfaceC4339a18;
                z15 = z16;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                c30365b3 = c30365b2;
                function5 = function3;
                function6 = function4;
                interfaceC4339a3 = interfaceC4339a2;
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2541i2(viewState, c30365b3, function5, function6, z15, interfaceC4339a3, i13, i14);
            }
        }
        i15 |= 24576;
        z13 = z4;
        i26 = i14 & 32;
        if (i26 != 0) {
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            interfaceC4339a2 = interfaceC4339a;
        } else {
            interfaceC4339a2 = interfaceC4339a;
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q2.m87157i(interfaceC4339a2)) {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i27;
            }
        }
        if ((i15 & 74899) != 74898) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z14)) {
            list = null;
            objArr3 = 0;
            objArr2 = 0;
            objArr = 0;
            if (i29 != 0) {
                c30365b4 = null;
            } else {
                c30365b4 = c30365b2;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R6 = c28655q2.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C38136a(17);
                    c28655q2.m87172p0(objM87133R6);
                }
                function7 = (Function1) objM87133R6;
            } else {
                function7 = function3;
            }
            if (i18 != 0) {
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C38136a(18);
                    c28655q2.m87172p0(objM87133R5);
                }
                function8 = (Function1) objM87133R5;
            } else {
                function8 = function4;
            }
            if (i24 != 0) {
                z16 = true;
            } else {
                z16 = z13;
            }
            if (i26 != 0) {
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C38138a(28);
                    c28655q2.m87172p0(objM87133R4);
                }
                interfaceC4339a2 = (InterfaceC4339a) objM87133R4;
            }
            objM87133R = c28655q2.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87262p(c28655q2);
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC2994c0 interfaceC2994c15 = (InterfaceC2994c0) objM87133R;
            c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57107x, null, null, true, c28655q2, 3078, 6);
            Boolean boolValueOf16 = Boolean.valueOf(z16);
            if ((57344 & i15) == 16384) {
                z17 = true;
            } else {
                z17 = false;
            }
            zM87157i = z17 | c28655q2.m87157i(c15199y3M3460c);
            objM87133R2 = c28655q2.m87133R();
            if (zM87157i) {
                objM87133R2 = new a(z16, c15199y3M3460c, null);
                c28655q2.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new a(z16, c15199y3M3460c, null);
                c28655q2.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R2, boolValueOf16);
            EnumC15209z3 enumC15209z3M43221b16 = c15199y3M3460c.m43221b();
            zM87157i2 = c28655q2.m87157i(c15199y3M3460c) | ((i15 & 458752) == 131072);
            objM87133R3 = c28655q2.m87133R();
            if (zM87157i2) {
                objM87133R3 = new b(c15199y3M3460c, interfaceC4339a2, null);
                c28655q2.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new b(c15199y3M3460c, interfaceC4339a2, null);
                c28655q2.m87172p0(objM87133R3);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R3, enumC15209z3M43221b16);
            if (viewState instanceof AbstractC36042c.f) {
                AbstractC36042c.f fVar16 = (AbstractC36042c.f) viewState;
                textResourceM114411d = fVar16.getHeader();
                if (textResourceM114411d == null) {
                    textResourceM114411d = AbstractC8693b.m21267a();
                }
                TextResource textResource16 = textResourceM114411d;
                i28 = 2;
                C39274g c39274g17 = new C39274g(EnumC16313m0.CROSS.toWhoopIcon(), new TextResource.C8688b(AbstractC29235c.f118314d, list, i28, objArr == true ? 1 : 0));
                enumC16313m0M114412e = fVar16.getHeaderRightIcon();
                if (enumC16313m0M114412e != null) {
                    c39274g = new C39274g(enumC16313m0M114412e.toWhoopIcon(), new TextResource.C8688b(AbstractC29235c.f118311a, objArr2 == true ? 1 : 0, i28, objArr3 == true ? 1 : 0));
                } else {
                    c39274g = null;
                }
                c35666g = new C35666g(textResource16, c39274g17, c39274g, EnumC35671i0.LEFT, null, 0.0f, 0.0f, 112, null);
            } else {
                c35666g = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
            }
            InterfaceC4339a interfaceC4339a19 = interfaceC4339a2;
            C30365b c30365b110 = c30365b4;
            Function1 function1119 = function7;
            Function1 function11110 = function8;
            c28655q = c28655q2;
            AbstractC17269i.m48898k(AbstractC1102d.m3407d(1.0f, C2314t.f9131w), null, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getBlack50(), 0L, null, 0.0f, AbstractC37817c.m121344e(-12952401, c28655q2, new C3466p(c15199y3M3460c, c35666g, interfaceC2994c15, c30365b110, function1119, viewState, function11110, interfaceC4339a19)), c28655q, 1572870, 58);
            c30365b3 = c30365b110;
            function5 = function1119;
            function6 = function11110;
            interfaceC4339a3 = interfaceC4339a19;
            z15 = z16;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            c30365b3 = c30365b2;
            function5 = function3;
            function6 = function4;
            interfaceC4339a3 = interfaceC4339a2;
            z15 = z13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2541i2(viewState, c30365b3, function5, function6, z15, interfaceC4339a3, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m122726s(InterfaceC36040a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m122727t(AbstractC34963a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m122728u() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m122729v(C15199y3 c15199y3, C35666g c35666g, InterfaceC2994c0 interfaceC2994c0, C30365b c30365b, Function1 function1, AbstractC36042c abstractC36042c, Function1 function2, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC35664f.a aVar = new AbstractC35664f.a(c15199y3);
            EnumC39333f enumC39333f = EnumC39333f.TRANSPARENT;
            Modifier modifierM3394p = AbstractC1099a.m3394p(2 * 8, AbstractC1102d.m3409f(1.0f, AbstractC1092a.m3357b(AbstractC1102d.m3413j(AbstractC1102d.m3427x(AbstractC1091c.m3355a(C2314t.f9131w, null, 3), null, 3), 0.0f, ((Configuration) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4975a)).screenHeightDp * 0.65f, 1), f164170d, null, 0.0f, 6)));
            boolean zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15199y3);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C3196h(interfaceC2994c0, c15199y3, 27);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R;
            boolean zM87157i2 = c28655q.m87157i(c30365b) | c28655q.m87153g(function1);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C37550r(10, c30365b, function1);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC35660d.m112871m(null, c35666g, aVar, enumC39333f, interfaceC4339a2, (InterfaceC4339a) objM87133R2, null, AbstractC37817c.m121344e(-36715583, c28655q, new C2026r(abstractC36042c, c30365b, function2, interfaceC4339a, 29)), false, null, null, null, false, modifierM3394p, C38308d.f164190a.m122742b(), c28655q, (C35666g.f151591h << 3) | 12585984 | (AbstractC35664f.a.f151587c << 6), 24582, 6977);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m122730w(InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new c(c15199y3, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m122731x(C30365b c30365b, Function1 function1) {
        if (c30365b != null) {
            c30365b.m92836a(AbstractC30364a.d.f124568a);
        }
        function1.invoke(InterfaceC36040a.a.f153737a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m122732y(AbstractC36042c abstractC36042c, C30365b c30365b, Function1 function1, InterfaceC4339a interfaceC4339a, InterfaceC23013y BottomSheet, Composer composer, int i13) {
        AbstractC22676k.m65750j(BottomSheet, "$this$BottomSheet");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            m122698C(abstractC36042c, c30365b, function1, interfaceC4339a, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m122733z(AbstractC36042c abstractC36042c, C30365b c30365b, Function1 function1, Function1 function2, boolean z4, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m122725r(abstractC36042c, c30365b, function1, function2, z4, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
