package vu2;

import c93.InterfaceC4351m;
import com.whoop.weightlifting.data.WeightliftingApi;
import com.whoop.weightlifting.data.dto.ExerciseDetailsModel;
import com.whoop.whoopaction.domain.models.Action;
import cu2.EnumC11122b;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fi0.InterfaceC14515a;
import io.getstream.chat.android.p226ui.common.utils.AttachmentConstants;
import l83.C23454a0;
import od1.InterfaceC27844g;
import p000.AbstractC11266d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22656a;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import qw2.AbstractC30694b;
import qw2.C30695c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import wm0.C37378a;

/* JADX INFO: renamed from: vu2.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010 \u001a\u00020\u001f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b \u0010!J#\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, m65681d2 = {"Lvu2/d;", "Lod1/g;", "Lvu2/a;", "Lvu2/c;", "Lfi0/a;", "baseAnalytics", "Lcom/whoop/weightlifting/data/WeightliftingApi;", "api", "Lqw2/c;", "actionInteractor", "Lwm0/a;", "scopeCoordinator", "Ltr2/n;", "logger", "<init>", "(Lfi0/a;Lcom/whoop/weightlifting/data/WeightliftingApi;Lqw2/c;Lwm0/a;Ltr2/n;)V", "", "exerciseId", "Lcu2/b;", "entryPointType", "analyticsEntryPoint", "Lec3/l;", "Lvu2/f;", "p", "(Ljava/lang/String;Lcu2/b;Ljava/lang/String;)Lec3/l;", "m", "(Ljava/lang/String;)Lec3/l;", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "q", "(Lcom/whoop/whoopaction/domain/models/Action;)Lec3/l;", "", "n", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lfi0/a;", "b", "Lcom/whoop/weightlifting/data/WeightliftingApi;", "c", "Lqw2/c;", "d", "Lwm0/a;", "e", "Ltr2/n;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36523d implements InterfaceC27844g<AbstractC36520a, C36522c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a baseAnalytics;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final WeightliftingApi api;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C30695c actionInteractor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C37378a scopeCoordinator;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: vu2.d$a */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.details.domain.ExerciseDetailsV2Interactor$deleteExerciseInternalActions$1", m100430f = "ExerciseDetailsV2Interactor.kt", m100431l = {84, 88, 85}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lvu2/f;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f156254E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ C36523d f156255F;

        /* JADX INFO: renamed from: w */
        Object f156256w;

        /* JADX INFO: renamed from: x */
        Object f156257x;

        /* JADX INFO: renamed from: y */
        int f156258y;

        /* JADX INFO: renamed from: z */
        private /* synthetic */ Object f156259z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, C36523d c36523d, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f156254E = str;
            this.f156255F = c36523d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = new a(this.f156254E, this.f156255F, interfaceC30057d);
            aVar.f156259z = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0075, code lost:
        
            if (r0.emit(r4, r8) == r1) goto L21;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = r8.f156259z
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r8.f156258y
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L33
                if (r2 == r5) goto L2f
                if (r2 == r4) goto L20
                if (r2 != r3) goto L18
                p505ts.AbstractC34132o.m107864I(r9)
                goto L78
            L18:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L20:
                java.lang.Object r0 = r8.f156257x
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r2 = r8.f156256w
                ec3.m r2 = (ec3.InterfaceC13062m) r2
                p505ts.AbstractC34132o.m107864I(r9)
                r7 = r2
                r2 = r0
                r0 = r7
                goto L5e
            L2f:
                p505ts.AbstractC34132o.m107864I(r9)
                goto L48
            L33:
                p505ts.AbstractC34132o.m107864I(r9)
                vu2.f$b r9 = new vu2.f$b
                java.lang.String r2 = r8.f156254E
                r9.<init>(r2)
                r8.f156259z = r0
                r8.f156258y = r5
                java.lang.Object r9 = r0.emit(r9, r8)
                if (r9 != r1) goto L48
                goto L77
            L48:
                java.lang.String r9 = r8.f156254E
                vu2.d r2 = r8.f156255F
                r8.f156259z = r6
                r8.f156256w = r0
                r8.f156257x = r9
                r8.f156258y = r4
                java.lang.Object r2 = vu2.C36523d.m117037d(r2, r9, r8)
                if (r2 != r1) goto L5b
                goto L77
            L5b:
                r7 = r2
                r2 = r9
                r9 = r7
            L5e:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                vu2.f$a r4 = new vu2.f$a
                r4.<init>(r2, r9)
                r8.f156259z = r6
                r8.f156256w = r6
                r8.f156257x = r6
                r8.f156258y = r3
                java.lang.Object r9 = r0.emit(r4, r8)
                if (r9 != r1) goto L78
            L77:
                return r1
            L78:
                l83.a0 r9 = l83.C23454a0.f92919a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: vu2.C36523d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: vu2.d$b */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.details.domain.ExerciseDetailsV2Interactor", m100430f = "ExerciseDetailsV2Interactor.kt", m100431l = {114}, m100432m = "executeDeleteCustomExercise", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f156260w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f156261x;

        /* JADX INFO: renamed from: z */
        int f156263z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f156261x = obj;
            this.f156263z |= Integer.MIN_VALUE;
            return C36523d.this.m117047n(null, this);
        }
    }

    /* JADX INFO: renamed from: vu2.d$c */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.details.domain.ExerciseDetailsV2Interactor$executeDeleteCustomExercise$2", m100430f = "ExerciseDetailsV2Interactor.kt", m100431l = {115}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f156264w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f156266y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, InterfaceC30057d<? super c> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f156266y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C36523d.this.new c(this.f156266y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f156264w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            WeightliftingApi weightliftingApi = C36523d.this.api;
            String str = this.f156266y;
            this.f156264w = 1;
            Object objDeleteCustomExercise = weightliftingApi.deleteCustomExercise(str, this);
            return objDeleteCustomExercise == enumC31071a ? enumC31071a : objDeleteCustomExercise;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((c) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: vu2.d$d */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.details.domain.ExerciseDetailsV2Interactor$interact$$inlined$flatMapLatest$1", m100430f = "ExerciseDetailsV2Interactor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f156267w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f156268x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f156269y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C36523d f156270z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC30057d interfaceC30057d, C36523d c36523d) {
            super(3, interfaceC30057d);
            this.f156270z = c36523d;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC36520a abstractC36520a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            d dVar = new d(interfaceC30057d, this.f156270z);
            dVar.f156268x = interfaceC13062m;
            dVar.f156269y = abstractC36520a;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l interfaceC13058lM117050q;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f156267w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f156268x;
                AbstractC36520a abstractC36520a = (AbstractC36520a) this.f156269y;
                if (abstractC36520a instanceof AbstractC36520a.b) {
                    AbstractC36520a.b bVar = (AbstractC36520a.b) abstractC36520a;
                    interfaceC13058lM117050q = this.f156270z.m117049p(bVar.getExerciseId(), bVar.getEntryPointType(), bVar.getAnalyticsEntryPoint());
                } else if (abstractC36520a instanceof AbstractC36520a.a) {
                    interfaceC13058lM117050q = this.f156270z.m117046m(((AbstractC36520a.a) abstractC36520a).getExerciseId());
                } else {
                    if (!(abstractC36520a instanceof AbstractC36520a.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    interfaceC13058lM117050q = this.f156270z.m117050q(((AbstractC36520a.c) abstractC36520a).getAction());
                }
                this.f156268x = null;
                this.f156269y = null;
                this.f156267w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM117050q, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC36520a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: vu2.d$e */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class e extends C22656a implements Function3 {

        /* JADX INFO: renamed from: w */
        public static final e f156271w = new e();

        public e() {
            super(3, AbstractC36524e.class, "reduceInternal", "reduceInternal(Lcom/whoop/weightlifting/feature/builder/details/domain/ExerciseDetailsV2DomainState;Lcom/whoop/weightlifting/feature/builder/details/domain/ExerciseDetailsV2InternalAction;)Lcom/whoop/weightlifting/feature/builder/details/domain/ExerciseDetailsV2DomainState;", 5);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C36522c c36522c, InterfaceC36525f interfaceC36525f, InterfaceC30057d<? super C36522c> interfaceC30057d) {
            return C36523d.m117048o(c36522c, interfaceC36525f, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: vu2.d$f */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.details.domain.ExerciseDetailsV2Interactor$loadExerciseInternalActions$1", m100430f = "ExerciseDetailsV2Interactor.kt", m100431l = {60, 61, 69, 78, 79}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lvu2/f;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        private /* synthetic */ Object f156272E;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ String f156274G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ EnumC11122b f156275H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ String f156276I;

        /* JADX INFO: renamed from: w */
        Object f156277w;

        /* JADX INFO: renamed from: x */
        Object f156278x;

        /* JADX INFO: renamed from: y */
        Object f156279y;

        /* JADX INFO: renamed from: z */
        int f156280z;

        /* JADX INFO: renamed from: vu2.d$f$a */
        @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.details.domain.ExerciseDetailsV2Interactor$loadExerciseInternalActions$1$response$1", m100430f = "ExerciseDetailsV2Interactor.kt", m100431l = {62}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f156281w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C36523d f156282x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f156283y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C36523d c36523d, String str, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f156282x = c36523d;
                this.f156283y = str;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f156282x, this.f156283y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f156281w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                WeightliftingApi weightliftingApi = this.f156282x.api;
                String str = this.f156283y;
                this.f156281w = 1;
                Object exerciseDetails = weightliftingApi.getExerciseDetails(str, this);
                return exerciseDetails == enumC31071a ? enumC31071a : exerciseDetails;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super ExerciseDetailsModel> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, EnumC11122b enumC11122b, String str2, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f156274G = str;
            this.f156275H = enumC11122b;
            this.f156276I = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            f fVar = C36523d.this.new f(this.f156274G, this.f156275H, this.f156276I, interfaceC30057d);
            fVar.f156272E = obj;
            return fVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x007e  */
        /* JADX WARN: Code duplicated, block: B:27:0x00bb  */
        /* JADX WARN: Code duplicated, block: B:29:0x00bf  */
        /* JADX WARN: Code duplicated, block: B:32:0x00ce  */
        /* JADX WARN: Code duplicated, block: B:34:0x00d2  */
        /* JADX WARN: Code duplicated, block: B:39:0x00e4  */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00b8, code lost:
        
            if (r8.emit(r3, r14) == r9) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00cb, code lost:
        
            if (r8.emit(r0, r14) == r9) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00de, code lost:
        
            if (r8.emit(r0, r14) == r9) goto L36;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 234
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: vu2.C36523d.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: vu2.d$g */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.details.domain.ExerciseDetailsV2Interactor$perform1RMInternalActions$1", m100430f = "ExerciseDetailsV2Interactor.kt", m100431l = {94, 95}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lvu2/f;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f156284w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f156285x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Action f156287z;

        /* JADX INFO: renamed from: vu2.d$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C36523d f156288w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC13062m f156289x;

            /* JADX INFO: renamed from: vu2.d$g$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.details.domain.ExerciseDetailsV2Interactor$perform1RMInternalActions$1$1", m100430f = "ExerciseDetailsV2Interactor.kt", m100431l = {AttachmentConstants.MAX_UPLOAD_SIZE_IN_MB, 101, 105}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42567a extends AbstractC32269c {

                /* JADX INFO: renamed from: w */
                Object f156290w;

                /* JADX INFO: renamed from: x */
                /* synthetic */ Object f156291x;

                /* JADX INFO: renamed from: y */
                final /* synthetic */ a<T> f156292y;

                /* JADX INFO: renamed from: z */
                int f156293z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C42567a(a<? super T> aVar, InterfaceC30057d<? super C42567a> interfaceC30057d) {
                    super(interfaceC30057d);
                    this.f156292y = aVar;
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f156291x = obj;
                    this.f156293z |= Integer.MIN_VALUE;
                    return this.f156292y.emit(null, this);
                }
            }

            public a(C36523d c36523d, InterfaceC13062m interfaceC13062m) {
                this.f156288w = c36523d;
                this.f156289x = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC30694b abstractC30694b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                C42567a c42567a;
                InterfaceC13062m interfaceC13062m;
                InterfaceC36525f.g gVar;
                if (interfaceC30057d instanceof C42567a) {
                    c42567a = (C42567a) interfaceC30057d;
                    int i13 = c42567a.f156293z;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42567a.f156293z = i13 - Integer.MIN_VALUE;
                    } else {
                        c42567a = new C42567a(this, interfaceC30057d);
                    }
                } else {
                    c42567a = new C42567a(this, interfaceC30057d);
                }
                Object obj = c42567a.f156291x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42567a.f156293z;
                C23454a0 c23454a0 = C23454a0.f92919a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        AbstractC34132o.m107864I(obj);
                        interfaceC13062m = this.f156289x;
                        gVar = new InterfaceC36525f.g(true);
                        c42567a.f156290w = null;
                        c42567a.f156293z = 2;
                        if (interfaceC13062m.emit(gVar, c42567a) != enumC31071a) {
                            return enumC31071a;
                        }
                    } else {
                        if (i14 != 2) {
                            if (i14 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC34132o.m107864I(obj);
                            return c23454a0;
                        }
                        AbstractC34132o.m107864I(obj);
                    }
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj);
                if (!(abstractC30694b instanceof AbstractC30694b.n) && !(abstractC30694b instanceof AbstractC30694b.f) && !(abstractC30694b instanceof AbstractC30694b.g)) {
                    if (abstractC30694b instanceof AbstractC30694b.a) {
                        this.f156288w.logger.mo85222m(AbstractC11266d.m30461o("Exercise details one rep max update failed: ", ((AbstractC30694b.a) abstractC30694b).getMessage()), new AbstractC30556a.a[0]);
                        InterfaceC13062m interfaceC13062m2 = this.f156289x;
                        InterfaceC36525f.g gVar2 = new InterfaceC36525f.g(false);
                        c42567a.f156290w = null;
                        c42567a.f156293z = 3;
                        if (interfaceC13062m2.emit(gVar2, c42567a) == enumC31071a) {
                        }
                    }
                    return c23454a0;
                }
                C37378a c37378a = this.f156288w.scopeCoordinator;
                String strM119658a = C37378a.INSTANCE.m119658a(null);
                c42567a.f156290w = null;
                c42567a.f156293z = 1;
                if (c37378a.m119657b(strM119658a, c42567a) != enumC31071a) {
                    interfaceC13062m = this.f156289x;
                    gVar = new InterfaceC36525f.g(true);
                    c42567a.f156290w = null;
                    c42567a.f156293z = 2;
                    if (interfaceC13062m.emit(gVar, c42567a) != enumC31071a) {
                        return c23454a0;
                    }
                }
                return enumC31071a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Action action, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f156287z = action;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            g gVar = C36523d.this.new g(this.f156287z, interfaceC30057d);
            gVar.f156285x = obj;
            return gVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
        
            if (r7.collect(r2, r6) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f156285x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r6.f156284w
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L20
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                p505ts.AbstractC34132o.m107864I(r7)
                goto L5a
            L14:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1c:
                p505ts.AbstractC34132o.m107864I(r7)
                goto L30
            L20:
                p505ts.AbstractC34132o.m107864I(r7)
                vu2.f$h r7 = vu2.InterfaceC36525f.h.f156306a
                r6.f156285x = r0
                r6.f156284w = r4
                java.lang.Object r7 = r0.emit(r7, r6)
                if (r7 != r1) goto L30
                goto L59
            L30:
                vu2.d r7 = vu2.C36523d.this
                qw2.c r7 = vu2.C36523d.m117038e(r7)
                qw2.f r2 = new qw2.f
                com.whoop.whoopaction.domain.models.Action r4 = r6.f156287z
                r2.<init>(r4)
                a6.u r4 = new a6.u
                r5 = 1
                r4.<init>(r2, r5)
                ec3.l r7 = r7.interact(r4)
                vu2.d$g$a r2 = new vu2.d$g$a
                vu2.d r4 = vu2.C36523d.this
                r2.<init>(r4, r0)
                r0 = 0
                r6.f156285x = r0
                r6.f156284w = r3
                java.lang.Object r7 = r7.collect(r2, r6)
                if (r7 != r1) goto L5a
            L59:
                return r1
            L5a:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: vu2.C36523d.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C36523d(InterfaceC14515a baseAnalytics, WeightliftingApi api, C30695c actionInteractor, C37378a scopeCoordinator, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(baseAnalytics, "baseAnalytics");
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(actionInteractor, "actionInteractor");
        AbstractC22676k.m65750j(scopeCoordinator, "scopeCoordinator");
        AbstractC22676k.m65750j(logger, "logger");
        this.baseAnalytics = baseAnalytics;
        this.api = api;
        this.actionInteractor = actionInteractor;
        this.scopeCoordinator = scopeCoordinator;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final InterfaceC13058l m117046m(String exerciseId) {
        return new C13084s1(new a(exerciseId, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: n */
    public final Object m117047n(String str, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f156263z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f156263z = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        b bVar2 = bVar;
        Object objM108729b = bVar2.f156261x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar2.f156263z;
        boolean z4 = true;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            String strM30461o = AbstractC11266d.m30461o("Failed to delete custom exercise ", str);
            c cVar = new c(str, null);
            bVar2.f156260w = null;
            bVar2.f156263z = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, strM30461o, cVar, bVar2, 2, null);
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
        if (!(interfaceC34385a instanceof InterfaceC34385a.c)) {
            z4 = false;
            if (!(interfaceC34385a instanceof InterfaceC34385a.b.a) && !(interfaceC34385a instanceof InterfaceC34385a.b.C42432b)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return Boolean.valueOf(z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ Object m117048o(C36522c c36522c, InterfaceC36525f interfaceC36525f, InterfaceC30057d interfaceC30057d) {
        return AbstractC36524e.m117055c(c36522c, interfaceC36525f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final InterfaceC13058l m117049p(String exerciseId, EnumC11122b entryPointType, String analyticsEntryPoint) {
        return new C13084s1(new f(exerciseId, entryPointType, analyticsEntryPoint, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final InterfaceC13058l m117050q(Action action) {
        return new C13084s1(new g(action, null));
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36610t(new C13060l1(AbstractC36524e.f156294a, AbstractC13091v.m36590P(upstream, new d(null, this)), e.f156271w));
    }
}
