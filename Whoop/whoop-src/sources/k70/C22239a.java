package k70;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.activation.view.navigation.ActivationFlowDestination;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import com.whoop.navigation.C9598e;
import e80.EnumC12815b;
import e80.InterfaceC12814a;
import ec3.InterfaceC13062m;
import f70.AbstractC14210v;
import f70.C14174d0;
import f70.C14178f;
import f70.C14196o;
import f70.C14199p0;
import f70.C14208u;
import f70.C14213w0;
import f70.EnumC14168b0;
import f70.InterfaceC14176e;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.models.MessageType;
import iy1.InterfaceC21030c;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.C25272z;
import n70.AbstractC26417d;
import n70.C26418e;
import od1.C27847j;
import or2.AbstractC28190p0;
import org.joda.time.DateTimeConstants;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: k70.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0001\u0018\u0000 12\u00020\u0001:\u00012BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010#\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b#\u0010$J2\u0010'\u001a\u0004\u0018\u00010\u001a2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001a0%2\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0086@¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010!\u001a\u00020 H\u0000¢\u0006\u0004\b)\u0010*J&\u0010,\u001a\u00020\u001a2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001a0%2\u0006\u0010+\u001a\u00020\u0016H\u0080@¢\u0006\u0004\b,\u0010-J&\u0010.\u001a\u00020\u001a2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001a0%2\u0006\u0010+\u001a\u00020\u0016H\u0080@¢\u0006\u0004\b.\u0010-J&\u0010/\u001a\u00020\u001a2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001a0%2\u0006\u0010+\u001a\u00020\u0016H\u0080@¢\u0006\u0004\b/\u0010-J&\u00100\u001a\u00020\u001a2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001a0%2\u0006\u0010+\u001a\u00020\u0016H\u0080@¢\u0006\u0004\b0\u0010-J&\u00101\u001a\u00020\u001a2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001a0%2\u0006\u0010+\u001a\u00020\u0016H\u0080@¢\u0006\u0004\b1\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010<R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010=R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010>R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010?¨\u0006@"}, m65681d2 = {"Lk70/a;", "", "Lf70/u;", "appDestinationRouter", "Liy1/c;", "metricWriter", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "ffChecker", "Lf70/w0;", "remoteAccountInfoHelper", "Lf70/d0;", "hwOnlyPermissionsHelper", "Lf70/p0;", "medicarePermissionsHelper", "Lf70/o;", "alPermissionsHelper", "Lod1/j;", "pendingUserSessionRepository", "Ltr2/n;", "logger", "<init>", "(Lf70/u;Liy1/c;Lcom/whoop/data/repositories/FeatureFlagChecker;Lf70/w0;Lf70/d0;Lf70/p0;Lf70/o;Lod1/j;Ltr2/n;)V", "Lf70/e$b;", "domainResult", "", "willLeaveContainer", "Lf70/e;", "i", "(Lf70/e$b;Z)Lf70/e;", "", "result", "destination", "Le80/b;", "flowBoundary", "Ll83/a0;", "g", "(Ljava/lang/String;Ljava/lang/String;Le80/b;)V", "Lec3/m;", "collector", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lec3/m;Lf70/e$b;ZLq83/d;)Ljava/lang/Object;", "f", "(Lf70/e$b;Le80/b;)Lf70/e$b;", "prevDomainResult", "m", "(Lec3/m;Lf70/e$b;Lq83/d;)Ljava/lang/Object;", "k", "l", "n", "j", "a", "Lf70/u;", "b", "Liy1/c;", "c", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "d", "Lf70/w0;", "e", "Lf70/d0;", "Lf70/p0;", "Lf70/o;", "Lod1/j;", "Ltr2/n;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22239a {

    /* JADX INFO: renamed from: j */
    private static final a f86660j = new a(null);

    /* JADX INFO: renamed from: k */
    public static final int f86661k = 8;

    /* JADX INFO: renamed from: l */
    private static final Map<ActivationFlowDestination, EnumC12815b> f86662l = AbstractC25247g0.m73990Y(new C23465k(ActivationFlowDestination.ACCOUNT_TRANSITION_LEGACY_AFTER_ACTIVATION, EnumC12815b.ACCOUNT_TRANSITION_LEGACY_AFTER_ACTIVATION_TO_AFTER_ACTIVATION), new C23465k(ActivationFlowDestination.AFTER_ACTIVATION_FINAL_SCREENS, EnumC12815b.AFTER_ACTIVATION_FINAL_SCREENS_TO_HOME));

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C14208u appDestinationRouter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final FeatureFlagChecker ffChecker;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C14213w0 remoteAccountInfoHelper;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C14174d0 hwOnlyPermissionsHelper;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C14199p0 medicarePermissionsHelper;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C14196o alPermissionsHelper;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C27847j pendingUserSessionRepository;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: k70.a$a */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lk70/a$a;", "", "<init>", "()V", "", "Lcom/whoop/activation/view/navigation/ActivationFlowDestination;", "Le80/b;", "TERMINAL_ON_COMPLETE_CONTAINERS", "Ljava/util/Map;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: k70.a$b */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f86672a;

        static {
            int[] iArr = new int[ActivationFlowDestination.values().length];
            try {
                iArr[ActivationFlowDestination.HW_ONLY_PROFILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ActivationFlowDestination.HW_ONLY_PERMISSIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ActivationFlowDestination.HW_ONLY_AFTER_ACTIVATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ActivationFlowDestination.MEDICARE_PERMISSIONS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ActivationFlowDestination.MEDICARE_AFTER_ACTIVATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ActivationFlowDestination.AL_PROFILE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ActivationFlowDestination.AL_PERMISSIONS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ActivationFlowDestination.AL_AFTER_ACTIVATION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f86672a = iArr;
        }
    }

    /* JADX INFO: renamed from: k70.a$c */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.onComplete.OnCompleteFlowResolver", m100430f = "OnCompleteFlowResolver.kt", m100431l = {206, 207}, m100432m = "submitAlPermissions$activation_release", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f86674F;

        /* JADX INFO: renamed from: w */
        Object f86675w;

        /* JADX INFO: renamed from: x */
        Object f86676x;

        /* JADX INFO: renamed from: y */
        Object f86677y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f86678z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f86678z = obj;
            this.f86674F |= Integer.MIN_VALUE;
            return C22239a.this.m63750j(null, null, this);
        }
    }

    /* JADX INFO: renamed from: k70.a$d */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.onComplete.OnCompleteFlowResolver$submitAlPermissions$result$1", m100430f = "OnCompleteFlowResolver.kt", m100431l = {208}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lf70/f;", "<anonymous>", "(Lbc3/c0;)Lf70/f;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f86679w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC14176e.b f86681y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC14176e.b bVar, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f86681y = bVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C22239a.this.new d(this.f86681y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C14178f> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f86679w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C14196o c14196o = C22239a.this.alPermissionsHelper;
            InterfaceC14176e.b bVar = this.f86681y;
            boolean z4 = C22239a.this.pendingUserSessionRepository.getAccessToken() != null;
            this.f86679w = 1;
            Object objM40526c = c14196o.m40526c(bVar, z4, this);
            return objM40526c == enumC31071a ? enumC31071a : objM40526c;
        }
    }

    /* JADX INFO: renamed from: k70.a$e */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.onComplete.OnCompleteFlowResolver", m100430f = "OnCompleteFlowResolver.kt", m100431l = {152, 153}, m100432m = "submitAlProfile$activation_release", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f86683F;

        /* JADX INFO: renamed from: w */
        Object f86684w;

        /* JADX INFO: renamed from: x */
        Object f86685x;

        /* JADX INFO: renamed from: y */
        Object f86686y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f86687z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f86687z = obj;
            this.f86683F |= Integer.MIN_VALUE;
            return C22239a.this.m63751k(null, null, this);
        }
    }

    /* JADX INFO: renamed from: k70.a$f */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.onComplete.OnCompleteFlowResolver$submitAlProfile$result$1", m100430f = "OnCompleteFlowResolver.kt", m100431l = {154}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lf70/f;", "<anonymous>", "(Lbc3/c0;)Lf70/f;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f86688w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC14176e.b f86690y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC14176e.b bVar, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f86690y = bVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C22239a.this.new f(this.f86690y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C14178f> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f86688w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C14213w0 c14213w0 = C22239a.this.remoteAccountInfoHelper;
            InterfaceC14176e.b bVar = this.f86690y;
            this.f86688w = 1;
            Object objM40636i = c14213w0.m40636i(bVar, this);
            return objM40636i == enumC31071a ? enumC31071a : objM40636i;
        }
    }

    /* JADX INFO: renamed from: k70.a$g */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.onComplete.OnCompleteFlowResolver", m100430f = "OnCompleteFlowResolver.kt", m100431l = {DateTimeConstants.HOURS_PER_WEEK, 169}, m100432m = "submitHwOnlyPermissions$activation_release", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f86692F;

        /* JADX INFO: renamed from: w */
        Object f86693w;

        /* JADX INFO: renamed from: x */
        Object f86694x;

        /* JADX INFO: renamed from: y */
        Object f86695y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f86696z;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f86696z = obj;
            this.f86692F |= Integer.MIN_VALUE;
            return C22239a.this.m63752l(null, null, this);
        }
    }

    /* JADX INFO: renamed from: k70.a$h */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.onComplete.OnCompleteFlowResolver$submitHwOnlyPermissions$result$1", m100430f = "OnCompleteFlowResolver.kt", m100431l = {170}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lf70/f;", "<anonymous>", "(Lbc3/c0;)Lf70/f;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f86697w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC14176e.b f86699y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC14176e.b bVar, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f86699y = bVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C22239a.this.new h(this.f86699y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C14178f> interfaceC30057d) {
            return ((h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws IOException {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f86697w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C14174d0 c14174d0 = C22239a.this.hwOnlyPermissionsHelper;
            InterfaceC14176e.b bVar = this.f86699y;
            boolean z4 = C22239a.this.pendingUserSessionRepository.getAccessToken() != null;
            this.f86697w = 1;
            Object objM40411h = c14174d0.m40411h(bVar, z4, this);
            return objM40411h == enumC31071a ? enumC31071a : objM40411h;
        }
    }

    /* JADX INFO: renamed from: k70.a$i */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.onComplete.OnCompleteFlowResolver", m100430f = "OnCompleteFlowResolver.kt", m100431l = {136, 137}, m100432m = "submitHwOnlyProfile$activation_release", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f86701F;

        /* JADX INFO: renamed from: w */
        Object f86702w;

        /* JADX INFO: renamed from: x */
        Object f86703x;

        /* JADX INFO: renamed from: y */
        Object f86704y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f86705z;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f86705z = obj;
            this.f86701F |= Integer.MIN_VALUE;
            return C22239a.this.m63753m(null, null, this);
        }
    }

    /* JADX INFO: renamed from: k70.a$j */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.onComplete.OnCompleteFlowResolver$submitHwOnlyProfile$result$1", m100430f = "OnCompleteFlowResolver.kt", m100431l = {138}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lf70/f;", "<anonymous>", "(Lbc3/c0;)Lf70/f;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f86706w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC14176e.b f86708y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC14176e.b bVar, InterfaceC30057d<? super j> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f86708y = bVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C22239a.this.new j(this.f86708y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C14178f> interfaceC30057d) {
            return ((j) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f86706w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C14213w0 c14213w0 = C22239a.this.remoteAccountInfoHelper;
            InterfaceC14176e.b bVar = this.f86708y;
            this.f86706w = 1;
            Object objM40636i = c14213w0.m40636i(bVar, this);
            return objM40636i == enumC31071a ? enumC31071a : objM40636i;
        }
    }

    /* JADX INFO: renamed from: k70.a$k */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.onComplete.OnCompleteFlowResolver", m100430f = "OnCompleteFlowResolver.kt", m100431l = {187, 188}, m100432m = "submitMedicarePermissions$activation_release", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f86710F;

        /* JADX INFO: renamed from: w */
        Object f86711w;

        /* JADX INFO: renamed from: x */
        Object f86712x;

        /* JADX INFO: renamed from: y */
        Object f86713y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f86714z;

        public k(InterfaceC30057d<? super k> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f86714z = obj;
            this.f86710F |= Integer.MIN_VALUE;
            return C22239a.this.m63754n(null, null, this);
        }
    }

    /* JADX INFO: renamed from: k70.a$l */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.onComplete.OnCompleteFlowResolver$submitMedicarePermissions$result$1", m100430f = "OnCompleteFlowResolver.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lf70/f;", "<anonymous>", "(Lbc3/c0;)Lf70/f;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class l extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f86715w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC14176e.b f86717y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC14176e.b bVar, InterfaceC30057d<? super l> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f86717y = bVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C22239a.this.new l(this.f86717y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C14178f> interfaceC30057d) {
            return ((l) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f86715w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C14199p0 c14199p0 = C22239a.this.medicarePermissionsHelper;
            InterfaceC14176e.b bVar = this.f86717y;
            boolean z4 = C22239a.this.pendingUserSessionRepository.getAccessToken() != null;
            this.f86715w = 1;
            Object objM40533c = c14199p0.m40533c(bVar, z4, this);
            return objM40533c == enumC31071a ? enumC31071a : objM40533c;
        }
    }

    public C22239a(C14208u appDestinationRouter, InterfaceC21030c metricWriter, FeatureFlagChecker ffChecker, C14213w0 remoteAccountInfoHelper, C14174d0 hwOnlyPermissionsHelper, C14199p0 medicarePermissionsHelper, C14196o alPermissionsHelper, C27847j pendingUserSessionRepository, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(appDestinationRouter, "appDestinationRouter");
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(ffChecker, "ffChecker");
        AbstractC22676k.m65750j(remoteAccountInfoHelper, "remoteAccountInfoHelper");
        AbstractC22676k.m65750j(hwOnlyPermissionsHelper, "hwOnlyPermissionsHelper");
        AbstractC22676k.m65750j(medicarePermissionsHelper, "medicarePermissionsHelper");
        AbstractC22676k.m65750j(alPermissionsHelper, "alPermissionsHelper");
        AbstractC22676k.m65750j(pendingUserSessionRepository, "pendingUserSessionRepository");
        AbstractC22676k.m65750j(logger, "logger");
        this.appDestinationRouter = appDestinationRouter;
        this.metricWriter = metricWriter;
        this.ffChecker = ffChecker;
        this.remoteAccountInfoHelper = remoteAccountInfoHelper;
        this.hwOnlyPermissionsHelper = hwOnlyPermissionsHelper;
        this.medicarePermissionsHelper = medicarePermissionsHelper;
        this.alPermissionsHelper = alPermissionsHelper;
        this.pendingUserSessionRepository = pendingUserSessionRepository;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: g */
    private final void m63746g(String result, String destination, EnumC12815b flowBoundary) {
        this.metricWriter.mo58701b(new InterfaceC12814a.d(result, destination, flowBoundary.getValue(), null, null, null, 56, null).mo35878b());
    }

    /* JADX INFO: renamed from: i */
    private final InterfaceC14176e m63747i(InterfaceC14176e.b domainResult, boolean willLeaveContainer) {
        EnumC12815b enumC12815b = f86662l.get(domainResult.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String().getCurrentDestination());
        if (enumC12815b == null) {
            return null;
        }
        if (domainResult.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String().m78169h() || willLeaveContainer) {
            return m63748f(domainResult, enumC12815b);
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC14176e.b m63748f(InterfaceC14176e.b domainResult, EnumC12815b flowBoundary) {
        AbstractC26417d bVar;
        AbstractC22676k.m65750j(domainResult, "domainResult");
        AbstractC22676k.m65750j(flowBoundary, "flowBoundary");
        C9598e onComplete = domainResult.getOnComplete();
        if (onComplete == null) {
            this.logger.mo85222m("consumeOnComplete called but onComplete is null for destination=" + domainResult.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String().getCurrentDestination(), new AbstractC30556a.a[0]);
            m63746g("error", MessageType.FAILED, flowBoundary);
            return InterfaceC14176e.b.m40416b(domainResult, null, null, null, null, EnumC14168b0.ERROR, false, null, false, null, false, false, null, null, null, null, null, null, 131055, null);
        }
        ActivationFlowDestination activationFlowDestinationM40608b = this.appDestinationRouter.m40608b(onComplete.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String());
        if (activationFlowDestinationM40608b != null) {
            String strM40610a = AbstractC14210v.m40610a(onComplete);
            Map mapM95645u = strM40610a != null ? AbstractC31061c.m95645u("source", strM40610a) : null;
            if (mapM95645u == null) {
                mapM95645u = C25272z.f99163w;
            }
            bVar = new AbstractC26417d.a(activationFlowDestinationM40608b, mapM95645u);
        } else {
            bVar = new AbstractC26417d.b(onComplete);
        }
        AbstractC26417d abstractC26417d = bVar;
        String name = onComplete.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String().getName();
        Locale locale = Locale.US;
        m63746g("success", AbstractC31061c.m95641q(locale, "US", name, locale, "toLowerCase(...)"), flowBoundary);
        return InterfaceC14176e.b.m40416b(domainResult, null, C26418e.m78162b(domainResult.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String(), 0, 0, 0, null, abstractC26417d, 15, null), null, null, null, false, null, false, null, false, false, null, null, null, null, null, null, 131069, null);
    }

    /* JADX INFO: renamed from: h */
    public final Object m63749h(InterfaceC13062m interfaceC13062m, InterfaceC14176e.b bVar, boolean z4, InterfaceC30057d<? super InterfaceC14176e> interfaceC30057d) {
        InterfaceC14176e interfaceC14176eM63747i = m63747i(bVar, z4);
        if (interfaceC14176eM63747i != null) {
            return interfaceC14176eM63747i;
        }
        if (!bVar.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String().m78169h()) {
            return null;
        }
        ActivationFlowDestination currentDestination = bVar.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String().getCurrentDestination();
        switch (currentDestination == null ? -1 : b.f86672a[currentDestination.ordinal()]) {
            case 1:
                if (!this.ffChecker.isFeatureEnabled(OnboardingFeatureFlag.HW_ONLY_ON_COMPLETE_ANDROID)) {
                    return null;
                }
                Object objM63753m = m63753m(interfaceC13062m, bVar, interfaceC30057d);
                return objM63753m == EnumC31071a.f128113w ? objM63753m : (InterfaceC14176e) objM63753m;
            case 2:
                if (!this.ffChecker.isFeatureEnabled(OnboardingFeatureFlag.HW_ONLY_PERMISSION_SUBMISSION_ANDROID)) {
                    return null;
                }
                Object objM63752l = m63752l(interfaceC13062m, bVar, interfaceC30057d);
                return objM63752l == EnumC31071a.f128113w ? objM63752l : (InterfaceC14176e) objM63752l;
            case 3:
                return m63748f(bVar, EnumC12815b.HW_ONLY_AFTER_ACTIVATION_TO_HOME);
            case 4:
                Object objM63754n = m63754n(interfaceC13062m, bVar, interfaceC30057d);
                return objM63754n == EnumC31071a.f128113w ? objM63754n : (InterfaceC14176e) objM63754n;
            case 5:
                return m63748f(bVar, EnumC12815b.MEDICARE_AFTER_ACTIVATION_TO_HOME);
            case 6:
                Object objM63751k = m63751k(interfaceC13062m, bVar, interfaceC30057d);
                return objM63751k == EnumC31071a.f128113w ? objM63751k : (InterfaceC14176e) objM63751k;
            case 7:
                Object objM63750j = m63750j(interfaceC13062m, bVar, interfaceC30057d);
                return objM63750j == EnumC31071a.f128113w ? objM63750j : (InterfaceC14176e) objM63750j;
            case 8:
                return m63748f(bVar, EnumC12815b.AL_AFTER_ACTIVATION_TO_HOME);
            default:
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: j */
    public final Object m63750j(InterfaceC13062m interfaceC13062m, InterfaceC14176e.b bVar, InterfaceC30057d<? super InterfaceC14176e> interfaceC30057d) {
        c cVar;
        InterfaceC14176e.b bVarM40416b;
        InterfaceC14176e.b bVar2;
        InterfaceC14176e.b bVar3;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f86674F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f86674F = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object obj = cVar.f86678z;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = cVar.f86674F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            bVarM40416b = InterfaceC14176e.b.m40416b(bVar, null, null, null, null, EnumC14168b0.LOADING, false, null, false, null, false, false, null, null, null, null, null, null, 131055, null);
            cVar.f86675w = null;
            cVar.f86676x = bVar;
            cVar.f86677y = bVarM40416b;
            cVar.f86674F = 1;
            if (interfaceC13062m.emit(bVarM40416b, cVar) != obj2) {
                bVar2 = bVar;
            }
            return obj2;
        }
        if (i14 == 1) {
            InterfaceC14176e.b bVar4 = (InterfaceC14176e.b) cVar.f86677y;
            bVar2 = (InterfaceC14176e.b) cVar.f86676x;
            AbstractC34132o.m107864I(obj);
            bVarM40416b = bVar4;
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar3 = (InterfaceC14176e.b) cVar.f86677y;
            AbstractC34132o.m107864I(obj);
        }
        C14178f c14178f = (C14178f) obj;
        return c14178f.m40442f() ? m63748f(bVar3, EnumC12815b.AL_PERMISSIONS_TO_AFTER_ACTIVATION) : c14178f.m40441e();
        d dVar = new d(bVar2, null);
        cVar.f86675w = null;
        cVar.f86676x = null;
        cVar.f86677y = bVarM40416b;
        cVar.f86674F = 2;
        Object objM85321a = AbstractC28190p0.m85321a(1000L, dVar, cVar);
        if (objM85321a != obj2) {
            bVar3 = bVarM40416b;
            obj = objM85321a;
            C14178f c14178f2 = (C14178f) obj;
            if (c14178f2.m40442f()) {
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: k */
    public final Object m63751k(InterfaceC13062m interfaceC13062m, InterfaceC14176e.b bVar, InterfaceC30057d<? super InterfaceC14176e> interfaceC30057d) {
        e eVar;
        InterfaceC14176e.b bVarM40416b;
        InterfaceC14176e.b bVar2;
        InterfaceC14176e.b bVar3;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f86683F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f86683F = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        Object obj = eVar.f86687z;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = eVar.f86683F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            bVarM40416b = InterfaceC14176e.b.m40416b(bVar, null, null, null, null, EnumC14168b0.LOADING, false, null, false, null, false, false, null, null, null, null, null, null, 131055, null);
            eVar.f86684w = null;
            eVar.f86685x = bVar;
            eVar.f86686y = bVarM40416b;
            eVar.f86683F = 1;
            if (interfaceC13062m.emit(bVarM40416b, eVar) != obj2) {
                bVar2 = bVar;
            }
            return obj2;
        }
        if (i14 == 1) {
            InterfaceC14176e.b bVar4 = (InterfaceC14176e.b) eVar.f86686y;
            bVar2 = (InterfaceC14176e.b) eVar.f86685x;
            AbstractC34132o.m107864I(obj);
            bVarM40416b = bVar4;
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar3 = (InterfaceC14176e.b) eVar.f86686y;
            AbstractC34132o.m107864I(obj);
        }
        C14178f c14178f = (C14178f) obj;
        return c14178f.m40442f() ? m63748f(bVar3, EnumC12815b.AL_PROFILE_TO_PERMISSIONS) : c14178f.m40441e();
        f fVar = new f(bVar2, null);
        eVar.f86684w = null;
        eVar.f86685x = null;
        eVar.f86686y = bVarM40416b;
        eVar.f86683F = 2;
        Object objM85321a = AbstractC28190p0.m85321a(1000L, fVar, eVar);
        if (objM85321a != obj2) {
            bVar3 = bVarM40416b;
            obj = objM85321a;
            C14178f c14178f2 = (C14178f) obj;
            if (c14178f2.m40442f()) {
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: l */
    public final Object m63752l(InterfaceC13062m interfaceC13062m, InterfaceC14176e.b bVar, InterfaceC30057d<? super InterfaceC14176e> interfaceC30057d) {
        g gVar;
        InterfaceC14176e.b bVarM40416b;
        InterfaceC14176e.b bVar2;
        InterfaceC14176e.b bVar3;
        if (interfaceC30057d instanceof g) {
            gVar = (g) interfaceC30057d;
            int i13 = gVar.f86692F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gVar.f86692F = i13 - Integer.MIN_VALUE;
            } else {
                gVar = new g(interfaceC30057d);
            }
        } else {
            gVar = new g(interfaceC30057d);
        }
        Object obj = gVar.f86696z;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = gVar.f86692F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            bVarM40416b = InterfaceC14176e.b.m40416b(bVar, null, null, null, null, EnumC14168b0.LOADING, false, null, false, null, false, false, null, null, null, null, null, null, 131055, null);
            gVar.f86693w = null;
            gVar.f86694x = bVar;
            gVar.f86695y = bVarM40416b;
            gVar.f86692F = 1;
            if (interfaceC13062m.emit(bVarM40416b, gVar) != obj2) {
                bVar2 = bVar;
            }
            return obj2;
        }
        if (i14 == 1) {
            InterfaceC14176e.b bVar4 = (InterfaceC14176e.b) gVar.f86695y;
            bVar2 = (InterfaceC14176e.b) gVar.f86694x;
            AbstractC34132o.m107864I(obj);
            bVarM40416b = bVar4;
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar3 = (InterfaceC14176e.b) gVar.f86695y;
            AbstractC34132o.m107864I(obj);
        }
        C14178f c14178f = (C14178f) obj;
        return c14178f.m40442f() ? m63748f(bVar3, EnumC12815b.PERMISSION_TO_PLAN_PICKER) : c14178f.m40441e();
        h hVar = new h(bVar2, null);
        gVar.f86693w = null;
        gVar.f86694x = null;
        gVar.f86695y = bVarM40416b;
        gVar.f86692F = 2;
        Object objM85321a = AbstractC28190p0.m85321a(1000L, hVar, gVar);
        if (objM85321a != obj2) {
            bVar3 = bVarM40416b;
            obj = objM85321a;
            C14178f c14178f2 = (C14178f) obj;
            if (c14178f2.m40442f()) {
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: m */
    public final Object m63753m(InterfaceC13062m interfaceC13062m, InterfaceC14176e.b bVar, InterfaceC30057d<? super InterfaceC14176e> interfaceC30057d) {
        i iVar;
        InterfaceC14176e.b bVarM40416b;
        InterfaceC14176e.b bVar2;
        InterfaceC14176e.b bVar3;
        if (interfaceC30057d instanceof i) {
            iVar = (i) interfaceC30057d;
            int i13 = iVar.f86701F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iVar.f86701F = i13 - Integer.MIN_VALUE;
            } else {
                iVar = new i(interfaceC30057d);
            }
        } else {
            iVar = new i(interfaceC30057d);
        }
        Object obj = iVar.f86705z;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = iVar.f86701F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            bVarM40416b = InterfaceC14176e.b.m40416b(bVar, null, null, null, null, EnumC14168b0.LOADING, false, null, false, null, false, false, null, null, null, null, null, null, 131055, null);
            iVar.f86702w = null;
            iVar.f86703x = bVar;
            iVar.f86704y = bVarM40416b;
            iVar.f86701F = 1;
            if (interfaceC13062m.emit(bVarM40416b, iVar) != obj2) {
                bVar2 = bVar;
            }
            return obj2;
        }
        if (i14 == 1) {
            InterfaceC14176e.b bVar4 = (InterfaceC14176e.b) iVar.f86704y;
            bVar2 = (InterfaceC14176e.b) iVar.f86703x;
            AbstractC34132o.m107864I(obj);
            bVarM40416b = bVar4;
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar3 = (InterfaceC14176e.b) iVar.f86704y;
            AbstractC34132o.m107864I(obj);
        }
        C14178f c14178f = (C14178f) obj;
        return c14178f.m40442f() ? m63748f(bVar3, EnumC12815b.PROFILE_TO_PERMISSION) : c14178f.m40441e();
        j jVar = new j(bVar2, null);
        iVar.f86702w = null;
        iVar.f86703x = null;
        iVar.f86704y = bVarM40416b;
        iVar.f86701F = 2;
        Object objM85321a = AbstractC28190p0.m85321a(1000L, jVar, iVar);
        if (objM85321a != obj2) {
            bVar3 = bVarM40416b;
            obj = objM85321a;
            C14178f c14178f2 = (C14178f) obj;
            if (c14178f2.m40442f()) {
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: n */
    public final Object m63754n(InterfaceC13062m interfaceC13062m, InterfaceC14176e.b bVar, InterfaceC30057d<? super InterfaceC14176e> interfaceC30057d) {
        k kVar;
        InterfaceC14176e.b bVarM40416b;
        InterfaceC14176e.b bVar2;
        InterfaceC14176e.b bVar3;
        if (interfaceC30057d instanceof k) {
            kVar = (k) interfaceC30057d;
            int i13 = kVar.f86710F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                kVar.f86710F = i13 - Integer.MIN_VALUE;
            } else {
                kVar = new k(interfaceC30057d);
            }
        } else {
            kVar = new k(interfaceC30057d);
        }
        Object obj = kVar.f86714z;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = kVar.f86710F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            bVarM40416b = InterfaceC14176e.b.m40416b(bVar, null, null, null, null, EnumC14168b0.LOADING, false, null, false, null, false, false, null, null, null, null, null, null, 131055, null);
            kVar.f86711w = null;
            kVar.f86712x = bVar;
            kVar.f86713y = bVarM40416b;
            kVar.f86710F = 1;
            if (interfaceC13062m.emit(bVarM40416b, kVar) != obj2) {
                bVar2 = bVar;
            }
            return obj2;
        }
        if (i14 == 1) {
            InterfaceC14176e.b bVar4 = (InterfaceC14176e.b) kVar.f86713y;
            bVar2 = (InterfaceC14176e.b) kVar.f86712x;
            AbstractC34132o.m107864I(obj);
            bVarM40416b = bVar4;
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar3 = (InterfaceC14176e.b) kVar.f86713y;
            AbstractC34132o.m107864I(obj);
        }
        C14178f c14178f = (C14178f) obj;
        return c14178f.m40442f() ? m63748f(bVar3, EnumC12815b.MEDICARE_PERMISSIONS_TO_AFTER_ACTIVATION) : c14178f.m40441e();
        l lVar = new l(bVar2, null);
        kVar.f86711w = null;
        kVar.f86712x = null;
        kVar.f86713y = bVarM40416b;
        kVar.f86710F = 2;
        Object objM85321a = AbstractC28190p0.m85321a(1000L, lVar, kVar);
        if (objM85321a != obj2) {
            bVar3 = bVarM40416b;
            obj = objM85321a;
            C14178f c14178f2 = (C14178f) obj;
            if (c14178f2.m40442f()) {
            }
        }
        return obj2;
    }

    public /* synthetic */ C22239a(C14208u c14208u, InterfaceC21030c interfaceC21030c, FeatureFlagChecker featureFlagChecker, C14213w0 c14213w0, C14174d0 c14174d0, C14199p0 c14199p0, C14196o c14196o, C27847j c27847j, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c14208u, interfaceC21030c, featureFlagChecker, c14213w0, c14174d0, c14199p0, c14196o, c27847j, (i13 & 256) != 0 ? InterfaceC34116n.INSTANCE.m107848a("OnCompleteFlowResolver") : interfaceC34116n);
    }
}
