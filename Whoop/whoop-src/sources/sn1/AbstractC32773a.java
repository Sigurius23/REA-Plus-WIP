package sn1;

import androidx.core.app.NotificationCompat;
import h01.C16551r;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p741vn1.EnumC36197a;
import p741vn1.EnumC36205i;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: sn1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m65681d2 = {"Lsn1/a;", "", "<init>", "()V", "c", "f", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "d", "b", "a", "e", "Lsn1/a$a;", "Lsn1/a$b;", "Lsn1/a$c;", "Lsn1/a$d;", "Lsn1/a$e;", "Lsn1/a$f;", "Lsn1/a$g;", "Lsn1/a$h;", "home-notifications-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32773a {

    /* JADX INFO: renamed from: sn1.a$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lsn1/a$a;", "Lsn1/a;", "Lh01/r;", NotificationCompat.CATEGORY_EVENT, "<init>", "(Lh01/r;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lh01/r;", "()Lh01/r;", "home-notifications-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC32773a {

        /* JADX INFO: renamed from: b */
        public static final int f136311b = C16551r.f63718c;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C16551r event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C16551r event) {
            super(null);
            AbstractC22676k.m65750j(event, "event");
            this.event = event;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C16551r getEvent() {
            return this.event;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.event, ((a) other).event);
        }

        public int hashCode() {
            return this.event.hashCode();
        }

        public String toString() {
            return "CardExpandedEvent(event=" + this.event + ")";
        }
    }

    /* JADX INFO: renamed from: sn1.a$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lsn1/a$b;", "Lsn1/a;", "Lvn1/i;", "notificationCardDismissAnimation", "<init>", "(Lvn1/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lvn1/i;", "()Lvn1/i;", "home-notifications-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC32773a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC36205i notificationCardDismissAnimation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(EnumC36205i notificationCardDismissAnimation) {
            super(null);
            AbstractC22676k.m65750j(notificationCardDismissAnimation, "notificationCardDismissAnimation");
            this.notificationCardDismissAnimation = notificationCardDismissAnimation;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC36205i getNotificationCardDismissAnimation() {
            return this.notificationCardDismissAnimation;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && this.notificationCardDismissAnimation == ((b) other).notificationCardDismissAnimation;
        }

        public int hashCode() {
            return this.notificationCardDismissAnimation.hashCode();
        }

        public String toString() {
            return "ChangeNotificationCardDismissAnimation(notificationCardDismissAnimation=" + this.notificationCardDismissAnimation + ")";
        }
    }

    /* JADX INFO: renamed from: sn1.a$c */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lsn1/a$c;", "Lsn1/a;", "", "path", "userCategory", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "home-notifications-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC32773a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String path;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String userCategory;

        public c(String str, String str2) {
            super(null);
            this.path = str;
            this.userCategory = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getUserCategory() {
            return this.userCategory;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.path, cVar.path) && AbstractC22676k.m65745e(this.userCategory, cVar.userCategory);
        }

        public int hashCode() {
            String str = this.path;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.userCategory;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return AbstractC2875y.m8300m("Load(path=", this.path, ", userCategory=", this.userCategory, ")");
        }
    }

    /* JADX INFO: renamed from: sn1.a$d */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lsn1/a$d;", "Lsn1/a;", "", "id", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "home-notifications-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC32773a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String id4) {
            super(null);
            AbstractC22676k.m65750j(id4, "id");
            this.id = id4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && AbstractC22676k.m65745e(this.id, ((d) other).id);
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("OnCtaClickedAnalyticsEvent(id=", this.id, ")");
        }
    }

    /* JADX INFO: renamed from: sn1.a$e */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\f¨\u0006\u001d"}, m65681d2 = {"Lsn1/a$e;", "Lsn1/a;", "", "cardVariant", "", "label", "totalCards", "notificationType", "templateName", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "b", "Ljava/lang/String;", "c", "I", "e", "d", "home-notifications-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC32773a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Integer cardVariant;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String label;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final int totalCards;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String notificationType;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String templateName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Integer num, String label, int i13, String notificationType, String str) {
            super(null);
            AbstractC22676k.m65750j(label, "label");
            AbstractC22676k.m65750j(notificationType, "notificationType");
            this.cardVariant = num;
            this.label = label;
            this.totalCards = i13;
            this.notificationType = notificationType;
            this.templateName = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Integer getCardVariant() {
            return this.cardVariant;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getNotificationType() {
            return this.notificationType;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getTemplateName() {
            return this.templateName;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getTotalCards() {
            return this.totalCards;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.cardVariant, eVar.cardVariant) && AbstractC22676k.m65745e(this.label, eVar.label) && this.totalCards == eVar.totalCards && AbstractC22676k.m65745e(this.notificationType, eVar.notificationType) && AbstractC22676k.m65745e(this.templateName, eVar.templateName);
        }

        public int hashCode() {
            Integer num = this.cardVariant;
            int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.totalCards, AbstractC11266d.m30450d((num == null ? 0 : num.hashCode()) * 31, 31, this.label), 31), 31, this.notificationType);
            String str = this.templateName;
            return iM30450d + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            Integer num = this.cardVariant;
            String str = this.label;
            int i13 = this.totalCards;
            String str2 = this.notificationType;
            String str3 = this.templateName;
            StringBuilder sbM95643s = AbstractC31061c.m95643s("OnDailyReportClickedAnalyticsEvent(cardVariant=", ", label=", num, str, ", totalCards=");
            AbstractC11895b.m31979B(i13, ", notificationType=", str2, ", templateName=", sbM95643s);
            return AbstractC25012a.m73376i(str3, ")", sbM95643s);
        }
    }

    /* JADX INFO: renamed from: sn1.a$f */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0018\u0010\n¨\u0006\u0019"}, m65681d2 = {"Lsn1/a$f;", "Lsn1/a;", "", "id", "Lvn1/a;", "cardDismissAction", "path", "<init>", "(Ljava/lang/String;Lvn1/a;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lvn1/a;", "()Lvn1/a;", "c", "home-notifications-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC32773a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC36197a cardDismissAction;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String path;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String id4, EnumC36197a cardDismissAction, String str) {
            super(null);
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(cardDismissAction, "cardDismissAction");
            this.id = id4;
            this.cardDismissAction = cardDismissAction;
            this.path = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC36197a getCardDismissAction() {
            return this.cardDismissAction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof f)) {
                return false;
            }
            f fVar = (f) other;
            return AbstractC22676k.m65745e(this.id, fVar.id) && this.cardDismissAction == fVar.cardDismissAction && AbstractC22676k.m65745e(this.path, fVar.path);
        }

        public int hashCode() {
            int iHashCode = (this.cardDismissAction.hashCode() + (this.id.hashCode() * 31)) * 31;
            String str = this.path;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.id;
            EnumC36197a enumC36197a = this.cardDismissAction;
            String str2 = this.path;
            StringBuilder sb4 = new StringBuilder("ReadCard(id=");
            sb4.append(str);
            sb4.append(", cardDismissAction=");
            sb4.append(enumC36197a);
            sb4.append(", path=");
            return AbstractC25012a.m73376i(str2, ")", sb4);
        }

        public /* synthetic */ f(String str, EnumC36197a enumC36197a, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, enumC36197a, (i13 & 4) != 0 ? null : str2);
        }
    }

    /* JADX INFO: renamed from: sn1.a$g */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lsn1/a$g;", "Lsn1/a;", "<init>", "()V", "home-notifications-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32773a {

        /* JADX INFO: renamed from: a */
        public static final g f136325a = new g();

        private g() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: sn1.a$h */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lsn1/a$h;", "Lsn1/a;", "", "path", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "home-notifications-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h extends AbstractC32773a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String path;

        public h(String str) {
            super(null);
            this.path = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof h) && AbstractC22676k.m65745e(this.path, ((h) other).path);
        }

        public int hashCode() {
            String str = this.path;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("TriggerReplay(path=", this.path, ")");
        }

        public /* synthetic */ h(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : str);
        }
    }

    public /* synthetic */ AbstractC32773a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC32773a() {
    }
}
