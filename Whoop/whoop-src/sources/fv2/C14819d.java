package fv2;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.weightlifting.data.WeightliftingApi;
import com.whoop.weightlifting.data.domain.ExerciseEquipment;
import com.whoop.weightlifting.data.domain.FilterItem;
import com.whoop.weightlifting.data.domain.FilterOptions;
import com.whoop.weightlifting.data.domain.VolumeInputFormat;
import com.whoop.weightlifting.data.domain.WeightliftingExercise;
import com.whoop.weightlifting.data.dto.CustomExerciseDto;
import com.whoop.weightlifting.data.dto.CustomExerciseDtoKt;
import com.whoop.weightlifting.data.dto.CustomExerciseInfoDto;
import com.whoop.weightlifting.data.dto.ExerciseData;
import com.whoop.weightlifting.data.dto.LinkedExerciseDto;
import com.whoop.weightlifting.data.dto.WeightliftingExerciseDto;
import cv2.C11149b;
import du2.AbstractC12378b;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import fi0.InterfaceC14515a;
import fu2.C14794i;
import fu2.InterfaceC14792g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import live.hms.video.plugin.video.virtualbackground.HmsVirtualBackgroundInterfaceKt;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import od1.InterfaceC27844g;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: fv2.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0003H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015*\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0018\u0010$\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\"H\u0082@¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00192\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u001b\u0010+\u001a\u00020\u0003*\u00020\u00032\u0006\u0010*\u001a\u00020\"H\u0002¢\u0006\u0004\b+\u0010,J\u001d\u0010-\u001a\u00020\u0003*\u00020\u00032\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b-\u0010,J\u001d\u0010/\u001a\u00020\u0003*\u00020\u00032\b\u0010.\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0004\b/\u00100J/\u00103\u001a\u00020\u0003*\u00020\u00032\u0006\u00101\u001a\u00020&2\b\u0010.\u001a\u0004\u0018\u00010&2\b\b\u0002\u00102\u001a\u00020\u0019H\u0002¢\u0006\u0004\b3\u00104J\u001b\u00107\u001a\u000205*\u0002052\u0006\u00106\u001a\u00020\"H\u0002¢\u0006\u0004\b7\u00108J\u001b\u0010:\u001a\u000205*\u0002052\u0006\u00109\u001a\u00020\"H\u0002¢\u0006\u0004\b:\u00108J\u0013\u0010;\u001a\u000205*\u000205H\u0002¢\u0006\u0004\b;\u0010<J\u001b\u0010>\u001a\u000205*\u0002052\u0006\u0010=\u001a\u00020\u0016H\u0002¢\u0006\u0004\b>\u0010?J\u001b\u0010@\u001a\u000205*\u0002052\u0006\u0010=\u001a\u00020\u0016H\u0002¢\u0006\u0004\b@\u0010?J\u001c\u0010B\u001a\u00020\u0003*\u00020\u00032\u0006\u0010A\u001a\u000205H\u0082@¢\u0006\u0004\bB\u0010CJ$\u0010F\u001a\u00020\u0003*\u00020\u00032\u0006\u00101\u001a\u00020D2\u0006\u0010E\u001a\u00020\u0019H\u0082@¢\u0006\u0004\bF\u0010GJ\u0017\u0010H\u001a\u0004\u0018\u00010\"*\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\bH\u0010IR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010Q¨\u0006R"}, m65681d2 = {"Lfv2/d;", "Lod1/g;", "Lfv2/b;", "Lfv2/c;", "Lcom/whoop/weightlifting/data/WeightliftingApi;", "api", "Lfu2/i;", "strengthTrainerInteractor", "Ltr2/n;", "logger", "Lfi0/a;", "baseAnalytics", "<init>", "(Lcom/whoop/weightlifting/data/WeightliftingApi;Lfu2/i;Ltr2/n;Lfi0/a;)V", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "Ll83/a0;", "F", "(Lfv2/c;)V", "", "Lcom/whoop/weightlifting/data/domain/FilterItem;", "q", "(Ljava/util/List;)Ljava/util/List;", "", "v", "(Lq83/d;)Ljava/lang/Object;", "t", "()Z", "Lcom/whoop/weightlifting/data/dto/ExerciseData;", "data", "s", "(Lcom/whoop/weightlifting/data/dto/ExerciseData;)V", "", "exerciseId", "u", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;", "exercise", "I", "(Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;)Z", "linkedExerciseId", "r", "(Lfv2/c;Ljava/lang/String;)Lfv2/c;", "x", "exerciseToLink", "D", "(Lfv2/c;Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;)Lfv2/c;", "customExercise", "preserveUserTextFields", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lfv2/c;Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;Z)Lfv2/c;", "Lfv2/e;", "newName", "C", "(Lfv2/e;Ljava/lang/String;)Lfv2/e;", "newDescription", "B", "A", "(Lfv2/e;)Lfv2/e;", "filterItem", "y", "(Lfv2/e;Lcom/whoop/weightlifting/data/domain/FilterItem;)Lfv2/e;", "z", "loaded", "H", "(Lfv2/c;Lfv2/e;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;", "isEditing", "G", "(Lfv2/c;Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;ZLq83/d;)Ljava/lang/Object;", "E", "(Ljava/lang/String;)Ljava/lang/String;", "a", "Lcom/whoop/weightlifting/data/WeightliftingApi;", "b", "Lfu2/i;", "c", "Ltr2/n;", "d", "Lfi0/a;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14819d implements InterfaceC27844g<AbstractC14817b, C14818c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final WeightliftingApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C14794i strengthTrainerInteractor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC14515a baseAnalytics;

    /* JADX INFO: renamed from: fv2.d$a */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.customexercise.domain.CustomExerciseInteractor", m100430f = "CustomExerciseInteractor.kt", m100431l = {142}, m100432m = "ensureExerciseCached", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f55031E;

        /* JADX INFO: renamed from: w */
        Object f55032w;

        /* JADX INFO: renamed from: x */
        Object f55033x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f55034y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f55034y = obj;
            this.f55031E |= Integer.MIN_VALUE;
            return C14819d.this.m42601u(null, this);
        }
    }

    /* JADX INFO: renamed from: fv2.d$b */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.customexercise.domain.CustomExerciseInteractor$ensureExerciseCached$response$1", m100430f = "CustomExerciseInteractor.kt", m100431l = {146}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f55036w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f55038y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f55038y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C14819d.this.new b(this.f55038y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f55036w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            WeightliftingApi weightliftingApi = C14819d.this.api;
            String str = this.f55038y;
            this.f55036w = 1;
            Object exerciseDetailsById = weightliftingApi.getExerciseDetailsById(str, this);
            return exerciseDetailsById == enumC31071a ? enumC31071a : exerciseDetailsById;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super WeightliftingExerciseDto> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: fv2.d$c */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.customexercise.domain.CustomExerciseInteractor", m100430f = "CustomExerciseInteractor.kt", m100431l = {102}, m100432m = "ensureExerciseListCacheReady", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f55039w;

        /* JADX INFO: renamed from: y */
        int f55041y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f55039w = obj;
            this.f55041y |= Integer.MIN_VALUE;
            return C14819d.this.m42602v(this);
        }
    }

    /* JADX INFO: renamed from: fv2.d$d */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.customexercise.domain.CustomExerciseInteractor$ensureExerciseListCacheReady$result$1", m100430f = "CustomExerciseInteractor.kt", m100431l = {106}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/weightlifting/data/dto/ExerciseData;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f55042w;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C14819d.this.new d(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f55042w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            WeightliftingApi weightliftingApi = C14819d.this.api;
            this.f55042w = 1;
            Object exerciseListV2 = weightliftingApi.getExerciseListV2(this);
            return exerciseListV2 == enumC31071a ? enumC31071a : exerciseListV2;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super ExerciseData> interfaceC30057d) {
            return ((d) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: fv2.d$e */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.customexercise.domain.CustomExerciseInteractor$interact$1", m100430f = "CustomExerciseInteractor.kt", m100431l = {52, 53, 64, 65, HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lfv2/c;", "currentState", "Lfv2/b;", "currentAction", "<anonymous>", "(Lfv2/c;Lfv2/b;)Lfv2/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        Object f55045w;

        /* JADX INFO: renamed from: x */
        int f55046x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f55047y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f55048z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C14818c c14818c, AbstractC14817b abstractC14817b, InterfaceC30057d<? super C14818c> interfaceC30057d) {
            e eVar = C14819d.this.new e(interfaceC30057d);
            eVar.f55047y = c14818c;
            eVar.f55048z = abstractC14817b;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x007d  */
        /* JADX WARN: Code duplicated, block: B:26:0x0084 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:27:0x0086  */
        /* JADX WARN: Code duplicated, block: B:47:0x00de  */
        /* JADX WARN: Code duplicated, block: B:49:0x00e5  */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0094, code lost:
        
            if (r12 == r2) goto L82;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00f3, code lost:
        
            if (r12 == r2) goto L82;
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x0198, code lost:
        
            if (r12 == r2) goto L82;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 445
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: fv2.C14819d.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: fv2.d$f */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.customexercise.domain.CustomExerciseInteractor", m100430f = "CustomExerciseInteractor.kt", m100431l = {270}, m100432m = "updateExerciseCacheWithNewlyAddedCustomExercise", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f55049E;

        /* JADX INFO: renamed from: G */
        int f55051G;

        /* JADX INFO: renamed from: w */
        Object f55052w;

        /* JADX INFO: renamed from: x */
        Object f55053x;

        /* JADX INFO: renamed from: y */
        Object f55054y;

        /* JADX INFO: renamed from: z */
        boolean f55055z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f55049E = obj;
            this.f55051G |= Integer.MIN_VALUE;
            return C14819d.this.m42580G(null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: fv2.d$g */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.customexercise.domain.CustomExerciseInteractor$updateExerciseCacheWithNewlyAddedCustomExercise$listResult$1", m100430f = "CustomExerciseInteractor.kt", m100431l = {274}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/weightlifting/data/dto/ExerciseData;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f55056w;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C14819d.this.new g(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f55056w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            WeightliftingApi weightliftingApi = C14819d.this.api;
            this.f55056w = 1;
            Object exerciseListV2 = weightliftingApi.getExerciseListV2(this);
            return exerciseListV2 == enumC31071a ? enumC31071a : exerciseListV2;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super ExerciseData> interfaceC30057d) {
            return ((g) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: fv2.d$h */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.customexercise.domain.CustomExerciseInteractor", m100430f = "CustomExerciseInteractor.kt", m100431l = {256, 257}, m100432m = "upsertCustomExercise", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f55058E;

        /* JADX INFO: renamed from: F */
        Object f55059F;

        /* JADX INFO: renamed from: G */
        Object f55060G;

        /* JADX INFO: renamed from: H */
        /* synthetic */ Object f55061H;

        /* JADX INFO: renamed from: J */
        int f55063J;

        /* JADX INFO: renamed from: w */
        Object f55064w;

        /* JADX INFO: renamed from: x */
        Object f55065x;

        /* JADX INFO: renamed from: y */
        Object f55066y;

        /* JADX INFO: renamed from: z */
        Object f55067z;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f55061H = obj;
            this.f55063J |= Integer.MIN_VALUE;
            return C14819d.this.m42581H(null, null, this);
        }
    }

    /* JADX INFO: renamed from: fv2.d$i */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.customexercise.domain.CustomExerciseInteractor$upsertCustomExercise$response$1", m100430f = "CustomExerciseInteractor.kt", m100431l = {256}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f55068w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ CustomExerciseDto f55070y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(CustomExerciseDto customExerciseDto, InterfaceC30057d<? super i> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f55070y = customExerciseDto;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C14819d.this.new i(this.f55070y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f55068w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            WeightliftingApi weightliftingApi = C14819d.this.api;
            CustomExerciseDto customExerciseDto = this.f55070y;
            this.f55068w = 1;
            Object objUpsertCustomExercise = weightliftingApi.upsertCustomExercise(customExerciseDto, this);
            return objUpsertCustomExercise == enumC31071a ? enumC31071a : objUpsertCustomExercise;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super WeightliftingExerciseDto> interfaceC30057d) {
            return ((i) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C14819d(WeightliftingApi api, C14794i strengthTrainerInteractor, InterfaceC34116n logger, InterfaceC14515a baseAnalytics) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(strengthTrainerInteractor, "strengthTrainerInteractor");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(baseAnalytics, "baseAnalytics");
        this.api = api;
        this.strengthTrainerInteractor = strengthTrainerInteractor;
        this.logger = logger;
        this.baseAnalytics = baseAnalytics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public final C14820e m42574A(C14820e c14820e) {
        return C14820e.m42608b(c14820e, null, null, null, null, null, null, null, null, 79, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public final C14820e m42575B(C14820e c14820e, String str) {
        return C14820e.m42608b(c14820e, null, str, null, null, null, null, null, null, 253, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public final C14820e m42576C(C14820e c14820e, String str) {
        return C14820e.m42608b(c14820e, str, null, null, null, null, null, null, null, 254, null);
    }

    /* JADX INFO: renamed from: D */
    private final C14818c m42577D(C14818c c14818c, WeightliftingExercise weightliftingExercise) {
        Object next;
        Object next2;
        List<String> muscleGroups;
        ExerciseEquipment equipment;
        C14820e loaded = c14818c.getLoaded();
        Iterator<T> it = c14818c.getLoaded().m42610c().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((FilterItem) next).getKey(), (weightliftingExercise == null || (equipment = weightliftingExercise.getEquipment()) == null) ? null : equipment.getSerializedValue()));
        FilterItem filterItem = (FilterItem) next;
        Iterator<T> it3 = c14818c.getLoaded().m42611d().iterator();
        while (it3.hasNext()) {
            next2 = it3.next();
            if (AbstractC22676k.m65745e(((FilterItem) next2).getKey(), (weightliftingExercise == null || (muscleGroups = weightliftingExercise.getMuscleGroups()) == null) ? null : (String) AbstractC25265s.m74100H0(muscleGroups))) {
                return c14818c.m42571a(C14820e.m42608b(loaded, null, null, null, null, filterItem, (FilterItem) next2, null, weightliftingExercise, 79, null), null);
            }
        }
        next2 = null;
        return c14818c.m42571a(C14820e.m42608b(loaded, null, null, null, null, filterItem, (FilterItem) next2, null, weightliftingExercise, 79, null), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public final String m42578E(String str) {
        String string;
        if (str == null || (string = AbstractC39414r.m125869O0(str).toString()) == null || string.length() <= 0) {
            return null;
        }
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public final void m42579F(C14818c c14818c) {
        String name;
        String key;
        String key2;
        InterfaceC14515a interfaceC14515a = this.baseAnalytics;
        String updatedName = c14818c.getLoaded().getUpdatedName();
        if (updatedName == null) {
            throw new IllegalStateException("Required value was null.");
        }
        WeightliftingExercise linkedExercise = c14818c.getLoaded().getLinkedExercise();
        String str = "";
        if (linkedExercise == null || (name = linkedExercise.getName()) == null) {
            name = "";
        }
        FilterItem selectedEquipment = c14818c.getLoaded().getSelectedEquipment();
        if (selectedEquipment == null || (key = selectedEquipment.getKey()) == null) {
            key = "";
        }
        FilterItem selectedMuscleGroup = c14818c.getLoaded().getSelectedMuscleGroup();
        if (selectedMuscleGroup != null && (key2 = selectedMuscleGroup.getKey()) != null) {
            str = key2;
        }
        AbstractC12378b.m34733c(interfaceC14515a, updatedName, name, key, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:34:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: G */
    public final Object m42580G(C14818c c14818c, WeightliftingExerciseDto weightliftingExerciseDto, boolean z4, InterfaceC30057d<? super C14818c> interfaceC30057d) {
        f fVar;
        WeightliftingExercise weightliftingExercise;
        C14818c c14818c2;
        boolean z13;
        WeightliftingExercise weightliftingExercise2;
        if (interfaceC30057d instanceof f) {
            fVar = (f) interfaceC30057d;
            int i13 = fVar.f55051G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                fVar.f55051G = i13 - Integer.MIN_VALUE;
            } else {
                fVar = new f(interfaceC30057d);
            }
        } else {
            fVar = new f(interfaceC30057d);
        }
        f fVar2 = fVar;
        Object obj = fVar2.f55049E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = fVar2.f55051G;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            weightliftingExercise = weightliftingExerciseDto.toWeightliftingExercise();
            if (this.strengthTrainerInteractor.m42543e() == null || this.strengthTrainerInteractor.m42542d() == null) {
                InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
                InterfaceC34116n interfaceC34116n = this.logger;
                g gVar = new g(null);
                c14818c2 = c14818c;
                fVar2.f55052w = c14818c2;
                fVar2.f55053x = null;
                fVar2.f55054y = weightliftingExercise;
                z13 = z4;
                fVar2.f55055z = z13;
                fVar2.f55051G = 1;
                Object objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to load exercise list for custom exercise screen", gVar, fVar2, 2, null);
                if (objM108729b == enumC31071a) {
                    return enumC31071a;
                }
                weightliftingExercise2 = weightliftingExercise;
                obj = objM108729b;
            } else {
                c14818c2 = c14818c;
                z13 = z4;
            }
            if (!m42582I(weightliftingExercise)) {
                this.strengthTrainerInteractor.m42546j(new InterfaceC14792g.h(weightliftingExercise));
            }
            if (z13) {
                this.strengthTrainerInteractor.m42546j(new InterfaceC14792g.g(weightliftingExercise));
            }
            return C14818c.m42570b(c14818c2, null, new InterfaceC14816a.f(weightliftingExercise.getExerciseId()), 1, null);
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        boolean z14 = fVar2.f55055z;
        weightliftingExercise2 = (WeightliftingExercise) fVar2.f55054y;
        C14818c c14818c3 = (C14818c) fVar2.f55052w;
        AbstractC34132o.m107864I(obj);
        z13 = z14;
        c14818c2 = c14818c3;
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) obj;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            m42599s((ExerciseData) ((InterfaceC34385a.c) interfaceC34385a).m108735a());
        } else {
            if (!(interfaceC34385a instanceof InterfaceC34385a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            this.logger.mo85216g(AbstractC11266d.m30461o("CustomExerciseInteractor: post-save list refresh failed — ", ((InterfaceC34385a.b) interfaceC34385a).getErrorMessage()), new AbstractC30556a.a[0]);
        }
        weightliftingExercise = weightliftingExercise2;
        if (!m42582I(weightliftingExercise)) {
            this.strengthTrainerInteractor.m42546j(new InterfaceC14792g.h(weightliftingExercise));
        }
        if (z13) {
            this.strengthTrainerInteractor.m42546j(new InterfaceC14792g.g(weightliftingExercise));
        }
        return C14818c.m42570b(c14818c2, null, new InterfaceC14816a.f(weightliftingExercise.getExerciseId()), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: H */
    public final Object m42581H(C14818c c14818c, C14820e c14820e, InterfaceC30057d<? super C14818c> interfaceC30057d) {
        h hVar;
        String key;
        String serializedValue;
        C14818c c14818c2;
        C14820e c14820e2;
        Object objM108729b;
        VolumeInputFormat volumeInputFormat;
        String movementPattern;
        String key2;
        if (interfaceC30057d instanceof h) {
            hVar = (h) interfaceC30057d;
            int i13 = hVar.f55063J;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                hVar.f55063J = i13 - Integer.MIN_VALUE;
            } else {
                hVar = new h(interfaceC30057d);
            }
        } else {
            hVar = new h(interfaceC30057d);
        }
        h hVar2 = hVar;
        Object obj = hVar2.f55061H;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = hVar2.f55063J;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            String customExerciseId = c14820e.getCustomExerciseId();
            if (customExerciseId == null) {
                customExerciseId = AbstractC11895b.m31995n("toString(...)");
            }
            WeightliftingExercise linkedExercise = c14820e.getLinkedExercise();
            String exerciseId = linkedExercise != null ? linkedExercise.getExerciseId() : null;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("Failed to ", c14820e.getCustomExerciseId() != null ? "update" : ProfileAnalyticsKt.SAVE, " the custom exercise with ID ", customExerciseId, c14820e.getCustomExerciseId() != null ? AbstractC11266d.m30461o(" and linked exercise ID ", exerciseId) : "");
            sbM32001t.append(".");
            String string = sbM32001t.toString();
            List listM118960L = AbstractC37056f.m118960L(c14820e.getUpdatedDescription());
            FilterItem selectedMuscleGroup = c14820e.getSelectedMuscleGroup();
            if (selectedMuscleGroup == null || (key = selectedMuscleGroup.getKey()) == null) {
                key = "OTHER";
            }
            List listM118958J = AbstractC37056f.m118958J(key);
            String updatedName = c14820e.getUpdatedName();
            if (updatedName == null) {
                throw new IllegalStateException("Required value was null.");
            }
            FilterItem selectedEquipment = c14820e.getSelectedEquipment();
            String str = (selectedEquipment == null || (key2 = selectedEquipment.getKey()) == null) ? "OTHER" : key2;
            WeightliftingExercise linkedExercise2 = c14820e.getLinkedExercise();
            String str2 = (linkedExercise2 == null || (movementPattern = linkedExercise2.getMovementPattern()) == null) ? "OTHER" : movementPattern;
            WeightliftingExercise linkedExercise3 = c14820e.getLinkedExercise();
            if (linkedExercise3 == null || (volumeInputFormat = linkedExercise3.getVolumeInputFormat()) == null || (serializedValue = volumeInputFormat.getSerializedValue()) == null) {
                serializedValue = "REPS";
            }
            CustomExerciseDto customExerciseDto = new CustomExerciseDto(listM118960L, listM118958J, customExerciseId, updatedName, str, str2, serializedValue, exerciseId != null ? new CustomExerciseInfoDto(new LinkedExerciseDto(exerciseId, null, null)) : null);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            i iVar = new i(customExerciseDto, null);
            c14818c2 = c14818c;
            hVar2.f55064w = c14818c2;
            c14820e2 = c14820e;
            hVar2.f55065x = c14820e2;
            hVar2.f55066y = null;
            hVar2.f55067z = null;
            hVar2.f55058E = null;
            hVar2.f55059F = null;
            hVar2.f55063J = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, string, iVar, hVar2, 2, null);
            if (objM108729b != obj2) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        C14820e c14820e3 = (C14820e) hVar2.f55065x;
        C14818c c14818c3 = (C14818c) hVar2.f55064w;
        AbstractC34132o.m107864I(obj);
        c14820e2 = c14820e3;
        objM108729b = obj;
        c14818c2 = c14818c3;
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (!(interfaceC34385a instanceof InterfaceC34385a.c)) {
            if (interfaceC34385a instanceof InterfaceC34385a.b.a) {
                return new C14818c(c14820e2, InterfaceC14816a.d.f55012a);
            }
            if (interfaceC34385a instanceof InterfaceC34385a.b.C42432b) {
                return new C14818c(c14820e2, InterfaceC14816a.c.f55011a);
            }
            throw new NoWhenBranchMatchedException();
        }
        WeightliftingExerciseDto weightliftingExerciseDto = (WeightliftingExerciseDto) ((InterfaceC34385a.c) interfaceC34385a).m108735a();
        boolean z4 = c14820e2.getCustomExerciseId() != null;
        hVar2.f55064w = null;
        hVar2.f55065x = null;
        hVar2.f55066y = null;
        hVar2.f55067z = null;
        hVar2.f55058E = null;
        hVar2.f55059F = null;
        hVar2.f55060G = null;
        hVar2.f55063J = 2;
        Object objM42580G = m42580G(c14818c2, weightliftingExerciseDto, z4, hVar2);
        return objM42580G == obj2 ? obj2 : objM42580G;
    }

    /* JADX INFO: renamed from: I */
    private final boolean m42582I(WeightliftingExercise exercise) {
        Map<String, C11149b> mapM42542d;
        FilterOptions filterOptionsM42543e = this.strengthTrainerInteractor.m42543e();
        if (filterOptionsM42543e == null || (mapM42542d = this.strengthTrainerInteractor.m42542d()) == null) {
            return false;
        }
        LinkedHashMap linkedHashMapM74003l0 = AbstractC25247g0.m74003l0(mapM42542d);
        linkedHashMapM74003l0.put(exercise.getExerciseId(), new C11149b(exercise, false));
        this.strengthTrainerInteractor.m42546j(new InterfaceC14792g.c(linkedHashMapM74003l0, filterOptionsM42543e));
        return true;
    }

    /* JADX INFO: renamed from: q */
    private final List<FilterItem> m42597q(List<FilterItem> list) {
        return AbstractC25265s.m74129g1(AbstractC37056f.m118958J(FilterItem.INSTANCE.emptyFilterItem()), list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public final C14818c m42598r(C14818c c14818c, String str) {
        C11149b c11149b;
        WeightliftingExercise exercise;
        Map<String, C11149b> mapM42542d = this.strengthTrainerInteractor.m42542d();
        return (mapM42542d == null || (c11149b = mapM42542d.get(str)) == null || (exercise = c11149b.getExercise()) == null) ? c14818c : m42577D(c14818c, exercise);
    }

    /* JADX INFO: renamed from: s */
    private final void m42599s(ExerciseData data) {
        List<WeightliftingExerciseDto> exercises = data.getExercises();
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
        for (WeightliftingExercise weightliftingExercise : arrayList) {
            linkedHashMap.put(weightliftingExercise.getExerciseId(), new C11149b(weightliftingExercise, false));
        }
        this.strengthTrainerInteractor.m42546j(new InterfaceC14792g.c(linkedHashMap, CustomExerciseDtoKt.toDomain(data.getFilterOptions())));
    }

    /* JADX INFO: renamed from: t */
    private final boolean m42600t() {
        FilterOptions filterOptionsM42543e = this.strengthTrainerInteractor.m42543e();
        return (filterOptionsM42543e == null || filterOptionsM42543e.getEquipment().isEmpty() || filterOptionsM42543e.getMuscleGroups().isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: u */
    public final Object m42601u(String str, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f55031E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f55031E = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f55034y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f55031E;
        boolean zM42582I = false;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            Map<String, C11149b> mapM42542d = this.strengthTrainerInteractor.m42542d();
            if (mapM42542d != null && mapM42542d.containsKey(str)) {
                return Boolean.TRUE;
            }
            if (this.strengthTrainerInteractor.m42543e() == null || !m42600t()) {
                this.logger.mo85222m(AbstractC11266d.m30461o("CustomExerciseInteractor: missing usable filter cache while loading exercise ", str), new AbstractC30556a.a[0]);
                return Boolean.FALSE;
            }
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            String strM30461o = AbstractC11266d.m30461o("Failed to load exercise details for id ", str);
            b bVar = new b(str, null);
            aVar2.f55032w = str;
            aVar2.f55033x = null;
            aVar2.f55031E = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, strM30461o, bVar, aVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) aVar2.f55032w;
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            zM42582I = m42582I(((WeightliftingExerciseDto) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).toWeightliftingExercise());
        } else {
            if (!(interfaceC34385a instanceof InterfaceC34385a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            this.logger.mo85216g(AbstractC31061c.m95640p("CustomExerciseInteractor: exercise details unavailable for ", str, " — ", ((InterfaceC34385a.b) interfaceC34385a).getErrorMessage()), new AbstractC30556a.a[0]);
        }
        return Boolean.valueOf(zM42582I);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: v */
    public final Object m42602v(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f55041y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f55041y = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        c cVar2 = cVar;
        Object objM108729b = cVar2.f55039w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar2.f55041y;
        boolean z4 = true;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            if (m42600t() && this.strengthTrainerInteractor.m42542d() != null) {
                return Boolean.TRUE;
            }
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            d dVar = new d(null);
            cVar2.f55041y = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to load exercise list for custom exercise screen", dVar, cVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            m42599s((ExerciseData) ((InterfaceC34385a.c) interfaceC34385a).m108735a());
        } else {
            if (!(interfaceC34385a instanceof InterfaceC34385a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            z4 = false;
            this.logger.mo85216g(AbstractC11266d.m30461o("CustomExerciseInteractor: exercise list unavailable — ", ((InterfaceC34385a.b) interfaceC34385a).getErrorMessage()), new AbstractC30556a.a[0]);
        }
        return Boolean.valueOf(z4);
    }

    /* JADX INFO: renamed from: w */
    private final C14818c m42603w(C14818c c14818c, WeightliftingExercise weightliftingExercise, WeightliftingExercise weightliftingExercise2, boolean z4) {
        String name;
        String updatedDescription;
        Object next;
        Object next2;
        C14820e loaded = c14818c.getLoaded();
        if (!z4 || (name = c14818c.getLoaded().getUpdatedName()) == null) {
            name = weightliftingExercise.getName();
        }
        if (!z4 || (updatedDescription = c14818c.getLoaded().getUpdatedDescription()) == null) {
            updatedDescription = (String) AbstractC25265s.m74100H0(weightliftingExercise.getInstructions());
        }
        Iterator<T> it = c14818c.getLoaded().m42610c().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((FilterItem) next).getKey(), weightliftingExercise.getEquipment().getSerializedValue()));
        FilterItem filterItem = (FilterItem) next;
        Iterator<T> it3 = c14818c.getLoaded().m42611d().iterator();
        while (it3.hasNext()) {
            next2 = it3.next();
            if (AbstractC22676k.m65745e(((FilterItem) next2).getKey(), AbstractC25265s.m74100H0(weightliftingExercise.getMuscleGroups()))) {
                return c14818c.m42571a(C14820e.m42608b(loaded, name, updatedDescription, null, null, filterItem, (FilterItem) next2, weightliftingExercise.getExerciseId(), weightliftingExercise2, 12, null), null);
            }
        }
        next2 = null;
        return c14818c.m42571a(C14820e.m42608b(loaded, name, updatedDescription, null, null, filterItem, (FilterItem) next2, weightliftingExercise.getExerciseId(), weightliftingExercise2, 12, null), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public final C14818c m42604x(C14818c c14818c, String str) {
        List<FilterItem> listM42610c;
        List<FilterItem> listM42611d;
        WeightliftingExercise exercise;
        C11149b c11149b;
        List<FilterItem> muscleGroups;
        List<FilterItem> equipment;
        FilterOptions filterOptionsM42543e = this.strengthTrainerInteractor.m42543e();
        if (filterOptionsM42543e == null || (equipment = filterOptionsM42543e.getEquipment()) == null || (listM42610c = m42597q(equipment)) == null) {
            listM42610c = c14818c.getLoaded().m42610c();
        }
        List<FilterItem> list = listM42610c;
        FilterOptions filterOptionsM42543e2 = this.strengthTrainerInteractor.m42543e();
        if (filterOptionsM42543e2 == null || (muscleGroups = filterOptionsM42543e2.getMuscleGroups()) == null || (listM42611d = m42597q(muscleGroups)) == null) {
            listM42611d = c14818c.getLoaded().m42611d();
        }
        List<FilterItem> list2 = listM42611d;
        if ((!list.isEmpty() ? list : null) == null) {
            throw new IllegalStateException("cachedEquipments must not be empty");
        }
        if ((!list2.isEmpty() ? list2 : null) == null) {
            throw new IllegalStateException("cachedMuscleGroups must not be empty");
        }
        Map<String, C11149b> mapM42542d = this.strengthTrainerInteractor.m42542d();
        if (mapM42542d == null) {
            throw new IllegalStateException("Required value was null.");
        }
        WeightliftingExercise exercise2 = (str == null || (c11149b = mapM42542d.get(str)) == null) ? null : c11149b.getExercise();
        C14818c c14818cM42570b = C14818c.m42570b(c14818c, C14820e.m42608b(c14818c.getLoaded(), null, null, list, list2, null, null, null, null, 243, null), null, 2, null);
        if (exercise2 == null || !exercise2.getIsCustomExercise()) {
            exercise = exercise2;
        } else {
            C11149b c11149b2 = mapM42542d.get(exercise2.getLinkedExerciseId());
            exercise = c11149b2 != null ? c11149b2.getExercise() : null;
        }
        if (exercise2 == null) {
            return C14818c.m42570b(c14818cM42570b, null, null, 1, null);
        }
        return exercise2.getIsCustomExercise() ? m42603w(c14818cM42570b, exercise2, exercise, AbstractC22676k.m65745e(c14818cM42570b.getLoaded().getCustomExerciseId(), exercise2.getExerciseId())) : m42577D(c14818cM42570b, exercise);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public final C14820e m42605y(C14820e c14820e, FilterItem filterItem) {
        if (AbstractC22676k.m65745e(filterItem, FilterItem.INSTANCE.emptyFilterItem())) {
            filterItem = null;
        }
        return C14820e.m42608b(c14820e, null, null, null, null, filterItem, null, null, null, 239, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public final C14820e m42606z(C14820e c14820e, FilterItem filterItem) {
        if (AbstractC22676k.m65745e(filterItem, FilterItem.INSTANCE.emptyFilterItem())) {
            filterItem = null;
        }
        return C14820e.m42608b(c14820e, null, null, null, null, null, filterItem, null, null, 223, null);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        List<FilterItem> listM42597q;
        List<FilterItem> muscleGroups;
        List<FilterItem> listM42597q2;
        List<FilterItem> equipment;
        AbstractC22676k.m65750j(upstream, "upstream");
        InterfaceC14816a.b bVar = InterfaceC14816a.b.f55010a;
        C14820e.Companion companion = C14820e.INSTANCE;
        FilterOptions filterOptionsM42543e = this.strengthTrainerInteractor.m42543e();
        List<FilterItem> list = C25271y.f99162w;
        if (filterOptionsM42543e == null || (equipment = filterOptionsM42543e.getEquipment()) == null || (listM42597q = m42597q(equipment)) == null) {
            listM42597q = list;
        }
        FilterOptions filterOptionsM42543e2 = this.strengthTrainerInteractor.m42543e();
        if (filterOptionsM42543e2 != null && (muscleGroups = filterOptionsM42543e2.getMuscleGroups()) != null && (listM42597q2 = m42597q(muscleGroups)) != null) {
            list = listM42597q2;
        }
        return new C13060l1(new C14818c(companion.m42618a(listM42597q, list), bVar), upstream, new e(null));
    }
}
