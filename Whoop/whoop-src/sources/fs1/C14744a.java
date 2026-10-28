package fs1;

import a12.AbstractC0142b;
import a12.C0141a;
import com.whoop.journalhometile.api.JournalHomeTileGetRequest;
import com.whoop.journalhometile.domain.model.JournalHomeTileResponse;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import l83.C23454a0;
import nm0.C26832c;
import nm0.InterfaceC26834e;
import od1.InterfaceC27844g;
import or2.AbstractC28157e0;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pm0.InterfaceC29354a;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sm0.AbstractC32714a;

/* JADX INFO: renamed from: fs1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lfs1/a;", "Lod1/g;", "Lfs1/b;", "Lfs1/c;", "Lfs1/d;", "refreshHook", "Lnm0/e;", "cachedApiSource", "<init>", "(Lfs1/d;Lnm0/e;)V", "La12/a;", "parsedPath", "Lec3/l;", "d", "(La12/a;)Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lfs1/d;", "b", "Lnm0/e;", "journal-home-tile-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14744a implements InterfaceC27844g<AbstractC14745b, AbstractC14746c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C14747d refreshHook;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: fs1.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.journalhometile.domain.JournalHomeTileApiInteractor$fetchData$$inlined$cacheAPI$1", m100430f = "JournalHomeTileApiInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f54567w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f54568x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f54569y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f54570z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f54570z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f54570z);
            aVar.f54568x = interfaceC13062m;
            aVar.f54569y = c26832c;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f54567w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f54568x;
                C26832c c26832c = (C26832c) this.f54569y;
                InterfaceC26834e interfaceC26834e = this.f54570z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(JournalHomeTileResponse.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(JournalHomeTileResponse.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f54568x = null;
                this.f54569y = null;
                this.f54567w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lMo80083a, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (C26832c<C23454a0>) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: fs1.a$b */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f54571w;

        /* JADX INFO: renamed from: fs1.a$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f54572w;

            /* JADX INFO: renamed from: fs1.a$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.journalhometile.domain.JournalHomeTileApiInteractor$fetchData$$inlined$map$1$2", m100430f = "JournalHomeTileApiInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41607a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f54573E;

                /* JADX INFO: renamed from: F */
                Object f54574F;

                /* JADX INFO: renamed from: G */
                Object f54575G;

                /* JADX INFO: renamed from: H */
                int f54576H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f54577w;

                /* JADX INFO: renamed from: x */
                int f54578x;

                /* JADX INFO: renamed from: y */
                Object f54579y;

                public C41607a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f54577w = obj;
                    this.f54578x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f54572w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41607a c41607a;
                Object obj2;
                AbstractC14746c.c cVar;
                if (interfaceC30057d instanceof C41607a) {
                    c41607a = (C41607a) interfaceC30057d;
                    int i13 = c41607a.f54578x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41607a.f54578x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41607a = new C41607a(interfaceC30057d);
                    }
                } else {
                    c41607a = new C41607a(interfaceC30057d);
                }
                Object obj3 = c41607a.f54577w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41607a.f54578x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj3);
                    InterfaceC13062m interfaceC13062m = this.f54572w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.e) {
                        obj2 = AbstractC14746c.b.f54587a;
                    } else {
                        if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
                            cVar = new AbstractC14746c.c((JournalHomeTileResponse) ((InterfaceC29354a.a.C42173a) interfaceC29354a).getData());
                        } else if (interfaceC29354a instanceof InterfaceC29354a.a.b) {
                            cVar = new AbstractC14746c.c((JournalHomeTileResponse) ((InterfaceC29354a.a.b) interfaceC29354a).getData());
                        } else {
                            obj2 = AbstractC14746c.a.f54586a;
                        }
                        obj2 = cVar;
                    }
                    c41607a.f54579y = null;
                    c41607a.f54573E = null;
                    c41607a.f54574F = null;
                    c41607a.f54575G = null;
                    c41607a.f54576H = 0;
                    c41607a.f54578x = 1;
                    if (interfaceC13062m.emit(obj2, c41607a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj3);
                }
                return C23454a0.f92919a;
            }
        }

        public b(InterfaceC13058l interfaceC13058l) {
            this.f54571w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f54571w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: fs1.a$c */
    @InterfaceC32271e(m100429c = "com.whoop.journalhometile.domain.JournalHomeTileApiInteractor$interact$$inlined$flatMapLatest$1", m100430f = "JournalHomeTileApiInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f54581w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f54582x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f54583y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C14744a f54584z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC30057d interfaceC30057d, C14744a c14744a) {
            super(3, interfaceC30057d);
            this.f54584z = c14744a;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC14745b abstractC14745b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            c cVar = new c(interfaceC30057d, this.f54584z);
            cVar.f54582x = interfaceC13062m;
            cVar.f54583y = abstractC14745b;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f54581w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f54582x;
                AbstractC14745b abstractC14745b = (AbstractC14745b) this.f54583y;
                if (!(abstractC14745b instanceof AbstractC14745b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC13058l interfaceC13058lM42279d = this.f54584z.m42279d(AbstractC0142b.m360e(((AbstractC14745b.a) abstractC14745b).getPath()));
                this.f54582x = null;
                this.f54583y = null;
                this.f54581w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM42279d, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC14745b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    public C14744a(C14747d refreshHook, InterfaceC26834e cachedApiSource) {
        AbstractC22676k.m65750j(refreshHook, "refreshHook");
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        this.refreshHook = refreshHook;
        this.cachedApiSource = cachedApiSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public final InterfaceC13058l m42279d(C0141a parsedPath) {
        return new b(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new JournalHomeTileGetRequest(parsedPath.getBasePath(), parsedPath.m354b()), 1), null, null, 3, null), new a(null, this.cachedApiSource)));
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(AbstractC28157e0.m85207a(upstream, this.refreshHook.getRefreshEvents()), new c(null, this));
    }
}
