package sx0;

import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.bot.models.conversation.ConversationRequestsKt;
import com.whoop.personalrecords.miniarch.domain.PersonalRecordsApiKt;
import com.whoop.profile.domain.ProfileApiKt;
import com.whoop.profile.domain.edit.EditProfileRequestsKt;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13060l1;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13075p1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j92.AbstractC21438f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25235a0;
import or2.C28180m;
import p007a6.InterfaceC0422g;
import p138f6.AbstractC14134f;
import p138f6.C14129a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: sx0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, m65681d2 = {"Lsx0/c;", "Landroidx/lifecycle/w1;", "La6/g;", "Lf6/f;", "dataStore", "Lbc3/c0;", "coroutineScope", "<init>", "(La6/g;Lbc3/c0;)V", "Lsx0/b;", "viewEvent", "Ll83/a0;", "n", "(Lsx0/b;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "La6/g;", "x", "Lbc3/c0;", "Lec3/p1;", "", "y", "Lec3/p1;", "searchQuery", "Lec3/f2;", "Lsx0/f;", "z", "Lec3/f2;", "getViewState", "()Lec3/f2;", "viewState", "E", "a", "debug-tools_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33061c extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: F */
    public static final int f137866F = 8;

    /* JADX INFO: renamed from: G */
    private static final List<String> f137867G = AbstractC37056f.m118959K("activities-service", "advanced-labs-service", ConversationRequestsKt.SERVICE, "ai-conversation-bff", "coaching-service", "core-details-bff", "entitlement-service", "growth-content-service", "home-service", "impact-service", "mobile-metric-service", EditProfileRequestsKt.ONBOARDING_SERVICE, "profile-service", "progression-service", "sanguine-service", "smart-alarm-service", "strap-location-service", "streaks-service", "user-preferences-service", ProfileApiKt.USERS_SERVICE, PersonalRecordsApiKt.SERVICE, "integrations-bff");

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC0422g dataStore;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13075p1 searchQuery;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13037f2 viewState;

    /* JADX INFO: renamed from: sx0.c$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lsx0/c$a;", "", "<init>", "()V", "", "", "ALL_SERVICES", "Ljava/util/List;", "a", "()Ljava/util/List;", "debug-tools_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final List<String> m104704a() {
            return C33061c.f137867G;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: sx0.c$b */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.debug.localservice.DebugLocalServiceViewModel$sendViewEvent$1", m100430f = "DebugLocalServiceViewModel.kt", m100431l = {62, 67}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f137872w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC33060b f137873x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C33061c f137874y;

        /* JADX INFO: renamed from: sx0.c$b$a */
        @InterfaceC32271e(m100429c = "com.whoop.debug.localservice.DebugLocalServiceViewModel$sendViewEvent$1$1", m100430f = "DebugLocalServiceViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "prefs", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f137875w;

            /* JADX INFO: renamed from: x */
            /* synthetic */ Object f137876x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ AbstractC33060b f137877y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AbstractC33060b abstractC33060b, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f137877y = abstractC33060b;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                a aVar = new a(this.f137877y, interfaceC30057d);
                aVar.f137876x = obj;
                return aVar;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                C14129a c14129a = (C14129a) this.f137876x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f137875w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                Set set = (Set) c14129a.mo40227b(AbstractC21438f.m60328a());
                Set setM74101H1 = set != null ? AbstractC25265s.m74101H1(set) : new LinkedHashSet();
                if (((AbstractC33060b.c) this.f137877y).getIsEnabled()) {
                    setM74101H1.add(((AbstractC33060b.c) this.f137877y).getServiceName());
                } else {
                    setM74101H1.remove(((AbstractC33060b.c) this.f137877y).getServiceName());
                }
                c14129a.m40230g(AbstractC21438f.m60328a(), setM74101H1);
                return C23454a0.f92919a;
            }
        }

        /* JADX INFO: renamed from: sx0.c$b$b, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.debug.localservice.DebugLocalServiceViewModel$sendViewEvent$1$2", m100430f = "DebugLocalServiceViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "prefs", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C42352b extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f137878w;

            /* JADX INFO: renamed from: x */
            /* synthetic */ Object f137879x;

            public C42352b(InterfaceC30057d<? super C42352b> interfaceC30057d) {
                super(2, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                C42352b c42352b = new C42352b(interfaceC30057d);
                c42352b.f137879x = obj;
                return c42352b;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((C42352b) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                C14129a c14129a = (C14129a) this.f137879x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f137878w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                c14129a.m40229f(AbstractC21438f.m60328a());
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC33060b abstractC33060b, C33061c c33061c, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f137873x = abstractC33060b;
            this.f137874y = c33061c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f137873x, this.f137874y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
        
            if (hg3.AbstractC17269i.m48861G(r6, r1, r5) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0083, code lost:
        
            if (hg3.AbstractC17269i.m48861G(r6, r1, r5) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0085, code lost:
        
            return r0;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r5.f137872w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L19
                if (r1 == r3) goto L15
                if (r1 != r2) goto Ld
                goto L15
            Ld:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L15:
                p505ts.AbstractC34132o.m107864I(r6)
                goto L86
            L19:
                p505ts.AbstractC34132o.m107864I(r6)
                sx0.b r6 = r5.f137873x
                boolean r1 = r6 instanceof sx0.AbstractC33060b.d
                if (r1 == 0) goto L36
                sx0.c r6 = r5.f137874y
                ec3.p1 r6 = sx0.C33061c.m104702l(r6)
                sx0.b r0 = r5.f137873x
                sx0.b$d r0 = (sx0.AbstractC33060b.d) r0
                java.lang.String r0 = r0.getQuery()
                ec3.h2 r6 = (ec3.C13045h2) r6
                r6.m36570j(r0)
                goto L86
            L36:
                sx0.b$a r1 = sx0.AbstractC33060b.a.f137860a
                boolean r1 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r6, r1)
                r4 = 0
                if (r1 == 0) goto L50
                sx0.c r6 = r5.f137874y
                ec3.p1 r6 = sx0.C33061c.m104702l(r6)
                ec3.h2 r6 = (ec3.C13045h2) r6
                r6.getClass()
                java.lang.String r0 = ""
                r6.m36571k(r4, r0)
                goto L86
            L50:
                boolean r1 = r6 instanceof sx0.AbstractC33060b.c
                if (r1 == 0) goto L6a
                sx0.c r6 = r5.f137874y
                a6.g r6 = sx0.C33061c.m104701j(r6)
                sx0.c$b$a r1 = new sx0.c$b$a
                sx0.b r2 = r5.f137873x
                r1.<init>(r2, r4)
                r5.f137872w = r3
                java.lang.Object r6 = hg3.AbstractC17269i.m48861G(r6, r1, r5)
                if (r6 != r0) goto L86
                goto L85
            L6a:
                sx0.b$b r1 = sx0.AbstractC33060b.b.f137861a
                boolean r6 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r6, r1)
                if (r6 == 0) goto L89
                sx0.c r6 = r5.f137874y
                a6.g r6 = sx0.C33061c.m104701j(r6)
                sx0.c$b$b r1 = new sx0.c$b$b
                r1.<init>(r4)
                r5.f137872w = r2
                java.lang.Object r6 = hg3.AbstractC17269i.m48861G(r6, r1, r5)
                if (r6 != r0) goto L86
            L85:
                return r0
            L86:
                l83.a0 r6 = l83.C23454a0.f92919a
                return r6
            L89:
                kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
                r6.<init>()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: sx0.C33061c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: sx0.c$c */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.debug.localservice.DebugLocalServiceViewModel$viewState$1", m100430f = "DebugLocalServiceViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lf6/f;", "prefs", "", "query", "Lsx0/f;", "<anonymous>", "(Lf6/f;Ljava/lang/String;)Lsx0/f;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f137880w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f137881x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f137882y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC14134f abstractC14134f, String str, InterfaceC30057d<? super C33064f> interfaceC30057d) {
            c cVar = new c(interfaceC30057d);
            cVar.f137881x = abstractC14134f;
            cVar.f137882y = str;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC14134f abstractC14134f = (AbstractC14134f) this.f137881x;
            String str = (String) this.f137882y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f137880w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            Set set = (Set) abstractC14134f.mo40227b(AbstractC21438f.m60328a());
            if (set == null) {
                set = C25235a0.f99113w;
            }
            List<String> listM104704a = C33061c.INSTANCE.m104704a();
            ArrayList<String> arrayList = new ArrayList();
            for (Object obj2 : listM104704a) {
                String str2 = (String) obj2;
                if (AbstractC39414r.m125890i0(str) || AbstractC39414r.m125876U(str2, str, true)) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
            for (String str3 : arrayList) {
                arrayList2.add(new C33062d(str3, set.contains(str3)));
            }
            return new C33064f(str, arrayList2, !set.isEmpty());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33061c(InterfaceC0422g dataStore, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(dataStore, "dataStore");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.dataStore = dataStore;
        this.coroutineScope = coroutineScope;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c("");
        this.searchQuery = c13045h2M36593c;
        C13060l1 c13060l1 = new C13060l1(dataStore.getData(), c13045h2M36593c, new c(null), 1);
        List<String> list = f137867G;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C33062d((String) it.next(), false));
        }
        this.viewState = AbstractC13091v.m36587M(c13060l1, coroutineScope, C13105z1.f45288a, new C33064f(null, arrayList, false, 5, null));
    }

    public final InterfaceC13037f2 getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: n */
    public final void m104703n(AbstractC33060b viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new b(viewEvent, this, null), 3);
    }

    public /* synthetic */ C33061c(InterfaceC0422g interfaceC0422g, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC0422g, (i13 & 2) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
