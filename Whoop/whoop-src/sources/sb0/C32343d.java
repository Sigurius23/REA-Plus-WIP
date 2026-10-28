package sb0;

import bc3.AbstractC3034m0;
import c93.InterfaceC4351m;
import com.whoop.advancedlabs.domain.GetAdvancedLabsRequest;
import com.whoop.advancedlabs.domain.models.AdvancedLabsResponse;
import com.whoop.data.repositories.FeatureFlagChecker;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13060l1;
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
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pm0.AbstractC29355b;
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

/* JADX INFO: renamed from: sb0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00032\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, m65681d2 = {"Lsb0/d;", "Lod1/g;", "Lsb0/b;", "Lsb0/c;", "Lnm0/e;", "cachedApiSource", "Ltr2/n;", "logger", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lnm0/e;Ltr2/n;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Lec3/l;", "Lsb0/e;", "k", "()Lec3/l;", "previousState", "action", "g", "(Lsb0/c;Lsb0/b;)Lsb0/c;", "", "manualRefresh", "i", "(Z)Lec3/l;", "Lpm0/a$c;", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;", "cacheResult", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lpm0/a$c;)Lsb0/c;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lnm0/e;", "b", "Ltr2/n;", "c", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32343d implements InterfaceC27844g<AbstractC32341b, C32342c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: sb0.d$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.domain.AdvancedLabsInteractor$interact$$inlined$flatMapLatest$1", m100430f = "AdvancedLabsInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f133864w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f133865x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f133866y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C32343d f133867z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, C32343d c32343d) {
            super(3, interfaceC30057d);
            this.f133867z = c32343d;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC32341b abstractC32341b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f133867z);
            aVar.f133865x = interfaceC13062m;
            aVar.f133866y = abstractC32341b;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c13084s1;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f133864w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f133865x;
                AbstractC32341b abstractC32341b = (AbstractC32341b) this.f133866y;
                if (abstractC32341b instanceof AbstractC32341b.a) {
                    c13084s1 = this.f133867z.m100657k();
                } else if (abstractC32341b instanceof AbstractC32341b.b) {
                    c13084s1 = this.f133867z.m100657k();
                    if (this.f133867z.featureFlagChecker.isFeatureEnabled("advanced-labs-post-action-delay")) {
                        c13084s1 = new C13015a0(new b(null), c13084s1);
                    }
                } else {
                    c13084s1 = new C13084s1(new c(abstractC32341b, null));
                }
                this.f133865x = null;
                this.f133866y = null;
                this.f133864w = 1;
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
            return invoke((InterfaceC13062m) obj, (AbstractC32341b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: sb0.d$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.domain.AdvancedLabsInteractor$interact$1$1", m100430f = "AdvancedLabsInteractor.kt", m100431l = {41}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lsb0/e;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f133868w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f133868w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                this.f133868w = 1;
                if (AbstractC3034m0.m8782b(500L, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: sb0.d$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.domain.AdvancedLabsInteractor$interact$1$2", m100430f = "AdvancedLabsInteractor.kt", m100431l = {47}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lsb0/e;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f133869w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f133870x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC32341b f133871y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC32341b abstractC32341b, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f133871y = abstractC32341b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(this.f133871y, interfaceC30057d);
            cVar.f133870x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f133870x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f133869w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC32344e.b bVar = new AbstractC32344e.b(this.f133871y);
                this.f133870x = null;
                this.f133869w = 1;
                if (interfaceC13062m.emit(bVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: sb0.d$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.domain.AdvancedLabsInteractor$interact$2", m100430f = "AdvancedLabsInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lsb0/c;", "previousState", "Lsb0/e;", "action", "<anonymous>", "(Lsb0/c;Lsb0/e;)Lsb0/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f133872w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f133873x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f133874y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C32342c c32342c, AbstractC32344e abstractC32344e, InterfaceC30057d<? super C32342c> interfaceC30057d) {
            d dVar = C32343d.this.new d(interfaceC30057d);
            dVar.f133873x = c32342c;
            dVar.f133874y = abstractC32344e;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C32342c c32342c = (C32342c) this.f133873x;
            AbstractC32344e abstractC32344e = (AbstractC32344e) this.f133874y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f133872w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (abstractC32344e instanceof AbstractC32344e.b) {
                return C32343d.this.m100653g(c32342c, ((AbstractC32344e.b) abstractC32344e).getDomainAction());
            }
            if (!(abstractC32344e instanceof AbstractC32344e.a)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC32344e.a aVar = (AbstractC32344e.a) abstractC32344e;
            C32342c domainState = aVar.getDomainState();
            String selectedSegmentId = c32342c.getSelectedSegmentId();
            if (selectedSegmentId == null || selectedSegmentId.length() == 0) {
                selectedSegmentId = null;
            }
            if (selectedSegmentId == null) {
                selectedSegmentId = aVar.getDomainState().getSelectedSegmentId();
            }
            return C32342c.m100643b(domainState, selectedSegmentId, null, null, false, false, 30, null);
        }
    }

    /* JADX INFO: renamed from: sb0.d$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.domain.AdvancedLabsInteractor$loadAdvancedLabsCache$$inlined$cacheAPI$1", m100430f = "AdvancedLabsInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f133876w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f133877x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f133878y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f133879z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f133879z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            e eVar = new e(interfaceC30057d, this.f133879z);
            eVar.f133877x = interfaceC13062m;
            eVar.f133878y = c26832c;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f133876w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f133877x;
                C26832c c26832c = (C26832c) this.f133878y;
                InterfaceC26834e interfaceC26834e = this.f133879z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(AdvancedLabsResponse.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(AdvancedLabsResponse.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f133877x = null;
                this.f133878y = null;
                this.f133876w = 1;
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

    /* JADX INFO: renamed from: sb0.d$f */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f133880w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f133881x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C32343d f133882y;

        /* JADX INFO: renamed from: sb0.d$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f133883w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ boolean f133884x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C32343d f133885y;

            /* JADX INFO: renamed from: sb0.d$f$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.domain.AdvancedLabsInteractor$loadAdvancedLabsCache$$inlined$map$1$2", m100430f = "AdvancedLabsInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42315a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f133886E;

                /* JADX INFO: renamed from: F */
                Object f133887F;

                /* JADX INFO: renamed from: G */
                Object f133888G;

                /* JADX INFO: renamed from: H */
                int f133889H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f133890w;

                /* JADX INFO: renamed from: x */
                int f133891x;

                /* JADX INFO: renamed from: y */
                Object f133892y;

                public C42315a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f133890w = obj;
                    this.f133891x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, boolean z4, C32343d c32343d) {
                this.f133883w = interfaceC13062m;
                this.f133884x = z4;
                this.f133885y = c32343d;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42315a c42315a;
                C32342c c32342cM100654h;
                if (interfaceC30057d instanceof C42315a) {
                    c42315a = (C42315a) interfaceC30057d;
                    int i13 = c42315a.f133891x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42315a.f133891x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42315a = new C42315a(interfaceC30057d);
                    }
                } else {
                    c42315a = new C42315a(interfaceC30057d);
                }
                Object obj2 = c42315a.f133890w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42315a.f133891x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f133883w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.e) {
                        c32342cM100654h = new C32342c(null, InterfaceC32340a.b.f133848a, null, false, false, 29, null);
                    } else if (interfaceC29354a instanceof InterfaceC29354a.a.b) {
                        InterfaceC29354a.a.b bVar = (InterfaceC29354a.a.b) interfaceC29354a;
                        c32342cM100654h = new C32342c(((AdvancedLabsResponse) bVar.getData()).getInitiallySelectedSegmentId(), null, (AdvancedLabsResponse) bVar.getData(), this.f133884x, true, 2, null);
                    } else if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
                        InterfaceC29354a.a.C42173a c42173a = (InterfaceC29354a.a.C42173a) interfaceC29354a;
                        c32342cM100654h = new C32342c(((AdvancedLabsResponse) c42173a.getData()).getInitiallySelectedSegmentId(), null, (AdvancedLabsResponse) c42173a.getData(), false, false, 26, null);
                    } else if (interfaceC29354a instanceof InterfaceC29354a.d) {
                        InterfaceC29354a.d dVar = (InterfaceC29354a.d) interfaceC29354a;
                        c32342cM100654h = new C32342c(((AdvancedLabsResponse) dVar.getData()).getInitiallySelectedSegmentId(), null, (AdvancedLabsResponse) dVar.getData(), false, false, 26, null);
                    } else {
                        if (!(interfaceC29354a instanceof InterfaceC29354a.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c32342cM100654h = this.f133885y.m100654h((InterfaceC29354a.c) interfaceC29354a);
                    }
                    c42315a.f133892y = null;
                    c42315a.f133886E = null;
                    c42315a.f133887F = null;
                    c42315a.f133888G = null;
                    c42315a.f133889H = 0;
                    c42315a.f133891x = 1;
                    if (interfaceC13062m.emit(c32342cM100654h, c42315a) == enumC31071a) {
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

        public f(InterfaceC13058l interfaceC13058l, boolean z4, C32343d c32343d) {
            this.f133880w = interfaceC13058l;
            this.f133881x = z4;
            this.f133882y = c32343d;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f133880w.collect(new a(interfaceC13062m, this.f133881x, this.f133882y), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: sb0.d$g */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.domain.AdvancedLabsInteractor$refreshData$$inlined$flatMapLatest$1", m100430f = "AdvancedLabsInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f133894w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f133895x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f133896y;

        public g(InterfaceC30057d interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C32342c c32342c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            g gVar = new g(interfaceC30057d);
            gVar.f133895x = interfaceC13062m;
            gVar.f133896y = c32342c;
            return gVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f133894w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f133895x;
                C13084s1 c13084s1 = new C13084s1(new h((C32342c) this.f133896y, null));
                this.f133895x = null;
                this.f133896y = null;
                this.f133894w = 1;
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
            return invoke((InterfaceC13062m) obj, (C32342c) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: sb0.d$h */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.domain.AdvancedLabsInteractor$refreshData$1$1", m100430f = "AdvancedLabsInteractor.kt", m100431l = {63}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lsb0/e;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f133897w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f133898x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C32342c f133899y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(C32342c c32342c, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f133899y = c32342c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            h hVar = new h(this.f133899y, interfaceC30057d);
            hVar.f133898x = obj;
            return hVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f133898x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f133897w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC32344e.a aVar = new AbstractC32344e.a(this.f133899y);
                this.f133898x = null;
                this.f133897w = 1;
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

    public C32343d(InterfaceC26834e cachedApiSource, InterfaceC34116n logger, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.cachedApiSource = cachedApiSource;
        this.logger = logger;
        this.featureFlagChecker = featureFlagChecker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final C32342c m100653g(C32342c previousState, AbstractC32341b action) {
        if (action instanceof AbstractC32341b.a) {
            return previousState;
        }
        if (action instanceof AbstractC32341b.c) {
            return C32342c.m100643b(previousState, null, null, null, false, true, 15, null);
        }
        if (!(action instanceof AbstractC32341b.d)) {
            return action instanceof AbstractC32341b.e ? C32342c.m100643b(previousState, ((AbstractC32341b.e) action).getSelectedSegmentId(), null, null, false, false, 30, null) : previousState;
        }
        this.logger.mo85222m(((AbstractC32341b.d) action).getMessage(), new AbstractC30556a.a[0]);
        return C32342c.m100643b(previousState, null, InterfaceC32340a.d.f133850a, null, false, false, 13, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final C32342c m100654h(InterfaceC29354a.c<AdvancedLabsResponse> cacheResult) {
        return AbstractC29355b.m89462a(cacheResult) ? new C32342c(null, InterfaceC32340a.d.f133850a, null, false, false, 29, null) : new C32342c(null, InterfaceC32340a.c.f133849a, null, false, false, 29, null);
    }

    /* JADX INFO: renamed from: i */
    private final InterfaceC13058l m100655i(boolean manualRefresh) {
        return new f(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new GetAdvancedLabsRequest(), 1), AbstractC12350b.m34570S("AdvancedLabsScope"), null, 2, null), new e(null, this.cachedApiSource)), manualRefresh, this);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ InterfaceC13058l m100656j(C32343d c32343d, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = false;
        }
        return c32343d.m100655i(z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final InterfaceC13058l m100657k() {
        return AbstractC13091v.m36590P(m100656j(this, false, 1, null), new g(null));
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C32342c(null, InterfaceC32340a.b.f133848a, null, false, false, 29, null), AbstractC13091v.m36590P(upstream, new a(null, this)), new d(null));
    }

    public /* synthetic */ C32343d(InterfaceC26834e interfaceC26834e, InterfaceC34116n interfaceC34116n, FeatureFlagChecker featureFlagChecker, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC26834e, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("AdvancedLabsInteractor") : interfaceC34116n, featureFlagChecker);
    }
}
