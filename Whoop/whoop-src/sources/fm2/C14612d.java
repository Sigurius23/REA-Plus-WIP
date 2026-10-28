package fm2;

import a12.AbstractC0142b;
import a12.C0141a;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.SmartAlarmTriggerRepository;
import com.whoop.trendsminiarch.domain.GetTrendsMiniArchModelsRequest;
import com.whoop.trendsminiarch.domain.models.TrendsMiniArchModels;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import l83.C23454a0;
import m83.AbstractC25260n;
import nm0.C26832c;
import nm0.InterfaceC26834e;
import od1.InterfaceC27844g;
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

/* JADX INFO: renamed from: fm2.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lfm2/d;", "Lod1/g;", "Lfm2/b;", "Lfm2/c;", "Lnm0/e;", "cachedApiSource", "<init>", "(Lnm0/e;)V", "Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchModels;", "response", "e", "(Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchModels;)Lfm2/c;", "La12/a;", "parsedPath", "Lec3/l;", "f", "(La12/a;)Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lnm0/e;", "trends-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14612d implements InterfaceC27844g<AbstractC14610b, C14611c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: fm2.d$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trendsminiarch.domain.TrendsMiniArchInteractor$fetchData$$inlined$cacheAPI$1", m100430f = "TrendsMiniArchInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f53789w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f53790x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f53791y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f53792z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f53792z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f53792z);
            aVar.f53790x = interfaceC13062m;
            aVar.f53791y = c26832c;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f53789w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f53790x;
                C26832c c26832c = (C26832c) this.f53791y;
                InterfaceC26834e interfaceC26834e = this.f53792z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(TrendsMiniArchModels.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(TrendsMiniArchModels.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f53790x = null;
                this.f53791y = null;
                this.f53789w = 1;
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

    /* JADX INFO: renamed from: fm2.d$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f53793w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C14612d f53794x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C0141a f53795y;

        /* JADX INFO: renamed from: fm2.d$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f53796w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C14612d f53797x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C0141a f53798y;

            /* JADX INFO: renamed from: fm2.d$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.trendsminiarch.domain.TrendsMiniArchInteractor$fetchData$$inlined$map$1$2", m100430f = "TrendsMiniArchInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41598a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f53799E;

                /* JADX INFO: renamed from: F */
                Object f53800F;

                /* JADX INFO: renamed from: G */
                Object f53801G;

                /* JADX INFO: renamed from: H */
                int f53802H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f53803w;

                /* JADX INFO: renamed from: x */
                int f53804x;

                /* JADX INFO: renamed from: y */
                Object f53805y;

                public C41598a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f53803w = obj;
                    this.f53804x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C14612d c14612d, C0141a c0141a) {
                this.f53796w = interfaceC13062m;
                this.f53797x = c14612d;
                this.f53798y = c0141a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41598a c41598a;
                C14611c c14611c;
                C14611c c14611c2;
                if (interfaceC30057d instanceof C41598a) {
                    c41598a = (C41598a) interfaceC30057d;
                    int i13 = c41598a.f53804x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41598a.f53804x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41598a = new C41598a(interfaceC30057d);
                    }
                } else {
                    c41598a = new C41598a(interfaceC30057d);
                }
                Object obj2 = c41598a.f53803w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41598a.f53804x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f53796w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.e) {
                        c14611c = new C14611c(InterfaceC14609a.a.f53782a, null, 2, null);
                    } else {
                        if (interfaceC29354a instanceof InterfaceC29354a.a.b) {
                            c14611c2 = new C14611c(null, (TrendsMiniArchModels) ((InterfaceC29354a.a.b) interfaceC29354a).getData(), 1, null);
                        } else if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
                            c14611c = this.f53797x.m41812e((TrendsMiniArchModels) ((InterfaceC29354a.a.C42173a) interfaceC29354a).getData());
                        } else if (interfaceC29354a instanceof InterfaceC29354a.d) {
                            c14611c2 = new C14611c(null, (TrendsMiniArchModels) ((InterfaceC29354a.d) interfaceC29354a).getData(), 1, null);
                        } else {
                            c14611c = interfaceC29354a instanceof InterfaceC29354a.c ? new C14611c(new InterfaceC14609a.c(this.f53798y.getPath()), null, 2, null) : new C14611c(new InterfaceC14609a.c(this.f53798y.getPath()), null, 2, null);
                        }
                        c14611c = c14611c2;
                    }
                    c41598a.f53805y = null;
                    c41598a.f53799E = null;
                    c41598a.f53800F = null;
                    c41598a.f53801G = null;
                    c41598a.f53802H = 0;
                    c41598a.f53804x = 1;
                    if (interfaceC13062m.emit(c14611c, c41598a) == enumC31071a) {
                        return enumC31071a;
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

        public b(InterfaceC13058l interfaceC13058l, C14612d c14612d, C0141a c0141a) {
            this.f53793w = interfaceC13058l;
            this.f53794x = c14612d;
            this.f53795y = c0141a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f53793w.collect(new a(interfaceC13062m, this.f53794x, this.f53795y), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: fm2.d$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trendsminiarch.domain.TrendsMiniArchInteractor$interact$$inlined$flatMapLatest$1", m100430f = "TrendsMiniArchInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f53807w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f53808x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f53809y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C14612d f53810z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC30057d interfaceC30057d, C14612d c14612d) {
            super(3, interfaceC30057d);
            this.f53810z = c14612d;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC14610b abstractC14610b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            c cVar = new c(interfaceC30057d, this.f53810z);
            cVar.f53808x = interfaceC13062m;
            cVar.f53809y = abstractC14610b;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f53807w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f53808x;
                AbstractC14610b abstractC14610b = (AbstractC14610b) this.f53809y;
                InterfaceC13058l interfaceC13058lM36590P = abstractC14610b instanceof AbstractC14610b.a ? AbstractC13091v.m36590P(this.f53810z.m41813f(AbstractC0142b.m360e(((AbstractC14610b.a) abstractC14610b).getPath())), new g(null, abstractC14610b)) : new C13084s1(new e(abstractC14610b, null));
                this.f53808x = null;
                this.f53809y = null;
                this.f53807w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM36590P, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC14610b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: fm2.d$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trendsminiarch.domain.TrendsMiniArchInteractor$interact$1$1$1", m100430f = "TrendsMiniArchInteractor.kt", m100431l = {30}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lfm2/b$a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f53811w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f53812x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC14610b f53813y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C14611c f53814z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractC14610b abstractC14610b, C14611c c14611c, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f53813y = abstractC14610b;
            this.f53814z = c14611c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = new d(this.f53813y, this.f53814z, interfaceC30057d);
            dVar.f53812x = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f53812x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f53811w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC14610b.a aVar = new AbstractC14610b.a(((AbstractC14610b.a) this.f53813y).getPath(), this.f53814z);
                this.f53812x = null;
                this.f53811w = 1;
                if (interfaceC13062m.emit(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: fm2.d$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trendsminiarch.domain.TrendsMiniArchInteractor$interact$1$2", m100430f = "TrendsMiniArchInteractor.kt", m100431l = {33}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lfm2/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f53815w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f53816x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC14610b f53817y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AbstractC14610b abstractC14610b, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f53817y = abstractC14610b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = new e(this.f53817y, interfaceC30057d);
            eVar.f53816x = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f53816x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f53815w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC14610b abstractC14610b = this.f53817y;
                this.f53816x = null;
                this.f53815w = 1;
                if (interfaceC13062m.emit(abstractC14610b, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: fm2.d$f */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trendsminiarch.domain.TrendsMiniArchInteractor$interact$2", m100430f = "TrendsMiniArchInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lfm2/c;", "currentState", "Lfm2/b;", "currentAction", "<anonymous>", "(Lfm2/c;Lfm2/b;)Lfm2/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f53818w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f53819x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f53820y;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C14611c c14611c, AbstractC14610b abstractC14610b, InterfaceC30057d<? super C14611c> interfaceC30057d) {
            f fVar = new f(interfaceC30057d);
            fVar.f53819x = c14611c;
            fVar.f53820y = abstractC14610b;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14611c c14611c = (C14611c) this.f53819x;
            AbstractC14610b abstractC14610b = (AbstractC14610b) this.f53820y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f53818w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (!(abstractC14610b instanceof AbstractC14610b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            C14611c domainState = ((AbstractC14610b.a) abstractC14610b).getDomainState();
            return domainState == null ? c14611c : domainState;
        }
    }

    /* JADX INFO: renamed from: fm2.d$g */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trendsminiarch.domain.TrendsMiniArchInteractor$interact$lambda$0$$inlined$flatMapLatest$1", m100430f = "TrendsMiniArchInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f53821w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f53822x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f53823y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC14610b f53824z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC30057d interfaceC30057d, AbstractC14610b abstractC14610b) {
            super(3, interfaceC30057d);
            this.f53824z = abstractC14610b;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C14611c c14611c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            g gVar = new g(interfaceC30057d, this.f53824z);
            gVar.f53822x = interfaceC13062m;
            gVar.f53823y = c14611c;
            return gVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f53821w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f53822x;
                C13084s1 c13084s1 = new C13084s1(new d(this.f53824z, (C14611c) this.f53823y, null));
                this.f53822x = null;
                this.f53823y = null;
                this.f53821w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c13084s1, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (C14611c) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    public C14612d(InterfaceC26834e cachedApiSource) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        this.cachedApiSource = cachedApiSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public final C14611c m41812e(TrendsMiniArchModels response) {
        return new C14611c(null, response, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final InterfaceC13058l m41813f(C0141a parsedPath) {
        return new b(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new GetTrendsMiniArchModelsRequest(parsedPath.getBasePath(), parsedPath.m354b()), 1), AbstractC25260n.m74059b1(new String[]{"home", SmartAlarmTriggerRepository.DEFAULT_REFRESH_SCOPE}), null, 2, null), new a(null, this.cachedApiSource)), this, parsedPath);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C14611c(InterfaceC14609a.a.f53782a, null, 2, null), AbstractC13091v.m36590P(upstream, new c(null, this)), new f(null));
    }
}
