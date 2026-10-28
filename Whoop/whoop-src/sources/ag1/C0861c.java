package ag1;

import c93.InterfaceC4351m;
import com.whoop.filteredlist.api.FilteredListApi;
import com.whoop.filteredlist.domain.model.FilteredListPagination;
import com.whoop.filteredlist.domain.model.FilteredListResponse;
import com.whoop.filteredlist.domain.model.PaginationErrorState;
import com.whoop.filteredlist.domain.model.PaginationStates;
import com.whoop.navigation.models.ApiRequest;
import com.whoop.whoopaction.domain.models.Action;
import com.whoop.whoopaction.domain.models.Request;
import com.whoop.whoopaction.domain.models.UpdateAction;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import hc3.AbstractC17176i;
import java.util.Locale;
import l83.C23454a0;
import m83.AbstractC25265s;
import p000.AbstractC11266d;
import p007a6.C0456u;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import qw2.AbstractC30694b;
import qw2.C30695c;
import qw2.C30698f;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import wm0.C37378a;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: ag1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\u000f\u001a\u00020\r*\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0015\u001a\u00020\r*\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J*\u0010\u0017\u001a\u00020\r*\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0017\u0010\u0016J*\u0010\u001a\u001a\u00020\r*\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ2\u0010\u001e\u001a\u00020\r*\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001cH\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ\"\u0010 \u001a\u00020\r*\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b \u0010\u0010J\u0019\u0010!\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b!\u0010\"J!\u0010&\u001a\b\u0012\u0004\u0012\u00020\r0#2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#¢\u0006\u0004\b&\u0010'J:\u0010+\u001a\u00020\r*\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0080@¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00065"}, m65681d2 = {"Lag1/c;", "", "Lcom/whoop/filteredlist/api/FilteredListApi;", "api", "Lqw2/c;", "actionInteractor", "Lwm0/a;", "scopeCoordinator", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/filteredlist/api/FilteredListApi;Lqw2/c;Lwm0/a;Ltr2/n;)V", "Lec3/m;", "Lag1/b;", "state", "o", "(Lec3/m;Lag1/b;Lq83/d;)Ljava/lang/Object;", "j", "(Lag1/b;)Lag1/b;", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "p", "(Lec3/m;Lcom/whoop/whoopaction/domain/models/Action;Lag1/b;Lq83/d;)Ljava/lang/Object;", "k", "", "path", "m", "(Lec3/m;Ljava/lang/String;Lag1/b;Lq83/d;)Ljava/lang/Object;", "", "isFilterRequest", "l", "(Lec3/m;Ljava/lang/String;Lag1/b;ZLq83/d;)Ljava/lang/Object;", "n", "i", "(Lcom/whoop/whoopaction/domain/models/Action;)Ljava/lang/String;", "Lec3/l;", "Lag1/a;", "upstream", "r", "(Lec3/l;)Lec3/l;", "Lqw2/b;", "terminalState", "currentPath", "q", "(Lec3/m;Lqw2/b;Ljava/lang/String;Lag1/b;Lcom/whoop/whoopaction/domain/models/Action;Lq83/d;)Ljava/lang/Object;", "a", "Lcom/whoop/filteredlist/api/FilteredListApi;", "b", "Lqw2/c;", "c", "Lwm0/a;", "d", "Ltr2/n;", "filtered-list-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C0861c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FilteredListApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C30695c actionInteractor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C37378a scopeCoordinator;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: ag1.c$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f3088w;

        /* JADX INFO: renamed from: ag1.c$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41270a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f3089w;

            /* JADX INFO: renamed from: ag1.c$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.filteredlist.domain.FilteredListInteractor$handleItemAction$$inlined$filter$1$2", m100430f = "FilteredListInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41271a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f3091F;

                /* JADX INFO: renamed from: G */
                Object f3092G;

                /* JADX INFO: renamed from: H */
                int f3093H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f3094w;

                /* JADX INFO: renamed from: x */
                int f3095x;

                /* JADX INFO: renamed from: y */
                Object f3096y;

                /* JADX INFO: renamed from: z */
                Object f3097z;

                public C41271a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f3094w = obj;
                    this.f3095x |= Integer.MIN_VALUE;
                    return C41270a.this.emit(null, this);
                }
            }

            public C41270a(InterfaceC13062m interfaceC13062m) {
                this.f3089w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41271a c41271a;
                if (interfaceC30057d instanceof C41271a) {
                    c41271a = (C41271a) interfaceC30057d;
                    int i13 = c41271a.f3095x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41271a.f3095x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41271a = new C41271a(interfaceC30057d);
                    }
                } else {
                    c41271a = new C41271a(interfaceC30057d);
                }
                Object obj2 = c41271a.f3094w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41271a.f3095x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f3089w;
                    AbstractC30694b abstractC30694b = (AbstractC30694b) obj;
                    if ((abstractC30694b instanceof AbstractC30694b.f) || (abstractC30694b instanceof AbstractC30694b.a) || (abstractC30694b instanceof AbstractC30694b.b)) {
                        c41271a.f3096y = null;
                        c41271a.f3097z = null;
                        c41271a.f3091F = null;
                        c41271a.f3092G = null;
                        c41271a.f3093H = 0;
                        c41271a.f3095x = 1;
                        if (interfaceC13062m.emit(obj, c41271a) == enumC31071a) {
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

        public a(InterfaceC13058l interfaceC13058l) {
            this.f3088w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f3088w.collect(new C41270a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ag1.c$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.filteredlist.domain.FilteredListInteractor", m100430f = "FilteredListInteractor.kt", m100431l = {76, 86, 87}, m100432m = "handleItemAction", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f3098E;

        /* JADX INFO: renamed from: G */
        int f3100G;

        /* JADX INFO: renamed from: w */
        Object f3101w;

        /* JADX INFO: renamed from: x */
        Object f3102x;

        /* JADX INFO: renamed from: y */
        Object f3103y;

        /* JADX INFO: renamed from: z */
        Object f3104z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f3098E = obj;
            this.f3100G |= Integer.MIN_VALUE;
            return C0861c.this.m2100k(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: ag1.c$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.filteredlist.domain.FilteredListInteractor", m100430f = "FilteredListInteractor.kt", m100431l = {163, 165}, m100432m = "handleLoad", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        boolean f3105E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f3106F;

        /* JADX INFO: renamed from: H */
        int f3108H;

        /* JADX INFO: renamed from: w */
        Object f3109w;

        /* JADX INFO: renamed from: x */
        Object f3110x;

        /* JADX INFO: renamed from: y */
        Object f3111y;

        /* JADX INFO: renamed from: z */
        Object f3112z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f3106F = obj;
            this.f3108H |= Integer.MIN_VALUE;
            return C0861c.this.m2101l(null, null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: ag1.c$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.filteredlist.domain.FilteredListInteractor$handleLoad$result$1", m100430f = "FilteredListInteractor.kt", m100431l = {169}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/filteredlist/domain/model/FilteredListResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f3113w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f3115y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, InterfaceC30057d<? super d> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f3115y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C0861c.this.new d(this.f3115y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f3113w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            FilteredListApi filteredListApi = C0861c.this.api;
            String str = this.f3115y;
            this.f3113w = 1;
            Object filteredList = filteredListApi.getFilteredList(str, this);
            return filteredList == enumC31071a ? enumC31071a : filteredList;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super FilteredListResponse> interfaceC30057d) {
            return ((d) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: ag1.c$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.filteredlist.domain.FilteredListInteractor", m100430f = "FilteredListInteractor.kt", m100431l = {207, 209}, m100432m = "handleLoadMore", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f3116E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f3117F;

        /* JADX INFO: renamed from: H */
        int f3119H;

        /* JADX INFO: renamed from: w */
        Object f3120w;

        /* JADX INFO: renamed from: x */
        Object f3121x;

        /* JADX INFO: renamed from: y */
        Object f3122y;

        /* JADX INFO: renamed from: z */
        Object f3123z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f3117F = obj;
            this.f3119H |= Integer.MIN_VALUE;
            return C0861c.this.m2103n(null, null, this);
        }
    }

    /* JADX INFO: renamed from: ag1.c$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.filteredlist.domain.FilteredListInteractor$handleLoadMore$result$1", m100430f = "FilteredListInteractor.kt", m100431l = {213}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/filteredlist/domain/model/FilteredListResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f3124w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ ApiRequest f3126y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ApiRequest apiRequest, InterfaceC30057d<? super f> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f3126y = apiRequest;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C0861c.this.new f(this.f3126y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f3124w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            FilteredListApi filteredListApi = C0861c.this.api;
            String path = this.f3126y.getPath();
            this.f3124w = 1;
            Object filteredList = filteredListApi.getFilteredList(path, this);
            return filteredList == enumC31071a ? enumC31071a : filteredList;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super FilteredListResponse> interfaceC30057d) {
            return ((f) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: ag1.c$g */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.filteredlist.domain.FilteredListInteractor", m100430f = "FilteredListInteractor.kt", m100431l = {97, 98}, m100432m = "handleTerminalActionState$filtered_list_arch_mini_release", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f3127E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f3128F;

        /* JADX INFO: renamed from: H */
        int f3130H;

        /* JADX INFO: renamed from: w */
        Object f3131w;

        /* JADX INFO: renamed from: x */
        Object f3132x;

        /* JADX INFO: renamed from: y */
        Object f3133y;

        /* JADX INFO: renamed from: z */
        Object f3134z;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f3128F = obj;
            this.f3130H |= Integer.MIN_VALUE;
            return C0861c.this.m2106q(null, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: ag1.c$h */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.filteredlist.domain.FilteredListInteractor$interact$1", m100430f = "FilteredListInteractor.kt", m100431l = {28, 30}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lag1/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C0861c f3135E;

        /* JADX INFO: renamed from: w */
        Object f3136w;

        /* JADX INFO: renamed from: x */
        int f3137x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f3138y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC13058l f3139z;

        /* JADX INFO: renamed from: ag1.c$h$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C22669g0 f3140w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C0861c f3141x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC13062m f3142y;

            /* JADX INFO: renamed from: ag1.c$h$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.filteredlist.domain.FilteredListInteractor$interact$1$1", m100430f = "FilteredListInteractor.kt", m100431l = {32, 33, 34, 35, 37, 39}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41272a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                int f3143E;

                /* JADX INFO: renamed from: w */
                Object f3144w;

                /* JADX INFO: renamed from: x */
                Object f3145x;

                /* JADX INFO: renamed from: y */
                /* synthetic */ Object f3146y;

                /* JADX INFO: renamed from: z */
                final /* synthetic */ a<T> f3147z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C41272a(a<? super T> aVar, InterfaceC30057d<? super C41272a> interfaceC30057d) {
                    super(interfaceC30057d);
                    this.f3147z = aVar;
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f3146y = obj;
                    this.f3143E |= Integer.MIN_VALUE;
                    return this.f3147z.emit(null, this);
                }
            }

            public a(C22669g0 c22669g0, C0861c c0861c, InterfaceC13062m interfaceC13062m) {
                this.f3140w = c22669g0;
                this.f3141x = c0861c;
                this.f3142y = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:58:0x015a, code lost:
            
                if (r9.emit(r10, r0) == r1) goto L59;
             */
            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(ag1.AbstractC0859a r9, q83.InterfaceC30057d<? super l83.C23454a0> r10) {
                /*
                    Method dump skipped, instruction units count: 376
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: ag1.C0861c.h.a.emit(ag1.a, q83.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC13058l interfaceC13058l, C0861c c0861c, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f3139z = interfaceC13058l;
            this.f3135E = c0861c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            h hVar = new h(this.f3139z, this.f3135E, interfaceC30057d);
            hVar.f3138y = obj;
            return hVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0067, code lost:
        
            if (r5.collect(r6, r20) == r2) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                r20 = this;
                r0 = r20
                java.lang.Object r1 = r0.f3138y
                ec3.m r1 = (ec3.InterfaceC13062m) r1
                r83.a r2 = r83.EnumC31071a.f128113w
                int r3 = r0.f3137x
                r4 = 2
                r5 = 1
                if (r3 == 0) goto L2a
                if (r3 == r5) goto L22
                if (r3 != r4) goto L1a
                java.lang.Object r1 = r0.f3136w
                kotlin.jvm.internal.g0 r1 = (p715kotlin.jvm.internal.C22669g0) r1
                p505ts.AbstractC34132o.m107864I(r21)
                goto L6a
            L1a:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L22:
                java.lang.Object r3 = r0.f3136w
                kotlin.jvm.internal.g0 r3 = (p715kotlin.jvm.internal.C22669g0) r3
                p505ts.AbstractC34132o.m107864I(r21)
                goto L53
            L2a:
                kotlin.jvm.internal.g0 r3 = p088dc.AbstractC11895b.m32004w(r21)
                ag1.b r6 = new ag1.b
                r18 = 2047(0x7ff, float:2.868E-42)
                r19 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
                r3.f89336w = r6
                r0.f3138y = r1
                r0.f3136w = r3
                r0.f3137x = r5
                java.lang.Object r5 = r1.emit(r6, r0)
                if (r5 != r2) goto L53
                goto L69
            L53:
                ec3.l r5 = r0.f3139z
                ag1.c$h$a r6 = new ag1.c$h$a
                ag1.c r7 = r0.f3135E
                r6.<init>(r3, r7, r1)
                r1 = 0
                r0.f3138y = r1
                r0.f3136w = r1
                r0.f3137x = r4
                java.lang.Object r1 = r5.collect(r6, r0)
                if (r1 != r2) goto L6a
            L69:
                return r2
            L6a:
                l83.a0 r1 = l83.C23454a0.f92919a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: ag1.C0861c.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C0861c(FilteredListApi api, C30695c actionInteractor, C37378a scopeCoordinator, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(actionInteractor, "actionInteractor");
        AbstractC22676k.m65750j(scopeCoordinator, "scopeCoordinator");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.actionInteractor = actionInteractor;
        this.scopeCoordinator = scopeCoordinator;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: i */
    private final String m2098i(Action action) {
        Request request;
        UpdateAction updateAction = action instanceof UpdateAction ? (UpdateAction) action : null;
        if (updateAction != null && (request = updateAction.getRequest()) != null) {
            if (!AbstractC17176i.m48520v(request.getMethod(), Locale.ROOT, "toUpperCase(...)", "GET")) {
                request = null;
            }
            if (request != null) {
                return request.getPath();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final C0860b m2099j(C0860b state) {
        return C0860b.m2077b(state, false, false, false, null, null, AbstractC0862d.c.f3151a, null, null, null, null, 0, 2015, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:36:0x00f8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: k */
    public final Object m2100k(InterfaceC13062m interfaceC13062m, Action action, C0860b c0860b, InterfaceC30057d<? super C0860b> interfaceC30057d) {
        b bVar;
        Action action2;
        C0860b c0860b2;
        Action action3;
        InterfaceC13062m interfaceC13062m2;
        C0860b c0860b3;
        Object objM2106q;
        InterfaceC13062m interfaceC13062m3 = interfaceC13062m;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f3100G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f3100G = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        b bVar2 = bVar;
        Object objM36575A = bVar2.f3098E;
        Object obj = EnumC31071a.f128113w;
        int i14 = bVar2.f3100G;
        if (i14 != 0) {
            if (i14 == 1) {
                C0860b c0860b4 = (C0860b) bVar2.f3103y;
                action2 = (Action) bVar2.f3102x;
                InterfaceC13062m interfaceC13062m4 = (InterfaceC13062m) bVar2.f3101w;
                AbstractC34132o.m107864I(objM36575A);
                c0860b2 = c0860b4;
                interfaceC13062m3 = interfaceC13062m4;
            } else {
                if (i14 != 2) {
                    if (i14 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(objM36575A);
                    return objM36575A;
                }
                c0860b3 = (C0860b) bVar2.f3103y;
                Action action4 = (Action) bVar2.f3102x;
                InterfaceC13062m interfaceC13062m5 = (InterfaceC13062m) bVar2.f3101w;
                AbstractC34132o.m107864I(objM36575A);
                action3 = action4;
                interfaceC13062m2 = interfaceC13062m5;
            }
            C0860b c0860b5 = c0860b3;
            InterfaceC13062m interfaceC13062m6 = interfaceC13062m2;
            String currentPath = c0860b5.getCurrentPath();
            bVar2.f3101w = null;
            bVar2.f3102x = null;
            bVar2.f3103y = null;
            bVar2.f3104z = null;
            bVar2.f3100G = 3;
            objM2106q = m2106q(interfaceC13062m6, (AbstractC30694b) objM36575A, currentPath, c0860b5, action3, bVar2);
            if (objM2106q != obj) {
                return obj;
            }
            return objM2106q;
        }
        AbstractC34132o.m107864I(objM36575A);
        if (c0860b.getData() != null) {
            c0860b2 = c0860b;
            Object objM2077b = C0860b.m2077b(c0860b2, false, false, false, null, null, AbstractC0862d.b.f3150a, null, null, null, null, 0, 2015, null);
            bVar2.f3101w = interfaceC13062m3;
            action2 = action;
            bVar2.f3102x = action2;
            bVar2.f3103y = c0860b2;
            bVar2.f3100G = 1;
            if (interfaceC13062m3.emit(objM2077b, bVar2) != obj) {
            }
            return obj;
        }
        action2 = action;
        c0860b2 = c0860b;
        if (c0860b2.getCurrentPath() == null) {
            return c0860b2;
        }
        a aVar = new a(this.actionInteractor.interact(new C0456u(new C30698f(action2), 1)));
        bVar2.f3101w = interfaceC13062m3;
        bVar2.f3102x = action2;
        bVar2.f3103y = c0860b2;
        bVar2.f3100G = 2;
        objM36575A = AbstractC13091v.m36575A(aVar, bVar2);
        if (objM36575A != obj) {
            action3 = action2;
            interfaceC13062m2 = interfaceC13062m3;
            c0860b3 = c0860b2;
            C0860b c0860b6 = c0860b3;
            InterfaceC13062m interfaceC13062m7 = interfaceC13062m2;
            String currentPath2 = c0860b6.getCurrentPath();
            bVar2.f3101w = null;
            bVar2.f3102x = null;
            bVar2.f3103y = null;
            bVar2.f3104z = null;
            bVar2.f3100G = 3;
            objM2106q = m2106q(interfaceC13062m7, (AbstractC30694b) objM36575A, currentPath2, c0860b6, action3, bVar2);
            if (objM2106q != obj) {
                return objM2106q;
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:36:0x0124  */
    /* JADX WARN: Code duplicated, block: B:38:0x013c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0143  */
    /* JADX WARN: Code duplicated, block: B:47:0x0166  */
    /* JADX WARN: Code duplicated, block: B:57:0x0197  */
    /* JADX WARN: Code duplicated, block: B:59:0x019b  */
    /* JADX WARN: Code duplicated, block: B:61:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: l */
    public final Object m2101l(InterfaceC13062m interfaceC13062m, String str, C0860b c0860b, boolean z4, InterfaceC30057d<? super C0860b> interfaceC30057d) {
        c cVar;
        C0860b c0860b2;
        C0860b c0860b3;
        boolean z13;
        String str2;
        String str3;
        C0860b c0860b4;
        C0860b c0860b5;
        InterfaceC34385a interfaceC34385a;
        FilteredListPagination pagination;
        ApiRequest nextPageRequest;
        FilteredListPagination pagination2;
        String errorMessageText;
        FilteredListPagination pagination3;
        PaginationStates states;
        PaginationErrorState errorState;
        PaginationStates states2;
        PaginationErrorState errorState2;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f3108H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f3108H = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        c cVar2 = cVar;
        Object objM108729b = cVar2.f3106F;
        Object obj = EnumC31071a.f128113w;
        int i14 = cVar2.f3108H;
        String retryActionText = null;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            if (AbstractC39414r.m125890i0(str)) {
                this.logger.mo85228t("Load: blank path, skipping", new AbstractC30556a.a[0]);
                return C0860b.m2077b(c0860b, false, true, false, null, null, null, null, null, null, null, 0, 2040, null);
            }
            C0860b c0860bM2077b = (!z4 || c0860b.getData() == null) ? C0860b.m2077b(c0860b, true, false, false, null, str, null, null, AbstractC0863e.b.f3153a, null, null, 0, 1896, null) : C0860b.m2077b(c0860b, false, false, true, null, str, null, null, AbstractC0863e.b.f3153a, null, null, 0, 1896, null);
            cVar2.f3109w = null;
            cVar2.f3110x = str;
            c0860b2 = c0860b;
            cVar2.f3111y = c0860b2;
            cVar2.f3112z = c0860bM2077b;
            cVar2.f3105E = z4;
            cVar2.f3108H = 1;
            if (interfaceC13062m.emit(c0860bM2077b, cVar2) != obj) {
                c0860b3 = c0860bM2077b;
                z13 = z4;
                str2 = str;
            }
            return obj;
        }
        if (i14 == 1) {
            boolean z14 = cVar2.f3105E;
            C0860b c0860b6 = (C0860b) cVar2.f3112z;
            C0860b c0860b7 = (C0860b) cVar2.f3111y;
            String str4 = (String) cVar2.f3110x;
            AbstractC34132o.m107864I(objM108729b);
            z13 = z14;
            c0860b3 = c0860b6;
            c0860b2 = c0860b7;
            str2 = str4;
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0860b c0860b8 = (C0860b) cVar2.f3112z;
            c0860b4 = (C0860b) cVar2.f3111y;
            String str5 = (String) cVar2.f3110x;
            AbstractC34132o.m107864I(objM108729b);
            c0860b5 = c0860b8;
            str3 = str5;
        }
        interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            if (interfaceC34385a instanceof InterfaceC34385a.b) {
                return C0860b.m2077b(c0860b5, false, true, false, null, null, null, null, AbstractC0863e.b.f3153a, null, null, 0, 1848, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC34385a.c cVar3 = (InterfaceC34385a.c) interfaceC34385a;
        FilteredListResponse filteredListResponse = (FilteredListResponse) cVar3.m108735a();
        AbstractC0862d.c cVar4 = AbstractC0862d.c.f3151a;
        pagination = ((FilteredListResponse) cVar3.m108735a()).getPagination();
        if (pagination != null) {
            nextPageRequest = pagination.getNextPageRequest();
        } else {
            nextPageRequest = null;
        }
        AbstractC0863e.b bVar = AbstractC0863e.b.f3153a;
        pagination2 = ((FilteredListResponse) cVar3.m108735a()).getPagination();
        if (pagination2 != null || (states2 = pagination2.getStates()) == null || (errorState2 = states2.getErrorState()) == null) {
            errorMessageText = null;
        } else {
            errorMessageText = errorState2.getErrorMessageText();
        }
        pagination3 = ((FilteredListResponse) cVar3.m108735a()).getPagination();
        if (pagination3 != null && (states = pagination3.getStates()) != null && (errorState = states.getErrorState()) != null) {
            retryActionText = errorState.getRetryActionText();
        }
        return c0860b5.m2078a(false, false, false, filteredListResponse, str3, cVar4, nextPageRequest, bVar, errorMessageText, retryActionText, c0860b4.getLoadMoreEpoch() + 1);
        InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
        InterfaceC34116n interfaceC34116n = this.logger;
        d dVar = new d(str2, null);
        cVar2.f3109w = null;
        cVar2.f3110x = str2;
        cVar2.f3111y = c0860b2;
        cVar2.f3112z = c0860b3;
        cVar2.f3105E = z13;
        cVar2.f3108H = 2;
        objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to fetch filtered list", dVar, cVar2, 2, null);
        if (objM108729b != obj) {
            str3 = str2;
            c0860b4 = c0860b2;
            c0860b5 = c0860b3;
            interfaceC34385a = (InterfaceC34385a) objM108729b;
            if (interfaceC34385a instanceof InterfaceC34385a.c) {
                if (interfaceC34385a instanceof InterfaceC34385a.b) {
                    return C0860b.m2077b(c0860b5, false, true, false, null, null, null, null, AbstractC0863e.b.f3153a, null, null, 0, 1848, null);
                }
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC34385a.c cVar5 = (InterfaceC34385a.c) interfaceC34385a;
            FilteredListResponse filteredListResponse2 = (FilteredListResponse) cVar5.m108735a();
            AbstractC0862d.c cVar6 = AbstractC0862d.c.f3151a;
            pagination = ((FilteredListResponse) cVar5.m108735a()).getPagination();
            if (pagination != null) {
                nextPageRequest = pagination.getNextPageRequest();
            } else {
                nextPageRequest = null;
            }
            AbstractC0863e.b bVar2 = AbstractC0863e.b.f3153a;
            pagination2 = ((FilteredListResponse) cVar5.m108735a()).getPagination();
            if (pagination2 != null) {
                errorMessageText = null;
            } else {
                errorMessageText = null;
            }
            pagination3 = ((FilteredListResponse) cVar5.m108735a()).getPagination();
            if (pagination3 != null) {
                retryActionText = errorState.getRetryActionText();
            }
            return c0860b5.m2078a(false, false, false, filteredListResponse2, str3, cVar6, nextPageRequest, bVar2, errorMessageText, retryActionText, c0860b4.getLoadMoreEpoch() + 1);
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final Object m2102m(InterfaceC13062m interfaceC13062m, String str, C0860b c0860b, InterfaceC30057d<? super C0860b> interfaceC30057d) {
        String currentPath = c0860b.getCurrentPath();
        if (c0860b.getData() == null || currentPath == null || AbstractC39414r.m125890i0(currentPath)) {
            return m2101l(interfaceC13062m, str, c0860b, false, interfaceC30057d);
        }
        this.logger.mo85228t(AbstractC2875y.m8300m("LoadInitial: refreshing active tab path=", currentPath, " (seed path=", str, " ignored after re-entry)"), new AbstractC30556a.a[0]);
        return m2101l(interfaceC13062m, currentPath, c0860b, true, interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x010c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0141  */
    /* JADX WARN: Code duplicated, block: B:36:0x0148  */
    /* JADX WARN: Code duplicated, block: B:44:0x016b  */
    /* JADX WARN: Code duplicated, block: B:52:0x018c  */
    /* JADX WARN: Code duplicated, block: B:55:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:57:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:59:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public final Object m2103n(InterfaceC13062m interfaceC13062m, C0860b c0860b, InterfaceC30057d<? super C0860b> interfaceC30057d) {
        e eVar;
        InterfaceC30057d interfaceC30057d2;
        C0860b c0860b2;
        C0860b c0860bM2077b;
        Object obj;
        ApiRequest apiRequest;
        FilteredListResponse filteredListResponse;
        C0860b c0860b3;
        C0860b c0860b4;
        FilteredListResponse filteredListResponse2;
        InterfaceC34385a interfaceC34385a;
        FilteredListPagination pagination;
        ApiRequest nextPageRequest;
        FilteredListPagination pagination2;
        String errorMessageText;
        FilteredListPagination pagination3;
        String retryActionText;
        PaginationStates states;
        PaginationErrorState errorState;
        PaginationStates states2;
        PaginationErrorState errorState2;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f3119H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f3119H = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        e eVar2 = eVar;
        Object obj2 = eVar2.f3117F;
        Object obj3 = EnumC31071a.f128113w;
        int i14 = eVar2.f3119H;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj2);
            ApiRequest nextPageRequest2 = c0860b.getNextPageRequest();
            FilteredListResponse data = c0860b.getData();
            if (nextPageRequest2 != null && data != null) {
                AbstractC0863e paginationState = c0860b.getPaginationState();
                AbstractC0863e.c cVar = AbstractC0863e.c.f3154a;
                if (!AbstractC22676k.m65745e(paginationState, cVar)) {
                    interfaceC30057d2 = null;
                    c0860b2 = c0860b;
                    c0860bM2077b = C0860b.m2077b(c0860b2, false, false, false, null, null, null, null, cVar, null, null, 0, 1919, null);
                    eVar2.f3120w = null;
                    eVar2.f3121x = c0860b2;
                    eVar2.f3122y = nextPageRequest2;
                    eVar2.f3123z = data;
                    eVar2.f3116E = c0860bM2077b;
                    eVar2.f3119H = 1;
                    obj = obj3;
                    if (interfaceC13062m.emit(c0860bM2077b, eVar2) != obj) {
                        apiRequest = nextPageRequest2;
                        filteredListResponse = data;
                    }
                    return obj;
                }
            }
            return c0860b;
        }
        if (i14 == 1) {
            C0860b c0860b5 = (C0860b) eVar2.f3116E;
            FilteredListResponse filteredListResponse3 = (FilteredListResponse) eVar2.f3123z;
            apiRequest = (ApiRequest) eVar2.f3122y;
            C0860b c0860b6 = (C0860b) eVar2.f3121x;
            AbstractC34132o.m107864I(obj2);
            obj = obj3;
            c0860bM2077b = c0860b5;
            interfaceC30057d2 = null;
            filteredListResponse = filteredListResponse3;
            c0860b2 = c0860b6;
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0860b c0860b7 = (C0860b) eVar2.f3116E;
            FilteredListResponse filteredListResponse4 = (FilteredListResponse) eVar2.f3123z;
            C0860b c0860b8 = (C0860b) eVar2.f3121x;
            AbstractC34132o.m107864I(obj2);
            c0860b4 = c0860b7;
            filteredListResponse2 = filteredListResponse4;
            c0860b3 = c0860b8;
            interfaceC30057d2 = null;
        }
        interfaceC34385a = (InterfaceC34385a) obj2;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            if (interfaceC34385a instanceof InterfaceC34385a.b) {
                return C0860b.m2077b(c0860b4, false, false, false, null, null, null, null, AbstractC0863e.a.f3152a, null, null, 0, 1919, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC34385a.c cVar2 = (InterfaceC34385a.c) interfaceC34385a;
        FilteredListResponse filteredListResponseCopy$default = FilteredListResponse.copy$default(filteredListResponse2, null, AbstractC25265s.m74129g1(filteredListResponse2.getItems(), ((FilteredListResponse) cVar2.m108735a()).getItems()), ((FilteredListResponse) cVar2.m108735a()).getPagination(), 1, null);
        pagination = ((FilteredListResponse) cVar2.m108735a()).getPagination();
        if (pagination != null) {
            nextPageRequest = pagination.getNextPageRequest();
        } else {
            nextPageRequest = interfaceC30057d2;
        }
        AbstractC0863e.b bVar = AbstractC0863e.b.f3153a;
        pagination2 = ((FilteredListResponse) cVar2.m108735a()).getPagination();
        if (pagination2 != null || (states2 = pagination2.getStates()) == null || (errorState2 = states2.getErrorState()) == null) {
            errorMessageText = interfaceC30057d2;
        } else {
            errorMessageText = errorState2.getErrorMessageText();
        }
        pagination3 = ((FilteredListResponse) cVar2.m108735a()).getPagination();
        if (pagination3 != null || (states = pagination3.getStates()) == null || (errorState = states.getErrorState()) == null) {
            retryActionText = interfaceC30057d2;
        } else {
            retryActionText = errorState.getRetryActionText();
        }
        return C0860b.m2077b(c0860b4, false, false, false, filteredListResponseCopy$default, null, null, nextPageRequest, bVar, errorMessageText, retryActionText, c0860b3.getLoadMoreEpoch() + 1, 55, null);
        InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
        InterfaceC34116n interfaceC34116n = this.logger;
        f fVar = new f(apiRequest, interfaceC30057d2);
        eVar2.f3120w = interfaceC30057d2;
        eVar2.f3121x = c0860b2;
        eVar2.f3122y = interfaceC30057d2;
        eVar2.f3123z = filteredListResponse;
        eVar2.f3116E = c0860bM2077b;
        eVar2.f3119H = 2;
        Object objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to load next page", fVar, eVar2, 2, null);
        if (objM108729b != obj) {
            c0860b3 = c0860b2;
            c0860b4 = c0860bM2077b;
            obj2 = objM108729b;
            filteredListResponse2 = filteredListResponse;
            interfaceC34385a = (InterfaceC34385a) obj2;
            if (interfaceC34385a instanceof InterfaceC34385a.c) {
                if (interfaceC34385a instanceof InterfaceC34385a.b) {
                    return C0860b.m2077b(c0860b4, false, false, false, null, null, null, null, AbstractC0863e.a.f3152a, null, null, 0, 1919, null);
                }
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC34385a.c cVar3 = (InterfaceC34385a.c) interfaceC34385a;
            FilteredListResponse filteredListResponseCopy$default2 = FilteredListResponse.copy$default(filteredListResponse2, null, AbstractC25265s.m74129g1(filteredListResponse2.getItems(), ((FilteredListResponse) cVar3.m108735a()).getItems()), ((FilteredListResponse) cVar3.m108735a()).getPagination(), 1, null);
            pagination = ((FilteredListResponse) cVar3.m108735a()).getPagination();
            if (pagination != null) {
                nextPageRequest = pagination.getNextPageRequest();
            } else {
                nextPageRequest = interfaceC30057d2;
            }
            AbstractC0863e.b bVar2 = AbstractC0863e.b.f3153a;
            pagination2 = ((FilteredListResponse) cVar3.m108735a()).getPagination();
            if (pagination2 != null) {
                errorMessageText = interfaceC30057d2;
            } else {
                errorMessageText = interfaceC30057d2;
            }
            pagination3 = ((FilteredListResponse) cVar3.m108735a()).getPagination();
            if (pagination3 != null) {
                retryActionText = interfaceC30057d2;
            } else {
                retryActionText = interfaceC30057d2;
            }
            return C0860b.m2077b(c0860b4, false, false, false, filteredListResponseCopy$default2, null, null, nextPageRequest, bVar2, errorMessageText, retryActionText, c0860b3.getLoadMoreEpoch() + 1, 55, null);
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final Object m2104o(InterfaceC13062m interfaceC13062m, C0860b c0860b, InterfaceC30057d<? super C0860b> interfaceC30057d) {
        String currentPath = c0860b.getCurrentPath();
        if (currentPath != null && !AbstractC39414r.m125890i0(currentPath)) {
            return m2101l(interfaceC13062m, currentPath, c0860b, false, interfaceC30057d);
        }
        this.logger.mo85228t("Retry: no currentPath, skipping", new AbstractC30556a.a[0]);
        return c0860b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final Object m2105p(InterfaceC13062m interfaceC13062m, Action action, C0860b c0860b, InterfaceC30057d<? super C0860b> interfaceC30057d) {
        String strM2098i = m2098i(action);
        if (strM2098i != null && !AbstractC39414r.m125890i0(strM2098i)) {
            return m2101l(interfaceC13062m, strM2098i, c0860b, true, interfaceC30057d);
        }
        this.logger.mo85228t("SelectFilter: no GET path, skipping fetch", new AbstractC30556a.a[0]);
        return c0860b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX INFO: renamed from: q */
    public final Object m2106q(InterfaceC13062m interfaceC13062m, AbstractC30694b abstractC30694b, String str, C0860b c0860b, Action action, InterfaceC30057d<? super C0860b> interfaceC30057d) {
        g gVar;
        InterfaceC13062m interfaceC13062m2;
        String str2;
        C0860b c0860b2;
        if (interfaceC30057d instanceof g) {
            gVar = (g) interfaceC30057d;
            int i13 = gVar.f3130H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gVar.f3130H = i13 - Integer.MIN_VALUE;
            } else {
                gVar = new g(interfaceC30057d);
            }
        } else {
            gVar = new g(interfaceC30057d);
        }
        Object obj = gVar.f3128F;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = gVar.f3130H;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (!(abstractC30694b instanceof AbstractC30694b.f)) {
                if (abstractC30694b instanceof AbstractC30694b.a) {
                    AbstractC30694b.a aVar = (AbstractC30694b.a) abstractC30694b;
                    this.logger.mo85222m(AbstractC11266d.m30461o("PerformItemAction failed: ", aVar.getMessage()), new AbstractC30556a.a[0]);
                    return C0860b.m2077b(c0860b, false, false, false, null, null, new AbstractC0862d.a(aVar.getMessage(), action), null, null, null, null, 0, 2015, null);
                }
                if (abstractC30694b instanceof AbstractC30694b.b) {
                    this.logger.mo85226q("PerformItemAction: backend returned Interaction; not routed on this host yet", new AbstractC30556a.a[0]);
                    return C0860b.m2077b(c0860b, false, false, false, null, null, new AbstractC0862d.a("", action), null, null, null, null, 0, 2015, null);
                }
                throw new IllegalStateException("Unexpected ActionDomainState: " + abstractC30694b);
            }
            C37378a c37378a = this.scopeCoordinator;
            interfaceC13062m2 = interfaceC13062m;
            gVar.f3131w = interfaceC13062m2;
            gVar.f3132x = null;
            str2 = str;
            gVar.f3133y = str2;
            c0860b2 = c0860b;
            gVar.f3134z = c0860b2;
            gVar.f3127E = null;
            gVar.f3130H = 1;
            if (c37378a.m119657b("CommunityFollowerRefreshScope", gVar) == obj2) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        C0860b c0860b3 = (C0860b) gVar.f3134z;
        String str3 = (String) gVar.f3133y;
        InterfaceC13062m interfaceC13062m3 = (InterfaceC13062m) gVar.f3131w;
        AbstractC34132o.m107864I(obj);
        c0860b2 = c0860b3;
        str2 = str3;
        interfaceC13062m2 = interfaceC13062m3;
        gVar.f3131w = null;
        gVar.f3132x = null;
        gVar.f3133y = null;
        gVar.f3134z = null;
        gVar.f3127E = null;
        gVar.f3130H = 2;
        Object objM2101l = m2101l(interfaceC13062m2, str2, c0860b2, false, gVar);
        return objM2101l == obj2 ? obj2 : objM2101l;
    }

    /* JADX INFO: renamed from: r */
    public final InterfaceC13058l m2107r(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13084s1(new h(upstream, this, null));
    }

    public /* synthetic */ C0861c(FilteredListApi filteredListApi, C30695c c30695c, C37378a c37378a, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(filteredListApi, c30695c, c37378a, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("FilteredListInteractor") : interfaceC34116n);
    }
}
