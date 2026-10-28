package uu2;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import b91.AbstractC2890e;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.local.prefs.SharedPreferenceConstants;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.weightlifting.data.WeightliftingApi;
import com.whoop.weightlifting.data.domain.CustomExerciseInfo;
import com.whoop.weightlifting.data.domain.LinkedExercise;
import com.whoop.weightlifting.data.domain.WeightliftingExercise;
import com.whoop.weightlifting.data.dto.CustomExerciseDtoKt;
import com.whoop.weightlifting.data.dto.ExerciseData;
import com.whoop.weightlifting.data.dto.WeightliftingExerciseDto;
import cu2.AbstractC11128h;
import cv2.C11149b;
import d41.AbstractC11684j;
import d41.C11682h;
import d41.EnumC11681g;
import du2.AbstractC12378b;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13072o1;
import fi0.InterfaceC14515a;
import fu2.C14794i;
import fu2.InterfaceC14792g;
import gu2.C16214a;
import gy0.AbstractC16277f;
import gz0.AbstractC16319p0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kd1.AbstractC22403o;
import l83.C23454a0;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import o11.AbstractC27407m;
import or2.AbstractC28188o1;
import or2.C28180m;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p21.C28754g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import u92.C34660d;
import x81.C38072d;
import y71.C39274g;
import y71.C39282o;

/* JADX INFO: renamed from: uu2.a0 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0082@¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010#\u001a\u00020\"*\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u0013\u0010%\u001a\u00020\"*\u00020!H\u0002¢\u0006\u0004\b%\u0010$J\u0013\u0010'\u001a\u00020&*\u00020!H\u0002¢\u0006\u0004\b'\u0010(J\u0013\u0010)\u001a\u00020\"*\u00020!H\u0002¢\u0006\u0004\b)\u0010$J\u0017\u0010+\u001a\u00020*2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b+\u0010,J\u0013\u0010.\u001a\u00020-*\u00020!H\u0002¢\u0006\u0004\b.\u0010/J\u0019\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u000100H\u0002¢\u0006\u0004\b3\u00104J\u001c\u00105\u001a\u00020\u0012*\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b5\u00106J\u001c\u00107\u001a\u00020\u0012*\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b7\u00106J\u0015\u00108\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b8\u00109R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010:R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010=R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010>R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010?R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010@R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00140C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001d\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00120G8\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0014\u0010O\u001a\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010N¨\u0006P"}, m65681d2 = {"Luu2/a0;", "Landroidx/lifecycle/w1;", "Lfi0/a;", "baseAnalytics", "Lcom/whoop/weightlifting/data/WeightliftingApi;", "api", "Ltr2/n;", "logger", "Lfu2/i;", "strengthTrainerInteractor", "Lu92/d;", "prefsStore", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lbc3/c0;", "coroutineScope", "<init>", "(Lfi0/a;Lcom/whoop/weightlifting/data/WeightliftingApi;Ltr2/n;Lfu2/i;Lu92/d;Lcom/whoop/data/repositories/FeatureFlagChecker;Lbc3/c0;)V", "Luu2/b0;", "previousState", "Luu2/c$h;", NotificationCompat.CATEGORY_EVENT, "u", "(Luu2/b0;Luu2/c$h;Lq83/d;)Ljava/lang/Object;", "Ll83/a0;", "E", "(Luu2/b0;)V", "", "exerciseId", "", "showCta", "D", "(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;", "Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;", "Luu2/i0;", "B", "(Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;)Luu2/i0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lm91/u;", "A", "(Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;)Lm91/u;", "y", "Luu2/b;", "C", "(Ljava/lang/String;)Luu2/b;", "Luu2/a;", "v", "(Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;)Luu2/a;", "Lcom/whoop/weightlifting/data/domain/LinkedExercise;", "exercise", "Lo11/m$c$a;", "z", "(Lcom/whoop/weightlifting/data/domain/LinkedExercise;)Lo11/m$c$a;", "q", "(Luu2/b0;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "r", "F", "(Luu2/c$h;)V", "Lfi0/a;", "x", "Lcom/whoop/weightlifting/data/WeightliftingApi;", "Ltr2/n;", "Lfu2/i;", "Lu92/d;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "G", "Lbc3/c0;", "Lec3/o1;", "H", "Lec3/o1;", "eventFlow", "Lec3/l;", "I", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "t", "()Z", "isActivelyWorkingOut", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35240a0 extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final C34660d prefsStore;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC14515a baseAnalytics;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final WeightliftingApi api;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final C14794i strengthTrainerInteractor;

    /* JADX INFO: renamed from: uu2.a0$a */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.details.ExerciseDetailsViewModel", m100430f = "ExerciseDetailsViewModel.kt", m100431l = {238, 243}, m100432m = "deleteCustomExercise", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f149893F;

        /* JADX INFO: renamed from: w */
        Object f149894w;

        /* JADX INFO: renamed from: x */
        Object f149895x;

        /* JADX INFO: renamed from: y */
        Object f149896y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f149897z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f149897z = obj;
            this.f149893F |= Integer.MIN_VALUE;
            return C35240a0.this.m111639q(null, null, this);
        }
    }

    /* JADX INFO: renamed from: uu2.a0$b */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.details.ExerciseDetailsViewModel$deleteCustomExercise$response$1", m100430f = "ExerciseDetailsViewModel.kt", m100431l = {239}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f149898w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f149900y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f149900y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C35240a0.this.new b(this.f149900y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f149898w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            WeightliftingApi weightliftingApi = C35240a0.this.api;
            String str = this.f149900y;
            this.f149898w = 1;
            Object objDeleteCustomExercise = weightliftingApi.deleteCustomExercise(str, this);
            return objDeleteCustomExercise == enumC31071a ? enumC31071a : objDeleteCustomExercise;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: uu2.a0$c */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.details.ExerciseDetailsViewModel", m100430f = "ExerciseDetailsViewModel.kt", m100431l = {254}, m100432m = "deleteExerciseFromCache", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f149902F;

        /* JADX INFO: renamed from: w */
        Object f149903w;

        /* JADX INFO: renamed from: x */
        Object f149904x;

        /* JADX INFO: renamed from: y */
        Object f149905y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f149906z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f149906z = obj;
            this.f149902F |= Integer.MIN_VALUE;
            return C35240a0.this.m111640r(null, null, this);
        }
    }

    /* JADX INFO: renamed from: uu2.a0$d */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.details.ExerciseDetailsViewModel$deleteExerciseFromCache$response$1", m100430f = "ExerciseDetailsViewModel.kt", m100431l = {255}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/weightlifting/data/dto/ExerciseData;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f149907w;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C35240a0.this.new d(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f149907w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            WeightliftingApi weightliftingApi = C35240a0.this.api;
            this.f149907w = 1;
            Object exerciseListV2 = weightliftingApi.getExerciseListV2(this);
            return exerciseListV2 == enumC31071a ? enumC31071a : exerciseListV2;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super ExerciseData> interfaceC30057d) {
            return ((d) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: uu2.a0$e */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.details.ExerciseDetailsViewModel", m100430f = "ExerciseDetailsViewModel.kt", m100431l = {110}, m100432m = "retrieveExerciseDetails", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f149909E;

        /* JADX INFO: renamed from: w */
        Object f149910w;

        /* JADX INFO: renamed from: x */
        boolean f149911x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f149912y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f149912y = obj;
            this.f149909E |= Integer.MIN_VALUE;
            return C35240a0.this.m111631D(null, false, this);
        }
    }

    /* JADX INFO: renamed from: uu2.a0$f */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.details.ExerciseDetailsViewModel$retrieveExerciseDetails$response$1", m100430f = "ExerciseDetailsViewModel.kt", m100431l = {111}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f149914w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f149916y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, InterfaceC30057d<? super f> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f149916y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C35240a0.this.new f(this.f149916y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f149914w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            WeightliftingApi weightliftingApi = C35240a0.this.api;
            String str = this.f149916y;
            this.f149914w = 1;
            Object exerciseDetailsById = weightliftingApi.getExerciseDetailsById(str, this);
            return exerciseDetailsById == enumC31071a ? enumC31071a : exerciseDetailsById;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super WeightliftingExerciseDto> interfaceC30057d) {
            return ((f) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: uu2.a0$g */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.details.ExerciseDetailsViewModel$sendEvent$1", m100430f = "ExerciseDetailsViewModel.kt", m100431l = {82}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f149917w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC35243c.h f149919y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC35243c.h hVar, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f149919y = hVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C35240a0.this.new g(this.f149919y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f149917w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C35240a0.this.eventFlow;
                InterfaceC35243c.h hVar = this.f149919y;
                this.f149917w = 1;
                if (interfaceC13072o1.emit(hVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: uu2.a0$h */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class h extends C22672i implements Function3 {
        public h(Object obj) {
            super(3, 0, C35240a0.class, obj, "reduce", "reduce(Lcom/whoop/weightlifting/feature/builder/details/ExerciseDetailsViewState;Lcom/whoop/weightlifting/feature/builder/details/ExerciseDetailsEvent$ViewEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C35242b0 c35242b0, InterfaceC35243c.h hVar, InterfaceC30057d<? super C35242b0> interfaceC30057d) {
            return ((C35240a0) this.receiver).m111642u(c35242b0, hVar, interfaceC30057d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35240a0(InterfaceC14515a baseAnalytics, WeightliftingApi api, InterfaceC34116n logger, C14794i strengthTrainerInteractor, C34660d prefsStore, FeatureFlagChecker featureFlagChecker, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(baseAnalytics, "baseAnalytics");
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(strengthTrainerInteractor, "strengthTrainerInteractor");
        AbstractC22676k.m65750j(prefsStore, "prefsStore");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.baseAnalytics = baseAnalytics;
        this.api = api;
        this.logger = logger;
        this.strengthTrainerInteractor = strengthTrainerInteractor;
        this.prefsStore = prefsStore;
        this.featureFlagChecker = featureFlagChecker;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        this.viewState = AbstractC13091v.m36586L(new C13060l1(C35242b0.INSTANCE.m111663a(), c13096w1M36592b, new h(this)), coroutineScope, C13105z1.f45288a, 1);
    }

    /* JADX INFO: renamed from: A */
    private final InterfaceC25312u m111628A(WeightliftingExercise weightliftingExercise) {
        String imageUrl = weightliftingExercise.getImageUrl();
        C38072d c38072d = C38072d.f163053a;
        AbstractC22403o.c cVar = new AbstractC22403o.c(imageUrl, c38072d.m121951d().getLogo().getWhoop(), c38072d.m121951d().getLogo().getWhoop(), c38072d.m121951d().getLogo().getWhoop());
        TextResource.C8688b c8688bM21277k = AbstractC28188o1.m85314d(weightliftingExercise.getVideoUrl()) ? AbstractC8693b.m21277k(AbstractC11128h.f35522y) : null;
        return this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.MEDIA_CARD_ARTICLE_TILE_MIGRATION) ? new C11682h(null, EnumC11681g.FULLWIDTH, null, new AbstractC11684j.d(cVar, AbstractC8693b.m21278l(""), null, AbstractC8693b.m21278l(""), c8688bM21277k, 4, null), false, 5, null) : new C28754g(null, null, cVar, AbstractC8693b.m21278l(weightliftingExercise.getName()), null, null, c8688bM21277k, null, AbstractC28188o1.m85314d(weightliftingExercise.getVideoUrl()), 131, null);
    }

    /* JADX INFO: renamed from: B */
    private final C35256i0 m111629B(WeightliftingExercise weightliftingExercise) {
        return new C35256i0(new C16214a(AbstractC8693b.m21277k(AbstractC11128h.f35464e1), EnumC39333f.BRAND_WHITE, AbstractC2890e.m8450e().getSh4()), new C16214a(AbstractC8693b.m21278l(weightliftingExercise.getTranslatedMuscleGroups()), EnumC39333f.WHITE_70, AbstractC2890e.m8450e().getB2()));
    }

    /* JADX INFO: renamed from: C */
    private final C35241b m111630C(String exerciseId) {
        return new C35241b(AbstractC8693b.m21277k(AbstractC11128h.f35508t0), AbstractC8693b.m21277k(AbstractC11128h.f35496p0), EnumC39333f.ACCENT_ALERT, AbstractC8693b.m21277k(AbstractC11128h.f35453b0), AbstractC8693b.m21277k(AbstractC11128h.f35505s0), new InterfaceC35243c.g(exerciseId), InterfaceC35243c.a.f149934a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: D */
    public final Object m111631D(String str, boolean z4, InterfaceC30057d<? super C35242b0> interfaceC30057d) {
        e eVar;
        boolean z13;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f149909E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f149909E = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        e eVar2 = eVar;
        Object objM108729b = eVar2.f149912y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = eVar2.f149909E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            String strM30461o = AbstractC11266d.m30461o("Failed to retrieve exercise details with id ", str);
            f fVar = new f(str, null);
            eVar2.f149910w = null;
            z13 = z4;
            eVar2.f149911x = z13;
            eVar2.f149909E = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, strM30461o, fVar, eVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z13 = eVar2.f149911x;
            AbstractC34132o.m107864I(objM108729b);
        }
        boolean z14 = z13;
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (!(interfaceC34385a instanceof InterfaceC34385a.c)) {
            if (interfaceC34385a instanceof InterfaceC34385a.b.a) {
                return new C35242b0(null, C35258j0.m111734g(C35258j0.INSTANCE.m111748e(), null, null, null, InterfaceC35243c.c.f149936a, null, null, null, false, 247, null), null, false, 13, null);
            }
            if (interfaceC34385a instanceof InterfaceC34385a.b.C42432b) {
                return new C35242b0(null, C35258j0.m111734g(C35258j0.INSTANCE.m111747d(), null, null, null, InterfaceC35243c.c.f149936a, null, null, null, false, 247, null), null, false, 13, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        WeightliftingExercise weightliftingExercise = ((WeightliftingExerciseDto) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).toWeightliftingExercise();
        this.baseAnalytics.mo41428k(weightliftingExercise.getExerciseId(), "Open", "", "Workout Builder", AbstractC31061c.m95645u("equipment", weightliftingExercise.getEquipment().getSerializedValue()));
        C35256i0 c35256i0M111645y = m111645y(weightliftingExercise);
        InterfaceC25312u interfaceC25312uM111628A = weightliftingExercise.getIsCustomExercise() ? null : m111628A(weightliftingExercise);
        return new C35242b0(null, null, new C35260k0(weightliftingExercise, c35256i0M111645y, m111644w(weightliftingExercise), m111629B(weightliftingExercise), AbstractC28188o1.m85314d(weightliftingExercise.getImageUrl()) && AbstractC28188o1.m85314d(weightliftingExercise.getVideoUrl()) && !weightliftingExercise.getIsCustomExercise(), interfaceC25312uM111628A, weightliftingExercise.getIsCustomExercise() ? m111643v(weightliftingExercise) : null), z14, 1, null);
    }

    /* JADX INFO: renamed from: E */
    private final void m111632E(C35242b0 previousState) {
        WeightliftingExercise exercise;
        String name;
        LinkedExercise linkedExercise;
        C35260k0 screenContent = previousState.getScreenContent();
        if (screenContent == null || (exercise = screenContent.getExercise()) == null) {
            return;
        }
        InterfaceC14515a interfaceC14515a = this.baseAnalytics;
        String name2 = exercise.getName();
        CustomExerciseInfo customExerciseInfo = exercise.getCustomExerciseInfo();
        if (customExerciseInfo == null || (linkedExercise = customExerciseInfo.getLinkedExercise()) == null || (name = linkedExercise.getName()) == null) {
            name = "";
        }
        String serializedValue = exercise.getEquipment().getSerializedValue();
        String str = (String) AbstractC25265s.m74100H0(exercise.getMuscleGroups());
        AbstractC12378b.m34731a(interfaceC14515a, name2, name, serializedValue, str != null ? str : "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: q */
    public final Object m111639q(C35242b0 c35242b0, String str, InterfaceC30057d<? super C35242b0> interfaceC30057d) {
        a aVar;
        C35242b0 c35242b1;
        String str2 = str;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f149893F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f149893F = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f149897z;
        Object obj = EnumC31071a.f128113w;
        int i14 = aVar2.f149893F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            String strM30461o = AbstractC11266d.m30461o("Failed to Delete CustomExercise :", str2);
            b bVar = new b(str2, null);
            c35242b1 = c35242b0;
            aVar2.f149894w = c35242b1;
            aVar2.f149895x = str2;
            aVar2.f149893F = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, strM30461o, bVar, aVar2, 2, null);
            if (objM108729b != obj) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
            return objM108729b;
        }
        str2 = (String) aVar2.f149895x;
        C35242b0 c35242b2 = (C35242b0) aVar2.f149894w;
        AbstractC34132o.m107864I(objM108729b);
        c35242b1 = c35242b2;
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (!(interfaceC34385a instanceof InterfaceC34385a.c)) {
            if (interfaceC34385a instanceof InterfaceC34385a.b.a) {
                return C35242b0.m111657c(c35242b1, null, C35258j0.m111734g(C35258j0.INSTANCE.m111748e(), null, null, null, InterfaceC35243c.a.f149934a, null, null, null, false, 247, null), null, false, 13, null);
            }
            if (interfaceC34385a instanceof InterfaceC34385a.b.C42432b) {
                return C35242b0.m111657c(c35242b1, null, C35258j0.m111734g(C35258j0.INSTANCE.m111747d(), null, null, null, InterfaceC35243c.a.f149934a, null, null, null, false, 247, null), null, false, 13, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        aVar2.f149894w = null;
        aVar2.f149895x = null;
        aVar2.f149896y = null;
        aVar2.f149893F = 2;
        Object objM111640r = m111640r(c35242b1, str2, aVar2);
        return objM111640r == obj ? obj : objM111640r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: r */
    public final Object m111640r(C35242b0 c35242b0, String str, InterfaceC30057d<? super C35242b0> interfaceC30057d) {
        c cVar;
        WeightliftingExercise exercise;
        InterfaceC30057d interfaceC30057d2;
        C35242b0 c35242b1;
        WeightliftingExercise weightliftingExercise;
        C11149b c11149b;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f149902F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f149902F = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        c cVar2 = cVar;
        Object obj = cVar2.f149906z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar2.f149902F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            Map<String, C11149b> mapM42542d = this.strengthTrainerInteractor.m42542d();
            if (mapM42542d == null || (c11149b = mapM42542d.get(str)) == null) {
                exercise = null;
                interfaceC30057d2 = null;
            } else {
                exercise = c11149b.getExercise();
                interfaceC30057d2 = null;
            }
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            d dVar = new d(interfaceC30057d2);
            cVar2.f149903w = c35242b0;
            cVar2.f149904x = str;
            cVar2.f149905y = exercise;
            cVar2.f149902F = 1;
            Object objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to update getExerciseList", dVar, cVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
            c35242b1 = c35242b0;
            weightliftingExercise = exercise;
            obj = objM108729b;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            weightliftingExercise = (WeightliftingExercise) cVar2.f149905y;
            str = (String) cVar2.f149904x;
            c35242b1 = (C35242b0) cVar2.f149903w;
            AbstractC34132o.m107864I(obj);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) obj;
        if (!(interfaceC34385a instanceof InterfaceC34385a.c)) {
            this.logger.mo85216g(AbstractC11895b.m31996o("Deleting Custom Exercise with ID :", str, " to cache"), new AbstractC30556a.a[0]);
            if (weightliftingExercise != null) {
                this.strengthTrainerInteractor.m42546j(new InterfaceC14792g.h(weightliftingExercise));
            }
            return C35242b0.m111657c(c35242b1, null, C35258j0.m111734g(C35258j0.INSTANCE.m111744a(), null, null, null, InterfaceC35243c.c.f149936a, null, null, null, false, 247, null), null, false, 13, null);
        }
        InterfaceC34385a.c cVar3 = (InterfaceC34385a.c) interfaceC34385a;
        List<WeightliftingExerciseDto> exercises = ((ExerciseData) cVar3.m108735a()).getExercises();
        ArrayList<WeightliftingExercise> arrayList = new ArrayList(AbstractC25267u.m74163i0(exercises, 10));
        Iterator<T> it = exercises.iterator();
        while (it.hasNext()) {
            arrayList.add(((WeightliftingExerciseDto) it.next()).toWeightliftingExercise());
        }
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(arrayList, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (WeightliftingExercise weightliftingExercise2 : arrayList) {
            linkedHashMap.put(weightliftingExercise2.getExerciseId(), new C11149b(weightliftingExercise2, false));
        }
        this.strengthTrainerInteractor.m42546j(new InterfaceC14792g.c(linkedHashMap, CustomExerciseDtoKt.toDomain(((ExerciseData) cVar3.m108735a()).getFilterOptions())));
        return C35242b0.m111657c(c35242b1, null, C35258j0.m111734g(C35258j0.INSTANCE.m111744a(), null, null, null, InterfaceC35243c.c.f149936a, null, null, null, false, 247, null), null, false, 13, null);
    }

    /* JADX INFO: renamed from: t */
    private final boolean m111641t() {
        return this.prefsStore.m109533j(SharedPreferenceConstants.STRENGTH_BUILDER_SAVED_STATE) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public final Object m111642u(C35242b0 c35242b0, InterfaceC35243c.h hVar, InterfaceC30057d<? super C35242b0> interfaceC30057d) {
        if (hVar instanceof InterfaceC35243c.d) {
            InterfaceC35243c.d dVar = (InterfaceC35243c.d) hVar;
            return m111631D(dVar.getExerciseId(), dVar.getShowCta(), interfaceC30057d);
        }
        if (hVar instanceof InterfaceC35243c.b) {
            return m111639q(c35242b0, ((InterfaceC35243c.b) hVar).getExerciseId(), interfaceC30057d);
        }
        if (hVar instanceof InterfaceC35243c.g) {
            m111632E(c35242b0);
            return C35242b0.m111657c(c35242b0, null, C35258j0.m111734g(C35258j0.INSTANCE.m111745b(), null, null, null, null, null, null, new InterfaceC35243c.b(((InterfaceC35243c.g) hVar).getExerciseId()), false, 191, null), null, false, 13, null);
        }
        if (hVar instanceof InterfaceC35243c.a) {
            return C35242b0.m111657c(c35242b0, null, null, null, false, 12, null);
        }
        if (hVar instanceof InterfaceC35243c.f) {
            return C35242b0.m111657c(c35242b0, m111630C(((InterfaceC35243c.f) hVar).getExerciseId()), null, null, false, 14, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: v */
    private final C35239a m111643v(WeightliftingExercise weightliftingExercise) {
        C39274g c39274g = m111641t() ? null : new C39274g(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getDotMenu(), AbstractC8693b.m21277k(AbstractC16277f.f62303a0));
        C39282o.Companion companion = C39282o.INSTANCE;
        C39282o c39282oM125229d = C39282o.Companion.m125229d(companion, AbstractC8693b.m21277k(AbstractC11128h.f35499q0), null, null, null, null, new C39274g(AbstractC16319p0.m46430a().getAction().getDelete(), AbstractC8693b.m21277k(AbstractC11128h.f35499q0)), null, null, null, null, null, null, null, null, false, false, null, false, null, null, new InterfaceC35243c.f(weightliftingExercise.getExerciseId()), false, null, 7339998, null);
        C39282o c39282oM125229d2 = C39282o.Companion.m125229d(companion, AbstractC8693b.m21277k(AbstractC11128h.f35395I0), null, null, null, null, new C39274g(AbstractC16319p0.m46430a().getAction().getPencil(), AbstractC8693b.m21277k(AbstractC11128h.f35395I0)), null, null, null, null, null, null, null, null, false, false, null, false, null, null, new InterfaceC35243c.e(weightliftingExercise.getExerciseId()), false, null, 7339998, null);
        CustomExerciseInfo customExerciseInfo = weightliftingExercise.getCustomExerciseInfo();
        return new C35239a(c39274g, c39282oM125229d2, c39282oM125229d, (customExerciseInfo != null ? customExerciseInfo.getLinkedExercise() : null) == null ? new C35256i0(new C16214a(AbstractC8693b.m21277k(AbstractC11128h.f35454b1), EnumC39333f.WHITE_50, AbstractC2890e.m8450e().getSh4()), m111646z(null)) : new C35256i0(new C16214a(AbstractC8693b.m21277k(AbstractC11128h.f35454b1), EnumC39333f.WHITE_50, AbstractC2890e.m8450e().getSh4()), m111646z(weightliftingExercise.getCustomExerciseInfo().getLinkedExercise())));
    }

    /* JADX INFO: renamed from: w */
    private final C35256i0 m111644w(WeightliftingExercise weightliftingExercise) {
        return new C35256i0(new C16214a(AbstractC8693b.m21277k(AbstractC11128h.f35404L0), EnumC39333f.BRAND_WHITE, AbstractC2890e.m8450e().getSh4()), new C16214a(AbstractC8693b.m21278l(weightliftingExercise.getTranslatedEquipment()), EnumC39333f.WHITE_70, AbstractC2890e.m8450e().getB2()));
    }

    /* JADX INFO: renamed from: y */
    private final C35256i0 m111645y(WeightliftingExercise weightliftingExercise) {
        C16214a c16214a = new C16214a(AbstractC8693b.m21278l(weightliftingExercise.getName()), EnumC39333f.BRAND_WHITE, AbstractC2890e.m8450e().getT4());
        String strM74110N0 = AbstractC25265s.m74110N0(weightliftingExercise.getInstructions(), " ", null, null, null, 62);
        if (strM74110N0.length() == 0) {
            strM74110N0 = null;
        }
        return new C35256i0(c16214a, strM74110N0 != null ? new C16214a(AbstractC8693b.m21278l(strM74110N0), EnumC39333f.WHITE_70, AbstractC2890e.m8450e().getB2()) : new C16214a(AbstractC8693b.m21277k(AbstractC11128h.f35470g1), EnumC39333f.WHITE_70, AbstractC2890e.m8450e().getB2()));
    }

    /* JADX INFO: renamed from: z */
    private final AbstractC27407m.c.a m111646z(LinkedExercise exercise) {
        String exerciseId;
        TextResource textResourceM21277k;
        String name;
        if (exercise == null || (exerciseId = exercise.getExerciseId()) == null) {
            exerciseId = "";
        }
        String str = exerciseId;
        if (exercise == null || (name = exercise.getName()) == null || (textResourceM21277k = AbstractC8693b.m21278l(name)) == null) {
            textResourceM21277k = AbstractC8693b.m21277k(AbstractC11128h.f35476i1);
        }
        TextResource textResource = textResourceM21277k;
        String imageUrl = exercise != null ? exercise.getImageUrl() : null;
        C23454a0 c23454a0 = C23454a0.f92919a;
        return new AbstractC27407m.c.a(str, textResource, imageUrl, null, c23454a0, c23454a0, null, false, 72, null);
    }

    /* JADX INFO: renamed from: F */
    public final void m111647F(InterfaceC35243c.h event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new g(event, null), 3);
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    public /* synthetic */ C35240a0(InterfaceC14515a interfaceC14515a, WeightliftingApi weightliftingApi, InterfaceC34116n interfaceC34116n, C14794i c14794i, C34660d c34660d, FeatureFlagChecker featureFlagChecker, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC14515a, weightliftingApi, interfaceC34116n, c14794i, c34660d, featureFlagChecker, (i13 & 64) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
