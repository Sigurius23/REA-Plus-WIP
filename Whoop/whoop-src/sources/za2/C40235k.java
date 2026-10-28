package za2;

import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import od1.InterfaceC27844g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: za2.k */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m65681d2 = {"Lza2/k;", "Lod1/g;", "Lza2/b;", "Lza2/f;", "Lza2/c;", "coordinator", "<init>", "(Lza2/c;)V", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lza2/c;", "Lec3/f2;", "b", "Lec3/f2;", "d", "()Lec3/f2;", "latestState", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40235k implements InterfaceC27844g<AbstractC40226b, AbstractC40230f> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C40227c coordinator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC13037f2 latestState;

    /* JADX INFO: renamed from: za2.k$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.banner.SettingsBannerInteractor$interact$$inlined$flatMapLatest$1", m100430f = "SettingsBannerInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f173933w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f173934x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f173935y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C40235k f173936z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, C40235k c40235k) {
            super(3, interfaceC30057d);
            this.f173936z = c40235k;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC40226b abstractC40226b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f173936z);
            aVar.f173934x = interfaceC13062m;
            aVar.f173935y = abstractC40226b;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C13084s1 c13084s1;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f173933w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f173934x;
                AbstractC40226b abstractC40226b = (AbstractC40226b) this.f173935y;
                if (AbstractC22676k.m65745e(abstractC40226b, AbstractC40226b.c.f173733a)) {
                    c13084s1 = new C13084s1(this.f173936z.new b(null));
                } else if (abstractC40226b instanceof AbstractC40226b.a) {
                    c13084s1 = new C13084s1(this.f173936z.new c(null));
                } else {
                    if (!(abstractC40226b instanceof AbstractC40226b.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c13084s1 = new C13084s1(this.f173936z.new d(abstractC40226b, null));
                }
                this.f173934x = null;
                this.f173935y = null;
                this.f173933w = 1;
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
            return invoke((InterfaceC13062m) obj, (AbstractC40226b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: za2.k$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.banner.SettingsBannerInteractor$interact$1$1", m100430f = "SettingsBannerInteractor.kt", m100431l = {29}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lza2/f;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f173937w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f173938x;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = C40235k.this.new b(interfaceC30057d);
            bVar.f173938x = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f173938x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f173937w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                Object value = C40235k.this.coordinator.getStateFlow().getValue();
                AbstractC40230f.c cVar = value instanceof AbstractC40230f.c ? (AbstractC40230f.c) value : null;
                if (cVar != null && cVar.getRequiresUpdate()) {
                    C40235k.this.coordinator.m129154l();
                }
                InterfaceC13037f2 latestState = C40235k.this.getLatestState();
                this.f173938x = null;
                this.f173937w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, latestState, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: za2.k$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.banner.SettingsBannerInteractor$interact$1$2", m100430f = "SettingsBannerInteractor.kt", m100431l = {34}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lza2/f;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f173940w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f173941x;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = C40235k.this.new c(interfaceC30057d);
            cVar.f173941x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f173941x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f173940w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C40235k.this.coordinator.m129155m();
                InterfaceC13037f2 latestState = C40235k.this.getLatestState();
                this.f173941x = null;
                this.f173940w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, latestState, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: za2.k$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.banner.SettingsBannerInteractor$interact$1$3", m100430f = "SettingsBannerInteractor.kt", m100431l = {39}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lza2/f;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f173943w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f173944x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC40226b f173946z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractC40226b abstractC40226b, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f173946z = abstractC40226b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = C40235k.this.new d(this.f173946z, interfaceC30057d);
            dVar.f173944x = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f173944x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f173943w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C40235k.this.coordinator.m129152h(((AbstractC40226b.b) this.f173946z).getScreenId());
                InterfaceC13037f2 latestState = C40235k.this.getLatestState();
                this.f173944x = null;
                this.f173943w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, latestState, this) == enumC31071a) {
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

    public C40235k(C40227c coordinator) {
        AbstractC22676k.m65750j(coordinator, "coordinator");
        this.coordinator = coordinator;
        this.latestState = coordinator.getStateFlow();
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC13037f2 getLatestState() {
        return this.latestState;
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new a(null, this));
    }
}
