package tt2;

import bm.C3383g;
import c93.InterfaceC4351m;
import com.whoop.data.remote.domain.dto.CircularProgressStyle;
import com.whoop.data.remote.domain.response.journal.CurrentProgressPercentage;
import com.whoop.data.remote.domain.response.journal.CurrentProgressSteps;
import com.whoop.weeklyplan.api.WeeklyPlanApi;
import com.whoop.weeklyplan.weeklyplan.domain.models.NewSummary;
import com.whoop.weeklyplan.weeklyplan.domain.models.NewSummaryItem;
import com.whoop.weeklyplan.weeklyplan.domain.models.SummaryV2Model;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Collection;
import java.util.List;
import l83.C23454a0;
import ls2.AbstractC24716a;
import ls2.C24717b;
import m83.C25271y;
import od1.InterfaceC27844g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: tt2.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, m65681d2 = {"Ltt2/f;", "Lod1/g;", "Ltt2/d;", "Ltt2/e;", "Lcom/whoop/weeklyplan/api/WeeklyPlanApi;", "api", "Ltr2/n;", "logger", "Lls2/b;", "analyticsHelper", "<init>", "(Lcom/whoop/weeklyplan/api/WeeklyPlanApi;Ltr2/n;Lls2/b;)V", "", "planId", "Lec3/l;", "i", "(Ljava/lang/String;)Lec3/l;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;", "data", "Ll83/a0;", "j", "(Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;)V", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/weeklyplan/api/WeeklyPlanApi;", "b", "Ltr2/n;", "c", "Lls2/b;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34168f implements InterfaceC27844g<AbstractC34166d, AbstractC34167e> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final WeeklyPlanApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C24717b analyticsHelper;

    /* JADX INFO: renamed from: tt2.f$a */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.weeklyplan.domain.SummaryV2Interactor", m100430f = "SummaryV2Interactor.kt", m100431l = {55}, m100432m = "dismissSummary", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f143261w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f143262x;

        /* JADX INFO: renamed from: z */
        int f143264z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f143262x = obj;
            this.f143264z |= Integer.MIN_VALUE;
            return C34168f.this.m107974h(null, this);
        }
    }

    /* JADX INFO: renamed from: tt2.f$b */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.weeklyplan.domain.SummaryV2Interactor$dismissSummary$2", m100430f = "SummaryV2Interactor.kt", m100431l = {55}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f143265w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f143267y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f143267y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C34168f.this.new b(this.f143267y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f143265w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            WeeklyPlanApi weeklyPlanApi = C34168f.this.api;
            String str = this.f143267y;
            this.f143265w = 1;
            Object objDismissSummary = weeklyPlanApi.dismissSummary(str, this);
            return objDismissSummary == enumC31071a ? enumC31071a : objDismissSummary;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: tt2.f$c */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.weeklyplan.domain.SummaryV2Interactor$interact$$inlined$flatMapLatest$1", m100430f = "SummaryV2Interactor.kt", m100431l = {192, 189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        Object f143268E;

        /* JADX INFO: renamed from: F */
        Object f143269F;

        /* JADX INFO: renamed from: G */
        Object f143270G;

        /* JADX INFO: renamed from: H */
        int f143271H;

        /* JADX INFO: renamed from: w */
        int f143272w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f143273x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f143274y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C34168f f143275z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC30057d interfaceC30057d, C34168f c34168f) {
            super(3, interfaceC30057d);
            this.f143275z = c34168f;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC34166d abstractC34166d, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            c cVar = new c(interfaceC30057d, this.f143275z);
            cVar.f143273x = interfaceC13062m;
            cVar.f143274y = abstractC34166d;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0082, code lost:
        
            if (ec3.AbstractC13091v.m36613w(r1, (ec3.InterfaceC13058l) r8, r7) == r0) goto L20;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r7.f143272w
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L31
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                java.lang.Object r0 = r7.f143273x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                p505ts.AbstractC34132o.m107864I(r8)
                goto L85
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1d:
                java.lang.Object r1 = r7.f143270G
                tt2.d r1 = (tt2.AbstractC34166d) r1
                java.lang.Object r1 = r7.f143269F
                q83.d r1 = (q83.InterfaceC30057d) r1
                java.lang.Object r1 = r7.f143268E
                ec3.m r1 = (ec3.InterfaceC13062m) r1
                java.lang.Object r3 = r7.f143273x
                ec3.m r3 = (ec3.InterfaceC13062m) r3
                p505ts.AbstractC34132o.m107864I(r8)
                goto L70
            L31:
                p505ts.AbstractC34132o.m107864I(r8)
                java.lang.Object r8 = r7.f143273x
                r1 = r8
                ec3.m r1 = (ec3.InterfaceC13062m) r1
                java.lang.Object r8 = r7.f143274y
                tt2.d r8 = (tt2.AbstractC34166d) r8
                boolean r5 = r8 instanceof tt2.AbstractC34166d.b
                if (r5 == 0) goto L4e
                tt2.f r3 = r7.f143275z
                tt2.d$b r8 = (tt2.AbstractC34166d.b) r8
                java.lang.String r8 = r8.getPlanId()
                ec3.l r8 = tt2.C34168f.m107972f(r3, r8)
                goto L70
            L4e:
                boolean r5 = r8 instanceof tt2.AbstractC34166d.a
                if (r5 == 0) goto L88
                tt2.f r5 = r7.f143275z
                tt2.d$a r8 = (tt2.AbstractC34166d.a) r8
                java.lang.String r8 = r8.getPlanId()
                r7.f143273x = r4
                r7.f143274y = r4
                r7.f143268E = r1
                r7.f143269F = r4
                r7.f143270G = r4
                r6 = 0
                r7.f143271H = r6
                r7.f143272w = r3
                java.lang.Object r8 = tt2.C34168f.m107969c(r5, r8, r7)
                if (r8 != r0) goto L70
                goto L84
            L70:
                ec3.l r8 = (ec3.InterfaceC13058l) r8
                r7.f143273x = r4
                r7.f143274y = r4
                r7.f143268E = r4
                r7.f143269F = r4
                r7.f143270G = r4
                r7.f143272w = r2
                java.lang.Object r8 = ec3.AbstractC13091v.m36613w(r1, r8, r7)
                if (r8 != r0) goto L85
            L84:
                return r0
            L85:
                l83.a0 r8 = l83.C23454a0.f92919a
                return r8
            L88:
                kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: tt2.C34168f.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (AbstractC34166d) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: tt2.f$d */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.weeklyplan.domain.SummaryV2Interactor$loadData$1", m100430f = "SummaryV2Interactor.kt", m100431l = {34, 36, 40, 49}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Ltt2/e;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f143276E;

        /* JADX INFO: renamed from: w */
        Object f143277w;

        /* JADX INFO: renamed from: x */
        int f143278x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f143279y;

        /* JADX INFO: renamed from: tt2.f$d$a */
        @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.weeklyplan.domain.SummaryV2Interactor$loadData$1$response$1", m100430f = "SummaryV2Interactor.kt", m100431l = {36}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f143281w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C34168f f143282x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f143283y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C34168f c34168f, String str, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f143282x = c34168f;
                this.f143283y = str;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f143282x, this.f143283y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f143281w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                WeeklyPlanApi weeklyPlanApi = this.f143282x.api;
                String str = this.f143283y;
                this.f143281w = 1;
                Object summary = weeklyPlanApi.getSummary(str, this);
                return summary == enumC31071a ? enumC31071a : summary;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super SummaryV2Model> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f143276E = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = C34168f.this.new d(this.f143276E, interfaceC30057d);
            dVar.f143279y = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x006c  */
        /* JADX WARN: Code duplicated, block: B:24:0x008d  */
        /* JADX WARN: Code duplicated, block: B:25:0x0092  */
        /* JADX WARN: Code duplicated, block: B:29:0x00a3  */
        /* JADX WARN: Code duplicated, block: B:31:0x00a7  */
        /* JADX WARN: Code duplicated, block: B:36:0x00be  */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00a0, code lost:
        
            if (r8.emit(r1, r13) == r9) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00b8, code lost:
        
            if (r8.emit(r0, r13) == r9) goto L33;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = r13.f143279y
                r8 = r0
                ec3.m r8 = (ec3.InterfaceC13062m) r8
                r83.a r9 = r83.EnumC31071a.f128113w
                int r0 = r13.f143278x
                r10 = 4
                r11 = 3
                r1 = 2
                r2 = 1
                r12 = 0
                if (r0 == 0) goto L33
                if (r0 == r2) goto L2f
                if (r0 == r1) goto L2a
                if (r0 == r11) goto L21
                if (r0 != r10) goto L19
                goto L21
            L19:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L21:
                java.lang.Object r0 = r13.f143277w
                u02.a r0 = (u02.InterfaceC34385a) r0
                p505ts.AbstractC34132o.m107864I(r14)
                goto Lbb
            L2a:
                p505ts.AbstractC34132o.m107864I(r14)
                r0 = r14
                goto L66
            L2f:
                p505ts.AbstractC34132o.m107864I(r14)
                goto L44
            L33:
                p505ts.AbstractC34132o.m107864I(r14)
                tt2.e$b r0 = tt2.AbstractC34167e.b.f143255a
                r13.f143279y = r8
                r13.f143278x = r2
                java.lang.Object r0 = r8.emit(r0, r13)
                if (r0 != r9) goto L44
                goto Lba
            L44:
                u02.a$a r0 = u02.InterfaceC34385a.INSTANCE
                tt2.f r2 = tt2.C34168f.this
                tr2.n r2 = tt2.C34168f.m107971e(r2)
                tt2.f$d$a r4 = new tt2.f$d$a
                tt2.f r3 = tt2.C34168f.this
                java.lang.String r6 = r13.f143276E
                r4.<init>(r3, r6, r12)
                r13.f143279y = r8
                r13.f143278x = r1
                r1 = r2
                r2 = 0
                r3 = 0
                r6 = 6
                r7 = 0
                r5 = r13
                java.lang.Object r0 = u02.InterfaceC34385a.Companion.m108729b(r0, r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r9) goto L66
                goto Lba
            L66:
                u02.a r0 = (u02.InterfaceC34385a) r0
                boolean r1 = r0 instanceof u02.InterfaceC34385a.c
                if (r1 == 0) goto La3
                tt2.f r1 = tt2.C34168f.this
                u02.a$c r0 = (u02.InterfaceC34385a.c) r0
                java.lang.Object r2 = r0.m108735a()
                com.whoop.weeklyplan.weeklyplan.domain.models.SummaryV2Model r2 = (com.whoop.weeklyplan.weeklyplan.domain.models.SummaryV2Model) r2
                tt2.C34168f.m107973g(r1, r2)
                tt2.e$c r1 = new tt2.e$c
                java.lang.Object r2 = r0.m108735a()
                com.whoop.weeklyplan.weeklyplan.domain.models.SummaryV2Model r2 = (com.whoop.weeklyplan.weeklyplan.domain.models.SummaryV2Model) r2
                java.lang.Object r0 = r0.m108735a()
                com.whoop.weeklyplan.weeklyplan.domain.models.SummaryV2Model r0 = (com.whoop.weeklyplan.weeklyplan.domain.models.SummaryV2Model) r0
                com.whoop.weeklyplan.weeklyplan.domain.models.MetaData r0 = r0.getMetadata()
                if (r0 == 0) goto L92
                com.whoop.coacheverywherecommon.models.AiContextMetadata r0 = r0.getAiContextMetadata()
                goto L93
            L92:
                r0 = r12
            L93:
                r1.<init>(r2, r0)
                r13.f143279y = r12
                r13.f143277w = r12
                r13.f143278x = r11
                java.lang.Object r0 = r8.emit(r1, r13)
                if (r0 != r9) goto Lbb
                goto Lba
            La3:
                boolean r0 = r0 instanceof u02.InterfaceC34385a.b
                if (r0 == 0) goto Lbe
                tt2.e$a r0 = new tt2.e$a
                java.lang.String r1 = r13.f143276E
                r0.<init>(r1)
                r13.f143279y = r12
                r13.f143277w = r12
                r13.f143278x = r10
                java.lang.Object r0 = r8.emit(r0, r13)
                if (r0 != r9) goto Lbb
            Lba:
                return r9
            Lbb:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            Lbe:
                kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: tt2.C34168f.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C34168f(WeeklyPlanApi api, InterfaceC34116n logger, C24717b analyticsHelper) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        this.api = api;
        this.logger = logger;
        this.analyticsHelper = analyticsHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: h */
    public final Object m107974h(String str, InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f143264z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f143264z = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object obj = aVar2.f143262x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f143264z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(str, null);
            aVar2.f143261w = null;
            aVar2.f143264z = 1;
            if (InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, bVar, aVar2, 6, null) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        return new C3383g(new AbstractC34167e[0], 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final InterfaceC13058l m107975i(String planId) {
        return new C13084s1(new d(planId, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final void m107976j(SummaryV2Model data) {
        NewSummary summaryV2 = data.getSummaryV2();
        List<NewSummaryItem> items = summaryV2 != null ? summaryV2.getItems() : null;
        if (items == null) {
            items = C25271y.f99162w;
        }
        List<NewSummaryItem> list = items;
        int i13 = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (NewSummaryItem newSummaryItem : list) {
                CurrentProgressSteps currentProgressSteps = newSummaryItem.getCircularProgressIndicator().getCurrentProgressSteps();
                CircularProgressStyle style = currentProgressSteps != null ? currentProgressSteps.getStyle() : null;
                CircularProgressStyle circularProgressStyle = CircularProgressStyle.WEEKLY_PLAN_COMPLETE;
                if (style != circularProgressStyle) {
                    CurrentProgressPercentage currentProgressPercentage = newSummaryItem.getCircularProgressIndicator().getCurrentProgressPercentage();
                    if ((currentProgressPercentage != null ? currentProgressPercentage.getStyle() : null) != circularProgressStyle) {
                        continue;
                    }
                }
                i13++;
                if (i13 < 0) {
                    AbstractC37056f.m118976c0();
                    throw null;
                }
            }
        }
        NewSummary summaryV3 = data.getSummaryV2();
        this.analyticsHelper.m72377q(new AbstractC24716a.r(i13, (summaryV3 != null ? summaryV3.getChallengeProgressBar() : null) != null ? "jan_jump_recap" : null));
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new c(null, this));
    }
}
