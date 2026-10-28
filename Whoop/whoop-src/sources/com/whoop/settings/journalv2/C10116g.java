package com.whoop.settings.journalv2;

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
import li0.AbstractC24099a;
import or2.C28180m;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: com.whoop.settings.journalv2.g */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, m65681d2 = {"Lcom/whoop/settings/journalv2/g;", "Landroidx/lifecycle/w1;", "Lcom/whoop/settings/journalv2/b;", "interactor", "Lcom/whoop/settings/journalv2/i;", "viewStateReducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Lcom/whoop/settings/journalv2/b;Lcom/whoop/settings/journalv2/i;Lbc3/c0;)V", "Lcom/whoop/settings/journalv2/f;", "viewEvent", "Lcom/whoop/settings/journalv2/d;", "n", "(Lcom/whoop/settings/journalv2/f;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/settings/journalv2/a;", "p", "(Lcom/whoop/settings/journalv2/f;)Lcom/whoop/settings/journalv2/a;", "Lbc3/k1;", "o", "(Lcom/whoop/settings/journalv2/f;)Lbc3/k1;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lcom/whoop/settings/journalv2/b;", "x", "Lcom/whoop/settings/journalv2/i;", "Lec3/o1;", "y", "Lec3/o1;", "eventFlow", "Lec3/l;", "Lcom/whoop/settings/journalv2/h;", "z", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C10116g extends AbstractC1637w1 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C10111b interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C10118i viewStateReducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: com.whoop.settings.journalv2.g$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.journalv2.JournalSettingsViewModelV2$sendViewEvent$1", m100430f = "JournalSettingsViewModelV2.kt", m100431l = {30, 32}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f30443w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC10115f f30444x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C10116g f30445y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC10115f abstractC10115f, C10116g c10116g, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f30444x = abstractC10115f;
            this.f30445y = c10116g;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f30444x, this.f30445y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
        
            if (r5.emit(r1, r4) == r0) goto L17;
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
                int r1 = r4.f30443w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                p505ts.AbstractC34132o.m107864I(r5)
                goto L47
            L10:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L18:
                p505ts.AbstractC34132o.m107864I(r5)
                goto L36
            L1c:
                p505ts.AbstractC34132o.m107864I(r5)
                com.whoop.settings.journalv2.f r5 = r4.f30444x
                boolean r5 = r5 instanceof com.whoop.settings.journalv2.AbstractC10115f.a
                if (r5 == 0) goto L36
                com.whoop.settings.journalv2.g r5 = r4.f30445y
                ec3.o1 r5 = com.whoop.settings.journalv2.C10116g.m25483g(r5)
                com.whoop.settings.journalv2.f$d r1 = com.whoop.settings.journalv2.AbstractC10115f.d.f30438a
                r4.f30443w = r3
                java.lang.Object r5 = r5.emit(r1, r4)
                if (r5 != r0) goto L36
                goto L46
            L36:
                com.whoop.settings.journalv2.g r5 = r4.f30445y
                ec3.o1 r5 = com.whoop.settings.journalv2.C10116g.m25483g(r5)
                com.whoop.settings.journalv2.f r1 = r4.f30444x
                r4.f30443w = r2
                java.lang.Object r5 = r5.emit(r1, r4)
                if (r5 != r0) goto L47
            L46:
                return r0
            L47:
                l83.a0 r5 = l83.C23454a0.f92919a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.settings.journalv2.C10116g.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.journalv2.g$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f30446w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C10116g f30447x;

        /* JADX INFO: renamed from: com.whoop.settings.journalv2.g$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f30448w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C10116g f30449x;

            /* JADX INFO: renamed from: com.whoop.settings.journalv2.g$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.settings.journalv2.JournalSettingsViewModelV2$special$$inlined$map$1$2", m100430f = "JournalSettingsViewModelV2.kt", m100431l = {51, 50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41416a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f30450E;

                /* JADX INFO: renamed from: F */
                Object f30451F;

                /* JADX INFO: renamed from: G */
                Object f30452G;

                /* JADX INFO: renamed from: H */
                Object f30453H;

                /* JADX INFO: renamed from: I */
                Object f30454I;

                /* JADX INFO: renamed from: J */
                Object f30455J;

                /* JADX INFO: renamed from: K */
                Object f30456K;

                /* JADX INFO: renamed from: L */
                int f30457L;

                /* JADX INFO: renamed from: M */
                int f30458M;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f30459w;

                /* JADX INFO: renamed from: x */
                int f30460x;

                /* JADX INFO: renamed from: y */
                Object f30461y;

                public C41416a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f30459w = obj;
                    this.f30460x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C10116g c10116g) {
                this.f30448w = interfaceC13062m;
                this.f30449x = c10116g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x00a8, code lost:
            
                if (r4.emit(r10, r0) == r1) goto L22;
             */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r9, q83.InterfaceC30057d r10) {
                /*
                    r8 = this;
                    boolean r0 = r10 instanceof com.whoop.settings.journalv2.C10116g.b.a.C41416a
                    if (r0 == 0) goto L13
                    r0 = r10
                    com.whoop.settings.journalv2.g$b$a$a r0 = (com.whoop.settings.journalv2.C10116g.b.a.C41416a) r0
                    int r1 = r0.f30460x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f30460x = r1
                    goto L18
                L13:
                    com.whoop.settings.journalv2.g$b$a$a r0 = new com.whoop.settings.journalv2.g$b$a$a
                    r0.<init>(r10)
                L18:
                    java.lang.Object r10 = r0.f30459w
                    r83.a r1 = r83.EnumC31071a.f128113w
                    int r2 = r0.f30460x
                    r3 = 2
                    r4 = 1
                    r5 = 0
                    if (r2 == 0) goto L5a
                    if (r2 == r4) goto L3c
                    if (r2 != r3) goto L34
                    java.lang.Object r9 = r0.f30452G
                    ec3.m r9 = (ec3.InterfaceC13062m) r9
                    java.lang.Object r9 = r0.f30450E
                    com.whoop.settings.journalv2.g$b$a$a r9 = (com.whoop.settings.journalv2.C10116g.b.a.C41416a) r9
                    p505ts.AbstractC34132o.m107864I(r10)
                    goto Lab
                L34:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r10)
                    throw r9
                L3c:
                    int r9 = r0.f30457L
                    java.lang.Object r2 = r0.f30456K
                    com.whoop.settings.journalv2.i r2 = (com.whoop.settings.journalv2.C10118i) r2
                    java.lang.Object r4 = r0.f30455J
                    com.whoop.settings.journalv2.f r4 = (com.whoop.settings.journalv2.AbstractC10115f) r4
                    java.lang.Object r4 = r0.f30454I
                    q83.d r4 = (q83.InterfaceC30057d) r4
                    java.lang.Object r4 = r0.f30453H
                    ec3.m r4 = (ec3.InterfaceC13062m) r4
                    java.lang.Object r6 = r0.f30452G
                    ec3.m r6 = (ec3.InterfaceC13062m) r6
                    java.lang.Object r6 = r0.f30450E
                    com.whoop.settings.journalv2.g$b$a$a r6 = (com.whoop.settings.journalv2.C10116g.b.a.C41416a) r6
                    p505ts.AbstractC34132o.m107864I(r10)
                    goto L8a
                L5a:
                    p505ts.AbstractC34132o.m107864I(r10)
                    ec3.m r10 = r8.f30448w
                    com.whoop.settings.journalv2.f r9 = (com.whoop.settings.journalv2.AbstractC10115f) r9
                    com.whoop.settings.journalv2.g r2 = r8.f30449x
                    com.whoop.settings.journalv2.i r2 = com.whoop.settings.journalv2.C10116g.m25484j(r2)
                    com.whoop.settings.journalv2.g r6 = r8.f30449x
                    r0.f30461y = r5
                    r0.f30450E = r5
                    r0.f30451F = r5
                    r0.f30452G = r5
                    r0.f30453H = r10
                    r0.f30454I = r5
                    r0.f30455J = r5
                    r0.f30456K = r2
                    r7 = 0
                    r0.f30457L = r7
                    r0.f30458M = r7
                    r0.f30460x = r4
                    java.lang.Object r9 = com.whoop.settings.journalv2.C10116g.m25485l(r6, r9, r0)
                    if (r9 != r1) goto L87
                    goto Laa
                L87:
                    r4 = r10
                    r10 = r9
                    r9 = r7
                L8a:
                    com.whoop.settings.journalv2.d r10 = (com.whoop.settings.journalv2.InterfaceC10113d) r10
                    com.whoop.settings.journalv2.h r10 = r2.m25495d(r10)
                    r0.f30461y = r5
                    r0.f30450E = r5
                    r0.f30451F = r5
                    r0.f30452G = r5
                    r0.f30453H = r5
                    r0.f30454I = r5
                    r0.f30455J = r5
                    r0.f30456K = r5
                    r0.f30457L = r9
                    r0.f30460x = r3
                    java.lang.Object r9 = r4.emit(r10, r0)
                    if (r9 != r1) goto Lab
                Laa:
                    return r1
                Lab:
                    l83.a0 r9 = l83.C23454a0.f92919a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: com.whoop.settings.journalv2.C10116g.b.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        public b(InterfaceC13058l interfaceC13058l, C10116g c10116g) {
            this.f30446w = interfaceC13058l;
            this.f30447x = c10116g;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f30446w.collect(new a(interfaceC13062m, this.f30447x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10116g(C10111b interactor, C10118i viewStateReducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(viewStateReducer, "viewStateReducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.interactor = interactor;
        this.viewStateReducer = viewStateReducer;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        this.viewState = AbstractC13091v.m36586L(new b(AbstractC24099a.m71009a(c13096w1M36592b, AbstractC10115f.c.f30437a), this), AbstractC1640x1.m5043b(this), C13105z1.f45288a, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final Object m25486n(AbstractC10115f abstractC10115f, InterfaceC30057d<? super InterfaceC10113d> interfaceC30057d) {
        return this.interactor.m25445h(m25487p(abstractC10115f), interfaceC30057d);
    }

    /* JADX INFO: renamed from: p */
    private final AbstractC10110a m25487p(AbstractC10115f viewEvent) {
        if (viewEvent instanceof AbstractC10115f.a) {
            return new AbstractC10110a.d(((AbstractC10115f.a) viewEvent).getIsJournalEnabled());
        }
        if (viewEvent instanceof AbstractC10115f.d) {
            return AbstractC10110a.b.f30398a;
        }
        if (viewEvent instanceof AbstractC10115f.b) {
            return new AbstractC10110a.c(((AbstractC10115f.b) viewEvent).getIsDismissEnabled());
        }
        if (viewEvent instanceof AbstractC10115f.c) {
            return AbstractC10110a.a.f30397a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: o */
    public final InterfaceC3027k1 m25488o(AbstractC10115f viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        return AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new a(viewEvent, this, null), 3);
    }

    public /* synthetic */ C10116g(C10111b c10111b, C10118i c10118i, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c10111b, c10118i, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
