package com.whoop.archv2.feature.domain;

import c93.InterfaceC4351m;
import com.whoop.network.request.GetApiRequest;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import f63.AbstractC14155c;
import ge3.AbstractC15751g;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import l83.C23454a0;
import od1.InterfaceC27844g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pi0.C29249a;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.C34387c;

/* JADX INFO: renamed from: com.whoop.archv2.feature.domain.l */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/l;", "Lod1/g;", "Lpi0/a;", "Lcom/whoop/archv2/feature/domain/f;", "Lu02/c;", "apiClient", "", "requestName", "Ltr2/n;", "logger", "<init>", "(Lu02/c;Ljava/lang/String;Ltr2/n;)V", "Lcom/whoop/network/request/GetApiRequest;", "request", "Lec3/l;", "g", "(Lcom/whoop/network/request/GetApiRequest;)Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lu02/c;", "b", "Ljava/lang/String;", "c", "Ltr2/n;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C6004l implements InterfaceC27844g<C29249a, C5998f> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C34387c apiClient;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String requestName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.l$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.domain.GenericScreenFetchNoCacheInteractor$fetchScreen$1", m100430f = "GenericScreenFetchNoCacheInteractor.kt", m100431l = {29, 61, 38, 48}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lcom/whoop/archv2/feature/domain/f;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        int f23982E;

        /* JADX INFO: renamed from: F */
        int f23983F;

        /* JADX INFO: renamed from: G */
        private /* synthetic */ Object f23984G;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ GetApiRequest f23986I;

        /* JADX INFO: renamed from: w */
        Object f23987w;

        /* JADX INFO: renamed from: x */
        Object f23988x;

        /* JADX INFO: renamed from: y */
        Object f23989y;

        /* JADX INFO: renamed from: z */
        Object f23990z;

        /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.l$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.domain.GenericScreenFetchNoCacheInteractor$fetchScreen$1$result$1", m100430f = "GenericScreenFetchNoCacheInteractor.kt", m100431l = {30}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Lf63/c;", "<anonymous>", "()Lf63/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C41379a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f23991w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C6004l f23992x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ GetApiRequest f23993y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41379a(C6004l c6004l, GetApiRequest getApiRequest, InterfaceC30057d<? super C41379a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f23992x = c6004l;
                this.f23993y = getApiRequest;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new C41379a(this.f23992x, this.f23993y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f23991w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                C34387c c34387c = this.f23992x.apiClient;
                GetApiRequest getApiRequest = this.f23993y;
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(GetApiRequest.class);
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(AbstractC22671h0.f89337a.getOrCreateKotlinClass(GetApiRequest.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d));
                this.f23991w = 1;
                Object objM108748d = c34387c.m108748d(getApiRequest, c32236aM44445Y, this);
                return objM108748d == enumC31071a ? enumC31071a : objM108748d;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super AbstractC14155c> interfaceC30057d) {
                return ((C41379a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(GetApiRequest getApiRequest, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f23986I = getApiRequest;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = C6004l.this.new a(this.f23986I, interfaceC30057d);
            aVar.f23984G = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x00b6  */
        /* JADX WARN: Code duplicated, block: B:26:0x00c2  */
        /* JADX WARN: Code duplicated, block: B:29:0x00cc  */
        /* JADX WARN: Code duplicated, block: B:32:0x00d5  */
        /* JADX WARN: Code duplicated, block: B:33:0x00dc  */
        /* JADX WARN: Code duplicated, block: B:35:0x00e0  */
        /* JADX WARN: Code duplicated, block: B:39:0x0123  */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0120, code lost:
        
            if (r8.emit(r16, r38) == r9) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0181, code lost:
        
            if (r8.emit(r16, r38) == r9) goto L50;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r39) {
            /*
                Method dump skipped, instruction units count: 397
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.archv2.feature.domain.C6004l.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.l$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.domain.GenericScreenFetchNoCacheInteractor$interact$$inlined$flatMapLatest$1", m100430f = "GenericScreenFetchNoCacheInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f23994w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f23995x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f23996y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C6004l f23997z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC30057d interfaceC30057d, C6004l c6004l) {
            super(3, interfaceC30057d);
            this.f23997z = c6004l;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C29249a c29249a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            b bVar = new b(interfaceC30057d, this.f23997z);
            bVar.f23995x = interfaceC13062m;
            bVar.f23996y = c29249a;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f23994w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f23995x;
                C29249a c29249a = (C29249a) this.f23996y;
                C6004l c6004l = this.f23997z;
                InterfaceC13058l interfaceC13058lM18027g = c6004l.m18027g(GenericScreenFetchInteractorKt.m17877a(c29249a, c6004l.requestName));
                this.f23995x = null;
                this.f23996y = null;
                this.f23994w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM18027g, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (C29249a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.l$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.domain.GenericScreenFetchNoCacheInteractor$interact$2", m100430f = "GenericScreenFetchNoCacheInteractor.kt", m100431l = {26}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lcom/whoop/archv2/feature/domain/f;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f23998w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f23999x;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(interfaceC30057d);
            cVar.f23999x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f23999x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f23998w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C5998f c5998f = new C5998f(new InterfaceC5994b.b(null, 1, null), null, false, false, false, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 524286, null);
                this.f23999x = null;
                this.f23998w = 1;
                if (interfaceC13062m.emit(c5998f, this) == enumC31071a) {
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

    public C6004l(C34387c apiClient, String requestName, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(apiClient, "apiClient");
        AbstractC22676k.m65750j(requestName, "requestName");
        AbstractC22676k.m65750j(logger, "logger");
        this.apiClient = apiClient;
        this.requestName = requestName;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final InterfaceC13058l m18027g(GetApiRequest request) {
        return new C13084s1(new a(request, null));
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13015a0(new c(null), AbstractC13091v.m36590P(upstream, new b(null, this)));
    }

    public /* synthetic */ C6004l(C34387c c34387c, String str, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c34387c, str, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("GenericScreenFetchNoCacheInteractor") : interfaceC34116n);
    }
}
