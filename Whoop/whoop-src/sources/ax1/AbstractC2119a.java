package ax1;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: ax1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0010\u0014\u0015\u0016\u0017\u0018\u0005\u0007\u0019\u001a\u001b\u001c\u001d\u000f\u001e\n\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\f\u0010\bR*\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0005\u0010\b\u0082\u0001\u0010\u001f !\"#$%&'()*+,-.¨\u0006/"}, m65681d2 = {"Lax1/a;", "", "<init>", "()V", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "category", "c", "eventName", "e", "value", "", "d", "Ljava/util/Map;", "()Ljava/util/Map;", "otherProperties", "action", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "g", "f", "o", "j", "i", "l", "p", "k", "n", "m", "Lax1/a$a;", "Lax1/a$b;", "Lax1/a$c;", "Lax1/a$d;", "Lax1/a$e;", "Lax1/a$f;", "Lax1/a$g;", "Lax1/a$h;", "Lax1/a$i;", "Lax1/a$j;", "Lax1/a$k;", "Lax1/a$l;", "Lax1/a$m;", "Lax1/a$n;", "Lax1/a$o;", "Lax1/a$p;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC2119a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String category;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String eventName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String value;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Map<String, Object> otherProperties;

    public /* synthetic */ AbstractC2119a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public abstract String getAction();

    /* JADX INFO: renamed from: b, reason: from getter */
    public String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: c */
    public abstract String getEventName();

    /* JADX INFO: renamed from: d */
    public Map<String, Object> mo6688d() {
        return this.otherProperties;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public String getValue() {
        return this.value;
    }

    private AbstractC2119a() {
        this.eventName = "";
    }

    /* JADX INFO: renamed from: ax1.a$i */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\b¨\u0006\u0016"}, m65681d2 = {"Lax1/a$i;", "Lax1/a;", "", "eventName", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/lang/String;", "c", "f", "a", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i extends AbstractC2119a {

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String eventName, String action) {
            super(null);
            AbstractC22676k.m65750j(eventName, "eventName");
            AbstractC22676k.m65750j(action, "action");
            this.eventName = eventName;
            this.action = action;
        }

        @Override // ax1.AbstractC2119a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAction() {
            return this.action;
        }

        @Override // ax1.AbstractC2119a
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getEventName() {
            return this.eventName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof i)) {
                return false;
            }
            i iVar = (i) other;
            return AbstractC22676k.m65745e(this.eventName, iVar.eventName) && AbstractC22676k.m65745e(this.action, iVar.action);
        }

        public int hashCode() {
            return this.action.hashCode() + (this.eventName.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("OnClickSwitchToAnnualBilling(eventName=", this.eventName, ", action=", this.action, ")");
        }

        public /* synthetic */ i(String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "Membership and Billing Screen" : str, (i13 & 2) != 0 ? "Click Switch to Annual Billing CTA" : str2);
        }
    }

    /* JADX INFO: renamed from: ax1.a$j */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\b¨\u0006\u0016"}, m65681d2 = {"Lax1/a$j;", "Lax1/a;", "", "eventName", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/lang/String;", "c", "f", "a", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class j extends AbstractC2119a {

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String eventName, String action) {
            super(null);
            AbstractC22676k.m65750j(eventName, "eventName");
            AbstractC22676k.m65750j(action, "action");
            this.eventName = eventName;
            this.action = action;
        }

        @Override // ax1.AbstractC2119a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAction() {
            return this.action;
        }

        @Override // ax1.AbstractC2119a
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getEventName() {
            return this.eventName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof j)) {
                return false;
            }
            j jVar = (j) other;
            return AbstractC22676k.m65745e(this.eventName, jVar.eventName) && AbstractC22676k.m65745e(this.action, jVar.action);
        }

        public int hashCode() {
            return this.action.hashCode() + (this.eventName.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("OnClickTileInMembershipAndBillingScreen(eventName=", this.eventName, ", action=", this.action, ")");
        }

        public /* synthetic */ j(String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "Membership and Billing Screen" : str, str2);
        }
    }

    /* JADX INFO: renamed from: ax1.a$f */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\t¨\u0006\u0019"}, m65681d2 = {"Lax1/a$f;", "Lax1/a;", "", "eventName", "action", "category", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/lang/String;", "c", "f", "a", "g", "b", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC2119a {

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String action;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String category;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String eventName, String action, String category) {
            super(null);
            AbstractC22676k.m65750j(eventName, "eventName");
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(category, "category");
            this.eventName = eventName;
            this.action = action;
            this.category = category;
        }

        @Override // ax1.AbstractC2119a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAction() {
            return this.action;
        }

        @Override // ax1.AbstractC2119a
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getCategory() {
            return this.category;
        }

        @Override // ax1.AbstractC2119a
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getEventName() {
            return this.eventName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof f)) {
                return false;
            }
            f fVar = (f) other;
            return AbstractC22676k.m65745e(this.eventName, fVar.eventName) && AbstractC22676k.m65745e(this.action, fVar.action) && AbstractC22676k.m65745e(this.category, fVar.category);
        }

        public int hashCode() {
            return this.category.hashCode() + AbstractC11266d.m30450d(this.eventName.hashCode() * 31, 31, this.action);
        }

        public String toString() {
            return AbstractC25012a.m73376i(this.category, ")", AbstractC11895b.m32001t("OnClickMembershipAndBillingButton(eventName=", this.eventName, ", action=", this.action, ", category="));
        }

        public /* synthetic */ f(String str, String str2, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "Settings - My Account" : str, (i13 & 2) != 0 ? "Open" : str2, (i13 & 4) != 0 ? "Membership and Billing" : str3);
        }
    }

    /* JADX INFO: renamed from: ax1.a$g */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\t¨\u0006\u0019"}, m65681d2 = {"Lax1/a$g;", "Lax1/a;", "", "eventName", "action", "category", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/lang/String;", "c", "f", "a", "g", "b", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g extends AbstractC2119a {

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String action;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String category;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String eventName, String action, String category) {
            super(null);
            AbstractC22676k.m65750j(eventName, "eventName");
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(category, "category");
            this.eventName = eventName;
            this.action = action;
            this.category = category;
        }

        @Override // ax1.AbstractC2119a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAction() {
            return this.action;
        }

        @Override // ax1.AbstractC2119a
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getCategory() {
            return this.category;
        }

        @Override // ax1.AbstractC2119a
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getEventName() {
            return this.eventName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof g)) {
                return false;
            }
            g gVar = (g) other;
            return AbstractC22676k.m65745e(this.eventName, gVar.eventName) && AbstractC22676k.m65745e(this.action, gVar.action) && AbstractC22676k.m65745e(this.category, gVar.category);
        }

        public int hashCode() {
            return this.category.hashCode() + AbstractC11266d.m30450d(this.eventName.hashCode() * 31, 31, this.action);
        }

        public String toString() {
            return AbstractC25012a.m73376i(this.category, ")", AbstractC11895b.m32001t("OnClickRedeemGiftExtensionButton(eventName=", this.eventName, ", action=", this.action, ", category="));
        }

        public /* synthetic */ g(String str, String str2, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "Settings - My Account" : str, (i13 & 2) != 0 ? "Open" : str2, (i13 & 4) != 0 ? "Redeem Gift Extension" : str3);
        }
    }

    /* JADX INFO: renamed from: ax1.a$h */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\t¨\u0006\u0019"}, m65681d2 = {"Lax1/a$h;", "Lax1/a;", "", "eventName", "action", "category", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/lang/String;", "c", "f", "a", "g", "b", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h extends AbstractC2119a {

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String action;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String category;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String eventName, String action, String category) {
            super(null);
            AbstractC22676k.m65750j(eventName, "eventName");
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(category, "category");
            this.eventName = eventName;
            this.action = action;
            this.category = category;
        }

        @Override // ax1.AbstractC2119a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAction() {
            return this.action;
        }

        @Override // ax1.AbstractC2119a
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getCategory() {
            return this.category;
        }

        @Override // ax1.AbstractC2119a
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getEventName() {
            return this.eventName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof h)) {
                return false;
            }
            h hVar = (h) other;
            return AbstractC22676k.m65745e(this.eventName, hVar.eventName) && AbstractC22676k.m65745e(this.action, hVar.action) && AbstractC22676k.m65745e(this.category, hVar.category);
        }

        public int hashCode() {
            return this.category.hashCode() + AbstractC11266d.m30450d(this.eventName.hashCode() * 31, 31, this.action);
        }

        public String toString() {
            return AbstractC25012a.m73376i(this.category, ")", AbstractC11895b.m32001t("OnClickReferAFriendButton(eventName=", this.eventName, ", action=", this.action, ", category="));
        }

        public /* synthetic */ h(String str, String str2, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "Settings - My Account" : str, (i13 & 2) != 0 ? "Open" : str2, (i13 & 4) != 0 ? "Refer a Friend" : str3);
        }
    }

    /* JADX INFO: renamed from: ax1.a$d */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\rR*\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, m65681d2 = {"Lax1/a$d;", "Lax1/a;", "", "eventName", "action", "tier", "category", "", "", "otherProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/lang/String;", "c", "f", "a", "g", "getTier", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "b", "i", "Ljava/util/Map;", "d", "()Ljava/util/Map;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC2119a {

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String action;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String tier;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final String category;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final Map<String, Object> otherProperties;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String eventName, String action, String tier, String category, Map<String, ? extends Object> map) {
            super(null);
            AbstractC22676k.m65750j(eventName, "eventName");
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(tier, "tier");
            AbstractC22676k.m65750j(category, "category");
            this.eventName = eventName;
            this.action = action;
            this.tier = tier;
            this.category = category;
            this.otherProperties = map;
        }

        @Override // ax1.AbstractC2119a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAction() {
            return this.action;
        }

        @Override // ax1.AbstractC2119a
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getCategory() {
            return this.category;
        }

        @Override // ax1.AbstractC2119a
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getEventName() {
            return this.eventName;
        }

        @Override // ax1.AbstractC2119a
        /* JADX INFO: renamed from: d */
        public Map<String, Object> mo6688d() {
            return this.otherProperties;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.eventName, dVar.eventName) && AbstractC22676k.m65745e(this.action, dVar.action) && AbstractC22676k.m65745e(this.tier, dVar.tier) && AbstractC22676k.m65745e(this.category, dVar.category) && AbstractC22676k.m65745e(this.otherProperties, dVar.otherProperties);
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.eventName.hashCode() * 31, 31, this.action), 31, this.tier), 31, this.category);
            Map<String, Object> map = this.otherProperties;
            return iM30450d + (map == null ? 0 : map.hashCode());
        }

        public String toString() {
            String str = this.eventName;
            String str2 = this.action;
            String str3 = this.tier;
            String str4 = this.category;
            Map<String, Object> map = this.otherProperties;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("OnClickDowngradeModal(eventName=", str, ", action=", str2, ", tier=");
            AbstractC11266d.m30444B(sbM32001t, str3, ", category=", str4, ", otherProperties=");
            return AbstractC13673n.m38565l(sbM32001t, map, ")");
        }

        public d(String str, String str2, String str3, String str4, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "In App Downgrade" : str, (i13 & 2) != 0 ? "Click Downsell" : str2, str3, (i13 & 8) != 0 ? str3 : str4, (i13 & 16) != 0 ? AbstractC31061c.m95645u("source", "Manage Membership") : map);
        }
    }

    /* JADX INFO: renamed from: ax1.a$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\f¨\u0006!"}, m65681d2 = {"Lax1/a$a;", "Lax1/a;", "", "eventName", "action", "daysLeft", "value", "tier", "category", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/lang/String;", "c", "f", "a", "g", "getDaysLeft", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "getTier", "j", "b", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC2119a {

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String action;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String daysLeft;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final String value;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final String tier;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final String category;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String eventName, String action, String daysLeft, String value, String tier, String category) {
            super(null);
            AbstractC22676k.m65750j(eventName, "eventName");
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(daysLeft, "daysLeft");
            AbstractC22676k.m65750j(value, "value");
            AbstractC22676k.m65750j(tier, "tier");
            AbstractC22676k.m65750j(category, "category");
            this.eventName = eventName;
            this.action = action;
            this.daysLeft = daysLeft;
            this.value = value;
            this.tier = tier;
            this.category = category;
        }

        @Override // ax1.AbstractC2119a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAction() {
            return this.action;
        }

        @Override // ax1.AbstractC2119a
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getCategory() {
            return this.category;
        }

        @Override // ax1.AbstractC2119a
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getEventName() {
            return this.eventName;
        }

        @Override // ax1.AbstractC2119a
        /* JADX INFO: renamed from: e, reason: from getter */
        public String getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.eventName, aVar.eventName) && AbstractC22676k.m65745e(this.action, aVar.action) && AbstractC22676k.m65745e(this.daysLeft, aVar.daysLeft) && AbstractC22676k.m65745e(this.value, aVar.value) && AbstractC22676k.m65745e(this.tier, aVar.tier) && AbstractC22676k.m65745e(this.category, aVar.category);
        }

        public int hashCode() {
            return this.category.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.eventName.hashCode() * 31, 31, this.action), 31, this.daysLeft), 31, this.value), 31, this.tier);
        }

        public String toString() {
            String str = this.eventName;
            String str2 = this.action;
            String str3 = this.daysLeft;
            String str4 = this.value;
            String str5 = this.tier;
            String str6 = this.category;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("OnClickCancelDowngrade(eventName=", str, ", action=", str2, ", daysLeft=");
            AbstractC11266d.m30444B(sbM32001t, str3, ", value=", str4, ", tier=");
            return AbstractC11266d.m30464r(sbM32001t, str5, ", category=", str6, ")");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ a(String str, String str2, String str3, String str4, String str5, String str6, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            String str7;
            String str8;
            str = (i13 & 1) != 0 ? "Membership and Billing Screen" : str;
            str2 = (i13 & 2) != 0 ? "Click Cancel Downgrade CTA" : str2;
            str4 = (i13 & 8) != 0 ? str3 : str4;
            if ((i13 & 32) != 0) {
                str7 = str5;
                str8 = str7;
            } else {
                str7 = str5;
                str8 = str6;
            }
            this(str, str2, str3, str4, str7, str8);
        }
    }

    /* JADX INFO: renamed from: ax1.a$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\f¨\u0006!"}, m65681d2 = {"Lax1/a$b;", "Lax1/a;", "", "eventName", "action", "daysLeft", "value", "tier", "category", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/lang/String;", "c", "f", "a", "g", "getDaysLeft", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "getTier", "j", "b", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC2119a {

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String action;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String daysLeft;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final String value;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final String tier;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final String category;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String eventName, String action, String daysLeft, String value, String tier, String category) {
            super(null);
            AbstractC22676k.m65750j(eventName, "eventName");
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(daysLeft, "daysLeft");
            AbstractC22676k.m65750j(value, "value");
            AbstractC22676k.m65750j(tier, "tier");
            AbstractC22676k.m65750j(category, "category");
            this.eventName = eventName;
            this.action = action;
            this.daysLeft = daysLeft;
            this.value = value;
            this.tier = tier;
            this.category = category;
        }

        @Override // ax1.AbstractC2119a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAction() {
            return this.action;
        }

        @Override // ax1.AbstractC2119a
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getCategory() {
            return this.category;
        }

        @Override // ax1.AbstractC2119a
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getEventName() {
            return this.eventName;
        }

        @Override // ax1.AbstractC2119a
        /* JADX INFO: renamed from: e, reason: from getter */
        public String getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.eventName, bVar.eventName) && AbstractC22676k.m65745e(this.action, bVar.action) && AbstractC22676k.m65745e(this.daysLeft, bVar.daysLeft) && AbstractC22676k.m65745e(this.value, bVar.value) && AbstractC22676k.m65745e(this.tier, bVar.tier) && AbstractC22676k.m65745e(this.category, bVar.category);
        }

        public int hashCode() {
            return this.category.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.eventName.hashCode() * 31, 31, this.action), 31, this.daysLeft), 31, this.value), 31, this.tier);
        }

        public String toString() {
            String str = this.eventName;
            String str2 = this.action;
            String str3 = this.daysLeft;
            String str4 = this.value;
            String str5 = this.tier;
            String str6 = this.category;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("OnClickCancelScheduledCancellation(eventName=", str, ", action=", str2, ", daysLeft=");
            AbstractC11266d.m30444B(sbM32001t, str3, ", value=", str4, ", tier=");
            return AbstractC11266d.m30464r(sbM32001t, str5, ", category=", str6, ")");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ b(String str, String str2, String str3, String str4, String str5, String str6, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            String str7;
            String str8;
            str = (i13 & 1) != 0 ? "Membership and Billing Screen" : str;
            str2 = (i13 & 2) != 0 ? "Click Cancel Scheduled Cancellation CTA" : str2;
            str4 = (i13 & 8) != 0 ? str3 : str4;
            if ((i13 & 32) != 0) {
                str7 = str5;
                str8 = str7;
            } else {
                str7 = str5;
                str8 = str6;
            }
            this(str, str2, str3, str4, str7, str8);
        }
    }

    /* JADX INFO: renamed from: ax1.a$c */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\f¨\u0006!"}, m65681d2 = {"Lax1/a$c;", "Lax1/a;", "", "eventName", "action", "monthsRemaining", "value", "tier", "category", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/lang/String;", "c", "f", "a", "g", "getMonthsRemaining", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "getTier", "j", "b", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC2119a {

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String action;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String monthsRemaining;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final String value;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final String tier;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final String category;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String eventName, String action, String monthsRemaining, String value, String tier, String category) {
            super(null);
            AbstractC22676k.m65750j(eventName, "eventName");
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(monthsRemaining, "monthsRemaining");
            AbstractC22676k.m65750j(value, "value");
            AbstractC22676k.m65750j(tier, "tier");
            AbstractC22676k.m65750j(category, "category");
            this.eventName = eventName;
            this.action = action;
            this.monthsRemaining = monthsRemaining;
            this.value = value;
            this.tier = tier;
            this.category = category;
        }

        @Override // ax1.AbstractC2119a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAction() {
            return this.action;
        }

        @Override // ax1.AbstractC2119a
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getCategory() {
            return this.category;
        }

        @Override // ax1.AbstractC2119a
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getEventName() {
            return this.eventName;
        }

        @Override // ax1.AbstractC2119a
        /* JADX INFO: renamed from: e, reason: from getter */
        public String getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.eventName, cVar.eventName) && AbstractC22676k.m65745e(this.action, cVar.action) && AbstractC22676k.m65745e(this.monthsRemaining, cVar.monthsRemaining) && AbstractC22676k.m65745e(this.value, cVar.value) && AbstractC22676k.m65745e(this.tier, cVar.tier) && AbstractC22676k.m65745e(this.category, cVar.category);
        }

        public int hashCode() {
            return this.category.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.eventName.hashCode() * 31, 31, this.action), 31, this.monthsRemaining), 31, this.value), 31, this.tier);
        }

        public String toString() {
            String str = this.eventName;
            String str2 = this.action;
            String str3 = this.monthsRemaining;
            String str4 = this.value;
            String str5 = this.tier;
            String str6 = this.category;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("OnClickDowngradeCta(eventName=", str, ", action=", str2, ", monthsRemaining=");
            AbstractC11266d.m30444B(sbM32001t, str3, ", value=", str4, ", tier=");
            return AbstractC11266d.m30464r(sbM32001t, str5, ", category=", str6, ")");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ c(String str, String str2, String str3, String str4, String str5, String str6, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            String str7;
            String str8;
            str = (i13 & 1) != 0 ? "In App Downgrade" : str;
            str2 = (i13 & 2) != 0 ? "Click Downgrade CTA" : str2;
            str4 = (i13 & 8) != 0 ? str3 : str4;
            if ((i13 & 32) != 0) {
                str7 = str5;
                str8 = str7;
            } else {
                str7 = str5;
                str8 = str6;
            }
            this(str, str2, str3, str4, str7, str8);
        }
    }

    /* JADX INFO: renamed from: ax1.a$e */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\f¨\u0006!"}, m65681d2 = {"Lax1/a$e;", "Lax1/a;", "", "eventName", "action", "monthsRemaining", "value", "tier", "category", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/lang/String;", "c", "f", "a", "g", "getMonthsRemaining", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "getTier", "j", "b", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC2119a {

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String action;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String monthsRemaining;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final String value;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final String tier;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final String category;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String eventName, String action, String monthsRemaining, String value, String tier, String category) {
            super(null);
            AbstractC22676k.m65750j(eventName, "eventName");
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(monthsRemaining, "monthsRemaining");
            AbstractC22676k.m65750j(value, "value");
            AbstractC22676k.m65750j(tier, "tier");
            AbstractC22676k.m65750j(category, "category");
            this.eventName = eventName;
            this.action = action;
            this.monthsRemaining = monthsRemaining;
            this.value = value;
            this.tier = tier;
            this.category = category;
        }

        @Override // ax1.AbstractC2119a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAction() {
            return this.action;
        }

        @Override // ax1.AbstractC2119a
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getCategory() {
            return this.category;
        }

        @Override // ax1.AbstractC2119a
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getEventName() {
            return this.eventName;
        }

        @Override // ax1.AbstractC2119a
        /* JADX INFO: renamed from: e, reason: from getter */
        public String getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.eventName, eVar.eventName) && AbstractC22676k.m65745e(this.action, eVar.action) && AbstractC22676k.m65745e(this.monthsRemaining, eVar.monthsRemaining) && AbstractC22676k.m65745e(this.value, eVar.value) && AbstractC22676k.m65745e(this.tier, eVar.tier) && AbstractC22676k.m65745e(this.category, eVar.category);
        }

        public int hashCode() {
            return this.category.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.eventName.hashCode() * 31, 31, this.action), 31, this.monthsRemaining), 31, this.value), 31, this.tier);
        }

        public String toString() {
            String str = this.eventName;
            String str2 = this.action;
            String str3 = this.monthsRemaining;
            String str4 = this.value;
            String str5 = this.tier;
            String str6 = this.category;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("OnClickKeepCurrentMembershipCta(eventName=", str, ", action=", str2, ", monthsRemaining=");
            AbstractC11266d.m30444B(sbM32001t, str3, ", value=", str4, ", tier=");
            return AbstractC11266d.m30464r(sbM32001t, str5, ", category=", str6, ")");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ e(String str, String str2, String str3, String str4, String str5, String str6, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            String str7;
            String str8;
            str = (i13 & 1) != 0 ? "In App Downgrade" : str;
            str2 = (i13 & 2) != 0 ? "Click Keep Current Membership CTA" : str2;
            str4 = (i13 & 8) != 0 ? str3 : str4;
            if ((i13 & 32) != 0) {
                str7 = str5;
                str8 = str7;
            } else {
                str7 = str5;
                str8 = str6;
            }
            this(str, str2, str3, str4, str7, str8);
        }
    }

    /* JADX INFO: renamed from: ax1.a$k */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\f¨\u0006!"}, m65681d2 = {"Lax1/a$k;", "Lax1/a;", "", "eventName", "action", "monthsProration", "value", "tier", "category", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/lang/String;", "c", "f", "a", "g", "getMonthsProration", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "getTier", "j", "b", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class k extends AbstractC2119a {

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String action;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String monthsProration;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final String value;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final String tier;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final String category;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String eventName, String action, String monthsProration, String value, String tier, String category) {
            super(null);
            AbstractC22676k.m65750j(eventName, "eventName");
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(monthsProration, "monthsProration");
            AbstractC22676k.m65750j(value, "value");
            AbstractC22676k.m65750j(tier, "tier");
            AbstractC22676k.m65750j(category, "category");
            this.eventName = eventName;
            this.action = action;
            this.monthsProration = monthsProration;
            this.value = value;
            this.tier = tier;
            this.category = category;
        }

        @Override // ax1.AbstractC2119a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAction() {
            return this.action;
        }

        @Override // ax1.AbstractC2119a
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getCategory() {
            return this.category;
        }

        @Override // ax1.AbstractC2119a
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getEventName() {
            return this.eventName;
        }

        @Override // ax1.AbstractC2119a
        /* JADX INFO: renamed from: e, reason: from getter */
        public String getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof k)) {
                return false;
            }
            k kVar = (k) other;
            return AbstractC22676k.m65745e(this.eventName, kVar.eventName) && AbstractC22676k.m65745e(this.action, kVar.action) && AbstractC22676k.m65745e(this.monthsProration, kVar.monthsProration) && AbstractC22676k.m65745e(this.value, kVar.value) && AbstractC22676k.m65745e(this.tier, kVar.tier) && AbstractC22676k.m65745e(this.category, kVar.category);
        }

        public int hashCode() {
            return this.category.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.eventName.hashCode() * 31, 31, this.action), 31, this.monthsProration), 31, this.value), 31, this.tier);
        }

        public String toString() {
            String str = this.eventName;
            String str2 = this.action;
            String str3 = this.monthsProration;
            String str4 = this.value;
            String str5 = this.tier;
            String str6 = this.category;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("OnClickUpgrade(eventName=", str, ", action=", str2, ", monthsProration=");
            AbstractC11266d.m30444B(sbM32001t, str3, ", value=", str4, ", tier=");
            return AbstractC11266d.m30464r(sbM32001t, str5, ", category=", str6, ")");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ k(String str, String str2, String str3, String str4, String str5, String str6, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            String str7;
            String str8;
            str = (i13 & 1) != 0 ? "In App Upgrade" : str;
            str2 = (i13 & 2) != 0 ? "Click Upgrade CTA" : str2;
            str4 = (i13 & 8) != 0 ? str3 : str4;
            if ((i13 & 32) != 0) {
                str7 = str5;
                str8 = str7;
            } else {
                str7 = str5;
                str8 = str6;
            }
            this(str, str2, str3, str4, str7, str8);
        }
    }

    /* JADX INFO: renamed from: ax1.a$l */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010\u000eR*\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, m65681d2 = {"Lax1/a$l;", "Lax1/a;", "", "eventName", "action", "tier", "category", "source", "", "", "otherProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/lang/String;", "c", "f", "a", "g", "getTier", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "b", "i", "getSource", "j", "Ljava/util/Map;", "d", "()Ljava/util/Map;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class l extends AbstractC2119a {

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String action;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String tier;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final String category;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final Map<String, Object> otherProperties;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String eventName, String action, String tier, String category, String source, Map<String, ? extends Object> map) {
            super(null);
            AbstractC22676k.m65750j(eventName, "eventName");
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(tier, "tier");
            AbstractC22676k.m65750j(category, "category");
            AbstractC22676k.m65750j(source, "source");
            this.eventName = eventName;
            this.action = action;
            this.tier = tier;
            this.category = category;
            this.source = source;
            this.otherProperties = map;
        }

        @Override // ax1.AbstractC2119a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAction() {
            return this.action;
        }

        @Override // ax1.AbstractC2119a
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getCategory() {
            return this.category;
        }

        @Override // ax1.AbstractC2119a
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getEventName() {
            return this.eventName;
        }

        @Override // ax1.AbstractC2119a
        /* JADX INFO: renamed from: d */
        public Map<String, Object> mo6688d() {
            return this.otherProperties;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof l)) {
                return false;
            }
            l lVar = (l) other;
            return AbstractC22676k.m65745e(this.eventName, lVar.eventName) && AbstractC22676k.m65745e(this.action, lVar.action) && AbstractC22676k.m65745e(this.tier, lVar.tier) && AbstractC22676k.m65745e(this.category, lVar.category) && AbstractC22676k.m65745e(this.source, lVar.source) && AbstractC22676k.m65745e(this.otherProperties, lVar.otherProperties);
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.eventName.hashCode() * 31, 31, this.action), 31, this.tier), 31, this.category), 31, this.source);
            Map<String, Object> map = this.otherProperties;
            return iM30450d + (map == null ? 0 : map.hashCode());
        }

        public String toString() {
            String str = this.eventName;
            String str2 = this.action;
            String str3 = this.tier;
            String str4 = this.category;
            String str5 = this.source;
            Map<String, Object> map = this.otherProperties;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("OnClickUpgradeModal(eventName=", str, ", action=", str2, ", tier=");
            AbstractC11266d.m30444B(sbM32001t, str3, ", category=", str4, ", source=");
            return AbstractC30007c.m91842l(sbM32001t, str5, ", otherProperties=", map, ")");
        }

        public l(String str, String str2, String str3, String str4, String str5, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "In App Upgrade" : str, (i13 & 2) != 0 ? "Click Upsell" : str2, str3, (i13 & 8) != 0 ? str3 : str4, str5, (i13 & 32) != 0 ? AbstractC31061c.m95645u("source", str5) : map);
        }
    }

    /* JADX INFO: renamed from: ax1.a$m */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\f¨\u0006!"}, m65681d2 = {"Lax1/a$m;", "Lax1/a;", "", "eventName", "action", "monthsRemaining", "value", "tier", "category", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/lang/String;", "c", "f", "a", "g", "getMonthsRemaining", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "getTier", "j", "b", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class m extends AbstractC2119a {

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String action;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String monthsRemaining;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final String value;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final String tier;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final String category;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String eventName, String action, String monthsRemaining, String value, String tier, String category) {
            super(null);
            AbstractC22676k.m65750j(eventName, "eventName");
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(monthsRemaining, "monthsRemaining");
            AbstractC22676k.m65750j(value, "value");
            AbstractC22676k.m65750j(tier, "tier");
            AbstractC22676k.m65750j(category, "category");
            this.eventName = eventName;
            this.action = action;
            this.monthsRemaining = monthsRemaining;
            this.value = value;
            this.tier = tier;
            this.category = category;
        }

        @Override // ax1.AbstractC2119a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAction() {
            return this.action;
        }

        @Override // ax1.AbstractC2119a
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getCategory() {
            return this.category;
        }

        @Override // ax1.AbstractC2119a
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getEventName() {
            return this.eventName;
        }

        @Override // ax1.AbstractC2119a
        /* JADX INFO: renamed from: e, reason: from getter */
        public String getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof m)) {
                return false;
            }
            m mVar = (m) other;
            return AbstractC22676k.m65745e(this.eventName, mVar.eventName) && AbstractC22676k.m65745e(this.action, mVar.action) && AbstractC22676k.m65745e(this.monthsRemaining, mVar.monthsRemaining) && AbstractC22676k.m65745e(this.value, mVar.value) && AbstractC22676k.m65745e(this.tier, mVar.tier) && AbstractC22676k.m65745e(this.category, mVar.category);
        }

        public int hashCode() {
            return this.category.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.eventName.hashCode() * 31, 31, this.action), 31, this.monthsRemaining), 31, this.value), 31, this.tier);
        }

        public String toString() {
            String str = this.eventName;
            String str2 = this.action;
            String str3 = this.monthsRemaining;
            String str4 = this.value;
            String str5 = this.tier;
            String str6 = this.category;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("OnViewDowngradeModal(eventName=", str, ", action=", str2, ", monthsRemaining=");
            AbstractC11266d.m30444B(sbM32001t, str3, ", value=", str4, ", tier=");
            return AbstractC11266d.m30464r(sbM32001t, str5, ", category=", str6, ")");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ m(String str, String str2, String str3, String str4, String str5, String str6, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            String str7;
            String str8;
            str = (i13 & 1) != 0 ? "In App Downgrade" : str;
            str2 = (i13 & 2) != 0 ? "View" : str2;
            str4 = (i13 & 8) != 0 ? str3 : str4;
            if ((i13 & 32) != 0) {
                str7 = str5;
                str8 = str7;
            } else {
                str7 = str5;
                str8 = str6;
            }
            this(str, str2, str3, str4, str7, str8);
        }
    }

    /* JADX INFO: renamed from: ax1.a$n */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010\u000eR*\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, m65681d2 = {"Lax1/a$n;", "Lax1/a;", "", "eventName", "action", "upgradeMembershipOptions", "upgradesAvailable", "downgradesAvailable", "", "", "otherProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/lang/String;", "c", "f", "a", "g", "getUpgradeMembershipOptions", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "getUpgradesAvailable", "i", "getDowngradesAvailable", "j", "Ljava/util/Map;", "d", "()Ljava/util/Map;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class n extends AbstractC2119a {

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String action;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String upgradeMembershipOptions;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final String upgradesAvailable;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final String downgradesAvailable;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final Map<String, Object> otherProperties;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String eventName, String action, String str, String str2, String str3, Map<String, ? extends Object> map) {
            super(null);
            AbstractC22676k.m65750j(eventName, "eventName");
            AbstractC22676k.m65750j(action, "action");
            this.eventName = eventName;
            this.action = action;
            this.upgradeMembershipOptions = str;
            this.upgradesAvailable = str2;
            this.downgradesAvailable = str3;
            this.otherProperties = map;
        }

        @Override // ax1.AbstractC2119a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAction() {
            return this.action;
        }

        @Override // ax1.AbstractC2119a
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getEventName() {
            return this.eventName;
        }

        @Override // ax1.AbstractC2119a
        /* JADX INFO: renamed from: d */
        public Map<String, Object> mo6688d() {
            return this.otherProperties;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof n)) {
                return false;
            }
            n nVar = (n) other;
            return AbstractC22676k.m65745e(this.eventName, nVar.eventName) && AbstractC22676k.m65745e(this.action, nVar.action) && AbstractC22676k.m65745e(this.upgradeMembershipOptions, nVar.upgradeMembershipOptions) && AbstractC22676k.m65745e(this.upgradesAvailable, nVar.upgradesAvailable) && AbstractC22676k.m65745e(this.downgradesAvailable, nVar.downgradesAvailable) && AbstractC22676k.m65745e(this.otherProperties, nVar.otherProperties);
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.eventName.hashCode() * 31, 31, this.action);
            String str = this.upgradeMembershipOptions;
            int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.upgradesAvailable;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.downgradesAvailable;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Map<String, Object> map = this.otherProperties;
            return iHashCode3 + (map != null ? map.hashCode() : 0);
        }

        public String toString() {
            String str = this.eventName;
            String str2 = this.action;
            String str3 = this.upgradeMembershipOptions;
            String str4 = this.upgradesAvailable;
            String str5 = this.downgradesAvailable;
            Map<String, Object> map = this.otherProperties;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("OnViewManageMembershipScreen(eventName=", str, ", action=", str2, ", upgradeMembershipOptions=");
            AbstractC11266d.m30444B(sbM32001t, str3, ", upgradesAvailable=", str4, ", downgradesAvailable=");
            return AbstractC30007c.m91842l(sbM32001t, str5, ", otherProperties=", map, ")");
        }

        public n(String str, String str2, String str3, String str4, String str5, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "Membership and Billing Screen" : str, (i13 & 2) != 0 ? "View Manage Membership" : str2, str3, str4, str5, (i13 & 32) != 0 ? AbstractC25247g0.m73990Y(new C23465k("upgrade_membership_options", str3), new C23465k("upgrades_available", str4), new C23465k("downgrades_available", str5)) : map);
        }
    }

    /* JADX INFO: renamed from: ax1.a$p */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\f¨\u0006!"}, m65681d2 = {"Lax1/a$p;", "Lax1/a;", "", "eventName", "action", "monthsProration", "value", "tier", "category", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/lang/String;", "c", "f", "a", "g", "getMonthsProration", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "getTier", "j", "b", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class p extends AbstractC2119a {

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String action;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String monthsProration;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final String value;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final String tier;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final String category;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(String eventName, String action, String monthsProration, String value, String tier, String category) {
            super(null);
            AbstractC22676k.m65750j(eventName, "eventName");
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(monthsProration, "monthsProration");
            AbstractC22676k.m65750j(value, "value");
            AbstractC22676k.m65750j(tier, "tier");
            AbstractC22676k.m65750j(category, "category");
            this.eventName = eventName;
            this.action = action;
            this.monthsProration = monthsProration;
            this.value = value;
            this.tier = tier;
            this.category = category;
        }

        @Override // ax1.AbstractC2119a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAction() {
            return this.action;
        }

        @Override // ax1.AbstractC2119a
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getCategory() {
            return this.category;
        }

        @Override // ax1.AbstractC2119a
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getEventName() {
            return this.eventName;
        }

        @Override // ax1.AbstractC2119a
        /* JADX INFO: renamed from: e, reason: from getter */
        public String getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof p)) {
                return false;
            }
            p pVar = (p) other;
            return AbstractC22676k.m65745e(this.eventName, pVar.eventName) && AbstractC22676k.m65745e(this.action, pVar.action) && AbstractC22676k.m65745e(this.monthsProration, pVar.monthsProration) && AbstractC22676k.m65745e(this.value, pVar.value) && AbstractC22676k.m65745e(this.tier, pVar.tier) && AbstractC22676k.m65745e(this.category, pVar.category);
        }

        public int hashCode() {
            return this.category.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.eventName.hashCode() * 31, 31, this.action), 31, this.monthsProration), 31, this.value), 31, this.tier);
        }

        public String toString() {
            String str = this.eventName;
            String str2 = this.action;
            String str3 = this.monthsProration;
            String str4 = this.value;
            String str5 = this.tier;
            String str6 = this.category;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("OnViewUpgradeScreen(eventName=", str, ", action=", str2, ", monthsProration=");
            AbstractC11266d.m30444B(sbM32001t, str3, ", value=", str4, ", tier=");
            return AbstractC11266d.m30464r(sbM32001t, str5, ", category=", str6, ")");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ p(String str, String str2, String str3, String str4, String str5, String str6, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            String str7;
            String str8;
            str = (i13 & 1) != 0 ? "In App Upgrade" : str;
            str2 = (i13 & 2) != 0 ? "View" : str2;
            str4 = (i13 & 8) != 0 ? str3 : str4;
            if ((i13 & 32) != 0) {
                str7 = str5;
                str8 = str7;
            } else {
                str7 = str5;
                str8 = str6;
            }
            this(str, str2, str3, str4, str7, str8);
        }
    }

    /* JADX INFO: renamed from: ax1.a$o */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0018\b\u0002\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0012R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b\"\u0010\u0010R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0018\u001a\u0004\b$\u0010\u0010R*\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, m65681d2 = {"Lax1/a$o;", "Lax1/a;", "", "eventName", "action", "upgradeMembershipOptions", "", "monthsRemaining", "upgradesAvailable", "cardUpsell", "", "", "otherProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/lang/String;", "c", "f", "a", "g", "getUpgradeMembershipOptions", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "I", "getMonthsRemaining", "i", "getUpgradesAvailable", "j", "getCardUpsell", "k", "Ljava/util/Map;", "d", "()Ljava/util/Map;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class o extends AbstractC2119a {

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String action;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String upgradeMembershipOptions;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final int monthsRemaining;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final String upgradesAvailable;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final String cardUpsell;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final Map<String, Object> otherProperties;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String eventName, String action, String str, int i13, String str2, String str3, Map<String, ? extends Object> map) {
            super(null);
            AbstractC22676k.m65750j(eventName, "eventName");
            AbstractC22676k.m65750j(action, "action");
            this.eventName = eventName;
            this.action = action;
            this.upgradeMembershipOptions = str;
            this.monthsRemaining = i13;
            this.upgradesAvailable = str2;
            this.cardUpsell = str3;
            this.otherProperties = map;
        }

        @Override // ax1.AbstractC2119a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAction() {
            return this.action;
        }

        @Override // ax1.AbstractC2119a
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getEventName() {
            return this.eventName;
        }

        @Override // ax1.AbstractC2119a
        /* JADX INFO: renamed from: d */
        public Map<String, Object> mo6688d() {
            return this.otherProperties;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof o)) {
                return false;
            }
            o oVar = (o) other;
            return AbstractC22676k.m65745e(this.eventName, oVar.eventName) && AbstractC22676k.m65745e(this.action, oVar.action) && AbstractC22676k.m65745e(this.upgradeMembershipOptions, oVar.upgradeMembershipOptions) && this.monthsRemaining == oVar.monthsRemaining && AbstractC22676k.m65745e(this.upgradesAvailable, oVar.upgradesAvailable) && AbstractC22676k.m65745e(this.cardUpsell, oVar.cardUpsell) && AbstractC22676k.m65745e(this.otherProperties, oVar.otherProperties);
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.eventName.hashCode() * 31, 31, this.action);
            String str = this.upgradeMembershipOptions;
            int iM30448b = AbstractC11266d.m30448b(this.monthsRemaining, (iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31);
            String str2 = this.upgradesAvailable;
            int iHashCode = (iM30448b + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.cardUpsell;
            int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
            Map<String, Object> map = this.otherProperties;
            return iHashCode2 + (map != null ? map.hashCode() : 0);
        }

        public String toString() {
            String str = this.eventName;
            String str2 = this.action;
            String str3 = this.upgradeMembershipOptions;
            int i13 = this.monthsRemaining;
            String str4 = this.upgradesAvailable;
            String str5 = this.cardUpsell;
            Map<String, Object> map = this.otherProperties;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("OnViewMembershipAndBillingScreen(eventName=", str, ", action=", str2, ", upgradeMembershipOptions=");
            AbstractC11266d.m30470x(i13, str3, ", monthsRemaining=", ", upgradesAvailable=", sbM32001t);
            AbstractC11266d.m30444B(sbM32001t, str4, ", cardUpsell=", str5, ", otherProperties=");
            return AbstractC13673n.m38565l(sbM32001t, map, ")");
        }

        public o(String str, String str2, String str3, int i13, String str4, String str5, Map map, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this((i14 & 1) != 0 ? "Membership and Billing Screen" : str, (i14 & 2) != 0 ? "View" : str2, str3, i13, str4, str5, (i14 & 64) != 0 ? AbstractC25247g0.m73990Y(new C23465k("upgrade_membership_options", str3), new C23465k("months_remaining", Integer.valueOf(i13)), new C23465k("upgrades_available", str4), new C23465k("card_upsell", str5)) : map);
        }
    }
}
