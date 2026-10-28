package r60;

import c93.InterfaceC4351m;
import com.whoop.achievements.domain.GetAchievementsRequest;
import com.whoop.achievements.domain.models.AchievementsResponse;
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

/* JADX INFO: renamed from: r60.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0017\u001a\u00020\u00032\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lr60/d;", "Lod1/g;", "Lr60/b;", "Lr60/c;", "Lnm0/e;", "cachedApiSource", "<init>", "(Lnm0/e;)V", "previousState", "action", "e", "(Lr60/c;Lr60/b;)Lr60/c;", "", "achievementType", "source", "", "manualRefresh", "Lec3/l;", "g", "(Ljava/lang/String;Ljava/lang/String;Z)Lec3/l;", "Lpm0/a$c;", "Lcom/whoop/achievements/domain/models/AchievementsResponse;", "cacheResult", "f", "(Lpm0/a$c;Ljava/lang/String;Ljava/lang/String;)Lr60/c;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lnm0/e;", "achievements_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30976d implements InterfaceC27844g<AbstractC30974b, C30975c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: r60.d$a */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.achievements.domain.AchievementsInteractor$interact$$inlined$flatMapLatest$1", m100430f = "AchievementsInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f127739w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f127740x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f127741y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C30976d f127742z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, C30976d c30976d) {
            super(3, interfaceC30057d);
            this.f127742z = c30976d;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC30974b abstractC30974b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f127742z);
            aVar.f127740x = interfaceC13062m;
            aVar.f127741y = abstractC30974b;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c13084s1;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f127739w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f127740x;
                AbstractC30974b abstractC30974b = (AbstractC30974b) this.f127741y;
                if (abstractC30974b instanceof AbstractC30974b.a) {
                    AbstractC30974b.a aVar = (AbstractC30974b.a) abstractC30974b;
                    c13084s1 = AbstractC13091v.m36590P(C30976d.m95287h(this.f127742z, aVar.getAchievementType(), aVar.getSource(), false, 4, null), new e(null));
                } else {
                    c13084s1 = new C13084s1(new c(abstractC30974b, null));
                }
                this.f127740x = null;
                this.f127741y = null;
                this.f127739w = 1;
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
            return invoke((InterfaceC13062m) obj, (AbstractC30974b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: r60.d$b */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.achievements.domain.AchievementsInteractor$interact$1$internalActionFlow$1$1", m100430f = "AchievementsInteractor.kt", m100431l = {28}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lr60/e;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f127743w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f127744x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C30975c f127745y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C30975c c30975c, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f127745y = c30975c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(this.f127745y, interfaceC30057d);
            bVar.f127744x = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f127744x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f127743w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC30977e.b bVar = new AbstractC30977e.b(this.f127745y);
                this.f127744x = null;
                this.f127743w = 1;
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

    /* JADX INFO: renamed from: r60.d$c */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.achievements.domain.AchievementsInteractor$interact$1$internalActionFlow$2", m100430f = "AchievementsInteractor.kt", m100431l = {29}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lr60/e;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f127746w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f127747x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC30974b f127748y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC30974b abstractC30974b, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f127748y = abstractC30974b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(this.f127748y, interfaceC30057d);
            cVar.f127747x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f127747x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f127746w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC30977e.a aVar = new AbstractC30977e.a(this.f127748y);
                this.f127747x = null;
                this.f127746w = 1;
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

    /* JADX INFO: renamed from: r60.d$d */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.achievements.domain.AchievementsInteractor$interact$2", m100430f = "AchievementsInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lr60/c;", "previousState", "Lr60/e;", "action", "<anonymous>", "(Lr60/c;Lr60/e;)Lr60/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f127749w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f127750x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f127751y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C30975c c30975c, AbstractC30977e abstractC30977e, InterfaceC30057d<? super C30975c> interfaceC30057d) {
            d dVar = C30976d.this.new d(interfaceC30057d);
            dVar.f127750x = c30975c;
            dVar.f127751y = abstractC30977e;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C30975c c30975c = (C30975c) this.f127750x;
            AbstractC30977e abstractC30977e = (AbstractC30977e) this.f127751y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f127749w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (abstractC30977e instanceof AbstractC30977e.a) {
                return C30976d.this.m95284e(c30975c, ((AbstractC30977e.a) abstractC30977e).getDomainAction());
            }
            if (abstractC30977e instanceof AbstractC30977e.b) {
                return ((AbstractC30977e.b) abstractC30977e).getDomainState();
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: r60.d$e */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.achievements.domain.AchievementsInteractor$interact$lambda$0$$inlined$flatMapLatest$1", m100430f = "AchievementsInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f127753w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f127754x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f127755y;

        public e(InterfaceC30057d interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C30975c c30975c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            e eVar = new e(interfaceC30057d);
            eVar.f127754x = interfaceC13062m;
            eVar.f127755y = c30975c;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f127753w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f127754x;
                C13084s1 c13084s1 = new C13084s1(new b((C30975c) this.f127755y, null));
                this.f127754x = null;
                this.f127755y = null;
                this.f127753w = 1;
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
            return invoke((InterfaceC13062m) obj, (C30975c) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: r60.d$f */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.achievements.domain.AchievementsInteractor$loadAchievementsCache$$inlined$cacheAPI$1", m100430f = "AchievementsInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f127756w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f127757x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f127758y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f127759z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f127759z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            f fVar = new f(interfaceC30057d, this.f127759z);
            fVar.f127757x = interfaceC13062m;
            fVar.f127758y = c26832c;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f127756w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f127757x;
                C26832c c26832c = (C26832c) this.f127758y;
                InterfaceC26834e interfaceC26834e = this.f127759z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(AchievementsResponse.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(AchievementsResponse.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f127757x = null;
                this.f127758y = null;
                this.f127756w = 1;
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

    /* JADX INFO: renamed from: r60.d$g */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC13058l {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C30976d f127760E;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f127761w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ String f127762x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f127763y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ boolean f127764z;

        /* JADX INFO: renamed from: r60.d$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ C30976d f127765E;

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f127766w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ String f127767x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f127768y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ boolean f127769z;

            /* JADX INFO: renamed from: r60.d$g$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.achievements.domain.AchievementsInteractor$loadAchievementsCache$$inlined$map$1$2", m100430f = "AchievementsInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42254a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f127770E;

                /* JADX INFO: renamed from: F */
                Object f127771F;

                /* JADX INFO: renamed from: G */
                Object f127772G;

                /* JADX INFO: renamed from: H */
                int f127773H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f127774w;

                /* JADX INFO: renamed from: x */
                int f127775x;

                /* JADX INFO: renamed from: y */
                Object f127776y;

                public C42254a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f127774w = obj;
                    this.f127775x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, String str, String str2, boolean z4, C30976d c30976d) {
                this.f127766w = interfaceC13062m;
                this.f127767x = str;
                this.f127768y = str2;
                this.f127769z = z4;
                this.f127765E = c30976d;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42254a c42254a;
                C30975c c30975cM95285f;
                if (interfaceC30057d instanceof C42254a) {
                    c42254a = (C42254a) interfaceC30057d;
                    int i13 = c42254a.f127775x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42254a.f127775x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42254a = new C42254a(interfaceC30057d);
                    }
                } else {
                    c42254a = new C42254a(interfaceC30057d);
                }
                Object obj2 = c42254a.f127774w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42254a.f127775x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f127766w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.e) {
                        c30975cM95285f = new C30975c(InterfaceC30973a.b.f127726a, null, this.f127767x, this.f127768y, false, false, null, 114, null);
                    } else if (interfaceC29354a instanceof InterfaceC29354a.a.b) {
                        c30975cM95285f = new C30975c(null, (AchievementsResponse) ((InterfaceC29354a.a.b) interfaceC29354a).getData(), this.f127767x, this.f127768y, this.f127769z, true, null, 65, null);
                    } else if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
                        c30975cM95285f = new C30975c(null, (AchievementsResponse) ((InterfaceC29354a.a.C42173a) interfaceC29354a).getData(), this.f127767x, this.f127768y, false, false, null, 113, null);
                    } else if (interfaceC29354a instanceof InterfaceC29354a.d) {
                        c30975cM95285f = new C30975c(null, (AchievementsResponse) ((InterfaceC29354a.d) interfaceC29354a).getData(), this.f127767x, this.f127768y, false, false, null, 113, null);
                    } else {
                        if (!(interfaceC29354a instanceof InterfaceC29354a.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c30975cM95285f = this.f127765E.m95285f((InterfaceC29354a.c) interfaceC29354a, this.f127767x, this.f127768y);
                    }
                    c42254a.f127776y = null;
                    c42254a.f127770E = null;
                    c42254a.f127771F = null;
                    c42254a.f127772G = null;
                    c42254a.f127773H = 0;
                    c42254a.f127775x = 1;
                    if (interfaceC13062m.emit(c30975cM95285f, c42254a) == enumC31071a) {
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

        public g(InterfaceC13058l interfaceC13058l, String str, String str2, boolean z4, C30976d c30976d) {
            this.f127761w = interfaceC13058l;
            this.f127762x = str;
            this.f127763y = str2;
            this.f127764z = z4;
            this.f127760E = c30976d;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f127761w.collect(new a(interfaceC13062m, this.f127762x, this.f127763y, this.f127764z, this.f127760E), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C30976d(InterfaceC26834e cachedApiSource) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        this.cachedApiSource = cachedApiSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public final C30975c m95284e(C30975c previousState, AbstractC30974b action) {
        return previousState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final C30975c m95285f(InterfaceC29354a.c<AchievementsResponse> cacheResult, String achievementType, String source) {
        return AbstractC29355b.m89462a(cacheResult) ? new C30975c(InterfaceC30973a.d.f127728a, null, achievementType, source, false, false, null, 114, null) : new C30975c(InterfaceC30973a.c.f127727a, null, achievementType, source, false, false, null, 114, null);
    }

    /* JADX INFO: renamed from: g */
    private final InterfaceC13058l m95286g(String achievementType, String source, boolean manualRefresh) {
        return new g(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new GetAchievementsRequest(achievementType, source), 1), AbstractC12350b.m34570S("achievements_" + achievementType), null, 2, null), new f(null, this.cachedApiSource)), achievementType, source, manualRefresh, this);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ InterfaceC13058l m95287h(C30976d c30976d, String str, String str2, boolean z4, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str2 = null;
        }
        if ((i13 & 4) != 0) {
            z4 = false;
        }
        return c30976d.m95286g(str, str2, z4);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C30975c(InterfaceC30973a.b.f127726a, null, null, null, false, false, null, 126, null), AbstractC13091v.m36590P(upstream, new a(null, this)), new d(null));
    }
}
