package nn1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.NotificationCardModel;
import com.whoop.design.models.cards.TextAndImageCardModel;
import com.whoop.design.models.cards.TextOnlyCardModel;
import com.whoop.design.models.cards.TextWithDesignItemCardModel;
import com.whoop.design.models.cards.TextWithIllustrationCardModel;
import com.whoop.design.models.items.UnknownNotificationCard;
import fi0.InterfaceC14515a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import tn1.C33959a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: nn1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0002$\u001fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JC\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJa\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0018\b\u0002\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J?\u0010\u001c\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ?\u0010\u001e\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001e\u0010\u001dJ?\u0010\u001f\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001f\u0010\u001dJG\u0010\"\u001a\u00020\u00142\b\u0010 \u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\"\u0010#J\u0019\u0010$\u001a\u00020\u00142\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b&\u0010'JI\u0010(\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010 \u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b(\u0010)J3\u0010*\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u0014¢\u0006\u0004\b,\u0010-J\u0019\u0010.\u001a\u00020\u00142\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b.\u0010%J%\u00104\u001a\u0004\u0018\u0001032\u0006\u0010/\u001a\u00020\u00062\f\u00102\u001a\b\u0012\u0004\u0012\u00020100¢\u0006\u0004\b4\u00105J%\u00107\u001a\u0004\u0018\u0001032\u0006\u0010/\u001a\u00020\u00062\f\u00102\u001a\b\u0012\u0004\u0012\u00020600¢\u0006\u0004\b7\u00105J\u001d\u00108\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b8\u00109R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010:¨\u0006;"}, m65681d2 = {"Lnn1/a;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "", "userCategory", "", "additionalProperties", "e", "(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;", "p", "(Ljava/lang/String;)Ljava/util/Map;", "eventName", "category", "action", "label", "value", "otherProperties", "Ll83/a0;", "k", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "appNotificationType", "cardTitle", "", "totalCards", "templateName", "o", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "c", "b", "cardVariant", "notificationType", "d", "(Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "(Ljava/lang/String;)V", "m", "(I)V", "q", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "f", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "n", "()V", "j", "id", "", "Lcom/whoop/design/models/DesignSystemModel;", "notificationCards", "Lnn1/a$b;", "g", "(Ljava/lang/String;Ljava/util/List;)Lnn1/a$b;", "Lcom/whoop/design/models/NotificationCardModel;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "(Ljava/lang/String;Ljava/lang/String;)V", "Lfi0/a;", "home-notifications-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26866a {

    /* JADX INFO: renamed from: c */
    public static final int f107210c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: nn1.a$b */
    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0013\u0010\fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u0018\u0010\f¨\u0006\u001c"}, m65681d2 = {"Lnn1/a$b;", "", "", "cardTitle", "", "totalCards", "appNotificationType", "variant", "templateName", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "d", "c", "Ljava/lang/Integer;", "e", "()Ljava/lang/Integer;", "home-notifications-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String cardTitle;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int totalCards;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String appNotificationType;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final Integer variant;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String templateName;

        public b(String cardTitle, int i13, String str, Integer num, String str2) {
            AbstractC22676k.m65750j(cardTitle, "cardTitle");
            this.cardTitle = cardTitle;
            this.totalCards = i13;
            this.appNotificationType = str;
            this.variant = num;
            this.templateName = str2;
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
        public final String getTemplateName() {
            return this.templateName;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getTotalCards() {
            return this.totalCards;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Integer getVariant() {
            return this.variant;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.cardTitle, bVar.cardTitle) && this.totalCards == bVar.totalCards && AbstractC22676k.m65745e(this.appNotificationType, bVar.appNotificationType) && AbstractC22676k.m65745e(this.variant, bVar.variant) && AbstractC22676k.m65745e(this.templateName, bVar.templateName);
        }

        public int hashCode() {
            int iM30448b = AbstractC11266d.m30448b(this.totalCards, this.cardTitle.hashCode() * 31, 31);
            String str = this.appNotificationType;
            int iHashCode = (iM30448b + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.variant;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str2 = this.templateName;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.cardTitle;
            int i13 = this.totalCards;
            String str2 = this.appNotificationType;
            Integer num = this.variant;
            String str3 = this.templateName;
            StringBuilder sbM30467u = AbstractC11266d.m30467u(i13, "NotificationCardAnalyticsInfo(cardTitle=", str, ", totalCards=", ", appNotificationType=");
            AbstractC30007c.m91853w(num, str2, ", variant=", ", templateName=", sbM30467u);
            return AbstractC25012a.m73376i(str3, ")", sbM30467u);
        }

        public /* synthetic */ b(String str, int i13, String str2, Integer num, String str3, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i13, str2, (i14 & 8) != 0 ? null : num, (i14 & 16) != 0 ? null : str3);
        }
    }

    public C26866a(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: e */
    private final Map<String, Object> m80196e(String userCategory, Map<String, ? extends Object> additionalProperties) {
        List listM74077r0 = AbstractC25260n.m74077r0(new Map[]{m80199p(userCategory), additionalProperties});
        ArrayList arrayList = new ArrayList();
        Iterator it = listM74077r0.iterator();
        while (it.hasNext()) {
            AbstractC25265s.m74141p0(arrayList, AbstractC25247g0.m73999h0((Map) it.next()));
        }
        Map<String, Object> mapM74000i0 = AbstractC25247g0.m74000i0(arrayList);
        if (mapM74000i0.isEmpty()) {
            return null;
        }
        return mapM74000i0;
    }

    /* JADX INFO: renamed from: k */
    private final void m80197k(String eventName, String category, String action, String label, String value, Map<String, ? extends Object> otherProperties) {
        this.analytics.mo41422d(category, action, label, eventName, value, otherProperties);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m80198l(C26866a c26866a, String str, String str2, String str3, String str4, String str5, Map map, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str2 = null;
        }
        if ((i13 & 4) != 0) {
            str3 = null;
        }
        if ((i13 & 8) != 0) {
            str4 = null;
        }
        if ((i13 & 16) != 0) {
            str5 = null;
        }
        if ((i13 & 32) != 0) {
            map = null;
        }
        c26866a.m80197k(str, str2, str3, str4, str5, map);
    }

    /* JADX INFO: renamed from: p */
    private final Map<String, String> m80199p(String userCategory) {
        if (userCategory != null) {
            return AbstractC31061c.m95645u("user_category", userCategory);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m80200a(String userCategory) {
        m80198l(this, "Overview Notifications", null, "Dismiss All", null, null, m80199p(userCategory), 26, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m80201b(String appNotificationType, String cardTitle, int totalCards, String userCategory, String templateName) {
        AbstractC22676k.m65750j(cardTitle, "cardTitle");
        m80197k("Overview Notifications", templateName == null ? appNotificationType : templateName, "CTA", cardTitle, String.valueOf(totalCards), m80199p(userCategory));
    }

    /* JADX INFO: renamed from: c */
    public final void m80202c(String appNotificationType, String cardTitle, int totalCards, String userCategory, String templateName) {
        AbstractC22676k.m65750j(cardTitle, "cardTitle");
        m80197k("Overview Notifications", templateName == null ? appNotificationType : templateName, "Dismiss Tap", cardTitle, String.valueOf(totalCards), m80199p(userCategory));
    }

    /* JADX INFO: renamed from: d */
    public final void m80203d(Integer cardVariant, String label, int totalCards, String notificationType, String userCategory, String templateName) {
        Map<String, ? extends Object> mapM73990Y;
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(notificationType, "notificationType");
        String str = templateName == null ? notificationType : templateName;
        String strValueOf = String.valueOf(totalCards);
        if (cardVariant != null) {
            C23465k c23465k = new C23465k("variant", Integer.valueOf(cardVariant.intValue()));
            String lowerCase = "Label".toLowerCase(Locale.ROOT);
            AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
            mapM73990Y = AbstractC25247g0.m73990Y(c23465k, new C23465k(lowerCase, AbstractC37056f.m118958J(label)));
        } else {
            mapM73990Y = null;
        }
        m80198l(this, "Overview Notifications", str, "CTA", null, strValueOf, m80196e(userCategory, mapM73990Y), 8, null);
    }

    /* JADX INFO: renamed from: f */
    public final void m80204f(String appNotificationType, String cardTitle, int totalCards, String userCategory) {
        AbstractC22676k.m65750j(cardTitle, "cardTitle");
        m80197k("Overview Notifications", appNotificationType, "Dismiss Failure", cardTitle, String.valueOf(totalCards), m80199p(userCategory));
    }

    /* JADX INFO: renamed from: g */
    public final b m80205g(String id4, List<? extends DesignSystemModel> notificationCards) {
        Object next;
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(notificationCards, "notificationCards");
        ArrayList arrayList = new ArrayList();
        for (Object obj : notificationCards) {
            if (obj instanceof NotificationCardModel) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((NotificationCardModel) next).getId(), id4));
        NotificationCardModel notificationCardModel = (NotificationCardModel) next;
        if (notificationCardModel != null) {
            if (notificationCardModel instanceof TextOnlyCardModel) {
                TextOnlyCardModel textOnlyCardModel = (TextOnlyCardModel) notificationCardModel;
                return new b(textOnlyCardModel.getTitle(), notificationCards.size(), textOnlyCardModel.getAppNotificationType(), null, textOnlyCardModel.getTemplateName(), 8, null);
            }
            if (notificationCardModel instanceof TextWithIllustrationCardModel) {
                TextWithIllustrationCardModel textWithIllustrationCardModel = (TextWithIllustrationCardModel) notificationCardModel;
                return new b(textWithIllustrationCardModel.getTitle(), notificationCards.size(), textWithIllustrationCardModel.getAppNotificationType(), null, textWithIllustrationCardModel.getTemplateName(), 8, null);
            }
            if (notificationCardModel instanceof TextWithDesignItemCardModel) {
                TextWithDesignItemCardModel textWithDesignItemCardModel = (TextWithDesignItemCardModel) notificationCardModel;
                return new b(textWithDesignItemCardModel.getTitle(), notificationCards.size(), textWithDesignItemCardModel.getAppNotificationType(), null, textWithDesignItemCardModel.getTemplateName(), 8, null);
            }
            if (notificationCardModel instanceof TextAndImageCardModel) {
                TextAndImageCardModel textAndImageCardModel = (TextAndImageCardModel) notificationCardModel;
                return new b(textAndImageCardModel.getTitle(), notificationCards.size(), textAndImageCardModel.getAppNotificationType(), null, textAndImageCardModel.getTemplateName(), 8, null);
            }
            if (notificationCardModel instanceof UnknownNotificationCard) {
                UnknownNotificationCard unknownNotificationCard = (UnknownNotificationCard) notificationCardModel;
                return new b("", notificationCards.size(), unknownNotificationCard.getAppNotificationType(), null, unknownNotificationCard.getTemplateName(), 8, null);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final b m80206h(String id4, List<? extends NotificationCardModel> notificationCards) {
        Object next;
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(notificationCards, "notificationCards");
        Iterator<T> it = notificationCards.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((NotificationCardModel) next).getId(), id4));
        NotificationCardModel notificationCardModel = (NotificationCardModel) next;
        if (notificationCardModel != null) {
            if (notificationCardModel instanceof TextOnlyCardModel) {
                TextOnlyCardModel textOnlyCardModel = (TextOnlyCardModel) notificationCardModel;
                return new b(textOnlyCardModel.getTitle(), notificationCards.size(), textOnlyCardModel.getAppNotificationType(), null, textOnlyCardModel.getTemplateName(), 8, null);
            }
            if (notificationCardModel instanceof TextWithIllustrationCardModel) {
                TextWithIllustrationCardModel textWithIllustrationCardModel = (TextWithIllustrationCardModel) notificationCardModel;
                return new b(textWithIllustrationCardModel.getTitle(), notificationCards.size(), textWithIllustrationCardModel.getAppNotificationType(), new C33959a().m107408a(textWithIllustrationCardModel.getImageUrl()), textWithIllustrationCardModel.getTemplateName());
            }
            if (notificationCardModel instanceof TextWithDesignItemCardModel) {
                TextWithDesignItemCardModel textWithDesignItemCardModel = (TextWithDesignItemCardModel) notificationCardModel;
                return new b(textWithDesignItemCardModel.getTitle(), notificationCards.size(), textWithDesignItemCardModel.getAppNotificationType(), new C33959a().m107408a(textWithDesignItemCardModel.getImageUrl()), textWithDesignItemCardModel.getTemplateName());
            }
            if (notificationCardModel instanceof TextAndImageCardModel) {
                TextAndImageCardModel textAndImageCardModel = (TextAndImageCardModel) notificationCardModel;
                return new b(textAndImageCardModel.getTitle(), notificationCards.size(), textAndImageCardModel.getAppNotificationType(), null, textAndImageCardModel.getTemplateName(), 8, null);
            }
            if (notificationCardModel instanceof UnknownNotificationCard) {
                UnknownNotificationCard unknownNotificationCard = (UnknownNotificationCard) notificationCardModel;
                return new b("", notificationCards.size(), unknownNotificationCard.getAppNotificationType(), null, unknownNotificationCard.getTemplateName(), 8, null);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final void m80207i(String category, String label) {
        AbstractC22676k.m65750j(category, "category");
        AbstractC22676k.m65750j(label, "label");
        m80198l(this, "Overview Notifications", category, "Expand Card", label, null, null, 48, null);
    }

    /* JADX INFO: renamed from: j */
    public final void m80208j(String userCategory) {
        m80198l(this, "Overview Notifications", null, "Load Failure", null, null, m80199p(userCategory), 26, null);
    }

    /* JADX INFO: renamed from: m */
    public final void m80209m(int totalCards) {
        m80198l(this, "Overview Notifications", null, "Replay", null, String.valueOf(totalCards), null, 42, null);
    }

    /* JADX INFO: renamed from: n */
    public final void m80210n() {
        m80198l(this, "Overview Notifications", null, "Replay Failure", null, null, null, 58, null);
    }

    /* JADX INFO: renamed from: o */
    public final void m80211o(String appNotificationType, String cardTitle, int totalCards, String userCategory, String templateName) {
        AbstractC22676k.m65750j(cardTitle, "cardTitle");
        m80197k("Overview Notifications", templateName == null ? appNotificationType : templateName, "Dismiss Swipe", cardTitle, String.valueOf(totalCards), m80199p(userCategory));
    }

    /* JADX INFO: renamed from: q */
    public final void m80212q(String appNotificationType, String cardTitle, int totalCards, Integer cardVariant, String userCategory, String templateName) {
        AbstractC22676k.m65750j(cardTitle, "cardTitle");
        String str = templateName == null ? appNotificationType : templateName;
        Map<String, ? extends Object> mapM73990Y = null;
        String str2 = cardVariant == null ? cardTitle : null;
        String strValueOf = String.valueOf(totalCards);
        if (cardVariant != null) {
            C23465k c23465k = new C23465k("variant", Integer.valueOf(cardVariant.intValue()));
            String lowerCase = "Label".toLowerCase(Locale.ROOT);
            AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
            mapM73990Y = AbstractC25247g0.m73990Y(c23465k, new C23465k(lowerCase, AbstractC37056f.m118958J(cardTitle)));
        }
        m80197k("Overview Notifications", str, "View", str2, strValueOf, m80196e(userCategory, mapM73990Y));
    }
}
