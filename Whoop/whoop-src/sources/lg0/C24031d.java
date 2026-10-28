package lg0;

import c93.InterfaceC4351m;
import com.whoop.advancedlabsmanagement.domain.GetAdvancedLabsManagementRequest;
import com.whoop.advancedlabsmanagement.domain.models.AdvancedLabsManagementModels;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
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
import pm0.AbstractC29355b;
import pm0.InterfaceC29354a;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sm0.AbstractC32714a;

/* JADX INFO: renamed from: lg0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\b\b\u0002\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Llg0/d;", "Lod1/g;", "Llg0/b;", "Llg0/c;", "Lnm0/e;", "cachedApiSource", "<init>", "(Lnm0/e;)V", "previousState", "action", "e", "(Llg0/c;Llg0/b;)Llg0/c;", "", "manualRefresh", "Lec3/l;", "g", "(Z)Lec3/l;", "Lpm0/a$c;", "Lcom/whoop/advancedlabsmanagement/domain/models/AdvancedLabsManagementModels;", "cacheResult", "f", "(Lpm0/a$c;)Llg0/c;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lnm0/e;", "advanced-labs-management_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C24031d implements InterfaceC27844g<AbstractC24029b, C24030c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: lg0.d$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabsmanagement.domain.AdvancedLabsManagementInteractor$interact$$inlined$flatMapLatest$1", m100430f = "AdvancedLabsManagementInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f94909w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f94910x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f94911y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C24031d f94912z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, C24031d c24031d) {
            super(3, interfaceC30057d);
            this.f94912z = c24031d;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC24029b abstractC24029b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f94912z);
            aVar.f94910x = interfaceC13062m;
            aVar.f94911y = abstractC24029b;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f94909w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f94910x;
                AbstractC24029b abstractC24029b = (AbstractC24029b) this.f94911y;
                InterfaceC13058l interfaceC13058lM36590P = abstractC24029b instanceof AbstractC24029b.a ? AbstractC13091v.m36590P(C24031d.m70888h(this.f94912z, false, 1, null), new e(null)) : new C13084s1(new c(abstractC24029b, null));
                this.f94910x = null;
                this.f94911y = null;
                this.f94909w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM36590P, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC24029b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: lg0.d$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabsmanagement.domain.AdvancedLabsManagementInteractor$interact$1$1$1", m100430f = "AdvancedLabsManagementInteractor.kt", m100431l = {32}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Llg0/e$a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f94913w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f94914x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C24030c f94915y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C24030c c24030c, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f94915y = c24030c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(this.f94915y, interfaceC30057d);
            bVar.f94914x = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f94914x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f94913w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC24032e.a aVar = new AbstractC24032e.a(this.f94915y);
                this.f94914x = null;
                this.f94913w = 1;
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

    /* JADX INFO: renamed from: lg0.d$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabsmanagement.domain.AdvancedLabsManagementInteractor$interact$1$2", m100430f = "AdvancedLabsManagementInteractor.kt", m100431l = {36}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Llg0/e$b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f94916w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f94917x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC24029b f94918y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC24029b abstractC24029b, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f94918y = abstractC24029b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(this.f94918y, interfaceC30057d);
            cVar.f94917x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f94917x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f94916w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC24032e.b bVar = new AbstractC24032e.b(this.f94918y);
                this.f94917x = null;
                this.f94916w = 1;
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

    /* JADX INFO: renamed from: lg0.d$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabsmanagement.domain.AdvancedLabsManagementInteractor$interact$2", m100430f = "AdvancedLabsManagementInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Llg0/c;", "previousState", "Llg0/e;", "action", "<anonymous>", "(Llg0/c;Llg0/e;)Llg0/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f94919w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f94920x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f94921y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C24030c c24030c, AbstractC24032e abstractC24032e, InterfaceC30057d<? super C24030c> interfaceC30057d) {
            d dVar = C24031d.this.new d(interfaceC30057d);
            dVar.f94920x = c24030c;
            dVar.f94921y = abstractC24032e;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C24030c c24030c = (C24030c) this.f94920x;
            AbstractC24032e abstractC24032e = (AbstractC24032e) this.f94921y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f94919w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (abstractC24032e instanceof AbstractC24032e.b) {
                return C24031d.this.m70885e(c24030c, ((AbstractC24032e.b) abstractC24032e).getDomainAction());
            }
            if (abstractC24032e instanceof AbstractC24032e.a) {
                return ((AbstractC24032e.a) abstractC24032e).getDomainState();
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: lg0.d$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabsmanagement.domain.AdvancedLabsManagementInteractor$interact$lambda$0$$inlined$flatMapLatest$1", m100430f = "AdvancedLabsManagementInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f94923w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f94924x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f94925y;

        public e(InterfaceC30057d interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C24030c c24030c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            e eVar = new e(interfaceC30057d);
            eVar.f94924x = interfaceC13062m;
            eVar.f94925y = c24030c;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f94923w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f94924x;
                C13084s1 c13084s1 = new C13084s1(new b((C24030c) this.f94925y, null));
                this.f94924x = null;
                this.f94925y = null;
                this.f94923w = 1;
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
            return invoke((InterfaceC13062m) obj, (C24030c) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: lg0.d$f */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabsmanagement.domain.AdvancedLabsManagementInteractor$loadAdvancedLabsManagementCache$$inlined$cacheAPI$1", m100430f = "AdvancedLabsManagementInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f94926w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f94927x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f94928y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f94929z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f94929z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            f fVar = new f(interfaceC30057d, this.f94929z);
            fVar.f94927x = interfaceC13062m;
            fVar.f94928y = c26832c;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f94926w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f94927x;
                C26832c c26832c = (C26832c) this.f94928y;
                InterfaceC26834e interfaceC26834e = this.f94929z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(AdvancedLabsManagementModels.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(AdvancedLabsManagementModels.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f94927x = null;
                this.f94928y = null;
                this.f94926w = 1;
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

    /* JADX INFO: renamed from: lg0.d$g */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f94930w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f94931x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C24031d f94932y;

        /* JADX INFO: renamed from: lg0.d$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f94933w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ boolean f94934x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C24031d f94935y;

            /* JADX INFO: renamed from: lg0.d$g$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabsmanagement.domain.AdvancedLabsManagementInteractor$loadAdvancedLabsManagementCache$$inlined$map$1$2", m100430f = "AdvancedLabsManagementInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41950a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f94936E;

                /* JADX INFO: renamed from: F */
                Object f94937F;

                /* JADX INFO: renamed from: G */
                Object f94938G;

                /* JADX INFO: renamed from: H */
                int f94939H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f94940w;

                /* JADX INFO: renamed from: x */
                int f94941x;

                /* JADX INFO: renamed from: y */
                Object f94942y;

                public C41950a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f94940w = obj;
                    this.f94941x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, boolean z4, C24031d c24031d) {
                this.f94933w = interfaceC13062m;
                this.f94934x = z4;
                this.f94935y = c24031d;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41950a c41950a;
                C24030c c24030cM70886f;
                if (interfaceC30057d instanceof C41950a) {
                    c41950a = (C41950a) interfaceC30057d;
                    int i13 = c41950a.f94941x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41950a.f94941x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41950a = new C41950a(interfaceC30057d);
                    }
                } else {
                    c41950a = new C41950a(interfaceC30057d);
                }
                Object obj2 = c41950a.f94940w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41950a.f94941x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f94933w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.e) {
                        c24030cM70886f = new C24030c(InterfaceC24028a.b.f94900a, null, false, false, 14, null);
                    } else if (interfaceC29354a instanceof InterfaceC29354a.a.b) {
                        c24030cM70886f = new C24030c(null, (AdvancedLabsManagementModels) ((InterfaceC29354a.a.b) interfaceC29354a).getData(), this.f94934x, true, 1, null);
                    } else if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
                        c24030cM70886f = new C24030c(null, (AdvancedLabsManagementModels) ((InterfaceC29354a.a.C42173a) interfaceC29354a).getData(), false, false, 13, null);
                    } else if (interfaceC29354a instanceof InterfaceC29354a.d) {
                        c24030cM70886f = new C24030c(null, (AdvancedLabsManagementModels) ((InterfaceC29354a.d) interfaceC29354a).getData(), false, false, 13, null);
                    } else {
                        if (!(interfaceC29354a instanceof InterfaceC29354a.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c24030cM70886f = this.f94935y.m70886f((InterfaceC29354a.c) interfaceC29354a);
                    }
                    c41950a.f94942y = null;
                    c41950a.f94936E = null;
                    c41950a.f94937F = null;
                    c41950a.f94938G = null;
                    c41950a.f94939H = 0;
                    c41950a.f94941x = 1;
                    if (interfaceC13062m.emit(c24030cM70886f, c41950a) == enumC31071a) {
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

        public g(InterfaceC13058l interfaceC13058l, boolean z4, C24031d c24031d) {
            this.f94930w = interfaceC13058l;
            this.f94931x = z4;
            this.f94932y = c24031d;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f94930w.collect(new a(interfaceC13062m, this.f94931x, this.f94932y), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C24031d(InterfaceC26834e cachedApiSource) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        this.cachedApiSource = cachedApiSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public final C24030c m70885e(C24030c previousState, AbstractC24029b action) {
        return previousState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final C24030c m70886f(InterfaceC29354a.c<AdvancedLabsManagementModels> cacheResult) {
        return AbstractC29355b.m89462a(cacheResult) ? new C24030c(InterfaceC24028a.d.f94902a, null, false, false, 14, null) : new C24030c(InterfaceC24028a.c.f94901a, null, false, false, 14, null);
    }

    /* JADX INFO: renamed from: g */
    private final InterfaceC13058l m70887g(boolean manualRefresh) {
        return new g(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new GetAdvancedLabsManagementRequest(), 1), AbstractC12350b.m34570S("advancedlabsmanagement"), null, 2, null), new f(null, this.cachedApiSource)), manualRefresh, this);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ InterfaceC13058l m70888h(C24031d c24031d, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = false;
        }
        return c24031d.m70887g(z4);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C24030c(InterfaceC24028a.b.f94900a, null, false, false, 14, null), AbstractC13091v.m36590P(upstream, new a(null, this)), new d(null));
    }
}
