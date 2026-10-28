package f70;

import androidx.core.app.NotificationCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.whoop.activation.domain.models.ConsentSubmission;
import com.whoop.activation.domain.models.steps.CommitmentPlan;
import com.whoop.activation.domain.models.steps.CommitmentType;
import com.whoop.domain.model.UnitSystem;
import d70.C11748b;
import d70.C11749c;
import d70.C11750d;
import d70.C11751e;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import live.hms.video.utils.AndroidSDKConstants;
import m83.C25271y;
import nh3.AbstractC26725a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p90.C28997e;
import r80.EnumC31059a;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: f70.q0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bH\b\u0081\b\u0018\u00002\u00020\u0001B×\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e\u0012\b\b\u0002\u0010!\u001a\u00020\u000f\u0012\b\b\u0002\u0010\"\u001a\u00020\u000f\u0012\b\b\u0002\u0010#\u001a\u00020\u000f\u0012\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u001e\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(\u0012\b\b\u0002\u0010*\u001a\u00020\u001c\u0012\b\b\u0002\u0010+\u001a\u00020\u000f\u0012\b\b\u0002\u0010,\u001a\u00020\u000f\u0012\b\b\u0002\u0010-\u001a\u00020\u000f¢\u0006\u0004\b.\u0010/Jà\u0002\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e2\b\b\u0002\u0010!\u001a\u00020\u000f2\b\b\u0002\u0010\"\u001a\u00020\u000f2\b\b\u0002\u0010#\u001a\u00020\u000f2\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u001e2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\b\b\u0002\u0010*\u001a\u00020\u001c2\b\b\u0002\u0010+\u001a\u00020\u000f2\b\b\u0002\u0010,\u001a\u00020\u000f2\b\b\u0002\u0010-\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b4\u00105J\u001a\u00107\u001a\u00020\u000f2\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b7\u00108R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bD\u0010A\u001a\u0004\bE\u0010CR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u00103R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bI\u0010G\u001a\u0004\bJ\u00103R\u0019\u0010\f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\bK\u0010G\u001a\u0004\bL\u00103R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bD\u0010OR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bJ\u0010P\u001a\u0004\bQ\u0010RR\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b:\u0010P\u001a\u0004\bS\u0010RR\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bT\u0010P\u001a\u0004\bT\u0010RR\u0017\u0010\u0013\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bB\u0010G\u001a\u0004\bU\u00103R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\bU\u0010G\u001a\u0004\bV\u00103R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\bV\u0010G\u001a\u0004\bW\u00103R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bF\u0010ZR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b@\u0010]R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\bE\u0010^\u001a\u0004\bI\u0010_R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR\u001f\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b>\u0010d\u001a\u0004\be\u0010fR\u0017\u0010!\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bg\u0010P\u001a\u0004\bM\u0010RR\u0017\u0010\"\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bh\u0010P\u001a\u0004\b`\u0010RR\u0017\u0010#\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bb\u0010P\u001a\u0004\bi\u0010RR\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u001e8\u0006¢\u0006\f\n\u0004\bi\u0010d\u001a\u0004\bK\u0010fR\u0019\u0010&\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\be\u0010a\u001a\u0004\bj\u0010cR\u0019\u0010'\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\bk\u0010a\u001a\u0004\b[\u0010cR\u0019\u0010)\u001a\u0004\u0018\u00010(8\u0006¢\u0006\f\n\u0004\bL\u0010l\u001a\u0004\bm\u0010nR\u0017\u0010*\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\bW\u0010o\u001a\u0004\bk\u00105R\u0017\u0010+\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bm\u0010P\u001a\u0004\bX\u0010RR\u0017\u0010,\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bH\u0010P\u001a\u0004\bh\u0010RR\u0017\u0010-\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bS\u0010P\u001a\u0004\bg\u0010R¨\u0006p"}, m65681d2 = {"Lf70/q0;", "", "Ld70/c;", NotificationCompat.CATEGORY_EMAIL, "Ld70/e;", "password", "Ld70/d;", "firstName", "lastName", "", "userName", "country", "state", "Ld70/b;", "birthday", "", "usernameTaken", "usernameError", "emailTaken", "gender", "genderBaseline", "stripeToken", "Lp90/e;", "card", "Lr80/a;", "billingFrequency", "Lcom/whoop/activation/domain/models/steps/CommitmentType;", "commitmentType", "", "paymentMethodIndex", "", "Lcom/whoop/activation/domain/models/steps/CommitmentPlan;", "savedCommitmentPlans", "consentsAccepted", "marketingOptIn", "recommendationOptIn", "Lcom/whoop/activation/domain/models/ConsentSubmission;", "consentSubmissions", "weight", "height", "Lcom/whoop/domain/model/UnitSystem;", "unitSystem", "selectedRafCodesAmount", "hasEnabledGoogleHealth", "passwordNeedsReset", "passwordFilledViaCredentialManager", "<init>", "(Ld70/c;Ld70/e;Ld70/d;Ld70/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ld70/b;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lp90/e;Lr80/a;Lcom/whoop/activation/domain/models/steps/CommitmentType;Ljava/lang/Integer;Ljava/util/List;ZZZLjava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/domain/model/UnitSystem;IZZZ)V", "a", "(Ld70/c;Ld70/e;Ld70/d;Ld70/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ld70/b;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lp90/e;Lr80/a;Lcom/whoop/activation/domain/models/steps/CommitmentType;Ljava/lang/Integer;Ljava/util/List;ZZZLjava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/domain/model/UnitSystem;IZZZ)Lf70/q0;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ld70/c;", "j", "()Ld70/c;", "b", "Ld70/e;", "s", "()Ld70/e;", "c", "Ld70/d;", "l", "()Ld70/d;", "d", "q", "e", "Ljava/lang/String;", "C", "f", "i", "g", "z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ld70/b;", "()Ld70/b;", "Z", "E", "()Z", "D", "k", "m", "n", "A", "o", "Lp90/e;", "()Lp90/e;", "p", "Lr80/a;", "()Lr80/a;", "Lcom/whoop/activation/domain/models/steps/CommitmentType;", "()Lcom/whoop/activation/domain/models/steps/CommitmentType;", "r", "Ljava/lang/Integer;", "v", "()Ljava/lang/Integer;", "Ljava/util/List;", "x", "()Ljava/util/List;", "t", "u", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "F", "y", "Lcom/whoop/domain/model/UnitSystem;", "B", "()Lcom/whoop/domain/model/UnitSystem;", "I", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C14201q0 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final int selectedRafCodesAmount;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final boolean hasEnabledGoogleHealth;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final boolean passwordNeedsReset;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final boolean passwordFilledViaCredentialManager;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C11749c email;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C11751e password;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C11750d firstName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C11750d lastName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String userName;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String country;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String state;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C11748b birthday;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean usernameTaken;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean usernameError;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final boolean emailTaken;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final String gender;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final String genderBaseline;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final String stripeToken;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final C28997e card;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final EnumC31059a billingFrequency;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final CommitmentType commitmentType;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final Integer paymentMethodIndex;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final List<CommitmentPlan> savedCommitmentPlans;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final boolean consentsAccepted;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final boolean marketingOptIn;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final boolean recommendationOptIn;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final List<ConsentSubmission> consentSubmissions;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final Integer weight;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final Integer height;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final UnitSystem unitSystem;

    public C14201q0(C11749c email, C11751e password, C11750d firstName, C11750d lastName, String str, String country, String str2, C11748b c11748b, boolean z4, boolean z13, boolean z14, String gender, String str3, String str4, C28997e card, EnumC31059a enumC31059a, CommitmentType commitmentType, Integer num, List<CommitmentPlan> list, boolean z15, boolean z16, boolean z17, List<ConsentSubmission> consentSubmissions, Integer num2, Integer num3, UnitSystem unitSystem, int i13, boolean z18, boolean z19, boolean z24) {
        AbstractC22676k.m65750j(email, "email");
        AbstractC22676k.m65750j(password, "password");
        AbstractC22676k.m65750j(firstName, "firstName");
        AbstractC22676k.m65750j(lastName, "lastName");
        AbstractC22676k.m65750j(country, "country");
        AbstractC22676k.m65750j(gender, "gender");
        AbstractC22676k.m65750j(card, "card");
        AbstractC22676k.m65750j(consentSubmissions, "consentSubmissions");
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = str;
        this.country = country;
        this.state = str2;
        this.birthday = c11748b;
        this.usernameTaken = z4;
        this.usernameError = z13;
        this.emailTaken = z14;
        this.gender = gender;
        this.genderBaseline = str3;
        this.stripeToken = str4;
        this.card = card;
        this.billingFrequency = enumC31059a;
        this.commitmentType = commitmentType;
        this.paymentMethodIndex = num;
        this.savedCommitmentPlans = list;
        this.consentsAccepted = z15;
        this.marketingOptIn = z16;
        this.recommendationOptIn = z17;
        this.consentSubmissions = consentSubmissions;
        this.weight = num2;
        this.height = num3;
        this.unitSystem = unitSystem;
        this.selectedRafCodesAmount = i13;
        this.hasEnabledGoogleHealth = z18;
        this.passwordNeedsReset = z19;
        this.passwordFilledViaCredentialManager = z24;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C14201q0 m40542b(C14201q0 c14201q0, C11749c c11749c, C11751e c11751e, C11750d c11750d, C11750d c11750d2, String str, String str2, String str3, C11748b c11748b, boolean z4, boolean z13, boolean z14, String str4, String str5, String str6, C28997e c28997e, EnumC31059a enumC31059a, CommitmentType commitmentType, Integer num, List list, boolean z15, boolean z16, boolean z17, List list2, Integer num2, Integer num3, UnitSystem unitSystem, int i13, boolean z18, boolean z19, boolean z24, int i14, Object obj) {
        boolean z25;
        boolean z26;
        C11749c c11749c2 = (i14 & 1) != 0 ? c14201q0.email : c11749c;
        C11751e c11751e2 = (i14 & 2) != 0 ? c14201q0.password : c11751e;
        C11750d c11750d3 = (i14 & 4) != 0 ? c14201q0.firstName : c11750d;
        C11750d c11750d4 = (i14 & 8) != 0 ? c14201q0.lastName : c11750d2;
        String str7 = (i14 & 16) != 0 ? c14201q0.userName : str;
        String str8 = (i14 & 32) != 0 ? c14201q0.country : str2;
        String str9 = (i14 & 64) != 0 ? c14201q0.state : str3;
        C11748b c11748b2 = (i14 & 128) != 0 ? c14201q0.birthday : c11748b;
        boolean z27 = (i14 & 256) != 0 ? c14201q0.usernameTaken : z4;
        boolean z28 = (i14 & 512) != 0 ? c14201q0.usernameError : z13;
        boolean z29 = (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c14201q0.emailTaken : z14;
        String str10 = (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c14201q0.gender : str4;
        String str11 = (i14 & 4096) != 0 ? c14201q0.genderBaseline : str5;
        String str12 = (i14 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c14201q0.stripeToken : str6;
        C11749c c11749c3 = c11749c2;
        C28997e c28997e2 = (i14 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c14201q0.card : c28997e;
        EnumC31059a enumC31059a2 = (i14 & 32768) != 0 ? c14201q0.billingFrequency : enumC31059a;
        CommitmentType commitmentType2 = (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? c14201q0.commitmentType : commitmentType;
        Integer num4 = (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? c14201q0.paymentMethodIndex : num;
        List list3 = (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? c14201q0.savedCommitmentPlans : list;
        boolean z34 = (i14 & 524288) != 0 ? c14201q0.consentsAccepted : z15;
        boolean z35 = (i14 & 1048576) != 0 ? c14201q0.marketingOptIn : z16;
        boolean z36 = (i14 & 2097152) != 0 ? c14201q0.recommendationOptIn : z17;
        List list4 = (i14 & 4194304) != 0 ? c14201q0.consentSubmissions : list2;
        Integer num5 = (i14 & 8388608) != 0 ? c14201q0.weight : num2;
        Integer num6 = (i14 & 16777216) != 0 ? c14201q0.height : num3;
        UnitSystem unitSystem2 = (i14 & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? c14201q0.unitSystem : unitSystem;
        int i15 = (i14 & 67108864) != 0 ? c14201q0.selectedRafCodesAmount : i13;
        boolean z37 = (i14 & 134217728) != 0 ? c14201q0.hasEnabledGoogleHealth : z18;
        boolean z38 = (i14 & 268435456) != 0 ? c14201q0.passwordNeedsReset : z19;
        if ((i14 & 536870912) != 0) {
            z26 = z38;
            z25 = c14201q0.passwordFilledViaCredentialManager;
        } else {
            z25 = z24;
            z26 = z38;
        }
        return c14201q0.m40549a(c11749c3, c11751e2, c11750d3, c11750d4, str7, str8, str9, c11748b2, z27, z28, z29, str10, str11, str12, c28997e2, enumC31059a2, commitmentType2, num4, list3, z34, z35, z36, list4, num5, num6, unitSystem2, i15, z37, z26, z25);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final String getStripeToken() {
        return this.stripeToken;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final UnitSystem getUnitSystem() {
        return this.unitSystem;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final boolean getUsernameError() {
        return this.usernameError;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final boolean getUsernameTaken() {
        return this.usernameTaken;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final Integer getWeight() {
        return this.weight;
    }

    /* JADX INFO: renamed from: a */
    public final C14201q0 m40549a(C11749c email, C11751e password, C11750d firstName, C11750d lastName, String userName, String country, String state, C11748b birthday, boolean usernameTaken, boolean usernameError, boolean emailTaken, String gender, String genderBaseline, String stripeToken, C28997e card, EnumC31059a billingFrequency, CommitmentType commitmentType, Integer paymentMethodIndex, List<CommitmentPlan> savedCommitmentPlans, boolean consentsAccepted, boolean marketingOptIn, boolean recommendationOptIn, List<ConsentSubmission> consentSubmissions, Integer weight, Integer height, UnitSystem unitSystem, int selectedRafCodesAmount, boolean hasEnabledGoogleHealth, boolean passwordNeedsReset, boolean passwordFilledViaCredentialManager) {
        AbstractC22676k.m65750j(email, "email");
        AbstractC22676k.m65750j(password, "password");
        AbstractC22676k.m65750j(firstName, "firstName");
        AbstractC22676k.m65750j(lastName, "lastName");
        AbstractC22676k.m65750j(country, "country");
        AbstractC22676k.m65750j(gender, "gender");
        AbstractC22676k.m65750j(card, "card");
        AbstractC22676k.m65750j(consentSubmissions, "consentSubmissions");
        return new C14201q0(email, password, firstName, lastName, userName, country, state, birthday, usernameTaken, usernameError, emailTaken, gender, genderBaseline, stripeToken, card, billingFrequency, commitmentType, paymentMethodIndex, savedCommitmentPlans, consentsAccepted, marketingOptIn, recommendationOptIn, consentSubmissions, weight, height, unitSystem, selectedRafCodesAmount, hasEnabledGoogleHealth, passwordNeedsReset, passwordFilledViaCredentialManager);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC31059a getBillingFrequency() {
        return this.billingFrequency;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C11748b getBirthday() {
        return this.birthday;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C28997e getCard() {
        return this.card;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14201q0)) {
            return false;
        }
        C14201q0 c14201q0 = (C14201q0) other;
        return AbstractC22676k.m65745e(this.email, c14201q0.email) && AbstractC22676k.m65745e(this.password, c14201q0.password) && AbstractC22676k.m65745e(this.firstName, c14201q0.firstName) && AbstractC22676k.m65745e(this.lastName, c14201q0.lastName) && AbstractC22676k.m65745e(this.userName, c14201q0.userName) && AbstractC22676k.m65745e(this.country, c14201q0.country) && AbstractC22676k.m65745e(this.state, c14201q0.state) && AbstractC22676k.m65745e(this.birthday, c14201q0.birthday) && this.usernameTaken == c14201q0.usernameTaken && this.usernameError == c14201q0.usernameError && this.emailTaken == c14201q0.emailTaken && AbstractC22676k.m65745e(this.gender, c14201q0.gender) && AbstractC22676k.m65745e(this.genderBaseline, c14201q0.genderBaseline) && AbstractC22676k.m65745e(this.stripeToken, c14201q0.stripeToken) && AbstractC22676k.m65745e(this.card, c14201q0.card) && this.billingFrequency == c14201q0.billingFrequency && this.commitmentType == c14201q0.commitmentType && AbstractC22676k.m65745e(this.paymentMethodIndex, c14201q0.paymentMethodIndex) && AbstractC22676k.m65745e(this.savedCommitmentPlans, c14201q0.savedCommitmentPlans) && this.consentsAccepted == c14201q0.consentsAccepted && this.marketingOptIn == c14201q0.marketingOptIn && this.recommendationOptIn == c14201q0.recommendationOptIn && AbstractC22676k.m65745e(this.consentSubmissions, c14201q0.consentSubmissions) && AbstractC22676k.m65745e(this.weight, c14201q0.weight) && AbstractC22676k.m65745e(this.height, c14201q0.height) && this.unitSystem == c14201q0.unitSystem && this.selectedRafCodesAmount == c14201q0.selectedRafCodesAmount && this.hasEnabledGoogleHealth == c14201q0.hasEnabledGoogleHealth && this.passwordNeedsReset == c14201q0.passwordNeedsReset && this.passwordFilledViaCredentialManager == c14201q0.passwordFilledViaCredentialManager;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final CommitmentType getCommitmentType() {
        return this.commitmentType;
    }

    /* JADX INFO: renamed from: g */
    public final List<ConsentSubmission> m40554g() {
        return this.consentSubmissions;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getConsentsAccepted() {
        return this.consentsAccepted;
    }

    public int hashCode() {
        int iHashCode = (this.lastName.hashCode() + ((this.firstName.hashCode() + ((this.password.hashCode() + (this.email.hashCode() * 31)) * 31)) * 31)) * 31;
        String str = this.userName;
        int iM30450d = AbstractC11266d.m30450d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.country);
        String str2 = this.state;
        int iHashCode2 = (iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31;
        C11748b c11748b = this.birthday;
        int iM30450d2 = AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode2 + (c11748b == null ? 0 : c11748b.hashCode())) * 31, 31, this.usernameTaken), 31, this.usernameError), 31, this.emailTaken), 31, this.gender);
        String str3 = this.genderBaseline;
        int iHashCode3 = (iM30450d2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.stripeToken;
        int iHashCode4 = (this.card.hashCode() + ((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
        EnumC31059a enumC31059a = this.billingFrequency;
        int iHashCode5 = (iHashCode4 + (enumC31059a == null ? 0 : enumC31059a.hashCode())) * 31;
        CommitmentType commitmentType = this.commitmentType;
        int iHashCode6 = (iHashCode5 + (commitmentType == null ? 0 : commitmentType.hashCode())) * 31;
        Integer num = this.paymentMethodIndex;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        List<CommitmentPlan> list = this.savedCommitmentPlans;
        int iM31983b = AbstractC11895b.m31983b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode7 + (list == null ? 0 : list.hashCode())) * 31, 31, this.consentsAccepted), 31, this.marketingOptIn), 31, this.recommendationOptIn), 31, this.consentSubmissions);
        Integer num2 = this.weight;
        int iHashCode8 = (iM31983b + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.height;
        int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        UnitSystem unitSystem = this.unitSystem;
        return Boolean.hashCode(this.passwordFilledViaCredentialManager) + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.selectedRafCodesAmount, (iHashCode9 + (unitSystem != null ? unitSystem.hashCode() : 0)) * 31, 31), 31, this.hasEnabledGoogleHealth), 31, this.passwordNeedsReset);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final C11749c getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getEmailTaken() {
        return this.emailTaken;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final C11750d getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getGender() {
        return this.gender;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getGenderBaseline() {
        return this.genderBaseline;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getHasEnabledGoogleHealth() {
        return this.hasEnabledGoogleHealth;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final Integer getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final C11750d getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final boolean getMarketingOptIn() {
        return this.marketingOptIn;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final C11751e getPassword() {
        return this.password;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final boolean getPasswordFilledViaCredentialManager() {
        return this.passwordFilledViaCredentialManager;
    }

    public String toString() {
        C11749c c11749c = this.email;
        C11751e c11751e = this.password;
        C11750d c11750d = this.firstName;
        C11750d c11750d2 = this.lastName;
        String str = this.userName;
        String str2 = this.country;
        String str3 = this.state;
        C11748b c11748b = this.birthday;
        boolean z4 = this.usernameTaken;
        boolean z13 = this.usernameError;
        boolean z14 = this.emailTaken;
        String str4 = this.gender;
        String str5 = this.genderBaseline;
        String str6 = this.stripeToken;
        C28997e c28997e = this.card;
        EnumC31059a enumC31059a = this.billingFrequency;
        CommitmentType commitmentType = this.commitmentType;
        Integer num = this.paymentMethodIndex;
        List<CommitmentPlan> list = this.savedCommitmentPlans;
        boolean z15 = this.consentsAccepted;
        boolean z16 = this.marketingOptIn;
        boolean z17 = this.recommendationOptIn;
        List<ConsentSubmission> list2 = this.consentSubmissions;
        Integer num2 = this.weight;
        Integer num3 = this.height;
        UnitSystem unitSystem = this.unitSystem;
        int i13 = this.selectedRafCodesAmount;
        boolean z18 = this.hasEnabledGoogleHealth;
        boolean z19 = this.passwordNeedsReset;
        boolean z24 = this.passwordFilledViaCredentialManager;
        StringBuilder sb4 = new StringBuilder("MemberInfo(email=");
        sb4.append(c11749c);
        sb4.append(", password=");
        sb4.append(c11751e);
        sb4.append(", firstName=");
        sb4.append(c11750d);
        sb4.append(", lastName=");
        sb4.append(c11750d2);
        sb4.append(", userName=");
        AbstractC11266d.m30444B(sb4, str, ", country=", str2, ", state=");
        sb4.append(str3);
        sb4.append(", birthday=");
        sb4.append(c11748b);
        sb4.append(", usernameTaken=");
        AbstractC38963t7.m124392v(sb4, z4, ", usernameError=", z13, ", emailTaken=");
        AbstractC38963t7.m124391u(sb4, z14, ", gender=", str4, ", genderBaseline=");
        AbstractC11266d.m30444B(sb4, str5, ", stripeToken=", str6, ", card=");
        sb4.append(c28997e);
        sb4.append(", billingFrequency=");
        sb4.append(enumC31059a);
        sb4.append(", commitmentType=");
        sb4.append(commitmentType);
        sb4.append(", paymentMethodIndex=");
        sb4.append(num);
        sb4.append(", savedCommitmentPlans=");
        AbstractC26725a.m79512p(", consentsAccepted=", ", marketingOptIn=", sb4, list, z15);
        AbstractC38963t7.m124392v(sb4, z16, ", recommendationOptIn=", z17, ", consentSubmissions=");
        sb4.append(list2);
        sb4.append(", weight=");
        sb4.append(num2);
        sb4.append(", height=");
        sb4.append(num3);
        sb4.append(", unitSystem=");
        sb4.append(unitSystem);
        sb4.append(", selectedRafCodesAmount=");
        AbstractC13673n.m38573t(i13, ", hasEnabledGoogleHealth=", ", passwordNeedsReset=", sb4, z18);
        return AbstractC36095b.m114682j(sb4, z19, ", passwordFilledViaCredentialManager=", z24, ")");
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final boolean getPasswordNeedsReset() {
        return this.passwordNeedsReset;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final Integer getPaymentMethodIndex() {
        return this.paymentMethodIndex;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final boolean getRecommendationOptIn() {
        return this.recommendationOptIn;
    }

    /* JADX INFO: renamed from: x */
    public final List<CommitmentPlan> m40571x() {
        return this.savedCommitmentPlans;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final int getSelectedRafCodesAmount() {
        return this.selectedRafCodesAmount;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public /* synthetic */ C14201q0(C11749c c11749c, C11751e c11751e, C11750d c11750d, C11750d c11750d2, String str, String str2, String str3, C11748b c11748b, boolean z4, boolean z13, boolean z14, String str4, String str5, String str6, C28997e c28997e, EnumC31059a enumC31059a, CommitmentType commitmentType, Integer num, List list, boolean z15, boolean z16, boolean z17, List list2, Integer num2, Integer num3, UnitSystem unitSystem, int i13, boolean z18, boolean z19, boolean z24, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? new C11749c(null, 1, null) : c11749c, (i14 & 2) != 0 ? new C11751e(null, 1, null) : c11751e, (i14 & 4) != 0 ? new C11750d(null, 1, null) : c11750d, (i14 & 8) != 0 ? new C11750d(null, 1, null) : c11750d2, (i14 & 16) != 0 ? null : str, (i14 & 32) != 0 ? "" : str2, (i14 & 64) != 0 ? null : str3, (i14 & 128) != 0 ? null : c11748b, (i14 & 256) != 0 ? false : z4, (i14 & 512) != 0 ? false : z13, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? false : z14, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0 ? str4 : "", (i14 & 4096) != 0 ? null : str5, (i14 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : str6, (i14 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? new C28997e(null, null, null, null, 15, null) : c28997e, (i14 & 32768) != 0 ? null : enumC31059a, (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? null : commitmentType, (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? null : num, (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? null : list, (i14 & 524288) != 0 ? false : z15, (i14 & 1048576) != 0 ? false : z16, (i14 & 2097152) != 0 ? false : z17, (i14 & 4194304) != 0 ? C25271y.f99162w : list2, (i14 & 8388608) != 0 ? null : num2, (i14 & 16777216) != 0 ? null : num3, (i14 & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? null : unitSystem, (i14 & 67108864) != 0 ? 0 : i13, (i14 & 134217728) != 0 ? false : z18, (i14 & 268435456) != 0 ? false : z19, (i14 & 536870912) != 0 ? false : z24);
    }
}
