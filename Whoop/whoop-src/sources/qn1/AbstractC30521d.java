package qn1;

import com.whoop.homenotificationscenter.domain.models.HomeNotificationsCenterResponse;
import ih0.AbstractC18489d0;
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

/* JADX INFO: renamed from: qn1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, m65681d2 = {"Lqn1/d;", "", "<init>", "()V", "k", "l", "e", "i", "c", "j", "f", "d", "g", "a", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "b", "Lqn1/d$a;", "Lqn1/d$b;", "Lqn1/d$c;", "Lqn1/d$d;", "Lqn1/d$e;", "Lqn1/d$f;", "Lqn1/d$g;", "Lqn1/d$h;", "Lqn1/d$i;", "Lqn1/d$j;", "Lqn1/d$k;", "Lqn1/d$l;", "home-notifications-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30521d {

    /* JADX INFO: renamed from: qn1.d$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lqn1/d$a;", "Lqn1/d;", "Lvn1/i;", "notificationCardDismissAnimation", "<init>", "(Lvn1/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lvn1/i;", "()Lvn1/i;", "home-notifications-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC30521d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC36205i notificationCardDismissAnimation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(EnumC36205i notificationCardDismissAnimation) {
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
            return (other instanceof a) && this.notificationCardDismissAnimation == ((a) other).notificationCardDismissAnimation;
        }

        public int hashCode() {
            return this.notificationCardDismissAnimation.hashCode();
        }

        public String toString() {
            return "ChangeNotificationCardDismissAnimation(notificationCardDismissAnimation=" + this.notificationCardDismissAnimation + ")";
        }
    }

    /* JADX INFO: renamed from: qn1.d$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\f¨\u0006\u0017"}, m65681d2 = {"Lqn1/d$b;", "Lqn1/d;", "", "appNotificationType", "cardTitle", "", "totalCards", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "I", "home-notifications-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC30521d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String appNotificationType;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String cardTitle;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final int totalCards;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String cardTitle, int i13) {
            super(null);
            AbstractC22676k.m65750j(cardTitle, "cardTitle");
            this.appNotificationType = str;
            this.cardTitle = cardTitle;
            this.totalCards = i13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAppNotificationType() {
            return this.appNotificationType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCardTitle() {
            return this.cardTitle;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getTotalCards() {
            return this.totalCards;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.appNotificationType, bVar.appNotificationType) && AbstractC22676k.m65745e(this.cardTitle, bVar.cardTitle) && this.totalCards == bVar.totalCards;
        }

        public int hashCode() {
            String str = this.appNotificationType;
            return Integer.hashCode(this.totalCards) + AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.cardTitle);
        }

        public String toString() {
            String str = this.appNotificationType;
            String str2 = this.cardTitle;
            return AbstractC18489d0.m53371l(AbstractC11895b.m32001t("DismissFailure(appNotificationType=", str, ", cardTitle=", str2, ", totalCards="), this.totalCards, ")");
        }
    }

    /* JADX INFO: renamed from: qn1.d$c */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lqn1/d$c;", "Lqn1/d;", "", "userCategory", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "home-notifications-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC30521d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String userCategory;

        public c(String str) {
            super(null);
            this.userCategory = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getUserCategory() {
            return this.userCategory;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && AbstractC22676k.m65745e(this.userCategory, ((c) other).userCategory);
        }

        public int hashCode() {
            String str = this.userCategory;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("Error(userCategory=", this.userCategory, ")");
        }

        public /* synthetic */ c(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : str);
        }
    }

    /* JADX INFO: renamed from: qn1.d$d */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lqn1/d$d;", "Lqn1/d;", "", "userCategory", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "home-notifications-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC30521d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String userCategory;

        public d(String str) {
            super(null);
            this.userCategory = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getUserCategory() {
            return this.userCategory;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && AbstractC22676k.m65745e(this.userCategory, ((d) other).userCategory);
        }

        public int hashCode() {
            String str = this.userCategory;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("ForceEmptyState(userCategory=", this.userCategory, ")");
        }

        public /* synthetic */ d(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : str);
        }
    }

    /* JADX INFO: renamed from: qn1.d$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lqn1/d$e;", "Lqn1/d;", "<init>", "()V", "home-notifications-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC30521d {

        /* JADX INFO: renamed from: a */
        public static final e f125501a = new e();

        private e() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: qn1.d$f */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lqn1/d$f;", "Lqn1/d;", "<init>", "()V", "home-notifications-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC30521d {

        /* JADX INFO: renamed from: a */
        public static final f f125502a = new f();

        private f() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: qn1.d$g */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lqn1/d$g;", "Lqn1/d;", "", "id", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "home-notifications-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g extends AbstractC30521d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String id4) {
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
            return (other instanceof g) && AbstractC22676k.m65745e(this.id, ((g) other).id);
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("OnCtaClickedAnalyticsEvent(id=", this.id, ")");
        }
    }

    /* JADX INFO: renamed from: qn1.d$h */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\f¨\u0006\u001d"}, m65681d2 = {"Lqn1/d$h;", "Lqn1/d;", "", "cardVariant", "", "label", "totalCards", "notificationType", "templateName", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "b", "Ljava/lang/String;", "c", "I", "e", "d", "home-notifications-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h extends AbstractC30521d {

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
        public h(Integer num, String label, int i13, String notificationType, String str) {
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
            if (!(other instanceof h)) {
                return false;
            }
            h hVar = (h) other;
            return AbstractC22676k.m65745e(this.cardVariant, hVar.cardVariant) && AbstractC22676k.m65745e(this.label, hVar.label) && this.totalCards == hVar.totalCards && AbstractC22676k.m65745e(this.notificationType, hVar.notificationType) && AbstractC22676k.m65745e(this.templateName, hVar.templateName);
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

    /* JADX INFO: renamed from: qn1.d$i */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lqn1/d$i;", "Lqn1/d;", "", "id", "Lvn1/a;", "dismissAction", "<init>", "(Ljava/lang/String;Lvn1/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lvn1/a;", "()Lvn1/a;", "home-notifications-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i extends AbstractC30521d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC36197a dismissAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String id4, EnumC36197a dismissAction) {
            super(null);
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(dismissAction, "dismissAction");
            this.id = id4;
            this.dismissAction = dismissAction;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC36197a getDismissAction() {
            return this.dismissAction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof i)) {
                return false;
            }
            i iVar = (i) other;
            return AbstractC22676k.m65745e(this.id, iVar.id) && this.dismissAction == iVar.dismissAction;
        }

        public int hashCode() {
            return this.dismissAction.hashCode() + (this.id.hashCode() * 31);
        }

        public String toString() {
            return "ReadCard(id=" + this.id + ", dismissAction=" + this.dismissAction + ")";
        }
    }

    /* JADX INFO: renamed from: qn1.d$j */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lqn1/d$j;", "Lqn1/d;", "<init>", "()V", "home-notifications-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j extends AbstractC30521d {

        /* JADX INFO: renamed from: a */
        public static final j f125511a = new j();

        private j() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: qn1.d$l */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\t¨\u0006\u0017"}, m65681d2 = {"Lqn1/d$l;", "Lqn1/d;", "Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;", "cacheResponse", "", "userCategory", "<init>", "(Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;", "()Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;", "b", "Ljava/lang/String;", "home-notifications-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class l extends AbstractC30521d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final HomeNotificationsCenterResponse cacheResponse;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String userCategory;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(HomeNotificationsCenterResponse cacheResponse, String str) {
            super(null);
            AbstractC22676k.m65750j(cacheResponse, "cacheResponse");
            this.cacheResponse = cacheResponse;
            this.userCategory = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final HomeNotificationsCenterResponse getCacheResponse() {
            return this.cacheResponse;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getUserCategory() {
            return this.userCategory;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof l)) {
                return false;
            }
            l lVar = (l) other;
            return AbstractC22676k.m65745e(this.cacheResponse, lVar.cacheResponse) && AbstractC22676k.m65745e(this.userCategory, lVar.userCategory);
        }

        public int hashCode() {
            int iHashCode = this.cacheResponse.hashCode() * 31;
            String str = this.userCategory;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Updating(cacheResponse=" + this.cacheResponse + ", userCategory=" + this.userCategory + ")";
        }
    }

    public /* synthetic */ AbstractC30521d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC30521d() {
    }

    /* JADX INFO: renamed from: qn1.d$k */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001b"}, m65681d2 = {"Lqn1/d$k;", "Lqn1/d;", "Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;", "cacheResponse", "", "playShimmer", "", "userCategory", "<init>", "(Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;", "()Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;", "b", "Z", "()Z", "c", "Ljava/lang/String;", "home-notifications-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class k extends AbstractC30521d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final HomeNotificationsCenterResponse cacheResponse;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean playShimmer;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String userCategory;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(HomeNotificationsCenterResponse cacheResponse, boolean z4, String str) {
            super(null);
            AbstractC22676k.m65750j(cacheResponse, "cacheResponse");
            this.cacheResponse = cacheResponse;
            this.playShimmer = z4;
            this.userCategory = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final HomeNotificationsCenterResponse getCacheResponse() {
            return this.cacheResponse;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getPlayShimmer() {
            return this.playShimmer;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getUserCategory() {
            return this.userCategory;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof k)) {
                return false;
            }
            k kVar = (k) other;
            return AbstractC22676k.m65745e(this.cacheResponse, kVar.cacheResponse) && this.playShimmer == kVar.playShimmer && AbstractC22676k.m65745e(this.userCategory, kVar.userCategory);
        }

        public int hashCode() {
            int iM8289b = AbstractC2875y.m8289b(this.cacheResponse.hashCode() * 31, 31, this.playShimmer);
            String str = this.userCategory;
            return iM8289b + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            HomeNotificationsCenterResponse homeNotificationsCenterResponse = this.cacheResponse;
            boolean z4 = this.playShimmer;
            String str = this.userCategory;
            StringBuilder sb4 = new StringBuilder("Success(cacheResponse=");
            sb4.append(homeNotificationsCenterResponse);
            sb4.append(", playShimmer=");
            sb4.append(z4);
            sb4.append(", userCategory=");
            return AbstractC25012a.m73376i(str, ")", sb4);
        }

        public /* synthetic */ k(HomeNotificationsCenterResponse homeNotificationsCenterResponse, boolean z4, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(homeNotificationsCenterResponse, (i13 & 2) != 0 ? false : z4, (i13 & 4) != 0 ? null : str);
        }
    }
}
