package ro0;

import ep0.EnumC13400f;
import ep0.EnumC13401g;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ro0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, m65681d2 = {"Lro0/a;", "", "c", "b", "f", "e", "d", "a", "Lro0/a$a;", "Lro0/a$b;", "Lro0/a$c;", "Lro0/a$d;", "Lro0/a$e;", "Lro0/a$f;", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC31627a {

    /* JADX INFO: renamed from: ro0.a$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0012\u0010\t¨\u0006\u0017"}, m65681d2 = {"Lro0/a$a;", "Lro0/a;", "", "conversationId", "messageId", "fingerprint", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getConversationId", "b", "c", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC31627a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String conversationId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String messageId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String fingerprint;

        public a(String conversationId, String messageId, String str) {
            AbstractC22676k.m65750j(conversationId, "conversationId");
            AbstractC22676k.m65750j(messageId, "messageId");
            this.conversationId = conversationId;
            this.messageId = messageId;
            this.fingerprint = str;
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
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.conversationId, aVar.conversationId) && AbstractC22676k.m65745e(this.messageId, aVar.messageId) && AbstractC22676k.m65745e(this.fingerprint, aVar.fingerprint);
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.conversationId.hashCode() * 31, 31, this.messageId);
            String str = this.fingerprint;
            return iM30450d + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return AbstractC25012a.m73376i(this.fingerprint, ")", AbstractC11895b.m32001t("DismissPreview(conversationId=", this.conversationId, ", messageId=", this.messageId, ", fingerprint="));
        }
    }

    /* JADX INFO: renamed from: ro0.a$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lro0/a$b;", "Lro0/a;", "", "fingerprint", "screenName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC31627a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String fingerprint;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String screenName;

        public b(String fingerprint, String screenName) {
            AbstractC22676k.m65750j(fingerprint, "fingerprint");
            AbstractC22676k.m65750j(screenName, "screenName");
            this.fingerprint = fingerprint;
            this.screenName = screenName;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFingerprint() {
            return this.fingerprint;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getScreenName() {
            return this.screenName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.fingerprint, bVar.fingerprint) && AbstractC22676k.m65745e(this.screenName, bVar.screenName);
        }

        public int hashCode() {
            return this.screenName.hashCode() + (this.fingerprint.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("FetchPresentationBff(fingerprint=", this.fingerprint, ", screenName=", this.screenName, ")");
        }
    }

    /* JADX INFO: renamed from: ro0.a$c */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lro0/a$c;", "Lro0/a;", "", "screenName", "conversationId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC31627a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String screenName;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String conversationId;

        public c(String screenName, String conversationId) {
            AbstractC22676k.m65750j(screenName, "screenName");
            AbstractC22676k.m65750j(conversationId, "conversationId");
            this.screenName = screenName;
            this.conversationId = conversationId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getScreenName() {
            return this.screenName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.screenName, cVar.screenName) && AbstractC22676k.m65745e(this.conversationId, cVar.conversationId);
        }

        public int hashCode() {
            return this.conversationId.hashCode() + (this.screenName.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("FetchProactiveAnimation(screenName=", this.screenName, ", conversationId=", this.conversationId, ")");
        }
    }

    /* JADX INFO: renamed from: ro0.a$d */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, m65681d2 = {"Lro0/a$d;", "Lro0/a;", "", "conversationId", "messageId", "", "ttfmtMs", "ttpiaMs", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Ljava/lang/Long;", "()Ljava/lang/Long;", "d", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d implements InterfaceC31627a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String conversationId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String messageId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final Long ttfmtMs;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final Long ttpiaMs;

        public d(String conversationId, String messageId, Long l7, Long l12) {
            AbstractC22676k.m65750j(conversationId, "conversationId");
            AbstractC22676k.m65750j(messageId, "messageId");
            this.conversationId = conversationId;
            this.messageId = messageId;
            this.ttfmtMs = l7;
            this.ttpiaMs = l12;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getMessageId() {
            return this.messageId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Long getTtfmtMs() {
            return this.ttfmtMs;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Long getTtpiaMs() {
            return this.ttpiaMs;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.conversationId, dVar.conversationId) && AbstractC22676k.m65745e(this.messageId, dVar.messageId) && AbstractC22676k.m65745e(this.ttfmtMs, dVar.ttfmtMs) && AbstractC22676k.m65745e(this.ttpiaMs, dVar.ttpiaMs);
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.conversationId.hashCode() * 31, 31, this.messageId);
            Long l7 = this.ttfmtMs;
            int iHashCode = (iM30450d + (l7 == null ? 0 : l7.hashCode())) * 31;
            Long l12 = this.ttpiaMs;
            return iHashCode + (l12 != null ? l12.hashCode() : 0);
        }

        public String toString() {
            String str = this.conversationId;
            String str2 = this.messageId;
            Long l7 = this.ttfmtMs;
            Long l12 = this.ttpiaMs;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("MarkMessageAsSeen(conversationId=", str, ", messageId=", str2, ", ttfmtMs=");
            sbM32001t.append(l7);
            sbM32001t.append(", ttpiaMs=");
            sbM32001t.append(l12);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }
    }

    /* JADX INFO: renamed from: ro0.a$e */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lro0/a$e;", "Lro0/a;", "", "previewText", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e implements InterfaceC31627a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String previewText;

        public e(String previewText) {
            AbstractC22676k.m65750j(previewText, "previewText");
            this.previewText = previewText;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getPreviewText() {
            return this.previewText;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof e) && AbstractC22676k.m65745e(this.previewText, ((e) other).previewText);
        }

        public int hashCode() {
            return this.previewText.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("NotifyPrefetchContentLoaded(previewText=", this.previewText, ")");
        }
    }

    /* JADX INFO: renamed from: ro0.a$f */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lro0/a$f;", "Lro0/a;", "Lep0/f;", "onLoadStyle", "Lep0/g;", "loadStyle", "<init>", "(Lep0/f;Lep0/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lep0/f;", "b", "()Lep0/f;", "Lep0/g;", "()Lep0/g;", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f implements InterfaceC31627a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC13400f onLoadStyle;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC13401g loadStyle;

        public f(EnumC13400f onLoadStyle, EnumC13401g loadStyle) {
            AbstractC22676k.m65750j(onLoadStyle, "onLoadStyle");
            AbstractC22676k.m65750j(loadStyle, "loadStyle");
            this.onLoadStyle = onLoadStyle;
            this.loadStyle = loadStyle;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC13401g getLoadStyle() {
            return this.loadStyle;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnumC13400f getOnLoadStyle() {
            return this.onLoadStyle;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof f)) {
                return false;
            }
            f fVar = (f) other;
            return this.onLoadStyle == fVar.onLoadStyle && this.loadStyle == fVar.loadStyle;
        }

        public int hashCode() {
            return this.loadStyle.hashCode() + (this.onLoadStyle.hashCode() * 31);
        }

        public String toString() {
            return "SeedPresentation(onLoadStyle=" + this.onLoadStyle + ", loadStyle=" + this.loadStyle + ")";
        }
    }
}
