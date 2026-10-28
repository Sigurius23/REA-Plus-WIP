package nu1;

import a12.AbstractC0142b;
import a12.C0141a;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.SmartAlarmTriggerRepository;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.lastnightsleep.domain.GetLastNightSleepRequest;
import com.whoop.lastnightsleep.domain.models.LastNightSleepModel;
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
import lu1.C24748a;
import m83.AbstractC25260n;
import nm0.C26832c;
import nm0.InterfaceC26834e;
import od1.InterfaceC27844g;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pm0.InterfaceC29354a;
import q83.InterfaceC30057d;
import qu1.InterfaceC30627c;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sm0.AbstractC32714a;

/* JADX INFO: renamed from: nu1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lnu1/d;", "Lod1/g;", "Lnu1/b;", "Lnu1/c;", "Lnm0/e;", "cachedApiSource", "Llu1/a;", "analytics", "<init>", "(Lnm0/e;Llu1/a;)V", "previousState", "action", "f", "(Lnu1/c;Lnu1/b;)Lnu1/c;", "", "path", "Lec3/l;", "g", "(Ljava/lang/String;)Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lnm0/e;", "b", "Llu1/a;", "last-night-sleep_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27140d implements InterfaceC27844g<AbstractC27138b, C27139c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C24748a analytics;

    /* JADX INFO: renamed from: nu1.d$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.lastnightsleep.domain.LastNightSleepInteractor$interact$$inlined$flatMapLatest$1", m100430f = "LastNightSleepInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f108559w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f108560x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f108561y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C27140d f108562z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, C27140d c27140d) {
            super(3, interfaceC30057d);
            this.f108562z = c27140d;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC27138b abstractC27138b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f108562z);
            aVar.f108560x = interfaceC13062m;
            aVar.f108561y = abstractC27138b;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f108559w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f108560x;
                AbstractC27138b abstractC27138b = (AbstractC27138b) this.f108561y;
                InterfaceC13058l interfaceC13058lM36590P = abstractC27138b instanceof AbstractC27138b.d ? AbstractC13091v.m36590P(this.f108562z.m81619g(((AbstractC27138b.d) abstractC27138b).getPath()), new e(null)) : new C13084s1(new c(abstractC27138b, null));
                this.f108560x = null;
                this.f108561y = null;
                this.f108559w = 1;
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
            return invoke((InterfaceC13062m) obj, (AbstractC27138b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: nu1.d$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.lastnightsleep.domain.LastNightSleepInteractor$interact$1$1$1", m100430f = "LastNightSleepInteractor.kt", m100431l = {35}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lnu1/e$b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f108563w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f108564x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C27139c f108565y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C27139c c27139c, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f108565y = c27139c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(this.f108565y, interfaceC30057d);
            bVar.f108564x = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f108564x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f108563w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC27141e.b bVar = new AbstractC27141e.b(this.f108565y);
                this.f108564x = null;
                this.f108563w = 1;
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

    /* JADX INFO: renamed from: nu1.d$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.lastnightsleep.domain.LastNightSleepInteractor$interact$1$2", m100430f = "LastNightSleepInteractor.kt", m100431l = {39}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lnu1/e$a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f108566w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f108567x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC27138b f108568y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC27138b abstractC27138b, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f108568y = abstractC27138b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(this.f108568y, interfaceC30057d);
            cVar.f108567x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f108567x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f108566w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC27141e.a aVar = new AbstractC27141e.a(this.f108568y);
                this.f108567x = null;
                this.f108566w = 1;
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

    /* JADX INFO: renamed from: nu1.d$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.lastnightsleep.domain.LastNightSleepInteractor$interact$2", m100430f = "LastNightSleepInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lnu1/c;", "previousState", "Lnu1/e;", "action", "<anonymous>", "(Lnu1/c;Lnu1/e;)Lnu1/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f108569w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f108570x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f108571y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C27139c c27139c, AbstractC27141e abstractC27141e, InterfaceC30057d<? super C27139c> interfaceC30057d) {
            d dVar = C27140d.this.new d(interfaceC30057d);
            dVar.f108570x = c27139c;
            dVar.f108571y = abstractC27141e;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C27139c c27139c = (C27139c) this.f108570x;
            AbstractC27141e abstractC27141e = (AbstractC27141e) this.f108571y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f108569w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (abstractC27141e instanceof AbstractC27141e.a) {
                return C27140d.this.m81618f(c27139c, ((AbstractC27141e.a) abstractC27141e).getDomainAction());
            }
            if (abstractC27141e instanceof AbstractC27141e.b) {
                return ((AbstractC27141e.b) abstractC27141e).getDomainState();
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: nu1.d$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.lastnightsleep.domain.LastNightSleepInteractor$interact$lambda$0$$inlined$flatMapLatest$1", m100430f = "LastNightSleepInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f108573w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f108574x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f108575y;

        public e(InterfaceC30057d interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C27139c c27139c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            e eVar = new e(interfaceC30057d);
            eVar.f108574x = interfaceC13062m;
            eVar.f108575y = c27139c;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f108573w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f108574x;
                C13084s1 c13084s1 = new C13084s1(new b((C27139c) this.f108575y, null));
                this.f108574x = null;
                this.f108575y = null;
                this.f108573w = 1;
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
            return invoke((InterfaceC13062m) obj, (C27139c) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: nu1.d$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.lastnightsleep.domain.LastNightSleepInteractor$loadLastNightSleepCache$$inlined$cacheAPI$1", m100430f = "LastNightSleepInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f108576w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f108577x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f108578y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f108579z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f108579z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            f fVar = new f(interfaceC30057d, this.f108579z);
            fVar.f108577x = interfaceC13062m;
            fVar.f108578y = c26832c;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f108576w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f108577x;
                C26832c c26832c = (C26832c) this.f108578y;
                InterfaceC26834e interfaceC26834e = this.f108579z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(LastNightSleepModel.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(LastNightSleepModel.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f108577x = null;
                this.f108578y = null;
                this.f108576w = 1;
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

    /* JADX INFO: renamed from: nu1.d$g */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f108580w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C27140d f108581x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f108582y;

        /* JADX INFO: renamed from: nu1.d$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f108583w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C27140d f108584x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f108585y;

            /* JADX INFO: renamed from: nu1.d$g$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.lastnightsleep.domain.LastNightSleepInteractor$loadLastNightSleepCache$$inlined$map$1$2", m100430f = "LastNightSleepInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42093a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f108586E;

                /* JADX INFO: renamed from: F */
                Object f108587F;

                /* JADX INFO: renamed from: G */
                Object f108588G;

                /* JADX INFO: renamed from: H */
                int f108589H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f108590w;

                /* JADX INFO: renamed from: x */
                int f108591x;

                /* JADX INFO: renamed from: y */
                Object f108592y;

                public C42093a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f108590w = obj;
                    this.f108591x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C27140d c27140d, String str) {
                this.f108583w = interfaceC13062m;
                this.f108584x = c27140d;
                this.f108585y = str;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42093a c42093a;
                C27139c c27139c;
                if (interfaceC30057d instanceof C42093a) {
                    c42093a = (C42093a) interfaceC30057d;
                    int i13 = c42093a.f108591x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42093a.f108591x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42093a = new C42093a(interfaceC30057d);
                    }
                } else {
                    c42093a = new C42093a(interfaceC30057d);
                }
                Object obj2 = c42093a.f108590w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42093a.f108591x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f108583w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.e) {
                        c27139c = new C27139c(InterfaceC27137a.b.f108542a, null, null, null, 14, null);
                    } else if (interfaceC29354a instanceof InterfaceC29354a.a.b) {
                        c27139c = new C27139c(null, (LastNightSleepModel) ((InterfaceC29354a.a.b) interfaceC29354a).getData(), null, null, 13, null);
                    } else if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
                        c27139c = new C27139c(null, (LastNightSleepModel) ((InterfaceC29354a.a.C42173a) interfaceC29354a).getData(), null, null, 13, null);
                    } else {
                        if (!(interfaceC29354a instanceof InterfaceC29354a.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        InterfaceC29354a.b bVar = (InterfaceC29354a.b) interfaceC29354a;
                        this.f108584x.analytics.m72470b(new InterfaceC30627c.f(bVar.getErrorMessage()));
                        if (bVar instanceof InterfaceC29354a.d) {
                            c27139c = new C27139c(null, (LastNightSleepModel) ((InterfaceC29354a.d) interfaceC29354a).getData(), null, null, 13, null);
                        } else {
                            if (!(bVar instanceof InterfaceC29354a.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c27139c = new C27139c(new InterfaceC27137a.c(this.f108585y), null, null, null, 14, null);
                        }
                    }
                    c42093a.f108592y = null;
                    c42093a.f108586E = null;
                    c42093a.f108587F = null;
                    c42093a.f108588G = null;
                    c42093a.f108589H = 0;
                    c42093a.f108591x = 1;
                    if (interfaceC13062m.emit(c27139c, c42093a) == enumC31071a) {
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

        public g(InterfaceC13058l interfaceC13058l, C27140d c27140d, String str) {
            this.f108580w = interfaceC13058l;
            this.f108581x = c27140d;
            this.f108582y = str;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f108580w.collect(new a(interfaceC13062m, this.f108581x, this.f108582y), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C27140d(InterfaceC26834e cachedApiSource, C24748a analytics) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        AbstractC22676k.m65750j(analytics, "analytics");
        this.cachedApiSource = cachedApiSource;
        this.analytics = analytics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final C27139c m81618f(C27139c previousState, AbstractC27138b action) {
        if (action instanceof AbstractC27138b.c) {
            C27143g selectedHeartRateZoneType = previousState.getSelectedHeartRateZoneType();
            AbstractC27138b.c cVar = (AbstractC27138b.c) action;
            return C27139c.m81609b(previousState, null, null, (selectedHeartRateZoneType != null ? selectedHeartRateZoneType.getHeartRateZoneType() : null) != cVar.getHeartZoneType() ? new C27143g(cVar.getHeartZoneType(), cVar.getComponentId()) : null, null, 11, null);
        }
        if ((action instanceof AbstractC27138b.d) || !(action instanceof AbstractC27138b.b)) {
            return previousState;
        }
        AbstractC27138b.b bVar = (AbstractC27138b.b) action;
        if (bVar.getTimeDisplay() == null || bVar.getValueDisplay() == null) {
            return C27139c.m81609b(previousState, null, null, null, null, 7, null);
        }
        String componentId = bVar.getComponentId();
        TextResource valueDisplay = bVar.getValueDisplay();
        TextResource timeDisplay = bVar.getTimeDisplay();
        TextResource unitDisplay = bVar.getUnitDisplay();
        if (unitDisplay == null) {
            unitDisplay = AbstractC8693b.m21267a();
        }
        return C27139c.m81609b(previousState, null, null, null, new C27142f(valueDisplay, unitDisplay, timeDisplay, componentId, bVar.getScrubColor()), 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final InterfaceC13058l m81619g(String path) {
        C0141a c0141aM360e = AbstractC0142b.m360e(path);
        return new g(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new GetLastNightSleepRequest(c0141aM360e.getBasePath(), c0141aM360e.m354b()), 1), AbstractC25260n.m74059b1(new String[]{"home", SmartAlarmTriggerRepository.DEFAULT_REFRESH_SCOPE}), null, 2, null), new f(null, this.cachedApiSource)), this, path);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C27139c(InterfaceC27137a.b.f108542a, null, null, null, 14, null), AbstractC13091v.m36590P(upstream, new a(null, this)), new d(null));
    }
}
