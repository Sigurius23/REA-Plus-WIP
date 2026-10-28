package dw0;

import bw0.C3679b;
import bw0.InterfaceC3678a;
import com.whoop.core.details.network.model.ActivityScoreTypeResponse;
import com.whoop.core.details.network.model.CoreDetailsModel;
import com.whoop.core.details.network.model.CoreDetailsModelState;
import com.whoop.core.details.network.model.DetailsEditComponent;
import com.whoop.core.details.network.model.TitleBarModel;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.EntryPointModel;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import hw0.EnumC17696a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import l83.C23465k;
import lf1.C23996f;
import od1.InterfaceC27844g;
import p000.AbstractC11266d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: dw0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ9\u0010#\u001a\u00020\u00032\u0018\u0010\"\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 \u0012\u0004\u0012\u00020\u001b0\u001f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0003H\u0002¢\u0006\u0004\b#\u0010$J/\u0010&\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010%\u001a\u00020!H\u0002¢\u0006\u0004\b&\u0010'J\u001f\u0010*\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J\u001f\u0010-\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010)\u001a\u00020,H\u0002¢\u0006\u0004\b-\u0010.J\u0018\u0010/\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b/\u0010\u0018J\u001f\u00102\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b2\u00103J\u0013\u00105\u001a\u000204*\u00020!H\u0002¢\u0006\u0004\b5\u00106J\u0015\u00108\u001a\u0004\u0018\u000107*\u00020\u0003H\u0002¢\u0006\u0004\b8\u00109J\u0013\u0010;\u001a\u00020:*\u00020!H\u0002¢\u0006\u0004\b;\u0010<J6\u0010A\u001a\b\u0012\u0004\u0012\u00020@0?2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010=\u001a\u00020\u00122\u0006\u0010>\u001a\u00020\u0019H\u0082@¢\u0006\u0004\bA\u0010BJ \u0010C\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u0002H\u0086@¢\u0006\u0004\bC\u0010DJ#\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00030?2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00020?H\u0016¢\u0006\u0004\bF\u0010GR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010O¨\u0006P"}, m65681d2 = {"Ldw0/d;", "Lod1/g;", "Ldw0/b;", "Ldw0/c;", "Lbw0/b;", "coreDetailsAnalyticsHelper", "Ldw0/e;", "coreDetailsNetworkMapper", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Llf1/f;", "experimentHelper", "<init>", "(Lbw0/b;Ldw0/e;Lcom/whoop/data/repositories/FeatureFlagChecker;Llf1/f;)V", "", "index", "p", "(Ldw0/c;I)Ldw0/c;", "", "show", "q", "(Ldw0/c;Z)Ldw0/c;", "domainState", "r", "(Ldw0/c;Lq83/d;)Ljava/lang/Object;", "", "activityId", "Lhw0/a;", "activityType", "k", "(Ljava/lang/String;Lhw0/a;Ldw0/c;Lq83/d;)Ljava/lang/Object;", "Ll83/k;", "Lu02/a;", "Lcom/whoop/core/details/network/model/CoreDetailsModelState;", "result", "n", "(Ll83/k;Ljava/lang/String;Ldw0/c;)Ldw0/c;", "coreDetailsModelState", "l", "(Ljava/lang/String;Lhw0/a;Ldw0/c;Lcom/whoop/core/details/network/model/CoreDetailsModelState;)Ldw0/c;", "Ldw0/b$c;", "domainAction", "v", "(Ldw0/c;Ldw0/b$c;)Ldw0/c;", "Ldw0/b$i;", "m", "(Ldw0/c;Ldw0/b$i;)Ldw0/c;", "o", "Ldw0/h;", "errorCloseEvent", "s", "(Ldw0/c;Ldw0/h;)Ldw0/c;", "Lcom/whoop/core/details/network/model/DetailsEditComponent;", "i", "(Lcom/whoop/core/details/network/model/CoreDetailsModelState;)Lcom/whoop/core/details/network/model/DetailsEditComponent;", "Lcom/whoop/design/models/items/EntryPointModel;", "u", "(Ldw0/c;)Lcom/whoop/design/models/items/EntryPointModel;", "Lcom/whoop/core/details/network/model/TitleBarModel;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lcom/whoop/core/details/network/model/CoreDetailsModelState;)Lcom/whoop/core/details/network/model/TitleBarModel;", "newHome", "entryPoint", "Lec3/l;", "Ldw0/k;", "j", "(Ljava/lang/String;Lhw0/a;ZLjava/lang/String;Lq83/d;)Ljava/lang/Object;", "t", "(Ldw0/c;Ldw0/b;Lq83/d;)Ljava/lang/Object;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lbw0/b;", "b", "Ldw0/e;", "c", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "d", "Llf1/f;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12405d implements InterfaceC27844g<InterfaceC12403b, C12404c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C3679b coreDetailsAnalyticsHelper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C12406e coreDetailsNetworkMapper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C23996f experimentHelper;

    /* JADX INFO: renamed from: dw0.d$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f42042a;

        static {
            int[] iArr = new int[EnumC17696a.values().length];
            try {
                iArr[EnumC17696a.CARDIO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC17696a.RECOVERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f42042a = iArr;
        }
    }

    /* JADX INFO: renamed from: dw0.d$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.core.details.domain.CoreDetailsInteractor", m100430f = "CoreDetailsInteractor.kt", m100431l = {375}, m100432m = "fetchActivityDetailsCached", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f42043E;

        /* JADX INFO: renamed from: G */
        int f42045G;

        /* JADX INFO: renamed from: w */
        Object f42046w;

        /* JADX INFO: renamed from: x */
        Object f42047x;

        /* JADX INFO: renamed from: y */
        Object f42048y;

        /* JADX INFO: renamed from: z */
        boolean f42049z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f42043E = obj;
            this.f42045G |= Integer.MIN_VALUE;
            return C12405d.this.m34875j(null, null, false, null, this);
        }
    }

    /* JADX INFO: renamed from: dw0.d$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.core.details.domain.CoreDetailsInteractor", m100430f = "CoreDetailsInteractor.kt", m100431l = {167}, m100432m = "getCoreDetails", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f42051F;

        /* JADX INFO: renamed from: w */
        Object f42052w;

        /* JADX INFO: renamed from: x */
        Object f42053x;

        /* JADX INFO: renamed from: y */
        Object f42054y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f42055z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f42055z = obj;
            this.f42051F |= Integer.MIN_VALUE;
            return C12405d.this.m34876k(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: dw0.d$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.core.details.domain.CoreDetailsInteractor", m100430f = "CoreDetailsInteractor.kt", m100431l = {274}, m100432m = "handleDeleteActivity", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f42056w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f42057x;

        /* JADX INFO: renamed from: z */
        int f42059z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f42057x = obj;
            this.f42059z |= Integer.MIN_VALUE;
            return C12405d.this.m34880o(null, this);
        }
    }

    /* JADX INFO: renamed from: dw0.d$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.core.details.domain.CoreDetailsInteractor$interact$$inlined$flatMapLatest$1", m100430f = "CoreDetailsInteractor.kt", m100431l = {191, 189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        Object f42060E;

        /* JADX INFO: renamed from: F */
        Object f42061F;

        /* JADX INFO: renamed from: G */
        Object f42062G;

        /* JADX INFO: renamed from: H */
        int f42063H;

        /* JADX INFO: renamed from: w */
        int f42064w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f42065x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f42066y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C12405d f42067z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC30057d interfaceC30057d, C12405d c12405d) {
            super(3, interfaceC30057d);
            this.f42067z = c12405d;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC12403b interfaceC12403b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            e eVar = new e(interfaceC30057d, this.f42067z);
            eVar.f42065x = interfaceC13062m;
            eVar.f42066y = interfaceC12403b;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x008d, code lost:
        
            if (ec3.AbstractC13091v.m36613w(r1, (ec3.InterfaceC13058l) r13, r12) == r0) goto L18;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r12.f42064w
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L34
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r0 = r12.f42065x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                p505ts.AbstractC34132o.m107864I(r13)
                r11 = r12
                goto L90
            L17:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1f:
                java.lang.Object r1 = r12.f42062G
                dw0.b r1 = (dw0.InterfaceC12403b) r1
                java.lang.Object r1 = r12.f42061F
                q83.d r1 = (q83.InterfaceC30057d) r1
                java.lang.Object r1 = r12.f42060E
                ec3.m r1 = (ec3.InterfaceC13062m) r1
                java.lang.Object r3 = r12.f42065x
                ec3.m r3 = (ec3.InterfaceC13062m) r3
                p505ts.AbstractC34132o.m107864I(r13)
                r11 = r12
                goto L7b
            L34:
                p505ts.AbstractC34132o.m107864I(r13)
                java.lang.Object r13 = r12.f42065x
                r1 = r13
                ec3.m r1 = (ec3.InterfaceC13062m) r1
                java.lang.Object r13 = r12.f42066y
                dw0.b r13 = (dw0.InterfaceC12403b) r13
                boolean r5 = r13 instanceof dw0.InterfaceC12403b.h
                if (r5 == 0) goto L6f
                dw0.d r6 = r12.f42067z
                dw0.b$h r13 = (dw0.InterfaceC12403b.h) r13
                java.lang.String r7 = r13.getActivityId()
                hw0.a r8 = r13.getActivityType()
                boolean r9 = r13.getNewHome()
                java.lang.String r10 = r13.getEntryPoint()
                r12.f42065x = r4
                r12.f42066y = r4
                r12.f42060E = r1
                r12.f42061F = r4
                r12.f42062G = r4
                r13 = 0
                r12.f42063H = r13
                r12.f42064w = r3
                r11 = r12
                java.lang.Object r13 = dw0.C12405d.m34869d(r6, r7, r8, r9, r10, r11)
                if (r13 != r0) goto L7b
                goto L8f
            L6f:
                r11 = r12
                dw0.k$c r3 = new dw0.k$c
                r3.<init>(r13)
                a6.u r13 = new a6.u
                r5 = 1
                r13.<init>(r3, r5)
            L7b:
                ec3.l r13 = (ec3.InterfaceC13058l) r13
                r11.f42065x = r4
                r11.f42066y = r4
                r11.f42060E = r4
                r11.f42061F = r4
                r11.f42062G = r4
                r11.f42064w = r2
                java.lang.Object r13 = ec3.AbstractC13091v.m36613w(r1, r13, r12)
                if (r13 != r0) goto L90
            L8f:
                return r0
            L90:
                l83.a0 r13 = l83.C23454a0.f92919a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: dw0.C12405d.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (InterfaceC12403b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: dw0.d$f */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.core.details.domain.CoreDetailsInteractor$interact$2", m100430f = "CoreDetailsInteractor.kt", m100431l = {362}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ldw0/c;", "domainState", "Ldw0/k;", "domainAction", "<anonymous>", "(Ldw0/c;Ldw0/k;)Ldw0/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f42068w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f42069x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f42070y;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C12404c c12404c, InterfaceC12412k interfaceC12412k, InterfaceC30057d<? super C12404c> interfaceC30057d) {
            f fVar = C12405d.this.new f(interfaceC30057d);
            fVar.f42069x = c12404c;
            fVar.f42070y = interfaceC12412k;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object objM34888t;
            DetailsEditComponent detailsEditComponentM34874i;
            String activityTypeInternalName;
            C12404c c12404c = (C12404c) this.f42069x;
            InterfaceC12412k interfaceC12412k = (InterfaceC12412k) this.f42070y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f42068w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (interfaceC12412k instanceof InterfaceC12412k.d) {
                    InterfaceC12412k.d dVar = (InterfaceC12412k.d) interfaceC12412k;
                    C12404c c12404cM34877l = C12405d.this.m34877l(dVar.getBaseInfo().getActivityId(), dVar.getBaseInfo().getActivityType(), c12404c, dVar.getData());
                    if (c12404cM34877l.getCoreDetailsState() instanceof InterfaceC12408g.a) {
                        C3679b c3679b = C12405d.this.coreDetailsAnalyticsHelper;
                        String currentWorkoutId = c12404cM34877l.getCurrentWorkoutId();
                        String str = "";
                        if (currentWorkoutId == null) {
                            currentWorkoutId = "";
                        }
                        String strM50565a = EnumC17696a.INSTANCE.m50565a(c12404cM34877l.getCurrentActivityType());
                        String entryPoint = dVar.getBaseInfo().getEntryPoint();
                        CoreDetailsModelState detailsModelState = c12404cM34877l.getDetailsModelState();
                        if (detailsModelState != null && (detailsEditComponentM34874i = C12405d.this.m34874i(detailsModelState)) != null && (activityTypeInternalName = detailsEditComponentM34874i.getActivityTypeInternalName()) != null) {
                            str = activityTypeInternalName;
                        }
                        c3679b.m11414e(new InterfaceC3678a.a(currentWorkoutId, strM50565a, entryPoint, str, dVar.getBaseInfo().getNewHome()));
                    }
                    return c12404cM34877l;
                }
                if (interfaceC12412k instanceof InterfaceC12412k.a) {
                    InterfaceC12412k.a aVar = (InterfaceC12412k.a) interfaceC12412k;
                    return C12404c.m34855b(c12404c, aVar.getBaseInfo().getActivityId(), aVar.getBaseInfo().getActivityType(), null, null, null, new InterfaceC12408g.j(InterfaceC12410i.b.f42209a, EnumC12409h.CLOSE_SCREEN), null, false, false, 0, false, 2012, null);
                }
                if (AbstractC22676k.m65745e(interfaceC12412k, InterfaceC12412k.b.f42215a)) {
                    return C12404c.m34855b(c12404c, null, null, null, null, null, InterfaceC12408g.g.f42199a, null, false, false, 0, false, 2015, null);
                }
                if (!(interfaceC12412k instanceof InterfaceC12412k.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                C12405d c12405d = C12405d.this;
                InterfaceC12403b action = ((InterfaceC12412k.c) interfaceC12412k).getAction();
                this.f42069x = null;
                this.f42070y = null;
                this.f42068w = 1;
                objM34888t = c12405d.m34888t(c12404c, action, this);
                if (objM34888t == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                objM34888t = obj;
            }
            return (C12404c) objM34888t;
        }
    }

    /* JADX INFO: renamed from: dw0.d$g */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.core.details.domain.CoreDetailsInteractor$interact$3", m100430f = "CoreDetailsInteractor.kt", m100431l = {367}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ldw0/c;", "domainState", "Ldw0/b;", "domainAction", "<anonymous>", "(Ldw0/c;Ldw0/b;)Ldw0/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f42072w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f42073x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f42074y;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C12404c c12404c, InterfaceC12403b interfaceC12403b, InterfaceC30057d<? super C12404c> interfaceC30057d) {
            g gVar = C12405d.this.new g(interfaceC30057d);
            gVar.f42073x = c12404c;
            gVar.f42074y = interfaceC12403b;
            return gVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C12404c c12404c = (C12404c) this.f42073x;
            InterfaceC12403b interfaceC12403b = (InterfaceC12403b) this.f42074y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f42072w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C12405d c12405d = C12405d.this;
            this.f42073x = null;
            this.f42074y = null;
            this.f42072w = 1;
            Object objM34888t = c12405d.m34888t(c12404c, interfaceC12403b, this);
            return objM34888t == enumC31071a ? enumC31071a : objM34888t;
        }
    }

    /* JADX INFO: renamed from: dw0.d$h */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.core.details.domain.CoreDetailsInteractor", m100430f = "CoreDetailsInteractor.kt", m100431l = {35, 51, 108, 127, 134, 139}, m100432m = "interactOld", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f42076E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f42077F;

        /* JADX INFO: renamed from: H */
        int f42079H;

        /* JADX INFO: renamed from: w */
        Object f42080w;

        /* JADX INFO: renamed from: x */
        Object f42081x;

        /* JADX INFO: renamed from: y */
        Object f42082y;

        /* JADX INFO: renamed from: z */
        Object f42083z;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f42077F = obj;
            this.f42079H |= Integer.MIN_VALUE;
            return C12405d.this.m34888t(null, null, this);
        }
    }

    public C12405d(C3679b coreDetailsAnalyticsHelper, C12406e coreDetailsNetworkMapper, FeatureFlagChecker featureFlagChecker, C23996f experimentHelper) {
        AbstractC22676k.m65750j(coreDetailsAnalyticsHelper, "coreDetailsAnalyticsHelper");
        AbstractC22676k.m65750j(coreDetailsNetworkMapper, "coreDetailsNetworkMapper");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(experimentHelper, "experimentHelper");
        this.coreDetailsAnalyticsHelper = coreDetailsAnalyticsHelper;
        this.coreDetailsNetworkMapper = coreDetailsNetworkMapper;
        this.featureFlagChecker = featureFlagChecker;
        this.experimentHelper = experimentHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final DetailsEditComponent m34874i(CoreDetailsModelState coreDetailsModelState) {
        if (coreDetailsModelState instanceof CoreDetailsModelState.CoreDetails) {
            return ((CoreDetailsModelState.CoreDetails) coreDetailsModelState).getCoreDetails().getDetailsEditComponents();
        }
        if (coreDetailsModelState instanceof CoreDetailsModelState.RecoveryDetails) {
            return ((CoreDetailsModelState.RecoveryDetails) coreDetailsModelState).getRecoveryDetails().getDetailsEditComponents();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public final Object m34875j(String str, EnumC17696a enumC17696a, boolean z4, String str2, InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f42045G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f42045G = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objM36575A = bVar.f42043E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f42045G;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM36575A);
            int i15 = a.f42042a[enumC17696a.ordinal()];
            if (i15 == 1) {
                return this.coreDetailsNetworkMapper.m34904n(str, enumC17696a, z4, str2);
            }
            if (i15 != 2) {
                throw new IllegalStateException(AbstractC11266d.m30461o("FetchActivityDetails network mapping not supported for ", enumC17696a.name()));
            }
            InterfaceC13058l interfaceC13058lM34903m = this.coreDetailsNetworkMapper.m34903m(str);
            bVar.f42046w = str;
            bVar.f42047x = enumC17696a;
            bVar.f42048y = str2;
            bVar.f42049z = z4;
            bVar.f42045G = 1;
            objM36575A = AbstractC13091v.m36575A(interfaceC13058lM34903m, bVar);
            if (objM36575A == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z4 = bVar.f42049z;
            str2 = (String) bVar.f42048y;
            enumC17696a = (EnumC17696a) bVar.f42047x;
            str = (String) bVar.f42046w;
            AbstractC34132o.m107864I(objM36575A);
        }
        ActivityScoreTypeResponse activityScoreTypeResponse = (ActivityScoreTypeResponse) objM36575A;
        return AbstractC22676k.m65745e(activityScoreTypeResponse != null ? activityScoreTypeResponse.getScoreType() : null, "CARDIO") ? this.coreDetailsNetworkMapper.m34904n(str, enumC17696a, z4, str2) : this.coreDetailsNetworkMapper.m34905o(str, enumC17696a, z4, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    public final Object m34876k(String str, EnumC17696a enumC17696a, C12404c c12404c, InterfaceC30057d<? super C12404c> interfaceC30057d) {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f42051F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f42051F = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object objM34902i = cVar.f42055z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f42051F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM34902i);
            C12406e c12406e = this.coreDetailsNetworkMapper;
            cVar.f42052w = str;
            cVar.f42053x = null;
            cVar.f42054y = c12404c;
            cVar.f42051F = 1;
            objM34902i = c12406e.m34902i(str, enumC17696a, cVar);
            if (objM34902i == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c12404c = (C12404c) cVar.f42054y;
            str = (String) cVar.f42052w;
            AbstractC34132o.m107864I(objM34902i);
        }
        return m34879n((C23465k) objM34902i, str, c12404c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final C12404c m34877l(String activityId, EnumC17696a activityType, C12404c domainState, CoreDetailsModelState coreDetailsModelState) {
        return C12404c.m34855b(domainState, activityId, activityType, null, null, coreDetailsModelState, InterfaceC12408g.a.f42193a, null, false, false, 0, false, 1996, null);
    }

    /* JADX INFO: renamed from: m */
    private final C12404c m34878m(C12404c domainState, InterfaceC12403b.i domainAction) {
        if (domainAction.getForceShowCoreDetails()) {
            return C12404c.m34855b(domainState, null, null, null, null, null, new InterfaceC12408g.f(domainState.getCurrentHeartZoneType()), null, false, false, 0, false, 2015, null);
        }
        if (domainState.getPopUpState() != null) {
            return m34886v(domainState, InterfaceC12403b.l.f42018a);
        }
        if (!(domainState.getCoreDetailsState() instanceof InterfaceC12408g.k)) {
            return C12404c.m34855b(domainState, null, null, null, null, null, InterfaceC12408g.b.f42194a, null, false, false, 0, false, 2015, null);
        }
        InterfaceC12408g.k kVar = (InterfaceC12408g.k) domainState.getCoreDetailsState();
        if (kVar instanceof InterfaceC12408g.j) {
            return m34884s(domainState, ((InterfaceC12408g.j) domainState.getCoreDetailsState()).getErrorCloseEvent());
        }
        return kVar instanceof InterfaceC12408g.m ? m34884s(domainState, ((InterfaceC12408g.m) domainState.getCoreDetailsState()).getErrorCloseEvent()) : domainState;
    }

    /* JADX INFO: renamed from: n */
    private final C12404c m34879n(C23465k result, String activityId, C12404c domainState) {
        Object obj = result.f92937w;
        Object obj2 = result.f92938x;
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) obj;
        if (interfaceC34385a instanceof InterfaceC34385a.b.C42432b) {
            return C12404c.m34855b(domainState, activityId, (EnumC17696a) obj2, null, null, null, new InterfaceC12408g.j(InterfaceC12410i.b.f42209a, EnumC12409h.CLOSE_SCREEN), null, false, false, 0, false, 2012, null);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return C12404c.m34855b(domainState, activityId, (EnumC17696a) obj2, null, null, null, new InterfaceC12408g.m(InterfaceC12410i.b.f42209a, EnumC12409h.CLOSE_SCREEN), null, false, false, 0, false, 2012, null);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return m34877l(activityId, (EnumC17696a) obj2, domainState, (CoreDetailsModelState) ((InterfaceC34385a.c) interfaceC34385a).m108735a());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: o */
    public final Object m34880o(C12404c c12404c, InterfaceC30057d<? super C12404c> interfaceC30057d) {
        d dVar;
        C12404c c12404c2;
        InterfaceC12408g mVar;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f42059z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f42059z = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object objM34900g = dVar.f42057x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar.f42059z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM34900g);
            if (c12404c.getCurrentWorkoutId() == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            C12406e c12406e = this.coreDetailsNetworkMapper;
            String currentWorkoutId = c12404c.getCurrentWorkoutId();
            EnumC17696a currentActivityType = c12404c.getCurrentActivityType();
            dVar.f42056w = c12404c;
            dVar.f42059z = 1;
            objM34900g = c12406e.m34900g(currentWorkoutId, currentActivityType, dVar);
            if (objM34900g == enumC31071a) {
                return enumC31071a;
            }
            c12404c2 = c12404c;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C12404c c12404c3 = (C12404c) dVar.f42056w;
            AbstractC34132o.m107864I(objM34900g);
            c12404c2 = c12404c3;
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM34900g;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            mVar = InterfaceC12408g.c.f42195a;
        } else if (interfaceC34385a instanceof InterfaceC34385a.b.C42432b) {
            mVar = new InterfaceC12408g.j(InterfaceC12410i.a.f42208a, EnumC12409h.CLOSE_MODAL);
        } else {
            if (!(interfaceC34385a instanceof InterfaceC34385a.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            mVar = new InterfaceC12408g.m(InterfaceC12410i.a.f42208a, EnumC12409h.CLOSE_MODAL);
        }
        return C12404c.m34855b(c12404c2, null, null, null, null, null, mVar, null, false, false, 0, false, 2015, null);
    }

    /* JADX INFO: renamed from: p */
    private final C12404c m34881p(C12404c c12404c, int i13) {
        return C12404c.m34855b(c12404c, null, null, null, null, null, null, null, false, false, i13, false, 1535, null);
    }

    /* JADX INFO: renamed from: q */
    private final C12404c m34882q(C12404c c12404c, boolean z4) {
        return C12404c.m34855b(c12404c, null, null, null, null, null, new InterfaceC12408g.e(z4), null, false, false, 0, false, 2015, null);
    }

    /* JADX INFO: renamed from: r */
    private final Object m34883r(C12404c c12404c, InterfaceC30057d<? super C12404c> interfaceC30057d) {
        if (c12404c.getCurrentWorkoutId() != null) {
            return m34876k(c12404c.getCurrentWorkoutId(), c12404c.getCurrentActivityType(), new C12404c(null, null, null, null, null, null, null, false, false, 0, false, 2047, null), interfaceC30057d);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX INFO: renamed from: s */
    private final C12404c m34884s(C12404c domainState, EnumC12409h errorCloseEvent) {
        return errorCloseEvent == EnumC12409h.CLOSE_SCREEN ? C12404c.m34855b(domainState, null, null, null, null, null, InterfaceC12408g.b.f42194a, null, false, false, 0, false, 2015, null) : C12404c.m34855b(domainState, null, null, null, null, null, new InterfaceC12408g.f(domainState.getCurrentHeartZoneType()), null, false, false, 0, false, 2015, null);
    }

    /* JADX INFO: renamed from: u */
    private final EntryPointModel m34885u(C12404c c12404c) {
        CoreDetailsModel coreDetails;
        CoreDetailsModelState detailsModelState = c12404c.getDetailsModelState();
        CoreDetailsModelState.CoreDetails coreDetails2 = detailsModelState instanceof CoreDetailsModelState.CoreDetails ? (CoreDetailsModelState.CoreDetails) detailsModelState : null;
        DesignSystemModel momentEntryPointTile = (coreDetails2 == null || (coreDetails = coreDetails2.getCoreDetails()) == null) ? null : coreDetails.getMomentEntryPointTile();
        EntryPointModel entryPointModel = momentEntryPointTile instanceof EntryPointModel ? (EntryPointModel) momentEntryPointTile : null;
        if (entryPointModel == null || !c12404c.getShowMomentEntryPointTile()) {
            return null;
        }
        return entryPointModel;
    }

    /* JADX INFO: renamed from: v */
    private final C12404c m34886v(C12404c domainState, InterfaceC12403b.c domainAction) {
        TitleBarModel titleBarModelM34887w;
        String titleDisplay;
        DetailsEditComponent detailsEditComponentM34874i;
        String activityTypeInternalName;
        if (domainState.getCoreDetailsState() instanceof InterfaceC12408g.k) {
            throw new IllegalStateException("Cannot launch dialog from error domain state");
        }
        String str = "";
        if (AbstractC22676k.m65745e(domainAction, InterfaceC12403b.l.f42018a)) {
            if (domainState.getPopUpState() instanceof InterfaceC12407f.a) {
                C3679b c3679b = this.coreDetailsAnalyticsHelper;
                String strValueOf = String.valueOf(domainState.getCurrentWorkoutId());
                String strM50565a = EnumC17696a.INSTANCE.m50565a(domainState.getCurrentActivityType());
                CoreDetailsModelState detailsModelState = domainState.getDetailsModelState();
                if (detailsModelState != null && (detailsEditComponentM34874i = m34874i(detailsModelState)) != null && (activityTypeInternalName = detailsEditComponentM34874i.getActivityTypeInternalName()) != null) {
                    str = activityTypeInternalName;
                }
                c3679b.m11414e(new InterfaceC3678a.b(strValueOf, strM50565a, str));
            }
            return C12404c.m34855b(domainState, null, null, null, null, null, null, null, false, false, 0, false, 1983, null);
        }
        if (!(domainAction instanceof InterfaceC12403b.o)) {
            throw new NoWhenBranchMatchedException();
        }
        C3679b c3679b2 = this.coreDetailsAnalyticsHelper;
        String strValueOf2 = String.valueOf(domainState.getCurrentWorkoutId());
        String strM50565a2 = EnumC17696a.INSTANCE.m50565a(domainState.getCurrentActivityType());
        CoreDetailsModelState detailsModelState2 = domainState.getDetailsModelState();
        if (detailsModelState2 != null && (titleBarModelM34887w = m34887w(detailsModelState2)) != null && (titleDisplay = titleBarModelM34887w.getTitleDisplay()) != null) {
            str = titleDisplay;
        }
        c3679b2.m11414e(new InterfaceC3678a.d(strValueOf2, strM50565a2, str));
        return C12404c.m34855b(domainState, null, null, null, null, null, null, InterfaceC12407f.a.f42192a, false, false, 0, false, 1983, null);
    }

    /* JADX INFO: renamed from: w */
    private final TitleBarModel m34887w(CoreDetailsModelState coreDetailsModelState) {
        if (coreDetailsModelState instanceof CoreDetailsModelState.CoreDetails) {
            return ((CoreDetailsModelState.CoreDetails) coreDetailsModelState).getCoreDetails().getTitleBar();
        }
        if (coreDetailsModelState instanceof CoreDetailsModelState.RecoveryDetails) {
            return ((CoreDetailsModelState.RecoveryDetails) coreDetailsModelState).getRecoveryDetails().getTitleBar();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        if (!this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.CACHED_VIEWED_ACTIVITY)) {
            return new C13060l1(new C12404c(null, null, null, null, null, null, null, false, false, 0, false, 2047, null), upstream, new g(null));
        }
        return new C13060l1(new C12404c(null, null, null, null, null, null, null, false, false, 0, false, 2047, null), AbstractC13091v.m36590P(upstream, new e(null, this)), new f(null));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02e3, code lost:
    
        if (r3.m34906p(r2, r4) == r5) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0335, code lost:
    
        if (r3.m34901h(r2, r4) == r5) goto L147;
     */
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m34888t(dw0.C12404c r21, dw0.InterfaceC12403b r22, q83.InterfaceC30057d<? super dw0.C12404c> r23) {
        /*
            Method dump skipped, instruction units count: 996
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dw0.C12405d.m34888t(dw0.c, dw0.b, q83.d):java.lang.Object");
    }
}
