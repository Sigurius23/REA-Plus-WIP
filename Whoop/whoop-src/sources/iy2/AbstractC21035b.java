package iy2;

import androidx.core.app.NotificationCompat;
import com.whoop.navigation.C9598e;
import com.whoop.whooplabs.data.remote.domain.dto.bff.ScreeningSubmissionResponse;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Set;
import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import vy2.C36605c;
import vy2.C36607e;

/* JADX INFO: renamed from: iy2.b */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, m65681d2 = {"Liy2/b;", "", "<init>", "()V", "d", "b", "f", "e", "a", "c", "i", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "g", "Liy2/b$a;", "Liy2/b$b;", "Liy2/b$c;", "Liy2/b$d;", "Liy2/b$e;", "Liy2/b$f;", "Liy2/b$g;", "Liy2/b$h;", "Liy2/b$i;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21035b {

    /* JADX INFO: renamed from: iy2.b$a */
    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Liy2/b$a;", "Liy2/b;", "Lvy2/e;", "question", "", "", "selectedKeys", "<init>", "(Lvy2/e;Ljava/util/Set;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lvy2/e;", "()Lvy2/e;", "b", "Ljava/util/Set;", "()Ljava/util/Set;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC21035b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C36607e question;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Set<String> selectedKeys;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C36607e question, Set<String> selectedKeys) {
            super(null);
            AbstractC22676k.m65750j(question, "question");
            AbstractC22676k.m65750j(selectedKeys, "selectedKeys");
            this.question = question;
            this.selectedKeys = selectedKeys;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C36607e getQuestion() {
            return this.question;
        }

        /* JADX INFO: renamed from: b */
        public final Set<String> m58721b() {
            return this.selectedKeys;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.question, aVar.question) && AbstractC22676k.m65745e(this.selectedKeys, aVar.selectedKeys);
        }

        public int hashCode() {
            return this.selectedKeys.hashCode() + (this.question.hashCode() * 31);
        }

        public String toString() {
            return "CheckQuestion(question=" + this.question + ", selectedKeys=" + this.selectedKeys + ")";
        }
    }

    /* JADX INFO: renamed from: iy2.b$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Liy2/b$b;", "Liy2/b;", "", "campaignId", "sessionId", "<init>", "(ILjava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC21035b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int campaignId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Integer sessionId;

        public b(int i13, Integer num) {
            super(null);
            this.campaignId = i13;
            this.sessionId = num;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getCampaignId() {
            return this.campaignId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Integer getSessionId() {
            return this.sessionId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return this.campaignId == bVar.campaignId && AbstractC22676k.m65745e(this.sessionId, bVar.sessionId);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.campaignId) * 31;
            Integer num = this.sessionId;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            return "ErrorLoadingCampaignScreening(campaignId=" + this.campaignId + ", sessionId=" + this.sessionId + ")";
        }
    }

    /* JADX INFO: renamed from: iy2.b$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Liy2/b$c;", "Liy2/b;", "Lvy2/c;", "screeningConfig", "<init>", "(Lvy2/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lvy2/c;", "()Lvy2/c;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC21035b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C36605c screeningConfig;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C36605c screeningConfig) {
            super(null);
            AbstractC22676k.m65750j(screeningConfig, "screeningConfig");
            this.screeningConfig = screeningConfig;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C36605c getScreeningConfig() {
            return this.screeningConfig;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && AbstractC22676k.m65745e(this.screeningConfig, ((c) other).screeningConfig);
        }

        public int hashCode() {
            return this.screeningConfig.hashCode();
        }

        public String toString() {
            return "ErrorSubmitting(screeningConfig=" + this.screeningConfig + ")";
        }
    }

    /* JADX INFO: renamed from: iy2.b$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Liy2/b$d;", "Liy2/b;", "<init>", "()V", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC21035b {

        /* JADX INFO: renamed from: a */
        public static final d f79674a = new d();

        private d() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: iy2.b$e */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\t¨\u0006\u0017"}, m65681d2 = {"Liy2/b$e;", "Liy2/b;", "Lvy2/e;", "question", "", "selectedKey", "<init>", "(Lvy2/e;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lvy2/e;", "()Lvy2/e;", "b", "Ljava/lang/String;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC21035b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C36607e question;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String selectedKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C36607e question, String str) {
            super(null);
            AbstractC22676k.m65750j(question, "question");
            this.question = question;
            this.selectedKey = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C36607e getQuestion() {
            return this.question;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSelectedKey() {
            return this.selectedKey;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.question, eVar.question) && AbstractC22676k.m65745e(this.selectedKey, eVar.selectedKey);
        }

        public int hashCode() {
            int iHashCode = this.question.hashCode() * 31;
            String str = this.selectedKey;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "RadioQuestion(question=" + this.question + ", selectedKey=" + this.selectedKey + ")";
        }
    }

    /* JADX INFO: renamed from: iy2.b$f */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Liy2/b$f;", "Liy2/b;", "", "campaignId", "sessionId", "<init>", "(ILjava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC21035b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int campaignId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Integer sessionId;

        public f(int i13, Integer num) {
            super(null);
            this.campaignId = i13;
            this.sessionId = num;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getCampaignId() {
            return this.campaignId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Integer getSessionId() {
            return this.sessionId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof f)) {
                return false;
            }
            f fVar = (f) other;
            return this.campaignId == fVar.campaignId && AbstractC22676k.m65745e(this.sessionId, fVar.sessionId);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.campaignId) * 31;
            Integer num = this.sessionId;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            return "SkipScreening(campaignId=" + this.campaignId + ", sessionId=" + this.sessionId + ")";
        }
    }

    /* JADX INFO: renamed from: iy2.b$g */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0010R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u001c\u0010\u0010R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b\u001f\u0010\u0010R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\u0018\u0010\u0010R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\"\u001a\u0004\b!\u0010#¨\u0006$"}, m65681d2 = {"Liy2/b$g;", "Liy2/b;", "", "campaignId", "sessionId", "", "icon", "iconColor", "content", "cta", "backgroundImage", "Lcom/whoop/navigation/e;", NotificationCompat.CATEGORY_NAVIGATION, "<init>", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "c", "Ljava/lang/String;", "e", "d", "f", "g", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g extends AbstractC21035b {

        /* JADX INFO: renamed from: i */
        public static final int f79679i = C9598e.f28134d;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int campaignId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int sessionId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String icon;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String iconColor;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String content;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String cta;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String backgroundImage;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final C9598e navigation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(int i13, int i14, String icon, String str, String content, String cta, String backgroundImage, C9598e c9598e) {
            super(null);
            AbstractC22676k.m65750j(icon, "icon");
            AbstractC22676k.m65750j(content, "content");
            AbstractC22676k.m65750j(cta, "cta");
            AbstractC22676k.m65750j(backgroundImage, "backgroundImage");
            this.campaignId = i13;
            this.sessionId = i14;
            this.icon = icon;
            this.iconColor = str;
            this.content = content;
            this.cta = cta;
            this.backgroundImage = backgroundImage;
            this.navigation = c9598e;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getBackgroundImage() {
            return this.backgroundImage;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getCampaignId() {
            return this.campaignId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getCta() {
            return this.cta;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof g)) {
                return false;
            }
            g gVar = (g) other;
            return this.campaignId == gVar.campaignId && this.sessionId == gVar.sessionId && AbstractC22676k.m65745e(this.icon, gVar.icon) && AbstractC22676k.m65745e(this.iconColor, gVar.iconColor) && AbstractC22676k.m65745e(this.content, gVar.content) && AbstractC22676k.m65745e(this.cta, gVar.cta) && AbstractC22676k.m65745e(this.backgroundImage, gVar.backgroundImage) && AbstractC22676k.m65745e(this.navigation, gVar.navigation);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getIconColor() {
            return this.iconColor;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final C9598e getNavigation() {
            return this.navigation;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final int getSessionId() {
            return this.sessionId;
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.sessionId, Integer.hashCode(this.campaignId) * 31, 31), 31, this.icon);
            String str = this.iconColor;
            int iM30450d2 = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.content), 31, this.cta), 31, this.backgroundImage);
            C9598e c9598e = this.navigation;
            return iM30450d2 + (c9598e != null ? c9598e.hashCode() : 0);
        }

        public String toString() {
            int i13 = this.campaignId;
            int i14 = this.sessionId;
            String str = this.icon;
            String str2 = this.iconColor;
            String str3 = this.content;
            String str4 = this.cta;
            String str5 = this.backgroundImage;
            C9598e c9598e = this.navigation;
            StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "Submitted(campaignId=", ", sessionId=", ", icon=");
            AbstractC11266d.m30444B(sbM30465s, str, ", iconColor=", str2, ", content=");
            AbstractC11266d.m30444B(sbM30465s, str3, ", cta=", str4, ", backgroundImage=");
            return AbstractC13673n.m38563j(sbM30465s, str5, ", navigation=", c9598e, ")");
        }
    }

    /* JADX INFO: renamed from: iy2.b$h */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Liy2/b$h;", "Liy2/b;", "Lvy2/c;", "screeningConfig", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningSubmissionResponse;", "screeningSubmissionResponse", "<init>", "(Lvy2/c;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningSubmissionResponse;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lvy2/c;", "()Lvy2/c;", "b", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningSubmissionResponse;", "()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningSubmissionResponse;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h extends AbstractC21035b {

        /* JADX INFO: renamed from: c */
        public static final int f79688c = C9598e.f28134d;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C36605c screeningConfig;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final ScreeningSubmissionResponse screeningSubmissionResponse;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(C36605c screeningConfig, ScreeningSubmissionResponse screeningSubmissionResponse) {
            super(null);
            AbstractC22676k.m65750j(screeningConfig, "screeningConfig");
            AbstractC22676k.m65750j(screeningSubmissionResponse, "screeningSubmissionResponse");
            this.screeningConfig = screeningConfig;
            this.screeningSubmissionResponse = screeningSubmissionResponse;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C36605c getScreeningConfig() {
            return this.screeningConfig;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ScreeningSubmissionResponse getScreeningSubmissionResponse() {
            return this.screeningSubmissionResponse;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof h)) {
                return false;
            }
            h hVar = (h) other;
            return AbstractC22676k.m65745e(this.screeningConfig, hVar.screeningConfig) && AbstractC22676k.m65745e(this.screeningSubmissionResponse, hVar.screeningSubmissionResponse);
        }

        public int hashCode() {
            return this.screeningSubmissionResponse.hashCode() + (this.screeningConfig.hashCode() * 31);
        }

        public String toString() {
            return "SubmittedSuccessfully(screeningConfig=" + this.screeningConfig + ", screeningSubmissionResponse=" + this.screeningSubmissionResponse + ")";
        }
    }

    /* JADX INFO: renamed from: iy2.b$i */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Liy2/b$i;", "Liy2/b;", "Lvy2/c;", "screeningConfig", "<init>", "(Lvy2/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lvy2/c;", "()Lvy2/c;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i extends AbstractC21035b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C36605c screeningConfig;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(C36605c screeningConfig) {
            super(null);
            AbstractC22676k.m65750j(screeningConfig, "screeningConfig");
            this.screeningConfig = screeningConfig;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C36605c getScreeningConfig() {
            return this.screeningConfig;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof i) && AbstractC22676k.m65745e(this.screeningConfig, ((i) other).screeningConfig);
        }

        public int hashCode() {
            return this.screeningConfig.hashCode();
        }

        public String toString() {
            return "Submitting(screeningConfig=" + this.screeningConfig + ")";
        }
    }

    public /* synthetic */ AbstractC21035b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC21035b() {
    }
}
