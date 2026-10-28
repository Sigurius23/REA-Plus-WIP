package f70;

import android.content.Context;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.activation.domain.models.steps.ActivationFlowTextEntry;
import com.whoop.activation.domain.models.steps.EnterYourPasswordStepModel;
import com.whoop.activation.view.navigation.ActivationFlowDestination;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import com.whoop.design.atomic.atom.icon.GlowStyle;
import com.whoop.design.models.ProgressButtonModel;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.models.GenericInteraction;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import n70.C26418e;
import or2.AbstractC28190p0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s82.C32266a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x60.AbstractC38022b;

/* JADX INFO: renamed from: f70.z */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0080@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lf70/z;", "", "Landroid/content/Context;", "context", "Ls82/a;", "seonManager", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Landroid/content/Context;Ls82/a;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Lf70/e;", "prevDomainResult", "b", "(Lf70/e;Lq83/d;)Ljava/lang/Object;", "a", "Landroid/content/Context;", "Ls82/a;", "c", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14218z {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C32266a seonManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: f70.z$a */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.EnterYourPasswordFetcher", m100430f = "EnterYourPasswordFetcher.kt", m100431l = {30, 31}, m100432m = "fetchEnterPasswordScreen$activation_release", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f51905w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f51906x;

        /* JADX INFO: renamed from: z */
        int f51908z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51906x = obj;
            this.f51908z |= Integer.MIN_VALUE;
            return C14218z.this.m40660b(null, this);
        }
    }

    /* JADX INFO: renamed from: f70.z$b */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.EnterYourPasswordFetcher$fetchEnterPasswordScreen$2", m100430f = "EnterYourPasswordFetcher.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lf70/e$b;", "<anonymous>", "(Lbc3/c0;)Lf70/e$b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f51909w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC14176e f51910x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C14218z f51911y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC14176e interfaceC14176e, C14218z c14218z, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f51910x = interfaceC14176e;
            this.f51911y = c14218z;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f51910x, this.f51911y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super InterfaceC14176e.b> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0027  */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            String value;
            C14201q0 memberInfo;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f51909w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC14176e interfaceC14176e = this.f51910x;
            if (interfaceC14176e instanceof InterfaceC14176e.b) {
                value = ((InterfaceC14176e.b) interfaceC14176e).getMemberInfo().getAndroidx.core.app.NotificationCompat.CATEGORY_EMAIL java.lang.String().getValue();
                if (value.length() <= 0) {
                    value = null;
                }
            } else {
                value = null;
            }
            TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC38022b.f162907r, null, 2, null);
            String string = value != null ? this.f51911y.context.getString(AbstractC38022b.f162906q, value) : null;
            String string2 = this.f51911y.context.getString(AbstractC38022b.f162905p);
            AbstractC22676k.m65749i(string2, "getString(...)");
            List listM118958J = AbstractC37056f.m118958J(new EnterYourPasswordStepModel(c8688b, string, "https://d3feqk8jsfbag1.cloudfront.net/home/accountActivation/Password.png", AbstractC37056f.m118958J(new ActivationFlowTextEntry("SECURE_TEXT", string2, (String) null, "PASSWORD", false, 16, (DefaultConstructorMarker) null)), new TextResource.C8688b(AbstractC38022b.f162913x, null, 2, null), (String) null, "ENTER_YOUR_PASSWORD", "enter_password", new ProgressButtonModel(ProgressButtonModel.ButtonType.PROGRESS, ProgressButtonModel.ButtonStyle.IN_PROGRESS, "ARROW_FORWARD", EnumC39333f.BRAND_WHITE, new TextResource.C8688b(AbstractC38022b.f162871L, null, 2, null), (GlowStyle) null, (Float) null, (Boolean) null, (GenericInteraction) null, (Map) null, (Map) null, 2016, (DefaultConstructorMarker) null), (List) null, 512, (DefaultConstructorMarker) null));
            C26418e c26418e = new C26418e(0, 1, 0, ActivationFlowDestination.ENTER_YOUR_PASSWORD, null, 20, null);
            InterfaceC14176e interfaceC14176e2 = this.f51910x;
            InterfaceC14176e.b bVar = interfaceC14176e2 instanceof InterfaceC14176e.b ? (InterfaceC14176e.b) interfaceC14176e2 : null;
            return new InterfaceC14176e.b(listM118958J, c26418e, null, (bVar == null || (memberInfo = bVar.getMemberInfo()) == null) ? new C14201q0(null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, 0, false, false, false, 1073741823, null) : memberInfo, null, false, null, false, null, false, false, null, null, null, null, null, null, 131060, null);
        }
    }

    public C14218z(Context context, C32266a seonManager, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(seonManager, "seonManager");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.context = context;
        this.seonManager = seonManager;
        this.featureFlagChecker = featureFlagChecker;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m40660b(InterfaceC14176e interfaceC14176e, InterfaceC30057d<? super InterfaceC14176e> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f51908z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f51908z = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object obj = aVar.f51906x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f51908z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (this.featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.ANDROID_SEON_PW_SCREEN)) {
                C32266a c32266a = this.seonManager;
                aVar.f51905w = interfaceC14176e;
                aVar.f51908z = 1;
                if (c32266a.m100428m(aVar) != enumC31071a) {
                }
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        interfaceC14176e = (InterfaceC14176e) aVar.f51905w;
        AbstractC34132o.m107864I(obj);
        b bVar = new b(interfaceC14176e, this, null);
        aVar.f51905w = null;
        aVar.f51908z = 2;
        Object objM85321a = AbstractC28190p0.m85321a(1000L, bVar, aVar);
        return objM85321a == enumC31071a ? enumC31071a : objM85321a;
    }
}
