package hq1;

import com.whoop.design.models.items.BehaviorDetailsTileImpactCard;
import com.whoop.design.models.items.BehaviorDetailsTileModel;
import com.whoop.design.models.items.ImpactStyle;
import com.whoop.design.util.TextResource;
import com.whoop.impacts.api.BehaviorDetailsGetRequest;
import com.whoop.impacts.details.domain.requests.BehaviorDetailsFooter;
import com.whoop.impacts.details.domain.requests.BehaviorDetailsResponse;
import com.whoop.impacts.details.domain.requests.BehaviorDetailsSection;
import com.whoop.impacts.details.domain.requests.BehaviorDetailsSubHeader;
import com.whoop.impacts.details.domain.requests.MetaData;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import gq1.C16081a;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import nm0.C26832c;
import nm0.InterfaceC26834e;
import od1.InterfaceC27844g;
import p000.AbstractC11266d;
import p000.BehaviorImpactApi;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pg3.C29218v0;
import pm0.InterfaceC29354a;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sm0.AbstractC32714a;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: hq1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0019\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0004\u0012\u00020\u000e0\u00160\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u0015J\u001b\u0010\u001b\u001a\u00020\u001a*\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u00132\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, m65681d2 = {"Lhq1/c;", "Lod1/g;", "Lhq1/a;", "Lhq1/b;", "Lnm0/e;", "cachedApiSource", "LBehaviorImpactApi;", "api", "Ltr2/n;", "logger", "Lgq1/a;", "analyticsHelper", "<init>", "(Lnm0/e;LBehaviorImpactApi;Ltr2/n;Lgq1/a;)V", "Lhq1/f;", "metadata", "Ll83/a0;", "i", "(Lhq1/f;Lq83/d;)Ljava/lang/Object;", "Lec3/l;", "j", "(Lhq1/f;)Lec3/l;", "Ll83/k;", "Lpm0/a;", "Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;", "k", "Lhq1/b$c;", "l", "(Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;Lhq1/f;)Lhq1/b$c;", "result", "m", "(Lhq1/b$c;)V", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lnm0/e;", "b", "LBehaviorImpactApi;", "c", "Ltr2/n;", "d", "Lgq1/a;", "behavior-impact_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17564c implements InterfaceC27844g<AbstractC17562a, AbstractC17563b> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final BehaviorImpactApi api;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C16081a analyticsHelper;

    /* JADX INFO: renamed from: hq1.c$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.impacts.details.domain.BehaviorDetailsInteractor$clearNewTagIfNeeded$2", m100430f = "BehaviorDetailsInteractor.kt", m100431l = {43}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f67999w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C17567f f68001y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C17567f c17567f, InterfaceC30057d<? super a> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f68001y = c17567f;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C17564c.this.new a(this.f68001y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f67999w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            BehaviorImpactApi behaviorImpactApi = C17564c.this.api;
            String impactId = this.f68001y.getImpactId();
            this.f67999w = 1;
            Object objDeleteNewTag = behaviorImpactApi.deleteNewTag(impactId, "Recovery", this);
            return objDeleteNewTag == enumC31071a ? enumC31071a : objDeleteNewTag;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: hq1.c$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f68002w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C17564c f68003x;

        /* JADX INFO: renamed from: hq1.c$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f68004w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C17564c f68005x;

            /* JADX INFO: renamed from: hq1.c$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.impacts.details.domain.BehaviorDetailsInteractor$fetchData$$inlined$map$1$2", m100430f = "BehaviorDetailsInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41704a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f68006E;

                /* JADX INFO: renamed from: F */
                Object f68007F;

                /* JADX INFO: renamed from: G */
                Object f68008G;

                /* JADX INFO: renamed from: H */
                int f68009H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f68010w;

                /* JADX INFO: renamed from: x */
                int f68011x;

                /* JADX INFO: renamed from: y */
                Object f68012y;

                public C41704a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f68010w = obj;
                    this.f68011x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C17564c c17564c) {
                this.f68004w = interfaceC13062m;
                this.f68005x = c17564c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
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
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41704a c41704a;
                Object aVar;
                if (interfaceC30057d instanceof C41704a) {
                    c41704a = (C41704a) interfaceC30057d;
                    int i13 = c41704a.f68011x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41704a.f68011x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41704a = new C41704a(interfaceC30057d);
                    }
                } else {
                    c41704a = new C41704a(interfaceC30057d);
                }
                Object obj2 = c41704a.f68010w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41704a.f68011x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f68004w;
                    C23465k c23465k = (C23465k) obj;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) c23465k.f92937w;
                    C17567f c17567f = (C17567f) c23465k.f92938x;
                    if (interfaceC29354a instanceof InterfaceC29354a.e) {
                        aVar = AbstractC17563b.b.f67988a;
                    } else if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
                        AbstractC17563b.c cVarM49999l = this.f68005x.m49999l((BehaviorDetailsResponse) ((InterfaceC29354a.a.C42173a) interfaceC29354a).getData(), c17567f);
                        this.f68005x.m50000m(cVarM49999l);
                        aVar = cVarM49999l;
                    } else if (interfaceC29354a instanceof InterfaceC29354a.a.b) {
                        aVar = this.f68005x.m49999l((BehaviorDetailsResponse) ((InterfaceC29354a.a.b) interfaceC29354a).getData(), c17567f);
                    } else if (interfaceC29354a instanceof InterfaceC29354a.d) {
                        InterfaceC29354a.d dVar = (InterfaceC29354a.d) interfaceC29354a;
                        this.f68005x.logger.mo85222m(AbstractC11266d.m30461o("Fetching behavior details failed ", dVar.getErrorMessage()), new AbstractC30556a.a[0]);
                        aVar = this.f68005x.m49999l((BehaviorDetailsResponse) dVar.getData(), c17567f);
                    } else {
                        if (!(interfaceC29354a instanceof InterfaceC29354a.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        InterfaceC29354a.c cVar = (InterfaceC29354a.c) interfaceC29354a;
                        this.f68005x.logger.mo85222m(AbstractC11266d.m30461o("Fetching behavior details failed ", cVar.getErrorMessage()), new AbstractC30556a.a[0]);
                        aVar = new AbstractC17563b.a(AbstractC11266d.m30461o("Fetching behavior details failed ", cVar.getErrorMessage()), c17567f);
                    }
                    c41704a.f68012y = null;
                    c41704a.f68006E = null;
                    c41704a.f68007F = null;
                    c41704a.f68008G = null;
                    c41704a.f68009H = 0;
                    c41704a.f68011x = 1;
                    if (interfaceC13062m.emit(aVar, c41704a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C17564c c17564c) {
            this.f68002w = interfaceC13058l;
            this.f68003x = c17564c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f68002w.collect(new a(interfaceC13062m, this.f68003x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: hq1.c$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.impacts.details.domain.BehaviorDetailsInteractor$getDataFromCache$$inlined$cacheAPI$1", m100430f = "BehaviorDetailsInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f68014w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f68015x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f68016y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f68017z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f68017z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            c cVar = new c(interfaceC30057d, this.f68017z);
            cVar.f68015x = interfaceC13062m;
            cVar.f68016y = c26832c;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f68014w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f68015x;
                C26832c c26832c = (C26832c) this.f68016y;
                InterfaceC26834e interfaceC26834e = this.f68017z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(BehaviorDetailsResponse.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(BehaviorDetailsResponse.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f68015x = null;
                this.f68016y = null;
                this.f68014w = 1;
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

    /* JADX INFO: renamed from: hq1.c$d */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f68018w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C17567f f68019x;

        /* JADX INFO: renamed from: hq1.c$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f68020w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C17567f f68021x;

            /* JADX INFO: renamed from: hq1.c$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.impacts.details.domain.BehaviorDetailsInteractor$getDataFromCache$$inlined$map$1$2", m100430f = "BehaviorDetailsInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41705a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f68022E;

                /* JADX INFO: renamed from: F */
                Object f68023F;

                /* JADX INFO: renamed from: G */
                Object f68024G;

                /* JADX INFO: renamed from: H */
                int f68025H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f68026w;

                /* JADX INFO: renamed from: x */
                int f68027x;

                /* JADX INFO: renamed from: y */
                Object f68028y;

                public C41705a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f68026w = obj;
                    this.f68027x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C17567f c17567f) {
                this.f68020w = interfaceC13062m;
                this.f68021x = c17567f;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41705a c41705a;
                if (interfaceC30057d instanceof C41705a) {
                    c41705a = (C41705a) interfaceC30057d;
                    int i13 = c41705a.f68027x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41705a.f68027x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41705a = new C41705a(interfaceC30057d);
                    }
                } else {
                    c41705a = new C41705a(interfaceC30057d);
                }
                Object obj2 = c41705a.f68026w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41705a.f68027x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f68020w;
                    C23465k c23465k = new C23465k((InterfaceC29354a) obj, this.f68021x);
                    c41705a.f68028y = null;
                    c41705a.f68022E = null;
                    c41705a.f68023F = null;
                    c41705a.f68024G = null;
                    c41705a.f68025H = 0;
                    c41705a.f68027x = 1;
                    if (interfaceC13062m.emit(c23465k, c41705a) == enumC31071a) {
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

        public d(InterfaceC13058l interfaceC13058l, C17567f c17567f) {
            this.f68018w = interfaceC13058l;
            this.f68019x = c17567f;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f68018w.collect(new a(interfaceC13062m, this.f68019x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: hq1.c$e */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f68030w;

        /* JADX INFO: renamed from: hq1.c$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f68031w;

            /* JADX INFO: renamed from: hq1.c$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.impacts.details.domain.BehaviorDetailsInteractor$interact$$inlined$filterIsInstance$1$2", m100430f = "BehaviorDetailsInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41706a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f68033F;

                /* JADX INFO: renamed from: G */
                Object f68034G;

                /* JADX INFO: renamed from: H */
                int f68035H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f68036w;

                /* JADX INFO: renamed from: x */
                int f68037x;

                /* JADX INFO: renamed from: y */
                Object f68038y;

                /* JADX INFO: renamed from: z */
                Object f68039z;

                public C41706a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f68036w = obj;
                    this.f68037x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f68031w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41706a c41706a;
                if (interfaceC30057d instanceof C41706a) {
                    c41706a = (C41706a) interfaceC30057d;
                    int i13 = c41706a.f68037x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41706a.f68037x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41706a = new C41706a(interfaceC30057d);
                    }
                } else {
                    c41706a = new C41706a(interfaceC30057d);
                }
                Object obj2 = c41706a.f68036w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41706a.f68037x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f68031w;
                    if (obj instanceof AbstractC17562a.a) {
                        c41706a.f68038y = null;
                        c41706a.f68039z = null;
                        c41706a.f68033F = null;
                        c41706a.f68034G = null;
                        c41706a.f68035H = 0;
                        c41706a.f68037x = 1;
                        if (interfaceC13062m.emit(obj, c41706a) == enumC31071a) {
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

        public e(InterfaceC13058l interfaceC13058l) {
            this.f68030w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f68030w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: hq1.c$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.impacts.details.domain.BehaviorDetailsInteractor$interact$$inlined$flatMapLatest$1", m100430f = "BehaviorDetailsInteractor.kt", m100431l = {190, 189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        Object f68040E;

        /* JADX INFO: renamed from: F */
        Object f68041F;

        /* JADX INFO: renamed from: G */
        Object f68042G;

        /* JADX INFO: renamed from: H */
        int f68043H;

        /* JADX INFO: renamed from: w */
        int f68044w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f68045x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f68046y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C17564c f68047z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC30057d interfaceC30057d, C17564c c17564c) {
            super(3, interfaceC30057d);
            this.f68047z = c17564c;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC17562a.a aVar, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            f fVar = new f(interfaceC30057d, this.f68047z);
            fVar.f68045x = interfaceC13062m;
            fVar.f68046y = aVar;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0073, code lost:
        
            if (ec3.AbstractC13091v.m36613w(r3, r9, r8) == r0) goto L16;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r8.f68044w
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L31
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                java.lang.Object r0 = r8.f68045x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                p505ts.AbstractC34132o.m107864I(r9)
                goto L76
            L15:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1d:
                java.lang.Object r1 = r8.f68042G
                hq1.a$a r1 = (hq1.AbstractC17562a.a) r1
                java.lang.Object r3 = r8.f68041F
                q83.d r3 = (q83.InterfaceC30057d) r3
                java.lang.Object r3 = r8.f68040E
                ec3.m r3 = (ec3.InterfaceC13062m) r3
                java.lang.Object r5 = r8.f68045x
                ec3.m r5 = (ec3.InterfaceC13062m) r5
                p505ts.AbstractC34132o.m107864I(r9)
                goto L59
            L31:
                p505ts.AbstractC34132o.m107864I(r9)
                java.lang.Object r9 = r8.f68045x
                ec3.m r9 = (ec3.InterfaceC13062m) r9
                java.lang.Object r1 = r8.f68046y
                hq1.a$a r1 = (hq1.AbstractC17562a.a) r1
                hq1.c r5 = r8.f68047z
                hq1.f r6 = r1.getMetadata()
                r8.f68045x = r4
                r8.f68046y = r4
                r8.f68040E = r9
                r8.f68041F = r4
                r8.f68042G = r1
                r7 = 0
                r8.f68043H = r7
                r8.f68044w = r3
                java.lang.Object r3 = hq1.C17564c.m49990c(r5, r6, r8)
                if (r3 != r0) goto L58
                goto L75
            L58:
                r3 = r9
            L59:
                hq1.c r9 = r8.f68047z
                hq1.f r1 = r1.getMetadata()
                ec3.l r9 = hq1.C17564c.m49991d(r9, r1)
                r8.f68045x = r4
                r8.f68046y = r4
                r8.f68040E = r4
                r8.f68041F = r4
                r8.f68042G = r4
                r8.f68044w = r2
                java.lang.Object r9 = ec3.AbstractC13091v.m36613w(r3, r9, r8)
                if (r9 != r0) goto L76
            L75:
                return r0
            L76:
                l83.a0 r9 = l83.C23454a0.f92919a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: hq1.C17564c.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (AbstractC17562a.a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    public C17564c(InterfaceC26834e cachedApiSource, BehaviorImpactApi api, InterfaceC34116n logger, C16081a analyticsHelper) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        this.cachedApiSource = cachedApiSource;
        this.api = api;
        this.logger = logger;
        this.analyticsHelper = analyticsHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final Object m49996i(C17567f c17567f, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM108729b;
        return (c17567f.getIsNew() && (objM108729b = InterfaceC34385a.Companion.m108729b(InterfaceC34385a.INSTANCE, this.logger, null, null, new a(c17567f, null), interfaceC30057d, 6, null)) == EnumC31071a.f128113w) ? objM108729b : C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final InterfaceC13058l m49997j(C17567f metadata) {
        return new b(m49998k(metadata), this);
    }

    /* JADX INFO: renamed from: k */
    private final InterfaceC13058l m49998k(C17567f metadata) {
        return new d(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new BehaviorDetailsGetRequest(metadata.getImpactId()), 1), null, null, 3, null), new c(null, this.cachedApiSource)), metadata);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final AbstractC17563b.c m49999l(BehaviorDetailsResponse behaviorDetailsResponse, C17567f c17567f) {
        TextResource detailsTitleDisplay = behaviorDetailsResponse.getHeader().getDetailsTitleDisplay();
        TextResource detailsSubtitleDisplay = behaviorDetailsResponse.getHeader().getDetailsSubtitleDisplay();
        TextResource detailsTagLabelDisplay = behaviorDetailsResponse.getHeader().getDetailsTagLabelDisplay();
        ImpactStyle detailsImpactStyle = behaviorDetailsResponse.getHeader().getDetailsImpactStyle();
        TextResource detailsImpactValueDisplay = behaviorDetailsResponse.getHeader().getDetailsImpactValueDisplay();
        String detailsImageDisplay = behaviorDetailsResponse.getHeader().getDetailsImageDisplay();
        BehaviorDetailsSubHeader subHeader = behaviorDetailsResponse.getHeader().getSubHeader();
        C17566e c17566e = new C17566e(detailsTitleDisplay, detailsSubtitleDisplay, detailsTagLabelDisplay, detailsImpactStyle, detailsImpactValueDisplay, detailsImageDisplay, subHeader != null ? new C17569h(subHeader.getSubTileTags(), subHeader.getCreatedTextDisplay()) : null);
        List<BehaviorDetailsSection> sections = behaviorDetailsResponse.getSections();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(sections, 10));
        for (BehaviorDetailsSection behaviorDetailsSection : sections) {
            arrayList.add(new C17568g(behaviorDetailsSection.getItems(), behaviorDetailsSection.getSectionType()));
        }
        BehaviorDetailsFooter footer = behaviorDetailsResponse.getFooter();
        C17565d c17565d = footer != null ? new C17565d(footer.getImpactsTitle(), footer.getImpactsDescription(), footer.getTiles()) : null;
        String analyticsId = behaviorDetailsResponse.getAnalyticsId();
        MetaData metadata = behaviorDetailsResponse.getMetadata();
        return new AbstractC17563b.c(c17566e, arrayList, c17565d, c17567f, analyticsId, metadata != null ? metadata.getAiContextMetadata() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final void m50000m(AbstractC17563b.c result) {
        String analyticsId = result.getAnalyticsId();
        if (analyticsId != null) {
            String str = !AbstractC39414r.m125890i0(analyticsId) ? analyticsId : null;
            if (str == null) {
                return;
            }
            List<C17568g> listM49989f = result.m49989f();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listM49989f.iterator();
            while (it.hasNext()) {
                AbstractC25265s.m74141p0(arrayList, ((C17568g) it.next()).m50010a());
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (obj instanceof BehaviorDetailsTileModel) {
                    arrayList2.add(obj);
                }
            }
            BehaviorDetailsTileModel behaviorDetailsTileModel = (BehaviorDetailsTileModel) AbstractC25265s.m74100H0(arrayList2);
            BehaviorDetailsTileImpactCard impactCard = behaviorDetailsTileModel != null ? behaviorDetailsTileModel.getImpactCard() : null;
            StringBuilder sb4 = new StringBuilder();
            String impactPercentageValue = impactCard != null ? impactCard.getImpactPercentageValue() : null;
            if (impactPercentageValue == null) {
                impactPercentageValue = "";
            }
            sb4.append(impactPercentageValue);
            String impactPercentageSymbol = impactCard != null ? impactCard.getImpactPercentageSymbol() : null;
            sb4.append(impactPercentageSymbol != null ? impactPercentageSymbol : "");
            this.analyticsHelper.m45432c(result.getMetadata().getImpactId(), result.getMetadata().getSource(), sb4.toString(), C16081a.c.RECOVERY, str);
        }
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(new e(upstream), new f(null, this));
    }
}
