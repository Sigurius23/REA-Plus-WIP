package mc2;

import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.settings.referafriendmenu.api.ReferAFriendMenuApi;
import com.whoop.settings.referafriendmenu.api.ReferAFriendMenuGetRequest;
import com.whoop.settings.referafriendmenu.model.ReferAFriendMenuModel;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import l83.C23454a0;
import nm0.C26832c;
import nm0.InterfaceC26834e;
import od1.InterfaceC27844g;
import p000.AbstractC11266d;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
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

/* JADX INFO: renamed from: mc2.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lmc2/c;", "Lod1/g;", "Lmc2/a;", "Lmc2/b;", "Lcom/whoop/settings/referafriendmenu/api/ReferAFriendMenuApi;", "api", "Lnm0/e;", "cachedApiSource", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/settings/referafriendmenu/api/ReferAFriendMenuApi;Lnm0/e;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lq83/d;)Ljava/lang/Object;", "Lec3/l;", "i", "()Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/settings/referafriendmenu/api/ReferAFriendMenuApi;", "b", "Lnm0/e;", "c", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "d", "Ltr2/n;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25424c implements InterfaceC27844g<AbstractC25422a, AbstractC25423b> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ReferAFriendMenuApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: mc2.c$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.referafriendmenu.RafMenuInteractor", m100430f = "RafMenuInteractor.kt", m100431l = {42}, m100432m = "fetchRafMenuData", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f99540w;

        /* JADX INFO: renamed from: y */
        int f99542y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f99540w = obj;
            this.f99542y |= Integer.MIN_VALUE;
            return C25424c.this.m74635h(this);
        }
    }

    /* JADX INFO: renamed from: mc2.c$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.referafriendmenu.RafMenuInteractor$fetchRafMenuData$response$1", m100430f = "RafMenuInteractor.kt", m100431l = {43}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/settings/referafriendmenu/model/ReferAFriendMenuModel;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f99543w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C25424c.this.new b(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f99543w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ReferAFriendMenuApi referAFriendMenuApi = C25424c.this.api;
            this.f99543w = 1;
            Object moreTabRafData = referAFriendMenuApi.getMoreTabRafData(this);
            return moreTabRafData == enumC31071a ? enumC31071a : moreTabRafData;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super ReferAFriendMenuModel> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: mc2.c$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.referafriendmenu.RafMenuInteractor$getRafMenuDataFromCache$$inlined$cacheAPI$1", m100430f = "RafMenuInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f99545w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f99546x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f99547y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f99548z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f99548z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            c cVar = new c(interfaceC30057d, this.f99548z);
            cVar.f99546x = interfaceC13062m;
            cVar.f99547y = c26832c;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f99545w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f99546x;
                C26832c c26832c = (C26832c) this.f99547y;
                InterfaceC26834e interfaceC26834e = this.f99548z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(ReferAFriendMenuModel.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(ReferAFriendMenuModel.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f99546x = null;
                this.f99547y = null;
                this.f99545w = 1;
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

    /* JADX INFO: renamed from: mc2.c$d */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f99549w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C25424c f99550x;

        /* JADX INFO: renamed from: mc2.c$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f99551w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C25424c f99552x;

            /* JADX INFO: renamed from: mc2.c$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.settings.referafriendmenu.RafMenuInteractor$getRafMenuDataFromCache$$inlined$map$1$2", m100430f = "RafMenuInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41991a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f99553E;

                /* JADX INFO: renamed from: F */
                Object f99554F;

                /* JADX INFO: renamed from: G */
                Object f99555G;

                /* JADX INFO: renamed from: H */
                int f99556H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f99557w;

                /* JADX INFO: renamed from: x */
                int f99558x;

                /* JADX INFO: renamed from: y */
                Object f99559y;

                public C41991a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f99557w = obj;
                    this.f99558x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C25424c c25424c) {
                this.f99551w = interfaceC13062m;
                this.f99552x = c25424c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41991a c41991a;
                Object obj2;
                AbstractC25423b.c cVar;
                if (interfaceC30057d instanceof C41991a) {
                    c41991a = (C41991a) interfaceC30057d;
                    int i13 = c41991a.f99558x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41991a.f99558x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41991a = new C41991a(interfaceC30057d);
                    }
                } else {
                    c41991a = new C41991a(interfaceC30057d);
                }
                Object obj3 = c41991a.f99557w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41991a.f99558x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj3);
                    InterfaceC13062m interfaceC13062m = this.f99551w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.e) {
                        obj2 = AbstractC25423b.b.f99534a;
                    } else {
                        if (interfaceC29354a instanceof InterfaceC29354a.a.b) {
                            cVar = new AbstractC25423b.c((ReferAFriendMenuModel) ((InterfaceC29354a.a.b) interfaceC29354a).getData());
                        } else if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
                            cVar = new AbstractC25423b.c((ReferAFriendMenuModel) ((InterfaceC29354a.a.C42173a) interfaceC29354a).getData());
                        } else if (interfaceC29354a instanceof InterfaceC29354a.d) {
                            InterfaceC29354a.d dVar = (InterfaceC29354a.d) interfaceC29354a;
                            this.f99552x.logger.mo85222m(AbstractC11266d.m30461o("Fetching RAF menu data failed ", dVar.getErrorMessage()), new AbstractC30556a.a[0]);
                            cVar = new AbstractC25423b.c((ReferAFriendMenuModel) dVar.getData());
                        } else if (interfaceC29354a instanceof InterfaceC29354a.c) {
                            this.f99552x.logger.mo85222m(AbstractC11266d.m30461o("Fetching RAF menu data failed ", ((InterfaceC29354a.c) interfaceC29354a).getErrorMessage()), new AbstractC30556a.a[0]);
                            obj2 = AbstractC25423b.a.f99533a;
                        } else {
                            this.f99552x.logger.mo85222m("Fetching RAF menu data failed with unknown error", new AbstractC30556a.a[0]);
                            obj2 = AbstractC25423b.a.f99533a;
                        }
                        obj2 = cVar;
                    }
                    c41991a.f99559y = null;
                    c41991a.f99553E = null;
                    c41991a.f99554F = null;
                    c41991a.f99555G = null;
                    c41991a.f99556H = 0;
                    c41991a.f99558x = 1;
                    if (interfaceC13062m.emit(obj2, c41991a) == enumC31071a) {
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

        public d(InterfaceC13058l interfaceC13058l, C25424c c25424c) {
            this.f99549w = interfaceC13058l;
            this.f99550x = c25424c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f99549w.collect(new a(interfaceC13062m, this.f99550x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: mc2.c$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.referafriendmenu.RafMenuInteractor$interact$$inlined$flatMapLatest$1", m100430f = "RafMenuInteractor.kt", m100431l = {195, 189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        Object f99561E;

        /* JADX INFO: renamed from: F */
        Object f99562F;

        /* JADX INFO: renamed from: G */
        Object f99563G;

        /* JADX INFO: renamed from: H */
        int f99564H;

        /* JADX INFO: renamed from: w */
        int f99565w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f99566x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f99567y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C25424c f99568z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC30057d interfaceC30057d, C25424c c25424c) {
            super(3, interfaceC30057d);
            this.f99568z = c25424c;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC25422a abstractC25422a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            e eVar = new e(interfaceC30057d, this.f99568z);
            eVar.f99566x = interfaceC13062m;
            eVar.f99567y = abstractC25422a;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x006c, code lost:
        
            if (r7 == r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0086, code lost:
        
            if (ec3.AbstractC13091v.m36613w(r1, r7, r6) == r0) goto L21;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r6.f99565w
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L32
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r6.f99566x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                p505ts.AbstractC34132o.m107864I(r7)
                goto L89
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                java.lang.Object r1 = r6.f99563G
                mc2.a r1 = (mc2.AbstractC25422a) r1
                java.lang.Object r1 = r6.f99562F
                q83.d r1 = (q83.InterfaceC30057d) r1
                java.lang.Object r1 = r6.f99561E
                ec3.m r1 = (ec3.InterfaceC13062m) r1
                java.lang.Object r3 = r6.f99566x
                ec3.m r3 = (ec3.InterfaceC13062m) r3
                p505ts.AbstractC34132o.m107864I(r7)
                goto L6f
            L32:
                p505ts.AbstractC34132o.m107864I(r7)
                java.lang.Object r7 = r6.f99566x
                r1 = r7
                ec3.m r1 = (ec3.InterfaceC13062m) r1
                java.lang.Object r7 = r6.f99567y
                mc2.a r7 = (mc2.AbstractC25422a) r7
                boolean r7 = r7 instanceof mc2.AbstractC25422a.a
                if (r7 == 0) goto L8c
                mc2.c r7 = r6.f99568z
                com.whoop.data.repositories.FeatureFlagChecker r7 = mc2.C25424c.m74632e(r7)
                java.lang.String r5 = "use-refer-a-friend-menu-cache-android"
                boolean r7 = r7.isFeatureEnabled(r5)
                if (r7 == 0) goto L57
                mc2.c r7 = r6.f99568z
                ec3.l r7 = mc2.C25424c.m74634g(r7)
                goto L76
            L57:
                mc2.c r7 = r6.f99568z
                r6.f99566x = r4
                r6.f99567y = r4
                r6.f99561E = r1
                r6.f99562F = r4
                r6.f99563G = r4
                r5 = 0
                r6.f99564H = r5
                r6.f99565w = r3
                java.lang.Object r7 = mc2.C25424c.m74630c(r7, r6)
                if (r7 != r0) goto L6f
                goto L88
            L6f:
                a6.u r3 = new a6.u
                r5 = 1
                r3.<init>(r7, r5)
                r7 = r3
            L76:
                r6.f99566x = r4
                r6.f99567y = r4
                r6.f99561E = r4
                r6.f99562F = r4
                r6.f99563G = r4
                r6.f99565w = r2
                java.lang.Object r7 = ec3.AbstractC13091v.m36613w(r1, r7, r6)
                if (r7 != r0) goto L89
            L88:
                return r0
            L89:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            L8c:
                kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: mc2.C25424c.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (AbstractC25422a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    public C25424c(ReferAFriendMenuApi api, InterfaceC26834e cachedApiSource, FeatureFlagChecker featureFlagChecker, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.cachedApiSource = cachedApiSource;
        this.featureFlagChecker = featureFlagChecker;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: h */
    public final Object m74635h(InterfaceC30057d<? super AbstractC25423b> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f99542y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f99542y = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f99540w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f99542y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(null);
            aVar2.f99542y = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Error fetching ReferAFriend menu", bVar, aVar2, 2, null);
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
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return AbstractC25423b.a.f99533a;
        }
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return new AbstractC25423b.c((ReferAFriendMenuModel) ((InterfaceC34385a.c) interfaceC34385a).m108735a());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final InterfaceC13058l m74636i() {
        return new d(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new ReferAFriendMenuGetRequest(), 1), null, null, 3, null), new c(null, this.cachedApiSource)), this);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new e(null, this));
    }
}
