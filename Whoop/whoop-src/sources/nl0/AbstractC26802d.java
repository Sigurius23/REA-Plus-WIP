package nl0;

import android.net.Uri;
import com.whoop.bot.models.feedback.AiMessageFeedback;
import fl0.C14567l;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlinx.serialization.json.JsonElement;
import m83.C25272z;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p319m4.AbstractC25012a;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import te0.AbstractC33745d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: nl0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0013\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0013\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()¨\u0006*"}, m65681d2 = {"Lnl0/d;", "", "<init>", "()V", "c", "d", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "k", "l", "m", "s", "f", "i", "n", "e", "g", "q", "p", "o", "b", "a", "r", "j", "Lnl0/d$a;", "Lnl0/d$b;", "Lnl0/d$c;", "Lnl0/d$d;", "Lnl0/d$e;", "Lnl0/d$f;", "Lnl0/d$g;", "Lnl0/d$h;", "Lnl0/d$i;", "Lnl0/d$j;", "Lnl0/d$k;", "Lnl0/d$l;", "Lnl0/d$m;", "Lnl0/d$n;", "Lnl0/d$o;", "Lnl0/d$p;", "Lnl0/d$q;", "Lnl0/d$r;", "Lnl0/d$s;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC26802d {

    /* JADX INFO: renamed from: nl0.d$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lnl0/d$b;", "Lnl0/d;", "<init>", "()V", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC26802d {

        /* JADX INFO: renamed from: a */
        public static final b f106764a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: nl0.d$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lnl0/d$c;", "Lnl0/d;", "Ljava/util/UUID;", "supportActionTileId", "<init>", "(Ljava/util/UUID;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "()Ljava/util/UUID;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC26802d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final UUID supportActionTileId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(UUID supportActionTileId) {
            super(null);
            AbstractC22676k.m65750j(supportActionTileId, "supportActionTileId");
            this.supportActionTileId = supportActionTileId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final UUID getSupportActionTileId() {
            return this.supportActionTileId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && AbstractC22676k.m65745e(this.supportActionTileId, ((c) other).supportActionTileId);
        }

        public int hashCode() {
            return this.supportActionTileId.hashCode();
        }

        public String toString() {
            return "CreateMxmSupportTicket(supportActionTileId=" + this.supportActionTileId + ")";
        }
    }

    /* JADX INFO: renamed from: nl0.d$d */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lnl0/d$d;", "Lnl0/d;", "", "conversationId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC26802d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String conversationId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String conversationId) {
            super(null);
            AbstractC22676k.m65750j(conversationId, "conversationId");
            this.conversationId = conversationId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && AbstractC22676k.m65745e(this.conversationId, ((d) other).conversationId);
        }

        public int hashCode() {
            return this.conversationId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("DeleteConversation(conversationId=", this.conversationId, ")");
        }
    }

    /* JADX INFO: renamed from: nl0.d$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lnl0/d$e;", "Lnl0/d;", "<init>", "()V", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC26802d {

        /* JADX INFO: renamed from: a */
        public static final e f106767a = new e();

        private e() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: nl0.d$f */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m65681d2 = {"Lnl0/d$f;", "Lnl0/d;", "", "conversationId", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC26802d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String conversationId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String conversationId) {
            super(null);
            AbstractC22676k.m65750j(conversationId, "conversationId");
            this.conversationId = conversationId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }
    }

    /* JADX INFO: renamed from: nl0.d$g */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lnl0/d$g;", "Lnl0/d;", "<init>", "()V", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC26802d {

        /* JADX INFO: renamed from: a */
        public static final g f106769a = new g();

        private g() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: nl0.d$h */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001c\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\u001e\u0010\"R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001a\u001a\u0004\b#\u0010\u0011R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010$\u001a\u0004\b\u0019\u0010%¨\u0006&"}, m65681d2 = {"Lnl0/d$h;", "Lnl0/d;", "", "contextualMessage", "conversationIdSeed", "sourceType", "presetQuestion", "", "includeInitialMessage", "hasLocationPermission", "sourceId", "", "Lkotlinx/serialization/json/JsonElement;", "args", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "d", "f", "e", "Z", "()Z", "g", "Ljava/util/Map;", "()Ljava/util/Map;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h extends AbstractC26802d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String contextualMessage;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String conversationIdSeed;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String sourceType;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String presetQuestion;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final boolean includeInitialMessage;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final boolean hasLocationPermission;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String sourceId;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final Map<String, JsonElement> args;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(String str, String conversationIdSeed, String sourceType, String str2, boolean z4, boolean z13, String sourceId, Map<String, ? extends JsonElement> args) {
            super(null);
            AbstractC22676k.m65750j(conversationIdSeed, "conversationIdSeed");
            AbstractC22676k.m65750j(sourceType, "sourceType");
            AbstractC22676k.m65750j(sourceId, "sourceId");
            AbstractC22676k.m65750j(args, "args");
            this.contextualMessage = str;
            this.conversationIdSeed = conversationIdSeed;
            this.sourceType = sourceType;
            this.presetQuestion = str2;
            this.includeInitialMessage = z4;
            this.hasLocationPermission = z13;
            this.sourceId = sourceId;
            this.args = args;
        }

        /* JADX INFO: renamed from: a */
        public final Map<String, JsonElement> m79906a() {
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

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getHasLocationPermission() {
            return this.hasLocationPermission;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getIncludeInitialMessage() {
            return this.includeInitialMessage;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof h)) {
                return false;
            }
            h hVar = (h) other;
            return AbstractC22676k.m65745e(this.contextualMessage, hVar.contextualMessage) && AbstractC22676k.m65745e(this.conversationIdSeed, hVar.conversationIdSeed) && AbstractC22676k.m65745e(this.sourceType, hVar.sourceType) && AbstractC22676k.m65745e(this.presetQuestion, hVar.presetQuestion) && this.includeInitialMessage == hVar.includeInitialMessage && this.hasLocationPermission == hVar.hasLocationPermission && AbstractC22676k.m65745e(this.sourceId, hVar.sourceId) && AbstractC22676k.m65745e(this.args, hVar.args);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getPresetQuestion() {
            return this.presetQuestion;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getSourceId() {
            return this.sourceId;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getSourceType() {
            return this.sourceType;
        }

        public int hashCode() {
            String str = this.contextualMessage;
            int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.conversationIdSeed), 31, this.sourceType);
            String str2 = this.presetQuestion;
            return this.args.hashCode() + AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM30450d + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.includeInitialMessage), 31, this.hasLocationPermission), 31, this.sourceId);
        }

        public String toString() {
            String str = this.contextualMessage;
            String str2 = this.conversationIdSeed;
            String str3 = this.sourceType;
            String str4 = this.presetQuestion;
            boolean z4 = this.includeInitialMessage;
            boolean z13 = this.hasLocationPermission;
            String str5 = this.sourceId;
            Map<String, JsonElement> map = this.args;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("LoadSuggestion(contextualMessage=", str, ", conversationIdSeed=", str2, ", sourceType=");
            AbstractC11266d.m30444B(sbM32001t, str3, ", presetQuestion=", str4, ", includeInitialMessage=");
            AbstractC38963t7.m124392v(sbM32001t, z4, ", hasLocationPermission=", z13, ", sourceId=");
            return AbstractC30007c.m91842l(sbM32001t, str5, ", args=", map, ")");
        }

        public /* synthetic */ h(String str, String str2, String str3, String str4, boolean z4, boolean z13, String str5, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? null : str4, (i13 & 16) != 0 ? true : z4, (i13 & 32) != 0 ? false : z13, (i13 & 64) != 0 ? "" : str5, (i13 & 128) != 0 ? C25272z.f99163w : map);
        }
    }

    /* JADX INFO: renamed from: nl0.d$i */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lnl0/d$i;", "Lnl0/d;", "<init>", "()V", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC26802d {

        /* JADX INFO: renamed from: a */
        public static final i f106778a = new i();

        private i() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: nl0.d$j */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lnl0/d$j;", "Lnl0/d;", "", "fileId", "Landroid/net/Uri;", "fileUri", "<init>", "(Ljava/lang/String;Landroid/net/Uri;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Landroid/net/Uri;", "()Landroid/net/Uri;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class j extends AbstractC26802d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String fileId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Uri fileUri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, Uri fileUri) {
            super(null);
            AbstractC22676k.m65750j(fileUri, "fileUri");
            this.fileId = str;
            this.fileUri = fileUri;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFileId() {
            return this.fileId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Uri getFileUri() {
            return this.fileUri;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof j)) {
                return false;
            }
            j jVar = (j) other;
            return AbstractC22676k.m65745e(this.fileId, jVar.fileId) && AbstractC22676k.m65745e(this.fileUri, jVar.fileUri);
        }

        public int hashCode() {
            String str = this.fileId;
            return this.fileUri.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public String toString() {
            return "RemoveImage(fileId=" + this.fileId + ", fileUri=" + this.fileUri + ")";
        }
    }

    /* JADX INFO: renamed from: nl0.d$k */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lnl0/d$k;", "Lnl0/d;", "", "messageId", "Lcom/whoop/bot/models/feedback/AiMessageFeedback;", "feedback", "<init>", "(Ljava/lang/String;Lcom/whoop/bot/models/feedback/AiMessageFeedback;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/whoop/bot/models/feedback/AiMessageFeedback;", "()Lcom/whoop/bot/models/feedback/AiMessageFeedback;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class k extends AbstractC26802d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String messageId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final AiMessageFeedback feedback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String messageId, AiMessageFeedback feedback) {
            super(null);
            AbstractC22676k.m65750j(messageId, "messageId");
            AbstractC22676k.m65750j(feedback, "feedback");
            this.messageId = messageId;
            this.feedback = feedback;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AiMessageFeedback getFeedback() {
            return this.feedback;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getMessageId() {
            return this.messageId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof k)) {
                return false;
            }
            k kVar = (k) other;
            return AbstractC22676k.m65745e(this.messageId, kVar.messageId) && AbstractC22676k.m65745e(this.feedback, kVar.feedback);
        }

        public int hashCode() {
            return this.feedback.hashCode() + (this.messageId.hashCode() * 31);
        }

        public String toString() {
            return "SendFeedback(messageId=" + this.messageId + ", feedback=" + this.feedback + ")";
        }
    }

    /* JADX INFO: renamed from: nl0.d$n */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lnl0/d$n;", "Lnl0/d;", "", "conversationId", "messageId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class n extends AbstractC26802d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String conversationId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String messageId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String conversationId, String messageId) {
            super(null);
            AbstractC22676k.m65750j(conversationId, "conversationId");
            AbstractC22676k.m65750j(messageId, "messageId");
            this.conversationId = conversationId;
            this.messageId = messageId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getMessageId() {
            return this.messageId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof n)) {
                return false;
            }
            n nVar = (n) other;
            return AbstractC22676k.m65745e(this.conversationId, nVar.conversationId) && AbstractC22676k.m65745e(this.messageId, nVar.messageId);
        }

        public int hashCode() {
            return this.messageId.hashCode() + (this.conversationId.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("StopGenerating(conversationId=", this.conversationId, ", messageId=", this.messageId, ")");
        }

        public /* synthetic */ n(String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i13 & 2) != 0 ? "" : str2);
        }
    }

    /* JADX INFO: renamed from: nl0.d$o */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lnl0/d$o;", "Lnl0/d;", "", "conversationId", "variant", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class o extends AbstractC26802d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String conversationId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String variant;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String conversationId, String variant) {
            super(null);
            AbstractC22676k.m65750j(conversationId, "conversationId");
            AbstractC22676k.m65750j(variant, "variant");
            this.conversationId = conversationId;
            this.variant = variant;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getVariant() {
            return this.variant;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof o)) {
                return false;
            }
            o oVar = (o) other;
            return AbstractC22676k.m65745e(this.conversationId, oVar.conversationId) && AbstractC22676k.m65745e(this.variant, oVar.variant);
        }

        public int hashCode() {
            return this.variant.hashCode() + (this.conversationId.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("TrackSuggestionsScrolled(conversationId=", this.conversationId, ", variant=", this.variant, ")");
        }
    }

    /* JADX INFO: renamed from: nl0.d$p */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0014\u0010\f¨\u0006\u0017"}, m65681d2 = {"Lnl0/d$p;", "Lnl0/d;", "", "conversationId", "variant", "", "suggestionCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "I", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class p extends AbstractC26802d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String conversationId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String variant;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final int suggestionCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(String conversationId, String variant, int i13) {
            super(null);
            AbstractC22676k.m65750j(conversationId, "conversationId");
            AbstractC22676k.m65750j(variant, "variant");
            this.conversationId = conversationId;
            this.variant = variant;
            this.suggestionCount = i13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getSuggestionCount() {
            return this.suggestionCount;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getVariant() {
            return this.variant;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof p)) {
                return false;
            }
            p pVar = (p) other;
            return AbstractC22676k.m65745e(this.conversationId, pVar.conversationId) && AbstractC22676k.m65745e(this.variant, pVar.variant) && this.suggestionCount == pVar.suggestionCount;
        }

        public int hashCode() {
            return Integer.hashCode(this.suggestionCount) + AbstractC11266d.m30450d(this.conversationId.hashCode() * 31, 31, this.variant);
        }

        public String toString() {
            String str = this.conversationId;
            String str2 = this.variant;
            return AbstractC18489d0.m53371l(AbstractC11895b.m32001t("TrackSuggestionsShown(conversationId=", str, ", variant=", str2, ", suggestionCount="), this.suggestionCount, ")");
        }
    }

    /* JADX INFO: renamed from: nl0.d$q */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lnl0/d$q;", "Lnl0/d;", "<init>", "()V", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q extends AbstractC26802d {

        /* JADX INFO: renamed from: a */
        public static final q f106803a = new q();

        private q() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: nl0.d$r */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lnl0/d$r;", "Lnl0/d;", "", "Landroid/net/Uri;", "imageUris", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class r extends AbstractC26802d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<Uri> imageUris;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public r(List<? extends Uri> imageUris) {
            super(null);
            AbstractC22676k.m65750j(imageUris, "imageUris");
            this.imageUris = imageUris;
        }

        /* JADX INFO: renamed from: a */
        public final List<Uri> m79937a() {
            return this.imageUris;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof r) && AbstractC22676k.m65745e(this.imageUris, ((r) other).imageUris);
        }

        public int hashCode() {
            return this.imageUris.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106654m("UploadImages(imageUris=", ")", this.imageUris);
        }
    }

    /* JADX INFO: renamed from: nl0.d$s */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lnl0/d$s;", "Lnl0/d;", "", "conversationId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class s extends AbstractC26802d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String conversationId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(String conversationId) {
            super(null);
            AbstractC22676k.m65750j(conversationId, "conversationId");
            this.conversationId = conversationId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof s) && AbstractC22676k.m65745e(this.conversationId, ((s) other).conversationId);
        }

        public int hashCode() {
            return this.conversationId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("ViewPastConversation(conversationId=", this.conversationId, ")");
        }
    }

    public /* synthetic */ AbstractC26802d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC26802d() {
    }

    /* JADX INFO: renamed from: nl0.d$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001b\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u0014\u0010\f¨\u0006\u001c"}, m65681d2 = {"Lnl0/d$a;", "Lnl0/d;", "", "committed", "", "recommendationId", "fromGhostTile", "replacementId", "activityName", "<init>", "(ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "Ljava/lang/String;", "d", "c", "e", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC26802d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean committed;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String recommendationId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean fromGhostTile;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String replacementId;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String activityName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z4, String recommendationId, boolean z13, String str, String str2) {
            super(null);
            AbstractC22676k.m65750j(recommendationId, "recommendationId");
            this.committed = z4;
            this.recommendationId = recommendationId;
            this.fromGhostTile = z13;
            this.replacementId = str;
            this.activityName = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getActivityName() {
            return this.activityName;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getCommitted() {
            return this.committed;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getFromGhostTile() {
            return this.fromGhostTile;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getRecommendationId() {
            return this.recommendationId;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getReplacementId() {
            return this.replacementId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.committed == aVar.committed && AbstractC22676k.m65745e(this.recommendationId, aVar.recommendationId) && this.fromGhostTile == aVar.fromGhostTile && AbstractC22676k.m65745e(this.replacementId, aVar.replacementId) && AbstractC22676k.m65745e(this.activityName, aVar.activityName);
        }

        public int hashCode() {
            int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30450d(Boolean.hashCode(this.committed) * 31, 31, this.recommendationId), 31, this.fromGhostTile);
            String str = this.replacementId;
            int iHashCode = (iM8289b + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.activityName;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            boolean z4 = this.committed;
            String str = this.recommendationId;
            boolean z13 = this.fromGhostTile;
            String str2 = this.replacementId;
            String str3 = this.activityName;
            StringBuilder sbM38567n = AbstractC13673n.m38567n("CommitRecommendation(committed=", ", recommendationId=", str, ", fromGhostTile=", z4);
            AbstractC38963t7.m124391u(sbM38567n, z13, ", replacementId=", str2, ", activityName=");
            return AbstractC25012a.m73376i(str3, ")", sbM38567n);
        }

        public /* synthetic */ a(boolean z4, String str, boolean z13, String str2, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(z4, str, (i13 & 4) != 0 ? false : z13, (i13 & 8) != 0 ? null : str2, (i13 & 16) != 0 ? null : str3);
        }
    }

    /* JADX INFO: renamed from: nl0.d$m */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u0016\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001c\u0010\u000eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f¨\u0006 "}, m65681d2 = {"Lnl0/d$m;", "Lnl0/d;", "", "userQuestion", "", "index", "messageCount", "conversationId", "messageId", "Lfl0/l;", "retryAnalyticsData", "<init>", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lfl0/l;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "I", "c", "d", "e", "Lfl0/l;", "()Lfl0/l;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class m extends AbstractC26802d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String userQuestion;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int index;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final int messageCount;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String conversationId;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String messageId;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final C14567l retryAnalyticsData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String userQuestion, int i13, int i14, String conversationId, String str, C14567l c14567l) {
            super(null);
            AbstractC22676k.m65750j(userQuestion, "userQuestion");
            AbstractC22676k.m65750j(conversationId, "conversationId");
            this.userQuestion = userQuestion;
            this.index = i13;
            this.messageCount = i14;
            this.conversationId = conversationId;
            this.messageId = str;
            this.retryAnalyticsData = c14567l;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getMessageCount() {
            return this.messageCount;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getMessageId() {
            return this.messageId;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final C14567l getRetryAnalyticsData() {
            return this.retryAnalyticsData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof m)) {
                return false;
            }
            m mVar = (m) other;
            return AbstractC22676k.m65745e(this.userQuestion, mVar.userQuestion) && this.index == mVar.index && this.messageCount == mVar.messageCount && AbstractC22676k.m65745e(this.conversationId, mVar.conversationId) && AbstractC22676k.m65745e(this.messageId, mVar.messageId) && AbstractC22676k.m65745e(this.retryAnalyticsData, mVar.retryAnalyticsData);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getUserQuestion() {
            return this.userQuestion;
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.messageCount, AbstractC11266d.m30448b(this.index, this.userQuestion.hashCode() * 31, 31), 31), 31, this.conversationId);
            String str = this.messageId;
            int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
            C14567l c14567l = this.retryAnalyticsData;
            return iHashCode + (c14567l != null ? c14567l.hashCode() : 0);
        }

        public String toString() {
            String str = this.userQuestion;
            int i13 = this.index;
            int i14 = this.messageCount;
            String str2 = this.conversationId;
            String str3 = this.messageId;
            C14567l c14567l = this.retryAnalyticsData;
            StringBuilder sbM30467u = AbstractC11266d.m30467u(i13, "SendQuestionSuggestion(userQuestion=", str, ", index=", ", messageCount=");
            AbstractC11895b.m31979B(i14, ", conversationId=", str2, ", messageId=", sbM30467u);
            sbM30467u.append(str3);
            sbM30467u.append(", retryAnalyticsData=");
            sbM30467u.append(c14567l);
            sbM30467u.append(")");
            return sbM30467u.toString();
        }

        public /* synthetic */ m(String str, int i13, int i14, String str2, String str3, C14567l c14567l, int i15, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i15 & 2) != 0 ? 0 : i13, (i15 & 4) != 0 ? 0 : i14, str2, (i15 & 16) != 0 ? null : str3, (i15 & 32) != 0 ? null : c14567l);
        }
    }

    /* JADX INFO: renamed from: nl0.d$l */
    @Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b\u001f\u0010\u0012R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\"R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\u0019\u0010\"R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b \u0010(¨\u0006)"}, m65681d2 = {"Lnl0/d$l;", "Lnl0/d;", "", "userQuestion", "", "messageCount", "messageId", "", "Landroid/net/Uri;", "imageUris", "fileIds", "", "isVoiceInput", "Lfl0/l;", "retryAnalyticsData", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Ljava/util/List;ZLfl0/l;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "I", "getMessageCount", "c", "d", "Ljava/util/List;", "()Ljava/util/List;", "f", "Z", "()Z", "g", "Lfl0/l;", "()Lfl0/l;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class l extends AbstractC26802d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String userQuestion;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int messageCount;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String messageId;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final List<Uri> imageUris;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final List<String> fileIds;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final boolean isVoiceInput;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final C14567l retryAnalyticsData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public l(String userQuestion, int i13, String str, List<? extends Uri> list, List<String> list2, boolean z4, C14567l c14567l) {
            super(null);
            AbstractC22676k.m65750j(userQuestion, "userQuestion");
            this.userQuestion = userQuestion;
            this.messageCount = i13;
            this.messageId = str;
            this.imageUris = list;
            this.fileIds = list2;
            this.isVoiceInput = z4;
            this.retryAnalyticsData = c14567l;
        }

        /* JADX INFO: renamed from: a */
        public final List<String> m79918a() {
            return this.fileIds;
        }

        /* JADX INFO: renamed from: b */
        public final List<Uri> m79919b() {
            return this.imageUris;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getMessageId() {
            return this.messageId;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final C14567l getRetryAnalyticsData() {
            return this.retryAnalyticsData;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getUserQuestion() {
            return this.userQuestion;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof l)) {
                return false;
            }
            l lVar = (l) other;
            return AbstractC22676k.m65745e(this.userQuestion, lVar.userQuestion) && this.messageCount == lVar.messageCount && AbstractC22676k.m65745e(this.messageId, lVar.messageId) && AbstractC22676k.m65745e(this.imageUris, lVar.imageUris) && AbstractC22676k.m65745e(this.fileIds, lVar.fileIds) && this.isVoiceInput == lVar.isVoiceInput && AbstractC22676k.m65745e(this.retryAnalyticsData, lVar.retryAnalyticsData);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getIsVoiceInput() {
            return this.isVoiceInput;
        }

        public int hashCode() {
            int iM30448b = AbstractC11266d.m30448b(this.messageCount, this.userQuestion.hashCode() * 31, 31);
            String str = this.messageId;
            int iHashCode = (iM30448b + (str == null ? 0 : str.hashCode())) * 31;
            List<Uri> list = this.imageUris;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            List<String> list2 = this.fileIds;
            int iM8289b = AbstractC2875y.m8289b((iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.isVoiceInput);
            C14567l c14567l = this.retryAnalyticsData;
            return iM8289b + (c14567l != null ? c14567l.hashCode() : 0);
        }

        public String toString() {
            String str = this.userQuestion;
            int i13 = this.messageCount;
            String str2 = this.messageId;
            List<Uri> list = this.imageUris;
            List<String> list2 = this.fileIds;
            boolean z4 = this.isVoiceInput;
            C14567l c14567l = this.retryAnalyticsData;
            StringBuilder sbM30467u = AbstractC11266d.m30467u(i13, "SendQuestion(userQuestion=", str, ", messageCount=", ", messageId=");
            AbstractC36095b.m114694v(str2, ", imageUris=", ", fileIds=", sbM30467u, list);
            AbstractC26725a.m79512p(", isVoiceInput=", ", retryAnalyticsData=", sbM30467u, list2, z4);
            sbM30467u.append(c14567l);
            sbM30467u.append(")");
            return sbM30467u.toString();
        }

        public /* synthetic */ l(String str, int i13, String str2, List list, List list2, boolean z4, C14567l c14567l, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i14 & 2) != 0 ? 0 : i13, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : list, (i14 & 16) != 0 ? null : list2, (i14 & 32) != 0 ? false : z4, (i14 & 64) != 0 ? null : c14567l);
        }
    }
}
