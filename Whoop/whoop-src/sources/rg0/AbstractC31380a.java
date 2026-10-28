package rg0;

import ah0.EnumC0884e;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.models.MessageType;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import xk0.AbstractC38426d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: rg0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:#\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001#'()*+,-./0123456789:;<=>?@ABCDEFGHI¨\u0006J"}, m65681d2 = {"Lrg0/a;", "", "<init>", "()V", "b", "i", "j", "k", "v", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "z", "a0", "c0", "e0", "g0", "h0", "c", "i0", "d", "u", "a", "t", "m", "l", "b0", "f0", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "f", "s", "y", "x", "d0", "e", "g", "p", "n", "q", "r", "o", "Lrg0/a$a;", "Lrg0/a$b;", "Lrg0/a$c;", "Lrg0/a$d;", "Lrg0/a$e;", "Lrg0/a$f;", "Lrg0/a$g;", "Lrg0/a$h;", "Lrg0/a$i;", "Lrg0/a$j;", "Lrg0/a$k;", "Lrg0/a$l;", "Lrg0/a$m;", "Lrg0/a$n;", "Lrg0/a$o;", "Lrg0/a$p;", "Lrg0/a$q;", "Lrg0/a$r;", "Lrg0/a$s;", "Lrg0/a$t;", "Lrg0/a$u;", "Lrg0/a$v;", "Lrg0/a$w;", "Lrg0/a$x;", "Lrg0/a$y;", "Lrg0/a$z;", "Lrg0/a$a0;", "Lrg0/a$b0;", "Lrg0/a$c0;", "Lrg0/a$d0;", "Lrg0/a$e0;", "Lrg0/a$f0;", "Lrg0/a$g0;", "Lrg0/a$h0;", "Lrg0/a$i0;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31380a {

    /* JADX INFO: renamed from: rg0.a$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lrg0/a$a;", "Lrg0/a;", "", "fingerprint", "fileType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC31380a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String fingerprint;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String fileType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String fingerprint, String fileType) {
            super(null);
            AbstractC22676k.m65750j(fingerprint, "fingerprint");
            AbstractC22676k.m65750j(fileType, "fileType");
            this.fingerprint = fingerprint;
            this.fileType = fileType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFileType() {
            return this.fileType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getFingerprint() {
            return this.fingerprint;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.fingerprint, aVar.fingerprint) && AbstractC22676k.m65745e(this.fileType, aVar.fileType);
        }

        public int hashCode() {
            return this.fileType.hashCode() + (this.fingerprint.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("AttachmentRetry(fingerprint=", this.fingerprint, ", fileType=", this.fileType, ")");
        }
    }

    /* JADX INFO: renamed from: rg0.a$a0 */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lrg0/a$a0;", "Lrg0/a;", "<init>", "()V", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a0 extends AbstractC31380a {

        /* JADX INFO: renamed from: a */
        public static final a0 f129043a = new a0();

        private a0() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: rg0.a$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lrg0/a$b;", "Lrg0/a;", "", "fingerprint", "messageId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC31380a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String fingerprint;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String messageId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String fingerprint, String messageId) {
            super(null);
            AbstractC22676k.m65750j(fingerprint, "fingerprint");
            AbstractC22676k.m65750j(messageId, "messageId");
            this.fingerprint = fingerprint;
            this.messageId = messageId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFingerprint() {
            return this.fingerprint;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getMessageId() {
            return this.messageId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.fingerprint, bVar.fingerprint) && AbstractC22676k.m65745e(this.messageId, bVar.messageId);
        }

        public int hashCode() {
            return this.messageId.hashCode() + (this.fingerprint.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("BotResponse(fingerprint=", this.fingerprint, ", messageId=", this.messageId, ")");
        }
    }

    /* JADX INFO: renamed from: rg0.a$b0 */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lrg0/a$b0;", "Lrg0/a;", "", "fingerprint", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b0 extends AbstractC31380a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String fingerprint;

        public b0(String str) {
            super(null);
            this.fingerprint = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFingerprint() {
            return this.fingerprint;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b0) && AbstractC22676k.m65745e(this.fingerprint, ((b0) other).fingerprint);
        }

        public int hashCode() {
            String str = this.fingerprint;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("OpenPastConversation(fingerprint=", this.fingerprint, ")");
        }
    }

    /* JADX INFO: renamed from: rg0.a$c */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0014\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lrg0/a$c;", "Lrg0/a;", "", "fingerprint", "title", "", "fromGhostTile", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Z", "()Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC31380a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String fingerprint;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String title;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean fromGhostTile;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String fingerprint, String str, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(fingerprint, "fingerprint");
            this.fingerprint = fingerprint;
            this.title = str;
            this.fromGhostTile = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFingerprint() {
            return this.fingerprint;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getFromGhostTile() {
            return this.fromGhostTile;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.fingerprint, cVar.fingerprint) && AbstractC22676k.m65745e(this.title, cVar.title) && this.fromGhostTile == cVar.fromGhostTile;
        }

        public int hashCode() {
            int iHashCode = this.fingerprint.hashCode() * 31;
            String str = this.title;
            return Boolean.hashCode(this.fromGhostTile) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public String toString() {
            String str = this.fingerprint;
            String str2 = this.title;
            return AbstractC18489d0.m53372m(AbstractC11895b.m32001t("CommitActivity(fingerprint=", str, ", title=", str2, ", fromGhostTile="), this.fromGhostTile, ")");
        }
    }

    /* JADX INFO: renamed from: rg0.a$c0 */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\t¨\u0006\u0016"}, m65681d2 = {"Lrg0/a$c0;", "Lrg0/a;", "", "role", "messageType", "failureReason", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c0 extends AbstractC31380a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String role;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String messageType;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String failureReason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(String role, String messageType, String failureReason) {
            super(null);
            AbstractC22676k.m65750j(role, "role");
            AbstractC22676k.m65750j(messageType, "messageType");
            AbstractC22676k.m65750j(failureReason, "failureReason");
            this.role = role;
            this.messageType = messageType;
            this.failureReason = failureReason;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFailureReason() {
            return this.failureReason;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getMessageType() {
            return this.messageType;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getRole() {
            return this.role;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c0)) {
                return false;
            }
            c0 c0Var = (c0) other;
            return AbstractC22676k.m65745e(this.role, c0Var.role) && AbstractC22676k.m65745e(this.messageType, c0Var.messageType) && AbstractC22676k.m65745e(this.failureReason, c0Var.failureReason);
        }

        public int hashCode() {
            return this.failureReason.hashCode() + AbstractC11266d.m30450d(this.role.hashCode() * 31, 31, this.messageType);
        }

        public String toString() {
            return AbstractC25012a.m73376i(this.failureReason, ")", AbstractC11895b.m32001t("Retry(role=", this.role, ", messageType=", this.messageType, ", failureReason="));
        }
    }

    /* JADX INFO: renamed from: rg0.a$d */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lrg0/a$d;", "Lrg0/a;", "", "fingerprint", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC31380a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String fingerprint;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String fingerprint) {
            super(null);
            AbstractC22676k.m65750j(fingerprint, "fingerprint");
            this.fingerprint = fingerprint;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFingerprint() {
            return this.fingerprint;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && AbstractC22676k.m65745e(this.fingerprint, ((d) other).fingerprint);
        }

        public int hashCode() {
            return this.fingerprint.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("ConversationHistoryOpen(fingerprint=", this.fingerprint, ")");
        }
    }

    /* JADX INFO: renamed from: rg0.a$d0 */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lrg0/a$d0;", "Lrg0/a;", "", "fingerprint", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d0 extends AbstractC31380a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String fingerprint;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(String fingerprint) {
            super(null);
            AbstractC22676k.m65750j(fingerprint, "fingerprint");
            this.fingerprint = fingerprint;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFingerprint() {
            return this.fingerprint;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d0) && AbstractC22676k.m65745e(this.fingerprint, ((d0) other).fingerprint);
        }

        public int hashCode() {
            return this.fingerprint.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("RetryViewShown(fingerprint=", this.fingerprint, ")");
        }
    }

    /* JADX INFO: renamed from: rg0.a$e */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lrg0/a$e;", "Lrg0/a;", "", "fingerprint", "", "durationMs", "<init>", "(Ljava/lang/String;J)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "J", "()J", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC31380a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String fingerprint;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final long durationMs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String fingerprint, long j7) {
            super(null);
            AbstractC22676k.m65750j(fingerprint, "fingerprint");
            this.fingerprint = fingerprint;
            this.durationMs = j7;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getDurationMs() {
            return this.durationMs;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getFingerprint() {
            return this.fingerprint;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.fingerprint, eVar.fingerprint) && this.durationMs == eVar.durationMs;
        }

        public int hashCode() {
            return Long.hashCode(this.durationMs) + (this.fingerprint.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sbM32000s = AbstractC11895b.m32000s("ConversationTime(fingerprint=", this.fingerprint, this.durationMs, ", durationMs=");
            sbM32000s.append(")");
            return sbM32000s.toString();
        }
    }

    /* JADX INFO: renamed from: rg0.a$e0 */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lrg0/a$e0;", "Lrg0/a;", "<init>", "()V", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e0 extends AbstractC31380a {

        /* JADX INFO: renamed from: a */
        public static final e0 f129057a = new e0();

        private e0() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: rg0.a$f */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lrg0/a$f;", "Lrg0/a;", "", "fingerprint", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC31380a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String fingerprint;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String fingerprint) {
            super(null);
            AbstractC22676k.m65750j(fingerprint, "fingerprint");
            this.fingerprint = fingerprint;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFingerprint() {
            return this.fingerprint;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof f) && AbstractC22676k.m65745e(this.fingerprint, ((f) other).fingerprint);
        }

        public int hashCode() {
            return this.fingerprint.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("DeletedConversation(fingerprint=", this.fingerprint, ")");
        }
    }

    /* JADX INFO: renamed from: rg0.a$f0 */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lrg0/a$f0;", "Lrg0/a;", "", "fingerprint", "messageId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f0 extends AbstractC31380a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String fingerprint;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String messageId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(String fingerprint, String str) {
            super(null);
            AbstractC22676k.m65750j(fingerprint, "fingerprint");
            this.fingerprint = fingerprint;
            this.messageId = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFingerprint() {
            return this.fingerprint;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getMessageId() {
            return this.messageId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof f0)) {
                return false;
            }
            f0 f0Var = (f0) other;
            return AbstractC22676k.m65745e(this.fingerprint, f0Var.fingerprint) && AbstractC22676k.m65745e(this.messageId, f0Var.messageId);
        }

        public int hashCode() {
            int iHashCode = this.fingerprint.hashCode() * 31;
            String str = this.messageId;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return AbstractC2875y.m8300m("StopGenerating(fingerprint=", this.fingerprint, ", messageId=", this.messageId, ")");
        }
    }

    /* JADX INFO: renamed from: rg0.a$g */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lrg0/a$g;", "Lrg0/a;", "", "fingerprint", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g extends AbstractC31380a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String fingerprint;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String fingerprint) {
            super(null);
            AbstractC22676k.m65750j(fingerprint, "fingerprint");
            this.fingerprint = fingerprint;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFingerprint() {
            return this.fingerprint;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof g) && AbstractC22676k.m65745e(this.fingerprint, ((g) other).fingerprint);
        }

        public int hashCode() {
            return this.fingerprint.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("DisabledInputTapped(fingerprint=", this.fingerprint, ")");
        }
    }

    /* JADX INFO: renamed from: rg0.a$g0 */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0016\u0010\f¨\u0006\u0017"}, m65681d2 = {"Lrg0/a$g0;", "Lrg0/a;", "", "fingerprint", "", "index", "messageCount", "<init>", "(Ljava/lang/String;II)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "c", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g0 extends AbstractC31380a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String fingerprint;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int index;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final int messageCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0(String fingerprint, int i13, int i14) {
            super(null);
            AbstractC22676k.m65750j(fingerprint, "fingerprint");
            this.fingerprint = fingerprint;
            this.index = i13;
            this.messageCount = i14;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFingerprint() {
            return this.fingerprint;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getMessageCount() {
            return this.messageCount;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof g0)) {
                return false;
            }
            g0 g0Var = (g0) other;
            return AbstractC22676k.m65745e(this.fingerprint, g0Var.fingerprint) && this.index == g0Var.index && this.messageCount == g0Var.messageCount;
        }

        public int hashCode() {
            return Integer.hashCode(this.messageCount) + AbstractC11266d.m30448b(this.index, this.fingerprint.hashCode() * 31, 31);
        }

        public String toString() {
            String str = this.fingerprint;
            int i13 = this.index;
            return AbstractC18489d0.m53371l(AbstractC11266d.m30467u(i13, "SuggestionSelected(fingerprint=", str, ", index=", ", messageCount="), this.messageCount, ")");
        }
    }

    /* JADX INFO: renamed from: rg0.a$h */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u000b¨\u0006\u0019"}, m65681d2 = {"Lrg0/a$h;", "Lrg0/a;", "", "rawCharacterCount", "", "isWhitespaceOnly", "", "sendSource", "<init>", "(IZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Z", "c", "()Z", "Ljava/lang/String;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h extends AbstractC31380a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int rawCharacterCount;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean isWhitespaceOnly;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String sendSource;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(int i13, boolean z4, String sendSource) {
            super(null);
            AbstractC22676k.m65750j(sendSource, "sendSource");
            this.rawCharacterCount = i13;
            this.isWhitespaceOnly = z4;
            this.sendSource = sendSource;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getRawCharacterCount() {
            return this.rawCharacterCount;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSendSource() {
            return this.sendSource;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsWhitespaceOnly() {
            return this.isWhitespaceOnly;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof h)) {
                return false;
            }
            h hVar = (h) other;
            return this.rawCharacterCount == hVar.rawCharacterCount && this.isWhitespaceOnly == hVar.isWhitespaceOnly && AbstractC22676k.m65745e(this.sendSource, hVar.sendSource);
        }

        public int hashCode() {
            return this.sendSource.hashCode() + AbstractC2875y.m8289b(Integer.hashCode(this.rawCharacterCount) * 31, 31, this.isWhitespaceOnly);
        }

        public String toString() {
            int i13 = this.rawCharacterCount;
            boolean z4 = this.isWhitespaceOnly;
            String str = this.sendSource;
            StringBuilder sb4 = new StringBuilder("EmptyMessageSent(rawCharacterCount=");
            sb4.append(i13);
            sb4.append(", isWhitespaceOnly=");
            sb4.append(z4);
            sb4.append(", sendSource=");
            return AbstractC25012a.m73376i(str, ")", sb4);
        }
    }

    /* JADX INFO: renamed from: rg0.a$h0 */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0015"}, m65681d2 = {"Lrg0/a$h0;", "Lrg0/a;", "", "fingerprint", "", "suggestionCount", "<init>", "(Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h0 extends AbstractC31380a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String fingerprint;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int suggestionCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(String fingerprint, int i13) {
            super(null);
            AbstractC22676k.m65750j(fingerprint, "fingerprint");
            this.fingerprint = fingerprint;
            this.suggestionCount = i13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFingerprint() {
            return this.fingerprint;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getSuggestionCount() {
            return this.suggestionCount;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof h0)) {
                return false;
            }
            h0 h0Var = (h0) other;
            return AbstractC22676k.m65745e(this.fingerprint, h0Var.fingerprint) && this.suggestionCount == h0Var.suggestionCount;
        }

        public int hashCode() {
            return Integer.hashCode(this.suggestionCount) + (this.fingerprint.hashCode() * 31);
        }

        public String toString() {
            return AbstractC11895b.m31993l(this.suggestionCount, "SuggestionsShown(fingerprint=", this.fingerprint, ", suggestionCount=", ")");
        }
    }

    /* JADX INFO: renamed from: rg0.a$i */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lrg0/a$i;", "Lrg0/a;", "", "fingerprint", "", MessageType.FAILED, "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i extends AbstractC31380a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String fingerprint;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean failed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String fingerprint, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(fingerprint, "fingerprint");
            this.fingerprint = fingerprint;
            this.failed = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getFailed() {
            return this.failed;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getFingerprint() {
            return this.fingerprint;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof i)) {
                return false;
            }
            i iVar = (i) other;
            return AbstractC22676k.m65745e(this.fingerprint, iVar.fingerprint) && this.failed == iVar.failed;
        }

        public int hashCode() {
            return Boolean.hashCode(this.failed) + (this.fingerprint.hashCode() * 31);
        }

        public String toString() {
            return AbstractC26725a.m79503g("ErrorMessageDisplayed(fingerprint=", this.fingerprint, ", failed=", ")", this.failed);
        }
    }

    /* JADX INFO: renamed from: rg0.a$i0 */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0014\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lrg0/a$i0;", "Lrg0/a;", "", "fingerprint", "title", "", "fromGhostTile", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Z", "()Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i0 extends AbstractC31380a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String fingerprint;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String title;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean fromGhostTile;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i0(String fingerprint, String str, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(fingerprint, "fingerprint");
            this.fingerprint = fingerprint;
            this.title = str;
            this.fromGhostTile = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFingerprint() {
            return this.fingerprint;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getFromGhostTile() {
            return this.fromGhostTile;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof i0)) {
                return false;
            }
            i0 i0Var = (i0) other;
            return AbstractC22676k.m65745e(this.fingerprint, i0Var.fingerprint) && AbstractC22676k.m65745e(this.title, i0Var.title) && this.fromGhostTile == i0Var.fromGhostTile;
        }

        public int hashCode() {
            int iHashCode = this.fingerprint.hashCode() * 31;
            String str = this.title;
            return Boolean.hashCode(this.fromGhostTile) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public String toString() {
            String str = this.fingerprint;
            String str2 = this.title;
            return AbstractC18489d0.m53372m(AbstractC11895b.m32001t("UncommitActivity(fingerprint=", str, ", title=", str2, ", fromGhostTile="), this.fromGhostTile, ")");
        }
    }

    /* JADX INFO: renamed from: rg0.a$j */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lrg0/a$j;", "Lrg0/a;", "", "fingerprint", "lastFailureType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class j extends AbstractC31380a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String fingerprint;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String lastFailureType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String fingerprint, String str) {
            super(null);
            AbstractC22676k.m65750j(fingerprint, "fingerprint");
            this.fingerprint = fingerprint;
            this.lastFailureType = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFingerprint() {
            return this.fingerprint;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getLastFailureType() {
            return this.lastFailureType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof j)) {
                return false;
            }
            j jVar = (j) other;
            return AbstractC22676k.m65745e(this.fingerprint, jVar.fingerprint) && AbstractC22676k.m65745e(this.lastFailureType, jVar.lastFailureType);
        }

        public int hashCode() {
            int iHashCode = this.fingerprint.hashCode() * 31;
            String str = this.lastFailureType;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return AbstractC2875y.m8300m("ExitConversationExited(fingerprint=", this.fingerprint, ", lastFailureType=", this.lastFailureType, ")");
        }
    }

    /* JADX INFO: renamed from: rg0.a$k */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lrg0/a$k;", "Lrg0/a;", "", "fingerprint", "", "timeWaitedMs", "<init>", "(Ljava/lang/String;J)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "J", "()J", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class k extends AbstractC31380a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String fingerprint;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final long timeWaitedMs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String fingerprint, long j7) {
            super(null);
            AbstractC22676k.m65750j(fingerprint, "fingerprint");
            this.fingerprint = fingerprint;
            this.timeWaitedMs = j7;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFingerprint() {
            return this.fingerprint;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getTimeWaitedMs() {
            return this.timeWaitedMs;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof k)) {
                return false;
            }
            k kVar = (k) other;
            return AbstractC22676k.m65745e(this.fingerprint, kVar.fingerprint) && this.timeWaitedMs == kVar.timeWaitedMs;
        }

        public int hashCode() {
            return Long.hashCode(this.timeWaitedMs) + (this.fingerprint.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sbM32000s = AbstractC11895b.m32000s("ExitLatencyAbandon(fingerprint=", this.fingerprint, this.timeWaitedMs, ", timeWaitedMs=");
            sbM32000s.append(")");
            return sbM32000s.toString();
        }
    }

    /* JADX INFO: renamed from: rg0.a$l */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lrg0/a$l;", "Lrg0/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class l extends AbstractC31380a {

        /* JADX INFO: renamed from: a */
        public static final l f129079a = new l();

        private l() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof l);
        }

        public int hashCode() {
            return 35182332;
        }

        public String toString() {
            return "FileSizeLimitExceeded";
        }
    }

    /* JADX INFO: renamed from: rg0.a$m */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lrg0/a$m;", "Lrg0/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class m extends AbstractC31380a {

        /* JADX INFO: renamed from: a */
        public static final m f129080a = new m();

        private m() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof m);
        }

        public int hashCode() {
            return 1371358226;
        }

        public String toString() {
            return "FileUpload";
        }
    }

    /* JADX INFO: renamed from: rg0.a$n */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lrg0/a$n;", "Lrg0/a;", "", "fingerprint", "formId", "formKey", "", "version", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class n extends AbstractC31380a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String fingerprint;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String formId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String formKey;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final Integer version;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String fingerprint, String formId, String formKey, Integer num) {
            super(null);
            AbstractC22676k.m65750j(fingerprint, "fingerprint");
            AbstractC22676k.m65750j(formId, "formId");
            AbstractC22676k.m65750j(formKey, "formKey");
            this.fingerprint = fingerprint;
            this.formId = formId;
            this.formKey = formKey;
            this.version = num;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFingerprint() {
            return this.fingerprint;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getFormId() {
            return this.formId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getFormKey() {
            return this.formKey;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Integer getVersion() {
            return this.version;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof n)) {
                return false;
            }
            n nVar = (n) other;
            return AbstractC22676k.m65745e(this.fingerprint, nVar.fingerprint) && AbstractC22676k.m65745e(this.formId, nVar.formId) && AbstractC22676k.m65745e(this.formKey, nVar.formKey) && AbstractC22676k.m65745e(this.version, nVar.version);
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.fingerprint.hashCode() * 31, 31, this.formId), 31, this.formKey);
            Integer num = this.version;
            return iM30450d + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            String str = this.fingerprint;
            String str2 = this.formId;
            String str3 = this.formKey;
            Integer num = this.version;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("FormBackgroundTapped(fingerprint=", str, ", formId=", str2, ", formKey=");
            sbM32001t.append(str3);
            sbM32001t.append(", version=");
            sbM32001t.append(num);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }
    }

    /* JADX INFO: renamed from: rg0.a$o */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0015\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lrg0/a$o;", "Lrg0/a;", "", "fingerprint", "formId", "formKey", "", "version", "Lah0/e;", "errorType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lah0/e;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "Ljava/lang/Integer;", "e", "()Ljava/lang/Integer;", "Lah0/e;", "()Lah0/e;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class o extends AbstractC31380a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String fingerprint;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String formId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String formKey;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final Integer version;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final EnumC0884e errorType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String fingerprint, String formId, String formKey, Integer num, EnumC0884e errorType) {
            super(null);
            AbstractC22676k.m65750j(fingerprint, "fingerprint");
            AbstractC22676k.m65750j(formId, "formId");
            AbstractC22676k.m65750j(formKey, "formKey");
            AbstractC22676k.m65750j(errorType, "errorType");
            this.fingerprint = fingerprint;
            this.formId = formId;
            this.formKey = formKey;
            this.version = num;
            this.errorType = errorType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC0884e getErrorType() {
            return this.errorType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getFingerprint() {
            return this.fingerprint;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getFormId() {
            return this.formId;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getFormKey() {
            return this.formKey;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Integer getVersion() {
            return this.version;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof o)) {
                return false;
            }
            o oVar = (o) other;
            return AbstractC22676k.m65745e(this.fingerprint, oVar.fingerprint) && AbstractC22676k.m65745e(this.formId, oVar.formId) && AbstractC22676k.m65745e(this.formKey, oVar.formKey) && AbstractC22676k.m65745e(this.version, oVar.version) && this.errorType == oVar.errorType;
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.fingerprint.hashCode() * 31, 31, this.formId), 31, this.formKey);
            Integer num = this.version;
            return this.errorType.hashCode() + ((iM30450d + (num == null ? 0 : num.hashCode())) * 31);
        }

        public String toString() {
            String str = this.fingerprint;
            String str2 = this.formId;
            String str3 = this.formKey;
            Integer num = this.version;
            EnumC0884e enumC0884e = this.errorType;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("FormErrorImpression(fingerprint=", str, ", formId=", str2, ", formKey=");
            AbstractC30007c.m91853w(num, str3, ", version=", ", errorType=", sbM32001t);
            sbM32001t.append(enumC0884e);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }
    }

    /* JADX INFO: renamed from: rg0.a$p */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0018\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001d\u0010\rR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0019\u0010\r¨\u0006\u001e"}, m65681d2 = {"Lrg0/a$p;", "Lrg0/a;", "", "fingerprint", "formId", "formKey", "", "version", "questionId", "optionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "Ljava/lang/Integer;", "f", "()Ljava/lang/Integer;", "e", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class p extends AbstractC31380a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String fingerprint;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String formId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String formKey;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final Integer version;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String questionId;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String optionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(String fingerprint, String formId, String formKey, Integer num, String questionId, String optionId) {
            super(null);
            AbstractC22676k.m65750j(fingerprint, "fingerprint");
            AbstractC22676k.m65750j(formId, "formId");
            AbstractC22676k.m65750j(formKey, "formKey");
            AbstractC22676k.m65750j(questionId, "questionId");
            AbstractC22676k.m65750j(optionId, "optionId");
            this.fingerprint = fingerprint;
            this.formId = formId;
            this.formKey = formKey;
            this.version = num;
            this.questionId = questionId;
            this.optionId = optionId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFingerprint() {
            return this.fingerprint;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getFormId() {
            return this.formId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getFormKey() {
            return this.formKey;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getOptionId() {
            return this.optionId;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getQuestionId() {
            return this.questionId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof p)) {
                return false;
            }
            p pVar = (p) other;
            return AbstractC22676k.m65745e(this.fingerprint, pVar.fingerprint) && AbstractC22676k.m65745e(this.formId, pVar.formId) && AbstractC22676k.m65745e(this.formKey, pVar.formKey) && AbstractC22676k.m65745e(this.version, pVar.version) && AbstractC22676k.m65745e(this.questionId, pVar.questionId) && AbstractC22676k.m65745e(this.optionId, pVar.optionId);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Integer getVersion() {
            return this.version;
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.fingerprint.hashCode() * 31, 31, this.formId), 31, this.formKey);
            Integer num = this.version;
            return this.optionId.hashCode() + AbstractC11266d.m30450d((iM30450d + (num == null ? 0 : num.hashCode())) * 31, 31, this.questionId);
        }

        public String toString() {
            String str = this.fingerprint;
            String str2 = this.formId;
            String str3 = this.formKey;
            Integer num = this.version;
            String str4 = this.questionId;
            String str5 = this.optionId;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("FormOptionSelected(fingerprint=", str, ", formId=", str2, ", formKey=");
            AbstractC30007c.m91853w(num, str3, ", version=", ", questionId=", sbM32001t);
            return AbstractC11266d.m30464r(sbM32001t, str4, ", optionId=", str5, ")");
        }
    }

    /* JADX INFO: renamed from: rg0.a$q */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0017\u0010\fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0018\u0010\f¨\u0006\u001c"}, m65681d2 = {"Lrg0/a$q;", "Lrg0/a;", "", "fingerprint", "formId", "formKey", "", "version", "selectedOptionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "Ljava/lang/Integer;", "e", "()Ljava/lang/Integer;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class q extends AbstractC31380a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String fingerprint;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String formId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String formKey;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final Integer version;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String selectedOptionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(String fingerprint, String formId, String formKey, Integer num, String str) {
            super(null);
            AbstractC22676k.m65750j(fingerprint, "fingerprint");
            AbstractC22676k.m65750j(formId, "formId");
            AbstractC22676k.m65750j(formKey, "formKey");
            this.fingerprint = fingerprint;
            this.formId = formId;
            this.formKey = formKey;
            this.version = num;
            this.selectedOptionId = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFingerprint() {
            return this.fingerprint;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getFormId() {
            return this.formId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getFormKey() {
            return this.formKey;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getSelectedOptionId() {
            return this.selectedOptionId;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Integer getVersion() {
            return this.version;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof q)) {
                return false;
            }
            q qVar = (q) other;
            return AbstractC22676k.m65745e(this.fingerprint, qVar.fingerprint) && AbstractC22676k.m65745e(this.formId, qVar.formId) && AbstractC22676k.m65745e(this.formKey, qVar.formKey) && AbstractC22676k.m65745e(this.version, qVar.version) && AbstractC22676k.m65745e(this.selectedOptionId, qVar.selectedOptionId);
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.fingerprint.hashCode() * 31, 31, this.formId), 31, this.formKey);
            Integer num = this.version;
            int iHashCode = (iM30450d + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.selectedOptionId;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            String str = this.fingerprint;
            String str2 = this.formId;
            String str3 = this.formKey;
            Integer num = this.version;
            String str4 = this.selectedOptionId;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("FormSubmitTapped(fingerprint=", str, ", formId=", str2, ", formKey=");
            AbstractC30007c.m91853w(num, str3, ", version=", ", selectedOptionId=", sbM32001t);
            return AbstractC25012a.m73376i(str4, ")", sbM32001t);
        }
    }

    /* JADX INFO: renamed from: rg0.a$r */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lrg0/a$r;", "Lrg0/a;", "", "fingerprint", "formId", "formKey", "", "version", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class r extends AbstractC31380a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String fingerprint;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String formId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String formKey;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final Integer version;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(String fingerprint, String formId, String formKey, Integer num) {
            super(null);
            AbstractC22676k.m65750j(fingerprint, "fingerprint");
            AbstractC22676k.m65750j(formId, "formId");
            AbstractC22676k.m65750j(formKey, "formKey");
            this.fingerprint = fingerprint;
            this.formId = formId;
            this.formKey = formKey;
            this.version = num;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFingerprint() {
            return this.fingerprint;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getFormId() {
            return this.formId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getFormKey() {
            return this.formKey;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Integer getVersion() {
            return this.version;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof r)) {
                return false;
            }
            r rVar = (r) other;
            return AbstractC22676k.m65745e(this.fingerprint, rVar.fingerprint) && AbstractC22676k.m65745e(this.formId, rVar.formId) && AbstractC22676k.m65745e(this.formKey, rVar.formKey) && AbstractC22676k.m65745e(this.version, rVar.version);
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.fingerprint.hashCode() * 31, 31, this.formId), 31, this.formKey);
            Integer num = this.version;
            return iM30450d + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            String str = this.fingerprint;
            String str2 = this.formId;
            String str3 = this.formKey;
            Integer num = this.version;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("FormViewImpression(fingerprint=", str, ", formId=", str2, ", formKey=");
            sbM32001t.append(str3);
            sbM32001t.append(", version=");
            sbM32001t.append(num);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }
    }

    /* JADX INFO: renamed from: rg0.a$s */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lrg0/a$s;", "Lrg0/a;", "", "fingerprint", "uploadState", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class s extends AbstractC31380a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String fingerprint;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String uploadState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(String fingerprint, String uploadState) {
            super(null);
            AbstractC22676k.m65750j(fingerprint, "fingerprint");
            AbstractC22676k.m65750j(uploadState, "uploadState");
            this.fingerprint = fingerprint;
            this.uploadState = uploadState;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFingerprint() {
            return this.fingerprint;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getUploadState() {
            return this.uploadState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof s)) {
                return false;
            }
            s sVar = (s) other;
            return AbstractC22676k.m65745e(this.fingerprint, sVar.fingerprint) && AbstractC22676k.m65745e(this.uploadState, sVar.uploadState);
        }

        public int hashCode() {
            return this.uploadState.hashCode() + (this.fingerprint.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("ImageDeleted(fingerprint=", this.fingerprint, ", uploadState=", this.uploadState, ")");
        }
    }

    /* JADX INFO: renamed from: rg0.a$t */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lrg0/a$t;", "Lrg0/a;", "", "fingerprint", "inputType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class t extends AbstractC31380a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String fingerprint;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String inputType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(String fingerprint, String inputType) {
            super(null);
            AbstractC22676k.m65750j(fingerprint, "fingerprint");
            AbstractC22676k.m65750j(inputType, "inputType");
            this.fingerprint = fingerprint;
            this.inputType = inputType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFingerprint() {
            return this.fingerprint;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getInputType() {
            return this.inputType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof t)) {
                return false;
            }
            t tVar = (t) other;
            return AbstractC22676k.m65745e(this.fingerprint, tVar.fingerprint) && AbstractC22676k.m65745e(this.inputType, tVar.inputType);
        }

        public int hashCode() {
            return this.inputType.hashCode() + (this.fingerprint.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("ImageUpload(fingerprint=", this.fingerprint, ", inputType=", this.inputType, ")");
        }
    }

    /* JADX INFO: renamed from: rg0.a$u */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lrg0/a$u;", "Lrg0/a;", "", "fingerprint", "fileType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class u extends AbstractC31380a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String fingerprint;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String fileType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(String fingerprint, String fileType) {
            super(null);
            AbstractC22676k.m65750j(fingerprint, "fingerprint");
            AbstractC22676k.m65750j(fileType, "fileType");
            this.fingerprint = fingerprint;
            this.fileType = fileType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFileType() {
            return this.fileType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getFingerprint() {
            return this.fingerprint;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof u)) {
                return false;
            }
            u uVar = (u) other;
            return AbstractC22676k.m65745e(this.fingerprint, uVar.fingerprint) && AbstractC22676k.m65745e(this.fileType, uVar.fileType);
        }

        public int hashCode() {
            return this.fileType.hashCode() + (this.fingerprint.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("ImageUploadSuccess(fingerprint=", this.fingerprint, ", fileType=", this.fileType, ")");
        }
    }

    /* JADX INFO: renamed from: rg0.a$v */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u0019\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lrg0/a$v;", "Lrg0/a;", "", "fingerprint", "", "messageCount", "messageId", "", "isVoiceInput", "isSuggestion", "<init>", "(Ljava/lang/String;ILjava/lang/String;ZZ)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "c", "d", "Z", "e", "()Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class v extends AbstractC31380a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String fingerprint;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int messageCount;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String messageId;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean isVoiceInput;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final boolean isSuggestion;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(String fingerprint, int i13, String messageId, boolean z4, boolean z13) {
            super(null);
            AbstractC22676k.m65750j(fingerprint, "fingerprint");
            AbstractC22676k.m65750j(messageId, "messageId");
            this.fingerprint = fingerprint;
            this.messageCount = i13;
            this.messageId = messageId;
            this.isVoiceInput = z4;
            this.isSuggestion = z13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFingerprint() {
            return this.fingerprint;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getMessageCount() {
            return this.messageCount;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getMessageId() {
            return this.messageId;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getIsSuggestion() {
            return this.isSuggestion;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getIsVoiceInput() {
            return this.isVoiceInput;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof v)) {
                return false;
            }
            v vVar = (v) other;
            return AbstractC22676k.m65745e(this.fingerprint, vVar.fingerprint) && this.messageCount == vVar.messageCount && AbstractC22676k.m65745e(this.messageId, vVar.messageId) && this.isVoiceInput == vVar.isVoiceInput && this.isSuggestion == vVar.isSuggestion;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isSuggestion) + AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.messageCount, this.fingerprint.hashCode() * 31, 31), 31, this.messageId), 31, this.isVoiceInput);
        }

        public String toString() {
            String str = this.fingerprint;
            int i13 = this.messageCount;
            String str2 = this.messageId;
            boolean z4 = this.isVoiceInput;
            boolean z13 = this.isSuggestion;
            StringBuilder sbM30467u = AbstractC11266d.m30467u(i13, "MemberResponse(fingerprint=", str, ", messageCount=", ", messageId=");
            AbstractC38963t7.m124390t(sbM30467u, str2, ", isVoiceInput=", z4, ", isSuggestion=");
            return AbstractC18489d0.m53372m(sbM30467u, z13, ")");
        }
    }

    /* JADX INFO: renamed from: rg0.a$w */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lrg0/a$w;", "Lrg0/a;", "", "fingerprint", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class w extends AbstractC31380a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String fingerprint;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(String fingerprint) {
            super(null);
            AbstractC22676k.m65750j(fingerprint, "fingerprint");
            this.fingerprint = fingerprint;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFingerprint() {
            return this.fingerprint;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof w) && AbstractC22676k.m65745e(this.fingerprint, ((w) other).fingerprint);
        }

        public int hashCode() {
            return this.fingerprint.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("MessageCopied(fingerprint=", this.fingerprint, ")");
        }
    }

    /* JADX INFO: renamed from: rg0.a$y */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lrg0/a$y;", "Lrg0/a;", "", "fingerprint", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class y extends AbstractC31380a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String fingerprint;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(String fingerprint) {
            super(null);
            AbstractC22676k.m65750j(fingerprint, "fingerprint");
            this.fingerprint = fingerprint;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFingerprint() {
            return this.fingerprint;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof y) && AbstractC22676k.m65745e(this.fingerprint, ((y) other).fingerprint);
        }

        public int hashCode() {
            return this.fingerprint.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("MsLinkClicked(fingerprint=", this.fingerprint, ")");
        }
    }

    /* JADX INFO: renamed from: rg0.a$z */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\t¨\u0006\u0017"}, m65681d2 = {"Lrg0/a$z;", "Lrg0/a;", "Lxk0/d;", "failureType", "", "context", "<init>", "(Lxk0/d;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lxk0/d;", "b", "()Lxk0/d;", "Ljava/lang/String;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class z extends AbstractC31380a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AbstractC38426d failureType;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(AbstractC38426d failureType, String context) {
            super(null);
            AbstractC22676k.m65750j(failureType, "failureType");
            AbstractC22676k.m65750j(context, "context");
            this.failureType = failureType;
            this.context = context;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final AbstractC38426d getFailureType() {
            return this.failureType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof z)) {
                return false;
            }
            z zVar = (z) other;
            return AbstractC22676k.m65745e(this.failureType, zVar.failureType) && AbstractC22676k.m65745e(this.context, zVar.context);
        }

        public int hashCode() {
            return this.context.hashCode() + (this.failureType.hashCode() * 31);
        }

        public String toString() {
            return "NetworkFailure(failureType=" + this.failureType + ", context=" + this.context + ")";
        }
    }

    public /* synthetic */ AbstractC31380a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC31380a() {
    }

    /* JADX INFO: renamed from: rg0.a$x */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0018\u0010\fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001a\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0015\u0010\f¨\u0006\u001c"}, m65681d2 = {"Lrg0/a$x;", "Lrg0/a;", "", "fingerprint", "role", "messageType", "failureReason", "fileType", "error", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "f", "c", "e", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class x extends AbstractC31380a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String fingerprint;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String role;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String messageType;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String failureReason;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String fileType;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(String fingerprint, String role, String messageType, String failureReason, String str, String str2) {
            super(null);
            AbstractC22676k.m65750j(fingerprint, "fingerprint");
            AbstractC22676k.m65750j(role, "role");
            AbstractC22676k.m65750j(messageType, "messageType");
            AbstractC22676k.m65750j(failureReason, "failureReason");
            this.fingerprint = fingerprint;
            this.role = role;
            this.messageType = messageType;
            this.failureReason = failureReason;
            this.fileType = str;
            this.error = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getError() {
            return this.error;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getFailureReason() {
            return this.failureReason;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getFileType() {
            return this.fileType;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getFingerprint() {
            return this.fingerprint;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getMessageType() {
            return this.messageType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof x)) {
                return false;
            }
            x xVar = (x) other;
            return AbstractC22676k.m65745e(this.fingerprint, xVar.fingerprint) && AbstractC22676k.m65745e(this.role, xVar.role) && AbstractC22676k.m65745e(this.messageType, xVar.messageType) && AbstractC22676k.m65745e(this.failureReason, xVar.failureReason) && AbstractC22676k.m65745e(this.fileType, xVar.fileType) && AbstractC22676k.m65745e(this.error, xVar.error);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getRole() {
            return this.role;
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.fingerprint.hashCode() * 31, 31, this.role), 31, this.messageType), 31, this.failureReason);
            String str = this.fileType;
            int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.error;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.fingerprint;
            String str2 = this.role;
            String str3 = this.messageType;
            String str4 = this.failureReason;
            String str5 = this.fileType;
            String str6 = this.error;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("MessageFailure(fingerprint=", str, ", role=", str2, ", messageType=");
            AbstractC11266d.m30444B(sbM32001t, str3, ", failureReason=", str4, ", fileType=");
            return AbstractC11266d.m30464r(sbM32001t, str5, ", error=", str6, ")");
        }

        public /* synthetic */ x(String str, String str2, String str3, String str4, String str5, String str6, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, (i13 & 16) != 0 ? null : str5, (i13 & 32) != 0 ? null : str6);
        }
    }
}
