package qi2;

import com.whoop.streaks.domain.StreaksApi;
import com.whoop.streaks.domain.models.StreaksResponse;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import od1.InterfaceC27844g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: qi2.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ#\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lqi2/c;", "Lod1/g;", "Lqi2/a;", "Lqi2/b;", "Lcom/whoop/streaks/domain/StreaksApi;", "api", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/streaks/domain/StreaksApi;Ltr2/n;)V", "g", "(Lq83/d;)Ljava/lang/Object;", "previousResult", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lqi2/b;)Lqi2/b;", "i", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/streaks/domain/StreaksApi;", "b", "Ltr2/n;", "streaks_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30415c implements InterfaceC27844g<InterfaceC30413a, InterfaceC30414b> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final StreaksApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: qi2.c$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.streaks.domain.StreaksInteractor", m100430f = "StreaksInteractor.kt", m100431l = {27}, m100432m = "fetchData", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f124821w;

        /* JADX INFO: renamed from: y */
        int f124823y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f124821w = obj;
            this.f124823y |= Integer.MIN_VALUE;
            return C30415c.this.m92981g(this);
        }
    }

    /* JADX INFO: renamed from: qi2.c$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.streaks.domain.StreaksInteractor$fetchData$result$1", m100430f = "StreaksInteractor.kt", m100431l = {28}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/streaks/domain/models/StreaksResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f124824w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C30415c.this.new b(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f124824w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            StreaksApi streaksApi = C30415c.this.api;
            this.f124824w = 1;
            Object streaks = streaksApi.getStreaks(this);
            return streaks == enumC31071a ? enumC31071a : streaks;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super StreaksResponse> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: qi2.c$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.streaks.domain.StreaksInteractor$interact$1", m100430f = "StreaksInteractor.kt", m100431l = {20}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lqi2/b;", "previousResult", "Lqi2/a;", "action", "<anonymous>", "(Lqi2/b;Lqi2/a;)Lqi2/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f124826w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f124827x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f124828y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC30414b interfaceC30414b, InterfaceC30413a interfaceC30413a, InterfaceC30057d<? super InterfaceC30414b> interfaceC30057d) {
            c cVar = C30415c.this.new c(interfaceC30057d);
            cVar.f124827x = interfaceC30414b;
            cVar.f124828y = interfaceC30413a;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC30414b interfaceC30414b = (InterfaceC30414b) this.f124827x;
            InterfaceC30413a interfaceC30413a = (InterfaceC30413a) this.f124828y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f124826w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (!(interfaceC30413a instanceof InterfaceC30413a.a)) {
                    if (interfaceC30413a instanceof InterfaceC30413a.b) {
                        return C30415c.this.m92982h(interfaceC30414b);
                    }
                    if (interfaceC30413a instanceof InterfaceC30413a.c) {
                        return C30415c.this.m92983i(interfaceC30414b);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                C30415c c30415c = C30415c.this;
                this.f124827x = null;
                this.f124828y = null;
                this.f124826w = 1;
                obj = c30415c.m92981g(this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return (InterfaceC30414b) obj;
        }
    }

    public C30415c(StreaksApi api, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: g */
    public final Object m92981g(InterfaceC30057d<? super InterfaceC30414b> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f124823y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f124823y = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f124821w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f124823y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(null);
            aVar2.f124823y = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to fetch streaks explainer page bff", bVar, aVar2, 2, null);
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
            return new InterfaceC30414b.c((StreaksResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a(), false, false);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return InterfaceC30414b.a.f124814a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final InterfaceC30414b m92982h(InterfaceC30414b previousResult) {
        if (!(previousResult instanceof InterfaceC30414b.c)) {
            return previousResult;
        }
        InterfaceC30414b.c cVar = (InterfaceC30414b.c) previousResult;
        return InterfaceC30414b.c.m92972b(cVar, null, !cVar.getShowMaxStreakDialog(), !cVar.getShowMaxStreakDialog() ? false : cVar.getShowRestorationDialog(), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final InterfaceC30414b m92983i(InterfaceC30414b previousResult) {
        if (!(previousResult instanceof InterfaceC30414b.c)) {
            return previousResult;
        }
        InterfaceC30414b.c cVar = (InterfaceC30414b.c) previousResult;
        return InterfaceC30414b.c.m92972b(cVar, null, !cVar.getShowRestorationDialog() ? false : cVar.getShowMaxStreakDialog(), !cVar.getShowRestorationDialog(), 1, null);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(InterfaceC30414b.b.f124815a, upstream, new c(null));
    }

    public /* synthetic */ C30415c(StreaksApi streaksApi, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(streaksApi, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("StreaksInteractor") : interfaceC34116n);
    }
}
