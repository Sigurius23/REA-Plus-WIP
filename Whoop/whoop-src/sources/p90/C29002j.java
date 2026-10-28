package p90;

import androidx.profileinstaller.ProfileVerifier;
import c41.C4092p2;
import com.whoop.activation.domain.models.steps.CommitmentType;
import com.whoop.activation.domain.models.steps.PaymentErrorMessages;
import com.whoop.activation.domain.models.steps.UpcycleCreditCardVariant;
import com.whoop.design.util.TextResource;
import d70.C11753g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import q22.C29855e;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: p90.j */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b4\b\u0087\b\u0018\u00002\u00020\u0001Bõ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\b\b\u0002\u0010#\u001a\u00020\"\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b&\u0010'J\u008a\u0002\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u001a2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010#\u001a\u00020\"2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020,HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u00020\u001a2\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u00103\u001a\u0004\b7\u00105R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b8\u0010:R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b7\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\b>\u0010+R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bH\u00103\u001a\u0004\bH\u00105R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bD\u0010G\u001a\u0004\bM\u0010+R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bK\u0010G\u001a\u0004\bN\u0010+R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b@\u0010O\u001a\u0004\bP\u0010QR\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bN\u0010G\u001a\u0004\bV\u0010+R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b<\u0010W\u001a\u0004\bX\u0010YR\u0017\u0010\u001c\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\bZ\u0010W\u001a\u0004\bZ\u0010YR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\bM\u0010[\u001a\u0004\bI\u0010\\R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b4\u0010G\u001a\u0004\b]\u0010+R\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b^\u0010`R\u0017\u0010#\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b]\u0010a\u001a\u0004\bR\u0010bR\u0019\u0010$\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bV\u0010G\u001a\u0004\bB\u0010+R\u0019\u0010%\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bX\u0010G\u001a\u0004\bF\u0010+¨\u0006c"}, m65681d2 = {"Lp90/j;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "", "Lp90/m;", "acceptedPaymentTypes", "Lp90/l;", "paymentMethodTextFields", "Lc41/p2;", "infoCalloutTitleState", "Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages;", "errorMessages", "", "analyticsName", "disclaimerText", "Lq22/e;", "formValidator", "stripeToken", "paymentMethodId", "Lcom/whoop/activation/domain/models/steps/CommitmentType;", "commitmentType", "Ld70/g;", "cardZip", "userCountryCode", "", "isLoadingStripeToken", "showFullScreenError", "Lp90/f;", "errorCalloutState", "upcycleJoinTodaySubtitle", "Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;", "upcycleCreditCardVariant", "Lp90/e;", "initialValues", "analyticsScreenCopy", "analyticsValue", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lp90/l;Lc41/p2;Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lq22/e;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/activation/domain/models/steps/CommitmentType;Ld70/g;Ljava/lang/String;ZZLp90/f;Ljava/lang/String;Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;Lp90/e;Ljava/lang/String;Ljava/lang/String;)V", "a", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lp90/l;Lc41/p2;Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lq22/e;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/activation/domain/models/steps/CommitmentType;Ld70/g;Ljava/lang/String;ZZLp90/f;Ljava/lang/String;Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;Lp90/e;Ljava/lang/String;Ljava/lang/String;)Lp90/j;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "r", "()Lcom/whoop/design/util/TextResource;", "b", "d", "c", "Ljava/util/List;", "()Ljava/util/List;", "Lp90/l;", "o", "()Lp90/l;", "e", "Lc41/p2;", "l", "()Lc41/p2;", "f", "Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages;", "j", "()Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages;", "g", "Ljava/lang/String;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "Lq22/e;", "k", "()Lq22/e;", "q", "n", "Lcom/whoop/activation/domain/models/steps/CommitmentType;", "getCommitmentType", "()Lcom/whoop/activation/domain/models/steps/CommitmentType;", "m", "Ld70/g;", "getCardZip", "()Ld70/g;", "u", "Z", "v", "()Z", "p", "Lp90/f;", "()Lp90/f;", "t", "s", "Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;", "()Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;", "Lp90/e;", "()Lp90/e;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C29002j implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<C29005m> acceptedPaymentTypes;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C29004l paymentMethodTextFields;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C4092p2 infoCalloutTitleState;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final PaymentErrorMessages errorMessages;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String analyticsName;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final TextResource disclaimerText;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C29855e formValidator;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final String stripeToken;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final String paymentMethodId;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final CommitmentType commitmentType;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final C11753g cardZip;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final String userCountryCode;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final boolean isLoadingStripeToken;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final boolean showFullScreenError;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final C28998f errorCalloutState;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final String upcycleJoinTodaySubtitle;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final UpcycleCreditCardVariant upcycleCreditCardVariant;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final C28997e initialValues;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final String analyticsScreenCopy;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final String analyticsValue;

    public C29002j(TextResource title, TextResource subtitle, List<C29005m> acceptedPaymentTypes, C29004l paymentMethodTextFields, C4092p2 c4092p2, PaymentErrorMessages errorMessages, String analyticsName, TextResource textResource, C29855e c29855e, String str, String str2, CommitmentType commitmentType, C11753g cardZip, String str3, boolean z4, boolean z13, C28998f c28998f, String str4, UpcycleCreditCardVariant upcycleCreditCardVariant, C28997e initialValues, String str5, String str6) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(acceptedPaymentTypes, "acceptedPaymentTypes");
        AbstractC22676k.m65750j(paymentMethodTextFields, "paymentMethodTextFields");
        AbstractC22676k.m65750j(errorMessages, "errorMessages");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        AbstractC22676k.m65750j(cardZip, "cardZip");
        AbstractC22676k.m65750j(initialValues, "initialValues");
        this.title = title;
        this.subtitle = subtitle;
        this.acceptedPaymentTypes = acceptedPaymentTypes;
        this.paymentMethodTextFields = paymentMethodTextFields;
        this.infoCalloutTitleState = c4092p2;
        this.errorMessages = errorMessages;
        this.analyticsName = analyticsName;
        this.disclaimerText = textResource;
        this.formValidator = c29855e;
        this.stripeToken = str;
        this.paymentMethodId = str2;
        this.commitmentType = commitmentType;
        this.cardZip = cardZip;
        this.userCountryCode = str3;
        this.isLoadingStripeToken = z4;
        this.showFullScreenError = z13;
        this.errorCalloutState = c28998f;
        this.upcycleJoinTodaySubtitle = str4;
        this.upcycleCreditCardVariant = upcycleCreditCardVariant;
        this.initialValues = initialValues;
        this.analyticsScreenCopy = str5;
        this.analyticsValue = str6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C29002j m88095b(C29002j c29002j, TextResource textResource, TextResource textResource2, List list, C29004l c29004l, C4092p2 c4092p2, PaymentErrorMessages paymentErrorMessages, String str, TextResource textResource3, C29855e c29855e, String str2, String str3, CommitmentType commitmentType, C11753g c11753g, String str4, boolean z4, boolean z13, C28998f c28998f, String str5, UpcycleCreditCardVariant upcycleCreditCardVariant, C28997e c28997e, String str6, String str7, int i13, Object obj) {
        String str8;
        String str9;
        TextResource textResource4 = (i13 & 1) != 0 ? c29002j.title : textResource;
        TextResource textResource5 = (i13 & 2) != 0 ? c29002j.subtitle : textResource2;
        List list2 = (i13 & 4) != 0 ? c29002j.acceptedPaymentTypes : list;
        C29004l c29004l2 = (i13 & 8) != 0 ? c29002j.paymentMethodTextFields : c29004l;
        C4092p2 c4092p3 = (i13 & 16) != 0 ? c29002j.infoCalloutTitleState : c4092p2;
        PaymentErrorMessages paymentErrorMessages2 = (i13 & 32) != 0 ? c29002j.errorMessages : paymentErrorMessages;
        String str10 = (i13 & 64) != 0 ? c29002j.analyticsName : str;
        TextResource textResource6 = (i13 & 128) != 0 ? c29002j.disclaimerText : textResource3;
        C29855e c29855e2 = (i13 & 256) != 0 ? c29002j.formValidator : c29855e;
        String str11 = (i13 & 512) != 0 ? c29002j.stripeToken : str2;
        String str12 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c29002j.paymentMethodId : str3;
        CommitmentType commitmentType2 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c29002j.commitmentType : commitmentType;
        C11753g c11753g2 = (i13 & 4096) != 0 ? c29002j.cardZip : c11753g;
        String str13 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c29002j.userCountryCode : str4;
        TextResource textResource7 = textResource4;
        boolean z14 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c29002j.isLoadingStripeToken : z4;
        boolean z15 = (i13 & 32768) != 0 ? c29002j.showFullScreenError : z13;
        C28998f c28998f2 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? c29002j.errorCalloutState : c28998f;
        String str14 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? c29002j.upcycleJoinTodaySubtitle : str5;
        UpcycleCreditCardVariant upcycleCreditCardVariant2 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? c29002j.upcycleCreditCardVariant : upcycleCreditCardVariant;
        C28997e c28997e2 = (i13 & 524288) != 0 ? c29002j.initialValues : c28997e;
        String str15 = (i13 & 1048576) != 0 ? c29002j.analyticsScreenCopy : str6;
        if ((i13 & 2097152) != 0) {
            str9 = str15;
            str8 = c29002j.analyticsValue;
        } else {
            str8 = str7;
            str9 = str15;
        }
        return c29002j.m88096a(textResource7, textResource5, list2, c29004l2, c4092p3, paymentErrorMessages2, str10, textResource6, c29855e2, str11, str12, commitmentType2, c11753g2, str13, z14, z15, c28998f2, str14, upcycleCreditCardVariant2, c28997e2, str9, str8);
    }

    /* JADX INFO: renamed from: a */
    public final C29002j m88096a(TextResource title, TextResource subtitle, List<C29005m> acceptedPaymentTypes, C29004l paymentMethodTextFields, C4092p2 infoCalloutTitleState, PaymentErrorMessages errorMessages, String analyticsName, TextResource disclaimerText, C29855e formValidator, String stripeToken, String paymentMethodId, CommitmentType commitmentType, C11753g cardZip, String userCountryCode, boolean isLoadingStripeToken, boolean showFullScreenError, C28998f errorCalloutState, String upcycleJoinTodaySubtitle, UpcycleCreditCardVariant upcycleCreditCardVariant, C28997e initialValues, String analyticsScreenCopy, String analyticsValue) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(acceptedPaymentTypes, "acceptedPaymentTypes");
        AbstractC22676k.m65750j(paymentMethodTextFields, "paymentMethodTextFields");
        AbstractC22676k.m65750j(errorMessages, "errorMessages");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        AbstractC22676k.m65750j(cardZip, "cardZip");
        AbstractC22676k.m65750j(initialValues, "initialValues");
        return new C29002j(title, subtitle, acceptedPaymentTypes, paymentMethodTextFields, infoCalloutTitleState, errorMessages, analyticsName, disclaimerText, formValidator, stripeToken, paymentMethodId, commitmentType, cardZip, userCountryCode, isLoadingStripeToken, showFullScreenError, errorCalloutState, upcycleJoinTodaySubtitle, upcycleCreditCardVariant, initialValues, analyticsScreenCopy, analyticsValue);
    }

    /* JADX INFO: renamed from: c */
    public final List<C29005m> m88097c() {
        return this.acceptedPaymentTypes;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C29002j)) {
            return false;
        }
        C29002j c29002j = (C29002j) other;
        return AbstractC22676k.m65745e(this.title, c29002j.title) && AbstractC22676k.m65745e(this.subtitle, c29002j.subtitle) && AbstractC22676k.m65745e(this.acceptedPaymentTypes, c29002j.acceptedPaymentTypes) && AbstractC22676k.m65745e(this.paymentMethodTextFields, c29002j.paymentMethodTextFields) && AbstractC22676k.m65745e(this.infoCalloutTitleState, c29002j.infoCalloutTitleState) && AbstractC22676k.m65745e(this.errorMessages, c29002j.errorMessages) && AbstractC22676k.m65745e(this.analyticsName, c29002j.analyticsName) && AbstractC22676k.m65745e(this.disclaimerText, c29002j.disclaimerText) && AbstractC22676k.m65745e(this.formValidator, c29002j.formValidator) && AbstractC22676k.m65745e(this.stripeToken, c29002j.stripeToken) && AbstractC22676k.m65745e(this.paymentMethodId, c29002j.paymentMethodId) && this.commitmentType == c29002j.commitmentType && AbstractC22676k.m65745e(this.cardZip, c29002j.cardZip) && AbstractC22676k.m65745e(this.userCountryCode, c29002j.userCountryCode) && this.isLoadingStripeToken == c29002j.isLoadingStripeToken && this.showFullScreenError == c29002j.showFullScreenError && AbstractC22676k.m65745e(this.errorCalloutState, c29002j.errorCalloutState) && AbstractC22676k.m65745e(this.upcycleJoinTodaySubtitle, c29002j.upcycleJoinTodaySubtitle) && this.upcycleCreditCardVariant == c29002j.upcycleCreditCardVariant && AbstractC22676k.m65745e(this.initialValues, c29002j.initialValues) && AbstractC22676k.m65745e(this.analyticsScreenCopy, c29002j.analyticsScreenCopy) && AbstractC22676k.m65745e(this.analyticsValue, c29002j.analyticsValue);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getAnalyticsScreenCopy() {
        return this.analyticsScreenCopy;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getAnalyticsValue() {
        return this.analyticsValue;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextResource getDisclaimerText() {
        return this.disclaimerText;
    }

    public int hashCode() {
        int iHashCode = (this.paymentMethodTextFields.hashCode() + AbstractC11895b.m31983b(AbstractC31061c.m95625a(this.title.hashCode() * 31, this.subtitle, 31), 31, this.acceptedPaymentTypes)) * 31;
        C4092p2 c4092p2 = this.infoCalloutTitleState;
        int iM30450d = AbstractC11266d.m30450d((this.errorMessages.hashCode() + ((iHashCode + (c4092p2 == null ? 0 : c4092p2.hashCode())) * 31)) * 31, 31, this.analyticsName);
        TextResource textResource = this.disclaimerText;
        int iHashCode2 = (iM30450d + (textResource == null ? 0 : textResource.hashCode())) * 31;
        C29855e c29855e = this.formValidator;
        int iHashCode3 = (iHashCode2 + (c29855e == null ? 0 : c29855e.hashCode())) * 31;
        String str = this.stripeToken;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.paymentMethodId;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CommitmentType commitmentType = this.commitmentType;
        int iHashCode6 = (this.cardZip.hashCode() + ((iHashCode5 + (commitmentType == null ? 0 : commitmentType.hashCode())) * 31)) * 31;
        String str3 = this.userCountryCode;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.isLoadingStripeToken), 31, this.showFullScreenError);
        C28998f c28998f = this.errorCalloutState;
        int iHashCode7 = (iM8289b + (c28998f == null ? 0 : c28998f.hashCode())) * 31;
        String str4 = this.upcycleJoinTodaySubtitle;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        UpcycleCreditCardVariant upcycleCreditCardVariant = this.upcycleCreditCardVariant;
        int iHashCode9 = (this.initialValues.hashCode() + ((iHashCode8 + (upcycleCreditCardVariant == null ? 0 : upcycleCreditCardVariant.hashCode())) * 31)) * 31;
        String str5 = this.analyticsScreenCopy;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.analyticsValue;
        return iHashCode10 + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final C28998f getErrorCalloutState() {
        return this.errorCalloutState;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final PaymentErrorMessages getErrorMessages() {
        return this.errorMessages;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final C29855e getFormValidator() {
        return this.formValidator;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final C4092p2 getInfoCalloutTitleState() {
        return this.infoCalloutTitleState;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final C28997e getInitialValues() {
        return this.initialValues;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final C29004l getPaymentMethodTextFields() {
        return this.paymentMethodTextFields;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getShowFullScreenError() {
        return this.showFullScreenError;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getStripeToken() {
        return this.stripeToken;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final UpcycleCreditCardVariant getUpcycleCreditCardVariant() {
        return this.upcycleCreditCardVariant;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getUpcycleJoinTodaySubtitle() {
        return this.upcycleJoinTodaySubtitle;
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        List<C29005m> list = this.acceptedPaymentTypes;
        C29004l c29004l = this.paymentMethodTextFields;
        C4092p2 c4092p2 = this.infoCalloutTitleState;
        PaymentErrorMessages paymentErrorMessages = this.errorMessages;
        String str = this.analyticsName;
        TextResource textResource3 = this.disclaimerText;
        C29855e c29855e = this.formValidator;
        String str2 = this.stripeToken;
        String str3 = this.paymentMethodId;
        CommitmentType commitmentType = this.commitmentType;
        C11753g c11753g = this.cardZip;
        String str4 = this.userCountryCode;
        boolean z4 = this.isLoadingStripeToken;
        boolean z13 = this.showFullScreenError;
        C28998f c28998f = this.errorCalloutState;
        String str5 = this.upcycleJoinTodaySubtitle;
        UpcycleCreditCardVariant upcycleCreditCardVariant = this.upcycleCreditCardVariant;
        C28997e c28997e = this.initialValues;
        String str6 = this.analyticsScreenCopy;
        String str7 = this.analyticsValue;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("PaymentMethodState(title=", textResource, ", subtitle=", textResource2, ", acceptedPaymentTypes=");
        sbM106658q.append(list);
        sbM106658q.append(", paymentMethodTextFields=");
        sbM106658q.append(c29004l);
        sbM106658q.append(", infoCalloutTitleState=");
        sbM106658q.append(c4092p2);
        sbM106658q.append(", errorMessages=");
        sbM106658q.append(paymentErrorMessages);
        sbM106658q.append(", analyticsName=");
        AbstractC30007c.m91826A(sbM106658q, str, ", disclaimerText=", textResource3, ", formValidator=");
        sbM106658q.append(c29855e);
        sbM106658q.append(", stripeToken=");
        sbM106658q.append(str2);
        sbM106658q.append(", paymentMethodId=");
        sbM106658q.append(str3);
        sbM106658q.append(", commitmentType=");
        sbM106658q.append(commitmentType);
        sbM106658q.append(", cardZip=");
        sbM106658q.append(c11753g);
        sbM106658q.append(", userCountryCode=");
        sbM106658q.append(str4);
        sbM106658q.append(", isLoadingStripeToken=");
        AbstractC38963t7.m124392v(sbM106658q, z4, ", showFullScreenError=", z13, ", errorCalloutState=");
        sbM106658q.append(c28998f);
        sbM106658q.append(", upcycleJoinTodaySubtitle=");
        sbM106658q.append(str5);
        sbM106658q.append(", upcycleCreditCardVariant=");
        sbM106658q.append(upcycleCreditCardVariant);
        sbM106658q.append(", initialValues=");
        sbM106658q.append(c28997e);
        sbM106658q.append(", analyticsScreenCopy=");
        return AbstractC11266d.m30464r(sbM106658q, str6, ", analyticsValue=", str7, ")");
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getUserCountryCode() {
        return this.userCountryCode;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final boolean getIsLoadingStripeToken() {
        return this.isLoadingStripeToken;
    }

    public /* synthetic */ C29002j(TextResource textResource, TextResource textResource2, List list, C29004l c29004l, C4092p2 c4092p2, PaymentErrorMessages paymentErrorMessages, String str, TextResource textResource3, C29855e c29855e, String str2, String str3, CommitmentType commitmentType, C11753g c11753g, String str4, boolean z4, boolean z13, C28998f c28998f, String str5, UpcycleCreditCardVariant upcycleCreditCardVariant, C28997e c28997e, String str6, String str7, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, textResource2, list, c29004l, (i13 & 16) != 0 ? null : c4092p2, paymentErrorMessages, str, (i13 & 128) != 0 ? null : textResource3, (i13 & 256) != 0 ? null : c29855e, (i13 & 512) != 0 ? null : str2, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : str3, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : commitmentType, (i13 & 4096) != 0 ? new C11753g(null, 1, null) : c11753g, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : str4, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? false : z4, (32768 & i13) != 0 ? false : z13, (65536 & i13) != 0 ? null : c28998f, (131072 & i13) != 0 ? null : str5, (262144 & i13) != 0 ? null : upcycleCreditCardVariant, (524288 & i13) != 0 ? new C28997e(null, null, null, null, 15, null) : c28997e, (1048576 & i13) != 0 ? null : str6, (i13 & 2097152) != 0 ? null : str7);
    }
}
