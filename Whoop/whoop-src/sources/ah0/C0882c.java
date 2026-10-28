package ah0;

import androidx.profileinstaller.ProfileVerifier;
import com.whoop.whoopaction.domain.models.Action;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import live.hms.video.utils.AndroidSDKConstants;
import nh3.AbstractC26725a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: ah0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b2\b\u0087\b\u0018\u00002\u00020\u0001B£\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0013\u001a\u00020\r\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0015\u001a\u00020\r\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\r\u0012\b\b\u0002\u0010\u0018\u001a\u00020\r\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001f\u0012\b\b\u0002\u0010\"\u001a\u00020\r\u0012\b\b\u0002\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J¸\u0002\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\r2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00062\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010\"\u001a\u00020\r2\b\b\u0002\u0010$\u001a\u00020#HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020\r2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u00101\u001a\u0004\b2\u0010*R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u00101\u001a\u0004\b4\u0010*R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u00101\u001a\u0004\b6\u0010*R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u00101\u001a\u0004\b<\u0010*R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u00101\u001a\u0004\b>\u0010*R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b6\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bF\u0010C\u001a\u0004\bG\u0010ER\u0017\u0010\u0010\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bH\u0010,R\u0017\u0010\u0011\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bJ\u0010I\u001a\u0004\bK\u0010,R\u0017\u0010\u0012\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bL\u0010I\u001a\u0004\bM\u0010,R\u0017\u0010\u0013\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bN\u0010C\u001a\u0004\b5\u0010ER\u0017\u0010\u0014\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b@\u0010I\u001a\u0004\bO\u0010,R\u0017\u0010\u0015\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bP\u0010C\u001a\u0004\bQ\u0010ER\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b>\u00101\u001a\u0004\bB\u0010*R\u0017\u0010\u0017\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b<\u0010C\u001a\u0004\bR\u0010ER\u0017\u0010\u0018\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bK\u0010C\u001a\u0004\bF\u0010ER\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bS\u00101\u001a\u0004\bT\u0010*R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bM\u00101\u001a\u0004\bS\u0010*R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b=\u0010*R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bU\u00101\u001a\u0004\bP\u0010*R\u0017\u0010\u001d\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b9\u0010I\u001a\u0004\bU\u0010,R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bV\u00101\u001a\u0004\bJ\u0010*R\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\bD\u0010W\u001a\u0004\bL\u0010XR\u0019\u0010!\u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\bY\u0010W\u001a\u0004\bN\u0010XR\u0017\u0010\"\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bQ\u0010C\u001a\u0004\bV\u0010ER\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b;\u0010\\R\u0011\u0010]\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bZ\u0010ER\u0011\u0010^\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bY\u0010E¨\u0006_"}, m65681d2 = {"Lah0/c;", "Lm91/u;", "", "authoritativeFormId", "userFormId", "formKey", "", "version", "questionId", "prompt", "", "Lah0/f;", "options", "", "isCompleted", "isMultiSelect", "maxSelections", "questionIndex", "totalQuestions", "canGoBack", "answeredCount", "isFreeText", "freeTextValue", "isRequired", "hasSavedAnswer", "progressLabel", "submitButtonText", "completedButtonText", "placeholder", "userInputTextMaxLength", "moderationError", "Lcom/whoop/whoopaction/domain/models/Action;", "onAnswer", "onComplete", "isCheckboxStyle", "Lah0/b;", "completedAnswerDisplay", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZIIIZIZLjava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/whoopaction/domain/models/Action;ZLah0/b;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZIIIZIZLjava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/whoopaction/domain/models/Action;ZLah0/b;)Lah0/c;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAuthoritativeFormId", "b", "u", "c", "g", "d", "Ljava/lang/Integer;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "()Ljava/lang/Integer;", "e", "q", "f", "p", "Ljava/util/List;", "n", "()Ljava/util/List;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Z", "y", "()Z", "i", "C", "j", "I", "k", "r", "l", "t", "m", "getAnsweredCount", "o", "A", "D", "s", "getProgressLabel", "v", "x", "Lcom/whoop/whoopaction/domain/models/Action;", "()Lcom/whoop/whoopaction/domain/models/Action;", "z", "B", "Lah0/b;", "()Lah0/b;", "isMultiQuestion", "isFinalQuestion", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C0882c implements InterfaceC25312u {

    /* JADX INFO: renamed from: C */
    public static final int f3186C = 8;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final boolean isCheckboxStyle;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final EnumC0881b completedAnswerDisplay;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String authoritativeFormId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String userFormId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String formKey;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Integer version;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String questionId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String prompt;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final List<C0885f> options;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean isCompleted;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean isMultiSelect;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final int maxSelections;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final int questionIndex;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final int totalQuestions;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final boolean canGoBack;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final int answeredCount;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final boolean isFreeText;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final String freeTextValue;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final boolean isRequired;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final boolean hasSavedAnswer;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final String progressLabel;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final String submitButtonText;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final String completedButtonText;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final String placeholder;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final int userInputTextMaxLength;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final String moderationError;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final Action onAnswer;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final Action onComplete;

    public C0882c(String authoritativeFormId, String userFormId, String formKey, Integer num, String questionId, String prompt, List<C0885f> options, boolean z4, boolean z13, int i13, int i14, int i15, boolean z14, int i16, boolean z15, String str, boolean z16, boolean z17, String progressLabel, String submitButtonText, String completedButtonText, String placeholder, int i17, String str2, Action action, Action action2, boolean z18, EnumC0881b completedAnswerDisplay) {
        AbstractC22676k.m65750j(authoritativeFormId, "authoritativeFormId");
        AbstractC22676k.m65750j(userFormId, "userFormId");
        AbstractC22676k.m65750j(formKey, "formKey");
        AbstractC22676k.m65750j(questionId, "questionId");
        AbstractC22676k.m65750j(prompt, "prompt");
        AbstractC22676k.m65750j(options, "options");
        AbstractC22676k.m65750j(progressLabel, "progressLabel");
        AbstractC22676k.m65750j(submitButtonText, "submitButtonText");
        AbstractC22676k.m65750j(completedButtonText, "completedButtonText");
        AbstractC22676k.m65750j(placeholder, "placeholder");
        AbstractC22676k.m65750j(completedAnswerDisplay, "completedAnswerDisplay");
        this.authoritativeFormId = authoritativeFormId;
        this.userFormId = userFormId;
        this.formKey = formKey;
        this.version = num;
        this.questionId = questionId;
        this.prompt = prompt;
        this.options = options;
        this.isCompleted = z4;
        this.isMultiSelect = z13;
        this.maxSelections = i13;
        this.questionIndex = i14;
        this.totalQuestions = i15;
        this.canGoBack = z14;
        this.answeredCount = i16;
        this.isFreeText = z15;
        this.freeTextValue = str;
        this.isRequired = z16;
        this.hasSavedAnswer = z17;
        this.progressLabel = progressLabel;
        this.submitButtonText = submitButtonText;
        this.completedButtonText = completedButtonText;
        this.placeholder = placeholder;
        this.userInputTextMaxLength = i17;
        this.moderationError = str2;
        this.onAnswer = action;
        this.onComplete = action2;
        this.isCheckboxStyle = z18;
        this.completedAnswerDisplay = completedAnswerDisplay;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C0882c m2115b(C0882c c0882c, String str, String str2, String str3, Integer num, String str4, String str5, List list, boolean z4, boolean z13, int i13, int i14, int i15, boolean z14, int i16, boolean z15, String str6, boolean z16, boolean z17, String str7, String str8, String str9, String str10, int i17, String str11, Action action, Action action2, boolean z18, EnumC0881b enumC0881b, int i18, Object obj) {
        EnumC0881b enumC0881b2;
        boolean z19;
        String str12 = (i18 & 1) != 0 ? c0882c.authoritativeFormId : str;
        String str13 = (i18 & 2) != 0 ? c0882c.userFormId : str2;
        String str14 = (i18 & 4) != 0 ? c0882c.formKey : str3;
        Integer num2 = (i18 & 8) != 0 ? c0882c.version : num;
        String str15 = (i18 & 16) != 0 ? c0882c.questionId : str4;
        String str16 = (i18 & 32) != 0 ? c0882c.prompt : str5;
        List list2 = (i18 & 64) != 0 ? c0882c.options : list;
        boolean z24 = (i18 & 128) != 0 ? c0882c.isCompleted : z4;
        boolean z25 = (i18 & 256) != 0 ? c0882c.isMultiSelect : z13;
        int i19 = (i18 & 512) != 0 ? c0882c.maxSelections : i13;
        int i24 = (i18 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c0882c.questionIndex : i14;
        int i25 = (i18 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c0882c.totalQuestions : i15;
        boolean z26 = (i18 & 4096) != 0 ? c0882c.canGoBack : z14;
        int i26 = (i18 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c0882c.answeredCount : i16;
        String str17 = str12;
        boolean z27 = (i18 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c0882c.isFreeText : z15;
        String str18 = (i18 & 32768) != 0 ? c0882c.freeTextValue : str6;
        boolean z28 = (i18 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? c0882c.isRequired : z16;
        boolean z29 = (i18 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? c0882c.hasSavedAnswer : z17;
        String str19 = (i18 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? c0882c.progressLabel : str7;
        String str20 = (i18 & 524288) != 0 ? c0882c.submitButtonText : str8;
        String str21 = (i18 & 1048576) != 0 ? c0882c.completedButtonText : str9;
        String str22 = (i18 & 2097152) != 0 ? c0882c.placeholder : str10;
        int i27 = (i18 & 4194304) != 0 ? c0882c.userInputTextMaxLength : i17;
        String str23 = (i18 & 8388608) != 0 ? c0882c.moderationError : str11;
        Action action3 = (i18 & 16777216) != 0 ? c0882c.onAnswer : action;
        Action action4 = (i18 & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? c0882c.onComplete : action2;
        boolean z34 = (i18 & 67108864) != 0 ? c0882c.isCheckboxStyle : z18;
        if ((i18 & 134217728) != 0) {
            z19 = z34;
            enumC0881b2 = c0882c.completedAnswerDisplay;
        } else {
            enumC0881b2 = enumC0881b;
            z19 = z34;
        }
        return c0882c.m2120a(str17, str13, str14, num2, str15, str16, list2, z24, z25, i19, i24, i25, z26, i26, z27, str18, z28, z29, str19, str20, str21, str22, i27, str23, action3, action4, z19, enumC0881b2);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final boolean getIsFreeText() {
        return this.isFreeText;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m2117B() {
        return this.totalQuestions > 1;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final boolean getIsMultiSelect() {
        return this.isMultiSelect;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final boolean getIsRequired() {
        return this.isRequired;
    }

    /* JADX INFO: renamed from: a */
    public final C0882c m2120a(String authoritativeFormId, String userFormId, String formKey, Integer version, String questionId, String prompt, List<C0885f> options, boolean isCompleted, boolean isMultiSelect, int maxSelections, int questionIndex, int totalQuestions, boolean canGoBack, int answeredCount, boolean isFreeText, String freeTextValue, boolean isRequired, boolean hasSavedAnswer, String progressLabel, String submitButtonText, String completedButtonText, String placeholder, int userInputTextMaxLength, String moderationError, Action onAnswer, Action onComplete, boolean isCheckboxStyle, EnumC0881b completedAnswerDisplay) {
        AbstractC22676k.m65750j(authoritativeFormId, "authoritativeFormId");
        AbstractC22676k.m65750j(userFormId, "userFormId");
        AbstractC22676k.m65750j(formKey, "formKey");
        AbstractC22676k.m65750j(questionId, "questionId");
        AbstractC22676k.m65750j(prompt, "prompt");
        AbstractC22676k.m65750j(options, "options");
        AbstractC22676k.m65750j(progressLabel, "progressLabel");
        AbstractC22676k.m65750j(submitButtonText, "submitButtonText");
        AbstractC22676k.m65750j(completedButtonText, "completedButtonText");
        AbstractC22676k.m65750j(placeholder, "placeholder");
        AbstractC22676k.m65750j(completedAnswerDisplay, "completedAnswerDisplay");
        return new C0882c(authoritativeFormId, userFormId, formKey, version, questionId, prompt, options, isCompleted, isMultiSelect, maxSelections, questionIndex, totalQuestions, canGoBack, answeredCount, isFreeText, freeTextValue, isRequired, hasSavedAnswer, progressLabel, submitButtonText, completedButtonText, placeholder, userInputTextMaxLength, moderationError, onAnswer, onComplete, isCheckboxStyle, completedAnswerDisplay);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getCanGoBack() {
        return this.canGoBack;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC0881b getCompletedAnswerDisplay() {
        return this.completedAnswerDisplay;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C0882c)) {
            return false;
        }
        C0882c c0882c = (C0882c) other;
        return AbstractC22676k.m65745e(this.authoritativeFormId, c0882c.authoritativeFormId) && AbstractC22676k.m65745e(this.userFormId, c0882c.userFormId) && AbstractC22676k.m65745e(this.formKey, c0882c.formKey) && AbstractC22676k.m65745e(this.version, c0882c.version) && AbstractC22676k.m65745e(this.questionId, c0882c.questionId) && AbstractC22676k.m65745e(this.prompt, c0882c.prompt) && AbstractC22676k.m65745e(this.options, c0882c.options) && this.isCompleted == c0882c.isCompleted && this.isMultiSelect == c0882c.isMultiSelect && this.maxSelections == c0882c.maxSelections && this.questionIndex == c0882c.questionIndex && this.totalQuestions == c0882c.totalQuestions && this.canGoBack == c0882c.canGoBack && this.answeredCount == c0882c.answeredCount && this.isFreeText == c0882c.isFreeText && AbstractC22676k.m65745e(this.freeTextValue, c0882c.freeTextValue) && this.isRequired == c0882c.isRequired && this.hasSavedAnswer == c0882c.hasSavedAnswer && AbstractC22676k.m65745e(this.progressLabel, c0882c.progressLabel) && AbstractC22676k.m65745e(this.submitButtonText, c0882c.submitButtonText) && AbstractC22676k.m65745e(this.completedButtonText, c0882c.completedButtonText) && AbstractC22676k.m65745e(this.placeholder, c0882c.placeholder) && this.userInputTextMaxLength == c0882c.userInputTextMaxLength && AbstractC22676k.m65745e(this.moderationError, c0882c.moderationError) && AbstractC22676k.m65745e(this.onAnswer, c0882c.onAnswer) && AbstractC22676k.m65745e(this.onComplete, c0882c.onComplete) && this.isCheckboxStyle == c0882c.isCheckboxStyle && this.completedAnswerDisplay == c0882c.completedAnswerDisplay;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getCompletedButtonText() {
        return this.completedButtonText;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getFormKey() {
        return this.formKey;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getFreeTextValue() {
        return this.freeTextValue;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.authoritativeFormId.hashCode() * 31, 31, this.userFormId), 31, this.formKey);
        Integer num = this.version;
        int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.answeredCount, AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.totalQuestions, AbstractC11266d.m30448b(this.questionIndex, AbstractC11266d.m30448b(this.maxSelections, AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC11266d.m30450d((iM30450d + (num == null ? 0 : num.hashCode())) * 31, 31, this.questionId), 31, this.prompt), 31, this.options), 31, this.isCompleted), 31, this.isMultiSelect), 31), 31), 31), 31, this.canGoBack), 31), 31, this.isFreeText);
        String str = this.freeTextValue;
        int iM30448b = AbstractC11266d.m30448b(this.userInputTextMaxLength, AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM8289b + (str == null ? 0 : str.hashCode())) * 31, 31, this.isRequired), 31, this.hasSavedAnswer), 31, this.progressLabel), 31, this.submitButtonText), 31, this.completedButtonText), 31, this.placeholder), 31);
        String str2 = this.moderationError;
        int iHashCode = (iM30448b + (str2 == null ? 0 : str2.hashCode())) * 31;
        Action action = this.onAnswer;
        int iHashCode2 = (iHashCode + (action == null ? 0 : action.hashCode())) * 31;
        Action action2 = this.onComplete;
        return this.completedAnswerDisplay.hashCode() + AbstractC2875y.m8289b((iHashCode2 + (action2 != null ? action2.hashCode() : 0)) * 31, 31, this.isCheckboxStyle);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getHasSavedAnswer() {
        return this.hasSavedAnswer;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getMaxSelections() {
        return this.maxSelections;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getModerationError() {
        return this.moderationError;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final Action getOnAnswer() {
        return this.onAnswer;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Action getOnComplete() {
        return this.onComplete;
    }

    /* JADX INFO: renamed from: n */
    public final List<C0885f> m2131n() {
        return this.options;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getPrompt() {
        return this.prompt;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getQuestionId() {
        return this.questionId;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final int getQuestionIndex() {
        return this.questionIndex;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getSubmitButtonText() {
        return this.submitButtonText;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final int getTotalQuestions() {
        return this.totalQuestions;
    }

    public String toString() {
        String str = this.authoritativeFormId;
        String str2 = this.userFormId;
        String str3 = this.formKey;
        Integer num = this.version;
        String str4 = this.questionId;
        String str5 = this.prompt;
        List<C0885f> list = this.options;
        boolean z4 = this.isCompleted;
        boolean z13 = this.isMultiSelect;
        int i13 = this.maxSelections;
        int i14 = this.questionIndex;
        int i15 = this.totalQuestions;
        boolean z14 = this.canGoBack;
        int i16 = this.answeredCount;
        boolean z15 = this.isFreeText;
        String str6 = this.freeTextValue;
        boolean z16 = this.isRequired;
        boolean z17 = this.hasSavedAnswer;
        String str7 = this.progressLabel;
        String str8 = this.submitButtonText;
        String str9 = this.completedButtonText;
        String str10 = this.placeholder;
        int i17 = this.userInputTextMaxLength;
        String str11 = this.moderationError;
        Action action = this.onAnswer;
        Action action2 = this.onComplete;
        boolean z18 = this.isCheckboxStyle;
        EnumC0881b enumC0881b = this.completedAnswerDisplay;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("FormContentViewState(authoritativeFormId=", str, ", userFormId=", str2, ", formKey=");
        AbstractC30007c.m91853w(num, str3, ", version=", ", questionId=", sbM32001t);
        AbstractC11266d.m30444B(sbM32001t, str4, ", prompt=", str5, ", options=");
        AbstractC26725a.m79512p(", isCompleted=", ", isMultiSelect=", sbM32001t, list, z4);
        AbstractC30802r.m94769r(i13, ", maxSelections=", ", questionIndex=", sbM32001t, z13);
        AbstractC30802r.m94773v(sbM32001t, i14, ", totalQuestions=", i15, ", canGoBack=");
        AbstractC30802r.m94769r(i16, ", answeredCount=", ", isFreeText=", sbM32001t, z14);
        AbstractC38963t7.m124391u(sbM32001t, z15, ", freeTextValue=", str6, ", isRequired=");
        AbstractC38963t7.m124392v(sbM32001t, z16, ", hasSavedAnswer=", z17, ", progressLabel=");
        AbstractC11266d.m30444B(sbM32001t, str7, ", submitButtonText=", str8, ", completedButtonText=");
        AbstractC11266d.m30444B(sbM32001t, str9, ", placeholder=", str10, ", userInputTextMaxLength=");
        AbstractC11895b.m31979B(i17, ", moderationError=", str11, ", onAnswer=", sbM32001t);
        sbM32001t.append(action);
        sbM32001t.append(", onComplete=");
        sbM32001t.append(action2);
        sbM32001t.append(", isCheckboxStyle=");
        sbM32001t.append(z18);
        sbM32001t.append(", completedAnswerDisplay=");
        sbM32001t.append(enumC0881b);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getUserFormId() {
        return this.userFormId;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final int getUserInputTextMaxLength() {
        return this.userInputTextMaxLength;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final Integer getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final boolean getIsCheckboxStyle() {
        return this.isCheckboxStyle;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final boolean getIsCompleted() {
        return this.isCompleted;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m2143z() {
        return this.questionIndex >= this.totalQuestions - 1;
    }

    public /* synthetic */ C0882c(String str, String str2, String str3, Integer num, String str4, String str5, List list, boolean z4, boolean z13, int i13, int i14, int i15, boolean z14, int i16, boolean z15, String str6, boolean z16, boolean z17, String str7, String str8, String str9, String str10, int i17, String str11, Action action, Action action2, boolean z18, EnumC0881b enumC0881b, int i18, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i18 & 8) != 0 ? null : num, str4, str5, list, (i18 & 128) != 0 ? false : z4, (i18 & 256) != 0 ? false : z13, (i18 & 512) != 0 ? 1 : i13, (i18 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? 0 : i14, (i18 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? 1 : i15, (i18 & 4096) != 0 ? false : z14, (i18 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? 0 : i16, (i18 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? false : z15, (32768 & i18) != 0 ? null : str6, (65536 & i18) != 0 ? true : z16, (131072 & i18) != 0 ? false : z17, (262144 & i18) != 0 ? "" : str7, (524288 & i18) != 0 ? "" : str8, (1048576 & i18) != 0 ? "" : str9, (2097152 & i18) != 0 ? "" : str10, (4194304 & i18) != 0 ? 2000 : i17, (8388608 & i18) != 0 ? null : str11, (16777216 & i18) != 0 ? null : action, (33554432 & i18) != 0 ? null : action2, (67108864 & i18) != 0 ? false : z18, (i18 & 134217728) != 0 ? EnumC0881b.GREY_OUT_ALL : enumC0881b);
    }
}
