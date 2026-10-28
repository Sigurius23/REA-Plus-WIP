package p734sl0;

import androidx.profileinstaller.ProfileVerifier;
import c13.AbstractC3855a;
import com.whoop.navigation.ChatEntrypointExperience;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import o01.EnumC27349e;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: sl0.n0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b%\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0001$B×\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\r\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\r2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b+\u0010)\u001a\u0004\b(\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b+\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b.\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b/\u0010\u001dR\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010)\u001a\u0004\b0\u0010\u001dR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b1\u0010)\u001a\u0004\b2\u0010\u001dR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b2\u0010)\u001a\u0004\b3\u0010\u001dR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b1\u00105R\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b6\u0010)\u001a\u0004\b7\u0010\u001dR#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b$\u00109R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b/\u0010)\u001a\u0004\b6\u0010\u001dR\u0017\u0010\u0014\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b0\u00104\u001a\u0004\b:\u00105R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b;\u0010)\u001a\u0004\b;\u0010\u001dR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b<\u0010)\u001a\u0004\b<\u0010\u001dR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b-\u0010?R\u0017\u0010\u0019\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b@\u00104\u001a\u0004\b=\u00105R\u0013\u0010A\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b,\u0010\u001dR\u0011\u0010B\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b@\u00105¨\u0006C"}, m65681d2 = {"Lsl0/n0;", "", "Lo01/e;", "suggestionCategory", "", "hint", "contextualMessage", "conversationIdSeed", "fingerprint", "sourcePillar", "sourceType", "presetQuestion", "presetQuestionKey", "", "includeInitialMessage", "sourceId", "", "Lkotlinx/serialization/json/JsonElement;", "args", "source", "isWcePrefetch", "staticInitialMessage", "userMessage", "Lcom/whoop/navigation/ChatEntrypointExperience;", "entrypointExperience", "isDay0", "<init>", "(Lo01/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/Map;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/ChatEntrypointExperience;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lo01/e;", "getSuggestionCategory", "()Lo01/e;", "b", "Ljava/lang/String;", "g", "c", "d", "e", "f", "m", "n", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "j", "Z", "()Z", "k", "l", "Ljava/util/Map;", "()Ljava/util/Map;", "s", "o", "p", "q", "Lcom/whoop/navigation/ChatEntrypointExperience;", "()Lcom/whoop/navigation/ChatEntrypointExperience;", "r", "effectiveInitialMessage", "isQuickHistoryEntry", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32645n0 {

    /* JADX INFO: renamed from: t */
    public static final int f135304t = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC27349e suggestionCategory;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String hint;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String contextualMessage;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String conversationIdSeed;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String fingerprint;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String sourcePillar;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String sourceType;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String presetQuestion;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String presetQuestionKey;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean includeInitialMessage;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final String sourceId;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final Map<String, JsonElement> args;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final String source;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final boolean isWcePrefetch;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final String staticInitialMessage;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final String userMessage;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final ChatEntrypointExperience entrypointExperience;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final boolean isDay0;

    /* JADX WARN: Multi-variable type inference failed */
    public C32645n0(EnumC27349e suggestionCategory, String hint, String str, String conversationIdSeed, String str2, String sourcePillar, String sourceType, String str3, String str4, boolean z4, String sourceId, Map<String, ? extends JsonElement> args, String str5, boolean z13, String str6, String str7, ChatEntrypointExperience chatEntrypointExperience, boolean z14) {
        AbstractC22676k.m65750j(suggestionCategory, "suggestionCategory");
        AbstractC22676k.m65750j(hint, "hint");
        AbstractC22676k.m65750j(conversationIdSeed, "conversationIdSeed");
        AbstractC22676k.m65750j(sourcePillar, "sourcePillar");
        AbstractC22676k.m65750j(sourceType, "sourceType");
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(args, "args");
        this.suggestionCategory = suggestionCategory;
        this.hint = hint;
        this.contextualMessage = str;
        this.conversationIdSeed = conversationIdSeed;
        this.fingerprint = str2;
        this.sourcePillar = sourcePillar;
        this.sourceType = sourceType;
        this.presetQuestion = str3;
        this.presetQuestionKey = str4;
        this.includeInitialMessage = z4;
        this.sourceId = sourceId;
        this.args = args;
        this.source = str5;
        this.isWcePrefetch = z13;
        this.staticInitialMessage = str6;
        this.userMessage = str7;
        this.entrypointExperience = chatEntrypointExperience;
        this.isDay0 = z14;
    }

    /* JADX INFO: renamed from: a */
    public final Map<String, JsonElement> m102016a() {
        return this.args;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getContextualMessage() {
        return this.contextualMessage;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getConversationIdSeed() {
        return this.conversationIdSeed;
    }

    /* JADX INFO: renamed from: d */
    public final String m102019d() {
        String str = this.staticInitialMessage;
        return str == null ? this.contextualMessage : str;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final ChatEntrypointExperience getEntrypointExperience() {
        return this.entrypointExperience;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32645n0)) {
            return false;
        }
        C32645n0 c32645n0 = (C32645n0) other;
        return this.suggestionCategory == c32645n0.suggestionCategory && AbstractC22676k.m65745e(this.hint, c32645n0.hint) && AbstractC22676k.m65745e(this.contextualMessage, c32645n0.contextualMessage) && AbstractC22676k.m65745e(this.conversationIdSeed, c32645n0.conversationIdSeed) && AbstractC22676k.m65745e(this.fingerprint, c32645n0.fingerprint) && AbstractC22676k.m65745e(this.sourcePillar, c32645n0.sourcePillar) && AbstractC22676k.m65745e(this.sourceType, c32645n0.sourceType) && AbstractC22676k.m65745e(this.presetQuestion, c32645n0.presetQuestion) && AbstractC22676k.m65745e(this.presetQuestionKey, c32645n0.presetQuestionKey) && this.includeInitialMessage == c32645n0.includeInitialMessage && AbstractC22676k.m65745e(this.sourceId, c32645n0.sourceId) && AbstractC22676k.m65745e(this.args, c32645n0.args) && AbstractC22676k.m65745e(this.source, c32645n0.source) && this.isWcePrefetch == c32645n0.isWcePrefetch && AbstractC22676k.m65745e(this.staticInitialMessage, c32645n0.staticInitialMessage) && AbstractC22676k.m65745e(this.userMessage, c32645n0.userMessage) && this.entrypointExperience == c32645n0.entrypointExperience && this.isDay0 == c32645n0.isDay0;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getFingerprint() {
        return this.fingerprint;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIncludeInitialMessage() {
        return this.includeInitialMessage;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.suggestionCategory.hashCode() * 31, 31, this.hint);
        String str = this.contextualMessage;
        int iM30450d2 = AbstractC11266d.m30450d((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.conversationIdSeed);
        String str2 = this.fingerprint;
        int iM30450d3 = AbstractC11266d.m30450d(AbstractC11266d.m30450d((iM30450d2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.sourcePillar), 31, this.sourceType);
        String str3 = this.presetQuestion;
        int iHashCode = (iM30450d3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.presetQuestionKey;
        int iM11821e = AbstractC3855a.m11821e(this.args, AbstractC11266d.m30450d(AbstractC2875y.m8289b((iHashCode + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.includeInitialMessage), 31, this.sourceId), 31);
        String str5 = this.source;
        int iM8289b = AbstractC2875y.m8289b((iM11821e + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.isWcePrefetch);
        String str6 = this.staticInitialMessage;
        int iHashCode2 = (iM8289b + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.userMessage;
        int iHashCode3 = (iHashCode2 + (str7 == null ? 0 : str7.hashCode())) * 31;
        ChatEntrypointExperience chatEntrypointExperience = this.entrypointExperience;
        return Boolean.hashCode(this.isDay0) + ((iHashCode3 + (chatEntrypointExperience != null ? chatEntrypointExperience.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getPresetQuestion() {
        return this.presetQuestion;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getPresetQuestionKey() {
        return this.presetQuestionKey;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getSourceId() {
        return this.sourceId;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getSourcePillar() {
        return this.sourcePillar;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getSourceType() {
        return this.sourceType;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getStaticInitialMessage() {
        return this.staticInitialMessage;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getUserMessage() {
        return this.userMessage;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getIsDay0() {
        return this.isDay0;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m102033r() {
        return this.entrypointExperience == ChatEntrypointExperience.QUICK_HISTORY && AbstractC22676k.m65745e(this.fingerprint, "chat-history");
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final boolean getIsWcePrefetch() {
        return this.isWcePrefetch;
    }

    public String toString() {
        EnumC27349e enumC27349e = this.suggestionCategory;
        String str = this.hint;
        String str2 = this.contextualMessage;
        String str3 = this.conversationIdSeed;
        String str4 = this.fingerprint;
        String str5 = this.sourcePillar;
        String str6 = this.sourceType;
        String str7 = this.presetQuestion;
        String str8 = this.presetQuestionKey;
        boolean z4 = this.includeInitialMessage;
        String str9 = this.sourceId;
        Map<String, JsonElement> map = this.args;
        String str10 = this.source;
        boolean z13 = this.isWcePrefetch;
        String str11 = this.staticInitialMessage;
        String str12 = this.userMessage;
        ChatEntrypointExperience chatEntrypointExperience = this.entrypointExperience;
        boolean z14 = this.isDay0;
        StringBuilder sb4 = new StringBuilder("AiConversationScreenArgs(suggestionCategory=");
        sb4.append(enumC27349e);
        sb4.append(", hint=");
        sb4.append(str);
        sb4.append(", contextualMessage=");
        AbstractC11266d.m30444B(sb4, str2, ", conversationIdSeed=", str3, ", fingerprint=");
        AbstractC11266d.m30444B(sb4, str4, ", sourcePillar=", str5, ", sourceType=");
        AbstractC11266d.m30444B(sb4, str6, ", presetQuestion=", str7, ", presetQuestionKey=");
        AbstractC38963t7.m124390t(sb4, str8, ", includeInitialMessage=", z4, ", sourceId=");
        AbstractC36095b.m114695w(sb4, str9, ", args=", map, ", source=");
        AbstractC38963t7.m124390t(sb4, str10, ", isWcePrefetch=", z13, ", staticInitialMessage=");
        AbstractC11266d.m30444B(sb4, str11, ", userMessage=", str12, ", entrypointExperience=");
        sb4.append(chatEntrypointExperience);
        sb4.append(", isDay0=");
        sb4.append(z14);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ C32645n0(EnumC27349e enumC27349e, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z4, String str9, Map map, String str10, boolean z13, String str11, String str12, ChatEntrypointExperience chatEntrypointExperience, boolean z14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? EnumC27349e.GENERAL : enumC27349e, (i13 & 2) != 0 ? "" : str, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? "" : str3, (i13 & 16) != 0 ? null : str4, (i13 & 32) != 0 ? "" : str5, (i13 & 64) != 0 ? "" : str6, (i13 & 128) != 0 ? null : str7, (i13 & 256) != 0 ? null : str8, (i13 & 512) != 0 ? true : z4, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? "" : str9, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? C25272z.f99163w : map, (i13 & 4096) == 0 ? str10 : "", (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? false : z13, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : str11, (i13 & 32768) != 0 ? null : str12, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? null : chatEntrypointExperience, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? false : z14);
    }
}
