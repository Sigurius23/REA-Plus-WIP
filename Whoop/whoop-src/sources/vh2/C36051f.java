package vh2;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;
import ge3.AbstractC15751g;
import hg3.AbstractC17269i;
import l83.C23454a0;
import p007a6.InterfaceC0422g;
import p138f6.C14129a;
import p138f6.C14132d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22659b0;
import p715kotlin.jvm.internal.C22665e0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: vh2.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\u0011B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lvh2/f;", "", "La6/g;", "Lf6/f;", "dataStore", "<init>", "(La6/g;)V", "", "strapId", "Lf6/d;", "", "c", "(Ljava/lang/String;)Lf6/d;", "b", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "", "d", "a", "La6/g;", "strap-auth_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36051f {

    /* JADX INFO: renamed from: b */
    private static final a f153880b = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC0422g dataStore;

    /* JADX INFO: renamed from: vh2.f$a */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lvh2/f$a;", "", "<init>", "()V", "", "KEY_PREFIX", "Ljava/lang/String;", "strap-auth_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: vh2.f$b */
    @InterfaceC32271e(m100429c = "com.whoop.strapauth.unlock.StuckLockedCountStore", m100430f = "StuckLockedCountStore.kt", m100431l = {C1533u.MAX_FIELD_NUMBER}, m100432m = "increment", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f153882E;

        /* JADX INFO: renamed from: w */
        Object f153883w;

        /* JADX INFO: renamed from: x */
        Object f153884x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f153885y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f153885y = obj;
            this.f153882E |= Integer.MIN_VALUE;
            return C36051f.this.m114470b(null, this);
        }
    }

    /* JADX INFO: renamed from: vh2.f$c */
    @InterfaceC32271e(m100429c = "com.whoop.strapauth.unlock.StuckLockedCountStore$increment$2", m100430f = "StuckLockedCountStore.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "prefs", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f153887E;

        /* JADX INFO: renamed from: w */
        int f153888w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f153889x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C22665e0 f153890y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C36051f f153891z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C22665e0 c22665e0, C36051f c36051f, String str, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f153890y = c22665e0;
            this.f153891z = c36051f;
            this.f153887E = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(this.f153890y, this.f153891z, this.f153887E, interfaceC30057d);
            cVar.f153889x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14129a c14129a = (C14129a) this.f153889x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f153888w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C22665e0 c22665e0 = this.f153890y;
            Integer num = (Integer) c14129a.mo40227b(this.f153891z.m114469c(this.f153887E));
            c22665e0.f89334w = (num != null ? num.intValue() : 0) + 1;
            c14129a.m40230g(this.f153891z.m114469c(this.f153887E), new Integer(this.f153890y.f89334w));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vh2.f$d */
    @InterfaceC32271e(m100429c = "com.whoop.strapauth.unlock.StuckLockedCountStore", m100430f = "StuckLockedCountStore.kt", m100431l = {31}, m100432m = "reset", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f153893F;

        /* JADX INFO: renamed from: w */
        Object f153894w;

        /* JADX INFO: renamed from: x */
        Object f153895x;

        /* JADX INFO: renamed from: y */
        Object f153896y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f153897z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f153897z = obj;
            this.f153893F |= Integer.MIN_VALUE;
            return C36051f.this.m114471d(null, this);
        }
    }

    /* JADX INFO: renamed from: vh2.f$e */
    @InterfaceC32271e(m100429c = "com.whoop.strapauth.unlock.StuckLockedCountStore$reset$2", m100430f = "StuckLockedCountStore.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "prefs", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f153898w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f153899x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C22659b0 f153900y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C14132d f153901z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C22659b0 c22659b0, C14132d c14132d, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f153900y = c22659b0;
            this.f153901z = c14132d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = new e(this.f153900y, this.f153901z, interfaceC30057d);
            eVar.f153899x = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14129a c14129a = (C14129a) this.f153899x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f153898w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C22659b0 c22659b0 = this.f153900y;
            C14132d key = this.f153901z;
            c14129a.getClass();
            AbstractC22676k.m65750j(key, "key");
            c22659b0.f89329w = c14129a.f50833a.containsKey(key);
            if (this.f153900y.f89329w) {
                c14129a.m40229f(this.f153901z);
            }
            return C23454a0.f92919a;
        }
    }

    public C36051f(InterfaceC0422g dataStore) {
        AbstractC22676k.m65750j(dataStore, "dataStore");
        this.dataStore = dataStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public final C14132d m114469c(String strapId) {
        return AbstractC15751g.m44423C("strap_stuck_locked_count_" + strapId);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m114470b(String str, InterfaceC30057d<? super Integer> interfaceC30057d) {
        b bVar;
        C22665e0 c22665e0;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f153882E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f153882E = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object obj = bVar.f153885y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f153882E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C22665e0 c22665e1 = new C22665e0();
            InterfaceC0422g interfaceC0422g = this.dataStore;
            c cVar = new c(c22665e1, this, str, null);
            bVar.f153883w = null;
            bVar.f153884x = c22665e1;
            bVar.f153882E = 1;
            if (AbstractC17269i.m48861G(interfaceC0422g, cVar, bVar) == enumC31071a) {
                return enumC31071a;
            }
            c22665e0 = c22665e1;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c22665e0 = (C22665e0) bVar.f153884x;
            AbstractC34132o.m107864I(obj);
        }
        return new Integer(c22665e0.f89334w);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m114471d(String str, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        d dVar;
        C22659b0 c22659b0;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f153893F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f153893F = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object obj = dVar.f153897z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar.f153893F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C14132d c14132dM114469c = m114469c(str);
            C22659b0 c22659b1 = new C22659b0();
            InterfaceC0422g interfaceC0422g = this.dataStore;
            e eVar = new e(c22659b1, c14132dM114469c, null);
            dVar.f153894w = null;
            dVar.f153895x = null;
            dVar.f153896y = c22659b1;
            dVar.f153893F = 1;
            if (AbstractC17269i.m48861G(interfaceC0422g, eVar, dVar) == enumC31071a) {
                return enumC31071a;
            }
            c22659b0 = c22659b1;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c22659b0 = (C22659b0) dVar.f153896y;
            AbstractC34132o.m107864I(obj);
        }
        return Boolean.valueOf(c22659b0.f89329w);
    }
}
