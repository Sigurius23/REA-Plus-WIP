package wu2;

import bc3.AbstractC3006f0;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.weightlifting.data.WeightliftingApi;
import com.whoop.weightlifting.data.domain.VolumeInputFormat;
import com.whoop.weightlifting.data.domain.WorkoutExercise;
import com.whoop.weightlifting.data.domain.WorkoutGroup;
import com.whoop.weightlifting.data.domain.WorkoutSet;
import com.whoop.weightlifting.data.domain.WorkoutTemplate;
import com.whoop.weightlifting.data.domain.WorkoutTemplateKt;
import com.whoop.weightlifting.data.dto.LinkWorkoutRequest;
import com.whoop.weightlifting.data.dto.LinkWorkoutResponse;
import com.whoop.weightlifting.data.dto.SharedWorkoutResponse;
import com.whoop.weightlifting.data.dto.WorkoutTemplateDto;
import du2.AbstractC12378b;
import fi0.InterfaceC14515a;
import fu2.C14788c;
import fu2.C14789d;
import fu2.C14794i;
import fu2.InterfaceC14787b;
import fu2.InterfaceC14790e;
import fu2.InterfaceC14792g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import m83.C25235a0;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p098dt.AbstractC12350b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import rr2.InterfaceC31766c;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.AbstractC34386b;
import u02.InterfaceC34385a;
import wo1.C37445e0;

/* JADX INFO: renamed from: wu2.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u0014\u0010\u0015J^\u0010 \u001a\u00020\u0010*\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u00182\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0018H\u0082@¢\u0006\u0004\b \u0010!J?\u0010$\u001a\u00020#2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u00182\u0006\u0010\"\u001a\u00020\u001bH\u0002¢\u0006\u0004\b$\u0010%J\u0019\u0010&\u001a\u00020\u00102\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b&\u0010'J\u0013\u0010(\u001a\u00020\u0010*\u00020\u0010H\u0002¢\u0006\u0004\b(\u0010)J\u0013\u0010*\u001a\u00020\u0010*\u00020\u0010H\u0002¢\u0006\u0004\b*\u0010)J#\u0010.\u001a\u00020\u0010*\u00020\u00102\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+H\u0002¢\u0006\u0004\b.\u0010/J\u0013\u00100\u001a\u00020\u0010*\u00020\u0010H\u0002¢\u0006\u0004\b0\u0010)J\u0013\u00101\u001a\u00020\u0010*\u00020\u0010H\u0002¢\u0006\u0004\b1\u0010)J\u0013\u00102\u001a\u00020\u0010*\u00020\u0010H\u0002¢\u0006\u0004\b2\u0010)J\u001b\u00104\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u0013\u001a\u000203H\u0002¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00020#2\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b8\u00109J0\u0010;\u001a\u00020\u0010*\u00020\u00102\u0006\u0010:\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b;\u0010<J\u001c\u0010=\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b=\u0010>J5\u0010C\u001a\u00020\u0010*\u00020\u00102\f\u0010A\u001a\b\u0012\u0004\u0012\u00020@0?2\b\u0010B\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\bC\u0010DJ\u001e\u0010E\u001a\u00020\u0010*\u00020\u00102\b\b\u0002\u0010\u001d\u001a\u00020\u001bH\u0082@¢\u0006\u0004\bE\u0010FJ\u0013\u0010G\u001a\u00020\u0010*\u00020\u0010H\u0002¢\u0006\u0004\bG\u0010)J\u0014\u0010H\u001a\u00020\u0010*\u00020\u0010H\u0082@¢\u0006\u0004\bH\u0010IR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010X\u001a\u00020\u001b*\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bV\u0010W¨\u0006Y"}, m65681d2 = {"Lwu2/c;", "", "Lfu2/i;", "strengthTrainerInteractor", "Lfu2/d;", "editableWorkoutSharedInteractor", "Lcom/whoop/weightlifting/data/WeightliftingApi;", "weightliftingApi", "Ltr2/n;", "logger", "Lrr2/c;", "crashReporter", "Lfi0/a;", "analytics", "<init>", "(Lfu2/i;Lfu2/d;Lcom/whoop/weightlifting/data/WeightliftingApi;Ltr2/n;Lrr2/c;Lfi0/a;)V", "Lwu2/b;", "currentState", "Lfu2/b;", "action", "t", "(Lwu2/b;Lfu2/b;Lq83/d;)Ljava/lang/Object;", "", "templateId", "", "activityId", "sharedTemplateId", "", "isFromWhoopCoach", "isCopyFlow", "copySuffix", "entryPoint", "r", "(Lwu2/b;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "isNewWorkout", "Ll83/a0;", "B", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Z)V", "z", "(Z)Lwu2/b;", "y", "(Lwu2/b;)Lwu2/b;", "x", "", "groupIndex", "exerciseIndex", "u", "(Lwu2/b;II)Lwu2/b;", "E", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "k", "Lfu2/b$n;", "s", "(Lwu2/b;Lfu2/b$n;)Lwu2/b;", "Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;", "workoutTemplate", "C", "(Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;)V", "selectedWorkoutKey", "n", "(Lwu2/b;JLjava/lang/String;ZLq83/d;)Ljava/lang/Object;", "l", "(Lwu2/b;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lu02/a;", "Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;", "templateResponse", "workoutTemplateId", "p", "(Lwu2/b;Lu02/a;Ljava/lang/Long;Z)Lwu2/b;", "D", "(Lwu2/b;ZLq83/d;)Ljava/lang/Object;", "v", "A", "(Lwu2/b;Lq83/d;)Ljava/lang/Object;", "a", "Lfu2/i;", "b", "Lfu2/d;", "c", "Lcom/whoop/weightlifting/data/WeightliftingApi;", "d", "Ltr2/n;", "e", "Lrr2/c;", "f", "Lfi0/a;", "o", "(Lwu2/b;)Z", "hasMissingDetails", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37647c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C14794i strengthTrainerInteractor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C14789d editableWorkoutSharedInteractor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final WeightliftingApi weightliftingApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC31766c crashReporter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: wu2.c$a */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.edit.domain.EditWorkoutInteractor", m100430f = "EditWorkoutInteractor.kt", m100431l = {260, 262}, m100432m = "fetchSharedTemplate", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f161286E;

        /* JADX INFO: renamed from: w */
        Object f161287w;

        /* JADX INFO: renamed from: x */
        Object f161288x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f161289y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f161289y = obj;
            this.f161286E |= Integer.MIN_VALUE;
            return C37647c.this.m121013l(null, null, this);
        }
    }

    /* JADX INFO: renamed from: wu2.c$b */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.edit.domain.EditWorkoutInteractor$fetchSharedTemplate$sharedTemplateResponse$1", m100430f = "EditWorkoutInteractor.kt", m100431l = {261}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/weightlifting/data/dto/SharedWorkoutResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f161291w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f161293y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f161293y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C37647c.this.new b(this.f161293y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f161291w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            WeightliftingApi weightliftingApi = C37647c.this.weightliftingApi;
            String str = this.f161293y;
            this.f161291w = 1;
            Object sharedWorkout = weightliftingApi.getSharedWorkout(str, this);
            return sharedWorkout == enumC31071a ? enumC31071a : sharedWorkout;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super SharedWorkoutResponse> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: wu2.c$c */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.edit.domain.EditWorkoutInteractor$fetchSharedTemplate$sharedTemplateResponse$2", m100430f = "EditWorkoutInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lcom/whoop/weightlifting/data/dto/SharedWorkoutResponse;", "it", "Ll83/a0;", "<anonymous>", "(Lcom/whoop/weightlifting/data/dto/SharedWorkoutResponse;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f161294w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f161296y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f161296y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C37647c.this.new c(this.f161296y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SharedWorkoutResponse sharedWorkoutResponse, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(sharedWorkoutResponse, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f161294w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC14515a.m41418i(C37647c.this.analytics, null, "View", "Shared", "Workout Builder", null, AbstractC31061c.m95645u("sharedworkoutID", this.f161296y), 17, null);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: wu2.c$d */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.edit.domain.EditWorkoutInteractor", m100430f = "EditWorkoutInteractor.kt", m100431l = {253}, m100432m = "fetchWorkoutTemplateFromServer", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f161297E;

        /* JADX INFO: renamed from: G */
        int f161299G;

        /* JADX INFO: renamed from: w */
        Object f161300w;

        /* JADX INFO: renamed from: x */
        Object f161301x;

        /* JADX INFO: renamed from: y */
        long f161302y;

        /* JADX INFO: renamed from: z */
        boolean f161303z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f161297E = obj;
            this.f161299G |= Integer.MIN_VALUE;
            return C37647c.this.m121015n(null, 0L, null, false, this);
        }
    }

    /* JADX INFO: renamed from: wu2.c$e */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.edit.domain.EditWorkoutInteractor$fetchWorkoutTemplateFromServer$response$1", m100430f = "EditWorkoutInteractor.kt", m100431l = {254}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f161304w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ long f161306y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j7, InterfaceC30057d<? super e> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f161306y = j7;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C37647c.this.new e(this.f161306y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f161304w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            WeightliftingApi weightliftingApi = C37647c.this.weightliftingApi;
            long j7 = this.f161306y;
            this.f161304w = 1;
            Object workoutTemplate = weightliftingApi.getWorkoutTemplate(j7, this);
            return workoutTemplate == enumC31071a ? enumC31071a : workoutTemplate;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super WorkoutTemplateDto> interfaceC30057d) {
            return ((e) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: wu2.c$f */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.edit.domain.EditWorkoutInteractor", m100430f = "EditWorkoutInteractor.kt", m100431l = {139, 140}, m100432m = "handleRefreshWorkoutTemplate", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f161307E;

        /* JADX INFO: renamed from: F */
        Object f161308F;

        /* JADX INFO: renamed from: G */
        boolean f161309G;

        /* JADX INFO: renamed from: H */
        boolean f161310H;

        /* JADX INFO: renamed from: I */
        int f161311I;

        /* JADX INFO: renamed from: J */
        /* synthetic */ Object f161312J;

        /* JADX INFO: renamed from: L */
        int f161314L;

        /* JADX INFO: renamed from: w */
        Object f161315w;

        /* JADX INFO: renamed from: x */
        Object f161316x;

        /* JADX INFO: renamed from: y */
        Object f161317y;

        /* JADX INFO: renamed from: z */
        Object f161318z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f161312J = obj;
            this.f161314L |= Integer.MIN_VALUE;
            return C37647c.this.m121019r(null, null, null, null, false, false, null, null, this);
        }
    }

    /* JADX INFO: renamed from: wu2.c$g */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.edit.domain.EditWorkoutInteractor$sendLinkWorkoutRequest$2", m100430f = "EditWorkoutInteractor.kt", m100431l = {346}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lwu2/b;", "<anonymous>", "(Lbc3/c0;)Lwu2/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f161319w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C37646b f161320x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C37647c f161321y;

        /* JADX INFO: renamed from: wu2.c$g$a */
        @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.edit.domain.EditWorkoutInteractor$sendLinkWorkoutRequest$2$linkWorkoutResponse$1", m100430f = "EditWorkoutInteractor.kt", m100431l = {347}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/weightlifting/data/dto/LinkWorkoutResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f161322w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C37647c f161323x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C37646b f161324y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C37647c c37647c, C37646b c37646b, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f161323x = c37647c;
                this.f161324y = c37646b;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f161323x, this.f161324y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f161322w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                WeightliftingApi weightliftingApi = this.f161323x.weightliftingApi;
                LinkWorkoutRequest linkWorkoutRequest = new LinkWorkoutRequest(this.f161324y.getLinkedActivityId(), this.f161324y.getWorkoutTemplate().getWorkoutTemplateKey().longValue(), WorkoutTemplateKt.toDto(this.f161324y.getWorkoutTemplate()), (Integer) null, 8, (DefaultConstructorMarker) null);
                this.f161322w = 1;
                Object objLinkWorkoutToActivity = weightliftingApi.linkWorkoutToActivity(linkWorkoutRequest, this);
                return objLinkWorkoutToActivity == enumC31071a ? enumC31071a : objLinkWorkoutToActivity;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super LinkWorkoutResponse> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C37646b c37646b, C37647c c37647c, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f161320x = c37646b;
            this.f161321y = c37647c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new g(this.f161320x, this.f161321y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C37646b> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object objM108729b;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f161319w;
            String str = null;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (this.f161320x.getLinkedActivityId() == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                if (this.f161320x.getWorkoutTemplate().getWorkoutTemplateKey() == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
                InterfaceC34116n interfaceC34116n = this.f161321y.logger;
                a aVar = new a(this.f161321y, this.f161320x, null);
                this.f161319w = 1;
                objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, aVar, this, 6, null);
                if (objM108729b == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                objM108729b = obj;
            }
            InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
            if (!(interfaceC34385a instanceof InterfaceC34385a.c)) {
                if (interfaceC34385a instanceof InterfaceC34385a.b.C42432b) {
                    AbstractC12378b.m34738h(this.f161321y.analytics, this.f161320x.getWorkoutTemplate().getWorkoutTemplateKey().longValue(), this.f161320x.getLinkedActivityId(), "Timeout");
                    return C37646b.m120983c(this.f161320x, null, null, new InterfaceC37645a.j(InterfaceC14790e.a.f54891a), null, null, null, null, false, false, 507, null);
                }
                if (!(interfaceC34385a instanceof InterfaceC34385a.b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC34385a.b.a aVar2 = (InterfaceC34385a.b.a) interfaceC34385a;
                AbstractC12378b.m34738h(this.f161321y.analytics, this.f161320x.getWorkoutTemplate().getWorkoutTemplateKey().longValue(), this.f161320x.getLinkedActivityId(), AbstractC2875y.m8295h(aVar2.getErrorCode(), "error "));
                return C37646b.m120983c(this.f161320x, null, null, AbstractC34386b.m108739d(aVar2) ? InterfaceC37645a.e.f161257a : InterfaceC37645a.d.f161256a, null, null, null, null, false, false, 507, null);
            }
            InterfaceC14515a interfaceC14515a = this.f161321y.analytics;
            long jLongValue = this.f161320x.getWorkoutTemplate().getWorkoutTemplateKey().longValue();
            String name = WorkoutTemplateKt.toDto(this.f161320x.getWorkoutTemplate()).getName();
            String linkedActivityId = this.f161320x.getLinkedActivityId();
            String originalActivityType = ((LinkWorkoutResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).getOriginalActivityType();
            if (this.f161320x.getIsFromWhoopCoach() && this.f161320x.getLinkedActivityId().length() > 0) {
                str = "AI_link_MSK";
            }
            AbstractC12378b.m34739i(interfaceC14515a, jLongValue, name, linkedActivityId, originalActivityType, str);
            return C37646b.m120983c(this.f161320x, null, null, InterfaceC37645a.f.f161258a, null, null, null, null, false, false, 507, null);
        }
    }

    /* JADX INFO: renamed from: wu2.c$h */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.edit.domain.EditWorkoutInteractor$upsertWorkoutTemplateToServer$2", m100430f = "EditWorkoutInteractor.kt", m100431l = {297, 299, 315}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lwu2/b;", "<anonymous>", "(Lbc3/c0;)Lwu2/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        private /* synthetic */ Object f161325E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ C37646b f161326F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ C37647c f161327G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ boolean f161328H;

        /* JADX INFO: renamed from: w */
        Object f161329w;

        /* JADX INFO: renamed from: x */
        Object f161330x;

        /* JADX INFO: renamed from: y */
        Object f161331y;

        /* JADX INFO: renamed from: z */
        int f161332z;

        /* JADX INFO: renamed from: wu2.c$h$a */
        @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.edit.domain.EditWorkoutInteractor$upsertWorkoutTemplateToServer$2$savingModalMinimumDuration$1", m100430f = "EditWorkoutInteractor.kt", m100431l = {294}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f161333w;

            public a(InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f161333w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f161333w = 1;
                    if (AbstractC3034m0.m8782b(1500L, this) == enumC31071a) {
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

        /* JADX INFO: renamed from: wu2.c$h$b */
        @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.edit.domain.EditWorkoutInteractor$upsertWorkoutTemplateToServer$2$workoutTemplateFromServer$1", m100430f = "EditWorkoutInteractor.kt", m100431l = {298}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class b extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f161334w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C37647c f161335x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C37646b f161336y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C37647c c37647c, C37646b c37646b, InterfaceC30057d<? super b> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f161335x = c37647c;
                this.f161336y = c37646b;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new b(this.f161335x, this.f161336y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f161334w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                WeightliftingApi weightliftingApi = this.f161335x.weightliftingApi;
                WorkoutTemplateDto dto = WorkoutTemplateKt.toDto(this.f161336y.getWorkoutTemplate());
                this.f161334w = 1;
                Object objUpsertWorkoutTemplate = weightliftingApi.upsertWorkoutTemplate(dto, this);
                return objUpsertWorkoutTemplate == enumC31071a ? enumC31071a : objUpsertWorkoutTemplate;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super WorkoutTemplateDto> interfaceC30057d) {
                return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX INFO: renamed from: wu2.c$h$c */
        @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.edit.domain.EditWorkoutInteractor$upsertWorkoutTemplateToServer$2$workoutTemplateFromServer$2", m100430f = "EditWorkoutInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;", "updatedTemplate", "Ll83/a0;", "<anonymous>", "(Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class c extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ boolean f161337E;

            /* JADX INFO: renamed from: w */
            int f161338w;

            /* JADX INFO: renamed from: x */
            /* synthetic */ Object f161339x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C37646b f161340y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ C37647c f161341z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(C37646b c37646b, C37647c c37647c, boolean z4, InterfaceC30057d<? super c> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f161340y = c37646b;
                this.f161341z = c37647c;
                this.f161337E = z4;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                c cVar = new c(this.f161340y, this.f161341z, this.f161337E, interfaceC30057d);
                cVar.f161339x = obj;
                return cVar;
            }

            @Override // c93.InterfaceC4351m
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(WorkoutTemplateDto workoutTemplateDto, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((c) create(workoutTemplateDto, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                WorkoutTemplateDto workoutTemplateDto = (WorkoutTemplateDto) this.f161339x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f161338w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                String linkedActivityId = this.f161340y.getLinkedActivityId();
                String str = (linkedActivityId == null || linkedActivityId.length() == 0) ? "AI_create_workout" : "AI_link_MSK";
                InterfaceC14515a interfaceC14515a = this.f161341z.analytics;
                String str2 = this.f161340y.getIsSharedWorkout() ? "Shared" : null;
                String str3 = this.f161337E ? "Copy Workout" : null;
                C23465k c23465k = new C23465k("workoutId", workoutTemplateDto.getWorkoutTemplateKey());
                C23465k c23465k2 = new C23465k("originId", this.f161340y.getWorkoutTemplate().getParentTemplateKey());
                C23465k c23465k3 = new C23465k("sharedworkoutID", this.f161340y.getSharedWorkoutId());
                if (!this.f161340y.getIsSharedWorkout()) {
                    c23465k3 = null;
                }
                interfaceC14515a.mo41428k(str3, "Save Template", str2, "Workout Builder", AbstractC25247g0.m74000i0(AbstractC25260n.m74077r0(new C23465k[]{c23465k, c23465k2, c23465k3, this.f161340y.getIsFromWhoopCoach() ? new C23465k("source", str) : null})));
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(C37646b c37646b, C37647c c37647c, boolean z4, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f161326F = c37646b;
            this.f161327G = c37647c;
            this.f161328H = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            h hVar = new h(this.f161326F, this.f161327G, this.f161328H, interfaceC30057d);
            hVar.f161325E = obj;
            return hVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C37646b> interfaceC30057d) {
            return ((h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x00c2, code lost:
        
            if (r10.await(r18) == r6) goto L20;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Exception {
            /*
                Method dump skipped, instruction units count: 324
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: wu2.C37647c.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C37647c(C14794i strengthTrainerInteractor, C14789d editableWorkoutSharedInteractor, WeightliftingApi weightliftingApi, InterfaceC34116n logger, InterfaceC31766c crashReporter, InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(strengthTrainerInteractor, "strengthTrainerInteractor");
        AbstractC22676k.m65750j(editableWorkoutSharedInteractor, "editableWorkoutSharedInteractor");
        AbstractC22676k.m65750j(weightliftingApi, "weightliftingApi");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(crashReporter, "crashReporter");
        AbstractC22676k.m65750j(analytics, "analytics");
        this.strengthTrainerInteractor = strengthTrainerInteractor;
        this.editableWorkoutSharedInteractor = editableWorkoutSharedInteractor;
        this.weightliftingApi = weightliftingApi;
        this.logger = logger;
        this.crashReporter = crashReporter;
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: A */
    private final Object m120997A(C37646b c37646b, InterfaceC30057d<? super C37646b> interfaceC30057d) {
        return AbstractC3006f0.m8719m(new g(c37646b, this, null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: B */
    private final void m120998B(String entryPoint, Long templateId, String activityId, String sharedTemplateId, boolean isNewWorkout) {
        if (AbstractC22676k.m65745e(entryPoint, "ai_coach") && isNewWorkout && templateId == null && sharedTemplateId == null) {
            InterfaceC14515a.m41418i(this.analytics, null, "Open", null, "Workout Builder", null, AbstractC31061c.m95645u("source", "WCE - new ST workout"), 21, null);
        } else {
            if (activityId == null || activityId.length() == 0) {
                return;
            }
            InterfaceC14515a.m41418i(this.analytics, null, "Open", null, "Workout Builder", null, AbstractC31061c.m95645u("source", "WCE - link MSK"), 21, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public final void m120999C(WorkoutTemplate workoutTemplate) {
        this.strengthTrainerInteractor.m42546j(new InterfaceC14792g.i(workoutTemplate));
    }

    /* JADX INFO: renamed from: D */
    private final Object m121000D(C37646b c37646b, boolean z4, InterfaceC30057d<? super C37646b> interfaceC30057d) {
        return AbstractC3006f0.m8719m(new h(c37646b, this, z4, null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: E */
    private final C37646b m121001E(C37646b c37646b) {
        return m121016o(c37646b) ? C37646b.m120983c(c37646b, null, null, InterfaceC37645a.i.f161261a, null, null, null, null, false, false, 507, null) : m121023w(c37646b);
    }

    /* JADX INFO: renamed from: k */
    private final C37646b m121012k(C37646b c37646b) {
        return C37646b.m120983c(c37646b, null, null, null, null, null, null, null, false, false, 507, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: l */
    public final Object m121013l(C37646b c37646b, String str, InterfaceC30057d<? super C37646b> interfaceC30057d) {
        a aVar;
        C37646b c37646b2;
        String str2;
        C37646b c37646b3;
        String str3 = str;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f161286E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f161286E = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f161289y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f161286E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(str3, null);
            c37646b2 = c37646b;
            aVar2.f161287w = c37646b2;
            aVar2.f161288x = str3;
            aVar2.f161286E = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "failed to fetch shared workout template", bVar, aVar2, 2, null);
            if (objM108729b != enumC31071a) {
            }
            return enumC31071a;
        }
        if (i14 == 1) {
            str3 = (String) aVar2.f161288x;
            C37646b c37646b4 = (C37646b) aVar2.f161287w;
            AbstractC34132o.m107864I(objM108729b);
            c37646b2 = c37646b4;
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str4 = (String) aVar2.f161288x;
            C37646b c37646b5 = (C37646b) aVar2.f161287w;
            AbstractC34132o.m107864I(objM108729b);
            str2 = str4;
            c37646b3 = c37646b5;
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        C37646b c37646bM121018q = m121018q(this, c37646b3, AbstractC34386b.m108740e(interfaceC34385a, new C37445e0(22)), null, false, 4, null);
        SharedWorkoutResponse sharedWorkoutResponse = (SharedWorkoutResponse) AbstractC34386b.m108737b(interfaceC34385a);
        return C37646b.m120983c(c37646bM121018q, null, C25235a0.f99113w, null, null, str2, null, sharedWorkoutResponse != null ? sharedWorkoutResponse.getSubtitle() : null, false, false, 429, null);
        c cVar = new c(str3, null);
        aVar2.f161287w = c37646b2;
        aVar2.f161288x = str3;
        aVar2.f161286E = 2;
        objM108729b = AbstractC34386b.m108742g((InterfaceC34385a) objM108729b, cVar, aVar2);
        if (objM108729b != enumC31071a) {
            str2 = str3;
            c37646b3 = c37646b2;
            InterfaceC34385a interfaceC34385a2 = (InterfaceC34385a) objM108729b;
            C37646b c37646bM121018q2 = m121018q(this, c37646b3, AbstractC34386b.m108740e(interfaceC34385a2, new C37445e0(22)), null, false, 4, null);
            SharedWorkoutResponse sharedWorkoutResponse2 = (SharedWorkoutResponse) AbstractC34386b.m108737b(interfaceC34385a2);
            if (sharedWorkoutResponse2 != null) {
            }
            return C37646b.m120983c(c37646bM121018q2, null, C25235a0.f99113w, null, null, str2, null, sharedWorkoutResponse2 != null ? sharedWorkoutResponse2.getSubtitle() : null, false, false, 429, null);
        }
        return enumC31071a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final WorkoutTemplateDto m121014m(SharedWorkoutResponse it) {
        AbstractC22676k.m65750j(it, "it");
        return it.getWorkoutTemplate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX INFO: renamed from: n */
    public final Object m121015n(C37646b c37646b, long j7, String str, boolean z4, InterfaceC30057d<? super C37646b> interfaceC30057d) {
        d dVar;
        C37646b c37646b2;
        boolean z13;
        Object objM108729b;
        long j13 = j7;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f161299G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f161299G = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        d dVar2 = dVar;
        Object obj = dVar2.f161297E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar2.f161299G;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (str != null) {
                this.strengthTrainerInteractor.m42546j(new InterfaceC14792g.f(str));
            }
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            String strM31994m = AbstractC11895b.m31994m(j13, "Failed to retrieve workout template ");
            e eVar = new e(j13, null);
            c37646b2 = c37646b;
            dVar2.f161300w = c37646b2;
            dVar2.f161301x = null;
            dVar2.f161302y = j13;
            z13 = z4;
            dVar2.f161303z = z13;
            dVar2.f161299G = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, strM31994m, eVar, dVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z14 = dVar2.f161303z;
            long j14 = dVar2.f161302y;
            C37646b c37646b3 = (C37646b) dVar2.f161300w;
            AbstractC34132o.m107864I(obj);
            z13 = z14;
            j13 = j14;
            objM108729b = obj;
            c37646b2 = c37646b3;
        }
        return m121017p(c37646b2, (InterfaceC34385a) objM108729b, z13 ? null : new Long(j13), z13);
    }

    /* JADX INFO: renamed from: o */
    private final boolean m121016o(C37646b c37646b) {
        List<WorkoutGroup> groups = c37646b.getWorkoutTemplate().getGroups();
        if ((groups instanceof Collection) && groups.isEmpty()) {
            return false;
        }
        Iterator<T> it = groups.iterator();
        while (it.hasNext()) {
            List<WorkoutExercise> exercises = ((WorkoutGroup) it.next()).getExercises();
            if (!(exercises instanceof Collection) || !exercises.isEmpty()) {
                for (WorkoutExercise workoutExercise : exercises) {
                    List<WorkoutSet> sets = workoutExercise.getSets();
                    if (!(sets instanceof Collection) || !sets.isEmpty()) {
                        for (WorkoutSet workoutSet : sets) {
                            if (workoutSet.getWeight().length() == 0) {
                                return true;
                            }
                            if (workoutSet.getNumberOfReps().length() == 0 && workoutExercise.getExercise().getVolumeInputFormat() == VolumeInputFormat.Reps) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    private final C37646b m121017p(C37646b c37646b, InterfaceC34385a<WorkoutTemplateDto> interfaceC34385a, Long l7, boolean z4) {
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            this.strengthTrainerInteractor.m42546j(new InterfaceC14792g.i(((WorkoutTemplateDto) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).toWorkoutTemplate(l7)));
            return m121026z(z4);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b.C42432b) {
            return C37646b.m120983c(c37646b, null, null, new InterfaceC37645a.j(InterfaceC14790e.b.f54892a), null, null, null, null, false, false, 507, null);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b.a) {
            return C37646b.m120983c(c37646b, null, null, new InterfaceC37645a.l(InterfaceC14790e.b.f54892a), null, null, null, null, false, false, 507, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ C37646b m121018q(C37647c c37647c, C37646b c37646b, InterfaceC34385a interfaceC34385a, Long l7, boolean z4, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            z4 = false;
        }
        return c37647c.m121017p(c37646b, interfaceC34385a, l7, z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e0, code lost:
    
        if (r1 == r10) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x010c, code lost:
    
        if (r1 == r10) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m121019r(wu2.C37646b r22, java.lang.Long r23, java.lang.String r24, java.lang.String r25, boolean r26, boolean r27, java.lang.String r28, java.lang.String r29, q83.InterfaceC30057d<? super wu2.C37646b> r30) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wu2.C37647c.m121019r(wu2.b, java.lang.Long, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: s */
    private final C37646b m121020s(C37646b c37646b, InterfaceC14787b.n nVar) {
        C14788c c14788cM42515t = this.editableWorkoutSharedInteractor.m42515t(new C14788c(c37646b.getWorkoutTemplate().getGroups(), c37646b.m120986e(), null, null, 12, null), nVar);
        List<WorkoutGroup> listM42466a = c14788cM42515t.m42466a();
        Set<UUID> setM42467b = c14788cM42515t.m42467b();
        WorkoutTemplate workoutTemplateCopy$default = WorkoutTemplate.copy$default(c37646b.getWorkoutTemplate(), null, null, null, listM42466a, null, 23, null);
        m120999C(workoutTemplateCopy$default);
        return C37646b.m120983c(c37646b, workoutTemplateCopy$default, setM42467b, null, null, null, null, null, false, false, 508, null);
    }

    /* JADX INFO: renamed from: u */
    private final C37646b m121021u(C37646b c37646b, int i13, int i14) {
        return C37646b.m120983c(c37646b, null, null, new InterfaceC37645a.a(i13, i14), null, null, null, null, false, false, 507, null);
    }

    /* JADX INFO: renamed from: v */
    private final C37646b m121022v(C37646b c37646b) {
        return C37646b.m120983c(c37646b, null, null, InterfaceC37645a.g.f161259a, null, null, null, null, false, false, 507, null);
    }

    /* JADX INFO: renamed from: w */
    private final C37646b m121023w(C37646b c37646b) {
        return C37646b.m120983c(c37646b, null, null, new InterfaceC37645a.n(c37646b.getIsCopyFlow()), null, null, null, null, false, false, 507, null);
    }

    /* JADX INFO: renamed from: x */
    private final C37646b m121024x(C37646b c37646b) {
        return C37646b.m120983c(c37646b, null, null, c37646b.getLastSavedWorkoutTemplate() == null ? new InterfaceC37645a.b(c37646b.getIsFromWhoopCoach()) : InterfaceC37645a.o.f161266a, null, null, null, null, false, false, 507, null);
    }

    /* JADX INFO: renamed from: y */
    private final C37646b m121025y(C37646b c37646b) {
        WorkoutTemplate workoutTemplateM42545h = this.strengthTrainerInteractor.m42545h();
        return C37646b.m120983c(c37646b, workoutTemplateM42545h, AbstractC12350b.m34556E(c37646b.m120986e(), AbstractC12350b.m34605z(workoutTemplateM42545h.getAllExerciseIds(), c37646b.getWorkoutTemplate().getAllExerciseIds())), null, null, null, null, null, false, false, 504, null);
    }

    /* JADX INFO: renamed from: z */
    private final C37646b m121026z(boolean isFromWhoopCoach) {
        C14794i c14794i = this.strengthTrainerInteractor;
        WorkoutTemplate workoutTemplateM42545h = c14794i.m42545h();
        String strM42544f = c14794i.m42544f();
        WorkoutTemplate workoutTemplateM42545h2 = c14794i.m42545h();
        if (c14794i.m42545h().getWorkoutTemplateKey() == null) {
            workoutTemplateM42545h2 = null;
        }
        return new C37646b(workoutTemplateM42545h, c14794i.m42545h().getAllExerciseIds(), null, workoutTemplateM42545h2, null, strM42544f, null, isFromWhoopCoach, false, 336, null);
    }

    /* JADX INFO: renamed from: t */
    public final Object m121027t(C37646b c37646b, InterfaceC14787b interfaceC14787b, InterfaceC30057d<? super C37646b> interfaceC30057d) {
        if (interfaceC14787b instanceof InterfaceC14787b.i) {
            InterfaceC14787b.i iVar = (InterfaceC14787b.i) interfaceC14787b;
            return m121019r(c37646b, iVar.getTemplateId(), iVar.getActivityId(), iVar.getSharedTemplateId(), iVar.getIsFromWhoopCoach(), iVar.getIsCopyFlow(), iVar.getCopySuffix(), iVar.getEntryPoint(), interfaceC30057d);
        }
        if (interfaceC14787b instanceof InterfaceC14787b.h) {
            return m121024x(c37646b);
        }
        if (interfaceC14787b instanceof InterfaceC14787b.e) {
            InterfaceC14787b.e eVar = (InterfaceC14787b.e) interfaceC14787b;
            return m121021u(c37646b, eVar.getGroupIndex(), eVar.getExerciseIndex());
        }
        if (interfaceC14787b instanceof InterfaceC14787b.s) {
            return m121001E(c37646b);
        }
        if (interfaceC14787b instanceof InterfaceC14787b.g) {
            return m121023w(c37646b);
        }
        if (interfaceC14787b instanceof InterfaceC14787b.l) {
            return m121000D(c37646b, ((InterfaceC14787b.l) interfaceC14787b).getIsCopyFlow(), interfaceC30057d);
        }
        if (interfaceC14787b instanceof InterfaceC14787b.f) {
            return m121022v(c37646b);
        }
        if (interfaceC14787b instanceof InterfaceC14787b.m) {
            return m120997A(c37646b, interfaceC30057d);
        }
        if (interfaceC14787b instanceof InterfaceC14787b.b) {
            return m121012k(c37646b);
        }
        if (interfaceC14787b instanceof InterfaceC14787b.n) {
            return m121012k(m121020s(c37646b, (InterfaceC14787b.n) interfaceC14787b));
        }
        throw new NoWhenBranchMatchedException();
    }

    public /* synthetic */ C37647c(C14794i c14794i, C14789d c14789d, WeightliftingApi weightliftingApi, InterfaceC34116n interfaceC34116n, InterfaceC31766c interfaceC31766c, InterfaceC14515a interfaceC14515a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c14794i, c14789d, weightliftingApi, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("EditWorkoutInteractor") : interfaceC34116n, interfaceC31766c, interfaceC14515a);
    }
}
