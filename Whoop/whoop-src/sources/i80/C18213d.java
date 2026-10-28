package i80;

import b90.C2885g;
import c31.C3927k;
import com.whoop.activation.domain.interactors.activation.SubscriptionError;
import com.whoop.activation.domain.models.ActivationFlowCountry;
import com.whoop.activation.domain.models.ActivationFlowState;
import com.whoop.activation.domain.models.ActivationFlowStepModel;
import com.whoop.activation.domain.models.steps.CommitmentType;
import com.whoop.activation.domain.models.steps.PlanPickerOptionKt;
import com.whoop.activation.domain.models.steps.TrialOfferCheckoutModel;
import com.whoop.activation.domain.models.steps.UpcycleCreditCardVariant;
import com.whoop.activation.domain.models.steps.UpcycleJoinTodayModel;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.domain.model.Gender;
import com.whoop.domain.model.UnitSystem;
import com.whoop.service.network.model.PasswordRequirement;
import d21.C11503a;
import d70.C11748b;
import d70.C11753g;
import e70.C12798a;
import e90.C12878a;
import e90.C12885h;
import e93.AbstractC12889b;
import f70.AbstractC14209u0;
import f70.C14201q0;
import f70.EnumC14168b0;
import f70.EnumC14195n0;
import f70.InterfaceC14176e;
import f90.C14282c;
import g80.C15562c;
import g80.C15563d;
import g80.C15565f;
import g80.C15566g;
import g80.C15568i;
import g80.EnumC15570k;
import h90.C17025c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import m70.InterfaceC25188b;
import m70.InterfaceC25195i;
import m80.C25223e;
import m83.AbstractC25267u;
import m83.C25271y;
import m90.C25286c;
import n70.C26418e;
import n90.C26475e;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.C27256h;
import ny0.EnumC27254g;
import o70.C27629c;
import org.joda.time.LocalDate;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p90.C28997e;
import p90.C28998f;
import p90.C29002j;
import q22.C29855e;
import r80.C31064f;
import r90.C31100g;
import r90.C31103j;
import r90.EnumC31097d;
import s80.C32256d;
import s90.C32287c;
import s90.C32292h;
import u80.C34631a;
import u80.C34634d;
import v80.C35795c;
import v90.C35811c;
import v90.C35815g;
import v90.C35818j;
import v90.C35826r;
import v90.C35827s;
import v90.C35830v;
import vn0.C36195e;
import w80.C36942c;
import w90.C36953c;
import wb3.AbstractC37056f;
import wn0.C37416g;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: i80.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u009d\u0001\u0010/\u001a\u00020.2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001a2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020#2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010'\u001a\u00020#2\b\u0010)\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u001aH\u0002¢\u0006\u0004\b/\u00100J\u0019\u00103\u001a\u0004\u0018\u0001022\u0006\u00101\u001a\u00020\u001bH\u0002¢\u0006\u0004\b3\u00104J#\u00107\u001a\b\u0012\u0004\u0012\u0002060\u001a2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001aH\u0002¢\u0006\u0004\b7\u00108J'\u0010:\u001a\n\u0012\u0004\u0012\u000206\u0018\u00010\u001a2\u000e\u00105\u001a\n\u0012\u0004\u0012\u000209\u0018\u00010\u001aH\u0002¢\u0006\u0004\b:\u00108J\u001f\u0010=\u001a\u00020;2\u0006\u0010<\u001a\u00020;2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b=\u0010>J\u001f\u0010@\u001a\u00020?2\u0006\u0010<\u001a\u00020?2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b@\u0010AJ\u001f\u0010C\u001a\u00020B2\u0006\u0010<\u001a\u00020B2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\bC\u0010DJ+\u0010I\u001a\b\u0012\u0004\u0012\u00020E0\u001a2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020E0\u001a2\u0006\u0010H\u001a\u00020GH\u0002¢\u0006\u0004\bI\u0010JJ\u0015\u0010M\u001a\u00020L2\u0006\u0010\r\u001a\u00020K¢\u0006\u0004\bM\u0010NR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010OR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010PR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010QR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010R¨\u0006S"}, m65681d2 = {"Li80/d;", "", "Lq22/e;", "paymentFormValidator", "Li80/e;", "progressButtonReducer", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lvn0/e;", "passwordValidator", "<init>", "(Lq22/e;Li80/e;Lcom/whoop/data/repositories/FeatureFlagChecker;Lvn0/e;)V", "Lf70/e;", "domainResult", "Lm70/b;", "paymentsDomainResult", "Lo70/c;", "privacyResult", "Lg80/d;", "d", "(Lf70/e;Lm70/b;Lo70/c;)Lg80/d;", "Lf70/n0;", "loginErrorType", "Lg80/i;", "b", "(Lf70/n0;)Lg80/i;", "", "Lcom/whoop/activation/domain/models/ActivationFlowStepModel;", "screens", "Ln70/e;", "progressResult", "Lcom/whoop/activation/domain/models/ActivationFlowCountry;", "countries", "Lf70/q0;", "memberInfo", "", "isProgressButtonError", "shouldAskForNotificationsPermissions", "isProgressButtonLoading", "shouldDismissError", "Lcom/whoop/activation/domain/interactors/activation/SubscriptionError;", "subscriptionErrorBody", "Lf70/u0;", "passwordPolicyError", "Lcom/whoop/service/network/model/PasswordRequirement;", "passwordRequirements", "Lg80/g;", "f", "(Ljava/util/List;Ln70/e;Lm70/b;Ljava/util/List;Lo70/c;Lf70/q0;ZZZLf70/n0;ZLcom/whoop/activation/domain/interactors/activation/SubscriptionError;Lf70/u0;Ljava/util/List;)Lg80/g;", "currentScreen", "Lg80/c;", "g", "(Lcom/whoop/activation/domain/models/ActivationFlowStepModel;)Lg80/c;", "locations", "Lu80/a;", "e", "(Ljava/util/List;)Ljava/util/List;", "Lcom/whoop/activation/domain/models/ActivationFlowState;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lh90/c;", "state", "i", "(Lh90/c;Lf70/q0;)Lh90/c;", "Le90/h;", "k", "(Le90/h;Lf70/q0;)Le90/h;", "Lm90/c;", "j", "(Lm90/c;Lf70/q0;)Lm90/c;", "Ls90/c;", "trialCodes", "", "selectedCodesAmount", "a", "(Ljava/util/List;I)Ljava/util/List;", "Le70/a;", "Lg80/f;", "c", "(Le70/a;)Lg80/f;", "Lq22/e;", "Li80/e;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Lvn0/e;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C18213d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C29855e paymentFormValidator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C18214e progressButtonReducer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C36195e passwordValidator;

    /* JADX INFO: renamed from: i80.d$a */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f70788a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f70789b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f70790c;

        static {
            int[] iArr = new int[EnumC14168b0.values().length];
            try {
                iArr[EnumC14168b0.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC14168b0.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f70788a = iArr;
            int[] iArr2 = new int[EnumC14195n0.values().length];
            try {
                iArr2[EnumC14195n0.GENERIC_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EnumC14195n0.INCORRECT_CREDENTIALS.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC14195n0.PASSWORD_ATTEMPT_EXCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC14195n0.NETWORK_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            f70789b = iArr2;
            int[] iArr3 = new int[CommitmentType.values().length];
            try {
                iArr3[CommitmentType.JOIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[CommitmentType.JOIN_ONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[CommitmentType.TRIAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            f70790c = iArr3;
        }
    }

    public C18213d(C29855e paymentFormValidator, C18214e progressButtonReducer, FeatureFlagChecker featureFlagChecker, C36195e passwordValidator) {
        AbstractC22676k.m65750j(paymentFormValidator, "paymentFormValidator");
        AbstractC22676k.m65750j(progressButtonReducer, "progressButtonReducer");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(passwordValidator, "passwordValidator");
        this.paymentFormValidator = paymentFormValidator;
        this.progressButtonReducer = progressButtonReducer;
        this.featureFlagChecker = featureFlagChecker;
        this.passwordValidator = passwordValidator;
    }

    /* JADX INFO: renamed from: a */
    private final List<C32287c> m52379a(List<C32287c> trialCodes, int selectedCodesAmount) {
        List<C32287c> list = trialCodes;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        int i13 = 0;
        for (Object obj : list) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            arrayList.add(C32287c.m100466b((C32287c) obj, i13 < selectedCodesAmount, null, null, null, null, null, 62, null));
            i13 = i14;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    private final C15568i m52380b(EnumC14195n0 loginErrorType) {
        int i13 = a.f70789b[loginErrorType.ordinal()];
        if (i13 == 1) {
            return C15568i.INSTANCE.m43850a();
        }
        if (i13 == 2) {
            return C15568i.INSTANCE.m43851b();
        }
        if (i13 == 3) {
            return C15568i.INSTANCE.m43853d();
        }
        if (i13 == 4) {
            return C15568i.INSTANCE.m43852c();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: d */
    private final C15563d m52381d(InterfaceC14176e domainResult, InterfaceC25188b paymentsDomainResult, C27629c privacyResult) {
        if (!(domainResult instanceof InterfaceC14176e.b)) {
            if (domainResult instanceof InterfaceC14176e.a) {
                return new C15563d(null, null, null, null, false, false, 63, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC14176e.b bVar = (InterfaceC14176e.b) domainResult;
        int i13 = a.f70788a[bVar.getFullScreenState().ordinal()];
        if (i13 == 1) {
            return new C15563d(null, null, null, null, true, false, 47, null);
        }
        if (i13 == 2) {
            return new C15563d(null, null, null, null, false, true, 31, null);
        }
        C14201q0 memberInfo = bVar.getMemberInfo();
        List<ActivationFlowStepModel> listM40428m = bVar.m40428m();
        return new C15563d(memberInfo, listM40428m != null ? m52383f(listM40428m, bVar.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String(), paymentsDomainResult, bVar.m40419d(), privacyResult, bVar.getMemberInfo(), bVar.getIsProgressButtonError(), bVar.getShouldAskForNotificationsPermissions(), bVar.getIsProgressButtonLoading(), bVar.getLoginErrorType(), bVar.getShouldDismissError(), bVar.getSubscriptionError(), bVar.getPasswordPolicyError(), bVar.m40426k()) : null, null, null, false, false, 56, null);
    }

    /* JADX INFO: renamed from: e */
    private final List<C34631a> m52382e(List<ActivationFlowCountry> locations) {
        List<ActivationFlowCountry> list = locations;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (ActivationFlowCountry activationFlowCountry : list) {
            arrayList.add(new C34631a(activationFlowCountry.getName(), activationFlowCountry.getCountryCode(), activationFlowCountry.getCountryFlag(), false, activationFlowCountry.getAgeLimit(), 8, null));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:154:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:182:0x0493  */
    /* JADX WARN: Code duplicated, block: B:238:0x058f  */
    /* JADX WARN: Code duplicated, block: B:251:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:322:0x074b A[EDGE_INSN: B:322:0x074b->B:323:0x074d BREAK  A[LOOP:8: B:317:0x0736->B:396:?]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v50 */
    /* JADX WARN: Type inference failed for: r10v51, types: [m70.b$e] */
    /* JADX WARN: Type inference failed for: r10v60 */
    /* JADX WARN: Type inference failed for: r24v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r45v6 */
    /* JADX WARN: Type inference failed for: r45v7, types: [com.whoop.design.util.TextResource] */
    /* JADX WARN: Type inference failed for: r45v8 */
    /* JADX WARN: Type inference failed for: r54v3 */
    /* JADX WARN: Type inference failed for: r54v4, types: [p90.f] */
    /* JADX WARN: Type inference failed for: r54v5 */
    /* JADX WARN: Type inference failed for: r8v82, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v83 */
    /* JADX WARN: Type inference failed for: r8v85, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: f */
    private final C15566g m52383f(List<? extends ActivationFlowStepModel> screens, C26418e progressResult, InterfaceC25188b paymentsDomainResult, List<ActivationFlowCountry> countries, C27629c privacyResult, C14201q0 memberInfo, boolean isProgressButtonError, boolean shouldAskForNotificationsPermissions, boolean isProgressButtonLoading, EnumC14195n0 loginErrorType, boolean shouldDismissError, SubscriptionError subscriptionErrorBody, AbstractC14209u0 passwordPolicyError, List<PasswordRequirement> passwordRequirements) {
        List<ActivationFlowState> states;
        C14201q0 c14201q0;
        List<ActivationFlowState> list;
        int i13;
        List<C34631a> list2;
        ActivationFlowStepModel activationFlowStepModel;
        ArrayList arrayList;
        ArrayList arrayList2;
        C3927k c3927k;
        boolean z4;
        boolean z13;
        boolean isChecked;
        boolean isChecked2;
        C11753g c11753g;
        Object next;
        Object next2;
        boolean z14;
        C35818j paymentOptions;
        C35811c paymentOptions2;
        ?? M113719f;
        ArrayList arrayList3;
        C11753g c11753g2;
        ?? r10;
        Object error;
        InterfaceC25188b.e eVar;
        LocalDate value;
        List<ActivationFlowState> list3;
        Object next3;
        C14201q0 c14201q1 = memberInfo;
        ActivationFlowStepModel activationFlowStepModel2 = screens.get(AbstractC12889b.m36284n(progressResult.getCurrentStepIndex(), 0, screens.size() - 1));
        C3927k c3927kM52399j = this.progressButtonReducer.m52399j(activationFlowStepModel2, progressResult.getStepTotal(), progressResult.getCurrentStepIndex() + 1, paymentsDomainResult, shouldDismissError ? false : isProgressButtonError, isProgressButtonLoading, c14201q1.getHasEnabledGoogleHealth(), loginErrorType, shouldDismissError, passwordPolicyError);
        ArrayList arrayList4 = null;
        List<C34631a> listM52382e = countries != null ? m52382e(countries) : null;
        if (countries != null) {
            Iterator it = countries.iterator();
            do {
                if (!it.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it.next();
            } while (!AbstractC22676k.m65745e(((ActivationFlowCountry) next3).getCountryCode(), "US"));
            ActivationFlowCountry activationFlowCountry = (ActivationFlowCountry) next3;
            states = activationFlowCountry != null ? activationFlowCountry.getStates() : null;
        } else {
            states = null;
        }
        List<? extends ActivationFlowStepModel> list4 = screens;
        int i14 = 10;
        ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(list4, 10));
        Iterator it3 = list4.iterator();
        while (it3.hasNext()) {
            Object objM60541h = AbstractC18211b.m52329n0().m60541h((ActivationFlowStepModel) it3.next());
            if (objM60541h instanceof C25286c) {
                objM60541h = m52387j((C25286c) objM60541h, c14201q1);
                arrayList2 = arrayList4;
                activationFlowStepModel = activationFlowStepModel2;
                arrayList3 = arrayList5;
                i13 = i14;
                list = states;
                c14201q0 = c14201q1;
                list2 = listM52382e;
                c3927k = c3927kM52399j;
            } else if (objM60541h instanceof C36942c) {
                ArrayList arrayList6 = arrayList4;
                int i15 = i14;
                C14201q0 c14201q2 = c14201q1;
                objM60541h = C36942c.m118598b((C36942c) objM60541h, null, null, null, null, null, null, null, c14201q2, this.featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.LOGIN_REDIRECT_DIALOG_ENABLED), 127, null);
                c14201q0 = c14201q2;
                list = states;
                i13 = i15;
                list2 = listM52382e;
                arrayList2 = arrayList6;
                activationFlowStepModel = activationFlowStepModel2;
                arrayList3 = arrayList5;
                c3927k = c3927kM52399j;
            } else {
                ActivationFlowStepModel activationFlowStepModel3 = activationFlowStepModel2;
                ArrayList arrayList7 = arrayList5;
                c14201q0 = c14201q1;
                int i16 = i14;
                if (objM60541h instanceof C34634d) {
                    C34634d c34634dM109460b = (C34634d) objM60541h;
                    if (!AbstractC22676k.m65745e(c34634dM109460b.getMobileScreenName(), "SELECT_COUNTRY") || listM52382e == null) {
                        list3 = states;
                        i13 = i16;
                        list2 = listM52382e;
                        arrayList = arrayList7;
                        if (AbstractC22676k.m65745e(c34634dM109460b.getMobileScreenName(), "SELECT_STATE") && list3 != null) {
                            List<ActivationFlowState> list5 = list3;
                            ArrayList arrayList8 = new ArrayList(AbstractC25267u.m74163i0(list5, i13));
                            for (ActivationFlowState activationFlowState : list5) {
                                arrayList8.add(new C34631a(activationFlowState.getName(), activationFlowState.getStateCode(), null, false, null, 28, null));
                            }
                            c34634dM109460b = C34634d.m109460b(c34634dM109460b, null, null, null, arrayList8, null, null, null, 119, null);
                        }
                    } else {
                        list3 = states;
                        i13 = i16;
                        List<C34631a> list6 = listM52382e;
                        arrayList = arrayList7;
                        c34634dM109460b = C34634d.m109460b(c34634dM109460b, null, null, null, list6, null, null, null, 119, null);
                        list2 = list6;
                    }
                    Object obj = c34634dM109460b;
                    list = list3;
                    objM60541h = obj;
                    activationFlowStepModel = activationFlowStepModel3;
                } else {
                    list = states;
                    i13 = i16;
                    list2 = listM52382e;
                    activationFlowStepModel = activationFlowStepModel3;
                    arrayList = arrayList7;
                    if (objM60541h instanceof C31064f) {
                        objM60541h = C31064f.m95670b((C31064f) objM60541h, null, null, null, c14201q0.getBillingFrequency(), null, null, false, 119, null);
                    } else if (objM60541h instanceof C32256d) {
                        C32256d c32256d = (C32256d) objM60541h;
                        C11748b birthday = c14201q0.getBirthday();
                        objM60541h = C32256d.m100380b(c32256d, null, null, null, 0L, 0L, null, false, null, (birthday == null || (value = birthday.getValue()) == null) ? null : value.toString(), 255, null);
                    } else if (objM60541h instanceof C25223e) {
                        objM60541h = C25223e.m73902b((C25223e) objM60541h, null, null, null, null, null, null, null, null, c14201q0.getMarketingOptIn(), 255, null);
                    } else {
                        if (objM60541h instanceof C29002j) {
                            C29002j c29002j = (C29002j) objM60541h;
                            C29855e c29855e = this.paymentFormValidator;
                            boolean z15 = paymentsDomainResult instanceof InterfaceC25188b.d;
                            InterfaceC25188b.d dVar = z15 ? (InterfaceC25188b.d) paymentsDomainResult : null;
                            String token = dVar != null ? dVar.getToken() : null;
                            InterfaceC25188b.d dVar2 = z15 ? (InterfaceC25188b.d) paymentsDomainResult : null;
                            if (dVar2 == null || (c11753g2 = dVar2.getCardZip()) == null) {
                                arrayList2 = null;
                                c11753g2 = new C11753g(null, 1, null);
                            } else {
                                arrayList2 = null;
                            }
                            C11753g c11753g3 = c11753g2;
                            String country = c14201q0.getCountry();
                            CommitmentType commitmentType = c14201q0.getCommitmentType();
                            boolean z16 = paymentsDomainResult instanceof InterfaceC25188b.b;
                            if (paymentsDomainResult instanceof InterfaceC25188b.e) {
                                eVar = (InterfaceC25188b.e) paymentsDomainResult;
                            } else {
                                r10 = arrayList2;
                            }
                            if (r10 != 0) {
                                r10 = eVar;
                                error = r10.getError();
                            } else {
                                r10 = eVar;
                                error = arrayList2;
                            }
                            boolean z17 = error instanceof InterfaceC25195i;
                            C28997e card = c14201q0.getCard();
                            ?? c28998f = subscriptionErrorBody != null ? new C28998f(subscriptionErrorBody.getType(), AbstractC8693b.m21278l(subscriptionErrorBody.getMessage()), subscriptionErrorBody.getAnalyticsName()) : arrayList2;
                            TextResource subtitle = (c29002j.getUpcycleJoinTodaySubtitle() == null || !(c14201q0.getCommitmentType() == CommitmentType.JOIN || c14201q0.getCommitmentType() == CommitmentType.JOIN_ONE)) ? c29002j.getSubtitle() : AbstractC8693b.m21278l(c29002j.getUpcycleJoinTodaySubtitle());
                            CommitmentType commitmentType2 = c14201q0.getCommitmentType();
                            int i17 = commitmentType2 == null ? -1 : a.f70790c[commitmentType2.ordinal()];
                            objM60541h = C29002j.m88095b(c29002j, null, subtitle, null, null, null, null, null, ((c14201q0.getCommitmentType() == CommitmentType.JOIN || c14201q0.getCommitmentType() == CommitmentType.JOIN_ONE) && c29002j.getUpcycleCreditCardVariant() == UpcycleCreditCardVariant.AFTER_UPCYCLE) ? arrayList2 : c29002j.getDisclaimerText(), c29855e, token, null, commitmentType, c11753g3, country, z16, z17, c28998f, null, null, card, (i17 == 1 || i17 == 2) ? "after_membership_purchase" : i17 != 3 ? "control" : "after_free_trial", null, 2491517, null);
                        } else {
                            arrayList2 = null;
                            if (objM60541h instanceof C35830v) {
                                C35830v c35830v = (C35830v) objM60541h;
                                if (c14201q0.getCommitmentType() == null || PlanPickerOptionKt.selectedFor(c35830v.m113719f(), c14201q0.getCommitmentType()) == null) {
                                    M113719f = c35830v.m113719f();
                                } else {
                                    List<C35827s> listM113719f = c35830v.m113719f();
                                    M113719f = new ArrayList(AbstractC25267u.m74163i0(listM113719f, i13));
                                    for (C35827s c35827s : listM113719f) {
                                        M113719f.add(C35827s.m113688d(c35827s, null, null, null, null, null, null, null, c35827s.getCommitmentType() == c14201q0.getCommitmentType(), null, null, null, null, 3967, null));
                                    }
                                }
                                objM60541h = C35830v.m113715b(c35830v, null, M113719f, null, 5, null);
                            } else if (objM60541h instanceof C35826r) {
                                C35826r c35826r = (C35826r) objM60541h;
                                Integer paymentMethodIndex = c14201q0.getPaymentMethodIndex();
                                if (paymentMethodIndex != null) {
                                    paymentOptions2 = C35811c.m113535b(c35826r.getPaymentOptions(), null, null, paymentMethodIndex.intValue(), null, 11, null);
                                    if (paymentOptions2 == null) {
                                        paymentOptions2 = c35826r.getPaymentOptions();
                                    }
                                } else {
                                    paymentOptions2 = c35826r.getPaymentOptions();
                                }
                                C35811c c35811c = paymentOptions2;
                                C29855e c29855e2 = this.paymentFormValidator;
                                boolean z18 = c14201q0.m40571x() != null;
                                InterfaceC25188b.i iVar = paymentsDomainResult instanceof InterfaceC25188b.i ? (InterfaceC25188b.i) paymentsDomainResult : null;
                                String paymentMethodId = iVar != null ? iVar.getPaymentMethodId() : null;
                                String country2 = c14201q0.getCountry();
                                CommitmentType commitmentType3 = c14201q0.getCommitmentType();
                                String stripeToken = c14201q0.getStripeToken();
                                boolean z19 = paymentsDomainResult instanceof InterfaceC25188b.b;
                                InterfaceC25188b.e eVar2 = paymentsDomainResult instanceof InterfaceC25188b.e ? (InterfaceC25188b.e) paymentsDomainResult : null;
                                objM60541h = C35826r.m113663b(c35826r, c35811c, null, z18, null, null, null, null, null, null, null, null, c29855e2, paymentMethodId, country2, commitmentType3, z19, (eVar2 != null ? eVar2.getError() : null) instanceof InterfaceC25195i, false, null, null, stripeToken, 919546, null);
                            } else {
                                if (objM60541h instanceof C35815g) {
                                    C35815g c35815g = (C35815g) objM60541h;
                                    Integer paymentMethodIndex2 = c14201q0.getPaymentMethodIndex();
                                    if (paymentMethodIndex2 != null) {
                                        paymentOptions = C35818j.m113595b(c35815g.getPaymentOptions(), null, null, paymentMethodIndex2.intValue(), null, 11, null);
                                        if (paymentOptions == null) {
                                            paymentOptions = c35815g.getPaymentOptions();
                                        }
                                    } else {
                                        paymentOptions = c35815g.getPaymentOptions();
                                    }
                                    C35818j c35818j = paymentOptions;
                                    C29855e c29855e3 = this.paymentFormValidator;
                                    boolean z24 = c14201q0.m40571x() != null;
                                    InterfaceC25188b.g gVar = paymentsDomainResult instanceof InterfaceC25188b.g ? (InterfaceC25188b.g) paymentsDomainResult : null;
                                    String paymentMethodId2 = gVar != null ? gVar.getPaymentMethodId() : null;
                                    String country3 = c14201q0.getCountry();
                                    CommitmentType commitmentType4 = c14201q0.getCommitmentType();
                                    String stripeToken2 = c14201q0.getStripeToken();
                                    boolean z25 = paymentsDomainResult instanceof InterfaceC25188b.b;
                                    InterfaceC25188b.e eVar3 = paymentsDomainResult instanceof InterfaceC25188b.e ? (InterfaceC25188b.e) paymentsDomainResult : null;
                                    objM60541h = C35815g.m113566b(c35815g, c35818j, null, z24, null, null, null, null, null, null, null, null, c29855e3, paymentMethodId2, country3, commitmentType4, z25, (eVar3 != null ? eVar3.getError() : null) instanceof InterfaceC25195i, false, null, stripeToken2, 395258, null);
                                } else if (objM60541h instanceof C31100g) {
                                    C31100g c31100g = (C31100g) objM60541h;
                                    List<C31103j> listM83400b = privacyResult.m83400b();
                                    if (listM83400b == null) {
                                        listM83400b = c31100g.m95817o();
                                    }
                                    List<C31103j> list7 = listM83400b;
                                    List<C31103j> listM83400b2 = privacyResult.m83400b();
                                    if (listM83400b2 != null) {
                                        ArrayList arrayList9 = new ArrayList();
                                        for (Object obj2 : listM83400b2) {
                                            if (((C31103j) obj2).getIsRequired()) {
                                                arrayList9.add(obj2);
                                            }
                                        }
                                        if (arrayList9.isEmpty()) {
                                            z14 = true;
                                            break;
                                        }
                                        Iterator it4 = arrayList9.iterator();
                                        while (true) {
                                            if (!it4.hasNext()) {
                                                z14 = true;
                                                break;
                                            }
                                            if (!((C31103j) it4.next()).getIsChecked()) {
                                                z14 = false;
                                                break;
                                            }
                                        }
                                        z13 = z14;
                                    } else {
                                        z13 = false;
                                    }
                                    List<C31103j> listM83400b3 = privacyResult.m83400b();
                                    if (listM83400b3 != null) {
                                        Iterator it5 = listM83400b3.iterator();
                                        do {
                                            if (!it5.hasNext()) {
                                                next2 = null;
                                                break;
                                            }
                                            next2 = it5.next();
                                        } while (((C31103j) next2).getConsent() != EnumC31097d.MARKETING_OPT_IN);
                                        C31103j c31103j = (C31103j) next2;
                                        if (c31103j != null) {
                                            isChecked = c31103j.getIsChecked();
                                        } else {
                                            isChecked = false;
                                        }
                                    } else {
                                        isChecked = false;
                                    }
                                    List<C31103j> listM83400b4 = privacyResult.m83400b();
                                    if (listM83400b4 != null) {
                                        Iterator it6 = listM83400b4.iterator();
                                        do {
                                            if (!it6.hasNext()) {
                                                next = null;
                                                break;
                                            }
                                            next = it6.next();
                                        } while (((C31103j) next).getConsent() != EnumC31097d.RECOMMENDATION_OPT_IN);
                                        C31103j c31103j2 = (C31103j) next;
                                        if (c31103j2 != null) {
                                            isChecked2 = c31103j2.getIsChecked();
                                        } else {
                                            isChecked2 = false;
                                        }
                                    } else {
                                        isChecked2 = false;
                                    }
                                    boolean z26 = paymentsDomainResult instanceof InterfaceC25188b.d;
                                    InterfaceC25188b.d dVar3 = z26 ? (InterfaceC25188b.d) paymentsDomainResult : null;
                                    if (dVar3 == null || (c11753g = dVar3.getCardZip()) == null) {
                                        c11753g = new C11753g(null, 1, null);
                                    }
                                    C11753g c11753g4 = c11753g;
                                    InterfaceC25188b.d dVar4 = z26 ? (InterfaceC25188b.d) paymentsDomainResult : null;
                                    c3927k = c3927kM52399j;
                                    objM60541h = c31100g.m95805a((191 & 1) != 0 ? c31100g.image : null, (191 & 2) != 0 ? c31100g.title : null, (191 & 4) != 0 ? c31100g.subTitle : null, (191 & 8) != 0 ? c31100g.selectAllTitle : null, (191 & 16) != 0 ? c31100g.jumpCtaTitle : null, (191 & 32) != 0 ? c31100g.acceptCtaTitle : null, (191 & 64) != 0 ? c31100g.terms : list7, (191 & 128) != 0 ? c31100g.analyticsName : null, (191 & 256) != 0 ? c31100g.consentsAccepted : z13, (191 & 512) != 0 ? c31100g.marketingOptIn : isChecked, (191 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c31100g.recommendationOptIn : isChecked2, (191 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c31100g.progressButtonState : c3927k, (191 & 4096) != 0 ? c31100g.cardZip : c11753g4, (191 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c31100g.stripeToken : dVar4 != null ? dVar4.getToken() : null, (191 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c31100g.userCountryCode : c14201q0.getCountry());
                                } else {
                                    c3927k = c3927kM52399j;
                                    if (objM60541h instanceof C17025c) {
                                        objM60541h = m52386i((C17025c) objM60541h, c14201q0);
                                    } else if (objM60541h instanceof C14282c) {
                                        objM60541h = C14282c.m40777b((C14282c) objM60541h, null, null, null, null, null, null, c14201q0.getSelectedRafCodesAmount(), 63, null);
                                    } else if (objM60541h instanceof C32292h) {
                                        C32292h c32292h = (C32292h) objM60541h;
                                        objM60541h = C32292h.m100515b(c32292h, null, null, null, null, m52379a(c32292h.m100523j(), c14201q0.getSelectedRafCodesAmount()), null, null, null, 239, null);
                                    } else if (objM60541h instanceof C26475e) {
                                        objM60541h = C26475e.m78406b((C26475e) objM60541h, null, null, null, null, null, shouldAskForNotificationsPermissions, 31, null);
                                    } else if (objM60541h instanceof C12885h) {
                                        objM60541h = m52388k((C12885h) objM60541h, c14201q0);
                                    } else if (objM60541h instanceof C36953c) {
                                        objM60541h = C36953c.m118670b((C36953c) objM60541h, null, null, null, null, c3927k, 15, null);
                                    } else if (objM60541h instanceof C2885g) {
                                        objM60541h = C2885g.m8383b((C2885g) objM60541h, null, null, null, null, c14201q0.getPassword(), false, null, null, c14201q0.getAndroidx.core.app.NotificationCompat.CATEGORY_EMAIL java.lang.String(), (isProgressButtonLoading || shouldDismissError || !isProgressButtonError) ? null : this.progressButtonReducer.m52398d(loginErrorType), (shouldDismissError || loginErrorType == null) ? null : m52380b(loginErrorType), 239, null);
                                    } else if (objM60541h instanceof C35795c) {
                                        List<C37416g> listM115189a = !passwordRequirements.isEmpty() ? this.passwordValidator.m115189a(c14201q0.getPassword().getValue(), passwordRequirements) : C25271y.f99162w;
                                        if (listM115189a.isEmpty()) {
                                            z4 = true;
                                            break;
                                        }
                                        List<C37416g> list8 = listM115189a;
                                        if (!(list8 instanceof Collection) || !list8.isEmpty()) {
                                            Iterator it7 = list8.iterator();
                                            while (true) {
                                                if (!it7.hasNext()) {
                                                    z4 = true;
                                                    break;
                                                }
                                                if (!((C37416g) it7.next()).getIsValid()) {
                                                    z4 = false;
                                                    break;
                                                }
                                            }
                                        } else {
                                            z4 = true;
                                            break;
                                        }
                                        objM60541h = C35795c.m113484b((C35795c) objM60541h, null, null, null, null, null, null, c14201q0.getPassword(), null, null, listM115189a, z4, listM115189a.isEmpty() ? !(c14201q0.getPassword().getValue().length() < 12 || AbstractC39414r.m125890i0(c14201q0.getPassword().getValue())) : !(!z4 || AbstractC39414r.m125890i0(c14201q0.getPassword().getValue())), 447, null);
                                    }
                                }
                                arrayList3 = arrayList;
                            }
                        }
                        c3927k = c3927kM52399j;
                        arrayList3 = arrayList;
                    }
                }
                c3927k = c3927kM52399j;
                arrayList3 = arrayList;
                arrayList2 = null;
            }
            arrayList3.add(objM60541h);
            c14201q1 = c14201q0;
            states = list;
            listM52382e = list2;
            activationFlowStepModel2 = activationFlowStepModel;
            arrayList5 = arrayList3;
            arrayList4 = arrayList2;
            i14 = i13;
            c3927kM52399j = c3927k;
        }
        ArrayList arrayList10 = arrayList4;
        ActivationFlowStepModel activationFlowStepModel4 = activationFlowStepModel2;
        ArrayList arrayList11 = arrayList5;
        List<ActivationFlowState> list9 = states;
        List<C34631a> list10 = listM52382e;
        C3927k c3927k2 = c3927kM52399j;
        List<DesignSystemModel> footerButtons = activationFlowStepModel4.getFooterButtons();
        if (footerButtons != null) {
            ArrayList arrayList12 = new ArrayList();
            Iterator it8 = footerButtons.iterator();
            while (it8.hasNext()) {
                Object objM60544l = AbstractC18211b.m52329n0().m60544l((DesignSystemModel) it8.next());
                if (objM60544l == null) {
                    objM60544l = arrayList10;
                } else if (objM60544l instanceof C27256h) {
                    objM60544l = C27256h.m82144b((C27256h) objM60544l, null, null, null, null, null, null, null, null, null, null, EnumC27254g.STANDARD, null, null, false, true, null, false, false, null, null, null, null, null, null, null, 33528831, null);
                }
                if (objM60544l != null) {
                    arrayList12.add(objM60544l);
                }
            }
            arrayList10 = arrayList12;
        }
        boolean z27 = arrayList10 == null || arrayList10.isEmpty();
        boolean z28 = false;
        InterfaceC25312u interfaceC25312u = (InterfaceC25312u) arrayList11.get(AbstractC12889b.m36284n(progressResult.getCurrentStepIndex(), 0, arrayList11.size() - 1));
        if (!z27 || (c3927k2 != null && c3927k2.getIsVisible() && !(interfaceC25312u instanceof C36953c))) {
            z28 = true;
        }
        return new C15566g(progressResult.getCurrentStepIndex(), c3927k2, arrayList11, progressResult.getCurrentDestination(), list10, m52385h(list9), m52384g(activationFlowStepModel4), arrayList10, activationFlowStepModel4.getFooterAlignment(), z28, memberInfo, isProgressButtonLoading);
    }

    /* JADX INFO: renamed from: g */
    private final C15562c m52384g(ActivationFlowStepModel currentScreen) {
        String navigationBarText = currentScreen.getNavigationBarText();
        if (navigationBarText == null) {
            return null;
        }
        EnumC15570k enumC15570k = ((currentScreen instanceof UpcycleJoinTodayModel) || (currentScreen instanceof TrialOfferCheckoutModel)) ? EnumC15570k.TITLE : EnumC15570k.SKIP;
        return new C15562c(navigationBarText, enumC15570k);
    }

    /* JADX INFO: renamed from: h */
    private final List<C34631a> m52385h(List<ActivationFlowState> locations) {
        if (locations == null) {
            return null;
        }
        List<ActivationFlowState> list = locations;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (ActivationFlowState activationFlowState : list) {
            arrayList.add(new C34631a(activationFlowState.getName(), activationFlowState.getStateCode(), null, false, null, 24, null));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    private final C17025c m52386i(C17025c state, C14201q0 memberInfo) {
        int preselectedPounds;
        int preselectedCentimeters;
        if (memberInfo.getWeight() == null || memberInfo.getUnitSystem() != UnitSystem.IMPERIAL) {
            preselectedPounds = (memberInfo.getWeight() == null || memberInfo.getUnitSystem() != UnitSystem.METRIC) ? state.getPreselectedPounds() : C11503a.f37005a.m30925n(memberInfo.getWeight().intValue());
        } else {
            preselectedPounds = memberInfo.getWeight().intValue();
        }
        int i13 = preselectedPounds;
        if (memberInfo.getHeight() == null || memberInfo.getUnitSystem() != UnitSystem.METRIC) {
            preselectedCentimeters = (memberInfo.getHeight() == null || memberInfo.getUnitSystem() != UnitSystem.IMPERIAL) ? state.getPreselectedCentimeters() : C11503a.f37005a.m30921j(memberInfo.getHeight().intValue());
        } else {
            preselectedCentimeters = memberInfo.getHeight().intValue();
        }
        int i14 = preselectedCentimeters;
        UnitSystem unitSystem = memberInfo.getUnitSystem();
        if (unitSystem == null) {
            unitSystem = state.getUnitSystem();
        }
        return C17025c.m48043b(state, null, null, null, null, null, null, null, 0, 0, 0, 0, null, null, null, 0, 0, 0, 0, null, null, i14, i13, unitSystem, 1048575, null);
    }

    /* JADX INFO: renamed from: j */
    private final C25286c m52387j(C25286c state, C14201q0 memberInfo) {
        String value = memberInfo.getFirstName().getValue();
        if (AbstractC39414r.m125890i0(value)) {
            value = state.getNamePrefill();
        }
        String str = value;
        String userName = memberInfo.getUserName();
        if (userName == null) {
            userName = "";
        }
        if (AbstractC39414r.m125890i0(userName)) {
            userName = state.getUsernamePrefill();
        }
        String str2 = userName;
        String value2 = memberInfo.getLastName().getValue();
        if (AbstractC39414r.m125890i0(value2)) {
            value2 = state.getLastNamePrefill();
        }
        return state.m74216a((7023 & 1) != 0 ? state.image : null, (7023 & 2) != 0 ? state.title : null, (7023 & 4) != 0 ? state.subTitle : null, (7023 & 8) != 0 ? state.hintName : null, (7023 & 16) != 0 ? state.namePrefill : str, (7023 & 32) != 0 ? state.isNameReadOnly : false, (7023 & 64) != 0 ? state.hintLastName : null, (7023 & 128) != 0 ? state.lastNamePrefill : value2, (7023 & 256) != 0 ? state.isLastNameReadOnly : false, (7023 & 512) != 0 ? state.hintUsername : null, (7023 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? state.usernamePrefill : str2, (7023 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? state.isUsernameReadOnly : false, (7023 & 4096) != 0 ? state.analyticsName : null, (7023 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? state.usernameTaken : memberInfo.getUsernameTaken(), (7023 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? state.usernameError : memberInfo.getUsernameError());
    }

    /* JADX INFO: renamed from: k */
    private final C12885h m52388k(C12885h state, C14201q0 memberInfo) {
        Object next;
        String genderBaseline = memberInfo.getGenderBaseline();
        String text = null;
        if (genderBaseline != null && !AbstractC39414r.m125890i0(genderBaseline) && (AbstractC22676k.m65745e(memberInfo.getGender(), Gender.NON_BINARY.getValue()) || AbstractC22676k.m65745e(memberInfo.getGender(), Gender.PREFER_NOT_TO_SAY.getValue()))) {
            Iterator<T> it = state.getDialogData().m36179a().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AbstractC22676k.m65745e(((C12878a) next).getType(), memberInfo.getGenderBaseline()));
            C12878a c12878a = (C12878a) next;
            if (c12878a != null) {
                text = c12878a.getText();
            }
        }
        return C12885h.m36221b(state, null, null, null, null, memberInfo.getGender(), text, null, null, false, 463, null);
    }

    /* JADX INFO: renamed from: c */
    public final C15565f m52389c(C12798a domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        return new C15565f(m52381d(domainResult.getActivationDomainResult(), domainResult.getPaymentsDomainResult(), domainResult.getPrivacyResultState()));
    }
}
