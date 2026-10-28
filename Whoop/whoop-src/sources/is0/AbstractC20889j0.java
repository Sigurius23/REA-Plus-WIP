package is0;

import a81.C0561l;
import am2.C1012d;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.C1101c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p018ui.layout.AbstractC1131a;
import androidx.compose.p018ui.layout.AbstractC1132b;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import aw0.C2108h;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c41.C4105r1;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import e93.AbstractC12889b;
import ec3.C13084s1;
import ec3.InterfaceC13062m;
import ig0.C18468h;
import io.sentry.config.AbstractC20301a;
import j93.InterfaceC21467g;
import l83.C23454a0;
import l83.InterfaceC23459e;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p027b3.C2463x1;
import p027b3.InterfaceC2464x2;
import p077d0.AbstractC11352g;
import p088dc.AbstractC11895b;
import p164g2.C15240l;
import p164g2.InterfaceC15237i;
import p180h0.AbstractC16486z0;
import p238j0.InterfaceC21083i;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22989q;
import p291l0.InterfaceC23004v;
import p390p1.AbstractC28683x;
import p390p1.C28617g1;
import p390p1.C28621h1;
import p390p1.C28624i0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28593a1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28620h0;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p390p1.InterfaceC28690z0;
import p505ts.AbstractC34132o;
import p512u2.AbstractC34452c0;
import p512u2.C34472r;
import p512u2.InterfaceC34476v;
import p602x1.AbstractC37817c;
import p634y1.AbstractC39038k;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39147y;
import p636y3.C39180l;
import p636y3.InterfaceC39171c;
import p710im1.C18656a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import p715kotlin.jvm.internal.C22672i;
import p720m91.AbstractC25315x;
import p720m91.C25314w;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.C38072d;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: is0.j0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001aA\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\f\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u001b²\u0006\u000e\u0010\u000e\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000f\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0010\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0012\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0013\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0015\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0016\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0018\u001a\u00020\u00178\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0019\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\u001a\u001a\u00020\u00118\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lis0/s0;", "viewState", "", "initiallyExpanded", "Lkotlin/Function1;", "Lis0/r0;", "Ll83/a0;", "onEvent", "z", "(Landroidx/compose/ui/Modifier;Lis0/s0;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "B0", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "pendingExpand", "openedWithoutGesture", "expandWithKeyboard", "", "collapsedHeightPx", "expandedHeightPx", "", "collapsedPanelHeightPx", "scrimTopInWindowPx", "", "draftText", "showExpandedContent", "settledExpandedPx", "community-reactions-arch-mini_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC20889j0 {

    /* JADX INFO: renamed from: is0.j0$a */
    @InterfaceC32271e(m100429c = "com.whoop.communityreactions.view.ReactionsPanelKt$ReactionsPanel$3$1", m100430f = "ReactionsPanel.kt", m100431l = {113, 114, 120, 120, 122}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C20895m0 f78614E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28601c1 f78615F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC28601c1 f78616G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ InterfaceC28690z0 f78617H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ InterfaceC28690z0 f78618I;

        /* JADX INFO: renamed from: w */
        boolean f78619w;

        /* JADX INFO: renamed from: x */
        float f78620x;

        /* JADX INFO: renamed from: y */
        int f78621y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Function1 f78622z;

        /* JADX INFO: renamed from: is0.j0$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.communityreactions.view.ReactionsPanelKt$ReactionsPanel$3$1$2", m100430f = "ReactionsPanel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "", "it"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41787a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f78623w;

            /* JADX INFO: renamed from: x */
            /* synthetic */ boolean f78624x;

            public C41787a(InterfaceC30057d<? super C41787a> interfaceC30057d) {
                super(2, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                C41787a c41787a = new C41787a(interfaceC30057d);
                c41787a.f78624x = ((Boolean) obj).booleanValue();
                return c41787a;
            }

            @Override // c93.InterfaceC4351m
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (InterfaceC30057d<? super Boolean>) obj2);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                boolean z4 = this.f78624x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f78623w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return Boolean.valueOf(z4);
            }

            public final Object invoke(boolean z4, InterfaceC30057d<? super Boolean> interfaceC30057d) {
                return ((C41787a) create(Boolean.valueOf(z4), interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, C20895m0 c20895m0, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28690z0 interfaceC28690z0, InterfaceC28690z0 interfaceC28690z1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f78622z = function1;
            this.f78614E = c20895m0;
            this.f78615F = interfaceC28601c1;
            this.f78616G = interfaceC28601c2;
            this.f78617H = interfaceC28690z0;
            this.f78618I = interfaceC28690z1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: i */
        public static final boolean m57811i(InterfaceC28690z0 interfaceC28690z0, InterfaceC28690z0 interfaceC28690z1) {
            return AbstractC20889j0.m57736F(interfaceC28690z0) > 0.0f || AbstractC20889j0.m57738H(interfaceC28690z1) > 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: j */
        public static final C23454a0 m57812j(long j7) {
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f78622z, this.f78614E, this.f78615F, this.f78616G, this.f78617H, this.f78618I, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0088 A[PHI: r1
          0x0088: PHI (r1v9 boolean) = (r1v8 boolean), (r1v11 boolean) binds: [B:25:0x0085, B:13:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:29:0x0094  */
        /* JADX WARN: Code duplicated, block: B:32:0x00a8  */
        /* JADX WARN: Code duplicated, block: B:35:0x00b1  */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00ae, code lost:
        
            if (r2.m57834o(r9) == r0) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00b7, code lost:
        
            if (r2.m57826f(r9) == r0) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00cc, code lost:
        
            if (r10.m57823c(r9) == r0) goto L42;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instruction units count: 210
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: is0.AbstractC20889j0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: is0.j0$b */
    @InterfaceC32271e(m100429c = "com.whoop.communityreactions.view.ReactionsPanelKt$ReactionsPanel$4$1", m100430f = "ReactionsPanel.kt", m100431l = {128}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC15237i f78625E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28601c1 f78626F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC28601c1 f78627G;

        /* JADX INFO: renamed from: w */
        Object f78628w;

        /* JADX INFO: renamed from: x */
        int f78629x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C20895m0 f78630y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC2464x2 f78631z;

        /* JADX INFO: renamed from: is0.j0$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ InterfaceC28601c1 f78632E;

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C22669g0 f78633w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC2464x2 f78634x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC15237i f78635y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ InterfaceC28601c1 f78636z;

            public a(C22669g0 c22669g0, InterfaceC2464x2 interfaceC2464x2, InterfaceC15237i interfaceC15237i, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
                this.f78633w = c22669g0;
                this.f78634x = interfaceC2464x2;
                this.f78635y = interfaceC15237i;
                this.f78636z = interfaceC28601c1;
                this.f78632E = interfaceC28601c2;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(EnumC20873b0 enumC20873b0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                if (this.f78633w.f89336w == EnumC20873b0.Expanded && enumC20873b0 == EnumC20873b0.Collapsed) {
                    AbstractC20889j0.m57753W(this.f78636z, false);
                    AbstractC20889j0.m57794s0(this.f78632E, false);
                    InterfaceC2464x2 interfaceC2464x2 = this.f78634x;
                    if (interfaceC2464x2 != null) {
                        ((C2463x1) interfaceC2464x2).m7442a();
                    }
                    ((C15240l) this.f78635y).m43339b(true);
                }
                this.f78633w.f89336w = enumC20873b0;
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C20895m0 c20895m0, InterfaceC2464x2 interfaceC2464x2, InterfaceC15237i interfaceC15237i, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f78630y = c20895m0;
            this.f78631z = interfaceC2464x2;
            this.f78625E = interfaceC15237i;
            this.f78626F = interfaceC28601c1;
            this.f78627G = interfaceC28601c2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final EnumC20873b0 m57814h(C20895m0 c20895m0) {
            return c20895m0.m57829j();
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f78630y, this.f78631z, this.f78625E, this.f78626F, this.f78627G, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f78629x;
            if (i13 == 0) {
                C22669g0 c22669g0M32004w = AbstractC11895b.m32004w(obj);
                c22669g0M32004w.f89336w = this.f78630y.m57829j();
                C13084s1 c13084s1M87240H = AbstractC28683x.m87240H(new C20891k0(this.f78630y, 0));
                a aVar = new a(c22669g0M32004w, this.f78631z, this.f78625E, this.f78626F, this.f78627G);
                this.f78628w = null;
                this.f78629x = 1;
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

    /* JADX INFO: renamed from: is0.j0$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class c extends C22672i implements InterfaceC4339a {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f78637E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ C20895m0 f78638F;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC2464x2 f78639w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC15237i f78640x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC2994c0 f78641y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f78642z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC2464x2 interfaceC2464x2, InterfaceC15237i interfaceC15237i, InterfaceC2994c0 interfaceC2994c0, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, C20895m0 c20895m0) {
            super(0, AbstractC22674j.class, "collapse", "ReactionsPanel$collapse(Landroidx/compose/ui/platform/SoftwareKeyboardController;Landroidx/compose/ui/focus/FocusManager;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lcom/whoop/communityreactions/view/ReactionsPanelState;)V", 0);
            this.f78639w = interfaceC2464x2;
            this.f78640x = interfaceC15237i;
            this.f78641y = interfaceC2994c0;
            this.f78642z = interfaceC28601c1;
            this.f78637E = interfaceC28601c2;
            this.f78638F = c20895m0;
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m134243invoke();
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m134243invoke() {
            AbstractC20889j0.m57729A(this.f78639w, this.f78640x, this.f78641y, this.f78642z, this.f78637E, this.f78638F);
        }
    }

    /* JADX INFO: renamed from: is0.j0$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        public static final d f78643w = new d();

        @Override // c93.InterfaceC4339a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(0.0f);
        }
    }

    /* JADX INFO: renamed from: is0.j0$e */
    @InterfaceC32271e(m100429c = "com.whoop.communityreactions.view.ReactionsPanelKt$ReactionsPanel$collapse$1", m100430f = "ReactionsPanel.kt", m100431l = {103}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f78644w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C20895m0 f78645x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C20895m0 c20895m0, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f78645x = c20895m0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new e(this.f78645x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f78644w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C20895m0 c20895m0 = this.f78645x;
                this.f78644w = 1;
                if (c20895m0.m57823c(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: is0.j0$f */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"is0/j0$f", "Lp1/h0;", "Ll83/a0;", "dispose", "()V", "runtime"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC28620h0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C25314w f78646a;

        public f(C25314w c25314w) {
            this.f78646a = c25314w;
        }

        @Override // p390p1.InterfaceC28620h0
        public void dispose() {
            C25314w c25314w = this.f78646a;
            if (c25314w != null) {
                c25314w.m74333e(0);
            }
            C25314w c25314w2 = this.f78646a;
            if (c25314w2 != null) {
                c25314w2.m74334f(d.f78643w);
            }
        }
    }

    /* JADX INFO: renamed from: is0.j0$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements PointerInputEventHandler {

        /* JADX INFO: renamed from: w */
        public static final g f78647w = new g();

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public static final C23454a0 m57818b(C34472r change, float f13) {
            AbstractC22676k.m65750j(change, "change");
            change.m108946a();
            return C23454a0.f92919a;
        }

        @Override // androidx.compose.p018ui.input.pointer.PointerInputEventHandler
        public final Object invoke(InterfaceC34476v interfaceC34476v, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            Object objM46659h = AbstractC16486z0.m46659h(interfaceC34476v, null, null, new C20893l0(), interfaceC30057d, 7);
            return objM46659h == EnumC31071a.f128113w ? objM46659h : C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final void m57729A(InterfaceC2464x2 interfaceC2464x2, InterfaceC15237i interfaceC15237i, InterfaceC2994c0 interfaceC2994c0, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, C20895m0 c20895m0) {
        m57753W(interfaceC28601c1, false);
        m57794s0(interfaceC28601c2, false);
        if (interfaceC2464x2 != null) {
            ((C2463x1) interfaceC2464x2).m7442a();
        }
        ((C15240l) interfaceC15237i).m43339b(true);
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new e(c20895m0, null), 3);
    }

    /* JADX INFO: renamed from: B */
    private static final void m57731B(InterfaceC28601c1 interfaceC28601c1) {
        m57753W(interfaceC28601c1, true);
    }

    /* JADX INFO: renamed from: B0 */
    private static final Modifier m57732B0(Modifier modifier) {
        return AbstractC34452c0.m108903b(modifier, C23454a0.f92919a, g.f78647w);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m57733C(AbstractC20905r0 it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final InterfaceC28601c1 m57734D(boolean z4) {
        return AbstractC28683x.m87272z(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final InterfaceC28690z0 m57735E() {
        return new C28617g1(0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final float m57736F(InterfaceC28690z0 interfaceC28690z0) {
        return ((C28617g1) interfaceC28690z0).m87022x();
    }

    /* JADX INFO: renamed from: G */
    private static final void m57737G(InterfaceC28690z0 interfaceC28690z0, float f13) {
        ((C28617g1) interfaceC28690z0).m87023y(f13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final float m57738H(InterfaceC28690z0 interfaceC28690z0) {
        return ((C28617g1) interfaceC28690z0).m87022x();
    }

    /* JADX INFO: renamed from: I */
    private static final void m57739I(InterfaceC28690z0 interfaceC28690z0, float f13) {
        ((C28617g1) interfaceC28690z0).m87023y(f13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final InterfaceC28593a1 m57740J() {
        return new C28621h1(0);
    }

    /* JADX INFO: renamed from: K */
    private static final int m57741K(InterfaceC28593a1 interfaceC28593a1) {
        return ((C28621h1) interfaceC28593a1).m87024x();
    }

    /* JADX INFO: renamed from: L */
    private static final void m57742L(InterfaceC28593a1 interfaceC28593a1, int i13) {
        ((C28621h1) interfaceC28593a1).m87025y(i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final boolean m57743M(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: N */
    private static final float m57744N(InterfaceC28690z0 interfaceC28690z0) {
        return ((C28617g1) interfaceC28690z0).m87022x();
    }

    /* JADX INFO: renamed from: O */
    private static final void m57745O(InterfaceC28690z0 interfaceC28690z0, float f13) {
        ((C28617g1) interfaceC28690z0).m87023y(f13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final InterfaceC28601c1 m57746P() {
        return AbstractC28683x.m87272z("");
    }

    /* JADX INFO: renamed from: Q */
    private static final String m57747Q(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: R */
    private static final void m57748R(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final boolean m57749S(C20895m0 c20895m0, InterfaceC28601c1 interfaceC28601c1) {
        return m57743M(interfaceC28601c1) || c20895m0.m57830k() == EnumC20873b0.Expanded || c20895m0.m57828i() > 0.01f;
    }

    /* JADX INFO: renamed from: T */
    private static final boolean m57750T(InterfaceC28670t2 interfaceC28670t2) {
        return ((Boolean) interfaceC28670t2.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final float m57751U(C20895m0 c20895m0) {
        return AbstractC12889b.m36283m(c20895m0.m57828i(), 0.0f, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m57752V(InterfaceC2464x2 interfaceC2464x2, InterfaceC15237i interfaceC15237i, InterfaceC2994c0 interfaceC2994c0, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, C20895m0 c20895m0) {
        m57729A(interfaceC2464x2, interfaceC15237i, interfaceC2994c0, interfaceC28601c1, interfaceC28601c2, c20895m0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final void m57753W(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m57754X(C20895m0 c20895m0, InterfaceC28690z0 interfaceC28690z0, InterfaceC4339a interfaceC4339a, InterfaceC28601c1 interfaceC28601c1, final InterfaceC28601c1 interfaceC28601c2, InterfaceC2464x2 interfaceC2464x2, InterfaceC15237i interfaceC15237i, InterfaceC2994c0 interfaceC2994c0, InterfaceC28670t2 interfaceC28670t2, InterfaceC28593a1 interfaceC28593a1, C25314w c25314w, float f13, float f14, InterfaceC28690z0 interfaceC28690z1, InterfaceC28690z0 interfaceC28690z2, C20907s0 c20907s0, InterfaceC28601c1 interfaceC28601c3, Function1 function1, InterfaceC23004v BoxWithConstraints, Composer composer, int i13) {
        int i14;
        C20895m0 c20895m1;
        final InterfaceC28601c1 interfaceC28601c4;
        Object cVar;
        AbstractC22676k.m65750j(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i13 & 6) == 0) {
            i14 = i13 | (((C28655q) composer).m87153g(BoxWithConstraints) ? 4 : 2);
        } else {
            i14 = i13;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
            float fM3402c = ((C1101c) BoxWithConstraints).m3402c() * 0.9f;
            float fMo743q0 = interfaceC39171c.mo743q0(fM3402c);
            float fMin = Math.min(m57738H(interfaceC28690z1), fMo743q0);
            InterfaceC28670t2 interfaceC28670t2M30588b = AbstractC11352g.m30588b(fMin, AbstractC20897n0.m57839c(), "reactionsExpandedHeight", null, c28655q, 3120, 20);
            float f15 = fMo743q0;
            EnumC20873b0 enumC20873b0M57829j = c20895m0.m57829j();
            EnumC20873b0 enumC20873b0 = EnumC20873b0.Expanded;
            if (enumC20873b0M57829j == enumC20873b0 && c20895m0.m57830k() == enumC20873b0) {
                fMin = m57755Y(interfaceC28670t2M30588b);
            }
            float f16 = fMin;
            boolean zM87153g = c28655q.m87153g(interfaceC28690z0) | c28655q.m87147d(f16) | c28655q.m87153g(c20895m0);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = new C20877d0(f16, c20895m0, interfaceC28690z0);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87257k((InterfaceC4339a) objM87133R, c28655q);
            boolean zM57750T = m57750T(interfaceC28670t2);
            Modifier modifierM3413j = C2314t.f9131w;
            if (zM57750T) {
                c28655q.m87150e0(-1891561688);
                long jM125422u = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBlack70();
                Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1102d.m3407d(1.0f, modifierM3413j), "ReactionsPanelScrim");
                Object objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C20908t(interfaceC28690z2, 3);
                    c28655q.m87172p0(objM87133R2);
                }
                Modifier modifierM3500d = AbstractC1131a.m3500d(modifierM3599a, (Function1) objM87133R2);
                boolean zM87151f = c28655q.m87151f(jM125422u) | c28655q.m87153g(interfaceC4339a);
                Object objM87133R3 = c28655q.m87133R();
                if (zM87151f || objM87133R3 == c28676v0) {
                    objM87133R3 = new C20883g0(jM125422u, interfaceC4339a, interfaceC28690z2);
                    c28655q.m87172p0(objM87133R3);
                }
                Modifier modifierM3478a = AbstractC1125a.m3478a(modifierM3500d, (Function1) objM87133R3);
                Object objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC11266d.m30453g(c28655q);
                }
                InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R4;
                boolean zM87153g2 = c28655q.m87153g(interfaceC28601c1) | c28655q.m87153g(interfaceC28601c2) | c28655q.m87153g(interfaceC2464x2) | c28655q.m87157i(interfaceC15237i) | c28655q.m87157i(interfaceC2994c0) | c28655q.m87153g(c20895m0);
                Object objM87133R5 = c28655q.m87133R();
                if (zM87153g2 || objM87133R5 == c28676v0) {
                    cVar = new c(interfaceC2464x2, interfaceC15237i, interfaceC2994c0, interfaceC28601c1, interfaceC28601c2, c20895m0);
                    c20895m1 = c20895m0;
                    c28655q.m87172p0(cVar);
                } else {
                    c20895m1 = c20895m0;
                    cVar = objM87133R5;
                }
                interfaceC28601c4 = interfaceC28601c1;
                AbstractC22989q.m66760a(m57732B0(AbstractC1092a.m3360e(modifierM3478a, interfaceC21083i, null, false, null, (InterfaceC4339a) ((InterfaceC21467g) cVar), 28)), c28655q, 0);
                c28655q.m87173q(false);
            } else {
                f15 = f15;
                c20895m1 = c20895m0;
                interfaceC28601c4 = interfaceC28601c1;
                c28655q.m87150e0(-1890631440);
                c28655q.m87173q(false);
            }
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C1100b.f4583a.mo3400a(modifierM3413j, C2299e.f9105H));
            boolean zM87153g3 = c28655q.m87153g(interfaceC28670t2) | c28655q.m87153g(interfaceC28593a1) | c28655q.m87153g(c25314w);
            Object objM87133R6 = c28655q.m87133R();
            if (zM87153g3 || objM87133R6 == c28676v0) {
                objM87133R6 = new C18468h(c25314w, interfaceC28670t2, interfaceC28593a1, 20);
                c28655q.m87172p0(objM87133R6);
            }
            Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1132b.m3502b(modifierM3409f, (Function1) objM87133R6), f13, f14);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, modifierM3413j);
            if (m57750T(interfaceC28670t2)) {
                modifierM3413j = AbstractC1102d.m3413j(modifierM3413j, 0.0f, fM3402c, 1);
            }
            Modifier modifierMo3471e = modifierM3409f2.mo3471e(modifierM3413j);
            boolean zM57750T2 = m57750T(interfaceC28670t2);
            float fMin2 = Math.min(m57738H(interfaceC28690z1), f15);
            float f17 = 8;
            float f18 = (2 * f17) - f13;
            float f19 = (1 * f17) - f14;
            boolean zM87153g4 = c28655q.m87153g(c20895m1) | c28655q.m87153g(interfaceC28690z0) | c28655q.m87147d(f15);
            Object objM87133R7 = c28655q.m87133R();
            if (zM87153g4 || objM87133R7 == c28676v0) {
                objM87133R7 = new C20877d0(c20895m1, f15, interfaceC28690z0);
                c28655q.m87172p0(objM87133R7);
            }
            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R7;
            boolean zM87153g5 = c28655q.m87153g(interfaceC28670t2) | c28655q.m87147d(f15) | c28655q.m87153g(interfaceC28690z0);
            Object objM87133R8 = c28655q.m87133R();
            if (zM87153g5 || objM87133R8 == c28676v0) {
                objM87133R8 = new C20885h0(f15, interfaceC28670t2, interfaceC28690z1, interfaceC28690z0);
                c28655q.m87172p0(objM87133R8);
            }
            C20888j c20888j = new C20888j(zM57750T2, interfaceC4339a, fMin2, f18, f19, interfaceC4339a2, (Function1) objM87133R8, null);
            String strM57747Q = m57747Q(interfaceC28601c3);
            boolean z4 = m57750T(interfaceC28670t2) && !c20907s0.getIsLoading();
            boolean zM57792r0 = m57792r0(interfaceC28601c2);
            boolean zM87153g6 = c28655q.m87153g(interfaceC28601c3);
            Object objM87133R9 = c28655q.m87133R();
            if (zM87153g6 || objM87133R9 == c28676v0) {
                objM87133R9 = new C20908t(interfaceC28601c3, 1);
                c28655q.m87172p0(objM87133R9);
            }
            Function1 function2 = (Function1) objM87133R9;
            boolean zM87153g7 = c28655q.m87153g(interfaceC28601c4) | c28655q.m87153g(interfaceC28601c2);
            Object objM87133R10 = c28655q.m87133R();
            if (zM87153g7 || objM87133R10 == c28676v0) {
                final int i15 = 0;
                objM87133R10 = new InterfaceC4339a() { // from class: is0.e0
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i15) {
                            case 0:
                                return AbstractC20889j0.m57772h0(interfaceC28601c4, interfaceC28601c2);
                            default:
                                return AbstractC20889j0.m57776j0(interfaceC28601c4, interfaceC28601c2);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R10);
            }
            InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R10;
            boolean zM87153g8 = c28655q.m87153g(interfaceC28601c2);
            Object objM87133R11 = c28655q.m87133R();
            if (zM87153g8 || objM87133R11 == c28676v0) {
                objM87133R11 = new C20890k(interfaceC28601c2, 1);
                c28655q.m87172p0(objM87133R11);
            }
            InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R11;
            boolean zM87153g9 = c28655q.m87153g(interfaceC28601c2) | c28655q.m87153g(interfaceC28601c4);
            Object objM87133R12 = c28655q.m87133R();
            if (zM87153g9 || objM87133R12 == c28676v0) {
                final int i16 = 1;
                objM87133R12 = new InterfaceC4339a() { // from class: is0.e0
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i16) {
                            case 0:
                                return AbstractC20889j0.m57772h0(interfaceC28601c2, interfaceC28601c4);
                            default:
                                return AbstractC20889j0.m57776j0(interfaceC28601c2, interfaceC28601c4);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R12);
            }
            InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R12;
            boolean zM87153g10 = c28655q.m87153g(interfaceC28601c3) | c28655q.m87153g(function1);
            Object objM87133R13 = c28655q.m87133R();
            if (zM87153g10 || objM87133R13 == c28676v0) {
                objM87133R13 = new C20887i0(3, interfaceC28601c3, function1);
                c28655q.m87172p0(objM87133R13);
            }
            C20871a0 c20871a0 = new C20871a0(strM57747Q, true, z4, zM57792r0, function2, interfaceC4339a3, interfaceC4339a4, interfaceC4339a5, (InterfaceC4339a) objM87133R13);
            boolean zM87153g11 = c28655q.m87153g(interfaceC28601c2) | c28655q.m87153g(interfaceC2464x2) | c28655q.m87157i(interfaceC15237i) | c28655q.m87153g(interfaceC28601c4);
            Object objM87133R14 = c28655q.m87133R();
            if (zM87153g11 || objM87133R14 == c28676v0) {
                objM87133R14 = new C1012d(interfaceC2464x2, interfaceC15237i, interfaceC28601c2, interfaceC28601c4);
                c28655q.m87172p0(objM87133R14);
            }
            AbstractC20916x.m57956o(modifierMo3471e, c20907s0, c20888j, c20895m0, c20871a0, (InterfaceC4339a) objM87133R14, function1, c28655q, 0, 0);
            c28655q.m87173q(true);
            boolean zM87153g12 = c28655q.m87153g(c25314w) | c28655q.m87153g(interfaceC28593a1) | c28655q.m87153g(interfaceC4339a);
            Object objM87133R15 = c28655q.m87133R();
            if (zM87153g12 || objM87133R15 == c28676v0) {
                objM87133R15 = new C18656a0(c25314w, interfaceC4339a, interfaceC28593a1, 8);
                c28655q.m87172p0(objM87133R15);
            }
            AbstractC28683x.m87257k((InterfaceC4339a) objM87133R15, c28655q);
            boolean zM87153g13 = c28655q.m87153g(c25314w);
            Object objM87133R16 = c28655q.m87133R();
            if (zM87153g13 || objM87133R16 == c28676v0) {
                objM87133R16 = new C20908t(c25314w, 2);
                c28655q.m87172p0(objM87133R16);
            }
            AbstractC28683x.m87251e(c25314w, (Function1) objM87133R16, c28655q);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: Y */
    private static final float m57755Y(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final InterfaceC28620h0 m57756Z(C25314w c25314w, C28624i0 DisposableEffect) {
        AbstractC22676k.m65750j(DisposableEffect, "$this$DisposableEffect");
        return new f(c25314w);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C23454a0 m57758a0(float f13, C20895m0 c20895m0, InterfaceC28690z0 interfaceC28690z0) {
        if (m57736F(interfaceC28690z0) > 0.0f && f13 > 0.0f) {
            c20895m0.m57835p(m57736F(interfaceC28690z0), f13);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final C23454a0 m57760b0(InterfaceC28690z0 interfaceC28690z0, InterfaceC39147y it) {
        AbstractC22676k.m65750j(it, "it");
        m57745O(interfaceC28690z0, Float.intBitsToFloat((int) (it.mo3510E(0L) & 4294967295L)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final C23454a0 m57762c0(long j7, InterfaceC4339a interfaceC4339a, InterfaceC28690z0 interfaceC28690z0, InterfaceC22131e drawBehind) {
        AbstractC22676k.m65750j(drawBehind, "$this$drawBehind");
        InterfaceC22131e.m63383i0(drawBehind, j7, (((long) Float.floatToRawIntBits(-m57744N(interfaceC28690z0))) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.mo731d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.mo731d() & 4294967295L)) + m57744N(interfaceC28690z0))) & 4294967295L), ((Number) interfaceC4339a.invoke()).floatValue(), null, 0, 112);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final C23454a0 m57764d0(C25314w c25314w, InterfaceC28670t2 interfaceC28670t2, InterfaceC28593a1 interfaceC28593a1, C39180l c39180l) {
        if (!m57750T(interfaceC28670t2)) {
            m57742L(interfaceC28593a1, (int) (c39180l.f168422a & 4294967295L));
            if (c25314w != null) {
                c25314w.m74333e((int) (c39180l.f168422a & 4294967295L));
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final Integer m57766e0(C20895m0 c20895m0, float f13, InterfaceC28690z0 interfaceC28690z0) {
        Integer numM57824d = c20895m0.m57824d(m57736F(interfaceC28690z0));
        if (numM57824d == null) {
            return null;
        }
        int iIntValue = numM57824d.intValue();
        int iM36258X = AbstractC12889b.m36258X(f13);
        if (iM36258X < 1) {
            iM36258X = 1;
        }
        if (iIntValue > iM36258X) {
            iIntValue = iM36258X;
        }
        return Integer.valueOf(iIntValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final C23454a0 m57768f0(float f13, InterfaceC28670t2 interfaceC28670t2, InterfaceC28690z0 interfaceC28690z0, InterfaceC28690z0 interfaceC28690z1, int i13) {
        float f14 = i13;
        if (m57750T(interfaceC28670t2)) {
            float fMin = Math.min(f14, f13);
            boolean z4 = false;
            boolean z13 = f14 < f13 - 1.0f;
            boolean z14 = fMin > m57738H(interfaceC28690z0) + 1.0f;
            if (z13 && fMin < m57738H(interfaceC28690z0) - 1.0f) {
                z4 = true;
            }
            if (m57738H(interfaceC28690z0) <= 0.0f || z14 || z4) {
                m57739I(interfaceC28690z0, fMin);
            }
        } else if (Math.abs(m57736F(interfaceC28690z1) - f14) > 1.0f) {
            m57737G(interfaceC28690z1, f14);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final C23454a0 m57770g0(InterfaceC28601c1 interfaceC28601c1, String it) {
        AbstractC22676k.m65750j(it, "it");
        m57748R(interfaceC28601c1, it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final C23454a0 m57772h0(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        m57731B(interfaceC28601c1);
        m57794s0(interfaceC28601c2, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final C23454a0 m57774i0(InterfaceC28601c1 interfaceC28601c1) {
        m57794s0(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final C23454a0 m57776j0(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        m57794s0(interfaceC28601c1, true);
        m57731B(interfaceC28601c2);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final C23454a0 m57778k0(InterfaceC28601c1 interfaceC28601c1, Function1 function1) {
        String string = AbstractC39414r.m125869O0(m57747Q(interfaceC28601c1)).toString();
        if (string.length() <= 0) {
            string = null;
        }
        if (string != null) {
            function1.invoke(new AbstractC20905r0.i(string));
            m57748R(interfaceC28601c1, "");
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final C23454a0 m57780l0(InterfaceC2464x2 interfaceC2464x2, InterfaceC15237i interfaceC15237i, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        m57794s0(interfaceC28601c1, false);
        if (interfaceC2464x2 != null) {
            ((C2463x1) interfaceC2464x2).m7442a();
        }
        ((C15240l) interfaceC15237i).m43339b(true);
        m57731B(interfaceC28601c2);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final C23454a0 m57782m0(C25314w c25314w, InterfaceC4339a interfaceC4339a, InterfaceC28593a1 interfaceC28593a1) {
        if (c25314w != null) {
            c25314w.m74333e(m57741K(interfaceC28593a1));
        }
        if (c25314w != null) {
            c25314w.m74334f(interfaceC4339a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final C23454a0 m57784n0(Modifier modifier, C20907s0 c20907s0, boolean z4, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m57807z(modifier, c20907s0, z4, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final boolean m57786o0(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final void m57788p0(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final InterfaceC28601c1 m57790q0() {
        return AbstractC28683x.m87272z(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: r0 */
    private static final boolean m57792r0(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final void m57794s0(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:104:0x01d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:105:0x01db  */
    /* JADX WARN: Code duplicated, block: B:108:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:109:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:112:0x0203  */
    /* JADX WARN: Code duplicated, block: B:113:0x0208  */
    /* JADX WARN: Code duplicated, block: B:116:0x023e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:119:0x024e  */
    /* JADX WARN: Code duplicated, block: B:122:0x0286  */
    /* JADX WARN: Code duplicated, block: B:123:0x0289  */
    /* JADX WARN: Code duplicated, block: B:126:0x029d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:129:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:132:0x02e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:133:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:136:0x0309  */
    /* JADX WARN: Code duplicated, block: B:137:0x030e  */
    /* JADX WARN: Code duplicated, block: B:140:0x031d  */
    /* JADX WARN: Code duplicated, block: B:143:0x032b  */
    /* JADX WARN: Code duplicated, block: B:144:0x032e  */
    /* JADX WARN: Code duplicated, block: B:146:0x0373  */
    /* JADX WARN: Code duplicated, block: B:149:0x0380  */
    /* JADX WARN: Code duplicated, block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:35:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:40:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:57:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:69:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:78:0x010f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0128  */
    /* JADX WARN: Code duplicated, block: B:84:0x0137  */
    /* JADX WARN: Code duplicated, block: B:87:0x015b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0163  */
    /* JADX WARN: Code duplicated, block: B:91:0x0170  */
    /* JADX WARN: Code duplicated, block: B:92:0x017d  */
    /* JADX WARN: Code duplicated, block: B:95:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:98:0x01b6 A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: z */
    public static final void m57807z(Modifier modifier, final C20907s0 viewState, boolean z4, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        boolean z13;
        int i16;
        Function1 function2;
        int i17;
        boolean z14;
        C28655q c28655q;
        Modifier modifier3;
        boolean z15;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        Modifier modifierM57732B0;
        Modifier modifier4;
        boolean z16;
        C28676v0 c28676v0;
        Function1 function4;
        boolean z17;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        C20895m0 c20895m0M57840d;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c2;
        Object objM87133R3;
        InterfaceC28601c1 interfaceC28601c3;
        Object objM87133R4;
        InterfaceC28690z0 interfaceC28690z0;
        Object objM87133R5;
        final InterfaceC28690z0 interfaceC28690z1;
        Object objM87133R6;
        Object objM87133R7;
        Object objM87133R8;
        InterfaceC15237i interfaceC15237i;
        InterfaceC2464x2 interfaceC2464x2;
        Object objM87133R9;
        final InterfaceC2994c0 interfaceC2994c0;
        boolean zM87153g;
        Object objM87133R10;
        final InterfaceC28670t2 interfaceC28670t2;
        boolean zM87153g2;
        Object objM87133R11;
        float f13;
        float f14;
        boolean zM87153g3;
        Object objM87133R12;
        InterfaceC2464x2 interfaceC2464x3;
        InterfaceC15237i interfaceC15237i2;
        final InterfaceC28601c1 interfaceC28601c4;
        C20895m0 c20895m0;
        boolean z18;
        boolean zM87153g4;
        Object objM87133R13;
        final InterfaceC28601c1 interfaceC28601c5;
        InterfaceC28690z0 interfaceC28690z2;
        boolean zM87153g5;
        Object objM87133R14;
        Modifier modifierM3407d;
        String str;
        Object objM87133R15;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-834355032);
        int i18 = i14 & 1;
        if (i18 != 0) {
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
            i15 |= c28655q2.m87157i(viewState) ? 32 : 16;
        }
        int i19 = i14 & 4;
        if (i19 == 0) {
            if ((i13 & 384) == 0) {
                z13 = z4;
                i15 |= c28655q2.m87155h(z13) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    function2 = function1;
                    if (c28655q2.m87157i(function2)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                if ((i15 & 1171) != 1170) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z14)) {
                    modifierM57732B0 = C2314t.f9131w;
                    if (i18 != 0) {
                        modifier4 = modifierM57732B0;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i19 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R15 = c28655q2.m87133R();
                        if (objM87133R15 == c28676v0) {
                            objM87133R15 = new C20918y(8);
                            c28655q2.m87172p0(objM87133R15);
                        }
                        function4 = (Function1) objM87133R15;
                    } else {
                        function4 = function2;
                    }
                    Object[] objArr = new Object[0];
                    if ((i15 & 896) == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R = c28655q2.m87133R();
                    if (z17 || objM87133R == c28676v0) {
                        objM87133R = new C4105r1(z16, 2);
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr, (InterfaceC4339a) objM87133R, c28655q2, 0);
                    c20895m0M57840d = AbstractC20897n0.m57840d(m57743M(interfaceC28601c1), c28655q2, 0, 0);
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC31061c.m95647w(m57743M(interfaceC28601c1), c28655q2);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                    Object[] objArr2 = new Object[0];
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C20886i(9);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr2, (InterfaceC4339a) objM87133R3, c28655q2, 48);
                    Object[] objArr3 = new Object[0];
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C20886i(10);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    interfaceC28690z0 = (InterfaceC28690z0) AbstractC39038k.m124457c(objArr3, (InterfaceC4339a) objM87133R4, c28655q2, 48);
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC11266d.m30468v(0.0f, c28655q2);
                    }
                    interfaceC28690z1 = (InterfaceC28690z0) objM87133R5;
                    Object[] objArr4 = new Object[0];
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C20886i(11);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    final InterfaceC28593a1 interfaceC28593a1 = (InterfaceC28593a1) AbstractC39038k.m124457c(objArr4, (InterfaceC4339a) objM87133R6, c28655q2, 48);
                    final C25314w c25314w = (C25314w) c28655q2.m87161k(AbstractC25315x.m74337c());
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = AbstractC11266d.m30468v(0.0f, c28655q2);
                    }
                    final InterfaceC28690z0 interfaceC28690z3 = (InterfaceC28690z0) objM87133R7;
                    Object[] objArr5 = new Object[0];
                    objM87133R8 = c28655q2.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C20886i(12);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    final InterfaceC28601c1 interfaceC28601c6 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr5, (InterfaceC4339a) objM87133R8, c28655q2, 48);
                    interfaceC15237i = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
                    interfaceC2464x2 = (InterfaceC2464x2) c28655q2.m87161k(AbstractC2453v1.f9577p);
                    objM87133R9 = c28655q2.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = AbstractC28683x.m87262p(c28655q2);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R9;
                    zM87153g = c28655q2.m87153g(c20895m0M57840d);
                    objM87133R10 = c28655q2.m87133R();
                    if (zM87153g || objM87133R10 == c28676v0) {
                        objM87133R10 = AbstractC28683x.m87264r(new C20887i0(4, c20895m0M57840d, interfaceC28601c1));
                        c28655q2.m87172p0(objM87133R10);
                    }
                    interfaceC28670t2 = (InterfaceC28670t2) objM87133R10;
                    zM87153g2 = c28655q2.m87153g(c20895m0M57840d);
                    objM87133R11 = c28655q2.m87133R();
                    if (zM87153g2 || objM87133R11 == c28676v0) {
                        objM87133R11 = new C20891k0(c20895m0M57840d, 1);
                        c28655q2.m87172p0(objM87133R11);
                    }
                    final InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R11;
                    if (m57750T(interfaceC28670t2)) {
                        f13 = 0;
                    } else {
                        f13 = 8 * 2;
                    }
                    if (m57750T(interfaceC28670t2)) {
                        f14 = 0;
                    } else {
                        f14 = 8 * 1;
                    }
                    boolean zM57750T = m57750T(interfaceC28670t2);
                    zM87153g3 = c28655q2.m87153g(interfaceC28601c1) | c28655q2.m87153g(interfaceC28601c3) | c28655q2.m87153g(interfaceC2464x2) | c28655q2.m87157i(interfaceC15237i) | c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87153g(c20895m0M57840d);
                    objM87133R12 = c28655q2.m87133R();
                    if (!zM87153g3 || objM87133R12 == c28676v0) {
                        objM87133R12 = new C0561l(interfaceC2464x2, interfaceC15237i, interfaceC2994c0, interfaceC28601c1, interfaceC28601c3, c20895m0M57840d);
                        interfaceC2464x3 = interfaceC2464x2;
                        interfaceC15237i2 = interfaceC15237i;
                        interfaceC28601c4 = interfaceC28601c3;
                        c20895m0 = c20895m0M57840d;
                        c28655q2.m87172p0(objM87133R12);
                    } else {
                        interfaceC15237i2 = interfaceC15237i;
                        c20895m0 = c20895m0M57840d;
                        interfaceC2464x3 = interfaceC2464x2;
                        interfaceC28601c4 = interfaceC28601c3;
                    }
                    final float f15 = f14;
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R12, zM57750T, c28655q2, 0, 0);
                    Boolean boolValueOf = Boolean.valueOf(m57743M(interfaceC28601c1));
                    boolean zM87153g6 = c28655q2.m87153g(interfaceC28601c1);
                    if ((i15 & 7168) == 2048) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    zM87153g4 = zM87153g6 | z18 | c28655q2.m87153g(interfaceC28690z0) | c28655q2.m87153g(c20895m0);
                    objM87133R13 = c28655q2.m87133R();
                    if (!zM87153g4 || objM87133R13 == c28676v0) {
                        objM87133R13 = new a(function4, c20895m0, interfaceC28601c1, interfaceC28601c2, interfaceC28690z0, interfaceC28690z1, null);
                        interfaceC28601c5 = interfaceC28601c1;
                        interfaceC28690z2 = interfaceC28690z0;
                        c28655q2.m87172p0(objM87133R13);
                    } else {
                        interfaceC28690z2 = interfaceC28690z0;
                        interfaceC28601c5 = interfaceC28601c1;
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R13, boolValueOf);
                    zM87153g5 = c28655q2.m87153g(c20895m0) | c28655q2.m87153g(interfaceC28601c5) | c28655q2.m87153g(interfaceC28601c4) | c28655q2.m87153g(interfaceC2464x3) | c28655q2.m87157i(interfaceC15237i2);
                    objM87133R14 = c28655q2.m87133R();
                    if (zM87153g5 || objM87133R14 == c28676v0) {
                        objM87133R14 = new b(c20895m0, interfaceC2464x3, interfaceC15237i2, interfaceC28601c5, interfaceC28601c4, null);
                        c28655q2.m87172p0(objM87133R14);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R14, c20895m0);
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier4);
                    if (m57750T(interfaceC28670t2)) {
                        modifierM3407d = AbstractC1102d.m3407d(1.0f, modifierM57732B0);
                    } else {
                        modifierM3407d = modifierM57732B0;
                    }
                    Modifier modifierM66720i = AbstractC22953f.m66720i(modifierM3409f.mo3471e(modifierM3407d));
                    if (m57750T(interfaceC28670t2)) {
                        modifierM57732B0 = m57732B0(modifierM57732B0);
                    }
                    Modifier modifierMo3471e = modifierM66720i.mo3471e(modifierM57732B0);
                    if (m57750T(interfaceC28670t2)) {
                        str = "ReactionsPanelExpanded";
                    } else {
                        str = "ReactionsPanelCollapsed";
                    }
                    Modifier modifierM3599a = AbstractC1136a.m3599a(modifierMo3471e, str);
                    final C20895m0 c20895m1 = c20895m0;
                    final InterfaceC28690z0 interfaceC28690z4 = interfaceC28690z2;
                    final InterfaceC15237i interfaceC15237i3 = interfaceC15237i2;
                    final InterfaceC2464x2 interfaceC2464x4 = interfaceC2464x3;
                    final Function1 function5 = function4;
                    final float f16 = f13;
                    Function3 function6 = new Function3() { // from class: is0.f0
                        @Override // p715kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int iIntValue = ((Integer) obj3).intValue();
                            return AbstractC20889j0.m57754X(c20895m1, interfaceC28690z4, interfaceC4339a, interfaceC28601c5, interfaceC28601c4, interfaceC2464x4, interfaceC15237i3, interfaceC2994c0, interfaceC28670t2, interfaceC28593a1, c25314w, f16, f15, interfaceC28690z1, interfaceC28690z3, viewState, interfaceC28601c6, function5, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                        }
                    };
                    c28655q = c28655q2;
                    AbstractC22953f.m66714a(modifierM3599a, null, false, AbstractC37817c.m121344e(1703881234, c28655q, function6), c28655q, 3072, 6);
                    function3 = function5;
                    modifier3 = modifier4;
                    z15 = z16;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    z15 = z13;
                    function3 = function2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2108h(modifier3, (Object) viewState, z15, (InterfaceC23459e) function3, i13, i14, 13);
                }
            }
            i15 |= 3072;
            function2 = function1;
            if ((i15 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z14)) {
                modifierM57732B0 = C2314t.f9131w;
                if (i18 != 0) {
                    modifier4 = modifierM57732B0;
                } else {
                    modifier4 = modifier2;
                }
                if (i19 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R15 = c28655q2.m87133R();
                    if (objM87133R15 == c28676v0) {
                        objM87133R15 = new C20918y(8);
                        c28655q2.m87172p0(objM87133R15);
                    }
                    function4 = (Function1) objM87133R15;
                } else {
                    function4 = function2;
                }
                Object[] objArr6 = new Object[0];
                if ((i15 & 896) == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R = c28655q2.m87133R();
                if (z17) {
                    objM87133R = new C4105r1(z16, 2);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new C4105r1(z16, 2);
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr6, (InterfaceC4339a) objM87133R, c28655q2, 0);
                c20895m0M57840d = AbstractC20897n0.m57840d(m57743M(interfaceC28601c1), c28655q2, 0, 0);
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC31061c.m95647w(m57743M(interfaceC28601c1), c28655q2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                Object[] objArr7 = new Object[0];
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C20886i(9);
                    c28655q2.m87172p0(objM87133R3);
                }
                interfaceC28601c3 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr7, (InterfaceC4339a) objM87133R3, c28655q2, 48);
                Object[] objArr8 = new Object[0];
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C20886i(10);
                    c28655q2.m87172p0(objM87133R4);
                }
                interfaceC28690z0 = (InterfaceC28690z0) AbstractC39038k.m124457c(objArr8, (InterfaceC4339a) objM87133R4, c28655q2, 48);
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC11266d.m30468v(0.0f, c28655q2);
                }
                interfaceC28690z1 = (InterfaceC28690z0) objM87133R5;
                Object[] objArr9 = new Object[0];
                objM87133R6 = c28655q2.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C20886i(11);
                    c28655q2.m87172p0(objM87133R6);
                }
                final InterfaceC28593a1 interfaceC28593a2 = (InterfaceC28593a1) AbstractC39038k.m124457c(objArr9, (InterfaceC4339a) objM87133R6, c28655q2, 48);
                final C25314w c25314w2 = (C25314w) c28655q2.m87161k(AbstractC25315x.m74337c());
                objM87133R7 = c28655q2.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = AbstractC11266d.m30468v(0.0f, c28655q2);
                }
                final InterfaceC28690z0 interfaceC28690z5 = (InterfaceC28690z0) objM87133R7;
                Object[] objArr10 = new Object[0];
                objM87133R8 = c28655q2.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = new C20886i(12);
                    c28655q2.m87172p0(objM87133R8);
                }
                final InterfaceC28601c1 interfaceC28601c7 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr10, (InterfaceC4339a) objM87133R8, c28655q2, 48);
                interfaceC15237i = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
                interfaceC2464x2 = (InterfaceC2464x2) c28655q2.m87161k(AbstractC2453v1.f9577p);
                objM87133R9 = c28655q2.m87133R();
                if (objM87133R9 == c28676v0) {
                    objM87133R9 = AbstractC28683x.m87262p(c28655q2);
                    c28655q2.m87172p0(objM87133R9);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R9;
                zM87153g = c28655q2.m87153g(c20895m0M57840d);
                objM87133R10 = c28655q2.m87133R();
                if (zM87153g) {
                    objM87133R10 = AbstractC28683x.m87264r(new C20887i0(4, c20895m0M57840d, interfaceC28601c1));
                    c28655q2.m87172p0(objM87133R10);
                } else {
                    objM87133R10 = AbstractC28683x.m87264r(new C20887i0(4, c20895m0M57840d, interfaceC28601c1));
                    c28655q2.m87172p0(objM87133R10);
                }
                interfaceC28670t2 = (InterfaceC28670t2) objM87133R10;
                zM87153g2 = c28655q2.m87153g(c20895m0M57840d);
                objM87133R11 = c28655q2.m87133R();
                if (zM87153g2) {
                    objM87133R11 = new C20891k0(c20895m0M57840d, 1);
                    c28655q2.m87172p0(objM87133R11);
                } else {
                    objM87133R11 = new C20891k0(c20895m0M57840d, 1);
                    c28655q2.m87172p0(objM87133R11);
                }
                final InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R11;
                if (m57750T(interfaceC28670t2)) {
                    f13 = 0;
                } else {
                    f13 = 8 * 2;
                }
                if (m57750T(interfaceC28670t2)) {
                    f14 = 0;
                } else {
                    f14 = 8 * 1;
                }
                boolean zM57750T2 = m57750T(interfaceC28670t2);
                zM87153g3 = c28655q2.m87153g(interfaceC28601c1) | c28655q2.m87153g(interfaceC28601c3) | c28655q2.m87153g(interfaceC2464x2) | c28655q2.m87157i(interfaceC15237i) | c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87153g(c20895m0M57840d);
                objM87133R12 = c28655q2.m87133R();
                if (zM87153g3) {
                    objM87133R12 = new C0561l(interfaceC2464x2, interfaceC15237i, interfaceC2994c0, interfaceC28601c1, interfaceC28601c3, c20895m0M57840d);
                    interfaceC2464x3 = interfaceC2464x2;
                    interfaceC15237i2 = interfaceC15237i;
                    interfaceC28601c4 = interfaceC28601c3;
                    c20895m0 = c20895m0M57840d;
                    c28655q2.m87172p0(objM87133R12);
                } else {
                    objM87133R12 = new C0561l(interfaceC2464x2, interfaceC15237i, interfaceC2994c0, interfaceC28601c1, interfaceC28601c3, c20895m0M57840d);
                    interfaceC2464x3 = interfaceC2464x2;
                    interfaceC15237i2 = interfaceC15237i;
                    interfaceC28601c4 = interfaceC28601c3;
                    c20895m0 = c20895m0M57840d;
                    c28655q2.m87172p0(objM87133R12);
                }
                final float f17 = f14;
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R12, zM57750T2, c28655q2, 0, 0);
                Boolean boolValueOf2 = Boolean.valueOf(m57743M(interfaceC28601c1));
                boolean zM87153g7 = c28655q2.m87153g(interfaceC28601c1);
                if ((i15 & 7168) == 2048) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                zM87153g4 = zM87153g7 | z18 | c28655q2.m87153g(interfaceC28690z0) | c28655q2.m87153g(c20895m0);
                objM87133R13 = c28655q2.m87133R();
                if (zM87153g4) {
                    objM87133R13 = new a(function4, c20895m0, interfaceC28601c1, interfaceC28601c2, interfaceC28690z0, interfaceC28690z1, null);
                    interfaceC28601c5 = interfaceC28601c1;
                    interfaceC28690z2 = interfaceC28690z0;
                    c28655q2.m87172p0(objM87133R13);
                } else {
                    objM87133R13 = new a(function4, c20895m0, interfaceC28601c1, interfaceC28601c2, interfaceC28690z0, interfaceC28690z1, null);
                    interfaceC28601c5 = interfaceC28601c1;
                    interfaceC28690z2 = interfaceC28690z0;
                    c28655q2.m87172p0(objM87133R13);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R13, boolValueOf2);
                zM87153g5 = c28655q2.m87153g(c20895m0) | c28655q2.m87153g(interfaceC28601c5) | c28655q2.m87153g(interfaceC28601c4) | c28655q2.m87153g(interfaceC2464x3) | c28655q2.m87157i(interfaceC15237i2);
                objM87133R14 = c28655q2.m87133R();
                if (zM87153g5) {
                    objM87133R14 = new b(c20895m0, interfaceC2464x3, interfaceC15237i2, interfaceC28601c5, interfaceC28601c4, null);
                    c28655q2.m87172p0(objM87133R14);
                } else {
                    objM87133R14 = new b(c20895m0, interfaceC2464x3, interfaceC15237i2, interfaceC28601c5, interfaceC28601c4, null);
                    c28655q2.m87172p0(objM87133R14);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R14, c20895m0);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, modifier4);
                if (m57750T(interfaceC28670t2)) {
                    modifierM3407d = AbstractC1102d.m3407d(1.0f, modifierM57732B0);
                } else {
                    modifierM3407d = modifierM57732B0;
                }
                Modifier modifierM66720i2 = AbstractC22953f.m66720i(modifierM3409f2.mo3471e(modifierM3407d));
                if (m57750T(interfaceC28670t2)) {
                    modifierM57732B0 = m57732B0(modifierM57732B0);
                }
                Modifier modifierMo3471e2 = modifierM66720i2.mo3471e(modifierM57732B0);
                if (m57750T(interfaceC28670t2)) {
                    str = "ReactionsPanelExpanded";
                } else {
                    str = "ReactionsPanelCollapsed";
                }
                Modifier modifierM3599a2 = AbstractC1136a.m3599a(modifierMo3471e2, str);
                final C20895m0 c20895m2 = c20895m0;
                final InterfaceC28690z0 interfaceC28690z6 = interfaceC28690z2;
                final InterfaceC15237i interfaceC15237i4 = interfaceC15237i2;
                final InterfaceC2464x2 interfaceC2464x5 = interfaceC2464x3;
                final Function1 function7 = function4;
                final float f18 = f13;
                Function3 function8 = new Function3() { // from class: is0.f0
                    @Override // p715kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return AbstractC20889j0.m57754X(c20895m2, interfaceC28690z6, interfaceC4339a2, interfaceC28601c5, interfaceC28601c4, interfaceC2464x5, interfaceC15237i4, interfaceC2994c0, interfaceC28670t2, interfaceC28593a2, c25314w2, f18, f17, interfaceC28690z1, interfaceC28690z5, viewState, interfaceC28601c7, function7, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                    }
                };
                c28655q = c28655q2;
                AbstractC22953f.m66714a(modifierM3599a2, null, false, AbstractC37817c.m121344e(1703881234, c28655q, function8), c28655q, 3072, 6);
                function3 = function7;
                modifier3 = modifier4;
                z15 = z16;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
                z15 = z13;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2108h(modifier3, (Object) viewState, z15, (InterfaceC23459e) function3, i13, i14, 13);
            }
        }
        i15 |= 384;
        z13 = z4;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                function2 = function1;
                if (c28655q2.m87157i(function2)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            if ((i15 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z14)) {
                modifierM57732B0 = C2314t.f9131w;
                if (i18 != 0) {
                    modifier4 = modifierM57732B0;
                } else {
                    modifier4 = modifier2;
                }
                if (i19 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R15 = c28655q2.m87133R();
                    if (objM87133R15 == c28676v0) {
                        objM87133R15 = new C20918y(8);
                        c28655q2.m87172p0(objM87133R15);
                    }
                    function4 = (Function1) objM87133R15;
                } else {
                    function4 = function2;
                }
                Object[] objArr11 = new Object[0];
                if ((i15 & 896) == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R = c28655q2.m87133R();
                if (z17) {
                    objM87133R = new C4105r1(z16, 2);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new C4105r1(z16, 2);
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr11, (InterfaceC4339a) objM87133R, c28655q2, 0);
                c20895m0M57840d = AbstractC20897n0.m57840d(m57743M(interfaceC28601c1), c28655q2, 0, 0);
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC31061c.m95647w(m57743M(interfaceC28601c1), c28655q2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                Object[] objArr12 = new Object[0];
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C20886i(9);
                    c28655q2.m87172p0(objM87133R3);
                }
                interfaceC28601c3 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr12, (InterfaceC4339a) objM87133R3, c28655q2, 48);
                Object[] objArr13 = new Object[0];
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C20886i(10);
                    c28655q2.m87172p0(objM87133R4);
                }
                interfaceC28690z0 = (InterfaceC28690z0) AbstractC39038k.m124457c(objArr13, (InterfaceC4339a) objM87133R4, c28655q2, 48);
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC11266d.m30468v(0.0f, c28655q2);
                }
                interfaceC28690z1 = (InterfaceC28690z0) objM87133R5;
                Object[] objArr14 = new Object[0];
                objM87133R6 = c28655q2.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C20886i(11);
                    c28655q2.m87172p0(objM87133R6);
                }
                final InterfaceC28593a1 interfaceC28593a3 = (InterfaceC28593a1) AbstractC39038k.m124457c(objArr14, (InterfaceC4339a) objM87133R6, c28655q2, 48);
                final C25314w c25314w3 = (C25314w) c28655q2.m87161k(AbstractC25315x.m74337c());
                objM87133R7 = c28655q2.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = AbstractC11266d.m30468v(0.0f, c28655q2);
                }
                final InterfaceC28690z0 interfaceC28690z7 = (InterfaceC28690z0) objM87133R7;
                Object[] objArr15 = new Object[0];
                objM87133R8 = c28655q2.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = new C20886i(12);
                    c28655q2.m87172p0(objM87133R8);
                }
                final InterfaceC28601c1 interfaceC28601c8 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr15, (InterfaceC4339a) objM87133R8, c28655q2, 48);
                interfaceC15237i = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
                interfaceC2464x2 = (InterfaceC2464x2) c28655q2.m87161k(AbstractC2453v1.f9577p);
                objM87133R9 = c28655q2.m87133R();
                if (objM87133R9 == c28676v0) {
                    objM87133R9 = AbstractC28683x.m87262p(c28655q2);
                    c28655q2.m87172p0(objM87133R9);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R9;
                zM87153g = c28655q2.m87153g(c20895m0M57840d);
                objM87133R10 = c28655q2.m87133R();
                if (zM87153g) {
                    objM87133R10 = AbstractC28683x.m87264r(new C20887i0(4, c20895m0M57840d, interfaceC28601c1));
                    c28655q2.m87172p0(objM87133R10);
                } else {
                    objM87133R10 = AbstractC28683x.m87264r(new C20887i0(4, c20895m0M57840d, interfaceC28601c1));
                    c28655q2.m87172p0(objM87133R10);
                }
                interfaceC28670t2 = (InterfaceC28670t2) objM87133R10;
                zM87153g2 = c28655q2.m87153g(c20895m0M57840d);
                objM87133R11 = c28655q2.m87133R();
                if (zM87153g2) {
                    objM87133R11 = new C20891k0(c20895m0M57840d, 1);
                    c28655q2.m87172p0(objM87133R11);
                } else {
                    objM87133R11 = new C20891k0(c20895m0M57840d, 1);
                    c28655q2.m87172p0(objM87133R11);
                }
                final InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R11;
                if (m57750T(interfaceC28670t2)) {
                    f13 = 0;
                } else {
                    f13 = 8 * 2;
                }
                if (m57750T(interfaceC28670t2)) {
                    f14 = 0;
                } else {
                    f14 = 8 * 1;
                }
                boolean zM57750T3 = m57750T(interfaceC28670t2);
                zM87153g3 = c28655q2.m87153g(interfaceC28601c1) | c28655q2.m87153g(interfaceC28601c3) | c28655q2.m87153g(interfaceC2464x2) | c28655q2.m87157i(interfaceC15237i) | c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87153g(c20895m0M57840d);
                objM87133R12 = c28655q2.m87133R();
                if (zM87153g3) {
                    objM87133R12 = new C0561l(interfaceC2464x2, interfaceC15237i, interfaceC2994c0, interfaceC28601c1, interfaceC28601c3, c20895m0M57840d);
                    interfaceC2464x3 = interfaceC2464x2;
                    interfaceC15237i2 = interfaceC15237i;
                    interfaceC28601c4 = interfaceC28601c3;
                    c20895m0 = c20895m0M57840d;
                    c28655q2.m87172p0(objM87133R12);
                } else {
                    objM87133R12 = new C0561l(interfaceC2464x2, interfaceC15237i, interfaceC2994c0, interfaceC28601c1, interfaceC28601c3, c20895m0M57840d);
                    interfaceC2464x3 = interfaceC2464x2;
                    interfaceC15237i2 = interfaceC15237i;
                    interfaceC28601c4 = interfaceC28601c3;
                    c20895m0 = c20895m0M57840d;
                    c28655q2.m87172p0(objM87133R12);
                }
                final float f19 = f14;
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R12, zM57750T3, c28655q2, 0, 0);
                Boolean boolValueOf3 = Boolean.valueOf(m57743M(interfaceC28601c1));
                boolean zM87153g8 = c28655q2.m87153g(interfaceC28601c1);
                if ((i15 & 7168) == 2048) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                zM87153g4 = zM87153g8 | z18 | c28655q2.m87153g(interfaceC28690z0) | c28655q2.m87153g(c20895m0);
                objM87133R13 = c28655q2.m87133R();
                if (zM87153g4) {
                    objM87133R13 = new a(function4, c20895m0, interfaceC28601c1, interfaceC28601c2, interfaceC28690z0, interfaceC28690z1, null);
                    interfaceC28601c5 = interfaceC28601c1;
                    interfaceC28690z2 = interfaceC28690z0;
                    c28655q2.m87172p0(objM87133R13);
                } else {
                    objM87133R13 = new a(function4, c20895m0, interfaceC28601c1, interfaceC28601c2, interfaceC28690z0, interfaceC28690z1, null);
                    interfaceC28601c5 = interfaceC28601c1;
                    interfaceC28690z2 = interfaceC28690z0;
                    c28655q2.m87172p0(objM87133R13);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R13, boolValueOf3);
                zM87153g5 = c28655q2.m87153g(c20895m0) | c28655q2.m87153g(interfaceC28601c5) | c28655q2.m87153g(interfaceC28601c4) | c28655q2.m87153g(interfaceC2464x3) | c28655q2.m87157i(interfaceC15237i2);
                objM87133R14 = c28655q2.m87133R();
                if (zM87153g5) {
                    objM87133R14 = new b(c20895m0, interfaceC2464x3, interfaceC15237i2, interfaceC28601c5, interfaceC28601c4, null);
                    c28655q2.m87172p0(objM87133R14);
                } else {
                    objM87133R14 = new b(c20895m0, interfaceC2464x3, interfaceC15237i2, interfaceC28601c5, interfaceC28601c4, null);
                    c28655q2.m87172p0(objM87133R14);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R14, c20895m0);
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, modifier4);
                if (m57750T(interfaceC28670t2)) {
                    modifierM3407d = AbstractC1102d.m3407d(1.0f, modifierM57732B0);
                } else {
                    modifierM3407d = modifierM57732B0;
                }
                Modifier modifierM66720i3 = AbstractC22953f.m66720i(modifierM3409f3.mo3471e(modifierM3407d));
                if (m57750T(interfaceC28670t2)) {
                    modifierM57732B0 = m57732B0(modifierM57732B0);
                }
                Modifier modifierMo3471e3 = modifierM66720i3.mo3471e(modifierM57732B0);
                if (m57750T(interfaceC28670t2)) {
                    str = "ReactionsPanelExpanded";
                } else {
                    str = "ReactionsPanelCollapsed";
                }
                Modifier modifierM3599a3 = AbstractC1136a.m3599a(modifierMo3471e3, str);
                final C20895m0 c20895m3 = c20895m0;
                final InterfaceC28690z0 interfaceC28690z8 = interfaceC28690z2;
                final InterfaceC15237i interfaceC15237i5 = interfaceC15237i2;
                final InterfaceC2464x2 interfaceC2464x6 = interfaceC2464x3;
                final Function1 function9 = function4;
                final float f110 = f13;
                Function3 function10 = new Function3() { // from class: is0.f0
                    @Override // p715kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return AbstractC20889j0.m57754X(c20895m3, interfaceC28690z8, interfaceC4339a3, interfaceC28601c5, interfaceC28601c4, interfaceC2464x6, interfaceC15237i5, interfaceC2994c0, interfaceC28670t2, interfaceC28593a3, c25314w3, f110, f19, interfaceC28690z1, interfaceC28690z7, viewState, interfaceC28601c8, function9, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                    }
                };
                c28655q = c28655q2;
                AbstractC22953f.m66714a(modifierM3599a3, null, false, AbstractC37817c.m121344e(1703881234, c28655q, function10), c28655q, 3072, 6);
                function3 = function9;
                modifier3 = modifier4;
                z15 = z16;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
                z15 = z13;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2108h(modifier3, (Object) viewState, z15, (InterfaceC23459e) function3, i13, i14, 13);
            }
        }
        i15 |= 3072;
        function2 = function1;
        if ((i15 & 1171) != 1170) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z14)) {
            modifierM57732B0 = C2314t.f9131w;
            if (i18 != 0) {
                modifier4 = modifierM57732B0;
            } else {
                modifier4 = modifier2;
            }
            if (i19 != 0) {
                z16 = false;
            } else {
                z16 = z13;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R15 = c28655q2.m87133R();
                if (objM87133R15 == c28676v0) {
                    objM87133R15 = new C20918y(8);
                    c28655q2.m87172p0(objM87133R15);
                }
                function4 = (Function1) objM87133R15;
            } else {
                function4 = function2;
            }
            Object[] objArr16 = new Object[0];
            if ((i15 & 896) == 256) {
                z17 = true;
            } else {
                z17 = false;
            }
            objM87133R = c28655q2.m87133R();
            if (z17) {
                objM87133R = new C4105r1(z16, 2);
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = new C4105r1(z16, 2);
                c28655q2.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr16, (InterfaceC4339a) objM87133R, c28655q2, 0);
            c20895m0M57840d = AbstractC20897n0.m57840d(m57743M(interfaceC28601c1), c28655q2, 0, 0);
            objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC31061c.m95647w(m57743M(interfaceC28601c1), c28655q2);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
            Object[] objArr17 = new Object[0];
            objM87133R3 = c28655q2.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C20886i(9);
                c28655q2.m87172p0(objM87133R3);
            }
            interfaceC28601c3 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr17, (InterfaceC4339a) objM87133R3, c28655q2, 48);
            Object[] objArr18 = new Object[0];
            objM87133R4 = c28655q2.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = new C20886i(10);
                c28655q2.m87172p0(objM87133R4);
            }
            interfaceC28690z0 = (InterfaceC28690z0) AbstractC39038k.m124457c(objArr18, (InterfaceC4339a) objM87133R4, c28655q2, 48);
            objM87133R5 = c28655q2.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = AbstractC11266d.m30468v(0.0f, c28655q2);
            }
            interfaceC28690z1 = (InterfaceC28690z0) objM87133R5;
            Object[] objArr19 = new Object[0];
            objM87133R6 = c28655q2.m87133R();
            if (objM87133R6 == c28676v0) {
                objM87133R6 = new C20886i(11);
                c28655q2.m87172p0(objM87133R6);
            }
            final InterfaceC28593a1 interfaceC28593a4 = (InterfaceC28593a1) AbstractC39038k.m124457c(objArr19, (InterfaceC4339a) objM87133R6, c28655q2, 48);
            final C25314w c25314w4 = (C25314w) c28655q2.m87161k(AbstractC25315x.m74337c());
            objM87133R7 = c28655q2.m87133R();
            if (objM87133R7 == c28676v0) {
                objM87133R7 = AbstractC11266d.m30468v(0.0f, c28655q2);
            }
            final InterfaceC28690z0 interfaceC28690z9 = (InterfaceC28690z0) objM87133R7;
            Object[] objArr110 = new Object[0];
            objM87133R8 = c28655q2.m87133R();
            if (objM87133R8 == c28676v0) {
                objM87133R8 = new C20886i(12);
                c28655q2.m87172p0(objM87133R8);
            }
            final InterfaceC28601c1 interfaceC28601c9 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr110, (InterfaceC4339a) objM87133R8, c28655q2, 48);
            interfaceC15237i = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
            interfaceC2464x2 = (InterfaceC2464x2) c28655q2.m87161k(AbstractC2453v1.f9577p);
            objM87133R9 = c28655q2.m87133R();
            if (objM87133R9 == c28676v0) {
                objM87133R9 = AbstractC28683x.m87262p(c28655q2);
                c28655q2.m87172p0(objM87133R9);
            }
            interfaceC2994c0 = (InterfaceC2994c0) objM87133R9;
            zM87153g = c28655q2.m87153g(c20895m0M57840d);
            objM87133R10 = c28655q2.m87133R();
            if (zM87153g) {
                objM87133R10 = AbstractC28683x.m87264r(new C20887i0(4, c20895m0M57840d, interfaceC28601c1));
                c28655q2.m87172p0(objM87133R10);
            } else {
                objM87133R10 = AbstractC28683x.m87264r(new C20887i0(4, c20895m0M57840d, interfaceC28601c1));
                c28655q2.m87172p0(objM87133R10);
            }
            interfaceC28670t2 = (InterfaceC28670t2) objM87133R10;
            zM87153g2 = c28655q2.m87153g(c20895m0M57840d);
            objM87133R11 = c28655q2.m87133R();
            if (zM87153g2) {
                objM87133R11 = new C20891k0(c20895m0M57840d, 1);
                c28655q2.m87172p0(objM87133R11);
            } else {
                objM87133R11 = new C20891k0(c20895m0M57840d, 1);
                c28655q2.m87172p0(objM87133R11);
            }
            final InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R11;
            if (m57750T(interfaceC28670t2)) {
                f13 = 0;
            } else {
                f13 = 8 * 2;
            }
            if (m57750T(interfaceC28670t2)) {
                f14 = 0;
            } else {
                f14 = 8 * 1;
            }
            boolean zM57750T4 = m57750T(interfaceC28670t2);
            zM87153g3 = c28655q2.m87153g(interfaceC28601c1) | c28655q2.m87153g(interfaceC28601c3) | c28655q2.m87153g(interfaceC2464x2) | c28655q2.m87157i(interfaceC15237i) | c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87153g(c20895m0M57840d);
            objM87133R12 = c28655q2.m87133R();
            if (zM87153g3) {
                objM87133R12 = new C0561l(interfaceC2464x2, interfaceC15237i, interfaceC2994c0, interfaceC28601c1, interfaceC28601c3, c20895m0M57840d);
                interfaceC2464x3 = interfaceC2464x2;
                interfaceC15237i2 = interfaceC15237i;
                interfaceC28601c4 = interfaceC28601c3;
                c20895m0 = c20895m0M57840d;
                c28655q2.m87172p0(objM87133R12);
            } else {
                objM87133R12 = new C0561l(interfaceC2464x2, interfaceC15237i, interfaceC2994c0, interfaceC28601c1, interfaceC28601c3, c20895m0M57840d);
                interfaceC2464x3 = interfaceC2464x2;
                interfaceC15237i2 = interfaceC15237i;
                interfaceC28601c4 = interfaceC28601c3;
                c20895m0 = c20895m0M57840d;
                c28655q2.m87172p0(objM87133R12);
            }
            final float f111 = f14;
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R12, zM57750T4, c28655q2, 0, 0);
            Boolean boolValueOf4 = Boolean.valueOf(m57743M(interfaceC28601c1));
            boolean zM87153g9 = c28655q2.m87153g(interfaceC28601c1);
            if ((i15 & 7168) == 2048) {
                z18 = true;
            } else {
                z18 = false;
            }
            zM87153g4 = zM87153g9 | z18 | c28655q2.m87153g(interfaceC28690z0) | c28655q2.m87153g(c20895m0);
            objM87133R13 = c28655q2.m87133R();
            if (zM87153g4) {
                objM87133R13 = new a(function4, c20895m0, interfaceC28601c1, interfaceC28601c2, interfaceC28690z0, interfaceC28690z1, null);
                interfaceC28601c5 = interfaceC28601c1;
                interfaceC28690z2 = interfaceC28690z0;
                c28655q2.m87172p0(objM87133R13);
            } else {
                objM87133R13 = new a(function4, c20895m0, interfaceC28601c1, interfaceC28601c2, interfaceC28690z0, interfaceC28690z1, null);
                interfaceC28601c5 = interfaceC28601c1;
                interfaceC28690z2 = interfaceC28690z0;
                c28655q2.m87172p0(objM87133R13);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R13, boolValueOf4);
            zM87153g5 = c28655q2.m87153g(c20895m0) | c28655q2.m87153g(interfaceC28601c5) | c28655q2.m87153g(interfaceC28601c4) | c28655q2.m87153g(interfaceC2464x3) | c28655q2.m87157i(interfaceC15237i2);
            objM87133R14 = c28655q2.m87133R();
            if (zM87153g5) {
                objM87133R14 = new b(c20895m0, interfaceC2464x3, interfaceC15237i2, interfaceC28601c5, interfaceC28601c4, null);
                c28655q2.m87172p0(objM87133R14);
            } else {
                objM87133R14 = new b(c20895m0, interfaceC2464x3, interfaceC15237i2, interfaceC28601c5, interfaceC28601c4, null);
                c28655q2.m87172p0(objM87133R14);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R14, c20895m0);
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, modifier4);
            if (m57750T(interfaceC28670t2)) {
                modifierM3407d = AbstractC1102d.m3407d(1.0f, modifierM57732B0);
            } else {
                modifierM3407d = modifierM57732B0;
            }
            Modifier modifierM66720i4 = AbstractC22953f.m66720i(modifierM3409f4.mo3471e(modifierM3407d));
            if (m57750T(interfaceC28670t2)) {
                modifierM57732B0 = m57732B0(modifierM57732B0);
            }
            Modifier modifierMo3471e4 = modifierM66720i4.mo3471e(modifierM57732B0);
            if (m57750T(interfaceC28670t2)) {
                str = "ReactionsPanelExpanded";
            } else {
                str = "ReactionsPanelCollapsed";
            }
            Modifier modifierM3599a4 = AbstractC1136a.m3599a(modifierMo3471e4, str);
            final C20895m0 c20895m4 = c20895m0;
            final InterfaceC28690z0 interfaceC28690z10 = interfaceC28690z2;
            final InterfaceC15237i interfaceC15237i6 = interfaceC15237i2;
            final InterfaceC2464x2 interfaceC2464x7 = interfaceC2464x3;
            final Function1 function11 = function4;
            final float f112 = f13;
            Function3 function12 = new Function3() { // from class: is0.f0
                @Override // p715kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return AbstractC20889j0.m57754X(c20895m4, interfaceC28690z10, interfaceC4339a4, interfaceC28601c5, interfaceC28601c4, interfaceC2464x7, interfaceC15237i6, interfaceC2994c0, interfaceC28670t2, interfaceC28593a4, c25314w4, f112, f111, interfaceC28690z1, interfaceC28690z9, viewState, interfaceC28601c9, function11, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                }
            };
            c28655q = c28655q2;
            AbstractC22953f.m66714a(modifierM3599a4, null, false, AbstractC37817c.m121344e(1703881234, c28655q, function12), c28655q, 3072, 6);
            function3 = function11;
            modifier3 = modifier4;
            z15 = z16;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
            z15 = z13;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2108h(modifier3, (Object) viewState, z15, (InterfaceC23459e) function3, i13, i14, 13);
        }
    }
}
