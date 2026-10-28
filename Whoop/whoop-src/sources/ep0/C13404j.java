package ep0;

import androidx.profileinstaller.ProfileVerifier;
import c13.AbstractC3855a;
import com.whoop.coacheverywherecommon.models.CoachEducationType;
import com.whoop.coacheverywherecommon.models.CoachEntry;
import com.whoop.navigation.ChatEntrypointExperience;
import com.whoop.navigation.DrawerPresentation;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: ep0.j */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b-\b\u0087\b\u0018\u00002\u00020\u0001B\u009b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00160\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u0005¢\u0006\u0004\b!\u0010\"J¤\u0002\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00160\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\u00052\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010-\u001a\u0004\b.\u0010&R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b/\u0010-\u001a\u0004\b0\u0010&R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b9\u0010-\u001a\u0004\b:\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b;\u0010-\u001a\u0004\b<\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b=\u0010-\u001a\u0004\b;\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b>\u0010-\u001a\u0004\b?\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b@\u0010-\u001a\u0004\b@\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bA\u0010-\u001a\u0004\bB\u0010&R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b?\u0010-\u001a\u0004\b9\u0010&R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bC\u0010-\u001a\u0004\bD\u0010&R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bE\u0010-\u001a\u0004\bF\u0010&R\u0017\u0010\u0011\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bD\u00102\u001a\u0004\bC\u00104R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\b>\u0010HR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\bE\u0010&R#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00160\u00158\u0006¢\u0006\f\n\u0004\b.\u0010I\u001a\u0004\b1\u0010JR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bK\u0010-\u001a\u0004\bL\u0010&R\u0017\u0010\u0019\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bL\u00102\u001a\u0004\bK\u00104R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b<\u0010M\u001a\u0004\bA\u0010NR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b:\u0010O\u001a\u0004\b=\u0010PR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\bB\u0010Q\u001a\u0004\b5\u0010RR\u0017\u0010 \u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bS\u00102\u001a\u0004\bS\u00104¨\u0006T"}, m65681d2 = {"Lep0/j;", "", "", "screenName", "screenId", "", "isWceEnabled", "isWcePrefetch", "sourceType", "sourceId", "conversationSeedId", "fingerprint", "entryText", "userMessage", "contextualMessage", "presetQuestion", "presetQuestionKey", "includeInitialMessage", "Lcom/whoop/coacheverywherecommon/models/CoachEducationType;", "educationType", "onboardingAnalyticSource", "", "Lkotlinx/serialization/json/JsonElement;", "args", "source", "shouldOpenFullSize", "Lcom/whoop/navigation/ChatEntrypointExperience;", "entrypointExperience", "Lcom/whoop/navigation/DrawerPresentation;", "drawerPresentation", "Lcom/whoop/coacheverywherecommon/models/CoachEntry;", "coachEntry", "isBottomNavTab", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/coacheverywherecommon/models/CoachEducationType;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ZLcom/whoop/navigation/ChatEntrypointExperience;Lcom/whoop/navigation/DrawerPresentation;Lcom/whoop/coacheverywherecommon/models/CoachEntry;Z)V", "a", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/coacheverywherecommon/models/CoachEducationType;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ZLcom/whoop/navigation/ChatEntrypointExperience;Lcom/whoop/navigation/DrawerPresentation;Lcom/whoop/coacheverywherecommon/models/CoachEntry;Z)Lep0/j;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "q", "b", "p", "c", "Z", "x", "()Z", "d", "Ljava/lang/Boolean;", "y", "()Ljava/lang/Boolean;", "e", "u", "f", "t", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "k", "i", "j", "v", "l", "n", "m", "o", "Lcom/whoop/coacheverywherecommon/models/CoachEducationType;", "()Lcom/whoop/coacheverywherecommon/models/CoachEducationType;", "Ljava/util/Map;", "()Ljava/util/Map;", "r", "s", "Lcom/whoop/navigation/ChatEntrypointExperience;", "()Lcom/whoop/navigation/ChatEntrypointExperience;", "Lcom/whoop/navigation/DrawerPresentation;", "()Lcom/whoop/navigation/DrawerPresentation;", "Lcom/whoop/coacheverywherecommon/models/CoachEntry;", "()Lcom/whoop/coacheverywherecommon/models/CoachEntry;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "coach-everywhere-common_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C13404j {

    /* JADX INFO: renamed from: x */
    public static final int f46947x = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String screenName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String screenId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isWceEnabled;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Boolean isWcePrefetch;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String sourceType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String sourceId;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String conversationSeedId;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String fingerprint;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String entryText;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final String userMessage;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final String contextualMessage;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final String presetQuestion;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final String presetQuestionKey;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final boolean includeInitialMessage;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final CoachEducationType educationType;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final String onboardingAnalyticSource;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final Map<String, JsonElement> args;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final String source;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final boolean shouldOpenFullSize;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final ChatEntrypointExperience entrypointExperience;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final DrawerPresentation drawerPresentation;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final CoachEntry coachEntry;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final boolean isBottomNavTab;

    /* JADX WARN: Multi-variable type inference failed */
    public C13404j(String screenName, String str, boolean z4, Boolean bool, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z13, CoachEducationType coachEducationType, String str11, Map<String, ? extends JsonElement> args, String str12, boolean z14, ChatEntrypointExperience chatEntrypointExperience, DrawerPresentation drawerPresentation, CoachEntry coachEntry, boolean z15) {
        AbstractC22676k.m65750j(screenName, "screenName");
        AbstractC22676k.m65750j(args, "args");
        this.screenName = screenName;
        this.screenId = str;
        this.isWceEnabled = z4;
        this.isWcePrefetch = bool;
        this.sourceType = str2;
        this.sourceId = str3;
        this.conversationSeedId = str4;
        this.fingerprint = str5;
        this.entryText = str6;
        this.userMessage = str7;
        this.contextualMessage = str8;
        this.presetQuestion = str9;
        this.presetQuestionKey = str10;
        this.includeInitialMessage = z13;
        this.educationType = coachEducationType;
        this.onboardingAnalyticSource = str11;
        this.args = args;
        this.source = str12;
        this.shouldOpenFullSize = z14;
        this.entrypointExperience = chatEntrypointExperience;
        this.drawerPresentation = drawerPresentation;
        this.coachEntry = coachEntry;
        this.isBottomNavTab = z15;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C13404j m37844b(C13404j c13404j, String str, String str2, boolean z4, Boolean bool, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z13, CoachEducationType coachEducationType, String str12, Map map, String str13, boolean z14, ChatEntrypointExperience chatEntrypointExperience, DrawerPresentation drawerPresentation, CoachEntry coachEntry, boolean z15, int i13, Object obj) {
        boolean z16;
        CoachEntry coachEntry2;
        String str14 = (i13 & 1) != 0 ? c13404j.screenName : str;
        String str15 = (i13 & 2) != 0 ? c13404j.screenId : str2;
        boolean z17 = (i13 & 4) != 0 ? c13404j.isWceEnabled : z4;
        Boolean bool2 = (i13 & 8) != 0 ? c13404j.isWcePrefetch : bool;
        String str16 = (i13 & 16) != 0 ? c13404j.sourceType : str3;
        String str17 = (i13 & 32) != 0 ? c13404j.sourceId : str4;
        String str18 = (i13 & 64) != 0 ? c13404j.conversationSeedId : str5;
        String str19 = (i13 & 128) != 0 ? c13404j.fingerprint : str6;
        String str20 = (i13 & 256) != 0 ? c13404j.entryText : str7;
        String str21 = (i13 & 512) != 0 ? c13404j.userMessage : str8;
        String str22 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c13404j.contextualMessage : str9;
        String str23 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c13404j.presetQuestion : str10;
        String str24 = (i13 & 4096) != 0 ? c13404j.presetQuestionKey : str11;
        boolean z18 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c13404j.includeInitialMessage : z13;
        String str25 = str14;
        CoachEducationType coachEducationType2 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c13404j.educationType : coachEducationType;
        String str26 = (i13 & 32768) != 0 ? c13404j.onboardingAnalyticSource : str12;
        Map map2 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? c13404j.args : map;
        String str27 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? c13404j.source : str13;
        boolean z19 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? c13404j.shouldOpenFullSize : z14;
        ChatEntrypointExperience chatEntrypointExperience2 = (i13 & 524288) != 0 ? c13404j.entrypointExperience : chatEntrypointExperience;
        DrawerPresentation drawerPresentation2 = (i13 & 1048576) != 0 ? c13404j.drawerPresentation : drawerPresentation;
        CoachEntry coachEntry3 = (i13 & 2097152) != 0 ? c13404j.coachEntry : coachEntry;
        if ((i13 & 4194304) != 0) {
            coachEntry2 = coachEntry3;
            z16 = c13404j.isBottomNavTab;
        } else {
            z16 = z15;
            coachEntry2 = coachEntry3;
        }
        return c13404j.m37845a(str25, str15, z17, bool2, str16, str17, str18, str19, str20, str21, str22, str23, str24, z18, coachEducationType2, str26, map2, str27, z19, chatEntrypointExperience2, drawerPresentation2, coachEntry2, z16);
    }

    /* JADX INFO: renamed from: a */
    public final C13404j m37845a(String screenName, String screenId, boolean isWceEnabled, Boolean isWcePrefetch, String sourceType, String sourceId, String conversationSeedId, String fingerprint, String entryText, String userMessage, String contextualMessage, String presetQuestion, String presetQuestionKey, boolean includeInitialMessage, CoachEducationType educationType, String onboardingAnalyticSource, Map<String, ? extends JsonElement> args, String source, boolean shouldOpenFullSize, ChatEntrypointExperience entrypointExperience, DrawerPresentation drawerPresentation, CoachEntry coachEntry, boolean isBottomNavTab) {
        AbstractC22676k.m65750j(screenName, "screenName");
        AbstractC22676k.m65750j(args, "args");
        return new C13404j(screenName, screenId, isWceEnabled, isWcePrefetch, sourceType, sourceId, conversationSeedId, fingerprint, entryText, userMessage, contextualMessage, presetQuestion, presetQuestionKey, includeInitialMessage, educationType, onboardingAnalyticSource, args, source, shouldOpenFullSize, entrypointExperience, drawerPresentation, coachEntry, isBottomNavTab);
    }

    /* JADX INFO: renamed from: c */
    public final Map<String, JsonElement> m37846c() {
        return this.args;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final CoachEntry getCoachEntry() {
        return this.coachEntry;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getContextualMessage() {
        return this.contextualMessage;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C13404j)) {
            return false;
        }
        C13404j c13404j = (C13404j) other;
        return AbstractC22676k.m65745e(this.screenName, c13404j.screenName) && AbstractC22676k.m65745e(this.screenId, c13404j.screenId) && this.isWceEnabled == c13404j.isWceEnabled && AbstractC22676k.m65745e(this.isWcePrefetch, c13404j.isWcePrefetch) && AbstractC22676k.m65745e(this.sourceType, c13404j.sourceType) && AbstractC22676k.m65745e(this.sourceId, c13404j.sourceId) && AbstractC22676k.m65745e(this.conversationSeedId, c13404j.conversationSeedId) && AbstractC22676k.m65745e(this.fingerprint, c13404j.fingerprint) && AbstractC22676k.m65745e(this.entryText, c13404j.entryText) && AbstractC22676k.m65745e(this.userMessage, c13404j.userMessage) && AbstractC22676k.m65745e(this.contextualMessage, c13404j.contextualMessage) && AbstractC22676k.m65745e(this.presetQuestion, c13404j.presetQuestion) && AbstractC22676k.m65745e(this.presetQuestionKey, c13404j.presetQuestionKey) && this.includeInitialMessage == c13404j.includeInitialMessage && this.educationType == c13404j.educationType && AbstractC22676k.m65745e(this.onboardingAnalyticSource, c13404j.onboardingAnalyticSource) && AbstractC22676k.m65745e(this.args, c13404j.args) && AbstractC22676k.m65745e(this.source, c13404j.source) && this.shouldOpenFullSize == c13404j.shouldOpenFullSize && this.entrypointExperience == c13404j.entrypointExperience && this.drawerPresentation == c13404j.drawerPresentation && AbstractC22676k.m65745e(this.coachEntry, c13404j.coachEntry) && this.isBottomNavTab == c13404j.isBottomNavTab;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getConversationSeedId() {
        return this.conversationSeedId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final DrawerPresentation getDrawerPresentation() {
        return this.drawerPresentation;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final CoachEducationType getEducationType() {
        return this.educationType;
    }

    public int hashCode() {
        int iHashCode = this.screenName.hashCode() * 31;
        String str = this.screenId;
        int iM8289b = AbstractC2875y.m8289b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.isWceEnabled);
        Boolean bool = this.isWcePrefetch;
        int iHashCode2 = (iM8289b + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.sourceType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sourceId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.conversationSeedId;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.fingerprint;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.entryText;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.userMessage;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.contextualMessage;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.presetQuestion;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.presetQuestionKey;
        int iM8289b2 = AbstractC2875y.m8289b((iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31, 31, this.includeInitialMessage);
        CoachEducationType coachEducationType = this.educationType;
        int iHashCode11 = (iM8289b2 + (coachEducationType == null ? 0 : coachEducationType.hashCode())) * 31;
        String str11 = this.onboardingAnalyticSource;
        int iM11821e = AbstractC3855a.m11821e(this.args, (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31, 31);
        String str12 = this.source;
        int iM8289b3 = AbstractC2875y.m8289b((iM11821e + (str12 == null ? 0 : str12.hashCode())) * 31, 31, this.shouldOpenFullSize);
        ChatEntrypointExperience chatEntrypointExperience = this.entrypointExperience;
        int iHashCode12 = (iM8289b3 + (chatEntrypointExperience == null ? 0 : chatEntrypointExperience.hashCode())) * 31;
        DrawerPresentation drawerPresentation = this.drawerPresentation;
        int iHashCode13 = (iHashCode12 + (drawerPresentation == null ? 0 : drawerPresentation.hashCode())) * 31;
        CoachEntry coachEntry = this.coachEntry;
        return Boolean.hashCode(this.isBottomNavTab) + ((iHashCode13 + (coachEntry != null ? coachEntry.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getEntryText() {
        return this.entryText;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final ChatEntrypointExperience getEntrypointExperience() {
        return this.entrypointExperience;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getFingerprint() {
        return this.fingerprint;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getIncludeInitialMessage() {
        return this.includeInitialMessage;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getOnboardingAnalyticSource() {
        return this.onboardingAnalyticSource;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getPresetQuestion() {
        return this.presetQuestion;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getPresetQuestionKey() {
        return this.presetQuestionKey;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getScreenId() {
        return this.screenId;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getScreenName() {
        return this.screenName;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final boolean getShouldOpenFullSize() {
        return this.shouldOpenFullSize;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getSourceId() {
        return this.sourceId;
    }

    public String toString() {
        String str = this.screenName;
        String str2 = this.screenId;
        boolean z4 = this.isWceEnabled;
        Boolean bool = this.isWcePrefetch;
        String str3 = this.sourceType;
        String str4 = this.sourceId;
        String str5 = this.conversationSeedId;
        String str6 = this.fingerprint;
        String str7 = this.entryText;
        String str8 = this.userMessage;
        String str9 = this.contextualMessage;
        String str10 = this.presetQuestion;
        String str11 = this.presetQuestionKey;
        boolean z13 = this.includeInitialMessage;
        CoachEducationType coachEducationType = this.educationType;
        String str12 = this.onboardingAnalyticSource;
        Map<String, JsonElement> map = this.args;
        String str13 = this.source;
        boolean z14 = this.shouldOpenFullSize;
        ChatEntrypointExperience chatEntrypointExperience = this.entrypointExperience;
        DrawerPresentation drawerPresentation = this.drawerPresentation;
        CoachEntry coachEntry = this.coachEntry;
        boolean z15 = this.isBottomNavTab;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ScreenContextMetadata(screenName=", str, ", screenId=", str2, ", isWceEnabled=");
        sbM32001t.append(z4);
        sbM32001t.append(", isWcePrefetch=");
        sbM32001t.append(bool);
        sbM32001t.append(", sourceType=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", sourceId=", str4, ", conversationSeedId=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", fingerprint=", str6, ", entryText=");
        AbstractC11266d.m30444B(sbM32001t, str7, ", userMessage=", str8, ", contextualMessage=");
        AbstractC11266d.m30444B(sbM32001t, str9, ", presetQuestion=", str10, ", presetQuestionKey=");
        AbstractC38963t7.m124390t(sbM32001t, str11, ", includeInitialMessage=", z13, ", educationType=");
        sbM32001t.append(coachEducationType);
        sbM32001t.append(", onboardingAnalyticSource=");
        sbM32001t.append(str12);
        sbM32001t.append(", args=");
        sbM32001t.append(map);
        sbM32001t.append(", source=");
        sbM32001t.append(str13);
        sbM32001t.append(", shouldOpenFullSize=");
        sbM32001t.append(z14);
        sbM32001t.append(", entrypointExperience=");
        sbM32001t.append(chatEntrypointExperience);
        sbM32001t.append(", drawerPresentation=");
        sbM32001t.append(drawerPresentation);
        sbM32001t.append(", coachEntry=");
        sbM32001t.append(coachEntry);
        sbM32001t.append(", isBottomNavTab=");
        return AbstractC18489d0.m53372m(sbM32001t, z15, ")");
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getSourceType() {
        return this.sourceType;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final String getUserMessage() {
        return this.userMessage;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final boolean getIsBottomNavTab() {
        return this.isBottomNavTab;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final boolean getIsWceEnabled() {
        return this.isWceEnabled;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final Boolean getIsWcePrefetch() {
        return this.isWcePrefetch;
    }

    public /* synthetic */ C13404j(String str, String str2, boolean z4, Boolean bool, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z13, CoachEducationType coachEducationType, String str12, Map map, String str13, boolean z14, ChatEntrypointExperience chatEntrypointExperience, DrawerPresentation drawerPresentation, CoachEntry coachEntry, boolean z15, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? false : z4, (i13 & 8) != 0 ? null : bool, (i13 & 16) != 0 ? null : str3, (i13 & 32) != 0 ? null : str4, (i13 & 64) != 0 ? null : str5, (i13 & 128) != 0 ? null : str6, (i13 & 256) != 0 ? null : str7, (i13 & 512) != 0 ? null : str8, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : str9, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : str10, (i13 & 4096) != 0 ? null : str11, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? true : z13, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : coachEducationType, (i13 & 32768) != 0 ? null : str12, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? C25272z.f99163w : map, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? null : str13, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? false : z14, (i13 & 524288) != 0 ? null : chatEntrypointExperience, (i13 & 1048576) != 0 ? null : drawerPresentation, (i13 & 2097152) != 0 ? null : coachEntry, (i13 & 4194304) != 0 ? false : z15);
    }
}
