package wf0;

import c93.InterfaceC4351m;
import com.whoop.advancedlabsjoin.feature.purchaseaddons.domain.GetPurchaseAddOnsRequest;
import com.whoop.advancedlabsjoin.feature.purchaseaddons.domain.models.PurchaseAddOnsModels;
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

/* JADX INFO: renamed from: wf0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\u00032\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lwf0/d;", "Lod1/g;", "Lwf0/b;", "Lwf0/c;", "Lnm0/e;", "cachedApiSource", "<init>", "(Lnm0/e;)V", "previousState", "action", "e", "(Lwf0/c;Lwf0/b;)Lwf0/c;", "", "source", "testCount", "", "manualRefresh", "Lec3/l;", "g", "(Ljava/lang/String;Ljava/lang/String;Z)Lec3/l;", "Lpm0/a$c;", "Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/domain/models/PurchaseAddOnsModels;", "cacheResult", "f", "(Lpm0/a$c;)Lwf0/c;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lnm0/e;", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37241d implements InterfaceC27844g<AbstractC37239b, C37240c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: wf0.d$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabsjoin.feature.purchaseaddons.domain.PurchaseAddOnsInteractor$interact$$inlined$flatMapLatest$1", m100430f = "PurchaseAddOnsInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f159258w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f159259x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f159260y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C37241d f159261z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, C37241d c37241d) {
            super(3, interfaceC30057d);
            this.f159261z = c37241d;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC37239b abstractC37239b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f159261z);
            aVar.f159259x = interfaceC13062m;
            aVar.f159260y = abstractC37239b;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c13084s1;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f159258w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f159259x;
                AbstractC37239b abstractC37239b = (AbstractC37239b) this.f159260y;
                if (abstractC37239b instanceof AbstractC37239b.b) {
                    AbstractC37239b.b bVar = (AbstractC37239b.b) abstractC37239b;
                    c13084s1 = AbstractC13091v.m36590P(C37241d.m119353h(this.f159261z, bVar.getSource(), bVar.getTestCount(), false, 4, null), new e(null));
                } else {
                    c13084s1 = new C13084s1(new c(abstractC37239b, null));
                }
                this.f159259x = null;
                this.f159260y = null;
                this.f159258w = 1;
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
            return invoke((InterfaceC13062m) obj, (AbstractC37239b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: wf0.d$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabsjoin.feature.purchaseaddons.domain.PurchaseAddOnsInteractor$interact$1$1$1", m100430f = "PurchaseAddOnsInteractor.kt", m100431l = {30}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lwf0/e$a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f159262w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f159263x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C37240c f159264y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C37240c c37240c, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f159264y = c37240c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(this.f159264y, interfaceC30057d);
            bVar.f159263x = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f159263x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f159262w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC37242e.a aVar = new AbstractC37242e.a(this.f159264y);
                this.f159263x = null;
                this.f159262w = 1;
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

    /* JADX INFO: renamed from: wf0.d$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabsjoin.feature.purchaseaddons.domain.PurchaseAddOnsInteractor$interact$1$2", m100430f = "PurchaseAddOnsInteractor.kt", m100431l = {34}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lwf0/e$b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f159265w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f159266x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC37239b f159267y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC37239b abstractC37239b, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f159267y = abstractC37239b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(this.f159267y, interfaceC30057d);
            cVar.f159266x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f159266x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f159265w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC37242e.b bVar = new AbstractC37242e.b(this.f159267y);
                this.f159266x = null;
                this.f159265w = 1;
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

    /* JADX INFO: renamed from: wf0.d$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabsjoin.feature.purchaseaddons.domain.PurchaseAddOnsInteractor$interact$2", m100430f = "PurchaseAddOnsInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lwf0/c;", "previousState", "Lwf0/e;", "action", "<anonymous>", "(Lwf0/c;Lwf0/e;)Lwf0/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f159268w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f159269x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f159270y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C37240c c37240c, AbstractC37242e abstractC37242e, InterfaceC30057d<? super C37240c> interfaceC30057d) {
            d dVar = C37241d.this.new d(interfaceC30057d);
            dVar.f159269x = c37240c;
            dVar.f159270y = abstractC37242e;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C37240c c37240c = (C37240c) this.f159269x;
            AbstractC37242e abstractC37242e = (AbstractC37242e) this.f159270y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f159268w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (abstractC37242e instanceof AbstractC37242e.b) {
                return C37241d.this.m119350e(c37240c, ((AbstractC37242e.b) abstractC37242e).getDomainAction());
            }
            if (!(abstractC37242e instanceof AbstractC37242e.a)) {
                throw new NoWhenBranchMatchedException();
            }
            String selectedSegmentId = c37240c.getSelectedSegmentId();
            if (selectedSegmentId.length() == 0) {
                selectedSegmentId = ((AbstractC37242e.a) abstractC37242e).getDomainState().getSelectedSegmentId();
            }
            return C37240c.m119340b(((AbstractC37242e.a) abstractC37242e).getDomainState(), null, null, selectedSegmentId, null, false, false, 59, null);
        }
    }

    /* JADX INFO: renamed from: wf0.d$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabsjoin.feature.purchaseaddons.domain.PurchaseAddOnsInteractor$interact$lambda$0$$inlined$flatMapLatest$1", m100430f = "PurchaseAddOnsInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f159272w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f159273x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f159274y;

        public e(InterfaceC30057d interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C37240c c37240c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            e eVar = new e(interfaceC30057d);
            eVar.f159273x = interfaceC13062m;
            eVar.f159274y = c37240c;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f159272w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f159273x;
                C13084s1 c13084s1 = new C13084s1(new b((C37240c) this.f159274y, null));
                this.f159273x = null;
                this.f159274y = null;
                this.f159272w = 1;
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
            return invoke((InterfaceC13062m) obj, (C37240c) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: wf0.d$f */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabsjoin.feature.purchaseaddons.domain.PurchaseAddOnsInteractor$loadPurchaseAddOnsCache$$inlined$cacheAPI$1", m100430f = "PurchaseAddOnsInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f159275w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f159276x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f159277y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f159278z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f159278z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            f fVar = new f(interfaceC30057d, this.f159278z);
            fVar.f159276x = interfaceC13062m;
            fVar.f159277y = c26832c;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f159275w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f159276x;
                C26832c c26832c = (C26832c) this.f159277y;
                InterfaceC26834e interfaceC26834e = this.f159278z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(PurchaseAddOnsModels.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(PurchaseAddOnsModels.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f159276x = null;
                this.f159277y = null;
                this.f159275w = 1;
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

    /* JADX INFO: renamed from: wf0.d$g */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC13058l {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f159279E;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f159280w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ String f159281x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f159282y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C37241d f159283z;

        /* JADX INFO: renamed from: wf0.d$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ String f159284E;

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f159285w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ String f159286x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ boolean f159287y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ C37241d f159288z;

            /* JADX INFO: renamed from: wf0.d$g$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabsjoin.feature.purchaseaddons.domain.PurchaseAddOnsInteractor$loadPurchaseAddOnsCache$$inlined$map$1$2", m100430f = "PurchaseAddOnsInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42588a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f159289E;

                /* JADX INFO: renamed from: F */
                Object f159290F;

                /* JADX INFO: renamed from: G */
                Object f159291G;

                /* JADX INFO: renamed from: H */
                int f159292H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f159293w;

                /* JADX INFO: renamed from: x */
                int f159294x;

                /* JADX INFO: renamed from: y */
                Object f159295y;

                public C42588a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f159293w = obj;
                    this.f159294x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, String str, boolean z4, C37241d c37241d, String str2) {
                this.f159285w = interfaceC13062m;
                this.f159286x = str;
                this.f159287y = z4;
                this.f159288z = c37241d;
                this.f159284E = str2;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42588a c42588a;
                C37240c c37240cM119340b;
                C37240c c37240c;
                if (interfaceC30057d instanceof C42588a) {
                    c42588a = (C42588a) interfaceC30057d;
                    int i13 = c42588a.f159294x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42588a.f159294x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42588a = new C42588a(interfaceC30057d);
                    }
                } else {
                    c42588a = new C42588a(interfaceC30057d);
                }
                Object obj2 = c42588a.f159293w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42588a.f159294x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f159285w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.e) {
                        c37240cM119340b = new C37240c(InterfaceC37238a.c.f159245a, null, null, this.f159286x, false, false, 54, null);
                    } else {
                        if (interfaceC29354a instanceof InterfaceC29354a.a.b) {
                            InterfaceC29354a.a.b bVar = (InterfaceC29354a.a.b) interfaceC29354a;
                            PurchaseAddOnsModels purchaseAddOnsModels = (PurchaseAddOnsModels) bVar.getData();
                            String initiallySelectedSegmentId = ((PurchaseAddOnsModels) bVar.getData()).getInitiallySelectedSegmentId();
                            c37240c = new C37240c(null, purchaseAddOnsModels, initiallySelectedSegmentId == null ? "" : initiallySelectedSegmentId, this.f159286x, this.f159287y, true, 1, null);
                        } else if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
                            InterfaceC29354a.a.C42173a c42173a = (InterfaceC29354a.a.C42173a) interfaceC29354a;
                            PurchaseAddOnsModels purchaseAddOnsModels2 = (PurchaseAddOnsModels) c42173a.getData();
                            String initiallySelectedSegmentId2 = ((PurchaseAddOnsModels) c42173a.getData()).getInitiallySelectedSegmentId();
                            c37240c = new C37240c(null, purchaseAddOnsModels2, initiallySelectedSegmentId2 == null ? "" : initiallySelectedSegmentId2, this.f159286x, false, false, 49, null);
                        } else if (interfaceC29354a instanceof InterfaceC29354a.d) {
                            InterfaceC29354a.d dVar = (InterfaceC29354a.d) interfaceC29354a;
                            PurchaseAddOnsModels purchaseAddOnsModels3 = (PurchaseAddOnsModels) dVar.getData();
                            String initiallySelectedSegmentId3 = ((PurchaseAddOnsModels) dVar.getData()).getInitiallySelectedSegmentId();
                            c37240c = new C37240c(null, purchaseAddOnsModels3, initiallySelectedSegmentId3 == null ? "" : initiallySelectedSegmentId3, this.f159286x, false, false, 49, null);
                        } else {
                            if (!(interfaceC29354a instanceof InterfaceC29354a.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c37240cM119340b = C37240c.m119340b(this.f159288z.m119351f((InterfaceC29354a.c) interfaceC29354a), null, null, this.f159284E, this.f159286x, false, false, 51, null);
                        }
                        c37240cM119340b = c37240c;
                    }
                    c42588a.f159295y = null;
                    c42588a.f159289E = null;
                    c42588a.f159290F = null;
                    c42588a.f159291G = null;
                    c42588a.f159292H = 0;
                    c42588a.f159294x = 1;
                    if (interfaceC13062m.emit(c37240cM119340b, c42588a) == enumC31071a) {
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

        public g(InterfaceC13058l interfaceC13058l, String str, boolean z4, C37241d c37241d, String str2) {
            this.f159280w = interfaceC13058l;
            this.f159281x = str;
            this.f159282y = z4;
            this.f159283z = c37241d;
            this.f159279E = str2;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f159280w.collect(new a(interfaceC13062m, this.f159281x, this.f159282y, this.f159283z, this.f159279E), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C37241d(InterfaceC26834e cachedApiSource) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        this.cachedApiSource = cachedApiSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public final C37240c m119350e(C37240c previousState, AbstractC37239b action) {
        if (action instanceof AbstractC37239b.b) {
            return previousState;
        }
        if (action instanceof AbstractC37239b.a) {
            return C37240c.m119340b(previousState, InterfaceC37238a.a.f159244a, null, null, null, false, false, 62, null);
        }
        if (action instanceof AbstractC37239b.c) {
            return C37240c.m119340b(previousState, null, null, ((AbstractC37239b.c) action).getSelectedSegmentId(), null, false, false, 59, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final C37240c m119351f(InterfaceC29354a.c<PurchaseAddOnsModels> cacheResult) {
        return AbstractC29355b.m89462a(cacheResult) ? new C37240c(InterfaceC37238a.f.f159247a, null, null, null, false, false, 62, null) : new C37240c(InterfaceC37238a.d.f159246a, null, null, null, false, false, 62, null);
    }

    /* JADX INFO: renamed from: g */
    private final InterfaceC13058l m119352g(String source, String testCount, boolean manualRefresh) {
        return new g(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new GetPurchaseAddOnsRequest(testCount), 1), AbstractC12350b.m34570S("PurchaseAddOns_SCOPE"), null, 2, null), new f(null, this.cachedApiSource)), source, manualRefresh, this, testCount);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ InterfaceC13058l m119353h(C37241d c37241d, String str, String str2, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = "";
        }
        if ((i13 & 2) != 0) {
            str2 = "";
        }
        if ((i13 & 4) != 0) {
            z4 = false;
        }
        return c37241d.m119352g(str, str2, z4);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C37240c(InterfaceC37238a.c.f159245a, null, null, null, false, false, 62, null), AbstractC13091v.m36590P(upstream, new a(null, this)), new d(null));
    }
}
