package n31;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import az1.C2165f;
import bc3.InterfaceC2994c0;
import bm2.C3428b1;
import c41.C4048j0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.item.DesignItemInteraction;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.whoopaction.domain.models.Action;
import cp0.C10965i;
import e31.AbstractC12610b;
import e31.C12611c;
import e31.C12612d;
import gf1.C15786e;
import gy0.AbstractC16276e;
import gy0.AbstractC16277f;
import hy0.AbstractC17795v0;
import hy0.AbstractC17801x0;
import l83.C23454a0;
import mx1.C26009o;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.AbstractC0201g;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p163g1.C15043i8;
import p163g1.C15197y1;
import p164g2.InterfaceC15237i;
import p180h0.AbstractC16444q3;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p512u2.AbstractC34452c0;
import p512u2.C34462h0;
import p512u2.InterfaceC34449b;
import p512u2.InterfaceC34476v;
import p571w3.C36775k;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p719m22.C24965t;
import p720m91.AbstractC25300i;
import p720m91.AbstractC25303l;
import p720m91.C25306o;
import p720m91.InterfaceC25312u;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32274h;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import v41.AbstractC35684p;
import v41.InterfaceC35689r0;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: n31.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aa\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0007H\u0001¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u0010\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u00020\bH\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001b\u0010\u0016\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a'\u0010\u001b\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0019H\u0003¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Ln31/e;", "viewState", "", "path", "searchQuery", "Lkotlin/Function1;", "Ll83/a0;", "onSearchQueryChanged", "", "onEvent", "o", "(Landroidx/compose/ui/Modifier;Ln31/e;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lcom/whoop/design/util/TextResource;", "loadingHintText", "y", "(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V", "A", "(Landroidx/compose/runtime/Composer;I)V", "Lg2/i;", "focusManager", "C", "(Landroidx/compose/ui/Modifier;Lg2/i;)Landroidx/compose/ui/Modifier;", "error", "Lkotlin/Function0;", "onDismiss", "m", "(Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC26217b {

    /* JADX INFO: renamed from: n31.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.searcharchmini.SearchArchMiniKt$ActionErrorToast$1$1", m100430f = "SearchArchMini.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f103937w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Context f103938x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f103939y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f103940z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, String str, InterfaceC4339a interfaceC4339a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f103938x = context;
            this.f103939y = str;
            this.f103940z = interfaceC4339a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f103938x, this.f103939y, this.f103940z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f103937w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            Context context = this.f103938x;
            String string = this.f103939y;
            if (string.length() == 0) {
                string = context.getString(AbstractC16277f.f62281T);
                AbstractC22676k.m65749i(string, "getString(...)");
            }
            Toast.makeText(context, string, 1).show();
            this.f103940z.invoke();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: n31.b$b */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.searcharchmini.SearchArchMiniKt$SearchArchMini$4$1", m100430f = "SearchArchMini.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f103941w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C26220e f103942x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f103943y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C26220e c26220e, Function1 function1, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f103942x = c26220e;
            this.f103943y = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f103942x, this.f103943y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f103941w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            GenericInteraction genericInteractionM77864c = this.f103942x.getInteraction();
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (genericInteractionM77864c == null) {
                return c23454a0;
            }
            this.f103943y.invoke(genericInteractionM77864c);
            this.f103943y.invoke(AbstractC26218c.a.f103955a);
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: n31.b$c */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.searcharchmini.SearchArchMiniKt$SearchArchMini$5$1", m100430f = "SearchArchMini.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f103944w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C26220e f103945x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AnalyticEventModel f103946y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Function1 f103947z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C26220e c26220e, AnalyticEventModel analyticEventModel, Function1 function1, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f103945x = c26220e;
            this.f103946y = analyticEventModel;
            this.f103947z = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f103945x, this.f103946y, this.f103947z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f103944w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (!this.f103945x.getIsLoading() && !this.f103945x.getIsError() && this.f103946y != null) {
                this.f103947z.invoke(new DesignItemInteraction(null, this.f103946y));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: n31.b$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements PointerInputEventHandler {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC15237i f103948w;

        /* JADX INFO: renamed from: n31.b$d$a */
        @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.searcharchmini.SearchArchMiniKt$clearFocusOnScroll$1$1", m100430f = "SearchArchMini.kt", m100431l = {184, 187}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lu2/b;", "Ll83/a0;", "<anonymous>", "(Lu2/b;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32274h implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            private /* synthetic */ Object f103949E;

            /* JADX INFO: renamed from: F */
            final /* synthetic */ float f103950F;

            /* JADX INFO: renamed from: G */
            final /* synthetic */ InterfaceC15237i f103951G;

            /* JADX INFO: renamed from: x */
            Object f103952x;

            /* JADX INFO: renamed from: y */
            long f103953y;

            /* JADX INFO: renamed from: z */
            int f103954z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(float f13, InterfaceC15237i interfaceC15237i, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f103950F = f13;
                this.f103951G = interfaceC15237i;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                a aVar = new a(this.f103950F, this.f103951G, interfaceC30057d);
                aVar.f103949E = obj;
                return aVar;
            }

            @Override // c93.InterfaceC4351m
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC34449b interfaceC34449b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC34449b, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
            
                if (r14 == r1) goto L16;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
            
                if (r14 == r1) goto L16;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
            
                return r1;
             */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:17:0x004f). Please report as a decompilation issue!!! */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                /*
                    r13 = this;
                    java.lang.Object r0 = r13.f103949E
                    u2.b r0 = (p512u2.InterfaceC34449b) r0
                    r83.a r1 = r83.EnumC31071a.f128113w
                    int r2 = r13.f103954z
                    r3 = 2
                    r4 = 0
                    r5 = 1
                    if (r2 == 0) goto L27
                    if (r2 == r5) goto L23
                    if (r2 != r3) goto L1b
                    long r5 = r13.f103953y
                    java.lang.Object r2 = r13.f103952x
                    u2.r r2 = (p512u2.C34472r) r2
                    p505ts.AbstractC34132o.m107864I(r14)
                    goto L4f
                L1b:
                    java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r14.<init>(r0)
                    throw r14
                L23:
                    p505ts.AbstractC34132o.m107864I(r14)
                    goto L37
                L27:
                    p505ts.AbstractC34132o.m107864I(r14)
                    u2.l r14 = p512u2.EnumC34466l.f144806w
                    r13.f103949E = r0
                    r13.f103954z = r5
                    java.lang.Object r14 = p180h0.AbstractC16434o3.m46602b(r0, r4, r14, r13)
                    if (r14 != r1) goto L37
                    goto L4e
                L37:
                    u2.r r14 = (p512u2.C34472r) r14
                    r5 = 0
                    r2 = r14
                L3c:
                    u2.l r14 = p512u2.EnumC34466l.f144806w
                    r13.f103949E = r0
                    r13.f103952x = r2
                    r13.f103953y = r5
                    r13.f103954z = r3
                    u2.g0 r0 = (p512u2.C34460g0) r0
                    java.lang.Object r14 = r0.m108928a(r14, r13)
                    if (r14 != r1) goto L4f
                L4e:
                    return r1
                L4f:
                    u2.k r14 = (p512u2.C34465k) r14
                    java.lang.Object r7 = r14.f144800a
                    java.lang.Iterable r7 = (java.lang.Iterable) r7
                    java.util.Iterator r7 = r7.iterator()
                L59:
                    boolean r8 = r7.hasNext()
                    if (r8 == 0) goto L71
                    java.lang.Object r8 = r7.next()
                    r9 = r8
                    u2.r r9 = (p512u2.C34472r) r9
                    long r9 = r9.f144815a
                    long r11 = r2.f144815a
                    boolean r9 = p512u2.AbstractC34471q.m108943a(r9, r11)
                    if (r9 == 0) goto L59
                    goto L72
                L71:
                    r8 = 0
                L72:
                    u2.r r8 = (p512u2.C34472r) r8
                    if (r8 == 0) goto Lb5
                    long r7 = p512u2.AbstractC34454d0.m108920k(r8, r4)
                    long r5 = p181h2.C16617b.m47192h(r5, r7)
                    float r7 = p181h2.C16617b.m47188d(r5)
                    float r8 = r13.f103950F
                    int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
                    if (r7 <= 0) goto L8e
                    g2.i r14 = r13.f103951G
                    p164g2.InterfaceC15237i.m43338a(r14)
                    goto Lb5
                L8e:
                    java.lang.Object r14 = r14.f144800a
                    java.lang.Iterable r14 = (java.lang.Iterable) r14
                    boolean r7 = r14 instanceof java.util.Collection
                    if (r7 == 0) goto La0
                    r7 = r14
                    java.util.Collection r7 = (java.util.Collection) r7
                    boolean r7 = r7.isEmpty()
                    if (r7 == 0) goto La0
                    goto Lb5
                La0:
                    java.util.Iterator r14 = r14.iterator()
                La4:
                    boolean r7 = r14.hasNext()
                    if (r7 == 0) goto Lb5
                    java.lang.Object r7 = r14.next()
                    u2.r r7 = (p512u2.C34472r) r7
                    boolean r7 = r7.f144818d
                    if (r7 == 0) goto La4
                    goto L3c
                Lb5:
                    l83.a0 r14 = l83.C23454a0.f92919a
                    return r14
                */
                throw new UnsupportedOperationException("Method not decompiled: n31.AbstractC26217b.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public d(InterfaceC15237i interfaceC15237i) {
            this.f103948w = interfaceC15237i;
        }

        @Override // androidx.compose.p018ui.input.pointer.PointerInputEventHandler
        public final Object invoke(InterfaceC34476v interfaceC34476v, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C34462h0 c34462h0 = (C34462h0) interfaceC34476v;
            c34462h0.getClass();
            Object objM46625g = AbstractC16444q3.m46625g(interfaceC34476v, new a(AbstractC0201g.m516p(c34462h0).f778Z.getTouchSlop(), this.f103948w, null), interfaceC30057d);
            return objM46625g == EnumC31071a.f128113w ? objM46625g : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: A */
    private static final void m77829A(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-314765516);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            AbstractC35684p.m113047h(AbstractC1102d.m3419p(18 * 4, C2314t.f9131w), InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC16276e.f62210d)), false, 0.0f, 0, null, null, null, null, c28655q, 6, 508);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C24965t(i13, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m77830B(int i13, Composer composer, int i14) {
        m77829A(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: C */
    private static final Modifier m77831C(Modifier modifier, InterfaceC15237i interfaceC15237i) {
        return AbstractC34452c0.m108903b(modifier, C23454a0.f92919a, new d(interfaceC15237i));
    }

    /* JADX INFO: renamed from: m */
    private static final void m77844m(String str, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(731494999);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(str) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            if (str != null) {
                c28655q.m87150e0(-696413377);
                boolean zM87157i = ((i14 & 14) == 4) | c28655q.m87157i(context) | ((i14 & 112) == 32);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == C28635l.f115821a) {
                    objM87133R = new a(context, str, interfaceC4339a, null);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, str);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-696155829);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C10965i(str, interfaceC4339a, i13, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m77845n(String str, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m77844m(str, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0125  */
    /* JADX WARN: Code duplicated, block: B:104:0x0140  */
    /* JADX WARN: Code duplicated, block: B:105:0x0142  */
    /* JADX WARN: Code duplicated, block: B:108:0x014d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:109:0x014f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0187  */
    /* JADX WARN: Code duplicated, block: B:113:0x0189  */
    /* JADX WARN: Code duplicated, block: B:116:0x0191 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:117:0x0193  */
    /* JADX WARN: Code duplicated, block: B:120:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:121:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:124:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:126:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:129:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:130:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:133:0x02d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:134:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:137:0x0312  */
    /* JADX WARN: Code duplicated, block: B:138:0x0328  */
    /* JADX WARN: Code duplicated, block: B:140:0x032f  */
    /* JADX WARN: Code duplicated, block: B:142:0x0356  */
    /* JADX WARN: Code duplicated, block: B:144:0x035e  */
    /* JADX WARN: Code duplicated, block: B:147:0x036e  */
    /* JADX WARN: Code duplicated, block: B:149:0x037c  */
    /* JADX WARN: Code duplicated, block: B:152:0x038e  */
    /* JADX WARN: Code duplicated, block: B:153:0x0390  */
    /* JADX WARN: Code duplicated, block: B:156:0x0397  */
    /* JADX WARN: Code duplicated, block: B:157:0x0399  */
    /* JADX WARN: Code duplicated, block: B:160:0x03a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:163:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:165:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:168:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:170:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:172:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:175:0x0407  */
    /* JADX WARN: Code duplicated, block: B:176:0x0409  */
    /* JADX WARN: Code duplicated, block: B:179:0x0410 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:180:0x0412  */
    /* JADX WARN: Code duplicated, block: B:186:0x0442  */
    /* JADX WARN: Code duplicated, block: B:189:0x0450  */
    /* JADX WARN: Code duplicated, block: B:192:0x042e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x009d  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:81:0x00da  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:91:0x0103  */
    /* JADX WARN: Code duplicated, block: B:94:0x0117  */
    /* JADX WARN: Code duplicated, block: B:95:0x0119  */
    /* JADX WARN: Code duplicated, block: B:98:0x0120 A[ADDED_TO_REGION] */
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
    /* JADX INFO: renamed from: o */
    public static final void m77846o(Modifier modifier, C26220e viewState, String str, String str2, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        String str3;
        int i16;
        int i17;
        int i18;
        Function1 function3;
        int i19;
        int i24;
        Function1 function4;
        int i25;
        boolean z4;
        String str4;
        String str5;
        Function1 function5;
        Function1 function6;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        String str6;
        C28676v0 c28676v0;
        Function1 function7;
        Function1 function8;
        int i26;
        boolean z13;
        Object objM87133R;
        boolean z14;
        boolean z15;
        Object objM87133R2;
        AnalyticEventModel analyticEventModelM77863b;
        boolean z16;
        boolean z17;
        Object objM87133R3;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C0209i c0209i4;
        Function1 function9;
        Function1 function10;
        boolean z18;
        Object objM87133R4;
        Function1 function11;
        boolean z19;
        int i27;
        int i28;
        Object objM74316c;
        boolean z24;
        Object objM87133R5;
        int iHashCode2;
        boolean z25;
        boolean z26;
        boolean z27;
        Object objM87133R6;
        Object objM87133R7;
        Object objM87133R8;
        char c3;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-808446698);
        int i29 = i14 & 1;
        if (i29 != 0) {
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
        int i34 = i14 & 4;
        if (i34 == 0) {
            if ((i13 & 384) == 0) {
                str3 = str;
                i15 |= c28655q.m87153g(str3) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    if (c28655q.m87153g(str2)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 16;
                if (i18 != 0) {
                    if ((i13 & 24576) == 0) {
                        function3 = function1;
                        if (c28655q.m87157i(function3)) {
                            i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i19;
                    }
                    i24 = i14 & 32;
                    if (i24 != 0) {
                        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                        function4 = function2;
                    } else {
                        function4 = function2;
                        if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                            if (c28655q.m87157i(function4)) {
                                i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                            } else {
                                i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                            }
                            i15 |= i25;
                        }
                    }
                    if ((i15 & 74899) != 74898) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z4)) {
                        c2314t = C2314t.f9131w;
                        if (i29 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i34 != 0) {
                            str6 = "";
                        } else {
                            str6 = str3;
                        }
                        String str7 = i16 == 0 ? str2 : "";
                        c28676v0 = C28635l.f115821a;
                        if (i18 != 0) {
                            objM87133R8 = c28655q.m87133R();
                            if (objM87133R8 == c28676v0) {
                                objM87133R8 = new C26009o(16);
                                c28655q.m87172p0(objM87133R8);
                            }
                            function7 = (Function1) objM87133R8;
                        } else {
                            function7 = function3;
                        }
                        if (i24 != 0) {
                            objM87133R7 = c28655q.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = new C26009o(17);
                                c28655q.m87172p0(objM87133R7);
                            }
                            function8 = (Function1) objM87133R7;
                        } else {
                            function8 = function4;
                        }
                        InterfaceC15237i interfaceC15237i = (InterfaceC15237i) c28655q.m87161k(AbstractC2453v1.f9570i);
                        String strM77862a = viewState.getActionError();
                        i26 = 458752 & i15;
                        if (i26 == 131072) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objM87133R = c28655q.m87133R();
                        if (z13 || objM87133R == c28676v0) {
                            objM87133R = new C26222g(function8, 1);
                            c28655q.m87172p0(objM87133R);
                        }
                        m77844m(strM77862a, (InterfaceC4339a) objM87133R, c28655q, 0);
                        GenericInteraction genericInteractionM77864c = viewState.getInteraction();
                        boolean zM87157i = c28655q.m87157i(viewState);
                        if (i26 == 131072) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = zM87157i | z14;
                        objM87133R2 = c28655q.m87133R();
                        String str8 = str7;
                        if (z15 || objM87133R2 == c28676v0) {
                            objM87133R2 = new b(viewState, function8, null);
                            c28655q.m87172p0(objM87133R2);
                        }
                        GenericInteraction.Companion companion = GenericInteraction.INSTANCE;
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, genericInteractionM77864c);
                        analyticEventModelM77863b = viewState.getAnalyticEvent();
                        Object[] objArr = {viewState.m77865d(), analyticEventModelM77863b, Boolean.valueOf(viewState.getIsLoading()), Boolean.valueOf(viewState.getIsError())};
                        boolean zM87157i2 = c28655q.m87157i(viewState) | c28655q.m87157i(analyticEventModelM77863b);
                        if (i26 == 131072) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        z17 = zM87157i2 | z16;
                        objM87133R3 = c28655q.m87133R();
                        if (z17 || objM87133R3 == c28676v0) {
                            objM87133R3 = new c(viewState, analyticEventModelM77863b, function8, null);
                            c28655q.m87172p0(objM87133R3);
                        }
                        AbstractC28683x.m87256j(objArr, (InterfaceC4351m) objM87133R3, c28655q);
                        Modifier modifierM77831C = m77831C(AbstractC1102d.m3409f(1.0f, modifier2), interfaceC15237i);
                        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                        Modifier modifier3 = modifier2;
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM77831C);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        c0209i = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
                        c0209i2 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
                        c0209i3 = C0217k.f732j;
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                        }
                        c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                        function9 = function7;
                        Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, ((float) 1.5d) * 8, 7);
                        TextResource textResourceM21278l = AbstractC8693b.m21278l(str8);
                        TextResource textResourceM77868g = viewState.getSearchPlaceHolderText();
                        C38072d c38072d = C38072d.f163053a;
                        long jM125385c1 = c38072d.m121949b(c28655q, 6).getWhite70();
                        C15043i8 c15043i8 = C15043i8.f56313a;
                        function10 = function8;
                        C15197y1 c15197y1M43130h = C15043i8.m43130h(c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, c38072d.m121949b(c28655q, 6).getBlack30(), c38072d.m121949b(c28655q, 6).getBrandWhite(), c38072d.m121949b(c28655q, 6).getBrandWhite(), c38072d.m121949b(c28655q, 6).getWhite20(), c38072d.m121949b(c28655q, 6).getWhite20(), 0L, c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, 0L, 0L, 0L, c28655q, 2096770);
                        if ((57344 & i15) == 16384) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        objM87133R4 = c28655q.m87133R();
                        if (z18 || objM87133R4 == c28676v0) {
                            objM87133R4 = new C26216a(function9, 0);
                            c28655q.m87172p0(objM87133R4);
                        }
                        AbstractC17795v0.m51127j(modifierM3398t, textResourceM21278l, textResourceM77868g, null, jM125385c1, 0, false, c15197y1M43130h, 0L, true, null, false, false, null, (Function1) objM87133R4, c28655q, 805306374, 0, 15720);
                        c28655q = c28655q;
                        if (viewState.getIsLoading()) {
                            c28655q.m87150e0(1090562795);
                            m77856y(viewState.getLoadingHintText(), c28655q, 0);
                            c28655q.m87173q(false);
                            function11 = function10;
                            z19 = true;
                        } else if (viewState.getIsError()) {
                            c28655q.m87150e0(1090710758);
                            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                            iHashCode2 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
                            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                            C12611c c12611cM35368c = C12612d.f43056a.m35368c();
                            if (i26 == 131072) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                            if ((i15 & 896) == 256) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                            z27 = z26 | z25;
                            objM87133R6 = c28655q.m87133R();
                            if (!z27 || objM87133R6 == c28676v0) {
                                function11 = function10;
                                objM87133R6 = new C4048j0(function11, str6, 7);
                                c28655q.m87172p0(objM87133R6);
                            } else {
                                function11 = function10;
                            }
                            AbstractC12610b.m35349f(c12611cM35368c, null, (InterfaceC4339a) objM87133R6, c28655q, 6, 2);
                            z19 = true;
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        } else {
                            function11 = function10;
                            z19 = true;
                            c3 = 1;
                            c28655q.m87150e0(1091091624);
                            i27 = 0;
                            for (Object obj : viewState.m77865d()) {
                                i28 = i27 + 1;
                                if (i27 >= 0) {
                                    AbstractC37056f.m118977d0();
                                    throw null;
                                }
                                C25306o c25306o = (C25306o) obj;
                                objM74316c = c25306o.m74316c();
                                if (objM74316c == null) {
                                    objM74316c = Integer.valueOf(i27);
                                }
                                c28655q.m87144b0(-1326473244, objM74316c);
                                C15786e c15786e = new C15786e(26);
                                if (i26 == 131072) {
                                    z24 = true;
                                } else {
                                    z24 = false;
                                }
                                objM87133R5 = c28655q.m87133R();
                                if (z24 || objM87133R5 == c28676v0) {
                                    objM87133R5 = new C26216a(function11, c3 == true ? 1 : 0);
                                    c28655q.m87172p0(objM87133R5);
                                }
                                Function1 function12 = (Function1) objM87133R5;
                                C28655q c28655q2 = c28655q;
                                AbstractC25303l.m74290q(c25306o, null, c15786e, function12, c28655q2, 0, 2);
                                c28655q = c28655q2;
                                c28655q.m87173q(false);
                                i27 = i28;
                            }
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z19);
                        function5 = function11;
                        str5 = str6;
                        function6 = function9;
                        modifier2 = modifier3;
                        str4 = str8;
                    } else {
                        c28655q.m87138X();
                        str4 = str2;
                        str5 = str3;
                        function5 = function4;
                        function6 = function3;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C2165f(modifier2, viewState, str5, str4, function6, function5, i13, i14);
                    }
                }
                i15 |= 24576;
                function3 = function1;
                i24 = i14 & 32;
                if (i24 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    function4 = function2;
                } else {
                    function4 = function2;
                    if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q.m87157i(function4)) {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i25;
                    }
                }
                if ((i15 & 74899) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i29 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i34 != 0) {
                        str6 = "";
                    } else {
                        str6 = str3;
                    }
                    if (i16 == 0) {
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C26009o(16);
                            c28655q.m87172p0(objM87133R8);
                        }
                        function7 = (Function1) objM87133R8;
                    } else {
                        function7 = function3;
                    }
                    if (i24 != 0) {
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C26009o(17);
                            c28655q.m87172p0(objM87133R7);
                        }
                        function8 = (Function1) objM87133R7;
                    } else {
                        function8 = function4;
                    }
                    InterfaceC15237i interfaceC15237i2 = (InterfaceC15237i) c28655q.m87161k(AbstractC2453v1.f9570i);
                    String strM77862a2 = viewState.getActionError();
                    i26 = 458752 & i15;
                    if (i26 == 131072) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z13) {
                        objM87133R = new C26222g(function8, 1);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C26222g(function8, 1);
                        c28655q.m87172p0(objM87133R);
                    }
                    m77844m(strM77862a2, (InterfaceC4339a) objM87133R, c28655q, 0);
                    GenericInteraction genericInteractionM77864c2 = viewState.getInteraction();
                    boolean zM87157i3 = c28655q.m87157i(viewState);
                    if (i26 == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = zM87157i3 | z14;
                    objM87133R2 = c28655q.m87133R();
                    String str9 = str7;
                    if (z15) {
                        objM87133R2 = new b(viewState, function8, null);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new b(viewState, function8, null);
                        c28655q.m87172p0(objM87133R2);
                    }
                    GenericInteraction.Companion companion2 = GenericInteraction.INSTANCE;
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, genericInteractionM77864c2);
                    analyticEventModelM77863b = viewState.getAnalyticEvent();
                    Object[] objArr2 = {viewState.m77865d(), analyticEventModelM77863b, Boolean.valueOf(viewState.getIsLoading()), Boolean.valueOf(viewState.getIsError())};
                    boolean zM87157i4 = c28655q.m87157i(viewState) | c28655q.m87157i(analyticEventModelM77863b);
                    if (i26 == 131072) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = zM87157i4 | z16;
                    objM87133R3 = c28655q.m87133R();
                    if (z17) {
                        objM87133R3 = new c(viewState, analyticEventModelM77863b, function8, null);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new c(viewState, analyticEventModelM77863b, function8, null);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC28683x.m87256j(objArr2, (InterfaceC4351m) objM87133R3, c28655q);
                    Modifier modifierM77831C2 = m77831C(AbstractC1102d.m3409f(1.0f, modifier2), interfaceC15237i2);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    Modifier modifier4 = modifier2;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM77831C2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                    c0209i3 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                    function9 = function7;
                    Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, ((float) 1.5d) * 8, 7);
                    TextResource textResourceM21278l2 = AbstractC8693b.m21278l(str9);
                    TextResource textResourceM77868g2 = viewState.getSearchPlaceHolderText();
                    C38072d c38072d2 = C38072d.f163053a;
                    long jM125385c2 = c38072d2.m121949b(c28655q, 6).getWhite70();
                    C15043i8 c15043i9 = C15043i8.f56313a;
                    function10 = function8;
                    C15197y1 c15197y1M43130h2 = C15043i8.m43130h(c38072d2.m121949b(c28655q, 6).getBrandWhite(), 0L, c38072d2.m121949b(c28655q, 6).getBlack30(), c38072d2.m121949b(c28655q, 6).getBrandWhite(), c38072d2.m121949b(c28655q, 6).getBrandWhite(), c38072d2.m121949b(c28655q, 6).getWhite20(), c38072d2.m121949b(c28655q, 6).getWhite20(), 0L, c38072d2.m121949b(c28655q, 6).getAccentAlert(), 0L, 0L, 0L, 0L, c28655q, 2096770);
                    if ((57344 & i15) == 16384) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objM87133R4 = c28655q.m87133R();
                    if (z18) {
                        objM87133R4 = new C26216a(function9, 0);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C26216a(function9, 0);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC17795v0.m51127j(modifierM3398t2, textResourceM21278l2, textResourceM77868g2, null, jM125385c2, 0, false, c15197y1M43130h2, 0L, true, null, false, false, null, (Function1) objM87133R4, c28655q, 805306374, 0, 15720);
                    c28655q = c28655q;
                    if (viewState.getIsLoading()) {
                        c28655q.m87150e0(1090562795);
                        m77856y(viewState.getLoadingHintText(), c28655q, 0);
                        c28655q.m87173q(false);
                        function11 = function10;
                        z19 = true;
                    } else if (viewState.getIsError()) {
                        c28655q.m87150e0(1090710758);
                        Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                        InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                        Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d2);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m4);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
                        C12611c c12611cM35368c2 = C12612d.f43056a.m35368c();
                        if (i26 == 131072) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        if ((i15 & 896) == 256) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        z27 = z26 | z25;
                        objM87133R6 = c28655q.m87133R();
                        if (z27) {
                            function11 = function10;
                            objM87133R6 = new C4048j0(function11, str6, 7);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            function11 = function10;
                            objM87133R6 = new C4048j0(function11, str6, 7);
                            c28655q.m87172p0(objM87133R6);
                        }
                        AbstractC12610b.m35349f(c12611cM35368c2, null, (InterfaceC4339a) objM87133R6, c28655q, 6, 2);
                        z19 = true;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    } else {
                        function11 = function10;
                        z19 = true;
                        c3 = 1;
                        c28655q.m87150e0(1091091624);
                        i27 = 0;
                        while (r1.hasNext()) {
                            i28 = i27 + 1;
                            if (i27 >= 0) {
                                AbstractC37056f.m118977d0();
                                throw null;
                            }
                            C25306o c25306o2 = (C25306o) obj;
                            objM74316c = c25306o2.m74316c();
                            if (objM74316c == null) {
                                objM74316c = Integer.valueOf(i27);
                            }
                            c28655q.m87144b0(-1326473244, objM74316c);
                            C15786e c15786e2 = new C15786e(26);
                            if (i26 == 131072) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            objM87133R5 = c28655q.m87133R();
                            if (z24) {
                                objM87133R5 = new C26216a(function11, c3 == true ? 1 : 0);
                                c28655q.m87172p0(objM87133R5);
                            } else {
                                objM87133R5 = new C26216a(function11, c3 == true ? 1 : 0);
                                c28655q.m87172p0(objM87133R5);
                            }
                            Function1 function13 = (Function1) objM87133R5;
                            C28655q c28655q3 = c28655q;
                            AbstractC25303l.m74290q(c25306o2, null, c15786e2, function13, c28655q3, 0, 2);
                            c28655q = c28655q3;
                            c28655q.m87173q(false);
                            i27 = i28;
                        }
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z19);
                    function5 = function11;
                    str5 = str6;
                    function6 = function9;
                    modifier2 = modifier4;
                    str4 = str9;
                } else {
                    c28655q.m87138X();
                    str4 = str2;
                    str5 = str3;
                    function5 = function4;
                    function6 = function3;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2165f(modifier2, viewState, str5, str4, function6, function5, i13, i14);
                }
            }
            i15 |= 3072;
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    function3 = function1;
                    if (c28655q.m87157i(function3)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 32;
                if (i24 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    function4 = function2;
                } else {
                    function4 = function2;
                    if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q.m87157i(function4)) {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i25;
                    }
                }
                if ((i15 & 74899) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i29 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i34 != 0) {
                        str6 = "";
                    } else {
                        str6 = str3;
                    }
                    if (i16 == 0) {
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C26009o(16);
                            c28655q.m87172p0(objM87133R8);
                        }
                        function7 = (Function1) objM87133R8;
                    } else {
                        function7 = function3;
                    }
                    if (i24 != 0) {
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C26009o(17);
                            c28655q.m87172p0(objM87133R7);
                        }
                        function8 = (Function1) objM87133R7;
                    } else {
                        function8 = function4;
                    }
                    InterfaceC15237i interfaceC15237i3 = (InterfaceC15237i) c28655q.m87161k(AbstractC2453v1.f9570i);
                    String strM77862a3 = viewState.getActionError();
                    i26 = 458752 & i15;
                    if (i26 == 131072) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z13) {
                        objM87133R = new C26222g(function8, 1);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C26222g(function8, 1);
                        c28655q.m87172p0(objM87133R);
                    }
                    m77844m(strM77862a3, (InterfaceC4339a) objM87133R, c28655q, 0);
                    GenericInteraction genericInteractionM77864c3 = viewState.getInteraction();
                    boolean zM87157i5 = c28655q.m87157i(viewState);
                    if (i26 == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = zM87157i5 | z14;
                    objM87133R2 = c28655q.m87133R();
                    String str10 = str7;
                    if (z15) {
                        objM87133R2 = new b(viewState, function8, null);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new b(viewState, function8, null);
                        c28655q.m87172p0(objM87133R2);
                    }
                    GenericInteraction.Companion companion3 = GenericInteraction.INSTANCE;
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, genericInteractionM77864c3);
                    analyticEventModelM77863b = viewState.getAnalyticEvent();
                    Object[] objArr3 = {viewState.m77865d(), analyticEventModelM77863b, Boolean.valueOf(viewState.getIsLoading()), Boolean.valueOf(viewState.getIsError())};
                    boolean zM87157i6 = c28655q.m87157i(viewState) | c28655q.m87157i(analyticEventModelM77863b);
                    if (i26 == 131072) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = zM87157i6 | z16;
                    objM87133R3 = c28655q.m87133R();
                    if (z17) {
                        objM87133R3 = new c(viewState, analyticEventModelM77863b, function8, null);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new c(viewState, analyticEventModelM77863b, function8, null);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC28683x.m87256j(objArr3, (InterfaceC4351m) objM87133R3, c28655q);
                    Modifier modifierM77831C3 = m77831C(AbstractC1102d.m3409f(1.0f, modifier2), interfaceC15237i3);
                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    Modifier modifier5 = modifier2;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM77831C3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a3);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m5);
                    c0209i3 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N5);
                    function9 = function7;
                    Modifier modifierM3398t3 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, ((float) 1.5d) * 8, 7);
                    TextResource textResourceM21278l3 = AbstractC8693b.m21278l(str10);
                    TextResource textResourceM77868g3 = viewState.getSearchPlaceHolderText();
                    C38072d c38072d3 = C38072d.f163053a;
                    long jM125385c3 = c38072d3.m121949b(c28655q, 6).getWhite70();
                    C15043i8 c15043i10 = C15043i8.f56313a;
                    function10 = function8;
                    C15197y1 c15197y1M43130h3 = C15043i8.m43130h(c38072d3.m121949b(c28655q, 6).getBrandWhite(), 0L, c38072d3.m121949b(c28655q, 6).getBlack30(), c38072d3.m121949b(c28655q, 6).getBrandWhite(), c38072d3.m121949b(c28655q, 6).getBrandWhite(), c38072d3.m121949b(c28655q, 6).getWhite20(), c38072d3.m121949b(c28655q, 6).getWhite20(), 0L, c38072d3.m121949b(c28655q, 6).getAccentAlert(), 0L, 0L, 0L, 0L, c28655q, 2096770);
                    if ((57344 & i15) == 16384) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objM87133R4 = c28655q.m87133R();
                    if (z18) {
                        objM87133R4 = new C26216a(function9, 0);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C26216a(function9, 0);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC17795v0.m51127j(modifierM3398t3, textResourceM21278l3, textResourceM77868g3, null, jM125385c3, 0, false, c15197y1M43130h3, 0L, true, null, false, false, null, (Function1) objM87133R4, c28655q, 805306374, 0, 15720);
                    c28655q = c28655q;
                    if (viewState.getIsLoading()) {
                        c28655q.m87150e0(1090562795);
                        m77856y(viewState.getLoadingHintText(), c28655q, 0);
                        c28655q.m87173q(false);
                        function11 = function10;
                        z19 = true;
                    } else if (viewState.getIsError()) {
                        c28655q.m87150e0(1090710758);
                        Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                        InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                        Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3409f3);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d3);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m6);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N6);
                        C12611c c12611cM35368c3 = C12612d.f43056a.m35368c();
                        if (i26 == 131072) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        if ((i15 & 896) == 256) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        z27 = z26 | z25;
                        objM87133R6 = c28655q.m87133R();
                        if (z27) {
                            function11 = function10;
                            objM87133R6 = new C4048j0(function11, str6, 7);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            function11 = function10;
                            objM87133R6 = new C4048j0(function11, str6, 7);
                            c28655q.m87172p0(objM87133R6);
                        }
                        AbstractC12610b.m35349f(c12611cM35368c3, null, (InterfaceC4339a) objM87133R6, c28655q, 6, 2);
                        z19 = true;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    } else {
                        function11 = function10;
                        z19 = true;
                        c3 = 1;
                        c28655q.m87150e0(1091091624);
                        i27 = 0;
                        while (r1.hasNext()) {
                            i28 = i27 + 1;
                            if (i27 >= 0) {
                                AbstractC37056f.m118977d0();
                                throw null;
                            }
                            C25306o c25306o3 = (C25306o) obj;
                            objM74316c = c25306o3.m74316c();
                            if (objM74316c == null) {
                                objM74316c = Integer.valueOf(i27);
                            }
                            c28655q.m87144b0(-1326473244, objM74316c);
                            C15786e c15786e3 = new C15786e(26);
                            if (i26 == 131072) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            objM87133R5 = c28655q.m87133R();
                            if (z24) {
                                objM87133R5 = new C26216a(function11, c3 == true ? 1 : 0);
                                c28655q.m87172p0(objM87133R5);
                            } else {
                                objM87133R5 = new C26216a(function11, c3 == true ? 1 : 0);
                                c28655q.m87172p0(objM87133R5);
                            }
                            Function1 function14 = (Function1) objM87133R5;
                            C28655q c28655q4 = c28655q;
                            AbstractC25303l.m74290q(c25306o3, null, c15786e3, function14, c28655q4, 0, 2);
                            c28655q = c28655q4;
                            c28655q.m87173q(false);
                            i27 = i28;
                        }
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z19);
                    function5 = function11;
                    str5 = str6;
                    function6 = function9;
                    modifier2 = modifier5;
                    str4 = str10;
                } else {
                    c28655q.m87138X();
                    str4 = str2;
                    str5 = str3;
                    function5 = function4;
                    function6 = function3;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2165f(modifier2, viewState, str5, str4, function6, function5, i13, i14);
                }
            }
            i15 |= 24576;
            function3 = function1;
            i24 = i14 & 32;
            if (i24 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                function4 = function2;
            } else {
                function4 = function2;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87157i(function4)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i25;
                }
            }
            if ((i15 & 74899) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i29 != 0) {
                    modifier2 = c2314t;
                }
                if (i34 != 0) {
                    str6 = "";
                } else {
                    str6 = str3;
                }
                if (i16 == 0) {
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C26009o(16);
                        c28655q.m87172p0(objM87133R8);
                    }
                    function7 = (Function1) objM87133R8;
                } else {
                    function7 = function3;
                }
                if (i24 != 0) {
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C26009o(17);
                        c28655q.m87172p0(objM87133R7);
                    }
                    function8 = (Function1) objM87133R7;
                } else {
                    function8 = function4;
                }
                InterfaceC15237i interfaceC15237i4 = (InterfaceC15237i) c28655q.m87161k(AbstractC2453v1.f9570i);
                String strM77862a4 = viewState.getActionError();
                i26 = 458752 & i15;
                if (i26 == 131072) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13) {
                    objM87133R = new C26222g(function8, 1);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C26222g(function8, 1);
                    c28655q.m87172p0(objM87133R);
                }
                m77844m(strM77862a4, (InterfaceC4339a) objM87133R, c28655q, 0);
                GenericInteraction genericInteractionM77864c4 = viewState.getInteraction();
                boolean zM87157i7 = c28655q.m87157i(viewState);
                if (i26 == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = zM87157i7 | z14;
                objM87133R2 = c28655q.m87133R();
                String str11 = str7;
                if (z15) {
                    objM87133R2 = new b(viewState, function8, null);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new b(viewState, function8, null);
                    c28655q.m87172p0(objM87133R2);
                }
                GenericInteraction.Companion companion4 = GenericInteraction.INSTANCE;
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, genericInteractionM77864c4);
                analyticEventModelM77863b = viewState.getAnalyticEvent();
                Object[] objArr4 = {viewState.m77865d(), analyticEventModelM77863b, Boolean.valueOf(viewState.getIsLoading()), Boolean.valueOf(viewState.getIsError())};
                boolean zM87157i8 = c28655q.m87157i(viewState) | c28655q.m87157i(analyticEventModelM77863b);
                if (i26 == 131072) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = zM87157i8 | z16;
                objM87133R3 = c28655q.m87133R();
                if (z17) {
                    objM87133R3 = new c(viewState, analyticEventModelM77863b, function8, null);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new c(viewState, analyticEventModelM77863b, function8, null);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87256j(objArr4, (InterfaceC4351m) objM87133R3, c28655q);
                Modifier modifierM77831C4 = m77831C(AbstractC1102d.m3409f(1.0f, modifier2), interfaceC15237i4);
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                Modifier modifier6 = modifier2;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM77831C4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a4);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m7);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N7);
                function9 = function7;
                Modifier modifierM3398t4 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, ((float) 1.5d) * 8, 7);
                TextResource textResourceM21278l4 = AbstractC8693b.m21278l(str11);
                TextResource textResourceM77868g4 = viewState.getSearchPlaceHolderText();
                C38072d c38072d4 = C38072d.f163053a;
                long jM125385c4 = c38072d4.m121949b(c28655q, 6).getWhite70();
                C15043i8 c15043i11 = C15043i8.f56313a;
                function10 = function8;
                C15197y1 c15197y1M43130h4 = C15043i8.m43130h(c38072d4.m121949b(c28655q, 6).getBrandWhite(), 0L, c38072d4.m121949b(c28655q, 6).getBlack30(), c38072d4.m121949b(c28655q, 6).getBrandWhite(), c38072d4.m121949b(c28655q, 6).getBrandWhite(), c38072d4.m121949b(c28655q, 6).getWhite20(), c38072d4.m121949b(c28655q, 6).getWhite20(), 0L, c38072d4.m121949b(c28655q, 6).getAccentAlert(), 0L, 0L, 0L, 0L, c28655q, 2096770);
                if ((57344 & i15) == 16384) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objM87133R4 = c28655q.m87133R();
                if (z18) {
                    objM87133R4 = new C26216a(function9, 0);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C26216a(function9, 0);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC17795v0.m51127j(modifierM3398t4, textResourceM21278l4, textResourceM77868g4, null, jM125385c4, 0, false, c15197y1M43130h4, 0L, true, null, false, false, null, (Function1) objM87133R4, c28655q, 805306374, 0, 15720);
                c28655q = c28655q;
                if (viewState.getIsLoading()) {
                    c28655q.m87150e0(1090562795);
                    m77856y(viewState.getLoadingHintText(), c28655q, 0);
                    c28655q.m87173q(false);
                    function11 = function10;
                    z19 = true;
                } else if (viewState.getIsError()) {
                    c28655q.m87150e0(1090710758);
                    Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t);
                    InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3409f4);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d4);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m8);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N8);
                    C12611c c12611cM35368c4 = C12612d.f43056a.m35368c();
                    if (i26 == 131072) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    if ((i15 & 896) == 256) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    z27 = z26 | z25;
                    objM87133R6 = c28655q.m87133R();
                    if (z27) {
                        function11 = function10;
                        objM87133R6 = new C4048j0(function11, str6, 7);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        function11 = function10;
                        objM87133R6 = new C4048j0(function11, str6, 7);
                        c28655q.m87172p0(objM87133R6);
                    }
                    AbstractC12610b.m35349f(c12611cM35368c4, null, (InterfaceC4339a) objM87133R6, c28655q, 6, 2);
                    z19 = true;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else {
                    function11 = function10;
                    z19 = true;
                    c3 = 1;
                    c28655q.m87150e0(1091091624);
                    i27 = 0;
                    while (r1.hasNext()) {
                        i28 = i27 + 1;
                        if (i27 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        C25306o c25306o4 = (C25306o) obj;
                        objM74316c = c25306o4.m74316c();
                        if (objM74316c == null) {
                            objM74316c = Integer.valueOf(i27);
                        }
                        c28655q.m87144b0(-1326473244, objM74316c);
                        C15786e c15786e4 = new C15786e(26);
                        if (i26 == 131072) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        objM87133R5 = c28655q.m87133R();
                        if (z24) {
                            objM87133R5 = new C26216a(function11, c3 == true ? 1 : 0);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new C26216a(function11, c3 == true ? 1 : 0);
                            c28655q.m87172p0(objM87133R5);
                        }
                        Function1 function15 = (Function1) objM87133R5;
                        C28655q c28655q5 = c28655q;
                        AbstractC25303l.m74290q(c25306o4, null, c15786e4, function15, c28655q5, 0, 2);
                        c28655q = c28655q5;
                        c28655q.m87173q(false);
                        i27 = i28;
                    }
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z19);
                function5 = function11;
                str5 = str6;
                function6 = function9;
                modifier2 = modifier6;
                str4 = str11;
            } else {
                c28655q.m87138X();
                str4 = str2;
                str5 = str3;
                function5 = function4;
                function6 = function3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2165f(modifier2, viewState, str5, str4, function6, function5, i13, i14);
            }
        }
        i15 |= 384;
        str3 = str;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                if (c28655q.m87153g(str2)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    function3 = function1;
                    if (c28655q.m87157i(function3)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 32;
                if (i24 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    function4 = function2;
                } else {
                    function4 = function2;
                    if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q.m87157i(function4)) {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i25;
                    }
                }
                if ((i15 & 74899) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i29 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i34 != 0) {
                        str6 = "";
                    } else {
                        str6 = str3;
                    }
                    if (i16 == 0) {
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C26009o(16);
                            c28655q.m87172p0(objM87133R8);
                        }
                        function7 = (Function1) objM87133R8;
                    } else {
                        function7 = function3;
                    }
                    if (i24 != 0) {
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C26009o(17);
                            c28655q.m87172p0(objM87133R7);
                        }
                        function8 = (Function1) objM87133R7;
                    } else {
                        function8 = function4;
                    }
                    InterfaceC15237i interfaceC15237i5 = (InterfaceC15237i) c28655q.m87161k(AbstractC2453v1.f9570i);
                    String strM77862a5 = viewState.getActionError();
                    i26 = 458752 & i15;
                    if (i26 == 131072) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z13) {
                        objM87133R = new C26222g(function8, 1);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C26222g(function8, 1);
                        c28655q.m87172p0(objM87133R);
                    }
                    m77844m(strM77862a5, (InterfaceC4339a) objM87133R, c28655q, 0);
                    GenericInteraction genericInteractionM77864c5 = viewState.getInteraction();
                    boolean zM87157i9 = c28655q.m87157i(viewState);
                    if (i26 == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = zM87157i9 | z14;
                    objM87133R2 = c28655q.m87133R();
                    String str12 = str7;
                    if (z15) {
                        objM87133R2 = new b(viewState, function8, null);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new b(viewState, function8, null);
                        c28655q.m87172p0(objM87133R2);
                    }
                    GenericInteraction.Companion companion5 = GenericInteraction.INSTANCE;
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, genericInteractionM77864c5);
                    analyticEventModelM77863b = viewState.getAnalyticEvent();
                    Object[] objArr5 = {viewState.m77865d(), analyticEventModelM77863b, Boolean.valueOf(viewState.getIsLoading()), Boolean.valueOf(viewState.getIsError())};
                    boolean zM87157i10 = c28655q.m87157i(viewState) | c28655q.m87157i(analyticEventModelM77863b);
                    if (i26 == 131072) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = zM87157i10 | z16;
                    objM87133R3 = c28655q.m87133R();
                    if (z17) {
                        objM87133R3 = new c(viewState, analyticEventModelM77863b, function8, null);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new c(viewState, analyticEventModelM77863b, function8, null);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC28683x.m87256j(objArr5, (InterfaceC4351m) objM87133R3, c28655q);
                    Modifier modifierM77831C5 = m77831C(AbstractC1102d.m3409f(1.0f, modifier2), interfaceC15237i5);
                    C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    Modifier modifier7 = modifier2;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                    Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM77831C5);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a5);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m9);
                    c0209i3 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N9);
                    function9 = function7;
                    Modifier modifierM3398t5 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, ((float) 1.5d) * 8, 7);
                    TextResource textResourceM21278l5 = AbstractC8693b.m21278l(str12);
                    TextResource textResourceM77868g5 = viewState.getSearchPlaceHolderText();
                    C38072d c38072d5 = C38072d.f163053a;
                    long jM125385c5 = c38072d5.m121949b(c28655q, 6).getWhite70();
                    C15043i8 c15043i12 = C15043i8.f56313a;
                    function10 = function8;
                    C15197y1 c15197y1M43130h5 = C15043i8.m43130h(c38072d5.m121949b(c28655q, 6).getBrandWhite(), 0L, c38072d5.m121949b(c28655q, 6).getBlack30(), c38072d5.m121949b(c28655q, 6).getBrandWhite(), c38072d5.m121949b(c28655q, 6).getBrandWhite(), c38072d5.m121949b(c28655q, 6).getWhite20(), c38072d5.m121949b(c28655q, 6).getWhite20(), 0L, c38072d5.m121949b(c28655q, 6).getAccentAlert(), 0L, 0L, 0L, 0L, c28655q, 2096770);
                    if ((57344 & i15) == 16384) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objM87133R4 = c28655q.m87133R();
                    if (z18) {
                        objM87133R4 = new C26216a(function9, 0);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C26216a(function9, 0);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC17795v0.m51127j(modifierM3398t5, textResourceM21278l5, textResourceM77868g5, null, jM125385c5, 0, false, c15197y1M43130h5, 0L, true, null, false, false, null, (Function1) objM87133R4, c28655q, 805306374, 0, 15720);
                    c28655q = c28655q;
                    if (viewState.getIsLoading()) {
                        c28655q.m87150e0(1090562795);
                        m77856y(viewState.getLoadingHintText(), c28655q, 0);
                        c28655q.m87173q(false);
                        function11 = function10;
                        z19 = true;
                    } else if (viewState.getIsError()) {
                        c28655q.m87150e0(1090710758);
                        Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, c2314t);
                        InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                        Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM3409f5);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d5);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m10);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N10);
                        C12611c c12611cM35368c5 = C12612d.f43056a.m35368c();
                        if (i26 == 131072) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        if ((i15 & 896) == 256) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        z27 = z26 | z25;
                        objM87133R6 = c28655q.m87133R();
                        if (z27) {
                            function11 = function10;
                            objM87133R6 = new C4048j0(function11, str6, 7);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            function11 = function10;
                            objM87133R6 = new C4048j0(function11, str6, 7);
                            c28655q.m87172p0(objM87133R6);
                        }
                        AbstractC12610b.m35349f(c12611cM35368c5, null, (InterfaceC4339a) objM87133R6, c28655q, 6, 2);
                        z19 = true;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    } else {
                        function11 = function10;
                        z19 = true;
                        c3 = 1;
                        c28655q.m87150e0(1091091624);
                        i27 = 0;
                        while (r1.hasNext()) {
                            i28 = i27 + 1;
                            if (i27 >= 0) {
                                AbstractC37056f.m118977d0();
                                throw null;
                            }
                            C25306o c25306o5 = (C25306o) obj;
                            objM74316c = c25306o5.m74316c();
                            if (objM74316c == null) {
                                objM74316c = Integer.valueOf(i27);
                            }
                            c28655q.m87144b0(-1326473244, objM74316c);
                            C15786e c15786e5 = new C15786e(26);
                            if (i26 == 131072) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            objM87133R5 = c28655q.m87133R();
                            if (z24) {
                                objM87133R5 = new C26216a(function11, c3 == true ? 1 : 0);
                                c28655q.m87172p0(objM87133R5);
                            } else {
                                objM87133R5 = new C26216a(function11, c3 == true ? 1 : 0);
                                c28655q.m87172p0(objM87133R5);
                            }
                            Function1 function16 = (Function1) objM87133R5;
                            C28655q c28655q6 = c28655q;
                            AbstractC25303l.m74290q(c25306o5, null, c15786e5, function16, c28655q6, 0, 2);
                            c28655q = c28655q6;
                            c28655q.m87173q(false);
                            i27 = i28;
                        }
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z19);
                    function5 = function11;
                    str5 = str6;
                    function6 = function9;
                    modifier2 = modifier7;
                    str4 = str12;
                } else {
                    c28655q.m87138X();
                    str4 = str2;
                    str5 = str3;
                    function5 = function4;
                    function6 = function3;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2165f(modifier2, viewState, str5, str4, function6, function5, i13, i14);
                }
            }
            i15 |= 24576;
            function3 = function1;
            i24 = i14 & 32;
            if (i24 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                function4 = function2;
            } else {
                function4 = function2;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87157i(function4)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i25;
                }
            }
            if ((i15 & 74899) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i29 != 0) {
                    modifier2 = c2314t;
                }
                if (i34 != 0) {
                    str6 = "";
                } else {
                    str6 = str3;
                }
                if (i16 == 0) {
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C26009o(16);
                        c28655q.m87172p0(objM87133R8);
                    }
                    function7 = (Function1) objM87133R8;
                } else {
                    function7 = function3;
                }
                if (i24 != 0) {
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C26009o(17);
                        c28655q.m87172p0(objM87133R7);
                    }
                    function8 = (Function1) objM87133R7;
                } else {
                    function8 = function4;
                }
                InterfaceC15237i interfaceC15237i6 = (InterfaceC15237i) c28655q.m87161k(AbstractC2453v1.f9570i);
                String strM77862a6 = viewState.getActionError();
                i26 = 458752 & i15;
                if (i26 == 131072) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13) {
                    objM87133R = new C26222g(function8, 1);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C26222g(function8, 1);
                    c28655q.m87172p0(objM87133R);
                }
                m77844m(strM77862a6, (InterfaceC4339a) objM87133R, c28655q, 0);
                GenericInteraction genericInteractionM77864c6 = viewState.getInteraction();
                boolean zM87157i11 = c28655q.m87157i(viewState);
                if (i26 == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = zM87157i11 | z14;
                objM87133R2 = c28655q.m87133R();
                String str13 = str7;
                if (z15) {
                    objM87133R2 = new b(viewState, function8, null);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new b(viewState, function8, null);
                    c28655q.m87172p0(objM87133R2);
                }
                GenericInteraction.Companion companion6 = GenericInteraction.INSTANCE;
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, genericInteractionM77864c6);
                analyticEventModelM77863b = viewState.getAnalyticEvent();
                Object[] objArr6 = {viewState.m77865d(), analyticEventModelM77863b, Boolean.valueOf(viewState.getIsLoading()), Boolean.valueOf(viewState.getIsError())};
                boolean zM87157i12 = c28655q.m87157i(viewState) | c28655q.m87157i(analyticEventModelM77863b);
                if (i26 == 131072) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = zM87157i12 | z16;
                objM87133R3 = c28655q.m87133R();
                if (z17) {
                    objM87133R3 = new c(viewState, analyticEventModelM77863b, function8, null);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new c(viewState, analyticEventModelM77863b, function8, null);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87256j(objArr6, (InterfaceC4351m) objM87133R3, c28655q);
                Modifier modifierM77831C6 = m77831C(AbstractC1102d.m3409f(1.0f, modifier2), interfaceC15237i6);
                C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                Modifier modifier8 = modifier2;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, modifierM77831C6);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a6);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m11);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N11);
                function9 = function7;
                Modifier modifierM3398t6 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, ((float) 1.5d) * 8, 7);
                TextResource textResourceM21278l6 = AbstractC8693b.m21278l(str13);
                TextResource textResourceM77868g6 = viewState.getSearchPlaceHolderText();
                C38072d c38072d6 = C38072d.f163053a;
                long jM125385c6 = c38072d6.m121949b(c28655q, 6).getWhite70();
                C15043i8 c15043i13 = C15043i8.f56313a;
                function10 = function8;
                C15197y1 c15197y1M43130h6 = C15043i8.m43130h(c38072d6.m121949b(c28655q, 6).getBrandWhite(), 0L, c38072d6.m121949b(c28655q, 6).getBlack30(), c38072d6.m121949b(c28655q, 6).getBrandWhite(), c38072d6.m121949b(c28655q, 6).getBrandWhite(), c38072d6.m121949b(c28655q, 6).getWhite20(), c38072d6.m121949b(c28655q, 6).getWhite20(), 0L, c38072d6.m121949b(c28655q, 6).getAccentAlert(), 0L, 0L, 0L, 0L, c28655q, 2096770);
                if ((57344 & i15) == 16384) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objM87133R4 = c28655q.m87133R();
                if (z18) {
                    objM87133R4 = new C26216a(function9, 0);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C26216a(function9, 0);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC17795v0.m51127j(modifierM3398t6, textResourceM21278l6, textResourceM77868g6, null, jM125385c6, 0, false, c15197y1M43130h6, 0L, true, null, false, false, null, (Function1) objM87133R4, c28655q, 805306374, 0, 15720);
                c28655q = c28655q;
                if (viewState.getIsLoading()) {
                    c28655q.m87150e0(1090562795);
                    m77856y(viewState.getLoadingHintText(), c28655q, 0);
                    c28655q.m87173q(false);
                    function11 = function10;
                    z19 = true;
                } else if (viewState.getIsError()) {
                    c28655q.m87150e0(1090710758);
                    Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, c2314t);
                    InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                    Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM3409f6);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d6);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m12);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N12);
                    C12611c c12611cM35368c6 = C12612d.f43056a.m35368c();
                    if (i26 == 131072) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    if ((i15 & 896) == 256) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    z27 = z26 | z25;
                    objM87133R6 = c28655q.m87133R();
                    if (z27) {
                        function11 = function10;
                        objM87133R6 = new C4048j0(function11, str6, 7);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        function11 = function10;
                        objM87133R6 = new C4048j0(function11, str6, 7);
                        c28655q.m87172p0(objM87133R6);
                    }
                    AbstractC12610b.m35349f(c12611cM35368c6, null, (InterfaceC4339a) objM87133R6, c28655q, 6, 2);
                    z19 = true;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else {
                    function11 = function10;
                    z19 = true;
                    c3 = 1;
                    c28655q.m87150e0(1091091624);
                    i27 = 0;
                    while (r1.hasNext()) {
                        i28 = i27 + 1;
                        if (i27 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        C25306o c25306o6 = (C25306o) obj;
                        objM74316c = c25306o6.m74316c();
                        if (objM74316c == null) {
                            objM74316c = Integer.valueOf(i27);
                        }
                        c28655q.m87144b0(-1326473244, objM74316c);
                        C15786e c15786e6 = new C15786e(26);
                        if (i26 == 131072) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        objM87133R5 = c28655q.m87133R();
                        if (z24) {
                            objM87133R5 = new C26216a(function11, c3 == true ? 1 : 0);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new C26216a(function11, c3 == true ? 1 : 0);
                            c28655q.m87172p0(objM87133R5);
                        }
                        Function1 function17 = (Function1) objM87133R5;
                        C28655q c28655q7 = c28655q;
                        AbstractC25303l.m74290q(c25306o6, null, c15786e6, function17, c28655q7, 0, 2);
                        c28655q = c28655q7;
                        c28655q.m87173q(false);
                        i27 = i28;
                    }
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z19);
                function5 = function11;
                str5 = str6;
                function6 = function9;
                modifier2 = modifier8;
                str4 = str13;
            } else {
                c28655q.m87138X();
                str4 = str2;
                str5 = str3;
                function5 = function4;
                function6 = function3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2165f(modifier2, viewState, str5, str4, function6, function5, i13, i14);
            }
        }
        i15 |= 3072;
        i18 = i14 & 16;
        if (i18 != 0) {
            if ((i13 & 24576) == 0) {
                function3 = function1;
                if (c28655q.m87157i(function3)) {
                    i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i19;
            }
            i24 = i14 & 32;
            if (i24 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                function4 = function2;
            } else {
                function4 = function2;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87157i(function4)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i25;
                }
            }
            if ((i15 & 74899) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i29 != 0) {
                    modifier2 = c2314t;
                }
                if (i34 != 0) {
                    str6 = "";
                } else {
                    str6 = str3;
                }
                if (i16 == 0) {
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C26009o(16);
                        c28655q.m87172p0(objM87133R8);
                    }
                    function7 = (Function1) objM87133R8;
                } else {
                    function7 = function3;
                }
                if (i24 != 0) {
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C26009o(17);
                        c28655q.m87172p0(objM87133R7);
                    }
                    function8 = (Function1) objM87133R7;
                } else {
                    function8 = function4;
                }
                InterfaceC15237i interfaceC15237i7 = (InterfaceC15237i) c28655q.m87161k(AbstractC2453v1.f9570i);
                String strM77862a7 = viewState.getActionError();
                i26 = 458752 & i15;
                if (i26 == 131072) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13) {
                    objM87133R = new C26222g(function8, 1);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C26222g(function8, 1);
                    c28655q.m87172p0(objM87133R);
                }
                m77844m(strM77862a7, (InterfaceC4339a) objM87133R, c28655q, 0);
                GenericInteraction genericInteractionM77864c7 = viewState.getInteraction();
                boolean zM87157i13 = c28655q.m87157i(viewState);
                if (i26 == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = zM87157i13 | z14;
                objM87133R2 = c28655q.m87133R();
                String str14 = str7;
                if (z15) {
                    objM87133R2 = new b(viewState, function8, null);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new b(viewState, function8, null);
                    c28655q.m87172p0(objM87133R2);
                }
                GenericInteraction.Companion companion7 = GenericInteraction.INSTANCE;
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, genericInteractionM77864c7);
                analyticEventModelM77863b = viewState.getAnalyticEvent();
                Object[] objArr7 = {viewState.m77865d(), analyticEventModelM77863b, Boolean.valueOf(viewState.getIsLoading()), Boolean.valueOf(viewState.getIsError())};
                boolean zM87157i14 = c28655q.m87157i(viewState) | c28655q.m87157i(analyticEventModelM77863b);
                if (i26 == 131072) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = zM87157i14 | z16;
                objM87133R3 = c28655q.m87133R();
                if (z17) {
                    objM87133R3 = new c(viewState, analyticEventModelM77863b, function8, null);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new c(viewState, analyticEventModelM77863b, function8, null);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87256j(objArr7, (InterfaceC4351m) objM87133R3, c28655q);
                Modifier modifierM77831C7 = m77831C(AbstractC1102d.m3409f(1.0f, modifier2), interfaceC15237i7);
                C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                Modifier modifier9 = modifier2;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
                Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, modifierM77831C7);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a7);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m13);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N13);
                function9 = function7;
                Modifier modifierM3398t7 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, ((float) 1.5d) * 8, 7);
                TextResource textResourceM21278l7 = AbstractC8693b.m21278l(str14);
                TextResource textResourceM77868g7 = viewState.getSearchPlaceHolderText();
                C38072d c38072d7 = C38072d.f163053a;
                long jM125385c7 = c38072d7.m121949b(c28655q, 6).getWhite70();
                C15043i8 c15043i14 = C15043i8.f56313a;
                function10 = function8;
                C15197y1 c15197y1M43130h7 = C15043i8.m43130h(c38072d7.m121949b(c28655q, 6).getBrandWhite(), 0L, c38072d7.m121949b(c28655q, 6).getBlack30(), c38072d7.m121949b(c28655q, 6).getBrandWhite(), c38072d7.m121949b(c28655q, 6).getBrandWhite(), c38072d7.m121949b(c28655q, 6).getWhite20(), c38072d7.m121949b(c28655q, 6).getWhite20(), 0L, c38072d7.m121949b(c28655q, 6).getAccentAlert(), 0L, 0L, 0L, 0L, c28655q, 2096770);
                if ((57344 & i15) == 16384) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objM87133R4 = c28655q.m87133R();
                if (z18) {
                    objM87133R4 = new C26216a(function9, 0);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C26216a(function9, 0);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC17795v0.m51127j(modifierM3398t7, textResourceM21278l7, textResourceM77868g7, null, jM125385c7, 0, false, c15197y1M43130h7, 0L, true, null, false, false, null, (Function1) objM87133R4, c28655q, 805306374, 0, 15720);
                c28655q = c28655q;
                if (viewState.getIsLoading()) {
                    c28655q.m87150e0(1090562795);
                    m77856y(viewState.getLoadingHintText(), c28655q, 0);
                    c28655q.m87173q(false);
                    function11 = function10;
                    z19 = true;
                } else if (viewState.getIsError()) {
                    c28655q.m87150e0(1090710758);
                    Modifier modifierM3409f7 = AbstractC1102d.m3409f(1.0f, c2314t);
                    InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
                    Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, modifierM3409f7);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d7);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m14);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N14);
                    C12611c c12611cM35368c7 = C12612d.f43056a.m35368c();
                    if (i26 == 131072) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    if ((i15 & 896) == 256) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    z27 = z26 | z25;
                    objM87133R6 = c28655q.m87133R();
                    if (z27) {
                        function11 = function10;
                        objM87133R6 = new C4048j0(function11, str6, 7);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        function11 = function10;
                        objM87133R6 = new C4048j0(function11, str6, 7);
                        c28655q.m87172p0(objM87133R6);
                    }
                    AbstractC12610b.m35349f(c12611cM35368c7, null, (InterfaceC4339a) objM87133R6, c28655q, 6, 2);
                    z19 = true;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else {
                    function11 = function10;
                    z19 = true;
                    c3 = 1;
                    c28655q.m87150e0(1091091624);
                    i27 = 0;
                    while (r1.hasNext()) {
                        i28 = i27 + 1;
                        if (i27 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        C25306o c25306o7 = (C25306o) obj;
                        objM74316c = c25306o7.m74316c();
                        if (objM74316c == null) {
                            objM74316c = Integer.valueOf(i27);
                        }
                        c28655q.m87144b0(-1326473244, objM74316c);
                        C15786e c15786e7 = new C15786e(26);
                        if (i26 == 131072) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        objM87133R5 = c28655q.m87133R();
                        if (z24) {
                            objM87133R5 = new C26216a(function11, c3 == true ? 1 : 0);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new C26216a(function11, c3 == true ? 1 : 0);
                            c28655q.m87172p0(objM87133R5);
                        }
                        Function1 function18 = (Function1) objM87133R5;
                        C28655q c28655q8 = c28655q;
                        AbstractC25303l.m74290q(c25306o7, null, c15786e7, function18, c28655q8, 0, 2);
                        c28655q = c28655q8;
                        c28655q.m87173q(false);
                        i27 = i28;
                    }
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z19);
                function5 = function11;
                str5 = str6;
                function6 = function9;
                modifier2 = modifier9;
                str4 = str14;
            } else {
                c28655q.m87138X();
                str4 = str2;
                str5 = str3;
                function5 = function4;
                function6 = function3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2165f(modifier2, viewState, str5, str4, function6, function5, i13, i14);
            }
        }
        i15 |= 24576;
        function3 = function1;
        i24 = i14 & 32;
        if (i24 != 0) {
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            function4 = function2;
        } else {
            function4 = function2;
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q.m87157i(function4)) {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i25;
            }
        }
        if ((i15 & 74899) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i29 != 0) {
                modifier2 = c2314t;
            }
            if (i34 != 0) {
                str6 = "";
            } else {
                str6 = str3;
            }
            if (i16 == 0) {
            }
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R8 = c28655q.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = new C26009o(16);
                    c28655q.m87172p0(objM87133R8);
                }
                function7 = (Function1) objM87133R8;
            } else {
                function7 = function3;
            }
            if (i24 != 0) {
                objM87133R7 = c28655q.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C26009o(17);
                    c28655q.m87172p0(objM87133R7);
                }
                function8 = (Function1) objM87133R7;
            } else {
                function8 = function4;
            }
            InterfaceC15237i interfaceC15237i8 = (InterfaceC15237i) c28655q.m87161k(AbstractC2453v1.f9570i);
            String strM77862a8 = viewState.getActionError();
            i26 = 458752 & i15;
            if (i26 == 131072) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R = c28655q.m87133R();
            if (z13) {
                objM87133R = new C26222g(function8, 1);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C26222g(function8, 1);
                c28655q.m87172p0(objM87133R);
            }
            m77844m(strM77862a8, (InterfaceC4339a) objM87133R, c28655q, 0);
            GenericInteraction genericInteractionM77864c8 = viewState.getInteraction();
            boolean zM87157i15 = c28655q.m87157i(viewState);
            if (i26 == 131072) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = zM87157i15 | z14;
            objM87133R2 = c28655q.m87133R();
            String str15 = str7;
            if (z15) {
                objM87133R2 = new b(viewState, function8, null);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new b(viewState, function8, null);
                c28655q.m87172p0(objM87133R2);
            }
            GenericInteraction.Companion companion8 = GenericInteraction.INSTANCE;
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, genericInteractionM77864c8);
            analyticEventModelM77863b = viewState.getAnalyticEvent();
            Object[] objArr8 = {viewState.m77865d(), analyticEventModelM77863b, Boolean.valueOf(viewState.getIsLoading()), Boolean.valueOf(viewState.getIsError())};
            boolean zM87157i16 = c28655q.m87157i(viewState) | c28655q.m87157i(analyticEventModelM77863b);
            if (i26 == 131072) {
                z16 = true;
            } else {
                z16 = false;
            }
            z17 = zM87157i16 | z16;
            objM87133R3 = c28655q.m87133R();
            if (z17) {
                objM87133R3 = new c(viewState, analyticEventModelM77863b, function8, null);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new c(viewState, analyticEventModelM77863b, function8, null);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC28683x.m87256j(objArr8, (InterfaceC4351m) objM87133R3, c28655q);
            Modifier modifierM77831C8 = m77831C(AbstractC1102d.m3409f(1.0f, modifier2), interfaceC15237i8);
            C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            Modifier modifier10 = modifier2;
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
            Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, modifierM77831C8);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a8);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m15);
            c0209i3 = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N15);
            function9 = function7;
            Modifier modifierM3398t8 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, ((float) 1.5d) * 8, 7);
            TextResource textResourceM21278l8 = AbstractC8693b.m21278l(str15);
            TextResource textResourceM77868g8 = viewState.getSearchPlaceHolderText();
            C38072d c38072d8 = C38072d.f163053a;
            long jM125385c8 = c38072d8.m121949b(c28655q, 6).getWhite70();
            C15043i8 c15043i15 = C15043i8.f56313a;
            function10 = function8;
            C15197y1 c15197y1M43130h8 = C15043i8.m43130h(c38072d8.m121949b(c28655q, 6).getBrandWhite(), 0L, c38072d8.m121949b(c28655q, 6).getBlack30(), c38072d8.m121949b(c28655q, 6).getBrandWhite(), c38072d8.m121949b(c28655q, 6).getBrandWhite(), c38072d8.m121949b(c28655q, 6).getWhite20(), c38072d8.m121949b(c28655q, 6).getWhite20(), 0L, c38072d8.m121949b(c28655q, 6).getAccentAlert(), 0L, 0L, 0L, 0L, c28655q, 2096770);
            if ((57344 & i15) == 16384) {
                z18 = true;
            } else {
                z18 = false;
            }
            objM87133R4 = c28655q.m87133R();
            if (z18) {
                objM87133R4 = new C26216a(function9, 0);
                c28655q.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new C26216a(function9, 0);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC17795v0.m51127j(modifierM3398t8, textResourceM21278l8, textResourceM77868g8, null, jM125385c8, 0, false, c15197y1M43130h8, 0L, true, null, false, false, null, (Function1) objM87133R4, c28655q, 805306374, 0, 15720);
            c28655q = c28655q;
            if (viewState.getIsLoading()) {
                c28655q.m87150e0(1090562795);
                m77856y(viewState.getLoadingHintText(), c28655q, 0);
                c28655q.m87173q(false);
                function11 = function10;
                z19 = true;
            } else if (viewState.getIsError()) {
                c28655q.m87150e0(1090710758);
                Modifier modifierM3409f8 = AbstractC1102d.m3409f(1.0f, c2314t);
                InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q.m87165m();
                Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q, modifierM3409f8);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d8);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m16);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N16);
                C12611c c12611cM35368c8 = C12612d.f43056a.m35368c();
                if (i26 == 131072) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                if ((i15 & 896) == 256) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                z27 = z26 | z25;
                objM87133R6 = c28655q.m87133R();
                if (z27) {
                    function11 = function10;
                    objM87133R6 = new C4048j0(function11, str6, 7);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    function11 = function10;
                    objM87133R6 = new C4048j0(function11, str6, 7);
                    c28655q.m87172p0(objM87133R6);
                }
                AbstractC12610b.m35349f(c12611cM35368c8, null, (InterfaceC4339a) objM87133R6, c28655q, 6, 2);
                z19 = true;
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            } else {
                function11 = function10;
                z19 = true;
                c3 = 1;
                c28655q.m87150e0(1091091624);
                i27 = 0;
                while (r1.hasNext()) {
                    i28 = i27 + 1;
                    if (i27 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    C25306o c25306o8 = (C25306o) obj;
                    objM74316c = c25306o8.m74316c();
                    if (objM74316c == null) {
                        objM74316c = Integer.valueOf(i27);
                    }
                    c28655q.m87144b0(-1326473244, objM74316c);
                    C15786e c15786e8 = new C15786e(26);
                    if (i26 == 131072) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    objM87133R5 = c28655q.m87133R();
                    if (z24) {
                        objM87133R5 = new C26216a(function11, c3 == true ? 1 : 0);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new C26216a(function11, c3 == true ? 1 : 0);
                        c28655q.m87172p0(objM87133R5);
                    }
                    Function1 function19 = (Function1) objM87133R5;
                    C28655q c28655q9 = c28655q;
                    AbstractC25303l.m74290q(c25306o8, null, c15786e8, function19, c28655q9, 0, 2);
                    c28655q = c28655q9;
                    c28655q.m87173q(false);
                    i27 = i28;
                }
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z19);
            function5 = function11;
            str5 = str6;
            function6 = function9;
            modifier2 = modifier10;
            str4 = str15;
        } else {
            c28655q.m87138X();
            str4 = str2;
            str5 = str3;
            function5 = function4;
            function6 = function3;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2165f(modifier2, viewState, str5, str4, function6, function5, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m77847p(String it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m77848q(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m77849r(Function1 function1) {
        function1.invoke(AbstractC26218c.b.f103956a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m77850s(Function1 function1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC17801x0.a) {
            function1.invoke("");
        } else if (event instanceof AbstractC17801x0.c) {
            function1.invoke(((AbstractC17801x0.c) event).getNewText());
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m77851t(Function1 function1, String str) {
        function1.invoke(new AbstractC26218c.d(str));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final Modifier m77852u(InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(1764558194);
        float f13 = ((float) 1.5d) * 8;
        Modifier modifierM3398t = AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, f13, 0.0f, f13, 5);
        c28655q.m87173q(false);
        return modifierM3398t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m77853v(Function1 function1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof DesignItemInteraction) {
            AbstractC25300i.m74263a((DesignItemInteraction) event, function1, new C26009o(18));
        } else if (event instanceof Action) {
            function1.invoke(new AbstractC26218c.c((Action) event));
        } else {
            function1.invoke(event);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final Object m77854w(Action it) {
        AbstractC22676k.m65750j(it, "it");
        return new AbstractC26218c.c(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m77855x(Modifier modifier, C26220e c26220e, String str, String str2, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m77846o(modifier, c26220e, str, str2, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: y */
    private static final void m77856y(TextResource textResource, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1147858210);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(textResource) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 4;
            float f14 = 8;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 25 * f13, 0.0f, 6 * f14, 5);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
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
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            C23010x c23010xM73381n = AbstractC25012a.m73381n(f13, f14, C2299e.f9111N, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM73381n);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            m77829A(c28655q, 0);
            if (textResource == null) {
                c28655q.m87150e0(-1719603378);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1719603377);
                String strM21274h = AbstractC8693b.m21274h(textResource, c28655q, 0);
                C38072d c38072d = C38072d.f163053a;
                AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, 6).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB1(), null, c28655q, 0, 0, 196090);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3428b1(textResource, i13, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m77857z(TextResource textResource, int i13, Composer composer, int i14) {
        m77856y(textResource, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
