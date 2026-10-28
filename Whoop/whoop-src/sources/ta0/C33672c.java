package ta0;

import c93.InterfaceC4351m;
import com.whoop.advancedlabs.domain.AdvancedLabsApi;
import com.whoop.advancedlabs.domain.GetAllRecordingsRequest;
import com.whoop.advancedlabs.domain.models.AllRecordingsResponse;
import com.whoop.data.repositories.FeatureFlagChecker;
import ec3.AbstractC13091v;
import ec3.C13084s1;
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
import p007a6.C0456u;
import p098dt.AbstractC12350b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pm0.InterfaceC29354a;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sm0.AbstractC32714a;
import tr2.InterfaceC34116n;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: ta0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0012J#\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, m65681d2 = {"Lta0/c;", "Lod1/g;", "Lta0/a;", "Lta0/b;", "Lnm0/e;", "cachedApiSource", "Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;", "api", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Ltr2/n;", "logger", "<init>", "(Lnm0/e;Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;)V", "", "biomarkerId", "Lec3/l;", "g", "(Ljava/lang/String;)Lec3/l;", "f", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lnm0/e;", "b", "Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;", "c", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "d", "Ltr2/n;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33672c implements InterfaceC27844g<AbstractC33670a, AbstractC33671b> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AdvancedLabsApi api;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: ta0.c$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.allrecordings.domain.AllRecordingsInteractor$fetchCachedData$$inlined$cacheAPI$1", m100430f = "AllRecordingsInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f140624w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f140625x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f140626y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f140627z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f140627z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f140627z);
            aVar.f140625x = interfaceC13062m;
            aVar.f140626y = c26832c;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f140624w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f140625x;
                C26832c c26832c = (C26832c) this.f140626y;
                InterfaceC26834e interfaceC26834e = this.f140627z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(AllRecordingsResponse.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(AllRecordingsResponse.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f140625x = null;
                this.f140626y = null;
                this.f140624w = 1;
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

    /* JADX INFO: renamed from: ta0.c$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f140628w;

        /* JADX INFO: renamed from: ta0.c$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f140629w;

            /* JADX INFO: renamed from: ta0.c$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.allrecordings.domain.AllRecordingsInteractor$fetchCachedData$$inlined$map$1$2", m100430f = "AllRecordingsInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42365a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f140630E;

                /* JADX INFO: renamed from: F */
                Object f140631F;

                /* JADX INFO: renamed from: G */
                Object f140632G;

                /* JADX INFO: renamed from: H */
                int f140633H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f140634w;

                /* JADX INFO: renamed from: x */
                int f140635x;

                /* JADX INFO: renamed from: y */
                Object f140636y;

                public C42365a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f140634w = obj;
                    this.f140635x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f140629w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42365a c42365a;
                AbstractC33671b.c cVar;
                Object obj2;
                if (interfaceC30057d instanceof C42365a) {
                    c42365a = (C42365a) interfaceC30057d;
                    int i13 = c42365a.f140635x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42365a.f140635x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42365a = new C42365a(interfaceC30057d);
                    }
                } else {
                    c42365a = new C42365a(interfaceC30057d);
                }
                Object obj3 = c42365a.f140634w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42365a.f140635x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj3);
                    InterfaceC13062m interfaceC13062m = this.f140629w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.e) {
                        obj2 = AbstractC33671b.b.f140618a;
                    } else {
                        if (interfaceC29354a instanceof InterfaceC29354a.a) {
                            cVar = new AbstractC33671b.c((AllRecordingsResponse) ((InterfaceC29354a.a) interfaceC29354a).getData());
                        } else if (interfaceC29354a instanceof InterfaceC29354a.c) {
                            obj2 = AbstractC33671b.a.f140617a;
                        } else {
                            if (!(interfaceC29354a instanceof InterfaceC29354a.d)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            cVar = new AbstractC33671b.c((AllRecordingsResponse) ((InterfaceC29354a.d) interfaceC29354a).getData());
                        }
                        obj2 = cVar;
                    }
                    c42365a.f140636y = null;
                    c42365a.f140630E = null;
                    c42365a.f140631F = null;
                    c42365a.f140632G = null;
                    c42365a.f140633H = 0;
                    c42365a.f140635x = 1;
                    if (interfaceC13062m.emit(obj2, c42365a) == enumC31071a) {
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
            this.f140628w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f140628w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ta0.c$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.allrecordings.domain.AllRecordingsInteractor$fetchRemoteData$1", m100430f = "AllRecordingsInteractor.kt", m100431l = {73, 77, 78}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lta0/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f140638E;

        /* JADX INFO: renamed from: w */
        Object f140639w;

        /* JADX INFO: renamed from: x */
        int f140640x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f140641y;

        /* JADX INFO: renamed from: ta0.c$c$a */
        @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.allrecordings.domain.AllRecordingsInteractor$fetchRemoteData$1$response$1", m100430f = "AllRecordingsInteractor.kt", m100431l = {74}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/advancedlabs/domain/models/AllRecordingsResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f140643w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C33672c f140644x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f140645y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C33672c c33672c, String str, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f140644x = c33672c;
                this.f140645y = str;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f140644x, this.f140645y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f140643w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                AdvancedLabsApi advancedLabsApi = this.f140644x.api;
                String str = this.f140645y;
                this.f140643w = 1;
                Object allRecordings = advancedLabsApi.getAllRecordings(str, this);
                return allRecordings == enumC31071a ? enumC31071a : allRecordings;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super AllRecordingsResponse> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f140638E = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = C33672c.this.new c(this.f140638E, interfaceC30057d);
            cVar.f140641y = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
        
            if (r8.emit(r1, r13) == r9) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0081, code lost:
        
            if (r8.emit(r0, r13) == r9) goto L24;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = r13.f140641y
                r8 = r0
                ec3.m r8 = (ec3.InterfaceC13062m) r8
                r83.a r9 = r83.EnumC31071a.f128113w
                int r0 = r13.f140640x
                r10 = 3
                r11 = 2
                r1 = 1
                r12 = 0
                if (r0 == 0) goto L2b
                if (r0 == r1) goto L26
                if (r0 == r11) goto L1e
                if (r0 != r10) goto L16
                goto L1e
            L16:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L1e:
                java.lang.Object r0 = r13.f140639w
                u02.a r0 = (u02.InterfaceC34385a) r0
                p505ts.AbstractC34132o.m107864I(r14)
                goto L84
            L26:
                p505ts.AbstractC34132o.m107864I(r14)
                r0 = r14
                goto L51
            L2b:
                p505ts.AbstractC34132o.m107864I(r14)
                u02.a$a r0 = u02.InterfaceC34385a.INSTANCE
                ta0.c r2 = ta0.C33672c.this
                tr2.n r2 = ta0.C33672c.m106409e(r2)
                ta0.c$c$a r4 = new ta0.c$c$a
                ta0.c r3 = ta0.C33672c.this
                java.lang.String r6 = r13.f140638E
                r4.<init>(r3, r6, r12)
                r13.f140641y = r8
                r13.f140640x = r1
                r1 = r2
                r2 = 0
                java.lang.String r3 = "Failed to fetch all recordings"
                r6 = 2
                r7 = 0
                r5 = r13
                java.lang.Object r0 = u02.InterfaceC34385a.Companion.m108729b(r0, r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r9) goto L51
                goto L83
            L51:
                u02.a r0 = (u02.InterfaceC34385a) r0
                boolean r1 = r0 instanceof u02.InterfaceC34385a.c
                if (r1 == 0) goto L71
                ta0.b$c r1 = new ta0.b$c
                u02.a$c r0 = (u02.InterfaceC34385a.c) r0
                java.lang.Object r0 = r0.m108735a()
                com.whoop.advancedlabs.domain.models.AllRecordingsResponse r0 = (com.whoop.advancedlabs.domain.models.AllRecordingsResponse) r0
                r1.<init>(r0)
                r13.f140641y = r12
                r13.f140639w = r12
                r13.f140640x = r11
                java.lang.Object r0 = r8.emit(r1, r13)
                if (r0 != r9) goto L84
                goto L83
            L71:
                boolean r0 = r0 instanceof u02.InterfaceC34385a.b
                if (r0 == 0) goto L87
                ta0.b$a r0 = ta0.AbstractC33671b.a.f140617a
                r13.f140641y = r12
                r13.f140639w = r12
                r13.f140640x = r10
                java.lang.Object r0 = r8.emit(r0, r13)
                if (r0 != r9) goto L84
            L83:
                return r9
            L84:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            L87:
                kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ta0.C33672c.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ta0.c$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.allrecordings.domain.AllRecordingsInteractor$interact$1", m100430f = "AllRecordingsInteractor.kt", m100431l = {33}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lta0/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f140646w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f140647x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC13058l f140648y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C33672c f140649z;

        /* JADX INFO: renamed from: ta0.c$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f140650w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C33672c f140651x;

            public a(InterfaceC13062m interfaceC13062m, C33672c c33672c) {
                this.f140650w = interfaceC13062m;
                this.f140651x = c33672c;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC33670a abstractC33670a, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
                boolean z4 = abstractC33670a instanceof AbstractC33670a.a;
                C23454a0 c23454a0 = C23454a0.f92919a;
                if (!z4) {
                    if (abstractC33670a instanceof AbstractC33670a.b) {
                        return c23454a0;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                AbstractC33670a.a aVar = (AbstractC33670a.a) abstractC33670a;
                String biomarkerId = aVar.getBiomarkerId();
                if (biomarkerId == null || AbstractC39414r.m125890i0(biomarkerId)) {
                    Object objEmit = this.f140650w.emit(AbstractC33671b.a.f140617a, interfaceC30057d);
                    return objEmit == EnumC31071a.f128113w ? objEmit : c23454a0;
                }
                Object objM36613w = AbstractC13091v.m36613w(this.f140650w, this.f140651x.m106411g(aVar.getBiomarkerId()), interfaceC30057d);
                return objM36613w == EnumC31071a.f128113w ? objM36613w : c23454a0;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC13058l interfaceC13058l, C33672c c33672c, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f140648y = interfaceC13058l;
            this.f140649z = c33672c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = new d(this.f140648y, this.f140649z, interfaceC30057d);
            dVar.f140647x = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f140647x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f140646w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058l = this.f140648y;
                a aVar = new a(interfaceC13062m, this.f140649z);
                this.f140647x = null;
                this.f140646w = 1;
                if (interfaceC13058l.collect(aVar, this) == enumC31071a) {
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

    public C33672c(InterfaceC26834e cachedApiSource, AdvancedLabsApi api, FeatureFlagChecker featureFlagChecker, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(logger, "logger");
        this.cachedApiSource = cachedApiSource;
        this.api = api;
        this.featureFlagChecker = featureFlagChecker;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: f */
    private final InterfaceC13058l m106410f(String biomarkerId) {
        return new b(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new GetAllRecordingsRequest(biomarkerId), 1), AbstractC12350b.m34570S("AdvancedLabsScope"), null, 2, null), new a(null, this.cachedApiSource)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final InterfaceC13058l m106411g(String biomarkerId) {
        return this.featureFlagChecker.isFeatureEnabled("advanced-labs-android-caching") ? m106410f(biomarkerId) : m106412h(biomarkerId);
    }

    /* JADX INFO: renamed from: h */
    private final InterfaceC13058l m106412h(String biomarkerId) {
        return new C13084s1(new c(biomarkerId, null));
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13084s1(new d(upstream, this, null));
    }

    public /* synthetic */ C33672c(InterfaceC26834e interfaceC26834e, AdvancedLabsApi advancedLabsApi, FeatureFlagChecker featureFlagChecker, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC26834e, advancedLabsApi, featureFlagChecker, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("AllRecordingsInteractor") : interfaceC34116n);
    }
}
