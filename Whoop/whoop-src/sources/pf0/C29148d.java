package pf0;

import c93.InterfaceC4351m;
import com.whoop.advancedlabsjoin.feature.join.domain.GetAdvancedLabsJoinRequest;
import com.whoop.advancedlabsjoin.feature.join.domain.models.AdvancedLabsJoinModels;
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

/* JADX INFO: renamed from: pf0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\b\b\u0002\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00032\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lpf0/d;", "Lod1/g;", "Lpf0/b;", "Lpf0/c;", "Lnm0/e;", "cachedApiSource", "<init>", "(Lnm0/e;)V", "previousState", "action", "e", "(Lpf0/c;Lpf0/b;)Lpf0/c;", "", "manualRefresh", "", "source", "testCount", "initiallySelectedSegmentId", "Lec3/l;", "g", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lec3/l;", "Lpm0/a$c;", "Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;", "cacheResult", "f", "(Lpm0/a$c;)Lpf0/c;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lnm0/e;", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29148d implements InterfaceC27844g<AbstractC29146b, C29147c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: pf0.d$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabsjoin.feature.join.domain.AdvancedLabsJoinInteractor$interact$$inlined$flatMapLatest$1", m100430f = "AdvancedLabsJoinInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f117953w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f117954x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f117955y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C29148d f117956z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, C29148d c29148d) {
            super(3, interfaceC30057d);
            this.f117956z = c29148d;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC29146b abstractC29146b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f117956z);
            aVar.f117954x = interfaceC13062m;
            aVar.f117955y = abstractC29146b;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c13084s1;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f117953w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f117954x;
                AbstractC29146b abstractC29146b = (AbstractC29146b) this.f117955y;
                if (abstractC29146b instanceof AbstractC29146b.b) {
                    AbstractC29146b.b bVar = (AbstractC29146b.b) abstractC29146b;
                    c13084s1 = AbstractC13091v.m36590P(C29148d.m88568h(this.f117956z, false, bVar.getSource(), bVar.getTestCount(), bVar.getInitiallySelectedSegmentId(), 1, null), new e(null));
                } else {
                    c13084s1 = new C13084s1(new c(abstractC29146b, null));
                }
                this.f117954x = null;
                this.f117955y = null;
                this.f117953w = 1;
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
            return invoke((InterfaceC13062m) obj, (AbstractC29146b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: pf0.d$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabsjoin.feature.join.domain.AdvancedLabsJoinInteractor$interact$1$1$1", m100430f = "AdvancedLabsJoinInteractor.kt", m100431l = {36}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lpf0/e$a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f117957w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f117958x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C29147c f117959y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C29147c c29147c, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f117959y = c29147c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(this.f117959y, interfaceC30057d);
            bVar.f117958x = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f117958x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f117957w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC29149e.a aVar = new AbstractC29149e.a(this.f117959y);
                this.f117958x = null;
                this.f117957w = 1;
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

    /* JADX INFO: renamed from: pf0.d$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabsjoin.feature.join.domain.AdvancedLabsJoinInteractor$interact$1$2", m100430f = "AdvancedLabsJoinInteractor.kt", m100431l = {40}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lpf0/e$b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f117960w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f117961x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC29146b f117962y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC29146b abstractC29146b, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f117962y = abstractC29146b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(this.f117962y, interfaceC30057d);
            cVar.f117961x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f117961x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f117960w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC29149e.b bVar = new AbstractC29149e.b(this.f117962y);
                this.f117961x = null;
                this.f117960w = 1;
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

    /* JADX INFO: renamed from: pf0.d$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabsjoin.feature.join.domain.AdvancedLabsJoinInteractor$interact$2", m100430f = "AdvancedLabsJoinInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lpf0/c;", "previousState", "Lpf0/e;", "action", "<anonymous>", "(Lpf0/c;Lpf0/e;)Lpf0/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f117963w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f117964x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f117965y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C29147c c29147c, AbstractC29149e abstractC29149e, InterfaceC30057d<? super C29147c> interfaceC30057d) {
            d dVar = C29148d.this.new d(interfaceC30057d);
            dVar.f117964x = c29147c;
            dVar.f117965y = abstractC29149e;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C29147c c29147c = (C29147c) this.f117964x;
            AbstractC29149e abstractC29149e = (AbstractC29149e) this.f117965y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f117963w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (abstractC29149e instanceof AbstractC29149e.b) {
                return C29148d.this.m88565e(c29147c, ((AbstractC29149e.b) abstractC29149e).getDomainAction());
            }
            if (!(abstractC29149e instanceof AbstractC29149e.a)) {
                throw new NoWhenBranchMatchedException();
            }
            String selectedSegmentId = c29147c.getSelectedSegmentId();
            if (selectedSegmentId.length() == 0) {
                selectedSegmentId = ((AbstractC29149e.a) abstractC29149e).getDomainState().getSelectedSegmentId();
            }
            return C29147c.m88555b(((AbstractC29149e.a) abstractC29149e).getDomainState(), null, null, null, selectedSegmentId, false, false, 55, null);
        }
    }

    /* JADX INFO: renamed from: pf0.d$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabsjoin.feature.join.domain.AdvancedLabsJoinInteractor$interact$lambda$0$$inlined$flatMapLatest$1", m100430f = "AdvancedLabsJoinInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f117967w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f117968x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f117969y;

        public e(InterfaceC30057d interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C29147c c29147c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            e eVar = new e(interfaceC30057d);
            eVar.f117968x = interfaceC13062m;
            eVar.f117969y = c29147c;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f117967w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f117968x;
                C13084s1 c13084s1 = new C13084s1(new b((C29147c) this.f117969y, null));
                this.f117968x = null;
                this.f117969y = null;
                this.f117967w = 1;
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
            return invoke((InterfaceC13062m) obj, (C29147c) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: pf0.d$f */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabsjoin.feature.join.domain.AdvancedLabsJoinInteractor$loadAdvancedLabsJoinCache$$inlined$cacheAPI$1", m100430f = "AdvancedLabsJoinInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f117970w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f117971x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f117972y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f117973z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f117973z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            f fVar = new f(interfaceC30057d, this.f117973z);
            fVar.f117971x = interfaceC13062m;
            fVar.f117972y = c26832c;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f117970w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f117971x;
                C26832c c26832c = (C26832c) this.f117972y;
                InterfaceC26834e interfaceC26834e = this.f117973z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(AdvancedLabsJoinModels.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(AdvancedLabsJoinModels.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f117971x = null;
                this.f117972y = null;
                this.f117970w = 1;
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

    /* JADX INFO: renamed from: pf0.d$g */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC13058l {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f117974E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ String f117975F;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f117976w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ String f117977x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f117978y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C29148d f117979z;

        /* JADX INFO: renamed from: pf0.d$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ String f117980E;

            /* JADX INFO: renamed from: F */
            final /* synthetic */ String f117981F;

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f117982w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ String f117983x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ boolean f117984y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ C29148d f117985z;

            /* JADX INFO: renamed from: pf0.d$g$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabsjoin.feature.join.domain.AdvancedLabsJoinInteractor$loadAdvancedLabsJoinCache$$inlined$map$1$2", m100430f = "AdvancedLabsJoinInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42164a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f117986E;

                /* JADX INFO: renamed from: F */
                Object f117987F;

                /* JADX INFO: renamed from: G */
                Object f117988G;

                /* JADX INFO: renamed from: H */
                int f117989H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f117990w;

                /* JADX INFO: renamed from: x */
                int f117991x;

                /* JADX INFO: renamed from: y */
                Object f117992y;

                public C42164a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f117990w = obj;
                    this.f117991x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, String str, boolean z4, C29148d c29148d, String str2, String str3) {
                this.f117982w = interfaceC13062m;
                this.f117983x = str;
                this.f117984y = z4;
                this.f117985z = c29148d;
                this.f117980E = str2;
                this.f117981F = str3;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42164a c42164a;
                C29147c c29147cM88555b;
                if (interfaceC30057d instanceof C42164a) {
                    c42164a = (C42164a) interfaceC30057d;
                    int i13 = c42164a.f117991x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42164a.f117991x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42164a = new C42164a(interfaceC30057d);
                    }
                } else {
                    c42164a = new C42164a(interfaceC30057d);
                }
                Object obj2 = c42164a.f117990w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42164a.f117991x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f117982w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.e) {
                        c29147cM88555b = new C29147c(this.f117983x, InterfaceC29145a.c.f117939a, null, null, false, false, 60, null);
                    } else if (interfaceC29354a instanceof InterfaceC29354a.a.b) {
                        InterfaceC29354a.a.b bVar = (InterfaceC29354a.a.b) interfaceC29354a;
                        c29147cM88555b = new C29147c(this.f117983x, null, (AdvancedLabsJoinModels) bVar.getData(), ((AdvancedLabsJoinModels) bVar.getData()).getInitiallySelectedSegmentId(), this.f117984y, true, 2, null);
                    } else if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
                        InterfaceC29354a.a.C42173a c42173a = (InterfaceC29354a.a.C42173a) interfaceC29354a;
                        c29147cM88555b = new C29147c(this.f117983x, null, (AdvancedLabsJoinModels) c42173a.getData(), ((AdvancedLabsJoinModels) c42173a.getData()).getInitiallySelectedSegmentId(), false, false, 50, null);
                    } else if (interfaceC29354a instanceof InterfaceC29354a.d) {
                        InterfaceC29354a.d dVar = (InterfaceC29354a.d) interfaceC29354a;
                        c29147cM88555b = new C29147c(this.f117983x, null, (AdvancedLabsJoinModels) dVar.getData(), ((AdvancedLabsJoinModels) dVar.getData()).getInitiallySelectedSegmentId(), false, false, 50, null);
                    } else {
                        if (!(interfaceC29354a instanceof InterfaceC29354a.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        C29147c c29147cM88566f = this.f117985z.m88566f((InterfaceC29354a.c) interfaceC29354a);
                        String str = this.f117983x;
                        String str2 = this.f117980E;
                        if (str2.length() == 0) {
                            str2 = this.f117981F;
                        }
                        c29147cM88555b = C29147c.m88555b(c29147cM88566f, str, null, null, str2, false, false, 54, null);
                    }
                    c42164a.f117992y = null;
                    c42164a.f117986E = null;
                    c42164a.f117987F = null;
                    c42164a.f117988G = null;
                    c42164a.f117989H = 0;
                    c42164a.f117991x = 1;
                    if (interfaceC13062m.emit(c29147cM88555b, c42164a) == enumC31071a) {
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

        public g(InterfaceC13058l interfaceC13058l, String str, boolean z4, C29148d c29148d, String str2, String str3) {
            this.f117976w = interfaceC13058l;
            this.f117977x = str;
            this.f117978y = z4;
            this.f117979z = c29148d;
            this.f117974E = str2;
            this.f117975F = str3;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f117976w.collect(new a(interfaceC13062m, this.f117977x, this.f117978y, this.f117979z, this.f117974E, this.f117975F), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C29148d(InterfaceC26834e cachedApiSource) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        this.cachedApiSource = cachedApiSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public final C29147c m88565e(C29147c previousState, AbstractC29146b action) {
        if (action instanceof AbstractC29146b.b) {
            return previousState;
        }
        if (action instanceof AbstractC29146b.a) {
            return C29147c.m88555b(previousState, null, InterfaceC29145a.a.f117938a, null, null, false, false, 61, null);
        }
        if (action instanceof AbstractC29146b.c) {
            return C29147c.m88555b(previousState, null, null, null, ((AbstractC29146b.c) action).getSelectedSegmentId(), false, false, 55, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final C29147c m88566f(InterfaceC29354a.c<AdvancedLabsJoinModels> cacheResult) {
        return AbstractC29355b.m89462a(cacheResult) ? new C29147c(null, InterfaceC29145a.f.f117941a, null, null, false, false, 61, null) : new C29147c(null, InterfaceC29145a.d.f117940a, null, null, false, false, 61, null);
    }

    /* JADX INFO: renamed from: g */
    private final InterfaceC13058l m88567g(boolean manualRefresh, String source, String testCount, String initiallySelectedSegmentId) {
        return new g(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new GetAdvancedLabsJoinRequest(testCount, initiallySelectedSegmentId), 1), AbstractC12350b.m34570S("advancedlabsjoin"), null, 2, null), new f(null, this.cachedApiSource)), source, manualRefresh, this, initiallySelectedSegmentId, testCount);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ InterfaceC13058l m88568h(C29148d c29148d, boolean z4, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = false;
        }
        if ((i13 & 8) != 0) {
            str3 = "";
        }
        return c29148d.m88567g(z4, str, str2, str3);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C29147c(null, InterfaceC29145a.c.f117939a, null, null, false, false, 61, null), AbstractC13091v.m36590P(upstream, new a(null, this)), new d(null));
    }
}
