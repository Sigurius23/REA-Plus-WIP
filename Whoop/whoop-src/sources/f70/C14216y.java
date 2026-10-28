package f70;

import android.content.Context;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.activation.domain.models.EmailDialogInfo;
import com.whoop.activation.domain.models.steps.ActivationFlowTextEntry;
import com.whoop.activation.domain.models.steps.EnterEmailStepModel;
import com.whoop.activation.view.navigation.ActivationFlowDestination;
import com.whoop.data.datastore.EmailDataStoreHelper;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import com.whoop.design.atomic.atom.icon.GlowStyle;
import com.whoop.design.models.ProgressButtonModel;
import com.whoop.design.util.AbstractC8693b;
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

/* JADX INFO: renamed from: f70.y */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0080@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lf70/y;", "", "Lcom/whoop/data/datastore/EmailDataStoreHelper;", "emailDataStoreHelper", "Landroid/content/Context;", "context", "Ls82/a;", "seonManager", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lcom/whoop/data/datastore/EmailDataStoreHelper;Landroid/content/Context;Ls82/a;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Lf70/e;", "c", "(Lq83/d;)Ljava/lang/Object;", "a", "Lcom/whoop/data/datastore/EmailDataStoreHelper;", "b", "Landroid/content/Context;", "Ls82/a;", "d", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14216y {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EmailDataStoreHelper emailDataStoreHelper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C32266a seonManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: f70.y$a */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.EnterEmailFetcher", m100430f = "EnterEmailFetcher.kt", m100431l = {33, 34}, m100432m = "fetchEnterEmailScreen$activation_release", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f51894w;

        /* JADX INFO: renamed from: y */
        int f51896y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51894w = obj;
            this.f51896y |= Integer.MIN_VALUE;
            return C14216y.this.m40656c(this);
        }
    }

    /* JADX INFO: renamed from: f70.y$b */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.EnterEmailFetcher$fetchEnterEmailScreen$2", m100430f = "EnterEmailFetcher.kt", m100431l = {42}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lf70/e$b;", "<anonymous>", "(Lbc3/c0;)Lf70/e$b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f51898w;

        /* JADX INFO: renamed from: x */
        Object f51899x;

        /* JADX INFO: renamed from: y */
        Object f51900y;

        /* JADX INFO: renamed from: z */
        int f51901z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C14216y.this.new b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super InterfaceC14176e.b> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            TextResource textResourceM21278l;
            Object email;
            String str;
            String str2;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f51901z;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                textResourceM21278l = AbstractC8693b.m21278l(C14216y.this.context.getString(AbstractC38022b.f162909t));
                String string = C14216y.this.context.getString(AbstractC38022b.f162908s);
                AbstractC22676k.m65749i(string, "getString(...)");
                String string2 = C14216y.this.context.getString(AbstractC38022b.f162904o);
                AbstractC22676k.m65749i(string2, "getString(...)");
                EmailDataStoreHelper emailDataStoreHelper = C14216y.this.emailDataStoreHelper;
                this.f51898w = string2;
                this.f51899x = textResourceM21278l;
                this.f51900y = string;
                this.f51901z = 1;
                email = emailDataStoreHelper.getEmail(this);
                if (email == enumC31071a) {
                    return enumC31071a;
                }
                str = string2;
                str2 = string;
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str3 = (String) this.f51900y;
                textResourceM21278l = (TextResource) this.f51899x;
                String str4 = (String) this.f51898w;
                AbstractC34132o.m107864I(obj);
                str2 = str3;
                str = str4;
                email = obj;
            }
            return new InterfaceC14176e.b(AbstractC37056f.m118958J(new EnterEmailStepModel(textResourceM21278l, str2, AbstractC37056f.m118958J(new ActivationFlowTextEntry("EMAIL", str, (String) email, "EMAIL", false, 16, (DefaultConstructorMarker) null)), "https://d3feqk8jsfbag1.cloudfront.net/home/accountActivation/Mail.png", (EmailDialogInfo) null, (String) null, (String) null, "ENTER_YOUR_EMAIL", "email_only", new ProgressButtonModel(ProgressButtonModel.ButtonType.FILLED, ProgressButtonModel.ButtonStyle.IN_PROGRESS, "ARROW_FORWARD", EnumC39333f.BRAND_WHITE, AbstractC8693b.m21278l(C14216y.this.context.getString(AbstractC38022b.f162871L)), (GlowStyle) null, (Float) null, (Boolean) null, (GenericInteraction) null, (Map) null, (Map) null, 2016, (DefaultConstructorMarker) null), (List) null, 1072, (DefaultConstructorMarker) null)), new C26418e(0, 1, 0, ActivationFlowDestination.ENTER_YOUR_EMAIL, null, 20, null), null, null, null, false, null, false, null, false, false, null, null, null, null, null, null, 131068, null);
        }
    }

    public C14216y(EmailDataStoreHelper emailDataStoreHelper, Context context, C32266a seonManager, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(emailDataStoreHelper, "emailDataStoreHelper");
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(seonManager, "seonManager");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.emailDataStoreHelper = emailDataStoreHelper;
        this.context = context;
        this.seonManager = seonManager;
        this.featureFlagChecker = featureFlagChecker;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m40656c(InterfaceC30057d<? super InterfaceC14176e> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f51896y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f51896y = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object obj = aVar.f51894w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f51896y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (this.featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.ANDROID_SEON_LOGIN)) {
                C32266a c32266a = this.seonManager;
                aVar.f51896y = 1;
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
        AbstractC34132o.m107864I(obj);
        b bVar = new b(null);
        aVar.f51896y = 2;
        Object objM85321a = AbstractC28190p0.m85321a(1000L, bVar, aVar);
        return objM85321a == enumC31071a ? enumC31071a : objM85321a;
    }
}
