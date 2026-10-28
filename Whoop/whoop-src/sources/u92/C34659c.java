package u92;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import hg3.AbstractC17269i;
import ih0.AbstractC18489d0;
import java.util.Set;
import l83.C23454a0;
import m83.C25235a0;
import p007a6.InterfaceC0422g;
import p098dt.AbstractC12350b;
import p138f6.AbstractC14134f;
import p138f6.C14129a;
import p138f6.C14132d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.C30064k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: u92.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0006\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0010B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R#\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00130\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m65681d2 = {"Lu92/c;", "", "La6/g;", "Lf6/f;", "prefsDataStore", "<init>", "(La6/g;)V", "", "userId", "offerId", "Ll83/a0;", "c", "(Ljava/lang/String;Ljava/lang/String;)V", "", "e", "(Ljava/lang/String;Ljava/lang/String;)Z", "a", "La6/g;", "Lec3/l;", "", "b", "Lec3/l;", "d", "()Lec3/l;", "dismissedUserOfferIdsFlow", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34659c {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d */
    private static final C14132d f145994d = AbstractC15751g.m44442V("dismissed_lto_offer_ids");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC0422g prefsDataStore;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC13058l dismissedUserOfferIdsFlow;

    /* JADX INFO: renamed from: u92.c$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR \u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lu92/c$a;", "", "<init>", "()V", "", "userId", "offerId", "b", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lf6/d;", "", "KEY_DISMISSED_LTO_OFFER_IDS", "Lf6/d;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public final String m109521b(String userId, String offerId) {
            if (userId == null) {
                userId = "";
            }
            return AbstractC18489d0.m53370k(userId, ":", offerId);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: u92.c$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.store.LtoDismissStore$addDismissedOfferId$1", m100430f = "LtoDismissStore.kt", m100431l = {32}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lf6/f;", "<anonymous>", "(Lbc3/c0;)Lf6/f;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f145997w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f145999y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f146000z;

        /* JADX INFO: renamed from: u92.c$b$a */
        @InterfaceC32271e(m100429c = "com.whoop.service.store.LtoDismissStore$addDismissedOfferId$1$1", m100430f = "LtoDismissStore.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "prefs", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f146001w;

            /* JADX INFO: renamed from: x */
            /* synthetic */ Object f146002x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f146003y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ String f146004z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, String str2, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f146003y = str;
                this.f146004z = str2;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                a aVar = new a(this.f146003y, this.f146004z, interfaceC30057d);
                aVar.f146002x = obj;
                return aVar;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                C14129a c14129a = (C14129a) this.f146002x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f146001w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                Set set = (Set) c14129a.mo40227b(C34659c.f145994d);
                if (set == null) {
                    set = C25235a0.f99113w;
                }
                String strM109521b = C34659c.INSTANCE.m109521b(this.f146003y, this.f146004z);
                boolean zContains = set.contains(strM109521b);
                C23454a0 c23454a0 = C23454a0.f92919a;
                if (zContains) {
                    return c23454a0;
                }
                c14129a.m40230g(C34659c.f145994d, AbstractC12350b.m34555D(strM109521b, set));
                return c23454a0;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f145999y = str;
            this.f146000z = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C34659c.this.new b(this.f145999y, this.f146000z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC14134f> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f145997w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC0422g interfaceC0422g = C34659c.this.prefsDataStore;
            a aVar = new a(this.f145999y, this.f146000z, null);
            this.f145997w = 1;
            Object objM48861G = AbstractC17269i.m48861G(interfaceC0422g, aVar, this);
            return objM48861G == enumC31071a ? enumC31071a : objM48861G;
        }
    }

    /* JADX INFO: renamed from: u92.c$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.store.LtoDismissStore$isDismissed$1", m100430f = "LtoDismissStore.kt", m100431l = {44}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)Z"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f146005w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f146007y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f146008z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f146007y = str;
            this.f146008z = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C34659c.this.new c(this.f146007y, this.f146008z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Boolean> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f146005w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l data = C34659c.this.prefsDataStore.getData();
                this.f146005w = 1;
                obj = AbstractC13091v.m36575A(data, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            Set set = (Set) ((AbstractC14134f) obj).mo40227b(C34659c.f145994d);
            if (set == null) {
                set = C25235a0.f99113w;
            }
            return Boolean.valueOf(set.contains(C34659c.INSTANCE.m109521b(this.f146007y, this.f146008z)));
        }
    }

    /* JADX INFO: renamed from: u92.c$d */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f146009w;

        /* JADX INFO: renamed from: u92.c$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f146010w;

            /* JADX INFO: renamed from: u92.c$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.service.store.LtoDismissStore$special$$inlined$map$1$2", m100430f = "LtoDismissStore.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42455a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f146011E;

                /* JADX INFO: renamed from: F */
                Object f146012F;

                /* JADX INFO: renamed from: G */
                Object f146013G;

                /* JADX INFO: renamed from: H */
                int f146014H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f146015w;

                /* JADX INFO: renamed from: x */
                int f146016x;

                /* JADX INFO: renamed from: y */
                Object f146017y;

                public C42455a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f146015w = obj;
                    this.f146016x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f146010w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42455a c42455a;
                if (interfaceC30057d instanceof C42455a) {
                    c42455a = (C42455a) interfaceC30057d;
                    int i13 = c42455a.f146016x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42455a.f146016x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42455a = new C42455a(interfaceC30057d);
                    }
                } else {
                    c42455a = new C42455a(interfaceC30057d);
                }
                Object obj2 = c42455a.f146015w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42455a.f146016x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f146010w;
                    Object obj3 = (Set) ((AbstractC14134f) obj).mo40227b(C34659c.f145994d);
                    if (obj3 == null) {
                        obj3 = C25235a0.f99113w;
                    }
                    c42455a.f146017y = null;
                    c42455a.f146011E = null;
                    c42455a.f146012F = null;
                    c42455a.f146013G = null;
                    c42455a.f146014H = 0;
                    c42455a.f146016x = 1;
                    if (interfaceC13062m.emit(obj3, c42455a) == enumC31071a) {
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

        public d(InterfaceC13058l interfaceC13058l) {
            this.f146009w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f146009w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C34659c(InterfaceC0422g prefsDataStore) {
        AbstractC22676k.m65750j(prefsDataStore, "prefsDataStore");
        this.prefsDataStore = prefsDataStore;
        this.dismissedUserOfferIdsFlow = new d(prefsDataStore.getData());
    }

    /* JADX INFO: renamed from: c */
    public final void m109517c(String userId, String offerId) throws Throwable {
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(offerId, "offerId");
        if (AbstractC39414r.m125890i0(offerId)) {
            return;
        }
        AbstractC3006f0.m8699E(C30064k.f122676w, new b(userId, offerId, null));
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC13058l getDismissedUserOfferIdsFlow() {
        return this.dismissedUserOfferIdsFlow;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m109519e(String userId, String offerId) {
        AbstractC22676k.m65750j(userId, "userId");
        if (offerId == null || AbstractC39414r.m125890i0(offerId)) {
            return false;
        }
        return ((Boolean) AbstractC3006f0.m8699E(C30064k.f122676w, new c(userId, offerId, null))).booleanValue();
    }
}
