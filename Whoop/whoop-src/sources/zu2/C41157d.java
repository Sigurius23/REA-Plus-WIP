package zu2;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.weightlifting.data.WeightliftingApi;
import com.whoop.weightlifting.data.domain.WorkoutTemplate;
import com.whoop.weightlifting.data.dto.WorkoutTemplateDto;
import fi0.InterfaceC14515a;
import fu2.C14794i;
import fu2.InterfaceC14792g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.time.Clock;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import l83.C23454a0;
import or2.AbstractC28190p0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import rr2.InterfaceC31766c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: zu2.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u0010*\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u0010*\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0014\u0010\u0018\u001a\u00020\u0010*\u00020\u0010H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J\u001c\u0010\u001c\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u0010*\u00020\u0010H\u0002¢\u0006\u0004\b\u001e\u0010\u0016J \u0010\"\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 H\u0086@¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010,R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010-R\u001c\u00101\u001a\n /*\u0004\u0018\u00010.0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00100¨\u00062"}, m65681d2 = {"Lzu2/d;", "", "Lfu2/i;", "strengthTrainerInteractor", "Lcom/whoop/weightlifting/data/WeightliftingApi;", "weightliftingApi", "Ltr2/n;", "logger", "Lrr2/c;", "crashReporter", "Lfi0/a;", "baseAnalytics", "Ljava/time/Clock;", "clock", "<init>", "(Lfu2/i;Lcom/whoop/weightlifting/data/WeightliftingApi;Ltr2/n;Lrr2/c;Lfi0/a;Ljava/time/Clock;)V", "Lzu2/c;", "", "newName", "i", "(Lzu2/c;Ljava/lang/String;)Lzu2/c;", "g", "(Lzu2/c;)Lzu2/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "j", "(Lzu2/c;Lq83/d;)Ljava/lang/Object;", "", "templateId", "f", "(Lzu2/c;JLq83/d;)Ljava/lang/Object;", "e", "currentState", "Lzu2/b;", "action", "k", "(Lzu2/c;Lzu2/b;Lq83/d;)Ljava/lang/Object;", "a", "Lfu2/i;", "b", "Lcom/whoop/weightlifting/data/WeightliftingApi;", "c", "Ltr2/n;", "d", "Lrr2/c;", "Lfi0/a;", "Ljava/time/Clock;", "Ljava/time/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "Ljava/time/format/DateTimeFormatter;", "dateFormatter", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C41157d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C14794i strengthTrainerInteractor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final WeightliftingApi weightliftingApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC31766c crashReporter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC14515a baseAnalytics;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final DateTimeFormatter dateFormatter;

    /* JADX INFO: renamed from: zu2.d$a */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.name.domain.InputWorkoutNameInteractor$fetchWorkoutTemplateAndUpdate$2", m100430f = "InputWorkoutNameInteractor.kt", m100431l = {78}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lzu2/c;", "<anonymous>", "(Lbc3/c0;)Lzu2/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f177554w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ long f177556y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C41156c f177557z;

        /* JADX INFO: renamed from: zu2.d$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.name.domain.InputWorkoutNameInteractor$fetchWorkoutTemplateAndUpdate$2$1", m100430f = "InputWorkoutNameInteractor.kt", m100431l = {79, 81}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lzu2/c;", "<anonymous>", "(Lbc3/c0;)Lzu2/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C42777a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f177558w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C41157d f177559x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ long f177560y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ C41156c f177561z;

            /* JADX INFO: renamed from: zu2.d$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.name.domain.InputWorkoutNameInteractor$fetchWorkoutTemplateAndUpdate$2$1$response$1", m100430f = "InputWorkoutNameInteractor.kt", m100431l = {80}, m100432m = "invokeSuspend", m100433v = 2)
            @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42778a extends AbstractC32275i implements Function1 {

                /* JADX INFO: renamed from: w */
                int f177562w;

                /* JADX INFO: renamed from: x */
                final /* synthetic */ C41157d f177563x;

                /* JADX INFO: renamed from: y */
                final /* synthetic */ long f177564y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C42778a(C41157d c41157d, long j7, InterfaceC30057d<? super C42778a> interfaceC30057d) {
                    super(1, interfaceC30057d);
                    this.f177563x = c41157d;
                    this.f177564y = j7;
                }

                @Override // s83.AbstractC32267a
                public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                    return new C42778a(this.f177563x, this.f177564y, interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i13 = this.f177562w;
                    if (i13 != 0) {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                        return obj;
                    }
                    AbstractC34132o.m107864I(obj);
                    WeightliftingApi weightliftingApi = this.f177563x.weightliftingApi;
                    long j7 = this.f177564y;
                    this.f177562w = 1;
                    Object workoutTemplate = weightliftingApi.getWorkoutTemplate(j7, this);
                    return workoutTemplate == enumC31071a ? enumC31071a : workoutTemplate;
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(InterfaceC30057d<? super WorkoutTemplateDto> interfaceC30057d) {
                    return ((C42778a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                }
            }

            /* JADX INFO: renamed from: zu2.d$a$a$b */
            @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.name.domain.InputWorkoutNameInteractor$fetchWorkoutTemplateAndUpdate$2$1$response$2", m100430f = "InputWorkoutNameInteractor.kt", m100431l = {82}, m100432m = "invokeSuspend", m100433v = 2)
            @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;", "fullTemplate", "Lpg3/v0;", "Ll83/a0;", "<anonymous>", "(Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;)Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
            public static final class b extends AbstractC32275i implements InterfaceC4351m {

                /* JADX INFO: renamed from: w */
                int f177565w;

                /* JADX INFO: renamed from: x */
                /* synthetic */ Object f177566x;

                /* JADX INFO: renamed from: y */
                final /* synthetic */ C41157d f177567y;

                /* JADX INFO: renamed from: z */
                final /* synthetic */ long f177568z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(C41157d c41157d, long j7, InterfaceC30057d<? super b> interfaceC30057d) {
                    super(2, interfaceC30057d);
                    this.f177567y = c41157d;
                    this.f177568z = j7;
                }

                @Override // s83.AbstractC32267a
                public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                    b bVar = new b(this.f177567y, this.f177568z, interfaceC30057d);
                    bVar.f177566x = obj;
                    return bVar;
                }

                @Override // c93.InterfaceC4351m
                /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
                public final Object invoke(WorkoutTemplateDto workoutTemplateDto, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
                    return ((b) create(workoutTemplateDto, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    WorkoutTemplateDto workoutTemplateDto = (WorkoutTemplateDto) this.f177566x;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i13 = this.f177565w;
                    if (i13 != 0) {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                        return obj;
                    }
                    AbstractC34132o.m107864I(obj);
                    WeightliftingApi weightliftingApi = this.f177567y.weightliftingApi;
                    long j7 = this.f177568z;
                    WorkoutTemplateDto workoutTemplateDtoCopy$default = WorkoutTemplateDto.copy$default(workoutTemplateDto, null, null, this.f177567y.strengthTrainerInteractor.m42545h().getName(), null, null, 27, null);
                    this.f177566x = null;
                    this.f177565w = 1;
                    Object objUpdateWorkoutTemplate = weightliftingApi.updateWorkoutTemplate(j7, workoutTemplateDtoCopy$default, this);
                    return objUpdateWorkoutTemplate == enumC31071a ? enumC31071a : objUpdateWorkoutTemplate;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42777a(C41157d c41157d, long j7, C41156c c41156c, InterfaceC30057d<? super C42777a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f177559x = c41157d;
                this.f177560y = j7;
                this.f177561z = c41156c;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new C42777a(this.f177559x, this.f177560y, this.f177561z, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C41156c> interfaceC30057d) {
                return ((C42777a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0072, code lost:
            
                if (r13 == r0) goto L15;
             */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Exception {
                /*
                    r12 = this;
                    r83.a r0 = r83.EnumC31071a.f128113w
                    int r1 = r12.f177558w
                    r2 = 0
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L1f
                    if (r1 == r4) goto L1a
                    if (r1 != r3) goto L12
                    p505ts.AbstractC34132o.m107864I(r13)
                    r9 = r12
                    goto L75
                L12:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r0)
                    throw r13
                L1a:
                    p505ts.AbstractC34132o.m107864I(r13)
                    r9 = r12
                    goto L4c
                L1f:
                    p505ts.AbstractC34132o.m107864I(r13)
                    r13 = r4
                    u02.a$a r4 = u02.InterfaceC34385a.INSTANCE
                    zu2.d r1 = r12.f177559x
                    tr2.n r5 = zu2.C41157d.m133700b(r1)
                    zu2.d r1 = r12.f177559x
                    rr2.c r6 = zu2.C41157d.m133699a(r1)
                    long r7 = r12.f177560y
                    java.lang.String r1 = "failed to fetch workout template "
                    java.lang.String r7 = p088dc.AbstractC11895b.m31994m(r7, r1)
                    zu2.d$a$a$a r8 = new zu2.d$a$a$a
                    zu2.d r1 = r12.f177559x
                    long r9 = r12.f177560y
                    r8.<init>(r1, r9, r2)
                    r12.f177558w = r13
                    r9 = r12
                    java.lang.Object r13 = r4.m108730a(r5, r6, r7, r8, r9)
                    if (r13 != r0) goto L4c
                    goto L74
                L4c:
                    r4 = r13
                    u02.a r4 = (u02.InterfaceC34385a) r4
                    zu2.d r13 = r9.f177559x
                    tr2.n r5 = zu2.C41157d.m133700b(r13)
                    zu2.d r13 = r9.f177559x
                    rr2.c r6 = zu2.C41157d.m133699a(r13)
                    long r7 = r9.f177560y
                    java.lang.String r13 = "failed to update workout template "
                    java.lang.String r7 = p088dc.AbstractC11895b.m31994m(r7, r13)
                    zu2.d$a$a$b r8 = new zu2.d$a$a$b
                    zu2.d r13 = r9.f177559x
                    long r10 = r9.f177560y
                    r8.<init>(r13, r10, r2)
                    r9.f177558w = r3
                    java.lang.Object r13 = u02.AbstractC34386b.m108736a(r4, r5, r6, r7, r8, r9)
                    if (r13 != r0) goto L75
                L74:
                    return r0
                L75:
                    u02.a r13 = (u02.InterfaceC34385a) r13
                    boolean r0 = r13 instanceof u02.InterfaceC34385a.c
                    if (r0 == 0) goto L88
                    zu2.c r1 = r9.f177561z
                    zu2.a$d r4 = zu2.InterfaceC41154a.d.f177535a
                    r5 = 3
                    r6 = 0
                    r2 = 0
                    r3 = 0
                    zu2.c r13 = zu2.C41156c.m133693c(r1, r2, r3, r4, r5, r6)
                    return r13
                L88:
                    boolean r0 = r13 instanceof u02.InterfaceC34385a.b.C42432b
                    if (r0 == 0) goto L99
                    zu2.c r1 = r9.f177561z
                    zu2.a$b r4 = zu2.InterfaceC41154a.b.f177533a
                    r5 = 3
                    r6 = 0
                    r2 = 0
                    r3 = 0
                    zu2.c r13 = zu2.C41156c.m133693c(r1, r2, r3, r4, r5, r6)
                    return r13
                L99:
                    boolean r13 = r13 instanceof u02.InterfaceC34385a.b
                    if (r13 == 0) goto Laa
                    zu2.c r0 = r9.f177561z
                    zu2.a$c r3 = zu2.InterfaceC41154a.c.f177534a
                    r4 = 3
                    r5 = 0
                    r1 = 0
                    r2 = 0
                    zu2.c r13 = zu2.C41156c.m133693c(r0, r1, r2, r3, r4, r5)
                    return r13
                Laa:
                    kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
                    r13.<init>()
                    throw r13
                */
                throw new UnsupportedOperationException("Method not decompiled: zu2.C41157d.a.C42777a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j7, C41156c c41156c, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f177556y = j7;
            this.f177557z = c41156c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C41157d.this.new a(this.f177556y, this.f177557z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C41156c> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f177554w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C42777a c42777a = new C42777a(C41157d.this, this.f177556y, this.f177557z, null);
            this.f177554w = 1;
            Object objM85321a = AbstractC28190p0.m85321a(1500L, c42777a, this);
            return objM85321a == enumC31071a ? enumC31071a : objM85321a;
        }
    }

    public C41157d(C14794i strengthTrainerInteractor, WeightliftingApi weightliftingApi, InterfaceC34116n logger, InterfaceC31766c crashReporter, InterfaceC14515a baseAnalytics, Clock clock) {
        AbstractC22676k.m65750j(strengthTrainerInteractor, "strengthTrainerInteractor");
        AbstractC22676k.m65750j(weightliftingApi, "weightliftingApi");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(crashReporter, "crashReporter");
        AbstractC22676k.m65750j(baseAnalytics, "baseAnalytics");
        AbstractC22676k.m65750j(clock, "clock");
        this.strengthTrainerInteractor = strengthTrainerInteractor;
        this.weightliftingApi = weightliftingApi;
        this.logger = logger;
        this.crashReporter = crashReporter;
        this.baseAnalytics = baseAnalytics;
        this.clock = clock;
        this.dateFormatter = DateTimeFormatter.ofPattern("MMM dd, yyyy");
    }

    /* JADX INFO: renamed from: e */
    private final C41156c m133703e(C41156c c41156c) {
        return C41156c.m133693c(c41156c, null, null, null, 3, null);
    }

    /* JADX INFO: renamed from: f */
    private final Object m133704f(C41156c c41156c, long j7, InterfaceC30057d<? super C41156c> interfaceC30057d) {
        return AbstractC3006f0.m8719m(new a(j7, c41156c, null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: g */
    private final C41156c m133705g(C41156c c41156c) {
        WorkoutTemplate workoutTemplateM42545h = this.strengthTrainerInteractor.m42545h();
        String name = workoutTemplateM42545h.getWorkoutTemplateKey() == null ? LocalDate.now(this.clock).format(this.dateFormatter) : workoutTemplateM42545h.getName();
        AbstractC22676k.m65747g(name);
        return C41156c.m133693c(c41156c, name, AbstractC41158e.m133712b(name), null, 4, null);
    }

    /* JADX INFO: renamed from: h */
    private final C41156c m133706h(C41156c c41156c) {
        this.baseAnalytics.mo41424f("", "Rename Workout", "", "Workout Builder");
        return C41156c.m133693c(c41156c, null, null, InterfaceC41154a.a.f177532a, 3, null);
    }

    /* JADX INFO: renamed from: i */
    private final C41156c m133707i(C41156c c41156c, String str) {
        String str2;
        if (AbstractC41158e.m133712b(str) == EnumC41159f.Valid) {
            C14794i c14794i = this.strengthTrainerInteractor;
            str2 = str;
            c14794i.m42546j(new InterfaceC14792g.i(WorkoutTemplate.copy$default(c14794i.m42545h(), null, null, str, null, null, 27, null)));
        } else {
            str2 = str;
        }
        return C41156c.m133693c(c41156c, str2, AbstractC41158e.m133712b(str2), null, 4, null);
    }

    /* JADX INFO: renamed from: j */
    private final Object m133708j(C41156c c41156c, InterfaceC30057d<? super C41156c> interfaceC30057d) {
        Long workoutTemplateKey = this.strengthTrainerInteractor.m42545h().getWorkoutTemplateKey();
        if (workoutTemplateKey != null) {
            return m133704f(c41156c, workoutTemplateKey.longValue(), interfaceC30057d);
        }
        this.logger.mo85226q("Workout Template Key is null when SaveCta is Clicked ", new AbstractC30556a.a[0]);
        return c41156c;
    }

    /* JADX INFO: renamed from: k */
    public final Object m133709k(C41156c c41156c, InterfaceC41155b interfaceC41155b, InterfaceC30057d<? super C41156c> interfaceC30057d) {
        if (AbstractC22676k.m65745e(interfaceC41155b, InterfaceC41155b.b.f177537a)) {
            return m133705g(c41156c);
        }
        if (interfaceC41155b instanceof InterfaceC41155b.d) {
            return m133707i(c41156c, ((InterfaceC41155b.d) interfaceC41155b).getNewName());
        }
        if (AbstractC22676k.m65745e(interfaceC41155b, InterfaceC41155b.c.f177538a)) {
            return m133706h(c41156c);
        }
        if (AbstractC22676k.m65745e(interfaceC41155b, InterfaceC41155b.e.f177540a)) {
            return m133708j(c41156c, interfaceC30057d);
        }
        if (AbstractC22676k.m65745e(interfaceC41155b, InterfaceC41155b.a.f177536a)) {
            return m133703e(c41156c);
        }
        throw new NoWhenBranchMatchedException();
    }
}
