package qv2;

import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.C1627t0;
import androidx.room.C1780e1;
import ch.C4588i;
import com.whoop.weightlifting.data.WeightliftingApi;
import com.whoop.weightlifting.data.domain.WorkoutTemplate;
import com.whoop.weightlifting.data.domain.WorkoutTemplateOverview;
import com.whoop.weightlifting.data.dto.ShareableWorkoutLinkResponse;
import com.whoop.weightlifting.data.dto.ShareableWorkoutLinkResponseKt;
import com.whoop.weightlifting.data.dto.WorkoutLibraryModel;
import com.whoop.weightlifting.data.dto.WorkoutTemplateOverviewDto;
import du2.AbstractC12378b;
import dw2.C12419a;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fi0.InterfaceC14515a;
import fu2.C14794i;
import fu2.InterfaceC14790e;
import fu2.InterfaceC14792g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import l83.C23465k;
import lf1.C23996f;
import live.hms.video.plugin.video.virtualbackground.HmsVirtualBackgroundInterfaceKt;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import m83.C25271y;
import p218ic.AbstractC18377p0;
import p218ic.C18373n0;
import p249jc.C21596v;
import p380os.C28301a;
import p420qc.C30207q;
import p420qc.C30211u;
import p457rc.C31220c;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pf.C29124b;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import rv2.EnumC31848f;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sc.InterfaceC32351a;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: qv2.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 '2\u00020\u0001:\u00017B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0017\u001a\u00020\u0012*\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0014\u0010\u0019\u001a\u00020\u0012*\u00020\u0012H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u0012*\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u0014J\u0013\u0010\u001c\u001a\u00020\u0012*\u00020\u0012H\u0002¢\u0006\u0004\b\u001c\u0010\u0014J\u0013\u0010\u001d\u001a\u00020\u0012*\u00020\u0012H\u0002¢\u0006\u0004\b\u001d\u0010\u0014J\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0082@¢\u0006\u0004\b!\u0010\"J\u0018\u0010$\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b$\u0010\u001aJ\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%H\u0082@¢\u0006\u0004\b'\u0010(J\u0013\u0010)\u001a\u00020\u0012*\u00020\u0012H\u0002¢\u0006\u0004\b)\u0010\u0014J\u0013\u0010*\u001a\u00020\u0012*\u00020\u0012H\u0002¢\u0006\u0004\b*\u0010\u0014J\u0013\u0010+\u001a\u00020\u0012*\u00020\u0012H\u0002¢\u0006\u0004\b+\u0010\u0014J\u0013\u0010,\u001a\u00020\u0012*\u00020\u0012H\u0002¢\u0006\u0004\b,\u0010\u0014J\u0014\u0010-\u001a\u00020\u0012*\u00020\u0012H\u0082@¢\u0006\u0004\b-\u0010\u001aJ\u001b\u00101\u001a\u000200*\u00020\u00122\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b1\u00102J \u00105\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00122\u0006\u00104\u001a\u000203H\u0086@¢\u0006\u0004\b5\u00106R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010C¨\u0006D"}, m65681d2 = {"Lqv2/e;", "", "Lfu2/i;", "strengthTrainerInteractor", "Lcom/whoop/weightlifting/data/WeightliftingApi;", "weightliftingApi", "Ltr2/n;", "logger", "Lic/p0;", "workManager", "Lfi0/a;", "analytics", "Llf1/f;", "experimentHelper", "Lzr2/a;", "dateAndTimeProvider", "<init>", "(Lfu2/i;Lcom/whoop/weightlifting/data/WeightliftingApi;Ltr2/n;Lic/p0;Lfi0/a;Llf1/f;Lzr2/a;)V", "Lqv2/d;", "j", "(Lqv2/d;)Lqv2/d;", "Lqv2/c$f;", "action", "n", "(Lqv2/d;Lqv2/c$f;)Lqv2/d;", "l", "(Lqv2/d;Lq83/d;)Ljava/lang/Object;", "o", "m", "p", "", "selectedWorkoutKey", "Lqv2/b;", "k", "(Ljava/lang/Long;Lq83/d;)Ljava/lang/Object;", "domainState", "s", "", "Ldw2/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lq83/d;)Ljava/lang/Object;", "r", "u", "v", "g", "i", "", "sharedWorkoutId", "Ll83/a0;", "t", "(Lqv2/d;Ljava/lang/String;)V", "Lqv2/c;", "domainAction", "q", "(Lqv2/d;Lqv2/c;Lq83/d;)Ljava/lang/Object;", "a", "Lfu2/i;", "b", "Lcom/whoop/weightlifting/data/WeightliftingApi;", "c", "Ltr2/n;", "d", "Lic/p0;", "e", "Lfi0/a;", "f", "Llf1/f;", "Lzr2/a;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30664e {

    /* JADX INFO: renamed from: i */
    public static final int f126141i = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C14794i strengthTrainerInteractor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final WeightliftingApi weightliftingApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC18377p0 workManager;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C23996f experimentHelper;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: qv2.e$b */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f126149w;

        /* JADX INFO: renamed from: qv2.e$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f126150w;

            /* JADX INFO: renamed from: qv2.e$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.library.domain.WorkoutLibraryInteractor$getPendingWorkoutsFromWorker$$inlined$map$1$2", m100430f = "WorkoutLibraryInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42243a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f126151E;

                /* JADX INFO: renamed from: F */
                Object f126152F;

                /* JADX INFO: renamed from: G */
                Object f126153G;

                /* JADX INFO: renamed from: H */
                int f126154H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f126155w;

                /* JADX INFO: renamed from: x */
                int f126156x;

                /* JADX INFO: renamed from: y */
                Object f126157y;

                public C42243a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f126155w = obj;
                    this.f126156x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f126150w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42243a c42243a;
                if (interfaceC30057d instanceof C42243a) {
                    c42243a = (C42243a) interfaceC30057d;
                    int i13 = c42243a.f126156x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42243a.f126156x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42243a = new C42243a(interfaceC30057d);
                    }
                } else {
                    c42243a = new C42243a(interfaceC30057d);
                }
                Object obj2 = c42243a.f126155w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42243a.f126156x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f126150w;
                    ArrayList arrayList = new ArrayList();
                    for (T t14 : (List) obj) {
                        if (!((C18373n0) t14).f71521b.m52871a()) {
                            arrayList.add(t14);
                        }
                    }
                    c42243a.f126157y = null;
                    c42243a.f126151E = null;
                    c42243a.f126152F = null;
                    c42243a.f126153G = null;
                    c42243a.f126154H = 0;
                    c42243a.f126156x = 1;
                    if (interfaceC13062m.emit(arrayList, c42243a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l) {
            this.f126149w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f126149w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: qv2.e$c */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.library.domain.WorkoutLibraryInteractor", m100430f = "WorkoutLibraryInteractor.kt", m100431l = {162}, m100432m = "getPendingWorkoutsFromWorker", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f126159w;

        /* JADX INFO: renamed from: y */
        int f126161y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f126159w = obj;
            this.f126161y |= Integer.MIN_VALUE;
            return C30664e.this.m94249h(this);
        }
    }

    /* JADX INFO: renamed from: qv2.e$d */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.library.domain.WorkoutLibraryInteractor", m100430f = "WorkoutLibraryInteractor.kt", m100431l = {209}, m100432m = "getShareableWorkoutLink", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f126162w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f126163x;

        /* JADX INFO: renamed from: z */
        int f126165z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f126163x = obj;
            this.f126165z |= Integer.MIN_VALUE;
            return C30664e.this.m94250i(null, this);
        }
    }

    /* JADX INFO: renamed from: qv2.e$e */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.library.domain.WorkoutLibraryInteractor$getShareableWorkoutLink$shareableWorkoutLinkResponse$1", m100430f = "WorkoutLibraryInteractor.kt", m100431l = {210}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/weightlifting/data/dto/ShareableWorkoutLinkResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f126166w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C30663d f126168y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C30663d c30663d, InterfaceC30057d<? super e> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f126168y = c30663d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C30664e.this.new e(this.f126168y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f126166w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            WeightliftingApi weightliftingApi = C30664e.this.weightliftingApi;
            long jLongValue = this.f126168y.getSelectedWorkoutKey().longValue();
            this.f126166w = 1;
            Object objCreateShareableWorkoutLink = weightliftingApi.createShareableWorkoutLink(jLongValue, this);
            return objCreateShareableWorkoutLink == enumC31071a ? enumC31071a : objCreateShareableWorkoutLink;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super ShareableWorkoutLinkResponse> interfaceC30057d) {
            return ((e) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: qv2.e$f */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.library.domain.WorkoutLibraryInteractor", m100430f = "WorkoutLibraryInteractor.kt", m100431l = {123}, m100432m = "handleDeleteRequest", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f126169w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f126170x;

        /* JADX INFO: renamed from: z */
        int f126172z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f126170x = obj;
            this.f126172z |= Integer.MIN_VALUE;
            return C30664e.this.m94252k(null, this);
        }
    }

    /* JADX INFO: renamed from: qv2.e$g */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.library.domain.WorkoutLibraryInteractor$handleDeleteRequest$response$1", m100430f = "WorkoutLibraryInteractor.kt", m100431l = {124}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f126173w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Long f126175y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Long l7, InterfaceC30057d<? super g> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f126175y = l7;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C30664e.this.new g(this.f126175y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f126173w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            WeightliftingApi weightliftingApi = C30664e.this.weightliftingApi;
            long jLongValue = this.f126175y.longValue();
            this.f126173w = 1;
            Object objDeleteWorkoutTemplate = weightliftingApi.deleteWorkoutTemplate(jLongValue, this);
            return objDeleteWorkoutTemplate == enumC31071a ? enumC31071a : objDeleteWorkoutTemplate;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((g) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: qv2.e$h */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.library.domain.WorkoutLibraryInteractor", m100430f = "WorkoutLibraryInteractor.kt", m100431l = {95}, m100432m = "handleDeletingWorkoutTemplate", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f126176E;

        /* JADX INFO: renamed from: w */
        Object f126177w;

        /* JADX INFO: renamed from: x */
        Object f126178x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f126179y;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f126179y = obj;
            this.f126176E |= Integer.MIN_VALUE;
            return C30664e.this.m94253l(null, this);
        }
    }

    /* JADX INFO: renamed from: qv2.e$i */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.library.domain.WorkoutLibraryInteractor", m100430f = "WorkoutLibraryInteractor.kt", m100431l = {69, HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE, 79, 82}, m100432m = "interact", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f126182F;

        /* JADX INFO: renamed from: w */
        Object f126183w;

        /* JADX INFO: renamed from: x */
        Object f126184x;

        /* JADX INFO: renamed from: y */
        Object f126185y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f126186z;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f126186z = obj;
            this.f126182F |= Integer.MIN_VALUE;
            return C30664e.this.m94263q(null, null, this);
        }
    }

    /* JADX INFO: renamed from: qv2.e$j */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.library.domain.WorkoutLibraryInteractor", m100430f = "WorkoutLibraryInteractor.kt", m100431l = {135, 140, 148}, m100432m = "refresh", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f126187E;

        /* JADX INFO: renamed from: F */
        Object f126188F;

        /* JADX INFO: renamed from: G */
        Object f126189G;

        /* JADX INFO: renamed from: H */
        /* synthetic */ Object f126190H;

        /* JADX INFO: renamed from: J */
        int f126192J;

        /* JADX INFO: renamed from: w */
        Object f126193w;

        /* JADX INFO: renamed from: x */
        Object f126194x;

        /* JADX INFO: renamed from: y */
        Object f126195y;

        /* JADX INFO: renamed from: z */
        Object f126196z;

        public j(InterfaceC30057d<? super j> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f126190H = obj;
            this.f126192J |= Integer.MIN_VALUE;
            return C30664e.this.m94259s(null, this);
        }
    }

    /* JADX INFO: renamed from: qv2.e$k */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.library.domain.WorkoutLibraryInteractor$refresh$response$1", m100430f = "WorkoutLibraryInteractor.kt", m100431l = {136}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f126197w;

        public k(InterfaceC30057d<? super k> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C30664e.this.new k(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f126197w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            WeightliftingApi weightliftingApi = C30664e.this.weightliftingApi;
            this.f126197w = 1;
            Object workoutLibraryV3 = weightliftingApi.getWorkoutLibraryV3(this);
            return workoutLibraryV3 == enumC31071a ? enumC31071a : workoutLibraryV3;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super WorkoutLibraryModel> interfaceC30057d) {
            return ((k) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C30664e(C14794i strengthTrainerInteractor, WeightliftingApi weightliftingApi, InterfaceC34116n logger, AbstractC18377p0 workManager, InterfaceC14515a analytics, C23996f experimentHelper, InterfaceC41070a dateAndTimeProvider) {
        AbstractC22676k.m65750j(strengthTrainerInteractor, "strengthTrainerInteractor");
        AbstractC22676k.m65750j(weightliftingApi, "weightliftingApi");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(workManager, "workManager");
        AbstractC22676k.m65750j(analytics, "analytics");
        AbstractC22676k.m65750j(experimentHelper, "experimentHelper");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        this.strengthTrainerInteractor = strengthTrainerInteractor;
        this.weightliftingApi = weightliftingApi;
        this.logger = logger;
        this.workManager = workManager;
        this.analytics = analytics;
        this.experimentHelper = experimentHelper;
        this.dateAndTimeProvider = dateAndTimeProvider;
    }

    /* JADX INFO: renamed from: g */
    private final C30663d m94248g(C30663d c30663d) {
        return C30663d.m94231b(c30663d, null, null, null, null, null, null, false, null, false, 463, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public final Object m94249h(InterfaceC30057d<? super List<C12419a>> interfaceC30057d) {
        c cVar;
        Object next;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f126161y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f126161y = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object objM36577C = cVar.f126159w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f126161y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM36577C);
            C21596v c21596v = (C21596v) this.workManager;
            C30211u c30211uMo5521h = c21596v.f82807c.mo5521h();
            c30211uMo5521h.getClass();
            C1780e1 c1780e1M5455b = c30211uMo5521h.f123665a.getInvalidationTracker().m5455b(new String[]{"WorkTag", "WorkProgress", "workspec", "worktag"}, true, new C29124b(c30211uMo5521h, 11));
            C28301a c28301a = C30207q.f123632A;
            InterfaceC32351a interfaceC32351a = c21596v.f82808d;
            Object obj = new Object();
            C1627t0 c1627t0 = new C1627t0();
            c1627t0.m5035b(c1780e1M5455b, new C31220c(interfaceC32351a, obj, c28301a, c1627t0));
            b bVar = new b(new C4588i(AbstractC1613o1.m5011a(c1627t0), 2));
            cVar.f126161y = 1;
            objM36577C = AbstractC13091v.m36577C(bVar, cVar);
            if (objM36577C == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM36577C);
        }
        List list = (List) objM36577C;
        if (list == null) {
            return C25271y.f99162w;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Iterator it3 = ((C18373n0) it.next()).f71522c.iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (!AbstractC39421y.m125930O((String) next, "workoutName=", false));
            String str = (String) next;
            String strM125898q0 = str != null ? AbstractC39414r.m125898q0(str, "workoutName=") : null;
            if (strM125898q0 != null) {
                arrayList.add(strM125898q0);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            arrayList2.add(new C12419a((String) it4.next(), null, 2, null));
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: i */
    public final Object m94250i(C30663d c30663d, InterfaceC30057d<? super C30663d> interfaceC30057d) {
        d dVar;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f126165z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f126165z = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        d dVar2 = dVar;
        Object objM108729b = dVar2.f126163x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar2.f126165z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            if (c30663d.getSelectedWorkoutKey() == null) {
                return m94248g(c30663d);
            }
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            e eVar = new e(c30663d, null);
            dVar2.f126162w = c30663d;
            dVar2.f126165z = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "failed to get shareable workout link", eVar, dVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c30663d = (C30663d) dVar2.f126162w;
            AbstractC34132o.m107864I(objM108729b);
        }
        C30663d c30663d2 = c30663d;
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            InterfaceC34385a.c cVar = (InterfaceC34385a.c) interfaceC34385a;
            m94260t(c30663d2, ((ShareableWorkoutLinkResponse) cVar.m108735a()).getSharedWorkoutId());
            return C30663d.m94231b(c30663d2, null, null, null, null, null, ShareableWorkoutLinkResponseKt.toDomainModel((ShareableWorkoutLinkResponse) cVar.m108735a()), false, null, false, 479, null);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return m94248g(c30663d2);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: j */
    private final C30663d m94251j(C30663d c30663d) {
        return C30663d.m94231b(c30663d, InterfaceC30661b.g.f126114a, null, null, null, null, null, false, null, false, 508, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: k */
    public final Object m94252k(Long l7, InterfaceC30057d<? super InterfaceC30661b> interfaceC30057d) {
        f fVar;
        if (interfaceC30057d instanceof f) {
            fVar = (f) interfaceC30057d;
            int i13 = fVar.f126172z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                fVar.f126172z = i13 - Integer.MIN_VALUE;
            } else {
                fVar = new f(interfaceC30057d);
            }
        } else {
            fVar = new f(interfaceC30057d);
        }
        f fVar2 = fVar;
        Object objM108729b = fVar2.f126170x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = fVar2.f126172z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            if (l7 == null) {
                return new InterfaceC30661b.i(InterfaceC14790e.a.f54891a);
            }
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            g gVar = new g(l7, null);
            fVar2.f126169w = null;
            fVar2.f126172z = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to delete workout template", gVar, fVar2, 2, null);
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
            return InterfaceC30661b.b.f126110a;
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b.C42432b) {
            return new InterfaceC30661b.f(InterfaceC14790e.a.f54891a);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return new InterfaceC30661b.i(InterfaceC14790e.a.f54891a);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: l */
    public final Object m94253l(C30663d c30663d, InterfaceC30057d<? super C30663d> interfaceC30057d) {
        h hVar;
        C30663d c30663d2;
        if (interfaceC30057d instanceof h) {
            hVar = (h) interfaceC30057d;
            int i13 = hVar.f126176E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                hVar.f126176E = i13 - Integer.MIN_VALUE;
            } else {
                hVar = new h(interfaceC30057d);
            }
        } else {
            hVar = new h(interfaceC30057d);
        }
        Object objM94252k = hVar.f126179y;
        Object obj = EnumC31071a.f128113w;
        int i14 = hVar.f126176E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM94252k);
            Long selectedWorkoutKey = c30663d.getSelectedWorkoutKey();
            hVar.f126177w = null;
            c30663d2 = c30663d;
            hVar.f126178x = c30663d2;
            hVar.f126176E = 1;
            objM94252k = m94252k(selectedWorkoutKey, hVar);
            if (objM94252k == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C30663d c30663d3 = (C30663d) hVar.f126178x;
            AbstractC34132o.m107864I(objM94252k);
            c30663d2 = c30663d3;
        }
        return C30663d.m94231b(c30663d2, (InterfaceC30661b) objM94252k, null, null, null, null, null, false, null, false, 510, null);
    }

    /* JADX INFO: renamed from: m */
    private final C30663d m94254m(C30663d c30663d) {
        return C30663d.m94231b(c30663d, InterfaceC30661b.a.f126109a, null, null, null, null, null, false, null, false, 510, null);
    }

    /* JADX INFO: renamed from: n */
    private final C30663d m94255n(C30663d c30663d, AbstractC30662c.f fVar) {
        return C30663d.m94231b(c30663d, null, Long.valueOf(fVar.getWorkoutTemplateKey()), null, null, null, null, false, null, false, 509, null);
    }

    /* JADX INFO: renamed from: o */
    private final C30663d m94256o(C30663d c30663d) {
        return C30663d.m94231b(c30663d, InterfaceC30661b.c.f126111a, null, null, null, null, null, false, null, false, 510, null);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0072  */
    /* JADX INFO: renamed from: p */
    private final C30663d m94257p(C30663d c30663d) {
        String name;
        List<WorkoutTemplateOverviewDto> myWorkoutsList;
        Object next;
        if (c30663d.getSelectedWorkoutKey() != null) {
            C14794i c14794i = this.strengthTrainerInteractor;
            Long selectedWorkoutKey = c30663d.getSelectedWorkoutKey();
            WorkoutLibraryModel workoutLibraryResult = c30663d.getWorkoutLibraryResult();
            if (workoutLibraryResult == null || (myWorkoutsList = workoutLibraryResult.getMyWorkoutsList()) == null) {
                name = "";
            } else {
                List<WorkoutTemplateOverviewDto> list = myWorkoutsList;
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((WorkoutTemplateOverviewDto) it.next()).toWorkoutTemplate());
                }
                Iterator it3 = arrayList.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                    long workoutTemplateKey = ((WorkoutTemplateOverview) next).getWorkoutTemplateKey();
                    Long selectedWorkoutKey2 = c30663d.getSelectedWorkoutKey();
                    if (selectedWorkoutKey2 != null && workoutTemplateKey == selectedWorkoutKey2.longValue()) {
                        break;
                    }
                }
                WorkoutTemplateOverview workoutTemplateOverview = (WorkoutTemplateOverview) next;
                if (workoutTemplateOverview == null || (name = workoutTemplateOverview.getName()) == null) {
                    name = "";
                }
            }
            c14794i.m42546j(new InterfaceC14792g.i(new WorkoutTemplate((Long) null, selectedWorkoutKey, name, C25271y.f99162w, (String) null, 16, (DefaultConstructorMarker) null)));
        }
        return C30663d.m94231b(c30663d, InterfaceC30661b.g.f126114a, c30663d.getSelectedWorkoutKey(), c30663d.getWorkoutLibraryResult(), null, null, null, false, null, false, 504, null);
    }

    /* JADX INFO: renamed from: r */
    private final C30663d m94258r(C30663d c30663d) {
        AbstractC12378b.m34744n(this.analytics, "Start Workout", "Quick Start", null, AbstractC25247g0.m73990Y(new C23465k("workoutId", "noTemplateId"), new C23465k("source", "quick_start")), 4, null);
        C14794i c14794i = this.strengthTrainerInteractor;
        String string = this.dateAndTimeProvider.mo133365d().toString("MMM dd, yyyy");
        AbstractC22676k.m65749i(string, "toString(...)");
        c14794i.m42546j(new InterfaceC14792g.i(new WorkoutTemplate((Long) null, (Long) null, string, C25271y.f99162w, (String) null, 16, (DefaultConstructorMarker) null)));
        return C30663d.m94231b(c30663d, null, null, null, null, null, null, false, null, true, 255, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:35:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: s */
    public final Object m94259s(C30663d c30663d, InterfaceC30057d<? super C30663d> interfaceC30057d) {
        j jVar;
        C30663d c30663d2;
        InterfaceC34385a interfaceC34385a;
        C30663d c30663d3;
        List list;
        EnumC31848f selectedWorkoutLibraryTab;
        WorkoutLibraryModel workoutLibraryModel;
        InterfaceC30661b.g gVar;
        Object objM70811a;
        C30663d c30663d4;
        List list2;
        WorkoutLibraryModel workoutLibraryModel2;
        InterfaceC30661b.g gVar2;
        if (interfaceC30057d instanceof j) {
            jVar = (j) interfaceC30057d;
            int i13 = jVar.f126192J;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                jVar.f126192J = i13 - Integer.MIN_VALUE;
            } else {
                jVar = new j(interfaceC30057d);
            }
        } else {
            jVar = new j(interfaceC30057d);
        }
        j jVar2 = jVar;
        Object objM94249h = jVar2.f126190H;
        Object obj = EnumC31071a.f128113w;
        int i14 = jVar2.f126192J;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM94249h);
            this.strengthTrainerInteractor.m42546j(InterfaceC14792g.e.f54905a);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            k kVar = new k(null);
            jVar2.f126193w = c30663d;
            jVar2.f126192J = 1;
            Object objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to fetch workout library", kVar, jVar2, 2, null);
            if (objM108729b != obj) {
                c30663d2 = c30663d;
                objM94249h = objM108729b;
            }
            return obj;
        }
        if (i14 == 1) {
            C30663d c30663d5 = (C30663d) jVar2.f126193w;
            AbstractC34132o.m107864I(objM94249h);
            c30663d2 = c30663d5;
        } else {
            if (i14 == 2) {
                interfaceC34385a = (InterfaceC34385a) jVar2.f126194x;
                C30663d c30663d6 = (C30663d) jVar2.f126193w;
                AbstractC34132o.m107864I(objM94249h);
                c30663d3 = c30663d6;
                list = (List) objM94249h;
                List<EnumC31848f> listM98992a = EnumC31848f.INSTANCE.m98992a(!list.isEmpty());
                selectedWorkoutLibraryTab = c30663d3.getSelectedWorkoutLibraryTab();
                if (selectedWorkoutLibraryTab != null || !listM98992a.contains(selectedWorkoutLibraryTab)) {
                    selectedWorkoutLibraryTab = null;
                }
                workoutLibraryModel = (WorkoutLibraryModel) ((InterfaceC34385a.c) interfaceC34385a).m108735a();
                gVar = InterfaceC30661b.g.f126114a;
                C23996f c23996f = this.experimentHelper;
                jVar2.f126193w = c30663d3;
                jVar2.f126194x = null;
                jVar2.f126195y = list;
                jVar2.f126196z = null;
                jVar2.f126187E = selectedWorkoutLibraryTab;
                jVar2.f126188F = workoutLibraryModel;
                jVar2.f126189G = gVar;
                jVar2.f126192J = 3;
                objM70811a = c23996f.m70811a(jVar2);
                if (objM70811a != obj) {
                    c30663d4 = c30663d3;
                    list2 = list;
                    workoutLibraryModel2 = workoutLibraryModel;
                    gVar2 = gVar;
                    objM94249h = objM70811a;
                }
                return obj;
            }
            if (i14 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC30661b.g gVar3 = (InterfaceC30661b.g) jVar2.f126189G;
            WorkoutLibraryModel workoutLibraryModel3 = (WorkoutLibraryModel) jVar2.f126188F;
            selectedWorkoutLibraryTab = (EnumC31848f) jVar2.f126187E;
            List list3 = (List) jVar2.f126195y;
            C30663d c30663d7 = (C30663d) jVar2.f126193w;
            AbstractC34132o.m107864I(objM94249h);
            gVar2 = gVar3;
            c30663d4 = c30663d7;
            list2 = list3;
            workoutLibraryModel2 = workoutLibraryModel3;
        }
        return C30663d.m94231b(c30663d4, gVar2, null, workoutLibraryModel2, list2, null, null, ((Boolean) objM94249h).booleanValue(), selectedWorkoutLibraryTab, false, 306, null);
        interfaceC34385a = (InterfaceC34385a) objM94249h;
        if (!(interfaceC34385a instanceof InterfaceC34385a.c)) {
            if (interfaceC34385a instanceof InterfaceC34385a.b.C42432b) {
                return C30663d.m94231b(c30663d2, new InterfaceC30661b.f(InterfaceC14790e.b.f54892a), null, null, null, null, null, false, null, false, 510, null);
            }
            if (interfaceC34385a instanceof InterfaceC34385a.b) {
                return C30663d.m94231b(c30663d2, new InterfaceC30661b.i(InterfaceC14790e.b.f54892a), null, null, null, null, null, false, null, false, 510, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        jVar2.f126193w = c30663d2;
        jVar2.f126194x = interfaceC34385a;
        jVar2.f126192J = 2;
        objM94249h = m94249h(jVar2);
        if (objM94249h != obj) {
            c30663d3 = c30663d2;
            list = (List) objM94249h;
            List<EnumC31848f> listM98992a2 = EnumC31848f.INSTANCE.m98992a(!list.isEmpty());
            selectedWorkoutLibraryTab = c30663d3.getSelectedWorkoutLibraryTab();
            if (selectedWorkoutLibraryTab != null) {
                selectedWorkoutLibraryTab = null;
            } else {
                selectedWorkoutLibraryTab = null;
            }
            workoutLibraryModel = (WorkoutLibraryModel) ((InterfaceC34385a.c) interfaceC34385a).m108735a();
            gVar = InterfaceC30661b.g.f126114a;
            C23996f c23996f2 = this.experimentHelper;
            jVar2.f126193w = c30663d3;
            jVar2.f126194x = null;
            jVar2.f126195y = list;
            jVar2.f126196z = null;
            jVar2.f126187E = selectedWorkoutLibraryTab;
            jVar2.f126188F = workoutLibraryModel;
            jVar2.f126189G = gVar;
            jVar2.f126192J = 3;
            objM70811a = c23996f2.m70811a(jVar2);
            if (objM70811a != obj) {
                c30663d4 = c30663d3;
                list2 = list;
                workoutLibraryModel2 = workoutLibraryModel;
                gVar2 = gVar;
                objM94249h = objM70811a;
                return C30663d.m94231b(c30663d4, gVar2, null, workoutLibraryModel2, list2, null, null, ((Boolean) objM94249h).booleanValue(), selectedWorkoutLibraryTab, false, 306, null);
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: t */
    private final void m94260t(C30663d c30663d, String str) {
        InterfaceC14515a.m41418i(this.analytics, null, "Share", c30663d.getMenuLoadingState() == EnumC30665f.LoadingShareableWorkoutQrCode ? "QR" : "Link", "Workout Builder", null, AbstractC31061c.m95645u("sharedworkoutID", str), 17, null);
    }

    /* JADX INFO: renamed from: u */
    private final C30663d m94261u(C30663d c30663d) {
        return C30663d.m94231b(c30663d, null, null, null, null, EnumC30665f.LoadingShareableWorkoutLink, null, false, null, false, 495, null);
    }

    /* JADX INFO: renamed from: v */
    private final C30663d m94262v(C30663d c30663d) {
        return C30663d.m94231b(c30663d, null, null, null, null, EnumC30665f.LoadingShareableWorkoutQrCode, null, false, null, false, 495, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x010b, code lost:
    
        if (r3 == r5) goto L78;
     */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m94263q(qv2.C30663d r19, qv2.AbstractC30662c r20, q83.InterfaceC30057d<? super qv2.C30663d> r21) {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qv2.C30664e.m94263q(qv2.d, qv2.c, q83.d):java.lang.Object");
    }
}
