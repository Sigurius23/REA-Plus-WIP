package ds0;

import com.whoop.communityreactions.api.ReactionsApi;
import com.whoop.communityreactions.domain.model.ReactionsResponse;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: ds0.g */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0086@¢\u0006\u0004\b\u000e\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013R\u0011\u0010\u0017\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m65681d2 = {"Lds0/g;", "", "", "path", "Lcom/whoop/communityreactions/api/ReactionsApi;", "api", "Ltr2/n;", "logger", "<init>", "(Ljava/lang/String;Lcom/whoop/communityreactions/api/ReactionsApi;Ltr2/n;)V", "Lds0/e;", "c", "(Lq83/d;)Ljava/lang/Object;", "Lds0/e$c;", "e", "a", "Ljava/lang/String;", "b", "Lcom/whoop/communityreactions/api/ReactionsApi;", "Ltr2/n;", "", "d", "()Z", "hasPath", "community-reactions-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12328g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String path;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ReactionsApi api;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: ds0.g$a */
    @InterfaceC32271e(m100429c = "com.whoop.communityreactions.domain.ReactionsFetcher", m100430f = "ReactionsFetcher.kt", m100431l = {15}, m100432m = "fetch", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f41302w;

        /* JADX INFO: renamed from: y */
        int f41304y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f41302w = obj;
            this.f41304y |= Integer.MIN_VALUE;
            return C12328g.this.m34386c(this);
        }
    }

    /* JADX INFO: renamed from: ds0.g$b */
    @InterfaceC32271e(m100429c = "com.whoop.communityreactions.domain.ReactionsFetcher$fetch$result$1", m100430f = "ReactionsFetcher.kt", m100431l = {16}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/communityreactions/domain/model/ReactionsResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f41305w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C12328g.this.new b(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f41305w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ReactionsApi reactionsApi = C12328g.this.api;
            String str = C12328g.this.path;
            this.f41305w = 1;
            Object reactions = reactionsApi.getReactions(str, this);
            return reactions == enumC31071a ? enumC31071a : reactions;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super ReactionsResponse> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: ds0.g$c */
    @InterfaceC32271e(m100429c = "com.whoop.communityreactions.domain.ReactionsFetcher", m100430f = "ReactionsFetcher.kt", m100431l = {24}, m100432m = "refetch", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f41307w;

        /* JADX INFO: renamed from: y */
        int f41309y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f41307w = obj;
            this.f41309y |= Integer.MIN_VALUE;
            return C12328g.this.m34388e(this);
        }
    }

    public C12328g(String path, ReactionsApi api, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(path, "path");
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        this.path = path;
        this.api = api;
        this.logger = logger;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: c */
    public final Object m34386c(InterfaceC30057d<? super InterfaceC12326e> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f41304y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f41304y = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f41302w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f41304y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(null);
            aVar2.f41304y = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to fetch reactions", bVar, aVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return new InterfaceC12326e.c((ReactionsResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a(), null, 2, null);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return InterfaceC12326e.b.f41280a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m34387d() {
        return !AbstractC39414r.m125890i0(this.path);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m34388e(InterfaceC30057d<? super InterfaceC12326e.c> interfaceC30057d) {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f41309y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f41309y = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object objM34386c = cVar.f41307w;
        Object obj = EnumC31071a.f128113w;
        int i14 = cVar.f41309y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM34386c);
            if (!m34387d()) {
                return null;
            }
            cVar.f41309y = 1;
            objM34386c = m34386c(cVar);
            if (objM34386c == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM34386c);
        }
        if (objM34386c instanceof InterfaceC12326e.c) {
            return (InterfaceC12326e.c) objM34386c;
        }
        return null;
    }

    public /* synthetic */ C12328g(String str, ReactionsApi reactionsApi, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, reactionsApi, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("ReactionsFetcher") : interfaceC34116n);
    }
}
