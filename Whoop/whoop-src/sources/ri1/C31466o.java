package ri1;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;
import com.whoop.data.local.prefs.SharedPreferenceConstants;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
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
import u92.C34660d;

/* JADX INFO: renamed from: ri1.o */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lri1/o;", "Lod1/g;", "Lri1/l;", "Lri1/n;", "Lu92/d;", "sharedPreferences", "<init>", "(Lu92/d;)V", "Lri1/p;", "e", "()Lri1/p;", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lu92/d;", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31466o implements InterfaceC27844g<AbstractC31463l, C31465n> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C34660d sharedPreferences;

    /* JADX INFO: renamed from: ri1.o$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.health.domain.HealthspanHeroMetricInteractor$interact$$inlined$flatMapLatest$1", m100430f = "HealthspanHeroMetricInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f129646w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f129647x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f129648y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C31466o f129649z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, C31466o c31466o) {
            super(3, interfaceC30057d);
            this.f129649z = c31466o;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC31463l abstractC31463l, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f129649z);
            aVar.f129647x = interfaceC13062m;
            aVar.f129648y = abstractC31463l;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C13084s1 c13084s1;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f129646w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f129647x;
                AbstractC31463l abstractC31463l = (AbstractC31463l) this.f129648y;
                if (abstractC31463l instanceof AbstractC31463l.b) {
                    c13084s1 = new C13084s1(new b(abstractC31463l, null));
                } else {
                    if (!AbstractC22676k.m65745e(abstractC31463l, AbstractC31463l.a.f129638a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c13084s1 = new C13084s1(this.f129649z.new c(null));
                }
                this.f129647x = null;
                this.f129648y = null;
                this.f129646w = 1;
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
            return invoke((InterfaceC13062m) obj, (AbstractC31463l) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: ri1.o$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.health.domain.HealthspanHeroMetricInteractor$interact$1$1", m100430f = "HealthspanHeroMetricInteractor.kt", m100431l = {C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lri1/p$b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f129650w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f129651x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC31463l f129652y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC31463l abstractC31463l, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f129652y = abstractC31463l;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(this.f129652y, interfaceC30057d);
            bVar.f129651x = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f129651x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f129650w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC31467p.b bVar = new AbstractC31467p.b(((AbstractC31463l.b) this.f129652y).getViewState());
                this.f129651x = null;
                this.f129650w = 1;
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

    /* JADX INFO: renamed from: ri1.o$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.health.domain.HealthspanHeroMetricInteractor$interact$1$2", m100430f = "HealthspanHeroMetricInteractor.kt", m100431l = {C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lri1/p;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f129653w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f129654x;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = C31466o.this.new c(interfaceC30057d);
            cVar.f129654x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f129654x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f129653w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC31467p abstractC31467pM96906e = C31466o.this.m96906e();
                this.f129654x = null;
                this.f129653w = 1;
                if (interfaceC13062m.emit(abstractC31467pM96906e, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: ri1.o$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.health.domain.HealthspanHeroMetricInteractor$interact$2", m100430f = "HealthspanHeroMetricInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lri1/n;", "previousState", "Lri1/p;", "action", "<anonymous>", "(Lri1/n;Lri1/p;)Lri1/n;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f129656w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f129657x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f129658y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C31465n c31465n, AbstractC31467p abstractC31467p, InterfaceC30057d<? super C31465n> interfaceC30057d) {
            d dVar = C31466o.this.new d(interfaceC30057d);
            dVar.f129657x = c31465n;
            dVar.f129658y = abstractC31467p;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C31465n c31465n = (C31465n) this.f129657x;
            AbstractC31467p abstractC31467p = (AbstractC31467p) this.f129658y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f129656w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (!(abstractC31467p instanceof AbstractC31467p.b)) {
                if (abstractC31467p instanceof AbstractC31467p.a) {
                    return c31465n.getResult() instanceof InterfaceC31464m.b ? C31465n.m96899b(c31465n, null, null, true, 3, null) : c31465n;
                }
                throw new NoWhenBranchMatchedException();
            }
            AbstractC31467p.b bVar = (AbstractC31467p.b) abstractC31467p;
            if (!bVar.getViewState().getIsCalibrating()) {
                C31466o.this.sharedPreferences.m109538q(SharedPreferenceConstants.KEY_TORTOISE_HAS_CLOSED_CALIBRATION, false);
            }
            return new C31465n(InterfaceC31464m.b.f129641a, bVar.getViewState(), C31466o.this.sharedPreferences.m109528e(SharedPreferenceConstants.KEY_TORTOISE_HAS_CLOSED_CALIBRATION, false));
        }
    }

    public C31466o(C34660d sharedPreferences) {
        AbstractC22676k.m65750j(sharedPreferences, "sharedPreferences");
        this.sharedPreferences = sharedPreferences;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public final AbstractC31467p m96906e() {
        this.sharedPreferences.m109538q(SharedPreferenceConstants.KEY_TORTOISE_HAS_CLOSED_CALIBRATION, true);
        return AbstractC31467p.a.f129660a;
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C31465n(InterfaceC31464m.a.f129640a, null, false, 6, null), AbstractC13091v.m36590P(upstream, new a(null, this)), new d(null));
    }
}
