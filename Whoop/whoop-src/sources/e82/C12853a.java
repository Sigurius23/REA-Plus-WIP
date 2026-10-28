package e82;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import ch.C4588i;
import ci2.InterfaceC4733b;
import dc3.EnumC11916a;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13087t1;
import fc3.C14380k;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.concurrent.CancellationException;
import jk0.InterfaceC21750d;
import l83.C23454a0;
import lt0.AbstractC24726c;
import lt0.AbstractC24734k;
import lt0.C24725b;
import lt0.C24736m;
import nt0.AbstractC27120h;
import nt0.C27113a;
import nt0.C27121i;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: e82.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, m65681d2 = {"Le82/a;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lci2/b;", "whoopStrapProvider", "Lbc3/c0;", "coroutineScope", "<init>", "(Lci2/b;Lbc3/c0;)V", "Ljk0/d;", "strap", "Llt0/k;", "parsed", "Lnt0/i;", "e", "(Ljk0/d;Llt0/k;)Lnt0/i;", "Landroidx/lifecycle/g0;", "owner", "Ll83/a0;", "onCreate", "(Landroidx/lifecycle/g0;)V", "onDestroy", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lci2/b;", "x", "Lbc3/c0;", "Lec3/o1;", "y", "Lec3/o1;", "mutableFlow", "Lec3/t1;", "z", "Lec3/t1;", "d", "()Lec3/t1;", "flow", "Lbc3/k1;", "E", "Lbc3/k1;", "collectorJob", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12853a implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private InterfaceC3027k1 collectorJob;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13072o1 mutableFlow;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13087t1 flow;

    /* JADX INFO: renamed from: e82.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.sdk.realtimeStream.R10RealtimeStream$onCreate$1", m100430f = "R10RealtimeStream.kt", m100431l = {63}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f44076w;

        /* JADX INFO: renamed from: e82.a$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41513a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C12853a f44078w;

            public C41513a(C12853a c12853a) {
                this.f44078w = c12853a;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(C27121i c27121i, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                this.f44078w.mutableFlow.mo36564a(c27121i);
                return C23454a0.f92919a;
            }
        }

        /* JADX INFO: renamed from: e82.a$a$b */
        @InterfaceC32271e(m100429c = "com.whoop.sdk.realtimeStream.R10RealtimeStream$onCreate$1$invokeSuspend$$inlined$flatMapLatest$1", m100430f = "R10RealtimeStream.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements Function3 {

            /* JADX INFO: renamed from: w */
            int f44079w;

            /* JADX INFO: renamed from: x */
            private /* synthetic */ Object f44080x;

            /* JADX INFO: renamed from: y */
            /* synthetic */ Object f44081y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ C12853a f44082z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(InterfaceC30057d interfaceC30057d, C12853a c12853a) {
                super(3, interfaceC30057d);
                this.f44082z = c12853a;
            }

            public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC21750d interfaceC21750d, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                b bVar = new b(interfaceC30057d, this.f44082z);
                bVar.f44080x = interfaceC13062m;
                bVar.f44081y = interfaceC21750d;
                return bVar.invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f44079w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f44080x;
                    InterfaceC21750d interfaceC21750d = (InterfaceC21750d) this.f44081y;
                    c cVar = new c(interfaceC21750d.mo24699N(), this.f44082z, interfaceC21750d);
                    this.f44080x = null;
                    this.f44081y = null;
                    this.f44079w = 1;
                    if (AbstractC13091v.m36613w(interfaceC13062m, cVar, this) == enumC31071a) {
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

            @Override // p715kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((InterfaceC13062m) obj, (InterfaceC21750d) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
            }
        }

        /* JADX INFO: renamed from: e82.a$a$c */
        @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class c implements InterfaceC13058l {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13058l f44083w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C12853a f44084x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC21750d f44085y;

            /* JADX INFO: renamed from: e82.a$a$c$a, reason: collision with other inner class name */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41514a<T> implements InterfaceC13062m {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ InterfaceC13062m f44086w;

                /* JADX INFO: renamed from: x */
                final /* synthetic */ C12853a f44087x;

                /* JADX INFO: renamed from: y */
                final /* synthetic */ InterfaceC21750d f44088y;

                /* JADX INFO: renamed from: e82.a$a$c$a$a, reason: collision with other inner class name */
                @InterfaceC32271e(m100429c = "com.whoop.sdk.realtimeStream.R10RealtimeStream$onCreate$1$invokeSuspend$lambda$0$$inlined$mapNotNull$1$2", m100430f = "R10RealtimeStream.kt", m100431l = {52}, m100432m = "emit", m100433v = 2)
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C41515a extends AbstractC32269c {

                    /* JADX INFO: renamed from: E */
                    Object f44089E;

                    /* JADX INFO: renamed from: F */
                    Object f44090F;

                    /* JADX INFO: renamed from: G */
                    Object f44091G;

                    /* JADX INFO: renamed from: H */
                    Object f44092H;

                    /* JADX INFO: renamed from: I */
                    int f44093I;

                    /* JADX INFO: renamed from: w */
                    /* synthetic */ Object f44094w;

                    /* JADX INFO: renamed from: x */
                    int f44095x;

                    /* JADX INFO: renamed from: y */
                    Object f44096y;

                    public C41515a(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.f44094w = obj;
                        this.f44095x |= Integer.MIN_VALUE;
                        return C41514a.this.emit(null, this);
                    }
                }

                public C41514a(InterfaceC13062m interfaceC13062m, C12853a c12853a, InterfaceC21750d interfaceC21750d) {
                    this.f44086w = interfaceC13062m;
                    this.f44087x = c12853a;
                    this.f44088y = interfaceC21750d;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    C41515a c41515a;
                    if (interfaceC30057d instanceof C41515a) {
                        c41515a = (C41515a) interfaceC30057d;
                        int i13 = c41515a.f44095x;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c41515a.f44095x = i13 - Integer.MIN_VALUE;
                        } else {
                            c41515a = new C41515a(interfaceC30057d);
                        }
                    } else {
                        c41515a = new C41515a(interfaceC30057d);
                    }
                    Object obj2 = c41515a.f44094w;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = c41515a.f44095x;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.f44086w;
                        C27121i c27121iM36098e = this.f44087x.m36098e(this.f44088y, (AbstractC24734k) obj);
                        if (c27121iM36098e != null) {
                            c41515a.f44096y = null;
                            c41515a.f44089E = null;
                            c41515a.f44090F = null;
                            c41515a.f44091G = null;
                            c41515a.f44092H = null;
                            c41515a.f44093I = 0;
                            c41515a.f44095x = 1;
                            if (interfaceC13062m.emit(c27121iM36098e, c41515a) == enumC31071a) {
                                return enumC31071a;
                            }
                        }
                    } else {
                        if (i14 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj2);
                    }
                    return C23454a0.f92919a;
                }
            }

            public c(InterfaceC13058l interfaceC13058l, C12853a c12853a, InterfaceC21750d interfaceC21750d) {
                this.f44083w = interfaceC13058l;
                this.f44084x = c12853a;
                this.f44085y = interfaceC21750d;
            }

            @Override // ec3.InterfaceC13058l
            public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = this.f44083w.collect(new C41514a(interfaceC13062m, this.f44084x, this.f44085y), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C12853a.this.new a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f44076w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C14380k c14380kM36590P = AbstractC13091v.m36590P(new C4588i(C12853a.this.whoopStrapProvider.mo14818b(), 2), new b(null, C12853a.this));
                C41513a c41513a = new C41513a(C12853a.this);
                this.f44076w = 1;
                if (c14380kM36590P.collect(c41513a, this) == enumC31071a) {
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

    public C12853a(InterfaceC4733b whoopStrapProvider, InterfaceC2994c0 coroutineScope) {
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.whoopStrapProvider = whoopStrapProvider;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 1, EnumC11916a.f38983x, 1);
        this.mutableFlow = c13096w1M36592b;
        this.flow = AbstractC13091v.m36597g(c13096w1M36592b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public final C27121i m36098e(InterfaceC21750d strap, AbstractC24734k parsed) {
        C24725b c24725b;
        AbstractC27120h abstractC27120hM81509a;
        if (!(parsed instanceof C24736m)) {
            return null;
        }
        AbstractC24726c packet = parsed.getPacket();
        if ((packet instanceof C24725b) && packet.m72399L() == AbstractC24726c.a.REALTIME_RAW_DATA && (abstractC27120hM81509a = AbstractC27120h.INSTANCE.m81509a(strap.mo24752w0(), (C24736m) parsed, (c24725b = (C24725b) packet))) != null && (abstractC27120hM81509a instanceof C27113a) && abstractC27120hM81509a.m81508f0()) {
            return ((C27113a) abstractC27120hM81509a).m81495p0(c24725b);
        }
        return null;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC13087t1 getFlow() {
        return this.flow;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        this.collectorJob = AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(null), 3);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        InterfaceC3027k1 interfaceC3027k1 = this.collectorJob;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        this.collectorJob = null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onPause(InterfaceC1585g0 interfaceC1585g0) {
        super.onPause(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onResume(InterfaceC1585g0 interfaceC1585g0) {
        super.onResume(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStart(InterfaceC1585g0 interfaceC1585g0) {
        super.onStart(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStop(InterfaceC1585g0 interfaceC1585g0) {
        super.onStop(interfaceC1585g0);
    }
}
