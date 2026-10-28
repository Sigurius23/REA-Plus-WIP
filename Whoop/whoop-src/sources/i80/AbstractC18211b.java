package i80;

import b90.C2885g;
import c41.C4092p2;
import c90.C4325b;
import com.whoop.activation.domain.models.ActivationFlowCtaDestinations;
import com.whoop.activation.domain.models.steps.AcceptedPaymentType;
import com.whoop.activation.domain.models.steps.ActivationFlowTextEntry;
import com.whoop.activation.domain.models.steps.BillingFrequencyStepModel;
import com.whoop.activation.domain.models.steps.BillingFrequencyTile;
import com.whoop.activation.domain.models.steps.BirthdayStepModel;
import com.whoop.activation.domain.models.steps.CheckYourEmailStepModel;
import com.whoop.activation.domain.models.steps.ConsentsModel;
import com.whoop.activation.domain.models.steps.CountrySelectionStepModel;
import com.whoop.activation.domain.models.steps.CreatePasswordStepModel;
import com.whoop.activation.domain.models.steps.CreateYourAccountStepModel;
import com.whoop.activation.domain.models.steps.DeidentifiedStepModel;
import com.whoop.activation.domain.models.steps.DeviceEducationStepModel;
import com.whoop.activation.domain.models.steps.EnterEmailStepModel;
import com.whoop.activation.domain.models.steps.EnterYourPasswordStepModel;
import com.whoop.activation.domain.models.steps.FamilyPlanBlockStepModel;
import com.whoop.activation.domain.models.steps.GenderBaselineOptions;
import com.whoop.activation.domain.models.steps.GenderOptionsModel;
import com.whoop.activation.domain.models.steps.GenderStepModel;
import com.whoop.activation.domain.models.steps.GiftStepModel;
import com.whoop.activation.domain.models.steps.HealthConnectStepModel;
import com.whoop.activation.domain.models.steps.HeightAndWeightStepModel;
import com.whoop.activation.domain.models.steps.HeroWithFooterCtaStepModel;
import com.whoop.activation.domain.models.steps.JoinTeamStepModel;
import com.whoop.activation.domain.models.steps.LineItem;
import com.whoop.activation.domain.models.steps.NameInformationStepModel;
import com.whoop.activation.domain.models.steps.NotificationsStepModel;
import com.whoop.activation.domain.models.steps.OrderItem;
import com.whoop.activation.domain.models.steps.PaymentErrorMessages;
import com.whoop.activation.domain.models.steps.PaymentMethodStepModel;
import com.whoop.activation.domain.models.steps.PlanOption;
import com.whoop.activation.domain.models.steps.PrivacyConsentModel;
import com.whoop.activation.domain.models.steps.RafCodeModel;
import com.whoop.activation.domain.models.steps.RafHowItWorksInstructionModel;
import com.whoop.activation.domain.models.steps.ReferAFriendCodesModel;
import com.whoop.activation.domain.models.steps.StateSelectionStepModel;
import com.whoop.activation.domain.models.steps.TermExpansion;
import com.whoop.activation.domain.models.steps.TrialOfferCheckoutModel;
import com.whoop.activation.domain.models.steps.TrialPlanOption;
import com.whoop.activation.domain.models.steps.TrialPlanPickerModel;
import com.whoop.activation.domain.models.steps.UniversalPaymentMethodStepModel;
import com.whoop.activation.domain.models.steps.UpcycleCreditCardVariant;
import com.whoop.activation.domain.models.steps.UpcycleJoinTodayModel;
import com.whoop.activation.domain.models.steps.UpcyclePlanPickerModel;
import com.whoop.activation.domain.models.steps.WelcomeTransitionStepModel;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.InfoCalloutTileModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.domain.model.UnitSystem;
import com.whoop.p069ui.AbstractC10538f;
import com.whoop.payments.stripepaymentsheettileminiarch.model.MiniArchStripePaymentSheetTileModel;
import d70.C11749c;
import d70.C11751e;
import d90.C11812c;
import e90.C12878a;
import e90.C12879b;
import e90.C12880c;
import e90.C12885h;
import f90.C14282c;
import g90.C15601g;
import h90.C17025c;
import hc3.AbstractC17176i;
import hu1.C17650g;
import i93.C18284j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import k90.C22300c;
import k90.EnumC22301d;
import kd1.AbstractC22403o;
import l32.C23323b;
import l83.C23454a0;
import m80.C25223e;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import m90.C25286c;
import n90.C26475e;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.joda.time.JodaTimeUtilKt;
import org.joda.time.LocalDate;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p716lb1.C23749z0;
import p720m91.InterfaceC25312u;
import p90.C29002j;
import p90.C29003k;
import p90.C29004l;
import p90.C29005m;
import r80.C31063e;
import r80.C31064f;
import r80.EnumC31059a;
import r90.C31100g;
import r90.C31103j;
import r90.EnumC31097d;
import s80.C32256d;
import s90.C32285a;
import s90.C32286b;
import s90.C32287c;
import s90.C32292h;
import t80.C33594d;
import u80.C34634d;
import u90.C34655c;
import v41.InterfaceC35689r0;
import v80.C35795c;
import v90.C35809a;
import v90.C35810b;
import v90.C35811c;
import v90.C35815g;
import v90.C35816h;
import v90.C35817i;
import v90.C35818j;
import v90.C35819k;
import v90.C35823o;
import v90.C35826r;
import v90.C35827s;
import v90.C35830v;
import w80.C36942c;
import w90.C36953c;
import x80.C38068c;
import y80.C39327d;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: i80.b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0019\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\t\u001a3\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00002\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u0000*\b\u0012\u0004\u0012\u00020\n0\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0019\u0010\u0014\u001a\u00020\u0013*\b\u0012\u0004\u0012\u00020\u00120\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\"\u0017\u0010\u001d\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m65681d2 = {"", "Lcom/whoop/activation/domain/models/steps/BillingFrequencyTile;", "", "q0", "(Ljava/util/List;)Z", "", "maxCodes", "", "o0", "(I)Ljava/util/List;", "Lcom/whoop/activation/domain/models/steps/ConsentsModel;", "consents", "additionalConsents", "Lr90/j;", "m0", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "r0", "(Ljava/util/List;)Ljava/util/List;", "Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;", "Ld70/c;", "p0", "(Ljava/util/List;)Ld70/c;", "Ljb1/a;", "a", "Ljb1/a;", "internalItemReducer", "b", "n0", "()Ljb1/a;", "activationFlowDesignItemReducer", "activation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18211b {

    /* JADX INFO: renamed from: a */
    private static final C21535a f70729a = AbstractC21537c.m60555e(null, 1, null);

    /* JADX INFO: renamed from: b */
    private static final C21535a f70730b = AbstractC21537c.m60554d(new C18210a(4));

    /* JADX INFO: renamed from: i80.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f70731w;

        public a(Function1 function1) {
            this.f70731w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f70731w.invoke((TrialPlanPickerModel) it);
        }
    }

    /* JADX INFO: renamed from: i80.b$a0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a0 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f70732w;

        public a0(Function1 function1) {
            this.f70732w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f70732w.invoke((PaymentMethodStepModel) it);
        }
    }

    /* JADX INFO: renamed from: i80.b$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f70733w;

        public b(Function1 function1) {
            this.f70733w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f70733w.invoke((UpcycleJoinTodayModel) it);
        }
    }

    /* JADX INFO: renamed from: i80.b$b0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b0 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f70734w;

        public b0(Function1 function1) {
            this.f70734w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f70734w.invoke((ReferAFriendCodesModel) it);
        }
    }

    /* JADX INFO: renamed from: i80.b$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f70735w;

        public c(Function1 function1) {
            this.f70735w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f70735w.invoke((TrialOfferCheckoutModel) it);
        }
    }

    /* JADX INFO: renamed from: i80.b$c0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c0 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f70736w;

        public c0(Function1 function1) {
            this.f70736w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f70736w.invoke((UpcyclePlanPickerModel) it);
        }
    }

    /* JADX INFO: renamed from: i80.b$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f70737w;

        public d(Function1 function1) {
            this.f70737w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f70737w.invoke((GiftStepModel) it);
        }
    }

    /* JADX INFO: renamed from: i80.b$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f70738w;

        public e(Function1 function1) {
            this.f70738w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f70738w.invoke((CountrySelectionStepModel) it);
        }
    }

    /* JADX INFO: renamed from: i80.b$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f70739w;

        public f(Function1 function1) {
            this.f70739w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f70739w.invoke((StateSelectionStepModel) it);
        }
    }

    /* JADX INFO: renamed from: i80.b$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f70740w;

        public g(Function1 function1) {
            this.f70740w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f70740w.invoke((HeightAndWeightStepModel) it);
        }
    }

    /* JADX INFO: renamed from: i80.b$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f70741w;

        public h(Function1 function1) {
            this.f70741w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f70741w.invoke((BillingFrequencyStepModel) it);
        }
    }

    /* JADX INFO: renamed from: i80.b$i */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f70742w;

        public i(Function1 function1) {
            this.f70742w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f70742w.invoke((GenderStepModel) it);
        }
    }

    /* JADX INFO: renamed from: i80.b$j */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f70743w;

        public j(Function1 function1) {
            this.f70743w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f70743w.invoke((PrivacyConsentModel) it);
        }
    }

    /* JADX INFO: renamed from: i80.b$k */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f70744w;

        public k(Function1 function1) {
            this.f70744w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f70744w.invoke((CreateYourAccountStepModel) it);
        }
    }

    /* JADX INFO: renamed from: i80.b$l */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f70745w;

        public l(Function1 function1) {
            this.f70745w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f70745w.invoke((DeidentifiedStepModel) it);
        }
    }

    /* JADX INFO: renamed from: i80.b$m */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f70746w;

        public m(Function1 function1) {
            this.f70746w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f70746w.invoke((JoinTeamStepModel) it);
        }
    }

    /* JADX INFO: renamed from: i80.b$n */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f70747w;

        public n(Function1 function1) {
            this.f70747w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f70747w.invoke((WelcomeTransitionStepModel) it);
        }
    }

    /* JADX INFO: renamed from: i80.b$o */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f70748w;

        public o(Function1 function1) {
            this.f70748w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f70748w.invoke((EnterEmailStepModel) it);
        }
    }

    /* JADX INFO: renamed from: i80.b$p */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f70749w;

        public p(Function1 function1) {
            this.f70749w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f70749w.invoke((EnterYourPasswordStepModel) it);
        }
    }

    /* JADX INFO: renamed from: i80.b$q */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f70750w;

        public q(Function1 function1) {
            this.f70750w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f70750w.invoke((CreatePasswordStepModel) it);
        }
    }

    /* JADX INFO: renamed from: i80.b$r */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class r implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f70751w;

        public r(Function1 function1) {
            this.f70751w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f70751w.invoke((CheckYourEmailStepModel) it);
        }
    }

    /* JADX INFO: renamed from: i80.b$s */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class s implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f70752w;

        public s(Function1 function1) {
            this.f70752w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f70752w.invoke((FamilyPlanBlockStepModel) it);
        }
    }

    /* JADX INFO: renamed from: i80.b$t */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class t implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f70753w;

        public t(Function1 function1) {
            this.f70753w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f70753w.invoke((HeroWithFooterCtaStepModel) it);
        }
    }

    /* JADX INFO: renamed from: i80.b$u */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class u implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f70754w;

        public u(Function1 function1) {
            this.f70754w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f70754w.invoke((UniversalPaymentMethodStepModel) it);
        }
    }

    /* JADX INFO: renamed from: i80.b$v */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class v implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f70755w;

        public v(Function1 function1) {
            this.f70755w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f70755w.invoke((DeviceEducationStepModel) it);
        }
    }

    /* JADX INFO: renamed from: i80.b$w */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class w implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f70756w;

        public w(Function1 function1) {
            this.f70756w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f70756w.invoke((HealthConnectStepModel) it);
        }
    }

    /* JADX INFO: renamed from: i80.b$x */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class x implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f70757w;

        public x(Function1 function1) {
            this.f70757w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f70757w.invoke((NameInformationStepModel) it);
        }
    }

    /* JADX INFO: renamed from: i80.b$y */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class y implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f70758w;

        public y(Function1 function1) {
            this.f70758w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f70758w.invoke((BirthdayStepModel) it);
        }
    }

    /* JADX INFO: renamed from: i80.b$z */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class z implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f70759w;

        public z(Function1 function1) {
            this.f70759w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f70759w.invoke((NotificationsStepModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m52282G(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C18210a(15));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m52283H(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        C18210a c18210a = new C18210a(19);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(CreateYourAccountStepModel.class), new k(c18210a));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(DeviceEducationStepModel.class), new v(new C17650g(28)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(HealthConnectStepModel.class), new w(new C18210a(9)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(NameInformationStepModel.class), new x(new C18210a(10)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(BirthdayStepModel.class), new y(new C18210a(11)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(NotificationsStepModel.class), new z(new C18210a(12)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(PaymentMethodStepModel.class), new a0(new C18210a(13)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ReferAFriendCodesModel.class), new b0(new C18210a(14)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(UpcyclePlanPickerModel.class), new c0(new C18210a(16)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(TrialPlanPickerModel.class), new a(new C18210a(17)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(UpcycleJoinTodayModel.class), new b(new C18210a(20)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(TrialOfferCheckoutModel.class), new c(new C18210a(21)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(GiftStepModel.class), new d(new C18210a(22)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(CountrySelectionStepModel.class), new e(new C18210a(23)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(StateSelectionStepModel.class), new f(new C18210a(24)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(HeightAndWeightStepModel.class), new g(new C18210a(25)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(BillingFrequencyStepModel.class), new h(new C17650g(24)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(GenderStepModel.class), new i(new C17650g(25)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(PrivacyConsentModel.class), new j(new C17650g(26)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(DeidentifiedStepModel.class), new l(new C17650g(27)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(JoinTeamStepModel.class), new m(new C17650g(29)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(WelcomeTransitionStepModel.class), new n(new C18210a(0)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(EnterEmailStepModel.class), new o(new C18210a(1)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(EnterYourPasswordStepModel.class), new p(new C18210a(2)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(CreatePasswordStepModel.class), new q(new C18210a(3)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(CheckYourEmailStepModel.class), new r(new C18210a(5)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(FamilyPlanBlockStepModel.class), new s(new C18210a(6)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(HeroWithFooterCtaStepModel.class), new t(new C18210a(7)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(UniversalPaymentMethodStepModel.class), new u(new C18210a(8)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C36942c m52284I(CreateYourAccountStepModel model) {
        Object next;
        Object next2;
        AbstractC22676k.m65750j(model, "model");
        AbstractC22403o.c cVar = new AbstractC22403o.c(model.getImageUrl(), 0, 0, 0, 14, null);
        TextResource title = model.getTitle();
        String subtitle = model.getSubtitle();
        Iterator<T> it = model.getTextEntries().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC17176i.m48520v(((ActivationFlowTextEntry) next).getFieldType(), Locale.ROOT, "toUpperCase(...)", "EMAIL"));
        ActivationFlowTextEntry activationFlowTextEntry = (ActivationFlowTextEntry) next;
        TextResource textResourceM21278l = AbstractC8693b.m21278l(activationFlowTextEntry != null ? activationFlowTextEntry.getText() : null);
        Iterator<T> it3 = model.getTextEntries().iterator();
        do {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it3.next();
        } while (!AbstractC17176i.m48520v(((ActivationFlowTextEntry) next2).getFieldType(), Locale.ROOT, "toUpperCase(...)", "PASSWORD"));
        ActivationFlowTextEntry activationFlowTextEntry2 = (ActivationFlowTextEntry) next2;
        return new C36942c(cVar, title, subtitle, textResourceM21278l, AbstractC8693b.m21278l(activationFlowTextEntry2 != null ? activationFlowTextEntry2.getText() : null), model.getDisclaimerText(), model.getAnalyticsName(), null, false, 256, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:12:0x002c  */
    /* JADX WARN: Code duplicated, block: B:13:0x0039  */
    /* JADX INFO: renamed from: J */
    public static final C39327d m52285J(DeviceEducationStepModel model) {
        InterfaceC35689r0 interfaceC35689r0;
        InterfaceC35689r0 interfaceC35689r0M113134a;
        String imageUrl;
        AbstractC22403o.c cVar;
        AbstractC22676k.m65750j(model, "model");
        String lottieJson = model.getLottieJson();
        if (lottieJson == null) {
            String lottieUrl = model.getLottieUrl();
            if (lottieUrl != null) {
                interfaceC35689r0M113134a = InterfaceC35689r0.e.m113134a(InterfaceC35689r0.e.m113135b(lottieUrl));
            } else {
                interfaceC35689r0 = null;
            }
            imageUrl = model.getImageUrl();
            if (imageUrl != null) {
                cVar = new AbstractC22403o.c(imageUrl, 0, 0, 0, 14, null);
            } else {
                cVar = null;
            }
            return new C39327d(cVar, interfaceC35689r0, model.getTitle(), model.getSubtitle(), model.getCtaText(), model.getNavigation());
        }
        interfaceC35689r0M113134a = InterfaceC35689r0.c.m113122a(InterfaceC35689r0.c.m113123b(lottieJson));
        interfaceC35689r0 = interfaceC35689r0M113134a;
        imageUrl = model.getImageUrl();
        if (imageUrl != null) {
            cVar = new AbstractC22403o.c(imageUrl, 0, 0, 0, 14, null);
        } else {
            cVar = null;
        }
        return new C39327d(cVar, interfaceC35689r0, model.getTitle(), model.getSubtitle(), model.getCtaText(), model.getNavigation());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [com.whoop.design.util.TextResource] */
    /* JADX WARN: Type inference failed for: r29v0, types: [com.whoop.activation.domain.models.steps.UpcycleCreditCardVariant] */
    /* JADX INFO: renamed from: K */
    public static final C35826r m52286K(UpcycleJoinTodayModel model) {
        Object next;
        Object next2;
        Object next3;
        Object next4;
        Object next5;
        AbstractC22676k.m65750j(model, "model");
        String title = model.getOrderDetails().getTitle();
        List<LineItem> lineItems = model.getOrderDetails().getLineItems();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(lineItems, 10));
        Iterator it = lineItems.iterator();
        while (true) {
            Object objM21278l = null;
            if (!it.hasNext()) {
                break;
            }
            LineItem lineItem = (LineItem) it.next();
            TextResource title2 = lineItem.getTitle();
            TextResource amount = lineItem.getAmount();
            String subtitle = lineItem.getSubtitle();
            TextResource textResourceM21278l = subtitle != null ? AbstractC8693b.m21278l(subtitle) : null;
            String strikethroughAmount = lineItem.getStrikethroughAmount();
            if (strikethroughAmount != null) {
                objM21278l = AbstractC8693b.m21278l(strikethroughAmount);
            }
            arrayList.add(new C35809a(title2, true, textResourceM21278l, amount, objM21278l));
        }
        List<OrderItem> listM74077r0 = AbstractC25260n.m74077r0(new OrderItem[]{model.getOrderDetails().getDiscount(), model.getOrderDetails().getTax(), model.getOrderDetails().getTotal()});
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM74077r0, 10));
        for (OrderItem orderItem : listM74077r0) {
            TextResource label = orderItem.getLabel();
            boolean highlight = orderItem.getHighlight();
            TextResource amount2 = orderItem.getAmount();
            String strikethroughAmount2 = orderItem.getStrikethroughAmount();
            arrayList2.add(new C35809a(label, highlight, null, amount2, strikethroughAmount2 != null ? AbstractC8693b.m21278l(strikethroughAmount2) : null, 4, null));
        }
        C35810b c35810b = new C35810b(title, arrayList, arrayList2);
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(model.getPaymentMethod().getTitle());
        String existingLabel = model.getPaymentMethod().getExistingLabel();
        C35811c c35811c = new C35811c(textResourceM21278l2, AbstractC25260n.m74077r0(new TextResource[]{existingLabel != null ? AbstractC8693b.m21278l(existingLabel) : null, AbstractC8693b.m21278l(model.getPaymentMethod().getAlternateLabel())}), 0, null, 8, null);
        String payload = model.getPayload();
        String promoCode = model.getPromoCode();
        List<AcceptedPaymentType> acceptedPaymentTypes = model.getPaymentMethod().getAcceptedPaymentTypes();
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(acceptedPaymentTypes, 10));
        for (AcceptedPaymentType acceptedPaymentType : acceptedPaymentTypes) {
            arrayList3.add(new C29005m(new AbstractC22403o.c(acceptedPaymentType.getImageUrl(), 0, 0, 0, 14, null), acceptedPaymentType.getAccessibilityName()));
        }
        Iterator it3 = model.getPaymentMethod().getTextEntries().iterator();
        do {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
        } while (!AbstractC17176i.m48520v(((ActivationFlowTextEntry) next).getFieldType(), Locale.ROOT, "toUpperCase(...)", "CARD_NUMBER"));
        ActivationFlowTextEntry activationFlowTextEntry = (ActivationFlowTextEntry) next;
        C29003k c29003k = new C29003k(AbstractC8693b.m21278l(activationFlowTextEntry != null ? activationFlowTextEntry.getText() : null), null, 2, null);
        Iterator it4 = model.getPaymentMethod().getTextEntries().iterator();
        do {
            if (!it4.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it4.next();
        } while (!AbstractC17176i.m48520v(((ActivationFlowTextEntry) next2).getFieldType(), Locale.ROOT, "toUpperCase(...)", "CARD_EXPIRATION_DATE"));
        ActivationFlowTextEntry activationFlowTextEntry2 = (ActivationFlowTextEntry) next2;
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(activationFlowTextEntry2 != null ? activationFlowTextEntry2.getText() : null);
        Iterator it5 = model.getPaymentMethod().getTextEntries().iterator();
        do {
            if (!it5.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it5.next();
        } while (!AbstractC17176i.m48520v(((ActivationFlowTextEntry) next3).getFieldType(), Locale.ROOT, "toUpperCase(...)", "CARD_EXPIRATION_DATE"));
        ActivationFlowTextEntry activationFlowTextEntry3 = (ActivationFlowTextEntry) next3;
        C29003k c29003k2 = new C29003k(textResourceM21278l3, AbstractC8693b.m21278l(activationFlowTextEntry3 != null ? activationFlowTextEntry3.getPreFill() : null));
        Iterator it6 = model.getPaymentMethod().getTextEntries().iterator();
        do {
            if (!it6.hasNext()) {
                next4 = null;
                break;
            }
            next4 = it6.next();
        } while (!AbstractC17176i.m48520v(((ActivationFlowTextEntry) next4).getFieldType(), Locale.ROOT, "toUpperCase(...)", "CARD_CVV"));
        ActivationFlowTextEntry activationFlowTextEntry4 = (ActivationFlowTextEntry) next4;
        C29003k c29003k3 = new C29003k(AbstractC8693b.m21278l(activationFlowTextEntry4 != null ? activationFlowTextEntry4.getText() : null), null, 2, null);
        Iterator it7 = model.getPaymentMethod().getTextEntries().iterator();
        do {
            if (!it7.hasNext()) {
                next5 = null;
                break;
            }
            next5 = it7.next();
        } while (!AbstractC17176i.m48520v(((ActivationFlowTextEntry) next5).getFieldType(), Locale.ROOT, "toUpperCase(...)", "CARD_ZIP_CODE"));
        ActivationFlowTextEntry activationFlowTextEntry5 = (ActivationFlowTextEntry) next5;
        C29004l c29004l = new C29004l(c29003k, c29003k2, c29003k3, new C29003k(AbstractC8693b.m21278l(activationFlowTextEntry5 != null ? activationFlowTextEntry5.getText() : null), null, 2, null));
        PaymentErrorMessages errorMessages = model.getPaymentMethod().getErrorMessages();
        String analyticsName = model.getAnalyticsName();
        TextResource securityFooter = model.getSecurityFooter();
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l(model.getDisclaimerFooterMarkdown());
        Boolean boolIsTrialMember = model.isTrialMember();
        boolean zBooleanValue = boolIsTrialMember != null ? boolIsTrialMember.booleanValue() : false;
        String upcycleCreditCardVariant = model.getUpcycleCreditCardVariant();
        return new C35826r(c35811c, c35810b, false, payload, promoCode, arrayList3, c29004l, errorMessages, analyticsName, securityFooter, textResourceM21278l4, null, null, null, null, false, false, zBooleanValue, model.getMembershipTier(), upcycleCreditCardVariant != null ? UpcycleCreditCardVariant.INSTANCE.fromValue(upcycleCreditCardVariant) : null, null, 1073156, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C35815g m52287L(TrialOfferCheckoutModel model) {
        Object next;
        Object next2;
        Object next3;
        Object next4;
        Object next5;
        AbstractC22676k.m65750j(model, "model");
        String title = model.getOrderDetails().getTitle();
        List<LineItem> lineItems = model.getOrderDetails().getLineItems();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(lineItems, 10));
        Iterator<T> it = lineItems.iterator();
        while (true) {
            TextResource textResourceM21278l = null;
            if (!it.hasNext()) {
                break;
            }
            LineItem lineItem = (LineItem) it.next();
            TextResource title2 = lineItem.getTitle();
            TextResource amount = lineItem.getAmount();
            String subtitle = lineItem.getSubtitle();
            TextResource textResourceM21278l2 = subtitle != null ? AbstractC8693b.m21278l(subtitle) : null;
            String strikethroughAmount = lineItem.getStrikethroughAmount();
            if (strikethroughAmount != null) {
                textResourceM21278l = AbstractC8693b.m21278l(strikethroughAmount);
            }
            arrayList.add(new C35816h(title2, true, textResourceM21278l2, amount, textResourceM21278l));
        }
        List<OrderItem> listM74077r0 = AbstractC25260n.m74077r0(new OrderItem[]{model.getOrderDetails().getDiscount(), model.getOrderDetails().getTax(), model.getOrderDetails().getTotal()});
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM74077r0, 10));
        for (OrderItem orderItem : listM74077r0) {
            TextResource label = orderItem.getLabel();
            boolean highlight = orderItem.getHighlight();
            TextResource amount2 = orderItem.getAmount();
            String strikethroughAmount2 = orderItem.getStrikethroughAmount();
            arrayList2.add(new C35816h(label, highlight, null, amount2, strikethroughAmount2 != null ? AbstractC8693b.m21278l(strikethroughAmount2) : null, 4, null));
        }
        C35817i c35817i = new C35817i(title, arrayList, arrayList2);
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(model.getPaymentMethod().getTitle());
        String existingLabel = model.getPaymentMethod().getExistingLabel();
        C35818j c35818j = new C35818j(textResourceM21278l3, AbstractC25260n.m74077r0(new TextResource[]{existingLabel != null ? AbstractC8693b.m21278l(existingLabel) : null, AbstractC8693b.m21278l(model.getPaymentMethod().getAlternateLabel())}), 0, null, 8, null);
        String payload = model.getPayload();
        String promoCode = model.getPromoCode();
        List<AcceptedPaymentType> acceptedPaymentTypes = model.getPaymentMethod().getAcceptedPaymentTypes();
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(acceptedPaymentTypes, 10));
        for (AcceptedPaymentType acceptedPaymentType : acceptedPaymentTypes) {
            arrayList3.add(new C29005m(new AbstractC22403o.c(acceptedPaymentType.getImageUrl(), 0, 0, 0, 14, null), acceptedPaymentType.getAccessibilityName()));
        }
        Iterator<T> it3 = model.getPaymentMethod().getTextEntries().iterator();
        do {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
        } while (!AbstractC17176i.m48520v(((ActivationFlowTextEntry) next).getFieldType(), Locale.ROOT, "toUpperCase(...)", "CARD_NUMBER"));
        ActivationFlowTextEntry activationFlowTextEntry = (ActivationFlowTextEntry) next;
        C29003k c29003k = new C29003k(AbstractC8693b.m21278l(activationFlowTextEntry != null ? activationFlowTextEntry.getText() : null), null, 2, null);
        Iterator<T> it4 = model.getPaymentMethod().getTextEntries().iterator();
        do {
            if (!it4.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it4.next();
        } while (!AbstractC17176i.m48520v(((ActivationFlowTextEntry) next2).getFieldType(), Locale.ROOT, "toUpperCase(...)", "CARD_EXPIRATION_DATE"));
        ActivationFlowTextEntry activationFlowTextEntry2 = (ActivationFlowTextEntry) next2;
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l(activationFlowTextEntry2 != null ? activationFlowTextEntry2.getText() : null);
        Iterator<T> it5 = model.getPaymentMethod().getTextEntries().iterator();
        do {
            if (!it5.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it5.next();
        } while (!AbstractC17176i.m48520v(((ActivationFlowTextEntry) next3).getFieldType(), Locale.ROOT, "toUpperCase(...)", "CARD_EXPIRATION_DATE"));
        ActivationFlowTextEntry activationFlowTextEntry3 = (ActivationFlowTextEntry) next3;
        C29003k c29003k2 = new C29003k(textResourceM21278l4, AbstractC8693b.m21278l(activationFlowTextEntry3 != null ? activationFlowTextEntry3.getPreFill() : null));
        Iterator<T> it6 = model.getPaymentMethod().getTextEntries().iterator();
        do {
            if (!it6.hasNext()) {
                next4 = null;
                break;
            }
            next4 = it6.next();
        } while (!AbstractC17176i.m48520v(((ActivationFlowTextEntry) next4).getFieldType(), Locale.ROOT, "toUpperCase(...)", "CARD_CVV"));
        ActivationFlowTextEntry activationFlowTextEntry4 = (ActivationFlowTextEntry) next4;
        C29003k c29003k3 = new C29003k(AbstractC8693b.m21278l(activationFlowTextEntry4 != null ? activationFlowTextEntry4.getText() : null), null, 2, null);
        Iterator<T> it7 = model.getPaymentMethod().getTextEntries().iterator();
        do {
            if (!it7.hasNext()) {
                next5 = null;
                break;
            }
            next5 = it7.next();
        } while (!AbstractC17176i.m48520v(((ActivationFlowTextEntry) next5).getFieldType(), Locale.ROOT, "toUpperCase(...)", "CARD_ZIP_CODE"));
        ActivationFlowTextEntry activationFlowTextEntry5 = (ActivationFlowTextEntry) next5;
        C29004l c29004l = new C29004l(c29003k, c29003k2, c29003k3, new C29003k(AbstractC8693b.m21278l(activationFlowTextEntry5 != null ? activationFlowTextEntry5.getText() : null), null, 2, null));
        PaymentErrorMessages errorMessages = model.getPaymentMethod().getErrorMessages();
        String analyticsName = model.getAnalyticsName();
        TextResource securityFooter = model.getSecurityFooter();
        TextResource textResourceM21278l5 = AbstractC8693b.m21278l(model.getDisclaimerFooterMarkdown());
        Boolean boolIsTrialMember = model.isTrialMember();
        return new C35815g(c35818j, c35817i, false, payload, promoCode, arrayList3, c29004l, errorMessages, analyticsName, securityFooter, textResourceM21278l5, null, null, null, null, false, false, boolIsTrialMember != null ? boolIsTrialMember.booleanValue() : false, model.getMembershipTier(), null, 548868, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C14282c m52288M(GiftStepModel model) {
        AbstractC22676k.m65750j(model, "model");
        int i13 = 0;
        return new C14282c(model.getTitle(), model.getSubtitle(), new AbstractC22403o.c(model.getImageUrl(), 0, 0, 0, 14, null), model.getPickerText(), m52331o0(model.getMaximumCodesAllowed()), model.getDisclaimerText(), i13, 64, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C34634d m52289N(CountrySelectionStepModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C34634d(new AbstractC22403o.c(model.getImageUrl(), 0, 0, 0, 14, null), model.getTitle(), model.getSubtitle(), C25271y.f99162w, model.getSearchText(), model.getAnalyticsName(), model.getMobileScreenName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C34634d m52290O(StateSelectionStepModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C34634d(new AbstractC22403o.c(model.getImageUrl(), 0, 0, 0, 14, null), model.getTitle(), model.getSubtitle(), C25271y.f99162w, model.getSearchText(), model.getAnalyticsName(), model.getMobileScreenName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C17025c m52291P(HeightAndWeightStepModel model) {
        AbstractC22676k.m65750j(model, "model");
        AbstractC25265s.m74093D1(new C18284j(model.getWeightPoundsMinValue(), model.getWeightPoundsMaxValue(), 1));
        return new C17025c(model.getTitle(), model.getSubtitle(), new AbstractC22403o.c(model.getImageUrl(), 0, 0, 0, 14, null), model.getImperialTitle(), model.getMetricTitle(), model.getHeightTitle(), model.getWeightTitle(), model.getHeightFeetMinValue(), model.getHeightFeetMaxValue(), model.getHeightCentimetersMinValue(), model.getHeightCentimetersMaxValue(), model.getFeetText(), model.getInchesText(), model.getCentimetersText(), model.getWeightPoundsMinValue(), model.getWeightPoundsMaxValue(), model.getWeightKilogramsMinValue(), model.getWeightKilogramsMaxValue(), model.getPoundsText(), model.getKilogramsText(), model.getHeightCentimetersPreselectedValue(), model.getWeightPoundsPreselectedValue(), UnitSystem.IMPERIAL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C31064f m52292Q(BillingFrequencyStepModel model) {
        EnumC31059a enumC31059a;
        AbstractC22676k.m65750j(model, "model");
        TextResource title = model.getTitle();
        TextResource subtitle = model.getSubtitle();
        List<BillingFrequencyTile> tiles = model.getTiles();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(tiles, 10));
        for (BillingFrequencyTile billingFrequencyTile : tiles) {
            TextResource text = billingFrequencyTile.getText();
            TextResource subtext = billingFrequencyTile.getSubtext();
            TextResource upsellText = billingFrequencyTile.getUpsellText();
            String billingFrequency = billingFrequencyTile.getBillingFrequency();
            EnumC31059a[] enumC31059aArrValues = EnumC31059a.values();
            int length = enumC31059aArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    enumC31059a = null;
                    break;
                }
                enumC31059a = enumC31059aArrValues[i13];
                if (AbstractC22676k.m65745e(enumC31059a.name(), billingFrequency)) {
                    break;
                }
                i13++;
            }
            arrayList.add(new C31063e(text, subtext, upsellText, enumC31059a));
        }
        return new C31064f(title, subtitle, arrayList, null, model.getDisclaimerText(), model.getAnalyticsName(), m52335q0(model.getTiles()), 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C12885h m52293R(GenderStepModel model) {
        AbstractC22676k.m65750j(model, "model");
        AbstractC22403o.c cVar = new AbstractC22403o.c(model.getImageUrl(), 0, 0, 0, 14, null);
        TextResource title = model.getTitle();
        String subtitle = model.getSubtitle();
        List<GenderOptionsModel> genderOptions = model.getGenderOptions();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(genderOptions, 10));
        for (GenderOptionsModel genderOptionsModel : genderOptions) {
            arrayList.add(new C12880c(genderOptionsModel.getText(), genderOptionsModel.getType(), false, null, 12, null));
        }
        String analyticsName = model.getAnalyticsName();
        TextResource title2 = model.getDialogInfo().getTitle();
        TextResource subtitle2 = model.getDialogInfo().getSubtitle();
        TextResource cta = model.getDialogInfo().getCta();
        TextResource cancelCta = model.getDialogInfo().getCancelCta();
        List<GenderBaselineOptions> baselineOptions = model.getDialogInfo().getBaselineOptions();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(baselineOptions, 10));
        for (GenderBaselineOptions genderBaselineOptions : baselineOptions) {
            arrayList2.add(new C12878a(genderBaselineOptions.getText(), genderBaselineOptions.getType(), false, 4, null));
        }
        return new C12885h(title, subtitle, cVar, arrayList, null, null, new C12879b(title2, subtitle2, cta, cancelCta, arrayList2), analyticsName, false, 304, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C31100g m52294S(PrivacyConsentModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C31100g(new AbstractC22403o.c(model.getImageUrl(), 0, 0, 0, 14, null), model.getTitle(), model.getSubtitle(), model.getSelectAllCtaTitle(), model.getJumpCtaTitle(), model.getAcceptCtaTitle(), m52327m0(model.getConsents(), model.getAdditionalConsents()), model.getAnalyticsName(), false, false, false, null, null, null, null, 32512, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C38068c m52295T(DeidentifiedStepModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C38068c(model.getTitle(), model.getSubtitle(), model.getBody());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C15601g m52296U(HealthConnectStepModel model) {
        AbstractC22676k.m65750j(model, "model");
        TextResource title = model.getTitle();
        TextResource subtitle = model.getSubtitle();
        String learnMore = model.getLearnMore();
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getNavigationBarText());
        String imageUrl = model.getImageUrl();
        return new C15601g(imageUrl != null ? new AbstractC22403o.c(imageUrl, 0, 0, 0, 14, null) : null, title, subtitle, learnMore, textResourceM21278l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C22300c m52297V(JoinTeamStepModel model) {
        EnumC22301d enumC22301d;
        EnumC22301d enumC22301d2;
        AbstractC22676k.m65750j(model, "model");
        TextResource title = model.getTitle();
        String titleSize = model.getTitleSize();
        EnumC22301d enumC22301d3 = EnumC22301d.SMALL;
        EnumC22301d[] enumC22301dArrValues = EnumC22301d.values();
        int length = enumC22301dArrValues.length;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                enumC22301d = null;
                break;
            }
            enumC22301d = enumC22301dArrValues[i14];
            if (AbstractC22676k.m65745e(enumC22301d.name(), titleSize)) {
                break;
            }
            i14++;
        }
        EnumC22301d enumC22301d4 = enumC22301d == null ? enumC22301d3 : enumC22301d;
        TextResource subtitle = model.getSubtitle();
        String subtitleSize = model.getSubtitleSize();
        EnumC22301d enumC22301d5 = EnumC22301d.SMALL;
        EnumC22301d[] enumC22301dArrValues2 = EnumC22301d.values();
        int length2 = enumC22301dArrValues2.length;
        while (true) {
            if (i13 >= length2) {
                enumC22301d2 = null;
                break;
            }
            enumC22301d2 = enumC22301dArrValues2[i13];
            if (AbstractC22676k.m65745e(enumC22301d2.name(), subtitleSize)) {
                break;
            }
            i13++;
        }
        EnumC22301d enumC22301d6 = enumC22301d2 == null ? enumC22301d5 : enumC22301d2;
        String avatarUrl = model.getAvatarUrl();
        return new C22300c(title, enumC22301d4, subtitle, enumC22301d6, avatarUrl != null ? new AbstractC22403o.c(avatarUrl, 0, 0, 0, 14, null) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C36953c m52298W(WelcomeTransitionStepModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C36953c(model.getTitle(), model.getSubtitle(), new AbstractC22403o.c(model.getImageUrl(), 0, 0, 0, 14, null), new AbstractC22403o.c(model.getAnimatedImageUrl(), 0, 0, 0, 14, null), null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C25223e m52299X(EnterEmailStepModel model) {
        Object next;
        AbstractC22676k.m65750j(model, "model");
        AbstractC22403o.c cVar = new AbstractC22403o.c(model.getImageUrl(), 0, 0, 0, 14, null);
        TextResource title = model.getTitle();
        String subtitle = model.getSubtitle();
        Iterator<T> it = model.getTextEntries().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC17176i.m48520v(((ActivationFlowTextEntry) next).getFieldType(), Locale.ROOT, "toUpperCase(...)", "EMAIL"));
        ActivationFlowTextEntry activationFlowTextEntry = (ActivationFlowTextEntry) next;
        return new C25223e(cVar, title, subtitle, AbstractC8693b.m21278l(activationFlowTextEntry != null ? activationFlowTextEntry.getText() : null), m52333p0(model.getTextEntries()), model.getAnalyticsName(), model.getDialogInfo(), model.getMarketingOptInText(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C2885g m52300Y(EnterYourPasswordStepModel model) {
        Object next;
        AbstractC22676k.m65750j(model, "model");
        AbstractC22403o.c cVar = new AbstractC22403o.c(model.getImageUrl(), 0, 0, 0, 14, null);
        TextResource title = model.getTitle();
        String subtitle = model.getSubtitle();
        Iterator<T> it = model.getTextEntries().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC17176i.m48520v(((ActivationFlowTextEntry) next).getFieldType(), Locale.ROOT, "toUpperCase(...)", "PASSWORD"));
        ActivationFlowTextEntry activationFlowTextEntry = (ActivationFlowTextEntry) next;
        return new C2885g(cVar, title, subtitle, AbstractC8693b.m21278l(activationFlowTextEntry != null ? activationFlowTextEntry.getText() : null), new C11751e(null, 1, null), false, model.getForgotPasswordText(), model.getAnalyticsName(), new C11749c(null, 1, null), null, null, 1568, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C35795c m52301Z(CreatePasswordStepModel model) {
        Object next;
        AbstractC22676k.m65750j(model, "model");
        AbstractC22403o.c cVar = new AbstractC22403o.c(model.getImageUrl(), 0, 0, 0, 14, null);
        TextResource title = model.getTitle();
        String subtitle = model.getSubtitle();
        Iterator<T> it = model.getTextEntries().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC17176i.m48520v(((ActivationFlowTextEntry) next).getFieldType(), Locale.ROOT, "toUpperCase(...)", "PASSWORD"));
        ActivationFlowTextEntry activationFlowTextEntry = (ActivationFlowTextEntry) next;
        return new C35795c(cVar, title, subtitle, AbstractC8693b.m21278l(activationFlowTextEntry != null ? activationFlowTextEntry.getText() : null), model.getDisclaimerText(), model.getAnalyticsName(), new C11751e(null, 1, null), model.getCtaText(), ActivationFlowCtaDestinations.INSTANCE.toActivationFlowDestination(model.getCtaDestination()), C25271y.f99162w, true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C33594d m52303a0(CheckYourEmailStepModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C33594d(new AbstractC22403o.c(model.getImageUrl(), 0, 0, 0, 14, null), model.getTitle(), model.getSubtitle(), model.getBody(), model.getAnalyticsName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final C11812c m52305b0(FamilyPlanBlockStepModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C11812c(new AbstractC22403o.c(model.getImageUrl(), 0, 0, 0, 14, null), model.getTitle(), model.getSubtitle(), model.getAnalyticsName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final C4325b m52307c0(HeroWithFooterCtaStepModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C4325b(new AbstractC22403o.c(model.getImageUrl(), 0, 0, 0, 14, null), AbstractC8693b.m21278l(model.getTitle()), AbstractC8693b.m21278l(model.getSubtitle()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final C34655c m52309d0(UniversalPaymentMethodStepModel model) {
        InterfaceC25312u interfaceC25312uM60544l;
        AbstractC22676k.m65750j(model, "model");
        List<DesignSystemModel> items = model.getItems();
        ArrayList arrayList = new ArrayList();
        for (DesignSystemModel designSystemModel : items) {
            if (designSystemModel instanceof MiniArchStripePaymentSheetTileModel) {
                MiniArchStripePaymentSheetTileModel miniArchStripePaymentSheetTileModel = (MiniArchStripePaymentSheetTileModel) designSystemModel;
                interfaceC25312uM60544l = new C23323b(miniArchStripePaymentSheetTileModel.getPath(), miniArchStripePaymentSheetTileModel.getUpdatePath(), model.getAnalyticsName());
            } else {
                interfaceC25312uM60544l = f70729a.m60544l(designSystemModel);
            }
            if (interfaceC25312uM60544l != null) {
                arrayList.add(interfaceC25312uM60544l);
            }
        }
        return new C34655c(new AbstractC22403o.c(model.getImageUrl(), 0, 0, 0, 14, null), arrayList, model.getMobileScreenName(), model.getAnalyticsName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final C25286c m52311e0(NameInformationStepModel model) {
        Object next;
        Object next2;
        Object next3;
        AbstractC22676k.m65750j(model, "model");
        Iterator<T> it = model.getTextEntries().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC17176i.m48520v(((ActivationFlowTextEntry) next).getFieldType(), Locale.ROOT, "toUpperCase(...)", "FIRST_NAME"));
        ActivationFlowTextEntry activationFlowTextEntry = (ActivationFlowTextEntry) next;
        Iterator<T> it3 = model.getTextEntries().iterator();
        do {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it3.next();
        } while (!AbstractC17176i.m48520v(((ActivationFlowTextEntry) next2).getFieldType(), Locale.ROOT, "toUpperCase(...)", "LAST_NAME"));
        ActivationFlowTextEntry activationFlowTextEntry2 = (ActivationFlowTextEntry) next2;
        Iterator<T> it4 = model.getTextEntries().iterator();
        do {
            if (!it4.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it4.next();
        } while (!AbstractC17176i.m48520v(((ActivationFlowTextEntry) next3).getFieldType(), Locale.ROOT, "toUpperCase(...)", "USERNAME"));
        ActivationFlowTextEntry activationFlowTextEntry3 = (ActivationFlowTextEntry) next3;
        return new C25286c(new AbstractC22403o.c(model.getImageUrl(), 0, 0, 0, 14, null), model.getTitle(), model.getSubtitle(), AbstractC8693b.m21278l(activationFlowTextEntry != null ? activationFlowTextEntry.getText() : null), activationFlowTextEntry != null ? activationFlowTextEntry.getPreFill() : null, activationFlowTextEntry != null ? activationFlowTextEntry.isReadOnly() : false, AbstractC8693b.m21278l(activationFlowTextEntry2 != null ? activationFlowTextEntry2.getText() : null), activationFlowTextEntry2 != null ? activationFlowTextEntry2.getPreFill() : null, activationFlowTextEntry2 != null ? activationFlowTextEntry2.isReadOnly() : false, AbstractC8693b.m21278l(activationFlowTextEntry3 != null ? activationFlowTextEntry3.getText() : null), activationFlowTextEntry3 != null ? activationFlowTextEntry3.getPreFill() : null, activationFlowTextEntry3 != null ? activationFlowTextEntry3.isReadOnly() : false, model.getAnalyticsName(), false, false, 24576, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final C32256d m52313f0(BirthdayStepModel model) {
        AbstractC22676k.m65750j(model, "model");
        LocalDate localDate = LocalDate.parse(model.getAgeLimit(), AbstractC10538f.m27186k());
        LocalDate localDate2 = LocalDate.parse(model.getMaxAgeLimit(), AbstractC10538f.m27186k());
        TextResource title = model.getTitle();
        String subtitle = model.getSubtitle();
        AbstractC22403o.c cVar = new AbstractC22403o.c(model.getImageUrl(), 0, 0, 0, 14, null);
        AbstractC22676k.m65747g(localDate);
        long jMillis = JodaTimeUtilKt.millis(localDate);
        AbstractC22676k.m65747g(localDate2);
        return new C32256d(title, subtitle, cVar, jMillis, JodaTimeUtilKt.millis(localDate2), new C18284j(localDate2.getYear(), localDate.getYear(), 1), false, model.getAnalyticsName(), null, 320, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final C26475e m52315g0(NotificationsStepModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C26475e(model.getTitle(), model.getSubtitle(), AbstractC8693b.m21278l(model.getNavigationBarText()), model.getIcons(), new AbstractC22403o.c(model.getImageUrl(), 0, 0, 0, 14, null), false, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final C29002j m52317h0(PaymentMethodStepModel model) {
        C4092p2 c4092p2;
        Object next;
        Object next2;
        Object next3;
        Object next4;
        Object next5;
        AbstractC22676k.m65750j(model, "model");
        TextResource title = model.getTitle();
        TextResource subtitle = model.getSubtitle();
        InfoCalloutTileModel infoCalloutTile = model.getInfoCalloutTile();
        if (infoCalloutTile != null) {
            InterfaceC25312u interfaceC25312uM60541h = AbstractC21537c.m60554d(new C18210a(18)).m60541h(infoCalloutTile);
            AbstractC22676k.m65748h(interfaceC25312uM60541h, "null cannot be cast to non-null type com.whoop.design.atomic.molecule.tile.InfoCalloutState");
            c4092p2 = (C4092p2) interfaceC25312uM60541h;
        } else {
            c4092p2 = null;
        }
        List<AcceptedPaymentType> acceptedPaymentTypes = model.getAcceptedPaymentTypes();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(acceptedPaymentTypes, 10));
        for (AcceptedPaymentType acceptedPaymentType : acceptedPaymentTypes) {
            arrayList.add(new C29005m(new AbstractC22403o.c(acceptedPaymentType.getImageUrl(), 0, 0, 0, 14, null), acceptedPaymentType.getAccessibilityName()));
        }
        Iterator<T> it = model.getTextEntries().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC17176i.m48520v(((ActivationFlowTextEntry) next).getFieldType(), Locale.ROOT, "toUpperCase(...)", "CARD_NUMBER"));
        ActivationFlowTextEntry activationFlowTextEntry = (ActivationFlowTextEntry) next;
        C29003k c29003k = new C29003k(AbstractC8693b.m21278l(activationFlowTextEntry != null ? activationFlowTextEntry.getText() : null), null, 2, null);
        Iterator<T> it3 = model.getTextEntries().iterator();
        do {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it3.next();
        } while (!AbstractC17176i.m48520v(((ActivationFlowTextEntry) next2).getFieldType(), Locale.ROOT, "toUpperCase(...)", "CARD_EXPIRATION_DATE"));
        ActivationFlowTextEntry activationFlowTextEntry2 = (ActivationFlowTextEntry) next2;
        TextResource textResourceM21278l = AbstractC8693b.m21278l(activationFlowTextEntry2 != null ? activationFlowTextEntry2.getText() : null);
        Iterator<T> it4 = model.getTextEntries().iterator();
        do {
            if (!it4.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it4.next();
        } while (!AbstractC17176i.m48520v(((ActivationFlowTextEntry) next3).getFieldType(), Locale.ROOT, "toUpperCase(...)", "CARD_EXPIRATION_DATE"));
        ActivationFlowTextEntry activationFlowTextEntry3 = (ActivationFlowTextEntry) next3;
        C29003k c29003k2 = new C29003k(textResourceM21278l, AbstractC8693b.m21278l(activationFlowTextEntry3 != null ? activationFlowTextEntry3.getPreFill() : null));
        Iterator<T> it5 = model.getTextEntries().iterator();
        do {
            if (!it5.hasNext()) {
                next4 = null;
                break;
            }
            next4 = it5.next();
        } while (!AbstractC17176i.m48520v(((ActivationFlowTextEntry) next4).getFieldType(), Locale.ROOT, "toUpperCase(...)", "CARD_CVV"));
        ActivationFlowTextEntry activationFlowTextEntry4 = (ActivationFlowTextEntry) next4;
        C29003k c29003k3 = new C29003k(AbstractC8693b.m21278l(activationFlowTextEntry4 != null ? activationFlowTextEntry4.getText() : null), null, 2, null);
        Iterator<T> it6 = model.getTextEntries().iterator();
        do {
            if (!it6.hasNext()) {
                next5 = null;
                break;
            }
            next5 = it6.next();
        } while (!AbstractC17176i.m48520v(((ActivationFlowTextEntry) next5).getFieldType(), Locale.ROOT, "toUpperCase(...)", "CARD_ZIP_CODE"));
        ActivationFlowTextEntry activationFlowTextEntry5 = (ActivationFlowTextEntry) next5;
        C29004l c29004l = new C29004l(c29003k, c29003k2, c29003k3, new C29003k(AbstractC8693b.m21278l(activationFlowTextEntry5 != null ? activationFlowTextEntry5.getText() : null), null, 2, null));
        String analyticsValue = model.getAnalyticsValue();
        String upcycleJoinTodaySubtitle = model.getUpcycleJoinTodaySubtitle();
        String upcycleCreditCardVariant = model.getUpcycleCreditCardVariant();
        return new C29002j(title, subtitle, arrayList, c29004l, c4092p2, model.getErrorMessages(), model.getAnalyticsName(), model.getDisclaimerText(), null, null, null, null, null, null, false, false, null, upcycleJoinTodaySubtitle, upcycleCreditCardVariant != null ? UpcycleCreditCardVariant.INSTANCE.fromValue(upcycleCreditCardVariant) : null, null, null, analyticsValue, 1703680, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final C23454a0 m52319i0(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final C32292h m52321j0(ReferAFriendCodesModel model) {
        AbstractC22676k.m65750j(model, "model");
        TextResource title = model.getTitle();
        String subtitle = model.getSubtitle();
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getNavigationBarText());
        AbstractC22403o.c cVar = new AbstractC22403o.c(model.getImageUrl(), 0, 0, 0, 14, null);
        List<RafCodeModel> freeTrialCodes = model.getFreeTrialCodes();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(freeTrialCodes, 10));
        for (RafCodeModel rafCodeModel : freeTrialCodes) {
            arrayList.add(new C32287c(true, rafCodeModel.getCode(), new AbstractC22403o.c(rafCodeModel.getImageUrl(), 0, 0, 0, 14, null), rafCodeModel.getCtaText(), rafCodeModel.getSharedCtaText(), rafCodeModel.getSharedText()));
        }
        String analyticsName = model.getAnalyticsName();
        String referralType = model.getReferralType();
        TextResource title2 = model.getHowItWorks().getTitle();
        List<RafHowItWorksInstructionModel> instructions = model.getHowItWorks().getInstructions();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(instructions, 10));
        for (RafHowItWorksInstructionModel rafHowItWorksInstructionModel : instructions) {
            arrayList2.add(new C32285a(rafHowItWorksInstructionModel.getText(), rafHowItWorksInstructionModel.getIcon()));
        }
        return new C32292h(title, subtitle, cVar, textResourceM21278l, arrayList, analyticsName, referralType, new C32286b(title2, arrayList2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final C35830v m52323k0(UpcyclePlanPickerModel model) {
        AbstractC22676k.m65750j(model, "model");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getTitle());
        TextResource subtitle = model.getSubtitle();
        List<PlanOption> planOptions = model.getPlanOptions();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(planOptions, 10));
        for (PlanOption planOption : planOptions) {
            TextResource title = planOption.getTitle();
            TextResource subtitle2 = planOption.getSubtitle();
            TextResource price = planOption.getPrice();
            TextResource priceSubtitle = planOption.getPriceSubtitle();
            String disclaimer = planOption.getDisclaimer();
            String strikethroughPrice = planOption.getStrikethroughPrice();
            String tag = planOption.getTag();
            arrayList.add(new C35827s(title, subtitle2, price, priceSubtitle, disclaimer, strikethroughPrice, tag != null ? AbstractC8693b.m21278l(tag) : null, planOption.getSelected(), planOption.getMembershipTier(), planOption.getTrackingLabel(), planOption.getCommitmentType(), null, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS, null));
        }
        return new C35830v(textResourceM21278l, arrayList, subtitle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final C35823o m52325l0(TrialPlanPickerModel model) {
        AbstractC22676k.m65750j(model, "model");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getTitle());
        TextResource subtitle = model.getSubtitle();
        AbstractC22403o.c cVar = new AbstractC22403o.c(model.getImageUrl(), 0, 0, 0, 14, null);
        List<TrialPlanOption> planOptions = model.getPlanOptions();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(planOptions, 10));
        for (TrialPlanOption trialPlanOption : planOptions) {
            TextResource title = trialPlanOption.getTitle();
            TextResource subtitle2 = trialPlanOption.getSubtitle();
            TextResource price = trialPlanOption.getPrice();
            TextResource priceSubtitle = trialPlanOption.getPriceSubtitle();
            String disclaimer = trialPlanOption.getDisclaimer();
            String strikethroughPrice = trialPlanOption.getStrikethroughPrice();
            String tag = trialPlanOption.getTag();
            arrayList.add(new C35819k(title, subtitle2, price, priceSubtitle, disclaimer, strikethroughPrice, tag != null ? AbstractC8693b.m21278l(tag) : null, trialPlanOption.getSelected(), trialPlanOption.getMembershipTier(), trialPlanOption.getTrackingLabel(), trialPlanOption.getCommitmentType(), trialPlanOption.getShouldSkipNextScreen(), null, 4096, null));
        }
        return new C35823o(cVar, textResourceM21278l, subtitle, arrayList, model.getAnalyticsName());
    }

    /* JADX INFO: renamed from: m0 */
    private static final List<C31103j> m52327m0(List<ConsentsModel> list, List<ConsentsModel> list2) {
        return list2 != null ? AbstractC25265s.m74129g1(m52337r0(list), m52337r0(list2)) : m52337r0(list);
    }

    /* JADX INFO: renamed from: n0 */
    public static final C21535a m52329n0() {
        return f70730b;
    }

    /* JADX INFO: renamed from: o0 */
    private static final List<String> m52331o0(int i13) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("--");
        int i14 = 1;
        if (1 <= i13) {
            while (true) {
                arrayList.add(String.valueOf(i14));
                if (i14 == i13) {
                    break;
                }
                i14++;
            }
        }
        return AbstractC25265s.m74093D1(arrayList);
    }

    /* JADX INFO: renamed from: p0 */
    private static final C11749c m52333p0(List<ActivationFlowTextEntry> list) {
        Object next;
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC39421y.m125921F(((ActivationFlowTextEntry) next).getFieldType(), "EMAIL", true));
        ActivationFlowTextEntry activationFlowTextEntry = (ActivationFlowTextEntry) next;
        String preFill = activationFlowTextEntry != null ? activationFlowTextEntry.getPreFill() : null;
        if (preFill == null) {
            preFill = "";
        }
        return new C11749c(preFill);
    }

    /* JADX INFO: renamed from: q0 */
    private static final boolean m52335q0(List<BillingFrequencyTile> list) {
        EnumC31059a enumC31059a;
        List<BillingFrequencyTile> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            String billingFrequency = ((BillingFrequencyTile) it.next()).getBillingFrequency();
            EnumC31059a[] enumC31059aArrValues = EnumC31059a.values();
            int length = enumC31059aArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    enumC31059a = null;
                    break;
                }
                enumC31059a = enumC31059aArrValues[i13];
                if (AbstractC22676k.m65745e(enumC31059a.name(), billingFrequency)) {
                    break;
                }
                i13++;
            }
            if (enumC31059a == null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: r0 */
    private static final List<C31103j> m52337r0(List<ConsentsModel> list) {
        Iterator it;
        EnumC31097d enumC31097d;
        List<ConsentsModel> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            ConsentsModel consentsModel = (ConsentsModel) it3.next();
            String id4 = consentsModel.getId();
            String consentText = consentsModel.getConsentText();
            boolean consentRequired = consentsModel.getConsentRequired();
            boolean expansionRequired = consentsModel.getExpansionRequired();
            TermExpansion expansionType = consentsModel.getExpansionType();
            String region = consentsModel.getRegion();
            String fullTermsUrl = consentsModel.getFullTermsUrl();
            boolean bottomScrollAllowed = consentsModel.getBottomScrollAllowed();
            String consent = consentsModel.getConsent();
            String consent2 = consentsModel.getConsent();
            EnumC31097d[] enumC31097dArrValues = EnumC31097d.values();
            int length = enumC31097dArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    it = it3;
                    enumC31097d = null;
                    break;
                }
                enumC31097d = enumC31097dArrValues[i13];
                it = it3;
                if (AbstractC22676k.m65745e(enumC31097d.name(), consent2)) {
                    break;
                }
                i13++;
                it3 = it;
            }
            arrayList.add(new C31103j(id4, region, fullTermsUrl, consentText, consentRequired, expansionRequired, expansionType, bottomScrollAllowed, consent, enumC31097d, null, false, false, 7168, null));
            it3 = it;
        }
        return arrayList;
    }
}
