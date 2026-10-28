package ov1;

import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.AbstractC1640x1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import lv1.AbstractC24760a;
import lv1.C24762c;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: ov1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m65681d2 = {"Lov1/b;", "Landroidx/lifecycle/w1;", "Llv1/c;", "interactor", "<init>", "(Llv1/c;)V", "Lov1/a;", "viewEvent", "Llv1/a;", "o", "(Lov1/a;)Llv1/a;", "Lbc3/k1;", "n", "(Lov1/a;)Lbc3/k1;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Llv1/c;", "Lec3/o1;", "x", "Lec3/o1;", "eventFlow", "Lec3/l;", "Lcom/whoop/memberdataexport/models/MemberDataExportModel;", "y", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "member-data-export_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28396b extends AbstractC1637w1 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C24762c interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: ov1.b$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.memberdataexport.viewmodels.MemberDataExportViewModel$sendViewEvent$1", m100430f = "MemberDataExportViewModel.kt", m100431l = {26}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f114569w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC28395a f114571y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC28395a abstractC28395a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f114571y = abstractC28395a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C28396b.this.new a(this.f114571y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f114569w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C28396b.this.eventFlow;
                AbstractC28395a abstractC28395a = this.f114571y;
                this.f114569w = 1;
                if (interfaceC13072o1.emit(abstractC28395a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: ov1.b$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f114572w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C28396b f114573x;

        /* JADX INFO: renamed from: ov1.b$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f114574w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C28396b f114575x;

            /* JADX INFO: renamed from: ov1.b$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.memberdataexport.viewmodels.MemberDataExportViewModel$special$$inlined$map$1$2", m100430f = "MemberDataExportViewModel.kt", m100431l = {51, 50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42145a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f114576E;

                /* JADX INFO: renamed from: F */
                Object f114577F;

                /* JADX INFO: renamed from: G */
                Object f114578G;

                /* JADX INFO: renamed from: H */
                Object f114579H;

                /* JADX INFO: renamed from: I */
                Object f114580I;

                /* JADX INFO: renamed from: J */
                Object f114581J;

                /* JADX INFO: renamed from: K */
                int f114582K;

                /* JADX INFO: renamed from: L */
                int f114583L;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f114584w;

                /* JADX INFO: renamed from: x */
                int f114585x;

                /* JADX INFO: renamed from: y */
                Object f114586y;

                public C42145a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f114584w = obj;
                    this.f114585x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C28396b c28396b) {
                this.f114574w = interfaceC13062m;
                this.f114575x = c28396b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x009b, code lost:
            
                if (r2.emit(r9, r0) == r1) goto L22;
             */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r8, q83.InterfaceC30057d r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof ov1.C28396b.b.a.C42145a
                    if (r0 == 0) goto L13
                    r0 = r9
                    ov1.b$b$a$a r0 = (ov1.C28396b.b.a.C42145a) r0
                    int r1 = r0.f114585x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f114585x = r1
                    goto L18
                L13:
                    ov1.b$b$a$a r0 = new ov1.b$b$a$a
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f114584w
                    r83.a r1 = r83.EnumC31071a.f128113w
                    int r2 = r0.f114585x
                    r3 = 2
                    r4 = 1
                    r5 = 0
                    if (r2 == 0) goto L55
                    if (r2 == r4) goto L3b
                    if (r2 != r3) goto L33
                    java.lang.Object r8 = r0.f114578G
                    ec3.m r8 = (ec3.InterfaceC13062m) r8
                    java.lang.Object r8 = r0.f114576E
                    ov1.b$b$a$a r8 = (ov1.C28396b.b.a.C42145a) r8
                    p505ts.AbstractC34132o.m107864I(r9)
                    goto L9e
                L33:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3b:
                    int r8 = r0.f114582K
                    java.lang.Object r2 = r0.f114581J
                    ov1.a r2 = (ov1.AbstractC28395a) r2
                    java.lang.Object r2 = r0.f114580I
                    q83.d r2 = (q83.InterfaceC30057d) r2
                    java.lang.Object r2 = r0.f114579H
                    ec3.m r2 = (ec3.InterfaceC13062m) r2
                    java.lang.Object r4 = r0.f114578G
                    ec3.m r4 = (ec3.InterfaceC13062m) r4
                    java.lang.Object r4 = r0.f114576E
                    ov1.b$b$a$a r4 = (ov1.C28396b.b.a.C42145a) r4
                    p505ts.AbstractC34132o.m107864I(r9)
                    goto L85
                L55:
                    p505ts.AbstractC34132o.m107864I(r9)
                    ec3.m r2 = r7.f114574w
                    ov1.a r8 = (ov1.AbstractC28395a) r8
                    ov1.b r9 = r7.f114575x
                    lv1.c r9 = ov1.C28396b.m86086j(r9)
                    ov1.b r6 = r7.f114575x
                    lv1.a r8 = ov1.C28396b.m86087l(r6, r8)
                    r0.f114586y = r5
                    r0.f114576E = r5
                    r0.f114577F = r5
                    r0.f114578G = r5
                    r0.f114579H = r2
                    r0.f114580I = r5
                    r0.f114581J = r5
                    r6 = 0
                    r0.f114582K = r6
                    r0.f114583L = r6
                    r0.f114585x = r4
                    java.lang.Object r9 = r9.m72504b(r8, r0)
                    if (r9 != r1) goto L84
                    goto L9d
                L84:
                    r8 = r6
                L85:
                    r0.f114586y = r5
                    r0.f114576E = r5
                    r0.f114577F = r5
                    r0.f114578G = r5
                    r0.f114579H = r5
                    r0.f114580I = r5
                    r0.f114581J = r5
                    r0.f114582K = r8
                    r0.f114585x = r3
                    java.lang.Object r8 = r2.emit(r9, r0)
                    if (r8 != r1) goto L9e
                L9d:
                    return r1
                L9e:
                    l83.a0 r8 = l83.C23454a0.f92919a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: ov1.C28396b.b.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        public b(InterfaceC13058l interfaceC13058l, C28396b c28396b) {
            this.f114572w = interfaceC13058l;
            this.f114573x = c28396b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f114572w.collect(new a(interfaceC13062m, this.f114573x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C28396b(C24762c interactor) {
        AbstractC22676k.m65750j(interactor, "interactor");
        this.interactor = interactor;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        this.viewState = AbstractC13091v.m36586L(new b(c13096w1M36592b, this), AbstractC1640x1.m5043b(this), C13105z1.f45288a, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final AbstractC24760a m86088o(AbstractC28395a viewEvent) {
        if (viewEvent instanceof AbstractC28395a.a) {
            return AbstractC24760a.a.f96849a;
        }
        if (viewEvent instanceof AbstractC28395a.b) {
            return new AbstractC24760a.b(((AbstractC28395a.b) viewEvent).getAndroidx.core.app.NotificationCompat.CATEGORY_EMAIL java.lang.String());
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: n */
    public final InterfaceC3027k1 m86089n(AbstractC28395a viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        return AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new a(viewEvent, null), 3);
    }
}
