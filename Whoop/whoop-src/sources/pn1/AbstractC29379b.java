package pn1;

import com.whoop.design.models.NotificationCardModel;
import com.whoop.homenotificationscenter.domain.models.HomeNotificationsCenterResponse;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import java.util.Set;
import m83.C25235a0;
import m83.C25271y;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p741vn1.EnumC36205i;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: pn1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m65681d2 = {"Lpn1/b;", "", "<init>", "()V", "b", "a", "d", "c", "Lpn1/b$a;", "Lpn1/b$b;", "Lpn1/b$c;", "Lpn1/b$d;", "home-notifications-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29379b {

    /* JADX INFO: renamed from: pn1.b$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, m65681d2 = {"Lpn1/b$a;", "Lpn1/b;", "", "error", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getError", "home-notifications-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC29379b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String error) {
            super(null);
            AbstractC22676k.m65750j(error, "error");
            this.error = error;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.error, ((a) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("Error(error=", this.error, ")");
        }
    }

    /* JADX INFO: renamed from: pn1.b$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lpn1/b$b;", "Lpn1/b;", "<init>", "()V", "home-notifications-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC29379b {

        /* JADX INFO: renamed from: a */
        public static final b f119177a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: pn1.b$d */
    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJF\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b$\u0010\u0010¨\u0006%"}, m65681d2 = {"Lpn1/b$d;", "Lpn1/b;", "Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;", "response", "", "Lcom/whoop/design/models/NotificationCardModel;", "cards", "", "", "dismissedCardIds", "userCategory", "<init>", "(Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;Ljava/util/List;Ljava/util/Set;Ljava/lang/String;)V", "a", "(Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;Ljava/util/List;Ljava/util/Set;Ljava/lang/String;)Lpn1/b$d;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;", "getResponse", "()Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "Ljava/util/Set;", "d", "()Ljava/util/Set;", "Ljava/lang/String;", "e", "home-notifications-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC29379b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final HomeNotificationsCenterResponse response;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<NotificationCardModel> cards;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final Set<String> dismissedCardIds;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String userCategory;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(HomeNotificationsCenterResponse response, List<? extends NotificationCardModel> cards, Set<String> dismissedCardIds, String str) {
            super(null);
            AbstractC22676k.m65750j(response, "response");
            AbstractC22676k.m65750j(cards, "cards");
            AbstractC22676k.m65750j(dismissedCardIds, "dismissedCardIds");
            this.response = response;
            this.cards = cards;
            this.dismissedCardIds = dismissedCardIds;
            this.userCategory = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ d m89557b(d dVar, HomeNotificationsCenterResponse homeNotificationsCenterResponse, List list, Set set, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                homeNotificationsCenterResponse = dVar.response;
            }
            if ((i13 & 2) != 0) {
                list = dVar.cards;
            }
            if ((i13 & 4) != 0) {
                set = dVar.dismissedCardIds;
            }
            if ((i13 & 8) != 0) {
                str = dVar.userCategory;
            }
            return dVar.m89558a(homeNotificationsCenterResponse, list, set, str);
        }

        /* JADX INFO: renamed from: a */
        public final d m89558a(HomeNotificationsCenterResponse response, List<? extends NotificationCardModel> cards, Set<String> dismissedCardIds, String userCategory) {
            AbstractC22676k.m65750j(response, "response");
            AbstractC22676k.m65750j(cards, "cards");
            AbstractC22676k.m65750j(dismissedCardIds, "dismissedCardIds");
            return new d(response, cards, dismissedCardIds, userCategory);
        }

        /* JADX INFO: renamed from: c */
        public final List<NotificationCardModel> m89559c() {
            return this.cards;
        }

        /* JADX INFO: renamed from: d */
        public final Set<String> m89560d() {
            return this.dismissedCardIds;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getUserCategory() {
            return this.userCategory;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.response, dVar.response) && AbstractC22676k.m65745e(this.cards, dVar.cards) && AbstractC22676k.m65745e(this.dismissedCardIds, dVar.dismissedCardIds) && AbstractC22676k.m65745e(this.userCategory, dVar.userCategory);
        }

        public int hashCode() {
            int iM73368a = AbstractC25012a.m73368a(this.dismissedCardIds, AbstractC11895b.m31983b(this.response.hashCode() * 31, 31, this.cards), 31);
            String str = this.userCategory;
            return iM73368a + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Updating(response=" + this.response + ", cards=" + this.cards + ", dismissedCardIds=" + this.dismissedCardIds + ", userCategory=" + this.userCategory + ")";
        }
    }

    public /* synthetic */ AbstractC29379b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC29379b() {
    }

    /* JADX INFO: renamed from: pn1.b$c */
    @Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011Jd\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b*\u0010,\u001a\u0004\b'\u0010-R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b%\u0010.\u001a\u0004\b/\u0010\u0015¨\u00060"}, m65681d2 = {"Lpn1/b$c;", "Lpn1/b;", "Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;", "response", "", "Lcom/whoop/design/models/NotificationCardModel;", "cards", "", "playShimmer", "highlightCounter", "Lvn1/i;", "notificationCardDismissAnimation", "", "", "dismissedCardIds", "userCategory", "<init>", "(Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;Ljava/util/List;ZZLvn1/i;Ljava/util/Set;Ljava/lang/String;)V", "a", "(Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;Ljava/util/List;ZZLvn1/i;Ljava/util/Set;Ljava/lang/String;)Lpn1/b$c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;", "getResponse", "()Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "Z", "g", "()Z", "d", "e", "Lvn1/i;", "f", "()Lvn1/i;", "Ljava/util/Set;", "()Ljava/util/Set;", "Ljava/lang/String;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "home-notifications-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC29379b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final HomeNotificationsCenterResponse response;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<NotificationCardModel> cards;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean playShimmer;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean highlightCounter;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final EnumC36205i notificationCardDismissAnimation;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final Set<String> dismissedCardIds;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String userCategory;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(HomeNotificationsCenterResponse response, List<? extends NotificationCardModel> cards, boolean z4, boolean z13, EnumC36205i notificationCardDismissAnimation, Set<String> dismissedCardIds, String str) {
            super(null);
            AbstractC22676k.m65750j(response, "response");
            AbstractC22676k.m65750j(cards, "cards");
            AbstractC22676k.m65750j(notificationCardDismissAnimation, "notificationCardDismissAnimation");
            AbstractC22676k.m65750j(dismissedCardIds, "dismissedCardIds");
            this.response = response;
            this.cards = cards;
            this.playShimmer = z4;
            this.highlightCounter = z13;
            this.notificationCardDismissAnimation = notificationCardDismissAnimation;
            this.dismissedCardIds = dismissedCardIds;
            this.userCategory = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ c m89549b(c cVar, HomeNotificationsCenterResponse homeNotificationsCenterResponse, List list, boolean z4, boolean z13, EnumC36205i enumC36205i, Set set, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                homeNotificationsCenterResponse = cVar.response;
            }
            if ((i13 & 2) != 0) {
                list = cVar.cards;
            }
            if ((i13 & 4) != 0) {
                z4 = cVar.playShimmer;
            }
            if ((i13 & 8) != 0) {
                z13 = cVar.highlightCounter;
            }
            if ((i13 & 16) != 0) {
                enumC36205i = cVar.notificationCardDismissAnimation;
            }
            if ((i13 & 32) != 0) {
                set = cVar.dismissedCardIds;
            }
            if ((i13 & 64) != 0) {
                str = cVar.userCategory;
            }
            Set set2 = set;
            String str2 = str;
            EnumC36205i enumC36205i2 = enumC36205i;
            boolean z14 = z4;
            return cVar.m89550a(homeNotificationsCenterResponse, list, z14, z13, enumC36205i2, set2, str2);
        }

        /* JADX INFO: renamed from: a */
        public final c m89550a(HomeNotificationsCenterResponse response, List<? extends NotificationCardModel> cards, boolean playShimmer, boolean highlightCounter, EnumC36205i notificationCardDismissAnimation, Set<String> dismissedCardIds, String userCategory) {
            AbstractC22676k.m65750j(response, "response");
            AbstractC22676k.m65750j(cards, "cards");
            AbstractC22676k.m65750j(notificationCardDismissAnimation, "notificationCardDismissAnimation");
            AbstractC22676k.m65750j(dismissedCardIds, "dismissedCardIds");
            return new c(response, cards, playShimmer, highlightCounter, notificationCardDismissAnimation, dismissedCardIds, userCategory);
        }

        /* JADX INFO: renamed from: c */
        public final List<NotificationCardModel> m89551c() {
            return this.cards;
        }

        /* JADX INFO: renamed from: d */
        public final Set<String> m89552d() {
            return this.dismissedCardIds;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getHighlightCounter() {
            return this.highlightCounter;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.response, cVar.response) && AbstractC22676k.m65745e(this.cards, cVar.cards) && this.playShimmer == cVar.playShimmer && this.highlightCounter == cVar.highlightCounter && this.notificationCardDismissAnimation == cVar.notificationCardDismissAnimation && AbstractC22676k.m65745e(this.dismissedCardIds, cVar.dismissedCardIds) && AbstractC22676k.m65745e(this.userCategory, cVar.userCategory);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final EnumC36205i getNotificationCardDismissAnimation() {
            return this.notificationCardDismissAnimation;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getPlayShimmer() {
            return this.playShimmer;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getUserCategory() {
            return this.userCategory;
        }

        public int hashCode() {
            int iM73368a = AbstractC25012a.m73368a(this.dismissedCardIds, (this.notificationCardDismissAnimation.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11895b.m31983b(this.response.hashCode() * 31, 31, this.cards), 31, this.playShimmer), 31, this.highlightCounter)) * 31, 31);
            String str = this.userCategory;
            return iM73368a + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            HomeNotificationsCenterResponse homeNotificationsCenterResponse = this.response;
            List<NotificationCardModel> list = this.cards;
            boolean z4 = this.playShimmer;
            boolean z13 = this.highlightCounter;
            EnumC36205i enumC36205i = this.notificationCardDismissAnimation;
            Set<String> set = this.dismissedCardIds;
            String str = this.userCategory;
            StringBuilder sb4 = new StringBuilder("Result(response=");
            sb4.append(homeNotificationsCenterResponse);
            sb4.append(", cards=");
            sb4.append(list);
            sb4.append(", playShimmer=");
            AbstractC38963t7.m124392v(sb4, z4, ", highlightCounter=", z13, ", notificationCardDismissAnimation=");
            sb4.append(enumC36205i);
            sb4.append(", dismissedCardIds=");
            sb4.append(set);
            sb4.append(", userCategory=");
            return AbstractC25012a.m73376i(str, ")", sb4);
        }

        public /* synthetic */ c(HomeNotificationsCenterResponse homeNotificationsCenterResponse, List list, boolean z4, boolean z13, EnumC36205i enumC36205i, Set set, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(homeNotificationsCenterResponse, (i13 & 2) != 0 ? C25271y.f99162w : list, (i13 & 4) != 0 ? false : z4, (i13 & 8) == 0 ? z13 : false, (i13 & 16) != 0 ? EnumC36205i.FADE_IN_PLUS_SCALE_IN_WITHOUT_EXIT : enumC36205i, (i13 & 32) != 0 ? C25235a0.f99113w : set, (i13 & 64) != 0 ? null : str);
        }
    }
}
