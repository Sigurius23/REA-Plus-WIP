package l70;

import com.whoop.activation.domain.models.steps.DeviceEducationStepModel;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import h80.C17003c;
import h80.InterfaceC17002b;
import hf1.InterfaceC17235b;
import java.util.Map;
import l83.C23454a0;
import lf1.C23993c;
import lf1.C23997g;
import lf1.C23999i;
import lf1.C24007q;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: l70.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0001\rB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u0012\u001a\u00020\f2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016H\u0086@¢\u0006\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Ll70/a;", "", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "ffChecker", "Lhf1/b;", "experimentsChecker", "Lh80/c;", "activationAnalyticsHelper", "<init>", "(Lcom/whoop/data/repositories/FeatureFlagChecker;Lhf1/b;Lh80/c;)V", "Lcom/whoop/activation/domain/models/steps/DeviceEducationStepModel;", "screenModel", "Ll83/a0;", "a", "(Lcom/whoop/activation/domain/models/steps/DeviceEducationStepModel;Lq83/d;)Ljava/lang/Object;", "", "", "experimentProperties", "c", "(Ljava/util/Map;Lq83/d;)Ljava/lang/Object;", "b", "(Lq83/d;)Ljava/lang/Object;", "", "d", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Lhf1/b;", "Lh80/c;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C23389a {

    /* JADX INFO: renamed from: d */
    private static final a f92691d = new a(null);

    /* JADX INFO: renamed from: e */
    public static final int f92692e = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FeatureFlagChecker ffChecker;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC17235b experimentsChecker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C17003c activationAnalyticsHelper;

    /* JADX INFO: renamed from: l70.a$a */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Ll70/a$a;", "", "<init>", "()V", "", "WHAT_TO_EXPECT_PRIMER_SCREEN_NAME", "Ljava/lang/String;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: l70.a$b */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.experiments.ActivationExperimentsHelper", m100430f = "ActivationExperimentsHelper.kt", m100431l = {50}, m100432m = "bucketFamilyPlanExplainerExperiment", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f92696w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f92697x;

        /* JADX INFO: renamed from: z */
        int f92699z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f92697x = obj;
            this.f92699z |= Integer.MIN_VALUE;
            return C23389a.this.m67687b(this);
        }
    }

    /* JADX INFO: renamed from: l70.a$c */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.experiments.ActivationExperimentsHelper", m100430f = "ActivationExperimentsHelper.kt", m100431l = {68}, m100432m = "isPasswordPolicyExperimentTest", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f92700w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f92701x;

        /* JADX INFO: renamed from: z */
        int f92703z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f92701x = obj;
            this.f92703z |= Integer.MIN_VALUE;
            return C23389a.this.m67689d(this);
        }
    }

    public C23389a(FeatureFlagChecker ffChecker, InterfaceC17235b experimentsChecker, C17003c activationAnalyticsHelper) {
        AbstractC22676k.m65750j(ffChecker, "ffChecker");
        AbstractC22676k.m65750j(experimentsChecker, "experimentsChecker");
        AbstractC22676k.m65750j(activationAnalyticsHelper, "activationAnalyticsHelper");
        this.ffChecker = ffChecker;
        this.experimentsChecker = experimentsChecker;
        this.activationAnalyticsHelper = activationAnalyticsHelper;
    }

    /* JADX INFO: renamed from: a */
    public final Object m67686a(DeviceEducationStepModel deviceEducationStepModel, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        boolean zM65745e = AbstractC22676k.m65745e(deviceEducationStepModel.getMobileScreenName(), "WHAT_TO_EXPECT_PRIMER");
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (zM65745e) {
            Object objMo48745e = this.experimentsChecker.mo48745e(new C23993c(null, null, null, null, 15, null), true, interfaceC30057d);
            if (objMo48745e == EnumC31071a.f128113w) {
                return objMo48745e;
            }
        }
        return c23454a0;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: b */
    public final Object m67687b(InterfaceC30057d<? super String> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f92699z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f92699z = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        b bVar2 = bVar;
        Object objM48741d = bVar2.f92697x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar2.f92699z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM48741d);
            if (!this.ffChecker.isFeatureEnabled(OnboardingFeatureFlag.FAMILY_PLAN_STARTER_ANDROID)) {
                return "control";
            }
            C23997g c23997g = new C23997g(null, null, null, null, 15, null);
            InterfaceC17235b interfaceC17235b = this.experimentsChecker;
            bVar2.f92696w = null;
            bVar2.f92699z = 1;
            objM48741d = InterfaceC17235b.m48741d(interfaceC17235b, c23997g, 0L, false, false, bVar2, 6, null);
            if (objM48741d == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM48741d);
        }
        String str = (String) objM48741d;
        this.activationAnalyticsHelper.m47941p(new InterfaceC17002b.b("fp-nonadmin-explainer-activation-flow-screen", str));
        return str;
    }

    /* JADX INFO: renamed from: c */
    public final Object m67688c(Map<String, String> map, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM48741d;
        C24007q c24007q = new C24007q(null, null, null, null, 15, null);
        String str = map != null ? map.get(c24007q.getName()) : null;
        return (!this.ffChecker.isFeatureEnabled("whoop-loop-and-healthspan-primer-droid") || str == null || str.equals("error") || (objM48741d = InterfaceC17235b.m48741d(this.experimentsChecker, c24007q, 0L, true, false, interfaceC30057d, 10, null)) != EnumC31071a.f128113w) ? C23454a0.f92919a : objM48741d;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: d */
    public final Object m67689d(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        c cVar;
        boolean zM65745e;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f92703z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f92703z = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        c cVar2 = cVar;
        Object objM48741d = cVar2.f92701x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar2.f92703z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM48741d);
            if (this.ffChecker.isFeatureEnabled(OnboardingFeatureFlag.PASSWORD_RESET_FLOW)) {
                C23999i c23999i = new C23999i(null, null, null, null, 15, null);
                InterfaceC17235b interfaceC17235b = this.experimentsChecker;
                cVar2.f92700w = null;
                cVar2.f92703z = 1;
                objM48741d = InterfaceC17235b.m48741d(interfaceC17235b, c23999i, 0L, false, false, cVar2, 2, null);
                if (objM48741d == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                zM65745e = false;
            }
            return Boolean.valueOf(zM65745e);
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(objM48741d);
        String str = (String) objM48741d;
        if (!AbstractC22676k.m65745e(str, "error")) {
            this.activationAnalyticsHelper.m47941p(new InterfaceC17002b.b("passwordpolicy", str));
        }
        zM65745e = AbstractC22676k.m65745e(objM48741d, "test");
        return Boolean.valueOf(zM65745e);
    }
}
