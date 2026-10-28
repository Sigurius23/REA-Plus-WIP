package tg0;

import android.net.Uri;
import c13.AbstractC3855a;
import c91.AbstractC4328b;
import com.whoop.p057ai.chat.models.TurnFeedback;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
import nh3.AbstractC26725a;
import nl0.EnumC26800b;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p319m4.AbstractC25012a;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: tg0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0015\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0015\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-¨\u0006."}, m65681d2 = {"Ltg0/a;", "", "<init>", "()V", "b", "n", "d", "f", "u", "t", "k", "j", "o", "p", "c", "a", "l", "e", "r", "s", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "g", "i", "m", "q", "Ltg0/a$a;", "Ltg0/a$b;", "Ltg0/a$c;", "Ltg0/a$d;", "Ltg0/a$e;", "Ltg0/a$f;", "Ltg0/a$g;", "Ltg0/a$h;", "Ltg0/a$i;", "Ltg0/a$j;", "Ltg0/a$k;", "Ltg0/a$l;", "Ltg0/a$m;", "Ltg0/a$n;", "Ltg0/a$o;", "Ltg0/a$p;", "Ltg0/a$q;", "Ltg0/a$r;", "Ltg0/a$s;", "Ltg0/a$t;", "Ltg0/a$u;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33776a {

    /* JADX INFO: renamed from: tg0.a$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0019\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u001a"}, m65681d2 = {"Ltg0/a$a;", "Ltg0/a;", "", "recommendationId", "", "committed", "replacementId", "activityTitle", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Z", "()Z", "d", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC33776a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String recommendationId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean committed;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String replacementId;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String activityTitle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String recommendationId, boolean z4, String str, String str2) {
            super(null);
            AbstractC22676k.m65750j(recommendationId, "recommendationId");
            this.recommendationId = recommendationId;
            this.committed = z4;
            this.replacementId = str;
            this.activityTitle = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getActivityTitle() {
            return this.activityTitle;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getCommitted() {
            return this.committed;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getRecommendationId() {
            return this.recommendationId;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
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
            return AbstractC22676k.m65745e(this.recommendationId, aVar.recommendationId) && this.committed == aVar.committed && AbstractC22676k.m65745e(this.replacementId, aVar.replacementId) && AbstractC22676k.m65745e(this.activityTitle, aVar.activityTitle);
        }

        public int hashCode() {
            int iM8289b = AbstractC2875y.m8289b(this.recommendationId.hashCode() * 31, 31, this.committed);
            String str = this.replacementId;
            int iHashCode = (iM8289b + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.activityTitle;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.recommendationId;
            boolean z4 = this.committed;
            return AbstractC11266d.m30464r(AbstractC25012a.m73379l("CommitRecommendation(recommendationId=", str, ", committed=", ", replacementId=", z4), this.replacementId, ", activityTitle=", this.activityTitle, ")");
        }
    }

    /* JADX INFO: renamed from: tg0.a$b */
    @Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0087\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b#\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b$\u0010\u0016R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010\u0016R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u001e\u0010)R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b&\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\"\u0010-\u001a\u0004\b%\u0010.R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b!\u0010\u0016R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b'\u0010,R\u0017\u0010\u0012\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b+\u0010*\u001a\u0004\b/\u0010,¨\u00060"}, m65681d2 = {"Ltg0/a$b;", "Ltg0/a;", "Ltg0/d;", "", "fingerprint", "source", "sourceId", "initialMessage", "presetQuestionKey", "", "Lkotlinx/serialization/json/JsonElement;", "args", "", "isWcePrefetch", "Ltg0/a$d;", "initialUserTurn", "entrypointExperience", "openedFromHistory", "isDay0", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLtg0/a$d;Ljava/lang/String;ZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "d", "e", "g", "f", "Ljava/util/Map;", "()Ljava/util/Map;", "Z", "k", "()Z", "Ltg0/a$d;", "()Ltg0/a$d;", "j", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC33776a implements InterfaceC33779d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String fingerprint;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String sourceId;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String initialMessage;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String presetQuestionKey;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final Map<String, JsonElement> args;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final boolean isWcePrefetch;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final d initialUserTurn;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final String entrypointExperience;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final boolean openedFromHistory;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final boolean isDay0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(String str, String source, String str2, String str3, String str4, Map<String, ? extends JsonElement> args, boolean z4, d dVar, String str5, boolean z13, boolean z14) {
            super(null);
            AbstractC22676k.m65750j(source, "source");
            AbstractC22676k.m65750j(args, "args");
            this.fingerprint = str;
            this.source = source;
            this.sourceId = str2;
            this.initialMessage = str3;
            this.presetQuestionKey = str4;
            this.args = args;
            this.isWcePrefetch = z4;
            this.initialUserTurn = dVar;
            this.entrypointExperience = str5;
            this.openedFromHistory = z13;
            this.isDay0 = z14;
        }

        /* JADX INFO: renamed from: a */
        public final Map<String, JsonElement> m106785a() {
            return this.args;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getEntrypointExperience() {
            return this.entrypointExperience;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getFingerprint() {
            return this.fingerprint;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getInitialMessage() {
            return this.initialMessage;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final d getInitialUserTurn() {
            return this.initialUserTurn;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.fingerprint, bVar.fingerprint) && AbstractC22676k.m65745e(this.source, bVar.source) && AbstractC22676k.m65745e(this.sourceId, bVar.sourceId) && AbstractC22676k.m65745e(this.initialMessage, bVar.initialMessage) && AbstractC22676k.m65745e(this.presetQuestionKey, bVar.presetQuestionKey) && AbstractC22676k.m65745e(this.args, bVar.args) && this.isWcePrefetch == bVar.isWcePrefetch && AbstractC22676k.m65745e(this.initialUserTurn, bVar.initialUserTurn) && AbstractC22676k.m65745e(this.entrypointExperience, bVar.entrypointExperience) && this.openedFromHistory == bVar.openedFromHistory && this.isDay0 == bVar.isDay0;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getOpenedFromHistory() {
            return this.openedFromHistory;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getPresetQuestionKey() {
            return this.presetQuestionKey;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public int hashCode() {
            String str = this.fingerprint;
            int iM30450d = AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.source);
            String str2 = this.sourceId;
            int iHashCode = (iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.initialMessage;
            int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.presetQuestionKey;
            int iM8289b = AbstractC2875y.m8289b(AbstractC3855a.m11821e(this.args, (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31), 31, this.isWcePrefetch);
            d dVar = this.initialUserTurn;
            int iHashCode3 = (iM8289b + (dVar == null ? 0 : dVar.hashCode())) * 31;
            String str5 = this.entrypointExperience;
            return Boolean.hashCode(this.isDay0) + AbstractC2875y.m8289b((iHashCode3 + (str5 != null ? str5.hashCode() : 0)) * 31, 31, this.openedFromHistory);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getSourceId() {
            return this.sourceId;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final boolean getIsDay0() {
            return this.isDay0;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final boolean getIsWcePrefetch() {
            return this.isWcePrefetch;
        }

        public String toString() {
            String str = this.fingerprint;
            String str2 = this.source;
            String str3 = this.sourceId;
            String str4 = this.initialMessage;
            String str5 = this.presetQuestionKey;
            Map<String, JsonElement> map = this.args;
            boolean z4 = this.isWcePrefetch;
            d dVar = this.initialUserTurn;
            String str6 = this.entrypointExperience;
            boolean z13 = this.openedFromHistory;
            boolean z14 = this.isDay0;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("CreateConversation(fingerprint=", str, ", source=", str2, ", sourceId=");
            AbstractC11266d.m30444B(sbM32001t, str3, ", initialMessage=", str4, ", presetQuestionKey=");
            AbstractC36095b.m114695w(sbM32001t, str5, ", args=", map, ", isWcePrefetch=");
            sbM32001t.append(z4);
            sbM32001t.append(", initialUserTurn=");
            sbM32001t.append(dVar);
            sbM32001t.append(", entrypointExperience=");
            AbstractC38963t7.m124390t(sbM32001t, str6, ", openedFromHistory=", z13, ", isDay0=");
            return AbstractC18489d0.m53372m(sbM32001t, z14, ")");
        }
    }

    /* JADX INFO: renamed from: tg0.a$c */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, m65681d2 = {"Ltg0/a$c;", "Ltg0/a;", "", "turnId", "actionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC33776a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String turnId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String actionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String turnId, String actionId) {
            super(null);
            AbstractC22676k.m65750j(turnId, "turnId");
            AbstractC22676k.m65750j(actionId, "actionId");
            this.turnId = turnId;
            this.actionId = actionId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getActionId() {
            return this.actionId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTurnId() {
            return this.turnId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.turnId, cVar.turnId) && AbstractC22676k.m65745e(this.actionId, cVar.actionId);
        }

        public int hashCode() {
            return this.actionId.hashCode() + (this.turnId.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("CreateMxmSupportTicket(turnId=", this.turnId, ", actionId=", this.actionId, ")");
        }
    }

    /* JADX INFO: renamed from: tg0.a$e */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Ltg0/a$e;", "Ltg0/a;", "Ltg0/d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC33776a implements InterfaceC33779d {

        /* JADX INFO: renamed from: a */
        public static final e f141392a = new e();

        private e() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof e);
        }

        public int hashCode() {
            return 661494679;
        }

        public String toString() {
            return "DrawerClosed";
        }
    }

    /* JADX INFO: renamed from: tg0.a$f */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Ltg0/a$f;", "Ltg0/a;", "", "turnId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC33776a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String turnId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String turnId) {
            super(null);
            AbstractC22676k.m65750j(turnId, "turnId");
            this.turnId = turnId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getTurnId() {
            return this.turnId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof f) && AbstractC22676k.m65745e(this.turnId, ((f) other).turnId);
        }

        public int hashCode() {
            return this.turnId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("GetConversationTurn(turnId=", this.turnId, ")");
        }
    }

    /* JADX INFO: renamed from: tg0.a$g */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Ltg0/a$g;", "Ltg0/a;", "", "fingerprint", "turnId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g extends AbstractC33776a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String fingerprint;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String turnId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String fingerprint, String turnId) {
            super(null);
            AbstractC22676k.m65750j(fingerprint, "fingerprint");
            AbstractC22676k.m65750j(turnId, "turnId");
            this.fingerprint = fingerprint;
            this.turnId = turnId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFingerprint() {
            return this.fingerprint;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTurnId() {
            return this.turnId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof g)) {
                return false;
            }
            g gVar = (g) other;
            return AbstractC22676k.m65745e(this.fingerprint, gVar.fingerprint) && AbstractC22676k.m65745e(this.turnId, gVar.turnId);
        }

        public int hashCode() {
            return this.turnId.hashCode() + (this.fingerprint.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("LastViewedTurn(fingerprint=", this.fingerprint, ", turnId=", this.turnId, ")");
        }
    }

    /* JADX INFO: renamed from: tg0.a$h */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Ltg0/a$h;", "Ltg0/a;", "", "isVisible", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h extends AbstractC33776a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isVisible;

        public h(boolean z4) {
            super(null);
            this.isVisible = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getIsVisible() {
            return this.isVisible;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof h) && this.isVisible == ((h) other).isVisible;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isVisible);
        }

        public String toString() {
            return AbstractC3855a.m11827k("ReadingVisibilityChanged(isVisible=", ")", this.isVisible);
        }
    }

    /* JADX INFO: renamed from: tg0.a$i */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Ltg0/a$i;", "Ltg0/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i extends AbstractC33776a {

        /* JADX INFO: renamed from: a */
        public static final i f141397a = new i();

        private i() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof i);
        }

        public int hashCode() {
            return 451450675;
        }

        public String toString() {
            return "RefreshConversationMetadata";
        }
    }

    /* JADX INFO: renamed from: tg0.a$j */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Ltg0/a$j;", "Ltg0/a;", "", "fileId", "Landroid/net/Uri;", "fileUri", "<init>", "(Ljava/lang/String;Landroid/net/Uri;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Landroid/net/Uri;", "()Landroid/net/Uri;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class j extends AbstractC33776a {

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
            return "RemoveFile(fileId=" + this.fileId + ", fileUri=" + this.fileUri + ")";
        }
    }

    /* JADX INFO: renamed from: tg0.a$k */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Ltg0/a$k;", "Ltg0/a;", "", "fileId", "Landroid/net/Uri;", "uri", "<init>", "(Ljava/lang/String;Landroid/net/Uri;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Landroid/net/Uri;", "()Landroid/net/Uri;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class k extends AbstractC33776a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String fileId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Uri uri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, Uri uri) {
            super(null);
            AbstractC22676k.m65750j(uri, "uri");
            this.fileId = str;
            this.uri = uri;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFileId() {
            return this.fileId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Uri getUri() {
            return this.uri;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof k)) {
                return false;
            }
            k kVar = (k) other;
            return AbstractC22676k.m65745e(this.fileId, kVar.fileId) && AbstractC22676k.m65745e(this.uri, kVar.uri);
        }

        public int hashCode() {
            String str = this.fileId;
            return this.uri.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public String toString() {
            return "RemoveImage(fileId=" + this.fileId + ", uri=" + this.uri + ")";
        }
    }

    /* JADX INFO: renamed from: tg0.a$l */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Ltg0/a$l;", "Ltg0/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class l extends AbstractC33776a {

        /* JADX INFO: renamed from: a */
        public static final l f141402a = new l();

        private l() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof l);
        }

        public int hashCode() {
            return -1671391730;
        }

        public String toString() {
            return "Retry";
        }
    }

    /* JADX INFO: renamed from: tg0.a$m */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Ltg0/a$m;", "Ltg0/a;", "Lc91/b;", "error", "<init>", "(Lc91/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lc91/b;", "()Lc91/b;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class m extends AbstractC33776a {

        /* JADX INFO: renamed from: b */
        public static final int f141403b = AbstractC4328b.f17583a;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AbstractC4328b error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(AbstractC4328b error) {
            super(null);
            AbstractC22676k.m65750j(error, "error");
            this.error = error;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AbstractC4328b getError() {
            return this.error;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof m) && AbstractC22676k.m65745e(this.error, ((m) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "ShowSubmitError(error=" + this.error + ")";
        }
    }

    /* JADX INFO: renamed from: tg0.a$n */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Ltg0/a$n;", "Ltg0/a;", "Ltg0/d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class n extends AbstractC33776a implements InterfaceC33779d {

        /* JADX INFO: renamed from: a */
        public static final n f141405a = new n();

        private n() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof n);
        }

        public int hashCode() {
            return 1840734555;
        }

        public String toString() {
            return "StartNewConversation";
        }
    }

    /* JADX INFO: renamed from: tg0.a$o */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Ltg0/a$o;", "Ltg0/a;", "Ltg0/d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class o extends AbstractC33776a implements InterfaceC33779d {

        /* JADX INFO: renamed from: a */
        public static final o f141406a = new o();

        private o() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof o);
        }

        public int hashCode() {
            return 1149318777;
        }

        public String toString() {
            return "StopTurn";
        }
    }

    /* JADX INFO: renamed from: tg0.a$p */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Ltg0/a$p;", "Ltg0/a;", "Lcom/whoop/ai/chat/models/TurnFeedback;", "turnFeedback", "", "showToast", "<init>", "(Lcom/whoop/ai/chat/models/TurnFeedback;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/ai/chat/models/TurnFeedback;", "b", "()Lcom/whoop/ai/chat/models/TurnFeedback;", "Z", "()Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class p extends AbstractC33776a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TurnFeedback turnFeedback;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean showToast;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(TurnFeedback turnFeedback, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(turnFeedback, "turnFeedback");
            this.turnFeedback = turnFeedback;
            this.showToast = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getShowToast() {
            return this.showToast;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TurnFeedback getTurnFeedback() {
            return this.turnFeedback;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof p)) {
                return false;
            }
            p pVar = (p) other;
            return AbstractC22676k.m65745e(this.turnFeedback, pVar.turnFeedback) && this.showToast == pVar.showToast;
        }

        public int hashCode() {
            return Boolean.hashCode(this.showToast) + (this.turnFeedback.hashCode() * 31);
        }

        public String toString() {
            return "SubmitTurnFeedback(turnFeedback=" + this.turnFeedback + ", showToast=" + this.showToast + ")";
        }
    }

    /* JADX INFO: renamed from: tg0.a$q */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0015\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Ltg0/a$q;", "Ltg0/a;", "", "fingerprint", "turnId", "", "suggestions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Ljava/util/List;", "()Ljava/util/List;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class q extends AbstractC33776a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String fingerprint;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String turnId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final List<String> suggestions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(String fingerprint, String turnId, List<String> suggestions) {
            super(null);
            AbstractC22676k.m65750j(fingerprint, "fingerprint");
            AbstractC22676k.m65750j(turnId, "turnId");
            AbstractC22676k.m65750j(suggestions, "suggestions");
            this.fingerprint = fingerprint;
            this.turnId = turnId;
            this.suggestions = suggestions;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFingerprint() {
            return this.fingerprint;
        }

        /* JADX INFO: renamed from: b */
        public final List<String> m106814b() {
            return this.suggestions;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getTurnId() {
            return this.turnId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof q)) {
                return false;
            }
            q qVar = (q) other;
            return AbstractC22676k.m65745e(this.fingerprint, qVar.fingerprint) && AbstractC22676k.m65745e(this.turnId, qVar.turnId) && AbstractC22676k.m65745e(this.suggestions, qVar.suggestions);
        }

        public int hashCode() {
            return this.suggestions.hashCode() + AbstractC11266d.m30450d(this.fingerprint.hashCode() * 31, 31, this.turnId);
        }

        public String toString() {
            String str = this.fingerprint;
            String str2 = this.turnId;
            return AbstractC3855a.m11829m(AbstractC11895b.m32001t("SuggestionsLoaded(fingerprint=", str, ", turnId=", str2, ", suggestions="), this.suggestions, ")");
        }
    }

    /* JADX INFO: renamed from: tg0.a$r */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Ltg0/a$r;", "Ltg0/a;", "", "turnId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class r extends AbstractC33776a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String turnId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(String turnId) {
            super(null);
            AbstractC22676k.m65750j(turnId, "turnId");
            this.turnId = turnId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getTurnId() {
            return this.turnId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof r) && AbstractC22676k.m65745e(this.turnId, ((r) other).turnId);
        }

        public int hashCode() {
            return this.turnId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("TurnEndViewed(turnId=", this.turnId, ")");
        }
    }

    /* JADX INFO: renamed from: tg0.a$s */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Ltg0/a$s;", "Ltg0/a;", "", "turnId", "", "isVisible", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class s extends AbstractC33776a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String turnId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean isVisible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(String turnId, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(turnId, "turnId");
            this.turnId = turnId;
            this.isVisible = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getTurnId() {
            return this.turnId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsVisible() {
            return this.isVisible;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof s)) {
                return false;
            }
            s sVar = (s) other;
            return AbstractC22676k.m65745e(this.turnId, sVar.turnId) && this.isVisible == sVar.isVisible;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isVisible) + (this.turnId.hashCode() * 31);
        }

        public String toString() {
            return AbstractC26725a.m79503g("TurnEndVisibilityChanged(turnId=", this.turnId, ", isVisible=", ")", this.isVisible);
        }
    }

    /* JADX INFO: renamed from: tg0.a$t */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Ltg0/a$t;", "Ltg0/a;", "", "Landroid/net/Uri;", "fileUris", "", "displayNames", "", "fileSizesBytes", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class t extends AbstractC33776a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<Uri> fileUris;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<String> displayNames;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final List<Long> fileSizesBytes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public t(List<? extends Uri> fileUris, List<String> displayNames, List<Long> fileSizesBytes) {
            super(null);
            AbstractC22676k.m65750j(fileUris, "fileUris");
            AbstractC22676k.m65750j(displayNames, "displayNames");
            AbstractC22676k.m65750j(fileSizesBytes, "fileSizesBytes");
            this.fileUris = fileUris;
            this.displayNames = displayNames;
            this.fileSizesBytes = fileSizesBytes;
        }

        /* JADX INFO: renamed from: a */
        public final List<String> m106819a() {
            return this.displayNames;
        }

        /* JADX INFO: renamed from: b */
        public final List<Long> m106820b() {
            return this.fileSizesBytes;
        }

        /* JADX INFO: renamed from: c */
        public final List<Uri> m106821c() {
            return this.fileUris;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof t)) {
                return false;
            }
            t tVar = (t) other;
            return AbstractC22676k.m65745e(this.fileUris, tVar.fileUris) && AbstractC22676k.m65745e(this.displayNames, tVar.displayNames) && AbstractC22676k.m65745e(this.fileSizesBytes, tVar.fileSizesBytes);
        }

        public int hashCode() {
            return this.fileSizesBytes.hashCode() + AbstractC11895b.m31983b(this.fileUris.hashCode() * 31, 31, this.displayNames);
        }

        public String toString() {
            List<Uri> list = this.fileUris;
            List<String> list2 = this.displayNames;
            return AbstractC3855a.m11829m(AbstractC38963t7.m124380j("UploadFiles(fileUris=", ", displayNames=", list, ", fileSizesBytes=", list2), this.fileSizesBytes, ")");
        }
    }

    /* JADX INFO: renamed from: tg0.a$u */
    @Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Ltg0/a$u;", "Ltg0/a;", "", "Landroid/net/Uri;", "imageUris", "", "fileSizesBytes", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class u extends AbstractC33776a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<Uri> imageUris;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<Long> fileSizesBytes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public u(List<? extends Uri> imageUris, List<Long> fileSizesBytes) {
            super(null);
            AbstractC22676k.m65750j(imageUris, "imageUris");
            AbstractC22676k.m65750j(fileSizesBytes, "fileSizesBytes");
            this.imageUris = imageUris;
            this.fileSizesBytes = fileSizesBytes;
        }

        /* JADX INFO: renamed from: a */
        public final List<Long> m106822a() {
            return this.fileSizesBytes;
        }

        /* JADX INFO: renamed from: b */
        public final List<Uri> m106823b() {
            return this.imageUris;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof u)) {
                return false;
            }
            u uVar = (u) other;
            return AbstractC22676k.m65745e(this.imageUris, uVar.imageUris) && AbstractC22676k.m65745e(this.fileSizesBytes, uVar.fileSizesBytes);
        }

        public int hashCode() {
            return this.fileSizesBytes.hashCode() + (this.imageUris.hashCode() * 31);
        }

        public String toString() {
            return AbstractC13673n.m38562i("UploadImages(imageUris=", ", fileSizesBytes=", this.imageUris, ")", this.fileSizesBytes);
        }
    }

    public /* synthetic */ AbstractC33776a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC33776a() {
    }

    /* JADX INFO: renamed from: tg0.a$d */
    @Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001d\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b \u0010%¨\u0006&"}, m65681d2 = {"Ltg0/a$d;", "Ltg0/a;", "", "content", "Lnl0/b;", "role", "", "fileIds", "", "userTimestamp", "", "isSuggestion", "<init>", "(Ljava/lang/String;Lnl0/b;Ljava/util/List;JZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lnl0/b;", "getRole", "()Lnl0/b;", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "J", "()J", "e", "Z", "()Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC33776a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String content;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC26800b role;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final List<String> fileIds;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final long userTimestamp;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final boolean isSuggestion;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, EnumC26800b role, List<String> list, long j7, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(role, "role");
            this.content = str;
            this.role = role;
            this.fileIds = list;
            this.userTimestamp = j7;
            this.isSuggestion = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        /* JADX INFO: renamed from: b */
        public final List<String> m106799b() {
            return this.fileIds;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getUserTimestamp() {
            return this.userTimestamp;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getIsSuggestion() {
            return this.isSuggestion;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.content, dVar.content) && this.role == dVar.role && AbstractC22676k.m65745e(this.fileIds, dVar.fileIds) && this.userTimestamp == dVar.userTimestamp && this.isSuggestion == dVar.isSuggestion;
        }

        public int hashCode() {
            String str = this.content;
            int iHashCode = (this.role.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
            List<String> list = this.fileIds;
            return Boolean.hashCode(this.isSuggestion) + AbstractC11266d.m30451e((iHashCode + (list != null ? list.hashCode() : 0)) * 31, this.userTimestamp, 31);
        }

        public String toString() {
            return "CreateTurn(content=" + this.content + ", role=" + this.role + ", fileIds=" + this.fileIds + ", userTimestamp=" + this.userTimestamp + ", isSuggestion=" + this.isSuggestion + ")";
        }

        public /* synthetic */ d(String str, EnumC26800b enumC26800b, List list, long j7, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : str, enumC26800b, (i13 & 4) != 0 ? null : list, j7, (i13 & 16) != 0 ? false : z4);
        }
    }
}
