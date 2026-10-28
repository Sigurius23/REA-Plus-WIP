package j70;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ch.C4588i;
import ci2.InterfaceC4733b;
import com.whoop.activation.domain.models.ActivationFlowStepModel;
import com.whoop.activation.domain.models.steps.EnterEmailStepModel;
import com.whoop.activation.iajf.domain.SignUpSource;
import com.whoop.activation.view.navigation.ActivationFlowDestination;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import ec3.AbstractC13091v;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13062m;
import f70.C14175d1;
import f70.C14178f;
import f70.C14183h0;
import f70.C14185i0;
import f70.C14187j0;
import f70.C14189k0;
import f70.C14193m0;
import f70.C14201q0;
import f70.C14213w0;
import f70.C14214x;
import f70.C14215x0;
import f70.C14219z0;
import f70.InterfaceC14176e;
import h80.C17003c;
import hf1.InterfaceC17235b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jk0.EnumC21747a;
import jk0.InterfaceC21750d;
import l70.C23389a;
import l83.C23454a0;
import n70.AbstractC26417d;
import n70.C26418e;
import od1.C27847j;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import pj1.C29298b;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: j70.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\u0004\u0018\u00010+*\u00020+H\u0002¢\u0006\u0004\b,\u0010-J.\u00105\u001a\u0002042\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0.2\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020+H\u0082@¢\u0006\u0004\b5\u00106J&\u00107\u001a\u0002042\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0.2\u0006\u00102\u001a\u000201H\u0082@¢\u0006\u0004\b7\u00108J\u0015\u0010:\u001a\u00020(*\u0004\u0018\u000109H\u0002¢\u0006\u0004\b:\u0010;J8\u0010@\u001a\u0002042\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0.2\b\u0010=\u001a\u0004\u0018\u00010<2\u0006\u00102\u001a\u0002012\u0006\u0010?\u001a\u00020>H\u0086@¢\u0006\u0004\b@\u0010AR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010RR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010SR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010TR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010UR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010VR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010WR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u001a\u0010d\u001a\b\u0012\u0004\u0012\u00020a0`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010c¨\u0006e"}, m65681d2 = {"Lj70/d;", "", "Lf70/x0;", "remoteValidationHelper", "Lod1/j;", "pendingUserSessionRepository", "Lf70/z0;", "signUpHelper", "Lf70/w0;", "remoteAccountInfoHelper", "Lf70/d1;", "upcycleUpdateInfoHelper", "Lh80/c;", "analyticsHelper", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "ffChecker", "Lpj1/b;", "healthConnectRepository", "Lf70/m0;", "loginClickedHandler", "Lf70/x;", "emailFirstHelper", "Lci2/b;", "whoopStrapProvider", "Lhf1/b;", "experimentsChecker", "Ll70/a;", "activationExperimentsHelper", "Lbc3/c0;", "coroutineScope", "Lf70/h0;", "iajfEnterEmailHandler", "Lf70/j0;", "iajfSignUpHelper", "Lf70/k0;", "iajfV2BffFetcher", "Lf70/i0;", "iajfSecondBatchMerger", "<init>", "(Lf70/x0;Lod1/j;Lf70/z0;Lf70/w0;Lf70/d1;Lh80/c;Lcom/whoop/data/repositories/FeatureFlagChecker;Lpj1/b;Lf70/m0;Lf70/x;Lci2/b;Lhf1/b;Ll70/a;Lbc3/c0;Lf70/h0;Lf70/j0;Lf70/k0;Lf70/i0;)V", "", "l", "()Z", "Lcom/whoop/navigation/e;", "n", "(Lcom/whoop/navigation/e;)Lcom/whoop/navigation/e;", "Lec3/m;", "Lf70/e;", "collector", "Lf70/e$b;", "prevDomainResult", "destination", "Lf70/f;", "m", "(Lec3/m;Lf70/e$b;Lcom/whoop/navigation/e;Lq83/d;)Ljava/lang/Object;", "j", "(Lec3/m;Lf70/e$b;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/activation/view/navigation/ActivationFlowDestination;", "i", "(Lcom/whoop/activation/view/navigation/ActivationFlowDestination;)Z", "Lcom/whoop/activation/domain/models/ActivationFlowStepModel;", "screenModel", "Lcom/whoop/activation/iajf/domain/SignUpSource;", "signUpSource", "k", "(Lec3/m;Lcom/whoop/activation/domain/models/ActivationFlowStepModel;Lf70/e$b;Lcom/whoop/activation/iajf/domain/SignUpSource;Lq83/d;)Ljava/lang/Object;", "a", "Lf70/x0;", "b", "Lod1/j;", "c", "Lf70/z0;", "d", "Lf70/w0;", "e", "Lf70/d1;", "f", "Lh80/c;", "g", "Lcom/whoop/data/repositories/FeatureFlagChecker;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lpj1/b;", "Lf70/m0;", "Lf70/x;", "Lci2/b;", "Lhf1/b;", "Ll70/a;", "Lbc3/c0;", "o", "Lf70/h0;", "p", "Lf70/j0;", "q", "Lf70/k0;", "r", "Lf70/i0;", "Lec3/f2;", "Ljk0/a;", "s", "Lec3/f2;", "strapBodyStatusFlow", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21392d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C14215x0 remoteValidationHelper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C27847j pendingUserSessionRepository;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C14219z0 signUpHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C14213w0 remoteAccountInfoHelper;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C14175d1 upcycleUpdateInfoHelper;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C17003c analyticsHelper;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final FeatureFlagChecker ffChecker;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C29298b healthConnectRepository;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C14193m0 loginClickedHandler;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C14214x emailFirstHelper;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final InterfaceC17235b experimentsChecker;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final C23389a activationExperimentsHelper;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final C14183h0 iajfEnterEmailHandler;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final C14187j0 iajfSignUpHelper;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final C14189k0 iajfV2BffFetcher;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final C14185i0 iajfSecondBatchMerger;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final InterfaceC13037f2 strapBodyStatusFlow;

    /* JADX INFO: renamed from: j70.d$a */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f81868a;

        static {
            int[] iArr = new int[SignUpSource.values().length];
            try {
                iArr[SignUpSource.IAJF_V2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SignUpSource.ACTIVATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f81868a = iArr;
        }
    }

    /* JADX INFO: renamed from: j70.d$b */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.forward.ScreenSpecificForwardActionHandler$fetchIajfV2SecondBatch$2", m100430f = "ScreenSpecificForwardActionHandler.kt", m100431l = {443}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Lf70/e;", "<anonymous>", "()Lf70/e;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f81869w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC14176e.b f81871y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC14176e.b bVar, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f81871y = bVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C21392d.this.new b(this.f81871y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f81869w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C14189k0 c14189k0 = C21392d.this.iajfV2BffFetcher;
            String value = this.f81871y.getMemberInfo().getAndroidx.core.app.NotificationCompat.CATEGORY_EMAIL java.lang.String().getValue();
            this.f81869w = 1;
            Object objM40502d = c14189k0.m40502d(value, this);
            return objM40502d == enumC31071a ? enumC31071a : objM40502d;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super InterfaceC14176e> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: j70.d$c */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.forward.ScreenSpecificForwardActionHandler", m100430f = "ScreenSpecificForwardActionHandler.kt", m100431l = {116, 118, 124, 139, 140, 147, 149, 150, 161, 170, 171, 185, 186, 205, 238, 252, 254, 288, 297, 325, 349, 350, 371, 373, 383, 385, 391, 392, 402}, m100432m = "handle", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f81872E;

        /* JADX INFO: renamed from: F */
        Object f81873F;

        /* JADX INFO: renamed from: G */
        Object f81874G;

        /* JADX INFO: renamed from: H */
        int f81875H;

        /* JADX INFO: renamed from: I */
        boolean f81876I;

        /* JADX INFO: renamed from: J */
        /* synthetic */ Object f81877J;

        /* JADX INFO: renamed from: L */
        int f81879L;

        /* JADX INFO: renamed from: w */
        Object f81880w;

        /* JADX INFO: renamed from: x */
        Object f81881x;

        /* JADX INFO: renamed from: y */
        Object f81882y;

        /* JADX INFO: renamed from: z */
        Object f81883z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f81877J = obj;
            this.f81879L |= Integer.MIN_VALUE;
            return C21392d.this.m60055k(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: j70.d$d */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.forward.ScreenSpecificForwardActionHandler$handle$2", m100430f = "ScreenSpecificForwardActionHandler.kt", m100431l = {125}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lf70/f;", "<anonymous>", "(Lbc3/c0;)Lf70/f;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f81884w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC14176e.b f81886y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC14176e.b bVar, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f81886y = bVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C21392d.this.new d(this.f81886y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C14178f> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f81884w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C14215x0 c14215x0 = C21392d.this.remoteValidationHelper;
            InterfaceC14176e.b bVar = this.f81886y;
            this.f81884w = 1;
            Object objM40653i = c14215x0.m40653i(bVar, this);
            return objM40653i == enumC31071a ? enumC31071a : objM40653i;
        }
    }

    /* JADX INFO: renamed from: j70.d$e */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.forward.ScreenSpecificForwardActionHandler$handle$3", m100430f = "ScreenSpecificForwardActionHandler.kt", m100431l = {141}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lf70/f;", "<anonymous>", "(Lbc3/c0;)Lf70/f;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f81887w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC14176e.b f81889y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC14176e.b bVar, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f81889y = bVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C21392d.this.new e(this.f81889y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C14178f> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f81887w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C14215x0 c14215x0 = C21392d.this.remoteValidationHelper;
            InterfaceC14176e.b bVar = this.f81889y;
            this.f81887w = 1;
            Object objM40652h = c14215x0.m40652h(bVar, this);
            return objM40652h == enumC31071a ? enumC31071a : objM40652h;
        }
    }

    /* JADX INFO: renamed from: j70.d$f */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.forward.ScreenSpecificForwardActionHandler$handle$4", m100430f = "ScreenSpecificForwardActionHandler.kt", m100431l = {151}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lf70/f;", "<anonymous>", "(Lbc3/c0;)Lf70/f;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f81890w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC14176e.b f81892y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC14176e.b bVar, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f81892y = bVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C21392d.this.new f(this.f81892y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C14178f> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f81890w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C14219z0 c14219z0 = C21392d.this.signUpHelper;
            InterfaceC14176e.b bVar = this.f81892y;
            this.f81890w = 1;
            Object objM40667f = c14219z0.m40667f(bVar, this);
            return objM40667f == enumC31071a ? enumC31071a : objM40667f;
        }
    }

    /* JADX INFO: renamed from: j70.d$g */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.forward.ScreenSpecificForwardActionHandler$handle$5", m100430f = "ScreenSpecificForwardActionHandler.kt", m100431l = {172}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lf70/f;", "<anonymous>", "(Lbc3/c0;)Lf70/f;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f81893w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC14176e.b f81895y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC14176e.b bVar, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f81895y = bVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C21392d.this.new g(this.f81895y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C14178f> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f81893w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C14219z0 c14219z0 = C21392d.this.signUpHelper;
            InterfaceC14176e.b bVar = this.f81895y;
            this.f81893w = 1;
            Object objM40667f = c14219z0.m40667f(bVar, this);
            return objM40667f == enumC31071a ? enumC31071a : objM40667f;
        }
    }

    /* JADX INFO: renamed from: j70.d$h */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.forward.ScreenSpecificForwardActionHandler$handle$6", m100430f = "ScreenSpecificForwardActionHandler.kt", m100431l = {187, 193}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lf70/f;", "<anonymous>", "(Lbc3/c0;)Lf70/f;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f81896w;

        /* JADX INFO: renamed from: x */
        int f81897x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC14176e.b f81899z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC14176e.b bVar, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f81899z = bVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C21392d.this.new h(this.f81899z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C14178f> interfaceC30057d) {
            return ((h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x008f, code lost:
        
            if (r10 == r0) goto L33;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r9.f81897x
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L21
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                java.lang.Object r0 = r9.f81896w
                f70.f r0 = (f70.C14178f) r0
                p505ts.AbstractC34132o.m107864I(r10)
                goto L92
            L15:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1d:
                p505ts.AbstractC34132o.m107864I(r10)
                goto L44
            L21:
                p505ts.AbstractC34132o.m107864I(r10)
                j70.d r10 = j70.C21392d.this
                f70.w0 r10 = j70.C21392d.m60045d(r10)
                f70.e$b r1 = r9.f81899z
                j70.d r4 = j70.C21392d.this
                od1.j r4 = j70.C21392d.m60044c(r4)
                java.lang.String r4 = r4.getAccessToken()
                if (r4 == 0) goto L3a
                r4 = r3
                goto L3b
            L3a:
                r4 = 0
            L3b:
                r9.f81897x = r3
                java.lang.Object r10 = r10.m40635h(r1, r4, r9)
                if (r10 != r0) goto L44
                goto L91
            L44:
                f70.f r10 = (f70.C14178f) r10
                boolean r1 = r10.m40442f()
                if (r1 == 0) goto L94
                f70.e$b r1 = r9.f81899z
                java.util.List r1 = r1.m40428m()
                if (r1 == 0) goto L94
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                boolean r3 = r1 instanceof java.util.Collection
                if (r3 == 0) goto L64
                r3 = r1
                java.util.Collection r3 = (java.util.Collection) r3
                boolean r3 = r3.isEmpty()
                if (r3 == 0) goto L64
                goto L94
            L64:
                java.util.Iterator r1 = r1.iterator()
            L68:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L94
                java.lang.Object r3 = r1.next()
                com.whoop.activation.domain.models.ActivationFlowStepModel r3 = (com.whoop.activation.domain.models.ActivationFlowStepModel) r3
                boolean r3 = r3 instanceof com.whoop.activation.domain.models.steps.UpcyclePlanPickerModel
                if (r3 == 0) goto L68
                j70.d r1 = j70.C21392d.this
                f70.d1 r3 = j70.C21392d.m60048g(r1)
                f70.e$b r4 = r10.m40441e()
                r10 = 0
                r9.f81896w = r10
                r9.f81897x = r2
                r5 = 0
                r7 = 2
                r8 = 0
                r6 = r9
                java.lang.Object r10 = f70.C14175d1.m40413c(r3, r4, r5, r6, r7, r8)
                if (r10 != r0) goto L92
            L91:
                return r0
            L92:
                f70.f r10 = (f70.C14178f) r10
            L94:
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: j70.C21392d.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: j70.d$i */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.forward.ScreenSpecificForwardActionHandler$handle$8", m100430f = "ScreenSpecificForwardActionHandler.kt", m100431l = {298}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lf70/f;", "<anonymous>", "(Lbc3/c0;)Lf70/f;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f81900w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC14176e.b f81902y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC14176e.b bVar, InterfaceC30057d<? super i> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f81902y = bVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C21392d.this.new i(this.f81902y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C14178f> interfaceC30057d) {
            return ((i) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f81900w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C14213w0 c14213w0 = C21392d.this.remoteAccountInfoHelper;
            InterfaceC14176e.b bVar = this.f81902y;
            this.f81900w = 1;
            Object objM40636i = c14213w0.m40636i(bVar, this);
            return objM40636i == enumC31071a ? enumC31071a : objM40636i;
        }
    }

    /* JADX INFO: renamed from: j70.d$j */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.forward.ScreenSpecificForwardActionHandler$handle$9", m100430f = "ScreenSpecificForwardActionHandler.kt", m100431l = {393}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lf70/f;", "<anonymous>", "(Lbc3/c0;)Lf70/f;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ SignUpSource f81903E;

        /* JADX INFO: renamed from: w */
        int f81904w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC14176e.b f81906y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ ActivationFlowStepModel f81907z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC14176e.b bVar, ActivationFlowStepModel activationFlowStepModel, SignUpSource signUpSource, InterfaceC30057d<? super j> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f81906y = bVar;
            this.f81907z = activationFlowStepModel;
            this.f81903E = signUpSource;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C21392d.this.new j(this.f81906y, this.f81907z, this.f81903E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C14178f> interfaceC30057d) {
            return ((j) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f81904w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C14214x c14214x = C21392d.this.emailFirstHelper;
            String value = this.f81906y.getMemberInfo().getAndroidx.core.app.NotificationCompat.CATEGORY_EMAIL java.lang.String().getValue();
            EnterEmailStepModel enterEmailStepModel = (EnterEmailStepModel) this.f81907z;
            C14201q0 memberInfo = this.f81906y.getMemberInfo();
            SignUpSource signUpSource = this.f81903E;
            this.f81904w = 1;
            Object objM40642b = c14214x.m40642b(value, enterEmailStepModel, memberInfo, signUpSource, this);
            return objM40642b == enumC31071a ? enumC31071a : objM40642b;
        }
    }

    /* JADX INFO: renamed from: j70.d$k */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.forward.ScreenSpecificForwardActionHandler", m100430f = "ScreenSpecificForwardActionHandler.kt", m100431l = {423}, m100432m = "navigateToDestination", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f81909F;

        /* JADX INFO: renamed from: w */
        Object f81910w;

        /* JADX INFO: renamed from: x */
        Object f81911x;

        /* JADX INFO: renamed from: y */
        Object f81912y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f81913z;

        public k(InterfaceC30057d<? super k> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f81913z = obj;
            this.f81909F |= Integer.MIN_VALUE;
            return C21392d.this.m60053m(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: j70.d$l */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.forward.ScreenSpecificForwardActionHandler$special$$inlined$flatMapLatest$1", m100430f = "ScreenSpecificForwardActionHandler.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class l extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f81914w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f81915x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f81916y;

        public l(InterfaceC30057d interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC21750d interfaceC21750d, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            l lVar = new l(interfaceC30057d);
            lVar.f81915x = interfaceC13062m;
            lVar.f81916y = interfaceC21750d;
            return lVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f81914w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f81915x;
                InterfaceC13037f2 observeStrapIsOnBody = ((InterfaceC21750d) this.f81916y).mo24695J().getObserveStrapIsOnBody();
                this.f81915x = null;
                this.f81916y = null;
                this.f81914w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, observeStrapIsOnBody, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (InterfaceC21750d) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    public C21392d(C14215x0 remoteValidationHelper, C27847j pendingUserSessionRepository, C14219z0 signUpHelper, C14213w0 remoteAccountInfoHelper, C14175d1 upcycleUpdateInfoHelper, C17003c analyticsHelper, FeatureFlagChecker ffChecker, C29298b healthConnectRepository, C14193m0 loginClickedHandler, C14214x emailFirstHelper, InterfaceC4733b whoopStrapProvider, InterfaceC17235b experimentsChecker, C23389a activationExperimentsHelper, InterfaceC2994c0 coroutineScope, C14183h0 iajfEnterEmailHandler, C14187j0 iajfSignUpHelper, C14189k0 iajfV2BffFetcher, C14185i0 iajfSecondBatchMerger) {
        AbstractC22676k.m65750j(remoteValidationHelper, "remoteValidationHelper");
        AbstractC22676k.m65750j(pendingUserSessionRepository, "pendingUserSessionRepository");
        AbstractC22676k.m65750j(signUpHelper, "signUpHelper");
        AbstractC22676k.m65750j(remoteAccountInfoHelper, "remoteAccountInfoHelper");
        AbstractC22676k.m65750j(upcycleUpdateInfoHelper, "upcycleUpdateInfoHelper");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(ffChecker, "ffChecker");
        AbstractC22676k.m65750j(healthConnectRepository, "healthConnectRepository");
        AbstractC22676k.m65750j(loginClickedHandler, "loginClickedHandler");
        AbstractC22676k.m65750j(emailFirstHelper, "emailFirstHelper");
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        AbstractC22676k.m65750j(experimentsChecker, "experimentsChecker");
        AbstractC22676k.m65750j(activationExperimentsHelper, "activationExperimentsHelper");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(iajfEnterEmailHandler, "iajfEnterEmailHandler");
        AbstractC22676k.m65750j(iajfSignUpHelper, "iajfSignUpHelper");
        AbstractC22676k.m65750j(iajfV2BffFetcher, "iajfV2BffFetcher");
        AbstractC22676k.m65750j(iajfSecondBatchMerger, "iajfSecondBatchMerger");
        this.remoteValidationHelper = remoteValidationHelper;
        this.pendingUserSessionRepository = pendingUserSessionRepository;
        this.signUpHelper = signUpHelper;
        this.remoteAccountInfoHelper = remoteAccountInfoHelper;
        this.upcycleUpdateInfoHelper = upcycleUpdateInfoHelper;
        this.analyticsHelper = analyticsHelper;
        this.ffChecker = ffChecker;
        this.healthConnectRepository = healthConnectRepository;
        this.loginClickedHandler = loginClickedHandler;
        this.emailFirstHelper = emailFirstHelper;
        this.whoopStrapProvider = whoopStrapProvider;
        this.experimentsChecker = experimentsChecker;
        this.activationExperimentsHelper = activationExperimentsHelper;
        this.coroutineScope = coroutineScope;
        this.iajfEnterEmailHandler = iajfEnterEmailHandler;
        this.iajfSignUpHelper = iajfSignUpHelper;
        this.iajfV2BffFetcher = iajfV2BffFetcher;
        this.iajfSecondBatchMerger = iajfSecondBatchMerger;
        this.strapBodyStatusFlow = AbstractC13091v.m36587M(AbstractC13091v.m36590P(new C4588i(whoopStrapProvider.mo14818b(), 2), new l(null)), coroutineScope, C13105z1.f45288a, EnumC21747a.UNKNOWN);
    }

    /* JADX INFO: renamed from: i */
    private final boolean m60050i(ActivationFlowDestination activationFlowDestination) {
        if (activationFlowDestination == ActivationFlowDestination.MEDICARE_PERMISSIONS || activationFlowDestination == ActivationFlowDestination.AL_PERMISSIONS) {
            return true;
        }
        return activationFlowDestination == ActivationFlowDestination.HW_ONLY_PERMISSIONS && this.ffChecker.isFeatureEnabled(OnboardingFeatureFlag.HW_ONLY_PERMISSION_SUBMISSION_ANDROID);
    }

    /* JADX INFO: renamed from: j */
    private final Object m60051j(InterfaceC13062m interfaceC13062m, InterfaceC14176e.b bVar, InterfaceC30057d<? super C14178f> interfaceC30057d) {
        return this.iajfSecondBatchMerger.m40488a(interfaceC13062m, bVar, new b(bVar, null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: l */
    private final boolean m60052l() {
        return this.ffChecker.isFeatureEnabled(OnboardingFeatureFlag.PLAN_PICKER_DESTINATION_NAV);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: m */
    public final Object m60053m(InterfaceC13062m interfaceC13062m, InterfaceC14176e.b bVar, C9598e c9598e, InterfaceC30057d<? super C14178f> interfaceC30057d) {
        k kVar;
        InterfaceC14176e.b bVar2;
        if (interfaceC30057d instanceof k) {
            kVar = (k) interfaceC30057d;
            int i13 = kVar.f81909F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                kVar.f81909F = i13 - Integer.MIN_VALUE;
            } else {
                kVar = new k(interfaceC30057d);
            }
        } else {
            kVar = new k(interfaceC30057d);
        }
        Object obj = kVar.f81913z;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = kVar.f81909F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            Object objM40416b = InterfaceC14176e.b.m40416b(bVar, null, C26418e.m78162b(bVar.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String(), 0, 0, 0, null, new AbstractC26417d.b(c9598e), 15, null), null, null, null, false, null, false, null, false, false, null, null, null, null, null, null, 131069, null);
            kVar.f81910w = null;
            kVar.f81911x = bVar;
            kVar.f81912y = null;
            kVar.f81909F = 1;
            if (interfaceC13062m.emit(objM40416b, kVar) == obj2) {
                return obj2;
            }
            bVar2 = bVar;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC14176e.b bVar3 = (InterfaceC14176e.b) kVar.f81911x;
            AbstractC34132o.m107864I(obj);
            bVar2 = bVar3;
        }
        return new C14178f(InterfaceC14176e.b.m40416b(bVar2, null, C26418e.m78162b(bVar2.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String(), 0, 0, 0, null, null, 15, null), null, null, null, false, null, false, null, false, false, null, null, null, null, null, null, 131069, null), false);
    }

    /* JADX INFO: renamed from: n */
    private final C9598e m60054n(C9598e c9598e) {
        if (!m60052l() || AbstractC22676k.m65745e(c9598e.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9318g6.f27632w)) {
            return null;
        }
        return c9598e;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 32161. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: k */
    public final java.lang.Object m60055k(ec3.InterfaceC13062m r62, com.whoop.activation.domain.models.ActivationFlowStepModel r63, f70.InterfaceC14176e.b r64, com.whoop.activation.iajf.domain.SignUpSource r65, q83.InterfaceC30057d<? super f70.C14178f> r66) {
        /*
            Method dump skipped, instruction units count: 3216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j70.C21392d.m60055k(ec3.m, com.whoop.activation.domain.models.ActivationFlowStepModel, f70.e$b, com.whoop.activation.iajf.domain.SignUpSource, q83.d):java.lang.Object");
    }
}
