package jt2;

import c93.InterfaceC4351m;
import com.whoop.weeklyplan.api.WeeklyPlanApi;
import com.whoop.weeklyplan.customizeplan.domain.api.TargetGoalType;
import com.whoop.weeklyplan.hubandspoke.domain.api.ActivityGoal;
import com.whoop.weeklyplan.hubandspoke.domain.api.BehaviorGoal;
import com.whoop.weeklyplan.hubandspoke.domain.api.HubAndSpokeResponse;
import com.whoop.weeklyplan.hubandspoke.domain.api.HubAndSpokeResponseKotlinx;
import com.whoop.weeklyplan.hubandspoke.domain.api.HubAndSpokeResponseMapper;
import com.whoop.weeklyplan.hubandspoke.domain.api.PlanSelections;
import com.whoop.weeklyplan.hubandspoke.domain.api.SaveHubAndSpokeBody;
import com.whoop.weeklyplan.hubandspoke.domain.api.TargetGoal;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import live.hms.video.plugin.video.virtualbackground.HmsVirtualBackgroundInterfaceKt;
import ls2.AbstractC24716a;
import ls2.C24717b;
import m83.AbstractC25267u;
import od1.InterfaceC27844g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: jt2.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\u0013\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, m65681d2 = {"Ljt2/f;", "Lod1/g;", "Ljt2/l;", "Ljt2/p;", "Lcom/whoop/weeklyplan/api/WeeklyPlanApi;", "api", "Ltr2/n;", "logger", "Lls2/b;", "analyticsHelper", "", "category", "<init>", "(Lcom/whoop/weeklyplan/api/WeeklyPlanApi;Ltr2/n;Lls2/b;Ljava/lang/String;)V", "planName", "Lec3/l;", "k", "(Ljava/lang/String;)Lec3/l;", "Ljt2/l$g;", "domainAction", "l", "(Ljt2/l$g;)Lec3/l;", "Ljt2/l$b;", "j", "(Ljt2/l$b;)Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/weeklyplan/api/WeeklyPlanApi;", "b", "Ltr2/n;", "c", "Lls2/b;", "d", "Ljava/lang/String;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21944f implements InterfaceC27844g<AbstractC21950l, AbstractC21954p> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final WeeklyPlanApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C24717b analyticsHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String category;

    /* JADX INFO: renamed from: jt2.f$a */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.hubandspoke.domain.HubAndSpokeApiInteractor$cancelCurrentPlan$1", m100430f = "HubAndSpokeApiInteractor.kt", m100431l = {133, 134, 137}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Ljt2/p;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ AbstractC21950l.b f84755E;

        /* JADX INFO: renamed from: w */
        Object f84756w;

        /* JADX INFO: renamed from: x */
        int f84757x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f84758y;

        /* JADX INFO: renamed from: jt2.f$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.hubandspoke.domain.HubAndSpokeApiInteractor$cancelCurrentPlan$1$response$1", m100430f = "HubAndSpokeApiInteractor.kt", m100431l = {135}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C41859a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f84760w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C21944f f84761x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ AbstractC21950l.b f84762y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41859a(C21944f c21944f, AbstractC21950l.b bVar, InterfaceC30057d<? super C41859a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f84761x = c21944f;
                this.f84762y = bVar;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new C41859a(this.f84761x, this.f84762y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f84760w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                WeeklyPlanApi weeklyPlanApi = this.f84761x.api;
                String planId = this.f84762y.getPlanId();
                this.f84760w = 1;
                Object objCancelPlan = weeklyPlanApi.cancelPlan(planId, this);
                return objCancelPlan == enumC31071a ? enumC31071a : objCancelPlan;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
                return ((C41859a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC21950l.b bVar, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f84755E = bVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = C21944f.this.new a(this.f84755E, interfaceC30057d);
            aVar.f84758y = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0067  */
        /* JADX WARN: Code duplicated, block: B:21:0x006a  */
        /* JADX WARN: Code duplicated, block: B:23:0x006e  */
        /* JADX WARN: Code duplicated, block: B:29:0x0089  */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
        
            if (r8.emit(r0, r12) == r9) goto L26;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = r12.f84758y
                r8 = r0
                ec3.m r8 = (ec3.InterfaceC13062m) r8
                r83.a r9 = r83.EnumC31071a.f128113w
                int r0 = r12.f84757x
                r10 = 3
                r1 = 2
                r2 = 1
                r11 = 0
                if (r0 == 0) goto L2f
                if (r0 == r2) goto L2b
                if (r0 == r1) goto L26
                if (r0 != r10) goto L1e
                java.lang.Object r0 = r12.f84756w
                u02.a r0 = (u02.InterfaceC34385a) r0
                p505ts.AbstractC34132o.m107864I(r13)
                goto L86
            L1e:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L26:
                p505ts.AbstractC34132o.m107864I(r13)
                r0 = r13
                goto L61
            L2b:
                p505ts.AbstractC34132o.m107864I(r13)
                goto L3f
            L2f:
                p505ts.AbstractC34132o.m107864I(r13)
                jt2.p$c r0 = jt2.AbstractC21954p.c.f84870a
                r12.f84758y = r8
                r12.f84757x = r2
                java.lang.Object r0 = r8.emit(r0, r12)
                if (r0 != r9) goto L3f
                goto L85
            L3f:
                u02.a$a r0 = u02.InterfaceC34385a.INSTANCE
                jt2.f r2 = jt2.C21944f.this
                tr2.n r2 = jt2.C21944f.m62566h(r2)
                jt2.f$a$a r4 = new jt2.f$a$a
                jt2.f r3 = jt2.C21944f.this
                jt2.l$b r6 = r12.f84755E
                r4.<init>(r3, r6, r11)
                r12.f84758y = r8
                r12.f84757x = r1
                r1 = r2
                r2 = 0
                r3 = 0
                r6 = 6
                r7 = 0
                r5 = r12
                java.lang.Object r0 = u02.InterfaceC34385a.Companion.m108729b(r0, r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r9) goto L61
                goto L85
            L61:
                u02.a r0 = (u02.InterfaceC34385a) r0
                boolean r1 = r0 instanceof u02.InterfaceC34385a.c
                if (r1 == 0) goto L6a
                jt2.p$d r0 = jt2.AbstractC21954p.d.f84871a
                goto L79
            L6a:
                boolean r0 = r0 instanceof u02.InterfaceC34385a.b
                if (r0 == 0) goto L89
                jt2.p$b r0 = new jt2.p$b
                jt2.l$b r1 = r12.f84755E
                java.lang.String r1 = r1.getPlanId()
                r0.<init>(r1)
            L79:
                r12.f84758y = r11
                r12.f84756w = r11
                r12.f84757x = r10
                java.lang.Object r0 = r8.emit(r0, r12)
                if (r0 != r9) goto L86
            L85:
                return r9
            L86:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            L89:
                kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: jt2.C21944f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: jt2.f$b */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.hubandspoke.domain.HubAndSpokeApiInteractor$getApiFlow$1", m100430f = "HubAndSpokeApiInteractor.kt", m100431l = {57, 58, 61}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Ljt2/p;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f84763E;

        /* JADX INFO: renamed from: w */
        Object f84764w;

        /* JADX INFO: renamed from: x */
        int f84765x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f84766y;

        /* JADX INFO: renamed from: jt2.f$b$a */
        @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.hubandspoke.domain.HubAndSpokeApiInteractor$getApiFlow$1$response$1", m100430f = "HubAndSpokeApiInteractor.kt", m100431l = {59}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            Object f84768w;

            /* JADX INFO: renamed from: x */
            int f84769x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C21944f f84770y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ String f84771z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C21944f c21944f, String str, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f84770y = c21944f;
                this.f84771z = str;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f84770y, this.f84771z, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                HubAndSpokeResponseMapper hubAndSpokeResponseMapper;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f84769x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    HubAndSpokeResponseMapper hubAndSpokeResponseMapper2 = HubAndSpokeResponseMapper.INSTANCE;
                    WeeklyPlanApi weeklyPlanApi = this.f84770y.api;
                    String str = this.f84771z;
                    this.f84768w = hubAndSpokeResponseMapper2;
                    this.f84769x = 1;
                    Object hubAndSpokeKotlinx = weeklyPlanApi.getHubAndSpokeKotlinx(str, this);
                    if (hubAndSpokeKotlinx == enumC31071a) {
                        return enumC31071a;
                    }
                    hubAndSpokeResponseMapper = hubAndSpokeResponseMapper2;
                    obj = hubAndSpokeKotlinx;
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    hubAndSpokeResponseMapper = (HubAndSpokeResponseMapper) this.f84768w;
                    AbstractC34132o.m107864I(obj);
                }
                return hubAndSpokeResponseMapper.mapKotlinxToGson((HubAndSpokeResponseKotlinx) obj);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super HubAndSpokeResponse> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f84763E = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = C21944f.this.new b(this.f84763E, interfaceC30057d);
            bVar.f84766y = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0067  */
        /* JADX WARN: Code duplicated, block: B:21:0x0075  */
        /* JADX WARN: Code duplicated, block: B:23:0x0079  */
        /* JADX WARN: Code duplicated, block: B:29:0x008b  */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0085, code lost:
        
            if (r8.emit(r1, r12) == r9) goto L26;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = r12.f84766y
                r8 = r0
                ec3.m r8 = (ec3.InterfaceC13062m) r8
                r83.a r9 = r83.EnumC31071a.f128113w
                int r0 = r12.f84765x
                r10 = 3
                r1 = 2
                r2 = 1
                r11 = 0
                if (r0 == 0) goto L2f
                if (r0 == r2) goto L2b
                if (r0 == r1) goto L26
                if (r0 != r10) goto L1e
                java.lang.Object r0 = r12.f84764w
                u02.a r0 = (u02.InterfaceC34385a) r0
                p505ts.AbstractC34132o.m107864I(r13)
                goto L88
            L1e:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L26:
                p505ts.AbstractC34132o.m107864I(r13)
                r0 = r13
                goto L61
            L2b:
                p505ts.AbstractC34132o.m107864I(r13)
                goto L3f
            L2f:
                p505ts.AbstractC34132o.m107864I(r13)
                jt2.p$g r0 = jt2.AbstractC21954p.g.f84875a
                r12.f84766y = r8
                r12.f84765x = r2
                java.lang.Object r0 = r8.emit(r0, r12)
                if (r0 != r9) goto L3f
                goto L87
            L3f:
                u02.a$a r0 = u02.InterfaceC34385a.INSTANCE
                jt2.f r2 = jt2.C21944f.this
                tr2.n r2 = jt2.C21944f.m62566h(r2)
                jt2.f$b$a r4 = new jt2.f$b$a
                jt2.f r3 = jt2.C21944f.this
                java.lang.String r6 = r12.f84763E
                r4.<init>(r3, r6, r11)
                r12.f84766y = r8
                r12.f84765x = r1
                r1 = r2
                r2 = 0
                r3 = 0
                r6 = 6
                r7 = 0
                r5 = r12
                java.lang.Object r0 = u02.InterfaceC34385a.Companion.m108729b(r0, r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r9) goto L61
                goto L87
            L61:
                u02.a r0 = (u02.InterfaceC34385a) r0
                boolean r1 = r0 instanceof u02.InterfaceC34385a.c
                if (r1 == 0) goto L75
                jt2.p$s r1 = new jt2.p$s
                u02.a$c r0 = (u02.InterfaceC34385a.c) r0
                java.lang.Object r0 = r0.m108735a()
                com.whoop.weeklyplan.hubandspoke.domain.api.HubAndSpokeResponse r0 = (com.whoop.weeklyplan.hubandspoke.domain.api.HubAndSpokeResponse) r0
                r1.<init>(r0)
                goto L7b
            L75:
                boolean r0 = r0 instanceof u02.InterfaceC34385a.b
                if (r0 == 0) goto L8b
                jt2.p$f r1 = jt2.AbstractC21954p.f.f84874a
            L7b:
                r12.f84766y = r11
                r12.f84764w = r11
                r12.f84765x = r10
                java.lang.Object r0 = r8.emit(r1, r12)
                if (r0 != r9) goto L88
            L87:
                return r9
            L88:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            L8b:
                kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: jt2.C21944f.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: jt2.f$c */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.hubandspoke.domain.HubAndSpokeApiInteractor$interact$$inlined$flatMapLatest$1", m100430f = "HubAndSpokeApiInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f84772w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f84773x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f84774y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C21944f f84775z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC30057d interfaceC30057d, C21944f c21944f) {
            super(3, interfaceC30057d);
            this.f84775z = c21944f;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC21950l abstractC21950l, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            c cVar = new c(interfaceC30057d, this.f84775z);
            cVar.f84773x = interfaceC13062m;
            cVar.f84774y = abstractC21950l;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l interfaceC13058lM62568j;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f84772w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f84773x;
                AbstractC21950l abstractC21950l = (AbstractC21950l) this.f84774y;
                if (abstractC21950l instanceof AbstractC21950l.d) {
                    interfaceC13058lM62568j = this.f84775z.m62569k(((AbstractC21950l.d) abstractC21950l).getPlanName());
                } else if (abstractC21950l instanceof AbstractC21950l.g) {
                    AbstractC21950l.g gVar = (AbstractC21950l.g) abstractC21950l;
                    this.f84775z.analyticsHelper.m72377q(new AbstractC24716a.m(gVar.getPlanName(), this.f84775z.category));
                    interfaceC13058lM62568j = this.f84775z.m62570l(gVar);
                } else {
                    interfaceC13058lM62568j = abstractC21950l instanceof AbstractC21950l.b ? this.f84775z.m62568j((AbstractC21950l.b) abstractC21950l) : new C13084s1(new d(null));
                }
                this.f84773x = null;
                this.f84774y = null;
                this.f84772w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM62568j, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC21950l) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: jt2.f$d */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.hubandspoke.domain.HubAndSpokeApiInteractor$interact$1$1", m100430f = "HubAndSpokeApiInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Ljt2/p;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f84776w;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f84776w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC21954p.g gVar = AbstractC21954p.g.f84875a;
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: jt2.f$e */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.hubandspoke.domain.HubAndSpokeApiInteractor$save$1", m100430f = "HubAndSpokeApiInteractor.kt", m100431l = {HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE, 76, 119}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Ljt2/p;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ AbstractC21950l.g f84777E;

        /* JADX INFO: renamed from: w */
        Object f84778w;

        /* JADX INFO: renamed from: x */
        int f84779x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f84780y;

        /* JADX INFO: renamed from: jt2.f$e$a */
        @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.hubandspoke.domain.HubAndSpokeApiInteractor$save$1$response$1", m100430f = "HubAndSpokeApiInteractor.kt", m100431l = {77}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f84782w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C21944f f84783x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ AbstractC21950l.g f84784y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C21944f c21944f, AbstractC21950l.g gVar, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f84783x = c21944f;
                this.f84784y = gVar;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f84783x, this.f84784y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f84782w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                WeeklyPlanApi weeklyPlanApi = this.f84783x.api;
                String planId = this.f84784y.getPlanId();
                boolean migrateSmartAlarm = this.f84784y.getMigrateSmartAlarm();
                String planName = this.f84784y.getPlanName();
                boolean isCustomized = this.f84784y.getIsCustomized();
                List<C21956r> listM62616g = this.f84784y.m62616g();
                AbstractC21950l.g gVar = this.f84784y;
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM62616g, 10));
                Iterator it = listM62616g.iterator();
                while (it.hasNext()) {
                    C21956r c21956r = (C21956r) it.next();
                    Iterator it3 = it;
                    arrayList.add(new TargetGoal(c21956r.getSavedSliderValue(), c21956r.getTargetGoalType(), (c21956r.getTargetGoalType() == TargetGoalType.SLEEP_PERFORMANCE || c21956r.getTargetGoalType() == TargetGoalType.SLEEP_HOURS || c21956r.getTargetGoalType() == TargetGoalType.SLEEP_CONSISTENCY) ? gVar.getMigrateSmartAlarm() : false));
                    it = it3;
                }
                List<C21940b> listM62611b = this.f84784y.m62611b();
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM62611b, 10));
                for (C21940b c21940b : listM62611b) {
                    arrayList2.add(new BehaviorGoal(Integer.parseInt(c21940b.getId()), c21940b.getDaysPerWeek(), c21940b.getIsAvoid()));
                }
                List<C21939a> listM62610a = this.f84784y.m62610a();
                ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(listM62610a, 10));
                for (C21939a c21939a : listM62610a) {
                    arrayList3.add(new ActivityGoal(c21939a.getActivityType(), c21939a.getDaysPerWeek()));
                }
                SaveHubAndSpokeBody saveHubAndSpokeBody = new SaveHubAndSpokeBody(planName, isCustomized, new PlanSelections(arrayList, arrayList2, arrayList3), this.f84784y.getSource(), this.f84784y.getPresetPlanCategory(), this.f84784y.getTemplateId());
                this.f84782w = 1;
                Object objSaveHubAndSpoke = weeklyPlanApi.saveHubAndSpoke(planId, saveHubAndSpokeBody, migrateSmartAlarm, this);
                return objSaveHubAndSpoke == enumC31071a ? enumC31071a : objSaveHubAndSpoke;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AbstractC21950l.g gVar, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f84777E = gVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = C21944f.this.new e(this.f84777E, interfaceC30057d);
            eVar.f84780y = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0066  */
        /* JADX WARN: Code duplicated, block: B:21:0x0069  */
        /* JADX WARN: Code duplicated, block: B:23:0x006d  */
        /* JADX WARN: Code duplicated, block: B:29:0x007f  */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
        
            if (r8.emit(r0, r12) == r9) goto L26;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = r12.f84780y
                r8 = r0
                ec3.m r8 = (ec3.InterfaceC13062m) r8
                r83.a r9 = r83.EnumC31071a.f128113w
                int r0 = r12.f84779x
                r10 = 3
                r1 = 2
                r2 = 1
                r11 = 0
                if (r0 == 0) goto L2e
                if (r0 == r2) goto L2a
                if (r0 == r1) goto L25
                if (r0 != r10) goto L1d
                java.lang.Object r0 = r12.f84778w
                u02.a r0 = (u02.InterfaceC34385a) r0
                p505ts.AbstractC34132o.m107864I(r13)
                goto L7c
            L1d:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L25:
                p505ts.AbstractC34132o.m107864I(r13)
                r0 = r13
                goto L60
            L2a:
                p505ts.AbstractC34132o.m107864I(r13)
                goto L3e
            L2e:
                p505ts.AbstractC34132o.m107864I(r13)
                jt2.p$q r0 = jt2.AbstractC21954p.q.f84886a
                r12.f84780y = r8
                r12.f84779x = r2
                java.lang.Object r0 = r8.emit(r0, r12)
                if (r0 != r9) goto L3e
                goto L7b
            L3e:
                u02.a$a r0 = u02.InterfaceC34385a.INSTANCE
                jt2.f r2 = jt2.C21944f.this
                tr2.n r2 = jt2.C21944f.m62566h(r2)
                jt2.f$e$a r4 = new jt2.f$e$a
                jt2.f r3 = jt2.C21944f.this
                jt2.l$g r6 = r12.f84777E
                r4.<init>(r3, r6, r11)
                r12.f84780y = r8
                r12.f84779x = r1
                r1 = r2
                r2 = 0
                r3 = 0
                r6 = 6
                r7 = 0
                r5 = r12
                java.lang.Object r0 = u02.InterfaceC34385a.Companion.m108729b(r0, r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r9) goto L60
                goto L7b
            L60:
                u02.a r0 = (u02.InterfaceC34385a) r0
                boolean r1 = r0 instanceof u02.InterfaceC34385a.c
                if (r1 == 0) goto L69
                jt2.p$p r0 = jt2.AbstractC21954p.p.f84885a
                goto L6f
            L69:
                boolean r0 = r0 instanceof u02.InterfaceC34385a.b
                if (r0 == 0) goto L7f
                jt2.p$m r0 = jt2.AbstractC21954p.m.f84881a
            L6f:
                r12.f84780y = r11
                r12.f84778w = r11
                r12.f84779x = r10
                java.lang.Object r0 = r8.emit(r0, r12)
                if (r0 != r9) goto L7c
            L7b:
                return r9
            L7c:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            L7f:
                kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: jt2.C21944f.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C21944f(WeeklyPlanApi api, InterfaceC34116n logger, C24717b analyticsHelper, String str) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        this.api = api;
        this.logger = logger;
        this.analyticsHelper = analyticsHelper;
        this.category = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final InterfaceC13058l m62568j(AbstractC21950l.b domainAction) {
        return new C13084s1(new a(domainAction, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final InterfaceC13058l m62569k(String planName) {
        return new C13084s1(new b(planName, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final InterfaceC13058l m62570l(AbstractC21950l.g domainAction) {
        return new C13084s1(new e(domainAction, null));
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new c(null, this));
    }
}
