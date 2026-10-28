package qw1;

import androidx.core.app.NotificationCompat;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.membership.extensions.domain.models.ProgressContent;
import com.whoop.membership.familyPlan.domain.api.FamilyPlanApi;
import com.whoop.membership.familyPlan.domain.model.InviteFamilyMemberResponse;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import java.util.Map;
import java.util.regex.Pattern;
import l83.C23454a0;
import od1.InterfaceC27844g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: qw1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, m65681d2 = {"Lqw1/d;", "Lod1/g;", "Lqw1/b;", "Lqw1/c;", "Lcom/whoop/membership/familyPlan/domain/api/FamilyPlanApi;", "familyPlanApi", "Lqw1/f;", "processInviteErrorParser", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/membership/familyPlan/domain/api/FamilyPlanApi;Lqw1/f;Ltr2/n;)V", "previousResult", "action", "j", "(Lqw1/c;Lqw1/b;)Lqw1/c;", "", "isNewMember", "Lec3/l;", "k", "(Z)Lec3/l;", "", NotificationCompat.CATEGORY_EMAIL, "Lqw1/e;", "l", "(Ljava/lang/String;)Lec3/l;", "m", "(Ljava/lang/String;)Z", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/membership/familyPlan/domain/api/FamilyPlanApi;", "b", "Lqw1/f;", "c", "Ltr2/n;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30690d implements InterfaceC27844g<InterfaceC30688b, C30689c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FamilyPlanApi familyPlanApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C30692f processInviteErrorParser;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: qw1.d$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.familyPlan.domain.interactor.inviteMember.InviteFamilyMemberInteractor$interact$$inlined$flatMapLatest$1", m100430f = "InviteFamilyMemberInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f126268w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f126269x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f126270y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C30690d f126271z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, C30690d c30690d) {
            super(3, interfaceC30057d);
            this.f126271z = c30690d;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30688b interfaceC30688b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f126271z);
            aVar.f126269x = interfaceC13062m;
            aVar.f126270y = interfaceC30688b;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l interfaceC13058lM36590P;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f126268w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f126269x;
                InterfaceC30688b interfaceC30688b = (InterfaceC30688b) this.f126270y;
                if (interfaceC30688b instanceof InterfaceC30688b.c) {
                    interfaceC13058lM36590P = AbstractC13091v.m36590P(this.f126271z.m94306k(((InterfaceC30688b.c) interfaceC30688b).getIsNewMember()), new f(null));
                } else {
                    interfaceC13058lM36590P = interfaceC30688b instanceof InterfaceC30688b.d ? AbstractC13091v.m36590P(this.f126271z.m94307l(((InterfaceC30688b.d) interfaceC30688b).getEmailText()), new g(null)) : new C13084s1(new d(interfaceC30688b, null));
                }
                this.f126269x = null;
                this.f126270y = null;
                this.f126268w = 1;
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
            return invoke((InterfaceC13062m) obj, (InterfaceC30688b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: qw1.d$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.familyPlan.domain.interactor.inviteMember.InviteFamilyMemberInteractor$interact$1$1$1", m100430f = "InviteFamilyMemberInteractor.kt", m100431l = {32}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lqw1/e$a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f126272w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f126273x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C30689c f126274y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C30689c c30689c, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f126274y = c30689c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(this.f126274y, interfaceC30057d);
            bVar.f126273x = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f126273x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f126272w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC30691e.a aVar = new AbstractC30691e.a(this.f126274y);
                this.f126273x = null;
                this.f126272w = 1;
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

    /* JADX INFO: renamed from: qw1.d$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.familyPlan.domain.interactor.inviteMember.InviteFamilyMemberInteractor$interact$1$2$1", m100430f = "InviteFamilyMemberInteractor.kt", m100431l = {36}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lqw1/e;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f126275w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f126276x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC30691e f126277y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC30691e abstractC30691e, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f126277y = abstractC30691e;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(this.f126277y, interfaceC30057d);
            cVar.f126276x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f126276x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f126275w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC30691e abstractC30691e = this.f126277y;
                this.f126276x = null;
                this.f126275w = 1;
                if (interfaceC13062m.emit(abstractC30691e, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: qw1.d$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.familyPlan.domain.interactor.inviteMember.InviteFamilyMemberInteractor$interact$1$3", m100430f = "InviteFamilyMemberInteractor.kt", m100431l = {38}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lqw1/e$b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f126278w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f126279x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC30688b f126280y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC30688b interfaceC30688b, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f126280y = interfaceC30688b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = new d(this.f126280y, interfaceC30057d);
            dVar.f126279x = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f126279x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f126278w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC30691e.b bVar = new AbstractC30691e.b(this.f126280y);
                this.f126279x = null;
                this.f126278w = 1;
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

    /* JADX INFO: renamed from: qw1.d$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.familyPlan.domain.interactor.inviteMember.InviteFamilyMemberInteractor$interact$2", m100430f = "InviteFamilyMemberInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lqw1/c;", "previousResult", "Lqw1/e;", "action", "<anonymous>", "(Lqw1/c;Lqw1/e;)Lqw1/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f126281w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f126282x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f126283y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C30689c c30689c, AbstractC30691e abstractC30691e, InterfaceC30057d<? super C30689c> interfaceC30057d) {
            e eVar = C30690d.this.new e(interfaceC30057d);
            eVar.f126282x = c30689c;
            eVar.f126283y = abstractC30691e;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C30689c c30689c = (C30689c) this.f126282x;
            AbstractC30691e abstractC30691e = (AbstractC30691e) this.f126283y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f126281w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (abstractC30691e instanceof AbstractC30691e.a) {
                return ((AbstractC30691e.a) abstractC30691e).getDomainResult();
            }
            if (!(abstractC30691e instanceof AbstractC30691e.c)) {
                if (abstractC30691e instanceof AbstractC30691e.b) {
                    return C30690d.this.m94305j(c30689c, ((AbstractC30691e.b) abstractC30691e).getDomainAction());
                }
                throw new NoWhenBranchMatchedException();
            }
            AbstractC30691e.c cVar = (AbstractC30691e.c) abstractC30691e;
            if (cVar instanceof AbstractC30691e.e) {
                return C30689c.m94291b(c30689c, InterfaceC30687a.c.f126253a, null, null, false, null, 30, null);
            }
            if (cVar instanceof AbstractC30691e.f) {
                return C30689c.m94291b(c30689c, new InterfaceC30687a.b(((AbstractC30691e.f) abstractC30691e).getProgressContent()), null, null, false, null, 30, null);
            }
            if (cVar instanceof AbstractC30691e.d) {
                return C30689c.m94291b(c30689c, null, null, null, false, ((AbstractC30691e.d) abstractC30691e).getErrorMessage(), 14, null);
            }
            if (cVar instanceof AbstractC30691e.g) {
                return C30689c.m94291b(c30689c, InterfaceC30687a.d.f126254a, null, null, false, null, 30, null);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: qw1.d$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.familyPlan.domain.interactor.inviteMember.InviteFamilyMemberInteractor$interact$lambda$0$$inlined$flatMapLatest$1", m100430f = "InviteFamilyMemberInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f126285w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f126286x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f126287y;

        public f(InterfaceC30057d interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C30689c c30689c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            f fVar = new f(interfaceC30057d);
            fVar.f126286x = interfaceC13062m;
            fVar.f126287y = c30689c;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f126285w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f126286x;
                C13084s1 c13084s1 = new C13084s1(new b((C30689c) this.f126287y, null));
                this.f126286x = null;
                this.f126287y = null;
                this.f126285w = 1;
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
            return invoke((InterfaceC13062m) obj, (C30689c) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: qw1.d$g */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.familyPlan.domain.interactor.inviteMember.InviteFamilyMemberInteractor$interact$lambda$0$$inlined$flatMapLatest$2", m100430f = "InviteFamilyMemberInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f126288w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f126289x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f126290y;

        public g(InterfaceC30057d interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC30691e abstractC30691e, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            g gVar = new g(interfaceC30057d);
            gVar.f126289x = interfaceC13062m;
            gVar.f126290y = abstractC30691e;
            return gVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f126288w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f126289x;
                C13084s1 c13084s1 = new C13084s1(new c((AbstractC30691e) this.f126290y, null));
                this.f126289x = null;
                this.f126290y = null;
                this.f126288w = 1;
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
            return invoke((InterfaceC13062m) obj, (AbstractC30691e) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: qw1.d$h */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.familyPlan.domain.interactor.inviteMember.InviteFamilyMemberInteractor$loadInviteScreen$1", m100430f = "InviteFamilyMemberInteractor.kt", m100431l = {71, 72, 76, 77, 78}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lqw1/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ boolean f126291E;

        /* JADX INFO: renamed from: w */
        Object f126292w;

        /* JADX INFO: renamed from: x */
        int f126293x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f126294y;

        /* JADX INFO: renamed from: qw1.d$h$a */
        @InterfaceC32271e(m100429c = "com.whoop.membership.familyPlan.domain.interactor.inviteMember.InviteFamilyMemberInteractor$loadInviteScreen$1$response$1", m100430f = "InviteFamilyMemberInteractor.kt", m100431l = {73}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/membership/familyPlan/domain/model/InviteFamilyMemberResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f126296w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C30690d f126297x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ boolean f126298y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C30690d c30690d, boolean z4, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f126297x = c30690d;
                this.f126298y = z4;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f126297x, this.f126298y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f126296w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                FamilyPlanApi familyPlanApi = this.f126297x.familyPlanApi;
                boolean z4 = this.f126298y;
                this.f126296w = 1;
                Object objFamilyPlanInvite = familyPlanApi.familyPlanInvite(z4, this);
                return objFamilyPlanInvite == enumC31071a ? enumC31071a : objFamilyPlanInvite;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super InviteFamilyMemberResponse> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(boolean z4, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f126291E = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            h hVar = C30690d.this.new h(this.f126291E, interfaceC30057d);
            hVar.f126294y = obj;
            return hVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0083  */
        /* JADX WARN: Code duplicated, block: B:26:0x00ac  */
        /* JADX WARN: Code duplicated, block: B:28:0x00b0  */
        /* JADX WARN: Code duplicated, block: B:31:0x00d2  */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00a9, code lost:
        
            if (r8.emit(r14, r22) == r9) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00cf, code lost:
        
            if (r8.emit(r14, r22) == r9) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00f1, code lost:
        
            if (r8.emit(r14, r22) == r9) goto L33;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instruction units count: 247
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: qw1.C30690d.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: qw1.d$i */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.familyPlan.domain.interactor.inviteMember.InviteFamilyMemberInteractor$submitEmailInvite$1", m100430f = "InviteFamilyMemberInteractor.kt", m100431l = {84, 88, 90, 94, 97, 102, 105}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lqw1/e;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        private /* synthetic */ Object f126299E;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ String f126301G;

        /* JADX INFO: renamed from: w */
        Object f126302w;

        /* JADX INFO: renamed from: x */
        Object f126303x;

        /* JADX INFO: renamed from: y */
        Object f126304y;

        /* JADX INFO: renamed from: z */
        int f126305z;

        /* JADX INFO: renamed from: qw1.d$i$a */
        @InterfaceC32271e(m100429c = "com.whoop.membership.familyPlan.domain.interactor.inviteMember.InviteFamilyMemberInteractor$submitEmailInvite$1$response$1", m100430f = "InviteFamilyMemberInteractor.kt", m100431l = {91}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/membership/extensions/domain/models/ProgressContent;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f126306w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C30690d f126307x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f126308y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C30690d c30690d, String str, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f126307x = c30690d;
                this.f126308y = str;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f126307x, this.f126308y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f126306w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                FamilyPlanApi familyPlanApi = this.f126307x.familyPlanApi;
                Map<String, String> mapM95645u = AbstractC31061c.m95645u(NotificationCompat.CATEGORY_EMAIL, this.f126308y);
                this.f126306w = 1;
                Object objFamilyPlanInvitationMobile = familyPlanApi.familyPlanInvitationMobile(mapM95645u, this);
                return objFamilyPlanInvitationMobile == enumC31071a ? enumC31071a : objFamilyPlanInvitationMobile;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super ProgressContent> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, InterfaceC30057d<? super i> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f126301G = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            i iVar = C30690d.this.new i(this.f126301G, interfaceC30057d);
            iVar.f126299E = obj;
            return iVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((i) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:26:0x009c A[PHI: r10 r14
          0x009c: PHI (r10v3 qw1.d$i) = (r10v2 qw1.d$i), (r10v4 qw1.d$i) binds: [B:24:0x0098, B:10:0x0035] A[DONT_GENERATE, DONT_INLINE]
          0x009c: PHI (r14v11 java.lang.Object) = (r14v10 java.lang.Object), (r14v0 java.lang.Object) binds: [B:24:0x0098, B:10:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:28:0x00a3  */
        /* JADX WARN: Code duplicated, block: B:31:0x00bf  */
        /* JADX WARN: Code duplicated, block: B:33:0x00c3  */
        /* JADX WARN: Code duplicated, block: B:35:0x00ce  */
        /* JADX WARN: Code duplicated, block: B:39:0x00e7  */
        /* JADX WARN: Code duplicated, block: B:41:0x00eb  */
        /* JADX WARN: Code duplicated, block: B:46:0x00fa  */
        /* JADX WARN: Code duplicated, block: B:49:0x0109  */
        /* JADX WARN: Code duplicated, block: B:51:0x010f  */
        /* JADX WARN: Code duplicated, block: B:55:0x012e  */
        /* JADX WARN: Code duplicated, block: B:57:0x0132  */
        /* JADX WARN: Code duplicated, block: B:59:0x0141 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:60:0x0142 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:61:0x0143  */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00e1, code lost:
        
            if (r14 == r1) goto L59;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 350
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: qw1.C30690d.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C30690d(FamilyPlanApi familyPlanApi, C30692f processInviteErrorParser, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(familyPlanApi, "familyPlanApi");
        AbstractC22676k.m65750j(processInviteErrorParser, "processInviteErrorParser");
        AbstractC22676k.m65750j(logger, "logger");
        this.familyPlanApi = familyPlanApi;
        this.processInviteErrorParser = processInviteErrorParser;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final C30689c m94305j(C30689c previousResult, InterfaceC30688b action) {
        if (action instanceof InterfaceC30688b.b) {
            return C30689c.m94291b(previousResult, null, null, ((InterfaceC30688b.b) action).getEmailText(), false, AbstractC8693b.m21267a(), 11, null);
        }
        return action instanceof InterfaceC30688b.a ? C30689c.m94291b(previousResult, null, null, "", false, AbstractC8693b.m21267a(), 10, null) : previousResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final InterfaceC13058l m94306k(boolean isNewMember) {
        return new C13084s1(new h(isNewMember, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final InterfaceC13058l m94307l(String email) {
        return new C13084s1(new i(email, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final boolean m94308m(String email) {
        if (email.length() >= 256) {
            return false;
        }
        Pattern patternCompile = Pattern.compile("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");
        AbstractC22676k.m65749i(patternCompile, "compile(...)");
        return patternCompile.matcher(email).matches();
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C30689c(InterfaceC30687a.c.f126253a, null, null, false, null, 30, null), AbstractC13091v.m36590P(upstream, new a(null, this)), new e(null));
    }

    public /* synthetic */ C30690d(FamilyPlanApi familyPlanApi, C30692f c30692f, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(familyPlanApi, c30692f, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("InviteFamilyMemberInteractor") : interfaceC34116n);
    }
}
